package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun interface FnCallback {
    public operator fun invoke(resourcedescription: Long, enumerationcontext: Long, enumerationlevel: Long): UInt
}

public fun VerifierEnumerateResource(process: Foundation.HANDLE, flags: VERIFIER_ENUM_RESOURCE_FLAGS, resourcetype: UInt, resourcecallback: AVRF_RESOURCE_ENUMERATE_CALLBACK, enumerationcontext: Long): UInt {
    return Win32DynamicFfi.invoke("verifier.dll", "VerifierEnumerateResource", longArrayOf(Win32DynamicFfi.objectSlot(process), flags.toLong(), resourcetype.toLong(), Win32DynamicFfi.objectSlot(resourcecallback), enumerationcontext)).toUInt()
}
