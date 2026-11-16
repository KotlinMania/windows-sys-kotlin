package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

public val ANY_SIZE: UInt = 1u

public val BEST_IF: UInt = 20u

public val BEST_ROUTE: UInt = 21u

public val BROADCAST_NODETYPE: UInt = 1u

public val DEFAULT_MINIMUM_ENTITIES: UInt = 32u

public val DEST_LONGER: UInt = 29u

public val DEST_MATCHING: UInt = 28u

public val DEST_SHORTER: UInt = 30u

public val DNS_DDR_ADAPTER_ENABLE_DOH: UInt = 1u

public val DNS_DDR_ADAPTER_ENABLE_UDP_FALLBACK: UInt = 2u

public val DNS_DOH_AUTO_UPGRADE_SERVER: UInt = 8u

public val DNS_DOH_POLICY_AUTO: UInt = 16u

public val DNS_DOH_POLICY_DISABLE: UInt = 8u

public val DNS_DOH_POLICY_NOT_CONFIGURED: UInt = 4u

public val DNS_DOH_POLICY_REQUIRED: UInt = 32u

public val DNS_DOH_SERVER_SETTINGS_ENABLE: UInt = 2u

public val DNS_DOH_SERVER_SETTINGS_ENABLE_AUTO: UInt = 1u

public val DNS_DOH_SERVER_SETTINGS_ENABLE_DDR: UInt = 16u

public val DNS_DOH_SERVER_SETTINGS_FALLBACK_TO_UDP: UInt = 4u

public val DNS_ENABLE_DDR: UInt = 64u

public val DNS_ENABLE_DOH: UInt = 1u

public val DNS_INTERFACE_SETTINGS_VERSION1: UInt = 1u

public val DNS_INTERFACE_SETTINGS_VERSION2: UInt = 2u

public val DNS_INTERFACE_SETTINGS_VERSION3: UInt = 3u

public val DNS_INTERFACE_SETTINGS_VERSION4: UInt = 4u

public val DNS_SERVER_PROPERTY_VERSION1: UInt = 1u

public val DNS_SETTINGS_ENABLE_LLMNR: UInt = 128u

public val DNS_SETTINGS_QUERY_ADAPTER_NAME: UInt = 256u

public val DNS_SETTINGS_VERSION1: UInt = 1u

public val DNS_SETTINGS_VERSION2: UInt = 2u

public val DNS_SETTING_DDR: UInt = 32768u

public val DNS_SETTING_DISABLE_UNCONSTRAINED_QUERIES: UInt = 1024u

public val DNS_SETTING_DOH: UInt = 4096u

public val DNS_SETTING_DOH_PROFILE: UInt = 8192u

public val DNS_SETTING_DOMAIN: UInt = 32u

public val DNS_SETTING_ENCRYPTED_DNS_ADAPTER_FLAGS: UInt = 16384u

public val DNS_SETTING_HOSTNAME: UInt = 64u

public val DNS_SETTING_IPV6: UInt = 1u

public val DNS_SETTING_NAMESERVER: UInt = 2u

public val DNS_SETTING_PROFILE_NAMESERVER: UInt = 512u

public val DNS_SETTING_REGISTER_ADAPTER_NAME: UInt = 16u

public val DNS_SETTING_REGISTRATION_ENABLED: UInt = 8u

public val DNS_SETTING_SEARCHLIST: UInt = 4u

public val DNS_SETTING_SUPPLEMENTAL_SEARCH_LIST: UInt = 2048u

public val DNS_SERVER_DOH_PROPERTY: DnsServerPropertyType = 1

public val DNS_SERVER_INVALID_PROPERTY: DnsServerPropertyType = 0

public val ERROR_BASE: UInt = 23000u

public val ERROR_IPV6_NOT_IMPLEMENTED: UInt = 23003u

public val FD_FLAGS_ALLFLAGS: UInt = 1u

public val FD_FLAGS_NOSYN: UInt = 1u

public val FILTER_ICMP_CODE_ANY: UByte = 255u.toUByte()

public val FILTER_ICMP_TYPE_ANY: UByte = 255u.toUByte()

public val GAA_FLAG_INCLUDE_ALL_COMPARTMENTS: GetAdaptersAddressesFlags = 512u

public val GAA_FLAG_INCLUDE_ALL_INTERFACES: GetAdaptersAddressesFlags = 256u

public val GAA_FLAG_INCLUDE_GATEWAYS: GetAdaptersAddressesFlags = 128u

public val GAA_FLAG_INCLUDE_PREFIX: GetAdaptersAddressesFlags = 16u

public val GAA_FLAG_INCLUDE_TUNNEL_BINDINGORDER: GetAdaptersAddressesFlags = 1024u

public val GAA_FLAG_INCLUDE_WINS_INFO: GetAdaptersAddressesFlags = 64u

public val GAA_FLAG_SKIP_ANYCAST: GetAdaptersAddressesFlags = 2u

public val GAA_FLAG_SKIP_DNS_INFO: UInt = 2048u

public val GAA_FLAG_SKIP_DNS_SERVER: GetAdaptersAddressesFlags = 8u

public val GAA_FLAG_SKIP_FRIENDLY_NAME: GetAdaptersAddressesFlags = 32u

public val GAA_FLAG_SKIP_MULTICAST: GetAdaptersAddressesFlags = 4u

public val GAA_FLAG_SKIP_UNICAST: GetAdaptersAddressesFlags = 1u

public val GF_FRAGCACHE: GlobalFilter = 9

public val GF_FRAGMENTS: GlobalFilter = 2

public val GF_STRONGHOST: GlobalFilter = 8

