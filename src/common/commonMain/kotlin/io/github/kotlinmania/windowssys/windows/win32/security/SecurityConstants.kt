@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACE_INHERITED_OBJECT_TYPE_PRESENT: SystemAuditObjectAceFlags = 2u

public val ACE_OBJECT_TYPE_PRESENT: SystemAuditObjectAceFlags = 1u

public val ACL_REVISION: AceRevision = 2u

public val ACL_REVISION_DS: AceRevision = 4u

public val ATTRIBUTE_SECURITY_INFORMATION: ObjectSecurityInformation = 32u

public val ACL_REVISION_INFORMATION: AclInformationClass = 1

public val ACL_SIZE_INFORMATION: AclInformationClass = 2

public val AUDIT_EVENT_DIRECTORY_SERVICE_ACCESS: AuditEventType = 1

public val AUDIT_EVENT_OBJECT_ACCESS: AuditEventType = 0

public val BACKUP_SECURITY_INFORMATION: ObjectSecurityInformation = 65536u

public val CLAIM_SECURITY_ATTRIBUTE_DISABLED: ClaimSecurityAttributeFlags = 16u

public val CLAIM_SECURITY_ATTRIBUTE_DISABLED_BY_DEFAULT: ClaimSecurityAttributeFlags = 8u

public val CLAIM_SECURITY_ATTRIBUTE_MANDATORY: ClaimSecurityAttributeFlags = 32u

public val CLAIM_SECURITY_ATTRIBUTE_NON_INHERITABLE: ClaimSecurityAttributeFlags = 1u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_BOOLEAN: ClaimSecurityAttributeValueType = 6u.toUShort()

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_FQBN: ClaimSecurityAttributeValueType = 4u.toUShort()

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_INT64: ClaimSecurityAttributeValueType = 1u.toUShort()

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_OCTET_STRING: ClaimSecurityAttributeValueType = 16u.toUShort()

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_SID: ClaimSecurityAttributeValueType = 5u.toUShort()

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_STRING: ClaimSecurityAttributeValueType = 3u.toUShort()

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_UINT64: ClaimSecurityAttributeValueType = 2u.toUShort()

public val CLAIM_SECURITY_ATTRIBUTE_USE_FOR_DENY_ONLY: ClaimSecurityAttributeFlags = 4u

public val CLAIM_SECURITY_ATTRIBUTE_VALUE_CASE_SENSITIVE: ClaimSecurityAttributeFlags = 2u

public val CONTAINER_INHERIT_ACE: AceFlags = 2u

public val CVT_SECONDS: UInt = 1u

public val DACL_SECURITY_INFORMATION: ObjectSecurityInformation = 4u

public val DISABLE_MAX_PRIVILEGE: CreateRestrictedTokenFlags = 1u

public val ENUM_PERIOD_DAYS: EnumPeriod = 3

public val ENUM_PERIOD_HOURS: EnumPeriod = 2

public val ENUM_PERIOD_INVALID: EnumPeriod = -1

public val ENUM_PERIOD_MINUTES: EnumPeriod = 1

public val ENUM_PERIOD_MONTHS: EnumPeriod = 5

public val ENUM_PERIOD_SECONDS: EnumPeriod = 0

public val ENUM_PERIOD_WEEKS: EnumPeriod = 4

public val ENUM_PERIOD_YEARS: EnumPeriod = 6

public val FAILED_ACCESS_ACE_FLAG: AceFlags = 128u

public val GROUP_SECURITY_INFORMATION: ObjectSecurityInformation = 2u

public val INHERITED_ACE: AceFlags = 16u

public val INHERIT_NO_PROPAGATE: AceFlags = 4u

public val INHERIT_ONLY: AceFlags = 8u

public val INHERIT_ONLY_ACE: AceFlags = 8u

public val LABEL_SECURITY_INFORMATION: ObjectSecurityInformation = 16u

public val LOGON32_LOGON_BATCH: Logon32Logon = 4u

public val LOGON32_LOGON_INTERACTIVE: Logon32Logon = 2u

public val LOGON32_LOGON_NETWORK: Logon32Logon = 3u

public val LOGON32_LOGON_NETWORK_CLEARTEXT: Logon32Logon = 8u

public val LOGON32_LOGON_NEW_CREDENTIALS: Logon32Logon = 9u

public val LOGON32_LOGON_SERVICE: Logon32Logon = 5u

public val LOGON32_LOGON_UNLOCK: Logon32Logon = 7u

public val LOGON32_PROVIDER_DEFAULT: Logon32Provider = 0u

public val LOGON32_PROVIDER_WINNT40: Logon32Provider = 2u

