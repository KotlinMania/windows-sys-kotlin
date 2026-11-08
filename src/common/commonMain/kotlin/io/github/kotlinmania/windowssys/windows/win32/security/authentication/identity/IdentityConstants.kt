package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACCOUNT_ADJUST_PRIVILEGES: Int = 2

public val ACCOUNT_ADJUST_QUOTAS: Int = 4

public val ACCOUNT_ADJUST_SYSTEM_ACCESS: Int = 8

public val ACCOUNT_VIEW: Int = 1

public val ASC_REQ_ALLOCATE_MEMORY: ASC_REQ_FLAGS = 256u

public val ASC_REQ_ALLOW_CONTEXT_REPLAY: ASC_REQ_FLAGS = 4194304u

public val ASC_REQ_ALLOW_MISSING_BINDINGS: ASC_REQ_FLAGS = 268435456u

public val ASC_REQ_ALLOW_NON_USER_LOGONS: ASC_REQ_FLAGS = 2097152u

public val ASC_REQ_ALLOW_NULL_SESSION: ASC_REQ_FLAGS = 1048576u

public val ASC_REQ_CALL_LEVEL: ASC_REQ_FLAGS = 4096u

public val ASC_REQ_CONFIDENTIALITY: ASC_REQ_FLAGS = 16u

public val ASC_REQ_CONNECTION: ASC_REQ_FLAGS = 2048u

public val ASC_REQ_DATAGRAM: ASC_REQ_FLAGS = 1024u

public val ASC_REQ_DELEGATE: ASC_REQ_FLAGS = 1u

public val ASC_REQ_EXTENDED_ERROR: ASC_REQ_FLAGS = 32768u

public val ASC_REQ_FRAGMENT_SUPPLIED: ASC_REQ_FLAGS = 8192u

public val ASC_REQ_FRAGMENT_TO_FIT: ASC_REQ_FLAGS = 8388608u

public val ASC_REQ_IDENTIFY: ASC_REQ_FLAGS = 524288u

public val ASC_REQ_INTEGRITY: ASC_REQ_FLAGS = 131072u

public val ASC_REQ_LICENSING: ASC_REQ_FLAGS = 262144u

public val ASC_REQ_MESSAGES: ASC_REQ_HIGH_FLAGS = 4294967296uL

public val ASC_REQ_MUTUAL_AUTH: ASC_REQ_FLAGS = 2u

public val ASC_REQ_NO_TOKEN: ASC_REQ_FLAGS = 16777216u

public val ASC_REQ_PROXY_BINDINGS: ASC_REQ_FLAGS = 67108864u

public val ASC_REQ_REPLAY_DETECT: ASC_REQ_FLAGS = 4u

public val ASC_REQ_SEQUENCE_DETECT: ASC_REQ_FLAGS = 8u

public val ASC_REQ_SESSION_TICKET: ASC_REQ_FLAGS = 64u

public val ASC_REQ_STREAM: ASC_REQ_FLAGS = 65536u

public val ASC_REQ_USE_DCE_STYLE: ASC_REQ_FLAGS = 512u

public val ASC_REQ_USE_SESSION_KEY: ASC_REQ_FLAGS = 32u

public val ASC_RET_ALLOCATED_MEMORY: UInt = 256u

public val ASC_RET_ALLOW_CONTEXT_REPLAY: UInt = 4194304u

public val ASC_RET_ALLOW_NON_USER_LOGONS: UInt = 2097152u

public val ASC_RET_CALL_LEVEL: UInt = 8192u

public val ASC_RET_CONFIDENTIALITY: UInt = 16u

public val ASC_RET_CONNECTION: UInt = 2048u

public val ASC_RET_DATAGRAM: UInt = 1024u

public val ASC_RET_DELEGATE: UInt = 1u

public val ASC_RET_EXTENDED_ERROR: UInt = 32768u

public val ASC_RET_FRAGMENT_ONLY: UInt = 8388608u

public val ASC_RET_IDENTIFY: UInt = 524288u

public val ASC_RET_INTEGRITY: UInt = 131072u

public val ASC_RET_LICENSING: UInt = 262144u

public val ASC_RET_MESSAGES: ULong = 4294967296uL

public val ASC_RET_MUTUAL_AUTH: UInt = 2u

public val ASC_RET_NO_ADDITIONAL_TOKEN: UInt = 33554432u

public val ASC_RET_NO_TOKEN: UInt = 16777216u

public val ASC_RET_NULL_SESSION: UInt = 1048576u

public val ASC_RET_REPLAY_DETECT: UInt = 4u

public val ASC_RET_SEQUENCE_DETECT: UInt = 8u

public val ASC_RET_SESSION_TICKET: UInt = 64u

public val ASC_RET_STREAM: UInt = 65536u

public val ASC_RET_THIRD_LEG_FAILED: UInt = 16384u

public val ASC_RET_USED_DCE_STYLE: UInt = 512u

public val ASC_RET_USE_SESSION_KEY: UInt = 32u

public val AUDIT_ENUMERATE_USERS: UInt = 16u

public val AUDIT_QUERY_MISC_POLICY: UInt = 64u

public val AUDIT_QUERY_SYSTEM_POLICY: UInt = 2u

public val AUDIT_QUERY_USER_POLICY: UInt = 8u

public val AUDIT_SET_MISC_POLICY: UInt = 32u

public val AUDIT_SET_SYSTEM_POLICY: UInt = 1u

public val AUDIT_SET_USER_POLICY: UInt = 4u

public val AUTH_REQ_ALLOW_ENC_TKT_IN_SKEY: UInt = 32u

public val AUTH_REQ_ALLOW_FORWARDABLE: UInt = 1u

public val AUTH_REQ_ALLOW_NOADDRESS: UInt = 16u

public val AUTH_REQ_ALLOW_POSTDATE: UInt = 4u

public val AUTH_REQ_ALLOW_PROXIABLE: UInt = 2u

public val AUTH_REQ_ALLOW_RENEWABLE: UInt = 8u

public val AUTH_REQ_ALLOW_S4U_DELEGATE: UInt = 2048u

public val AUTH_REQ_ALLOW_VALIDATE: UInt = 64u

public val AUTH_REQ_OK_AS_DELEGATE: UInt = 256u

public val AUTH_REQ_PREAUTH_REQUIRED: UInt = 512u

public val AUTH_REQ_TRANSITIVE_TRUST: UInt = 1024u

public val AUTH_REQ_VALIDATE_CLIENT: UInt = 128u

public val AccountDomainInformation: LSA_LOOKUP_DOMAIN_INFO_CLASS = 5

public val AuditCategoryAccountLogon: POLICY_AUDIT_EVENT_TYPE = 8

public val AuditCategoryAccountManagement: POLICY_AUDIT_EVENT_TYPE = 6

public val AuditCategoryDetailedTracking: POLICY_AUDIT_EVENT_TYPE = 4

public val AuditCategoryDirectoryServiceAccess: POLICY_AUDIT_EVENT_TYPE = 7

public val AuditCategoryLogon: POLICY_AUDIT_EVENT_TYPE = 1

public val AuditCategoryObjectAccess: POLICY_AUDIT_EVENT_TYPE = 2

public val AuditCategoryPolicyChange: POLICY_AUDIT_EVENT_TYPE = 5

public val AuditCategoryPrivilegeUse: POLICY_AUDIT_EVENT_TYPE = 3

public val AuditCategorySystem: POLICY_AUDIT_EVENT_TYPE = 0

public val Audit_AccountLogon: GUID = GUID.from_u128(U128(0x69979850797a11d9uL, 0xbed3505054503030uL))

