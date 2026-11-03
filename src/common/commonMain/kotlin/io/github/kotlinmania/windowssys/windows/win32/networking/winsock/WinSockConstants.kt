package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val AAL5_MODE_MESSAGE: UInt = 1u

public val AAL5_MODE_STREAMING: UInt = 2u

public val AAL5_SSCS_FRAME_RELAY: UInt = 4u

public val AAL5_SSCS_NULL: UInt = 0u

public val AAL5_SSCS_SSCOP_ASSURED: UInt = 1u

public val AAL5_SSCS_SSCOP_NON_ASSURED: UInt = 2u

public val AALTYPE_5: AAL_TYPE = 5

public val AALTYPE_USER: AAL_TYPE = 16

public val ADDRINFOEX_VERSION_2: UInt = 2u

public val ADDRINFOEX_VERSION_3: UInt = 3u

public val ADDRINFOEX_VERSION_4: UInt = 4u

public val ADDRINFOEX_VERSION_5: UInt = 5u

public val ADDRINFOEX_VERSION_6: UInt = 6u

public val ADDR_ANY: UInt = 0u

public val AF_12844: UShort = 25u

public val AF_APPLETALK: UShort = 16u

public val AF_ATM: UShort = 22u

public val AF_BAN: UShort = 21u

public val AF_CCITT: UShort = 10u

public val AF_CHAOS: UShort = 5u

public val AF_CLUSTER: UShort = 24u

public val AF_DATAKIT: UShort = 9u

public val AF_DECnet: UShort = 12u

public val AF_DLI: UShort = 13u

public val AF_ECMA: UShort = 8u

public val AF_FIREFOX: UShort = 19u

public val AF_HYLINK: UShort = 15u

public val AF_HYPERV: UShort = 34u

public val AF_ICLFXBM: UShort = 31u

public val AF_IMPLINK: UShort = 3u

public val AF_INET: ADDRESS_FAMILY = 2u

public val AF_INET6: ADDRESS_FAMILY = 23u

public val AF_IPX: UShort = 6u

public val AF_IRDA: UShort = 26u

public val AF_ISO: UShort = 7u

public val AF_LAT: UShort = 14u

public val AF_LINK: UShort = 33u

public val AF_MAX: UShort = 29u

public val AF_NETBIOS: UShort = 17u

public val AF_NETDES: UShort = 28u

public val AF_NS: UShort = 6u

public val AF_OSI: UShort = 7u

public val AF_PUP: UShort = 4u

public val AF_SNA: UShort = 11u

public val AF_TCNMESSAGE: UShort = 30u

public val AF_TCNPROCESS: UShort = 29u

public val AF_UNIX: UShort = 1u

public val AF_UNKNOWN1: UShort = 20u

public val AF_UNSPEC: ADDRESS_FAMILY = 0u

public val AF_VOICEVIEW: UShort = 18u

public val AI_ADDRCONFIG: UInt = 1024u

public val AI_ALL: UInt = 256u

public val AI_BYPASS_DNS_CACHE: UInt = 64u

public val AI_CANONNAME: UInt = 2u

public val AI_DISABLE_IDN_ENCODING: UInt = 524288u

public val AI_DNS_ONLY: UInt = 16u

public val AI_DNS_RESPONSE_HOSTFILE: UInt = 2u

public val AI_DNS_RESPONSE_SECURE: UInt = 1u

public val AI_DNS_SERVER_TYPE_DOH: UInt = 2u

public val AI_DNS_SERVER_TYPE_UDP: UInt = 1u

public val AI_DNS_SERVER_UDP_FALLBACK: UInt = 1u

public val AI_EXCLUSIVE_CUSTOM_SERVERS: UInt = 2097152u

public val AI_EXTENDED: UInt = 2147483648u

public val AI_FILESERVER: UInt = 262144u

public val AI_FORCE_CLEAR_TEXT: UInt = 32u

public val AI_FQDN: UInt = 131072u

public val AI_NON_AUTHORITATIVE: UInt = 16384u

public val AI_NUMERICHOST: UInt = 4u

public val AI_NUMERICSERV: UInt = 8u

public val AI_PASSIVE: UInt = 1u

public val AI_REQUIRE_SECURE: UInt = 536870912u

public val AI_RESOLUTION_HANDLE: UInt = 1073741824u

public val AI_RETURN_PREFERRED_NAMES: UInt = 65536u

public val AI_RETURN_RESPONSE_FLAGS: UInt = 268435456u

public val AI_RETURN_TTL: UInt = 128u

public val AI_SECURE: UInt = 32768u

public val AI_SECURE_WITH_FALLBACK: UInt = 1048576u

public val AI_V4MAPPED: UInt = 2048u

public val ARP_HW_802: ARP_HARDWARE_TYPE = 6

public val ARP_HW_ENET: ARP_HARDWARE_TYPE = 1

public val ARP_REQUEST: ARP_OPCODE = 1

public val ARP_RESPONSE: ARP_OPCODE = 2

public val ASSOCIATE_NAMERES_CONTEXT: GUID = GUID.from_u128(0x59a38b67d4fe46e1uL, 0xba3c87ea74ca3049uL)

public val ATMPROTO_AAL1: UInt = 1u

public val ATMPROTO_AAL2: UInt = 2u

public val ATMPROTO_AAL34: UInt = 3u

public val ATMPROTO_AAL5: UInt = 5u

public val ATMPROTO_AALUSER: UInt = 0u

public val ATM_ADDR_SIZE: UInt = 20u

public val ATM_AESA: UInt = 2u

public val ATM_E164: UInt = 1u

public val ATM_NSAP: UInt = 2u

public val BASE_PROTOCOL: UInt = 1u

public val BCOB_A: UInt = 1u

public val BCOB_C: UInt = 3u

public val BCOB_X: UInt = 16u

public val BHLI_HighLayerProfile: UInt = 2u

public val BHLI_ISO: UInt = 0u

public val BHLI_UserSpecific: UInt = 1u

public val BHLI_VendorSpecificAppId: UInt = 3u

public val BIGENDIAN: UInt = 0u

public val BITS_PER_BYTE: UInt = 8u

public val BLLI_L2_ELAPB: UInt = 8u

public val BLLI_L2_HDLC_ABM: UInt = 11u

public val BLLI_L2_HDLC_ARM: UInt = 9u

public val BLLI_L2_HDLC_NRM: UInt = 10u

public val BLLI_L2_ISO_1745: UInt = 1u

public val BLLI_L2_ISO_7776: UInt = 17u

public val BLLI_L2_LLC: UInt = 12u

public val BLLI_L2_MODE_EXT: UInt = 128u

public val BLLI_L2_MODE_NORMAL: UInt = 64u

public val BLLI_L2_Q921: UInt = 2u

public val BLLI_L2_Q922: UInt = 14u

public val BLLI_L2_USER_SPECIFIED: UInt = 16u

public val BLLI_L2_X25L: UInt = 6u

public val BLLI_L2_X25M: UInt = 7u

public val BLLI_L2_X75: UInt = 13u

public val BLLI_L3_IPI_IP: UInt = 204u

public val BLLI_L3_IPI_SNAP: UInt = 128u

public val BLLI_L3_ISO_8208: UInt = 7u

public val BLLI_L3_ISO_TR9577: UInt = 11u

public val BLLI_L3_MODE_EXT: UInt = 128u

public val BLLI_L3_MODE_NORMAL: UInt = 64u

public val BLLI_L3_PACKET_1024: UInt = 10u

public val BLLI_L3_PACKET_128: UInt = 7u

public val BLLI_L3_PACKET_16: UInt = 4u

public val BLLI_L3_PACKET_2048: UInt = 11u

public val BLLI_L3_PACKET_256: UInt = 8u

public val BLLI_L3_PACKET_32: UInt = 5u

public val BLLI_L3_PACKET_4096: UInt = 12u

public val BLLI_L3_PACKET_512: UInt = 9u

public val BLLI_L3_PACKET_64: UInt = 6u

public val BLLI_L3_SIO_8473: UInt = 9u

public val BLLI_L3_T70: UInt = 10u

public val BLLI_L3_USER_SPECIFIED: UInt = 16u

public val BLLI_L3_X223: UInt = 8u

public val BLLI_L3_X25: UInt = 6u

public val BYTE_ORDER: UInt = 1234u

public val CAUSE_AAL_PARAMETERS_UNSUPPORTED: UInt = 93u

public val CAUSE_ACCESS_INFORMAION_DISCARDED: UInt = 43u

public val CAUSE_BEARER_CAPABILITY_UNAUTHORIZED: UInt = 57u

public val CAUSE_BEARER_CAPABILITY_UNAVAILABLE: UInt = 58u

public val CAUSE_BEARER_CAPABILITY_UNIMPLEMENTED: UInt = 65u

public val CAUSE_CALL_REJECTED: UInt = 21u

public val CAUSE_CHANNEL_NONEXISTENT: UInt = 82u

public val CAUSE_COND_PERMANENT: UInt = 1u

public val CAUSE_COND_TRANSIENT: UInt = 2u

public val CAUSE_COND_UNKNOWN: UInt = 0u

public val CAUSE_DESTINATION_OUT_OF_ORDER: UInt = 27u

public val CAUSE_INCOMPATIBLE_DESTINATION: UInt = 88u

public val CAUSE_INCORRECT_MESSAGE_LENGTH: UInt = 104u

public val CAUSE_INVALID_CALL_REFERENCE: UInt = 81u

public val CAUSE_INVALID_ENDPOINT_REFERENCE: UInt = 89u

public val CAUSE_INVALID_IE_CONTENTS: UInt = 100u

public val CAUSE_INVALID_NUMBER_FORMAT: UInt = 28u

public val CAUSE_INVALID_STATE_FOR_MESSAGE: UInt = 101u

public val CAUSE_INVALID_TRANSIT_NETWORK_SELECTION: UInt = 91u

public val CAUSE_LOC_BEYOND_INTERWORKING: UInt = 10u

public val CAUSE_LOC_INTERNATIONAL_NETWORK: UInt = 7u

public val CAUSE_LOC_PRIVATE_LOCAL: UInt = 1u

public val CAUSE_LOC_PRIVATE_REMOTE: UInt = 5u

public val CAUSE_LOC_PUBLIC_LOCAL: UInt = 2u

public val CAUSE_LOC_PUBLIC_REMOTE: UInt = 4u

public val CAUSE_LOC_TRANSIT_NETWORK: UInt = 3u

public val CAUSE_LOC_USER: UInt = 0u

public val CAUSE_MANDATORY_IE_MISSING: UInt = 96u

public val CAUSE_NA_ABNORMAL: UInt = 4u

public val CAUSE_NA_NORMAL: UInt = 0u

public val CAUSE_NETWORK_OUT_OF_ORDER: UInt = 38u

public val CAUSE_NORMAL_CALL_CLEARING: UInt = 16u

public val CAUSE_NORMAL_UNSPECIFIED: UInt = 31u

public val CAUSE_NO_ROUTE_TO_DESTINATION: UInt = 3u

public val CAUSE_NO_ROUTE_TO_TRANSIT_NETWORK: UInt = 2u

public val CAUSE_NO_USER_RESPONDING: UInt = 18u

public val CAUSE_NO_VPI_VCI_AVAILABLE: UInt = 45u

public val CAUSE_NUMBER_CHANGED: UInt = 22u

public val CAUSE_OPTION_UNAVAILABLE: UInt = 63u

public val CAUSE_PROTOCOL_ERROR: UInt = 111u

public val CAUSE_PU_PROVIDER: UInt = 0u

public val CAUSE_PU_USER: UInt = 8u

public val CAUSE_QOS_UNAVAILABLE: UInt = 49u

public val CAUSE_REASON_IE_INSUFFICIENT: UInt = 8u

public val CAUSE_REASON_IE_MISSING: UInt = 4u

public val CAUSE_REASON_USER: UInt = 0u

public val CAUSE_RECOVERY_ON_TIMEOUT: UInt = 102u

public val CAUSE_RESOURCE_UNAVAILABLE: UInt = 47u

public val CAUSE_STATUS_ENQUIRY_RESPONSE: UInt = 30u

public val CAUSE_TEMPORARY_FAILURE: UInt = 41u

public val CAUSE_TOO_MANY_PENDING_ADD_PARTY: UInt = 92u

public val CAUSE_UNALLOCATED_NUMBER: UInt = 1u

public val CAUSE_UNIMPLEMENTED_IE: UInt = 99u

public val CAUSE_UNIMPLEMENTED_MESSAGE_TYPE: UInt = 97u

public val CAUSE_UNSUPPORTED_TRAFFIC_PARAMETERS: UInt = 73u

public val CAUSE_USER_BUSY: UInt = 17u

public val CAUSE_USER_CELL_RATE_UNAVAILABLE: UInt = 51u

public val CAUSE_USER_REJECTS_CLIR: UInt = 23u

public val CAUSE_VPI_VCI_UNACCEPTABLE: UInt = 10u

public val CAUSE_VPI_VCI_UNAVAILABLE: UInt = 35u

public val CF_ACCEPT: UInt = 0u

public val CF_DEFER: UInt = 2u

