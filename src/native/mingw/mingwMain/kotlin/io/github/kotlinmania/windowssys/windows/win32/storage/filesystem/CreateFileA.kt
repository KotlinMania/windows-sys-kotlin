// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_create_file_a
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

// Upstream in Windows/Win32/Storage/FileSystem/mod.rs:
//   windows_link::link!("kernel32.dll" "system" fn CreateFileA(...));

public fun CreateFileA(
    lpfilename: PCSTR,
    dwdesiredaccess: UInt,
    dwsharemode: FILE_SHARE_MODE,
    lpsecurityattributes: Long,
    dwcreationdisposition: FILE_CREATION_DISPOSITION,
    dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES,
    htemplatefile: HANDLE,
): HANDLE =
    windows_sys_create_file_a(
        lpfilename.toCPointer<ByteVar>(),
        dwdesiredaccess,
        dwsharemode,
        lpsecurityattributes.toCPointer(),
        dwcreationdisposition,
        dwflagsandattributes,
        htemplatefile.toCPointer(),
    )?.toLong() ?: 0L
