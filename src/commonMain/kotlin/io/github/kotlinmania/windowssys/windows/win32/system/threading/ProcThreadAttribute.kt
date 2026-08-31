// port-lint: source windows-sys/src/Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

// Upstream proc thread attribute number constants and the packed
// PROC_THREAD_ATTRIBUTE_* value constants (which combine the number
// with the input/thread flags in the high bits).

public const val ProcThreadAttributeAllApplicationPackagesPolicy: PROC_THREAD_ATTRIBUTE_NUM = 15u
public const val ProcThreadAttributeChildProcessPolicy: PROC_THREAD_ATTRIBUTE_NUM = 14u
public const val ProcThreadAttributeComponentFilter: PROC_THREAD_ATTRIBUTE_NUM = 26u
public const val ProcThreadAttributeDesktopAppPolicy: PROC_THREAD_ATTRIBUTE_NUM = 18u
public const val ProcThreadAttributeEnableOptionalXStateFeatures: PROC_THREAD_ATTRIBUTE_NUM = 27u
public const val ProcThreadAttributeGroupAffinity: PROC_THREAD_ATTRIBUTE_NUM = 3u
public const val ProcThreadAttributeHandleList: PROC_THREAD_ATTRIBUTE_NUM = 2u
public const val ProcThreadAttributeIdealProcessor: PROC_THREAD_ATTRIBUTE_NUM = 5u
public const val ProcThreadAttributeJobList: PROC_THREAD_ATTRIBUTE_NUM = 13u
public const val ProcThreadAttributeMachineType: PROC_THREAD_ATTRIBUTE_NUM = 25u
public const val ProcThreadAttributeMitigationAuditPolicy: PROC_THREAD_ATTRIBUTE_NUM = 24u
public const val ProcThreadAttributeMitigationPolicy: PROC_THREAD_ATTRIBUTE_NUM = 7u
public const val ProcThreadAttributeParentProcess: PROC_THREAD_ATTRIBUTE_NUM = 0u
public const val ProcThreadAttributePreferredNode: PROC_THREAD_ATTRIBUTE_NUM = 4u
public const val ProcThreadAttributeProtectionLevel: PROC_THREAD_ATTRIBUTE_NUM = 11u
public const val ProcThreadAttributePseudoConsole: PROC_THREAD_ATTRIBUTE_NUM = 22u
public const val ProcThreadAttributeSafeOpenPromptOriginClaim: PROC_THREAD_ATTRIBUTE_NUM = 17u
public const val ProcThreadAttributeSecurityCapabilities: PROC_THREAD_ATTRIBUTE_NUM = 9u
public const val ProcThreadAttributeTrustedApp: PROC_THREAD_ATTRIBUTE_NUM = 29u
public const val ProcThreadAttributeUmsThread: PROC_THREAD_ATTRIBUTE_NUM = 6u
public const val ProcThreadAttributeWin32kFilter: PROC_THREAD_ATTRIBUTE_NUM = 16u

// Packed PROC_THREAD_ATTRIBUTE_* value constants
public const val PROC_THREAD_ATTRIBUTE_ALL_APPLICATION_PACKAGES_POLICY: UInt = 131087u
public const val PROC_THREAD_ATTRIBUTE_CHILD_PROCESS_POLICY: UInt = 131086u
public const val PROC_THREAD_ATTRIBUTE_COMPONENT_FILTER: UInt = 131098u
public const val PROC_THREAD_ATTRIBUTE_DESKTOP_APP_POLICY: UInt = 131090u
public const val PROC_THREAD_ATTRIBUTE_ENABLE_OPTIONAL_XSTATE_FEATURES: UInt = 196635u
public const val PROC_THREAD_ATTRIBUTE_GROUP_AFFINITY: UInt = 196611u
public const val PROC_THREAD_ATTRIBUTE_HANDLE_LIST: UInt = 131074u
public const val PROC_THREAD_ATTRIBUTE_IDEAL_PROCESSOR: UInt = 196613u
public const val PROC_THREAD_ATTRIBUTE_JOB_LIST: UInt = 131085u
public const val PROC_THREAD_ATTRIBUTE_MACHINE_TYPE: UInt = 131097u
public const val PROC_THREAD_ATTRIBUTE_MITIGATION_AUDIT_POLICY: UInt = 131096u
public const val PROC_THREAD_ATTRIBUTE_MITIGATION_POLICY: UInt = 131079u
public const val PROC_THREAD_ATTRIBUTE_PARENT_PROCESS: UInt = 131072u
public const val PROC_THREAD_ATTRIBUTE_PREFERRED_NODE: UInt = 131076u
public const val PROC_THREAD_ATTRIBUTE_PROTECTION_LEVEL: UInt = 131083u
public const val PROC_THREAD_ATTRIBUTE_PSEUDOCONSOLE: UInt = 131094u
public const val PROC_THREAD_ATTRIBUTE_REPLACE_VALUE: UInt = 1u
public const val PROC_THREAD_ATTRIBUTE_SECURITY_CAPABILITIES: UInt = 131081u
public const val PROC_THREAD_ATTRIBUTE_UMS_THREAD: UInt = 196614u
public const val PROC_THREAD_ATTRIBUTE_WIN32K_FILTER: UInt = 131088u
