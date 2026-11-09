@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun VerifierEnumerateResource(process: HANDLE, flags: VERIFIER_ENUM_RESOURCE_FLAGS, resourcetype: UInt, resourcecallback: AVRF_RESOURCE_ENUMERATE_CALLBACK, enumerationcontext: Long): UInt =
    0u
