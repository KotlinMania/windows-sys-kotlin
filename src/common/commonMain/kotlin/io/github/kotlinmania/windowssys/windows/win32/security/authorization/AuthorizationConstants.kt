package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACCCTRL_DEFAULT_PROVIDER: Pcwstr = w("Windows NT Access Provider")

public val ACCCTRL_DEFAULT_PROVIDERA: Pcstr = s("Windows NT Access Provider")

public val ACCCTRL_DEFAULT_PROVIDERW: Pcwstr = w("Windows NT Access Provider")

public val ACTRL_ACCESS_ALLOWED: ActrlAccessEntryAccessFlags = 1u

public val ACTRL_ACCESS_DENIED: ActrlAccessEntryAccessFlags = 2u

public val ACTRL_ACCESS_NO_OPTIONS: UInt = 0u

public val ACTRL_ACCESS_PROTECTED: UInt = 1u

public val ACTRL_ACCESS_SUPPORTS_OBJECT_ENTRIES: UInt = 1u

public val ACTRL_AUDIT_FAILURE: ActrlAccessEntryAccessFlags = 8u

public val ACTRL_AUDIT_SUCCESS: ActrlAccessEntryAccessFlags = 4u

public val ACTRL_CHANGE_ACCESS: UInt = 536870912u

public val ACTRL_CHANGE_OWNER: UInt = 1073741824u

public val ACTRL_DELETE: UInt = 134217728u

public val ACTRL_DIR_CREATE_CHILD: UInt = 4u

public val ACTRL_DIR_CREATE_OBJECT: UInt = 2u

public val ACTRL_DIR_DELETE_CHILD: UInt = 64u

public val ACTRL_DIR_LIST: UInt = 1u

public val ACTRL_DIR_TRAVERSE: UInt = 32u

public val ACTRL_FILE_APPEND: UInt = 4u

public val ACTRL_FILE_CREATE_PIPE: UInt = 512u

public val ACTRL_FILE_EXECUTE: UInt = 32u

public val ACTRL_FILE_READ: UInt = 1u

public val ACTRL_FILE_READ_ATTRIB: UInt = 128u

public val ACTRL_FILE_READ_PROP: UInt = 8u

public val ACTRL_FILE_WRITE: UInt = 2u

public val ACTRL_FILE_WRITE_ATTRIB: UInt = 256u

public val ACTRL_FILE_WRITE_PROP: UInt = 16u

public val ACTRL_KERNEL_ALERT: UInt = 1024u

public val ACTRL_KERNEL_CONTROL: UInt = 512u

public val ACTRL_KERNEL_DIMPERSONATE: UInt = 32768u

public val ACTRL_KERNEL_DUP_HANDLE: UInt = 32u

public val ACTRL_KERNEL_GET_CONTEXT: UInt = 2048u

public val ACTRL_KERNEL_GET_INFO: UInt = 256u

public val ACTRL_KERNEL_IMPERSONATE: UInt = 16384u

public val ACTRL_KERNEL_PROCESS: UInt = 64u

public val ACTRL_KERNEL_SET_CONTEXT: UInt = 4096u

public val ACTRL_KERNEL_SET_INFO: UInt = 128u

public val ACTRL_KERNEL_TERMINATE: UInt = 1u

public val ACTRL_KERNEL_THREAD: UInt = 2u

public val ACTRL_KERNEL_TOKEN: UInt = 8192u

public val ACTRL_KERNEL_VM: UInt = 4u

public val ACTRL_KERNEL_VM_READ: UInt = 8u

public val ACTRL_KERNEL_VM_WRITE: UInt = 16u

public val ACTRL_PERM_1: UInt = 1u

public val ACTRL_PERM_10: UInt = 512u

public val ACTRL_PERM_11: UInt = 1024u

public val ACTRL_PERM_12: UInt = 2048u

public val ACTRL_PERM_13: UInt = 4096u

public val ACTRL_PERM_14: UInt = 8192u

public val ACTRL_PERM_15: UInt = 16384u

public val ACTRL_PERM_16: UInt = 32768u

public val ACTRL_PERM_17: UInt = 65536u

public val ACTRL_PERM_18: UInt = 131072u

public val ACTRL_PERM_19: UInt = 262144u

public val ACTRL_PERM_2: UInt = 2u

public val ACTRL_PERM_20: UInt = 524288u

public val ACTRL_PERM_3: UInt = 4u

public val ACTRL_PERM_4: UInt = 8u

public val ACTRL_PERM_5: UInt = 16u

public val ACTRL_PERM_6: UInt = 32u

public val ACTRL_PERM_7: UInt = 64u

public val ACTRL_PERM_8: UInt = 128u

public val ACTRL_PERM_9: UInt = 256u

public val ACTRL_PRINT_JADMIN: UInt = 16u

public val ACTRL_PRINT_PADMIN: UInt = 4u

public val ACTRL_PRINT_PUSE: UInt = 8u

public val ACTRL_PRINT_SADMIN: UInt = 1u

public val ACTRL_PRINT_SLIST: UInt = 2u

public val ACTRL_READ_CONTROL: UInt = 268435456u

public val ACTRL_REG_CREATE_CHILD: UInt = 4u

