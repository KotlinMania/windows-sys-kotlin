package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val APPTYPE_LIBRARY: ComplusApptype = 0

public val APPTYPE_SERVER: ComplusApptype = 1

public val APPTYPE_SWC: ComplusApptype = 2

public val APPTYPE_UNKNOWN: ComplusApptype = -1

public val APP_DOMAIN_HELPER: Guid = Guid.fromU128(U128(0xef24f68914f84d92uL, 0xb4afd7b1f0e70fd4uL))

public val BYOT_SERVER_EX: Guid = Guid.fromU128(U128(0xecabb0aa7f1911d2uL, 0x978e0000f8757e2auL))

public val COM_ADMIN32BIT_COMPONENT: COMAdminComponentType = 1

public val COM_ADMIN64BIT_COMPONENT: COMAdminComponentType = 2

public val COM_ADMIN_ACCESS_CHECKS_APPLICATION_COMPONENT_LEVEL: COMAdminAccessChecksLevelOptions = 1

public val COM_ADMIN_ACCESS_CHECKS_APPLICATION_LEVEL: COMAdminAccessChecksLevelOptions = 0

public val COM_ADMIN_ACTIVATION_INPROC: COMAdminActivationOptions = 0

public val COM_ADMIN_ACTIVATION_LOCAL: COMAdminActivationOptions = 1

public val COM_ADMIN_AUTHENTICATION_CALL: COMAdminAuthenticationLevelOptions = 3

public val COM_ADMIN_AUTHENTICATION_CAPABILITIES_DYNAMIC_CLOAKING: COMAdminAuthenticationCapabilitiesOptions = 64

public val COM_ADMIN_AUTHENTICATION_CAPABILITIES_NONE: COMAdminAuthenticationCapabilitiesOptions = 0

public val COM_ADMIN_AUTHENTICATION_CAPABILITIES_SECURE_REFERENCE: COMAdminAuthenticationCapabilitiesOptions = 2

public val COM_ADMIN_AUTHENTICATION_CAPABILITIES_STATIC_CLOAKING: COMAdminAuthenticationCapabilitiesOptions = 32

public val COM_ADMIN_AUTHENTICATION_CONNECT: COMAdminAuthenticationLevelOptions = 2

public val COM_ADMIN_AUTHENTICATION_DEFAULT: COMAdminAuthenticationLevelOptions = 0

public val COM_ADMIN_AUTHENTICATION_INTEGRITY: COMAdminAuthenticationLevelOptions = 5

public val COM_ADMIN_AUTHENTICATION_NONE: COMAdminAuthenticationLevelOptions = 1

public val COM_ADMIN_AUTHENTICATION_PACKET: COMAdminAuthenticationLevelOptions = 4

public val COM_ADMIN_AUTHENTICATION_PRIVACY: COMAdminAuthenticationLevelOptions = 6

public val COM_ADMIN_CATALOG: Guid = Guid.fromU128(U128(0xf618c514dfb811d1uL, 0xa2cf00805fc79235uL))

public val COM_ADMIN_CATALOG_COLLECTION: Guid = Guid.fromU128(U128(0xf618c516dfb811d1uL, 0xa2cf00805fc79235uL))

public val COM_ADMIN_CATALOG_OBJECT: Guid = Guid.fromU128(U128(0xf618c515dfb811d1uL, 0xa2cf00805fc79235uL))

public val COM_ADMIN_COMP_FLAG_ALREADY_INSTALLED: COMAdminComponentFlags = 16

public val COM_ADMIN_COMP_FLAG_COM_PLUS_PROPERTIES_FOUND: COMAdminComponentFlags = 2

public val COM_ADMIN_COMP_FLAG_INTERFACES_FOUND: COMAdminComponentFlags = 8

public val COM_ADMIN_COMP_FLAG_NOT_IN_APPLICATION: COMAdminComponentFlags = 32

public val COM_ADMIN_COMP_FLAG_PROXY_FOUND: COMAdminComponentFlags = 4

public val COM_ADMIN_COMP_FLAG_TYPE_INFO_FOUND: COMAdminComponentFlags = 1

public val COM_ADMIN_ERR_ALREADY_INSTALLED: COMAdminErrorCodes = -2146368508

public val COM_ADMIN_ERR_APP_DIR_NOT_FOUND: COMAdminErrorCodes = -2146368481

public val COM_ADMIN_ERR_APP_FILE_READ_FAIL: COMAdminErrorCodes = -2146368504

public val COM_ADMIN_ERR_APP_FILE_VERSION: COMAdminErrorCodes = -2146368503

public val COM_ADMIN_ERR_APP_FILE_WRITE_FAIL: COMAdminErrorCodes = -2146368505

public val COM_ADMIN_ERR_APP_NOT_RUNNING: COMAdminErrorCodes = -2146367478

public val COM_ADMIN_ERR_APPLICATION_EXISTS: COMAdminErrorCodes = -2146368501

public val COM_ADMIN_ERR_APPLID_MATCHES_CLSID: COMAdminErrorCodes = -2146368442

