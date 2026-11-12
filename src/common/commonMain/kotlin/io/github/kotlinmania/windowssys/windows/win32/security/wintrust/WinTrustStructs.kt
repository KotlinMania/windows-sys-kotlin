@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainElement
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainPara
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertStrongSignPara
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertUsageMatch
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CmsgSignerInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAlgorithmIdentifier
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAttributeTypeValue
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptBitBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CtlContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertchainengine
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.SipDispatchInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.SipIndirectData
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.SipSubjectinfo

public class CatMemberinfo internal constructor(
    pwszSubjGuidCtorArg: Pwstr,
    public var dwCertVersion: UInt,
) {
    public var pwszSubjGuid: Pwstr = pwszSubjGuidCtorArg
        internal set

    public constructor() : this(
        pwszSubjGuidCtorArg = MutPtr(0L),
        dwCertVersion = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszSubjGuid

    public operator fun component2(): UInt = this.dwCertVersion

    public fun copy(pwszSubjGuid: Pwstr = this.pwszSubjGuid, dwCertVersion: UInt = this.dwCertVersion): CatMemberinfo = CatMemberinfo(pwszSubjGuidCtorArg = pwszSubjGuid, dwCertVersion = dwCertVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CatMemberinfo) return false
        if (this.pwszSubjGuid != other.pwszSubjGuid) return false
        if (this.dwCertVersion != other.dwCertVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszSubjGuid.hashCode()
        result = 31 * result + this.dwCertVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszSubjGuid: Pwstr = MutPtr(0L),
            dwCertVersion: UInt = 0u,
        ): CatMemberinfo =
            CatMemberinfo(
                pwszSubjGuidCtorArg = pwszSubjGuid,
                dwCertVersion = dwCertVersion,
            )
    }
}

public data class CatMemberinfo2(
    public var subjectGuid: Guid = Guid(),
    public var dwCertVersion: UInt = 0u,
)

public class CatNamevalue internal constructor(
    pwszTagCtorArg: Pwstr,
    public var fdwFlags: UInt,
    public var value: CryptIntegerBlob,
) {
    public var pwszTag: Pwstr = pwszTagCtorArg
        internal set

    public constructor() : this(
        pwszTagCtorArg = MutPtr(0L),
        fdwFlags = 0u,
        value = CryptIntegerBlob(),
    )

    public operator fun component1(): Pwstr = this.pwszTag

    public operator fun component2(): UInt = this.fdwFlags

    public operator fun component3(): CryptIntegerBlob = this.value

    public fun copy(pwszTag: Pwstr = this.pwszTag, fdwFlags: UInt = this.fdwFlags, value: CryptIntegerBlob = this.value): CatNamevalue = CatNamevalue(pwszTagCtorArg = pwszTag, fdwFlags = fdwFlags, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CatNamevalue) return false
        if (this.pwszTag != other.pwszTag) return false
        if (this.fdwFlags != other.fdwFlags) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszTag.hashCode()
        result = 31 * result + this.fdwFlags.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszTag: Pwstr = MutPtr(0L),
            fdwFlags: UInt = 0u,
            value: CryptIntegerBlob = CryptIntegerBlob(),
        ): CatNamevalue =
            CatNamevalue(
                pwszTagCtorArg = pwszTag,
                fdwFlags = fdwFlags,
                value = value,
            )
    }
}

public class ConfigCiProvInfo internal constructor(
    public var cbSize: UInt,
    public var dwPolicies: UInt,
    pPoliciesCtorArg: MutPtr<CryptIntegerBlob>,
    public var result: ConfigCiProvInfoResult,
    public var dwScenario: UInt,
    result2CtorArg: MutPtr<ConfigCiProvInfoResult2>,
) {
    public var pPolicies: MutPtr<CryptIntegerBlob> = pPoliciesCtorArg
        internal set

    public var result2: MutPtr<ConfigCiProvInfoResult2> = result2CtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwPolicies = 0u,
        pPoliciesCtorArg = MutPtr(0L),
        result = ConfigCiProvInfoResult(),
        dwScenario = 0u,
        result2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwPolicies

    public operator fun component3(): MutPtr<CryptIntegerBlob> = this.pPolicies

    public operator fun component4(): ConfigCiProvInfoResult = this.result

    public operator fun component5(): UInt = this.dwScenario

    public operator fun component6(): MutPtr<ConfigCiProvInfoResult2> = this.result2

    public fun copy(cbSize: UInt = this.cbSize, dwPolicies: UInt = this.dwPolicies, pPolicies: MutPtr<CryptIntegerBlob> = this.pPolicies, result: ConfigCiProvInfoResult = this.result, dwScenario: UInt = this.dwScenario, result2: MutPtr<ConfigCiProvInfoResult2> = this.result2): ConfigCiProvInfo = ConfigCiProvInfo(cbSize = cbSize, dwPolicies = dwPolicies, pPoliciesCtorArg = pPolicies, result = result, dwScenario = dwScenario, result2CtorArg = result2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfigCiProvInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwPolicies != other.dwPolicies) return false
        if (this.pPolicies != other.pPolicies) return false
        if (this.result != other.result) return false
        if (this.dwScenario != other.dwScenario) return false
        if (this.result2 != other.result2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwPolicies.hashCode()
        result = 31 * result + this.pPolicies.hashCode()
        result = 31 * result + this.result.hashCode()
        result = 31 * result + this.dwScenario.hashCode()
        result = 31 * result + this.result2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwPolicies: UInt = 0u,
            pPolicies: MutPtr<CryptIntegerBlob> = MutPtr(0L),
            result: ConfigCiProvInfoResult = ConfigCiProvInfoResult(),
            dwScenario: UInt = 0u,
            result2: MutPtr<ConfigCiProvInfoResult2> = MutPtr(0L),
        ): ConfigCiProvInfo =
            ConfigCiProvInfo(
                cbSize = cbSize,
                dwPolicies = dwPolicies,
                pPoliciesCtorArg = pPolicies,
                result = result,
                dwScenario = dwScenario,
                result2CtorArg = result2,
            )
    }
}

public data class ConfigCiProvInfoResult(
    public var hr: Hresult = 0,
    public var dwResult: UInt = 0u,
    public var dwPolicyIndex: UInt = 0u,
    public var fIsExplicitDeny: Boolean = false,
)

public class ConfigCiProvInfoResult2 internal constructor(
    public var cbSize: UInt,
    public var hr: Hresult,
    public var dwResult: UInt,
    public var dwPolicyIndex: UInt,
    public var fIsExplicitDeny: Boolean,
    public var cbCalculatedFileHash: UInt,
    pbCalculatedFileHashCtorArg: MutPtr<UByte>,
) {
    public var pbCalculatedFileHash: MutPtr<UByte> = pbCalculatedFileHashCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hr = 0,
        dwResult = 0u,
        dwPolicyIndex = 0u,
        fIsExplicitDeny = false,
        cbCalculatedFileHash = 0u,
        pbCalculatedFileHashCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hresult = this.hr

    public operator fun component3(): UInt = this.dwResult

    public operator fun component4(): UInt = this.dwPolicyIndex

    public operator fun component5(): Boolean = this.fIsExplicitDeny

    public operator fun component6(): UInt = this.cbCalculatedFileHash

    public operator fun component7(): MutPtr<UByte> = this.pbCalculatedFileHash

    public fun copy(cbSize: UInt = this.cbSize, hr: Hresult = this.hr, dwResult: UInt = this.dwResult, dwPolicyIndex: UInt = this.dwPolicyIndex, fIsExplicitDeny: Boolean = this.fIsExplicitDeny, cbCalculatedFileHash: UInt = this.cbCalculatedFileHash, pbCalculatedFileHash: MutPtr<UByte> = this.pbCalculatedFileHash): ConfigCiProvInfoResult2 = ConfigCiProvInfoResult2(cbSize = cbSize, hr = hr, dwResult = dwResult, dwPolicyIndex = dwPolicyIndex, fIsExplicitDeny = fIsExplicitDeny, cbCalculatedFileHash = cbCalculatedFileHash, pbCalculatedFileHashCtorArg = pbCalculatedFileHash)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfigCiProvInfoResult2) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hr != other.hr) return false
        if (this.dwResult != other.dwResult) return false
        if (this.dwPolicyIndex != other.dwPolicyIndex) return false
        if (this.fIsExplicitDeny != other.fIsExplicitDeny) return false
        if (this.cbCalculatedFileHash != other.cbCalculatedFileHash) return false
        if (this.pbCalculatedFileHash != other.pbCalculatedFileHash) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hr.hashCode()
        result = 31 * result + this.dwResult.hashCode()
        result = 31 * result + this.dwPolicyIndex.hashCode()
        result = 31 * result + this.fIsExplicitDeny.hashCode()
        result = 31 * result + this.cbCalculatedFileHash.hashCode()
        result = 31 * result + this.pbCalculatedFileHash.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hr: Hresult = 0,
            dwResult: UInt = 0u,
            dwPolicyIndex: UInt = 0u,
            fIsExplicitDeny: Boolean = false,
            cbCalculatedFileHash: UInt = 0u,
            pbCalculatedFileHash: MutPtr<UByte> = MutPtr(0L),
        ): ConfigCiProvInfoResult2 =
            ConfigCiProvInfoResult2(
                cbSize = cbSize,
                hr = hr,
                dwResult = dwResult,
                dwPolicyIndex = dwPolicyIndex,
                fIsExplicitDeny = fIsExplicitDeny,
                cbCalculatedFileHash = cbCalculatedFileHash,
                pbCalculatedFileHashCtorArg = pbCalculatedFileHash,
            )
    }
}

public class CryptProviderCert internal constructor(
    public var cbStruct: UInt,
    pCertCtorArg: ConstPtr<CertContext>,
    public var fCommercial: Bool,
    public var fTrustedRoot: Bool,
    public var fSelfSigned: Bool,
    public var fTestCert: Bool,
    public var dwRevokedReason: UInt,
    public var dwConfidence: UInt,
    public var dwError: UInt,
    pTrustListContextCtorArg: MutPtr<CtlContext>,
    public var fTrustListSignerCert: Bool,
    pCtlContextCtorArg: MutPtr<CtlContext>,
    public var dwCtlError: UInt,
    public var fIsCyclic: Bool,
    pChainElementCtorArg: MutPtr<CertChainElement>,
) {
    public var pCert: ConstPtr<CertContext> = pCertCtorArg
        internal set

    public var pTrustListContext: MutPtr<CtlContext> = pTrustListContextCtorArg
        internal set

    public var pCtlContext: MutPtr<CtlContext> = pCtlContextCtorArg
        internal set

    public var pChainElement: MutPtr<CertChainElement> = pChainElementCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pCertCtorArg = ConstPtr(0L),
        fCommercial = 0,
        fTrustedRoot = 0,
        fSelfSigned = 0,
        fTestCert = 0,
        dwRevokedReason = 0u,
        dwConfidence = 0u,
        dwError = 0u,
        pTrustListContextCtorArg = MutPtr(0L),
        fTrustListSignerCert = 0,
        pCtlContextCtorArg = MutPtr(0L),
        dwCtlError = 0u,
        fIsCyclic = 0,
        pChainElementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ConstPtr<CertContext> = this.pCert

    public operator fun component3(): Bool = this.fCommercial

    public operator fun component4(): Bool = this.fTrustedRoot

    public operator fun component5(): Bool = this.fSelfSigned

    public operator fun component6(): Bool = this.fTestCert

    public operator fun component7(): UInt = this.dwRevokedReason

    public operator fun component8(): UInt = this.dwConfidence

    public operator fun component9(): UInt = this.dwError

    public operator fun component10(): MutPtr<CtlContext> = this.pTrustListContext

    public operator fun component11(): Bool = this.fTrustListSignerCert

    public operator fun component12(): MutPtr<CtlContext> = this.pCtlContext

    public operator fun component13(): UInt = this.dwCtlError

    public operator fun component14(): Bool = this.fIsCyclic

    public operator fun component15(): MutPtr<CertChainElement> = this.pChainElement

    public fun copy(cbStruct: UInt = this.cbStruct, pCert: ConstPtr<CertContext> = this.pCert, fCommercial: Bool = this.fCommercial, fTrustedRoot: Bool = this.fTrustedRoot, fSelfSigned: Bool = this.fSelfSigned, fTestCert: Bool = this.fTestCert, dwRevokedReason: UInt = this.dwRevokedReason, dwConfidence: UInt = this.dwConfidence, dwError: UInt = this.dwError, pTrustListContext: MutPtr<CtlContext> = this.pTrustListContext, fTrustListSignerCert: Bool = this.fTrustListSignerCert, pCtlContext: MutPtr<CtlContext> = this.pCtlContext, dwCtlError: UInt = this.dwCtlError, fIsCyclic: Bool = this.fIsCyclic, pChainElement: MutPtr<CertChainElement> = this.pChainElement): CryptProviderCert = CryptProviderCert(cbStruct = cbStruct, pCertCtorArg = pCert, fCommercial = fCommercial, fTrustedRoot = fTrustedRoot, fSelfSigned = fSelfSigned, fTestCert = fTestCert, dwRevokedReason = dwRevokedReason, dwConfidence = dwConfidence, dwError = dwError, pTrustListContextCtorArg = pTrustListContext, fTrustListSignerCert = fTrustListSignerCert, pCtlContextCtorArg = pCtlContext, dwCtlError = dwCtlError, fIsCyclic = fIsCyclic, pChainElementCtorArg = pChainElement)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderCert) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pCert != other.pCert) return false
        if (this.fCommercial != other.fCommercial) return false
        if (this.fTrustedRoot != other.fTrustedRoot) return false
        if (this.fSelfSigned != other.fSelfSigned) return false
        if (this.fTestCert != other.fTestCert) return false
        if (this.dwRevokedReason != other.dwRevokedReason) return false
        if (this.dwConfidence != other.dwConfidence) return false
        if (this.dwError != other.dwError) return false
        if (this.pTrustListContext != other.pTrustListContext) return false
        if (this.fTrustListSignerCert != other.fTrustListSignerCert) return false
        if (this.pCtlContext != other.pCtlContext) return false
        if (this.dwCtlError != other.dwCtlError) return false
        if (this.fIsCyclic != other.fIsCyclic) return false
        if (this.pChainElement != other.pChainElement) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pCert.hashCode()
        result = 31 * result + this.fCommercial.hashCode()
        result = 31 * result + this.fTrustedRoot.hashCode()
        result = 31 * result + this.fSelfSigned.hashCode()
        result = 31 * result + this.fTestCert.hashCode()
        result = 31 * result + this.dwRevokedReason.hashCode()
        result = 31 * result + this.dwConfidence.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.pTrustListContext.hashCode()
        result = 31 * result + this.fTrustListSignerCert.hashCode()
        result = 31 * result + this.pCtlContext.hashCode()
        result = 31 * result + this.dwCtlError.hashCode()
        result = 31 * result + this.fIsCyclic.hashCode()
        result = 31 * result + this.pChainElement.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pCert: ConstPtr<CertContext> = ConstPtr(0L),
            fCommercial: Bool = 0,
            fTrustedRoot: Bool = 0,
            fSelfSigned: Bool = 0,
            fTestCert: Bool = 0,
            dwRevokedReason: UInt = 0u,
            dwConfidence: UInt = 0u,
            dwError: UInt = 0u,
            pTrustListContext: MutPtr<CtlContext> = MutPtr(0L),
            fTrustListSignerCert: Bool = 0,
            pCtlContext: MutPtr<CtlContext> = MutPtr(0L),
            dwCtlError: UInt = 0u,
            fIsCyclic: Bool = 0,
            pChainElement: MutPtr<CertChainElement> = MutPtr(0L),
        ): CryptProviderCert =
            CryptProviderCert(
                cbStruct = cbStruct,
                pCertCtorArg = pCert,
                fCommercial = fCommercial,
                fTrustedRoot = fTrustedRoot,
                fSelfSigned = fSelfSigned,
                fTestCert = fTestCert,
                dwRevokedReason = dwRevokedReason,
                dwConfidence = dwConfidence,
                dwError = dwError,
                pTrustListContextCtorArg = pTrustListContext,
                fTrustListSignerCert = fTrustListSignerCert,
                pCtlContextCtorArg = pCtlContext,
                dwCtlError = dwCtlError,
                fIsCyclic = fIsCyclic,
                pChainElementCtorArg = pChainElement,
            )
    }
}

