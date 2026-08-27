// port-lint: source windows-sys/src/Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

// Upstream process mitigation policy constants.

public const val MaxProcessMitigationPolicy: PROCESS_MITIGATION_POLICY = 20
public const val ProcessASLRPolicy: PROCESS_MITIGATION_POLICY = 1
public const val ProcessActivationContextTrustPolicy: PROCESS_MITIGATION_POLICY = 19
public const val ProcessChildProcessPolicy: PROCESS_MITIGATION_POLICY = 13
public const val ProcessControlFlowGuardPolicy: PROCESS_MITIGATION_POLICY = 7
public const val ProcessDEPPolicy: PROCESS_MITIGATION_POLICY = 0
public const val ProcessDynamicCodePolicy: PROCESS_MITIGATION_POLICY = 2
public const val ProcessExtensionPointDisablePolicy: PROCESS_MITIGATION_POLICY = 6
public const val ProcessFontDisablePolicy: PROCESS_MITIGATION_POLICY = 9
public const val ProcessImageLoadPolicy: PROCESS_MITIGATION_POLICY = 10
public const val ProcessMitigationOptionsMask: PROCESS_MITIGATION_POLICY = 5
public const val ProcessPayloadRestrictionPolicy: PROCESS_MITIGATION_POLICY = 12
public const val ProcessRedirectionTrustPolicy: PROCESS_MITIGATION_POLICY = 16
public const val ProcessSEHOPPolicy: PROCESS_MITIGATION_POLICY = 18
public const val ProcessSideChannelIsolationPolicy: PROCESS_MITIGATION_POLICY = 14
public const val ProcessSignaturePolicy: PROCESS_MITIGATION_POLICY = 8
public const val ProcessStrictHandleCheckPolicy: PROCESS_MITIGATION_POLICY = 3
public const val ProcessSystemCallDisablePolicy: PROCESS_MITIGATION_POLICY = 4
public const val ProcessSystemCallFilterPolicy: PROCESS_MITIGATION_POLICY = 11
public const val ProcessUserPointerAuthPolicy: PROCESS_MITIGATION_POLICY = 17
public const val ProcessUserShadowStackPolicy: PROCESS_MITIGATION_POLICY = 15
