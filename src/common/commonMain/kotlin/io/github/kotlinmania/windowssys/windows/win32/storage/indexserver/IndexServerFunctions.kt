package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun BindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("query.dll", "BindIFilterFromStorage", longArrayOf(pstg, punkouter, ppiunk)).toInt()
}

public fun BindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("query.dll", "BindIFilterFromStream", longArrayOf(pstm, punkouter, ppiunk)).toInt()
}

public fun LoadIFilter(pwcspath: PCWSTR, punkouter: Long, ppiunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("query.dll", "LoadIFilter", longArrayOf(pwcspath, punkouter, ppiunk)).toInt()
}

public fun LoadIFilterEx(pwcspath: PCWSTR, dwflags: UInt, riid: Long, ppiunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("query.dll", "LoadIFilterEx", longArrayOf(pwcspath, dwflags.toLong(), riid, ppiunk)).toInt()
}
