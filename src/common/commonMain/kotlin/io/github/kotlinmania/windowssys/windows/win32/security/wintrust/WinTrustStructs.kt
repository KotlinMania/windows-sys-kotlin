@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.windowssys.COpaquePointer
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

public data class CatMemberinfo(public var pwszSubjGuid: Pwstr = null, public var dwCertVersion: UInt = 0u)

public data class CatMemberinfo2(public var subjectGuid: Guid = Guid(), public var dwCertVersion: UInt = 0u)

public data class CatNamevalue(
    public var pwszTag: Pwstr = null,
    public var fdwFlags: UInt = 0u,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class ConfigCiProvInfo(
    public var cbSize: UInt = 0u,
    public var dwPolicies: UInt = 0u,
    public var pPolicies: CryptIntegerBlob? = null,
    public var result: ConfigCiProvInfoResult = ConfigCiProvInfoResult(),
    public var dwScenario: UInt = 0u,
    public var result2: ConfigCiProvInfoResult2? = null,
)

public data class ConfigCiProvInfoResult(
    public var hr: Hresult = 0,
    public var dwResult: UInt = 0u,
    public var dwPolicyIndex: UInt = 0u,
    public var fIsExplicitDeny: Boolean = false,
)

public data class ConfigCiProvInfoResult2(
    public var cbSize: UInt = 0u,
    public var hr: Hresult = 0,
    public var dwResult: UInt = 0u,
    public var dwPolicyIndex: UInt = 0u,
    public var fIsExplicitDeny: Boolean = false,
    public var cbCalculatedFileHash: UInt = 0u,
    public var pbCalculatedFileHash: COpaquePointer? = null,
)

public data class CryptProviderCert(
    public var cbStruct: UInt = 0u,
    public var pCert: CertContext? = null,
    public var fCommercial: Bool = 0,
    public var fTrustedRoot: Bool = 0,
    public var fSelfSigned: Bool = 0,
    public var fTestCert: Bool = 0,
    public var dwRevokedReason: UInt = 0u,
    public var dwConfidence: UInt = 0u,
    public var dwError: UInt = 0u,
    public var pTrustListContext: CtlContext? = null,
    public var fTrustListSignerCert: Bool = 0,
    public var pCtlContext: CtlContext? = null,
    public var dwCtlError: UInt = 0u,
    public var fIsCyclic: Bool = 0,
    public var pChainElement: CertChainElement? = null,
)

public class CryptProviderData(
    public var cbStruct: UInt = 0u,
    public var pWintrustData: WintrustData? = null,
    public var fOpenedFile: Bool = 0,
    public var hWndParent: Hwnd = null,
    public var pgActionID: Guid? = null,
    public var hProv: Int = 0,
    public var dwError: UInt = 0u,
    public var dwRegSecuritySettings: UInt = 0u,
    public var dwRegPolicySettings: UInt = 0u,
    public var psPfns: CryptProviderFunctions? = null,
    public var cdwTrustStepErrors: UInt = 0u,
    public var padwTrustStepErrors: UInt? = null,
    public var chStores: UInt = 0u,
    public var pahStores: Hcertstore? = null,
    public var dwEncoding: UInt = 0u,
    public var hMsg: COpaquePointer? = null,
    public var csSigners: UInt = 0u,
    public var pasSigners: CryptProviderSgnr? = null,
    public var csProvPrivData: UInt = 0u,
    public var pasProvPrivData: CryptProviderPrivdata? = null,
    public var dwSubjectChoice: UInt = 0u,
    public var anonymous: CryptProviderData0 = CryptProviderData0(),
    public var pszUsageOID: Pstr = null,
    public var fRecallWithState: Bool = 0,
    public var sftSystemTime: Filetime = Filetime(),
    public var pszCTLSignerUsageOID: Pstr = null,
    public var dwProvFlags: UInt = 0u,
    public var dwFinalError: UInt = 0u,
    public var pRequestUsage: CertUsageMatch? = null,
    public var dwTrustPubSettings: UInt = 0u,
    public var dwUIStateFlags: UInt = 0u,
    public var pSigState: CryptProviderSigstate? = null,
    public var pSigSettings: WintrustSignatureSettings? = null,
)

public data class CryptProviderData0(public var pPDSip: ProvdataSip? = null)

public data class CryptProviderDefusage(
    public var cbStruct: UInt = 0u,
    public var gActionID: Guid = Guid(),
    public var pDefPolicyCallbackData: COpaquePointer? = null,
    public var pDefSIPClientData: COpaquePointer? = null,
)

public data class CryptProviderFunctions(
    public var cbStruct: UInt = 0u,
    public var pfnAlloc: PfnCpdMemAlloc = null,
    public var pfnFree: PfnCpdMemFree = null,
    public var pfnAddStore2Chain: PfnCpdAddStore = null,
    public var pfnAddSgnr2Chain: PfnCpdAddSgnr = null,
    public var pfnAddCert2Chain: PfnCpdAddCert = null,
    public var pfnAddPrivData2Chain: PfnCpdAddPrivdata = null,
    public var pfnInitialize: PfnProviderInitCall = null,
    public var pfnObjectTrust: PfnProviderObjtrustCall = null,
    public var pfnSignatureTrust: PfnProviderSigtrustCall = null,
    public var pfnCertificateTrust: PfnProviderCerttrustCall = null,
    public var pfnFinalPolicy: PfnProviderFinalpolicyCall = null,
    public var pfnCertCheckPolicy: PfnProviderCertchkpolicyCall = null,
    public var pfnTestFinalPolicy: PfnProviderTestfinalpolicyCall = null,
    public var psUIpfns: CryptProvuiFuncs? = null,
    public var pfnCleanupPolicy: PfnProviderCleanupCall = null,
)

public data class CryptProviderPrivdata(
    public var cbStruct: UInt = 0u,
    public var gProviderID: Guid = Guid(),
    public var cbProvData: UInt = 0u,
    public var pvProvData: COpaquePointer? = null,
)

public data class CryptProviderRegdefusage(
    public var cbStruct: UInt = 0u,
    public var pgActionID: Guid? = null,
    public var pwszDllName: Pwstr = null,
    public var pwszLoadCallbackDataFunctionName: Pstr = null,
    public var pwszFreeCallbackDataFunctionName: Pstr = null,
)

public data class CryptProviderSgnr(
    public var cbStruct: UInt = 0u,
    public var sftVerifyAsOf: Filetime = Filetime(),
    public var csCertChain: UInt = 0u,
    public var pasCertChain: CryptProviderCert? = null,
    public var dwSignerType: UInt = 0u,
    public var psSigner: CmsgSignerInfo? = null,
    public var dwError: UInt = 0u,
    public var csCounterSigners: UInt = 0u,
    public var pasCounterSigners: CryptProviderSgnr? = null,
    public var pChainContext: CertChainContext? = null,
)

public data class CryptProviderSigstate(
    public var cbStruct: UInt = 0u,
    public var rhSecondarySigs: COpaquePointer? = null,
    public var hPrimarySig: COpaquePointer? = null,
    public var fFirstAttemptMade: Bool = 0,
    public var fNoMoreSigs: Bool = 0,
    public var cSecondarySigs: UInt = 0u,
    public var dwCurrentIndex: UInt = 0u,
    public var fSupportMultiSig: Bool = 0,
    public var dwCryptoPolicySupport: UInt = 0u,
    public var iAttemptCount: UInt = 0u,
    public var fCheckedSealing: Bool = 0,
    public var pSealingSignature: SealingSignatureAttribute? = null,
)

public data class CryptProvuiData(
    public var cbStruct: UInt = 0u,
    public var dwFinalError: UInt = 0u,
    public var pYesButtonText: Pwstr = null,
    public var pNoButtonText: Pwstr = null,
    public var pMoreInfoButtonText: Pwstr = null,
    public var pAdvancedLinkText: Pwstr = null,
    public var pCopyActionText: Pwstr = null,
    public var pCopyActionTextNoTS: Pwstr = null,
    public var pCopyActionTextNotSigned: Pwstr = null,
)

public data class CryptProvuiFuncs(
    public var cbStruct: UInt = 0u,
    public var psUIData: CryptProvuiData? = null,
    public var pfnOnMoreInfoClick: PfnProvuiCall = null,
    public var pfnOnMoreInfoClickDefault: PfnProvuiCall = null,
    public var pfnOnAdvancedClick: PfnProvuiCall = null,
    public var pfnOnAdvancedClickDefault: PfnProvuiCall = null,
)

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

public data class CryptTrustRegEntry(
    public var cbStruct: UInt = 0u,
    public var pwszDLLName: Pwstr = null,
    public var pwszFunctionName: Pwstr = null,
)

public data class DriverVerInfo(
    public var cbStruct: UInt = 0u,
    public var dwReserved1: Int = 0,
    public var dwReserved2: Int = 0,
    public var dwPlatform: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var wszVersion: UShortArray = UShortArray(260),
    public var wszSignedBy: UShortArray = UShortArray(260),
    public var pcSignerCertContext: CertContext? = null,
    public var sOSVersionLow: DriverVerMajorminor = DriverVerMajorminor(),
    public var sOSVersionHigh: DriverVerMajorminor = DriverVerMajorminor(),
    public var dwBuildNumberLow: UInt = 0u,
    public var dwBuildNumberHigh: UInt = 0u,
) {
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
}

public data class DriverVerMajorminor(public var dwMajor: UInt = 0u, public var dwMinor: UInt = 0u)

public data class IntentToSealAttribute(public var version: UInt = 0u, public var seal: Boolean = false)

public data class ProvdataSip(
    public var cbStruct: UInt = 0u,
    public var gSubject: Guid = Guid(),
    public var pSip: SipDispatchInfo? = null,
    public var pCATSip: SipDispatchInfo? = null,
    public var psSipSubjectInfo: SipSubjectinfo? = null,
    public var psSipCATSubjectInfo: SipSubjectinfo? = null,
    public var psIndirectData: SipIndirectData? = null,
)

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

public data class SpcFinancialCriteria(public var fFinancialInfoAvailable: Bool = 0, public var fMeetsCriteria: Bool = 0)

public data class SpcImage(
    public var pImageLink: SpcLink? = null,
    public var bitmap: CryptIntegerBlob = CryptIntegerBlob(),
    public var metafile: CryptIntegerBlob = CryptIntegerBlob(),
    public var enhancedMetafile: CryptIntegerBlob = CryptIntegerBlob(),
    public var gifFile: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class SpcIndirectDataContent(
    public var data: CryptAttributeTypeValue = CryptAttributeTypeValue(),
    public var digestAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var digest: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class SpcLink(public var dwLinkChoice: UInt = 0u, public var anonymous: SpcLink0 = SpcLink0())

public data class SpcLink0(
    public var pwszUrl: Pwstr = null,
    public var moniker: SpcSerializedObject = SpcSerializedObject(),
    public var pwszFile: Pwstr = null,
)

public data class SpcPeImageData(public var flags: CryptBitBlob = CryptBitBlob(), public var pFile: SpcLink? = null)

public data class SpcSerializedObject(public var classId: UByteArray = UByteArray(16), public var serializedData: CryptIntegerBlob = CryptIntegerBlob()) {
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

public data class SpcSpAgencyInfo(
    public var pPolicyInformation: SpcLink? = null,
    public var pwszPolicyDisplayText: Pwstr = null,
    public var pLogoImage: SpcImage? = null,
    public var pLogoLink: SpcLink? = null,
)

public data class SpcSpOpusInfo(
    public var pwszProgramName: Pcwstr = null,
    public var pMoreInfo: SpcLink? = null,
    public var pPublisherInfo: SpcLink? = null,
)

public data class SpcStatementType(public var cKeyPurposeId: UInt = 0u, public var rgpszKeyPurposeId: Pstr? = null)

public data class WintrustBlobInfo(
    public var cbStruct: UInt = 0u,
    public var gSubject: Guid = Guid(),
    public var pcwszDisplayName: Pcwstr = null,
    public var cbMemObject: UInt = 0u,
    public var pbMemObject: COpaquePointer? = null,
    public var cbMemSignedMsg: UInt = 0u,
    public var pbMemSignedMsg: COpaquePointer? = null,
)

public data class WintrustCatalogInfo(
    public var cbStruct: UInt = 0u,
    public var dwCatalogVersion: UInt = 0u,
    public var pcwszCatalogFilePath: Pcwstr = null,
    public var pcwszMemberTag: Pcwstr = null,
    public var pcwszMemberFilePath: Pcwstr = null,
    public var hMemberFile: Handle = null,
    public var pbCalculatedFileHash: COpaquePointer? = null,
    public var cbCalculatedFileHash: UInt = 0u,
    public var pcCatalogContext: CtlContext? = null,
    public var hCatAdmin: Int = 0,
)

public data class WintrustCertInfo(
    public var cbStruct: UInt = 0u,
    public var pcwszDisplayName: Pcwstr = null,
    public var psCertContext: CertContext? = null,
    public var chStores: UInt = 0u,
    public var pahStores: Hcertstore? = null,
    public var dwFlags: UInt = 0u,
    public var psftVerifyAsOf: Filetime? = null,
)

public data class WintrustData(
    public var cbStruct: UInt = 0u,
    public var pPolicyCallbackData: COpaquePointer? = null,
    public var pSIPClientData: COpaquePointer? = null,
    public var dwUIChoice: WintrustDataUichoice = 0u,
    public var fdwRevocationChecks: WintrustDataRevocationChecks = 0u,
    public var dwUnionChoice: WintrustDataUnionChoice = 0u,
    public var anonymous: WintrustData0 = WintrustData0(),
    public var dwStateAction: WintrustDataStateAction = 0u,
    public var hWVTStateData: Handle = null,
    public var pwszURLReference: Pwstr = null,
    public var dwProvFlags: WintrustDataProviderFlags = 0u,
    public var dwUIContext: WintrustDataUicontext = 0u,
    public var pSignatureSettings: WintrustSignatureSettings? = null,
)

public data class WintrustData0(
    public var pFile: WintrustFileInfo? = null,
    public var pCatalog: WintrustCatalogInfo? = null,
    public var pBlob: WintrustBlobInfo? = null,
    public var pSgnr: WintrustSgnrInfo? = null,
    public var pCert: WintrustCertInfo? = null,
)

public data class WintrustFileInfo(
    public var cbStruct: UInt = 0u,
    public var pcwszFilePath: Pcwstr = null,
    public var hFile: Handle = null,
    public var pgKnownSubject: Guid? = null,
)

public data class WintrustSgnrInfo(
    public var cbStruct: UInt = 0u,
    public var pcwszDisplayName: Pcwstr = null,
    public var psSignerInfo: CmsgSignerInfo? = null,
    public var chStores: UInt = 0u,
    public var pahStores: Hcertstore? = null,
)

public data class WintrustSignatureSettings(
    public var cbStruct: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwFlags: WintrustSignatureSettingsFlags = 0u,
    public var cSecondarySigs: UInt = 0u,
    public var dwVerifiedSigIndex: UInt = 0u,
    public var pCryptoPolicy: CertStrongSignPara? = null,
)

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
}

public data class WinSpubTrustedPublisherData(public var hClientToken: Handle = null, public var lpCertificate: WinCertificate? = null)

public data class WinTrustActdataContextWithSubject(
    public var hClientToken: Handle = null,
    public var subjectType: Guid? = null,
    public var subject: COpaquePointer? = null,
)

public data class WinTrustActdataSubjectOnly(public var subjectType: Guid? = null, public var subject: COpaquePointer? = null)

public data class WinTrustSubjectFile(public var hFile: Handle = null, public var lpPath: Pcwstr = null)

public data class WinTrustSubjectFileAndDisplay(
    public var hFile: Handle = null,
    public var lpPath: Pcwstr = null,
    public var lpDisplayName: Pcwstr = null,
)

public data class WtdGenericChainPolicyCreateInfo(
    public var anonymous: WtdGenericChainPolicyCreateInfo0 = WtdGenericChainPolicyCreateInfo0(),
    public var hChainEngine: Hcertchainengine = null,
    public var pChainPara: CertChainPara? = null,
    public var dwFlags: UInt = 0u,
    public var pvReserved: COpaquePointer? = null,
)

public data class WtdGenericChainPolicyCreateInfo0(public var cbStruct: UInt = 0u, public var cbSize: UInt = 0u)

public data class WtdGenericChainPolicyData(
    public var anonymous: WtdGenericChainPolicyData0 = WtdGenericChainPolicyData0(),
    public var pSignerChainInfo: WtdGenericChainPolicyCreateInfo? = null,
    public var pCounterSignerChainInfo: WtdGenericChainPolicyCreateInfo? = null,
    public var pfnPolicyCallback: PfnWtdGenericChainPolicyCallback = null,
    public var pvPolicyArg: COpaquePointer? = null,
)

public data class WtdGenericChainPolicyData0(public var cbStruct: UInt = 0u, public var cbSize: UInt = 0u)

public data class WtdGenericChainPolicySignerInfo(
    public var anonymous: WtdGenericChainPolicySignerInfo0 = WtdGenericChainPolicySignerInfo0(),
    public var pChainContext: CertChainContext? = null,
    public var dwSignerType: UInt = 0u,
    public var pMsgSignerInfo: CmsgSignerInfo? = null,
    public var dwError: UInt = 0u,
    public var cCounterSigner: UInt = 0u,
    public var rgpCounterSigner: COpaquePointer? = null,
)

public data class WtdGenericChainPolicySignerInfo0(public var cbStruct: UInt = 0u, public var cbSize: UInt = 0u)
