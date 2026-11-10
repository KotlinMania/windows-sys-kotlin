package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ALLOW_NO_AUTH: UInt = 1u

public val ALL_SOURCES: MgmEnumTypes = 1

public val ANY_SOURCE: MgmEnumTypes = 0

public val ATADDRESSLEN: UInt = 32u

public val DO_NOT_ALLOW_NO_AUTH: UInt = 0u

public val ERROR_ACCESSING_TCPCFGDLL: UInt = 727u

public val ERROR_ACCT_DISABLED: UInt = 647u

public val ERROR_ACCT_EXPIRED: UInt = 708u

public val ERROR_ACTION_REQUIRED: UInt = 877u

public val ERROR_ALLOCATING_MEMORY: UInt = 664u

public val ERROR_ALREADY_DISCONNECTING: UInt = 617u

public val ERROR_ASYNC_REQUEST_PENDING: UInt = 616u

public val ERROR_AUTHENTICATION_FAILURE: UInt = 691u

public val ERROR_AUTH_INTERNAL: UInt = 645u

public val ERROR_AUTOMATIC_VPN_FAILED: UInt = 800u

public val ERROR_BAD_ADDRESS_SPECIFIED: UInt = 769u

public val ERROR_BAD_CALLBACK_NUMBER: UInt = 704u

public val ERROR_BAD_PHONE_NUMBER: UInt = 749u

public val ERROR_BAD_STRING: UInt = 637u

public val ERROR_BAD_USAGE_IN_INI_FILE: UInt = 669u

public val ERROR_BIPLEX_PORT_NOT_AVAILABLE: UInt = 712u

public val ERROR_BLOCKED: UInt = 775u

public val ERROR_BROADBAND_ACTIVE: UInt = 813u

public val ERROR_BROADBAND_NO_NIC: UInt = 814u

public val ERROR_BROADBAND_TIMEOUT: UInt = 815u

public val ERROR_BUFFER_INVALID: UInt = 610u

public val ERROR_BUFFER_TOO_SMALL: UInt = 603u

public val ERROR_BUNDLE_NOT_FOUND: UInt = 754u

public val ERROR_CANNOT_DELETE: UInt = 817u

public val ERROR_CANNOT_DO_CUSTOMDIAL: UInt = 755u

public val ERROR_CANNOT_FIND_PHONEBOOK_ENTRY: UInt = 623u

public val ERROR_CANNOT_GET_LANA: UInt = 639u

public val ERROR_CANNOT_INITIATE_MOBIKE_UPDATE: UInt = 844u

public val ERROR_CANNOT_LOAD_PHONEBOOK: UInt = 622u

public val ERROR_CANNOT_LOAD_STRING: UInt = 626u

public val ERROR_CANNOT_OPEN_PHONEBOOK: UInt = 621u

public val ERROR_CANNOT_PROJECT_CLIENT: UInt = 634u

public val ERROR_CANNOT_SET_PORT_INFO: UInt = 605u

public val ERROR_CANNOT_SHARE_CONNECTION: UInt = 763u

public val ERROR_CANNOT_USE_LOGON_CREDENTIALS: UInt = 739u

public val ERROR_CANNOT_WRITE_PHONEBOOK: UInt = 624u

public val ERROR_CERT_FOR_ENCRYPTION_NOT_FOUND: UInt = 781u

public val ERROR_CHANGING_PASSWORD: UInt = 709u

public val ERROR_CMD_TOO_LONG: UInt = 700u

public val ERROR_CONGESTION: UInt = 771u

public val ERROR_CONNECTING_DEVICE_NOT_FOUND: UInt = 797u

public val ERROR_CONNECTION_ALREADY_SHARED: UInt = 758u

public val ERROR_CONNECTION_REJECT: UInt = 770u

public val ERROR_CORRUPT_PHONEBOOK: UInt = 625u

public val ERROR_DCB_NOT_FOUND: UInt = 694u

public val ERROR_DEFAULTOFF_MACRO_NOT_FOUND: UInt = 656u

public val ERROR_DEVICENAME_NOT_FOUND: UInt = 659u

public val ERROR_DEVICENAME_TOO_LONG: UInt = 658u

public val ERROR_DEVICETYPE_DOES_NOT_EXIST: UInt = 609u

public val ERROR_DEVICE_COMPLIANCE: UInt = 875u

public val ERROR_DEVICE_DOES_NOT_EXIST: UInt = 608u

public val ERROR_DEVICE_NOT_READY: UInt = 666u

public val ERROR_DIAL_ALREADY_IN_PROGRESS: UInt = 756u

public val ERROR_DISCONNECTION: UInt = 628u

public val ERROR_DNSNAME_NOT_RESOLVABLE: UInt = 868u

public val ERROR_DONOTDISTURB: UInt = 776u

public val ERROR_EAPTLS_CACHE_CREDENTIALS_INVALID: UInt = 826u

public val ERROR_EAPTLS_PASSWD_INVALID: UInt = 869u

public val ERROR_EAPTLS_SCARD_CACHE_CREDENTIALS_INVALID: UInt = 847u

public val ERROR_EAP_METHOD_DOES_NOT_SUPPORT_SSO: UInt = 851u

public val ERROR_EAP_METHOD_NOT_INSTALLED: UInt = 850u

public val ERROR_EAP_METHOD_OPERATION_NOT_SUPPORTED: UInt = 852u

public val ERROR_EAP_SERVER_CERT_EXPIRED: UInt = 858u

public val ERROR_EAP_SERVER_CERT_INVALID: UInt = 857u

public val ERROR_EAP_SERVER_CERT_OTHER_ERROR: UInt = 860u

public val ERROR_EAP_SERVER_CERT_REVOKED: UInt = 859u

public val ERROR_EAP_SERVER_ROOT_CERT_INVALID: UInt = 865u

public val ERROR_EAP_SERVER_ROOT_CERT_NAME_REQUIRED: UInt = 866u

public val ERROR_EAP_SERVER_ROOT_CERT_NOT_FOUND: UInt = 864u

public val ERROR_EAP_USER_CERT_EXPIRED: UInt = 854u

public val ERROR_EAP_USER_CERT_INVALID: UInt = 853u

public val ERROR_EAP_USER_CERT_OTHER_ERROR: UInt = 856u

public val ERROR_EAP_USER_CERT_REVOKED: UInt = 855u

public val ERROR_EAP_USER_ROOT_CERT_EXPIRED: UInt = 863u

public val ERROR_EAP_USER_ROOT_CERT_INVALID: UInt = 862u

public val ERROR_EAP_USER_ROOT_CERT_NOT_FOUND: UInt = 861u

public val ERROR_EMPTY_INI_FILE: UInt = 690u

public val ERROR_EVENT_INVALID: UInt = 607u

public val ERROR_FAILED_CP_REQUIRED: UInt = 841u

public val ERROR_FAILED_TO_ENCRYPT: UInt = 768u

public val ERROR_FAST_USER_SWITCH: UInt = 831u

public val ERROR_FEATURE_DEPRECATED: UInt = 816u

public val ERROR_FILE_COULD_NOT_BE_OPENED: UInt = 657u

public val ERROR_FROM_DEVICE: UInt = 651u

public val ERROR_HANGUP_FAILED: UInt = 753u

public val ERROR_HARDWARE_FAILURE: UInt = 630u

public val ERROR_HIBERNATION: UInt = 832u

public val ERROR_IDLE_TIMEOUT: UInt = 828u

public val ERROR_IKEV2_PSK_INTERFACE_ALREADY_EXISTS: UInt = 870u

public val ERROR_INCOMPATIBLE: UInt = 772u

public val ERROR_INTERACTIVE_MODE: UInt = 703u

public val ERROR_INTERNAL_ADDRESS_FAILURE: UInt = 840u

public val ERROR_INVALID_AUTH_STATE: UInt = 705u

public val ERROR_INVALID_CALLBACK_NUMBER: UInt = 751u

public val ERROR_INVALID_COMPRESSION_SPECIFIED: UInt = 613u

public val ERROR_INVALID_DESTINATION_IP: UInt = 871u

public val ERROR_INVALID_FUNCTION_FOR_ENTRY: UInt = 780u

