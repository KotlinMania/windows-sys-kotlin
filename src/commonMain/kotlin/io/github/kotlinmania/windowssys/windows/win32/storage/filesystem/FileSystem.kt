// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

// Module-tracking ledger for the parceled port of upstream
// `Windows/Win32/Storage/FileSystem/mod.rs` (4367 lines). Same parcel
// pattern as Foundation: focused per-symbol-cluster `.kt` files for
// types and constants, mingwMain wrappers around `platform.windows.*`
// for FFI extern fns.
//
// Symbols parceled so far (every derived file's `port-lint: source`
// header points back to this same upstream `mod.rs`):
//
//   commonMain — typealiases / constants
//     FileAccessRights.kt         FILE_ACCESS_RIGHTS typealias +
//                                 DELETE, FILE_APPEND_DATA,
//                                 FILE_DELETE_CHILD,
//                                 FILE_GENERIC_EXECUTE,
//                                 FILE_GENERIC_READ,
//                                 FILE_GENERIC_WRITE,
//                                 FILE_READ_ATTRIBUTES,
//                                 FILE_WRITE_ATTRIBUTES
//     FileCreationDisposition.kt  FILE_CREATION_DISPOSITION +
//                                 CREATE_NEW, CREATE_ALWAYS,
//                                 OPEN_EXISTING, OPEN_ALWAYS,
//                                 TRUNCATE_EXISTING
//     FileFlagsAndAttributes.kt   FILE_FLAGS_AND_ATTRIBUTES +
//                                 FILE_ATTRIBUTE_DIRECTORY,
//                                 FILE_ATTRIBUTE_HIDDEN,
//                                 FILE_ATTRIBUTE_NORMAL,
//                                 FILE_ATTRIBUTE_READONLY,
//                                 FILE_ATTRIBUTE_SYSTEM,
//                                 FILE_FLAG_OVERLAPPED
//     FileShareMode.kt            FILE_SHARE_MODE +
//                                 FILE_SHARE_READ, FILE_SHARE_WRITE
//
//   mingwMain — FFI wrappers around `platform.windows.*`
//     SetFileAttributesW.kt       kernel32.dll  SetFileAttributesW
//
// Callers migrated:
// (none yet)