public val HYBRID_NODETYPE: UInt = 8u

public val ICMP4_DST_UNREACH: Icmp4Type = 3

public val ICMP4_ECHO_REPLY: Icmp4Type = 0

public val ICMP4_ECHO_REQUEST: Icmp4Type = 8

public val ICMP4_MASK_REPLY: Icmp4Type = 18

public val ICMP4_MASK_REQUEST: Icmp4Type = 17

public val ICMP4_PARAM_PROB: Icmp4Type = 12

public val ICMP4_REDIRECT: Icmp4Type = 5

public val ICMP4_ROUTER_ADVERT: Icmp4Type = 9

public val ICMP4_ROUTER_SOLICIT: Icmp4Type = 10

public val ICMP4_SOURCE_QUENCH: Icmp4Type = 4

public val ICMP4_TIMESTAMP_REPLY: Icmp4Type = 14

public val ICMP4_TIMESTAMP_REQUEST: Icmp4Type = 13

public val ICMP4_TIME_EXCEEDED: Icmp4Type = 11

public val ICMP6_DST_UNREACH: Icmp6Type = 1

public val ICMP6_ECHO_REPLY: Icmp6Type = 129

public val ICMP6_ECHO_REQUEST: Icmp6Type = 128

public val ICMP6_INFOMSG_MASK: UInt = 128u

public val ICMP6_MEMBERSHIP_QUERY: Icmp6Type = 130

public val ICMP6_MEMBERSHIP_REDUCTION: Icmp6Type = 132

public val ICMP6_MEMBERSHIP_REPORT: Icmp6Type = 131

public val ICMP6_PACKET_TOO_BIG: Icmp6Type = 2

public val ICMP6_PARAM_PROB: Icmp6Type = 4

public val ICMP6_TIME_EXCEEDED: Icmp6Type = 3

public val ICMP6_V2_MEMBERSHIP_REPORT: Icmp6Type = 143

public val ICMP_STATS: UInt = 11u

public val IF_ACCESS_BROADCAST: IfAccessType = 2

public val IF_ACCESS_LOOPBACK: IfAccessType = 1

public val IF_ACCESS_POINTTOMULTIPOINT: IfAccessType = 4

public val IF_ACCESS_POINTTOPOINT: IfAccessType = 3

public val IF_ACCESS_POINT_TO_MULTI_POINT: IfAccessType = 4

public val IF_ACCESS_POINT_TO_POINT: IfAccessType = 3

public val IF_ADMIN_STATUS_DOWN: UInt = 2u

public val IF_ADMIN_STATUS_TESTING: UInt = 3u

public val IF_ADMIN_STATUS_UP: UInt = 1u

public val IF_CHECK_MCAST: UInt = 1u

public val IF_CHECK_NONE: UInt = 0u

public val IF_CHECK_SEND: UInt = 2u

public val IF_CONNECTION_DEDICATED: UInt = 1u

public val IF_CONNECTION_DEMAND: UInt = 3u

public val IF_CONNECTION_PASSIVE: UInt = 2u

public val IF_NUMBER: UInt = 0u

public val IF_OPER_STATUS_CONNECTED: InternalIfOperStatus = 4

public val IF_OPER_STATUS_CONNECTING: InternalIfOperStatus = 3

public val IF_OPER_STATUS_DISCONNECTED: InternalIfOperStatus = 2

public val IF_OPER_STATUS_NON_OPERATIONAL: InternalIfOperStatus = 0

public val IF_OPER_STATUS_OPERATIONAL: InternalIfOperStatus = 5

public val IF_OPER_STATUS_UNREACHABLE: InternalIfOperStatus = 1

public val IF_ROW: UInt = 2u

public val IF_STATUS: UInt = 25u

public val IF_TABLE: UInt = 1u

public val IF_TYPE_A12MPPSWITCH: UInt = 130u

public val IF_TYPE_AAL2: UInt = 187u

public val IF_TYPE_AAL5: UInt = 49u

public val IF_TYPE_ADSL: UInt = 94u

public val IF_TYPE_AFLANE_8023: UInt = 59u

public val IF_TYPE_AFLANE_8025: UInt = 60u

public val IF_TYPE_ARAP: UInt = 88u

public val IF_TYPE_ARCNET: UInt = 35u

public val IF_TYPE_ARCNET_PLUS: UInt = 36u

public val IF_TYPE_ASYNC: UInt = 84u

public val IF_TYPE_ATM: UInt = 37u

public val IF_TYPE_ATM_DXI: UInt = 105u

public val IF_TYPE_ATM_FUNI: UInt = 106u

public val IF_TYPE_ATM_IMA: UInt = 107u

public val IF_TYPE_ATM_LOGICAL: UInt = 80u

public val IF_TYPE_ATM_RADIO: UInt = 189u

public val IF_TYPE_ATM_SUBINTERFACE: UInt = 134u

public val IF_TYPE_ATM_VCI_ENDPT: UInt = 194u

public val IF_TYPE_ATM_VIRTUAL: UInt = 149u

public val IF_TYPE_BASIC_ISDN: UInt = 20u

public val IF_TYPE_BGP_POLICY_ACCOUNTING: UInt = 162u

public val IF_TYPE_BSC: UInt = 83u

public val IF_TYPE_CCTEMUL: UInt = 61u

public val IF_TYPE_CES: UInt = 133u

public val IF_TYPE_CHANNEL: UInt = 70u

public val IF_TYPE_CNR: UInt = 85u

public val IF_TYPE_COFFEE: UInt = 132u

public val IF_TYPE_COMPOSITELINK: UInt = 155u