public val CF_REJECT: UInt = 1u

public val CLIP_NOT: UInt = 0u

public val CLIP_SUS: UInt = 32u

public val COMP_EQUAL: WSAECOMPARATOR = 0

public val COMP_NOTLESS: WSAECOMPARATOR = 1

public val CONTROL_CHANNEL_TRIGGER_STATUS_HARDWARE_SLOT_ALLOCATED: CONTROL_CHANNEL_TRIGGER_STATUS = 2

public val CONTROL_CHANNEL_TRIGGER_STATUS_INVALID: CONTROL_CHANNEL_TRIGGER_STATUS = 0

public val CONTROL_CHANNEL_TRIGGER_STATUS_POLICY_ERROR: CONTROL_CHANNEL_TRIGGER_STATUS = 3

public val CONTROL_CHANNEL_TRIGGER_STATUS_SERVICE_UNAVAILABLE: CONTROL_CHANNEL_TRIGGER_STATUS = 6

public val CONTROL_CHANNEL_TRIGGER_STATUS_SOFTWARE_SLOT_ALLOCATED: CONTROL_CHANNEL_TRIGGER_STATUS = 1

public val CONTROL_CHANNEL_TRIGGER_STATUS_SYSTEM_ERROR: CONTROL_CHANNEL_TRIGGER_STATUS = 4

public val CONTROL_CHANNEL_TRIGGER_STATUS_TRANSPORT_DISCONNECTED: CONTROL_CHANNEL_TRIGGER_STATUS = 5

public val DE_REUSE_SOCKET: UInt = 2u

public val DL_ADDRESS_LENGTH_MAXIMUM: UInt = 32u

public val DL_HEADER_LENGTH_MAXIMUM: UInt = 64u

public val ETHERNET_TYPE_802_1AD: UInt = 34984u

public val ETHERNET_TYPE_802_1Q: UInt = 33024u

public val ETHERNET_TYPE_ARP: UInt = 2054u

public val ETHERNET_TYPE_IPV4: UInt = 2048u

public val ETHERNET_TYPE_IPV6: UInt = 34525u

public val ETHERNET_TYPE_MINIMUM: UInt = 1536u

public val ETH_LENGTH_OF_HEADER: UInt = 14u

public val ETH_LENGTH_OF_SNAP_HEADER: UInt = 8u

public val ETH_LENGTH_OF_VLAN_HEADER: UInt = 4u

public val EXT_LEN_UNIT: UInt = 8u

public val E_WINDOW_ADVANCE_BY_TIME: eWINDOW_ADVANCE_METHOD = 1

public val E_WINDOW_USE_AS_DATA_CACHE: eWINDOW_ADVANCE_METHOD = 2

public val FD_ACCEPT: UInt = 8u

public val FD_ACCEPT_BIT: UInt = 3u

public val FD_ADDRESS_LIST_CHANGE_BIT: UInt = 9u

public val FD_CLOSE: UInt = 32u

public val FD_CLOSE_BIT: UInt = 5u

public val FD_CONNECT: UInt = 16u

public val FD_CONNECT_BIT: UInt = 4u

public val FD_GROUP_QOS_BIT: UInt = 7u

public val FD_MAX_EVENTS: UInt = 10u

public val FD_OOB: UInt = 4u

public val FD_OOB_BIT: UInt = 2u

public val FD_QOS_BIT: UInt = 6u

public val FD_READ: UInt = 1u

public val FD_READ_BIT: UInt = 0u

public val FD_ROUTING_INTERFACE_CHANGE_BIT: UInt = 8u

public val FD_SETSIZE: UInt = 64u

public val FD_WRITE: UInt = 2u

public val FD_WRITE_BIT: UInt = 1u

public val FIOASYNC: Int = -2147195267

public val FIONBIO: Int = -2147195266

public val FIONREAD: Int = 1074030207

public val FROM_PROTOCOL_INFO: Int = -1

public val FallbackIndexMax: FALLBACK_INDEX = 1

public val FallbackIndexTcpFastopen: FALLBACK_INDEX = 0

public val GAI_STRERROR_BUFFER_SIZE: UInt = 1024u

public val IAS_ATTRIB_INT: UInt = 1u

public val IAS_ATTRIB_NO_ATTRIB: UInt = 0u

public val IAS_ATTRIB_NO_CLASS: UInt = 16u

public val IAS_ATTRIB_OCTETSEQ: UInt = 2u

public val IAS_ATTRIB_STR: UInt = 3u

public val IAS_MAX_ATTRIBNAME: UInt = 256u

public val IAS_MAX_CLASSNAME: UInt = 64u

public val IAS_MAX_OCTET_STRING: UInt = 1024u

public val IAS_MAX_USER_STRING: UInt = 256u

public val ICMP4_TIME_EXCEED_REASSEMBLY: ICMP4_TIME_EXCEED_CODE = 1

public val ICMP4_TIME_EXCEED_TRANSIT: ICMP4_TIME_EXCEED_CODE = 0

public val ICMP4_UNREACH_ADMIN: ICMP4_UNREACH_CODE = 13

public val ICMP4_UNREACH_FRAG_NEEDED: ICMP4_UNREACH_CODE = 4

public val ICMP4_UNREACH_HOST: ICMP4_UNREACH_CODE = 1

public val ICMP4_UNREACH_HOST_ADMIN: ICMP4_UNREACH_CODE = 10

public val ICMP4_UNREACH_HOST_TOS: ICMP4_UNREACH_CODE = 12

public val ICMP4_UNREACH_HOST_UNKNOWN: ICMP4_UNREACH_CODE = 7

public val ICMP4_UNREACH_ISOLATED: ICMP4_UNREACH_CODE = 8

public val ICMP4_UNREACH_NET: ICMP4_UNREACH_CODE = 0

public val ICMP4_UNREACH_NET_ADMIN: ICMP4_UNREACH_CODE = 9

public val ICMP4_UNREACH_NET_TOS: ICMP4_UNREACH_CODE = 11

public val ICMP4_UNREACH_NET_UNKNOWN: ICMP4_UNREACH_CODE = 6

public val ICMP4_UNREACH_PORT: ICMP4_UNREACH_CODE = 3

public val ICMP4_UNREACH_PROTOCOL: ICMP4_UNREACH_CODE = 2

public val ICMP4_UNREACH_SOURCEROUTE_FAILED: ICMP4_UNREACH_CODE = 5

public val ICMP6_DST_UNREACH_ADDR: UInt = 3u

public val ICMP6_DST_UNREACH_ADMIN: UInt = 1u

public val ICMP6_DST_UNREACH_BEYONDSCOPE: UInt = 2u

public val ICMP6_DST_UNREACH_NOPORT: UInt = 4u

public val ICMP6_DST_UNREACH_NOROUTE: UInt = 0u

public val ICMP6_PARAMPROB_FIRSTFRAGMENT: UInt = 3u

public val ICMP6_PARAMPROB_HEADER: UInt = 0u

public val ICMP6_PARAMPROB_NEXTHEADER: UInt = 1u

public val ICMP6_PARAMPROB_OPTION: UInt = 2u

public val ICMP6_TIME_EXCEED_REASSEMBLY: UInt = 1u

public val ICMP6_TIME_EXCEED_TRANSIT: UInt = 0u

public val ICMPV4_INVALID_PREFERENCE_LEVEL: UInt = 2147483648u

public val ICMPV6_ECHO_REQUEST_FLAG_REVERSE: UInt = 1u

public val IE_AALParameters: Q2931_IE_TYPE = 0

public val IE_BHLI: Q2931_IE_TYPE = 3

public val IE_BLLI: Q2931_IE_TYPE = 4

public val IE_BroadbandBearerCapability: Q2931_IE_TYPE = 2

public val IE_CalledPartyNumber: Q2931_IE_TYPE = 5

public val IE_CalledPartySubaddress: Q2931_IE_TYPE = 6

public val IE_CallingPartyNumber: Q2931_IE_TYPE = 7

public val IE_CallingPartySubaddress: Q2931_IE_TYPE = 8

public val IE_Cause: Q2931_IE_TYPE = 9

public val IE_QOSClass: Q2931_IE_TYPE = 10

public val IE_TrafficDescriptor: Q2931_IE_TYPE = 1

public val IE_TransitNetworkSelection: Q2931_IE_TYPE = 11

public val IFF_BROADCAST: UInt = 2u

public val IFF_LOOPBACK: UInt = 4u

public val IFF_MULTICAST: UInt = 16u

public val IFF_POINTTOPOINT: UInt = 8u

public val IFF_UP: UInt = 1u

public val IGMP_LEAVE_GROUP_TYPE: UInt = 23u

public val IGMP_MAX_RESP_CODE_TYPE_FLOAT: IGMP_MAX_RESP_CODE_TYPE = 1

public val IGMP_MAX_RESP_CODE_TYPE_NORMAL: IGMP_MAX_RESP_CODE_TYPE = 0

public val IGMP_QUERY_TYPE: UInt = 17u

public val IGMP_VERSION1_REPORT_TYPE: UInt = 18u

public val IGMP_VERSION2_REPORT_TYPE: UInt = 22u

public val IGMP_VERSION3_REPORT_TYPE: UInt = 34u

public val IMPLINK_HIGHEXPER: UInt = 158u

public val IMPLINK_IP: UInt = 155u

public val IMPLINK_LOWEXPER: UInt = 156u

public val IN4ADDR_ANY: UInt = 0u

public val IN4ADDR_BROADCAST: UInt = 4294967295u

public val IN4ADDR_LINKLOCALPREFIX_LENGTH: UInt = 16u

public val IN4ADDR_LOOPBACK: UInt = 16777343u

public val IN4ADDR_LOOPBACKPREFIX_LENGTH: UInt = 8u

public val IN4ADDR_MULTICASTPREFIX_LENGTH: UInt = 4u

public val IN6ADDR_6TO4PREFIX_LENGTH: UInt = 16u

public val IN6ADDR_LINKLOCALPREFIX_LENGTH: UInt = 64u

public val IN6ADDR_MULTICASTPREFIX_LENGTH: UInt = 8u

public val IN6ADDR_SOLICITEDNODEMULTICASTPREFIX_LENGTH: UInt = 104u

public val IN6ADDR_TEREDOPREFIX_LENGTH: UInt = 32u

public val IN6ADDR_V4MAPPEDPREFIX_LENGTH: UInt = 96u

public val IN6_EMBEDDEDV4_BITS_IN_BYTE: UInt = 8u

public val IN6_EMBEDDEDV4_UOCTET_POSITION: UInt = 8u

public val INADDR_ANY: UInt = 0u

public val INADDR_BROADCAST: UInt = 4294967295u

public val INADDR_LOOPBACK: UInt = 2130706433u

public val INADDR_NONE: UInt = 4294967295u

public val INCL_WINSOCK_API_PROTOTYPES: UInt = 1u

public val INCL_WINSOCK_API_TYPEDEFS: UInt = 0u

public val INET6_ADDRSTRLEN: UInt = 65u

public val INET_ADDRSTRLEN: UInt = 22u

public val INVALID_SOCKET: SOCKET = (-1).toULong()

public val IN_CLASSA_HOST: UInt = 16777215u

public val IN_CLASSA_MAX: UInt = 128u

public val IN_CLASSA_NET: UInt = 4278190080u

public val IN_CLASSA_NSHIFT: UInt = 24u

public val IN_CLASSB_HOST: UInt = 65535u

public val IN_CLASSB_MAX: UInt = 65536u

public val IN_CLASSB_NET: UInt = 4294901760u

public val IN_CLASSB_NSHIFT: UInt = 16u

public val IN_CLASSC_HOST: UInt = 255u

public val IN_CLASSC_NET: UInt = 4294967040u

public val IN_CLASSC_NSHIFT: UInt = 8u

public val IN_CLASSD_HOST: UInt = 268435455u

public val IN_CLASSD_NET: UInt = 4026531840u

public val IN_CLASSD_NSHIFT: UInt = 28u

public val IOCPARM_MASK: UInt = 127u

public val IOC_IN: UInt = 2147483648u

public val IOC_INOUT: UInt = 3221225472u

public val IOC_OUT: UInt = 1073741824u

public val IOC_PROTOCOL: UInt = 268435456u

public val IOC_UNIX: UInt = 0u

public val IOC_VENDOR: UInt = 402653184u

public val IOC_VOID: UInt = 536870912u

public val IOC_WS2: UInt = 134217728u

public val IP4_OFF_MASK: UInt = 65311u

public val IP6F_MORE_FRAG: UInt = 256u

public val IP6F_OFF_MASK: UInt = 63743u

public val IP6F_RESERVED_MASK: UInt = 1536u

public val IP6OPT_JUMBO: IPV6_OPTION_TYPE = 194

public val IP6OPT_MUTABLE: UInt = 32u

public val IP6OPT_NSAP_ADDR: IPV6_OPTION_TYPE = 195

public val IP6OPT_PAD1: IPV6_OPTION_TYPE = 0

public val IP6OPT_PADN: IPV6_OPTION_TYPE = 1

public val IP6OPT_ROUTER_ALERT: IPV6_OPTION_TYPE = 5

