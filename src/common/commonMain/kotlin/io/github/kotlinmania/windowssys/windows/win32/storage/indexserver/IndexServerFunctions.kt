package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun bindIFilterFromStorage(pstg: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult

public expect fun bindIFilterFromStream(pstm: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult

public expect fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr, ppiunk: MutPtr): Hresult

public expect fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr, ppiunk: MutPtr): Hresult
