@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACE_INHERITED_OBJECT_TYPE_PRESENT: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 2u

public val ACE_OBJECT_TYPE_PRESENT: SYSTEM_AUDIT_OBJECT_ACE_FLAGS = 1u

public val ACL_REVISION: ACE_REVISION = 2u

public val ACL_REVISION_DS: ACE_REVISION = 4u

public val ATTRIBUTE_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 32u

public val AclRevisionInformation: ACL_INFORMATION_CLASS = 1

public val AclSizeInformation: ACL_INFORMATION_CLASS = 2

public val AuditEventDirectoryServiceAccess: AUDIT_EVENT_TYPE = 1

public val AuditEventObjectAccess: AUDIT_EVENT_TYPE = 0

public val BACKUP_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 65536u

public val CLAIM_SECURITY_ATTRIBUTE_DISABLED: CLAIM_SECURITY_ATTRIBUTE_FLAGS = 16u

public val CLAIM_SECURITY_ATTRIBUTE_DISABLED_BY_DEFAULT: CLAIM_SECURITY_ATTRIBUTE_FLAGS = 8u

public val CLAIM_SECURITY_ATTRIBUTE_MANDATORY: CLAIM_SECURITY_ATTRIBUTE_FLAGS = 32u

public val CLAIM_SECURITY_ATTRIBUTE_NON_INHERITABLE: CLAIM_SECURITY_ATTRIBUTE_FLAGS = 1u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_BOOLEAN: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 6u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_FQBN: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 4u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_INT64: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 1u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_OCTET_STRING: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 16u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_SID: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 5u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_STRING: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 3u

public val CLAIM_SECURITY_ATTRIBUTE_TYPE_UINT64: CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = 2u

public val CLAIM_SECURITY_ATTRIBUTE_USE_FOR_DENY_ONLY: CLAIM_SECURITY_ATTRIBUTE_FLAGS = 4u

public val CLAIM_SECURITY_ATTRIBUTE_VALUE_CASE_SENSITIVE: CLAIM_SECURITY_ATTRIBUTE_FLAGS = 2u

public val CONTAINER_INHERIT_ACE: ACE_FLAGS = 2u

public val CVT_SECONDS: UInt = 1u

public val DACL_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 4u

public val DISABLE_MAX_PRIVILEGE: CREATE_RESTRICTED_TOKEN_FLAGS = 1u

public val ENUM_PERIOD_DAYS: ENUM_PERIOD = 3

public val ENUM_PERIOD_HOURS: ENUM_PERIOD = 2

public val ENUM_PERIOD_INVALID: ENUM_PERIOD = -1

public val ENUM_PERIOD_MINUTES: ENUM_PERIOD = 1

public val ENUM_PERIOD_MONTHS: ENUM_PERIOD = 5

public val ENUM_PERIOD_SECONDS: ENUM_PERIOD = 0

public val ENUM_PERIOD_WEEKS: ENUM_PERIOD = 4

public val ENUM_PERIOD_YEARS: ENUM_PERIOD = 6

public val FAILED_ACCESS_ACE_FLAG: ACE_FLAGS = 128u

public val GROUP_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 2u

public val INHERITED_ACE: ACE_FLAGS = 16u

public val INHERIT_NO_PROPAGATE: ACE_FLAGS = 4u

public val INHERIT_ONLY: ACE_FLAGS = 8u

public val INHERIT_ONLY_ACE: ACE_FLAGS = 8u

public val LABEL_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 16u

public val LOGON32_LOGON_BATCH: LOGON32_LOGON = 4u

public val LOGON32_LOGON_INTERACTIVE: LOGON32_LOGON = 2u

public val LOGON32_LOGON_NETWORK: LOGON32_LOGON = 3u

public val LOGON32_LOGON_NETWORK_CLEARTEXT: LOGON32_LOGON = 8u

public val LOGON32_LOGON_NEW_CREDENTIALS: LOGON32_LOGON = 9u

public val LOGON32_LOGON_SERVICE: LOGON32_LOGON = 5u

public val LOGON32_LOGON_UNLOCK: LOGON32_LOGON = 7u

public val LOGON32_PROVIDER_DEFAULT: LOGON32_PROVIDER = 0u

public val LOGON32_PROVIDER_WINNT40: LOGON32_PROVIDER = 2u

public val LOGON32_PROVIDER_WINNT50: LOGON32_PROVIDER = 3u

public val LUA_TOKEN: CREATE_RESTRICTED_TOKEN_FLAGS = 4u

public val MandatoryLevelCount: MANDATORY_LEVEL = 6

public val MandatoryLevelHigh: MANDATORY_LEVEL = 3

