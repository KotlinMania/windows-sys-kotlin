@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

private val windowsWin32StorageCabinetsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun fCIAddFile(hfci: ConstPtr, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFCIAddFile(hfci.rawAddress.toString(), pszsourcefile.rawAddress.toString(), pszfilename.rawAddress.toString(), fexecute, 0L.toString(), 0L.toString(), 0L.toString(), typecompress.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCICreate(perf: ConstPtr, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: ConstPtr, pv: ConstPtr): MutPtr =
    if (windowsWin32StorageCabinetsNapiAddon != null) MutPtr((windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFCICreate(perf.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), pccab.rawAddress.toString(), pv.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIDestroy(hfci: ConstPtr): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFCIDestroy(hfci.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIFlushCabinet(hfci: ConstPtr, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFCIFlushCabinet(hfci.rawAddress.toString(), fgetnextcab, 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIFlushFolder(hfci: ConstPtr, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFCIFlushFolder(hfci.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDICopy(hfdi: ConstPtr, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: ConstPtr): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFDICopy(hfdi.rawAddress.toString(), pszcabinet.rawAddress.toString(), pszcabpath.rawAddress.toString(), flags, 0L.toString(), 0L.toString(), pvuser.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: MutPtr): MutPtr =
    if (windowsWin32StorageCabinetsNapiAddon != null) MutPtr((windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFDICreate(0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), cputype, perf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDIDestroy(hfdi: ConstPtr): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFDIDestroy(hfdi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDIIsCabinet(hfdi: ConstPtr, hf: Long, pfdici: MutPtr): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFDIIsCabinet(hfdi.rawAddress.toString(), hf.toString(), pfdici.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDITruncateCabinet(hfdi: ConstPtr, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    if (windowsWin32StorageCabinetsNapiAddon != null) (windowsWin32StorageCabinetsNapiAddon.windowssysWindowsWin32StorageCabinetsFDITruncateCabinet(hfdi.rawAddress.toString(), pszcabinetname.rawAddress.toString(), ifoldertodelete.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