public val IF_TYPE_DCN: UInt = 141u

public val IF_TYPE_DDN_X25: UInt = 4u

public val IF_TYPE_DIGITALPOWERLINE: UInt = 138u

public val IF_TYPE_DIGITAL_WRAPPER_OVERHEAD_CHANNEL: UInt = 186u

public val IF_TYPE_DLSW: UInt = 74u

public val IF_TYPE_DOCSCABLE_DOWNSTREAM: UInt = 128u

public val IF_TYPE_DOCSCABLE_MACLAYER: UInt = 127u

public val IF_TYPE_DOCSCABLE_UPSTREAM: UInt = 129u

public val IF_TYPE_DS0: UInt = 81u

public val IF_TYPE_DS0_BUNDLE: UInt = 82u

public val IF_TYPE_DS1: UInt = 18u

public val IF_TYPE_DS1_FDL: UInt = 170u

public val IF_TYPE_DS3: UInt = 30u

public val IF_TYPE_DTM: UInt = 140u

public val IF_TYPE_DVBRCC_DOWNSTREAM: UInt = 147u

public val IF_TYPE_DVBRCC_MACLAYER: UInt = 146u

public val IF_TYPE_DVBRCC_UPSTREAM: UInt = 148u

public val IF_TYPE_DVB_ASI_IN: UInt = 172u

public val IF_TYPE_DVB_ASI_OUT: UInt = 173u

public val IF_TYPE_E1: UInt = 19u

public val IF_TYPE_EON: UInt = 25u

public val IF_TYPE_EPLRS: UInt = 87u

public val IF_TYPE_ESCON: UInt = 73u

public val IF_TYPE_ETHERNET_3MBIT: UInt = 26u

public val IF_TYPE_ETHERNET_CSMACD: UInt = 6u

public val IF_TYPE_FAST: UInt = 125u

public val IF_TYPE_FASTETHER: UInt = 62u

public val IF_TYPE_FASTETHER_FX: UInt = 69u

public val IF_TYPE_FDDI: UInt = 15u

public val IF_TYPE_FIBRECHANNEL: UInt = 56u

public val IF_TYPE_FRAMERELAY: UInt = 32u

public val IF_TYPE_FRAMERELAY_INTERCONNECT: UInt = 58u

public val IF_TYPE_FRAMERELAY_MPI: UInt = 92u

public val IF_TYPE_FRAMERELAY_SERVICE: UInt = 44u

public val IF_TYPE_FRF16_MFR_BUNDLE: UInt = 163u

public val IF_TYPE_FR_DLCI_ENDPT: UInt = 193u

public val IF_TYPE_FR_FORWARD: UInt = 158u

public val IF_TYPE_G703_2MB: UInt = 67u

public val IF_TYPE_G703_64K: UInt = 66u

public val IF_TYPE_GIGABITETHERNET: UInt = 117u

public val IF_TYPE_GR303_IDT: UInt = 178u

public val IF_TYPE_GR303_RDT: UInt = 177u

public val IF_TYPE_H323_GATEKEEPER: UInt = 164u

public val IF_TYPE_H323_PROXY: UInt = 165u

public val IF_TYPE_HDH_1822: UInt = 3u

public val IF_TYPE_HDLC: UInt = 118u

public val IF_TYPE_HDSL2: UInt = 168u

public val IF_TYPE_HIPERLAN2: UInt = 183u

public val IF_TYPE_HIPPI: UInt = 47u

public val IF_TYPE_HIPPIINTERFACE: UInt = 57u

public val IF_TYPE_HOSTPAD: UInt = 90u

public val IF_TYPE_HSSI: UInt = 46u

public val IF_TYPE_HYPERCHANNEL: UInt = 14u

public val IF_TYPE_IBM370PARCHAN: UInt = 72u

public val IF_TYPE_IDSL: UInt = 154u

public val IF_TYPE_IEEE1394: UInt = 144u

public val IF_TYPE_IEEE80211: UInt = 71u

public val IF_TYPE_IEEE80212: UInt = 55u

public val IF_TYPE_IEEE802154: UInt = 259u

public val IF_TYPE_IEEE80216_WMAN: UInt = 237u

public val IF_TYPE_IEEE8023AD_LAG: UInt = 161u

public val IF_TYPE_IF_GSN: UInt = 145u

public val IF_TYPE_IMT: UInt = 190u

public val IF_TYPE_INTERLEAVE: UInt = 124u

public val IF_TYPE_IP: UInt = 126u

public val IF_TYPE_IPFORWARD: UInt = 142u

public val IF_TYPE_IPOVER_ATM: UInt = 114u

public val IF_TYPE_IPOVER_CDLC: UInt = 109u

public val IF_TYPE_IPOVER_CLAW: UInt = 110u

public val IF_TYPE_IPSWITCH: UInt = 78u

public val IF_TYPE_IS088023_CSMACD: UInt = 7u

public val IF_TYPE_ISDN: UInt = 63u

public val IF_TYPE_ISDN_S: UInt = 75u

public val IF_TYPE_ISDN_U: UInt = 76u

public val IF_TYPE_ISO88022_LLC: UInt = 41u

public val IF_TYPE_ISO88024_TOKENBUS: UInt = 8u

public val IF_TYPE_ISO88025R_DTR: UInt = 86u

public val IF_TYPE_ISO88025_CRFPRINT: UInt = 98u

public val IF_TYPE_ISO88025_FIBER: UInt = 115u

public val IF_TYPE_ISO88025_TOKENRING: UInt = 9u

public val IF_TYPE_ISO88026_MAN: UInt = 10u

