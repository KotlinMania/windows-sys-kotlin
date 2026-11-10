@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

private val _windowsWin32StorageCabinetsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun fCIAddFile(hfci: COpaquePointer?, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fCIAddFile((hfci?.value ?: 0L).toString(), (pszsourcefile?.value ?: 0L).toString(), (pszfilename?.value ?: 0L).toString(), fexecute, 0L.toString(), 0L.toString(), 0L.toString(), typecompress.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCICreate(perf: COpaquePointer?, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: COpaquePointer?, pv: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fCICreate((perf?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), (pccab?.value ?: 0L).toString(), (pv?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIDestroy(hfci: COpaquePointer?): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fCIDestroy((hfci?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIFlushCabinet(hfci: COpaquePointer?, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fCIFlushCabinet((hfci?.value ?: 0L).toString(), fgetnextcab, 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIFlushFolder(hfci: COpaquePointer?, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fCIFlushFolder((hfci?.value ?: 0L).toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDICopy(hfdi: COpaquePointer?, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: COpaquePointer?): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fDICopy((hfdi?.value ?: 0L).toString(), (pszcabinet?.value ?: 0L).toString(), (pszcabpath?.value ?: 0L).toString(), flags, 0L.toString(), 0L.toString(), (pvuser?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fDICreate(0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), cputype, (perf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDIDestroy(hfdi: COpaquePointer?): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fDIDestroy((hfdi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDIIsCabinet(hfdi: COpaquePointer?, hf: Long, pfdici: COpaquePointer?): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fDIIsCabinet((hfdi?.value ?: 0L).toString(), hf.toString(), (pfdici?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDITruncateCabinet(hfdi: COpaquePointer?, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    if (_windowsWin32StorageCabinetsNapiAddon != null) (_windowsWin32StorageCabinetsNapiAddon.windowssys_windows_win32_storage_cabinets_fDITruncateCabinet((hfdi?.value ?: 0L).toString(), (pszcabinetname?.value ?: 0L).toString(), ifoldertodelete.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
