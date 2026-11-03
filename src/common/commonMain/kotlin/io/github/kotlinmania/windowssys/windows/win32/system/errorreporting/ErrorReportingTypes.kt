package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public typealias EFaultRepRetVal = Int

public typealias HREPORT = Long

public typealias HREPORTSTORE = Long

public fun interface PFN_WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCHFn {
    public operator fun invoke(pcontext: Long, pexceptioninformation: Long, pbiscustomdebugger: Long, pwszdebuggerlaunch: PWSTR, pchdebuggerlaunch: Long, pbisdebuggerautolaunch: Long): HRESULT
}

public typealias PFN_WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCH = PFN_WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCHFn?

public fun interface PFN_WER_RUNTIME_EXCEPTION_EVENTFn {
    public operator fun invoke(pcontext: Long, pexceptioninformation: Long, pbownershipclaimed: Long, pwszeventname: PWSTR, pchsize: Long, pdwsignaturecount: Long): HRESULT
}

public typealias PFN_WER_RUNTIME_EXCEPTION_EVENT = PFN_WER_RUNTIME_EXCEPTION_EVENTFn?

public fun interface PFN_WER_RUNTIME_EXCEPTION_EVENT_SIGNATUREFn {
    public operator fun invoke(pcontext: Long, pexceptioninformation: Long, dwindex: UInt, pwszname: PWSTR, pchname: Long, pwszvalue: PWSTR, pchvalue: Long): HRESULT
}

public typealias PFN_WER_RUNTIME_EXCEPTION_EVENT_SIGNATURE = PFN_WER_RUNTIME_EXCEPTION_EVENT_SIGNATUREFn?

public typealias REPORT_STORE_TYPES = Int

public typealias WER_CONSENT = Int

public typealias WER_DUMP_TYPE = Int

public typealias WER_FAULT_REPORTING = UInt

public typealias WER_FILE = UInt

public typealias WER_FILE_TYPE = Int

public typealias WER_REGISTER_FILE_TYPE = Int

public typealias WER_REPORT_TYPE = Int

public typealias WER_REPORT_UI = Int

public typealias WER_SUBMIT_FLAGS = UInt

public typealias WER_SUBMIT_RESULT = Int

public fun interface pfn_ADDEREXCLUDEDAPPLICATIONAFn {
    public operator fun invoke(param0: PCSTR): EFaultRepRetVal
}

public typealias pfn_ADDEREXCLUDEDAPPLICATIONA = pfn_ADDEREXCLUDEDAPPLICATIONAFn?

public fun interface pfn_ADDEREXCLUDEDAPPLICATIONWFn {
    public operator fun invoke(param0: PCWSTR): EFaultRepRetVal
}

public typealias pfn_ADDEREXCLUDEDAPPLICATIONW = pfn_ADDEREXCLUDEDAPPLICATIONWFn?

public fun interface pfn_REPORTFAULTFn {
    public operator fun invoke(param0: Long, param1: UInt): EFaultRepRetVal
}

public typealias pfn_REPORTFAULT = pfn_REPORTFAULTFn?