public class CryptProviderData internal constructor(
    public var cbStruct: UInt,
    pWintrustDataCtorArg: MutPtr<WintrustData>,
    public var fOpenedFile: Bool,
    hWndParentCtorArg: Hwnd,
    pgActionIDCtorArg: MutPtr<Guid>,
    public var hProv: Int,
    public var dwError: UInt,
    public var dwRegSecuritySettings: UInt,
    public var dwRegPolicySettings: UInt,
    psPfnsCtorArg: MutPtr<CryptProviderFunctions>,
    public var cdwTrustStepErrors: UInt,
    padwTrustStepErrorsCtorArg: MutPtr<UInt>,
    public var chStores: UInt,
    pahStoresCtorArg: MutPtr<Hcertstore>,
    public var dwEncoding: UInt,
    hMsgCtorArg: MutPtr<CVoid>,
    public var csSigners: UInt,
    pasSignersCtorArg: MutPtr<CryptProviderSgnr>,
    public var csProvPrivData: UInt,
    pasProvPrivDataCtorArg: MutPtr<CryptProviderPrivdata>,
    public var dwSubjectChoice: UInt,
    public var anonymous: CryptProviderData0,
    pszUsageOIDCtorArg: Pstr,
    public var fRecallWithState: Bool,
    public var sftSystemTime: Filetime,
    pszCTLSignerUsageOIDCtorArg: Pstr,
    public var dwProvFlags: UInt,
    public var dwFinalError: UInt,
    pRequestUsageCtorArg: MutPtr<CertUsageMatch>,
    public var dwTrustPubSettings: UInt,
    public var dwUIStateFlags: UInt,
    pSigStateCtorArg: MutPtr<CryptProviderSigstate>,
    pSigSettingsCtorArg: MutPtr<WintrustSignatureSettings>,
) {
    public var pWintrustData: MutPtr<WintrustData> = pWintrustDataCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public var pgActionID: MutPtr<Guid> = pgActionIDCtorArg
        internal set

    public var psPfns: MutPtr<CryptProviderFunctions> = psPfnsCtorArg
        internal set

    public var padwTrustStepErrors: MutPtr<UInt> = padwTrustStepErrorsCtorArg
        internal set

    public var pahStores: MutPtr<Hcertstore> = pahStoresCtorArg
        internal set

    public var hMsg: MutPtr<CVoid> = hMsgCtorArg
        internal set

    public var pasSigners: MutPtr<CryptProviderSgnr> = pasSignersCtorArg
        internal set

    public var pasProvPrivData: MutPtr<CryptProviderPrivdata> = pasProvPrivDataCtorArg
        internal set

    public var pszUsageOID: Pstr = pszUsageOIDCtorArg
        internal set

    public var pszCTLSignerUsageOID: Pstr = pszCTLSignerUsageOIDCtorArg
        internal set

    public var pRequestUsage: MutPtr<CertUsageMatch> = pRequestUsageCtorArg
        internal set

    public var pSigState: MutPtr<CryptProviderSigstate> = pSigStateCtorArg
        internal set

    public var pSigSettings: MutPtr<WintrustSignatureSettings> = pSigSettingsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pWintrustDataCtorArg = MutPtr(0L),
        fOpenedFile = 0,
        hWndParentCtorArg = MutPtr(0L),
        pgActionIDCtorArg = MutPtr(0L),
        hProv = 0,
        dwError = 0u,
        dwRegSecuritySettings = 0u,
        dwRegPolicySettings = 0u,
        psPfnsCtorArg = MutPtr(0L),
        cdwTrustStepErrors = 0u,
        padwTrustStepErrorsCtorArg = MutPtr(0L),
        chStores = 0u,
        pahStoresCtorArg = MutPtr(0L),
        dwEncoding = 0u,
        hMsgCtorArg = MutPtr(0L),
        csSigners = 0u,
        pasSignersCtorArg = MutPtr(0L),
        csProvPrivData = 0u,
        pasProvPrivDataCtorArg = MutPtr(0L),
        dwSubjectChoice = 0u,
        anonymous = CryptProviderData0(),
        pszUsageOIDCtorArg = MutPtr(0L),
        fRecallWithState = 0,
        sftSystemTime = Filetime(),
        pszCTLSignerUsageOIDCtorArg = MutPtr(0L),
        dwProvFlags = 0u,
        dwFinalError = 0u,
        pRequestUsageCtorArg = MutPtr(0L),
        dwTrustPubSettings = 0u,
        dwUIStateFlags = 0u,
        pSigStateCtorArg = MutPtr(0L),
        pSigSettingsCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pWintrustData: MutPtr<WintrustData> = MutPtr(0L),
            fOpenedFile: Bool = 0,
            hWndParent: Hwnd = MutPtr(0L),
            pgActionID: MutPtr<Guid> = MutPtr(0L),
            hProv: Int = 0,
            dwError: UInt = 0u,
            dwRegSecuritySettings: UInt = 0u,
            dwRegPolicySettings: UInt = 0u,
            psPfns: MutPtr<CryptProviderFunctions> = MutPtr(0L),
            cdwTrustStepErrors: UInt = 0u,
            padwTrustStepErrors: MutPtr<UInt> = MutPtr(0L),
            chStores: UInt = 0u,
            pahStores: MutPtr<Hcertstore> = MutPtr(0L),
            dwEncoding: UInt = 0u,
            hMsg: MutPtr<CVoid> = MutPtr(0L),
            csSigners: UInt = 0u,
            pasSigners: MutPtr<CryptProviderSgnr> = MutPtr(0L),
            csProvPrivData: UInt = 0u,
            pasProvPrivData: MutPtr<CryptProviderPrivdata> = MutPtr(0L),
            dwSubjectChoice: UInt = 0u,
            anonymous: CryptProviderData0 = CryptProviderData0(),
            pszUsageOID: Pstr = MutPtr(0L),
            fRecallWithState: Bool = 0,
            sftSystemTime: Filetime = Filetime(),
            pszCTLSignerUsageOID: Pstr = MutPtr(0L),
            dwProvFlags: UInt = 0u,
            dwFinalError: UInt = 0u,
            pRequestUsage: MutPtr<CertUsageMatch> = MutPtr(0L),
            dwTrustPubSettings: UInt = 0u,
            dwUIStateFlags: UInt = 0u,
            pSigState: MutPtr<CryptProviderSigstate> = MutPtr(0L),
            pSigSettings: MutPtr<WintrustSignatureSettings> = MutPtr(0L),
        ): CryptProviderData =
            CryptProviderData(
                cbStruct = cbStruct,
                pWintrustDataCtorArg = pWintrustData,
                fOpenedFile = fOpenedFile,
                hWndParentCtorArg = hWndParent,
                pgActionIDCtorArg = pgActionID,
                hProv = hProv,
                dwError = dwError,
                dwRegSecuritySettings = dwRegSecuritySettings,
                dwRegPolicySettings = dwRegPolicySettings,
                psPfnsCtorArg = psPfns,
                cdwTrustStepErrors = cdwTrustStepErrors,
                padwTrustStepErrorsCtorArg = padwTrustStepErrors,
                chStores = chStores,
                pahStoresCtorArg = pahStores,
                dwEncoding = dwEncoding,
                hMsgCtorArg = hMsg,
                csSigners = csSigners,
                pasSignersCtorArg = pasSigners,
                csProvPrivData = csProvPrivData,
                pasProvPrivDataCtorArg = pasProvPrivData,
                dwSubjectChoice = dwSubjectChoice,
                anonymous = anonymous,
                pszUsageOIDCtorArg = pszUsageOID,
                fRecallWithState = fRecallWithState,
                sftSystemTime = sftSystemTime,
                pszCTLSignerUsageOIDCtorArg = pszCTLSignerUsageOID,
                dwProvFlags = dwProvFlags,
                dwFinalError = dwFinalError,
                pRequestUsageCtorArg = pRequestUsage,
                dwTrustPubSettings = dwTrustPubSettings,
                dwUIStateFlags = dwUIStateFlags,
                pSigStateCtorArg = pSigState,
                pSigSettingsCtorArg = pSigSettings,
            )
    }
}

public class CryptProviderData0 internal constructor(
    pPDSipCtorArg: MutPtr<ProvdataSip>,
) {
    public var pPDSip: MutPtr<ProvdataSip> = pPDSipCtorArg
        internal set

    public constructor() : this(
        pPDSipCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<ProvdataSip> = this.pPDSip

    public fun copy(pPDSip: MutPtr<ProvdataSip> = this.pPDSip): CryptProviderData0 = CryptProviderData0(pPDSipCtorArg = pPDSip)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderData0) return false
        if (this.pPDSip != other.pPDSip) return false
        return true
    }

    override fun hashCode(): Int = this.pPDSip.hashCode()

    public companion object {
        public operator fun invoke(
            pPDSip: MutPtr<ProvdataSip> = MutPtr(0L),
        ): CryptProviderData0 =
            CryptProviderData0(
                pPDSipCtorArg = pPDSip,
            )
    }
}

public class CryptProviderDefusage internal constructor(
    public var cbStruct: UInt,
    public var gActionID: Guid,
    pDefPolicyCallbackDataCtorArg: MutPtr<CVoid>,
    pDefSIPClientDataCtorArg: MutPtr<CVoid>,
) {
    public var pDefPolicyCallbackData: MutPtr<CVoid> = pDefPolicyCallbackDataCtorArg
        internal set

    public var pDefSIPClientData: MutPtr<CVoid> = pDefSIPClientDataCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        gActionID = Guid(),
        pDefPolicyCallbackDataCtorArg = MutPtr(0L),
        pDefSIPClientDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Guid = this.gActionID

    public operator fun component3(): MutPtr<CVoid> = this.pDefPolicyCallbackData

    public operator fun component4(): MutPtr<CVoid> = this.pDefSIPClientData

    public fun copy(cbStruct: UInt = this.cbStruct, gActionID: Guid = this.gActionID, pDefPolicyCallbackData: MutPtr<CVoid> = this.pDefPolicyCallbackData, pDefSIPClientData: MutPtr<CVoid> = this.pDefSIPClientData): CryptProviderDefusage = CryptProviderDefusage(cbStruct = cbStruct, gActionID = gActionID, pDefPolicyCallbackDataCtorArg = pDefPolicyCallbackData, pDefSIPClientDataCtorArg = pDefSIPClientData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderDefusage) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.gActionID != other.gActionID) return false
        if (this.pDefPolicyCallbackData != other.pDefPolicyCallbackData) return false
        if (this.pDefSIPClientData != other.pDefSIPClientData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.gActionID.hashCode()
        result = 31 * result + this.pDefPolicyCallbackData.hashCode()
        result = 31 * result + this.pDefSIPClientData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            gActionID: Guid = Guid(),
            pDefPolicyCallbackData: MutPtr<CVoid> = MutPtr(0L),
            pDefSIPClientData: MutPtr<CVoid> = MutPtr(0L),
        ): CryptProviderDefusage =
            CryptProviderDefusage(
                cbStruct = cbStruct,
                gActionID = gActionID,
                pDefPolicyCallbackDataCtorArg = pDefPolicyCallbackData,
                pDefSIPClientDataCtorArg = pDefSIPClientData,
            )
    }
}

public class CryptProviderFunctions internal constructor(
    public var cbStruct: UInt,
    public var pfnAlloc: PfnCpdMemAlloc,
    public var pfnFree: PfnCpdMemFree,
    public var pfnAddStore2Chain: PfnCpdAddStore,
    public var pfnAddSgnr2Chain: PfnCpdAddSgnr,
    public var pfnAddCert2Chain: PfnCpdAddCert,
    public var pfnAddPrivData2Chain: PfnCpdAddPrivdata,
    public var pfnInitialize: PfnProviderInitCall,
    public var pfnObjectTrust: PfnProviderObjtrustCall,
    public var pfnSignatureTrust: PfnProviderSigtrustCall,
    public var pfnCertificateTrust: PfnProviderCerttrustCall,
    public var pfnFinalPolicy: PfnProviderFinalpolicyCall,
    public var pfnCertCheckPolicy: PfnProviderCertchkpolicyCall,
    public var pfnTestFinalPolicy: PfnProviderTestfinalpolicyCall,
    psUIpfnsCtorArg: MutPtr<CryptProvuiFuncs>,
    public var pfnCleanupPolicy: PfnProviderCleanupCall,
) {
    public var psUIpfns: MutPtr<CryptProvuiFuncs> = psUIpfnsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pfnAlloc = null,
        pfnFree = null,
        pfnAddStore2Chain = null,
        pfnAddSgnr2Chain = null,
        pfnAddCert2Chain = null,
        pfnAddPrivData2Chain = null,
        pfnInitialize = null,
        pfnObjectTrust = null,
        pfnSignatureTrust = null,
        pfnCertificateTrust = null,
        pfnFinalPolicy = null,
        pfnCertCheckPolicy = null,
        pfnTestFinalPolicy = null,
        psUIpfnsCtorArg = MutPtr(0L),
        pfnCleanupPolicy = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): PfnCpdMemAlloc = this.pfnAlloc

    public operator fun component3(): PfnCpdMemFree = this.pfnFree

    public operator fun component4(): PfnCpdAddStore = this.pfnAddStore2Chain

    public operator fun component5(): PfnCpdAddSgnr = this.pfnAddSgnr2Chain

    public operator fun component6(): PfnCpdAddCert = this.pfnAddCert2Chain

    public operator fun component7(): PfnCpdAddPrivdata = this.pfnAddPrivData2Chain

    public operator fun component8(): PfnProviderInitCall = this.pfnInitialize

    public operator fun component9(): PfnProviderObjtrustCall = this.pfnObjectTrust

    public operator fun component10(): PfnProviderSigtrustCall = this.pfnSignatureTrust

    public operator fun component11(): PfnProviderCerttrustCall = this.pfnCertificateTrust

    public operator fun component12(): PfnProviderFinalpolicyCall = this.pfnFinalPolicy

    public operator fun component13(): PfnProviderCertchkpolicyCall = this.pfnCertCheckPolicy

    public operator fun component14(): PfnProviderTestfinalpolicyCall = this.pfnTestFinalPolicy

    public operator fun component15(): MutPtr<CryptProvuiFuncs> = this.psUIpfns

    public operator fun component16(): PfnProviderCleanupCall = this.pfnCleanupPolicy

    public fun copy(cbStruct: UInt = this.cbStruct, pfnAlloc: PfnCpdMemAlloc = this.pfnAlloc, pfnFree: PfnCpdMemFree = this.pfnFree, pfnAddStore2Chain: PfnCpdAddStore = this.pfnAddStore2Chain, pfnAddSgnr2Chain: PfnCpdAddSgnr = this.pfnAddSgnr2Chain, pfnAddCert2Chain: PfnCpdAddCert = this.pfnAddCert2Chain, pfnAddPrivData2Chain: PfnCpdAddPrivdata = this.pfnAddPrivData2Chain, pfnInitialize: PfnProviderInitCall = this.pfnInitialize, pfnObjectTrust: PfnProviderObjtrustCall = this.pfnObjectTrust, pfnSignatureTrust: PfnProviderSigtrustCall = this.pfnSignatureTrust, pfnCertificateTrust: PfnProviderCerttrustCall = this.pfnCertificateTrust, pfnFinalPolicy: PfnProviderFinalpolicyCall = this.pfnFinalPolicy, pfnCertCheckPolicy: PfnProviderCertchkpolicyCall = this.pfnCertCheckPolicy, pfnTestFinalPolicy: PfnProviderTestfinalpolicyCall = this.pfnTestFinalPolicy, psUIpfns: MutPtr<CryptProvuiFuncs> = this.psUIpfns, pfnCleanupPolicy: PfnProviderCleanupCall = this.pfnCleanupPolicy): CryptProviderFunctions = CryptProviderFunctions(cbStruct = cbStruct, pfnAlloc = pfnAlloc, pfnFree = pfnFree, pfnAddStore2Chain = pfnAddStore2Chain, pfnAddSgnr2Chain = pfnAddSgnr2Chain, pfnAddCert2Chain = pfnAddCert2Chain, pfnAddPrivData2Chain = pfnAddPrivData2Chain, pfnInitialize = pfnInitialize, pfnObjectTrust = pfnObjectTrust, pfnSignatureTrust = pfnSignatureTrust, pfnCertificateTrust = pfnCertificateTrust, pfnFinalPolicy = pfnFinalPolicy, pfnCertCheckPolicy = pfnCertCheckPolicy, pfnTestFinalPolicy = pfnTestFinalPolicy, psUIpfnsCtorArg = psUIpfns, pfnCleanupPolicy = pfnCleanupPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderFunctions) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pfnAlloc != other.pfnAlloc) return false
        if (this.pfnFree != other.pfnFree) return false
        if (this.pfnAddStore2Chain != other.pfnAddStore2Chain) return false
        if (this.pfnAddSgnr2Chain != other.pfnAddSgnr2Chain) return false
        if (this.pfnAddCert2Chain != other.pfnAddCert2Chain) return false
        if (this.pfnAddPrivData2Chain != other.pfnAddPrivData2Chain) return false
        if (this.pfnInitialize != other.pfnInitialize) return false
        if (this.pfnObjectTrust != other.pfnObjectTrust) return false
        if (this.pfnSignatureTrust != other.pfnSignatureTrust) return false
        if (this.pfnCertificateTrust != other.pfnCertificateTrust) return false
        if (this.pfnFinalPolicy != other.pfnFinalPolicy) return false
        if (this.pfnCertCheckPolicy != other.pfnCertCheckPolicy) return false
        if (this.pfnTestFinalPolicy != other.pfnTestFinalPolicy) return false
        if (this.psUIpfns != other.psUIpfns) return false
        if (this.pfnCleanupPolicy != other.pfnCleanupPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pfnAlloc.hashCode()
        result = 31 * result + this.pfnFree.hashCode()
        result = 31 * result + this.pfnAddStore2Chain.hashCode()
        result = 31 * result + this.pfnAddSgnr2Chain.hashCode()
        result = 31 * result + this.pfnAddCert2Chain.hashCode()
        result = 31 * result + this.pfnAddPrivData2Chain.hashCode()
        result = 31 * result + this.pfnInitialize.hashCode()
        result = 31 * result + this.pfnObjectTrust.hashCode()
        result = 31 * result + this.pfnSignatureTrust.hashCode()
        result = 31 * result + this.pfnCertificateTrust.hashCode()
        result = 31 * result + this.pfnFinalPolicy.hashCode()
        result = 31 * result + this.pfnCertCheckPolicy.hashCode()
        result = 31 * result + this.pfnTestFinalPolicy.hashCode()
        result = 31 * result + this.psUIpfns.hashCode()
        result = 31 * result + this.pfnCleanupPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pfnAlloc: PfnCpdMemAlloc = null,
            pfnFree: PfnCpdMemFree = null,
            pfnAddStore2Chain: PfnCpdAddStore = null,
            pfnAddSgnr2Chain: PfnCpdAddSgnr = null,
            pfnAddCert2Chain: PfnCpdAddCert = null,
            pfnAddPrivData2Chain: PfnCpdAddPrivdata = null,
            pfnInitialize: PfnProviderInitCall = null,
            pfnObjectTrust: PfnProviderObjtrustCall = null,
            pfnSignatureTrust: PfnProviderSigtrustCall = null,
            pfnCertificateTrust: PfnProviderCerttrustCall = null,
            pfnFinalPolicy: PfnProviderFinalpolicyCall = null,
            pfnCertCheckPolicy: PfnProviderCertchkpolicyCall = null,
            pfnTestFinalPolicy: PfnProviderTestfinalpolicyCall = null,
            psUIpfns: MutPtr<CryptProvuiFuncs> = MutPtr(0L),
            pfnCleanupPolicy: PfnProviderCleanupCall = null,
        ): CryptProviderFunctions =
            CryptProviderFunctions(
                cbStruct = cbStruct,
                pfnAlloc = pfnAlloc,
                pfnFree = pfnFree,
                pfnAddStore2Chain = pfnAddStore2Chain,
                pfnAddSgnr2Chain = pfnAddSgnr2Chain,
                pfnAddCert2Chain = pfnAddCert2Chain,
                pfnAddPrivData2Chain = pfnAddPrivData2Chain,
                pfnInitialize = pfnInitialize,
                pfnObjectTrust = pfnObjectTrust,
                pfnSignatureTrust = pfnSignatureTrust,
                pfnCertificateTrust = pfnCertificateTrust,
                pfnFinalPolicy = pfnFinalPolicy,
                pfnCertCheckPolicy = pfnCertCheckPolicy,
                pfnTestFinalPolicy = pfnTestFinalPolicy,
                psUIpfnsCtorArg = psUIpfns,
                pfnCleanupPolicy = pfnCleanupPolicy,
            )
    }
}

