@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.CypherBlock

public data class SlNongenuineUiOptions(
    public var cbSize: UInt = 0u,
    public var pComponentId: Guid? = null,
    public var hResultUI: Hresult = 0,
)

public data class SlSystemPolicyInformation(
    public var reserved1: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
    public var reserved2: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SlSystemPolicyInformation) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class SrSecurityDescriptor(
    public var length: UInt = 0u,
    public var securityDescriptor: COpaquePointer? = null,
)

public data class SslCredentialCertificate(
    public var cbPrivateKey: UInt = 0u,
    public var pPrivateKey: COpaquePointer? = null,
    public var cbCertificate: UInt = 0u,
    public var pCertificate: COpaquePointer? = null,
    public var pszPassword: Pstr = null,
)

public data class SubscribeGenericTlsExtension(
    public var flags: UInt = 0u,
    public var subscriptionsCount: UInt = 0u,
    public var subscriptions: List<TlsExtensionSubscription> = List(1) { TlsExtensionSubscription() },
)

public data class SecBuffer(
    public var cbBuffer: UInt = 0u,
    public var bufferType: UInt = 0u,
    public var pvBuffer: COpaquePointer? = null,
)

public data class SecBufferDesc(
    public var ulVersion: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var pBuffers: SecBuffer? = null,
)

public data class SecPkgContextAccessToken(
    public var accessToken: COpaquePointer? = null,
)

public data class SecPkgContextApplicationProtocol(
    public var protoNegoStatus: SecApplicationProtocolNegotiationStatus = 0,
    public var protoNegoExt: SecApplicationProtocolNegotiationExt = 0,
    public var protocolIdSize: UByte = 0u,
    public var protocolId: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextApplicationProtocol) return false
        if (this.protoNegoStatus != other.protoNegoStatus) return false
        if (this.protoNegoExt != other.protoNegoExt) return false
        if (this.protocolIdSize != other.protocolIdSize) return false
        if (!this.protocolId.contentEquals(other.protocolId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protoNegoStatus.hashCode()
        result = 31 * result + this.protoNegoExt.hashCode()
        result = 31 * result + this.protocolIdSize.hashCode()
        result = 31 * result + this.protocolId.contentHashCode()
        return result
    }
}

public data class SecPkgContextAuthorityA(
    public var sAuthorityName: COpaquePointer? = null,
)

public data class SecPkgContextAuthorityW(
    public var sAuthorityName: UShort? = null,
)

public data class SecPkgContextAuthzId(
    public var authzIDLength: UInt = 0u,
    public var authzID: Pstr = null,
)

public data class SecPkgContextBindings(
    public var bindingsLength: UInt = 0u,
    public var bindings: SecChannelBindings? = null,
)

public data class SecPkgContextCertInfo(
    public var dwVersion: UInt = 0u,
    public var cbSubjectName: UInt = 0u,
    public var pwszSubjectName: Pwstr = null,
    public var cbIssuerName: UInt = 0u,
    public var pwszIssuerName: Pwstr = null,
    public var dwKeySize: UInt = 0u,
)

public data class SecPkgContextCertificateValidationResult(
    public var dwChainErrorStatus: UInt = 0u,
    public var hrVerifyChainStatus: Hresult = 0,
)

public data class SecPkgContextCertificates(
    public var cCertificates: UInt = 0u,
    public var cbCertificateChain: UInt = 0u,
    public var pbCertificateChain: COpaquePointer? = null,
)

public data class SecPkgContextCipherInfo(
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
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextCipherInfo) return false
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
        return result
    }
}

public data class SecPkgContextClientCertPolicyResult(
    public var dwPolicyResult: Hresult = 0,
    public var guidPolicyId: Guid = Guid(),
)

public data class SecPkgContextClientSpecifiedTarget(
    public var sTargetName: UShort? = null,
)

public data class SecPkgContextConnectionInfo(
    public var dwProtocol: UInt = 0u,
    public var aiCipher: AlgId = 0u,
    public var dwCipherStrength: UInt = 0u,
    public var aiHash: AlgId = 0u,
    public var dwHashStrength: UInt = 0u,
    public var aiExch: AlgId = 0u,
    public var dwExchStrength: UInt = 0u,
)