public val LOGON32_PROVIDER_WINNT50: Logon32Provider = 3u

public val LUA_TOKEN: CreateRestrictedTokenFlags = 4u

public val MANDATORY_LEVEL_COUNT: MandatoryLevel = 6

public val MANDATORY_LEVEL_HIGH: MandatoryLevel = 3

public val MANDATORY_LEVEL_LOW: MandatoryLevel = 1

public val MANDATORY_LEVEL_MEDIUM: MandatoryLevel = 2

public val MANDATORY_LEVEL_SECURE_PROCESS: MandatoryLevel = 5

public val MANDATORY_LEVEL_SYSTEM: MandatoryLevel = 4

public val MANDATORY_LEVEL_UNTRUSTED: MandatoryLevel = 0

public val MAX_TOKEN_INFO_CLASS: TokenInformationClass = 49

public val NO_INHERITANCE: AceFlags = 0u

public val NO_PROPAGATE_INHERIT_ACE: AceFlags = 4u

public val OBJECT_INHERIT_ACE: AceFlags = 1u

public val OWNER_SECURITY_INFORMATION: ObjectSecurityInformation = 1u

public val PROTECTED_DACL_SECURITY_INFORMATION: ObjectSecurityInformation = 2147483648u

public val PROTECTED_SACL_SECURITY_INFORMATION: ObjectSecurityInformation = 1073741824u

public val SACL_SECURITY_INFORMATION: ObjectSecurityInformation = 8u

public val SANDBOX_INERT: CreateRestrictedTokenFlags = 2u

public val SCOPE_SECURITY_INFORMATION: ObjectSecurityInformation = 64u

public val SECURITY_APP_PACKAGE_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 15u))

public val SECURITY_AUTHENTICATION_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 18u))

public val SECURITY_CREATOR_SID_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 3u))

public val SECURITY_DYNAMIC_TRACKING: Boolean = true

public val SECURITY_LOCAL_SID_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 2u))

public val SECURITY_MANDATORY_LABEL_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 16u))

public val SECURITY_MAX_SID_SIZE: UInt = 68u

public val SECURITY_NON_UNIQUE_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 4u))

public val SECURITY_NT_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 5u))

public val SECURITY_NULL_SID_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u))

public val SECURITY_PROCESS_TRUST_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 19u))

public val SECURITY_RESOURCE_MANAGER_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 9u))

public val SECURITY_SCOPED_POLICY_ID_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 17u))

public val SECURITY_STATIC_TRACKING: Boolean = false

public val SECURITY_WORLD_SID_AUTHORITY: SidIdentifierAuthority = SidIdentifierAuthority(value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 1u))

public val SEF_AVOID_OWNER_CHECK: SecurityAutoInheritFlags = 16u

public val SEF_AVOID_OWNER_RESTRICTION: SecurityAutoInheritFlags = 4096u

public val SEF_AVOID_PRIVILEGE_CHECK: SecurityAutoInheritFlags = 8u

public val SEF_DACL_AUTO_INHERIT: SecurityAutoInheritFlags = 1u

public val SEF_DEFAULT_DESCRIPTOR_FOR_OBJECT: SecurityAutoInheritFlags = 4u

public val SEF_DEFAULT_GROUP_FROM_PARENT: SecurityAutoInheritFlags = 64u

public val SEF_DEFAULT_OWNER_FROM_PARENT: SecurityAutoInheritFlags = 32u

public val SEF_MACL_NO_EXECUTE_UP: SecurityAutoInheritFlags = 1024u

public val SEF_MACL_NO_READ_UP: SecurityAutoInheritFlags = 512u

public val SEF_MACL_NO_WRITE_UP: SecurityAutoInheritFlags = 256u

public val SEF_SACL_AUTO_INHERIT: SecurityAutoInheritFlags = 2u

public val SE_ASSIGNPRIMARYTOKEN_NAME: Pcwstr = w("SeAssignPrimaryTokenPrivilege")

public val SE_AUDIT_NAME: Pcwstr = w("SeAuditPrivilege")

public val SE_BACKUP_NAME: Pcwstr = w("SeBackupPrivilege")

public val SE_CHANGE_NOTIFY_NAME: Pcwstr = w("SeChangeNotifyPrivilege")

public val SE_CREATE_GLOBAL_NAME: Pcwstr = w("SeCreateGlobalPrivilege")

public val SE_CREATE_PAGEFILE_NAME: Pcwstr = w("SeCreatePagefilePrivilege")

public val SE_CREATE_PERMANENT_NAME: Pcwstr = w("SeCreatePermanentPrivilege")

public val SE_CREATE_SYMBOLIC_LINK_NAME: Pcwstr = w("SeCreateSymbolicLinkPrivilege")

