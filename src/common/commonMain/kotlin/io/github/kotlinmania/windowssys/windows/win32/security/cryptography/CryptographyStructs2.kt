@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public data class CryptAsyncRetrievalCompletion(
    public var pfnCompletion: PfnCryptAsyncRetrievalCompletionFunc = null,
    public var pvCompletion: COpaquePointer? = null,
)

public data class CryptAttribute(
    public var pszObjId: Pstr = null,
    public var cValue: UInt = 0u,
    public var rgValue: CryptIntegerBlob? = null,
)

public data class CryptAttributes(
    public var cAttr: UInt = 0u,
    public var rgAttr: CryptAttribute? = null,
)

public data class CryptAttributeTypeValue(
    public var pszObjId: Pstr = null,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptBitBlob(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
    public var cUnusedBits: UInt = 0u,
)

public data class CryptBlobArray(
    public var cBlob: UInt = 0u,
    public var rgBlob: CryptIntegerBlob? = null,
)

public data class CryptContentInfo(
    public var pszObjId: Pstr = null,
    public var content: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptContentInfoSequenceOfAny(
    public var pszObjId: Pstr = null,
    public var cValue: UInt = 0u,
    public var rgValue: CryptIntegerBlob? = null,
)

public data class CryptContexts(
    public var cContexts: UInt = 0u,
    public var rgpszContexts: Pwstr? = null,
)

public data class CryptContextConfig(
    public var dwFlags: CryptContextConfigFlags = 0u,
    public var dwReserved: UInt = 0u,
)

public data class CryptContextFunctions(
    public var cFunctions: UInt = 0u,
    public var rgpszFunctions: Pwstr? = null,
)

public data class CryptContextFunctionConfig(
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class CryptContextFunctionProviders(
    public var cProviders: UInt = 0u,
    public var rgpszProviders: Pwstr? = null,
)

public data class CryptCredentials(
    public var cbSize: UInt = 0u,
    public var pszCredentialsOid: Pcstr = null,
    public var pvCredentials: COpaquePointer? = null,
)

public data class CryptCspProvider(
    public var dwKeySpec: UInt = 0u,
    public var pwszProviderName: Pwstr = null,
    public var signature: CryptBitBlob = CryptBitBlob(),
)

public data class CryptDecodePara(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PfnCryptAlloc = null,
    public var pfnFree: PfnCryptFree = null,
)

public data class CryptDecryptMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var cCertStore: UInt = 0u,
    public var rghCertStore: COpaquePointer? = null,
)

public data class CryptDefaultContextMultiOidPara(
    public var cOID: UInt = 0u,
    public var rgpszOID: Pstr? = null,
)

public data class CryptDesKeyState(
    public var key: UByteArray = UByteArray(8),
    public var iv: UByteArray = UByteArray(8),
    public var feedback: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptDesKeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.feedback.contentEquals(other.feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.feedback.contentHashCode()
        return result
    }
}

public data class CryptEccCmsSharedInfo(
    public var algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var entityUInfo: CryptIntegerBlob = CryptIntegerBlob(),
    public var rgbSuppPubInfo: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptEccCmsSharedInfo) return false
        if (this.algorithm != other.algorithm) return false
        if (this.entityUInfo != other.entityUInfo) return false
        if (!this.rgbSuppPubInfo.contentEquals(other.rgbSuppPubInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.algorithm.hashCode()
        result = 31 * result + this.entityUInfo.hashCode()
        result = 31 * result + this.rgbSuppPubInfo.contentHashCode()
        return result
    }
}

public data class CryptEccPrivateKeyInfo(
    public var dwVersion: UInt = 0u,
    public var privateKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var szCurveOid: Pstr = null,
    public var publicKey: CryptBitBlob = CryptBitBlob(),
)

public data class CryptEncodePara(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PfnCryptAlloc = null,
    public var pfnFree: PfnCryptFree = null,
)

public data class CryptEncryptedPrivateKeyInfo(
    public var encryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedPrivateKey: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptEncryptMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvEncryptionAuxInfo: COpaquePointer? = null,
    public var dwFlags: UInt = 0u,
    public var dwInnerContentType: UInt = 0u,
)

public data class CryptEnrollmentNameValuePair(
    public var pwszName: Pwstr = null,
    public var pwszValue: Pwstr = null,
)

public data class CryptGetTimeValidObjectExtraInfo(
    public var cbSize: UInt = 0u,
    public var iDeltaCrlIndicator: Int = 0,
    public var pftCacheResync: Filetime? = null,
    public var pLastSyncTime: Filetime? = null,
    public var pMaxAgeTime: Filetime? = null,
    public var pChainPara: CertRevocationChainPara? = null,
    public var pDeltaCrlIndicator: CryptIntegerBlob? = null,
)

public data class CryptHashInfo(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hash: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptHashMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvHashAuxInfo: COpaquePointer? = null,
)

public data class CryptImageRef(
    public var pszImage: Pwstr = null,
    public var dwFlags: CryptImageRefFlags = 0u,
)

public data class CryptImageReg(
    public var pszImage: Pwstr = null,
    public var cInterfaces: UInt = 0u,
    public var rgpInterfaces: COpaquePointer? = null,
)

public data class CryptIntegerBlob(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class CryptInterfaceReg(
    public var dwInterface: BcryptInterface = 0u,
    public var dwFlags: BcryptTable = 0u,
    public var cFunctions: UInt = 0u,
    public var rgpszFunctions: Pwstr? = null,
)

public data class CryptKeyProvInfo(
    public var pwszContainerName: Pwstr = null,
    public var pwszProvName: Pwstr = null,
    public var dwProvType: UInt = 0u,
    public var dwFlags: CryptKeyFlags = 0u,
    public var cProvParam: UInt = 0u,
    public var rgProvParam: CryptKeyProvParam? = null,
    public var dwKeySpec: UInt = 0u,
)

public data class CryptKeyProvParam(
    public var dwParam: UInt = 0u,
    public var pbData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class CryptKeySignMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: CertQueryEncodingType = 0u,
    public var anonymous: CryptKeySignMessagePara0 = CryptKeySignMessagePara0(),
    public var dwKeySpec: CertKeySpec = 0u,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvHashAuxInfo: COpaquePointer? = null,
    public var pubKeyAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
)

public data class CryptKeySignMessagePara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CryptKeyVerifyMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
)

public data class CryptMaskGenAlgorithm(
    public var pszObjId: Pstr = null,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
)

public data class CryptObjectLocatorProviderTable(
    public var cbSize: UInt = 0u,
    public var pfnGet: PfnCryptObjectLocatorProviderGet = null,
    public var pfnRelease: PfnCryptObjectLocatorProviderRelease = null,
    public var pfnFreePassword: PfnCryptObjectLocatorProviderFreePassword = null,
    public var pfnFree: PfnCryptObjectLocatorProviderFree = null,
    public var pfnFreeIdentifier: PfnCryptObjectLocatorProviderFreeIdentifier = null,
)

public data class CryptObjidTable(
    public var dwAlgId: UInt = 0u,
    public var pszObjId: Pcstr = null,
)

public data class CryptOidFuncEntry(
    public var pszOID: Pcstr = null,
    public var pvFuncAddr: COpaquePointer? = null,
)

public data class CryptOidInfo(
    public var cbSize: UInt = 0u,
    public var pszOID: Pcstr = null,
    public var pwszName: Pcwstr = null,
    public var dwGroupId: UInt = 0u,
    public var anonymous: CryptOidInfo0 = CryptOidInfo0(),
    public var extraInfo: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptOidInfo0(
    public var dwValue: UInt = 0u,
    public var algid: AlgId = 0u,
    public var dwLength: UInt = 0u,
)

public data class CryptPasswordCredentialsa(
    public var cbSize: UInt = 0u,
    public var pszUsername: Pstr = null,
    public var pszPassword: Pstr = null,
)

public data class CryptPasswordCredentialsw(
    public var cbSize: UInt = 0u,
    public var pszUsername: Pwstr = null,
    public var pszPassword: Pwstr = null,
)

public data class CryptPkcs12PbeParams(
    public var iIterations: Int = 0,
    public var cbSalt: UInt = 0u,
)

public data class CryptPkcs8ExportParams(
    public var hCryptProv: Int = 0,
    public var dwKeySpec: UInt = 0u,
    public var pszPrivateKeyObjId: Pstr = null,
    public var pEncryptPrivateKeyFunc: PcryptEncryptPrivateKeyFunc = null,
    public var pVoidEncryptFunc: COpaquePointer? = null,
)

public data class CryptPkcs8ImportParams(
    public var privateKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var pResolvehCryptProvFunc: PcryptResolveHcryptprovFunc = null,
    public var pVoidResolveFunc: COpaquePointer? = null,
    public var pDecryptPrivateKeyFunc: PcryptDecryptPrivateKeyFunc = null,
    public var pVoidDecryptFunc: COpaquePointer? = null,
)

public data class CryptPrivateKeyInfo(
    public var version: UInt = 0u,
    public var algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var privateKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var pAttributes: CryptAttributes? = null,
)

public data class CryptPropertyRef(
    public var pszProperty: Pwstr = null,
    public var cbValue: UInt = 0u,
    public var pbValue: COpaquePointer? = null,
)

public data class CryptProviders(
    public var cProviders: UInt = 0u,
    public var rgpszProviders: Pwstr? = null,
)

public data class CryptProviderRef(
    public var dwInterface: UInt = 0u,
    public var pszFunction: Pwstr = null,
    public var pszProvider: Pwstr = null,
    public var cProperties: UInt = 0u,
    public var rgpProperties: COpaquePointer? = null,
    public var pUM: CryptImageRef? = null,
    public var pKM: CryptImageRef? = null,
)

public data class CryptProviderRefs(
    public var cProviders: UInt = 0u,
    public var rgpProviders: COpaquePointer? = null,
)

public data class CryptProviderReg(
    public var cAliases: UInt = 0u,
    public var rgpszAliases: Pwstr? = null,
    public var pUM: CryptImageReg? = null,
    public var pKM: CryptImageReg? = null,
)

public data class CryptPsourceAlgorithm(
    public var pszObjId: Pstr = null,
    public var encodingParameters: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptRc2CbcParameters(
    public var dwVersion: UInt = 0u,
    public var fIV: Bool = 0,
    public var rgbIV: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptRc2CbcParameters) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.fIV != other.fIV) return false
        if (!this.rgbIV.contentEquals(other.rgbIV)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.fIV.hashCode()
        result = 31 * result + this.rgbIV.contentHashCode()
        return result
    }
}

public data class CryptRc4KeyState(
    public var key: UByteArray = UByteArray(16),
    public var sBox: UByteArray = UByteArray(256),
    public var i: UByte = 0u,
    public var j: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptRc4KeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.sBox.contentEquals(other.sBox)) return false
        if (this.i != other.i) return false
        if (this.j != other.j) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.sBox.contentHashCode()
        result = 31 * result + this.i.hashCode()
        result = 31 * result + this.j.hashCode()
        return result
    }
}

