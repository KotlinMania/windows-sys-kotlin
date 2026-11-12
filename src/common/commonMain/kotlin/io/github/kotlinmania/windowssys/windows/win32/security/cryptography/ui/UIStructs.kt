package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ui

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CrlContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptKeyFlags
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptKeyProvInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CtlContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore
import io.github.kotlinmania.windowssys.windows.win32.security.wintrust.CryptProviderData
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Propsheetpagea
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Propsheetpagew

public class CertFilterData internal constructor(
    public var dwSize: UInt,
    public var cExtensionChecks: UInt,
    arrayExtensionChecksCtorArg: MutPtr<CertFilterExtensionMatch>,
    public var dwCheckingFlags: UInt,
) {
    public var arrayExtensionChecks: MutPtr<CertFilterExtensionMatch> = arrayExtensionChecksCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        cExtensionChecks = 0u,
        arrayExtensionChecksCtorArg = MutPtr(0L),
        dwCheckingFlags = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.cExtensionChecks

    public operator fun component3(): MutPtr<CertFilterExtensionMatch> = this.arrayExtensionChecks

    public operator fun component4(): UInt = this.dwCheckingFlags

    public fun copy(dwSize: UInt = this.dwSize, cExtensionChecks: UInt = this.cExtensionChecks, arrayExtensionChecks: MutPtr<CertFilterExtensionMatch> = this.arrayExtensionChecks, dwCheckingFlags: UInt = this.dwCheckingFlags): CertFilterData = CertFilterData(dwSize = dwSize, cExtensionChecks = cExtensionChecks, arrayExtensionChecksCtorArg = arrayExtensionChecks, dwCheckingFlags = dwCheckingFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertFilterData) return false
        if (this.dwSize != other.dwSize) return false
        if (this.cExtensionChecks != other.cExtensionChecks) return false
        if (this.arrayExtensionChecks != other.arrayExtensionChecks) return false
        if (this.dwCheckingFlags != other.dwCheckingFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.cExtensionChecks.hashCode()
        result = 31 * result + this.arrayExtensionChecks.hashCode()
        result = 31 * result + this.dwCheckingFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertFilterData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertFilterData> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CertFilterData =
                    CertFilterData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertFilterExtensionMatch>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CertFilterData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cExtensionChecks)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertFilterExtensionMatch>(64)
                    ).writeNative(addr + 8L, value.arrayExtensionChecks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCheckingFlags)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            cExtensionChecks: UInt = 0u,
            arrayExtensionChecks: MutPtr<CertFilterExtensionMatch> = MutPtr(0L),
            dwCheckingFlags: UInt = 0u,
        ): CertFilterData =
            CertFilterData(
                dwSize = dwSize,
                cExtensionChecks = cExtensionChecks,
                arrayExtensionChecksCtorArg = arrayExtensionChecks,
                dwCheckingFlags = dwCheckingFlags,
            )
    }
}

public class CertFilterExtensionMatch internal constructor(
    szExtensionOIDCtorArg: Pcstr,
    public var dwTestOperation: UInt,
    pbTestDataCtorArg: MutPtr<UByte>,
    public var cbTestData: UInt,
) {
    public var szExtensionOID: Pcstr = szExtensionOIDCtorArg
        internal set

    public var pbTestData: MutPtr<UByte> = pbTestDataCtorArg
        internal set

    public constructor() : this(
        szExtensionOIDCtorArg = ConstPtr(0L),
        dwTestOperation = 0u,
        pbTestDataCtorArg = MutPtr(0L),
        cbTestData = 0u,
    )

    public operator fun component1(): Pcstr = this.szExtensionOID

    public operator fun component2(): UInt = this.dwTestOperation

    public operator fun component3(): MutPtr<UByte> = this.pbTestData

    public operator fun component4(): UInt = this.cbTestData

    public fun copy(szExtensionOID: Pcstr = this.szExtensionOID, dwTestOperation: UInt = this.dwTestOperation, pbTestData: MutPtr<UByte> = this.pbTestData, cbTestData: UInt = this.cbTestData): CertFilterExtensionMatch = CertFilterExtensionMatch(szExtensionOIDCtorArg = szExtensionOID, dwTestOperation = dwTestOperation, pbTestDataCtorArg = pbTestData, cbTestData = cbTestData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertFilterExtensionMatch) return false
        if (this.szExtensionOID != other.szExtensionOID) return false
        if (this.dwTestOperation != other.dwTestOperation) return false
        if (this.pbTestData != other.pbTestData) return false
        if (this.cbTestData != other.cbTestData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szExtensionOID.hashCode()
        result = 31 * result + this.dwTestOperation.hashCode()
        result = 31 * result + this.pbTestData.hashCode()
        result = 31 * result + this.cbTestData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szExtensionOID: Pcstr = ConstPtr(0L),
            dwTestOperation: UInt = 0u,
            pbTestData: MutPtr<UByte> = MutPtr(0L),
            cbTestData: UInt = 0u,
        ): CertFilterExtensionMatch =
            CertFilterExtensionMatch(
                szExtensionOIDCtorArg = szExtensionOID,
                dwTestOperation = dwTestOperation,
                pbTestDataCtorArg = pbTestData,
                cbTestData = cbTestData,
            )
    }
}

public class CertSelectuiInput internal constructor(
    hStoreCtorArg: Hcertstore,
    prgpChainCtorArg: MutPtr<MutPtr<CertChainContext>>,
    public var cChain: UInt,
) {
    public var hStore: Hcertstore = hStoreCtorArg
        internal set

    public var prgpChain: MutPtr<MutPtr<CertChainContext>> = prgpChainCtorArg
        internal set

    public constructor() : this(
        hStoreCtorArg = MutPtr(0L),
        prgpChainCtorArg = MutPtr(0L),
        cChain = 0u,
    )

    public operator fun component1(): Hcertstore = this.hStore

    public operator fun component2(): MutPtr<MutPtr<CertChainContext>> = this.prgpChain

    public operator fun component3(): UInt = this.cChain

    public fun copy(hStore: Hcertstore = this.hStore, prgpChain: MutPtr<MutPtr<CertChainContext>> = this.prgpChain, cChain: UInt = this.cChain): CertSelectuiInput = CertSelectuiInput(hStoreCtorArg = hStore, prgpChainCtorArg = prgpChain, cChain = cChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertSelectuiInput) return false
        if (this.hStore != other.hStore) return false
        if (this.prgpChain != other.prgpChain) return false
        if (this.cChain != other.cChain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hStore.hashCode()
        result = 31 * result + this.prgpChain.hashCode()
        result = 31 * result + this.cChain.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hStore: Hcertstore = MutPtr(0L),
            prgpChain: MutPtr<MutPtr<CertChainContext>> = MutPtr(0L),
            cChain: UInt = 0u,
        ): CertSelectuiInput =
            CertSelectuiInput(
                hStoreCtorArg = hStore,
                prgpChainCtorArg = prgpChain,
                cChain = cChain,
            )
    }
}

public class CertSelectStructA internal constructor(
    public var dwSize: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    pTemplateNameCtorArg: Pcstr,
    public var dwFlags: CertSelectStructFlags,
    szTitleCtorArg: Pcstr,
    public var cCertStore: UInt,
    arrayCertStoreCtorArg: MutPtr<Hcertstore>,
    szPurposeOidCtorArg: Pcstr,
    public var cCertContext: UInt,
    arrayCertContextCtorArg: MutPtr<MutPtr<CertContext>>,
    public var lCustData: Lparam,
    public var pfnHook: Pfncmhookproc,
    public var pfnFilter: Pfncmfilterproc,
    szHelpFileNameCtorArg: Pcstr,
    public var dwHelpId: UInt,
    public var hprov: Int,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pTemplateName: Pcstr = pTemplateNameCtorArg
        internal set

    public var szTitle: Pcstr = szTitleCtorArg
        internal set

    public var arrayCertStore: MutPtr<Hcertstore> = arrayCertStoreCtorArg
        internal set

    public var szPurposeOid: Pcstr = szPurposeOidCtorArg
        internal set

    public var arrayCertContext: MutPtr<MutPtr<CertContext>> = arrayCertContextCtorArg
        internal set

    public var szHelpFileName: Pcstr = szHelpFileNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        pTemplateNameCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        szTitleCtorArg = ConstPtr(0L),
        cCertStore = 0u,
        arrayCertStoreCtorArg = MutPtr(0L),
        szPurposeOidCtorArg = ConstPtr(0L),
        cCertContext = 0u,
        arrayCertContextCtorArg = MutPtr(0L),
        lCustData = 0L,
        pfnHook = null,
        pfnFilter = null,
        szHelpFileNameCtorArg = ConstPtr(0L),
        dwHelpId = 0u,
        hprov = 0,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            pTemplateName: Pcstr = ConstPtr(0L),
            dwFlags: CertSelectStructFlags = 0u,
            szTitle: Pcstr = ConstPtr(0L),
            cCertStore: UInt = 0u,
            arrayCertStore: MutPtr<Hcertstore> = MutPtr(0L),
            szPurposeOid: Pcstr = ConstPtr(0L),
            cCertContext: UInt = 0u,
            arrayCertContext: MutPtr<MutPtr<CertContext>> = MutPtr(0L),
            lCustData: Lparam = 0L,
            pfnHook: Pfncmhookproc = null,
            pfnFilter: Pfncmfilterproc = null,
            szHelpFileName: Pcstr = ConstPtr(0L),
            dwHelpId: UInt = 0u,
            hprov: Int = 0,
        ): CertSelectStructA =
            CertSelectStructA(
                dwSize = dwSize,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                pTemplateNameCtorArg = pTemplateName,
                dwFlags = dwFlags,
                szTitleCtorArg = szTitle,
                cCertStore = cCertStore,
                arrayCertStoreCtorArg = arrayCertStore,
                szPurposeOidCtorArg = szPurposeOid,
                cCertContext = cCertContext,
                arrayCertContextCtorArg = arrayCertContext,
                lCustData = lCustData,
                pfnHook = pfnHook,
                pfnFilter = pfnFilter,
                szHelpFileNameCtorArg = szHelpFileName,
                dwHelpId = dwHelpId,
                hprov = hprov,
            )
    }
}

