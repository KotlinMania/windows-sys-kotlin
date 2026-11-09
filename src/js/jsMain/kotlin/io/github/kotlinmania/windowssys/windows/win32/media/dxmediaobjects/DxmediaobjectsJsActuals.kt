@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32MediaDxmediaobjectsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DMOEnum(guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long, ppenum: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_DMOEnum(guidcategory.toString(), dwflags.toInt(), cintypes.toInt(), pintypes.toString(), couttypes.toInt(), pouttypes.toString(), ppenum.toString()) as Int) else 0

public actual fun DMOGetName(clsiddmo: Long, szname: PWSTR): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_DMOGetName(clsiddmo.toString(), szname.toString()) as Int) else 0

public actual fun DMOGetTypes(clsiddmo: Long, ulinputtypesrequested: UInt, pulinputtypessupplied: Long, pinputtypes: Long, uloutputtypesrequested: UInt, puloutputtypessupplied: Long, poutputtypes: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_DMOGetTypes(clsiddmo.toString(), ulinputtypesrequested.toInt(), pulinputtypessupplied.toString(), pinputtypes.toString(), uloutputtypesrequested.toInt(), puloutputtypessupplied.toString(), poutputtypes.toString()) as Int) else 0

public actual fun DMORegister(szname: PCWSTR, clsiddmo: Long, guidcategory: Long, dwflags: UInt, cintypes: UInt, pintypes: Long, couttypes: UInt, pouttypes: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_DMORegister(szname.toString(), clsiddmo.toString(), guidcategory.toString(), dwflags.toInt(), cintypes.toInt(), pintypes.toString(), couttypes.toInt(), pouttypes.toString()) as Int) else 0

public actual fun DMOUnregister(clsiddmo: Long, guidcategory: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_DMOUnregister(clsiddmo.toString(), guidcategory.toString()) as Int) else 0

public actual fun MoCopyMediaType(pmtdest: Long, pmtsrc: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_MoCopyMediaType(pmtdest.toString(), pmtsrc.toString()) as Int) else 0

public actual fun MoCreateMediaType(ppmt: Long, cbformat: UInt): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_MoCreateMediaType(ppmt.toString(), cbformat.toInt()) as Int) else 0

public actual fun MoDeleteMediaType(pmt: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_MoDeleteMediaType(pmt.toString()) as Int) else 0

public actual fun MoDuplicateMediaType(ppmtdest: Long, pmtsrc: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_MoDuplicateMediaType(ppmtdest.toString(), pmtsrc.toString()) as Int) else 0

public actual fun MoFreeMediaType(pmt: Long): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_MoFreeMediaType(pmt.toString()) as Int) else 0

public actual fun MoInitMediaType(pmt: Long, cbformat: UInt): HRESULT =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_MoInitMediaType(pmt.toString(), cbformat.toInt()) as Int) else 0
