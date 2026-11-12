@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkFoundationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkFoundationNtClose(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkFoundationNtQueryObject(handle: Long, objectinformationclass: Int, objectinformation: Long, objectinformationlength: Int, returnlength: Long): Int
}

public actual fun ntClose(handle: Handle): Ntstatus =
    WindowsWdkFoundationJniBridge.windowssysWindowsWdkFoundationNtClose(handle.rawAddress)

public actual fun ntQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr<CVoid>, objectinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkFoundationJniBridge.windowssysWindowsWdkFoundationNtQueryObject(handle.rawAddress, objectinformationclass, objectinformation.rawAddress, objectinformationlength.toInt(), returnlength.rawAddress)
