@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class CAT_MEMBERINFO(public var pwszSubjGuid: PWSTR = 0L, public var dwCertVersion: UInt = 0u)

public data class CAT_MEMBERINFO2(public var SubjectGuid: GUID = GUID(), public var dwCertVersion: UInt = 0u)

public data class CAT_NAMEVALUE(
    public var pwszTag: PWSTR = 0L,
    public var fdwFlags: UInt = 0u,
    public var Value: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
)

public data class CONFIG_CI_PROV_INFO(
    public var cbSize: UInt = 0u,
    public var dwPolicies: UInt = 0u,
    public var pPolicies: Long = 0L,
    public var result: CONFIG_CI_PROV_INFO_RESULT = CONFIG_CI_PROV_INFO_RESULT(),
    public var dwScenario: UInt = 0u,
    public var result2: Long = 0L,
)

public data class CONFIG_CI_PROV_INFO_RESULT(
    public var hr: HRESULT = 0,
    public var dwResult: UInt = 0u,
    public var dwPolicyIndex: UInt = 0u,
    public var fIsExplicitDeny: Boolean = false,
)

public data class CONFIG_CI_PROV_INFO_RESULT2(
    public var cbSize: UInt = 0u,
    public var hr: HRESULT = 0,
    public var dwResult: UInt = 0u,
    public var dwPolicyIndex: UInt = 0u,
    public var fIsExplicitDeny: Boolean = false,
    public var cbCalculatedFileHash: UInt = 0u,
    public var pbCalculatedFileHash: Long = 0L,
)

public data class CRYPT_PROVIDER_CERT(
    public var cbStruct: UInt = 0u,
    public var pCert: Long = 0L,
    public var fCommercial: BOOL = 0,
    public var fTrustedRoot: BOOL = 0,
    public var fSelfSigned: BOOL = 0,
    public var fTestCert: BOOL = 0,
    public var dwRevokedReason: UInt = 0u,
    public var dwConfidence: UInt = 0u,
    public var dwError: UInt = 0u,
    public var pTrustListContext: Long = 0L,
    public var fTrustListSignerCert: BOOL = 0,
    public var pCtlContext: Long = 0L,
    public var dwCtlError: UInt = 0u,
    public var fIsCyclic: BOOL = 0,
    public var pChainElement: Long = 0L,
)

public class CRYPT_PROVIDER_DATA(
    public var cbStruct: UInt = 0u,
    public var pWintrustData: Long = 0L,
    public var fOpenedFile: BOOL = 0,
    public var hWndParent: Foundation.HWND = Foundation.HWND(),
    public var pgActionID: Long = 0L,
    public var hProv: ULong = 0uL,
    public var dwError: UInt = 0u,
    public var dwRegSecuritySettings: UInt = 0u,
    public var dwRegPolicySettings: UInt = 0u,
    public var psPfns: Long = 0L,
    public var cdwTrustStepErrors: UInt = 0u,
    public var padwTrustStepErrors: Long = 0L,
    public var chStores: UInt = 0u,
    public var pahStores: Long = 0L,
    public var dwEncoding: UInt = 0u,
    public var hMsg: Long = 0L,
    public var csSigners: UInt = 0u,
    public var pasSigners: Long = 0L,
    public var csProvPrivData: UInt = 0u,
    public var pasProvPrivData: Long = 0L,
    public var dwSubjectChoice: UInt = 0u,
    public var Anonymous: CRYPT_PROVIDER_DATA_0 = CRYPT_PROVIDER_DATA_0(),
    public var pszUsageOID: PSTR = 0L,
    public var fRecallWithState: BOOL = 0,
    public var sftSystemTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var pszCTLSignerUsageOID: PSTR = 0L,
    public var dwProvFlags: UInt = 0u,
    public var dwFinalError: UInt = 0u,
    public var pRequestUsage: Long = 0L,
    public var dwTrustPubSettings: UInt = 0u,
    public var dwUIStateFlags: UInt = 0u,
    public var pSigState: Long = 0L,
    public var pSigSettings: Long = 0L,
)

public data class CRYPT_PROVIDER_DATA_0(public var pPDSip: Long = 0L)

