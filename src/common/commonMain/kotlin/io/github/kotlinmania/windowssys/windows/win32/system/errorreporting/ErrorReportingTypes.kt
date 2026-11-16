package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public typealias EFaultRepRetVal = Int

public typealias Hreport = MutPtr

public typealias Hreportstore = MutPtr

public fun interface PfnWerRuntimeExceptionDebuggerLaunchFn {
    public operator fun invoke(pcontext: ConstPtr, pexceptioninformation: ConstPtr, pbiscustomdebugger: MutPtr, pwszdebuggerlaunch: Pwstr, pchdebuggerlaunch: MutPtr, pbisdebuggerautolaunch: MutPtr): Hresult
}

public typealias PfnWerRuntimeExceptionDebuggerLaunch = PfnWerRuntimeExceptionDebuggerLaunchFn?

public fun interface PfnWerRuntimeExceptionEventFn {
    public operator fun invoke(pcontext: ConstPtr, pexceptioninformation: ConstPtr, pbownershipclaimed: MutPtr, pwszeventname: Pwstr, pchsize: MutPtr, pdwsignaturecount: MutPtr): Hresult
}

public typealias PfnWerRuntimeExceptionEvent = PfnWerRuntimeExceptionEventFn?

public fun interface PfnWerRuntimeExceptionEventSignatureFn {
    public operator fun invoke(pcontext: ConstPtr, pexceptioninformation: ConstPtr, dwindex: UInt, pwszname: Pwstr, pchname: MutPtr, pwszvalue: Pwstr, pchvalue: MutPtr): Hresult
}

public typealias PfnWerRuntimeExceptionEventSignature = PfnWerRuntimeExceptionEventSignatureFn?

public typealias ReportStoreTypes = Int

public typealias WerConsent = Int

public typealias WerDumpType = Int

public typealias WerFaultReporting = UInt

public typealias WerFile = UInt

public typealias WerFileType = Int

public typealias WerRegisterFileType = Int

public typealias WerReportType = Int

public typealias WerReportUi = Int

public typealias WerSubmitFlags = UInt

public typealias WerSubmitResult = Int

public fun interface PfnAdderexcludedapplicationaFn {
    public operator fun invoke(param0: Pcstr): EFaultRepRetVal
}

public typealias PfnAdderexcludedapplicationa = PfnAdderexcludedapplicationaFn?

public fun interface PfnAdderexcludedapplicationwFn {
    public operator fun invoke(param0: Pcwstr): EFaultRepRetVal
}

public typealias PfnAdderexcludedapplicationw = PfnAdderexcludedapplicationwFn?

public fun interface PfnReportfaultFn {
    public operator fun invoke(param0: ConstPtr, param1: UInt): EFaultRepRetVal
}

public typealias PfnReportfault = PfnReportfaultFn?
