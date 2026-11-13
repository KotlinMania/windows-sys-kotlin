package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

public val DIRECTED_DISCOVERY: DeviceDiscoveryMechanism = 1

public val MULTICAST_DISCOVERY: DeviceDiscoveryMechanism = 0

public val ONE_WAY: WSDUdpMessageType = 0

public val OP_ANY_ELEMENT: WsdxmlOp = 6

public val OP_ANY_ELEMENTS: WsdxmlOp = 7

public val OP_ANY_NUMBER: WsdxmlOp = 17

public val OP_ANY_TEXT: WsdxmlOp = 8

public val OP_ANYTHING: WsdxmlOp = 16

public val OP_ATTRIBUTE: WsdxmlOp = 9

public val OP_BEGIN_ALL: WsdxmlOp = 14

public val OP_BEGIN_ANY_ELEMENT: WsdxmlOp = 3

public val OP_BEGIN_CHOICE: WsdxmlOp = 10

public val OP_BEGIN_ELEMENT: WsdxmlOp = 2

public val OP_BEGIN_SEQUENCE: WsdxmlOp = 12

public val OP_ELEMENT: WsdxmlOp = 5

public val OP_END_ALL: WsdxmlOp = 15

public val OP_END_CHOICE: WsdxmlOp = 11

public val OP_END_ELEMENT: WsdxmlOp = 4

public val OP_END_OF_TABLE: WsdxmlOp = 1

public val OP_END_SEQUENCE: WsdxmlOp = 13

public val OP_FORMAT_BOOL: WsdxmlOp = 20

public val OP_FORMAT_DATE_TIME: WsdxmlOp = 40

public val OP_FORMAT_DOM: WsdxmlOp = 30

public val OP_FORMAT_DOUBLE: WsdxmlOp = 42

public val OP_FORMAT_DURATION: WsdxmlOp = 39

public val OP_FORMAT_DYNAMIC_TYPE: WsdxmlOp = 37

public val OP_FORMAT_FLOAT: WsdxmlOp = 41

public val OP_FORMAT_INT16: WsdxmlOp = 22

public val OP_FORMAT_INT32: WsdxmlOp = 23

public val OP_FORMAT_INT64: WsdxmlOp = 24

public val OP_FORMAT_INT8: WsdxmlOp = 21

public val OP_FORMAT_LIST_INSERT_TAIL: WsdxmlOp = 35

public val OP_FORMAT_LOOKUP_TYPE: WsdxmlOp = 38

public val OP_FORMAT_MAX: WsdxmlOp = 46

public val OP_FORMAT_NAME: WsdxmlOp = 34

public val OP_FORMAT_STRUCT: WsdxmlOp = 31

public val OP_FORMAT_TYPE: WsdxmlOp = 36

public val OP_FORMAT_U_INT16: WsdxmlOp = 26

public val OP_FORMAT_U_INT32: WsdxmlOp = 27

public val OP_FORMAT_U_INT64: WsdxmlOp = 28

public val OP_FORMAT_U_INT8: WsdxmlOp = 25

public val OP_FORMAT_UNICODE_STRING: WsdxmlOp = 29

public val OP_FORMAT_URI: WsdxmlOp = 32

public val OP_FORMAT_UUID_URI: WsdxmlOp = 33

public val OP_FORMAT_XML_DECLARATION: WsdxmlOp = 45

public val OP_NONE: WsdxmlOp = 0

public val OP_ONE_OR_MORE: WsdxmlOp = 18

public val OP_OPTIONAL: WsdxmlOp = 19

public val OP_PROCESS: WsdxmlOp = 43

public val OP_QUALIFIED_ATTRIBUTE: WsdxmlOp = 44

public val SECURE_DIRECTED_DISCOVERY: DeviceDiscoveryMechanism = 2

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

public val WSD_CONFIG_DEVICE_ADDRESSES: WsdConfigParamType = 10

public val WSD_CONFIG_HOSTING_ADDRESSES: WsdConfigParamType = 9

public val WSD_CONFIG_MAX_INBOUND_MESSAGE_SIZE: WsdConfigParamType = 1

public val WSD_CONFIG_MAX_OUTBOUND_MESSAGE_SIZE: WsdConfigParamType = 2

public val WSD_DEFAULT_EVENTING_ADDRESS: Pcwstr = w("http://*:5357/")

public val WSD_DEFAULT_HOSTING_ADDRESS: Pcwstr = w("http://*:5357/")

public val WSD_DEFAULT_SECURE_HOSTING_ADDRESS: Pcwstr = w("https://*:5358/")

public val WSD_PT_ALL: WsdProtocolType = 255

public val WSD_PT_HTTP: WsdProtocolType = 2

public val WSD_PT_HTTPS: WsdProtocolType = 4

public val WSD_PT_NONE: WsdProtocolType = 0

public val WSD_PT_UDP: WsdProtocolType = 1

public val WSD_SECURITY_COMPACTSIG_SIGNING_CERT: WsdConfigParamType = 7

public val WSD_SECURITY_COMPACTSIG_VALIDATION: WsdConfigParamType = 8

public val WSD_SECURITY_HTTP_AUTH_SCHEME_NEGOTIATE: UInt = 1u

public val WSD_SECURITY_HTTP_AUTH_SCHEME_NTLM: UInt = 2u

public val WSD_SECURITY_REQUIRE_CLIENT_CERT_OR_HTTP_CLIENT_AUTH: WsdConfigParamType = 12

public val WSD_SECURITY_REQUIRE_HTTP_CLIENT_AUTH: WsdConfigParamType = 11

public val WSD_SECURITY_SSL_CERT_FOR_CLIENT_AUTH: WsdConfigParamType = 3

public val WSD_SECURITY_SSL_CLIENT_CERT_VALIDATION: WsdConfigParamType = 5

public val WSD_SECURITY_SSL_NEGOTIATE_CLIENT_CERT: WsdConfigParamType = 6

public val WSD_SECURITY_SSL_SERVER_CERT_VALIDATION: WsdConfigParamType = 4

public val WSD_SECURITY_USE_HTTP_CLIENT_AUTH: WsdConfigParamType = 13