public class CryptProviderPrivdata internal constructor(
    public var cbStruct: UInt,
    public var gProviderID: Guid,
    public var cbProvData: UInt,
    pvProvDataCtorArg: MutPtr<CVoid>,
) {
    public var pvProvData: MutPtr<CVoid> = pvProvDataCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        gProviderID = Guid(),
        cbProvData = 0u,
        pvProvDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Guid = this.gProviderID

    public operator fun component3(): UInt = this.cbProvData

    public operator fun component4(): MutPtr<CVoid> = this.pvProvData

    public fun copy(cbStruct: UInt = this.cbStruct, gProviderID: Guid = this.gProviderID, cbProvData: UInt = this.cbProvData, pvProvData: MutPtr<CVoid> = this.pvProvData): CryptProviderPrivdata = CryptProviderPrivdata(cbStruct = cbStruct, gProviderID = gProviderID, cbProvData = cbProvData, pvProvDataCtorArg = pvProvData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderPrivdata) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.gProviderID != other.gProviderID) return false
        if (this.cbProvData != other.cbProvData) return false
        if (this.pvProvData != other.pvProvData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.gProviderID.hashCode()
        result = 31 * result + this.cbProvData.hashCode()
        result = 31 * result + this.pvProvData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            gProviderID: Guid = Guid(),
            cbProvData: UInt = 0u,
            pvProvData: MutPtr<CVoid> = MutPtr(0L),
        ): CryptProviderPrivdata =
            CryptProviderPrivdata(
                cbStruct = cbStruct,
                gProviderID = gProviderID,
                cbProvData = cbProvData,
                pvProvDataCtorArg = pvProvData,
            )
    }
}

public class CryptProviderRegdefusage internal constructor(
    public var cbStruct: UInt,
    pgActionIDCtorArg: MutPtr<Guid>,
    pwszDllNameCtorArg: Pwstr,
    pwszLoadCallbackDataFunctionNameCtorArg: Pstr,
    pwszFreeCallbackDataFunctionNameCtorArg: Pstr,
) {
    public var pgActionID: MutPtr<Guid> = pgActionIDCtorArg
        internal set

    public var pwszDllName: Pwstr = pwszDllNameCtorArg
        internal set

    public var pwszLoadCallbackDataFunctionName: Pstr = pwszLoadCallbackDataFunctionNameCtorArg
        internal set

    public var pwszFreeCallbackDataFunctionName: Pstr = pwszFreeCallbackDataFunctionNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pgActionIDCtorArg = MutPtr(0L),
        pwszDllNameCtorArg = MutPtr(0L),
        pwszLoadCallbackDataFunctionNameCtorArg = MutPtr(0L),
        pwszFreeCallbackDataFunctionNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr<Guid> = this.pgActionID

    public operator fun component3(): Pwstr = this.pwszDllName

    public operator fun component4(): Pstr = this.pwszLoadCallbackDataFunctionName

    public operator fun component5(): Pstr = this.pwszFreeCallbackDataFunctionName

    public fun copy(cbStruct: UInt = this.cbStruct, pgActionID: MutPtr<Guid> = this.pgActionID, pwszDllName: Pwstr = this.pwszDllName, pwszLoadCallbackDataFunctionName: Pstr = this.pwszLoadCallbackDataFunctionName, pwszFreeCallbackDataFunctionName: Pstr = this.pwszFreeCallbackDataFunctionName): CryptProviderRegdefusage = CryptProviderRegdefusage(cbStruct = cbStruct, pgActionIDCtorArg = pgActionID, pwszDllNameCtorArg = pwszDllName, pwszLoadCallbackDataFunctionNameCtorArg = pwszLoadCallbackDataFunctionName, pwszFreeCallbackDataFunctionNameCtorArg = pwszFreeCallbackDataFunctionName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderRegdefusage) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pgActionID != other.pgActionID) return false
        if (this.pwszDllName != other.pwszDllName) return false
        if (this.pwszLoadCallbackDataFunctionName != other.pwszLoadCallbackDataFunctionName) return false
        if (this.pwszFreeCallbackDataFunctionName != other.pwszFreeCallbackDataFunctionName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pgActionID.hashCode()
        result = 31 * result + this.pwszDllName.hashCode()
        result = 31 * result + this.pwszLoadCallbackDataFunctionName.hashCode()
        result = 31 * result + this.pwszFreeCallbackDataFunctionName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pgActionID: MutPtr<Guid> = MutPtr(0L),
            pwszDllName: Pwstr = MutPtr(0L),
            pwszLoadCallbackDataFunctionName: Pstr = MutPtr(0L),
            pwszFreeCallbackDataFunctionName: Pstr = MutPtr(0L),
        ): CryptProviderRegdefusage =
            CryptProviderRegdefusage(
                cbStruct = cbStruct,
                pgActionIDCtorArg = pgActionID,
                pwszDllNameCtorArg = pwszDllName,
                pwszLoadCallbackDataFunctionNameCtorArg = pwszLoadCallbackDataFunctionName,
                pwszFreeCallbackDataFunctionNameCtorArg = pwszFreeCallbackDataFunctionName,
            )
    }
}

public class CryptProviderSgnr internal constructor(
    public var cbStruct: UInt,
    public var sftVerifyAsOf: Filetime,
    public var csCertChain: UInt,
    pasCertChainCtorArg: MutPtr<CryptProviderCert>,
    public var dwSignerType: UInt,
    psSignerCtorArg: MutPtr<CmsgSignerInfo>,
    public var dwError: UInt,
    public var csCounterSigners: UInt,
    pasCounterSignersCtorArg: MutPtr<CryptProviderSgnr>,
    pChainContextCtorArg: MutPtr<CertChainContext>,
) {
    public var pasCertChain: MutPtr<CryptProviderCert> = pasCertChainCtorArg
        internal set

    public var psSigner: MutPtr<CmsgSignerInfo> = psSignerCtorArg
        internal set

    public var pasCounterSigners: MutPtr<CryptProviderSgnr> = pasCounterSignersCtorArg
        internal set

    public var pChainContext: MutPtr<CertChainContext> = pChainContextCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        sftVerifyAsOf = Filetime(),
        csCertChain = 0u,
        pasCertChainCtorArg = MutPtr(0L),
        dwSignerType = 0u,
        psSignerCtorArg = MutPtr(0L),
        dwError = 0u,
        csCounterSigners = 0u,
        pasCounterSignersCtorArg = MutPtr(0L),
        pChainContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Filetime = this.sftVerifyAsOf

    public operator fun component3(): UInt = this.csCertChain

    public operator fun component4(): MutPtr<CryptProviderCert> = this.pasCertChain

    public operator fun component5(): UInt = this.dwSignerType

    public operator fun component6(): MutPtr<CmsgSignerInfo> = this.psSigner

    public operator fun component7(): UInt = this.dwError

    public operator fun component8(): UInt = this.csCounterSigners

    public operator fun component9(): MutPtr<CryptProviderSgnr> = this.pasCounterSigners

    public operator fun component10(): MutPtr<CertChainContext> = this.pChainContext

    public fun copy(cbStruct: UInt = this.cbStruct, sftVerifyAsOf: Filetime = this.sftVerifyAsOf, csCertChain: UInt = this.csCertChain, pasCertChain: MutPtr<CryptProviderCert> = this.pasCertChain, dwSignerType: UInt = this.dwSignerType, psSigner: MutPtr<CmsgSignerInfo> = this.psSigner, dwError: UInt = this.dwError, csCounterSigners: UInt = this.csCounterSigners, pasCounterSigners: MutPtr<CryptProviderSgnr> = this.pasCounterSigners, pChainContext: MutPtr<CertChainContext> = this.pChainContext): CryptProviderSgnr = CryptProviderSgnr(cbStruct = cbStruct, sftVerifyAsOf = sftVerifyAsOf, csCertChain = csCertChain, pasCertChainCtorArg = pasCertChain, dwSignerType = dwSignerType, psSignerCtorArg = psSigner, dwError = dwError, csCounterSigners = csCounterSigners, pasCounterSignersCtorArg = pasCounterSigners, pChainContextCtorArg = pChainContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderSgnr) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.sftVerifyAsOf != other.sftVerifyAsOf) return false
        if (this.csCertChain != other.csCertChain) return false
        if (this.pasCertChain != other.pasCertChain) return false
        if (this.dwSignerType != other.dwSignerType) return false
        if (this.psSigner != other.psSigner) return false
        if (this.dwError != other.dwError) return false
        if (this.csCounterSigners != other.csCounterSigners) return false
        if (this.pasCounterSigners != other.pasCounterSigners) return false
        if (this.pChainContext != other.pChainContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.sftVerifyAsOf.hashCode()
        result = 31 * result + this.csCertChain.hashCode()
        result = 31 * result + this.pasCertChain.hashCode()
        result = 31 * result + this.dwSignerType.hashCode()
        result = 31 * result + this.psSigner.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.csCounterSigners.hashCode()
        result = 31 * result + this.pasCounterSigners.hashCode()
        result = 31 * result + this.pChainContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            sftVerifyAsOf: Filetime = Filetime(),
            csCertChain: UInt = 0u,
            pasCertChain: MutPtr<CryptProviderCert> = MutPtr(0L),
            dwSignerType: UInt = 0u,
            psSigner: MutPtr<CmsgSignerInfo> = MutPtr(0L),
            dwError: UInt = 0u,
            csCounterSigners: UInt = 0u,
            pasCounterSigners: MutPtr<CryptProviderSgnr> = MutPtr(0L),
            pChainContext: MutPtr<CertChainContext> = MutPtr(0L),
        ): CryptProviderSgnr =
            CryptProviderSgnr(
                cbStruct = cbStruct,
                sftVerifyAsOf = sftVerifyAsOf,
                csCertChain = csCertChain,
                pasCertChainCtorArg = pasCertChain,
                dwSignerType = dwSignerType,
                psSignerCtorArg = psSigner,
                dwError = dwError,
                csCounterSigners = csCounterSigners,
                pasCounterSignersCtorArg = pasCounterSigners,
                pChainContextCtorArg = pChainContext,
            )
    }
}

public class CryptProviderSigstate internal constructor(
    public var cbStruct: UInt,
    rhSecondarySigsCtorArg: MutPtr<MutPtr<CVoid>>,
    hPrimarySigCtorArg: MutPtr<CVoid>,
    public var fFirstAttemptMade: Bool,
    public var fNoMoreSigs: Bool,
    public var cSecondarySigs: UInt,
    public var dwCurrentIndex: UInt,
    public var fSupportMultiSig: Bool,
    public var dwCryptoPolicySupport: UInt,
    public var iAttemptCount: UInt,
    public var fCheckedSealing: Bool,
    pSealingSignatureCtorArg: MutPtr<SealingSignatureAttribute>,
) {
    public var rhSecondarySigs: MutPtr<MutPtr<CVoid>> = rhSecondarySigsCtorArg
        internal set

    public var hPrimarySig: MutPtr<CVoid> = hPrimarySigCtorArg
        internal set

    public var pSealingSignature: MutPtr<SealingSignatureAttribute> = pSealingSignatureCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        rhSecondarySigsCtorArg = MutPtr(0L),
        hPrimarySigCtorArg = MutPtr(0L),
        fFirstAttemptMade = 0,
        fNoMoreSigs = 0,
        cSecondarySigs = 0u,
        dwCurrentIndex = 0u,
        fSupportMultiSig = 0,
        dwCryptoPolicySupport = 0u,
        iAttemptCount = 0u,
        fCheckedSealing = 0,
        pSealingSignatureCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr<MutPtr<CVoid>> = this.rhSecondarySigs

    public operator fun component3(): MutPtr<CVoid> = this.hPrimarySig

    public operator fun component4(): Bool = this.fFirstAttemptMade

    public operator fun component5(): Bool = this.fNoMoreSigs

    public operator fun component6(): UInt = this.cSecondarySigs

    public operator fun component7(): UInt = this.dwCurrentIndex

    public operator fun component8(): Bool = this.fSupportMultiSig

    public operator fun component9(): UInt = this.dwCryptoPolicySupport

    public operator fun component10(): UInt = this.iAttemptCount

    public operator fun component11(): Bool = this.fCheckedSealing

    public operator fun component12(): MutPtr<SealingSignatureAttribute> = this.pSealingSignature

    public fun copy(cbStruct: UInt = this.cbStruct, rhSecondarySigs: MutPtr<MutPtr<CVoid>> = this.rhSecondarySigs, hPrimarySig: MutPtr<CVoid> = this.hPrimarySig, fFirstAttemptMade: Bool = this.fFirstAttemptMade, fNoMoreSigs: Bool = this.fNoMoreSigs, cSecondarySigs: UInt = this.cSecondarySigs, dwCurrentIndex: UInt = this.dwCurrentIndex, fSupportMultiSig: Bool = this.fSupportMultiSig, dwCryptoPolicySupport: UInt = this.dwCryptoPolicySupport, iAttemptCount: UInt = this.iAttemptCount, fCheckedSealing: Bool = this.fCheckedSealing, pSealingSignature: MutPtr<SealingSignatureAttribute> = this.pSealingSignature): CryptProviderSigstate = CryptProviderSigstate(cbStruct = cbStruct, rhSecondarySigsCtorArg = rhSecondarySigs, hPrimarySigCtorArg = hPrimarySig, fFirstAttemptMade = fFirstAttemptMade, fNoMoreSigs = fNoMoreSigs, cSecondarySigs = cSecondarySigs, dwCurrentIndex = dwCurrentIndex, fSupportMultiSig = fSupportMultiSig, dwCryptoPolicySupport = dwCryptoPolicySupport, iAttemptCount = iAttemptCount, fCheckedSealing = fCheckedSealing, pSealingSignatureCtorArg = pSealingSignature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProviderSigstate) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.rhSecondarySigs != other.rhSecondarySigs) return false
        if (this.hPrimarySig != other.hPrimarySig) return false
        if (this.fFirstAttemptMade != other.fFirstAttemptMade) return false
        if (this.fNoMoreSigs != other.fNoMoreSigs) return false
        if (this.cSecondarySigs != other.cSecondarySigs) return false
        if (this.dwCurrentIndex != other.dwCurrentIndex) return false
        if (this.fSupportMultiSig != other.fSupportMultiSig) return false
        if (this.dwCryptoPolicySupport != other.dwCryptoPolicySupport) return false
        if (this.iAttemptCount != other.iAttemptCount) return false
        if (this.fCheckedSealing != other.fCheckedSealing) return false
        if (this.pSealingSignature != other.pSealingSignature) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.rhSecondarySigs.hashCode()
        result = 31 * result + this.hPrimarySig.hashCode()
        result = 31 * result + this.fFirstAttemptMade.hashCode()
        result = 31 * result + this.fNoMoreSigs.hashCode()
        result = 31 * result + this.cSecondarySigs.hashCode()
        result = 31 * result + this.dwCurrentIndex.hashCode()
        result = 31 * result + this.fSupportMultiSig.hashCode()
        result = 31 * result + this.dwCryptoPolicySupport.hashCode()
        result = 31 * result + this.iAttemptCount.hashCode()
        result = 31 * result + this.fCheckedSealing.hashCode()
        result = 31 * result + this.pSealingSignature.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            rhSecondarySigs: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            hPrimarySig: MutPtr<CVoid> = MutPtr(0L),
            fFirstAttemptMade: Bool = 0,
            fNoMoreSigs: Bool = 0,
            cSecondarySigs: UInt = 0u,
            dwCurrentIndex: UInt = 0u,
            fSupportMultiSig: Bool = 0,
            dwCryptoPolicySupport: UInt = 0u,
            iAttemptCount: UInt = 0u,
            fCheckedSealing: Bool = 0,
            pSealingSignature: MutPtr<SealingSignatureAttribute> = MutPtr(0L),
        ): CryptProviderSigstate =
            CryptProviderSigstate(
                cbStruct = cbStruct,
                rhSecondarySigsCtorArg = rhSecondarySigs,
                hPrimarySigCtorArg = hPrimarySig,
                fFirstAttemptMade = fFirstAttemptMade,
                fNoMoreSigs = fNoMoreSigs,
                cSecondarySigs = cSecondarySigs,
                dwCurrentIndex = dwCurrentIndex,
                fSupportMultiSig = fSupportMultiSig,
                dwCryptoPolicySupport = dwCryptoPolicySupport,
                iAttemptCount = iAttemptCount,
                fCheckedSealing = fCheckedSealing,
                pSealingSignatureCtorArg = pSealingSignature,
            )
    }
}

