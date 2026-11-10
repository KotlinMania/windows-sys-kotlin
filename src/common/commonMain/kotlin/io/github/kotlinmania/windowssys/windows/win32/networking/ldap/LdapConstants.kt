package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val LAPI_MAJOR_VER1: UInt = 1u

public val LAPI_MINOR_VER1: UInt = 1u

public val LBER_DEFAULT: Int = -1

public val LBER_ERROR: Int = -1

public val LBER_TRANSLATE_STRINGS: UInt = 4u

public val LBER_USE_DER: UInt = 1u

public val LBER_USE_INDEFINITE_LEN: UInt = 2u

public val LDAP_ABANDON_CMD: Int = 80

public val LDAP_ADD_CMD: Int = 104

public val LDAP_ADMIN_LIMIT_EXCEEDED: LdapRetcode = 11

public val LDAP_AFFECTS_MULTIPLE_DSAS: LdapRetcode = 71

public val LDAP_ALIAS_DEREF_PROBLEM: LdapRetcode = 36

public val LDAP_ALIAS_PROBLEM: LdapRetcode = 33

public val LDAP_ALREADY_EXISTS: LdapRetcode = 68

public val LDAP_API_FEATURE_VIRTUAL_LIST_VIEW: UInt = 1001u

public val LDAP_API_INFO_VERSION: UInt = 1u

public val LDAP_API_VERSION: UInt = 2004u

public val LDAP_ATTRIBUTE_OR_VALUE_EXISTS: LdapRetcode = 20

public val LDAP_AUTH_METHOD_NOT_SUPPORTED: LdapRetcode = 7

public val LDAP_AUTH_OTHERKIND: Int = 134

public val LDAP_AUTH_SASL: Int = 131

public val LDAP_AUTH_SIMPLE: Int = 128

public val LDAP_AUTH_UNKNOWN: LdapRetcode = 86

public val LDAP_BIND_CMD: Int = 96

public val LDAP_BUSY: LdapRetcode = 51

public val LDAP_CAP_ACTIVE_DIRECTORY_ADAM_OID: Pcstr = s("1.2.840.113556.1.4.1851")

public val LDAP_CAP_ACTIVE_DIRECTORY_ADAM_OID_W: Pcwstr = w("1.2.840.113556.1.4.1851")

public val LDAP_CAP_ACTIVE_DIRECTORY_LDAP_INTEG_OID: Pcstr = s("1.2.840.113556.1.4.1791")

public val LDAP_CAP_ACTIVE_DIRECTORY_LDAP_INTEG_OID_W: Pcwstr = w("1.2.840.113556.1.4.1791")

public val LDAP_CAP_ACTIVE_DIRECTORY_OID: Pcstr = s("1.2.840.113556.1.4.800")

public val LDAP_CAP_ACTIVE_DIRECTORY_OID_W: Pcwstr = w("1.2.840.113556.1.4.800")

public val LDAP_CAP_ACTIVE_DIRECTORY_PARTIAL_SECRETS_OID: Pcstr = s("1.2.840.113556.1.4.1920")

public val LDAP_CAP_ACTIVE_DIRECTORY_PARTIAL_SECRETS_OID_W: Pcwstr = w("1.2.840.113556.1.4.1920")

public val LDAP_CAP_ACTIVE_DIRECTORY_V51_OID: Pcstr = s("1.2.840.113556.1.4.1670")

public val LDAP_CAP_ACTIVE_DIRECTORY_V51_OID_W: Pcwstr = w("1.2.840.113556.1.4.1670")

public val LDAP_CAP_ACTIVE_DIRECTORY_V60_OID: Pcstr = s("1.2.840.113556.1.4.1935")

public val LDAP_CAP_ACTIVE_DIRECTORY_V60_OID_W: Pcwstr = w("1.2.840.113556.1.4.1935")

public val LDAP_CAP_ACTIVE_DIRECTORY_V61_OID: Pcwstr = w("1.2.840.113556.1.4.1935")

public val LDAP_CAP_ACTIVE_DIRECTORY_V61_OID_W: Pcwstr = w("1.2.840.113556.1.4.1935")

public val LDAP_CAP_ACTIVE_DIRECTORY_V61_R2_OID: Pcstr = s("1.2.840.113556.1.4.2080")

public val LDAP_CAP_ACTIVE_DIRECTORY_V61_R2_OID_W: Pcwstr = w("1.2.840.113556.1.4.2080")

public val LDAP_CAP_ACTIVE_DIRECTORY_W8_OID: Pcstr = s("1.2.840.113556.1.4.2237")

public val LDAP_CAP_ACTIVE_DIRECTORY_W8_OID_W: Pcwstr = w("1.2.840.113556.1.4.2237")

public val LDAP_CHASE_EXTERNAL_REFERRALS: UInt = 64u

