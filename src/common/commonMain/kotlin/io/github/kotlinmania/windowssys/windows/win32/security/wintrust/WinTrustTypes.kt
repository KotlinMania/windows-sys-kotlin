package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.HCERTSTORE

public fun interface PFN_ALLOCANDFILLDEFUSAGEFn {
    public operator fun invoke(pszusageoid: PCSTR, psdefusage: Long): BOOL
}

public typealias PFN_ALLOCANDFILLDEFUSAGE = PFN_ALLOCANDFILLDEFUSAGEFn?

public fun interface PFN_CPD_ADD_CERTFn {
    public operator fun invoke(pprovdata: Long, idxsigner: UInt, fcountersigner: BOOL, idxcountersigner: UInt, pcert2add: Long): BOOL
}

public typealias PFN_CPD_ADD_CERT = PFN_CPD_ADD_CERTFn?

public fun interface PFN_CPD_ADD_PRIVDATAFn {
    public operator fun invoke(pprovdata: Long, pprivdata2add: Long): BOOL
}

public typealias PFN_CPD_ADD_PRIVDATA = PFN_CPD_ADD_PRIVDATAFn?

public fun interface PFN_CPD_ADD_SGNRFn {
    public operator fun invoke(pprovdata: Long, fcountersigner: BOOL, idxsigner: UInt, psgnr2add: Long): BOOL
}

public typealias PFN_CPD_ADD_SGNR = PFN_CPD_ADD_SGNRFn?

public fun interface PFN_CPD_ADD_STOREFn {
    public operator fun invoke(pprovdata: Long, hstore2add: HCERTSTORE): BOOL
}

public typealias PFN_CPD_ADD_STORE = PFN_CPD_ADD_STOREFn?

public fun interface PFN_CPD_MEM_ALLOCFn {
    public operator fun invoke(cbsize: UInt): Long
}

public typealias PFN_CPD_MEM_ALLOC = PFN_CPD_MEM_ALLOCFn?

public fun interface PFN_CPD_MEM_FREEFn {
    public operator fun invoke(pvmem2free: Long)
}

public typealias PFN_CPD_MEM_FREE = PFN_CPD_MEM_FREEFn?

public fun interface PFN_FREEDEFUSAGEFn {
    public operator fun invoke(pszusageoid: PCSTR, psdefusage: Long): BOOL
}

public typealias PFN_FREEDEFUSAGE = PFN_FREEDEFUSAGEFn?

public fun interface PFN_PROVIDER_CERTCHKPOLICY_CALLFn {
    public operator fun invoke(pprovdata: Long, idxsigner: UInt, fcountersignerchain: BOOL, idxcountersigner: UInt): BOOL
}

public typealias PFN_PROVIDER_CERTCHKPOLICY_CALL = PFN_PROVIDER_CERTCHKPOLICY_CALLFn?

public fun interface PFN_PROVIDER_CERTTRUST_CALLFn {
    public operator fun invoke(pprovdata: Long): HRESULT
}

public typealias PFN_PROVIDER_CERTTRUST_CALL = PFN_PROVIDER_CERTTRUST_CALLFn?

public fun interface PFN_PROVIDER_CLEANUP_CALLFn {
    public operator fun invoke(pprovdata: Long): HRESULT
}

public typealias PFN_PROVIDER_CLEANUP_CALL = PFN_PROVIDER_CLEANUP_CALLFn?

public fun interface PFN_PROVIDER_FINALPOLICY_CALLFn {
    public operator fun invoke(pprovdata: Long): HRESULT
}

public typealias PFN_PROVIDER_FINALPOLICY_CALL = PFN_PROVIDER_FINALPOLICY_CALLFn?

public fun interface PFN_PROVIDER_INIT_CALLFn {
    public operator fun invoke(pprovdata: Long): HRESULT
}

public typealias PFN_PROVIDER_INIT_CALL = PFN_PROVIDER_INIT_CALLFn?

public fun interface PFN_PROVIDER_OBJTRUST_CALLFn {
    public operator fun invoke(pprovdata: Long): HRESULT
}

public typealias PFN_PROVIDER_OBJTRUST_CALL = PFN_PROVIDER_OBJTRUST_CALLFn?

public fun interface PFN_PROVIDER_SIGTRUST_CALLFn {
    public operator fun invoke(pprovdata: Long): HRESULT
}

public typealias PFN_PROVIDER_SIGTRUST_CALL = PFN_PROVIDER_SIGTRUST_CALLFn?

public fun interface PFN_PROVIDER_TESTFINALPOLICY_CALLFn {
    public operator fun invoke(pprovdata: Long): HRESULT
}

public typealias PFN_PROVIDER_TESTFINALPOLICY_CALL = PFN_PROVIDER_TESTFINALPOLICY_CALLFn?

public fun interface PFN_PROVUI_CALLFn {
    public operator fun invoke(hwndsecuritydialog: HWND, pprovdata: Long): BOOL
}

public typealias PFN_PROVUI_CALL = PFN_PROVUI_CALLFn?

public fun interface PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACKFn {
    public operator fun invoke(pprovdata: Long, dwsteperror: UInt, dwregpolicysettings: UInt, csigner: UInt, rgpsigner: Long, pvpolicyarg: Long): HRESULT
}

public typealias PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACK = PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACKFn?

public typealias WINTRUST_DATA_PROVIDER_FLAGS = UInt

public typealias WINTRUST_DATA_REVOCATION_CHECKS = UInt

public typealias WINTRUST_DATA_STATE_ACTION = UInt

public typealias WINTRUST_DATA_UICHOICE = UInt

public typealias WINTRUST_DATA_UICONTEXT = UInt

public typealias WINTRUST_DATA_UNION_CHOICE = UInt

public typealias WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION = UInt

public typealias WINTRUST_POLICY_FLAGS = UInt

public typealias WINTRUST_SIGNATURE_SETTINGS_FLAGS = UInt
