package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun ntQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus

public expect fun ntQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus

public expect fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus

public expect fun zwQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus
