// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

// Upstream line 1377:
//   pub type FILE_ACCESS_RIGHTS = u32;
public typealias FILE_ACCESS_RIGHTS = UInt

// Upstream line 1119:
//   pub const DELETE: FILE_ACCESS_RIGHTS = 65536u32;
public const val DELETE: FILE_ACCESS_RIGHTS = 65536u

// Upstream line 1397:
//   pub const FILE_APPEND_DATA: FILE_ACCESS_RIGHTS = 4u32;
public const val FILE_APPEND_DATA: FILE_ACCESS_RIGHTS = 4u

// Upstream line 1459:
//   pub const FILE_DELETE_CHILD: FILE_ACCESS_RIGHTS = 64u32;
public const val FILE_DELETE_CHILD: FILE_ACCESS_RIGHTS = 64u

// Upstream line 1534:
//   pub const FILE_GENERIC_EXECUTE: FILE_ACCESS_RIGHTS = 1179808u32;
public const val FILE_GENERIC_EXECUTE: FILE_ACCESS_RIGHTS = 1179808u

// Upstream line 1535:
//   pub const FILE_GENERIC_READ: FILE_ACCESS_RIGHTS = 1179785u32;
public const val FILE_GENERIC_READ: FILE_ACCESS_RIGHTS = 1179785u

// Upstream line 1536:
//   pub const FILE_GENERIC_WRITE: FILE_ACCESS_RIGHTS = 1179926u32;
public const val FILE_GENERIC_WRITE: FILE_ACCESS_RIGHTS = 1179926u

// Upstream line 1725:
//   pub const FILE_READ_ATTRIBUTES: FILE_ACCESS_RIGHTS = 128u32;
public const val FILE_READ_ATTRIBUTES: FILE_ACCESS_RIGHTS = 128u

// Upstream line 1869:
//   pub const FILE_WRITE_ATTRIBUTES: FILE_ACCESS_RIGHTS = 256u32;
public const val FILE_WRITE_ATTRIBUTES: FILE_ACCESS_RIGHTS = 256u
