@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY

public data class AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA(
    public var cbSize: UInt = 0u,
    public var dwRegPolicySettings: UInt = 0u,
    public var pSignerInfo: Long = 0L,
)

public data class AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS(public var cbSize: UInt = 0u, public var fCommercial: BOOL = 0)

public data class AUTHENTICODE_TS_EXTRA_CERT_CHAIN_POLICY_PARA(
    public var cbSize: UInt = 0u,
    public var dwRegPolicySettings: UInt = 0u,
    public var fCommercial: BOOL = 0,
)

public data class BCRYPT_ALGORITHM_IDENTIFIER(
    public var pszName: PWSTR = 0L,
    public var dwClass: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class BCRYPT_ASYMMETRIC_ENCRYPTION_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var GetProperty: BCryptGetPropertyFn = null,
    public var SetProperty: BCryptSetPropertyFn = null,
    public var CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var GenerateKeyPair: BCryptGenerateKeyPairFn = null,
    public var FinalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var Encrypt: BCryptEncryptFn = null,
    public var Decrypt: BCryptDecryptFn = null,
    public var ImportKeyPair: BCryptImportKeyPairFn = null,
    public var ExportKey: BCryptExportKeyFn = null,
    public var DestroyKey: BCryptDestroyKeyFn = null,
    public var SignHash: BCryptSignHashFn = null,
    public var VerifySignature: BCryptVerifySignatureFn = null,
)

public data class BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO(
    public var cbSize: UInt = 0u,
    public var dwInfoVersion: UInt = 0u,
    public var pbNonce: Long = 0L,
    public var cbNonce: UInt = 0u,
    public var pbAuthData: Long = 0L,
    public var cbAuthData: UInt = 0u,
    public var pbTag: Long = 0L,
    public var cbTag: UInt = 0u,
    public var pbMacContext: Long = 0L,
    public var cbMacContext: UInt = 0u,
    public var cbAAD: UInt = 0u,
    public var cbData: ULong = 0uL,
    public var dwFlags: UInt = 0u,
)

public data class BCRYPT_CIPHER_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var GetProperty: BCryptGetPropertyFn = null,
    public var SetProperty: BCryptSetPropertyFn = null,
    public var CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var GenerateKey: BCryptGenerateSymmetricKeyFn = null,
    public var Encrypt: BCryptEncryptFn = null,
    public var Decrypt: BCryptDecryptFn = null,
    public var ImportKey: BCryptImportKeyFn = null,
    public var ExportKey: BCryptExportKeyFn = null,
    public var DuplicateKey: BCryptDuplicateKeyFn = null,
    public var DestroyKey: BCryptDestroyKeyFn = null,
)

public data class BCRYPT_DH_KEY_BLOB(public var dwMagic: BCRYPT_DH_KEY_BLOB_MAGIC = 0u, public var cbKey: UInt = 0u)

public data class BCRYPT_DH_PARAMETER_HEADER(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
)

public data class BCRYPT_DSA_KEY_BLOB(
    public var dwMagic: BCRYPT_DSA_MAGIC = 0u,
    public var cbKey: UInt = 0u,
    public var Count: UByteArray = UByteArray(4),
    public var Seed: UByteArray = UByteArray(20),
    public var q: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BCRYPT_DSA_KEY_BLOB) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKey != other.cbKey) return false
        if (!this.Count.contentEquals(other.Count)) return false
        if (!this.Seed.contentEquals(other.Seed)) return false
        if (!this.q.contentEquals(other.q)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMagic.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.Count.contentHashCode()
        result = 31 * result + this.Seed.contentHashCode()
        result = 31 * result + this.q.contentHashCode()
        return result
    }
}

public data class BCRYPT_DSA_KEY_BLOB_V2(
    public var dwMagic: BCRYPT_DSA_MAGIC = 0u,
    public var cbKey: UInt = 0u,
    public var hashAlgorithm: HASHALGORITHM_ENUM = 0,
    public var standardVersion: DSAFIPSVERSION_ENUM = 0,
    public var cbSeedLength: UInt = 0u,
    public var cbGroupSize: UInt = 0u,
    public var Count: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BCRYPT_DSA_KEY_BLOB_V2) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKey != other.cbKey) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.standardVersion != other.standardVersion) return false
        if (this.cbSeedLength != other.cbSeedLength) return false
        if (this.cbGroupSize != other.cbGroupSize) return false
        if (!this.Count.contentEquals(other.Count)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMagic.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.standardVersion.hashCode()
        result = 31 * result + this.cbSeedLength.hashCode()
        result = 31 * result + this.cbGroupSize.hashCode()
        result = 31 * result + this.Count.contentHashCode()
        return result
    }
}

public data class BCRYPT_DSA_PARAMETER_HEADER(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
    public var Count: UByteArray = UByteArray(4),
    public var Seed: UByteArray = UByteArray(20),
    public var q: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BCRYPT_DSA_PARAMETER_HEADER) return false
        if (this.cbLength != other.cbLength) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKeyLength != other.cbKeyLength) return false
        if (!this.Count.contentEquals(other.Count)) return false
        if (!this.Seed.contentEquals(other.Seed)) return false
        if (!this.q.contentEquals(other.q)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.dwMagic.hashCode()
        result = 31 * result + this.cbKeyLength.hashCode()
        result = 31 * result + this.Count.contentHashCode()
        result = 31 * result + this.Seed.contentHashCode()
        result = 31 * result + this.q.contentHashCode()
        return result
    }
}

public data class BCRYPT_DSA_PARAMETER_HEADER_V2(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
    public var hashAlgorithm: HASHALGORITHM_ENUM = 0,
    public var standardVersion: DSAFIPSVERSION_ENUM = 0,
    public var cbSeedLength: UInt = 0u,
    public var cbGroupSize: UInt = 0u,
    public var Count: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BCRYPT_DSA_PARAMETER_HEADER_V2) return false
        if (this.cbLength != other.cbLength) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKeyLength != other.cbKeyLength) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.standardVersion != other.standardVersion) return false
        if (this.cbSeedLength != other.cbSeedLength) return false
        if (this.cbGroupSize != other.cbGroupSize) return false
        if (!this.Count.contentEquals(other.Count)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.dwMagic.hashCode()
        result = 31 * result + this.cbKeyLength.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.standardVersion.hashCode()
        result = 31 * result + this.cbSeedLength.hashCode()
        result = 31 * result + this.cbGroupSize.hashCode()
        result = 31 * result + this.Count.contentHashCode()
        return result
    }
}

public data class BCRYPT_ECCFULLKEY_BLOB(
    public var dwMagic: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwCurveType: ECC_CURVE_TYPE_ENUM = 0,
    public var dwCurveGenerationAlgId: ECC_CURVE_ALG_ID_ENUM = 0,
    public var cbFieldLength: UInt = 0u,
    public var cbSubgroupOrder: UInt = 0u,
    public var cbCofactor: UInt = 0u,
    public var cbSeed: UInt = 0u,
)

public data class BCRYPT_ECCKEY_BLOB(public var dwMagic: UInt = 0u, public var cbKey: UInt = 0u)

public data class BCRYPT_ECC_CURVE_NAMES(public var dwEccCurveNames: UInt = 0u, public var pEccCurveNames: Long = 0L)

public data class BCRYPT_ECC_PARAMETER_HEADER(
    public var dwVersion: UInt = 0u,
    public var dwCurveType: ECC_CURVE_TYPE_ENUM = 0,
    public var dwCurveGenerationAlgId: ECC_CURVE_ALG_ID_ENUM = 0,
    public var cbFieldLength: UInt = 0u,
    public var cbSubgroupOrder: UInt = 0u,
    public var cbCofactor: UInt = 0u,
    public var cbSeed: UInt = 0u,
)

public data class BCRYPT_HASH_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var GetProperty: BCryptGetPropertyFn = null,
    public var SetProperty: BCryptSetPropertyFn = null,
    public var CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var CreateHash: BCryptCreateHashFn = null,
    public var HashData: BCryptHashDataFn = null,
    public var FinishHash: BCryptFinishHashFn = null,
    public var DuplicateHash: BCryptDuplicateHashFn = null,
    public var DestroyHash: BCryptDestroyHashFn = null,
    public var CreateMultiHash: BCryptCreateMultiHashFn = null,
    public var ProcessMultiOperations: BCryptProcessMultiOperationsFn = null,
)

public data class BCRYPT_INTERFACE_VERSION(public var MajorVersion: UShort = 0u, public var MinorVersion: UShort = 0u)

public data class BCRYPT_KEY_BLOB(public var Magic: UInt = 0u)

public data class BCRYPT_KEY_DATA_BLOB_HEADER(
    public var dwMagic: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var cbKeyData: UInt = 0u,
)

public data class BCRYPT_KEY_DERIVATION_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var GetProperty: BCryptGetPropertyFn = null,
    public var SetProperty: BCryptSetPropertyFn = null,
    public var CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var GenerateKey: BCryptGenerateSymmetricKeyFn = null,
    public var DestroyKey: BCryptDestroyKeyFn = null,
    public var KeyDerivation: BCryptKeyDerivationFn = null,
    public var ExportKey: BCryptExportKeyFn = null,
    public var ImportKey: BCryptImportKeyFn = null,
    public var DuplicateKey: BCryptDuplicateKeyFn = null,
)

public data class BCRYPT_KEY_LENGTHS_STRUCT(
    public var dwMinLength: UInt = 0u,
    public var dwMaxLength: UInt = 0u,
    public var dwIncrement: UInt = 0u,
)