public class CertSelectStructW internal constructor(
    public var dwSize: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    pTemplateNameCtorArg: Pcwstr,
    public var dwFlags: CertSelectStructFlags,
    szTitleCtorArg: Pcwstr,
    public var cCertStore: UInt,
    arrayCertStoreCtorArg: MutPtr<Hcertstore>,
    szPurposeOidCtorArg: Pcstr,
    public var cCertContext: UInt,
    arrayCertContextCtorArg: MutPtr<MutPtr<CertContext>>,
    public var lCustData: Lparam,
    public var pfnHook: Pfncmhookproc,
    public var pfnFilter: Pfncmfilterproc,
    szHelpFileNameCtorArg: Pcwstr,
    public var dwHelpId: UInt,
    public var hprov: Int,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var pTemplateName: Pcwstr = pTemplateNameCtorArg
        internal set

    public var szTitle: Pcwstr = szTitleCtorArg
        internal set

    public var arrayCertStore: MutPtr<Hcertstore> = arrayCertStoreCtorArg
        internal set

    public var szPurposeOid: Pcstr = szPurposeOidCtorArg
        internal set

    public var arrayCertContext: MutPtr<MutPtr<CertContext>> = arrayCertContextCtorArg
        internal set

    public var szHelpFileName: Pcwstr = szHelpFileNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        pTemplateNameCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        szTitleCtorArg = ConstPtr(0L),
        cCertStore = 0u,
        arrayCertStoreCtorArg = MutPtr(0L),
        szPurposeOidCtorArg = ConstPtr(0L),
        cCertContext = 0u,
        arrayCertContextCtorArg = MutPtr(0L),
        lCustData = 0L,
        pfnHook = null,
        pfnFilter = null,
        szHelpFileNameCtorArg = ConstPtr(0L),
        dwHelpId = 0u,
        hprov = 0,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            pTemplateName: Pcwstr = ConstPtr(0L),
            dwFlags: CertSelectStructFlags = 0u,
            szTitle: Pcwstr = ConstPtr(0L),
            cCertStore: UInt = 0u,
            arrayCertStore: MutPtr<Hcertstore> = MutPtr(0L),
            szPurposeOid: Pcstr = ConstPtr(0L),
            cCertContext: UInt = 0u,
            arrayCertContext: MutPtr<MutPtr<CertContext>> = MutPtr(0L),
            lCustData: Lparam = 0L,
            pfnHook: Pfncmhookproc = null,
            pfnFilter: Pfncmfilterproc = null,
            szHelpFileName: Pcwstr = ConstPtr(0L),
            dwHelpId: UInt = 0u,
            hprov: Int = 0,
        ): CertSelectStructW =
            CertSelectStructW(
                dwSize = dwSize,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                pTemplateNameCtorArg = pTemplateName,
                dwFlags = dwFlags,
                szTitleCtorArg = szTitle,
                cCertStore = cCertStore,
                arrayCertStoreCtorArg = arrayCertStore,
                szPurposeOidCtorArg = szPurposeOid,
                cCertContext = cCertContext,
                arrayCertContextCtorArg = arrayCertContext,
                lCustData = lCustData,
                pfnHook = pfnHook,
                pfnFilter = pfnFilter,
                szHelpFileNameCtorArg = szHelpFileName,
                dwHelpId = dwHelpId,
                hprov = hprov,
            )
    }
}

public class CertVerifyCertificateTrust internal constructor(
    public var cbSize: UInt,
    pccertCtorArg: ConstPtr<CertContext>,
    public var dwFlags: UInt,
    public var dwIgnoreErr: UInt,
    pdwErrorsCtorArg: MutPtr<UInt>,
    pszUsageOidCtorArg: Pstr,
    public var hprov: Int,
    public var cRootStores: UInt,
    rghstoreRootsCtorArg: MutPtr<Hcertstore>,
    public var cStores: UInt,
    rghstoreCAsCtorArg: MutPtr<Hcertstore>,
    public var cTrustStores: UInt,
    rghstoreTrustCtorArg: MutPtr<Hcertstore>,
    public var lCustData: Lparam,
    public var pfnTrustHelper: Pfntrusthelper,
    pcChainCtorArg: MutPtr<UInt>,
    prgChainCtorArg: MutPtr<MutPtr<MutPtr<CertContext>>>,
    prgdwErrorsCtorArg: MutPtr<MutPtr<UInt>>,
    prgpbTrustInfoCtorArg: MutPtr<MutPtr<CryptIntegerBlob>>,
) {
    public var pccert: ConstPtr<CertContext> = pccertCtorArg
        internal set

    public var pdwErrors: MutPtr<UInt> = pdwErrorsCtorArg
        internal set

    public var pszUsageOid: Pstr = pszUsageOidCtorArg
        internal set

    public var rghstoreRoots: MutPtr<Hcertstore> = rghstoreRootsCtorArg
        internal set

    public var rghstoreCAs: MutPtr<Hcertstore> = rghstoreCAsCtorArg
        internal set

    public var rghstoreTrust: MutPtr<Hcertstore> = rghstoreTrustCtorArg
        internal set

    public var pcChain: MutPtr<UInt> = pcChainCtorArg
        internal set

    public var prgChain: MutPtr<MutPtr<MutPtr<CertContext>>> = prgChainCtorArg
        internal set

    public var prgdwErrors: MutPtr<MutPtr<UInt>> = prgdwErrorsCtorArg
        internal set

    public var prgpbTrustInfo: MutPtr<MutPtr<CryptIntegerBlob>> = prgpbTrustInfoCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pccertCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        dwIgnoreErr = 0u,
        pdwErrorsCtorArg = MutPtr(0L),
        pszUsageOidCtorArg = MutPtr(0L),
        hprov = 0,
        cRootStores = 0u,
        rghstoreRootsCtorArg = MutPtr(0L),
        cStores = 0u,
        rghstoreCAsCtorArg = MutPtr(0L),
        cTrustStores = 0u,
        rghstoreTrustCtorArg = MutPtr(0L),
        lCustData = 0L,
        pfnTrustHelper = null,
        pcChainCtorArg = MutPtr(0L),
        prgChainCtorArg = MutPtr(0L),
        prgdwErrorsCtorArg = MutPtr(0L),
        prgpbTrustInfoCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pccert: ConstPtr<CertContext> = ConstPtr(0L),
            dwFlags: UInt = 0u,
            dwIgnoreErr: UInt = 0u,
            pdwErrors: MutPtr<UInt> = MutPtr(0L),
            pszUsageOid: Pstr = MutPtr(0L),
            hprov: Int = 0,
            cRootStores: UInt = 0u,
            rghstoreRoots: MutPtr<Hcertstore> = MutPtr(0L),
            cStores: UInt = 0u,
            rghstoreCAs: MutPtr<Hcertstore> = MutPtr(0L),
            cTrustStores: UInt = 0u,
            rghstoreTrust: MutPtr<Hcertstore> = MutPtr(0L),
            lCustData: Lparam = 0L,
            pfnTrustHelper: Pfntrusthelper = null,
            pcChain: MutPtr<UInt> = MutPtr(0L),
            prgChain: MutPtr<MutPtr<MutPtr<CertContext>>> = MutPtr(0L),
            prgdwErrors: MutPtr<MutPtr<UInt>> = MutPtr(0L),
            prgpbTrustInfo: MutPtr<MutPtr<CryptIntegerBlob>> = MutPtr(0L),
        ): CertVerifyCertificateTrust =
            CertVerifyCertificateTrust(
                cbSize = cbSize,
                pccertCtorArg = pccert,
                dwFlags = dwFlags,
                dwIgnoreErr = dwIgnoreErr,
                pdwErrorsCtorArg = pdwErrors,
                pszUsageOidCtorArg = pszUsageOid,
                hprov = hprov,
                cRootStores = cRootStores,
                rghstoreRootsCtorArg = rghstoreRoots,
                cStores = cStores,
                rghstoreCAsCtorArg = rghstoreCAs,
                cTrustStores = cTrustStores,
                rghstoreTrustCtorArg = rghstoreTrust,
                lCustData = lCustData,
                pfnTrustHelper = pfnTrustHelper,
                pcChainCtorArg = pcChain,
                prgChainCtorArg = prgChain,
                prgdwErrorsCtorArg = prgdwErrors,
                prgpbTrustInfoCtorArg = prgpbTrustInfo,
            )
    }
}

public class CertViewpropertiesStructA internal constructor(
    public var dwSize: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var dwFlags: CertViewpropertiesStructFlags,
    szTitleCtorArg: Pcstr,
    pCertContextCtorArg: ConstPtr<CertContext>,
    arrayPurposesCtorArg: MutPtr<Pstr>,
    public var cArrayPurposes: UInt,
    public var cRootStores: UInt,
    rghstoreRootsCtorArg: MutPtr<Hcertstore>,
    public var cStores: UInt,
    rghstoreCAsCtorArg: MutPtr<Hcertstore>,
    public var cTrustStores: UInt,
    rghstoreTrustCtorArg: MutPtr<Hcertstore>,
    public var hprov: Int,
    public var lCustData: Lparam,
    public var dwPad: UInt,
    szHelpFileNameCtorArg: Pcstr,
    public var dwHelpId: UInt,
    public var nStartPage: UInt,
    public var cArrayPropSheetPages: UInt,
    arrayPropSheetPagesCtorArg: MutPtr<Propsheetpagea>,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var szTitle: Pcstr = szTitleCtorArg
        internal set

    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var arrayPurposes: MutPtr<Pstr> = arrayPurposesCtorArg
        internal set

    public var rghstoreRoots: MutPtr<Hcertstore> = rghstoreRootsCtorArg
        internal set

    public var rghstoreCAs: MutPtr<Hcertstore> = rghstoreCAsCtorArg
        internal set

    public var rghstoreTrust: MutPtr<Hcertstore> = rghstoreTrustCtorArg
        internal set

    public var szHelpFileName: Pcstr = szHelpFileNameCtorArg
        internal set

    public var arrayPropSheetPages: MutPtr<Propsheetpagea> = arrayPropSheetPagesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        dwFlags = 0u,
        szTitleCtorArg = ConstPtr(0L),
        pCertContextCtorArg = ConstPtr(0L),
        arrayPurposesCtorArg = MutPtr(0L),
        cArrayPurposes = 0u,
        cRootStores = 0u,
        rghstoreRootsCtorArg = MutPtr(0L),
        cStores = 0u,
        rghstoreCAsCtorArg = MutPtr(0L),
        cTrustStores = 0u,
        rghstoreTrustCtorArg = MutPtr(0L),
        hprov = 0,
        lCustData = 0L,
        dwPad = 0u,
        szHelpFileNameCtorArg = ConstPtr(0L),
        dwHelpId = 0u,
        nStartPage = 0u,
        cArrayPropSheetPages = 0u,
        arrayPropSheetPagesCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            dwFlags: CertViewpropertiesStructFlags = 0u,
            szTitle: Pcstr = ConstPtr(0L),
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            arrayPurposes: MutPtr<Pstr> = MutPtr(0L),
            cArrayPurposes: UInt = 0u,
            cRootStores: UInt = 0u,
            rghstoreRoots: MutPtr<Hcertstore> = MutPtr(0L),
            cStores: UInt = 0u,
            rghstoreCAs: MutPtr<Hcertstore> = MutPtr(0L),
            cTrustStores: UInt = 0u,
            rghstoreTrust: MutPtr<Hcertstore> = MutPtr(0L),
            hprov: Int = 0,
            lCustData: Lparam = 0L,
            dwPad: UInt = 0u,
            szHelpFileName: Pcstr = ConstPtr(0L),
            dwHelpId: UInt = 0u,
            nStartPage: UInt = 0u,
            cArrayPropSheetPages: UInt = 0u,
            arrayPropSheetPages: MutPtr<Propsheetpagea> = MutPtr(0L),
        ): CertViewpropertiesStructA =
            CertViewpropertiesStructA(
                dwSize = dwSize,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                dwFlags = dwFlags,
                szTitleCtorArg = szTitle,
                pCertContextCtorArg = pCertContext,
                arrayPurposesCtorArg = arrayPurposes,
                cArrayPurposes = cArrayPurposes,
                cRootStores = cRootStores,
                rghstoreRootsCtorArg = rghstoreRoots,
                cStores = cStores,
                rghstoreCAsCtorArg = rghstoreCAs,
                cTrustStores = cTrustStores,
                rghstoreTrustCtorArg = rghstoreTrust,
                hprov = hprov,
                lCustData = lCustData,
                dwPad = dwPad,
                szHelpFileNameCtorArg = szHelpFileName,
                dwHelpId = dwHelpId,
                nStartPage = nStartPage,
                cArrayPropSheetPages = cArrayPropSheetPages,
                arrayPropSheetPagesCtorArg = arrayPropSheetPages,
            )
    }
}

public class CertViewpropertiesStructW internal constructor(
    public var dwSize: UInt,
    hwndParentCtorArg: Hwnd,
    hInstanceCtorArg: Hinstance,
    public var dwFlags: CertViewpropertiesStructFlags,
    szTitleCtorArg: Pcwstr,
    pCertContextCtorArg: ConstPtr<CertContext>,
    arrayPurposesCtorArg: MutPtr<Pstr>,
    public var cArrayPurposes: UInt,
    public var cRootStores: UInt,
    rghstoreRootsCtorArg: MutPtr<Hcertstore>,
    public var cStores: UInt,
    rghstoreCAsCtorArg: MutPtr<Hcertstore>,
    public var cTrustStores: UInt,
    rghstoreTrustCtorArg: MutPtr<Hcertstore>,
    public var hprov: Int,
    public var lCustData: Lparam,
    public var dwPad: UInt,
    szHelpFileNameCtorArg: Pcwstr,
    public var dwHelpId: UInt,
    public var nStartPage: UInt,
    public var cArrayPropSheetPages: UInt,
    arrayPropSheetPagesCtorArg: MutPtr<Propsheetpagea>,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var hInstance: Hinstance = hInstanceCtorArg
        internal set

    public var szTitle: Pcwstr = szTitleCtorArg
        internal set

    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var arrayPurposes: MutPtr<Pstr> = arrayPurposesCtorArg
        internal set

    public var rghstoreRoots: MutPtr<Hcertstore> = rghstoreRootsCtorArg
        internal set

    public var rghstoreCAs: MutPtr<Hcertstore> = rghstoreCAsCtorArg
        internal set

    public var rghstoreTrust: MutPtr<Hcertstore> = rghstoreTrustCtorArg
        internal set

    public var szHelpFileName: Pcwstr = szHelpFileNameCtorArg
        internal set

    public var arrayPropSheetPages: MutPtr<Propsheetpagea> = arrayPropSheetPagesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        hInstanceCtorArg = MutPtr(0L),
        dwFlags = 0u,
        szTitleCtorArg = ConstPtr(0L),
        pCertContextCtorArg = ConstPtr(0L),
        arrayPurposesCtorArg = MutPtr(0L),
        cArrayPurposes = 0u,
        cRootStores = 0u,
        rghstoreRootsCtorArg = MutPtr(0L),
        cStores = 0u,
        rghstoreCAsCtorArg = MutPtr(0L),
        cTrustStores = 0u,
        rghstoreTrustCtorArg = MutPtr(0L),
        hprov = 0,
        lCustData = 0L,
        dwPad = 0u,
        szHelpFileNameCtorArg = ConstPtr(0L),
        dwHelpId = 0u,
        nStartPage = 0u,
        cArrayPropSheetPages = 0u,
        arrayPropSheetPagesCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            hInstance: Hinstance = MutPtr(0L),
            dwFlags: CertViewpropertiesStructFlags = 0u,
            szTitle: Pcwstr = ConstPtr(0L),
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            arrayPurposes: MutPtr<Pstr> = MutPtr(0L),
            cArrayPurposes: UInt = 0u,
            cRootStores: UInt = 0u,
            rghstoreRoots: MutPtr<Hcertstore> = MutPtr(0L),
            cStores: UInt = 0u,
            rghstoreCAs: MutPtr<Hcertstore> = MutPtr(0L),
            cTrustStores: UInt = 0u,
            rghstoreTrust: MutPtr<Hcertstore> = MutPtr(0L),
            hprov: Int = 0,
            lCustData: Lparam = 0L,
            dwPad: UInt = 0u,
            szHelpFileName: Pcwstr = ConstPtr(0L),
            dwHelpId: UInt = 0u,
            nStartPage: UInt = 0u,
            cArrayPropSheetPages: UInt = 0u,
            arrayPropSheetPages: MutPtr<Propsheetpagea> = MutPtr(0L),
        ): CertViewpropertiesStructW =
            CertViewpropertiesStructW(
                dwSize = dwSize,
                hwndParentCtorArg = hwndParent,
                hInstanceCtorArg = hInstance,
                dwFlags = dwFlags,
                szTitleCtorArg = szTitle,
                pCertContextCtorArg = pCertContext,
                arrayPurposesCtorArg = arrayPurposes,
                cArrayPurposes = cArrayPurposes,
                cRootStores = cRootStores,
                rghstoreRootsCtorArg = rghstoreRoots,
                cStores = cStores,
                rghstoreCAsCtorArg = rghstoreCAs,
                cTrustStores = cTrustStores,
                rghstoreTrustCtorArg = rghstoreTrust,
                hprov = hprov,
                lCustData = lCustData,
                dwPad = dwPad,
                szHelpFileNameCtorArg = szHelpFileName,
                dwHelpId = dwHelpId,
                nStartPage = nStartPage,
                cArrayPropSheetPages = cArrayPropSheetPages,
                arrayPropSheetPagesCtorArg = arrayPropSheetPages,
            )
    }
}

public class CryptuiCertMgrStruct internal constructor(
    public var dwSize: UInt,
    hwndParentCtorArg: Hwnd,
    public var dwFlags: UInt,
    pwszTitleCtorArg: Pcwstr,
    pszInitUsageOIDCtorArg: Pcstr,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var pwszTitle: Pcwstr = pwszTitleCtorArg
        internal set

    public var pszInitUsageOID: Pcstr = pszInitUsageOIDCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        dwFlags = 0u,
        pwszTitleCtorArg = ConstPtr(0L),
        pszInitUsageOIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hwnd = this.hwndParent

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Pcwstr = this.pwszTitle

    public operator fun component5(): Pcstr = this.pszInitUsageOID

    public fun copy(dwSize: UInt = this.dwSize, hwndParent: Hwnd = this.hwndParent, dwFlags: UInt = this.dwFlags, pwszTitle: Pcwstr = this.pwszTitle, pszInitUsageOID: Pcstr = this.pszInitUsageOID): CryptuiCertMgrStruct = CryptuiCertMgrStruct(dwSize = dwSize, hwndParentCtorArg = hwndParent, dwFlags = dwFlags, pwszTitleCtorArg = pwszTitle, pszInitUsageOIDCtorArg = pszInitUsageOID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiCertMgrStruct) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwszTitle != other.pwszTitle) return false
        if (this.pszInitUsageOID != other.pszInitUsageOID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pwszTitle.hashCode()
        result = 31 * result + this.pszInitUsageOID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            pwszTitle: Pcwstr = ConstPtr(0L),
            pszInitUsageOID: Pcstr = ConstPtr(0L),
        ): CryptuiCertMgrStruct =
            CryptuiCertMgrStruct(
                dwSize = dwSize,
                hwndParentCtorArg = hwndParent,
                dwFlags = dwFlags,
                pwszTitleCtorArg = pwszTitle,
                pszInitUsageOIDCtorArg = pszInitUsageOID,
            )
    }
}

public class CryptuiInitdialogStruct internal constructor(
    public var lParam: Lparam,
    pCertContextCtorArg: ConstPtr<CertContext>,
) {
    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public constructor() : this(
        lParam = 0L,
        pCertContextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Lparam = this.lParam

    public operator fun component2(): ConstPtr<CertContext> = this.pCertContext

    public fun copy(lParam: Lparam = this.lParam, pCertContext: ConstPtr<CertContext> = this.pCertContext): CryptuiInitdialogStruct = CryptuiInitdialogStruct(lParam = lParam, pCertContextCtorArg = pCertContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiInitdialogStruct) return false
        if (this.lParam != other.lParam) return false
        if (this.pCertContext != other.pCertContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lParam.hashCode()
        result = 31 * result + this.pCertContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lParam: Lparam = 0L,
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
        ): CryptuiInitdialogStruct =
            CryptuiInitdialogStruct(
                lParam = lParam,
                pCertContextCtorArg = pCertContext,
            )
    }
}

