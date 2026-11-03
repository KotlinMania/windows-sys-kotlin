package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val DirectedDiscovery: DeviceDiscoveryMechanism = 1

public val MulticastDiscovery: DeviceDiscoveryMechanism = 0

public val ONE_WAY: WSDUdpMessageType = 0

public val OpAnyElement: WSDXML_OP = 6

public val OpAnyElements: WSDXML_OP = 7

public val OpAnyNumber: WSDXML_OP = 17

public val OpAnyText: WSDXML_OP = 8

public val OpAnything: WSDXML_OP = 16

public val OpAttribute_: WSDXML_OP = 9

public val OpBeginAll: WSDXML_OP = 14

public val OpBeginAnyElement: WSDXML_OP = 3

public val OpBeginChoice: WSDXML_OP = 10

public val OpBeginElement_: WSDXML_OP = 2

public val OpBeginSequence: WSDXML_OP = 12

public val OpElement_: WSDXML_OP = 5

public val OpEndAll: WSDXML_OP = 15

public val OpEndChoice: WSDXML_OP = 11

public val OpEndElement: WSDXML_OP = 4

public val OpEndOfTable: WSDXML_OP = 1

public val OpEndSequence: WSDXML_OP = 13

public val OpFormatBool_: WSDXML_OP = 20

public val OpFormatDateTime_: WSDXML_OP = 40

public val OpFormatDom_: WSDXML_OP = 30

public val OpFormatDouble_: WSDXML_OP = 42

public val OpFormatDuration_: WSDXML_OP = 39

public val OpFormatDynamicType_: WSDXML_OP = 37

public val OpFormatFloat_: WSDXML_OP = 41

public val OpFormatInt16_: WSDXML_OP = 22

public val OpFormatInt32_: WSDXML_OP = 23

public val OpFormatInt64_: WSDXML_OP = 24

public val OpFormatInt8_: WSDXML_OP = 21

public val OpFormatListInsertTail_: WSDXML_OP = 35

public val OpFormatLookupType_: WSDXML_OP = 38

public val OpFormatMax: WSDXML_OP = 46

public val OpFormatName_: WSDXML_OP = 34

public val OpFormatStruct_: WSDXML_OP = 31

public val OpFormatType_: WSDXML_OP = 36

public val OpFormatUInt16_: WSDXML_OP = 26

public val OpFormatUInt32_: WSDXML_OP = 27

public val OpFormatUInt64_: WSDXML_OP = 28

public val OpFormatUInt8_: WSDXML_OP = 25

public val OpFormatUnicodeString_: WSDXML_OP = 29

public val OpFormatUri_: WSDXML_OP = 32

public val OpFormatUuidUri_: WSDXML_OP = 33

public val OpFormatXMLDeclaration_: WSDXML_OP = 45

public val OpNone: WSDXML_OP = 0

public val OpOneOrMore: WSDXML_OP = 18

public val OpOptional: WSDXML_OP = 19

public val OpProcess_: WSDXML_OP = 43

public val OpQualifiedAttribute_: WSDXML_OP = 44

public val SecureDirectedDiscovery: DeviceDiscoveryMechanism = 2

public val TWO_WAY: WSDUdpMessageType = 1

public val WSDAPI_ADDRESSFAMILY_IPV4: UInt = 1u

public val WSDAPI_ADDRESSFAMILY_IPV6: UInt = 2u

public val WSDAPI_COMPACTSIG_ACCEPT_ALL_MESSAGES: UInt = 1u

public val WSDAPI_OPTION_MAX_INBOUND_MESSAGE_SIZE: UInt = 1u

public val WSDAPI_OPTION_TRACE_XML_TO_DEBUGGER: UInt = 2u

public val WSDAPI_OPTION_TRACE_XML_TO_FILE: UInt = 3u

public val WSDAPI_SSL_CERT_APPLY_DEFAULT_CHECKS: UInt = 0u

public val WSDAPI_SSL_CERT_IGNORE_EXPIRY: UInt = 2u

public val WSDAPI_SSL_CERT_IGNORE_INVALID_CN: UInt = 16u

public val WSDAPI_SSL_CERT_IGNORE_REVOCATION: UInt = 1u

public val WSDAPI_SSL_CERT_IGNORE_UNKNOWN_CA: UInt = 8u

public val WSDAPI_SSL_CERT_IGNORE_WRONG_USAGE: UInt = 4u

public val WSDET_INCOMING_FAULT: WSDEventType = 2

public val WSDET_INCOMING_MESSAGE: WSDEventType = 1

public val WSDET_NONE: WSDEventType = 0

public val WSDET_RESPONSE_TIMEOUT: WSDEventType = 4

public val WSDET_TRANSMISSION_FAILURE: WSDEventType = 3

public val WSD_CONFIG_DEVICE_ADDRESSES: WSD_CONFIG_PARAM_TYPE = 10

public val WSD_CONFIG_HOSTING_ADDRESSES: WSD_CONFIG_PARAM_TYPE = 9

public val WSD_CONFIG_MAX_INBOUND_MESSAGE_SIZE: WSD_CONFIG_PARAM_TYPE = 1

public val WSD_CONFIG_MAX_OUTBOUND_MESSAGE_SIZE: WSD_CONFIG_PARAM_TYPE = 2

public val WSD_DEFAULT_EVENTING_ADDRESS: PCWSTR = w("http://*:5357/")

public val WSD_DEFAULT_HOSTING_ADDRESS: PCWSTR = w("http://*:5357/")

public val WSD_DEFAULT_SECURE_HOSTING_ADDRESS: PCWSTR = w("https://*:5358/")

public val WSD_PT_ALL: WSD_PROTOCOL_TYPE = 255

public val WSD_PT_HTTP: WSD_PROTOCOL_TYPE = 2

public val WSD_PT_HTTPS: WSD_PROTOCOL_TYPE = 4

public val WSD_PT_NONE: WSD_PROTOCOL_TYPE = 0

public val WSD_PT_UDP: WSD_PROTOCOL_TYPE = 1

public val WSD_SECURITY_COMPACTSIG_SIGNING_CERT: WSD_CONFIG_PARAM_TYPE = 7

public val WSD_SECURITY_COMPACTSIG_VALIDATION: WSD_CONFIG_PARAM_TYPE = 8

public val WSD_SECURITY_HTTP_AUTH_SCHEME_NEGOTIATE: UInt = 1u

public val WSD_SECURITY_HTTP_AUTH_SCHEME_NTLM: UInt = 2u

public val WSD_SECURITY_REQUIRE_CLIENT_CERT_OR_HTTP_CLIENT_AUTH: WSD_CONFIG_PARAM_TYPE = 12

public val WSD_SECURITY_REQUIRE_HTTP_CLIENT_AUTH: WSD_CONFIG_PARAM_TYPE = 11

public val WSD_SECURITY_SSL_CERT_FOR_CLIENT_AUTH: WSD_CONFIG_PARAM_TYPE = 3

public val WSD_SECURITY_SSL_CLIENT_CERT_VALIDATION: WSD_CONFIG_PARAM_TYPE = 5

public val WSD_SECURITY_SSL_NEGOTIATE_CLIENT_CERT: WSD_CONFIG_PARAM_TYPE = 6

public val WSD_SECURITY_SSL_SERVER_CERT_VALIDATION: WSD_CONFIG_PARAM_TYPE = 4

public val WSD_SECURITY_USE_HTTP_CLIENT_AUTH: WSD_CONFIG_PARAM_TYPE = 13
