package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ADDRESS_TYPE_IANA: UInt = 0u

public val ADDRESS_TYPE_IATA: UInt = 1u

public val ALLOW: DhcpFilterListType = 1

public val CHANGESTATE: UInt = 4u

public val CLIENT_TYPE_BOOTP: UInt = 2u

public val CLIENT_TYPE_DHCP: UInt = 1u

public val CLIENT_TYPE_NONE: UInt = 100u

public val CLIENT_TYPE_RESERVATION_FLAG: UInt = 4u

public val CLIENT_TYPE_UNSPECIFIED: UInt = 0u

public val COMMUNICATION_INT: FsmState = 4

public val CONFLICT_DONE: FsmState = 7

public val DEFAULTQUARSETTING: QuarantineStatus = 5

public val DHCPCAPI_DEREGISTER_HANDLE_EVENT: UInt = 1u

public val DHCPCAPI_REGISTER_HANDLE_EVENT: UInt = 1u

public val DHCPCAPI_REQUEST_ASYNCHRONOUS: UInt = 4u

public val DHCPCAPI_REQUEST_CANCEL: UInt = 8u

public val DHCPCAPI_REQUEST_MASK: UInt = 15u

public val DHCPCAPI_REQUEST_PERSISTENT: UInt = 1u

public val DHCPCAPI_REQUEST_SYNCHRONOUS: UInt = 2u

public val DHCPV6_OPTION_CLIENTID: UInt = 1u

public val DHCPV6_OPTION_DNS_SERVERS: UInt = 23u

public val DHCPV6_OPTION_DOMAIN_LIST: UInt = 24u

public val DHCPV6_OPTION_IA_NA: UInt = 3u

public val DHCPV6_OPTION_IA_PD: UInt = 25u

public val DHCPV6_OPTION_IA_TA: UInt = 4u

public val DHCPV6_OPTION_NISP_DOMAIN_NAME: UInt = 30u

public val DHCPV6_OPTION_NISP_SERVERS: UInt = 28u

public val DHCPV6_OPTION_NIS_DOMAIN_NAME: UInt = 29u

public val DHCPV6_OPTION_NIS_SERVERS: UInt = 27u

public val DHCPV6_OPTION_ORO: UInt = 6u

public val DHCPV6_OPTION_PREFERENCE: UInt = 7u

public val DHCPV6_OPTION_RAPID_COMMIT: UInt = 14u

public val DHCPV6_OPTION_RECONF_MSG: UInt = 19u

public val DHCPV6_OPTION_SERVERID: UInt = 2u

public val DHCPV6_OPTION_SIP_SERVERS_ADDRS: UInt = 22u

public val DHCPV6_OPTION_SIP_SERVERS_NAMES: UInt = 21u

public val DHCPV6_OPTION_UNICAST: UInt = 12u

public val DHCPV6_OPTION_USER_CLASS: UInt = 15u

public val DHCPV6_OPTION_VENDOR_CLASS: UInt = 16u

public val DHCPV6_OPTION_VENDOR_OPTS: UInt = 17u

public val DHCP_ATTRIB_BOOL_IS_ADMIN: UInt = 5u

public val DHCP_ATTRIB_BOOL_IS_BINDING_AWARE: UInt = 4u

public val DHCP_ATTRIB_BOOL_IS_DYNBOOTP: UInt = 2u

public val DHCP_ATTRIB_BOOL_IS_PART_OF_DSDC: UInt = 3u

public val DHCP_ATTRIB_BOOL_IS_ROGUE: UInt = 1u

public val DHCP_ATTRIB_TYPE_BOOL: UInt = 1u

public val DHCP_ATTRIB_TYPE_ULONG: UInt = 2u

public val DHCP_ATTRIB_ULONG_RESTORE_STATUS: UInt = 6u

public val DHCP_CALLOUT_ENTRY_POINT: Pcstr = s("DhcpServerCalloutEntry")

public val DHCP_CALLOUT_LIST_KEY: Pcwstr = w("System\\CurrentControlSet\\Services\\DHCPServer\\Parameters")

public val DHCP_CALLOUT_LIST_VALUE: Pcwstr = w("CalloutDlls")

public val DHCP_CLIENT_BOOTP: UInt = 805306371u

public val DHCP_CLIENT_DHCP: UInt = 805306372u

public val DHCP_CONTROL_CONTINUE: UInt = 4u

public val DHCP_CONTROL_PAUSE: UInt = 3u