public val SE_CREATE_TOKEN_NAME: Pcwstr = w("SeCreateTokenPrivilege")

public val SE_DACL_AUTO_INHERITED: SecurityDescriptorControl = 1024u.toUShort()

public val SE_DACL_AUTO_INHERIT_REQ: SecurityDescriptorControl = 256u.toUShort()

public val SE_DACL_DEFAULTED: SecurityDescriptorControl = 8u.toUShort()

public val SE_DACL_PRESENT: SecurityDescriptorControl = 4u.toUShort()

public val SE_DACL_PROTECTED: SecurityDescriptorControl = 4096u.toUShort()

public val SE_DEBUG_NAME: Pcwstr = w("SeDebugPrivilege")

public val SE_DELEGATE_SESSION_USER_IMPERSONATE_NAME: Pcwstr = w("SeDelegateSessionUserImpersonatePrivilege")

public val SE_ENABLE_DELEGATION_NAME: Pcwstr = w("SeEnableDelegationPrivilege")

public val SE_GROUP_DEFAULTED: SecurityDescriptorControl = 2u.toUShort()

public val SE_IMPERSONATE_NAME: Pcwstr = w("SeImpersonatePrivilege")

public val SE_INCREASE_QUOTA_NAME: Pcwstr = w("SeIncreaseQuotaPrivilege")

public val SE_INC_BASE_PRIORITY_NAME: Pcwstr = w("SeIncreaseBasePriorityPrivilege")

public val SE_INC_WORKING_SET_NAME: Pcwstr = w("SeIncreaseWorkingSetPrivilege")

public val SE_LOAD_DRIVER_NAME: Pcwstr = w("SeLoadDriverPrivilege")

public val SE_LOCK_MEMORY_NAME: Pcwstr = w("SeLockMemoryPrivilege")

public val SE_MACHINE_ACCOUNT_NAME: Pcwstr = w("SeMachineAccountPrivilege")

public val SE_MANAGE_VOLUME_NAME: Pcwstr = w("SeManageVolumePrivilege")

public val SE_OWNER_DEFAULTED: SecurityDescriptorControl = 1u.toUShort()

public val SE_PRIVILEGE_ENABLED: TokenPrivilegesAttributes = 2u

public val SE_PRIVILEGE_ENABLED_BY_DEFAULT: TokenPrivilegesAttributes = 1u

public val SE_PRIVILEGE_REMOVED: TokenPrivilegesAttributes = 4u

public val SE_PRIVILEGE_USED_FOR_ACCESS: TokenPrivilegesAttributes = 2147483648u

public val SE_PROF_SINGLE_PROCESS_NAME: Pcwstr = w("SeProfileSingleProcessPrivilege")

public val SE_RELABEL_NAME: Pcwstr = w("SeRelabelPrivilege")

public val SE_REMOTE_SHUTDOWN_NAME: Pcwstr = w("SeRemoteShutdownPrivilege")

public val SE_RESTORE_NAME: Pcwstr = w("SeRestorePrivilege")

public val SE_RM_CONTROL_VALID: SecurityDescriptorControl = 16384u.toUShort()

public val SE_SACL_AUTO_INHERITED: SecurityDescriptorControl = 2048u.toUShort()

public val SE_SACL_AUTO_INHERIT_REQ: SecurityDescriptorControl = 512u.toUShort()

public val SE_SACL_DEFAULTED: SecurityDescriptorControl = 32u.toUShort()

public val SE_SACL_PRESENT: SecurityDescriptorControl = 16u.toUShort()

public val SE_SACL_PROTECTED: SecurityDescriptorControl = 8192u.toUShort()

public val SE_SECURITY_NAME: Pcwstr = w("SeSecurityPrivilege")

public val SE_SELF_RELATIVE: SecurityDescriptorControl = 32768u.toUShort()

public val SE_SHUTDOWN_NAME: Pcwstr = w("SeShutdownPrivilege")

public val SE_SYNC_AGENT_NAME: Pcwstr = w("SeSyncAgentPrivilege")

public val SE_SYSTEMTIME_NAME: Pcwstr = w("SeSystemtimePrivilege")

public val SE_SYSTEM_ENVIRONMENT_NAME: Pcwstr = w("SeSystemEnvironmentPrivilege")

public val SE_SYSTEM_PROFILE_NAME: Pcwstr = w("SeSystemProfilePrivilege")

public val SE_TAKE_OWNERSHIP_NAME: Pcwstr = w("SeTakeOwnershipPrivilege")

public val SE_TCB_NAME: Pcwstr = w("SeTcbPrivilege")

