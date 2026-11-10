@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val _windowsWin32MediaDxmediaobjectsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dMOEnum(guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?, ppenum: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_dMOEnum((guidcategory?.value ?: 0L).toString(), dwflags.toInt(), cintypes.toInt(), (pintypes?.value ?: 0L).toString(), couttypes.toInt(), (pouttypes?.value ?: 0L).toString(), (ppenum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetName(clsiddmo: COpaquePointer?, szname: Pwstr): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_dMOGetName((clsiddmo?.value ?: 0L).toString(), (szname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOGetTypes(clsiddmo: COpaquePointer?, ulinputtypesrequested: UInt, pulinputtypessupplied: COpaquePointer?, pinputtypes: COpaquePointer?, uloutputtypesrequested: UInt, puloutputtypessupplied: COpaquePointer?, poutputtypes: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_dMOGetTypes((clsiddmo?.value ?: 0L).toString(), ulinputtypesrequested.toInt(), (pulinputtypessupplied?.value ?: 0L).toString(), (pinputtypes?.value ?: 0L).toString(), uloutputtypesrequested.toInt(), (puloutputtypessupplied?.value ?: 0L).toString(), (poutputtypes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMORegister(szname: Pcwstr, clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?, dwflags: UInt, cintypes: UInt, pintypes: COpaquePointer?, couttypes: UInt, pouttypes: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_dMORegister((szname?.value ?: 0L).toString(), (clsiddmo?.value ?: 0L).toString(), (guidcategory?.value ?: 0L).toString(), dwflags.toInt(), cintypes.toInt(), (pintypes?.value ?: 0L).toString(), couttypes.toInt(), (pouttypes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dMOUnregister(clsiddmo: COpaquePointer?, guidcategory: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_dMOUnregister((clsiddmo?.value ?: 0L).toString(), (guidcategory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCopyMediaType(pmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_moCopyMediaType((pmtdest?.value ?: 0L).toString(), (pmtsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moCreateMediaType(ppmt: COpaquePointer?, cbformat: UInt): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_moCreateMediaType((ppmt?.value ?: 0L).toString(), cbformat.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDeleteMediaType(pmt: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_moDeleteMediaType((pmt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moDuplicateMediaType(ppmtdest: COpaquePointer?, pmtsrc: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_moDuplicateMediaType((ppmtdest?.value ?: 0L).toString(), (pmtsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moFreeMediaType(pmt: COpaquePointer?): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_moFreeMediaType((pmt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moInitMediaType(pmt: COpaquePointer?, cbformat: UInt): Hresult =
    if (_windowsWin32MediaDxmediaobjectsNapiAddon != null) (_windowsWin32MediaDxmediaobjectsNapiAddon.windowssys_windows_win32_media_dxmediaobjects_moInitMediaType((pmt?.value ?: 0L).toString(), cbformat.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