public data class SecPkgContextConnectionInfoEx(
    public var dwVersion: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var szCipher: UShortArray = UShortArray(64),
    public var dwCipherStrength: UInt = 0u,
    public var szHash: UShortArray = UShortArray(64),
    public var dwHashStrength: UInt = 0u,
    public var szExchange: UShortArray = UShortArray(64),
    public var dwExchStrength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextConnectionInfoEx) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (!this.szCipher.contentEquals(other.szCipher)) return false
        if (this.dwCipherStrength != other.dwCipherStrength) return false
        if (!this.szHash.contentEquals(other.szHash)) return false
        if (this.dwHashStrength != other.dwHashStrength) return false
        if (!this.szExchange.contentEquals(other.szExchange)) return false
        if (this.dwExchStrength != other.dwExchStrength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.szCipher.contentHashCode()
        result = 31 * result + this.dwCipherStrength.hashCode()
        result = 31 * result + this.szHash.contentHashCode()
        result = 31 * result + this.dwHashStrength.hashCode()
        result = 31 * result + this.szExchange.contentHashCode()
        result = 31 * result + this.dwExchStrength.hashCode()
        return result
    }
}

public data class SecPkgContextCredInfo(
    public var credClass: SecpkgCredClass = 0,
    public var isPromptingNeeded: UInt = 0u,
)

public data class SecPkgContextCredentialNameA(
    public var credentialType: UInt = 0u,
    public var sCredentialName: COpaquePointer? = null,
)

public data class SecPkgContextCredentialNameW(
    public var credentialType: UInt = 0u,
    public var sCredentialName: UShort? = null,
)

public data class SecPkgContextDceInfo(
    public var authzSvc: UInt = 0u,
    public var pPac: COpaquePointer? = null,
)

public data class SecPkgContextEapKeyBlock(
    public var rgbKeys: UByteArray = UByteArray(128),
    public var rgbIVs: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextEapKeyBlock) return false
        if (!this.rgbKeys.contentEquals(other.rgbKeys)) return false
        if (!this.rgbIVs.contentEquals(other.rgbIVs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgbKeys.contentHashCode()
        result = 31 * result + this.rgbIVs.contentHashCode()
        return result
    }
}

public data class SecPkgContextEapPrfInfo(
    public var dwVersion: UInt = 0u,
    public var cbPrfData: UInt = 0u,
    public var pbPrfData: COpaquePointer? = null,
)

public data class SecPkgContextEarlyStart(
    public var dwEarlyStartFlags: UInt = 0u,
)

public data class SecPkgContextFlags(
    public var flags: UInt = 0u,
)

public data class SecPkgContextIssuerListInfoEx(
    public var aIssuers: CryptIntegerBlob? = null,
    public var cIssuers: UInt = 0u,
)

public data class SecPkgContextKeyInfoA(
    public var sSignatureAlgorithmName: COpaquePointer? = null,
    public var sEncryptAlgorithmName: COpaquePointer? = null,
    public var keySize: UInt = 0u,
    public var signatureAlgorithm: UInt = 0u,
    public var encryptAlgorithm: UInt = 0u,
)

public data class SecPkgContextKeyInfoW(
    public var sSignatureAlgorithmName: UShort? = null,
    public var sEncryptAlgorithmName: UShort? = null,
    public var keySize: UInt = 0u,
    public var signatureAlgorithm: UInt = 0u,
    public var encryptAlgorithm: UInt = 0u,
)

public data class SecPkgContextKeyingMaterial(
    public var cbKeyingMaterial: UInt = 0u,
    public var pbKeyingMaterial: COpaquePointer? = null,
)

public data class SecPkgContextKeyingMaterialInfo(
    public var cbLabel: UShort = 0u,
    public var pszLabel: Pstr = null,
    public var cbContextValue: UShort = 0u,
    public var pbContextValue: COpaquePointer? = null,
    public var cbKeyingMaterial: UInt = 0u,
)

