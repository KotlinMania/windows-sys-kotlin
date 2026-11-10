package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

public val DDR_MAX_IP_HINTS: UInt = 4u

public val DNSREC_ADDITIONAL: UInt = 3u

public val DNSREC_ANSWER: UInt = 1u

public val DNSREC_AUTHORITY: UInt = 2u

public val DNSREC_DELETE: UInt = 4u

public val DNSREC_NOEXIST: UInt = 4u

public val DNSREC_PREREQ: UInt = 1u

public val DNSREC_QUESTION: UInt = 0u

public val DNSREC_SECTION: UInt = 3u

public val DNSREC_UPDATE: UInt = 2u

public val DNSREC_ZONE: UInt = 0u

public val DNSSEC_ALGORITHM_ECDSAP256_SHA256: UInt = 13u

public val DNSSEC_ALGORITHM_ECDSAP384_SHA384: UInt = 14u

public val DNSSEC_ALGORITHM_NULL: UInt = 253u

public val DNSSEC_ALGORITHM_PRIVATE: UInt = 254u

public val DNSSEC_ALGORITHM_RSAMD5: UInt = 1u

public val DNSSEC_ALGORITHM_RSASHA1: UInt = 5u

public val DNSSEC_ALGORITHM_RSASHA1_NSEC3: UInt = 7u

public val DNSSEC_ALGORITHM_RSASHA256: UInt = 8u

public val DNSSEC_ALGORITHM_RSASHA512: UInt = 10u

public val DNSSEC_DIGEST_ALGORITHM_SHA1: UInt = 1u

public val DNSSEC_DIGEST_ALGORITHM_SHA256: UInt = 2u

public val DNSSEC_DIGEST_ALGORITHM_SHA384: UInt = 4u

public val DNSSEC_KEY_FLAG_EXTEND: UInt = 8u

public val DNSSEC_KEY_FLAG_FLAG10: UInt = 1024u

public val DNSSEC_KEY_FLAG_FLAG11: UInt = 2048u

public val DNSSEC_KEY_FLAG_FLAG2: UInt = 4u

public val DNSSEC_KEY_FLAG_FLAG4: UInt = 16u

public val DNSSEC_KEY_FLAG_FLAG5: UInt = 32u

public val DNSSEC_KEY_FLAG_FLAG8: UInt = 256u

public val DNSSEC_KEY_FLAG_FLAG9: UInt = 512u

public val DNSSEC_KEY_FLAG_HOST: UInt = 128u

public val DNSSEC_KEY_FLAG_NOAUTH: UInt = 1u

public val DNSSEC_KEY_FLAG_NOCONF: UInt = 2u

public val DNSSEC_KEY_FLAG_NTPE3: UInt = 192u

public val DNSSEC_KEY_FLAG_SIG0: UInt = 0u

public val DNSSEC_KEY_FLAG_SIG1: UInt = 4096u

public val DNSSEC_KEY_FLAG_SIG10: UInt = 40960u

public val DNSSEC_KEY_FLAG_SIG11: UInt = 45056u

public val DNSSEC_KEY_FLAG_SIG12: UInt = 49152u

public val DNSSEC_KEY_FLAG_SIG13: UInt = 53248u

public val DNSSEC_KEY_FLAG_SIG14: UInt = 57344u

public val DNSSEC_KEY_FLAG_SIG15: UInt = 61440u

public val DNSSEC_KEY_FLAG_SIG2: UInt = 8192u

public val DNSSEC_KEY_FLAG_SIG3: UInt = 12288u

public val DNSSEC_KEY_FLAG_SIG4: UInt = 16384u

public val DNSSEC_KEY_FLAG_SIG5: UInt = 20480u

public val DNSSEC_KEY_FLAG_SIG6: UInt = 24576u

public val DNSSEC_KEY_FLAG_SIG7: UInt = 28672u

public val DNSSEC_KEY_FLAG_SIG8: UInt = 32768u

public val DNSSEC_KEY_FLAG_SIG9: UInt = 36864u