public val SE_TIME_ZONE_NAME: Pcwstr = w("SeTimeZonePrivilege")

public val SE_TRUSTED_CREDMAN_ACCESS_NAME: Pcwstr = w("SeTrustedCredManAccessPrivilege")

public val SE_UNDOCK_NAME: Pcwstr = w("SeUndockPrivilege")

public val SE_UNSOLICITED_INPUT_NAME: Pcwstr = w("SeUnsolicitedInputPrivilege")

public val SIGNING_LEVEL_FILE_CACHE_FLAG_NOT_VALIDATED: UInt = 1u

public val SIGNING_LEVEL_FILE_CACHE_FLAG_VALIDATE_ONLY: UInt = 4u

public val SIGNING_LEVEL_MICROSOFT: UInt = 8u

public val SUB_CONTAINERS_AND_OBJECTS_INHERIT: AceFlags = 3u

public val SUB_CONTAINERS_ONLY_INHERIT: AceFlags = 2u

public val SUB_OBJECTS_ONLY_INHERIT: AceFlags = 1u

public val SUCCESSFUL_ACCESS_ACE_FLAG: AceFlags = 64u

public val SECURITY_ANONYMOUS: SecurityImpersonationLevel = 0

public val SECURITY_DELEGATION: SecurityImpersonationLevel = 3

public val SECURITY_IDENTIFICATION: SecurityImpersonationLevel = 1

public val SECURITY_IMPERSONATION: SecurityImpersonationLevel = 2

public val SID_TYPE_ALIAS: SidNameUse = 4

public val SID_TYPE_COMPUTER: SidNameUse = 9

public val SID_TYPE_DELETED_ACCOUNT: SidNameUse = 6

public val SID_TYPE_DOMAIN: SidNameUse = 3

public val SID_TYPE_GROUP: SidNameUse = 2

public val SID_TYPE_INVALID: SidNameUse = 7

public val SID_TYPE_LABEL: SidNameUse = 10

public val SID_TYPE_LOGON_SESSION: SidNameUse = 11

public val SID_TYPE_UNKNOWN: SidNameUse = 8

public val SID_TYPE_USER: SidNameUse = 1

public val SID_TYPE_WELL_KNOWN_GROUP: SidNameUse = 5

public val TOKEN_ACCESS_PSEUDO_HANDLE: TokenAccessMask = 24u

public val TOKEN_ACCESS_PSEUDO_HANDLE_WIN8: TokenAccessMask = 24u

public val TOKEN_ACCESS_SYSTEM_SECURITY: TokenAccessMask = 16777216u

public val TOKEN_ADJUST_DEFAULT: TokenAccessMask = 128u

public val TOKEN_ADJUST_GROUPS: TokenAccessMask = 64u

public val TOKEN_ADJUST_PRIVILEGES: TokenAccessMask = 32u

public val TOKEN_ADJUST_SESSIONID: TokenAccessMask = 256u

public val TOKEN_ALL_ACCESS: TokenAccessMask = 983551u

public val TOKEN_ASSIGN_PRIMARY: TokenAccessMask = 1u

public val TOKEN_DELETE: TokenAccessMask = 65536u

public val TOKEN_DUPLICATE: TokenAccessMask = 2u

public val TOKEN_EXECUTE: TokenAccessMask = 131072u

public val TOKEN_IMPERSONATE: TokenAccessMask = 4u

public val TOKEN_MANDATORY_POLICY_NEW_PROCESS_MIN: TokenMandatoryPolicyId = 2u

public val TOKEN_MANDATORY_POLICY_NO_WRITE_UP: TokenMandatoryPolicyId = 1u

public val TOKEN_MANDATORY_POLICY_OFF: TokenMandatoryPolicyId = 0u

public val TOKEN_MANDATORY_POLICY_VALID_MASK: TokenMandatoryPolicyId = 3u

public val TOKEN_QUERY: TokenAccessMask = 8u

public val TOKEN_QUERY_SOURCE: TokenAccessMask = 16u

public val TOKEN_READ: TokenAccessMask = 131080u

public val TOKEN_READ_CONTROL: TokenAccessMask = 131072u

public val TOKEN_TRUST_CONSTRAINT_MASK: TokenAccessMask = 131096u

public val TOKEN_WRITE: TokenAccessMask = 131296u

public val TOKEN_WRITE_DAC: TokenAccessMask = 262144u

public val TOKEN_WRITE_OWNER: TokenAccessMask = 524288u

public val TOKEN_ACCESS_INFORMATION: TokenInformationClass = 22

public val TOKEN_APP_CONTAINER_NUMBER: TokenInformationClass = 32

