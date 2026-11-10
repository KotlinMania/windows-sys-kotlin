package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val PRODUCT_XBOX_SCARLETTHOSTOS: UInt = 197u

public val PRODUCT_XBOX_SYSTEMOS: UInt = 192u

public val PC_TEB: UInt = 24u

public val PDATA_CR_CHAINED: Arm64FnpdataCr = 3

public val PDATA_CR_CHAINED_WITH_PAC: Arm64FnpdataCr = 2

public val PDATA_CR_UNCHAINED: Arm64FnpdataCr = 0

public val PDATA_CR_UNCHAINED_SAVED_LR: Arm64FnpdataCr = 1

public val PDATA_PACKED_UNWIND_FRAGMENT: Arm64FnpdataFlags = 2

public val PDATA_PACKED_UNWIND_FUNCTION: Arm64FnpdataFlags = 1

public val PDATA_REF_TO_FULL_XDATA: Arm64FnpdataFlags = 0

public val POWER_MONITOR_DIM: MonitorDisplayState = 2

public val POWER_MONITOR_OFF: MonitorDisplayState = 0

public val POWER_MONITOR_ON: MonitorDisplayState = 1

public val QUOTA_LIMITS_USE_DEFAULT_LIMITS: UInt = 16u

public val READ_THREAD_PROFILING_FLAG_DISPATCHING: UInt = 1u

public val READ_THREAD_PROFILING_FLAG_HARDWARE_COUNTERS: UInt = 2u

public val RECO_COPY: RecoFlags = 2u

public val RECO_CUT: RecoFlags = 3u

public val RECO_DRAG: RecoFlags = 4u

public val RECO_DROP: RecoFlags = 1u

public val RECO_PASTE: RecoFlags = 0u

public val REDBOOK_DIGITAL_AUDIO_EXTRACTION_INFO_VERSION: UInt = 1u

public val REG_APP_HIVE: Int = 16

public val REG_APP_HIVE_OPEN_READ_ONLY: Int = 8192

public val REG_BOOT_HIVE: Int = 1024

public val REG_FLUSH_HIVE_FILE_GROWTH: Int = 4096

public val REG_FORCE_UNLOAD: UInt = 1u

public val REG_HIVE_EXACT_FILE_GROWTH: Int = 128

public val REG_HIVE_NO_RM: Int = 256

public val REG_HIVE_SINGLE_LOG: Int = 512

public val REG_IMMUTABLE: Int = 16384

public val REG_LOAD_HIVE_OPEN_HANDLE: Int = 2048

public val REG_NO_IMPERSONATION_FALLBACK: Int = 32768

public val REG_NO_LAZY_FLUSH: Int = 4

public val REG_OPEN_READ_ONLY: Int = 8192

public val REG_PROCESS_PRIVATE: Int = 32

public val REG_REFRESH_HIVE: Int = 2

public val REG_START_JOURNAL: Int = 64

public val REG_UNLOAD_LEGAL_FLAGS: UInt = 1u

public val RESOURCEMANAGER_COMPLETE_PROPAGATION: UInt = 64u

public val RESOURCEMANAGER_ENLIST: UInt = 8u

public val RESOURCEMANAGER_GET_NOTIFICATION: UInt = 16u

public val RESOURCEMANAGER_QUERY_INFORMATION: UInt = 1u

public val RESOURCEMANAGER_RECOVER: UInt = 4u

public val RESOURCEMANAGER_REGISTER_PROTOCOL: UInt = 32u

public val RESOURCEMANAGER_SET_INFORMATION: UInt = 2u

public val ROT_COMPARE_MAX: UInt = 2048u

public val RTL_UMS_VERSION: UInt = 256u

public val RTL_VIRTUAL_UNWIND2_VALIDATE_PAC: UInt = 1u

public val RUNTIME_FUNCTION_INDIRECT: UInt = 1u

public val RECOGNIZER_TYPE: ServiceNodeType = 8

public val RESOURCE_MANAGER_BASIC_INFORMATION: ResourcemanagerInformationClass = 0

public val RESOURCE_MANAGER_COMPLETION_INFORMATION: ResourcemanagerInformationClass = 1

public val RUNLEVEL_INFORMATION_IN_ACTIVATION_CONTEXT: ActivationContextInfoClass = 5

public val SCRUB_DATA_INPUT_FLAG_IGNORE_REDUNDANCY: UInt = 8u

public val SCRUB_DATA_INPUT_FLAG_OPLOCK_NOT_ACQUIRED: UInt = 64u

public val SCRUB_DATA_INPUT_FLAG_RESUME: UInt = 1u

public val SCRUB_DATA_INPUT_FLAG_SCRUB_BY_OBJECT_ID: UInt = 32u

public val SCRUB_DATA_INPUT_FLAG_SKIP_DATA: UInt = 16u

public val SCRUB_DATA_INPUT_FLAG_SKIP_IN_SYNC: UInt = 2u

public val SCRUB_DATA_INPUT_FLAG_SKIP_NON_INTEGRITY_DATA: UInt = 4u

public val SCRUB_DATA_OUTPUT_FLAG_INCOMPLETE: UInt = 1u

public val SCRUB_DATA_OUTPUT_FLAG_NON_USER_DATA_RANGE: UInt = 65536u

public val SCRUB_DATA_OUTPUT_FLAG_PARITY_EXTENT_DATA_RETURNED: UInt = 131072u

public val SCRUB_DATA_OUTPUT_FLAG_RESUME_CONTEXT_LENGTH_SPECIFIED: UInt = 262144u

public val SECURITY_ANONYMOUS_LOGON_RID: Int = 7

public val SECURITY_APPPOOL_ID_BASE_RID: Int = 82

public val SECURITY_APPPOOL_ID_RID_COUNT: Int = 6

public val SECURITY_APP_PACKAGE_BASE_RID: Int = 2

public val SECURITY_APP_PACKAGE_RID_COUNT: Int = 8

public val SECURITY_AUTHENTICATED_USER_RID: Int = 11

public val SECURITY_AUTHENTICATION_AUTHORITY_ASSERTED_RID: Int = 1

public val SECURITY_AUTHENTICATION_AUTHORITY_RID_COUNT: Int = 1

public val SECURITY_AUTHENTICATION_FRESH_KEY_AUTH_RID: Int = 3

public val SECURITY_AUTHENTICATION_KEY_PROPERTY_ATTESTATION_RID: Int = 6

public val SECURITY_AUTHENTICATION_KEY_PROPERTY_MFA_RID: Int = 5

public val SECURITY_AUTHENTICATION_KEY_TRUST_RID: Int = 4

public val SECURITY_AUTHENTICATION_SERVICE_ASSERTED_RID: Int = 2

public val SECURITY_BATCH_RID: Int = 3

public val SECURITY_BUILTIN_APP_PACKAGE_RID_COUNT: Int = 2

public val SECURITY_BUILTIN_CAPABILITY_RID_COUNT: Int = 2

public val SECURITY_BUILTIN_DOMAIN_RID: Int = 32

public val SECURITY_BUILTIN_PACKAGE_ANY_PACKAGE: Int = 1

public val SECURITY_BUILTIN_PACKAGE_ANY_RESTRICTED_PACKAGE: Int = 2

public val SECURITY_CAPABILITY_APPOINTMENTS: Int = 11

public val SECURITY_CAPABILITY_APP_RID: Int = 1024

public val SECURITY_CAPABILITY_APP_SILO_RID: Int = 65536

public val SECURITY_CAPABILITY_BASE_RID: Int = 3

public val SECURITY_CAPABILITY_CONTACTS: Int = 12

public val SECURITY_CAPABILITY_DOCUMENTS_LIBRARY: Int = 7

public val SECURITY_CAPABILITY_ENTERPRISE_AUTHENTICATION: Int = 8

public val SECURITY_CAPABILITY_INTERNET_CLIENT: Int = 1

public val SECURITY_CAPABILITY_INTERNET_CLIENT_SERVER: Int = 2

public val SECURITY_CAPABILITY_INTERNET_EXPLORER: Int = 4096

public val SECURITY_CAPABILITY_MUSIC_LIBRARY: Int = 6

public val SECURITY_CAPABILITY_PICTURES_LIBRARY: Int = 4

public val SECURITY_CAPABILITY_PRIVATE_NETWORK_CLIENT_SERVER: Int = 3

public val SECURITY_CAPABILITY_REMOVABLE_STORAGE: Int = 10

public val SECURITY_CAPABILITY_RID_COUNT: Int = 5

public val SECURITY_CAPABILITY_SHARED_USER_CERTIFICATES: Int = 9

public val SECURITY_CAPABILITY_VIDEOS_LIBRARY: Int = 5

public val SECURITY_CCG_ID_BASE_RID: Int = 95

public val SECURITY_CHILD_PACKAGE_RID_COUNT: Int = 12

public val SECURITY_CLOUD_INFRASTRUCTURE_SERVICES_ID_BASE_RID: Int = 85

public val SECURITY_CLOUD_INFRASTRUCTURE_SERVICES_ID_RID_COUNT: Int = 6

public val SECURITY_COM_ID_BASE_RID: Int = 89

public val SECURITY_CREATOR_GROUP_RID: Int = 1

public val SECURITY_CREATOR_GROUP_SERVER_RID: Int = 3

public val SECURITY_CREATOR_OWNER_RID: Int = 0

public val SECURITY_CREATOR_OWNER_RIGHTS_RID: Int = 4

public val SECURITY_CREATOR_OWNER_SERVER_RID: Int = 2

public val SECURITY_CRED_TYPE_BASE_RID: Int = 65

public val SECURITY_CRED_TYPE_RID_COUNT: Int = 2

public val SECURITY_CRED_TYPE_THIS_ORG_CERT_RID: Int = 1

public val SECURITY_DASHOST_ID_BASE_RID: Int = 92

public val SECURITY_DASHOST_ID_RID_COUNT: Int = 6

public val SECURITY_DESCRIPTOR_REVISION: UInt = 1u

public val SECURITY_DESCRIPTOR_REVISION1: UInt = 1u

public val SECURITY_DIALUP_RID: Int = 1

public val SECURITY_ENTERPRISE_CONTROLLERS_RID: Int = 9

public val SECURITY_ENTERPRISE_READONLY_CONTROLLERS_RID: Int = 22

public val SECURITY_INSTALLER_CAPABILITY_RID_COUNT: UInt = 10u

public val SECURITY_INSTALLER_GROUP_CAPABILITY_BASE: UInt = 32u

public val SECURITY_INSTALLER_GROUP_CAPABILITY_RID_COUNT: UInt = 9u

public val SECURITY_INTERACTIVE_RID: Int = 4

public val SECURITY_IUSER_RID: Int = 17

public val SECURITY_LOCAL_ACCOUNT_AND_ADMIN_RID: Int = 114

public val SECURITY_LOCAL_ACCOUNT_RID: Int = 113

public val SECURITY_LOCAL_LOGON_RID: Int = 1

public val SECURITY_LOCAL_RID: Int = 0

public val SECURITY_LOCAL_SERVICE_RID: Int = 19

public val SECURITY_LOCAL_SYSTEM_RID: Int = 18

public val SECURITY_LOGON_IDS_RID: Int = 5

public val SECURITY_LOGON_IDS_RID_COUNT: Int = 3

public val SECURITY_MANDATORY_HIGH_RID: Int = 12288

public val SECURITY_MANDATORY_LOW_RID: Int = 4096

public val SECURITY_MANDATORY_MAXIMUM_USER_RID: Int = 16384

public val SECURITY_MANDATORY_MEDIUM_PLUS_RID: UInt = 8448u

public val SECURITY_MANDATORY_MEDIUM_RID: Int = 8192

public val SECURITY_MANDATORY_PROTECTED_PROCESS_RID: Int = 20480

public val SECURITY_MANDATORY_SYSTEM_RID: Int = 16384

public val SECURITY_MANDATORY_UNTRUSTED_RID: Int = 0

public val SECURITY_MAX_ALWAYS_FILTERED: Int = 999

public val SECURITY_MAX_BASE_RID: Int = 111

public val SECURITY_MIN_BASE_RID: Int = 80

public val SECURITY_MIN_NEVER_FILTERED: Int = 1000

public val SECURITY_NETWORK_RID: Int = 2

public val SECURITY_NETWORK_SERVICE_RID: Int = 20

public val SECURITY_NFS_ID_BASE_RID: Int = 88

public val SECURITY_NT_NON_UNIQUE: Int = 21

public val SECURITY_NT_NON_UNIQUE_SUB_AUTH_COUNT: Int = 3

public val SECURITY_NULL_RID: Int = 0

public val SECURITY_OTHER_ORGANIZATION_RID: Int = 1000

public val SECURITY_PACKAGE_BASE_RID: Int = 64

public val SECURITY_PACKAGE_DIGEST_RID: Int = 21

public val SECURITY_PACKAGE_NTLM_RID: Int = 10

public val SECURITY_PACKAGE_RID_COUNT: Int = 2

public val SECURITY_PACKAGE_SCHANNEL_RID: Int = 14

public val SECURITY_PARENT_PACKAGE_RID_COUNT: Int = 8

public val SECURITY_PRINCIPAL_SELF_RID: Int = 10

public val SECURITY_PROCESS_PROTECTION_LEVEL_ANTIMALWARE_RID: Int = 1536

public val SECURITY_PROCESS_PROTECTION_LEVEL_APP_RID: Int = 2048

public val SECURITY_PROCESS_PROTECTION_LEVEL_AUTHENTICODE_RID: Int = 1024

public val SECURITY_PROCESS_PROTECTION_LEVEL_NONE_RID: Int = 0

public val SECURITY_PROCESS_PROTECTION_LEVEL_WINDOWS_RID: Int = 4096

public val SECURITY_PROCESS_PROTECTION_LEVEL_WINTCB_RID: Int = 8192

public val SECURITY_PROCESS_PROTECTION_TYPE_FULL_RID: Int = 1024

public val SECURITY_PROCESS_PROTECTION_TYPE_LITE_RID: Int = 512

