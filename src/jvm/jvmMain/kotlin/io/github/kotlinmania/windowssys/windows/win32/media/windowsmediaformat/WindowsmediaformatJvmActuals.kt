@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32MediaWindowsmediaformatJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer(pcallback: Long, ppbackup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor(ppeditor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer(ppindexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager(ppprofilemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateReader(punkcert: Long, dwrights: Int, ppreader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader(punkcert: Long, dwrights: Int, ppsyncreader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter(punkcert: Long, ppwriter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected(pwszfilename: Long, pfisprotected: Long): Int
}

public actual fun wMCreateBackupRestorer(pcallback: COpaquePointer?, ppbackup: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer((pcallback?.value ?: 0L), (ppbackup?.value ?: 0L))

public actual fun wMCreateEditor(ppeditor: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor((ppeditor?.value ?: 0L))

public actual fun wMCreateIndexer(ppindexer: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer((ppindexer?.value ?: 0L))

public actual fun wMCreateProfileManager(ppprofilemanager: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager((ppprofilemanager?.value ?: 0L))

public actual fun wMCreateReader(punkcert: COpaquePointer?, dwrights: UInt, ppreader: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateReader((punkcert?.value ?: 0L), dwrights.toInt(), (ppreader?.value ?: 0L))

public actual fun wMCreateSyncReader(punkcert: COpaquePointer?, dwrights: UInt, ppsyncreader: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader((punkcert?.value ?: 0L), dwrights.toInt(), (ppsyncreader?.value ?: 0L))

public actual fun wMCreateWriter(punkcert: COpaquePointer?, ppwriter: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter((punkcert?.value ?: 0L), (ppwriter?.value ?: 0L))

public actual fun wMCreateWriterFileSink(ppsink: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink((ppsink?.value ?: 0L))

public actual fun wMCreateWriterNetworkSink(ppsink: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink((ppsink?.value ?: 0L))

public actual fun wMCreateWriterPushSink(ppsink: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink((ppsink?.value ?: 0L))

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: COpaquePointer?): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected((pwszfilename?.value ?: 0L), (pfisprotected?.value ?: 0L))