public val TOKEN_APP_CONTAINER_SID: TokenInformationClass = 31

public val TOKEN_AUDIT_POLICY: TokenInformationClass = 16

public val TOKEN_BNO_ISOLATION: TokenInformationClass = 44

public val TOKEN_CAPABILITIES: TokenInformationClass = 30

public val TOKEN_CHILD_PROCESS_FLAGS: TokenInformationClass = 45

public val TOKEN_DEFAULT_DACL: TokenInformationClass = 6

public val TOKEN_DEVICE_CLAIM_ATTRIBUTES: TokenInformationClass = 34

public val TOKEN_DEVICE_GROUPS: TokenInformationClass = 37

public val TOKEN_ELEVATION: TokenInformationClass = 20

public val TOKEN_ELEVATION_TYPE: TokenInformationClass = 18

public val TOKEN_ELEVATION_TYPE_DEFAULT: TokenElevationType = 1

public val TOKEN_ELEVATION_TYPE_FULL: TokenElevationType = 2

public val TOKEN_ELEVATION_TYPE_LIMITED: TokenElevationType = 3

public val TOKEN_GROUPS: TokenInformationClass = 2

public val TOKEN_GROUPS_AND_PRIVILEGES: TokenInformationClass = 13

public val TOKEN_HAS_RESTRICTIONS: TokenInformationClass = 21

public val TOKEN_IMPERSONATION: TokenType = 2

public val TOKEN_IMPERSONATION_LEVEL: TokenInformationClass = 9

public val TOKEN_INTEGRITY_LEVEL: TokenInformationClass = 25

public val TOKEN_IS_APP_CONTAINER: TokenInformationClass = 29

public val TOKEN_IS_APP_SILO: TokenInformationClass = 48

public val TOKEN_IS_LESS_PRIVILEGED_APP_CONTAINER: TokenInformationClass = 46

public val TOKEN_IS_RESTRICTED: TokenInformationClass = 40

public val TOKEN_IS_SANDBOXED: TokenInformationClass = 47

public val TOKEN_LINKED_TOKEN: TokenInformationClass = 19

public val TOKEN_LOGON_SID: TokenInformationClass = 28

public val TOKEN_MANDATORY_POLICY: TokenInformationClass = 27

public val TOKEN_ORIGIN: TokenInformationClass = 17

public val TOKEN_OWNER: TokenInformationClass = 4

public val TOKEN_PRIMARY: TokenType = 1

public val TOKEN_PRIMARY_GROUP: TokenInformationClass = 5

public val TOKEN_PRIVATE_NAME_SPACE: TokenInformationClass = 42

public val TOKEN_PRIVILEGES: TokenInformationClass = 3

public val TOKEN_PROCESS_TRUST_LEVEL: TokenInformationClass = 41

public val TOKEN_RESTRICTED_DEVICE_CLAIM_ATTRIBUTES: TokenInformationClass = 36

public val TOKEN_RESTRICTED_DEVICE_GROUPS: TokenInformationClass = 38

public val TOKEN_RESTRICTED_SIDS: TokenInformationClass = 11

public val TOKEN_RESTRICTED_USER_CLAIM_ATTRIBUTES: TokenInformationClass = 35

public val TOKEN_SAND_BOX_INERT: TokenInformationClass = 15

public val TOKEN_SECURITY_ATTRIBUTES: TokenInformationClass = 39

public val TOKEN_SESSION_ID: TokenInformationClass = 12

public val TOKEN_SESSION_REFERENCE: TokenInformationClass = 14

public val TOKEN_SINGLETON_ATTRIBUTES: TokenInformationClass = 43

public val TOKEN_SOURCE: TokenInformationClass = 7

public val TOKEN_STATISTICS: TokenInformationClass = 10

public val TOKEN_TYPE: TokenInformationClass = 8

public val TOKEN_UI_ACCESS: TokenInformationClass = 26

public val TOKEN_USER: TokenInformationClass = 1

public val TOKEN_USER_CLAIM_ATTRIBUTES: TokenInformationClass = 33

public val TOKEN_VIRTUALIZATION_ALLOWED: TokenInformationClass = 23

public val TOKEN_VIRTUALIZATION_ENABLED: TokenInformationClass = 24

public val UNPROTECTED_DACL_SECURITY_INFORMATION: ObjectSecurityInformation = 536870912u

public val UNPROTECTED_SACL_SECURITY_INFORMATION: ObjectSecurityInformation = 268435456u

public val WRITE_RESTRICTED: CreateRestrictedTokenFlags = 8u

public val WIN_ACCOUNT_ADMINISTRATOR_SID: WellKnownSidType = 38