public val COM_ADMIN_ERR_AUTHENTICATION_LEVEL: COMAdminErrorCodes = -2146368493

public val COM_ADMIN_ERR_BAD_PATH: COMAdminErrorCodes = -2146368502

public val COM_ADMIN_ERR_BAD_REGISTRY_LIB_ID: COMAdminErrorCodes = -2146368482

public val COM_ADMIN_ERR_BAD_REGISTRY_PROG_ID: COMAdminErrorCodes = -2146368494

public val COM_ADMIN_ERR_BASE_PARTITION_ONLY: COMAdminErrorCodes = -2146368432

public val COM_ADMIN_ERR_CLSID_OR_IID_MISMATCH: COMAdminErrorCodes = -2146368488

public val COM_ADMIN_ERR_CAN_NOT_EXPORT_APP_PROXY: COMAdminErrorCodes = -2146368438

public val COM_ADMIN_ERR_CAN_NOT_EXPORT_SYSTEM_APP: COMAdminErrorCodes = -2146368436

public val COM_ADMIN_ERR_CAN_NOT_START_APP: COMAdminErrorCodes = -2146368437

public val COM_ADMIN_ERR_CAN_NOT_SUBSCRIBE_TO_COMPONENT: COMAdminErrorCodes = -2146368435

public val COM_ADMIN_ERR_CANNOT_COPY_EVENT_CLASS: COMAdminErrorCodes = -2146367456

public val COM_ADMIN_ERR_CANT_COPY_FILE: COMAdminErrorCodes = -2146368499

public val COM_ADMIN_ERR_CANT_RECYCLE_LIBRARY_APPS: COMAdminErrorCodes = -2146367473

public val COM_ADMIN_ERR_CANT_RECYCLE_SERVICE_APPS: COMAdminErrorCodes = -2146367471

public val COM_ADMIN_ERR_CAT_BITNESS_MISMATCH: COMAdminErrorCodes = -2146368382

public val COM_ADMIN_ERR_CAT_PAUSE_RESUME_NOT_SUPPORTED: COMAdminErrorCodes = -2146368379

public val COM_ADMIN_ERR_CAT_SERVER_FAULT: COMAdminErrorCodes = -2146368378

public val COM_ADMIN_ERR_CAT_UNACCEPTABLE_BITNESS: COMAdminErrorCodes = -2146368381

public val COM_ADMIN_ERR_CAT_WRONG_APP_BITNESS_BITNESS: COMAdminErrorCodes = -2146368380

public val COM_ADMIN_ERR_CO_REQ_COMP_INSTALLED: COMAdminErrorCodes = -2146368459

public val COM_ADMIN_ERR_COMP_FILE_BAD_TLB: COMAdminErrorCodes = -2146368472

public val COM_ADMIN_ERR_COMP_FILE_CLASS_NOT_AVAIL: COMAdminErrorCodes = -2146368473

public val COM_ADMIN_ERR_COMP_FILE_DOES_NOT_EXIST: COMAdminErrorCodes = -2146368476

public val COM_ADMIN_ERR_COMP_FILE_GET_CLASS_OBJ: COMAdminErrorCodes = -2146368474

public val COM_ADMIN_ERR_COMP_FILE_LOAD_DLL_FAIL: COMAdminErrorCodes = -2146368475

public val COM_ADMIN_ERR_COMP_FILE_NO_REGISTRAR: COMAdminErrorCodes = -2146368460

public val COM_ADMIN_ERR_COMP_FILE_NOT_INSTALLABLE: COMAdminErrorCodes = -2146368471

public val COM_ADMIN_ERR_COMP_MOVE_BAD_DEST: COMAdminErrorCodes = -2146368466

public val COM_ADMIN_ERR_COMP_MOVE_DEST: COMAdminErrorCodes = -2146367459

public val COM_ADMIN_ERR_COMP_MOVE_LOCKED: COMAdminErrorCodes = -2146368467

public val COM_ADMIN_ERR_COMP_MOVE_PRIVATE: COMAdminErrorCodes = -2146367458

public val COM_ADMIN_ERR_COMP_MOVE_SOURCE: COMAdminErrorCodes = -2146367460

public val COM_ADMIN_ERR_COMPONENT_EXISTS: COMAdminErrorCodes = -2146368455

public val COM_ADMIN_ERR_DLL_LOAD_FAILED: COMAdminErrorCodes = -2146368483

public val COM_ADMIN_ERR_DLL_REGISTER_SERVER: COMAdminErrorCodes = -2146368486

public val COM_ADMIN_ERR_DUPLICATE_PARTITION_NAME: COMAdminErrorCodes = -2146368425

public val COM_ADMIN_ERR_EVENT_CLASS_CANNOT_BE_SUBSCRIBER: COMAdminErrorCodes = -2146368434

public val COM_ADMIN_ERR_IMPORTED_COMPONENTS_NOT_ALLOWED: COMAdminErrorCodes = -2146368421

public val COM_ADMIN_ERR_INVALID_PARTITION: COMAdminErrorCodes = -2146367477

