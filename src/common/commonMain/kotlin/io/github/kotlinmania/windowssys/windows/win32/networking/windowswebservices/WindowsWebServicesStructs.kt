package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.NcryptKeyHandle

public class CtapcborHybridStorageLinkedData internal constructor(
    public var dwVersion: UInt,
    public var cbContactId: UInt,
    pbContactIdCtorArg: MutPtr<UByte>,
    public var cbLinkId: UInt,
    pbLinkIdCtorArg: MutPtr<UByte>,
    public var cbLinkSecret: UInt,
    pbLinkSecretCtorArg: MutPtr<UByte>,
    public var cbPublicKey: UInt,
    pbPublicKeyCtorArg: MutPtr<UByte>,
    pwszAuthenticatorNameCtorArg: Pcwstr,
    public var wEncodedTunnelServerDomain: UShort,
) {
    public var pbContactId: MutPtr<UByte> = pbContactIdCtorArg
        internal set

    public var pbLinkId: MutPtr<UByte> = pbLinkIdCtorArg
        internal set

    public var pbLinkSecret: MutPtr<UByte> = pbLinkSecretCtorArg
        internal set

    public var pbPublicKey: MutPtr<UByte> = pbPublicKeyCtorArg
        internal set

    public var pwszAuthenticatorName: Pcwstr = pwszAuthenticatorNameCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbContactId = 0u,
        pbContactIdCtorArg = MutPtr(0L),
        cbLinkId = 0u,
        pbLinkIdCtorArg = MutPtr(0L),
        cbLinkSecret = 0u,
        pbLinkSecretCtorArg = MutPtr(0L),
        cbPublicKey = 0u,
        pbPublicKeyCtorArg = MutPtr(0L),
        pwszAuthenticatorNameCtorArg = ConstPtr(0L),
        wEncodedTunnelServerDomain = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbContactId

    public operator fun component3(): MutPtr<UByte> = this.pbContactId

    public operator fun component4(): UInt = this.cbLinkId

    public operator fun component5(): MutPtr<UByte> = this.pbLinkId

    public operator fun component6(): UInt = this.cbLinkSecret

    public operator fun component7(): MutPtr<UByte> = this.pbLinkSecret

    public operator fun component8(): UInt = this.cbPublicKey

    public operator fun component9(): MutPtr<UByte> = this.pbPublicKey

    public operator fun component10(): Pcwstr = this.pwszAuthenticatorName

    public operator fun component11(): UShort = this.wEncodedTunnelServerDomain

    public fun copy(dwVersion: UInt = this.dwVersion, cbContactId: UInt = this.cbContactId, pbContactId: MutPtr<UByte> = this.pbContactId, cbLinkId: UInt = this.cbLinkId, pbLinkId: MutPtr<UByte> = this.pbLinkId, cbLinkSecret: UInt = this.cbLinkSecret, pbLinkSecret: MutPtr<UByte> = this.pbLinkSecret, cbPublicKey: UInt = this.cbPublicKey, pbPublicKey: MutPtr<UByte> = this.pbPublicKey, pwszAuthenticatorName: Pcwstr = this.pwszAuthenticatorName, wEncodedTunnelServerDomain: UShort = this.wEncodedTunnelServerDomain): CtapcborHybridStorageLinkedData = CtapcborHybridStorageLinkedData(dwVersion = dwVersion, cbContactId = cbContactId, pbContactIdCtorArg = pbContactId, cbLinkId = cbLinkId, pbLinkIdCtorArg = pbLinkId, cbLinkSecret = cbLinkSecret, pbLinkSecretCtorArg = pbLinkSecret, cbPublicKey = cbPublicKey, pbPublicKeyCtorArg = pbPublicKey, pwszAuthenticatorNameCtorArg = pwszAuthenticatorName, wEncodedTunnelServerDomain = wEncodedTunnelServerDomain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtapcborHybridStorageLinkedData) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbContactId != other.cbContactId) return false
        if (this.pbContactId != other.pbContactId) return false
        if (this.cbLinkId != other.cbLinkId) return false
        if (this.pbLinkId != other.pbLinkId) return false
        if (this.cbLinkSecret != other.cbLinkSecret) return false
        if (this.pbLinkSecret != other.pbLinkSecret) return false
        if (this.cbPublicKey != other.cbPublicKey) return false
        if (this.pbPublicKey != other.pbPublicKey) return false
        if (this.pwszAuthenticatorName != other.pwszAuthenticatorName) return false
        if (this.wEncodedTunnelServerDomain != other.wEncodedTunnelServerDomain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbContactId.hashCode()
        result = 31 * result + this.pbContactId.hashCode()
        result = 31 * result + this.cbLinkId.hashCode()
        result = 31 * result + this.pbLinkId.hashCode()
        result = 31 * result + this.cbLinkSecret.hashCode()
        result = 31 * result + this.pbLinkSecret.hashCode()
        result = 31 * result + this.cbPublicKey.hashCode()
        result = 31 * result + this.pbPublicKey.hashCode()
        result = 31 * result + this.pwszAuthenticatorName.hashCode()
        result = 31 * result + this.wEncodedTunnelServerDomain.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbContactId: UInt = 0u,
            pbContactId: MutPtr<UByte> = MutPtr(0L),
            cbLinkId: UInt = 0u,
            pbLinkId: MutPtr<UByte> = MutPtr(0L),
            cbLinkSecret: UInt = 0u,
            pbLinkSecret: MutPtr<UByte> = MutPtr(0L),
            cbPublicKey: UInt = 0u,
            pbPublicKey: MutPtr<UByte> = MutPtr(0L),
            pwszAuthenticatorName: Pcwstr = ConstPtr(0L),
            wEncodedTunnelServerDomain: UShort = 0u,
        ): CtapcborHybridStorageLinkedData =
            CtapcborHybridStorageLinkedData(
                dwVersion = dwVersion,
                cbContactId = cbContactId,
                pbContactIdCtorArg = pbContactId,
                cbLinkId = cbLinkId,
                pbLinkIdCtorArg = pbLinkId,
                cbLinkSecret = cbLinkSecret,
                pbLinkSecretCtorArg = pbLinkSecret,
                cbPublicKey = cbPublicKey,
                pbPublicKeyCtorArg = pbPublicKey,
                pwszAuthenticatorNameCtorArg = pwszAuthenticatorName,
                wEncodedTunnelServerDomain = wEncodedTunnelServerDomain,
            )
    }
}

public class WebauthnAssertion internal constructor(
    public var dwVersion: UInt,
    public var cbAuthenticatorData: UInt,
    pbAuthenticatorDataCtorArg: MutPtr<UByte>,
    public var cbSignature: UInt,
    pbSignatureCtorArg: MutPtr<UByte>,
    public var credential: WebauthnCredential,
    public var cbUserId: UInt,
    pbUserIdCtorArg: MutPtr<UByte>,
    public var extensions: WebauthnExtensions,
    public var cbCredLargeBlob: UInt,
    pbCredLargeBlobCtorArg: MutPtr<UByte>,
    public var dwCredLargeBlobStatus: UInt,
    pHmacSecretCtorArg: MutPtr<WebauthnHmacSecretSalt>,
    public var dwUsedTransport: UInt,
    public var cbUnsignedExtensionOutputs: UInt,
    pbUnsignedExtensionOutputsCtorArg: MutPtr<UByte>,
) {
    public var pbAuthenticatorData: MutPtr<UByte> = pbAuthenticatorDataCtorArg
        internal set

    public var pbSignature: MutPtr<UByte> = pbSignatureCtorArg
        internal set

    public var pbUserId: MutPtr<UByte> = pbUserIdCtorArg
        internal set

    public var pbCredLargeBlob: MutPtr<UByte> = pbCredLargeBlobCtorArg
        internal set

    public var pHmacSecret: MutPtr<WebauthnHmacSecretSalt> = pHmacSecretCtorArg
        internal set

    public var pbUnsignedExtensionOutputs: MutPtr<UByte> = pbUnsignedExtensionOutputsCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbAuthenticatorData = 0u,
        pbAuthenticatorDataCtorArg = MutPtr(0L),
        cbSignature = 0u,
        pbSignatureCtorArg = MutPtr(0L),
        credential = WebauthnCredential(),
        cbUserId = 0u,
        pbUserIdCtorArg = MutPtr(0L),
        extensions = WebauthnExtensions(),
        cbCredLargeBlob = 0u,
        pbCredLargeBlobCtorArg = MutPtr(0L),
        dwCredLargeBlobStatus = 0u,
        pHmacSecretCtorArg = MutPtr(0L),
        dwUsedTransport = 0u,
        cbUnsignedExtensionOutputs = 0u,
        pbUnsignedExtensionOutputsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbAuthenticatorData

    public operator fun component3(): MutPtr<UByte> = this.pbAuthenticatorData

    public operator fun component4(): UInt = this.cbSignature

    public operator fun component5(): MutPtr<UByte> = this.pbSignature

    public operator fun component6(): WebauthnCredential = this.credential

    public operator fun component7(): UInt = this.cbUserId

    public operator fun component8(): MutPtr<UByte> = this.pbUserId

    public operator fun component9(): WebauthnExtensions = this.extensions

    public operator fun component10(): UInt = this.cbCredLargeBlob

    public operator fun component11(): MutPtr<UByte> = this.pbCredLargeBlob

    public operator fun component12(): UInt = this.dwCredLargeBlobStatus

    public operator fun component13(): MutPtr<WebauthnHmacSecretSalt> = this.pHmacSecret

    public operator fun component14(): UInt = this.dwUsedTransport

    public operator fun component15(): UInt = this.cbUnsignedExtensionOutputs

    public operator fun component16(): MutPtr<UByte> = this.pbUnsignedExtensionOutputs

    public fun copy(dwVersion: UInt = this.dwVersion, cbAuthenticatorData: UInt = this.cbAuthenticatorData, pbAuthenticatorData: MutPtr<UByte> = this.pbAuthenticatorData, cbSignature: UInt = this.cbSignature, pbSignature: MutPtr<UByte> = this.pbSignature, credential: WebauthnCredential = this.credential, cbUserId: UInt = this.cbUserId, pbUserId: MutPtr<UByte> = this.pbUserId, extensions: WebauthnExtensions = this.extensions, cbCredLargeBlob: UInt = this.cbCredLargeBlob, pbCredLargeBlob: MutPtr<UByte> = this.pbCredLargeBlob, dwCredLargeBlobStatus: UInt = this.dwCredLargeBlobStatus, pHmacSecret: MutPtr<WebauthnHmacSecretSalt> = this.pHmacSecret, dwUsedTransport: UInt = this.dwUsedTransport, cbUnsignedExtensionOutputs: UInt = this.cbUnsignedExtensionOutputs, pbUnsignedExtensionOutputs: MutPtr<UByte> = this.pbUnsignedExtensionOutputs): WebauthnAssertion = WebauthnAssertion(dwVersion = dwVersion, cbAuthenticatorData = cbAuthenticatorData, pbAuthenticatorDataCtorArg = pbAuthenticatorData, cbSignature = cbSignature, pbSignatureCtorArg = pbSignature, credential = credential, cbUserId = cbUserId, pbUserIdCtorArg = pbUserId, extensions = extensions, cbCredLargeBlob = cbCredLargeBlob, pbCredLargeBlobCtorArg = pbCredLargeBlob, dwCredLargeBlobStatus = dwCredLargeBlobStatus, pHmacSecretCtorArg = pHmacSecret, dwUsedTransport = dwUsedTransport, cbUnsignedExtensionOutputs = cbUnsignedExtensionOutputs, pbUnsignedExtensionOutputsCtorArg = pbUnsignedExtensionOutputs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnAssertion) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbAuthenticatorData != other.cbAuthenticatorData) return false
        if (this.pbAuthenticatorData != other.pbAuthenticatorData) return false
        if (this.cbSignature != other.cbSignature) return false
        if (this.pbSignature != other.pbSignature) return false
        if (this.credential != other.credential) return false
        if (this.cbUserId != other.cbUserId) return false
        if (this.pbUserId != other.pbUserId) return false
        if (this.extensions != other.extensions) return false
        if (this.cbCredLargeBlob != other.cbCredLargeBlob) return false
        if (this.pbCredLargeBlob != other.pbCredLargeBlob) return false
        if (this.dwCredLargeBlobStatus != other.dwCredLargeBlobStatus) return false
        if (this.pHmacSecret != other.pHmacSecret) return false
        if (this.dwUsedTransport != other.dwUsedTransport) return false
        if (this.cbUnsignedExtensionOutputs != other.cbUnsignedExtensionOutputs) return false
        if (this.pbUnsignedExtensionOutputs != other.pbUnsignedExtensionOutputs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbAuthenticatorData.hashCode()
        result = 31 * result + this.pbAuthenticatorData.hashCode()
        result = 31 * result + this.cbSignature.hashCode()
        result = 31 * result + this.pbSignature.hashCode()
        result = 31 * result + this.credential.hashCode()
        result = 31 * result + this.cbUserId.hashCode()
        result = 31 * result + this.pbUserId.hashCode()
        result = 31 * result + this.extensions.hashCode()
        result = 31 * result + this.cbCredLargeBlob.hashCode()
        result = 31 * result + this.pbCredLargeBlob.hashCode()
        result = 31 * result + this.dwCredLargeBlobStatus.hashCode()
        result = 31 * result + this.pHmacSecret.hashCode()
        result = 31 * result + this.dwUsedTransport.hashCode()
        result = 31 * result + this.cbUnsignedExtensionOutputs.hashCode()
        result = 31 * result + this.pbUnsignedExtensionOutputs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbAuthenticatorData: UInt = 0u,
            pbAuthenticatorData: MutPtr<UByte> = MutPtr(0L),
            cbSignature: UInt = 0u,
            pbSignature: MutPtr<UByte> = MutPtr(0L),
            credential: WebauthnCredential = WebauthnCredential(),
            cbUserId: UInt = 0u,
            pbUserId: MutPtr<UByte> = MutPtr(0L),
            extensions: WebauthnExtensions = WebauthnExtensions(),
            cbCredLargeBlob: UInt = 0u,
            pbCredLargeBlob: MutPtr<UByte> = MutPtr(0L),
            dwCredLargeBlobStatus: UInt = 0u,
            pHmacSecret: MutPtr<WebauthnHmacSecretSalt> = MutPtr(0L),
            dwUsedTransport: UInt = 0u,
            cbUnsignedExtensionOutputs: UInt = 0u,
            pbUnsignedExtensionOutputs: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnAssertion =
            WebauthnAssertion(
                dwVersion = dwVersion,
                cbAuthenticatorData = cbAuthenticatorData,
                pbAuthenticatorDataCtorArg = pbAuthenticatorData,
                cbSignature = cbSignature,
                pbSignatureCtorArg = pbSignature,
                credential = credential,
                cbUserId = cbUserId,
                pbUserIdCtorArg = pbUserId,
                extensions = extensions,
                cbCredLargeBlob = cbCredLargeBlob,
                pbCredLargeBlobCtorArg = pbCredLargeBlob,
                dwCredLargeBlobStatus = dwCredLargeBlobStatus,
                pHmacSecretCtorArg = pHmacSecret,
                dwUsedTransport = dwUsedTransport,
                cbUnsignedExtensionOutputs = cbUnsignedExtensionOutputs,
                pbUnsignedExtensionOutputsCtorArg = pbUnsignedExtensionOutputs,
            )
    }
}

public class WebauthnAuthenticatorGetAssertionOptions internal constructor(
    public var dwVersion: UInt,
    public var dwTimeoutMilliseconds: UInt,
    public var credentialList: WebauthnCredentials,
    public var extensions: WebauthnExtensions,
    public var dwAuthenticatorAttachment: UInt,
    public var dwUserVerificationRequirement: UInt,
    public var dwFlags: UInt,
    pwszU2fAppIdCtorArg: Pcwstr,
    pbU2fAppIdCtorArg: MutPtr<Bool>,
    pCancellationIdCtorArg: MutPtr<Guid>,
    pAllowCredentialListCtorArg: MutPtr<WebauthnCredentialList>,
    public var dwCredLargeBlobOperation: UInt,
    public var cbCredLargeBlob: UInt,
    pbCredLargeBlobCtorArg: MutPtr<UByte>,
    pHmacSecretSaltValuesCtorArg: MutPtr<WebauthnHmacSecretSaltValues>,
    public var bBrowserInPrivateMode: Bool,
    pLinkedDeviceCtorArg: MutPtr<CtapcborHybridStorageLinkedData>,
    public var bAutoFill: Bool,
    public var cbJsonExt: UInt,
    pbJsonExtCtorArg: MutPtr<UByte>,
) {
    public var pwszU2fAppId: Pcwstr = pwszU2fAppIdCtorArg
        internal set

    public var pbU2fAppId: MutPtr<Bool> = pbU2fAppIdCtorArg
        internal set

    public var pCancellationId: MutPtr<Guid> = pCancellationIdCtorArg
        internal set

    public var pAllowCredentialList: MutPtr<WebauthnCredentialList> = pAllowCredentialListCtorArg
        internal set

    public var pbCredLargeBlob: MutPtr<UByte> = pbCredLargeBlobCtorArg
        internal set

    public var pHmacSecretSaltValues: MutPtr<WebauthnHmacSecretSaltValues> = pHmacSecretSaltValuesCtorArg
        internal set

    public var pLinkedDevice: MutPtr<CtapcborHybridStorageLinkedData> = pLinkedDeviceCtorArg
        internal set

    public var pbJsonExt: MutPtr<UByte> = pbJsonExtCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwTimeoutMilliseconds = 0u,
        credentialList = WebauthnCredentials(),
        extensions = WebauthnExtensions(),
        dwAuthenticatorAttachment = 0u,
        dwUserVerificationRequirement = 0u,
        dwFlags = 0u,
        pwszU2fAppIdCtorArg = ConstPtr(0L),
        pbU2fAppIdCtorArg = MutPtr(0L),
        pCancellationIdCtorArg = MutPtr(0L),
        pAllowCredentialListCtorArg = MutPtr(0L),
        dwCredLargeBlobOperation = 0u,
        cbCredLargeBlob = 0u,
        pbCredLargeBlobCtorArg = MutPtr(0L),
        pHmacSecretSaltValuesCtorArg = MutPtr(0L),
        bBrowserInPrivateMode = 0,
        pLinkedDeviceCtorArg = MutPtr(0L),
        bAutoFill = 0,
        cbJsonExt = 0u,
        pbJsonExtCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwTimeoutMilliseconds: UInt = 0u,
            credentialList: WebauthnCredentials = WebauthnCredentials(),
            extensions: WebauthnExtensions = WebauthnExtensions(),
            dwAuthenticatorAttachment: UInt = 0u,
            dwUserVerificationRequirement: UInt = 0u,
            dwFlags: UInt = 0u,
            pwszU2fAppId: Pcwstr = ConstPtr(0L),
            pbU2fAppId: MutPtr<Bool> = MutPtr(0L),
            pCancellationId: MutPtr<Guid> = MutPtr(0L),
            pAllowCredentialList: MutPtr<WebauthnCredentialList> = MutPtr(0L),
            dwCredLargeBlobOperation: UInt = 0u,
            cbCredLargeBlob: UInt = 0u,
            pbCredLargeBlob: MutPtr<UByte> = MutPtr(0L),
            pHmacSecretSaltValues: MutPtr<WebauthnHmacSecretSaltValues> = MutPtr(0L),
            bBrowserInPrivateMode: Bool = 0,
            pLinkedDevice: MutPtr<CtapcborHybridStorageLinkedData> = MutPtr(0L),
            bAutoFill: Bool = 0,
            cbJsonExt: UInt = 0u,
            pbJsonExt: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnAuthenticatorGetAssertionOptions =
            WebauthnAuthenticatorGetAssertionOptions(
                dwVersion = dwVersion,
                dwTimeoutMilliseconds = dwTimeoutMilliseconds,
                credentialList = credentialList,
                extensions = extensions,
                dwAuthenticatorAttachment = dwAuthenticatorAttachment,
                dwUserVerificationRequirement = dwUserVerificationRequirement,
                dwFlags = dwFlags,
                pwszU2fAppIdCtorArg = pwszU2fAppId,
                pbU2fAppIdCtorArg = pbU2fAppId,
                pCancellationIdCtorArg = pCancellationId,
                pAllowCredentialListCtorArg = pAllowCredentialList,
                dwCredLargeBlobOperation = dwCredLargeBlobOperation,
                cbCredLargeBlob = cbCredLargeBlob,
                pbCredLargeBlobCtorArg = pbCredLargeBlob,
                pHmacSecretSaltValuesCtorArg = pHmacSecretSaltValues,
                bBrowserInPrivateMode = bBrowserInPrivateMode,
                pLinkedDeviceCtorArg = pLinkedDevice,
                bAutoFill = bAutoFill,
                cbJsonExt = cbJsonExt,
                pbJsonExtCtorArg = pbJsonExt,
            )
    }
}

public class WebauthnAuthenticatorMakeCredentialOptions internal constructor(
    public var dwVersion: UInt,
    public var dwTimeoutMilliseconds: UInt,
    public var credentialList: WebauthnCredentials,
    public var extensions: WebauthnExtensions,
    public var dwAuthenticatorAttachment: UInt,
    public var bRequireResidentKey: Bool,
    public var dwUserVerificationRequirement: UInt,
    public var dwAttestationConveyancePreference: UInt,
    public var dwFlags: UInt,
    pCancellationIdCtorArg: MutPtr<Guid>,
    pExcludeCredentialListCtorArg: MutPtr<WebauthnCredentialList>,
    public var dwEnterpriseAttestation: UInt,
    public var dwLargeBlobSupport: UInt,
    public var bPreferResidentKey: Bool,
    public var bBrowserInPrivateMode: Bool,
    public var bEnablePrf: Bool,
    pLinkedDeviceCtorArg: MutPtr<CtapcborHybridStorageLinkedData>,
    public var cbJsonExt: UInt,
    pbJsonExtCtorArg: MutPtr<UByte>,
) {
    public var pCancellationId: MutPtr<Guid> = pCancellationIdCtorArg
        internal set

    public var pExcludeCredentialList: MutPtr<WebauthnCredentialList> = pExcludeCredentialListCtorArg
        internal set

    public var pLinkedDevice: MutPtr<CtapcborHybridStorageLinkedData> = pLinkedDeviceCtorArg
        internal set

    public var pbJsonExt: MutPtr<UByte> = pbJsonExtCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwTimeoutMilliseconds = 0u,
        credentialList = WebauthnCredentials(),
        extensions = WebauthnExtensions(),
        dwAuthenticatorAttachment = 0u,
        bRequireResidentKey = 0,
        dwUserVerificationRequirement = 0u,
        dwAttestationConveyancePreference = 0u,
        dwFlags = 0u,
        pCancellationIdCtorArg = MutPtr(0L),
        pExcludeCredentialListCtorArg = MutPtr(0L),
        dwEnterpriseAttestation = 0u,
        dwLargeBlobSupport = 0u,
        bPreferResidentKey = 0,
        bBrowserInPrivateMode = 0,
        bEnablePrf = 0,
        pLinkedDeviceCtorArg = MutPtr(0L),
        cbJsonExt = 0u,
        pbJsonExtCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwTimeoutMilliseconds: UInt = 0u,
            credentialList: WebauthnCredentials = WebauthnCredentials(),
            extensions: WebauthnExtensions = WebauthnExtensions(),
            dwAuthenticatorAttachment: UInt = 0u,
            bRequireResidentKey: Bool = 0,
            dwUserVerificationRequirement: UInt = 0u,
            dwAttestationConveyancePreference: UInt = 0u,
            dwFlags: UInt = 0u,
            pCancellationId: MutPtr<Guid> = MutPtr(0L),
            pExcludeCredentialList: MutPtr<WebauthnCredentialList> = MutPtr(0L),
            dwEnterpriseAttestation: UInt = 0u,
            dwLargeBlobSupport: UInt = 0u,
            bPreferResidentKey: Bool = 0,
            bBrowserInPrivateMode: Bool = 0,
            bEnablePrf: Bool = 0,
            pLinkedDevice: MutPtr<CtapcborHybridStorageLinkedData> = MutPtr(0L),
            cbJsonExt: UInt = 0u,
            pbJsonExt: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnAuthenticatorMakeCredentialOptions =
            WebauthnAuthenticatorMakeCredentialOptions(
                dwVersion = dwVersion,
                dwTimeoutMilliseconds = dwTimeoutMilliseconds,
                credentialList = credentialList,
                extensions = extensions,
                dwAuthenticatorAttachment = dwAuthenticatorAttachment,
                bRequireResidentKey = bRequireResidentKey,
                dwUserVerificationRequirement = dwUserVerificationRequirement,
                dwAttestationConveyancePreference = dwAttestationConveyancePreference,
                dwFlags = dwFlags,
                pCancellationIdCtorArg = pCancellationId,
                pExcludeCredentialListCtorArg = pExcludeCredentialList,
                dwEnterpriseAttestation = dwEnterpriseAttestation,
                dwLargeBlobSupport = dwLargeBlobSupport,
                bPreferResidentKey = bPreferResidentKey,
                bBrowserInPrivateMode = bBrowserInPrivateMode,
                bEnablePrf = bEnablePrf,
                pLinkedDeviceCtorArg = pLinkedDevice,
                cbJsonExt = cbJsonExt,
                pbJsonExtCtorArg = pbJsonExt,
            )
    }
}

public class WebauthnClientData internal constructor(
    public var dwVersion: UInt,
    public var cbClientDataJSON: UInt,
    pbClientDataJSONCtorArg: MutPtr<UByte>,
    pwszHashAlgIdCtorArg: Pcwstr,
) {
    public var pbClientDataJSON: MutPtr<UByte> = pbClientDataJSONCtorArg
        internal set

    public var pwszHashAlgId: Pcwstr = pwszHashAlgIdCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbClientDataJSON = 0u,
        pbClientDataJSONCtorArg = MutPtr(0L),
        pwszHashAlgIdCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbClientDataJSON

    public operator fun component3(): MutPtr<UByte> = this.pbClientDataJSON

    public operator fun component4(): Pcwstr = this.pwszHashAlgId

    public fun copy(dwVersion: UInt = this.dwVersion, cbClientDataJSON: UInt = this.cbClientDataJSON, pbClientDataJSON: MutPtr<UByte> = this.pbClientDataJSON, pwszHashAlgId: Pcwstr = this.pwszHashAlgId): WebauthnClientData = WebauthnClientData(dwVersion = dwVersion, cbClientDataJSON = cbClientDataJSON, pbClientDataJSONCtorArg = pbClientDataJSON, pwszHashAlgIdCtorArg = pwszHashAlgId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnClientData) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbClientDataJSON != other.cbClientDataJSON) return false
        if (this.pbClientDataJSON != other.pbClientDataJSON) return false
        if (this.pwszHashAlgId != other.pwszHashAlgId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbClientDataJSON.hashCode()
        result = 31 * result + this.pbClientDataJSON.hashCode()
        result = 31 * result + this.pwszHashAlgId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbClientDataJSON: UInt = 0u,
            pbClientDataJSON: MutPtr<UByte> = MutPtr(0L),
            pwszHashAlgId: Pcwstr = ConstPtr(0L),
        ): WebauthnClientData =
            WebauthnClientData(
                dwVersion = dwVersion,
                cbClientDataJSON = cbClientDataJSON,
                pbClientDataJSONCtorArg = pbClientDataJSON,
                pwszHashAlgIdCtorArg = pwszHashAlgId,
            )
    }
}

public class WebauthnCommonAttestation internal constructor(
    public var dwVersion: UInt,
    pwszAlgCtorArg: Pcwstr,
    public var lAlg: Int,
    public var cbSignature: UInt,
    pbSignatureCtorArg: MutPtr<UByte>,
    public var cX5c: UInt,
    pX5cCtorArg: MutPtr<WebauthnX5c>,
    pwszVerCtorArg: Pcwstr,
    public var cbCertInfo: UInt,
    pbCertInfoCtorArg: MutPtr<UByte>,
    public var cbPubArea: UInt,
    pbPubAreaCtorArg: MutPtr<UByte>,
) {
    public var pwszAlg: Pcwstr = pwszAlgCtorArg
        internal set

    public var pbSignature: MutPtr<UByte> = pbSignatureCtorArg
        internal set

    public var pX5c: MutPtr<WebauthnX5c> = pX5cCtorArg
        internal set

    public var pwszVer: Pcwstr = pwszVerCtorArg
        internal set

    public var pbCertInfo: MutPtr<UByte> = pbCertInfoCtorArg
        internal set

    public var pbPubArea: MutPtr<UByte> = pbPubAreaCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pwszAlgCtorArg = ConstPtr(0L),
        lAlg = 0,
        cbSignature = 0u,
        pbSignatureCtorArg = MutPtr(0L),
        cX5c = 0u,
        pX5cCtorArg = MutPtr(0L),
        pwszVerCtorArg = ConstPtr(0L),
        cbCertInfo = 0u,
        pbCertInfoCtorArg = MutPtr(0L),
        cbPubArea = 0u,
        pbPubAreaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pcwstr = this.pwszAlg

    public operator fun component3(): Int = this.lAlg

    public operator fun component4(): UInt = this.cbSignature

    public operator fun component5(): MutPtr<UByte> = this.pbSignature

    public operator fun component6(): UInt = this.cX5c

    public operator fun component7(): MutPtr<WebauthnX5c> = this.pX5c

    public operator fun component8(): Pcwstr = this.pwszVer

    public operator fun component9(): UInt = this.cbCertInfo

    public operator fun component10(): MutPtr<UByte> = this.pbCertInfo

    public operator fun component11(): UInt = this.cbPubArea

    public operator fun component12(): MutPtr<UByte> = this.pbPubArea

    public fun copy(dwVersion: UInt = this.dwVersion, pwszAlg: Pcwstr = this.pwszAlg, lAlg: Int = this.lAlg, cbSignature: UInt = this.cbSignature, pbSignature: MutPtr<UByte> = this.pbSignature, cX5c: UInt = this.cX5c, pX5c: MutPtr<WebauthnX5c> = this.pX5c, pwszVer: Pcwstr = this.pwszVer, cbCertInfo: UInt = this.cbCertInfo, pbCertInfo: MutPtr<UByte> = this.pbCertInfo, cbPubArea: UInt = this.cbPubArea, pbPubArea: MutPtr<UByte> = this.pbPubArea): WebauthnCommonAttestation = WebauthnCommonAttestation(dwVersion = dwVersion, pwszAlgCtorArg = pwszAlg, lAlg = lAlg, cbSignature = cbSignature, pbSignatureCtorArg = pbSignature, cX5c = cX5c, pX5cCtorArg = pX5c, pwszVerCtorArg = pwszVer, cbCertInfo = cbCertInfo, pbCertInfoCtorArg = pbCertInfo, cbPubArea = cbPubArea, pbPubAreaCtorArg = pbPubArea)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCommonAttestation) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pwszAlg != other.pwszAlg) return false
        if (this.lAlg != other.lAlg) return false
        if (this.cbSignature != other.cbSignature) return false
        if (this.pbSignature != other.pbSignature) return false
        if (this.cX5c != other.cX5c) return false
        if (this.pX5c != other.pX5c) return false
        if (this.pwszVer != other.pwszVer) return false
        if (this.cbCertInfo != other.cbCertInfo) return false
        if (this.pbCertInfo != other.pbCertInfo) return false
        if (this.cbPubArea != other.cbPubArea) return false
        if (this.pbPubArea != other.pbPubArea) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pwszAlg.hashCode()
        result = 31 * result + this.lAlg.hashCode()
        result = 31 * result + this.cbSignature.hashCode()
        result = 31 * result + this.pbSignature.hashCode()
        result = 31 * result + this.cX5c.hashCode()
        result = 31 * result + this.pX5c.hashCode()
        result = 31 * result + this.pwszVer.hashCode()
        result = 31 * result + this.cbCertInfo.hashCode()
        result = 31 * result + this.pbCertInfo.hashCode()
        result = 31 * result + this.cbPubArea.hashCode()
        result = 31 * result + this.pbPubArea.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pwszAlg: Pcwstr = ConstPtr(0L),
            lAlg: Int = 0,
            cbSignature: UInt = 0u,
            pbSignature: MutPtr<UByte> = MutPtr(0L),
            cX5c: UInt = 0u,
            pX5c: MutPtr<WebauthnX5c> = MutPtr(0L),
            pwszVer: Pcwstr = ConstPtr(0L),
            cbCertInfo: UInt = 0u,
            pbCertInfo: MutPtr<UByte> = MutPtr(0L),
            cbPubArea: UInt = 0u,
            pbPubArea: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnCommonAttestation =
            WebauthnCommonAttestation(
                dwVersion = dwVersion,
                pwszAlgCtorArg = pwszAlg,
                lAlg = lAlg,
                cbSignature = cbSignature,
                pbSignatureCtorArg = pbSignature,
                cX5c = cX5c,
                pX5cCtorArg = pX5c,
                pwszVerCtorArg = pwszVer,
                cbCertInfo = cbCertInfo,
                pbCertInfoCtorArg = pbCertInfo,
                cbPubArea = cbPubArea,
                pbPubAreaCtorArg = pbPubArea,
            )
    }
}

public class WebauthnCoseCredentialParameter internal constructor(
    public var dwVersion: UInt,
    pwszCredentialTypeCtorArg: Pcwstr,
    public var lAlg: Int,
) {
    public var pwszCredentialType: Pcwstr = pwszCredentialTypeCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pwszCredentialTypeCtorArg = ConstPtr(0L),
        lAlg = 0,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pcwstr = this.pwszCredentialType

    public operator fun component3(): Int = this.lAlg

    public fun copy(dwVersion: UInt = this.dwVersion, pwszCredentialType: Pcwstr = this.pwszCredentialType, lAlg: Int = this.lAlg): WebauthnCoseCredentialParameter = WebauthnCoseCredentialParameter(dwVersion = dwVersion, pwszCredentialTypeCtorArg = pwszCredentialType, lAlg = lAlg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCoseCredentialParameter) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pwszCredentialType != other.pwszCredentialType) return false
        if (this.lAlg != other.lAlg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pwszCredentialType.hashCode()
        result = 31 * result + this.lAlg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pwszCredentialType: Pcwstr = ConstPtr(0L),
            lAlg: Int = 0,
        ): WebauthnCoseCredentialParameter =
            WebauthnCoseCredentialParameter(
                dwVersion = dwVersion,
                pwszCredentialTypeCtorArg = pwszCredentialType,
                lAlg = lAlg,
            )
    }
}

public class WebauthnCoseCredentialParameters internal constructor(
    public var cCredentialParameters: UInt,
    pCredentialParametersCtorArg: MutPtr<WebauthnCoseCredentialParameter>,
) {
    public var pCredentialParameters: MutPtr<WebauthnCoseCredentialParameter> = pCredentialParametersCtorArg
        internal set

    public constructor() : this(
        cCredentialParameters = 0u,
        pCredentialParametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCredentialParameters

    public operator fun component2(): MutPtr<WebauthnCoseCredentialParameter> = this.pCredentialParameters

    public fun copy(cCredentialParameters: UInt = this.cCredentialParameters, pCredentialParameters: MutPtr<WebauthnCoseCredentialParameter> = this.pCredentialParameters): WebauthnCoseCredentialParameters = WebauthnCoseCredentialParameters(cCredentialParameters = cCredentialParameters, pCredentialParametersCtorArg = pCredentialParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCoseCredentialParameters) return false
        if (this.cCredentialParameters != other.cCredentialParameters) return false
        if (this.pCredentialParameters != other.pCredentialParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCredentialParameters.hashCode()
        result = 31 * result + this.pCredentialParameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCoseCredentialParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCoseCredentialParameters> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnCoseCredentialParameters =
                    WebauthnCoseCredentialParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WebauthnCoseCredentialParameter>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebauthnCoseCredentialParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCredentialParameters)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WebauthnCoseCredentialParameter>(64)
                    ).writeNative(addr + 8L, value.pCredentialParameters)
                }
            }

        public operator fun invoke(
            cCredentialParameters: UInt = 0u,
            pCredentialParameters: MutPtr<WebauthnCoseCredentialParameter> = MutPtr(0L),
        ): WebauthnCoseCredentialParameters =
            WebauthnCoseCredentialParameters(
                cCredentialParameters = cCredentialParameters,
                pCredentialParametersCtorArg = pCredentialParameters,
            )
    }
}

public class WebauthnCredential internal constructor(
    public var dwVersion: UInt,
    public var cbId: UInt,
    pbIdCtorArg: MutPtr<UByte>,
    pwszCredentialTypeCtorArg: Pcwstr,
) {
    public var pbId: MutPtr<UByte> = pbIdCtorArg
        internal set

    public var pwszCredentialType: Pcwstr = pwszCredentialTypeCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbId = 0u,
        pbIdCtorArg = MutPtr(0L),
        pwszCredentialTypeCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbId

    public operator fun component3(): MutPtr<UByte> = this.pbId

    public operator fun component4(): Pcwstr = this.pwszCredentialType

    public fun copy(dwVersion: UInt = this.dwVersion, cbId: UInt = this.cbId, pbId: MutPtr<UByte> = this.pbId, pwszCredentialType: Pcwstr = this.pwszCredentialType): WebauthnCredential = WebauthnCredential(dwVersion = dwVersion, cbId = cbId, pbIdCtorArg = pbId, pwszCredentialTypeCtorArg = pwszCredentialType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredential) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbId != other.cbId) return false
        if (this.pbId != other.pbId) return false
        if (this.pwszCredentialType != other.pwszCredentialType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbId.hashCode()
        result = 31 * result + this.pbId.hashCode()
        result = 31 * result + this.pwszCredentialType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbId: UInt = 0u,
            pbId: MutPtr<UByte> = MutPtr(0L),
            pwszCredentialType: Pcwstr = ConstPtr(0L),
        ): WebauthnCredential =
            WebauthnCredential(
                dwVersion = dwVersion,
                cbId = cbId,
                pbIdCtorArg = pbId,
                pwszCredentialTypeCtorArg = pwszCredentialType,
            )
    }
}

