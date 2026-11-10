package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.COpaquePointer

public val ABOVE_NORMAL_PRIORITY_CLASS: ProcessCreationFlags = 32768u

public val ALL_PROCESSOR_GROUPS: UShort = 65535u.toUShort()

public val AVRT_PRIORITY_CRITICAL: AvrtPriority = 2

public val AVRT_PRIORITY_HIGH: AvrtPriority = 1

public val AVRT_PRIORITY_LOW: AvrtPriority = -1

public val AVRT_PRIORITY_NORMAL: AvrtPriority = 0

public val AVRT_PRIORITY_VERYLOW: AvrtPriority = -2

public val BELOW_NORMAL_PRIORITY_CLASS: ProcessCreationFlags = 16384u

public val CONDITION_VARIABLE_INIT: ConditionVariable = ConditionVariable(ptr = null)

public val CONDITION_VARIABLE_LOCKMODE_SHARED: UInt = 1u

public val CREATE_BREAKAWAY_FROM_JOB: ProcessCreationFlags = 16777216u

public val CREATE_DEFAULT_ERROR_MODE: ProcessCreationFlags = 67108864u

public val CREATE_EVENT_INITIAL_SET: CreateEvent = 2u

public val CREATE_EVENT_MANUAL_RESET: CreateEvent = 1u

public val CREATE_FORCEDOS: ProcessCreationFlags = 8192u

public val CREATE_IGNORE_SYSTEM_DEFAULT: ProcessCreationFlags = 2147483648u

public val CREATE_MUTEX_INITIAL_OWNER: UInt = 1u

public val CREATE_NEW_CONSOLE: ProcessCreationFlags = 16u

public val CREATE_NEW_PROCESS_GROUP: ProcessCreationFlags = 512u

public val CREATE_NO_WINDOW: ProcessCreationFlags = 134217728u

public val CREATE_PRESERVE_CODE_AUTHZ_LEVEL: ProcessCreationFlags = 33554432u

public val CREATE_PROTECTED_PROCESS: ProcessCreationFlags = 262144u

public val CREATE_SECURE_PROCESS: ProcessCreationFlags = 4194304u

public val CREATE_SEPARATE_WOW_VDM: ProcessCreationFlags = 2048u

public val CREATE_SHARED_WOW_VDM: ProcessCreationFlags = 4096u

public val CREATE_SUSPENDED: ProcessCreationFlags = 4u

public val CREATE_UNICODE_ENVIRONMENT: ProcessCreationFlags = 1024u

public val CREATE_WAITABLE_TIMER_HIGH_RESOLUTION: UInt = 2u

public val CREATE_WAITABLE_TIMER_MANUAL_RESET: UInt = 1u

public val DEBUG_ONLY_THIS_PROCESS: ProcessCreationFlags = 2u

public val DEBUG_PROCESS: ProcessCreationFlags = 1u

public val DETACHED_PROCESS: ProcessCreationFlags = 8u

public val EVENT_ALL_ACCESS: SynchronizationAccessRights = 2031619u

public val EVENT_MODIFY_STATE: SynchronizationAccessRights = 2u

public val EXTENDED_STARTUPINFO_PRESENT: ProcessCreationFlags = 524288u

public val FLS_OUT_OF_INDEXES: UInt = 4294967295u

public val GR_GDIOBJECTS: GetGuiResourcesFlags = 0u

public val GR_GDIOBJECTS_PEAK: GetGuiResourcesFlags = 2u

public val GR_GLOBAL: GetGuiResourcesFlags = 4294967294u

public val GR_USEROBJECTS: GetGuiResourcesFlags = 1u

public val GR_USEROBJECTS_PEAK: GetGuiResourcesFlags = 4u

public val HIGH_PRIORITY_CLASS: ProcessCreationFlags = 128u

public val IDLE_PRIORITY_CLASS: ProcessCreationFlags = 64u

public val INFINITE: UInt = 4294967295u

public val INHERIT_CALLER_PRIORITY: ProcessCreationFlags = 131072u

