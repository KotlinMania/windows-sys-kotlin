@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun WMCreateBackupRestorer(pcallback: Long, ppbackup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateBackupRestorer(pcallback.toCPointer<ByteVar>(), ppbackup.toCPointer<ByteVar>())

public actual fun WMCreateEditor(ppeditor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateEditor(ppeditor.toCPointer<ByteVar>())

public actual fun WMCreateIndexer(ppindexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateIndexer(ppindexer.toCPointer<ByteVar>())

public actual fun WMCreateProfileManager(ppprofilemanager: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateProfileManager(ppprofilemanager.toCPointer<ByteVar>())

public actual fun WMCreateReader(punkcert: Long, dwrights: UInt, ppreader: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateReader(punkcert.toCPointer<ByteVar>(), dwrights, ppreader.toCPointer<ByteVar>())

public actual fun WMCreateSyncReader(punkcert: Long, dwrights: UInt, ppsyncreader: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateSyncReader(punkcert.toCPointer<ByteVar>(), dwrights, ppsyncreader.toCPointer<ByteVar>())

public actual fun WMCreateWriter(punkcert: Long, ppwriter: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriter(punkcert.toCPointer<ByteVar>(), ppwriter.toCPointer<ByteVar>())

public actual fun WMCreateWriterFileSink(ppsink: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterFileSink(ppsink.toCPointer<ByteVar>())

public actual fun WMCreateWriterNetworkSink(ppsink: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterNetworkSink(ppsink.toCPointer<ByteVar>())

public actual fun WMCreateWriterPushSink(ppsink: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterPushSink(ppsink.toCPointer<ByteVar>())

public actual fun WMIsContentProtected(pwszfilename: PCWSTR, pfisprotected: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_WMIsContentProtected(pwszfilename.toCPointer<ByteVar>(), pfisprotected.toCPointer<ByteVar>())