public class WebauthnCredentials internal constructor(
    public var cCredentials: UInt,
    pCredentialsCtorArg: MutPtr<WebauthnCredential>,
) {
    public var pCredentials: MutPtr<WebauthnCredential> = pCredentialsCtorArg
        internal set

    public constructor() : this(
        cCredentials = 0u,
        pCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCredentials

    public operator fun component2(): MutPtr<WebauthnCredential> = this.pCredentials

    public fun copy(cCredentials: UInt = this.cCredentials, pCredentials: MutPtr<WebauthnCredential> = this.pCredentials): WebauthnCredentials = WebauthnCredentials(cCredentials = cCredentials, pCredentialsCtorArg = pCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredentials) return false
        if (this.cCredentials != other.cCredentials) return false
        if (this.pCredentials != other.pCredentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCredentials.hashCode()
        result = 31 * result + this.pCredentials.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredentials> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredentials> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnCredentials =
                    WebauthnCredentials(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WebauthnCredential>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebauthnCredentials) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCredentials)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WebauthnCredential>(64)
                    ).writeNative(addr + 8L, value.pCredentials)
                }
            }

        public operator fun invoke(
            cCredentials: UInt = 0u,
            pCredentials: MutPtr<WebauthnCredential> = MutPtr(0L),
        ): WebauthnCredentials =
            WebauthnCredentials(
                cCredentials = cCredentials,
                pCredentialsCtorArg = pCredentials,
            )
    }
}

public class WebauthnCredentialAttestation internal constructor(
    public var dwVersion: UInt,
    pwszFormatTypeCtorArg: Pcwstr,
    public var cbAuthenticatorData: UInt,
    pbAuthenticatorDataCtorArg: MutPtr<UByte>,
    public var cbAttestation: UInt,
    pbAttestationCtorArg: MutPtr<UByte>,
    public var dwAttestationDecodeType: UInt,
    pvAttestationDecodeCtorArg: MutPtr<CVoid>,
    public var cbAttestationObject: UInt,
    pbAttestationObjectCtorArg: MutPtr<UByte>,
    public var cbCredentialId: UInt,
    pbCredentialIdCtorArg: MutPtr<UByte>,
    public var extensions: WebauthnExtensions,
    public var dwUsedTransport: UInt,
    public var bEpAtt: Bool,
    public var bLargeBlobSupported: Bool,
    public var bResidentKey: Bool,
    public var bPrfEnabled: Bool,
    public var cbUnsignedExtensionOutputs: UInt,
    pbUnsignedExtensionOutputsCtorArg: MutPtr<UByte>,
) {
    public var pwszFormatType: Pcwstr = pwszFormatTypeCtorArg
        internal set

    public var pbAuthenticatorData: MutPtr<UByte> = pbAuthenticatorDataCtorArg
        internal set

    public var pbAttestation: MutPtr<UByte> = pbAttestationCtorArg
        internal set

    public var pvAttestationDecode: MutPtr<CVoid> = pvAttestationDecodeCtorArg
        internal set

    public var pbAttestationObject: MutPtr<UByte> = pbAttestationObjectCtorArg
        internal set

    public var pbCredentialId: MutPtr<UByte> = pbCredentialIdCtorArg
        internal set

    public var pbUnsignedExtensionOutputs: MutPtr<UByte> = pbUnsignedExtensionOutputsCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pwszFormatTypeCtorArg = ConstPtr(0L),
        cbAuthenticatorData = 0u,
        pbAuthenticatorDataCtorArg = MutPtr(0L),
        cbAttestation = 0u,
        pbAttestationCtorArg = MutPtr(0L),
        dwAttestationDecodeType = 0u,
        pvAttestationDecodeCtorArg = MutPtr(0L),
        cbAttestationObject = 0u,
        pbAttestationObjectCtorArg = MutPtr(0L),
        cbCredentialId = 0u,
        pbCredentialIdCtorArg = MutPtr(0L),
        extensions = WebauthnExtensions(),
        dwUsedTransport = 0u,
        bEpAtt = 0,
        bLargeBlobSupported = 0,
        bResidentKey = 0,
        bPrfEnabled = 0,
        cbUnsignedExtensionOutputs = 0u,
        pbUnsignedExtensionOutputsCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pwszFormatType: Pcwstr = ConstPtr(0L),
            cbAuthenticatorData: UInt = 0u,
            pbAuthenticatorData: MutPtr<UByte> = MutPtr(0L),
            cbAttestation: UInt = 0u,
            pbAttestation: MutPtr<UByte> = MutPtr(0L),
            dwAttestationDecodeType: UInt = 0u,
            pvAttestationDecode: MutPtr<CVoid> = MutPtr(0L),
            cbAttestationObject: UInt = 0u,
            pbAttestationObject: MutPtr<UByte> = MutPtr(0L),
            cbCredentialId: UInt = 0u,
            pbCredentialId: MutPtr<UByte> = MutPtr(0L),
            extensions: WebauthnExtensions = WebauthnExtensions(),
            dwUsedTransport: UInt = 0u,
            bEpAtt: Bool = 0,
            bLargeBlobSupported: Bool = 0,
            bResidentKey: Bool = 0,
            bPrfEnabled: Bool = 0,
            cbUnsignedExtensionOutputs: UInt = 0u,
            pbUnsignedExtensionOutputs: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnCredentialAttestation =
            WebauthnCredentialAttestation(
                dwVersion = dwVersion,
                pwszFormatTypeCtorArg = pwszFormatType,
                cbAuthenticatorData = cbAuthenticatorData,
                pbAuthenticatorDataCtorArg = pbAuthenticatorData,
                cbAttestation = cbAttestation,
                pbAttestationCtorArg = pbAttestation,
                dwAttestationDecodeType = dwAttestationDecodeType,
                pvAttestationDecodeCtorArg = pvAttestationDecode,
                cbAttestationObject = cbAttestationObject,
                pbAttestationObjectCtorArg = pbAttestationObject,
                cbCredentialId = cbCredentialId,
                pbCredentialIdCtorArg = pbCredentialId,
                extensions = extensions,
                dwUsedTransport = dwUsedTransport,
                bEpAtt = bEpAtt,
                bLargeBlobSupported = bLargeBlobSupported,
                bResidentKey = bResidentKey,
                bPrfEnabled = bPrfEnabled,
                cbUnsignedExtensionOutputs = cbUnsignedExtensionOutputs,
                pbUnsignedExtensionOutputsCtorArg = pbUnsignedExtensionOutputs,
            )
    }
}

public class WebauthnCredentialDetails internal constructor(
    public var dwVersion: UInt,
    public var cbCredentialID: UInt,
    pbCredentialIDCtorArg: MutPtr<UByte>,
    pRpInformationCtorArg: MutPtr<WebauthnRpEntityInformation>,
    pUserInformationCtorArg: MutPtr<WebauthnUserEntityInformation>,
    public var bRemovable: Bool,
    public var bBackedUp: Bool,
) {
    public var pbCredentialID: MutPtr<UByte> = pbCredentialIDCtorArg
        internal set

    public var pRpInformation: MutPtr<WebauthnRpEntityInformation> = pRpInformationCtorArg
        internal set

    public var pUserInformation: MutPtr<WebauthnUserEntityInformation> = pUserInformationCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbCredentialID = 0u,
        pbCredentialIDCtorArg = MutPtr(0L),
        pRpInformationCtorArg = MutPtr(0L),
        pUserInformationCtorArg = MutPtr(0L),
        bRemovable = 0,
        bBackedUp = 0,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbCredentialID

    public operator fun component3(): MutPtr<UByte> = this.pbCredentialID

    public operator fun component4(): MutPtr<WebauthnRpEntityInformation> = this.pRpInformation

    public operator fun component5(): MutPtr<WebauthnUserEntityInformation> = this.pUserInformation

    public operator fun component6(): Bool = this.bRemovable

    public operator fun component7(): Bool = this.bBackedUp

    public fun copy(dwVersion: UInt = this.dwVersion, cbCredentialID: UInt = this.cbCredentialID, pbCredentialID: MutPtr<UByte> = this.pbCredentialID, pRpInformation: MutPtr<WebauthnRpEntityInformation> = this.pRpInformation, pUserInformation: MutPtr<WebauthnUserEntityInformation> = this.pUserInformation, bRemovable: Bool = this.bRemovable, bBackedUp: Bool = this.bBackedUp): WebauthnCredentialDetails = WebauthnCredentialDetails(dwVersion = dwVersion, cbCredentialID = cbCredentialID, pbCredentialIDCtorArg = pbCredentialID, pRpInformationCtorArg = pRpInformation, pUserInformationCtorArg = pUserInformation, bRemovable = bRemovable, bBackedUp = bBackedUp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredentialDetails) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbCredentialID != other.cbCredentialID) return false
        if (this.pbCredentialID != other.pbCredentialID) return false
        if (this.pRpInformation != other.pRpInformation) return false
        if (this.pUserInformation != other.pUserInformation) return false
        if (this.bRemovable != other.bRemovable) return false
        if (this.bBackedUp != other.bBackedUp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbCredentialID.hashCode()
        result = 31 * result + this.pbCredentialID.hashCode()
        result = 31 * result + this.pRpInformation.hashCode()
        result = 31 * result + this.pUserInformation.hashCode()
        result = 31 * result + this.bRemovable.hashCode()
        result = 31 * result + this.bBackedUp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbCredentialID: UInt = 0u,
            pbCredentialID: MutPtr<UByte> = MutPtr(0L),
            pRpInformation: MutPtr<WebauthnRpEntityInformation> = MutPtr(0L),
            pUserInformation: MutPtr<WebauthnUserEntityInformation> = MutPtr(0L),
            bRemovable: Bool = 0,
            bBackedUp: Bool = 0,
        ): WebauthnCredentialDetails =
            WebauthnCredentialDetails(
                dwVersion = dwVersion,
                cbCredentialID = cbCredentialID,
                pbCredentialIDCtorArg = pbCredentialID,
                pRpInformationCtorArg = pRpInformation,
                pUserInformationCtorArg = pUserInformation,
                bRemovable = bRemovable,
                bBackedUp = bBackedUp,
            )
    }
}

public class WebauthnCredentialDetailsList internal constructor(
    public var cCredentialDetails: UInt,
    ppCredentialDetailsCtorArg: MutPtr<MutPtr<WebauthnCredentialDetails>>,
) {
    public var ppCredentialDetails: MutPtr<MutPtr<WebauthnCredentialDetails>> = ppCredentialDetailsCtorArg
        internal set

    public constructor() : this(
        cCredentialDetails = 0u,
        ppCredentialDetailsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCredentialDetails

    public operator fun component2(): MutPtr<MutPtr<WebauthnCredentialDetails>> = this.ppCredentialDetails

    public fun copy(cCredentialDetails: UInt = this.cCredentialDetails, ppCredentialDetails: MutPtr<MutPtr<WebauthnCredentialDetails>> = this.ppCredentialDetails): WebauthnCredentialDetailsList = WebauthnCredentialDetailsList(cCredentialDetails = cCredentialDetails, ppCredentialDetailsCtorArg = ppCredentialDetails)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredentialDetailsList) return false
        if (this.cCredentialDetails != other.cCredentialDetails) return false
        if (this.ppCredentialDetails != other.ppCredentialDetails) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCredentialDetails.hashCode()
        result = 31 * result + this.ppCredentialDetails.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredentialDetailsList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredentialDetailsList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnCredentialDetailsList =
                    WebauthnCredentialDetailsList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WebauthnCredentialDetails>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebauthnCredentialDetailsList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCredentialDetails)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WebauthnCredentialDetails>>(64)
                    ).writeNative(addr + 8L, value.ppCredentialDetails)
                }
            }

        public operator fun invoke(
            cCredentialDetails: UInt = 0u,
            ppCredentialDetails: MutPtr<MutPtr<WebauthnCredentialDetails>> = MutPtr(0L),
        ): WebauthnCredentialDetailsList =
            WebauthnCredentialDetailsList(
                cCredentialDetails = cCredentialDetails,
                ppCredentialDetailsCtorArg = ppCredentialDetails,
            )
    }
}

public class WebauthnCredentialEx internal constructor(
    public var dwVersion: UInt,
    public var cbId: UInt,
    pbIdCtorArg: MutPtr<UByte>,
    pwszCredentialTypeCtorArg: Pcwstr,
    public var dwTransports: UInt,
) {
    public var pbId: MutPtr<UByte> = pbIdCtorArg
        internal set

    public var pwszCredentialType: Pcwstr = pwszCredentialTypeCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbId = 0u,
        pbIdCtorArg = MutPtr(0L),
        pwszCredentialTypeCtorArg = ConstPtr(0L),
        dwTransports = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbId

    public operator fun component3(): MutPtr<UByte> = this.pbId

    public operator fun component4(): Pcwstr = this.pwszCredentialType

    public operator fun component5(): UInt = this.dwTransports

    public fun copy(dwVersion: UInt = this.dwVersion, cbId: UInt = this.cbId, pbId: MutPtr<UByte> = this.pbId, pwszCredentialType: Pcwstr = this.pwszCredentialType, dwTransports: UInt = this.dwTransports): WebauthnCredentialEx = WebauthnCredentialEx(dwVersion = dwVersion, cbId = cbId, pbIdCtorArg = pbId, pwszCredentialTypeCtorArg = pwszCredentialType, dwTransports = dwTransports)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredentialEx) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbId != other.cbId) return false
        if (this.pbId != other.pbId) return false
        if (this.pwszCredentialType != other.pwszCredentialType) return false
        if (this.dwTransports != other.dwTransports) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbId.hashCode()
        result = 31 * result + this.pbId.hashCode()
        result = 31 * result + this.pwszCredentialType.hashCode()
        result = 31 * result + this.dwTransports.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbId: UInt = 0u,
            pbId: MutPtr<UByte> = MutPtr(0L),
            pwszCredentialType: Pcwstr = ConstPtr(0L),
            dwTransports: UInt = 0u,
        ): WebauthnCredentialEx =
            WebauthnCredentialEx(
                dwVersion = dwVersion,
                cbId = cbId,
                pbIdCtorArg = pbId,
                pwszCredentialTypeCtorArg = pwszCredentialType,
                dwTransports = dwTransports,
            )
    }
}

public class WebauthnCredentialList internal constructor(
    public var cCredentials: UInt,
    ppCredentialsCtorArg: MutPtr<MutPtr<WebauthnCredentialEx>>,
) {
    public var ppCredentials: MutPtr<MutPtr<WebauthnCredentialEx>> = ppCredentialsCtorArg
        internal set

    public constructor() : this(
        cCredentials = 0u,
        ppCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCredentials

    public operator fun component2(): MutPtr<MutPtr<WebauthnCredentialEx>> = this.ppCredentials

    public fun copy(cCredentials: UInt = this.cCredentials, ppCredentials: MutPtr<MutPtr<WebauthnCredentialEx>> = this.ppCredentials): WebauthnCredentialList = WebauthnCredentialList(cCredentials = cCredentials, ppCredentialsCtorArg = ppCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredentialList) return false
        if (this.cCredentials != other.cCredentials) return false
        if (this.ppCredentials != other.ppCredentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCredentials.hashCode()
        result = 31 * result + this.ppCredentials.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredentialList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredentialList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnCredentialList =
                    WebauthnCredentialList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WebauthnCredentialEx>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebauthnCredentialList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCredentials)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WebauthnCredentialEx>>(64)
                    ).writeNative(addr + 8L, value.ppCredentials)
                }
            }

        public operator fun invoke(
            cCredentials: UInt = 0u,
            ppCredentials: MutPtr<MutPtr<WebauthnCredentialEx>> = MutPtr(0L),
        ): WebauthnCredentialList =
            WebauthnCredentialList(
                cCredentials = cCredentials,
                ppCredentialsCtorArg = ppCredentials,
            )
    }
}

public class WebauthnCredBlobExtension internal constructor(
    public var cbCredBlob: UInt,
    pbCredBlobCtorArg: MutPtr<UByte>,
) {
    public var pbCredBlob: MutPtr<UByte> = pbCredBlobCtorArg
        internal set

    public constructor() : this(
        cbCredBlob = 0u,
        pbCredBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbCredBlob

    public operator fun component2(): MutPtr<UByte> = this.pbCredBlob

    public fun copy(cbCredBlob: UInt = this.cbCredBlob, pbCredBlob: MutPtr<UByte> = this.pbCredBlob): WebauthnCredBlobExtension = WebauthnCredBlobExtension(cbCredBlob = cbCredBlob, pbCredBlobCtorArg = pbCredBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredBlobExtension) return false
        if (this.cbCredBlob != other.cbCredBlob) return false
        if (this.pbCredBlob != other.pbCredBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbCredBlob.hashCode()
        result = 31 * result + this.pbCredBlob.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredBlobExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredBlobExtension> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnCredBlobExtension =
                    WebauthnCredBlobExtension(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebauthnCredBlobExtension) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbCredBlob)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCredBlob)
                }
            }

        public operator fun invoke(
            cbCredBlob: UInt = 0u,
            pbCredBlob: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnCredBlobExtension =
            WebauthnCredBlobExtension(
                cbCredBlob = cbCredBlob,
                pbCredBlobCtorArg = pbCredBlob,
            )
    }
}

public data class WebauthnCredProtectExtensionIn(
    public var dwCredProtect: UInt = 0u,
    public var bRequireCredProtect: Bool = 0,
)

public class WebauthnCredWithHmacSecretSalt internal constructor(
    public var cbCredID: UInt,
    pbCredIDCtorArg: MutPtr<UByte>,
    pHmacSecretSaltCtorArg: MutPtr<WebauthnHmacSecretSalt>,
) {
    public var pbCredID: MutPtr<UByte> = pbCredIDCtorArg
        internal set

    public var pHmacSecretSalt: MutPtr<WebauthnHmacSecretSalt> = pHmacSecretSaltCtorArg
        internal set

    public constructor() : this(
        cbCredID = 0u,
        pbCredIDCtorArg = MutPtr(0L),
        pHmacSecretSaltCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbCredID

    public operator fun component2(): MutPtr<UByte> = this.pbCredID

    public operator fun component3(): MutPtr<WebauthnHmacSecretSalt> = this.pHmacSecretSalt

    public fun copy(cbCredID: UInt = this.cbCredID, pbCredID: MutPtr<UByte> = this.pbCredID, pHmacSecretSalt: MutPtr<WebauthnHmacSecretSalt> = this.pHmacSecretSalt): WebauthnCredWithHmacSecretSalt = WebauthnCredWithHmacSecretSalt(cbCredID = cbCredID, pbCredIDCtorArg = pbCredID, pHmacSecretSaltCtorArg = pHmacSecretSalt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnCredWithHmacSecretSalt) return false
        if (this.cbCredID != other.cbCredID) return false
        if (this.pbCredID != other.pbCredID) return false
        if (this.pHmacSecretSalt != other.pHmacSecretSalt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbCredID.hashCode()
        result = 31 * result + this.pbCredID.hashCode()
        result = 31 * result + this.pHmacSecretSalt.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredWithHmacSecretSalt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnCredWithHmacSecretSalt> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnCredWithHmacSecretSalt =
                    WebauthnCredWithHmacSecretSalt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WebauthnHmacSecretSalt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WebauthnCredWithHmacSecretSalt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbCredID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbCredID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WebauthnHmacSecretSalt>(64)
                    ).writeNative(addr + 16L, value.pHmacSecretSalt)
                }
            }

        public operator fun invoke(
            cbCredID: UInt = 0u,
            pbCredID: MutPtr<UByte> = MutPtr(0L),
            pHmacSecretSalt: MutPtr<WebauthnHmacSecretSalt> = MutPtr(0L),
        ): WebauthnCredWithHmacSecretSalt =
            WebauthnCredWithHmacSecretSalt(
                cbCredID = cbCredID,
                pbCredIDCtorArg = pbCredID,
                pHmacSecretSaltCtorArg = pHmacSecretSalt,
            )
    }
}

public class WebauthnExtension internal constructor(
    pwszExtensionIdentifierCtorArg: Pcwstr,
    public var cbExtension: UInt,
    pvExtensionCtorArg: MutPtr<CVoid>,
) {
    public var pwszExtensionIdentifier: Pcwstr = pwszExtensionIdentifierCtorArg
        internal set

    public var pvExtension: MutPtr<CVoid> = pvExtensionCtorArg
        internal set

    public constructor() : this(
        pwszExtensionIdentifierCtorArg = ConstPtr(0L),
        cbExtension = 0u,
        pvExtensionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszExtensionIdentifier

    public operator fun component2(): UInt = this.cbExtension

    public operator fun component3(): MutPtr<CVoid> = this.pvExtension

    public fun copy(pwszExtensionIdentifier: Pcwstr = this.pwszExtensionIdentifier, cbExtension: UInt = this.cbExtension, pvExtension: MutPtr<CVoid> = this.pvExtension): WebauthnExtension = WebauthnExtension(pwszExtensionIdentifierCtorArg = pwszExtensionIdentifier, cbExtension = cbExtension, pvExtensionCtorArg = pvExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnExtension) return false
        if (this.pwszExtensionIdentifier != other.pwszExtensionIdentifier) return false
        if (this.cbExtension != other.cbExtension) return false
        if (this.pvExtension != other.pvExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszExtensionIdentifier.hashCode()
        result = 31 * result + this.cbExtension.hashCode()
        result = 31 * result + this.pvExtension.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszExtensionIdentifier: Pcwstr = ConstPtr(0L),
            cbExtension: UInt = 0u,
            pvExtension: MutPtr<CVoid> = MutPtr(0L),
        ): WebauthnExtension =
            WebauthnExtension(
                pwszExtensionIdentifierCtorArg = pwszExtensionIdentifier,
                cbExtension = cbExtension,
                pvExtensionCtorArg = pvExtension,
            )
    }
}

public class WebauthnExtensions internal constructor(
    public var cExtensions: UInt,
    pExtensionsCtorArg: MutPtr<WebauthnExtension>,
) {
    public var pExtensions: MutPtr<WebauthnExtension> = pExtensionsCtorArg
        internal set

    public constructor() : this(
        cExtensions = 0u,
        pExtensionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cExtensions

    public operator fun component2(): MutPtr<WebauthnExtension> = this.pExtensions

    public fun copy(cExtensions: UInt = this.cExtensions, pExtensions: MutPtr<WebauthnExtension> = this.pExtensions): WebauthnExtensions = WebauthnExtensions(cExtensions = cExtensions, pExtensionsCtorArg = pExtensions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnExtensions) return false
        if (this.cExtensions != other.cExtensions) return false
        if (this.pExtensions != other.pExtensions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cExtensions.hashCode()
        result = 31 * result + this.pExtensions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnExtensions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnExtensions> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnExtensions =
                    WebauthnExtensions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WebauthnExtension>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebauthnExtensions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cExtensions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WebauthnExtension>(64)
                    ).writeNative(addr + 8L, value.pExtensions)
                }
            }

        public operator fun invoke(
            cExtensions: UInt = 0u,
            pExtensions: MutPtr<WebauthnExtension> = MutPtr(0L),
        ): WebauthnExtensions =
            WebauthnExtensions(
                cExtensions = cExtensions,
                pExtensionsCtorArg = pExtensions,
            )
    }
}

public class WebauthnGetCredentialsOptions internal constructor(
    public var dwVersion: UInt,
    pwszRpIdCtorArg: Pcwstr,
    public var bBrowserInPrivateMode: Bool,
) {
    public var pwszRpId: Pcwstr = pwszRpIdCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pwszRpIdCtorArg = ConstPtr(0L),
        bBrowserInPrivateMode = 0,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pcwstr = this.pwszRpId

    public operator fun component3(): Bool = this.bBrowserInPrivateMode

    public fun copy(dwVersion: UInt = this.dwVersion, pwszRpId: Pcwstr = this.pwszRpId, bBrowserInPrivateMode: Bool = this.bBrowserInPrivateMode): WebauthnGetCredentialsOptions = WebauthnGetCredentialsOptions(dwVersion = dwVersion, pwszRpIdCtorArg = pwszRpId, bBrowserInPrivateMode = bBrowserInPrivateMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnGetCredentialsOptions) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pwszRpId != other.pwszRpId) return false
        if (this.bBrowserInPrivateMode != other.bBrowserInPrivateMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pwszRpId.hashCode()
        result = 31 * result + this.bBrowserInPrivateMode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pwszRpId: Pcwstr = ConstPtr(0L),
            bBrowserInPrivateMode: Bool = 0,
        ): WebauthnGetCredentialsOptions =
            WebauthnGetCredentialsOptions(
                dwVersion = dwVersion,
                pwszRpIdCtorArg = pwszRpId,
                bBrowserInPrivateMode = bBrowserInPrivateMode,
            )
    }
}

public class WebauthnHmacSecretSalt internal constructor(
    public var cbFirst: UInt,
    pbFirstCtorArg: MutPtr<UByte>,
    public var cbSecond: UInt,
    pbSecondCtorArg: MutPtr<UByte>,
) {
    public var pbFirst: MutPtr<UByte> = pbFirstCtorArg
        internal set

    public var pbSecond: MutPtr<UByte> = pbSecondCtorArg
        internal set

    public constructor() : this(
        cbFirst = 0u,
        pbFirstCtorArg = MutPtr(0L),
        cbSecond = 0u,
        pbSecondCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbFirst

    public operator fun component2(): MutPtr<UByte> = this.pbFirst

    public operator fun component3(): UInt = this.cbSecond

    public operator fun component4(): MutPtr<UByte> = this.pbSecond

    public fun copy(cbFirst: UInt = this.cbFirst, pbFirst: MutPtr<UByte> = this.pbFirst, cbSecond: UInt = this.cbSecond, pbSecond: MutPtr<UByte> = this.pbSecond): WebauthnHmacSecretSalt = WebauthnHmacSecretSalt(cbFirst = cbFirst, pbFirstCtorArg = pbFirst, cbSecond = cbSecond, pbSecondCtorArg = pbSecond)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnHmacSecretSalt) return false
        if (this.cbFirst != other.cbFirst) return false
        if (this.pbFirst != other.pbFirst) return false
        if (this.cbSecond != other.cbSecond) return false
        if (this.pbSecond != other.pbSecond) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbFirst.hashCode()
        result = 31 * result + this.pbFirst.hashCode()
        result = 31 * result + this.cbSecond.hashCode()
        result = 31 * result + this.pbSecond.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnHmacSecretSalt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnHmacSecretSalt> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnHmacSecretSalt =
                    WebauthnHmacSecretSalt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WebauthnHmacSecretSalt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbFirst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbFirst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbSecond)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pbSecond)
                }
            }

        public operator fun invoke(
            cbFirst: UInt = 0u,
            pbFirst: MutPtr<UByte> = MutPtr(0L),
            cbSecond: UInt = 0u,
            pbSecond: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnHmacSecretSalt =
            WebauthnHmacSecretSalt(
                cbFirst = cbFirst,
                pbFirstCtorArg = pbFirst,
                cbSecond = cbSecond,
                pbSecondCtorArg = pbSecond,
            )
    }
}

public class WebauthnHmacSecretSaltValues internal constructor(
    pGlobalHmacSaltCtorArg: MutPtr<WebauthnHmacSecretSalt>,
    public var cCredWithHmacSecretSaltList: UInt,
    pCredWithHmacSecretSaltListCtorArg: MutPtr<WebauthnCredWithHmacSecretSalt>,
) {
    public var pGlobalHmacSalt: MutPtr<WebauthnHmacSecretSalt> = pGlobalHmacSaltCtorArg
        internal set

    public var pCredWithHmacSecretSaltList: MutPtr<WebauthnCredWithHmacSecretSalt> = pCredWithHmacSecretSaltListCtorArg
        internal set

    public constructor() : this(
        pGlobalHmacSaltCtorArg = MutPtr(0L),
        cCredWithHmacSecretSaltList = 0u,
        pCredWithHmacSecretSaltListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WebauthnHmacSecretSalt> = this.pGlobalHmacSalt

    public operator fun component2(): UInt = this.cCredWithHmacSecretSaltList

    public operator fun component3(): MutPtr<WebauthnCredWithHmacSecretSalt> = this.pCredWithHmacSecretSaltList

    public fun copy(pGlobalHmacSalt: MutPtr<WebauthnHmacSecretSalt> = this.pGlobalHmacSalt, cCredWithHmacSecretSaltList: UInt = this.cCredWithHmacSecretSaltList, pCredWithHmacSecretSaltList: MutPtr<WebauthnCredWithHmacSecretSalt> = this.pCredWithHmacSecretSaltList): WebauthnHmacSecretSaltValues = WebauthnHmacSecretSaltValues(pGlobalHmacSaltCtorArg = pGlobalHmacSalt, cCredWithHmacSecretSaltList = cCredWithHmacSecretSaltList, pCredWithHmacSecretSaltListCtorArg = pCredWithHmacSecretSaltList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnHmacSecretSaltValues) return false
        if (this.pGlobalHmacSalt != other.pGlobalHmacSalt) return false
        if (this.cCredWithHmacSecretSaltList != other.cCredWithHmacSecretSaltList) return false
        if (this.pCredWithHmacSecretSaltList != other.pCredWithHmacSecretSaltList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pGlobalHmacSalt.hashCode()
        result = 31 * result + this.cCredWithHmacSecretSaltList.hashCode()
        result = 31 * result + this.pCredWithHmacSecretSaltList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnHmacSecretSaltValues> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnHmacSecretSaltValues> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnHmacSecretSaltValues =
                    WebauthnHmacSecretSaltValues(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WebauthnHmacSecretSalt>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WebauthnCredWithHmacSecretSalt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WebauthnHmacSecretSaltValues) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WebauthnHmacSecretSalt>(64)
                    ).writeNative(addr, value.pGlobalHmacSalt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCredWithHmacSecretSaltList)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WebauthnCredWithHmacSecretSalt>(64)
                    ).writeNative(addr + 16L, value.pCredWithHmacSecretSaltList)
                }
            }

        public operator fun invoke(
            pGlobalHmacSalt: MutPtr<WebauthnHmacSecretSalt> = MutPtr(0L),
            cCredWithHmacSecretSaltList: UInt = 0u,
            pCredWithHmacSecretSaltList: MutPtr<WebauthnCredWithHmacSecretSalt> = MutPtr(0L),
        ): WebauthnHmacSecretSaltValues =
            WebauthnHmacSecretSaltValues(
                pGlobalHmacSaltCtorArg = pGlobalHmacSalt,
                cCredWithHmacSecretSaltList = cCredWithHmacSecretSaltList,
                pCredWithHmacSecretSaltListCtorArg = pCredWithHmacSecretSaltList,
            )
    }
}

public class WebauthnRpEntityInformation internal constructor(
    public var dwVersion: UInt,
    pwszIdCtorArg: Pcwstr,
    pwszNameCtorArg: Pcwstr,
    pwszIconCtorArg: Pcwstr,
) {
    public var pwszId: Pcwstr = pwszIdCtorArg
        internal set

    public var pwszName: Pcwstr = pwszNameCtorArg
        internal set

    public var pwszIcon: Pcwstr = pwszIconCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pwszIdCtorArg = ConstPtr(0L),
        pwszNameCtorArg = ConstPtr(0L),
        pwszIconCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pcwstr = this.pwszId

    public operator fun component3(): Pcwstr = this.pwszName

    public operator fun component4(): Pcwstr = this.pwszIcon

    public fun copy(dwVersion: UInt = this.dwVersion, pwszId: Pcwstr = this.pwszId, pwszName: Pcwstr = this.pwszName, pwszIcon: Pcwstr = this.pwszIcon): WebauthnRpEntityInformation = WebauthnRpEntityInformation(dwVersion = dwVersion, pwszIdCtorArg = pwszId, pwszNameCtorArg = pwszName, pwszIconCtorArg = pwszIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnRpEntityInformation) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pwszId != other.pwszId) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pwszIcon != other.pwszIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pwszId.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.pwszIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            pwszId: Pcwstr = ConstPtr(0L),
            pwszName: Pcwstr = ConstPtr(0L),
            pwszIcon: Pcwstr = ConstPtr(0L),
        ): WebauthnRpEntityInformation =
            WebauthnRpEntityInformation(
                dwVersion = dwVersion,
                pwszIdCtorArg = pwszId,
                pwszNameCtorArg = pwszName,
                pwszIconCtorArg = pwszIcon,
            )
    }
}

public class WebauthnUserEntityInformation internal constructor(
    public var dwVersion: UInt,
    public var cbId: UInt,
    pbIdCtorArg: MutPtr<UByte>,
    pwszNameCtorArg: Pcwstr,
    pwszIconCtorArg: Pcwstr,
    pwszDisplayNameCtorArg: Pcwstr,
) {
    public var pbId: MutPtr<UByte> = pbIdCtorArg
        internal set

    public var pwszName: Pcwstr = pwszNameCtorArg
        internal set

    public var pwszIcon: Pcwstr = pwszIconCtorArg
        internal set

    public var pwszDisplayName: Pcwstr = pwszDisplayNameCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbId = 0u,
        pbIdCtorArg = MutPtr(0L),
        pwszNameCtorArg = ConstPtr(0L),
        pwszIconCtorArg = ConstPtr(0L),
        pwszDisplayNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbId

    public operator fun component3(): MutPtr<UByte> = this.pbId

    public operator fun component4(): Pcwstr = this.pwszName

    public operator fun component5(): Pcwstr = this.pwszIcon

    public operator fun component6(): Pcwstr = this.pwszDisplayName

    public fun copy(dwVersion: UInt = this.dwVersion, cbId: UInt = this.cbId, pbId: MutPtr<UByte> = this.pbId, pwszName: Pcwstr = this.pwszName, pwszIcon: Pcwstr = this.pwszIcon, pwszDisplayName: Pcwstr = this.pwszDisplayName): WebauthnUserEntityInformation = WebauthnUserEntityInformation(dwVersion = dwVersion, cbId = cbId, pbIdCtorArg = pbId, pwszNameCtorArg = pwszName, pwszIconCtorArg = pwszIcon, pwszDisplayNameCtorArg = pwszDisplayName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnUserEntityInformation) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbId != other.cbId) return false
        if (this.pbId != other.pbId) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pwszIcon != other.pwszIcon) return false
        if (this.pwszDisplayName != other.pwszDisplayName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbId.hashCode()
        result = 31 * result + this.pbId.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.pwszIcon.hashCode()
        result = 31 * result + this.pwszDisplayName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbId: UInt = 0u,
            pbId: MutPtr<UByte> = MutPtr(0L),
            pwszName: Pcwstr = ConstPtr(0L),
            pwszIcon: Pcwstr = ConstPtr(0L),
            pwszDisplayName: Pcwstr = ConstPtr(0L),
        ): WebauthnUserEntityInformation =
            WebauthnUserEntityInformation(
                dwVersion = dwVersion,
                cbId = cbId,
                pbIdCtorArg = pbId,
                pwszNameCtorArg = pwszName,
                pwszIconCtorArg = pwszIcon,
                pwszDisplayNameCtorArg = pwszDisplayName,
            )
    }
}

public class WebauthnX5c internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr<UByte>,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr<UByte> = this.pbData

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr<UByte> = this.pbData): WebauthnX5c = WebauthnX5c(cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WebauthnX5c) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnX5c> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WebauthnX5c> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WebauthnX5c =
                    WebauthnX5c(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WebauthnX5c) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
        ): WebauthnX5c =
            WebauthnX5c(
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public class WsAnyAttribute internal constructor(
    public var localName: WsXmlString,
    public var ns: WsXmlString,
    valueCtorArg: MutPtr<WsXmlText>,
) {
    public var value: MutPtr<WsXmlText> = valueCtorArg
        internal set

    public constructor() : this(
        localName = WsXmlString(),
        ns = WsXmlString(),
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlString = this.localName

    public operator fun component2(): WsXmlString = this.ns

    public operator fun component3(): MutPtr<WsXmlText> = this.value

    public fun copy(localName: WsXmlString = this.localName, ns: WsXmlString = this.ns, value: MutPtr<WsXmlText> = this.value): WsAnyAttribute = WsAnyAttribute(localName = localName, ns = ns, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsAnyAttribute) return false
        if (this.localName != other.localName) return false
        if (this.ns != other.ns) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localName.hashCode()
        result = 31 * result + this.ns.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAnyAttribute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAnyAttribute> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsAnyAttribute =
                    WsAnyAttribute(
                        (WsXmlString.typeLayout()).readNative(addr),
                        (WsXmlString.typeLayout()).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlText>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: WsAnyAttribute) {
                    (WsXmlString.typeLayout()).writeNative(addr, value.localName)
                    (WsXmlString.typeLayout()).writeNative(addr + 32L, value.ns)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlText>(64)
                    ).writeNative(addr + 64L, value.value)
                }
            }

        public operator fun invoke(
            localName: WsXmlString = WsXmlString(),
            ns: WsXmlString = WsXmlString(),
            value: MutPtr<WsXmlText> = MutPtr(0L),
        ): WsAnyAttribute =
            WsAnyAttribute(
                localName = localName,
                ns = ns,
                valueCtorArg = value,
            )
    }
}

