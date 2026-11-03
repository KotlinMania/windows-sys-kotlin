package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public typealias COMPUTER_NAME_FORMAT = Int

public typealias CPU_SET_INFORMATION_TYPE = Int

public typealias DEP_SYSTEM_POLICY_TYPE = Int

public typealias DEVELOPER_DRIVE_ENABLEMENT_STATE = Int

public typealias DEVICEFAMILYDEVICEFORM = UInt

public typealias DEVICEFAMILYINFOENUM = UInt

public typealias FIRMWARE_TABLE_PROVIDER = UInt

public typealias FIRMWARE_TYPE = Int

public typealias IMAGE_FILE_MACHINE = UShort

public typealias LOGICAL_PROCESSOR_RELATIONSHIP = Int

public typealias OS_DEPLOYEMENT_STATE_VALUES = Int

public typealias OS_PRODUCT_TYPE = UInt

public fun interface PGET_SYSTEM_WOW64_DIRECTORY_AFn {
    public operator fun invoke(lpbuffer: PSTR, usize: UInt): UInt
}

public typealias PGET_SYSTEM_WOW64_DIRECTORY_A = PGET_SYSTEM_WOW64_DIRECTORY_AFn?

public fun interface PGET_SYSTEM_WOW64_DIRECTORY_WFn {
    public operator fun invoke(lpbuffer: PWSTR, usize: UInt): UInt
}

public typealias PGET_SYSTEM_WOW64_DIRECTORY_W = PGET_SYSTEM_WOW64_DIRECTORY_WFn?

public typealias PROCESSOR_ARCHITECTURE = UShort

public typealias PROCESSOR_CACHE_TYPE = Int

public typealias RTL_SYSTEM_GLOBAL_DATA_ID = Int

public typealias USER_CET_ENVIRONMENT = UInt

public typealias VER_FLAGS = UInt
