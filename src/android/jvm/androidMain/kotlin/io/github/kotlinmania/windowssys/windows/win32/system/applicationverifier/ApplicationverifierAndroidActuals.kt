@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemApplicationverifierJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationverifier_VerifierEnumerateResource(process: Long, flags: Int, resourcetype: Int, resourcecallback: Long, enumerationcontext: Long): Int
}

public actual fun VerifierEnumerateResource(process: HANDLE, flags: VERIFIER_ENUM_RESOURCE_FLAGS, resourcetype: UInt, resourcecallback: AVRF_RESOURCE_ENUMERATE_CALLBACK, enumerationcontext: Long): UInt =
    WindowsWin32SystemApplicationverifierJniBridge.windowssys_windows_win32_system_applicationverifier_VerifierEnumerateResource(process, flags.toInt(), resourcetype.toInt(), resourcecallback.toLong(), enumerationcontext).toUInt()