public val MandatoryLevelLow: MANDATORY_LEVEL = 1

public val MandatoryLevelMedium: MANDATORY_LEVEL = 2

public val MandatoryLevelSecureProcess: MANDATORY_LEVEL = 5

public val MandatoryLevelSystem: MANDATORY_LEVEL = 4

public val MandatoryLevelUntrusted: MANDATORY_LEVEL = 0

public val MaxTokenInfoClass: TOKEN_INFORMATION_CLASS = 49

public val NO_INHERITANCE: ACE_FLAGS = 0u

public val NO_PROPAGATE_INHERIT_ACE: ACE_FLAGS = 4u

public val OBJECT_INHERIT_ACE: ACE_FLAGS = 1u

public val OWNER_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 1u

public val PROTECTED_DACL_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 2147483648u

public val PROTECTED_SACL_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 1073741824u

public val SACL_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 8u

public val SANDBOX_INERT: CREATE_RESTRICTED_TOKEN_FLAGS = 2u

public val SCOPE_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 64u

public val SECURITY_APP_PACKAGE_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 15u))

public val SECURITY_AUTHENTICATION_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 18u))

public val SECURITY_CREATOR_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 3u))

public val SECURITY_DYNAMIC_TRACKING: Boolean = true

public val SECURITY_LOCAL_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 2u))

public val SECURITY_MANDATORY_LABEL_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 16u))

public val SECURITY_MAX_SID_SIZE: UInt = 68u

public val SECURITY_NON_UNIQUE_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 4u))

public val SECURITY_NT_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 5u))

public val SECURITY_NULL_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 0u))

public val SECURITY_PROCESS_TRUST_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 19u))

public val SECURITY_RESOURCE_MANAGER_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 9u))

public val SECURITY_SCOPED_POLICY_ID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 17u))

public val SECURITY_STATIC_TRACKING: Boolean = false

public val SECURITY_WORLD_SID_AUTHORITY: SID_IDENTIFIER_AUTHORITY = SID_IDENTIFIER_AUTHORITY(Value = ubyteArrayOf(0u, 0u, 0u, 0u, 0u, 1u))

public val SEF_AVOID_OWNER_CHECK: SECURITY_AUTO_INHERIT_FLAGS = 16u

public val SEF_AVOID_OWNER_RESTRICTION: SECURITY_AUTO_INHERIT_FLAGS = 4096u

public val SEF_AVOID_PRIVILEGE_CHECK: SECURITY_AUTO_INHERIT_FLAGS = 8u

public val SEF_DACL_AUTO_INHERIT: SECURITY_AUTO_INHERIT_FLAGS = 1u

public val SEF_DEFAULT_DESCRIPTOR_FOR_OBJECT: SECURITY_AUTO_INHERIT_FLAGS = 4u

public val SEF_DEFAULT_GROUP_FROM_PARENT: SECURITY_AUTO_INHERIT_FLAGS = 64u

public val SEF_DEFAULT_OWNER_FROM_PARENT: SECURITY_AUTO_INHERIT_FLAGS = 32u

public val SEF_MACL_NO_EXECUTE_UP: SECURITY_AUTO_INHERIT_FLAGS = 1024u

public val SEF_MACL_NO_READ_UP: SECURITY_AUTO_INHERIT_FLAGS = 512u

public val SEF_MACL_NO_WRITE_UP: SECURITY_AUTO_INHERIT_FLAGS = 256u

public val SEF_SACL_AUTO_INHERIT: SECURITY_AUTO_INHERIT_FLAGS = 2u

public val SE_ASSIGNPRIMARYTOKEN_NAME: PCWSTR = w("SeAssignPrimaryTokenPrivilege")

public val SE_AUDIT_NAME: PCWSTR = w("SeAuditPrivilege")

public val SE_BACKUP_NAME: PCWSTR = w("SeBackupPrivilege")

public val SE_CHANGE_NOTIFY_NAME: PCWSTR = w("SeChangeNotifyPrivilege")

public val SE_CREATE_GLOBAL_NAME: PCWSTR = w("SeCreateGlobalPrivilege")

public val SE_CREATE_PAGEFILE_NAME: PCWSTR = w("SeCreatePagefilePrivilege")

public val SE_CREATE_PERMANENT_NAME: PCWSTR = w("SeCreatePermanentPrivilege")

public val SE_CREATE_SYMBOLIC_LINK_NAME: PCWSTR = w("SeCreateSymbolicLinkPrivilege")

public val SE_CREATE_TOKEN_NAME: PCWSTR = w("SeCreateTokenPrivilege")

public val SE_DACL_AUTO_INHERITED: SECURITY_DESCRIPTOR_CONTROL = 1024u

