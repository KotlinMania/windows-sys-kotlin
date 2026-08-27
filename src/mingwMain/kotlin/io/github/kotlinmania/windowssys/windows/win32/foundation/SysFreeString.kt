// port-lint: source windows-sys/src/Windows/Win32/Foundation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.BSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.windowssys.cinterop.SysFreeString as winSysFreeString

// Upstream line 17 in Windows/Win32/Foundation/mod.rs:
//
//   windows_link::link!("oleaut32.dll" "system"
//       fn SysFreeString(bstrstring : windows_sys::core::BSTR));

public fun SysFreeString(bstrstring: BSTR): Unit = winSysFreeString(bstrstring.toCPointer<UShortVar>())
