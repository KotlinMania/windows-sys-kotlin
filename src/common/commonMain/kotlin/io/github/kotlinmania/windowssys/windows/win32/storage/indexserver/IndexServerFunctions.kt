package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun BindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): HRESULT

public expect fun BindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): HRESULT

public expect fun LoadIFilter(pwcspath: PCWSTR, punkouter: Long, ppiunk: Long): HRESULT

public expect fun LoadIFilterEx(pwcspath: PCWSTR, dwflags: UInt, riid: Long, ppiunk: Long): HRESULT