public data class BCRYPT_MULTI_HASH_OPERATION(
    public var iHash: UInt = 0u,
    public var hashOperation: BCRYPT_HASH_OPERATION_TYPE = 0,
    public var pbBuffer: Long = 0L,
    public var cbBuffer: UInt = 0u,
)

public data class BCRYPT_MULTI_OBJECT_LENGTH_STRUCT(public var cbPerObject: UInt = 0u, public var cbPerElement: UInt = 0u)

public data class BCRYPT_OAEP_PADDING_INFO(
    public var pszAlgId: PCWSTR = 0L,
    public var pbLabel: Long = 0L,
    public var cbLabel: UInt = 0u,
)

public data class BCRYPT_OID(public var cbOID: UInt = 0u, public var pbOID: Long = 0L)

public data class BCRYPT_OID_LIST(public var dwOIDCount: UInt = 0u, public var pOIDs: Long = 0L)

public data class BCRYPT_PKCS1_PADDING_INFO(public var pszAlgId: PCWSTR = 0L)

public data class BCRYPT_PROVIDER_NAME(public var pszProviderName: PWSTR = 0L)

public data class BCRYPT_PSS_PADDING_INFO(public var pszAlgId: PCWSTR = 0L, public var cbSalt: UInt = 0u)

public data class BCRYPT_RNG_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var GetProperty: BCryptGetPropertyFn = null,
    public var SetProperty: BCryptSetPropertyFn = null,
    public var CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var GenRandom: BCryptGenRandomFn = null,
)

public data class BCRYPT_RSAKEY_BLOB(
    public var Magic: BCRYPT_RSAKEY_BLOB_MAGIC = 0u,
    public var BitLength: UInt = 0u,
    public var cbPublicExp: UInt = 0u,
    public var cbModulus: UInt = 0u,
    public var cbPrime1: UInt = 0u,
    public var cbPrime2: UInt = 0u,
)

public data class BCRYPT_SECRET_AGREEMENT_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var GetProperty: BCryptGetPropertyFn = null,
    public var SetProperty: BCryptSetPropertyFn = null,
    public var CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var SecretAgreement: BCryptSecretAgreementFn = null,
    public var DeriveKey: BCryptDeriveKeyFn = null,
    public var DestroySecret: BCryptDestroySecretFn = null,
    public var GenerateKeyPair: BCryptGenerateKeyPairFn = null,
    public var FinalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var ImportKeyPair: BCryptImportKeyPairFn = null,
    public var ExportKey: BCryptExportKeyFn = null,
    public var DestroyKey: BCryptDestroyKeyFn = null,
)

public data class BCRYPT_SIGNATURE_FUNCTION_TABLE(
    public var Version: BCRYPT_INTERFACE_VERSION = BCRYPT_INTERFACE_VERSION(),
    public var OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var GetProperty: BCryptGetPropertyFn = null,
    public var SetProperty: BCryptSetPropertyFn = null,
    public var CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var GenerateKeyPair: BCryptGenerateKeyPairFn = null,
    public var FinalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var SignHash: BCryptSignHashFn = null,
    public var VerifySignature: BCryptVerifySignatureFn = null,
    public var ImportKeyPair: BCryptImportKeyPairFn = null,
    public var ExportKey: BCryptExportKeyFn = null,
    public var DestroyKey: BCryptDestroyKeyFn = null,
)

public data class BCryptBuffer(
    public var cbBuffer: UInt = 0u,
    public var BufferType: UInt = 0u,
    public var pvBuffer: Long = 0L,
)

public data class BCryptBufferDesc(
    public var ulVersion: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var pBuffers: Long = 0L,
)

public data class CARD_AUTHENTICATE(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var PinId: UInt = 0u,
    public var cbPinData: UInt = 0u,
    public var pbPinData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CARD_AUTHENTICATE) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.PinId != other.PinId) return false
        if (this.cbPinData != other.cbPinData) return false
        if (!this.pbPinData.contentEquals(other.pbPinData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.PinId.hashCode()
        result = 31 * result + this.cbPinData.hashCode()
        result = 31 * result + this.pbPinData.contentHashCode()
        return result
    }
}

public data class CARD_AUTHENTICATE_RESPONSE(
    public var dwVersion: UInt = 0u,
    public var cbSessionPin: UInt = 0u,
    public var cAttemptsRemaining: UInt = 0u,
    public var pbSessionPin: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CARD_AUTHENTICATE_RESPONSE) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbSessionPin != other.cbSessionPin) return false
        if (this.cAttemptsRemaining != other.cAttemptsRemaining) return false
        if (!this.pbSessionPin.contentEquals(other.pbSessionPin)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbSessionPin.hashCode()
        result = 31 * result + this.cAttemptsRemaining.hashCode()
        result = 31 * result + this.pbSessionPin.contentHashCode()
        return result
    }
}

public data class CARD_CACHE_FILE_FORMAT(
    public var bVersion: UByte = 0u,
    public var bPinsFreshness: UByte = 0u,
    public var wContainersFreshness: UShort = 0u,
    public var wFilesFreshness: UShort = 0u,
)

public data class CARD_CAPABILITIES(
    public var dwVersion: UInt = 0u,
    public var fCertificateCompression: BOOL = 0,
    public var fKeyGen: BOOL = 0,
)

public data class CARD_CHANGE_AUTHENTICATOR(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwAuthenticatingPinId: UInt = 0u,
    public var cbAuthenticatingPinData: UInt = 0u,
    public var dwTargetPinId: UInt = 0u,
    public var cbTargetData: UInt = 0u,
    public var cRetryCount: UInt = 0u,
    public var pbData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CARD_CHANGE_AUTHENTICATOR) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwAuthenticatingPinId != other.dwAuthenticatingPinId) return false
        if (this.cbAuthenticatingPinData != other.cbAuthenticatingPinData) return false
        if (this.dwTargetPinId != other.dwTargetPinId) return false
        if (this.cbTargetData != other.cbTargetData) return false
        if (this.cRetryCount != other.cRetryCount) return false
        if (!this.pbData.contentEquals(other.pbData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwAuthenticatingPinId.hashCode()
        result = 31 * result + this.cbAuthenticatingPinData.hashCode()
        result = 31 * result + this.dwTargetPinId.hashCode()
        result = 31 * result + this.cbTargetData.hashCode()
        result = 31 * result + this.cRetryCount.hashCode()
        result = 31 * result + this.pbData.contentHashCode()
        return result
    }
}

public data class CARD_CHANGE_AUTHENTICATOR_RESPONSE(public var dwVersion: UInt = 0u, public var cAttemptsRemaining: UInt = 0u)

public class CARD_DATA(
    public var dwVersion: UInt = 0u,
    public var pbAtr: Long = 0L,
    public var cbAtr: UInt = 0u,
    public var pwszCardName: PWSTR = 0L,
    public var pfnCspAlloc: PFN_CSP_ALLOC = null,
    public var pfnCspReAlloc: PFN_CSP_REALLOC = null,
    public var pfnCspFree: PFN_CSP_FREE = null,
    public var pfnCspCacheAddFile: PFN_CSP_CACHE_ADD_FILE = null,
    public var pfnCspCacheLookupFile: PFN_CSP_CACHE_LOOKUP_FILE = null,
    public var pfnCspCacheDeleteFile: PFN_CSP_CACHE_DELETE_FILE = null,
    public var pvCacheContext: Long = 0L,
    public var pfnCspPadData: PFN_CSP_PAD_DATA = null,
    public var hSCardCtx: ULong = 0uL,
    public var hScard: ULong = 0uL,
    public var pvVendorSpecific: Long = 0L,
    public var pfnCardDeleteContext: PFN_CARD_DELETE_CONTEXT = null,
    public var pfnCardQueryCapabilities: PFN_CARD_QUERY_CAPABILITIES = null,
    public var pfnCardDeleteContainer: PFN_CARD_DELETE_CONTAINER = null,
    public var pfnCardCreateContainer: PFN_CARD_CREATE_CONTAINER = null,
    public var pfnCardGetContainerInfo: PFN_CARD_GET_CONTAINER_INFO = null,
    public var pfnCardAuthenticatePin: PFN_CARD_AUTHENTICATE_PIN = null,
    public var pfnCardGetChallenge: PFN_CARD_GET_CHALLENGE = null,
    public var pfnCardAuthenticateChallenge: PFN_CARD_AUTHENTICATE_CHALLENGE = null,
    public var pfnCardUnblockPin: PFN_CARD_UNBLOCK_PIN = null,
    public var pfnCardChangeAuthenticator: PFN_CARD_CHANGE_AUTHENTICATOR = null,
    public var pfnCardDeauthenticate: PFN_CARD_DEAUTHENTICATE = null,
    public var pfnCardCreateDirectory: PFN_CARD_CREATE_DIRECTORY = null,
    public var pfnCardDeleteDirectory: PFN_CARD_DELETE_DIRECTORY = null,
    public var pvUnused3: Long = 0L,
    public var pvUnused4: Long = 0L,
    public var pfnCardCreateFile: PFN_CARD_CREATE_FILE = null,
    public var pfnCardReadFile: PFN_CARD_READ_FILE = null,
    public var pfnCardWriteFile: PFN_CARD_WRITE_FILE = null,
    public var pfnCardDeleteFile: PFN_CARD_DELETE_FILE = null,
    public var pfnCardEnumFiles: PFN_CARD_ENUM_FILES = null,
    public var pfnCardGetFileInfo: PFN_CARD_GET_FILE_INFO = null,
    public var pfnCardQueryFreeSpace: PFN_CARD_QUERY_FREE_SPACE = null,
    public var pfnCardQueryKeySizes: PFN_CARD_QUERY_KEY_SIZES = null,
    public var pfnCardSignData: PFN_CARD_SIGN_DATA = null,
    public var pfnCardRSADecrypt: PFN_CARD_RSA_DECRYPT = null,
    public var pfnCardConstructDHAgreement: PFN_CARD_CONSTRUCT_DH_AGREEMENT = null,
    public var pfnCardDeriveKey: PFN_CARD_DERIVE_KEY = null,
    public var pfnCardDestroyDHAgreement: PFN_CARD_DESTROY_DH_AGREEMENT = null,
    public var pfnCspGetDHAgreement: PFN_CSP_GET_DH_AGREEMENT = null,
    public var pfnCardGetChallengeEx: PFN_CARD_GET_CHALLENGE_EX = null,
    public var pfnCardAuthenticateEx: PFN_CARD_AUTHENTICATE_EX = null,
    public var pfnCardChangeAuthenticatorEx: PFN_CARD_CHANGE_AUTHENTICATOR_EX = null,
    public var pfnCardDeauthenticateEx: PFN_CARD_DEAUTHENTICATE_EX = null,
    public var pfnCardGetContainerProperty: PFN_CARD_GET_CONTAINER_PROPERTY = null,
    public var pfnCardSetContainerProperty: PFN_CARD_SET_CONTAINER_PROPERTY = null,
    public var pfnCardGetProperty: PFN_CARD_GET_PROPERTY = null,
    public var pfnCardSetProperty: PFN_CARD_SET_PROPERTY = null,
    public var pfnCspUnpadData: PFN_CSP_UNPAD_DATA = null,
    public var pfnMDImportSessionKey: PFN_MD_IMPORT_SESSION_KEY = null,
    public var pfnMDEncryptData: PFN_MD_ENCRYPT_DATA = null,
    public var pfnCardImportSessionKey: PFN_CARD_IMPORT_SESSION_KEY = null,
    public var pfnCardGetSharedKeyHandle: PFN_CARD_GET_SHARED_KEY_HANDLE = null,
    public var pfnCardGetAlgorithmProperty: PFN_CARD_GET_ALGORITHM_PROPERTY = null,
    public var pfnCardGetKeyProperty: PFN_CARD_GET_KEY_PROPERTY = null,
    public var pfnCardSetKeyProperty: PFN_CARD_SET_KEY_PROPERTY = null,
    public var pfnCardDestroyKey: PFN_CARD_DESTROY_KEY = null,
    public var pfnCardProcessEncryptedData: PFN_CARD_PROCESS_ENCRYPTED_DATA = null,
    public var pfnCardCreateContainerEx: PFN_CARD_CREATE_CONTAINER_EX = null,
)

