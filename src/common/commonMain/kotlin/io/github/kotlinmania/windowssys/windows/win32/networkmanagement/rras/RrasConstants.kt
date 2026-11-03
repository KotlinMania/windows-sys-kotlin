package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ALLOW_NO_AUTH: UInt = 1u

public val ALL_SOURCES: MGM_ENUM_TYPES = 1

public val ANY_SOURCE: MGM_ENUM_TYPES = 0

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

public val ET_None: UInt = 0u

public val ET_Optional: UInt = 3u

public val ET_Require: UInt = 1u

public val ET_RequireMax: UInt = 2u

public val IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_DN: IKEV2_ID_PAYLOAD_TYPE = 9

public val IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_GN: IKEV2_ID_PAYLOAD_TYPE = 10

public val IKEV2_ID_PAYLOAD_TYPE_FQDN: IKEV2_ID_PAYLOAD_TYPE = 2

public val IKEV2_ID_PAYLOAD_TYPE_ID_IPV6_ADDR: IKEV2_ID_PAYLOAD_TYPE = 5

public val IKEV2_ID_PAYLOAD_TYPE_INVALID: IKEV2_ID_PAYLOAD_TYPE = 0

public val IKEV2_ID_PAYLOAD_TYPE_IPV4_ADDR: IKEV2_ID_PAYLOAD_TYPE = 1

public val IKEV2_ID_PAYLOAD_TYPE_KEY_ID: IKEV2_ID_PAYLOAD_TYPE = 11

public val IKEV2_ID_PAYLOAD_TYPE_MAX: IKEV2_ID_PAYLOAD_TYPE = 12

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED1: IKEV2_ID_PAYLOAD_TYPE = 4

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED2: IKEV2_ID_PAYLOAD_TYPE = 6

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED3: IKEV2_ID_PAYLOAD_TYPE = 7

public val IKEV2_ID_PAYLOAD_TYPE_RESERVED4: IKEV2_ID_PAYLOAD_TYPE = 8

public val IKEV2_ID_PAYLOAD_TYPE_RFC822_ADDR: IKEV2_ID_PAYLOAD_TYPE = 3

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

public val MPRAPI_OBJECT_TYPE_AUTH_VALIDATION_OBJECT: MPRAPI_OBJECT_TYPE = 4

public val MPRAPI_OBJECT_TYPE_IF_CUSTOM_CONFIG_OBJECT: MPRAPI_OBJECT_TYPE = 6

public val MPRAPI_OBJECT_TYPE_MPR_SERVER_OBJECT: MPRAPI_OBJECT_TYPE = 2

public val MPRAPI_OBJECT_TYPE_MPR_SERVER_SET_CONFIG_OBJECT: MPRAPI_OBJECT_TYPE = 3

public val MPRAPI_OBJECT_TYPE_RAS_CONNECTION_OBJECT: MPRAPI_OBJECT_TYPE = 1

public val MPRAPI_OBJECT_TYPE_UPDATE_CONNECTION_OBJECT: MPRAPI_OBJECT_TYPE = 5

public val MPRAPI_PPP_PROJECTION_INFO_TYPE: UInt = 1u

public val MPRAPI_RAS_CONNECTION_OBJECT_REVISION_1: UInt = 1u

public val MPRAPI_RAS_UPDATE_CONNECTION_OBJECT_REVISION_1: UInt = 1u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_GRE: UInt = 16u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_IKEV2: UInt = 8u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_L2TP: UInt = 2u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_PPTP: UInt = 1u

public val MPRAPI_SET_CONFIG_PROTOCOL_FOR_SSTP: UInt = 4u

public val MPRDM_DialAll: MPR_INTERFACE_DIAL_MODE = 1u

public val MPRDM_DialAsNeeded: MPR_INTERFACE_DIAL_MODE = 2u

public val MPRDM_DialFirst: MPR_INTERFACE_DIAL_MODE = 0u

public val MPRDT_Atm: PCWSTR = w("ATM")

public val MPRDT_FrameRelay: PCWSTR = w("FRAMERELAY")

public val MPRDT_Generic: PCWSTR = w("GENERIC")

public val MPRDT_Irda: PCWSTR = w("IRDA")