public data class SecPkgContextKeyingMaterialInproc(
    public var cbLabel: UShort = 0u,
    public var pszLabel: Pstr = null,
    public var cbContextValue: UShort = 0u,
    public var pbContextValue: COpaquePointer? = null,
    public var cbKeyingMaterial: UInt = 0u,
    public var pbKeyingMaterial: COpaquePointer? = null,
)

public data class SecPkgContextLastClientTokenStatus(
    public var lastClientTokenStatus: SecpkgAttrLctStatus = 0,
)

public data class SecPkgContextLifespan(
    public var tsStart: Long = 0L,
    public var tsExpiry: Long = 0L,
)

public data class SecPkgContextLocalCredentialInfo(
    public var cbCertificateChain: UInt = 0u,
    public var pbCertificateChain: COpaquePointer? = null,
    public var cCertificates: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var dwBits: UInt = 0u,
)

public data class SecPkgContextLogoffTime(
    public var tsLogoffTime: Long = 0L,
)

public data class SecPkgContextMappedCredAttr(
    public var dwAttribute: UInt = 0u,
    public var pvBuffer: COpaquePointer? = null,
)

public data class SecPkgContextNamesA(
    public var sUserName: COpaquePointer? = null,
)

public data class SecPkgContextNamesW(
    public var sUserName: UShort? = null,
)

public data class SecPkgContextNativeNamesA(
    public var sClientName: COpaquePointer? = null,
    public var sServerName: COpaquePointer? = null,
)

public data class SecPkgContextNativeNamesW(
    public var sClientName: UShort? = null,
    public var sServerName: UShort? = null,
)

public data class SecPkgContextNegoKeys(
    public var keyType: UInt = 0u,
    public var keyLength: UShort = 0u,
    public var keyValue: COpaquePointer? = null,
    public var verifyKeyType: UInt = 0u,
    public var verifyKeyLength: UShort = 0u,
    public var verifyKeyValue: COpaquePointer? = null,
)

public data class SecPkgContextNegoPackageInfo(
    public var packageMask: UInt = 0u,
)

public data class SecPkgContextNegoStatus(
    public var lastStatus: UInt = 0u,
)

public data class SecPkgContextNegotiatedTlsExtensions(
    public var extensionsCount: UInt = 0u,
    public var extensions: UShort? = null,
)

public data class SecPkgContextNegotiationInfoA(
    public var packageInfo: SecPkgInfoA? = null,
    public var negotiationState: UInt = 0u,
)

public data class SecPkgContextNegotiationInfoW(
    public var packageInfo: SecPkgInfoW? = null,
    public var negotiationState: UInt = 0u,
)

public data class SecPkgContextPackageInfoA(
    public var packageInfo: SecPkgInfoA? = null,
)

public data class SecPkgContextPackageInfoW(
    public var packageInfo: SecPkgInfoW? = null,
)

public data class SecPkgContextPasswordExpiry(
    public var tsPasswordExpires: Long = 0L,
)

public data class SecPkgContextProtoInfoA(
    public var sProtocolName: COpaquePointer? = null,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
)

public data class SecPkgContextProtoInfoW(
    public var sProtocolName: UShort? = null,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
)

public data class SecPkgContextRemoteCredentialInfo(
    public var cbCertificateChain: UInt = 0u,
    public var pbCertificateChain: COpaquePointer? = null,
    public var cCertificates: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var dwBits: UInt = 0u,
)

public data class SecPkgContextSaslContext(
    public var saslContext: COpaquePointer? = null,
)

public data class SecPkgContextSessionAppData(
    public var dwFlags: UInt = 0u,
    public var cbAppData: UInt = 0u,
    public var pbAppData: COpaquePointer? = null,
)

public data class SecPkgContextSessionInfo(
    public var dwFlags: UInt = 0u,
    public var cbSessionId: UInt = 0u,
    public var rgbSessionId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextSessionInfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbSessionId != other.cbSessionId) return false
        if (!this.rgbSessionId.contentEquals(other.rgbSessionId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.cbSessionId.hashCode()
        result = 31 * result + this.rgbSessionId.contentHashCode()
        return result
    }
}

