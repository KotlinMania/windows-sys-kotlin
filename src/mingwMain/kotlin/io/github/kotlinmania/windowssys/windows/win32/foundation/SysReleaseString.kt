// port-lint: source Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.cinterop.SysReleaseString as winSysReleaseString
import io.github.kotlinmania.windowssys.core.BSTR

// Upstream line 20 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysReleaseString(bstrstring : windows_sys::core::BSTR));
//
// Decrements the reference count of a BSTR. Not declared in the MinGW
// oleauto.h; provided through the win32extras cinterop def.

public fun SysReleaseString(bstrstring: BSTR): Unit = winSysReleaseString(bstrstring)