public class WsAnyAttributes internal constructor(
    attributesCtorArg: MutPtr<WsAnyAttribute>,
    public var attributeCount: UInt,
) {
    public var attributes: MutPtr<WsAnyAttribute> = attributesCtorArg
        internal set

    public constructor() : this(
        attributesCtorArg = MutPtr(0L),
        attributeCount = 0u,
    )

    public operator fun component1(): MutPtr<WsAnyAttribute> = this.attributes

    public operator fun component2(): UInt = this.attributeCount

    public fun copy(attributes: MutPtr<WsAnyAttribute> = this.attributes, attributeCount: UInt = this.attributeCount): WsAnyAttributes = WsAnyAttributes(attributesCtorArg = attributes, attributeCount = attributeCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsAnyAttributes) return false
        if (this.attributes != other.attributes) return false
        if (this.attributeCount != other.attributeCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.attributes.hashCode()
        result = 31 * result + this.attributeCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAnyAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAnyAttributes> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsAnyAttributes =
                    WsAnyAttributes(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsAnyAttribute>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsAnyAttributes) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsAnyAttribute>(64)
                    ).writeNative(addr, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.attributeCount)
                }
            }

        public operator fun invoke(
            attributes: MutPtr<WsAnyAttribute> = MutPtr(0L),
            attributeCount: UInt = 0u,
        ): WsAnyAttributes =
            WsAnyAttributes(
                attributesCtorArg = attributes,
                attributeCount = attributeCount,
            )
    }
}

public class WsAsyncContext internal constructor(
    public var callback: WsAsyncCallback,
    callbackStateCtorArg: MutPtr<CVoid>,
) {
    public var callbackState: MutPtr<CVoid> = callbackStateCtorArg
        internal set

    public constructor() : this(
        callback = null,
        callbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsAsyncCallback = this.callback

    public operator fun component2(): MutPtr<CVoid> = this.callbackState

    public fun copy(callback: WsAsyncCallback = this.callback, callbackState: MutPtr<CVoid> = this.callbackState): WsAsyncContext = WsAsyncContext(callback = callback, callbackStateCtorArg = callbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsAsyncContext) return false
        if (this.callback != other.callback) return false
        if (this.callbackState != other.callbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callback.hashCode()
        result = 31 * result + this.callbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callback: WsAsyncCallback = null,
            callbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsAsyncContext =
            WsAsyncContext(
                callback = callback,
                callbackStateCtorArg = callbackState,
            )
    }
}

public data class WsAsyncOperation(
    public var function: WsAsyncFunction = null,
)

public class WsAsyncState internal constructor(
    internal0CtorArg: MutPtr<CVoid>,
    internal1CtorArg: MutPtr<CVoid>,
    internal2CtorArg: MutPtr<CVoid>,
    internal3CtorArg: MutPtr<CVoid>,
    internal4CtorArg: MutPtr<CVoid>,
) {
    public var internal0: MutPtr<CVoid> = internal0CtorArg
        internal set

    public var internal1: MutPtr<CVoid> = internal1CtorArg
        internal set

    public var internal2: MutPtr<CVoid> = internal2CtorArg
        internal set

    public var internal3: MutPtr<CVoid> = internal3CtorArg
        internal set

    public var internal4: MutPtr<CVoid> = internal4CtorArg
        internal set

    public constructor() : this(
        internal0CtorArg = MutPtr(0L),
        internal1CtorArg = MutPtr(0L),
        internal2CtorArg = MutPtr(0L),
        internal3CtorArg = MutPtr(0L),
        internal4CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.internal0

    public operator fun component2(): MutPtr<CVoid> = this.internal1

    public operator fun component3(): MutPtr<CVoid> = this.internal2

    public operator fun component4(): MutPtr<CVoid> = this.internal3

    public operator fun component5(): MutPtr<CVoid> = this.internal4

    public fun copy(internal0: MutPtr<CVoid> = this.internal0, internal1: MutPtr<CVoid> = this.internal1, internal2: MutPtr<CVoid> = this.internal2, internal3: MutPtr<CVoid> = this.internal3, internal4: MutPtr<CVoid> = this.internal4): WsAsyncState = WsAsyncState(internal0CtorArg = internal0, internal1CtorArg = internal1, internal2CtorArg = internal2, internal3CtorArg = internal3, internal4CtorArg = internal4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsAsyncState) return false
        if (this.internal0 != other.internal0) return false
        if (this.internal1 != other.internal1) return false
        if (this.internal2 != other.internal2) return false
        if (this.internal3 != other.internal3) return false
        if (this.internal4 != other.internal4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.internal0.hashCode()
        result = 31 * result + this.internal1.hashCode()
        result = 31 * result + this.internal2.hashCode()
        result = 31 * result + this.internal3.hashCode()
        result = 31 * result + this.internal4.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAsyncState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAsyncState> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsAsyncState =
                    WsAsyncState(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsAsyncState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.internal0)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.internal1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.internal2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.internal3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.internal4)
                }
            }

        public operator fun invoke(
            internal0: MutPtr<CVoid> = MutPtr(0L),
            internal1: MutPtr<CVoid> = MutPtr(0L),
            internal2: MutPtr<CVoid> = MutPtr(0L),
            internal3: MutPtr<CVoid> = MutPtr(0L),
            internal4: MutPtr<CVoid> = MutPtr(0L),
        ): WsAsyncState =
            WsAsyncState(
                internal0CtorArg = internal0,
                internal1CtorArg = internal1,
                internal2CtorArg = internal2,
                internal3CtorArg = internal3,
                internal4CtorArg = internal4,
            )
    }
}

public class WsAttributeDescription internal constructor(
    attributeLocalNameCtorArg: MutPtr<WsXmlString>,
    attributeNsCtorArg: MutPtr<WsXmlString>,
    public var type: WsType,
    typeDescriptionCtorArg: MutPtr<CVoid>,
) {
    public var attributeLocalName: MutPtr<WsXmlString> = attributeLocalNameCtorArg
        internal set

    public var attributeNs: MutPtr<WsXmlString> = attributeNsCtorArg
        internal set

    public var typeDescription: MutPtr<CVoid> = typeDescriptionCtorArg
        internal set

    public constructor() : this(
        attributeLocalNameCtorArg = MutPtr(0L),
        attributeNsCtorArg = MutPtr(0L),
        type = 0,
        typeDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlString> = this.attributeLocalName

    public operator fun component2(): MutPtr<WsXmlString> = this.attributeNs

    public operator fun component3(): WsType = this.type

    public operator fun component4(): MutPtr<CVoid> = this.typeDescription

    public fun copy(attributeLocalName: MutPtr<WsXmlString> = this.attributeLocalName, attributeNs: MutPtr<WsXmlString> = this.attributeNs, type: WsType = this.type, typeDescription: MutPtr<CVoid> = this.typeDescription): WsAttributeDescription = WsAttributeDescription(attributeLocalNameCtorArg = attributeLocalName, attributeNsCtorArg = attributeNs, type = type, typeDescriptionCtorArg = typeDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsAttributeDescription) return false
        if (this.attributeLocalName != other.attributeLocalName) return false
        if (this.attributeNs != other.attributeNs) return false
        if (this.type != other.type) return false
        if (this.typeDescription != other.typeDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.attributeLocalName.hashCode()
        result = 31 * result + this.attributeNs.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.typeDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAttributeDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsAttributeDescription> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsAttributeDescription =
                    WsAttributeDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsAttributeDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr, value.attributeLocalName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.attributeNs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.typeDescription)
                }
            }

        public operator fun invoke(
            attributeLocalName: MutPtr<WsXmlString> = MutPtr(0L),
            attributeNs: MutPtr<WsXmlString> = MutPtr(0L),
            type: WsType = 0,
            typeDescription: MutPtr<CVoid> = MutPtr(0L),
        ): WsAttributeDescription =
            WsAttributeDescription(
                attributeLocalNameCtorArg = attributeLocalName,
                attributeNsCtorArg = attributeNs,
                type = type,
                typeDescriptionCtorArg = typeDescription,
            )
    }
}

public data class WsBoolDescription(
    public var value: Bool = 0,
)

public class WsBuffers internal constructor(
    public var bufferCount: UInt,
    buffersCtorArg: MutPtr<WsBytes>,
) {
    public var buffers: MutPtr<WsBytes> = buffersCtorArg
        internal set

    public constructor() : this(
        bufferCount = 0u,
        buffersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bufferCount

    public operator fun component2(): MutPtr<WsBytes> = this.buffers

    public fun copy(bufferCount: UInt = this.bufferCount, buffers: MutPtr<WsBytes> = this.buffers): WsBuffers = WsBuffers(bufferCount = bufferCount, buffersCtorArg = buffers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsBuffers) return false
        if (this.bufferCount != other.bufferCount) return false
        if (this.buffers != other.buffers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferCount.hashCode()
        result = 31 * result + this.buffers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsBuffers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsBuffers> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsBuffers =
                    WsBuffers(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsBytes>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsBuffers) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bufferCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsBytes>(64)
                    ).writeNative(addr + 8L, value.buffers)
                }
            }

        public operator fun invoke(
            bufferCount: UInt = 0u,
            buffers: MutPtr<WsBytes> = MutPtr(0L),
        ): WsBuffers =
            WsBuffers(
                bufferCount = bufferCount,
                buffersCtorArg = buffers,
            )
    }
}

public class WsBytes internal constructor(
    public var length: UInt,
    bytesCtorArg: MutPtr<UByte>,
) {
    public var bytes: MutPtr<UByte> = bytesCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        bytesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<UByte> = this.bytes

    public fun copy(length: UInt = this.length, bytes: MutPtr<UByte> = this.bytes): WsBytes = WsBytes(length = length, bytesCtorArg = bytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsBytes) return false
        if (this.length != other.length) return false
        if (this.bytes != other.bytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.bytes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsBytes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsBytes> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsBytes =
                    WsBytes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsBytes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.bytes)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            bytes: MutPtr<UByte> = MutPtr(0L),
        ): WsBytes =
            WsBytes(
                length = length,
                bytesCtorArg = bytes,
            )
    }
}

public data class WsBytesDescription(
    public var minByteCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsBytesDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsBytesDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsBytesDescription =
                    WsBytesDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsBytesDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxByteCount)
                }
            }
    }
}

public data class WsByteArrayDescription(
    public var minByteCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsByteArrayDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsByteArrayDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsByteArrayDescription =
                    WsByteArrayDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsByteArrayDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxByteCount)
                }
            }
    }
}

public class WsCallProperty internal constructor(
    public var id: WsCallPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsCallPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsCallPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsCallProperty = WsCallProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsCallProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCallProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCallProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsCallProperty =
                    WsCallProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsCallProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsCallPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsCallProperty =
            WsCallProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsCapiAsymmetricSecurityKeyHandle(
    public var keyHandle: WsSecurityKeyHandle = WsSecurityKeyHandle(),
    public var provider: Int = 0,
    public var keySpec: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCapiAsymmetricSecurityKeyHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCapiAsymmetricSecurityKeyHandle> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsCapiAsymmetricSecurityKeyHandle =
                    WsCapiAsymmetricSecurityKeyHandle(
                        (WsSecurityKeyHandle.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsCapiAsymmetricSecurityKeyHandle) {
                    (WsSecurityKeyHandle.typeLayout()).writeNative(addr, value.keyHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.provider)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.keySpec)
                }
            }
    }
}

public class WsCertificateValidationCallbackContext internal constructor(
    public var callback: WsCertificateValidationCallback,
    stateCtorArg: MutPtr<CVoid>,
) {
    public var state: MutPtr<CVoid> = stateCtorArg
        internal set

    public constructor() : this(
        callback = null,
        stateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsCertificateValidationCallback = this.callback

    public operator fun component2(): MutPtr<CVoid> = this.state

    public fun copy(callback: WsCertificateValidationCallback = this.callback, state: MutPtr<CVoid> = this.state): WsCertificateValidationCallbackContext = WsCertificateValidationCallbackContext(callback = callback, stateCtorArg = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsCertificateValidationCallbackContext) return false
        if (this.callback != other.callback) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callback.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callback: WsCertificateValidationCallback = null,
            state: MutPtr<CVoid> = MutPtr(0L),
        ): WsCertificateValidationCallbackContext =
            WsCertificateValidationCallbackContext(
                callback = callback,
                stateCtorArg = state,
            )
    }
}

public data class WsCertCredential(
    public var credentialType: WsCertCredentialType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCertCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCertCredential> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsCertCredential =
                    WsCertCredential(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsCertCredential) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.credentialType)
                }
            }
    }
}

public data class WsCertEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var rawCertificateData: WsBytes = WsBytes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCertEndpointIdentity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCertEndpointIdentity> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsCertEndpointIdentity =
                    WsCertEndpointIdentity(
                        (WsEndpointIdentity.typeLayout()).readNative(addr),
                        (WsBytes.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsCertEndpointIdentity) {
                    (WsEndpointIdentity.typeLayout()).writeNative(addr, value.identity)
                    (WsBytes.typeLayout()).writeNative(addr + 8L, value.rawCertificateData)
                }
            }
    }
}

public data class WsCertMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCertMessageSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCertMessageSecurityBindingConstraint> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsCertMessageSecurityBindingConstraint =
                    WsCertMessageSecurityBindingConstraint(
                        (WsSecurityBindingConstraint.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsCertMessageSecurityBindingConstraint) {
                    (WsSecurityBindingConstraint.typeLayout()).writeNative(addr, value.bindingConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                }
            }
    }
}

public class WsCertSignedSamlAuthenticator internal constructor(
    public var authenticator: WsSamlAuthenticator,
    trustedIssuerCertsCtorArg: ConstPtr<ConstPtr<CertContext>>,
    public var trustedIssuerCertCount: UInt,
    decryptionCertCtorArg: ConstPtr<CertContext>,
    public var samlValidator: WsValidateSamlCallback,
    samlValidatorCallbackStateCtorArg: MutPtr<CVoid>,
) {
    public var trustedIssuerCerts: ConstPtr<ConstPtr<CertContext>> = trustedIssuerCertsCtorArg
        internal set

    public var decryptionCert: ConstPtr<CertContext> = decryptionCertCtorArg
        internal set

    public var samlValidatorCallbackState: MutPtr<CVoid> = samlValidatorCallbackStateCtorArg
        internal set

    public constructor() : this(
        authenticator = WsSamlAuthenticator(),
        trustedIssuerCertsCtorArg = ConstPtr(0L),
        trustedIssuerCertCount = 0u,
        decryptionCertCtorArg = ConstPtr(0L),
        samlValidator = null,
        samlValidatorCallbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSamlAuthenticator = this.authenticator

    public operator fun component2(): ConstPtr<ConstPtr<CertContext>> = this.trustedIssuerCerts

    public operator fun component3(): UInt = this.trustedIssuerCertCount

    public operator fun component4(): ConstPtr<CertContext> = this.decryptionCert

    public operator fun component5(): WsValidateSamlCallback = this.samlValidator

    public operator fun component6(): MutPtr<CVoid> = this.samlValidatorCallbackState

    public fun copy(authenticator: WsSamlAuthenticator = this.authenticator, trustedIssuerCerts: ConstPtr<ConstPtr<CertContext>> = this.trustedIssuerCerts, trustedIssuerCertCount: UInt = this.trustedIssuerCertCount, decryptionCert: ConstPtr<CertContext> = this.decryptionCert, samlValidator: WsValidateSamlCallback = this.samlValidator, samlValidatorCallbackState: MutPtr<CVoid> = this.samlValidatorCallbackState): WsCertSignedSamlAuthenticator = WsCertSignedSamlAuthenticator(authenticator = authenticator, trustedIssuerCertsCtorArg = trustedIssuerCerts, trustedIssuerCertCount = trustedIssuerCertCount, decryptionCertCtorArg = decryptionCert, samlValidator = samlValidator, samlValidatorCallbackStateCtorArg = samlValidatorCallbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsCertSignedSamlAuthenticator) return false
        if (this.authenticator != other.authenticator) return false
        if (this.trustedIssuerCerts != other.trustedIssuerCerts) return false
        if (this.trustedIssuerCertCount != other.trustedIssuerCertCount) return false
        if (this.decryptionCert != other.decryptionCert) return false
        if (this.samlValidator != other.samlValidator) return false
        if (this.samlValidatorCallbackState != other.samlValidatorCallbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authenticator.hashCode()
        result = 31 * result + this.trustedIssuerCerts.hashCode()
        result = 31 * result + this.trustedIssuerCertCount.hashCode()
        result = 31 * result + this.decryptionCert.hashCode()
        result = 31 * result + this.samlValidator.hashCode()
        result = 31 * result + this.samlValidatorCallbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            authenticator: WsSamlAuthenticator = WsSamlAuthenticator(),
            trustedIssuerCerts: ConstPtr<ConstPtr<CertContext>> = ConstPtr(0L),
            trustedIssuerCertCount: UInt = 0u,
            decryptionCert: ConstPtr<CertContext> = ConstPtr(0L),
            samlValidator: WsValidateSamlCallback = null,
            samlValidatorCallbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsCertSignedSamlAuthenticator =
            WsCertSignedSamlAuthenticator(
                authenticator = authenticator,
                trustedIssuerCertsCtorArg = trustedIssuerCerts,
                trustedIssuerCertCount = trustedIssuerCertCount,
                decryptionCertCtorArg = decryptionCert,
                samlValidator = samlValidator,
                samlValidatorCallbackStateCtorArg = samlValidatorCallbackState,
            )
    }
}

public class WsChannelDecoder internal constructor(
    createContextCtorArg: MutPtr<CVoid>,
    public var createDecoderCallback: WsCreateDecoderCallback,
    public var decoderGetContentTypeCallback: WsDecoderGetContentTypeCallback,
    public var decoderStartCallback: WsDecoderStartCallback,
    public var decoderDecodeCallback: WsDecoderDecodeCallback,
    public var decoderEndCallback: WsDecoderEndCallback,
    public var freeDecoderCallback: WsFreeDecoderCallback,
) {
    public var createContext: MutPtr<CVoid> = createContextCtorArg
        internal set

    public constructor() : this(
        createContextCtorArg = MutPtr(0L),
        createDecoderCallback = null,
        decoderGetContentTypeCallback = null,
        decoderStartCallback = null,
        decoderDecodeCallback = null,
        decoderEndCallback = null,
        freeDecoderCallback = null,
    )

    public operator fun component1(): MutPtr<CVoid> = this.createContext

    public operator fun component2(): WsCreateDecoderCallback = this.createDecoderCallback

    public operator fun component3(): WsDecoderGetContentTypeCallback = this.decoderGetContentTypeCallback

    public operator fun component4(): WsDecoderStartCallback = this.decoderStartCallback

    public operator fun component5(): WsDecoderDecodeCallback = this.decoderDecodeCallback

    public operator fun component6(): WsDecoderEndCallback = this.decoderEndCallback

    public operator fun component7(): WsFreeDecoderCallback = this.freeDecoderCallback

    public fun copy(createContext: MutPtr<CVoid> = this.createContext, createDecoderCallback: WsCreateDecoderCallback = this.createDecoderCallback, decoderGetContentTypeCallback: WsDecoderGetContentTypeCallback = this.decoderGetContentTypeCallback, decoderStartCallback: WsDecoderStartCallback = this.decoderStartCallback, decoderDecodeCallback: WsDecoderDecodeCallback = this.decoderDecodeCallback, decoderEndCallback: WsDecoderEndCallback = this.decoderEndCallback, freeDecoderCallback: WsFreeDecoderCallback = this.freeDecoderCallback): WsChannelDecoder = WsChannelDecoder(createContextCtorArg = createContext, createDecoderCallback = createDecoderCallback, decoderGetContentTypeCallback = decoderGetContentTypeCallback, decoderStartCallback = decoderStartCallback, decoderDecodeCallback = decoderDecodeCallback, decoderEndCallback = decoderEndCallback, freeDecoderCallback = freeDecoderCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsChannelDecoder) return false
        if (this.createContext != other.createContext) return false
        if (this.createDecoderCallback != other.createDecoderCallback) return false
        if (this.decoderGetContentTypeCallback != other.decoderGetContentTypeCallback) return false
        if (this.decoderStartCallback != other.decoderStartCallback) return false
        if (this.decoderDecodeCallback != other.decoderDecodeCallback) return false
        if (this.decoderEndCallback != other.decoderEndCallback) return false
        if (this.freeDecoderCallback != other.freeDecoderCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.createContext.hashCode()
        result = 31 * result + this.createDecoderCallback.hashCode()
        result = 31 * result + this.decoderGetContentTypeCallback.hashCode()
        result = 31 * result + this.decoderStartCallback.hashCode()
        result = 31 * result + this.decoderDecodeCallback.hashCode()
        result = 31 * result + this.decoderEndCallback.hashCode()
        result = 31 * result + this.freeDecoderCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            createContext: MutPtr<CVoid> = MutPtr(0L),
            createDecoderCallback: WsCreateDecoderCallback = null,
            decoderGetContentTypeCallback: WsDecoderGetContentTypeCallback = null,
            decoderStartCallback: WsDecoderStartCallback = null,
            decoderDecodeCallback: WsDecoderDecodeCallback = null,
            decoderEndCallback: WsDecoderEndCallback = null,
            freeDecoderCallback: WsFreeDecoderCallback = null,
        ): WsChannelDecoder =
            WsChannelDecoder(
                createContextCtorArg = createContext,
                createDecoderCallback = createDecoderCallback,
                decoderGetContentTypeCallback = decoderGetContentTypeCallback,
                decoderStartCallback = decoderStartCallback,
                decoderDecodeCallback = decoderDecodeCallback,
                decoderEndCallback = decoderEndCallback,
                freeDecoderCallback = freeDecoderCallback,
            )
    }
}

public class WsChannelEncoder internal constructor(
    createContextCtorArg: MutPtr<CVoid>,
    public var createEncoderCallback: WsCreateEncoderCallback,
    public var encoderGetContentTypeCallback: WsEncoderGetContentTypeCallback,
    public var encoderStartCallback: WsEncoderStartCallback,
    public var encoderEncodeCallback: WsEncoderEncodeCallback,
    public var encoderEndCallback: WsEncoderEndCallback,
    public var freeEncoderCallback: WsFreeEncoderCallback,
) {
    public var createContext: MutPtr<CVoid> = createContextCtorArg
        internal set

    public constructor() : this(
        createContextCtorArg = MutPtr(0L),
        createEncoderCallback = null,
        encoderGetContentTypeCallback = null,
        encoderStartCallback = null,
        encoderEncodeCallback = null,
        encoderEndCallback = null,
        freeEncoderCallback = null,
    )

    public operator fun component1(): MutPtr<CVoid> = this.createContext

    public operator fun component2(): WsCreateEncoderCallback = this.createEncoderCallback

    public operator fun component3(): WsEncoderGetContentTypeCallback = this.encoderGetContentTypeCallback

    public operator fun component4(): WsEncoderStartCallback = this.encoderStartCallback

    public operator fun component5(): WsEncoderEncodeCallback = this.encoderEncodeCallback

    public operator fun component6(): WsEncoderEndCallback = this.encoderEndCallback

    public operator fun component7(): WsFreeEncoderCallback = this.freeEncoderCallback

    public fun copy(createContext: MutPtr<CVoid> = this.createContext, createEncoderCallback: WsCreateEncoderCallback = this.createEncoderCallback, encoderGetContentTypeCallback: WsEncoderGetContentTypeCallback = this.encoderGetContentTypeCallback, encoderStartCallback: WsEncoderStartCallback = this.encoderStartCallback, encoderEncodeCallback: WsEncoderEncodeCallback = this.encoderEncodeCallback, encoderEndCallback: WsEncoderEndCallback = this.encoderEndCallback, freeEncoderCallback: WsFreeEncoderCallback = this.freeEncoderCallback): WsChannelEncoder = WsChannelEncoder(createContextCtorArg = createContext, createEncoderCallback = createEncoderCallback, encoderGetContentTypeCallback = encoderGetContentTypeCallback, encoderStartCallback = encoderStartCallback, encoderEncodeCallback = encoderEncodeCallback, encoderEndCallback = encoderEndCallback, freeEncoderCallback = freeEncoderCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsChannelEncoder) return false
        if (this.createContext != other.createContext) return false
        if (this.createEncoderCallback != other.createEncoderCallback) return false
        if (this.encoderGetContentTypeCallback != other.encoderGetContentTypeCallback) return false
        if (this.encoderStartCallback != other.encoderStartCallback) return false
        if (this.encoderEncodeCallback != other.encoderEncodeCallback) return false
        if (this.encoderEndCallback != other.encoderEndCallback) return false
        if (this.freeEncoderCallback != other.freeEncoderCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.createContext.hashCode()
        result = 31 * result + this.createEncoderCallback.hashCode()
        result = 31 * result + this.encoderGetContentTypeCallback.hashCode()
        result = 31 * result + this.encoderStartCallback.hashCode()
        result = 31 * result + this.encoderEncodeCallback.hashCode()
        result = 31 * result + this.encoderEndCallback.hashCode()
        result = 31 * result + this.freeEncoderCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            createContext: MutPtr<CVoid> = MutPtr(0L),
            createEncoderCallback: WsCreateEncoderCallback = null,
            encoderGetContentTypeCallback: WsEncoderGetContentTypeCallback = null,
            encoderStartCallback: WsEncoderStartCallback = null,
            encoderEncodeCallback: WsEncoderEncodeCallback = null,
            encoderEndCallback: WsEncoderEndCallback = null,
            freeEncoderCallback: WsFreeEncoderCallback = null,
        ): WsChannelEncoder =
            WsChannelEncoder(
                createContextCtorArg = createContext,
                createEncoderCallback = createEncoderCallback,
                encoderGetContentTypeCallback = encoderGetContentTypeCallback,
                encoderStartCallback = encoderStartCallback,
                encoderEncodeCallback = encoderEncodeCallback,
                encoderEndCallback = encoderEndCallback,
                freeEncoderCallback = freeEncoderCallback,
            )
    }
}

public class WsChannelProperties internal constructor(
    propertiesCtorArg: MutPtr<WsChannelProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsChannelProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsChannelProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsChannelProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsChannelProperties = WsChannelProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsChannelProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelProperties> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsChannelProperties =
                    WsChannelProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsChannelProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsChannelProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsChannelProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsChannelProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsChannelProperties =
            WsChannelProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsChannelProperty internal constructor(
    public var id: WsChannelPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsChannelPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsChannelPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsChannelProperty = WsChannelProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsChannelProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsChannelProperty =
                    WsChannelProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsChannelProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsChannelPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsChannelProperty =
            WsChannelProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsChannelPropertyConstraint internal constructor(
    public var id: WsChannelPropertyId,
    allowedValuesCtorArg: MutPtr<CVoid>,
    public var allowedValuesSize: UInt,
    public var out: WsChannelPropertyConstraint0,
) {
    public var allowedValues: MutPtr<CVoid> = allowedValuesCtorArg
        internal set

    public constructor() : this(
        id = 0,
        allowedValuesCtorArg = MutPtr(0L),
        allowedValuesSize = 0u,
        out = WsChannelPropertyConstraint0(),
    )

    public operator fun component1(): WsChannelPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.allowedValues

    public operator fun component3(): UInt = this.allowedValuesSize

    public operator fun component4(): WsChannelPropertyConstraint0 = this.out

    public fun copy(id: WsChannelPropertyId = this.id, allowedValues: MutPtr<CVoid> = this.allowedValues, allowedValuesSize: UInt = this.allowedValuesSize, out: WsChannelPropertyConstraint0 = this.out): WsChannelPropertyConstraint = WsChannelPropertyConstraint(id = id, allowedValuesCtorArg = allowedValues, allowedValuesSize = allowedValuesSize, out = out)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsChannelPropertyConstraint) return false
        if (this.id != other.id) return false
        if (this.allowedValues != other.allowedValues) return false
        if (this.allowedValuesSize != other.allowedValuesSize) return false
        if (this.out != other.out) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.allowedValues.hashCode()
        result = 31 * result + this.allowedValuesSize.hashCode()
        result = 31 * result + this.out.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelPropertyConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelPropertyConstraint> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsChannelPropertyConstraint =
                    WsChannelPropertyConstraint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (WsChannelPropertyConstraint0.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsChannelPropertyConstraint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.allowedValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allowedValuesSize)
                    (WsChannelPropertyConstraint0.typeLayout()).writeNative(addr + 24L, value.out)
                }
            }

        public operator fun invoke(
            id: WsChannelPropertyId = 0,
            allowedValues: MutPtr<CVoid> = MutPtr(0L),
            allowedValuesSize: UInt = 0u,
            out: WsChannelPropertyConstraint0 = WsChannelPropertyConstraint0(),
        ): WsChannelPropertyConstraint =
            WsChannelPropertyConstraint(
                id = id,
                allowedValuesCtorArg = allowedValues,
                allowedValuesSize = allowedValuesSize,
                out = out,
            )
    }
}

public data class WsChannelPropertyConstraint0(
    public var channelProperty: WsChannelProperty = WsChannelProperty(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelPropertyConstraint0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsChannelPropertyConstraint0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsChannelPropertyConstraint0 =
                    WsChannelPropertyConstraint0(
                        (WsChannelProperty.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsChannelPropertyConstraint0) {
                    (WsChannelProperty.typeLayout()).writeNative(addr, value.channelProperty)
                }
            }
    }
}

public data class WsCharArrayDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCharArrayDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsCharArrayDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsCharArrayDescription =
                    WsCharArrayDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsCharArrayDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minCharCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxCharCount)
                }
            }
    }
}

public class WsContractDescription internal constructor(
    public var operationCount: UInt,
    operationsCtorArg: MutPtr<MutPtr<WsOperationDescription>>,
) {
    public var operations: MutPtr<MutPtr<WsOperationDescription>> = operationsCtorArg
        internal set

    public constructor() : this(
        operationCount = 0u,
        operationsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.operationCount

    public operator fun component2(): MutPtr<MutPtr<WsOperationDescription>> = this.operations

    public fun copy(operationCount: UInt = this.operationCount, operations: MutPtr<MutPtr<WsOperationDescription>> = this.operations): WsContractDescription = WsContractDescription(operationCount = operationCount, operationsCtorArg = operations)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsContractDescription) return false
        if (this.operationCount != other.operationCount) return false
        if (this.operations != other.operations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCount.hashCode()
        result = 31 * result + this.operations.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsContractDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsContractDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsContractDescription =
                    WsContractDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsOperationDescription>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsContractDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.operationCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsOperationDescription>>(64)
                    ).writeNative(addr + 8L, value.operations)
                }
            }

        public operator fun invoke(
            operationCount: UInt = 0u,
            operations: MutPtr<MutPtr<WsOperationDescription>> = MutPtr(0L),
        ): WsContractDescription =
            WsContractDescription(
                operationCount = operationCount,
                operationsCtorArg = operations,
            )
    }
}

public class WsCustomCertCredential internal constructor(
    public var credential: WsCertCredential,
    public var getCertCallback: WsGetCertCallback,
    getCertCallbackStateCtorArg: MutPtr<CVoid>,
    public var certIssuerListNotificationCallback: WsCertIssuerListNotificationCallback,
    certIssuerListNotificationCallbackStateCtorArg: MutPtr<CVoid>,
) {
    public var getCertCallbackState: MutPtr<CVoid> = getCertCallbackStateCtorArg
        internal set

    public var certIssuerListNotificationCallbackState: MutPtr<CVoid> = certIssuerListNotificationCallbackStateCtorArg
        internal set

    public constructor() : this(
        credential = WsCertCredential(),
        getCertCallback = null,
        getCertCallbackStateCtorArg = MutPtr(0L),
        certIssuerListNotificationCallback = null,
        certIssuerListNotificationCallbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsCertCredential = this.credential

    public operator fun component2(): WsGetCertCallback = this.getCertCallback

    public operator fun component3(): MutPtr<CVoid> = this.getCertCallbackState

    public operator fun component4(): WsCertIssuerListNotificationCallback = this.certIssuerListNotificationCallback

    public operator fun component5(): MutPtr<CVoid> = this.certIssuerListNotificationCallbackState

    public fun copy(credential: WsCertCredential = this.credential, getCertCallback: WsGetCertCallback = this.getCertCallback, getCertCallbackState: MutPtr<CVoid> = this.getCertCallbackState, certIssuerListNotificationCallback: WsCertIssuerListNotificationCallback = this.certIssuerListNotificationCallback, certIssuerListNotificationCallbackState: MutPtr<CVoid> = this.certIssuerListNotificationCallbackState): WsCustomCertCredential = WsCustomCertCredential(credential = credential, getCertCallback = getCertCallback, getCertCallbackStateCtorArg = getCertCallbackState, certIssuerListNotificationCallback = certIssuerListNotificationCallback, certIssuerListNotificationCallbackStateCtorArg = certIssuerListNotificationCallbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsCustomCertCredential) return false
        if (this.credential != other.credential) return false
        if (this.getCertCallback != other.getCertCallback) return false
        if (this.getCertCallbackState != other.getCertCallbackState) return false
        if (this.certIssuerListNotificationCallback != other.certIssuerListNotificationCallback) return false
        if (this.certIssuerListNotificationCallbackState != other.certIssuerListNotificationCallbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.credential.hashCode()
        result = 31 * result + this.getCertCallback.hashCode()
        result = 31 * result + this.getCertCallbackState.hashCode()
        result = 31 * result + this.certIssuerListNotificationCallback.hashCode()
        result = 31 * result + this.certIssuerListNotificationCallbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            credential: WsCertCredential = WsCertCredential(),
            getCertCallback: WsGetCertCallback = null,
            getCertCallbackState: MutPtr<CVoid> = MutPtr(0L),
            certIssuerListNotificationCallback: WsCertIssuerListNotificationCallback = null,
            certIssuerListNotificationCallbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsCustomCertCredential =
            WsCustomCertCredential(
                credential = credential,
                getCertCallback = getCertCallback,
                getCertCallbackStateCtorArg = getCertCallbackState,
                certIssuerListNotificationCallback = certIssuerListNotificationCallback,
                certIssuerListNotificationCallbackStateCtorArg = certIssuerListNotificationCallbackState,
            )
    }
}

public data class WsCustomChannelCallbacks(
    public var createChannelCallback: WsCreateChannelCallback = null,
    public var freeChannelCallback: WsFreeChannelCallback = null,
    public var resetChannelCallback: WsResetChannelCallback = null,
    public var openChannelCallback: WsOpenChannelCallback = null,
    public var closeChannelCallback: WsCloseChannelCallback = null,
    public var abortChannelCallback: WsAbortChannelCallback = null,
    public var getChannelPropertyCallback: WsGetChannelPropertyCallback = null,
    public var setChannelPropertyCallback: WsSetChannelPropertyCallback = null,
    public var writeMessageStartCallback: WsWriteMessageStartCallback = null,
    public var writeMessageEndCallback: WsWriteMessageEndCallback = null,
    public var readMessageStartCallback: WsReadMessageStartCallback = null,
    public var readMessageEndCallback: WsReadMessageEndCallback = null,
    public var abandonMessageCallback: WsAbandonMessageCallback = null,
    public var shutdownSessionChannelCallback: WsShutdownSessionChannelCallback = null,
)

public data class WsCustomHttpProxy(
    public var servers: WsString = WsString(),
    public var bypass: WsString = WsString(),
)

public data class WsCustomListenerCallbacks(
    public var createListenerCallback: WsCreateListenerCallback = null,
    public var freeListenerCallback: WsFreeListenerCallback = null,
    public var resetListenerCallback: WsResetListenerCallback = null,
    public var openListenerCallback: WsOpenListenerCallback = null,
    public var closeListenerCallback: WsCloseListenerCallback = null,
    public var abortListenerCallback: WsAbortListenerCallback = null,
    public var getListenerPropertyCallback: WsGetListenerPropertyCallback = null,
    public var setListenerPropertyCallback: WsSetListenerPropertyCallback = null,
    public var createChannelForListenerCallback: WsCreateChannelForListenerCallback = null,
    public var acceptChannelCallback: WsAcceptChannelCallback = null,
)

public class WsCustomTypeDescription internal constructor(
    public var size: UInt,
    public var alignment: UInt,
    public var readCallback: WsReadTypeCallback,
    public var writeCallback: WsWriteTypeCallback,
    descriptionDataCtorArg: MutPtr<CVoid>,
    public var isDefaultValueCallback: WsIsDefaultValueCallback,
) {
    public var descriptionData: MutPtr<CVoid> = descriptionDataCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        alignment = 0u,
        readCallback = null,
        writeCallback = null,
        descriptionDataCtorArg = MutPtr(0L),
        isDefaultValueCallback = null,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.alignment

    public operator fun component3(): WsReadTypeCallback = this.readCallback

    public operator fun component4(): WsWriteTypeCallback = this.writeCallback

    public operator fun component5(): MutPtr<CVoid> = this.descriptionData

    public operator fun component6(): WsIsDefaultValueCallback = this.isDefaultValueCallback

    public fun copy(size: UInt = this.size, alignment: UInt = this.alignment, readCallback: WsReadTypeCallback = this.readCallback, writeCallback: WsWriteTypeCallback = this.writeCallback, descriptionData: MutPtr<CVoid> = this.descriptionData, isDefaultValueCallback: WsIsDefaultValueCallback = this.isDefaultValueCallback): WsCustomTypeDescription = WsCustomTypeDescription(size = size, alignment = alignment, readCallback = readCallback, writeCallback = writeCallback, descriptionDataCtorArg = descriptionData, isDefaultValueCallback = isDefaultValueCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsCustomTypeDescription) return false
        if (this.size != other.size) return false
        if (this.alignment != other.alignment) return false
        if (this.readCallback != other.readCallback) return false
        if (this.writeCallback != other.writeCallback) return false
        if (this.descriptionData != other.descriptionData) return false
        if (this.isDefaultValueCallback != other.isDefaultValueCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.readCallback.hashCode()
        result = 31 * result + this.writeCallback.hashCode()
        result = 31 * result + this.descriptionData.hashCode()
        result = 31 * result + this.isDefaultValueCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            alignment: UInt = 0u,
            readCallback: WsReadTypeCallback = null,
            writeCallback: WsWriteTypeCallback = null,
            descriptionData: MutPtr<CVoid> = MutPtr(0L),
            isDefaultValueCallback: WsIsDefaultValueCallback = null,
        ): WsCustomTypeDescription =
            WsCustomTypeDescription(
                size = size,
                alignment = alignment,
                readCallback = readCallback,
                writeCallback = writeCallback,
                descriptionDataCtorArg = descriptionData,
                isDefaultValueCallback = isDefaultValueCallback,
            )
    }
}