public val INHERIT_PARENT_AFFINITY: ProcessCreationFlags = 65536u

public val INIT_ONCE_ASYNC: UInt = 2u

public val INIT_ONCE_CHECK_ONLY: UInt = 1u

public val INIT_ONCE_CTX_RESERVED_BITS: UInt = 2u

public val INIT_ONCE_INIT_FAILED: UInt = 4u

public val INIT_ONCE_STATIC_INIT: InitOnce = InitOnce(ptr = null)

public val KERNEL_ENABLED: MachineAttributes = 2

public val LOGON_NETCREDENTIALS_ONLY: CreateProcessLogonFlags = 2u

public val LOGON_WITH_PROFILE: CreateProcessLogonFlags = 1u

public val MEMORY_PRIORITY_BELOW_NORMAL: MemoryPriority = 4u

public val MEMORY_PRIORITY_LOW: MemoryPriority = 2u

public val MEMORY_PRIORITY_MEDIUM: MemoryPriority = 3u

public val MEMORY_PRIORITY_NORMAL: MemoryPriority = 5u

public val MEMORY_PRIORITY_VERY_LOW: MemoryPriority = 1u

public val MUTEX_ALL_ACCESS: SynchronizationAccessRights = 2031617u

public val MUTEX_MODIFY_STATE: SynchronizationAccessRights = 1u

public val MAX_PROCESS_MITIGATION_POLICY: ProcessMitigationPolicy = 20

public val NORMAL_PRIORITY_CLASS: ProcessCreationFlags = 32u

public val PF_3DNOW_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 7u

public val PF_ALPHA_BYTE_INSTRUCTIONS: ProcessorFeatureId = 5u

public val PF_ARM_64BIT_LOADSTORE_ATOMIC: ProcessorFeatureId = 25u

public val PF_ARM_DIVIDE_INSTRUCTION_AVAILABLE: ProcessorFeatureId = 24u

public val PF_ARM_EXTERNAL_CACHE_AVAILABLE: ProcessorFeatureId = 26u

public val PF_ARM_FMAC_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 27u

public val PF_ARM_NEON_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 19u

public val PF_ARM_V81_ATOMIC_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 34u

public val PF_ARM_V82_DP_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 43u

public val PF_ARM_V83_JSCVT_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 44u

public val PF_ARM_V83_LRCPC_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 45u

public val PF_ARM_V8_CRC32_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 31u

public val PF_ARM_V8_CRYPTO_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 30u

public val PF_ARM_V8_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 29u

public val PF_ARM_VFP_32_REGISTERS_AVAILABLE: ProcessorFeatureId = 18u

public val PF_AVX2_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 40u

public val PF_AVX512F_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 41u

public val PF_AVX_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 39u

public val PF_CHANNELS_ENABLED: ProcessorFeatureId = 16u

public val PF_COMPARE64_EXCHANGE128: ProcessorFeatureId = 15u

public val PF_COMPARE_EXCHANGE128: ProcessorFeatureId = 14u

public val PF_COMPARE_EXCHANGE_DOUBLE: ProcessorFeatureId = 2u

public val PF_ERMS_AVAILABLE: ProcessorFeatureId = 42u

public val PF_FASTFAIL_AVAILABLE: ProcessorFeatureId = 23u

public val PF_FLOATING_POINT_EMULATED: ProcessorFeatureId = 1u

public val PF_FLOATING_POINT_PRECISION_ERRATA: ProcessorFeatureId = 0u

public val PF_MMX_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 3u

public val PF_MONITORX_INSTRUCTION_AVAILABLE: ProcessorFeatureId = 35u

public val PF_NX_ENABLED: ProcessorFeatureId = 12u

public val PF_PAE_ENABLED: ProcessorFeatureId = 9u

public val PF_PPC_MOVEMEM_64BIT_OK: ProcessorFeatureId = 4u

public val PF_RDPID_INSTRUCTION_AVAILABLE: ProcessorFeatureId = 33u

public val PF_RDRAND_INSTRUCTION_AVAILABLE: ProcessorFeatureId = 28u