public val IP6OPT_TUNNEL_LIMIT: IPV6_OPTION_TYPE = 4

public val IP6OPT_TYPE_DISCARD: UInt = 64u

public val IP6OPT_TYPE_FORCEICMP: UInt = 128u

public val IP6OPT_TYPE_ICMP: UInt = 192u

public val IP6OPT_TYPE_SKIP: UInt = 0u

public val IP6T_SO_ORIGINAL_DST: UInt = 12303u

public val IPPORT_BIFFUDP: UInt = 512u

public val IPPORT_CHARGEN: UInt = 19u

public val IPPORT_CMDSERVER: UInt = 514u

public val IPPORT_DAYTIME: UInt = 13u

public val IPPORT_DISCARD: UInt = 9u

public val IPPORT_DYNAMIC_MAX: UInt = 65535u

public val IPPORT_DYNAMIC_MIN: UInt = 49152u

public val IPPORT_ECHO: UInt = 7u

public val IPPORT_EFSSERVER: UInt = 520u

public val IPPORT_EPMAP: UInt = 135u

public val IPPORT_EXECSERVER: UInt = 512u

public val IPPORT_FINGER: UInt = 79u

public val IPPORT_FTP: UInt = 21u

public val IPPORT_FTP_DATA: UInt = 20u

public val IPPORT_HTTPS: UInt = 443u

public val IPPORT_IMAP: UInt = 143u

public val IPPORT_IMAP3: UInt = 220u

public val IPPORT_LDAP: UInt = 389u

public val IPPORT_LOGINSERVER: UInt = 513u

public val IPPORT_MICROSOFT_DS: UInt = 445u

public val IPPORT_MSP: UInt = 18u

public val IPPORT_MTP: UInt = 57u

public val IPPORT_NAMESERVER: UInt = 42u

public val IPPORT_NETBIOS_DGM: UInt = 138u

public val IPPORT_NETBIOS_NS: UInt = 137u

public val IPPORT_NETBIOS_SSN: UInt = 139u

public val IPPORT_NETSTAT: UInt = 15u

public val IPPORT_NTP: UInt = 123u

public val IPPORT_POP3: UInt = 110u

public val IPPORT_QOTD: UInt = 17u

public val IPPORT_REGISTERED_MAX: UInt = 49151u

public val IPPORT_REGISTERED_MIN: UInt = 1024u

public val IPPORT_RESERVED: UInt = 1024u

public val IPPORT_RJE: UInt = 77u

public val IPPORT_ROUTESERVER: UInt = 520u

public val IPPORT_SMTP: UInt = 25u

public val IPPORT_SNMP: UInt = 161u

public val IPPORT_SNMP_TRAP: UInt = 162u

public val IPPORT_SUPDUP: UInt = 95u

public val IPPORT_SYSTAT: UInt = 11u

public val IPPORT_TCPMUX: UInt = 1u

public val IPPORT_TELNET: UInt = 23u

public val IPPORT_TFTP: UInt = 69u

public val IPPORT_TIMESERVER: UInt = 37u

public val IPPORT_TTYLINK: UInt = 87u

public val IPPORT_WHOIS: UInt = 43u

public val IPPORT_WHOSERVER: UInt = 513u

public val IPPROTO_AH: IPPROTO = 51

public val IPPROTO_CBT: IPPROTO = 7

public val IPPROTO_DSTOPTS: IPPROTO = 60

public val IPPROTO_EGP: IPPROTO = 8

public val IPPROTO_ESP: IPPROTO = 50

public val IPPROTO_FRAGMENT: IPPROTO = 44

public val IPPROTO_GGP: IPPROTO = 3

public val IPPROTO_HOPOPTS: IPPROTO = 0

public val IPPROTO_ICLFXBM: IPPROTO = 78

public val IPPROTO_ICMP: IPPROTO = 1

public val IPPROTO_ICMPV6: IPPROTO = 58

public val IPPROTO_IDP: IPPROTO = 22

public val IPPROTO_IGMP: IPPROTO = 2

public val IPPROTO_IGP: IPPROTO = 9

public val IPPROTO_IP: IPPROTO = 0

public val IPPROTO_IPV4: IPPROTO = 4

public val IPPROTO_IPV6: IPPROTO = 41

public val IPPROTO_L2TP: IPPROTO = 115

public val IPPROTO_MAX: IPPROTO = 256

public val IPPROTO_ND: IPPROTO = 77

public val IPPROTO_NONE: IPPROTO = 59

public val IPPROTO_PGM: IPPROTO = 113

public val IPPROTO_PIM: IPPROTO = 103

public val IPPROTO_PUP: IPPROTO = 12

public val IPPROTO_RAW: IPPROTO = 255

public val IPPROTO_RDP: IPPROTO = 27

public val IPPROTO_RESERVED_IPSEC: IPPROTO = 258

public val IPPROTO_RESERVED_IPSECOFFLOAD: IPPROTO = 259

public val IPPROTO_RESERVED_MAX: IPPROTO = 261

public val IPPROTO_RESERVED_RAW: IPPROTO = 257

public val IPPROTO_RESERVED_WNV: IPPROTO = 260

public val IPPROTO_RM: IPPROTO = 113

public val IPPROTO_ROUTING: IPPROTO = 43

public val IPPROTO_SCTP: IPPROTO = 132

public val IPPROTO_ST: IPPROTO = 5

public val IPPROTO_TCP: IPPROTO = 6

public val IPPROTO_UDP: IPPROTO = 17

public val IPV4_MAX_MINIMUM_MTU: UInt = 576u

public val IPV4_MINIMUM_MTU: UInt = 576u

public val IPV4_MIN_MINIMUM_MTU: UInt = 352u

public val IPV4_VERSION: UInt = 4u

public val IPV6_ADD_IFLIST: Int = 29

public val IPV6_ADD_MEMBERSHIP: Int = 12

public val IPV6_CHECKSUM: Int = 26

public val IPV6_DEL_IFLIST: Int = 30

public val IPV6_DONTFRAG: Int = 14

public val IPV6_DROP_MEMBERSHIP: Int = 13

public val IPV6_ECN: Int = 50

public val IPV6_ECN_MASK: UInt = 12288u

public val IPV6_ECN_SHIFT: UInt = 12u

public val IPV6_FLOW_LABEL_MASK: UInt = 4294905600u

public val IPV6_FULL_TRAFFIC_CLASS_MASK: UInt = 61455u

public val IPV6_GET_IFLIST: Int = 33

public val IPV6_HDRINCL: Int = 2

public val IPV6_HOPLIMIT: Int = 21

public val IPV6_HOPOPTS: Int = 1

public val IPV6_IFLIST: Int = 28

public val IPV6_JOIN_GROUP: Int = 12

public val IPV6_LEAVE_GROUP: Int = 13

public val IPV6_MINIMUM_MTU: UInt = 1280u

public val IPV6_MTU: Int = 72

public val IPV6_MTU_DISCOVER: Int = 71

public val IPV6_MULTICAST_HOPS: Int = 10

public val IPV6_MULTICAST_IF: Int = 9

public val IPV6_MULTICAST_LOOP: Int = 11

public val IPV6_NRT_INTERFACE: Int = 74

public val IPV6_PKTINFO: Int = 19

public val IPV6_PKTINFO_EX: Int = 51

public val IPV6_PROTECTION_LEVEL: Int = 23

public val IPV6_RECVDSTADDR: Int = 25

public val IPV6_RECVECN: Int = 50

public val IPV6_RECVERR: Int = 75

public val IPV6_RECVIF: Int = 24

public val IPV6_RECVRTHDR: Int = 38

public val IPV6_RECVTCLASS: Int = 40

public val IPV6_RTHDR: Int = 32

public val IPV6_TCLASS: Int = 39

public val IPV6_TRAFFIC_CLASS_MASK: UInt = 49167u

public val IPV6_UNICAST_HOPS: Int = 4

public val IPV6_UNICAST_IF: Int = 31

public val IPV6_USER_MTU: Int = 76

public val IPV6_V6ONLY: Int = 27

public val IPV6_VERSION: UInt = 96u

public val IPV6_WFP_REDIRECT_CONTEXT: Int = 70

public val IPV6_WFP_REDIRECT_RECORDS: Int = 60

public val IPX_ADDRESS: Int = 16391

public val IPX_ADDRESS_NOTIFY: Int = 16396

public val IPX_DSTYPE: Int = 16386

public val IPX_EXTENDED_ADDRESS: Int = 16388

public val IPX_FILTERPTYPE: Int = 16385

public val IPX_GETNETINFO: Int = 16392

public val IPX_GETNETINFO_NORIP: Int = 16393

public val IPX_IMMEDIATESPXACK: Int = 16400

public val IPX_MAXSIZE: Int = 16390

public val IPX_MAX_ADAPTER_NUM: Int = 16397

public val IPX_PTYPE: Int = 16384

public val IPX_RECEIVE_BROADCAST: Int = 16399

public val IPX_RECVHDR: Int = 16389

public val IPX_RERIPNETNUMBER: Int = 16398

public val IPX_SPXGETCONNECTIONSTATUS: Int = 16395

public val IPX_STOPFILTERPTYPE: Int = 16387

public val IP_ADD_IFLIST: Int = 29

public val IP_ADD_MEMBERSHIP: Int = 12

public val IP_ADD_SOURCE_MEMBERSHIP: Int = 15

public val IP_BLOCK_SOURCE: Int = 17

public val IP_DEFAULT_MULTICAST_LOOP: UInt = 1u

public val IP_DEFAULT_MULTICAST_TTL: UInt = 1u

public val IP_DEL_IFLIST: Int = 30

public val IP_DONTFRAGMENT: Int = 14

public val IP_DROP_MEMBERSHIP: Int = 13

public val IP_DROP_SOURCE_MEMBERSHIP: Int = 16

public val IP_ECN: Int = 50

public val IP_GET_IFLIST: Int = 33

public val IP_HDRINCL: Int = 2

public val IP_HOPLIMIT: Int = 21

public val IP_IFLIST: Int = 28

public val IP_MAX_MEMBERSHIPS: UInt = 20u

public val IP_MTU: Int = 73

public val IP_MTU_DISCOVER: Int = 71

public val IP_MULTICAST_IF: Int = 9

public val IP_MULTICAST_LOOP: Int = 11

public val IP_MULTICAST_TTL: Int = 10

public val IP_NRT_INTERFACE: Int = 74

public val IP_OPTIONS: Int = 1

public val IP_OPTION_TIMESTAMP_ADDRESS: IP_OPTION_TIMESTAMP_FLAGS = 1

public val IP_OPTION_TIMESTAMP_ONLY: IP_OPTION_TIMESTAMP_FLAGS = 0

public val IP_OPTION_TIMESTAMP_SPECIFIC_ADDRESS: IP_OPTION_TIMESTAMP_FLAGS = 3

public val IP_OPT_EOL: IPV4_OPTION_TYPE = 0

public val IP_OPT_LSRR: IPV4_OPTION_TYPE = 131

public val IP_OPT_MULTIDEST: IPV4_OPTION_TYPE = 149

public val IP_OPT_NOP: IPV4_OPTION_TYPE = 1

public val IP_OPT_ROUTER_ALERT: IPV4_OPTION_TYPE = 148

public val IP_OPT_RR: IPV4_OPTION_TYPE = 7

public val IP_OPT_SECURITY: IPV4_OPTION_TYPE = 130

public val IP_OPT_SID: IPV4_OPTION_TYPE = 136

public val IP_OPT_SSRR: IPV4_OPTION_TYPE = 137

public val IP_OPT_TS: IPV4_OPTION_TYPE = 68

public val IP_ORIGINAL_ARRIVAL_IF: Int = 47

public val IP_PKTINFO: Int = 19

public val IP_PKTINFO_EX: Int = 51

public val IP_PMTUDISC_DO: PMTUD_STATE = 1

public val IP_PMTUDISC_DONT: PMTUD_STATE = 2

public val IP_PMTUDISC_MAX: PMTUD_STATE = 4

public val IP_PMTUDISC_NOT_SET: PMTUD_STATE = 0

public val IP_PMTUDISC_PROBE: PMTUD_STATE = 3

public val IP_PROTECTION_LEVEL: Int = 23

public val IP_RECEIVE_BROADCAST: Int = 22

public val IP_RECVDSTADDR: Int = 25

public val IP_RECVECN: Int = 50

public val IP_RECVERR: Int = 75

public val IP_RECVIF: Int = 24

public val IP_RECVRTHDR: Int = 38

public val IP_RECVTCLASS: Int = 40

public val IP_RECVTOS: Int = 40

public val IP_RECVTTL: Int = 21

public val IP_RTHDR: Int = 32

public val IP_TCLASS: Int = 39

public val IP_TOS: Int = 3

public val IP_TTL: Int = 4

public val IP_UNBLOCK_SOURCE: Int = 18

public val IP_UNICAST_IF: Int = 31

public val IP_UNSPECIFIED_HOP_LIMIT: Int = -1

public val IP_UNSPECIFIED_TYPE_OF_SERVICE: Int = -1

public val IP_UNSPECIFIED_USER_MTU: UInt = 4294967295u

