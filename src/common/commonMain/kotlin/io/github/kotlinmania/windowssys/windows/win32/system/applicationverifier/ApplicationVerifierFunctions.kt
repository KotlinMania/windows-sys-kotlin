package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun interface FnCallback {
    public operator fun invoke(resourcedescription: Long, enumerationcontext: Long, enumerationlevel: Long): UInt
}

public fun VerifierEnumerateResource(process: HANDLE, flags: VERIFIER_ENUM_RESOURCE_FLAGS, resourcetype: UInt, resourcecallback: AVRF_RESOURCE_ENUMERATE_CALLBACK, enumerationcontext: Long): UInt {
    return Win32DynamicFfi.invoke("verifier.dll", "VerifierEnumerateResource", longArrayOf(process, flags.toLong(), resourcetype.toLong(), Win32DynamicFfi.objectSlot(resourcecallback), enumerationcontext)).toUInt()
}
