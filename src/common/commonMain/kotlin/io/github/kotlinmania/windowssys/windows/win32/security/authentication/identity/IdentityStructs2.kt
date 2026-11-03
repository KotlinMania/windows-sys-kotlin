@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class SL_NONGENUINE_UI_OPTIONS(
    public var cbSize: UInt = 0u,
    public var pComponentId: Long = 0L,
    public var hResultUI: HRESULT = 0,
)

public data class SL_SYSTEM_POLICY_INFORMATION(public var Reserved1: LongArray = LongArray(2), public var Reserved2: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SL_SYSTEM_POLICY_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class SR_SECURITY_DESCRIPTOR(public var Length: UInt = 0u, public var SecurityDescriptor: Long = 0L)

public data class SSL_CREDENTIAL_CERTIFICATE(
    public var cbPrivateKey: UInt = 0u,
    public var pPrivateKey: Long = 0L,
    public var cbCertificate: UInt = 0u,
    public var pCertificate: Long = 0L,
    public var pszPassword: PSTR = 0L,
)

public data class SUBSCRIBE_GENERIC_TLS_EXTENSION(
    public var Flags: UInt = 0u,
    public var SubscriptionsCount: UInt = 0u,
    public var Subscriptions: List<TLS_EXTENSION_SUBSCRIPTION> = List(1) { TLS_EXTENSION_SUBSCRIPTION() },
)

public data class SecBuffer(
    public var cbBuffer: UInt = 0u,
    public var BufferType: UInt = 0u,
    public var pvBuffer: Long = 0L,
)

public data class SecBufferDesc(
    public var ulVersion: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var pBuffers: Long = 0L,
)

public data class SecPkgContext_AccessToken(public var AccessToken: Long = 0L)

public data class SecPkgContext_ApplicationProtocol(
    public var ProtoNegoStatus: SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS = 0,
    public var ProtoNegoExt: SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT = 0,
    public var ProtocolIdSize: UByte = 0u,
    public var ProtocolId: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContext_ApplicationProtocol) return false
        if (this.ProtoNegoStatus != other.ProtoNegoStatus) return false
        if (this.ProtoNegoExt != other.ProtoNegoExt) return false
        if (this.ProtocolIdSize != other.ProtocolIdSize) return false
        if (!this.ProtocolId.contentEquals(other.ProtocolId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProtoNegoStatus.hashCode()
        result = 31 * result + this.ProtoNegoExt.hashCode()
        result = 31 * result + this.ProtocolIdSize.hashCode()
        result = 31 * result + this.ProtocolId.contentHashCode()
        return result
    }
}

public data class SecPkgContext_AuthorityA(public var sAuthorityName: Long = 0L)

public data class SecPkgContext_AuthorityW(public var sAuthorityName: Long = 0L)

public data class SecPkgContext_AuthzID(public var AuthzIDLength: UInt = 0u, public var AuthzID: PSTR = 0L)

public data class SecPkgContext_Bindings(public var BindingsLength: UInt = 0u, public var Bindings: Long = 0L)

public data class SecPkgContext_CertInfo(
    public var dwVersion: UInt = 0u,
    public var cbSubjectName: UInt = 0u,
    public var pwszSubjectName: PWSTR = 0L,
    public var cbIssuerName: UInt = 0u,
    public var pwszIssuerName: PWSTR = 0L,
    public var dwKeySize: UInt = 0u,
)

public data class SecPkgContext_CertificateValidationResult(public var dwChainErrorStatus: UInt = 0u, public var hrVerifyChainStatus: HRESULT = 0)

public data class SecPkgContext_Certificates(
    public var cCertificates: UInt = 0u,
    public var cbCertificateChain: UInt = 0u,
    public var pbCertificateChain: Long = 0L,
)

public data class SecPkgContext_CipherInfo(
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
        if (other !is SecPkgContext_CipherInfo) return false
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

public data class SecPkgContext_ClientCertPolicyResult(public var dwPolicyResult: HRESULT = 0, public var guidPolicyId: GUID = GUID())

public data class SecPkgContext_ClientSpecifiedTarget(public var sTargetName: Long = 0L)

public data class SecPkgContext_ConnectionInfo(
    public var dwProtocol: UInt = 0u,
    public var aiCipher: Cryptography.ALG_ID = Cryptography.ALG_ID(),
    public var dwCipherStrength: UInt = 0u,
    public var aiHash: Cryptography.ALG_ID = Cryptography.ALG_ID(),
    public var dwHashStrength: UInt = 0u,
    public var aiExch: Cryptography.ALG_ID = Cryptography.ALG_ID(),
    public var dwExchStrength: UInt = 0u,
)

public data class SecPkgContext_ConnectionInfoEx(
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
        if (other !is SecPkgContext_ConnectionInfoEx) return false
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

public data class SecPkgContext_CredInfo(public var CredClass: SECPKG_CRED_CLASS = 0, public var IsPromptingNeeded: UInt = 0u)

public data class SecPkgContext_CredentialNameA(public var CredentialType: UInt = 0u, public var sCredentialName: Long = 0L)

public data class SecPkgContext_CredentialNameW(public var CredentialType: UInt = 0u, public var sCredentialName: Long = 0L)

public data class SecPkgContext_DceInfo(public var AuthzSvc: UInt = 0u, public var pPac: Long = 0L)

public data class SecPkgContext_EapKeyBlock(public var rgbKeys: UByteArray = UByteArray(128), public var rgbIVs: UByteArray = UByteArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContext_EapKeyBlock) return false
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

public data class SecPkgContext_EapPrfInfo(
    public var dwVersion: UInt = 0u,
    public var cbPrfData: UInt = 0u,
    public var pbPrfData: Long = 0L,
)

public data class SecPkgContext_EarlyStart(public var dwEarlyStartFlags: UInt = 0u)

public data class SecPkgContext_Flags(public var Flags: UInt = 0u)

public data class SecPkgContext_IssuerListInfoEx(public var aIssuers: Long = 0L, public var cIssuers: UInt = 0u)

public data class SecPkgContext_KeyInfoA(
    public var sSignatureAlgorithmName: Long = 0L,
    public var sEncryptAlgorithmName: Long = 0L,
    public var KeySize: UInt = 0u,
    public var SignatureAlgorithm: UInt = 0u,
    public var EncryptAlgorithm: UInt = 0u,
)

public data class SecPkgContext_KeyInfoW(
    public var sSignatureAlgorithmName: Long = 0L,
    public var sEncryptAlgorithmName: Long = 0L,
    public var KeySize: UInt = 0u,
    public var SignatureAlgorithm: UInt = 0u,
    public var EncryptAlgorithm: UInt = 0u,
)

public data class SecPkgContext_KeyingMaterial(public var cbKeyingMaterial: UInt = 0u, public var pbKeyingMaterial: Long = 0L)

public data class SecPkgContext_KeyingMaterialInfo(
    public var cbLabel: UShort = 0u,
    public var pszLabel: PSTR = 0L,
    public var cbContextValue: UShort = 0u,
    public var pbContextValue: Long = 0L,
    public var cbKeyingMaterial: UInt = 0u,
)

public data class SecPkgContext_KeyingMaterial_Inproc(
    public var cbLabel: UShort = 0u,
    public var pszLabel: PSTR = 0L,
    public var cbContextValue: UShort = 0u,
    public var pbContextValue: Long = 0L,
    public var cbKeyingMaterial: UInt = 0u,
    public var pbKeyingMaterial: Long = 0L,
)

public data class SecPkgContext_LastClientTokenStatus(public var LastClientTokenStatus: SECPKG_ATTR_LCT_STATUS = 0)

public data class SecPkgContext_Lifespan(public var tsStart: Long = 0L, public var tsExpiry: Long = 0L)

public data class SecPkgContext_LocalCredentialInfo(
    public var cbCertificateChain: UInt = 0u,
    public var pbCertificateChain: Long = 0L,
    public var cCertificates: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var dwBits: UInt = 0u,
)

public data class SecPkgContext_LogoffTime(public var tsLogoffTime: Long = 0L)

public data class SecPkgContext_MappedCredAttr(public var dwAttribute: UInt = 0u, public var pvBuffer: Long = 0L)

public data class SecPkgContext_NamesA(public var sUserName: Long = 0L)

public data class SecPkgContext_NamesW(public var sUserName: Long = 0L)

public data class SecPkgContext_NativeNamesA(public var sClientName: Long = 0L, public var sServerName: Long = 0L)

public data class SecPkgContext_NativeNamesW(public var sClientName: Long = 0L, public var sServerName: Long = 0L)

public data class SecPkgContext_NegoKeys(
    public var KeyType: UInt = 0u,
    public var KeyLength: UShort = 0u,
    public var KeyValue: Long = 0L,
    public var VerifyKeyType: UInt = 0u,
    public var VerifyKeyLength: UShort = 0u,
    public var VerifyKeyValue: Long = 0L,
)

public data class SecPkgContext_NegoPackageInfo(public var PackageMask: UInt = 0u)

public data class SecPkgContext_NegoStatus(public var LastStatus: UInt = 0u)

public data class SecPkgContext_NegotiatedTlsExtensions(public var ExtensionsCount: UInt = 0u, public var Extensions: Long = 0L)

public data class SecPkgContext_NegotiationInfoA(public var PackageInfo: Long = 0L, public var NegotiationState: UInt = 0u)

public data class SecPkgContext_NegotiationInfoW(public var PackageInfo: Long = 0L, public var NegotiationState: UInt = 0u)

public data class SecPkgContext_PackageInfoA(public var PackageInfo: Long = 0L)

public data class SecPkgContext_PackageInfoW(public var PackageInfo: Long = 0L)

public data class SecPkgContext_PasswordExpiry(public var tsPasswordExpires: Long = 0L)

public data class SecPkgContext_ProtoInfoA(
    public var sProtocolName: Long = 0L,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
)

public data class SecPkgContext_ProtoInfoW(
    public var sProtocolName: Long = 0L,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
)

public data class SecPkgContext_RemoteCredentialInfo(
    public var cbCertificateChain: UInt = 0u,
    public var pbCertificateChain: Long = 0L,
    public var cCertificates: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var dwBits: UInt = 0u,
)

public data class SecPkgContext_SaslContext(public var SaslContext: Long = 0L)

public data class SecPkgContext_SessionAppData(
    public var dwFlags: UInt = 0u,
    public var cbAppData: UInt = 0u,
    public var pbAppData: Long = 0L,
)

public data class SecPkgContext_SessionInfo(
    public var dwFlags: UInt = 0u,
    public var cbSessionId: UInt = 0u,
    public var rgbSessionId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContext_SessionInfo) return false
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

public data class SecPkgContext_SessionKey(public var SessionKeyLength: UInt = 0u, public var SessionKey: Long = 0L)

public data class SecPkgContext_Sizes(
    public var cbMaxToken: UInt = 0u,
    public var cbMaxSignature: UInt = 0u,
    public var cbBlockSize: UInt = 0u,
    public var cbSecurityTrailer: UInt = 0u,
)

public data class SecPkgContext_SrtpParameters(
    public var ProtectionProfile: UShort = 0u,
    public var MasterKeyIdentifierSize: UByte = 0u,
    public var MasterKeyIdentifier: Long = 0L,
)

public data class SecPkgContext_StreamSizes(
    public var cbHeader: UInt = 0u,
    public var cbTrailer: UInt = 0u,
    public var cbMaximumMessage: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var cbBlockSize: UInt = 0u,
)

public data class SecPkgContext_SubjectAttributes(public var AttributeInfo: Long = 0L)

public data class SecPkgContext_SupportedSignatures(public var cSignatureAndHashAlgorithms: UShort = 0u, public var pSignatureAndHashAlgorithms: Long = 0L)

public data class SecPkgContext_Target(public var TargetLength: UInt = 0u, public var Target: PSTR = 0L)

public data class SecPkgContext_TargetInformation(public var MarshalledTargetInfoLength: UInt = 0u, public var MarshalledTargetInfo: Long = 0L)

public data class SecPkgContext_TokenBinding(
    public var MajorVersion: UByte = 0u,
    public var MinorVersion: UByte = 0u,
    public var KeyParametersSize: UShort = 0u,
    public var KeyParameters: Long = 0L,
)

public data class SecPkgContext_UiInfo(public var hParentWindow: Foundation.HWND = Foundation.HWND())

public data class SecPkgContext_UserFlags(public var UserFlags: UInt = 0u)

public data class SecPkgCred_CipherStrengths(public var dwMinimumCipherStrength: UInt = 0u, public var dwMaximumCipherStrength: UInt = 0u)

public data class SecPkgCred_ClientCertPolicy(
    public var dwFlags: UInt = 0u,
    public var guidPolicyId: GUID = GUID(),
    public var dwCertFlags: UInt = 0u,
    public var dwUrlRetrievalTimeout: UInt = 0u,
    public var fCheckRevocationFreshnessTime: BOOL = 0,
    public var dwRevocationFreshnessTime: UInt = 0u,
    public var fOmitUsageCheck: BOOL = 0,
    public var pwszSslCtlStoreName: PWSTR = 0L,
    public var pwszSslCtlIdentifier: PWSTR = 0L,
)

public data class SecPkgCred_SessionTicketKey(
    public var TicketInfoVersion: UInt = 0u,
    public var KeyId: UByteArray = UByteArray(16),
    public var KeyingMaterial: UByteArray = UByteArray(64),
    public var KeyingMaterialSize: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgCred_SessionTicketKey) return false
        if (this.TicketInfoVersion != other.TicketInfoVersion) return false
        if (!this.KeyId.contentEquals(other.KeyId)) return false
        if (!this.KeyingMaterial.contentEquals(other.KeyingMaterial)) return false
        if (this.KeyingMaterialSize != other.KeyingMaterialSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TicketInfoVersion.hashCode()
        result = 31 * result + this.KeyId.contentHashCode()
        result = 31 * result + this.KeyingMaterial.contentHashCode()
        result = 31 * result + this.KeyingMaterialSize.hashCode()
        return result
    }
}

public data class SecPkgCred_SessionTicketKeys(public var cSessionTicketKeys: UInt = 0u, public var pSessionTicketKeys: Long = 0L)

public data class SecPkgCred_SupportedAlgs(public var cSupportedAlgs: UInt = 0u, public var palgSupportedAlgs: Long = 0L)

public data class SecPkgCred_SupportedProtocols(public var grbitProtocol: UInt = 0u)

public data class SecPkgCredentials_Cert(public var EncodedCertSize: UInt = 0u, public var EncodedCert: Long = 0L)

public data class SecPkgCredentials_KdcProxySettingsW(
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ProxyServerOffset: UShort = 0u,
    public var ProxyServerLength: UShort = 0u,
    public var ClientTlsCredOffset: UShort = 0u,
    public var ClientTlsCredLength: UShort = 0u,
)

public data class SecPkgCredentials_NamesA(public var sUserName: Long = 0L)

public data class SecPkgCredentials_NamesW(public var sUserName: Long = 0L)

public data class SecPkgCredentials_SSIProviderA(
    public var sProviderName: Long = 0L,
    public var ProviderInfoLength: UInt = 0u,
    public var ProviderInfo: PSTR = 0L,
)

public data class SecPkgCredentials_SSIProviderW(
    public var sProviderName: Long = 0L,
    public var ProviderInfoLength: UInt = 0u,
    public var ProviderInfo: PSTR = 0L,
)

public data class SecPkgInfoA(
    public var fCapabilities: UInt = 0u,
    public var wVersion: UShort = 0u,
    public var wRPCID: UShort = 0u,
    public var cbMaxToken: UInt = 0u,
    public var Name: Long = 0L,
    public var Comment: Long = 0L,
)

public data class SecPkgInfoW(
    public var fCapabilities: UInt = 0u,
    public var wVersion: UShort = 0u,
    public var wRPCID: UShort = 0u,
    public var cbMaxToken: UInt = 0u,
    public var Name: Long = 0L,
    public var Comment: Long = 0L,
)

public class SecurityFunctionTableA(
    public var dwVersion: UInt = 0u,
    public var EnumerateSecurityPackagesA: ENUMERATE_SECURITY_PACKAGES_FN_A = null,
    public var QueryCredentialsAttributesA: QUERY_CREDENTIALS_ATTRIBUTES_FN_A = null,
    public var AcquireCredentialsHandleA: ACQUIRE_CREDENTIALS_HANDLE_FN_A = null,
    public var FreeCredentialsHandle: FREE_CREDENTIALS_HANDLE_FN = null,
    public var Reserved2: Long = 0L,
    public var InitializeSecurityContextA: INITIALIZE_SECURITY_CONTEXT_FN_A = null,
    public var AcceptSecurityContext: ACCEPT_SECURITY_CONTEXT_FN = null,
    public var CompleteAuthToken: COMPLETE_AUTH_TOKEN_FN = null,
    public var DeleteSecurityContext: DELETE_SECURITY_CONTEXT_FN = null,
    public var ApplyControlToken: APPLY_CONTROL_TOKEN_FN = null,
    public var QueryContextAttributesA: QUERY_CONTEXT_ATTRIBUTES_FN_A = null,
    public var ImpersonateSecurityContext: IMPERSONATE_SECURITY_CONTEXT_FN = null,
    public var RevertSecurityContext: REVERT_SECURITY_CONTEXT_FN = null,
    public var MakeSignature: MAKE_SIGNATURE_FN = null,
    public var VerifySignature: VERIFY_SIGNATURE_FN = null,
    public var FreeContextBuffer: FREE_CONTEXT_BUFFER_FN = null,
    public var QuerySecurityPackageInfoA: QUERY_SECURITY_PACKAGE_INFO_FN_A = null,
    public var Reserved3: Long = 0L,
    public var Reserved4: Long = 0L,
    public var ExportSecurityContext: EXPORT_SECURITY_CONTEXT_FN = null,
    public var ImportSecurityContextA: IMPORT_SECURITY_CONTEXT_FN_A = null,
    public var AddCredentialsA: ADD_CREDENTIALS_FN_A = null,
    public var Reserved8: Long = 0L,
    public var QuerySecurityContextToken: QUERY_SECURITY_CONTEXT_TOKEN_FN = null,
    public var EncryptMessage: ENCRYPT_MESSAGE_FN = null,
    public var DecryptMessage: DECRYPT_MESSAGE_FN = null,
    public var SetContextAttributesA: SET_CONTEXT_ATTRIBUTES_FN_A = null,
    public var SetCredentialsAttributesA: SET_CREDENTIALS_ATTRIBUTES_FN_A = null,
    public var ChangeAccountPasswordA: CHANGE_PASSWORD_FN_A = null,
    public var QueryContextAttributesExA: QUERY_CONTEXT_ATTRIBUTES_EX_FN_A = null,
    public var QueryCredentialsAttributesExA: QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_A = null,
)

public class SecurityFunctionTableW(
    public var dwVersion: UInt = 0u,
    public var EnumerateSecurityPackagesW: ENUMERATE_SECURITY_PACKAGES_FN_W = null,
    public var QueryCredentialsAttributesW: QUERY_CREDENTIALS_ATTRIBUTES_FN_W = null,
    public var AcquireCredentialsHandleW: ACQUIRE_CREDENTIALS_HANDLE_FN_W = null,
    public var FreeCredentialsHandle: FREE_CREDENTIALS_HANDLE_FN = null,
    public var Reserved2: Long = 0L,
    public var InitializeSecurityContextW: INITIALIZE_SECURITY_CONTEXT_FN_W = null,
    public var AcceptSecurityContext: ACCEPT_SECURITY_CONTEXT_FN = null,
    public var CompleteAuthToken: COMPLETE_AUTH_TOKEN_FN = null,
    public var DeleteSecurityContext: DELETE_SECURITY_CONTEXT_FN = null,
    public var ApplyControlToken: APPLY_CONTROL_TOKEN_FN = null,
    public var QueryContextAttributesW: QUERY_CONTEXT_ATTRIBUTES_FN_W = null,
    public var ImpersonateSecurityContext: IMPERSONATE_SECURITY_CONTEXT_FN = null,
    public var RevertSecurityContext: REVERT_SECURITY_CONTEXT_FN = null,
    public var MakeSignature: MAKE_SIGNATURE_FN = null,
    public var VerifySignature: VERIFY_SIGNATURE_FN = null,
    public var FreeContextBuffer: FREE_CONTEXT_BUFFER_FN = null,
    public var QuerySecurityPackageInfoW: QUERY_SECURITY_PACKAGE_INFO_FN_W = null,
    public var Reserved3: Long = 0L,
    public var Reserved4: Long = 0L,
    public var ExportSecurityContext: EXPORT_SECURITY_CONTEXT_FN = null,
    public var ImportSecurityContextW: IMPORT_SECURITY_CONTEXT_FN_W = null,
    public var AddCredentialsW: ADD_CREDENTIALS_FN_W = null,
    public var Reserved8: Long = 0L,
    public var QuerySecurityContextToken: QUERY_SECURITY_CONTEXT_TOKEN_FN = null,
    public var EncryptMessage: ENCRYPT_MESSAGE_FN = null,
    public var DecryptMessage: DECRYPT_MESSAGE_FN = null,
    public var SetContextAttributesW: SET_CONTEXT_ATTRIBUTES_FN_W = null,
    public var SetCredentialsAttributesW: SET_CREDENTIALS_ATTRIBUTES_FN_W = null,
    public var ChangeAccountPasswordW: CHANGE_PASSWORD_FN_W = null,
    public var QueryContextAttributesExW: QUERY_CONTEXT_ATTRIBUTES_EX_FN_W = null,
    public var QueryCredentialsAttributesExW: QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_W = null,
)

public data class TLS_EXTENSION_SUBSCRIPTION(public var ExtensionType: UShort = 0u, public var HandshakeType: UShort = 0u)

public data class TLS_PARAMETERS(
    public var cAlpnIds: UInt = 0u,
    public var rgstrAlpnIds: Long = 0L,
    public var grbitDisabledProtocols: UInt = 0u,
    public var cDisabledCrypto: UInt = 0u,
    public var pDisabledCrypto: Long = 0L,
    public var dwFlags: UInt = 0u,
)

public data class TOKENBINDING_IDENTIFIER(public var keyType: UByte = 0u)

public data class TOKENBINDING_KEY_TYPES(public var keyCount: UInt = 0u, public var keyType: Long = 0L)

public data class TOKENBINDING_RESULT_DATA(
    public var bindingType: TOKENBINDING_TYPE = 0,
    public var identifierSize: UInt = 0u,
    public var identifierData: Long = 0L,
    public var extensionFormat: TOKENBINDING_EXTENSION_FORMAT = 0,
    public var extensionSize: UInt = 0u,
    public var extensionData: Long = 0L,
)

public data class TOKENBINDING_RESULT_LIST(public var resultCount: UInt = 0u, public var resultData: Long = 0L)

public data class TRUSTED_CONTROLLERS_INFO(public var Entries: UInt = 0u, public var Names: Long = 0L)

public data class TRUSTED_DOMAIN_AUTH_INFORMATION(
    public var IncomingAuthInfos: UInt = 0u,
    public var IncomingAuthenticationInformation: Long = 0L,
    public var IncomingPreviousAuthenticationInformation: Long = 0L,
    public var OutgoingAuthInfos: UInt = 0u,
    public var OutgoingAuthenticationInformation: Long = 0L,
    public var OutgoingPreviousAuthenticationInformation: Long = 0L,
)

public data class TRUSTED_DOMAIN_FULL_INFORMATION(
    public var Information: TRUSTED_DOMAIN_INFORMATION_EX = TRUSTED_DOMAIN_INFORMATION_EX(),
    public var PosixOffset: TRUSTED_POSIX_OFFSET_INFO = TRUSTED_POSIX_OFFSET_INFO(),
    public var AuthInformation: TRUSTED_DOMAIN_AUTH_INFORMATION = TRUSTED_DOMAIN_AUTH_INFORMATION(),
)

public data class TRUSTED_DOMAIN_FULL_INFORMATION2(
    public var Information: TRUSTED_DOMAIN_INFORMATION_EX2 = TRUSTED_DOMAIN_INFORMATION_EX2(),
    public var PosixOffset: TRUSTED_POSIX_OFFSET_INFO = TRUSTED_POSIX_OFFSET_INFO(),
    public var AuthInformation: TRUSTED_DOMAIN_AUTH_INFORMATION = TRUSTED_DOMAIN_AUTH_INFORMATION(),
)

public data class TRUSTED_DOMAIN_INFORMATION_EX(
    public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var FlatName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Sid: PSID = 0L,
    public var TrustDirection: TRUSTED_DOMAIN_TRUST_DIRECTION = 0u,
    public var TrustType: TRUSTED_DOMAIN_TRUST_TYPE = 0u,
    public var TrustAttributes: TRUSTED_DOMAIN_TRUST_ATTRIBUTES = 0u,
)

public data class TRUSTED_DOMAIN_INFORMATION_EX2(
    public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var FlatName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Sid: PSID = 0L,
    public var TrustDirection: UInt = 0u,
    public var TrustType: UInt = 0u,
    public var TrustAttributes: UInt = 0u,
    public var ForestTrustLength: UInt = 0u,
    public var ForestTrustInfo: Long = 0L,
)

public data class TRUSTED_DOMAIN_NAME_INFO(public var Name: LSA_UNICODE_STRING = LSA_UNICODE_STRING())

public data class TRUSTED_DOMAIN_SUPPORTED_ENCRYPTION_TYPES(public var SupportedEncryptionTypes: UInt = 0u)

public data class TRUSTED_PASSWORD_INFO(public var Password: LSA_UNICODE_STRING = LSA_UNICODE_STRING(), public var OldPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING())

public data class TRUSTED_POSIX_OFFSET_INFO(public var Offset: UInt = 0u)

public class USER_ALL_INFORMATION(
    public var LastLogon: Long = 0L,
    public var LastLogoff: Long = 0L,
    public var PasswordLastSet: Long = 0L,
    public var AccountExpires: Long = 0L,
    public var PasswordCanChange: Long = 0L,
    public var PasswordMustChange: Long = 0L,
    public var UserName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var FullName: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectory: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var HomeDirectoryDrive: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ScriptPath: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var ProfilePath: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var AdminComment: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var WorkStations: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var UserComment: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var Parameters: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var LmPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var NtPassword: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var PrivateData: LSA_UNICODE_STRING = LSA_UNICODE_STRING(),
    public var SecurityDescriptor: SR_SECURITY_DESCRIPTOR = SR_SECURITY_DESCRIPTOR(),
    public var UserId: UInt = 0u,
    public var PrimaryGroupId: UInt = 0u,
    public var UserAccountControl: UInt = 0u,
    public var WhichFields: UInt = 0u,
    public var LogonHours: LOGON_HOURS = LOGON_HOURS(),
    public var BadPasswordCount: UShort = 0u,
    public var LogonCount: UShort = 0u,
    public var CountryCode: UShort = 0u,
    public var CodePage: UShort = 0u,
    public var LmPasswordPresent: Boolean = false,
    public var NtPasswordPresent: Boolean = false,
    public var PasswordExpired: Boolean = false,
    public var PrivateDataSensitive: Boolean = false,
)

public data class USER_SESSION_KEY(public var data: List<System.PasswordManagement.CYPHER_BLOCK> = List(2) { System.PasswordManagement.CYPHER_BLOCK() })

public data class X509Certificate(
    public var Version: UInt = 0u,
    public var SerialNumber: UIntArray = UIntArray(4),
    public var SignatureAlgorithm: Cryptography.ALG_ID = Cryptography.ALG_ID(),
    public var ValidFrom: Foundation.FILETIME = Foundation.FILETIME(),
    public var ValidUntil: Foundation.FILETIME = Foundation.FILETIME(),
    public var pszIssuer: PSTR = 0L,
    public var pszSubject: PSTR = 0L,
    public var pPublicKey: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is X509Certificate) return false
        if (this.Version != other.Version) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        if (this.SignatureAlgorithm != other.SignatureAlgorithm) return false
        if (this.ValidFrom != other.ValidFrom) return false
        if (this.ValidUntil != other.ValidUntil) return false
        if (this.pszIssuer != other.pszIssuer) return false
        if (this.pszSubject != other.pszSubject) return false
        if (this.pPublicKey != other.pPublicKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        result = 31 * result + this.SignatureAlgorithm.hashCode()
        result = 31 * result + this.ValidFrom.hashCode()
        result = 31 * result + this.ValidUntil.hashCode()
        result = 31 * result + this.pszIssuer.hashCode()
        result = 31 * result + this.pszSubject.hashCode()
        result = 31 * result + this.pPublicKey.hashCode()
        return result
    }
}