public val DHCP_CONTROL_START: UInt = 1u

public val DHCP_CONTROL_STOP: UInt = 2u

public val DHCP_DROP_DUPLICATE: UInt = 1u

public val DHCP_DROP_GEN_FAILURE: UInt = 256u

public val DHCP_DROP_INTERNAL_ERROR: UInt = 3u

public val DHCP_DROP_INVALID: UInt = 8u

public val DHCP_DROP_NOADDRESS: UInt = 10u

public val DHCP_DROP_NOMEM: UInt = 2u

public val DHCP_DROP_NO_SUBNETS: UInt = 7u

public val DHCP_DROP_PAUSED: UInt = 6u

public val DHCP_DROP_PROCESSED: UInt = 11u

public val DHCP_DROP_TIMEOUT: UInt = 4u

public val DHCP_DROP_UNAUTH: UInt = 5u

public val DHCP_DROP_WRONG_SERVER: UInt = 9u

public val DHCP_ENDPOINT_FLAG_CANT_MODIFY: UInt = 1u

public val DHCP_FAILOVER_DELETE_SCOPES: UInt = 1u

public val DHCP_FAILOVER_MAX_NUM_ADD_SCOPES: UInt = 400u

public val DHCP_FAILOVER_MAX_NUM_REL: UInt = 31u

public val DHCP_FLAGS_DONT_ACCESS_DS: UInt = 1u

public val DHCP_FLAGS_DONT_DO_RPC: UInt = 2u

public val DHCP_FLAGS_OPTION_IS_VENDOR: UInt = 3u

public val DHCP_GIVE_ADDRESS_NEW: UInt = 805306369u

public val DHCP_GIVE_ADDRESS_OLD: UInt = 805306370u

public val DHCP_MAX_DELAY: UInt = 1000u

public val DHCP_MIN_DELAY: UInt = 0u

public val DHCP_OPT_ENUM_IGNORE_VENDOR: UInt = 1u

public val DHCP_OPT_ENUM_USE_CLASSNAME: UInt = 2u

public val DHCP_PROB_CONFLICT: UInt = 536870913u

public val DHCP_PROB_DECLINE: UInt = 536870914u

public val DHCP_PROB_NACKED: UInt = 536870916u

public val DHCP_PROB_RELEASE: UInt = 536870915u

public val DHCP_SEND_PACKET: UInt = 268435456u

public val DHCP_SUBNET_INFO_VQ_FLAG_QUARANTINE: UInt = 1u

public val DNS_FLAG_CLEANUP_EXPIRED: UInt = 4u

public val DNS_FLAG_DISABLE_PTR_UPDATE: UInt = 64u

public val DNS_FLAG_ENABLED: UInt = 1u

public val DNS_FLAG_HAS_DNS_SUFFIX: UInt = 128u

public val DNS_FLAG_UPDATE_BOTH_ALWAYS: UInt = 16u

public val DNS_FLAG_UPDATE_DHCID: UInt = 32u

public val DNS_FLAG_UPDATE_DOWNLEVEL: UInt = 2u

public val DROPPACKET: QuarantineStatus = 2

public val DENY: DhcpFilterListType = 0

public val DHCP_ARRAY_TYPE_OPTION: DhcpOptionType = 1

public val DHCP_ATTR_FQDN: DhcpPolAttrType = 3

public val DHCP_ATTR_FQDN_SINGLE_LABEL: DhcpPolAttrType = 4

public val DHCP_ATTR_HW_ADDR: DhcpPolAttrType = 0

public val DHCP_ATTR_OPTION: DhcpPolAttrType = 1

public val DHCP_ATTR_SUB_OPTION: DhcpPolAttrType = 2

public val DHCP_BINARY_DATA_OPTION: DhcpOptionDataType = 6

public val DHCP_BYTE_OPTION: DhcpOptionDataType = 0

public val DHCP_CLIENT_HARDWARE_ADDRESS: DhcpSearchInfoType = 1

public val DHCP_CLIENT_IP_ADDRESS: DhcpSearchInfoType = 0

public val DHCP_CLIENT_NAME: DhcpSearchInfoType = 2

public val DHCP_COMP_BEGINS_WITH: DhcpPolComparator = 2

public val DHCP_COMP_ENDS_WITH: DhcpPolComparator = 4

public val DHCP_COMP_EQUAL: DhcpPolComparator = 0

