// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

public typealias FILE_TYPE = UInt

public const val FILE_TYPE_UNKNOWN: FILE_TYPE = 0u
public const val FILE_TYPE_DISK: FILE_TYPE = 1u
public const val FILE_TYPE_CHAR: FILE_TYPE = 2u
public const val FILE_TYPE_PIPE: FILE_TYPE = 3u
public const val FILE_TYPE_REMOTE: FILE_TYPE = 32768u
