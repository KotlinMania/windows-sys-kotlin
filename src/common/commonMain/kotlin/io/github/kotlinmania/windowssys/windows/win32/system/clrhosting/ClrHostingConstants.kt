package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.s

public val APPDOMAIN_FORCE_TRIVIAL_WAIT_OPERATIONS: AppdomainSecurityFlags = 8

public val APPDOMAIN_SECURITY_DEFAULT: AppdomainSecurityFlags = 0

public val APPDOMAIN_SECURITY_FORBID_CROSSAD_REVERSE_PINVOKE: AppdomainSecurityFlags = 2

public val APPDOMAIN_SECURITY_SANDBOXED: AppdomainSecurityFlags = 1

public val BUCKET_PARAM_LENGTH: UInt = 255u

public val BUCKET_PARAMS_COUNT: UInt = 10u

public val CLR_RUNTIME_HOST: Guid = Guid.fromU128(U128(0x90f1a06e77124762uL, 0x86b57a5eba6bdb02uL))

public val CLR_ASSEMBLY_BUILD_VERSION: UInt = 0u

public val CLR_ASSEMBLY_IDENTITY_FLAGS_DEFAULT: ECLRAssemblyIdentityFlags = 0

public val CLR_ASSEMBLY_MAJOR_VERSION: UInt = 4u

public val CLR_ASSEMBLY_MINOR_VERSION: UInt = 0u

public val CLR_BUILD_VERSION: UInt = 22220u

public val CLR_DEBUGGING_MANAGED_EVENT_DEBUGGER_LAUNCH: ClrDebuggingProcessFlags = 2

public val CLR_DEBUGGING_MANAGED_EVENT_PENDING: ClrDebuggingProcessFlags = 1

public val CLR_MAJOR_VERSION: UInt = 4u

public val CLR_MINOR_VERSION: UInt = 0u

public val CLSID_CLR_DEBUGGING: Guid = Guid.fromU128(U128(0xbacc578dfbdd48a4uL, 0x969f02d932b74634uL))

public val CLSID_CLR_DEBUGGING_LEGACY: Guid = Guid.fromU128(U128(0xdf8395b5a4ba450buL, 0xa77ca9a47762c520uL))

public val CLSID_CLR_META_HOST: Guid = Guid.fromU128(U128(0x9280188d0e8e4867uL, 0xb30c7fa83884e8deuL))

public val CLSID_CLR_META_HOST_POLICY: Guid = Guid.fromU128(U128(0x2ebcd49a1b474a61uL, 0xb13a4a03701e594buL))

public val CLSID_CLR_PROFILING: Guid = Guid.fromU128(U128(0xbd097ed8733e43feuL, 0x8ed7a95ff9a8448cuL))

public val CLSID_CLR_STRONG_NAME: Guid = Guid.fromU128(U128(0xb79b0acdf5cd409buL, 0xb5a5a16244610b92uL))

public val CLSID_RESOLUTION_DEFAULT: ClsidResolutionFlags = 0

public val CLSID_RESOLUTION_REGISTERED: ClsidResolutionFlags = 1

public val COR_GC_COUNTS: CorGcStatTypes = 1

public val COR_GC_MEMORYUSAGE: CorGcStatTypes = 2

public val COR_GC_THREAD_HAS_PROMOTED_BYTES: CorGcThreadStatsTypes = 1

public val COM_CALL_UNMARSHAL: Guid = Guid.fromU128(U128(0x3f281000e95a11d2uL, 0x886b00c04f869f04uL))

public val COM_CALL_UNMARSHAL_V4: Guid = Guid.fromU128(U128(0x45fb4600e6e84928uL, 0xb25e50476ff79425uL))

public val COR_RUNTIME_HOST: Guid = Guid.fromU128(U128(0xcb2f6723ab3a11d2uL, 0x9c4000c04fa30a3euL))

public val DEPRECATED_CLR_API_MESG: Pcstr = s("This API has been deprecated. Refer to https://go.microsoft.com/fwlink/?LinkId=143720 for more details.")