public val COM_ADMIN_ERR_INVALID_USERIDS: COMAdminErrorCodes = -2146368496

public val COM_ADMIN_ERR_KEY_MISSING: COMAdminErrorCodes = -2146368509

public val COM_ADMIN_ERR_LIB_APP_PROXY_INCOMPATIBLE: COMAdminErrorCodes = -2146368433

public val COM_ADMIN_ERR_MIG_SCHEMA_NOT_FOUND: COMAdminErrorCodes = -2146368383

public val COM_ADMIN_ERR_MIG_VERSION_NOT_SUPPORTED: COMAdminErrorCodes = -2146368384

public val COM_ADMIN_ERR_NO_REGISTRY_CLSID: COMAdminErrorCodes = -2146368495

public val COM_ADMIN_ERR_NO_SERVER_SHARE: COMAdminErrorCodes = -2146368485

public val COM_ADMIN_ERR_NO_USER: COMAdminErrorCodes = -2146368497

public val COM_ADMIN_ERR_NOT_CHANGEABLE: COMAdminErrorCodes = -2146368470

public val COM_ADMIN_ERR_NOT_DELETABLE: COMAdminErrorCodes = -2146368469

public val COM_ADMIN_ERR_NOT_IN_REGISTRY: COMAdminErrorCodes = -2146368450

public val COM_ADMIN_ERR_OBJECT_DOES_NOT_EXIST: COMAdminErrorCodes = -2146367479

public val COM_ADMIN_ERR_OBJECT_ERRORS: COMAdminErrorCodes = -2146368511

public val COM_ADMIN_ERR_OBJECT_EXISTS: COMAdminErrorCodes = -2146368456

public val COM_ADMIN_ERR_OBJECT_INVALID: COMAdminErrorCodes = -2146368510

public val COM_ADMIN_ERR_OBJECT_NOT_POOLABLE: COMAdminErrorCodes = -2146368449

public val COM_ADMIN_ERR_OBJECT_PARENT_MISSING: COMAdminErrorCodes = -2146367480

public val COM_ADMIN_ERR_PARTITION_IN_USE: COMAdminErrorCodes = -2146368423

public val COM_ADMIN_ERR_PARTITION_MSI_ONLY: COMAdminErrorCodes = -2146367463

public val COM_ADMIN_ERR_PAUSED_PROCESS_MAY_NOT_BE_RECYCLED: COMAdminErrorCodes = -2146367469

public val COM_ADMIN_ERR_PROCESS_ALREADY_RECYCLED: COMAdminErrorCodes = -2146367470

public val COM_ADMIN_ERR_PROPERTY_OVERFLOW: COMAdminErrorCodes = -2146368452

public val COM_ADMIN_ERR_PROPERTY_SAVE_FAILED: COMAdminErrorCodes = -2146368457

public val COM_ADMIN_ERR_QUEUING_SERVICE_NOT_AVAILABLE: COMAdminErrorCodes = -2146367998

public val COM_ADMIN_ERR_REG_FILE_CORRUPT: COMAdminErrorCodes = -2146368453

public val COM_ADMIN_ERR_REGDB_ALREADY_RUNNING: COMAdminErrorCodes = -2146368395

public val COM_ADMIN_ERR_REGDB_NOT_INITIALIZED: COMAdminErrorCodes = -2146368398

public val COM_ADMIN_ERR_REGDB_NOT_OPEN: COMAdminErrorCodes = -2146368397

public val COM_ADMIN_ERR_REGDB_SYSTEM_ERR: COMAdminErrorCodes = -2146368396

public val COM_ADMIN_ERR_REGISTER_TLB: COMAdminErrorCodes = -2146368464

public val COM_ADMIN_ERR_REGISTRAR_FAILED: COMAdminErrorCodes = -2146368477

public val COM_ADMIN_ERR_REMOTE_INTERFACE: COMAdminErrorCodes = -2146368487

public val COM_ADMIN_ERR_REQUIRES_DIFFERENT_PLATFORM: COMAdminErrorCodes = -2146368439

public val COM_ADMIN_ERR_ROLE_DOES_NOT_EXIST: COMAdminErrorCodes = -2146368441

public val COM_ADMIN_ERR_ROLE_EXISTS: COMAdminErrorCodes = -2146368500

public val COM_ADMIN_ERR_SERVICE_NOT_INSTALLED: COMAdminErrorCodes = -2146368458

public val COM_ADMIN_ERR_SESSION: COMAdminErrorCodes = -2146368468

public val COM_ADMIN_ERR_START_APP_DISABLED: COMAdminErrorCodes = -2146368431

public val COM_ADMIN_ERR_START_APP_NEEDS_COMPONENTS: COMAdminErrorCodes = -2146368440

public val COM_ADMIN_ERR_SYSTEM_APP: COMAdminErrorCodes = -2146368461

public val COM_ADMIN_ERR_USER_PASSWD_NOT_VALID: COMAdminErrorCodes = -2146368492

public val COM_ADMIN_EXPORT_APPLICATION_PROXY: COMAdminApplicationExportOptions = 2

