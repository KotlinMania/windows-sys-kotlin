package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.DECIMAL
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.NCRYPT_KEY_HANDLE

public data class CTAPCBOR_HYBRID_STORAGE_LINKED_DATA(
    public var dwVersion: UInt = 0u,
    public var cbContactId: UInt = 0u,
    public var pbContactId: Long = 0L,
    public var cbLinkId: UInt = 0u,
    public var pbLinkId: Long = 0L,
    public var cbLinkSecret: UInt = 0u,
    public var pbLinkSecret: Long = 0L,
    public var cbPublicKey: UInt = 0u,
    public var pbPublicKey: Long = 0L,
    public var pwszAuthenticatorName: PCWSTR = 0L,
    public var wEncodedTunnelServerDomain: UShort = 0u,
)

public data class WEBAUTHN_ASSERTION(
    public var dwVersion: UInt = 0u,
    public var cbAuthenticatorData: UInt = 0u,
    public var pbAuthenticatorData: Long = 0L,
    public var cbSignature: UInt = 0u,
    public var pbSignature: Long = 0L,
    public var Credential: WEBAUTHN_CREDENTIAL = WEBAUTHN_CREDENTIAL(),
    public var cbUserId: UInt = 0u,
    public var pbUserId: Long = 0L,
    public var Extensions: WEBAUTHN_EXTENSIONS = WEBAUTHN_EXTENSIONS(),
    public var cbCredLargeBlob: UInt = 0u,
    public var pbCredLargeBlob: Long = 0L,
    public var dwCredLargeBlobStatus: UInt = 0u,
    public var pHmacSecret: Long = 0L,
    public var dwUsedTransport: UInt = 0u,
    public var cbUnsignedExtensionOutputs: UInt = 0u,
    public var pbUnsignedExtensionOutputs: Long = 0L,
)

public class WEBAUTHN_AUTHENTICATOR_GET_ASSERTION_OPTIONS(
    public var dwVersion: UInt = 0u,
    public var dwTimeoutMilliseconds: UInt = 0u,
    public var CredentialList: WEBAUTHN_CREDENTIALS = WEBAUTHN_CREDENTIALS(),
    public var Extensions: WEBAUTHN_EXTENSIONS = WEBAUTHN_EXTENSIONS(),
    public var dwAuthenticatorAttachment: UInt = 0u,
    public var dwUserVerificationRequirement: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwszU2fAppId: PCWSTR = 0L,
    public var pbU2fAppId: Long = 0L,
    public var pCancellationId: Long = 0L,
    public var pAllowCredentialList: Long = 0L,
    public var dwCredLargeBlobOperation: UInt = 0u,
    public var cbCredLargeBlob: UInt = 0u,
    public var pbCredLargeBlob: Long = 0L,
    public var pHmacSecretSaltValues: Long = 0L,
    public var bBrowserInPrivateMode: BOOL = 0,
    public var pLinkedDevice: Long = 0L,
    public var bAutoFill: BOOL = 0,
    public var cbJsonExt: UInt = 0u,
    public var pbJsonExt: Long = 0L,
)

public class WEBAUTHN_AUTHENTICATOR_MAKE_CREDENTIAL_OPTIONS(
    public var dwVersion: UInt = 0u,
    public var dwTimeoutMilliseconds: UInt = 0u,
    public var CredentialList: WEBAUTHN_CREDENTIALS = WEBAUTHN_CREDENTIALS(),
    public var Extensions: WEBAUTHN_EXTENSIONS = WEBAUTHN_EXTENSIONS(),
    public var dwAuthenticatorAttachment: UInt = 0u,
    public var bRequireResidentKey: BOOL = 0,
    public var dwUserVerificationRequirement: UInt = 0u,
    public var dwAttestationConveyancePreference: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pCancellationId: Long = 0L,
    public var pExcludeCredentialList: Long = 0L,
    public var dwEnterpriseAttestation: UInt = 0u,
    public var dwLargeBlobSupport: UInt = 0u,
    public var bPreferResidentKey: BOOL = 0,
    public var bBrowserInPrivateMode: BOOL = 0,
    public var bEnablePrf: BOOL = 0,
    public var pLinkedDevice: Long = 0L,
    public var cbJsonExt: UInt = 0u,
    public var pbJsonExt: Long = 0L,
)

public data class WEBAUTHN_CLIENT_DATA(
    public var dwVersion: UInt = 0u,
    public var cbClientDataJSON: UInt = 0u,
    public var pbClientDataJSON: Long = 0L,
    public var pwszHashAlgId: PCWSTR = 0L,
)

public data class WEBAUTHN_COMMON_ATTESTATION(
    public var dwVersion: UInt = 0u,
    public var pwszAlg: PCWSTR = 0L,
    public var lAlg: Int = 0,
    public var cbSignature: UInt = 0u,
    public var pbSignature: Long = 0L,
    public var cX5c: UInt = 0u,
    public var pX5c: Long = 0L,
    public var pwszVer: PCWSTR = 0L,
    public var cbCertInfo: UInt = 0u,
    public var pbCertInfo: Long = 0L,
    public var cbPubArea: UInt = 0u,
    public var pbPubArea: Long = 0L,
)

public data class WEBAUTHN_COSE_CREDENTIAL_PARAMETER(
    public var dwVersion: UInt = 0u,
    public var pwszCredentialType: PCWSTR = 0L,
    public var lAlg: Int = 0,
)

public data class WEBAUTHN_COSE_CREDENTIAL_PARAMETERS(public var cCredentialParameters: UInt = 0u, public var pCredentialParameters: Long = 0L)

public data class WEBAUTHN_CREDENTIAL(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var pbId: Long = 0L,
    public var pwszCredentialType: PCWSTR = 0L,
)

public data class WEBAUTHN_CREDENTIALS(public var cCredentials: UInt = 0u, public var pCredentials: Long = 0L)