public class CryptuiViewcertificateStructa internal constructor(
    public var dwSize: UInt,
    hwndParentCtorArg: Hwnd,
    public var dwFlags: CryptuiViewcertificateFlags,
    szTitleCtorArg: Pcstr,
    pCertContextCtorArg: ConstPtr<CertContext>,
    rgszPurposesCtorArg: ConstPtr<Pcstr>,
    public var cPurposes: UInt,
    public var anonymous: CryptuiViewcertificateStructa0,
    public var fpCryptProviderDataTrustedUsage: Bool,
    public var idxSigner: UInt,
    public var idxCert: UInt,
    public var fCounterSigner: Bool,
    public var idxCounterSigner: UInt,
    public var cStores: UInt,
    rghStoresCtorArg: MutPtr<Hcertstore>,
    public var cPropSheetPages: UInt,
    rgPropSheetPagesCtorArg: MutPtr<Propsheetpagea>,
    public var nStartPage: UInt,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var szTitle: Pcstr = szTitleCtorArg
        internal set

    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var rgszPurposes: ConstPtr<Pcstr> = rgszPurposesCtorArg
        internal set

    public var rghStores: MutPtr<Hcertstore> = rghStoresCtorArg
        internal set

    public var rgPropSheetPages: MutPtr<Propsheetpagea> = rgPropSheetPagesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        dwFlags = 0u,
        szTitleCtorArg = ConstPtr(0L),
        pCertContextCtorArg = ConstPtr(0L),
        rgszPurposesCtorArg = ConstPtr(0L),
        cPurposes = 0u,
        anonymous = CryptuiViewcertificateStructa0(),
        fpCryptProviderDataTrustedUsage = 0,
        idxSigner = 0u,
        idxCert = 0u,
        fCounterSigner = 0,
        idxCounterSigner = 0u,
        cStores = 0u,
        rghStoresCtorArg = MutPtr(0L),
        cPropSheetPages = 0u,
        rgPropSheetPagesCtorArg = MutPtr(0L),
        nStartPage = 0u,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            dwFlags: CryptuiViewcertificateFlags = 0u,
            szTitle: Pcstr = ConstPtr(0L),
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            rgszPurposes: ConstPtr<Pcstr> = ConstPtr(0L),
            cPurposes: UInt = 0u,
            anonymous: CryptuiViewcertificateStructa0 = CryptuiViewcertificateStructa0(),
            fpCryptProviderDataTrustedUsage: Bool = 0,
            idxSigner: UInt = 0u,
            idxCert: UInt = 0u,
            fCounterSigner: Bool = 0,
            idxCounterSigner: UInt = 0u,
            cStores: UInt = 0u,
            rghStores: MutPtr<Hcertstore> = MutPtr(0L),
            cPropSheetPages: UInt = 0u,
            rgPropSheetPages: MutPtr<Propsheetpagea> = MutPtr(0L),
            nStartPage: UInt = 0u,
        ): CryptuiViewcertificateStructa =
            CryptuiViewcertificateStructa(
                dwSize = dwSize,
                hwndParentCtorArg = hwndParent,
                dwFlags = dwFlags,
                szTitleCtorArg = szTitle,
                pCertContextCtorArg = pCertContext,
                rgszPurposesCtorArg = rgszPurposes,
                cPurposes = cPurposes,
                anonymous = anonymous,
                fpCryptProviderDataTrustedUsage = fpCryptProviderDataTrustedUsage,
                idxSigner = idxSigner,
                idxCert = idxCert,
                fCounterSigner = fCounterSigner,
                idxCounterSigner = idxCounterSigner,
                cStores = cStores,
                rghStoresCtorArg = rghStores,
                cPropSheetPages = cPropSheetPages,
                rgPropSheetPagesCtorArg = rgPropSheetPages,
                nStartPage = nStartPage,
            )
    }
}

public class CryptuiViewcertificateStructa0 internal constructor(
    pCryptProviderDataCtorArg: ConstPtr<CryptProviderData>,
    hWVTStateDataCtorArg: Handle,
) {
    public var pCryptProviderData: ConstPtr<CryptProviderData> = pCryptProviderDataCtorArg
        internal set

    public var hWVTStateData: Handle = hWVTStateDataCtorArg
        internal set

    public constructor() : this(
        pCryptProviderDataCtorArg = ConstPtr(0L),
        hWVTStateDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CryptProviderData> = this.pCryptProviderData

    public operator fun component2(): Handle = this.hWVTStateData

    public fun copy(pCryptProviderData: ConstPtr<CryptProviderData> = this.pCryptProviderData, hWVTStateData: Handle = this.hWVTStateData): CryptuiViewcertificateStructa0 = CryptuiViewcertificateStructa0(pCryptProviderDataCtorArg = pCryptProviderData, hWVTStateDataCtorArg = hWVTStateData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiViewcertificateStructa0) return false
        if (this.pCryptProviderData != other.pCryptProviderData) return false
        if (this.hWVTStateData != other.hWVTStateData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pCryptProviderData.hashCode()
        result = 31 * result + this.hWVTStateData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pCryptProviderData: ConstPtr<CryptProviderData> = ConstPtr(0L),
            hWVTStateData: Handle = MutPtr(0L),
        ): CryptuiViewcertificateStructa0 =
            CryptuiViewcertificateStructa0(
                pCryptProviderDataCtorArg = pCryptProviderData,
                hWVTStateDataCtorArg = hWVTStateData,
            )
    }
}

public class CryptuiViewcertificateStructw internal constructor(
    public var dwSize: UInt,
    hwndParentCtorArg: Hwnd,
    public var dwFlags: CryptuiViewcertificateFlags,
    szTitleCtorArg: Pcwstr,
    pCertContextCtorArg: ConstPtr<CertContext>,
    rgszPurposesCtorArg: ConstPtr<Pcstr>,
    public var cPurposes: UInt,
    public var anonymous: CryptuiViewcertificateStructw0,
    public var fpCryptProviderDataTrustedUsage: Bool,
    public var idxSigner: UInt,
    public var idxCert: UInt,
    public var fCounterSigner: Bool,
    public var idxCounterSigner: UInt,
    public var cStores: UInt,
    rghStoresCtorArg: MutPtr<Hcertstore>,
    public var cPropSheetPages: UInt,
    rgPropSheetPagesCtorArg: MutPtr<Propsheetpagew>,
    public var nStartPage: UInt,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var szTitle: Pcwstr = szTitleCtorArg
        internal set

    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var rgszPurposes: ConstPtr<Pcstr> = rgszPurposesCtorArg
        internal set

    public var rghStores: MutPtr<Hcertstore> = rghStoresCtorArg
        internal set

    public var rgPropSheetPages: MutPtr<Propsheetpagew> = rgPropSheetPagesCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        dwFlags = 0u,
        szTitleCtorArg = ConstPtr(0L),
        pCertContextCtorArg = ConstPtr(0L),
        rgszPurposesCtorArg = ConstPtr(0L),
        cPurposes = 0u,
        anonymous = CryptuiViewcertificateStructw0(),
        fpCryptProviderDataTrustedUsage = 0,
        idxSigner = 0u,
        idxCert = 0u,
        fCounterSigner = 0,
        idxCounterSigner = 0u,
        cStores = 0u,
        rghStoresCtorArg = MutPtr(0L),
        cPropSheetPages = 0u,
        rgPropSheetPagesCtorArg = MutPtr(0L),
        nStartPage = 0u,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            dwFlags: CryptuiViewcertificateFlags = 0u,
            szTitle: Pcwstr = ConstPtr(0L),
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            rgszPurposes: ConstPtr<Pcstr> = ConstPtr(0L),
            cPurposes: UInt = 0u,
            anonymous: CryptuiViewcertificateStructw0 = CryptuiViewcertificateStructw0(),
            fpCryptProviderDataTrustedUsage: Bool = 0,
            idxSigner: UInt = 0u,
            idxCert: UInt = 0u,
            fCounterSigner: Bool = 0,
            idxCounterSigner: UInt = 0u,
            cStores: UInt = 0u,
            rghStores: MutPtr<Hcertstore> = MutPtr(0L),
            cPropSheetPages: UInt = 0u,
            rgPropSheetPages: MutPtr<Propsheetpagew> = MutPtr(0L),
            nStartPage: UInt = 0u,
        ): CryptuiViewcertificateStructw =
            CryptuiViewcertificateStructw(
                dwSize = dwSize,
                hwndParentCtorArg = hwndParent,
                dwFlags = dwFlags,
                szTitleCtorArg = szTitle,
                pCertContextCtorArg = pCertContext,
                rgszPurposesCtorArg = rgszPurposes,
                cPurposes = cPurposes,
                anonymous = anonymous,
                fpCryptProviderDataTrustedUsage = fpCryptProviderDataTrustedUsage,
                idxSigner = idxSigner,
                idxCert = idxCert,
                fCounterSigner = fCounterSigner,
                idxCounterSigner = idxCounterSigner,
                cStores = cStores,
                rghStoresCtorArg = rghStores,
                cPropSheetPages = cPropSheetPages,
                rgPropSheetPagesCtorArg = rgPropSheetPages,
                nStartPage = nStartPage,
            )
    }
}

public class CryptuiViewcertificateStructw0 internal constructor(
    pCryptProviderDataCtorArg: ConstPtr<CryptProviderData>,
    hWVTStateDataCtorArg: Handle,
) {
    public var pCryptProviderData: ConstPtr<CryptProviderData> = pCryptProviderDataCtorArg
        internal set

    public var hWVTStateData: Handle = hWVTStateDataCtorArg
        internal set

    public constructor() : this(
        pCryptProviderDataCtorArg = ConstPtr(0L),
        hWVTStateDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CryptProviderData> = this.pCryptProviderData

    public operator fun component2(): Handle = this.hWVTStateData

    public fun copy(pCryptProviderData: ConstPtr<CryptProviderData> = this.pCryptProviderData, hWVTStateData: Handle = this.hWVTStateData): CryptuiViewcertificateStructw0 = CryptuiViewcertificateStructw0(pCryptProviderDataCtorArg = pCryptProviderData, hWVTStateDataCtorArg = hWVTStateData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiViewcertificateStructw0) return false
        if (this.pCryptProviderData != other.pCryptProviderData) return false
        if (this.hWVTStateData != other.hWVTStateData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pCryptProviderData.hashCode()
        result = 31 * result + this.hWVTStateData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pCryptProviderData: ConstPtr<CryptProviderData> = ConstPtr(0L),
            hWVTStateData: Handle = MutPtr(0L),
        ): CryptuiViewcertificateStructw0 =
            CryptuiViewcertificateStructw0(
                pCryptProviderDataCtorArg = pCryptProviderData,
                hWVTStateDataCtorArg = hWVTStateData,
            )
    }
}

