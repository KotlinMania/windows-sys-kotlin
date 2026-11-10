@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemApplicationverifierJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationverifier_verifierEnumerateResource(process: Long, flags: Int, resourcetype: Int, resourcecallback: Long, enumerationcontext: Long): Int
}

public actual fun verifierEnumerateResource(process: Handle, flags: VerifierEnumResourceFlags, resourcetype: UInt, resourcecallback: AvrfResourceEnumerateCallback, enumerationcontext: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationverifierJniBridge.windowssys_windows_win32_system_applicationverifier_verifierEnumerateResource((process?.value ?: 0L), flags.toInt(), resourcetype.toInt(), 0L, (enumerationcontext?.value ?: 0L)).toUInt()