public val LDAP_CHASE_SUBORDINATE_REFERRALS: UInt = 32u

public val LDAP_CLIENT_LOOP: LdapRetcode = 96

public val LDAP_COMPARE_CMD: Int = 110

public val LDAP_COMPARE_FALSE: LdapRetcode = 5

public val LDAP_COMPARE_TRUE: LdapRetcode = 6

public val LDAP_CONFIDENTIALITY_REQUIRED: LdapRetcode = 13

public val LDAP_CONNECT_ERROR: LdapRetcode = 91

public val LDAP_CONSTRAINT_VIOLATION: LdapRetcode = 19

public val LDAP_CONTROL_NOT_FOUND: LdapRetcode = 93

public val LDAP_CONTROL_REFERRALS: Pcstr = s("1.2.840.113556.1.4.616")

public val LDAP_CONTROL_REFERRALS_W: Pcwstr = w("1.2.840.113556.1.4.616")

public val LDAP_CONTROL_VLVREQUEST: Pcstr = s("2.16.840.1.113730.3.4.9")

public val LDAP_CONTROL_VLVREQUEST_W: Pcwstr = w("2.16.840.1.113730.3.4.9")

public val LDAP_CONTROL_VLVRESPONSE: Pcstr = s("2.16.840.1.113730.3.4.10")

public val LDAP_CONTROL_VLVRESPONSE_W: Pcwstr = w("2.16.840.1.113730.3.4.10")

public val LDAP_DECODING_ERROR: LdapRetcode = 84

public val LDAP_DELETE_CMD: Int = 74

public val LDAP_DEREF_ALWAYS: UInt = 3u

public val LDAP_DEREF_FINDING: UInt = 2u

public val LDAP_DEREF_NEVER: UInt = 0u

public val LDAP_DEREF_SEARCHING: UInt = 1u

public val LDAP_DIRSYNC_ANCESTORS_FIRST_ORDER: UInt = 2048u

public val LDAP_DIRSYNC_INCREMENTAL_VALUES: UInt = 2147483648u

public val LDAP_DIRSYNC_OBJECT_SECURITY: UInt = 1u

public val LDAP_DIRSYNC_PUBLIC_DATA_ONLY: UInt = 8192u

public val LDAP_DIRSYNC_ROPAS_DATA_ONLY: UInt = 1073741824u

public val LDAP_ENCODING_ERROR: LdapRetcode = 83

public val LDAP_EXTENDED_CMD: Int = 119

public val LDAP_FEATURE_INFO_VERSION: UInt = 1u

public val LDAP_FILTER_AND: UInt = 160u

public val LDAP_FILTER_APPROX: UInt = 168u

public val LDAP_FILTER_EQUALITY: UInt = 163u

public val LDAP_FILTER_ERROR: LdapRetcode = 87

public val LDAP_FILTER_EXTENSIBLE: UInt = 169u

public val LDAP_FILTER_GE: UInt = 165u

public val LDAP_FILTER_LE: UInt = 166u

public val LDAP_FILTER_NOT: UInt = 162u

public val LDAP_FILTER_OR: UInt = 161u

public val LDAP_FILTER_PRESENT: UInt = 135u

public val LDAP_FILTER_SUBSTRINGS: UInt = 164u

public val LDAP_GC_PORT: UInt = 3268u

public val LDAP_INAPPROPRIATE_AUTH: LdapRetcode = 48

public val LDAP_INAPPROPRIATE_MATCHING: LdapRetcode = 18

public val LDAP_INSUFFICIENT_RIGHTS: LdapRetcode = 50

public val LDAP_INVALID_CMD: UInt = 255u

public val LDAP_INVALID_CREDENTIALS: LdapRetcode = 49

public val LDAP_INVALID_DN_SYNTAX: LdapRetcode = 34

public val LDAP_INVALID_RES: UInt = 255u

public val LDAP_INVALID_SYNTAX: LdapRetcode = 21

public val LDAP_IS_LEAF: LdapRetcode = 35

public val LDAP_LOCAL_ERROR: LdapRetcode = 82

public val LDAP_LOOP_DETECT: LdapRetcode = 54

public val LDAP_MATCHING_RULE_BIT_AND: Pcstr = s("1.2.840.113556.1.4.803")

public val LDAP_MATCHING_RULE_BIT_AND_W: Pcwstr = w("1.2.840.113556.1.4.803")

public val LDAP_MATCHING_RULE_BIT_OR: Pcstr = s("1.2.840.113556.1.4.804")

public val LDAP_MATCHING_RULE_BIT_OR_W: Pcwstr = w("1.2.840.113556.1.4.804")

public val LDAP_MATCHING_RULE_DN_BINARY_COMPLEX: Pcstr = s("1.2.840.113556.1.4.2253")