public val IF_TYPE_ISUP: UInt = 179u

public val IF_TYPE_L2_VLAN: UInt = 135u

public val IF_TYPE_L3_IPVLAN: UInt = 136u

public val IF_TYPE_L3_IPXVLAN: UInt = 137u

public val IF_TYPE_LAP_B: UInt = 16u

public val IF_TYPE_LAP_D: UInt = 77u

public val IF_TYPE_LAP_F: UInt = 119u

public val IF_TYPE_LOCALTALK: UInt = 42u

public val IF_TYPE_MEDIAMAILOVERIP: UInt = 139u

public val IF_TYPE_MF_SIGLINK: UInt = 167u

public val IF_TYPE_MIO_X25: UInt = 38u

public val IF_TYPE_MODEM: UInt = 48u

public val IF_TYPE_MPC: UInt = 113u

public val IF_TYPE_MPLS: UInt = 166u

public val IF_TYPE_MPLS_TUNNEL: UInt = 150u

public val IF_TYPE_MSDSL: UInt = 143u

public val IF_TYPE_MVL: UInt = 191u

public val IF_TYPE_MYRINET: UInt = 99u

public val IF_TYPE_NFAS: UInt = 175u

public val IF_TYPE_NSIP: UInt = 27u

public val IF_TYPE_OPTICAL_CHANNEL: UInt = 195u

public val IF_TYPE_OPTICAL_TRANSPORT: UInt = 196u

public val IF_TYPE_OTHER: UInt = 1u

public val IF_TYPE_PARA: UInt = 34u

public val IF_TYPE_PLC: UInt = 174u

public val IF_TYPE_POS: UInt = 171u

public val IF_TYPE_PPP: UInt = 23u

public val IF_TYPE_PPPMULTILINKBUNDLE: UInt = 108u

public val IF_TYPE_PRIMARY_ISDN: UInt = 21u

public val IF_TYPE_PROP_BWA_P2MP: UInt = 184u

public val IF_TYPE_PROP_CNLS: UInt = 89u

public val IF_TYPE_PROP_DOCS_WIRELESS_DOWNSTREAM: UInt = 181u

public val IF_TYPE_PROP_DOCS_WIRELESS_MACLAYER: UInt = 180u

public val IF_TYPE_PROP_DOCS_WIRELESS_UPSTREAM: UInt = 182u

public val IF_TYPE_PROP_MULTIPLEXOR: UInt = 54u

public val IF_TYPE_PROP_POINT2POINT_SERIAL: UInt = 22u

public val IF_TYPE_PROP_VIRTUAL: UInt = 53u

public val IF_TYPE_PROP_WIRELESS_P2P: UInt = 157u

public val IF_TYPE_PROTEON_10MBIT: UInt = 12u

public val IF_TYPE_PROTEON_80MBIT: UInt = 13u

public val IF_TYPE_QLLC: UInt = 68u

public val IF_TYPE_RADIO_MAC: UInt = 188u

public val IF_TYPE_RADSL: UInt = 95u

public val IF_TYPE_REACH_DSL: UInt = 192u

public val IF_TYPE_REGULAR_1822: UInt = 2u

public val IF_TYPE_RFC1483: UInt = 159u

public val IF_TYPE_RFC877_X25: UInt = 5u

public val IF_TYPE_RS232: UInt = 33u

public val IF_TYPE_RSRB: UInt = 79u

public val IF_TYPE_SDLC: UInt = 17u

public val IF_TYPE_SDSL: UInt = 96u

public val IF_TYPE_SHDSL: UInt = 169u

public val IF_TYPE_SIP: UInt = 31u

public val IF_TYPE_SLIP: UInt = 28u

public val IF_TYPE_SMDS_DXI: UInt = 43u

public val IF_TYPE_SMDS_ICIP: UInt = 52u

public val IF_TYPE_SOFTWARE_LOOPBACK: UInt = 24u

public val IF_TYPE_SONET: UInt = 39u

public val IF_TYPE_SONET_OVERHEAD_CHANNEL: UInt = 185u

public val IF_TYPE_SONET_PATH: UInt = 50u

public val IF_TYPE_SONET_VT: UInt = 51u

public val IF_TYPE_SRP: UInt = 151u

public val IF_TYPE_SS7_SIGLINK: UInt = 156u

public val IF_TYPE_STACKTOSTACK: UInt = 111u

public val IF_TYPE_STARLAN: UInt = 11u

public val IF_TYPE_TDLC: UInt = 116u

public val IF_TYPE_TERMPAD: UInt = 91u

public val IF_TYPE_TR008: UInt = 176u

public val IF_TYPE_TRANSPHDLC: UInt = 123u

public val IF_TYPE_TUNNEL: UInt = 131u

public val IF_TYPE_ULTRA: UInt = 29u

public val IF_TYPE_USB: UInt = 160u

public val IF_TYPE_V11: UInt = 64u

public val IF_TYPE_V35: UInt = 45u

public val IF_TYPE_V36: UInt = 65u

public val IF_TYPE_V37: UInt = 120u

public val IF_TYPE_VDSL: UInt = 97u

public val IF_TYPE_VIRTUALIPADDRESS: UInt = 112u

public val IF_TYPE_VOICEOVERATM: UInt = 152u

public val IF_TYPE_VOICEOVERFRAMERELAY: UInt = 153u

public val IF_TYPE_VOICE_EM: UInt = 100u

public val IF_TYPE_VOICE_ENCAP: UInt = 103u

public val IF_TYPE_VOICE_FXO: UInt = 101u

