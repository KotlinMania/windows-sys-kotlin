@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkFoundationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_foundation_ntClose(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_foundation_ntQueryObject(handle: Long, objectinformationclass: Int, objectinformation: Long, objectinformationlength: Int, returnlength: Long): Int
}

public actual fun ntClose(handle: Handle): Ntstatus =
    WindowsWdkFoundationJniBridge.windowssys_windows_wdk_foundation_ntClose((handle?.value ?: 0L))

public actual fun ntQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: COpaquePointer?, objectinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkFoundationJniBridge.windowssys_windows_wdk_foundation_ntQueryObject((handle?.value ?: 0L), objectinformationclass, (objectinformation?.value ?: 0L), objectinformationlength.toInt(), (returnlength?.value ?: 0L))
