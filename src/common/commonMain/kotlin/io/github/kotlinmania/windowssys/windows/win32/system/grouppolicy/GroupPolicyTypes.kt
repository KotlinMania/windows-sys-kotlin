package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY

public typealias APPSTATE = Int

public typealias GPMBackupType = Int

public typealias GPMDestinationOption = Int

public typealias GPMEntryType = Int

public typealias GPMPermissionType = Int

public typealias GPMRSOPMode = Int

public typealias GPMReportType = Int

public typealias GPMReportingOptions = Int

public typealias GPMSOMType = Int

public typealias GPMSearchOperation = Int

public typealias GPMSearchProperty = Int

public typealias GPMStarterGPOType = Int

public typealias GPO_LINK = Int

public typealias GPO_OPEN_FLAGS = UInt

public typealias GPO_OPTIONS = UInt

public typealias GPO_SECTION = UInt

public typealias GROUP_POLICY_HINT_TYPE = Int

public typealias GROUP_POLICY_OBJECT_TYPE = Int

public typealias INSTALLSPECTYPE = Int

public fun interface PFNGENERATEGROUPPOLICYFn {
    public operator fun invoke(dwflags: UInt, pbabort: Long, pwszsite: PCWSTR, pcomputertarget: Long, pusertarget: Long): UInt
}

public typealias PFNGENERATEGROUPPOLICY = PFNGENERATEGROUPPOLICYFn?

public fun interface PFNPROCESSGROUPPOLICYFn {
    public operator fun invoke(dwflags: UInt, htoken: HANDLE, hkeyroot: HKEY, pdeletedgpolist: Long, pchangedgpolist: Long, phandle: ULong, pbabort: Long, pstatuscallback: PFNSTATUSMESSAGECALLBACK): UInt
}

public typealias PFNPROCESSGROUPPOLICY = PFNPROCESSGROUPPOLICYFn?

public fun interface PFNPROCESSGROUPPOLICYEXFn {
    public operator fun invoke(dwflags: UInt, htoken: HANDLE, hkeyroot: HKEY, pdeletedgpolist: Long, pchangedgpolist: Long, phandle: ULong, pbabort: Long, pstatuscallback: PFNSTATUSMESSAGECALLBACK, pwbemservices: Long, prsopstatus: Long): UInt
}

public typealias PFNPROCESSGROUPPOLICYEX = PFNPROCESSGROUPPOLICYEXFn?

public fun interface PFNSTATUSMESSAGECALLBACKFn {
    public operator fun invoke(bverbose: BOOL, lpmessage: PCWSTR): UInt
}

public typealias PFNSTATUSMESSAGECALLBACK = PFNSTATUSMESSAGECALLBACKFn?

public typealias SETTINGSTATUS = Int