public val SE_DACL_AUTO_INHERIT_REQ: SECURITY_DESCRIPTOR_CONTROL = 256u

public val SE_DACL_DEFAULTED: SECURITY_DESCRIPTOR_CONTROL = 8u

public val SE_DACL_PRESENT: SECURITY_DESCRIPTOR_CONTROL = 4u

public val SE_DACL_PROTECTED: SECURITY_DESCRIPTOR_CONTROL = 4096u

public val SE_DEBUG_NAME: PCWSTR = w("SeDebugPrivilege")

public val SE_DELEGATE_SESSION_USER_IMPERSONATE_NAME: PCWSTR = w("SeDelegateSessionUserImpersonatePrivilege")

public val SE_ENABLE_DELEGATION_NAME: PCWSTR = w("SeEnableDelegationPrivilege")

public val SE_GROUP_DEFAULTED: SECURITY_DESCRIPTOR_CONTROL = 2u

public val SE_IMPERSONATE_NAME: PCWSTR = w("SeImpersonatePrivilege")

public val SE_INCREASE_QUOTA_NAME: PCWSTR = w("SeIncreaseQuotaPrivilege")

public val SE_INC_BASE_PRIORITY_NAME: PCWSTR = w("SeIncreaseBasePriorityPrivilege")

public val SE_INC_WORKING_SET_NAME: PCWSTR = w("SeIncreaseWorkingSetPrivilege")

public val SE_LOAD_DRIVER_NAME: PCWSTR = w("SeLoadDriverPrivilege")

public val SE_LOCK_MEMORY_NAME: PCWSTR = w("SeLockMemoryPrivilege")

public val SE_MACHINE_ACCOUNT_NAME: PCWSTR = w("SeMachineAccountPrivilege")

public val SE_MANAGE_VOLUME_NAME: PCWSTR = w("SeManageVolumePrivilege")

public val SE_OWNER_DEFAULTED: SECURITY_DESCRIPTOR_CONTROL = 1u

public val SE_PRIVILEGE_ENABLED: TOKEN_PRIVILEGES_ATTRIBUTES = 2u

public val SE_PRIVILEGE_ENABLED_BY_DEFAULT: TOKEN_PRIVILEGES_ATTRIBUTES = 1u

public val SE_PRIVILEGE_REMOVED: TOKEN_PRIVILEGES_ATTRIBUTES = 4u

public val SE_PRIVILEGE_USED_FOR_ACCESS: TOKEN_PRIVILEGES_ATTRIBUTES = 2147483648u

public val SE_PROF_SINGLE_PROCESS_NAME: PCWSTR = w("SeProfileSingleProcessPrivilege")

public val SE_RELABEL_NAME: PCWSTR = w("SeRelabelPrivilege")

public val SE_REMOTE_SHUTDOWN_NAME: PCWSTR = w("SeRemoteShutdownPrivilege")

public val SE_RESTORE_NAME: PCWSTR = w("SeRestorePrivilege")

public val SE_RM_CONTROL_VALID: SECURITY_DESCRIPTOR_CONTROL = 16384u

public val SE_SACL_AUTO_INHERITED: SECURITY_DESCRIPTOR_CONTROL = 2048u

public val SE_SACL_AUTO_INHERIT_REQ: SECURITY_DESCRIPTOR_CONTROL = 512u

public val SE_SACL_DEFAULTED: SECURITY_DESCRIPTOR_CONTROL = 32u

public val SE_SACL_PRESENT: SECURITY_DESCRIPTOR_CONTROL = 16u

public val SE_SACL_PROTECTED: SECURITY_DESCRIPTOR_CONTROL = 8192u

public val SE_SECURITY_NAME: PCWSTR = w("SeSecurityPrivilege")

public val SE_SELF_RELATIVE: SECURITY_DESCRIPTOR_CONTROL = 32768u

public val SE_SHUTDOWN_NAME: PCWSTR = w("SeShutdownPrivilege")

public val SE_SYNC_AGENT_NAME: PCWSTR = w("SeSyncAgentPrivilege")

public val SE_SYSTEMTIME_NAME: PCWSTR = w("SeSystemtimePrivilege")

public val SE_SYSTEM_ENVIRONMENT_NAME: PCWSTR = w("SeSystemEnvironmentPrivilege")

public val SE_SYSTEM_PROFILE_NAME: PCWSTR = w("SeSystemProfilePrivilege")

public val SE_TAKE_OWNERSHIP_NAME: PCWSTR = w("SeTakeOwnershipPrivilege")

public val SE_TCB_NAME: PCWSTR = w("SeTcbPrivilege")

public val SE_TIME_ZONE_NAME: PCWSTR = w("SeTimeZonePrivilege")

