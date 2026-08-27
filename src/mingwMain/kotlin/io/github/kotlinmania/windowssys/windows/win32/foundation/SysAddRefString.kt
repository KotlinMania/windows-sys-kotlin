// port-lint: source windows-sys/src/Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.windowssys.cinterop.SysAddRefString as winSysAddRefString

// Upstream line 13 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysAddRefString(bstrstring : windows_sys::core::BSTR)
//           -> windows_sys::core::HRESULT);
//
// Increments the reference count of a BSTR. Not declared in the MinGW
// oleauto.h; provided through the win32extras cinterop def.

public fun SysAddRefString(bstrstring: BSTR): HRESULT =
    winSysAddRefString(bstrstring.toCPointer<UShortVar>())
