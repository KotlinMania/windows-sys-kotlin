@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.cinterop.windowssysWindowsWdkFoundationNtClose
import io.github.kotlinmania.windowssys.windows.wdk.foundation.cinterop.windowssysWindowsWdkFoundationNtQueryObject
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntClose(handle: Handle): Ntstatus =
    windowssysWindowsWdkFoundationNtClose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr, objectinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    windowssysWindowsWdkFoundationNtQueryObject(handle.rawAddress.toCPointer<ByteVar>(), objectinformationclass, objectinformation.rawAddress.toCPointer<ByteVar>(), objectinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())
