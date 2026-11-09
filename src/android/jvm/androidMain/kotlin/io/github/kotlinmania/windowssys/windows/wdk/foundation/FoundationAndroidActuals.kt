@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWdkFoundationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_foundation_NtClose(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_foundation_NtQueryObject(handle: Long, objectinformationclass: Int, objectinformation: Long, objectinformationlength: Int, returnlength: Long): Int
}

public actual fun NtClose(handle: HANDLE): NTSTATUS =
    WindowsWdkFoundationJniBridge.windowssys_windows_wdk_foundation_NtClose(handle)

public actual fun NtQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkFoundationJniBridge.windowssys_windows_wdk_foundation_NtQueryObject(handle, objectinformationclass, objectinformation, objectinformationlength.toInt(), returnlength)