public data class SecPkgContextSessionKey(
    public var sessionKeyLength: UInt = 0u,
    public var sessionKey: COpaquePointer? = null,
)

public data class SecPkgContextSizes(
    public var cbMaxToken: UInt = 0u,
    public var cbMaxSignature: UInt = 0u,
    public var cbBlockSize: UInt = 0u,
    public var cbSecurityTrailer: UInt = 0u,
)

public data class SecPkgContextSrtpParameters(
    public var protectionProfile: UShort = 0u,
    public var masterKeyIdentifierSize: UByte = 0u,
    public var masterKeyIdentifier: COpaquePointer? = null,
)

public data class SecPkgContextStreamSizes(
    public var cbHeader: UInt = 0u,
    public var cbTrailer: UInt = 0u,
    public var cbMaximumMessage: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var cbBlockSize: UInt = 0u,
)

public data class SecPkgContextSubjectAttributes(
    public var attributeInfo: COpaquePointer? = null,
)

public data class SecPkgContextSupportedSignatures(
    public var cSignatureAndHashAlgorithms: UShort = 0u,
    public var pSignatureAndHashAlgorithms: UShort? = null,
)

public data class SecPkgContextTarget(
    public var targetLength: UInt = 0u,
    public var target: Pstr = null,
)

public data class SecPkgContextTargetInformation(
    public var marshalledTargetInfoLength: UInt = 0u,
    public var marshalledTargetInfo: COpaquePointer? = null,
)

public data class SecPkgContextTokenBinding(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var keyParametersSize: UShort = 0u,
    public var keyParameters: COpaquePointer? = null,
)

public data class SecPkgContextUiInfo(
    public var hParentWindow: Hwnd = null,
)

public data class SecPkgContextUserFlags(
    public var userFlags: UInt = 0u,
)

public data class SecPkgCredCipherStrengths(
    public var dwMinimumCipherStrength: UInt = 0u,
    public var dwMaximumCipherStrength: UInt = 0u,
)

public data class SecPkgCredClientCertPolicy(
    public var dwFlags: UInt = 0u,
    public var guidPolicyId: Guid = Guid(),
    public var dwCertFlags: UInt = 0u,
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var fCheckRevocationFreshnessTime: Bool = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
    public var fOmitUsageCheck: Bool = 0,
    public var pwszSslCtlStoreName: Pwstr = null,
    public var pwszSslCtlIdentifier: Pwstr = null,
)

public data class SecPkgCredSessionTicketKey(
    public var ticketInfoVersion: UInt = 0u,
    public var keyId: UByteArray = UByteArray(16),
    public var keyingMaterial: UByteArray = UByteArray(64),
    public var keyingMaterialSize: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCredSessionTicketKey) return false
        if (this.ticketInfoVersion != other.ticketInfoVersion) return false
        if (!this.keyId.contentEquals(other.keyId)) return false
        if (!this.keyingMaterial.contentEquals(other.keyingMaterial)) return false
        if (this.keyingMaterialSize != other.keyingMaterialSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ticketInfoVersion.hashCode()
        result = 31 * result + this.keyId.contentHashCode()
        result = 31 * result + this.keyingMaterial.contentHashCode()
        result = 31 * result + this.keyingMaterialSize.hashCode()
        return result
    }
}

public data class SecPkgCredSessionTicketKeys(
    public var cSessionTicketKeys: UInt = 0u,
    public var pSessionTicketKeys: SecPkgCredSessionTicketKey? = null,
)

public data class SecPkgCredSupportedAlgs(
    public var cSupportedAlgs: UInt = 0u,
    public var palgSupportedAlgs: AlgId? = null,
)

public data class SecPkgCredSupportedProtocols(
    public var grbitProtocol: UInt = 0u,
)

public data class SecPkgCredentialsCert(
    public var encodedCertSize: UInt = 0u,
    public var encodedCert: COpaquePointer? = null,
)

public data class SecPkgCredentialsKdcProxySettingsW(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var proxyServerOffset: UShort = 0u,
    public var proxyServerLength: UShort = 0u,
    public var clientTlsCredOffset: UShort = 0u,
    public var clientTlsCredLength: UShort = 0u,
)