public val PF_RDTSCP_INSTRUCTION_AVAILABLE: ProcessorFeatureId = 32u

public val PF_RDTSC_INSTRUCTION_AVAILABLE: ProcessorFeatureId = 8u

public val PF_RDWRFSGSBASE_AVAILABLE: ProcessorFeatureId = 22u

public val PF_SECOND_LEVEL_ADDRESS_TRANSLATION: ProcessorFeatureId = 20u

public val PF_SSE3_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 13u

public val PF_SSE4_1_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 37u

public val PF_SSE4_2_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 38u

public val PF_SSE_DAZ_MODE_AVAILABLE: ProcessorFeatureId = 11u

public val PF_SSSE3_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 36u

public val PF_VIRT_FIRMWARE_ENABLED: ProcessorFeatureId = 21u

public val PF_XMMI64_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 10u

public val PF_XMMI_INSTRUCTIONS_AVAILABLE: ProcessorFeatureId = 6u

public val PF_XSAVE_ENABLED: ProcessorFeatureId = 17u

public val PME_TYPE_FAIL_FAST_ON_COMMIT_FAILURE: ProcessMemoryExhaustionType = 0

public val PME_TYPE_MAX: ProcessMemoryExhaustionType = 1

public val PME_CURRENT_VERSION: UInt = 1u

public val PME_FAILFAST_ON_COMMIT_FAIL_DISABLE: UInt = 0u

public val PME_FAILFAST_ON_COMMIT_FAIL_ENABLE: UInt = 1u

public val POWER_REQUEST_CONTEXT_DETAILED_STRING: PowerRequestContextFlags = 2u

public val POWER_REQUEST_CONTEXT_SIMPLE_STRING: PowerRequestContextFlags = 1u

public val PRIVATE_NAMESPACE_FLAG_DESTROY: UInt = 1u

public val PROCESS_AFFINITY_DISABLE_AUTO_UPDATE: ProcessAffinityAutoUpdateFlags = 0u

public val PROCESS_AFFINITY_ENABLE_AUTO_UPDATE: ProcessAffinityAutoUpdateFlags = 1u

public val PROCESS_ALL_ACCESS: ProcessAccessRights = 2097151u

public val PROCESS_CREATE_PROCESS: ProcessAccessRights = 128u

public val PROCESS_CREATE_THREAD: ProcessAccessRights = 2u

public val PROCESS_DELETE: ProcessAccessRights = 65536u

public val PROCESS_DEP_DISABLE_ATL_THUNK_EMULATION: ProcessDepFlags = 2u

public val PROCESS_DEP_ENABLE: ProcessDepFlags = 1u

public val PROCESS_DEP_NONE: ProcessDepFlags = 0u

public val PROCESS_DUP_HANDLE: ProcessAccessRights = 64u

public val PROCESS_LEAP_SECOND_INFO_FLAG_ENABLE_SIXTY_SECOND: UInt = 1u

public val PROCESS_LEAP_SECOND_INFO_VALID_FLAGS: UInt = 1u

public val PROCESS_MODE_BACKGROUND_BEGIN: ProcessCreationFlags = 1048576u

public val PROCESS_MODE_BACKGROUND_END: ProcessCreationFlags = 2097152u

public val PROCESS_NAME_NATIVE: ProcessNameFormat = 1u

public val PROCESS_NAME_WIN32: ProcessNameFormat = 0u

public val PROCESS_POWER_THROTTLING_CURRENT_VERSION: UInt = 1u

public val PROCESS_POWER_THROTTLING_EXECUTION_SPEED: UInt = 1u

public val PROCESS_POWER_THROTTLING_IGNORE_TIMER_RESOLUTION: UInt = 4u

public val PROCESS_QUERY_INFORMATION: ProcessAccessRights = 1024u

public val PROCESS_QUERY_LIMITED_INFORMATION: ProcessAccessRights = 4096u

public val PROCESS_READ_CONTROL: ProcessAccessRights = 131072u

public val PROCESS_SET_INFORMATION: ProcessAccessRights = 512u