public val SE_TRUSTED_CREDMAN_ACCESS_NAME: PCWSTR = w("SeTrustedCredManAccessPrivilege")

public val SE_UNDOCK_NAME: PCWSTR = w("SeUndockPrivilege")

public val SE_UNSOLICITED_INPUT_NAME: PCWSTR = w("SeUnsolicitedInputPrivilege")

public val SIGNING_LEVEL_FILE_CACHE_FLAG_NOT_VALIDATED: UInt = 1u

public val SIGNING_LEVEL_FILE_CACHE_FLAG_VALIDATE_ONLY: UInt = 4u

public val SIGNING_LEVEL_MICROSOFT: UInt = 8u

public val SUB_CONTAINERS_AND_OBJECTS_INHERIT: ACE_FLAGS = 3u

public val SUB_CONTAINERS_ONLY_INHERIT: ACE_FLAGS = 2u

public val SUB_OBJECTS_ONLY_INHERIT: ACE_FLAGS = 1u

public val SUCCESSFUL_ACCESS_ACE_FLAG: ACE_FLAGS = 64u

public val SecurityAnonymous: SECURITY_IMPERSONATION_LEVEL = 0

public val SecurityDelegation: SECURITY_IMPERSONATION_LEVEL = 3

public val SecurityIdentification: SECURITY_IMPERSONATION_LEVEL = 1

public val SecurityImpersonation: SECURITY_IMPERSONATION_LEVEL = 2

public val SidTypeAlias: SID_NAME_USE = 4

public val SidTypeComputer: SID_NAME_USE = 9

public val SidTypeDeletedAccount: SID_NAME_USE = 6

public val SidTypeDomain: SID_NAME_USE = 3

public val SidTypeGroup: SID_NAME_USE = 2

public val SidTypeInvalid: SID_NAME_USE = 7

public val SidTypeLabel: SID_NAME_USE = 10

public val SidTypeLogonSession: SID_NAME_USE = 11

public val SidTypeUnknown: SID_NAME_USE = 8

public val SidTypeUser: SID_NAME_USE = 1

public val SidTypeWellKnownGroup: SID_NAME_USE = 5

public val TOKEN_ACCESS_PSEUDO_HANDLE: TOKEN_ACCESS_MASK = 24u

public val TOKEN_ACCESS_PSEUDO_HANDLE_WIN8: TOKEN_ACCESS_MASK = 24u

public val TOKEN_ACCESS_SYSTEM_SECURITY: TOKEN_ACCESS_MASK = 16777216u

public val TOKEN_ADJUST_DEFAULT: TOKEN_ACCESS_MASK = 128u

public val TOKEN_ADJUST_GROUPS: TOKEN_ACCESS_MASK = 64u

public val TOKEN_ADJUST_PRIVILEGES: TOKEN_ACCESS_MASK = 32u

public val TOKEN_ADJUST_SESSIONID: TOKEN_ACCESS_MASK = 256u

public val TOKEN_ALL_ACCESS: TOKEN_ACCESS_MASK = 983551u

public val TOKEN_ASSIGN_PRIMARY: TOKEN_ACCESS_MASK = 1u

public val TOKEN_DELETE: TOKEN_ACCESS_MASK = 65536u

public val TOKEN_DUPLICATE: TOKEN_ACCESS_MASK = 2u

public val TOKEN_EXECUTE: TOKEN_ACCESS_MASK = 131072u

public val TOKEN_IMPERSONATE: TOKEN_ACCESS_MASK = 4u

public val TOKEN_MANDATORY_POLICY_NEW_PROCESS_MIN: TOKEN_MANDATORY_POLICY_ID = 2u

public val TOKEN_MANDATORY_POLICY_NO_WRITE_UP: TOKEN_MANDATORY_POLICY_ID = 1u

public val TOKEN_MANDATORY_POLICY_OFF: TOKEN_MANDATORY_POLICY_ID = 0u

public val TOKEN_MANDATORY_POLICY_VALID_MASK: TOKEN_MANDATORY_POLICY_ID = 3u

public val TOKEN_QUERY: TOKEN_ACCESS_MASK = 8u

public val TOKEN_QUERY_SOURCE: TOKEN_ACCESS_MASK = 16u

public val TOKEN_READ: TOKEN_ACCESS_MASK = 131080u

public val TOKEN_READ_CONTROL: TOKEN_ACCESS_MASK = 131072u

public val TOKEN_TRUST_CONSTRAINT_MASK: TOKEN_ACCESS_MASK = 131096u

public val TOKEN_WRITE: TOKEN_ACCESS_MASK = 131296u

