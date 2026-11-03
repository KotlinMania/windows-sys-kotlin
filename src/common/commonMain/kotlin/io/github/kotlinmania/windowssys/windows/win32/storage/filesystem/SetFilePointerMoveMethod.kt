// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

// Upstream lines 1435, 1458, 1482, 3513 in Windows/Win32/Storage/FileSystem/mod.rs:
//   pub type SET_FILE_POINTER_MOVE_METHOD = u32;
//   pub const FILE_BEGIN: SET_FILE_POINTER_MOVE_METHOD = 0u32;
//   pub const FILE_CURRENT: SET_FILE_POINTER_MOVE_METHOD = 1u32;
//   pub const FILE_END: SET_FILE_POINTER_MOVE_METHOD = 2u32;

public typealias SET_FILE_POINTER_MOVE_METHOD = UInt

public const val FILE_BEGIN: SET_FILE_POINTER_MOVE_METHOD = 0u
public const val FILE_CURRENT: SET_FILE_POINTER_MOVE_METHOD = 1u
public const val FILE_END: SET_FILE_POINTER_MOVE_METHOD = 2u