public val MPRDT_Isdn: PCWSTR = w("isdn")

public val MPRDT_Modem: PCWSTR = w("modem")

public val MPRDT_Pad: PCWSTR = w("pad")

public val MPRDT_Parallel: PCWSTR = w("PARALLEL")

public val MPRDT_SW56: PCWSTR = w("SW56")

public val MPRDT_Serial: PCWSTR = w("SERIAL")

public val MPRDT_Sonet: PCWSTR = w("SONET")

public val MPRDT_Vpn: PCWSTR = w("vpn")

public val MPRDT_X25: PCWSTR = w("x25")

public val MPRET_Direct: UInt = 3u

public val MPRET_Phone: UInt = 1u

public val MPRET_Vpn: UInt = 2u

public val MPRIDS_Disabled: UInt = 4294967295u

public val MPRIDS_UseGlobalValue: UInt = 0u

public val MPRIO_DisableLcpExtensions: UInt = 32u

public val MPRIO_IpHeaderCompression: UInt = 8u

public val MPRIO_IpSecPreSharedKey: UInt = 2147483648u

public val MPRIO_NetworkLogon: UInt = 8192u

public val MPRIO_PromoteAlternates: UInt = 32768u

public val MPRIO_RemoteDefaultGateway: UInt = 16u

public val MPRIO_RequireCHAP: UInt = 134217728u

public val MPRIO_RequireDataEncryption: UInt = 4096u

public val MPRIO_RequireEAP: UInt = 131072u

public val MPRIO_RequireEncryptedPw: UInt = 1024u

public val MPRIO_RequireMachineCertificates: UInt = 16777216u

public val MPRIO_RequireMsCHAP: UInt = 268435456u

public val MPRIO_RequireMsCHAP2: UInt = 536870912u

public val MPRIO_RequireMsEncryptedPw: UInt = 2048u

public val MPRIO_RequirePAP: UInt = 262144u

public val MPRIO_RequireSPAP: UInt = 524288u

public val MPRIO_SecureLocalFiles: UInt = 65536u

public val MPRIO_SharedPhoneNumbers: UInt = 8388608u

public val MPRIO_SpecificIpAddr: UInt = 2u

public val MPRIO_SpecificNameServers: UInt = 4u

public val MPRIO_SwCompression: UInt = 512u

public val MPRIO_UsePreSharedKeyForIkev2Initiator: UInt = 33554432u

public val MPRIO_UsePreSharedKeyForIkev2Responder: UInt = 67108864u

public val MPRNP_Ip: UInt = 4u

public val MPRNP_Ipv6: UInt = 8u

public val MPRNP_Ipx: UInt = 2u

public val MPR_ENABLE_RAS_ON_DEVICE: UInt = 1u

public val MPR_ENABLE_ROUTING_ON_DEVICE: UInt = 2u

public val MPR_ET_None: MPR_ET = 0u

public val MPR_ET_Optional: MPR_ET = 3u

public val MPR_ET_Require: MPR_ET = 1u

public val MPR_ET_RequireMax: MPR_ET = 2u

public val MPR_INTERFACE_ADMIN_DISABLED: UInt = 2u

public val MPR_INTERFACE_CONNECTION_FAILURE: UInt = 4u

public val MPR_INTERFACE_DIALOUT_HOURS_RESTRICTION: UInt = 16u

public val MPR_INTERFACE_NO_DEVICE: UInt = 64u

public val MPR_INTERFACE_NO_MEDIA_SENSE: UInt = 32u

public val MPR_INTERFACE_OUT_OF_RESOURCES: UInt = 1u

public val MPR_INTERFACE_SERVICE_PAUSED: UInt = 8u

public val MPR_MaxAreaCode: UInt = 10u

public val MPR_MaxCallbackNumber: UInt = 128u

public val MPR_MaxDeviceName: UInt = 128u

public val MPR_MaxDeviceType: UInt = 16u

public val MPR_MaxEntryName: UInt = 256u

public val MPR_MaxFacilities: UInt = 200u

public val MPR_MaxIpAddress: UInt = 15u

public val MPR_MaxIpxAddress: UInt = 21u

public val MPR_MaxPadType: UInt = 32u

public val MPR_MaxPhoneNumber: UInt = 128u

public val MPR_MaxUserData: UInt = 200u

public val MPR_MaxX25Address: UInt = 200u

public val MPR_VPN_TS_IPv4_ADDR_RANGE: MPR_VPN_TS_TYPE = 7

public val MPR_VPN_TS_IPv6_ADDR_RANGE: MPR_VPN_TS_TYPE = 8

public val MPR_VS_Default: MPR_VS = 0u

public val MPR_VS_Ikev2First: UInt = 8u

public val MPR_VS_Ikev2Only: UInt = 7u

public val MPR_VS_L2tpFirst: MPR_VS = 4u

public val MPR_VS_L2tpOnly: MPR_VS = 3u

public val MPR_VS_PptpFirst: MPR_VS = 2u

public val MPR_VS_PptpOnly: MPR_VS = 1u

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

public val PPP_LCP_CHAP: PPP_LCP = 49699u

public val PPP_LCP_CHAP_MD5: PPP_LCP_INFO_AUTH_DATA = 5u

public val PPP_LCP_CHAP_MS: PPP_LCP_INFO_AUTH_DATA = 128u

public val PPP_LCP_CHAP_MSV2: PPP_LCP_INFO_AUTH_DATA = 129u

public val PPP_LCP_DES_56: UInt = 16u

public val PPP_LCP_EAP: PPP_LCP = 49703u

public val PPP_LCP_GCM_AES_128: UInt = 512u

public val PPP_LCP_GCM_AES_192: UInt = 1024u

public val PPP_LCP_GCM_AES_256: UInt = 2048u

public val PPP_LCP_MULTILINK_FRAMING: UInt = 1u

public val PPP_LCP_PAP: PPP_LCP = 49187u

public val PPP_LCP_PFC: UInt = 2u

public val PPP_LCP_SPAP: PPP_LCP = 49191u

public val PPP_LCP_SSHF: UInt = 8u

public val PROJECTION_INFO_TYPE_IKEv2: RASPROJECTION_INFO_TYPE = 2

public val PROJECTION_INFO_TYPE_PPP: RASPROJECTION_INFO_TYPE = 1

public val RASADFLG_PositionDlg: UInt = 1u

public val RASADP_ConnectionQueryTimeout: UInt = 4u

public val RASADP_DisableConnectionQuery: UInt = 0u

public val RASADP_FailedConnectionTimeout: UInt = 3u

public val RASADP_LoginSessionDisable: UInt = 1u

public val RASADP_SavedAddressesLimit: UInt = 2u

public val RASAPIVERSION_500: RASAPIVERSION = 1

public val RASAPIVERSION_501: RASAPIVERSION = 2

public val RASAPIVERSION_600: RASAPIVERSION = 3

public val RASAPIVERSION_601: RASAPIVERSION = 4

public val RASBASE: UInt = 600u

public val RASBASEEND: UInt = 877u

public val RASCCPCA_MPPC: UInt = 6u

public val RASCCPCA_STAC: UInt = 5u

public val RASCCPO_Compression: UInt = 1u

public val RASCCPO_Encryption128bit: UInt = 64u

public val RASCCPO_Encryption40bit: UInt = 32u

public val RASCCPO_Encryption56bit: UInt = 16u

public val RASCCPO_HistoryLess: UInt = 2u

public val RASCF_AllUsers: UInt = 1u

public val RASCF_GlobalCreds: UInt = 2u

public val RASCF_OwnerKnown: UInt = 4u

public val RASCF_OwnerMatch: UInt = 8u

public val RASCM_DDMPreSharedKey: UInt = 64u

public val RASCM_DefaultCreds: UInt = 8u

public val RASCM_Domain: UInt = 4u

public val RASCM_Password: UInt = 2u

public val RASCM_PreSharedKey: UInt = 16u

public val RASCM_ServerPreSharedKey: UInt = 32u

public val RASCM_UserName: UInt = 1u

public val RASCN_BandwidthAdded: UInt = 4u

public val RASCN_BandwidthRemoved: UInt = 8u

public val RASCN_Connection: UInt = 1u

public val RASCN_Disconnection: UInt = 2u

public val RASCN_Dormant: UInt = 16u

public val RASCN_EPDGPacketArrival: UInt = 64u

