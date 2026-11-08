package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public fun NtQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySystemInformation", longArrayOf(systeminformationclass.toLong(), systeminformation, systeminformationlength.toLong(), returnlength)).toInt()
}

public fun NtQuerySystemTime(systemtime: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySystemTime", longArrayOf(systemtime)).toInt()
}

public fun NtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryTimerResolution", longArrayOf(maximumtime, minimumtime, currenttime)).toInt()
}

public fun ZwQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySystemInformation", longArrayOf(systeminformationclass.toLong(), systeminformation, systeminformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQuerySystemTime(systemtime: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySystemTime", longArrayOf(systemtime)).toInt()
}

public fun ZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryTimerResolution", longArrayOf(maximumtime, minimumtime, currenttime)).toInt()
}