public data class SecPkgCredentialsNamesA(
    public var sUserName: COpaquePointer? = null,
)

public data class SecPkgCredentialsNamesW(
    public var sUserName: UShort? = null,
)

public data class SecPkgCredentialsSsiproviderA(
    public var sProviderName: COpaquePointer? = null,
    public var providerInfoLength: UInt = 0u,
    public var providerInfo: Pstr = null,
)

public data class SecPkgCredentialsSsiproviderW(
    public var sProviderName: UShort? = null,
    public var providerInfoLength: UInt = 0u,
    public var providerInfo: Pstr = null,
)

public data class SecPkgInfoA(
    public var fCapabilities: UInt = 0u,
    public var wVersion: UShort = 0u,
    public var wRPCID: UShort = 0u,
    public var cbMaxToken: UInt = 0u,
    public var name: COpaquePointer? = null,
    public var comment: COpaquePointer? = null,
)

public data class SecPkgInfoW(
    public var fCapabilities: UInt = 0u,
    public var wVersion: UShort = 0u,
    public var wRPCID: UShort = 0u,
    public var cbMaxToken: UInt = 0u,
    public var name: UShort? = null,
    public var comment: UShort? = null,
)

public class SecurityFunctionTableA(
    public var dwVersion: UInt = 0u,
    public var enumerateSecurityPackagesA: EnumerateSecurityPackagesFnA = null,
    public var queryCredentialsAttributesA: QueryCredentialsAttributesFnA = null,
    public var acquireCredentialsHandleA: AcquireCredentialsHandleFnA = null,
    public var freeCredentialsHandle: FreeCredentialsHandleFn = null,
    public var reserved2: COpaquePointer? = null,
    public var initializeSecurityContextA: InitializeSecurityContextFnA = null,
    public var acceptSecurityContext: AcceptSecurityContextFn = null,
    public var completeAuthToken: CompleteAuthTokenFn = null,
    public var deleteSecurityContext: DeleteSecurityContextFn = null,
    public var applyControlToken: ApplyControlTokenFn = null,
    public var queryContextAttributesA: QueryContextAttributesFnA = null,
    public var impersonateSecurityContext: ImpersonateSecurityContextFn = null,
    public var revertSecurityContext: RevertSecurityContextFn = null,
    public var makeSignature: MakeSignatureFn = null,
    public var verifySignature: VerifySignatureFn = null,
    public var freeContextBuffer: FreeContextBufferFn = null,
    public var querySecurityPackageInfoA: QuerySecurityPackageInfoFnA = null,
    public var reserved3: COpaquePointer? = null,
    public var reserved4: COpaquePointer? = null,
    public var exportSecurityContext: ExportSecurityContextFn = null,
    public var importSecurityContextA: ImportSecurityContextFnA = null,
    public var addCredentialsA: AddCredentialsFnA = null,
    public var reserved8: COpaquePointer? = null,
    public var querySecurityContextToken: QuerySecurityContextTokenFn = null,
    public var encryptMessage: EncryptMessageFn = null,
    public var decryptMessage: DecryptMessageFn = null,
    public var setContextAttributesA: SetContextAttributesFnA = null,
    public var setCredentialsAttributesA: SetCredentialsAttributesFnA = null,
    public var changeAccountPasswordA: ChangePasswordFnA = null,
    public var queryContextAttributesExA: QueryContextAttributesExFnA = null,
    public var queryCredentialsAttributesExA: QueryCredentialsAttributesExFnA = null,
)