public val SECURITY_PROCESS_PROTECTION_TYPE_NONE_RID: Int = 0

public val SECURITY_PROCESS_TRUST_AUTHORITY_RID_COUNT: Int = 2

public val SECURITY_PROXY_RID: Int = 8

public val SECURITY_RDV_GFX_BASE_RID: Int = 91

public val SECURITY_REMOTE_LOGON_RID: Int = 14

public val SECURITY_RESERVED_ID_BASE_RID: Int = 81

public val SECURITY_RESTRICTED_CODE_RID: Int = 12

public val SECURITY_SERVER_LOGON_RID: Int = 9

public val SECURITY_SERVICE_ID_BASE_RID: Int = 80

public val SECURITY_SERVICE_ID_RID_COUNT: Int = 6

public val SECURITY_SERVICE_RID: Int = 6

public val SECURITY_TASK_ID_BASE_RID: Int = 87

public val SECURITY_TERMINAL_SERVER_RID: Int = 13

public val SECURITY_THIS_ORGANIZATION_RID: Int = 15

public val SECURITY_TRUSTED_INSTALLER_RID1: UInt = 956008885u

public val SECURITY_TRUSTED_INSTALLER_RID2: UInt = 3418522649u

public val SECURITY_TRUSTED_INSTALLER_RID3: UInt = 1831038044u

public val SECURITY_TRUSTED_INSTALLER_RID4: UInt = 1853292631u

public val SECURITY_TRUSTED_INSTALLER_RID5: UInt = 2271478464u

public val SECURITY_UMFD_BASE_RID: Int = 96

public val SECURITY_USERMANAGER_ID_BASE_RID: Int = 93

public val SECURITY_USERMANAGER_ID_RID_COUNT: Int = 6

public val SECURITY_USERMODEDRIVERHOST_ID_BASE_RID: Int = 84

public val SECURITY_USERMODEDRIVERHOST_ID_RID_COUNT: Int = 6

public val SECURITY_VIRTUALACCOUNT_ID_RID_COUNT: Int = 6

public val SECURITY_VIRTUALSERVER_ID_BASE_RID: Int = 83

public val SECURITY_VIRTUALSERVER_ID_RID_COUNT: Int = 6

public val SECURITY_WINDOWSMOBILE_ID_BASE_RID: Int = 112

public val SECURITY_WINDOW_MANAGER_BASE_RID: Int = 90

public val SECURITY_WINRM_ID_BASE_RID: Int = 94

public val SECURITY_WINRM_ID_RID_COUNT: Int = 6

public val SECURITY_WMIHOST_ID_BASE_RID: Int = 86

public val SECURITY_WMIHOST_ID_RID_COUNT: Int = 6

public val SECURITY_WORLD_RID: Int = 0

public val SECURITY_WRITE_RESTRICTED_CODE_RID: Int = 33

public val SEC_HUGE_PAGES: UInt = 131072u

public val SEF_AI_USE_EXTRA_PARAMS: UInt = 2048u

public val SEF_FORCE_USER_MODE: UInt = 8192u

public val SEF_NORMALIZE_OUTPUT_DESCRIPTOR: UInt = 16384u

public val SERVERSILO_INITING: ServersiloState = 0

public val SERVERSILO_SHUTTING_DOWN: ServersiloState = 2

public val SERVERSILO_STARTED: ServersiloState = 1

public val SERVERSILO_TERMINATED: ServersiloState = 4

public val SERVERSILO_TERMINATING: ServersiloState = 3

public val SERVICE_INTERACTIVE_PROCESS: UInt = 256u

public val SERVICE_PKG_SERVICE: UInt = 512u

public val SERVICE_USERSERVICE_INSTANCE: UInt = 128u

public val SERVICE_USER_SERVICE: UInt = 64u

public val SESSION_MODIFY_ACCESS: UInt = 2u

public val SESSION_QUERY_ACCESS: UInt = 1u

public val SE_ACCESS_CHECK_FLAG_NO_LEARNING_MODE_LOGGING: UInt = 8u

public val SE_ACCESS_CHECK_VALID_FLAGS: UInt = 8u

public val SE_ACTIVATE_AS_USER_CAPABILITY: Pcwstr = w("activateAsUser")

public val SE_APP_SILO_PRINT_CAPABILITY: Pcwstr = w("isolatedWin32-print")

public val SE_APP_SILO_PROFILES_ROOT_MINIMAL_CAPABILITY: Pcwstr = w("isolatedWin32-profilesRootMinimal")

public val SE_APP_SILO_USER_PROFILE_MINIMAL_CAPABILITY: Pcwstr = w("isolatedWin32-userProfileMinimal")

public val SE_APP_SILO_VOLUME_ROOT_MINIMAL_CAPABILITY: Pcwstr = w("isolatedWin32-volumeRootMinimal")

public val SE_CONSTRAINED_IMPERSONATION_CAPABILITY: Pcwstr = w("constrainedImpersonation")

public val SE_DEVELOPMENT_MODE_NETWORK_CAPABILITY: Pcwstr = w("developmentModeNetwork")

public val SE_GROUP_ENABLED: Int = 4

public val SE_GROUP_ENABLED_BY_DEFAULT: Int = 2

public val SE_GROUP_INTEGRITY: Int = 32

public val SE_GROUP_INTEGRITY_ENABLED: Int = 64

public val SE_GROUP_LOGON_ID: Int = -1073741824

public val SE_GROUP_MANDATORY: Int = 1

public val SE_GROUP_OWNER: Int = 8

public val SE_GROUP_RESOURCE: Int = 536870912

public val SE_GROUP_USE_FOR_DENY_ONLY: Int = 16

public val SE_LEARNING_MODE_LOGGING_CAPABILITY: Pcwstr = w("learningModeLogging")

public val SE_MUMA_CAPABILITY: Pcwstr = w("muma")

public val SE_PERMISSIVE_LEARNING_MODE_CAPABILITY: Pcwstr = w("permissiveLearningMode")

public val SE_SECURITY_DESCRIPTOR_FLAG_NO_ACCESS_FILTER_ACE: UInt = 4u

public val SE_SECURITY_DESCRIPTOR_FLAG_NO_LABEL_ACE: UInt = 2u

public val SE_SECURITY_DESCRIPTOR_FLAG_NO_OWNER_ACE: UInt = 1u

public val SE_SECURITY_DESCRIPTOR_VALID_FLAGS: UInt = 7u

public val SE_SESSION_IMPERSONATION_CAPABILITY: Pcwstr = w("sessionImpersonation")

public val SE_SIGNING_LEVEL_ANTIMALWARE: UInt = 7u

public val SE_SIGNING_LEVEL_AUTHENTICODE: UInt = 4u

public val SE_SIGNING_LEVEL_CUSTOM_1: UInt = 3u

public val SE_SIGNING_LEVEL_CUSTOM_2: UInt = 5u

public val SE_SIGNING_LEVEL_CUSTOM_3: UInt = 7u

public val SE_SIGNING_LEVEL_CUSTOM_4: UInt = 9u

public val SE_SIGNING_LEVEL_CUSTOM_5: UInt = 10u

public val SE_SIGNING_LEVEL_CUSTOM_6: UInt = 15u

public val SE_SIGNING_LEVEL_CUSTOM_7: UInt = 13u

public val SE_SIGNING_LEVEL_DEVELOPER: UInt = 3u

public val SE_SIGNING_LEVEL_DYNAMIC_CODEGEN: UInt = 11u

public val SE_SIGNING_LEVEL_ENTERPRISE: UInt = 2u

public val SE_SIGNING_LEVEL_MICROSOFT: UInt = 8u

public val SE_SIGNING_LEVEL_STORE: UInt = 6u

public val SE_SIGNING_LEVEL_UNCHECKED: UInt = 0u

public val SE_SIGNING_LEVEL_UNSIGNED: UInt = 1u

public val SE_SIGNING_LEVEL_WINDOWS: UInt = 12u

public val SE_SIGNING_LEVEL_WINDOWS_TCB: UInt = 14u

public val SFGAO_BROWSABLE: SfgaoFlags = 134217728u

public val SFGAO_CANCOPY: SfgaoFlags = 1u

public val SFGAO_CANDELETE: SfgaoFlags = 32u

public val SFGAO_CANLINK: SfgaoFlags = 4u

public val SFGAO_CANMONIKER: SfgaoFlags = 4194304u

public val SFGAO_CANMOVE: SfgaoFlags = 2u

public val SFGAO_CANRENAME: SfgaoFlags = 16u

public val SFGAO_CAPABILITYMASK: SfgaoFlags = 375u

public val SFGAO_COMPRESSED: SfgaoFlags = 67108864u

public val SFGAO_CONTENTSMASK: SfgaoFlags = 2147483648u

public val SFGAO_DISPLAYATTRMASK: SfgaoFlags = 1032192u

public val SFGAO_DROPTARGET: SfgaoFlags = 256u

public val SFGAO_ENCRYPTED: SfgaoFlags = 8192u

public val SFGAO_FILESYSANCESTOR: SfgaoFlags = 268435456u

public val SFGAO_FILESYSTEM: SfgaoFlags = 1073741824u

public val SFGAO_FOLDER: SfgaoFlags = 536870912u

public val SFGAO_GHOSTED: SfgaoFlags = 32768u

public val SFGAO_HASPROPSHEET: SfgaoFlags = 64u

public val SFGAO_HASSTORAGE: SfgaoFlags = 4194304u

public val SFGAO_HASSUBFOLDER: SfgaoFlags = 2147483648u

public val SFGAO_HIDDEN: SfgaoFlags = 524288u

public val SFGAO_ISSLOW: SfgaoFlags = 16384u

public val SFGAO_LINK: SfgaoFlags = 65536u

public val SFGAO_NEWCONTENT: SfgaoFlags = 2097152u

public val SFGAO_NONENUMERATED: SfgaoFlags = 1048576u

public val SFGAO_PKEYSFGAOMASK: SfgaoFlags = 2164539392u

public val SFGAO_PLACEHOLDER: SfgaoFlags = 2048u

public val SFGAO_READONLY: SfgaoFlags = 262144u

public val SFGAO_REMOVABLE: SfgaoFlags = 33554432u

public val SFGAO_SHARE: SfgaoFlags = 131072u

public val SFGAO_STORAGE: SfgaoFlags = 8u

public val SFGAO_STORAGEANCESTOR: SfgaoFlags = 8388608u

public val SFGAO_STORAGECAPMASK: SfgaoFlags = 1891958792u

public val SFGAO_STREAM: SfgaoFlags = 4194304u

public val SFGAO_SYSTEM: SfgaoFlags = 4096u

public val SFGAO_VALIDATE: SfgaoFlags = 16777216u

public val SHUFFLE_FILE_FLAG_SKIP_INITIALIZING_NEW_CLUSTERS: UInt = 1u

public val SID_HASH_SIZE: UInt = 32u

public val SID_MAX_SUB_AUTHORITIES: UInt = 15u

public val SID_RECOMMENDED_SUB_AUTHORITIES: UInt = 1u

public val SID_REVISION: UInt = 1u

public val SIZEOF_RFPO_DATA: UInt = 16u

public val SIZE_OF_80387_REGISTERS: UInt = 80u

public val SMB_CCF_APP_INSTANCE_EA_NAME: Pcstr = s("ClusteredApplicationInstance")

public val SMT_UNPARKING_POLICY_CORE: UInt = 0u

public val SMT_UNPARKING_POLICY_CORE_PER_THREAD: UInt = 1u

public val SMT_UNPARKING_POLICY_LP_ROUNDROBIN: UInt = 2u

public val SMT_UNPARKING_POLICY_LP_SEQUENTIAL: UInt = 3u

public val SORT_CHINESE_BIG5: UInt = 0u

public val SORT_CHINESE_BOPOMOFO: UInt = 3u

public val SORT_CHINESE_PRC: UInt = 2u

public val SORT_CHINESE_PRCP: UInt = 0u

public val SORT_CHINESE_RADICALSTROKE: UInt = 4u

public val SORT_CHINESE_UNICODE: UInt = 1u

public val SORT_DEFAULT: UInt = 0u

public val SORT_GEORGIAN_MODERN: UInt = 1u

public val SORT_GEORGIAN_TRADITIONAL: UInt = 0u

public val SORT_GERMAN_PHONE_BOOK: UInt = 1u

public val SORT_HUNGARIAN_DEFAULT: UInt = 0u

public val SORT_HUNGARIAN_TECHNICAL: UInt = 1u

public val SORT_INVARIANT_MATH: UInt = 1u

public val SORT_JAPANESE_RADICALSTROKE: UInt = 4u

public val SORT_JAPANESE_UNICODE: UInt = 1u

public val SORT_JAPANESE_XJIS: UInt = 0u

public val SORT_KOREAN_KSC: UInt = 0u

public val SORT_KOREAN_UNICODE: UInt = 1u

public val SS_BITMAP: StaticStyles = 14u

public val SS_BLACKFRAME: StaticStyles = 7u

public val SS_BLACKRECT: StaticStyles = 4u

public val SS_CENTER: StaticStyles = 1u

public val SS_CENTERIMAGE: StaticStyles = 512u

public val SS_EDITCONTROL: StaticStyles = 8192u

public val SS_ELLIPSISMASK: StaticStyles = 49152u

public val SS_ENDELLIPSIS: StaticStyles = 16384u

public val SS_ENHMETAFILE: StaticStyles = 15u

public val SS_ETCHEDFRAME: StaticStyles = 18u

public val SS_ETCHEDHORZ: StaticStyles = 16u

public val SS_ETCHEDVERT: StaticStyles = 17u

public val SS_GRAYFRAME: StaticStyles = 8u

public val SS_GRAYRECT: StaticStyles = 5u

public val SS_ICON: StaticStyles = 3u

public val SS_LEFT: StaticStyles = 0u

public val SS_LEFTNOWORDWRAP: StaticStyles = 12u

public val SS_NOPREFIX: StaticStyles = 128u

public val SS_NOTIFY: StaticStyles = 256u

