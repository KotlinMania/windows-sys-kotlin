package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.NcryptKeyHandle

public data class CtapcborHybridStorageLinkedData(
    public var dwVersion: UInt = 0u,
    public var cbContactId: UInt = 0u,
    public var pbContactId: COpaquePointer? = null,
    public var cbLinkId: UInt = 0u,
    public var pbLinkId: COpaquePointer? = null,
    public var cbLinkSecret: UInt = 0u,
    public var pbLinkSecret: COpaquePointer? = null,
    public var cbPublicKey: UInt = 0u,
    public var pbPublicKey: COpaquePointer? = null,
    public var pwszAuthenticatorName: Pcwstr = null,
    public var wEncodedTunnelServerDomain: UShort = 0u,
)

public data class WebauthnAssertion(
    public var dwVersion: UInt = 0u,
    public var cbAuthenticatorData: UInt = 0u,
    public var pbAuthenticatorData: COpaquePointer? = null,
    public var cbSignature: UInt = 0u,
    public var pbSignature: COpaquePointer? = null,
    public var credential: WebauthnCredential = WebauthnCredential(),
    public var cbUserId: UInt = 0u,
    public var pbUserId: COpaquePointer? = null,
    public var extensions: WebauthnExtensions = WebauthnExtensions(),
    public var cbCredLargeBlob: UInt = 0u,
    public var pbCredLargeBlob: COpaquePointer? = null,
    public var dwCredLargeBlobStatus: UInt = 0u,
    public var pHmacSecret: WebauthnHmacSecretSalt? = null,
    public var dwUsedTransport: UInt = 0u,
    public var cbUnsignedExtensionOutputs: UInt = 0u,
    public var pbUnsignedExtensionOutputs: COpaquePointer? = null,
)

public class WebauthnAuthenticatorGetAssertionOptions(
    public var dwVersion: UInt = 0u,
    public var dwTimeoutMilliseconds: UInt = 0u,
    public var credentialList: WebauthnCredentials = WebauthnCredentials(),
    public var extensions: WebauthnExtensions = WebauthnExtensions(),
    public var dwAuthenticatorAttachment: UInt = 0u,
    public var dwUserVerificationRequirement: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pwszU2fAppId: Pcwstr = null,
    public var pbU2fAppId: Bool? = null,
    public var pCancellationId: Guid? = null,
    public var pAllowCredentialList: WebauthnCredentialList? = null,
    public var dwCredLargeBlobOperation: UInt = 0u,
    public var cbCredLargeBlob: UInt = 0u,
    public var pbCredLargeBlob: COpaquePointer? = null,
    public var pHmacSecretSaltValues: WebauthnHmacSecretSaltValues? = null,
    public var bBrowserInPrivateMode: Bool = 0,
    public var pLinkedDevice: CtapcborHybridStorageLinkedData? = null,
    public var bAutoFill: Bool = 0,
    public var cbJsonExt: UInt = 0u,
    public var pbJsonExt: COpaquePointer? = null,
)

public class WebauthnAuthenticatorMakeCredentialOptions(
    public var dwVersion: UInt = 0u,
    public var dwTimeoutMilliseconds: UInt = 0u,
    public var credentialList: WebauthnCredentials = WebauthnCredentials(),
    public var extensions: WebauthnExtensions = WebauthnExtensions(),
    public var dwAuthenticatorAttachment: UInt = 0u,
    public var bRequireResidentKey: Bool = 0,
    public var dwUserVerificationRequirement: UInt = 0u,
    public var dwAttestationConveyancePreference: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pCancellationId: Guid? = null,
    public var pExcludeCredentialList: WebauthnCredentialList? = null,
    public var dwEnterpriseAttestation: UInt = 0u,
    public var dwLargeBlobSupport: UInt = 0u,
    public var bPreferResidentKey: Bool = 0,
    public var bBrowserInPrivateMode: Bool = 0,
    public var bEnablePrf: Bool = 0,
    public var pLinkedDevice: CtapcborHybridStorageLinkedData? = null,
    public var cbJsonExt: UInt = 0u,
    public var pbJsonExt: COpaquePointer? = null,
)

public data class WebauthnClientData(
    public var dwVersion: UInt = 0u,
    public var cbClientDataJSON: UInt = 0u,
    public var pbClientDataJSON: COpaquePointer? = null,
    public var pwszHashAlgId: Pcwstr = null,
)

public data class WebauthnCommonAttestation(
    public var dwVersion: UInt = 0u,
    public var pwszAlg: Pcwstr = null,
    public var lAlg: Int = 0,
    public var cbSignature: UInt = 0u,
    public var pbSignature: COpaquePointer? = null,
    public var cX5c: UInt = 0u,
    public var pX5c: WebauthnX5c? = null,
    public var pwszVer: Pcwstr = null,
    public var cbCertInfo: UInt = 0u,
    public var pbCertInfo: COpaquePointer? = null,
    public var cbPubArea: UInt = 0u,
    public var pbPubArea: COpaquePointer? = null,
)

public data class WebauthnCoseCredentialParameter(
    public var dwVersion: UInt = 0u,
    public var pwszCredentialType: Pcwstr = null,
    public var lAlg: Int = 0,
)

