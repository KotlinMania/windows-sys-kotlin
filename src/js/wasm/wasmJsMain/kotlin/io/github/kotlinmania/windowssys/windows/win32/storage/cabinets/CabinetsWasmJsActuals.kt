@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageCabinetsNapiAddon(): Boolean

private val windowsWin32StorageCabinetsNapiAvailable: Boolean = initWindowsWin32StorageCabinetsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFCIAddFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFCIAddFile(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFCICreate(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFCICreate(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFCIDestroy(p0)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFCIDestroy(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFCIFlushCabinet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFCIFlushCabinet(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFCIFlushFolder(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFCIFlushFolder(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFDICopy(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFDICopy(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFDICreate(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFDICreate(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFDIDestroy(p0)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFDIDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFDIIsCabinet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFDIIsCabinet(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCabinetsFDITruncateCabinet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageCabinetsFDITruncateCabinet(p0: String, p1: String, p2: Int): Int

public actual fun fCIAddFile(hfci: ConstPtr<CVoid>, pszsourcefile: Pcstr, pszfilename: Pcstr, fexecute: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus, pfnfcigoi: Pfnfcigetopeninfo, typecompress: UShort): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFCIAddFile(hfci.rawAddress.toString(), pszsourcefile.rawAddress.toString(), pszfilename.rawAddress.toString(), fexecute, 0L.toString(), 0L.toString(), 0L.toString(), typecompress.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCICreate(perf: ConstPtr<Erf>, pfnfcifp: Pfnfcifileplaced, pfna: Pfnfcialloc, pfnf: Pfnfcifree, pfnopen: Pfnfciopen, pfnread: Pfnfciread, pfnwrite: Pfnfciwrite, pfnclose: Pfnfciclose, pfnseek: Pfnfciseek, pfndelete: Pfnfcidelete, pfnfcigtf: Pfnfcigettempfile, pccab: ConstPtr<Ccab>, pv: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32StorageCabinetsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageCabinetsFCICreate(perf.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), pccab.rawAddress.toString(), pv.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIDestroy(hfci: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFCIDestroy(hfci.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIFlushCabinet(hfci: ConstPtr<CVoid>, fgetnextcab: Bool, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFCIFlushCabinet(hfci.rawAddress.toString(), fgetnextcab, 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fCIFlushFolder(hfci: ConstPtr<CVoid>, pfnfcignc: Pfnfcigetnextcabinet, pfnfcis: Pfnfcistatus): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFCIFlushFolder(hfci.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDICopy(hfdi: ConstPtr<CVoid>, pszcabinet: Pcstr, pszcabpath: Pcstr, flags: Int, pfnfdin: Pfnfdinotify, pfnfdid: Pfnfdidecrypt, pvuser: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFDICopy(hfdi.rawAddress.toString(), pszcabinet.rawAddress.toString(), pszcabpath.rawAddress.toString(), flags, 0L.toString(), 0L.toString(), pvuser.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDICreate(pfnalloc: Pfnalloc, pfnfree: Pfnfree, pfnopen: Pfnopen, pfnread: Pfnread, pfnwrite: Pfnwrite, pfnclose: Pfnclose, pfnseek: Pfnseek, cputype: FdicreateCpuType, perf: MutPtr<Erf>): MutPtr<CVoid> =
    if (windowsWin32StorageCabinetsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageCabinetsFDICreate(0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), cputype, perf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDIDestroy(hfdi: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFDIDestroy(hfdi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDIIsCabinet(hfdi: ConstPtr<CVoid>, hf: Long, pfdici: MutPtr<Fdicabinetinfo>): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFDIIsCabinet(hfdi.rawAddress.toString(), hf.toString(), pfdici.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fDITruncateCabinet(hfdi: ConstPtr<CVoid>, pszcabinetname: Pcstr, ifoldertodelete: UShort): Bool =
    if (windowsWin32StorageCabinetsNapiAvailable) wasmWindowssysWindowsWin32StorageCabinetsFDITruncateCabinet(hfdi.rawAddress.toString(), pszcabinetname.rawAddress.toString(), ifoldertodelete.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