public val IP_USER_MTU: Int = 76

public val IP_VER_MASK: UInt = 240u

public val IP_WFP_REDIRECT_CONTEXT: Int = 70

public val IP_WFP_REDIRECT_RECORDS: Int = 60

public val IRDA_PROTO_SOCK_STREAM: UInt = 1u

public val IRLMP_9WIRE_MODE: Int = 22

public val IRLMP_DISCOVERY_MODE: Int = 25

public val IRLMP_ENUMDEVICES: Int = 16

public val IRLMP_EXCLUSIVE_MODE: Int = 20

public val IRLMP_IAS_QUERY: Int = 18

public val IRLMP_IAS_SET: Int = 17

public val IRLMP_IRLPT_MODE: Int = 21

public val IRLMP_PARAMETERS: Int = 24

public val IRLMP_SEND_PDU_LEN: Int = 19

public val IRLMP_SHARP_MODE: Int = 32

public val IRLMP_TINYTP_MODE: Int = 23

public val ISOPROTO_CLNP: UInt = 31u

public val ISOPROTO_CLTP: UInt = 30u

public val ISOPROTO_ESIS: UInt = 34u

public val ISOPROTO_INACT_NL: UInt = 33u

public val ISOPROTO_INTRAISIS: UInt = 35u

public val ISOPROTO_TP: UInt = 29u

public val ISOPROTO_TP0: UInt = 25u

public val ISOPROTO_TP1: UInt = 26u

public val ISOPROTO_TP2: UInt = 27u

public val ISOPROTO_TP3: UInt = 28u

public val ISOPROTO_TP4: UInt = 29u

public val ISOPROTO_X25: UInt = 32u

public val ISO_EXP_DATA_NUSE: UInt = 1u

public val ISO_EXP_DATA_USE: UInt = 0u

public val ISO_HIERARCHICAL: UInt = 0u

public val ISO_MAX_ADDR_LENGTH: UInt = 64u

public val ISO_NON_HIERARCHICAL: UInt = 1u

public val IpDadStateDeprecated: NL_DAD_STATE = 3

public val IpDadStateDuplicate: NL_DAD_STATE = 2

public val IpDadStateInvalid: NL_DAD_STATE = 0

public val IpDadStatePreferred: NL_DAD_STATE = 4

public val IpDadStateTentative: NL_DAD_STATE = 1

public val IpPrefixOriginDhcp: NL_PREFIX_ORIGIN = 3

public val IpPrefixOriginManual: NL_PREFIX_ORIGIN = 1

public val IpPrefixOriginOther: NL_PREFIX_ORIGIN = 0

public val IpPrefixOriginRouterAdvertisement: NL_PREFIX_ORIGIN = 4

public val IpPrefixOriginUnchanged: NL_PREFIX_ORIGIN = 16

public val IpPrefixOriginWellKnown: NL_PREFIX_ORIGIN = 2

public val IpSuffixOriginDhcp: NL_SUFFIX_ORIGIN = 3

public val IpSuffixOriginLinkLayerAddress: NL_SUFFIX_ORIGIN = 4

public val IpSuffixOriginManual: NL_SUFFIX_ORIGIN = 1

public val IpSuffixOriginOther: NL_SUFFIX_ORIGIN = 0

public val IpSuffixOriginRandom: NL_SUFFIX_ORIGIN = 5

public val IpSuffixOriginUnchanged: NL_SUFFIX_ORIGIN = 16

public val IpSuffixOriginWellKnown: NL_SUFFIX_ORIGIN = 2

public val JL_BOTH: UInt = 4u

public val JL_RECEIVER_ONLY: UInt = 2u

public val JL_SENDER_ONLY: UInt = 1u

public val LAYERED_PROTOCOL: UInt = 0u

public val LITTLEENDIAN: UInt = 1u

public val LM_BAUD_115200: UInt = 115200u

public val LM_BAUD_1152K: UInt = 1152000u

public val LM_BAUD_1200: UInt = 1200u

public val LM_BAUD_16M: UInt = 16000000u

public val LM_BAUD_19200: UInt = 19200u

public val LM_BAUD_2400: UInt = 2400u

public val LM_BAUD_38400: UInt = 38400u

public val LM_BAUD_4M: UInt = 4000000u

public val LM_BAUD_57600: UInt = 57600u

public val LM_BAUD_576K: UInt = 576000u

public val LM_BAUD_9600: UInt = 9600u

public val LM_HB1_Computer: Int = 4

public val LM_HB1_Fax: Int = 32

public val LM_HB1_LANAccess: Int = 64

public val LM_HB1_Modem: Int = 16

public val LM_HB1_PDA_Palmtop: Int = 2

public val LM_HB1_PnP: Int = 1

public val LM_HB1_Printer: Int = 8

public val LM_HB2_FileServer: Int = 2

public val LM_HB2_Telephony: Int = 1

public val LM_HB_Extension: Int = 128

public val LOG2_BITS_PER_BYTE: UInt = 3u

public val LSP_CRYPTO_COMPRESS: UInt = 64u

public val LSP_FIREWALL: UInt = 8u

public val LSP_INBOUND_MODIFY: UInt = 16u

public val LSP_INSPECTOR: UInt = 1u

public val LSP_LOCAL_CACHE: UInt = 128u

public val LSP_OUTBOUND_MODIFY: UInt = 32u

public val LSP_PROXY: UInt = 4u

public val LSP_REDIRECTOR: UInt = 2u

public val LSP_SYSTEM: UInt = 2147483648u

public val LUP_ADDRCONFIG: UInt = 1048576u

public val LUP_API_ANSI: UInt = 16777216u

public val LUP_CONTAINERS: UInt = 2u

public val LUP_DEEP: UInt = 1u

public val LUP_DISABLE_IDN_ENCODING: UInt = 8388608u

public val LUP_DNS_ONLY: UInt = 131072u

public val LUP_DUAL_ADDR: UInt = 2097152u

public val LUP_EXCLUSIVE_CUSTOM_SERVERS: UInt = 134217728u

public val LUP_EXTENDED_QUERYSET: UInt = 33554432u

public val LUP_FILESERVER: UInt = 4194304u

public val LUP_FLUSHCACHE: UInt = 4096u

public val LUP_FLUSHPREVIOUS: UInt = 8192u

public val LUP_FORCE_CLEAR_TEXT: UInt = 1073741824u

public val LUP_NEAREST: UInt = 8u

public val LUP_NOCONTAINERS: UInt = 4u

public val LUP_NON_AUTHORITATIVE: UInt = 16384u

public val LUP_REQUIRE_SECURE: UInt = 268435456u

public val LUP_RESOLUTION_HANDLE: UInt = 2147483648u

public val LUP_RES_SERVICE: UInt = 32768u

public val LUP_RETURN_ADDR: UInt = 256u

public val LUP_RETURN_ALIASES: UInt = 1024u

public val LUP_RETURN_ALL: UInt = 4080u

public val LUP_RETURN_BLOB: UInt = 512u

public val LUP_RETURN_COMMENT: UInt = 128u

public val LUP_RETURN_NAME: UInt = 16u

public val LUP_RETURN_PREFERRED_NAMES: UInt = 65536u

public val LUP_RETURN_QUERY_STRING: UInt = 2048u

public val LUP_RETURN_RESPONSE_FLAGS: UInt = 262144u

public val LUP_RETURN_TTL: UInt = 536870912u

public val LUP_RETURN_TYPE: UInt = 32u

public val LUP_RETURN_VERSION: UInt = 64u

public val LUP_SECURE: UInt = 32768u

public val LUP_SECURE_WITH_FALLBACK: UInt = 67108864u

public val LinkLocalAlwaysOff: NL_LINK_LOCAL_ADDRESS_BEHAVIOR = 0

public val LinkLocalAlwaysOn: NL_LINK_LOCAL_ADDRESS_BEHAVIOR = 2

public val LinkLocalDelayed: NL_LINK_LOCAL_ADDRESS_BEHAVIOR = 1

public val LinkLocalUnchanged: NL_LINK_LOCAL_ADDRESS_BEHAVIOR = -1

public val LmCharSetASCII: UInt = 0u

public val LmCharSetISO_8859_1: UInt = 1u

public val LmCharSetISO_8859_2: UInt = 2u

public val LmCharSetISO_8859_3: UInt = 3u

public val LmCharSetISO_8859_4: UInt = 4u

public val LmCharSetISO_8859_5: UInt = 5u

public val LmCharSetISO_8859_6: UInt = 6u

public val LmCharSetISO_8859_7: UInt = 7u

public val LmCharSetISO_8859_8: UInt = 8u

public val LmCharSetISO_8859_9: UInt = 9u

public val LmCharSetUNICODE: UInt = 255u

public val MAXGETHOSTSTRUCT: UInt = 1024u

public val MAX_IPV4_HLEN: UInt = 60u

public val MAX_IPV4_PACKET: UInt = 65535u

public val MAX_IPV6_PAYLOAD: UInt = 65535u

public val MAX_MCAST_TTL: UInt = 255u

public val MAX_PROTOCOL_CHAIN: UInt = 7u

public val MAX_WINDOW_INCREMENT_PERCENTAGE: UInt = 25u

public val MCAST_BLOCK_SOURCE: UInt = 43u

public val MCAST_EXCLUDE: MULTICAST_MODE_TYPE = 1

public val MCAST_INCLUDE: MULTICAST_MODE_TYPE = 0

public val MCAST_JOIN_GROUP: UInt = 41u

public val MCAST_JOIN_SOURCE_GROUP: UInt = 45u

public val MCAST_LEAVE_GROUP: UInt = 42u

public val MCAST_LEAVE_SOURCE_GROUP: UInt = 46u

public val MCAST_UNBLOCK_SOURCE: UInt = 44u

public val MIB_IPPROTO_BBN: NL_ROUTE_PROTOCOL = 12

public val MIB_IPPROTO_BGP: NL_ROUTE_PROTOCOL = 14

public val MIB_IPPROTO_CISCO: NL_ROUTE_PROTOCOL = 11

public val MIB_IPPROTO_DHCP: NL_ROUTE_PROTOCOL = 19

public val MIB_IPPROTO_DVMRP: NL_ROUTE_PROTOCOL = 17

public val MIB_IPPROTO_EGP: NL_ROUTE_PROTOCOL = 5

public val MIB_IPPROTO_EIGRP: NL_ROUTE_PROTOCOL = 16

public val MIB_IPPROTO_ES_IS: NL_ROUTE_PROTOCOL = 10

public val MIB_IPPROTO_GGP: NL_ROUTE_PROTOCOL = 6

public val MIB_IPPROTO_HELLO: NL_ROUTE_PROTOCOL = 7

public val MIB_IPPROTO_ICMP: NL_ROUTE_PROTOCOL = 4

public val MIB_IPPROTO_IDPR: NL_ROUTE_PROTOCOL = 15

public val MIB_IPPROTO_IS_IS: NL_ROUTE_PROTOCOL = 9

public val MIB_IPPROTO_LOCAL: NL_ROUTE_PROTOCOL = 2

public val MIB_IPPROTO_NETMGMT: NL_ROUTE_PROTOCOL = 3

public val MIB_IPPROTO_NT_AUTOSTATIC: NL_ROUTE_PROTOCOL = 10002

public val MIB_IPPROTO_NT_STATIC: NL_ROUTE_PROTOCOL = 10006

public val MIB_IPPROTO_NT_STATIC_NON_DOD: NL_ROUTE_PROTOCOL = 10007

public val MIB_IPPROTO_OSPF: NL_ROUTE_PROTOCOL = 13

public val MIB_IPPROTO_OTHER: NL_ROUTE_PROTOCOL = 1

public val MIB_IPPROTO_RIP: NL_ROUTE_PROTOCOL = 8

public val MIB_IPPROTO_RPL: NL_ROUTE_PROTOCOL = 18

public val MIT_GUID: NPI_MODULEID_TYPE = 1

public val MIT_IF_LUID: NPI_MODULEID_TYPE = 2

public val MLD_MAX_RESP_CODE_TYPE_FLOAT: MLD_MAX_RESP_CODE_TYPE = 1

public val MLD_MAX_RESP_CODE_TYPE_NORMAL: MLD_MAX_RESP_CODE_TYPE = 0

public val MSG_BCAST: UInt = 1024u

public val MSG_CTRUNC: UInt = 512u

public val MSG_DONTROUTE: SEND_RECV_FLAGS = 4

public val MSG_ERRQUEUE: UInt = 4096u

public val MSG_INTERRUPT: UInt = 16u

public val MSG_MAXIOVLEN: UInt = 16u

public val MSG_MCAST: UInt = 2048u

public val MSG_OOB: SEND_RECV_FLAGS = 1

public val MSG_PARTIAL: UInt = 32768u

public val MSG_PEEK: SEND_RECV_FLAGS = 2

public val MSG_PUSH_IMMEDIATE: SEND_RECV_FLAGS = 32

public val MSG_TRUNC: UInt = 256u

public val MSG_WAITALL: SEND_RECV_FLAGS = 8

public val ND_NA_FLAG_OVERRIDE: UInt = 536870912u