public val ACTRL_REG_LINK: UInt = 32u

public val ACTRL_REG_LIST: UInt = 8u

public val ACTRL_REG_NOTIFY: UInt = 16u

public val ACTRL_REG_QUERY: UInt = 1u

public val ACTRL_REG_SET: UInt = 2u

public val ACTRL_RESERVED: UInt = 0u

public val ACTRL_STD_RIGHTS_ALL: UInt = 4160749568u

public val ACTRL_SVC_GET_INFO: UInt = 1u

public val ACTRL_SVC_INTERROGATE: UInt = 128u

public val ACTRL_SVC_LIST: UInt = 8u

public val ACTRL_SVC_PAUSE: UInt = 64u

public val ACTRL_SVC_SET_INFO: UInt = 2u

public val ACTRL_SVC_START: UInt = 16u

public val ACTRL_SVC_STATUS: UInt = 4u

public val ACTRL_SVC_STOP: UInt = 32u

public val ACTRL_SVC_UCONTROL: UInt = 256u

public val ACTRL_SYNCHRONIZE: UInt = 2147483648u

public val ACTRL_SYSTEM_ACCESS: UInt = 67108864u

public val ACTRL_WIN_CLIPBRD: UInt = 1u

public val ACTRL_WIN_CREATE: UInt = 4u

public val ACTRL_WIN_EXIT: UInt = 256u

public val ACTRL_WIN_GLOBAL_ATOMS: UInt = 2u

public val ACTRL_WIN_LIST: UInt = 16u

public val ACTRL_WIN_LIST_DESK: UInt = 8u

public val ACTRL_WIN_READ_ATTRIBS: UInt = 32u

public val ACTRL_WIN_SCREEN: UInt = 128u

public val ACTRL_WIN_WRITE_ATTRIBS: UInt = 64u

public val APF_AUDIT_FAILURE: UInt = 0u

public val APF_AUDIT_SUCCESS: UInt = 1u

public val APF_VALID_FLAGS: UInt = 1u

public val APT_GUID: AuditParamType = 9

public val APT_INT64: AuditParamType = 11

public val APT_IP_ADDRESS: AuditParamType = 12

public val APT_LOGON_ID: AuditParamType = 6

public val APT_LOGON_ID_WITH_SID: AuditParamType = 13

public val APT_LUID: AuditParamType = 8

public val APT_NONE: AuditParamType = 1

public val APT_OBJECT_TYPE_LIST: AuditParamType = 7

public val APT_POINTER: AuditParamType = 4

public val APT_SID: AuditParamType = 5

public val APT_STRING: AuditParamType = 2

public val APT_TIME: AuditParamType = 10

public val APT_ULONG: AuditParamType = 3

public val AP_PARAM_TYPE_BITS: UInt = 8u

public val AP_PARAM_TYPE_MASK: Int = 255

public val AUDIT_TYPE_LEGACY: UInt = 1u

public val AUDIT_TYPE_WMI: UInt = 2u

public val AUTHZP_WPD_EVENT: UInt = 16u

public val AUTHZ_ACCESS_CHECK_NO_DEEP_COPY_SD: AuthzAccessCheckFlags = 1u

public val AUTHZ_ALLOW_MULTIPLE_SOURCE_INSTANCES: UInt = 1u

public val AUTHZ_AUDIT_INSTANCE_INFORMATION: UInt = 2u

public val AUTHZ_COMPUTE_PRIVILEGES: UInt = 8u

public val AUTHZ_FLAG_ALLOW_MULTIPLE_SOURCE_INSTANCES: UInt = 1u

public val AUTHZ_GENERATE_FAILURE_AUDIT: AuthzGenerateResults = 2u

public val AUTHZ_GENERATE_SUCCESS_AUDIT: AuthzGenerateResults = 1u

public val AUTHZ_INIT_INFO_VERSION_V1: UInt = 1u

public val AUTHZ_MIGRATED_LEGACY_PUBLISHER: UInt = 2u

public val AUTHZ_NO_ALLOC_STRINGS: AuthzInitializeObjectAccessAuditEventFlags = 4u

public val AUTHZ_NO_FAILURE_AUDIT: AuthzInitializeObjectAccessAuditEventFlags = 2u

public val AUTHZ_NO_SUCCESS_AUDIT: AuthzInitializeObjectAccessAuditEventFlags = 1u

public val AUTHZ_REQUIRE_S4U_LOGON: UInt = 4u

public val AUTHZ_RM_FLAG_INITIALIZE_UNDER_IMPERSONATION: AuthzResourceManagerFlags = 2u

public val AUTHZ_RM_FLAG_NO_AUDIT: AuthzResourceManagerFlags = 1u

public val AUTHZ_RM_FLAG_NO_CENTRAL_ACCESS_POLICIES: AuthzResourceManagerFlags = 4u

public val AUTHZ_RPC_INIT_INFO_CLIENT_VERSION_V1: UInt = 1u

public val AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_VERSION: UInt = 1u

public val AUTHZ_SECURITY_ATTRIBUTES_INFORMATION_VERSION_V1: UInt = 1u

