package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public fun NtClose(handle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtClose", longArrayOf(handle)).toInt()
}

public fun NtQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryObject", longArrayOf(handle, objectinformationclass.toLong(), objectinformation, objectinformationlength.toLong(), returnlength)).toInt()
}