public data class WsDatetime(
    public var ticks: ULong = 0uL,
    public var format: WsDatetimeFormat = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDatetime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDatetime> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsDatetime =
                    WsDatetime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsDatetime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.format)
                }
            }
    }
}

public data class WsDatetimeDescription(
    public var minValue: WsDatetime = WsDatetime(),
    public var maxValue: WsDatetime = WsDatetime(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDatetimeDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDatetimeDescription> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsDatetimeDescription =
                    WsDatetimeDescription(
                        (WsDatetime.typeLayout()).readNative(addr),
                        (WsDatetime.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsDatetimeDescription) {
                    (WsDatetime.typeLayout()).writeNative(addr, value.minValue)
                    (WsDatetime.typeLayout()).writeNative(addr + 16L, value.maxValue)
                }
            }
    }
}

public data class WsDecimalDescription(
    public var minValue: Decimal = Decimal(),
    public var maxValue: Decimal = Decimal(),
)

public class WsDefaultValue internal constructor(
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.value

    public operator fun component2(): UInt = this.valueSize

    public fun copy(value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsDefaultValue = WsDefaultValue(valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsDefaultValue) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDefaultValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDefaultValue> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsDefaultValue =
                    WsDefaultValue(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsDefaultValue) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.valueSize)
                }
            }

        public operator fun invoke(
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsDefaultValue =
            WsDefaultValue(
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsDefaultWindowsIntegratedAuthCredential(
    public var credential: WsWindowsIntegratedAuthCredential = WsWindowsIntegratedAuthCredential(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDefaultWindowsIntegratedAuthCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDefaultWindowsIntegratedAuthCredential> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsDefaultWindowsIntegratedAuthCredential =
                    WsDefaultWindowsIntegratedAuthCredential(
                        (WsWindowsIntegratedAuthCredential.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsDefaultWindowsIntegratedAuthCredential) {
                    (WsWindowsIntegratedAuthCredential.typeLayout()).writeNative(addr, value.credential)
                }
            }
    }
}

public class WsDisallowedUserAgentSubstrings internal constructor(
    public var subStringCount: UInt,
    subStringsCtorArg: MutPtr<MutPtr<WsString>>,
) {
    public var subStrings: MutPtr<MutPtr<WsString>> = subStringsCtorArg
        internal set

    public constructor() : this(
        subStringCount = 0u,
        subStringsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.subStringCount

    public operator fun component2(): MutPtr<MutPtr<WsString>> = this.subStrings

    public fun copy(subStringCount: UInt = this.subStringCount, subStrings: MutPtr<MutPtr<WsString>> = this.subStrings): WsDisallowedUserAgentSubstrings = WsDisallowedUserAgentSubstrings(subStringCount = subStringCount, subStringsCtorArg = subStrings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsDisallowedUserAgentSubstrings) return false
        if (this.subStringCount != other.subStringCount) return false
        if (this.subStrings != other.subStrings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subStringCount.hashCode()
        result = 31 * result + this.subStrings.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDisallowedUserAgentSubstrings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDisallowedUserAgentSubstrings> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsDisallowedUserAgentSubstrings =
                    WsDisallowedUserAgentSubstrings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsString>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsDisallowedUserAgentSubstrings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.subStringCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsString>>(64)
                    ).writeNative(addr + 8L, value.subStrings)
                }
            }

        public operator fun invoke(
            subStringCount: UInt = 0u,
            subStrings: MutPtr<MutPtr<WsString>> = MutPtr(0L),
        ): WsDisallowedUserAgentSubstrings =
            WsDisallowedUserAgentSubstrings(
                subStringCount = subStringCount,
                subStringsCtorArg = subStrings,
            )
    }
}

public data class WsDnsEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var dns: WsString = WsString(),
)

public data class WsDoubleDescription(
    public var minValue: Double = 0.0,
    public var maxValue: Double = 0.0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDoubleDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsDoubleDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsDoubleDescription =
                    WsDoubleDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsDoubleDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 8L, value.maxValue)
                }
            }
    }
}

public data class WsDuration(
    public var negative: Bool = 0,
    public var years: UInt = 0u,
    public var months: UInt = 0u,
    public var days: UInt = 0u,
    public var hours: UInt = 0u,
    public var minutes: UInt = 0u,
    public var seconds: UInt = 0u,
    public var milliseconds: UInt = 0u,
    public var ticks: UInt = 0u,
)

public data class WsDurationDescription(
    public var minValue: WsDuration = WsDuration(),
    public var maxValue: WsDuration = WsDuration(),
    public var comparer: WsDurationComparisonCallback = null,
)

public class WsElementDescription internal constructor(
    elementLocalNameCtorArg: MutPtr<WsXmlString>,
    elementNsCtorArg: MutPtr<WsXmlString>,
    public var type: WsType,
    typeDescriptionCtorArg: MutPtr<CVoid>,
) {
    public var elementLocalName: MutPtr<WsXmlString> = elementLocalNameCtorArg
        internal set

    public var elementNs: MutPtr<WsXmlString> = elementNsCtorArg
        internal set

    public var typeDescription: MutPtr<CVoid> = typeDescriptionCtorArg
        internal set

    public constructor() : this(
        elementLocalNameCtorArg = MutPtr(0L),
        elementNsCtorArg = MutPtr(0L),
        type = 0,
        typeDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlString> = this.elementLocalName

    public operator fun component2(): MutPtr<WsXmlString> = this.elementNs

    public operator fun component3(): WsType = this.type

    public operator fun component4(): MutPtr<CVoid> = this.typeDescription

    public fun copy(elementLocalName: MutPtr<WsXmlString> = this.elementLocalName, elementNs: MutPtr<WsXmlString> = this.elementNs, type: WsType = this.type, typeDescription: MutPtr<CVoid> = this.typeDescription): WsElementDescription = WsElementDescription(elementLocalNameCtorArg = elementLocalName, elementNsCtorArg = elementNs, type = type, typeDescriptionCtorArg = typeDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsElementDescription) return false
        if (this.elementLocalName != other.elementLocalName) return false
        if (this.elementNs != other.elementNs) return false
        if (this.type != other.type) return false
        if (this.typeDescription != other.typeDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elementLocalName.hashCode()
        result = 31 * result + this.elementNs.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.typeDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsElementDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsElementDescription> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsElementDescription =
                    WsElementDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsElementDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr, value.elementLocalName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.elementNs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.typeDescription)
                }
            }

        public operator fun invoke(
            elementLocalName: MutPtr<WsXmlString> = MutPtr(0L),
            elementNs: MutPtr<WsXmlString> = MutPtr(0L),
            type: WsType = 0,
            typeDescription: MutPtr<CVoid> = MutPtr(0L),
        ): WsElementDescription =
            WsElementDescription(
                elementLocalNameCtorArg = elementLocalName,
                elementNsCtorArg = elementNs,
                type = type,
                typeDescriptionCtorArg = typeDescription,
            )
    }
}

public class WsEndpointAddress internal constructor(
    public var url: WsString,
    headersCtorArg: MutPtr<WsXmlBuffer>,
    extensionsCtorArg: MutPtr<WsXmlBuffer>,
    identityCtorArg: MutPtr<WsEndpointIdentity>,
) {
    public var headers: MutPtr<WsXmlBuffer> = headersCtorArg
        internal set

    public var extensions: MutPtr<WsXmlBuffer> = extensionsCtorArg
        internal set

    public var identity: MutPtr<WsEndpointIdentity> = identityCtorArg
        internal set

    public constructor() : this(
        url = WsString(),
        headersCtorArg = MutPtr(0L),
        extensionsCtorArg = MutPtr(0L),
        identityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsString = this.url

    public operator fun component2(): MutPtr<WsXmlBuffer> = this.headers

    public operator fun component3(): MutPtr<WsXmlBuffer> = this.extensions

    public operator fun component4(): MutPtr<WsEndpointIdentity> = this.identity

    public fun copy(url: WsString = this.url, headers: MutPtr<WsXmlBuffer> = this.headers, extensions: MutPtr<WsXmlBuffer> = this.extensions, identity: MutPtr<WsEndpointIdentity> = this.identity): WsEndpointAddress = WsEndpointAddress(url = url, headersCtorArg = headers, extensionsCtorArg = extensions, identityCtorArg = identity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsEndpointAddress) return false
        if (this.url != other.url) return false
        if (this.headers != other.headers) return false
        if (this.extensions != other.extensions) return false
        if (this.identity != other.identity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.url.hashCode()
        result = 31 * result + this.headers.hashCode()
        result = 31 * result + this.extensions.hashCode()
        result = 31 * result + this.identity.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            url: WsString = WsString(),
            headers: MutPtr<WsXmlBuffer> = MutPtr(0L),
            extensions: MutPtr<WsXmlBuffer> = MutPtr(0L),
            identity: MutPtr<WsEndpointIdentity> = MutPtr(0L),
        ): WsEndpointAddress =
            WsEndpointAddress(
                url = url,
                headersCtorArg = headers,
                extensionsCtorArg = extensions,
                identityCtorArg = identity,
            )
    }
}

public data class WsEndpointAddressDescription(
    public var addressingVersion: WsAddressingVersion = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointAddressDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointAddressDescription> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsEndpointAddressDescription =
                    WsEndpointAddressDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsEndpointAddressDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.addressingVersion)
                }
            }
    }
}

public data class WsEndpointIdentity(
    public var identityType: WsEndpointIdentityType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointIdentity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointIdentity> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsEndpointIdentity =
                    WsEndpointIdentity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsEndpointIdentity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.identityType)
                }
            }
    }
}

public class WsEndpointPolicyExtension internal constructor(
    public var policyExtension: WsPolicyExtension,
    assertionNameCtorArg: MutPtr<WsXmlString>,
    assertionNsCtorArg: MutPtr<WsXmlString>,
    public var out: WsEndpointPolicyExtension0,
) {
    public var assertionName: MutPtr<WsXmlString> = assertionNameCtorArg
        internal set

    public var assertionNs: MutPtr<WsXmlString> = assertionNsCtorArg
        internal set

    public constructor() : this(
        policyExtension = WsPolicyExtension(),
        assertionNameCtorArg = MutPtr(0L),
        assertionNsCtorArg = MutPtr(0L),
        out = WsEndpointPolicyExtension0(),
    )

    public operator fun component1(): WsPolicyExtension = this.policyExtension

    public operator fun component2(): MutPtr<WsXmlString> = this.assertionName

    public operator fun component3(): MutPtr<WsXmlString> = this.assertionNs

    public operator fun component4(): WsEndpointPolicyExtension0 = this.out

    public fun copy(policyExtension: WsPolicyExtension = this.policyExtension, assertionName: MutPtr<WsXmlString> = this.assertionName, assertionNs: MutPtr<WsXmlString> = this.assertionNs, out: WsEndpointPolicyExtension0 = this.out): WsEndpointPolicyExtension = WsEndpointPolicyExtension(policyExtension = policyExtension, assertionNameCtorArg = assertionName, assertionNsCtorArg = assertionNs, out = out)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsEndpointPolicyExtension) return false
        if (this.policyExtension != other.policyExtension) return false
        if (this.assertionName != other.assertionName) return false
        if (this.assertionNs != other.assertionNs) return false
        if (this.out != other.out) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.policyExtension.hashCode()
        result = 31 * result + this.assertionName.hashCode()
        result = 31 * result + this.assertionNs.hashCode()
        result = 31 * result + this.out.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointPolicyExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointPolicyExtension> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsEndpointPolicyExtension =
                    WsEndpointPolicyExtension(
                        (WsPolicyExtension.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 16L),
                        (WsEndpointPolicyExtension0.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsEndpointPolicyExtension) {
                    (WsPolicyExtension.typeLayout()).writeNative(addr, value.policyExtension)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.assertionName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 16L, value.assertionNs)
                    (WsEndpointPolicyExtension0.typeLayout()).writeNative(addr + 24L, value.out)
                }
            }

        public operator fun invoke(
            policyExtension: WsPolicyExtension = WsPolicyExtension(),
            assertionName: MutPtr<WsXmlString> = MutPtr(0L),
            assertionNs: MutPtr<WsXmlString> = MutPtr(0L),
            out: WsEndpointPolicyExtension0 = WsEndpointPolicyExtension0(),
        ): WsEndpointPolicyExtension =
            WsEndpointPolicyExtension(
                policyExtension = policyExtension,
                assertionNameCtorArg = assertionName,
                assertionNsCtorArg = assertionNs,
                out = out,
            )
    }
}

public class WsEndpointPolicyExtension0 internal constructor(
    assertionValueCtorArg: MutPtr<WsXmlBuffer>,
) {
    public var assertionValue: MutPtr<WsXmlBuffer> = assertionValueCtorArg
        internal set

    public constructor() : this(
        assertionValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlBuffer> = this.assertionValue

    public fun copy(assertionValue: MutPtr<WsXmlBuffer> = this.assertionValue): WsEndpointPolicyExtension0 = WsEndpointPolicyExtension0(assertionValueCtorArg = assertionValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsEndpointPolicyExtension0) return false
        if (this.assertionValue != other.assertionValue) return false
        return true
    }

    override fun hashCode(): Int = this.assertionValue.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointPolicyExtension0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEndpointPolicyExtension0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsEndpointPolicyExtension0 =
                    WsEndpointPolicyExtension0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlBuffer>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsEndpointPolicyExtension0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlBuffer>(64)
                    ).writeNative(addr, value.assertionValue)
                }
            }

        public operator fun invoke(
            assertionValue: MutPtr<WsXmlBuffer> = MutPtr(0L),
        ): WsEndpointPolicyExtension0 =
            WsEndpointPolicyExtension0(
                assertionValueCtorArg = assertionValue,
            )
    }
}

public class WsEnumDescription internal constructor(
    valuesCtorArg: MutPtr<WsEnumValue>,
    public var valueCount: UInt,
    public var maxByteCount: UInt,
    nameIndicesCtorArg: MutPtr<UInt>,
) {
    public var values: MutPtr<WsEnumValue> = valuesCtorArg
        internal set

    public var nameIndices: MutPtr<UInt> = nameIndicesCtorArg
        internal set

    public constructor() : this(
        valuesCtorArg = MutPtr(0L),
        valueCount = 0u,
        maxByteCount = 0u,
        nameIndicesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsEnumValue> = this.values

    public operator fun component2(): UInt = this.valueCount

    public operator fun component3(): UInt = this.maxByteCount

    public operator fun component4(): MutPtr<UInt> = this.nameIndices

    public fun copy(values: MutPtr<WsEnumValue> = this.values, valueCount: UInt = this.valueCount, maxByteCount: UInt = this.maxByteCount, nameIndices: MutPtr<UInt> = this.nameIndices): WsEnumDescription = WsEnumDescription(valuesCtorArg = values, valueCount = valueCount, maxByteCount = maxByteCount, nameIndicesCtorArg = nameIndices)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsEnumDescription) return false
        if (this.values != other.values) return false
        if (this.valueCount != other.valueCount) return false
        if (this.maxByteCount != other.maxByteCount) return false
        if (this.nameIndices != other.nameIndices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.values.hashCode()
        result = 31 * result + this.valueCount.hashCode()
        result = 31 * result + this.maxByteCount.hashCode()
        result = 31 * result + this.nameIndices.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEnumDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEnumDescription> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsEnumDescription =
                    WsEnumDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsEnumValue>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsEnumDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsEnumValue>(64)
                    ).writeNative(addr, value.values)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.valueCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxByteCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 16L, value.nameIndices)
                }
            }

        public operator fun invoke(
            values: MutPtr<WsEnumValue> = MutPtr(0L),
            valueCount: UInt = 0u,
            maxByteCount: UInt = 0u,
            nameIndices: MutPtr<UInt> = MutPtr(0L),
        ): WsEnumDescription =
            WsEnumDescription(
                valuesCtorArg = values,
                valueCount = valueCount,
                maxByteCount = maxByteCount,
                nameIndicesCtorArg = nameIndices,
            )
    }
}

public class WsEnumValue internal constructor(
    public var value: Int,
    nameCtorArg: MutPtr<WsXmlString>,
) {
    public var name: MutPtr<WsXmlString> = nameCtorArg
        internal set

    public constructor() : this(
        value = 0,
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.value

    public operator fun component2(): MutPtr<WsXmlString> = this.name

    public fun copy(value: Int = this.value, name: MutPtr<WsXmlString> = this.name): WsEnumValue = WsEnumValue(value = value, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsEnumValue) return false
        if (this.value != other.value) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEnumValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsEnumValue> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsEnumValue =
                    WsEnumValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsEnumValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.name)
                }
            }

        public operator fun invoke(
            value: Int = 0,
            name: MutPtr<WsXmlString> = MutPtr(0L),
        ): WsEnumValue =
            WsEnumValue(
                value = value,
                nameCtorArg = name,
            )
    }
}

public class WsErrorProperty internal constructor(
    public var id: WsErrorPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsErrorPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsErrorPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsErrorProperty = WsErrorProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsErrorProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsErrorProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsErrorProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsErrorProperty =
                    WsErrorProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsErrorProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsErrorPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsErrorProperty =
            WsErrorProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsFault internal constructor(
    codeCtorArg: MutPtr<WsFaultCode>,
    reasonsCtorArg: MutPtr<WsFaultReason>,
    public var reasonCount: UInt,
    public var actor: WsString,
    public var node: WsString,
    detailCtorArg: MutPtr<WsXmlBuffer>,
) {
    public var code: MutPtr<WsFaultCode> = codeCtorArg
        internal set

    public var reasons: MutPtr<WsFaultReason> = reasonsCtorArg
        internal set

    public var detail: MutPtr<WsXmlBuffer> = detailCtorArg
        internal set

    public constructor() : this(
        codeCtorArg = MutPtr(0L),
        reasonsCtorArg = MutPtr(0L),
        reasonCount = 0u,
        actor = WsString(),
        node = WsString(),
        detailCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsFaultCode> = this.code

    public operator fun component2(): MutPtr<WsFaultReason> = this.reasons

    public operator fun component3(): UInt = this.reasonCount

    public operator fun component4(): WsString = this.actor

    public operator fun component5(): WsString = this.node

    public operator fun component6(): MutPtr<WsXmlBuffer> = this.detail

    public fun copy(code: MutPtr<WsFaultCode> = this.code, reasons: MutPtr<WsFaultReason> = this.reasons, reasonCount: UInt = this.reasonCount, actor: WsString = this.actor, node: WsString = this.node, detail: MutPtr<WsXmlBuffer> = this.detail): WsFault = WsFault(codeCtorArg = code, reasonsCtorArg = reasons, reasonCount = reasonCount, actor = actor, node = node, detailCtorArg = detail)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsFault) return false
        if (this.code != other.code) return false
        if (this.reasons != other.reasons) return false
        if (this.reasonCount != other.reasonCount) return false
        if (this.actor != other.actor) return false
        if (this.node != other.node) return false
        if (this.detail != other.detail) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.reasons.hashCode()
        result = 31 * result + this.reasonCount.hashCode()
        result = 31 * result + this.actor.hashCode()
        result = 31 * result + this.node.hashCode()
        result = 31 * result + this.detail.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            code: MutPtr<WsFaultCode> = MutPtr(0L),
            reasons: MutPtr<WsFaultReason> = MutPtr(0L),
            reasonCount: UInt = 0u,
            actor: WsString = WsString(),
            node: WsString = WsString(),
            detail: MutPtr<WsXmlBuffer> = MutPtr(0L),
        ): WsFault =
            WsFault(
                codeCtorArg = code,
                reasonsCtorArg = reasons,
                reasonCount = reasonCount,
                actor = actor,
                node = node,
                detailCtorArg = detail,
            )
    }
}

public class WsFaultCode internal constructor(
    public var value: WsXmlQname,
    subCodeCtorArg: MutPtr<WsFaultCode>,
) {
    public var subCode: MutPtr<WsFaultCode> = subCodeCtorArg
        internal set

    public constructor() : this(
        value = WsXmlQname(),
        subCodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlQname = this.value

    public operator fun component2(): MutPtr<WsFaultCode> = this.subCode

    public fun copy(value: WsXmlQname = this.value, subCode: MutPtr<WsFaultCode> = this.subCode): WsFaultCode = WsFaultCode(value = value, subCodeCtorArg = subCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsFaultCode) return false
        if (this.value != other.value) return false
        if (this.subCode != other.subCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.subCode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFaultCode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFaultCode> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsFaultCode =
                    WsFaultCode(
                        (WsXmlQname.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsFaultCode>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: WsFaultCode) {
                    (WsXmlQname.typeLayout()).writeNative(addr, value.value)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsFaultCode>(64)
                    ).writeNative(addr + 64L, value.subCode)
                }
            }

        public operator fun invoke(
            value: WsXmlQname = WsXmlQname(),
            subCode: MutPtr<WsFaultCode> = MutPtr(0L),
        ): WsFaultCode =
            WsFaultCode(
                value = value,
                subCodeCtorArg = subCode,
            )
    }
}

public data class WsFaultDescription(
    public var envelopeVersion: WsEnvelopeVersion = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFaultDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFaultDescription> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsFaultDescription =
                    WsFaultDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsFaultDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.envelopeVersion)
                }
            }
    }
}

public class WsFaultDetailDescription internal constructor(
    actionCtorArg: MutPtr<WsXmlString>,
    detailElementDescriptionCtorArg: MutPtr<WsElementDescription>,
) {
    public var action: MutPtr<WsXmlString> = actionCtorArg
        internal set

    public var detailElementDescription: MutPtr<WsElementDescription> = detailElementDescriptionCtorArg
        internal set

    public constructor() : this(
        actionCtorArg = MutPtr(0L),
        detailElementDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlString> = this.action

    public operator fun component2(): MutPtr<WsElementDescription> = this.detailElementDescription

    public fun copy(action: MutPtr<WsXmlString> = this.action, detailElementDescription: MutPtr<WsElementDescription> = this.detailElementDescription): WsFaultDetailDescription = WsFaultDetailDescription(actionCtorArg = action, detailElementDescriptionCtorArg = detailElementDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsFaultDetailDescription) return false
        if (this.action != other.action) return false
        if (this.detailElementDescription != other.detailElementDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.action.hashCode()
        result = 31 * result + this.detailElementDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFaultDetailDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFaultDetailDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsFaultDetailDescription =
                    WsFaultDetailDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsElementDescription>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsFaultDetailDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr, value.action)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsElementDescription>(64)
                    ).writeNative(addr + 8L, value.detailElementDescription)
                }
            }

        public operator fun invoke(
            action: MutPtr<WsXmlString> = MutPtr(0L),
            detailElementDescription: MutPtr<WsElementDescription> = MutPtr(0L),
        ): WsFaultDetailDescription =
            WsFaultDetailDescription(
                actionCtorArg = action,
                detailElementDescriptionCtorArg = detailElementDescription,
            )
    }
}

public data class WsFaultReason(
    public var text: WsString = WsString(),
    public var lang: WsString = WsString(),
)

public class WsFieldDescription internal constructor(
    public var mapping: WsFieldMapping,
    localNameCtorArg: MutPtr<WsXmlString>,
    nsCtorArg: MutPtr<WsXmlString>,
    public var type: WsType,
    typeDescriptionCtorArg: MutPtr<CVoid>,
    public var offset: UInt,
    public var options: UInt,
    defaultValueCtorArg: MutPtr<WsDefaultValue>,
    public var countOffset: UInt,
    itemLocalNameCtorArg: MutPtr<WsXmlString>,
    itemNsCtorArg: MutPtr<WsXmlString>,
    itemRangeCtorArg: MutPtr<WsItemRange>,
) {
    public var localName: MutPtr<WsXmlString> = localNameCtorArg
        internal set

    public var ns: MutPtr<WsXmlString> = nsCtorArg
        internal set

    public var typeDescription: MutPtr<CVoid> = typeDescriptionCtorArg
        internal set

    public var defaultValue: MutPtr<WsDefaultValue> = defaultValueCtorArg
        internal set

    public var itemLocalName: MutPtr<WsXmlString> = itemLocalNameCtorArg
        internal set

    public var itemNs: MutPtr<WsXmlString> = itemNsCtorArg
        internal set

    public var itemRange: MutPtr<WsItemRange> = itemRangeCtorArg
        internal set

    public constructor() : this(
        mapping = 0,
        localNameCtorArg = MutPtr(0L),
        nsCtorArg = MutPtr(0L),
        type = 0,
        typeDescriptionCtorArg = MutPtr(0L),
        offset = 0u,
        options = 0u,
        defaultValueCtorArg = MutPtr(0L),
        countOffset = 0u,
        itemLocalNameCtorArg = MutPtr(0L),
        itemNsCtorArg = MutPtr(0L),
        itemRangeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsFieldMapping = this.mapping

    public operator fun component2(): MutPtr<WsXmlString> = this.localName

    public operator fun component3(): MutPtr<WsXmlString> = this.ns

    public operator fun component4(): WsType = this.type

    public operator fun component5(): MutPtr<CVoid> = this.typeDescription

    public operator fun component6(): UInt = this.offset

    public operator fun component7(): UInt = this.options

    public operator fun component8(): MutPtr<WsDefaultValue> = this.defaultValue

    public operator fun component9(): UInt = this.countOffset

    public operator fun component10(): MutPtr<WsXmlString> = this.itemLocalName

    public operator fun component11(): MutPtr<WsXmlString> = this.itemNs

    public operator fun component12(): MutPtr<WsItemRange> = this.itemRange

    public fun copy(mapping: WsFieldMapping = this.mapping, localName: MutPtr<WsXmlString> = this.localName, ns: MutPtr<WsXmlString> = this.ns, type: WsType = this.type, typeDescription: MutPtr<CVoid> = this.typeDescription, offset: UInt = this.offset, options: UInt = this.options, defaultValue: MutPtr<WsDefaultValue> = this.defaultValue, countOffset: UInt = this.countOffset, itemLocalName: MutPtr<WsXmlString> = this.itemLocalName, itemNs: MutPtr<WsXmlString> = this.itemNs, itemRange: MutPtr<WsItemRange> = this.itemRange): WsFieldDescription = WsFieldDescription(mapping = mapping, localNameCtorArg = localName, nsCtorArg = ns, type = type, typeDescriptionCtorArg = typeDescription, offset = offset, options = options, defaultValueCtorArg = defaultValue, countOffset = countOffset, itemLocalNameCtorArg = itemLocalName, itemNsCtorArg = itemNs, itemRangeCtorArg = itemRange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsFieldDescription) return false
        if (this.mapping != other.mapping) return false
        if (this.localName != other.localName) return false
        if (this.ns != other.ns) return false
        if (this.type != other.type) return false
        if (this.typeDescription != other.typeDescription) return false
        if (this.offset != other.offset) return false
        if (this.options != other.options) return false
        if (this.defaultValue != other.defaultValue) return false
        if (this.countOffset != other.countOffset) return false
        if (this.itemLocalName != other.itemLocalName) return false
        if (this.itemNs != other.itemNs) return false
        if (this.itemRange != other.itemRange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mapping.hashCode()
        result = 31 * result + this.localName.hashCode()
        result = 31 * result + this.ns.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.typeDescription.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.defaultValue.hashCode()
        result = 31 * result + this.countOffset.hashCode()
        result = 31 * result + this.itemLocalName.hashCode()
        result = 31 * result + this.itemNs.hashCode()
        result = 31 * result + this.itemRange.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFieldDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFieldDescription> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsFieldDescription =
                    WsFieldDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsDefaultValue>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsItemRange>(64)
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: WsFieldDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mapping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.localName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 16L, value.ns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.typeDescription)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.options)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsDefaultValue>(64)
                    ).writeNative(addr + 48L, value.defaultValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.countOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 64L, value.itemLocalName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 72L, value.itemNs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsItemRange>(64)
                    ).writeNative(addr + 80L, value.itemRange)
                }
            }

        public operator fun invoke(
            mapping: WsFieldMapping = 0,
            localName: MutPtr<WsXmlString> = MutPtr(0L),
            ns: MutPtr<WsXmlString> = MutPtr(0L),
            type: WsType = 0,
            typeDescription: MutPtr<CVoid> = MutPtr(0L),
            offset: UInt = 0u,
            options: UInt = 0u,
            defaultValue: MutPtr<WsDefaultValue> = MutPtr(0L),
            countOffset: UInt = 0u,
            itemLocalName: MutPtr<WsXmlString> = MutPtr(0L),
            itemNs: MutPtr<WsXmlString> = MutPtr(0L),
            itemRange: MutPtr<WsItemRange> = MutPtr(0L),
        ): WsFieldDescription =
            WsFieldDescription(
                mapping = mapping,
                localNameCtorArg = localName,
                nsCtorArg = ns,
                type = type,
                typeDescriptionCtorArg = typeDescription,
                offset = offset,
                options = options,
                defaultValueCtorArg = defaultValue,
                countOffset = countOffset,
                itemLocalNameCtorArg = itemLocalName,
                itemNsCtorArg = itemNs,
                itemRangeCtorArg = itemRange,
            )
    }
}

public data class WsFloatDescription(
    public var minValue: Float = 0.0f,
    public var maxValue: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFloatDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsFloatDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsFloatDescription =
                    WsFloatDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsFloatDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.maxValue)
                }
            }
    }
}

public data class WsGuidDescription(
    public var value: Guid = Guid(),
)

public class WsHeapProperties internal constructor(
    propertiesCtorArg: MutPtr<WsHeapProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsHeapProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsHeapProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsHeapProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsHeapProperties = WsHeapProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsHeapProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHeapProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHeapProperties> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHeapProperties =
                    WsHeapProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsHeapProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsHeapProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsHeapProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsHeapProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsHeapProperties =
            WsHeapProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsHeapProperty internal constructor(
    public var id: WsHeapPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsHeapPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsHeapPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsHeapProperty = WsHeapProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsHeapProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHeapProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHeapProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHeapProperty =
                    WsHeapProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsHeapProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsHeapPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsHeapProperty =
            WsHeapProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsHostNames internal constructor(
    hostNamesCtorArg: MutPtr<WsString>,
    public var hostNameCount: UInt,
) {
    public var hostNames: MutPtr<WsString> = hostNamesCtorArg
        internal set

    public constructor() : this(
        hostNamesCtorArg = MutPtr(0L),
        hostNameCount = 0u,
    )

    public operator fun component1(): MutPtr<WsString> = this.hostNames

    public operator fun component2(): UInt = this.hostNameCount

    public fun copy(hostNames: MutPtr<WsString> = this.hostNames, hostNameCount: UInt = this.hostNameCount): WsHostNames = WsHostNames(hostNamesCtorArg = hostNames, hostNameCount = hostNameCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsHostNames) return false
        if (this.hostNames != other.hostNames) return false
        if (this.hostNameCount != other.hostNameCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hostNames.hashCode()
        result = 31 * result + this.hostNameCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHostNames> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHostNames> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHostNames =
                    WsHostNames(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsString>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsHostNames) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsString>(64)
                    ).writeNative(addr, value.hostNames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hostNameCount)
                }
            }

        public operator fun invoke(
            hostNames: MutPtr<WsString> = MutPtr(0L),
            hostNameCount: UInt = 0u,
        ): WsHostNames =
            WsHostNames(
                hostNamesCtorArg = hostNames,
                hostNameCount = hostNameCount,
            )
    }
}

public data class WsHttpsUrl(
    public var url: WsUrl = WsUrl(),
    public var host: WsString = WsString(),
    public var port: UShort = 0u,
    public var portAsString: WsString = WsString(),
    public var path: WsString = WsString(),
    public var query: WsString = WsString(),
    public var fragment: WsString = WsString(),
)

public data class WsHttpBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpBindingTemplate> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpBindingTemplate =
                    WsHttpBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsHttpBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                }
            }
    }
}

public data class WsHttpHeaderAuthBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingTemplate = WsHttpHeaderAuthSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthBindingTemplate> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpHeaderAuthBindingTemplate =
                    WsHttpHeaderAuthBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsHttpHeaderAuthSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsHttpHeaderAuthBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsHttpHeaderAuthSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.httpHeaderAuthSecurityBinding)
                }
            }
    }
}

public data class WsHttpHeaderAuthPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingPolicyDescription = WsHttpHeaderAuthSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthPolicyDescription> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpHeaderAuthPolicyDescription =
                    WsHttpHeaderAuthPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsHttpHeaderAuthSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsHttpHeaderAuthPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsHttpHeaderAuthSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.httpHeaderAuthSecurityBinding)
                }
            }
    }
}

public class WsHttpHeaderAuthSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    clientCredentialCtorArg: MutPtr<WsWindowsIntegratedAuthCredential>,
) {
    public var clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = clientCredentialCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        clientCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential

    public fun copy(binding: WsSecurityBinding = this.binding, clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential): WsHttpHeaderAuthSecurityBinding = WsHttpHeaderAuthSecurityBinding(binding = binding, clientCredentialCtorArg = clientCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsHttpHeaderAuthSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.clientCredential != other.clientCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBinding> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpHeaderAuthSecurityBinding =
                    WsHttpHeaderAuthSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsHttpHeaderAuthSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                    ).writeNative(addr + 24L, value.clientCredential)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = MutPtr(0L),
        ): WsHttpHeaderAuthSecurityBinding =
            WsHttpHeaderAuthSecurityBinding(
                binding = binding,
                clientCredentialCtorArg = clientCredential,
            )
    }
}

public data class WsHttpHeaderAuthSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBindingConstraint> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpHeaderAuthSecurityBindingConstraint =
                    WsHttpHeaderAuthSecurityBindingConstraint(
                        (WsSecurityBindingConstraint.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsHttpHeaderAuthSecurityBindingConstraint) {
                    (WsSecurityBindingConstraint.typeLayout()).writeNative(addr, value.bindingConstraint)
                }
            }
    }
}

public data class WsHttpHeaderAuthSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBindingPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBindingPolicyDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpHeaderAuthSecurityBindingPolicyDescription =
                    WsHttpHeaderAuthSecurityBindingPolicyDescription(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsHttpHeaderAuthSecurityBindingPolicyDescription) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                }
            }
    }
}

public class WsHttpHeaderAuthSecurityBindingTemplate internal constructor(
    public var securityBindingProperties: WsSecurityBindingProperties,
    clientCredentialCtorArg: MutPtr<WsWindowsIntegratedAuthCredential>,
) {
    public var clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = clientCredentialCtorArg
        internal set

    public constructor() : this(
        securityBindingProperties = WsSecurityBindingProperties(),
        clientCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBindingProperties = this.securityBindingProperties

    public operator fun component2(): MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential

    public fun copy(securityBindingProperties: WsSecurityBindingProperties = this.securityBindingProperties, clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential): WsHttpHeaderAuthSecurityBindingTemplate = WsHttpHeaderAuthSecurityBindingTemplate(securityBindingProperties = securityBindingProperties, clientCredentialCtorArg = clientCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsHttpHeaderAuthSecurityBindingTemplate) return false
        if (this.securityBindingProperties != other.securityBindingProperties) return false
        if (this.clientCredential != other.clientCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityBindingProperties.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderAuthSecurityBindingTemplate> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpHeaderAuthSecurityBindingTemplate =
                    WsHttpHeaderAuthSecurityBindingTemplate(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsHttpHeaderAuthSecurityBindingTemplate) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                    ).writeNative(addr + 16L, value.clientCredential)
                }
            }

        public operator fun invoke(
            securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
            clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = MutPtr(0L),
        ): WsHttpHeaderAuthSecurityBindingTemplate =
            WsHttpHeaderAuthSecurityBindingTemplate(
                securityBindingProperties = securityBindingProperties,
                clientCredentialCtorArg = clientCredential,
            )
    }
}

public data class WsHttpHeaderMapping(
    public var headerName: WsXmlString = WsXmlString(),
    public var headerMappingOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderMapping> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpHeaderMapping> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpHeaderMapping =
                    WsHttpHeaderMapping(
                        (WsXmlString.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsHttpHeaderMapping) {
                    (WsXmlString.typeLayout()).writeNative(addr, value.headerName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.headerMappingOptions)
                }
            }
    }
}