public class CryptProvuiData internal constructor(
    public var cbStruct: UInt,
    public var dwFinalError: UInt,
    pYesButtonTextCtorArg: Pwstr,
    pNoButtonTextCtorArg: Pwstr,
    pMoreInfoButtonTextCtorArg: Pwstr,
    pAdvancedLinkTextCtorArg: Pwstr,
    pCopyActionTextCtorArg: Pwstr,
    pCopyActionTextNoTSCtorArg: Pwstr,
    pCopyActionTextNotSignedCtorArg: Pwstr,
) {
    public var pYesButtonText: Pwstr = pYesButtonTextCtorArg
        internal set

    public var pNoButtonText: Pwstr = pNoButtonTextCtorArg
        internal set

    public var pMoreInfoButtonText: Pwstr = pMoreInfoButtonTextCtorArg
        internal set

    public var pAdvancedLinkText: Pwstr = pAdvancedLinkTextCtorArg
        internal set

    public var pCopyActionText: Pwstr = pCopyActionTextCtorArg
        internal set

    public var pCopyActionTextNoTS: Pwstr = pCopyActionTextNoTSCtorArg
        internal set

    public var pCopyActionTextNotSigned: Pwstr = pCopyActionTextNotSignedCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwFinalError = 0u,
        pYesButtonTextCtorArg = MutPtr(0L),
        pNoButtonTextCtorArg = MutPtr(0L),
        pMoreInfoButtonTextCtorArg = MutPtr(0L),
        pAdvancedLinkTextCtorArg = MutPtr(0L),
        pCopyActionTextCtorArg = MutPtr(0L),
        pCopyActionTextNoTSCtorArg = MutPtr(0L),
        pCopyActionTextNotSignedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwFinalError

    public operator fun component3(): Pwstr = this.pYesButtonText

    public operator fun component4(): Pwstr = this.pNoButtonText

    public operator fun component5(): Pwstr = this.pMoreInfoButtonText

    public operator fun component6(): Pwstr = this.pAdvancedLinkText

    public operator fun component7(): Pwstr = this.pCopyActionText

    public operator fun component8(): Pwstr = this.pCopyActionTextNoTS

    public operator fun component9(): Pwstr = this.pCopyActionTextNotSigned

    public fun copy(cbStruct: UInt = this.cbStruct, dwFinalError: UInt = this.dwFinalError, pYesButtonText: Pwstr = this.pYesButtonText, pNoButtonText: Pwstr = this.pNoButtonText, pMoreInfoButtonText: Pwstr = this.pMoreInfoButtonText, pAdvancedLinkText: Pwstr = this.pAdvancedLinkText, pCopyActionText: Pwstr = this.pCopyActionText, pCopyActionTextNoTS: Pwstr = this.pCopyActionTextNoTS, pCopyActionTextNotSigned: Pwstr = this.pCopyActionTextNotSigned): CryptProvuiData = CryptProvuiData(cbStruct = cbStruct, dwFinalError = dwFinalError, pYesButtonTextCtorArg = pYesButtonText, pNoButtonTextCtorArg = pNoButtonText, pMoreInfoButtonTextCtorArg = pMoreInfoButtonText, pAdvancedLinkTextCtorArg = pAdvancedLinkText, pCopyActionTextCtorArg = pCopyActionText, pCopyActionTextNoTSCtorArg = pCopyActionTextNoTS, pCopyActionTextNotSignedCtorArg = pCopyActionTextNotSigned)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProvuiData) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFinalError != other.dwFinalError) return false
        if (this.pYesButtonText != other.pYesButtonText) return false
        if (this.pNoButtonText != other.pNoButtonText) return false
        if (this.pMoreInfoButtonText != other.pMoreInfoButtonText) return false
        if (this.pAdvancedLinkText != other.pAdvancedLinkText) return false
        if (this.pCopyActionText != other.pCopyActionText) return false
        if (this.pCopyActionTextNoTS != other.pCopyActionTextNoTS) return false
        if (this.pCopyActionTextNotSigned != other.pCopyActionTextNotSigned) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFinalError.hashCode()
        result = 31 * result + this.pYesButtonText.hashCode()
        result = 31 * result + this.pNoButtonText.hashCode()
        result = 31 * result + this.pMoreInfoButtonText.hashCode()
        result = 31 * result + this.pAdvancedLinkText.hashCode()
        result = 31 * result + this.pCopyActionText.hashCode()
        result = 31 * result + this.pCopyActionTextNoTS.hashCode()
        result = 31 * result + this.pCopyActionTextNotSigned.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwFinalError: UInt = 0u,
            pYesButtonText: Pwstr = MutPtr(0L),
            pNoButtonText: Pwstr = MutPtr(0L),
            pMoreInfoButtonText: Pwstr = MutPtr(0L),
            pAdvancedLinkText: Pwstr = MutPtr(0L),
            pCopyActionText: Pwstr = MutPtr(0L),
            pCopyActionTextNoTS: Pwstr = MutPtr(0L),
            pCopyActionTextNotSigned: Pwstr = MutPtr(0L),
        ): CryptProvuiData =
            CryptProvuiData(
                cbStruct = cbStruct,
                dwFinalError = dwFinalError,
                pYesButtonTextCtorArg = pYesButtonText,
                pNoButtonTextCtorArg = pNoButtonText,
                pMoreInfoButtonTextCtorArg = pMoreInfoButtonText,
                pAdvancedLinkTextCtorArg = pAdvancedLinkText,
                pCopyActionTextCtorArg = pCopyActionText,
                pCopyActionTextNoTSCtorArg = pCopyActionTextNoTS,
                pCopyActionTextNotSignedCtorArg = pCopyActionTextNotSigned,
            )
    }
}

public class CryptProvuiFuncs internal constructor(
    public var cbStruct: UInt,
    psUIDataCtorArg: MutPtr<CryptProvuiData>,
    public var pfnOnMoreInfoClick: PfnProvuiCall,
    public var pfnOnMoreInfoClickDefault: PfnProvuiCall,
    public var pfnOnAdvancedClick: PfnProvuiCall,
    public var pfnOnAdvancedClickDefault: PfnProvuiCall,
) {
    public var psUIData: MutPtr<CryptProvuiData> = psUIDataCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        psUIDataCtorArg = MutPtr(0L),
        pfnOnMoreInfoClick = null,
        pfnOnMoreInfoClickDefault = null,
        pfnOnAdvancedClick = null,
        pfnOnAdvancedClickDefault = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr<CryptProvuiData> = this.psUIData

    public operator fun component3(): PfnProvuiCall = this.pfnOnMoreInfoClick

    public operator fun component4(): PfnProvuiCall = this.pfnOnMoreInfoClickDefault

    public operator fun component5(): PfnProvuiCall = this.pfnOnAdvancedClick

    public operator fun component6(): PfnProvuiCall = this.pfnOnAdvancedClickDefault

    public fun copy(cbStruct: UInt = this.cbStruct, psUIData: MutPtr<CryptProvuiData> = this.psUIData, pfnOnMoreInfoClick: PfnProvuiCall = this.pfnOnMoreInfoClick, pfnOnMoreInfoClickDefault: PfnProvuiCall = this.pfnOnMoreInfoClickDefault, pfnOnAdvancedClick: PfnProvuiCall = this.pfnOnAdvancedClick, pfnOnAdvancedClickDefault: PfnProvuiCall = this.pfnOnAdvancedClickDefault): CryptProvuiFuncs = CryptProvuiFuncs(cbStruct = cbStruct, psUIDataCtorArg = psUIData, pfnOnMoreInfoClick = pfnOnMoreInfoClick, pfnOnMoreInfoClickDefault = pfnOnMoreInfoClickDefault, pfnOnAdvancedClick = pfnOnAdvancedClick, pfnOnAdvancedClickDefault = pfnOnAdvancedClickDefault)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptProvuiFuncs) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.psUIData != other.psUIData) return false
        if (this.pfnOnMoreInfoClick != other.pfnOnMoreInfoClick) return false
        if (this.pfnOnMoreInfoClickDefault != other.pfnOnMoreInfoClickDefault) return false
        if (this.pfnOnAdvancedClick != other.pfnOnAdvancedClick) return false
        if (this.pfnOnAdvancedClickDefault != other.pfnOnAdvancedClickDefault) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.psUIData.hashCode()
        result = 31 * result + this.pfnOnMoreInfoClick.hashCode()
        result = 31 * result + this.pfnOnMoreInfoClickDefault.hashCode()
        result = 31 * result + this.pfnOnAdvancedClick.hashCode()
        result = 31 * result + this.pfnOnAdvancedClickDefault.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            psUIData: MutPtr<CryptProvuiData> = MutPtr(0L),
            pfnOnMoreInfoClick: PfnProvuiCall = null,
            pfnOnMoreInfoClickDefault: PfnProvuiCall = null,
            pfnOnAdvancedClick: PfnProvuiCall = null,
            pfnOnAdvancedClickDefault: PfnProvuiCall = null,
        ): CryptProvuiFuncs =
            CryptProvuiFuncs(
                cbStruct = cbStruct,
                psUIDataCtorArg = psUIData,
                pfnOnMoreInfoClick = pfnOnMoreInfoClick,
                pfnOnMoreInfoClickDefault = pfnOnMoreInfoClickDefault,
                pfnOnAdvancedClick = pfnOnAdvancedClick,
                pfnOnAdvancedClickDefault = pfnOnAdvancedClickDefault,
            )
    }
}

public data class CryptRegisterActionid(
    public var cbStruct: UInt = 0u,
    public var sInitProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
    public var sObjectProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
    public var sSignatureProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
    public var sCertificateProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
    public var sCertificatePolicyProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
    public var sFinalPolicyProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
    public var sTestPolicyProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
    public var sCleanupProvider: CryptTrustRegEntry = CryptTrustRegEntry(),
)

public class CryptTrustRegEntry internal constructor(
    public var cbStruct: UInt,
    pwszDLLNameCtorArg: Pwstr,
    pwszFunctionNameCtorArg: Pwstr,
) {
    public var pwszDLLName: Pwstr = pwszDLLNameCtorArg
        internal set

    public var pwszFunctionName: Pwstr = pwszFunctionNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pwszDLLNameCtorArg = MutPtr(0L),
        pwszFunctionNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.pwszDLLName

    public operator fun component3(): Pwstr = this.pwszFunctionName

    public fun copy(cbStruct: UInt = this.cbStruct, pwszDLLName: Pwstr = this.pwszDLLName, pwszFunctionName: Pwstr = this.pwszFunctionName): CryptTrustRegEntry = CryptTrustRegEntry(cbStruct = cbStruct, pwszDLLNameCtorArg = pwszDLLName, pwszFunctionNameCtorArg = pwszFunctionName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptTrustRegEntry) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pwszDLLName != other.pwszDLLName) return false
        if (this.pwszFunctionName != other.pwszFunctionName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pwszDLLName.hashCode()
        result = 31 * result + this.pwszFunctionName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pwszDLLName: Pwstr = MutPtr(0L),
            pwszFunctionName: Pwstr = MutPtr(0L),
        ): CryptTrustRegEntry =
            CryptTrustRegEntry(
                cbStruct = cbStruct,
                pwszDLLNameCtorArg = pwszDLLName,
                pwszFunctionNameCtorArg = pwszFunctionName,
            )
    }
}

public class DriverVerInfo internal constructor(
    public var cbStruct: UInt,
    public var dwReserved1: Int,
    public var dwReserved2: Int,
    public var dwPlatform: UInt,
    public var dwVersion: UInt,
    public var wszVersion: UShortArray,
    public var wszSignedBy: UShortArray,
    pcSignerCertContextCtorArg: ConstPtr<CertContext>,
    public var sOSVersionLow: DriverVerMajorminor,
    public var sOSVersionHigh: DriverVerMajorminor,
    public var dwBuildNumberLow: UInt,
    public var dwBuildNumberHigh: UInt,
) {
    public var pcSignerCertContext: ConstPtr<CertContext> = pcSignerCertContextCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwReserved1 = 0,
        dwReserved2 = 0,
        dwPlatform = 0u,
        dwVersion = 0u,
        wszVersion = UShortArray(260),
        wszSignedBy = UShortArray(260),
        pcSignerCertContextCtorArg = ConstPtr(0L),
        sOSVersionLow = DriverVerMajorminor(),
        sOSVersionHigh = DriverVerMajorminor(),
        dwBuildNumberLow = 0u,
        dwBuildNumberHigh = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Int = this.dwReserved1

    public operator fun component3(): Int = this.dwReserved2

    public operator fun component4(): UInt = this.dwPlatform

    public operator fun component5(): UInt = this.dwVersion

    public operator fun component6(): UShortArray = this.wszVersion

    public operator fun component7(): UShortArray = this.wszSignedBy

    public operator fun component8(): ConstPtr<CertContext> = this.pcSignerCertContext

    public operator fun component9(): DriverVerMajorminor = this.sOSVersionLow

    public operator fun component10(): DriverVerMajorminor = this.sOSVersionHigh

    public operator fun component11(): UInt = this.dwBuildNumberLow

    public operator fun component12(): UInt = this.dwBuildNumberHigh

    public fun copy(cbStruct: UInt = this.cbStruct, dwReserved1: Int = this.dwReserved1, dwReserved2: Int = this.dwReserved2, dwPlatform: UInt = this.dwPlatform, dwVersion: UInt = this.dwVersion, wszVersion: UShortArray = this.wszVersion, wszSignedBy: UShortArray = this.wszSignedBy, pcSignerCertContext: ConstPtr<CertContext> = this.pcSignerCertContext, sOSVersionLow: DriverVerMajorminor = this.sOSVersionLow, sOSVersionHigh: DriverVerMajorminor = this.sOSVersionHigh, dwBuildNumberLow: UInt = this.dwBuildNumberLow, dwBuildNumberHigh: UInt = this.dwBuildNumberHigh): DriverVerInfo = DriverVerInfo(cbStruct = cbStruct, dwReserved1 = dwReserved1, dwReserved2 = dwReserved2, dwPlatform = dwPlatform, dwVersion = dwVersion, wszVersion = wszVersion, wszSignedBy = wszSignedBy, pcSignerCertContextCtorArg = pcSignerCertContext, sOSVersionLow = sOSVersionLow, sOSVersionHigh = sOSVersionHigh, dwBuildNumberLow = dwBuildNumberLow, dwBuildNumberHigh = dwBuildNumberHigh)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverVerInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        if (this.dwPlatform != other.dwPlatform) return false
        if (this.dwVersion != other.dwVersion) return false
        if (!this.wszVersion.contentEquals(other.wszVersion)) return false
        if (!this.wszSignedBy.contentEquals(other.wszSignedBy)) return false
        if (this.pcSignerCertContext != other.pcSignerCertContext) return false
        if (this.sOSVersionLow != other.sOSVersionLow) return false
        if (this.sOSVersionHigh != other.sOSVersionHigh) return false
        if (this.dwBuildNumberLow != other.dwBuildNumberLow) return false
        if (this.dwBuildNumberHigh != other.dwBuildNumberHigh) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        result = 31 * result + this.dwPlatform.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.wszVersion.contentHashCode()
        result = 31 * result + this.wszSignedBy.contentHashCode()
        result = 31 * result + this.pcSignerCertContext.hashCode()
        result = 31 * result + this.sOSVersionLow.hashCode()
        result = 31 * result + this.sOSVersionHigh.hashCode()
        result = 31 * result + this.dwBuildNumberLow.hashCode()
        result = 31 * result + this.dwBuildNumberHigh.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverVerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverVerInfo> {
                override val sizeBytes: Long = 1104L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DriverVerInfo =
                    DriverVerInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 552L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CertContext>(64)
                        ).readNative(addr + 1072L),
                        (DriverVerMajorminor.typeLayout()).readNative(addr + 1080L),
                        (DriverVerMajorminor.typeLayout()).readNative(addr + 1088L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1096L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1100L),
                    )
                override fun writeNative(addr: Long, value: DriverVerInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwPlatform)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 32L, value.wszVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 552L, value.wszSignedBy)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CertContext>(64)
                    ).writeNative(addr + 1072L, value.pcSignerCertContext)
                    (DriverVerMajorminor.typeLayout()).writeNative(addr + 1080L, value.sOSVersionLow)
                    (DriverVerMajorminor.typeLayout()).writeNative(addr + 1088L, value.sOSVersionHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1096L, value.dwBuildNumberLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1100L, value.dwBuildNumberHigh)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwReserved1: Int = 0,
            dwReserved2: Int = 0,
            dwPlatform: UInt = 0u,
            dwVersion: UInt = 0u,
            wszVersion: UShortArray = UShortArray(260),
            wszSignedBy: UShortArray = UShortArray(260),
            pcSignerCertContext: ConstPtr<CertContext> = ConstPtr(0L),
            sOSVersionLow: DriverVerMajorminor = DriverVerMajorminor(),
            sOSVersionHigh: DriverVerMajorminor = DriverVerMajorminor(),
            dwBuildNumberLow: UInt = 0u,
            dwBuildNumberHigh: UInt = 0u,
        ): DriverVerInfo =
            DriverVerInfo(
                cbStruct = cbStruct,
                dwReserved1 = dwReserved1,
                dwReserved2 = dwReserved2,
                dwPlatform = dwPlatform,
                dwVersion = dwVersion,
                wszVersion = wszVersion,
                wszSignedBy = wszSignedBy,
                pcSignerCertContextCtorArg = pcSignerCertContext,
                sOSVersionLow = sOSVersionLow,
                sOSVersionHigh = sOSVersionHigh,
                dwBuildNumberLow = dwBuildNumberLow,
                dwBuildNumberHigh = dwBuildNumberHigh,
            )
    }
}

