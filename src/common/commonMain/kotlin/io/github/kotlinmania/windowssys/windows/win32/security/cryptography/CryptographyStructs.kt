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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

public data class AuthenticodeExtraCertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwRegPolicySettings: UInt = 0u,
    public var pSignerInfo: CmsgSignerInfo? = null,
)

public data class AuthenticodeExtraCertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var fCommercial: Bool = 0,
)

public data class AuthenticodeTsExtraCertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwRegPolicySettings: UInt = 0u,
    public var fCommercial: Bool = 0,
)

public data class BcryptAlgorithmIdentifier(
    public var pszName: Pwstr = null,
    public var dwClass: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class BcryptAsymmetricEncryptionFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKeyPair: BCryptGenerateKeyPairFn = null,
    public var finalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var encrypt: BCryptEncryptFn = null,
    public var decrypt: BCryptDecryptFn = null,
    public var importKeyPair: BCryptImportKeyPairFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
    public var signHash: BCryptSignHashFn = null,
    public var verifySignature: BCryptVerifySignatureFn = null,
)

public data class BcryptAuthenticatedCipherModeInfo(
    public var cbSize: UInt = 0u,
    public var dwInfoVersion: UInt = 0u,
    public var pbNonce: COpaquePointer? = null,
    public var cbNonce: UInt = 0u,
    public var pbAuthData: COpaquePointer? = null,
    public var cbAuthData: UInt = 0u,
    public var pbTag: COpaquePointer? = null,
    public var cbTag: UInt = 0u,
    public var pbMacContext: COpaquePointer? = null,
    public var cbMacContext: UInt = 0u,
    public var cbAAD: UInt = 0u,
    public var cbData: ULong = 0uL,
    public var dwFlags: UInt = 0u,
)

public data class BcryptCipherFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKey: BCryptGenerateSymmetricKeyFn = null,
    public var encrypt: BCryptEncryptFn = null,
    public var decrypt: BCryptDecryptFn = null,
    public var importKey: BCryptImportKeyFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var duplicateKey: BCryptDuplicateKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
)

public data class BcryptDhKeyBlob(
    public var dwMagic: BcryptDhKeyBlobMagic = 0u,
    public var cbKey: UInt = 0u,
)

public data class BcryptDhParameterHeader(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
)

public data class BcryptDsaKeyBlob(
    public var dwMagic: BcryptDsaMagic = 0u,
    public var cbKey: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
    public var seed: UByteArray = UByteArray(20),
    public var q: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaKeyBlob) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKey != other.cbKey) return false
        if (!this.count.contentEquals(other.count)) return false
        if (!this.seed.contentEquals(other.seed)) return false
        if (!this.q.contentEquals(other.q)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMagic.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.count.contentHashCode()
        result = 31 * result + this.seed.contentHashCode()
        result = 31 * result + this.q.contentHashCode()
        return result
    }
}

public data class BcryptDsaKeyBlobV2(
    public var dwMagic: BcryptDsaMagic = 0u,
    public var cbKey: UInt = 0u,
    public var hashAlgorithm: HashalgorithmEnum = 0,
    public var standardVersion: DsafipsversionEnum = 0,
    public var cbSeedLength: UInt = 0u,
    public var cbGroupSize: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaKeyBlobV2) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKey != other.cbKey) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.standardVersion != other.standardVersion) return false
        if (this.cbSeedLength != other.cbSeedLength) return false
        if (this.cbGroupSize != other.cbGroupSize) return false
        if (!this.count.contentEquals(other.count)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMagic.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.hashAlgorithm.hashCode()
        result = 31 * result + this.standardVersion.hashCode()
        result = 31 * result + this.cbSeedLength.hashCode()
        result = 31 * result + this.cbGroupSize.hashCode()
        result = 31 * result + this.count.contentHashCode()
        return result
    }
}

public data class BcryptDsaParameterHeader(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
    public var seed: UByteArray = UByteArray(20),
    public var q: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaParameterHeader) return false
        if (this.cbLength != other.cbLength) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKeyLength != other.cbKeyLength) return false
        if (!this.count.contentEquals(other.count)) return false
        if (!this.seed.contentEquals(other.seed)) return false
        if (!this.q.contentEquals(other.q)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.dwMagic.hashCode()
        result = 31 * result + this.cbKeyLength.hashCode()
        result = 31 * result + this.count.contentHashCode()
        result = 31 * result + this.seed.contentHashCode()
        result = 31 * result + this.q.contentHashCode()
        return result
    }
}

public data class BcryptDsaParameterHeaderV2(
    public var cbLength: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var cbKeyLength: UInt = 0u,
    public var hashAlgorithm: HashalgorithmEnum = 0,
    public var standardVersion: DsafipsversionEnum = 0,
    public var cbSeedLength: UInt = 0u,
    public var cbGroupSize: UInt = 0u,
    public var count: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BcryptDsaParameterHeaderV2) return false
        if (this.cbLength != other.cbLength) return false
        if (this.dwMagic != other.dwMagic) return false
        if (this.cbKeyLength != other.cbKeyLength) return false
        if (this.hashAlgorithm != other.hashAlgorithm) return false
        if (this.standardVersion != other.standardVersion) return false
        if (this.cbSeedLength != other.cbSeedLength) return false
        if (this.cbGroupSize != other.cbGroupSize) return false
        if (!this.count.contentEquals(other.count)) return false
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
        result = 31 * result + this.count.contentHashCode()
        return result
    }
}

public data class BcryptEccfullkeyBlob(
    public var dwMagic: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwCurveType: EccCurveTypeEnum = 0,
    public var dwCurveGenerationAlgId: EccCurveAlgIdEnum = 0,
    public var cbFieldLength: UInt = 0u,
    public var cbSubgroupOrder: UInt = 0u,
    public var cbCofactor: UInt = 0u,
    public var cbSeed: UInt = 0u,
)

public data class BcryptEcckeyBlob(
    public var dwMagic: UInt = 0u,
    public var cbKey: UInt = 0u,
)

public data class BcryptEccCurveNames(
    public var dwEccCurveNames: UInt = 0u,
    public var pEccCurveNames: Pwstr? = null,
)

public data class BcryptEccParameterHeader(
    public var dwVersion: UInt = 0u,
    public var dwCurveType: EccCurveTypeEnum = 0,
    public var dwCurveGenerationAlgId: EccCurveAlgIdEnum = 0,
    public var cbFieldLength: UInt = 0u,
    public var cbSubgroupOrder: UInt = 0u,
    public var cbCofactor: UInt = 0u,
    public var cbSeed: UInt = 0u,
)

public data class BcryptHashFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var createHash: BCryptCreateHashFn = null,
    public var hashData: BCryptHashDataFn = null,
    public var finishHash: BCryptFinishHashFn = null,
    public var duplicateHash: BCryptDuplicateHashFn = null,
    public var destroyHash: BCryptDestroyHashFn = null,
    public var createMultiHash: BCryptCreateMultiHashFn = null,
    public var processMultiOperations: BCryptProcessMultiOperationsFn = null,
)

public data class BcryptInterfaceVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
)

public data class BcryptKeyBlob(
    public var magic: UInt = 0u,
)

public data class BcryptKeyDataBlobHeader(
    public var dwMagic: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var cbKeyData: UInt = 0u,
)

public data class BcryptKeyDerivationFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKey: BCryptGenerateSymmetricKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
    public var keyDerivation: BCryptKeyDerivationFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var importKey: BCryptImportKeyFn = null,
    public var duplicateKey: BCryptDuplicateKeyFn = null,
)

public data class BcryptKeyLengthsStruct(
    public var dwMinLength: UInt = 0u,
    public var dwMaxLength: UInt = 0u,
    public var dwIncrement: UInt = 0u,
)

public data class BcryptMultiHashOperation(
    public var iHash: UInt = 0u,
    public var hashOperation: BcryptHashOperationType = 0,
    public var pbBuffer: COpaquePointer? = null,
    public var cbBuffer: UInt = 0u,
)

public data class BcryptMultiObjectLengthStruct(
    public var cbPerObject: UInt = 0u,
    public var cbPerElement: UInt = 0u,
)

public data class BcryptOaepPaddingInfo(
    public var pszAlgId: Pcwstr = null,
    public var pbLabel: COpaquePointer? = null,
    public var cbLabel: UInt = 0u,
)

public data class BcryptOid(
    public var cbOID: UInt = 0u,
    public var pbOID: COpaquePointer? = null,
)

public data class BcryptOidList(
    public var dwOIDCount: UInt = 0u,
    public var pOIDs: BcryptOid? = null,
)

public data class BcryptPkcs1PaddingInfo(
    public var pszAlgId: Pcwstr = null,
)