public val DNSSEC_KEY_FLAG_USER: UInt = 0u

public val DNSSEC_KEY_FLAG_ZONE: UInt = 64u

public val DNSSEC_PROTOCOL_DNSSEC: UInt = 3u

public val DNSSEC_PROTOCOL_EMAIL: UInt = 2u

public val DNSSEC_PROTOCOL_IPSEC: UInt = 4u

public val DNSSEC_PROTOCOL_NONE: UInt = 0u

public val DNSSEC_PROTOCOL_TLS: UInt = 1u

public val DNS_ADDRESS_STRING_LENGTH: UInt = 65u

public val DNS_ADDR_MAX_SOCKADDR_LENGTH: UInt = 32u

public val DNS_APP_SETTINGS_EXCLUSIVE_SERVERS: UInt = 1u

public val DNS_APP_SETTINGS_VERSION1: UInt = 1u

public val DNS_ATMA_AESA_ADDR_LENGTH: UInt = 20u

public val DNS_ATMA_FORMAT_AESA: UInt = 2u

public val DNS_ATMA_FORMAT_E164: UInt = 1u

public val DNS_ATMA_MAX_ADDR_LENGTH: UInt = 20u

public val DNS_ATMA_MAX_RECORD_LENGTH: UInt = 21u

public val DNS_CLASS_ALL: UInt = 255u

public val DNS_CLASS_ANY: UInt = 255u

public val DNS_CLASS_CHAOS: UInt = 3u

public val DNS_CLASS_CSNET: UInt = 2u

public val DNS_CLASS_HESIOD: UInt = 4u

public val DNS_CLASS_INTERNET: UInt = 1u

public val DNS_CLASS_NONE: UInt = 254u

public val DNS_CLASS_UNICAST_RESPONSE: UInt = 32768u

public val DNS_COMPRESSED_QUESTION_NAME: UInt = 49164u

public val DNS_CONFIG_FLAG_ALLOC: UInt = 1u

public val DNS_CONNECTION_NAME_MAX_LENGTH: UInt = 64u

public val DNS_CONNECTION_POLICY_ENTRY_ONDEMAND: UInt = 1u

public val DNS_CONNECTION_PROXY_INFO_CURRENT_VERSION: UInt = 1u

public val DNS_CONNECTION_PROXY_INFO_EXCEPTION_MAX_LENGTH: UInt = 1024u

public val DNS_CONNECTION_PROXY_INFO_EXTRA_INFO_MAX_LENGTH: UInt = 1024u

public val DNS_CONNECTION_PROXY_INFO_FLAG_BYPASSLOCAL: UInt = 2u

public val DNS_CONNECTION_PROXY_INFO_FLAG_DISABLED: UInt = 1u

public val DNS_CONNECTION_PROXY_INFO_FRIENDLY_NAME_MAX_LENGTH: UInt = 64u

public val DNS_CONNECTION_PROXY_INFO_PASSWORD_MAX_LENGTH: UInt = 128u

public val DNS_CONNECTION_PROXY_INFO_SERVER_MAX_LENGTH: UInt = 256u

public val DNS_CONNECTION_PROXY_INFO_SWITCH_CONFIG: DnsConnectionProxyInfoSwitch = 0

public val DNS_CONNECTION_PROXY_INFO_SWITCH_SCRIPT: DnsConnectionProxyInfoSwitch = 1

public val DNS_CONNECTION_PROXY_INFO_SWITCH_WPAD: DnsConnectionProxyInfoSwitch = 2

public val DNS_CONNECTION_PROXY_INFO_USERNAME_MAX_LENGTH: UInt = 128u

public val DNS_CONNECTION_PROXY_TYPE_HTTP: DnsConnectionProxyType = 1

public val DNS_CONNECTION_PROXY_TYPE_NULL: DnsConnectionProxyType = 0

public val DNS_CONNECTION_PROXY_TYPE_SOCKS4: DnsConnectionProxyType = 4

public val DNS_CONNECTION_PROXY_TYPE_SOCKS5: DnsConnectionProxyType = 5