public val LDAP_MATCHING_RULE_DN_BINARY_COMPLEX_W: Pcwstr = w("1.2.840.113556.1.4.2253")

public val LDAP_MATCHING_RULE_TRANSITIVE_EVALUATION: Pcstr = s("1.2.840.113556.1.4.1941")

public val LDAP_MATCHING_RULE_TRANSITIVE_EVALUATION_W: Pcwstr = w("1.2.840.113556.1.4.1941")

public val LDAP_MODIFY_CMD: Int = 102

public val LDAP_MODRDN_CMD: Int = 108

public val LDAP_MOD_ADD: UInt = 0u

public val LDAP_MOD_BVALUES: UInt = 128u

public val LDAP_MOD_DELETE: UInt = 1u

public val LDAP_MOD_REPLACE: UInt = 2u

public val LDAP_MORE_RESULTS_TO_RETURN: LdapRetcode = 95

public val LDAP_MSG_ALL: UInt = 1u

public val LDAP_MSG_ONE: UInt = 0u

public val LDAP_MSG_RECEIVED: UInt = 2u

public val LDAP_NAMING_VIOLATION: LdapRetcode = 64

public val LDAP_NOT_ALLOWED_ON_NONLEAF: LdapRetcode = 66

public val LDAP_NOT_ALLOWED_ON_RDN: LdapRetcode = 67

public val LDAP_NOT_SUPPORTED: LdapRetcode = 92

public val LDAP_NO_LIMIT: UInt = 0u

public val LDAP_NO_MEMORY: LdapRetcode = 90

public val LDAP_NO_OBJECT_CLASS_MODS: LdapRetcode = 69

public val LDAP_NO_RESULTS_RETURNED: LdapRetcode = 94

public val LDAP_NO_SUCH_ATTRIBUTE: LdapRetcode = 16

public val LDAP_NO_SUCH_OBJECT: LdapRetcode = 32

public val LDAP_OBJECT_CLASS_VIOLATION: LdapRetcode = 65

public val LDAP_OFFSET_RANGE_ERROR: LdapRetcode = 61

public val LDAP_OPATT_ABANDON_REPL: Pcstr = s("abandonReplication")

public val LDAP_OPATT_ABANDON_REPL_W: Pcwstr = w("abandonReplication")

public val LDAP_OPATT_BECOME_DOM_MASTER: Pcstr = s("becomeDomainMaster")

public val LDAP_OPATT_BECOME_DOM_MASTER_W: Pcwstr = w("becomeDomainMaster")

public val LDAP_OPATT_BECOME_PDC: Pcstr = s("becomePdc")

public val LDAP_OPATT_BECOME_PDC_W: Pcwstr = w("becomePdc")

public val LDAP_OPATT_BECOME_RID_MASTER: Pcstr = s("becomeRidMaster")

public val LDAP_OPATT_BECOME_RID_MASTER_W: Pcwstr = w("becomeRidMaster")

public val LDAP_OPATT_BECOME_SCHEMA_MASTER: Pcstr = s("becomeSchemaMaster")

public val LDAP_OPATT_BECOME_SCHEMA_MASTER_W: Pcwstr = w("becomeSchemaMaster")

public val LDAP_OPATT_CONFIG_NAMING_CONTEXT: Pcstr = s("configurationNamingContext")

public val LDAP_OPATT_CONFIG_NAMING_CONTEXT_W: Pcwstr = w("configurationNamingContext")

public val LDAP_OPATT_CURRENT_TIME: Pcstr = s("currentTime")

public val LDAP_OPATT_CURRENT_TIME_W: Pcwstr = w("currentTime")

public val LDAP_OPATT_DEFAULT_NAMING_CONTEXT: Pcstr = s("defaultNamingContext")

public val LDAP_OPATT_DEFAULT_NAMING_CONTEXT_W: Pcwstr = w("defaultNamingContext")

public val LDAP_OPATT_DNS_HOST_NAME: Pcstr = s("dnsHostName")

public val LDAP_OPATT_DNS_HOST_NAME_W: Pcwstr = w("dnsHostName")

public val LDAP_OPATT_DO_GARBAGE_COLLECTION: Pcstr = s("doGarbageCollection")

public val LDAP_OPATT_DO_GARBAGE_COLLECTION_W: Pcwstr = w("doGarbageCollection")

public val LDAP_OPATT_DS_SERVICE_NAME: Pcstr = s("dsServiceName")

public val LDAP_OPATT_DS_SERVICE_NAME_W: Pcwstr = w("dsServiceName")

public val LDAP_OPATT_FIXUP_INHERITANCE: Pcstr = s("fixupInheritance")

public val LDAP_OPATT_FIXUP_INHERITANCE_W: Pcwstr = w("fixupInheritance")