public data class BcryptProviderName(
    public var pszProviderName: Pwstr = null,
)

public data class BcryptPssPaddingInfo(
    public var pszAlgId: Pcwstr = null,
    public var cbSalt: UInt = 0u,
)

public data class BcryptRngFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var genRandom: BCryptGenRandomFn = null,
)

public data class BcryptRsakeyBlob(
    public var magic: BcryptRsakeyBlobMagic = 0u,
    public var bitLength: UInt = 0u,
    public var cbPublicExp: UInt = 0u,
    public var cbModulus: UInt = 0u,
    public var cbPrime1: UInt = 0u,
    public var cbPrime2: UInt = 0u,
)

public data class BcryptSecretAgreementFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var secretAgreement: BCryptSecretAgreementFn = null,
    public var deriveKey: BCryptDeriveKeyFn = null,
    public var destroySecret: BCryptDestroySecretFn = null,
    public var generateKeyPair: BCryptGenerateKeyPairFn = null,
    public var finalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var importKeyPair: BCryptImportKeyPairFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
)

public data class BcryptSignatureFunctionTable(
    public var version: BcryptInterfaceVersion = BcryptInterfaceVersion(),
    public var openAlgorithmProvider: BCryptOpenAlgorithmProviderFn = null,
    public var getProperty: BCryptGetPropertyFn = null,
    public var setProperty: BCryptSetPropertyFn = null,
    public var closeAlgorithmProvider: BCryptCloseAlgorithmProviderFn = null,
    public var generateKeyPair: BCryptGenerateKeyPairFn = null,
    public var finalizeKeyPair: BCryptFinalizeKeyPairFn = null,
    public var signHash: BCryptSignHashFn = null,
    public var verifySignature: BCryptVerifySignatureFn = null,
    public var importKeyPair: BCryptImportKeyPairFn = null,
    public var exportKey: BCryptExportKeyFn = null,
    public var destroyKey: BCryptDestroyKeyFn = null,
)

public data class BCryptBuffer(
    public var cbBuffer: UInt = 0u,
    public var bufferType: UInt = 0u,
    public var pvBuffer: COpaquePointer? = null,
)

public data class BCryptBufferDesc(
    public var ulVersion: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var pBuffers: BCryptBuffer? = null,
)

public data class CardAuthenticate(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pinId: UInt = 0u,
    public var cbPinData: UInt = 0u,
    public var pbPinData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardAuthenticate) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pinId != other.pinId) return false
        if (this.cbPinData != other.cbPinData) return false
        if (!this.pbPinData.contentEquals(other.pbPinData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pinId.hashCode()
        result = 31 * result + this.cbPinData.hashCode()
        result = 31 * result + this.pbPinData.contentHashCode()
        return result
    }
}

public data class CardAuthenticateResponse(
    public var dwVersion: UInt = 0u,
    public var cbSessionPin: UInt = 0u,
    public var cAttemptsRemaining: UInt = 0u,
    public var pbSessionPin: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardAuthenticateResponse) return false
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

public data class CardCacheFileFormat(
    public var bVersion: UByte = 0u,
    public var bPinsFreshness: UByte = 0u,
    public var wContainersFreshness: UShort = 0u,
    public var wFilesFreshness: UShort = 0u,
)

public data class CardCapabilities(
    public var dwVersion: UInt = 0u,
    public var fCertificateCompression: Bool = 0,
    public var fKeyGen: Bool = 0,
)

public data class CardChangeAuthenticator(
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
        if (other !is CardChangeAuthenticator) return false
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

public data class CardChangeAuthenticatorResponse(
    public var dwVersion: UInt = 0u,
    public var cAttemptsRemaining: UInt = 0u,
)

public class CardData(
    public var dwVersion: UInt = 0u,
    public var pbAtr: COpaquePointer? = null,
    public var cbAtr: UInt = 0u,
    public var pwszCardName: Pwstr = null,
    public var pfnCspAlloc: PfnCspAlloc = null,
    public var pfnCspReAlloc: PfnCspRealloc = null,
    public var pfnCspFree: PfnCspFree = null,
    public var pfnCspCacheAddFile: PfnCspCacheAddFile = null,
    public var pfnCspCacheLookupFile: PfnCspCacheLookupFile = null,
    public var pfnCspCacheDeleteFile: PfnCspCacheDeleteFile = null,
    public var pvCacheContext: COpaquePointer? = null,
    public var pfnCspPadData: PfnCspPadData = null,
    public var hSCardCtx: Int = 0,
    public var hScard: Int = 0,
    public var pvVendorSpecific: COpaquePointer? = null,
    public var pfnCardDeleteContext: PfnCardDeleteContext = null,
    public var pfnCardQueryCapabilities: PfnCardQueryCapabilities = null,
    public var pfnCardDeleteContainer: PfnCardDeleteContainer = null,
    public var pfnCardCreateContainer: PfnCardCreateContainer = null,
    public var pfnCardGetContainerInfo: PfnCardGetContainerInfo = null,
    public var pfnCardAuthenticatePin: PfnCardAuthenticatePin = null,
    public var pfnCardGetChallenge: PfnCardGetChallenge = null,
    public var pfnCardAuthenticateChallenge: PfnCardAuthenticateChallenge = null,
    public var pfnCardUnblockPin: PfnCardUnblockPin = null,
    public var pfnCardChangeAuthenticator: PfnCardChangeAuthenticator = null,
    public var pfnCardDeauthenticate: PfnCardDeauthenticate = null,
    public var pfnCardCreateDirectory: PfnCardCreateDirectory = null,
    public var pfnCardDeleteDirectory: PfnCardDeleteDirectory = null,
    public var pvUnused3: COpaquePointer? = null,
    public var pvUnused4: COpaquePointer? = null,
    public var pfnCardCreateFile: PfnCardCreateFile = null,
    public var pfnCardReadFile: PfnCardReadFile = null,
    public var pfnCardWriteFile: PfnCardWriteFile = null,
    public var pfnCardDeleteFile: PfnCardDeleteFile = null,
    public var pfnCardEnumFiles: PfnCardEnumFiles = null,
    public var pfnCardGetFileInfo: PfnCardGetFileInfo = null,
    public var pfnCardQueryFreeSpace: PfnCardQueryFreeSpace = null,
    public var pfnCardQueryKeySizes: PfnCardQueryKeySizes = null,
    public var pfnCardSignData: PfnCardSignData = null,
    public var pfnCardRSADecrypt: PfnCardRsaDecrypt = null,
    public var pfnCardConstructDHAgreement: PfnCardConstructDhAgreement = null,
    public var pfnCardDeriveKey: PfnCardDeriveKey = null,
    public var pfnCardDestroyDHAgreement: PfnCardDestroyDhAgreement = null,
    public var pfnCspGetDHAgreement: PfnCspGetDhAgreement = null,
    public var pfnCardGetChallengeEx: PfnCardGetChallengeEx = null,
    public var pfnCardAuthenticateEx: PfnCardAuthenticateEx = null,
    public var pfnCardChangeAuthenticatorEx: PfnCardChangeAuthenticatorEx = null,
    public var pfnCardDeauthenticateEx: PfnCardDeauthenticateEx = null,
    public var pfnCardGetContainerProperty: PfnCardGetContainerProperty = null,
    public var pfnCardSetContainerProperty: PfnCardSetContainerProperty = null,
    public var pfnCardGetProperty: PfnCardGetProperty = null,
    public var pfnCardSetProperty: PfnCardSetProperty = null,
    public var pfnCspUnpadData: PfnCspUnpadData = null,
    public var pfnMDImportSessionKey: PfnMdImportSessionKey = null,
    public var pfnMDEncryptData: PfnMdEncryptData = null,
    public var pfnCardImportSessionKey: PfnCardImportSessionKey = null,
    public var pfnCardGetSharedKeyHandle: PfnCardGetSharedKeyHandle = null,
    public var pfnCardGetAlgorithmProperty: PfnCardGetAlgorithmProperty = null,
    public var pfnCardGetKeyProperty: PfnCardGetKeyProperty = null,
    public var pfnCardSetKeyProperty: PfnCardSetKeyProperty = null,
    public var pfnCardDestroyKey: PfnCardDestroyKey = null,
    public var pfnCardProcessEncryptedData: PfnCardProcessEncryptedData = null,
    public var pfnCardCreateContainerEx: PfnCardCreateContainerEx = null,
)

public data class CardDeriveKey(
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwszKDF: Pwstr = null,
    public var bSecretAgreementIndex: UByte = 0u,
    public var pParameterList: COpaquePointer? = null,
    public var pbDerivedKey: COpaquePointer? = null,
    public var cbDerivedKey: UInt = 0u,
    public var pwszAlgId: Pwstr = null,
    public var dwKeyLen: UInt = 0u,
    public var hKey: Int = 0,
)

public data class CardDhAgreementInfo(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var dwFlags: UInt = 0u,
    public var dwPublicKey: UInt = 0u,
    public var pbPublicKey: COpaquePointer? = null,
    public var pbReserved: COpaquePointer? = null,
    public var cbReserved: UInt = 0u,
    public var bSecretAgreementIndex: UByte = 0u,
)

public data class CardEncryptedData(
    public var pbEncryptedData: COpaquePointer? = null,
    public var cbEncryptedData: UInt = 0u,
)

public data class CardFileInfo(
    public var dwVersion: UInt = 0u,
    public var cbFileSize: UInt = 0u,
    public var accessCondition: CardFileAccessCondition = 0,
)

public data class CardFreeSpaceInfo(
    public var dwVersion: UInt = 0u,
    public var dwBytesAvailable: UInt = 0u,
    public var dwKeyContainersAvailable: UInt = 0u,
    public var dwMaxKeyContainers: UInt = 0u,
)

public data class CardImportKeypair(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var pinId: UInt = 0u,
    public var dwKeySpec: UInt = 0u,
    public var dwKeySize: UInt = 0u,
    public var cbInput: UInt = 0u,
    public var pbInput: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CardImportKeypair) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.bContainerIndex != other.bContainerIndex) return false
        if (this.pinId != other.pinId) return false
        if (this.dwKeySpec != other.dwKeySpec) return false
        if (this.dwKeySize != other.dwKeySize) return false
        if (this.cbInput != other.cbInput) return false
        if (!this.pbInput.contentEquals(other.pbInput)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.bContainerIndex.hashCode()
        result = 31 * result + this.pinId.hashCode()
        result = 31 * result + this.dwKeySpec.hashCode()
        result = 31 * result + this.dwKeySize.hashCode()
        result = 31 * result + this.cbInput.hashCode()
        result = 31 * result + this.pbInput.contentHashCode()
        return result
    }
}