public class WEBAUTHN_CREDENTIAL_ATTESTATION(
    public var dwVersion: UInt = 0u,
    public var pwszFormatType: PCWSTR = 0L,
    public var cbAuthenticatorData: UInt = 0u,
    public var pbAuthenticatorData: Long = 0L,
    public var cbAttestation: UInt = 0u,
    public var pbAttestation: Long = 0L,
    public var dwAttestationDecodeType: UInt = 0u,
    public var pvAttestationDecode: Long = 0L,
    public var cbAttestationObject: UInt = 0u,
    public var pbAttestationObject: Long = 0L,
    public var cbCredentialId: UInt = 0u,
    public var pbCredentialId: Long = 0L,
    public var Extensions: WEBAUTHN_EXTENSIONS = WEBAUTHN_EXTENSIONS(),
    public var dwUsedTransport: UInt = 0u,
    public var bEpAtt: BOOL = 0,
    public var bLargeBlobSupported: BOOL = 0,
    public var bResidentKey: BOOL = 0,
    public var bPrfEnabled: BOOL = 0,
    public var cbUnsignedExtensionOutputs: UInt = 0u,
    public var pbUnsignedExtensionOutputs: Long = 0L,
)

public data class WEBAUTHN_CREDENTIAL_DETAILS(
    public var dwVersion: UInt = 0u,
    public var cbCredentialID: UInt = 0u,
    public var pbCredentialID: Long = 0L,
    public var pRpInformation: Long = 0L,
    public var pUserInformation: Long = 0L,
    public var bRemovable: BOOL = 0,
    public var bBackedUp: BOOL = 0,
)

public data class WEBAUTHN_CREDENTIAL_DETAILS_LIST(public var cCredentialDetails: UInt = 0u, public var ppCredentialDetails: Long = 0L)

public data class WEBAUTHN_CREDENTIAL_EX(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var pbId: Long = 0L,
    public var pwszCredentialType: PCWSTR = 0L,
    public var dwTransports: UInt = 0u,
)

public data class WEBAUTHN_CREDENTIAL_LIST(public var cCredentials: UInt = 0u, public var ppCredentials: Long = 0L)

public data class WEBAUTHN_CRED_BLOB_EXTENSION(public var cbCredBlob: UInt = 0u, public var pbCredBlob: Long = 0L)

public data class WEBAUTHN_CRED_PROTECT_EXTENSION_IN(public var dwCredProtect: UInt = 0u, public var bRequireCredProtect: BOOL = 0)

public data class WEBAUTHN_CRED_WITH_HMAC_SECRET_SALT(
    public var cbCredID: UInt = 0u,
    public var pbCredID: Long = 0L,
    public var pHmacSecretSalt: Long = 0L,
)

public data class WEBAUTHN_EXTENSION(
    public var pwszExtensionIdentifier: PCWSTR = 0L,
    public var cbExtension: UInt = 0u,
    public var pvExtension: Long = 0L,
)

public data class WEBAUTHN_EXTENSIONS(public var cExtensions: UInt = 0u, public var pExtensions: Long = 0L)

public data class WEBAUTHN_GET_CREDENTIALS_OPTIONS(
    public var dwVersion: UInt = 0u,
    public var pwszRpId: PCWSTR = 0L,
    public var bBrowserInPrivateMode: BOOL = 0,
)

public data class WEBAUTHN_HMAC_SECRET_SALT(
    public var cbFirst: UInt = 0u,
    public var pbFirst: Long = 0L,
    public var cbSecond: UInt = 0u,
    public var pbSecond: Long = 0L,
)

public data class WEBAUTHN_HMAC_SECRET_SALT_VALUES(
    public var pGlobalHmacSalt: Long = 0L,
    public var cCredWithHmacSecretSaltList: UInt = 0u,
    public var pCredWithHmacSecretSaltList: Long = 0L,
)

public data class WEBAUTHN_RP_ENTITY_INFORMATION(
    public var dwVersion: UInt = 0u,
    public var pwszId: PCWSTR = 0L,
    public var pwszName: PCWSTR = 0L,
    public var pwszIcon: PCWSTR = 0L,
)

public data class WEBAUTHN_USER_ENTITY_INFORMATION(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var pbId: Long = 0L,
    public var pwszName: PCWSTR = 0L,
    public var pwszIcon: PCWSTR = 0L,
    public var pwszDisplayName: PCWSTR = 0L,
)

public data class WEBAUTHN_X5C(public var cbData: UInt = 0u, public var pbData: Long = 0L)

public data class WS_ANY_ATTRIBUTE(
    public var localName: WS_XML_STRING = WS_XML_STRING(),
    public var ns: WS_XML_STRING = WS_XML_STRING(),
    public var value: Long = 0L,
)

public data class WS_ANY_ATTRIBUTES(public var attributes: Long = 0L, public var attributeCount: UInt = 0u)

public data class WS_ASYNC_CONTEXT(public var callback: WS_ASYNC_CALLBACK = null, public var callbackState: Long = 0L)

public data class WS_ASYNC_OPERATION(public var function: WS_ASYNC_FUNCTION = null)

public data class WS_ASYNC_STATE(
    public var internal0: Long = 0L,
    public var internal1: Long = 0L,
    public var internal2: Long = 0L,
    public var internal3: Long = 0L,
    public var internal4: Long = 0L,
)

public data class WS_ATTRIBUTE_DESCRIPTION(
    public var attributeLocalName: Long = 0L,
    public var attributeNs: Long = 0L,
    public var type: WS_TYPE = 0,
    public var typeDescription: Long = 0L,
)

public data class WS_BOOL_DESCRIPTION(public var value: BOOL = 0)

public data class WS_BUFFERS(public var bufferCount: UInt = 0u, public var buffers: Long = 0L)

public data class WS_BYTES(public var length: UInt = 0u, public var bytes: Long = 0L)

public data class WS_BYTES_DESCRIPTION(public var minByteCount: UInt = 0u, public var maxByteCount: UInt = 0u)

public data class WS_BYTE_ARRAY_DESCRIPTION(public var minByteCount: UInt = 0u, public var maxByteCount: UInt = 0u)

