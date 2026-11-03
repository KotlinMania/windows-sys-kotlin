package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.s

public val APPDOMAIN_FORCE_TRIVIAL_WAIT_OPERATIONS: APPDOMAIN_SECURITY_FLAGS = 8

public val APPDOMAIN_SECURITY_DEFAULT: APPDOMAIN_SECURITY_FLAGS = 0

public val APPDOMAIN_SECURITY_FORBID_CROSSAD_REVERSE_PINVOKE: APPDOMAIN_SECURITY_FLAGS = 2

public val APPDOMAIN_SECURITY_SANDBOXED: APPDOMAIN_SECURITY_FLAGS = 1

public val BucketParamLength: UInt = 255u

public val BucketParamsCount: UInt = 10u

public val CLRRuntimeHost: GUID = GUID.from_u128(0x90f1a06e77124762uL, 0x86b57a5eba6bdb02uL)

public val CLR_ASSEMBLY_BUILD_VERSION: UInt = 0u

public val CLR_ASSEMBLY_IDENTITY_FLAGS_DEFAULT: ECLRAssemblyIdentityFlags = 0

public val CLR_ASSEMBLY_MAJOR_VERSION: UInt = 4u

public val CLR_ASSEMBLY_MINOR_VERSION: UInt = 0u

public val CLR_BUILD_VERSION: UInt = 22220u

public val CLR_DEBUGGING_MANAGED_EVENT_DEBUGGER_LAUNCH: CLR_DEBUGGING_PROCESS_FLAGS = 2

public val CLR_DEBUGGING_MANAGED_EVENT_PENDING: CLR_DEBUGGING_PROCESS_FLAGS = 1

public val CLR_MAJOR_VERSION: UInt = 4u

public val CLR_MINOR_VERSION: UInt = 0u

public val CLSID_CLRDebugging: GUID = GUID.from_u128(0xbacc578dfbdd48a4uL, 0x969f02d932b74634uL)

public val CLSID_CLRDebuggingLegacy: GUID = GUID.from_u128(0xdf8395b5a4ba450buL, 0xa77ca9a47762c520uL)

public val CLSID_CLRMetaHost: GUID = GUID.from_u128(0x9280188d0e8e4867uL, 0xb30c7fa83884e8deuL)

public val CLSID_CLRMetaHostPolicy: GUID = GUID.from_u128(0x2ebcd49a1b474a61uL, 0xb13a4a03701e594buL)

public val CLSID_CLRProfiling: GUID = GUID.from_u128(0xbd097ed8733e43feuL, 0x8ed7a95ff9a8448cuL)

public val CLSID_CLRStrongName: GUID = GUID.from_u128(0xb79b0acdf5cd409buL, 0xb5a5a16244610b92uL)

public val CLSID_RESOLUTION_DEFAULT: CLSID_RESOLUTION_FLAGS = 0

public val CLSID_RESOLUTION_REGISTERED: CLSID_RESOLUTION_FLAGS = 1

public val COR_GC_COUNTS: COR_GC_STAT_TYPES = 1

public val COR_GC_MEMORYUSAGE: COR_GC_STAT_TYPES = 2

public val COR_GC_THREAD_HAS_PROMOTED_BYTES: COR_GC_THREAD_STATS_TYPES = 1

public val ComCallUnmarshal: GUID = GUID.from_u128(0x3f281000e95a11d2uL, 0x886b00c04f869f04uL)

public val ComCallUnmarshalV4: GUID = GUID.from_u128(0x45fb4600e6e84928uL, 0xb25e50476ff79425uL)

public val CorRuntimeHost: GUID = GUID.from_u128(0xcb2f6723ab3a11d2uL, 0x9c4000c04fa30a3euL)

public val DEPRECATED_CLR_API_MESG: PCSTR = s("This API has been deprecated. Refer to https://go.microsoft.com/fwlink/?LinkId=143720 for more details.")

public val DUMP_FLAVOR_CriticalCLRState: ECustomDumpFlavor = 1

public val DUMP_FLAVOR_Default: ECustomDumpFlavor = 0

public val DUMP_FLAVOR_Mini: ECustomDumpFlavor = 0

public val DUMP_FLAVOR_NonHeapCLRState: ECustomDumpFlavor = 2

public val DUMP_ITEM_None: ECustomDumpItemKind = 0

public val Event_ClrDisabled: EClrEvent = 1

public val Event_DomainUnload: EClrEvent = 0

public val Event_MDAFired: EClrEvent = 2

public val Event_StackOverflow: EClrEvent = 3

public val FAIL_AccessViolation: EClrFailure = 5

public val FAIL_CodeContract: EClrFailure = 6

public val FAIL_CriticalResource: EClrFailure = 1

public val FAIL_FatalRuntime: EClrFailure = 2

public val FAIL_NonCriticalResource: EClrFailure = 0

public val FAIL_OrphanedLock: EClrFailure = 3

public val FAIL_StackOverflow: EClrFailure = 4