public val Audit_AccountLogon_CredentialValidation: GUID = GUID.from_u128(U128(0xcce923f69ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountLogon_KerbCredentialValidation: GUID = GUID.from_u128(U128(0xcce924269ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountLogon_Kerberos: GUID = GUID.from_u128(U128(0xcce924069ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountLogon_Others: GUID = GUID.from_u128(U128(0xcce924169ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountManagement: GUID = GUID.from_u128(U128(0x6997984e797a11d9uL, 0xbed3505054503030uL))

public val Audit_AccountManagement_ApplicationGroup: GUID = GUID.from_u128(U128(0xcce923969ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountManagement_ComputerAccount: GUID = GUID.from_u128(U128(0xcce923669ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountManagement_DistributionGroup: GUID = GUID.from_u128(U128(0xcce923869ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountManagement_Others: GUID = GUID.from_u128(U128(0xcce923a69ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountManagement_SecurityGroup: GUID = GUID.from_u128(U128(0xcce923769ae11d9uL, 0xbed3505054503030uL))

public val Audit_AccountManagement_UserAccount: GUID = GUID.from_u128(U128(0xcce923569ae11d9uL, 0xbed3505054503030uL))

public val Audit_DSAccess_DSAccess: GUID = GUID.from_u128(U128(0xcce923b69ae11d9uL, 0xbed3505054503030uL))

public val Audit_DetailedTracking: GUID = GUID.from_u128(U128(0x6997984c797a11d9uL, 0xbed3505054503030uL))

public val Audit_DetailedTracking_DpapiActivity: GUID = GUID.from_u128(U128(0xcce922d69ae11d9uL, 0xbed3505054503030uL))

public val Audit_DetailedTracking_PnpActivity: GUID = GUID.from_u128(U128(0xcce924869ae11d9uL, 0xbed3505054503030uL))

public val Audit_DetailedTracking_ProcessCreation: GUID = GUID.from_u128(U128(0xcce922b69ae11d9uL, 0xbed3505054503030uL))

public val Audit_DetailedTracking_ProcessTermination: GUID = GUID.from_u128(U128(0xcce922c69ae11d9uL, 0xbed3505054503030uL))

public val Audit_DetailedTracking_RpcCall: GUID = GUID.from_u128(U128(0xcce922e69ae11d9uL, 0xbed3505054503030uL))

public val Audit_DetailedTracking_TokenRightAdjusted: GUID = GUID.from_u128(U128(0xcce924a69ae11d9uL, 0xbed3505054503030uL))

public val Audit_DirectoryServiceAccess: GUID = GUID.from_u128(U128(0x6997984f797a11d9uL, 0xbed3505054503030uL))

public val Audit_DsAccess_AdAuditChanges: GUID = GUID.from_u128(U128(0xcce923c69ae11d9uL, 0xbed3505054503030uL))

public val Audit_Ds_DetailedReplication: GUID = GUID.from_u128(U128(0xcce923e69ae11d9uL, 0xbed3505054503030uL))

public val Audit_Ds_Replication: GUID = GUID.from_u128(U128(0xcce923d69ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon: GUID = GUID.from_u128(U128(0x69979849797a11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_AccountLockout: GUID = GUID.from_u128(U128(0xcce921769ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_Claims: GUID = GUID.from_u128(U128(0xcce924769ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_Groups: GUID = GUID.from_u128(U128(0xcce924969ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_IPSecMainMode: GUID = GUID.from_u128(U128(0xcce921869ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_IPSecQuickMode: GUID = GUID.from_u128(U128(0xcce921969ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_IPSecUserMode: GUID = GUID.from_u128(U128(0xcce921a69ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_Logoff: GUID = GUID.from_u128(U128(0xcce921669ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_Logon: GUID = GUID.from_u128(U128(0xcce921569ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_NPS: GUID = GUID.from_u128(U128(0xcce924369ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_Others: GUID = GUID.from_u128(U128(0xcce921c69ae11d9uL, 0xbed3505054503030uL))

public val Audit_Logon_SpecialLogon: GUID = GUID.from_u128(U128(0xcce921b69ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess: GUID = GUID.from_u128(U128(0x6997984a797a11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_ApplicationGenerated: GUID = GUID.from_u128(U128(0xcce922269ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_CbacStaging: GUID = GUID.from_u128(U128(0xcce924669ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_CertificationServices: GUID = GUID.from_u128(U128(0xcce922169ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_DetailedFileShare: GUID = GUID.from_u128(U128(0xcce924469ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_FileSystem: GUID = GUID.from_u128(U128(0xcce921d69ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_FirewallConnection: GUID = GUID.from_u128(U128(0xcce922669ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_FirewallPacketDrops: GUID = GUID.from_u128(U128(0xcce922569ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_Handle: GUID = GUID.from_u128(U128(0xcce922369ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_Kernel: GUID = GUID.from_u128(U128(0xcce921f69ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_Other: GUID = GUID.from_u128(U128(0xcce922769ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_Registry: GUID = GUID.from_u128(U128(0xcce921e69ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_RemovableStorage: GUID = GUID.from_u128(U128(0xcce924569ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_Sam: GUID = GUID.from_u128(U128(0xcce922069ae11d9uL, 0xbed3505054503030uL))

public val Audit_ObjectAccess_Share: GUID = GUID.from_u128(U128(0xcce922469ae11d9uL, 0xbed3505054503030uL))

public val Audit_PolicyChange: GUID = GUID.from_u128(U128(0x6997984d797a11d9uL, 0xbed3505054503030uL))

public val Audit_PolicyChange_AuditPolicy: GUID = GUID.from_u128(U128(0xcce922f69ae11d9uL, 0xbed3505054503030uL))

public val Audit_PolicyChange_AuthenticationPolicy: GUID = GUID.from_u128(U128(0xcce923069ae11d9uL, 0xbed3505054503030uL))

public val Audit_PolicyChange_AuthorizationPolicy: GUID = GUID.from_u128(U128(0xcce923169ae11d9uL, 0xbed3505054503030uL))

public val Audit_PolicyChange_MpsscvRulePolicy: GUID = GUID.from_u128(U128(0xcce923269ae11d9uL, 0xbed3505054503030uL))

public val Audit_PolicyChange_Others: GUID = GUID.from_u128(U128(0xcce923469ae11d9uL, 0xbed3505054503030uL))

public val Audit_PolicyChange_WfpIPSecPolicy: GUID = GUID.from_u128(U128(0xcce923369ae11d9uL, 0xbed3505054503030uL))

public val Audit_PrivilegeUse: GUID = GUID.from_u128(U128(0x6997984b797a11d9uL, 0xbed3505054503030uL))

public val Audit_PrivilegeUse_NonSensitive: GUID = GUID.from_u128(U128(0xcce922969ae11d9uL, 0xbed3505054503030uL))

public val Audit_PrivilegeUse_Others: GUID = GUID.from_u128(U128(0xcce922a69ae11d9uL, 0xbed3505054503030uL))

public val Audit_PrivilegeUse_Sensitive: GUID = GUID.from_u128(U128(0xcce922869ae11d9uL, 0xbed3505054503030uL))

public val Audit_System: GUID = GUID.from_u128(U128(0x69979848797a11d9uL, 0xbed3505054503030uL))

public val Audit_System_IPSecDriverEvents: GUID = GUID.from_u128(U128(0xcce921369ae11d9uL, 0xbed3505054503030uL))

public val Audit_System_Integrity: GUID = GUID.from_u128(U128(0xcce921269ae11d9uL, 0xbed3505054503030uL))

public val Audit_System_Others: GUID = GUID.from_u128(U128(0xcce921469ae11d9uL, 0xbed3505054503030uL))

public val Audit_System_SecurityStateChange: GUID = GUID.from_u128(U128(0xcce921069ae11d9uL, 0xbed3505054503030uL))

public val Audit_System_SecuritySubsystemExtension: GUID = GUID.from_u128(U128(0xcce921169ae11d9uL, 0xbed3505054503030uL))

public val CENTRAL_ACCESS_POLICY_OWNER_RIGHTS_PRESENT_FLAG: UInt = 1u

public val CENTRAL_ACCESS_POLICY_STAGED_FLAG: UInt = 65536u

public val CENTRAL_ACCESS_POLICY_STAGED_OWNER_RIGHTS_PRESENT_FLAG: UInt = 256u

public val CLEAR_BLOCK_LENGTH: UInt = 8u

public val CLOUDAP_NAME: PCWSTR = w("CloudAP")

public val CLOUDAP_NAME_W: PCWSTR = w("CloudAP")

public val CREDP_FLAGS_CLEAR_PASSWORD: UInt = 8u

public val CREDP_FLAGS_DONT_CACHE_TI: UInt = 4u

public val CREDP_FLAGS_IN_PROCESS: UInt = 1u

public val CREDP_FLAGS_TRUSTED_CALLER: UInt = 32u

public val CREDP_FLAGS_USER_ENCRYPTED_PASSWORD: UInt = 16u

public val CREDP_FLAGS_USE_MIDL_HEAP: UInt = 2u

public val CREDP_FLAGS_VALIDATE_PROXY_TARGET: UInt = 64u

public val CRED_MARSHALED_TI_SIZE_SIZE: UInt = 12u

public val CYPHER_BLOCK_LENGTH: UInt = 8u

public val CertHashInfo: KERB_CERTIFICATE_INFO_TYPE = 1

public val ClOUDAP_NAME_A: PCSTR = s("CloudAP")

public val CollisionOther: LSA_FOREST_TRUST_COLLISION_RECORD_TYPE = 2

public val CollisionTdo: LSA_FOREST_TRUST_COLLISION_RECORD_TYPE = 0

public val CollisionXref: LSA_FOREST_TRUST_COLLISION_RECORD_TYPE = 1

public val CredFetchDPAPI: CRED_FETCH = 1

public val CredFetchDefault: CRED_FETCH = 0

public val CredFetchForced: CRED_FETCH = 2

public val DEFAULT_TLS_SSP_NAME: PCWSTR = w("Default TLS SSP")

public val DEFAULT_TLS_SSP_NAME_A: PCSTR = s("Default TLS SSP")

public val DEFAULT_TLS_SSP_NAME_W: PCWSTR = w("Default TLS SSP")

public val DOMAIN_LOCKOUT_ADMINS: DOMAIN_PASSWORD_PROPERTIES = 8u

public val DOMAIN_NO_LM_OWF_CHANGE: Int = 64

public val DOMAIN_PASSWORD_COMPLEX: DOMAIN_PASSWORD_PROPERTIES = 1u

public val DOMAIN_PASSWORD_NO_ANON_CHANGE: DOMAIN_PASSWORD_PROPERTIES = 2u

public val DOMAIN_PASSWORD_NO_CLEAR_CHANGE: DOMAIN_PASSWORD_PROPERTIES = 4u

public val DOMAIN_PASSWORD_STORE_CLEARTEXT: DOMAIN_PASSWORD_PROPERTIES = 16u

public val DOMAIN_REFUSE_PASSWORD_CHANGE: DOMAIN_PASSWORD_PROPERTIES = 32u

public val DS_INET_ADDRESS: KERB_ADDRESS_TYPE = 1u

public val DS_NETBIOS_ADDRESS: KERB_ADDRESS_TYPE = 2u

public val DS_UNKNOWN_ADDRESS_TYPE: UInt = 0u

public val DeprecatedIUMCredKey: MSV1_0_CREDENTIAL_KEY_TYPE = 1

public val DnsDomainInformation: LSA_LOOKUP_DOMAIN_INFO_CLASS = 12

public val DomainUserCredKey: MSV1_0_CREDENTIAL_KEY_TYPE = 2

public val ENABLE_TLS_CLIENT_EARLY_START: UInt = 1u

public val E_RM_UNKNOWN_ERROR: HRESULT = 0xC004FC03u.toInt()

public val ExternallySuppliedCredKey: MSV1_0_CREDENTIAL_KEY_TYPE = 4

public val FACILITY_SL_ITF: UInt = 4u

public val ForestTrustBinaryInfo: LSA_FOREST_TRUST_RECORD_TYPE = 3

public val ForestTrustDomainInfo: LSA_FOREST_TRUST_RECORD_TYPE = 2

public val ForestTrustRecordTypeLast: LSA_FOREST_TRUST_RECORD_TYPE = 4

public val ForestTrustScannerInfo: LSA_FOREST_TRUST_RECORD_TYPE = 4

public val ForestTrustTopLevelName: LSA_FOREST_TRUST_RECORD_TYPE = 0

public val ForestTrustTopLevelNameEx: LSA_FOREST_TRUST_RECORD_TYPE = 1

public val ID_CAP_SLAPI: PCWSTR = w("slapiQueryLicenseValue")

public val ISC_REQ_ALLOCATE_MEMORY: ISC_REQ_FLAGS = 256u

public val ISC_REQ_CALL_LEVEL: ISC_REQ_FLAGS = 4096u

public val ISC_REQ_CONFIDENTIALITY: ISC_REQ_FLAGS = 16u

public val ISC_REQ_CONFIDENTIALITY_ONLY: ISC_REQ_FLAGS = 1073741824u

public val ISC_REQ_CONNECTION: ISC_REQ_FLAGS = 2048u

public val ISC_REQ_DATAGRAM: ISC_REQ_FLAGS = 1024u

public val ISC_REQ_DEFERRED_CRED_VALIDATION: ISC_REQ_HIGH_FLAGS = 8589934592uL

public val ISC_REQ_DELEGATE: ISC_REQ_FLAGS = 1u

public val ISC_REQ_EXTENDED_ERROR: ISC_REQ_FLAGS = 16384u

public val ISC_REQ_FORWARD_CREDENTIALS: ISC_REQ_FLAGS = 4194304u

public val ISC_REQ_FRAGMENT_SUPPLIED: ISC_REQ_FLAGS = 8192u

public val ISC_REQ_FRAGMENT_TO_FIT: ISC_REQ_FLAGS = 2097152u

public val ISC_REQ_IDENTIFY: ISC_REQ_FLAGS = 131072u

public val ISC_REQ_INTEGRITY: ISC_REQ_FLAGS = 65536u

public val ISC_REQ_MANUAL_CRED_VALIDATION: ISC_REQ_FLAGS = 524288u

public val ISC_REQ_MESSAGES: ISC_REQ_HIGH_FLAGS = 4294967296uL

public val ISC_REQ_MUTUAL_AUTH: ISC_REQ_FLAGS = 2u

public val ISC_REQ_NO_INTEGRITY: ISC_REQ_FLAGS = 8388608u

public val ISC_REQ_NO_POST_HANDSHAKE_AUTH: ISC_REQ_HIGH_FLAGS = 17179869184uL

public val ISC_REQ_NULL_SESSION: ISC_REQ_FLAGS = 262144u

public val ISC_REQ_PROMPT_FOR_CREDS: ISC_REQ_FLAGS = 64u

public val ISC_REQ_REPLAY_DETECT: ISC_REQ_FLAGS = 4u

public val ISC_REQ_RESERVED1: ISC_REQ_FLAGS = 1048576u

public val ISC_REQ_SEQUENCE_DETECT: ISC_REQ_FLAGS = 8u

public val ISC_REQ_STREAM: ISC_REQ_FLAGS = 32768u

public val ISC_REQ_UNVERIFIED_TARGET_NAME: ISC_REQ_FLAGS = 536870912u

public val ISC_REQ_USE_DCE_STYLE: ISC_REQ_FLAGS = 512u

public val ISC_REQ_USE_HTTP_STYLE: ISC_REQ_FLAGS = 16777216u

public val ISC_REQ_USE_SESSION_KEY: ISC_REQ_FLAGS = 32u

public val ISC_REQ_USE_SUPPLIED_CREDS: ISC_REQ_FLAGS = 128u

public val ISC_RET_ALLOCATED_MEMORY: UInt = 256u

public val ISC_RET_CALL_LEVEL: UInt = 8192u

public val ISC_RET_CONFIDENTIALITY: UInt = 16u

public val ISC_RET_CONFIDENTIALITY_ONLY: UInt = 1073741824u

public val ISC_RET_CONNECTION: UInt = 2048u

public val ISC_RET_DATAGRAM: UInt = 1024u

public val ISC_RET_DEFERRED_CRED_VALIDATION: ULong = 8589934592uL

public val ISC_RET_DELEGATE: UInt = 1u

public val ISC_RET_EXTENDED_ERROR: UInt = 16384u

public val ISC_RET_FORWARD_CREDENTIALS: UInt = 4194304u

public val ISC_RET_FRAGMENT_ONLY: UInt = 2097152u

public val ISC_RET_IDENTIFY: UInt = 131072u

public val ISC_RET_INTEGRITY: UInt = 65536u

public val ISC_RET_INTERMEDIATE_RETURN: UInt = 4096u

public val ISC_RET_MANUAL_CRED_VALIDATION: UInt = 524288u

public val ISC_RET_MESSAGES: ULong = 4294967296uL

public val ISC_RET_MUTUAL_AUTH: UInt = 2u

public val ISC_RET_NO_ADDITIONAL_TOKEN: UInt = 33554432u

public val ISC_RET_NO_POST_HANDSHAKE_AUTH: ULong = 17179869184uL

public val ISC_RET_NULL_SESSION: UInt = 262144u

public val ISC_RET_REAUTHENTICATION: UInt = 134217728u

public val ISC_RET_REPLAY_DETECT: UInt = 4u

public val ISC_RET_RESERVED1: UInt = 1048576u

public val ISC_RET_SEQUENCE_DETECT: UInt = 8u

public val ISC_RET_STREAM: UInt = 32768u

public val ISC_RET_USED_COLLECTED_CREDS: UInt = 64u

public val ISC_RET_USED_DCE_STYLE: UInt = 512u

public val ISC_RET_USED_HTTP_STYLE: UInt = 16777216u

public val ISC_RET_USED_SUPPLIED_CREDS: UInt = 128u

public val ISC_RET_USE_SESSION_KEY: UInt = 32u

public val ISSP_LEVEL: UInt = 32u

public val ISSP_MODE: UInt = 1u

public val InvalidCredKey: MSV1_0_CREDENTIAL_KEY_TYPE = 0

public val KDC_PROXY_SETTINGS_FLAGS_FORCEPROXY: UInt = 1u

public val KDC_PROXY_SETTINGS_V1: UInt = 1u

public val KERBEROS_REVISION: UInt = 6u

public val KERBEROS_VERSION: UInt = 5u

public val KERB_CERTIFICATE_LOGON_FLAG_CHECK_DUPLICATES: UInt = 1u

public val KERB_CERTIFICATE_LOGON_FLAG_USE_CERTIFICATE_INFO: UInt = 2u

public val KERB_CERTIFICATE_S4U_LOGON_FLAG_CHECK_DUPLICATES: UInt = 1u

public val KERB_CERTIFICATE_S4U_LOGON_FLAG_CHECK_LOGONHOURS: UInt = 2u

public val KERB_CERTIFICATE_S4U_LOGON_FLAG_FAIL_IF_NT_AUTH_POLICY_REQUIRED: UInt = 4u

public val KERB_CERTIFICATE_S4U_LOGON_FLAG_IDENTIFY: UInt = 8u

public val KERB_CHECKSUM_CRC32: UInt = 1u

public val KERB_CHECKSUM_DES_MAC: Int = -133

public val KERB_CHECKSUM_DES_MAC_MD5: Int = -134

public val KERB_CHECKSUM_HMAC_MD5: Int = -138

public val KERB_CHECKSUM_HMAC_SHA1_96_AES128: UInt = 15u

public val KERB_CHECKSUM_HMAC_SHA1_96_AES128_Ki: Int = -150

public val KERB_CHECKSUM_HMAC_SHA1_96_AES256: UInt = 16u

public val KERB_CHECKSUM_HMAC_SHA1_96_AES256_Ki: Int = -151

public val KERB_CHECKSUM_KRB_DES_MAC: UInt = 4u

public val KERB_CHECKSUM_KRB_DES_MAC_K: UInt = 5u

public val KERB_CHECKSUM_LM: Int = -130

public val KERB_CHECKSUM_MD25: Int = -135

public val KERB_CHECKSUM_MD4: UInt = 2u

public val KERB_CHECKSUM_MD5: UInt = 7u

public val KERB_CHECKSUM_MD5_DES: UInt = 8u

public val KERB_CHECKSUM_MD5_HMAC: Int = -137

public val KERB_CHECKSUM_NONE: UInt = 0u

public val KERB_CHECKSUM_RC4_MD5: Int = -136

public val KERB_CHECKSUM_REAL_CRC32: Int = -132

public val KERB_CHECKSUM_SHA1: Int = -131

public val KERB_CHECKSUM_SHA1_NEW: UInt = 14u

public val KERB_CHECKSUM_SHA256: Int = -139

public val KERB_CHECKSUM_SHA384: Int = -140

public val KERB_CHECKSUM_SHA512: Int = -141

public val KERB_CLOUD_KERBEROS_DEBUG_DATA_VERSION: UInt = 1u

public val KERB_DECRYPT_FLAG_DEFAULT_KEY: UInt = 1u

public val KERB_ETYPE_AES128_CTS_HMAC_SHA1_96: UInt = 17u

public val KERB_ETYPE_AES128_CTS_HMAC_SHA1_96_PLAIN: Int = -148

public val KERB_ETYPE_AES256_CTS_HMAC_SHA1_96: UInt = 18u

public val KERB_ETYPE_AES256_CTS_HMAC_SHA1_96_PLAIN: Int = -149

public val KERB_ETYPE_DEFAULT: UInt = 0u

public val KERB_ETYPE_DES3_CBC_MD5: UInt = 5u

public val KERB_ETYPE_DES3_CBC_SHA1: UInt = 7u

public val KERB_ETYPE_DES3_CBC_SHA1_KD: UInt = 16u

public val KERB_ETYPE_DES_CBC_CRC: KERB_CRYPTO_KEY_TYPE = 1

public val KERB_ETYPE_DES_CBC_MD4: KERB_CRYPTO_KEY_TYPE = 2

public val KERB_ETYPE_DES_CBC_MD5: KERB_CRYPTO_KEY_TYPE = 3

public val KERB_ETYPE_DES_CBC_MD5_NT: UInt = 20u

public val KERB_ETYPE_DES_EDE3_CBC_ENV: UInt = 15u

public val KERB_ETYPE_DES_PLAIN: Int = -132

public val KERB_ETYPE_DSA_SHA1_CMS: UInt = 9u

public val KERB_ETYPE_DSA_SIGN: UInt = 8u

public val KERB_ETYPE_NULL: KERB_CRYPTO_KEY_TYPE = 0

public val KERB_ETYPE_PKCS7_PUB: UInt = 13u

public val KERB_ETYPE_RC2_CBC_ENV: UInt = 12u

public val KERB_ETYPE_RC4_HMAC_NT: KERB_CRYPTO_KEY_TYPE = 23

public val KERB_ETYPE_RC4_HMAC_NT_EXP: UInt = 24u

public val KERB_ETYPE_RC4_HMAC_OLD: Int = -133

public val KERB_ETYPE_RC4_HMAC_OLD_EXP: Int = -135

public val KERB_ETYPE_RC4_LM: Int = -130

public val KERB_ETYPE_RC4_MD4: KERB_CRYPTO_KEY_TYPE = -128

public val KERB_ETYPE_RC4_PLAIN: Int = -140

public val KERB_ETYPE_RC4_PLAIN2: Int = -129

public val KERB_ETYPE_RC4_PLAIN_EXP: Int = -141

public val KERB_ETYPE_RC4_PLAIN_OLD: Int = -134

public val KERB_ETYPE_RC4_PLAIN_OLD_EXP: Int = -136

public val KERB_ETYPE_RC4_SHA: Int = -131

public val KERB_ETYPE_RSA_ENV: UInt = 13u

public val KERB_ETYPE_RSA_ES_OEAP_ENV: UInt = 14u

public val KERB_ETYPE_RSA_MD5_CMS: UInt = 10u

public val KERB_ETYPE_RSA_PRIV: UInt = 9u

public val KERB_ETYPE_RSA_PUB: UInt = 10u

public val KERB_ETYPE_RSA_PUB_MD5: UInt = 11u

public val KERB_ETYPE_RSA_PUB_SHA1: UInt = 12u

public val KERB_ETYPE_RSA_SHA1_CMS: UInt = 11u

public val KERB_LOGON_FLAG_ALLOW_EXPIRED_TICKET: UInt = 1u

public val KERB_LOGON_FLAG_REDIRECTED: UInt = 2u

public val KERB_PURGE_ALL_TICKETS: UInt = 1u

public val KERB_QUERY_DOMAIN_EXTENDED_POLICIES_RESPONSE_FLAG_DAC_DISABLED: UInt = 1u

public val KERB_REFRESH_POLICY_KDC: UInt = 2u

public val KERB_REFRESH_POLICY_KERBEROS: UInt = 1u

public val KERB_REFRESH_SCCRED_GETTGT: UInt = 1u

public val KERB_REFRESH_SCCRED_RELEASE: UInt = 0u

public val KERB_REQUEST_ADD_CREDENTIAL: KERB_REQUEST_FLAGS = 1u

public val KERB_REQUEST_REMOVE_CREDENTIAL: KERB_REQUEST_FLAGS = 4u

public val KERB_REQUEST_REPLACE_CREDENTIAL: KERB_REQUEST_FLAGS = 2u

public val KERB_RETRIEVE_TICKET_AS_KERB_CRED: UInt = 8u

public val KERB_RETRIEVE_TICKET_CACHE_TICKET: UInt = 32u

public val KERB_RETRIEVE_TICKET_DEFAULT: UInt = 0u

public val KERB_RETRIEVE_TICKET_DONT_USE_CACHE: UInt = 1u

public val KERB_RETRIEVE_TICKET_MAX_LIFETIME: UInt = 64u

public val KERB_RETRIEVE_TICKET_USE_CACHE_ONLY: UInt = 2u

public val KERB_RETRIEVE_TICKET_USE_CREDHANDLE: UInt = 4u

public val KERB_RETRIEVE_TICKET_WITH_SEC_CRED: UInt = 16u

public val KERB_S4U2PROXY_CACHE_ENTRY_INFO_FLAG_NEGATIVE: UInt = 1u

public val KERB_S4U2PROXY_CRED_FLAG_NEGATIVE: UInt = 1u

public val KERB_S4U_LOGON_FLAG_CHECK_LOGONHOURS: UInt = 2u

public val KERB_S4U_LOGON_FLAG_IDENTIFY: UInt = 8u

public val KERB_SETPASS_USE_CREDHANDLE: UInt = 2u

public val KERB_SETPASS_USE_LOGONID: UInt = 1u

public val KERB_TICKET_FLAGS_cname_in_pa_data: UInt = 262144u

public val KERB_TICKET_FLAGS_enc_pa_rep: UInt = 65536u

public val KERB_TICKET_FLAGS_forwardable: KERB_TICKET_FLAGS = 1073741824u

public val KERB_TICKET_FLAGS_forwarded: KERB_TICKET_FLAGS = 536870912u

public val KERB_TICKET_FLAGS_hw_authent: KERB_TICKET_FLAGS = 1048576u

public val KERB_TICKET_FLAGS_initial: KERB_TICKET_FLAGS = 4194304u

public val KERB_TICKET_FLAGS_invalid: KERB_TICKET_FLAGS = 16777216u

public val KERB_TICKET_FLAGS_may_postdate: KERB_TICKET_FLAGS = 67108864u

public val KERB_TICKET_FLAGS_name_canonicalize: UInt = 65536u

public val KERB_TICKET_FLAGS_ok_as_delegate: KERB_TICKET_FLAGS = 262144u

public val KERB_TICKET_FLAGS_postdated: KERB_TICKET_FLAGS = 33554432u

public val KERB_TICKET_FLAGS_pre_authent: KERB_TICKET_FLAGS = 2097152u

public val KERB_TICKET_FLAGS_proxiable: KERB_TICKET_FLAGS = 268435456u

public val KERB_TICKET_FLAGS_proxy: KERB_TICKET_FLAGS = 134217728u

public val KERB_TICKET_FLAGS_renewable: KERB_TICKET_FLAGS = 8388608u

public val KERB_TICKET_FLAGS_reserved: KERB_TICKET_FLAGS = 2147483648u

public val KERB_TICKET_FLAGS_reserved1: KERB_TICKET_FLAGS = 1u

public val KERB_TRANSFER_CRED_CLEANUP_CREDENTIALS: UInt = 2u

public val KERB_TRANSFER_CRED_WITH_TICKETS: UInt = 1u

public val KERB_USE_DEFAULT_TICKET_FLAGS: UInt = 0u

public val KERB_WRAP_NO_ENCRYPT: UInt = 2147483649u

public val KERN_CONTEXT_CERT_INFO_V1: UInt = 0u

public val KRB_ANONYMOUS_STRING: PCWSTR = w("ANONYMOUS")

public val KRB_NT_ENTERPRISE_PRINCIPAL: UInt = 10u

public val KRB_NT_ENT_PRINCIPAL_AND_ID: Int = -130

public val KRB_NT_MS_BRANCH_ID: Int = -133

public val KRB_NT_MS_PRINCIPAL: Int = -128

public val KRB_NT_MS_PRINCIPAL_AND_ID: Int = -129

public val KRB_NT_PRINCIPAL: UInt = 1u

public val KRB_NT_PRINCIPAL_AND_ID: Int = -131

public val KRB_NT_SRV_HST: UInt = 3u

public val KRB_NT_SRV_INST: UInt = 2u

public val KRB_NT_SRV_INST_AND_ID: Int = -132

public val KRB_NT_SRV_XHST: UInt = 4u

public val KRB_NT_UID: UInt = 5u

public val KRB_NT_UNKNOWN: UInt = 0u

public val KRB_NT_WELLKNOWN: UInt = 11u

public val KRB_NT_X500_PRINCIPAL: UInt = 6u

public val KRB_WELLKNOWN_STRING: PCWSTR = w("WELLKNOWN")

public val KSecNonPaged: KSEC_CONTEXT_TYPE = 1

public val KSecPaged: KSEC_CONTEXT_TYPE = 0

public val KerbAddBindingCacheEntryExMessage: KERB_PROTOCOL_MESSAGE_TYPE = 27

public val KerbAddBindingCacheEntryMessage: KERB_PROTOCOL_MESSAGE_TYPE = 10

public val KerbAddExtraCredentialsExMessage: KERB_PROTOCOL_MESSAGE_TYPE = 22

public val KerbAddExtraCredentialsMessage: KERB_PROTOCOL_MESSAGE_TYPE = 17

public val KerbCertificateLogon: KERB_LOGON_SUBMIT_TYPE = 13

public val KerbCertificateS4ULogon: KERB_LOGON_SUBMIT_TYPE = 14

public val KerbCertificateUnlockLogon: KERB_LOGON_SUBMIT_TYPE = 15

public val KerbChangeMachinePasswordMessage: KERB_PROTOCOL_MESSAGE_TYPE = 2

public val KerbChangePasswordMessage: KERB_PROTOCOL_MESSAGE_TYPE = 7

public val KerbCleanupMachinePkinitCredsMessage: KERB_PROTOCOL_MESSAGE_TYPE = 26

public val KerbDebugRequestMessage: KERB_PROTOCOL_MESSAGE_TYPE = 0

public val KerbDecryptDataMessage: KERB_PROTOCOL_MESSAGE_TYPE = 9

public val KerbInteractiveLogon: KERB_LOGON_SUBMIT_TYPE = 2

public val KerbInteractiveProfile: KERB_PROFILE_BUFFER_TYPE = 2

public val KerbLuidLogon: KERB_LOGON_SUBMIT_TYPE = 84

public val KerbNoElevationLogon: KERB_LOGON_SUBMIT_TYPE = 83

public val KerbPinKdcMessage: KERB_PROTOCOL_MESSAGE_TYPE = 30

public val KerbPrintCloudKerberosDebugMessage: KERB_PROTOCOL_MESSAGE_TYPE = 36

public val KerbProxyLogon: KERB_LOGON_SUBMIT_TYPE = 9

public val KerbPurgeBindingCacheMessage: KERB_PROTOCOL_MESSAGE_TYPE = 29

public val KerbPurgeKdcProxyCacheMessage: KERB_PROTOCOL_MESSAGE_TYPE = 24

public val KerbPurgeTicketCacheExMessage: KERB_PROTOCOL_MESSAGE_TYPE = 15

public val KerbPurgeTicketCacheMessage: KERB_PROTOCOL_MESSAGE_TYPE = 6

public val KerbQueryBindingCacheMessage: KERB_PROTOCOL_MESSAGE_TYPE = 28

public val KerbQueryDomainExtendedPoliciesMessage: KERB_PROTOCOL_MESSAGE_TYPE = 32

public val KerbQueryKdcProxyCacheMessage: KERB_PROTOCOL_MESSAGE_TYPE = 23

public val KerbQueryS4U2ProxyCacheMessage: KERB_PROTOCOL_MESSAGE_TYPE = 33

public val KerbQuerySupplementalCredentialsMessage: KERB_PROTOCOL_MESSAGE_TYPE = 18

public val KerbQueryTicketCacheEx2Message: KERB_PROTOCOL_MESSAGE_TYPE = 20

public val KerbQueryTicketCacheEx3Message: KERB_PROTOCOL_MESSAGE_TYPE = 25

public val KerbQueryTicketCacheExMessage: KERB_PROTOCOL_MESSAGE_TYPE = 14

public val KerbQueryTicketCacheMessage: KERB_PROTOCOL_MESSAGE_TYPE = 1

public val KerbRefreshPolicyMessage: KERB_PROTOCOL_MESSAGE_TYPE = 35

public val KerbRefreshSmartcardCredentialsMessage: KERB_PROTOCOL_MESSAGE_TYPE = 16

public val KerbRetrieveEncodedTicketMessage: KERB_PROTOCOL_MESSAGE_TYPE = 8

public val KerbRetrieveKeyTabMessage: KERB_PROTOCOL_MESSAGE_TYPE = 34

public val KerbRetrieveTicketMessage: KERB_PROTOCOL_MESSAGE_TYPE = 4

public val KerbS4ULogon: KERB_LOGON_SUBMIT_TYPE = 12

public val KerbSetPasswordExMessage: KERB_PROTOCOL_MESSAGE_TYPE = 12

public val KerbSetPasswordMessage: KERB_PROTOCOL_MESSAGE_TYPE = 11

public val KerbSmartCardLogon: KERB_LOGON_SUBMIT_TYPE = 6

public val KerbSmartCardProfile: KERB_PROFILE_BUFFER_TYPE = 4

public val KerbSmartCardUnlockLogon: KERB_LOGON_SUBMIT_TYPE = 8

public val KerbSubmitTicketMessage: KERB_PROTOCOL_MESSAGE_TYPE = 21

public val KerbTicketLogon: KERB_LOGON_SUBMIT_TYPE = 10

public val KerbTicketProfile: KERB_PROFILE_BUFFER_TYPE = 6

public val KerbTicketUnlockLogon: KERB_LOGON_SUBMIT_TYPE = 11

public val KerbTransferCredentialsMessage: KERB_PROTOCOL_MESSAGE_TYPE = 19

public val KerbUnpinAllKdcsMessage: KERB_PROTOCOL_MESSAGE_TYPE = 31

public val KerbUpdateAddressesMessage: KERB_PROTOCOL_MESSAGE_TYPE = 5

public val KerbVerifyCredentialsMessage: KERB_PROTOCOL_MESSAGE_TYPE = 13

public val KerbVerifyPacMessage: KERB_PROTOCOL_MESSAGE_TYPE = 3

public val KerbWorkstationUnlockLogon: KERB_LOGON_SUBMIT_TYPE = 7

public val LCRED_CRED_EXISTS: UInt = 1u

public val LCRED_STATUS_NOCRED: UInt = 0u

public val LCRED_STATUS_UNKNOWN_ISSUER: UInt = 2u

public val LOGON_CACHED_ACCOUNT: MSV_SUB_AUTHENTICATION_FILTER = 4u

public val LOGON_EXTRA_SIDS: MSV_SUB_AUTHENTICATION_FILTER = 32u

public val LOGON_GRACE_LOGON: UInt = 16777216u

public val LOGON_GUEST: MSV_SUB_AUTHENTICATION_FILTER = 1u

public val LOGON_LM_V2: UInt = 4096u

public val LOGON_MANAGED_SERVICE: UInt = 524288u

public val LOGON_NOENCRYPTION: MSV_SUB_AUTHENTICATION_FILTER = 2u

public val LOGON_NO_ELEVATION: UInt = 262144u

public val LOGON_NO_OPTIMIZED: UInt = 131072u

public val LOGON_NTLMV2_ENABLED: UInt = 256u

public val LOGON_NTLM_V2: UInt = 8192u

public val LOGON_NT_V2: UInt = 2048u

public val LOGON_OPTIMIZED: UInt = 16384u

public val LOGON_PKINIT: UInt = 65536u

public val LOGON_PROFILE_PATH_RETURNED: MSV_SUB_AUTHENTICATION_FILTER = 1024u

public val LOGON_RESOURCE_GROUPS: MSV_SUB_AUTHENTICATION_FILTER = 512u

public val LOGON_SERVER_TRUST_ACCOUNT: MSV_SUB_AUTHENTICATION_FILTER = 128u

public val LOGON_SUBAUTH_SESSION_KEY: MSV_SUB_AUTHENTICATION_FILTER = 64u

public val LOGON_USED_LM_PASSWORD: MSV_SUB_AUTHENTICATION_FILTER = 8u

public val LOGON_WINLOGON: UInt = 32768u

public val LOOKUP_TRANSLATE_NAMES: UInt = 2048u

public val LOOKUP_VIEW_LOCAL_INFORMATION: UInt = 1u

public val LSAD_AES_BLOCK_SIZE: UInt = 16u

public val LSAD_AES_CRYPT_SHA512_HASH_SIZE: UInt = 64u

public val LSAD_AES_KEY_SIZE: UInt = 16u

public val LSAD_AES_SALT_SIZE: UInt = 16u

public val LSASETCAPS_RELOAD_FLAG: UInt = 1u

public val LSASETCAPS_VALID_FLAG_MASK: UInt = 1u

public val LSA_ADT_LEGACY_SECURITY_SOURCE_NAME: PCWSTR = w("Security")

public val LSA_ADT_SECURITY_SOURCE_NAME: PCWSTR = w("Microsoft-Windows-Security-Auditing")

public val LSA_AP_NAME_CALL_PACKAGE: PCSTR = s("LsaApCallPackage\u0000")

public val LSA_AP_NAME_CALL_PACKAGE_PASSTHROUGH: PCSTR = s("LsaApCallPackagePassthrough\u0000")

public val LSA_AP_NAME_CALL_PACKAGE_UNTRUSTED: PCSTR = s("LsaApCallPackageUntrusted\u0000")

public val LSA_AP_NAME_INITIALIZE_PACKAGE: PCSTR = s("LsaApInitializePackage\u0000")

public val LSA_AP_NAME_LOGON_TERMINATED: PCSTR = s("LsaApLogonTerminated\u0000")

public val LSA_AP_NAME_LOGON_USER: PCSTR = s("LsaApLogonUser\u0000")

public val LSA_AP_NAME_LOGON_USER_EX: PCSTR = s("LsaApLogonUserEx\u0000")

public val LSA_AP_NAME_LOGON_USER_EX2: PCSTR = s("LsaApLogonUserEx2\u0000")

public val LSA_CALL_LICENSE_SERVER: UInt = 2147483648u

public val LSA_FOREST_TRUST_RECORD_TYPE_UNRECOGNIZED: UInt = 2147483648u

public val LSA_FTRECORD_DISABLED_REASONS: Int = 65535

public val LSA_GLOBAL_SECRET_PREFIX: PCWSTR = w("G\$")

public val LSA_GLOBAL_SECRET_PREFIX_LENGTH: UInt = 2u

public val LSA_LOCAL_SECRET_PREFIX: PCWSTR = w("L\$")

public val LSA_LOCAL_SECRET_PREFIX_LENGTH: UInt = 2u

public val LSA_LOOKUP_DISALLOW_CONNECTED_ACCOUNT_INTERNET_SID: UInt = 2147483648u

public val LSA_LOOKUP_ISOLATED_AS_LOCAL: UInt = 2147483648u

public val LSA_LOOKUP_PREFER_INTERNET_NAMES: UInt = 1073741824u

public val LSA_MACHINE_SECRET_PREFIX: PCWSTR = w("M\$")

public val LSA_MAXIMUM_ENUMERATION_LENGTH: UInt = 32000u

public val LSA_MAXIMUM_SID_COUNT: Int = 256

public val LSA_MODE_INDIVIDUAL_ACCOUNTS: Int = 2

public val LSA_MODE_LOG_FULL: Int = 8

public val LSA_MODE_MANDATORY_ACCESS: Int = 4

public val LSA_MODE_PASSWORD_PROTECTED: Int = 1

public val LSA_NB_DISABLED_ADMIN: Int = 4

public val LSA_NB_DISABLED_CONFLICT: Int = 8

public val LSA_QUERY_CLIENT_PRELOGON_SESSION_ID: UInt = 1u

public val LSA_SCANNER_INFO_ADMIN_ALL_FLAGS: Int = 1

public val LSA_SCANNER_INFO_DISABLE_AUTH_TARGET_VALIDATION: Int = 1

public val LSA_SECRET_MAXIMUM_COUNT: Int = 4096

public val LSA_SECRET_MAXIMUM_LENGTH: Int = 512

public val LSA_SID_DISABLED_ADMIN: Int = 1

public val LSA_SID_DISABLED_CONFLICT: Int = 2

public val LSA_TLN_DISABLED_ADMIN: Int = 2

public val LSA_TLN_DISABLED_CONFLICT: Int = 4

public val LSA_TLN_DISABLED_NEW: Int = 1

public val LocalUserCredKey: MSV1_0_CREDENTIAL_KEY_TYPE = 3

public val LsaTokenInformationNull: LSA_TOKEN_INFORMATION_TYPE = 0

public val LsaTokenInformationV1: LSA_TOKEN_INFORMATION_TYPE = 1

public val LsaTokenInformationV2: LSA_TOKEN_INFORMATION_TYPE = 2

public val LsaTokenInformationV3: LSA_TOKEN_INFORMATION_TYPE = 3

public val MAXIMUM_CAPES_PER_CAP: UInt = 127u

public val MAX_CRED_SIZE: UInt = 1024u

public val MAX_PROTOCOL_ID_SIZE: UInt = 255u

public val MAX_RECORDS_IN_FOREST_TRUST_INFO: UInt = 4000u

public val MAX_USER_RECORDS: UInt = 1000u

public val MICROSOFT_KERBEROS_NAME: PCWSTR = w("Kerberos")

public val MICROSOFT_KERBEROS_NAME_A: PCSTR = s("Kerberos")

public val MICROSOFT_KERBEROS_NAME_W: PCWSTR = w("Kerberos")

public val MSV1_0_ALLOW_FORCE_GUEST: UInt = 8192u

public val MSV1_0_ALLOW_MSVCHAPV2: UInt = 65536u

public val MSV1_0_ALLOW_SERVER_TRUST_ACCOUNT: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 32u

public val MSV1_0_ALLOW_WORKSTATION_TRUST_ACCOUNT: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 2048u

public val MSV1_0_AV_FLAG_FORCE_GUEST: UInt = 1u

public val MSV1_0_AV_FLAG_MIC_HANDSHAKE_MESSAGES: UInt = 2u

public val MSV1_0_AV_FLAG_UNVERIFIED_TARGET: UInt = 4u

public val MSV1_0_CHALLENGE_LENGTH: UInt = 8u

public val MSV1_0_CHECK_LOGONHOURS_FOR_S4U: UInt = 262144u

public val MSV1_0_CLEARTEXT_PASSWORD_ALLOWED: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 2u

public val MSV1_0_CLEARTEXT_PASSWORD_SUPPLIED: UInt = 16384u

public val MSV1_0_CREDENTIAL_KEY_LENGTH: UInt = 20u

public val MSV1_0_CRED_CREDKEY_PRESENT: UInt = 8u

public val MSV1_0_CRED_LM_PRESENT: MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS = 1u

public val MSV1_0_CRED_NT_PRESENT: MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS = 2u

public val MSV1_0_CRED_REMOVED: UInt = 4u

public val MSV1_0_CRED_SHA_PRESENT: UInt = 16u

public val MSV1_0_CRED_VERSION: MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS = 0u

public val MSV1_0_CRED_VERSION_ARSO: UInt = 4294901763u

public val MSV1_0_CRED_VERSION_INVALID: UInt = 4294967295u

public val MSV1_0_CRED_VERSION_IUM: UInt = 4294901761u

public val MSV1_0_CRED_VERSION_REMOTE: UInt = 4294901762u

public val MSV1_0_CRED_VERSION_RESERVED_1: UInt = 4294967294u

public val MSV1_0_CRED_VERSION_V2: UInt = 2u

public val MSV1_0_CRED_VERSION_V3: UInt = 4u

public val MSV1_0_DISABLE_PERSONAL_FALLBACK: UInt = 4096u

public val MSV1_0_DONT_TRY_GUEST_ACCOUNT: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 16u

public val MSV1_0_GUEST_LOGON: MSV1_0 = 2u

public val MSV1_0_INTERNET_DOMAIN: UInt = 524288u

public val MSV1_0_LANMAN_SESSION_KEY_LENGTH: UInt = 8u

public val MSV1_0_MAX_AVL_SIZE: UInt = 64000u

public val MSV1_0_MAX_NTLM3_LIFE: UInt = 1800u

public val MSV1_0_MNS_LOGON: UInt = 16777216u

public val MSV1_0_NTLM3_OWF_LENGTH: UInt = 16u

public val MSV1_0_NTLM3_RESPONSE_LENGTH: UInt = 16u

public val MSV1_0_OWF_PASSWORD_LENGTH: UInt = 16u

public val MSV1_0_PACKAGE_NAME: PCSTR = s("MICROSOFT_AUTHENTICATION_PACKAGE_V1_0")

public val MSV1_0_PACKAGE_NAMEW: PCWSTR = w("MICROSOFT_AUTHENTICATION_PACKAGE_V1_0")

public val MSV1_0_PASSTHRU: MSV1_0 = 1u

public val MSV1_0_RETURN_PASSWORD_EXPIRY: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 64u

public val MSV1_0_RETURN_PROFILE_PATH: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 512u

public val MSV1_0_RETURN_USER_PARAMETERS: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 8u

public val MSV1_0_S4U2SELF: UInt = 131072u

public val MSV1_0_S4U_LOGON_FLAG_CHECK_LOGONHOURS: UInt = 2u

public val MSV1_0_SHA_PASSWORD_LENGTH: UInt = 20u

public val MSV1_0_SUBAUTHENTICATION_DLL: UInt = 4278190080u

public val MSV1_0_SUBAUTHENTICATION_DLL_EX: UInt = 1048576u

public val MSV1_0_SUBAUTHENTICATION_DLL_IIS: UInt = 132u

public val MSV1_0_SUBAUTHENTICATION_DLL_RAS: UInt = 2u

public val MSV1_0_SUBAUTHENTICATION_DLL_SHIFT: UInt = 24u

public val MSV1_0_SUBAUTHENTICATION_FLAGS: UInt = 4278190080u

public val MSV1_0_SUBAUTHENTICATION_KEY: PCSTR = s("SYSTEM\\CurrentControlSet\\Control\\Lsa\\MSV1_0")

public val MSV1_0_SUBAUTHENTICATION_VALUE: PCSTR = s("Auth")

public val MSV1_0_SUBAUTH_ACCOUNT_DISABLED: UInt = 1u

public val MSV1_0_SUBAUTH_ACCOUNT_EXPIRY: UInt = 16u

public val MSV1_0_SUBAUTH_ACCOUNT_TYPE: UInt = 64u

public val MSV1_0_SUBAUTH_LOCKOUT: UInt = 128u

public val MSV1_0_SUBAUTH_LOGON_HOURS: UInt = 8u

public val MSV1_0_SUBAUTH_PASSWORD: UInt = 2u

public val MSV1_0_SUBAUTH_PASSWORD_EXPIRY: UInt = 32u

public val MSV1_0_SUBAUTH_WORKSTATIONS: UInt = 4u

public val MSV1_0_TRY_GUEST_ACCOUNT_ONLY: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 256u

public val MSV1_0_TRY_SPECIFIED_DOMAIN_ONLY: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 1024u

public val MSV1_0_UPDATE_LOGON_STATISTICS: MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = 4u

public val MSV1_0_USER_SESSION_KEY_LENGTH: UInt = 16u

public val MSV1_0_USE_CLIENT_CHALLENGE: UInt = 128u

public val MSV1_0_USE_DOMAIN_FOR_ROUTING_ONLY: UInt = 32768u

public val MSV1_0_VALIDATION_KICKOFF_TIME: UInt = 2u

public val MSV1_0_VALIDATION_LOGOFF_TIME: UInt = 1u

public val MSV1_0_VALIDATION_LOGON_DOMAIN: UInt = 8u

public val MSV1_0_VALIDATION_LOGON_SERVER: UInt = 4u

public val MSV1_0_VALIDATION_SESSION_KEY: UInt = 16u

public val MSV1_0_VALIDATION_USER_FLAGS: UInt = 32u

public val MSV1_0_VALIDATION_USER_ID: UInt = 64u

public val MsV1_0CacheLogon: MSV1_0_PROTOCOL_MESSAGE_TYPE = 8

public val MsV1_0CacheLookup: MSV1_0_PROTOCOL_MESSAGE_TYPE = 11

public val MsV1_0CacheLookupEx: MSV1_0_PROTOCOL_MESSAGE_TYPE = 17

public val MsV1_0ChangeCachedPassword: MSV1_0_PROTOCOL_MESSAGE_TYPE = 6

public val MsV1_0ChangePassword: MSV1_0_PROTOCOL_MESSAGE_TYPE = 5

public val MsV1_0ClearCachedCredentials: MSV1_0_PROTOCOL_MESSAGE_TYPE = 14

public val MsV1_0ConfigLocalAliases: MSV1_0_PROTOCOL_MESSAGE_TYPE = 13

public val MsV1_0DecryptDpapiMasterKey: MSV1_0_PROTOCOL_MESSAGE_TYPE = 20

public val MsV1_0DeleteTbalSecrets: MSV1_0_PROTOCOL_MESSAGE_TYPE = 24

public val MsV1_0DeriveCredential: MSV1_0_PROTOCOL_MESSAGE_TYPE = 10

public val MsV1_0EnumerateUsers: MSV1_0_PROTOCOL_MESSAGE_TYPE = 2

public val MsV1_0GenericPassthrough: MSV1_0_PROTOCOL_MESSAGE_TYPE = 7

public val MsV1_0GetCredentialKey: MSV1_0_PROTOCOL_MESSAGE_TYPE = 18

public val MsV1_0GetStrongCredentialKey: MSV1_0_PROTOCOL_MESSAGE_TYPE = 21

public val MsV1_0GetUserInfo: MSV1_0_PROTOCOL_MESSAGE_TYPE = 3

public val MsV1_0InteractiveLogon: MSV1_0_LOGON_SUBMIT_TYPE = 2

public val MsV1_0InteractiveProfile: MSV1_0_PROFILE_BUFFER_TYPE = 2

public val MsV1_0Lm20ChallengeRequest: MSV1_0_PROTOCOL_MESSAGE_TYPE = 0

public val MsV1_0Lm20GetChallengeResponse: MSV1_0_PROTOCOL_MESSAGE_TYPE = 1

public val MsV1_0Lm20Logon: MSV1_0_LOGON_SUBMIT_TYPE = 3

public val MsV1_0Lm20LogonProfile: MSV1_0_PROFILE_BUFFER_TYPE = 3

public val MsV1_0LookupToken: MSV1_0_PROTOCOL_MESSAGE_TYPE = 15

public val MsV1_0LuidLogon: MSV1_0_LOGON_SUBMIT_TYPE = 84

public val MsV1_0NetworkLogon: MSV1_0_LOGON_SUBMIT_TYPE = 4

public val MsV1_0NoElevationLogon: MSV1_0_LOGON_SUBMIT_TYPE = 83

public val MsV1_0ProvisionTbal: MSV1_0_PROTOCOL_MESSAGE_TYPE = 23

public val MsV1_0ReLogonUsers: MSV1_0_PROTOCOL_MESSAGE_TYPE = 4

public val MsV1_0S4ULogon: MSV1_0_LOGON_SUBMIT_TYPE = 12

public val MsV1_0SetProcessOption: MSV1_0_PROTOCOL_MESSAGE_TYPE = 12

public val MsV1_0SetThreadOption: MSV1_0_PROTOCOL_MESSAGE_TYPE = 19

public val MsV1_0SmartCardProfile: MSV1_0_PROFILE_BUFFER_TYPE = 4

public val MsV1_0SubAuth: MSV1_0_PROTOCOL_MESSAGE_TYPE = 9

public val MsV1_0SubAuthLogon: MSV1_0_LOGON_SUBMIT_TYPE = 5

public val MsV1_0TransferCred: MSV1_0_PROTOCOL_MESSAGE_TYPE = 22

public val MsV1_0ValidateAuth: MSV1_0_PROTOCOL_MESSAGE_TYPE = 16

public val MsV1_0VirtualLogon: MSV1_0_LOGON_SUBMIT_TYPE = 82

public val MsV1_0WorkstationUnlockLogon: MSV1_0_LOGON_SUBMIT_TYPE = 7

public val MsvAvChannelBindings: MSV1_0_AVID = 10

public val MsvAvDnsComputerName: MSV1_0_AVID = 3

public val MsvAvDnsDomainName: MSV1_0_AVID = 4

public val MsvAvDnsTreeName: MSV1_0_AVID = 5

public val MsvAvEOL: MSV1_0_AVID = 0

public val MsvAvFlags: MSV1_0_AVID = 6

public val MsvAvNbComputerName: MSV1_0_AVID = 1

public val MsvAvNbDomainName: MSV1_0_AVID = 2

public val MsvAvRestrictions: MSV1_0_AVID = 8

public val MsvAvTargetName: MSV1_0_AVID = 9

public val MsvAvTimestamp: MSV1_0_AVID = 7

public val NEGOSSP_NAME: PCWSTR = w("Negotiate")

public val NEGOSSP_NAME_A: PCSTR = s("Negotiate")

public val NEGOSSP_NAME_W: PCWSTR = w("Negotiate")

public val NEGOTIATE_ALLOW_NTLM: UInt = 268435456u

public val NEGOTIATE_MAX_PREFIX: UInt = 32u

public val NEGOTIATE_NEG_NTLM: UInt = 536870912u

public val NGC_DATA_FLAG_IS_CLOUD_TRUST_CRED: UInt = 8u

public val NGC_DATA_FLAG_IS_SMARTCARD_DATA: UInt = 4u

public val NGC_DATA_FLAG_KERB_CERTIFICATE_LOGON_FLAG_CHECK_DUPLICATES: UInt = 1u

public val NGC_DATA_FLAG_KERB_CERTIFICATE_LOGON_FLAG_USE_CERTIFICATE_INFO: UInt = 2u

public val NOTIFIER_FLAG_NEW_THREAD: UInt = 1u

public val NOTIFIER_FLAG_ONE_SHOT: UInt = 2u

public val NOTIFIER_FLAG_SECONDS: UInt = 2147483648u

public val NOTIFIER_TYPE_HANDLE_WAIT: UInt = 2u

public val NOTIFIER_TYPE_IMMEDIATE: UInt = 16u

public val NOTIFIER_TYPE_INTERVAL: UInt = 1u

public val NOTIFIER_TYPE_NOTIFY_EVENT: UInt = 4u

public val NOTIFIER_TYPE_STATE_CHANGE: UInt = 3u

public val NOTIFY_CLASS_DOMAIN_CHANGE: UInt = 3u

public val NOTIFY_CLASS_PACKAGE_CHANGE: UInt = 1u

public val NOTIFY_CLASS_REGISTRY_CHANGE: UInt = 4u

public val NOTIFY_CLASS_ROLE_CHANGE: UInt = 2u

public val NO_LONG_NAMES: UInt = 2u

public val NTLMSP_NAME: PCWSTR = w("NTLM")

public val NTLMSP_NAME_A: PCSTR = s("NTLM")

public val NameCanonical: EXTENDED_NAME_FORMAT = 7

public val NameCanonicalEx: EXTENDED_NAME_FORMAT = 9

public val NameDisplay: EXTENDED_NAME_FORMAT = 3

public val NameDnsDomain: EXTENDED_NAME_FORMAT = 12

public val NameFullyQualifiedDN: EXTENDED_NAME_FORMAT = 1

public val NameGivenName: EXTENDED_NAME_FORMAT = 13

public val NameSamCompatible: EXTENDED_NAME_FORMAT = 2

public val NameServicePrincipal: EXTENDED_NAME_FORMAT = 10

public val NameSurname: EXTENDED_NAME_FORMAT = 14

public val NameUniqueId: EXTENDED_NAME_FORMAT = 6

public val NameUnknown: EXTENDED_NAME_FORMAT = 0

public val NameUserPrincipal: EXTENDED_NAME_FORMAT = 8

public val NegCallPackageMax: NEGOTIATE_MESSAGES = 4

public val NegEnumPackagePrefixes: NEGOTIATE_MESSAGES = 0

public val NegGetCallerName: NEGOTIATE_MESSAGES = 1

public val NegMsgReserved1: NEGOTIATE_MESSAGES = 3

public val NegTransferCredentials: NEGOTIATE_MESSAGES = 2

public val NetlogonGenericInformation: NETLOGON_LOGON_INFO_CLASS = 4

public val NetlogonInteractiveInformation: NETLOGON_LOGON_INFO_CLASS = 1

public val NetlogonInteractiveTransitiveInformation: NETLOGON_LOGON_INFO_CLASS = 5

public val NetlogonNetworkInformation: NETLOGON_LOGON_INFO_CLASS = 2

public val NetlogonNetworkTransitiveInformation: NETLOGON_LOGON_INFO_CLASS = 6

public val NetlogonServiceInformation: NETLOGON_LOGON_INFO_CLASS = 3

public val NetlogonServiceTransitiveInformation: NETLOGON_LOGON_INFO_CLASS = 7

public val PCT1SP_NAME: PCWSTR = w("Microsoft PCT 1.0")

public val PCT1SP_NAME_A: PCSTR = s("Microsoft PCT 1.0")

public val PCT1SP_NAME_W: PCWSTR = w("Microsoft PCT 1.0")

public val PER_USER_AUDIT_FAILURE_EXCLUDE: UInt = 8u

public val PER_USER_AUDIT_FAILURE_INCLUDE: UInt = 4u

public val PER_USER_AUDIT_NONE: UInt = 16u

public val PER_USER_AUDIT_SUCCESS_EXCLUDE: UInt = 2u

public val PER_USER_AUDIT_SUCCESS_INCLUDE: UInt = 1u

public val PER_USER_POLICY_UNCHANGED: UInt = 0u

public val PKU2U_PACKAGE_NAME: PCWSTR = w("pku2u")

public val PKU2U_PACKAGE_NAME_A: PCSTR = s("pku2u")

public val PKU2U_PACKAGE_NAME_W: PCWSTR = w("pku2u")

public val POLICY_AUDIT_EVENT_FAILURE: Int = 2

public val POLICY_AUDIT_EVENT_NONE: Int = 4

public val POLICY_AUDIT_EVENT_SUCCESS: Int = 1

public val POLICY_AUDIT_EVENT_UNCHANGED: Int = 0

public val POLICY_AUDIT_LOG_ADMIN: Int = 512

public val POLICY_CREATE_ACCOUNT: Int = 16

public val POLICY_CREATE_PRIVILEGE: Int = 64

public val POLICY_CREATE_SECRET: Int = 32

public val POLICY_GET_PRIVATE_INFORMATION: Int = 4

public val POLICY_KERBEROS_VALIDATE_CLIENT: UInt = 128u

public val POLICY_LOOKUP_NAMES: Int = 2048

public val POLICY_NOTIFICATION: Int = 4096

public val POLICY_QOS_ALLOW_LOCAL_ROOT_CERT_STORE: UInt = 32u

public val POLICY_QOS_DHCP_SERVER_ALLOWED: UInt = 128u

public val POLICY_QOS_INBOUND_CONFIDENTIALITY: UInt = 16u

public val POLICY_QOS_INBOUND_INTEGRITY: UInt = 8u

public val POLICY_QOS_OUTBOUND_CONFIDENTIALITY: UInt = 4u

public val POLICY_QOS_OUTBOUND_INTEGRITY: UInt = 2u

public val POLICY_QOS_RAS_SERVER_ALLOWED: UInt = 64u

public val POLICY_QOS_SCHANNEL_REQUIRED: UInt = 1u

public val POLICY_SERVER_ADMIN: Int = 1024

public val POLICY_SET_AUDIT_REQUIREMENTS: Int = 256

public val POLICY_SET_DEFAULT_QUOTA_LIMITS: Int = 128

public val POLICY_TRUST_ADMIN: Int = 8

public val POLICY_VIEW_AUDIT_INFORMATION: Int = 2

public val POLICY_VIEW_LOCAL_INFORMATION: Int = 1

public val PRIMARY_CRED_ARSO_LOGON: UInt = 2097152u

public val PRIMARY_CRED_AUTH_ID: UInt = 512u

public val PRIMARY_CRED_CACHED_INTERACTIVE_LOGON: UInt = 262144u

public val PRIMARY_CRED_CACHED_LOGON: UInt = 8u

public val PRIMARY_CRED_CLEAR_PASSWORD: UInt = 1u

public val PRIMARY_CRED_DO_NOT_SPLIT: UInt = 1024u

public val PRIMARY_CRED_ENCRYPTED_CREDGUARD_PASSWORD: UInt = 131072u

public val PRIMARY_CRED_ENTERPRISE_INTERNET_USER: UInt = 65536u

public val PRIMARY_CRED_EX: UInt = 4096u

public val PRIMARY_CRED_FOR_PASSWORD_CHANGE: UInt = 8388608u

public val PRIMARY_CRED_INTERACTIVE_FIDO_LOGON: UInt = 1048576u

public val PRIMARY_CRED_INTERACTIVE_NGC_LOGON: UInt = 524288u

public val PRIMARY_CRED_INTERACTIVE_SMARTCARD_LOGON: UInt = 64u

public val PRIMARY_CRED_INTERNET_USER: UInt = 256u

public val PRIMARY_CRED_LOGON_LUA: UInt = 32u

public val PRIMARY_CRED_LOGON_NO_TCB: UInt = 16u

public val PRIMARY_CRED_LOGON_PACKAGE_SHIFT: UInt = 24u

public val PRIMARY_CRED_OWF_PASSWORD: UInt = 2u

public val PRIMARY_CRED_PACKAGE_MASK: UInt = 4278190080u

public val PRIMARY_CRED_PACKED_CREDS: UInt = 32768u

public val PRIMARY_CRED_PROTECTED_USER: UInt = 2048u

public val PRIMARY_CRED_REFRESH_NEEDED: UInt = 128u

public val PRIMARY_CRED_RESTRICTED_TS: UInt = 16384u

public val PRIMARY_CRED_SUPPLEMENTAL: UInt = 4194304u

public val PRIMARY_CRED_TRANSFER: UInt = 8192u

public val PRIMARY_CRED_UPDATE: UInt = 4u

public val Pku2uCertificateS4ULogon: PKU2U_LOGON_SUBMIT_TYPE = 14

public val PolicyAccountDomainInformation: POLICY_INFORMATION_CLASS = 5

public val PolicyAuditEventsInformation: POLICY_INFORMATION_CLASS = 2

public val PolicyAuditFullQueryInformation: POLICY_INFORMATION_CLASS = 11

public val PolicyAuditFullSetInformation: POLICY_INFORMATION_CLASS = 10

public val PolicyAuditLogInformation: POLICY_INFORMATION_CLASS = 1

public val PolicyDefaultQuotaInformation: POLICY_INFORMATION_CLASS = 8

public val PolicyDnsDomainInformation: POLICY_INFORMATION_CLASS = 12

public val PolicyDnsDomainInformationInt: POLICY_INFORMATION_CLASS = 13

public val PolicyDomainEfsInformation: POLICY_DOMAIN_INFORMATION_CLASS = 2

public val PolicyDomainKerberosTicketInformation: POLICY_DOMAIN_INFORMATION_CLASS = 3

public val PolicyLastEntry: POLICY_INFORMATION_CLASS = 17

public val PolicyLocalAccountDomainInformation: POLICY_INFORMATION_CLASS = 14

public val PolicyLsaServerRoleInformation: POLICY_INFORMATION_CLASS = 6

public val PolicyMachineAccountInformation: POLICY_INFORMATION_CLASS = 15

public val PolicyMachineAccountInformation2: POLICY_INFORMATION_CLASS = 16

public val PolicyModificationInformation: POLICY_INFORMATION_CLASS = 9

public val PolicyNotifyAccountDomainInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 2

public val PolicyNotifyAuditEventsInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 1

public val PolicyNotifyDnsDomainInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 4

public val PolicyNotifyDomainEfsInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 5

public val PolicyNotifyDomainKerberosTicketInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 6

public val PolicyNotifyGlobalSaclInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 8

public val PolicyNotifyMachineAccountPasswordInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 7

public val PolicyNotifyMax: POLICY_NOTIFICATION_INFORMATION_CLASS = 9

public val PolicyNotifyServerRoleInformation: POLICY_NOTIFICATION_INFORMATION_CLASS = 3

public val PolicyPdAccountInformation: POLICY_INFORMATION_CLASS = 4

public val PolicyPrimaryDomainInformation: POLICY_INFORMATION_CLASS = 3

public val PolicyReplicaSourceInformation: POLICY_INFORMATION_CLASS = 7

public val PolicyServerRoleBackup: POLICY_LSA_SERVER_ROLE = 2

public val PolicyServerRolePrimary: POLICY_LSA_SERVER_ROLE = 3

public val RCRED_CRED_EXISTS: UInt = 1u

public val RCRED_STATUS_NOCRED: UInt = 0u

public val RCRED_STATUS_UNKNOWN_ISSUER: UInt = 2u

public val RTL_ENCRYPT_MEMORY_SIZE: UInt = 8u

public val RTL_ENCRYPT_OPTION_CROSS_PROCESS: UInt = 1u

public val RTL_ENCRYPT_OPTION_FOR_SYSTEM: UInt = 4u

public val RTL_ENCRYPT_OPTION_SAME_LOGON: UInt = 2u

public val SAM_CREDENTIAL_UPDATE_FREE_ROUTINE: PCSTR = s("CredentialUpdateFree")

public val SAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINE: PCSTR = s("CredentialUpdateNotify")

public val SAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINE: PCSTR = s("RegisterMappedEntrypoints")

public val SAM_CREDENTIAL_UPDATE_REGISTER_ROUTINE: PCSTR = s("CredentialUpdateRegister")

public val SAM_DAYS_PER_WEEK: UInt = 7u

public val SAM_INIT_NOTIFICATION_ROUTINE: PCSTR = s("InitializeChangeNotify")

public val SAM_PASSWORD_CHANGE_NOTIFY_ROUTINE: PCSTR = s("PasswordChangeNotify")

public val SAM_PASSWORD_FILTER_ROUTINE: PCSTR = s("PasswordFilter")

public val SASL_OPTION_AUTHZ_PROCESSING: UInt = 4u

public val SASL_OPTION_AUTHZ_STRING: UInt = 3u

public val SASL_OPTION_RECV_SIZE: UInt = 2u

public val SASL_OPTION_SEND_SIZE: UInt = 1u

public val SCHANNEL_ALERT: UInt = 2u

public val SCHANNEL_CRED_VERSION: UInt = 4u

public val SCHANNEL_NAME: PCWSTR = w("Schannel")

public val SCHANNEL_NAME_A: PCSTR = s("Schannel")

public val SCHANNEL_NAME_W: PCWSTR = w("Schannel")

public val SCHANNEL_RENEGOTIATE: UInt = 0u

public val SCHANNEL_SECRET_PRIVKEY: UInt = 2u

public val SCHANNEL_SECRET_TYPE_CAPI: UInt = 1u

public val SCHANNEL_SESSION: UInt = 3u

public val SCHANNEL_SHUTDOWN: UInt = 1u

public val SCH_ALLOW_NULL_ENCRYPTION: UInt = 33554432u

public val SCH_CREDENTIALS_VERSION: UInt = 5u

public val SCH_CRED_AUTO_CRED_VALIDATION: SCHANNEL_CRED_FLAGS = 32u

public val SCH_CRED_CACHE_ONLY_URL_RETRIEVAL: UInt = 32768u

public val SCH_CRED_CACHE_ONLY_URL_RETRIEVAL_ON_CREATE: SCHANNEL_CRED_FLAGS = 131072u

public val SCH_CRED_CERT_CONTEXT: UInt = 3u

public val SCH_CRED_DEFERRED_CRED_VALIDATION: UInt = 67108864u

public val SCH_CRED_DISABLE_RECONNECTS: UInt = 128u

public val SCH_CRED_FORMAT_CERT_CONTEXT: UInt = 0u

public val SCH_CRED_FORMAT_CERT_HASH: UInt = 1u

public val SCH_CRED_FORMAT_CERT_HASH_STORE: UInt = 2u

public val SCH_CRED_IGNORE_NO_REVOCATION_CHECK: SCHANNEL_CRED_FLAGS = 2048u

public val SCH_CRED_IGNORE_REVOCATION_OFFLINE: SCHANNEL_CRED_FLAGS = 4096u

public val SCH_CRED_MANUAL_CRED_VALIDATION: SCHANNEL_CRED_FLAGS = 8u

public val SCH_CRED_MAX_STORE_NAME_SIZE: UInt = 128u

public val SCH_CRED_MAX_SUPPORTED_ALGS: UInt = 256u

public val SCH_CRED_MAX_SUPPORTED_ALPN_IDS: UInt = 16u

public val SCH_CRED_MAX_SUPPORTED_CERTS: UInt = 100u

public val SCH_CRED_MAX_SUPPORTED_CHAINING_MODES: UInt = 16u

public val SCH_CRED_MAX_SUPPORTED_CRYPTO_SETTINGS: UInt = 16u

public val SCH_CRED_MAX_SUPPORTED_PARAMETERS: UInt = 16u

public val SCH_CRED_MEMORY_STORE_CERT: UInt = 65536u

public val SCH_CRED_NO_DEFAULT_CREDS: SCHANNEL_CRED_FLAGS = 16u

public val SCH_CRED_NO_SERVERNAME_CHECK: SCHANNEL_CRED_FLAGS = 4u

public val SCH_CRED_NO_SYSTEM_MAPPER: SCHANNEL_CRED_FLAGS = 2u

public val SCH_CRED_RESTRICTED_ROOTS: UInt = 8192u

public val SCH_CRED_REVOCATION_CHECK_CACHE_ONLY: UInt = 16384u

public val SCH_CRED_REVOCATION_CHECK_CHAIN: SCHANNEL_CRED_FLAGS = 512u

public val SCH_CRED_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT: SCHANNEL_CRED_FLAGS = 1024u

public val SCH_CRED_REVOCATION_CHECK_END_CERT: SCHANNEL_CRED_FLAGS = 256u

public val SCH_CRED_SNI_CREDENTIAL: UInt = 524288u

public val SCH_CRED_SNI_ENABLE_OCSP: UInt = 1048576u

public val SCH_CRED_USE_DEFAULT_CREDS: SCHANNEL_CRED_FLAGS = 64u

public val SCH_CRED_V1: UInt = 1u

public val SCH_CRED_V2: UInt = 2u

public val SCH_CRED_V3: UInt = 3u

public val SCH_CRED_VERSION: UInt = 2u

public val SCH_CRED_X509_CAPI: UInt = 2u

public val SCH_CRED_X509_CERTCHAIN: UInt = 1u

public val SCH_DISABLE_RECONNECTS: SCHANNEL_CRED_FLAGS = 128u

public val SCH_EXTENSIONS_OPTIONS_NONE: SchGetExtensionsOptions = 0

public val SCH_MACHINE_CERT_HASH: UInt = 1u

public val SCH_MAX_EXT_SUBSCRIPTIONS: UInt = 2u

public val SCH_NO_RECORD_HEADER: SchGetExtensionsOptions = 1

public val SCH_SEND_AUX_RECORD: SCHANNEL_CRED_FLAGS = 2097152u

public val SCH_SEND_ROOT_CERT: SCHANNEL_CRED_FLAGS = 262144u

public val SCH_USE_DTLS_ONLY: UInt = 16777216u

public val SCH_USE_PRESHAREDKEY_ONLY: SCHANNEL_CRED_FLAGS = 8388608u

public val SCH_USE_STRONG_CRYPTO: SCHANNEL_CRED_FLAGS = 4194304u

public val SECBUFFER_ALERT: UInt = 17u

public val SECBUFFER_APPLICATION_PROTOCOLS: UInt = 18u

public val SECBUFFER_ATTRMASK: UInt = 4026531840u

public val SECBUFFER_CERTIFICATE_REQUEST_CONTEXT: UInt = 29u

public val SECBUFFER_CHANGE_PASS_RESPONSE: UInt = 15u

public val SECBUFFER_CHANNEL_BINDINGS: UInt = 14u

public val SECBUFFER_CHANNEL_BINDINGS_RESULT: UInt = 30u

public val SECBUFFER_DATA: UInt = 1u

public val SECBUFFER_DTLS_MTU: UInt = 24u

public val SECBUFFER_EMPTY: UInt = 0u

public val SECBUFFER_EXTRA: UInt = 5u

public val SECBUFFER_FLAGS: UInt = 27u

public val SECBUFFER_KERNEL_MAP: UInt = 536870912u

public val SECBUFFER_MECHLIST: UInt = 11u

public val SECBUFFER_MECHLIST_SIGNATURE: UInt = 12u

public val SECBUFFER_MISSING: UInt = 4u

public val SECBUFFER_NEGOTIATION_INFO: UInt = 8u

public val SECBUFFER_PADDING: UInt = 9u

public val SECBUFFER_PKG_PARAMS: UInt = 3u

public val SECBUFFER_PRESHARED_KEY: UInt = 22u

public val SECBUFFER_PRESHARED_KEY_IDENTITY: UInt = 23u

public val SECBUFFER_READONLY: UInt = 2147483648u

public val SECBUFFER_READONLY_WITH_CHECKSUM: UInt = 268435456u

public val SECBUFFER_RESERVED: UInt = 1610612736u

public val SECBUFFER_SEND_GENERIC_TLS_EXTENSION: UInt = 25u

public val SECBUFFER_SRTP_MASTER_KEY_IDENTIFIER: UInt = 20u

public val SECBUFFER_SRTP_PROTECTION_PROFILES: UInt = 19u

public val SECBUFFER_STREAM: UInt = 10u

public val SECBUFFER_STREAM_HEADER: UInt = 7u

public val SECBUFFER_STREAM_TRAILER: UInt = 6u

public val SECBUFFER_SUBSCRIBE_GENERIC_TLS_EXTENSION: UInt = 26u

public val SECBUFFER_TARGET: UInt = 13u

public val SECBUFFER_TARGET_HOST: UInt = 16u

public val SECBUFFER_TOKEN: UInt = 2u

public val SECBUFFER_TOKEN_BINDING: UInt = 21u

public val SECBUFFER_TRAFFIC_SECRETS: UInt = 28u

public val SECBUFFER_UNMAPPED: UInt = 1073741824u

public val SECBUFFER_VERSION: UInt = 0u

public val SECPKGCONTEXT_CIPHERINFO_V1: UInt = 1u

public val SECPKGCONTEXT_CONNECTION_INFO_EX_V1: UInt = 1u

public val SECPKG_ANSI_ATTRIBUTE: UInt = 0u

public val SECPKG_ATTR_ACCESS_TOKEN: SECPKG_ATTR = 18u

public val SECPKG_ATTR_APPLICATION_PROTOCOL: UInt = 35u

public val SECPKG_ATTR_APP_DATA: SECPKG_ATTR = 94u

public val SECPKG_ATTR_AUTHENTICATION_ID: UInt = 20u

public val SECPKG_ATTR_AUTHORITY: SECPKG_ATTR = 6u

public val SECPKG_ATTR_CC_POLICY_RESULT: UInt = 97u

public val SECPKG_ATTR_CERT_CHECK_RESULT: UInt = 113u

public val SECPKG_ATTR_CERT_CHECK_RESULT_INPROC: UInt = 114u

public val SECPKG_ATTR_CERT_TRUST_STATUS: SECPKG_ATTR = 2147483780u

public val SECPKG_ATTR_CIPHER_INFO: UInt = 100u

public val SECPKG_ATTR_CIPHER_STRENGTHS: UInt = 87u

public val SECPKG_ATTR_CLIENT_CERT_POLICY: UInt = 96u

public val SECPKG_ATTR_CLIENT_SPECIFIED_TARGET: SECPKG_ATTR = 27u

public val SECPKG_ATTR_CONNECTION_INFO: SECPKG_ATTR = 90u

public val SECPKG_ATTR_CONNECTION_INFO_EX: UInt = 110u

public val SECPKG_ATTR_CONTEXT_DELETED: UInt = 33u

public val SECPKG_ATTR_CREDENTIAL_NAME: UInt = 16u

public val SECPKG_ATTR_CREDS: SECPKG_ATTR = 2147483776u

public val SECPKG_ATTR_CREDS_2: SECPKG_ATTR = 2147483782u

public val SECPKG_ATTR_C_ACCESS_TOKEN: SECPKG_ATTR = 2147483666u

public val SECPKG_ATTR_C_FULL_ACCESS_TOKEN: SECPKG_ATTR = 2147483778u

public val SECPKG_ATTR_DCE_INFO: SECPKG_ATTR = 3u

public val SECPKG_ATTR_DTLS_MTU: SECPKG_ATTR = 34u

public val SECPKG_ATTR_EAP_KEY_BLOCK: SECPKG_ATTR = 91u

public val SECPKG_ATTR_EAP_PRF_INFO: SECPKG_ATTR = 101u

public val SECPKG_ATTR_EARLY_START: SECPKG_ATTR = 105u

public val SECPKG_ATTR_ENDPOINT_BINDINGS: SECPKG_ATTR = 26u

public val SECPKG_ATTR_FLAGS: SECPKG_ATTR = 14u

public val SECPKG_ATTR_ISSUER_LIST: UInt = 80u

public val SECPKG_ATTR_ISSUER_LIST_EX: SECPKG_ATTR = 89u

public val SECPKG_ATTR_IS_LOOPBACK: UInt = 37u

public val SECPKG_ATTR_KEYING_MATERIAL: UInt = 107u

public val SECPKG_ATTR_KEYING_MATERIAL_INFO: SECPKG_ATTR = 106u

public val SECPKG_ATTR_KEYING_MATERIAL_INPROC: UInt = 112u

public val SECPKG_ATTR_KEYING_MATERIAL_TOKEN_BINDING: UInt = 111u

public val SECPKG_ATTR_KEY_INFO: SECPKG_ATTR = 5u

public val SECPKG_ATTR_LAST_CLIENT_TOKEN_STATUS: SECPKG_ATTR = 30u

public val SECPKG_ATTR_LIFESPAN: SECPKG_ATTR = 2u

public val SECPKG_ATTR_LOCAL_CERT_CONTEXT: SECPKG_ATTR = 84u

public val SECPKG_ATTR_LOCAL_CERT_INFO: UInt = 99u

public val SECPKG_ATTR_LOCAL_CRED: SECPKG_ATTR = 82u

public val SECPKG_ATTR_LOGOFF_TIME: UInt = 21u

public val SECPKG_ATTR_MAPPED_CRED_ATTR: UInt = 92u

public val SECPKG_ATTR_NAMES: SECPKG_ATTR = 1u

public val SECPKG_ATTR_NATIVE_NAMES: SECPKG_ATTR = 13u

public val SECPKG_ATTR_NEGOTIATED_TLS_EXTENSIONS: UInt = 36u

public val SECPKG_ATTR_NEGOTIATION_INFO: SECPKG_ATTR = 12u

public val SECPKG_ATTR_NEGOTIATION_PACKAGE: SECPKG_ATTR = 2147483777u

public val SECPKG_ATTR_NEGO_INFO_FLAG_NO_KERBEROS: UInt = 1u

public val SECPKG_ATTR_NEGO_INFO_FLAG_NO_NTLM: UInt = 2u

public val SECPKG_ATTR_NEGO_KEYS: UInt = 22u

public val SECPKG_ATTR_NEGO_PKG_INFO: UInt = 31u

public val SECPKG_ATTR_NEGO_STATUS: UInt = 32u

public val SECPKG_ATTR_PACKAGE_INFO: SECPKG_ATTR = 10u

public val SECPKG_ATTR_PASSWORD_EXPIRY: SECPKG_ATTR = 8u

public val SECPKG_ATTR_PROMPTING_NEEDED: UInt = 24u

public val SECPKG_ATTR_PROTO_INFO: UInt = 7u

public val SECPKG_ATTR_REMOTE_CERTIFICATES: UInt = 95u

public val SECPKG_ATTR_REMOTE_CERT_CHAIN: UInt = 103u

public val SECPKG_ATTR_REMOTE_CERT_CONTEXT: SECPKG_ATTR = 83u

public val SECPKG_ATTR_REMOTE_CRED: UInt = 81u

public val SECPKG_ATTR_ROOT_STORE: SECPKG_ATTR = 85u

public val SECPKG_ATTR_SASL_CONTEXT: UInt = 65536u

public val SECPKG_ATTR_SERIALIZED_REMOTE_CERT_CONTEXT: UInt = 117u

public val SECPKG_ATTR_SERIALIZED_REMOTE_CERT_CONTEXT_INPROC: UInt = 116u

public val SECPKG_ATTR_SERVER_AUTH_FLAGS: SECPKG_ATTR = 2147483779u

public val SECPKG_ATTR_SESSION_INFO: SECPKG_ATTR = 93u

public val SECPKG_ATTR_SESSION_KEY: SECPKG_ATTR = 9u

public val SECPKG_ATTR_SESSION_TICKET_KEYS: UInt = 115u

public val SECPKG_ATTR_SIZES: SECPKG_ATTR = 0u

public val SECPKG_ATTR_SRTP_PARAMETERS: UInt = 108u

public val SECPKG_ATTR_STREAM_SIZES: SECPKG_ATTR = 4u

public val SECPKG_ATTR_SUBJECT_SECURITY_ATTRIBUTES: SECPKG_ATTR = 124u

public val SECPKG_ATTR_SUPPORTED_ALGS: UInt = 86u

public val SECPKG_ATTR_SUPPORTED_PROTOCOLS: UInt = 88u

public val SECPKG_ATTR_SUPPORTED_SIGNATURES: SECPKG_ATTR = 102u

public val SECPKG_ATTR_TARGET: UInt = 19u

public val SECPKG_ATTR_TARGET_INFORMATION: SECPKG_ATTR = 17u

public val SECPKG_ATTR_THUNK_ALL: UInt = 65536u

public val SECPKG_ATTR_TOKEN_BINDING: UInt = 109u

public val SECPKG_ATTR_UI_INFO: UInt = 104u

public val SECPKG_ATTR_UNIQUE_BINDINGS: SECPKG_ATTR = 25u

public val SECPKG_ATTR_USER_FLAGS: UInt = 11u

public val SECPKG_ATTR_USE_NCRYPT: UInt = 98u

public val SECPKG_ATTR_USE_VALIDATED: UInt = 15u

public val SECPKG_CALLFLAGS_APPCONTAINER: UInt = 1u

public val SECPKG_CALLFLAGS_APPCONTAINER_AUTHCAPABLE: UInt = 2u

public val SECPKG_CALLFLAGS_APPCONTAINER_UPNCAPABLE: UInt = 8u

public val SECPKG_CALLFLAGS_FORCE_SUPPLIED: UInt = 4u

public val SECPKG_CALL_ANSI: UInt = 2u

public val SECPKG_CALL_ASYNC_UPDATE: UInt = 4096u

public val SECPKG_CALL_BUFFER_MARSHAL: UInt = 65536u

public val SECPKG_CALL_CLEANUP: UInt = 32u

public val SECPKG_CALL_CLOUDAP_CONNECT: UInt = 262144u

public val SECPKG_CALL_IN_PROC: UInt = 16u

public val SECPKG_CALL_IS_TCB: UInt = 512u

public val SECPKG_CALL_KERNEL_MODE: UInt = 1u

public val SECPKG_CALL_NEGO: UInt = 16384u

public val SECPKG_CALL_NEGO_EXTENDER: UInt = 32768u

public val SECPKG_CALL_NETWORK_ONLY: UInt = 1024u

public val SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_CLEANUP_CREDENTIALS: UInt = 2u

public val SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_OPTIMISTIC_LOGON: UInt = 1u

public val SECPKG_CALL_PACKAGE_TRANSFER_CRED_REQUEST_FLAG_TO_SSO_SESSION: UInt = 4u

public val SECPKG_CALL_PROCESS_TERM: UInt = 256u

public val SECPKG_CALL_RECURSIVE: UInt = 8u

public val SECPKG_CALL_SYSTEM_PROC: UInt = 8192u

public val SECPKG_CALL_THREAD_TERM: UInt = 128u

public val SECPKG_CALL_UNLOCK: UInt = 131072u

public val SECPKG_CALL_URGENT: UInt = 4u

public val SECPKG_CALL_WINLOGON: UInt = 2048u

public val SECPKG_CALL_WOWA32: UInt = 262144u

public val SECPKG_CALL_WOWCLIENT: UInt = 64u

public val SECPKG_CALL_WOWX86: UInt = 64u

public val SECPKG_CLIENT_PROCESS_TERMINATED: UInt = 1u

public val SECPKG_CLIENT_THREAD_TERMINATED: UInt = 2u

public val SECPKG_CONTEXT_EXPORT_DELETE_OLD: EXPORT_SECURITY_CONTEXT_FLAGS = 2u

public val SECPKG_CONTEXT_EXPORT_RESET_NEW: EXPORT_SECURITY_CONTEXT_FLAGS = 1u

public val SECPKG_CONTEXT_EXPORT_TO_KERNEL: EXPORT_SECURITY_CONTEXT_FLAGS = 4u

public val SECPKG_CREDENTIAL_ATTRIBUTE: UInt = 0u

public val SECPKG_CREDENTIAL_FLAGS_CALLER_HAS_TCB: UInt = 1u

public val SECPKG_CREDENTIAL_FLAGS_CREDMAN_CRED: UInt = 2u

public val SECPKG_CREDENTIAL_VERSION: UInt = 201u

public val SECPKG_CRED_ATTR_CERT: UInt = 4u

public val SECPKG_CRED_ATTR_KDC_PROXY_SETTINGS: UInt = 3u

public val SECPKG_CRED_ATTR_NAMES: UInt = 1u

public val SECPKG_CRED_ATTR_PAC_BYPASS: UInt = 5u

public val SECPKG_CRED_ATTR_SSI_PROVIDER: UInt = 2u

public val SECPKG_CRED_AUTOLOGON_RESTRICTED: UInt = 16u

public val SECPKG_CRED_BOTH: UInt = 3u

public val SECPKG_CRED_DEFAULT: UInt = 4u

public val SECPKG_CRED_INBOUND: SECPKG_CRED = 1u

public val SECPKG_CRED_OUTBOUND: SECPKG_CRED = 2u

public val SECPKG_CRED_PROCESS_POLICY_ONLY: UInt = 32u

public val SECPKG_CRED_RESERVED: UInt = 4026531840u

public val SECPKG_FLAG_ACCEPT_WIN32_NAME: UInt = 512u

public val SECPKG_FLAG_APPCONTAINER_CHECKS: UInt = 8388608u

public val SECPKG_FLAG_APPCONTAINER_PASSTHROUGH: UInt = 4194304u

public val SECPKG_FLAG_APPLY_LOOPBACK: UInt = 33554432u

public val SECPKG_FLAG_ASCII_BUFFERS: UInt = 16384u

public val SECPKG_FLAG_CLIENT_ONLY: UInt = 64u

public val SECPKG_FLAG_CONNECTION: UInt = 16u

public val SECPKG_FLAG_CREDENTIAL_ISOLATION_ENABLED: UInt = 16777216u

public val SECPKG_FLAG_DATAGRAM: UInt = 8u

public val SECPKG_FLAG_DELEGATION: UInt = 131072u

public val SECPKG_FLAG_EXTENDED_ERROR: UInt = 128u

public val SECPKG_FLAG_FRAGMENT: UInt = 32768u

public val SECPKG_FLAG_GSS_COMPATIBLE: UInt = 4096u

public val SECPKG_FLAG_IMPERSONATION: UInt = 256u

public val SECPKG_FLAG_INTEGRITY: UInt = 1u

public val SECPKG_FLAG_LOGON: UInt = 8192u

public val SECPKG_FLAG_MULTI_REQUIRED: UInt = 32u

public val SECPKG_FLAG_MUTUAL_AUTH: UInt = 65536u

public val SECPKG_FLAG_NEGOTIABLE: UInt = 2048u

public val SECPKG_FLAG_NEGOTIABLE2: UInt = 2097152u

public val SECPKG_FLAG_NEGO_EXTENDER: UInt = 1048576u

public val SECPKG_FLAG_PRIVACY: UInt = 2u

public val SECPKG_FLAG_READONLY_WITH_CHECKSUM: UInt = 262144u

public val SECPKG_FLAG_RESTRICTED_TOKENS: UInt = 524288u

public val SECPKG_FLAG_STREAM: UInt = 1024u

public val SECPKG_FLAG_TOKEN_ONLY: UInt = 4u

public val SECPKG_ID_NONE: UInt = 65535u

public val SECPKG_INTERFACE_VERSION: UInt = 65536u

public val SECPKG_INTERFACE_VERSION_10: UInt = 33554432u

public val SECPKG_INTERFACE_VERSION_11: UInt = 67108864u

public val SECPKG_INTERFACE_VERSION_2: UInt = 131072u

public val SECPKG_INTERFACE_VERSION_3: UInt = 262144u

public val SECPKG_INTERFACE_VERSION_4: UInt = 524288u

public val SECPKG_INTERFACE_VERSION_5: UInt = 1048576u

public val SECPKG_INTERFACE_VERSION_6: UInt = 2097152u

public val SECPKG_INTERFACE_VERSION_7: UInt = 4194304u

public val SECPKG_INTERFACE_VERSION_8: UInt = 8388608u

public val SECPKG_INTERFACE_VERSION_9: UInt = 16777216u

public val SECPKG_LSAMODEINIT_NAME: PCSTR = s("SpLsaModeInitialize")

public val SECPKG_MAX_OID_LENGTH: UInt = 32u

public val SECPKG_MSVAV_FLAGS_VALID: UInt = 1u

public val SECPKG_MSVAV_TIMESTAMP_VALID: UInt = 2u

public val SECPKG_NEGOTIATION_COMPLETE: UInt = 0u

public val SECPKG_NEGOTIATION_DIRECT: UInt = 3u

public val SECPKG_NEGOTIATION_IN_PROGRESS: UInt = 2u

public val SECPKG_NEGOTIATION_OPTIMISTIC: UInt = 1u

public val SECPKG_NEGOTIATION_TRY_MULTICRED: UInt = 4u

public val SECPKG_OPTIONS_PERMANENT: UInt = 1u

public val SECPKG_OPTIONS_TYPE_LSA: SECURITY_PACKAGE_OPTIONS_TYPE = 1u

public val SECPKG_OPTIONS_TYPE_SSPI: SECURITY_PACKAGE_OPTIONS_TYPE = 2u

public val SECPKG_OPTIONS_TYPE_UNKNOWN: SECURITY_PACKAGE_OPTIONS_TYPE = 0u

public val SECPKG_PACKAGE_CHANGE_LOAD: SECPKG_PACKAGE_CHANGE_TYPE = 0u

public val SECPKG_PACKAGE_CHANGE_SELECT: SECPKG_PACKAGE_CHANGE_TYPE = 2u

public val SECPKG_PACKAGE_CHANGE_UNLOAD: SECPKG_PACKAGE_CHANGE_TYPE = 1u

public val SECPKG_PRIMARY_CRED_EX_FLAGS_EX_DELEGATION_TOKEN: UInt = 1u

public val SECPKG_REDIRECTED_LOGON_GUID_INITIALIZER: GUID = GUID.from_u128(U128(0xc2be545782eb483euL, 0xae4e7468ef14d509uL))

public val SECPKG_STATE_CRED_ISOLATION_ENABLED: UInt = 32u

public val SECPKG_STATE_DOMAIN_CONTROLLER: UInt = 4u

public val SECPKG_STATE_ENCRYPTION_PERMITTED: UInt = 1u

public val SECPKG_STATE_RESERVED_1: UInt = 2147483648u

public val SECPKG_STATE_STANDALONE: UInt = 16u

public val SECPKG_STATE_STRONG_ENCRYPTION_PERMITTED: UInt = 2u

public val SECPKG_STATE_WORKSTATION: UInt = 8u

public val SECPKG_SURROGATE_LOGON_VERSION_1: UInt = 1u

public val SECPKG_UNICODE_ATTRIBUTE: UInt = 2147483648u

public val SECPKG_USERMODEINIT_NAME: PCSTR = s("SpUserModeInitialize")

public val SECQOP_WRAP_NO_ENCRYPT: UInt = 2147483649u

public val SECQOP_WRAP_OOB_DATA: UInt = 1073741824u

public val SECRET_QUERY_VALUE: Int = 2

public val SECRET_SET_VALUE: Int = 1

public val SECURITY_ENTRYPOINT: PCWSTR = w("INITSECURITYINTERFACEA")

public val SECURITY_ENTRYPOINT16: PCSTR = s("INITSECURITYINTERFACEA")

public val SECURITY_ENTRYPOINT_ANSI: PCWSTR = w("InitSecurityInterfaceW")

public val SECURITY_ENTRYPOINT_ANSIA: PCSTR = s("InitSecurityInterfaceA")

public val SECURITY_ENTRYPOINT_ANSIW: PCSTR = s("InitSecurityInterfaceW")

public val SECURITY_NATIVE_DREP: UInt = 16u

public val SECURITY_NETWORK_DREP: UInt = 0u

public val SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION: UInt = 1u

public val SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_2: UInt = 2u

public val SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_3: UInt = 3u

public val SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_4: UInt = 4u

public val SECURITY_SUPPORT_PROVIDER_INTERFACE_VERSION_5: UInt = 5u

public val SEC_CHANNEL_BINDINGS_AUDIT_BINDINGS: UInt = 1u

public val SEC_CHANNEL_BINDINGS_RESULT_ABSENT: UInt = 2u

public val SEC_CHANNEL_BINDINGS_RESULT_CLIENT_SUPPORT: UInt = 1u

public val SEC_CHANNEL_BINDINGS_RESULT_NOTVALID_MISMATCH: UInt = 4u

public val SEC_CHANNEL_BINDINGS_RESULT_NOTVALID_MISSING: UInt = 8u

public val SEC_CHANNEL_BINDINGS_RESULT_VALID_MATCHED: UInt = 16u

public val SEC_CHANNEL_BINDINGS_RESULT_VALID_MISSING: UInt = 64u

public val SEC_CHANNEL_BINDINGS_RESULT_VALID_PROXY: UInt = 32u

public val SEC_CHANNEL_BINDINGS_VALID_FLAGS: UInt = 1u

public val SEC_WINNT_AUTH_IDENTITY_ENCRYPT_FOR_SYSTEM: UInt = 4u

public val SEC_WINNT_AUTH_IDENTITY_ENCRYPT_SAME_LOGON: UInt = 1u

public val SEC_WINNT_AUTH_IDENTITY_ENCRYPT_SAME_PROCESS: UInt = 2u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_ID_PROVIDER: UInt = 524288u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_NULL_DOMAIN: UInt = 262144u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_NULL_USER: UInt = 131072u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_PROCESS_ENCRYPTED: UInt = 16u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_RESERVED: UInt = 65536u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_CREDPROV_DO_NOT_LOAD: UInt = 268435456u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_CREDPROV_DO_NOT_SAVE: UInt = 2147483648u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_NO_CHECKBOX: UInt = 536870912u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_SAVE_CRED_BY_CALLER: UInt = 2147483648u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_SAVE_CRED_CHECKED: UInt = 1073741824u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SSPIPFC_USE_MASK: UInt = 4278190080u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SYSTEM_ENCRYPTED: UInt = 128u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_SYSTEM_PROTECTED: UInt = 32u

public val SEC_WINNT_AUTH_IDENTITY_FLAGS_USER_PROTECTED: UInt = 64u

public val SEC_WINNT_AUTH_IDENTITY_MARSHALLED: UInt = 4u

public val SEC_WINNT_AUTH_IDENTITY_ONLY: UInt = 8u

public val SEC_WINNT_AUTH_IDENTITY_VERSION: UInt = 512u

public val SEC_WINNT_AUTH_IDENTITY_VERSION_2: UInt = 513u

public val SESSION_TICKET_INFO_V0: UInt = 0u

public val SESSION_TICKET_INFO_VERSION: UInt = 0u

public val SE_ADT_OBJECT_ONLY: UInt = 1u

public val SE_ADT_PARAMETERS_SELF_RELATIVE: UInt = 1u

public val SE_ADT_PARAMETERS_SEND_TO_LSA: UInt = 2u

public val SE_ADT_PARAMETER_EXTENSIBLE_AUDIT: UInt = 4u

public val SE_ADT_PARAMETER_GENERIC_AUDIT: UInt = 8u

public val SE_ADT_PARAMETER_WRITE_SYNCHRONOUS: UInt = 16u

public val SE_ADT_POLICY_AUDIT_EVENT_TYPE_EX_BEGIN: UInt = 100u

public val SE_BATCH_LOGON_NAME: PCWSTR = w("SeBatchLogonRight")

public val SE_DENY_BATCH_LOGON_NAME: PCWSTR = w("SeDenyBatchLogonRight")

public val SE_DENY_INTERACTIVE_LOGON_NAME: PCWSTR = w("SeDenyInteractiveLogonRight")

public val SE_DENY_NETWORK_LOGON_NAME: PCWSTR = w("SeDenyNetworkLogonRight")

public val SE_DENY_REMOTE_INTERACTIVE_LOGON_NAME: PCWSTR = w("SeDenyRemoteInteractiveLogonRight")

public val SE_DENY_SERVICE_LOGON_NAME: PCWSTR = w("SeDenyServiceLogonRight")

public val SE_INTERACTIVE_LOGON_NAME: PCWSTR = w("SeInteractiveLogonRight")

public val SE_MAX_AUDIT_PARAMETERS: UInt = 32u

public val SE_MAX_GENERIC_AUDIT_PARAMETERS: UInt = 28u

public val SE_NETWORK_LOGON_NAME: PCWSTR = w("SeNetworkLogonRight")

public val SE_REMOTE_INTERACTIVE_LOGON_NAME: PCWSTR = w("SeRemoteInteractiveLogonRight")

public val SE_SERVICE_LOGON_NAME: PCWSTR = w("SeServiceLogonRight")

public val SL_ACTIVATION_TYPE_ACTIVE_DIRECTORY: SL_ACTIVATION_TYPE = 1

public val SL_ACTIVATION_TYPE_DEFAULT: SL_ACTIVATION_TYPE = 0

public val SL_CLIENTAPI_ZONE: UInt = 61440u

public val SL_DATA_BINARY: SLDATATYPE = 3u

public val SL_DATA_DWORD: SLDATATYPE = 4u

public val SL_DATA_MULTI_SZ: SLDATATYPE = 7u

public val SL_DATA_NONE: SLDATATYPE = 0u

public val SL_DATA_SUM: SLDATATYPE = 100u

public val SL_DATA_SZ: SLDATATYPE = 1u

public val SL_DEFAULT_MIGRATION_ENCRYPTOR_URI: PCWSTR = w("msft:spp/migrationencryptor/tokenact/1.0")

public val SL_EVENT_LICENSING_STATE_CHANGED: PCWSTR = w("msft:rm/event/licensingstatechanged")

public val SL_EVENT_POLICY_CHANGED: PCWSTR = w("msft:rm/event/policychanged")

public val SL_EVENT_USER_NOTIFICATION: PCWSTR = w("msft:rm/event/usernotification")

public val SL_E_ACTIVATION_IN_PROGRESS: HRESULT = 0xC004E028u.toInt()

public val SL_E_APPLICATION_POLICIES_MISSING: HRESULT = 0xC004F072u.toInt()

public val SL_E_APPLICATION_POLICIES_NOT_LOADED: HRESULT = 0xC004F073u.toInt()

public val SL_E_AUTHN_CANT_VERIFY: HRESULT = 0xC004F07Au.toInt()

public val SL_E_AUTHN_CHALLENGE_NOT_SET: HRESULT = 0xC004F079u.toInt()

public val SL_E_AUTHN_MISMATCHED_KEY: HRESULT = 0xC004F078u.toInt()

public val SL_E_AUTHN_WRONG_VERSION: HRESULT = 0xC004F077u.toInt()

public val SL_E_BASE_SKU_NOT_AVAILABLE: HRESULT = 0xC004F055u.toInt()

public val SL_E_BIOS_KEY: HRESULT = 0xC004F215u.toInt()

public val SL_E_BLOCKED_PRODUCT_KEY: HRESULT = 0xC004F051u.toInt()

public val SL_E_CHPA_ACTCONFIG_ID_NOT_FOUND: HRESULT = 0xC004C009u.toInt()

public val SL_E_CHPA_BINDING_MAPPING_NOT_FOUND: HRESULT = 0xC004C006u.toInt()

public val SL_E_CHPA_BINDING_NOT_FOUND: HRESULT = 0xC004C005u.toInt()

public val SL_E_CHPA_BUSINESS_RULE_INPUT_NOT_FOUND: HRESULT = 0xC004C700u.toInt()

public val SL_E_CHPA_DATABASE_ERROR: HRESULT = 0xC004C013u.toInt()

public val SL_E_CHPA_DIGITALMARKER_BINDING_NOT_CONFIGURED: HRESULT = 0xC004C052u.toInt()

public val SL_E_CHPA_DIGITALMARKER_INVALID_BINDING: HRESULT = 0xC004C051u.toInt()

public val SL_E_CHPA_DMAK_EXTENSION_LIMIT_EXCEEDED: HRESULT = 0xC004C021u.toInt()

public val SL_E_CHPA_DMAK_LIMIT_EXCEEDED: HRESULT = 0xC004C020u.toInt()

public val SL_E_CHPA_DYNAMICALLY_BLOCKED_PRODUCT_KEY: HRESULT = 0xC004C060u.toInt()

public val SL_E_CHPA_FAILED_TO_DELETE_PRODUCTKEY_BINDING: HRESULT = 0xC004C757u.toInt()

public val SL_E_CHPA_FAILED_TO_DELETE_PRODUCT_KEY_PROPERTY: HRESULT = 0xC004C75Cu.toInt()

public val SL_E_CHPA_FAILED_TO_INSERT_PRODUCTKEY_BINDING: HRESULT = 0xC004C756u.toInt()

public val SL_E_CHPA_FAILED_TO_INSERT_PRODUCT_KEY_PROPERTY: HRESULT = 0xC004C75Au.toInt()

public val SL_E_CHPA_FAILED_TO_INSERT_PRODUCT_KEY_RECORD: HRESULT = 0xC004C780u.toInt()

public val SL_E_CHPA_FAILED_TO_PROCESS_PRODUCT_KEY_BINDINGS_XML: HRESULT = 0xC004C758u.toInt()

public val SL_E_CHPA_FAILED_TO_UPDATE_PRODUCTKEY_BINDING: HRESULT = 0xC004C755u.toInt()

public val SL_E_CHPA_FAILED_TO_UPDATE_PRODUCT_KEY_PROPERTY: HRESULT = 0xC004C75Bu.toInt()

public val SL_E_CHPA_FAILED_TO_UPDATE_PRODUCT_KEY_RECORD: HRESULT = 0xC004C781u.toInt()

public val SL_E_CHPA_GENERAL_ERROR: HRESULT = 0xC004C050u.toInt()

public val SL_E_CHPA_INVALID_ACTCONFIG_ID: HRESULT = 0xC004C00Du.toInt()

public val SL_E_CHPA_INVALID_ARGUMENT: HRESULT = 0xC004C014u.toInt()

public val SL_E_CHPA_INVALID_BINDING: HRESULT = 0xC004C002u.toInt()

public val SL_E_CHPA_INVALID_BINDING_URI: HRESULT = 0xC004C011u.toInt()

public val SL_E_CHPA_INVALID_PRODUCT_DATA: HRESULT = 0xC004C00Bu.toInt()

public val SL_E_CHPA_INVALID_PRODUCT_DATA_ID: HRESULT = 0xC004C00Au.toInt()

public val SL_E_CHPA_INVALID_PRODUCT_KEY: HRESULT = 0xC004C004u.toInt()

public val SL_E_CHPA_INVALID_PRODUCT_KEY_CHAR: HRESULT = 0xC004C010u.toInt()

public val SL_E_CHPA_INVALID_PRODUCT_KEY_FORMAT: HRESULT = 0xC004C00Fu.toInt()

public val SL_E_CHPA_INVALID_PRODUCT_KEY_LENGTH: HRESULT = 0xC004C00Eu.toInt()

public val SL_E_CHPA_MAXIMUM_UNLOCK_EXCEEDED: HRESULT = 0xC004C008u.toInt()

public val SL_E_CHPA_MSCH_RESPONSE_NOT_AVAILABLE_VGA: HRESULT = 0xC004C3FFu.toInt()

public val SL_E_CHPA_NETWORK_ERROR: HRESULT = 0xC004C012u.toInt()

public val SL_E_CHPA_NO_RULES_TO_ACTIVATE: HRESULT = 0xC004C04Fu.toInt()

public val SL_E_CHPA_NULL_VALUE_FOR_PROPERTY_NAME_OR_ID: HRESULT = 0xC004C750u.toInt()

public val SL_E_CHPA_OEM_SLP_COA0: HRESULT = 0xC004C016u.toInt()

public val SL_E_CHPA_OVERRIDE_REQUEST_NOT_FOUND: HRESULT = 0xC004C023u.toInt()

public val SL_E_CHPA_PRODUCT_KEY_BEING_USED: HRESULT = 0xC004C770u.toInt()

public val SL_E_CHPA_PRODUCT_KEY_BLOCKED: HRESULT = 0xC004C003u.toInt()

public val SL_E_CHPA_PRODUCT_KEY_BLOCKED_IPLOCATION: HRESULT = 0xC004C017u.toInt()

public val SL_E_CHPA_PRODUCT_KEY_OUT_OF_RANGE: HRESULT = 0xC004C001u.toInt()

public val SL_E_CHPA_REISSUANCE_LIMIT_NOT_FOUND: HRESULT = 0xC004C022u.toInt()

public val SL_E_CHPA_RESPONSE_NOT_AVAILABLE: HRESULT = 0xC004C015u.toInt()

public val SL_E_CHPA_SYSTEM_ERROR: HRESULT = 0xC004C00Cu.toInt()

public val SL_E_CHPA_TIMEBASED_ACTIVATION_AFTER_END_DATE: HRESULT = 0xC004C031u.toInt()

public val SL_E_CHPA_TIMEBASED_ACTIVATION_BEFORE_START_DATE: HRESULT = 0xC004C030u.toInt()

public val SL_E_CHPA_TIMEBASED_ACTIVATION_NOT_AVAILABLE: HRESULT = 0xC004C032u.toInt()

public val SL_E_CHPA_TIMEBASED_PRODUCT_KEY_NOT_CONFIGURED: HRESULT = 0xC004C033u.toInt()

public val SL_E_CHPA_UNKNOWN_PRODUCT_KEY_TYPE: HRESULT = 0xC004C764u.toInt()

public val SL_E_CHPA_UNKNOWN_PROPERTY_ID: HRESULT = 0xC004C752u.toInt()

public val SL_E_CHPA_UNKNOWN_PROPERTY_NAME: HRESULT = 0xC004C751u.toInt()

public val SL_E_CHPA_UNSUPPORTED_PRODUCT_KEY: HRESULT = 0xC004C007u.toInt()

public val SL_E_CIDIID_INVALID_CHECK_DIGITS: HRESULT = 0xC004F04Du.toInt()

public val SL_E_CIDIID_INVALID_DATA: HRESULT = 0xC004F02Cu.toInt()

public val SL_E_CIDIID_INVALID_DATA_LENGTH: HRESULT = 0xC004F02Fu.toInt()

public val SL_E_CIDIID_INVALID_VERSION: HRESULT = 0xC004F02Du.toInt()

public val SL_E_CIDIID_MISMATCHED: HRESULT = 0xC004F031u.toInt()

public val SL_E_CIDIID_MISMATCHED_PKEY: HRESULT = 0xC004F07Eu.toInt()

public val SL_E_CIDIID_NOT_BOUND: HRESULT = 0xC004F07Fu.toInt()

public val SL_E_CIDIID_NOT_DEPOSITED: HRESULT = 0xC004F030u.toInt()

public val SL_E_CIDIID_VERSION_NOT_SUPPORTED: HRESULT = 0xC004F02Eu.toInt()

public val SL_E_DATATYPE_MISMATCHED: HRESULT = 0xC004F01Eu.toInt()

public val SL_E_DECRYPTION_LICENSES_NOT_AVAILABLE: HRESULT = 0xC004F01Cu.toInt()

public val SL_E_DEPENDENT_PROPERTY_NOT_SET: HRESULT = 0xC004F066u.toInt()

public val SL_E_DOWNLEVEL_SETUP_KEY: HRESULT = 0xC004F214u.toInt()

public val SL_E_DUPLICATE_POLICY: HRESULT = 0xC004F052u.toInt()

public val SL_E_EDITION_MISMATCHED: HRESULT = 0xC004F210u.toInt()

public val SL_E_ENGINE_DETECTED_EXPLOIT: HRESULT = 0xC004C4B1u.toInt()

public val SL_E_EUL_CONSUMPTION_FAILED: HRESULT = 0xC004E015u.toInt()

public val SL_E_EUL_NOT_AVAILABLE: HRESULT = 0xC004F034u.toInt()

public val SL_E_EVALUATION_FAILED: HRESULT = 0xC004E003u.toInt()

public val SL_E_EVENT_ALREADY_REGISTERED: HRESULT = 0xC004F01Bu.toInt()

public val SL_E_EVENT_NOT_REGISTERED: HRESULT = 0xC004F01Au.toInt()

public val SL_E_EXTERNAL_SIGNATURE_NOT_FOUND: HRESULT = 0xC004F006u.toInt()

public val SL_E_GRACE_TIME_EXPIRED: HRESULT = 0xC004F009u.toInt()

public val SL_E_HEALTH_CHECK_FAILED_MUI_FILES: HRESULT = 0xC004C4AEu.toInt()

public val SL_E_HEALTH_CHECK_FAILED_NEUTRAL_FILES: HRESULT = 0xC004C4ADu.toInt()

public val SL_E_HWID_CHANGED: HRESULT = 0xC004F211u.toInt()

public val SL_E_HWID_ERROR: HRESULT = 0xC004E01Bu.toInt()

public val SL_E_IA_ID_MISMATCH: HRESULT = 0xC004FD03u.toInt()

public val SL_E_IA_INVALID_VIRTUALIZATION_PLATFORM: HRESULT = 0xC004FD01u.toInt()

public val SL_E_IA_MACHINE_NOT_BOUND: HRESULT = 0xC004FD04u.toInt()

public val SL_E_IA_PARENT_PARTITION_NOT_ACTIVATED: HRESULT = 0xC004FD02u.toInt()

public val SL_E_IA_THROTTLE_LIMIT_EXCEEDED: HRESULT = 0xC004FD00u.toInt()

public val SL_E_INTERNAL_ERROR: HRESULT = 0xC004F001u.toInt()

public val SL_E_INVALID_AD_DATA: HRESULT = 0xC004C4AFu.toInt()

public val SL_E_INVALID_BINDING_BLOB: HRESULT = 0xC004F032u.toInt()

public val SL_E_INVALID_CLIENT_TOKEN: HRESULT = 0xC004C328u.toInt()

public val SL_E_INVALID_CONTEXT: HRESULT = 0xC004E001u.toInt()

public val SL_E_INVALID_CONTEXT_DATA: HRESULT = 0xC004E024u.toInt()

public val SL_E_INVALID_EVENT_ID: HRESULT = 0xC004F019u.toInt()

public val SL_E_INVALID_FILE_HASH: HRESULT = 0xC004C4A1u.toInt()

public val SL_E_INVALID_GUID: HRESULT = 0xC004E006u.toInt()

public val SL_E_INVALID_HASH: HRESULT = 0xC004E025u.toInt()

public val SL_E_INVALID_LICENSE: HRESULT = 0xC004F01Fu.toInt()

public val SL_E_INVALID_LICENSE_STATE: HRESULT = 0xC004C4A8u.toInt()

public val SL_E_INVALID_LICENSE_STATE_BREACH_GRACE: HRESULT = 0xC004C291u.toInt()

public val SL_E_INVALID_LICENSE_STATE_BREACH_GRACE_EXPIRED: HRESULT = 0xC004C292u.toInt()

public val SL_E_INVALID_OEM_OR_VOLUME_BINDING_DATA: HRESULT = 0xC004C4A7u.toInt()

public val SL_E_INVALID_OFFLINE_BLOB: HRESULT = 0xC004C329u.toInt()

public val SL_E_INVALID_OSVERSION_TEMPLATEID: HRESULT = 0xC004C32Bu.toInt()

public val SL_E_INVALID_OS_FOR_PRODUCT_KEY: HRESULT = 0xC004C401u.toInt()

public val SL_E_INVALID_PACKAGE: HRESULT = 0xC004F020u.toInt()

public val SL_E_INVALID_PACKAGE_VERSION: HRESULT = 0xC004F060u.toInt()

public val SL_E_INVALID_PKEY: HRESULT = 0xC004F010u.toInt()

public val SL_E_INVALID_PRODUCT_KEY: HRESULT = 0xC004F050u.toInt()

public val SL_E_INVALID_PRODUCT_KEY_TYPE: HRESULT = 0xC004F07Du.toInt()

public val SL_E_INVALID_RSDP_COUNT: HRESULT = 0xC004C4B0u.toInt()

public val SL_E_INVALID_RULESET_RULE: HRESULT = 0xC004E023u.toInt()

public val SL_E_INVALID_RUNNING_MODE: HRESULT = 0xC004F029u.toInt()

public val SL_E_INVALID_TEMPLATE_ID: HRESULT = 0xC004C2F6u.toInt()

public val SL_E_INVALID_TOKEN_DATA: HRESULT = 0xC004C4ACu.toInt()

public val SL_E_INVALID_USE_OF_ADD_ON_PKEY: HRESULT = 0x8004E026u.toInt()

public val SL_E_INVALID_XML_BLOB: HRESULT = 0xC004C2FAu.toInt()

public val SL_E_IP_LOCATION_FALIED: HRESULT = 0xC004C4A9u.toInt()

public val SL_E_ISSUANCE_LICENSE_NOT_INSTALLED: HRESULT = 0xC004F062u.toInt()

public val SL_E_LICENSE_AUTHORIZATION_FAILED: HRESULT = 0xC004F022u.toInt()

public val SL_E_LICENSE_DECRYPTION_FAILED: HRESULT = 0xC004F023u.toInt()

public val SL_E_LICENSE_FILE_NOT_INSTALLED: HRESULT = 0xC004F011u.toInt()

public val SL_E_LICENSE_INVALID_ADDON_INFO: HRESULT = 0xC004E01Au.toInt()

public val SL_E_LICENSE_MANAGEMENT_DATA_DUPLICATED: HRESULT = 0xC004F054u.toInt()

public val SL_E_LICENSE_MANAGEMENT_DATA_NOT_FOUND: HRESULT = 0xC004F04Fu.toInt()

public val SL_E_LICENSE_NOT_BOUND: HRESULT = 0xC004F080u.toInt()

public val SL_E_LICENSE_SERVER_URL_NOT_FOUND: HRESULT = 0xC004F018u.toInt()

public val SL_E_LICENSE_SIGNATURE_VERIFICATION_FAILED: HRESULT = 0xC004F01Du.toInt()

public val SL_E_LUA_ACCESSDENIED: HRESULT = 0xC004F025u.toInt()

public val SL_E_MISMATCHED_APPID: HRESULT = 0xC004F00Au.toInt()

public val SL_E_MISMATCHED_KEY_TYPES: HRESULT = 0xC004C4A4u.toInt()

public val SL_E_MISMATCHED_PID: HRESULT = 0xC004F005u.toInt()

public val SL_E_MISMATCHED_PKEY_RANGE: HRESULT = 0xC004F004u.toInt()

public val SL_E_MISMATCHED_PRODUCT_SKU: HRESULT = 0xC004F069u.toInt()

public val SL_E_MISMATCHED_SECURITY_PROCESSOR: HRESULT = 0xC004F00Eu.toInt()

public val SL_E_MISSING_OVERRIDE_ONLY_ATTRIBUTE: HRESULT = 0xC004F053u.toInt()

public val SL_E_NONGENUINE_GRACE_TIME_EXPIRED: HRESULT = 0xC004F064u.toInt()

public val SL_E_NONGENUINE_GRACE_TIME_EXPIRED_2: HRESULT = 0xC004F067u.toInt()

public val SL_E_NON_GENUINE_STATUS_LAST: HRESULT = 0xC004C600u.toInt()

public val SL_E_NOTIFICATION_BREACH_DETECTED: HRESULT = 0xC004C531u.toInt()

public val SL_E_NOTIFICATION_GRACE_EXPIRED: HRESULT = 0xC004C532u.toInt()

public val SL_E_NOTIFICATION_OTHER_REASONS: HRESULT = 0xC004C533u.toInt()

public val SL_E_NOT_ACTIVATED: HRESULT = 0xC004E005u.toInt()

public val SL_E_NOT_EVALUATED: HRESULT = 0xC004E004u.toInt()

public val SL_E_NOT_GENUINE: HRESULT = 0xC004F200u.toInt()

public val SL_E_NOT_SUPPORTED: HRESULT = 0xC004F016u.toInt()

public val SL_E_NO_PID_CONFIG_DATA: HRESULT = 0xC004F00Bu.toInt()

public val SL_E_NO_PRODUCT_KEY_FOUND: HRESULT = 0xC004F213u.toInt()

public val SL_E_OEM_KEY_EDITION_MISMATCH: HRESULT = 0xC004F212u.toInt()

public val SL_E_OFFLINE_GENUINE_BLOB_NOT_FOUND: HRESULT = 0xC004C32Du.toInt()

public val SL_E_OFFLINE_GENUINE_BLOB_REVOKED: HRESULT = 0xC004C32Cu.toInt()

public val SL_E_OFFLINE_VALIDATION_BLOB_PARAM_NOT_FOUND: HRESULT = 0xC004C32Au.toInt()

public val SL_E_OPERATION_NOT_ALLOWED: HRESULT = 0xC004F06Au.toInt()

public val SL_E_OUT_OF_TOLERANCE: HRESULT = 0xC004F00Fu.toInt()

public val SL_E_PKEY_INTERNAL_ERROR: HRESULT = 0xC004E019u.toInt()

public val SL_E_PKEY_INVALID_ALGORITHM: HRESULT = 0xC004E018u.toInt()

public val SL_E_PKEY_INVALID_CONFIG: HRESULT = 0xC004E016u.toInt()

public val SL_E_PKEY_INVALID_KEYCHANGE1: HRESULT = 0xC004E01Cu.toInt()

public val SL_E_PKEY_INVALID_KEYCHANGE2: HRESULT = 0xC004E01Du.toInt()

public val SL_E_PKEY_INVALID_KEYCHANGE3: HRESULT = 0xC004E01Eu.toInt()

public val SL_E_PKEY_INVALID_UNIQUEID: HRESULT = 0xC004E017u.toInt()

public val SL_E_PKEY_INVALID_UPGRADE: HRESULT = 0xC004F061u.toInt()

public val SL_E_PKEY_NOT_INSTALLED: HRESULT = 0xC004F014u.toInt()

public val SL_E_PLUGIN_INVALID_MANIFEST: HRESULT = 0xC004F071u.toInt()

public val SL_E_PLUGIN_NOT_REGISTERED: HRESULT = 0xC004F076u.toInt()

public val SL_E_POLICY_CACHE_INVALID: HRESULT = 0xC004F028u.toInt()

public val SL_E_POLICY_OTHERINFO_MISMATCH: HRESULT = 0xC004E020u.toInt()

public val SL_E_PRODUCT_KEY_INSTALLATION_NOT_ALLOWED: HRESULT = 0xC004F033u.toInt()

public val SL_E_PRODUCT_SKU_NOT_INSTALLED: HRESULT = 0xC004F015u.toInt()

public val SL_E_PRODUCT_UNIQUENESS_GROUP_ID_INVALID: HRESULT = 0xC004E021u.toInt()

public val SL_E_PROXY_KEY_NOT_FOUND: HRESULT = 0xC004F026u.toInt()

public val SL_E_PROXY_POLICY_NOT_UPDATED: HRESULT = 0xC004F047u.toInt()

public val SL_E_PUBLISHING_LICENSE_NOT_INSTALLED: HRESULT = 0xC004F017u.toInt()

public val SL_E_RAC_NOT_AVAILABLE: HRESULT = 0xC004F007u.toInt()

public val SL_E_RIGHT_NOT_CONSUMED: HRESULT = 0xC004F002u.toInt()

public val SL_E_RIGHT_NOT_GRANTED: HRESULT = 0xC004F013u.toInt()

public val SL_E_SECURE_STORE_ID_MISMATCH: HRESULT = 0xC004E022u.toInt()

public val SL_E_SERVICE_RUNNING: HRESULT = 0xC004F07Bu.toInt()

public val SL_E_SERVICE_STOPPING: HRESULT = 0xC004F075u.toInt()

public val SL_E_SFS_BAD_TOKEN_EXT: HRESULT = 0x8004E105u.toInt()

public val SL_E_SFS_BAD_TOKEN_NAME: HRESULT = 0x8004E104u.toInt()

public val SL_E_SFS_DUPLICATE_TOKEN_NAME: HRESULT = 0x8004E106u.toInt()

public val SL_E_SFS_FILE_READ_ERROR: HRESULT = 0x8004E109u.toInt()

public val SL_E_SFS_FILE_WRITE_ERROR: HRESULT = 0x8004E10Au.toInt()

public val SL_E_SFS_INVALID_FD_TABLE: HRESULT = 0x8004E102u.toInt()

public val SL_E_SFS_INVALID_FILE_POSITION: HRESULT = 0x8004E10Bu.toInt()

public val SL_E_SFS_INVALID_FS_HEADER: HRESULT = 0x8004E10Du.toInt()

public val SL_E_SFS_INVALID_FS_VERSION: HRESULT = 0x8004E101u.toInt()

public val SL_E_SFS_INVALID_SYNC: HRESULT = 0x8004E103u.toInt()

public val SL_E_SFS_INVALID_TOKEN_DATA_HASH: HRESULT = 0x8004E108u.toInt()

public val SL_E_SFS_INVALID_TOKEN_DESCRIPTOR: HRESULT = 0x8004E10Eu.toInt()

public val SL_E_SFS_NO_ACTIVE_TRANSACTION: HRESULT = 0x8004E10Cu.toInt()

public val SL_E_SFS_TOKEN_SIZE_MISMATCH: HRESULT = 0x8004E107u.toInt()

public val SL_E_SLP_BAD_FORMAT: HRESULT = 0xC004F059u.toInt()

public val SL_E_SLP_INVALID_MARKER_VERSION: HRESULT = 0xC004F07Cu.toInt()

public val SL_E_SLP_MISSING_ACPI_SLIC: HRESULT = 0xC004F057u.toInt()

public val SL_E_SLP_MISSING_SLP_MARKER: HRESULT = 0xC004F058u.toInt()

public val SL_E_SLP_NOT_SIGNED: HRESULT = 0xC004F02Au.toInt()

public val SL_E_SLP_OEM_CERT_MISSING: HRESULT = 0xC004F063u.toInt()

public val SL_E_SOFTMOD_EXPLOIT_DETECTED: HRESULT = 0xC004C4ABu.toInt()

public val SL_E_SPC_NOT_AVAILABLE: HRESULT = 0xC004F008u.toInt()

public val SL_E_SRV_AUTHORIZATION_FAILED: HRESULT = 0xC004B005u.toInt()

public val SL_E_SRV_BUSINESS_TOKEN_ENTRY_NOT_FOUND: HRESULT = 0xC004B010u.toInt()

public val SL_E_SRV_CLIENT_CLOCK_OUT_OF_SYNC: HRESULT = 0xC004B011u.toInt()

public val SL_E_SRV_GENERAL_ERROR: HRESULT = 0xC004B100u.toInt()

public val SL_E_SRV_INVALID_BINDING: HRESULT = 0xC004B006u.toInt()

public val SL_E_SRV_INVALID_LICENSE_STRUCTURE: HRESULT = 0xC004B004u.toInt()

public val SL_E_SRV_INVALID_PAYLOAD: HRESULT = 0xC004B008u.toInt()

public val SL_E_SRV_INVALID_PRODUCT_KEY_LICENSE: HRESULT = 0xC004B002u.toInt()

public val SL_E_SRV_INVALID_PUBLISH_LICENSE: HRESULT = 0xC004B001u.toInt()

public val SL_E_SRV_INVALID_RIGHTS_ACCOUNT_LICENSE: HRESULT = 0xC004B003u.toInt()

public val SL_E_SRV_INVALID_SECURITY_PROCESSOR_LICENSE: HRESULT = 0xC004B009u.toInt()

public val SL_E_SRV_SERVER_PONG: HRESULT = 0xC004B007u.toInt()

public val SL_E_STORE_UPGRADE_TOKEN_NOT_AUTHORIZED: HRESULT = 0xC004E02Eu.toInt()

public val SL_E_STORE_UPGRADE_TOKEN_NOT_PRS_SIGNED: HRESULT = 0xC004E02Cu.toInt()

public val SL_E_STORE_UPGRADE_TOKEN_REQUIRED: HRESULT = 0xC004E029u.toInt()

public val SL_E_STORE_UPGRADE_TOKEN_WRONG_EDITION: HRESULT = 0xC004E02Au.toInt()

public val SL_E_STORE_UPGRADE_TOKEN_WRONG_PID: HRESULT = 0xC004E02Bu.toInt()

public val SL_E_STORE_UPGRADE_TOKEN_WRONG_VERSION: HRESULT = 0xC004E02Du.toInt()

public val SL_E_TAMPER_DETECTED: HRESULT = 0xC004F027u.toInt()

public val SL_E_TAMPER_RECOVERY_REQUIRES_ACTIVATION: HRESULT = 0xC004FE00u.toInt()

public val SL_E_TKA_CERT_CNG_NOT_AVAILABLE: HRESULT = 0xC004F313u.toInt()

public val SL_E_TKA_CERT_NOT_FOUND: HRESULT = 0xC004F305u.toInt()

public val SL_E_TKA_CHALLENGE_EXPIRED: HRESULT = 0xC004F301u.toInt()

public val SL_E_TKA_CHALLENGE_MISMATCH: HRESULT = 0xC004F309u.toInt()

public val SL_E_TKA_CRITERIA_MISMATCH: HRESULT = 0xC004F30Fu.toInt()

public val SL_E_TKA_FAILED_GRANT_PARSING: HRESULT = 0xC004F30Cu.toInt()

public val SL_E_TKA_GRANT_NOT_FOUND: HRESULT = 0xC004F304u.toInt()

public val SL_E_TKA_INVALID_BLOB: HRESULT = 0xC004F307u.toInt()

public val SL_E_TKA_INVALID_CERTIFICATE: HRESULT = 0xC004F30Au.toInt()

public val SL_E_TKA_INVALID_CERT_CHAIN: HRESULT = 0xC004F303u.toInt()

public val SL_E_TKA_INVALID_SKU_ID: HRESULT = 0xC004F306u.toInt()

public val SL_E_TKA_INVALID_SMARTCARD: HRESULT = 0xC004F30Bu.toInt()

public val SL_E_TKA_INVALID_THUMBPRINT: HRESULT = 0xC004F30Du.toInt()

public val SL_E_TKA_SILENT_ACTIVATION_FAILURE: HRESULT = 0xC004F302u.toInt()

public val SL_E_TKA_SOFT_CERT_DISALLOWED: HRESULT = 0xC004F311u.toInt()

public val SL_E_TKA_SOFT_CERT_INVALID: HRESULT = 0xC004F312u.toInt()

public val SL_E_TKA_TAMPERED_CERT_CHAIN: HRESULT = 0xC004F308u.toInt()

public val SL_E_TKA_THUMBPRINT_CERT_NOT_FOUND: HRESULT = 0xC004F30Eu.toInt()

public val SL_E_TKA_TPID_MISMATCH: HRESULT = 0xC004F310u.toInt()

public val SL_E_TOKEN_STORE_INVALID_STATE: HRESULT = 0xC004E002u.toInt()

public val SL_E_TOKSTO_ALREADY_INITIALIZED: HRESULT = 0xC004E00Au.toInt()

public val SL_E_TOKSTO_CANT_ACQUIRE_MUTEX: HRESULT = 0xC004E013u.toInt()

public val SL_E_TOKSTO_CANT_CREATE_FILE: HRESULT = 0xC004E00Cu.toInt()

public val SL_E_TOKSTO_CANT_CREATE_MUTEX: HRESULT = 0xC004E012u.toInt()

public val SL_E_TOKSTO_CANT_PARSE_PROPERTIES: HRESULT = 0xC004E00Fu.toInt()

public val SL_E_TOKSTO_CANT_READ_FILE: HRESULT = 0xC004E00Eu.toInt()

public val SL_E_TOKSTO_CANT_WRITE_TO_FILE: HRESULT = 0xC004E00Du.toInt()

public val SL_E_TOKSTO_INVALID_FILE: HRESULT = 0xC004E011u.toInt()

public val SL_E_TOKSTO_NOT_INITIALIZED: HRESULT = 0xC004E009u.toInt()

public val SL_E_TOKSTO_NO_ID_SET: HRESULT = 0xC004E00Bu.toInt()

public val SL_E_TOKSTO_NO_PROPERTIES: HRESULT = 0xC004E008u.toInt()

public val SL_E_TOKSTO_NO_TOKEN_DATA: HRESULT = 0xC004E014u.toInt()

public val SL_E_TOKSTO_PROPERTY_NOT_FOUND: HRESULT = 0xC004E010u.toInt()

public val SL_E_TOKSTO_TOKEN_NOT_FOUND: HRESULT = 0xC004E007u.toInt()

public val SL_E_USE_LICENSE_NOT_INSTALLED: HRESULT = 0xC004F003u.toInt()

public val SL_E_VALIDATION_BLOB_PARAM_NOT_FOUND: HRESULT = 0xC004C327u.toInt()

public val SL_E_VALIDATION_BLOCKED_PRODUCT_KEY: HRESULT = 0xC004C4A2u.toInt()

public val SL_E_VALIDATION_INVALID_PRODUCT_KEY: HRESULT = 0xC004C4A5u.toInt()

public val SL_E_VALIDITY_PERIOD_EXPIRED: HRESULT = 0xC004FC07u.toInt()

public val SL_E_VALIDITY_TIME_EXPIRED: HRESULT = 0xC004F021u.toInt()

public val SL_E_VALUE_NOT_FOUND: HRESULT = 0xC004F012u.toInt()

public val SL_E_VL_AD_AO_NAME_TOO_LONG: HRESULT = 0xC004F082u.toInt()

public val SL_E_VL_AD_AO_NOT_FOUND: HRESULT = 0xC004F081u.toInt()

public val SL_E_VL_AD_SCHEMA_VERSION_NOT_SUPPORTED: HRESULT = 0xC004F083u.toInt()

public val SL_E_VL_BINDING_SERVICE_NOT_ENABLED: HRESULT = 0xC004F039u.toInt()

public val SL_E_VL_BINDING_SERVICE_UNAVAILABLE: HRESULT = 0xC004F074u.toInt()

public val SL_E_VL_INFO_PRODUCT_USER_RIGHT: HRESULT = 0x4004F040u.toInt()

public val SL_E_VL_INVALID_TIMESTAMP: HRESULT = 0xC004F06Cu.toInt()

public val SL_E_VL_KEY_MANAGEMENT_SERVICE_ID_MISMATCH: HRESULT = 0xC004F042u.toInt()

public val SL_E_VL_KEY_MANAGEMENT_SERVICE_NOT_ACTIVATED: HRESULT = 0xC004F041u.toInt()

public val SL_E_VL_KEY_MANAGEMENT_SERVICE_VM_NOT_SUPPORTED: HRESULT = 0xC004F06Bu.toInt()

public val SL_E_VL_MACHINE_NOT_BOUND: HRESULT = 0xC004F056u.toInt()

public val SL_E_VL_NOT_ENOUGH_COUNT: HRESULT = 0xC004F038u.toInt()

public val SL_E_VL_NOT_WINDOWS_SLP: HRESULT = 0xC004F035u.toInt()

public val SL_E_WINDOWS_INVALID_LICENSE_STATE: HRESULT = 0xC004F024u.toInt()

public val SL_E_WINDOWS_VERSION_MISMATCH: HRESULT = 0xC004E027u.toInt()

public val SL_GEN_STATE_INVALID_LICENSE: SL_GENUINE_STATE = 1

public val SL_GEN_STATE_IS_GENUINE: SL_GENUINE_STATE = 0

public val SL_GEN_STATE_LAST: SL_GENUINE_STATE = 4

public val SL_GEN_STATE_OFFLINE: SL_GENUINE_STATE = 3

public val SL_GEN_STATE_TAMPERED: SL_GENUINE_STATE = 2

public val SL_ID_ALL_LICENSES: SLIDTYPE = 5

public val SL_ID_ALL_LICENSE_FILES: SLIDTYPE = 6

public val SL_ID_APPLICATION: SLIDTYPE = 0

public val SL_ID_LAST: SLIDTYPE = 8