public val DNS_CONNECTION_PROXY_TYPE_WAP: DnsConnectionProxyType = 2

public val DNS_CUSTOM_SERVER_TYPE_DOH: UInt = 2u

public val DNS_CUSTOM_SERVER_TYPE_UDP: UInt = 1u

public val DNS_CUSTOM_SERVER_UDP_FALLBACK: UInt = 1u

public val DNS_MAX_IP4_REVERSE_NAME_BUFFER_LENGTH: UInt = 31u

public val DNS_MAX_IP4_REVERSE_NAME_LENGTH: UInt = 31u

public val DNS_MAX_IP6_REVERSE_NAME_BUFFER_LENGTH: UInt = 75u

public val DNS_MAX_IP6_REVERSE_NAME_LENGTH: UInt = 75u

public val DNS_MAX_LABEL_BUFFER_LENGTH: UInt = 64u

public val DNS_MAX_LABEL_LENGTH: UInt = 63u

public val DNS_MAX_NAME_BUFFER_LENGTH: UInt = 256u

public val DNS_MAX_NAME_LENGTH: UInt = 255u

public val DNS_MAX_REVERSE_NAME_BUFFER_LENGTH: UInt = 75u

public val DNS_MAX_REVERSE_NAME_LENGTH: UInt = 75u

public val DNS_MAX_TEXT_STRING_LENGTH: UInt = 255u

public val DNS_OPCODE_IQUERY: UInt = 1u

public val DNS_OPCODE_NOTIFY: UInt = 4u

public val DNS_OPCODE_QUERY: UInt = 0u

public val DNS_OPCODE_SERVER_STATUS: UInt = 2u

public val DNS_OPCODE_UNKNOWN: UInt = 3u

public val DNS_OPCODE_UPDATE: UInt = 5u

public val DNS_PORT_HOST_ORDER: UInt = 53u

public val DNS_PORT_NET_ORDER: UInt = 13568u

public val DNS_PROTOCOL_DOH: UInt = 3u

public val DNS_PROTOCOL_NO_WIRE: UInt = 5u

public val DNS_PROTOCOL_TCP: UInt = 2u

public val DNS_PROTOCOL_UDP: UInt = 1u

public val DNS_PROTOCOL_UNSPECIFIED: UInt = 0u

public val DNS_PROXY_INFORMATION_DEFAULT_SETTINGS: DnsProxyInformationType = 1

public val DNS_PROXY_INFORMATION_DIRECT: DnsProxyInformationType = 0

public val DNS_PROXY_INFORMATION_DOES_NOT_EXIST: DnsProxyInformationType = 3

public val DNS_PROXY_INFORMATION_PROXY_NAME: DnsProxyInformationType = 2

public val DNS_QUERY_ACCEPT_TRUNCATED_RESPONSE: DnsQueryOptions = 1u

public val DNS_QUERY_ADDRCONFIG: DnsQueryOptions = 8192u

public val DNS_QUERY_APPEND_MULTILABEL: DnsQueryOptions = 8388608u

public val DNS_QUERY_BYPASS_CACHE: DnsQueryOptions = 8u

public val DNS_QUERY_CACHE_ONLY: DnsQueryOptions = 16u

public val DNS_QUERY_DISABLE_IDN_ENCODING: DnsQueryOptions = 2097152u

public val DNS_QUERY_DNSSEC_CHECKING_DISABLED: DnsQueryOptions = 33554432u

public val DNS_QUERY_DNSSEC_OK: DnsQueryOptions = 16777216u

public val DNS_QUERY_DONT_RESET_TTL_VALUES: DnsQueryOptions = 1048576u

public val DNS_QUERY_DUAL_ADDR: DnsQueryOptions = 16384u

public val DNS_QUERY_MULTICAST_ONLY: DnsQueryOptions = 1024u

public val DNS_QUERY_NO_HOSTS_FILE: DnsQueryOptions = 64u

public val DNS_QUERY_NO_LOCAL_NAME: DnsQueryOptions = 32u

public val DNS_QUERY_NO_MULTICAST: DnsQueryOptions = 2048u