public val AUTHZ_SECURITY_ATTRIBUTE_NON_INHERITABLE: AuthzSecurityAttributeFlags = 1u

public val AUTHZ_SECURITY_ATTRIBUTE_OPERATION_ADD: AuthzSecurityAttributeOperation = 2

public val AUTHZ_SECURITY_ATTRIBUTE_OPERATION_DELETE: AuthzSecurityAttributeOperation = 3

public val AUTHZ_SECURITY_ATTRIBUTE_OPERATION_NONE: AuthzSecurityAttributeOperation = 0

public val AUTHZ_SECURITY_ATTRIBUTE_OPERATION_REPLACE: AuthzSecurityAttributeOperation = 4

public val AUTHZ_SECURITY_ATTRIBUTE_OPERATION_REPLACE_ALL: AuthzSecurityAttributeOperation = 1

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_BOOLEAN: UInt = 6u

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_FQBN: UInt = 4u

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_INT64: UInt = 1u

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_INVALID: UInt = 0u

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_OCTET_STRING: UInt = 16u

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_SID: UInt = 5u

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_STRING: UInt = 3u

public val AUTHZ_SECURITY_ATTRIBUTE_TYPE_UINT64: UInt = 2u

public val AUTHZ_SECURITY_ATTRIBUTE_VALUE_CASE_SENSITIVE: AuthzSecurityAttributeFlags = 2u

public val AUTHZ_SID_OPERATION_ADD: AuthzSidOperation = 2

public val AUTHZ_SID_OPERATION_DELETE: AuthzSidOperation = 3

public val AUTHZ_SID_OPERATION_NONE: AuthzSidOperation = 0

public val AUTHZ_SID_OPERATION_REPLACE: AuthzSidOperation = 4

public val AUTHZ_SID_OPERATION_REPLACE_ALL: AuthzSidOperation = 1

public val AUTHZ_SKIP_TOKEN_GROUPS: UInt = 2u

public val AUTHZ_WPD_CATEGORY_FLAG: UInt = 16u

public val AZ_AZSTORE_DEFAULT_DOMAIN_TIMEOUT: AzPropConstants = 15000

public val AZ_AZSTORE_DEFAULT_MAX_SCRIPT_ENGINES: AzPropConstants = 120

public val AZ_AZSTORE_DEFAULT_SCRIPT_ENGINE_TIMEOUT: AzPropConstants = 45000

public val AZ_AZSTORE_FLAG_AUDIT_IS_CRITICAL: AzPropConstants = 8

public val AZ_AZSTORE_FLAG_BATCH_UPDATE: AzPropConstants = 4

public val AZ_AZSTORE_FLAG_CREATE: AzPropConstants = 1

public val AZ_AZSTORE_FLAG_MANAGE_ONLY_PASSIVE_SUBMIT: AzPropConstants = 32768

public val AZ_AZSTORE_FLAG_MANAGE_STORE_ONLY: AzPropConstants = 2

public val AZ_AZSTORE_FORCE_APPLICATION_CLOSE: AzPropConstants = 16

public val AZ_AZSTORE_MIN_DOMAIN_TIMEOUT: AzPropConstants = 500

public val AZ_AZSTORE_MIN_SCRIPT_ENGINE_TIMEOUT: AzPropConstants = 5000

public val AZ_AZSTORE_NT6_FUNCTION_LEVEL: AzPropConstants = 32

public val AZ_CLIENT_CONTEXT_GET_GROUPS_STORE_LEVEL_ONLY: AzPropConstants = 2

public val AZ_CLIENT_CONTEXT_GET_GROUP_RECURSIVE: AzPropConstants = 2

public val AZ_CLIENT_CONTEXT_SKIP_GROUP: AzPropConstants = 1

public val AZ_CLIENT_CONTEXT_SKIP_LDAP_QUERY: AzPropConstants = 1

public val AZ_GROUPTYPE_BASIC: AzPropConstants = 2

public val AZ_GROUPTYPE_BIZRULE: AzPropConstants = 3

public val AZ_GROUPTYPE_LDAP_QUERY: AzPropConstants = 1

public val AZ_MAX_APPLICATION_DATA_LENGTH: AzPropConstants = 4096

public val AZ_MAX_APPLICATION_NAME_LENGTH: AzPropConstants = 512

public val AZ_MAX_APPLICATION_VERSION_LENGTH: AzPropConstants = 512

public val AZ_MAX_BIZRULE_STRING: AzPropConstants = 65536

public val AZ_MAX_DESCRIPTION_LENGTH: AzPropConstants = 1024

public val AZ_MAX_GROUP_BIZRULE_IMPORTED_PATH_LENGTH: AzPropConstants = 512

public val AZ_MAX_GROUP_BIZRULE_LANGUAGE_LENGTH: AzPropConstants = 64

public val AZ_MAX_GROUP_BIZRULE_LENGTH: AzPropConstants = 65536

public val AZ_MAX_GROUP_LDAP_QUERY_LENGTH: AzPropConstants = 4096

public val AZ_MAX_GROUP_NAME_LENGTH: AzPropConstants = 64

public val AZ_MAX_NAME_LENGTH: AzPropConstants = 65536