public val IF_TYPE_VOICE_FXS: UInt = 102u

public val IF_TYPE_VOICE_OVERIP: UInt = 104u

public val IF_TYPE_WWANPP: UInt = 243u

public val IF_TYPE_WWANPP2: UInt = 244u

public val IF_TYPE_X213: UInt = 93u

public val IF_TYPE_X25_HUNTGROUP: UInt = 122u

public val IF_TYPE_X25_MLP: UInt = 121u

public val IF_TYPE_X25_PLE: UInt = 40u

public val IF_TYPE_XBOX_WIRELESS: UInt = 281u

public val INTERFACE_HARDWARE_CROSSTIMESTAMP_VERSION_1: UInt = 1u

public val INTERFACE_TIMESTAMP_CAPABILITIES_VERSION_1: UInt = 1u

public val IOCTL_ARP_SEND_REQUEST: UInt = 103u

public val IOCTL_IP_ADDCHANGE_NOTIFY_REQUEST: UInt = 102u

public val IOCTL_IP_GET_BEST_INTERFACE: UInt = 105u

public val IOCTL_IP_INTERFACE_INFO: UInt = 104u

public val IOCTL_IP_RTCHANGE_NOTIFY_REQUEST: UInt = 101u

public val IOCTL_IP_UNIDIRECTIONAL_ADAPTER_ADDRESS: UInt = 106u

public val IP6_STATS: UInt = 36u

public val IPRTRMGR_PID: UInt = 10000u

public val IPV6_GLOBAL_INFO: UInt = 4294901775u

public val IPV6_ROUTE_INFO: UInt = 4294901776u

public val IP_ADAPTER_ADDRESS_DNS_ELIGIBLE: UInt = 1u

public val IP_ADAPTER_ADDRESS_TRANSIENT: UInt = 2u

public val IP_ADAPTER_DDNS_ENABLED: UInt = 1u

public val IP_ADAPTER_DHCP_ENABLED: UInt = 4u

public val IP_ADAPTER_IPV4_ENABLED: UInt = 128u

public val IP_ADAPTER_IPV6_ENABLED: UInt = 256u

public val IP_ADAPTER_IPV6_MANAGE_ADDRESS_CONFIG: UInt = 512u

public val IP_ADAPTER_IPV6_OTHER_STATEFUL_CONFIG: UInt = 32u

public val IP_ADAPTER_NETBIOS_OVER_TCPIP_ENABLED: UInt = 64u

public val IP_ADAPTER_NO_MULTICAST: UInt = 16u

public val IP_ADAPTER_RECEIVE_ONLY: UInt = 8u

public val IP_ADAPTER_REGISTER_ADAPTER_SUFFIX: UInt = 2u

public val IP_ADDRROW: UInt = 5u

public val IP_ADDRTABLE: UInt = 4u

public val IP_ADDR_ADDED: UInt = 11023u

public val IP_ADDR_DELETED: UInt = 11019u

public val IP_BAD_DESTINATION: UInt = 11018u

public val IP_BAD_HEADER: UInt = 11042u

public val IP_BAD_OPTION: UInt = 11007u

public val IP_BAD_REQ: UInt = 11011u

public val IP_BAD_ROUTE: UInt = 11012u

public val IP_BIND_ADAPTER: UInt = 11026u

public val IP_BUF_TOO_SMALL: UInt = 11001u

public val IP_DEMAND_DIAL_FILTER_INFO: UInt = 4294901769u

public val IP_DEMAND_DIAL_FILTER_INFO_V6: UInt = 4294901779u

public val IP_DEST_ADDR_UNREACHABLE: UInt = 11003u

public val IP_DEST_HOST_UNREACHABLE: UInt = 11003u

public val IP_DEST_NET_UNREACHABLE: UInt = 11002u

public val IP_DEST_NO_ROUTE: UInt = 11002u

public val IP_DEST_PORT_UNREACHABLE: UInt = 11005u

public val IP_DEST_PROHIBITED: UInt = 11004u

public val IP_DEST_PROT_UNREACHABLE: UInt = 11004u

public val IP_DEST_SCOPE_MISMATCH: UInt = 11045u

public val IP_DEST_UNREACHABLE: UInt = 11040u

public val IP_DEVICE_DOES_NOT_EXIST: UInt = 11028u

public val IP_DUPLICATE_ADDRESS: UInt = 11029u

public val IP_DUPLICATE_IPADD: UInt = 11034u

public val IP_EXPORT_INCLUDED: UInt = 1u

public val IP_FILTER_ENABLE_INFO: UInt = 4294901781u

public val IP_FILTER_ENABLE_INFO_V6: UInt = 4294901782u

public val IP_FLAG_DF: UInt = 2u

public val IP_FLAG_REVERSE: UInt = 1u

public val IP_FORWARDNUMBER: UInt = 6u

public val IP_FORWARDROW: UInt = 8u

public val IP_FORWARDTABLE: UInt = 7u

public val IP_GENERAL_FAILURE: UInt = 11050u

public val IP_GENERAL_INFO_BASE: UInt = 4294901760u

public val IP_GLOBAL_INFO: UInt = 4294901763u

public val IP_HOP_LIMIT_EXCEEDED: UInt = 11013u

public val IP_HW_ERROR: UInt = 11008u

public val IP_ICMP_ERROR: UInt = 11044u

public val IP_IFFILTER_INFO: UInt = 4294901773u

public val IP_IFFILTER_INFO_V6: UInt = 4294901780u

public val IP_INTERFACE_METRIC_CHANGE: UInt = 11030u

public val IP_INTERFACE_STATUS_INFO: UInt = 4294901764u

