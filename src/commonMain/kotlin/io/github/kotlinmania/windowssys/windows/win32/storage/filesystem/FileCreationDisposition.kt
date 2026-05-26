// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

// Upstream line 1457:
//   pub type FILE_CREATION_DISPOSITION = u32;
public typealias FILE_CREATION_DISPOSITION = UInt

// Upstream line 1049:
//   pub const CREATE_NEW: FILE_CREATION_DISPOSITION = 1u32;
public const val CREATE_NEW: FILE_CREATION_DISPOSITION = 1u

// Upstream line 1048:
//   pub const CREATE_ALWAYS: FILE_CREATION_DISPOSITION = 2u32;
public const val CREATE_ALWAYS: FILE_CREATION_DISPOSITION = 2u

// Upstream line 3310:
//   pub const OPEN_EXISTING: FILE_CREATION_DISPOSITION = 3u32;
public const val OPEN_EXISTING: FILE_CREATION_DISPOSITION = 3u

// Upstream line 3309:
//   pub const OPEN_ALWAYS: FILE_CREATION_DISPOSITION = 4u32;
public const val OPEN_ALWAYS: FILE_CREATION_DISPOSITION = 4u

// Upstream line 3922:
//   pub const TRUNCATE_EXISTING: FILE_CREATION_DISPOSITION = 5u32;
public const val TRUNCATE_EXISTING: FILE_CREATION_DISPOSITION = 5u
