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
//     SetFilePointerMoveMethod.kt SET_FILE_POINTER_MOVE_METHOD +
//                                 FILE_BEGIN, FILE_CURRENT, FILE_END
//
//   mingwMain — FFI wrappers around `cinterop` (windows_sys_wrapper)
//     AreFileApisANSI.kt          kernel32.dll  AreFileApisANSI
//     CreateFileA.kt              kernel32.dll  CreateFileA
//     CreateFileW.kt              kernel32.dll  CreateFileW
//     DeleteFileA.kt              kernel32.dll  DeleteFileA
//     DeleteFileW.kt              kernel32.dll  DeleteFileW
//     FlushFileBuffers.kt         kernel32.dll  FlushFileBuffers
//     GetFileAttributesA.kt       kernel32.dll  GetFileAttributesA
//     GetFileAttributesW.kt       kernel32.dll  GetFileAttributesW
//     GetFileSize.kt              kernel32.dll  GetFileSize
//     SetFileAttributesA.kt       kernel32.dll  SetFileAttributesA
//     SetFileAttributesW.kt       kernel32.dll  SetFileAttributesW
//     SetFilePointer.kt           kernel32.dll  SetFilePointer
//
//   jvmMain — FFI wrappers around JNI `Kernel32Jni`
//     AreFileApisANSI.kt          kernel32.dll  AreFileApisANSI
//     CreateFileA.kt              kernel32.dll  CreateFileA
//     CreateFileW.kt              kernel32.dll  CreateFileW
//     DeleteFileA.kt              kernel32.dll  DeleteFileA
//     DeleteFileW.kt              kernel32.dll  DeleteFileW
//     FlushFileBuffers.kt         kernel32.dll  FlushFileBuffers
//     GetFileAttributesA.kt       kernel32.dll  GetFileAttributesA
//     GetFileAttributesW.kt       kernel32.dll  GetFileAttributesW
//     GetFileSize.kt              kernel32.dll  GetFileSize
//     SetFileAttributesA.kt       kernel32.dll  SetFileAttributesA
//     SetFileAttributesW.kt       kernel32.dll  SetFileAttributesW
//     SetFilePointer.kt           kernel32.dll  SetFilePointer
//
//   jsMain — Node N-API wrappers around `@kotlinmania/windows-sys-native-bindings`
//     AreFileApisANSI.kt, CreateFileA.kt, CreateFileW.kt, DeleteFileA.kt,
//     DeleteFileW.kt, FlushFileBuffers.kt, GetFileAttributesA.kt,
//     GetFileAttributesW.kt, GetFileSize.kt, SetFileAttributesA.kt,
//     SetFileAttributesW.kt, SetFilePointer.kt
//
//   wasmJsMain — Stubs / N-API addon requirement
//     AreFileApisANSI.kt, CreateFileA.kt, CreateFileW.kt, DeleteFileA.kt,
//     DeleteFileW.kt, FlushFileBuffers.kt, GetFileAttributesA.kt,
//     GetFileAttributesW.kt, GetFileSize.kt, SetFileAttributesA.kt,
//     SetFileAttributesW.kt, SetFilePointer.kt
//
// Callers migrated:
// (none yet)
