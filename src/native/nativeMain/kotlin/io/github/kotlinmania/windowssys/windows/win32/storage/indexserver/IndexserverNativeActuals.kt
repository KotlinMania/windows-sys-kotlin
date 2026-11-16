@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverBindIFilterFromStream
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverLoadIFilter
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssysWindowsWin32StorageIndexserverLoadIFilterEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun bindIFilterFromStorage(pstg: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(pstg.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())

public actual fun bindIFilterFromStream(pstm: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(pstm.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    windowssysWindowsWin32StorageIndexserverLoadIFilter(pwcspath.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr, ppiunk: MutPtr): Hresult =
    windowssysWindowsWin32StorageIndexserverLoadIFilterEx(pwcspath.rawAddress.toCPointer<ByteVar>(), dwflags, riid.rawAddress.toCPointer<ByteVar>(), ppiunk.rawAddress.toCPointer<ByteVar>())
