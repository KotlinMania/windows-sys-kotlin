// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

// Upstream line 1821:
//   pub type FILE_SHARE_MODE = u32;
public typealias FILE_SHARE_MODE = UInt

// Upstream line 1823:
//   pub const FILE_SHARE_READ: FILE_SHARE_MODE = 1u32;
public const val FILE_SHARE_READ: FILE_SHARE_MODE = 1u

// Upstream line 1824:
//   pub const FILE_SHARE_WRITE: FILE_SHARE_MODE = 2u32;
public const val FILE_SHARE_WRITE: FILE_SHARE_MODE = 2u