public class CryptuiWizDigitalSignBlobInfo internal constructor(
    public var dwSize: UInt,
    pGuidSubjectCtorArg: MutPtr<Guid>,
    public var cbBlob: UInt,
    pbBlobCtorArg: MutPtr<UByte>,
    pwszDisplayNameCtorArg: Pcwstr,
) {
    public var pGuidSubject: MutPtr<Guid> = pGuidSubjectCtorArg
        internal set

    public var pbBlob: MutPtr<UByte> = pbBlobCtorArg
        internal set

    public var pwszDisplayName: Pcwstr = pwszDisplayNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pGuidSubjectCtorArg = MutPtr(0L),
        cbBlob = 0u,
        pbBlobCtorArg = MutPtr(0L),
        pwszDisplayNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MutPtr<Guid> = this.pGuidSubject

    public operator fun component3(): UInt = this.cbBlob

    public operator fun component4(): MutPtr<UByte> = this.pbBlob

    public operator fun component5(): Pcwstr = this.pwszDisplayName

    public fun copy(dwSize: UInt = this.dwSize, pGuidSubject: MutPtr<Guid> = this.pGuidSubject, cbBlob: UInt = this.cbBlob, pbBlob: MutPtr<UByte> = this.pbBlob, pwszDisplayName: Pcwstr = this.pwszDisplayName): CryptuiWizDigitalSignBlobInfo = CryptuiWizDigitalSignBlobInfo(dwSize = dwSize, pGuidSubjectCtorArg = pGuidSubject, cbBlob = cbBlob, pbBlobCtorArg = pbBlob, pwszDisplayNameCtorArg = pwszDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignBlobInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pGuidSubject != other.pGuidSubject) return false
        if (this.cbBlob != other.cbBlob) return false
        if (this.pbBlob != other.pbBlob) return false
        if (this.pwszDisplayName != other.pwszDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pGuidSubject.hashCode()
        result = 31 * result + this.cbBlob.hashCode()
        result = 31 * result + this.pbBlob.hashCode()
        result = 31 * result + this.pwszDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pGuidSubject: MutPtr<Guid> = MutPtr(0L),
            cbBlob: UInt = 0u,
            pbBlob: MutPtr<UByte> = MutPtr(0L),
            pwszDisplayName: Pcwstr = ConstPtr(0L),
        ): CryptuiWizDigitalSignBlobInfo =
            CryptuiWizDigitalSignBlobInfo(
                dwSize = dwSize,
                pGuidSubjectCtorArg = pGuidSubject,
                cbBlob = cbBlob,
                pbBlobCtorArg = pbBlob,
                pwszDisplayNameCtorArg = pwszDisplayName,
            )
    }
}

public class CryptuiWizDigitalSignCertPvkInfo internal constructor(
    public var dwSize: UInt,
    pwszSigningCertFileNameCtorArg: Pwstr,
    public var dwPvkChoice: CryptuiWizDigitalSignPvkOption,
    public var anonymous: CryptuiWizDigitalSignCertPvkInfo0,
) {
    public var pwszSigningCertFileName: Pwstr = pwszSigningCertFileNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pwszSigningCertFileNameCtorArg = MutPtr(0L),
        dwPvkChoice = 0u,
        anonymous = CryptuiWizDigitalSignCertPvkInfo0(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pwszSigningCertFileName

    public operator fun component3(): CryptuiWizDigitalSignPvkOption = this.dwPvkChoice

    public operator fun component4(): CryptuiWizDigitalSignCertPvkInfo0 = this.anonymous

    public fun copy(dwSize: UInt = this.dwSize, pwszSigningCertFileName: Pwstr = this.pwszSigningCertFileName, dwPvkChoice: CryptuiWizDigitalSignPvkOption = this.dwPvkChoice, anonymous: CryptuiWizDigitalSignCertPvkInfo0 = this.anonymous): CryptuiWizDigitalSignCertPvkInfo = CryptuiWizDigitalSignCertPvkInfo(dwSize = dwSize, pwszSigningCertFileNameCtorArg = pwszSigningCertFileName, dwPvkChoice = dwPvkChoice, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignCertPvkInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwszSigningCertFileName != other.pwszSigningCertFileName) return false
        if (this.dwPvkChoice != other.dwPvkChoice) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwszSigningCertFileName.hashCode()
        result = 31 * result + this.dwPvkChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pwszSigningCertFileName: Pwstr = MutPtr(0L),
            dwPvkChoice: CryptuiWizDigitalSignPvkOption = 0u,
            anonymous: CryptuiWizDigitalSignCertPvkInfo0 = CryptuiWizDigitalSignCertPvkInfo0(),
        ): CryptuiWizDigitalSignCertPvkInfo =
            CryptuiWizDigitalSignCertPvkInfo(
                dwSize = dwSize,
                pwszSigningCertFileNameCtorArg = pwszSigningCertFileName,
                dwPvkChoice = dwPvkChoice,
                anonymous = anonymous,
            )
    }
}

public class CryptuiWizDigitalSignCertPvkInfo0 internal constructor(
    pPvkFileInfoCtorArg: MutPtr<CryptuiWizDigitalSignPvkFileInfo>,
    pPvkProvInfoCtorArg: MutPtr<CryptKeyProvInfo>,
) {
    public var pPvkFileInfo: MutPtr<CryptuiWizDigitalSignPvkFileInfo> = pPvkFileInfoCtorArg
        internal set

    public var pPvkProvInfo: MutPtr<CryptKeyProvInfo> = pPvkProvInfoCtorArg
        internal set

    public constructor() : this(
        pPvkFileInfoCtorArg = MutPtr(0L),
        pPvkProvInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CryptuiWizDigitalSignPvkFileInfo> = this.pPvkFileInfo

    public operator fun component2(): MutPtr<CryptKeyProvInfo> = this.pPvkProvInfo

    public fun copy(pPvkFileInfo: MutPtr<CryptuiWizDigitalSignPvkFileInfo> = this.pPvkFileInfo, pPvkProvInfo: MutPtr<CryptKeyProvInfo> = this.pPvkProvInfo): CryptuiWizDigitalSignCertPvkInfo0 = CryptuiWizDigitalSignCertPvkInfo0(pPvkFileInfoCtorArg = pPvkFileInfo, pPvkProvInfoCtorArg = pPvkProvInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignCertPvkInfo0) return false
        if (this.pPvkFileInfo != other.pPvkFileInfo) return false
        if (this.pPvkProvInfo != other.pPvkProvInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPvkFileInfo.hashCode()
        result = 31 * result + this.pPvkProvInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPvkFileInfo: MutPtr<CryptuiWizDigitalSignPvkFileInfo> = MutPtr(0L),
            pPvkProvInfo: MutPtr<CryptKeyProvInfo> = MutPtr(0L),
        ): CryptuiWizDigitalSignCertPvkInfo0 =
            CryptuiWizDigitalSignCertPvkInfo0(
                pPvkFileInfoCtorArg = pPvkFileInfo,
                pPvkProvInfoCtorArg = pPvkProvInfo,
            )
    }
}

public class CryptuiWizDigitalSignContext internal constructor(
    public var dwSize: UInt,
    public var cbBlob: UInt,
    pbBlobCtorArg: MutPtr<UByte>,
) {
    public var pbBlob: MutPtr<UByte> = pbBlobCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        cbBlob = 0u,
        pbBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.cbBlob

    public operator fun component3(): MutPtr<UByte> = this.pbBlob

    public fun copy(dwSize: UInt = this.dwSize, cbBlob: UInt = this.cbBlob, pbBlob: MutPtr<UByte> = this.pbBlob): CryptuiWizDigitalSignContext = CryptuiWizDigitalSignContext(dwSize = dwSize, cbBlob = cbBlob, pbBlobCtorArg = pbBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignContext) return false
        if (this.dwSize != other.dwSize) return false
        if (this.cbBlob != other.cbBlob) return false
        if (this.pbBlob != other.pbBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.cbBlob.hashCode()
        result = 31 * result + this.pbBlob.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptuiWizDigitalSignContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CryptuiWizDigitalSignContext> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CryptuiWizDigitalSignContext =
                    CryptuiWizDigitalSignContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CryptuiWizDigitalSignContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbBlob)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbBlob)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            cbBlob: UInt = 0u,
            pbBlob: MutPtr<UByte> = MutPtr(0L),
        ): CryptuiWizDigitalSignContext =
            CryptuiWizDigitalSignContext(
                dwSize = dwSize,
                cbBlob = cbBlob,
                pbBlobCtorArg = pbBlob,
            )
    }
}

public class CryptuiWizDigitalSignExtendedInfo internal constructor(
    public var dwSize: UInt,
    public var dwAttrFlags: CryptuiWizDigitalSignSigType,
    pwszDescriptionCtorArg: Pcwstr,
    pwszMoreInfoLocationCtorArg: Pcwstr,
    pszHashAlgCtorArg: Pcstr,
    pwszSigningCertDisplayStringCtorArg: Pcwstr,
    hAdditionalCertStoreCtorArg: Hcertstore,
    psAuthenticatedCtorArg: MutPtr<CryptAttributes>,
    psUnauthenticatedCtorArg: MutPtr<CryptAttributes>,
) {
    public var pwszDescription: Pcwstr = pwszDescriptionCtorArg
        internal set

    public var pwszMoreInfoLocation: Pcwstr = pwszMoreInfoLocationCtorArg
        internal set

    public var pszHashAlg: Pcstr = pszHashAlgCtorArg
        internal set

    public var pwszSigningCertDisplayString: Pcwstr = pwszSigningCertDisplayStringCtorArg
        internal set

    public var hAdditionalCertStore: Hcertstore = hAdditionalCertStoreCtorArg
        internal set

    public var psAuthenticated: MutPtr<CryptAttributes> = psAuthenticatedCtorArg
        internal set

    public var psUnauthenticated: MutPtr<CryptAttributes> = psUnauthenticatedCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwAttrFlags = 0u,
        pwszDescriptionCtorArg = ConstPtr(0L),
        pwszMoreInfoLocationCtorArg = ConstPtr(0L),
        pszHashAlgCtorArg = ConstPtr(0L),
        pwszSigningCertDisplayStringCtorArg = ConstPtr(0L),
        hAdditionalCertStoreCtorArg = MutPtr(0L),
        psAuthenticatedCtorArg = MutPtr(0L),
        psUnauthenticatedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): CryptuiWizDigitalSignSigType = this.dwAttrFlags

    public operator fun component3(): Pcwstr = this.pwszDescription

    public operator fun component4(): Pcwstr = this.pwszMoreInfoLocation

    public operator fun component5(): Pcstr = this.pszHashAlg

    public operator fun component6(): Pcwstr = this.pwszSigningCertDisplayString

    public operator fun component7(): Hcertstore = this.hAdditionalCertStore

    public operator fun component8(): MutPtr<CryptAttributes> = this.psAuthenticated

    public operator fun component9(): MutPtr<CryptAttributes> = this.psUnauthenticated

    public fun copy(dwSize: UInt = this.dwSize, dwAttrFlags: CryptuiWizDigitalSignSigType = this.dwAttrFlags, pwszDescription: Pcwstr = this.pwszDescription, pwszMoreInfoLocation: Pcwstr = this.pwszMoreInfoLocation, pszHashAlg: Pcstr = this.pszHashAlg, pwszSigningCertDisplayString: Pcwstr = this.pwszSigningCertDisplayString, hAdditionalCertStore: Hcertstore = this.hAdditionalCertStore, psAuthenticated: MutPtr<CryptAttributes> = this.psAuthenticated, psUnauthenticated: MutPtr<CryptAttributes> = this.psUnauthenticated): CryptuiWizDigitalSignExtendedInfo = CryptuiWizDigitalSignExtendedInfo(dwSize = dwSize, dwAttrFlags = dwAttrFlags, pwszDescriptionCtorArg = pwszDescription, pwszMoreInfoLocationCtorArg = pwszMoreInfoLocation, pszHashAlgCtorArg = pszHashAlg, pwszSigningCertDisplayStringCtorArg = pwszSigningCertDisplayString, hAdditionalCertStoreCtorArg = hAdditionalCertStore, psAuthenticatedCtorArg = psAuthenticated, psUnauthenticatedCtorArg = psUnauthenticated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignExtendedInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwAttrFlags != other.dwAttrFlags) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.pwszMoreInfoLocation != other.pwszMoreInfoLocation) return false
        if (this.pszHashAlg != other.pszHashAlg) return false
        if (this.pwszSigningCertDisplayString != other.pwszSigningCertDisplayString) return false
        if (this.hAdditionalCertStore != other.hAdditionalCertStore) return false
        if (this.psAuthenticated != other.psAuthenticated) return false
        if (this.psUnauthenticated != other.psUnauthenticated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwAttrFlags.hashCode()
        result = 31 * result + this.pwszDescription.hashCode()
        result = 31 * result + this.pwszMoreInfoLocation.hashCode()
        result = 31 * result + this.pszHashAlg.hashCode()
        result = 31 * result + this.pwszSigningCertDisplayString.hashCode()
        result = 31 * result + this.hAdditionalCertStore.hashCode()
        result = 31 * result + this.psAuthenticated.hashCode()
        result = 31 * result + this.psUnauthenticated.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwAttrFlags: CryptuiWizDigitalSignSigType = 0u,
            pwszDescription: Pcwstr = ConstPtr(0L),
            pwszMoreInfoLocation: Pcwstr = ConstPtr(0L),
            pszHashAlg: Pcstr = ConstPtr(0L),
            pwszSigningCertDisplayString: Pcwstr = ConstPtr(0L),
            hAdditionalCertStore: Hcertstore = MutPtr(0L),
            psAuthenticated: MutPtr<CryptAttributes> = MutPtr(0L),
            psUnauthenticated: MutPtr<CryptAttributes> = MutPtr(0L),
        ): CryptuiWizDigitalSignExtendedInfo =
            CryptuiWizDigitalSignExtendedInfo(
                dwSize = dwSize,
                dwAttrFlags = dwAttrFlags,
                pwszDescriptionCtorArg = pwszDescription,
                pwszMoreInfoLocationCtorArg = pwszMoreInfoLocation,
                pszHashAlgCtorArg = pszHashAlg,
                pwszSigningCertDisplayStringCtorArg = pwszSigningCertDisplayString,
                hAdditionalCertStoreCtorArg = hAdditionalCertStore,
                psAuthenticatedCtorArg = psAuthenticated,
                psUnauthenticatedCtorArg = psUnauthenticated,
            )
    }
}