public val DHCP_COMP_NOT_BEGIN_WITH: DhcpPolComparator = 3

public val DHCP_COMP_NOT_END_WITH: DhcpPolComparator = 5

public val DHCP_COMP_NOT_EQUAL: DhcpPolComparator = 1

public val DHCP_D_WORD_D_WORD_OPTION: DhcpOptionDataType = 3

public val DHCP_D_WORD_OPTION: DhcpOptionDataType = 2

public val DHCP_DATABASE_FIX: DhcpScanFlag = 1

public val DHCP_DEFAULT_OPTIONS: DhcpOptionScopeType = 0

public val DHCP_DEFAULT_OPTIONS6: DhcpOptionScopeType6 = 0

public val DHCP_ENCAPSULATED_DATA_OPTION: DhcpOptionDataType = 7

public val DHCP_EXCLUDED_IP_RANGES: DhcpSubnetElementType = 3

public val DHCP_FAILOVER_FORCE: DhcpForceFlag = 2

public val DHCP_FULL_FORCE: DhcpForceFlag = 0

public val DHCP_GLOBAL_OPTIONS: DhcpOptionScopeType = 1

public val DHCP_GLOBAL_OPTIONS6: DhcpOptionScopeType6 = 3

public val DHCP_IP_ADDRESS_OPTION: DhcpOptionDataType = 4

public val DHCP_IP_RANGES: DhcpSubnetElementType = 0

public val DHCP_IP_RANGES_BOOTP_ONLY: DhcpSubnetElementType = 7

public val DHCP_IP_RANGES_DHCP_BOOTP: DhcpSubnetElementType = 6

public val DHCP_IP_RANGES_DHCP_ONLY: DhcpSubnetElementType = 5

public val DHCP_IP_USED_CLUSTERS: DhcpSubnetElementType = 4

public val DHCP_IPV6ADDRESS_OPTION: DhcpOptionDataType = 8

public val DHCP_LOGICAL_AND: DhcpPolLogicOper = 1

public val DHCP_LOGICAL_OR: DhcpPolLogicOper = 0

public val DHCP_M_SCOPE_OPTIONS: DhcpOptionScopeType = 4

public val DHCP_NO_FORCE: DhcpForceFlag = 1

public val DHCP_PROP_ID_CLIENT_ADDRESS_STATE_EX: DhcpPropertyId = 1

public val DHCP_PROP_ID_POLICY_DNS_SUFFIX: DhcpPropertyId = 0

public val DHCP_PROP_TYPE_BINARY: DhcpPropertyType = 4

public val DHCP_PROP_TYPE_BYTE: DhcpPropertyType = 0

public val DHCP_PROP_TYPE_DWORD: DhcpPropertyType = 2

public val DHCP_PROP_TYPE_STRING: DhcpPropertyType = 3

public val DHCP_PROP_TYPE_WORD: DhcpPropertyType = 1

public val DHCP_REGISTRY_FIX: DhcpScanFlag = 0

public val DHCP_RESERVED_IPS: DhcpSubnetElementType = 2

public val DHCP_RESERVED_OPTIONS: DhcpOptionScopeType = 3

public val DHCP_RESERVED_OPTIONS6: DhcpOptionScopeType6 = 2

public val DHCP_SCOPE_OPTIONS6: DhcpOptionScopeType6 = 1

public val DHCP_SECONDARY_HOSTS: DhcpSubnetElementType = 1

public val DHCP_STATELESS_PURGE_INTERVAL: Dhcpv6StatelessParamType = 1

public val DHCP_STATELESS_STATUS: Dhcpv6StatelessParamType = 2

public val DHCP_STRING_DATA_OPTION: DhcpOptionDataType = 5

public val DHCP_SUBNET_DISABLED: DhcpSubnetState = 1

public val DHCP_SUBNET_DISABLED_SWITCHED: DhcpSubnetState = 3

public val DHCP_SUBNET_ENABLED: DhcpSubnetState = 0

public val DHCP_SUBNET_ENABLED_SWITCHED: DhcpSubnetState = 2

public val DHCP_SUBNET_INVALID_STATE: DhcpSubnetState = 4

public val DHCP_SUBNET_OPTIONS: DhcpOptionScopeType = 2

public val DHCP_UNARY_ELEMENT_TYPE_OPTION: DhcpOptionType = 0

public val DHCP_UPDATE_POLICY_DESCR: DhcpPolicyFieldsToUpdate = 16

