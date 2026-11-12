package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

public fun interface PfnAllocandfilldefusageFn {
    public operator fun invoke(pszusageoid: Pcstr, psdefusage: ConstPtr<CryptProviderDefusage>): Bool
}

public typealias PfnAllocandfilldefusage = PfnAllocandfilldefusageFn?

public fun interface PfnCpdAddCertFn {
    public operator fun invoke(pprovdata: ConstPtr<CryptProviderData>, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt, pcert2add: ConstPtr<CertContext>): Bool
}

public typealias PfnCpdAddCert = PfnCpdAddCertFn?

public fun interface PfnCpdAddPrivdataFn {
    public operator fun invoke(pprovdata: ConstPtr<CryptProviderData>, pprivdata2add: ConstPtr<CryptProviderPrivdata>): Bool
}

public typealias PfnCpdAddPrivdata = PfnCpdAddPrivdataFn?

public fun interface PfnCpdAddSgnrFn {
    public operator fun invoke(pprovdata: ConstPtr<CryptProviderData>, fcountersigner: Bool, idxsigner: UInt, psgnr2add: ConstPtr<CryptProviderSgnr>): Bool
}

public typealias PfnCpdAddSgnr = PfnCpdAddSgnrFn?

public fun interface PfnCpdAddStoreFn {
    public operator fun invoke(pprovdata: ConstPtr<CryptProviderData>, hstore2add: Hcertstore): Bool
}

public typealias PfnCpdAddStore = PfnCpdAddStoreFn?

public fun interface PfnCpdMemAllocFn {
    public operator fun invoke(cbsize: UInt): MutPtr<CVoid>
}

public typealias PfnCpdMemAlloc = PfnCpdMemAllocFn?

public fun interface PfnCpdMemFreeFn {
    public operator fun invoke(pvmem2free: ConstPtr<CVoid>)
}

public typealias PfnCpdMemFree = PfnCpdMemFreeFn?

public fun interface PfnFreedefusageFn {
    public operator fun invoke(pszusageoid: Pcstr, psdefusage: ConstPtr<CryptProviderDefusage>): Bool
}

public typealias PfnFreedefusage = PfnFreedefusageFn?

public fun interface PfnProviderCertchkpolicyCallFn {
    public operator fun invoke(pprovdata: ConstPtr<CryptProviderData>, idxsigner: UInt, fcountersignerchain: Bool, idxcountersigner: UInt): Bool
}

public typealias PfnProviderCertchkpolicyCall = PfnProviderCertchkpolicyCallFn?

public fun interface PfnProviderCerttrustCallFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>): Hresult
}

public typealias PfnProviderCerttrustCall = PfnProviderCerttrustCallFn?

public fun interface PfnProviderCleanupCallFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>): Hresult
}

public typealias PfnProviderCleanupCall = PfnProviderCleanupCallFn?

public fun interface PfnProviderFinalpolicyCallFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>): Hresult
}

public typealias PfnProviderFinalpolicyCall = PfnProviderFinalpolicyCallFn?

public fun interface PfnProviderInitCallFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>): Hresult
}

public typealias PfnProviderInitCall = PfnProviderInitCallFn?

public fun interface PfnProviderObjtrustCallFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>): Hresult
}

public typealias PfnProviderObjtrustCall = PfnProviderObjtrustCallFn?

public fun interface PfnProviderSigtrustCallFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>): Hresult
}

public typealias PfnProviderSigtrustCall = PfnProviderSigtrustCallFn?

public fun interface PfnProviderTestfinalpolicyCallFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>): Hresult
}

public typealias PfnProviderTestfinalpolicyCall = PfnProviderTestfinalpolicyCallFn?

public fun interface PfnProvuiCallFn {
    public operator fun invoke(hwndsecuritydialog: Hwnd, pprovdata: ConstPtr<CryptProviderData>): Bool
}

public typealias PfnProvuiCall = PfnProvuiCallFn?

public fun interface PfnWtdGenericChainPolicyCallbackFn {
    public operator fun invoke(pprovdata: MutPtr<CryptProviderData>, dwsteperror: UInt, dwregpolicysettings: UInt, csigner: UInt, rgpsigner: MutPtr<MutPtr<WtdGenericChainPolicySignerInfo>>, pvpolicyarg: MutPtr<CVoid>): Hresult
}

public typealias PfnWtdGenericChainPolicyCallback = PfnWtdGenericChainPolicyCallbackFn?

public typealias WintrustDataProviderFlags = UInt

public typealias WintrustDataRevocationChecks = UInt

public typealias WintrustDataStateAction = UInt

public typealias WintrustDataUichoice = UInt

public typealias WintrustDataUicontext = UInt

public typealias WintrustDataUnionChoice = UInt

public typealias WintrustGetDefaultForUsageAction = UInt

public typealias WintrustPolicyFlags = UInt

public typealias WintrustSignatureSettingsFlags = UInt
