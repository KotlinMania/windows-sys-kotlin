@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public data class CRYPT_ASYNC_RETRIEVAL_COMPLETION(public var pfnCompletion: PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC = null, public var pvCompletion: Long = 0L)

public data class CRYPT_ATTRIBUTE(
    public var pszObjId: PSTR = 0L,
    public var cValue: UInt = 0u,
    public var rgValue: Long = 0L,
)

public data class CRYPT_ATTRIBUTES(public var cAttr: UInt = 0u, public var rgAttr: Long = 0L)

public data class CRYPT_ATTRIBUTE_TYPE_VALUE(public var pszObjId: PSTR = 0L, public var Value: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CRYPT_BIT_BLOB(
    public var cbData: UInt = 0u,
    public var pbData: Long = 0L,
    public var cUnusedBits: UInt = 0u,
)

public data class CRYPT_BLOB_ARRAY(public var cBlob: UInt = 0u, public var rgBlob: Long = 0L)

public data class CRYPT_CONTENT_INFO(public var pszObjId: PSTR = 0L, public var Content: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CRYPT_CONTENT_INFO_SEQUENCE_OF_ANY(
    public var pszObjId: PSTR = 0L,
    public var cValue: UInt = 0u,
    public var rgValue: Long = 0L,
)

public data class CRYPT_CONTEXTS(public var cContexts: UInt = 0u, public var rgpszContexts: Long = 0L)

public data class CRYPT_CONTEXT_CONFIG(public var dwFlags: CRYPT_CONTEXT_CONFIG_FLAGS = 0u, public var dwReserved: UInt = 0u)

public data class CRYPT_CONTEXT_FUNCTIONS(public var cFunctions: UInt = 0u, public var rgpszFunctions: Long = 0L)

public data class CRYPT_CONTEXT_FUNCTION_CONFIG(public var dwFlags: UInt = 0u, public var dwReserved: UInt = 0u)

public data class CRYPT_CONTEXT_FUNCTION_PROVIDERS(public var cProviders: UInt = 0u, public var rgpszProviders: Long = 0L)

public data class CRYPT_CREDENTIALS(
    public var cbSize: UInt = 0u,
    public var pszCredentialsOid: PCSTR = 0L,
    public var pvCredentials: Long = 0L,
)

public data class CRYPT_CSP_PROVIDER(
    public var dwKeySpec: UInt = 0u,
    public var pwszProviderName: PWSTR = 0L,
    public var Signature: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
)

public data class CRYPT_DECODE_PARA(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PFN_CRYPT_ALLOC = null,
    public var pfnFree: PFN_CRYPT_FREE = null,
)

public data class CRYPT_DECRYPT_MESSAGE_PARA(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var cCertStore: UInt = 0u,
    public var rghCertStore: Long = 0L,
)

public data class CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA(public var cOID: UInt = 0u, public var rgpszOID: Long = 0L)

public data class CRYPT_DES_KEY_STATE(
    public var Key: UByteArray = UByteArray(8),
    public var IV: UByteArray = UByteArray(8),
    public var Feedback: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_DES_KEY_STATE) return false
        if (!this.Key.contentEquals(other.Key)) return false
        if (!this.IV.contentEquals(other.IV)) return false
        if (!this.Feedback.contentEquals(other.Feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Key.contentHashCode()
        result = 31 * result + this.IV.contentHashCode()
        result = 31 * result + this.Feedback.contentHashCode()
        return result
    }
}

public data class CRYPT_ECC_CMS_SHARED_INFO(
    public var Algorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var EntityUInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var rgbSuppPubInfo: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_ECC_CMS_SHARED_INFO) return false
        if (this.Algorithm != other.Algorithm) return false
        if (this.EntityUInfo != other.EntityUInfo) return false
        if (!this.rgbSuppPubInfo.contentEquals(other.rgbSuppPubInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Algorithm.hashCode()
        result = 31 * result + this.EntityUInfo.hashCode()
        result = 31 * result + this.rgbSuppPubInfo.contentHashCode()
        return result
    }
}

public data class CRYPT_ECC_PRIVATE_KEY_INFO(
    public var dwVersion: UInt = 0u,
    public var PrivateKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var szCurveOid: PSTR = 0L,
    public var PublicKey: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
)

public data class CRYPT_ENCODE_PARA(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PFN_CRYPT_ALLOC = null,
    public var pfnFree: PFN_CRYPT_FREE = null,
)

public data class CRYPT_ENCRYPTED_PRIVATE_KEY_INFO(public var EncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(), public var EncryptedPrivateKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CRYPT_ENCRYPT_MESSAGE_PARA(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvEncryptionAuxInfo: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var dwInnerContentType: UInt = 0u,
)

public data class CRYPT_ENROLLMENT_NAME_VALUE_PAIR(public var pwszName: PWSTR = 0L, public var pwszValue: PWSTR = 0L)

public data class CRYPT_GET_TIME_VALID_OBJECT_EXTRA_INFO(
    public var cbSize: UInt = 0u,
    public var iDeltaCrlIndicator: Int = 0,
    public var pftCacheResync: Long = 0L,
    public var pLastSyncTime: Long = 0L,
    public var pMaxAgeTime: Long = 0L,
    public var pChainPara: Long = 0L,
    public var pDeltaCrlIndicator: Long = 0L,
)

public data class CRYPT_HASH_INFO(public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(), public var Hash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CRYPT_HASH_MESSAGE_PARA(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvHashAuxInfo: Long = 0L,
)

public data class CRYPT_IMAGE_REF(public var pszImage: PWSTR = 0L, public var dwFlags: CRYPT_IMAGE_REF_FLAGS = 0u)

public data class CRYPT_IMAGE_REG(
    public var pszImage: PWSTR = 0L,
    public var cInterfaces: UInt = 0u,
    public var rgpInterfaces: Long = 0L,
)

public data class CRYPT_INTEGER_BLOB(public var cbData: UInt = 0u, public var pbData: Long = 0L)

public data class CRYPT_INTERFACE_REG(
    public var dwInterface: BCRYPT_INTERFACE = 0u,
    public var dwFlags: BCRYPT_TABLE = 0u,
    public var cFunctions: UInt = 0u,
    public var rgpszFunctions: Long = 0L,
)

public data class CRYPT_KEY_PROV_INFO(
    public var pwszContainerName: PWSTR = 0L,
    public var pwszProvName: PWSTR = 0L,
    public var dwProvType: UInt = 0u,
    public var dwFlags: CRYPT_KEY_FLAGS = 0u,
    public var cProvParam: UInt = 0u,
    public var rgProvParam: Long = 0L,
    public var dwKeySpec: UInt = 0u,
)

public data class CRYPT_KEY_PROV_PARAM(
    public var dwParam: UInt = 0u,
    public var pbData: Long = 0L,
    public var cbData: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class CRYPT_KEY_SIGN_MESSAGE_PARA(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: CERT_QUERY_ENCODING_TYPE = 0u,
    public var Anonymous: CRYPT_KEY_SIGN_MESSAGE_PARA_0 = CRYPT_KEY_SIGN_MESSAGE_PARA_0(),
    public var dwKeySpec: CERT_KEY_SPEC = 0u,
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvHashAuxInfo: Long = 0L,
    public var PubKeyAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
)

public data class CRYPT_KEY_SIGN_MESSAGE_PARA_0(public var hCryptProv: ULong = 0uL, public var hNCryptKey: NCRYPT_KEY_HANDLE = 0uL)

public data class CRYPT_KEY_VERIFY_MESSAGE_PARA(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
)

public data class CRYPT_MASK_GEN_ALGORITHM(public var pszObjId: PSTR = 0L, public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER())

public data class CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE(
    public var cbSize: UInt = 0u,
    public var pfnGet: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET = null,
    public var pfnRelease: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE = null,
    public var pfnFreePassword: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD = null,
    public var pfnFree: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE = null,
    public var pfnFreeIdentifier: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER = null,
)

public data class CRYPT_OBJID_TABLE(public var dwAlgId: UInt = 0u, public var pszObjId: PCSTR = 0L)

public data class CRYPT_OID_FUNC_ENTRY(public var pszOID: PCSTR = 0L, public var pvFuncAddr: Long = 0L)

public data class CRYPT_OID_INFO(
    public var cbSize: UInt = 0u,
    public var pszOID: PCSTR = 0L,
    public var pwszName: PCWSTR = 0L,
    public var dwGroupId: UInt = 0u,
    public var Anonymous: CRYPT_OID_INFO_0 = CRYPT_OID_INFO_0(),
    public var ExtraInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CRYPT_OID_INFO_0(
    public var dwValue: UInt = 0u,
    public var Algid: ALG_ID = 0u,
    public var dwLength: UInt = 0u,
)

public data class CRYPT_PASSWORD_CREDENTIALSA(
    public var cbSize: UInt = 0u,
    public var pszUsername: PSTR = 0L,
    public var pszPassword: PSTR = 0L,
)

public data class CRYPT_PASSWORD_CREDENTIALSW(
    public var cbSize: UInt = 0u,
    public var pszUsername: PWSTR = 0L,
    public var pszPassword: PWSTR = 0L,
)

public data class CRYPT_PKCS12_PBE_PARAMS(public var iIterations: Int = 0, public var cbSalt: UInt = 0u)

public data class CRYPT_PKCS8_EXPORT_PARAMS(
    public var hCryptProv: ULong = 0uL,
    public var dwKeySpec: UInt = 0u,
    public var pszPrivateKeyObjId: PSTR = 0L,
    public var pEncryptPrivateKeyFunc: PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC = null,
    public var pVoidEncryptFunc: Long = 0L,
)

public data class CRYPT_PKCS8_IMPORT_PARAMS(
    public var PrivateKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pResolvehCryptProvFunc: PCRYPT_RESOLVE_HCRYPTPROV_FUNC = null,
    public var pVoidResolveFunc: Long = 0L,
    public var pDecryptPrivateKeyFunc: PCRYPT_DECRYPT_PRIVATE_KEY_FUNC = null,
    public var pVoidDecryptFunc: Long = 0L,
)

public data class CRYPT_PRIVATE_KEY_INFO(
    public var Version: UInt = 0u,
    public var Algorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var PrivateKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pAttributes: Long = 0L,
)

public data class CRYPT_PROPERTY_REF(
    public var pszProperty: PWSTR = 0L,
    public var cbValue: UInt = 0u,
    public var pbValue: Long = 0L,
)

public data class CRYPT_PROVIDERS(public var cProviders: UInt = 0u, public var rgpszProviders: Long = 0L)

public data class CRYPT_PROVIDER_REF(
    public var dwInterface: UInt = 0u,
    public var pszFunction: PWSTR = 0L,
    public var pszProvider: PWSTR = 0L,
    public var cProperties: UInt = 0u,
    public var rgpProperties: Long = 0L,
    public var pUM: Long = 0L,
    public var pKM: Long = 0L,
)

public data class CRYPT_PROVIDER_REFS(public var cProviders: UInt = 0u, public var rgpProviders: Long = 0L)

public data class CRYPT_PROVIDER_REG(
    public var cAliases: UInt = 0u,
    public var rgpszAliases: Long = 0L,
    public var pUM: Long = 0L,
    public var pKM: Long = 0L,
)

public data class CRYPT_PSOURCE_ALGORITHM(public var pszObjId: PSTR = 0L, public var EncodingParameters: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CRYPT_RC2_CBC_PARAMETERS(
    public var dwVersion: UInt = 0u,
    public var fIV: BOOL = 0,
    public var rgbIV: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_RC2_CBC_PARAMETERS) return false
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

public data class CRYPT_RC4_KEY_STATE(
    public var Key: UByteArray = UByteArray(16),
    public var SBox: UByteArray = UByteArray(256),
    public var i: UByte = 0u,
    public var j: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_RC4_KEY_STATE) return false
        if (!this.Key.contentEquals(other.Key)) return false
        if (!this.SBox.contentEquals(other.SBox)) return false
        if (this.i != other.i) return false
        if (this.j != other.j) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Key.contentHashCode()
        result = 31 * result + this.SBox.contentHashCode()
        result = 31 * result + this.i.hashCode()
        result = 31 * result + this.j.hashCode()
        return result
    }
}

public data class CRYPT_RETRIEVE_AUX_INFO(
    public var cbSize: UInt = 0u,
    public var pLastSyncTime: Long = 0L,
    public var dwMaxUrlRetrievalByteCount: UInt = 0u,
    public var pPreFetchInfo: Long = 0L,
    public var pFlushInfo: Long = 0L,
    public var ppResponseInfo: Long = 0L,
    public var pwszCacheFileNamePrefix: PWSTR = 0L,
    public var pftCacheResync: Long = 0L,
    public var fProxyCacheRetrieval: BOOL = 0,
    public var dwHttpStatusCode: UInt = 0u,
    public var ppwszErrorResponseHeaders: Long = 0L,
    public var ppErrorContentBlob: Long = 0L,
)

public data class CRYPT_RSAES_OAEP_PARAMETERS(
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var MaskGenAlgorithm: CRYPT_MASK_GEN_ALGORITHM = CRYPT_MASK_GEN_ALGORITHM(),
    public var PSourceAlgorithm: CRYPT_PSOURCE_ALGORITHM = CRYPT_PSOURCE_ALGORITHM(),
)

public data class CRYPT_RSA_SSA_PSS_PARAMETERS(
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var MaskGenAlgorithm: CRYPT_MASK_GEN_ALGORITHM = CRYPT_MASK_GEN_ALGORITHM(),
    public var dwSaltLength: UInt = 0u,
    public var dwTrailerField: UInt = 0u,
)

public data class CRYPT_SEQUENCE_OF_ANY(public var cValue: UInt = 0u, public var rgValue: Long = 0L)

public data class CRYPT_SIGN_MESSAGE_PARA(
    public var cbSize: UInt = 0u,
    public var dwMsgEncodingType: UInt = 0u,
    public var pSigningCert: Long = 0L,
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvHashAuxInfo: Long = 0L,
    public var cMsgCert: UInt = 0u,
    public var rgpMsgCert: Long = 0L,
    public var cMsgCrl: UInt = 0u,
    public var rgpMsgCrl: Long = 0L,
    public var cAuthAttr: UInt = 0u,
    public var rgAuthAttr: Long = 0L,
    public var cUnauthAttr: UInt = 0u,
    public var rgUnauthAttr: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var dwInnerContentType: UInt = 0u,
)

public data class CRYPT_SMART_CARD_ROOT_INFO(public var rgbCardID: UByteArray = UByteArray(16), public var luid: ROOT_INFO_LUID = ROOT_INFO_LUID()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_SMART_CARD_ROOT_INFO) return false
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

public data class CRYPT_SMIME_CAPABILITIES(public var cCapability: UInt = 0u, public var rgCapability: Long = 0L)

public data class CRYPT_SMIME_CAPABILITY(public var pszObjId: PSTR = 0L, public var Parameters: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CRYPT_TIMESTAMP_ACCURACY(
    public var dwSeconds: UInt = 0u,
    public var dwMillis: UInt = 0u,
    public var dwMicros: UInt = 0u,
)

public data class CRYPT_TIMESTAMP_CONTEXT(
    public var cbEncoded: UInt = 0u,
    public var pbEncoded: Long = 0L,
    public var pTimeStamp: Long = 0L,
)

public data class CRYPT_TIMESTAMP_INFO(
    public var dwVersion: UInt = 0u,
    public var pszTSAPolicyId: PSTR = 0L,
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var HashedMessage: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var ftTime: FILETIME = FILETIME(),
    public var pvAccuracy: Long = 0L,
    public var fOrdering: BOOL = 0,
    public var Nonce: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var Tsa: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CRYPT_TIMESTAMP_PARA(
    public var pszTSAPolicyId: PCSTR = 0L,
    public var fRequestCerts: BOOL = 0,
    public var Nonce: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CRYPT_TIMESTAMP_REQUEST(
    public var dwVersion: CRYPT_TIMESTAMP_VERSION = 0u,
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var HashedMessage: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pszTSAPolicyId: PSTR = 0L,
    public var Nonce: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var fCertReq: BOOL = 0,
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CRYPT_TIMESTAMP_RESPONSE(
    public var dwStatus: CRYPT_TIMESTAMP_RESPONSE_STATUS = 0u,
    public var cFreeText: UInt = 0u,
    public var rgFreeText: Long = 0L,
    public var FailureInfo: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var ContentInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CRYPT_TIME_STAMP_REQUEST_INFO(
    public var pszTimeStampAlgorithm: PSTR = 0L,
    public var pszContentType: PSTR = 0L,
    public var Content: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var cAttribute: UInt = 0u,
    public var rgAttribute: Long = 0L,
)

public data class CRYPT_URL_ARRAY(public var cUrl: UInt = 0u, public var rgwszUrl: Long = 0L)

public data class CRYPT_URL_INFO(
    public var cbSize: UInt = 0u,
    public var dwSyncDeltaTime: UInt = 0u,
    public var cGroup: UInt = 0u,
    public var rgcGroupEntry: Long = 0L,
)

public data class CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO(public var CertSignHashCNGAlgPropData: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var CertIssuerPubKeyBitLengthPropData: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CRYPT_VERIFY_CERT_SIGN_WEAK_HASH_INFO(
    public var cCNGHashAlgid: UInt = 0u,
    public var rgpwszCNGHashAlgid: Long = 0L,
    public var dwWeakIndex: UInt = 0u,
)

public data class CRYPT_VERIFY_MESSAGE_PARA(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var pfnGetSignerCertificate: PFN_CRYPT_GET_SIGNER_CERTIFICATE = null,
    public var pvGetArg: Long = 0L,
)

public data class CRYPT_X942_OTHER_INFO(
    public var pszContentEncryptionObjId: PSTR = 0L,
    public var rgbCounter: UByteArray = UByteArray(4),
    public var rgbKeyLength: UByteArray = UByteArray(4),
    public var PubInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_X942_OTHER_INFO) return false
        if (this.pszContentEncryptionObjId != other.pszContentEncryptionObjId) return false
        if (!this.rgbCounter.contentEquals(other.rgbCounter)) return false
        if (!this.rgbKeyLength.contentEquals(other.rgbKeyLength)) return false
        if (this.PubInfo != other.PubInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszContentEncryptionObjId.hashCode()
        result = 31 * result + this.rgbCounter.contentHashCode()
        result = 31 * result + this.rgbKeyLength.contentHashCode()
        result = 31 * result + this.PubInfo.hashCode()
        return result
    }
}

public data class CRYPT_XML_ALGORITHM(
    public var cbSize: UInt = 0u,
    public var wszAlgorithm: PCWSTR = 0L,
    public var Encoded: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
)

public data class CRYPT_XML_ALGORITHM_INFO(
    public var cbSize: UInt = 0u,
    public var wszAlgorithmURI: PWSTR = 0L,
    public var wszName: PWSTR = 0L,
    public var dwGroupId: CRYPT_XML_GROUP_ID = 0u,
    public var wszCNGAlgid: PWSTR = 0L,
    public var wszCNGExtraAlgid: PWSTR = 0L,
    public var dwSignFlags: UInt = 0u,
    public var dwVerifyFlags: UInt = 0u,
    public var pvPaddingInfo: Long = 0L,
    public var pvExtraInfo: Long = 0L,
)

public data class CRYPT_XML_BLOB(
    public var dwCharset: CRYPT_XML_CHARSET = 0,
    public var cbData: UInt = 0u,
    public var pbData: Long = 0L,
)

public data class CRYPT_XML_CRYPTOGRAPHIC_INTERFACE(
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

public data class CRYPT_XML_DATA_BLOB(public var cbData: UInt = 0u, public var pbData: Long = 0L)

public data class CRYPT_XML_DATA_PROVIDER(
    public var pvCallbackState: Long = 0L,
    public var cbBufferSize: UInt = 0u,
    public var pfnRead: PFN_CRYPT_XML_DATA_PROVIDER_READ = null,
    public var pfnClose: PFN_CRYPT_XML_DATA_PROVIDER_CLOSE = null,
)

public data class CRYPT_XML_DOC_CTXT(
    public var cbSize: UInt = 0u,
    public var hDocCtxt: Long = 0L,
    public var pTransformsConfig: Long = 0L,
    public var cSignature: UInt = 0u,
    public var rgpSignature: Long = 0L,
)

public data class CRYPT_XML_ISSUER_SERIAL(public var wszIssuer: PCWSTR = 0L, public var wszSerial: PCWSTR = 0L)

public data class CRYPT_XML_KEYINFO_PARAM(
    public var wszId: PCWSTR = 0L,
    public var wszKeyName: PCWSTR = 0L,
    public var SKI: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var wszSubjectName: PCWSTR = 0L,
    public var cCertificate: UInt = 0u,
    public var rgCertificate: Long = 0L,
    public var cCRL: UInt = 0u,
    public var rgCRL: Long = 0L,
)

public data class CRYPT_XML_KEY_DSA_KEY_VALUE(
    public var P: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var Q: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var G: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var Y: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var J: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var Seed: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var Counter: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
)

public data class CRYPT_XML_KEY_ECDSA_KEY_VALUE(
    public var wszNamedCurve: PCWSTR = 0L,
    public var X: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var Y: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var ExplicitPara: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
)

public data class CRYPT_XML_KEY_INFO(
    public var cbSize: UInt = 0u,
    public var wszId: PCWSTR = 0L,
    public var cKeyInfo: UInt = 0u,
    public var rgKeyInfo: Long = 0L,
    public var hVerifyKey: BCRYPT_KEY_HANDLE = 0L,
)

public data class CRYPT_XML_KEY_INFO_ITEM(public var dwType: CRYPT_XML_KEYINFO_TYPE = 0u, public var Anonymous: CRYPT_XML_KEY_INFO_ITEM_0 = CRYPT_XML_KEY_INFO_ITEM_0())

public data class CRYPT_XML_KEY_INFO_ITEM_0(
    public var wszKeyName: PCWSTR = 0L,
    public var KeyValue: CRYPT_XML_KEY_VALUE = CRYPT_XML_KEY_VALUE(),
    public var RetrievalMethod: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
    public var X509Data: CRYPT_XML_X509DATA = CRYPT_XML_X509DATA(),
    public var Custom: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
)

public data class CRYPT_XML_KEY_RSA_KEY_VALUE(public var Modulus: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(), public var Exponent: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB())

public data class CRYPT_XML_KEY_VALUE(public var dwType: CRYPT_XML_KEY_VALUE_TYPE = 0u, public var Anonymous: CRYPT_XML_KEY_VALUE_0 = CRYPT_XML_KEY_VALUE_0())

public data class CRYPT_XML_KEY_VALUE_0(
    public var DSAKeyValue: CRYPT_XML_KEY_DSA_KEY_VALUE = CRYPT_XML_KEY_DSA_KEY_VALUE(),
    public var RSAKeyValue: CRYPT_XML_KEY_RSA_KEY_VALUE = CRYPT_XML_KEY_RSA_KEY_VALUE(),
    public var ECDSAKeyValue: CRYPT_XML_KEY_ECDSA_KEY_VALUE = CRYPT_XML_KEY_ECDSA_KEY_VALUE(),
    public var Custom: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
)

public data class CRYPT_XML_OBJECT(
    public var cbSize: UInt = 0u,
    public var hObject: Long = 0L,
    public var wszId: PCWSTR = 0L,
    public var wszMimeType: PCWSTR = 0L,
    public var wszEncoding: PCWSTR = 0L,
    public var Manifest: CRYPT_XML_REFERENCES = CRYPT_XML_REFERENCES(),
    public var Encoded: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
)

public data class CRYPT_XML_PROPERTY(
    public var dwPropId: CRYPT_XML_PROPERTY_ID = 0,
    public var pvValue: Long = 0L,
    public var cbValue: UInt = 0u,
)

public data class CRYPT_XML_REFERENCE(
    public var cbSize: UInt = 0u,
    public var hReference: Long = 0L,
    public var wszId: PCWSTR = 0L,
    public var wszUri: PCWSTR = 0L,
    public var wszType: PCWSTR = 0L,
    public var DigestMethod: CRYPT_XML_ALGORITHM = CRYPT_XML_ALGORITHM(),
    public var DigestValue: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var cTransform: UInt = 0u,
    public var rgTransform: Long = 0L,
)

public data class CRYPT_XML_REFERENCES(public var cReference: UInt = 0u, public var rgpReference: Long = 0L)

public data class CRYPT_XML_SIGNATURE(
    public var cbSize: UInt = 0u,
    public var hSignature: Long = 0L,
    public var wszId: PCWSTR = 0L,
    public var SignedInfo: CRYPT_XML_SIGNED_INFO = CRYPT_XML_SIGNED_INFO(),
    public var SignatureValue: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pKeyInfo: Long = 0L,
    public var cObject: UInt = 0u,
    public var rgpObject: Long = 0L,
)

public data class CRYPT_XML_SIGNED_INFO(
    public var cbSize: UInt = 0u,
    public var wszId: PCWSTR = 0L,
    public var Canonicalization: CRYPT_XML_ALGORITHM = CRYPT_XML_ALGORITHM(),
    public var SignatureMethod: CRYPT_XML_ALGORITHM = CRYPT_XML_ALGORITHM(),
    public var cReference: UInt = 0u,
    public var rgpReference: Long = 0L,
    public var Encoded: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
)

public data class CRYPT_XML_STATUS(
    public var cbSize: UInt = 0u,
    public var dwErrorStatus: CRYPT_XML_STATUS_ERROR_STATUS = 0u,
    public var dwInfoStatus: CRYPT_XML_STATUS_INFO_STATUS = 0u,
)

public data class CRYPT_XML_TRANSFORM_CHAIN_CONFIG(
    public var cbSize: UInt = 0u,
    public var cTransformInfo: UInt = 0u,
    public var rgpTransformInfo: Long = 0L,
)

public data class CRYPT_XML_TRANSFORM_INFO(
    public var cbSize: UInt = 0u,
    public var wszAlgorithm: PCWSTR = 0L,
    public var cbBufferSize: UInt = 0u,
    public var dwFlags: CRYPT_XML_TRANSFORM_FLAGS = 0u,
    public var pfnCreateTransform: PFN_CRYPT_XML_CREATE_TRANSFORM = null,
)

public data class CRYPT_XML_X509DATA(public var cX509Data: UInt = 0u, public var rgX509Data: Long = 0L)

public data class CRYPT_XML_X509DATA_ITEM(public var dwType: CRYPT_XML_X509DATA_TYPE = 0u, public var Anonymous: CRYPT_XML_X509DATA_ITEM_0 = CRYPT_XML_X509DATA_ITEM_0())

public data class CRYPT_XML_X509DATA_ITEM_0(
    public var IssuerSerial: CRYPT_XML_ISSUER_SERIAL = CRYPT_XML_ISSUER_SERIAL(),
    public var SKI: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var wszSubjectName: PCWSTR = 0L,
    public var Certificate: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var CRL: CRYPT_XML_DATA_BLOB = CRYPT_XML_DATA_BLOB(),
    public var Custom: CRYPT_XML_BLOB = CRYPT_XML_BLOB(),
)

public data class CTL_ANY_SUBJECT_INFO(public var SubjectAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(), public var SubjectIdentifier: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CTL_CONTEXT(
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var pbCtlEncoded: Long = 0L,
    public var cbCtlEncoded: UInt = 0u,
    public var pCtlInfo: Long = 0L,
    public var hCertStore: HCERTSTORE = 0L,
    public var hCryptMsg: Long = 0L,
    public var pbCtlContent: Long = 0L,
    public var cbCtlContent: UInt = 0u,
)

public data class CTL_ENTRY(
    public var SubjectIdentifier: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var cAttribute: UInt = 0u,
    public var rgAttribute: Long = 0L,
)

public data class CTL_FIND_SUBJECT_PARA(
    public var cbSize: UInt = 0u,
    public var pUsagePara: Long = 0L,
    public var dwSubjectType: UInt = 0u,
    public var pvSubject: Long = 0L,
)

public data class CTL_FIND_USAGE_PARA(
    public var cbSize: UInt = 0u,
    public var SubjectUsage: CTL_USAGE = CTL_USAGE(),
    public var ListIdentifier: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pSigner: Long = 0L,
)

public data class CTL_INFO(
    public var dwVersion: UInt = 0u,
    public var SubjectUsage: CTL_USAGE = CTL_USAGE(),
    public var ListIdentifier: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SequenceNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var ThisUpdate: FILETIME = FILETIME(),
    public var NextUpdate: FILETIME = FILETIME(),
    public var SubjectAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var cCTLEntry: UInt = 0u,
    public var rgCTLEntry: Long = 0L,
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CTL_USAGE(public var cUsageIdentifier: UInt = 0u, public var rgpszUsageIdentifier: Long = 0L)

public data class CTL_USAGE_MATCH(public var dwType: UInt = 0u, public var Usage: CTL_USAGE = CTL_USAGE())

public data class CTL_VERIFY_USAGE_PARA(
    public var cbSize: UInt = 0u,
    public var ListIdentifier: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var cCtlStore: UInt = 0u,
    public var rghCtlStore: Long = 0L,
    public var cSignerStore: UInt = 0u,
    public var rghSignerStore: Long = 0L,
)

public data class CTL_VERIFY_USAGE_STATUS(
    public var cbSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var ppCtl: Long = 0L,
    public var dwCtlEntryIndex: UInt = 0u,
    public var ppSigner: Long = 0L,
    public var dwSignerIndex: UInt = 0u,
)

public data class DSSSEED(public var counter: UInt = 0u, public var seed: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DSSSEED) return false
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

public data class ENDPOINTADDRESS(
    public var serviceUrl: PCWSTR = 0L,
    public var policyUrl: PCWSTR = 0L,
    public var rawCertificate: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class ENDPOINTADDRESS2(
    public var serviceUrl: PCWSTR = 0L,
    public var policyUrl: PCWSTR = 0L,
    public var identityType: UInt = 0u,
    public var identityBytes: Long = 0L,
)

public data class EV_EXTRA_CERT_CHAIN_POLICY_PARA(public var cbSize: UInt = 0u, public var dwRootProgramQualifierFlags: CERT_ROOT_PROGRAM_FLAGS = 0u)

public data class EV_EXTRA_CERT_CHAIN_POLICY_STATUS(
    public var cbSize: UInt = 0u,
    public var dwQualifiers: UInt = 0u,
    public var dwIssuanceUsageIndex: UInt = 0u,
)

public data class GENERIC_XML_TOKEN(
    public var createDate: FILETIME = FILETIME(),
    public var expiryDate: FILETIME = FILETIME(),
    public var xmlToken: PWSTR = 0L,
    public var internalTokenReference: PWSTR = 0L,
    public var externalTokenReference: PWSTR = 0L,
)

public data class HMAC_INFO(
    public var HashAlgid: ALG_ID = 0u,
    public var pbInnerString: Long = 0L,
    public var cbInnerString: UInt = 0u,
    public var pbOuterString: Long = 0L,
    public var cbOuterString: UInt = 0u,
)

public data class HTTPSPolicyCallbackData(
    public var Anonymous: HTTPSPolicyCallbackData_0 = HTTPSPolicyCallbackData_0(),
    public var dwAuthType: HTTPSPOLICY_CALLBACK_DATA_AUTH_TYPE = 0u,
    public var fdwChecks: UInt = 0u,
    public var pwszServerName: PWSTR = 0L,
)

public data class HTTPSPolicyCallbackData_0(public var cbStruct: UInt = 0u, public var cbSize: UInt = 0u)

public data class HandleType(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val Asymmetric: HandleType = HandleType(1)

        public val Symmetric: HandleType = HandleType(2)

        public val Transform: HandleType = HandleType(3)

        public val Hash: HandleType = HandleType(4)
    }
}

public data class INFORMATIONCARD_ASYMMETRIC_CRYPTO_PARAMETERS(
    public var keySize: Int = 0,
    public var keyExchangeAlgorithm: PWSTR = 0L,
    public var signatureAlgorithm: PWSTR = 0L,
)

public data class INFORMATIONCARD_CRYPTO_HANDLE(
    public var type: HandleType = HandleType(),
    public var expiration: Long = 0L,
    public var cryptoParameters: Long = 0L,
)

public data class INFORMATIONCARD_HASH_CRYPTO_PARAMETERS(public var hashSize: Int = 0, public var transform: INFORMATIONCARD_TRANSFORM_CRYPTO_PARAMETERS = INFORMATIONCARD_TRANSFORM_CRYPTO_PARAMETERS())

public data class INFORMATIONCARD_SYMMETRIC_CRYPTO_PARAMETERS(
    public var keySize: Int = 0,
    public var blockSize: Int = 0,
    public var feedbackSize: Int = 0,
)

public data class INFORMATIONCARD_TRANSFORM_CRYPTO_PARAMETERS(
    public var inputBlockSize: Int = 0,
    public var outputBlockSize: Int = 0,
    public var canTransformMultipleBlocks: BOOL = 0,
    public var canReuseTransform: BOOL = 0,
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

public data class KEY_TYPE_SUBTYPE(
    public var dwKeySpec: UInt = 0u,
    public var Type: GUID = GUID(),
    public var Subtype: GUID = GUID(),
)

public data class NCRYPT_ALLOC_PARA(
    public var cbSize: UInt = 0u,
    public var pfnAlloc: PFN_NCRYPT_ALLOC = null,
    public var pfnFree: PFN_NCRYPT_FREE = null,
)

public data class NCRYPT_CIPHER_PADDING_INFO(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pbIV: Long = 0L,
    public var cbIV: UInt = 0u,
    public var pbOtherInfo: Long = 0L,
    public var cbOtherInfo: UInt = 0u,
)

public data class NCRYPT_EXPORTED_ISOLATED_KEY_ENVELOPE(public var Header: NCRYPT_EXPORTED_ISOLATED_KEY_HEADER = NCRYPT_EXPORTED_ISOLATED_KEY_HEADER())

public data class NCRYPT_EXPORTED_ISOLATED_KEY_HEADER(
    public var Version: UInt = 0u,
    public var KeyUsage: UInt = 0u,
    public var _bitfield: UInt = 0u,
    public var cbAlgName: UInt = 0u,
    public var cbNonce: UInt = 0u,
    public var cbAuthTag: UInt = 0u,
    public var cbWrappingKey: UInt = 0u,
    public var cbIsolatedKey: UInt = 0u,
)

public data class NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var cbPublicKeyBlob: UInt = 0u,
)

public data class NCRYPT_KEY_ACCESS_POLICY_BLOB(
    public var dwVersion: UInt = 0u,
    public var dwPolicyFlags: UInt = 0u,
    public var cbUserSid: UInt = 0u,
    public var cbApplicationSid: UInt = 0u,
)

public data class NCRYPT_KEY_ATTEST_PADDING_INFO(
    public var magic: UInt = 0u,
    public var pbKeyBlob: Long = 0L,
    public var cbKeyBlob: UInt = 0u,
    public var pbKeyAuth: Long = 0L,
    public var cbKeyAuth: UInt = 0u,
)

public data class NCRYPT_KEY_BLOB_HEADER(
    public var cbSize: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbAlgName: UInt = 0u,
    public var cbKeyData: UInt = 0u,
)

public class NCRYPT_KEY_STORAGE_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenProvider: NCryptOpenStorageProviderFn = null,
    public var OpenKey: NCryptOpenKeyFn = null,
    public var CreatePersistedKey: NCryptCreatePersistedKeyFn = null,
    public var GetProviderProperty: NCryptGetProviderPropertyFn = null,
    public var GetKeyProperty: NCryptGetKeyPropertyFn = null,
    public var SetProviderProperty: NCryptSetProviderPropertyFn = null,
    public var SetKeyProperty: NCryptSetKeyPropertyFn = null,
    public var FinalizeKey: NCryptFinalizeKeyFn = null,
    public var DeleteKey: NCryptDeleteKeyFn = null,
    public var FreeProvider: NCryptFreeProviderFn = null,
    public var FreeKey: NCryptFreeKeyFn = null,
    public var FreeBuffer: NCryptFreeBufferFn = null,
    public var Encrypt: NCryptEncryptFn = null,
    public var Decrypt: NCryptDecryptFn = null,
    public var IsAlgSupported: NCryptIsAlgSupportedFn = null,
    public var EnumAlgorithms: NCryptEnumAlgorithmsFn = null,
    public var EnumKeys: NCryptEnumKeysFn = null,
    public var ImportKey: NCryptImportKeyFn = null,
    public var ExportKey: NCryptExportKeyFn = null,
    public var SignHash: NCryptSignHashFn = null,
    public var VerifySignature: NCryptVerifySignatureFn = null,
    public var PromptUser: NCryptPromptUserFn = null,
    public var NotifyChangeKey: NCryptNotifyChangeKeyFn = null,
    public var SecretAgreement: NCryptSecretAgreementFn = null,
    public var DeriveKey: NCryptDeriveKeyFn = null,
    public var FreeSecret: NCryptFreeSecretFn = null,
    public var KeyDerivation: NCryptKeyDerivationFn = null,
    public var CreateClaim: NCryptCreateClaimFn = null,
    public var VerifyClaim: NCryptVerifyClaimFn = null,
)

public data class NCRYPT_PCP_HMAC_AUTH_SIGNATURE_INFO(
    public var dwVersion: UInt = 0u,
    public var iExpiration: Int = 0,
    public var pabNonce: UByteArray = UByteArray(32),
    public var pabPolicyRef: UByteArray = UByteArray(32),
    public var pabHMAC: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NCRYPT_PCP_HMAC_AUTH_SIGNATURE_INFO) return false
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

public data class NCRYPT_PCP_RAW_POLICYDIGEST_INFO(public var dwVersion: UInt = 0u, public var cbDigest: UInt = 0u)

public data class NCRYPT_PCP_TPM_FW_VERSION_INFO(
    public var major1: UShort = 0u,
    public var major2: UShort = 0u,
    public var minor1: UShort = 0u,
    public var minor2: UShort = 0u,
)

public data class NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT(
    public var Magic: UInt = 0u,
    public var Version: UInt = 0u,
    public var HeaderSize: UInt = 0u,
    public var cbCertifyInfo: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbTpmPublic: UInt = 0u,
)

public data class NCRYPT_PLATFORM_ATTEST_PADDING_INFO(public var magic: UInt = 0u, public var pcrMask: UInt = 0u)

public data class NCRYPT_PROTECT_STREAM_INFO(public var pfnStreamOutput: PFNCryptStreamOutputCallback = null, public var pvCallbackCtxt: Long = 0L)

public data class NCRYPT_PROTECT_STREAM_INFO_EX(public var pfnStreamOutput: PFNCryptStreamOutputCallbackEx = null, public var pvCallbackCtxt: Long = 0L)

public data class NCRYPT_SSL_CIPHER_LENGTHS(
    public var cbLength: UInt = 0u,
    public var dwHeaderLen: UInt = 0u,
    public var dwFixedTrailerLen: UInt = 0u,
    public var dwMaxVariableTrailerLen: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class NCRYPT_SSL_CIPHER_SUITE(
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
        if (other !is NCRYPT_SSL_CIPHER_SUITE) return false
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

public data class NCRYPT_SSL_CIPHER_SUITE_EX(
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
        if (other !is NCRYPT_SSL_CIPHER_SUITE_EX) return false
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

public data class NCRYPT_SSL_ECC_CURVE(
    public var szCurveName: UShortArray = UShortArray(255),
    public var szOID: ByteArray = ByteArray(255),
    public var dwPublicKeyLength: UInt = 0u,
    public var dwCurveType: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NCRYPT_SSL_ECC_CURVE) return false
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

public class NCRYPT_SSL_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var ComputeClientAuthHash: SslComputeClientAuthHashFn = null,
    public var ComputeEapKeyBlock: SslComputeEapKeyBlockFn = null,
    public var ComputeFinishedHash: SslComputeFinishedHashFn = null,
    public var CreateEphemeralKey: SslCreateEphemeralKeyFn = null,
    public var CreateHandshakeHash: SslCreateHandshakeHashFn = null,
    public var DecryptPacket: SslDecryptPacketFn = null,
    public var EncryptPacket: SslEncryptPacketFn = null,
    public var EnumCipherSuites: SslEnumCipherSuitesFn = null,
    public var ExportKey: SslExportKeyFn = null,
    public var FreeBuffer: SslFreeBufferFn = null,
    public var FreeObject: SslFreeObjectFn = null,
    public var GenerateMasterKey: SslGenerateMasterKeyFn = null,
    public var GenerateSessionKeys: SslGenerateSessionKeysFn = null,
    public var GetKeyProperty: SslGetKeyPropertyFn = null,
    public var GetProviderProperty: SslGetProviderPropertyFn = null,
    public var HashHandshake: SslHashHandshakeFn = null,
    public var ImportMasterKey: SslImportMasterKeyFn = null,
    public var ImportKey: SslImportKeyFn = null,
    public var LookupCipherSuiteInfo: SslLookupCipherSuiteInfoFn = null,
    public var OpenPrivateKey: SslOpenPrivateKeyFn = null,
    public var OpenProvider: SslOpenProviderFn = null,
    public var SignHash: SslSignHashFn = null,
    public var VerifySignature: SslVerifySignatureFn = null,
    public var LookupCipherLengths: SslLookupCipherLengthsFn = null,
    public var CreateClientAuthHash: SslCreateClientAuthHashFn = null,
    public var GetCipherSuitePRFHashAlgorithm: SslGetCipherSuitePRFHashAlgorithmFn = null,
    public var ComputeSessionHash: SslComputeSessionHashFn = null,
    public var GeneratePreMasterKey: SslGeneratePreMasterKeyFn = null,
    public var EnumEccCurves: SslEnumEccCurvesFn = null,
    public var ExportKeyingMaterial: SslExportKeyingMaterialFn = null,
    public var ExtractEarlyKey: SslExtractEarlyKeyFn = null,
    public var ExtractHandshakeKey: SslExtractHandshakeKeyFn = null,
    public var ExtractMasterKey: SslExtractMasterKeyFn = null,
    public var ExpandTrafficKeys: SslExpandTrafficKeysFn = null,
    public var ExpandWriteKey: SslExpandWriteKeyFn = null,
    public var ExpandExporterMasterKey: SslExpandExporterMasterKeyFn = null,
    public var EnumCipherSuitesEx: SslEnumCipherSuitesExFn = null,
    public var ExpandResumptionMasterKey: SslExpandResumptionMasterKeyFn = null,
    public var DuplicateTranscriptHash: SslDuplicateTranscriptHashFn = null,
    public var ExpandBinderKey: SslExpandBinderKeyFn = null,
    public var ExpandPreSharedKey: SslExpandPreSharedKeyFn = null,
)

public data class NCRYPT_SUPPORTED_LENGTHS(
    public var dwMinLength: UInt = 0u,
    public var dwMaxLength: UInt = 0u,
    public var dwIncrement: UInt = 0u,
    public var dwDefaultLength: UInt = 0u,
)

public data class NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER(
    public var magic: UInt = 0u,
    public var cbHeader: UInt = 0u,
    public var cbPublic: UInt = 0u,
    public var cbPrivate: UInt = 0u,
    public var cbName: UInt = 0u,
)

public data class NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT(
    public var Magic: UInt = 0u,
    public var Version: UInt = 0u,
    public var pcrAlg: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbQuote: UInt = 0u,
    public var cbPcrs: UInt = 0u,
)

public data class NCRYPT_UI_POLICY(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pszCreationTitle: PCWSTR = 0L,
    public var pszFriendlyName: PCWSTR = 0L,
    public var pszDescription: PCWSTR = 0L,
)

public data class NCRYPT_UI_POLICY_BLOB(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cbCreationTitle: UInt = 0u,
    public var cbFriendlyName: UInt = 0u,
    public var cbDescription: UInt = 0u,
)

public data class NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS(
    public var Version: UInt = 0u,
    public var TrustletId: ULong = 0uL,
    public var MinSvn: UInt = 0u,
    public var FlagsMask: UInt = 0u,
    public var FlagsExpected: UInt = 0u,
    public var _bitfield: UInt = 0u,
)

public data class NCRYPT_VSM_KEY_ATTESTATION_STATEMENT(
    public var Magic: UInt = 0u,
    public var Version: UInt = 0u,
    public var cbSignature: UInt = 0u,
    public var cbReport: UInt = 0u,
    public var cbAttributes: UInt = 0u,
)

public data class NCryptAlgorithmName(
    public var pszName: PWSTR = 0L,
    public var dwClass: NCRYPT_ALGORITHM_NAME_CLASS = 0u,
    public var dwAlgOperations: NCRYPT_OPERATION = 0u,
    public var dwFlags: UInt = 0u,
)

public data class NCryptKeyName(
    public var pszName: PWSTR = 0L,
    public var pszAlgid: PWSTR = 0L,
    public var dwLegacyKeySpec: CERT_KEY_SPEC = 0u,
    public var dwFlags: UInt = 0u,
)

public data class NCryptProviderName(public var pszName: PWSTR = 0L, public var pszComment: PWSTR = 0L)

public data class OCSP_BASIC_RESPONSE_ENTRY(
    public var CertId: OCSP_CERT_ID = OCSP_CERT_ID(),
    public var dwCertStatus: UInt = 0u,
    public var Anonymous: OCSP_BASIC_RESPONSE_ENTRY_0 = OCSP_BASIC_RESPONSE_ENTRY_0(),
    public var ThisUpdate: FILETIME = FILETIME(),
    public var NextUpdate: FILETIME = FILETIME(),
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class OCSP_BASIC_RESPONSE_ENTRY_0(public var pRevokedInfo: Long = 0L)

public data class OCSP_BASIC_RESPONSE_INFO(
    public var dwVersion: UInt = 0u,
    public var dwResponderIdChoice: UInt = 0u,
    public var Anonymous: OCSP_BASIC_RESPONSE_INFO_0 = OCSP_BASIC_RESPONSE_INFO_0(),
    public var ProducedAt: FILETIME = FILETIME(),
    public var cResponseEntry: UInt = 0u,
    public var rgResponseEntry: Long = 0L,
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class OCSP_BASIC_RESPONSE_INFO_0(public var ByNameResponderId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var ByKeyResponderId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class OCSP_BASIC_REVOKED_INFO(public var RevocationDate: FILETIME = FILETIME(), public var dwCrlReasonCode: CERT_REVOCATION_STATUS_REASON = 0u)

public data class OCSP_BASIC_SIGNED_RESPONSE_INFO(public var ToBeSigned: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var SignatureInfo: OCSP_SIGNATURE_INFO = OCSP_SIGNATURE_INFO())

public data class OCSP_CERT_ID(
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var IssuerNameHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var IssuerKeyHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class OCSP_REQUEST_ENTRY(
    public var CertId: OCSP_CERT_ID = OCSP_CERT_ID(),
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class OCSP_REQUEST_INFO(
    public var dwVersion: UInt = 0u,
    public var pRequestorName: Long = 0L,
    public var cRequestEntry: UInt = 0u,
    public var rgRequestEntry: Long = 0L,
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class OCSP_RESPONSE_INFO(
    public var dwStatus: UInt = 0u,
    public var pszObjId: PSTR = 0L,
    public var Value: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class OCSP_SIGNATURE_INFO(
    public var SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var Signature: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var cCertEncoded: UInt = 0u,
    public var rgCertEncoded: Long = 0L,
)

public data class OCSP_SIGNED_REQUEST_INFO(public var ToBeSigned: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var pOptionalSignatureInfo: Long = 0L)

public data class OFFLOAD_PRIVATE_KEY(
    public var dwVersion: UInt = 0u,
    public var cbPrime1: UInt = 0u,
    public var cbPrime2: UInt = 0u,
    public var pbPrime1: Long = 0L,
    public var pbPrime2: Long = 0L,
)

public data class PIN_CACHE_POLICY(
    public var dwVersion: UInt = 0u,
    public var PinCachePolicyType: PIN_CACHE_POLICY_TYPE = 0,
    public var dwPinCachePolicyInfo: UInt = 0u,
)

public data class PIN_INFO(
    public var dwVersion: UInt = 0u,
    public var PinType: SECRET_TYPE = 0,
    public var PinPurpose: SECRET_PURPOSE = 0,
    public var dwChangePermission: UInt = 0u,
    public var dwUnblockPermission: UInt = 0u,
    public var PinCachePolicy: PIN_CACHE_POLICY = PIN_CACHE_POLICY(),
    public var dwFlags: UInt = 0u,
)

public data class PKCS12_PBES2_EXPORT_PARAMS(
    public var dwSize: UInt = 0u,
    public var hNcryptDescriptor: Long = 0L,
    public var pwszPbes2Alg: PWSTR = 0L,
)

public data class POLICY_ELEMENT(
    public var targetEndpointAddress: PCWSTR = 0L,
    public var issuerEndpointAddress: PCWSTR = 0L,
    public var issuedTokenParameters: PCWSTR = 0L,
    public var privacyNoticeLink: PCWSTR = 0L,
    public var privacyNoticeVersion: UInt = 0u,
    public var useManagedPresentation: BOOL = 0,
)

public data class PRIVKEYVER3(
    public var magic: UInt = 0u,
    public var bitlenP: UInt = 0u,
    public var bitlenQ: UInt = 0u,
    public var bitlenJ: UInt = 0u,
    public var bitlenX: UInt = 0u,
    public var DSSSeed: DSSSEED = DSSSEED(),
)

public data class PROV_ENUMALGS(
    public var aiAlgid: ALG_ID = 0u,
    public var dwBitLen: UInt = 0u,
    public var dwNameLen: UInt = 0u,
    public var szName: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROV_ENUMALGS) return false
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

public data class PROV_ENUMALGS_EX(
    public var aiAlgid: ALG_ID = 0u,
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
        if (other !is PROV_ENUMALGS_EX) return false
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

public data class PUBKEY(public var magic: UInt = 0u, public var bitlen: UInt = 0u)

public data class PUBKEYVER3(
    public var magic: UInt = 0u,
    public var bitlenP: UInt = 0u,
    public var bitlenQ: UInt = 0u,
    public var bitlenJ: UInt = 0u,
    public var DSSSeed: DSSSEED = DSSSEED(),
)

public data class PUBLICKEYSTRUC(
    public var bType: UByte = 0u,
    public var bVersion: UByte = 0u,
    public var reserved: UShort = 0u,
    public var aiKeyAlg: ALG_ID = 0u,
)

public data class PaddingMode(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val None: PaddingMode = PaddingMode(1)

        public val PKCS7: PaddingMode = PaddingMode(2)

        public val Zeros: PaddingMode = PaddingMode(3)

        public val ANSIX923: PaddingMode = PaddingMode(4)

        public val ISO10126: PaddingMode = PaddingMode(5)
    }
}

public data class RECIPIENTPOLICY(
    public var recipient: ENDPOINTADDRESS = ENDPOINTADDRESS(),
    public var issuer: ENDPOINTADDRESS = ENDPOINTADDRESS(),
    public var tokenType: PCWSTR = 0L,
    public var requiredClaims: CLAIMLIST = CLAIMLIST(),
    public var optionalClaims: CLAIMLIST = CLAIMLIST(),
    public var privacyUrl: PCWSTR = 0L,
    public var privacyVersion: UInt = 0u,
)

public data class RECIPIENTPOLICY2(
    public var recipient: ENDPOINTADDRESS2 = ENDPOINTADDRESS2(),
    public var issuer: ENDPOINTADDRESS2 = ENDPOINTADDRESS2(),
    public var tokenType: PCWSTR = 0L,
    public var requiredClaims: CLAIMLIST = CLAIMLIST(),
    public var optionalClaims: CLAIMLIST = CLAIMLIST(),
    public var privacyUrl: PCWSTR = 0L,
    public var privacyVersion: UInt = 0u,
)

public data class ROOT_INFO_LUID(public var LowPart: UInt = 0u, public var HighPart: Int = 0)

public data class RSAPUBKEY(
    public var magic: UInt = 0u,
    public var bitlen: UInt = 0u,
    public var pubexp: UInt = 0u,
)

public data class SCHANNEL_ALG(
    public var dwUse: UInt = 0u,
    public var Algid: ALG_ID = 0u,
    public var cBits: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class SIGNER_ATTR_AUTHCODE(
    public var cbSize: UInt = 0u,
    public var fCommercial: BOOL = 0,
    public var fIndividual: BOOL = 0,
    public var pwszName: PCWSTR = 0L,
    public var pwszInfo: PCWSTR = 0L,
)

public data class SIGNER_BLOB_INFO(
    public var cbSize: UInt = 0u,
    public var pGuidSubject: Long = 0L,
    public var cbBlob: UInt = 0u,
    public var pbBlob: Long = 0L,
    public var pwszDisplayName: PCWSTR = 0L,
)

public data class SIGNER_CERT(
    public var cbSize: UInt = 0u,
    public var dwCertChoice: SIGNER_CERT_CHOICE = 0u,
    public var Anonymous: SIGNER_CERT_0 = SIGNER_CERT_0(),
    public var hwnd: HWND = 0L,
)

public data class SIGNER_CERT_0(
    public var pwszSpcFile: PCWSTR = 0L,
    public var pCertStoreInfo: Long = 0L,
    public var pSpcChainInfo: Long = 0L,
)

public data class SIGNER_CERT_STORE_INFO(
    public var cbSize: UInt = 0u,
    public var pSigningCert: Long = 0L,
    public var dwCertPolicy: SIGNER_CERT_POLICY = 0u,
    public var hCertStore: HCERTSTORE = 0L,
)

public data class SIGNER_CONTEXT(
    public var cbSize: UInt = 0u,
    public var cbBlob: UInt = 0u,
    public var pbBlob: Long = 0L,
)

public data class SIGNER_DIGEST_SIGN_INFO(
    public var cbSize: UInt = 0u,
    public var dwDigestSignChoice: UInt = 0u,
    public var Anonymous: SIGNER_DIGEST_SIGN_INFO_0 = SIGNER_DIGEST_SIGN_INFO_0(),
    public var pMetadataBlob: Long = 0L,
    public var dwReserved: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
)

public data class SIGNER_DIGEST_SIGN_INFO_0(
    public var pfnAuthenticodeDigestSign: PFN_AUTHENTICODE_DIGEST_SIGN = null,
    public var pfnAuthenticodeDigestSignWithFileHandle: PFN_AUTHENTICODE_DIGEST_SIGN_WITHFILEHANDLE = null,
    public var pfnAuthenticodeDigestSignEx: PFN_AUTHENTICODE_DIGEST_SIGN_EX = null,
    public var pfnAuthenticodeDigestSignExWithFileHandle: PFN_AUTHENTICODE_DIGEST_SIGN_EX_WITHFILEHANDLE = null,
)

public data class SIGNER_DIGEST_SIGN_INFO_V1(
    public var cbSize: UInt = 0u,
    public var pfnAuthenticodeDigestSign: PFN_AUTHENTICODE_DIGEST_SIGN = null,
    public var pMetadataBlob: Long = 0L,
)

public data class SIGNER_DIGEST_SIGN_INFO_V2(
    public var cbSize: UInt = 0u,
    public var pfnAuthenticodeDigestSign: PFN_AUTHENTICODE_DIGEST_SIGN = null,
    public var pfnAuthenticodeDigestSignEx: PFN_AUTHENTICODE_DIGEST_SIGN_EX = null,
    public var pMetadataBlob: Long = 0L,
)

public data class SIGNER_FILE_INFO(
    public var cbSize: UInt = 0u,
    public var pwszFileName: PCWSTR = 0L,
    public var hFile: HANDLE = 0L,
)

public data class SIGNER_PROVIDER_INFO(
    public var cbSize: UInt = 0u,
    public var pwszProviderName: PCWSTR = 0L,
    public var dwProviderType: UInt = 0u,
    public var dwKeySpec: UInt = 0u,
    public var dwPvkChoice: SIGNER_PRIVATE_KEY_CHOICE = 0u,
    public var Anonymous: SIGNER_PROVIDER_INFO_0 = SIGNER_PROVIDER_INFO_0(),
)

public data class SIGNER_PROVIDER_INFO_0(public var pwszPvkFileName: PWSTR = 0L, public var pwszKeyContainer: PWSTR = 0L)

public data class SIGNER_SIGNATURE_INFO(
    public var cbSize: UInt = 0u,
    public var algidHash: ALG_ID = 0u,
    public var dwAttrChoice: SIGNER_SIGNATURE_ATTRIBUTE_CHOICE = 0u,
    public var Anonymous: SIGNER_SIGNATURE_INFO_0 = SIGNER_SIGNATURE_INFO_0(),
    public var psAuthenticated: Long = 0L,
    public var psUnauthenticated: Long = 0L,
)

public data class SIGNER_SIGNATURE_INFO_0(public var pAttrAuthcode: Long = 0L)

public data class SIGNER_SPC_CHAIN_INFO(
    public var cbSize: UInt = 0u,
    public var pwszSpcFile: PCWSTR = 0L,
    public var dwCertPolicy: UInt = 0u,
    public var hCertStore: HCERTSTORE = 0L,
)

public data class SIGNER_SUBJECT_INFO(
    public var cbSize: UInt = 0u,
    public var pdwIndex: Long = 0L,
    public var dwSubjectChoice: SIGNER_SUBJECT_CHOICE = 0u,
    public var Anonymous: SIGNER_SUBJECT_INFO_0 = SIGNER_SUBJECT_INFO_0(),
)

public data class SIGNER_SUBJECT_INFO_0(public var pSignerFileInfo: Long = 0L, public var pSignerBlobInfo: Long = 0L)

public data class SSL_ECCKEY_BLOB(public var dwCurveType: UInt = 0u, public var cbKey: UInt = 0u)

public data class SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS(
    public var cbSize: UInt = 0u,
    public var dwErrorLevel: UInt = 0u,
    public var dwErrorCategory: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var wszErrorText: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS) return false
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

public data class SSL_HPKP_HEADER_EXTRA_CERT_CHAIN_POLICY_PARA(
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pwszServerName: PWSTR = 0L,
    public var rgpszHpkpValue: LongArray = LongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSL_HPKP_HEADER_EXTRA_CERT_CHAIN_POLICY_PARA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwszServerName != other.pwszServerName) return false
        if (!this.rgpszHpkpValue.contentEquals(other.rgpszHpkpValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwszServerName.hashCode()
        result = 31 * result + this.rgpszHpkpValue.contentHashCode()
        return result
    }
}

public data class SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA(
    public var cbSize: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pwszServerName: PCWSTR = 0L,
)

public data class SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_STATUS(
    public var cbSize: UInt = 0u,
    public var lError: Int = 0,
    public var wszErrorText: UShortArray = UShortArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_STATUS) return false
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
    public var Version: UInt = 0u,
    public var FuncVerifyImage: CRYPT_VERIFY_IMAGE_A = null,
    public var FuncReturnhWnd: CRYPT_RETURN_HWND = null,
    public var dwProvType: UInt = 0u,
    public var pbContextInfo: Long = 0L,
    public var cbContextInfo: UInt = 0u,
    public var pszProvName: PSTR = 0L,
)

public data class VTableProvStrucW(
    public var Version: UInt = 0u,
    public var FuncVerifyImage: CRYPT_VERIFY_IMAGE_W = null,
    public var FuncReturnhWnd: CRYPT_RETURN_HWND = null,
    public var dwProvType: UInt = 0u,
    public var pbContextInfo: Long = 0L,
    public var cbContextInfo: UInt = 0u,
    public var pszProvName: PWSTR = 0L,
)