public val LDAP_OPATT_HIGHEST_COMMITTED_USN: Pcstr = s("highestCommitedUSN")

public val LDAP_OPATT_HIGHEST_COMMITTED_USN_W: Pcwstr = w("highestCommitedUSN")

public val LDAP_OPATT_INVALIDATE_RID_POOL: Pcstr = s("invalidateRidPool")

public val LDAP_OPATT_INVALIDATE_RID_POOL_W: Pcwstr = w("invalidateRidPool")

public val LDAP_OPATT_LDAP_SERVICE_NAME: Pcstr = s("ldapServiceName")

public val LDAP_OPATT_LDAP_SERVICE_NAME_W: Pcwstr = w("ldapServiceName")

public val LDAP_OPATT_NAMING_CONTEXTS: Pcstr = s("namingContexts")

public val LDAP_OPATT_NAMING_CONTEXTS_W: Pcwstr = w("namingContexts")

public val LDAP_OPATT_RECALC_HIERARCHY: Pcstr = s("recalcHierarchy")

public val LDAP_OPATT_RECALC_HIERARCHY_W: Pcwstr = w("recalcHierarchy")

public val LDAP_OPATT_ROOT_DOMAIN_NAMING_CONTEXT: Pcstr = s("rootDomainNamingContext")

public val LDAP_OPATT_ROOT_DOMAIN_NAMING_CONTEXT_W: Pcwstr = w("rootDomainNamingContext")

public val LDAP_OPATT_SCHEMA_NAMING_CONTEXT: Pcstr = s("schemaNamingContext")

public val LDAP_OPATT_SCHEMA_NAMING_CONTEXT_W: Pcwstr = w("schemaNamingContext")

public val LDAP_OPATT_SCHEMA_UPDATE_NOW: Pcstr = s("schemaUpdateNow")

public val LDAP_OPATT_SCHEMA_UPDATE_NOW_W: Pcwstr = w("schemaUpdateNow")

public val LDAP_OPATT_SERVER_NAME: Pcstr = s("serverName")

public val LDAP_OPATT_SERVER_NAME_W: Pcwstr = w("serverName")

public val LDAP_OPATT_SUBSCHEMA_SUBENTRY: Pcstr = s("subschemaSubentry")

public val LDAP_OPATT_SUBSCHEMA_SUBENTRY_W: Pcwstr = w("subschemaSubentry")

public val LDAP_OPATT_SUPPORTED_CAPABILITIES: Pcstr = s("supportedCapabilities")

public val LDAP_OPATT_SUPPORTED_CAPABILITIES_W: Pcwstr = w("supportedCapabilities")

public val LDAP_OPATT_SUPPORTED_CONTROL: Pcstr = s("supportedControl")

public val LDAP_OPATT_SUPPORTED_CONTROL_W: Pcwstr = w("supportedControl")

public val LDAP_OPATT_SUPPORTED_LDAP_POLICIES: Pcstr = s("supportedLDAPPolicies")

public val LDAP_OPATT_SUPPORTED_LDAP_POLICIES_W: Pcwstr = w("supportedLDAPPolicies")

public val LDAP_OPATT_SUPPORTED_LDAP_VERSION: Pcstr = s("supportedLDAPVersion")

public val LDAP_OPATT_SUPPORTED_LDAP_VERSION_W: Pcwstr = w("supportedLDAPVersion")

public val LDAP_OPATT_SUPPORTED_SASL_MECHANISM: Pcstr = s("supportedSASLMechanisms")

public val LDAP_OPATT_SUPPORTED_SASL_MECHANISM_W: Pcwstr = w("supportedSASLMechanisms")

public val LDAP_OPERATIONS_ERROR: LdapRetcode = 1

public val LDAP_OPT_API_FEATURE_INFO: UInt = 21u

public val LDAP_OPT_API_INFO: UInt = 0u

public val LDAP_OPT_AREC_EXCLUSIVE: UInt = 152u

public val LDAP_OPT_AUTO_RECONNECT: UInt = 145u

public val LDAP_OPT_CACHE_ENABLE: UInt = 15u

public val LDAP_OPT_CACHE_FN_PTRS: UInt = 13u

public val LDAP_OPT_CACHE_STRATEGY: UInt = 14u

public val LDAP_OPT_CHASE_REFERRALS: UInt = 2u

public val LDAP_OPT_CLDAP_TIMEOUT: UInt = 69u

public val LDAP_OPT_CLDAP_TRIES: UInt = 70u

public val LDAP_OPT_CLIENT_CERTIFICATE: UInt = 128u

public val LDAP_OPT_DEREF: UInt = 2u

public val LDAP_OPT_DESC: UInt = 1u

public val LDAP_OPT_DNS: UInt = 1u

public val LDAP_OPT_DNSDOMAIN_NAME: UInt = 59u