public class SecurityFunctionTableW(
    public var dwVersion: UInt = 0u,
    public var enumerateSecurityPackagesW: EnumerateSecurityPackagesFnW = null,
    public var queryCredentialsAttributesW: QueryCredentialsAttributesFnW = null,
    public var acquireCredentialsHandleW: AcquireCredentialsHandleFnW = null,
    public var freeCredentialsHandle: FreeCredentialsHandleFn = null,
    public var reserved2: COpaquePointer? = null,
    public var initializeSecurityContextW: InitializeSecurityContextFnW = null,
    public var acceptSecurityContext: AcceptSecurityContextFn = null,
    public var completeAuthToken: CompleteAuthTokenFn = null,
    public var deleteSecurityContext: DeleteSecurityContextFn = null,
    public var applyControlToken: ApplyControlTokenFn = null,
    public var queryContextAttributesW: QueryContextAttributesFnW = null,
    public var impersonateSecurityContext: ImpersonateSecurityContextFn = null,
    public var revertSecurityContext: RevertSecurityContextFn = null,
    public var makeSignature: MakeSignatureFn = null,
    public var verifySignature: VerifySignatureFn = null,
    public var freeContextBuffer: FreeContextBufferFn = null,
    public var querySecurityPackageInfoW: QuerySecurityPackageInfoFnW = null,
    public var reserved3: COpaquePointer? = null,
    public var reserved4: COpaquePointer? = null,
    public var exportSecurityContext: ExportSecurityContextFn = null,
    public var importSecurityContextW: ImportSecurityContextFnW = null,
    public var addCredentialsW: AddCredentialsFnW = null,
    public var reserved8: COpaquePointer? = null,
    public var querySecurityContextToken: QuerySecurityContextTokenFn = null,
    public var encryptMessage: EncryptMessageFn = null,
    public var decryptMessage: DecryptMessageFn = null,
    public var setContextAttributesW: SetContextAttributesFnW = null,
    public var setCredentialsAttributesW: SetCredentialsAttributesFnW = null,
    public var changeAccountPasswordW: ChangePasswordFnW = null,
    public var queryContextAttributesExW: QueryContextAttributesExFnW = null,
    public var queryCredentialsAttributesExW: QueryCredentialsAttributesExFnW = null,
)

public data class TlsExtensionSubscription(
    public var extensionType: UShort = 0u,
    public var handshakeType: UShort = 0u,
)

public data class TlsParameters(
    public var cAlpnIds: UInt = 0u,
    public var rgstrAlpnIds: LsaUnicodeString? = null,
    public var grbitDisabledProtocols: UInt = 0u,
    public var cDisabledCrypto: UInt = 0u,
    public var pDisabledCrypto: CryptoSettings? = null,
    public var dwFlags: UInt = 0u,
)

public data class TokenbindingIdentifier(
    public var keyType: UByte = 0u,
)

public data class TokenbindingKeyTypes(
    public var keyCount: UInt = 0u,
    public var keyType: Int? = null,
)

public data class TokenbindingResultData(
    public var bindingType: TokenbindingType = 0,
    public var identifierSize: UInt = 0u,
    public var identifierData: TokenbindingIdentifier? = null,
    public var extensionFormat: TokenbindingExtensionFormat = 0,
    public var extensionSize: UInt = 0u,
    public var extensionData: COpaquePointer? = null,
)

public data class TokenbindingResultList(
    public var resultCount: UInt = 0u,
    public var resultData: TokenbindingResultData? = null,
)

public data class TrustedControllersInfo(
    public var entries: UInt = 0u,
    public var names: LsaUnicodeString? = null,
)

public data class TrustedDomainAuthInformation(
    public var incomingAuthInfos: UInt = 0u,
    public var incomingAuthenticationInformation: LsaAuthInformation? = null,
    public var incomingPreviousAuthenticationInformation: LsaAuthInformation? = null,
    public var outgoingAuthInfos: UInt = 0u,
    public var outgoingAuthenticationInformation: LsaAuthInformation? = null,
    public var outgoingPreviousAuthenticationInformation: LsaAuthInformation? = null,
)

public data class TrustedDomainFullInformation(
    public var information: TrustedDomainInformationEx = TrustedDomainInformationEx(),
    public var posixOffset: TrustedPosixOffsetInfo = TrustedPosixOffsetInfo(),
    public var authInformation: TrustedDomainAuthInformation = TrustedDomainAuthInformation(),
)

public data class TrustedDomainFullInformation2(
    public var information: TrustedDomainInformationEx2 = TrustedDomainInformationEx2(),
    public var posixOffset: TrustedPosixOffsetInfo = TrustedPosixOffsetInfo(),
    public var authInformation: TrustedDomainAuthInformation = TrustedDomainAuthInformation(),
)