public val COM_ADMIN_EXPORT_FORCE_OVERWRITE_OF_FILES: COMAdminApplicationExportOptions = 4

public val COM_ADMIN_EXPORT_IN10FORMAT: COMAdminApplicationExportOptions = 16

public val COM_ADMIN_EXPORT_NO_USERS: COMAdminApplicationExportOptions = 0

public val COM_ADMIN_EXPORT_USERS: COMAdminApplicationExportOptions = 1

public val COM_ADMIN_FILE_FLAG_ALREADY_INSTALLED: COMAdminFileFlags = 512

public val COM_ADMIN_FILE_FLAG_BAD_TLB: COMAdminFileFlags = 1024

public val COM_ADMIN_FILE_FLAG_COM: COMAdminFileFlags = 2

public val COM_ADMIN_FILE_FLAG_CLASS_NOT_AVAILABLE: COMAdminFileFlags = 4096

public val COM_ADMIN_FILE_FLAG_CONTAINS_COMP: COMAdminFileFlags = 8

public val COM_ADMIN_FILE_FLAG_CONTAINS_PS: COMAdminFileFlags = 4

public val COM_ADMIN_FILE_FLAG_CONTAINS_TLB: COMAdminFileFlags = 16

public val COM_ADMIN_FILE_FLAG_DLL_REGSVR_FAILED: COMAdminFileFlags = 32768

public val COM_ADMIN_FILE_FLAG_DOES_NOT_EXIST: COMAdminFileFlags = 256

public val COM_ADMIN_FILE_FLAG_ERROR: COMAdminFileFlags = 262144

public val COM_ADMIN_FILE_FLAG_GET_CLASS_OBJ_FAILED: COMAdminFileFlags = 2048

public val COM_ADMIN_FILE_FLAG_LOADABLE: COMAdminFileFlags = 1

public val COM_ADMIN_FILE_FLAG_NO_REGISTRAR: COMAdminFileFlags = 16384

public val COM_ADMIN_FILE_FLAG_REG_TLB_FAILED: COMAdminFileFlags = 65536

public val COM_ADMIN_FILE_FLAG_REGISTRAR: COMAdminFileFlags = 8192

public val COM_ADMIN_FILE_FLAG_REGISTRAR_FAILED: COMAdminFileFlags = 131072

public val COM_ADMIN_FILE_FLAG_SELF_REG: COMAdminFileFlags = 32

public val COM_ADMIN_FILE_FLAG_SELF_UN_REG: COMAdminFileFlags = 64

public val COM_ADMIN_FILE_FLAG_UNLOADABLE_DLL: COMAdminFileFlags = 128

public val COM_ADMIN_IMPERSONATION_ANONYMOUS: COMAdminImpersonationLevelOptions = 1

public val COM_ADMIN_IMPERSONATION_DELEGATE: COMAdminImpersonationLevelOptions = 4

public val COM_ADMIN_IMPERSONATION_IDENTIFY: COMAdminImpersonationLevelOptions = 2

public val COM_ADMIN_IMPERSONATION_IMPERSONATE: COMAdminImpersonationLevelOptions = 3

public val COM_ADMIN_IN_USE_BY_CATALOG: COMAdminInUse = 1

public val COM_ADMIN_IN_USE_BY_REGISTRY_CLSID: COMAdminInUse = 5

public val COM_ADMIN_IN_USE_BY_REGISTRY_PROXY_STUB: COMAdminInUse = 3

public val COM_ADMIN_IN_USE_BY_REGISTRY_TYPE_LIB: COMAdminInUse = 4

public val COM_ADMIN_IN_USE_BY_REGISTRY_UNKNOWN: COMAdminInUse = 2

public val COM_ADMIN_INSTALL_FORCE_OVERWRITE_OF_FILES: COMAdminApplicationInstallOptions = 2

public val COM_ADMIN_INSTALL_NO_USERS: COMAdminApplicationInstallOptions = 0

public val COM_ADMIN_INSTALL_USERS: COMAdminApplicationInstallOptions = 1

public val COM_ADMIN_NOT_IN_USE: COMAdminInUse = 0

public val COM_ADMIN_OS_NOT_INITIALIZED: COMAdminOS = 0

public val COM_ADMIN_OS_UNKNOWN: COMAdminOS = 6

public val COM_ADMIN_OS_WINDOWS2000: COMAdminOS = 3

public val COM_ADMIN_OS_WINDOWS2000ADVANCED_SERVER: COMAdminOS = 4

public val COM_ADMIN_OS_WINDOWS2000UNKNOWN: COMAdminOS = 5

public val COM_ADMIN_OS_WINDOWS3_1: COMAdminOS = 1

public val COM_ADMIN_OS_WINDOWS7DATACENTER_SERVER: COMAdminOS = 27

public val COM_ADMIN_OS_WINDOWS7ENTERPRISE_SERVER: COMAdminOS = 26

public val COM_ADMIN_OS_WINDOWS7PERSONAL: COMAdminOS = 23

public val COM_ADMIN_OS_WINDOWS7PROFESSIONAL: COMAdminOS = 24