public class WsHttpMessageMapping internal constructor(
    public var requestMappingOptions: UInt,
    public var responseMappingOptions: UInt,
    requestHeaderMappingsCtorArg: MutPtr<MutPtr<WsHttpHeaderMapping>>,
    public var requestHeaderMappingCount: UInt,
    responseHeaderMappingsCtorArg: MutPtr<MutPtr<WsHttpHeaderMapping>>,
    public var responseHeaderMappingCount: UInt,
) {
    public var requestHeaderMappings: MutPtr<MutPtr<WsHttpHeaderMapping>> = requestHeaderMappingsCtorArg
        internal set

    public var responseHeaderMappings: MutPtr<MutPtr<WsHttpHeaderMapping>> = responseHeaderMappingsCtorArg
        internal set

    public constructor() : this(
        requestMappingOptions = 0u,
        responseMappingOptions = 0u,
        requestHeaderMappingsCtorArg = MutPtr(0L),
        requestHeaderMappingCount = 0u,
        responseHeaderMappingsCtorArg = MutPtr(0L),
        responseHeaderMappingCount = 0u,
    )

    public operator fun component1(): UInt = this.requestMappingOptions

    public operator fun component2(): UInt = this.responseMappingOptions

    public operator fun component3(): MutPtr<MutPtr<WsHttpHeaderMapping>> = this.requestHeaderMappings

    public operator fun component4(): UInt = this.requestHeaderMappingCount

    public operator fun component5(): MutPtr<MutPtr<WsHttpHeaderMapping>> = this.responseHeaderMappings

    public operator fun component6(): UInt = this.responseHeaderMappingCount

    public fun copy(requestMappingOptions: UInt = this.requestMappingOptions, responseMappingOptions: UInt = this.responseMappingOptions, requestHeaderMappings: MutPtr<MutPtr<WsHttpHeaderMapping>> = this.requestHeaderMappings, requestHeaderMappingCount: UInt = this.requestHeaderMappingCount, responseHeaderMappings: MutPtr<MutPtr<WsHttpHeaderMapping>> = this.responseHeaderMappings, responseHeaderMappingCount: UInt = this.responseHeaderMappingCount): WsHttpMessageMapping = WsHttpMessageMapping(requestMappingOptions = requestMappingOptions, responseMappingOptions = responseMappingOptions, requestHeaderMappingsCtorArg = requestHeaderMappings, requestHeaderMappingCount = requestHeaderMappingCount, responseHeaderMappingsCtorArg = responseHeaderMappings, responseHeaderMappingCount = responseHeaderMappingCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsHttpMessageMapping) return false
        if (this.requestMappingOptions != other.requestMappingOptions) return false
        if (this.responseMappingOptions != other.responseMappingOptions) return false
        if (this.requestHeaderMappings != other.requestHeaderMappings) return false
        if (this.requestHeaderMappingCount != other.requestHeaderMappingCount) return false
        if (this.responseHeaderMappings != other.responseHeaderMappings) return false
        if (this.responseHeaderMappingCount != other.responseHeaderMappingCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.requestMappingOptions.hashCode()
        result = 31 * result + this.responseMappingOptions.hashCode()
        result = 31 * result + this.requestHeaderMappings.hashCode()
        result = 31 * result + this.requestHeaderMappingCount.hashCode()
        result = 31 * result + this.responseHeaderMappings.hashCode()
        result = 31 * result + this.responseHeaderMappingCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpMessageMapping> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpMessageMapping> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpMessageMapping =
                    WsHttpMessageMapping(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsHttpHeaderMapping>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsHttpHeaderMapping>>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsHttpMessageMapping) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestMappingOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.responseMappingOptions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsHttpHeaderMapping>>(64)
                    ).writeNative(addr + 8L, value.requestHeaderMappings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.requestHeaderMappingCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsHttpHeaderMapping>>(64)
                    ).writeNative(addr + 24L, value.responseHeaderMappings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.responseHeaderMappingCount)
                }
            }

        public operator fun invoke(
            requestMappingOptions: UInt = 0u,
            responseMappingOptions: UInt = 0u,
            requestHeaderMappings: MutPtr<MutPtr<WsHttpHeaderMapping>> = MutPtr(0L),
            requestHeaderMappingCount: UInt = 0u,
            responseHeaderMappings: MutPtr<MutPtr<WsHttpHeaderMapping>> = MutPtr(0L),
            responseHeaderMappingCount: UInt = 0u,
        ): WsHttpMessageMapping =
            WsHttpMessageMapping(
                requestMappingOptions = requestMappingOptions,
                responseMappingOptions = responseMappingOptions,
                requestHeaderMappingsCtorArg = requestHeaderMappings,
                requestHeaderMappingCount = requestHeaderMappingCount,
                responseHeaderMappingsCtorArg = responseHeaderMappings,
                responseHeaderMappingCount = responseHeaderMappingCount,
            )
    }
}

public data class WsHttpPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpPolicyDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpPolicyDescription =
                    WsHttpPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsHttpPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                }
            }
    }
}

public class WsHttpRedirectCallbackContext internal constructor(
    public var callback: WsHttpRedirectCallback,
    stateCtorArg: MutPtr<CVoid>,
) {
    public var state: MutPtr<CVoid> = stateCtorArg
        internal set

    public constructor() : this(
        callback = null,
        stateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsHttpRedirectCallback = this.callback

    public operator fun component2(): MutPtr<CVoid> = this.state

    public fun copy(callback: WsHttpRedirectCallback = this.callback, state: MutPtr<CVoid> = this.state): WsHttpRedirectCallbackContext = WsHttpRedirectCallbackContext(callback = callback, stateCtorArg = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsHttpRedirectCallbackContext) return false
        if (this.callback != other.callback) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callback.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callback: WsHttpRedirectCallback = null,
            state: MutPtr<CVoid> = MutPtr(0L),
        ): WsHttpRedirectCallbackContext =
            WsHttpRedirectCallbackContext(
                callback = callback,
                stateCtorArg = state,
            )
    }
}

public data class WsHttpSslBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslBindingTemplate> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslBindingTemplate =
                    WsHttpSslBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslHeaderAuthBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingTemplate = WsHttpHeaderAuthSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslHeaderAuthBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslHeaderAuthBindingTemplate> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslHeaderAuthBindingTemplate =
                    WsHttpSslHeaderAuthBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                        (WsHttpHeaderAuthSecurityBindingTemplate.typeLayout()).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslHeaderAuthBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsHttpHeaderAuthSecurityBindingTemplate.typeLayout()).writeNative(addr + 56L, value.httpHeaderAuthSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslHeaderAuthPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingPolicyDescription = WsHttpHeaderAuthSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslHeaderAuthPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslHeaderAuthPolicyDescription> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslHeaderAuthPolicyDescription =
                    WsHttpSslHeaderAuthPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsHttpHeaderAuthSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslHeaderAuthPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsHttpHeaderAuthSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.httpHeaderAuthSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslKerberosApreqBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqBindingTemplate> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslKerberosApreqBindingTemplate =
                    WsHttpSslKerberosApreqBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslKerberosApreqBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).writeNative(addr + 56L, value.kerberosApreqMessageSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslKerberosApreqPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqPolicyDescription> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslKerberosApreqPolicyDescription =
                    WsHttpSslKerberosApreqPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslKerberosApreqPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.kerberosApreqMessageSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslKerberosApreqSecurityContextBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingTemplate = WsSecurityContextSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqSecurityContextBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqSecurityContextBindingTemplate> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslKerberosApreqSecurityContextBindingTemplate =
                    WsHttpSslKerberosApreqSecurityContextBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).readNative(addr + 56L),
                        (WsSecurityContextSecurityBindingTemplate.typeLayout()).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslKerberosApreqSecurityContextBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).writeNative(addr + 56L, value.kerberosApreqMessageSecurityBinding)
                    (WsSecurityContextSecurityBindingTemplate.typeLayout()).writeNative(addr + 80L, value.securityContextSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslKerberosApreqSecurityContextPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingPolicyDescription = WsSecurityContextSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqSecurityContextPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslKerberosApreqSecurityContextPolicyDescription> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslKerberosApreqSecurityContextPolicyDescription =
                    WsHttpSslKerberosApreqSecurityContextPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                        (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslKerberosApreqSecurityContextPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.kerberosApreqMessageSecurityBinding)
                    (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 72L, value.securityContextSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslPolicyDescription> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslPolicyDescription =
                    WsHttpSslPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslUsernameBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingTemplate = WsUsernameMessageSecurityBindingTemplate(),
)

public data class WsHttpSslUsernamePolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingPolicyDescription = WsUsernameMessageSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslUsernamePolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslUsernamePolicyDescription> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslUsernamePolicyDescription =
                    WsHttpSslUsernamePolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslUsernamePolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.usernameMessageSecurityBinding)
                }
            }
    }
}

public data class WsHttpSslUsernameSecurityContextBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingTemplate = WsUsernameMessageSecurityBindingTemplate(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingTemplate = WsSecurityContextSecurityBindingTemplate(),
)

public data class WsHttpSslUsernameSecurityContextPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingPolicyDescription = WsUsernameMessageSecurityBindingPolicyDescription(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingPolicyDescription = WsSecurityContextSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslUsernameSecurityContextPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsHttpSslUsernameSecurityContextPolicyDescription> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsHttpSslUsernameSecurityContextPolicyDescription =
                    WsHttpSslUsernameSecurityContextPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                        (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: WsHttpSslUsernameSecurityContextPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSslTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sslTransportSecurityBinding)
                    (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.usernameMessageSecurityBinding)
                    (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 72L, value.securityContextSecurityBinding)
                }
            }
    }
}

public data class WsHttpUrl(
    public var url: WsUrl = WsUrl(),
    public var host: WsString = WsString(),
    public var port: UShort = 0u,
    public var portAsString: WsString = WsString(),
    public var path: WsString = WsString(),
    public var query: WsString = WsString(),
    public var fragment: WsString = WsString(),
)

public data class WsInt16Description(
    public var minValue: Short = 0,
    public var maxValue: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt16Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt16Description> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): WsInt16Description =
                    WsInt16Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WsInt16Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.maxValue)
                }
            }
    }
}

public data class WsInt32Description(
    public var minValue: Int = 0,
    public var maxValue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt32Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt32Description> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsInt32Description =
                    WsInt32Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsInt32Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.maxValue)
                }
            }
    }
}

public data class WsInt64Description(
    public var minValue: Long = 0L,
    public var maxValue: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt64Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt64Description> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsInt64Description =
                    WsInt64Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsInt64Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.maxValue)
                }
            }
    }
}

public data class WsInt8Description(
    public var minValue: Byte = 0,
    public var maxValue: Byte = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt8Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsInt8Description> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WsInt8Description =
                    WsInt8Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: WsInt8Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 1L, value.maxValue)
                }
            }
    }
}

public class WsIssuedTokenMessageSecurityBindingConstraint internal constructor(
    public var bindingConstraint: WsSecurityBindingConstraint,
    public var bindingUsage: WsMessageSecurityUsage,
    claimConstraintsCtorArg: MutPtr<WsXmlString>,
    public var claimConstraintCount: UInt,
    requestSecurityTokenPropertyConstraintsCtorArg: MutPtr<WsRequestSecurityTokenPropertyConstraint>,
    public var requestSecurityTokenPropertyConstraintCount: UInt,
    public var out: WsIssuedTokenMessageSecurityBindingConstraint0,
) {
    public var claimConstraints: MutPtr<WsXmlString> = claimConstraintsCtorArg
        internal set

    public var requestSecurityTokenPropertyConstraints: MutPtr<WsRequestSecurityTokenPropertyConstraint> = requestSecurityTokenPropertyConstraintsCtorArg
        internal set

    public constructor() : this(
        bindingConstraint = WsSecurityBindingConstraint(),
        bindingUsage = 0,
        claimConstraintsCtorArg = MutPtr(0L),
        claimConstraintCount = 0u,
        requestSecurityTokenPropertyConstraintsCtorArg = MutPtr(0L),
        requestSecurityTokenPropertyConstraintCount = 0u,
        out = WsIssuedTokenMessageSecurityBindingConstraint0(),
    )

    public operator fun component1(): WsSecurityBindingConstraint = this.bindingConstraint

    public operator fun component2(): WsMessageSecurityUsage = this.bindingUsage

    public operator fun component3(): MutPtr<WsXmlString> = this.claimConstraints

    public operator fun component4(): UInt = this.claimConstraintCount

    public operator fun component5(): MutPtr<WsRequestSecurityTokenPropertyConstraint> = this.requestSecurityTokenPropertyConstraints

    public operator fun component6(): UInt = this.requestSecurityTokenPropertyConstraintCount

    public operator fun component7(): WsIssuedTokenMessageSecurityBindingConstraint0 = this.out

    public fun copy(bindingConstraint: WsSecurityBindingConstraint = this.bindingConstraint, bindingUsage: WsMessageSecurityUsage = this.bindingUsage, claimConstraints: MutPtr<WsXmlString> = this.claimConstraints, claimConstraintCount: UInt = this.claimConstraintCount, requestSecurityTokenPropertyConstraints: MutPtr<WsRequestSecurityTokenPropertyConstraint> = this.requestSecurityTokenPropertyConstraints, requestSecurityTokenPropertyConstraintCount: UInt = this.requestSecurityTokenPropertyConstraintCount, out: WsIssuedTokenMessageSecurityBindingConstraint0 = this.out): WsIssuedTokenMessageSecurityBindingConstraint = WsIssuedTokenMessageSecurityBindingConstraint(bindingConstraint = bindingConstraint, bindingUsage = bindingUsage, claimConstraintsCtorArg = claimConstraints, claimConstraintCount = claimConstraintCount, requestSecurityTokenPropertyConstraintsCtorArg = requestSecurityTokenPropertyConstraints, requestSecurityTokenPropertyConstraintCount = requestSecurityTokenPropertyConstraintCount, out = out)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsIssuedTokenMessageSecurityBindingConstraint) return false
        if (this.bindingConstraint != other.bindingConstraint) return false
        if (this.bindingUsage != other.bindingUsage) return false
        if (this.claimConstraints != other.claimConstraints) return false
        if (this.claimConstraintCount != other.claimConstraintCount) return false
        if (this.requestSecurityTokenPropertyConstraints != other.requestSecurityTokenPropertyConstraints) return false
        if (this.requestSecurityTokenPropertyConstraintCount != other.requestSecurityTokenPropertyConstraintCount) return false
        if (this.out != other.out) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bindingConstraint.hashCode()
        result = 31 * result + this.bindingUsage.hashCode()
        result = 31 * result + this.claimConstraints.hashCode()
        result = 31 * result + this.claimConstraintCount.hashCode()
        result = 31 * result + this.requestSecurityTokenPropertyConstraints.hashCode()
        result = 31 * result + this.requestSecurityTokenPropertyConstraintCount.hashCode()
        result = 31 * result + this.out.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsIssuedTokenMessageSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsIssuedTokenMessageSecurityBindingConstraint> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsIssuedTokenMessageSecurityBindingConstraint =
                    WsIssuedTokenMessageSecurityBindingConstraint(
                        (WsSecurityBindingConstraint.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsRequestSecurityTokenPropertyConstraint>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (WsIssuedTokenMessageSecurityBindingConstraint0.typeLayout()).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: WsIssuedTokenMessageSecurityBindingConstraint) {
                    (WsSecurityBindingConstraint.typeLayout()).writeNative(addr, value.bindingConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 32L, value.claimConstraints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.claimConstraintCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsRequestSecurityTokenPropertyConstraint>(64)
                    ).writeNative(addr + 48L, value.requestSecurityTokenPropertyConstraints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.requestSecurityTokenPropertyConstraintCount)
                    (WsIssuedTokenMessageSecurityBindingConstraint0.typeLayout()).writeNative(addr + 64L, value.out)
                }
            }

        public operator fun invoke(
            bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
            bindingUsage: WsMessageSecurityUsage = 0,
            claimConstraints: MutPtr<WsXmlString> = MutPtr(0L),
            claimConstraintCount: UInt = 0u,
            requestSecurityTokenPropertyConstraints: MutPtr<WsRequestSecurityTokenPropertyConstraint> = MutPtr(0L),
            requestSecurityTokenPropertyConstraintCount: UInt = 0u,
            out: WsIssuedTokenMessageSecurityBindingConstraint0 = WsIssuedTokenMessageSecurityBindingConstraint0(),
        ): WsIssuedTokenMessageSecurityBindingConstraint =
            WsIssuedTokenMessageSecurityBindingConstraint(
                bindingConstraint = bindingConstraint,
                bindingUsage = bindingUsage,
                claimConstraintsCtorArg = claimConstraints,
                claimConstraintCount = claimConstraintCount,
                requestSecurityTokenPropertyConstraintsCtorArg = requestSecurityTokenPropertyConstraints,
                requestSecurityTokenPropertyConstraintCount = requestSecurityTokenPropertyConstraintCount,
                out = out,
            )
    }
}

public class WsIssuedTokenMessageSecurityBindingConstraint0 internal constructor(
    issuerAddressCtorArg: MutPtr<WsEndpointAddress>,
    requestSecurityTokenTemplateCtorArg: MutPtr<WsXmlBuffer>,
) {
    public var issuerAddress: MutPtr<WsEndpointAddress> = issuerAddressCtorArg
        internal set

    public var requestSecurityTokenTemplate: MutPtr<WsXmlBuffer> = requestSecurityTokenTemplateCtorArg
        internal set

    public constructor() : this(
        issuerAddressCtorArg = MutPtr(0L),
        requestSecurityTokenTemplateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsEndpointAddress> = this.issuerAddress

    public operator fun component2(): MutPtr<WsXmlBuffer> = this.requestSecurityTokenTemplate

    public fun copy(issuerAddress: MutPtr<WsEndpointAddress> = this.issuerAddress, requestSecurityTokenTemplate: MutPtr<WsXmlBuffer> = this.requestSecurityTokenTemplate): WsIssuedTokenMessageSecurityBindingConstraint0 = WsIssuedTokenMessageSecurityBindingConstraint0(issuerAddressCtorArg = issuerAddress, requestSecurityTokenTemplateCtorArg = requestSecurityTokenTemplate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsIssuedTokenMessageSecurityBindingConstraint0) return false
        if (this.issuerAddress != other.issuerAddress) return false
        if (this.requestSecurityTokenTemplate != other.requestSecurityTokenTemplate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.issuerAddress.hashCode()
        result = 31 * result + this.requestSecurityTokenTemplate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsIssuedTokenMessageSecurityBindingConstraint0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsIssuedTokenMessageSecurityBindingConstraint0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsIssuedTokenMessageSecurityBindingConstraint0 =
                    WsIssuedTokenMessageSecurityBindingConstraint0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsEndpointAddress>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlBuffer>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsIssuedTokenMessageSecurityBindingConstraint0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsEndpointAddress>(64)
                    ).writeNative(addr, value.issuerAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlBuffer>(64)
                    ).writeNative(addr + 8L, value.requestSecurityTokenTemplate)
                }
            }

        public operator fun invoke(
            issuerAddress: MutPtr<WsEndpointAddress> = MutPtr(0L),
            requestSecurityTokenTemplate: MutPtr<WsXmlBuffer> = MutPtr(0L),
        ): WsIssuedTokenMessageSecurityBindingConstraint0 =
            WsIssuedTokenMessageSecurityBindingConstraint0(
                issuerAddressCtorArg = issuerAddress,
                requestSecurityTokenTemplateCtorArg = requestSecurityTokenTemplate,
            )
    }
}

public data class WsItemRange(
    public var minItemCount: UInt = 0u,
    public var maxItemCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsItemRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsItemRange> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsItemRange =
                    WsItemRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsItemRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minItemCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxItemCount)
                }
            }
    }
}

public class WsKerberosApreqMessageSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    public var bindingUsage: WsMessageSecurityUsage,
    clientCredentialCtorArg: MutPtr<WsWindowsIntegratedAuthCredential>,
) {
    public var clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = clientCredentialCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        bindingUsage = 0,
        clientCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): WsMessageSecurityUsage = this.bindingUsage

    public operator fun component3(): MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential

    public fun copy(binding: WsSecurityBinding = this.binding, bindingUsage: WsMessageSecurityUsage = this.bindingUsage, clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential): WsKerberosApreqMessageSecurityBinding = WsKerberosApreqMessageSecurityBinding(binding = binding, bindingUsage = bindingUsage, clientCredentialCtorArg = clientCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsKerberosApreqMessageSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.bindingUsage != other.bindingUsage) return false
        if (this.clientCredential != other.clientCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.bindingUsage.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBinding> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsKerberosApreqMessageSecurityBinding =
                    WsKerberosApreqMessageSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsKerberosApreqMessageSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                    ).writeNative(addr + 32L, value.clientCredential)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            bindingUsage: WsMessageSecurityUsage = 0,
            clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = MutPtr(0L),
        ): WsKerberosApreqMessageSecurityBinding =
            WsKerberosApreqMessageSecurityBinding(
                binding = binding,
                bindingUsage = bindingUsage,
                clientCredentialCtorArg = clientCredential,
            )
    }
}

public data class WsKerberosApreqMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBindingConstraint> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsKerberosApreqMessageSecurityBindingConstraint =
                    WsKerberosApreqMessageSecurityBindingConstraint(
                        (WsSecurityBindingConstraint.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsKerberosApreqMessageSecurityBindingConstraint) {
                    (WsSecurityBindingConstraint.typeLayout()).writeNative(addr, value.bindingConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                }
            }
    }
}

public data class WsKerberosApreqMessageSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBindingPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBindingPolicyDescription> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsKerberosApreqMessageSecurityBindingPolicyDescription =
                    WsKerberosApreqMessageSecurityBindingPolicyDescription(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsKerberosApreqMessageSecurityBindingPolicyDescription) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.bindingUsage)
                }
            }
    }
}

public class WsKerberosApreqMessageSecurityBindingTemplate internal constructor(
    public var securityBindingProperties: WsSecurityBindingProperties,
    clientCredentialCtorArg: MutPtr<WsWindowsIntegratedAuthCredential>,
) {
    public var clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = clientCredentialCtorArg
        internal set

    public constructor() : this(
        securityBindingProperties = WsSecurityBindingProperties(),
        clientCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBindingProperties = this.securityBindingProperties

    public operator fun component2(): MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential

    public fun copy(securityBindingProperties: WsSecurityBindingProperties = this.securityBindingProperties, clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential): WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(securityBindingProperties = securityBindingProperties, clientCredentialCtorArg = clientCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsKerberosApreqMessageSecurityBindingTemplate) return false
        if (this.securityBindingProperties != other.securityBindingProperties) return false
        if (this.clientCredential != other.clientCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityBindingProperties.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsKerberosApreqMessageSecurityBindingTemplate> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsKerberosApreqMessageSecurityBindingTemplate =
                    WsKerberosApreqMessageSecurityBindingTemplate(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsKerberosApreqMessageSecurityBindingTemplate) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                    ).writeNative(addr + 16L, value.clientCredential)
                }
            }

        public operator fun invoke(
            securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
            clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = MutPtr(0L),
        ): WsKerberosApreqMessageSecurityBindingTemplate =
            WsKerberosApreqMessageSecurityBindingTemplate(
                securityBindingProperties = securityBindingProperties,
                clientCredentialCtorArg = clientCredential,
            )
    }
}

public class WsListenerProperties internal constructor(
    propertiesCtorArg: MutPtr<WsListenerProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsListenerProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsListenerProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsListenerProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsListenerProperties = WsListenerProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsListenerProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsListenerProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsListenerProperties> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsListenerProperties =
                    WsListenerProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsListenerProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsListenerProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsListenerProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsListenerProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsListenerProperties =
            WsListenerProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsListenerProperty internal constructor(
    public var id: WsListenerPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsListenerPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsListenerPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsListenerProperty = WsListenerProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsListenerProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsListenerProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsListenerProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsListenerProperty =
                    WsListenerProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsListenerProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsListenerPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsListenerProperty =
            WsListenerProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsMessageDescription internal constructor(
    actionCtorArg: MutPtr<WsXmlString>,
    bodyElementDescriptionCtorArg: MutPtr<WsElementDescription>,
) {
    public var action: MutPtr<WsXmlString> = actionCtorArg
        internal set

    public var bodyElementDescription: MutPtr<WsElementDescription> = bodyElementDescriptionCtorArg
        internal set

    public constructor() : this(
        actionCtorArg = MutPtr(0L),
        bodyElementDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlString> = this.action

    public operator fun component2(): MutPtr<WsElementDescription> = this.bodyElementDescription

    public fun copy(action: MutPtr<WsXmlString> = this.action, bodyElementDescription: MutPtr<WsElementDescription> = this.bodyElementDescription): WsMessageDescription = WsMessageDescription(actionCtorArg = action, bodyElementDescriptionCtorArg = bodyElementDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsMessageDescription) return false
        if (this.action != other.action) return false
        if (this.bodyElementDescription != other.bodyElementDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.action.hashCode()
        result = 31 * result + this.bodyElementDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMessageDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMessageDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsMessageDescription =
                    WsMessageDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsElementDescription>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsMessageDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr, value.action)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsElementDescription>(64)
                    ).writeNative(addr + 8L, value.bodyElementDescription)
                }
            }

        public operator fun invoke(
            action: MutPtr<WsXmlString> = MutPtr(0L),
            bodyElementDescription: MutPtr<WsElementDescription> = MutPtr(0L),
        ): WsMessageDescription =
            WsMessageDescription(
                actionCtorArg = action,
                bodyElementDescriptionCtorArg = bodyElementDescription,
            )
    }
}

public class WsMessageProperties internal constructor(
    propertiesCtorArg: MutPtr<WsMessageProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsMessageProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsMessageProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsMessageProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsMessageProperties = WsMessageProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsMessageProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMessageProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMessageProperties> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsMessageProperties =
                    WsMessageProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsMessageProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsMessageProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsMessageProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsMessageProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsMessageProperties =
            WsMessageProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsMessageProperty internal constructor(
    public var id: WsMessagePropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsMessagePropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsMessagePropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsMessageProperty = WsMessageProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsMessageProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMessageProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMessageProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsMessageProperty =
                    WsMessageProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsMessageProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsMessagePropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsMessageProperty =
            WsMessageProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsMetadataEndpoint internal constructor(
    public var endpointAddress: WsEndpointAddress,
    endpointPolicyCtorArg: MutPtr<WsPolicy>,
    portNameCtorArg: MutPtr<WsXmlString>,
    serviceNameCtorArg: MutPtr<WsXmlString>,
    serviceNsCtorArg: MutPtr<WsXmlString>,
    bindingNameCtorArg: MutPtr<WsXmlString>,
    bindingNsCtorArg: MutPtr<WsXmlString>,
    portTypeNameCtorArg: MutPtr<WsXmlString>,
    portTypeNsCtorArg: MutPtr<WsXmlString>,
) {
    public var endpointPolicy: MutPtr<WsPolicy> = endpointPolicyCtorArg
        internal set

    public var portName: MutPtr<WsXmlString> = portNameCtorArg
        internal set

    public var serviceName: MutPtr<WsXmlString> = serviceNameCtorArg
        internal set

    public var serviceNs: MutPtr<WsXmlString> = serviceNsCtorArg
        internal set

    public var bindingName: MutPtr<WsXmlString> = bindingNameCtorArg
        internal set

    public var bindingNs: MutPtr<WsXmlString> = bindingNsCtorArg
        internal set

    public var portTypeName: MutPtr<WsXmlString> = portTypeNameCtorArg
        internal set

    public var portTypeNs: MutPtr<WsXmlString> = portTypeNsCtorArg
        internal set

    public constructor() : this(
        endpointAddress = WsEndpointAddress(),
        endpointPolicyCtorArg = MutPtr(0L),
        portNameCtorArg = MutPtr(0L),
        serviceNameCtorArg = MutPtr(0L),
        serviceNsCtorArg = MutPtr(0L),
        bindingNameCtorArg = MutPtr(0L),
        bindingNsCtorArg = MutPtr(0L),
        portTypeNameCtorArg = MutPtr(0L),
        portTypeNsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsEndpointAddress = this.endpointAddress

    public operator fun component2(): MutPtr<WsPolicy> = this.endpointPolicy

    public operator fun component3(): MutPtr<WsXmlString> = this.portName

    public operator fun component4(): MutPtr<WsXmlString> = this.serviceName

    public operator fun component5(): MutPtr<WsXmlString> = this.serviceNs

    public operator fun component6(): MutPtr<WsXmlString> = this.bindingName

    public operator fun component7(): MutPtr<WsXmlString> = this.bindingNs

    public operator fun component8(): MutPtr<WsXmlString> = this.portTypeName

    public operator fun component9(): MutPtr<WsXmlString> = this.portTypeNs

    public fun copy(endpointAddress: WsEndpointAddress = this.endpointAddress, endpointPolicy: MutPtr<WsPolicy> = this.endpointPolicy, portName: MutPtr<WsXmlString> = this.portName, serviceName: MutPtr<WsXmlString> = this.serviceName, serviceNs: MutPtr<WsXmlString> = this.serviceNs, bindingName: MutPtr<WsXmlString> = this.bindingName, bindingNs: MutPtr<WsXmlString> = this.bindingNs, portTypeName: MutPtr<WsXmlString> = this.portTypeName, portTypeNs: MutPtr<WsXmlString> = this.portTypeNs): WsMetadataEndpoint = WsMetadataEndpoint(endpointAddress = endpointAddress, endpointPolicyCtorArg = endpointPolicy, portNameCtorArg = portName, serviceNameCtorArg = serviceName, serviceNsCtorArg = serviceNs, bindingNameCtorArg = bindingName, bindingNsCtorArg = bindingNs, portTypeNameCtorArg = portTypeName, portTypeNsCtorArg = portTypeNs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsMetadataEndpoint) return false
        if (this.endpointAddress != other.endpointAddress) return false
        if (this.endpointPolicy != other.endpointPolicy) return false
        if (this.portName != other.portName) return false
        if (this.serviceName != other.serviceName) return false
        if (this.serviceNs != other.serviceNs) return false
        if (this.bindingName != other.bindingName) return false
        if (this.bindingNs != other.bindingNs) return false
        if (this.portTypeName != other.portTypeName) return false
        if (this.portTypeNs != other.portTypeNs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpointAddress.hashCode()
        result = 31 * result + this.endpointPolicy.hashCode()
        result = 31 * result + this.portName.hashCode()
        result = 31 * result + this.serviceName.hashCode()
        result = 31 * result + this.serviceNs.hashCode()
        result = 31 * result + this.bindingName.hashCode()
        result = 31 * result + this.bindingNs.hashCode()
        result = 31 * result + this.portTypeName.hashCode()
        result = 31 * result + this.portTypeNs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            endpointAddress: WsEndpointAddress = WsEndpointAddress(),
            endpointPolicy: MutPtr<WsPolicy> = MutPtr(0L),
            portName: MutPtr<WsXmlString> = MutPtr(0L),
            serviceName: MutPtr<WsXmlString> = MutPtr(0L),
            serviceNs: MutPtr<WsXmlString> = MutPtr(0L),
            bindingName: MutPtr<WsXmlString> = MutPtr(0L),
            bindingNs: MutPtr<WsXmlString> = MutPtr(0L),
            portTypeName: MutPtr<WsXmlString> = MutPtr(0L),
            portTypeNs: MutPtr<WsXmlString> = MutPtr(0L),
        ): WsMetadataEndpoint =
            WsMetadataEndpoint(
                endpointAddress = endpointAddress,
                endpointPolicyCtorArg = endpointPolicy,
                portNameCtorArg = portName,
                serviceNameCtorArg = serviceName,
                serviceNsCtorArg = serviceNs,
                bindingNameCtorArg = bindingName,
                bindingNsCtorArg = bindingNs,
                portTypeNameCtorArg = portTypeName,
                portTypeNsCtorArg = portTypeNs,
            )
    }
}

public class WsMetadataEndpoints internal constructor(
    endpointsCtorArg: MutPtr<WsMetadataEndpoint>,
    public var endpointCount: UInt,
) {
    public var endpoints: MutPtr<WsMetadataEndpoint> = endpointsCtorArg
        internal set

    public constructor() : this(
        endpointsCtorArg = MutPtr(0L),
        endpointCount = 0u,
    )

    public operator fun component1(): MutPtr<WsMetadataEndpoint> = this.endpoints

    public operator fun component2(): UInt = this.endpointCount

    public fun copy(endpoints: MutPtr<WsMetadataEndpoint> = this.endpoints, endpointCount: UInt = this.endpointCount): WsMetadataEndpoints = WsMetadataEndpoints(endpointsCtorArg = endpoints, endpointCount = endpointCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsMetadataEndpoints) return false
        if (this.endpoints != other.endpoints) return false
        if (this.endpointCount != other.endpointCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endpoints.hashCode()
        result = 31 * result + this.endpointCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMetadataEndpoints> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMetadataEndpoints> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsMetadataEndpoints =
                    WsMetadataEndpoints(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsMetadataEndpoint>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsMetadataEndpoints) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsMetadataEndpoint>(64)
                    ).writeNative(addr, value.endpoints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.endpointCount)
                }
            }

        public operator fun invoke(
            endpoints: MutPtr<WsMetadataEndpoint> = MutPtr(0L),
            endpointCount: UInt = 0u,
        ): WsMetadataEndpoints =
            WsMetadataEndpoints(
                endpointsCtorArg = endpoints,
                endpointCount = endpointCount,
            )
    }
}

public class WsMetadataProperty internal constructor(
    public var id: WsMetadataPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsMetadataPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsMetadataPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsMetadataProperty = WsMetadataProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsMetadataProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMetadataProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsMetadataProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsMetadataProperty =
                    WsMetadataProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsMetadataProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsMetadataPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsMetadataProperty =
            WsMetadataProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsNamedpipeSspiTransportSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    clientCredentialCtorArg: MutPtr<WsWindowsIntegratedAuthCredential>,
) {
    public var clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = clientCredentialCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        clientCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential

    public fun copy(binding: WsSecurityBinding = this.binding, clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential): WsNamedpipeSspiTransportSecurityBinding = WsNamedpipeSspiTransportSecurityBinding(binding = binding, clientCredentialCtorArg = clientCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsNamedpipeSspiTransportSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.clientCredential != other.clientCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsNamedpipeSspiTransportSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsNamedpipeSspiTransportSecurityBinding> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsNamedpipeSspiTransportSecurityBinding =
                    WsNamedpipeSspiTransportSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsNamedpipeSspiTransportSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                    ).writeNative(addr + 24L, value.clientCredential)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = MutPtr(0L),
        ): WsNamedpipeSspiTransportSecurityBinding =
            WsNamedpipeSspiTransportSecurityBinding(
                binding = binding,
                clientCredentialCtorArg = clientCredential,
            )
    }
}

public data class WsNcryptAsymmetricSecurityKeyHandle(
    public var keyHandle: WsSecurityKeyHandle = WsSecurityKeyHandle(),
    public var asymmetricKey: NcryptKeyHandle = 0uL,
)

public data class WsNetpipeUrl(
    public var url: WsUrl = WsUrl(),
    public var host: WsString = WsString(),
    public var port: UShort = 0u,
    public var portAsString: WsString = WsString(),
    public var path: WsString = WsString(),
    public var query: WsString = WsString(),
    public var fragment: WsString = WsString(),
)

public data class WsNettcpUrl(
    public var url: WsUrl = WsUrl(),
    public var host: WsString = WsString(),
    public var port: UShort = 0u,
    public var portAsString: WsString = WsString(),
    public var path: WsString = WsString(),
    public var query: WsString = WsString(),
    public var fragment: WsString = WsString(),
)

public class WsOpaqueWindowsIntegratedAuthCredential internal constructor(
    public var credential: WsWindowsIntegratedAuthCredential,
    opaqueAuthIdentityCtorArg: MutPtr<CVoid>,
) {
    public var opaqueAuthIdentity: MutPtr<CVoid> = opaqueAuthIdentityCtorArg
        internal set

    public constructor() : this(
        credential = WsWindowsIntegratedAuthCredential(),
        opaqueAuthIdentityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsWindowsIntegratedAuthCredential = this.credential

    public operator fun component2(): MutPtr<CVoid> = this.opaqueAuthIdentity

    public fun copy(credential: WsWindowsIntegratedAuthCredential = this.credential, opaqueAuthIdentity: MutPtr<CVoid> = this.opaqueAuthIdentity): WsOpaqueWindowsIntegratedAuthCredential = WsOpaqueWindowsIntegratedAuthCredential(credential = credential, opaqueAuthIdentityCtorArg = opaqueAuthIdentity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsOpaqueWindowsIntegratedAuthCredential) return false
        if (this.credential != other.credential) return false
        if (this.opaqueAuthIdentity != other.opaqueAuthIdentity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.credential.hashCode()
        result = 31 * result + this.opaqueAuthIdentity.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsOpaqueWindowsIntegratedAuthCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsOpaqueWindowsIntegratedAuthCredential> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsOpaqueWindowsIntegratedAuthCredential =
                    WsOpaqueWindowsIntegratedAuthCredential(
                        (WsWindowsIntegratedAuthCredential.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsOpaqueWindowsIntegratedAuthCredential) {
                    (WsWindowsIntegratedAuthCredential.typeLayout()).writeNative(addr, value.credential)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.opaqueAuthIdentity)
                }
            }

        public operator fun invoke(
            credential: WsWindowsIntegratedAuthCredential = WsWindowsIntegratedAuthCredential(),
            opaqueAuthIdentity: MutPtr<CVoid> = MutPtr(0L),
        ): WsOpaqueWindowsIntegratedAuthCredential =
            WsOpaqueWindowsIntegratedAuthCredential(
                credential = credential,
                opaqueAuthIdentityCtorArg = opaqueAuthIdentity,
            )
    }
}