public data class TrustedDomainInformationEx(
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var flatName: LsaUnicodeString = LsaUnicodeString(),
    public var sid: Psid = null,
    public var trustDirection: TrustedDomainTrustDirection = 0u,
    public var trustType: TrustedDomainTrustType = 0u,
    public var trustAttributes: TrustedDomainTrustAttributes = 0u,
)

public data class TrustedDomainInformationEx2(
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var flatName: LsaUnicodeString = LsaUnicodeString(),
    public var sid: Psid = null,
    public var trustDirection: UInt = 0u,
    public var trustType: UInt = 0u,
    public var trustAttributes: UInt = 0u,
    public var forestTrustLength: UInt = 0u,
    public var forestTrustInfo: COpaquePointer? = null,
)

public data class TrustedDomainNameInfo(
    public var name: LsaUnicodeString = LsaUnicodeString(),
)

public data class TrustedDomainSupportedEncryptionTypes(
    public var supportedEncryptionTypes: UInt = 0u,
)

public data class TrustedPasswordInfo(
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
)

public data class TrustedPosixOffsetInfo(
    public var offset: UInt = 0u,
)

public class UserAllInformation(
    public var lastLogon: Long = 0L,
    public var lastLogoff: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var accountExpires: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var fullName: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectory: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
    public var scriptPath: LsaUnicodeString = LsaUnicodeString(),
    public var profilePath: LsaUnicodeString = LsaUnicodeString(),
    public var adminComment: LsaUnicodeString = LsaUnicodeString(),
    public var workStations: LsaUnicodeString = LsaUnicodeString(),
    public var userComment: LsaUnicodeString = LsaUnicodeString(),
    public var parameters: LsaUnicodeString = LsaUnicodeString(),
    public var lmPassword: LsaUnicodeString = LsaUnicodeString(),
    public var ntPassword: LsaUnicodeString = LsaUnicodeString(),
    public var privateData: LsaUnicodeString = LsaUnicodeString(),
    public var securityDescriptor: SrSecurityDescriptor = SrSecurityDescriptor(),
    public var userId: UInt = 0u,
    public var primaryGroupId: UInt = 0u,
    public var userAccountControl: UInt = 0u,
    public var whichFields: UInt = 0u,
    public var logonHours: LogonHours = LogonHours(),
    public var badPasswordCount: UShort = 0u,
    public var logonCount: UShort = 0u,
    public var countryCode: UShort = 0u,
    public var codePage: UShort = 0u,
    public var lmPasswordPresent: Boolean = false,
    public var ntPasswordPresent: Boolean = false,
    public var passwordExpired: Boolean = false,
    public var privateDataSensitive: Boolean = false,
)

public data class UserSessionKey(
    public var data: List<CypherBlock> = List(2) { CypherBlock() },
)

public data class X509Certificate(
    public var version: UInt = 0u,
    public var serialNumber: UIntArray = UIntArray(4),
    public var signatureAlgorithm: AlgId = 0u,
    public var validFrom: Filetime = Filetime(),
    public var validUntil: Filetime = Filetime(),
    public var pszIssuer: Pstr = null,
    public var pszSubject: Pstr = null,
    public var pPublicKey: PctPublicKey? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is X509Certificate) return false
        if (this.version != other.version) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.signatureAlgorithm != other.signatureAlgorithm) return false
        if (this.validFrom != other.validFrom) return false
        if (this.validUntil != other.validUntil) return false
        if (this.pszIssuer != other.pszIssuer) return false
        if (this.pszSubject != other.pszSubject) return false
        if (this.pPublicKey != other.pPublicKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.signatureAlgorithm.hashCode()
        result = 31 * result + this.validFrom.hashCode()
        result = 31 * result + this.validUntil.hashCode()
        result = 31 * result + this.pszIssuer.hashCode()
        result = 31 * result + this.pszSubject.hashCode()
        result = 31 * result + this.pPublicKey.hashCode()
        return result
    }
}