public val RASCN_ReConnection: UInt = 32u

public val RASCSS_DONE: UInt = 8192u

public val RASCSS_Dormant: RASCONNSUBSTATE = 1

public val RASCSS_None: RASCONNSUBSTATE = 0

public val RASCSS_Reconnected: RASCONNSUBSTATE = 8192

public val RASCSS_Reconnecting: RASCONNSUBSTATE = 2

public val RASCS_AllDevicesConnected: RASCONNSTATE = 4

public val RASCS_ApplySettings: RASCONNSTATE = 24

public val RASCS_AuthAck: RASCONNSTATE = 12

public val RASCS_AuthCallback: RASCONNSTATE = 8

public val RASCS_AuthChangePassword: RASCONNSTATE = 9

public val RASCS_AuthLinkSpeed: RASCONNSTATE = 11

public val RASCS_AuthNotify: RASCONNSTATE = 6

public val RASCS_AuthProject: RASCONNSTATE = 10

public val RASCS_AuthRetry: RASCONNSTATE = 7

public val RASCS_Authenticate: RASCONNSTATE = 5

public val RASCS_Authenticated: RASCONNSTATE = 14

public val RASCS_CallbackComplete: RASCONNSTATE = 20

public val RASCS_CallbackSetByCaller: RASCONNSTATE = 4098

public val RASCS_ConnectDevice: RASCONNSTATE = 2

public val RASCS_Connected: RASCONNSTATE = 8192

public val RASCS_DONE: UInt = 8192u

public val RASCS_DeviceConnected: RASCONNSTATE = 3

public val RASCS_Disconnected: RASCONNSTATE = 8193

public val RASCS_Interactive: RASCONNSTATE = 4096

public val RASCS_InvokeEapUI: RASCONNSTATE = 4100

public val RASCS_LogonNetwork: RASCONNSTATE = 21

public val RASCS_OpenPort: RASCONNSTATE = 0

public val RASCS_PAUSED: UInt = 4096u

public val RASCS_PasswordExpired: RASCONNSTATE = 4099

public val RASCS_PortOpened: RASCONNSTATE = 1

public val RASCS_PrepareForCallback: RASCONNSTATE = 15

public val RASCS_Projected: RASCONNSTATE = 18

public val RASCS_ReAuthenticate: RASCONNSTATE = 13

public val RASCS_RetryAuthentication: RASCONNSTATE = 4097

public val RASCS_StartAuthentication: RASCONNSTATE = 19

public val RASCS_SubEntryConnected: RASCONNSTATE = 22

public val RASCS_SubEntryDisconnected: RASCONNSTATE = 23

public val RASCS_WaitForCallback: RASCONNSTATE = 17

public val RASCS_WaitForModemReset: RASCONNSTATE = 16

public val RASDDFLAG_AoacRedial: UInt = 4u

public val RASDDFLAG_LinkFailure: UInt = 2147483648u

public val RASDDFLAG_NoPrompt: UInt = 2u

public val RASDDFLAG_PositionDlg: UInt = 1u

public val RASDIALEVENT: PCSTR = s("RasDialEvent")

public val RASDT_Atm: PCWSTR = w("ATM")

public val RASDT_FrameRelay: PCWSTR = w("FRAMERELAY")

public val RASDT_Generic: PCWSTR = w("GENERIC")

public val RASDT_Irda: PCWSTR = w("IRDA")

public val RASDT_Isdn: PCWSTR = w("isdn")

public val RASDT_Modem: PCWSTR = w("modem")

public val RASDT_PPPoE: PCWSTR = w("PPPoE")

public val RASDT_Pad: PCWSTR = w("pad")

public val RASDT_Parallel: PCWSTR = w("PARALLEL")

public val RASDT_SW56: PCWSTR = w("SW56")

public val RASDT_Serial: PCWSTR = w("SERIAL")

public val RASDT_Sonet: PCWSTR = w("SONET")

public val RASDT_Vpn: PCWSTR = w("vpn")

public val RASDT_X25: PCWSTR = w("x25")

public val RASEAPF_Logon: UInt = 4u

public val RASEAPF_NonInteractive: UInt = 2u

public val RASEAPF_Preview: UInt = 8u