public data class DriverVerMajorminor(
    public var dwMajor: UInt = 0u,
    public var dwMinor: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverVerMajorminor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DriverVerMajorminor> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DriverVerMajorminor =
                    DriverVerMajorminor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DriverVerMajorminor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinor)
                }
            }
    }
}

public data class IntentToSealAttribute(
    public var version: UInt = 0u,
    public var seal: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntentToSealAttribute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntentToSealAttribute> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IntentToSealAttribute =
                    IntentToSealAttribute(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IntentToSealAttribute) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.seal)
                }
            }
    }
}

public class ProvdataSip internal constructor(
    public var cbStruct: UInt,
    public var gSubject: Guid,
    pSipCtorArg: MutPtr<SipDispatchInfo>,
    pCATSipCtorArg: MutPtr<SipDispatchInfo>,
    psSipSubjectInfoCtorArg: MutPtr<SipSubjectinfo>,
    psSipCATSubjectInfoCtorArg: MutPtr<SipSubjectinfo>,
    psIndirectDataCtorArg: MutPtr<SipIndirectData>,
) {
    public var pSip: MutPtr<SipDispatchInfo> = pSipCtorArg
        internal set

    public var pCATSip: MutPtr<SipDispatchInfo> = pCATSipCtorArg
        internal set

    public var psSipSubjectInfo: MutPtr<SipSubjectinfo> = psSipSubjectInfoCtorArg
        internal set

    public var psSipCATSubjectInfo: MutPtr<SipSubjectinfo> = psSipCATSubjectInfoCtorArg
        internal set

    public var psIndirectData: MutPtr<SipIndirectData> = psIndirectDataCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        gSubject = Guid(),
        pSipCtorArg = MutPtr(0L),
        pCATSipCtorArg = MutPtr(0L),
        psSipSubjectInfoCtorArg = MutPtr(0L),
        psSipCATSubjectInfoCtorArg = MutPtr(0L),
        psIndirectDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Guid = this.gSubject

    public operator fun component3(): MutPtr<SipDispatchInfo> = this.pSip

    public operator fun component4(): MutPtr<SipDispatchInfo> = this.pCATSip

    public operator fun component5(): MutPtr<SipSubjectinfo> = this.psSipSubjectInfo

    public operator fun component6(): MutPtr<SipSubjectinfo> = this.psSipCATSubjectInfo

    public operator fun component7(): MutPtr<SipIndirectData> = this.psIndirectData

    public fun copy(cbStruct: UInt = this.cbStruct, gSubject: Guid = this.gSubject, pSip: MutPtr<SipDispatchInfo> = this.pSip, pCATSip: MutPtr<SipDispatchInfo> = this.pCATSip, psSipSubjectInfo: MutPtr<SipSubjectinfo> = this.psSipSubjectInfo, psSipCATSubjectInfo: MutPtr<SipSubjectinfo> = this.psSipCATSubjectInfo, psIndirectData: MutPtr<SipIndirectData> = this.psIndirectData): ProvdataSip = ProvdataSip(cbStruct = cbStruct, gSubject = gSubject, pSipCtorArg = pSip, pCATSipCtorArg = pCATSip, psSipSubjectInfoCtorArg = psSipSubjectInfo, psSipCATSubjectInfoCtorArg = psSipCATSubjectInfo, psIndirectDataCtorArg = psIndirectData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvdataSip) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.gSubject != other.gSubject) return false
        if (this.pSip != other.pSip) return false
        if (this.pCATSip != other.pCATSip) return false
        if (this.psSipSubjectInfo != other.psSipSubjectInfo) return false
        if (this.psSipCATSubjectInfo != other.psSipCATSubjectInfo) return false
        if (this.psIndirectData != other.psIndirectData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.gSubject.hashCode()
        result = 31 * result + this.pSip.hashCode()
        result = 31 * result + this.pCATSip.hashCode()
        result = 31 * result + this.psSipSubjectInfo.hashCode()
        result = 31 * result + this.psSipCATSubjectInfo.hashCode()
        result = 31 * result + this.psIndirectData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            gSubject: Guid = Guid(),
            pSip: MutPtr<SipDispatchInfo> = MutPtr(0L),
            pCATSip: MutPtr<SipDispatchInfo> = MutPtr(0L),
            psSipSubjectInfo: MutPtr<SipSubjectinfo> = MutPtr(0L),
            psSipCATSubjectInfo: MutPtr<SipSubjectinfo> = MutPtr(0L),
            psIndirectData: MutPtr<SipIndirectData> = MutPtr(0L),
        ): ProvdataSip =
            ProvdataSip(
                cbStruct = cbStruct,
                gSubject = gSubject,
                pSipCtorArg = pSip,
                pCATSipCtorArg = pCATSip,
                psSipSubjectInfoCtorArg = psSipSubjectInfo,
                psSipCATSubjectInfoCtorArg = psSipCATSubjectInfo,
                psIndirectDataCtorArg = psIndirectData,
            )
    }
}

public data class SealingSignatureAttribute(
    public var version: UInt = 0u,
    public var signerIndex: UInt = 0u,
    public var signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedDigest: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class SealingTimestampAttribute(
    public var version: UInt = 0u,
    public var signerIndex: UInt = 0u,
    public var sealTimeStampToken: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class SpcFinancialCriteria(
    public var fFinancialInfoAvailable: Bool = 0,
    public var fMeetsCriteria: Bool = 0,
)

public class SpcImage internal constructor(
    pImageLinkCtorArg: MutPtr<SpcLink>,
    public var bitmap: CryptIntegerBlob,
    public var metafile: CryptIntegerBlob,
    public var enhancedMetafile: CryptIntegerBlob,
    public var gifFile: CryptIntegerBlob,
) {
    public var pImageLink: MutPtr<SpcLink> = pImageLinkCtorArg
        internal set

    public constructor() : this(
        pImageLinkCtorArg = MutPtr(0L),
        bitmap = CryptIntegerBlob(),
        metafile = CryptIntegerBlob(),
        enhancedMetafile = CryptIntegerBlob(),
        gifFile = CryptIntegerBlob(),
    )

    public operator fun component1(): MutPtr<SpcLink> = this.pImageLink

    public operator fun component2(): CryptIntegerBlob = this.bitmap

    public operator fun component3(): CryptIntegerBlob = this.metafile

    public operator fun component4(): CryptIntegerBlob = this.enhancedMetafile

    public operator fun component5(): CryptIntegerBlob = this.gifFile

    public fun copy(pImageLink: MutPtr<SpcLink> = this.pImageLink, bitmap: CryptIntegerBlob = this.bitmap, metafile: CryptIntegerBlob = this.metafile, enhancedMetafile: CryptIntegerBlob = this.enhancedMetafile, gifFile: CryptIntegerBlob = this.gifFile): SpcImage = SpcImage(pImageLinkCtorArg = pImageLink, bitmap = bitmap, metafile = metafile, enhancedMetafile = enhancedMetafile, gifFile = gifFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpcImage) return false
        if (this.pImageLink != other.pImageLink) return false
        if (this.bitmap != other.bitmap) return false
        if (this.metafile != other.metafile) return false
        if (this.enhancedMetafile != other.enhancedMetafile) return false
        if (this.gifFile != other.gifFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pImageLink.hashCode()
        result = 31 * result + this.bitmap.hashCode()
        result = 31 * result + this.metafile.hashCode()
        result = 31 * result + this.enhancedMetafile.hashCode()
        result = 31 * result + this.gifFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pImageLink: MutPtr<SpcLink> = MutPtr(0L),
            bitmap: CryptIntegerBlob = CryptIntegerBlob(),
            metafile: CryptIntegerBlob = CryptIntegerBlob(),
            enhancedMetafile: CryptIntegerBlob = CryptIntegerBlob(),
            gifFile: CryptIntegerBlob = CryptIntegerBlob(),
        ): SpcImage =
            SpcImage(
                pImageLinkCtorArg = pImageLink,
                bitmap = bitmap,
                metafile = metafile,
                enhancedMetafile = enhancedMetafile,
                gifFile = gifFile,
            )
    }
}

public data class SpcIndirectDataContent(
    public var data: CryptAttributeTypeValue = CryptAttributeTypeValue(),
    public var digestAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var digest: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class SpcLink(
    public var dwLinkChoice: UInt = 0u,
    public var anonymous: SpcLink0 = SpcLink0(),
)

public class SpcLink0 internal constructor(
    pwszUrlCtorArg: Pwstr,
    public var moniker: SpcSerializedObject,
    pwszFileCtorArg: Pwstr,
) {
    public var pwszUrl: Pwstr = pwszUrlCtorArg
        internal set

    public var pwszFile: Pwstr = pwszFileCtorArg
        internal set

    public constructor() : this(
        pwszUrlCtorArg = MutPtr(0L),
        moniker = SpcSerializedObject(),
        pwszFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszUrl

    public operator fun component2(): SpcSerializedObject = this.moniker

    public operator fun component3(): Pwstr = this.pwszFile

    public fun copy(pwszUrl: Pwstr = this.pwszUrl, moniker: SpcSerializedObject = this.moniker, pwszFile: Pwstr = this.pwszFile): SpcLink0 = SpcLink0(pwszUrlCtorArg = pwszUrl, moniker = moniker, pwszFileCtorArg = pwszFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpcLink0) return false
        if (this.pwszUrl != other.pwszUrl) return false
        if (this.moniker != other.moniker) return false
        if (this.pwszFile != other.pwszFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszUrl.hashCode()
        result = 31 * result + this.moniker.hashCode()
        result = 31 * result + this.pwszFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszUrl: Pwstr = MutPtr(0L),
            moniker: SpcSerializedObject = SpcSerializedObject(),
            pwszFile: Pwstr = MutPtr(0L),
        ): SpcLink0 =
            SpcLink0(
                pwszUrlCtorArg = pwszUrl,
                moniker = moniker,
                pwszFileCtorArg = pwszFile,
            )
    }
}

public class SpcPeImageData internal constructor(
    public var flags: CryptBitBlob,
    pFileCtorArg: MutPtr<SpcLink>,
) {
    public var pFile: MutPtr<SpcLink> = pFileCtorArg
        internal set

    public constructor() : this(
        flags = CryptBitBlob(),
        pFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CryptBitBlob = this.flags

    public operator fun component2(): MutPtr<SpcLink> = this.pFile

    public fun copy(flags: CryptBitBlob = this.flags, pFile: MutPtr<SpcLink> = this.pFile): SpcPeImageData = SpcPeImageData(flags = flags, pFileCtorArg = pFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpcPeImageData) return false
        if (this.flags != other.flags) return false
        if (this.pFile != other.pFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: CryptBitBlob = CryptBitBlob(),
            pFile: MutPtr<SpcLink> = MutPtr(0L),
        ): SpcPeImageData =
            SpcPeImageData(
                flags = flags,
                pFileCtorArg = pFile,
            )
    }
}

public data class SpcSerializedObject(
    public var classId: UByteArray = UByteArray(16),
    public var serializedData: CryptIntegerBlob = CryptIntegerBlob(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpcSerializedObject) return false
        if (!this.classId.contentEquals(other.classId)) return false
        if (this.serializedData != other.serializedData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classId.contentHashCode()
        result = 31 * result + this.serializedData.hashCode()
        return result
    }
}

public data class SpcSiginfo(
    public var dwSipVersion: UInt = 0u,
    public var gSIPGuid: Guid = Guid(),
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var dwReserved5: UInt = 0u,
)

public class SpcSpAgencyInfo internal constructor(
    pPolicyInformationCtorArg: MutPtr<SpcLink>,
    pwszPolicyDisplayTextCtorArg: Pwstr,
    pLogoImageCtorArg: MutPtr<SpcImage>,
    pLogoLinkCtorArg: MutPtr<SpcLink>,
) {
    public var pPolicyInformation: MutPtr<SpcLink> = pPolicyInformationCtorArg
        internal set

    public var pwszPolicyDisplayText: Pwstr = pwszPolicyDisplayTextCtorArg
        internal set

    public var pLogoImage: MutPtr<SpcImage> = pLogoImageCtorArg
        internal set

    public var pLogoLink: MutPtr<SpcLink> = pLogoLinkCtorArg
        internal set

    public constructor() : this(
        pPolicyInformationCtorArg = MutPtr(0L),
        pwszPolicyDisplayTextCtorArg = MutPtr(0L),
        pLogoImageCtorArg = MutPtr(0L),
        pLogoLinkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SpcLink> = this.pPolicyInformation

    public operator fun component2(): Pwstr = this.pwszPolicyDisplayText

    public operator fun component3(): MutPtr<SpcImage> = this.pLogoImage

    public operator fun component4(): MutPtr<SpcLink> = this.pLogoLink

    public fun copy(pPolicyInformation: MutPtr<SpcLink> = this.pPolicyInformation, pwszPolicyDisplayText: Pwstr = this.pwszPolicyDisplayText, pLogoImage: MutPtr<SpcImage> = this.pLogoImage, pLogoLink: MutPtr<SpcLink> = this.pLogoLink): SpcSpAgencyInfo = SpcSpAgencyInfo(pPolicyInformationCtorArg = pPolicyInformation, pwszPolicyDisplayTextCtorArg = pwszPolicyDisplayText, pLogoImageCtorArg = pLogoImage, pLogoLinkCtorArg = pLogoLink)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpcSpAgencyInfo) return false
        if (this.pPolicyInformation != other.pPolicyInformation) return false
        if (this.pwszPolicyDisplayText != other.pwszPolicyDisplayText) return false
        if (this.pLogoImage != other.pLogoImage) return false
        if (this.pLogoLink != other.pLogoLink) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPolicyInformation.hashCode()
        result = 31 * result + this.pwszPolicyDisplayText.hashCode()
        result = 31 * result + this.pLogoImage.hashCode()
        result = 31 * result + this.pLogoLink.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pPolicyInformation: MutPtr<SpcLink> = MutPtr(0L),
            pwszPolicyDisplayText: Pwstr = MutPtr(0L),
            pLogoImage: MutPtr<SpcImage> = MutPtr(0L),
            pLogoLink: MutPtr<SpcLink> = MutPtr(0L),
        ): SpcSpAgencyInfo =
            SpcSpAgencyInfo(
                pPolicyInformationCtorArg = pPolicyInformation,
                pwszPolicyDisplayTextCtorArg = pwszPolicyDisplayText,
                pLogoImageCtorArg = pLogoImage,
                pLogoLinkCtorArg = pLogoLink,
            )
    }
}

public class SpcSpOpusInfo internal constructor(
    pwszProgramNameCtorArg: Pcwstr,
    pMoreInfoCtorArg: MutPtr<SpcLink>,
    pPublisherInfoCtorArg: MutPtr<SpcLink>,
) {
    public var pwszProgramName: Pcwstr = pwszProgramNameCtorArg
        internal set

    public var pMoreInfo: MutPtr<SpcLink> = pMoreInfoCtorArg
        internal set

    public var pPublisherInfo: MutPtr<SpcLink> = pPublisherInfoCtorArg
        internal set

    public constructor() : this(
        pwszProgramNameCtorArg = ConstPtr(0L),
        pMoreInfoCtorArg = MutPtr(0L),
        pPublisherInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszProgramName

    public operator fun component2(): MutPtr<SpcLink> = this.pMoreInfo

    public operator fun component3(): MutPtr<SpcLink> = this.pPublisherInfo

    public fun copy(pwszProgramName: Pcwstr = this.pwszProgramName, pMoreInfo: MutPtr<SpcLink> = this.pMoreInfo, pPublisherInfo: MutPtr<SpcLink> = this.pPublisherInfo): SpcSpOpusInfo = SpcSpOpusInfo(pwszProgramNameCtorArg = pwszProgramName, pMoreInfoCtorArg = pMoreInfo, pPublisherInfoCtorArg = pPublisherInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpcSpOpusInfo) return false
        if (this.pwszProgramName != other.pwszProgramName) return false
        if (this.pMoreInfo != other.pMoreInfo) return false
        if (this.pPublisherInfo != other.pPublisherInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszProgramName.hashCode()
        result = 31 * result + this.pMoreInfo.hashCode()
        result = 31 * result + this.pPublisherInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszProgramName: Pcwstr = ConstPtr(0L),
            pMoreInfo: MutPtr<SpcLink> = MutPtr(0L),
            pPublisherInfo: MutPtr<SpcLink> = MutPtr(0L),
        ): SpcSpOpusInfo =
            SpcSpOpusInfo(
                pwszProgramNameCtorArg = pwszProgramName,
                pMoreInfoCtorArg = pMoreInfo,
                pPublisherInfoCtorArg = pPublisherInfo,
            )
    }
}