public val HOST_APPLICATION_BINDING_POLICY: EHostApplicationPolicy = 1

public val HOST_BINDING_POLICY_MODIFY_CHAIN: EHostBindingPolicyModifyFlags = 1

public val HOST_BINDING_POLICY_MODIFY_DEFAULT: EHostBindingPolicyModifyFlags = 0

public val HOST_BINDING_POLICY_MODIFY_MAX: EHostBindingPolicyModifyFlags = 3

public val HOST_BINDING_POLICY_MODIFY_REMOVE: EHostBindingPolicyModifyFlags = 2

public val HOST_TYPE_APPLAUNCH: HOST_TYPE = 1

public val HOST_TYPE_CORFLAG: HOST_TYPE = 2

public val HOST_TYPE_DEFAULT: HOST_TYPE = 0

public val InvalidBucketParamIndex: BucketParameterIndex = 9

public val LIBID_mscoree: GUID = GUID.from_u128(0x5477469e83b111d2uL, 0x8b4900a0c9b7c9c4uL)

public val MALLOC_EXECUTABLE: MALLOC_TYPE = 2

public val MALLOC_THREADSAFE: MALLOC_TYPE = 1

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_FALSE: METAHOST_CONFIG_FLAGS = 2

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_MASK: METAHOST_CONFIG_FLAGS = 3

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_TRUE: METAHOST_CONFIG_FLAGS = 1

public val METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_UNSET: METAHOST_CONFIG_FLAGS = 0

public val METAHOST_POLICY_APPLY_UPGRADE_POLICY: METAHOST_POLICY_FLAGS = 8

public val METAHOST_POLICY_EMULATE_EXE_LAUNCH: METAHOST_POLICY_FLAGS = 16

public val METAHOST_POLICY_ENSURE_SKU_SUPPORTED: METAHOST_POLICY_FLAGS = 128

public val METAHOST_POLICY_HIGHCOMPAT: METAHOST_POLICY_FLAGS = 0

public val METAHOST_POLICY_IGNORE_ERROR_MODE: METAHOST_POLICY_FLAGS = 4096

public val METAHOST_POLICY_SHOW_ERROR_DIALOG: METAHOST_POLICY_FLAGS = 32

public val METAHOST_POLICY_USE_PROCESS_IMAGE_PATH: METAHOST_POLICY_FLAGS = 64

public val MaxClrEvent: EClrEvent = 4

public val MaxClrFailure: EClrFailure = 7

public val MaxClrOperation: EClrOperation = 7

public val MaxPolicyAction: EPolicyAction = 10

public val OPR_AppDomainRudeUnload: EClrOperation = 4

public val OPR_AppDomainUnload: EClrOperation = 3

public val OPR_FinalizerRun: EClrOperation = 6

public val OPR_ProcessExit: EClrOperation = 5

public val OPR_ThreadAbort: EClrOperation = 0

public val OPR_ThreadRudeAbortInCriticalRegion: EClrOperation = 2

public val OPR_ThreadRudeAbortInNonCriticalRegion: EClrOperation = 1

public val Parameter1: BucketParameterIndex = 0

public val Parameter2: BucketParameterIndex = 1

public val Parameter3: BucketParameterIndex = 2

public val Parameter4: BucketParameterIndex = 3

public val Parameter5: BucketParameterIndex = 4

public val Parameter6: BucketParameterIndex = 5

public val Parameter7: BucketParameterIndex = 6

public val Parameter8: BucketParameterIndex = 7

public val Parameter9: BucketParameterIndex = 8

public val RUNTIME_INFO_DONT_RETURN_DIRECTORY: RUNTIME_INFO_FLAGS = 16

public val RUNTIME_INFO_DONT_RETURN_VERSION: RUNTIME_INFO_FLAGS = 32

public val RUNTIME_INFO_DONT_SHOW_ERROR_DIALOG: RUNTIME_INFO_FLAGS = 64

public val RUNTIME_INFO_IGNORE_ERROR_MODE: RUNTIME_INFO_FLAGS = 4096

public val RUNTIME_INFO_REQUEST_AMD64: RUNTIME_INFO_FLAGS = 4

public val RUNTIME_INFO_REQUEST_ARM64: RUNTIME_INFO_FLAGS = 8192

public val RUNTIME_INFO_REQUEST_IA64: RUNTIME_INFO_FLAGS = 2

public val RUNTIME_INFO_REQUEST_X86: RUNTIME_INFO_FLAGS = 8

public val RUNTIME_INFO_UPGRADE_VERSION: RUNTIME_INFO_FLAGS = 1

public val SO_ClrEngine: StackOverflowType = 1

public val SO_Managed: StackOverflowType = 0

public val SO_Other: StackOverflowType = 2

public val STARTUP_ALWAYSFLOW_IMPERSONATION: STARTUP_FLAGS = 262144

public val STARTUP_ARM: STARTUP_FLAGS = 4194304

public val STARTUP_CONCURRENT_GC: STARTUP_FLAGS = 1

