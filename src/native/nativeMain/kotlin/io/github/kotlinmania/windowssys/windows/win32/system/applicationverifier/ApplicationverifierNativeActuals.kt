@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun verifierEnumerateResource(process: Handle, flags: VerifierEnumResourceFlags, resourcetype: UInt, resourcecallback: AvrfResourceEnumerateCallback, enumerationcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier.cinterop.windowssys_windows_win32_system_applicationverifier_verifierEnumerateResource(process?.value?.toCPointer<ByteVar>(), flags, resourcetype, 0L.toCPointer<ByteVar>(), enumerationcontext?.value?.toCPointer<ByteVar>())
