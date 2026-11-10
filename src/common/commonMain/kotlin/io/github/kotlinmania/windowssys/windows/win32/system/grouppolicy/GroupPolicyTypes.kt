package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

public typealias Appstate = Int

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

public typealias GpoLink = Int

public typealias GpoOpenFlags = UInt

public typealias GpoOptions = UInt

public typealias GpoSection = UInt

public typealias GroupPolicyHintType = Int

public typealias GroupPolicyObjectType = Int

public typealias Installspectype = Int

public fun interface PfngenerategrouppolicyFn {
    public operator fun invoke(dwflags: UInt, pbabort: COpaquePointer?, pwszsite: Pcwstr, pcomputertarget: COpaquePointer?, pusertarget: COpaquePointer?): UInt
}

public typealias Pfngenerategrouppolicy = PfngenerategrouppolicyFn?

public fun interface PfnprocessgrouppolicyFn {
    public operator fun invoke(dwflags: UInt, htoken: Handle, hkeyroot: Hkey, pdeletedgpolist: COpaquePointer?, pchangedgpolist: COpaquePointer?, phandle: ULong, pbabort: COpaquePointer?, pstatuscallback: Pfnstatusmessagecallback): UInt
}

public typealias Pfnprocessgrouppolicy = PfnprocessgrouppolicyFn?

public fun interface PfnprocessgrouppolicyexFn {
    public operator fun invoke(dwflags: UInt, htoken: Handle, hkeyroot: Hkey, pdeletedgpolist: COpaquePointer?, pchangedgpolist: COpaquePointer?, phandle: ULong, pbabort: COpaquePointer?, pstatuscallback: Pfnstatusmessagecallback, pwbemservices: COpaquePointer?, prsopstatus: COpaquePointer?): UInt
}

public typealias Pfnprocessgrouppolicyex = PfnprocessgrouppolicyexFn?

public fun interface PfnstatusmessagecallbackFn {
    public operator fun invoke(bverbose: Bool, lpmessage: Pcwstr): UInt
}

public typealias Pfnstatusmessagecallback = PfnstatusmessagecallbackFn?

public typealias Settingstatus = Int