public val DHCP_UPDATE_POLICY_DNS_SUFFIX: DhcpPolicyFieldsToUpdate = 64

public val DHCP_UPDATE_POLICY_EXPR: DhcpPolicyFieldsToUpdate = 4

public val DHCP_UPDATE_POLICY_NAME: DhcpPolicyFieldsToUpdate = 1

public val DHCP_UPDATE_POLICY_ORDER: DhcpPolicyFieldsToUpdate = 2

public val DHCP_UPDATE_POLICY_RANGES: DhcpPolicyFieldsToUpdate = 8

public val DHCP_UPDATE_POLICY_STATUS: DhcpPolicyFieldsToUpdate = 32

public val DHCP_WORD_OPTION: DhcpOptionDataType = 1

public val DHCPV6CLIENT_DUID: DhcpSearchInfoTypeV6 = 1

public val DHCPV6CLIENT_IP_ADDRESS: DhcpSearchInfoTypeV6 = 0

public val DHCPV6CLIENT_NAME: DhcpSearchInfoTypeV6 = 2

public val DHCPV6EXCLUDED_IP_RANGES: DhcpSubnetElementTypeV6 = 2

public val DHCPV6IP_RANGES: DhcpSubnetElementTypeV6 = 0

public val DHCPV6RESERVED_IPS: DhcpSubnetElementTypeV6 = 1

public val ERROR_DDS_CLASS_DOES_NOT_EXIST: UInt = 20078u

public val ERROR_DDS_CLASS_EXISTS: UInt = 20077u

public val ERROR_DDS_DHCP_SERVER_NOT_FOUND: UInt = 20074u

public val ERROR_DDS_NO_DHCP_ROOT: UInt = 20071u

public val ERROR_DDS_NO_DS_AVAILABLE: UInt = 20070u

public val ERROR_DDS_OPTION_ALREADY_EXISTS: UInt = 20075u

public val ERROR_DDS_OPTION_DOES_NOT_EXIST: UInt = 20076u

public val ERROR_DDS_POSSIBLE_RANGE_CONFLICT: UInt = 20087u

public val ERROR_DDS_RANGE_DOES_NOT_EXIST: UInt = 20088u

public val ERROR_DDS_RESERVATION_CONFLICT: UInt = 20086u

public val ERROR_DDS_RESERVATION_NOT_PRESENT: UInt = 20085u

public val ERROR_DDS_SERVER_ADDRESS_MISMATCH: UInt = 20081u

public val ERROR_DDS_SERVER_ALREADY_EXISTS: UInt = 20079u

public val ERROR_DDS_SERVER_DOES_NOT_EXIST: UInt = 20080u

public val ERROR_DDS_SUBNET_EXISTS: UInt = 20082u

public val ERROR_DDS_SUBNET_HAS_DIFF_SSCOPE: UInt = 20083u

public val ERROR_DDS_SUBNET_NOT_PRESENT: UInt = 20084u

public val ERROR_DDS_TOO_MANY_ERRORS: UInt = 20073u

public val ERROR_DDS_UNEXPECTED_ERROR: UInt = 20072u

public val ERROR_DHCP_ADDRESS_NOT_AVAILABLE: UInt = 20011u

public val ERROR_DHCP_CANNOT_MODIFY_BINDINGS: UInt = 20051u

public val ERROR_DHCP_CANT_CHANGE_ATTRIBUTE: UInt = 20048u

public val ERROR_DHCP_CLASS_ALREADY_EXISTS: UInt = 20045u

public val ERROR_DHCP_CLASS_NOT_FOUND: UInt = 20044u

public val ERROR_DHCP_CLIENT_EXISTS: UInt = 20014u

public val ERROR_DHCP_DATABASE_INIT_FAILED: UInt = 20001u

public val ERROR_DHCP_DEFAULT_SCOPE_EXITS: UInt = 20047u

public val ERROR_DHCP_DELETE_BUILTIN_CLASS: UInt = 20089u

public val ERROR_DHCP_ELEMENT_CANT_REMOVE: UInt = 20007u

public val ERROR_DHCP_EXEMPTION_EXISTS: UInt = 20055u

public val ERROR_DHCP_EXEMPTION_NOT_PRESENT: UInt = 20056u

public val ERROR_DHCP_FO_ADDSCOPE_LEASES_NOT_SYNCED: UInt = 20127u

public val ERROR_DHCP_FO_BOOT_NOT_SUPPORTED: UInt = 20131u