public val IP_INTERFACE_WOL_CAPABILITY_CHANGE: UInt = 11033u

public val IP_IN_FILTER_INFO: UInt = 4294901761u

public val IP_IN_FILTER_INFO_V6: UInt = 4294901777u

public val IP_IPINIP_CFG_INFO: UInt = 4294901772u

public val IP_MCAST_BOUNDARY_INFO: UInt = 4294901771u

public val IP_MCAST_HEARBEAT_INFO: UInt = 4294901770u

public val IP_MCAST_LIMIT_INFO: UInt = 4294901774u

public val IP_MEDIA_CONNECT: UInt = 11024u

public val IP_MEDIA_DISCONNECT: UInt = 11025u

public val IP_MTU_CHANGE: UInt = 11021u

public val IP_NEGOTIATING_IPSEC: UInt = 11032u

public val IP_NETROW: UInt = 10u

public val IP_NETTABLE: UInt = 9u

public val IP_NO_RESOURCES: UInt = 11006u

public val IP_OPTION_TOO_BIG: UInt = 11017u

public val IP_OUT_FILTER_INFO: UInt = 4294901762u

public val IP_OUT_FILTER_INFO_V6: UInt = 4294901778u

public val IP_PACKET_TOO_BIG: UInt = 11009u

public val IP_PARAMETER_PROBLEM: UInt = 11015u

public val IP_PARAM_PROBLEM: UInt = 11015u

public val IP_PENDING: UInt = 11255u

public val IP_PROT_PRIORITY_INFO: UInt = 4294901766u

public val IP_PROT_PRIORITY_INFO_EX: UInt = 4294901783u

public val IP_REASSEMBLY_TIME_EXCEEDED: UInt = 11014u

public val IP_RECONFIG_SECFLTR: UInt = 11031u

public val IP_REQ_TIMED_OUT: UInt = 11010u

public val IP_ROUTER_DISC_INFO: UInt = 4294901767u

public val IP_ROUTER_MANAGER_VERSION: UInt = 1u

public val IP_ROUTE_INFO: UInt = 4294901765u

public val IP_SOURCE_QUENCH: UInt = 11016u

public val IP_SPEC_MTU_CHANGE: UInt = 11020u

public val IP_STATS: UInt = 3u

public val IP_STATUS_BASE: UInt = 11000u

public val IP_SUCCESS: UInt = 0u

public val IP_TIME_EXCEEDED: UInt = 11041u

public val IP_TTL_EXPIRED_REASSEM: UInt = 11014u

public val IP_TTL_EXPIRED_TRANSIT: UInt = 11013u

public val IP_UNBIND_ADAPTER: UInt = 11027u

public val IP_UNLOAD: UInt = 11022u

public val IP_UNRECOGNIZED_NEXT_HEADER: UInt = 11043u

public val LB_DST_ADDR_USE_DSTADDR_FLAG: UInt = 8u

public val LB_DST_ADDR_USE_SRCADDR_FLAG: UInt = 4u

public val LB_DST_MASK_LATE_FLAG: UInt = 32u

public val LB_SRC_ADDR_USE_DSTADDR_FLAG: UInt = 2u

public val LB_SRC_ADDR_USE_SRCADDR_FLAG: UInt = 1u

public val LB_SRC_MASK_LATE_FLAG: UInt = 16u

public val MAXLEN_IFDESCR: UInt = 256u

public val MAXLEN_PHYSADDR: UInt = 8u

public val MAX_ADAPTER_ADDRESS_LENGTH: UInt = 8u

public val MAX_ADAPTER_DESCRIPTION_LENGTH: UInt = 128u

public val MAX_ADAPTER_NAME: UInt = 128u

public val MAX_ADAPTER_NAME_LENGTH: UInt = 256u

public val MAX_DHCPV6_DUID_LENGTH: UInt = 130u

public val MAX_DNS_SUFFIX_STRING_LENGTH: UInt = 256u

public val MAX_DOMAIN_NAME_LEN: UInt = 128u

public val MAX_HOSTNAME_LEN: UInt = 128u

public val MAX_IF_TYPE: UInt = 281u

public val MAX_INTERFACE_NAME_LEN: UInt = 256u

public val MAX_IP_STATUS: UInt = 11050u

public val MAX_MIB_OFFSET: UInt = 8u

public val MAX_OPT_SIZE: UInt = 40u

public val MAX_SCOPE_ID_LEN: UInt = 256u

public val MAX_SCOPE_NAME_LEN: UInt = 255u

public val MCAST_BOUNDARY: UInt = 26u

public val MCAST_GLOBAL: UInt = 24u

public val MCAST_IF_ENTRY: UInt = 23u

public val MCAST_MFE: UInt = 18u

public val MCAST_MFE_STATS: UInt = 19u

public val MCAST_MFE_STATS_EX: UInt = 35u

public val MCAST_SCOPE: UInt = 27u

public val MIB_IF_ADMIN_STATUS_DOWN: UInt = 2u

public val MIB_IF_ADMIN_STATUS_TESTING: UInt = 3u

public val MIB_IF_ADMIN_STATUS_UP: UInt = 1u

public val MIB_IF_TYPE_ETHERNET: UInt = 6u

public val MIB_IF_TYPE_FDDI: UInt = 15u

public val MIB_IF_TYPE_LOOPBACK: UInt = 24u

public val MIB_IF_TYPE_OTHER: UInt = 1u

public val MIB_IF_TYPE_PPP: UInt = 23u

public val MIB_IF_TYPE_SLIP: UInt = 28u

