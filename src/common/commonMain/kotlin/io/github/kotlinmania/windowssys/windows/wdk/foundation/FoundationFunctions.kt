package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun NtClose(handle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtClose", longArrayOf(Win32DynamicFfi.objectSlot(handle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryObject(handle: Win32.Foundation.HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryObject", longArrayOf(Win32DynamicFfi.objectSlot(handle), objectinformationclass.toLong(), objectinformation, objectinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}