public val DNS_QUERY_NO_NETBT: DnsQueryOptions = 128u

public val DNS_QUERY_NO_RECURSION: DnsQueryOptions = 4u

public val DNS_QUERY_NO_WIRE_QUERY: DnsQueryOptions = 16u

public val DNS_QUERY_RAW_OPTION_BEST_EFFORT_PARSE: DnsQueryOptions = 1u

public val DNS_QUERY_RAW_REQUEST_VERSION1: DnsQueryOptions = 1u

public val DNS_QUERY_RAW_RESULTS_VERSION1: DnsQueryOptions = 1u

public val DNS_QUERY_REQUEST_VERSION1: DnsQueryOptions = 1u

public val DNS_QUERY_REQUEST_VERSION2: DnsQueryOptions = 2u

public val DNS_QUERY_REQUEST_VERSION3: DnsQueryOptions = 3u

public val DNS_QUERY_RESERVED: DnsQueryOptions = 4026531840u

public val DNS_QUERY_RESULTS_VERSION1: DnsQueryOptions = 1u

public val DNS_QUERY_RETURN_MESSAGE: DnsQueryOptions = 512u

public val DNS_QUERY_STANDARD: DnsQueryOptions = 0u

public val DNS_QUERY_TREAT_AS_FQDN: DnsQueryOptions = 4096u

public val DNS_QUERY_USE_TCP_ONLY: DnsQueryOptions = 2u

public val DNS_QUERY_WIRE_ONLY: DnsQueryOptions = 256u

public val DNS_RCLASS_ALL: UInt = 65280u

public val DNS_RCLASS_ANY: UInt = 65280u

public val DNS_RCLASS_CHAOS: UInt = 768u

public val DNS_RCLASS_CSNET: UInt = 512u

public val DNS_RCLASS_HESIOD: UInt = 1024u

public val DNS_RCLASS_INTERNET: UInt = 256u

public val DNS_RCLASS_MDNS_CACHE_FLUSH: UInt = 128u

public val DNS_RCLASS_NONE: UInt = 65024u

public val DNS_RCLASS_UNICAST_RESPONSE: UInt = 128u

public val DNS_RCODE_BADKEY: UInt = 17u

public val DNS_RCODE_BADSIG: UInt = 16u

public val DNS_RCODE_BADTIME: UInt = 18u

public val DNS_RCODE_BADVERS: UInt = 16u

public val DNS_RCODE_FORMAT_ERROR: UInt = 1u

public val DNS_RCODE_FORMERR: UInt = 1u

public val DNS_RCODE_MAX: UInt = 15u

public val DNS_RCODE_NAME_ERROR: UInt = 3u

public val DNS_RCODE_NOERROR: UInt = 0u

public val DNS_RCODE_NOTAUTH: UInt = 9u

public val DNS_RCODE_NOTIMPL: UInt = 4u

public val DNS_RCODE_NOTZONE: UInt = 10u

public val DNS_RCODE_NOT_IMPLEMENTED: UInt = 4u

public val DNS_RCODE_NO_ERROR: UInt = 0u

public val DNS_RCODE_NXDOMAIN: UInt = 3u

public val DNS_RCODE_NXRRSET: UInt = 8u

public val DNS_RCODE_REFUSED: UInt = 5u

public val DNS_RCODE_SERVER_FAILURE: UInt = 2u

public val DNS_RCODE_SERVFAIL: UInt = 2u

public val DNS_RCODE_YXDOMAIN: UInt = 6u

public val DNS_RCODE_YXRRSET: UInt = 7u

public val DNS_RFC_MAX_UDP_PACKET_LENGTH: UInt = 512u

public val DNS_RTYPE_A: UInt = 256u

public val DNS_RTYPE_A6: UInt = 9728u

public val DNS_RTYPE_AAAA: UInt = 7168u

public val DNS_RTYPE_AFSDB: UInt = 4608u

public val DNS_RTYPE_ALL: UInt = 65280u

public val DNS_RTYPE_ANY: UInt = 65280u