public val MIB_IF_TYPE_TOKENRING: UInt = 9u

public val MIB_INVALID_TEREDO_PORT_NUMBER: UInt = 0u

public val MIB_IPADDR_DELETED: UInt = 64u

public val MIB_IPADDR_DISCONNECTED: UInt = 8u

public val MIB_IPADDR_DNS_ELIGIBLE: UInt = 256u

public val MIB_IPADDR_DYNAMIC: UInt = 4u

public val MIB_IPADDR_PRIMARY: UInt = 1u

public val MIB_IPADDR_TRANSIENT: UInt = 128u

public val MIB_IPNET_TYPE_DYNAMIC: MibIpnetType = 3

public val MIB_IPNET_TYPE_INVALID: MibIpnetType = 2

public val MIB_IPNET_TYPE_OTHER: MibIpnetType = 1

public val MIB_IPNET_TYPE_STATIC: MibIpnetType = 4

public val MIB_IPROUTE_METRIC_UNUSED: UInt = 4294967295u

public val MIB_IPROUTE_TYPE_DIRECT: MibIpforwardType = 3

public val MIB_IPROUTE_TYPE_INDIRECT: MibIpforwardType = 4

public val MIB_IPROUTE_TYPE_INVALID: MibIpforwardType = 2

public val MIB_IPROUTE_TYPE_OTHER: MibIpforwardType = 1

public val MIB_IP_FORWARDING: MibIpstatsForwarding = 1

public val MIB_IP_NOT_FORWARDING: MibIpstatsForwarding = 2

public val MIB_TCP_RTO_CONSTANT: TcpRtoAlgorithm = 2

public val MIB_TCP_RTO_OTHER: TcpRtoAlgorithm = 1

public val MIB_TCP_RTO_RSRE: TcpRtoAlgorithm = 3

public val MIB_TCP_RTO_VANJ: TcpRtoAlgorithm = 4

public val MIB_TCP_STATE_CLOSED: MibTcpState = 1

public val MIB_TCP_STATE_CLOSE_WAIT: MibTcpState = 8

public val MIB_TCP_STATE_CLOSING: MibTcpState = 9

public val MIB_TCP_STATE_DELETE_TCB: MibTcpState = 12

public val MIB_TCP_STATE_ESTAB: MibTcpState = 5

public val MIB_TCP_STATE_FIN_WAIT1: MibTcpState = 6

public val MIB_TCP_STATE_FIN_WAIT2: MibTcpState = 7

public val MIB_TCP_STATE_LAST_ACK: MibTcpState = 10

public val MIB_TCP_STATE_LISTEN: MibTcpState = 2

public val MIB_TCP_STATE_RESERVED: MibTcpState = 100

public val MIB_TCP_STATE_SYN_RCVD: MibTcpState = 4

public val MIB_TCP_STATE_SYN_SENT: MibTcpState = 3

public val MIB_TCP_STATE_TIME_WAIT: MibTcpState = 11

public val MIB_USE_CURRENT_FORWARDING: UInt = 4294967295u

public val MIB_USE_CURRENT_TTL: UInt = 4294967295u

public val MIN_IF_TYPE: UInt = 1u

public val MIXED_NODETYPE: UInt = 4u

public val MIB_ADD_INSTANCE: MibNotificationType = 1

public val MIB_DELETE_INSTANCE: MibNotificationType = 2

public val MIB_IF_ENTRY_NORMAL: MibIfEntryLevel = 0

public val MIB_IF_ENTRY_NORMAL_WITHOUT_STATISTICS: MibIfEntryLevel = 2

public val MIB_IF_TABLE_NORMAL: MibIfTableLevel = 0

public val MIB_IF_TABLE_NORMAL_WITHOUT_STATISTICS: MibIfTableLevel = 2

public val MIB_IF_TABLE_RAW: MibIfTableLevel = 1

public val MIB_INITIAL_NOTIFICATION: MibNotificationType = 3

public val MIB_PARAMETER_NOTIFICATION: MibNotificationType = 0

public val ND_NEIGHBOR_ADVERT: Icmp6Type = 136

public val ND_NEIGHBOR_SOLICIT: Icmp6Type = 135

public val ND_REDIRECT: Icmp6Type = 137

public val ND_ROUTER_ADVERT: Icmp6Type = 134

public val ND_ROUTER_SOLICIT: Icmp6Type = 133

public val NET_ADDRESS_DNS_NAME: NetAddressFormat = 1

public val NET_ADDRESS_FORMAT_UNSPECIFIED: NetAddressFormat = 0

public val NET_ADDRESS_IPV4: NetAddressFormat = 2

public val NET_ADDRESS_IPV6: NetAddressFormat = 3

public val NET_STRING_IPV4_ADDRESS: UInt = 1u

public val NET_STRING_IPV4_NETWORK: UInt = 4u

public val NET_STRING_IPV4_SERVICE: UInt = 2u

public val NET_STRING_IPV6_ADDRESS: UInt = 8u

public val NET_STRING_IPV6_ADDRESS_NO_SCOPE: UInt = 16u

public val NET_STRING_IPV6_NETWORK: UInt = 128u

public val NET_STRING_IPV6_SERVICE: UInt = 32u

public val NET_STRING_IPV6_SERVICE_NO_SCOPE: UInt = 64u

public val NET_STRING_NAMED_ADDRESS: UInt = 256u

public val NET_STRING_NAMED_SERVICE: UInt = 512u

public val NUMBER_OF_EXPORTED_VARIABLES: UInt = 39u

public val PEER_TO_PEER_NODETYPE: UInt = 2u