public val ERROR_INVALID_INTERFACE_CONFIG: UInt = 872u

public val ERROR_INVALID_MSCHAPV2_CONFIG: UInt = 805u

public val ERROR_INVALID_PEAP_COOKIE_ATTRIBUTES: UInt = 849u

public val ERROR_INVALID_PEAP_COOKIE_CONFIG: UInt = 803u

public val ERROR_INVALID_PEAP_COOKIE_USER: UInt = 804u

public val ERROR_INVALID_PORT_HANDLE: UInt = 601u

public val ERROR_INVALID_PREFERENCES: UInt = 846u

public val ERROR_INVALID_SERVER_CERT: UInt = 835u

public val ERROR_INVALID_SIZE: UInt = 632u

public val ERROR_INVALID_SMM: UInt = 745u

public val ERROR_INVALID_TUNNELID: UInt = 837u

public val ERROR_INVALID_VPNSTRATEGY: UInt = 825u

public val ERROR_IN_COMMAND: UInt = 681u

public val ERROR_IPSEC_SERVICE_STOPPED: UInt = 827u

public val ERROR_IPXCP_DIALOUT_ALREADY_ACTIVE: UInt = 726u

public val ERROR_IPXCP_NET_NUMBER_CONFLICT: UInt = 744u

public val ERROR_IPXCP_NO_DIALIN_CONFIGURED: UInt = 725u

public val ERROR_IPXCP_NO_DIALOUT_CONFIGURED: UInt = 724u

public val ERROR_IP_CONFIGURATION: UInt = 716u

public val ERROR_KEY_NOT_FOUND: UInt = 627u

public val ERROR_LINE_BUSY: UInt = 676u

public val ERROR_LINK_FAILURE: UInt = 829u

public val ERROR_MACRO_NOT_DEFINED: UInt = 654u

public val ERROR_MACRO_NOT_FOUND: UInt = 653u

public val ERROR_MESSAGE_MACRO_NOT_FOUND: UInt = 655u

public val ERROR_MOBIKE_DISABLED: UInt = 843u

public val ERROR_NAME_EXISTS_ON_NET: UInt = 642u

public val ERROR_NETBIOS_ERROR: UInt = 640u

public val ERROR_NOT_BINARY_MACRO: UInt = 693u

public val ERROR_NOT_NAP_CAPABLE: UInt = 836u

public val ERROR_NO_ACTIVE_ISDN_LINES: UInt = 713u

public val ERROR_NO_ANSWER: UInt = 678u

public val ERROR_NO_CARRIER: UInt = 679u

public val ERROR_NO_CERTIFICATE: UInt = 766u

public val ERROR_NO_COMMAND_FOUND: UInt = 661u

public val ERROR_NO_CONNECTION: UInt = 668u

public val ERROR_NO_DIALIN_PERMISSION: UInt = 649u

public val ERROR_NO_DIALTONE: UInt = 680u

public val ERROR_NO_DIFF_USER_AT_LOGON: UInt = 784u

public val ERROR_NO_EAPTLS_CERTIFICATE: UInt = 798u

public val ERROR_NO_ENDPOINTS: UInt = 620u

public val ERROR_NO_IP_ADDRESSES: UInt = 717u

public val ERROR_NO_IP_RAS_ADAPTER: UInt = 728u

public val ERROR_NO_ISDN_CHANNELS_AVAILABLE: UInt = 714u

public val ERROR_NO_LOCAL_ENCRYPTION: UInt = 741u

public val ERROR_NO_MAC_FOR_PORT: UInt = 747u

public val ERROR_NO_REG_CERT_AT_LOGON: UInt = 785u

public val ERROR_NO_REMOTE_ENCRYPTION: UInt = 742u

public val ERROR_NO_RESPONSES: UInt = 660u

public val ERROR_NO_SMART_CARD_READER: UInt = 764u

public val ERROR_NUMBERCHANGED: UInt = 773u

public val ERROR_OAKLEY_ATTRIB_FAIL: UInt = 788u

public val ERROR_OAKLEY_AUTH_FAIL: UInt = 787u

public val ERROR_OAKLEY_ERROR: UInt = 793u

public val ERROR_OAKLEY_GENERAL_PROCESSING: UInt = 789u

public val ERROR_OAKLEY_NO_CERT: UInt = 786u

public val ERROR_OAKLEY_NO_PEER_CERT: UInt = 790u

public val ERROR_OAKLEY_NO_POLICY: UInt = 791u

public val ERROR_OAKLEY_TIMED_OUT: UInt = 792u

public val ERROR_OUTOFORDER: UInt = 777u

public val ERROR_OUT_OF_BUFFERS: UInt = 614u

public val ERROR_OVERRUN: UInt = 710u

public val ERROR_PARTIAL_RESPONSE_LOOPING: UInt = 697u

public val ERROR_PASSWD_EXPIRED: UInt = 648u

public val ERROR_PEAP_CRYPTOBINDING_INVALID: UInt = 823u

public val ERROR_PEAP_CRYPTOBINDING_NOTRECEIVED: UInt = 824u

public val ERROR_PEAP_IDENTITY_MISMATCH: UInt = 867u

public val ERROR_PEAP_SERVER_REJECTED_CLIENT_TLV: UInt = 845u

public val ERROR_PHONE_NUMBER_TOO_LONG: UInt = 723u

public val ERROR_PLUGIN_NOT_INSTALLED: UInt = 876u

public val ERROR_PORT_ALREADY_OPEN: UInt = 602u

public val ERROR_PORT_DISCONNECTED: UInt = 619u

public val ERROR_PORT_NOT_AVAILABLE: UInt = 633u

public val ERROR_PORT_NOT_CONFIGURED: UInt = 665u

public val ERROR_PORT_NOT_CONNECTED: UInt = 606u

public val ERROR_PORT_NOT_FOUND: UInt = 615u

public val ERROR_PORT_NOT_OPEN: UInt = 618u

public val ERROR_PORT_OR_DEVICE: UInt = 692u

public val ERROR_PPP_CP_REJECTED: UInt = 733u

public val ERROR_PPP_INVALID_PACKET: UInt = 722u

public val ERROR_PPP_LCP_TERMINATED: UInt = 734u

public val ERROR_PPP_LOOPBACK_DETECTED: UInt = 737u

public val ERROR_PPP_NCP_TERMINATED: UInt = 736u

public val ERROR_PPP_NOT_CONVERGING: UInt = 732u

public val ERROR_PPP_NO_ADDRESS_ASSIGNED: UInt = 738u

public val ERROR_PPP_NO_PROTOCOLS_CONFIGURED: UInt = 720u

public val ERROR_PPP_NO_RESPONSE: UInt = 721u

public val ERROR_PPP_REMOTE_TERMINATED: UInt = 719u

public val ERROR_PPP_REQUIRED_ADDRESS_REJECTED: UInt = 735u

public val ERROR_PPP_TIMEOUT: UInt = 718u

public val ERROR_PROJECTION_NOT_COMPLETE: UInt = 730u

public val ERROR_PROTOCOL_ENGINE_DISABLED: UInt = 839u

public val ERROR_PROTOCOL_NOT_CONFIGURED: UInt = 731u

public val ERROR_RASAUTO_CANNOT_INITIALIZE: UInt = 757u

public val ERROR_RASMAN_CANNOT_INITIALIZE: UInt = 711u

public val ERROR_RASMAN_SERVICE_STOPPED: UInt = 834u

public val ERROR_RASQEC_CONN_DOESNOTEXIST: UInt = 821u

public val ERROR_RASQEC_NAPAGENT_NOT_CONNECTED: UInt = 820u

public val ERROR_RASQEC_NAPAGENT_NOT_ENABLED: UInt = 819u

public val ERROR_RASQEC_RESOURCE_CREATION_FAILED: UInt = 818u

public val ERROR_RASQEC_TIMEOUT: UInt = 822u

public val ERROR_READING_DEFAULTOFF: UInt = 689u

public val ERROR_READING_DEVICENAME: UInt = 672u

public val ERROR_READING_DEVICETYPE: UInt = 671u

public val ERROR_READING_INI_FILE: UInt = 667u