public val SS_OWNERDRAW: StaticStyles = 13u

public val SS_PATHELLIPSIS: StaticStyles = 32768u

public val SS_REALSIZECONTROL: StaticStyles = 64u

public val SS_REALSIZEIMAGE: StaticStyles = 2048u

public val SS_RIGHT: StaticStyles = 2u

public val SS_RIGHTJUST: StaticStyles = 1024u

public val SS_SIMPLE: StaticStyles = 11u

public val SS_SUNKEN: StaticStyles = 4096u

public val SS_TYPEMASK: StaticStyles = 31u

public val SS_USERITEM: StaticStyles = 10u

public val SS_WHITEFRAME: StaticStyles = 9u

public val SS_WHITERECT: StaticStyles = 6u

public val SS_WORDELLIPSIS: StaticStyles = 49152u

public val SUBLANG_AFRIKAANS_SOUTH_AFRICA: UInt = 1u

public val SUBLANG_ALBANIAN_ALBANIA: UInt = 1u

public val SUBLANG_ALSATIAN_FRANCE: UInt = 1u

public val SUBLANG_AMHARIC_ETHIOPIA: UInt = 1u

public val SUBLANG_ARABIC_ALGERIA: UInt = 5u

public val SUBLANG_ARABIC_BAHRAIN: UInt = 15u

public val SUBLANG_ARABIC_EGYPT: UInt = 3u

public val SUBLANG_ARABIC_IRAQ: UInt = 2u

public val SUBLANG_ARABIC_JORDAN: UInt = 11u

public val SUBLANG_ARABIC_KUWAIT: UInt = 13u

public val SUBLANG_ARABIC_LEBANON: UInt = 12u

public val SUBLANG_ARABIC_LIBYA: UInt = 4u

public val SUBLANG_ARABIC_MOROCCO: UInt = 6u

public val SUBLANG_ARABIC_OMAN: UInt = 8u

public val SUBLANG_ARABIC_QATAR: UInt = 16u

public val SUBLANG_ARABIC_SAUDI_ARABIA: UInt = 1u

public val SUBLANG_ARABIC_SYRIA: UInt = 10u

public val SUBLANG_ARABIC_TUNISIA: UInt = 7u

public val SUBLANG_ARABIC_UAE: UInt = 14u

public val SUBLANG_ARABIC_YEMEN: UInt = 9u

public val SUBLANG_ARMENIAN_ARMENIA: UInt = 1u

public val SUBLANG_ASSAMESE_INDIA: UInt = 1u

public val SUBLANG_AZERBAIJANI_AZERBAIJAN_CYRILLIC: UInt = 2u

public val SUBLANG_AZERBAIJANI_AZERBAIJAN_LATIN: UInt = 1u

public val SUBLANG_AZERI_CYRILLIC: UInt = 2u

public val SUBLANG_AZERI_LATIN: UInt = 1u

public val SUBLANG_BANGLA_BANGLADESH: UInt = 2u

public val SUBLANG_BANGLA_INDIA: UInt = 1u

public val SUBLANG_BASHKIR_RUSSIA: UInt = 1u

public val SUBLANG_BASQUE_BASQUE: UInt = 1u

public val SUBLANG_BELARUSIAN_BELARUS: UInt = 1u

public val SUBLANG_BENGALI_BANGLADESH: UInt = 2u

public val SUBLANG_BENGALI_INDIA: UInt = 1u

public val SUBLANG_BOSNIAN_BOSNIA_HERZEGOVINA_CYRILLIC: UInt = 8u

public val SUBLANG_BOSNIAN_BOSNIA_HERZEGOVINA_LATIN: UInt = 5u

public val SUBLANG_BRETON_FRANCE: UInt = 1u

public val SUBLANG_BULGARIAN_BULGARIA: UInt = 1u

public val SUBLANG_CATALAN_CATALAN: UInt = 1u

public val SUBLANG_CENTRAL_KURDISH_IRAQ: UInt = 1u

public val SUBLANG_CHEROKEE_CHEROKEE: UInt = 1u

public val SUBLANG_CHINESE_HONGKONG: UInt = 3u

public val SUBLANG_CHINESE_MACAU: UInt = 5u

public val SUBLANG_CHINESE_SIMPLIFIED: UInt = 2u

public val SUBLANG_CHINESE_SINGAPORE: UInt = 4u

public val SUBLANG_CHINESE_TRADITIONAL: UInt = 1u

public val SUBLANG_CORSICAN_FRANCE: UInt = 1u

public val SUBLANG_CROATIAN_BOSNIA_HERZEGOVINA_LATIN: UInt = 4u

public val SUBLANG_CROATIAN_CROATIA: UInt = 1u

public val SUBLANG_CUSTOM_DEFAULT: UInt = 3u

public val SUBLANG_CUSTOM_UNSPECIFIED: UInt = 4u

public val SUBLANG_CZECH_CZECH_REPUBLIC: UInt = 1u

public val SUBLANG_DANISH_DENMARK: UInt = 1u

public val SUBLANG_DARI_AFGHANISTAN: UInt = 1u

public val SUBLANG_DEFAULT: UInt = 1u

public val SUBLANG_DIVEHI_MALDIVES: UInt = 1u

public val SUBLANG_DUTCH: UInt = 1u

public val SUBLANG_DUTCH_BELGIAN: UInt = 2u

public val SUBLANG_ENGLISH_AUS: UInt = 3u

public val SUBLANG_ENGLISH_BELIZE: UInt = 10u

public val SUBLANG_ENGLISH_CAN: UInt = 4u

public val SUBLANG_ENGLISH_CARIBBEAN: UInt = 9u

public val SUBLANG_ENGLISH_EIRE: UInt = 6u

public val SUBLANG_ENGLISH_INDIA: UInt = 16u

public val SUBLANG_ENGLISH_JAMAICA: UInt = 8u

public val SUBLANG_ENGLISH_MALAYSIA: UInt = 17u

public val SUBLANG_ENGLISH_NZ: UInt = 5u

public val SUBLANG_ENGLISH_PHILIPPINES: UInt = 13u

public val SUBLANG_ENGLISH_SINGAPORE: UInt = 18u

public val SUBLANG_ENGLISH_SOUTH_AFRICA: UInt = 7u

public val SUBLANG_ENGLISH_TRINIDAD: UInt = 11u

public val SUBLANG_ENGLISH_UK: UInt = 2u

public val SUBLANG_ENGLISH_US: UInt = 1u

public val SUBLANG_ENGLISH_ZIMBABWE: UInt = 12u

public val SUBLANG_ESTONIAN_ESTONIA: UInt = 1u

public val SUBLANG_FAEROESE_FAROE_ISLANDS: UInt = 1u

public val SUBLANG_FILIPINO_PHILIPPINES: UInt = 1u

public val SUBLANG_FINNISH_FINLAND: UInt = 1u

public val SUBLANG_FRENCH: UInt = 1u

public val SUBLANG_FRENCH_BELGIAN: UInt = 2u

public val SUBLANG_FRENCH_CANADIAN: UInt = 3u

public val SUBLANG_FRENCH_LUXEMBOURG: UInt = 5u

public val SUBLANG_FRENCH_MONACO: UInt = 6u

public val SUBLANG_FRENCH_SWISS: UInt = 4u

public val SUBLANG_FRISIAN_NETHERLANDS: UInt = 1u

public val SUBLANG_FULAH_SENEGAL: UInt = 2u

public val SUBLANG_GALICIAN_GALICIAN: UInt = 1u

public val SUBLANG_GEORGIAN_GEORGIA: UInt = 1u

public val SUBLANG_GERMAN: UInt = 1u

public val SUBLANG_GERMAN_AUSTRIAN: UInt = 3u

public val SUBLANG_GERMAN_LIECHTENSTEIN: UInt = 5u

public val SUBLANG_GERMAN_LUXEMBOURG: UInt = 4u

public val SUBLANG_GERMAN_SWISS: UInt = 2u

public val SUBLANG_GREEK_GREECE: UInt = 1u

public val SUBLANG_GREENLANDIC_GREENLAND: UInt = 1u

public val SUBLANG_GUJARATI_INDIA: UInt = 1u

public val SUBLANG_HAUSA_NIGERIA_LATIN: UInt = 1u

public val SUBLANG_HAWAIIAN_US: UInt = 1u

public val SUBLANG_HEBREW_ISRAEL: UInt = 1u

public val SUBLANG_HINDI_INDIA: UInt = 1u

public val SUBLANG_HUNGARIAN_HUNGARY: UInt = 1u

public val SUBLANG_ICELANDIC_ICELAND: UInt = 1u

public val SUBLANG_IGBO_NIGERIA: UInt = 1u

public val SUBLANG_INDONESIAN_INDONESIA: UInt = 1u

public val SUBLANG_INUKTITUT_CANADA: UInt = 1u

public val SUBLANG_INUKTITUT_CANADA_LATIN: UInt = 2u

public val SUBLANG_IRISH_IRELAND: UInt = 2u

public val SUBLANG_ITALIAN: UInt = 1u

public val SUBLANG_ITALIAN_SWISS: UInt = 2u

public val SUBLANG_JAPANESE_JAPAN: UInt = 1u

public val SUBLANG_KANNADA_INDIA: UInt = 1u

public val SUBLANG_KASHMIRI_INDIA: UInt = 2u

public val SUBLANG_KASHMIRI_SASIA: UInt = 2u

public val SUBLANG_KAZAK_KAZAKHSTAN: UInt = 1u

public val SUBLANG_KHMER_CAMBODIA: UInt = 1u

public val SUBLANG_KICHE_GUATEMALA: UInt = 1u

public val SUBLANG_KINYARWANDA_RWANDA: UInt = 1u

public val SUBLANG_KONKANI_INDIA: UInt = 1u

public val SUBLANG_KOREAN: UInt = 1u

public val SUBLANG_KYRGYZ_KYRGYZSTAN: UInt = 1u

public val SUBLANG_LAO_LAO: UInt = 1u

public val SUBLANG_LATVIAN_LATVIA: UInt = 1u

public val SUBLANG_LITHUANIAN: UInt = 1u

public val SUBLANG_LOWER_SORBIAN_GERMANY: UInt = 2u

public val SUBLANG_LUXEMBOURGISH_LUXEMBOURG: UInt = 1u

public val SUBLANG_MACEDONIAN_MACEDONIA: UInt = 1u

public val SUBLANG_MALAYALAM_INDIA: UInt = 1u

public val SUBLANG_MALAY_BRUNEI_DARUSSALAM: UInt = 2u

public val SUBLANG_MALAY_MALAYSIA: UInt = 1u

public val SUBLANG_MALTESE_MALTA: UInt = 1u

public val SUBLANG_MAORI_NEW_ZEALAND: UInt = 1u

public val SUBLANG_MAPUDUNGUN_CHILE: UInt = 1u

public val SUBLANG_MARATHI_INDIA: UInt = 1u

public val SUBLANG_MOHAWK_MOHAWK: UInt = 1u

public val SUBLANG_MONGOLIAN_CYRILLIC_MONGOLIA: UInt = 1u

public val SUBLANG_MONGOLIAN_PRC: UInt = 2u

public val SUBLANG_NEPALI_INDIA: UInt = 2u

public val SUBLANG_NEPALI_NEPAL: UInt = 1u

public val SUBLANG_NEUTRAL: UInt = 0u

public val SUBLANG_NORWEGIAN_BOKMAL: UInt = 1u

public val SUBLANG_NORWEGIAN_NYNORSK: UInt = 2u

public val SUBLANG_OCCITAN_FRANCE: UInt = 1u

public val SUBLANG_ODIA_INDIA: UInt = 1u

public val SUBLANG_ORIYA_INDIA: UInt = 1u

public val SUBLANG_PASHTO_AFGHANISTAN: UInt = 1u

public val SUBLANG_PERSIAN_IRAN: UInt = 1u

public val SUBLANG_POLISH_POLAND: UInt = 1u

public val SUBLANG_PORTUGUESE: UInt = 2u

public val SUBLANG_PORTUGUESE_BRAZILIAN: UInt = 1u

public val SUBLANG_PULAR_SENEGAL: UInt = 2u

public val SUBLANG_PUNJABI_INDIA: UInt = 1u

public val SUBLANG_PUNJABI_PAKISTAN: UInt = 2u

public val SUBLANG_QUECHUA_BOLIVIA: UInt = 1u

public val SUBLANG_QUECHUA_ECUADOR: UInt = 2u

public val SUBLANG_QUECHUA_PERU: UInt = 3u

public val SUBLANG_ROMANIAN_ROMANIA: UInt = 1u

public val SUBLANG_ROMANSH_SWITZERLAND: UInt = 1u

public val SUBLANG_RUSSIAN_RUSSIA: UInt = 1u

public val SUBLANG_SAKHA_RUSSIA: UInt = 1u

public val SUBLANG_SAMI_INARI_FINLAND: UInt = 9u

public val SUBLANG_SAMI_LULE_NORWAY: UInt = 4u

public val SUBLANG_SAMI_LULE_SWEDEN: UInt = 5u

public val SUBLANG_SAMI_NORTHERN_FINLAND: UInt = 3u

public val SUBLANG_SAMI_NORTHERN_NORWAY: UInt = 1u

public val SUBLANG_SAMI_NORTHERN_SWEDEN: UInt = 2u

public val SUBLANG_SAMI_SKOLT_FINLAND: UInt = 8u

public val SUBLANG_SAMI_SOUTHERN_NORWAY: UInt = 6u

public val SUBLANG_SAMI_SOUTHERN_SWEDEN: UInt = 7u

public val SUBLANG_SANSKRIT_INDIA: UInt = 1u

public val SUBLANG_SCOTTISH_GAELIC: UInt = 1u

public val SUBLANG_SERBIAN_BOSNIA_HERZEGOVINA_CYRILLIC: UInt = 7u

public val SUBLANG_SERBIAN_BOSNIA_HERZEGOVINA_LATIN: UInt = 6u

public val SUBLANG_SERBIAN_CROATIA: UInt = 1u