public val DNS_RTYPE_ATMA: UInt = 8704u

public val DNS_RTYPE_AXFR: UInt = 64512u

public val DNS_RTYPE_CERT: UInt = 9472u

public val DNS_RTYPE_CNAME: UInt = 1280u

public val DNS_RTYPE_DHCID: UInt = 12544u

public val DNS_RTYPE_DNAME: UInt = 9984u

public val DNS_RTYPE_DNSKEY: UInt = 12288u

public val DNS_RTYPE_DS: UInt = 11008u

public val DNS_RTYPE_EID: UInt = 7936u

public val DNS_RTYPE_GID: UInt = 26112u

public val DNS_RTYPE_GPOS: UInt = 6912u

public val DNS_RTYPE_HINFO: UInt = 3328u

public val DNS_RTYPE_ISDN: UInt = 5120u

public val DNS_RTYPE_IXFR: UInt = 64256u

public val DNS_RTYPE_KEY: UInt = 6400u

public val DNS_RTYPE_KX: UInt = 9216u

public val DNS_RTYPE_LOC: UInt = 7424u

public val DNS_RTYPE_MAILA: UInt = 65024u

public val DNS_RTYPE_MAILB: UInt = 64768u

public val DNS_RTYPE_MB: UInt = 1792u

public val DNS_RTYPE_MD: UInt = 768u

public val DNS_RTYPE_MF: UInt = 1024u

public val DNS_RTYPE_MG: UInt = 2048u

public val DNS_RTYPE_MINFO: UInt = 3584u

public val DNS_RTYPE_MR: UInt = 2304u

public val DNS_RTYPE_MX: UInt = 3840u

public val DNS_RTYPE_NAPTR: UInt = 8960u

public val DNS_RTYPE_NIMLOC: UInt = 8192u

public val DNS_RTYPE_NS: UInt = 512u

public val DNS_RTYPE_NSAP: UInt = 5632u

public val DNS_RTYPE_NSAPPTR: UInt = 5888u

public val DNS_RTYPE_NSEC: UInt = 12032u

public val DNS_RTYPE_NSEC3: UInt = 12800u

public val DNS_RTYPE_NSEC3PARAM: UInt = 13056u

public val DNS_RTYPE_NULL: UInt = 2560u

public val DNS_RTYPE_NXT: UInt = 7680u

public val DNS_RTYPE_OPT: UInt = 10496u

public val DNS_RTYPE_PTR: UInt = 3072u

public val DNS_RTYPE_PX: UInt = 6656u

public val DNS_RTYPE_RP: UInt = 4352u

public val DNS_RTYPE_RRSIG: UInt = 11776u

public val DNS_RTYPE_RT: UInt = 5376u

public val DNS_RTYPE_SIG: UInt = 6144u

public val DNS_RTYPE_SINK: UInt = 10240u

public val DNS_RTYPE_SOA: UInt = 1536u

public val DNS_RTYPE_SRV: UInt = 8448u

public val DNS_RTYPE_TEXT: UInt = 4096u

public val DNS_RTYPE_TKEY: UInt = 63744u

public val DNS_RTYPE_TLSA: UInt = 13312u

public val DNS_RTYPE_TSIG: UInt = 64000u

public val DNS_RTYPE_UID: UInt = 25856u

public val DNS_RTYPE_UINFO: UInt = 25600u

public val DNS_RTYPE_UNSPEC: UInt = 26368u

public val DNS_RTYPE_WINS: UInt = 511u

public val DNS_RTYPE_WINSR: UInt = 767u

public val DNS_RTYPE_WKS: UInt = 2816u

public val DNS_RTYPE_X25: UInt = 4864u

public val DNS_TKEY_MODE_DIFFIE_HELLMAN: UInt = 2u

public val DNS_TKEY_MODE_GSS: UInt = 3u

public val DNS_TKEY_MODE_RESOLVER_ASSIGN: UInt = 4u

public val DNS_TKEY_MODE_SERVER_ASSIGN: UInt = 1u

public val DNS_TYPE_A: DnsType = 1u.toUShort()