public val ERROR_READING_MAXCARRIERBPS: UInt = 675u

public val ERROR_READING_MAXCONNECTBPS: UInt = 674u

public val ERROR_READING_SCARD: UInt = 802u

public val ERROR_READING_SECTIONNAME: UInt = 670u

public val ERROR_READING_USAGE: UInt = 673u

public val ERROR_RECV_BUF_FULL: UInt = 699u

public val ERROR_REMOTE_DISCONNECTION: UInt = 629u

public val ERROR_REMOTE_REQUIRES_ENCRYPTION: UInt = 743u

public val ERROR_REQUEST_TIMEOUT: UInt = 638u

public val ERROR_RESTRICTED_LOGON_HOURS: UInt = 646u

public val ERROR_ROUTE_NOT_ALLOCATED: UInt = 612u

public val ERROR_ROUTE_NOT_AVAILABLE: UInt = 611u

public val ERROR_SCRIPT_SYNTAX: UInt = 752u

public val ERROR_SERVER_GENERAL_NET_FAILURE: UInt = 643u

public val ERROR_SERVER_NOT_RESPONDING: UInt = 650u

public val ERROR_SERVER_OUT_OF_RESOURCES: UInt = 641u

public val ERROR_SERVER_POLICY: UInt = 812u

public val ERROR_SHARE_CONNECTION_FAILED: UInt = 761u

public val ERROR_SHARING_ADDRESS_EXISTS: UInt = 765u

public val ERROR_SHARING_CHANGE_FAILED: UInt = 759u

public val ERROR_SHARING_HOST_ADDRESS_CONFLICT: UInt = 799u

public val ERROR_SHARING_MULTIPLE_ADDRESSES: UInt = 767u

public val ERROR_SHARING_NO_PRIVATE_LAN: UInt = 783u

public val ERROR_SHARING_PRIVATE_INSTALL: UInt = 762u

public val ERROR_SHARING_ROUTER_INSTALL: UInt = 760u

public val ERROR_SHARING_RRAS_CONFLICT: UInt = 782u

public val ERROR_SLIP_REQUIRES_IP: UInt = 729u

public val ERROR_SMART_CARD_REQUIRED: UInt = 779u

public val ERROR_SMM_TIMEOUT: UInt = 748u

public val ERROR_SMM_UNINITIALIZED: UInt = 746u

public val ERROR_SSO_CERT_MISSING: UInt = 874u

public val ERROR_SSTP_COOKIE_SET_FAILURE: UInt = 848u

public val ERROR_STATE_MACHINES_ALREADY_STARTED: UInt = 696u

public val ERROR_STATE_MACHINES_NOT_STARTED: UInt = 695u

public val ERROR_SYSTEM_SUSPENDED: UInt = 833u

public val ERROR_TAPI_CONFIGURATION: UInt = 740u

public val ERROR_TEMPFAILURE: UInt = 774u

public val ERROR_TOO_MANY_LINE_ERRORS: UInt = 715u

public val ERROR_TS_UNACCEPTABLE: UInt = 842u

public val ERROR_UNABLE_TO_AUTHENTICATE_SERVER: UInt = 778u

public val ERROR_UNEXPECTED_RESPONSE: UInt = 702u

public val ERROR_UNKNOWN: UInt = 635u

public val ERROR_UNKNOWN_DEVICE_TYPE: UInt = 663u

public val ERROR_UNKNOWN_FRAMED_PROTOCOL: UInt = 794u

public val ERROR_UNKNOWN_RESPONSE_KEY: UInt = 698u

public val ERROR_UNKNOWN_SERVICE_TYPE: UInt = 796u

public val ERROR_UNRECOGNIZED_RESPONSE: UInt = 652u

public val ERROR_UNSUPPORTED_BPS: UInt = 701u

public val ERROR_UPDATECONNECTION_REQUEST_IN_PROCESS: UInt = 838u

public val ERROR_USER_DISCONNECTION: UInt = 631u

public val ERROR_USER_LOGOFF: UInt = 830u

public val ERROR_VALIDATING_SERVER_CERT: UInt = 801u

public val ERROR_VOICE_ANSWER: UInt = 677u

public val ERROR_VPN_BAD_CERT: UInt = 810u

public val ERROR_VPN_BAD_PSK: UInt = 811u

public val ERROR_VPN_DISCONNECT: UInt = 807u

public val ERROR_VPN_GRE_BLOCKED: UInt = 806u

public val ERROR_VPN_PLUGIN_GENERIC: UInt = 873u

public val ERROR_VPN_REFUSED: UInt = 808u

public val ERROR_VPN_TIMEOUT: UInt = 809u

public val ERROR_WRITING_DEFAULTOFF: UInt = 688u

public val ERROR_WRITING_DEVICENAME: UInt = 684u

public val ERROR_WRITING_DEVICETYPE: UInt = 683u

public val ERROR_WRITING_INITBPS: UInt = 706u

public val ERROR_WRITING_MAXCARRIERBPS: UInt = 686u

public val ERROR_WRITING_MAXCONNECTBPS: UInt = 685u

public val ERROR_WRITING_SECTIONNAME: UInt = 682u

public val ERROR_WRITING_USAGE: UInt = 687u

public val ERROR_WRONG_DEVICE_ATTACHED: UInt = 636u

public val ERROR_WRONG_INFO_SPECIFIED: UInt = 604u

public val ERROR_WRONG_KEY_SPECIFIED: UInt = 662u

public val ERROR_WRONG_MODULE: UInt = 750u

public val ERROR_WRONG_TUNNEL_TYPE: UInt = 795u

public val ERROR_X25_DIAGNOSTIC: UInt = 707u

public val ET_NONE: UInt = 0u

public val ET_OPTIONAL: UInt = 3u

public val ET_REQUIRE: UInt = 1u

public val ET_REQUIRE_MAX: UInt = 2u

public val IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_DN: Ikev2IdPayloadType = 9

public val IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_GN: Ikev2IdPayloadType = 10

public val IKEV2_ID_PAYLOAD_TYPE_FQDN: Ikev2IdPayloadType = 2

public val IKEV2_ID_PAYLOAD_TYPE_ID_IPV6_ADDR: Ikev2IdPayloadType = 5

public val IKEV2_ID_PAYLOAD_TYPE_INVALID: Ikev2IdPayloadType = 0

public val IKEV2_ID_PAYLOAD_TYPE_IPV4_ADDR: Ikev2IdPayloadType = 1

public val IKEV2_ID_PAYLOAD_TYPE_KEY_ID: Ikev2IdPayloadType = 11

public val IKEV2_ID_PAYLOAD_TYPE_MAX: Ikev2IdPayloadType = 12

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED1: Ikev2IdPayloadType = 4

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED2: Ikev2IdPayloadType = 6

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED3: Ikev2IdPayloadType = 7

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED4: Ikev2IdPayloadType = 8

public val IKEV2_ID_PAYLOAD_TYPE_RFC822_ADDR: Ikev2IdPayloadType = 3

public val IPADDRESSLEN: UInt = 15u

public val IPV6_ADDRESS_LEN_IN_BYTES: UInt = 16u

public val IPXADDRESSLEN: UInt = 22u

public val MAXIPADRESSLEN: UInt = 64u

public val MAX_SSTP_HASH_SIZE: UInt = 32u

public val METHOD_BGP4_AS_PATH: UInt = 1u

public val METHOD_BGP4_NEXTHOP_ATTR: UInt = 8u

public val METHOD_BGP4_PA_ORIGIN: UInt = 4u

public val METHOD_BGP4_PEER_ID: UInt = 2u

public val METHOD_RIP2_NEIGHBOUR_ADDR: UInt = 1u

public val METHOD_RIP2_OUTBOUND_INTF: UInt = 2u

public val METHOD_RIP2_ROUTE_TAG: UInt = 4u

public val METHOD_RIP2_ROUTE_TIMESTAMP: UInt = 8u

public val METHOD_TYPE_ALL_METHODS: UInt = 4294967295u

public val MGM_FORWARD_STATE_FLAG: UInt = 2u

public val MGM_JOIN_STATE_FLAG: UInt = 1u