public class CryptuiWizDigitalSignInfo internal constructor(
    public var dwSize: UInt,
    public var dwSubjectChoice: CryptuiWizDigitalSignSubject,
    public var anonymous1: CryptuiWizDigitalSignInfo0,
    public var dwSigningCertChoice: CryptuiWizDigitalSign,
    public var anonymous2: CryptuiWizDigitalSignInfo1,
    pwszTimestampURLCtorArg: Pcwstr,
    public var dwAdditionalCertChoice: CryptuiWizDigitalAdditionalCertChoice,
    pSignExtInfoCtorArg: MutPtr<CryptuiWizDigitalSignExtendedInfo>,
) {
    public var pwszTimestampURL: Pcwstr = pwszTimestampURLCtorArg
        internal set

    public var pSignExtInfo: MutPtr<CryptuiWizDigitalSignExtendedInfo> = pSignExtInfoCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwSubjectChoice = 0u,
        anonymous1 = CryptuiWizDigitalSignInfo0(),
        dwSigningCertChoice = 0u,
        anonymous2 = CryptuiWizDigitalSignInfo1(),
        pwszTimestampURLCtorArg = ConstPtr(0L),
        dwAdditionalCertChoice = 0u,
        pSignExtInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): CryptuiWizDigitalSignSubject = this.dwSubjectChoice

    public operator fun component3(): CryptuiWizDigitalSignInfo0 = this.anonymous1

    public operator fun component4(): CryptuiWizDigitalSign = this.dwSigningCertChoice

    public operator fun component5(): CryptuiWizDigitalSignInfo1 = this.anonymous2

    public operator fun component6(): Pcwstr = this.pwszTimestampURL

    public operator fun component7(): CryptuiWizDigitalAdditionalCertChoice = this.dwAdditionalCertChoice

    public operator fun component8(): MutPtr<CryptuiWizDigitalSignExtendedInfo> = this.pSignExtInfo

    public fun copy(dwSize: UInt = this.dwSize, dwSubjectChoice: CryptuiWizDigitalSignSubject = this.dwSubjectChoice, anonymous1: CryptuiWizDigitalSignInfo0 = this.anonymous1, dwSigningCertChoice: CryptuiWizDigitalSign = this.dwSigningCertChoice, anonymous2: CryptuiWizDigitalSignInfo1 = this.anonymous2, pwszTimestampURL: Pcwstr = this.pwszTimestampURL, dwAdditionalCertChoice: CryptuiWizDigitalAdditionalCertChoice = this.dwAdditionalCertChoice, pSignExtInfo: MutPtr<CryptuiWizDigitalSignExtendedInfo> = this.pSignExtInfo): CryptuiWizDigitalSignInfo = CryptuiWizDigitalSignInfo(dwSize = dwSize, dwSubjectChoice = dwSubjectChoice, anonymous1 = anonymous1, dwSigningCertChoice = dwSigningCertChoice, anonymous2 = anonymous2, pwszTimestampURLCtorArg = pwszTimestampURL, dwAdditionalCertChoice = dwAdditionalCertChoice, pSignExtInfoCtorArg = pSignExtInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSubjectChoice != other.dwSubjectChoice) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.dwSigningCertChoice != other.dwSigningCertChoice) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.pwszTimestampURL != other.pwszTimestampURL) return false
        if (this.dwAdditionalCertChoice != other.dwAdditionalCertChoice) return false
        if (this.pSignExtInfo != other.pSignExtInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwSubjectChoice.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.dwSigningCertChoice.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.pwszTimestampURL.hashCode()
        result = 31 * result + this.dwAdditionalCertChoice.hashCode()
        result = 31 * result + this.pSignExtInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwSubjectChoice: CryptuiWizDigitalSignSubject = 0u,
            anonymous1: CryptuiWizDigitalSignInfo0 = CryptuiWizDigitalSignInfo0(),
            dwSigningCertChoice: CryptuiWizDigitalSign = 0u,
            anonymous2: CryptuiWizDigitalSignInfo1 = CryptuiWizDigitalSignInfo1(),
            pwszTimestampURL: Pcwstr = ConstPtr(0L),
            dwAdditionalCertChoice: CryptuiWizDigitalAdditionalCertChoice = 0u,
            pSignExtInfo: MutPtr<CryptuiWizDigitalSignExtendedInfo> = MutPtr(0L),
        ): CryptuiWizDigitalSignInfo =
            CryptuiWizDigitalSignInfo(
                dwSize = dwSize,
                dwSubjectChoice = dwSubjectChoice,
                anonymous1 = anonymous1,
                dwSigningCertChoice = dwSigningCertChoice,
                anonymous2 = anonymous2,
                pwszTimestampURLCtorArg = pwszTimestampURL,
                dwAdditionalCertChoice = dwAdditionalCertChoice,
                pSignExtInfoCtorArg = pSignExtInfo,
            )
    }
}

public class CryptuiWizDigitalSignInfo0 internal constructor(
    pwszFileNameCtorArg: Pcwstr,
    pSignBlobInfoCtorArg: MutPtr<CryptuiWizDigitalSignBlobInfo>,
) {
    public var pwszFileName: Pcwstr = pwszFileNameCtorArg
        internal set

    public var pSignBlobInfo: MutPtr<CryptuiWizDigitalSignBlobInfo> = pSignBlobInfoCtorArg
        internal set

    public constructor() : this(
        pwszFileNameCtorArg = ConstPtr(0L),
        pSignBlobInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszFileName

    public operator fun component2(): MutPtr<CryptuiWizDigitalSignBlobInfo> = this.pSignBlobInfo

    public fun copy(pwszFileName: Pcwstr = this.pwszFileName, pSignBlobInfo: MutPtr<CryptuiWizDigitalSignBlobInfo> = this.pSignBlobInfo): CryptuiWizDigitalSignInfo0 = CryptuiWizDigitalSignInfo0(pwszFileNameCtorArg = pwszFileName, pSignBlobInfoCtorArg = pSignBlobInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignInfo0) return false
        if (this.pwszFileName != other.pwszFileName) return false
        if (this.pSignBlobInfo != other.pSignBlobInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszFileName.hashCode()
        result = 31 * result + this.pSignBlobInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszFileName: Pcwstr = ConstPtr(0L),
            pSignBlobInfo: MutPtr<CryptuiWizDigitalSignBlobInfo> = MutPtr(0L),
        ): CryptuiWizDigitalSignInfo0 =
            CryptuiWizDigitalSignInfo0(
                pwszFileNameCtorArg = pwszFileName,
                pSignBlobInfoCtorArg = pSignBlobInfo,
            )
    }
}

public class CryptuiWizDigitalSignInfo1 internal constructor(
    pSigningCertContextCtorArg: ConstPtr<CertContext>,
    pSigningCertStoreCtorArg: MutPtr<CryptuiWizDigitalSignStoreInfo>,
    pSigningCertPvkInfoCtorArg: MutPtr<CryptuiWizDigitalSignCertPvkInfo>,
) {
    public var pSigningCertContext: ConstPtr<CertContext> = pSigningCertContextCtorArg
        internal set

    public var pSigningCertStore: MutPtr<CryptuiWizDigitalSignStoreInfo> = pSigningCertStoreCtorArg
        internal set

    public var pSigningCertPvkInfo: MutPtr<CryptuiWizDigitalSignCertPvkInfo> = pSigningCertPvkInfoCtorArg
        internal set

    public constructor() : this(
        pSigningCertContextCtorArg = ConstPtr(0L),
        pSigningCertStoreCtorArg = MutPtr(0L),
        pSigningCertPvkInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CertContext> = this.pSigningCertContext

    public operator fun component2(): MutPtr<CryptuiWizDigitalSignStoreInfo> = this.pSigningCertStore

    public operator fun component3(): MutPtr<CryptuiWizDigitalSignCertPvkInfo> = this.pSigningCertPvkInfo

    public fun copy(pSigningCertContext: ConstPtr<CertContext> = this.pSigningCertContext, pSigningCertStore: MutPtr<CryptuiWizDigitalSignStoreInfo> = this.pSigningCertStore, pSigningCertPvkInfo: MutPtr<CryptuiWizDigitalSignCertPvkInfo> = this.pSigningCertPvkInfo): CryptuiWizDigitalSignInfo1 = CryptuiWizDigitalSignInfo1(pSigningCertContextCtorArg = pSigningCertContext, pSigningCertStoreCtorArg = pSigningCertStore, pSigningCertPvkInfoCtorArg = pSigningCertPvkInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignInfo1) return false
        if (this.pSigningCertContext != other.pSigningCertContext) return false
        if (this.pSigningCertStore != other.pSigningCertStore) return false
        if (this.pSigningCertPvkInfo != other.pSigningCertPvkInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSigningCertContext.hashCode()
        result = 31 * result + this.pSigningCertStore.hashCode()
        result = 31 * result + this.pSigningCertPvkInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pSigningCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            pSigningCertStore: MutPtr<CryptuiWizDigitalSignStoreInfo> = MutPtr(0L),
            pSigningCertPvkInfo: MutPtr<CryptuiWizDigitalSignCertPvkInfo> = MutPtr(0L),
        ): CryptuiWizDigitalSignInfo1 =
            CryptuiWizDigitalSignInfo1(
                pSigningCertContextCtorArg = pSigningCertContext,
                pSigningCertStoreCtorArg = pSigningCertStore,
                pSigningCertPvkInfoCtorArg = pSigningCertPvkInfo,
            )
    }
}

