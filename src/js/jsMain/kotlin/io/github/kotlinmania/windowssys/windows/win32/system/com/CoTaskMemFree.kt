// port-lint: source Windows/Win32/System/Com/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.WindowsSysNative

public fun CoTaskMemFree(pv: Long) {
    WindowsSysNative.CoTaskMemFree(pv.toDouble())
}