public val RASEDFLAG_CloneEntry: UInt = 4u

public val RASEDFLAG_IncomingConnection: UInt = 1024u

public val RASEDFLAG_InternetEntry: UInt = 256u

public val RASEDFLAG_NAT: UInt = 512u

public val RASEDFLAG_NewBroadbandEntry: UInt = 128u

public val RASEDFLAG_NewDirectEntry: UInt = 64u

public val RASEDFLAG_NewEntry: UInt = 2u

public val RASEDFLAG_NewPhoneEntry: UInt = 16u

public val RASEDFLAG_NewTunnelEntry: UInt = 32u

public val RASEDFLAG_NoRename: UInt = 8u

public val RASEDFLAG_PositionDlg: UInt = 1u

public val RASEDFLAG_ShellOwned: UInt = 1073741824u

public val RASEDM_DialAll: RASENTRY_DIAL_MODE = 1u

public val RASEDM_DialAsNeeded: RASENTRY_DIAL_MODE = 2u

public val RASEO2_AuthTypeIsOtp: UInt = 268435456u

public val RASEO2_AutoTriggerCapable: UInt = 67108864u

public val RASEO2_CacheCredentials: UInt = 33554432u

public val RASEO2_DisableClassBasedStaticRoute: UInt = 524288u

public val RASEO2_DisableIKENameEkuCheck: UInt = 262144u

public val RASEO2_DisableMobility: UInt = 2097152u

public val RASEO2_DisableNbtOverIP: UInt = 64u

public val RASEO2_DontNegotiateMultilink: UInt = 4u

public val RASEO2_DontUseRasCredentials: UInt = 8u

public val RASEO2_IPv4ExplicitMetric: UInt = 65536u

public val RASEO2_IPv6ExplicitMetric: UInt = 131072u

public val RASEO2_IPv6RemoteDefaultGateway: UInt = 8192u

public val RASEO2_IPv6SpecificNameServers: UInt = 4096u

public val RASEO2_Internet: UInt = 32u

public val RASEO2_IsAlwaysOn: UInt = 536870912u

public val RASEO2_IsPrivateNetwork: UInt = 1073741824u

public val RASEO2_IsThirdPartyProfile: UInt = 134217728u

public val RASEO2_PlumbIKEv2TSAsRoutes: UInt = 2147483648u

public val RASEO2_ReconnectIfDropped: UInt = 256u

public val RASEO2_RegisterIpWithDNS: UInt = 16384u

public val RASEO2_RequireMachineCertificates: UInt = 4194304u

public val RASEO2_SecureClientForMSNet: UInt = 2u

public val RASEO2_SecureFileAndPrint: UInt = 1u

public val RASEO2_SecureRoutingCompartment: UInt = 1024u

public val RASEO2_SharePhoneNumbers: UInt = 512u

public val RASEO2_SpecificIPv6Addr: UInt = 1048576u

public val RASEO2_UseDNSSuffixForRegistration: UInt = 32768u

public val RASEO2_UseGlobalDeviceSettings: UInt = 128u

public val RASEO2_UsePreSharedKey: UInt = 16u

public val RASEO2_UsePreSharedKeyForIkev2Initiator: UInt = 8388608u

public val RASEO2_UsePreSharedKeyForIkev2Responder: UInt = 16777216u

public val RASEO2_UseTypicalSettings: UInt = 2048u

public val RASEO_Custom: UInt = 1048576u

public val RASEO_CustomScript: UInt = 2147483648u

public val RASEO_DisableLcpExtensions: UInt = 32u

public val RASEO_IpHeaderCompression: UInt = 8u

public val RASEO_ModemLights: UInt = 256u

public val RASEO_NetworkLogon: UInt = 8192u

public val RASEO_PreviewDomain: UInt = 33554432u

public val RASEO_PreviewPhoneNumber: UInt = 2097152u

public val RASEO_PreviewUserPw: UInt = 16777216u

public val RASEO_PromoteAlternates: UInt = 32768u

public val RASEO_RemoteDefaultGateway: UInt = 16u

public val RASEO_RequireCHAP: UInt = 134217728u

public val RASEO_RequireDataEncryption: UInt = 4096u

