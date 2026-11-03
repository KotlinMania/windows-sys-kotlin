// port-lint: source Windows/Win32/System/Com/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun CoTaskMemFree(pv: Long) {
    Kernel32Jni.CoTaskMemFree(pv)
}