public data class CRYPT_PROVIDER_DEFUSAGE(
    public var cbStruct: UInt = 0u,
    public var gActionID: GUID = GUID(),
    public var pDefPolicyCallbackData: Long = 0L,
    public var pDefSIPClientData: Long = 0L,
)

public data class CRYPT_PROVIDER_FUNCTIONS(
    public var cbStruct: UInt = 0u,
    public var pfnAlloc: PFN_CPD_MEM_ALLOC = null,
    public var pfnFree: PFN_CPD_MEM_FREE = null,
    public var pfnAddStore2Chain: PFN_CPD_ADD_STORE = null,
    public var pfnAddSgnr2Chain: PFN_CPD_ADD_SGNR = null,
    public var pfnAddCert2Chain: PFN_CPD_ADD_CERT = null,
    public var pfnAddPrivData2Chain: PFN_CPD_ADD_PRIVDATA = null,
    public var pfnInitialize: PFN_PROVIDER_INIT_CALL = null,
    public var pfnObjectTrust: PFN_PROVIDER_OBJTRUST_CALL = null,
    public var pfnSignatureTrust: PFN_PROVIDER_SIGTRUST_CALL = null,
    public var pfnCertificateTrust: PFN_PROVIDER_CERTTRUST_CALL = null,
    public var pfnFinalPolicy: PFN_PROVIDER_FINALPOLICY_CALL = null,
    public var pfnCertCheckPolicy: PFN_PROVIDER_CERTCHKPOLICY_CALL = null,
    public var pfnTestFinalPolicy: PFN_PROVIDER_TESTFINALPOLICY_CALL = null,
    public var psUIpfns: Long = 0L,
    public var pfnCleanupPolicy: PFN_PROVIDER_CLEANUP_CALL = null,
)

public data class CRYPT_PROVIDER_PRIVDATA(
    public var cbStruct: UInt = 0u,
    public var gProviderID: GUID = GUID(),
    public var cbProvData: UInt = 0u,
    public var pvProvData: Long = 0L,
)

public data class CRYPT_PROVIDER_REGDEFUSAGE(
    public var cbStruct: UInt = 0u,
    public var pgActionID: Long = 0L,
    public var pwszDllName: PWSTR = 0L,
    public var pwszLoadCallbackDataFunctionName: PSTR = 0L,
    public var pwszFreeCallbackDataFunctionName: PSTR = 0L,
)

public data class CRYPT_PROVIDER_SGNR(
    public var cbStruct: UInt = 0u,
    public var sftVerifyAsOf: Foundation.FILETIME = Foundation.FILETIME(),
    public var csCertChain: UInt = 0u,
    public var pasCertChain: Long = 0L,
    public var dwSignerType: UInt = 0u,
    public var psSigner: Long = 0L,
    public var dwError: UInt = 0u,
    public var csCounterSigners: UInt = 0u,
    public var pasCounterSigners: Long = 0L,
    public var pChainContext: Long = 0L,
)

public data class CRYPT_PROVIDER_SIGSTATE(
    public var cbStruct: UInt = 0u,
    public var rhSecondarySigs: Long = 0L,
    public var hPrimarySig: Long = 0L,
    public var fFirstAttemptMade: BOOL = 0,
    public var fNoMoreSigs: BOOL = 0,
    public var cSecondarySigs: UInt = 0u,
    public var dwCurrentIndex: UInt = 0u,
    public var fSupportMultiSig: BOOL = 0,
    public var dwCryptoPolicySupport: UInt = 0u,
    public var iAttemptCount: UInt = 0u,
    public var fCheckedSealing: BOOL = 0,
    public var pSealingSignature: Long = 0L,
)

public data class CRYPT_PROVUI_DATA(
    public var cbStruct: UInt = 0u,
    public var dwFinalError: UInt = 0u,
    public var pYesButtonText: PWSTR = 0L,
    public var pNoButtonText: PWSTR = 0L,
    public var pMoreInfoButtonText: PWSTR = 0L,
    public var pAdvancedLinkText: PWSTR = 0L,
    public var pCopyActionText: PWSTR = 0L,
    public var pCopyActionTextNoTS: PWSTR = 0L,
    public var pCopyActionTextNotSigned: PWSTR = 0L,
)