public val AZ_MAX_OPERATION_NAME_LENGTH: AzPropConstants = 64

public val AZ_MAX_POLICY_URL_LENGTH: AzPropConstants = 65536

public val AZ_MAX_ROLE_NAME_LENGTH: AzPropConstants = 64

public val AZ_MAX_SCOPE_NAME_LENGTH: AzPropConstants = 65536

public val AZ_MAX_TASK_BIZRULE_IMPORTED_PATH_LENGTH: AzPropConstants = 512

public val AZ_MAX_TASK_BIZRULE_LANGUAGE_LENGTH: AzPropConstants = 64

public val AZ_MAX_TASK_BIZRULE_LENGTH: AzPropConstants = 65536

public val AZ_MAX_TASK_NAME_LENGTH: AzPropConstants = 64

public val AZ_PROP_APPLICATION_AUTHZ_INTERFACE_CLSID: AzPropConstants = 800

public val AZ_PROP_APPLICATION_BIZRULE_ENABLED: AzPropConstants = 803

public val AZ_PROP_APPLICATION_DATA: AzPropConstants = 4

public val AZ_PROP_APPLICATION_NAME: AzPropConstants = 802

public val AZ_PROP_APPLICATION_VERSION: AzPropConstants = 801

public val AZ_PROP_APPLY_STORE_SACL: AzPropConstants = 900

public val AZ_PROP_AZSTORE_DOMAIN_TIMEOUT: AzPropConstants = 100

public val AZ_PROP_AZSTORE_MAJOR_VERSION: AzPropConstants = 103

public val AZ_PROP_AZSTORE_MAX_SCRIPT_ENGINES: AzPropConstants = 102

public val AZ_PROP_AZSTORE_MINOR_VERSION: AzPropConstants = 104

public val AZ_PROP_AZSTORE_SCRIPT_ENGINE_TIMEOUT: AzPropConstants = 101

public val AZ_PROP_AZSTORE_TARGET_MACHINE: AzPropConstants = 105

public val AZ_PROP_AZTORE_IS_ADAM_INSTANCE: AzPropConstants = 106

public val AZ_PROP_CHILD_CREATE: AzPropConstants = 5

public val AZ_PROP_CLIENT_CONTEXT_LDAP_QUERY_DN: AzPropConstants = 709

public val AZ_PROP_CLIENT_CONTEXT_ROLE_FOR_ACCESS_CHECK: AzPropConstants = 708

public val AZ_PROP_CLIENT_CONTEXT_USER_CANONICAL: AzPropConstants = 704

public val AZ_PROP_CLIENT_CONTEXT_USER_DISPLAY: AzPropConstants = 702

public val AZ_PROP_CLIENT_CONTEXT_USER_DN: AzPropConstants = 700

public val AZ_PROP_CLIENT_CONTEXT_USER_DNS_SAM_COMPAT: AzPropConstants = 707

public val AZ_PROP_CLIENT_CONTEXT_USER_GUID: AzPropConstants = 703

public val AZ_PROP_CLIENT_CONTEXT_USER_SAM_COMPAT: AzPropConstants = 701

public val AZ_PROP_CLIENT_CONTEXT_USER_UPN: AzPropConstants = 705

public val AZ_PROP_DELEGATED_POLICY_USERS: AzPropConstants = 904

public val AZ_PROP_DELEGATED_POLICY_USERS_NAME: AzPropConstants = 907

public val AZ_PROP_DESCRIPTION: AzPropConstants = 2

public val AZ_PROP_GENERATE_AUDITS: AzPropConstants = 901

public val AZ_PROP_GROUP_APP_MEMBERS: AzPropConstants = 401

public val AZ_PROP_GROUP_APP_NON_MEMBERS: AzPropConstants = 402

public val AZ_PROP_GROUP_BIZRULE: AzPropConstants = 408

public val AZ_PROP_GROUP_BIZRULE_IMPORTED_PATH: AzPropConstants = 410

public val AZ_PROP_GROUP_BIZRULE_LANGUAGE: AzPropConstants = 409

public val AZ_PROP_GROUP_LDAP_QUERY: AzPropConstants = 403

public val AZ_PROP_GROUP_MEMBERS: AzPropConstants = 404

public val AZ_PROP_GROUP_MEMBERS_NAME: AzPropConstants = 406

public val AZ_PROP_GROUP_NON_MEMBERS: AzPropConstants = 405

public val AZ_PROP_GROUP_NON_MEMBERS_NAME: AzPropConstants = 407

public val AZ_PROP_GROUP_TYPE: AzPropConstants = 400

public val AZ_PROP_NAME: AzPropConstants = 1

public val AZ_PROP_OPERATION_ID: AzPropConstants = 200

public val AZ_PROP_POLICY_ADMINS: AzPropConstants = 902

public val AZ_PROP_POLICY_ADMINS_NAME: AzPropConstants = 905

public val AZ_PROP_POLICY_READERS: AzPropConstants = 903

public val AZ_PROP_POLICY_READERS_NAME: AzPropConstants = 906

public val AZ_PROP_ROLE_APP_MEMBERS: AzPropConstants = 500

public val AZ_PROP_ROLE_MEMBERS: AzPropConstants = 501

