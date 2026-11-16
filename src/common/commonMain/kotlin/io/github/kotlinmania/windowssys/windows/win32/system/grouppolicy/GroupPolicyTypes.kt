package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    public operator fun invoke(dwflags: UInt, pbabort: MutPtr, pwszsite: Pcwstr, pcomputertarget: ConstPtr, pusertarget: ConstPtr): UInt
}

public typealias Pfngenerategrouppolicy = PfngenerategrouppolicyFn?

public fun interface PfnprocessgrouppolicyFn {
    public operator fun invoke(dwflags: UInt, htoken: Handle, hkeyroot: Hkey, pdeletedgpolist: ConstPtr, pchangedgpolist: ConstPtr, phandle: ULong, pbabort: MutPtr, pstatuscallback: Pfnstatusmessagecallback): UInt
}

public typealias Pfnprocessgrouppolicy = PfnprocessgrouppolicyFn?

public fun interface PfnprocessgrouppolicyexFn {
    public operator fun invoke(dwflags: UInt, htoken: Handle, hkeyroot: Hkey, pdeletedgpolist: ConstPtr, pchangedgpolist: ConstPtr, phandle: ULong, pbabort: MutPtr, pstatuscallback: Pfnstatusmessagecallback, pwbemservices: MutPtr, prsopstatus: MutPtr): UInt
}

public typealias Pfnprocessgrouppolicyex = PfnprocessgrouppolicyexFn?

public fun interface PfnstatusmessagecallbackFn {
    public operator fun invoke(bverbose: Bool, lpmessage: Pcwstr): UInt
}

public typealias Pfnstatusmessagecallback = PfnstatusmessagecallbackFn?

public typealias Settingstatus = Int
