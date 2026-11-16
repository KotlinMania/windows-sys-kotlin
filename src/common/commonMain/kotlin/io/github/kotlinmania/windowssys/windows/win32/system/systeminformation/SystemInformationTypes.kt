package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public typealias ComputerNameFormat = Int

public typealias CpuSetInformationType = Int

public typealias DepSystemPolicyType = Int

public typealias DeveloperDriveEnablementState = Int

public typealias Devicefamilydeviceform = UInt

public typealias Devicefamilyinfoenum = UInt

public typealias FirmwareTableProvider = UInt

public typealias FirmwareType = Int

public typealias ImageFileMachine = UShort

public typealias LogicalProcessorRelationship = Int

public typealias OsDeployementStateValues = Int

public typealias OsProductType = UInt

public fun interface PgetSystemWow64DirectoryAFn {
    public operator fun invoke(lpbuffer: Pstr, usize: UInt): UInt
}

public typealias PgetSystemWow64DirectoryA = PgetSystemWow64DirectoryAFn?

public fun interface PgetSystemWow64DirectoryWFn {
    public operator fun invoke(lpbuffer: Pwstr, usize: UInt): UInt
}

public typealias PgetSystemWow64DirectoryW = PgetSystemWow64DirectoryWFn?

public typealias ProcessorArchitecture = UShort

public typealias ProcessorCacheType = Int

public typealias RtlSystemGlobalDataId = Int

public typealias UserCetEnvironment = UInt

public typealias VerFlags = UInt