public val ND_NA_FLAG_ROUTER: UInt = 2147483648u

public val ND_NA_FLAG_SOLICITED: UInt = 1073741824u

public val ND_OPT_ADVERTISEMENT_INTERVAL: ND_OPTION_TYPE = 7

public val ND_OPT_DNSSL: ND_OPTION_TYPE = 31

public val ND_OPT_DNSSL_MIN_LEN: UInt = 16u

public val ND_OPT_HOME_AGENT_INFORMATION: ND_OPTION_TYPE = 8

public val ND_OPT_MTU: ND_OPTION_TYPE = 5

public val ND_OPT_NBMA_SHORTCUT_LIMIT: ND_OPTION_TYPE = 6

public val ND_OPT_PI_FLAG_AUTO: UInt = 64u

public val ND_OPT_PI_FLAG_ONLINK: UInt = 128u

public val ND_OPT_PI_FLAG_ROUTE: UInt = 1u

public val ND_OPT_PI_FLAG_ROUTER_ADDR: UInt = 32u

public val ND_OPT_PI_FLAG_SITE_PREFIX: UInt = 16u

public val ND_OPT_PREFIX_INFORMATION: ND_OPTION_TYPE = 3

public val ND_OPT_RDNSS: ND_OPTION_TYPE = 25

public val ND_OPT_RDNSS_MIN_LEN: UInt = 24u

public val ND_OPT_REDIRECTED_HEADER: ND_OPTION_TYPE = 4

public val ND_OPT_RI_FLAG_PREFERENCE: UInt = 24u

public val ND_OPT_ROUTE_INFO: ND_OPTION_TYPE = 24

public val ND_OPT_SOURCE_ADDR_LIST: ND_OPTION_TYPE = 9

public val ND_OPT_SOURCE_LINKADDR: ND_OPTION_TYPE = 1

public val ND_OPT_TARGET_ADDR_LIST: ND_OPTION_TYPE = 10

public val ND_OPT_TARGET_LINKADDR: ND_OPTION_TYPE = 2

public val ND_RA_FLAG_HOME_AGENT: UInt = 32u

public val ND_RA_FLAG_MANAGED: UInt = 128u

public val ND_RA_FLAG_OTHER: UInt = 64u

public val ND_RA_FLAG_PREFERENCE: UInt = 24u

public val NETBIOS_GROUP_NAME: UInt = 1u

public val NETBIOS_NAME_LENGTH: UInt = 16u

public val NETBIOS_TYPE_QUICK_GROUP: UInt = 3u

public val NETBIOS_TYPE_QUICK_UNIQUE: UInt = 2u

public val NETBIOS_UNIQUE_NAME: UInt = 0u

public val NI_DGRAM: UInt = 16u

public val NI_MAXHOST: UInt = 1025u

public val NI_MAXSERV: UInt = 32u

public val NI_NAMEREQD: UInt = 4u

public val NI_NOFQDN: UInt = 1u

public val NI_NUMERICHOST: UInt = 2u

public val NI_NUMERICSERV: UInt = 8u

public val NLA_802_1X_LOCATION: NLA_BLOB_DATA_TYPE = 2

public val NLA_ALLUSERS_NETWORK: UInt = 1u

public val NLA_CONNECTIVITY: NLA_BLOB_DATA_TYPE = 3

public val NLA_FRIENDLY_NAME: UInt = 2u

public val NLA_ICS: NLA_BLOB_DATA_TYPE = 4

public val NLA_INTERFACE: NLA_BLOB_DATA_TYPE = 1

public val NLA_INTERNET_NO: NLA_INTERNET = 1

public val NLA_INTERNET_UNKNOWN: NLA_INTERNET = 0

public val NLA_INTERNET_YES: NLA_INTERNET = 2

public val NLA_NAMESPACE_GUID: GUID = GUID.from_u128(0x6642243a3ba84aa6uL, 0xbaa52e0bd71fdd83uL)

public val NLA_NETWORK_AD_HOC: NLA_CONNECTIVITY_TYPE = 0

public val NLA_NETWORK_MANAGED: NLA_CONNECTIVITY_TYPE = 1

public val NLA_NETWORK_UNKNOWN: NLA_CONNECTIVITY_TYPE = 3

public val NLA_NETWORK_UNMANAGED: NLA_CONNECTIVITY_TYPE = 2

public val NLA_RAW_DATA: NLA_BLOB_DATA_TYPE = 0

public val NLA_SERVICE_CLASS_GUID: GUID = GUID.from_u128(0x37e515b5c94a43uL, 0xbada8b48a87ad239uL)

public val NSPROTO_IPX: UInt = 1000u

public val NSPROTO_SPX: UInt = 1256u

public val NSPROTO_SPXII: UInt = 1257u

public val NSP_NOTIFY_APC: WSACOMPLETIONTYPE = 4

public val NSP_NOTIFY_EVENT: WSACOMPLETIONTYPE = 2

public val NSP_NOTIFY_HWND: WSACOMPLETIONTYPE = 1

public val NSP_NOTIFY_IMMEDIATELY: WSACOMPLETIONTYPE = 0

public val NSP_NOTIFY_PORT: WSACOMPLETIONTYPE = 3

public val NSTYPE_DYNAMIC: UInt = 2u

public val NSTYPE_ENUMERABLE: UInt = 4u

public val NSTYPE_HIERARCHICAL: UInt = 1u

public val NSTYPE_WORKGROUP: UInt = 8u

public val NS_ALL: UInt = 0u

public val NS_DEFAULT: UInt = 0u

public val NS_DHCP: UInt = 6u

public val NS_DNS: UInt = 12u

public val NS_EMAIL: UInt = 37u

public val NS_LOCALNAME: UInt = 19u

public val NS_MS: UInt = 30u

public val NS_NBP: UInt = 20u

public val NS_NDS: UInt = 2u

public val NS_NETBT: UInt = 13u

public val NS_NETDES: UInt = 60u

public val NS_NIS: UInt = 41u

public val NS_NISPLUS: UInt = 42u

public val NS_NLA: UInt = 15u

public val NS_NTDS: UInt = 32u

public val NS_PEER_BROWSE: UInt = 3u

public val NS_SAP: UInt = 1u

public val NS_SLP: UInt = 5u

public val NS_STDA: UInt = 31u

public val NS_TCPIP_HOSTS: UInt = 11u

public val NS_TCPIP_LOCAL: UInt = 10u

public val NS_VNS: UInt = 50u

public val NS_WINS: UInt = 14u

public val NS_WRQ: UInt = 50u

public val NS_X500: UInt = 40u

public val NetworkCategoryDomainAuthenticated: NL_NETWORK_CATEGORY = 2

public val NetworkCategoryPrivate: NL_NETWORK_CATEGORY = 1

public val NetworkCategoryPublic: NL_NETWORK_CATEGORY = 0

public val NetworkCategoryUnchanged: NL_NETWORK_CATEGORY = -1

public val NetworkCategoryUnknown: NL_NETWORK_CATEGORY = -1

public val NetworkConnectivityCostHintFixed: NL_NETWORK_CONNECTIVITY_COST_HINT = 2

public val NetworkConnectivityCostHintUnknown: NL_NETWORK_CONNECTIVITY_COST_HINT = 0

public val NetworkConnectivityCostHintUnrestricted: NL_NETWORK_CONNECTIVITY_COST_HINT = 1

public val NetworkConnectivityCostHintVariable: NL_NETWORK_CONNECTIVITY_COST_HINT = 3

public val NetworkConnectivityLevelHintConstrainedInternetAccess: NL_NETWORK_CONNECTIVITY_LEVEL_HINT = 4

public val NetworkConnectivityLevelHintHidden: NL_NETWORK_CONNECTIVITY_LEVEL_HINT = 5

public val NetworkConnectivityLevelHintInternetAccess: NL_NETWORK_CONNECTIVITY_LEVEL_HINT = 3

public val NetworkConnectivityLevelHintLocalAccess: NL_NETWORK_CONNECTIVITY_LEVEL_HINT = 2

public val NetworkConnectivityLevelHintNone: NL_NETWORK_CONNECTIVITY_LEVEL_HINT = 1

public val NetworkConnectivityLevelHintUnknown: NL_NETWORK_CONNECTIVITY_LEVEL_HINT = 0

public val NlatAnycast: NL_ADDRESS_TYPE = 2

public val NlatBroadcast: NL_ADDRESS_TYPE = 4

public val NlatInvalid: NL_ADDRESS_TYPE = 5

public val NlatMulticast: NL_ADDRESS_TYPE = 3

public val NlatUnicast: NL_ADDRESS_TYPE = 1

public val NlatUnspecified: NL_ADDRESS_TYPE = 0

public val NlbwDisabled: NL_BANDWIDTH_FLAG = 0

public val NlbwEnabled: NL_BANDWIDTH_FLAG = 1

public val NlbwUnchanged: NL_BANDWIDTH_FLAG = -1

public val NldsDeprecated: NL_DAD_STATE = 3

public val NldsDuplicate: NL_DAD_STATE = 2

public val NldsInvalid: NL_DAD_STATE = 0

public val NldsPreferred: NL_DAD_STATE = 4

public val NldsTentative: NL_DAD_STATE = 1

public val NlincCategoryStateMax: NL_INTERFACE_NETWORK_CATEGORY_STATE = 4

public val NlincCategoryUnknown: NL_INTERFACE_NETWORK_CATEGORY_STATE = 0

public val NlincDomainAuthenticated: NL_INTERFACE_NETWORK_CATEGORY_STATE = 3

public val NlincPrivate: NL_INTERFACE_NETWORK_CATEGORY_STATE = 2

public val NlincPublic: NL_INTERFACE_NETWORK_CATEGORY_STATE = 1

public val NlnsDelay: NL_NEIGHBOR_STATE = 3

public val NlnsIncomplete: NL_NEIGHBOR_STATE = 1

public val NlnsMaximum: NL_NEIGHBOR_STATE = 7

public val NlnsPermanent: NL_NEIGHBOR_STATE = 6

public val NlnsProbe: NL_NEIGHBOR_STATE = 2

public val NlnsReachable: NL_NEIGHBOR_STATE = 5

public val NlnsStale: NL_NEIGHBOR_STATE = 4

public val NlnsUnreachable: NL_NEIGHBOR_STATE = 0

public val Nlro6to4: NL_ROUTE_ORIGIN = 4

public val NlroDHCP: NL_ROUTE_ORIGIN = 2

public val NlroManual: NL_ROUTE_ORIGIN = 0

public val NlroRouterAdvertisement: NL_ROUTE_ORIGIN = 3

public val NlroWellKnown: NL_ROUTE_ORIGIN = 1

public val NlsoDhcp: NL_SUFFIX_ORIGIN = 3

public val NlsoLinkLayerAddress: NL_SUFFIX_ORIGIN = 4

public val NlsoManual: NL_SUFFIX_ORIGIN = 1

public val NlsoOther: NL_SUFFIX_ORIGIN = 0

public val NlsoRandom: NL_SUFFIX_ORIGIN = 5

public val NlsoWellKnown: NL_SUFFIX_ORIGIN = 2

public val PFL_HIDDEN: UInt = 4u

public val PFL_MATCHES_PROTOCOL_ZERO: UInt = 8u

public val PFL_MULTIPLE_PROTO_ENTRIES: UInt = 1u

public val PFL_NETWORKDIRECT_PROVIDER: UInt = 16u

public val PFL_RECOMMENDED_PROTO_ENTRY: UInt = 2u

public val PF_APPLETALK: UShort = 16u

public val PF_ATM: UShort = 22u

public val PF_BAN: UShort = 21u

public val PF_CCITT: UShort = 10u

public val PF_CHAOS: UShort = 5u

public val PF_DATAKIT: UShort = 9u

public val PF_DECnet: UShort = 12u

public val PF_DLI: UShort = 13u

public val PF_ECMA: UShort = 8u

public val PF_FIREFOX: UShort = 19u

public val PF_HYLINK: UShort = 15u

public val PF_IMPLINK: UShort = 3u

public val PF_IPX: UShort = 6u

public val PF_IRDA: UShort = 26u

public val PF_ISO: UShort = 7u

public val PF_LAT: UShort = 14u

public val PF_MAX: UShort = 29u

public val PF_NS: UShort = 6u

public val PF_OSI: UShort = 7u

public val PF_PUP: UShort = 4u

public val PF_SNA: UShort = 11u

public val PF_UNIX: UShort = 1u

public val PF_UNKNOWN1: UShort = 20u

public val PF_VOICEVIEW: UShort = 18u

public val PI_ALLOWED: UInt = 0u

public val PI_NUMBER_NOT_AVAILABLE: UInt = 128u

public val PI_RESTRICTED: UInt = 64u

public val POLLERR: WSAPOLL_EVENT_FLAGS = 1

public val POLLHUP: WSAPOLL_EVENT_FLAGS = 2

public val POLLIN: WSAPOLL_EVENT_FLAGS = 768

public val POLLNVAL: WSAPOLL_EVENT_FLAGS = 4

public val POLLOUT: WSAPOLL_EVENT_FLAGS = 16

public val POLLPRI: WSAPOLL_EVENT_FLAGS = 1024