public val SUBLANG_SERBIAN_CYRILLIC: UInt = 3u

public val SUBLANG_SERBIAN_LATIN: UInt = 2u

public val SUBLANG_SERBIAN_MONTENEGRO_CYRILLIC: UInt = 12u

public val SUBLANG_SERBIAN_MONTENEGRO_LATIN: UInt = 11u

public val SUBLANG_SERBIAN_SERBIA_CYRILLIC: UInt = 10u

public val SUBLANG_SERBIAN_SERBIA_LATIN: UInt = 9u

public val SUBLANG_SINDHI_AFGHANISTAN: UInt = 2u

public val SUBLANG_SINDHI_INDIA: UInt = 1u

public val SUBLANG_SINDHI_PAKISTAN: UInt = 2u

public val SUBLANG_SINHALESE_SRI_LANKA: UInt = 1u

public val SUBLANG_SLOVAK_SLOVAKIA: UInt = 1u

public val SUBLANG_SLOVENIAN_SLOVENIA: UInt = 1u

public val SUBLANG_SOTHO_NORTHERN_SOUTH_AFRICA: UInt = 1u

public val SUBLANG_SPANISH: UInt = 1u

public val SUBLANG_SPANISH_ARGENTINA: UInt = 11u

public val SUBLANG_SPANISH_BOLIVIA: UInt = 16u

public val SUBLANG_SPANISH_CHILE: UInt = 13u

public val SUBLANG_SPANISH_COLOMBIA: UInt = 9u

public val SUBLANG_SPANISH_COSTA_RICA: UInt = 5u

public val SUBLANG_SPANISH_DOMINICAN_REPUBLIC: UInt = 7u

public val SUBLANG_SPANISH_ECUADOR: UInt = 12u

public val SUBLANG_SPANISH_EL_SALVADOR: UInt = 17u

public val SUBLANG_SPANISH_GUATEMALA: UInt = 4u

public val SUBLANG_SPANISH_HONDURAS: UInt = 18u

public val SUBLANG_SPANISH_MEXICAN: UInt = 2u

public val SUBLANG_SPANISH_MODERN: UInt = 3u

public val SUBLANG_SPANISH_NICARAGUA: UInt = 19u

public val SUBLANG_SPANISH_PANAMA: UInt = 6u

public val SUBLANG_SPANISH_PARAGUAY: UInt = 15u

public val SUBLANG_SPANISH_PERU: UInt = 10u

public val SUBLANG_SPANISH_PUERTO_RICO: UInt = 20u

public val SUBLANG_SPANISH_URUGUAY: UInt = 14u

public val SUBLANG_SPANISH_US: UInt = 21u

public val SUBLANG_SPANISH_VENEZUELA: UInt = 8u

public val SUBLANG_SWAHILI_KENYA: UInt = 1u

public val SUBLANG_SWEDISH: UInt = 1u

public val SUBLANG_SWEDISH_FINLAND: UInt = 2u

public val SUBLANG_SYRIAC_SYRIA: UInt = 1u

public val SUBLANG_SYS_DEFAULT: UInt = 2u

public val SUBLANG_TAJIK_TAJIKISTAN: UInt = 1u

public val SUBLANG_TAMAZIGHT_ALGERIA_LATIN: UInt = 2u

public val SUBLANG_TAMAZIGHT_MOROCCO_TIFINAGH: UInt = 4u

public val SUBLANG_TAMIL_INDIA: UInt = 1u

public val SUBLANG_TAMIL_SRI_LANKA: UInt = 2u

public val SUBLANG_TATAR_RUSSIA: UInt = 1u

public val SUBLANG_TELUGU_INDIA: UInt = 1u

public val SUBLANG_THAI_THAILAND: UInt = 1u

public val SUBLANG_TIBETAN_PRC: UInt = 1u

public val SUBLANG_TIGRIGNA_ERITREA: UInt = 2u

public val SUBLANG_TIGRINYA_ERITREA: UInt = 2u

public val SUBLANG_TIGRINYA_ETHIOPIA: UInt = 1u

public val SUBLANG_TSWANA_BOTSWANA: UInt = 2u

public val SUBLANG_TSWANA_SOUTH_AFRICA: UInt = 1u

public val SUBLANG_TURKISH_TURKEY: UInt = 1u

public val SUBLANG_TURKMEN_TURKMENISTAN: UInt = 1u

public val SUBLANG_UIGHUR_PRC: UInt = 1u

public val SUBLANG_UI_CUSTOM_DEFAULT: UInt = 5u

public val SUBLANG_UKRAINIAN_UKRAINE: UInt = 1u

public val SUBLANG_UPPER_SORBIAN_GERMANY: UInt = 1u

public val SUBLANG_URDU_INDIA: UInt = 2u

public val SUBLANG_URDU_PAKISTAN: UInt = 1u

public val SUBLANG_UZBEK_CYRILLIC: UInt = 2u

public val SUBLANG_UZBEK_LATIN: UInt = 1u

public val SUBLANG_VALENCIAN_VALENCIA: UInt = 2u

public val SUBLANG_VIETNAMESE_VIETNAM: UInt = 1u

public val SUBLANG_WELSH_UNITED_KINGDOM: UInt = 1u

public val SUBLANG_WOLOF_SENEGAL: UInt = 1u

public val SUBLANG_XHOSA_SOUTH_AFRICA: UInt = 1u

public val SUBLANG_YAKUT_RUSSIA: UInt = 1u

public val SUBLANG_YI_PRC: UInt = 1u

public val SUBLANG_YORUBA_NIGERIA: UInt = 1u

public val SUBLANG_ZULU_SOUTH_AFRICA: UInt = 1u

public val SYSTEM_ACCESS_FILTER_ACE_TYPE: UInt = 21u

public val SYSTEM_ACCESS_FILTER_NOCONSTRAINT_MASK: UInt = 4294967295u

public val SYSTEM_ACCESS_FILTER_VALID_MASK: UInt = 16777215u

public val SYSTEM_ALARM_ACE_TYPE: UInt = 3u

public val SYSTEM_ALARM_CALLBACK_ACE_TYPE: UInt = 14u

public val SYSTEM_ALARM_CALLBACK_OBJECT_ACE_TYPE: UInt = 16u

public val SYSTEM_ALARM_OBJECT_ACE_TYPE: UInt = 8u

public val SYSTEM_AUDIT_ACE_TYPE: UInt = 2u

public val SYSTEM_AUDIT_CALLBACK_ACE_TYPE: UInt = 13u

public val SYSTEM_AUDIT_CALLBACK_OBJECT_ACE_TYPE: UInt = 15u

public val SYSTEM_AUDIT_OBJECT_ACE_TYPE: UInt = 7u

public val SYSTEM_CACHE_ALIGNMENT_SIZE: UInt = 64u

public val SYSTEM_MANDATORY_LABEL_ACE_TYPE: UInt = 17u

public val SYSTEM_MANDATORY_LABEL_NO_EXECUTE_UP: UInt = 4u

public val SYSTEM_MANDATORY_LABEL_NO_READ_UP: UInt = 2u

public val SYSTEM_MANDATORY_LABEL_NO_WRITE_UP: UInt = 1u

public val SYSTEM_PROCESS_TRUST_LABEL_ACE_TYPE: UInt = 20u

public val SYSTEM_PROCESS_TRUST_LABEL_VALID_MASK: UInt = 16777215u

public val SYSTEM_PROCESS_TRUST_NOCONSTRAINT_MASK: UInt = 4294967295u

public val SYSTEM_RESOURCE_ATTRIBUTE_ACE_TYPE: UInt = 18u

public val SYSTEM_SCOPED_POLICY_ID_ACE_TYPE: UInt = 19u

public val SE_IMAGE_SIGNATURE_CACHE: SeImageSignatureType = 2

public val SE_IMAGE_SIGNATURE_CATALOG_CACHED: SeImageSignatureType = 3

public val SE_IMAGE_SIGNATURE_CATALOG_HINT: SeImageSignatureType = 5

public val SE_IMAGE_SIGNATURE_CATALOG_NOT_CACHED: SeImageSignatureType = 4

public val SE_IMAGE_SIGNATURE_EMBEDDED: SeImageSignatureType = 1

public val SE_IMAGE_SIGNATURE_NONE: SeImageSignatureType = 0

public val SE_IMAGE_SIGNATURE_PACKAGE_CATALOG: SeImageSignatureType = 6

public val SE_IMAGE_SIGNATURE_PPL_MITIGATED: SeImageSignatureType = 7

public val SEVERE_ERROR: ServiceErrorType = 2

public val SHARED_VIRTUAL_DISK_CDP_SNAPSHOTS_SUPPORTED: SharedVirtualDiskSupportType = 7

public val SHARED_VIRTUAL_DISK_HANDLE_STATE_FILE_SHARED: SharedVirtualDiskHandleState = 1

public val SHARED_VIRTUAL_DISK_HANDLE_STATE_HANDLE_SHARED: SharedVirtualDiskHandleState = 3

public val SHARED_VIRTUAL_DISK_HANDLE_STATE_NONE: SharedVirtualDiskHandleState = 0

public val SHARED_VIRTUAL_DISK_SNAPSHOTS_SUPPORTED: SharedVirtualDiskSupportType = 3

public val SHARED_VIRTUAL_DISKS_SUPPORTED: SharedVirtualDiskSupportType = 1

public val SHARED_VIRTUAL_DISKS_UNSUPPORTED: SharedVirtualDiskSupportType = 0

public val SYSTEM_LOAD: ServiceLoadType = 1

public val TAPE_CHECK_FOR_DRIVE_PROBLEM: Int = 2

public val TAPE_DRIVE_ABSOLUTE_BLK: TapeGetDriveParametersFeaturesHigh = 2147487744u

public val TAPE_DRIVE_ABS_BLK_IMMED: TapeGetDriveParametersFeaturesHigh = 2147491840u

public val TAPE_DRIVE_CLEAN_REQUESTS: UInt = 33554432u

public val TAPE_DRIVE_COMPRESSION: UInt = 131072u

public val TAPE_DRIVE_ECC: UInt = 65536u

public val TAPE_DRIVE_EJECT_MEDIA: UInt = 16777216u

public val TAPE_DRIVE_END_OF_DATA: TapeGetDriveParametersFeaturesHigh = 2147549184u

public val TAPE_DRIVE_EOT_WZ_SIZE: UInt = 8192u

public val TAPE_DRIVE_ERASE_BOP_ONLY: UInt = 64u

public val TAPE_DRIVE_ERASE_IMMEDIATE: UInt = 128u

public val TAPE_DRIVE_ERASE_LONG: UInt = 32u

public val TAPE_DRIVE_ERASE_SHORT: UInt = 16u

public val TAPE_DRIVE_FILEMARKS: TapeGetDriveParametersFeaturesHigh = 2147745792u

public val TAPE_DRIVE_FIXED: UInt = 1u

public val TAPE_DRIVE_FIXED_BLOCK: UInt = 1024u

public val TAPE_DRIVE_FORMAT: UInt = 2684354560u

public val TAPE_DRIVE_FORMAT_IMMEDIATE: UInt = 3221225472u

public val TAPE_DRIVE_GET_ABSOLUTE_BLK: UInt = 1048576u

public val TAPE_DRIVE_GET_LOGICAL_BLK: UInt = 2097152u

public val TAPE_DRIVE_HIGH_FEATURES: UInt = 2147483648u

public val TAPE_DRIVE_INITIATOR: UInt = 4u

public val TAPE_DRIVE_LOAD_UNLD_IMMED: TapeGetDriveParametersFeaturesHigh = 2147483680u

public val TAPE_DRIVE_LOAD_UNLOAD: TapeGetDriveParametersFeaturesHigh = 2147483649u

public val TAPE_DRIVE_LOCK_UNLK_IMMED: TapeGetDriveParametersFeaturesHigh = 2147483776u

public val TAPE_DRIVE_LOCK_UNLOCK: TapeGetDriveParametersFeaturesHigh = 2147483652u

public val TAPE_DRIVE_LOGICAL_BLK: TapeGetDriveParametersFeaturesHigh = 2147500032u

public val TAPE_DRIVE_LOG_BLK_IMMED: TapeGetDriveParametersFeaturesHigh = 2147516416u

public val TAPE_DRIVE_PADDING: UInt = 262144u

public val TAPE_DRIVE_RELATIVE_BLKS: TapeGetDriveParametersFeaturesHigh = 2147614720u

public val TAPE_DRIVE_REPORT_SMKS: UInt = 524288u

public val TAPE_DRIVE_RESERVED_BIT: UInt = 2147483648u

public val TAPE_DRIVE_REVERSE_POSITION: TapeGetDriveParametersFeaturesHigh = 2151677952u

public val TAPE_DRIVE_REWIND_IMMEDIATE: TapeGetDriveParametersFeaturesHigh = 2147483656u

public val TAPE_DRIVE_SELECT: UInt = 2u

public val TAPE_DRIVE_SEQUENTIAL_FMKS: TapeGetDriveParametersFeaturesHigh = 2148007936u

public val TAPE_DRIVE_SEQUENTIAL_SMKS: TapeGetDriveParametersFeaturesHigh = 2149580800u

public val TAPE_DRIVE_SETMARKS: TapeGetDriveParametersFeaturesHigh = 2148532224u

public val TAPE_DRIVE_SET_BLOCK_SIZE: TapeGetDriveParametersFeaturesHigh = 2147483664u

public val TAPE_DRIVE_SET_CMP_BOP_ONLY: UInt = 67108864u

public val TAPE_DRIVE_SET_COMPRESSION: TapeGetDriveParametersFeaturesHigh = 2147484160u

public val TAPE_DRIVE_SET_ECC: TapeGetDriveParametersFeaturesHigh = 2147483904u

public val TAPE_DRIVE_SET_EOT_WZ_SIZE: UInt = 4194304u

public val TAPE_DRIVE_SET_PADDING: TapeGetDriveParametersFeaturesHigh = 2147484672u

public val TAPE_DRIVE_SET_REPORT_SMKS: TapeGetDriveParametersFeaturesHigh = 2147485696u