public val LDAP_OPT_ENCRYPT: UInt = 150u

public val LDAP_OPT_ERROR_NUMBER: UInt = 49u

public val LDAP_OPT_ERROR_STRING: UInt = 50u

public val LDAP_OPT_FAST_CONCURRENT_BIND: UInt = 65u

public val LDAP_OPT_GETDSNAME_FLAGS: UInt = 61u

public val LDAP_OPT_HOST_NAME: UInt = 48u

public val LDAP_OPT_HOST_REACHABLE: UInt = 62u

public val LDAP_OPT_IO_FN_PTRS: UInt = 11u

public val LDAP_OPT_PING_KEEP_ALIVE: UInt = 54u

public val LDAP_OPT_PING_LIMIT: UInt = 56u

public val LDAP_OPT_PING_WAIT_TIME: UInt = 55u

public val LDAP_OPT_PROMPT_CREDENTIALS: UInt = 63u

public val LDAP_OPT_PROTOCOL_VERSION: UInt = 17u

public val LDAP_OPT_REBIND_ARG: UInt = 7u

public val LDAP_OPT_REBIND_FN: UInt = 6u

public val LDAP_OPT_REFERRALS: UInt = 8u

public val LDAP_OPT_REFERRAL_CALLBACK: UInt = 112u

public val LDAP_OPT_REFERRAL_HOP_LIMIT: UInt = 16u

public val LDAP_OPT_REF_DEREF_CONN_PER_MSG: UInt = 148u

public val LDAP_OPT_RESTART: UInt = 9u

public val LDAP_OPT_RETURN_REFS: UInt = 4u

public val LDAP_OPT_ROOTDSE_CACHE: UInt = 154u

public val LDAP_OPT_SASL_METHOD: UInt = 151u

public val LDAP_OPT_SCH_FLAGS: UInt = 67u

public val LDAP_OPT_SECURITY_CONTEXT: UInt = 153u

public val LDAP_OPT_SEND_TIMEOUT: UInt = 66u

public val LDAP_OPT_SERVER_CERTIFICATE: UInt = 129u

public val LDAP_OPT_SERVER_ERROR: UInt = 51u

public val LDAP_OPT_SERVER_EXT_ERROR: UInt = 52u

public val LDAP_OPT_SIGN: UInt = 149u

public val LDAP_OPT_SIZELIMIT: UInt = 3u

public val LDAP_OPT_SOCKET_BIND_ADDRESSES: UInt = 68u

public val LDAP_OPT_SSL: UInt = 10u

public val LDAP_OPT_SSL_INFO: UInt = 147u

public val LDAP_OPT_SSPI_FLAGS: UInt = 146u

public val LDAP_OPT_TCP_KEEPALIVE: UInt = 64u

public val LDAP_OPT_THREAD_FN_PTRS: UInt = 5u

public val LDAP_OPT_TIMELIMIT: UInt = 4u

public val LDAP_OPT_TLS: UInt = 10u

public val LDAP_OPT_TLS_INFO: UInt = 147u

public val LDAP_OPT_VERSION: UInt = 17u

public val LDAP_OTHER: LdapRetcode = 80

public val LDAP_PAGED_RESULT_OID_STRING: Pcstr = s("1.2.840.113556.1.4.319")

public val LDAP_PAGED_RESULT_OID_STRING_W: Pcwstr = w("1.2.840.113556.1.4.319")

public val LDAP_PARAM_ERROR: LdapRetcode = 89

public val LDAP_PARTIAL_RESULTS: LdapRetcode = 9

public val LDAP_POLICYHINT_APPLY_FULLPWDPOLICY: UInt = 1u

public val LDAP_PORT: UInt = 389u

public val LDAP_PROTOCOL_ERROR: LdapRetcode = 2

public val LDAP_REFERRAL: LdapRetcode = 10

public val LDAP_REFERRAL_LIMIT_EXCEEDED: LdapRetcode = 97

public val LDAP_REFERRAL_V2: LdapRetcode = 9

public val LDAP_RESULTS_TOO_LARGE: LdapRetcode = 70

public val LDAP_RES_ADD: Int = 105

public val LDAP_RES_ANY: Int = -1

public val LDAP_RES_BIND: Int = 97

public val LDAP_RES_COMPARE: Int = 111

public val LDAP_RES_DELETE: Int = 107

public val LDAP_RES_EXTENDED: Int = 120

public val LDAP_RES_MODIFY: Int = 103

public val LDAP_RES_MODRDN: Int = 109

public val LDAP_RES_REFERRAL: Int = 115

public val LDAP_RES_SEARCH_ENTRY: Int = 100

public val LDAP_RES_SEARCH_RESULT: Int = 101

public val LDAP_RES_SESSION: Int = 114

public val LDAP_SASL_BIND_IN_PROGRESS: LdapRetcode = 14