public val DUMP_FLAVOR_CRITICAL_CLR_STATE: ECustomDumpFlavor = 1

public val DUMP_FLAVOR_DEFAULT: ECustomDumpFlavor = 0

public val DUMP_FLAVOR_MINI: ECustomDumpFlavor = 0

public val DUMP_FLAVOR_NON_HEAP_CLR_STATE: ECustomDumpFlavor = 2

public val DUMP_ITEM_NONE: ECustomDumpItemKind = 0

public val EVENT_CLR_DISABLED: EClrEvent = 1

public val EVENT_DOMAIN_UNLOAD: EClrEvent = 0

public val EVENT_MDA_FIRED: EClrEvent = 2

public val EVENT_STACK_OVERFLOW: EClrEvent = 3

public val FAIL_ACCESS_VIOLATION: EClrFailure = 5

public val FAIL_CODE_CONTRACT: EClrFailure = 6

public val FAIL_CRITICAL_RESOURCE: EClrFailure = 1

public val FAIL_FATAL_RUNTIME: EClrFailure = 2

public val FAIL_NON_CRITICAL_RESOURCE: EClrFailure = 0

public val FAIL_ORPHANED_LOCK: EClrFailure = 3

public val FAIL_STACK_OVERFLOW: EClrFailure = 4

public val HOST_APPLICATION_BINDING_POLICY: EHostApplicationPolicy = 1

public val HOST_BINDING_POLICY_MODIFY_CHAIN: EHostBindingPolicyModifyFlags = 1

public val HOST_BINDING_POLICY_MODIFY_DEFAULT: EHostBindingPolicyModifyFlags = 0

public val HOST_BINDING_POLICY_MODIFY_MAX: EHostBindingPolicyModifyFlags = 3

public val HOST_BINDING_POLICY_MODIFY_REMOVE: EHostBindingPolicyModifyFlags = 2

public val HOST_TYPE_APPLAUNCH: HostType = 1

public val HOST_TYPE_CORFLAG: HostType = 2

public val HOST_TYPE_DEFAULT: HostType = 0

public val INVALID_BUCKET_PARAM_INDEX: BucketParameterIndex = 9

public val LIBID_MSCOREE: Guid = Guid.fromU128(U128(0x5477469e83b111d2uL, 0x8b4900a0c9b7c9c4uL))

public val MALLOC_EXECUTABLE: MallocType = 2

public val MALLOC_THREADSAFE: MallocType = 1

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_FALSE: MetahostConfigFlags = 2

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_MASK: MetahostConfigFlags = 3

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_TRUE: MetahostConfigFlags = 1

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_UNSET: MetahostConfigFlags = 0

public val METAHOST_POLICY_APPLY_UPGRADE_POLICY: MetahostPolicyFlags = 8

public val METAHOST_POLICY_EMULATE_EXE_LAUNCH: MetahostPolicyFlags = 16

public val METAHOST_POLICY_ENSURE_SKU_SUPPORTED: MetahostPolicyFlags = 128

public val METAHOST_POLICY_HIGHCOMPAT: MetahostPolicyFlags = 0

public val METAHOST_POLICY_IGNORE_ERROR_MODE: MetahostPolicyFlags = 4096

public val METAHOST_POLICY_SHOW_ERROR_DIALOG: MetahostPolicyFlags = 32

public val METAHOST_POLICY_USE_PROCESS_IMAGE_PATH: MetahostPolicyFlags = 64

public val MAX_CLR_EVENT: EClrEvent = 4

public val MAX_CLR_FAILURE: EClrFailure = 7

public val MAX_CLR_OPERATION: EClrOperation = 7

public val MAX_POLICY_ACTION: EPolicyAction = 10

public val OPR_APP_DOMAIN_RUDE_UNLOAD: EClrOperation = 4

public val OPR_APP_DOMAIN_UNLOAD: EClrOperation = 3

public val OPR_FINALIZER_RUN: EClrOperation = 6

