package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun NtQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySystemInformation", longArrayOf(systeminformationclass.toLong(), systeminformation, systeminformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQuerySystemTime(systemtime: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQuerySystemTime", longArrayOf(systemtime))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryTimerResolution", longArrayOf(maximumtime, minimumtime, currenttime))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySystemInformation", longArrayOf(systeminformationclass.toLong(), systeminformation, systeminformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQuerySystemTime(systemtime: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySystemTime", longArrayOf(systemtime))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryTimerResolution", longArrayOf(maximumtime, minimumtime, currenttime))
    return Win32.Foundation.NTSTATUS()
}
