@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

private val windowsWin32SystemApplicationinstallationandservicingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun activateActCtx(hactctx: Handle, lpcookie: MutPtr<ULong>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingActivateActCtx(hactctx.rawAddress.toString(), lpcookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addRefActCtx(hactctx: Handle) {
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) {
        windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingAddRefActCtx(hactctx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun applyDeltaA(applyflags: Long, lpsourcename: Pcstr, lpdeltaname: Pcstr, lptargetname: Pcstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaA(applyflags.toString(), lpsourcename.rawAddress.toString(), lpdeltaname.rawAddress.toString(), lptargetname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr<DeltaOutput>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaGetReverseB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lpreversefiletime: ConstPtr<Filetime>, lptarget: MutPtr<DeltaOutput>, lptargetreverse: MutPtr<DeltaOutput>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaProvidedB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr<CVoid>, utargetsize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyDeltaW(applyflags: Long, lpsourcename: Pcwstr, lpdeltaname: Pcwstr, lptargetname: Pcwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaW(applyflags.toString(), lpsourcename.rawAddress.toString(), lpdeltaname.rawAddress.toString(), lptargetname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileA(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByBuffers(patchfilemapped: ConstPtr<UByte>, patchfilesize: UInt, oldfilemapped: ConstPtr<UByte>, oldfilesize: UInt, newfilebuffer: MutPtr<MutPtr<UByte>>, newfilebuffersize: UInt, newfileactualsize: MutPtr<UInt>, newfiletime: MutPtr<Filetime>, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByBuffers(patchfilemapped.rawAddress.toString(), patchfilesize.toInt(), oldfilemapped.rawAddress.toString(), oldfilesize.toInt(), newfilebuffer.rawAddress.toString(), newfilebuffersize.toInt(), newfileactualsize.rawAddress.toString(), newfiletime.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandles(patchfilehandle.rawAddress.toString(), oldfilehandle.rawAddress.toString(), newfilehandle.rawAddress.toString(), applyoptionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileByHandlesEx(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandlesEx(patchfilehandle.rawAddress.toString(), oldfilehandle.rawAddress.toString(), newfilehandle.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileExA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExA(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileExW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExW(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileW(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), applyoptionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createActCtxA(pactctx: ConstPtr<Actctxa>): Handle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) MutPtr((windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxA(pactctx.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createActCtxW(pactctx: ConstPtr<Actctxw>): Handle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) MutPtr((windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxW(pactctx.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcstr, lptargetname: Pcstr, lpsourceoptionsname: Pcstr, lptargetoptionsname: Pcstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdeltaname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DeltaInput, target: DeltaInput, sourceoptions: DeltaInput, targetoptions: DeltaInput, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdelta: MutPtr<DeltaOutput>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcwstr, lptargetname: Pcwstr, lpsourceoptionsname: Pcwstr, lptargetoptionsname: Pcwstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdeltaname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileA(oldfilename: Pcstr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileA(oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileByHandles(oldfilehandle: Handle, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandles(oldfilehandle.rawAddress.toString(), newfilehandle.rawAddress.toString(), patchfilehandle.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoH>, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandlesEx(oldfilecount.toInt(), oldfileinfoarray.rawAddress.toString(), newfilehandle.rawAddress.toString(), patchfilehandle.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileExA(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoA>, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExA(oldfilecount.toInt(), oldfileinfoarray.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileExW(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoW>, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExW(oldfilecount.toInt(), oldfileinfoarray.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatchFileW(oldfilename: Pcwstr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileW(oldfilename.rawAddress.toString(), newfilename.rawAddress.toString(), patchfilename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deactivateActCtx(dwflags: UInt, ulcookie: ULong): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(dwflags.toInt(), ulcookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deltaFree(lpmemory: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingDeltaFree(lpmemory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DeltaInput, lpsource: MutPtr<CVoid>, usourcesize: ULong): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileA(patchfilename: Pcstr, patchheaderfilename: Pcstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileA(patchfilename.rawAddress.toString(), patchheaderfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileByHandles(patchfilehandle: Handle, patchheaderfilehandle: Handle): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileByHandles(patchfilehandle.rawAddress.toString(), patchheaderfilehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractPatchHeaderToFileW(patchfilename: Pcwstr, patchheaderfilename: Pcwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileW(patchfilename.rawAddress.toString(), patchheaderfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionGuid(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpguidtofind: ConstPtr<Guid>, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionGuid(dwflags.toInt(), lpextensionguid.rawAddress.toString(), ulsectionid.toInt(), lpguidtofind.rawAddress.toString(), returneddata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionStringA(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpstringtofind: Pcstr, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringA(dwflags.toInt(), lpextensionguid.rawAddress.toString(), ulsectionid.toInt(), lpstringtofind.rawAddress.toString(), returneddata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findActCtxSectionStringW(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpstringtofind: Pcwstr, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringW(dwflags.toInt(), lpextensionguid.rawAddress.toString(), ulsectionid.toInt(), lpstringtofind.rawAddress.toString(), returneddata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentActCtx(lphactctx: MutPtr<Handle>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetCurrentActCtx(lphactctx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoA(lpdeltaname: Pcstr, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoA(lpdeltaname.rawAddress.toString(), lpheaderinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoB(delta: DeltaInput, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaInfoW(lpdeltaname: Pcwstr, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoW(lpdeltaname.rawAddress.toString(), lpheaderinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureA(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcstr, lphash: MutPtr<DeltaHash>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureA(filetypeset.toString(), hashalgid.toInt(), lpsourcename.rawAddress.toString(), lphash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureB(filetypeset: Long, hashalgid: AlgId, source: DeltaInput, lphash: MutPtr<DeltaHash>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeltaSignatureW(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcwstr, lphash: MutPtr<DeltaHash>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureW(filetypeset.toString(), hashalgid.toInt(), lpsourcename.rawAddress.toString(), lphash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureA(filename: Pcstr, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureA(filename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureByBuffer(filebufferwritable: MutPtr<UByte>, filesize: UInt, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByBuffer(filebufferwritable.rawAddress.toString(), filesize.toInt(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureByHandle(filehandle: Handle, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByHandle(filehandle.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilePatchSignatureW(filename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureW(filename.rawAddress.toString(), optionflags.toInt(), optiondata.rawAddress.toString(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString(), signaturebuffersize.toInt(), signaturebuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductA(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductExA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExA(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductExW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExW(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseProductW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductW(szpackagepath.rawAddress.toString(), szscriptfilepath.rawAddress.toString(), sztransforms.rawAddress.toString(), lgidlanguage.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseScriptA(szscriptfile: Pcstr, dwflags: UInt, phregdata: ConstPtr<Hkey>, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptA(szscriptfile.rawAddress.toString(), dwflags.toInt(), phregdata.rawAddress.toString(), fremoveitems) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiAdvertiseScriptW(szscriptfile: Pcwstr, dwflags: UInt, phregdata: ConstPtr<Hkey>, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptW(szscriptfile.rawAddress.toString(), dwflags.toInt(), phregdata.rawAddress.toString(), fremoveitems) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyMultiplePatchesA(szpatchpackages: Pcstr, szproductcode: Pcstr, szpropertieslist: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesA(szpatchpackages.rawAddress.toString(), szproductcode.rawAddress.toString(), szpropertieslist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyMultiplePatchesW(szpatchpackages: Pcwstr, szproductcode: Pcwstr, szpropertieslist: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesW(szpatchpackages.rawAddress.toString(), szproductcode.rawAddress.toString(), szpropertieslist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyPatchA(szpatchpackage: Pcstr, szinstallpackage: Pcstr, einstalltype: Installtype, szcommandline: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchA(szpatchpackage.rawAddress.toString(), szinstallpackage.rawAddress.toString(), einstalltype, szcommandline.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiApplyPatchW(szpatchpackage: Pcwstr, szinstallpackage: Pcwstr, einstalltype: Installtype, szcommandline: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchW(szpatchpackage.rawAddress.toString(), szinstallpackage.rawAddress.toString(), einstalltype, szcommandline.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiBeginTransactionA(szname: Pcstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr<Msihandle>, phchangeofownerevent: MutPtr<Handle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionA(szname.rawAddress.toString(), dwtransactionattributes.toInt(), phtransactionhandle.rawAddress.toString(), phchangeofownerevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiBeginTransactionW(szname: Pcwstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr<Msihandle>, phchangeofownerevent: MutPtr<Handle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionW(szname.rawAddress.toString(), dwtransactionattributes.toInt(), phtransactionhandle.rawAddress.toString(), phchangeofownerevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCloseAllHandles(): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCloseHandle(hany: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(hany.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCollectUserInfoA(szproduct: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoA(szproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCollectUserInfoW(szproduct: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoW(szproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureFeatureA(szproduct: Pcstr, szfeature: Pcstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), einstallstate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), einstallstate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductA(szproduct.rawAddress.toString(), iinstalllevel, einstallstate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductExA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExA(szproduct.rawAddress.toString(), iinstalllevel, einstallstate, szcommandline.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductExW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExW(szproduct.rawAddress.toString(), iinstalllevel, einstallstate, szcommandline.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiConfigureProductW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductW(szproduct.rawAddress.toString(), iinstalllevel, einstallstate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateRecord(cparams: UInt): Msihandle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(cparams.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateTransformSummaryInfoA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions, ivalidation) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiCreateTransformSummaryInfoW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions, ivalidation) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseApplyTransformA(hdatabase: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformA(hdatabase.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseApplyTransformW(hdatabase: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformW(hdatabase.toInt(), sztransformfile.rawAddress.toString(), ierrorconditions) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseCommit(hdatabase: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(hdatabase.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseExportA(hdatabase: Msihandle, sztablename: Pcstr, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportA(hdatabase.toInt(), sztablename.rawAddress.toString(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseExportW(hdatabase: Msihandle, sztablename: Pcwstr, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportW(hdatabase.toInt(), sztablename.rawAddress.toString(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGenerateTransformA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ireserved1: Int, ireserved2: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ireserved1, ireserved2) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGenerateTransformW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ireserved1: Int, ireserved2: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress.toString(), ireserved1, ireserved2) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGetPrimaryKeysA(hdatabase: Msihandle, sztablename: Pcstr, phrecord: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysA(hdatabase.toInt(), sztablename.rawAddress.toString(), phrecord.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseGetPrimaryKeysW(hdatabase: Msihandle, sztablename: Pcwstr, phrecord: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysW(hdatabase.toInt(), sztablename.rawAddress.toString(), phrecord.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseImportA(hdatabase: Msihandle, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportA(hdatabase.toInt(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseImportW(hdatabase: Msihandle, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportW(hdatabase.toInt(), szfolderpath.rawAddress.toString(), szfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseIsTablePersistentA(hdatabase: Msihandle, sztablename: Pcstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentA(hdatabase.toInt(), sztablename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseIsTablePersistentW(hdatabase: Msihandle, sztablename: Pcwstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentW(hdatabase.toInt(), sztablename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseMergeA(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeA(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseMergeW(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeW(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseOpenViewA(hdatabase: Msihandle, szquery: Pcstr, phview: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewA(hdatabase.toInt(), szquery.rawAddress.toString(), phview.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDatabaseOpenViewW(hdatabase: Msihandle, szquery: Pcwstr, phview: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewW(hdatabase.toInt(), szquery.rawAddress.toString(), phview.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDetermineApplicablePatchesA(szproductpackagepath: Pcstr, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfoa>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesA(szproductpackagepath.rawAddress.toString(), cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDetermineApplicablePatchesW(szproductpackagepath: Pcwstr, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfow>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesW(szproductpackagepath.rawAddress.toString(), cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDeterminePatchSequenceA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfoa>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDeterminePatchSequenceW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfow>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, cpatchinfo.toInt(), ppatchinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDoActionA(hinstall: Msihandle, szaction: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionA(hinstall.toInt(), szaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiDoActionW(hinstall: Msihandle, szaction: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionW(hinstall.toInt(), szaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableLogA(dwlogmode: UInt, szlogfile: Pcstr, dwlogattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogA(dwlogmode.toInt(), szlogfile.rawAddress.toString(), dwlogattributes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableLogW(dwlogmode: UInt, szlogfile: Pcwstr, dwlogattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogW(dwlogmode.toInt(), szlogfile.rawAddress.toString(), dwlogattributes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnableUIPreview(hdatabase: Msihandle, phpreview: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableUIPreview(hdatabase.toInt(), phpreview.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEndTransaction(dwtransactionstate: Msitransactionstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(dwtransactionstate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsA(szcomponent: Pcstr, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsA(szcomponent.rawAddress.toString(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsExA(szcomponent: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExA(szcomponent.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsExW(szcomponent: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExW(szcomponent.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumClientsW(szcomponent: Pcwstr, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsW(szcomponent.rawAddress.toString(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentCostsA(hinstall: Msihandle, szcomponent: Pcstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pstr, pcchdrivebuf: MutPtr<UInt>, picost: MutPtr<Int>, pitempcost: MutPtr<Int>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsA(hinstall.toInt(), szcomponent.rawAddress.toString(), dwindex.toInt(), istate, szdrivebuf.rawAddress.toString(), pcchdrivebuf.rawAddress.toString(), picost.rawAddress.toString(), pitempcost.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentCostsW(hinstall: Msihandle, szcomponent: Pcwstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pwstr, pcchdrivebuf: MutPtr<UInt>, picost: MutPtr<Int>, pitempcost: MutPtr<Int>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsW(hinstall.toInt(), szcomponent.rawAddress.toString(), dwindex.toInt(), istate, szdrivebuf.rawAddress.toString(), pcchdrivebuf.rawAddress.toString(), picost.rawAddress.toString(), pitempcost.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentQualifiersA(szcomponent: Pcstr, iindex: UInt, lpqualifierbuf: Pstr, pcchqualifierbuf: MutPtr<UInt>, lpapplicationdatabuf: Pstr, pcchapplicationdatabuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersA(szcomponent.rawAddress.toString(), iindex.toInt(), lpqualifierbuf.rawAddress.toString(), pcchqualifierbuf.rawAddress.toString(), lpapplicationdatabuf.rawAddress.toString(), pcchapplicationdatabuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentQualifiersW(szcomponent: Pcwstr, iindex: UInt, lpqualifierbuf: Pwstr, pcchqualifierbuf: MutPtr<UInt>, lpapplicationdatabuf: Pwstr, pcchapplicationdatabuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersW(szcomponent.rawAddress.toString(), iindex.toInt(), lpqualifierbuf.rawAddress.toString(), pcchqualifierbuf.rawAddress.toString(), lpapplicationdatabuf.rawAddress.toString(), pcchapplicationdatabuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsA(icomponentindex.toInt(), lpcomponentbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsExA(szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExA(szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsExW(szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExW(szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsW(icomponentindex.toInt(), lpcomponentbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumFeaturesA(szproduct: Pcstr, ifeatureindex: UInt, lpfeaturebuf: Pstr, lpparentbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesA(szproduct.rawAddress.toString(), ifeatureindex.toInt(), lpfeaturebuf.rawAddress.toString(), lpparentbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumFeaturesW(szproduct: Pcwstr, ifeatureindex: UInt, lpfeaturebuf: Pwstr, lpparentbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesW(szproduct.rawAddress.toString(), ifeatureindex.toInt(), lpfeaturebuf.rawAddress.toString(), lpparentbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesA(szproduct: Pcstr, ipatchindex: UInt, lppatchbuf: Pstr, lptransformsbuf: Pstr, pcchtransformsbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesA(szproduct.rawAddress.toString(), ipatchindex.toInt(), lppatchbuf.rawAddress.toString(), lptransformsbuf.rawAddress.toString(), pcchtransformsbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pstr, sztargetproductcode: Pstr, pdwtargetproductcontext: MutPtr<Msiinstallcontext>, sztargetusersid: Pstr, pcchtargetusersid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.rawAddress.toString(), sztargetproductcode.rawAddress.toString(), pdwtargetproductcontext.rawAddress.toString(), sztargetusersid.rawAddress.toString(), pcchtargetusersid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pwstr, sztargetproductcode: Pwstr, pdwtargetproductcontext: MutPtr<Msiinstallcontext>, sztargetusersid: Pwstr, pcchtargetusersid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.rawAddress.toString(), sztargetproductcode.rawAddress.toString(), pdwtargetproductcontext.rawAddress.toString(), sztargetusersid.rawAddress.toString(), pcchtargetusersid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumPatchesW(szproduct: Pcwstr, ipatchindex: UInt, lppatchbuf: Pwstr, lptransformsbuf: Pwstr, pcchtransformsbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesW(szproduct.rawAddress.toString(), ipatchindex.toInt(), lppatchbuf.rawAddress.toString(), lptransformsbuf.rawAddress.toString(), pcchtransformsbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsA(iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsA(iproductindex.toInt(), lpproductbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.rawAddress.toString(), pdwinstalledcontext.rawAddress.toString(), szsid.rawAddress.toString(), pcchsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumProductsW(iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsW(iproductindex.toInt(), lpproductbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumRelatedProductsA(lpupgradecode: Pcstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsA(lpupgradecode.rawAddress.toString(), dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEnumRelatedProductsW(lpupgradecode: Pcwstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsW(lpupgradecode.rawAddress.toString(), dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEvaluateConditionA(hinstall: Msihandle, szcondition: Pcstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionA(hinstall.toInt(), szcondition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiEvaluateConditionW(hinstall: Msihandle, szcondition: Pcwstr): Msicondition =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionW(hinstall.toInt(), szcondition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiExtractPatchXMLDataA(szpatchpath: Pcstr, dwreserved: UInt, szxmldata: Pstr, pcchxmldata: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataA(szpatchpath.rawAddress.toString(), dwreserved.toInt(), szxmldata.rawAddress.toString(), pcchxmldata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiExtractPatchXMLDataW(szpatchpath: Pcwstr, dwreserved: UInt, szxmldata: Pwstr, pcchxmldata: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataW(szpatchpath.rawAddress.toString(), dwreserved.toInt(), szxmldata.rawAddress.toString(), pcchxmldata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiFormatRecordA(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pstr, pcchresultbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordA(hinstall.toInt(), hrecord.toInt(), szresultbuf.rawAddress.toString(), pcchresultbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiFormatRecordW(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pwstr, pcchresultbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordW(hinstall.toInt(), hrecord.toInt(), szresultbuf.rawAddress.toString(), pcchresultbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetActiveDatabase(hinstall: Msihandle): Msihandle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(hinstall.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathA(szproduct: Pcstr, szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr<UInt>): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathA(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathExA(szproductcode: Pcstr, szcomponentcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pstr, pcchoutpathbuffer: MutPtr<UInt>): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExA(szproductcode.rawAddress.toString(), szcomponentcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, lpoutpathbuffer.rawAddress.toString(), pcchoutpathbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathExW(szproductcode: Pcwstr, szcomponentcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pwstr, pcchoutpathbuffer: MutPtr<UInt>): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExW(szproductcode.rawAddress.toString(), szcomponentcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, lpoutpathbuffer.rawAddress.toString(), pcchoutpathbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentPathW(szproduct: Pcwstr, szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr<UInt>): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathW(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateA(hinstall.toInt(), szcomponent.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateW(hinstall.toInt(), szcomponent.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetDatabaseState(hdatabase: Msihandle): Msidbstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(hdatabase.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureCostA(hinstall: Msihandle, szfeature: Pcstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr<Int>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostA(hinstall.toInt(), szfeature.rawAddress.toString(), icosttree, istate, picost.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureCostW(hinstall: Msihandle, szfeature: Pcwstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr<Int>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostW(hinstall.toInt(), szfeature.rawAddress.toString(), icosttree, istate, picost.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureInfoA(hproduct: Msihandle, szfeature: Pcstr, lpattributes: MutPtr<UInt>, lptitlebuf: Pstr, pcchtitlebuf: MutPtr<UInt>, lphelpbuf: Pstr, pcchhelpbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoA(hproduct.toInt(), szfeature.rawAddress.toString(), lpattributes.rawAddress.toString(), lptitlebuf.rawAddress.toString(), pcchtitlebuf.rawAddress.toString(), lphelpbuf.rawAddress.toString(), pcchhelpbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureInfoW(hproduct: Msihandle, szfeature: Pcwstr, lpattributes: MutPtr<UInt>, lptitlebuf: Pwstr, pcchtitlebuf: MutPtr<UInt>, lphelpbuf: Pwstr, pcchhelpbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoW(hproduct.toInt(), szfeature.rawAddress.toString(), lpattributes.rawAddress.toString(), lptitlebuf.rawAddress.toString(), pcchtitlebuf.rawAddress.toString(), lphelpbuf.rawAddress.toString(), pcchhelpbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateA(hinstall.toInt(), szfeature.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateW(hinstall.toInt(), szfeature.rawAddress.toString(), piinstalled.rawAddress.toString(), piaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureUsageA(szproduct: Pcstr, szfeature: Pcstr, pdwusecount: MutPtr<UInt>, pwdateused: MutPtr<UShort>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), pdwusecount.rawAddress.toString(), pwdateused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureUsageW(szproduct: Pcwstr, szfeature: Pcwstr, pdwusecount: MutPtr<UInt>, pwdateused: MutPtr<UShort>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), pdwusecount.rawAddress.toString(), pwdateused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureValidStatesA(hinstall: Msihandle, szfeature: Pcstr, lpinstallstates: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesA(hinstall.toInt(), szfeature.rawAddress.toString(), lpinstallstates.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFeatureValidStatesW(hinstall: Msihandle, szfeature: Pcwstr, lpinstallstates: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesW(hinstall.toInt(), szfeature.rawAddress.toString(), lpinstallstates.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileHashA(szfilepath: Pcstr, dwoptions: UInt, phash: MutPtr<Msifilehashinfo>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashA(szfilepath.rawAddress.toString(), dwoptions.toInt(), phash.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileHashW(szfilepath: Pcwstr, dwoptions: UInt, phash: MutPtr<Msifilehashinfo>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashW(szfilepath.rawAddress.toString(), dwoptions.toInt(), phash.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileSignatureInformationA(szsignedobjectpath: Pcstr, dwflags: UInt, ppccertcontext: MutPtr<MutPtr<CertContext>>, pbhashdata: MutPtr<UByte>, pcbhashdata: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationA(szsignedobjectpath.rawAddress.toString(), dwflags.toInt(), ppccertcontext.rawAddress.toString(), pbhashdata.rawAddress.toString(), pcbhashdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileSignatureInformationW(szsignedobjectpath: Pcwstr, dwflags: UInt, ppccertcontext: MutPtr<MutPtr<CertContext>>, pbhashdata: MutPtr<UByte>, pcbhashdata: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationW(szsignedobjectpath.rawAddress.toString(), dwflags.toInt(), ppccertcontext.rawAddress.toString(), pbhashdata.rawAddress.toString(), pcbhashdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileVersionA(szfilepath: Pcstr, lpversionbuf: Pstr, pcchversionbuf: MutPtr<UInt>, lplangbuf: Pstr, pcchlangbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionA(szfilepath.rawAddress.toString(), lpversionbuf.rawAddress.toString(), pcchversionbuf.rawAddress.toString(), lplangbuf.rawAddress.toString(), pcchlangbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetFileVersionW(szfilepath: Pcwstr, lpversionbuf: Pwstr, pcchversionbuf: MutPtr<UInt>, lplangbuf: Pwstr, pcchlangbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionW(szfilepath.rawAddress.toString(), lpversionbuf.rawAddress.toString(), pcchversionbuf.rawAddress.toString(), lplangbuf.rawAddress.toString(), pcchlangbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetLanguage(hinstall: Msihandle): UShort =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(hinstall.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetLastErrorRecord(): Msihandle =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetMode(hinstall: Msihandle, erunmode: Msirunmode): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(hinstall.toInt(), erunmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchFileListA(szproductcode: Pcstr, szpatchpackages: Pcstr, pcfiles: MutPtr<UInt>, pphfilerecords: MutPtr<MutPtr<Msihandle>>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListA(szproductcode.rawAddress.toString(), szpatchpackages.rawAddress.toString(), pcfiles.rawAddress.toString(), pphfilerecords.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchFileListW(szproductcode: Pcwstr, szpatchpackages: Pcwstr, pcfiles: MutPtr<UInt>, pphfilerecords: MutPtr<MutPtr<Msihandle>>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListW(szproductcode.rawAddress.toString(), szpatchpackages.rawAddress.toString(), pcfiles.rawAddress.toString(), pphfilerecords.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoA(szpatch: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoA(szpatch.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoExA(szpatchcode: Pcstr, szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, lpvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExA(szpatchcode.rawAddress.toString(), szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), lpvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoExW(szpatchcode: Pcwstr, szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, lpvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExW(szpatchcode.rawAddress.toString(), szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), lpvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPatchInfoW(szpatch: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoW(szpatch.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductCodeA(szcomponent: Pcstr, lpbuf39: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeA(szcomponent.rawAddress.toString(), lpbuf39.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductCodeW(szcomponent: Pcwstr, lpbuf39: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeW(szcomponent.rawAddress.toString(), lpbuf39.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoA(szproduct: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoA(szproduct.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoFromScriptA(szscriptfile: Pcstr, lpproductbuf39: Pstr, plgidlanguage: MutPtr<UShort>, pdwversion: MutPtr<UInt>, lpnamebuf: Pstr, pcchnamebuf: MutPtr<UInt>, lppackagebuf: Pstr, pcchpackagebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptA(szscriptfile.rawAddress.toString(), lpproductbuf39.rawAddress.toString(), plgidlanguage.rawAddress.toString(), pdwversion.rawAddress.toString(), lpnamebuf.rawAddress.toString(), pcchnamebuf.rawAddress.toString(), lppackagebuf.rawAddress.toString(), pcchpackagebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoFromScriptW(szscriptfile: Pcwstr, lpproductbuf39: Pwstr, plgidlanguage: MutPtr<UShort>, pdwversion: MutPtr<UInt>, lpnamebuf: Pwstr, pcchnamebuf: MutPtr<UInt>, lppackagebuf: Pwstr, pcchpackagebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptW(szscriptfile.rawAddress.toString(), lpproductbuf39.rawAddress.toString(), plgidlanguage.rawAddress.toString(), pdwversion.rawAddress.toString(), lpnamebuf.rawAddress.toString(), pcchnamebuf.rawAddress.toString(), lppackagebuf.rawAddress.toString(), pcchpackagebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductInfoW(szproduct: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoW(szproduct.rawAddress.toString(), szattribute.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductPropertyA(hproduct: Msihandle, szproperty: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyA(hproduct.toInt(), szproperty.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetProductPropertyW(hproduct: Msihandle, szproperty: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyW(hproduct.toInt(), szproperty.rawAddress.toString(), lpvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPropertyA(hinstall: Msihandle, szname: Pcstr, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyA(hinstall.toInt(), szname.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyW(hinstall.toInt(), szname.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetShortcutTargetA(szshortcutpath: Pcstr, szproductcode: Pstr, szfeatureid: Pstr, szcomponentcode: Pstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetA(szshortcutpath.rawAddress.toString(), szproductcode.rawAddress.toString(), szfeatureid.rawAddress.toString(), szcomponentcode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetShortcutTargetW(szshortcutpath: Pcwstr, szproductcode: Pwstr, szfeatureid: Pwstr, szcomponentcode: Pwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetW(szshortcutpath.rawAddress.toString(), szproductcode.rawAddress.toString(), szfeatureid.rawAddress.toString(), szcomponentcode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSourcePathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathA(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSourcePathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathW(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSummaryInformationA(hdatabase: Msihandle, szdatabasepath: Pcstr, uiupdatecount: UInt, phsummaryinfo: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationA(hdatabase.toInt(), szdatabasepath.rawAddress.toString(), uiupdatecount.toInt(), phsummaryinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetSummaryInformationW(hdatabase: Msihandle, szdatabasepath: Pcwstr, uiupdatecount: UInt, phsummaryinfo: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationW(hdatabase.toInt(), szdatabasepath.rawAddress.toString(), uiupdatecount.toInt(), phsummaryinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathA(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathW(hinstall.toInt(), szfolder.rawAddress.toString(), szpathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetUserInfoA(szproduct: Pcstr, lpusernamebuf: Pstr, pcchusernamebuf: MutPtr<UInt>, lporgnamebuf: Pstr, pcchorgnamebuf: MutPtr<UInt>, lpserialbuf: Pstr, pcchserialbuf: MutPtr<UInt>): Userinfostate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoA(szproduct.rawAddress.toString(), lpusernamebuf.rawAddress.toString(), pcchusernamebuf.rawAddress.toString(), lporgnamebuf.rawAddress.toString(), pcchorgnamebuf.rawAddress.toString(), lpserialbuf.rawAddress.toString(), pcchserialbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiGetUserInfoW(szproduct: Pcwstr, lpusernamebuf: Pwstr, pcchusernamebuf: MutPtr<UInt>, lporgnamebuf: Pwstr, pcchorgnamebuf: MutPtr<UInt>, lpserialbuf: Pwstr, pcchserialbuf: MutPtr<UInt>): Userinfostate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoW(szproduct.rawAddress.toString(), lpusernamebuf.rawAddress.toString(), pcchusernamebuf.rawAddress.toString(), lporgnamebuf.rawAddress.toString(), pcchorgnamebuf.rawAddress.toString(), lpserialbuf.rawAddress.toString(), pcchserialbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingComponentA(szproduct: Pcstr, szcomponent: Pcstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentA(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), einstallstate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingComponentW(szproduct: Pcwstr, szcomponent: Pcwstr, einstallstate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentW(szproduct.rawAddress.toString(), szcomponent.rawAddress.toString(), einstallstate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingFileA(szproduct: Pcstr, szfile: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileA(szproduct.rawAddress.toString(), szfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallMissingFileW(szproduct: Pcwstr, szfile: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileW(szproduct.rawAddress.toString(), szfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallProductA(szpackagepath: Pcstr, szcommandline: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductA(szpackagepath.rawAddress.toString(), szcommandline.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiInstallProductW(szpackagepath: Pcwstr, szcommandline: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductW(szpackagepath.rawAddress.toString(), szcommandline.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiIsProductElevatedA(szproduct: Pcstr, pfelevated: MutPtr<Bool>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedA(szproduct.rawAddress.toString(), pfelevated.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiIsProductElevatedW(szproduct: Pcwstr, pfelevated: MutPtr<Bool>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedW(szproduct.rawAddress.toString(), pfelevated.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiJoinTransaction(htransactionhandle: Msihandle, dwtransactionattributes: UInt, phchangeofownerevent: MutPtr<Handle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiJoinTransaction(htransactionhandle.toInt(), dwtransactionattributes.toInt(), phchangeofownerevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiLocateComponentA(szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr<UInt>): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentA(szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiLocateComponentW(szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr<UInt>): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentW(szcomponent.rawAddress.toString(), lppathbuf.rawAddress.toString(), pcchbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiNotifySidChangeA(poldsid: Pcstr, pnewsid: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeA(poldsid.rawAddress.toString(), pnewsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiNotifySidChangeW(poldsid: Pcwstr, pnewsid: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeW(poldsid.rawAddress.toString(), pnewsid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenDatabaseA(szdatabasepath: Pcstr, szpersist: Pcstr, phdatabase: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseA(szdatabasepath.rawAddress.toString(), szpersist.rawAddress.toString(), phdatabase.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenDatabaseW(szdatabasepath: Pcwstr, szpersist: Pcwstr, phdatabase: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseW(szdatabasepath.rawAddress.toString(), szpersist.rawAddress.toString(), phdatabase.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageA(szpackagepath: Pcstr, hproduct: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageA(szpackagepath.rawAddress.toString(), hproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageExA(szpackagepath: Pcstr, dwoptions: UInt, hproduct: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExA(szpackagepath.rawAddress.toString(), dwoptions.toInt(), hproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageExW(szpackagepath: Pcwstr, dwoptions: UInt, hproduct: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExW(szpackagepath.rawAddress.toString(), dwoptions.toInt(), hproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenPackageW(szpackagepath: Pcwstr, hproduct: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageW(szpackagepath.rawAddress.toString(), hproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenProductA(szproduct: Pcstr, hproduct: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductA(szproduct.rawAddress.toString(), hproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiOpenProductW(szproduct: Pcwstr, hproduct: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductW(szproduct.rawAddress.toString(), hproduct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewBillboardA(hpreview: Msihandle, szcontrolname: Pcstr, szbillboard: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardA(hpreview.toInt(), szcontrolname.rawAddress.toString(), szbillboard.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewBillboardW(hpreview: Msihandle, szcontrolname: Pcwstr, szbillboard: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardW(hpreview.toInt(), szcontrolname.rawAddress.toString(), szbillboard.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewDialogA(hpreview: Msihandle, szdialogname: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogA(hpreview.toInt(), szdialogname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiPreviewDialogW(hpreview: Msihandle, szdialogname: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogW(hpreview.toInt(), szdialogname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessAdvertiseScriptA(szscriptfile: Pcstr, sziconfolder: Pcstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptA(szscriptfile.rawAddress.toString(), sziconfolder.rawAddress.toString(), hregdata.rawAddress.toString(), fshortcuts, fremoveitems) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessAdvertiseScriptW(szscriptfile: Pcwstr, sziconfolder: Pcwstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptW(szscriptfile.rawAddress.toString(), sziconfolder.rawAddress.toString(), hregdata.rawAddress.toString(), fshortcuts, fremoveitems) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProcessMessage(hinstall: Msihandle, emessagetype: Installmessage, hrecord: Msihandle): Int =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideAssemblyA(szassemblyname: Pcstr, szappcontext: Pcstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyA(szassemblyname.rawAddress.toString(), szappcontext.rawAddress.toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideAssemblyW(szassemblyname: Pcwstr, szappcontext: Pcwstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyW(szassemblyname.rawAddress.toString(), szappcontext.rawAddress.toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideComponentA(szproduct: Pcstr, szfeature: Pcstr, szcomponent: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), szcomponent.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideComponentW(szproduct: Pcwstr, szfeature: Pcwstr, szcomponent: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), szcomponent.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentA(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentExA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, szproduct: Pcstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExA(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), szproduct.rawAddress.toString(), dwunused1.toInt(), dwunused2.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentExW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, szproduct: Pcwstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExW(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), szproduct.rawAddress.toString(), dwunused1.toInt(), dwunused2.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiProvideQualifiedComponentW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentW(szcategory.rawAddress.toString(), szqualifier.rawAddress.toString(), dwinstallmode.toInt(), lppathbuf.rawAddress.toString(), pcchpathbuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryComponentStateA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcstr, pdwstate: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szcomponentcode.rawAddress.toString(), pdwstate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryComponentStateW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcwstr, pdwstate: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szcomponentcode.rawAddress.toString(), pdwstate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szfeature: Pcstr, pdwstate: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExA(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szfeature.rawAddress.toString(), pdwstate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szfeature: Pcwstr, pdwstate: MutPtr<Installstate>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExW(szproductcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, szfeature.rawAddress.toString(), pdwstate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryFeatureStateW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryProductStateA(szproduct: Pcstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateA(szproduct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiQueryProductStateW(szproduct: Pcwstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateW(szproduct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordClearData(hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(hrecord.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordDataSize(hrecord: Msihandle, ifield: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(hrecord.toInt(), ifield.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetFieldCount(hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(hrecord.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetInteger(hrecord: Msihandle, ifield: UInt): Int =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(hrecord.toInt(), ifield.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetStringA(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringA(hrecord.toInt(), ifield.toInt(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordGetStringW(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringW(hrecord.toInt(), ifield.toInt(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordIsNull(hrecord: Msihandle, ifield: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(hrecord.toInt(), ifield.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordReadStream(hrecord: Msihandle, ifield: UInt, szdatabuf: Pstr, pcbdatabuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordReadStream(hrecord.toInt(), ifield.toInt(), szdatabuf.rawAddress.toString(), pcbdatabuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetInteger(hrecord: Msihandle, ifield: UInt, ivalue: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStreamA(hrecord: Msihandle, ifield: UInt, szfilepath: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamA(hrecord.toInt(), ifield.toInt(), szfilepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStreamW(hrecord: Msihandle, ifield: UInt, szfilepath: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamW(hrecord.toInt(), ifield.toInt(), szfilepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStringA(hrecord: Msihandle, ifield: UInt, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringA(hrecord.toInt(), ifield.toInt(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRecordSetStringW(hrecord: Msihandle, ifield: UInt, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringW(hrecord.toInt(), ifield.toInt(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallFeatureA(szproduct: Pcstr, szfeature: Pcstr, dwreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwreinstallmode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, dwreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwreinstallmode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallProductA(szproduct: Pcstr, szreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductA(szproduct.rawAddress.toString(), szreinstallmode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiReinstallProductW(szproduct: Pcwstr, szreinstallmode: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductW(szproduct.rawAddress.toString(), szreinstallmode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRemovePatchesA(szpatchlist: Pcstr, szproductcode: Pcstr, euninstalltype: Installtype, szpropertylist: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesA(szpatchlist.rawAddress.toString(), szproductcode.rawAddress.toString(), euninstalltype, szpropertylist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiRemovePatchesW(szpatchlist: Pcwstr, szproductcode: Pcwstr, euninstalltype: Installtype, szpropertylist: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesW(szpatchlist.rawAddress.toString(), szproductcode.rawAddress.toString(), euninstalltype, szpropertylist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSequenceA(hinstall: Msihandle, sztable: Pcstr, isequencemode: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceA(hinstall.toInt(), sztable.rawAddress.toString(), isequencemode) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSequenceW(hinstall: Msihandle, sztable: Pcwstr, isequencemode: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceW(hinstall.toInt(), sztable.rawAddress.toString(), isequencemode) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateA(hinstall.toInt(), szcomponent.rawAddress.toString(), istate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateW(hinstall.toInt(), szcomponent.rawAddress.toString(), istate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIA(puihandler: InstalluiHandlera, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>): InstalluiHandlera =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIRecord(puihandler: PinstalluiHandlerRecord, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>, ppuiprevhandler: PinstalluiHandlerRecord): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIRecord(0L.toString(), dwmessagefilter.toInt(), pvcontext.rawAddress.toString(), 0L.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetExternalUIW(puihandler: InstalluiHandlerw, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>): InstalluiHandlerw =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureAttributesA(hinstall: Msihandle, szfeature: Pcstr, dwattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesA(hinstall.toInt(), szfeature.rawAddress.toString(), dwattributes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureAttributesW(hinstall: Msihandle, szfeature: Pcwstr, dwattributes: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesW(hinstall.toInt(), szfeature.rawAddress.toString(), dwattributes.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateA(hinstall.toInt(), szfeature.rawAddress.toString(), istate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, istate: Installstate): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateW(hinstall.toInt(), szfeature.rawAddress.toString(), istate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetInstallLevel(hinstall: Msihandle, iinstalllevel: Int): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(hinstall.toInt(), iinstalllevel) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetInternalUI(dwuilevel: Installuilevel, phwnd: MutPtr<Hwnd>): Installuilevel =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInternalUI(dwuilevel, phwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetMode(hinstall: Msihandle, erunmode: Msirunmode, fstate: Bool): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(hinstall.toInt(), erunmode, fstate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetPropertyA(hinstall: Msihandle, szname: Pcstr, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyA(hinstall.toInt(), szname.rawAddress.toString(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyW(hinstall.toInt(), szname.rawAddress.toString(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szfolderpath: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathA(hinstall.toInt(), szfolder.rawAddress.toString(), szfolderpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szfolderpath: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathW(hinstall.toInt(), szfolder.rawAddress.toString(), szfolderpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcstr, szdiskprompt: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcwstr, szdiskprompt: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt, szsource: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceA(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt(), szsource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr, dwindex: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString(), dwindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr, dwindex: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString(), dwindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListAddSourceW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt, szsource: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceW(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt(), szsource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllA(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearAllW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllW(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearSourceA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListClearSourceW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szsource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr<UInt>, szvolumelabel: Pstr, pcchvolumelabel: MutPtr<UInt>, szdiskprompt: Pstr, pcchdiskprompt: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.rawAddress.toString(), szvolumelabel.rawAddress.toString(), pcchvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString(), pcchdiskprompt.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr<UInt>, szvolumelabel: Pwstr, pcchvolumelabel: MutPtr<UInt>, szdiskprompt: Pwstr, pcchdiskprompt: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.rawAddress.toString(), szvolumelabel.rawAddress.toString(), pcchvolumelabel.rawAddress.toString(), szdiskprompt.rawAddress.toString(), pcchdiskprompt.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumSourcesA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pstr, pcchsource: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.rawAddress.toString(), pcchsource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListEnumSourcesW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pwstr, pcchsource: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.rawAddress.toString(), pcchsource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionA(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListForceResolutionW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionW(szproduct.rawAddress.toString(), szusername.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListGetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListGetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString(), pcchvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListSetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoA(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSourceListSetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoW(szproductcodeorpatchcode.rawAddress.toString(), szusersid.rawAddress.toString(), dwcontext, dwoptions.toInt(), szproperty.rawAddress.toString(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr<UInt>, pivalue: MutPtr<Int>, pftvalue: MutPtr<Filetime>, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.rawAddress.toString(), pivalue.rawAddress.toString(), pftvalue.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyCount(hsummaryinfo: Msihandle, puipropertycount: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyCount(hsummaryinfo.toInt(), puipropertycount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoGetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr<UInt>, pivalue: MutPtr<Int>, pftvalue: MutPtr<Filetime>, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.rawAddress.toString(), pivalue.rawAddress.toString(), pftvalue.rawAddress.toString(), szvaluebuf.rawAddress.toString(), pcchvaluebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoPersist(hsummaryinfo: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(hsummaryinfo.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoSetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr<Filetime>, szvalue: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.rawAddress.toString(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiSummaryInfoSetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr<Filetime>, szvalue: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.rawAddress.toString(), szvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureExA(szproduct: Pcstr, szfeature: Pcstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExA(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwinstallmode.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureExW(szproduct: Pcwstr, szfeature: Pcwstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString(), dwinstallmode.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiUseFeatureW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureW(szproduct.rawAddress.toString(), szfeature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyDiskSpace(hinstall: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(hinstall.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyPackageA(szpackagepath: Pcstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageA(szpackagepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiVerifyPackageW(szpackagepath: Pcwstr): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageW(szpackagepath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewClose(hview: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(hview.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewExecute(hview: Msihandle, hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(hview.toInt(), hrecord.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewFetch(hview: Msihandle, phrecord: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewFetch(hview.toInt(), phrecord.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetColumnInfo(hview: Msihandle, ecolumninfo: Msicolinfo, phrecord: MutPtr<Msihandle>): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetColumnInfo(hview.toInt(), ecolumninfo, phrecord.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetErrorA(hview: Msihandle, szcolumnnamebuffer: Pstr, pcchbuf: MutPtr<UInt>): Msidberror =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorA(hview.toInt(), szcolumnnamebuffer.rawAddress.toString(), pcchbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewGetErrorW(hview: Msihandle, szcolumnnamebuffer: Pwstr, pcchbuf: MutPtr<UInt>): Msidberror =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorW(hview.toInt(), szcolumnnamebuffer.rawAddress.toString(), pcchbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msiViewModify(hview: Msihandle, emodifymode: Msimodify, hrecord: Msihandle): UInt =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(hview.toInt(), emodifymode, hrecord.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun normalizeFileForPatchSignature(filebuffer: MutPtr<CVoid>, filesize: UInt, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>): Int =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingNormalizeFileForPatchSignature(filebuffer.rawAddress.toString(), filesize.toInt(), optionflags.toInt(), optiondata.rawAddress.toString(), newfilecoffbase.toInt(), newfilecofftime.toInt(), ignorerangecount.toInt(), ignorerangearray.rawAddress.toString(), retainrangecount.toInt(), retainrangearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryActCtxSettingsW(dwflags: UInt, hactctx: Handle, settingsnamespace: Pcwstr, settingname: Pcwstr, pvbuffer: Pwstr, dwbuffer: ULong, pdwwrittenorrequired: MutPtr<ULong>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxSettingsW(dwflags.toInt(), hactctx.rawAddress.toString(), settingsnamespace.rawAddress.toString(), settingname.rawAddress.toString(), pvbuffer.rawAddress.toString(), dwbuffer.toString(), pdwwrittenorrequired.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryActCtxW(dwflags: UInt, hactctx: Handle, pvsubinstance: ConstPtr<CVoid>, ulinfoclass: UInt, pvbuffer: MutPtr<CVoid>, cbbuffer: ULong, pcbwrittenorrequired: MutPtr<ULong>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxW(dwflags.toInt(), hactctx.rawAddress.toString(), pvsubinstance.rawAddress.toString(), ulinfoclass.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.toString(), pcbwrittenorrequired.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseActCtx(hactctx: Handle) {
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) {
        windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingReleaseActCtx(hactctx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sfcGetNextProtectedFile(rpchandle: Handle, protfiledata: MutPtr<ProtectedFileData>): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcGetNextProtectedFile(rpchandle.rawAddress.toString(), protfiledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfcIsFileProtected(rpchandle: Handle, protfilename: Pcwstr): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsFileProtected(rpchandle.rawAddress.toString(), protfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfcIsKeyProtected(keyhandle: Hkey, subkeyname: Pcwstr, keysam: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsKeyProtected(keyhandle.rawAddress.toString(), subkeyname.rawAddress.toString(), keysam.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sfpVerifyFile(pszfilename: Pcstr, pszerror: Pcstr, dwerrsize: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingSfpVerifyFile(pszfilename.rawAddress.toString(), pszerror.rawAddress.toString(), dwerrsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileA(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), applyoptionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileByBuffers(patchfilebuffer: ConstPtr<UByte>, patchfilesize: UInt, oldfilebuffer: ConstPtr<UByte>, oldfilesize: UInt, newfilesize: MutPtr<UInt>, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByBuffers(patchfilebuffer.rawAddress.toString(), patchfilesize.toInt(), oldfilebuffer.rawAddress.toString(), oldfilesize.toInt(), newfilesize.rawAddress.toString(), applyoptionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByHandles(patchfilehandle.rawAddress.toString(), oldfilehandle.rawAddress.toString(), applyoptionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun testApplyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, applyoptionflags: UInt): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileW(patchfilename.rawAddress.toString(), oldfilename.rawAddress.toString(), applyoptionflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zombifyActCtx(hactctx: Handle): Bool =
    if (windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssysWindowsWin32SystemApplicationinstallationandservicingZombifyActCtx(hactctx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
