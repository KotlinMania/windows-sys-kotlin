@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32MediaDxmediaobjectsNapiAddon(): Boolean

private val windowsWin32MediaDxmediaobjectsNapiAvailable: Boolean = initWindowsWin32MediaDxmediaobjectsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOEnum(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOGetName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsDMORegister(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsDMORegister(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(p0)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(p0)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(p0: String, p1: Int): Int

public actual fun dMOEnum(guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>, ppenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOEnum(guidcategory.rawAddress.toString(), dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress.toString(), couttypes.toInt(), pouttypes.rawAddress.toString(), ppenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetName(clsiddmo: ConstPtr<Guid>, szname: Pwstr): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOGetName(clsiddmo.rawAddress.toString(), szname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetTypes(clsiddmo: ConstPtr<Guid>, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr<UInt>, pinputtypes: MutPtr<DmoPartialMediatype>, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr<UInt>, poutputtypes: MutPtr<DmoPartialMediatype>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(clsiddmo.rawAddress.toString(), ulinputtypesrequested.toInt(), pulinputtypessupplied.rawAddress.toString(), pinputtypes.rawAddress.toString(), uloutputtypesrequested.toInt(), puloutputtypessupplied.rawAddress.toString(), poutputtypes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsDMORegister(szname.rawAddress.toString(), clsiddmo.rawAddress.toString(), guidcategory.rawAddress.toString(), dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress.toString(), couttypes.toInt(), pouttypes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOUnregister(clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(clsiddmo.rawAddress.toString(), guidcategory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCopyMediaType(pmtdest: MutPtr<DmoMediaType>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(pmtdest.rawAddress.toString(), pmtsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCreateMediaType(ppmt: MutPtr<MutPtr<DmoMediaType>>, cbformat: UInt): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(ppmt.rawAddress.toString(), cbformat.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDeleteMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(pmt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDuplicateMediaType(ppmtdest: MutPtr<MutPtr<DmoMediaType>>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(ppmtdest.rawAddress.toString(), pmtsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moFreeMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(pmt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moInitMediaType(pmt: MutPtr<DmoMediaType>, cbformat: UInt): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAvailable) wasmWindowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(pmt.rawAddress.toString(), cbformat.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