public val TAPE_DRIVE_SPACE_IMMEDIATE: TapeGetDriveParametersFeaturesHigh = 2155872256u

public val TAPE_DRIVE_TAPE_CAPACITY: UInt = 256u

public val TAPE_DRIVE_TAPE_REMAINING: UInt = 512u

public val TAPE_DRIVE_TENSION: TapeGetDriveParametersFeaturesHigh = 2147483650u

public val TAPE_DRIVE_TENSION_IMMED: TapeGetDriveParametersFeaturesHigh = 2147483712u

public val TAPE_DRIVE_VARIABLE_BLOCK: UInt = 2048u

public val TAPE_DRIVE_WRITE_FILEMARKS: TapeGetDriveParametersFeaturesHigh = 2181038080u

public val TAPE_DRIVE_WRITE_LONG_FMKS: TapeGetDriveParametersFeaturesHigh = 2281701376u

public val TAPE_DRIVE_WRITE_MARK_IMMED: TapeGetDriveParametersFeaturesHigh = 2415919104u

public val TAPE_DRIVE_WRITE_PROTECT: UInt = 4096u

public val TAPE_DRIVE_WRITE_SETMARKS: TapeGetDriveParametersFeaturesHigh = 2164260864u

public val TAPE_DRIVE_WRITE_SHORT_FMKS: TapeGetDriveParametersFeaturesHigh = 2214592512u

public val TAPE_PSEUDO_LOGICAL_BLOCK: Int = 3

public val TAPE_PSEUDO_LOGICAL_POSITION: Int = 2

public val TAPE_QUERY_DEVICE_ERROR_DATA: Int = 4

public val TAPE_QUERY_DRIVE_PARAMETERS: Int = 0

public val TAPE_QUERY_IO_ERROR_DATA: Int = 3

public val TAPE_QUERY_MEDIA_CAPACITY: Int = 1

public val THREAD_BASE_PRIORITY_IDLE: Int = -15

public val THREAD_BASE_PRIORITY_LOWRT: UInt = 15u

public val THREAD_BASE_PRIORITY_MAX: UInt = 2u

public val THREAD_BASE_PRIORITY_MIN: Int = -2

public val THREAD_DYNAMIC_CODE_ALLOW: UInt = 1u

public val THREAD_PROFILING_FLAG_DISPATCH: UInt = 1u

public val TIME_ZONE_ID_DAYLIGHT: UInt = 2u

public val TIME_ZONE_ID_STANDARD: UInt = 1u

public val TIME_ZONE_ID_UNKNOWN: UInt = 0u

public val TLS_MINIMUM_AVAILABLE: UInt = 64u

public val TOKEN_SOURCE_LENGTH: UInt = 8u

public val TRANSACTIONMANAGER_BIND_TRANSACTION: UInt = 32u

public val TRANSACTIONMANAGER_CREATE_RM: UInt = 16u

public val TRANSACTIONMANAGER_QUERY_INFORMATION: UInt = 1u

public val TRANSACTIONMANAGER_RECOVER: UInt = 4u

public val TRANSACTIONMANAGER_RENAME: UInt = 8u

public val TRANSACTIONMANAGER_SET_INFORMATION: UInt = 2u

public val TRANSACTION_COMMIT: UInt = 8u

public val TRANSACTION_ENLIST: UInt = 4u

public val TRANSACTION_PROPAGATE: UInt = 32u

public val TRANSACTION_QUERY_INFORMATION: UInt = 1u

public val TRANSACTION_RIGHT_RESERVED1: UInt = 64u

public val TRANSACTION_ROLLBACK: UInt = 16u

public val TRANSACTION_SET_INFORMATION: UInt = 2u

public val TREE_CONNECT_ATTRIBUTE_GLOBAL: UInt = 4u

public val TREE_CONNECT_ATTRIBUTE_INTEGRITY: UInt = 32768u

public val TREE_CONNECT_ATTRIBUTE_PINNED: UInt = 2u

public val TREE_CONNECT_ATTRIBUTE_PRIVACY: UInt = 16384u

public val TRUST_PROTECTED_FILTER_ACE_FLAG: UInt = 64u

public val TAPE_DRIVE_CLEAN_DRIVE_NOW: TapeDriveProblemType = 11

public val TAPE_DRIVE_HARDWARE_ERROR: TapeDriveProblemType = 7

public val TAPE_DRIVE_MEDIA_LIFE_EXPIRED: TapeDriveProblemType = 12

public val TAPE_DRIVE_PROBLEM_NONE: TapeDriveProblemType = 0

public val TAPE_DRIVE_READ_ERROR: TapeDriveProblemType = 5

public val TAPE_DRIVE_READ_WARNING: TapeDriveProblemType = 3

public val TAPE_DRIVE_READ_WRITE_ERROR: TapeDriveProblemType = 2

public val TAPE_DRIVE_READ_WRITE_WARNING: TapeDriveProblemType = 1

public val TAPE_DRIVE_SCSI_CONNECTION_ERROR: TapeDriveProblemType = 9

public val TAPE_DRIVE_SNAPPED_TAPE: TapeDriveProblemType = 13

public val TAPE_DRIVE_TIMETO_CLEAN: TapeDriveProblemType = 10

public val TAPE_DRIVE_UNSUPPORTED_MEDIA: TapeDriveProblemType = 8

public val TAPE_DRIVE_WRITE_ERROR: TapeDriveProblemType = 6

public val TAPE_DRIVE_WRITE_WARNING: TapeDriveProblemType = 4

public val TRANSACTION_BASIC_INFORMATION: TransactionInformationClass = 0

public val TRANSACTION_BIND_INFORMATION: TransactionInformationClass = 4

public val TRANSACTION_DTC_PRIVATE_INFORMATION: TransactionInformationClass = 5

public val TRANSACTION_ENLISTMENT_INFORMATION: TransactionInformationClass = 2

public val TRANSACTION_MANAGER_BASIC_INFORMATION: TransactionmanagerInformationClass = 0

public val TRANSACTION_MANAGER_LOG_INFORMATION: TransactionmanagerInformationClass = 1

public val TRANSACTION_MANAGER_LOG_PATH_INFORMATION: TransactionmanagerInformationClass = 2

public val TRANSACTION_MANAGER_OLDEST_TRANSACTION_INFORMATION: TransactionmanagerInformationClass = 5

public val TRANSACTION_MANAGER_ONLINE_PROBE_INFORMATION: TransactionmanagerInformationClass = 3

public val TRANSACTION_MANAGER_RECOVERY_INFORMATION: TransactionmanagerInformationClass = 4

public val TRANSACTION_PROPERTIES_INFORMATION: TransactionInformationClass = 1

public val TRANSACTION_STATE_COMMITTED_NOTIFY: TransactionState = 3

public val TRANSACTION_STATE_INDOUBT: TransactionState = 2

public val TRANSACTION_STATE_NORMAL: TransactionState = 1

public val TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION: TransactionInformationClass = 3

public val UCSCHAR_INVALID_CHARACTER: UInt = 4294967295u

public val UNICODE_STRING_MAX_CHARS: UInt = 32767u

public val UNIFIEDBUILDREVISION_KEY: Pcwstr = w("\\Registry\\Machine\\Software\\Microsoft\\Windows NT\\CurrentVersion")

public val UNIFIEDBUILDREVISION_MIN: UInt = 0u

public val UNIFIEDBUILDREVISION_VALUE: Pcwstr = w("UBR")

public val UNWIND_CHAIN_LIMIT: UInt = 32u

public val UNWIND_HISTORY_TABLE_SIZE: UInt = 12u

public val UNW_FLAG_NO_EPILOGUE: UInt = 2147483648u

public val UMS_SCHEDULER_STARTUP: RtlUmsSchedulerReason = 0

public val UMS_SCHEDULER_THREAD_BLOCKED: RtlUmsSchedulerReason = 1

public val UMS_SCHEDULER_THREAD_YIELD: RtlUmsSchedulerReason = 2

public val VALID_INHERIT_FLAGS: UInt = 31u

public val VBS_BASIC_PAGE_MEASURED_DATA: UInt = 1u

public val VBS_BASIC_PAGE_SYSTEM_CALL: UInt = 5u

public val VBS_BASIC_PAGE_THREAD_DESCRIPTOR: UInt = 4u

public val VBS_BASIC_PAGE_UNMEASURED_DATA: UInt = 2u

public val VBS_BASIC_PAGE_ZERO_FILL: UInt = 3u

public val VER_AND: UInt = 6u

public val VER_CONDITION_MASK: UInt = 7u

public val VER_EQUAL: UInt = 1u

public val VER_GREATER: UInt = 2u

public val VER_GREATER_EQUAL: UInt = 3u

public val VER_LESS: UInt = 4u

public val VER_LESS_EQUAL: UInt = 5u

public val VER_NT_DOMAIN_CONTROLLER: UInt = 2u

public val VER_NT_SERVER: UInt = 3u

public val VER_NT_WORKSTATION: UInt = 1u

public val VER_NUM_BITS_PER_CONDITION_MASK: UInt = 3u

public val VER_OR: UInt = 7u

public val VER_SERVER_NT: UInt = 2147483648u

public val VER_SUITE_BACKOFFICE: UInt = 4u

public val VER_SUITE_BLADE: UInt = 1024u

public val VER_SUITE_COMMUNICATIONS: UInt = 8u

public val VER_SUITE_COMPUTE_SERVER: UInt = 16384u

public val VER_SUITE_DATACENTER: UInt = 128u

public val VER_SUITE_EMBEDDEDNT: UInt = 64u

public val VER_SUITE_EMBEDDED_RESTRICTED: UInt = 2048u

public val VER_SUITE_ENTERPRISE: UInt = 2u

public val VER_SUITE_MULTIUSERTS: UInt = 131072u

public val VER_SUITE_PERSONAL: UInt = 512u

public val VER_SUITE_SECURITY_APPLIANCE: UInt = 4096u

public val VER_SUITE_SINGLEUSERTS: UInt = 256u

public val VER_SUITE_SMALLBUSINESS: UInt = 1u

public val VER_SUITE_SMALLBUSINESS_RESTRICTED: UInt = 32u

public val VER_SUITE_STORAGE_SERVER: UInt = 8192u

public val VER_SUITE_TERMINAL: UInt = 16u

public val VER_SUITE_WH_SERVER: UInt = 32768u

public val VER_WORKSTATION_NT: UInt = 1073741824u

public val VRL_CUSTOM_CLASS_BEGIN: UInt = 256u

public val VRL_ENABLE_KERNEL_BREAKS: UInt = 2147483648u

public val VRL_PREDEFINED_CLASS_BEGIN: UInt = 1u

public val WDT_INPROC64_CALL: UInt = 1349805143u

public val WDT_INPROC_CALL: UInt = 1215587415u

public val WDT_REMOTE_CALL: UInt = 1383359575u

public val WRITE_NV_MEMORY_FLAG_FLUSH: UInt = 1u

public val WRITE_NV_MEMORY_FLAG_NON_TEMPORAL: UInt = 2u

public val WRITE_NV_MEMORY_FLAG_NO_DRAIN: UInt = 256u

public val WRITE_WATCH_FLAG_RESET: UInt = 1u

public val WT_EXECUTEDELETEWAIT: UInt = 8u

public val WT_EXECUTEINLONGTHREAD: UInt = 16u

public val WT_EXECUTEINPERSISTENTIOTHREAD: UInt = 64u

public val WT_EXECUTEINUITHREAD: UInt = 2u

public val WIN32SERVICE_OWN_PROCESS: ServiceNodeType = 16

public val WIN32SERVICE_SHARE_PROCESS: ServiceNodeType = 32

public val X3_BTYPE_QP_INST_VAL_POS_X: UInt = 0u

public val X3_BTYPE_QP_INST_WORD_POS_X: UInt = 23u

public val X3_BTYPE_QP_INST_WORD_X: UInt = 2u

public val X3_BTYPE_QP_SIZE_X: UInt = 9u

public val X3_D_WH_INST_WORD_POS_X: UInt = 24u

public val X3_D_WH_INST_WORD_X: UInt = 3u

public val X3_D_WH_SIGN_VAL_POS_X: UInt = 0u

public val X3_D_WH_SIZE_X: UInt = 3u

public val X3_EMPTY_INST_VAL_POS_X: UInt = 0u

public val X3_EMPTY_INST_WORD_POS_X: UInt = 14u

public val X3_EMPTY_INST_WORD_X: UInt = 1u

public val X3_EMPTY_SIZE_X: UInt = 2u

public val X3_IMM20_INST_WORD_POS_X: UInt = 4u

public val X3_IMM20_INST_WORD_X: UInt = 3u

public val X3_IMM20_SIGN_VAL_POS_X: UInt = 0u

public val X3_IMM20_SIZE_X: UInt = 20u

public val X3_IMM39_1_INST_WORD_POS_X: UInt = 0u

public val X3_IMM39_1_INST_WORD_X: UInt = 2u

public val X3_IMM39_1_SIGN_VAL_POS_X: UInt = 36u

public val X3_IMM39_1_SIZE_X: UInt = 23u

public val X3_IMM39_2_INST_WORD_POS_X: UInt = 16u

public val X3_IMM39_2_INST_WORD_X: UInt = 1u

public val X3_IMM39_2_SIGN_VAL_POS_X: UInt = 20u

public val X3_IMM39_2_SIZE_X: UInt = 16u

public val X3_I_INST_WORD_POS_X: UInt = 27u

public val X3_I_INST_WORD_X: UInt = 3u

public val X3_I_SIGN_VAL_POS_X: UInt = 59u

public val X3_I_SIZE_X: UInt = 1u

public val X3_OPCODE_INST_WORD_POS_X: UInt = 28u

public val X3_OPCODE_INST_WORD_X: UInt = 3u

public val X3_OPCODE_SIGN_VAL_POS_X: UInt = 0u

public val X3_OPCODE_SIZE_X: UInt = 4u

public val X3_P_INST_WORD_POS_X: UInt = 0u