public val STARTUP_DISABLE_COMMITTHREADSTACK: STARTUP_FLAGS = 131072

public val STARTUP_ETW: STARTUP_FLAGS = 1048576

public val STARTUP_HOARD_GC_VM: STARTUP_FLAGS = 8192

public val STARTUP_LEGACY_IMPERSONATION: STARTUP_FLAGS = 65536

public val STARTUP_LOADER_OPTIMIZATION_MASK: STARTUP_FLAGS = 6

public val STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN: STARTUP_FLAGS = 4

public val STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN_HOST: STARTUP_FLAGS = 6

public val STARTUP_LOADER_OPTIMIZATION_SINGLE_DOMAIN: STARTUP_FLAGS = 2

public val STARTUP_LOADER_SAFEMODE: STARTUP_FLAGS = 16

public val STARTUP_LOADER_SETPREFERENCE: STARTUP_FLAGS = 256

public val STARTUP_SERVER_GC: STARTUP_FLAGS = 4096

public val STARTUP_SINGLE_VERSION_HOSTING_INTERFACE: STARTUP_FLAGS = 16384

public val STARTUP_TRIM_GC_COMMIT: STARTUP_FLAGS = 524288

public val TT_ADUNLOAD: ETaskType = 128

public val TT_DEBUGGERHELPER: ETaskType = 1

public val TT_FINALIZER: ETaskType = 4

public val TT_GC: ETaskType = 2

public val TT_THREADPOOL_GATE: ETaskType = 16

public val TT_THREADPOOL_IOCOMPLETION: ETaskType = 64

public val TT_THREADPOOL_TIMER: ETaskType = 8

public val TT_THREADPOOL_WAIT: ETaskType = 512

public val TT_THREADPOOL_WORKER: ETaskType = 32

public val TT_UNKNOWN: ETaskType = -2147483648

public val TT_USER: ETaskType = 256

public val TypeNameFactory: GUID = GUID.from_u128(0xb81ff17120f311d2uL, 0x8dcc00a0c9b00525uL)

public val WAIT_ALERTABLE: WAIT_OPTION = 2

public val WAIT_MSGPUMP: WAIT_OPTION = 1

public val WAIT_NOTINDEADLOCK: WAIT_OPTION = 4

public val eAbortThread: EPolicyAction = 2

public val eAll: EApiCategories = 511

public val eAppDomainCritical: EMemoryCriticalLevel = 1

public val eCurrentContext: EContextType = 0

public val eDisableRuntime: EPolicyAction = 9

public val eExitProcess: EPolicyAction = 6

public val eExternalProcessMgmt: EApiCategories = 4

public val eExternalThreading: EApiCategories = 16

public val eFastExitProcess: EPolicyAction = 7

public val eHostDeterminedPolicy: EClrUnhandledException = 1

public val eInitializeNewDomainFlags_NoSecurityChanges: EInitializeNewDomainFlags = 2

public val eInitializeNewDomainFlags_None: EInitializeNewDomainFlags = 0

public val eMayLeakOnAbort: EApiCategories = 256

public val eMemoryAvailableHigh: EMemoryAvailable = 3

public val eMemoryAvailableLow: EMemoryAvailable = 1

public val eMemoryAvailableNeutral: EMemoryAvailable = 2

public val eNoAction: EPolicyAction = 0

public val eNoChecks: EApiCategories = 0

public val ePolicyLevelAdmin: EBindPolicyLevels = 32

public val ePolicyLevelApp: EBindPolicyLevels = 4

public val ePolicyLevelHost: EBindPolicyLevels = 16

public val ePolicyLevelNone: EBindPolicyLevels = 0

public val ePolicyLevelPublisher: EBindPolicyLevels = 8

public val ePolicyLevelRetargetable: EBindPolicyLevels = 1

public val ePolicyPortability: EBindPolicyLevels = 64

public val ePolicyUnifiedToCLR: EBindPolicyLevels = 2

public val eProcessCritical: EMemoryCriticalLevel = 2

public val eRestrictedContext: EContextType = 1

public val eRudeAbortThread: EPolicyAction = 3

public val eRudeExitProcess: EPolicyAction = 8

public val eRudeUnloadAppDomain: EPolicyAction = 5

public val eRuntimeDeterminedPolicy: EClrUnhandledException = 0

public val eSecurityInfrastructure: EApiCategories = 64

public val eSelfAffectingProcessMgmt: EApiCategories = 8

public val eSelfAffectingThreading: EApiCategories = 32

public val eSharedState: EApiCategories = 2

public val eSymbolReadingAlways: ESymbolReadingPolicy = 1

public val eSymbolReadingFullTrustOnly: ESymbolReadingPolicy = 2

public val eSymbolReadingNever: ESymbolReadingPolicy = 0

public val eSynchronization: EApiCategories = 1

public val eTaskCritical: EMemoryCriticalLevel = 0

public val eThrowException: EPolicyAction = 1

public val eUI: EApiCategories = 128

public val eUnloadAppDomain: EPolicyAction = 4
