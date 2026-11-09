@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun BindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_BindIFilterFromStorage(pstg.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), ppiunk.toCPointer<ByteVar>())

public actual fun BindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_BindIFilterFromStream(pstm.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), ppiunk.toCPointer<ByteVar>())

public actual fun LoadIFilter(pwcspath: PCWSTR, punkouter: Long, ppiunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_LoadIFilter(pwcspath.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), ppiunk.toCPointer<ByteVar>())

public actual fun LoadIFilterEx(pwcspath: PCWSTR, dwflags: UInt, riid: Long, ppiunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_LoadIFilterEx(pwcspath.toCPointer<ByteVar>(), dwflags, riid.toCPointer<ByteVar>(), ppiunk.toCPointer<ByteVar>())
