@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32MediaWindowsmediaformatNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun WMCreateBackupRestorer(pcallback: Long, ppbackup: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateBackupRestorer(pcallback.toString(), ppbackup.toString()) as Int) else 0

public actual fun WMCreateEditor(ppeditor: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateEditor(ppeditor.toString()) as Int) else 0

public actual fun WMCreateIndexer(ppindexer: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateIndexer(ppindexer.toString()) as Int) else 0

public actual fun WMCreateProfileManager(ppprofilemanager: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateProfileManager(ppprofilemanager.toString()) as Int) else 0

public actual fun WMCreateReader(punkcert: Long, dwrights: UInt, ppreader: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateReader(punkcert.toString(), dwrights.toInt(), ppreader.toString()) as Int) else 0

public actual fun WMCreateSyncReader(punkcert: Long, dwrights: UInt, ppsyncreader: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateSyncReader(punkcert.toString(), dwrights.toInt(), ppsyncreader.toString()) as Int) else 0

public actual fun WMCreateWriter(punkcert: Long, ppwriter: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriter(punkcert.toString(), ppwriter.toString()) as Int) else 0

public actual fun WMCreateWriterFileSink(ppsink: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterFileSink(ppsink.toString()) as Int) else 0

public actual fun WMCreateWriterNetworkSink(ppsink: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterNetworkSink(ppsink.toString()) as Int) else 0

public actual fun WMCreateWriterPushSink(ppsink: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMCreateWriterPushSink(ppsink.toString()) as Int) else 0

public actual fun WMIsContentProtected(pwszfilename: PCWSTR, pfisprotected: Long): HRESULT =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_WMIsContentProtected(pwszfilename.toString(), pfisprotected.toString()) as Int) else 0