public val PROCESS_SET_LIMITED_INFORMATION: ProcessAccessRights = 8192u

public val PROCESS_SET_QUOTA: ProcessAccessRights = 256u

public val PROCESS_SET_SESSIONID: ProcessAccessRights = 4u

public val PROCESS_STANDARD_RIGHTS_REQUIRED: ProcessAccessRights = 983040u

public val PROCESS_SUSPEND_RESUME: ProcessAccessRights = 2048u

public val PROCESS_SYNCHRONIZE: ProcessAccessRights = 1048576u

public val PROCESS_TERMINATE: ProcessAccessRights = 1u

public val PROCESS_VM_OPERATION: ProcessAccessRights = 8u

public val PROCESS_VM_READ: ProcessAccessRights = 16u

public val PROCESS_VM_WRITE: ProcessAccessRights = 32u

public val PROCESS_WRITE_DAC: ProcessAccessRights = 262144u

public val PROCESS_WRITE_OWNER: ProcessAccessRights = 524288u

public val PROC_THREAD_ATTRIBUTE_ALL_APPLICATION_PACKAGES_POLICY: UInt = 131087u

public val PROC_THREAD_ATTRIBUTE_CHILD_PROCESS_POLICY: UInt = 131086u

public val PROC_THREAD_ATTRIBUTE_COMPONENT_FILTER: UInt = 131098u

public val PROC_THREAD_ATTRIBUTE_DESKTOP_APP_POLICY: UInt = 131090u

public val PROC_THREAD_ATTRIBUTE_ENABLE_OPTIONAL_XSTATE_FEATURES: UInt = 196635u

public val PROC_THREAD_ATTRIBUTE_GROUP_AFFINITY: UInt = 196611u

public val PROC_THREAD_ATTRIBUTE_HANDLE_LIST: UInt = 131074u

public val PROC_THREAD_ATTRIBUTE_IDEAL_PROCESSOR: UInt = 196613u

public val PROC_THREAD_ATTRIBUTE_JOB_LIST: UInt = 131085u

public val PROC_THREAD_ATTRIBUTE_MACHINE_TYPE: UInt = 131097u

public val PROC_THREAD_ATTRIBUTE_MITIGATION_AUDIT_POLICY: UInt = 131096u

public val PROC_THREAD_ATTRIBUTE_MITIGATION_POLICY: UInt = 131079u

public val PROC_THREAD_ATTRIBUTE_PARENT_PROCESS: UInt = 131072u

public val PROC_THREAD_ATTRIBUTE_PREFERRED_NODE: UInt = 131076u

public val PROC_THREAD_ATTRIBUTE_PROTECTION_LEVEL: UInt = 131083u

public val PROC_THREAD_ATTRIBUTE_PSEUDOCONSOLE: UInt = 131094u

public val PROC_THREAD_ATTRIBUTE_REPLACE_VALUE: UInt = 1u

public val PROC_THREAD_ATTRIBUTE_SECURITY_CAPABILITIES: UInt = 131081u

public val PROC_THREAD_ATTRIBUTE_UMS_THREAD: UInt = 196614u

public val PROC_THREAD_ATTRIBUTE_WIN32K_FILTER: UInt = 131088u

public val PROFILE_KERNEL: ProcessCreationFlags = 536870912u

public val PROFILE_SERVER: ProcessCreationFlags = 1073741824u

public val PROFILE_USER: ProcessCreationFlags = 268435456u

public val PROTECTION_LEVEL_ANTIMALWARE_LIGHT: ProcessProtectionLevel = 3u

public val PROTECTION_LEVEL_AUTHENTICODE: ProcessProtectionLevel = 7u

public val PROTECTION_LEVEL_CODEGEN_LIGHT: ProcessProtectionLevel = 6u

public val PROTECTION_LEVEL_LSA_LIGHT: ProcessProtectionLevel = 4u

public val PROTECTION_LEVEL_NONE: ProcessProtectionLevel = 4294967294u

public val PROTECTION_LEVEL_PPL_APP: ProcessProtectionLevel = 8u

public val PROTECTION_LEVEL_WINDOWS: ProcessProtectionLevel = 1u

public val PROTECTION_LEVEL_WINDOWS_LIGHT: ProcessProtectionLevel = 2u

public val PROTECTION_LEVEL_WINTCB: ProcessProtectionLevel = 5u

public val PROTECTION_LEVEL_WINTCB_LIGHT: ProcessProtectionLevel = 0u

public val PROC_THREAD_ATTRIBUTE_ALL_APPLICATION_PACKAGES_POLICY1: ProcThreadAttributeNum = 15u

public val PROC_THREAD_ATTRIBUTE_CHILD_PROCESS_POLICY1: ProcThreadAttributeNum = 14u

public val PROC_THREAD_ATTRIBUTE_COMPONENT_FILTER1: ProcThreadAttributeNum = 26u

public val PROC_THREAD_ATTRIBUTE_DESKTOP_APP_POLICY1: ProcThreadAttributeNum = 18u

public val PROC_THREAD_ATTRIBUTE_ENABLE_OPTIONAL_X_STATE_FEATURES: ProcThreadAttributeNum = 27u

public val PROC_THREAD_ATTRIBUTE_GROUP_AFFINITY1: ProcThreadAttributeNum = 3u

public val PROC_THREAD_ATTRIBUTE_HANDLE_LIST1: ProcThreadAttributeNum = 2u

public val PROC_THREAD_ATTRIBUTE_IDEAL_PROCESSOR1: ProcThreadAttributeNum = 5u

public val PROC_THREAD_ATTRIBUTE_JOB_LIST1: ProcThreadAttributeNum = 13u

public val PROC_THREAD_ATTRIBUTE_MACHINE_TYPE1: ProcThreadAttributeNum = 25u

public val PROC_THREAD_ATTRIBUTE_MITIGATION_AUDIT_POLICY1: ProcThreadAttributeNum = 24u

public val PROC_THREAD_ATTRIBUTE_MITIGATION_POLICY1: ProcThreadAttributeNum = 7u

public val PROC_THREAD_ATTRIBUTE_PARENT_PROCESS1: ProcThreadAttributeNum = 0u

public val PROC_THREAD_ATTRIBUTE_PREFERRED_NODE1: ProcThreadAttributeNum = 4u

public val PROC_THREAD_ATTRIBUTE_PROTECTION_LEVEL1: ProcThreadAttributeNum = 11u

public val PROC_THREAD_ATTRIBUTE_PSEUDO_CONSOLE: ProcThreadAttributeNum = 22u

public val PROC_THREAD_ATTRIBUTE_SAFE_OPEN_PROMPT_ORIGIN_CLAIM: ProcThreadAttributeNum = 17u

public val PROC_THREAD_ATTRIBUTE_SECURITY_CAPABILITIES1: ProcThreadAttributeNum = 9u

public val PROC_THREAD_ATTRIBUTE_TRUSTED_APP: ProcThreadAttributeNum = 29u

public val PROC_THREAD_ATTRIBUTE_UMS_THREAD1: ProcThreadAttributeNum = 6u

public val PROC_THREAD_ATTRIBUTE_WIN32K_FILTER1: ProcThreadAttributeNum = 16u

public val PROCESS_ASLR_POLICY: ProcessMitigationPolicy = 1

public val PROCESS_ACTIVATION_CONTEXT_TRUST_POLICY: ProcessMitigationPolicy = 19

public val PROCESS_APP_MEMORY_INFO: ProcessInformationClass = 2

public val PROCESS_CHILD_PROCESS_POLICY: ProcessMitigationPolicy = 13

public val PROCESS_CONTROL_FLOW_GUARD_POLICY: ProcessMitigationPolicy = 7

public val PROCESS_DEP_POLICY: ProcessMitigationPolicy = 0

public val PROCESS_DYNAMIC_CODE_POLICY: ProcessMitigationPolicy = 2

public val PROCESS_EXTENSION_POINT_DISABLE_POLICY: ProcessMitigationPolicy = 6

