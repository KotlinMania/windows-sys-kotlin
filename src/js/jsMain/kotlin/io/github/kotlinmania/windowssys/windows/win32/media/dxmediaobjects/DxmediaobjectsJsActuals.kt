@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32MediaDxmediaobjectsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dMOEnum(guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>, ppenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsDMOEnum(guidcategory.rawAddress.toString(), dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress.toString(), couttypes.toInt(), pouttypes.rawAddress.toString(), ppenum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetName(clsiddmo: ConstPtr<Guid>, szname: Pwstr): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsDMOGetName(clsiddmo.rawAddress.toString(), szname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetTypes(clsiddmo: ConstPtr<Guid>, ulinputtypesrequested: UInt, pulinputtypessupplied: MutPtr<UInt>, pinputtypes: MutPtr<DmoPartialMediatype>, uloutputtypesrequested: UInt, puloutputtypessupplied: MutPtr<UInt>, poutputtypes: MutPtr<DmoPartialMediatype>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsDMOGetTypes(clsiddmo.rawAddress.toString(), ulinputtypesrequested.toInt(), pulinputtypessupplied.rawAddress.toString(), pinputtypes.rawAddress.toString(), uloutputtypesrequested.toInt(), puloutputtypessupplied.rawAddress.toString(), poutputtypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMORegister(szname: Pcwstr, clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>, dwflags: UInt, cintypes: UInt, pintypes: ConstPtr<DmoPartialMediatype>, couttypes: UInt, pouttypes: ConstPtr<DmoPartialMediatype>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsDMORegister(szname.rawAddress.toString(), clsiddmo.rawAddress.toString(), guidcategory.rawAddress.toString(), dwflags.toInt(), cintypes.toInt(), pintypes.rawAddress.toString(), couttypes.toInt(), pouttypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOUnregister(clsiddmo: ConstPtr<Guid>, guidcategory: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsDMOUnregister(clsiddmo.rawAddress.toString(), guidcategory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCopyMediaType(pmtdest: MutPtr<DmoMediaType>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsMoCopyMediaType(pmtdest.rawAddress.toString(), pmtsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCreateMediaType(ppmt: MutPtr<MutPtr<DmoMediaType>>, cbformat: UInt): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsMoCreateMediaType(ppmt.rawAddress.toString(), cbformat.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDeleteMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsMoDeleteMediaType(pmt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDuplicateMediaType(ppmtdest: MutPtr<MutPtr<DmoMediaType>>, pmtsrc: ConstPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsMoDuplicateMediaType(ppmtdest.rawAddress.toString(), pmtsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moFreeMediaType(pmt: MutPtr<DmoMediaType>): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsMoFreeMediaType(pmt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moInitMediaType(pmt: MutPtr<DmoMediaType>, cbformat: UInt): Hresult =
    if (windowsWin32MediaDxmediaobjectsNapiAddon != null) (windowsWin32MediaDxmediaobjectsNapiAddon.windowssysWindowsWin32MediaDxmediaobjectsMoInitMediaType(pmt.rawAddress.toString(), cbformat.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