public val WIN_ACCOUNT_CERT_ADMINS_SID: WellKnownSidType = 46

public val WIN_ACCOUNT_CLONEABLE_CONTROLLERS_SID: WellKnownSidType = 100

public val WIN_ACCOUNT_COMPUTERS_SID: WellKnownSidType = 44

public val WIN_ACCOUNT_CONTROLLERS_SID: WellKnownSidType = 45

public val WIN_ACCOUNT_DEFAULT_SYSTEM_MANAGED_SID: WellKnownSidType = 110

public val WIN_ACCOUNT_DOMAIN_ADMINS_SID: WellKnownSidType = 41

public val WIN_ACCOUNT_DOMAIN_GUESTS_SID: WellKnownSidType = 43

public val WIN_ACCOUNT_DOMAIN_USERS_SID: WellKnownSidType = 42

public val WIN_ACCOUNT_ENTERPRISE_ADMINS_SID: WellKnownSidType = 48

public val WIN_ACCOUNT_ENTERPRISE_KEY_ADMINS_SID: WellKnownSidType = 114

public val WIN_ACCOUNT_GUEST_SID: WellKnownSidType = 39

public val WIN_ACCOUNT_KEY_ADMINS_SID: WellKnownSidType = 113

public val WIN_ACCOUNT_KRBTGT_SID: WellKnownSidType = 40

public val WIN_ACCOUNT_POLICY_ADMINS_SID: WellKnownSidType = 49

public val WIN_ACCOUNT_PROTECTED_USERS_SID: WellKnownSidType = 107

public val WIN_ACCOUNT_RAS_AND_IAS_SERVERS_SID: WellKnownSidType = 50

public val WIN_ACCOUNT_READONLY_CONTROLLERS_SID: WellKnownSidType = 75

public val WIN_ACCOUNT_SCHEMA_ADMINS_SID: WellKnownSidType = 47

public val WIN_ANONYMOUS_SID: WellKnownSidType = 13

public val WIN_APPLICATION_PACKAGE_AUTHORITY_SID: WellKnownSidType = 83

public val WIN_AUTHENTICATED_USER_SID: WellKnownSidType = 17

public val WIN_AUTHENTICATION_AUTHORITY_ASSERTED_SID: WellKnownSidType = 103

public val WIN_AUTHENTICATION_FRESH_KEY_AUTH_SID: WellKnownSidType = 118

public val WIN_AUTHENTICATION_KEY_PROPERTY_ATTESTATION_SID: WellKnownSidType = 117

public val WIN_AUTHENTICATION_KEY_PROPERTY_MFA_SID: WellKnownSidType = 116

public val WIN_AUTHENTICATION_KEY_TRUST_SID: WellKnownSidType = 115

public val WIN_AUTHENTICATION_SERVICE_ASSERTED_SID: WellKnownSidType = 104

public val WIN_BATCH_SID: WellKnownSidType = 10

public val WIN_BUILTIN_ACCESS_CONTROL_ASSISTANCE_OPERATORS_SID: WellKnownSidType = 101

public val WIN_BUILTIN_ACCOUNT_OPERATORS_SID: WellKnownSidType = 30

public val WIN_BUILTIN_ADMINISTRATORS_SID: WellKnownSidType = 26

public val WIN_BUILTIN_ANY_PACKAGE_SID: WellKnownSidType = 84

public val WIN_BUILTIN_AUTHORIZATION_ACCESS_SID: WellKnownSidType = 59

public val WIN_BUILTIN_BACKUP_OPERATORS_SID: WellKnownSidType = 33

public val WIN_BUILTIN_CERT_SVC_D_COM_ACCESS_GROUP: WellKnownSidType = 78

public val WIN_BUILTIN_CRYPTO_OPERATORS_SID: WellKnownSidType = 64

public val WIN_BUILTIN_DCOM_USERS_SID: WellKnownSidType = 61

public val WIN_BUILTIN_DEFAULT_SYSTEM_MANAGED_GROUP_SID: WellKnownSidType = 111

public val WIN_BUILTIN_DEVICE_OWNERS_SID: WellKnownSidType = 119

public val WIN_BUILTIN_DOMAIN_SID: WellKnownSidType = 25

public val WIN_BUILTIN_EVENT_LOG_READERS_GROUP: WellKnownSidType = 76

public val WIN_BUILTIN_GUESTS_SID: WellKnownSidType = 28

public val WIN_BUILTIN_HYPER_V_ADMINS_SID: WellKnownSidType = 99

public val WIN_BUILTIN_I_USERS_SID: WellKnownSidType = 62

public val WIN_BUILTIN_INCOMING_FOREST_TRUST_BUILDERS_SID: WellKnownSidType = 56