public data class CryptRetrieveAuxInfo(
    public var cbSize: UInt = 0u,
    public var pLastSyncTime: Filetime? = null,
    public var dwMaxUrlRetrievalByteCount: UInt = 0u,
    public var pPreFetchInfo: CryptnetUrlCachePreFetchInfo? = null,
    public var pFlushInfo: CryptnetUrlCacheFlushInfo? = null,
    public var ppResponseInfo: COpaquePointer? = null,
    public var pwszCacheFileNamePrefix: Pwstr = null,
    public var pftCacheResync: Filetime? = null,
    public var fProxyCacheRetrieval: Bool = 0,
    public var dwHttpStatusCode: UInt = 0u,
    public var ppwszErrorResponseHeaders: Pwstr? = null,
    public var ppErrorContentBlob: COpaquePointer? = null,
)

public data class CryptRsaesOaepParameters(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var maskGenAlgorithm: CryptMaskGenAlgorithm = CryptMaskGenAlgorithm(),
    public var pSourceAlgorithm: CryptPsourceAlgorithm = CryptPsourceAlgorithm(),
)

public data class CryptRsaSsaPssParameters(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var maskGenAlgorithm: CryptMaskGenAlgorithm = CryptMaskGenAlgorithm(),
    public var dwSaltLength: UInt = 0u,
    public var dwTrailerField: UInt = 0u,
)

public data class CryptSequenceOfAny(
    public var cValue: UInt = 0u,
    public var rgValue: CryptIntegerBlob? = null,
)

public data class CryptSignMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var pSigningCert: CertContext? = null,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvHashAuxInfo: COpaquePointer? = null,
    public var cMsgCert: UInt = 0u,
    public var rgpMsgCert: COpaquePointer? = null,
    public var cMsgCrl: UInt = 0u,
    public var rgpMsgCrl: COpaquePointer? = null,
    public var cAuthAttr: UInt = 0u,
    public var rgAuthAttr: CryptAttribute? = null,
    public var cUnauthAttr: UInt = 0u,
    public var rgUnauthAttr: CryptAttribute? = null,
    public var dwFlags: UInt = 0u,
    public var dwInnerContentType: UInt = 0u,
)

public data class CryptSmartCardRootInfo(
    public var rgbCardID: UByteArray = UByteArray(16),
    public var luid: RootInfoLuid = RootInfoLuid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptSmartCardRootInfo) return false
        if (!this.rgbCardID.contentEquals(other.rgbCardID)) return false
        if (this.luid != other.luid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgbCardID.contentHashCode()
        result = 31 * result + this.luid.hashCode()
        return result
    }
}

public data class CryptSmimeCapabilities(
    public var cCapability: UInt = 0u,
    public var rgCapability: CryptSmimeCapability? = null,
)