public val LDAP_SCOPE_BASE: UInt = 0u

public val LDAP_SCOPE_ONELEVEL: UInt = 1u

public val LDAP_SCOPE_SUBTREE: UInt = 2u

public val LDAP_SEARCH_CMD: Int = 99

public val LDAP_SEARCH_HINT_INDEX_ONLY_OID: Pcstr = s("1.2.840.113556.1.4.2207")

public val LDAP_SEARCH_HINT_INDEX_ONLY_OID_W: Pcwstr = w("1.2.840.113556.1.4.2207")

public val LDAP_SEARCH_HINT_REQUIRED_INDEX_OID: Pcstr = s("1.2.840.113556.1.4.2306")

public val LDAP_SEARCH_HINT_REQUIRED_INDEX_OID_W: Pcwstr = w("1.2.840.113556.1.4.2306")

public val LDAP_SEARCH_HINT_SOFT_SIZE_LIMIT_OID: Pcstr = s("1.2.840.113556.1.4.2210")

public val LDAP_SEARCH_HINT_SOFT_SIZE_LIMIT_OID_W: Pcwstr = w("1.2.840.113556.1.4.2210")

public val LDAP_SERVER_ASQ_OID: Pcstr = s("1.2.840.113556.1.4.1504")

public val LDAP_SERVER_ASQ_OID_W: Pcwstr = w("1.2.840.113556.1.4.1504")

public val LDAP_SERVER_BATCH_REQUEST_OID: Pcstr = s("1.2.840.113556.1.4.2212")

public val LDAP_SERVER_BATCH_REQUEST_OID_W: Pcwstr = w("1.2.840.113556.1.4.2212")

public val LDAP_SERVER_BYPASS_QUOTA_OID: Pcstr = s("1.2.840.113556.1.4.2256")

public val LDAP_SERVER_BYPASS_QUOTA_OID_W: Pcwstr = w("1.2.840.113556.1.4.2256")

public val LDAP_SERVER_CROSSDOM_MOVE_TARGET_OID: Pcstr = s("1.2.840.113556.1.4.521")

public val LDAP_SERVER_CROSSDOM_MOVE_TARGET_OID_W: Pcwstr = w("1.2.840.113556.1.4.521")

public val LDAP_SERVER_DIRSYNC_EX_OID: Pcstr = s("1.2.840.113556.1.4.2090")

public val LDAP_SERVER_DIRSYNC_EX_OID_W: Pcwstr = w("1.2.840.113556.1.4.2090")

public val LDAP_SERVER_DIRSYNC_OID: Pcstr = s("1.2.840.113556.1.4.841")

public val LDAP_SERVER_DIRSYNC_OID_W: Pcwstr = w("1.2.840.113556.1.4.841")

public val LDAP_SERVER_DN_INPUT_OID: Pcstr = s("1.2.840.113556.1.4.2026")

public val LDAP_SERVER_DN_INPUT_OID_W: Pcwstr = w("1.2.840.113556.1.4.2026")

public val LDAP_SERVER_DOMAIN_SCOPE_OID: Pcstr = s("1.2.840.113556.1.4.1339")

public val LDAP_SERVER_DOMAIN_SCOPE_OID_W: Pcwstr = w("1.2.840.113556.1.4.1339")

public val LDAP_SERVER_DOWN: LdapRetcode = 81

public val LDAP_SERVER_EXPECTED_ENTRY_COUNT_OID: Pcstr = s("1.2.840.113556.1.4.2211")

public val LDAP_SERVER_EXPECTED_ENTRY_COUNT_OID_W: Pcwstr = w("1.2.840.113556.1.4.2211")

public val LDAP_SERVER_EXTENDED_DN_OID: Pcstr = s("1.2.840.113556.1.4.529")

public val LDAP_SERVER_EXTENDED_DN_OID_W: Pcwstr = w("1.2.840.113556.1.4.529")

public val LDAP_SERVER_FAST_BIND_OID: Pcstr = s("1.2.840.113556.1.4.1781")

public val LDAP_SERVER_FAST_BIND_OID_W: Pcwstr = w("1.2.840.113556.1.4.1781")

public val LDAP_SERVER_FORCE_UPDATE_OID: Pcstr = s("1.2.840.113556.1.4.1974")

public val LDAP_SERVER_FORCE_UPDATE_OID_W: Pcwstr = w("1.2.840.113556.1.4.1974")

public val LDAP_SERVER_GET_STATS_OID: Pcstr = s("1.2.840.113556.1.4.970")

public val LDAP_SERVER_GET_STATS_OID_W: Pcwstr = w("1.2.840.113556.1.4.970")

public val LDAP_SERVER_LAZY_COMMIT_OID: Pcstr = s("1.2.840.113556.1.4.619")