public val ERROR_DHCP_FO_FEATURE_NOT_SUPPORTED: UInt = 20134u

public val ERROR_DHCP_FO_IPRANGE_TYPE_CONV_ILLEGAL: UInt = 20129u

public val ERROR_DHCP_FO_MAX_ADD_SCOPES: UInt = 20130u

public val ERROR_DHCP_FO_MAX_RELATIONSHIPS: UInt = 20128u

public val ERROR_DHCP_FO_NOT_SUPPORTED: UInt = 20118u

public val ERROR_DHCP_FO_RANGE_PART_OF_REL: UInt = 20132u

public val ERROR_DHCP_FO_RELATIONSHIP_DOES_NOT_EXIST: UInt = 20115u

public val ERROR_DHCP_FO_RELATIONSHIP_EXISTS: UInt = 20114u

public val ERROR_DHCP_FO_RELATIONSHIP_NAME_TOO_LONG: UInt = 20125u

public val ERROR_DHCP_FO_RELATION_IS_SECONDARY: UInt = 20117u

public val ERROR_DHCP_FO_SCOPE_ALREADY_IN_RELATIONSHIP: UInt = 20113u

public val ERROR_DHCP_FO_SCOPE_NOT_IN_RELATIONSHIP: UInt = 20116u

public val ERROR_DHCP_FO_SCOPE_SYNC_IN_PROGRESS: UInt = 20133u

public val ERROR_DHCP_FO_STATE_NOT_NORMAL: UInt = 20120u

public val ERROR_DHCP_FO_TIME_OUT_OF_SYNC: UInt = 20119u

public val ERROR_DHCP_HARDWARE_ADDRESS_TYPE_ALREADY_EXEMPT: UInt = 20101u

public val ERROR_DHCP_INVALID_DELAY: UInt = 20092u

public val ERROR_DHCP_INVALID_DHCP_CLIENT: UInt = 20016u

public val ERROR_DHCP_INVALID_DHCP_MESSAGE: UInt = 20015u

public val ERROR_DHCP_INVALID_PARAMETER_OPTION32: UInt = 20057u

public val ERROR_DHCP_INVALID_POLICY_EXPRESSION: UInt = 20109u

public val ERROR_DHCP_INVALID_PROCESSING_ORDER: UInt = 20110u

public val ERROR_DHCP_INVALID_RANGE: UInt = 20023u

public val ERROR_DHCP_INVALID_SUBNET_PREFIX: UInt = 20091u

public val ERROR_DHCP_IPRANGE_CONV_ILLEGAL: UInt = 20049u

public val ERROR_DHCP_IPRANGE_EXITS: UInt = 20021u

public val ERROR_DHCP_IP_ADDRESS_IN_USE: UInt = 20032u

public val ERROR_DHCP_JET97_CONV_REQUIRED: UInt = 20036u

public val ERROR_DHCP_JET_CONV_REQUIRED: UInt = 20027u

public val ERROR_DHCP_JET_ERROR: UInt = 20013u

public val ERROR_DHCP_LINKLAYER_ADDRESS_DOES_NOT_EXIST: UInt = 20095u

public val ERROR_DHCP_LINKLAYER_ADDRESS_EXISTS: UInt = 20093u

public val ERROR_DHCP_LINKLAYER_ADDRESS_RESERVATION_EXISTS: UInt = 20094u

public val ERROR_DHCP_LOG_FILE_PATH_TOO_LONG: UInt = 20033u

public val ERROR_DHCP_MSCOPE_EXISTS: UInt = 20053u

public val ERROR_DHCP_NAP_NOT_SUPPORTED: UInt = 20138u

public val ERROR_DHCP_NETWORK_CHANGED: UInt = 20050u

public val ERROR_DHCP_NETWORK_INIT_FAILED: UInt = 20003u

public val ERROR_DHCP_NOT_RESERVED_CLIENT: UInt = 20018u

public val ERROR_DHCP_NO_ADMIN_PERMISSION: UInt = 20121u

public val ERROR_DHCP_OPTION_EXITS: UInt = 20009u

public val ERROR_DHCP_OPTION_NOT_PRESENT: UInt = 20010u

public val ERROR_DHCP_OPTION_TYPE_MISMATCH: UInt = 20103u

public val ERROR_DHCP_POLICY_BAD_PARENT_EXPR: UInt = 20104u

public val ERROR_DHCP_POLICY_EDIT_FQDN_UNSUPPORTED: UInt = 20137u