public val PFERROR_BUFFER_TOO_SMALL: UInt = 23002u

public val PFERROR_NO_FILTERS_GIVEN: UInt = 23001u

public val PFERROR_NO_PF_INTERFACE: UInt = 23000u

public val PFFT_FILTER: Pfframetype = 1

public val PFFT_FRAG: Pfframetype = 2

public val PFFT_SPOOF: Pfframetype = 3

public val PF_ACTION_DROP: PfforwardAction = 1

public val PF_ACTION_FORWARD: PfforwardAction = 0

public val PF_IPV4: Pfaddresstype = 0

public val PF_IPV6: Pfaddresstype = 1

public val PROXY_ARP: UInt = 22u

public val ROUTE_LONGER: UInt = 32u

public val ROUTE_MATCHING: UInt = 31u

public val ROUTE_SHORTER: UInt = 33u

public val ROUTE_STATE: UInt = 34u

public val TCP6_STATS: UInt = 38u

public val TCPIP_OWNER_MODULE_INFO_BASIC: TcpipOwnerModuleInfoClass = 0

public val TCPIP_OWNING_MODULE_SIZE: UInt = 16u

public val TCP_ROW: UInt = 14u

public val TCP_STATS: UInt = 12u

public val TCP_TABLE: UInt = 13u

public val TCP_TABLE_BASIC_ALL: TcpTableClass = 2

public val TCP_TABLE_BASIC_CONNECTIONS: TcpTableClass = 1

public val TCP_TABLE_BASIC_LISTENER: TcpTableClass = 0

public val TCP_TABLE_OWNER_MODULE_ALL: TcpTableClass = 8

public val TCP_TABLE_OWNER_MODULE_CONNECTIONS: TcpTableClass = 7

public val TCP_TABLE_OWNER_MODULE_LISTENER: TcpTableClass = 6

public val TCP_TABLE_OWNER_PID_ALL: TcpTableClass = 5

public val TCP_TABLE_OWNER_PID_CONNECTIONS: TcpTableClass = 4

public val TCP_TABLE_OWNER_PID_LISTENER: TcpTableClass = 3

public val TCP_BOOL_OPT_DISABLED: TcpBooleanOptional = 0

public val TCP_BOOL_OPT_ENABLED: TcpBooleanOptional = 1

public val TCP_BOOL_OPT_UNCHANGED: TcpBooleanOptional = -1

public val TCP_CONNECTION_ESTATS_BANDWIDTH: TcpEstatsType = 7

public val TCP_CONNECTION_ESTATS_DATA: TcpEstatsType = 1

public val TCP_CONNECTION_ESTATS_FINE_RTT: TcpEstatsType = 8

public val TCP_CONNECTION_ESTATS_MAXIMUM: TcpEstatsType = 9

public val TCP_CONNECTION_ESTATS_OBS_REC: TcpEstatsType = 6

public val TCP_CONNECTION_ESTATS_PATH: TcpEstatsType = 3

public val TCP_CONNECTION_ESTATS_REC: TcpEstatsType = 5

public val TCP_CONNECTION_ESTATS_SEND_BUFF: TcpEstatsType = 4

public val TCP_CONNECTION_ESTATS_SND_CONG: TcpEstatsType = 2

public val TCP_CONNECTION_ESTATS_SYN_OPTS: TcpEstatsType = 0

public val TCP_CONNECTION_OFFLOAD_STATE_IN_HOST: TcpConnectionOffloadState = 0

public val TCP_CONNECTION_OFFLOAD_STATE_MAX: TcpConnectionOffloadState = 4

public val TCP_CONNECTION_OFFLOAD_STATE_OFFLOADED: TcpConnectionOffloadState = 2

public val TCP_CONNECTION_OFFLOAD_STATE_OFFLOADING: TcpConnectionOffloadState = 1

public val TCP_CONNECTION_OFFLOAD_STATE_UPLOADING: TcpConnectionOffloadState = 3

public val TCP_ERROR_ABOVE_ACK_WINDOW: TcpSoftError = 4

public val TCP_ERROR_ABOVE_DATA_WINDOW: TcpSoftError = 2

public val TCP_ERROR_ABOVE_TS_WINDOW: TcpSoftError = 6

public val TCP_ERROR_BELOW_ACK_WINDOW: TcpSoftError = 3

public val TCP_ERROR_BELOW_DATA_WINDOW: TcpSoftError = 1

public val TCP_ERROR_BELOW_TS_WINDOW: TcpSoftError = 5

public val TCP_ERROR_DATA_CHECKSUM_ERROR: TcpSoftError = 7

public val TCP_ERROR_DATA_LENGTH_ERROR: TcpSoftError = 8

public val TCP_ERROR_MAX_SOFT_ERROR: TcpSoftError = 9

public val TCP_ERROR_NONE: TcpSoftError = 0

public val TCP_RTO_ALGORITHM_CONSTANT: TcpRtoAlgorithm = 2

public val TCP_RTO_ALGORITHM_OTHER: TcpRtoAlgorithm = 1

public val TCP_RTO_ALGORITHM_RSRE: TcpRtoAlgorithm = 3

public val TCP_RTO_ALGORITHM_VANJ: TcpRtoAlgorithm = 4

public val UDP6_STATS: UInt = 37u

public val UDP_ROW: UInt = 17u

public val UDP_STATS: UInt = 15u

public val UDP_TABLE: UInt = 16u

public val UDP_TABLE_BASIC: UdpTableClass = 0

public val UDP_TABLE_OWNER_MODULE: UdpTableClass = 2

public val UDP_TABLE_OWNER_PID: UdpTableClass = 1