public val MGM_MFE_STATS_0: UInt = 1u

public val MGM_MFE_STATS_1: UInt = 2u

public val MPRAPI_ADMIN_DLL_VERSION_1: UInt = 1u

public val MPRAPI_ADMIN_DLL_VERSION_2: UInt = 2u

public val MPRAPI_IF_CUSTOM_CONFIG_FOR_IKEV2: UInt = 1u

public val MPRAPI_IKEV2_AUTH_USING_CERT: UInt = 1u

public val MPRAPI_IKEV2_AUTH_USING_EAP: UInt = 2u

public val MPRAPI_IKEV2_PROJECTION_INFO_TYPE: UInt = 2u

public val MPRAPI_IKEV2_SET_TUNNEL_CONFIG_PARAMS: UInt = 1u

public val MPRAPI_L2TP_SET_TUNNEL_CONFIG_PARAMS: UInt = 1u

public val MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_1: UInt = 1u

public val MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_2: UInt = 2u

public val MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_3: UInt = 3u

public val MPRAPI_MPR_SERVER_OBJECT_REVISION_1: UInt = 1u

public val MPRAPI_MPR_SERVER_OBJECT_REVISION_2: UInt = 2u

public val MPRAPI_MPR_SERVER_OBJECT_REVISION_3: UInt = 3u

public val MPRAPI_MPR_SERVER_OBJECT_REVISION_4: UInt = 4u

public val MPRAPI_MPR_SERVER_OBJECT_REVISION_5: UInt = 5u

public val MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_1: UInt = 1u

public val MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_2: UInt = 2u

public val MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_3: UInt = 3u

public val MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_4: UInt = 4u

public val MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_5: UInt = 5u

public val MPRAPI_OBJECT_TYPE_AUTH_VALIDATION_OBJECT: MprapiObjectType = 4

public val MPRAPI_OBJECT_TYPE_IF_CUSTOM_CONFIG_OBJECT: MprapiObjectType = 6

public val MPRAPI_OBJECT_TYPE_MPR_SERVER_OBJECT: MprapiObjectType = 2

public val MPRAPI_OBJECT_TYPE_MPR_SERVER_SET_CONFIG_OBJECT: MprapiObjectType = 3

public val MPRAPI_OBJECT_TYPE_RAS_CONNECTION_OBJECT: MprapiObjectType = 1

public val MPRAPI_OBJECT_TYPE_UPDATE_CONNECTION_OBJECT: MprapiObjectType = 5

public val MPRAPI_PPP_PROJECTION_INFO_TYPE: UInt = 1u

public val MPRAPI_RAS_CONNECTION_OBJECT_REVISION_1: UInt = 1u

public val MPRAPI_RAS_UPDATE_CONNECTION_OBJECT_REVISION_1: UInt = 1u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_GRE: UInt = 16u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_IKEV2: UInt = 8u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_L2TP: UInt = 2u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_PPTP: UInt = 1u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_SSTP: UInt = 4u

public val MPRDM_DIAL_ALL: MprInterfaceDialMode = 1u

public val MPRDM_DIAL_AS_NEEDED: MprInterfaceDialMode = 2u

public val MPRDM_DIAL_FIRST: MprInterfaceDialMode = 0u

public val MPRDT_ATM: Pcwstr = w("ATM")

public val MPRDT_FRAME_RELAY: Pcwstr = w("FRAMERELAY")

public val MPRDT_GENERIC: Pcwstr = w("GENERIC")

public val MPRDT_IRDA: Pcwstr = w("IRDA")

public val MPRDT_ISDN: Pcwstr = w("isdn")

public val MPRDT_MODEM: Pcwstr = w("modem")

public val MPRDT_PAD: Pcwstr = w("pad")

public val MPRDT_PARALLEL: Pcwstr = w("PARALLEL")

public val MPRDT_SW56: Pcwstr = w("SW56")

public val MPRDT_SERIAL: Pcwstr = w("SERIAL")

public val MPRDT_SONET: Pcwstr = w("SONET")

public val MPRDT_VPN: Pcwstr = w("vpn")

public val MPRDT_X25: Pcwstr = w("x25")

public val MPRET_DIRECT: UInt = 3u

public val MPRET_PHONE: UInt = 1u

public val MPRET_VPN: UInt = 2u

public val MPRIDS_DISABLED: UInt = 4294967295u

public val MPRIDS_USE_GLOBAL_VALUE: UInt = 0u

public val MPRIO_DISABLE_LCP_EXTENSIONS: UInt = 32u

public val MPRIO_IP_HEADER_COMPRESSION: UInt = 8u

public val MPRIO_IP_SEC_PRE_SHARED_KEY: UInt = 2147483648u

public val MPRIO_NETWORK_LOGON: UInt = 8192u

public val MPRIO_PROMOTE_ALTERNATES: UInt = 32768u

public val MPRIO_REMOTE_DEFAULT_GATEWAY: UInt = 16u

public val MPRIO_REQUIRE_CHAP: UInt = 134217728u

public val MPRIO_REQUIRE_DATA_ENCRYPTION: UInt = 4096u

public val MPRIO_REQUIRE_EAP: UInt = 131072u

public val MPRIO_REQUIRE_ENCRYPTED_PW: UInt = 1024u

public val MPRIO_REQUIRE_MACHINE_CERTIFICATES: UInt = 16777216u

public val MPRIO_REQUIRE_MS_CHAP: UInt = 268435456u

public val MPRIO_REQUIRE_MS_CHAP2: UInt = 536870912u

public val MPRIO_REQUIRE_MS_ENCRYPTED_PW: UInt = 2048u

public val MPRIO_REQUIRE_PAP: UInt = 262144u

public val MPRIO_REQUIRE_SPAP: UInt = 524288u

public val MPRIO_SECURE_LOCAL_FILES: UInt = 65536u

public val MPRIO_SHARED_PHONE_NUMBERS: UInt = 8388608u

public val MPRIO_SPECIFIC_IP_ADDR: UInt = 2u

public val MPRIO_SPECIFIC_NAME_SERVERS: UInt = 4u

public val MPRIO_SW_COMPRESSION: UInt = 512u

public val MPRIO_USE_PRE_SHARED_KEY_FOR_IKEV2INITIATOR: UInt = 33554432u

public val MPRIO_USE_PRE_SHARED_KEY_FOR_IKEV2RESPONDER: UInt = 67108864u

public val MPRNP_IP: UInt = 4u

public val MPRNP_IPV6: UInt = 8u

public val MPRNP_IPX: UInt = 2u

public val MPR_ENABLE_RAS_ON_DEVICE: UInt = 1u

public val MPR_ENABLE_ROUTING_ON_DEVICE: UInt = 2u

public val MPR_ET_NONE: MprEt = 0u

public val MPR_ET_OPTIONAL: MprEt = 3u

public val MPR_ET_REQUIRE: MprEt = 1u

public val MPR_ET_REQUIRE_MAX: MprEt = 2u

public val MPR_INTERFACE_ADMIN_DISABLED: UInt = 2u

public val MPR_INTERFACE_CONNECTION_FAILURE: UInt = 4u

public val MPR_INTERFACE_DIALOUT_HOURS_RESTRICTION: UInt = 16u

public val MPR_INTERFACE_NO_DEVICE: UInt = 64u

public val MPR_INTERFACE_NO_MEDIA_SENSE: UInt = 32u

public val MPR_INTERFACE_OUT_OF_RESOURCES: UInt = 1u

public val MPR_INTERFACE_SERVICE_PAUSED: UInt = 8u

public val MPR_MAX_AREA_CODE: UInt = 10u

public val MPR_MAX_CALLBACK_NUMBER: UInt = 128u

public val MPR_MAX_DEVICE_NAME: UInt = 128u

public val MPR_MAX_DEVICE_TYPE: UInt = 16u

public val MPR_MAX_ENTRY_NAME: UInt = 256u

public val MPR_MAX_FACILITIES: UInt = 200u

public val MPR_MAX_IP_ADDRESS: UInt = 15u

public val MPR_MAX_IPX_ADDRESS: UInt = 21u

public val MPR_MAX_PAD_TYPE: UInt = 32u