public data class CRYPT_PROVUI_FUNCS(
    public var cbStruct: UInt = 0u,
    public var psUIData: Long = 0L,
    public var pfnOnMoreInfoClick: PFN_PROVUI_CALL = null,
    public var pfnOnMoreInfoClickDefault: PFN_PROVUI_CALL = null,
    public var pfnOnAdvancedClick: PFN_PROVUI_CALL = null,
    public var pfnOnAdvancedClickDefault: PFN_PROVUI_CALL = null,
)

public data class CRYPT_REGISTER_ACTIONID(
    public var cbStruct: UInt = 0u,
    public var sInitProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
    public var sObjectProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
    public var sSignatureProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
    public var sCertificateProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
    public var sCertificatePolicyProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
    public var sFinalPolicyProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
    public var sTestPolicyProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
    public var sCleanupProvider: CRYPT_TRUST_REG_ENTRY = CRYPT_TRUST_REG_ENTRY(),
)

public data class CRYPT_TRUST_REG_ENTRY(
    public var cbStruct: UInt = 0u,
    public var pwszDLLName: PWSTR = 0L,
    public var pwszFunctionName: PWSTR = 0L,
)

public data class DRIVER_VER_INFO(
    public var cbStruct: UInt = 0u,
    public var dwReserved1: ULong = 0uL,
    public var dwReserved2: ULong = 0uL,
    public var dwPlatform: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var wszVersion: UShortArray = UShortArray(260),
    public var wszSignedBy: UShortArray = UShortArray(260),
    public var pcSignerCertContext: Long = 0L,
    public var sOSVersionLow: DRIVER_VER_MAJORMINOR = DRIVER_VER_MAJORMINOR(),
    public var sOSVersionHigh: DRIVER_VER_MAJORMINOR = DRIVER_VER_MAJORMINOR(),
    public var dwBuildNumberLow: UInt = 0u,
    public var dwBuildNumberHigh: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DRIVER_VER_INFO) return false
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
}

public data class DRIVER_VER_MAJORMINOR(public var dwMajor: UInt = 0u, public var dwMinor: UInt = 0u)

public data class INTENT_TO_SEAL_ATTRIBUTE(public var version: UInt = 0u, public var seal: Boolean = false)

public data class PROVDATA_SIP(
    public var cbStruct: UInt = 0u,
    public var gSubject: GUID = GUID(),
    public var pSip: Long = 0L,
    public var pCATSip: Long = 0L,
    public var psSipSubjectInfo: Long = 0L,
    public var psSipCATSubjectInfo: Long = 0L,
    public var psIndirectData: Long = 0L,
)

public data class SEALING_SIGNATURE_ATTRIBUTE(
    public var version: UInt = 0u,
    public var signerIndex: UInt = 0u,
    public var signatureAlgorithm: Cryptography.CRYPT_ALGORITHM_IDENTIFIER = Cryptography.CRYPT_ALGORITHM_IDENTIFIER(),
    public var encryptedDigest: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
)

public data class SEALING_TIMESTAMP_ATTRIBUTE(
    public var version: UInt = 0u,
    public var signerIndex: UInt = 0u,
    public var sealTimeStampToken: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
)

public data class SPC_FINANCIAL_CRITERIA(public var fFinancialInfoAvailable: BOOL = 0, public var fMeetsCriteria: BOOL = 0)

public data class SPC_IMAGE(
    public var pImageLink: Long = 0L,
    public var Bitmap: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
    public var Metafile: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
    public var EnhancedMetafile: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
    public var GifFile: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
)

public data class SPC_INDIRECT_DATA_CONTENT(
    public var Data: Cryptography.CRYPT_ATTRIBUTE_TYPE_VALUE = Cryptography.CRYPT_ATTRIBUTE_TYPE_VALUE(),
    public var DigestAlgorithm: Cryptography.CRYPT_ALGORITHM_IDENTIFIER = Cryptography.CRYPT_ALGORITHM_IDENTIFIER(),
    public var Digest: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB(),
)

public data class SPC_LINK(public var dwLinkChoice: UInt = 0u, public var Anonymous: SPC_LINK_0 = SPC_LINK_0())

