@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverBindIFilterFromStream
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverLoadIFilter
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverLoadIFilterEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun bindIFilterFromStorage(pstg: MutPtr<CVoid>, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(pstg.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())

public actual fun bindIFilterFromStream(pstm: MutPtr<CVoid>, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(pstm.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr<CVoid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32StorageIndexserverLoadIFilter(pwcspath.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr<Guid>, ppiunk: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32StorageIndexserverLoadIFilterEx(pwcspath.rawAddress.toCPointer<ByteVar>(), dwflags, riid.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())
