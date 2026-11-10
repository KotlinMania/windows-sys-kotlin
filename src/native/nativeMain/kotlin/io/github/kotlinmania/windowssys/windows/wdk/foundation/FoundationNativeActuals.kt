@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntClose(handle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.foundation.cinterop.windowssys_windows_wdk_foundation_ntClose(handle?.value?.toCPointer<ByteVar>())

public actual fun ntQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: COpaquePointer?, objectinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.foundation.cinterop.windowssys_windows_wdk_foundation_ntQueryObject(handle?.value?.toCPointer<ByteVar>(), objectinformationclass, objectinformation?.value?.toCPointer<ByteVar>(), objectinformationlength, returnlength?.value?.toCPointer<ByteVar>())