public class CryptuiWizDigitalSignPvkFileInfo internal constructor(
    public var dwSize: UInt,
    pwszPvkFileNameCtorArg: Pwstr,
    pwszProvNameCtorArg: Pwstr,
    public var dwProvType: UInt,
) {
    public var pwszPvkFileName: Pwstr = pwszPvkFileNameCtorArg
        internal set

    public var pwszProvName: Pwstr = pwszProvNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pwszPvkFileNameCtorArg = MutPtr(0L),
        pwszProvNameCtorArg = MutPtr(0L),
        dwProvType = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pwszPvkFileName

    public operator fun component3(): Pwstr = this.pwszProvName

    public operator fun component4(): UInt = this.dwProvType

    public fun copy(dwSize: UInt = this.dwSize, pwszPvkFileName: Pwstr = this.pwszPvkFileName, pwszProvName: Pwstr = this.pwszProvName, dwProvType: UInt = this.dwProvType): CryptuiWizDigitalSignPvkFileInfo = CryptuiWizDigitalSignPvkFileInfo(dwSize = dwSize, pwszPvkFileNameCtorArg = pwszPvkFileName, pwszProvNameCtorArg = pwszProvName, dwProvType = dwProvType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignPvkFileInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwszPvkFileName != other.pwszPvkFileName) return false
        if (this.pwszProvName != other.pwszProvName) return false
        if (this.dwProvType != other.dwProvType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwszPvkFileName.hashCode()
        result = 31 * result + this.pwszProvName.hashCode()
        result = 31 * result + this.dwProvType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pwszPvkFileName: Pwstr = MutPtr(0L),
            pwszProvName: Pwstr = MutPtr(0L),
            dwProvType: UInt = 0u,
        ): CryptuiWizDigitalSignPvkFileInfo =
            CryptuiWizDigitalSignPvkFileInfo(
                dwSize = dwSize,
                pwszPvkFileNameCtorArg = pwszPvkFileName,
                pwszProvNameCtorArg = pwszProvName,
                dwProvType = dwProvType,
            )
    }
}

public class CryptuiWizDigitalSignStoreInfo internal constructor(
    public var dwSize: UInt,
    public var cCertStore: UInt,
    rghCertStoreCtorArg: MutPtr<Hcertstore>,
    public var pFilterCallback: Pfncfilterproc,
    pvCallbackDataCtorArg: MutPtr<CVoid>,
) {
    public var rghCertStore: MutPtr<Hcertstore> = rghCertStoreCtorArg
        internal set

    public var pvCallbackData: MutPtr<CVoid> = pvCallbackDataCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        cCertStore = 0u,
        rghCertStoreCtorArg = MutPtr(0L),
        pFilterCallback = null,
        pvCallbackDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.cCertStore

    public operator fun component3(): MutPtr<Hcertstore> = this.rghCertStore

    public operator fun component4(): Pfncfilterproc = this.pFilterCallback

    public operator fun component5(): MutPtr<CVoid> = this.pvCallbackData

    public fun copy(dwSize: UInt = this.dwSize, cCertStore: UInt = this.cCertStore, rghCertStore: MutPtr<Hcertstore> = this.rghCertStore, pFilterCallback: Pfncfilterproc = this.pFilterCallback, pvCallbackData: MutPtr<CVoid> = this.pvCallbackData): CryptuiWizDigitalSignStoreInfo = CryptuiWizDigitalSignStoreInfo(dwSize = dwSize, cCertStore = cCertStore, rghCertStoreCtorArg = rghCertStore, pFilterCallback = pFilterCallback, pvCallbackDataCtorArg = pvCallbackData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizDigitalSignStoreInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.cCertStore != other.cCertStore) return false
        if (this.rghCertStore != other.rghCertStore) return false
        if (this.pFilterCallback != other.pFilterCallback) return false
        if (this.pvCallbackData != other.pvCallbackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.cCertStore.hashCode()
        result = 31 * result + this.rghCertStore.hashCode()
        result = 31 * result + this.pFilterCallback.hashCode()
        result = 31 * result + this.pvCallbackData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            cCertStore: UInt = 0u,
            rghCertStore: MutPtr<Hcertstore> = MutPtr(0L),
            pFilterCallback: Pfncfilterproc = null,
            pvCallbackData: MutPtr<CVoid> = MutPtr(0L),
        ): CryptuiWizDigitalSignStoreInfo =
            CryptuiWizDigitalSignStoreInfo(
                dwSize = dwSize,
                cCertStore = cCertStore,
                rghCertStoreCtorArg = rghCertStore,
                pFilterCallback = pFilterCallback,
                pvCallbackDataCtorArg = pvCallbackData,
            )
    }
}

public class CryptuiWizExportCertcontextInfo internal constructor(
    public var dwSize: UInt,
    public var dwExportFormat: CryptuiWizExportFormat,
    public var fExportChain: Bool,
    public var fExportPrivateKeys: Bool,
    pwszPasswordCtorArg: Pcwstr,
    public var fStrongEncryption: Bool,
) {
    public var pwszPassword: Pcwstr = pwszPasswordCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwExportFormat = 0u,
        fExportChain = 0,
        fExportPrivateKeys = 0,
        pwszPasswordCtorArg = ConstPtr(0L),
        fStrongEncryption = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): CryptuiWizExportFormat = this.dwExportFormat

    public operator fun component3(): Bool = this.fExportChain

    public operator fun component4(): Bool = this.fExportPrivateKeys

    public operator fun component5(): Pcwstr = this.pwszPassword

    public operator fun component6(): Bool = this.fStrongEncryption

    public fun copy(dwSize: UInt = this.dwSize, dwExportFormat: CryptuiWizExportFormat = this.dwExportFormat, fExportChain: Bool = this.fExportChain, fExportPrivateKeys: Bool = this.fExportPrivateKeys, pwszPassword: Pcwstr = this.pwszPassword, fStrongEncryption: Bool = this.fStrongEncryption): CryptuiWizExportCertcontextInfo = CryptuiWizExportCertcontextInfo(dwSize = dwSize, dwExportFormat = dwExportFormat, fExportChain = fExportChain, fExportPrivateKeys = fExportPrivateKeys, pwszPasswordCtorArg = pwszPassword, fStrongEncryption = fStrongEncryption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizExportCertcontextInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwExportFormat != other.dwExportFormat) return false
        if (this.fExportChain != other.fExportChain) return false
        if (this.fExportPrivateKeys != other.fExportPrivateKeys) return false
        if (this.pwszPassword != other.pwszPassword) return false
        if (this.fStrongEncryption != other.fStrongEncryption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwExportFormat.hashCode()
        result = 31 * result + this.fExportChain.hashCode()
        result = 31 * result + this.fExportPrivateKeys.hashCode()
        result = 31 * result + this.pwszPassword.hashCode()
        result = 31 * result + this.fStrongEncryption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwExportFormat: CryptuiWizExportFormat = 0u,
            fExportChain: Bool = 0,
            fExportPrivateKeys: Bool = 0,
            pwszPassword: Pcwstr = ConstPtr(0L),
            fStrongEncryption: Bool = 0,
        ): CryptuiWizExportCertcontextInfo =
            CryptuiWizExportCertcontextInfo(
                dwSize = dwSize,
                dwExportFormat = dwExportFormat,
                fExportChain = fExportChain,
                fExportPrivateKeys = fExportPrivateKeys,
                pwszPasswordCtorArg = pwszPassword,
                fStrongEncryption = fStrongEncryption,
            )
    }
}

public class CryptuiWizExportInfo internal constructor(
    public var dwSize: UInt,
    pwszExportFileNameCtorArg: Pcwstr,
    public var dwSubjectChoice: CryptuiWizExportSubject,
    public var anonymous: CryptuiWizExportInfo0,
    public var cStores: UInt,
    rghStoresCtorArg: MutPtr<Hcertstore>,
) {
    public var pwszExportFileName: Pcwstr = pwszExportFileNameCtorArg
        internal set

    public var rghStores: MutPtr<Hcertstore> = rghStoresCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pwszExportFileNameCtorArg = ConstPtr(0L),
        dwSubjectChoice = 0u,
        anonymous = CryptuiWizExportInfo0(),
        cStores = 0u,
        rghStoresCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pcwstr = this.pwszExportFileName

    public operator fun component3(): CryptuiWizExportSubject = this.dwSubjectChoice

    public operator fun component4(): CryptuiWizExportInfo0 = this.anonymous

    public operator fun component5(): UInt = this.cStores

    public operator fun component6(): MutPtr<Hcertstore> = this.rghStores

    public fun copy(dwSize: UInt = this.dwSize, pwszExportFileName: Pcwstr = this.pwszExportFileName, dwSubjectChoice: CryptuiWizExportSubject = this.dwSubjectChoice, anonymous: CryptuiWizExportInfo0 = this.anonymous, cStores: UInt = this.cStores, rghStores: MutPtr<Hcertstore> = this.rghStores): CryptuiWizExportInfo = CryptuiWizExportInfo(dwSize = dwSize, pwszExportFileNameCtorArg = pwszExportFileName, dwSubjectChoice = dwSubjectChoice, anonymous = anonymous, cStores = cStores, rghStoresCtorArg = rghStores)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizExportInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pwszExportFileName != other.pwszExportFileName) return false
        if (this.dwSubjectChoice != other.dwSubjectChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.cStores != other.cStores) return false
        if (this.rghStores != other.rghStores) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pwszExportFileName.hashCode()
        result = 31 * result + this.dwSubjectChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.cStores.hashCode()
        result = 31 * result + this.rghStores.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pwszExportFileName: Pcwstr = ConstPtr(0L),
            dwSubjectChoice: CryptuiWizExportSubject = 0u,
            anonymous: CryptuiWizExportInfo0 = CryptuiWizExportInfo0(),
            cStores: UInt = 0u,
            rghStores: MutPtr<Hcertstore> = MutPtr(0L),
        ): CryptuiWizExportInfo =
            CryptuiWizExportInfo(
                dwSize = dwSize,
                pwszExportFileNameCtorArg = pwszExportFileName,
                dwSubjectChoice = dwSubjectChoice,
                anonymous = anonymous,
                cStores = cStores,
                rghStoresCtorArg = rghStores,
            )
    }
}