public val MPR_MAX_PHONE_NUMBER: UInt = 128u

public val MPR_MAX_USER_DATA: UInt = 200u

public val MPR_MAX_X25ADDRESS: UInt = 200u

public val MPR_VPN_TS_I_PV4_ADDR_RANGE: MprVpnTsType = 7

public val MPR_VPN_TS_I_PV6_ADDR_RANGE: MprVpnTsType = 8

public val MPR_VS_DEFAULT: MprVs = 0u

public val MPR_VS_IKEV2FIRST: UInt = 8u

public val MPR_VS_IKEV2ONLY: UInt = 7u

public val MPR_VS_L2TP_FIRST: MprVs = 4u

public val MPR_VS_L2TP_ONLY: MprVs = 3u

public val MPR_VS_PPTP_FIRST: MprVs = 2u

public val MPR_VS_PPTP_ONLY: MprVs = 1u

public val PENDING: UInt = 600u

public val PID_ATALK: UInt = 41u

public val PID_IP: UInt = 33u

public val PID_IPV6: UInt = 87u

public val PID_IPX: UInt = 43u

public val PID_NBF: UInt = 63u

public val PPP_CCP_COMPRESSION: UInt = 1u

public val PPP_CCP_ENCRYPTION128BIT: UInt = 64u

public val PPP_CCP_ENCRYPTION40BIT: UInt = 32u

public val PPP_CCP_ENCRYPTION40BITOLD: UInt = 16u

public val PPP_CCP_ENCRYPTION56BIT: UInt = 128u

public val PPP_CCP_HISTORYLESS: UInt = 16777216u

public val PPP_IPCP_VJ: UInt = 1u

public val PPP_LCP_3_DES: UInt = 32u

public val PPP_LCP_ACFC: UInt = 4u

public val PPP_LCP_AES_128: UInt = 64u

public val PPP_LCP_AES_192: UInt = 256u

public val PPP_LCP_AES_256: UInt = 128u

public val PPP_LCP_CHAP: PppLcp = 49699u

public val PPP_LCP_CHAP_MD5: PppLcpInfoAuthData = 5u

public val PPP_LCP_CHAP_MS: PppLcpInfoAuthData = 128u

public val PPP_LCP_CHAP_MSV2: PppLcpInfoAuthData = 129u

public val PPP_LCP_DES_56: UInt = 16u

public val PPP_LCP_EAP: PppLcp = 49703u

public val PPP_LCP_GCM_AES_128: UInt = 512u

public val PPP_LCP_GCM_AES_192: UInt = 1024u

public val PPP_LCP_GCM_AES_256: UInt = 2048u

public val PPP_LCP_MULTILINK_FRAMING: UInt = 1u

public val PPP_LCP_PAP: PppLcp = 49187u

public val PPP_LCP_PFC: UInt = 2u

public val PPP_LCP_SPAP: PppLcp = 49191u

public val PPP_LCP_SSHF: UInt = 8u

public val PROJECTION_INFO_TYPE_IK_EV2: RasprojectionInfoType = 2

public val PROJECTION_INFO_TYPE_PPP: RasprojectionInfoType = 1

public val RASADFLG_POSITION_DLG: UInt = 1u

public val RASADP_CONNECTION_QUERY_TIMEOUT: UInt = 4u

public val RASADP_DISABLE_CONNECTION_QUERY: UInt = 0u

public val RASADP_FAILED_CONNECTION_TIMEOUT: UInt = 3u

public val RASADP_LOGIN_SESSION_DISABLE: UInt = 1u

public val RASADP_SAVED_ADDRESSES_LIMIT: UInt = 2u

public val RASAPIVERSION_500: Rasapiversion = 1

public val RASAPIVERSION_501: Rasapiversion = 2

public val RASAPIVERSION_600: Rasapiversion = 3

public val RASAPIVERSION_601: Rasapiversion = 4

public val RASBASE: UInt = 600u

public val RASBASEEND: UInt = 877u

public val RASCCPCA_MPPC: UInt = 6u

public val RASCCPCA_STAC: UInt = 5u

public val RASCCPO_COMPRESSION: UInt = 1u

public val RASCCPO_ENCRYPTION128BIT: UInt = 64u

public val RASCCPO_ENCRYPTION40BIT: UInt = 32u

public val RASCCPO_ENCRYPTION56BIT: UInt = 16u

public val RASCCPO_HISTORY_LESS: UInt = 2u

public val RASCF_ALL_USERS: UInt = 1u

public val RASCF_GLOBAL_CREDS: UInt = 2u

public val RASCF_OWNER_KNOWN: UInt = 4u

public val RASCF_OWNER_MATCH: UInt = 8u

public val RASCM_DDM_PRE_SHARED_KEY: UInt = 64u

public val RASCM_DEFAULT_CREDS: UInt = 8u

public val RASCM_DOMAIN: UInt = 4u

public val RASCM_PASSWORD: UInt = 2u

public val RASCM_PRE_SHARED_KEY: UInt = 16u

public val RASCM_SERVER_PRE_SHARED_KEY: UInt = 32u

public val RASCM_USER_NAME: UInt = 1u

public val RASCN_BANDWIDTH_ADDED: UInt = 4u

public val RASCN_BANDWIDTH_REMOVED: UInt = 8u

public val RASCN_CONNECTION: UInt = 1u

public val RASCN_DISCONNECTION: UInt = 2u

public val RASCN_DORMANT: UInt = 16u

public val RASCN_EPDG_PACKET_ARRIVAL: UInt = 64u

public val RASCN_RE_CONNECTION: UInt = 32u

public val RASCSS_DONE: UInt = 8192u

public val RASCSS_DORMANT: Rasconnsubstate = 1

public val RASCSS_NONE: Rasconnsubstate = 0

public val RASCSS_RECONNECTED: Rasconnsubstate = 8192

public val RASCSS_RECONNECTING: Rasconnsubstate = 2

public val RASCS_ALL_DEVICES_CONNECTED: Rasconnstate = 4

public val RASCS_APPLY_SETTINGS: Rasconnstate = 24

public val RASCS_AUTH_ACK: Rasconnstate = 12

public val RASCS_AUTH_CALLBACK: Rasconnstate = 8

public val RASCS_AUTH_CHANGE_PASSWORD: Rasconnstate = 9

public val RASCS_AUTH_LINK_SPEED: Rasconnstate = 11

public val RASCS_AUTH_NOTIFY: Rasconnstate = 6

public val RASCS_AUTH_PROJECT: Rasconnstate = 10

public val RASCS_AUTH_RETRY: Rasconnstate = 7

public val RASCS_AUTHENTICATE: Rasconnstate = 5

public val RASCS_AUTHENTICATED: Rasconnstate = 14

public val RASCS_CALLBACK_COMPLETE: Rasconnstate = 20

public val RASCS_CALLBACK_SET_BY_CALLER: Rasconnstate = 4098

public val RASCS_CONNECT_DEVICE: Rasconnstate = 2

public val RASCS_CONNECTED: Rasconnstate = 8192

public val RASCS_DONE: UInt = 8192u

public val RASCS_DEVICE_CONNECTED: Rasconnstate = 3

public val RASCS_DISCONNECTED: Rasconnstate = 8193

public val RASCS_INTERACTIVE: Rasconnstate = 4096

public val RASCS_INVOKE_EAP_UI: Rasconnstate = 4100

public val RASCS_LOGON_NETWORK: Rasconnstate = 21

public val RASCS_OPEN_PORT: Rasconnstate = 0

public val RASCS_PAUSED: UInt = 4096u

public val RASCS_PASSWORD_EXPIRED: Rasconnstate = 4099

public val RASCS_PORT_OPENED: Rasconnstate = 1

public val RASCS_PREPARE_FOR_CALLBACK: Rasconnstate = 15

public val RASCS_PROJECTED: Rasconnstate = 18

public val RASCS_RE_AUTHENTICATE: Rasconnstate = 13

public val RASCS_RETRY_AUTHENTICATION: Rasconnstate = 4097

public val RASCS_START_AUTHENTICATION: Rasconnstate = 19

public val RASCS_SUB_ENTRY_CONNECTED: Rasconnstate = 22