public class WsOperationDescription internal constructor(
    public var versionInfo: UInt,
    inputMessageDescriptionCtorArg: MutPtr<WsMessageDescription>,
    outputMessageDescriptionCtorArg: MutPtr<WsMessageDescription>,
    public var inputMessageOptions: UInt,
    public var outputMessageOptions: UInt,
    public var parameterCount: UShort,
    parameterDescriptionCtorArg: MutPtr<WsParameterDescription>,
    public var stubCallback: WsServiceStubCallback,
    public var style: WsOperationStyle,
) {
    public var inputMessageDescription: MutPtr<WsMessageDescription> = inputMessageDescriptionCtorArg
        internal set

    public var outputMessageDescription: MutPtr<WsMessageDescription> = outputMessageDescriptionCtorArg
        internal set

    public var parameterDescription: MutPtr<WsParameterDescription> = parameterDescriptionCtorArg
        internal set

    public constructor() : this(
        versionInfo = 0u,
        inputMessageDescriptionCtorArg = MutPtr(0L),
        outputMessageDescriptionCtorArg = MutPtr(0L),
        inputMessageOptions = 0u,
        outputMessageOptions = 0u,
        parameterCount = 0u,
        parameterDescriptionCtorArg = MutPtr(0L),
        stubCallback = null,
        style = 0,
    )

    public operator fun component1(): UInt = this.versionInfo

    public operator fun component2(): MutPtr<WsMessageDescription> = this.inputMessageDescription

    public operator fun component3(): MutPtr<WsMessageDescription> = this.outputMessageDescription

    public operator fun component4(): UInt = this.inputMessageOptions

    public operator fun component5(): UInt = this.outputMessageOptions

    public operator fun component6(): UShort = this.parameterCount

    public operator fun component7(): MutPtr<WsParameterDescription> = this.parameterDescription

    public operator fun component8(): WsServiceStubCallback = this.stubCallback

    public operator fun component9(): WsOperationStyle = this.style

    public fun copy(versionInfo: UInt = this.versionInfo, inputMessageDescription: MutPtr<WsMessageDescription> = this.inputMessageDescription, outputMessageDescription: MutPtr<WsMessageDescription> = this.outputMessageDescription, inputMessageOptions: UInt = this.inputMessageOptions, outputMessageOptions: UInt = this.outputMessageOptions, parameterCount: UShort = this.parameterCount, parameterDescription: MutPtr<WsParameterDescription> = this.parameterDescription, stubCallback: WsServiceStubCallback = this.stubCallback, style: WsOperationStyle = this.style): WsOperationDescription = WsOperationDescription(versionInfo = versionInfo, inputMessageDescriptionCtorArg = inputMessageDescription, outputMessageDescriptionCtorArg = outputMessageDescription, inputMessageOptions = inputMessageOptions, outputMessageOptions = outputMessageOptions, parameterCount = parameterCount, parameterDescriptionCtorArg = parameterDescription, stubCallback = stubCallback, style = style)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsOperationDescription) return false
        if (this.versionInfo != other.versionInfo) return false
        if (this.inputMessageDescription != other.inputMessageDescription) return false
        if (this.outputMessageDescription != other.outputMessageDescription) return false
        if (this.inputMessageOptions != other.inputMessageOptions) return false
        if (this.outputMessageOptions != other.outputMessageOptions) return false
        if (this.parameterCount != other.parameterCount) return false
        if (this.parameterDescription != other.parameterDescription) return false
        if (this.stubCallback != other.stubCallback) return false
        if (this.style != other.style) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.versionInfo.hashCode()
        result = 31 * result + this.inputMessageDescription.hashCode()
        result = 31 * result + this.outputMessageDescription.hashCode()
        result = 31 * result + this.inputMessageOptions.hashCode()
        result = 31 * result + this.outputMessageOptions.hashCode()
        result = 31 * result + this.parameterCount.hashCode()
        result = 31 * result + this.parameterDescription.hashCode()
        result = 31 * result + this.stubCallback.hashCode()
        result = 31 * result + this.style.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            versionInfo: UInt = 0u,
            inputMessageDescription: MutPtr<WsMessageDescription> = MutPtr(0L),
            outputMessageDescription: MutPtr<WsMessageDescription> = MutPtr(0L),
            inputMessageOptions: UInt = 0u,
            outputMessageOptions: UInt = 0u,
            parameterCount: UShort = 0u,
            parameterDescription: MutPtr<WsParameterDescription> = MutPtr(0L),
            stubCallback: WsServiceStubCallback = null,
            style: WsOperationStyle = 0,
        ): WsOperationDescription =
            WsOperationDescription(
                versionInfo = versionInfo,
                inputMessageDescriptionCtorArg = inputMessageDescription,
                outputMessageDescriptionCtorArg = outputMessageDescription,
                inputMessageOptions = inputMessageOptions,
                outputMessageOptions = outputMessageOptions,
                parameterCount = parameterCount,
                parameterDescriptionCtorArg = parameterDescription,
                stubCallback = stubCallback,
                style = style,
            )
    }
}

public data class WsParameterDescription(
    public var parameterType: WsParameterType = 0,
    public var inputMessageIndex: UShort = 0u,
    public var outputMessageIndex: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsParameterDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsParameterDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsParameterDescription =
                    WsParameterDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WsParameterDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.parameterType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.inputMessageIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.outputMessageIndex)
                }
            }
    }
}

public class WsPolicyConstraints internal constructor(
    public var channelBinding: WsChannelBinding,
    channelPropertyConstraintsCtorArg: MutPtr<WsChannelPropertyConstraint>,
    public var channelPropertyConstraintCount: UInt,
    securityConstraintsCtorArg: MutPtr<WsSecurityConstraints>,
    policyExtensionsCtorArg: MutPtr<MutPtr<WsPolicyExtension>>,
    public var policyExtensionCount: UInt,
) {
    public var channelPropertyConstraints: MutPtr<WsChannelPropertyConstraint> = channelPropertyConstraintsCtorArg
        internal set

    public var securityConstraints: MutPtr<WsSecurityConstraints> = securityConstraintsCtorArg
        internal set

    public var policyExtensions: MutPtr<MutPtr<WsPolicyExtension>> = policyExtensionsCtorArg
        internal set

    public constructor() : this(
        channelBinding = 0,
        channelPropertyConstraintsCtorArg = MutPtr(0L),
        channelPropertyConstraintCount = 0u,
        securityConstraintsCtorArg = MutPtr(0L),
        policyExtensionsCtorArg = MutPtr(0L),
        policyExtensionCount = 0u,
    )

    public operator fun component1(): WsChannelBinding = this.channelBinding

    public operator fun component2(): MutPtr<WsChannelPropertyConstraint> = this.channelPropertyConstraints

    public operator fun component3(): UInt = this.channelPropertyConstraintCount

    public operator fun component4(): MutPtr<WsSecurityConstraints> = this.securityConstraints

    public operator fun component5(): MutPtr<MutPtr<WsPolicyExtension>> = this.policyExtensions

    public operator fun component6(): UInt = this.policyExtensionCount

    public fun copy(channelBinding: WsChannelBinding = this.channelBinding, channelPropertyConstraints: MutPtr<WsChannelPropertyConstraint> = this.channelPropertyConstraints, channelPropertyConstraintCount: UInt = this.channelPropertyConstraintCount, securityConstraints: MutPtr<WsSecurityConstraints> = this.securityConstraints, policyExtensions: MutPtr<MutPtr<WsPolicyExtension>> = this.policyExtensions, policyExtensionCount: UInt = this.policyExtensionCount): WsPolicyConstraints = WsPolicyConstraints(channelBinding = channelBinding, channelPropertyConstraintsCtorArg = channelPropertyConstraints, channelPropertyConstraintCount = channelPropertyConstraintCount, securityConstraintsCtorArg = securityConstraints, policyExtensionsCtorArg = policyExtensions, policyExtensionCount = policyExtensionCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsPolicyConstraints) return false
        if (this.channelBinding != other.channelBinding) return false
        if (this.channelPropertyConstraints != other.channelPropertyConstraints) return false
        if (this.channelPropertyConstraintCount != other.channelPropertyConstraintCount) return false
        if (this.securityConstraints != other.securityConstraints) return false
        if (this.policyExtensions != other.policyExtensions) return false
        if (this.policyExtensionCount != other.policyExtensionCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channelBinding.hashCode()
        result = 31 * result + this.channelPropertyConstraints.hashCode()
        result = 31 * result + this.channelPropertyConstraintCount.hashCode()
        result = 31 * result + this.securityConstraints.hashCode()
        result = 31 * result + this.policyExtensions.hashCode()
        result = 31 * result + this.policyExtensionCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyConstraints> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyConstraints> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsPolicyConstraints =
                    WsPolicyConstraints(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsChannelPropertyConstraint>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityConstraints>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsPolicyExtension>>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: WsPolicyConstraints) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.channelBinding)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsChannelPropertyConstraint>(64)
                    ).writeNative(addr + 8L, value.channelPropertyConstraints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.channelPropertyConstraintCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityConstraints>(64)
                    ).writeNative(addr + 24L, value.securityConstraints)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsPolicyExtension>>(64)
                    ).writeNative(addr + 32L, value.policyExtensions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.policyExtensionCount)
                }
            }

        public operator fun invoke(
            channelBinding: WsChannelBinding = 0,
            channelPropertyConstraints: MutPtr<WsChannelPropertyConstraint> = MutPtr(0L),
            channelPropertyConstraintCount: UInt = 0u,
            securityConstraints: MutPtr<WsSecurityConstraints> = MutPtr(0L),
            policyExtensions: MutPtr<MutPtr<WsPolicyExtension>> = MutPtr(0L),
            policyExtensionCount: UInt = 0u,
        ): WsPolicyConstraints =
            WsPolicyConstraints(
                channelBinding = channelBinding,
                channelPropertyConstraintsCtorArg = channelPropertyConstraints,
                channelPropertyConstraintCount = channelPropertyConstraintCount,
                securityConstraintsCtorArg = securityConstraints,
                policyExtensionsCtorArg = policyExtensions,
                policyExtensionCount = policyExtensionCount,
            )
    }
}

public data class WsPolicyExtension(
    public var type: WsPolicyExtensionType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyExtension> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsPolicyExtension =
                    WsPolicyExtension(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsPolicyExtension) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                }
            }
    }
}

public class WsPolicyProperties internal constructor(
    propertiesCtorArg: MutPtr<WsPolicyProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsPolicyProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsPolicyProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsPolicyProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsPolicyProperties = WsPolicyProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsPolicyProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyProperties> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsPolicyProperties =
                    WsPolicyProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsPolicyProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsPolicyProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsPolicyProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsPolicyProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsPolicyProperties =
            WsPolicyProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsPolicyProperty internal constructor(
    public var id: WsPolicyPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsPolicyPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsPolicyPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsPolicyProperty = WsPolicyProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsPolicyProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsPolicyProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsPolicyProperty =
                    WsPolicyProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsPolicyProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsPolicyPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsPolicyProperty =
            WsPolicyProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsProxyMessageCallbackContext internal constructor(
    public var callback: WsProxyMessageCallback,
    stateCtorArg: MutPtr<CVoid>,
) {
    public var state: MutPtr<CVoid> = stateCtorArg
        internal set

    public constructor() : this(
        callback = null,
        stateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsProxyMessageCallback = this.callback

    public operator fun component2(): MutPtr<CVoid> = this.state

    public fun copy(callback: WsProxyMessageCallback = this.callback, state: MutPtr<CVoid> = this.state): WsProxyMessageCallbackContext = WsProxyMessageCallbackContext(callback = callback, stateCtorArg = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsProxyMessageCallbackContext) return false
        if (this.callback != other.callback) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callback.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callback: WsProxyMessageCallback = null,
            state: MutPtr<CVoid> = MutPtr(0L),
        ): WsProxyMessageCallbackContext =
            WsProxyMessageCallbackContext(
                callback = callback,
                stateCtorArg = state,
            )
    }
}

public class WsProxyProperty internal constructor(
    public var id: WsProxyPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsProxyPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsProxyPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsProxyProperty = WsProxyProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsProxyProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsProxyProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsProxyProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsProxyProperty =
                    WsProxyProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsProxyProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsProxyPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsProxyProperty =
            WsProxyProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsRawSymmetricSecurityKeyHandle(
    public var keyHandle: WsSecurityKeyHandle = WsSecurityKeyHandle(),
    public var rawKeyBytes: WsBytes = WsBytes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRawSymmetricSecurityKeyHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRawSymmetricSecurityKeyHandle> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsRawSymmetricSecurityKeyHandle =
                    WsRawSymmetricSecurityKeyHandle(
                        (WsSecurityKeyHandle.typeLayout()).readNative(addr),
                        (WsBytes.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsRawSymmetricSecurityKeyHandle) {
                    (WsSecurityKeyHandle.typeLayout()).writeNative(addr, value.keyHandle)
                    (WsBytes.typeLayout()).writeNative(addr + 8L, value.rawKeyBytes)
                }
            }
    }
}

public class WsRequestSecurityTokenProperty internal constructor(
    public var id: WsRequestSecurityTokenPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsRequestSecurityTokenPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsRequestSecurityTokenPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsRequestSecurityTokenProperty = WsRequestSecurityTokenProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsRequestSecurityTokenProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRequestSecurityTokenProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRequestSecurityTokenProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsRequestSecurityTokenProperty =
                    WsRequestSecurityTokenProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsRequestSecurityTokenProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsRequestSecurityTokenPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsRequestSecurityTokenProperty =
            WsRequestSecurityTokenProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsRequestSecurityTokenPropertyConstraint internal constructor(
    public var id: WsRequestSecurityTokenPropertyId,
    allowedValuesCtorArg: MutPtr<CVoid>,
    public var allowedValuesSize: UInt,
    public var out: WsRequestSecurityTokenPropertyConstraint0,
) {
    public var allowedValues: MutPtr<CVoid> = allowedValuesCtorArg
        internal set

    public constructor() : this(
        id = 0,
        allowedValuesCtorArg = MutPtr(0L),
        allowedValuesSize = 0u,
        out = WsRequestSecurityTokenPropertyConstraint0(),
    )

    public operator fun component1(): WsRequestSecurityTokenPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.allowedValues

    public operator fun component3(): UInt = this.allowedValuesSize

    public operator fun component4(): WsRequestSecurityTokenPropertyConstraint0 = this.out

    public fun copy(id: WsRequestSecurityTokenPropertyId = this.id, allowedValues: MutPtr<CVoid> = this.allowedValues, allowedValuesSize: UInt = this.allowedValuesSize, out: WsRequestSecurityTokenPropertyConstraint0 = this.out): WsRequestSecurityTokenPropertyConstraint = WsRequestSecurityTokenPropertyConstraint(id = id, allowedValuesCtorArg = allowedValues, allowedValuesSize = allowedValuesSize, out = out)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsRequestSecurityTokenPropertyConstraint) return false
        if (this.id != other.id) return false
        if (this.allowedValues != other.allowedValues) return false
        if (this.allowedValuesSize != other.allowedValuesSize) return false
        if (this.out != other.out) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.allowedValues.hashCode()
        result = 31 * result + this.allowedValuesSize.hashCode()
        result = 31 * result + this.out.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRequestSecurityTokenPropertyConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRequestSecurityTokenPropertyConstraint> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsRequestSecurityTokenPropertyConstraint =
                    WsRequestSecurityTokenPropertyConstraint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (WsRequestSecurityTokenPropertyConstraint0.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsRequestSecurityTokenPropertyConstraint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.allowedValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allowedValuesSize)
                    (WsRequestSecurityTokenPropertyConstraint0.typeLayout()).writeNative(addr + 24L, value.out)
                }
            }

        public operator fun invoke(
            id: WsRequestSecurityTokenPropertyId = 0,
            allowedValues: MutPtr<CVoid> = MutPtr(0L),
            allowedValuesSize: UInt = 0u,
            out: WsRequestSecurityTokenPropertyConstraint0 = WsRequestSecurityTokenPropertyConstraint0(),
        ): WsRequestSecurityTokenPropertyConstraint =
            WsRequestSecurityTokenPropertyConstraint(
                id = id,
                allowedValuesCtorArg = allowedValues,
                allowedValuesSize = allowedValuesSize,
                out = out,
            )
    }
}

public data class WsRequestSecurityTokenPropertyConstraint0(
    public var requestSecurityTokenProperty: WsRequestSecurityTokenProperty = WsRequestSecurityTokenProperty(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRequestSecurityTokenPropertyConstraint0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRequestSecurityTokenPropertyConstraint0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsRequestSecurityTokenPropertyConstraint0 =
                    WsRequestSecurityTokenPropertyConstraint0(
                        (WsRequestSecurityTokenProperty.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsRequestSecurityTokenPropertyConstraint0) {
                    (WsRequestSecurityTokenProperty.typeLayout()).writeNative(addr, value.requestSecurityTokenProperty)
                }
            }
    }
}

public data class WsRsaEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var modulus: WsBytes = WsBytes(),
    public var exponent: WsBytes = WsBytes(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRsaEndpointIdentity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsRsaEndpointIdentity> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsRsaEndpointIdentity =
                    WsRsaEndpointIdentity(
                        (WsEndpointIdentity.typeLayout()).readNative(addr),
                        (WsBytes.typeLayout()).readNative(addr + 8L),
                        (WsBytes.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsRsaEndpointIdentity) {
                    (WsEndpointIdentity.typeLayout()).writeNative(addr, value.identity)
                    (WsBytes.typeLayout()).writeNative(addr + 8L, value.modulus)
                    (WsBytes.typeLayout()).writeNative(addr + 24L, value.exponent)
                }
            }
    }
}

public data class WsSamlAuthenticator(
    public var authenticatorType: WsSamlAuthenticatorType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSamlAuthenticator> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSamlAuthenticator> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsSamlAuthenticator =
                    WsSamlAuthenticator(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsSamlAuthenticator) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.authenticatorType)
                }
            }
    }
}

public class WsSamlMessageSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    public var bindingUsage: WsMessageSecurityUsage,
    authenticatorCtorArg: MutPtr<WsSamlAuthenticator>,
) {
    public var authenticator: MutPtr<WsSamlAuthenticator> = authenticatorCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        bindingUsage = 0,
        authenticatorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): WsMessageSecurityUsage = this.bindingUsage

    public operator fun component3(): MutPtr<WsSamlAuthenticator> = this.authenticator

    public fun copy(binding: WsSecurityBinding = this.binding, bindingUsage: WsMessageSecurityUsage = this.bindingUsage, authenticator: MutPtr<WsSamlAuthenticator> = this.authenticator): WsSamlMessageSecurityBinding = WsSamlMessageSecurityBinding(binding = binding, bindingUsage = bindingUsage, authenticatorCtorArg = authenticator)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSamlMessageSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.bindingUsage != other.bindingUsage) return false
        if (this.authenticator != other.authenticator) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.bindingUsage.hashCode()
        result = 31 * result + this.authenticator.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSamlMessageSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSamlMessageSecurityBinding> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSamlMessageSecurityBinding =
                    WsSamlMessageSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSamlAuthenticator>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsSamlMessageSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSamlAuthenticator>(64)
                    ).writeNative(addr + 32L, value.authenticator)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            bindingUsage: WsMessageSecurityUsage = 0,
            authenticator: MutPtr<WsSamlAuthenticator> = MutPtr(0L),
        ): WsSamlMessageSecurityBinding =
            WsSamlMessageSecurityBinding(
                binding = binding,
                bindingUsage = bindingUsage,
                authenticatorCtorArg = authenticator,
            )
    }
}

public class WsSecurityAlgorithmProperty internal constructor(
    public var id: WsSecurityAlgorithmPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsSecurityAlgorithmPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsSecurityAlgorithmPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsSecurityAlgorithmProperty = WsSecurityAlgorithmProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityAlgorithmProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityAlgorithmProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityAlgorithmProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityAlgorithmProperty =
                    WsSecurityAlgorithmProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityAlgorithmProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsSecurityAlgorithmPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsSecurityAlgorithmProperty =
            WsSecurityAlgorithmProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsSecurityAlgorithmSuite internal constructor(
    public var canonicalizationAlgorithm: WsSecurityAlgorithmId,
    public var digestAlgorithm: WsSecurityAlgorithmId,
    public var symmetricSignatureAlgorithm: WsSecurityAlgorithmId,
    public var asymmetricSignatureAlgorithm: WsSecurityAlgorithmId,
    public var encryptionAlgorithm: WsSecurityAlgorithmId,
    public var keyDerivationAlgorithm: WsSecurityAlgorithmId,
    public var symmetricKeyWrapAlgorithm: WsSecurityAlgorithmId,
    public var asymmetricKeyWrapAlgorithm: WsSecurityAlgorithmId,
    public var minSymmetricKeyLength: UInt,
    public var maxSymmetricKeyLength: UInt,
    public var minAsymmetricKeyLength: UInt,
    public var maxAsymmetricKeyLength: UInt,
    propertiesCtorArg: MutPtr<WsSecurityAlgorithmProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsSecurityAlgorithmProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        canonicalizationAlgorithm = 0,
        digestAlgorithm = 0,
        symmetricSignatureAlgorithm = 0,
        asymmetricSignatureAlgorithm = 0,
        encryptionAlgorithm = 0,
        keyDerivationAlgorithm = 0,
        symmetricKeyWrapAlgorithm = 0,
        asymmetricKeyWrapAlgorithm = 0,
        minSymmetricKeyLength = 0u,
        maxSymmetricKeyLength = 0u,
        minAsymmetricKeyLength = 0u,
        maxAsymmetricKeyLength = 0u,
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): WsSecurityAlgorithmId = this.canonicalizationAlgorithm

    public operator fun component2(): WsSecurityAlgorithmId = this.digestAlgorithm

    public operator fun component3(): WsSecurityAlgorithmId = this.symmetricSignatureAlgorithm

    public operator fun component4(): WsSecurityAlgorithmId = this.asymmetricSignatureAlgorithm

    public operator fun component5(): WsSecurityAlgorithmId = this.encryptionAlgorithm

    public operator fun component6(): WsSecurityAlgorithmId = this.keyDerivationAlgorithm

    public operator fun component7(): WsSecurityAlgorithmId = this.symmetricKeyWrapAlgorithm

    public operator fun component8(): WsSecurityAlgorithmId = this.asymmetricKeyWrapAlgorithm

    public operator fun component9(): UInt = this.minSymmetricKeyLength

    public operator fun component10(): UInt = this.maxSymmetricKeyLength

    public operator fun component11(): UInt = this.minAsymmetricKeyLength

    public operator fun component12(): UInt = this.maxAsymmetricKeyLength

    public operator fun component13(): MutPtr<WsSecurityAlgorithmProperty> = this.properties

    public operator fun component14(): UInt = this.propertyCount

    public fun copy(canonicalizationAlgorithm: WsSecurityAlgorithmId = this.canonicalizationAlgorithm, digestAlgorithm: WsSecurityAlgorithmId = this.digestAlgorithm, symmetricSignatureAlgorithm: WsSecurityAlgorithmId = this.symmetricSignatureAlgorithm, asymmetricSignatureAlgorithm: WsSecurityAlgorithmId = this.asymmetricSignatureAlgorithm, encryptionAlgorithm: WsSecurityAlgorithmId = this.encryptionAlgorithm, keyDerivationAlgorithm: WsSecurityAlgorithmId = this.keyDerivationAlgorithm, symmetricKeyWrapAlgorithm: WsSecurityAlgorithmId = this.symmetricKeyWrapAlgorithm, asymmetricKeyWrapAlgorithm: WsSecurityAlgorithmId = this.asymmetricKeyWrapAlgorithm, minSymmetricKeyLength: UInt = this.minSymmetricKeyLength, maxSymmetricKeyLength: UInt = this.maxSymmetricKeyLength, minAsymmetricKeyLength: UInt = this.minAsymmetricKeyLength, maxAsymmetricKeyLength: UInt = this.maxAsymmetricKeyLength, properties: MutPtr<WsSecurityAlgorithmProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsSecurityAlgorithmSuite = WsSecurityAlgorithmSuite(canonicalizationAlgorithm = canonicalizationAlgorithm, digestAlgorithm = digestAlgorithm, symmetricSignatureAlgorithm = symmetricSignatureAlgorithm, asymmetricSignatureAlgorithm = asymmetricSignatureAlgorithm, encryptionAlgorithm = encryptionAlgorithm, keyDerivationAlgorithm = keyDerivationAlgorithm, symmetricKeyWrapAlgorithm = symmetricKeyWrapAlgorithm, asymmetricKeyWrapAlgorithm = asymmetricKeyWrapAlgorithm, minSymmetricKeyLength = minSymmetricKeyLength, maxSymmetricKeyLength = maxSymmetricKeyLength, minAsymmetricKeyLength = minAsymmetricKeyLength, maxAsymmetricKeyLength = maxAsymmetricKeyLength, propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityAlgorithmSuite) return false
        if (this.canonicalizationAlgorithm != other.canonicalizationAlgorithm) return false
        if (this.digestAlgorithm != other.digestAlgorithm) return false
        if (this.symmetricSignatureAlgorithm != other.symmetricSignatureAlgorithm) return false
        if (this.asymmetricSignatureAlgorithm != other.asymmetricSignatureAlgorithm) return false
        if (this.encryptionAlgorithm != other.encryptionAlgorithm) return false
        if (this.keyDerivationAlgorithm != other.keyDerivationAlgorithm) return false
        if (this.symmetricKeyWrapAlgorithm != other.symmetricKeyWrapAlgorithm) return false
        if (this.asymmetricKeyWrapAlgorithm != other.asymmetricKeyWrapAlgorithm) return false
        if (this.minSymmetricKeyLength != other.minSymmetricKeyLength) return false
        if (this.maxSymmetricKeyLength != other.maxSymmetricKeyLength) return false
        if (this.minAsymmetricKeyLength != other.minAsymmetricKeyLength) return false
        if (this.maxAsymmetricKeyLength != other.maxAsymmetricKeyLength) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.canonicalizationAlgorithm.hashCode()
        result = 31 * result + this.digestAlgorithm.hashCode()
        result = 31 * result + this.symmetricSignatureAlgorithm.hashCode()
        result = 31 * result + this.asymmetricSignatureAlgorithm.hashCode()
        result = 31 * result + this.encryptionAlgorithm.hashCode()
        result = 31 * result + this.keyDerivationAlgorithm.hashCode()
        result = 31 * result + this.symmetricKeyWrapAlgorithm.hashCode()
        result = 31 * result + this.asymmetricKeyWrapAlgorithm.hashCode()
        result = 31 * result + this.minSymmetricKeyLength.hashCode()
        result = 31 * result + this.maxSymmetricKeyLength.hashCode()
        result = 31 * result + this.minAsymmetricKeyLength.hashCode()
        result = 31 * result + this.maxAsymmetricKeyLength.hashCode()
        result = 31 * result + this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityAlgorithmSuite> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityAlgorithmSuite> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityAlgorithmSuite =
                    WsSecurityAlgorithmSuite(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityAlgorithmProperty>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityAlgorithmSuite) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.canonicalizationAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.digestAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.symmetricSignatureAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.asymmetricSignatureAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.encryptionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.keyDerivationAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.symmetricKeyWrapAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.asymmetricKeyWrapAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.minSymmetricKeyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxSymmetricKeyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.minAsymmetricKeyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.maxAsymmetricKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityAlgorithmProperty>(64)
                    ).writeNative(addr + 48L, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.propertyCount)
                }
            }

        public operator fun invoke(
            canonicalizationAlgorithm: WsSecurityAlgorithmId = 0,
            digestAlgorithm: WsSecurityAlgorithmId = 0,
            symmetricSignatureAlgorithm: WsSecurityAlgorithmId = 0,
            asymmetricSignatureAlgorithm: WsSecurityAlgorithmId = 0,
            encryptionAlgorithm: WsSecurityAlgorithmId = 0,
            keyDerivationAlgorithm: WsSecurityAlgorithmId = 0,
            symmetricKeyWrapAlgorithm: WsSecurityAlgorithmId = 0,
            asymmetricKeyWrapAlgorithm: WsSecurityAlgorithmId = 0,
            minSymmetricKeyLength: UInt = 0u,
            maxSymmetricKeyLength: UInt = 0u,
            minAsymmetricKeyLength: UInt = 0u,
            maxAsymmetricKeyLength: UInt = 0u,
            properties: MutPtr<WsSecurityAlgorithmProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsSecurityAlgorithmSuite =
            WsSecurityAlgorithmSuite(
                canonicalizationAlgorithm = canonicalizationAlgorithm,
                digestAlgorithm = digestAlgorithm,
                symmetricSignatureAlgorithm = symmetricSignatureAlgorithm,
                asymmetricSignatureAlgorithm = asymmetricSignatureAlgorithm,
                encryptionAlgorithm = encryptionAlgorithm,
                keyDerivationAlgorithm = keyDerivationAlgorithm,
                symmetricKeyWrapAlgorithm = symmetricKeyWrapAlgorithm,
                asymmetricKeyWrapAlgorithm = asymmetricKeyWrapAlgorithm,
                minSymmetricKeyLength = minSymmetricKeyLength,
                maxSymmetricKeyLength = maxSymmetricKeyLength,
                minAsymmetricKeyLength = minAsymmetricKeyLength,
                maxAsymmetricKeyLength = maxAsymmetricKeyLength,
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsSecurityBinding internal constructor(
    public var bindingType: WsSecurityBindingType,
    propertiesCtorArg: MutPtr<WsSecurityBindingProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsSecurityBindingProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        bindingType = 0,
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): WsSecurityBindingType = this.bindingType

    public operator fun component2(): MutPtr<WsSecurityBindingProperty> = this.properties

    public operator fun component3(): UInt = this.propertyCount

    public fun copy(bindingType: WsSecurityBindingType = this.bindingType, properties: MutPtr<WsSecurityBindingProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsSecurityBinding = WsSecurityBinding(bindingType = bindingType, propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityBinding) return false
        if (this.bindingType != other.bindingType) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bindingType.hashCode()
        result = 31 * result + this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBinding> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityBinding =
                    WsSecurityBinding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityBindingProperty>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityBinding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bindingType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityBindingProperty>(64)
                    ).writeNative(addr + 8L, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.propertyCount)
                }
            }

        public operator fun invoke(
            bindingType: WsSecurityBindingType = 0,
            properties: MutPtr<WsSecurityBindingProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsSecurityBinding =
            WsSecurityBinding(
                bindingType = bindingType,
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsSecurityBindingConstraint internal constructor(
    public var type: WsSecurityBindingConstraintType,
    propertyConstraintsCtorArg: MutPtr<WsSecurityBindingPropertyConstraint>,
    public var propertyConstraintCount: UInt,
) {
    public var propertyConstraints: MutPtr<WsSecurityBindingPropertyConstraint> = propertyConstraintsCtorArg
        internal set

    public constructor() : this(
        type = 0,
        propertyConstraintsCtorArg = MutPtr(0L),
        propertyConstraintCount = 0u,
    )

    public operator fun component1(): WsSecurityBindingConstraintType = this.type

    public operator fun component2(): MutPtr<WsSecurityBindingPropertyConstraint> = this.propertyConstraints

    public operator fun component3(): UInt = this.propertyConstraintCount

    public fun copy(type: WsSecurityBindingConstraintType = this.type, propertyConstraints: MutPtr<WsSecurityBindingPropertyConstraint> = this.propertyConstraints, propertyConstraintCount: UInt = this.propertyConstraintCount): WsSecurityBindingConstraint = WsSecurityBindingConstraint(type = type, propertyConstraintsCtorArg = propertyConstraints, propertyConstraintCount = propertyConstraintCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityBindingConstraint) return false
        if (this.type != other.type) return false
        if (this.propertyConstraints != other.propertyConstraints) return false
        if (this.propertyConstraintCount != other.propertyConstraintCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.propertyConstraints.hashCode()
        result = 31 * result + this.propertyConstraintCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingConstraint> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityBindingConstraint =
                    WsSecurityBindingConstraint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityBindingPropertyConstraint>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityBindingConstraint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityBindingPropertyConstraint>(64)
                    ).writeNative(addr + 8L, value.propertyConstraints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.propertyConstraintCount)
                }
            }

        public operator fun invoke(
            type: WsSecurityBindingConstraintType = 0,
            propertyConstraints: MutPtr<WsSecurityBindingPropertyConstraint> = MutPtr(0L),
            propertyConstraintCount: UInt = 0u,
        ): WsSecurityBindingConstraint =
            WsSecurityBindingConstraint(
                type = type,
                propertyConstraintsCtorArg = propertyConstraints,
                propertyConstraintCount = propertyConstraintCount,
            )
    }
}

public class WsSecurityBindingProperties internal constructor(
    propertiesCtorArg: MutPtr<WsSecurityBindingProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsSecurityBindingProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsSecurityBindingProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsSecurityBindingProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsSecurityBindingProperties = WsSecurityBindingProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityBindingProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingProperties> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityBindingProperties =
                    WsSecurityBindingProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityBindingProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityBindingProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityBindingProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsSecurityBindingProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsSecurityBindingProperties =
            WsSecurityBindingProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsSecurityBindingProperty internal constructor(
    public var id: WsSecurityBindingPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsSecurityBindingPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsSecurityBindingPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsSecurityBindingProperty = WsSecurityBindingProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityBindingProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityBindingProperty =
                    WsSecurityBindingProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityBindingProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsSecurityBindingPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsSecurityBindingProperty =
            WsSecurityBindingProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsSecurityBindingPropertyConstraint internal constructor(
    public var id: WsSecurityBindingPropertyId,
    allowedValuesCtorArg: MutPtr<CVoid>,
    public var allowedValuesSize: UInt,
    public var out: WsSecurityBindingPropertyConstraint0,
) {
    public var allowedValues: MutPtr<CVoid> = allowedValuesCtorArg
        internal set

    public constructor() : this(
        id = 0,
        allowedValuesCtorArg = MutPtr(0L),
        allowedValuesSize = 0u,
        out = WsSecurityBindingPropertyConstraint0(),
    )

    public operator fun component1(): WsSecurityBindingPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.allowedValues

    public operator fun component3(): UInt = this.allowedValuesSize

    public operator fun component4(): WsSecurityBindingPropertyConstraint0 = this.out

    public fun copy(id: WsSecurityBindingPropertyId = this.id, allowedValues: MutPtr<CVoid> = this.allowedValues, allowedValuesSize: UInt = this.allowedValuesSize, out: WsSecurityBindingPropertyConstraint0 = this.out): WsSecurityBindingPropertyConstraint = WsSecurityBindingPropertyConstraint(id = id, allowedValuesCtorArg = allowedValues, allowedValuesSize = allowedValuesSize, out = out)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityBindingPropertyConstraint) return false
        if (this.id != other.id) return false
        if (this.allowedValues != other.allowedValues) return false
        if (this.allowedValuesSize != other.allowedValuesSize) return false
        if (this.out != other.out) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.allowedValues.hashCode()
        result = 31 * result + this.allowedValuesSize.hashCode()
        result = 31 * result + this.out.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingPropertyConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingPropertyConstraint> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityBindingPropertyConstraint =
                    WsSecurityBindingPropertyConstraint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (WsSecurityBindingPropertyConstraint0.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityBindingPropertyConstraint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.allowedValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allowedValuesSize)
                    (WsSecurityBindingPropertyConstraint0.typeLayout()).writeNative(addr + 24L, value.out)
                }
            }

        public operator fun invoke(
            id: WsSecurityBindingPropertyId = 0,
            allowedValues: MutPtr<CVoid> = MutPtr(0L),
            allowedValuesSize: UInt = 0u,
            out: WsSecurityBindingPropertyConstraint0 = WsSecurityBindingPropertyConstraint0(),
        ): WsSecurityBindingPropertyConstraint =
            WsSecurityBindingPropertyConstraint(
                id = id,
                allowedValuesCtorArg = allowedValues,
                allowedValuesSize = allowedValuesSize,
                out = out,
            )
    }
}

public data class WsSecurityBindingPropertyConstraint0(
    public var securityBindingProperty: WsSecurityBindingProperty = WsSecurityBindingProperty(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingPropertyConstraint0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityBindingPropertyConstraint0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityBindingPropertyConstraint0 =
                    WsSecurityBindingPropertyConstraint0(
                        (WsSecurityBindingProperty.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsSecurityBindingPropertyConstraint0) {
                    (WsSecurityBindingProperty.typeLayout()).writeNative(addr, value.securityBindingProperty)
                }
            }
    }
}

public class WsSecurityConstraints internal constructor(
    securityPropertyConstraintsCtorArg: MutPtr<WsSecurityPropertyConstraint>,
    public var securityPropertyConstraintCount: UInt,
    securityBindingConstraintsCtorArg: MutPtr<MutPtr<WsSecurityBindingConstraint>>,
    public var securityBindingConstraintCount: UInt,
) {
    public var securityPropertyConstraints: MutPtr<WsSecurityPropertyConstraint> = securityPropertyConstraintsCtorArg
        internal set

    public var securityBindingConstraints: MutPtr<MutPtr<WsSecurityBindingConstraint>> = securityBindingConstraintsCtorArg
        internal set

    public constructor() : this(
        securityPropertyConstraintsCtorArg = MutPtr(0L),
        securityPropertyConstraintCount = 0u,
        securityBindingConstraintsCtorArg = MutPtr(0L),
        securityBindingConstraintCount = 0u,
    )

    public operator fun component1(): MutPtr<WsSecurityPropertyConstraint> = this.securityPropertyConstraints

    public operator fun component2(): UInt = this.securityPropertyConstraintCount

    public operator fun component3(): MutPtr<MutPtr<WsSecurityBindingConstraint>> = this.securityBindingConstraints

    public operator fun component4(): UInt = this.securityBindingConstraintCount

    public fun copy(securityPropertyConstraints: MutPtr<WsSecurityPropertyConstraint> = this.securityPropertyConstraints, securityPropertyConstraintCount: UInt = this.securityPropertyConstraintCount, securityBindingConstraints: MutPtr<MutPtr<WsSecurityBindingConstraint>> = this.securityBindingConstraints, securityBindingConstraintCount: UInt = this.securityBindingConstraintCount): WsSecurityConstraints = WsSecurityConstraints(securityPropertyConstraintsCtorArg = securityPropertyConstraints, securityPropertyConstraintCount = securityPropertyConstraintCount, securityBindingConstraintsCtorArg = securityBindingConstraints, securityBindingConstraintCount = securityBindingConstraintCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityConstraints) return false
        if (this.securityPropertyConstraints != other.securityPropertyConstraints) return false
        if (this.securityPropertyConstraintCount != other.securityPropertyConstraintCount) return false
        if (this.securityBindingConstraints != other.securityBindingConstraints) return false
        if (this.securityBindingConstraintCount != other.securityBindingConstraintCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityPropertyConstraints.hashCode()
        result = 31 * result + this.securityPropertyConstraintCount.hashCode()
        result = 31 * result + this.securityBindingConstraints.hashCode()
        result = 31 * result + this.securityBindingConstraintCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityConstraints> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityConstraints> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityConstraints =
                    WsSecurityConstraints(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityPropertyConstraint>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsSecurityBindingConstraint>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityConstraints) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityPropertyConstraint>(64)
                    ).writeNative(addr, value.securityPropertyConstraints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.securityPropertyConstraintCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsSecurityBindingConstraint>>(64)
                    ).writeNative(addr + 16L, value.securityBindingConstraints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.securityBindingConstraintCount)
                }
            }

        public operator fun invoke(
            securityPropertyConstraints: MutPtr<WsSecurityPropertyConstraint> = MutPtr(0L),
            securityPropertyConstraintCount: UInt = 0u,
            securityBindingConstraints: MutPtr<MutPtr<WsSecurityBindingConstraint>> = MutPtr(0L),
            securityBindingConstraintCount: UInt = 0u,
        ): WsSecurityConstraints =
            WsSecurityConstraints(
                securityPropertyConstraintsCtorArg = securityPropertyConstraints,
                securityPropertyConstraintCount = securityPropertyConstraintCount,
                securityBindingConstraintsCtorArg = securityBindingConstraints,
                securityBindingConstraintCount = securityBindingConstraintCount,
            )
    }
}