public val DNS_TYPE_A6: DnsType = 38u.toUShort()

public val DNS_TYPE_AAAA: DnsType = 28u.toUShort()

public val DNS_TYPE_ADDRS: DnsType = 248u.toUShort()

public val DNS_TYPE_AFSDB: DnsType = 18u.toUShort()

public val DNS_TYPE_ALL: DnsType = 255u.toUShort()

public val DNS_TYPE_ANY: DnsType = 255u.toUShort()

public val DNS_TYPE_ATMA: DnsType = 34u.toUShort()

public val DNS_TYPE_AXFR: DnsType = 252u.toUShort()

public val DNS_TYPE_CERT: DnsType = 37u.toUShort()

public val DNS_TYPE_CNAME: DnsType = 5u.toUShort()

public val DNS_TYPE_DHCID: DnsType = 49u.toUShort()

public val DNS_TYPE_DNAME: DnsType = 39u.toUShort()

public val DNS_TYPE_DNSKEY: DnsType = 48u.toUShort()

public val DNS_TYPE_DS: DnsType = 43u.toUShort()

public val DNS_TYPE_EID: DnsType = 31u.toUShort()

public val DNS_TYPE_GID: DnsType = 102u.toUShort()

public val DNS_TYPE_GPOS: DnsType = 27u.toUShort()

public val DNS_TYPE_HINFO: DnsType = 13u.toUShort()

public val DNS_TYPE_HTTPS: DnsType = 65u.toUShort()

public val DNS_TYPE_ISDN: DnsType = 20u.toUShort()

public val DNS_TYPE_IXFR: DnsType = 251u.toUShort()

public val DNS_TYPE_KEY: DnsType = 25u.toUShort()

public val DNS_TYPE_KX: DnsType = 36u.toUShort()

public val DNS_TYPE_LOC: DnsType = 29u.toUShort()

public val DNS_TYPE_MAILA: DnsType = 254u.toUShort()

public val DNS_TYPE_MAILB: DnsType = 253u.toUShort()

public val DNS_TYPE_MB: DnsType = 7u.toUShort()

public val DNS_TYPE_MD: DnsType = 3u.toUShort()

public val DNS_TYPE_MF: DnsType = 4u.toUShort()

public val DNS_TYPE_MG: DnsType = 8u.toUShort()

public val DNS_TYPE_MINFO: DnsType = 14u.toUShort()

public val DNS_TYPE_MR: DnsType = 9u.toUShort()

public val DNS_TYPE_MX: DnsType = 15u.toUShort()

public val DNS_TYPE_NAPTR: DnsType = 35u.toUShort()

public val DNS_TYPE_NBSTAT: DnsType = 65282u.toUShort()

public val DNS_TYPE_NIMLOC: DnsType = 32u.toUShort()

public val DNS_TYPE_NS: DnsType = 2u.toUShort()

public val DNS_TYPE_NSAP: DnsType = 22u.toUShort()

public val DNS_TYPE_NSAPPTR: DnsType = 23u.toUShort()

public val DNS_TYPE_NSEC: DnsType = 47u.toUShort()

public val DNS_TYPE_NSEC3: DnsType = 50u.toUShort()

public val DNS_TYPE_NSEC3PARAM: DnsType = 51u.toUShort()

public val DNS_TYPE_NULL: DnsType = 10u.toUShort()

public val DNS_TYPE_NXT: DnsType = 30u.toUShort()

public val DNS_TYPE_OPT: DnsType = 41u.toUShort()

public val DNS_TYPE_PTR: DnsType = 12u.toUShort()

public val DNS_TYPE_PX: DnsType = 26u.toUShort()

public val DNS_TYPE_RP: DnsType = 17u.toUShort()

public val DNS_TYPE_RRSIG: DnsType = 46u.toUShort()

public val DNS_TYPE_RT: DnsType = 21u.toUShort()

public val DNS_TYPE_SIG: DnsType = 24u.toUShort()

public val DNS_TYPE_SINK: DnsType = 40u.toUShort()

