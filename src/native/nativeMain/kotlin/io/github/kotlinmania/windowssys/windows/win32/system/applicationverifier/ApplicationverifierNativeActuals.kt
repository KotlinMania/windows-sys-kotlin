@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun VerifierEnumerateResource(process: HANDLE, flags: VERIFIER_ENUM_RESOURCE_FLAGS, resourcetype: UInt, resourcecallback: AVRF_RESOURCE_ENUMERATE_CALLBACK, enumerationcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier.cinterop.windowssys_windows_win32_system_applicationverifier_VerifierEnumerateResource(process.toCPointer<ByteVar>(), flags, resourcetype, resourcecallback.toLong().toCPointer<ByteVar>(), enumerationcontext.toCPointer<ByteVar>())