public val TOKEN_WRITE_DAC: TOKEN_ACCESS_MASK = 262144u

public val TOKEN_WRITE_OWNER: TOKEN_ACCESS_MASK = 524288u

public val TokenAccessInformation: TOKEN_INFORMATION_CLASS = 22

public val TokenAppContainerNumber: TOKEN_INFORMATION_CLASS = 32

public val TokenAppContainerSid: TOKEN_INFORMATION_CLASS = 31

public val TokenAuditPolicy: TOKEN_INFORMATION_CLASS = 16

public val TokenBnoIsolation: TOKEN_INFORMATION_CLASS = 44

public val TokenCapabilities: TOKEN_INFORMATION_CLASS = 30

public val TokenChildProcessFlags: TOKEN_INFORMATION_CLASS = 45

public val TokenDefaultDacl: TOKEN_INFORMATION_CLASS = 6

public val TokenDeviceClaimAttributes: TOKEN_INFORMATION_CLASS = 34

public val TokenDeviceGroups: TOKEN_INFORMATION_CLASS = 37

public val TokenElevation: TOKEN_INFORMATION_CLASS = 20

public val TokenElevationType: TOKEN_INFORMATION_CLASS = 18

public val TokenElevationTypeDefault: TOKEN_ELEVATION_TYPE = 1

public val TokenElevationTypeFull: TOKEN_ELEVATION_TYPE = 2

public val TokenElevationTypeLimited: TOKEN_ELEVATION_TYPE = 3

public val TokenGroups: TOKEN_INFORMATION_CLASS = 2

public val TokenGroupsAndPrivileges: TOKEN_INFORMATION_CLASS = 13

public val TokenHasRestrictions: TOKEN_INFORMATION_CLASS = 21

public val TokenImpersonation: TOKEN_TYPE = 2

public val TokenImpersonationLevel: TOKEN_INFORMATION_CLASS = 9

public val TokenIntegrityLevel: TOKEN_INFORMATION_CLASS = 25

public val TokenIsAppContainer: TOKEN_INFORMATION_CLASS = 29

public val TokenIsAppSilo: TOKEN_INFORMATION_CLASS = 48

public val TokenIsLessPrivilegedAppContainer: TOKEN_INFORMATION_CLASS = 46

public val TokenIsRestricted: TOKEN_INFORMATION_CLASS = 40

public val TokenIsSandboxed: TOKEN_INFORMATION_CLASS = 47

public val TokenLinkedToken: TOKEN_INFORMATION_CLASS = 19

public val TokenLogonSid: TOKEN_INFORMATION_CLASS = 28

public val TokenMandatoryPolicy: TOKEN_INFORMATION_CLASS = 27

public val TokenOrigin: TOKEN_INFORMATION_CLASS = 17

public val TokenOwner: TOKEN_INFORMATION_CLASS = 4

public val TokenPrimary: TOKEN_TYPE = 1

public val TokenPrimaryGroup: TOKEN_INFORMATION_CLASS = 5

public val TokenPrivateNameSpace: TOKEN_INFORMATION_CLASS = 42

public val TokenPrivileges: TOKEN_INFORMATION_CLASS = 3

public val TokenProcessTrustLevel: TOKEN_INFORMATION_CLASS = 41

public val TokenRestrictedDeviceClaimAttributes: TOKEN_INFORMATION_CLASS = 36

public val TokenRestrictedDeviceGroups: TOKEN_INFORMATION_CLASS = 38

public val TokenRestrictedSids: TOKEN_INFORMATION_CLASS = 11

public val TokenRestrictedUserClaimAttributes: TOKEN_INFORMATION_CLASS = 35

public val TokenSandBoxInert: TOKEN_INFORMATION_CLASS = 15

public val TokenSecurityAttributes: TOKEN_INFORMATION_CLASS = 39

public val TokenSessionId: TOKEN_INFORMATION_CLASS = 12

public val TokenSessionReference: TOKEN_INFORMATION_CLASS = 14

public val TokenSingletonAttributes: TOKEN_INFORMATION_CLASS = 43

public val TokenSource: TOKEN_INFORMATION_CLASS = 7

public val TokenStatistics: TOKEN_INFORMATION_CLASS = 10

public val TokenType: TOKEN_INFORMATION_CLASS = 8

public val TokenUIAccess: TOKEN_INFORMATION_CLASS = 26

public val TokenUser: TOKEN_INFORMATION_CLASS = 1

public val TokenUserClaimAttributes: TOKEN_INFORMATION_CLASS = 33

public val TokenVirtualizationAllowed: TOKEN_INFORMATION_CLASS = 23

public val TokenVirtualizationEnabled: TOKEN_INFORMATION_CLASS = 24

