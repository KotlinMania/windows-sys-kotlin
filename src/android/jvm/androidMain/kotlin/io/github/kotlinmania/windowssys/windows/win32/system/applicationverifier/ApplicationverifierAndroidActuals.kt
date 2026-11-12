@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemApplicationverifierJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationverifierVerifierEnumerateResource(process: Long, flags: Int, resourcetype: Int, resourcecallback: Long, enumerationcontext: Long): Int
}

public actual fun verifierEnumerateResource(process: Handle, flags: VerifierEnumResourceFlags, resourcetype: UInt, resourcecallback: AvrfResourceEnumerateCallback, enumerationcontext: MutPtr): UInt =
    WindowsWin32SystemApplicationverifierJniBridge.windowssysWindowsWin32SystemApplicationverifierVerifierEnumerateResource(process.rawAddress, flags.toInt(), resourcetype.toInt(), 0L, enumerationcontext.rawAddress).toUInt()