public val WIN_BUILTIN_NETWORK_CONFIGURATION_OPERATORS_SID: WellKnownSidType = 37

public val WIN_BUILTIN_PERF_LOGGING_USERS_SID: WellKnownSidType = 58

public val WIN_BUILTIN_PERF_MONITORING_USERS_SID: WellKnownSidType = 57

public val WIN_BUILTIN_POWER_USERS_SID: WellKnownSidType = 29

public val WIN_BUILTIN_PRE_WINDOWS2000COMPATIBLE_ACCESS_SID: WellKnownSidType = 35

public val WIN_BUILTIN_PRINT_OPERATORS_SID: WellKnownSidType = 32

public val WIN_BUILTIN_RDS_ENDPOINT_SERVERS_SID: WellKnownSidType = 96

public val WIN_BUILTIN_RDS_MANAGEMENT_SERVERS_SID: WellKnownSidType = 97

public val WIN_BUILTIN_RDS_REMOTE_ACCESS_SERVERS_SID: WellKnownSidType = 95

public val WIN_BUILTIN_REMOTE_DESKTOP_USERS_SID: WellKnownSidType = 36

public val WIN_BUILTIN_REMOTE_MANAGEMENT_USERS_SID: WellKnownSidType = 102

public val WIN_BUILTIN_REPLICATOR_SID: WellKnownSidType = 34

public val WIN_BUILTIN_STORAGE_REPLICA_ADMINS_SID: WellKnownSidType = 112

public val WIN_BUILTIN_SYSTEM_OPERATORS_SID: WellKnownSidType = 31

public val WIN_BUILTIN_TERMINAL_SERVER_LICENSE_SERVERS_SID: WellKnownSidType = 60

public val WIN_BUILTIN_USERS_SID: WellKnownSidType = 27

public val WIN_CACHEABLE_PRINCIPALS_GROUP_SID: WellKnownSidType = 72

public val WIN_CAPABILITY_APPOINTMENTS_SID: WellKnownSidType = 108

public val WIN_CAPABILITY_CONTACTS_SID: WellKnownSidType = 109

public val WIN_CAPABILITY_DOCUMENTS_LIBRARY_SID: WellKnownSidType = 91

public val WIN_CAPABILITY_ENTERPRISE_AUTHENTICATION_SID: WellKnownSidType = 93

public val WIN_CAPABILITY_INTERNET_CLIENT_SERVER_SID: WellKnownSidType = 86

public val WIN_CAPABILITY_INTERNET_CLIENT_SID: WellKnownSidType = 85

public val WIN_CAPABILITY_MUSIC_LIBRARY_SID: WellKnownSidType = 90

public val WIN_CAPABILITY_PICTURES_LIBRARY_SID: WellKnownSidType = 88

public val WIN_CAPABILITY_PRIVATE_NETWORK_CLIENT_SERVER_SID: WellKnownSidType = 87

public val WIN_CAPABILITY_REMOVABLE_STORAGE_SID: WellKnownSidType = 94

public val WIN_CAPABILITY_SHARED_USER_CERTIFICATES_SID: WellKnownSidType = 92

public val WIN_CAPABILITY_VIDEOS_LIBRARY_SID: WellKnownSidType = 89

public val WIN_CONSOLE_LOGON_SID: WellKnownSidType = 81

public val WIN_CREATOR_GROUP_SERVER_SID: WellKnownSidType = 6

public val WIN_CREATOR_GROUP_SID: WellKnownSidType = 4

public val WIN_CREATOR_OWNER_RIGHTS_SID: WellKnownSidType = 71

public val WIN_CREATOR_OWNER_SERVER_SID: WellKnownSidType = 5

public val WIN_CREATOR_OWNER_SID: WellKnownSidType = 3

public val WIN_DIALUP_SID: WellKnownSidType = 8

public val WIN_DIGEST_AUTHENTICATION_SID: WellKnownSidType = 52

public val WIN_ENTERPRISE_CONTROLLERS_SID: WellKnownSidType = 15

public val WIN_ENTERPRISE_READONLY_CONTROLLERS_SID: WellKnownSidType = 74

public val WIN_HIGH_LABEL_SID: WellKnownSidType = 68

public val WIN_I_USER_SID: WellKnownSidType = 63

public val WIN_INTERACTIVE_SID: WellKnownSidType = 11

public val WIN_LOCAL_ACCOUNT_AND_ADMINISTRATOR_SID: WellKnownSidType = 106

public val WIN_LOCAL_ACCOUNT_SID: WellKnownSidType = 105

public val WIN_LOCAL_LOGON_SID: WellKnownSidType = 80

