package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr, systeminformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun ntQuerySystemTime(systemtime: MutPtr): Ntstatus

public expect fun ntQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr): Ntstatus

public expect fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr, systeminformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQuerySystemTime(systemtime: MutPtr): Ntstatus

public expect fun zwQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr): Ntstatus