public data class WS_CALL_PROPERTY(
    public var id: WS_CALL_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_CAPI_ASYMMETRIC_SECURITY_KEY_HANDLE(
    public var keyHandle: WS_SECURITY_KEY_HANDLE = WS_SECURITY_KEY_HANDLE(),
    public var provider: ULong = 0uL,
    public var keySpec: UInt = 0u,
)

public data class WS_CERTIFICATE_VALIDATION_CALLBACK_CONTEXT(public var callback: WS_CERTIFICATE_VALIDATION_CALLBACK = null, public var state: Long = 0L)

public data class WS_CERT_CREDENTIAL(public var credentialType: WS_CERT_CREDENTIAL_TYPE = 0)

public data class WS_CERT_ENDPOINT_IDENTITY(public var identity: WS_ENDPOINT_IDENTITY = WS_ENDPOINT_IDENTITY(), public var rawCertificateData: WS_BYTES = WS_BYTES())

public data class WS_CERT_MESSAGE_SECURITY_BINDING_CONSTRAINT(public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT(), public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0)

public data class WS_CERT_SIGNED_SAML_AUTHENTICATOR(
    public var authenticator: WS_SAML_AUTHENTICATOR = WS_SAML_AUTHENTICATOR(),
    public var trustedIssuerCerts: Long = 0L,
    public var trustedIssuerCertCount: UInt = 0u,
    public var decryptionCert: Long = 0L,
    public var samlValidator: WS_VALIDATE_SAML_CALLBACK = null,
    public var samlValidatorCallbackState: Long = 0L,
)

public data class WS_CHANNEL_DECODER(
    public var createContext: Long = 0L,
    public var createDecoderCallback: WS_CREATE_DECODER_CALLBACK = null,
    public var decoderGetContentTypeCallback: WS_DECODER_GET_CONTENT_TYPE_CALLBACK = null,
    public var decoderStartCallback: WS_DECODER_START_CALLBACK = null,
    public var decoderDecodeCallback: WS_DECODER_DECODE_CALLBACK = null,
    public var decoderEndCallback: WS_DECODER_END_CALLBACK = null,
    public var freeDecoderCallback: WS_FREE_DECODER_CALLBACK = null,
)

public data class WS_CHANNEL_ENCODER(
    public var createContext: Long = 0L,
    public var createEncoderCallback: WS_CREATE_ENCODER_CALLBACK = null,
    public var encoderGetContentTypeCallback: WS_ENCODER_GET_CONTENT_TYPE_CALLBACK = null,
    public var encoderStartCallback: WS_ENCODER_START_CALLBACK = null,
    public var encoderEncodeCallback: WS_ENCODER_ENCODE_CALLBACK = null,
    public var encoderEndCallback: WS_ENCODER_END_CALLBACK = null,
    public var freeEncoderCallback: WS_FREE_ENCODER_CALLBACK = null,
)

public data class WS_CHANNEL_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_CHANNEL_PROPERTY(
    public var id: WS_CHANNEL_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_CHANNEL_PROPERTY_CONSTRAINT(
    public var id: WS_CHANNEL_PROPERTY_ID = 0,
    public var allowedValues: Long = 0L,
    public var allowedValuesSize: UInt = 0u,
    public var out: WS_CHANNEL_PROPERTY_CONSTRAINT_0 = WS_CHANNEL_PROPERTY_CONSTRAINT_0(),
)

public data class WS_CHANNEL_PROPERTY_CONSTRAINT_0(public var channelProperty: WS_CHANNEL_PROPERTY = WS_CHANNEL_PROPERTY())

public data class WS_CHAR_ARRAY_DESCRIPTION(public var minCharCount: UInt = 0u, public var maxCharCount: UInt = 0u)

public data class WS_CONTRACT_DESCRIPTION(public var operationCount: UInt = 0u, public var operations: Long = 0L)

public data class WS_CUSTOM_CERT_CREDENTIAL(
    public var credential: WS_CERT_CREDENTIAL = WS_CERT_CREDENTIAL(),
    public var getCertCallback: WS_GET_CERT_CALLBACK = null,
    public var getCertCallbackState: Long = 0L,
    public var certIssuerListNotificationCallback: WS_CERT_ISSUER_LIST_NOTIFICATION_CALLBACK = null,
    public var certIssuerListNotificationCallbackState: Long = 0L,
)

public data class WS_CUSTOM_CHANNEL_CALLBACKS(
    public var createChannelCallback: WS_CREATE_CHANNEL_CALLBACK = null,
    public var freeChannelCallback: WS_FREE_CHANNEL_CALLBACK = null,
    public var resetChannelCallback: WS_RESET_CHANNEL_CALLBACK = null,
    public var openChannelCallback: WS_OPEN_CHANNEL_CALLBACK = null,
    public var closeChannelCallback: WS_CLOSE_CHANNEL_CALLBACK = null,
    public var abortChannelCallback: WS_ABORT_CHANNEL_CALLBACK = null,
    public var getChannelPropertyCallback: WS_GET_CHANNEL_PROPERTY_CALLBACK = null,
    public var setChannelPropertyCallback: WS_SET_CHANNEL_PROPERTY_CALLBACK = null,
    public var writeMessageStartCallback: WS_WRITE_MESSAGE_START_CALLBACK = null,
    public var writeMessageEndCallback: WS_WRITE_MESSAGE_END_CALLBACK = null,
    public var readMessageStartCallback: WS_READ_MESSAGE_START_CALLBACK = null,
    public var readMessageEndCallback: WS_READ_MESSAGE_END_CALLBACK = null,
    public var abandonMessageCallback: WS_ABANDON_MESSAGE_CALLBACK = null,
    public var shutdownSessionChannelCallback: WS_SHUTDOWN_SESSION_CHANNEL_CALLBACK = null,
)

public data class WS_CUSTOM_HTTP_PROXY(public var servers: WS_STRING = WS_STRING(), public var bypass: WS_STRING = WS_STRING())

public data class WS_CUSTOM_LISTENER_CALLBACKS(
    public var createListenerCallback: WS_CREATE_LISTENER_CALLBACK = null,
    public var freeListenerCallback: WS_FREE_LISTENER_CALLBACK = null,
    public var resetListenerCallback: WS_RESET_LISTENER_CALLBACK = null,
    public var openListenerCallback: WS_OPEN_LISTENER_CALLBACK = null,
    public var closeListenerCallback: WS_CLOSE_LISTENER_CALLBACK = null,
    public var abortListenerCallback: WS_ABORT_LISTENER_CALLBACK = null,
    public var getListenerPropertyCallback: WS_GET_LISTENER_PROPERTY_CALLBACK = null,
    public var setListenerPropertyCallback: WS_SET_LISTENER_PROPERTY_CALLBACK = null,
    public var createChannelForListenerCallback: WS_CREATE_CHANNEL_FOR_LISTENER_CALLBACK = null,
    public var acceptChannelCallback: WS_ACCEPT_CHANNEL_CALLBACK = null,
)

public data class WS_CUSTOM_TYPE_DESCRIPTION(
    public var size: UInt = 0u,
    public var alignment: UInt = 0u,
    public var readCallback: WS_READ_TYPE_CALLBACK = null,
    public var writeCallback: WS_WRITE_TYPE_CALLBACK = null,
    public var descriptionData: Long = 0L,
    public var isDefaultValueCallback: WS_IS_DEFAULT_VALUE_CALLBACK = null,
)

public data class WS_DATETIME(public var ticks: ULong = 0uL, public var format: WS_DATETIME_FORMAT = 0)

public data class WS_DATETIME_DESCRIPTION(public var minValue: WS_DATETIME = WS_DATETIME(), public var maxValue: WS_DATETIME = WS_DATETIME())

public data class WS_DECIMAL_DESCRIPTION(public var minValue: DECIMAL = DECIMAL(), public var maxValue: DECIMAL = DECIMAL())

public data class WS_DEFAULT_VALUE(public var value: Long = 0L, public var valueSize: UInt = 0u)

public data class WS_DEFAULT_WINDOWS_INTEGRATED_AUTH_CREDENTIAL(public var credential: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL = WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL())

public data class WS_DISALLOWED_USER_AGENT_SUBSTRINGS(public var subStringCount: UInt = 0u, public var subStrings: Long = 0L)

public data class WS_DNS_ENDPOINT_IDENTITY(public var identity: WS_ENDPOINT_IDENTITY = WS_ENDPOINT_IDENTITY(), public var dns: WS_STRING = WS_STRING())

public data class WS_DOUBLE_DESCRIPTION(public var minValue: Double = 0.0, public var maxValue: Double = 0.0)

public data class WS_DURATION(
    public var negative: BOOL = 0,
    public var years: UInt = 0u,
    public var months: UInt = 0u,
    public var days: UInt = 0u,
    public var hours: UInt = 0u,
    public var minutes: UInt = 0u,
    public var seconds: UInt = 0u,
    public var milliseconds: UInt = 0u,
    public var ticks: UInt = 0u,
)

public data class WS_DURATION_DESCRIPTION(
    public var minValue: WS_DURATION = WS_DURATION(),
    public var maxValue: WS_DURATION = WS_DURATION(),
    public var comparer: WS_DURATION_COMPARISON_CALLBACK = null,
)

public data class WS_ELEMENT_DESCRIPTION(
    public var elementLocalName: Long = 0L,
    public var elementNs: Long = 0L,
    public var type: WS_TYPE = 0,
    public var typeDescription: Long = 0L,
)

public data class WS_ENDPOINT_ADDRESS(
    public var url: WS_STRING = WS_STRING(),
    public var headers: Long = 0L,
    public var extensions: Long = 0L,
    public var identity: Long = 0L,
)

public data class WS_ENDPOINT_ADDRESS_DESCRIPTION(public var addressingVersion: WS_ADDRESSING_VERSION = 0)

public data class WS_ENDPOINT_IDENTITY(public var identityType: WS_ENDPOINT_IDENTITY_TYPE = 0)

public data class WS_ENDPOINT_POLICY_EXTENSION(
    public var policyExtension: WS_POLICY_EXTENSION = WS_POLICY_EXTENSION(),
    public var assertionName: Long = 0L,
    public var assertionNs: Long = 0L,
    public var out: WS_ENDPOINT_POLICY_EXTENSION_0 = WS_ENDPOINT_POLICY_EXTENSION_0(),
)

public data class WS_ENDPOINT_POLICY_EXTENSION_0(public var assertionValue: Long = 0L)

public data class WS_ENUM_DESCRIPTION(
    public var values: Long = 0L,
    public var valueCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
    public var nameIndices: Long = 0L,
)

public data class WS_ENUM_VALUE(public var value: Int = 0, public var name: Long = 0L)

public data class WS_ERROR_PROPERTY(
    public var id: WS_ERROR_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_FAULT(
    public var code: Long = 0L,
    public var reasons: Long = 0L,
    public var reasonCount: UInt = 0u,
    public var actor: WS_STRING = WS_STRING(),
    public var node: WS_STRING = WS_STRING(),
    public var detail: Long = 0L,
)

public data class WS_FAULT_CODE(public var value: WS_XML_QNAME = WS_XML_QNAME(), public var subCode: Long = 0L)

public data class WS_FAULT_DESCRIPTION(public var envelopeVersion: WS_ENVELOPE_VERSION = 0)

public data class WS_FAULT_DETAIL_DESCRIPTION(public var action: Long = 0L, public var detailElementDescription: Long = 0L)

public data class WS_FAULT_REASON(public var text: WS_STRING = WS_STRING(), public var lang: WS_STRING = WS_STRING())

public data class WS_FIELD_DESCRIPTION(
    public var mapping: WS_FIELD_MAPPING = 0,
    public var localName: Long = 0L,
    public var ns: Long = 0L,
    public var type: WS_TYPE = 0,
    public var typeDescription: Long = 0L,
    public var offset: UInt = 0u,
    public var options: UInt = 0u,
    public var defaultValue: Long = 0L,
    public var countOffset: UInt = 0u,
    public var itemLocalName: Long = 0L,
    public var itemNs: Long = 0L,
    public var itemRange: Long = 0L,
)

public data class WS_FLOAT_DESCRIPTION(public var minValue: Float = 0.0f, public var maxValue: Float = 0.0f)

public data class WS_GUID_DESCRIPTION(public var value: GUID = GUID())

public data class WS_HEAP_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_HEAP_PROPERTY(
    public var id: WS_HEAP_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_HOST_NAMES(public var hostNames: Long = 0L, public var hostNameCount: UInt = 0u)

public data class WS_HTTPS_URL(
    public var url: WS_URL = WS_URL(),
    public var host: WS_STRING = WS_STRING(),
    public var port: UShort = 0u,
    public var portAsString: WS_STRING = WS_STRING(),
    public var path: WS_STRING = WS_STRING(),
    public var query: WS_STRING = WS_STRING(),
    public var fragment: WS_STRING = WS_STRING(),
)

public data class WS_HTTP_BINDING_TEMPLATE(public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES())

public data class WS_HTTP_HEADER_AUTH_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE = WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_HTTP_HEADER_AUTH_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION = WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_HTTP_HEADER_AUTH_SECURITY_BINDING(public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(), public var clientCredential: Long = 0L)

public data class WS_HTTP_HEADER_AUTH_SECURITY_BINDING_CONSTRAINT(public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT())

public data class WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES())

public data class WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(), public var clientCredential: Long = 0L)

public data class WS_HTTP_HEADER_MAPPING(public var headerName: WS_XML_STRING = WS_XML_STRING(), public var headerMappingOptions: UInt = 0u)

public data class WS_HTTP_MESSAGE_MAPPING(
    public var requestMappingOptions: UInt = 0u,
    public var responseMappingOptions: UInt = 0u,
    public var requestHeaderMappings: Long = 0L,
    public var requestHeaderMappingCount: UInt = 0u,
    public var responseHeaderMappings: Long = 0L,
    public var responseHeaderMappingCount: UInt = 0u,
)

public data class WS_HTTP_POLICY_DESCRIPTION(public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES())

public data class WS_HTTP_REDIRECT_CALLBACK_CONTEXT(public var callback: WS_HTTP_REDIRECT_CALLBACK = null, public var state: Long = 0L)

public data class WS_HTTP_SSL_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_HTTP_SSL_HEADER_AUTH_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE = WS_HTTP_HEADER_AUTH_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_HTTP_SSL_HEADER_AUTH_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var httpHeaderAuthSecurityBinding: WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION = WS_HTTP_HEADER_AUTH_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_HTTP_SSL_KERBEROS_APREQ_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_HTTP_SSL_KERBEROS_APREQ_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE = WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_HTTP_SSL_KERBEROS_APREQ_SECURITY_CONTEXT_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_HTTP_SSL_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_HTTP_SSL_USERNAME_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_HTTP_SSL_USERNAME_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE = WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_HTTP_SSL_USERNAME_SECURITY_CONTEXT_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sslTransportSecurityBinding: WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_HTTP_URL(
    public var url: WS_URL = WS_URL(),
    public var host: WS_STRING = WS_STRING(),
    public var port: UShort = 0u,
    public var portAsString: WS_STRING = WS_STRING(),
    public var path: WS_STRING = WS_STRING(),
    public var query: WS_STRING = WS_STRING(),
    public var fragment: WS_STRING = WS_STRING(),
)

public data class WS_INT16_DESCRIPTION(public var minValue: Short = 0, public var maxValue: Short = 0)

public data class WS_INT32_DESCRIPTION(public var minValue: Int = 0, public var maxValue: Int = 0)

public data class WS_INT64_DESCRIPTION(public var minValue: Long = 0L, public var maxValue: Long = 0L)

public data class WS_INT8_DESCRIPTION(public var minValue: Byte = 0, public var maxValue: Byte = 0)

public data class WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT(
    public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT(),
    public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0,
    public var claimConstraints: Long = 0L,
    public var claimConstraintCount: UInt = 0u,
    public var requestSecurityTokenPropertyConstraints: Long = 0L,
    public var requestSecurityTokenPropertyConstraintCount: UInt = 0u,
    public var out: WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0 = WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0(),
)

public data class WS_ISSUED_TOKEN_MESSAGE_SECURITY_BINDING_CONSTRAINT_0(public var issuerAddress: Long = 0L, public var requestSecurityTokenTemplate: Long = 0L)

public data class WS_ITEM_RANGE(public var minItemCount: UInt = 0u, public var maxItemCount: UInt = 0u)

public data class WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING(
    public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(),
    public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0,
    public var clientCredential: Long = 0L,
)

public data class WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_CONSTRAINT(public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT(), public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0)

public data class WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(), public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0)

public data class WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(), public var clientCredential: Long = 0L)