public val X3_P_INST_WORD_X: UInt = 3u

public val X3_P_SIGN_VAL_POS_X: UInt = 0u

public val X3_P_SIZE_X: UInt = 4u

public val X3_TMPLT_INST_WORD_POS_X: UInt = 0u

public val X3_TMPLT_INST_WORD_X: UInt = 0u

public val X3_TMPLT_SIGN_VAL_POS_X: UInt = 0u

public val X3_TMPLT_SIZE_X: UInt = 4u

public val X86_CACHE_ALIGNMENT_SIZE: UInt = 64u

public val XSTATE_ALIGN_BIT: UInt = 1u

public val XSTATE_AMX_TILE_CONFIG: UInt = 17u

public val XSTATE_AMX_TILE_DATA: UInt = 18u

public val XSTATE_AVX: UInt = 2u

public val XSTATE_AVX512_KMASK: UInt = 5u

public val XSTATE_AVX512_ZMM: UInt = 7u

public val XSTATE_AVX512_ZMM_H: UInt = 6u

public val XSTATE_CET_S: UInt = 12u

public val XSTATE_CET_U: UInt = 11u

public val XSTATE_COMPACTION_ENABLE: UInt = 63u

public val XSTATE_CONTROLFLAG_XFD_MASK: UInt = 4u

public val XSTATE_CONTROLFLAG_XSAVEC_MASK: UInt = 2u

public val XSTATE_CONTROLFLAG_XSAVEOPT_MASK: UInt = 1u

public val XSTATE_GSSE: UInt = 2u

public val XSTATE_IPT: UInt = 8u

public val XSTATE_LEGACY_FLOATING_POINT: UInt = 0u

public val XSTATE_LEGACY_SSE: UInt = 1u

public val XSTATE_LWP: UInt = 62u

public val XSTATE_MPX_BNDCSR: UInt = 4u

public val XSTATE_MPX_BNDREGS: UInt = 3u

public val XSTATE_PASID: UInt = 10u

public val XSTATE_XFD_BIT: UInt = 2u

public val MM_HINT_NTA: UInt = 0u

public val MM_HINT_T0: UInt = 1u

public val MM_HINT_T1: UInt = 2u

public val MM_HINT_T2: UInt = 3u

public val ALL_POWERSCHEMES_GUID: Guid = Guid.fromU128(U128(0x68a1e95e13ea41e1uL, 0x80110c496ca490b0uL))

public val GUID_ACDC_POWER_SOURCE: Guid = Guid.fromU128(U128(0x5d3e9a59e9d54b00uL, 0xa6bdff34ff516548uL))

public val GUID_ACTIVE_POWERSCHEME: Guid = Guid.fromU128(U128(0x31f9f286508442feuL, 0xb7202b0264993763uL))

public val GUID_ADAPTIVE_INPUT_CONTROLLER_STATE: Guid = Guid.fromU128(U128(0xe98fae9f45a4de1uL, 0xa7576031f197f6eauL))

public val GUID_ADAPTIVE_POWER_BEHAVIOR_SUBGROUP: Guid = Guid.fromU128(U128(0x8619b916e0044dd8uL, 0x9b66dae86f806698uL))

public val GUID_ADVANCED_COLOR_QUALITY_BIAS: Guid = Guid.fromU128(U128(0x684c3e69a4f74014uL, 0x8754d45179a56167uL))

public val GUID_ALLOW_AWAYMODE: Guid = Guid.fromU128(U128(0x25dfa1495dd14736uL, 0xb5abe8a37b5b8187uL))

public val GUID_ALLOW_DISPLAY_REQUIRED: Guid = Guid.fromU128(U128(0xa9ceb8dacd4644fbuL, 0xa98b02af69de4623uL))

public val GUID_ALLOW_RTC_WAKE: Guid = Guid.fromU128(U128(0xbd3b718a06804d9duL, 0x8ab2e1d2b4ac806duL))

public val GUID_ALLOW_STANDBY_STATES: Guid = Guid.fromU128(U128(0xabfc251936084c2auL, 0x94ea171b0ed546abuL))

public val GUID_ALLOW_SYSTEM_REQUIRED: Guid = Guid.fromU128(U128(0xa4b195f5822547d8uL, 0x80129d41369786e2uL))

public val GUID_APPLAUNCH_BUTTON: Guid = Guid.fromU128(U128(0x1a68923173994e9auL, 0x8f99b71f999db3fauL))

public val GUID_BACKGROUND_TASK_NOTIFICATION: Guid = Guid.fromU128(U128(0xcf23f2402a5448d8uL, 0xb114de1518ff052euL))

public val GUID_BATTERY_COUNT: Guid = Guid.fromU128(U128(0x7d263f15fca449e5uL, 0x854ba9f2bfbd5c24uL))

public val GUID_BATTERY_DISCHARGE_ACTION_0: Guid = Guid.fromU128(U128(0x637ea02fbbcb4015uL, 0x8e2ca1c7b9c0b546uL))

public val GUID_BATTERY_DISCHARGE_ACTION_1: Guid = Guid.fromU128(U128(0xd8742dcb3e6a4b3cuL, 0xb3fe374623cdcf06uL))

public val GUID_BATTERY_DISCHARGE_ACTION_2: Guid = Guid.fromU128(U128(0x421cba381a8e4881uL, 0xac89e33a8b04ece4uL))

public val GUID_BATTERY_DISCHARGE_ACTION_3: Guid = Guid.fromU128(U128(0x804726139780455euL, 0xb30872d3003cf2f8uL))

public val GUID_BATTERY_DISCHARGE_FLAGS_0: Guid = Guid.fromU128(U128(0x5dbb7c9f38e940d2uL, 0x97494f8a0e9f640fuL))

public val GUID_BATTERY_DISCHARGE_FLAGS_1: Guid = Guid.fromU128(U128(0xbcded951187b4d05uL, 0xbcccf7e51960c258uL))

public val GUID_BATTERY_DISCHARGE_FLAGS_2: Guid = Guid.fromU128(U128(0x7fd2f0c4feb74da3uL, 0x8117e3fbedc46582uL))

public val GUID_BATTERY_DISCHARGE_FLAGS_3: Guid = Guid.fromU128(U128(0x73613ccfdbfa4279uL, 0x83564935f6bf62f3uL))

public val GUID_BATTERY_DISCHARGE_LEVEL_0: Guid = Guid.fromU128(U128(0x9a66d8d74ff74ef9uL, 0xb5a25a326ca2a469uL))

public val GUID_BATTERY_DISCHARGE_LEVEL_1: Guid = Guid.fromU128(U128(0x8183ba9ae91048dauL, 0x876914ae6dc1170auL))

public val GUID_BATTERY_DISCHARGE_LEVEL_2: Guid = Guid.fromU128(U128(0x7a07ca2adaf40d7uL, 0xb077533aaded1bfauL))

public val GUID_BATTERY_DISCHARGE_LEVEL_3: Guid = Guid.fromU128(U128(0x58afd5a6c2dd47d2uL, 0x9fbfef70cc5c5965uL))

public val GUID_BATTERY_PERCENTAGE_REMAINING: Guid = Guid.fromU128(U128(0xa7ad8041b45a4caeuL, 0x87a3eecbb468a9e1uL))

public val GUID_BATTERY_SUBGROUP: Guid = Guid.fromU128(U128(0xe73a048dbf274f12uL, 0x97318b2076e8891fuL))

public val GUID_CONNECTIVITY_IN_STANDBY: Guid = Guid.fromU128(U128(0xf15576e898b74186uL, 0xb944eafa664402d9uL))

public val GUID_CONSOLE_DISPLAY_STATE: Guid = Guid.fromU128(U128(0x6fe69556704a47a0uL, 0x8f24c28d936fda47uL))

public val GUID_CRITICAL_POWER_TRANSITION: Guid = Guid.fromU128(U128(0xb7a27025e56946c2uL, 0xa5042b96cad225a1uL))

public val GUID_DEEP_SLEEP_ENABLED: Guid = Guid.fromU128(U128(0xd502f7ee1dc74efduL, 0xa55df04b6f5c0545uL))

public val GUID_DEEP_SLEEP_PLATFORM_STATE: Guid = Guid.fromU128(U128(0xd23f2fb895364038uL, 0x9c941ce02e5c2152uL))

public val GUID_DEVICE_IDLE_POLICY: Guid = Guid.fromU128(U128(0x4faab71a92e54726uL, 0xb531224559672d19uL))

public val GUID_DEVICE_POWER_POLICY_VIDEO_BRIGHTNESS: Guid = Guid.fromU128(U128(0xaded5e82b9094619uL, 0x9949f5d71dac0bcbuL))

public val GUID_DEVICE_POWER_POLICY_VIDEO_DIM_BRIGHTNESS: Guid = Guid.fromU128(U128(0xf1fbfde2a9604165uL, 0x9f8850667911ce96uL))

public val GUID_DISCONNECTED_STANDBY_MODE: Guid = Guid.fromU128(U128(0x68afb2d9ee9547a8uL, 0x8f504115088073b1uL))

public val GUID_DISK_ADAPTIVE_POWERDOWN: Guid = Guid.fromU128(U128(0x396a32e1499a40b2uL, 0x9124a96afe707667uL))

public val GUID_DISK_BURST_IGNORE_THRESHOLD: Guid = Guid.fromU128(U128(0x80e3c60ebb944ad8uL, 0xbbe00d3195efc663uL))

public val GUID_DISK_COALESCING_POWERDOWN_TIMEOUT: Guid = Guid.fromU128(U128(0xc36f0eb429884a70uL, 0x8eee0884fc2c2433uL))

public val GUID_DISK_IDLE_TIMEOUT: Guid = Guid.fromU128(U128(0x58e39ba8b8e64ef6uL, 0x90d089ae32b258d6uL))

public val GUID_DISK_MAX_POWER: Guid = Guid.fromU128(U128(0x51dea550bb384bc4uL, 0x991beacf37be5ec8uL))

public val GUID_DISK_NVME_NOPPME: Guid = Guid.fromU128(U128(0xfc7372b6ab2d43eeuL, 0x879715e9841f2ccauL))

public val GUID_DISK_POWERDOWN_TIMEOUT: Guid = Guid.fromU128(U128(0x6738e2c4e8a54a42uL, 0xb16ae040e769756euL))

public val GUID_DISK_SUBGROUP: Guid = Guid.fromU128(U128(0x12ee4790414b5duL, 0x9b77535fba8b1442uL))

public val GUID_ENABLE_SWITCH_FORCED_SHUTDOWN: Guid = Guid.fromU128(U128(0x833a6b62dfa446d1uL, 0x82f8e09e34d029d6uL))

public val GUID_ENERGY_SAVER_BATTERY_THRESHOLD: Guid = Guid.fromU128(U128(0xe69653cacf7f4f05uL, 0xaa73cb833fa90ad4uL))

public val GUID_ENERGY_SAVER_BRIGHTNESS: Guid = Guid.fromU128(U128(0x13d09884f74e474auL, 0xa852b6bde8ad03a8uL))

public val GUID_ENERGY_SAVER_POLICY: Guid = Guid.fromU128(U128(0x5c5bb349ad294ee2uL, 0x9d0b2b25270f7a81uL))

public val GUID_ENERGY_SAVER_SUBGROUP: Guid = Guid.fromU128(U128(0xde830923a56241afuL, 0xa086e3a2c6bad2dauL))

public val GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT: Guid = Guid.fromU128(U128(0x3166bc417e984e03uL, 0xb34eec0f5f2b218euL))

public val GUID_GLOBAL_USER_PRESENCE: Guid = Guid.fromU128(U128(0x786e8a1db4274344uL, 0x920709e70bdcbea9uL))

public val GUID_GPU_PREFERENCE_POLICY: Guid = Guid.fromU128(U128(0xdd848b2a8a5d4451uL, 0x9ae239cd41658f6cuL))

public val GUID_GRAPHICS_SUBGROUP: Guid = Guid.fromU128(U128(0x5fb4938d1ee84b0fuL, 0x9a3c5036b0ab995cuL))

public val GUID_HIBERNATE_FASTS4_POLICY: Guid = Guid.fromU128(U128(0x94ac6d2973ce41a6uL, 0x809f6363ba21b47euL))

public val GUID_HIBERNATE_TIMEOUT: Guid = Guid.fromU128(U128(0x9d7815a67ee4497euL, 0x8888515a05f02364uL))

public val GUID_HUPR_ADAPTIVE_AWAY_DIM_TIMEOUT: Guid = Guid.fromU128(U128(0xa79c8e0ef271482duL, 0x8f8a5db9a18312deuL))

public val GUID_HUPR_ADAPTIVE_AWAY_DISPLAY_TIMEOUT: Guid = Guid.fromU128(U128(0xa7d6ab6ac834ad1uL, 0x8282eca5b58308f3uL))

public val GUID_HUPR_ADAPTIVE_INATTENTIVE_DIM_TIMEOUT: Guid = Guid.fromU128(U128(0xcf8c609712b84279uL, 0xbbdd44601ee5209duL))

public val GUID_HUPR_ADAPTIVE_INATTENTIVE_DISPLAY_TIMEOUT: Guid = Guid.fromU128(U128(0xee16691e6ab34619uL, 0xbb481c77c9357e5auL))

public val GUID_IDLE_BACKGROUND_TASK: Guid = Guid.fromU128(U128(0x515c31d8f734163duL, 0xa0fd11a08c91e8f1uL))

public val GUID_IDLE_RESILIENCY_PERIOD: Guid = Guid.fromU128(U128(0xc42b79aaaa3a484buL, 0xa98f2cf32aa90a28uL))

public val GUID_IDLE_RESILIENCY_SUBGROUP: Guid = Guid.fromU128(U128(0x2e60113053514d9duL, 0x8e04252966bad054uL))

public val GUID_INTSTEER_LOAD_PER_PROC_TRIGGER: Guid = Guid.fromU128(U128(0x73cde64dd7204bb2uL, 0xa860c755afe77ef2uL))

