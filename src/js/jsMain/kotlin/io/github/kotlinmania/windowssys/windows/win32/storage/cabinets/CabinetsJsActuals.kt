@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

private val _windowsWin32StorageCabinetsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun FCIAddFile(hfci: Long, pszsourcefile: PCSTR, pszfilename: PCSTR, fexecute: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS, pfnfcigoi: PFNFCIGETOPENINFO, typecompress: UShort): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FCIAddFile(hfci.toString(), pszsourcefile.toString(), pszfilename.toString(), fexecute, pfnfcignc.toLong().toString(), pfnfcis.toLong().toString(), pfnfcigoi.toLong().toString(), typecompress.toInt()) as Int) else 0

public actual fun FCICreate(perf: Long, pfnfcifp: PFNFCIFILEPLACED, pfna: PFNFCIALLOC, pfnf: PFNFCIFREE, pfnopen: PFNFCIOPEN, pfnread: PFNFCIREAD, pfnwrite: PFNFCIWRITE, pfnclose: PFNFCICLOSE, pfnseek: PFNFCISEEK, pfndelete: PFNFCIDELETE, pfnfcigtf: PFNFCIGETTEMPFILE, pccab: Long, pv: Long): Long =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FCICreate(perf.toString(), pfnfcifp.toLong().toString(), pfna.toLong().toString(), pfnf.toLong().toString(), pfnopen.toLong().toString(), pfnread.toLong().toString(), pfnwrite.toLong().toString(), pfnclose.toLong().toString(), pfnseek.toLong().toString(), pfndelete.toLong().toString(), pfnfcigtf.toLong().toString(), pccab.toString(), pv.toString()) as String).toLong() else 0L

public actual fun FCIDestroy(hfci: Long): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FCIDestroy(hfci.toString()) as Int) else 0

public actual fun FCIFlushCabinet(hfci: Long, fgetnextcab: BOOL, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FCIFlushCabinet(hfci.toString(), fgetnextcab, pfnfcignc.toLong().toString(), pfnfcis.toLong().toString()) as Int) else 0

public actual fun FCIFlushFolder(hfci: Long, pfnfcignc: PFNFCIGETNEXTCABINET, pfnfcis: PFNFCISTATUS): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FCIFlushFolder(hfci.toString(), pfnfcignc.toLong().toString(), pfnfcis.toLong().toString()) as Int) else 0

public actual fun FDICopy(hfdi: Long, pszcabinet: PCSTR, pszcabpath: PCSTR, flags: Int, pfnfdin: PFNFDINOTIFY, pfnfdid: PFNFDIDECRYPT, pvuser: Long): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FDICopy(hfdi.toString(), pszcabinet.toString(), pszcabpath.toString(), flags, pfnfdin.toLong().toString(), pfnfdid.toLong().toString(), pvuser.toString()) as Int) else 0

public actual fun FDICreate(pfnalloc: PFNALLOC, pfnfree: PFNFREE, pfnopen: PFNOPEN, pfnread: PFNREAD, pfnwrite: PFNWRITE, pfnclose: PFNCLOSE, pfnseek: PFNSEEK, cputype: FDICREATE_CPU_TYPE, perf: Long): Long =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FDICreate(pfnalloc.toLong().toString(), pfnfree.toLong().toString(), pfnopen.toLong().toString(), pfnread.toLong().toString(), pfnwrite.toLong().toString(), pfnclose.toLong().toString(), pfnseek.toLong().toString(), cputype, perf.toString()) as String).toLong() else 0L

public actual fun FDIDestroy(hfdi: Long): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FDIDestroy(hfdi.toString()) as Int) else 0

public actual fun FDIIsCabinet(hfdi: Long, hf: Long, pfdici: Long): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FDIIsCabinet(hfdi.toString(), hf.toString(), pfdici.toString()) as Int) else 0

public actual fun FDITruncateCabinet(hfdi: Long, pszcabinetname: PCSTR, ifoldertodelete: UShort): BOOL =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_FDITruncateCabinet(hfdi.toString(), pszcabinetname.toString(), ifoldertodelete.toInt()) as Int) else 0