public data class CARD_DERIVE_KEY(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwszKDF: PWSTR = 0L,
    public var bSecretAgreementIndex: UByte = 0u,
    public var pParameterList: Long = 0L,
    public var pbDerivedKey: Long = 0L,
    public var cbDerivedKey: UInt = 0u,
    public var pwszAlgId: PWSTR = 0L,
    public var dwKeyLen: UInt = 0u,
    public var hKey: ULong = 0uL,
)

public data class CARD_DH_AGREEMENT_INFO(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var dwFlags: UInt = 0u,
    public var dwPublicKey: UInt = 0u,
    public var pbPublicKey: Long = 0L,
    public var pbReserved: Long = 0L,
    public var cbReserved: UInt = 0u,
    public var bSecretAgreementIndex: UByte = 0u,
)

public data class CARD_ENCRYPTED_DATA(public var pbEncryptedData: Long = 0L, public var cbEncryptedData: UInt = 0u)

public data class CARD_FILE_INFO(
    public var dwVersion: UInt = 0u,
    public var cbFileSize: UInt = 0u,
    public var AccessCondition: CARD_FILE_ACCESS_CONDITION = 0,
)

public data class CARD_FREE_SPACE_INFO(
    public var dwVersion: UInt = 0u,
    public var dwBytesAvailable: UInt = 0u,
    public var dwKeyContainersAvailable: UInt = 0u,
    public var dwMaxKeyContainers: UInt = 0u,
)

public data class CARD_IMPORT_KEYPAIR(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var PinId: UInt = 0u,
    public var dwKeySpec: UInt = 0u,
    public var dwKeySize: UInt = 0u,
    public var cbInput: UInt = 0u,
    public var pbInput: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CARD_IMPORT_KEYPAIR) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bContainerIndex != other.bContainerIndex) return false
        if (this.PinId != other.PinId) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.dwKeySize != other.dwKeySize) return false
        if (this.cbInput != other.cbInput) return false
        if (!this.pbInput.contentEquals(other.pbInput)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bContainerIndex.hashCode()
        result = 31 * result + this.PinId.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.dwKeySize.hashCode()
        result = 31 * result + this.cbInput.hashCode()
        result = 31 * result + this.pbInput.contentHashCode()
        return result
    }
}

public data class CARD_KEY_SIZES(
    public var dwVersion: UInt = 0u,
    public var dwMinimumBitlen: UInt = 0u,
    public var dwDefaultBitlen: UInt = 0u,
    public var dwMaximumBitlen: UInt = 0u,
    public var dwIncrementalBitlen: UInt = 0u,
)

public data class CARD_RSA_DECRYPT_INFO(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var dwKeySpec: UInt = 0u,
    public var pbData: Long = 0L,
    public var cbData: UInt = 0u,
    public var pPaddingInfo: Long = 0L,
    public var dwPaddingType: UInt = 0u,
)

public data class CARD_SIGNING_INFO(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var dwKeySpec: UInt = 0u,
    public var dwSigningFlags: UInt = 0u,
    public var aiHashAlg: ALG_ID = 0u,
    public var pbData: Long = 0L,
    public var cbData: UInt = 0u,
    public var pbSignedData: Long = 0L,
    public var cbSignedData: UInt = 0u,
    public var pPaddingInfo: Long = 0L,
    public var dwPaddingType: UInt = 0u,
)

public data class CERTIFICATE_CHAIN_BLOB(public var certCount: UInt = 0u, public var rawCertificates: Long = 0L)

public data class CERT_ACCESS_DESCRIPTION(public var pszAccessMethod: PSTR = 0L, public var AccessLocation: CERT_ALT_NAME_ENTRY = CERT_ALT_NAME_ENTRY())

public data class CERT_ALT_NAME_ENTRY(public var dwAltNameChoice: UInt = 0u, public var Anonymous: CERT_ALT_NAME_ENTRY_0 = CERT_ALT_NAME_ENTRY_0())

public data class CERT_ALT_NAME_ENTRY_0(
    public var pOtherName: Long = 0L,
    public var pwszRfc822Name: PWSTR = 0L,
    public var pwszDNSName: PWSTR = 0L,
    public var DirectoryName: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pwszURL: PWSTR = 0L,
    public var IPAddress: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pszRegisteredID: PSTR = 0L,
)

public data class CERT_ALT_NAME_INFO(public var cAltEntry: UInt = 0u, public var rgAltEntry: Long = 0L)

public data class CERT_AUTHORITY_INFO_ACCESS(public var cAccDescr: UInt = 0u, public var rgAccDescr: Long = 0L)