public class SpcStatementType internal constructor(
    public var cKeyPurposeId: UInt,
    rgpszKeyPurposeIdCtorArg: MutPtr<Pstr>,
) {
    public var rgpszKeyPurposeId: MutPtr<Pstr> = rgpszKeyPurposeIdCtorArg
        internal set

    public constructor() : this(
        cKeyPurposeId = 0u,
        rgpszKeyPurposeIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cKeyPurposeId

    public operator fun component2(): MutPtr<Pstr> = this.rgpszKeyPurposeId

    public fun copy(cKeyPurposeId: UInt = this.cKeyPurposeId, rgpszKeyPurposeId: MutPtr<Pstr> = this.rgpszKeyPurposeId): SpcStatementType = SpcStatementType(cKeyPurposeId = cKeyPurposeId, rgpszKeyPurposeIdCtorArg = rgpszKeyPurposeId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpcStatementType) return false
        if (this.cKeyPurposeId != other.cKeyPurposeId) return false
        if (this.rgpszKeyPurposeId != other.rgpszKeyPurposeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cKeyPurposeId.hashCode()
        result = 31 * result + this.rgpszKeyPurposeId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpcStatementType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SpcStatementType> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SpcStatementType =
                    SpcStatementType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SpcStatementType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cKeyPurposeId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pstr>(64)
                    ).writeNative(addr + 8L, value.rgpszKeyPurposeId)
                }
            }

        public operator fun invoke(
            cKeyPurposeId: UInt = 0u,
            rgpszKeyPurposeId: MutPtr<Pstr> = MutPtr(0L),
        ): SpcStatementType =
            SpcStatementType(
                cKeyPurposeId = cKeyPurposeId,
                rgpszKeyPurposeIdCtorArg = rgpszKeyPurposeId,
            )
    }
}

public class WintrustBlobInfo internal constructor(
    public var cbStruct: UInt,
    public var gSubject: Guid,
    pcwszDisplayNameCtorArg: Pcwstr,
    public var cbMemObject: UInt,
    pbMemObjectCtorArg: MutPtr<UByte>,
    public var cbMemSignedMsg: UInt,
    pbMemSignedMsgCtorArg: MutPtr<UByte>,
) {
    public var pcwszDisplayName: Pcwstr = pcwszDisplayNameCtorArg
        internal set

    public var pbMemObject: MutPtr<UByte> = pbMemObjectCtorArg
        internal set

    public var pbMemSignedMsg: MutPtr<UByte> = pbMemSignedMsgCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        gSubject = Guid(),
        pcwszDisplayNameCtorArg = ConstPtr(0L),
        cbMemObject = 0u,
        pbMemObjectCtorArg = MutPtr(0L),
        cbMemSignedMsg = 0u,
        pbMemSignedMsgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Guid = this.gSubject

    public operator fun component3(): Pcwstr = this.pcwszDisplayName

    public operator fun component4(): UInt = this.cbMemObject

    public operator fun component5(): MutPtr<UByte> = this.pbMemObject

    public operator fun component6(): UInt = this.cbMemSignedMsg

    public operator fun component7(): MutPtr<UByte> = this.pbMemSignedMsg

    public fun copy(cbStruct: UInt = this.cbStruct, gSubject: Guid = this.gSubject, pcwszDisplayName: Pcwstr = this.pcwszDisplayName, cbMemObject: UInt = this.cbMemObject, pbMemObject: MutPtr<UByte> = this.pbMemObject, cbMemSignedMsg: UInt = this.cbMemSignedMsg, pbMemSignedMsg: MutPtr<UByte> = this.pbMemSignedMsg): WintrustBlobInfo = WintrustBlobInfo(cbStruct = cbStruct, gSubject = gSubject, pcwszDisplayNameCtorArg = pcwszDisplayName, cbMemObject = cbMemObject, pbMemObjectCtorArg = pbMemObject, cbMemSignedMsg = cbMemSignedMsg, pbMemSignedMsgCtorArg = pbMemSignedMsg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustBlobInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.gSubject != other.gSubject) return false
        if (this.pcwszDisplayName != other.pcwszDisplayName) return false
        if (this.cbMemObject != other.cbMemObject) return false
        if (this.pbMemObject != other.pbMemObject) return false
        if (this.cbMemSignedMsg != other.cbMemSignedMsg) return false
        if (this.pbMemSignedMsg != other.pbMemSignedMsg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.gSubject.hashCode()
        result = 31 * result + this.pcwszDisplayName.hashCode()
        result = 31 * result + this.cbMemObject.hashCode()
        result = 31 * result + this.pbMemObject.hashCode()
        result = 31 * result + this.cbMemSignedMsg.hashCode()
        result = 31 * result + this.pbMemSignedMsg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            gSubject: Guid = Guid(),
            pcwszDisplayName: Pcwstr = ConstPtr(0L),
            cbMemObject: UInt = 0u,
            pbMemObject: MutPtr<UByte> = MutPtr(0L),
            cbMemSignedMsg: UInt = 0u,
            pbMemSignedMsg: MutPtr<UByte> = MutPtr(0L),
        ): WintrustBlobInfo =
            WintrustBlobInfo(
                cbStruct = cbStruct,
                gSubject = gSubject,
                pcwszDisplayNameCtorArg = pcwszDisplayName,
                cbMemObject = cbMemObject,
                pbMemObjectCtorArg = pbMemObject,
                cbMemSignedMsg = cbMemSignedMsg,
                pbMemSignedMsgCtorArg = pbMemSignedMsg,
            )
    }
}

public class WintrustCatalogInfo internal constructor(
    public var cbStruct: UInt,
    public var dwCatalogVersion: UInt,
    pcwszCatalogFilePathCtorArg: Pcwstr,
    pcwszMemberTagCtorArg: Pcwstr,
    pcwszMemberFilePathCtorArg: Pcwstr,
    hMemberFileCtorArg: Handle,
    pbCalculatedFileHashCtorArg: MutPtr<UByte>,
    public var cbCalculatedFileHash: UInt,
    pcCatalogContextCtorArg: MutPtr<CtlContext>,
    public var hCatAdmin: Int,
) {
    public var pcwszCatalogFilePath: Pcwstr = pcwszCatalogFilePathCtorArg
        internal set

    public var pcwszMemberTag: Pcwstr = pcwszMemberTagCtorArg
        internal set

    public var pcwszMemberFilePath: Pcwstr = pcwszMemberFilePathCtorArg
        internal set

    public var hMemberFile: Handle = hMemberFileCtorArg
        internal set

    public var pbCalculatedFileHash: MutPtr<UByte> = pbCalculatedFileHashCtorArg
        internal set

    public var pcCatalogContext: MutPtr<CtlContext> = pcCatalogContextCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwCatalogVersion = 0u,
        pcwszCatalogFilePathCtorArg = ConstPtr(0L),
        pcwszMemberTagCtorArg = ConstPtr(0L),
        pcwszMemberFilePathCtorArg = ConstPtr(0L),
        hMemberFileCtorArg = MutPtr(0L),
        pbCalculatedFileHashCtorArg = MutPtr(0L),
        cbCalculatedFileHash = 0u,
        pcCatalogContextCtorArg = MutPtr(0L),
        hCatAdmin = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwCatalogVersion

    public operator fun component3(): Pcwstr = this.pcwszCatalogFilePath

    public operator fun component4(): Pcwstr = this.pcwszMemberTag

    public operator fun component5(): Pcwstr = this.pcwszMemberFilePath

    public operator fun component6(): Handle = this.hMemberFile

    public operator fun component7(): MutPtr<UByte> = this.pbCalculatedFileHash

    public operator fun component8(): UInt = this.cbCalculatedFileHash

    public operator fun component9(): MutPtr<CtlContext> = this.pcCatalogContext

    public operator fun component10(): Int = this.hCatAdmin

    public fun copy(cbStruct: UInt = this.cbStruct, dwCatalogVersion: UInt = this.dwCatalogVersion, pcwszCatalogFilePath: Pcwstr = this.pcwszCatalogFilePath, pcwszMemberTag: Pcwstr = this.pcwszMemberTag, pcwszMemberFilePath: Pcwstr = this.pcwszMemberFilePath, hMemberFile: Handle = this.hMemberFile, pbCalculatedFileHash: MutPtr<UByte> = this.pbCalculatedFileHash, cbCalculatedFileHash: UInt = this.cbCalculatedFileHash, pcCatalogContext: MutPtr<CtlContext> = this.pcCatalogContext, hCatAdmin: Int = this.hCatAdmin): WintrustCatalogInfo = WintrustCatalogInfo(cbStruct = cbStruct, dwCatalogVersion = dwCatalogVersion, pcwszCatalogFilePathCtorArg = pcwszCatalogFilePath, pcwszMemberTagCtorArg = pcwszMemberTag, pcwszMemberFilePathCtorArg = pcwszMemberFilePath, hMemberFileCtorArg = hMemberFile, pbCalculatedFileHashCtorArg = pbCalculatedFileHash, cbCalculatedFileHash = cbCalculatedFileHash, pcCatalogContextCtorArg = pcCatalogContext, hCatAdmin = hCatAdmin)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustCatalogInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwCatalogVersion != other.dwCatalogVersion) return false
        if (this.pcwszCatalogFilePath != other.pcwszCatalogFilePath) return false
        if (this.pcwszMemberTag != other.pcwszMemberTag) return false
        if (this.pcwszMemberFilePath != other.pcwszMemberFilePath) return false
        if (this.hMemberFile != other.hMemberFile) return false
        if (this.pbCalculatedFileHash != other.pbCalculatedFileHash) return false
        if (this.cbCalculatedFileHash != other.cbCalculatedFileHash) return false
        if (this.pcCatalogContext != other.pcCatalogContext) return false
        if (this.hCatAdmin != other.hCatAdmin) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwCatalogVersion.hashCode()
        result = 31 * result + this.pcwszCatalogFilePath.hashCode()
        result = 31 * result + this.pcwszMemberTag.hashCode()
        result = 31 * result + this.pcwszMemberFilePath.hashCode()
        result = 31 * result + this.hMemberFile.hashCode()
        result = 31 * result + this.pbCalculatedFileHash.hashCode()
        result = 31 * result + this.cbCalculatedFileHash.hashCode()
        result = 31 * result + this.pcCatalogContext.hashCode()
        result = 31 * result + this.hCatAdmin.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwCatalogVersion: UInt = 0u,
            pcwszCatalogFilePath: Pcwstr = ConstPtr(0L),
            pcwszMemberTag: Pcwstr = ConstPtr(0L),
            pcwszMemberFilePath: Pcwstr = ConstPtr(0L),
            hMemberFile: Handle = MutPtr(0L),
            pbCalculatedFileHash: MutPtr<UByte> = MutPtr(0L),
            cbCalculatedFileHash: UInt = 0u,
            pcCatalogContext: MutPtr<CtlContext> = MutPtr(0L),
            hCatAdmin: Int = 0,
        ): WintrustCatalogInfo =
            WintrustCatalogInfo(
                cbStruct = cbStruct,
                dwCatalogVersion = dwCatalogVersion,
                pcwszCatalogFilePathCtorArg = pcwszCatalogFilePath,
                pcwszMemberTagCtorArg = pcwszMemberTag,
                pcwszMemberFilePathCtorArg = pcwszMemberFilePath,
                hMemberFileCtorArg = hMemberFile,
                pbCalculatedFileHashCtorArg = pbCalculatedFileHash,
                cbCalculatedFileHash = cbCalculatedFileHash,
                pcCatalogContextCtorArg = pcCatalogContext,
                hCatAdmin = hCatAdmin,
            )
    }
}

public class WintrustCertInfo internal constructor(
    public var cbStruct: UInt,
    pcwszDisplayNameCtorArg: Pcwstr,
    psCertContextCtorArg: MutPtr<CertContext>,
    public var chStores: UInt,
    pahStoresCtorArg: MutPtr<Hcertstore>,
    public var dwFlags: UInt,
    psftVerifyAsOfCtorArg: MutPtr<Filetime>,
) {
    public var pcwszDisplayName: Pcwstr = pcwszDisplayNameCtorArg
        internal set

    public var psCertContext: MutPtr<CertContext> = psCertContextCtorArg
        internal set

    public var pahStores: MutPtr<Hcertstore> = pahStoresCtorArg
        internal set

    public var psftVerifyAsOf: MutPtr<Filetime> = psftVerifyAsOfCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pcwszDisplayNameCtorArg = ConstPtr(0L),
        psCertContextCtorArg = MutPtr(0L),
        chStores = 0u,
        pahStoresCtorArg = MutPtr(0L),
        dwFlags = 0u,
        psftVerifyAsOfCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pcwstr = this.pcwszDisplayName

    public operator fun component3(): MutPtr<CertContext> = this.psCertContext

    public operator fun component4(): UInt = this.chStores

    public operator fun component5(): MutPtr<Hcertstore> = this.pahStores

    public operator fun component6(): UInt = this.dwFlags

    public operator fun component7(): MutPtr<Filetime> = this.psftVerifyAsOf

    public fun copy(cbStruct: UInt = this.cbStruct, pcwszDisplayName: Pcwstr = this.pcwszDisplayName, psCertContext: MutPtr<CertContext> = this.psCertContext, chStores: UInt = this.chStores, pahStores: MutPtr<Hcertstore> = this.pahStores, dwFlags: UInt = this.dwFlags, psftVerifyAsOf: MutPtr<Filetime> = this.psftVerifyAsOf): WintrustCertInfo = WintrustCertInfo(cbStruct = cbStruct, pcwszDisplayNameCtorArg = pcwszDisplayName, psCertContextCtorArg = psCertContext, chStores = chStores, pahStoresCtorArg = pahStores, dwFlags = dwFlags, psftVerifyAsOfCtorArg = psftVerifyAsOf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustCertInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pcwszDisplayName != other.pcwszDisplayName) return false
        if (this.psCertContext != other.psCertContext) return false
        if (this.chStores != other.chStores) return false
        if (this.pahStores != other.pahStores) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.psftVerifyAsOf != other.psftVerifyAsOf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pcwszDisplayName.hashCode()
        result = 31 * result + this.psCertContext.hashCode()
        result = 31 * result + this.chStores.hashCode()
        result = 31 * result + this.pahStores.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.psftVerifyAsOf.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pcwszDisplayName: Pcwstr = ConstPtr(0L),
            psCertContext: MutPtr<CertContext> = MutPtr(0L),
            chStores: UInt = 0u,
            pahStores: MutPtr<Hcertstore> = MutPtr(0L),
            dwFlags: UInt = 0u,
            psftVerifyAsOf: MutPtr<Filetime> = MutPtr(0L),
        ): WintrustCertInfo =
            WintrustCertInfo(
                cbStruct = cbStruct,
                pcwszDisplayNameCtorArg = pcwszDisplayName,
                psCertContextCtorArg = psCertContext,
                chStores = chStores,
                pahStoresCtorArg = pahStores,
                dwFlags = dwFlags,
                psftVerifyAsOfCtorArg = psftVerifyAsOf,
            )
    }
}