public data class WebauthnCoseCredentialParameters(
    public var cCredentialParameters: UInt = 0u,
    public var pCredentialParameters: WebauthnCoseCredentialParameter? = null,
)

public data class WebauthnCredential(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var pbId: COpaquePointer? = null,
    public var pwszCredentialType: Pcwstr = null,
)

public data class WebauthnCredentials(
    public var cCredentials: UInt = 0u,
    public var pCredentials: WebauthnCredential? = null,
)

public class WebauthnCredentialAttestation(
    public var dwVersion: UInt = 0u,
    public var pwszFormatType: Pcwstr = null,
    public var cbAuthenticatorData: UInt = 0u,
    public var pbAuthenticatorData: COpaquePointer? = null,
    public var cbAttestation: UInt = 0u,
    public var pbAttestation: COpaquePointer? = null,
    public var dwAttestationDecodeType: UInt = 0u,
    public var pvAttestationDecode: COpaquePointer? = null,
    public var cbAttestationObject: UInt = 0u,
    public var pbAttestationObject: COpaquePointer? = null,
    public var cbCredentialId: UInt = 0u,
    public var pbCredentialId: COpaquePointer? = null,
    public var extensions: WebauthnExtensions = WebauthnExtensions(),
    public var dwUsedTransport: UInt = 0u,
    public var bEpAtt: Bool = 0,
    public var bLargeBlobSupported: Bool = 0,
    public var bResidentKey: Bool = 0,
    public var bPrfEnabled: Bool = 0,
    public var cbUnsignedExtensionOutputs: UInt = 0u,
    public var pbUnsignedExtensionOutputs: COpaquePointer? = null,
)

public data class WebauthnCredentialDetails(
    public var dwVersion: UInt = 0u,
    public var cbCredentialID: UInt = 0u,
    public var pbCredentialID: COpaquePointer? = null,
    public var pRpInformation: WebauthnRpEntityInformation? = null,
    public var pUserInformation: WebauthnUserEntityInformation? = null,
    public var bRemovable: Bool = 0,
    public var bBackedUp: Bool = 0,
)

public data class WebauthnCredentialDetailsList(
    public var cCredentialDetails: UInt = 0u,
    public var ppCredentialDetails: COpaquePointer? = null,
)

public data class WebauthnCredentialEx(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var pbId: COpaquePointer? = null,
    public var pwszCredentialType: Pcwstr = null,
    public var dwTransports: UInt = 0u,
)

public data class WebauthnCredentialList(
    public var cCredentials: UInt = 0u,
    public var ppCredentials: COpaquePointer? = null,
)

public data class WebauthnCredBlobExtension(
    public var cbCredBlob: UInt = 0u,
    public var pbCredBlob: COpaquePointer? = null,
)

public data class WebauthnCredProtectExtensionIn(
    public var dwCredProtect: UInt = 0u,
    public var bRequireCredProtect: Bool = 0,
)

public data class WebauthnCredWithHmacSecretSalt(
    public var cbCredID: UInt = 0u,
    public var pbCredID: COpaquePointer? = null,
    public var pHmacSecretSalt: WebauthnHmacSecretSalt? = null,
)

public data class WebauthnExtension(
    public var pwszExtensionIdentifier: Pcwstr = null,
    public var cbExtension: UInt = 0u,
    public var pvExtension: COpaquePointer? = null,
)

public data class WebauthnExtensions(
    public var cExtensions: UInt = 0u,
    public var pExtensions: WebauthnExtension? = null,
)

public data class WebauthnGetCredentialsOptions(
    public var dwVersion: UInt = 0u,
    public var pwszRpId: Pcwstr = null,
    public var bBrowserInPrivateMode: Bool = 0,
)

public data class WebauthnHmacSecretSalt(
    public var cbFirst: UInt = 0u,
    public var pbFirst: COpaquePointer? = null,
    public var cbSecond: UInt = 0u,
    public var pbSecond: COpaquePointer? = null,
)

public data class WebauthnHmacSecretSaltValues(
    public var pGlobalHmacSalt: WebauthnHmacSecretSalt? = null,
    public var cCredWithHmacSecretSaltList: UInt = 0u,
    public var pCredWithHmacSecretSaltList: WebauthnCredWithHmacSecretSalt? = null,
)

public data class WebauthnRpEntityInformation(
    public var dwVersion: UInt = 0u,
    public var pwszId: Pcwstr = null,
    public var pwszName: Pcwstr = null,
    public var pwszIcon: Pcwstr = null,
)

public data class WebauthnUserEntityInformation(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var pbId: COpaquePointer? = null,
    public var pwszName: Pcwstr = null,
    public var pwszIcon: Pcwstr = null,
    public var pwszDisplayName: Pcwstr = null,
)

public data class WebauthnX5c(
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
)

public data class WsAnyAttribute(
    public var localName: WsXmlString = WsXmlString(),
    public var ns: WsXmlString = WsXmlString(),
    public var value: WsXmlText? = null,
)

public data class WsAnyAttributes(
    public var attributes: WsAnyAttribute? = null,
    public var attributeCount: UInt = 0u,
)

public data class WsAsyncContext(
    public var callback: WsAsyncCallback = null,
    public var callbackState: COpaquePointer? = null,
)

