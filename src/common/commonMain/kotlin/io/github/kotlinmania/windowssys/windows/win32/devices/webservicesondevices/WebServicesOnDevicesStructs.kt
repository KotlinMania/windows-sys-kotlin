package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class REQUESTBODY_GetStatus(public var Any: Long = 0L)

public data class REQUESTBODY_Renew(public var Expires: Long = 0L, public var Any: Long = 0L)

public data class REQUESTBODY_Subscribe(
    public var EndTo: Long = 0L,
    public var Delivery: Long = 0L,
    public var Expires: Long = 0L,
    public var Filter: Long = 0L,
    public var Any: Long = 0L,
)

public data class REQUESTBODY_Unsubscribe(public var any: Long = 0L)

public data class RESPONSEBODY_GetMetadata(public var Metadata: Long = 0L)

public data class RESPONSEBODY_GetStatus(public var expires: Long = 0L, public var any: Long = 0L)

public data class RESPONSEBODY_Renew(public var expires: Long = 0L, public var any: Long = 0L)

public data class RESPONSEBODY_Subscribe(
    public var SubscriptionManager: Long = 0L,
    public var expires: Long = 0L,
    public var any: Long = 0L,
)

public data class RESPONSEBODY_SubscriptionEnd(
    public var SubscriptionManager: Long = 0L,
    public var Status: PCWSTR = 0L,
    public var Reason: Long = 0L,
    public var Any: Long = 0L,
)

public data class WSDUdpRetransmitParams(
    public var ulSendDelay: UInt = 0u,
    public var ulRepeat: UInt = 0u,
    public var ulRepeatMinDelay: UInt = 0u,
    public var ulRepeatMaxDelay: UInt = 0u,
    public var ulRepeatUpperDelay: UInt = 0u,
)

public data class WSDXML_ATTRIBUTE(
    public var Element: Long = 0L,
    public var Next: Long = 0L,
    public var Name: Long = 0L,
    public var Value: PWSTR = 0L,
)

public data class WSDXML_ELEMENT(
    public var Node: WSDXML_NODE = WSDXML_NODE(),
    public var Name: Long = 0L,
    public var FirstAttribute: Long = 0L,
    public var FirstChild: Long = 0L,
    public var PrefixMappings: Long = 0L,
)

public data class WSDXML_ELEMENT_LIST(public var Next: Long = 0L, public var Element: Long = 0L)

public data class WSDXML_NAME(public var Space: Long = 0L, public var LocalName: PWSTR = 0L)

public data class WSDXML_NAMESPACE(
    public var Uri: PCWSTR = 0L,
    public var PreferredPrefix: PCWSTR = 0L,
    public var Names: Long = 0L,
    public var NamesCount: UShort = 0u,
    public var Encoding: UShort = 0u,
)

public data class WSDXML_NODE(
    public var Type: Int = 0,
    public var Parent: Long = 0L,
    public var Next: Long = 0L,
) {
    public companion object {
        public val ElementType: Int = 0

        public val TextType: Int = 1
    }
}

public data class WSDXML_PREFIX_MAPPING(
    public var Refs: UInt = 0u,
    public var Next: Long = 0L,
    public var Space: Long = 0L,
    public var Prefix: PWSTR = 0L,
)

public data class WSDXML_TEXT(public var Node: WSDXML_NODE = WSDXML_NODE(), public var Text: PWSTR = 0L)

public data class WSDXML_TYPE(public var Uri: PCWSTR = 0L, public var Table: Long = 0L)

public data class WSD_APP_SEQUENCE(
    public var InstanceId: ULong = 0uL,
    public var SequenceId: PCWSTR = 0L,
    public var MessageNumber: ULong = 0uL,
)

public data class WSD_BYE(public var EndpointReference: Long = 0L, public var Any: Long = 0L)

public data class WSD_CONFIG_ADDRESSES(public var addresses: Long = 0L, public var dwAddressCount: UInt = 0u)

public data class WSD_CONFIG_PARAM(
    public var configParamType: WSD_CONFIG_PARAM_TYPE = 0,
    public var pConfigData: Long = 0L,
    public var dwConfigDataSize: UInt = 0u,
)

public data class WSD_DATETIME(
    public var isPositive: BOOL = 0,
    public var year: UInt = 0u,
    public var month: UByte = 0u,
    public var day: UByte = 0u,
    public var hour: UByte = 0u,
    public var minute: UByte = 0u,
    public var second: UByte = 0u,
    public var millisecond: UInt = 0u,
    public var TZIsLocal: BOOL = 0,
    public var TZIsPositive: BOOL = 0,
    public var TZHour: UByte = 0u,
    public var TZMinute: UByte = 0u,
)

public data class WSD_DURATION(
    public var isPositive: BOOL = 0,
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var millisecond: UInt = 0u,
)