public val LDAP_SERVER_LAZY_COMMIT_OID_W: Pcwstr = w("1.2.840.113556.1.4.619")

public val LDAP_SERVER_LINK_TTL_OID: Pcstr = s("1.2.840.113556.1.4.2309")

public val LDAP_SERVER_LINK_TTL_OID_W: Pcwstr = w("1.2.840.113556.1.4.2309")

public val LDAP_SERVER_NOTIFICATION_OID: Pcstr = s("1.2.840.113556.1.4.528")

public val LDAP_SERVER_NOTIFICATION_OID_W: Pcwstr = w("1.2.840.113556.1.4.528")

public val LDAP_SERVER_PERMISSIVE_MODIFY_OID: Pcstr = s("1.2.840.113556.1.4.1413")

public val LDAP_SERVER_PERMISSIVE_MODIFY_OID_W: Pcwstr = w("1.2.840.113556.1.4.1413")

public val LDAP_SERVER_POLICY_HINTS_DEPRECATED_OID: Pcstr = s("1.2.840.113556.1.4.2066")

public val LDAP_SERVER_POLICY_HINTS_DEPRECATED_OID_W: Pcwstr = w("1.2.840.113556.1.4.2066")

public val LDAP_SERVER_POLICY_HINTS_OID: Pcstr = s("1.2.840.113556.1.4.2239")

public val LDAP_SERVER_POLICY_HINTS_OID_W: Pcwstr = w("1.2.840.113556.1.4.2239")

public val LDAP_SERVER_QUOTA_CONTROL_OID: Pcstr = s("1.2.840.113556.1.4.1852")

public val LDAP_SERVER_QUOTA_CONTROL_OID_W: Pcwstr = w("1.2.840.113556.1.4.1852")

public val LDAP_SERVER_RANGE_OPTION_OID: Pcstr = s("1.2.840.113556.1.4.802")

public val LDAP_SERVER_RANGE_OPTION_OID_W: Pcwstr = w("1.2.840.113556.1.4.802")

public val LDAP_SERVER_RANGE_RETRIEVAL_NOERR_OID: Pcstr = s("1.2.840.113556.1.4.1948")

public val LDAP_SERVER_RANGE_RETRIEVAL_NOERR_OID_W: Pcwstr = w("1.2.840.113556.1.4.1948")

public val LDAP_SERVER_RESP_SORT_OID: Pcstr = s("1.2.840.113556.1.4.474")

public val LDAP_SERVER_RESP_SORT_OID_W: Pcwstr = w("1.2.840.113556.1.4.474")

public val LDAP_SERVER_SD_FLAGS_OID: Pcstr = s("1.2.840.113556.1.4.801")

public val LDAP_SERVER_SD_FLAGS_OID_W: Pcwstr = w("1.2.840.113556.1.4.801")

public val LDAP_SERVER_SEARCH_HINTS_OID: Pcstr = s("1.2.840.113556.1.4.2206")

public val LDAP_SERVER_SEARCH_HINTS_OID_W: Pcwstr = w("1.2.840.113556.1.4.2206")

public val LDAP_SERVER_SEARCH_OPTIONS_OID: Pcstr = s("1.2.840.113556.1.4.1340")

public val LDAP_SERVER_SEARCH_OPTIONS_OID_W: Pcwstr = w("1.2.840.113556.1.4.1340")

public val LDAP_SERVER_SET_OWNER_OID: Pcstr = s("1.2.840.113556.1.4.2255")

public val LDAP_SERVER_SET_OWNER_OID_W: Pcwstr = w("1.2.840.113556.1.4.2255")

public val LDAP_SERVER_SHOW_DEACTIVATED_LINK_OID: Pcstr = s("1.2.840.113556.1.4.2065")

public val LDAP_SERVER_SHOW_DEACTIVATED_LINK_OID_W: Pcwstr = w("1.2.840.113556.1.4.2065")

public val LDAP_SERVER_SHOW_DELETED_OID: Pcstr = s("1.2.840.113556.1.4.417")

public val LDAP_SERVER_SHOW_DELETED_OID_W: Pcwstr = w("1.2.840.113556.1.4.417")

public val LDAP_SERVER_SHOW_RECYCLED_OID: Pcstr = s("1.2.840.113556.1.4.2064")

public val LDAP_SERVER_SHOW_RECYCLED_OID_W: Pcwstr = w("1.2.840.113556.1.4.2064")

public val LDAP_SERVER_SHUTDOWN_NOTIFY_OID: Pcstr = s("1.2.840.113556.1.4.1907")

public val LDAP_SERVER_SHUTDOWN_NOTIFY_OID_W: Pcwstr = w("1.2.840.113556.1.4.1907")

public val LDAP_SERVER_SORT_OID: Pcstr = s("1.2.840.113556.1.4.473")