public class WintrustData internal constructor(
    public var cbStruct: UInt,
    pPolicyCallbackDataCtorArg: MutPtr<CVoid>,
    pSIPClientDataCtorArg: MutPtr<CVoid>,
    public var dwUIChoice: WintrustDataUichoice,
    public var fdwRevocationChecks: WintrustDataRevocationChecks,
    public var dwUnionChoice: WintrustDataUnionChoice,
    public var anonymous: WintrustData0,
    public var dwStateAction: WintrustDataStateAction,
    hWVTStateDataCtorArg: Handle,
    pwszURLReferenceCtorArg: Pwstr,
    public var dwProvFlags: WintrustDataProviderFlags,
    public var dwUIContext: WintrustDataUicontext,
    pSignatureSettingsCtorArg: MutPtr<WintrustSignatureSettings>,
) {
    public var pPolicyCallbackData: MutPtr<CVoid> = pPolicyCallbackDataCtorArg
        internal set

    public var pSIPClientData: MutPtr<CVoid> = pSIPClientDataCtorArg
        internal set

    public var hWVTStateData: Handle = hWVTStateDataCtorArg
        internal set

    public var pwszURLReference: Pwstr = pwszURLReferenceCtorArg
        internal set

    public var pSignatureSettings: MutPtr<WintrustSignatureSettings> = pSignatureSettingsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pPolicyCallbackDataCtorArg = MutPtr(0L),
        pSIPClientDataCtorArg = MutPtr(0L),
        dwUIChoice = 0u,
        fdwRevocationChecks = 0u,
        dwUnionChoice = 0u,
        anonymous = WintrustData0(),
        dwStateAction = 0u,
        hWVTStateDataCtorArg = MutPtr(0L),
        pwszURLReferenceCtorArg = MutPtr(0L),
        dwProvFlags = 0u,
        dwUIContext = 0u,
        pSignatureSettingsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr<CVoid> = this.pPolicyCallbackData

    public operator fun component3(): MutPtr<CVoid> = this.pSIPClientData

    public operator fun component4(): WintrustDataUichoice = this.dwUIChoice

    public operator fun component5(): WintrustDataRevocationChecks = this.fdwRevocationChecks

    public operator fun component6(): WintrustDataUnionChoice = this.dwUnionChoice

    public operator fun component7(): WintrustData0 = this.anonymous

    public operator fun component8(): WintrustDataStateAction = this.dwStateAction

    public operator fun component9(): Handle = this.hWVTStateData

    public operator fun component10(): Pwstr = this.pwszURLReference

    public operator fun component11(): WintrustDataProviderFlags = this.dwProvFlags

    public operator fun component12(): WintrustDataUicontext = this.dwUIContext

    public operator fun component13(): MutPtr<WintrustSignatureSettings> = this.pSignatureSettings

    public fun copy(cbStruct: UInt = this.cbStruct, pPolicyCallbackData: MutPtr<CVoid> = this.pPolicyCallbackData, pSIPClientData: MutPtr<CVoid> = this.pSIPClientData, dwUIChoice: WintrustDataUichoice = this.dwUIChoice, fdwRevocationChecks: WintrustDataRevocationChecks = this.fdwRevocationChecks, dwUnionChoice: WintrustDataUnionChoice = this.dwUnionChoice, anonymous: WintrustData0 = this.anonymous, dwStateAction: WintrustDataStateAction = this.dwStateAction, hWVTStateData: Handle = this.hWVTStateData, pwszURLReference: Pwstr = this.pwszURLReference, dwProvFlags: WintrustDataProviderFlags = this.dwProvFlags, dwUIContext: WintrustDataUicontext = this.dwUIContext, pSignatureSettings: MutPtr<WintrustSignatureSettings> = this.pSignatureSettings): WintrustData = WintrustData(cbStruct = cbStruct, pPolicyCallbackDataCtorArg = pPolicyCallbackData, pSIPClientDataCtorArg = pSIPClientData, dwUIChoice = dwUIChoice, fdwRevocationChecks = fdwRevocationChecks, dwUnionChoice = dwUnionChoice, anonymous = anonymous, dwStateAction = dwStateAction, hWVTStateDataCtorArg = hWVTStateData, pwszURLReferenceCtorArg = pwszURLReference, dwProvFlags = dwProvFlags, dwUIContext = dwUIContext, pSignatureSettingsCtorArg = pSignatureSettings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustData) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pPolicyCallbackData != other.pPolicyCallbackData) return false
        if (this.pSIPClientData != other.pSIPClientData) return false
        if (this.dwUIChoice != other.dwUIChoice) return false
        if (this.fdwRevocationChecks != other.fdwRevocationChecks) return false
        if (this.dwUnionChoice != other.dwUnionChoice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwStateAction != other.dwStateAction) return false
        if (this.hWVTStateData != other.hWVTStateData) return false
        if (this.pwszURLReference != other.pwszURLReference) return false
        if (this.dwProvFlags != other.dwProvFlags) return false
        if (this.dwUIContext != other.dwUIContext) return false
        if (this.pSignatureSettings != other.pSignatureSettings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pPolicyCallbackData.hashCode()
        result = 31 * result + this.pSIPClientData.hashCode()
        result = 31 * result + this.dwUIChoice.hashCode()
        result = 31 * result + this.fdwRevocationChecks.hashCode()
        result = 31 * result + this.dwUnionChoice.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwStateAction.hashCode()
        result = 31 * result + this.hWVTStateData.hashCode()
        result = 31 * result + this.pwszURLReference.hashCode()
        result = 31 * result + this.dwProvFlags.hashCode()
        result = 31 * result + this.dwUIContext.hashCode()
        result = 31 * result + this.pSignatureSettings.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pPolicyCallbackData: MutPtr<CVoid> = MutPtr(0L),
            pSIPClientData: MutPtr<CVoid> = MutPtr(0L),
            dwUIChoice: WintrustDataUichoice = 0u,
            fdwRevocationChecks: WintrustDataRevocationChecks = 0u,
            dwUnionChoice: WintrustDataUnionChoice = 0u,
            anonymous: WintrustData0 = WintrustData0(),
            dwStateAction: WintrustDataStateAction = 0u,
            hWVTStateData: Handle = MutPtr(0L),
            pwszURLReference: Pwstr = MutPtr(0L),
            dwProvFlags: WintrustDataProviderFlags = 0u,
            dwUIContext: WintrustDataUicontext = 0u,
            pSignatureSettings: MutPtr<WintrustSignatureSettings> = MutPtr(0L),
        ): WintrustData =
            WintrustData(
                cbStruct = cbStruct,
                pPolicyCallbackDataCtorArg = pPolicyCallbackData,
                pSIPClientDataCtorArg = pSIPClientData,
                dwUIChoice = dwUIChoice,
                fdwRevocationChecks = fdwRevocationChecks,
                dwUnionChoice = dwUnionChoice,
                anonymous = anonymous,
                dwStateAction = dwStateAction,
                hWVTStateDataCtorArg = hWVTStateData,
                pwszURLReferenceCtorArg = pwszURLReference,
                dwProvFlags = dwProvFlags,
                dwUIContext = dwUIContext,
                pSignatureSettingsCtorArg = pSignatureSettings,
            )
    }
}

public class WintrustData0 internal constructor(
    pFileCtorArg: MutPtr<WintrustFileInfo>,
    pCatalogCtorArg: MutPtr<WintrustCatalogInfo>,
    pBlobCtorArg: MutPtr<WintrustBlobInfo>,
    pSgnrCtorArg: MutPtr<WintrustSgnrInfo>,
    pCertCtorArg: MutPtr<WintrustCertInfo>,
) {
    public var pFile: MutPtr<WintrustFileInfo> = pFileCtorArg
        internal set

    public var pCatalog: MutPtr<WintrustCatalogInfo> = pCatalogCtorArg
        internal set

    public var pBlob: MutPtr<WintrustBlobInfo> = pBlobCtorArg
        internal set

    public var pSgnr: MutPtr<WintrustSgnrInfo> = pSgnrCtorArg
        internal set

    public var pCert: MutPtr<WintrustCertInfo> = pCertCtorArg
        internal set

    public constructor() : this(
        pFileCtorArg = MutPtr(0L),
        pCatalogCtorArg = MutPtr(0L),
        pBlobCtorArg = MutPtr(0L),
        pSgnrCtorArg = MutPtr(0L),
        pCertCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WintrustFileInfo> = this.pFile

    public operator fun component2(): MutPtr<WintrustCatalogInfo> = this.pCatalog

    public operator fun component3(): MutPtr<WintrustBlobInfo> = this.pBlob

    public operator fun component4(): MutPtr<WintrustSgnrInfo> = this.pSgnr

    public operator fun component5(): MutPtr<WintrustCertInfo> = this.pCert

    public fun copy(pFile: MutPtr<WintrustFileInfo> = this.pFile, pCatalog: MutPtr<WintrustCatalogInfo> = this.pCatalog, pBlob: MutPtr<WintrustBlobInfo> = this.pBlob, pSgnr: MutPtr<WintrustSgnrInfo> = this.pSgnr, pCert: MutPtr<WintrustCertInfo> = this.pCert): WintrustData0 = WintrustData0(pFileCtorArg = pFile, pCatalogCtorArg = pCatalog, pBlobCtorArg = pBlob, pSgnrCtorArg = pSgnr, pCertCtorArg = pCert)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustData0) return false
        if (this.pFile != other.pFile) return false
        if (this.pCatalog != other.pCatalog) return false
        if (this.pBlob != other.pBlob) return false
        if (this.pSgnr != other.pSgnr) return false
        if (this.pCert != other.pCert) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pFile.hashCode()
        result = 31 * result + this.pCatalog.hashCode()
        result = 31 * result + this.pBlob.hashCode()
        result = 31 * result + this.pSgnr.hashCode()
        result = 31 * result + this.pCert.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pFile: MutPtr<WintrustFileInfo> = MutPtr(0L),
            pCatalog: MutPtr<WintrustCatalogInfo> = MutPtr(0L),
            pBlob: MutPtr<WintrustBlobInfo> = MutPtr(0L),
            pSgnr: MutPtr<WintrustSgnrInfo> = MutPtr(0L),
            pCert: MutPtr<WintrustCertInfo> = MutPtr(0L),
        ): WintrustData0 =
            WintrustData0(
                pFileCtorArg = pFile,
                pCatalogCtorArg = pCatalog,
                pBlobCtorArg = pBlob,
                pSgnrCtorArg = pSgnr,
                pCertCtorArg = pCert,
            )
    }
}

public class WintrustFileInfo internal constructor(
    public var cbStruct: UInt,
    pcwszFilePathCtorArg: Pcwstr,
    hFileCtorArg: Handle,
    pgKnownSubjectCtorArg: MutPtr<Guid>,
) {
    public var pcwszFilePath: Pcwstr = pcwszFilePathCtorArg
        internal set

    public var hFile: Handle = hFileCtorArg
        internal set

    public var pgKnownSubject: MutPtr<Guid> = pgKnownSubjectCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pcwszFilePathCtorArg = ConstPtr(0L),
        hFileCtorArg = MutPtr(0L),
        pgKnownSubjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pcwstr = this.pcwszFilePath

    public operator fun component3(): Handle = this.hFile

    public operator fun component4(): MutPtr<Guid> = this.pgKnownSubject

    public fun copy(cbStruct: UInt = this.cbStruct, pcwszFilePath: Pcwstr = this.pcwszFilePath, hFile: Handle = this.hFile, pgKnownSubject: MutPtr<Guid> = this.pgKnownSubject): WintrustFileInfo = WintrustFileInfo(cbStruct = cbStruct, pcwszFilePathCtorArg = pcwszFilePath, hFileCtorArg = hFile, pgKnownSubjectCtorArg = pgKnownSubject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustFileInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pcwszFilePath != other.pcwszFilePath) return false
        if (this.hFile != other.hFile) return false
        if (this.pgKnownSubject != other.pgKnownSubject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pcwszFilePath.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.pgKnownSubject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pcwszFilePath: Pcwstr = ConstPtr(0L),
            hFile: Handle = MutPtr(0L),
            pgKnownSubject: MutPtr<Guid> = MutPtr(0L),
        ): WintrustFileInfo =
            WintrustFileInfo(
                cbStruct = cbStruct,
                pcwszFilePathCtorArg = pcwszFilePath,
                hFileCtorArg = hFile,
                pgKnownSubjectCtorArg = pgKnownSubject,
            )
    }
}

public class WintrustSgnrInfo internal constructor(
    public var cbStruct: UInt,
    pcwszDisplayNameCtorArg: Pcwstr,
    psSignerInfoCtorArg: MutPtr<CmsgSignerInfo>,
    public var chStores: UInt,
    pahStoresCtorArg: MutPtr<Hcertstore>,
) {
    public var pcwszDisplayName: Pcwstr = pcwszDisplayNameCtorArg
        internal set

    public var psSignerInfo: MutPtr<CmsgSignerInfo> = psSignerInfoCtorArg
        internal set

    public var pahStores: MutPtr<Hcertstore> = pahStoresCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pcwszDisplayNameCtorArg = ConstPtr(0L),
        psSignerInfoCtorArg = MutPtr(0L),
        chStores = 0u,
        pahStoresCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pcwstr = this.pcwszDisplayName

    public operator fun component3(): MutPtr<CmsgSignerInfo> = this.psSignerInfo

    public operator fun component4(): UInt = this.chStores

    public operator fun component5(): MutPtr<Hcertstore> = this.pahStores

    public fun copy(cbStruct: UInt = this.cbStruct, pcwszDisplayName: Pcwstr = this.pcwszDisplayName, psSignerInfo: MutPtr<CmsgSignerInfo> = this.psSignerInfo, chStores: UInt = this.chStores, pahStores: MutPtr<Hcertstore> = this.pahStores): WintrustSgnrInfo = WintrustSgnrInfo(cbStruct = cbStruct, pcwszDisplayNameCtorArg = pcwszDisplayName, psSignerInfoCtorArg = psSignerInfo, chStores = chStores, pahStoresCtorArg = pahStores)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustSgnrInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pcwszDisplayName != other.pcwszDisplayName) return false
        if (this.psSignerInfo != other.psSignerInfo) return false
        if (this.chStores != other.chStores) return false
        if (this.pahStores != other.pahStores) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pcwszDisplayName.hashCode()
        result = 31 * result + this.psSignerInfo.hashCode()
        result = 31 * result + this.chStores.hashCode()
        result = 31 * result + this.pahStores.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pcwszDisplayName: Pcwstr = ConstPtr(0L),
            psSignerInfo: MutPtr<CmsgSignerInfo> = MutPtr(0L),
            chStores: UInt = 0u,
            pahStores: MutPtr<Hcertstore> = MutPtr(0L),
        ): WintrustSgnrInfo =
            WintrustSgnrInfo(
                cbStruct = cbStruct,
                pcwszDisplayNameCtorArg = pcwszDisplayName,
                psSignerInfoCtorArg = psSignerInfo,
                chStores = chStores,
                pahStoresCtorArg = pahStores,
            )
    }
}

public class WintrustSignatureSettings internal constructor(
    public var cbStruct: UInt,
    public var dwIndex: UInt,
    public var dwFlags: WintrustSignatureSettingsFlags,
    public var cSecondarySigs: UInt,
    public var dwVerifiedSigIndex: UInt,
    pCryptoPolicyCtorArg: MutPtr<CertStrongSignPara>,
) {
    public var pCryptoPolicy: MutPtr<CertStrongSignPara> = pCryptoPolicyCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwIndex = 0u,
        dwFlags = 0u,
        cSecondarySigs = 0u,
        dwVerifiedSigIndex = 0u,
        pCryptoPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwIndex

    public operator fun component3(): WintrustSignatureSettingsFlags = this.dwFlags

    public operator fun component4(): UInt = this.cSecondarySigs

    public operator fun component5(): UInt = this.dwVerifiedSigIndex

    public operator fun component6(): MutPtr<CertStrongSignPara> = this.pCryptoPolicy

    public fun copy(cbStruct: UInt = this.cbStruct, dwIndex: UInt = this.dwIndex, dwFlags: WintrustSignatureSettingsFlags = this.dwFlags, cSecondarySigs: UInt = this.cSecondarySigs, dwVerifiedSigIndex: UInt = this.dwVerifiedSigIndex, pCryptoPolicy: MutPtr<CertStrongSignPara> = this.pCryptoPolicy): WintrustSignatureSettings = WintrustSignatureSettings(cbStruct = cbStruct, dwIndex = dwIndex, dwFlags = dwFlags, cSecondarySigs = cSecondarySigs, dwVerifiedSigIndex = dwVerifiedSigIndex, pCryptoPolicyCtorArg = pCryptoPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WintrustSignatureSettings) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cSecondarySigs != other.cSecondarySigs) return false
        if (this.dwVerifiedSigIndex != other.dwVerifiedSigIndex) return false
        if (this.pCryptoPolicy != other.pCryptoPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwIndex.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cSecondarySigs.hashCode()
        result = 31 * result + this.dwVerifiedSigIndex.hashCode()
        result = 31 * result + this.pCryptoPolicy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WintrustSignatureSettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WintrustSignatureSettings> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WintrustSignatureSettings =
                    WintrustSignatureSettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CertStrongSignPara>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WintrustSignatureSettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cSecondarySigs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwVerifiedSigIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CertStrongSignPara>(64)
                    ).writeNative(addr + 24L, value.pCryptoPolicy)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwIndex: UInt = 0u,
            dwFlags: WintrustSignatureSettingsFlags = 0u,
            cSecondarySigs: UInt = 0u,
            dwVerifiedSigIndex: UInt = 0u,
            pCryptoPolicy: MutPtr<CertStrongSignPara> = MutPtr(0L),
        ): WintrustSignatureSettings =
            WintrustSignatureSettings(
                cbStruct = cbStruct,
                dwIndex = dwIndex,
                dwFlags = dwFlags,
                cSecondarySigs = cSecondarySigs,
                dwVerifiedSigIndex = dwVerifiedSigIndex,
                pCryptoPolicyCtorArg = pCryptoPolicy,
            )
    }
}

public data class WinCertificate(
    public var dwLength: UInt = 0u,
    public var wRevision: UShort = 0u,
    public var wCertificateType: UShort = 0u,
    public var bCertificate: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinCertificate) return false
        if (this.dwLength != other.dwLength) return false
        if (this.wRevision != other.wRevision) return false
        if (this.wCertificateType != other.wCertificateType) return false
        if (!this.bCertificate.contentEquals(other.bCertificate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.wRevision.hashCode()
        result = 31 * result + this.wCertificateType.hashCode()
        result = 31 * result + this.bCertificate.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinCertificate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinCertificate> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinCertificate =
                    WinCertificate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinCertificate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wCertificateType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.bCertificate)
                }
            }
    }
}

public class WinSpubTrustedPublisherData internal constructor(
    hClientTokenCtorArg: Handle,
    lpCertificateCtorArg: MutPtr<WinCertificate>,
) {
    public var hClientToken: Handle = hClientTokenCtorArg
        internal set

    public var lpCertificate: MutPtr<WinCertificate> = lpCertificateCtorArg
        internal set

    public constructor() : this(
        hClientTokenCtorArg = MutPtr(0L),
        lpCertificateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hClientToken

    public operator fun component2(): MutPtr<WinCertificate> = this.lpCertificate

    public fun copy(hClientToken: Handle = this.hClientToken, lpCertificate: MutPtr<WinCertificate> = this.lpCertificate): WinSpubTrustedPublisherData = WinSpubTrustedPublisherData(hClientTokenCtorArg = hClientToken, lpCertificateCtorArg = lpCertificate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinSpubTrustedPublisherData) return false
        if (this.hClientToken != other.hClientToken) return false
        if (this.lpCertificate != other.lpCertificate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hClientToken.hashCode()
        result = 31 * result + this.lpCertificate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hClientToken: Handle = MutPtr(0L),
            lpCertificate: MutPtr<WinCertificate> = MutPtr(0L),
        ): WinSpubTrustedPublisherData =
            WinSpubTrustedPublisherData(
                hClientTokenCtorArg = hClientToken,
                lpCertificateCtorArg = lpCertificate,
            )
    }
}

