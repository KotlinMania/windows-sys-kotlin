package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias GPIOBUTTONS_BUTTON_TYPE = Int

public typealias HIDP_KEYBOARD_DIRECTION = Int

public typealias HIDP_REPORT_TYPE = Int

public fun interface LPDICONFIGUREDEVICESCALLBACKFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDICONFIGUREDEVICESCALLBACK = LPDICONFIGUREDEVICESCALLBACKFn?

public fun interface LPDIENUMCREATEDEFFECTOBJECTSCALLBACKFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMCREATEDEFFECTOBJECTSCALLBACK = LPDIENUMCREATEDEFFECTOBJECTSCALLBACKFn?

public fun interface LPDIENUMDEVICEOBJECTSCALLBACKAFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMDEVICEOBJECTSCALLBACKA = LPDIENUMDEVICEOBJECTSCALLBACKAFn?

public fun interface LPDIENUMDEVICEOBJECTSCALLBACKWFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMDEVICEOBJECTSCALLBACKW = LPDIENUMDEVICEOBJECTSCALLBACKWFn?

public fun interface LPDIENUMDEVICESBYSEMANTICSCBAFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: UInt, param4: Long): BOOL
}

public typealias LPDIENUMDEVICESBYSEMANTICSCBA = LPDIENUMDEVICESBYSEMANTICSCBAFn?

public fun interface LPDIENUMDEVICESBYSEMANTICSCBWFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: UInt, param4: Long): BOOL
}

public typealias LPDIENUMDEVICESBYSEMANTICSCBW = LPDIENUMDEVICESBYSEMANTICSCBWFn?

public fun interface LPDIENUMDEVICESCALLBACKAFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMDEVICESCALLBACKA = LPDIENUMDEVICESCALLBACKAFn?

public fun interface LPDIENUMDEVICESCALLBACKWFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMDEVICESCALLBACKW = LPDIENUMDEVICESCALLBACKWFn?

public fun interface LPDIENUMEFFECTSCALLBACKAFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMEFFECTSCALLBACKA = LPDIENUMEFFECTSCALLBACKAFn?

public fun interface LPDIENUMEFFECTSCALLBACKWFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMEFFECTSCALLBACKW = LPDIENUMEFFECTSCALLBACKWFn?

public fun interface LPDIENUMEFFECTSINFILECALLBACKFn {
    public operator fun invoke(param0: Long, param1: Long): BOOL
}

public typealias LPDIENUMEFFECTSINFILECALLBACK = LPDIENUMEFFECTSINFILECALLBACKFn?

public fun interface LPDIJOYTYPECALLBACKFn {
    public operator fun invoke(param0: PCWSTR, param1: Long): BOOL
}

public typealias LPDIJOYTYPECALLBACK = LPDIJOYTYPECALLBACKFn?

public fun interface LPFNSHOWJOYCPLFn {
    public operator fun invoke(hwnd: Foundation.HWND)
}

public typealias LPFNSHOWJOYCPL = LPFNSHOWJOYCPLFn?

public fun interface PFN_HidP_GetVersionInternalFn {
    public operator fun invoke(version: Long): Foundation.NTSTATUS
}

public typealias PFN_HidP_GetVersionInternal = PFN_HidP_GetVersionInternalFn?

public fun interface PHIDP_INSERT_SCANCODESFn {
    public operator fun invoke(context: Long, newscancodes: PCSTR, length: UInt): Boolean
}

public typealias PHIDP_INSERT_SCANCODES = PHIDP_INSERT_SCANCODESFn?

public typealias PHIDP_PREPARSED_DATA = Long