public val RASCS_SUB_ENTRY_DISCONNECTED: Rasconnstate = 23

public val RASCS_WAIT_FOR_CALLBACK: Rasconnstate = 17

public val RASCS_WAIT_FOR_MODEM_RESET: Rasconnstate = 16

public val RASDDFLAG_AOAC_REDIAL: UInt = 4u

public val RASDDFLAG_LINK_FAILURE: UInt = 2147483648u

public val RASDDFLAG_NO_PROMPT: UInt = 2u

public val RASDDFLAG_POSITION_DLG: UInt = 1u

public val RASDIALEVENT: Pcstr = s("RasDialEvent")

public val RASDT_ATM: Pcwstr = w("ATM")

public val RASDT_FRAME_RELAY: Pcwstr = w("FRAMERELAY")

public val RASDT_GENERIC: Pcwstr = w("GENERIC")

public val RASDT_IRDA: Pcwstr = w("IRDA")

public val RASDT_ISDN: Pcwstr = w("isdn")

public val RASDT_MODEM: Pcwstr = w("modem")

public val RASDT_PP_PO_E: Pcwstr = w("PPPoE")

public val RASDT_PAD: Pcwstr = w("pad")

public val RASDT_PARALLEL: Pcwstr = w("PARALLEL")

public val RASDT_SW56: Pcwstr = w("SW56")

public val RASDT_SERIAL: Pcwstr = w("SERIAL")

public val RASDT_SONET: Pcwstr = w("SONET")

public val RASDT_VPN: Pcwstr = w("vpn")

public val RASDT_X25: Pcwstr = w("x25")

public val RASEAPF_LOGON: UInt = 4u

public val RASEAPF_NON_INTERACTIVE: UInt = 2u

public val RASEAPF_PREVIEW: UInt = 8u

public val RASEDFLAG_CLONE_ENTRY: UInt = 4u

public val RASEDFLAG_INCOMING_CONNECTION: UInt = 1024u

public val RASEDFLAG_INTERNET_ENTRY: UInt = 256u

public val RASEDFLAG_NAT: UInt = 512u

public val RASEDFLAG_NEW_BROADBAND_ENTRY: UInt = 128u

public val RASEDFLAG_NEW_DIRECT_ENTRY: UInt = 64u

public val RASEDFLAG_NEW_ENTRY: UInt = 2u

public val RASEDFLAG_NEW_PHONE_ENTRY: UInt = 16u

public val RASEDFLAG_NEW_TUNNEL_ENTRY: UInt = 32u

public val RASEDFLAG_NO_RENAME: UInt = 8u

public val RASEDFLAG_POSITION_DLG: UInt = 1u

public val RASEDFLAG_SHELL_OWNED: UInt = 1073741824u

public val RASEDM_DIAL_ALL: RasentryDialMode = 1u

public val RASEDM_DIAL_AS_NEEDED: RasentryDialMode = 2u

public val RASEO2_AUTH_TYPE_IS_OTP: UInt = 268435456u

public val RASEO2_AUTO_TRIGGER_CAPABLE: UInt = 67108864u

public val RASEO2_CACHE_CREDENTIALS: UInt = 33554432u

public val RASEO2_DISABLE_CLASS_BASED_STATIC_ROUTE: UInt = 524288u

public val RASEO2_DISABLE_IKE_NAME_EKU_CHECK: UInt = 262144u

public val RASEO2_DISABLE_MOBILITY: UInt = 2097152u

public val RASEO2_DISABLE_NBT_OVER_IP: UInt = 64u

public val RASEO2_DONT_NEGOTIATE_MULTILINK: UInt = 4u

public val RASEO2_DONT_USE_RAS_CREDENTIALS: UInt = 8u

public val RASEO2_I_PV4EXPLICIT_METRIC: UInt = 65536u

public val RASEO2_I_PV6EXPLICIT_METRIC: UInt = 131072u

public val RASEO2_I_PV6REMOTE_DEFAULT_GATEWAY: UInt = 8192u

public val RASEO2_I_PV6SPECIFIC_NAME_SERVERS: UInt = 4096u

public val RASEO2_INTERNET: UInt = 32u

public val RASEO2_IS_ALWAYS_ON: UInt = 536870912u

public val RASEO2_IS_PRIVATE_NETWORK: UInt = 1073741824u

public val RASEO2_IS_THIRD_PARTY_PROFILE: UInt = 134217728u

public val RASEO2_PLUMB_IK_EV2TS_AS_ROUTES: UInt = 2147483648u

public val RASEO2_RECONNECT_IF_DROPPED: UInt = 256u

public val RASEO2_REGISTER_IP_WITH_DNS: UInt = 16384u

public val RASEO2_REQUIRE_MACHINE_CERTIFICATES: UInt = 4194304u

public val RASEO2_SECURE_CLIENT_FOR_MS_NET: UInt = 2u

public val RASEO2_SECURE_FILE_AND_PRINT: UInt = 1u

public val RASEO2_SECURE_ROUTING_COMPARTMENT: UInt = 1024u

public val RASEO2_SHARE_PHONE_NUMBERS: UInt = 512u

public val RASEO2_SPECIFIC_I_PV6ADDR: UInt = 1048576u

public val RASEO2_USE_DNS_SUFFIX_FOR_REGISTRATION: UInt = 32768u

public val RASEO2_USE_GLOBAL_DEVICE_SETTINGS: UInt = 128u

public val RASEO2_USE_PRE_SHARED_KEY: UInt = 16u

public val RASEO2_USE_PRE_SHARED_KEY_FOR_IKEV2INITIATOR: UInt = 8388608u

public val RASEO2_USE_PRE_SHARED_KEY_FOR_IKEV2RESPONDER: UInt = 16777216u

public val RASEO2_USE_TYPICAL_SETTINGS: UInt = 2048u

public val RASEO_CUSTOM: UInt = 1048576u

public val RASEO_CUSTOM_SCRIPT: UInt = 2147483648u

public val RASEO_DISABLE_LCP_EXTENSIONS: UInt = 32u

public val RASEO_IP_HEADER_COMPRESSION: UInt = 8u

public val RASEO_MODEM_LIGHTS: UInt = 256u

public val RASEO_NETWORK_LOGON: UInt = 8192u

public val RASEO_PREVIEW_DOMAIN: UInt = 33554432u

public val RASEO_PREVIEW_PHONE_NUMBER: UInt = 2097152u

public val RASEO_PREVIEW_USER_PW: UInt = 16777216u

public val RASEO_PROMOTE_ALTERNATES: UInt = 32768u

public val RASEO_REMOTE_DEFAULT_GATEWAY: UInt = 16u

public val RASEO_REQUIRE_CHAP: UInt = 134217728u

public val RASEO_REQUIRE_DATA_ENCRYPTION: UInt = 4096u

public val RASEO_REQUIRE_EAP: UInt = 131072u

public val RASEO_REQUIRE_ENCRYPTED_PW: UInt = 1024u

public val RASEO_REQUIRE_MS_CHAP: UInt = 268435456u

public val RASEO_REQUIRE_MS_CHAP2: UInt = 536870912u

public val RASEO_REQUIRE_MS_ENCRYPTED_PW: UInt = 2048u

public val RASEO_REQUIRE_PAP: UInt = 262144u

public val RASEO_REQUIRE_SPAP: UInt = 524288u

public val RASEO_REQUIRE_W95MSCHAP: UInt = 1073741824u

public val RASEO_SECURE_LOCAL_FILES: UInt = 65536u

public val RASEO_SHARED_PHONE_NUMBERS: UInt = 8388608u

public val RASEO_SHOW_DIALING_PROGRESS: UInt = 67108864u

public val RASEO_SPECIFIC_IP_ADDR: UInt = 2u

public val RASEO_SPECIFIC_NAME_SERVERS: UInt = 4u

public val RASEO_SW_COMPRESSION: UInt = 512u

public val RASEO_TERMINAL_AFTER_DIAL: UInt = 128u

public val RASEO_TERMINAL_BEFORE_DIAL: UInt = 64u

public val RASEO_USE_COUNTRY_AND_AREA_CODES: UInt = 1u