public class WsSecurityContextMessageSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    public var bindingUsage: WsMessageSecurityUsage,
    bootstrapSecurityDescriptionCtorArg: MutPtr<WsSecurityDescription>,
) {
    public var bootstrapSecurityDescription: MutPtr<WsSecurityDescription> = bootstrapSecurityDescriptionCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        bindingUsage = 0,
        bootstrapSecurityDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): WsMessageSecurityUsage = this.bindingUsage

    public operator fun component3(): MutPtr<WsSecurityDescription> = this.bootstrapSecurityDescription

    public fun copy(binding: WsSecurityBinding = this.binding, bindingUsage: WsMessageSecurityUsage = this.bindingUsage, bootstrapSecurityDescription: MutPtr<WsSecurityDescription> = this.bootstrapSecurityDescription): WsSecurityContextMessageSecurityBinding = WsSecurityContextMessageSecurityBinding(binding = binding, bindingUsage = bindingUsage, bootstrapSecurityDescriptionCtorArg = bootstrapSecurityDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityContextMessageSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.bindingUsage != other.bindingUsage) return false
        if (this.bootstrapSecurityDescription != other.bootstrapSecurityDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.bindingUsage.hashCode()
        result = 31 * result + this.bootstrapSecurityDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBinding> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityContextMessageSecurityBinding =
                    WsSecurityContextMessageSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityDescription>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityContextMessageSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityDescription>(64)
                    ).writeNative(addr + 32L, value.bootstrapSecurityDescription)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            bindingUsage: WsMessageSecurityUsage = 0,
            bootstrapSecurityDescription: MutPtr<WsSecurityDescription> = MutPtr(0L),
        ): WsSecurityContextMessageSecurityBinding =
            WsSecurityContextMessageSecurityBinding(
                binding = binding,
                bindingUsage = bindingUsage,
                bootstrapSecurityDescriptionCtorArg = bootstrapSecurityDescription,
            )
    }
}

public class WsSecurityContextMessageSecurityBindingConstraint internal constructor(
    public var bindingConstraint: WsSecurityBindingConstraint,
    public var bindingUsage: WsMessageSecurityUsage,
    bootstrapSecurityConstraintCtorArg: MutPtr<WsSecurityConstraints>,
) {
    public var bootstrapSecurityConstraint: MutPtr<WsSecurityConstraints> = bootstrapSecurityConstraintCtorArg
        internal set

    public constructor() : this(
        bindingConstraint = WsSecurityBindingConstraint(),
        bindingUsage = 0,
        bootstrapSecurityConstraintCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBindingConstraint = this.bindingConstraint

    public operator fun component2(): WsMessageSecurityUsage = this.bindingUsage

    public operator fun component3(): MutPtr<WsSecurityConstraints> = this.bootstrapSecurityConstraint

    public fun copy(bindingConstraint: WsSecurityBindingConstraint = this.bindingConstraint, bindingUsage: WsMessageSecurityUsage = this.bindingUsage, bootstrapSecurityConstraint: MutPtr<WsSecurityConstraints> = this.bootstrapSecurityConstraint): WsSecurityContextMessageSecurityBindingConstraint = WsSecurityContextMessageSecurityBindingConstraint(bindingConstraint = bindingConstraint, bindingUsage = bindingUsage, bootstrapSecurityConstraintCtorArg = bootstrapSecurityConstraint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityContextMessageSecurityBindingConstraint) return false
        if (this.bindingConstraint != other.bindingConstraint) return false
        if (this.bindingUsage != other.bindingUsage) return false
        if (this.bootstrapSecurityConstraint != other.bootstrapSecurityConstraint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bindingConstraint.hashCode()
        result = 31 * result + this.bindingUsage.hashCode()
        result = 31 * result + this.bootstrapSecurityConstraint.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBindingConstraint> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityContextMessageSecurityBindingConstraint =
                    WsSecurityContextMessageSecurityBindingConstraint(
                        (WsSecurityBindingConstraint.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityConstraints>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityContextMessageSecurityBindingConstraint) {
                    (WsSecurityBindingConstraint.typeLayout()).writeNative(addr, value.bindingConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityConstraints>(64)
                    ).writeNative(addr + 32L, value.bootstrapSecurityConstraint)
                }
            }

        public operator fun invoke(
            bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
            bindingUsage: WsMessageSecurityUsage = 0,
            bootstrapSecurityConstraint: MutPtr<WsSecurityConstraints> = MutPtr(0L),
        ): WsSecurityContextMessageSecurityBindingConstraint =
            WsSecurityContextMessageSecurityBindingConstraint(
                bindingConstraint = bindingConstraint,
                bindingUsage = bindingUsage,
                bootstrapSecurityConstraintCtorArg = bootstrapSecurityConstraint,
            )
    }
}

public data class WsSecurityContextMessageSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBindingPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBindingPolicyDescription> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityContextMessageSecurityBindingPolicyDescription =
                    WsSecurityContextMessageSecurityBindingPolicyDescription(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityContextMessageSecurityBindingPolicyDescription) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.bindingUsage)
                }
            }
    }
}

public data class WsSecurityContextMessageSecurityBindingTemplate(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextMessageSecurityBindingTemplate> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityContextMessageSecurityBindingTemplate =
                    WsSecurityContextMessageSecurityBindingTemplate(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsSecurityContextMessageSecurityBindingTemplate) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                }
            }
    }
}

public class WsSecurityContextProperty internal constructor(
    public var id: WsSecurityContextPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsSecurityContextPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsSecurityContextPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsSecurityContextProperty = WsSecurityContextProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityContextProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityContextProperty =
                    WsSecurityContextProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityContextProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsSecurityContextPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsSecurityContextProperty =
            WsSecurityContextProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsSecurityContextSecurityBindingPolicyDescription(
    public var securityContextMessageSecurityBinding: WsSecurityContextMessageSecurityBindingPolicyDescription = WsSecurityContextMessageSecurityBindingPolicyDescription(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextSecurityBindingPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextSecurityBindingPolicyDescription> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityContextSecurityBindingPolicyDescription =
                    WsSecurityContextSecurityBindingPolicyDescription(
                        (WsSecurityContextMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityContextSecurityBindingPolicyDescription) {
                    (WsSecurityContextMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr, value.securityContextMessageSecurityBinding)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 24L, value.securityProperties)
                }
            }
    }
}

public data class WsSecurityContextSecurityBindingTemplate(
    public var securityContextMessageSecurityBinding: WsSecurityContextMessageSecurityBindingTemplate = WsSecurityContextMessageSecurityBindingTemplate(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextSecurityBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityContextSecurityBindingTemplate> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityContextSecurityBindingTemplate =
                    WsSecurityContextSecurityBindingTemplate(
                        (WsSecurityContextMessageSecurityBindingTemplate.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityContextSecurityBindingTemplate) {
                    (WsSecurityContextMessageSecurityBindingTemplate.typeLayout()).writeNative(addr, value.securityContextMessageSecurityBinding)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                }
            }
    }
}

public class WsSecurityDescription internal constructor(
    securityBindingsCtorArg: MutPtr<MutPtr<WsSecurityBinding>>,
    public var securityBindingCount: UInt,
    propertiesCtorArg: MutPtr<WsSecurityProperty>,
    public var propertyCount: UInt,
) {
    public var securityBindings: MutPtr<MutPtr<WsSecurityBinding>> = securityBindingsCtorArg
        internal set

    public var properties: MutPtr<WsSecurityProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        securityBindingsCtorArg = MutPtr(0L),
        securityBindingCount = 0u,
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<WsSecurityBinding>> = this.securityBindings

    public operator fun component2(): UInt = this.securityBindingCount

    public operator fun component3(): MutPtr<WsSecurityProperty> = this.properties

    public operator fun component4(): UInt = this.propertyCount

    public fun copy(securityBindings: MutPtr<MutPtr<WsSecurityBinding>> = this.securityBindings, securityBindingCount: UInt = this.securityBindingCount, properties: MutPtr<WsSecurityProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsSecurityDescription = WsSecurityDescription(securityBindingsCtorArg = securityBindings, securityBindingCount = securityBindingCount, propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityDescription) return false
        if (this.securityBindings != other.securityBindings) return false
        if (this.securityBindingCount != other.securityBindingCount) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityBindings.hashCode()
        result = 31 * result + this.securityBindingCount.hashCode()
        result = 31 * result + this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityDescription> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityDescription =
                    WsSecurityDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsSecurityBinding>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityProperty>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsSecurityBinding>>(64)
                    ).writeNative(addr, value.securityBindings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.securityBindingCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityProperty>(64)
                    ).writeNative(addr + 16L, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.propertyCount)
                }
            }

        public operator fun invoke(
            securityBindings: MutPtr<MutPtr<WsSecurityBinding>> = MutPtr(0L),
            securityBindingCount: UInt = 0u,
            properties: MutPtr<WsSecurityProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsSecurityDescription =
            WsSecurityDescription(
                securityBindingsCtorArg = securityBindings,
                securityBindingCount = securityBindingCount,
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public data class WsSecurityKeyHandle(
    public var keyHandleType: WsSecurityKeyHandleType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityKeyHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityKeyHandle> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsSecurityKeyHandle =
                    WsSecurityKeyHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsSecurityKeyHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.keyHandleType)
                }
            }
    }
}

public class WsSecurityProperties internal constructor(
    propertiesCtorArg: MutPtr<WsSecurityProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsSecurityProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsSecurityProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsSecurityProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsSecurityProperties = WsSecurityProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityProperties> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityProperties =
                    WsSecurityProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsSecurityProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsSecurityProperties =
            WsSecurityProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsSecurityProperty internal constructor(
    public var id: WsSecurityPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsSecurityPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsSecurityPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsSecurityProperty = WsSecurityProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityProperty =
                    WsSecurityProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsSecurityPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsSecurityProperty =
            WsSecurityProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsSecurityPropertyConstraint internal constructor(
    public var id: WsSecurityPropertyId,
    allowedValuesCtorArg: MutPtr<CVoid>,
    public var allowedValuesSize: UInt,
    public var out: WsSecurityPropertyConstraint0,
) {
    public var allowedValues: MutPtr<CVoid> = allowedValuesCtorArg
        internal set

    public constructor() : this(
        id = 0,
        allowedValuesCtorArg = MutPtr(0L),
        allowedValuesSize = 0u,
        out = WsSecurityPropertyConstraint0(),
    )

    public operator fun component1(): WsSecurityPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.allowedValues

    public operator fun component3(): UInt = this.allowedValuesSize

    public operator fun component4(): WsSecurityPropertyConstraint0 = this.out

    public fun copy(id: WsSecurityPropertyId = this.id, allowedValues: MutPtr<CVoid> = this.allowedValues, allowedValuesSize: UInt = this.allowedValuesSize, out: WsSecurityPropertyConstraint0 = this.out): WsSecurityPropertyConstraint = WsSecurityPropertyConstraint(id = id, allowedValuesCtorArg = allowedValues, allowedValuesSize = allowedValuesSize, out = out)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSecurityPropertyConstraint) return false
        if (this.id != other.id) return false
        if (this.allowedValues != other.allowedValues) return false
        if (this.allowedValuesSize != other.allowedValuesSize) return false
        if (this.out != other.out) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.allowedValues.hashCode()
        result = 31 * result + this.allowedValuesSize.hashCode()
        result = 31 * result + this.out.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityPropertyConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityPropertyConstraint> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityPropertyConstraint =
                    WsSecurityPropertyConstraint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (WsSecurityPropertyConstraint0.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsSecurityPropertyConstraint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.allowedValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allowedValuesSize)
                    (WsSecurityPropertyConstraint0.typeLayout()).writeNative(addr + 24L, value.out)
                }
            }

        public operator fun invoke(
            id: WsSecurityPropertyId = 0,
            allowedValues: MutPtr<CVoid> = MutPtr(0L),
            allowedValuesSize: UInt = 0u,
            out: WsSecurityPropertyConstraint0 = WsSecurityPropertyConstraint0(),
        ): WsSecurityPropertyConstraint =
            WsSecurityPropertyConstraint(
                id = id,
                allowedValuesCtorArg = allowedValues,
                allowedValuesSize = allowedValuesSize,
                out = out,
            )
    }
}

public data class WsSecurityPropertyConstraint0(
    public var securityProperty: WsSecurityProperty = WsSecurityProperty(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityPropertyConstraint0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSecurityPropertyConstraint0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSecurityPropertyConstraint0 =
                    WsSecurityPropertyConstraint0(
                        (WsSecurityProperty.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsSecurityPropertyConstraint0) {
                    (WsSecurityProperty.typeLayout()).writeNative(addr, value.securityProperty)
                }
            }
    }
}

public class WsServiceContract internal constructor(
    contractDescriptionCtorArg: ConstPtr<WsContractDescription>,
    public var defaultMessageHandlerCallback: WsServiceMessageReceiveCallback,
    methodTableCtorArg: ConstPtr<CVoid>,
) {
    public var contractDescription: ConstPtr<WsContractDescription> = contractDescriptionCtorArg
        internal set

    public var methodTable: ConstPtr<CVoid> = methodTableCtorArg
        internal set

    public constructor() : this(
        contractDescriptionCtorArg = ConstPtr(0L),
        defaultMessageHandlerCallback = null,
        methodTableCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<WsContractDescription> = this.contractDescription

    public operator fun component2(): WsServiceMessageReceiveCallback = this.defaultMessageHandlerCallback

    public operator fun component3(): ConstPtr<CVoid> = this.methodTable

    public fun copy(contractDescription: ConstPtr<WsContractDescription> = this.contractDescription, defaultMessageHandlerCallback: WsServiceMessageReceiveCallback = this.defaultMessageHandlerCallback, methodTable: ConstPtr<CVoid> = this.methodTable): WsServiceContract = WsServiceContract(contractDescriptionCtorArg = contractDescription, defaultMessageHandlerCallback = defaultMessageHandlerCallback, methodTableCtorArg = methodTable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceContract) return false
        if (this.contractDescription != other.contractDescription) return false
        if (this.defaultMessageHandlerCallback != other.defaultMessageHandlerCallback) return false
        if (this.methodTable != other.methodTable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contractDescription.hashCode()
        result = 31 * result + this.defaultMessageHandlerCallback.hashCode()
        result = 31 * result + this.methodTable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            contractDescription: ConstPtr<WsContractDescription> = ConstPtr(0L),
            defaultMessageHandlerCallback: WsServiceMessageReceiveCallback = null,
            methodTable: ConstPtr<CVoid> = ConstPtr(0L),
        ): WsServiceContract =
            WsServiceContract(
                contractDescriptionCtorArg = contractDescription,
                defaultMessageHandlerCallback = defaultMessageHandlerCallback,
                methodTableCtorArg = methodTable,
            )
    }
}

public class WsServiceEndpoint internal constructor(
    public var address: WsEndpointAddress,
    public var channelBinding: WsChannelBinding,
    public var channelType: WsChannelType,
    securityDescriptionCtorArg: ConstPtr<WsSecurityDescription>,
    contractCtorArg: ConstPtr<WsServiceContract>,
    public var authorizationCallback: WsServiceSecurityCallback,
    propertiesCtorArg: ConstPtr<WsServiceEndpointProperty>,
    public var propertyCount: UInt,
    public var channelProperties: WsChannelProperties,
) {
    public var securityDescription: ConstPtr<WsSecurityDescription> = securityDescriptionCtorArg
        internal set

    public var contract: ConstPtr<WsServiceContract> = contractCtorArg
        internal set

    public var properties: ConstPtr<WsServiceEndpointProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        address = WsEndpointAddress(),
        channelBinding = 0,
        channelType = 0,
        securityDescriptionCtorArg = ConstPtr(0L),
        contractCtorArg = ConstPtr(0L),
        authorizationCallback = null,
        propertiesCtorArg = ConstPtr(0L),
        propertyCount = 0u,
        channelProperties = WsChannelProperties(),
    )

    public operator fun component1(): WsEndpointAddress = this.address

    public operator fun component2(): WsChannelBinding = this.channelBinding

    public operator fun component3(): WsChannelType = this.channelType

    public operator fun component4(): ConstPtr<WsSecurityDescription> = this.securityDescription

    public operator fun component5(): ConstPtr<WsServiceContract> = this.contract

    public operator fun component6(): WsServiceSecurityCallback = this.authorizationCallback

    public operator fun component7(): ConstPtr<WsServiceEndpointProperty> = this.properties

    public operator fun component8(): UInt = this.propertyCount

    public operator fun component9(): WsChannelProperties = this.channelProperties

    public fun copy(address: WsEndpointAddress = this.address, channelBinding: WsChannelBinding = this.channelBinding, channelType: WsChannelType = this.channelType, securityDescription: ConstPtr<WsSecurityDescription> = this.securityDescription, contract: ConstPtr<WsServiceContract> = this.contract, authorizationCallback: WsServiceSecurityCallback = this.authorizationCallback, properties: ConstPtr<WsServiceEndpointProperty> = this.properties, propertyCount: UInt = this.propertyCount, channelProperties: WsChannelProperties = this.channelProperties): WsServiceEndpoint = WsServiceEndpoint(address = address, channelBinding = channelBinding, channelType = channelType, securityDescriptionCtorArg = securityDescription, contractCtorArg = contract, authorizationCallback = authorizationCallback, propertiesCtorArg = properties, propertyCount = propertyCount, channelProperties = channelProperties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceEndpoint) return false
        if (this.address != other.address) return false
        if (this.channelBinding != other.channelBinding) return false
        if (this.channelType != other.channelType) return false
        if (this.securityDescription != other.securityDescription) return false
        if (this.contract != other.contract) return false
        if (this.authorizationCallback != other.authorizationCallback) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        if (this.channelProperties != other.channelProperties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.channelBinding.hashCode()
        result = 31 * result + this.channelType.hashCode()
        result = 31 * result + this.securityDescription.hashCode()
        result = 31 * result + this.contract.hashCode()
        result = 31 * result + this.authorizationCallback.hashCode()
        result = 31 * result + this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        result = 31 * result + this.channelProperties.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            address: WsEndpointAddress = WsEndpointAddress(),
            channelBinding: WsChannelBinding = 0,
            channelType: WsChannelType = 0,
            securityDescription: ConstPtr<WsSecurityDescription> = ConstPtr(0L),
            contract: ConstPtr<WsServiceContract> = ConstPtr(0L),
            authorizationCallback: WsServiceSecurityCallback = null,
            properties: ConstPtr<WsServiceEndpointProperty> = ConstPtr(0L),
            propertyCount: UInt = 0u,
            channelProperties: WsChannelProperties = WsChannelProperties(),
        ): WsServiceEndpoint =
            WsServiceEndpoint(
                address = address,
                channelBinding = channelBinding,
                channelType = channelType,
                securityDescriptionCtorArg = securityDescription,
                contractCtorArg = contract,
                authorizationCallback = authorizationCallback,
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
                channelProperties = channelProperties,
            )
    }
}

public class WsServiceEndpointMetadata internal constructor(
    portNameCtorArg: MutPtr<WsXmlString>,
    bindingNameCtorArg: MutPtr<WsXmlString>,
    bindingNsCtorArg: MutPtr<WsXmlString>,
) {
    public var portName: MutPtr<WsXmlString> = portNameCtorArg
        internal set

    public var bindingName: MutPtr<WsXmlString> = bindingNameCtorArg
        internal set

    public var bindingNs: MutPtr<WsXmlString> = bindingNsCtorArg
        internal set

    public constructor() : this(
        portNameCtorArg = MutPtr(0L),
        bindingNameCtorArg = MutPtr(0L),
        bindingNsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlString> = this.portName

    public operator fun component2(): MutPtr<WsXmlString> = this.bindingName

    public operator fun component3(): MutPtr<WsXmlString> = this.bindingNs

    public fun copy(portName: MutPtr<WsXmlString> = this.portName, bindingName: MutPtr<WsXmlString> = this.bindingName, bindingNs: MutPtr<WsXmlString> = this.bindingNs): WsServiceEndpointMetadata = WsServiceEndpointMetadata(portNameCtorArg = portName, bindingNameCtorArg = bindingName, bindingNsCtorArg = bindingNs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceEndpointMetadata) return false
        if (this.portName != other.portName) return false
        if (this.bindingName != other.bindingName) return false
        if (this.bindingNs != other.bindingNs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.portName.hashCode()
        result = 31 * result + this.bindingName.hashCode()
        result = 31 * result + this.bindingNs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceEndpointMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceEndpointMetadata> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsServiceEndpointMetadata =
                    WsServiceEndpointMetadata(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsServiceEndpointMetadata) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr, value.portName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.bindingName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 16L, value.bindingNs)
                }
            }

        public operator fun invoke(
            portName: MutPtr<WsXmlString> = MutPtr(0L),
            bindingName: MutPtr<WsXmlString> = MutPtr(0L),
            bindingNs: MutPtr<WsXmlString> = MutPtr(0L),
        ): WsServiceEndpointMetadata =
            WsServiceEndpointMetadata(
                portNameCtorArg = portName,
                bindingNameCtorArg = bindingName,
                bindingNsCtorArg = bindingNs,
            )
    }
}

public class WsServiceEndpointProperty internal constructor(
    public var id: WsServiceEndpointPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsServiceEndpointPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsServiceEndpointPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsServiceEndpointProperty = WsServiceEndpointProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceEndpointProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceEndpointProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceEndpointProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsServiceEndpointProperty =
                    WsServiceEndpointProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsServiceEndpointProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsServiceEndpointPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsServiceEndpointProperty =
            WsServiceEndpointProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsServiceMetadata internal constructor(
    public var documentCount: UInt,
    documentsCtorArg: MutPtr<MutPtr<WsServiceMetadataDocument>>,
    serviceNameCtorArg: MutPtr<WsXmlString>,
    serviceNsCtorArg: MutPtr<WsXmlString>,
) {
    public var documents: MutPtr<MutPtr<WsServiceMetadataDocument>> = documentsCtorArg
        internal set

    public var serviceName: MutPtr<WsXmlString> = serviceNameCtorArg
        internal set

    public var serviceNs: MutPtr<WsXmlString> = serviceNsCtorArg
        internal set

    public constructor() : this(
        documentCount = 0u,
        documentsCtorArg = MutPtr(0L),
        serviceNameCtorArg = MutPtr(0L),
        serviceNsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.documentCount

    public operator fun component2(): MutPtr<MutPtr<WsServiceMetadataDocument>> = this.documents

    public operator fun component3(): MutPtr<WsXmlString> = this.serviceName

    public operator fun component4(): MutPtr<WsXmlString> = this.serviceNs

    public fun copy(documentCount: UInt = this.documentCount, documents: MutPtr<MutPtr<WsServiceMetadataDocument>> = this.documents, serviceName: MutPtr<WsXmlString> = this.serviceName, serviceNs: MutPtr<WsXmlString> = this.serviceNs): WsServiceMetadata = WsServiceMetadata(documentCount = documentCount, documentsCtorArg = documents, serviceNameCtorArg = serviceName, serviceNsCtorArg = serviceNs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceMetadata) return false
        if (this.documentCount != other.documentCount) return false
        if (this.documents != other.documents) return false
        if (this.serviceName != other.serviceName) return false
        if (this.serviceNs != other.serviceNs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.documentCount.hashCode()
        result = 31 * result + this.documents.hashCode()
        result = 31 * result + this.serviceName.hashCode()
        result = 31 * result + this.serviceNs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceMetadata> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsServiceMetadata =
                    WsServiceMetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsServiceMetadataDocument>>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsServiceMetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.documentCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsServiceMetadataDocument>>(64)
                    ).writeNative(addr + 8L, value.documents)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 16L, value.serviceName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 24L, value.serviceNs)
                }
            }

        public operator fun invoke(
            documentCount: UInt = 0u,
            documents: MutPtr<MutPtr<WsServiceMetadataDocument>> = MutPtr(0L),
            serviceName: MutPtr<WsXmlString> = MutPtr(0L),
            serviceNs: MutPtr<WsXmlString> = MutPtr(0L),
        ): WsServiceMetadata =
            WsServiceMetadata(
                documentCount = documentCount,
                documentsCtorArg = documents,
                serviceNameCtorArg = serviceName,
                serviceNsCtorArg = serviceNs,
            )
    }
}

public class WsServiceMetadataDocument internal constructor(
    contentCtorArg: MutPtr<WsXmlString>,
    nameCtorArg: MutPtr<WsString>,
) {
    public var content: MutPtr<WsXmlString> = contentCtorArg
        internal set

    public var name: MutPtr<WsString> = nameCtorArg
        internal set

    public constructor() : this(
        contentCtorArg = MutPtr(0L),
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlString> = this.content

    public operator fun component2(): MutPtr<WsString> = this.name

    public fun copy(content: MutPtr<WsXmlString> = this.content, name: MutPtr<WsString> = this.name): WsServiceMetadataDocument = WsServiceMetadataDocument(contentCtorArg = content, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceMetadataDocument) return false
        if (this.content != other.content) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.content.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceMetadataDocument> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceMetadataDocument> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsServiceMetadataDocument =
                    WsServiceMetadataDocument(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsString>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsServiceMetadataDocument) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr, value.content)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsString>(64)
                    ).writeNative(addr + 8L, value.name)
                }
            }

        public operator fun invoke(
            content: MutPtr<WsXmlString> = MutPtr(0L),
            name: MutPtr<WsString> = MutPtr(0L),
        ): WsServiceMetadataDocument =
            WsServiceMetadataDocument(
                contentCtorArg = content,
                nameCtorArg = name,
            )
    }
}

public class WsServiceProperty internal constructor(
    public var id: WsServicePropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsServicePropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsServicePropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsServiceProperty = WsServiceProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsServiceProperty =
                    WsServiceProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsServiceProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsServicePropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsServiceProperty =
            WsServiceProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsServicePropertyAcceptCallback(
    public var callback: WsServiceAcceptChannelCallback = null,
)

public data class WsServicePropertyCloseCallback(
    public var callback: WsServiceCloseChannelCallback = null,
)

public class WsServiceSecurityIdentities internal constructor(
    serviceIdentitiesCtorArg: MutPtr<WsString>,
    public var serviceIdentityCount: UInt,
) {
    public var serviceIdentities: MutPtr<WsString> = serviceIdentitiesCtorArg
        internal set

    public constructor() : this(
        serviceIdentitiesCtorArg = MutPtr(0L),
        serviceIdentityCount = 0u,
    )

    public operator fun component1(): MutPtr<WsString> = this.serviceIdentities

    public operator fun component2(): UInt = this.serviceIdentityCount

    public fun copy(serviceIdentities: MutPtr<WsString> = this.serviceIdentities, serviceIdentityCount: UInt = this.serviceIdentityCount): WsServiceSecurityIdentities = WsServiceSecurityIdentities(serviceIdentitiesCtorArg = serviceIdentities, serviceIdentityCount = serviceIdentityCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsServiceSecurityIdentities) return false
        if (this.serviceIdentities != other.serviceIdentities) return false
        if (this.serviceIdentityCount != other.serviceIdentityCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceIdentities.hashCode()
        result = 31 * result + this.serviceIdentityCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceSecurityIdentities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsServiceSecurityIdentities> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsServiceSecurityIdentities =
                    WsServiceSecurityIdentities(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsString>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsServiceSecurityIdentities) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsString>(64)
                    ).writeNative(addr, value.serviceIdentities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.serviceIdentityCount)
                }
            }

        public operator fun invoke(
            serviceIdentities: MutPtr<WsString> = MutPtr(0L),
            serviceIdentityCount: UInt = 0u,
        ): WsServiceSecurityIdentities =
            WsServiceSecurityIdentities(
                serviceIdentitiesCtorArg = serviceIdentities,
                serviceIdentityCount = serviceIdentityCount,
            )
    }
}

public data class WsSoapudpUrl(
    public var url: WsUrl = WsUrl(),
    public var host: WsString = WsString(),
    public var port: UShort = 0u,
    public var portAsString: WsString = WsString(),
    public var path: WsString = WsString(),
    public var query: WsString = WsString(),
    public var fragment: WsString = WsString(),
)

public data class WsSpnEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var spn: WsString = WsString(),
)

public class WsSslTransportSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    localCertCredentialCtorArg: MutPtr<WsCertCredential>,
) {
    public var localCertCredential: MutPtr<WsCertCredential> = localCertCredentialCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        localCertCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): MutPtr<WsCertCredential> = this.localCertCredential

    public fun copy(binding: WsSecurityBinding = this.binding, localCertCredential: MutPtr<WsCertCredential> = this.localCertCredential): WsSslTransportSecurityBinding = WsSslTransportSecurityBinding(binding = binding, localCertCredentialCtorArg = localCertCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSslTransportSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.localCertCredential != other.localCertCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.localCertCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSslTransportSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSslTransportSecurityBinding> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSslTransportSecurityBinding =
                    WsSslTransportSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsCertCredential>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsSslTransportSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsCertCredential>(64)
                    ).writeNative(addr + 24L, value.localCertCredential)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            localCertCredential: MutPtr<WsCertCredential> = MutPtr(0L),
        ): WsSslTransportSecurityBinding =
            WsSslTransportSecurityBinding(
                binding = binding,
                localCertCredentialCtorArg = localCertCredential,
            )
    }
}

public data class WsSslTransportSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var out: WsSslTransportSecurityBindingConstraint0 = WsSslTransportSecurityBindingConstraint0(),
)

public data class WsSslTransportSecurityBindingConstraint0(
    public var clientCertCredentialRequired: Bool = 0,
)

public data class WsSslTransportSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSslTransportSecurityBindingPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSslTransportSecurityBindingPolicyDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSslTransportSecurityBindingPolicyDescription =
                    WsSslTransportSecurityBindingPolicyDescription(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsSslTransportSecurityBindingPolicyDescription) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                }
            }
    }
}

public class WsSslTransportSecurityBindingTemplate internal constructor(
    public var securityBindingProperties: WsSecurityBindingProperties,
    localCertCredentialCtorArg: MutPtr<WsCertCredential>,
) {
    public var localCertCredential: MutPtr<WsCertCredential> = localCertCredentialCtorArg
        internal set

    public constructor() : this(
        securityBindingProperties = WsSecurityBindingProperties(),
        localCertCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBindingProperties = this.securityBindingProperties

    public operator fun component2(): MutPtr<WsCertCredential> = this.localCertCredential

    public fun copy(securityBindingProperties: WsSecurityBindingProperties = this.securityBindingProperties, localCertCredential: MutPtr<WsCertCredential> = this.localCertCredential): WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(securityBindingProperties = securityBindingProperties, localCertCredentialCtorArg = localCertCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsSslTransportSecurityBindingTemplate) return false
        if (this.securityBindingProperties != other.securityBindingProperties) return false
        if (this.localCertCredential != other.localCertCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityBindingProperties.hashCode()
        result = 31 * result + this.localCertCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSslTransportSecurityBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSslTransportSecurityBindingTemplate> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSslTransportSecurityBindingTemplate =
                    WsSslTransportSecurityBindingTemplate(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsCertCredential>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsSslTransportSecurityBindingTemplate) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsCertCredential>(64)
                    ).writeNative(addr + 16L, value.localCertCredential)
                }
            }

        public operator fun invoke(
            securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
            localCertCredential: MutPtr<WsCertCredential> = MutPtr(0L),
        ): WsSslTransportSecurityBindingTemplate =
            WsSslTransportSecurityBindingTemplate(
                securityBindingProperties = securityBindingProperties,
                localCertCredentialCtorArg = localCertCredential,
            )
    }
}

public data class WsSspiTransportSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSspiTransportSecurityBindingPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsSspiTransportSecurityBindingPolicyDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsSspiTransportSecurityBindingPolicyDescription =
                    WsSspiTransportSecurityBindingPolicyDescription(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsSspiTransportSecurityBindingPolicyDescription) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                }
            }
    }
}

public class WsString internal constructor(
    public var length: UInt,
    charsCtorArg: Pwstr,
) {
    public var chars: Pwstr = charsCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        charsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): Pwstr = this.chars

    public fun copy(length: UInt = this.length, chars: Pwstr = this.chars): WsString = WsString(length = length, charsCtorArg = chars)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsString) return false
        if (this.length != other.length) return false
        if (this.chars != other.chars) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.chars.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            chars: Pwstr = MutPtr(0L),
        ): WsString =
            WsString(
                length = length,
                charsCtorArg = chars,
            )
    }
}

public data class WsStringDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsStringDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsStringDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsStringDescription =
                    WsStringDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsStringDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minCharCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxCharCount)
                }
            }
    }
}

public data class WsStringUsernameCredential(
    public var credential: WsUsernameCredential = WsUsernameCredential(),
    public var username: WsString = WsString(),
    public var password: WsString = WsString(),
)

public data class WsStringWindowsIntegratedAuthCredential(
    public var credential: WsWindowsIntegratedAuthCredential = WsWindowsIntegratedAuthCredential(),
    public var username: WsString = WsString(),
    public var password: WsString = WsString(),
    public var domain: WsString = WsString(),
)

public class WsStructDescription internal constructor(
    public var size: UInt,
    public var alignment: UInt,
    fieldsCtorArg: MutPtr<MutPtr<WsFieldDescription>>,
    public var fieldCount: UInt,
    typeLocalNameCtorArg: MutPtr<WsXmlString>,
    typeNsCtorArg: MutPtr<WsXmlString>,
    parentTypeCtorArg: MutPtr<WsStructDescription>,
    subTypesCtorArg: MutPtr<MutPtr<WsStructDescription>>,
    public var subTypeCount: UInt,
    public var structOptions: UInt,
) {
    public var fields: MutPtr<MutPtr<WsFieldDescription>> = fieldsCtorArg
        internal set

    public var typeLocalName: MutPtr<WsXmlString> = typeLocalNameCtorArg
        internal set

    public var typeNs: MutPtr<WsXmlString> = typeNsCtorArg
        internal set

    public var parentType: MutPtr<WsStructDescription> = parentTypeCtorArg
        internal set

    public var subTypes: MutPtr<MutPtr<WsStructDescription>> = subTypesCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        alignment = 0u,
        fieldsCtorArg = MutPtr(0L),
        fieldCount = 0u,
        typeLocalNameCtorArg = MutPtr(0L),
        typeNsCtorArg = MutPtr(0L),
        parentTypeCtorArg = MutPtr(0L),
        subTypesCtorArg = MutPtr(0L),
        subTypeCount = 0u,
        structOptions = 0u,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.alignment

    public operator fun component3(): MutPtr<MutPtr<WsFieldDescription>> = this.fields

    public operator fun component4(): UInt = this.fieldCount

    public operator fun component5(): MutPtr<WsXmlString> = this.typeLocalName

    public operator fun component6(): MutPtr<WsXmlString> = this.typeNs

    public operator fun component7(): MutPtr<WsStructDescription> = this.parentType

    public operator fun component8(): MutPtr<MutPtr<WsStructDescription>> = this.subTypes

    public operator fun component9(): UInt = this.subTypeCount

    public operator fun component10(): UInt = this.structOptions

    public fun copy(size: UInt = this.size, alignment: UInt = this.alignment, fields: MutPtr<MutPtr<WsFieldDescription>> = this.fields, fieldCount: UInt = this.fieldCount, typeLocalName: MutPtr<WsXmlString> = this.typeLocalName, typeNs: MutPtr<WsXmlString> = this.typeNs, parentType: MutPtr<WsStructDescription> = this.parentType, subTypes: MutPtr<MutPtr<WsStructDescription>> = this.subTypes, subTypeCount: UInt = this.subTypeCount, structOptions: UInt = this.structOptions): WsStructDescription = WsStructDescription(size = size, alignment = alignment, fieldsCtorArg = fields, fieldCount = fieldCount, typeLocalNameCtorArg = typeLocalName, typeNsCtorArg = typeNs, parentTypeCtorArg = parentType, subTypesCtorArg = subTypes, subTypeCount = subTypeCount, structOptions = structOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsStructDescription) return false
        if (this.size != other.size) return false
        if (this.alignment != other.alignment) return false
        if (this.fields != other.fields) return false
        if (this.fieldCount != other.fieldCount) return false
        if (this.typeLocalName != other.typeLocalName) return false
        if (this.typeNs != other.typeNs) return false
        if (this.parentType != other.parentType) return false
        if (this.subTypes != other.subTypes) return false
        if (this.subTypeCount != other.subTypeCount) return false
        if (this.structOptions != other.structOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.fields.hashCode()
        result = 31 * result + this.fieldCount.hashCode()
        result = 31 * result + this.typeLocalName.hashCode()
        result = 31 * result + this.typeNs.hashCode()
        result = 31 * result + this.parentType.hashCode()
        result = 31 * result + this.subTypes.hashCode()
        result = 31 * result + this.subTypeCount.hashCode()
        result = 31 * result + this.structOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsStructDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsStructDescription> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsStructDescription =
                    WsStructDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsFieldDescription>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsStructDescription>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsStructDescription>>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: WsStructDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsFieldDescription>>(64)
                    ).writeNative(addr + 8L, value.fields)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fieldCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 24L, value.typeLocalName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 32L, value.typeNs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsStructDescription>(64)
                    ).writeNative(addr + 40L, value.parentType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsStructDescription>>(64)
                    ).writeNative(addr + 48L, value.subTypes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.subTypeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.structOptions)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            alignment: UInt = 0u,
            fields: MutPtr<MutPtr<WsFieldDescription>> = MutPtr(0L),
            fieldCount: UInt = 0u,
            typeLocalName: MutPtr<WsXmlString> = MutPtr(0L),
            typeNs: MutPtr<WsXmlString> = MutPtr(0L),
            parentType: MutPtr<WsStructDescription> = MutPtr(0L),
            subTypes: MutPtr<MutPtr<WsStructDescription>> = MutPtr(0L),
            subTypeCount: UInt = 0u,
            structOptions: UInt = 0u,
        ): WsStructDescription =
            WsStructDescription(
                size = size,
                alignment = alignment,
                fieldsCtorArg = fields,
                fieldCount = fieldCount,
                typeLocalNameCtorArg = typeLocalName,
                typeNsCtorArg = typeNs,
                parentTypeCtorArg = parentType,
                subTypesCtorArg = subTypes,
                subTypeCount = subTypeCount,
                structOptions = structOptions,
            )
    }
}