public val AZ_PROP_ROLE_MEMBERS_NAME: AzPropConstants = 505

public val AZ_PROP_ROLE_OPERATIONS: AzPropConstants = 502

public val AZ_PROP_ROLE_TASKS: AzPropConstants = 504

public val AZ_PROP_SCOPE_BIZRULES_WRITABLE: AzPropConstants = 600

public val AZ_PROP_SCOPE_CAN_BE_DELEGATED: AzPropConstants = 601

public val AZ_PROP_TASK_BIZRULE: AzPropConstants = 301

public val AZ_PROP_TASK_BIZRULE_IMPORTED_PATH: AzPropConstants = 304

public val AZ_PROP_TASK_BIZRULE_LANGUAGE: AzPropConstants = 302

public val AZ_PROP_TASK_IS_ROLE_DEFINITION: AzPropConstants = 305

public val AZ_PROP_TASK_OPERATIONS: AzPropConstants = 300

public val AZ_PROP_TASK_TASKS: AzPropConstants = 303

public val AZ_PROP_WRITABLE: AzPropConstants = 3

public val AZ_SUBMIT_FLAG_ABORT: AzPropConstants = 1

public val AZ_SUBMIT_FLAG_FLUSH: AzPropConstants = 2

public val AUTHZ_AUDIT_EVENT_INFO_ADDITIONAL_INFO: AuthzAuditEventInformationClass = 5

public val AUTHZ_AUDIT_EVENT_INFO_FLAGS: AuthzAuditEventInformationClass = 1

public val AUTHZ_AUDIT_EVENT_INFO_OBJECT_NAME: AuthzAuditEventInformationClass = 4

public val AUTHZ_AUDIT_EVENT_INFO_OBJECT_TYPE: AuthzAuditEventInformationClass = 3

public val AUTHZ_AUDIT_EVENT_INFO_OPERATION_TYPE: AuthzAuditEventInformationClass = 2

public val AUTHZ_CONTEXT_INFO_ALL: AuthzContextInformationClass = 9

public val AUTHZ_CONTEXT_INFO_APP_CONTAINER_SID: AuthzContextInformationClass = 15

public val AUTHZ_CONTEXT_INFO_AUTHENTICATION_ID: AuthzContextInformationClass = 10

public val AUTHZ_CONTEXT_INFO_CAPABILITY_SIDS: AuthzContextInformationClass = 16

public val AUTHZ_CONTEXT_INFO_DEVICE_CLAIMS: AuthzContextInformationClass = 14

public val AUTHZ_CONTEXT_INFO_DEVICE_SIDS: AuthzContextInformationClass = 12

public val AUTHZ_CONTEXT_INFO_EXPIRATION_TIME: AuthzContextInformationClass = 5

public val AUTHZ_CONTEXT_INFO_GROUPS_SIDS: AuthzContextInformationClass = 2

public val AUTHZ_CONTEXT_INFO_IDENTIFIER: AuthzContextInformationClass = 7

public val AUTHZ_CONTEXT_INFO_PRIVILEGES: AuthzContextInformationClass = 4

public val AUTHZ_CONTEXT_INFO_RESTRICTED_SIDS: AuthzContextInformationClass = 3

public val AUTHZ_CONTEXT_INFO_SECURITY_ATTRIBUTES: AuthzContextInformationClass = 11

public val AUTHZ_CONTEXT_INFO_SERVER_CONTEXT: AuthzContextInformationClass = 6

public val AUTHZ_CONTEXT_INFO_SOURCE: AuthzContextInformationClass = 8

public val AUTHZ_CONTEXT_INFO_USER_CLAIMS: AuthzContextInformationClass = 13

public val AUTHZ_CONTEXT_INFO_USER_SID: AuthzContextInformationClass = 1

public val AZ_AUTHORIZATION_STORE: Guid = Guid.fromU128(U128(0xb2bcff59a7574b0buL, 0xa1bcea69981da69euL))

public val AZ_BIZ_RULE_CONTEXT: Guid = Guid.fromU128(U128(0x5c2dc96f8d51434buL, 0xb33c379bccae77c3uL))

public val AZ_PRINCIPAL_LOCATOR: Guid = Guid.fromU128(U128(0x483afb5d70df4e16uL, 0xabdca1de4d015a3euL))

public val DENY_ACCESS: AccessMode = 3

public val GRANT_ACCESS: AccessMode = 1

public val INHERITED_ACCESS_ENTRY: UInt = 16u

public val INHERITED_GRANDPARENT: UInt = 536870912u

public val INHERITED_PARENT: UInt = 268435456u

public val NOT_USED_ACCESS: AccessMode = 0

public val NO_MULTIPLE_TRUSTEE: MultipleTrusteeOperation = 0

public val OLESCRIPT_E_SYNTAX: Hresult = 0x80020101u.toInt()

public val PROGRESS_CANCEL_OPERATION: ProgInvokeSetting = 4

public val PROGRESS_INVOKE_EVERY_OBJECT: ProgInvokeSetting = 2

public val PROGRESS_INVOKE_NEVER: ProgInvokeSetting = 1

public val PROGRESS_INVOKE_ON_ERROR: ProgInvokeSetting = 3