public val COM_ADMIN_OS_WINDOWS7STANDARD_SERVER: COMAdminOS = 25

public val COM_ADMIN_OS_WINDOWS7WEB_SERVER: COMAdminOS = 28

public val COM_ADMIN_OS_WINDOWS8DATACENTER_SERVER: COMAdminOS = 33

public val COM_ADMIN_OS_WINDOWS8ENTERPRISE_SERVER: COMAdminOS = 32

public val COM_ADMIN_OS_WINDOWS8PERSONAL: COMAdminOS = 29

public val COM_ADMIN_OS_WINDOWS8PROFESSIONAL: COMAdminOS = 30

public val COM_ADMIN_OS_WINDOWS8STANDARD_SERVER: COMAdminOS = 31

public val COM_ADMIN_OS_WINDOWS8WEB_SERVER: COMAdminOS = 34

public val COM_ADMIN_OS_WINDOWS9X: COMAdminOS = 2

public val COM_ADMIN_OS_WINDOWS_BLUE_DATACENTER_SERVER: COMAdminOS = 39

public val COM_ADMIN_OS_WINDOWS_BLUE_ENTERPRISE_SERVER: COMAdminOS = 38

public val COM_ADMIN_OS_WINDOWS_BLUE_PERSONAL: COMAdminOS = 35

public val COM_ADMIN_OS_WINDOWS_BLUE_PROFESSIONAL: COMAdminOS = 36

public val COM_ADMIN_OS_WINDOWS_BLUE_STANDARD_SERVER: COMAdminOS = 37

public val COM_ADMIN_OS_WINDOWS_BLUE_WEB_SERVER: COMAdminOS = 40

public val COM_ADMIN_OS_WINDOWS_LONGHORN_DATACENTER_SERVER: COMAdminOS = 21

public val COM_ADMIN_OS_WINDOWS_LONGHORN_ENTERPRISE_SERVER: COMAdminOS = 20

public val COM_ADMIN_OS_WINDOWS_LONGHORN_PERSONAL: COMAdminOS = 17

public val COM_ADMIN_OS_WINDOWS_LONGHORN_PROFESSIONAL: COMAdminOS = 18

public val COM_ADMIN_OS_WINDOWS_LONGHORN_STANDARD_SERVER: COMAdminOS = 19

public val COM_ADMIN_OS_WINDOWS_LONGHORN_WEB_SERVER: COMAdminOS = 22

public val COM_ADMIN_OS_WINDOWS_NET_DATACENTER_SERVER: COMAdminOS = 15

public val COM_ADMIN_OS_WINDOWS_NET_ENTERPRISE_SERVER: COMAdminOS = 14

public val COM_ADMIN_OS_WINDOWS_NET_STANDARD_SERVER: COMAdminOS = 13

public val COM_ADMIN_OS_WINDOWS_NET_WEB_SERVER: COMAdminOS = 16

public val COM_ADMIN_OS_WINDOWS_XP_PERSONAL: COMAdminOS = 11

public val COM_ADMIN_OS_WINDOWS_XP_PROFESSIONAL: COMAdminOS = 12

public val COM_ADMIN_QC_MESSAGE_AUTHENTICATE_OFF: COMAdminQCMessageAuthenticateOptions = 1

public val COM_ADMIN_QC_MESSAGE_AUTHENTICATE_ON: COMAdminQCMessageAuthenticateOptions = 2

public val COM_ADMIN_QC_MESSAGE_AUTHENTICATE_SECURE_APPS: COMAdminQCMessageAuthenticateOptions = 0

public val COM_ADMIN_SERVICE_CONTINUE_PENDING: COMAdminServiceStatusOptions = 4

public val COM_ADMIN_SERVICE_LOAD_BALANCE_ROUTER: COMAdminServiceOptions = 1

public val COM_ADMIN_SERVICE_PAUSE_PENDING: COMAdminServiceStatusOptions = 5

public val COM_ADMIN_SERVICE_PAUSED: COMAdminServiceStatusOptions = 6

public val COM_ADMIN_SERVICE_RUNNING: COMAdminServiceStatusOptions = 3

public val COM_ADMIN_SERVICE_START_PENDING: COMAdminServiceStatusOptions = 1

public val COM_ADMIN_SERVICE_STOP_PENDING: COMAdminServiceStatusOptions = 2

public val COM_ADMIN_SERVICE_STOPPED: COMAdminServiceStatusOptions = 0

public val COM_ADMIN_SERVICE_UNKNOWN_STATE: COMAdminServiceStatusOptions = 7

public val COM_ADMIN_SYNCHRONIZATION_IGNORED: COMAdminSynchronizationOptions = 0

public val COM_ADMIN_SYNCHRONIZATION_NONE: COMAdminSynchronizationOptions = 1

public val COM_ADMIN_SYNCHRONIZATION_REQUIRED: COMAdminSynchronizationOptions = 3

public val COM_ADMIN_SYNCHRONIZATION_REQUIRES_NEW: COMAdminSynchronizationOptions = 4

