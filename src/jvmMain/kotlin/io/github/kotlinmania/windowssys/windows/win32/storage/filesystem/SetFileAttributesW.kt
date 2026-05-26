// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import com.sun.jna.Pointer
import com.sun.jna.WString
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jna

// Upstream line 392 in Windows/Win32/Storage/FileSystem/mod.rs:
//
//   windows_link::link!("kernel32.dll" "system"
//       fn SetFileAttributesW(lpfilename : windows_sys::core::PCWSTR,
//                             dwfileattributes : FILE_FLAGS_AND_ATTRIBUTES)
//           -> windows_sys::core::BOOL);
//
// JVM-on-Windows wrapper. Mirrors the `mingwMain` SetFileAttributesW
// shape — same public signature, same `Long → wide-string` bridge —
// but routes through JNA's runtime-loaded kernel32.dll projection
// instead of the Kotlin/Native cinterop binding. The PCWSTR pointer
// is read out as a UTF-16 string and re-passed via JNA's `WString`,
// which marshals it back to a `*const u16` for the Win32 call.

public fun SetFileAttributesW(
    lpfilename: PCWSTR,
    dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES,
): BOOL = Kernel32Jna.INSTANCE.SetFileAttributesW(
    Pointer(lpfilename).getWideString(0).let { WString(it) },
    dwfileattributes.toInt(),
)