public val PROGRESS_INVOKE_PRE_POST_ERROR: ProgInvokeSetting = 6

public val PROGRESS_RETRY_OPERATION: ProgInvokeSetting = 5

public val REVOKE_ACCESS: AccessMode = 4

public val SDDL_ACCESS_ALLOWED: Pcwstr = w("A")

public val SDDL_ACCESS_CONTROL_ASSISTANCE_OPS: Pcwstr = w("AA")

public val SDDL_ACCESS_DENIED: Pcwstr = w("D")

public val SDDL_ACCESS_FILTER: Pcwstr = w("FL")

public val SDDL_ACCOUNT_OPERATORS: Pcwstr = w("AO")

public val SDDL_ACE_BEGIN: Pcwstr = w("(")

public val SDDL_ACE_COND_ATTRIBUTE_PREFIX: Pcwstr = w("@")

public val SDDL_ACE_COND_BEGIN: Pcwstr = w("(")

public val SDDL_ACE_COND_BLOB_PREFIX: Pcwstr = w("#")

public val SDDL_ACE_COND_DEVICE_ATTRIBUTE_PREFIX: Pcwstr = w("@DEVICE.")

public val SDDL_ACE_COND_END: Pcwstr = w(")")

public val SDDL_ACE_COND_RESOURCE_ATTRIBUTE_PREFIX: Pcwstr = w("@RESOURCE.")

public val SDDL_ACE_COND_SID_PREFIX: Pcwstr = w("SID")

public val SDDL_ACE_COND_TOKEN_ATTRIBUTE_PREFIX: Pcwstr = w("@TOKEN.")

public val SDDL_ACE_COND_USER_ATTRIBUTE_PREFIX: Pcwstr = w("@USER.")

public val SDDL_ACE_END: Pcwstr = w(")")

public val SDDL_ALARM: Pcwstr = w("AL")

public val SDDL_ALIAS_PREW2KCOMPACC: Pcwstr = w("RU")

public val SDDL_ALIAS_SIZE: UInt = 2u

public val SDDL_ALL_APP_PACKAGES: Pcwstr = w("AC")

public val SDDL_ANONYMOUS: Pcwstr = w("AN")

public val SDDL_AUDIT: Pcwstr = w("AU")

public val SDDL_AUDIT_FAILURE: Pcwstr = w("FA")

public val SDDL_AUDIT_SUCCESS: Pcwstr = w("SA")

public val SDDL_AUTHENTICATED_USERS: Pcwstr = w("AU")

public val SDDL_AUTHORITY_ASSERTED: Pcwstr = w("AS")

public val SDDL_AUTO_INHERITED: Pcwstr = w("AI")

public val SDDL_AUTO_INHERIT_REQ: Pcwstr = w("AR")

public val SDDL_BACKUP_OPERATORS: Pcwstr = w("BO")

public val SDDL_BLOB: Pcwstr = w("TX")

public val SDDL_BOOLEAN: Pcwstr = w("TB")

public val SDDL_BUILTIN_ADMINISTRATORS: Pcwstr = w("BA")

public val SDDL_BUILTIN_GUESTS: Pcwstr = w("BG")

public val SDDL_BUILTIN_USERS: Pcwstr = w("BU")

public val SDDL_CALLBACK_ACCESS_ALLOWED: Pcwstr = w("XA")

public val SDDL_CALLBACK_ACCESS_DENIED: Pcwstr = w("XD")

public val SDDL_CALLBACK_AUDIT: Pcwstr = w("XU")

public val SDDL_CALLBACK_OBJECT_ACCESS_ALLOWED: Pcwstr = w("ZA")

public val SDDL_CERTSVC_DCOM_ACCESS: Pcwstr = w("CD")

public val SDDL_CERT_SERV_ADMINISTRATORS: Pcwstr = w("CA")

public val SDDL_CLONEABLE_CONTROLLERS: Pcwstr = w("CN")

public val SDDL_CONTAINER_INHERIT: Pcwstr = w("CI")

public val SDDL_CONTROL_ACCESS: Pcwstr = w("CR")

public val SDDL_CREATE_CHILD: Pcwstr = w("CC")

public val SDDL_CREATOR_GROUP: Pcwstr = w("CG")

public val SDDL_CREATOR_OWNER: Pcwstr = w("CO")

public val SDDL_CRITICAL: Pcwstr = w("CR")

public val SDDL_CRYPTO_OPERATORS: Pcwstr = w("CY")

public val SDDL_DACL: Pcwstr = w("D")

public val SDDL_DELETE_CHILD: Pcwstr = w("DC")

public val SDDL_DELETE_TREE: Pcwstr = w("DT")

public val SDDL_DELIMINATOR: Pcwstr = w(":")

public val SDDL_DOMAIN_ADMINISTRATORS: Pcwstr = w("DA")

public val SDDL_DOMAIN_COMPUTERS: Pcwstr = w("DC")

public val SDDL_DOMAIN_DOMAIN_CONTROLLERS: Pcwstr = w("DD")

public val SDDL_DOMAIN_GUESTS: Pcwstr = w("DG")

public val SDDL_DOMAIN_USERS: Pcwstr = w("DU")