public val GUID_INTSTEER_MODE: Guid = Guid.fromU128(U128(0x2bfc24f95ea24801uL, 0x82133dbae01aa39duL))

public val GUID_INTSTEER_SUBGROUP: Guid = Guid.fromU128(U128(0x48672f387a9a4bb2uL, 0x8bf83d85be19de4euL))

public val GUID_INTSTEER_TIME_UNPARK_TRIGGER: Guid = Guid.fromU128(U128(0xd6ba4903386f4c2cuL, 0x8adb5c21b3328d25uL))

public val GUID_LEGACY_RTC_MITIGATION: Guid = Guid.fromU128(U128(0x1a34bdc37e6b442euL, 0xa9d064b6ef378e84uL))

public val GUID_LIDCLOSE_ACTION: Guid = Guid.fromU128(U128(0x5ca833676e45459fuL, 0xa27b476b1d01c936uL))

public val GUID_LIDOPEN_POWERSTATE: Guid = Guid.fromU128(U128(0x99ff10e723b14c07uL, 0xa9d15c3206d741b4uL))

public val GUID_LIDSWITCH_STATE_CHANGE: Guid = Guid.fromU128(U128(0xba3e0f4db8174094uL, 0xa2d1d56379e6a0f3uL))

public val GUID_LIDSWITCH_STATE_RELIABILITY: Guid = Guid.fromU128(U128(0xae4c4ff1d36143f4uL, 0x80aabbb6eb03de94uL))

public val GUID_LOCK_CONSOLE_ON_WAKE: Guid = Guid.fromU128(U128(0xe796bdb100d47d6uL, 0xa2d5f7d2daa51f51uL))

public val GUID_MAX_POWER_SAVINGS: Guid = Guid.fromU128(U128(0xa184130835414fabuL, 0xbc81f71556f20b4auL))

public val GUID_MIN_POWER_SAVINGS: Guid = Guid.fromU128(U128(0x8c5e7fdae8bf4a96uL, 0x9a85a6e23a8c635cuL))

public val GUID_MIXED_REALITY_MODE: Guid = Guid.fromU128(U128(0x1e626b4ecf044f8duL, 0x9cc7c97c5b0f2391uL))

public val GUID_MONITOR_POWER_ON: Guid = Guid.fromU128(U128(0x273101545104526uL, 0x99e6e5a17ebd1aeauL))

public val GUID_NON_ADAPTIVE_INPUT_TIMEOUT: Guid = Guid.fromU128(U128(0x5adbbfbc074e4da1uL, 0xba38db8b36b2c8f3uL))

public val GUID_PCIEXPRESS_ASPM_POLICY: Guid = Guid.fromU128(U128(0xee12f906d277404buL, 0xb6dae5fa1a576df5uL))

public val GUID_PCIEXPRESS_SETTINGS_SUBGROUP: Guid = Guid.fromU128(U128(0x501a4d1342af4429uL, 0x9fd1a8218c268e20uL))

public val GUID_POWERBUTTON_ACTION: Guid = Guid.fromU128(U128(0x7648efa3dd9c4e3euL, 0xb56650f929386280uL))

public val GUID_POWERSCHEME_PERSONALITY: Guid = Guid.fromU128(U128(0x245d854139434422uL, 0xb02513a784f679b7uL))

public val GUID_POWER_SAVING_STATUS: Guid = Guid.fromU128(U128(0xe00958c0c2134aceuL, 0xac77fecced2eeea5uL))

public val GUID_PROCESSOR_ALLOW_THROTTLING: Guid = Guid.fromU128(U128(0x3b04d4fd1cc74f23uL, 0xab1cd1337819c4bbuL))

public val GUID_PROCESSOR_CLASS0_FLOOR_PERF: Guid = Guid.fromU128(U128(0xfddc842b83644edcuL, 0x94cfc17f60de1c80uL))

public val GUID_PROCESSOR_CLASS1_INITIAL_PERF: Guid = Guid.fromU128(U128(0x1facfc65a9304bc5uL, 0x9f38504ec097bbc0uL))

public val GUID_PROCESSOR_COMPLEX_PARKING_POLICY: Guid = Guid.fromU128(U128(0xb669a5e97b1d4132uL, 0xbaaa49190abcfeb6uL))

public val GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_DECREASE_FACTOR: Guid = Guid.fromU128(U128(0x8f7b45e3c393480auL, 0x878cf67ac3d07082uL))

public val GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_THRESHOLD: Guid = Guid.fromU128(U128(0x5b33697be89d4d38uL, 0xaa469e7dfb7cd2f9uL))

public val GUID_PROCESSOR_CORE_PARKING_AFFINITY_WEIGHTING: Guid = Guid.fromU128(U128(0xe70867f1fa2f4f4euL, 0xaea14d8a0ba23b20uL))

public val GUID_PROCESSOR_CORE_PARKING_DECREASE_POLICY: Guid = Guid.fromU128(U128(0x71021b41c7494d21uL, 0xbe74a00f335d582buL))

public val GUID_PROCESSOR_CORE_PARKING_DECREASE_THRESHOLD: Guid = Guid.fromU128(U128(0x68dd2f27a4ce4e11uL, 0x84873794e4135dfauL))

public val GUID_PROCESSOR_CORE_PARKING_DECREASE_TIME: Guid = Guid.fromU128(U128(0xdfd10d17d5eb45dduL, 0x877a9a34ddd15c82uL))

public val GUID_PROCESSOR_CORE_PARKING_INCREASE_POLICY: Guid = Guid.fromU128(U128(0xc7be067928174d69uL, 0x9d02519a537ed0c6uL))

public val GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD: Guid = Guid.fromU128(U128(0xdf14294120f34edfuL, 0x9a4a9c83d3d717d1uL))

public val GUID_PROCESSOR_CORE_PARKING_INCREASE_TIME: Guid = Guid.fromU128(U128(0x2ddd5a845a71437euL, 0x912adb0b8c788732uL))

public val GUID_PROCESSOR_CORE_PARKING_MAX_CORES: Guid = Guid.fromU128(U128(0xea0620310e344ff1uL, 0x9b6deb1059334028uL))

public val GUID_PROCESSOR_CORE_PARKING_MAX_CORES_1: Guid = Guid.fromU128(U128(0xea0620310e344ff1uL, 0x9b6deb1059334029uL))

public val GUID_PROCESSOR_CORE_PARKING_MIN_CORES: Guid = Guid.fromU128(U128(0xcc5b647c1df4637uL, 0x891adec35c318583uL))

public val GUID_PROCESSOR_CORE_PARKING_MIN_CORES_1: Guid = Guid.fromU128(U128(0xcc5b647c1df4637uL, 0x891adec35c318584uL))

public val GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_DECREASE_FACTOR: Guid = Guid.fromU128(U128(0x1299023cbc284f0auL, 0x81ecd3295a8d815duL))

public val GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_THRESHOLD: Guid = Guid.fromU128(U128(0x9ac18e92aa3c4e27uL, 0xb30701ae37307129uL))

public val GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_THRESHOLD: Guid = Guid.fromU128(U128(0x943c8cb66f934227uL, 0xad87e9a3feec08d1uL))

public val GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_WEIGHTING: Guid = Guid.fromU128(U128(0x8809c2d8b15542d4uL, 0xbcda0d345651b1dbuL))

public val GUID_PROCESSOR_DISTRIBUTE_UTILITY: Guid = Guid.fromU128(U128(0xe0007330f58942eduL, 0xa4015ddb10e785d3uL))

public val GUID_PROCESSOR_DUTY_CYCLING: Guid = Guid.fromU128(U128(0x4e4450b361794e91uL, 0xb8f15bb9938f81a1uL))

public val GUID_PROCESSOR_FREQUENCY_LIMIT: Guid = Guid.fromU128(U128(0x75b0ae3fbce045a7uL, 0x8c89c9611c25e100uL))

public val GUID_PROCESSOR_FREQUENCY_LIMIT_1: Guid = Guid.fromU128(U128(0x75b0ae3fbce045a7uL, 0x8c89c9611c25e101uL))

public val GUID_PROCESSOR_HETEROGENEOUS_POLICY: Guid = Guid.fromU128(U128(0x7f2f5cfaf10c4823uL, 0xb5e1e93ae85f46b5uL))

public val GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD: Guid = Guid.fromU128(U128(0xf8861c2795e7475cuL, 0x865b13c0cb3f9d6buL))

public val GUID_PROCESSOR_HETERO_DECREASE_THRESHOLD_1: Guid = Guid.fromU128(U128(0xf8861c2795e7475cuL, 0x865b13c0cb3f9d6cuL))

public val GUID_PROCESSOR_HETERO_DECREASE_TIME: Guid = Guid.fromU128(U128(0x7f2492b660b145e5uL, 0xae55773f8cd5caecuL))

public val GUID_PROCESSOR_HETERO_INCREASE_THRESHOLD: Guid = Guid.fromU128(U128(0xb000397d9b0b483duL, 0x98c9692a6060cfbfuL))

public val GUID_PROCESSOR_HETERO_INCREASE_THRESHOLD_1: Guid = Guid.fromU128(U128(0xb000397d9b0b483duL, 0x98c9692a6060cfc0uL))

public val GUID_PROCESSOR_HETERO_INCREASE_TIME: Guid = Guid.fromU128(U128(0x4009efa7e72d4cbauL, 0x9edf91084ea8cbc3uL))

public val GUID_PROCESSOR_IDLESTATE_POLICY: Guid = Guid.fromU128(U128(0x68f262a7f6214069uL, 0xb9a54874169be23cuL))

public val GUID_PROCESSOR_IDLE_ALLOW_SCALING: Guid = Guid.fromU128(U128(0x6c2993b08f48481fuL, 0xbcc600dd2742aa06uL))

public val GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD: Guid = Guid.fromU128(U128(0x4b92d7585a244851uL, 0xa470815d78aee119uL))

public val GUID_PROCESSOR_IDLE_DISABLE: Guid = Guid.fromU128(U128(0x5d76a2cae8c0402fuL, 0xa1332158492d58aduL))

public val GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD: Guid = Guid.fromU128(U128(0x7b224883b3cc4d79uL, 0x819f8374152cbe7cuL))

public val GUID_PROCESSOR_IDLE_STATE_MAXIMUM: Guid = Guid.fromU128(U128(0x9943e9059a304ec1uL, 0x9b9944dd3b76f7a2uL))

public val GUID_PROCESSOR_IDLE_TIME_CHECK: Guid = Guid.fromU128(U128(0xc4581c3189ab4597uL, 0x8e2b9c9cab440e6buL))

public val GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK: Guid = Guid.fromU128(U128(0x616cdaa5695e4545uL, 0x97ad97dc2d1bdd88uL))

public val GUID_PROCESSOR_LATENCY_HINT_MIN_UNPARK_1: Guid = Guid.fromU128(U128(0x616cdaa5695e4545uL, 0x97ad97dc2d1bdd89uL))

public val GUID_PROCESSOR_LONG_THREAD_ARCH_CLASS_LOWER_THRESHOLD: Guid = Guid.fromU128(U128(0x43f278bc0f8a46d0uL, 0x8b319a23e615d713uL))

public val GUID_PROCESSOR_LONG_THREAD_ARCH_CLASS_UPPER_THRESHOLD: Guid = Guid.fromU128(U128(0xbf903d339d2449d3uL, 0xa468e65e0325046auL))

public val GUID_PROCESSOR_MODULE_PARKING_POLICY: Guid = Guid.fromU128(U128(0xb0deaf6b59c04523uL, 0x8a45ca7f40244114uL))

public val GUID_PROCESSOR_PARKING_CONCURRENCY_THRESHOLD: Guid = Guid.fromU128(U128(0x2430ab6fa52044a2uL, 0x9601f7f23b5134b1uL))

public val GUID_PROCESSOR_PARKING_CORE_OVERRIDE: Guid = Guid.fromU128(U128(0xa55612aaf62442c6uL, 0xa4437397d064c04fuL))

public val GUID_PROCESSOR_PARKING_DISTRIBUTION_THRESHOLD: Guid = Guid.fromU128(U128(0x4bdaf4e9d10346d7uL, 0xa5f06280121616efuL))

public val GUID_PROCESSOR_PARKING_HEADROOM_THRESHOLD: Guid = Guid.fromU128(U128(0xf735a67320664f80uL, 0xa0c5ddee0cf1bf5duL))

public val GUID_PROCESSOR_PARKING_PERF_STATE: Guid = Guid.fromU128(U128(0x447235c76a8d4cc0uL, 0x8e249eaf70b96e2buL))

public val GUID_PROCESSOR_PARKING_PERF_STATE_1: Guid = Guid.fromU128(U128(0x447235c76a8d4cc0uL, 0x8e249eaf70b96e2cuL))

public val GUID_PROCESSOR_PERFSTATE_POLICY: Guid = Guid.fromU128(U128(0xbbdc381418e94463uL, 0x8a55d197327c45c0uL))

public val GUID_PROCESSOR_PERF_AUTONOMOUS_ACTIVITY_WINDOW: Guid = Guid.fromU128(U128(0xcfeda3d076974566uL, 0xa922a9086cd49dfauL))

public val GUID_PROCESSOR_PERF_AUTONOMOUS_MODE: Guid = Guid.fromU128(U128(0x8baa4a8a14c64451uL, 0x8e8b14bdbd197537uL))

public val GUID_PROCESSOR_PERF_BOOST_MODE: Guid = Guid.fromU128(U128(0xbe3372380d824146uL, 0xa9604f3749d470c7uL))

public val GUID_PROCESSOR_PERF_BOOST_POLICY: Guid = Guid.fromU128(U128(0x45bcc044d88543e2uL, 0x8605ee0ec6e96b59uL))

public val GUID_PROCESSOR_PERF_CORE_PARKING_HISTORY: Guid = Guid.fromU128(U128(0x77d7f2828f1a42cduL, 0x853745450a839be8uL))

public val GUID_PROCESSOR_PERF_DECREASE_HISTORY: Guid = Guid.fromU128(U128(0x300f6f8abd645a9uL, 0xb74f4908691a40b5uL))

