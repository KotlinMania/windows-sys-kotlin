@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wMCreateBackupRestorer(pcallback: COpaquePointer?, ppbackup: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer(pcallback?.value?.toCPointer<ByteVar>(), ppbackup?.value?.toCPointer<ByteVar>())

public actual fun wMCreateEditor(ppeditor: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor(ppeditor?.value?.toCPointer<ByteVar>())

public actual fun wMCreateIndexer(ppindexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer(ppindexer?.value?.toCPointer<ByteVar>())

public actual fun wMCreateProfileManager(ppprofilemanager: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager(ppprofilemanager?.value?.toCPointer<ByteVar>())

public actual fun wMCreateReader(punkcert: COpaquePointer?, dwrights: UInt, ppreader: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateReader(punkcert?.value?.toCPointer<ByteVar>(), dwrights, ppreader?.value?.toCPointer<ByteVar>())

public actual fun wMCreateSyncReader(punkcert: COpaquePointer?, dwrights: UInt, ppsyncreader: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader(punkcert?.value?.toCPointer<ByteVar>(), dwrights, ppsyncreader?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriter(punkcert: COpaquePointer?, ppwriter: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter(punkcert?.value?.toCPointer<ByteVar>(), ppwriter?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriterFileSink(ppsink: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink(ppsink?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriterNetworkSink(ppsink: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink(ppsink?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriterPushSink(ppsink: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink(ppsink?.value?.toCPointer<ByteVar>())

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected(pwszfilename?.value?.toCPointer<ByteVar>(), pfisprotected?.value?.toCPointer<ByteVar>())