public val SDDL_ENTERPRISE_ADMINS: Pcwstr = w("EA")

public val SDDL_ENTERPRISE_DOMAIN_CONTROLLERS: Pcwstr = w("ED")

public val SDDL_ENTERPRISE_KEY_ADMINS: Pcwstr = w("EK")

public val SDDL_ENTERPRISE_RO_D_CS: Pcwstr = w("RO")

public val SDDL_EVENT_LOG_READERS: Pcwstr = w("ER")

public val SDDL_EVERYONE: Pcwstr = w("WD")

public val SDDL_FILE_ALL: Pcwstr = w("FA")

public val SDDL_FILE_EXECUTE: Pcwstr = w("FX")

public val SDDL_FILE_READ: Pcwstr = w("FR")

public val SDDL_FILE_WRITE: Pcwstr = w("FW")

public val SDDL_GENERIC_ALL: Pcwstr = w("GA")

public val SDDL_GENERIC_EXECUTE: Pcwstr = w("GX")

public val SDDL_GENERIC_READ: Pcwstr = w("GR")

public val SDDL_GENERIC_WRITE: Pcwstr = w("GW")

public val SDDL_GROUP: Pcwstr = w("G")

public val SDDL_GROUP_POLICY_ADMINS: Pcwstr = w("PA")

public val SDDL_HYPER_V_ADMINS: Pcwstr = w("HA")

public val SDDL_IIS_USERS: Pcwstr = w("IS")

public val SDDL_INHERITED: Pcwstr = w("ID")

public val SDDL_INHERIT_ONLY: Pcwstr = w("IO")

public val SDDL_INT: Pcwstr = w("TI")

public val SDDL_INTERACTIVE: Pcwstr = w("IU")

public val SDDL_KEY_ADMINS: Pcwstr = w("KA")

public val SDDL_KEY_ALL: Pcwstr = w("KA")

public val SDDL_KEY_EXECUTE: Pcwstr = w("KX")

public val SDDL_KEY_READ: Pcwstr = w("KR")

public val SDDL_KEY_WRITE: Pcwstr = w("KW")

public val SDDL_LIST_CHILDREN: Pcwstr = w("LC")

public val SDDL_LIST_OBJECT: Pcwstr = w("LO")

public val SDDL_LOCAL_ADMIN: Pcwstr = w("LA")

public val SDDL_LOCAL_GUEST: Pcwstr = w("LG")

public val SDDL_LOCAL_SERVICE: Pcwstr = w("LS")

public val SDDL_LOCAL_SYSTEM: Pcwstr = w("SY")

public val SDDL_MANDATORY_LABEL: Pcwstr = w("ML")

public val SDDL_ML_HIGH: Pcwstr = w("HI")

public val SDDL_ML_LOW: Pcwstr = w("LW")

public val SDDL_ML_MEDIUM: Pcwstr = w("ME")

public val SDDL_ML_MEDIUM_PLUS: Pcwstr = w("MP")

public val SDDL_ML_SYSTEM: Pcwstr = w("SI")

public val SDDL_NETWORK: Pcwstr = w("NU")

public val SDDL_NETWORK_CONFIGURATION_OPS: Pcwstr = w("NO")

public val SDDL_NETWORK_SERVICE: Pcwstr = w("NS")

public val SDDL_NO_EXECUTE_UP: Pcwstr = w("NX")

public val SDDL_NO_PROPAGATE: Pcwstr = w("NP")

public val SDDL_NO_READ_UP: Pcwstr = w("NR")

public val SDDL_NO_WRITE_UP: Pcwstr = w("NW")

public val SDDL_NULL_ACL: Pcwstr = w("NO_ACCESS_CONTROL")

public val SDDL_OBJECT_ACCESS_ALLOWED: Pcwstr = w("OA")

public val SDDL_OBJECT_ACCESS_DENIED: Pcwstr = w("OD")

public val SDDL_OBJECT_ALARM: Pcwstr = w("OL")

public val SDDL_OBJECT_AUDIT: Pcwstr = w("OU")

public val SDDL_OBJECT_INHERIT: Pcwstr = w("OI")

public val SDDL_OWNER: Pcwstr = w("O")

public val SDDL_OWNER_RIGHTS: Pcwstr = w("OW")

public val SDDL_PERFLOG_USERS: Pcwstr = w("LU")

public val SDDL_PERFMON_USERS: Pcwstr = w("MU")

public val SDDL_PERSONAL_SELF: Pcwstr = w("PS")

public val SDDL_POWER_USERS: Pcwstr = w("PU")

public val SDDL_PRINTER_OPERATORS: Pcwstr = w("PO")

public val SDDL_PROCESS_TRUST_LABEL: Pcwstr = w("TL")

public val SDDL_PROTECTED: Pcwstr = w("P")

public val SDDL_PROTECTED_USERS: Pcwstr = w("AP")

public val SDDL_RAS_SERVERS: Pcwstr = w("RS")

public val SDDL_RDS_ENDPOINT_SERVERS: Pcwstr = w("ES")

public val SDDL_RDS_MANAGEMENT_SERVERS: Pcwstr = w("MS")

