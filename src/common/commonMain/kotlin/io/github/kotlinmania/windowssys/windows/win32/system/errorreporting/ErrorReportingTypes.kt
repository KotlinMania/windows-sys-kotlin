package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionPointers

public typealias EFaultRepRetVal = Int

public typealias Hreport = MutPtr<CVoid>

public typealias Hreportstore = MutPtr<CVoid>

public fun interface PfnWerRuntimeExceptionDebuggerLaunchFn {
    public operator fun invoke(pcontext: ConstPtr<CVoid>, pexceptioninformation: ConstPtr<WerRuntimeExceptionInformation>, pbiscustomdebugger: MutPtr<Bool>, pwszdebuggerlaunch: Pwstr, pchdebuggerlaunch: MutPtr<UInt>, pbisdebuggerautolaunch: MutPtr<Bool>): Hresult
}

public typealias PfnWerRuntimeExceptionDebuggerLaunch = PfnWerRuntimeExceptionDebuggerLaunchFn?

public fun interface PfnWerRuntimeExceptionEventFn {
    public operator fun invoke(pcontext: ConstPtr<CVoid>, pexceptioninformation: ConstPtr<WerRuntimeExceptionInformation>, pbownershipclaimed: MutPtr<Bool>, pwszeventname: Pwstr, pchsize: MutPtr<UInt>, pdwsignaturecount: MutPtr<UInt>): Hresult
}

public typealias PfnWerRuntimeExceptionEvent = PfnWerRuntimeExceptionEventFn?

public fun interface PfnWerRuntimeExceptionEventSignatureFn {
    public operator fun invoke(pcontext: ConstPtr<CVoid>, pexceptioninformation: ConstPtr<WerRuntimeExceptionInformation>, dwindex: UInt, pwszname: Pwstr, pchname: MutPtr<UInt>, pwszvalue: Pwstr, pchvalue: MutPtr<UInt>): Hresult
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
    public operator fun invoke(param0: ConstPtr<ExceptionPointers>, param1: UInt): EFaultRepRetVal
}

public typealias PfnReportfault = PfnReportfaultFn?
