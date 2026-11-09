@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun BindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): HRESULT =
    0

public actual fun BindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): HRESULT =
    0

public actual fun LoadIFilter(pwcspath: PCWSTR, punkouter: Long, ppiunk: Long): HRESULT =
    0

public actual fun LoadIFilterEx(pwcspath: PCWSTR, dwflags: UInt, riid: Long, ppiunk: Long): HRESULT =
    0
