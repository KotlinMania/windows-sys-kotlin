package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public typealias EFaultRepRetVal = Int

public typealias Hreport = COpaquePointer?

public typealias Hreportstore = COpaquePointer?

public fun interface PfnWerRuntimeExceptionDebuggerLaunchFn {
    public operator fun invoke(pcontext: COpaquePointer?, pexceptioninformation: COpaquePointer?, pbiscustomdebugger: COpaquePointer?, pwszdebuggerlaunch: Pwstr, pchdebuggerlaunch: COpaquePointer?, pbisdebuggerautolaunch: COpaquePointer?): Hresult
}

public typealias PfnWerRuntimeExceptionDebuggerLaunch = PfnWerRuntimeExceptionDebuggerLaunchFn?

public fun interface PfnWerRuntimeExceptionEventFn {
    public operator fun invoke(pcontext: COpaquePointer?, pexceptioninformation: COpaquePointer?, pbownershipclaimed: COpaquePointer?, pwszeventname: Pwstr, pchsize: COpaquePointer?, pdwsignaturecount: COpaquePointer?): Hresult
}

public typealias PfnWerRuntimeExceptionEvent = PfnWerRuntimeExceptionEventFn?

public fun interface PfnWerRuntimeExceptionEventSignatureFn {
    public operator fun invoke(pcontext: COpaquePointer?, pexceptioninformation: COpaquePointer?, dwindex: UInt, pwszname: Pwstr, pchname: COpaquePointer?, pwszvalue: Pwstr, pchvalue: COpaquePointer?): Hresult
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
    public operator fun invoke(param0: COpaquePointer?, param1: UInt): EFaultRepRetVal
}

public typealias PfnReportfault = PfnReportfaultFn?