public val PROCESS_FONT_DISABLE_POLICY: ProcessMitigationPolicy = 9

public val PROCESS_IMAGE_LOAD_POLICY: ProcessMitigationPolicy = 10

public val PROCESS_IN_PRIVATE_INFO: ProcessInformationClass = 3

public val PROCESS_INFORMATION_CLASS_MAX: ProcessInformationClass = 12

public val PROCESS_LEAP_SECOND_INFO: ProcessInformationClass = 8

public val PROCESS_MACHINE_TYPE_INFO: ProcessInformationClass = 9

public val PROCESS_MAX_OVERRIDE_PREFETCH_PARAMETER: ProcessInformationClass = 11

public val PROCESS_MEMORY_EXHAUSTION_INFO: ProcessInformationClass = 1

public val PROCESS_MEMORY_PRIORITY: ProcessInformationClass = 0

public val PROCESS_MITIGATION_OPTIONS_MASK: ProcessMitigationPolicy = 5

public val PROCESS_OVERRIDE_SUBSEQUENT_PREFETCH_PARAMETER: ProcessInformationClass = 10

public val PROCESS_PAYLOAD_RESTRICTION_POLICY: ProcessMitigationPolicy = 12

public val PROCESS_POWER_THROTTLING: ProcessInformationClass = 4

public val PROCESS_PROTECTION_LEVEL_INFO: ProcessInformationClass = 7

public val PROCESS_REDIRECTION_TRUST_POLICY: ProcessMitigationPolicy = 16

public val PROCESS_RESERVED_VALUE1: ProcessInformationClass = 5

public val PROCESS_SEHOP_POLICY: ProcessMitigationPolicy = 18

public val PROCESS_SIDE_CHANNEL_ISOLATION_POLICY: ProcessMitigationPolicy = 14

public val PROCESS_SIGNATURE_POLICY: ProcessMitigationPolicy = 8

public val PROCESS_STRICT_HANDLE_CHECK_POLICY: ProcessMitigationPolicy = 3

public val PROCESS_SYSTEM_CALL_DISABLE_POLICY: ProcessMitigationPolicy = 4

public val PROCESS_SYSTEM_CALL_FILTER_POLICY: ProcessMitigationPolicy = 11

public val PROCESS_TELEMETRY_COVERAGE_INFO: ProcessInformationClass = 6

public val PROCESS_USER_POINTER_AUTH_POLICY: ProcessMitigationPolicy = 17

public val PROCESS_USER_SHADOW_STACK_POLICY: ProcessMitigationPolicy = 15

public val QUEUE_USER_APC_CALLBACK_DATA_CONTEXT: QueueUserApcFlags = 65536

public val QUEUE_USER_APC_FLAGS_NONE: QueueUserApcFlags = 0

public val QUEUE_USER_APC_FLAGS_SPECIAL_USER_APC: QueueUserApcFlags = 1

public val REALTIME_PRIORITY_CLASS: ProcessCreationFlags = 256u

public val RTL_CRITICAL_SECTION_ALL_FLAG_BITS: UInt = 4278190080u

public val RTL_CRITICAL_SECTION_DEBUG_FLAG_STATIC_INIT: UInt = 1u

public val RTL_CRITICAL_SECTION_FLAG_DYNAMIC_SPIN: UInt = 33554432u

public val RTL_CRITICAL_SECTION_FLAG_FORCE_DEBUG_INFO: UInt = 268435456u

public val RTL_CRITICAL_SECTION_FLAG_NO_DEBUG_INFO: UInt = 16777216u

public val RTL_CRITICAL_SECTION_FLAG_RESOURCE_TYPE: UInt = 134217728u

public val RTL_CRITICAL_SECTION_FLAG_STATIC_INIT: UInt = 67108864u

public val RTWQ_MULTITHREADED_WORKQUEUE: RtwqWorkqueueType = 2

public val RTWQ_STANDARD_WORKQUEUE: RtwqWorkqueueType = 0

public val RTWQ_WINDOW_WORKQUEUE: RtwqWorkqueueType = 1