public val POLLRDBAND: WSAPOLL_EVENT_FLAGS = 512

public val POLLRDNORM: WSAPOLL_EVENT_FLAGS = 256

public val POLLWRBAND: WSAPOLL_EVENT_FLAGS = 32

public val POLLWRNORM: WSAPOLL_EVENT_FLAGS = 16

public val PROP_ADDRESSES: UInt = 256u

public val PROP_ALL: UInt = 2147483648u

public val PROP_COMMENT: UInt = 1u

public val PROP_DISPLAY_HINT: UInt = 4u

public val PROP_LOCALE: UInt = 2u

public val PROP_MACHINE: UInt = 32u

public val PROP_SD: UInt = 512u

public val PROP_START_TIME: UInt = 16u

public val PROP_VERSION: UInt = 8u

public val PROTECTION_LEVEL_DEFAULT: UInt = 20u

public val PROTECTION_LEVEL_EDGERESTRICTED: UInt = 20u

public val PROTECTION_LEVEL_RESTRICTED: UInt = 30u

public val PROTECTION_LEVEL_UNRESTRICTED: UInt = 10u

public val PROTO_IP_BBN: NL_ROUTE_PROTOCOL = 12

public val PROTO_IP_BGP: NL_ROUTE_PROTOCOL = 14

public val PROTO_IP_CISCO: NL_ROUTE_PROTOCOL = 11

public val PROTO_IP_DHCP: NL_ROUTE_PROTOCOL = 19

public val PROTO_IP_DVMRP: NL_ROUTE_PROTOCOL = 17

public val PROTO_IP_EGP: NL_ROUTE_PROTOCOL = 5

public val PROTO_IP_EIGRP: NL_ROUTE_PROTOCOL = 16

public val PROTO_IP_ES_IS: NL_ROUTE_PROTOCOL = 10

public val PROTO_IP_GGP: NL_ROUTE_PROTOCOL = 6

public val PROTO_IP_HELLO: NL_ROUTE_PROTOCOL = 7

public val PROTO_IP_ICMP: NL_ROUTE_PROTOCOL = 4

public val PROTO_IP_IDPR: NL_ROUTE_PROTOCOL = 15

public val PROTO_IP_IS_IS: NL_ROUTE_PROTOCOL = 9

public val PROTO_IP_LOCAL: NL_ROUTE_PROTOCOL = 2

public val PROTO_IP_NETMGMT: NL_ROUTE_PROTOCOL = 3

public val PROTO_IP_NT_AUTOSTATIC: NL_ROUTE_PROTOCOL = 10002

public val PROTO_IP_NT_STATIC: NL_ROUTE_PROTOCOL = 10006

public val PROTO_IP_NT_STATIC_NON_DOD: NL_ROUTE_PROTOCOL = 10007

public val PROTO_IP_OSPF: NL_ROUTE_PROTOCOL = 13

public val PROTO_IP_OTHER: NL_ROUTE_PROTOCOL = 1

public val PROTO_IP_RIP: NL_ROUTE_PROTOCOL = 8

public val PROTO_IP_RPL: NL_ROUTE_PROTOCOL = 18

public val PVD_CONFIG: Int = 12289

public val ProviderInfoAudit: WSC_PROVIDER_INFO_TYPE = 1

public val ProviderInfoLspCategories: WSC_PROVIDER_INFO_TYPE = 0

public val ProviderLevel_None: NAPI_PROVIDER_LEVEL = 0

public val ProviderLevel_Primary: NAPI_PROVIDER_LEVEL = 2

public val ProviderLevel_Secondary: NAPI_PROVIDER_LEVEL = 1

public val ProviderType_Application: NAPI_PROVIDER_TYPE = 1

public val ProviderType_Service: NAPI_PROVIDER_TYPE = 2

public val QOS_CLASS0: UInt = 0u

public val QOS_CLASS1: UInt = 1u

public val QOS_CLASS2: UInt = 2u

public val QOS_CLASS3: UInt = 3u

public val QOS_CLASS4: UInt = 4u

public val RCVALL_IPLEVEL: RCVALL_VALUE = 3

public val RCVALL_OFF: RCVALL_VALUE = 0

public val RCVALL_ON: RCVALL_VALUE = 1

public val RCVALL_SOCKETLEVELONLY: RCVALL_VALUE = 2

public val REAL_TIME_NOTIFICATION_CAPABILITY: GUID = GUID.from_u128(0x6b59819a5cae492duL, 0xa9012a3c2c50164fuL)

public val REAL_TIME_NOTIFICATION_CAPABILITY_EX: GUID = GUID.from_u128(0x6843da03154a4616uL, 0xa50844371295f96buL)

public val RESOURCEDISPLAYTYPE_DOMAIN: RESOURCE_DISPLAY_TYPE = 1u

public val RESOURCEDISPLAYTYPE_FILE: RESOURCE_DISPLAY_TYPE = 4u

public val RESOURCEDISPLAYTYPE_GENERIC: RESOURCE_DISPLAY_TYPE = 0u

public val RESOURCEDISPLAYTYPE_GROUP: RESOURCE_DISPLAY_TYPE = 5u

public val RESOURCEDISPLAYTYPE_SERVER: RESOURCE_DISPLAY_TYPE = 2u

public val RESOURCEDISPLAYTYPE_SHARE: RESOURCE_DISPLAY_TYPE = 3u

public val RESOURCEDISPLAYTYPE_TREE: RESOURCE_DISPLAY_TYPE = 10u

public val RESULT_IS_ADDED: UInt = 16u

public val RESULT_IS_ALIAS: UInt = 1u

public val RESULT_IS_CHANGED: UInt = 32u

public val RESULT_IS_DELETED: UInt = 64u

public val RES_FIND_MULTIPLE: UInt = 2u

public val RES_FLUSH_CACHE: UInt = 2u

public val RES_SERVICE: UInt = 4u

public val RES_SOFT_SEARCH: UInt = 1u

public val RES_UNUSED_1: UInt = 1u

public val RIO_CORRUPT_CQ: UInt = 4294967295u

public val RIO_EVENT_COMPLETION: RIO_NOTIFICATION_COMPLETION_TYPE = 1

public val RIO_IOCP_COMPLETION: RIO_NOTIFICATION_COMPLETION_TYPE = 2

public val RIO_MAX_CQ_SIZE: UInt = 134217728u

public val RIO_MSG_COMMIT_ONLY: UInt = 8u

public val RIO_MSG_DEFER: UInt = 2u

public val RIO_MSG_DONT_NOTIFY: UInt = 1u

public val RIO_MSG_WAITALL: UInt = 4u

public val RM_ADD_RECEIVE_IF: Int = 1008

public val RM_DEL_RECEIVE_IF: Int = 1009

public val RM_FLUSHCACHE: Int = 1003

public val RM_HIGH_SPEED_INTRANET_OPT: Int = 1014

public val RM_LATEJOIN: Int = 1006

public val RM_OPTIONSBASE: Int = 1000

public val RM_RATE_WINDOW_SIZE: Int = 1001

public val RM_RECEIVER_STATISTICS: Int = 1013

public val RM_SENDER_STATISTICS: Int = 1005

public val RM_SENDER_WINDOW_ADVANCE_METHOD: Int = 1004

public val RM_SEND_WINDOW_ADV_RATE: Int = 1010

public val RM_SET_MCAST_TTL: Int = 1012

public val RM_SET_MESSAGE_BOUNDARY: Int = 1002

public val RM_SET_SEND_IF: Int = 1007

public val RM_USE_FEC: Int = 1011

public val RNRSERVICE_DELETE: WSAESETSERVICEOP = 2

public val RNRSERVICE_DEREGISTER: WSAESETSERVICEOP = 1

public val RNRSERVICE_REGISTER: WSAESETSERVICEOP = 0

public val RouteProtocolBbn: NL_ROUTE_PROTOCOL = 12

public val RouteProtocolBgp: NL_ROUTE_PROTOCOL = 14

public val RouteProtocolCisco: NL_ROUTE_PROTOCOL = 11

public val RouteProtocolDhcp: NL_ROUTE_PROTOCOL = 19

public val RouteProtocolDvmrp: NL_ROUTE_PROTOCOL = 17

public val RouteProtocolEgp: NL_ROUTE_PROTOCOL = 5

public val RouteProtocolEigrp: NL_ROUTE_PROTOCOL = 16

public val RouteProtocolEsIs: NL_ROUTE_PROTOCOL = 10

public val RouteProtocolGgp: NL_ROUTE_PROTOCOL = 6

public val RouteProtocolHello: NL_ROUTE_PROTOCOL = 7

public val RouteProtocolIcmp: NL_ROUTE_PROTOCOL = 4

public val RouteProtocolIdpr: NL_ROUTE_PROTOCOL = 15

public val RouteProtocolIsIs: NL_ROUTE_PROTOCOL = 9

public val RouteProtocolLocal: NL_ROUTE_PROTOCOL = 2

public val RouteProtocolNetMgmt: NL_ROUTE_PROTOCOL = 3

public val RouteProtocolOspf: NL_ROUTE_PROTOCOL = 13

public val RouteProtocolOther: NL_ROUTE_PROTOCOL = 1

public val RouteProtocolRip: NL_ROUTE_PROTOCOL = 8

public val RouteProtocolRpl: NL_ROUTE_PROTOCOL = 18

public val RouterDiscoveryDhcp: NL_ROUTER_DISCOVERY_BEHAVIOR = 2

public val RouterDiscoveryDisabled: NL_ROUTER_DISCOVERY_BEHAVIOR = 0

public val RouterDiscoveryEnabled: NL_ROUTER_DISCOVERY_BEHAVIOR = 1

public val RouterDiscoveryUnchanged: NL_ROUTER_DISCOVERY_BEHAVIOR = -1

public val SAP_FIELD_ABSENT: UInt = 4294967294u

public val SAP_FIELD_ANY: UInt = 4294967295u

public val SAP_FIELD_ANY_AESA_REST: UInt = 4294967291u

public val SAP_FIELD_ANY_AESA_SEL: UInt = 4294967290u

public val SD_BOTH: WINSOCK_SHUTDOWN_HOW = 2

public val SD_RECEIVE: WINSOCK_SHUTDOWN_HOW = 0

public val SD_SEND: WINSOCK_SHUTDOWN_HOW = 1

public val SECURITY_PROTOCOL_NONE: UInt = 0u

public val SENDER_DEFAULT_LATE_JOINER_PERCENTAGE: UInt = 0u

public val SENDER_DEFAULT_RATE_KBITS_PER_SEC: UInt = 56u

public val SENDER_DEFAULT_WINDOW_ADV_PERCENTAGE: UInt = 15u

public val SENDER_MAX_LATE_JOINER_PERCENTAGE: UInt = 75u

public val SERVICE_ADDRESS_FLAG_RPC_CN: UInt = 1u

public val SERVICE_ADDRESS_FLAG_RPC_DG: UInt = 2u

public val SERVICE_ADDRESS_FLAG_RPC_NB: UInt = 4u

public val SERVICE_ADD_TYPE: SET_SERVICE_OPERATION = 4u

public val SERVICE_DELETE_TYPE: SET_SERVICE_OPERATION = 5u

public val SERVICE_DEREGISTER: SET_SERVICE_OPERATION = 2u

public val SERVICE_FLAG_DEFER: UInt = 1u

public val SERVICE_FLAG_HARD: UInt = 2u

public val SERVICE_FLUSH: SET_SERVICE_OPERATION = 3u

public val SERVICE_LOCAL: UInt = 4u

public val SERVICE_MULTIPLE: UInt = 1u

public val SERVICE_REGISTER: SET_SERVICE_OPERATION = 1u

public val SERVICE_RESOURCE: UInt = 1u

public val SERVICE_SERVICE: UInt = 2u

public val SERVICE_TYPE_VALUE_CONN: PCWSTR = w("ConnectionOriented")

public val SERVICE_TYPE_VALUE_CONNA: PCSTR = s("ConnectionOriented")

public val SERVICE_TYPE_VALUE_CONNW: PCWSTR = w("ConnectionOriented")

public val SERVICE_TYPE_VALUE_IPXPORTA: PCSTR = s("IpxSocket")

public val SERVICE_TYPE_VALUE_IPXPORTW: PCWSTR = w("IpxSocket")

public val SERVICE_TYPE_VALUE_OBJECTID: PCWSTR = w("ObjectId")

public val SERVICE_TYPE_VALUE_OBJECTIDA: PCSTR = s("ObjectId")

public val SERVICE_TYPE_VALUE_OBJECTIDW: PCWSTR = w("ObjectId")

public val SERVICE_TYPE_VALUE_SAPID: PCWSTR = w("SapId")

public val SERVICE_TYPE_VALUE_SAPIDA: PCSTR = s("SapId")

public val SERVICE_TYPE_VALUE_SAPIDW: PCWSTR = w("SapId")

public val SERVICE_TYPE_VALUE_TCPPORT: PCWSTR = w("TcpPort")

public val SERVICE_TYPE_VALUE_TCPPORTA: PCSTR = s("TcpPort")