public val RASEO_USE_LOGON_CREDENTIALS: UInt = 16384u

public val RASET_BROADBAND: UInt = 5u

public val RASET_DIRECT: UInt = 3u

public val RASET_INTERNET: UInt = 4u

public val RASET_PHONE: UInt = 1u

public val RASET_VPN: UInt = 2u

public val RASFP_PPP: UInt = 1u

public val RASFP_RAS: UInt = 4u

public val RASFP_SLIP: UInt = 2u

public val RASIDS_DISABLED: UInt = 4294967295u

public val RASIDS_USE_GLOBAL_VALUE: UInt = 0u

public val RASIK_EV2_AUTH_EAP: UInt = 2u

public val RASIK_EV2_AUTH_MACHINECERTIFICATES: UInt = 1u

public val RASIK_EV2_AUTH_PSK: UInt = 3u

public val RASIK_EV2_FLAGS_BEHIND_NAT: RasikevProjectionInfoFlags = 2u

public val RASIK_EV2_FLAGS_MOBIKESUPPORTED: RasikevProjectionInfoFlags = 1u

public val RASIK_EV2_FLAGS_SERVERBEHIND_NAT: RasikevProjectionInfoFlags = 4u

public val RASIPO_VJ: UInt = 1u

public val RASLCPAD_CHAP_MD5: RaspppProjectionInfoServerAuthData = 5u

public val RASLCPAD_CHAP_MS: RaspppProjectionInfoServerAuthData = 128u

public val RASLCPAD_CHAP_MSV2: RaspppProjectionInfoServerAuthData = 129u

public val RASLCPAP_CHAP: RaspppProjectionInfoServerAuthProtocol = 49699u

public val RASLCPAP_EAP: RaspppProjectionInfoServerAuthProtocol = 49703u

public val RASLCPAP_PAP: RaspppProjectionInfoServerAuthProtocol = 49187u

public val RASLCPAP_SPAP: RaspppProjectionInfoServerAuthProtocol = 49191u

public val RASLCPO_3_DES: UInt = 16u

public val RASLCPO_ACFC: UInt = 2u

public val RASLCPO_AES_128: UInt = 32u

public val RASLCPO_AES_192: UInt = 128u

public val RASLCPO_AES_256: UInt = 64u

public val RASLCPO_DES_56: UInt = 8u

public val RASLCPO_GCM_AES_128: UInt = 256u

public val RASLCPO_GCM_AES_192: UInt = 512u

public val RASLCPO_GCM_AES_256: UInt = 1024u

public val RASLCPO_PFC: UInt = 1u

public val RASLCPO_SSHF: UInt = 4u

public val RASNAP_PROBATION_TIME: UInt = 1u

public val RASNOUSER_SMART_CARD: UInt = 1u

public val RASNP_IP: UInt = 4u

public val RASNP_IPV6: UInt = 8u

public val RASNP_IPX: UInt = 2u

public val RASNP_NET_BEUI: UInt = 1u

public val RASPBDEVENT_ADD_ENTRY: UInt = 1u

public val RASPBDEVENT_DIAL_ENTRY: UInt = 4u

public val RASPBDEVENT_EDIT_ENTRY: UInt = 2u

public val RASPBDEVENT_EDIT_GLOBALS: UInt = 5u

public val RASPBDEVENT_NO_USER: UInt = 6u

public val RASPBDEVENT_NO_USER_EDIT: UInt = 7u

public val RASPBDEVENT_REMOVE_ENTRY: UInt = 3u

public val RASPBDFLAG_FORCE_CLOSE_ON_DIAL: UInt = 2u

public val RASPBDFLAG_NO_USER: UInt = 16u

public val RASPBDFLAG_POSITION_DLG: UInt = 1u

public val RASPBDFLAG_UPDATE_DEFAULTS: UInt = 2147483648u

public val RASPRIV2_DIALIN_POLICY: UInt = 1u

public val RASPRIV_ADMIN_SET_CALLBACK: UInt = 2u

public val RASPRIV_CALLER_SET_CALLBACK: UInt = 4u

public val RASPRIV_DIALIN_PRIVILEGE: UInt = 8u

public val RASPRIV_NO_CALLBACK: UInt = 1u

public val RASP_AMB: Rasprojection = 65536

public val RASP_PPP_CCP: Rasprojection = 33021

public val RASP_PPP_IP: Rasprojection = 32801

public val RASP_PPP_IPV6: Rasprojection = 32855

public val RASP_PPP_IPX: Rasprojection = 32811

public val RASP_PPP_LCP: Rasprojection = 49185

public val RASP_PPP_NBF: Rasprojection = 32831

public val RASTUNNELENDPOINT_I_PV4: UInt = 1u

public val RASTUNNELENDPOINT_I_PV6: UInt = 2u

public val RASTUNNELENDPOINT_UNKNOWN: UInt = 0u

public val RAS_FLAGS_ARAP_CONNECTION: RasFlags = 16u

public val RAS_FLAGS_DORMANT: RasFlags = 32u

public val RAS_FLAGS_IKEV2_CONNECTION: RasFlags = 16u

public val RAS_FLAGS_MESSENGER_PRESENT: RasFlags = 2u

public val RAS_FLAGS_PPP_CONNECTION: RasFlags = 1u

public val RAS_FLAGS_QUARANTINE_PRESENT: RasFlags = 8u

public val RAS_FLAGS_RAS_CONNECTION: UInt = 4u

public val RAS_HARDWARE_FAILURE: RasHardwareCondition = 1

public val RAS_HARDWARE_OPERATIONAL: RasHardwareCondition = 0

public val RAS_MAX_AREA_CODE: UInt = 10u

public val RAS_MAX_CALLBACK_NUMBER: UInt = 128u

public val RAS_MAX_DEVICE_NAME: UInt = 128u

public val RAS_MAX_DEVICE_TYPE: UInt = 16u

public val RAS_MAX_DNS_SUFFIX: UInt = 256u

public val RAS_MAX_ENTRY_NAME: UInt = 256u

public val RAS_MAX_FACILITIES: UInt = 200u

public val RAS_MAX_ID_SIZE: UInt = 256u

public val RAS_MAX_IP_ADDRESS: UInt = 15u

public val RAS_MAX_IPX_ADDRESS: UInt = 21u

public val RAS_MAX_PAD_TYPE: UInt = 32u

public val RAS_MAX_PHONE_NUMBER: UInt = 128u

public val RAS_MAX_REPLY_MESSAGE: UInt = 1024u

public val RAS_MAX_USER_DATA: UInt = 200u

public val RAS_MAX_X25ADDRESS: UInt = 200u

public val RAS_PORT_AUTHENTICATED: RasPortCondition = 5

public val RAS_PORT_AUTHENTICATING: RasPortCondition = 4

public val RAS_PORT_CALLING_BACK: RasPortCondition = 2

public val RAS_PORT_DISCONNECTED: RasPortCondition = 1

public val RAS_PORT_INITIALIZING: RasPortCondition = 6

public val RAS_PORT_LISTENING: RasPortCondition = 3

public val RAS_PORT_NON_OPERATIONAL: RasPortCondition = 0

public val RAS_QUAR_STATE_NORMAL: RasQuarantineState = 0

public val RAS_QUAR_STATE_NOT_CAPABLE: RasQuarantineState = 3

public val RAS_QUAR_STATE_PROBATION: RasQuarantineState = 2

public val RAS_QUAR_STATE_QUARANTINE: RasQuarantineState = 1

public val RCD_ALL_USERS: UInt = 1u

public val RCD_EAP: UInt = 2u

public val RCD_LOGON: UInt = 4u

public val RCD_SINGLE_USER: UInt = 0u

public val RDEOPT_CUSTOM_DIAL: UInt = 4096u

public val RDEOPT_DISABLE_CONNECTED_UI: UInt = 64u

public val RDEOPT_DISABLE_RECONNECT: UInt = 256u

public val RDEOPT_DISABLE_RECONNECT_UI: UInt = 128u

public val RDEOPT_EAP_INFO_CRYPT_IN_CAPABLE: UInt = 32768u

public val RDEOPT_IGNORE_MODEM_SPEAKER: UInt = 4u