public val GUID_PROCESSOR_PERF_DECREASE_POLICY: Guid = Guid.fromU128(U128(0x40fbefc72e9d4d25uL, 0xa1850cfd8574bac6uL))

public val GUID_PROCESSOR_PERF_DECREASE_POLICY_1: Guid = Guid.fromU128(U128(0x40fbefc72e9d4d25uL, 0xa1850cfd8574bac7uL))

public val GUID_PROCESSOR_PERF_DECREASE_THRESHOLD: Guid = Guid.fromU128(U128(0x12a0ab44fe284fa9uL, 0xb3bd4b64f44960a6uL))

public val GUID_PROCESSOR_PERF_DECREASE_THRESHOLD_1: Guid = Guid.fromU128(U128(0x12a0ab44fe284fa9uL, 0xb3bd4b64f44960a7uL))

public val GUID_PROCESSOR_PERF_DECREASE_TIME: Guid = Guid.fromU128(U128(0xd8edeb9b95cf4f95uL, 0xa73cb061973693c8uL))

public val GUID_PROCESSOR_PERF_DECREASE_TIME_1: Guid = Guid.fromU128(U128(0xd8edeb9b95cf4f95uL, 0xa73cb061973693c9uL))

public val GUID_PROCESSOR_PERF_ENERGY_PERFORMANCE_PREFERENCE: Guid = Guid.fromU128(U128(0x36687f9ee3a54dbfuL, 0xb1dc15eb381c6863uL))

public val GUID_PROCESSOR_PERF_ENERGY_PERFORMANCE_PREFERENCE_1: Guid = Guid.fromU128(U128(0x36687f9ee3a54dbfuL, 0xb1dc15eb381c6864uL))

public val GUID_PROCESSOR_PERF_HISTORY: Guid = Guid.fromU128(U128(0x7d24baa70b84480fuL, 0x840c1b0743c00f5fuL))

public val GUID_PROCESSOR_PERF_HISTORY_1: Guid = Guid.fromU128(U128(0x7d24baa70b84480fuL, 0x840c1b0743c00f60uL))

public val GUID_PROCESSOR_PERF_INCREASE_HISTORY: Guid = Guid.fromU128(U128(0x99b3ef01752f46a1uL, 0x80fb7730011f2354uL))

public val GUID_PROCESSOR_PERF_INCREASE_POLICY: Guid = Guid.fromU128(U128(0x465e1f50b610473auL, 0xab5800d1077dc418uL))

public val GUID_PROCESSOR_PERF_INCREASE_POLICY_1: Guid = Guid.fromU128(U128(0x465e1f50b610473auL, 0xab5800d1077dc419uL))

public val GUID_PROCESSOR_PERF_INCREASE_THRESHOLD: Guid = Guid.fromU128(U128(0x6cadf0e64ed448auL, 0x8927ce7bf90eb35duL))

public val GUID_PROCESSOR_PERF_INCREASE_THRESHOLD_1: Guid = Guid.fromU128(U128(0x6cadf0e64ed448auL, 0x8927ce7bf90eb35euL))

public val GUID_PROCESSOR_PERF_INCREASE_TIME: Guid = Guid.fromU128(U128(0x984cf4923bed4488uL, 0xa8f94286c97bf5aauL))

public val GUID_PROCESSOR_PERF_INCREASE_TIME_1: Guid = Guid.fromU128(U128(0x984cf4923bed4488uL, 0xa8f94286c97bf5abuL))

public val GUID_PROCESSOR_PERF_LATENCY_HINT: Guid = Guid.fromU128(U128(0x822df319c83441cuL, 0xa0790de4cf009c7buL))

public val GUID_PROCESSOR_PERF_LATENCY_HINT_PERF: Guid = Guid.fromU128(U128(0x619b7505003b4e82uL, 0xb7a64dd29c300971uL))

public val GUID_PROCESSOR_PERF_LATENCY_HINT_PERF_1: Guid = Guid.fromU128(U128(0x619b7505003b4e82uL, 0xb7a64dd29c300972uL))

public val GUID_PROCESSOR_PERF_TIME_CHECK: Guid = Guid.fromU128(U128(0x4d2b01527d5c498buL, 0x88e234345392a2c5uL))

public val GUID_PROCESSOR_RESPONSIVENESS_DISABLE_THRESHOLD: Guid = Guid.fromU128(U128(0x38b8383dcce04c79uL, 0x9e3e56a4f17cc480uL))

public val GUID_PROCESSOR_RESPONSIVENESS_DISABLE_THRESHOLD_1: Guid = Guid.fromU128(U128(0x38b8383dcce04c79uL, 0x9e3e56a4f17cc481uL))

public val GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME: Guid = Guid.fromU128(U128(0xf565999f3fb0411auL, 0xa2263f0198dec130uL))

public val GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME_1: Guid = Guid.fromU128(U128(0xf565999f3fb0411auL, 0xa2263f0198dec131uL))

public val GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD: Guid = Guid.fromU128(U128(0x3d44e25672224415uL, 0xa9ed9c45fa3dd830uL))

public val GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD_1: Guid = Guid.fromU128(U128(0x3d44e25672224415uL, 0xa9ed9c45fa3dd831uL))

public val GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME: Guid = Guid.fromU128(U128(0x3d915188783049aeuL, 0xa79a0fb0a1e5a200uL))

public val GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME_1: Guid = Guid.fromU128(U128(0x3d915188783049aeuL, 0xa79a0fb0a1e5a201uL))

public val GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING: Guid = Guid.fromU128(U128(0x4427c73b97564a5cuL, 0xb84bc7bda79c7320uL))

public val GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING_1: Guid = Guid.fromU128(U128(0x4427c73b97564a5cuL, 0xb84bc7bda79c7321uL))

public val GUID_PROCESSOR_RESPONSIVENESS_PERF_FLOOR: Guid = Guid.fromU128(U128(0xce8e92ee6a864572uL, 0xbfe020c21d03cd40uL))

public val GUID_PROCESSOR_RESPONSIVENESS_PERF_FLOOR_1: Guid = Guid.fromU128(U128(0xce8e92ee6a864572uL, 0xbfe020c21d03cd41uL))

public val GUID_PROCESSOR_SETTINGS_SUBGROUP: Guid = Guid.fromU128(U128(0x5453325182be4824uL, 0x96c147b60b740d00uL))

public val GUID_PROCESSOR_SHORT_THREAD_ARCH_CLASS_LOWER_THRESHOLD: Guid = Guid.fromU128(U128(0x53824d4687bd4739uL, 0xaa1baa793fac36d6uL))

public val GUID_PROCESSOR_SHORT_THREAD_ARCH_CLASS_UPPER_THRESHOLD: Guid = Guid.fromU128(U128(0x828423eb86624344uL, 0x90f752bf15870f5auL))

public val GUID_PROCESSOR_SHORT_THREAD_RUNTIME_THRESHOLD: Guid = Guid.fromU128(U128(0xd92998c26a4849cauL, 0x85d48cceec294570uL))

public val GUID_PROCESSOR_SHORT_THREAD_SCHEDULING_POLICY: Guid = Guid.fromU128(U128(0xbae08b812d5e4688uL, 0xad6a13243356654buL))

public val GUID_PROCESSOR_SMT_UNPARKING_POLICY: Guid = Guid.fromU128(U128(0xb28a6829c5f7444euL, 0x8f6110e24e85c532uL))

public val GUID_PROCESSOR_SOFT_PARKING_LATENCY: Guid = Guid.fromU128(U128(0x97cfac41221747ebuL, 0x992d618b1977c907uL))

public val GUID_PROCESSOR_THREAD_SCHEDULING_POLICY: Guid = Guid.fromU128(U128(0x93b8b6dc06984d1cuL, 0x9ee40644e900c85duL))

public val GUID_PROCESSOR_THROTTLE_MAXIMUM: Guid = Guid.fromU128(U128(0xbc5038f723e04960uL, 0x96da33abaf5935ecuL))

public val GUID_PROCESSOR_THROTTLE_MAXIMUM_1: Guid = Guid.fromU128(U128(0xbc5038f723e04960uL, 0x96da33abaf5935eduL))

public val GUID_PROCESSOR_THROTTLE_MINIMUM: Guid = Guid.fromU128(U128(0x893dee8e2bef41e0uL, 0x89c6b55d0929964cuL))

public val GUID_PROCESSOR_THROTTLE_MINIMUM_1: Guid = Guid.fromU128(U128(0x893dee8e2bef41e0uL, 0x89c6b55d0929964duL))

public val GUID_PROCESSOR_THROTTLE_POLICY: Guid = Guid.fromU128(U128(0x570273044af64104uL, 0x9260e3d95248fc36uL))

public val GUID_SESSION_DISPLAY_STATUS: Guid = Guid.fromU128(U128(0x2b84c20ead234ddfuL, 0x93db05ffbd7efca5uL))

public val GUID_SESSION_USER_PRESENCE: Guid = Guid.fromU128(U128(0x3c0f4548c03f4c4duL, 0xb9f2237ede686376uL))

public val GUID_SLEEPBUTTON_ACTION: Guid = Guid.fromU128(U128(0x96996bc0ad5047ecuL, 0x923b6f41874dd9ebuL))

public val GUID_SLEEP_IDLE_THRESHOLD: Guid = Guid.fromU128(U128(0x81cd32e0783344f3uL, 0x87377081f38d1f70uL))

public val GUID_SLEEP_SUBGROUP: Guid = Guid.fromU128(U128(0x238c9fa80aad41eduL, 0x83f497be242c8f20uL))

public val GUID_SPR_ACTIVE_SESSION_CHANGE: Guid = Guid.fromU128(U128(0xe24ce38c3934742uL, 0xbdb1744f4b9ee08euL))

public val GUID_STANDBY_BUDGET_GRACE_PERIOD: Guid = Guid.fromU128(U128(0x60c07fe1055645cfuL, 0x9903d56e32210242uL))

public val GUID_STANDBY_BUDGET_PERCENT: Guid = Guid.fromU128(U128(0x9fe527be1b7048dauL, 0x930d7bcf17b44990uL))

public val GUID_STANDBY_RESERVE_GRACE_PERIOD: Guid = Guid.fromU128(U128(0xc763ee9271e84127uL, 0x84ebf6ed043a3e3duL))

public val GUID_STANDBY_RESERVE_TIME: Guid = Guid.fromU128(U128(0x468fe7e5115846ecuL, 0x88bc5b96c9e44fd0uL))

public val GUID_STANDBY_RESET_PERCENT: Guid = Guid.fromU128(U128(0x49cb11a556e24afbuL, 0x9d383df47872e21buL))

public val GUID_STANDBY_TIMEOUT: Guid = Guid.fromU128(U128(0x29f6c1db86da48c5uL, 0x9fdbf2b67b1f44dauL))

public val GUID_SYSTEM_AWAYMODE: Guid = Guid.fromU128(U128(0x98a7f58001f748aauL, 0x9c0f44352c29e5c0uL))

public val GUID_SYSTEM_BUTTON_SUBGROUP: Guid = Guid.fromU128(U128(0x4f971e89eebd4455uL, 0xa8de9e59040e7347uL))

public val GUID_SYSTEM_COOLING_POLICY: Guid = Guid.fromU128(U128(0x94d3a615a8994ac5uL, 0xae2be4d8f634367fuL))

public val GUID_TYPICAL_POWER_SAVINGS: Guid = Guid.fromU128(U128(0x381b4222f69441f0uL, 0x9685ff5bb260df2euL))

public val GUID_UNATTEND_SLEEP_TIMEOUT: Guid = Guid.fromU128(U128(0x7bc4a2f9d8fc4469uL, 0xb07b33eb785aaca0uL))

public val GUID_USERINTERFACEBUTTON_ACTION: Guid = Guid.fromU128(U128(0xa70666538d6c40a8uL, 0x910ea1f54b84c7e5uL))

public val GUID_USER_PRESENCE_PREDICTION: Guid = Guid.fromU128(U128(0x82011705fb954d46uL, 0x8d354042b1d20defuL))

public val GUID_VIDEO_ADAPTIVE_DISPLAY_BRIGHTNESS: Guid = Guid.fromU128(U128(0xfbd9aa6695534097uL, 0xba44ed6e9d65eab8uL))

public val GUID_VIDEO_ADAPTIVE_PERCENT_INCREASE: Guid = Guid.fromU128(U128(0xeed904dfb1424183uL, 0xb10b5a1197a37864uL))

public val GUID_VIDEO_ADAPTIVE_POWERDOWN: Guid = Guid.fromU128(U128(0x90959d22d6a149b9uL, 0xaf93bce885ad335buL))

public val GUID_VIDEO_ANNOYANCE_TIMEOUT: Guid = Guid.fromU128(U128(0x82dbcf2dcd6740c5uL, 0xbfdc9f1a5ccd4663uL))

public val GUID_VIDEO_CONSOLE_LOCK_TIMEOUT: Guid = Guid.fromU128(U128(0x8ec4b3a5686848c2uL, 0xbe754f3044be88a7uL))

public val GUID_VIDEO_CURRENT_MONITOR_BRIGHTNESS: Guid = Guid.fromU128(U128(0x8ffee2c62d0146beuL, 0xadb9398addc5b4ffuL))

public val GUID_VIDEO_DIM_TIMEOUT: Guid = Guid.fromU128(U128(0x17aaa29b8b434b94uL, 0xaafe35f64daaf1eeuL))

public val GUID_VIDEO_POWERDOWN_TIMEOUT: Guid = Guid.fromU128(U128(0x3c0bc021c8a84e07uL, 0xa9736b14cbcb2b7euL))

public val GUID_VIDEO_SUBGROUP: Guid = Guid.fromU128(U128(0x7516b95ff7764464uL, 0x8c5306167f40cc99uL))

public val NO_SUBGROUP_GUID: Guid = Guid.fromU128(U128(0xfea3413e7e054911uL, 0x9a71700331f1c294uL))