public val UNPROTECTED_DACL_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 536870912u

public val UNPROTECTED_SACL_SECURITY_INFORMATION: OBJECT_SECURITY_INFORMATION = 268435456u

public val WRITE_RESTRICTED: CREATE_RESTRICTED_TOKEN_FLAGS = 8u

public val WinAccountAdministratorSid: WELL_KNOWN_SID_TYPE = 38

public val WinAccountCertAdminsSid: WELL_KNOWN_SID_TYPE = 46

public val WinAccountCloneableControllersSid: WELL_KNOWN_SID_TYPE = 100

public val WinAccountComputersSid: WELL_KNOWN_SID_TYPE = 44

public val WinAccountControllersSid: WELL_KNOWN_SID_TYPE = 45

public val WinAccountDefaultSystemManagedSid: WELL_KNOWN_SID_TYPE = 110

public val WinAccountDomainAdminsSid: WELL_KNOWN_SID_TYPE = 41

public val WinAccountDomainGuestsSid: WELL_KNOWN_SID_TYPE = 43

public val WinAccountDomainUsersSid: WELL_KNOWN_SID_TYPE = 42

public val WinAccountEnterpriseAdminsSid: WELL_KNOWN_SID_TYPE = 48

public val WinAccountEnterpriseKeyAdminsSid: WELL_KNOWN_SID_TYPE = 114

public val WinAccountGuestSid: WELL_KNOWN_SID_TYPE = 39

public val WinAccountKeyAdminsSid: WELL_KNOWN_SID_TYPE = 113

public val WinAccountKrbtgtSid: WELL_KNOWN_SID_TYPE = 40

public val WinAccountPolicyAdminsSid: WELL_KNOWN_SID_TYPE = 49

public val WinAccountProtectedUsersSid: WELL_KNOWN_SID_TYPE = 107

public val WinAccountRasAndIasServersSid: WELL_KNOWN_SID_TYPE = 50

public val WinAccountReadonlyControllersSid: WELL_KNOWN_SID_TYPE = 75

public val WinAccountSchemaAdminsSid: WELL_KNOWN_SID_TYPE = 47

public val WinAnonymousSid: WELL_KNOWN_SID_TYPE = 13

public val WinApplicationPackageAuthoritySid: WELL_KNOWN_SID_TYPE = 83

public val WinAuthenticatedUserSid: WELL_KNOWN_SID_TYPE = 17

public val WinAuthenticationAuthorityAssertedSid: WELL_KNOWN_SID_TYPE = 103

public val WinAuthenticationFreshKeyAuthSid: WELL_KNOWN_SID_TYPE = 118

public val WinAuthenticationKeyPropertyAttestationSid: WELL_KNOWN_SID_TYPE = 117

public val WinAuthenticationKeyPropertyMFASid: WELL_KNOWN_SID_TYPE = 116

public val WinAuthenticationKeyTrustSid: WELL_KNOWN_SID_TYPE = 115

public val WinAuthenticationServiceAssertedSid: WELL_KNOWN_SID_TYPE = 104

public val WinBatchSid: WELL_KNOWN_SID_TYPE = 10

public val WinBuiltinAccessControlAssistanceOperatorsSid: WELL_KNOWN_SID_TYPE = 101

public val WinBuiltinAccountOperatorsSid: WELL_KNOWN_SID_TYPE = 30

public val WinBuiltinAdministratorsSid: WELL_KNOWN_SID_TYPE = 26

public val WinBuiltinAnyPackageSid: WELL_KNOWN_SID_TYPE = 84

public val WinBuiltinAuthorizationAccessSid: WELL_KNOWN_SID_TYPE = 59

public val WinBuiltinBackupOperatorsSid: WELL_KNOWN_SID_TYPE = 33

public val WinBuiltinCertSvcDComAccessGroup: WELL_KNOWN_SID_TYPE = 78

public val WinBuiltinCryptoOperatorsSid: WELL_KNOWN_SID_TYPE = 64

public val WinBuiltinDCOMUsersSid: WELL_KNOWN_SID_TYPE = 61

public val WinBuiltinDefaultSystemManagedGroupSid: WELL_KNOWN_SID_TYPE = 111

public val WinBuiltinDeviceOwnersSid: WELL_KNOWN_SID_TYPE = 119

public val WinBuiltinDomainSid: WELL_KNOWN_SID_TYPE = 25

public val WinBuiltinEventLogReadersGroup: WELL_KNOWN_SID_TYPE = 76

public val WinBuiltinGuestsSid: WELL_KNOWN_SID_TYPE = 28

public val WinBuiltinHyperVAdminsSid: WELL_KNOWN_SID_TYPE = 99

