// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Module-tracking ledger for the parceled port of upstream
// `Windows/Win32/Foundation/mod.rs` (10365 lines). Per workspace
// AGENTS.md §3, large `mod.rs` files with real implementation are
// parceled into focused per-symbol Kotlin files in upstream order;
// this `Foundation.kt` is the ledger plus the `Callers migrated:`
// append-only record.
//
// Symbols parceled so far (see each derived file's `port-lint: source`
// header — all point back to this same upstream `mod.rs`):
//
//   commonMain — typealiases / constants:
//     - HANDLE, HANDLE_FLAGS, HANDLE_FLAG_INHERIT,
//       HANDLE_FLAG_PROTECT_FROM_CLOSE, HANDLE_PTR  →  Handle.kt
//     - HGLOBAL                                    →  HGlobal.kt
//     - HLOCAL                                     →  HLocal.kt
//     - HMODULE                                    →  HModule.kt
//     - NTSTATUS, NTSTATUS_FACILITY_CODE,
//       NTSTATUS_SEVERITY_CODE                     →  NtStatus.kt
//     - DUPLICATE_HANDLE_OPTIONS                   →  DuplicateHandleOptions.kt
//     - WIN32_ERROR                                →  WinError.kt
//
//   mingwMain — FFI wrappers around `platform.windows.*`:
//     - CloseHandle                                →  mingwMain/CloseHandle.kt
//     - GetLastError                               →  mingwMain/GetLastError.kt
//     - LocalFree                                  →  mingwMain/LocalFree.kt
//
// Callers migrated:
// (none yet)