public class WinTrustActdataContextWithSubject internal constructor(
    hClientTokenCtorArg: Handle,
    subjectTypeCtorArg: MutPtr<Guid>,
    subjectCtorArg: MutPtr<CVoid>,
) {
    public var hClientToken: Handle = hClientTokenCtorArg
        internal set

    public var subjectType: MutPtr<Guid> = subjectTypeCtorArg
        internal set

    public var subject: MutPtr<CVoid> = subjectCtorArg
        internal set

    public constructor() : this(
        hClientTokenCtorArg = MutPtr(0L),
        subjectTypeCtorArg = MutPtr(0L),
        subjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hClientToken

    public operator fun component2(): MutPtr<Guid> = this.subjectType

    public operator fun component3(): MutPtr<CVoid> = this.subject

    public fun copy(hClientToken: Handle = this.hClientToken, subjectType: MutPtr<Guid> = this.subjectType, subject: MutPtr<CVoid> = this.subject): WinTrustActdataContextWithSubject = WinTrustActdataContextWithSubject(hClientTokenCtorArg = hClientToken, subjectTypeCtorArg = subjectType, subjectCtorArg = subject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinTrustActdataContextWithSubject) return false
        if (this.hClientToken != other.hClientToken) return false
        if (this.subjectType != other.subjectType) return false
        if (this.subject != other.subject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hClientToken.hashCode()
        result = 31 * result + this.subjectType.hashCode()
        result = 31 * result + this.subject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hClientToken: Handle = MutPtr(0L),
            subjectType: MutPtr<Guid> = MutPtr(0L),
            subject: MutPtr<CVoid> = MutPtr(0L),
        ): WinTrustActdataContextWithSubject =
            WinTrustActdataContextWithSubject(
                hClientTokenCtorArg = hClientToken,
                subjectTypeCtorArg = subjectType,
                subjectCtorArg = subject,
            )
    }
}

public class WinTrustActdataSubjectOnly internal constructor(
    subjectTypeCtorArg: MutPtr<Guid>,
    subjectCtorArg: MutPtr<CVoid>,
) {
    public var subjectType: MutPtr<Guid> = subjectTypeCtorArg
        internal set

    public var subject: MutPtr<CVoid> = subjectCtorArg
        internal set

    public constructor() : this(
        subjectTypeCtorArg = MutPtr(0L),
        subjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Guid> = this.subjectType

    public operator fun component2(): MutPtr<CVoid> = this.subject

    public fun copy(subjectType: MutPtr<Guid> = this.subjectType, subject: MutPtr<CVoid> = this.subject): WinTrustActdataSubjectOnly = WinTrustActdataSubjectOnly(subjectTypeCtorArg = subjectType, subjectCtorArg = subject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinTrustActdataSubjectOnly) return false
        if (this.subjectType != other.subjectType) return false
        if (this.subject != other.subject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subjectType.hashCode()
        result = 31 * result + this.subject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinTrustActdataSubjectOnly> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinTrustActdataSubjectOnly> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinTrustActdataSubjectOnly =
                    WinTrustActdataSubjectOnly(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinTrustActdataSubjectOnly) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr, value.subjectType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.subject)
                }
            }

        public operator fun invoke(
            subjectType: MutPtr<Guid> = MutPtr(0L),
            subject: MutPtr<CVoid> = MutPtr(0L),
        ): WinTrustActdataSubjectOnly =
            WinTrustActdataSubjectOnly(
                subjectTypeCtorArg = subjectType,
                subjectCtorArg = subject,
            )
    }
}

public class WinTrustSubjectFile internal constructor(
    hFileCtorArg: Handle,
    lpPathCtorArg: Pcwstr,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public var lpPath: Pcwstr = lpPathCtorArg
        internal set

    public constructor() : this(
        hFileCtorArg = MutPtr(0L),
        lpPathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Handle = this.hFile

    public operator fun component2(): Pcwstr = this.lpPath

    public fun copy(hFile: Handle = this.hFile, lpPath: Pcwstr = this.lpPath): WinTrustSubjectFile = WinTrustSubjectFile(hFileCtorArg = hFile, lpPathCtorArg = lpPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinTrustSubjectFile) return false
        if (this.hFile != other.hFile) return false
        if (this.lpPath != other.lpPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hFile.hashCode()
        result = 31 * result + this.lpPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hFile: Handle = MutPtr(0L),
            lpPath: Pcwstr = ConstPtr(0L),
        ): WinTrustSubjectFile =
            WinTrustSubjectFile(
                hFileCtorArg = hFile,
                lpPathCtorArg = lpPath,
            )
    }
}

public class WinTrustSubjectFileAndDisplay internal constructor(
    hFileCtorArg: Handle,
    lpPathCtorArg: Pcwstr,
    lpDisplayNameCtorArg: Pcwstr,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public var lpPath: Pcwstr = lpPathCtorArg
        internal set

    public var lpDisplayName: Pcwstr = lpDisplayNameCtorArg
        internal set

    public constructor() : this(
        hFileCtorArg = MutPtr(0L),
        lpPathCtorArg = ConstPtr(0L),
        lpDisplayNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Handle = this.hFile

    public operator fun component2(): Pcwstr = this.lpPath

    public operator fun component3(): Pcwstr = this.lpDisplayName

    public fun copy(hFile: Handle = this.hFile, lpPath: Pcwstr = this.lpPath, lpDisplayName: Pcwstr = this.lpDisplayName): WinTrustSubjectFileAndDisplay = WinTrustSubjectFileAndDisplay(hFileCtorArg = hFile, lpPathCtorArg = lpPath, lpDisplayNameCtorArg = lpDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinTrustSubjectFileAndDisplay) return false
        if (this.hFile != other.hFile) return false
        if (this.lpPath != other.lpPath) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hFile.hashCode()
        result = 31 * result + this.lpPath.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hFile: Handle = MutPtr(0L),
            lpPath: Pcwstr = ConstPtr(0L),
            lpDisplayName: Pcwstr = ConstPtr(0L),
        ): WinTrustSubjectFileAndDisplay =
            WinTrustSubjectFileAndDisplay(
                hFileCtorArg = hFile,
                lpPathCtorArg = lpPath,
                lpDisplayNameCtorArg = lpDisplayName,
            )
    }
}

public class WtdGenericChainPolicyCreateInfo internal constructor(
    public var anonymous: WtdGenericChainPolicyCreateInfo0,
    hChainEngineCtorArg: Hcertchainengine,
    pChainParaCtorArg: MutPtr<CertChainPara>,
    public var dwFlags: UInt,
    pvReservedCtorArg: MutPtr<CVoid>,
) {
    public var hChainEngine: Hcertchainengine = hChainEngineCtorArg
        internal set

    public var pChainPara: MutPtr<CertChainPara> = pChainParaCtorArg
        internal set

    public var pvReserved: MutPtr<CVoid> = pvReservedCtorArg
        internal set

    public constructor() : this(
        anonymous = WtdGenericChainPolicyCreateInfo0(),
        hChainEngineCtorArg = MutPtr(0L),
        pChainParaCtorArg = MutPtr(0L),
        dwFlags = 0u,
        pvReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WtdGenericChainPolicyCreateInfo0 = this.anonymous

    public operator fun component2(): Hcertchainengine = this.hChainEngine

    public operator fun component3(): MutPtr<CertChainPara> = this.pChainPara

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): MutPtr<CVoid> = this.pvReserved

    public fun copy(anonymous: WtdGenericChainPolicyCreateInfo0 = this.anonymous, hChainEngine: Hcertchainengine = this.hChainEngine, pChainPara: MutPtr<CertChainPara> = this.pChainPara, dwFlags: UInt = this.dwFlags, pvReserved: MutPtr<CVoid> = this.pvReserved): WtdGenericChainPolicyCreateInfo = WtdGenericChainPolicyCreateInfo(anonymous = anonymous, hChainEngineCtorArg = hChainEngine, pChainParaCtorArg = pChainPara, dwFlags = dwFlags, pvReservedCtorArg = pvReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtdGenericChainPolicyCreateInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.hChainEngine != other.hChainEngine) return false
        if (this.pChainPara != other.pChainPara) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pvReserved != other.pvReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.hChainEngine.hashCode()
        result = 31 * result + this.pChainPara.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pvReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: WtdGenericChainPolicyCreateInfo0 = WtdGenericChainPolicyCreateInfo0(),
            hChainEngine: Hcertchainengine = MutPtr(0L),
            pChainPara: MutPtr<CertChainPara> = MutPtr(0L),
            dwFlags: UInt = 0u,
            pvReserved: MutPtr<CVoid> = MutPtr(0L),
        ): WtdGenericChainPolicyCreateInfo =
            WtdGenericChainPolicyCreateInfo(
                anonymous = anonymous,
                hChainEngineCtorArg = hChainEngine,
                pChainParaCtorArg = pChainPara,
                dwFlags = dwFlags,
                pvReservedCtorArg = pvReserved,
            )
    }
}

public data class WtdGenericChainPolicyCreateInfo0(
    public var cbStruct: UInt = 0u,
    public var cbSize: UInt = 0u,
)

public class WtdGenericChainPolicyData internal constructor(
    public var anonymous: WtdGenericChainPolicyData0,
    pSignerChainInfoCtorArg: MutPtr<WtdGenericChainPolicyCreateInfo>,
    pCounterSignerChainInfoCtorArg: MutPtr<WtdGenericChainPolicyCreateInfo>,
    public var pfnPolicyCallback: PfnWtdGenericChainPolicyCallback,
    pvPolicyArgCtorArg: MutPtr<CVoid>,
) {
    public var pSignerChainInfo: MutPtr<WtdGenericChainPolicyCreateInfo> = pSignerChainInfoCtorArg
        internal set

    public var pCounterSignerChainInfo: MutPtr<WtdGenericChainPolicyCreateInfo> = pCounterSignerChainInfoCtorArg
        internal set

    public var pvPolicyArg: MutPtr<CVoid> = pvPolicyArgCtorArg
        internal set

    public constructor() : this(
        anonymous = WtdGenericChainPolicyData0(),
        pSignerChainInfoCtorArg = MutPtr(0L),
        pCounterSignerChainInfoCtorArg = MutPtr(0L),
        pfnPolicyCallback = null,
        pvPolicyArgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WtdGenericChainPolicyData0 = this.anonymous

    public operator fun component2(): MutPtr<WtdGenericChainPolicyCreateInfo> = this.pSignerChainInfo

    public operator fun component3(): MutPtr<WtdGenericChainPolicyCreateInfo> = this.pCounterSignerChainInfo

    public operator fun component4(): PfnWtdGenericChainPolicyCallback = this.pfnPolicyCallback

    public operator fun component5(): MutPtr<CVoid> = this.pvPolicyArg

    public fun copy(anonymous: WtdGenericChainPolicyData0 = this.anonymous, pSignerChainInfo: MutPtr<WtdGenericChainPolicyCreateInfo> = this.pSignerChainInfo, pCounterSignerChainInfo: MutPtr<WtdGenericChainPolicyCreateInfo> = this.pCounterSignerChainInfo, pfnPolicyCallback: PfnWtdGenericChainPolicyCallback = this.pfnPolicyCallback, pvPolicyArg: MutPtr<CVoid> = this.pvPolicyArg): WtdGenericChainPolicyData = WtdGenericChainPolicyData(anonymous = anonymous, pSignerChainInfoCtorArg = pSignerChainInfo, pCounterSignerChainInfoCtorArg = pCounterSignerChainInfo, pfnPolicyCallback = pfnPolicyCallback, pvPolicyArgCtorArg = pvPolicyArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtdGenericChainPolicyData) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pSignerChainInfo != other.pSignerChainInfo) return false
        if (this.pCounterSignerChainInfo != other.pCounterSignerChainInfo) return false
        if (this.pfnPolicyCallback != other.pfnPolicyCallback) return false
        if (this.pvPolicyArg != other.pvPolicyArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.pSignerChainInfo.hashCode()
        result = 31 * result + this.pCounterSignerChainInfo.hashCode()
        result = 31 * result + this.pfnPolicyCallback.hashCode()
        result = 31 * result + this.pvPolicyArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: WtdGenericChainPolicyData0 = WtdGenericChainPolicyData0(),
            pSignerChainInfo: MutPtr<WtdGenericChainPolicyCreateInfo> = MutPtr(0L),
            pCounterSignerChainInfo: MutPtr<WtdGenericChainPolicyCreateInfo> = MutPtr(0L),
            pfnPolicyCallback: PfnWtdGenericChainPolicyCallback = null,
            pvPolicyArg: MutPtr<CVoid> = MutPtr(0L),
        ): WtdGenericChainPolicyData =
            WtdGenericChainPolicyData(
                anonymous = anonymous,
                pSignerChainInfoCtorArg = pSignerChainInfo,
                pCounterSignerChainInfoCtorArg = pCounterSignerChainInfo,
                pfnPolicyCallback = pfnPolicyCallback,
                pvPolicyArgCtorArg = pvPolicyArg,
            )
    }
}

public data class WtdGenericChainPolicyData0(
    public var cbStruct: UInt = 0u,
    public var cbSize: UInt = 0u,
)

public class WtdGenericChainPolicySignerInfo internal constructor(
    public var anonymous: WtdGenericChainPolicySignerInfo0,
    pChainContextCtorArg: MutPtr<CertChainContext>,
    public var dwSignerType: UInt,
    pMsgSignerInfoCtorArg: MutPtr<CmsgSignerInfo>,
    public var dwError: UInt,
    public var cCounterSigner: UInt,
    rgpCounterSignerCtorArg: MutPtr<MutPtr<WtdGenericChainPolicySignerInfo>>,
) {
    public var pChainContext: MutPtr<CertChainContext> = pChainContextCtorArg
        internal set

    public var pMsgSignerInfo: MutPtr<CmsgSignerInfo> = pMsgSignerInfoCtorArg
        internal set

    public var rgpCounterSigner: MutPtr<MutPtr<WtdGenericChainPolicySignerInfo>> = rgpCounterSignerCtorArg
        internal set

    public constructor() : this(
        anonymous = WtdGenericChainPolicySignerInfo0(),
        pChainContextCtorArg = MutPtr(0L),
        dwSignerType = 0u,
        pMsgSignerInfoCtorArg = MutPtr(0L),
        dwError = 0u,
        cCounterSigner = 0u,
        rgpCounterSignerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WtdGenericChainPolicySignerInfo0 = this.anonymous

    public operator fun component2(): MutPtr<CertChainContext> = this.pChainContext

    public operator fun component3(): UInt = this.dwSignerType

    public operator fun component4(): MutPtr<CmsgSignerInfo> = this.pMsgSignerInfo

    public operator fun component5(): UInt = this.dwError

    public operator fun component6(): UInt = this.cCounterSigner

    public operator fun component7(): MutPtr<MutPtr<WtdGenericChainPolicySignerInfo>> = this.rgpCounterSigner

    public fun copy(anonymous: WtdGenericChainPolicySignerInfo0 = this.anonymous, pChainContext: MutPtr<CertChainContext> = this.pChainContext, dwSignerType: UInt = this.dwSignerType, pMsgSignerInfo: MutPtr<CmsgSignerInfo> = this.pMsgSignerInfo, dwError: UInt = this.dwError, cCounterSigner: UInt = this.cCounterSigner, rgpCounterSigner: MutPtr<MutPtr<WtdGenericChainPolicySignerInfo>> = this.rgpCounterSigner): WtdGenericChainPolicySignerInfo = WtdGenericChainPolicySignerInfo(anonymous = anonymous, pChainContextCtorArg = pChainContext, dwSignerType = dwSignerType, pMsgSignerInfoCtorArg = pMsgSignerInfo, dwError = dwError, cCounterSigner = cCounterSigner, rgpCounterSignerCtorArg = rgpCounterSigner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtdGenericChainPolicySignerInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pChainContext != other.pChainContext) return false
        if (this.dwSignerType != other.dwSignerType) return false
        if (this.pMsgSignerInfo != other.pMsgSignerInfo) return false
        if (this.dwError != other.dwError) return false
        if (this.cCounterSigner != other.cCounterSigner) return false
        if (this.rgpCounterSigner != other.rgpCounterSigner) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.pChainContext.hashCode()
        result = 31 * result + this.dwSignerType.hashCode()
        result = 31 * result + this.pMsgSignerInfo.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.cCounterSigner.hashCode()
        result = 31 * result + this.rgpCounterSigner.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: WtdGenericChainPolicySignerInfo0 = WtdGenericChainPolicySignerInfo0(),
            pChainContext: MutPtr<CertChainContext> = MutPtr(0L),
            dwSignerType: UInt = 0u,
            pMsgSignerInfo: MutPtr<CmsgSignerInfo> = MutPtr(0L),
            dwError: UInt = 0u,
            cCounterSigner: UInt = 0u,
            rgpCounterSigner: MutPtr<MutPtr<WtdGenericChainPolicySignerInfo>> = MutPtr(0L),
        ): WtdGenericChainPolicySignerInfo =
            WtdGenericChainPolicySignerInfo(
                anonymous = anonymous,
                pChainContextCtorArg = pChainContext,
                dwSignerType = dwSignerType,
                pMsgSignerInfoCtorArg = pMsgSignerInfo,
                dwError = dwError,
                cCounterSigner = cCounterSigner,
                rgpCounterSignerCtorArg = rgpCounterSigner,
            )
    }
}

public data class WtdGenericChainPolicySignerInfo0(
    public var cbStruct: UInt = 0u,
    public var cbSize: UInt = 0u,
)