public data class WS_LISTENER_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_LISTENER_PROPERTY(
    public var id: WS_LISTENER_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_MESSAGE_DESCRIPTION(public var action: Long = 0L, public var bodyElementDescription: Long = 0L)

public data class WS_MESSAGE_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_MESSAGE_PROPERTY(
    public var id: WS_MESSAGE_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_METADATA_ENDPOINT(
    public var endpointAddress: WS_ENDPOINT_ADDRESS = WS_ENDPOINT_ADDRESS(),
    public var endpointPolicy: Long = 0L,
    public var portName: Long = 0L,
    public var serviceName: Long = 0L,
    public var serviceNs: Long = 0L,
    public var bindingName: Long = 0L,
    public var bindingNs: Long = 0L,
    public var portTypeName: Long = 0L,
    public var portTypeNs: Long = 0L,
)

public data class WS_METADATA_ENDPOINTS(public var endpoints: Long = 0L, public var endpointCount: UInt = 0u)

public data class WS_METADATA_PROPERTY(
    public var id: WS_METADATA_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_NAMEDPIPE_SSPI_TRANSPORT_SECURITY_BINDING(public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(), public var clientCredential: Long = 0L)

public data class WS_NCRYPT_ASYMMETRIC_SECURITY_KEY_HANDLE(public var keyHandle: WS_SECURITY_KEY_HANDLE = WS_SECURITY_KEY_HANDLE(), public var asymmetricKey: NCRYPT_KEY_HANDLE = 0uL)

public data class WS_NETPIPE_URL(
    public var url: WS_URL = WS_URL(),
    public var host: WS_STRING = WS_STRING(),
    public var port: UShort = 0u,
    public var portAsString: WS_STRING = WS_STRING(),
    public var path: WS_STRING = WS_STRING(),
    public var query: WS_STRING = WS_STRING(),
    public var fragment: WS_STRING = WS_STRING(),
)

public data class WS_NETTCP_URL(
    public var url: WS_URL = WS_URL(),
    public var host: WS_STRING = WS_STRING(),
    public var port: UShort = 0u,
    public var portAsString: WS_STRING = WS_STRING(),
    public var path: WS_STRING = WS_STRING(),
    public var query: WS_STRING = WS_STRING(),
    public var fragment: WS_STRING = WS_STRING(),
)

public data class WS_OPAQUE_WINDOWS_INTEGRATED_AUTH_CREDENTIAL(public var credential: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL = WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL(), public var opaqueAuthIdentity: Long = 0L)

public data class WS_OPERATION_DESCRIPTION(
    public var versionInfo: UInt = 0u,
    public var inputMessageDescription: Long = 0L,
    public var outputMessageDescription: Long = 0L,
    public var inputMessageOptions: UInt = 0u,
    public var outputMessageOptions: UInt = 0u,
    public var parameterCount: UShort = 0u,
    public var parameterDescription: Long = 0L,
    public var stubCallback: WS_SERVICE_STUB_CALLBACK = null,
    public var style: WS_OPERATION_STYLE = 0,
)

public data class WS_PARAMETER_DESCRIPTION(
    public var parameterType: WS_PARAMETER_TYPE = 0,
    public var inputMessageIndex: UShort = 0u,
    public var outputMessageIndex: UShort = 0u,
)

public data class WS_POLICY_CONSTRAINTS(
    public var channelBinding: WS_CHANNEL_BINDING = 0,
    public var channelPropertyConstraints: Long = 0L,
    public var channelPropertyConstraintCount: UInt = 0u,
    public var securityConstraints: Long = 0L,
    public var policyExtensions: Long = 0L,
    public var policyExtensionCount: UInt = 0u,
)

public data class WS_POLICY_EXTENSION(public var type: WS_POLICY_EXTENSION_TYPE = 0)

public data class WS_POLICY_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_POLICY_PROPERTY(
    public var id: WS_POLICY_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_PROXY_MESSAGE_CALLBACK_CONTEXT(public var callback: WS_PROXY_MESSAGE_CALLBACK = null, public var state: Long = 0L)

public data class WS_PROXY_PROPERTY(
    public var id: WS_PROXY_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_RAW_SYMMETRIC_SECURITY_KEY_HANDLE(public var keyHandle: WS_SECURITY_KEY_HANDLE = WS_SECURITY_KEY_HANDLE(), public var rawKeyBytes: WS_BYTES = WS_BYTES())

public data class WS_REQUEST_SECURITY_TOKEN_PROPERTY(
    public var id: WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT(
    public var id: WS_REQUEST_SECURITY_TOKEN_PROPERTY_ID = 0,
    public var allowedValues: Long = 0L,
    public var allowedValuesSize: UInt = 0u,
    public var out: WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT_0 = WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT_0(),
)

public data class WS_REQUEST_SECURITY_TOKEN_PROPERTY_CONSTRAINT_0(public var requestSecurityTokenProperty: WS_REQUEST_SECURITY_TOKEN_PROPERTY = WS_REQUEST_SECURITY_TOKEN_PROPERTY())

public data class WS_RSA_ENDPOINT_IDENTITY(
    public var identity: WS_ENDPOINT_IDENTITY = WS_ENDPOINT_IDENTITY(),
    public var modulus: WS_BYTES = WS_BYTES(),
    public var exponent: WS_BYTES = WS_BYTES(),
)

public data class WS_SAML_AUTHENTICATOR(public var authenticatorType: WS_SAML_AUTHENTICATOR_TYPE = 0)

public data class WS_SAML_MESSAGE_SECURITY_BINDING(
    public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(),
    public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0,
    public var authenticator: Long = 0L,
)

public data class WS_SECURITY_ALGORITHM_PROPERTY(
    public var id: WS_SECURITY_ALGORITHM_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_SECURITY_ALGORITHM_SUITE(
    public var canonicalizationAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var digestAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var symmetricSignatureAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var asymmetricSignatureAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var encryptionAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var keyDerivationAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var symmetricKeyWrapAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var asymmetricKeyWrapAlgorithm: WS_SECURITY_ALGORITHM_ID = 0,
    public var minSymmetricKeyLength: UInt = 0u,
    public var maxSymmetricKeyLength: UInt = 0u,
    public var minAsymmetricKeyLength: UInt = 0u,
    public var maxAsymmetricKeyLength: UInt = 0u,
    public var properties: Long = 0L,
    public var propertyCount: UInt = 0u,
)

public data class WS_SECURITY_BINDING(
    public var bindingType: WS_SECURITY_BINDING_TYPE = 0,
    public var properties: Long = 0L,
    public var propertyCount: UInt = 0u,
)

public data class WS_SECURITY_BINDING_CONSTRAINT(
    public var type: WS_SECURITY_BINDING_CONSTRAINT_TYPE = 0,
    public var propertyConstraints: Long = 0L,
    public var propertyConstraintCount: UInt = 0u,
)

public data class WS_SECURITY_BINDING_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_SECURITY_BINDING_PROPERTY(
    public var id: WS_SECURITY_BINDING_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_SECURITY_BINDING_PROPERTY_CONSTRAINT(
    public var id: WS_SECURITY_BINDING_PROPERTY_ID = 0,
    public var allowedValues: Long = 0L,
    public var allowedValuesSize: UInt = 0u,
    public var out: WS_SECURITY_BINDING_PROPERTY_CONSTRAINT_0 = WS_SECURITY_BINDING_PROPERTY_CONSTRAINT_0(),
)

public data class WS_SECURITY_BINDING_PROPERTY_CONSTRAINT_0(public var securityBindingProperty: WS_SECURITY_BINDING_PROPERTY = WS_SECURITY_BINDING_PROPERTY())

public data class WS_SECURITY_CONSTRAINTS(
    public var securityPropertyConstraints: Long = 0L,
    public var securityPropertyConstraintCount: UInt = 0u,
    public var securityBindingConstraints: Long = 0L,
    public var securityBindingConstraintCount: UInt = 0u,
)

public data class WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING(
    public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(),
    public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0,
    public var bootstrapSecurityDescription: Long = 0L,
)

public data class WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_CONSTRAINT(
    public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT(),
    public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0,
    public var bootstrapSecurityConstraint: Long = 0L,
)

public data class WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(), public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0)

public data class WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TEMPLATE(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES())

public data class WS_SECURITY_CONTEXT_PROPERTY(
    public var id: WS_SECURITY_CONTEXT_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION(public var securityContextMessageSecurityBinding: WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(), public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES())

public data class WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE(public var securityContextMessageSecurityBinding: WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_SECURITY_CONTEXT_MESSAGE_SECURITY_BINDING_TEMPLATE(), public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES())

public data class WS_SECURITY_DESCRIPTION(
    public var securityBindings: Long = 0L,
    public var securityBindingCount: UInt = 0u,
    public var properties: Long = 0L,
    public var propertyCount: UInt = 0u,
)

public data class WS_SECURITY_KEY_HANDLE(public var keyHandleType: WS_SECURITY_KEY_HANDLE_TYPE = 0)

public data class WS_SECURITY_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_SECURITY_PROPERTY(
    public var id: WS_SECURITY_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_SECURITY_PROPERTY_CONSTRAINT(
    public var id: WS_SECURITY_PROPERTY_ID = 0,
    public var allowedValues: Long = 0L,
    public var allowedValuesSize: UInt = 0u,
    public var out: WS_SECURITY_PROPERTY_CONSTRAINT_0 = WS_SECURITY_PROPERTY_CONSTRAINT_0(),
)

public data class WS_SECURITY_PROPERTY_CONSTRAINT_0(public var securityProperty: WS_SECURITY_PROPERTY = WS_SECURITY_PROPERTY())

public data class WS_SERVICE_CONTRACT(
    public var contractDescription: Long = 0L,
    public var defaultMessageHandlerCallback: WS_SERVICE_MESSAGE_RECEIVE_CALLBACK = null,
    public var methodTable: Long = 0L,
)

public data class WS_SERVICE_ENDPOINT(
    public var address: WS_ENDPOINT_ADDRESS = WS_ENDPOINT_ADDRESS(),
    public var channelBinding: WS_CHANNEL_BINDING = 0,
    public var channelType: WS_CHANNEL_TYPE = 0,
    public var securityDescription: Long = 0L,
    public var contract: Long = 0L,
    public var authorizationCallback: WS_SERVICE_SECURITY_CALLBACK = null,
    public var properties: Long = 0L,
    public var propertyCount: UInt = 0u,
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
)

public data class WS_SERVICE_ENDPOINT_METADATA(
    public var portName: Long = 0L,
    public var bindingName: Long = 0L,
    public var bindingNs: Long = 0L,
)

public data class WS_SERVICE_ENDPOINT_PROPERTY(
    public var id: WS_SERVICE_ENDPOINT_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_SERVICE_METADATA(
    public var documentCount: UInt = 0u,
    public var documents: Long = 0L,
    public var serviceName: Long = 0L,
    public var serviceNs: Long = 0L,
)

public data class WS_SERVICE_METADATA_DOCUMENT(public var content: Long = 0L, public var name: Long = 0L)

public data class WS_SERVICE_PROPERTY(
    public var id: WS_SERVICE_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_SERVICE_PROPERTY_ACCEPT_CALLBACK(public var callback: WS_SERVICE_ACCEPT_CHANNEL_CALLBACK = null)

public data class WS_SERVICE_PROPERTY_CLOSE_CALLBACK(public var callback: WS_SERVICE_CLOSE_CHANNEL_CALLBACK = null)

public data class WS_SERVICE_SECURITY_IDENTITIES(public var serviceIdentities: Long = 0L, public var serviceIdentityCount: UInt = 0u)

public data class WS_SOAPUDP_URL(
    public var url: WS_URL = WS_URL(),
    public var host: WS_STRING = WS_STRING(),
    public var port: UShort = 0u,
    public var portAsString: WS_STRING = WS_STRING(),
    public var path: WS_STRING = WS_STRING(),
    public var query: WS_STRING = WS_STRING(),
    public var fragment: WS_STRING = WS_STRING(),
)

public data class WS_SPN_ENDPOINT_IDENTITY(public var identity: WS_ENDPOINT_IDENTITY = WS_ENDPOINT_IDENTITY(), public var spn: WS_STRING = WS_STRING())

public data class WS_SSL_TRANSPORT_SECURITY_BINDING(public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(), public var localCertCredential: Long = 0L)

public data class WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT(public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT(), public var out: WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_0 = WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_0())

public data class WS_SSL_TRANSPORT_SECURITY_BINDING_CONSTRAINT_0(public var clientCertCredentialRequired: BOOL = 0)

public data class WS_SSL_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES())

public data class WS_SSL_TRANSPORT_SECURITY_BINDING_TEMPLATE(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(), public var localCertCredential: Long = 0L)

public data class WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES())

public data class WS_STRING(public var length: UInt = 0u, public var chars: PWSTR = 0L)

public data class WS_STRING_DESCRIPTION(public var minCharCount: UInt = 0u, public var maxCharCount: UInt = 0u)

public data class WS_STRING_USERNAME_CREDENTIAL(
    public var credential: WS_USERNAME_CREDENTIAL = WS_USERNAME_CREDENTIAL(),
    public var username: WS_STRING = WS_STRING(),
    public var password: WS_STRING = WS_STRING(),
)

public data class WS_STRING_WINDOWS_INTEGRATED_AUTH_CREDENTIAL(
    public var credential: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL = WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL(),
    public var username: WS_STRING = WS_STRING(),
    public var password: WS_STRING = WS_STRING(),
    public var domain: WS_STRING = WS_STRING(),
)

public data class WS_STRUCT_DESCRIPTION(
    public var size: UInt = 0u,
    public var alignment: UInt = 0u,
    public var fields: Long = 0L,
    public var fieldCount: UInt = 0u,
    public var typeLocalName: Long = 0L,
    public var typeNs: Long = 0L,
    public var parentType: Long = 0L,
    public var subTypes: Long = 0L,
    public var subTypeCount: UInt = 0u,
    public var structOptions: UInt = 0u,
)

public data class WS_SUBJECT_NAME_CERT_CREDENTIAL(
    public var credential: WS_CERT_CREDENTIAL = WS_CERT_CREDENTIAL(),
    public var storeLocation: UInt = 0u,
    public var storeName: WS_STRING = WS_STRING(),
    public var subjectName: WS_STRING = WS_STRING(),
)

public data class WS_TCP_BINDING_TEMPLATE(public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES())

public data class WS_TCP_POLICY_DESCRIPTION(public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES())

public data class WS_TCP_SSPI_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_TCP_SSPI_KERBEROS_APREQ_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_TCP_SSPI_KERBEROS_APREQ_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_TEMPLATE(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE = WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_TCP_SSPI_KERBEROS_APREQ_SECURITY_CONTEXT_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var kerberosApreqMessageSecurityBinding: WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_KERBEROS_APREQ_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_TCP_SSPI_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING(public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(), public var clientCredential: Long = 0L)

public data class WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_CONSTRAINT(public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT())

public data class WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(), public var clientCredential: Long = 0L)

public data class WS_TCP_SSPI_USERNAME_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_TCP_SSPI_USERNAME_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_BINDING_TEMPLATE(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE = WS_TCP_SSPI_TRANSPORT_SECURITY_BINDING_TEMPLATE(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE = WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE = WS_SECURITY_CONTEXT_SECURITY_BINDING_TEMPLATE(),
)

public data class WS_TCP_SSPI_USERNAME_SECURITY_CONTEXT_POLICY_DESCRIPTION(
    public var channelProperties: WS_CHANNEL_PROPERTIES = WS_CHANNEL_PROPERTIES(),
    public var securityProperties: WS_SECURITY_PROPERTIES = WS_SECURITY_PROPERTIES(),
    public var sspiTransportSecurityBinding: WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SSPI_TRANSPORT_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var usernameMessageSecurityBinding: WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION = WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(),
    public var securityContextSecurityBinding: WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION = WS_SECURITY_CONTEXT_SECURITY_BINDING_POLICY_DESCRIPTION(),
)

public data class WS_THUMBPRINT_CERT_CREDENTIAL(
    public var credential: WS_CERT_CREDENTIAL = WS_CERT_CREDENTIAL(),
    public var storeLocation: UInt = 0u,
    public var storeName: WS_STRING = WS_STRING(),
    public var thumbprint: WS_STRING = WS_STRING(),
)

public data class WS_TIMESPAN(public var ticks: Long = 0L)

public data class WS_TIMESPAN_DESCRIPTION(public var minValue: WS_TIMESPAN = WS_TIMESPAN(), public var maxValue: WS_TIMESPAN = WS_TIMESPAN())

public data class WS_UINT16_DESCRIPTION(public var minValue: UShort = 0u, public var maxValue: UShort = 0u)

public data class WS_UINT32_DESCRIPTION(public var minValue: UInt = 0u, public var maxValue: UInt = 0u)

public data class WS_UINT64_DESCRIPTION(public var minValue: ULong = 0uL, public var maxValue: ULong = 0uL)

public data class WS_UINT8_DESCRIPTION(public var minValue: UByte = 0u, public var maxValue: UByte = 0u)

public data class WS_UNION_DESCRIPTION(
    public var size: UInt = 0u,
    public var alignment: UInt = 0u,
    public var fields: Long = 0L,
    public var fieldCount: UInt = 0u,
    public var enumOffset: UInt = 0u,
    public var noneEnumValue: Int = 0,
    public var valueIndices: Long = 0L,
)

public data class WS_UNION_FIELD_DESCRIPTION(public var value: Int = 0, public var field: WS_FIELD_DESCRIPTION = WS_FIELD_DESCRIPTION())

public data class WS_UNIQUE_ID(public var uri: WS_STRING = WS_STRING(), public var guid: GUID = GUID())

public data class WS_UNIQUE_ID_DESCRIPTION(public var minCharCount: UInt = 0u, public var maxCharCount: UInt = 0u)

public data class WS_UNKNOWN_ENDPOINT_IDENTITY(public var identity: WS_ENDPOINT_IDENTITY = WS_ENDPOINT_IDENTITY(), public var element: Long = 0L)

public data class WS_UPN_ENDPOINT_IDENTITY(public var identity: WS_ENDPOINT_IDENTITY = WS_ENDPOINT_IDENTITY(), public var upn: WS_STRING = WS_STRING())

public data class WS_URL(public var scheme: WS_URL_SCHEME_TYPE = 0)

public data class WS_USERNAME_CREDENTIAL(public var credentialType: WS_USERNAME_CREDENTIAL_TYPE = 0)

public data class WS_USERNAME_MESSAGE_SECURITY_BINDING(
    public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(),
    public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0,
    public var clientCredential: Long = 0L,
    public var passwordValidator: WS_VALIDATE_PASSWORD_CALLBACK = null,
    public var passwordValidatorCallbackState: Long = 0L,
)

public data class WS_USERNAME_MESSAGE_SECURITY_BINDING_CONSTRAINT(public var bindingConstraint: WS_SECURITY_BINDING_CONSTRAINT = WS_SECURITY_BINDING_CONSTRAINT(), public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0)

public data class WS_USERNAME_MESSAGE_SECURITY_BINDING_POLICY_DESCRIPTION(public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(), public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0)

public data class WS_USERNAME_MESSAGE_SECURITY_BINDING_TEMPLATE(
    public var securityBindingProperties: WS_SECURITY_BINDING_PROPERTIES = WS_SECURITY_BINDING_PROPERTIES(),
    public var clientCredential: Long = 0L,
    public var passwordValidator: WS_VALIDATE_PASSWORD_CALLBACK = null,
    public var passwordValidatorCallbackState: Long = 0L,
)

public data class WS_UTF8_ARRAY_DESCRIPTION(public var minByteCount: UInt = 0u, public var maxByteCount: UInt = 0u)

public data class WS_VOID_DESCRIPTION(public var size: UInt = 0u)

public data class WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL(public var credentialType: WS_WINDOWS_INTEGRATED_AUTH_CREDENTIAL_TYPE = 0)

public data class WS_WSZ_DESCRIPTION(public var minCharCount: UInt = 0u, public var maxCharCount: UInt = 0u)

public data class WS_XML_ATTRIBUTE(
    public var singleQuote: UByte = 0u,
    public var isXmlNs: UByte = 0u,
    public var prefix: Long = 0L,
    public var localName: Long = 0L,
    public var ns: Long = 0L,
    public var value: Long = 0L,
)

public data class WS_XML_BASE64_TEXT(
    public var text: WS_XML_TEXT = WS_XML_TEXT(),
    public var bytes: Long = 0L,
    public var length: UInt = 0u,
)

public data class WS_XML_BOOL_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: BOOL = 0)

public data class WS_XML_BUFFER_PROPERTY(
    public var id: WS_XML_BUFFER_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_XML_CANONICALIZATION_INCLUSIVE_PREFIXES(public var prefixCount: UInt = 0u, public var prefixes: Long = 0L)

public data class WS_XML_CANONICALIZATION_PROPERTY(
    public var id: WS_XML_CANONICALIZATION_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_XML_COMMENT_NODE(public var node: WS_XML_NODE = WS_XML_NODE(), public var value: WS_XML_STRING = WS_XML_STRING())

public data class WS_XML_DATETIME_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: WS_DATETIME = WS_DATETIME())

public data class WS_XML_DECIMAL_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: DECIMAL = DECIMAL())

public data class WS_XML_DICTIONARY(
    public var guid: GUID = GUID(),
    public var strings: Long = 0L,
    public var stringCount: UInt = 0u,
    public var isConst: BOOL = 0,
)

public data class WS_XML_DOUBLE_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: Double = 0.0)

public data class WS_XML_ELEMENT_NODE(
    public var node: WS_XML_NODE = WS_XML_NODE(),
    public var prefix: Long = 0L,
    public var localName: Long = 0L,
    public var ns: Long = 0L,
    public var attributeCount: UInt = 0u,
    public var attributes: Long = 0L,
    public var isEmpty: BOOL = 0,
)

public data class WS_XML_FLOAT_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: Float = 0.0f)

public data class WS_XML_GUID_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: GUID = GUID())

public data class WS_XML_INT32_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: Int = 0)