public val RASEO_RequireEAP: UInt = 131072u

public val RASEO_RequireEncryptedPw: UInt = 1024u

public val RASEO_RequireMsCHAP: UInt = 268435456u

public val RASEO_RequireMsCHAP2: UInt = 536870912u

public val RASEO_RequireMsEncryptedPw: UInt = 2048u

public val RASEO_RequirePAP: UInt = 262144u

public val RASEO_RequireSPAP: UInt = 524288u

public val RASEO_RequireW95MSCHAP: UInt = 1073741824u

public val RASEO_SecureLocalFiles: UInt = 65536u

public val RASEO_SharedPhoneNumbers: UInt = 8388608u

public val RASEO_ShowDialingProgress: UInt = 67108864u

public val RASEO_SpecificIpAddr: UInt = 2u

public val RASEO_SpecificNameServers: UInt = 4u

public val RASEO_SwCompression: UInt = 512u

public val RASEO_TerminalAfterDial: UInt = 128u

public val RASEO_TerminalBeforeDial: UInt = 64u

public val RASEO_UseCountryAndAreaCodes: UInt = 1u

public val RASEO_UseLogonCredentials: UInt = 16384u

public val RASET_Broadband: UInt = 5u

public val RASET_Direct: UInt = 3u

public val RASET_Internet: UInt = 4u

public val RASET_Phone: UInt = 1u

public val RASET_Vpn: UInt = 2u

public val RASFP_Ppp: UInt = 1u

public val RASFP_Ras: UInt = 4u

public val RASFP_Slip: UInt = 2u

public val RASIDS_Disabled: UInt = 4294967295u

public val RASIDS_UseGlobalValue: UInt = 0u

public val RASIKEv2_AUTH_EAP: UInt = 2u

public val RASIKEv2_AUTH_MACHINECERTIFICATES: UInt = 1u

public val RASIKEv2_AUTH_PSK: UInt = 3u

public val RASIKEv2_FLAGS_BEHIND_NAT: RASIKEV_PROJECTION_INFO_FLAGS = 2u

public val RASIKEv2_FLAGS_MOBIKESUPPORTED: RASIKEV_PROJECTION_INFO_FLAGS = 1u

public val RASIKEv2_FLAGS_SERVERBEHIND_NAT: RASIKEV_PROJECTION_INFO_FLAGS = 4u

public val RASIPO_VJ: UInt = 1u

public val RASLCPAD_CHAP_MD5: RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA = 5u

public val RASLCPAD_CHAP_MS: RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA = 128u

public val RASLCPAD_CHAP_MSV2: RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA = 129u

public val RASLCPAP_CHAP: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL = 49699u

public val RASLCPAP_EAP: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL = 49703u

public val RASLCPAP_PAP: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL = 49187u

public val RASLCPAP_SPAP: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL = 49191u

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

public val RASNAP_ProbationTime: UInt = 1u

public val RASNOUSER_SmartCard: UInt = 1u

public val RASNP_Ip: UInt = 4u

public val RASNP_Ipv6: UInt = 8u

public val RASNP_Ipx: UInt = 2u

public val RASNP_NetBEUI: UInt = 1u

public val RASPBDEVENT_AddEntry: UInt = 1u

public val RASPBDEVENT_DialEntry: UInt = 4u

public val RASPBDEVENT_EditEntry: UInt = 2u

public val RASPBDEVENT_EditGlobals: UInt = 5u

public val RASPBDEVENT_NoUser: UInt = 6u

public val RASPBDEVENT_NoUserEdit: UInt = 7u

public val RASPBDEVENT_RemoveEntry: UInt = 3u

public val RASPBDFLAG_ForceCloseOnDial: UInt = 2u

public val RASPBDFLAG_NoUser: UInt = 16u

public val RASPBDFLAG_PositionDlg: UInt = 1u

public val RASPBDFLAG_UpdateDefaults: UInt = 2147483648u

public val RASPRIV2_DialinPolicy: UInt = 1u

public val RASPRIV_AdminSetCallback: UInt = 2u

public val RASPRIV_CallerSetCallback: UInt = 4u

public val RASPRIV_DialinPrivilege: UInt = 8u

public val RASPRIV_NoCallback: UInt = 1u