public val DNS_TYPE_SOA: DnsType = 6u.toUShort()

public val DNS_TYPE_SRV: DnsType = 33u.toUShort()

public val DNS_TYPE_SVCB: DnsType = 64u.toUShort()

public val DNS_TYPE_TEXT: DnsType = 16u.toUShort()

public val DNS_TYPE_TKEY: DnsType = 249u.toUShort()

public val DNS_TYPE_TLSA: DnsType = 52u.toUShort()

public val DNS_TYPE_TSIG: DnsType = 250u.toUShort()

public val DNS_TYPE_UID: DnsType = 101u.toUShort()

public val DNS_TYPE_UINFO: DnsType = 100u.toUShort()

public val DNS_TYPE_UNSPEC: DnsType = 103u.toUShort()

public val DNS_TYPE_WINS: DnsType = 65281u.toUShort()

public val DNS_TYPE_WINSR: DnsType = 65282u.toUShort()

public val DNS_TYPE_WKS: DnsType = 11u.toUShort()

public val DNS_TYPE_X25: DnsType = 19u.toUShort()

public val DNS_TYPE_ZERO: DnsType = 0u.toUShort()

public val DNS_UPDATE_CACHE_SECURITY_CONTEXT: UInt = 512u

public val DNS_UPDATE_FORCE_SECURITY_NEGO: UInt = 2048u

public val DNS_UPDATE_REMOTE_SERVER: UInt = 16384u

public val DNS_UPDATE_RESERVED: UInt = 4294901760u

public val DNS_UPDATE_SECURITY_OFF: UInt = 16u

public val DNS_UPDATE_SECURITY_ON: UInt = 32u

public val DNS_UPDATE_SECURITY_ONLY: UInt = 256u

public val DNS_UPDATE_SECURITY_USE_DEFAULT: UInt = 0u

public val DNS_UPDATE_SKIP_NO_UPDATE_ADAPTERS: UInt = 8192u

public val DNS_UPDATE_TEST_USE_LOCAL_SYS_ACCT: UInt = 1024u

public val DNS_UPDATE_TRY_ALL_MASTER_SERVERS: UInt = 4096u

public val DNS_VALSVR_ERROR_INVALID_ADDR: UInt = 1u

public val DNS_VALSVR_ERROR_INVALID_NAME: UInt = 2u

public val DNS_VALSVR_ERROR_NO_AUTH: UInt = 5u

public val DNS_VALSVR_ERROR_NO_RESPONSE: UInt = 4u

public val DNS_VALSVR_ERROR_NO_TCP: UInt = 16u

public val DNS_VALSVR_ERROR_REFUSED: UInt = 6u

public val DNS_VALSVR_ERROR_UNKNOWN: UInt = 255u

public val DNS_VALSVR_ERROR_UNREACHABLE: UInt = 3u

public val DNS_WINS_FLAG_LOCAL: UInt = 65536u

public val DNS_WINS_FLAG_SCOPE: UInt = 2147483648u

public val DNS_CHAR_SET_ANSI: DnsCharset = 3

public val DNS_CHAR_SET_UNICODE: DnsCharset = 1

public val DNS_CHAR_SET_UNKNOWN: DnsCharset = 0

public val DNS_CHAR_SET_UTF8: DnsCharset = 2

public val DNS_CONFIG_ADAPTER_DOMAIN_NAME_A: DnsConfigType = 4

public val DNS_CONFIG_ADAPTER_DOMAIN_NAME_UTF8: DnsConfigType = 5

public val DNS_CONFIG_ADAPTER_DOMAIN_NAME_W: DnsConfigType = 3

public val DNS_CONFIG_ADAPTER_HOST_NAME_REGISTRATION_ENABLED: DnsConfigType = 10

public val DNS_CONFIG_ADAPTER_INFO: DnsConfigType = 8

public val DNS_CONFIG_ADDRESS_REGISTRATION_MAX_COUNT: DnsConfigType = 11

public val DNS_CONFIG_DNS_SERVER_LIST: DnsConfigType = 6