public val SEMAPHORE_ALL_ACCESS: SynchronizationAccessRights = 2031619u

public val SEMAPHORE_MODIFY_STATE: SynchronizationAccessRights = 2u

public val SRWLOCK_INIT: Srwlock = Srwlock(ptr = null)

public val STACK_SIZE_PARAM_IS_A_RESERVATION: ThreadCreationFlags = 65536u

public val STARTF_FORCEOFFFEEDBACK: StartupinfowFlags = 128u

public val STARTF_FORCEONFEEDBACK: StartupinfowFlags = 64u

public val STARTF_PREVENTPINNING: StartupinfowFlags = 8192u

public val STARTF_RUNFULLSCREEN: StartupinfowFlags = 32u

public val STARTF_TITLEISAPPID: StartupinfowFlags = 4096u

public val STARTF_TITLEISLINKNAME: StartupinfowFlags = 2048u

public val STARTF_UNTRUSTEDSOURCE: StartupinfowFlags = 32768u

public val STARTF_USECOUNTCHARS: StartupinfowFlags = 8u

public val STARTF_USEFILLATTRIBUTE: StartupinfowFlags = 16u

public val STARTF_USEHOTKEY: StartupinfowFlags = 512u

public val STARTF_USEPOSITION: StartupinfowFlags = 4u

public val STARTF_USESHOWWINDOW: StartupinfowFlags = 1u

public val STARTF_USESIZE: StartupinfowFlags = 2u

public val STARTF_USESTDHANDLES: StartupinfowFlags = 256u

public val SYNCHRONIZATION_BARRIER_FLAGS_BLOCK_ONLY: UInt = 2u

public val SYNCHRONIZATION_BARRIER_FLAGS_NO_DELETE: UInt = 4u

public val SYNCHRONIZATION_BARRIER_FLAGS_SPIN_ONLY: UInt = 1u

public val SYNCHRONIZATION_DELETE: SynchronizationAccessRights = 65536u

public val SYNCHRONIZATION_READ_CONTROL: SynchronizationAccessRights = 131072u

public val SYNCHRONIZATION_SYNCHRONIZE: SynchronizationAccessRights = 1048576u

public val SYNCHRONIZATION_WRITE_DAC: SynchronizationAccessRights = 262144u

public val SYNCHRONIZATION_WRITE_OWNER: SynchronizationAccessRights = 524288u

public val THREAD_ALL_ACCESS: ThreadAccessRights = 2097151u

public val THREAD_CREATE_RUN_IMMEDIATELY: ThreadCreationFlags = 0u

public val THREAD_CREATE_SUSPENDED: ThreadCreationFlags = 4u

public val THREAD_DELETE: ThreadAccessRights = 65536u

public val THREAD_DIRECT_IMPERSONATION: ThreadAccessRights = 512u

public val THREAD_GET_CONTEXT: ThreadAccessRights = 8u

public val THREAD_IMPERSONATE: ThreadAccessRights = 256u

public val THREAD_MODE_BACKGROUND_BEGIN: ThreadPriority = 65536

public val THREAD_MODE_BACKGROUND_END: ThreadPriority = 131072

public val THREAD_POWER_THROTTLING_CURRENT_VERSION: UInt = 1u

public val THREAD_POWER_THROTTLING_EXECUTION_SPEED: UInt = 1u

public val THREAD_POWER_THROTTLING_VALID_FLAGS: UInt = 1u

public val THREAD_PRIORITY_ABOVE_NORMAL: ThreadPriority = 1

public val THREAD_PRIORITY_BELOW_NORMAL: ThreadPriority = -1

public val THREAD_PRIORITY_HIGHEST: ThreadPriority = 2

public val THREAD_PRIORITY_IDLE: ThreadPriority = -15

public val THREAD_PRIORITY_LOWEST: ThreadPriority = -2

public val THREAD_PRIORITY_MIN: ThreadPriority = -2

public val THREAD_PRIORITY_NORMAL: ThreadPriority = 0