public val OPR_PROCESS_EXIT: EClrOperation = 5

public val OPR_THREAD_ABORT: EClrOperation = 0

public val OPR_THREAD_RUDE_ABORT_IN_CRITICAL_REGION: EClrOperation = 2

public val OPR_THREAD_RUDE_ABORT_IN_NON_CRITICAL_REGION: EClrOperation = 1

public val PARAMETER1: BucketParameterIndex = 0

public val PARAMETER2: BucketParameterIndex = 1

public val PARAMETER3: BucketParameterIndex = 2

public val PARAMETER4: BucketParameterIndex = 3

public val PARAMETER5: BucketParameterIndex = 4

public val PARAMETER6: BucketParameterIndex = 5

public val PARAMETER7: BucketParameterIndex = 6

public val PARAMETER8: BucketParameterIndex = 7

public val PARAMETER9: BucketParameterIndex = 8

public val RUNTIME_INFO_DONT_RETURN_DIRECTORY: RuntimeInfoFlags = 16

public val RUNTIME_INFO_DONT_RETURN_VERSION: RuntimeInfoFlags = 32

public val RUNTIME_INFO_DONT_SHOW_ERROR_DIALOG: RuntimeInfoFlags = 64

public val RUNTIME_INFO_IGNORE_ERROR_MODE: RuntimeInfoFlags = 4096

public val RUNTIME_INFO_REQUEST_AMD64: RuntimeInfoFlags = 4

public val RUNTIME_INFO_REQUEST_ARM64: RuntimeInfoFlags = 8192

public val RUNTIME_INFO_REQUEST_IA64: RuntimeInfoFlags = 2

public val RUNTIME_INFO_REQUEST_X86: RuntimeInfoFlags = 8

public val RUNTIME_INFO_UPGRADE_VERSION: RuntimeInfoFlags = 1

public val SO_CLR_ENGINE: StackOverflowType = 1

public val SO_MANAGED: StackOverflowType = 0

public val SO_OTHER: StackOverflowType = 2

public val STARTUP_ALWAYSFLOW_IMPERSONATION: StartupFlags = 262144

public val STARTUP_ARM: StartupFlags = 4194304

public val STARTUP_CONCURRENT_GC: StartupFlags = 1

public val STARTUP_DISABLE_COMMITTHREADSTACK: StartupFlags = 131072

public val STARTUP_ETW: StartupFlags = 1048576

public val STARTUP_HOARD_GC_VM: StartupFlags = 8192

public val STARTUP_LEGACY_IMPERSONATION: StartupFlags = 65536

public val STARTUP_LOADER_OPTIMIZATION_MASK: StartupFlags = 6

public val STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN: StartupFlags = 4

public val STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN_HOST: StartupFlags = 6

public val STARTUP_LOADER_OPTIMIZATION_SINGLE_DOMAIN: StartupFlags = 2

public val STARTUP_LOADER_SAFEMODE: StartupFlags = 16

public val STARTUP_LOADER_SETPREFERENCE: StartupFlags = 256

public val STARTUP_SERVER_GC: StartupFlags = 4096

public val STARTUP_SINGLE_VERSION_HOSTING_INTERFACE: StartupFlags = 16384

public val STARTUP_TRIM_GC_COMMIT: StartupFlags = 524288

public val TT_ADUNLOAD: ETaskType = 128

public val TT_DEBUGGERHELPER: ETaskType = 1

public val TT_FINALIZER: ETaskType = 4

public val TT_GC: ETaskType = 2

public val TT_THREADPOOL_GATE: ETaskType = 16

public val TT_THREADPOOL_IOCOMPLETION: ETaskType = 64

public val TT_THREADPOOL_TIMER: ETaskType = 8

public val TT_THREADPOOL_WAIT: ETaskType = 512

public val TT_THREADPOOL_WORKER: ETaskType = 32

public val TT_UNKNOWN: ETaskType = -2147483648.toInt()