public class CryptuiWizExportInfo0 internal constructor(
    pCertContextCtorArg: ConstPtr<CertContext>,
    pCTLContextCtorArg: MutPtr<CtlContext>,
    pCRLContextCtorArg: MutPtr<CrlContext>,
    hCertStoreCtorArg: Hcertstore,
) {
    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var pCTLContext: MutPtr<CtlContext> = pCTLContextCtorArg
        internal set

    public var pCRLContext: MutPtr<CrlContext> = pCRLContextCtorArg
        internal set

    public var hCertStore: Hcertstore = hCertStoreCtorArg
        internal set

    public constructor() : this(
        pCertContextCtorArg = ConstPtr(0L),
        pCTLContextCtorArg = MutPtr(0L),
        pCRLContextCtorArg = MutPtr(0L),
        hCertStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CertContext> = this.pCertContext

    public operator fun component2(): MutPtr<CtlContext> = this.pCTLContext

    public operator fun component3(): MutPtr<CrlContext> = this.pCRLContext

    public operator fun component4(): Hcertstore = this.hCertStore

    public fun copy(pCertContext: ConstPtr<CertContext> = this.pCertContext, pCTLContext: MutPtr<CtlContext> = this.pCTLContext, pCRLContext: MutPtr<CrlContext> = this.pCRLContext, hCertStore: Hcertstore = this.hCertStore): CryptuiWizExportInfo0 = CryptuiWizExportInfo0(pCertContextCtorArg = pCertContext, pCTLContextCtorArg = pCTLContext, pCRLContextCtorArg = pCRLContext, hCertStoreCtorArg = hCertStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizExportInfo0) return false
        if (this.pCertContext != other.pCertContext) return false
        if (this.pCTLContext != other.pCTLContext) return false
        if (this.pCRLContext != other.pCRLContext) return false
        if (this.hCertStore != other.hCertStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pCertContext.hashCode()
        result = 31 * result + this.pCTLContext.hashCode()
        result = 31 * result + this.pCRLContext.hashCode()
        result = 31 * result + this.hCertStore.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            pCTLContext: MutPtr<CtlContext> = MutPtr(0L),
            pCRLContext: MutPtr<CrlContext> = MutPtr(0L),
            hCertStore: Hcertstore = MutPtr(0L),
        ): CryptuiWizExportInfo0 =
            CryptuiWizExportInfo0(
                pCertContextCtorArg = pCertContext,
                pCTLContextCtorArg = pCTLContext,
                pCRLContextCtorArg = pCRLContext,
                hCertStoreCtorArg = hCertStore,
            )
    }
}

public class CryptuiWizImportSrcInfo internal constructor(
    public var dwSize: UInt,
    public var dwSubjectChoice: CryptuiWizImportSubjectOption,
    public var anonymous: CryptuiWizImportSrcInfo0,
    public var dwFlags: CryptKeyFlags,
    pwszPasswordCtorArg: Pcwstr,
) {
    public var pwszPassword: Pcwstr = pwszPasswordCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwSubjectChoice = 0u,
        anonymous = CryptuiWizImportSrcInfo0(),
        dwFlags = 0u,
        pwszPasswordCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): CryptuiWizImportSubjectOption = this.dwSubjectChoice

    public operator fun component3(): CryptuiWizImportSrcInfo0 = this.anonymous

    public operator fun component4(): CryptKeyFlags = this.dwFlags

    public operator fun component5(): Pcwstr = this.pwszPassword

    public fun copy(dwSize: UInt = this.dwSize, dwSubjectChoice: CryptuiWizImportSubjectOption = this.dwSubjectChoice, anonymous: CryptuiWizImportSrcInfo0 = this.anonymous, dwFlags: CryptKeyFlags = this.dwFlags, pwszPassword: Pcwstr = this.pwszPassword): CryptuiWizImportSrcInfo = CryptuiWizImportSrcInfo(dwSize = dwSize, dwSubjectChoice = dwSubjectChoice, anonymous = anonymous, dwFlags = dwFlags, pwszPasswordCtorArg = pwszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizImportSrcInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwSubjectChoice != other.dwSubjectChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pwszPassword != other.pwszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwSubjectChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pwszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwSubjectChoice: CryptuiWizImportSubjectOption = 0u,
            anonymous: CryptuiWizImportSrcInfo0 = CryptuiWizImportSrcInfo0(),
            dwFlags: CryptKeyFlags = 0u,
            pwszPassword: Pcwstr = ConstPtr(0L),
        ): CryptuiWizImportSrcInfo =
            CryptuiWizImportSrcInfo(
                dwSize = dwSize,
                dwSubjectChoice = dwSubjectChoice,
                anonymous = anonymous,
                dwFlags = dwFlags,
                pwszPasswordCtorArg = pwszPassword,
            )
    }
}

public class CryptuiWizImportSrcInfo0 internal constructor(
    pwszFileNameCtorArg: Pcwstr,
    pCertContextCtorArg: ConstPtr<CertContext>,
    pCTLContextCtorArg: MutPtr<CtlContext>,
    pCRLContextCtorArg: MutPtr<CrlContext>,
    hCertStoreCtorArg: Hcertstore,
) {
    public var pwszFileName: Pcwstr = pwszFileNameCtorArg
        internal set

    public var pCertContext: ConstPtr<CertContext> = pCertContextCtorArg
        internal set

    public var pCTLContext: MutPtr<CtlContext> = pCTLContextCtorArg
        internal set

    public var pCRLContext: MutPtr<CrlContext> = pCRLContextCtorArg
        internal set

    public var hCertStore: Hcertstore = hCertStoreCtorArg
        internal set

    public constructor() : this(
        pwszFileNameCtorArg = ConstPtr(0L),
        pCertContextCtorArg = ConstPtr(0L),
        pCTLContextCtorArg = MutPtr(0L),
        pCRLContextCtorArg = MutPtr(0L),
        hCertStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszFileName

    public operator fun component2(): ConstPtr<CertContext> = this.pCertContext

    public operator fun component3(): MutPtr<CtlContext> = this.pCTLContext

    public operator fun component4(): MutPtr<CrlContext> = this.pCRLContext

    public operator fun component5(): Hcertstore = this.hCertStore

    public fun copy(pwszFileName: Pcwstr = this.pwszFileName, pCertContext: ConstPtr<CertContext> = this.pCertContext, pCTLContext: MutPtr<CtlContext> = this.pCTLContext, pCRLContext: MutPtr<CrlContext> = this.pCRLContext, hCertStore: Hcertstore = this.hCertStore): CryptuiWizImportSrcInfo0 = CryptuiWizImportSrcInfo0(pwszFileNameCtorArg = pwszFileName, pCertContextCtorArg = pCertContext, pCTLContextCtorArg = pCTLContext, pCRLContextCtorArg = pCRLContext, hCertStoreCtorArg = hCertStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptuiWizImportSrcInfo0) return false
        if (this.pwszFileName != other.pwszFileName) return false
        if (this.pCertContext != other.pCertContext) return false
        if (this.pCTLContext != other.pCTLContext) return false
        if (this.pCRLContext != other.pCRLContext) return false
        if (this.hCertStore != other.hCertStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszFileName.hashCode()
        result = 31 * result + this.pCertContext.hashCode()
        result = 31 * result + this.pCTLContext.hashCode()
        result = 31 * result + this.pCRLContext.hashCode()
        result = 31 * result + this.hCertStore.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszFileName: Pcwstr = ConstPtr(0L),
            pCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            pCTLContext: MutPtr<CtlContext> = MutPtr(0L),
            pCRLContext: MutPtr<CrlContext> = MutPtr(0L),
            hCertStore: Hcertstore = MutPtr(0L),
        ): CryptuiWizImportSrcInfo0 =
            CryptuiWizImportSrcInfo0(
                pwszFileNameCtorArg = pwszFileName,
                pCertContextCtorArg = pCertContext,
                pCTLContextCtorArg = pCTLContext,
                pCRLContextCtorArg = pCRLContext,
                hCertStoreCtorArg = hCertStore,
            )
    }
}

public class CtlModifyRequest internal constructor(
    pccertCtorArg: ConstPtr<CertContext>,
    public var dwOperation: CtlModifyRequestOperation,
    public var dwError: UInt,
) {
    public var pccert: ConstPtr<CertContext> = pccertCtorArg
        internal set

    public constructor() : this(
        pccertCtorArg = ConstPtr(0L),
        dwOperation = 0u,
        dwError = 0u,
    )

    public operator fun component1(): ConstPtr<CertContext> = this.pccert

    public operator fun component2(): CtlModifyRequestOperation = this.dwOperation

    public operator fun component3(): UInt = this.dwError

    public fun copy(pccert: ConstPtr<CertContext> = this.pccert, dwOperation: CtlModifyRequestOperation = this.dwOperation, dwError: UInt = this.dwError): CtlModifyRequest = CtlModifyRequest(pccertCtorArg = pccert, dwOperation = dwOperation, dwError = dwError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlModifyRequest) return false
        if (this.pccert != other.pccert) return false
        if (this.dwOperation != other.dwOperation) return false
        if (this.dwError != other.dwError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pccert.hashCode()
        result = 31 * result + this.dwOperation.hashCode()
        result = 31 * result + this.dwError.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlModifyRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlModifyRequest> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CtlModifyRequest =
                    CtlModifyRequest(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CertContext>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CtlModifyRequest) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CertContext>(64)
                    ).writeNative(addr, value.pccert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOperation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwError)
                }
            }

        public operator fun invoke(
            pccert: ConstPtr<CertContext> = ConstPtr(0L),
            dwOperation: CtlModifyRequestOperation = 0u,
            dwError: UInt = 0u,
        ): CtlModifyRequest =
            CtlModifyRequest(
                pccertCtorArg = pccert,
                dwOperation = dwOperation,
                dwError = dwError,
            )
    }
}
