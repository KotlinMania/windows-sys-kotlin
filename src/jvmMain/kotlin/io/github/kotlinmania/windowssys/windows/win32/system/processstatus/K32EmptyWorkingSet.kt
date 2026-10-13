// port-lint: source Windows/Win32/System/ProcessStatus/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.processstatus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun K32EmptyWorkingSet(hprocess: HANDLE): BOOL =
    Kernel32Jni.K32EmptyWorkingSet(hprocess)