public val SDDL_RDS_REMOTE_ACCESS_SERVERS: Pcwstr = w("RA")

public val SDDL_READ_CONTROL: Pcwstr = w("RC")

public val SDDL_READ_PROPERTY: Pcwstr = w("RP")

public val SDDL_REMOTE_DESKTOP: Pcwstr = w("RD")

public val SDDL_REMOTE_MANAGEMENT_USERS: Pcwstr = w("RM")

public val SDDL_REPLICATOR: Pcwstr = w("RE")

public val SDDL_RESOURCE_ATTRIBUTE: Pcwstr = w("RA")

public val SDDL_RESTRICTED_CODE: Pcwstr = w("RC")

public val SDDL_REVISION: UInt = 1u

public val SDDL_REVISION_1: UInt = 1u

public val SDDL_SACL: Pcwstr = w("S")

public val SDDL_SCHEMA_ADMINISTRATORS: Pcwstr = w("SA")

public val SDDL_SCOPED_POLICY_ID: Pcwstr = w("SP")

public val SDDL_SELF_WRITE: Pcwstr = w("SW")

public val SDDL_SEPERATOR: Pcwstr = w(";")

public val SDDL_SERVER_OPERATORS: Pcwstr = w("SO")

public val SDDL_SERVICE: Pcwstr = w("SU")

public val SDDL_SERVICE_ASSERTED: Pcwstr = w("SS")

public val SDDL_SID: Pcwstr = w("TD")

public val SDDL_SPACE: Pcwstr = w(" ")

public val SDDL_STANDARD_DELETE: Pcwstr = w("SD")

public val SDDL_TRUST_PROTECTED_FILTER: Pcwstr = w("TP")

public val SDDL_UINT: Pcwstr = w("TU")

public val SDDL_USER_MODE_DRIVERS: Pcwstr = w("UD")

public val SDDL_WRITE_DAC: Pcwstr = w("WD")

public val SDDL_WRITE_OWNER: Pcwstr = w("WO")

public val SDDL_WRITE_PROPERTY: Pcwstr = w("WP")

public val SDDL_WRITE_RESTRICTED_CODE: Pcwstr = w("WR")

public val SDDL_WSTRING: Pcwstr = w("TS")

public val SET_ACCESS: AccessMode = 2

public val SET_AUDIT_FAILURE: AccessMode = 6

public val SET_AUDIT_SUCCESS: AccessMode = 5

public val SE_DS_OBJECT: SeObjectType = 8

public val SE_DS_OBJECT_ALL: SeObjectType = 9

public val SE_FILE_OBJECT: SeObjectType = 1

public val SE_KERNEL_OBJECT: SeObjectType = 6

public val SE_LMSHARE: SeObjectType = 5

public val SE_PRINTER: SeObjectType = 3

public val SE_PROVIDER_DEFINED_OBJECT: SeObjectType = 10

public val SE_REGISTRY_KEY: SeObjectType = 4

public val SE_REGISTRY_WOW64_32KEY: SeObjectType = 12

public val SE_REGISTRY_WOW64_64KEY: SeObjectType = 13

public val SE_SERVICE: SeObjectType = 2

public val SE_UNKNOWN_OBJECT_TYPE: SeObjectType = 0

public val SE_WINDOW_OBJECT: SeObjectType = 7

public val SE_WMIGUID_OBJECT: SeObjectType = 11

public val TREE_SEC_INFO_RESET: TreeSecInfo = 2u

public val TREE_SEC_INFO_RESET_KEEP_EXPLICIT: TreeSecInfo = 3u

public val TREE_SEC_INFO_SET: TreeSecInfo = 1u

public val TRUSTEE_ACCESS_ALL: Int = -1

public val TRUSTEE_ACCESS_ALLOWED: Int = 1

public val TRUSTEE_ACCESS_EXPLICIT: Int = 1

public val TRUSTEE_ACCESS_READ: Int = 2

public val TRUSTEE_ACCESS_WRITE: Int = 4

public val TRUSTEE_BAD_FORM: TrusteeForm = 2

public val TRUSTEE_IS_ALIAS: TrusteeType = 4

public val TRUSTEE_IS_COMPUTER: TrusteeType = 8

public val TRUSTEE_IS_DELETED: TrusteeType = 6

public val TRUSTEE_IS_DOMAIN: TrusteeType = 3

public val TRUSTEE_IS_GROUP: TrusteeType = 2

public val TRUSTEE_IS_IMPERSONATE: MultipleTrusteeOperation = 1

public val TRUSTEE_IS_INVALID: TrusteeType = 7

public val TRUSTEE_IS_NAME: TrusteeForm = 1

public val TRUSTEE_IS_OBJECTS_AND_NAME: TrusteeForm = 4

public val TRUSTEE_IS_OBJECTS_AND_SID: TrusteeForm = 3

public val TRUSTEE_IS_SID: TrusteeForm = 0

public val TRUSTEE_IS_UNKNOWN: TrusteeType = 0

public val TRUSTEE_IS_USER: TrusteeType = 1

public val TRUSTEE_IS_WELL_KNOWN_GROUP: TrusteeType = 5

public val AUTHZ_SS_MAXSIZE: UInt = 128u