public val SERVICE_TYPE_VALUE_TCPPORTW: PCWSTR = w("TcpPort")

public val SERVICE_TYPE_VALUE_UDPPORT: PCWSTR = w("UdpPort")

public val SERVICE_TYPE_VALUE_UDPPORTA: PCSTR = s("UdpPort")

public val SERVICE_TYPE_VALUE_UDPPORTW: PCWSTR = w("UdpPort")

public val SET_SERVICE_PARTIAL_SUCCESS: UInt = 1u

public val SG_CONSTRAINED_GROUP: UInt = 2u

public val SG_UNCONSTRAINED_GROUP: UInt = 1u

public val SIOCATMARK: Int = 1074033415

public val SIOCGHIWAT: Int = 1074033409

public val SIOCGLOWAT: Int = 1074033411

public val SIOCSHIWAT: Int = -2147192064

public val SIOCSLOWAT: Int = -2147192062

public val SIO_ABSORB_RTRALERT: UInt = 2550136837u

public val SIO_ACQUIRE_PORT_RESERVATION: UInt = 2550136932u

public val SIO_ADDRESS_LIST_CHANGE: UInt = 671088663u

public val SIO_ADDRESS_LIST_QUERY: UInt = 1207959574u

public val SIO_ADDRESS_LIST_SORT: UInt = 3355443225u

public val SIO_AF_UNIX_GETPEERPID: UInt = 1476395264u

public val SIO_AF_UNIX_SETBINDPARENTPATH: UInt = 2550137089u

public val SIO_AF_UNIX_SETCONNPARENTPATH: UInt = 2550137090u

public val SIO_APPLY_TRANSPORT_SETTING: UInt = 2550136851u

public val SIO_ASSOCIATE_HANDLE: UInt = 2281701377u

public val SIO_ASSOCIATE_PORT_RESERVATION: UInt = 2550136934u

public val SIO_ASSOCIATE_PVC: UInt = 2417360899u

public val SIO_BASE_HANDLE: UInt = 1207959586u

public val SIO_BSP_HANDLE: UInt = 1207959579u

public val SIO_BSP_HANDLE_POLL: UInt = 1207959581u

public val SIO_BSP_HANDLE_SELECT: UInt = 1207959580u

public val SIO_CPU_AFFINITY: UInt = 2550136853u

public val SIO_DELETE_PEER_TARGET_NAME: UInt = 2550137035u

public val SIO_ENABLE_CIRCULAR_QUEUEING: UInt = 671088642u

public val SIO_EXT_POLL: UInt = 3355443231u

public val SIO_EXT_SELECT: UInt = 3355443230u

public val SIO_EXT_SENDMSG: UInt = 3355443232u

public val SIO_FIND_ROUTE: UInt = 1207959555u

public val SIO_FLUSH: UInt = 671088644u

public val SIO_GET_ATM_ADDRESS: UInt = 3491102722u

public val SIO_GET_ATM_CONNECTION_ID: UInt = 1343619076u

public val SIO_GET_BROADCAST_ADDRESS: UInt = 1207959557u

public val SIO_GET_EXTENSION_FUNCTION_POINTER: UInt = 3355443206u

public val SIO_GET_GROUP_QOS: UInt = 3355443208u

public val SIO_GET_MULTIPLE_EXTENSION_FUNCTION_POINTER: UInt = 3355443236u

public val SIO_GET_NUMBER_OF_ATM_DEVICES: UInt = 1343619073u

public val SIO_GET_QOS: UInt = 3355443207u

public val SIO_GET_TX_TIMESTAMP: UInt = 2550137066u

public val SIO_INDEX_ADD_MCAST: UInt = 2550136842u

public val SIO_INDEX_BIND: UInt = 2550136840u

public val SIO_INDEX_DEL_MCAST: UInt = 2550136843u

public val SIO_INDEX_MCASTIF: UInt = 2550136841u

public val SIO_KEEPALIVE_VALS: UInt = 2550136836u

public val SIO_LIMIT_BROADCASTS: UInt = 2550136839u

public val SIO_LOOPBACK_FAST_PATH: UInt = 2550136848u

public val SIO_MULTICAST_SCOPE: UInt = 2281701386u

public val SIO_MULTIPOINT_LOOPBACK: UInt = 2281701385u

public val SIO_NSP_NOTIFY_CHANGE: UInt = 2281701401u

public val SIO_PRIORITY_HINT: UInt = 2550136856u

public val SIO_QUERY_RSS_PROCESSOR_INFO: UInt = 1207959589u

public val SIO_QUERY_RSS_SCALABILITY_INFO: UInt = 1476395218u

public val SIO_QUERY_SECURITY: UInt = 3623878857u

public val SIO_QUERY_TARGET_PNP_HANDLE: UInt = 1207959576u

public val SIO_QUERY_TRANSPORT_SETTING: UInt = 2550136852u

public val SIO_QUERY_WFP_ALE_ENDPOINT_HANDLE: UInt = 1476395213u

public val SIO_QUERY_WFP_CONNECTION_REDIRECT_CONTEXT: UInt = 2550137053u

public val SIO_QUERY_WFP_CONNECTION_REDIRECT_RECORDS: UInt = 2550137052u

public val SIO_RCVALL: UInt = 2550136833u

public val SIO_RCVALL_IF: UInt = 2550136846u

public val SIO_RCVALL_IGMPMCAST: UInt = 2550136835u

public val SIO_RCVALL_MCAST: UInt = 2550136834u

public val SIO_RCVALL_MCAST_IF: UInt = 2550136845u

public val SIO_RELEASE_PORT_RESERVATION: UInt = 2550136933u

public val SIO_RESERVED_1: UInt = 2281701402u

public val SIO_RESERVED_2: UInt = 2281701409u

public val SIO_ROUTING_INTERFACE_CHANGE: UInt = 2281701397u

public val SIO_ROUTING_INTERFACE_QUERY: UInt = 3355443220u

public val SIO_SET_COMPATIBILITY_MODE: UInt = 2550137132u

public val SIO_SET_GROUP_QOS: UInt = 2281701388u

public val SIO_SET_PEER_TARGET_NAME: UInt = 2550137034u

public val SIO_SET_PRIORITY_HINT: UInt = 2550136856u

public val SIO_SET_QOS: UInt = 2281701387u

public val SIO_SET_SECURITY: UInt = 2550137032u

public val SIO_SET_WFP_CONNECTION_REDIRECT_RECORDS: UInt = 2550137054u

public val SIO_SOCKET_CLOSE_NOTIFY: UInt = 2550136845u

public val SIO_SOCKET_USAGE_NOTIFICATION: UInt = 2550137036u

public val SIO_TCP_INFO: UInt = 3623878695u

public val SIO_TCP_INITIAL_RTO: UInt = 2550136849u

public val SIO_TCP_SET_ACK_FREQUENCY: UInt = 2550136855u

public val SIO_TCP_SET_ICW: UInt = 2550136854u

public val SIO_TIMESTAMPING: UInt = 2550137067u

public val SIO_TRANSLATE_HANDLE: UInt = 3355443213u

public val SIO_UCAST_IF: UInt = 2550136838u

public val SIO_UDP_CONNRESET: UInt = 2550136844u

public val SIO_UDP_NETRESET: UInt = 2550136847u

public val SIZEOF_IP_OPT_ROUTERALERT: UInt = 4u

public val SIZEOF_IP_OPT_ROUTING_HEADER: UInt = 3u

public val SIZEOF_IP_OPT_SECURITY: UInt = 11u

public val SIZEOF_IP_OPT_STREAMIDENTIFIER: UInt = 4u

public val SIZEOF_IP_OPT_TIMESTAMP_HEADER: UInt = 4u

public val SI_NETWORK: UInt = 3u

public val SI_USER_FAILED: UInt = 2u

public val SI_USER_NOT_SCREENED: UInt = 0u

public val SI_USER_PASSED: UInt = 1u

public val SNAP_CONTROL: UInt = 3u

public val SNAP_DSAP: UInt = 170u

public val SNAP_OUI: UInt = 0u

public val SNAP_SSAP: UInt = 170u

public val SOCKET_DEFAULT2_QM_POLICY: GUID = GUID.from_u128(0xaec2ef9c3a4d4d3euL, 0x8842239942e39a47uL)

public val SOCKET_ERROR: Int = -1

public val SOCKET_INFO_CONNECTION_ENCRYPTED: UInt = 2u

public val SOCKET_INFO_CONNECTION_IMPERSONATED: UInt = 4u

public val SOCKET_INFO_CONNECTION_SECURED: UInt = 1u

public val SOCKET_QUERY_IPSEC2_ABORT_CONNECTION_ON_FIELD_CHANGE: UInt = 1u

public val SOCKET_QUERY_IPSEC2_FIELD_MASK_MM_SA_ID: UInt = 1u

public val SOCKET_QUERY_IPSEC2_FIELD_MASK_QM_SA_ID: UInt = 2u

public val SOCKET_SECURITY_PROTOCOL_DEFAULT: SOCKET_SECURITY_PROTOCOL = 0

public val SOCKET_SECURITY_PROTOCOL_INVALID: SOCKET_SECURITY_PROTOCOL = 3

public val SOCKET_SECURITY_PROTOCOL_IPSEC: SOCKET_SECURITY_PROTOCOL = 1

public val SOCKET_SECURITY_PROTOCOL_IPSEC2: SOCKET_SECURITY_PROTOCOL = 2

public val SOCKET_SETTINGS_ALLOW_INSECURE: UInt = 2u

public val SOCKET_SETTINGS_GUARANTEE_ENCRYPTION: UInt = 1u

public val SOCKET_SETTINGS_IPSEC_ALLOW_FIRST_INBOUND_PKT_UNENCRYPTED: UInt = 4u

public val SOCKET_SETTINGS_IPSEC_OPTIONAL_PEER_NAME_VERIFICATION: UInt = 2u

public val SOCKET_SETTINGS_IPSEC_PEER_NAME_IS_RAW_FORMAT: UInt = 8u

public val SOCKET_SETTINGS_IPSEC_SKIP_FILTER_INSTANTIATION: UInt = 1u

public val SOCK_DGRAM: WINSOCK_SOCKET_TYPE = 2

public val SOCK_NOTIFY_EVENT_ERR: UInt = 64u

public val SOCK_NOTIFY_EVENT_HANGUP: UInt = 4u

public val SOCK_NOTIFY_EVENT_IN: UInt = 1u

public val SOCK_NOTIFY_EVENT_OUT: UInt = 2u

public val SOCK_NOTIFY_EVENT_REMOVE: UInt = 128u

public val SOCK_NOTIFY_OP_DISABLE: UInt = 2u

public val SOCK_NOTIFY_OP_ENABLE: UInt = 1u

public val SOCK_NOTIFY_OP_NONE: UInt = 0u

public val SOCK_NOTIFY_OP_REMOVE: UInt = 4u

public val SOCK_NOTIFY_REGISTER_EVENT_HANGUP: UInt = 4u

public val SOCK_NOTIFY_REGISTER_EVENT_IN: UInt = 1u

public val SOCK_NOTIFY_REGISTER_EVENT_NONE: UInt = 0u

public val SOCK_NOTIFY_REGISTER_EVENT_OUT: UInt = 2u

public val SOCK_NOTIFY_TRIGGER_EDGE: UInt = 8u

public val SOCK_NOTIFY_TRIGGER_LEVEL: UInt = 4u

public val SOCK_NOTIFY_TRIGGER_ONESHOT: UInt = 1u

public val SOCK_NOTIFY_TRIGGER_PERSISTENT: UInt = 2u

public val SOCK_RAW: WINSOCK_SOCKET_TYPE = 3

public val SOCK_RDM: WINSOCK_SOCKET_TYPE = 4

public val SOCK_SEQPACKET: WINSOCK_SOCKET_TYPE = 5

public val SOCK_STREAM: WINSOCK_SOCKET_TYPE = 1

public val SOL_IP: UInt = 65531u

public val SOL_IPV6: UInt = 65530u

public val SOL_IRLMP: Int = 255

public val SOL_SOCKET: Int = 65535

public val SOMAXCONN: UInt = 5u

public val SO_ACCEPTCONN: Int = 2

public val SO_BROADCAST: Int = 32

public val SO_BSP_STATE: Int = 4105

public val SO_COMPARTMENT_ID: UInt = 12292u

public val SO_CONDITIONAL_ACCEPT: Int = 12290

public val SO_CONNDATA: Int = 28672

public val SO_CONNDATALEN: Int = 28676

public val SO_CONNECT_TIME: Int = 28684

public val SO_CONNOPT: Int = 28673

public val SO_CONNOPTLEN: Int = 28677

public val SO_DEBUG: Int = 1

public val SO_DISCDATA: Int = 28674

public val SO_DISCDATALEN: Int = 28678

public val SO_DISCOPT: Int = 28675

public val SO_DISCOPTLEN: Int = 28679

public val SO_DONTLINGER: Int = -129

public val SO_DONTROUTE: Int = 16

public val SO_ERROR: Int = 4103

public val SO_EXCLUSIVEADDRUSE: Int = -5

public val SO_GROUP_ID: Int = 8193

