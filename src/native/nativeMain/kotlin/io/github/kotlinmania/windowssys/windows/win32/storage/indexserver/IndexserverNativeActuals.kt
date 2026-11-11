@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_bindIFilterFromStream
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_loadIFilter
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.cinterop.windowssys_windows_win32_storage_indexserver_loadIFilterEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun bindIFilterFromStorage(pstg: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage(pstg?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), ppiunk?.value?.toCPointer<ByteVar>())

public actual fun bindIFilterFromStream(pstm: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    windowssys_windows_win32_storage_indexserver_bindIFilterFromStream(pstm?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), ppiunk?.value?.toCPointer<ByteVar>())

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    windowssys_windows_win32_storage_indexserver_loadIFilter(pwcspath?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), ppiunk?.value?.toCPointer<ByteVar>())

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    windowssys_windows_win32_storage_indexserver_loadIFilterEx(pwcspath?.value?.toCPointer<ByteVar>(), dwflags, riid?.value?.toCPointer<ByteVar>(), ppiunk?.value?.toCPointer<ByteVar>())