public val THREAD_PRIORITY_TIME_CRITICAL: ThreadPriority = 15

public val THREAD_QUERY_INFORMATION: ThreadAccessRights = 64u

public val THREAD_QUERY_LIMITED_INFORMATION: ThreadAccessRights = 2048u

public val THREAD_READ_CONTROL: ThreadAccessRights = 131072u

public val THREAD_RESUME: ThreadAccessRights = 4096u

public val THREAD_SET_CONTEXT: ThreadAccessRights = 16u

public val THREAD_SET_INFORMATION: ThreadAccessRights = 32u

public val THREAD_SET_LIMITED_INFORMATION: ThreadAccessRights = 1024u

public val THREAD_SET_THREAD_TOKEN: ThreadAccessRights = 128u

public val THREAD_STANDARD_RIGHTS_REQUIRED: ThreadAccessRights = 983040u

public val THREAD_SUSPEND_RESUME: ThreadAccessRights = 2u

public val THREAD_SYNCHRONIZE: ThreadAccessRights = 1048576u

public val THREAD_TERMINATE: ThreadAccessRights = 1u

public val THREAD_WRITE_DAC: ThreadAccessRights = 262144u

public val THREAD_WRITE_OWNER: ThreadAccessRights = 524288u

public val TIMER_ALL_ACCESS: SynchronizationAccessRights = 2031619u

public val TIMER_MODIFY_STATE: SynchronizationAccessRights = 2u

public val TIMER_QUERY_STATE: SynchronizationAccessRights = 1u

public val TLS_OUT_OF_INDEXES: UInt = 4294967295u

public val TP_CALLBACK_PRIORITY_COUNT: TpCallbackPriority = 3

public val TP_CALLBACK_PRIORITY_HIGH: TpCallbackPriority = 0

public val TP_CALLBACK_PRIORITY_INVALID: TpCallbackPriority = 3

public val TP_CALLBACK_PRIORITY_LOW: TpCallbackPriority = 2

public val TP_CALLBACK_PRIORITY_NORMAL: TpCallbackPriority = 1

public val THREAD_ABSOLUTE_CPU_PRIORITY: ThreadInformationClass = 1

public val THREAD_DYNAMIC_CODE_POLICY: ThreadInformationClass = 2

public val THREAD_INFORMATION_CLASS_MAX: ThreadInformationClass = 4

public val THREAD_MEMORY_PRIORITY: ThreadInformationClass = 0

public val THREAD_POWER_THROTTLING: ThreadInformationClass = 3

public val UMS_THREAD_AFFINITY: UmsThreadInfoClass = 3

public val UMS_THREAD_INVALID_INFO_CLASS: UmsThreadInfoClass = 0

public val UMS_THREAD_IS_SUSPENDED: UmsThreadInfoClass = 5

public val UMS_THREAD_IS_TERMINATED: UmsThreadInfoClass = 6

public val UMS_THREAD_MAX_INFO_CLASS: UmsThreadInfoClass = 7

public val UMS_THREAD_PRIORITY: UmsThreadInfoClass = 2

public val UMS_THREAD_TEB: UmsThreadInfoClass = 4

public val UMS_THREAD_USER_CONTEXT: UmsThreadInfoClass = 1

public val USER_ENABLED: MachineAttributes = 1

public val WT_EXECUTEDEFAULT: WorkerThreadFlags = 0u

public val WT_EXECUTEINIOTHREAD: WorkerThreadFlags = 1u

public val WT_EXECUTEINPERSISTENTTHREAD: WorkerThreadFlags = 128u

public val WT_EXECUTEINTIMERTHREAD: WorkerThreadFlags = 32u

public val WT_EXECUTEINWAITTHREAD: WorkerThreadFlags = 4u

public val WT_EXECUTELONGFUNCTION: WorkerThreadFlags = 16u

public val WT_EXECUTEONLYONCE: WorkerThreadFlags = 8u

public val WT_TRANSFER_IMPERSONATION: WorkerThreadFlags = 256u

public val WOW64CONTAINER: MachineAttributes = 4