public val ERROR_DHCP_POLICY_EXISTS: UInt = 20105u

public val ERROR_DHCP_POLICY_FQDN_OPTION_UNSUPPORTED: UInt = 20136u

public val ERROR_DHCP_POLICY_FQDN_RANGE_UNSUPPORTED: UInt = 20135u

public val ERROR_DHCP_POLICY_NOT_FOUND: UInt = 20111u

public val ERROR_DHCP_POLICY_RANGE_BAD: UInt = 20107u

public val ERROR_DHCP_POLICY_RANGE_EXISTS: UInt = 20106u

public val ERROR_DHCP_PRIMARY_NOT_FOUND: UInt = 20006u

public val ERROR_DHCP_RANGE_EXTENDED: UInt = 20024u

public val ERROR_DHCP_RANGE_FULL: UInt = 20012u

public val ERROR_DHCP_RANGE_INVALID_IN_SERVER_POLICY: UInt = 20108u

public val ERROR_DHCP_RANGE_TOO_SMALL: UInt = 20020u

public val ERROR_DHCP_REACHED_END_OF_SELECTION: UInt = 20126u

public val ERROR_DHCP_REGISTRY_INIT_FAILED: UInt = 20000u

public val ERROR_DHCP_RESERVEDIP_EXITS: UInt = 20022u

public val ERROR_DHCP_RESERVED_CLIENT: UInt = 20019u

public val ERROR_DHCP_ROGUE_DS_CONFLICT: UInt = 20041u

public val ERROR_DHCP_ROGUE_DS_UNREACHABLE: UInt = 20040u

public val ERROR_DHCP_ROGUE_INIT_FAILED: UInt = 20037u

public val ERROR_DHCP_ROGUE_NOT_AUTHORIZED: UInt = 20039u

public val ERROR_DHCP_ROGUE_NOT_OUR_ENTERPRISE: UInt = 20042u

public val ERROR_DHCP_ROGUE_SAMSHUTDOWN: UInt = 20038u

public val ERROR_DHCP_ROGUE_STANDALONE_IN_DS: UInt = 20043u

public val ERROR_DHCP_RPC_INIT_FAILED: UInt = 20002u

public val ERROR_DHCP_SCOPE_NAME_TOO_LONG: UInt = 20046u

public val ERROR_DHCP_SERVER_NAME_NOT_RESOLVED: UInt = 20124u

public val ERROR_DHCP_SERVER_NOT_REACHABLE: UInt = 20122u

public val ERROR_DHCP_SERVER_NOT_RUNNING: UInt = 20123u

public val ERROR_DHCP_SERVICE_PAUSED: UInt = 20017u

public val ERROR_DHCP_SUBNET_EXISTS: UInt = 20052u

public val ERROR_DHCP_SUBNET_EXITS: UInt = 20004u

public val ERROR_DHCP_SUBNET_NOT_PRESENT: UInt = 20005u

public val ERROR_DHCP_SUPER_SCOPE_NAME_TOO_LONG: UInt = 20030u

public val ERROR_DHCP_UNDEFINED_HARDWARE_ADDRESS_TYPE: UInt = 20102u

public val ERROR_DHCP_UNSUPPORTED_CLIENT: UInt = 20034u

public val ERROR_EXTEND_TOO_SMALL: UInt = 20025u

public val ERROR_LAST_DHCP_SERVER_ERROR: UInt = 20139u

public val ERROR_MSCOPE_RANGE_TOO_SMALL: UInt = 20054u

public val ERROR_SCOPE_RANGE_POLICY_RANGE_CONFLICT: UInt = 20112u

public val ERROR_SERVER_INVALID_BOOT_FILE_TABLE: UInt = 20028u

public val ERROR_SERVER_UNKNOWN_BOOT_FILE_NAME: UInt = 20029u

public val EXEMPT: QuarantineStatus = 4

public val FILTER_STATUS_FULL_MATCH_IN_ALLOW_LIST: UInt = 2u

public val FILTER_STATUS_FULL_MATCH_IN_DENY_LIST: UInt = 4u

public val FILTER_STATUS_NONE: UInt = 1u

public val FILTER_STATUS_WILDCARD_MATCH_IN_ALLOW_LIST: UInt = 8u

public val FILTER_STATUS_WILDCARD_MATCH_IN_DENY_LIST: UInt = 16u

public val HWTYPE_ETHERNET_10MB: UInt = 1u

