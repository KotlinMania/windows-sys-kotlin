@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NtClose(handle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.foundation.cinterop.windowssys_windows_wdk_foundation_NtClose(handle.toCPointer<ByteVar>())

public actual fun NtQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.foundation.cinterop.windowssys_windows_wdk_foundation_NtQueryObject(handle.toCPointer<ByteVar>(), objectinformationclass, objectinformation.toCPointer<ByteVar>(), objectinformationlength, returnlength.toCPointer<ByteVar>())
