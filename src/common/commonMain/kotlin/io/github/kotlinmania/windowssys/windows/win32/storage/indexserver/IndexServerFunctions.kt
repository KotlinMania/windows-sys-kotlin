package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun bindIFilterFromStorage(pstg: MutPtr<CVoid>, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun bindIFilterFromStream(pstm: MutPtr<CVoid>, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr<Guid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult
