package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

public data class RequestbodyGetStatus(public var any: WsdxmlElement? = null)

public data class RequestbodyRenew(public var expires: WsdEventingExpires? = null, public var any: WsdxmlElement? = null)

public data class RequestbodySubscribe(
    public var endTo: WsdEndpointReference? = null,
    public var delivery: WsdEventingDeliveryMode? = null,
    public var expires: WsdEventingExpires? = null,
    public var filter: WsdEventingFilter? = null,
    public var any: WsdxmlElement? = null,
)

public data class RequestbodyUnsubscribe(public var any: WsdxmlElement? = null)

public data class ResponsebodyGetMetadata(public var metadata: WsdMetadataSectionList? = null)

public data class ResponsebodyGetStatus(public var expires: WsdEventingExpires? = null, public var any: WsdxmlElement? = null)

public data class ResponsebodyRenew(public var expires: WsdEventingExpires? = null, public var any: WsdxmlElement? = null)

public data class ResponsebodySubscribe(
    public var subscriptionManager: WsdEndpointReference? = null,
    public var expires: WsdEventingExpires? = null,
    public var any: WsdxmlElement? = null,
)

public data class ResponsebodySubscriptionEnd(
    public var subscriptionManager: WsdEndpointReference? = null,
    public var status: Pcwstr = null,
    public var reason: WsdLocalizedString? = null,
    public var any: WsdxmlElement? = null,
)

public data class WSDUdpRetransmitParams(
    public var ulSendDelay: UInt = 0u,
    public var ulRepeat: UInt = 0u,
    public var ulRepeatMinDelay: UInt = 0u,
    public var ulRepeatMaxDelay: UInt = 0u,
    public var ulRepeatUpperDelay: UInt = 0u,
)

public data class WsdxmlAttribute(
    public var element: WsdxmlElement? = null,
    public var next: WsdxmlAttribute? = null,
    public var name: WsdxmlName? = null,
    public var value: Pwstr = null,
)

public data class WsdxmlElement(
    public var node: WsdxmlNode = WsdxmlNode(),
    public var name: WsdxmlName? = null,
    public var firstAttribute: WsdxmlAttribute? = null,
    public var firstChild: WsdxmlNode? = null,
    public var prefixMappings: WsdxmlPrefixMapping? = null,
)

public data class WsdxmlElementList(public var next: WsdxmlElementList? = null, public var element: WsdxmlElement? = null)

public data class WsdxmlName(public var space: WsdxmlNamespace? = null, public var localName: Pwstr = null)

public data class WsdxmlNamespace(
    public var uri: Pcwstr = null,
    public var preferredPrefix: Pcwstr = null,
    public var names: WsdxmlName? = null,
    public var namesCount: UShort = 0u,
    public var encoding: UShort = 0u,
)

public data class WsdxmlNode(
    public var type: Int = 0,
    public var parent: WsdxmlElement? = null,
    public var next: WsdxmlNode? = null,
) {
    public companion object {
        public val ELEMENT_TYPE: Int = 0

        public val TEXT_TYPE: Int = 1
    }
}

public data class WsdxmlPrefixMapping(
    public var refs: UInt = 0u,
    public var next: WsdxmlPrefixMapping? = null,
    public var space: WsdxmlNamespace? = null,
    public var prefix: Pwstr = null,
)

public data class WsdxmlText(public var node: WsdxmlNode = WsdxmlNode(), public var text: Pwstr = null)

public data class WsdxmlType(public var uri: Pcwstr = null, public var table: COpaquePointer? = null)

public data class WsdAppSequence(
    public var instanceId: ULong = 0uL,
    public var sequenceId: Pcwstr = null,
    public var messageNumber: ULong = 0uL,
)

public data class WsdBye(public var endpointReference: WsdEndpointReference? = null, public var any: WsdxmlElement? = null)

public data class WsdConfigAddresses(public var addresses: COpaquePointer? = null, public var dwAddressCount: UInt = 0u)

public data class WsdConfigParam(
    public var configParamType: WsdConfigParamType = 0,
    public var pConfigData: COpaquePointer? = null,
    public var dwConfigDataSize: UInt = 0u,
)

public data class WsdDatetime(
    public var isPositive: Bool = 0,
    public var year: UInt = 0u,
    public var month: UByte = 0u,
    public var day: UByte = 0u,
    public var hour: UByte = 0u,
    public var minute: UByte = 0u,
    public var second: UByte = 0u,
    public var millisecond: UInt = 0u,
    public var tZIsLocal: Bool = 0,
    public var tZIsPositive: Bool = 0,
    public var tZHour: UByte = 0u,
    public var tZMinute: UByte = 0u,
)

public data class WsdDuration(
    public var isPositive: Bool = 0,
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var millisecond: UInt = 0u,
)

public data class WsdEndpointReference(
    public var address: Pcwstr = null,
    public var referenceProperties: WsdReferenceProperties = WsdReferenceProperties(),
    public var referenceParameters: WsdReferenceParameters = WsdReferenceParameters(),
    public var portType: WsdxmlName? = null,
    public var serviceName: WsdxmlName? = null,
    public var any: WsdxmlElement? = null,
)

public data class WsdEndpointReferenceList(public var next: WsdEndpointReferenceList? = null, public var element: WsdEndpointReference? = null)

public data class WsdEvent(
    public var hr: Hresult = 0,
    public var eventType: UInt = 0u,
    public var dispatchTag: Pwstr = null,
    public var handlerContext: WsdHandlerContext = WsdHandlerContext(),
    public var soap: WsdSoapMessage? = null,
    public var operation: WsdOperation? = null,
    public var messageParameters: COpaquePointer? = null,
)

public data class WsdEventingDeliveryMode(
    public var mode: Pcwstr = null,
    public var push: WsdEventingDeliveryModePush? = null,
    public var data: COpaquePointer? = null,
)

public data class WsdEventingDeliveryModePush(public var notifyTo: WsdEndpointReference? = null)

public data class WsdEventingExpires(public var duration: WsdDuration? = null, public var dateTime: WsdDatetime? = null)

public data class WsdEventingFilter(
    public var dialect: Pcwstr = null,
    public var filterAction: WsdEventingFilterAction? = null,
    public var data: COpaquePointer? = null,
)

public data class WsdEventingFilterAction(public var actions: WsdUriList? = null)

public data class WsdHandlerContext(
    public var handler: PwsdSoapMessageHandler = null,
    public var pVoid: COpaquePointer? = null,
    public var unknown: COpaquePointer? = null,
)

public data class WsdHeaderRelatesto(public var relationshipType: WsdxmlName? = null, public var messageID: Pcwstr = null)

public data class WsdHello(
    public var endpointReference: WsdEndpointReference? = null,
    public var types: WsdNameList? = null,
    public var scopes: WsdScopes? = null,
    public var xAddrs: WsdUriList? = null,
    public var metadataVersion: ULong = 0uL,
    public var any: WsdxmlElement? = null,
)

public data class WsdHostMetadata(public var host: WsdServiceMetadata? = null, public var hosted: WsdServiceMetadataList? = null)

public data class WsdLocalizedString(public var lang: Pcwstr = null, public var string: Pcwstr = null)

public data class WsdLocalizedStringList(public var next: WsdLocalizedStringList? = null, public var element: WsdLocalizedString? = null)

public data class WsdMetadataSection(
    public var dialect: Pcwstr = null,
    public var identifier: Pcwstr = null,
    public var data: COpaquePointer? = null,
    public var metadataReference: WsdEndpointReference? = null,
    public var location: Pcwstr = null,
    public var any: WsdxmlElement? = null,
)

public data class WsdMetadataSectionList(public var next: WsdMetadataSectionList? = null, public var element: WsdMetadataSection? = null)

public data class WsdNameList(public var next: WsdNameList? = null, public var element: WsdxmlName? = null)

public data class WsdOperation(
    public var requestType: WsdxmlType? = null,
    public var responseType: WsdxmlType? = null,
    public var requestStubFunction: WsdStubFunction = null,
)

public data class WsdPortType(
    public var encodedName: UInt = 0u,
    public var operationCount: UInt = 0u,
    public var operations: WsdOperation? = null,
    public var protocolType: WsdProtocolType = 0,
)

public data class WsdProbe(
    public var types: WsdNameList? = null,
    public var scopes: WsdScopes? = null,
    public var any: WsdxmlElement? = null,
)

public data class WsdProbeMatch(
    public var endpointReference: WsdEndpointReference? = null,
    public var types: WsdNameList? = null,
    public var scopes: WsdScopes? = null,
    public var xAddrs: WsdUriList? = null,
    public var metadataVersion: ULong = 0uL,
    public var any: WsdxmlElement? = null,
)

public data class WsdProbeMatches(public var probeMatch: WsdProbeMatchList? = null, public var any: WsdxmlElement? = null)

public data class WsdProbeMatchList(public var next: WsdProbeMatchList? = null, public var element: WsdProbeMatch? = null)

public data class WsdReferenceParameters(public var any: WsdxmlElement? = null)

public data class WsdReferenceProperties(public var any: WsdxmlElement? = null)

public data class WsdRelationshipMetadata(
    public var type: Pcwstr = null,
    public var data: WsdHostMetadata? = null,
    public var any: WsdxmlElement? = null,
)

public data class WsdResolve(public var endpointReference: WsdEndpointReference? = null, public var any: WsdxmlElement? = null)

public data class WsdResolveMatch(
    public var endpointReference: WsdEndpointReference? = null,
    public var types: WsdNameList? = null,
    public var scopes: WsdScopes? = null,
    public var xAddrs: WsdUriList? = null,
    public var metadataVersion: ULong = 0uL,
    public var any: WsdxmlElement? = null,
)

public data class WsdResolveMatches(public var resolveMatch: WsdResolveMatch? = null, public var any: WsdxmlElement? = null)

public data class WsdScopes(public var matchBy: Pcwstr = null, public var scopes: WsdUriList? = null)

public data class WsdSecurityCertValidation(
    public var certMatchArray: COpaquePointer? = null,
    public var dwCertMatchArrayCount: UInt = 0u,
    public var hCertMatchStore: Hcertstore = null,
    public var hCertIssuerStore: Hcertstore = null,
    public var dwCertCheckOptions: UInt = 0u,
    public var pszCNGHashAlgId: Pcwstr = null,
    public var pbCertHash: COpaquePointer? = null,
    public var dwCertHashSize: UInt = 0u,
)

public data class WsdSecurityCertValidationV1(
    public var certMatchArray: COpaquePointer? = null,
    public var dwCertMatchArrayCount: UInt = 0u,
    public var hCertMatchStore: Hcertstore = null,
    public var hCertIssuerStore: Hcertstore = null,
    public var dwCertCheckOptions: UInt = 0u,
)

public data class WsdSecuritySignatureValidation(
    public var signingCertArray: COpaquePointer? = null,
    public var dwSigningCertArrayCount: UInt = 0u,
    public var hSigningCertStore: Hcertstore = null,
    public var dwFlags: UInt = 0u,
)

public data class WsdServiceMetadata(
    public var endpointReference: WsdEndpointReferenceList? = null,
    public var types: WsdNameList? = null,
    public var serviceId: Pcwstr = null,
    public var any: WsdxmlElement? = null,
)

public data class WsdServiceMetadataList(public var next: WsdServiceMetadataList? = null, public var element: WsdServiceMetadata? = null)

public data class WsdSoapFault(
    public var code: WsdSoapFaultCode? = null,
    public var reason: WsdSoapFaultReason? = null,
    public var node: Pcwstr = null,
    public var role: Pcwstr = null,
    public var detail: WsdxmlElement? = null,
)

public data class WsdSoapFaultCode(public var value: WsdxmlName? = null, public var subcode: WsdSoapFaultSubcode? = null)

public data class WsdSoapFaultReason(public var text: WsdLocalizedStringList? = null)

public data class WsdSoapFaultSubcode(public var value: WsdxmlName? = null, public var subcode: WsdSoapFaultSubcode? = null)

public data class WsdSoapHeader(
    public var to: Pcwstr = null,
    public var action: Pcwstr = null,
    public var messageID: Pcwstr = null,
    public var relatesTo: WsdHeaderRelatesto = WsdHeaderRelatesto(),
    public var replyTo: WsdEndpointReference? = null,
    public var from: WsdEndpointReference? = null,
    public var faultTo: WsdEndpointReference? = null,
    public var appSequence: WsdAppSequence? = null,
    public var anyHeaders: WsdxmlElement? = null,
)

public data class WsdSoapMessage(
    public var header: WsdSoapHeader = WsdSoapHeader(),
    public var body: COpaquePointer? = null,
    public var bodyType: WsdxmlType? = null,
)

public data class WsdSynchronousResponseContext(
    public var hr: Hresult = 0,
    public var eventHandle: Handle = null,
    public var messageParameters: COpaquePointer? = null,
    public var results: COpaquePointer? = null,
)

public data class WsdThisDeviceMetadata(
    public var friendlyName: WsdLocalizedStringList? = null,
    public var firmwareVersion: Pcwstr = null,
    public var serialNumber: Pcwstr = null,
    public var any: WsdxmlElement? = null,
)

public data class WsdThisModelMetadata(
    public var manufacturer: WsdLocalizedStringList? = null,
    public var manufacturerUrl: Pcwstr = null,
    public var modelName: WsdLocalizedStringList? = null,
    public var modelNumber: Pcwstr = null,
    public var modelUrl: Pcwstr = null,
    public var presentationUrl: Pcwstr = null,
    public var any: WsdxmlElement? = null,
)

public data class WsdUnknownLookup(public var any: WsdxmlElement? = null)

public data class WsdUriList(public var next: WsdUriList? = null, public var element: Pcwstr = null)