public data class CardKeySizes(
    public var dwVersion: UInt = 0u,
    public var dwMinimumBitlen: UInt = 0u,
    public var dwDefaultBitlen: UInt = 0u,
    public var dwMaximumBitlen: UInt = 0u,
    public var dwIncrementalBitlen: UInt = 0u,
)

public data class CardRsaDecryptInfo(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var dwKeySpec: UInt = 0u,
    public var pbData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var pPaddingInfo: COpaquePointer? = null,
    public var dwPaddingType: UInt = 0u,
)

public data class CardSigningInfo(
    public var dwVersion: UInt = 0u,
    public var bContainerIndex: UByte = 0u,
    public var dwKeySpec: UInt = 0u,
    public var dwSigningFlags: UInt = 0u,
    public var aiHashAlg: AlgId = 0u,
    public var pbData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var pbSignedData: COpaquePointer? = null,
    public var cbSignedData: UInt = 0u,
    public var pPaddingInfo: COpaquePointer? = null,
    public var dwPaddingType: UInt = 0u,
)

public data class CertificateChainBlob(
    public var certCount: UInt = 0u,
    public var rawCertificates: CryptIntegerBlob? = null,
)

public data class CertAccessDescription(
    public var pszAccessMethod: Pstr = null,
    public var accessLocation: CertAltNameEntry = CertAltNameEntry(),
)

public data class CertAltNameEntry(
    public var dwAltNameChoice: UInt = 0u,
    public var anonymous: CertAltNameEntry0 = CertAltNameEntry0(),
)

public data class CertAltNameEntry0(
    public var pOtherName: CertOtherName? = null,
    public var pwszRfc822Name: Pwstr = null,
    public var pwszDNSName: Pwstr = null,
    public var directoryName: CryptIntegerBlob = CryptIntegerBlob(),
    public var pwszURL: Pwstr = null,
    public var iPAddress: CryptIntegerBlob = CryptIntegerBlob(),
    public var pszRegisteredID: Pstr = null,
)

public data class CertAltNameInfo(
    public var cAltEntry: UInt = 0u,
    public var rgAltEntry: CertAltNameEntry? = null,
)

public data class CertAuthorityInfoAccess(
    public var cAccDescr: UInt = 0u,
    public var rgAccDescr: CertAccessDescription? = null,
)

