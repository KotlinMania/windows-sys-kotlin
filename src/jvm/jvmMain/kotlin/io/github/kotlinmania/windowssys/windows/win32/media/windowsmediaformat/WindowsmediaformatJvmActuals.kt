@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32MediaWindowsmediaformatJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateBackupRestorer(pcallback: Long, ppbackup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateEditor(ppeditor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateIndexer(ppindexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateProfileManager(ppprofilemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateReader(punkcert: Long, dwrights: Int, ppreader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateSyncReader(punkcert: Long, dwrights: Int, ppsyncreader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateWriter(punkcert: Long, ppwriter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterFileSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterNetworkSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterPushSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_windowsmediaformat_WMIsContentProtected(pwszfilename: Long, pfisprotected: Long): Int
}

public actual fun WMCreateBackupRestorer(pcallback: Long, ppbackup: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateBackupRestorer(pcallback, ppbackup)

public actual fun WMCreateEditor(ppeditor: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateEditor(ppeditor)

public actual fun WMCreateIndexer(ppindexer: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateIndexer(ppindexer)

public actual fun WMCreateProfileManager(ppprofilemanager: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateProfileManager(ppprofilemanager)

public actual fun WMCreateReader(punkcert: Long, dwrights: UInt, ppreader: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateReader(punkcert, dwrights.toInt(), ppreader)

public actual fun WMCreateSyncReader(punkcert: Long, dwrights: UInt, ppsyncreader: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateSyncReader(punkcert, dwrights.toInt(), ppsyncreader)

public actual fun WMCreateWriter(punkcert: Long, ppwriter: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriter(punkcert, ppwriter)

public actual fun WMCreateWriterFileSink(ppsink: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterFileSink(ppsink)

public actual fun WMCreateWriterNetworkSink(ppsink: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterNetworkSink(ppsink)

public actual fun WMCreateWriterPushSink(ppsink: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterPushSink(ppsink)

public actual fun WMIsContentProtected(pwszfilename: PCWSTR, pfisprotected: Long): HRESULT =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssys_windows_win32_media_windowsmediaformat_WMIsContentProtected(pwszfilename, pfisprotected)
