@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier.cinterop.windowssysWindowsWin32SystemApplicationverifierVerifierEnumerateResource
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun verifierEnumerateResource(process: Handle, flags: VerifierEnumResourceFlags, resourcetype: UInt, resourcecallback: AvrfResourceEnumerateCallback, enumerationcontext: MutPtr): UInt =
    windowssysWindowsWin32SystemApplicationverifierVerifierEnumerateResource(process.rawAddress.toCPointer<ByteVar>(), flags, resourcetype, 0L.toCPointer<ByteVar>(), enumerationcontext.rawAddress.toCPointer<ByteVar>())
