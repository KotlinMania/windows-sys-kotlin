// port-lint: source windows-sys/src/Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

// Module-tracking ledger for the parceled port of upstream
// `Windows/Win32/System/Threading/mod.rs` (1285 lines). Per workspace
// AGENTS.md §3, large `mod.rs` files with real implementation are
// parceled into focused per-symbol Kotlin files in upstream order;
// this `Threading.kt` is the ledger plus the `Callers migrated:`
// append-only record.
//
// Symbols parceled so far (see each derived file's `port-lint: source`
// header — all point back to this same upstream `mod.rs`):
//
//   commonMain — typealiases / constants:
//     ThreadingTypes.kt          Type aliases (AVRT_PRIORITY, CREATE_EVENT,
//                                 CREATE_PROCESS_LOGON_FLAGS, etc.)
//     ProcessCreationFlags.kt    PROCESS_CREATION_FLAGS + all CREATE_*,
//                                 PRIORITY_CLASS, PROFILE_* constants
//     ProcessAccessRights.kt     PROCESS_ACCESS_RIGHTS + all PROCESS_*,
//                                 PROTECTION_LEVEL_* constants
//     ThreadAccessRights.kt      THREAD_ACCESS_RIGHTS + all THREAD_*,
//                                 THREAD_PRIORITY_* constants
//     SynchronizationAccessRights.kt  SYNCHRONIZATION_ACCESS_RIGHTS +
//                                 EVENT_*, MUTEX_*, SEMAPHORE_*,
//                                 TIMER_*, SYNCHRONIZATION_* constants
//     ProcessorFeatures.kt       PROCESSOR_FEATURE_ID + all PF_* constants
//     ProcessMitigation.kt       PROCESS_MITIGATION_POLICY + all Process*
//                                 policy constants
//     ProcessInformation.kt      PROCESS_INFORMATION_CLASS +
//                                 Process* info constants
//     ProcThreadAttribute.kt     PROC_THREAD_ATTRIBUTE_NUM + all
//                                 ProcThreadAttribute* constants
//     ThreadingConstants.kt      INFINITE, FLS_OUT_OF_INDEXES,
//                                 TLS_OUT_OF_INDEXES, etc.
//     ThreadingStructs.kt        APP_MEMORY_INFORMATION,
//                                 CONDITION_VARIABLE, INIT_ONCE,
//                                 IO_COUNTERS, MEMORY_PRIORITY_INFORMATION,
//                                 PROCESS_INFORMATION, STARTUPINFOA/W,
//                                 STARTUPINFOEXA/W, SRWLOCK,
//                                 SYNCHRONIZATION_BARRIER, etc.
//     (Function-pointer type aliases LPTHREAD_START_ROUTINE,
//      LPFIBER_START_ROUTINE, PTP_*_CALLBACK, etc. live in
//      ThreadingTypes.kt alongside the integer/pointer typealiases.)
//
// Callers migrated:
// (none yet)