public val WinBuiltinIUsersSid: WELL_KNOWN_SID_TYPE = 62

public val WinBuiltinIncomingForestTrustBuildersSid: WELL_KNOWN_SID_TYPE = 56

public val WinBuiltinNetworkConfigurationOperatorsSid: WELL_KNOWN_SID_TYPE = 37

public val WinBuiltinPerfLoggingUsersSid: WELL_KNOWN_SID_TYPE = 58

public val WinBuiltinPerfMonitoringUsersSid: WELL_KNOWN_SID_TYPE = 57

public val WinBuiltinPowerUsersSid: WELL_KNOWN_SID_TYPE = 29

public val WinBuiltinPreWindows2000CompatibleAccessSid: WELL_KNOWN_SID_TYPE = 35

public val WinBuiltinPrintOperatorsSid: WELL_KNOWN_SID_TYPE = 32

public val WinBuiltinRDSEndpointServersSid: WELL_KNOWN_SID_TYPE = 96

public val WinBuiltinRDSManagementServersSid: WELL_KNOWN_SID_TYPE = 97

public val WinBuiltinRDSRemoteAccessServersSid: WELL_KNOWN_SID_TYPE = 95

public val WinBuiltinRemoteDesktopUsersSid: WELL_KNOWN_SID_TYPE = 36

public val WinBuiltinRemoteManagementUsersSid: WELL_KNOWN_SID_TYPE = 102

public val WinBuiltinReplicatorSid: WELL_KNOWN_SID_TYPE = 34

public val WinBuiltinStorageReplicaAdminsSid: WELL_KNOWN_SID_TYPE = 112

public val WinBuiltinSystemOperatorsSid: WELL_KNOWN_SID_TYPE = 31

public val WinBuiltinTerminalServerLicenseServersSid: WELL_KNOWN_SID_TYPE = 60

public val WinBuiltinUsersSid: WELL_KNOWN_SID_TYPE = 27

public val WinCacheablePrincipalsGroupSid: WELL_KNOWN_SID_TYPE = 72

public val WinCapabilityAppointmentsSid: WELL_KNOWN_SID_TYPE = 108

public val WinCapabilityContactsSid: WELL_KNOWN_SID_TYPE = 109

public val WinCapabilityDocumentsLibrarySid: WELL_KNOWN_SID_TYPE = 91

public val WinCapabilityEnterpriseAuthenticationSid: WELL_KNOWN_SID_TYPE = 93

public val WinCapabilityInternetClientServerSid: WELL_KNOWN_SID_TYPE = 86

public val WinCapabilityInternetClientSid: WELL_KNOWN_SID_TYPE = 85

public val WinCapabilityMusicLibrarySid: WELL_KNOWN_SID_TYPE = 90

public val WinCapabilityPicturesLibrarySid: WELL_KNOWN_SID_TYPE = 88

public val WinCapabilityPrivateNetworkClientServerSid: WELL_KNOWN_SID_TYPE = 87

public val WinCapabilityRemovableStorageSid: WELL_KNOWN_SID_TYPE = 94

public val WinCapabilitySharedUserCertificatesSid: WELL_KNOWN_SID_TYPE = 92

public val WinCapabilityVideosLibrarySid: WELL_KNOWN_SID_TYPE = 89

public val WinConsoleLogonSid: WELL_KNOWN_SID_TYPE = 81

public val WinCreatorGroupServerSid: WELL_KNOWN_SID_TYPE = 6

public val WinCreatorGroupSid: WELL_KNOWN_SID_TYPE = 4

public val WinCreatorOwnerRightsSid: WELL_KNOWN_SID_TYPE = 71

public val WinCreatorOwnerServerSid: WELL_KNOWN_SID_TYPE = 5

public val WinCreatorOwnerSid: WELL_KNOWN_SID_TYPE = 3

public val WinDialupSid: WELL_KNOWN_SID_TYPE = 8

public val WinDigestAuthenticationSid: WELL_KNOWN_SID_TYPE = 52

public val WinEnterpriseControllersSid: WELL_KNOWN_SID_TYPE = 15

public val WinEnterpriseReadonlyControllersSid: WELL_KNOWN_SID_TYPE = 74

public val WinHighLabelSid: WELL_KNOWN_SID_TYPE = 68

public val WinIUserSid: WELL_KNOWN_SID_TYPE = 63

public val WinInteractiveSid: WELL_KNOWN_SID_TYPE = 11

public val WinLocalAccountAndAdministratorSid: WELL_KNOWN_SID_TYPE = 106

public val WinLocalAccountSid: WELL_KNOWN_SID_TYPE = 105