public data class WSD_ENDPOINT_REFERENCE(
    public var Address: PCWSTR = 0L,
    public var ReferenceProperties: WSD_REFERENCE_PROPERTIES = WSD_REFERENCE_PROPERTIES(),
    public var ReferenceParameters: WSD_REFERENCE_PARAMETERS = WSD_REFERENCE_PARAMETERS(),
    public var PortType: Long = 0L,
    public var ServiceName: Long = 0L,
    public var Any: Long = 0L,
)

public data class WSD_ENDPOINT_REFERENCE_LIST(public var Next: Long = 0L, public var Element: Long = 0L)

public data class WSD_EVENT(
    public var Hr: HRESULT = 0,
    public var EventType: UInt = 0u,
    public var DispatchTag: PWSTR = 0L,
    public var HandlerContext: WSD_HANDLER_CONTEXT = WSD_HANDLER_CONTEXT(),
    public var Soap: Long = 0L,
    public var Operation: Long = 0L,
    public var MessageParameters: Long = 0L,
)

public data class WSD_EVENTING_DELIVERY_MODE(
    public var Mode: PCWSTR = 0L,
    public var Push: Long = 0L,
    public var Data: Long = 0L,
)

public data class WSD_EVENTING_DELIVERY_MODE_PUSH(public var NotifyTo: Long = 0L)

public data class WSD_EVENTING_EXPIRES(public var Duration: Long = 0L, public var DateTime: Long = 0L)

public data class WSD_EVENTING_FILTER(
    public var Dialect: PCWSTR = 0L,
    public var FilterAction: Long = 0L,
    public var Data: Long = 0L,
)

public data class WSD_EVENTING_FILTER_ACTION(public var Actions: Long = 0L)

public data class WSD_HANDLER_CONTEXT(
    public var Handler: PWSD_SOAP_MESSAGE_HANDLER = null,
    public var PVoid: Long = 0L,
    public var Unknown: Long = 0L,
)

public data class WSD_HEADER_RELATESTO(public var RelationshipType: Long = 0L, public var MessageID: PCWSTR = 0L)

public data class WSD_HELLO(
    public var EndpointReference: Long = 0L,
    public var Types: Long = 0L,
    public var Scopes: Long = 0L,
    public var XAddrs: Long = 0L,
    public var MetadataVersion: ULong = 0uL,
    public var Any: Long = 0L,
)

public data class WSD_HOST_METADATA(public var Host: Long = 0L, public var Hosted: Long = 0L)

public data class WSD_LOCALIZED_STRING(public var lang: PCWSTR = 0L, public var String: PCWSTR = 0L)

public data class WSD_LOCALIZED_STRING_LIST(public var Next: Long = 0L, public var Element: Long = 0L)

public data class WSD_METADATA_SECTION(
    public var Dialect: PCWSTR = 0L,
    public var Identifier: PCWSTR = 0L,
    public var Data: Long = 0L,
    public var MetadataReference: Long = 0L,
    public var Location: PCWSTR = 0L,
    public var Any: Long = 0L,
)

public data class WSD_METADATA_SECTION_LIST(public var Next: Long = 0L, public var Element: Long = 0L)

public data class WSD_NAME_LIST(public var Next: Long = 0L, public var Element: Long = 0L)

public data class WSD_OPERATION(
    public var RequestType: Long = 0L,
    public var ResponseType: Long = 0L,
    public var RequestStubFunction: WSD_STUB_FUNCTION = null,
)

public data class WSD_PORT_TYPE(
    public var EncodedName: UInt = 0u,
    public var OperationCount: UInt = 0u,
    public var Operations: Long = 0L,
    public var ProtocolType: WSD_PROTOCOL_TYPE = 0,
)

public data class WSD_PROBE(
    public var Types: Long = 0L,
    public var Scopes: Long = 0L,
    public var Any: Long = 0L,
)

public data class WSD_PROBE_MATCH(
    public var EndpointReference: Long = 0L,
    public var Types: Long = 0L,
    public var Scopes: Long = 0L,
    public var XAddrs: Long = 0L,
    public var MetadataVersion: ULong = 0uL,
    public var Any: Long = 0L,
)

public data class WSD_PROBE_MATCHES(public var ProbeMatch: Long = 0L, public var Any: Long = 0L)

public data class WSD_PROBE_MATCH_LIST(public var Next: Long = 0L, public var Element: Long = 0L)

public data class WSD_REFERENCE_PARAMETERS(public var Any: Long = 0L)

public data class WSD_REFERENCE_PROPERTIES(public var Any: Long = 0L)

public data class WSD_RELATIONSHIP_METADATA(
    public var Type: PCWSTR = 0L,
    public var Data: Long = 0L,
    public var Any: Long = 0L,
)

public data class WSD_RESOLVE(public var EndpointReference: Long = 0L, public var Any: Long = 0L)

