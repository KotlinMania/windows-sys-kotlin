@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateReader
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wMCreateBackupRestorer(pcallback: COpaquePointer?, ppbackup: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer(pcallback?.value?.toCPointer<ByteVar>(), ppbackup?.value?.toCPointer<ByteVar>())

public actual fun wMCreateEditor(ppeditor: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor(ppeditor?.value?.toCPointer<ByteVar>())

public actual fun wMCreateIndexer(ppindexer: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer(ppindexer?.value?.toCPointer<ByteVar>())

public actual fun wMCreateProfileManager(ppprofilemanager: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager(ppprofilemanager?.value?.toCPointer<ByteVar>())

public actual fun wMCreateReader(punkcert: COpaquePointer?, dwrights: UInt, ppreader: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateReader(punkcert?.value?.toCPointer<ByteVar>(), dwrights, ppreader?.value?.toCPointer<ByteVar>())

public actual fun wMCreateSyncReader(punkcert: COpaquePointer?, dwrights: UInt, ppsyncreader: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader(punkcert?.value?.toCPointer<ByteVar>(), dwrights, ppsyncreader?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriter(punkcert: COpaquePointer?, ppwriter: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter(punkcert?.value?.toCPointer<ByteVar>(), ppwriter?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriterFileSink(ppsink: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink(ppsink?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriterNetworkSink(ppsink: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink(ppsink?.value?.toCPointer<ByteVar>())

public actual fun wMCreateWriterPushSink(ppsink: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink(ppsink?.value?.toCPointer<ByteVar>())

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected(pwszfilename?.value?.toCPointer<ByteVar>(), pfisprotected?.value?.toCPointer<ByteVar>())