public val DNS_CONFIG_FULL_HOST_NAME_A: DnsConfigType = 16

public val DNS_CONFIG_FULL_HOST_NAME_UTF8: DnsConfigType = 17

public val DNS_CONFIG_FULL_HOST_NAME_W: DnsConfigType = 15

public val DNS_CONFIG_HOST_NAME_A: DnsConfigType = 13

public val DNS_CONFIG_HOST_NAME_UTF8: DnsConfigType = 14

public val DNS_CONFIG_HOST_NAME_W: DnsConfigType = 12

public val DNS_CONFIG_NAME_SERVER: DnsConfigType = 18

public val DNS_CONFIG_PRIMARY_DOMAIN_NAME_A: DnsConfigType = 1

public val DNS_CONFIG_PRIMARY_DOMAIN_NAME_UTF8: DnsConfigType = 2

public val DNS_CONFIG_PRIMARY_DOMAIN_NAME_W: DnsConfigType = 0

public val DNS_CONFIG_PRIMARY_HOST_NAME_REGISTRATION_ENABLED: DnsConfigType = 9

public val DNS_CONFIG_SEARCH_LIST: DnsConfigType = 7

public val DNS_FREE_FLAT: DnsFreeType = 0

public val DNS_FREE_PARSED_MESSAGE_FIELDS: DnsFreeType = 2

public val DNS_FREE_RECORD_LIST: DnsFreeType = 1

public val DNS_NAME_DOMAIN: DnsNameFormat = 0

public val DNS_NAME_DOMAIN_LABEL: DnsNameFormat = 1

public val DNS_NAME_HOSTNAME_FULL: DnsNameFormat = 2

public val DNS_NAME_HOSTNAME_LABEL: DnsNameFormat = 3

public val DNS_NAME_SRV_RECORD: DnsNameFormat = 5

public val DNS_NAME_VALIDATE_TLD: DnsNameFormat = 6

public val DNS_NAME_WILDCARD: DnsNameFormat = 4

public val DNS_SECTION_ADDTIONAL: DnsSection = 3

public val DNS_SECTION_ANSWER: DnsSection = 1

public val DNS_SECTION_AUTHORITY: DnsSection = 2

public val DNS_SECTION_QUESTION: DnsSection = 0

public val DNS_SVCB_PARAM_ALPN: DnsSvcbParamType = 1

public val DNS_SVCB_PARAM_DOH_PATH: DnsSvcbParamType = 7

public val DNS_SVCB_PARAM_DOH_PATH_OPEN_DNS: DnsSvcbParamType = 65432

public val DNS_SVCB_PARAM_DOH_PATH_QUAD9: DnsSvcbParamType = 65380

public val DNS_SVCB_PARAM_ECH: DnsSvcbParamType = 5

public val DNS_SVCB_PARAM_IPV4HINT: DnsSvcbParamType = 4

public val DNS_SVCB_PARAM_IPV6HINT: DnsSvcbParamType = 6

public val DNS_SVCB_PARAM_MANDATORY: DnsSvcbParamType = 0

public val DNS_SVCB_PARAM_NO_DEFAULT_ALPN: DnsSvcbParamType = 2

public val DNS_SVCB_PARAM_PORT: DnsSvcbParamType = 3

public val IP4_ADDRESS_STRING_BUFFER_LENGTH: UInt = 16u

public val IP4_ADDRESS_STRING_LENGTH: UInt = 16u

public val IP6_ADDRESS_STRING_BUFFER_LENGTH: UInt = 65u

public val IP6_ADDRESS_STRING_LENGTH: UInt = 65u

public val SIZEOF_IP4_ADDRESS: UInt = 4u

public val TAG_DNS_CONNECTION_POLICY_TAG_CONNECTION_MANAGER: DnsConnectionPolicyTag = 1

public val TAG_DNS_CONNECTION_POLICY_TAG_DEFAULT: DnsConnectionPolicyTag = 0

public val TAG_DNS_CONNECTION_POLICY_TAG_WWWPT: DnsConnectionPolicyTag = 2
