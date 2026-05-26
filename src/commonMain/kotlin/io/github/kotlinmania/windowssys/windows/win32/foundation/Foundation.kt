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
//       HANDLE_FLAG_PROTECT_FROM_CLOSE, HANDLE_PTR,
//       INVALID_HANDLE_VALUE                       →  Handle.kt
//     - HGLOBAL                                    →  HGlobal.kt
//     - HLOCAL                                     →  HLocal.kt
//     - HMODULE                                    →  HModule.kt
//     - NTSTATUS, NTSTATUS_FACILITY_CODE,
//       NTSTATUS_SEVERITY_CODE                     →  NtStatus.kt
//     - DUPLICATE_HANDLE_OPTIONS,
//       DUPLICATE_SAME_ACCESS                      →  DuplicateHandleOptions.kt
//     - WIN32_ERROR, ERROR_SUCCESS, ERROR_NOT_FOUND,
//       ERROR_INSUFFICIENT_BUFFER, ERROR_IO_PENDING,
//       ERROR_ALREADY_EXISTS, ERROR_FILE_NOT_FOUND  →  WinError.kt
//     - WAIT_EVENT, WAIT_FAILED, WAIT_OBJECT_0,
//       WAIT_TIMEOUT                               →  WaitEvent.kt
//     - FWP_E_ALREADY_EXISTS, FWP_E_FILTER_NOT_FOUND,
//       FWP_E_NOT_FOUND                            →  FwpErrors.kt
//     - FALSE, TRUE                                →  Bool.kt
//     - GENERIC_ACCESS_RIGHTS, GENERIC_ALL,
//       GENERIC_EXECUTE, GENERIC_READ,
//       GENERIC_WRITE                              →  GenericAccessRights.kt
//     - LUID                                       →  Luid.kt
//
//   mingwMain — FFI wrappers around `platform.windows.*` (cinterop):
//     - CloseHandle                                →  mingwMain/CloseHandle.kt
//     - GetLastError                               →  mingwMain/GetLastError.kt
//     - LocalFree                                  →  mingwMain/LocalFree.kt
//     - SetHandleInformation                       →  mingwMain/SetHandleInformation.kt
//     - DuplicateHandle                            →  mingwMain/DuplicateHandle.kt
//
//   jvmMain — FFI wrappers around JNA `Kernel32Jna` (runtime LoadLibrary):
//     - CloseHandle                                →  jvmMain/CloseHandle.kt
//     - GetLastError                               →  jvmMain/GetLastError.kt
//     - LocalFree                                  →  jvmMain/LocalFree.kt
//     - SetHandleInformation                       →  jvmMain/SetHandleInformation.kt
//     - DuplicateHandle                            →  jvmMain/DuplicateHandle.kt
//
// Callers migrated:
// (none yet)