public data class SPC_LINK_0(
    public var pwszUrl: PWSTR = 0L,
    public var Moniker: SPC_SERIALIZED_OBJECT = SPC_SERIALIZED_OBJECT(),
    public var pwszFile: PWSTR = 0L,
)

public data class SPC_PE_IMAGE_DATA(public var Flags: Cryptography.CRYPT_BIT_BLOB = Cryptography.CRYPT_BIT_BLOB(), public var pFile: Long = 0L)

public data class SPC_SERIALIZED_OBJECT(public var ClassId: UByteArray = UByteArray(16), public var SerializedData: Cryptography.CRYPT_INTEGER_BLOB = Cryptography.CRYPT_INTEGER_BLOB()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SPC_SERIALIZED_OBJECT) return false
        if (!this.ClassId.contentEquals(other.ClassId)) return false
        if (this.SerializedData != other.SerializedData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClassId.contentHashCode()
        result = 31 * result + this.SerializedData.hashCode()
        return result
    }
}

public data class SPC_SIGINFO(
    public var dwSipVersion: UInt = 0u,
    public var gSIPGuid: GUID = GUID(),
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var dwReserved5: UInt = 0u,
)

public data class SPC_SP_AGENCY_INFO(
    public var pPolicyInformation: Long = 0L,
    public var pwszPolicyDisplayText: PWSTR = 0L,
    public var pLogoImage: Long = 0L,
    public var pLogoLink: Long = 0L,
)

public data class SPC_SP_OPUS_INFO(
    public var pwszProgramName: PCWSTR = 0L,
    public var pMoreInfo: Long = 0L,
    public var pPublisherInfo: Long = 0L,
)

public data class SPC_STATEMENT_TYPE(public var cKeyPurposeId: UInt = 0u, public var rgpszKeyPurposeId: Long = 0L)

public data class WINTRUST_BLOB_INFO(
    public var cbStruct: UInt = 0u,
    public var gSubject: GUID = GUID(),
    public var pcwszDisplayName: PCWSTR = 0L,
    public var cbMemObject: UInt = 0u,
    public var pbMemObject: Long = 0L,
    public var cbMemSignedMsg: UInt = 0u,
    public var pbMemSignedMsg: Long = 0L,
)

public data class WINTRUST_CATALOG_INFO(
    public var cbStruct: UInt = 0u,
    public var dwCatalogVersion: UInt = 0u,
    public var pcwszCatalogFilePath: PCWSTR = 0L,
    public var pcwszMemberTag: PCWSTR = 0L,
    public var pcwszMemberFilePath: PCWSTR = 0L,
    public var hMemberFile: Foundation.HANDLE = Foundation.HANDLE(),
    public var pbCalculatedFileHash: Long = 0L,
    public var cbCalculatedFileHash: UInt = 0u,
    public var pcCatalogContext: Long = 0L,
    public var hCatAdmin: Long = 0L,
)

public data class WINTRUST_CERT_INFO(
    public var cbStruct: UInt = 0u,
    public var pcwszDisplayName: PCWSTR = 0L,
    public var psCertContext: Long = 0L,
    public var chStores: UInt = 0u,
    public var pahStores: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var psftVerifyAsOf: Long = 0L,
)

public data class WINTRUST_DATA(
    public var cbStruct: UInt = 0u,
    public var pPolicyCallbackData: Long = 0L,
    public var pSIPClientData: Long = 0L,
    public var dwUIChoice: WINTRUST_DATA_UICHOICE = 0u,
    public var fdwRevocationChecks: WINTRUST_DATA_REVOCATION_CHECKS = 0u,
    public var dwUnionChoice: WINTRUST_DATA_UNION_CHOICE = 0u,
    public var Anonymous: WINTRUST_DATA_0 = WINTRUST_DATA_0(),
    public var dwStateAction: WINTRUST_DATA_STATE_ACTION = 0u,
    public var hWVTStateData: Foundation.HANDLE = Foundation.HANDLE(),
    public var pwszURLReference: PWSTR = 0L,
    public var dwProvFlags: WINTRUST_DATA_PROVIDER_FLAGS = 0u,
    public var dwUIContext: WINTRUST_DATA_UICONTEXT = 0u,
    public var pSignatureSettings: Long = 0L,
)