public data class WSD_RESOLVE_MATCH(
    public var EndpointReference: Long = 0L,
    public var Types: Long = 0L,
    public var Scopes: Long = 0L,
    public var XAddrs: Long = 0L,
    public var MetadataVersion: ULong = 0uL,
    public var Any: Long = 0L,
)

public data class WSD_RESOLVE_MATCHES(public var ResolveMatch: Long = 0L, public var Any: Long = 0L)

public data class WSD_SCOPES(public var MatchBy: PCWSTR = 0L, public var Scopes: Long = 0L)

public data class WSD_SECURITY_CERT_VALIDATION(
    public var certMatchArray: Long = 0L,
    public var dwCertMatchArrayCount: UInt = 0u,
    public var hCertMatchStore: Security.Cryptography.HCERTSTORE = Security.Cryptography.HCERTSTORE(),
    public var hCertIssuerStore: Security.Cryptography.HCERTSTORE = Security.Cryptography.HCERTSTORE(),
    public var dwCertCheckOptions: UInt = 0u,
    public var pszCNGHashAlgId: PCWSTR = 0L,
    public var pbCertHash: Long = 0L,
    public var dwCertHashSize: UInt = 0u,
)

public data class WSD_SECURITY_CERT_VALIDATION_V1(
    public var certMatchArray: Long = 0L,
    public var dwCertMatchArrayCount: UInt = 0u,
    public var hCertMatchStore: Security.Cryptography.HCERTSTORE = Security.Cryptography.HCERTSTORE(),
    public var hCertIssuerStore: Security.Cryptography.HCERTSTORE = Security.Cryptography.HCERTSTORE(),
    public var dwCertCheckOptions: UInt = 0u,
)

public data class WSD_SECURITY_SIGNATURE_VALIDATION(
    public var signingCertArray: Long = 0L,
    public var dwSigningCertArrayCount: UInt = 0u,
    public var hSigningCertStore: Security.Cryptography.HCERTSTORE = Security.Cryptography.HCERTSTORE(),
    public var dwFlags: UInt = 0u,
)

public data class WSD_SERVICE_METADATA(
    public var EndpointReference: Long = 0L,
    public var Types: Long = 0L,
    public var ServiceId: PCWSTR = 0L,
    public var Any: Long = 0L,
)

public data class WSD_SERVICE_METADATA_LIST(public var Next: Long = 0L, public var Element: Long = 0L)

public data class WSD_SOAP_FAULT(
    public var Code: Long = 0L,
    public var Reason: Long = 0L,
    public var Node: PCWSTR = 0L,
    public var Role: PCWSTR = 0L,
    public var Detail: Long = 0L,
)

public data class WSD_SOAP_FAULT_CODE(public var Value: Long = 0L, public var Subcode: Long = 0L)

public data class WSD_SOAP_FAULT_REASON(public var Text: Long = 0L)

public data class WSD_SOAP_FAULT_SUBCODE(public var Value: Long = 0L, public var Subcode: Long = 0L)

public data class WSD_SOAP_HEADER(
    public var To: PCWSTR = 0L,
    public var Action: PCWSTR = 0L,
    public var MessageID: PCWSTR = 0L,
    public var RelatesTo: WSD_HEADER_RELATESTO = WSD_HEADER_RELATESTO(),
    public var ReplyTo: Long = 0L,
    public var From: Long = 0L,
    public var FaultTo: Long = 0L,
    public var AppSequence: Long = 0L,
    public var AnyHeaders: Long = 0L,
)

public data class WSD_SOAP_MESSAGE(
    public var Header: WSD_SOAP_HEADER = WSD_SOAP_HEADER(),
    public var Body: Long = 0L,
    public var BodyType: Long = 0L,
)

public data class WSD_SYNCHRONOUS_RESPONSE_CONTEXT(
    public var hr: HRESULT = 0,
    public var eventHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var messageParameters: Long = 0L,
    public var results: Long = 0L,
)

public data class WSD_THIS_DEVICE_METADATA(
    public var FriendlyName: Long = 0L,
    public var FirmwareVersion: PCWSTR = 0L,
    public var SerialNumber: PCWSTR = 0L,
    public var Any: Long = 0L,
)

public data class WSD_THIS_MODEL_METADATA(
    public var Manufacturer: Long = 0L,
    public var ManufacturerUrl: PCWSTR = 0L,
    public var ModelName: Long = 0L,
    public var ModelNumber: PCWSTR = 0L,
    public var ModelUrl: PCWSTR = 0L,
    public var PresentationUrl: PCWSTR = 0L,
    public var Any: Long = 0L,
)

public data class WSD_UNKNOWN_LOOKUP(public var Any: Long = 0L)

public data class WSD_URI_LIST(public var Next: Long = 0L, public var Element: PCWSTR = 0L)