public val HOT_STANDBY: DhcpFailoverMode = 1

public val INIT: FsmState = 1

public val LOAD_BALANCE: DhcpFailoverMode = 0

public val MAC_ADDRESS_LENGTH: UInt = 6u

public val MAX_PATTERN_LENGTH: UInt = 255u

public val MCLT: UInt = 1u

public val MODE: UInt = 16u

public val NOQUARANTINE: QuarantineStatus = 0

public val NOQUARINFO: QuarantineStatus = 6

public val NORMAL: FsmState = 3

public val NO_STATE: FsmState = 0

public val OPTION_ALL_SUBNETS_MTU: UInt = 27u

public val OPTION_ARP_CACHE_TIMEOUT: UInt = 35u

public val OPTION_BE_A_MASK_SUPPLIER: UInt = 30u

public val OPTION_BE_A_ROUTER: UInt = 19u

public val OPTION_BOOTFILE_NAME: UInt = 67u

public val OPTION_BOOT_FILE_SIZE: UInt = 13u

public val OPTION_BROADCAST_ADDRESS: UInt = 28u

public val OPTION_CLIENT_CLASS_INFO: UInt = 60u

public val OPTION_CLIENT_ID: UInt = 61u

public val OPTION_COOKIE_SERVERS: UInt = 8u

public val OPTION_DEFAULT_TTL: UInt = 23u

public val OPTION_DOMAIN_NAME: UInt = 15u

public val OPTION_DOMAIN_NAME_SERVERS: UInt = 6u

public val OPTION_END: UInt = 255u

public val OPTION_ETHERNET_ENCAPSULATION: UInt = 36u

public val OPTION_EXTENSIONS_PATH: UInt = 18u

public val OPTION_HOST_NAME: UInt = 12u

public val OPTION_IEN116_NAME_SERVERS: UInt = 5u

public val OPTION_IMPRESS_SERVERS: UInt = 10u

public val OPTION_KEEP_ALIVE_DATA_SIZE: UInt = 39u

public val OPTION_KEEP_ALIVE_INTERVAL: UInt = 38u

public val OPTION_LEASE_TIME: UInt = 51u

public val OPTION_LOG_SERVERS: UInt = 7u

public val OPTION_LPR_SERVERS: UInt = 9u

public val OPTION_MAX_REASSEMBLY_SIZE: UInt = 22u

public val OPTION_MERIT_DUMP_FILE: UInt = 14u

public val OPTION_MESSAGE: UInt = 56u

public val OPTION_MESSAGE_LENGTH: UInt = 57u

public val OPTION_MESSAGE_TYPE: UInt = 53u

public val OPTION_MSFT_IE_PROXY: UInt = 252u

public val OPTION_MTU: UInt = 26u

public val OPTION_NETBIOS_DATAGRAM_SERVER: UInt = 45u

public val OPTION_NETBIOS_NAME_SERVER: UInt = 44u

public val OPTION_NETBIOS_NODE_TYPE: UInt = 46u

public val OPTION_NETBIOS_SCOPE_OPTION: UInt = 47u

public val OPTION_NETWORK_INFO_SERVERS: UInt = 41u

public val OPTION_NETWORK_INFO_SERVICE_DOM: UInt = 40u

public val OPTION_NETWORK_TIME_SERVERS: UInt = 42u

public val OPTION_NON_LOCAL_SOURCE_ROUTING: UInt = 20u

public val OPTION_OK_TO_OVERLAY: UInt = 52u

public val OPTION_PAD: UInt = 0u

public val OPTION_PARAMETER_REQUEST_LIST: UInt = 55u

public val OPTION_PERFORM_MASK_DISCOVERY: UInt = 29u

public val OPTION_PERFORM_ROUTER_DISCOVERY: UInt = 31u

public val OPTION_PMTU_AGING_TIMEOUT: UInt = 24u

public val OPTION_PMTU_PLATEAU_TABLE: UInt = 25u

public val OPTION_POLICY_FILTER_FOR_NLSR: UInt = 21u

public val OPTION_REBIND_TIME: UInt = 59u

public val OPTION_RENEWAL_TIME: UInt = 58u

public val OPTION_REQUESTED_ADDRESS: UInt = 50u

public val OPTION_RLP_SERVERS: UInt = 11u

public val OPTION_ROOT_DISK: UInt = 17u

public val OPTION_ROUTER_ADDRESS: UInt = 3u