public data class WsAsyncOperation(
    public var function: WsAsyncFunction = null,
)

public data class WsAsyncState(
    public var internal0: COpaquePointer? = null,
    public var internal1: COpaquePointer? = null,
    public var internal2: COpaquePointer? = null,
    public var internal3: COpaquePointer? = null,
    public var internal4: COpaquePointer? = null,
)

public data class WsAttributeDescription(
    public var attributeLocalName: WsXmlString? = null,
    public var attributeNs: WsXmlString? = null,
    public var type: WsType = 0,
    public var typeDescription: COpaquePointer? = null,
)

public data class WsBoolDescription(
    public var value: Bool = 0,
)

public data class WsBuffers(
    public var bufferCount: UInt = 0u,
    public var buffers: WsBytes? = null,
)

public data class WsBytes(
    public var length: UInt = 0u,
    public var bytes: COpaquePointer? = null,
)

public data class WsBytesDescription(
    public var minByteCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
)

public data class WsByteArrayDescription(
    public var minByteCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
)

public data class WsCallProperty(
    public var id: WsCallPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsCapiAsymmetricSecurityKeyHandle(
    public var keyHandle: WsSecurityKeyHandle = WsSecurityKeyHandle(),
    public var provider: Int = 0,
    public var keySpec: UInt = 0u,
)

public data class WsCertificateValidationCallbackContext(
    public var callback: WsCertificateValidationCallback = null,
    public var state: COpaquePointer? = null,
)

public data class WsCertCredential(
    public var credentialType: WsCertCredentialType = 0,
)

public data class WsCertEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var rawCertificateData: WsBytes = WsBytes(),
)

public data class WsCertMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
)

public data class WsCertSignedSamlAuthenticator(
    public var authenticator: WsSamlAuthenticator = WsSamlAuthenticator(),
    public var trustedIssuerCerts: COpaquePointer? = null,
    public var trustedIssuerCertCount: UInt = 0u,
    public var decryptionCert: CertContext? = null,
    public var samlValidator: WsValidateSamlCallback = null,
    public var samlValidatorCallbackState: COpaquePointer? = null,
)

public data class WsChannelDecoder(
    public var createContext: COpaquePointer? = null,
    public var createDecoderCallback: WsCreateDecoderCallback = null,
    public var decoderGetContentTypeCallback: WsDecoderGetContentTypeCallback = null,
    public var decoderStartCallback: WsDecoderStartCallback = null,
    public var decoderDecodeCallback: WsDecoderDecodeCallback = null,
    public var decoderEndCallback: WsDecoderEndCallback = null,
    public var freeDecoderCallback: WsFreeDecoderCallback = null,
)

public data class WsChannelEncoder(
    public var createContext: COpaquePointer? = null,
    public var createEncoderCallback: WsCreateEncoderCallback = null,
    public var encoderGetContentTypeCallback: WsEncoderGetContentTypeCallback = null,
    public var encoderStartCallback: WsEncoderStartCallback = null,
    public var encoderEncodeCallback: WsEncoderEncodeCallback = null,
    public var encoderEndCallback: WsEncoderEndCallback = null,
    public var freeEncoderCallback: WsFreeEncoderCallback = null,
)

public data class WsChannelProperties(
    public var properties: WsChannelProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsChannelProperty(
    public var id: WsChannelPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsChannelPropertyConstraint(
    public var id: WsChannelPropertyId = 0,
    public var allowedValues: COpaquePointer? = null,
    public var allowedValuesSize: UInt = 0u,
    public var out: WsChannelPropertyConstraint0 = WsChannelPropertyConstraint0(),
)

public data class WsChannelPropertyConstraint0(
    public var channelProperty: WsChannelProperty = WsChannelProperty(),
)

public data class WsCharArrayDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
)

public data class WsContractDescription(
    public var operationCount: UInt = 0u,
    public var operations: COpaquePointer? = null,
)

public data class WsCustomCertCredential(
    public var credential: WsCertCredential = WsCertCredential(),
    public var getCertCallback: WsGetCertCallback = null,
    public var getCertCallbackState: COpaquePointer? = null,
    public var certIssuerListNotificationCallback: WsCertIssuerListNotificationCallback = null,
    public var certIssuerListNotificationCallbackState: COpaquePointer? = null,
)

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

public data class WsCustomTypeDescription(
    public var size: UInt = 0u,
    public var alignment: UInt = 0u,
    public var readCallback: WsReadTypeCallback = null,
    public var writeCallback: WsWriteTypeCallback = null,
    public var descriptionData: COpaquePointer? = null,
    public var isDefaultValueCallback: WsIsDefaultValueCallback = null,
)

public data class WsDatetime(
    public var ticks: ULong = 0uL,
    public var format: WsDatetimeFormat = 0,
)

public data class WsDatetimeDescription(
    public var minValue: WsDatetime = WsDatetime(),
    public var maxValue: WsDatetime = WsDatetime(),
)

public data class WsDecimalDescription(
    public var minValue: Decimal = Decimal(),
    public var maxValue: Decimal = Decimal(),
)

public data class WsDefaultValue(
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsDefaultWindowsIntegratedAuthCredential(
    public var credential: WsWindowsIntegratedAuthCredential = WsWindowsIntegratedAuthCredential(),
)

public data class WsDisallowedUserAgentSubstrings(
    public var subStringCount: UInt = 0u,
    public var subStrings: COpaquePointer? = null,
)

public data class WsDnsEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var dns: WsString = WsString(),
)

public data class WsDoubleDescription(
    public var minValue: Double = 0.0,
    public var maxValue: Double = 0.0,
)

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

public data class WsElementDescription(
    public var elementLocalName: WsXmlString? = null,
    public var elementNs: WsXmlString? = null,
    public var type: WsType = 0,
    public var typeDescription: COpaquePointer? = null,
)

public data class WsEndpointAddress(
    public var url: WsString = WsString(),
    public var headers: Int? = null,
    public var extensions: Int? = null,
    public var identity: WsEndpointIdentity? = null,
)

public data class WsEndpointAddressDescription(
    public var addressingVersion: WsAddressingVersion = 0,
)

public data class WsEndpointIdentity(
    public var identityType: WsEndpointIdentityType = 0,
)

public data class WsEndpointPolicyExtension(
    public var policyExtension: WsPolicyExtension = WsPolicyExtension(),
    public var assertionName: WsXmlString? = null,
    public var assertionNs: WsXmlString? = null,
    public var out: WsEndpointPolicyExtension0 = WsEndpointPolicyExtension0(),
)

public data class WsEndpointPolicyExtension0(
    public var assertionValue: Int? = null,
)

public data class WsEnumDescription(
    public var values: WsEnumValue? = null,
    public var valueCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
    public var nameIndices: UInt? = null,
)

public data class WsEnumValue(
    public var value: Int = 0,
    public var name: WsXmlString? = null,
)

public data class WsErrorProperty(
    public var id: WsErrorPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsFault(
    public var code: WsFaultCode? = null,
    public var reasons: WsFaultReason? = null,
    public var reasonCount: UInt = 0u,
    public var actor: WsString = WsString(),
    public var node: WsString = WsString(),
    public var detail: Int? = null,
)

public data class WsFaultCode(
    public var value: WsXmlQname = WsXmlQname(),
    public var subCode: WsFaultCode? = null,
)

public data class WsFaultDescription(
    public var envelopeVersion: WsEnvelopeVersion = 0,
)

public data class WsFaultDetailDescription(
    public var action: WsXmlString? = null,
    public var detailElementDescription: WsElementDescription? = null,
)

public data class WsFaultReason(
    public var text: WsString = WsString(),
    public var lang: WsString = WsString(),
)

public data class WsFieldDescription(
    public var mapping: WsFieldMapping = 0,
    public var localName: WsXmlString? = null,
    public var ns: WsXmlString? = null,
    public var type: WsType = 0,
    public var typeDescription: COpaquePointer? = null,
    public var offset: UInt = 0u,
    public var options: UInt = 0u,
    public var defaultValue: WsDefaultValue? = null,
    public var countOffset: UInt = 0u,
    public var itemLocalName: WsXmlString? = null,
    public var itemNs: WsXmlString? = null,
    public var itemRange: WsItemRange? = null,
)

public data class WsFloatDescription(
    public var minValue: Float = 0.0f,
    public var maxValue: Float = 0.0f,
)

public data class WsGuidDescription(
    public var value: Guid = Guid(),
)

public data class WsHeapProperties(
    public var properties: WsHeapProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsHeapProperty(
    public var id: WsHeapPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsHostNames(
    public var hostNames: WsString? = null,
    public var hostNameCount: UInt = 0u,
)

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
)

public data class WsHttpHeaderAuthBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingTemplate = WsHttpHeaderAuthSecurityBindingTemplate(),
)

public data class WsHttpHeaderAuthPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingPolicyDescription = WsHttpHeaderAuthSecurityBindingPolicyDescription(),
)

public data class WsHttpHeaderAuthSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var clientCredential: WsWindowsIntegratedAuthCredential? = null,
)

public data class WsHttpHeaderAuthSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
)

public data class WsHttpHeaderAuthSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
)

public data class WsHttpHeaderAuthSecurityBindingTemplate(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var clientCredential: WsWindowsIntegratedAuthCredential? = null,
)

public data class WsHttpHeaderMapping(
    public var headerName: WsXmlString = WsXmlString(),
    public var headerMappingOptions: UInt = 0u,
)

public data class WsHttpMessageMapping(
    public var requestMappingOptions: UInt = 0u,
    public var responseMappingOptions: UInt = 0u,
    public var requestHeaderMappings: COpaquePointer? = null,
    public var requestHeaderMappingCount: UInt = 0u,
    public var responseHeaderMappings: COpaquePointer? = null,
    public var responseHeaderMappingCount: UInt = 0u,
)

public data class WsHttpPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
)

public data class WsHttpRedirectCallbackContext(
    public var callback: WsHttpRedirectCallback = null,
    public var state: COpaquePointer? = null,
)

public data class WsHttpSslBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
)

public data class WsHttpSslHeaderAuthBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingTemplate = WsHttpHeaderAuthSecurityBindingTemplate(),
)

public data class WsHttpSslHeaderAuthPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var httpHeaderAuthSecurityBinding: WsHttpHeaderAuthSecurityBindingPolicyDescription = WsHttpHeaderAuthSecurityBindingPolicyDescription(),
)

public data class WsHttpSslKerberosApreqBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
)

public data class WsHttpSslKerberosApreqPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
)

public data class WsHttpSslKerberosApreqSecurityContextBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingTemplate = WsSslTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingTemplate = WsSecurityContextSecurityBindingTemplate(),
)

public data class WsHttpSslKerberosApreqSecurityContextPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingPolicyDescription = WsSecurityContextSecurityBindingPolicyDescription(),
)

public data class WsHttpSslPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sslTransportSecurityBinding: WsSslTransportSecurityBindingPolicyDescription = WsSslTransportSecurityBindingPolicyDescription(),
)

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
)

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
)

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
)

public data class WsInt32Description(
    public var minValue: Int = 0,
    public var maxValue: Int = 0,
)

public data class WsInt64Description(
    public var minValue: Long = 0L,
    public var maxValue: Long = 0L,
)

public data class WsInt8Description(
    public var minValue: Byte = 0,
    public var maxValue: Byte = 0,
)

public data class WsIssuedTokenMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
    public var claimConstraints: WsXmlString? = null,
    public var claimConstraintCount: UInt = 0u,
    public var requestSecurityTokenPropertyConstraints: WsRequestSecurityTokenPropertyConstraint? = null,
    public var requestSecurityTokenPropertyConstraintCount: UInt = 0u,
    public var out: WsIssuedTokenMessageSecurityBindingConstraint0 = WsIssuedTokenMessageSecurityBindingConstraint0(),
)

public data class WsIssuedTokenMessageSecurityBindingConstraint0(
    public var issuerAddress: WsEndpointAddress? = null,
    public var requestSecurityTokenTemplate: Int? = null,
)

public data class WsItemRange(
    public var minItemCount: UInt = 0u,
    public var maxItemCount: UInt = 0u,
)

public data class WsKerberosApreqMessageSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
    public var clientCredential: WsWindowsIntegratedAuthCredential? = null,
)

public data class WsKerberosApreqMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
)

public data class WsKerberosApreqMessageSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
)

public data class WsKerberosApreqMessageSecurityBindingTemplate(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var clientCredential: WsWindowsIntegratedAuthCredential? = null,
)