public data class CryptSmimeCapability(
    public var pszObjId: Pstr = null,
    public var parameters: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptTimestampAccuracy(
    public var dwSeconds: UInt = 0u,
    public var dwMillis: UInt = 0u,
    public var dwMicros: UInt = 0u,
)

public data class CryptTimestampContext(
    public var cbEncoded: UInt = 0u,
    public var pbEncoded: COpaquePointer? = null,
    public var pTimeStamp: CryptTimestampInfo? = null,
)

public data class CryptTimestampInfo(
    public var dwVersion: UInt = 0u,
    public var pszTSAPolicyId: Pstr = null,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hashedMessage: CryptIntegerBlob = CryptIntegerBlob(),
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
    public var ftTime: Filetime = Filetime(),
    public var pvAccuracy: CryptTimestampAccuracy? = null,
    public var fOrdering: Bool = 0,
    public var nonce: CryptIntegerBlob = CryptIntegerBlob(),
    public var tsa: CryptIntegerBlob = CryptIntegerBlob(),
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CryptTimestampPara(
    public var pszTSAPolicyId: Pcstr = null,
    public var fRequestCerts: Bool = 0,
    public var nonce: CryptIntegerBlob = CryptIntegerBlob(),
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CryptTimestampRequest(
    public var dwVersion: CryptTimestampVersion = 0u,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hashedMessage: CryptIntegerBlob = CryptIntegerBlob(),
    public var pszTSAPolicyId: Pstr = null,
    public var nonce: CryptIntegerBlob = CryptIntegerBlob(),
    public var fCertReq: Bool = 0,
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CryptTimestampResponse(
    public var dwStatus: CryptTimestampResponseStatus = 0u,
    public var cFreeText: UInt = 0u,
    public var rgFreeText: Pwstr? = null,
    public var failureInfo: CryptBitBlob = CryptBitBlob(),
    public var contentInfo: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptTimeStampRequestInfo(
    public var pszTimeStampAlgorithm: Pstr = null,
    public var pszContentType: Pstr = null,
    public var content: CryptIntegerBlob = CryptIntegerBlob(),
    public var cAttribute: UInt = 0u,
    public var rgAttribute: CryptAttribute? = null,
)

public data class CryptUrlArray(
    public var cUrl: UInt = 0u,
    public var rgwszUrl: Pwstr? = null,
)

public data class CryptUrlInfo(
    public var cbSize: UInt = 0u,
    public var dwSyncDeltaTime: UInt = 0u,
    public var cGroup: UInt = 0u,
    public var rgcGroupEntry: UInt? = null,
)

public data class CryptVerifyCertSignStrongPropertiesInfo(
    public var certSignHashCNGAlgPropData: CryptIntegerBlob = CryptIntegerBlob(),
    public var certIssuerPubKeyBitLengthPropData: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CryptVerifyCertSignWeakHashInfo(
    public var cCNGHashAlgid: UInt = 0u,
    public var rgpwszCNGHashAlgid: Pcwstr? = null,
    public var dwWeakIndex: UInt = 0u,
)

public data class CryptVerifyMessagePara(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var pfnGetSignerCertificate: PfnCryptGetSignerCertificate = null,
    public var pvGetArg: COpaquePointer? = null,
)

public data class CryptX942OtherInfo(
    public var pszContentEncryptionObjId: Pstr = null,
    public var rgbCounter: UByteArray = UByteArray(4),
    public var rgbKeyLength: UByteArray = UByteArray(4),
    public var pubInfo: CryptIntegerBlob = CryptIntegerBlob(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptX942OtherInfo) return false
        if (this.pszContentEncryptionObjId != other.pszContentEncryptionObjId) return false
        if (!this.rgbCounter.contentEquals(other.rgbCounter)) return false
        if (!this.rgbKeyLength.contentEquals(other.rgbKeyLength)) return false
        if (this.pubInfo != other.pubInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszContentEncryptionObjId.hashCode()
        result = 31 * result + this.rgbCounter.contentHashCode()
        result = 31 * result + this.rgbKeyLength.contentHashCode()
        result = 31 * result + this.pubInfo.hashCode()
        return result
    }
}

public data class CryptXmlAlgorithm(
    public var cbSize: UInt = 0u,
    public var wszAlgorithm: Pcwstr = null,
    public var encoded: CryptXmlBlob = CryptXmlBlob(),
)

public data class CryptXmlAlgorithmInfo(
    public var cbSize: UInt = 0u,
    public var wszAlgorithmURI: Pwstr = null,
    public var wszName: Pwstr = null,
    public var dwGroupId: CryptXmlGroupId = 0u,
    public var wszCNGAlgid: Pwstr = null,
    public var wszCNGExtraAlgid: Pwstr = null,
    public var dwSignFlags: UInt = 0u,
    public var dwVerifyFlags: UInt = 0u,
    public var pvPaddingInfo: COpaquePointer? = null,
    public var pvExtraInfo: COpaquePointer? = null,
)

public data class CryptXmlBlob(
    public var dwCharset: CryptXmlCharset = 0,
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class CryptXmlCryptographicInterface(
    public var cbSize: UInt = 0u,
    public var fpCryptXmlEncodeAlgorithm: CryptXmlDllEncodeAlgorithm = null,
    public var fpCryptXmlCreateDigest: CryptXmlDllCreateDigest = null,
    public var fpCryptXmlDigestData: CryptXmlDllDigestData = null,
    public var fpCryptXmlFinalizeDigest: CryptXmlDllFinalizeDigest = null,
    public var fpCryptXmlCloseDigest: CryptXmlDllCloseDigest = null,
    public var fpCryptXmlSignData: CryptXmlDllSignData = null,
    public var fpCryptXmlVerifySignature: CryptXmlDllVerifySignature = null,
    public var fpCryptXmlGetAlgorithmInfo: CryptXmlDllGetAlgorithmInfo = null,
)

public data class CryptXmlDataBlob(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class CryptXmlDataProvider(
    public var pvCallbackState: COpaquePointer? = null,
    public var cbBufferSize: UInt = 0u,
    public var pfnRead: PfnCryptXmlDataProviderRead = null,
    public var pfnClose: PfnCryptXmlDataProviderClose = null,
)

public data class CryptXmlDocCtxt(
    public var cbSize: UInt = 0u,
    public var hDocCtxt: COpaquePointer? = null,
    public var pTransformsConfig: CryptXmlTransformChainConfig? = null,
    public var cSignature: UInt = 0u,
    public var rgpSignature: COpaquePointer? = null,
)

public data class CryptXmlIssuerSerial(
    public var wszIssuer: Pcwstr = null,
    public var wszSerial: Pcwstr = null,
)

public data class CryptXmlKeyinfoParam(
    public var wszId: Pcwstr = null,
    public var wszKeyName: Pcwstr = null,
    public var ski: CryptIntegerBlob = CryptIntegerBlob(),
    public var wszSubjectName: Pcwstr = null,
    public var cCertificate: UInt = 0u,
    public var rgCertificate: CryptIntegerBlob? = null,
    public var cCRL: UInt = 0u,
    public var rgCRL: CryptIntegerBlob? = null,
)

public data class CryptXmlKeyDsaKeyValue(
    public var p: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var q: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var g: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var y: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var j: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var seed: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var counter: CryptXmlDataBlob = CryptXmlDataBlob(),
)

public data class CryptXmlKeyEcdsaKeyValue(
    public var wszNamedCurve: Pcwstr = null,
    public var x: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var y: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var explicitPara: CryptXmlBlob = CryptXmlBlob(),
)

public data class CryptXmlKeyInfo(
    public var cbSize: UInt = 0u,
    public var wszId: Pcwstr = null,
    public var cKeyInfo: UInt = 0u,
    public var rgKeyInfo: CryptXmlKeyInfoItem? = null,
    public var hVerifyKey: BcryptKeyHandle = null,
)

public data class CryptXmlKeyInfoItem(
    public var dwType: CryptXmlKeyinfoType = 0u,
    public var anonymous: CryptXmlKeyInfoItem0 = CryptXmlKeyInfoItem0(),
)

public data class CryptXmlKeyInfoItem0(
    public var wszKeyName: Pcwstr = null,
    public var keyValue: CryptXmlKeyValue = CryptXmlKeyValue(),
    public var retrievalMethod: CryptXmlBlob = CryptXmlBlob(),
    public var x509Data: CryptXmlX509data = CryptXmlX509data(),
    public var custom: CryptXmlBlob = CryptXmlBlob(),
)

public data class CryptXmlKeyRsaKeyValue(
    public var modulus: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var exponent: CryptXmlDataBlob = CryptXmlDataBlob(),
)

public data class CryptXmlKeyValue(
    public var dwType: CryptXmlKeyValueType = 0u,
    public var anonymous: CryptXmlKeyValue0 = CryptXmlKeyValue0(),
)

public data class CryptXmlKeyValue0(
    public var dSAKeyValue: CryptXmlKeyDsaKeyValue = CryptXmlKeyDsaKeyValue(),
    public var rSAKeyValue: CryptXmlKeyRsaKeyValue = CryptXmlKeyRsaKeyValue(),
    public var eCDSAKeyValue: CryptXmlKeyEcdsaKeyValue = CryptXmlKeyEcdsaKeyValue(),
    public var custom: CryptXmlBlob = CryptXmlBlob(),
)

public data class CryptXmlObject(
    public var cbSize: UInt = 0u,
    public var hObject: COpaquePointer? = null,
    public var wszId: Pcwstr = null,
    public var wszMimeType: Pcwstr = null,
    public var wszEncoding: Pcwstr = null,
    public var manifest: CryptXmlReferences = CryptXmlReferences(),
    public var encoded: CryptXmlBlob = CryptXmlBlob(),
)

public data class CryptXmlProperty(
    public var dwPropId: CryptXmlPropertyId = 0,
    public var pvValue: COpaquePointer? = null,
    public var cbValue: UInt = 0u,
)

public data class CryptXmlReference(
    public var cbSize: UInt = 0u,
    public var hReference: COpaquePointer? = null,
    public var wszId: Pcwstr = null,
    public var wszUri: Pcwstr = null,
    public var wszType: Pcwstr = null,
    public var digestMethod: CryptXmlAlgorithm = CryptXmlAlgorithm(),
    public var digestValue: CryptIntegerBlob = CryptIntegerBlob(),
    public var cTransform: UInt = 0u,
    public var rgTransform: CryptXmlAlgorithm? = null,
)

public data class CryptXmlReferences(
    public var cReference: UInt = 0u,
    public var rgpReference: COpaquePointer? = null,
)

public data class CryptXmlSignature(
    public var cbSize: UInt = 0u,
    public var hSignature: COpaquePointer? = null,
    public var wszId: Pcwstr = null,
    public var signedInfo: CryptXmlSignedInfo = CryptXmlSignedInfo(),
    public var signatureValue: CryptIntegerBlob = CryptIntegerBlob(),
    public var pKeyInfo: CryptXmlKeyInfo? = null,
    public var cObject: UInt = 0u,
    public var rgpObject: COpaquePointer? = null,
)

public data class CryptXmlSignedInfo(
    public var cbSize: UInt = 0u,
    public var wszId: Pcwstr = null,
    public var canonicalization: CryptXmlAlgorithm = CryptXmlAlgorithm(),
    public var signatureMethod: CryptXmlAlgorithm = CryptXmlAlgorithm(),
    public var cReference: UInt = 0u,
    public var rgpReference: COpaquePointer? = null,
    public var encoded: CryptXmlBlob = CryptXmlBlob(),
)

public data class CryptXmlStatus(
    public var cbSize: UInt = 0u,
    public var dwErrorStatus: CryptXmlStatusErrorStatus = 0u,
    public var dwInfoStatus: CryptXmlStatusInfoStatus = 0u,
)

public data class CryptXmlTransformChainConfig(
    public var cbSize: UInt = 0u,
    public var cTransformInfo: UInt = 0u,
    public var rgpTransformInfo: COpaquePointer? = null,
)

public data class CryptXmlTransformInfo(
    public var cbSize: UInt = 0u,
    public var wszAlgorithm: Pcwstr = null,
    public var cbBufferSize: UInt = 0u,
    public var dwFlags: CryptXmlTransformFlags = 0u,
    public var pfnCreateTransform: PfnCryptXmlCreateTransform = null,
)

public data class CryptXmlX509data(
    public var cX509Data: UInt = 0u,
    public var rgX509Data: CryptXmlX509dataItem? = null,
)

public data class CryptXmlX509dataItem(
    public var dwType: CryptXmlX509dataType = 0u,
    public var anonymous: CryptXmlX509dataItem0 = CryptXmlX509dataItem0(),
)

public data class CryptXmlX509dataItem0(
    public var issuerSerial: CryptXmlIssuerSerial = CryptXmlIssuerSerial(),
    public var ski: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var wszSubjectName: Pcwstr = null,
    public var certificate: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var crl: CryptXmlDataBlob = CryptXmlDataBlob(),
    public var custom: CryptXmlBlob = CryptXmlBlob(),
)

public data class CtlAnySubjectInfo(
    public var subjectAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var subjectIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CtlContext(
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var pbCtlEncoded: COpaquePointer? = null,
    public var cbCtlEncoded: UInt = 0u,
    public var pCtlInfo: CtlInfo? = null,
    public var hCertStore: Hcertstore = null,
    public var hCryptMsg: COpaquePointer? = null,
    public var pbCtlContent: COpaquePointer? = null,
    public var cbCtlContent: UInt = 0u,
)

public data class CtlEntry(
    public var subjectIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
    public var cAttribute: UInt = 0u,
    public var rgAttribute: CryptAttribute? = null,
)

public data class CtlFindSubjectPara(
    public var cbSize: UInt = 0u,
    public var pUsagePara: CtlFindUsagePara? = null,
    public var dwSubjectType: UInt = 0u,
    public var pvSubject: COpaquePointer? = null,
)

public data class CtlFindUsagePara(
    public var cbSize: UInt = 0u,
    public var subjectUsage: CtlUsage = CtlUsage(),
    public var listIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
    public var pSigner: CertInfo? = null,
)

public data class CtlInfo(
    public var dwVersion: UInt = 0u,
    public var subjectUsage: CtlUsage = CtlUsage(),
    public var listIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
    public var sequenceNumber: CryptIntegerBlob = CryptIntegerBlob(),
    public var thisUpdate: Filetime = Filetime(),
    public var nextUpdate: Filetime = Filetime(),
    public var subjectAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var cCTLEntry: UInt = 0u,
    public var rgCTLEntry: CtlEntry? = null,
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CtlUsage(
    public var cUsageIdentifier: UInt = 0u,
    public var rgpszUsageIdentifier: Pstr? = null,
)

public data class CtlUsageMatch(
    public var dwType: UInt = 0u,
    public var usage: CtlUsage = CtlUsage(),
)

public data class CtlVerifyUsagePara(
    public var cbSize: UInt = 0u,
    public var listIdentifier: CryptIntegerBlob = CryptIntegerBlob(),
    public var cCtlStore: UInt = 0u,
    public var rghCtlStore: COpaquePointer? = null,
    public var cSignerStore: UInt = 0u,
    public var rghSignerStore: COpaquePointer? = null,
)

public data class CtlVerifyUsageStatus(
    public var cbSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var ppCtl: COpaquePointer? = null,
    public var dwCtlEntryIndex: UInt = 0u,
    public var ppSigner: COpaquePointer? = null,
    public var dwSignerIndex: UInt = 0u,
)

public data class Dssseed(
    public var counter: UInt = 0u,
    public var seed: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dssseed) return false
        if (this.counter != other.counter) return false
        if (!this.seed.contentEquals(other.seed)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.counter.hashCode()
        result = 31 * result + this.seed.contentHashCode()
        return result
    }
}

public data class Endpointaddress(
    public var serviceUrl: Pcwstr = null,
    public var policyUrl: Pcwstr = null,
    public var rawCertificate: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class Endpointaddress2(
    public var serviceUrl: Pcwstr = null,
    public var policyUrl: Pcwstr = null,
    public var identityType: UInt = 0u,
    public var identityBytes: COpaquePointer? = null,
)

public data class EvExtraCertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwRootProgramQualifierFlags: CertRootProgramFlags = 0u,
)

public data class EvExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var dwQualifiers: UInt = 0u,
    public var dwIssuanceUsageIndex: UInt = 0u,
)

public data class GenericXmlToken(
    public var createDate: Filetime = Filetime(),
    public var expiryDate: Filetime = Filetime(),
    public var xmlToken: Pwstr = null,
    public var internalTokenReference: Pwstr = null,
    public var externalTokenReference: Pwstr = null,
)

public data class HmacInfo(
    public var hashAlgid: AlgId = 0u,
    public var pbInnerString: COpaquePointer? = null,
    public var cbInnerString: UInt = 0u,
    public var pbOuterString: COpaquePointer? = null,
    public var cbOuterString: UInt = 0u,
)

public data class HTTPSPolicyCallbackData(
    public var anonymous: HttpspolicyCallbackData0 = HttpspolicyCallbackData0(),
    public var dwAuthType: HttpspolicyCallbackDataAuthType = 0u,
    public var fdwChecks: UInt = 0u,
    public var pwszServerName: Pwstr = null,
)

public data class HttpspolicyCallbackData0(
    public var cbStruct: UInt = 0u,
    public var cbSize: UInt = 0u,
)

public data class HandleType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val ASYMMETRIC: HandleType = HandleType(1)

        public val SYMMETRIC: HandleType = HandleType(2)

        public val TRANSFORM: HandleType = HandleType(3)

        public val HASH: HandleType = HandleType(4)
    }
}

public data class InformationcardAsymmetricCryptoParameters(
    public var keySize: Int = 0,
    public var keyExchangeAlgorithm: Pwstr = null,
    public var signatureAlgorithm: Pwstr = null,
)

public data class InformationcardCryptoHandle(
    public var type: HandleType = HandleType(),
    public var expiration: Long = 0L,
    public var cryptoParameters: COpaquePointer? = null,
)

public data class InformationcardHashCryptoParameters(
    public var hashSize: Int = 0,
    public var transform: InformationcardTransformCryptoParameters = InformationcardTransformCryptoParameters(),
)

public data class InformationcardSymmetricCryptoParameters(
    public var keySize: Int = 0,
    public var blockSize: Int = 0,
    public var feedbackSize: Int = 0,
)

public data class InformationcardTransformCryptoParameters(
    public var inputBlockSize: Int = 0,
    public var outputBlockSize: Int = 0,
    public var canTransformMultipleBlocks: Bool = 0,
    public var canReuseTransform: Bool = 0,
)

public data class InFileSignatureResource(
    public var dwVersion: UInt = 0u,
    public var dwCrcOffset: UInt = 0u,
    public var rgbSignature: UByteArray = UByteArray(88),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InFileSignatureResource) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwCrcOffset != other.dwCrcOffset) return false
        if (!this.rgbSignature.contentEquals(other.rgbSignature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwCrcOffset.hashCode()
        result = 31 * result + this.rgbSignature.contentHashCode()
        return result
    }
}

public data class KeyTypeSubtype(
    public var dwKeySpec: UInt = 0u,
    public var type: Guid = Guid(),
    public var subtype: Guid = Guid(),
)

public data class NcryptAllocPara(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PfnNcryptAlloc = null,
    public var pfnFree: PfnNcryptFree = null,
)

public data class NcryptCipherPaddingInfo(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pbIV: COpaquePointer? = null,
    public var cbIV: UInt = 0u,
    public var pbOtherInfo: COpaquePointer? = null,
    public var cbOtherInfo: UInt = 0u,
)

public data class NcryptExportedIsolatedKeyEnvelope(
    public var header: NcryptExportedIsolatedKeyHeader = NcryptExportedIsolatedKeyHeader(),
)

public data class NcryptExportedIsolatedKeyHeader(
    public var version: UInt = 0u,
    public var keyUsage: UInt = 0u,
    public var bitfield: UInt = 0u,
    public var cbAlgName: UInt = 0u,
    public var cbNonce: UInt = 0u,
    public var cbAuthTag: UInt = 0u,
    public var cbWrappingKey: UInt = 0u,
    public var cbIsolatedKey: UInt = 0u,
)

public data class NcryptIsolatedKeyAttestedAttributes(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var cbPublicKeyBlob: UInt = 0u,
)

public data class NcryptKeyAccessPolicyBlob(
    public var dwVersion: UInt = 0u,
    public var dwPolicyFlags: UInt = 0u,
    public var cbUserSid: UInt = 0u,
    public var cbApplicationSid: UInt = 0u,
)

public data class NcryptKeyAttestPaddingInfo(
    public var magic: UInt = 0u,
    public var pbKeyBlob: COpaquePointer? = null,
    public var cbKeyBlob: UInt = 0u,
    public var pbKeyAuth: COpaquePointer? = null,
    public var cbKeyAuth: UInt = 0u,
)

public data class NcryptKeyBlobHeader(
    public var cbSize: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbAlgName: UInt = 0u,
    public var cbKeyData: UInt = 0u,
)

public class NcryptKeyStorageFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openProvider: NCryptOpenStorageProviderFn = null,
    public var openKey: NCryptOpenKeyFn = null,
    public var createPersistedKey: NCryptCreatePersistedKeyFn = null,
    public var getProviderProperty: NCryptGetProviderPropertyFn = null,
    public var getKeyProperty: NCryptGetKeyPropertyFn = null,
    public var setProviderProperty: NCryptSetProviderPropertyFn = null,
    public var setKeyProperty: NCryptSetKeyPropertyFn = null,
    public var finalizeKey: NCryptFinalizeKeyFn = null,
    public var deleteKey: NCryptDeleteKeyFn = null,
    public var freeProvider: NCryptFreeProviderFn = null,
    public var freeKey: NCryptFreeKeyFn = null,
    public var freeBuffer: NCryptFreeBufferFn = null,
    public var encrypt: NCryptEncryptFn = null,
    public var decrypt: NCryptDecryptFn = null,
    public var isAlgSupported: NCryptIsAlgSupportedFn = null,
    public var enumAlgorithms: NCryptEnumAlgorithmsFn = null,
    public var enumKeys: NCryptEnumKeysFn = null,
    public var importKey: NCryptImportKeyFn = null,
    public var exportKey: NCryptExportKeyFn = null,
    public var signHash: NCryptSignHashFn = null,
    public var verifySignature: NCryptVerifySignatureFn = null,
    public var promptUser: NCryptPromptUserFn = null,
    public var notifyChangeKey: NCryptNotifyChangeKeyFn = null,
    public var secretAgreement: NCryptSecretAgreementFn = null,
    public var deriveKey: NCryptDeriveKeyFn = null,
    public var freeSecret: NCryptFreeSecretFn = null,
    public var keyDerivation: NCryptKeyDerivationFn = null,
    public var createClaim: NCryptCreateClaimFn = null,
    public var verifyClaim: NCryptVerifyClaimFn = null,
)

public data class NcryptPcpHmacAuthSignatureInfo(
    public var dwVersion: UInt = 0u,
    public var iExpiration: Int = 0,
    public var pabNonce: UByteArray = UByteArray(32),
    public var pabPolicyRef: UByteArray = UByteArray(32),
    public var pabHMAC: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptPcpHmacAuthSignatureInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.iExpiration != other.iExpiration) return false
        if (!this.pabNonce.contentEquals(other.pabNonce)) return false
        if (!this.pabPolicyRef.contentEquals(other.pabPolicyRef)) return false
        if (!this.pabHMAC.contentEquals(other.pabHMAC)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.iExpiration.hashCode()
        result = 31 * result + this.pabNonce.contentHashCode()
        result = 31 * result + this.pabPolicyRef.contentHashCode()
        result = 31 * result + this.pabHMAC.contentHashCode()
        return result
    }
}

public data class NcryptPcpRawPolicydigestInfo(
    public var dwVersion: UInt = 0u,
    public var cbDigest: UInt = 0u,
)

public data class NcryptPcpTpmFwVersionInfo(
    public var major1: UShort = 0u,
    public var major2: UShort = 0u,
    public var minor1: UShort = 0u,
    public var minor2: UShort = 0u,
)

public data class NcryptPcpTpmWebAuthnAttestationStatement(
    public var magic: UInt = 0u,
    public var version: UInt = 0u,
    public var headerSize: UInt = 0u,
    public var cbCertifyInfo: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbTpmPublic: UInt = 0u,
)

public data class NcryptPlatformAttestPaddingInfo(
    public var magic: UInt = 0u,
    public var pcrMask: UInt = 0u,
)

public data class NcryptProtectStreamInfo(
    public var pfnStreamOutput: PFNCryptStreamOutputCallback = null,
    public var pvCallbackCtxt: COpaquePointer? = null,
)

public data class NcryptProtectStreamInfoEx(
    public var pfnStreamOutput: PFNCryptStreamOutputCallbackEx = null,
    public var pvCallbackCtxt: COpaquePointer? = null,
)

public data class NcryptSslCipherLengths(
    public var cbLength: UInt = 0u,
    public var dwHeaderLen: UInt = 0u,
    public var dwFixedTrailerLen: UInt = 0u,
    public var dwMaxVariableTrailerLen: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class NcryptSslCipherSuite(
    public var dwProtocol: UInt = 0u,
    public var dwCipherSuite: UInt = 0u,
    public var dwBaseCipherSuite: UInt = 0u,
    public var szCipherSuite: UShortArray = UShortArray(64),
    public var szCipher: UShortArray = UShortArray(64),
    public var dwCipherLen: UInt = 0u,
    public var dwCipherBlockLen: UInt = 0u,
    public var szHash: UShortArray = UShortArray(64),
    public var dwHashLen: UInt = 0u,
    public var szExchange: UShortArray = UShortArray(64),
    public var dwMinExchangeLen: UInt = 0u,
    public var dwMaxExchangeLen: UInt = 0u,
    public var szCertificate: UShortArray = UShortArray(64),
    public var dwKeyType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptSslCipherSuite) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.dwCipherSuite != other.dwCipherSuite) return false
        if (this.dwBaseCipherSuite != other.dwBaseCipherSuite) return false
        if (!this.szCipherSuite.contentEquals(other.szCipherSuite)) return false
        if (!this.szCipher.contentEquals(other.szCipher)) return false
        if (this.dwCipherLen != other.dwCipherLen) return false
        if (this.dwCipherBlockLen != other.dwCipherBlockLen) return false
        if (!this.szHash.contentEquals(other.szHash)) return false
        if (this.dwHashLen != other.dwHashLen) return false
        if (!this.szExchange.contentEquals(other.szExchange)) return false
        if (this.dwMinExchangeLen != other.dwMinExchangeLen) return false
        if (this.dwMaxExchangeLen != other.dwMaxExchangeLen) return false
        if (!this.szCertificate.contentEquals(other.szCertificate)) return false
        if (this.dwKeyType != other.dwKeyType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwProtocol.hashCode()
        result = 31 * result + this.dwCipherSuite.hashCode()
        result = 31 * result + this.dwBaseCipherSuite.hashCode()
        result = 31 * result + this.szCipherSuite.contentHashCode()
        result = 31 * result + this.szCipher.contentHashCode()
        result = 31 * result + this.dwCipherLen.hashCode()
        result = 31 * result + this.dwCipherBlockLen.hashCode()
        result = 31 * result + this.szHash.contentHashCode()
        result = 31 * result + this.dwHashLen.hashCode()
        result = 31 * result + this.szExchange.contentHashCode()
        result = 31 * result + this.dwMinExchangeLen.hashCode()
        result = 31 * result + this.dwMaxExchangeLen.hashCode()
        result = 31 * result + this.szCertificate.contentHashCode()
        result = 31 * result + this.dwKeyType.hashCode()
        return result
    }
}

public data class NcryptSslCipherSuiteEx(
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var dwCipherSuite: UInt = 0u,
    public var dwBaseCipherSuite: UInt = 0u,
    public var szCipherSuite: UShortArray = UShortArray(64),
    public var szCipher: UShortArray = UShortArray(64),
    public var dwCipherLen: UInt = 0u,
    public var dwCipherBlockLen: UInt = 0u,
    public var szHash: UShortArray = UShortArray(64),
    public var dwHashLen: UInt = 0u,
    public var szExchange: UShortArray = UShortArray(64),
    public var dwMinExchangeLen: UInt = 0u,
    public var dwMaxExchangeLen: UInt = 0u,
    public var szCertificate: UShortArray = UShortArray(64),
    public var dwKeyType: UInt = 0u,
    public var szCipherMode: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptSslCipherSuiteEx) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.dwCipherSuite != other.dwCipherSuite) return false
        if (this.dwBaseCipherSuite != other.dwBaseCipherSuite) return false
        if (!this.szCipherSuite.contentEquals(other.szCipherSuite)) return false
        if (!this.szCipher.contentEquals(other.szCipher)) return false
        if (this.dwCipherLen != other.dwCipherLen) return false
        if (this.dwCipherBlockLen != other.dwCipherBlockLen) return false
        if (!this.szHash.contentEquals(other.szHash)) return false
        if (this.dwHashLen != other.dwHashLen) return false
        if (!this.szExchange.contentEquals(other.szExchange)) return false
        if (this.dwMinExchangeLen != other.dwMinExchangeLen) return false
        if (this.dwMaxExchangeLen != other.dwMaxExchangeLen) return false
        if (!this.szCertificate.contentEquals(other.szCertificate)) return false
        if (this.dwKeyType != other.dwKeyType) return false
        if (!this.szCipherMode.contentEquals(other.szCipherMode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.dwCipherSuite.hashCode()
        result = 31 * result + this.dwBaseCipherSuite.hashCode()
        result = 31 * result + this.szCipherSuite.contentHashCode()
        result = 31 * result + this.szCipher.contentHashCode()
        result = 31 * result + this.dwCipherLen.hashCode()
        result = 31 * result + this.dwCipherBlockLen.hashCode()
        result = 31 * result + this.szHash.contentHashCode()
        result = 31 * result + this.dwHashLen.hashCode()
        result = 31 * result + this.szExchange.contentHashCode()
        result = 31 * result + this.dwMinExchangeLen.hashCode()
        result = 31 * result + this.dwMaxExchangeLen.hashCode()
        result = 31 * result + this.szCertificate.contentHashCode()
        result = 31 * result + this.dwKeyType.hashCode()
        result = 31 * result + this.szCipherMode.contentHashCode()
        return result
    }
}

public data class NcryptSslEccCurve(
    public var szCurveName: UShortArray = UShortArray(255),
    public var szOID: ByteArray = ByteArray(255),
    public var dwPublicKeyLength: UInt = 0u,
    public var dwCurveType: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcryptSslEccCurve) return false
        if (!this.szCurveName.contentEquals(other.szCurveName)) return false
        if (!this.szOID.contentEquals(other.szOID)) return false
        if (this.dwPublicKeyLength != other.dwPublicKeyLength) return false
        if (this.dwCurveType != other.dwCurveType) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szCurveName.contentHashCode()
        result = 31 * result + this.szOID.contentHashCode()
        result = 31 * result + this.dwPublicKeyLength.hashCode()
        result = 31 * result + this.dwCurveType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }
}

public class NcryptSslFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var computeClientAuthHash: SslComputeClientAuthHashFn = null,
    public var computeEapKeyBlock: SslComputeEapKeyBlockFn = null,
    public var computeFinishedHash: SslComputeFinishedHashFn = null,
    public var createEphemeralKey: SslCreateEphemeralKeyFn = null,
    public var createHandshakeHash: SslCreateHandshakeHashFn = null,
    public var decryptPacket: SslDecryptPacketFn = null,
    public var encryptPacket: SslEncryptPacketFn = null,
    public var enumCipherSuites: SslEnumCipherSuitesFn = null,
    public var exportKey: SslExportKeyFn = null,
    public var freeBuffer: SslFreeBufferFn = null,
    public var freeObject: SslFreeObjectFn = null,
    public var generateMasterKey: SslGenerateMasterKeyFn = null,
    public var generateSessionKeys: SslGenerateSessionKeysFn = null,
    public var getKeyProperty: SslGetKeyPropertyFn = null,
    public var getProviderProperty: SslGetProviderPropertyFn = null,
    public var hashHandshake: SslHashHandshakeFn = null,
    public var importMasterKey: SslImportMasterKeyFn = null,
    public var importKey: SslImportKeyFn = null,
    public var lookupCipherSuiteInfo: SslLookupCipherSuiteInfoFn = null,
    public var openPrivateKey: SslOpenPrivateKeyFn = null,
    public var openProvider: SslOpenProviderFn = null,
    public var signHash: SslSignHashFn = null,
    public var verifySignature: SslVerifySignatureFn = null,
    public var lookupCipherLengths: SslLookupCipherLengthsFn = null,
    public var createClientAuthHash: SslCreateClientAuthHashFn = null,
    public var getCipherSuitePRFHashAlgorithm: SslGetCipherSuitePRFHashAlgorithmFn = null,
    public var computeSessionHash: SslComputeSessionHashFn = null,
    public var generatePreMasterKey: SslGeneratePreMasterKeyFn = null,
    public var enumEccCurves: SslEnumEccCurvesFn = null,
    public var exportKeyingMaterial: SslExportKeyingMaterialFn = null,
    public var extractEarlyKey: SslExtractEarlyKeyFn = null,
    public var extractHandshakeKey: SslExtractHandshakeKeyFn = null,
    public var extractMasterKey: SslExtractMasterKeyFn = null,
    public var expandTrafficKeys: SslExpandTrafficKeysFn = null,
    public var expandWriteKey: SslExpandWriteKeyFn = null,
    public var expandExporterMasterKey: SslExpandExporterMasterKeyFn = null,
    public var enumCipherSuitesEx: SslEnumCipherSuitesExFn = null,
    public var expandResumptionMasterKey: SslExpandResumptionMasterKeyFn = null,
    public var duplicateTranscriptHash: SslDuplicateTranscriptHashFn = null,
    public var expandBinderKey: SslExpandBinderKeyFn = null,
    public var expandPreSharedKey: SslExpandPreSharedKeyFn = null,
)

public data class NcryptSupportedLengths(
    public var dwMinLength: UInt = 0u,
    public var dwMaxLength: UInt = 0u,
    public var dwIncrement: UInt = 0u,
    public var dwDefaultLength: UInt = 0u,
)

public data class NcryptTpmLoadableKeyBlobHeader(
    public var magic: UInt = 0u,
    public var cbHeader: UInt = 0u,
    public var cbPublic: UInt = 0u,
    public var cbPrivate: UInt = 0u,
    public var cbName: UInt = 0u,
)

public data class NcryptTpmPlatformAttestationStatement(
    public var magic: UInt = 0u,
    public var version: UInt = 0u,
    public var pcrAlg: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbQuote: UInt = 0u,
    public var cbPcrs: UInt = 0u,
)

public data class NcryptUiPolicy(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pszCreationTitle: Pcwstr = null,
    public var pszFriendlyName: Pcwstr = null,
    public var pszDescription: Pcwstr = null,
)

public data class NcryptUiPolicyBlob(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cbCreationTitle: UInt = 0u,
    public var cbFriendlyName: UInt = 0u,
    public var cbDescription: UInt = 0u,
)

public data class NcryptVsmKeyAttestationClaimRestrictions(
    public var version: UInt = 0u,
    public var trustletId: ULong = 0uL,
    public var minSvn: UInt = 0u,
    public var flagsMask: UInt = 0u,
    public var flagsExpected: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class NcryptVsmKeyAttestationStatement(
    public var magic: UInt = 0u,
    public var version: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbReport: UInt = 0u,
    public var cbAttributes: UInt = 0u,
)

public data class NCryptAlgorithmName(
    public var pszName: Pwstr = null,
    public var dwClass: NcryptAlgorithmNameClass = 0u,
    public var dwAlgOperations: NcryptOperation = 0u,
    public var dwFlags: UInt = 0u,
)

public data class NCryptKeyName(
    public var pszName: Pwstr = null,
    public var pszAlgid: Pwstr = null,
    public var dwLegacyKeySpec: CertKeySpec = 0u,
    public var dwFlags: UInt = 0u,
)

public data class NCryptProviderName(
    public var pszName: Pwstr = null,
    public var pszComment: Pwstr = null,
)

public data class OcspBasicResponseEntry(
    public var certId: OcspCertId = OcspCertId(),
    public var dwCertStatus: UInt = 0u,
    public var anonymous: OcspBasicResponseEntry0 = OcspBasicResponseEntry0(),
    public var thisUpdate: Filetime = Filetime(),
    public var nextUpdate: Filetime = Filetime(),
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class OcspBasicResponseEntry0(
    public var pRevokedInfo: OcspBasicRevokedInfo? = null,
)

public data class OcspBasicResponseInfo(
    public var dwVersion: UInt = 0u,
    public var dwResponderIdChoice: UInt = 0u,
    public var anonymous: OcspBasicResponseInfo0 = OcspBasicResponseInfo0(),
    public var producedAt: Filetime = Filetime(),
    public var cResponseEntry: UInt = 0u,
    public var rgResponseEntry: OcspBasicResponseEntry? = null,
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class OcspBasicResponseInfo0(
    public var byNameResponderId: CryptIntegerBlob = CryptIntegerBlob(),
    public var byKeyResponderId: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class OcspBasicRevokedInfo(
    public var revocationDate: Filetime = Filetime(),
    public var dwCrlReasonCode: CertRevocationStatusReason = 0u,
)

public data class OcspBasicSignedResponseInfo(
    public var toBeSigned: CryptIntegerBlob = CryptIntegerBlob(),
    public var signatureInfo: OcspSignatureInfo = OcspSignatureInfo(),
)

public data class OcspCertId(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var issuerNameHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var issuerKeyHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class OcspRequestEntry(
    public var certId: OcspCertId = OcspCertId(),
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class OcspRequestInfo(
    public var dwVersion: UInt = 0u,
    public var pRequestorName: CertAltNameEntry? = null,
    public var cRequestEntry: UInt = 0u,
    public var rgRequestEntry: OcspRequestEntry? = null,
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class OcspResponseInfo(
    public var dwStatus: UInt = 0u,
    public var pszObjId: Pstr = null,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class OcspSignatureInfo(
    public var signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var signature: CryptBitBlob = CryptBitBlob(),
    public var cCertEncoded: UInt = 0u,
    public var rgCertEncoded: CryptIntegerBlob? = null,
)

public data class OcspSignedRequestInfo(
    public var toBeSigned: CryptIntegerBlob = CryptIntegerBlob(),
    public var pOptionalSignatureInfo: OcspSignatureInfo? = null,
)

public data class OffloadPrivateKey(
    public var dwVersion: UInt = 0u,
    public var cbPrime1: UInt = 0u,
    public var cbPrime2: UInt = 0u,
    public var pbPrime1: COpaquePointer? = null,
    public var pbPrime2: COpaquePointer? = null,
)

public data class PinCachePolicy(
    public var dwVersion: UInt = 0u,
    public var pinCachePolicyType: PinCachePolicyType = 0,
    public var dwPinCachePolicyInfo: UInt = 0u,
)

public data class PinInfo(
    public var dwVersion: UInt = 0u,
    public var pinType: SecretType = 0,
    public var pinPurpose: SecretPurpose = 0,
    public var dwChangePermission: UInt = 0u,
    public var dwUnblockPermission: UInt = 0u,
    public var pinCachePolicy: PinCachePolicy = PinCachePolicy(),
    public var dwFlags: UInt = 0u,
)

public data class Pkcs12Pbes2ExportParams(
    public var dwSize: UInt = 0u,
    public var hNcryptDescriptor: COpaquePointer? = null,
    public var pwszPbes2Alg: Pwstr = null,
)

public data class PolicyElement(
    public var targetEndpointAddress: Pcwstr = null,
    public var issuerEndpointAddress: Pcwstr = null,
    public var issuedTokenParameters: Pcwstr = null,
    public var privacyNoticeLink: Pcwstr = null,
    public var privacyNoticeVersion: UInt = 0u,
    public var useManagedPresentation: Bool = 0,
)

public data class Privkeyver3(
    public var magic: UInt = 0u,
    public var bitlenP: UInt = 0u,
    public var bitlenQ: UInt = 0u,
    public var bitlenJ: UInt = 0u,
    public var bitlenX: UInt = 0u,
    public var dSSSeed: Dssseed = Dssseed(),
)

public data class ProvEnumalgs(
    public var aiAlgid: AlgId = 0u,
    public var dwBitLen: UInt = 0u,
    public var dwNameLen: UInt = 0u,
    public var szName: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvEnumalgs) return false
        if (this.aiAlgid != other.aiAlgid) return false
        if (this.dwBitLen != other.dwBitLen) return false
        if (this.dwNameLen != other.dwNameLen) return false
        if (!this.szName.contentEquals(other.szName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiAlgid.hashCode()
        result = 31 * result + this.dwBitLen.hashCode()
        result = 31 * result + this.dwNameLen.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        return result
    }
}

public data class ProvEnumalgsEx(
    public var aiAlgid: AlgId = 0u,
    public var dwDefaultLen: UInt = 0u,
    public var dwMinLen: UInt = 0u,
    public var dwMaxLen: UInt = 0u,
    public var dwProtocols: UInt = 0u,
    public var dwNameLen: UInt = 0u,
    public var szName: ByteArray = ByteArray(20),
    public var dwLongNameLen: UInt = 0u,
    public var szLongName: ByteArray = ByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProvEnumalgsEx) return false
        if (this.aiAlgid != other.aiAlgid) return false
        if (this.dwDefaultLen != other.dwDefaultLen) return false
        if (this.dwMinLen != other.dwMinLen) return false
        if (this.dwMaxLen != other.dwMaxLen) return false
        if (this.dwProtocols != other.dwProtocols) return false
        if (this.dwNameLen != other.dwNameLen) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.dwLongNameLen != other.dwLongNameLen) return false
        if (!this.szLongName.contentEquals(other.szLongName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiAlgid.hashCode()
        result = 31 * result + this.dwDefaultLen.hashCode()
        result = 31 * result + this.dwMinLen.hashCode()
        result = 31 * result + this.dwMaxLen.hashCode()
        result = 31 * result + this.dwProtocols.hashCode()
        result = 31 * result + this.dwNameLen.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.dwLongNameLen.hashCode()
        result = 31 * result + this.szLongName.contentHashCode()
        return result
    }
}

public data class Pubkey(
    public var magic: UInt = 0u,
    public var bitlen: UInt = 0u,
)

public data class Pubkeyver3(
    public var magic: UInt = 0u,
    public var bitlenP: UInt = 0u,
    public var bitlenQ: UInt = 0u,
    public var bitlenJ: UInt = 0u,
    public var dSSSeed: Dssseed = Dssseed(),
)

public data class Publickeystruc(
    public var bType: UByte = 0u,
    public var bVersion: UByte = 0u,
    public var reserved: UShort = 0u,
    public var aiKeyAlg: AlgId = 0u,
)

public data class PaddingMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val NONE: PaddingMode = PaddingMode(1)

        public val PKCS7: PaddingMode = PaddingMode(2)

        public val ZEROS: PaddingMode = PaddingMode(3)

        public val ANSIX923: PaddingMode = PaddingMode(4)

        public val ISO10126: PaddingMode = PaddingMode(5)
    }
}

public data class Recipientpolicy(
    public var recipient: Endpointaddress = Endpointaddress(),
    public var issuer: Endpointaddress = Endpointaddress(),
    public var tokenType: Pcwstr = null,
    public var requiredClaims: Claimlist = Claimlist(),
    public var optionalClaims: Claimlist = Claimlist(),
    public var privacyUrl: Pcwstr = null,
    public var privacyVersion: UInt = 0u,
)

public data class Recipientpolicy2(
    public var recipient: Endpointaddress2 = Endpointaddress2(),
    public var issuer: Endpointaddress2 = Endpointaddress2(),
    public var tokenType: Pcwstr = null,
    public var requiredClaims: Claimlist = Claimlist(),
    public var optionalClaims: Claimlist = Claimlist(),
    public var privacyUrl: Pcwstr = null,
    public var privacyVersion: UInt = 0u,
)

public data class RootInfoLuid(
    public var lowPart: UInt = 0u,
    public var highPart: Int = 0,
)

public data class Rsapubkey(
    public var magic: UInt = 0u,
    public var bitlen: UInt = 0u,
    public var pubexp: UInt = 0u,
)

public data class SchannelAlg(
    public var dwUse: UInt = 0u,
    public var algid: AlgId = 0u,
    public var cBits: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class SignerAttrAuthcode(
    public var cbSize: UInt = 0u,
    public var fCommercial: Bool = 0,
    public var fIndividual: Bool = 0,
    public var pwszName: Pcwstr = null,
    public var pwszInfo: Pcwstr = null,
)

public data class SignerBlobInfo(
    public var cbSize: UInt = 0u,
    public var pGuidSubject: Guid? = null,
    public var cbBlob: UInt = 0u,
    public var pbBlob: COpaquePointer? = null,
    public var pwszDisplayName: Pcwstr = null,
)

public data class SignerCert(
    public var cbSize: UInt = 0u,
    public var dwCertChoice: SignerCertChoice = 0u,
    public var anonymous: SignerCert0 = SignerCert0(),
    public var hwnd: Hwnd = null,
)

public data class SignerCert0(
    public var pwszSpcFile: Pcwstr = null,
    public var pCertStoreInfo: SignerCertStoreInfo? = null,
    public var pSpcChainInfo: SignerSpcChainInfo? = null,
)

public data class SignerCertStoreInfo(
    public var cbSize: UInt = 0u,
    public var pSigningCert: CertContext? = null,
    public var dwCertPolicy: SignerCertPolicy = 0u,
    public var hCertStore: Hcertstore = null,
)

public data class SignerContext(
    public var cbSize: UInt = 0u,
    public var cbBlob: UInt = 0u,
    public var pbBlob: COpaquePointer? = null,
)

public data class SignerDigestSignInfo(
    public var cbSize: UInt = 0u,
    public var dwDigestSignChoice: UInt = 0u,
    public var anonymous: SignerDigestSignInfo0 = SignerDigestSignInfo0(),
    public var pMetadataBlob: CryptIntegerBlob? = null,
    public var dwReserved: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
)

public data class SignerDigestSignInfo0(
    public var pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = null,
    public var pfnAuthenticodeDigestSignWithFileHandle: PfnAuthenticodeDigestSignWithfilehandle = null,
    public var pfnAuthenticodeDigestSignEx: PfnAuthenticodeDigestSignEx = null,
    public var pfnAuthenticodeDigestSignExWithFileHandle: PfnAuthenticodeDigestSignExWithfilehandle = null,
)

public data class SignerDigestSignInfoV1(
    public var cbSize: UInt = 0u,
    public var pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = null,
    public var pMetadataBlob: CryptIntegerBlob? = null,
)

public data class SignerDigestSignInfoV2(
    public var cbSize: UInt = 0u,
    public var pfnAuthenticodeDigestSign: PfnAuthenticodeDigestSign = null,
    public var pfnAuthenticodeDigestSignEx: PfnAuthenticodeDigestSignEx = null,
    public var pMetadataBlob: CryptIntegerBlob? = null,
)

public data class SignerFileInfo(
    public var cbSize: UInt = 0u,
    public var pwszFileName: Pcwstr = null,
    public var hFile: Handle = null,
)

public data class SignerProviderInfo(
    public var cbSize: UInt = 0u,
    public var pwszProviderName: Pcwstr = null,
    public var dwProviderType: UInt = 0u,
    public var dwKeySpec: UInt = 0u,
    public var dwPvkChoice: SignerPrivateKeyChoice = 0u,
    public var anonymous: SignerProviderInfo0 = SignerProviderInfo0(),
)

public data class SignerProviderInfo0(
    public var pwszPvkFileName: Pwstr = null,
    public var pwszKeyContainer: Pwstr = null,
)

public data class SignerSignatureInfo(
    public var cbSize: UInt = 0u,
    public var algidHash: AlgId = 0u,
    public var dwAttrChoice: SignerSignatureAttributeChoice = 0u,
    public var anonymous: SignerSignatureInfo0 = SignerSignatureInfo0(),
    public var psAuthenticated: CryptAttributes? = null,
    public var psUnauthenticated: CryptAttributes? = null,
)

public data class SignerSignatureInfo0(
    public var pAttrAuthcode: SignerAttrAuthcode? = null,
)

public data class SignerSpcChainInfo(
    public var cbSize: UInt = 0u,
    public var pwszSpcFile: Pcwstr = null,
    public var dwCertPolicy: UInt = 0u,
    public var hCertStore: Hcertstore = null,
)

public data class SignerSubjectInfo(
    public var cbSize: UInt = 0u,
    public var pdwIndex: UInt? = null,
    public var dwSubjectChoice: SignerSubjectChoice = 0u,
    public var anonymous: SignerSubjectInfo0 = SignerSubjectInfo0(),
)

public data class SignerSubjectInfo0(
    public var pSignerFileInfo: SignerFileInfo? = null,
    public var pSignerBlobInfo: SignerBlobInfo? = null,
)

public data class SslEcckeyBlob(
    public var dwCurveType: UInt = 0u,
    public var cbKey: UInt = 0u,
)

public data class SslF12ExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var dwErrorLevel: UInt = 0u,
    public var dwErrorCategory: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var wszErrorText: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SslF12ExtraCertChainPolicyStatus) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwErrorLevel != other.dwErrorLevel) return false
        if (this.dwErrorCategory != other.dwErrorCategory) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.wszErrorText.contentEquals(other.wszErrorText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwErrorLevel.hashCode()
        result = 31 * result + this.dwErrorCategory.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.wszErrorText.contentHashCode()
        return result
    }
}

public data class SslHpkpHeaderExtraCertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pwszServerName: Pwstr = null,
    public var rgpszHpkpValue: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
)

public data class SslKeyPinExtraCertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pwszServerName: Pcwstr = null,
)

public data class SslKeyPinExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var lError: Int = 0,
    public var wszErrorText: UShortArray = UShortArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SslKeyPinExtraCertChainPolicyStatus) return false
        if (this.cbSize != other.cbSize) return false
        if (this.lError != other.lError) return false
        if (!this.wszErrorText.contentEquals(other.wszErrorText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.lError.hashCode()
        result = 31 * result + this.wszErrorText.contentHashCode()
        return result
    }
}

public data class VTableProvStruc(
    public var version: UInt = 0u,
    public var funcVerifyImage: CryptVerifyImageA = null,
    public var funcReturnhWnd: CryptReturnHwnd = null,
    public var dwProvType: UInt = 0u,
    public var pbContextInfo: COpaquePointer? = null,
    public var cbContextInfo: UInt = 0u,
    public var pszProvName: Pstr = null,
)

public data class VTableProvStrucW(
    public var version: UInt = 0u,
    public var funcVerifyImage: CryptVerifyImageW = null,
    public var funcReturnhWnd: CryptReturnHwnd = null,
    public var dwProvType: UInt = 0u,
    public var pbContextInfo: COpaquePointer? = null,
    public var cbContextInfo: UInt = 0u,
    public var pszProvName: Pwstr = null,
)