public data class WINTRUST_DATA_0(
    public var pFile: Long = 0L,
    public var pCatalog: Long = 0L,
    public var pBlob: Long = 0L,
    public var pSgnr: Long = 0L,
    public var pCert: Long = 0L,
)

public data class WINTRUST_FILE_INFO(
    public var cbStruct: UInt = 0u,
    public var pcwszFilePath: PCWSTR = 0L,
    public var hFile: Foundation.HANDLE = Foundation.HANDLE(),
    public var pgKnownSubject: Long = 0L,
)

public data class WINTRUST_SGNR_INFO(
    public var cbStruct: UInt = 0u,
    public var pcwszDisplayName: PCWSTR = 0L,
    public var psSignerInfo: Long = 0L,
    public var chStores: UInt = 0u,
    public var pahStores: Long = 0L,
)

public data class WINTRUST_SIGNATURE_SETTINGS(
    public var cbStruct: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwFlags: WINTRUST_SIGNATURE_SETTINGS_FLAGS = 0u,
    public var cSecondarySigs: UInt = 0u,
    public var dwVerifiedSigIndex: UInt = 0u,
    public var pCryptoPolicy: Long = 0L,
)

public data class WIN_CERTIFICATE(
    public var dwLength: UInt = 0u,
    public var wRevision: UShort = 0u,
    public var wCertificateType: UShort = 0u,
    public var bCertificate: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WIN_CERTIFICATE) return false
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
}

public data class WIN_SPUB_TRUSTED_PUBLISHER_DATA(public var hClientToken: Foundation.HANDLE = Foundation.HANDLE(), public var lpCertificate: Long = 0L)

public data class WIN_TRUST_ACTDATA_CONTEXT_WITH_SUBJECT(
    public var hClientToken: Foundation.HANDLE = Foundation.HANDLE(),
    public var SubjectType: Long = 0L,
    public var Subject: Long = 0L,
)

public data class WIN_TRUST_ACTDATA_SUBJECT_ONLY(public var SubjectType: Long = 0L, public var Subject: Long = 0L)

public data class WIN_TRUST_SUBJECT_FILE(public var hFile: Foundation.HANDLE = Foundation.HANDLE(), public var lpPath: PCWSTR = 0L)

public data class WIN_TRUST_SUBJECT_FILE_AND_DISPLAY(
    public var hFile: Foundation.HANDLE = Foundation.HANDLE(),
    public var lpPath: PCWSTR = 0L,
    public var lpDisplayName: PCWSTR = 0L,
)

public data class WTD_GENERIC_CHAIN_POLICY_CREATE_INFO(
    public var Anonymous: WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0 = WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0(),
    public var hChainEngine: Cryptography.HCERTCHAINENGINE = Cryptography.HCERTCHAINENGINE(),
    public var pChainPara: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var pvReserved: Long = 0L,
)

public data class WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0(public var cbStruct: UInt = 0u, public var cbSize: UInt = 0u)

public data class WTD_GENERIC_CHAIN_POLICY_DATA(
    public var Anonymous: WTD_GENERIC_CHAIN_POLICY_DATA_0 = WTD_GENERIC_CHAIN_POLICY_DATA_0(),
    public var pSignerChainInfo: Long = 0L,
    public var pCounterSignerChainInfo: Long = 0L,
    public var pfnPolicyCallback: PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACK = null,
    public var pvPolicyArg: Long = 0L,
)

public data class WTD_GENERIC_CHAIN_POLICY_DATA_0(public var cbStruct: UInt = 0u, public var cbSize: UInt = 0u)

public data class WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO(
    public var Anonymous: WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0 = WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0(),
    public var pChainContext: Long = 0L,
    public var dwSignerType: UInt = 0u,
    public var pMsgSignerInfo: Long = 0L,
    public var dwError: UInt = 0u,
    public var cCounterSigner: UInt = 0u,
    public var rgpCounterSigner: Long = 0L,
)

public data class WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0(public var cbStruct: UInt = 0u, public var cbSize: UInt = 0u)