public data class CertAuthorityKeyId2Info(
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var authorityCertIssuer: CertAltNameInfo = CertAltNameInfo(),
    public var authorityCertSerialNumber: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertAuthorityKeyIdInfo(
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var certIssuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var certSerialNumber: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertBasicConstraints2Info(
    public var fCA: Bool = 0,
    public var fPathLenConstraint: Bool = 0,
    public var dwPathLenConstraint: UInt = 0u,
)

public data class CertBasicConstraintsInfo(
    public var subjectType: CryptBitBlob = CryptBitBlob(),
    public var fPathLenConstraint: Bool = 0,
    public var dwPathLenConstraint: UInt = 0u,
    public var cSubtreesConstraint: UInt = 0u,
    public var rgSubtreesConstraint: CryptIntegerBlob? = null,
)

public data class CertBiometricData(
    public var dwTypeOfBiometricDataChoice: CertBiometricDataType = 0u,
    public var anonymous: CertBiometricData0 = CertBiometricData0(),
    public var hashedUrl: CertHashedUrl = CertHashedUrl(),
)

public data class CertBiometricData0(
    public var dwPredefined: UInt = 0u,
    public var pszObjId: Pstr = null,
)

public data class CertBiometricExtInfo(
    public var cBiometricData: UInt = 0u,
    public var rgBiometricData: CertBiometricData? = null,
)

public data class CertChain(
    public var cCerts: UInt = 0u,
    public var certs: CryptIntegerBlob? = null,
    public var keyLocatorInfo: CryptKeyProvInfo = CryptKeyProvInfo(),
)

public data class CertChainContext(
    public var cbSize: UInt = 0u,
    public var trustStatus: CertTrustStatus = CertTrustStatus(),
    public var cChain: UInt = 0u,
    public var rgpChain: COpaquePointer? = null,
    public var cLowerQualityChainContext: UInt = 0u,
    public var rgpLowerQualityChainContext: COpaquePointer? = null,
    public var fHasRevocationFreshnessTime: Bool = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
    public var dwCreateFlags: UInt = 0u,
    public var chainId: Guid = Guid(),
)

public data class CertChainElement(
    public var cbSize: UInt = 0u,
    public var pCertContext: CertContext? = null,
    public var trustStatus: CertTrustStatus = CertTrustStatus(),
    public var pRevocationInfo: CertRevocationInfo? = null,
    public var pIssuanceUsage: CtlUsage? = null,
    public var pApplicationUsage: CtlUsage? = null,
    public var pwszExtendedErrorInfo: Pcwstr = null,
)

public data class CertChainEngineConfig(
    public var cbSize: UInt = 0u,
    public var hRestrictedRoot: Hcertstore = null,
    public var hRestrictedTrust: Hcertstore = null,
    public var hRestrictedOther: Hcertstore = null,
    public var cAdditionalStore: UInt = 0u,
    public var rghAdditionalStore: COpaquePointer? = null,
    public var dwFlags: UInt = 0u,
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var maximumCachedCertificates: UInt = 0u,
    public var cycleDetectionModulus: UInt = 0u,
    public var hExclusiveRoot: Hcertstore = null,
    public var hExclusiveTrustedPeople: Hcertstore = null,
    public var dwExclusiveFlags: UInt = 0u,
)

public data class CertChainFindByIssuerPara(
    public var cbSize: UInt = 0u,
    public var pszUsageIdentifier: Pcstr = null,
    public var dwKeySpec: UInt = 0u,
    public var dwAcquirePrivateKeyFlags: UInt = 0u,
    public var cIssuer: UInt = 0u,
    public var rgIssuer: CryptIntegerBlob? = null,
    public var pfnFindCallback: PfnCertChainFindByIssuerCallback = null,
    public var pvFindArg: COpaquePointer? = null,
)

public data class CertChainPara(
    public var cbSize: UInt = 0u,
    public var requestedUsage: CertUsageMatch = CertUsageMatch(),
    public var requestedIssuancePolicy: CertUsageMatch = CertUsageMatch(),
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var fCheckRevocationFreshnessTime: Bool = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
    public var pftCacheResync: Filetime? = null,
    public var pStrongSignPara: CertStrongSignPara? = null,
    public var dwStrongSignFlags: UInt = 0u,
)

public data class CertChainPolicyPara(
    public var cbSize: UInt = 0u,
    public var dwFlags: CertChainPolicyFlags = 0u,
    public var pvExtraPolicyPara: COpaquePointer? = null,
)

public data class CertChainPolicyStatus(
    public var cbSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var lChainIndex: Int = 0,
    public var lElementIndex: Int = 0,
    public var pvExtraPolicyStatus: COpaquePointer? = null,
)

public data class CertContext(
    public var dwCertEncodingType: CertQueryEncodingType = 0u,
    public var pbCertEncoded: COpaquePointer? = null,
    public var cbCertEncoded: UInt = 0u,
    public var pCertInfo: CertInfo? = null,
    public var hCertStore: Hcertstore = null,
)

public data class CertCreateContextPara(
    public var cbSize: UInt = 0u,
    public var pfnFree: PfnCryptFree = null,
    public var pvFree: COpaquePointer? = null,
    public var pfnSort: PfnCertCreateContextSortFunc = null,
    public var pvSort: COpaquePointer? = null,
)

public data class CertCrlContextPair(
    public var pCertContext: CertContext? = null,
    public var pCrlContext: CrlContext? = null,
)

public data class CertDhParameters(
    public var p: CryptIntegerBlob = CryptIntegerBlob(),
    public var g: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertDssParameters(
    public var p: CryptIntegerBlob = CryptIntegerBlob(),
    public var q: CryptIntegerBlob = CryptIntegerBlob(),
    public var g: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertEccSignature(
    public var r: CryptIntegerBlob = CryptIntegerBlob(),
    public var s: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertExtension(
    public var pszObjId: Pstr = null,
    public var fCritical: Bool = 0,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertExtensions(
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CertFortezzaDataProp(
    public var serialNumber: UByteArray = UByteArray(8),
    public var certIndex: Int = 0,
    public var certLabel: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertFortezzaDataProp) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.certIndex != other.certIndex) return false
        if (!this.certLabel.contentEquals(other.certLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serialNumber.contentHashCode()
        result = 31 * result + this.certIndex.hashCode()
        result = 31 * result + this.certLabel.contentHashCode()
        return result
    }
}

public data class CertGeneralSubtree(
    public var base: CertAltNameEntry = CertAltNameEntry(),
    public var dwMinimum: UInt = 0u,
    public var fMaximum: Bool = 0,
    public var dwMaximum: UInt = 0u,
)

public data class CertHashedUrl(
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hash: CryptIntegerBlob = CryptIntegerBlob(),
    public var pwszUrl: Pwstr = null,
)

public data class CertId(
    public var dwIdChoice: CertIdOption = 0u,
    public var anonymous: CertId0 = CertId0(),
)

public data class CertId0(
    public var issuerSerialNumber: CertIssuerSerialNumber = CertIssuerSerialNumber(),
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var hashId: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertInfo(
    public var dwVersion: UInt = 0u,
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
    public var signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var issuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var notBefore: Filetime = Filetime(),
    public var notAfter: Filetime = Filetime(),
    public var subject: CryptIntegerBlob = CryptIntegerBlob(),
    public var subjectPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
    public var issuerUniqueId: CryptBitBlob = CryptBitBlob(),
    public var subjectUniqueId: CryptBitBlob = CryptBitBlob(),
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CertIssuerSerialNumber(
    public var issuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertKeygenRequestInfo(
    public var dwVersion: UInt = 0u,
    public var subjectPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
    public var pwszChallengeString: Pwstr = null,
)

public data class CertKeyAttributesInfo(
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var intendedKeyUsage: CryptBitBlob = CryptBitBlob(),
    public var pPrivateKeyUsagePeriod: CertPrivateKeyValidity? = null,
)

public data class CertKeyContext(
    public var cbSize: UInt = 0u,
    public var anonymous: CertKeyContext0 = CertKeyContext0(),
    public var dwKeySpec: UInt = 0u,
)

public data class CertKeyContext0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CertKeyUsageRestrictionInfo(
    public var cCertPolicyId: UInt = 0u,
    public var rgCertPolicyId: CertPolicyId? = null,
    public var restrictedKeyUsage: CryptBitBlob = CryptBitBlob(),
)

public data class CertLdapStoreOpenedPara(
    public var pvLdapSessionHandle: COpaquePointer? = null,
    public var pwszLdapUrl: Pcwstr = null,
)

public data class CertLogotypeAudio(
    public var logotypeDetails: CertLogotypeDetails = CertLogotypeDetails(),
    public var pLogotypeAudioInfo: CertLogotypeAudioInfo? = null,
)

public data class CertLogotypeAudioInfo(
    public var dwFileSize: UInt = 0u,
    public var dwPlayTime: UInt = 0u,
    public var dwChannels: UInt = 0u,
    public var dwSampleRate: UInt = 0u,
    public var pwszLanguage: Pwstr = null,
)

public data class CertLogotypeData(
    public var cLogotypeImage: UInt = 0u,
    public var rgLogotypeImage: CertLogotypeImage? = null,
    public var cLogotypeAudio: UInt = 0u,
    public var rgLogotypeAudio: CertLogotypeAudio? = null,
)

public data class CertLogotypeDetails(
    public var pwszMimeType: Pwstr = null,
    public var cHashedUrl: UInt = 0u,
    public var rgHashedUrl: CertHashedUrl? = null,
)

public data class CertLogotypeExtInfo(
    public var cCommunityLogo: UInt = 0u,
    public var rgCommunityLogo: CertLogotypeInfo? = null,
    public var pIssuerLogo: CertLogotypeInfo? = null,
    public var pSubjectLogo: CertLogotypeInfo? = null,
    public var cOtherLogo: UInt = 0u,
    public var rgOtherLogo: CertOtherLogotypeInfo? = null,
)

public data class CertLogotypeImage(
    public var logotypeDetails: CertLogotypeDetails = CertLogotypeDetails(),
    public var pLogotypeImageInfo: CertLogotypeImageInfo? = null,
)

public data class CertLogotypeImageInfo(
    public var dwLogotypeImageInfoChoice: CertLogotypeImageInfoType = 0u,
    public var dwFileSize: UInt = 0u,
    public var dwXSize: UInt = 0u,
    public var dwYSize: UInt = 0u,
    public var dwLogotypeImageResolutionChoice: CertLogotypeChoice = 0u,
    public var anonymous: CertLogotypeImageInfo0 = CertLogotypeImageInfo0(),
    public var pwszLanguage: Pwstr = null,
)

public data class CertLogotypeImageInfo0(
    public var dwNumBits: UInt = 0u,
    public var dwTableSize: UInt = 0u,
)

public data class CertLogotypeInfo(
    public var dwLogotypeInfoChoice: CertLogotypeOption = 0u,
    public var anonymous: CertLogotypeInfo0 = CertLogotypeInfo0(),
)

public data class CertLogotypeInfo0(
    public var pLogotypeDirectInfo: CertLogotypeData? = null,
    public var pLogotypeIndirectInfo: CertLogotypeReference? = null,
)

public data class CertLogotypeReference(
    public var cHashedUrl: UInt = 0u,
    public var rgHashedUrl: CertHashedUrl? = null,
)

public data class CertNameConstraintsInfo(
    public var cPermittedSubtree: UInt = 0u,
    public var rgPermittedSubtree: CertGeneralSubtree? = null,
    public var cExcludedSubtree: UInt = 0u,
    public var rgExcludedSubtree: CertGeneralSubtree? = null,
)

public data class CertNameInfo(
    public var cRDN: UInt = 0u,
    public var rgRDN: CertRdn? = null,
)

public data class CertNameValue(
    public var dwValueType: UInt = 0u,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertOrCrlBlob(
    public var dwChoice: UInt = 0u,
    public var cbEncoded: UInt = 0u,
    public var pbEncoded: COpaquePointer? = null,
)

public data class CertOrCrlBundle(
    public var cItem: UInt = 0u,
    public var rgItem: CertOrCrlBlob? = null,
)

public data class CertOtherLogotypeInfo(
    public var pszObjId: Pstr = null,
    public var logotypeInfo: CertLogotypeInfo = CertLogotypeInfo(),
)

public data class CertOtherName(
    public var pszObjId: Pstr = null,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertPair(
    public var forward: CryptIntegerBlob = CryptIntegerBlob(),
    public var reverse: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertPhysicalStoreInfo(
    public var cbSize: UInt = 0u,
    public var pszOpenStoreProvider: Pstr = null,
    public var dwOpenEncodingType: UInt = 0u,
    public var dwOpenFlags: UInt = 0u,
    public var openParameters: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwFlags: UInt = 0u,
    public var dwPriority: UInt = 0u,
)

public data class CertPoliciesInfo(
    public var cPolicyInfo: UInt = 0u,
    public var rgPolicyInfo: CertPolicyInfo? = null,
)

public data class CertPolicy95Qualifier1(
    public var pszPracticesReference: Pwstr = null,
    public var pszNoticeIdentifier: Pstr = null,
    public var pszNSINoticeIdentifier: Pstr = null,
    public var cCPSURLs: UInt = 0u,
    public var rgCPSURLs: CpsUrls? = null,
)

public data class CertPolicyConstraintsInfo(
    public var fRequireExplicitPolicy: Bool = 0,
    public var dwRequireExplicitPolicySkipCerts: UInt = 0u,
    public var fInhibitPolicyMapping: Bool = 0,
    public var dwInhibitPolicyMappingSkipCerts: UInt = 0u,
)

public data class CertPolicyId(
    public var cCertPolicyElementId: UInt = 0u,
    public var rgpszCertPolicyElementId: Pstr? = null,
)

public data class CertPolicyInfo(
    public var pszPolicyIdentifier: Pstr = null,
    public var cPolicyQualifier: UInt = 0u,
    public var rgPolicyQualifier: CertPolicyQualifierInfo? = null,
)

public data class CertPolicyMapping(
    public var pszIssuerDomainPolicy: Pstr = null,
    public var pszSubjectDomainPolicy: Pstr = null,
)

public data class CertPolicyMappingsInfo(
    public var cPolicyMapping: UInt = 0u,
    public var rgPolicyMapping: CertPolicyMapping? = null,
)

public data class CertPolicyQualifierInfo(
    public var pszPolicyQualifierId: Pstr = null,
    public var qualifier: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertPolicyQualifierNoticeReference(
    public var pszOrganization: Pstr = null,
    public var cNoticeNumbers: UInt = 0u,
    public var rgNoticeNumbers: Int? = null,
)

public data class CertPolicyQualifierUserNotice(
    public var pNoticeReference: CertPolicyQualifierNoticeReference? = null,
    public var pszDisplayText: Pwstr = null,
)

public data class CertPrivateKeyValidity(
    public var notBefore: Filetime = Filetime(),
    public var notAfter: Filetime = Filetime(),
)

public data class CertPublicKeyInfo(
    public var algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var publicKey: CryptBitBlob = CryptBitBlob(),
)

public data class CertQcStatement(
    public var pszStatementId: Pstr = null,
    public var statementInfo: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertQcStatementsExtInfo(
    public var cStatement: UInt = 0u,
    public var rgStatement: CertQcStatement? = null,
)

public data class CertRdn(
    public var cRDNAttr: UInt = 0u,
    public var rgRDNAttr: CertRdnAttr? = null,
)

public data class CertRdnAttr(
    public var pszObjId: Pstr = null,
    public var dwValueType: UInt = 0u,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CertRegistryStoreClientGptPara(
    public var hKeyBase: Hkey = null,
    public var pwszRegPath: Pwstr = null,
)

public data class CertRegistryStoreRoamingPara(
    public var hKey: Hkey = null,
    public var pwszStoreDirectory: Pwstr = null,
)

public data class CertRequestInfo(
    public var dwVersion: UInt = 0u,
    public var subject: CryptIntegerBlob = CryptIntegerBlob(),
    public var subjectPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
    public var cAttribute: UInt = 0u,
    public var rgAttribute: CryptAttribute? = null,
)

public data class CertRevocationChainPara(
    public var cbSize: UInt = 0u,
    public var hChainEngine: Hcertchainengine = null,
    public var hAdditionalStore: Hcertstore = null,
    public var dwChainFlags: UInt = 0u,
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var pftCurrentTime: Filetime? = null,
    public var pftCacheResync: Filetime? = null,
    public var cbMaxUrlRetrievalByteCount: UInt = 0u,
)

public data class CertRevocationCrlInfo(
    public var cbSize: UInt = 0u,
    public var pBaseCrlContext: CrlContext? = null,
    public var pDeltaCrlContext: CrlContext? = null,
    public var pCrlEntry: CrlEntry? = null,
    public var fDeltaCrlEntry: Bool = 0,
)

public data class CertRevocationInfo(
    public var cbSize: UInt = 0u,
    public var dwRevocationResult: UInt = 0u,
    public var pszRevocationOid: Pcstr = null,
    public var pvOidSpecificInfo: COpaquePointer? = null,
    public var fHasFreshnessTime: Bool = 0,
    public var dwFreshnessTime: UInt = 0u,
    public var pCrlInfo: CertRevocationCrlInfo? = null,
)

public data class CertRevocationPara(
    public var cbSize: UInt = 0u,
    public var pIssuerCert: CertContext? = null,
    public var cCertStore: UInt = 0u,
    public var rgCertStore: COpaquePointer? = null,
    public var hCrlStore: Hcertstore = null,
    public var pftTimeToUse: Filetime? = null,
)

public data class CertRevocationStatus(
    public var cbSize: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwReason: CertRevocationStatusReason = 0u,
    public var fHasFreshnessTime: Bool = 0,
    public var dwFreshnessTime: UInt = 0u,
)

public data class CertSelectChainPara(
    public var hChainEngine: Hcertchainengine = null,
    public var pTime: Filetime? = null,
    public var hAdditionalStore: Hcertstore = null,
    public var pChainPara: CertChainPara? = null,
    public var dwFlags: UInt = 0u,
)

public data class CertSelectCriteria(
    public var dwType: CertSelectCriteriaType = 0u,
    public var cPara: UInt = 0u,
    public var ppPara: COpaquePointer? = null,
)

public data class CertServerOcspResponseContext(
    public var cbSize: UInt = 0u,
    public var pbEncodedOcspResponse: COpaquePointer? = null,
    public var cbEncodedOcspResponse: UInt = 0u,
)

public data class CertServerOcspResponseOpenPara(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pcbUsedSize: UInt? = null,
    public var pwszOcspDirectory: Pwstr = null,
    public var pfnUpdateCallback: PfnCertServerOcspResponseUpdateCallback = null,
    public var pvUpdateCallbackArg: COpaquePointer? = null,
)

public data class CertSignedContentInfo(
    public var toBeSigned: CryptIntegerBlob = CryptIntegerBlob(),
    public var signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var signature: CryptBitBlob = CryptBitBlob(),
)

public data class CertSimpleChain(
    public var cbSize: UInt = 0u,
    public var trustStatus: CertTrustStatus = CertTrustStatus(),
    public var cElement: UInt = 0u,
    public var rgpElement: COpaquePointer? = null,
    public var pTrustListInfo: CertTrustListInfo? = null,
    public var fHasRevocationFreshnessTime: Bool = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
)

public data class CertStoreProvFindInfo(
    public var cbSize: UInt = 0u,
    public var dwMsgAndCertEncodingType: UInt = 0u,
    public var dwFindFlags: UInt = 0u,
    public var dwFindType: UInt = 0u,
    public var pvFindPara: COpaquePointer? = null,
)

public data class CertStoreProvInfo(
    public var cbSize: UInt = 0u,
    public var cStoreProvFunc: UInt = 0u,
    public var rgpvStoreProvFunc: COpaquePointer? = null,
    public var hStoreProv: Hcertstoreprov = null,
    public var dwStoreProvFlags: CertStoreProvFlags = 0u,
    public var hStoreProvFuncAddr2: COpaquePointer? = null,
)

public data class CertStrongSignPara(
    public var cbSize: UInt = 0u,
    public var dwInfoChoice: UInt = 0u,
    public var anonymous: CertStrongSignPara0 = CertStrongSignPara0(),
)

public data class CertStrongSignPara0(
    public var pvInfo: COpaquePointer? = null,
    public var pSerializedInfo: CertStrongSignSerializedInfo? = null,
    public var pszOID: Pstr = null,
)

public data class CertStrongSignSerializedInfo(
    public var dwFlags: CertStrongSignFlags = 0u,
    public var pwszCNGSignHashAlgids: Pwstr = null,
    public var pwszCNGPubKeyMinBitLengths: Pwstr = null,
)

public data class CertSupportedAlgorithmInfo(
    public var algorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var intendedKeyUsage: CryptBitBlob = CryptBitBlob(),
    public var intendedCertPolicies: CertPoliciesInfo = CertPoliciesInfo(),
)

public data class CertSystemStoreInfo(
    public var cbSize: UInt = 0u,
)

public data class CertSystemStoreRelocatePara(
    public var anonymous1: CertSystemStoreRelocatePara0 = CertSystemStoreRelocatePara0(),
    public var anonymous2: CertSystemStoreRelocatePara1 = CertSystemStoreRelocatePara1(),
)

public data class CertSystemStoreRelocatePara0(
    public var hKeyBase: Hkey = null,
    public var pvBase: COpaquePointer? = null,
)

public data class CertSystemStoreRelocatePara1(
    public var pvSystemStore: COpaquePointer? = null,
    public var pszSystemStore: Pcstr = null,
    public var pwszSystemStore: Pcwstr = null,
)

public data class CertTemplateExt(
    public var pszObjId: Pstr = null,
    public var dwMajorVersion: UInt = 0u,
    public var fMinorVersion: Bool = 0,
    public var dwMinorVersion: UInt = 0u,
)

public data class CertTpmSpecificationInfo(
    public var pwszFamily: Pwstr = null,
    public var dwLevel: UInt = 0u,
    public var dwRevision: UInt = 0u,
)

public data class CertTrustListInfo(
    public var cbSize: UInt = 0u,
    public var pCtlEntry: CtlEntry? = null,
    public var pCtlContext: CtlContext? = null,
)

public data class CertTrustStatus(
    public var dwErrorStatus: UInt = 0u,
    public var dwInfoStatus: UInt = 0u,
)

public data class CertUsageMatch(
    public var dwType: UInt = 0u,
    public var usage: CtlUsage = CtlUsage(),
)

public data class CertX942DhParameters(
    public var p: CryptIntegerBlob = CryptIntegerBlob(),
    public var g: CryptIntegerBlob = CryptIntegerBlob(),
    public var q: CryptIntegerBlob = CryptIntegerBlob(),
    public var j: CryptIntegerBlob = CryptIntegerBlob(),
    public var pValidationParams: CertX942DhValidationParams? = null,
)

public data class CertX942DhValidationParams(
    public var seed: CryptBitBlob = CryptBitBlob(),
    public var pgenCounter: UInt = 0u,
)

public data class Claimlist(
    public var count: UInt = 0u,
    public var claims: Pcwstr? = null,
)

public data class ClmdPivCertData(
    public var dwVersion: UInt = 0u,
    public var dwCertTag: UInt = 0u,
    public var pbCert: COpaquePointer? = null,
    public var cbCert: UInt = 0u,
)

public data class ClmdPivGenerateAsymmetricKey(
    public var dwVersion: UInt = 0u,
    public var bAlgorithmId: UByte = 0u,
    public var bKeyId: UByte = 0u,
    public var pbKey: COpaquePointer? = null,
    public var cbKey: UInt = 0u,
)

public data class ClmdPivPublicKeyData(
    public var dwVersion: UInt = 0u,
    public var bKeyId: UByte = 0u,
    public var pbPublicKey: COpaquePointer? = null,
    public var cbPublicKey: UInt = 0u,
)

public data class CmcAddAttributesInfo(
    public var dwCmcDataReference: UInt = 0u,
    public var cCertReference: UInt = 0u,
    public var rgdwCertReference: UInt? = null,
    public var cAttribute: UInt = 0u,
    public var rgAttribute: CryptAttribute? = null,
)

public data class CmcAddExtensionsInfo(
    public var dwCmcDataReference: UInt = 0u,
    public var cCertReference: UInt = 0u,
    public var rgdwCertReference: UInt? = null,
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CmcDataInfo(
    public var cTaggedAttribute: UInt = 0u,
    public var rgTaggedAttribute: CmcTaggedAttribute? = null,
    public var cTaggedRequest: UInt = 0u,
    public var rgTaggedRequest: CmcTaggedRequest? = null,
    public var cTaggedContentInfo: UInt = 0u,
    public var rgTaggedContentInfo: CmcTaggedContentInfo? = null,
    public var cTaggedOtherMsg: UInt = 0u,
    public var rgTaggedOtherMsg: CmcTaggedOtherMsg? = null,
)

public data class CmcPendInfo(
    public var pendToken: CryptIntegerBlob = CryptIntegerBlob(),
    public var pendTime: Filetime = Filetime(),
)

public data class CmcResponseInfo(
    public var cTaggedAttribute: UInt = 0u,
    public var rgTaggedAttribute: CmcTaggedAttribute? = null,
    public var cTaggedContentInfo: UInt = 0u,
    public var rgTaggedContentInfo: CmcTaggedContentInfo? = null,
    public var cTaggedOtherMsg: UInt = 0u,
    public var rgTaggedOtherMsg: CmcTaggedOtherMsg? = null,
)

public data class CmcStatusInfo(
    public var dwStatus: UInt = 0u,
    public var cBodyList: UInt = 0u,
    public var rgdwBodyList: UInt? = null,
    public var pwszStatusString: Pwstr = null,
    public var dwOtherInfoChoice: UInt = 0u,
    public var anonymous: CmcStatusInfo0 = CmcStatusInfo0(),
)

public data class CmcStatusInfo0(
    public var dwFailInfo: UInt = 0u,
    public var pPendInfo: CmcPendInfo? = null,
)

public data class CmcTaggedAttribute(
    public var dwBodyPartID: UInt = 0u,
    public var attribute: CryptAttribute = CryptAttribute(),
)

public data class CmcTaggedCertRequest(
    public var dwBodyPartID: UInt = 0u,
    public var signedCertRequest: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CmcTaggedContentInfo(
    public var dwBodyPartID: UInt = 0u,
    public var encodedContentInfo: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CmcTaggedOtherMsg(
    public var dwBodyPartID: UInt = 0u,
    public var pszObjId: Pstr = null,
    public var value: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CmcTaggedRequest(
    public var dwTaggedRequestChoice: UInt = 0u,
    public var anonymous: CmcTaggedRequest0 = CmcTaggedRequest0(),
)

public data class CmcTaggedRequest0(
    public var pTaggedCertRequest: CmcTaggedCertRequest? = null,
)

public data class CmsgCmsRecipientInfo(
    public var dwRecipientChoice: UInt = 0u,
    public var anonymous: CmsgCmsRecipientInfo0 = CmsgCmsRecipientInfo0(),
)

public data class CmsgCmsRecipientInfo0(
    public var pKeyTrans: CmsgKeyTransRecipientInfo? = null,
    public var pKeyAgree: CmsgKeyAgreeRecipientInfo? = null,
    public var pMailList: CmsgMailListRecipientInfo? = null,
)

public data class CmsgCmsSignerInfo(
    public var dwVersion: UInt = 0u,
    public var signerId: CertId = CertId(),
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hashEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var authAttrs: CryptAttributes = CryptAttributes(),
    public var unauthAttrs: CryptAttributes = CryptAttributes(),
)

public data class CmsgCngContentDecryptInfo(
    public var cbSize: UInt = 0u,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pfnAlloc: PfnCmsgAlloc = null,
    public var pfnFree: PfnCmsgFree = null,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
    public var pbContentEncryptKey: COpaquePointer? = null,
    public var cbContentEncryptKey: UInt = 0u,
    public var hCNGContentEncryptKey: BcryptKeyHandle = null,
    public var pbCNGContentEncryptKeyObject: COpaquePointer? = null,
)

public data class CmsgContentEncryptInfo(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvEncryptionAuxInfo: COpaquePointer? = null,
    public var cRecipients: UInt = 0u,
    public var rgCmsRecipients: CmsgRecipientEncodeInfo? = null,
    public var pfnAlloc: PfnCmsgAlloc = null,
    public var pfnFree: PfnCmsgFree = null,
    public var dwEncryptFlags: UInt = 0u,
    public var anonymous: CmsgContentEncryptInfo0 = CmsgContentEncryptInfo0(),
    public var dwFlags: UInt = 0u,
    public var fCNG: Bool = 0,
    public var pbCNGContentEncryptKeyObject: COpaquePointer? = null,
    public var pbContentEncryptKey: COpaquePointer? = null,
    public var cbContentEncryptKey: UInt = 0u,
)

public data class CmsgContentEncryptInfo0(
    public var hContentEncryptKey: Int = 0,
    public var hCNGContentEncryptKey: BcryptKeyHandle = null,
)

public data class CmsgCtrlAddSignerUnauthAttrPara(
    public var cbSize: UInt = 0u,
    public var dwSignerIndex: UInt = 0u,
    public var blob: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CmsgCtrlDecryptPara(
    public var cbSize: UInt = 0u,
    public var anonymous: CmsgCtrlDecryptPara0 = CmsgCtrlDecryptPara0(),
    public var dwKeySpec: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
)

public data class CmsgCtrlDecryptPara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CmsgCtrlDelSignerUnauthAttrPara(
    public var cbSize: UInt = 0u,
    public var dwSignerIndex: UInt = 0u,
    public var dwUnauthAttrIndex: UInt = 0u,
)

public data class CmsgCtrlKeyAgreeDecryptPara(
    public var cbSize: UInt = 0u,
    public var anonymous: CmsgCtrlKeyAgreeDecryptPara0 = CmsgCtrlKeyAgreeDecryptPara0(),
    public var dwKeySpec: UInt = 0u,
    public var pKeyAgree: CmsgKeyAgreeRecipientInfo? = null,
    public var dwRecipientIndex: UInt = 0u,
    public var dwRecipientEncryptedKeyIndex: UInt = 0u,
    public var originatorPublicKey: CryptBitBlob = CryptBitBlob(),
)

public data class CmsgCtrlKeyAgreeDecryptPara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CmsgCtrlKeyTransDecryptPara(
    public var cbSize: UInt = 0u,
    public var anonymous: CmsgCtrlKeyTransDecryptPara0 = CmsgCtrlKeyTransDecryptPara0(),
    public var dwKeySpec: UInt = 0u,
    public var pKeyTrans: CmsgKeyTransRecipientInfo? = null,
    public var dwRecipientIndex: UInt = 0u,
)

public data class CmsgCtrlKeyTransDecryptPara0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CmsgCtrlMailListDecryptPara(
    public var cbSize: UInt = 0u,
    public var hCryptProv: Int = 0,
    public var pMailList: CmsgMailListRecipientInfo? = null,
    public var dwRecipientIndex: UInt = 0u,
    public var dwKeyChoice: UInt = 0u,
    public var anonymous: CmsgCtrlMailListDecryptPara0 = CmsgCtrlMailListDecryptPara0(),
)

public data class CmsgCtrlMailListDecryptPara0(
    public var hKeyEncryptionKey: Int = 0,
    public var pvKeyEncryptionKey: COpaquePointer? = null,
)

public data class CmsgCtrlVerifySignatureExPara(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var dwSignerIndex: UInt = 0u,
    public var dwSignerType: UInt = 0u,
    public var pvSigner: COpaquePointer? = null,
)

public data class CmsgEncryptedEncodeInfo(
    public var cbSize: UInt = 0u,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvEncryptionAuxInfo: COpaquePointer? = null,
)

public data class CmsgEnvelopedEncodeInfo(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var contentEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvEncryptionAuxInfo: COpaquePointer? = null,
    public var cRecipients: UInt = 0u,
    public var rgpRecipients: COpaquePointer? = null,
)

public data class CmsgHashedEncodeInfo(
    public var cbSize: UInt = 0u,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvHashAuxInfo: COpaquePointer? = null,
)

public data class CmsgKeyAgreeEncryptInfo(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var userKeyingMaterial: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwOriginatorChoice: CmsgKeyAgreeOriginator = 0u,
    public var anonymous: CmsgKeyAgreeEncryptInfo0 = CmsgKeyAgreeEncryptInfo0(),
    public var cKeyAgreeKeyEncryptInfo: UInt = 0u,
    public var rgpKeyAgreeKeyEncryptInfo: COpaquePointer? = null,
    public var dwFlags: UInt = 0u,
)

public data class CmsgKeyAgreeEncryptInfo0(
    public var originatorCertId: CertId = CertId(),
    public var originatorPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
)

public data class CmsgKeyAgreeKeyEncryptInfo(
    public var cbSize: UInt = 0u,
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CmsgKeyAgreeRecipientEncodeInfo(
    public var cbSize: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvKeyEncryptionAuxInfo: COpaquePointer? = null,
    public var keyWrapAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvKeyWrapAuxInfo: COpaquePointer? = null,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var dwKeySpec: UInt = 0u,
    public var dwKeyChoice: CmsgKeyAgreeOption = 0u,
    public var anonymous: CmsgKeyAgreeRecipientEncodeInfo0 = CmsgKeyAgreeRecipientEncodeInfo0(),
    public var userKeyingMaterial: CryptIntegerBlob = CryptIntegerBlob(),
    public var cRecipientEncryptedKeys: UInt = 0u,
    public var rgpRecipientEncryptedKeys: COpaquePointer? = null,
)

public data class CmsgKeyAgreeRecipientEncodeInfo0(
    public var pEphemeralAlgorithm: CryptAlgorithmIdentifier? = null,
    public var pSenderId: CertId? = null,
)

public data class CmsgKeyAgreeRecipientInfo(
    public var dwVersion: UInt = 0u,
    public var dwOriginatorChoice: CmsgKeyAgreeOriginator = 0u,
    public var anonymous: CmsgKeyAgreeRecipientInfo0 = CmsgKeyAgreeRecipientInfo0(),
    public var userKeyingMaterial: CryptIntegerBlob = CryptIntegerBlob(),
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var cRecipientEncryptedKeys: UInt = 0u,
    public var rgpRecipientEncryptedKeys: COpaquePointer? = null,
)

public data class CmsgKeyAgreeRecipientInfo0(
    public var originatorCertId: CertId = CertId(),
    public var originatorPublicKeyInfo: CertPublicKeyInfo = CertPublicKeyInfo(),
)

public data class CmsgKeyTransEncryptInfo(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwFlags: UInt = 0u,
)

public data class CmsgKeyTransRecipientEncodeInfo(
    public var cbSize: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvKeyEncryptionAuxInfo: COpaquePointer? = null,
    public var hCryptProv: HcryptprovLegacy = 0uL,
    public var recipientPublicKey: CryptBitBlob = CryptBitBlob(),
    public var recipientId: CertId = CertId(),
)

public data class CmsgKeyTransRecipientInfo(
    public var dwVersion: UInt = 0u,
    public var recipientId: CertId = CertId(),
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class CmsgMailListEncryptInfo(
    public var cbSize: UInt = 0u,
    public var dwRecipientIndex: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var dwFlags: UInt = 0u,
)

public data class CmsgMailListRecipientEncodeInfo(
    public var cbSize: UInt = 0u,
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvKeyEncryptionAuxInfo: COpaquePointer? = null,
    public var hCryptProv: Int = 0,
    public var dwKeyChoice: UInt = 0u,
    public var anonymous: CmsgMailListRecipientEncodeInfo0 = CmsgMailListRecipientEncodeInfo0(),
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var date: Filetime = Filetime(),
    public var pOtherAttr: CryptAttributeTypeValue? = null,
)

public data class CmsgMailListRecipientEncodeInfo0(
    public var hKeyEncryptionKey: Int = 0,
    public var pvKeyEncryptionKey: COpaquePointer? = null,
)

public data class CmsgMailListRecipientInfo(
    public var dwVersion: UInt = 0u,
    public var keyId: CryptIntegerBlob = CryptIntegerBlob(),
    public var keyEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var date: Filetime = Filetime(),
    public var pOtherAttr: CryptAttributeTypeValue? = null,
)

public data class CmsgRc2AuxInfo(
    public var cbSize: UInt = 0u,
    public var dwBitLen: UInt = 0u,
)

public data class CmsgRc4AuxInfo(
    public var cbSize: UInt = 0u,
    public var dwBitLen: UInt = 0u,
)

public data class CmsgRecipientEncodeInfo(
    public var dwRecipientChoice: UInt = 0u,
    public var anonymous: CmsgRecipientEncodeInfo0 = CmsgRecipientEncodeInfo0(),
)

public data class CmsgRecipientEncodeInfo0(
    public var pKeyTrans: CmsgKeyTransRecipientEncodeInfo? = null,
    public var pKeyAgree: CmsgKeyAgreeRecipientEncodeInfo? = null,
    public var pMailList: CmsgMailListRecipientEncodeInfo? = null,
)

public data class CmsgRecipientEncryptedKeyEncodeInfo(
    public var cbSize: UInt = 0u,
    public var recipientPublicKey: CryptBitBlob = CryptBitBlob(),
    public var recipientId: CertId = CertId(),
    public var date: Filetime = Filetime(),
    public var pOtherAttr: CryptAttributeTypeValue? = null,
)

public data class CmsgRecipientEncryptedKeyInfo(
    public var recipientId: CertId = CertId(),
    public var encryptedKey: CryptIntegerBlob = CryptIntegerBlob(),
    public var date: Filetime = Filetime(),
    public var pOtherAttr: CryptAttributeTypeValue? = null,
)

public data class CmsgSignedAndEnvelopedEncodeInfo(
    public var cbSize: UInt = 0u,
    public var signedInfo: CmsgSignedEncodeInfo = CmsgSignedEncodeInfo(),
    public var envelopedInfo: CmsgEnvelopedEncodeInfo = CmsgEnvelopedEncodeInfo(),
)

public data class CmsgSignedEncodeInfo(
    public var cbSize: UInt = 0u,
    public var cSigners: UInt = 0u,
    public var rgSigners: CmsgSignerEncodeInfo? = null,
    public var cCertEncoded: UInt = 0u,
    public var rgCertEncoded: CryptIntegerBlob? = null,
    public var cCrlEncoded: UInt = 0u,
    public var rgCrlEncoded: CryptIntegerBlob? = null,
)

public data class CmsgSignerEncodeInfo(
    public var cbSize: UInt = 0u,
    public var pCertInfo: CertInfo? = null,
    public var anonymous: CmsgSignerEncodeInfo0 = CmsgSignerEncodeInfo0(),
    public var dwKeySpec: UInt = 0u,
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var pvHashAuxInfo: COpaquePointer? = null,
    public var cAuthAttr: UInt = 0u,
    public var rgAuthAttr: CryptAttribute? = null,
    public var cUnauthAttr: UInt = 0u,
    public var rgUnauthAttr: CryptAttribute? = null,
)

public data class CmsgSignerEncodeInfo0(
    public var hCryptProv: Int = 0,
    public var hNCryptKey: NcryptKeyHandle = 0uL,
)

public data class CmsgSignerInfo(
    public var dwVersion: UInt = 0u,
    public var issuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
    public var hashAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var hashEncryptionAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var encryptedHash: CryptIntegerBlob = CryptIntegerBlob(),
    public var authAttrs: CryptAttributes = CryptAttributes(),
    public var unauthAttrs: CryptAttributes = CryptAttributes(),
)

public data class CmsgSp3CompatibleAuxInfo(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class CmsgStreamInfo(
    public var cbContent: UInt = 0u,
    public var pfnStreamOutput: PfnCmsgStreamOutput = null,
    public var pvArg: COpaquePointer? = null,
)

public data class CmsDhKeyInfo(
    public var dwVersion: UInt = 0u,
    public var algid: AlgId = 0u,
    public var pszContentEncObjId: Pstr = null,
    public var pubInfo: CryptIntegerBlob = CryptIntegerBlob(),
    public var pReserved: COpaquePointer? = null,
)

public data class CmsKeyInfo(
    public var dwVersion: UInt = 0u,
    public var algid: AlgId = 0u,
    public var pbOID: COpaquePointer? = null,
    public var cbOID: UInt = 0u,
)

public data class ContainerInfo(
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var cbSigPublicKey: UInt = 0u,
    public var pbSigPublicKey: COpaquePointer? = null,
    public var cbKeyExPublicKey: UInt = 0u,
    public var pbKeyExPublicKey: COpaquePointer? = null,
)

public data class ContainerMapRecord(
    public var wszGuid: UShortArray = UShortArray(40),
    public var bFlags: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wSigKeySizeBits: UShort = 0u,
    public var wKeyExchangeKeySizeBits: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContainerMapRecord) return false
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

public data class CpsUrls(
    public var pszURL: Pwstr = null,
    public var pAlgorithm: CryptAlgorithmIdentifier? = null,
    public var pDigest: CryptIntegerBlob? = null,
)

public data class CrlContext(
    public var dwCertEncodingType: CertQueryEncodingType = 0u,
    public var pbCrlEncoded: COpaquePointer? = null,
    public var cbCrlEncoded: UInt = 0u,
    public var pCrlInfo: CrlInfo? = null,
    public var hCertStore: Hcertstore = null,
)

public data class CrlDistPoint(
    public var distPointName: CrlDistPointName = CrlDistPointName(),
    public var reasonFlags: CryptBitBlob = CryptBitBlob(),
    public var cRLIssuer: CertAltNameInfo = CertAltNameInfo(),
)

public data class CrlDistPointsInfo(
    public var cDistPoint: UInt = 0u,
    public var rgDistPoint: CrlDistPoint? = null,
)

public data class CrlDistPointName(
    public var dwDistPointNameChoice: UInt = 0u,
    public var anonymous: CrlDistPointName0 = CrlDistPointName0(),
)

public data class CrlDistPointName0(
    public var fullName: CertAltNameInfo = CertAltNameInfo(),
)

public data class CrlEntry(
    public var serialNumber: CryptIntegerBlob = CryptIntegerBlob(),
    public var revocationDate: Filetime = Filetime(),
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CrlFindIssuedForPara(
    public var pSubjectCert: CertContext? = null,
    public var pIssuerCert: CertContext? = null,
)

public data class CrlInfo(
    public var dwVersion: UInt = 0u,
    public var signatureAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var issuer: CryptIntegerBlob = CryptIntegerBlob(),
    public var thisUpdate: Filetime = Filetime(),
    public var nextUpdate: Filetime = Filetime(),
    public var cCRLEntry: UInt = 0u,
    public var rgCRLEntry: CrlEntry? = null,
    public var cExtension: UInt = 0u,
    public var rgExtension: CertExtension? = null,
)

public data class CrlIssuingDistPoint(
    public var distPointName: CrlDistPointName = CrlDistPointName(),
    public var fOnlyContainsUserCerts: Bool = 0,
    public var fOnlyContainsCACerts: Bool = 0,
    public var onlySomeReasonFlags: CryptBitBlob = CryptBitBlob(),
    public var fIndirectCRL: Bool = 0,
)

public data class CrlRevocationInfo(
    public var pCrlEntry: CrlEntry? = null,
    public var pCrlContext: CrlContext? = null,
    public var pCrlIssuerChain: CertChainContext? = null,
)

public data class CrossCertDistPointsInfo(
    public var dwSyncDeltaTime: UInt = 0u,
    public var cDistPoint: UInt = 0u,
    public var rgDistPoint: CertAltNameInfo? = null,
)

public data class CryptnetUrlCacheFlushInfo(
    public var cbSize: UInt = 0u,
    public var dwExemptSeconds: UInt = 0u,
    public var expireTime: Filetime = Filetime(),
)

public data class CryptnetUrlCachePreFetchInfo(
    public var cbSize: UInt = 0u,
    public var dwObjectType: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var thisUpdateTime: Filetime = Filetime(),
    public var nextUpdateTime: Filetime = Filetime(),
    public var publishTime: Filetime = Filetime(),
)

public data class CryptnetUrlCacheResponseInfo(
    public var cbSize: UInt = 0u,
    public var wResponseType: UShort = 0u,
    public var wResponseFlags: UShort = 0u,
    public var lastModifiedTime: Filetime = Filetime(),
    public var dwMaxAge: UInt = 0u,
    public var pwszETag: Pcwstr = null,
    public var dwProxyId: UInt = 0u,
)

public data class CryptprotectPromptstruct(
    public var cbSize: UInt = 0u,
    public var dwPromptFlags: UInt = 0u,
    public var hwndApp: Hwnd = null,
    public var szPrompt: Pcwstr = null,
)

public data class Crypt3desKeyState(
    public var key: UByteArray = UByteArray(24),
    public var iv: UByteArray = UByteArray(8),
    public var feedback: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Crypt3desKeyState) return false
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

public data class CryptAes128KeyState(
    public var key: UByteArray = UByteArray(16),
    public var iv: UByteArray = UByteArray(16),
    public var encryptionState: UByteArray = UByteArray(176),
    public var decryptionState: UByteArray = UByteArray(176),
    public var feedback: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAes128KeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.encryptionState.contentEquals(other.encryptionState)) return false
        if (!this.decryptionState.contentEquals(other.decryptionState)) return false
        if (!this.feedback.contentEquals(other.feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.encryptionState.contentHashCode()
        result = 31 * result + this.decryptionState.contentHashCode()
        result = 31 * result + this.feedback.contentHashCode()
        return result
    }
}

public data class CryptAes256KeyState(
    public var key: UByteArray = UByteArray(32),
    public var iv: UByteArray = UByteArray(16),
    public var encryptionState: UByteArray = UByteArray(240),
    public var decryptionState: UByteArray = UByteArray(240),
    public var feedback: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptAes256KeyState) return false
        if (!this.key.contentEquals(other.key)) return false
        if (!this.iv.contentEquals(other.iv)) return false
        if (!this.encryptionState.contentEquals(other.encryptionState)) return false
        if (!this.decryptionState.contentEquals(other.decryptionState)) return false
        if (!this.feedback.contentEquals(other.feedback)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.contentHashCode()
        result = 31 * result + this.iv.contentHashCode()
        result = 31 * result + this.encryptionState.contentHashCode()
        result = 31 * result + this.decryptionState.contentHashCode()
        result = 31 * result + this.feedback.contentHashCode()
        return result
    }
}

public data class CryptAlgorithmIdentifier(
    public var pszObjId: Pstr = null,
    public var parameters: CryptIntegerBlob = CryptIntegerBlob(),
)