public val LDAP_SERVER_SORT_OID_W: Pcwstr = w("1.2.840.113556.1.4.473")

public val LDAP_SERVER_TREE_DELETE_EX_OID: Pcstr = s("1.2.840.113556.1.4.2204")

public val LDAP_SERVER_TREE_DELETE_EX_OID_W: Pcwstr = w("1.2.840.113556.1.4.2204")

public val LDAP_SERVER_TREE_DELETE_OID: Pcstr = s("1.2.840.113556.1.4.805")

public val LDAP_SERVER_TREE_DELETE_OID_W: Pcwstr = w("1.2.840.113556.1.4.805")

public val LDAP_SERVER_UPDATE_STATS_OID: Pcstr = s("1.2.840.113556.1.4.2205")

public val LDAP_SERVER_UPDATE_STATS_OID_W: Pcwstr = w("1.2.840.113556.1.4.2205")

public val LDAP_SERVER_VERIFY_NAME_OID: Pcstr = s("1.2.840.113556.1.4.1338")

public val LDAP_SERVER_VERIFY_NAME_OID_W: Pcwstr = w("1.2.840.113556.1.4.1338")

public val LDAP_SERVER_WHO_AM_I_OID: Pcstr = s("1.3.6.1.4.1.4203.1.11.3")

public val LDAP_SERVER_WHO_AM_I_OID_W: Pcwstr = w("1.3.6.1.4.1.4203.1.11.3")

public val LDAP_SESSION_CMD: Int = 113

public val LDAP_SIZELIMIT_EXCEEDED: LdapRetcode = 4

public val LDAP_SORT_CONTROL_MISSING: LdapRetcode = 60

public val LDAP_SSL_GC_PORT: UInt = 3269u

public val LDAP_SSL_PORT: UInt = 636u

public val LDAP_START_TLS_OID: Pcstr = s("1.3.6.1.4.1.1466.20037")

public val LDAP_START_TLS_OID_W: Pcwstr = w("1.3.6.1.4.1.1466.20037")

public val LDAP_STRONG_AUTH_REQUIRED: LdapRetcode = 8

public val LDAP_SUBSTRING_ANY: Int = 129

public val LDAP_SUBSTRING_FINAL: Int = 130

public val LDAP_SUBSTRING_INITIAL: Int = 128

public val LDAP_SUCCESS: LdapRetcode = 0

public val LDAP_TIMELIMIT_EXCEEDED: LdapRetcode = 3

public val LDAP_TIMEOUT: LdapRetcode = 85

public val LDAP_TTL_EXTENDED_OP_OID: Pcstr = s("1.3.6.1.4.1.1466.101.119.1")

public val LDAP_TTL_EXTENDED_OP_OID_W: Pcwstr = w("1.3.6.1.4.1.1466.101.119.1")

public val LDAP_UNAVAILABLE: LdapRetcode = 52

public val LDAP_UNAVAILABLE_CRIT_EXTENSION: LdapRetcode = 12

public val LDAP_UNBIND_CMD: Int = 66

public val LDAP_UNDEFINED_TYPE: LdapRetcode = 17

public val LDAP_UNICODE: UInt = 1u

public val LDAP_UNWILLING_TO_PERFORM: LdapRetcode = 53

public val LDAP_UPDATE_STATS_INVOCATIONID_OID: Pcstr = s("1.2.840.113556.1.4.2209")

public val LDAP_UPDATE_STATS_INVOCATIONID_OID_W: Pcwstr = w("1.2.840.113556.1.4.2209")

public val LDAP_UPDATE_STATS_USN_OID: Pcstr = s("1.2.840.113556.1.4.2208")

public val LDAP_UPDATE_STATS_USN_OID_W: Pcwstr = w("1.2.840.113556.1.4.2208")

public val LDAP_USER_CANCELLED: LdapRetcode = 88

public val LDAP_VENDOR_NAME: Pcstr = s("Microsoft Corporation.")

public val LDAP_VENDOR_NAME_W: Pcwstr = w("Microsoft Corporation.")

public val LDAP_VENDOR_VERSION: UInt = 510u

public val LDAP_VERSION: UInt = 2u

public val LDAP_VERSION1: UInt = 1u

public val LDAP_VERSION2: UInt = 2u

public val LDAP_VERSION3: UInt = 3u

public val LDAP_VERSION_MAX: UInt = 3u

public val LDAP_VERSION_MIN: UInt = 2u

public val LDAP_VIRTUAL_LIST_VIEW_ERROR: LdapRetcode = 76

public val LDAP_VLVINFO_VERSION: UInt = 1u

public val SERVER_SEARCH_FLAG_DOMAIN_SCOPE: UInt = 1u

public val SERVER_SEARCH_FLAG_PHANTOM_ROOT: UInt = 2u