public val TT_USER: ETaskType = 256

public val TYPE_NAME_FACTORY: Guid = Guid.fromU128(U128(0xb81ff17120f311d2uL, 0x8dcc00a0c9b00525uL))

public val WAIT_ALERTABLE: WaitOption = 2

public val WAIT_MSGPUMP: WaitOption = 1

public val WAIT_NOTINDEADLOCK: WaitOption = 4

public val E_ABORT_THREAD: EPolicyAction = 2

public val E_ALL: EApiCategories = 511

public val E_APP_DOMAIN_CRITICAL: EMemoryCriticalLevel = 1

public val E_CURRENT_CONTEXT: EContextType = 0

public val E_DISABLE_RUNTIME: EPolicyAction = 9

public val E_EXIT_PROCESS: EPolicyAction = 6

public val E_EXTERNAL_PROCESS_MGMT: EApiCategories = 4

public val E_EXTERNAL_THREADING: EApiCategories = 16

public val E_FAST_EXIT_PROCESS: EPolicyAction = 7

public val E_HOST_DETERMINED_POLICY: EClrUnhandledException = 1

public val E_INITIALIZE_NEW_DOMAIN_FLAGS_NO_SECURITY_CHANGES: EInitializeNewDomainFlags = 2

public val E_INITIALIZE_NEW_DOMAIN_FLAGS_NONE: EInitializeNewDomainFlags = 0

public val E_MAY_LEAK_ON_ABORT: EApiCategories = 256

public val E_MEMORY_AVAILABLE_HIGH: EMemoryAvailable = 3

public val E_MEMORY_AVAILABLE_LOW: EMemoryAvailable = 1

public val E_MEMORY_AVAILABLE_NEUTRAL: EMemoryAvailable = 2

public val E_NO_ACTION: EPolicyAction = 0

public val E_NO_CHECKS: EApiCategories = 0

public val E_POLICY_LEVEL_ADMIN: EBindPolicyLevels = 32

public val E_POLICY_LEVEL_APP: EBindPolicyLevels = 4

public val E_POLICY_LEVEL_HOST: EBindPolicyLevels = 16

public val E_POLICY_LEVEL_NONE: EBindPolicyLevels = 0

public val E_POLICY_LEVEL_PUBLISHER: EBindPolicyLevels = 8

public val E_POLICY_LEVEL_RETARGETABLE: EBindPolicyLevels = 1

public val E_POLICY_PORTABILITY: EBindPolicyLevels = 64

public val E_POLICY_UNIFIED_TO_CLR: EBindPolicyLevels = 2

public val E_PROCESS_CRITICAL: EMemoryCriticalLevel = 2

public val E_RESTRICTED_CONTEXT: EContextType = 1

public val E_RUDE_ABORT_THREAD: EPolicyAction = 3

public val E_RUDE_EXIT_PROCESS: EPolicyAction = 8

public val E_RUDE_UNLOAD_APP_DOMAIN: EPolicyAction = 5

public val E_RUNTIME_DETERMINED_POLICY: EClrUnhandledException = 0

public val E_SECURITY_INFRASTRUCTURE: EApiCategories = 64

public val E_SELF_AFFECTING_PROCESS_MGMT: EApiCategories = 8

public val E_SELF_AFFECTING_THREADING: EApiCategories = 32

public val E_SHARED_STATE: EApiCategories = 2

public val E_SYMBOL_READING_ALWAYS: ESymbolReadingPolicy = 1

public val E_SYMBOL_READING_FULL_TRUST_ONLY: ESymbolReadingPolicy = 2

public val E_SYMBOL_READING_NEVER: ESymbolReadingPolicy = 0

public val E_SYNCHRONIZATION: EApiCategories = 1

public val E_TASK_CRITICAL: EMemoryCriticalLevel = 0

public val E_THROW_EXCEPTION: EPolicyAction = 1

public val E_UI: EApiCategories = 128

public val E_UNLOAD_APP_DOMAIN: EPolicyAction = 4