public data class WsSubjectNameCertCredential(
    public var credential: WsCertCredential = WsCertCredential(),
    public var storeLocation: UInt = 0u,
    public var storeName: WsString = WsString(),
    public var subjectName: WsString = WsString(),
)

public data class WsTcpBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpBindingTemplate> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpBindingTemplate =
                    WsTcpBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsTcpBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                }
            }
    }
}

public data class WsTcpPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpPolicyDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpPolicyDescription =
                    WsTcpPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsTcpPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                }
            }
    }
}

public data class WsTcpSspiBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiBindingTemplate> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiBindingTemplate =
                    WsTcpSspiBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsTcpSspiTransportSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsTcpSspiTransportSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                }
            }
    }
}

public data class WsTcpSspiKerberosApreqBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqBindingTemplate> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiKerberosApreqBindingTemplate =
                    WsTcpSspiKerberosApreqBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsTcpSspiTransportSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiKerberosApreqBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsTcpSspiTransportSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).writeNative(addr + 56L, value.kerberosApreqMessageSecurityBinding)
                }
            }
    }
}

public data class WsTcpSspiKerberosApreqPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqPolicyDescription> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiKerberosApreqPolicyDescription =
                    WsTcpSspiKerberosApreqPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiKerberosApreqPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.kerberosApreqMessageSecurityBinding)
                }
            }
    }
}

public data class WsTcpSspiKerberosApreqSecurityContextBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingTemplate = WsSecurityContextSecurityBindingTemplate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqSecurityContextBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqSecurityContextBindingTemplate> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiKerberosApreqSecurityContextBindingTemplate =
                    WsTcpSspiKerberosApreqSecurityContextBindingTemplate(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsTcpSspiTransportSecurityBindingTemplate.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).readNative(addr + 56L),
                        (WsSecurityContextSecurityBindingTemplate.typeLayout()).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiKerberosApreqSecurityContextBindingTemplate) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsTcpSspiTransportSecurityBindingTemplate.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingTemplate.typeLayout()).writeNative(addr + 56L, value.kerberosApreqMessageSecurityBinding)
                    (WsSecurityContextSecurityBindingTemplate.typeLayout()).writeNative(addr + 80L, value.securityContextSecurityBinding)
                }
            }
    }
}

public data class WsTcpSspiKerberosApreqSecurityContextPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingPolicyDescription = WsSecurityContextSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqSecurityContextPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiKerberosApreqSecurityContextPolicyDescription> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiKerberosApreqSecurityContextPolicyDescription =
                    WsTcpSspiKerberosApreqSecurityContextPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                        (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiKerberosApreqSecurityContextPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                    (WsKerberosApreqMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.kerberosApreqMessageSecurityBinding)
                    (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 72L, value.securityContextSecurityBinding)
                }
            }
    }
}

public data class WsTcpSspiPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiPolicyDescription> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiPolicyDescription =
                    WsTcpSspiPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                }
            }
    }
}

public class WsTcpSspiTransportSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    clientCredentialCtorArg: MutPtr<WsWindowsIntegratedAuthCredential>,
) {
    public var clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = clientCredentialCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        clientCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential

    public fun copy(binding: WsSecurityBinding = this.binding, clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential): WsTcpSspiTransportSecurityBinding = WsTcpSspiTransportSecurityBinding(binding = binding, clientCredentialCtorArg = clientCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsTcpSspiTransportSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.clientCredential != other.clientCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiTransportSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiTransportSecurityBinding> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiTransportSecurityBinding =
                    WsTcpSspiTransportSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiTransportSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                    ).writeNative(addr + 24L, value.clientCredential)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = MutPtr(0L),
        ): WsTcpSspiTransportSecurityBinding =
            WsTcpSspiTransportSecurityBinding(
                binding = binding,
                clientCredentialCtorArg = clientCredential,
            )
    }
}

public data class WsTcpSspiTransportSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiTransportSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiTransportSecurityBindingConstraint> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiTransportSecurityBindingConstraint =
                    WsTcpSspiTransportSecurityBindingConstraint(
                        (WsSecurityBindingConstraint.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiTransportSecurityBindingConstraint) {
                    (WsSecurityBindingConstraint.typeLayout()).writeNative(addr, value.bindingConstraint)
                }
            }
    }
}

public class WsTcpSspiTransportSecurityBindingTemplate internal constructor(
    public var securityBindingProperties: WsSecurityBindingProperties,
    clientCredentialCtorArg: MutPtr<WsWindowsIntegratedAuthCredential>,
) {
    public var clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = clientCredentialCtorArg
        internal set

    public constructor() : this(
        securityBindingProperties = WsSecurityBindingProperties(),
        clientCredentialCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBindingProperties = this.securityBindingProperties

    public operator fun component2(): MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential

    public fun copy(securityBindingProperties: WsSecurityBindingProperties = this.securityBindingProperties, clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = this.clientCredential): WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(securityBindingProperties = securityBindingProperties, clientCredentialCtorArg = clientCredential)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsTcpSspiTransportSecurityBindingTemplate) return false
        if (this.securityBindingProperties != other.securityBindingProperties) return false
        if (this.clientCredential != other.clientCredential) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityBindingProperties.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiTransportSecurityBindingTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiTransportSecurityBindingTemplate> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiTransportSecurityBindingTemplate =
                    WsTcpSspiTransportSecurityBindingTemplate(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiTransportSecurityBindingTemplate) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsWindowsIntegratedAuthCredential>(64)
                    ).writeNative(addr + 16L, value.clientCredential)
                }
            }

        public operator fun invoke(
            securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
            clientCredential: MutPtr<WsWindowsIntegratedAuthCredential> = MutPtr(0L),
        ): WsTcpSspiTransportSecurityBindingTemplate =
            WsTcpSspiTransportSecurityBindingTemplate(
                securityBindingProperties = securityBindingProperties,
                clientCredentialCtorArg = clientCredential,
            )
    }
}

public data class WsTcpSspiUsernameBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingTemplate = WsUsernameMessageSecurityBindingTemplate(),
)

public data class WsTcpSspiUsernamePolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingPolicyDescription = WsUsernameMessageSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiUsernamePolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiUsernamePolicyDescription> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiUsernamePolicyDescription =
                    WsTcpSspiUsernamePolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiUsernamePolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                    (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.usernameMessageSecurityBinding)
                }
            }
    }
}

public data class WsTcpSspiUsernameSecurityContextBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingTemplate = WsUsernameMessageSecurityBindingTemplate(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingTemplate = WsSecurityContextSecurityBindingTemplate(),
)

public data class WsTcpSspiUsernameSecurityContextPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
    public var usernameMessageSecurityBinding: WsUsernameMessageSecurityBindingPolicyDescription = WsUsernameMessageSecurityBindingPolicyDescription(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingPolicyDescription = WsSecurityContextSecurityBindingPolicyDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiUsernameSecurityContextPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTcpSspiUsernameSecurityContextPolicyDescription> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTcpSspiUsernameSecurityContextPolicyDescription =
                    WsTcpSspiUsernameSecurityContextPolicyDescription(
                        (WsChannelProperties.typeLayout()).readNative(addr),
                        (WsSecurityProperties.typeLayout()).readNative(addr + 16L),
                        (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 32L),
                        (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 48L),
                        (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: WsTcpSspiUsernameSecurityContextPolicyDescription) {
                    (WsChannelProperties.typeLayout()).writeNative(addr, value.channelProperties)
                    (WsSecurityProperties.typeLayout()).writeNative(addr + 16L, value.securityProperties)
                    (WsSspiTransportSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 32L, value.sspiTransportSecurityBinding)
                    (WsUsernameMessageSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 48L, value.usernameMessageSecurityBinding)
                    (WsSecurityContextSecurityBindingPolicyDescription.typeLayout()).writeNative(addr + 72L, value.securityContextSecurityBinding)
                }
            }
    }
}

public data class WsThumbprintCertCredential(
    public var credential: WsCertCredential = WsCertCredential(),
    public var storeLocation: UInt = 0u,
    public var storeName: WsString = WsString(),
    public var thumbprint: WsString = WsString(),
)

public data class WsTimespan(
    public var ticks: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTimespan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTimespan> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTimespan =
                    WsTimespan(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsTimespan) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.ticks)
                }
            }
    }
}

public data class WsTimespanDescription(
    public var minValue: WsTimespan = WsTimespan(),
    public var maxValue: WsTimespan = WsTimespan(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTimespanDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsTimespanDescription> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsTimespanDescription =
                    WsTimespanDescription(
                        (WsTimespan.typeLayout()).readNative(addr),
                        (WsTimespan.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsTimespanDescription) {
                    (WsTimespan.typeLayout()).writeNative(addr, value.minValue)
                    (WsTimespan.typeLayout()).writeNative(addr + 8L, value.maxValue)
                }
            }
    }
}

public data class WsUint16Description(
    public var minValue: UShort = 0u,
    public var maxValue: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint16Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint16Description> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): WsUint16Description =
                    WsUint16Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WsUint16Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maxValue)
                }
            }
    }
}

public data class WsUint32Description(
    public var minValue: UInt = 0u,
    public var maxValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint32Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint32Description> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsUint32Description =
                    WsUint32Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsUint32Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxValue)
                }
            }
    }
}

public data class WsUint64Description(
    public var minValue: ULong = 0uL,
    public var maxValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint64Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint64Description> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsUint64Description =
                    WsUint64Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsUint64Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maxValue)
                }
            }
    }
}

public data class WsUint8Description(
    public var minValue: UByte = 0u,
    public var maxValue: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint8Description> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUint8Description> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WsUint8Description =
                    WsUint8Description(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: WsUint8Description) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.maxValue)
                }
            }
    }
}

public class WsUnionDescription internal constructor(
    public var size: UInt,
    public var alignment: UInt,
    fieldsCtorArg: MutPtr<MutPtr<WsUnionFieldDescription>>,
    public var fieldCount: UInt,
    public var enumOffset: UInt,
    public var noneEnumValue: Int,
    valueIndicesCtorArg: MutPtr<UInt>,
) {
    public var fields: MutPtr<MutPtr<WsUnionFieldDescription>> = fieldsCtorArg
        internal set

    public var valueIndices: MutPtr<UInt> = valueIndicesCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        alignment = 0u,
        fieldsCtorArg = MutPtr(0L),
        fieldCount = 0u,
        enumOffset = 0u,
        noneEnumValue = 0,
        valueIndicesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.alignment

    public operator fun component3(): MutPtr<MutPtr<WsUnionFieldDescription>> = this.fields

    public operator fun component4(): UInt = this.fieldCount

    public operator fun component5(): UInt = this.enumOffset

    public operator fun component6(): Int = this.noneEnumValue

    public operator fun component7(): MutPtr<UInt> = this.valueIndices

    public fun copy(size: UInt = this.size, alignment: UInt = this.alignment, fields: MutPtr<MutPtr<WsUnionFieldDescription>> = this.fields, fieldCount: UInt = this.fieldCount, enumOffset: UInt = this.enumOffset, noneEnumValue: Int = this.noneEnumValue, valueIndices: MutPtr<UInt> = this.valueIndices): WsUnionDescription = WsUnionDescription(size = size, alignment = alignment, fieldsCtorArg = fields, fieldCount = fieldCount, enumOffset = enumOffset, noneEnumValue = noneEnumValue, valueIndicesCtorArg = valueIndices)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsUnionDescription) return false
        if (this.size != other.size) return false
        if (this.alignment != other.alignment) return false
        if (this.fields != other.fields) return false
        if (this.fieldCount != other.fieldCount) return false
        if (this.enumOffset != other.enumOffset) return false
        if (this.noneEnumValue != other.noneEnumValue) return false
        if (this.valueIndices != other.valueIndices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.fields.hashCode()
        result = 31 * result + this.fieldCount.hashCode()
        result = 31 * result + this.enumOffset.hashCode()
        result = 31 * result + this.noneEnumValue.hashCode()
        result = 31 * result + this.valueIndices.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUnionDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUnionDescription> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsUnionDescription =
                    WsUnionDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsUnionFieldDescription>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsUnionDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsUnionFieldDescription>>(64)
                    ).writeNative(addr + 8L, value.fields)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fieldCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.enumOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.noneEnumValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 32L, value.valueIndices)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            alignment: UInt = 0u,
            fields: MutPtr<MutPtr<WsUnionFieldDescription>> = MutPtr(0L),
            fieldCount: UInt = 0u,
            enumOffset: UInt = 0u,
            noneEnumValue: Int = 0,
            valueIndices: MutPtr<UInt> = MutPtr(0L),
        ): WsUnionDescription =
            WsUnionDescription(
                size = size,
                alignment = alignment,
                fieldsCtorArg = fields,
                fieldCount = fieldCount,
                enumOffset = enumOffset,
                noneEnumValue = noneEnumValue,
                valueIndicesCtorArg = valueIndices,
            )
    }
}

public data class WsUnionFieldDescription(
    public var value: Int = 0,
    public var field: WsFieldDescription = WsFieldDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUnionFieldDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUnionFieldDescription> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsUnionFieldDescription =
                    WsUnionFieldDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (WsFieldDescription.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsUnionFieldDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (WsFieldDescription.typeLayout()).writeNative(addr + 8L, value.field)
                }
            }
    }
}

public data class WsUniqueId(
    public var uri: WsString = WsString(),
    public var guid: Guid = Guid(),
)

public data class WsUniqueIdDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUniqueIdDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUniqueIdDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsUniqueIdDescription =
                    WsUniqueIdDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsUniqueIdDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minCharCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxCharCount)
                }
            }
    }
}

public class WsUnknownEndpointIdentity internal constructor(
    public var identity: WsEndpointIdentity,
    elementCtorArg: MutPtr<WsXmlBuffer>,
) {
    public var element: MutPtr<WsXmlBuffer> = elementCtorArg
        internal set

    public constructor() : this(
        identity = WsEndpointIdentity(),
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsEndpointIdentity = this.identity

    public operator fun component2(): MutPtr<WsXmlBuffer> = this.element

    public fun copy(identity: WsEndpointIdentity = this.identity, element: MutPtr<WsXmlBuffer> = this.element): WsUnknownEndpointIdentity = WsUnknownEndpointIdentity(identity = identity, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsUnknownEndpointIdentity) return false
        if (this.identity != other.identity) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.identity.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUnknownEndpointIdentity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUnknownEndpointIdentity> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsUnknownEndpointIdentity =
                    WsUnknownEndpointIdentity(
                        (WsEndpointIdentity.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlBuffer>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsUnknownEndpointIdentity) {
                    (WsEndpointIdentity.typeLayout()).writeNative(addr, value.identity)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlBuffer>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            identity: WsEndpointIdentity = WsEndpointIdentity(),
            element: MutPtr<WsXmlBuffer> = MutPtr(0L),
        ): WsUnknownEndpointIdentity =
            WsUnknownEndpointIdentity(
                identity = identity,
                elementCtorArg = element,
            )
    }
}

public data class WsUpnEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var upn: WsString = WsString(),
)

public data class WsUrl(
    public var scheme: WsUrlSchemeType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUrl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUrl> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsUrl =
                    WsUrl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsUrl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.scheme)
                }
            }
    }
}

public data class WsUsernameCredential(
    public var credentialType: WsUsernameCredentialType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUsernameCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUsernameCredential> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsUsernameCredential =
                    WsUsernameCredential(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsUsernameCredential) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.credentialType)
                }
            }
    }
}

public class WsUsernameMessageSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    public var bindingUsage: WsMessageSecurityUsage,
    clientCredentialCtorArg: MutPtr<WsUsernameCredential>,
    public var passwordValidator: WsValidatePasswordCallback,
    passwordValidatorCallbackStateCtorArg: MutPtr<CVoid>,
) {
    public var clientCredential: MutPtr<WsUsernameCredential> = clientCredentialCtorArg
        internal set

    public var passwordValidatorCallbackState: MutPtr<CVoid> = passwordValidatorCallbackStateCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        bindingUsage = 0,
        clientCredentialCtorArg = MutPtr(0L),
        passwordValidator = null,
        passwordValidatorCallbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): WsMessageSecurityUsage = this.bindingUsage

    public operator fun component3(): MutPtr<WsUsernameCredential> = this.clientCredential

    public operator fun component4(): WsValidatePasswordCallback = this.passwordValidator

    public operator fun component5(): MutPtr<CVoid> = this.passwordValidatorCallbackState

    public fun copy(binding: WsSecurityBinding = this.binding, bindingUsage: WsMessageSecurityUsage = this.bindingUsage, clientCredential: MutPtr<WsUsernameCredential> = this.clientCredential, passwordValidator: WsValidatePasswordCallback = this.passwordValidator, passwordValidatorCallbackState: MutPtr<CVoid> = this.passwordValidatorCallbackState): WsUsernameMessageSecurityBinding = WsUsernameMessageSecurityBinding(binding = binding, bindingUsage = bindingUsage, clientCredentialCtorArg = clientCredential, passwordValidator = passwordValidator, passwordValidatorCallbackStateCtorArg = passwordValidatorCallbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsUsernameMessageSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.bindingUsage != other.bindingUsage) return false
        if (this.clientCredential != other.clientCredential) return false
        if (this.passwordValidator != other.passwordValidator) return false
        if (this.passwordValidatorCallbackState != other.passwordValidatorCallbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.bindingUsage.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        result = 31 * result + this.passwordValidator.hashCode()
        result = 31 * result + this.passwordValidatorCallbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            bindingUsage: WsMessageSecurityUsage = 0,
            clientCredential: MutPtr<WsUsernameCredential> = MutPtr(0L),
            passwordValidator: WsValidatePasswordCallback = null,
            passwordValidatorCallbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsUsernameMessageSecurityBinding =
            WsUsernameMessageSecurityBinding(
                binding = binding,
                bindingUsage = bindingUsage,
                clientCredentialCtorArg = clientCredential,
                passwordValidator = passwordValidator,
                passwordValidatorCallbackStateCtorArg = passwordValidatorCallbackState,
            )
    }
}

public data class WsUsernameMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUsernameMessageSecurityBindingConstraint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUsernameMessageSecurityBindingConstraint> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsUsernameMessageSecurityBindingConstraint =
                    WsUsernameMessageSecurityBindingConstraint(
                        (WsSecurityBindingConstraint.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsUsernameMessageSecurityBindingConstraint) {
                    (WsSecurityBindingConstraint.typeLayout()).writeNative(addr, value.bindingConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                }
            }
    }
}

public data class WsUsernameMessageSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUsernameMessageSecurityBindingPolicyDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUsernameMessageSecurityBindingPolicyDescription> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsUsernameMessageSecurityBindingPolicyDescription =
                    WsUsernameMessageSecurityBindingPolicyDescription(
                        (WsSecurityBindingProperties.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsUsernameMessageSecurityBindingPolicyDescription) {
                    (WsSecurityBindingProperties.typeLayout()).writeNative(addr, value.securityBindingProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.bindingUsage)
                }
            }
    }
}

public class WsUsernameMessageSecurityBindingTemplate internal constructor(
    public var securityBindingProperties: WsSecurityBindingProperties,
    clientCredentialCtorArg: MutPtr<WsUsernameCredential>,
    public var passwordValidator: WsValidatePasswordCallback,
    passwordValidatorCallbackStateCtorArg: MutPtr<CVoid>,
) {
    public var clientCredential: MutPtr<WsUsernameCredential> = clientCredentialCtorArg
        internal set

    public var passwordValidatorCallbackState: MutPtr<CVoid> = passwordValidatorCallbackStateCtorArg
        internal set

    public constructor() : this(
        securityBindingProperties = WsSecurityBindingProperties(),
        clientCredentialCtorArg = MutPtr(0L),
        passwordValidator = null,
        passwordValidatorCallbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBindingProperties = this.securityBindingProperties

    public operator fun component2(): MutPtr<WsUsernameCredential> = this.clientCredential

    public operator fun component3(): WsValidatePasswordCallback = this.passwordValidator

    public operator fun component4(): MutPtr<CVoid> = this.passwordValidatorCallbackState

    public fun copy(securityBindingProperties: WsSecurityBindingProperties = this.securityBindingProperties, clientCredential: MutPtr<WsUsernameCredential> = this.clientCredential, passwordValidator: WsValidatePasswordCallback = this.passwordValidator, passwordValidatorCallbackState: MutPtr<CVoid> = this.passwordValidatorCallbackState): WsUsernameMessageSecurityBindingTemplate = WsUsernameMessageSecurityBindingTemplate(securityBindingProperties = securityBindingProperties, clientCredentialCtorArg = clientCredential, passwordValidator = passwordValidator, passwordValidatorCallbackStateCtorArg = passwordValidatorCallbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsUsernameMessageSecurityBindingTemplate) return false
        if (this.securityBindingProperties != other.securityBindingProperties) return false
        if (this.clientCredential != other.clientCredential) return false
        if (this.passwordValidator != other.passwordValidator) return false
        if (this.passwordValidatorCallbackState != other.passwordValidatorCallbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityBindingProperties.hashCode()
        result = 31 * result + this.clientCredential.hashCode()
        result = 31 * result + this.passwordValidator.hashCode()
        result = 31 * result + this.passwordValidatorCallbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
            clientCredential: MutPtr<WsUsernameCredential> = MutPtr(0L),
            passwordValidator: WsValidatePasswordCallback = null,
            passwordValidatorCallbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsUsernameMessageSecurityBindingTemplate =
            WsUsernameMessageSecurityBindingTemplate(
                securityBindingProperties = securityBindingProperties,
                clientCredentialCtorArg = clientCredential,
                passwordValidator = passwordValidator,
                passwordValidatorCallbackStateCtorArg = passwordValidatorCallbackState,
            )
    }
}

public data class WsUtf8ArrayDescription(
    public var minByteCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUtf8ArrayDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsUtf8ArrayDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsUtf8ArrayDescription =
                    WsUtf8ArrayDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsUtf8ArrayDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxByteCount)
                }
            }
    }
}

public data class WsVoidDescription(
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsVoidDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsVoidDescription> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsVoidDescription =
                    WsVoidDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsVoidDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                }
            }
    }
}

public data class WsWindowsIntegratedAuthCredential(
    public var credentialType: WsWindowsIntegratedAuthCredentialType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsWindowsIntegratedAuthCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsWindowsIntegratedAuthCredential> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsWindowsIntegratedAuthCredential =
                    WsWindowsIntegratedAuthCredential(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsWindowsIntegratedAuthCredential) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.credentialType)
                }
            }
    }
}

public data class WsWszDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsWszDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsWszDescription> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsWszDescription =
                    WsWszDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsWszDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minCharCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxCharCount)
                }
            }
    }
}

public class WsXmlAttribute internal constructor(
    public var singleQuote: UByte,
    public var isXmlNs: UByte,
    prefixCtorArg: MutPtr<WsXmlString>,
    localNameCtorArg: MutPtr<WsXmlString>,
    nsCtorArg: MutPtr<WsXmlString>,
    valueCtorArg: MutPtr<WsXmlText>,
) {
    public var prefix: MutPtr<WsXmlString> = prefixCtorArg
        internal set

    public var localName: MutPtr<WsXmlString> = localNameCtorArg
        internal set

    public var ns: MutPtr<WsXmlString> = nsCtorArg
        internal set

    public var value: MutPtr<WsXmlText> = valueCtorArg
        internal set

    public constructor() : this(
        singleQuote = 0u,
        isXmlNs = 0u,
        prefixCtorArg = MutPtr(0L),
        localNameCtorArg = MutPtr(0L),
        nsCtorArg = MutPtr(0L),
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.singleQuote

    public operator fun component2(): UByte = this.isXmlNs

    public operator fun component3(): MutPtr<WsXmlString> = this.prefix

    public operator fun component4(): MutPtr<WsXmlString> = this.localName

    public operator fun component5(): MutPtr<WsXmlString> = this.ns

    public operator fun component6(): MutPtr<WsXmlText> = this.value

    public fun copy(singleQuote: UByte = this.singleQuote, isXmlNs: UByte = this.isXmlNs, prefix: MutPtr<WsXmlString> = this.prefix, localName: MutPtr<WsXmlString> = this.localName, ns: MutPtr<WsXmlString> = this.ns, value: MutPtr<WsXmlText> = this.value): WsXmlAttribute = WsXmlAttribute(singleQuote = singleQuote, isXmlNs = isXmlNs, prefixCtorArg = prefix, localNameCtorArg = localName, nsCtorArg = ns, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlAttribute) return false
        if (this.singleQuote != other.singleQuote) return false
        if (this.isXmlNs != other.isXmlNs) return false
        if (this.prefix != other.prefix) return false
        if (this.localName != other.localName) return false
        if (this.ns != other.ns) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.singleQuote.hashCode()
        result = 31 * result + this.isXmlNs.hashCode()
        result = 31 * result + this.prefix.hashCode()
        result = 31 * result + this.localName.hashCode()
        result = 31 * result + this.ns.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlAttribute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlAttribute> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlAttribute =
                    WsXmlAttribute(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlText>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsXmlAttribute) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.singleQuote)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.isXmlNs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.prefix)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 16L, value.localName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 24L, value.ns)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlText>(64)
                    ).writeNative(addr + 32L, value.value)
                }
            }

        public operator fun invoke(
            singleQuote: UByte = 0u,
            isXmlNs: UByte = 0u,
            prefix: MutPtr<WsXmlString> = MutPtr(0L),
            localName: MutPtr<WsXmlString> = MutPtr(0L),
            ns: MutPtr<WsXmlString> = MutPtr(0L),
            value: MutPtr<WsXmlText> = MutPtr(0L),
        ): WsXmlAttribute =
            WsXmlAttribute(
                singleQuote = singleQuote,
                isXmlNs = isXmlNs,
                prefixCtorArg = prefix,
                localNameCtorArg = localName,
                nsCtorArg = ns,
                valueCtorArg = value,
            )
    }
}

public class WsXmlBase64Text internal constructor(
    public var text: WsXmlText,
    bytesCtorArg: MutPtr<UByte>,
    public var length: UInt,
) {
    public var bytes: MutPtr<UByte> = bytesCtorArg
        internal set

    public constructor() : this(
        text = WsXmlText(),
        bytesCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): WsXmlText = this.text

    public operator fun component2(): MutPtr<UByte> = this.bytes

    public operator fun component3(): UInt = this.length

    public fun copy(text: WsXmlText = this.text, bytes: MutPtr<UByte> = this.bytes, length: UInt = this.length): WsXmlBase64Text = WsXmlBase64Text(text = text, bytesCtorArg = bytes, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlBase64Text) return false
        if (this.text != other.text) return false
        if (this.bytes != other.bytes) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.text.hashCode()
        result = 31 * result + this.bytes.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlBase64Text> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlBase64Text> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlBase64Text =
                    WsXmlBase64Text(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlBase64Text) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.length)
                }
            }

        public operator fun invoke(
            text: WsXmlText = WsXmlText(),
            bytes: MutPtr<UByte> = MutPtr(0L),
            length: UInt = 0u,
        ): WsXmlBase64Text =
            WsXmlBase64Text(
                text = text,
                bytesCtorArg = bytes,
                length = length,
            )
    }
}

public data class WsXmlBoolText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Bool = 0,
)

public class WsXmlBufferProperty internal constructor(
    public var id: WsXmlBufferPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsXmlBufferPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsXmlBufferPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsXmlBufferProperty = WsXmlBufferProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlBufferProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlBufferProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlBufferProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlBufferProperty =
                    WsXmlBufferProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlBufferProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsXmlBufferPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsXmlBufferProperty =
            WsXmlBufferProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsXmlCanonicalizationInclusivePrefixes internal constructor(
    public var prefixCount: UInt,
    prefixesCtorArg: MutPtr<WsXmlString>,
) {
    public var prefixes: MutPtr<WsXmlString> = prefixesCtorArg
        internal set

    public constructor() : this(
        prefixCount = 0u,
        prefixesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.prefixCount

    public operator fun component2(): MutPtr<WsXmlString> = this.prefixes

    public fun copy(prefixCount: UInt = this.prefixCount, prefixes: MutPtr<WsXmlString> = this.prefixes): WsXmlCanonicalizationInclusivePrefixes = WsXmlCanonicalizationInclusivePrefixes(prefixCount = prefixCount, prefixesCtorArg = prefixes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlCanonicalizationInclusivePrefixes) return false
        if (this.prefixCount != other.prefixCount) return false
        if (this.prefixes != other.prefixes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prefixCount.hashCode()
        result = 31 * result + this.prefixes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlCanonicalizationInclusivePrefixes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlCanonicalizationInclusivePrefixes> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlCanonicalizationInclusivePrefixes =
                    WsXmlCanonicalizationInclusivePrefixes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlCanonicalizationInclusivePrefixes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.prefixCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.prefixes)
                }
            }

        public operator fun invoke(
            prefixCount: UInt = 0u,
            prefixes: MutPtr<WsXmlString> = MutPtr(0L),
        ): WsXmlCanonicalizationInclusivePrefixes =
            WsXmlCanonicalizationInclusivePrefixes(
                prefixCount = prefixCount,
                prefixesCtorArg = prefixes,
            )
    }
}

public class WsXmlCanonicalizationProperty internal constructor(
    public var id: WsXmlCanonicalizationPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsXmlCanonicalizationPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsXmlCanonicalizationPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsXmlCanonicalizationProperty = WsXmlCanonicalizationProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlCanonicalizationProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlCanonicalizationProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlCanonicalizationProperty> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlCanonicalizationProperty =
                    WsXmlCanonicalizationProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlCanonicalizationProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsXmlCanonicalizationPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsXmlCanonicalizationProperty =
            WsXmlCanonicalizationProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsXmlCommentNode(
    public var node: WsXmlNode = WsXmlNode(),
    public var value: WsXmlString = WsXmlString(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlCommentNode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlCommentNode> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlCommentNode =
                    WsXmlCommentNode(
                        (WsXmlNode.typeLayout()).readNative(addr),
                        (WsXmlString.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlCommentNode) {
                    (WsXmlNode.typeLayout()).writeNative(addr, value.node)
                    (WsXmlString.typeLayout()).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public data class WsXmlDatetimeText(
    public var text: WsXmlText = WsXmlText(),
    public var value: WsDatetime = WsDatetime(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlDatetimeText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlDatetimeText> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlDatetimeText =
                    WsXmlDatetimeText(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (WsDatetime.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlDatetimeText) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (WsDatetime.typeLayout()).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public data class WsXmlDecimalText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Decimal = Decimal(),
)

public class WsXmlDictionary internal constructor(
    public var guid: Guid,
    stringsCtorArg: MutPtr<WsXmlString>,
    public var stringCount: UInt,
    public var isConst: Bool,
) {
    public var strings: MutPtr<WsXmlString> = stringsCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        stringsCtorArg = MutPtr(0L),
        stringCount = 0u,
        isConst = 0,
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): MutPtr<WsXmlString> = this.strings

    public operator fun component3(): UInt = this.stringCount

    public operator fun component4(): Bool = this.isConst

    public fun copy(guid: Guid = this.guid, strings: MutPtr<WsXmlString> = this.strings, stringCount: UInt = this.stringCount, isConst: Bool = this.isConst): WsXmlDictionary = WsXmlDictionary(guid = guid, stringsCtorArg = strings, stringCount = stringCount, isConst = isConst)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlDictionary) return false
        if (this.guid != other.guid) return false
        if (this.strings != other.strings) return false
        if (this.stringCount != other.stringCount) return false
        if (this.isConst != other.isConst) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.strings.hashCode()
        result = 31 * result + this.stringCount.hashCode()
        result = 31 * result + this.isConst.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            strings: MutPtr<WsXmlString> = MutPtr(0L),
            stringCount: UInt = 0u,
            isConst: Bool = 0,
        ): WsXmlDictionary =
            WsXmlDictionary(
                guid = guid,
                stringsCtorArg = strings,
                stringCount = stringCount,
                isConst = isConst,
            )
    }
}

public data class WsXmlDoubleText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Double = 0.0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlDoubleText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlDoubleText> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlDoubleText =
                    WsXmlDoubleText(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlDoubleText) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class WsXmlElementNode internal constructor(
    public var node: WsXmlNode,
    prefixCtorArg: MutPtr<WsXmlString>,
    localNameCtorArg: MutPtr<WsXmlString>,
    nsCtorArg: MutPtr<WsXmlString>,
    public var attributeCount: UInt,
    attributesCtorArg: MutPtr<MutPtr<WsXmlAttribute>>,
    public var isEmpty: Bool,
) {
    public var prefix: MutPtr<WsXmlString> = prefixCtorArg
        internal set

    public var localName: MutPtr<WsXmlString> = localNameCtorArg
        internal set

    public var ns: MutPtr<WsXmlString> = nsCtorArg
        internal set

    public var attributes: MutPtr<MutPtr<WsXmlAttribute>> = attributesCtorArg
        internal set

    public constructor() : this(
        node = WsXmlNode(),
        prefixCtorArg = MutPtr(0L),
        localNameCtorArg = MutPtr(0L),
        nsCtorArg = MutPtr(0L),
        attributeCount = 0u,
        attributesCtorArg = MutPtr(0L),
        isEmpty = 0,
    )

    public operator fun component1(): WsXmlNode = this.node

    public operator fun component2(): MutPtr<WsXmlString> = this.prefix

    public operator fun component3(): MutPtr<WsXmlString> = this.localName

    public operator fun component4(): MutPtr<WsXmlString> = this.ns

    public operator fun component5(): UInt = this.attributeCount

    public operator fun component6(): MutPtr<MutPtr<WsXmlAttribute>> = this.attributes

    public operator fun component7(): Bool = this.isEmpty

    public fun copy(node: WsXmlNode = this.node, prefix: MutPtr<WsXmlString> = this.prefix, localName: MutPtr<WsXmlString> = this.localName, ns: MutPtr<WsXmlString> = this.ns, attributeCount: UInt = this.attributeCount, attributes: MutPtr<MutPtr<WsXmlAttribute>> = this.attributes, isEmpty: Bool = this.isEmpty): WsXmlElementNode = WsXmlElementNode(node = node, prefixCtorArg = prefix, localNameCtorArg = localName, nsCtorArg = ns, attributeCount = attributeCount, attributesCtorArg = attributes, isEmpty = isEmpty)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlElementNode) return false
        if (this.node != other.node) return false
        if (this.prefix != other.prefix) return false
        if (this.localName != other.localName) return false
        if (this.ns != other.ns) return false
        if (this.attributeCount != other.attributeCount) return false
        if (this.attributes != other.attributes) return false
        if (this.isEmpty != other.isEmpty) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.node.hashCode()
        result = 31 * result + this.prefix.hashCode()
        result = 31 * result + this.localName.hashCode()
        result = 31 * result + this.ns.hashCode()
        result = 31 * result + this.attributeCount.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.isEmpty.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            node: WsXmlNode = WsXmlNode(),
            prefix: MutPtr<WsXmlString> = MutPtr(0L),
            localName: MutPtr<WsXmlString> = MutPtr(0L),
            ns: MutPtr<WsXmlString> = MutPtr(0L),
            attributeCount: UInt = 0u,
            attributes: MutPtr<MutPtr<WsXmlAttribute>> = MutPtr(0L),
            isEmpty: Bool = 0,
        ): WsXmlElementNode =
            WsXmlElementNode(
                node = node,
                prefixCtorArg = prefix,
                localNameCtorArg = localName,
                nsCtorArg = ns,
                attributeCount = attributeCount,
                attributesCtorArg = attributes,
                isEmpty = isEmpty,
            )
    }
}

public data class WsXmlFloatText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlFloatText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlFloatText> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlFloatText =
                    WsXmlFloatText(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsXmlFloatText) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.value)
                }
            }
    }
}

public data class WsXmlGuidText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Guid = Guid(),
)

public data class WsXmlInt32Text(
    public var text: WsXmlText = WsXmlText(),
    public var value: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlInt32Text> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlInt32Text> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlInt32Text =
                    WsXmlInt32Text(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsXmlInt32Text) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.value)
                }
            }
    }
}