public val SO_GROUP_PRIORITY: Int = 8194

public val SO_KEEPALIVE: Int = 8

public val SO_LINGER: Int = 128

public val SO_MAXDG: Int = 28681

public val SO_MAXPATHDG: Int = 28682

public val SO_MAX_MSG_SIZE: Int = 8195

public val SO_OOBINLINE: Int = 256

public val SO_OPENTYPE: Int = 28680

public val SO_ORIGINAL_DST: UInt = 12303u

public val SO_PAUSE_ACCEPT: UInt = 12291u

public val SO_PORT_SCALABILITY: Int = 12294

public val SO_PROTOCOL_INFO: Int = 8197

public val SO_PROTOCOL_INFOA: Int = 8196

public val SO_PROTOCOL_INFOW: Int = 8197

public val SO_RANDOMIZE_PORT: Int = 12293

public val SO_RCVBUF: Int = 4098

public val SO_RCVLOWAT: Int = 4100

public val SO_RCVTIMEO: Int = 4102

public val SO_REUSEADDR: Int = 4

public val SO_REUSE_MULTICASTPORT: Int = 12296

public val SO_REUSE_UNICASTPORT: Int = 12295

public val SO_SNDBUF: Int = 4097

public val SO_SNDLOWAT: Int = 4099

public val SO_SNDTIMEO: Int = 4101

public val SO_SYNCHRONOUS_ALERT: UInt = 16u

public val SO_SYNCHRONOUS_NONALERT: UInt = 32u

public val SO_TIMESTAMP: UInt = 12298u

public val SO_TIMESTAMP_ID: UInt = 12299u

public val SO_TYPE: Int = 4104

public val SO_UPDATE_ACCEPT_CONTEXT: Int = 28683

public val SO_UPDATE_CONNECT_CONTEXT: Int = 28688

public val SO_USELOOPBACK: Int = 64

public val SYSTEM_CRITICAL_SOCKET: SOCKET_USAGE_TYPE = 1

public val ScopeLevelAdmin: SCOPE_LEVEL = 4

public val ScopeLevelCount: SCOPE_LEVEL = 16

public val ScopeLevelGlobal: SCOPE_LEVEL = 14

public val ScopeLevelInterface: SCOPE_LEVEL = 1

public val ScopeLevelLink: SCOPE_LEVEL = 2

public val ScopeLevelOrganization: SCOPE_LEVEL = 8

public val ScopeLevelSite: SCOPE_LEVEL = 5

public val ScopeLevelSubnet: SCOPE_LEVEL = 3

public val SocketMaximumPriorityHintType: SOCKET_PRIORITY_HINT = 3

public val SocketPriorityHintLow: SOCKET_PRIORITY_HINT = 1

public val SocketPriorityHintNormal: SOCKET_PRIORITY_HINT = 2

public val SocketPriorityHintVeryLow: SOCKET_PRIORITY_HINT = 0

public val TCPSTATE_CLOSED: TCPSTATE = 0

public val TCPSTATE_CLOSE_WAIT: TCPSTATE = 7

public val TCPSTATE_CLOSING: TCPSTATE = 8

public val TCPSTATE_ESTABLISHED: TCPSTATE = 4

public val TCPSTATE_FIN_WAIT_1: TCPSTATE = 5

public val TCPSTATE_FIN_WAIT_2: TCPSTATE = 6

public val TCPSTATE_LAST_ACK: TCPSTATE = 9

public val TCPSTATE_LISTEN: TCPSTATE = 1

public val TCPSTATE_MAX: TCPSTATE = 11

public val TCPSTATE_SYN_RCVD: TCPSTATE = 3

public val TCPSTATE_SYN_SENT: TCPSTATE = 2

public val TCPSTATE_TIME_WAIT: TCPSTATE = 10

public val TCP_ATMARK: Int = 8

public val TCP_BSDURGENT: Int = 28672

public val TCP_CONGESTION_ALGORITHM: Int = 12

public val TCP_DELAY_FIN_ACK: Int = 13

public val TCP_EXPEDITED_1122: Int = 2

public val TCP_FAIL_CONNECT_ON_ICMP_ERROR: Int = 18

public val TCP_FASTOPEN: Int = 15

public val TCP_ICMP_ERROR_INFO: Int = 19

public val TCP_ICW_LEVEL_AGGRESSIVE: TCP_ICW_LEVEL = 3

public val TCP_ICW_LEVEL_COMPAT: TCP_ICW_LEVEL = 254

public val TCP_ICW_LEVEL_DEFAULT: TCP_ICW_LEVEL = 0

public val TCP_ICW_LEVEL_EXPERIMENTAL: TCP_ICW_LEVEL = 4

public val TCP_ICW_LEVEL_HIGH: TCP_ICW_LEVEL = 1

public val TCP_ICW_LEVEL_MAX: TCP_ICW_LEVEL = 255

public val TCP_ICW_LEVEL_VERY_HIGH: TCP_ICW_LEVEL = 2

public val TCP_INITIAL_RTO_DEFAULT_MAX_SYN_RETRANSMISSIONS: UInt = 0u

public val TCP_INITIAL_RTO_DEFAULT_RTT: UInt = 0u

public val TCP_INITIAL_RTO_NO_SYN_RETRANSMISSIONS: UShort = 65534u

public val TCP_INITIAL_RTO_UNSPECIFIED_MAX_SYN_RETRANSMISSIONS: UShort = 65535u

public val TCP_KEEPALIVE: Int = 3

public val TCP_KEEPCNT: Int = 16

public val TCP_KEEPIDLE: Int = 3

public val TCP_KEEPINTVL: Int = 17

public val TCP_MAXRT: Int = 5

public val TCP_MAXRTMS: Int = 14

public val TCP_MAXSEG: Int = 4

public val TCP_NODELAY: Int = 1

public val TCP_NOSYNRETRIES: Int = 9

public val TCP_NOURG: Int = 7

public val TCP_OFFLOAD_NOT_PREFERRED: Int = 1

public val TCP_OFFLOAD_NO_PREFERENCE: Int = 0

public val TCP_OFFLOAD_PREFERENCE: Int = 11

public val TCP_OFFLOAD_PREFERRED: Int = 2

public val TCP_STDURG: Int = 6

public val TCP_TIMESTAMPS: Int = 10

public val TF_DISCONNECT: UInt = 1u

public val TF_REUSE_SOCKET: UInt = 2u

public val TF_USE_DEFAULT_WORKER: UInt = 0u

public val TF_USE_KERNEL_APC: UInt = 32u

public val TF_USE_SYSTEM_THREAD: UInt = 16u

public val TF_WRITE_BEHIND: UInt = 4u

public val TH_ACK: UInt = 16u

public val TH_CWR: UInt = 128u

public val TH_ECE: UInt = 64u

public val TH_FIN: UInt = 1u

public val TH_NETDEV: UInt = 1u

public val TH_OPT_EOL: UInt = 0u

public val TH_OPT_FASTOPEN: UInt = 34u

public val TH_OPT_MSS: UInt = 2u

public val TH_OPT_NOP: UInt = 1u

public val TH_OPT_SACK: UInt = 5u

public val TH_OPT_SACK_PERMITTED: UInt = 4u

public val TH_OPT_TS: UInt = 8u

public val TH_OPT_WS: UInt = 3u

public val TH_PSH: UInt = 8u

public val TH_RST: UInt = 4u

public val TH_SYN: UInt = 2u

public val TH_TAPI: UInt = 2u

public val TH_URG: UInt = 32u

public val TIMESTAMPING_FLAG_RX: UInt = 1u

public val TIMESTAMPING_FLAG_TX: UInt = 2u

public val TNS_PLAN_CARRIER_ID_CODE: UInt = 1u

public val TNS_TYPE_NATIONAL: UInt = 64u

public val TP_DISCONNECT: UInt = 1u

public val TP_ELEMENT_EOP: UInt = 4u

public val TP_ELEMENT_FILE: UInt = 2u

public val TP_ELEMENT_MEMORY: UInt = 1u

public val TP_REUSE_SOCKET: UInt = 2u

public val TP_USE_DEFAULT_WORKER: UInt = 0u

public val TP_USE_KERNEL_APC: UInt = 32u

public val TP_USE_SYSTEM_THREAD: UInt = 16u

public val TR_END_TO_END: UInt = 1u

public val TR_NOIND: UInt = 0u

public val TR_NO_END_TO_END: UInt = 2u

public val TT_CBR: UInt = 4u

public val TT_NOIND: UInt = 0u

public val TT_VBR: UInt = 8u

public val TUNNEL_SUB_TYPE_CP: TUNNEL_SUB_TYPE = 1

public val TUNNEL_SUB_TYPE_HA: TUNNEL_SUB_TYPE = 3

public val TUNNEL_SUB_TYPE_IPTLS: TUNNEL_SUB_TYPE = 2

public val TUNNEL_SUB_TYPE_NONE: TUNNEL_SUB_TYPE = 0

public val UDP_CHECKSUM_COVERAGE: Int = 20

public val UDP_COALESCED_INFO: UInt = 3u

public val UDP_NOCHECKSUM: Int = 1

public val UDP_RECV_MAX_COALESCED_SIZE: Int = 3

public val UDP_SEND_MSG_SIZE: Int = 2

public val UNIX_PATH_MAX: UInt = 108u

public val UP_P2MP: UInt = 1u

public val UP_P2P: UInt = 0u

public val VNSPROTO_IPC: UInt = 1u

public val VNSPROTO_RELIABLE_IPC: UInt = 2u

public val VNSPROTO_SPP: UInt = 3u

public val WCE_AF_IRDA: UInt = 22u

public val WCE_PF_IRDA: UInt = 22u

public val WINDOWS_AF_IRDA: UInt = 26u

public val WINDOWS_PF_IRDA: UInt = 26u

public val WSABASEERR: WSA_ERROR = 10000

public val WSADESCRIPTION_LEN: UInt = 256u

public val WSAEACCES: WSA_ERROR = 10013

public val WSAEADDRINUSE: WSA_ERROR = 10048

public val WSAEADDRNOTAVAIL: WSA_ERROR = 10049

public val WSAEAFNOSUPPORT: WSA_ERROR = 10047

public val WSAEALREADY: WSA_ERROR = 10037

public val WSAEBADF: WSA_ERROR = 10009

public val WSAECANCELLED: WSA_ERROR = 10103

public val WSAECONNABORTED: WSA_ERROR = 10053

public val WSAECONNREFUSED: WSA_ERROR = 10061

public val WSAECONNRESET: WSA_ERROR = 10054

public val WSAEDESTADDRREQ: WSA_ERROR = 10039

public val WSAEDISCON: WSA_ERROR = 10101

public val WSAEDQUOT: WSA_ERROR = 10069

public val WSAEFAULT: WSA_ERROR = 10014

public val WSAEHOSTDOWN: WSA_ERROR = 10064

public val WSAEHOSTUNREACH: WSA_ERROR = 10065

public val WSAEINPROGRESS: WSA_ERROR = 10036

public val WSAEINTR: WSA_ERROR = 10004

public val WSAEINVAL: WSA_ERROR = 10022

public val WSAEINVALIDPROCTABLE: WSA_ERROR = 10104

public val WSAEINVALIDPROVIDER: WSA_ERROR = 10105

public val WSAEISCONN: WSA_ERROR = 10056

public val WSAELOOP: WSA_ERROR = 10062

public val WSAEMFILE: WSA_ERROR = 10024

public val WSAEMSGSIZE: WSA_ERROR = 10040

public val WSAENAMETOOLONG: WSA_ERROR = 10063

public val WSAENETDOWN: WSA_ERROR = 10050

public val WSAENETRESET: WSA_ERROR = 10052

public val WSAENETUNREACH: WSA_ERROR = 10051

public val WSAENOBUFS: WSA_ERROR = 10055

public val WSAENOMORE: WSA_ERROR = 10102

public val WSAENOPROTOOPT: WSA_ERROR = 10042

public val WSAENOTCONN: WSA_ERROR = 10057

public val WSAENOTEMPTY: WSA_ERROR = 10066

public val WSAENOTSOCK: WSA_ERROR = 10038

public val WSAEOPNOTSUPP: WSA_ERROR = 10045

public val WSAEPFNOSUPPORT: WSA_ERROR = 10046

public val WSAEPROCLIM: WSA_ERROR = 10067

public val WSAEPROTONOSUPPORT: WSA_ERROR = 10043

public val WSAEPROTOTYPE: WSA_ERROR = 10041

public val WSAEPROVIDERFAILEDINIT: WSA_ERROR = 10106

public val WSAEREFUSED: WSA_ERROR = 10112

public val WSAEREMOTE: WSA_ERROR = 10071

public val WSAESHUTDOWN: WSA_ERROR = 10058

public val WSAESOCKTNOSUPPORT: WSA_ERROR = 10044

public val WSAESTALE: WSA_ERROR = 10070

public val WSAETIMEDOUT: WSA_ERROR = 10060

public val WSAETOOMANYREFS: WSA_ERROR = 10059

public val WSAEUSERS: WSA_ERROR = 10068

public val WSAEWOULDBLOCK: WSA_ERROR = 10035