public val WIN_LOCAL_SERVICE_SID: WellKnownSidType = 23

public val WIN_LOCAL_SID: WellKnownSidType = 2

public val WIN_LOCAL_SYSTEM_SID: WellKnownSidType = 22

public val WIN_LOGON_IDS_SID: WellKnownSidType = 21

public val WIN_LOW_LABEL_SID: WellKnownSidType = 66

public val WIN_MEDIUM_LABEL_SID: WellKnownSidType = 67

public val WIN_MEDIUM_PLUS_LABEL_SID: WellKnownSidType = 79

public val WIN_NTLM_AUTHENTICATION_SID: WellKnownSidType = 51

public val WIN_NETWORK_SERVICE_SID: WellKnownSidType = 24

public val WIN_NETWORK_SID: WellKnownSidType = 9

public val WIN_NEW_ENTERPRISE_READONLY_CONTROLLERS_SID: WellKnownSidType = 77

public val WIN_NON_CACHEABLE_PRINCIPALS_GROUP_SID: WellKnownSidType = 73

public val WIN_NT_AUTHORITY_SID: WellKnownSidType = 7

public val WIN_NULL_SID: WellKnownSidType = 0

public val WIN_OTHER_ORGANIZATION_SID: WellKnownSidType = 55

public val WIN_PROXY_SID: WellKnownSidType = 14

public val WIN_REMOTE_LOGON_ID_SID: WellKnownSidType = 20

public val WIN_RESTRICTED_CODE_SID: WellKnownSidType = 18

public val WIN_S_CHANNEL_AUTHENTICATION_SID: WellKnownSidType = 53

public val WIN_SELF_SID: WellKnownSidType = 16

public val WIN_SERVICE_SID: WellKnownSidType = 12

public val WIN_SYSTEM_LABEL_SID: WellKnownSidType = 69

public val WIN_TERMINAL_SERVER_SID: WellKnownSidType = 19

public val WIN_THIS_ORGANIZATION_CERTIFICATE_SID: WellKnownSidType = 82

public val WIN_THIS_ORGANIZATION_SID: WellKnownSidType = 54

public val WIN_UNTRUSTED_LABEL_SID: WellKnownSidType = 65

public val WIN_USER_MODE_DRIVERS_SID: WellKnownSidType = 98

public val WIN_WORLD_SID: WellKnownSidType = 1

public val WIN_WRITE_RESTRICTED_CODE_SID: WellKnownSidType = 70

public val CWC_FILENAMESUFFIXMAX: UInt = 20u

public val CWC_HRESULTSTRING: UInt = 40u

public val SZ_LBRACE: Pcstr = s("{")

public val SZ_LPAREN: Pcstr = s("(")

public val SZ_RBRACE: Pcstr = s("}")

public val SZ_RPAREN: Pcstr = s(")")

public val WSZ_CERTENROLLSHAREPATH: Pcwstr = w("CertSrv\\CertEnroll")

public val WSZ_FCSAPARM_CERTFILENAMESUFFIX: Pcwstr = w("%4")

public val WSZ_FCSAPARM_CONFIGDN: Pcwstr = w("%6")

public val WSZ_FCSAPARM_CRLDELTAFILENAMESUFFIX: Pcwstr = w("%9")

public val WSZ_FCSAPARM_CRLFILENAMESUFFIX: Pcwstr = w("%8")

public val WSZ_FCSAPARM_DOMAINDN: Pcwstr = w("%5")

public val WSZ_FCSAPARM_DSCACERTATTRIBUTE: Pcwstr = w("%11")

public val WSZ_FCSAPARM_DSCRLATTRIBUTE: Pcwstr = w("%10")

public val WSZ_FCSAPARM_DSCROSSCERTPAIRATTRIBUTE: Pcwstr = w("%14")

public val WSZ_FCSAPARM_DSKRACERTATTRIBUTE: Pcwstr = w("%13")

public val WSZ_FCSAPARM_DSUSERCERTATTRIBUTE: Pcwstr = w("%12")

public val WSZ_FCSAPARM_SANITIZEDCANAME: Pcwstr = w("%3")

public val WSZ_FCSAPARM_SANITIZEDCANAMEHASH: Pcwstr = w("%7")

public val WSZ_FCSAPARM_SERVERDNSNAME: Pcwstr = w("%1")

public val WSZ_FCSAPARM_SERVERSHORTNAME: Pcwstr = w("%2")

public val WSZ_LBRACE: Pcwstr = w("{")

public val WSZ_LPAREN: Pcwstr = w("(")

public val WSZ_RBRACE: Pcwstr = w("}")

public val WSZ_RPAREN: Pcwstr = w(")")