public val OPTION_ROUTER_SOLICITATION_ADDR: UInt = 32u

public val OPTION_SERVER_IDENTIFIER: UInt = 54u

public val OPTION_STATIC_ROUTES: UInt = 33u

public val OPTION_SUBNET_MASK: UInt = 1u

public val OPTION_SWAP_SERVER: UInt = 16u

public val OPTION_TFTP_SERVER_NAME: UInt = 66u

public val OPTION_TIME_OFFSET: UInt = 2u

public val OPTION_TIME_SERVERS: UInt = 4u

public val OPTION_TRAILERS: UInt = 34u

public val OPTION_TTL: UInt = 37u

public val OPTION_VENDOR_SPEC_INFO: UInt = 43u

public val OPTION_XWINDOW_DISPLAY_MANAGER: UInt = 49u

public val OPTION_XWINDOW_FONT_SERVER: UInt = 48u

public val PARTNER_DOWN: FsmState = 5

public val PAUSED: FsmState = 12

public val PERCENTAGE: UInt = 8u

public val POTENTIAL_CONFLICT: FsmState = 6

public val PREVSTATE: UInt = 32u

public val PROBATION: QuarantineStatus = 3

public val PRIMARY_SERVER: DhcpFailoverServer = 0

public val QUARANTINE_CONFIG_OPTION: UInt = 43222u

public val QUARANTINE_SCOPE_QUARPROFILE_OPTION: UInt = 43221u

public val QUARANTIN_OPTION_BASE: UInt = 43220u

public val RECOVER: FsmState = 9

public val RECOVER_DONE: FsmState = 11

public val RECOVER_WAIT: FsmState = 10

public val RESOLUTION_INT: FsmState = 8

public val RESTRICTEDACCESS: QuarantineStatus = 1

public val SAFEPERIOD: UInt = 2u

public val SHAREDSECRET: UInt = 64u

public val SHUTDOWN: FsmState = 13

public val STARTUP: FsmState = 2

public val STATUS_NOPREFIX_AVAIL: StatusCode = 6

public val STATUS_NO_BINDING: StatusCode = 3

public val STATUS_NO_ERROR: StatusCode = 0

public val STATUS_UNSPECIFIED_FAILURE: StatusCode = 1

public val SECONDARY_SERVER: DhcpFailoverServer = 1

public val SET_API_PROTOCOL_SUPPORT: UInt = 1u

public val SET_AUDIT_LOG_STATE: UInt = 2048u

public val SET_BACKUP_INTERVAL: UInt = 16u

public val SET_BACKUP_PATH: UInt = 8u

public val SET_BOOT_FILE_TABLE: UInt = 1024u

public val SET_DATABASE_CLEANUP_INTERVAL: UInt = 128u

public val SET_DATABASE_LOGGING_FLAG: UInt = 32u

public val SET_DATABASE_NAME: UInt = 2u

public val SET_DATABASE_PATH: UInt = 4u

public val SET_DEBUG_FLAG: UInt = 256u

public val SET_PING_RETRIES: UInt = 512u

public val SET_PREFERRED_LIFETIME: UInt = 4u

public val SET_PREFERRED_LIFETIME_IATA: UInt = 64u

public val SET_QUARANTINE_DEF_FAIL: UInt = 8192u

public val SET_QUARANTINE_ON: UInt = 4096u

public val SET_RAPID_COMMIT_FLAG: UInt = 2u

public val SET_RESTORE_FLAG: UInt = 64u

public val SET_T1: UInt = 16u

public val SET_T2: UInt = 32u

public val SET_UNICAST_FLAG: UInt = 1u

public val SET_VALID_LIFETIME: UInt = 8u

public val SET_VALID_LIFETIME_IATA: UInt = 128u

public val V5_ADDRESS_BIT_BOTH_REC: UInt = 32u

public val V5_ADDRESS_BIT_DELETED: UInt = 128u

public val V5_ADDRESS_BIT_UNREGISTERED: UInt = 64u

public val V5_ADDRESS_EX_BIT_DISABLE_PTR_RR: UInt = 1u

public val V5_ADDRESS_STATE_ACTIVE: UInt = 1u

public val V5_ADDRESS_STATE_DECLINED: UInt = 2u

public val V5_ADDRESS_STATE_DOOM: UInt = 3u

public val V5_ADDRESS_STATE_OFFERED: UInt = 0u

public val WARNING_EXTENDED_LESS: Int = 20026