public val RDEOPT_IGNORE_SOFTWARE_COMPRESSION: UInt = 16u

public val RDEOPT_INVOKE_AUTO_TRIGGER_CREDENTIAL_UI: UInt = 16384u

public val RDEOPT_NO_USER: UInt = 512u

public val RDEOPT_PAUSE_ON_SCRIPT: UInt = 1024u

public val RDEOPT_PAUSED_STATES: UInt = 2u

public val RDEOPT_ROUTER: UInt = 2048u

public val RDEOPT_SET_MODEM_SPEAKER: UInt = 8u

public val RDEOPT_SET_SOFTWARE_COMPRESSION: UInt = 32u

public val RDEOPT_USE_CUSTOM_SCRIPTING: UInt = 8192u

public val RDEOPT_USE_PREFIX_SUFFIX: UInt = 1u

public val REN_ALL_USERS: UInt = 1u

public val REN_USER: UInt = 0u

public val ROUTER_IF_STATE_CONNECTED: RouterConnectionState = 3

public val ROUTER_IF_STATE_CONNECTING: RouterConnectionState = 2

public val ROUTER_IF_STATE_DISCONNECTED: RouterConnectionState = 1

public val ROUTER_IF_STATE_UNREACHABLE: RouterConnectionState = 0

public val ROUTER_IF_TYPE_CLIENT: RouterInterfaceType = 0

public val ROUTER_IF_TYPE_DEDICATED: RouterInterfaceType = 3

public val ROUTER_IF_TYPE_DIALOUT: RouterInterfaceType = 7

public val ROUTER_IF_TYPE_FULL_ROUTER: RouterInterfaceType = 2

public val ROUTER_IF_TYPE_HOME_ROUTER: RouterInterfaceType = 1

public val ROUTER_IF_TYPE_INTERNAL: RouterInterfaceType = 4

public val ROUTER_IF_TYPE_LOOPBACK: RouterInterfaceType = 5

public val ROUTER_IF_TYPE_MAX: RouterInterfaceType = 8

public val ROUTER_IF_TYPE_TUNNEL1: RouterInterfaceType = 6

public val RRAS_SERVICE_NAME: Pcwstr = w("RemoteAccess")

public val RTM_BLOCK_METHODS: UInt = 1u

public val RTM_CHANGE_NOTIFICATION: RtmEventType = 3

public val RTM_CHANGE_TYPE_ALL: UInt = 1u

public val RTM_CHANGE_TYPE_BEST: UInt = 2u

public val RTM_CHANGE_TYPE_FORWARDING: UInt = 4u

public val RTM_DEST_FLAG_DONT_FORWARD: UInt = 4u

public val RTM_DEST_FLAG_FWD_ENGIN_ADD: UInt = 2u

public val RTM_DEST_FLAG_NATURAL_NET: UInt = 1u

public val RTM_ENTITY_DEREGISTERED: RtmEventType = 1

public val RTM_ENTITY_REGISTERED: RtmEventType = 0

public val RTM_ENUM_ALL_DESTS: UInt = 0u

public val RTM_ENUM_ALL_ROUTES: UInt = 0u

public val RTM_ENUM_NEXT: UInt = 1u

public val RTM_ENUM_OWN_DESTS: UInt = 16777216u

public val RTM_ENUM_OWN_ROUTES: UInt = 65536u

public val RTM_ENUM_RANGE: UInt = 2u

public val RTM_ENUM_START: UInt = 0u

public val RTM_MATCH_FULL: UInt = 65535u

public val RTM_MATCH_INTERFACE: UInt = 16u

public val RTM_MATCH_NEIGHBOUR: UInt = 2u

public val RTM_MATCH_NEXTHOP: UInt = 8u

public val RTM_MATCH_NONE: UInt = 0u

public val RTM_MATCH_OWNER: UInt = 1u

public val RTM_MATCH_PREF: UInt = 4u

public val RTM_MAX_ADDRESS_SIZE: UInt = 16u

public val RTM_MAX_VIEWS: UInt = 32u

public val RTM_NEXTHOP_CHANGE_NEW: UInt = 1u

public val RTM_NEXTHOP_FLAGS_DOWN: UInt = 2u

public val RTM_NEXTHOP_FLAGS_REMOTE: UInt = 1u

public val RTM_NEXTHOP_STATE_CREATED: UInt = 0u

public val RTM_NEXTHOP_STATE_DELETED: UInt = 1u

public val RTM_NOTIFY_ONLY_MARKED_DESTS: UInt = 65536u

public val RTM_NUM_CHANGE_TYPES: UInt = 3u

public val RTM_RESUME_METHODS: UInt = 0u

public val RTM_ROUTE_CHANGE_BEST: UInt = 65536u

public val RTM_ROUTE_CHANGE_FIRST: UInt = 1u

public val RTM_ROUTE_CHANGE_NEW: UInt = 2u

public val RTM_ROUTE_EXPIRED: RtmEventType = 2

public val RTM_ROUTE_FLAGS_BLACKHOLE: UInt = 2u

public val RTM_ROUTE_FLAGS_DISCARD: UInt = 4u

public val RTM_ROUTE_FLAGS_INACTIVE: UInt = 8u

public val RTM_ROUTE_FLAGS_LIMITED_BC: UInt = 1024u

public val RTM_ROUTE_FLAGS_LOCAL: UInt = 16u

public val RTM_ROUTE_FLAGS_LOCAL_MCAST: UInt = 512u

public val RTM_ROUTE_FLAGS_LOOPBACK: UInt = 128u

public val RTM_ROUTE_FLAGS_MARTIAN: UInt = 1u

public val RTM_ROUTE_FLAGS_MCAST: UInt = 256u

public val RTM_ROUTE_FLAGS_MYSELF: UInt = 64u

public val RTM_ROUTE_FLAGS_ONES_NETBC: UInt = 16384u

public val RTM_ROUTE_FLAGS_ONES_SUBNETBC: UInt = 32768u

public val RTM_ROUTE_FLAGS_REMOTE: UInt = 32u

public val RTM_ROUTE_FLAGS_ZEROS_NETBC: UInt = 4096u

public val RTM_ROUTE_FLAGS_ZEROS_SUBNETBC: UInt = 8192u

public val RTM_ROUTE_STATE_CREATED: UInt = 0u

public val RTM_ROUTE_STATE_DELETED: UInt = 2u

public val RTM_ROUTE_STATE_DELETING: UInt = 1u

public val RTM_VIEW_ID_MCAST: UInt = 1u

public val RTM_VIEW_ID_UCAST: UInt = 0u

public val RTM_VIEW_MASK_ALL: UInt = 4294967295u

public val RTM_VIEW_MASK_ANY: UInt = 0u

public val RTM_VIEW_MASK_MCAST: UInt = 2u

public val RTM_VIEW_MASK_NONE: UInt = 0u

public val RTM_VIEW_MASK_SIZE: UInt = 32u

public val RTM_VIEW_MASK_UCAST: UInt = 1u

public val SECURITYMSG_ERROR: SecurityMessageMsgId = 3u

public val SECURITYMSG_FAILURE: SecurityMessageMsgId = 2u

public val SECURITYMSG_SUCCESS: SecurityMessageMsgId = 1u

public val VS_DEFAULT: UInt = 0u

public val VS_GRE_ONLY: UInt = 9u

public val VS_IKEV2FIRST: UInt = 8u

public val VS_IKEV2ONLY: UInt = 7u

public val VS_IKEV2SSTP: UInt = 14u

public val VS_L2TP_FIRST: UInt = 4u

public val VS_L2TP_ONLY: UInt = 3u

public val VS_L2TP_SSTP: UInt = 13u

public val VS_PPTP_FIRST: UInt = 2u

public val VS_PPTP_ONLY: UInt = 1u

public val VS_PPTP_SSTP: UInt = 12u

public val VS_PROTOCOL_LIST: UInt = 15u

public val VS_SSTP_FIRST: UInt = 6u

public val VS_SSTP_ONLY: UInt = 5u

public val WARNING_MSG_ALIAS_NOT_ADDED: UInt = 644u

public val WM_RASDIALEVENT: UInt = 52429u