public val RASP_Amb: RASPROJECTION = 65536

public val RASP_PppCcp: RASPROJECTION = 33021

public val RASP_PppIp: RASPROJECTION = 32801

public val RASP_PppIpv6: RASPROJECTION = 32855

public val RASP_PppIpx: RASPROJECTION = 32811

public val RASP_PppLcp: RASPROJECTION = 49185

public val RASP_PppNbf: RASPROJECTION = 32831

public val RASTUNNELENDPOINT_IPv4: UInt = 1u

public val RASTUNNELENDPOINT_IPv6: UInt = 2u

public val RASTUNNELENDPOINT_UNKNOWN: UInt = 0u

public val RAS_FLAGS_ARAP_CONNECTION: RAS_FLAGS = 16u

public val RAS_FLAGS_DORMANT: RAS_FLAGS = 32u

public val RAS_FLAGS_IKEV2_CONNECTION: RAS_FLAGS = 16u

public val RAS_FLAGS_MESSENGER_PRESENT: RAS_FLAGS = 2u

public val RAS_FLAGS_PPP_CONNECTION: RAS_FLAGS = 1u

public val RAS_FLAGS_QUARANTINE_PRESENT: RAS_FLAGS = 8u

public val RAS_FLAGS_RAS_CONNECTION: UInt = 4u

public val RAS_HARDWARE_FAILURE: RAS_HARDWARE_CONDITION = 1

public val RAS_HARDWARE_OPERATIONAL: RAS_HARDWARE_CONDITION = 0

public val RAS_MaxAreaCode: UInt = 10u

public val RAS_MaxCallbackNumber: UInt = 128u

public val RAS_MaxDeviceName: UInt = 128u

public val RAS_MaxDeviceType: UInt = 16u

public val RAS_MaxDnsSuffix: UInt = 256u

public val RAS_MaxEntryName: UInt = 256u

public val RAS_MaxFacilities: UInt = 200u

public val RAS_MaxIDSize: UInt = 256u

public val RAS_MaxIpAddress: UInt = 15u

public val RAS_MaxIpxAddress: UInt = 21u

public val RAS_MaxPadType: UInt = 32u

public val RAS_MaxPhoneNumber: UInt = 128u

public val RAS_MaxReplyMessage: UInt = 1024u

public val RAS_MaxUserData: UInt = 200u

public val RAS_MaxX25Address: UInt = 200u

public val RAS_PORT_AUTHENTICATED: RAS_PORT_CONDITION = 5

public val RAS_PORT_AUTHENTICATING: RAS_PORT_CONDITION = 4

public val RAS_PORT_CALLING_BACK: RAS_PORT_CONDITION = 2

public val RAS_PORT_DISCONNECTED: RAS_PORT_CONDITION = 1

public val RAS_PORT_INITIALIZING: RAS_PORT_CONDITION = 6

public val RAS_PORT_LISTENING: RAS_PORT_CONDITION = 3

public val RAS_PORT_NON_OPERATIONAL: RAS_PORT_CONDITION = 0

public val RAS_QUAR_STATE_NORMAL: RAS_QUARANTINE_STATE = 0

public val RAS_QUAR_STATE_NOT_CAPABLE: RAS_QUARANTINE_STATE = 3

public val RAS_QUAR_STATE_PROBATION: RAS_QUARANTINE_STATE = 2

public val RAS_QUAR_STATE_QUARANTINE: RAS_QUARANTINE_STATE = 1

public val RCD_AllUsers: UInt = 1u

public val RCD_Eap: UInt = 2u

public val RCD_Logon: UInt = 4u

public val RCD_SingleUser: UInt = 0u

public val RDEOPT_CustomDial: UInt = 4096u

public val RDEOPT_DisableConnectedUI: UInt = 64u

public val RDEOPT_DisableReconnect: UInt = 256u

public val RDEOPT_DisableReconnectUI: UInt = 128u

public val RDEOPT_EapInfoCryptInCapable: UInt = 32768u

public val RDEOPT_IgnoreModemSpeaker: UInt = 4u

public val RDEOPT_IgnoreSoftwareCompression: UInt = 16u

public val RDEOPT_InvokeAutoTriggerCredentialUI: UInt = 16384u