public val WinLocalLogonSid: WELL_KNOWN_SID_TYPE = 80

public val WinLocalServiceSid: WELL_KNOWN_SID_TYPE = 23

public val WinLocalSid: WELL_KNOWN_SID_TYPE = 2

public val WinLocalSystemSid: WELL_KNOWN_SID_TYPE = 22

public val WinLogonIdsSid: WELL_KNOWN_SID_TYPE = 21

public val WinLowLabelSid: WELL_KNOWN_SID_TYPE = 66

public val WinMediumLabelSid: WELL_KNOWN_SID_TYPE = 67

public val WinMediumPlusLabelSid: WELL_KNOWN_SID_TYPE = 79

public val WinNTLMAuthenticationSid: WELL_KNOWN_SID_TYPE = 51

public val WinNetworkServiceSid: WELL_KNOWN_SID_TYPE = 24

public val WinNetworkSid: WELL_KNOWN_SID_TYPE = 9

public val WinNewEnterpriseReadonlyControllersSid: WELL_KNOWN_SID_TYPE = 77

public val WinNonCacheablePrincipalsGroupSid: WELL_KNOWN_SID_TYPE = 73

public val WinNtAuthoritySid: WELL_KNOWN_SID_TYPE = 7

public val WinNullSid: WELL_KNOWN_SID_TYPE = 0

public val WinOtherOrganizationSid: WELL_KNOWN_SID_TYPE = 55

public val WinProxySid: WELL_KNOWN_SID_TYPE = 14

public val WinRemoteLogonIdSid: WELL_KNOWN_SID_TYPE = 20

public val WinRestrictedCodeSid: WELL_KNOWN_SID_TYPE = 18

public val WinSChannelAuthenticationSid: WELL_KNOWN_SID_TYPE = 53

public val WinSelfSid: WELL_KNOWN_SID_TYPE = 16

public val WinServiceSid: WELL_KNOWN_SID_TYPE = 12

public val WinSystemLabelSid: WELL_KNOWN_SID_TYPE = 69

public val WinTerminalServerSid: WELL_KNOWN_SID_TYPE = 19

public val WinThisOrganizationCertificateSid: WELL_KNOWN_SID_TYPE = 82

public val WinThisOrganizationSid: WELL_KNOWN_SID_TYPE = 54

public val WinUntrustedLabelSid: WELL_KNOWN_SID_TYPE = 65

public val WinUserModeDriversSid: WELL_KNOWN_SID_TYPE = 98

public val WinWorldSid: WELL_KNOWN_SID_TYPE = 1

public val WinWriteRestrictedCodeSid: WELL_KNOWN_SID_TYPE = 70

public val cwcFILENAMESUFFIXMAX: UInt = 20u

public val cwcHRESULTSTRING: UInt = 40u

public val szLBRACE: PCSTR = s("{")

public val szLPAREN: PCSTR = s("(")

public val szRBRACE: PCSTR = s("}")

public val szRPAREN: PCSTR = s(")")

public val wszCERTENROLLSHAREPATH: PCWSTR = w("CertSrv\\CertEnroll")

public val wszFCSAPARM_CERTFILENAMESUFFIX: PCWSTR = w("%4")

public val wszFCSAPARM_CONFIGDN: PCWSTR = w("%6")

public val wszFCSAPARM_CRLDELTAFILENAMESUFFIX: PCWSTR = w("%9")

public val wszFCSAPARM_CRLFILENAMESUFFIX: PCWSTR = w("%8")

public val wszFCSAPARM_DOMAINDN: PCWSTR = w("%5")

public val wszFCSAPARM_DSCACERTATTRIBUTE: PCWSTR = w("%11")

public val wszFCSAPARM_DSCRLATTRIBUTE: PCWSTR = w("%10")

public val wszFCSAPARM_DSCROSSCERTPAIRATTRIBUTE: PCWSTR = w("%14")

public val wszFCSAPARM_DSKRACERTATTRIBUTE: PCWSTR = w("%13")

public val wszFCSAPARM_DSUSERCERTATTRIBUTE: PCWSTR = w("%12")

public val wszFCSAPARM_SANITIZEDCANAME: PCWSTR = w("%3")

public val wszFCSAPARM_SANITIZEDCANAMEHASH: PCWSTR = w("%7")

public val wszFCSAPARM_SERVERDNSNAME: PCWSTR = w("%1")

public val wszFCSAPARM_SERVERSHORTNAME: PCWSTR = w("%2")

public val wszLBRACE: PCWSTR = w("{")

public val wszLPAREN: PCWSTR = w("(")

public val wszRBRACE: PCWSTR = w("}")

public val wszRPAREN: PCWSTR = w(")")