public data class CERT_AUTHORITY_KEY_ID2_INFO(
    public var KeyId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var AuthorityCertIssuer: CERT_ALT_NAME_INFO = CERT_ALT_NAME_INFO(),
    public var AuthorityCertSerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CERT_AUTHORITY_KEY_ID_INFO(
    public var KeyId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var CertIssuer: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var CertSerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CERT_BASIC_CONSTRAINTS2_INFO(
    public var fCA: BOOL = 0,
    public var fPathLenConstraint: BOOL = 0,
    public var dwPathLenConstraint: UInt = 0u,
)

public data class CERT_BASIC_CONSTRAINTS_INFO(
    public var SubjectType: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var fPathLenConstraint: BOOL = 0,
    public var dwPathLenConstraint: UInt = 0u,
    public var cSubtreesConstraint: UInt = 0u,
    public var rgSubtreesConstraint: Long = 0L,
)

public data class CERT_BIOMETRIC_DATA(
    public var dwTypeOfBiometricDataChoice: CERT_BIOMETRIC_DATA_TYPE = 0u,
    public var Anonymous: CERT_BIOMETRIC_DATA_0 = CERT_BIOMETRIC_DATA_0(),
    public var HashedUrl: CERT_HASHED_URL = CERT_HASHED_URL(),
)

public data class CERT_BIOMETRIC_DATA_0(public var dwPredefined: UInt = 0u, public var pszObjId: PSTR = 0L)

public data class CERT_BIOMETRIC_EXT_INFO(public var cBiometricData: UInt = 0u, public var rgBiometricData: Long = 0L)

public data class CERT_CHAIN(
    public var cCerts: UInt = 0u,
    public var certs: Long = 0L,
    public var keyLocatorInfo: CRYPT_KEY_PROV_INFO = CRYPT_KEY_PROV_INFO(),
)

public data class CERT_CHAIN_CONTEXT(
    public var cbSize: UInt = 0u,
    public var TrustStatus: CERT_TRUST_STATUS = CERT_TRUST_STATUS(),
    public var cChain: UInt = 0u,
    public var rgpChain: Long = 0L,
    public var cLowerQualityChainContext: UInt = 0u,
    public var rgpLowerQualityChainContext: Long = 0L,
    public var fHasRevocationFreshnessTime: BOOL = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
    public var dwCreateFlags: UInt = 0u,
    public var ChainId: GUID = GUID(),
)

public data class CERT_CHAIN_ELEMENT(
    public var cbSize: UInt = 0u,
    public var pCertContext: Long = 0L,
    public var TrustStatus: CERT_TRUST_STATUS = CERT_TRUST_STATUS(),
    public var pRevocationInfo: Long = 0L,
    public var pIssuanceUsage: Long = 0L,
    public var pApplicationUsage: Long = 0L,
    public var pwszExtendedErrorInfo: PCWSTR = 0L,
)

public data class CERT_CHAIN_ENGINE_CONFIG(
    public var cbSize: UInt = 0u,
    public var hRestrictedRoot: HCERTSTORE = 0L,
    public var hRestrictedTrust: HCERTSTORE = 0L,
    public var hRestrictedOther: HCERTSTORE = 0L,
    public var cAdditionalStore: UInt = 0u,
    public var rghAdditionalStore: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var MaximumCachedCertificates: UInt = 0u,
    public var CycleDetectionModulus: UInt = 0u,
    public var hExclusiveRoot: HCERTSTORE = 0L,
    public var hExclusiveTrustedPeople: HCERTSTORE = 0L,
    public var dwExclusiveFlags: UInt = 0u,
)

public data class CERT_CHAIN_FIND_BY_ISSUER_PARA(
    public var cbSize: UInt = 0u,
    public var pszUsageIdentifier: PCSTR = 0L,
    public var dwKeySpec: UInt = 0u,
    public var dwAcquirePrivateKeyFlags: UInt = 0u,
    public var cIssuer: UInt = 0u,
    public var rgIssuer: Long = 0L,
    public var pfnFindCallback: PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK = null,
    public var pvFindArg: Long = 0L,
)

public data class CERT_CHAIN_PARA(
    public var cbSize: UInt = 0u,
    public var RequestedUsage: CERT_USAGE_MATCH = CERT_USAGE_MATCH(),
    public var RequestedIssuancePolicy: CERT_USAGE_MATCH = CERT_USAGE_MATCH(),
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var fCheckRevocationFreshnessTime: BOOL = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
    public var pftCacheResync: Long = 0L,
    public var pStrongSignPara: Long = 0L,
    public var dwStrongSignFlags: UInt = 0u,
)

public data class CERT_CHAIN_POLICY_PARA(
    public var cbSize: UInt = 0u,
    public var dwFlags: CERT_CHAIN_POLICY_FLAGS = 0u,
    public var pvExtraPolicyPara: Long = 0L,
)

public data class CERT_CHAIN_POLICY_STATUS(
    public var cbSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var lChainIndex: Int = 0,
    public var lElementIndex: Int = 0,
    public var pvExtraPolicyStatus: Long = 0L,
)

public data class CERT_CONTEXT(
    public var dwCertEncodingType: CERT_QUERY_ENCODING_TYPE = 0u,
    public var pbCertEncoded: Long = 0L,
    public var cbCertEncoded: UInt = 0u,
    public var pCertInfo: Long = 0L,
    public var hCertStore: HCERTSTORE = 0L,
)

public data class CERT_CREATE_CONTEXT_PARA(
    public var cbSize: UInt = 0u,
    public var pfnFree: PFN_CRYPT_FREE = null,
    public var pvFree: Long = 0L,
    public var pfnSort: PFN_CERT_CREATE_CONTEXT_SORT_FUNC = null,
    public var pvSort: Long = 0L,
)

public data class CERT_CRL_CONTEXT_PAIR(public var pCertContext: Long = 0L, public var pCrlContext: Long = 0L)

public data class CERT_DH_PARAMETERS(public var p: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var g: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_DSS_PARAMETERS(
    public var p: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var q: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var g: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CERT_ECC_SIGNATURE(public var r: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var s: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_EXTENSION(
    public var pszObjId: PSTR = 0L,
    public var fCritical: BOOL = 0,
    public var Value: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CERT_EXTENSIONS(public var cExtension: UInt = 0u, public var rgExtension: Long = 0L)

public data class CERT_FORTEZZA_DATA_PROP(
    public var SerialNumber: UByteArray = UByteArray(8),
    public var CertIndex: Int = 0,
    public var CertLabel: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CERT_FORTEZZA_DATA_PROP) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        if (this.CertIndex != other.CertIndex) return false
        if (!this.CertLabel.contentEquals(other.CertLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SerialNumber.contentHashCode()
        result = 31 * result + this.CertIndex.hashCode()
        result = 31 * result + this.CertLabel.contentHashCode()
        return result
    }
}

public data class CERT_GENERAL_SUBTREE(
    public var Base: CERT_ALT_NAME_ENTRY = CERT_ALT_NAME_ENTRY(),
    public var dwMinimum: UInt = 0u,
    public var fMaximum: BOOL = 0,
    public var dwMaximum: UInt = 0u,
)

public data class CERT_HASHED_URL(
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var Hash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pwszUrl: PWSTR = 0L,
)

public data class CERT_ID(public var dwIdChoice: CERT_ID_OPTION = 0u, public var Anonymous: CERT_ID_0 = CERT_ID_0())

public data class CERT_ID_0(
    public var IssuerSerialNumber: CERT_ISSUER_SERIAL_NUMBER = CERT_ISSUER_SERIAL_NUMBER(),
    public var KeyId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var HashId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CERT_INFO(
    public var dwVersion: UInt = 0u,
    public var SerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var Issuer: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var NotBefore: FILETIME = FILETIME(),
    public var NotAfter: FILETIME = FILETIME(),
    public var Subject: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SubjectPublicKeyInfo: CERT_PUBLIC_KEY_INFO = CERT_PUBLIC_KEY_INFO(),
    public var IssuerUniqueId: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var SubjectUniqueId: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CERT_ISSUER_SERIAL_NUMBER(public var Issuer: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var SerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_KEYGEN_REQUEST_INFO(
    public var dwVersion: UInt = 0u,
    public var SubjectPublicKeyInfo: CERT_PUBLIC_KEY_INFO = CERT_PUBLIC_KEY_INFO(),
    public var pwszChallengeString: PWSTR = 0L,
)

public data class CERT_KEY_ATTRIBUTES_INFO(
    public var KeyId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var IntendedKeyUsage: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var pPrivateKeyUsagePeriod: Long = 0L,
)

public data class CERT_KEY_CONTEXT(
    public var cbSize: UInt = 0u,
    public var Anonymous: CERT_KEY_CONTEXT_0 = CERT_KEY_CONTEXT_0(),
    public var dwKeySpec: UInt = 0u,
)

public data class CERT_KEY_CONTEXT_0(public var hCryptProv: ULong = 0uL, public var hNCryptKey: NCRYPT_KEY_HANDLE = 0uL)

public data class CERT_KEY_USAGE_RESTRICTION_INFO(
    public var cCertPolicyId: UInt = 0u,
    public var rgCertPolicyId: Long = 0L,
    public var RestrictedKeyUsage: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
)

public data class CERT_LDAP_STORE_OPENED_PARA(public var pvLdapSessionHandle: Long = 0L, public var pwszLdapUrl: PCWSTR = 0L)

public data class CERT_LOGOTYPE_AUDIO(public var LogotypeDetails: CERT_LOGOTYPE_DETAILS = CERT_LOGOTYPE_DETAILS(), public var pLogotypeAudioInfo: Long = 0L)

public data class CERT_LOGOTYPE_AUDIO_INFO(
    public var dwFileSize: UInt = 0u,
    public var dwPlayTime: UInt = 0u,
    public var dwChannels: UInt = 0u,
    public var dwSampleRate: UInt = 0u,
    public var pwszLanguage: PWSTR = 0L,
)

public data class CERT_LOGOTYPE_DATA(
    public var cLogotypeImage: UInt = 0u,
    public var rgLogotypeImage: Long = 0L,
    public var cLogotypeAudio: UInt = 0u,
    public var rgLogotypeAudio: Long = 0L,
)

public data class CERT_LOGOTYPE_DETAILS(
    public var pwszMimeType: PWSTR = 0L,
    public var cHashedUrl: UInt = 0u,
    public var rgHashedUrl: Long = 0L,
)

public data class CERT_LOGOTYPE_EXT_INFO(
    public var cCommunityLogo: UInt = 0u,
    public var rgCommunityLogo: Long = 0L,
    public var pIssuerLogo: Long = 0L,
    public var pSubjectLogo: Long = 0L,
    public var cOtherLogo: UInt = 0u,
    public var rgOtherLogo: Long = 0L,
)

public data class CERT_LOGOTYPE_IMAGE(public var LogotypeDetails: CERT_LOGOTYPE_DETAILS = CERT_LOGOTYPE_DETAILS(), public var pLogotypeImageInfo: Long = 0L)

public data class CERT_LOGOTYPE_IMAGE_INFO(
    public var dwLogotypeImageInfoChoice: CERT_LOGOTYPE_IMAGE_INFO_TYPE = 0u,
    public var dwFileSize: UInt = 0u,
    public var dwXSize: UInt = 0u,
    public var dwYSize: UInt = 0u,
    public var dwLogotypeImageResolutionChoice: CERT_LOGOTYPE_CHOICE = 0u,
    public var Anonymous: CERT_LOGOTYPE_IMAGE_INFO_0 = CERT_LOGOTYPE_IMAGE_INFO_0(),
    public var pwszLanguage: PWSTR = 0L,
)

public data class CERT_LOGOTYPE_IMAGE_INFO_0(public var dwNumBits: UInt = 0u, public var dwTableSize: UInt = 0u)

public data class CERT_LOGOTYPE_INFO(public var dwLogotypeInfoChoice: CERT_LOGOTYPE_OPTION = 0u, public var Anonymous: CERT_LOGOTYPE_INFO_0 = CERT_LOGOTYPE_INFO_0())

public data class CERT_LOGOTYPE_INFO_0(public var pLogotypeDirectInfo: Long = 0L, public var pLogotypeIndirectInfo: Long = 0L)

public data class CERT_LOGOTYPE_REFERENCE(public var cHashedUrl: UInt = 0u, public var rgHashedUrl: Long = 0L)

public data class CERT_NAME_CONSTRAINTS_INFO(
    public var cPermittedSubtree: UInt = 0u,
    public var rgPermittedSubtree: Long = 0L,
    public var cExcludedSubtree: UInt = 0u,
    public var rgExcludedSubtree: Long = 0L,
)

public data class CERT_NAME_INFO(public var cRDN: UInt = 0u, public var rgRDN: Long = 0L)

public data class CERT_NAME_VALUE(public var dwValueType: UInt = 0u, public var Value: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_OR_CRL_BLOB(
    public var dwChoice: UInt = 0u,
    public var cbEncoded: UInt = 0u,
    public var pbEncoded: Long = 0L,
)

public data class CERT_OR_CRL_BUNDLE(public var cItem: UInt = 0u, public var rgItem: Long = 0L)

public data class CERT_OTHER_LOGOTYPE_INFO(public var pszObjId: PSTR = 0L, public var LogotypeInfo: CERT_LOGOTYPE_INFO = CERT_LOGOTYPE_INFO())

public data class CERT_OTHER_NAME(public var pszObjId: PSTR = 0L, public var Value: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_PAIR(public var Forward: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var Reverse: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_PHYSICAL_STORE_INFO(
    public var cbSize: UInt = 0u,
    public var pszOpenStoreProvider: PSTR = 0L,
    public var dwOpenEncodingType: UInt = 0u,
    public var dwOpenFlags: UInt = 0u,
    public var OpenParameters: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwFlags: UInt = 0u,
    public var dwPriority: UInt = 0u,
)

public data class CERT_POLICIES_INFO(public var cPolicyInfo: UInt = 0u, public var rgPolicyInfo: Long = 0L)

public data class CERT_POLICY95_QUALIFIER1(
    public var pszPracticesReference: PWSTR = 0L,
    public var pszNoticeIdentifier: PSTR = 0L,
    public var pszNSINoticeIdentifier: PSTR = 0L,
    public var cCPSURLs: UInt = 0u,
    public var rgCPSURLs: Long = 0L,
)

public data class CERT_POLICY_CONSTRAINTS_INFO(
    public var fRequireExplicitPolicy: BOOL = 0,
    public var dwRequireExplicitPolicySkipCerts: UInt = 0u,
    public var fInhibitPolicyMapping: BOOL = 0,
    public var dwInhibitPolicyMappingSkipCerts: UInt = 0u,
)

public data class CERT_POLICY_ID(public var cCertPolicyElementId: UInt = 0u, public var rgpszCertPolicyElementId: Long = 0L)

public data class CERT_POLICY_INFO(
    public var pszPolicyIdentifier: PSTR = 0L,
    public var cPolicyQualifier: UInt = 0u,
    public var rgPolicyQualifier: Long = 0L,
)

public data class CERT_POLICY_MAPPING(public var pszIssuerDomainPolicy: PSTR = 0L, public var pszSubjectDomainPolicy: PSTR = 0L)

public data class CERT_POLICY_MAPPINGS_INFO(public var cPolicyMapping: UInt = 0u, public var rgPolicyMapping: Long = 0L)

public data class CERT_POLICY_QUALIFIER_INFO(public var pszPolicyQualifierId: PSTR = 0L, public var Qualifier: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_POLICY_QUALIFIER_NOTICE_REFERENCE(
    public var pszOrganization: PSTR = 0L,
    public var cNoticeNumbers: UInt = 0u,
    public var rgNoticeNumbers: Long = 0L,
)

public data class CERT_POLICY_QUALIFIER_USER_NOTICE(public var pNoticeReference: Long = 0L, public var pszDisplayText: PWSTR = 0L)

public data class CERT_PRIVATE_KEY_VALIDITY(public var NotBefore: FILETIME = FILETIME(), public var NotAfter: FILETIME = FILETIME())

public data class CERT_PUBLIC_KEY_INFO(public var Algorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(), public var PublicKey: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB())

public data class CERT_QC_STATEMENT(public var pszStatementId: PSTR = 0L, public var StatementInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CERT_QC_STATEMENTS_EXT_INFO(public var cStatement: UInt = 0u, public var rgStatement: Long = 0L)

public data class CERT_RDN(public var cRDNAttr: UInt = 0u, public var rgRDNAttr: Long = 0L)

public data class CERT_RDN_ATTR(
    public var pszObjId: PSTR = 0L,
    public var dwValueType: UInt = 0u,
    public var Value: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CERT_REGISTRY_STORE_CLIENT_GPT_PARA(public var hKeyBase: HKEY = 0L, public var pwszRegPath: PWSTR = 0L)

public data class CERT_REGISTRY_STORE_ROAMING_PARA(public var hKey: HKEY = 0L, public var pwszStoreDirectory: PWSTR = 0L)

public data class CERT_REQUEST_INFO(
    public var dwVersion: UInt = 0u,
    public var Subject: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SubjectPublicKeyInfo: CERT_PUBLIC_KEY_INFO = CERT_PUBLIC_KEY_INFO(),
    public var cAttribute: UInt = 0u,
    public var rgAttribute: Long = 0L,
)

public data class CERT_REVOCATION_CHAIN_PARA(
    public var cbSize: UInt = 0u,
    public var hChainEngine: HCERTCHAINENGINE = 0L,
    public var hAdditionalStore: HCERTSTORE = 0L,
    public var dwChainFlags: UInt = 0u,
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var pftCurrentTime: Long = 0L,
    public var pftCacheResync: Long = 0L,
    public var cbMaxUrlRetrievalByteCount: UInt = 0u,
)

public data class CERT_REVOCATION_CRL_INFO(
    public var cbSize: UInt = 0u,
    public var pBaseCrlContext: Long = 0L,
    public var pDeltaCrlContext: Long = 0L,
    public var pCrlEntry: Long = 0L,
    public var fDeltaCrlEntry: BOOL = 0,
)

public data class CERT_REVOCATION_INFO(
    public var cbSize: UInt = 0u,
    public var dwRevocationResult: UInt = 0u,
    public var pszRevocationOid: PCSTR = 0L,
    public var pvOidSpecificInfo: Long = 0L,
    public var fHasFreshnessTime: BOOL = 0,
    public var dwFreshnessTime: UInt = 0u,
    public var pCrlInfo: Long = 0L,
)

public data class CERT_REVOCATION_PARA(
    public var cbSize: UInt = 0u,
    public var pIssuerCert: Long = 0L,
    public var cCertStore: UInt = 0u,
    public var rgCertStore: Long = 0L,
    public var hCrlStore: HCERTSTORE = 0L,
    public var pftTimeToUse: Long = 0L,
)

public data class CERT_REVOCATION_STATUS(
    public var cbSize: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwReason: CERT_REVOCATION_STATUS_REASON = 0u,
    public var fHasFreshnessTime: BOOL = 0,
    public var dwFreshnessTime: UInt = 0u,
)

public data class CERT_SELECT_CHAIN_PARA(
    public var hChainEngine: HCERTCHAINENGINE = 0L,
    public var pTime: Long = 0L,
    public var hAdditionalStore: HCERTSTORE = 0L,
    public var pChainPara: Long = 0L,
    public var dwFlags: UInt = 0u,
)

public data class CERT_SELECT_CRITERIA(
    public var dwType: CERT_SELECT_CRITERIA_TYPE = 0u,
    public var cPara: UInt = 0u,
    public var ppPara: Long = 0L,
)

public data class CERT_SERVER_OCSP_RESPONSE_CONTEXT(
    public var cbSize: UInt = 0u,
    public var pbEncodedOcspResponse: Long = 0L,
    public var cbEncodedOcspResponse: UInt = 0u,
)

public data class CERT_SERVER_OCSP_RESPONSE_OPEN_PARA(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pcbUsedSize: Long = 0L,
    public var pwszOcspDirectory: PWSTR = 0L,
    public var pfnUpdateCallback: PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK = null,
    public var pvUpdateCallbackArg: Long = 0L,
)

public data class CERT_SIGNED_CONTENT_INFO(
    public var ToBeSigned: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var Signature: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
)

public data class CERT_SIMPLE_CHAIN(
    public var cbSize: UInt = 0u,
    public var TrustStatus: CERT_TRUST_STATUS = CERT_TRUST_STATUS(),
    public var cElement: UInt = 0u,
    public var rgpElement: Long = 0L,
    public var pTrustListInfo: Long = 0L,
    public var fHasRevocationFreshnessTime: BOOL = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
)

public data class CERT_STORE_PROV_FIND_INFO(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var dwFindFlags: UInt = 0u,
    public var dwFindType: UInt = 0u,
    public var pvFindPara: Long = 0L,
)

public data class CERT_STORE_PROV_INFO(
    public var cbSize: UInt = 0u,
    public var cStoreProvFunc: UInt = 0u,
    public var rgpvStoreProvFunc: Long = 0L,
    public var hStoreProv: HCERTSTOREPROV = 0L,
    public var dwStoreProvFlags: CERT_STORE_PROV_FLAGS = 0u,
    public var hStoreProvFuncAddr2: Long = 0L,
)

public data class CERT_STRONG_SIGN_PARA(
    public var cbSize: UInt = 0u,
    public var dwInfoChoice: UInt = 0u,
    public var Anonymous: CERT_STRONG_SIGN_PARA_0 = CERT_STRONG_SIGN_PARA_0(),
)

public data class CERT_STRONG_SIGN_PARA_0(
    public var pvInfo: Long = 0L,
    public var pSerializedInfo: Long = 0L,
    public var pszOID: PSTR = 0L,
)

public data class CERT_STRONG_SIGN_SERIALIZED_INFO(
    public var dwFlags: CERT_STRONG_SIGN_FLAGS = 0u,
    public var pwszCNGSignHashAlgids: PWSTR = 0L,
    public var pwszCNGPubKeyMinBitLengths: PWSTR = 0L,
)

public data class CERT_SUPPORTED_ALGORITHM_INFO(
    public var Algorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var IntendedKeyUsage: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var IntendedCertPolicies: CERT_POLICIES_INFO = CERT_POLICIES_INFO(),
)

public data class CERT_SYSTEM_STORE_INFO(public var cbSize: UInt = 0u)

public data class CERT_SYSTEM_STORE_RELOCATE_PARA(public var Anonymous1: CERT_SYSTEM_STORE_RELOCATE_PARA_0 = CERT_SYSTEM_STORE_RELOCATE_PARA_0(), public var Anonymous2: CERT_SYSTEM_STORE_RELOCATE_PARA_1 = CERT_SYSTEM_STORE_RELOCATE_PARA_1())

public data class CERT_SYSTEM_STORE_RELOCATE_PARA_0(public var hKeyBase: HKEY = 0L, public var pvBase: Long = 0L)

public data class CERT_SYSTEM_STORE_RELOCATE_PARA_1(
    public var pvSystemStore: Long = 0L,
    public var pszSystemStore: PCSTR = 0L,
    public var pwszSystemStore: PCWSTR = 0L,
)

public data class CERT_TEMPLATE_EXT(
    public var pszObjId: PSTR = 0L,
    public var dwMajorVersion: UInt = 0u,
    public var fMinorVersion: BOOL = 0,
    public var dwMinorVersion: UInt = 0u,
)

public data class CERT_TPM_SPECIFICATION_INFO(
    public var pwszFamily: PWSTR = 0L,
    public var dwLevel: UInt = 0u,
    public var dwRevision: UInt = 0u,
)

public data class CERT_TRUST_LIST_INFO(
    public var cbSize: UInt = 0u,
    public var pCtlEntry: Long = 0L,
    public var pCtlContext: Long = 0L,
)

public data class CERT_TRUST_STATUS(public var dwErrorStatus: UInt = 0u, public var dwInfoStatus: UInt = 0u)

public data class CERT_USAGE_MATCH(public var dwType: UInt = 0u, public var Usage: CTL_USAGE = CTL_USAGE())

public data class CERT_X942_DH_PARAMETERS(
    public var p: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var g: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var q: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var j: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pValidationParams: Long = 0L,
)

public data class CERT_X942_DH_VALIDATION_PARAMS(public var seed: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(), public var pgenCounter: UInt = 0u)

public data class CLAIMLIST(public var count: UInt = 0u, public var claims: Long = 0L)

public data class CLMD_PIV_CERT_DATA(
    public var dwVersion: UInt = 0u,
    public var dwCertTag: UInt = 0u,
    public var pbCert: Long = 0L,
    public var cbCert: UInt = 0u,
)

public data class CLMD_PIV_GENERATE_ASYMMETRIC_KEY(
    public var dwVersion: UInt = 0u,
    public var bAlgorithmId: UByte = 0u,
    public var bKeyId: UByte = 0u,
    public var pbKey: Long = 0L,
    public var cbKey: UInt = 0u,
)

public data class CLMD_PIV_PUBLIC_KEY_DATA(
    public var dwVersion: UInt = 0u,
    public var bKeyId: UByte = 0u,
    public var pbPublicKey: Long = 0L,
    public var cbPublicKey: UInt = 0u,
)

public data class CMC_ADD_ATTRIBUTES_INFO(
    public var dwCmcDataReference: UInt = 0u,
    public var cCertReference: UInt = 0u,
    public var rgdwCertReference: Long = 0L,
    public var cAttribute: UInt = 0u,
    public var rgAttribute: Long = 0L,
)

public data class CMC_ADD_EXTENSIONS_INFO(
    public var dwCmcDataReference: UInt = 0u,
    public var cCertReference: UInt = 0u,
    public var rgdwCertReference: Long = 0L,
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CMC_DATA_INFO(
    public var cTaggedAttribute: UInt = 0u,
    public var rgTaggedAttribute: Long = 0L,
    public var cTaggedRequest: UInt = 0u,
    public var rgTaggedRequest: Long = 0L,
    public var cTaggedContentInfo: UInt = 0u,
    public var rgTaggedContentInfo: Long = 0L,
    public var cTaggedOtherMsg: UInt = 0u,
    public var rgTaggedOtherMsg: Long = 0L,
)

public data class CMC_PEND_INFO(public var PendToken: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(), public var PendTime: FILETIME = FILETIME())

public data class CMC_RESPONSE_INFO(
    public var cTaggedAttribute: UInt = 0u,
    public var rgTaggedAttribute: Long = 0L,
    public var cTaggedContentInfo: UInt = 0u,
    public var rgTaggedContentInfo: Long = 0L,
    public var cTaggedOtherMsg: UInt = 0u,
    public var rgTaggedOtherMsg: Long = 0L,
)

public data class CMC_STATUS_INFO(
    public var dwStatus: UInt = 0u,
    public var cBodyList: UInt = 0u,
    public var rgdwBodyList: Long = 0L,
    public var pwszStatusString: PWSTR = 0L,
    public var dwOtherInfoChoice: UInt = 0u,
    public var Anonymous: CMC_STATUS_INFO_0 = CMC_STATUS_INFO_0(),
)

public data class CMC_STATUS_INFO_0(public var dwFailInfo: UInt = 0u, public var pPendInfo: Long = 0L)

public data class CMC_TAGGED_ATTRIBUTE(public var dwBodyPartID: UInt = 0u, public var Attribute: CRYPT_ATTRIBUTE = CRYPT_ATTRIBUTE())

public data class CMC_TAGGED_CERT_REQUEST(public var dwBodyPartID: UInt = 0u, public var SignedCertRequest: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CMC_TAGGED_CONTENT_INFO(public var dwBodyPartID: UInt = 0u, public var EncodedContentInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CMC_TAGGED_OTHER_MSG(
    public var dwBodyPartID: UInt = 0u,
    public var pszObjId: PSTR = 0L,
    public var Value: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CMC_TAGGED_REQUEST(public var dwTaggedRequestChoice: UInt = 0u, public var Anonymous: CMC_TAGGED_REQUEST_0 = CMC_TAGGED_REQUEST_0())

public data class CMC_TAGGED_REQUEST_0(public var pTaggedCertRequest: Long = 0L)

public data class CMSG_CMS_RECIPIENT_INFO(public var dwRecipientChoice: UInt = 0u, public var Anonymous: CMSG_CMS_RECIPIENT_INFO_0 = CMSG_CMS_RECIPIENT_INFO_0())

public data class CMSG_CMS_RECIPIENT_INFO_0(
    public var pKeyTrans: Long = 0L,
    public var pKeyAgree: Long = 0L,
    public var pMailList: Long = 0L,
)

public data class CMSG_CMS_SIGNER_INFO(
    public var dwVersion: UInt = 0u,
    public var SignerId: CERT_ID = CERT_ID(),
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var HashEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var EncryptedHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var AuthAttrs: CRYPT_ATTRIBUTES = CRYPT_ATTRIBUTES(),
    public var UnauthAttrs: CRYPT_ATTRIBUTES = CRYPT_ATTRIBUTES(),
)

public data class CMSG_CNG_CONTENT_DECRYPT_INFO(
    public var cbSize: UInt = 0u,
    public var ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pfnAlloc: PFN_CMSG_ALLOC = null,
    public var pfnFree: PFN_CMSG_FREE = null,
    public var hNCryptKey: NCRYPT_KEY_HANDLE = 0uL,
    public var pbContentEncryptKey: Long = 0L,
    public var cbContentEncryptKey: UInt = 0u,
    public var hCNGContentEncryptKey: BCRYPT_KEY_HANDLE = 0L,
    public var pbCNGContentEncryptKeyObject: Long = 0L,
)

public data class CMSG_CONTENT_ENCRYPT_INFO(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvEncryptionAuxInfo: Long = 0L,
    public var cRecipients: UInt = 0u,
    public var rgCmsRecipients: Long = 0L,
    public var pfnAlloc: PFN_CMSG_ALLOC = null,
    public var pfnFree: PFN_CMSG_FREE = null,
    public var dwEncryptFlags: UInt = 0u,
    public var Anonymous: CMSG_CONTENT_ENCRYPT_INFO_0 = CMSG_CONTENT_ENCRYPT_INFO_0(),
    public var dwFlags: UInt = 0u,
    public var fCNG: BOOL = 0,
    public var pbCNGContentEncryptKeyObject: Long = 0L,
    public var pbContentEncryptKey: Long = 0L,
    public var cbContentEncryptKey: UInt = 0u,
)

public data class CMSG_CONTENT_ENCRYPT_INFO_0(public var hContentEncryptKey: ULong = 0uL, public var hCNGContentEncryptKey: BCRYPT_KEY_HANDLE = 0L)

public data class CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA(
    public var cbSize: UInt = 0u,
    public var dwSignerIndex: UInt = 0u,
    public var blob: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CMSG_CTRL_DECRYPT_PARA(
    public var cbSize: UInt = 0u,
    public var Anonymous: CMSG_CTRL_DECRYPT_PARA_0 = CMSG_CTRL_DECRYPT_PARA_0(),
    public var dwKeySpec: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
)

public data class CMSG_CTRL_DECRYPT_PARA_0(public var hCryptProv: ULong = 0uL, public var hNCryptKey: NCRYPT_KEY_HANDLE = 0uL)

public data class CMSG_CTRL_DEL_SIGNER_UNAUTH_ATTR_PARA(
    public var cbSize: UInt = 0u,
    public var dwSignerIndex: UInt = 0u,
    public var dwUnauthAttrIndex: UInt = 0u,
)

public data class CMSG_CTRL_KEY_AGREE_DECRYPT_PARA(
    public var cbSize: UInt = 0u,
    public var Anonymous: CMSG_CTRL_KEY_AGREE_DECRYPT_PARA_0 = CMSG_CTRL_KEY_AGREE_DECRYPT_PARA_0(),
    public var dwKeySpec: UInt = 0u,
    public var pKeyAgree: Long = 0L,
    public var dwRecipientIndex: UInt = 0u,
    public var dwRecipientEncryptedKeyIndex: UInt = 0u,
    public var OriginatorPublicKey: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
)

public data class CMSG_CTRL_KEY_AGREE_DECRYPT_PARA_0(public var hCryptProv: ULong = 0uL, public var hNCryptKey: NCRYPT_KEY_HANDLE = 0uL)

public data class CMSG_CTRL_KEY_TRANS_DECRYPT_PARA(
    public var cbSize: UInt = 0u,
    public var Anonymous: CMSG_CTRL_KEY_TRANS_DECRYPT_PARA_0 = CMSG_CTRL_KEY_TRANS_DECRYPT_PARA_0(),
    public var dwKeySpec: UInt = 0u,
    public var pKeyTrans: Long = 0L,
    public var dwRecipientIndex: UInt = 0u,
)

public data class CMSG_CTRL_KEY_TRANS_DECRYPT_PARA_0(public var hCryptProv: ULong = 0uL, public var hNCryptKey: NCRYPT_KEY_HANDLE = 0uL)

public data class CMSG_CTRL_MAIL_LIST_DECRYPT_PARA(
    public var cbSize: UInt = 0u,
    public var hCryptProv: ULong = 0uL,
    public var pMailList: Long = 0L,
    public var dwRecipientIndex: UInt = 0u,
    public var dwKeyChoice: UInt = 0u,
    public var Anonymous: CMSG_CTRL_MAIL_LIST_DECRYPT_PARA_0 = CMSG_CTRL_MAIL_LIST_DECRYPT_PARA_0(),
)

public data class CMSG_CTRL_MAIL_LIST_DECRYPT_PARA_0(public var hKeyEncryptionKey: ULong = 0uL, public var pvKeyEncryptionKey: Long = 0L)

public data class CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var dwSignerIndex: UInt = 0u,
    public var dwSignerType: UInt = 0u,
    public var pvSigner: Long = 0L,
)

public data class CMSG_ENCRYPTED_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvEncryptionAuxInfo: Long = 0L,
)

public data class CMSG_ENVELOPED_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvEncryptionAuxInfo: Long = 0L,
    public var cRecipients: UInt = 0u,
    public var rgpRecipients: Long = 0L,
)

public data class CMSG_HASHED_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvHashAuxInfo: Long = 0L,
)

public data class CMSG_KEY_AGREE_ENCRYPT_INFO(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var UserKeyingMaterial: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwOriginatorChoice: CMSG_KEY_AGREE_ORIGINATOR = 0u,
    public var Anonymous: CMSG_KEY_AGREE_ENCRYPT_INFO_0 = CMSG_KEY_AGREE_ENCRYPT_INFO_0(),
    public var cKeyAgreeKeyEncryptInfo: UInt = 0u,
    public var rgpKeyAgreeKeyEncryptInfo: Long = 0L,
    public var dwFlags: UInt = 0u,
)

public data class CMSG_KEY_AGREE_ENCRYPT_INFO_0(public var OriginatorCertId: CERT_ID = CERT_ID(), public var OriginatorPublicKeyInfo: CERT_PUBLIC_KEY_INFO = CERT_PUBLIC_KEY_INFO())

public data class CMSG_KEY_AGREE_KEY_ENCRYPT_INFO(public var cbSize: UInt = 0u, public var EncryptedKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())

public data class CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvKeyEncryptionAuxInfo: Long = 0L,
    public var KeyWrapAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvKeyWrapAuxInfo: Long = 0L,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var dwKeySpec: UInt = 0u,
    public var dwKeyChoice: CMSG_KEY_AGREE_OPTION = 0u,
    public var Anonymous: CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO_0 = CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO_0(),
    public var UserKeyingMaterial: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var cRecipientEncryptedKeys: UInt = 0u,
    public var rgpRecipientEncryptedKeys: Long = 0L,
)

public data class CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO_0(public var pEphemeralAlgorithm: Long = 0L, public var pSenderId: Long = 0L)

public data class CMSG_KEY_AGREE_RECIPIENT_INFO(
    public var dwVersion: UInt = 0u,
    public var dwOriginatorChoice: CMSG_KEY_AGREE_ORIGINATOR = 0u,
    public var Anonymous: CMSG_KEY_AGREE_RECIPIENT_INFO_0 = CMSG_KEY_AGREE_RECIPIENT_INFO_0(),
    public var UserKeyingMaterial: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var cRecipientEncryptedKeys: UInt = 0u,
    public var rgpRecipientEncryptedKeys: Long = 0L,
)

public data class CMSG_KEY_AGREE_RECIPIENT_INFO_0(public var OriginatorCertId: CERT_ID = CERT_ID(), public var OriginatorPublicKeyInfo: CERT_PUBLIC_KEY_INFO = CERT_PUBLIC_KEY_INFO())

public data class CMSG_KEY_TRANS_ENCRYPT_INFO(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var EncryptedKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwFlags: UInt = 0u,
)

public data class CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvKeyEncryptionAuxInfo: Long = 0L,
    public var hCryptProv: HCRYPTPROV_LEGACY = 0uL,
    public var RecipientPublicKey: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var RecipientId: CERT_ID = CERT_ID(),
)

public data class CMSG_KEY_TRANS_RECIPIENT_INFO(
    public var dwVersion: UInt = 0u,
    public var RecipientId: CERT_ID = CERT_ID(),
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var EncryptedKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
)

public data class CMSG_MAIL_LIST_ENCRYPT_INFO(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var EncryptedKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var dwFlags: UInt = 0u,
)

public data class CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvKeyEncryptionAuxInfo: Long = 0L,
    public var hCryptProv: ULong = 0uL,
    public var dwKeyChoice: UInt = 0u,
    public var Anonymous: CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO_0 = CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO_0(),
    public var KeyId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var Date: FILETIME = FILETIME(),
    public var pOtherAttr: Long = 0L,
)

public data class CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO_0(public var hKeyEncryptionKey: ULong = 0uL, public var pvKeyEncryptionKey: Long = 0L)

public data class CMSG_MAIL_LIST_RECIPIENT_INFO(
    public var dwVersion: UInt = 0u,
    public var KeyId: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var EncryptedKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var Date: FILETIME = FILETIME(),
    public var pOtherAttr: Long = 0L,
)

public data class CMSG_RC2_AUX_INFO(public var cbSize: UInt = 0u, public var dwBitLen: UInt = 0u)

public data class CMSG_RC4_AUX_INFO(public var cbSize: UInt = 0u, public var dwBitLen: UInt = 0u)

public data class CMSG_RECIPIENT_ENCODE_INFO(public var dwRecipientChoice: UInt = 0u, public var Anonymous: CMSG_RECIPIENT_ENCODE_INFO_0 = CMSG_RECIPIENT_ENCODE_INFO_0())

public data class CMSG_RECIPIENT_ENCODE_INFO_0(
    public var pKeyTrans: Long = 0L,
    public var pKeyAgree: Long = 0L,
    public var pMailList: Long = 0L,
)

public data class CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var RecipientPublicKey: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var RecipientId: CERT_ID = CERT_ID(),
    public var Date: FILETIME = FILETIME(),
    public var pOtherAttr: Long = 0L,
)

public data class CMSG_RECIPIENT_ENCRYPTED_KEY_INFO(
    public var RecipientId: CERT_ID = CERT_ID(),
    public var EncryptedKey: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var Date: FILETIME = FILETIME(),
    public var pOtherAttr: Long = 0L,
)

public data class CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var SignedInfo: CMSG_SIGNED_ENCODE_INFO = CMSG_SIGNED_ENCODE_INFO(),
    public var EnvelopedInfo: CMSG_ENVELOPED_ENCODE_INFO = CMSG_ENVELOPED_ENCODE_INFO(),
)

public data class CMSG_SIGNED_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var cSigners: UInt = 0u,
    public var rgSigners: Long = 0L,
    public var cCertEncoded: UInt = 0u,
    public var rgCertEncoded: Long = 0L,
    public var cCrlEncoded: UInt = 0u,
    public var rgCrlEncoded: Long = 0L,
)

public data class CMSG_SIGNER_ENCODE_INFO(
    public var cbSize: UInt = 0u,
    public var pCertInfo: Long = 0L,
    public var Anonymous: CMSG_SIGNER_ENCODE_INFO_0 = CMSG_SIGNER_ENCODE_INFO_0(),
    public var dwKeySpec: UInt = 0u,
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var pvHashAuxInfo: Long = 0L,
    public var cAuthAttr: UInt = 0u,
    public var rgAuthAttr: Long = 0L,
    public var cUnauthAttr: UInt = 0u,
    public var rgUnauthAttr: Long = 0L,
)

public data class CMSG_SIGNER_ENCODE_INFO_0(public var hCryptProv: ULong = 0uL, public var hNCryptKey: NCRYPT_KEY_HANDLE = 0uL)

public data class CMSG_SIGNER_INFO(
    public var dwVersion: UInt = 0u,
    public var Issuer: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var SerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var HashEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var EncryptedHash: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var AuthAttrs: CRYPT_ATTRIBUTES = CRYPT_ATTRIBUTES(),
    public var UnauthAttrs: CRYPT_ATTRIBUTES = CRYPT_ATTRIBUTES(),
)

public data class CMSG_SP3_COMPATIBLE_AUX_INFO(public var cbSize: UInt = 0u, public var dwFlags: UInt = 0u)

public data class CMSG_STREAM_INFO(
    public var cbContent: UInt = 0u,
    public var pfnStreamOutput: PFN_CMSG_STREAM_OUTPUT = null,
    public var pvArg: Long = 0L,
)

public data class CMS_DH_KEY_INFO(
    public var dwVersion: UInt = 0u,
    public var Algid: ALG_ID = 0u,
    public var pszContentEncObjId: PSTR = 0L,
    public var PubInfo: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var pReserved: Long = 0L,
)

public data class CMS_KEY_INFO(
    public var dwVersion: UInt = 0u,
    public var Algid: ALG_ID = 0u,
    public var pbOID: Long = 0L,
    public var cbOID: UInt = 0u,
)

public data class CONTAINER_INFO(
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var cbSigPublicKey: UInt = 0u,
    public var pbSigPublicKey: Long = 0L,
    public var cbKeyExPublicKey: UInt = 0u,
    public var pbKeyExPublicKey: Long = 0L,
)

public data class CONTAINER_MAP_RECORD(
    public var wszGuid: UShortArray = UShortArray(40),
    public var bFlags: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wSigKeySizeBits: UShort = 0u,
    public var wKeyExchangeKeySizeBits: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CONTAINER_MAP_RECORD) return false
        if (!this.wszGuid.contentEquals(other.wszGuid)) return false
        if (this.bFlags != other.bFlags) return false
        if (this.bReserved != other.bReserved) return false
        if (this.wSigKeySizeBits != other.wSigKeySizeBits) return false
        if (this.wKeyExchangeKeySizeBits != other.wKeyExchangeKeySizeBits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszGuid.contentHashCode()
        result = 31 * result + this.bFlags.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.wSigKeySizeBits.hashCode()
        result = 31 * result + this.wKeyExchangeKeySizeBits.hashCode()
        return result
    }
}

public data class CPS_URLS(
    public var pszURL: PWSTR = 0L,
    public var pAlgorithm: Long = 0L,
    public var pDigest: Long = 0L,
)

public data class CRL_CONTEXT(
    public var dwCertEncodingType: CERT_QUERY_ENCODING_TYPE = 0u,
    public var pbCrlEncoded: Long = 0L,
    public var cbCrlEncoded: UInt = 0u,
    public var pCrlInfo: Long = 0L,
    public var hCertStore: HCERTSTORE = 0L,
)

public data class CRL_DIST_POINT(
    public var DistPointName: CRL_DIST_POINT_NAME = CRL_DIST_POINT_NAME(),
    public var ReasonFlags: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var CRLIssuer: CERT_ALT_NAME_INFO = CERT_ALT_NAME_INFO(),
)

public data class CRL_DIST_POINTS_INFO(public var cDistPoint: UInt = 0u, public var rgDistPoint: Long = 0L)

public data class CRL_DIST_POINT_NAME(public var dwDistPointNameChoice: UInt = 0u, public var Anonymous: CRL_DIST_POINT_NAME_0 = CRL_DIST_POINT_NAME_0())

public data class CRL_DIST_POINT_NAME_0(public var FullName: CERT_ALT_NAME_INFO = CERT_ALT_NAME_INFO())

public data class CRL_ENTRY(
    public var SerialNumber: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var RevocationDate: FILETIME = FILETIME(),
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CRL_FIND_ISSUED_FOR_PARA(public var pSubjectCert: Long = 0L, public var pIssuerCert: Long = 0L)

public data class CRL_INFO(
    public var dwVersion: UInt = 0u,
    public var SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER = CRYPT_ALGORITHM_IDENTIFIER(),
    public var Issuer: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB(),
    public var ThisUpdate: FILETIME = FILETIME(),
    public var NextUpdate: FILETIME = FILETIME(),
    public var cCRLEntry: UInt = 0u,
    public var rgCRLEntry: Long = 0L,
    public var cExtension: UInt = 0u,
    public var rgExtension: Long = 0L,
)

public data class CRL_ISSUING_DIST_POINT(
    public var DistPointName: CRL_DIST_POINT_NAME = CRL_DIST_POINT_NAME(),
    public var fOnlyContainsUserCerts: BOOL = 0,
    public var fOnlyContainsCACerts: BOOL = 0,
    public var OnlySomeReasonFlags: CRYPT_BIT_BLOB = CRYPT_BIT_BLOB(),
    public var fIndirectCRL: BOOL = 0,
)

public data class CRL_REVOCATION_INFO(
    public var pCrlEntry: Long = 0L,
    public var pCrlContext: Long = 0L,
    public var pCrlIssuerChain: Long = 0L,
)

public data class CROSS_CERT_DIST_POINTS_INFO(
    public var dwSyncDeltaTime: UInt = 0u,
    public var cDistPoint: UInt = 0u,
    public var rgDistPoint: Long = 0L,
)

public data class CRYPTNET_URL_CACHE_FLUSH_INFO(
    public var cbSize: UInt = 0u,
    public var dwExemptSeconds: UInt = 0u,
    public var ExpireTime: FILETIME = FILETIME(),
)

public data class CRYPTNET_URL_CACHE_PRE_FETCH_INFO(
    public var cbSize: UInt = 0u,
    public var dwObjectType: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var ThisUpdateTime: FILETIME = FILETIME(),
    public var NextUpdateTime: FILETIME = FILETIME(),
    public var PublishTime: FILETIME = FILETIME(),
)

public data class CRYPTNET_URL_CACHE_RESPONSE_INFO(
    public var cbSize: UInt = 0u,
    public var wResponseType: UShort = 0u,
    public var wResponseFlags: UShort = 0u,
    public var LastModifiedTime: FILETIME = FILETIME(),
    public var dwMaxAge: UInt = 0u,
    public var pwszETag: PCWSTR = 0L,
    public var dwProxyId: UInt = 0u,
)

public data class CRYPTPROTECT_PROMPTSTRUCT(
    public var cbSize: UInt = 0u,
    public var dwPromptFlags: UInt = 0u,
    public var hwndApp: HWND = 0L,
    public var szPrompt: PCWSTR = 0L,
)

public data class CRYPT_3DES_KEY_STATE(
    public var Key: UByteArray = UByteArray(24),
    public var IV: UByteArray = UByteArray(8),
    public var Feedback: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_3DES_KEY_STATE) return false
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

public data class CRYPT_AES_128_KEY_STATE(
    public var Key: UByteArray = UByteArray(16),
    public var IV: UByteArray = UByteArray(16),
    public var EncryptionState: UByteArray = UByteArray(176),
    public var DecryptionState: UByteArray = UByteArray(176),
    public var Feedback: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_AES_128_KEY_STATE) return false
        if (!this.Key.contentEquals(other.Key)) return false
        if (!this.IV.contentEquals(other.IV)) return false
        if (!this.EncryptionState.contentEquals(other.EncryptionState)) return false
        if (!this.DecryptionState.contentEquals(other.DecryptionState)) return false
        if (!this.Feedback.contentEquals(other.Feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Key.contentHashCode()
        result = 31 * result + this.IV.contentHashCode()
        result = 31 * result + this.EncryptionState.contentHashCode()
        result = 31 * result + this.DecryptionState.contentHashCode()
        result = 31 * result + this.Feedback.contentHashCode()
        return result
    }
}

public data class CRYPT_AES_256_KEY_STATE(
    public var Key: UByteArray = UByteArray(32),
    public var IV: UByteArray = UByteArray(16),
    public var EncryptionState: UByteArray = UByteArray(240),
    public var DecryptionState: UByteArray = UByteArray(240),
    public var Feedback: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CRYPT_AES_256_KEY_STATE) return false
        if (!this.Key.contentEquals(other.Key)) return false
        if (!this.IV.contentEquals(other.IV)) return false
        if (!this.EncryptionState.contentEquals(other.EncryptionState)) return false
        if (!this.DecryptionState.contentEquals(other.DecryptionState)) return false
        if (!this.Feedback.contentEquals(other.Feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Key.contentHashCode()
        result = 31 * result + this.IV.contentHashCode()
        result = 31 * result + this.EncryptionState.contentHashCode()
        result = 31 * result + this.DecryptionState.contentHashCode()
        result = 31 * result + this.Feedback.contentHashCode()
        return result
    }
}

public data class CRYPT_ALGORITHM_IDENTIFIER(public var pszObjId: PSTR = 0L, public var Parameters: CRYPT_INTEGER_BLOB = CRYPT_INTEGER_BLOB())