public val RDEOPT_NoUser: UInt = 512u

public val RDEOPT_PauseOnScript: UInt = 1024u

public val RDEOPT_PausedStates: UInt = 2u

public val RDEOPT_Router: UInt = 2048u

public val RDEOPT_SetModemSpeaker: UInt = 8u

public val RDEOPT_SetSoftwareCompression: UInt = 32u

public val RDEOPT_UseCustomScripting: UInt = 8192u

public val RDEOPT_UsePrefixSuffix: UInt = 1u

public val REN_AllUsers: UInt = 1u

public val REN_User: UInt = 0u

public val ROUTER_IF_STATE_CONNECTED: ROUTER_CONNECTION_STATE = 3

public val ROUTER_IF_STATE_CONNECTING: ROUTER_CONNECTION_STATE = 2

public val ROUTER_IF_STATE_DISCONNECTED: ROUTER_CONNECTION_STATE = 1

public val ROUTER_IF_STATE_UNREACHABLE: ROUTER_CONNECTION_STATE = 0

public val ROUTER_IF_TYPE_CLIENT: ROUTER_INTERFACE_TYPE = 0

public val ROUTER_IF_TYPE_DEDICATED: ROUTER_INTERFACE_TYPE = 3

public val ROUTER_IF_TYPE_DIALOUT: ROUTER_INTERFACE_TYPE = 7

public val ROUTER_IF_TYPE_FULL_ROUTER: ROUTER_INTERFACE_TYPE = 2

public val ROUTER_IF_TYPE_HOME_ROUTER: ROUTER_INTERFACE_TYPE = 1

public val ROUTER_IF_TYPE_INTERNAL: ROUTER_INTERFACE_TYPE = 4

public val ROUTER_IF_TYPE_LOOPBACK: ROUTER_INTERFACE_TYPE = 5

public val ROUTER_IF_TYPE_MAX: ROUTER_INTERFACE_TYPE = 8

public val ROUTER_IF_TYPE_TUNNEL1: ROUTER_INTERFACE_TYPE = 6

public val RRAS_SERVICE_NAME: PCWSTR = w("RemoteAccess")

public val RTM_BLOCK_METHODS: UInt = 1u

public val RTM_CHANGE_NOTIFICATION: RTM_EVENT_TYPE = 3

public val RTM_CHANGE_TYPE_ALL: UInt = 1u

public val RTM_CHANGE_TYPE_BEST: UInt = 2u

public val RTM_CHANGE_TYPE_FORWARDING: UInt = 4u

public val RTM_DEST_FLAG_DONT_FORWARD: UInt = 4u

public val RTM_DEST_FLAG_FWD_ENGIN_ADD: UInt = 2u

public val RTM_DEST_FLAG_NATURAL_NET: UInt = 1u

public val RTM_ENTITY_DEREGISTERED: RTM_EVENT_TYPE = 1

public val RTM_ENTITY_REGISTERED: RTM_EVENT_TYPE = 0

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

public val RTM_ROUTE_EXPIRED: RTM_EVENT_TYPE = 2

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

public val SECURITYMSG_ERROR: SECURITY_MESSAGE_MSG_ID = 3u

public val SECURITYMSG_FAILURE: SECURITY_MESSAGE_MSG_ID = 2u

public val SECURITYMSG_SUCCESS: SECURITY_MESSAGE_MSG_ID = 1u

public val VS_Default: UInt = 0u

public val VS_GREOnly: UInt = 9u

public val VS_Ikev2First: UInt = 8u

public val VS_Ikev2Only: UInt = 7u

public val VS_Ikev2Sstp: UInt = 14u

public val VS_L2tpFirst: UInt = 4u

public val VS_L2tpOnly: UInt = 3u

public val VS_L2tpSstp: UInt = 13u

public val VS_PptpFirst: UInt = 2u

public val VS_PptpOnly: UInt = 1u

public val VS_PptpSstp: UInt = 12u

public val VS_ProtocolList: UInt = 15u

public val VS_SstpFirst: UInt = 6u

public val VS_SstpOnly: UInt = 5u

public val WARNING_MSG_ALIAS_NOT_ADDED: UInt = 644u

public val WM_RASDIALEVENT: UInt = 52429u
