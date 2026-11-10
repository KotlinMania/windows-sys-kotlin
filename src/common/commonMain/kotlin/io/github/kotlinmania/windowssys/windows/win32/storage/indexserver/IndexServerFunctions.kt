package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun bindIFilterFromStorage(pstg: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult

public expect fun bindIFilterFromStream(pstm: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult

public expect fun loadIFilter(pwcspath: Pcwstr, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult

public expect fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppiunk: COpaquePointer?): Hresult