public val COM_ADMIN_SYNCHRONIZATION_SUPPORTED: COMAdminSynchronizationOptions = 2

public val COM_ADMIN_THREADING_MODEL_APARTMENT: COMAdminThreadingModels = 0

public val COM_ADMIN_THREADING_MODEL_BOTH: COMAdminThreadingModels = 3

public val COM_ADMIN_THREADING_MODEL_FREE: COMAdminThreadingModels = 1

public val COM_ADMIN_THREADING_MODEL_MAIN: COMAdminThreadingModels = 2

public val COM_ADMIN_THREADING_MODEL_NEUTRAL: COMAdminThreadingModels = 4

public val COM_ADMIN_THREADING_MODEL_NOT_SPECIFIED: COMAdminThreadingModels = 5

public val COM_ADMIN_TRANSACTION_IGNORED: COMAdminTransactionOptions = 0

public val COM_ADMIN_TRANSACTION_NONE: COMAdminTransactionOptions = 1

public val COM_ADMIN_TRANSACTION_REQUIRED: COMAdminTransactionOptions = 3

public val COM_ADMIN_TRANSACTION_REQUIRES_NEW: COMAdminTransactionOptions = 4

public val COM_ADMIN_TRANSACTION_SUPPORTED: COMAdminTransactionOptions = 2

public val COM_ADMIN_TX_ISOLATION_LEVEL_ANY: COMAdminTxIsolationLevelOptions = 0

public val COM_ADMIN_TX_ISOLATION_LEVEL_READ_COMMITTED: COMAdminTxIsolationLevelOptions = 2

public val COM_ADMIN_TX_ISOLATION_LEVEL_READ_UN_COMMITTED: COMAdminTxIsolationLevelOptions = 1

public val COM_ADMIN_TX_ISOLATION_LEVEL_REPEATABLE_READ: COMAdminTxIsolationLevelOptions = 3

public val COM_ADMIN_TX_ISOLATION_LEVEL_SERIALIZABLE: COMAdminTxIsolationLevelOptions = 4

public val COM_EVENTS: Guid = Guid.fromU128(U128(0xecabb0ab7f1911d2uL, 0x978e0000f8757e2auL))

public val CRM_CLERK: Guid = Guid.fromU128(U128(0xecabb0bd7f1911d2uL, 0x978e0000f8757e2auL))

public val CRMFLAG_FORGETTARGET: Crmflags = 1

public val CRMFLAG_REPLAYINPROGRESS: Crmflags = 64

public val CRMFLAG_WRITTENDURINGABORT: Crmflags = 8

public val CRMFLAG_WRITTENDURINGCOMMIT: Crmflags = 4

public val CRMFLAG_WRITTENDURINGPREPARE: Crmflags = 2

public val CRMFLAG_WRITTENDURINGRECOVERY: Crmflags = 16

public val CRMFLAG_WRITTENDURINGREPLAY: Crmflags = 32

public val CRMREGFLAG_ABORTPHASE: Crmregflags = 4

public val CRMREGFLAG_ALLPHASES: Crmregflags = 7

public val CRMREGFLAG_COMMITPHASE: Crmregflags = 2

public val CRMREGFLAG_FAILIFINDOUBTSREMAIN: Crmregflags = 16

public val CRMREGFLAG_PREPAREPHASE: Crmregflags = 1

public val CRM_RECOVERY_CLERK: Guid = Guid.fromU128(U128(0xecabb0be7f1911d2uL, 0x978e0000f8757e2auL))

public val CRR_ACTIVATION_LIMIT: UInt = 4294967294u

public val CRR_CALL_LIMIT: UInt = 4294967293u

public val CRR_LIFETIME_LIMIT: UInt = 4294967295u

public val CRR_MEMORY_LIMIT: UInt = 4294967292u

public val CRR_NO_REASON_SUPPLIED: UInt = 0u

public val CRR_RECYCLED_FROM_UI: UInt = 4294967291u

public val CSC_BIND_TO_POOL_THREAD: CscBinding = 1

public val CSC_CREATE_TRANSACTION_IF_NECESSARY: CscTransactionConfig = 2

public val CSC_DONT_USE_TRACKER: CscTrackerConfig = 0

public val CSC_IF_CONTAINER_IS_SYNCHRONIZED: CscSynchronizationConfig = 1

public val CSC_IF_CONTAINER_IS_TRANSACTIONAL: CscTransactionConfig = 1

public val CSC_IGNORE: CscInheritanceConfig = 1

public val CSC_INHERIT: CscInheritanceConfig = 0

public val CSC_INHERIT_COMTI_INTRINSICS: CscComtiintrinsicsConfig = 1

public val CSC_INHERIT_IIS_INTRINSICS: CscIisintrinsicsConfig = 1

public val CSC_INHERIT_PARTITION: CscPartitionConfig = 1

public val CSC_INHERIT_SXS: CscSxsConfig = 1

public val CSC_MTA_THREAD_POOL: CscThreadPool = 3

public val CSC_NEW_PARTITION: CscPartitionConfig = 2

public val CSC_NEW_SXS: CscSxsConfig = 2

public val CSC_NEW_SYNCHRONIZATION: CscSynchronizationConfig = 3

public val CSC_NEW_SYNCHRONIZATION_IF_NECESSARY: CscSynchronizationConfig = 2

public val CSC_NEW_TRANSACTION: CscTransactionConfig = 3

public val CSC_NO_BINDING: CscBinding = 0

public val CSC_NO_COMTI_INTRINSICS: CscComtiintrinsicsConfig = 0

public val CSC_NO_IIS_INTRINSICS: CscIisintrinsicsConfig = 0

public val CSC_NO_PARTITION: CscPartitionConfig = 0

public val CSC_NO_SXS: CscSxsConfig = 0

public val CSC_NO_SYNCHRONIZATION: CscSynchronizationConfig = 0

public val CSC_NO_TRANSACTION: CscTransactionConfig = 0

public val CSC_STA_THREAD_POOL: CscThreadPool = 2

public val CSC_THREAD_POOL_INHERIT: CscThreadPool = 1

public val CSC_THREAD_POOL_NONE: CscThreadPool = 0

public val CSC_USE_TRACKER: CscTrackerConfig = 1

public val C_SERVICE_CONFIG: Guid = Guid.fromU128(U128(0xecabb0c87f1911d2uL, 0x978e0000f8757e2auL))

public val CLR_ASSEMBLY_LOCATOR: Guid = Guid.fromU128(U128(0x458aa3b5265a4b75uL, 0xbc059bea4630cf18uL))

public val CO_MTS_LOCATOR: Guid = Guid.fromU128(U128(0xecabb0ac7f1911d2uL, 0x978e0000f8757e2auL))

public val COM_SERVICE_EVENTS: Guid = Guid.fromU128(U128(0xecabb0c37f1911d2uL, 0x978e0000f8757e2auL))

public val COM_SYSTEM_APP_EVENT_DATA: Guid = Guid.fromU128(U128(0xecabb0c67f1911d2uL, 0x978e0000f8757e2auL))

public val DATA_NOT_AVAILABLE: UInt = 4294967295u

public val DUMPTYPE_FULL: Dumptype = 0

public val DUMPTYPE_MINI: Dumptype = 1

public val DUMPTYPE_NONE: Dumptype = 2

public val DISPENSER_MANAGER: Guid = Guid.fromU128(U128(0xecabb0c07f1911d2uL, 0x978e0000f8757e2auL))

public val DUMMY30040732: Guid = Guid.fromU128(U128(0xecabb0a97f1911d2uL, 0x978e0000f8757e2auL))

public val EVENT_SERVER: Guid = Guid.fromU128(U128(0xecabafbc7f1911d2uL, 0x978e0000f8757e2auL))

public val GATD_INCLUDE_APPLICATION_NAME: GetAppTrackerDataFlags = 16

public val GATD_INCLUDE_CLASS_NAME: GetAppTrackerDataFlags = 8

public val GATD_INCLUDE_LIBRARY_APPS: GetAppTrackerDataFlags = 2

public val GATD_INCLUDE_PROCESS_EXE_NAME: GetAppTrackerDataFlags = 1

public val GATD_INCLUDE_SWC: GetAppTrackerDataFlags = 4

public val GUID_STRING_SIZE: UInt = 40u

public val GET_SECURITY_CALL_CONTEXT_APP_OBJECT: Guid = Guid.fromU128(U128(0xecabb0a87f1911d2uL, 0x978e0000f8757e2auL))

public val LB_EVENTS: Guid = Guid.fromU128(U128(0xecabb0c17f1911d2uL, 0x978e0000f8757e2auL))

public val LOCK_METHOD: LockModes = 1

public val LOCK_SET_GET: LockModes = 0

public val MTXDM_E_ENLISTRESOURCEFAILED: UInt = 2147803392u

public val MESSAGE_MOVER: Guid = Guid.fromU128(U128(0xecabb0bf7f1911d2uL, 0x978e0000f8757e2auL))

public val MTS_GRP: Guid = Guid.fromU128(U128(0x4b2e958d039311d1uL, 0xb1ab00aa00ba3258uL))

public val POOL_MGR: Guid = Guid.fromU128(U128(0xecabafb57f1911d2uL, 0x978e0000f8757e2auL))

public val PROCESS: ReleaseModes = 1

public val SECURITY_CALL_CONTEXT: Guid = Guid.fromU128(U128(0xecabb0a77f1911d2uL, 0x978e0000f8757e2auL))

public val SECURITY_CALLERS: Guid = Guid.fromU128(U128(0xecabb0a67f1911d2uL, 0x978e0000f8757e2auL))

public val SECURITY_IDENTITY: Guid = Guid.fromU128(U128(0xecabb0a57f1911d2uL, 0x978e0000f8757e2auL))

public val SERVICE_POOL: Guid = Guid.fromU128(U128(0xecabb0c97f1911d2uL, 0x978e0000f8757e2auL))

public val SERVICE_POOL_CONFIG: Guid = Guid.fromU128(U128(0xecabb0ca7f1911d2uL, 0x978e0000f8757e2auL))

