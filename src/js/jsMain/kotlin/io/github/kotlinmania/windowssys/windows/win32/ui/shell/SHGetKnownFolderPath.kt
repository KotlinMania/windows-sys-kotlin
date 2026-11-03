// port-lint: source Windows/Win32/UI/Shell/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SHGetKnownFolderPath(
    rfid: Long,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT {
    val res = WindowsSysNative.SHGetKnownFolderPath(rfid.toDouble(), dwflags.toInt(), htoken.toDouble())
    if (res != null) {
        val hr = (res.hr as? Number)?.toInt() ?: -2147467263
        val path = (res.path as? Number)?.toLong() ?: 0L
        ppszpath[0] = path
        return hr
    }
    return -2147467263
}

public fun SHGetKnownFolderPath(
    rfid: GUID,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT =
    SHGetKnownFolderPath(0L, dwflags, htoken, ppszpath)