public data class WsListenerProperties(
    public var properties: WsListenerProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsListenerProperty(
    public var id: WsListenerPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsMessageDescription(
    public var action: WsXmlString? = null,
    public var bodyElementDescription: WsElementDescription? = null,
)

public data class WsMessageProperties(
    public var properties: WsMessageProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsMessageProperty(
    public var id: WsMessagePropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsMetadataEndpoint(
    public var endpointAddress: WsEndpointAddress = WsEndpointAddress(),
    public var endpointPolicy: Int? = null,
    public var portName: WsXmlString? = null,
    public var serviceName: WsXmlString? = null,
    public var serviceNs: WsXmlString? = null,
    public var bindingName: WsXmlString? = null,
    public var bindingNs: WsXmlString? = null,
    public var portTypeName: WsXmlString? = null,
    public var portTypeNs: WsXmlString? = null,
)

public data class WsMetadataEndpoints(
    public var endpoints: WsMetadataEndpoint? = null,
    public var endpointCount: UInt = 0u,
)

public data class WsMetadataProperty(
    public var id: WsMetadataPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsNamedpipeSspiTransportSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var clientCredential: WsWindowsIntegratedAuthCredential? = null,
)

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

public data class WsOpaqueWindowsIntegratedAuthCredential(
    public var credential: WsWindowsIntegratedAuthCredential = WsWindowsIntegratedAuthCredential(),
    public var opaqueAuthIdentity: COpaquePointer? = null,
)

public data class WsOperationDescription(
    public var versionInfo: UInt = 0u,
    public var inputMessageDescription: WsMessageDescription? = null,
    public var outputMessageDescription: WsMessageDescription? = null,
    public var inputMessageOptions: UInt = 0u,
    public var outputMessageOptions: UInt = 0u,
    public var parameterCount: UShort = 0u,
    public var parameterDescription: WsParameterDescription? = null,
    public var stubCallback: WsServiceStubCallback = null,
    public var style: WsOperationStyle = 0,
)

public data class WsParameterDescription(
    public var parameterType: WsParameterType = 0,
    public var inputMessageIndex: UShort = 0u,
    public var outputMessageIndex: UShort = 0u,
)

public data class WsPolicyConstraints(
    public var channelBinding: WsChannelBinding = 0,
    public var channelPropertyConstraints: WsChannelPropertyConstraint? = null,
    public var channelPropertyConstraintCount: UInt = 0u,
    public var securityConstraints: WsSecurityConstraints? = null,
    public var policyExtensions: COpaquePointer? = null,
    public var policyExtensionCount: UInt = 0u,
)

public data class WsPolicyExtension(
    public var type: WsPolicyExtensionType = 0,
)

public data class WsPolicyProperties(
    public var properties: WsPolicyProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsPolicyProperty(
    public var id: WsPolicyPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsProxyMessageCallbackContext(
    public var callback: WsProxyMessageCallback = null,
    public var state: COpaquePointer? = null,
)

public data class WsProxyProperty(
    public var id: WsProxyPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsRawSymmetricSecurityKeyHandle(
    public var keyHandle: WsSecurityKeyHandle = WsSecurityKeyHandle(),
    public var rawKeyBytes: WsBytes = WsBytes(),
)

public data class WsRequestSecurityTokenProperty(
    public var id: WsRequestSecurityTokenPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsRequestSecurityTokenPropertyConstraint(
    public var id: WsRequestSecurityTokenPropertyId = 0,
    public var allowedValues: COpaquePointer? = null,
    public var allowedValuesSize: UInt = 0u,
    public var out: WsRequestSecurityTokenPropertyConstraint0 = WsRequestSecurityTokenPropertyConstraint0(),
)

public data class WsRequestSecurityTokenPropertyConstraint0(
    public var requestSecurityTokenProperty: WsRequestSecurityTokenProperty = WsRequestSecurityTokenProperty(),
)

public data class WsRsaEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var modulus: WsBytes = WsBytes(),
    public var exponent: WsBytes = WsBytes(),
)

public data class WsSamlAuthenticator(
    public var authenticatorType: WsSamlAuthenticatorType = 0,
)

public data class WsSamlMessageSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
    public var authenticator: WsSamlAuthenticator? = null,
)

public data class WsSecurityAlgorithmProperty(
    public var id: WsSecurityAlgorithmPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsSecurityAlgorithmSuite(
    public var canonicalizationAlgorithm: WsSecurityAlgorithmId = 0,
    public var digestAlgorithm: WsSecurityAlgorithmId = 0,
    public var symmetricSignatureAlgorithm: WsSecurityAlgorithmId = 0,
    public var asymmetricSignatureAlgorithm: WsSecurityAlgorithmId = 0,
    public var encryptionAlgorithm: WsSecurityAlgorithmId = 0,
    public var keyDerivationAlgorithm: WsSecurityAlgorithmId = 0,
    public var symmetricKeyWrapAlgorithm: WsSecurityAlgorithmId = 0,
    public var asymmetricKeyWrapAlgorithm: WsSecurityAlgorithmId = 0,
    public var minSymmetricKeyLength: UInt = 0u,
    public var maxSymmetricKeyLength: UInt = 0u,
    public var minAsymmetricKeyLength: UInt = 0u,
    public var maxAsymmetricKeyLength: UInt = 0u,
    public var properties: WsSecurityAlgorithmProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsSecurityBinding(
    public var bindingType: WsSecurityBindingType = 0,
    public var properties: WsSecurityBindingProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsSecurityBindingConstraint(
    public var type: WsSecurityBindingConstraintType = 0,
    public var propertyConstraints: WsSecurityBindingPropertyConstraint? = null,
    public var propertyConstraintCount: UInt = 0u,
)

public data class WsSecurityBindingProperties(
    public var properties: WsSecurityBindingProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsSecurityBindingProperty(
    public var id: WsSecurityBindingPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsSecurityBindingPropertyConstraint(
    public var id: WsSecurityBindingPropertyId = 0,
    public var allowedValues: COpaquePointer? = null,
    public var allowedValuesSize: UInt = 0u,
    public var out: WsSecurityBindingPropertyConstraint0 = WsSecurityBindingPropertyConstraint0(),
)

public data class WsSecurityBindingPropertyConstraint0(
    public var securityBindingProperty: WsSecurityBindingProperty = WsSecurityBindingProperty(),
)

public data class WsSecurityConstraints(
    public var securityPropertyConstraints: WsSecurityPropertyConstraint? = null,
    public var securityPropertyConstraintCount: UInt = 0u,
    public var securityBindingConstraints: COpaquePointer? = null,
    public var securityBindingConstraintCount: UInt = 0u,
)

public data class WsSecurityContextMessageSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
    public var bootstrapSecurityDescription: WsSecurityDescription? = null,
)

public data class WsSecurityContextMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
    public var bootstrapSecurityConstraint: WsSecurityConstraints? = null,
)

public data class WsSecurityContextMessageSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
)

public data class WsSecurityContextMessageSecurityBindingTemplate(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
)

public data class WsSecurityContextProperty(
    public var id: WsSecurityContextPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsSecurityContextSecurityBindingPolicyDescription(
    public var securityContextMessageSecurityBinding: WsSecurityContextMessageSecurityBindingPolicyDescription = WsSecurityContextMessageSecurityBindingPolicyDescription(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
)

public data class WsSecurityContextSecurityBindingTemplate(
    public var securityContextMessageSecurityBinding: WsSecurityContextMessageSecurityBindingTemplate = WsSecurityContextMessageSecurityBindingTemplate(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
)

public data class WsSecurityDescription(
    public var securityBindings: COpaquePointer? = null,
    public var securityBindingCount: UInt = 0u,
    public var properties: WsSecurityProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsSecurityKeyHandle(
    public var keyHandleType: WsSecurityKeyHandleType = 0,
)

public data class WsSecurityProperties(
    public var properties: WsSecurityProperty? = null,
    public var propertyCount: UInt = 0u,
)

public data class WsSecurityProperty(
    public var id: WsSecurityPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsSecurityPropertyConstraint(
    public var id: WsSecurityPropertyId = 0,
    public var allowedValues: COpaquePointer? = null,
    public var allowedValuesSize: UInt = 0u,
    public var out: WsSecurityPropertyConstraint0 = WsSecurityPropertyConstraint0(),
)

public data class WsSecurityPropertyConstraint0(
    public var securityProperty: WsSecurityProperty = WsSecurityProperty(),
)

public data class WsServiceContract(
    public var contractDescription: WsContractDescription? = null,
    public var defaultMessageHandlerCallback: WsServiceMessageReceiveCallback = null,
    public var methodTable: COpaquePointer? = null,
)

public data class WsServiceEndpoint(
    public var address: WsEndpointAddress = WsEndpointAddress(),
    public var channelBinding: WsChannelBinding = 0,
    public var channelType: WsChannelType = 0,
    public var securityDescription: WsSecurityDescription? = null,
    public var contract: WsServiceContract? = null,
    public var authorizationCallback: WsServiceSecurityCallback = null,
    public var properties: WsServiceEndpointProperty? = null,
    public var propertyCount: UInt = 0u,
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
)

public data class WsServiceEndpointMetadata(
    public var portName: WsXmlString? = null,
    public var bindingName: WsXmlString? = null,
    public var bindingNs: WsXmlString? = null,
)

public data class WsServiceEndpointProperty(
    public var id: WsServiceEndpointPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsServiceMetadata(
    public var documentCount: UInt = 0u,
    public var documents: COpaquePointer? = null,
    public var serviceName: WsXmlString? = null,
    public var serviceNs: WsXmlString? = null,
)

public data class WsServiceMetadataDocument(
    public var content: WsXmlString? = null,
    public var name: WsString? = null,
)

public data class WsServiceProperty(
    public var id: WsServicePropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsServicePropertyAcceptCallback(
    public var callback: WsServiceAcceptChannelCallback = null,
)

public data class WsServicePropertyCloseCallback(
    public var callback: WsServiceCloseChannelCallback = null,
)

public data class WsServiceSecurityIdentities(
    public var serviceIdentities: WsString? = null,
    public var serviceIdentityCount: UInt = 0u,
)

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

public data class WsSslTransportSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var localCertCredential: WsCertCredential? = null,
)

public data class WsSslTransportSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var out: WsSslTransportSecurityBindingConstraint0 = WsSslTransportSecurityBindingConstraint0(),
)

public data class WsSslTransportSecurityBindingConstraint0(
    public var clientCertCredentialRequired: Bool = 0,
)

public data class WsSslTransportSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
)

public data class WsSslTransportSecurityBindingTemplate(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var localCertCredential: WsCertCredential? = null,
)

public data class WsSspiTransportSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
)

public data class WsString(
    public var length: UInt = 0u,
    public var chars: Pwstr = null,
)

public data class WsStringDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
)

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

public data class WsStructDescription(
    public var size: UInt = 0u,
    public var alignment: UInt = 0u,
    public var fields: COpaquePointer? = null,
    public var fieldCount: UInt = 0u,
    public var typeLocalName: WsXmlString? = null,
    public var typeNs: WsXmlString? = null,
    public var parentType: WsStructDescription? = null,
    public var subTypes: COpaquePointer? = null,
    public var subTypeCount: UInt = 0u,
    public var structOptions: UInt = 0u,
)

public data class WsSubjectNameCertCredential(
    public var credential: WsCertCredential = WsCertCredential(),
    public var storeLocation: UInt = 0u,
    public var storeName: WsString = WsString(),
    public var subjectName: WsString = WsString(),
)

public data class WsTcpBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
)

public data class WsTcpPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
)

public data class WsTcpSspiBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
)

public data class WsTcpSspiKerberosApreqBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
)

public data class WsTcpSspiKerberosApreqPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
)

public data class WsTcpSspiKerberosApreqSecurityContextBindingTemplate(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsTcpSspiTransportSecurityBindingTemplate = WsTcpSspiTransportSecurityBindingTemplate(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingTemplate = WsKerberosApreqMessageSecurityBindingTemplate(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingTemplate = WsSecurityContextSecurityBindingTemplate(),
)

public data class WsTcpSspiKerberosApreqSecurityContextPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
    public var kerberosApreqMessageSecurityBinding: WsKerberosApreqMessageSecurityBindingPolicyDescription = WsKerberosApreqMessageSecurityBindingPolicyDescription(),
    public var securityContextSecurityBinding: WsSecurityContextSecurityBindingPolicyDescription = WsSecurityContextSecurityBindingPolicyDescription(),
)

public data class WsTcpSspiPolicyDescription(
    public var channelProperties: WsChannelProperties = WsChannelProperties(),
    public var securityProperties: WsSecurityProperties = WsSecurityProperties(),
    public var sspiTransportSecurityBinding: WsSspiTransportSecurityBindingPolicyDescription = WsSspiTransportSecurityBindingPolicyDescription(),
)

public data class WsTcpSspiTransportSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var clientCredential: WsWindowsIntegratedAuthCredential? = null,
)

public data class WsTcpSspiTransportSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
)

public data class WsTcpSspiTransportSecurityBindingTemplate(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var clientCredential: WsWindowsIntegratedAuthCredential? = null,
)

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
)

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
)

public data class WsThumbprintCertCredential(
    public var credential: WsCertCredential = WsCertCredential(),
    public var storeLocation: UInt = 0u,
    public var storeName: WsString = WsString(),
    public var thumbprint: WsString = WsString(),
)

public data class WsTimespan(
    public var ticks: Long = 0L,
)

public data class WsTimespanDescription(
    public var minValue: WsTimespan = WsTimespan(),
    public var maxValue: WsTimespan = WsTimespan(),
)

public data class WsUint16Description(
    public var minValue: UShort = 0u,
    public var maxValue: UShort = 0u,
)

public data class WsUint32Description(
    public var minValue: UInt = 0u,
    public var maxValue: UInt = 0u,
)

public data class WsUint64Description(
    public var minValue: ULong = 0uL,
    public var maxValue: ULong = 0uL,
)

public data class WsUint8Description(
    public var minValue: UByte = 0u,
    public var maxValue: UByte = 0u,
)

public data class WsUnionDescription(
    public var size: UInt = 0u,
    public var alignment: UInt = 0u,
    public var fields: COpaquePointer? = null,
    public var fieldCount: UInt = 0u,
    public var enumOffset: UInt = 0u,
    public var noneEnumValue: Int = 0,
    public var valueIndices: UInt? = null,
)

public data class WsUnionFieldDescription(
    public var value: Int = 0,
    public var field: WsFieldDescription = WsFieldDescription(),
)

public data class WsUniqueId(
    public var uri: WsString = WsString(),
    public var guid: Guid = Guid(),
)

public data class WsUniqueIdDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
)

public data class WsUnknownEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var element: Int? = null,
)

public data class WsUpnEndpointIdentity(
    public var identity: WsEndpointIdentity = WsEndpointIdentity(),
    public var upn: WsString = WsString(),
)

public data class WsUrl(
    public var scheme: WsUrlSchemeType = 0,
)

public data class WsUsernameCredential(
    public var credentialType: WsUsernameCredentialType = 0,
)

public data class WsUsernameMessageSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
    public var clientCredential: WsUsernameCredential? = null,
    public var passwordValidator: WsValidatePasswordCallback = null,
    public var passwordValidatorCallbackState: COpaquePointer? = null,
)

public data class WsUsernameMessageSecurityBindingConstraint(
    public var bindingConstraint: WsSecurityBindingConstraint = WsSecurityBindingConstraint(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
)

public data class WsUsernameMessageSecurityBindingPolicyDescription(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
)

public data class WsUsernameMessageSecurityBindingTemplate(
    public var securityBindingProperties: WsSecurityBindingProperties = WsSecurityBindingProperties(),
    public var clientCredential: WsUsernameCredential? = null,
    public var passwordValidator: WsValidatePasswordCallback = null,
    public var passwordValidatorCallbackState: COpaquePointer? = null,
)

public data class WsUtf8ArrayDescription(
    public var minByteCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
)

public data class WsVoidDescription(
    public var size: UInt = 0u,
)

public data class WsWindowsIntegratedAuthCredential(
    public var credentialType: WsWindowsIntegratedAuthCredentialType = 0,
)

public data class WsWszDescription(
    public var minCharCount: UInt = 0u,
    public var maxCharCount: UInt = 0u,
)

public data class WsXmlAttribute(
    public var singleQuote: UByte = 0u,
    public var isXmlNs: UByte = 0u,
    public var prefix: WsXmlString? = null,
    public var localName: WsXmlString? = null,
    public var ns: WsXmlString? = null,
    public var value: WsXmlText? = null,
)

public data class WsXmlBase64Text(
    public var text: WsXmlText = WsXmlText(),
    public var bytes: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class WsXmlBoolText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Bool = 0,
)

public data class WsXmlBufferProperty(
    public var id: WsXmlBufferPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsXmlCanonicalizationInclusivePrefixes(
    public var prefixCount: UInt = 0u,
    public var prefixes: WsXmlString? = null,
)

public data class WsXmlCanonicalizationProperty(
    public var id: WsXmlCanonicalizationPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsXmlCommentNode(
    public var node: WsXmlNode = WsXmlNode(),
    public var value: WsXmlString = WsXmlString(),
)

public data class WsXmlDatetimeText(
    public var text: WsXmlText = WsXmlText(),
    public var value: WsDatetime = WsDatetime(),
)

public data class WsXmlDecimalText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Decimal = Decimal(),
)

public data class WsXmlDictionary(
    public var guid: Guid = Guid(),
    public var strings: WsXmlString? = null,
    public var stringCount: UInt = 0u,
    public var isConst: Bool = 0,
)

public data class WsXmlDoubleText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Double = 0.0,
)

public data class WsXmlElementNode(
    public var node: WsXmlNode = WsXmlNode(),
    public var prefix: WsXmlString? = null,
    public var localName: WsXmlString? = null,
    public var ns: WsXmlString? = null,
    public var attributeCount: UInt = 0u,
    public var attributes: COpaquePointer? = null,
    public var isEmpty: Bool = 0,
)

public data class WsXmlFloatText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Float = 0.0f,
)

public data class WsXmlGuidText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Guid = Guid(),
)

public data class WsXmlInt32Text(
    public var text: WsXmlText = WsXmlText(),
    public var value: Int = 0,
)