public val SHARED_PROPERTY: Guid = Guid.fromU128(U128(0x2a005c05a5de11cfuL, 0x9e6600aa00a3f464uL))

public val SHARED_PROPERTY_GROUP: Guid = Guid.fromU128(U128(0x2a005c0ba5de11cfuL, 0x9e6600aa00a3f464uL))

public val SHARED_PROPERTY_GROUP_MANAGER: Guid = Guid.fromU128(U128(0x2a005c11a5de11cfuL, 0x9e6600aa00a3f464uL))

public val STANDARD: ReleaseModes = 0

public val TRACKER_INIT_EVENT: Pcwstr = w("Global\\COM+ Tracker Init Event")

public val TRACKER_STARTSTOP_EVENT: Pcwstr = w("Global\\COM+ Tracker Push Event")

public val TRKCOLL_APPLICATIONS: TrackingCollType = 1

public val TRKCOLL_COMPONENTS: TrackingCollType = 2

public val TRKCOLL_PROCESSES: TrackingCollType = 0

public val TRACKER_SERVER: Guid = Guid.fromU128(U128(0xecabafb97f1911d2uL, 0x978e0000f8757e2auL))

public val TRANSACTION_CONTEXT: Guid = Guid.fromU128(U128(0x7999fc25d3c611cfuL, 0xacab00a024a55aefuL))

public val TRANSACTION_CONTEXT_EX: Guid = Guid.fromU128(U128(0x5cb66670d3d411cfuL, 0xacab00a024a55aefuL))

public val TX_ABORT: TransactionVote = 1

public val TX_COMMIT: TransactionVote = 0

public val TX_STATE_ABORTED: CrmTransactionState = 2

public val TX_STATE_ACTIVE: CrmTransactionState = 0

public val TX_STATE_COMMITTED: CrmTransactionState = 1

public val TX_STATE_INDOUBT: CrmTransactionState = 3

public val COM_QC_ERR_APPLICATION_NOT_QUEUED: AutoSvcsErrorConstants = 2148599296u

public val COM_QC_ERR_NO_QUEUEABLE_INTERFACES: AutoSvcsErrorConstants = 2148599297u

public val COM_QC_ERR_QUEUE_TRANSACT_MISMATCH: AutoSvcsErrorConstants = 2148599299u

public val COM_QC_ERR_QUEUING_SERVICE_NOT_AVAILABLE: AutoSvcsErrorConstants = 2148599298u

public val COMQC_ERR_BAD_MARSHALED_OBJECT: AutoSvcsErrorConstants = 2148599382u

public val COMQC_ERR_INVALID_MESSAGE: AutoSvcsErrorConstants = 2148599376u

public val COMQC_ERR_MARSHALED_OBJ_SAME_TXN: AutoSvcsErrorConstants = 2148599304u

public val COMQC_ERR_MSG_NOT_AUTHENTICATED: AutoSvcsErrorConstants = 2148599380u

public val COMQC_ERR_MSMQ_CONNECTOR_USED: AutoSvcsErrorConstants = 2148599381u

public val COMQC_ERR_MSMQ_SERVICE_UNAVAILABLE: AutoSvcsErrorConstants = 2148599379u

public val COMQC_ERR_MSMQ_SID_UNAVAILABLE: AutoSvcsErrorConstants = 2148599377u

public val COMQC_ERR_OUT_PARAM: AutoSvcsErrorConstants = 2148599301u

public val COMQC_ERR_PS_LOAD: AutoSvcsErrorConstants = 2148599303u

public val COMQC_ERR_RECORDER_MARSHALLED: AutoSvcsErrorConstants = 2148599300u

public val COMQC_ERR_RECORDER_NOT_TRUSTED: AutoSvcsErrorConstants = 2148599302u

public val COMQC_ERR_WRONG_MSG_EXTENSION: AutoSvcsErrorConstants = 2148599378u

public val MTS_ERR_CTX_ABORTED: AutoSvcsErrorConstants = 2147803138u

public val MTS_ERR_CTX_ABORTING: AutoSvcsErrorConstants = 2147803139u

public val MTS_ERR_CTX_NO_CONTEXT: AutoSvcsErrorConstants = 2147803140u

public val MTS_ERR_CTX_NO_SECURITY: AutoSvcsErrorConstants = 2147803149u

public val MTS_ERR_CTX_NOT_REGISTERED: AutoSvcsErrorConstants = 2147803141u

public val MTS_ERR_CTX_OLD_REFERENCE: AutoSvcsErrorConstants = 2147803143u

public val MTS_ERR_CTX_ROLE_NOT_FOUND: AutoSvcsErrorConstants = 2147803148u

public val MTS_ERR_CTX_SYNCH_TIMEOUT: AutoSvcsErrorConstants = 2147803142u

public val MTS_ERR_CTX_TM_NOT_AVAILABLE: AutoSvcsErrorConstants = 2147803151u

public val MTS_ERR_CTX_WRONG_THREAD: AutoSvcsErrorConstants = 2147803150u
