@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun activateActCtx(hactctx: Handle, lpcookie: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingActivateActCtx")

public actual fun addRefActCtx(hactctx: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingAddRefActCtx")

public actual fun applyDeltaA(applyflags: Long, lpsourcename: Pcstr, lpdeltaname: Pcstr, lptargetname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaA")

public actual fun applyDeltaB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr<DeltaOutput>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaB")

public actual fun applyDeltaGetReverseB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lpreversefiletime: ConstPtr<Filetime>, lptarget: MutPtr<DeltaOutput>, lptargetreverse: MutPtr<DeltaOutput>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaGetReverseB")

public actual fun applyDeltaProvidedB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr<CVoid>, utargetsize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaProvidedB")

public actual fun applyDeltaW(applyflags: Long, lpsourcename: Pcwstr, lpdeltaname: Pcwstr, lptargetname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaW")

public actual fun applyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileA")

public actual fun applyPatchToFileByBuffers(patchfilemapped: ConstPtr<UByte>, patchfilesize: UInt, oldfilemapped: ConstPtr<UByte>, oldfilesize: UInt, newfilebuffer: MutPtr<MutPtr<UByte>>, newfilebuffersize: UInt, newfileactualsize: MutPtr<UInt>, newfiletime: MutPtr<Filetime>, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByBuffers")

public actual fun applyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandles")

public actual fun applyPatchToFileByHandlesEx(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandlesEx")

public actual fun applyPatchToFileExA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExA")

public actual fun applyPatchToFileExW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExW")

public actual fun applyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileW")

public actual fun createActCtxA(pactctx: ConstPtr<Actctxa>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxA")

public actual fun createActCtxW(pactctx: ConstPtr<Actctxw>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxW")

public actual fun createDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcstr, lptargetname: Pcstr, lpsourceoptionsname: Pcstr, lptargetoptionsname: Pcstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdeltaname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreateDeltaA")

public actual fun createDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DeltaInput, target: DeltaInput, sourceoptions: DeltaInput, targetoptions: DeltaInput, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdelta: MutPtr<DeltaOutput>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreateDeltaB")

public actual fun createDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcwstr, lptargetname: Pcwstr, lpsourceoptionsname: Pcwstr, lptargetoptionsname: Pcwstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdeltaname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreateDeltaW")

public actual fun createPatchFileA(oldfilename: Pcstr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileA")

public actual fun createPatchFileByHandles(oldfilehandle: Handle, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandles")

public actual fun createPatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoH>, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandlesEx")

public actual fun createPatchFileExA(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoA>, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExA")

public actual fun createPatchFileExW(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoW>, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExW")

public actual fun createPatchFileW(oldfilename: Pcwstr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(dwflags: Int, ulcookie: Long): Int

public actual fun deactivateActCtx(dwflags: UInt, ulcookie: ULong): Bool =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(dwflags.toInt(), ulcookie.toLong()).toInt()

public actual fun deltaFree(lpmemory: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingDeltaFree")

public actual fun deltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DeltaInput, lpsource: MutPtr<CVoid>, usourcesize: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingDeltaNormalizeProvidedB")

public actual fun extractPatchHeaderToFileA(patchfilename: Pcstr, patchheaderfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileA")

public actual fun extractPatchHeaderToFileByHandles(patchfilehandle: Handle, patchheaderfilehandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileByHandles")

public actual fun extractPatchHeaderToFileW(patchfilename: Pcwstr, patchheaderfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileW")

public actual fun findActCtxSectionGuid(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpguidtofind: ConstPtr<Guid>, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionGuid")

public actual fun findActCtxSectionStringA(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpstringtofind: Pcstr, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringA")

public actual fun findActCtxSectionStringW(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpstringtofind: Pcwstr, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringW")

public actual fun getCurrentActCtx(lphactctx: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetCurrentActCtx")

public actual fun getDeltaInfoA(lpdeltaname: Pcstr, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoA")

public actual fun getDeltaInfoB(delta: DeltaInput, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoB")

public actual fun getDeltaInfoW(lpdeltaname: Pcwstr, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoW")

public actual fun getDeltaSignatureA(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcstr, lphash: MutPtr<DeltaHash>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureA")

public actual fun getDeltaSignatureB(filetypeset: Long, hashalgid: AlgId, source: DeltaInput, lphash: MutPtr<DeltaHash>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureB")

public actual fun getDeltaSignatureW(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcwstr, lphash: MutPtr<DeltaHash>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureW")

public actual fun getFilePatchSignatureA(filename: Pcstr, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureA")

public actual fun getFilePatchSignatureByBuffer(filebufferwritable: MutPtr<UByte>, filesize: UInt, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByBuffer")

public actual fun getFilePatchSignatureByHandle(filehandle: Handle, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByHandle")

public actual fun getFilePatchSignatureW(filename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureW")

public actual fun msiAdvertiseProductA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductA")

public actual fun msiAdvertiseProductExA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExA")

public actual fun msiAdvertiseProductExW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExW")

public actual fun msiAdvertiseProductW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductW")

public actual fun msiAdvertiseScriptA(szscriptfile: Pcstr, dwflags: UInt, phregdata: ConstPtr<Hkey>, fremoveitems: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptA")

public actual fun msiAdvertiseScriptW(szscriptfile: Pcwstr, dwflags: UInt, phregdata: ConstPtr<Hkey>, fremoveitems: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptW")

public actual fun msiApplyMultiplePatchesA(szpatchpackages: Pcstr, szproductcode: Pcstr, szpropertieslist: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesA")

public actual fun msiApplyMultiplePatchesW(szpatchpackages: Pcwstr, szproductcode: Pcwstr, szpropertieslist: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesW")

public actual fun msiApplyPatchA(szpatchpackage: Pcstr, szinstallpackage: Pcstr, einstalltype: Installtype, szcommandline: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchA")

public actual fun msiApplyPatchW(szpatchpackage: Pcwstr, szinstallpackage: Pcwstr, einstalltype: Installtype, szcommandline: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchW")

public actual fun msiBeginTransactionA(szname: Pcstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr<Msihandle>, phchangeofownerevent: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionA")

public actual fun msiBeginTransactionW(szname: Pcwstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr<Msihandle>, phchangeofownerevent: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles(): Int

public actual fun msiCloseAllHandles(): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(hany: Int): Int

public actual fun msiCloseHandle(hany: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(hany.toInt()).toUInt()

public actual fun msiCollectUserInfoA(szproduct: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoA")

public actual fun msiCollectUserInfoW(szproduct: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoW")

public actual fun msiConfigureFeatureA(szproduct: Pcstr, szfeature: Pcstr, einstallstate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureA")

public actual fun msiConfigureFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, einstallstate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureW")

public actual fun msiConfigureProductA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductA")

public actual fun msiConfigureProductExA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExA")

public actual fun msiConfigureProductExW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExW")

public actual fun msiConfigureProductW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(cparams: Int): Int

public actual fun msiCreateRecord(cparams: UInt): Msihandle =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(cparams.toInt()).toUInt()

public actual fun msiCreateTransformSummaryInfoA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoA")

public actual fun msiCreateTransformSummaryInfoW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoW")

public actual fun msiDatabaseApplyTransformA(hdatabase: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformA")

public actual fun msiDatabaseApplyTransformW(hdatabase: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(hdatabase: Int): Int

public actual fun msiDatabaseCommit(hdatabase: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(hdatabase.toInt()).toUInt()

public actual fun msiDatabaseExportA(hdatabase: Msihandle, sztablename: Pcstr, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportA")

public actual fun msiDatabaseExportW(hdatabase: Msihandle, sztablename: Pcwstr, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportW")

public actual fun msiDatabaseGenerateTransformA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ireserved1: Int, ireserved2: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformA")

public actual fun msiDatabaseGenerateTransformW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ireserved1: Int, ireserved2: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformW")

public actual fun msiDatabaseGetPrimaryKeysA(hdatabase: Msihandle, sztablename: Pcstr, phrecord: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysA")

public actual fun msiDatabaseGetPrimaryKeysW(hdatabase: Msihandle, sztablename: Pcwstr, phrecord: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysW")

public actual fun msiDatabaseImportA(hdatabase: Msihandle, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportA")

public actual fun msiDatabaseImportW(hdatabase: Msihandle, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportW")

public actual fun msiDatabaseIsTablePersistentA(hdatabase: Msihandle, sztablename: Pcstr): Msicondition =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentA")

public actual fun msiDatabaseIsTablePersistentW(hdatabase: Msihandle, sztablename: Pcwstr): Msicondition =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentW")

public actual fun msiDatabaseMergeA(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeA")

public actual fun msiDatabaseMergeW(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeW")

public actual fun msiDatabaseOpenViewA(hdatabase: Msihandle, szquery: Pcstr, phview: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewA")

public actual fun msiDatabaseOpenViewW(hdatabase: Msihandle, szquery: Pcwstr, phview: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewW")

public actual fun msiDetermineApplicablePatchesA(szproductpackagepath: Pcstr, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfoa>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesA")

public actual fun msiDetermineApplicablePatchesW(szproductpackagepath: Pcwstr, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesW")

public actual fun msiDeterminePatchSequenceA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfoa>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceA")

public actual fun msiDeterminePatchSequenceW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceW")

public actual fun msiDoActionA(hinstall: Msihandle, szaction: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionA")

public actual fun msiDoActionW(hinstall: Msihandle, szaction: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionW")

public actual fun msiEnableLogA(dwlogmode: UInt, szlogfile: Pcstr, dwlogattributes: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogA")

public actual fun msiEnableLogW(dwlogmode: UInt, szlogfile: Pcwstr, dwlogattributes: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogW")

public actual fun msiEnableUIPreview(hdatabase: Msihandle, phpreview: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableUIPreview")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(dwtransactionstate: Int): Int

public actual fun msiEndTransaction(dwtransactionstate: Msitransactionstate): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(dwtransactionstate.toInt()).toUInt()

public actual fun msiEnumClientsA(szcomponent: Pcstr, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsA")

public actual fun msiEnumClientsExA(szcomponent: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExA")

public actual fun msiEnumClientsExW(szcomponent: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExW")

public actual fun msiEnumClientsW(szcomponent: Pcwstr, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsW")

public actual fun msiEnumComponentCostsA(hinstall: Msihandle, szcomponent: Pcstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pstr, pcchdrivebuf: MutPtr<UInt>, picost: MutPtr<Int>, pitempcost: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsA")

public actual fun msiEnumComponentCostsW(hinstall: Msihandle, szcomponent: Pcwstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pwstr, pcchdrivebuf: MutPtr<UInt>, picost: MutPtr<Int>, pitempcost: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsW")

public actual fun msiEnumComponentQualifiersA(szcomponent: Pcstr, iindex: UInt, lpqualifierbuf: Pstr, pcchqualifierbuf: MutPtr<UInt>, lpapplicationdatabuf: Pstr, pcchapplicationdatabuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersA")

public actual fun msiEnumComponentQualifiersW(szcomponent: Pcwstr, iindex: UInt, lpqualifierbuf: Pwstr, pcchqualifierbuf: MutPtr<UInt>, lpapplicationdatabuf: Pwstr, pcchapplicationdatabuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersW")

public actual fun msiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsA")

public actual fun msiEnumComponentsExA(szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExA")

public actual fun msiEnumComponentsExW(szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExW")

public actual fun msiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsW")

public actual fun msiEnumFeaturesA(szproduct: Pcstr, ifeatureindex: UInt, lpfeaturebuf: Pstr, lpparentbuf: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesA")

public actual fun msiEnumFeaturesW(szproduct: Pcwstr, ifeatureindex: UInt, lpfeaturebuf: Pwstr, lpparentbuf: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesW")

public actual fun msiEnumPatchesA(szproduct: Pcstr, ipatchindex: UInt, lppatchbuf: Pstr, lptransformsbuf: Pstr, pcchtransformsbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesA")

public actual fun msiEnumPatchesExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pstr, sztargetproductcode: Pstr, pdwtargetproductcontext: MutPtr<Msiinstallcontext>, sztargetusersid: Pstr, pcchtargetusersid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExA")

public actual fun msiEnumPatchesExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pwstr, sztargetproductcode: Pwstr, pdwtargetproductcontext: MutPtr<Msiinstallcontext>, sztargetusersid: Pwstr, pcchtargetusersid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExW")

public actual fun msiEnumPatchesW(szproduct: Pcwstr, ipatchindex: UInt, lppatchbuf: Pwstr, lptransformsbuf: Pwstr, pcchtransformsbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesW")

public actual fun msiEnumProductsA(iproductindex: UInt, lpproductbuf: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsA")

public actual fun msiEnumProductsExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExA")

public actual fun msiEnumProductsExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExW")

public actual fun msiEnumProductsW(iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsW")

public actual fun msiEnumRelatedProductsA(lpupgradecode: Pcstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsA")

public actual fun msiEnumRelatedProductsW(lpupgradecode: Pcwstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsW")

public actual fun msiEvaluateConditionA(hinstall: Msihandle, szcondition: Pcstr): Msicondition =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionA")

public actual fun msiEvaluateConditionW(hinstall: Msihandle, szcondition: Pcwstr): Msicondition =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionW")

public actual fun msiExtractPatchXMLDataA(szpatchpath: Pcstr, dwreserved: UInt, szxmldata: Pstr, pcchxmldata: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataA")

public actual fun msiExtractPatchXMLDataW(szpatchpath: Pcwstr, dwreserved: UInt, szxmldata: Pwstr, pcchxmldata: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataW")

public actual fun msiFormatRecordA(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pstr, pcchresultbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordA")

public actual fun msiFormatRecordW(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pwstr, pcchresultbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(hinstall: Int): Int

public actual fun msiGetActiveDatabase(hinstall: Msihandle): Msihandle =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(hinstall.toInt()).toUInt()

public actual fun msiGetComponentPathA(szproduct: Pcstr, szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr<UInt>): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathA")

public actual fun msiGetComponentPathExA(szproductcode: Pcstr, szcomponentcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pstr, pcchoutpathbuffer: MutPtr<UInt>): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExA")

public actual fun msiGetComponentPathExW(szproductcode: Pcwstr, szcomponentcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pwstr, pcchoutpathbuffer: MutPtr<UInt>): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExW")

public actual fun msiGetComponentPathW(szproduct: Pcwstr, szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr<UInt>): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathW")

public actual fun msiGetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateA")

public actual fun msiGetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(hdatabase: Int): Int

public actual fun msiGetDatabaseState(hdatabase: Msihandle): Msidbstate =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(hdatabase.toInt()).toInt()

public actual fun msiGetFeatureCostA(hinstall: Msihandle, szfeature: Pcstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostA")

public actual fun msiGetFeatureCostW(hinstall: Msihandle, szfeature: Pcwstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostW")

public actual fun msiGetFeatureInfoA(hproduct: Msihandle, szfeature: Pcstr, lpattributes: MutPtr<UInt>, lptitlebuf: Pstr, pcchtitlebuf: MutPtr<UInt>, lphelpbuf: Pstr, pcchhelpbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoA")

public actual fun msiGetFeatureInfoW(hproduct: Msihandle, szfeature: Pcwstr, lpattributes: MutPtr<UInt>, lptitlebuf: Pwstr, pcchtitlebuf: MutPtr<UInt>, lphelpbuf: Pwstr, pcchhelpbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoW")

public actual fun msiGetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateA")

public actual fun msiGetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateW")

public actual fun msiGetFeatureUsageA(szproduct: Pcstr, szfeature: Pcstr, pdwusecount: MutPtr<UInt>, pwdateused: MutPtr<UShort>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageA")

public actual fun msiGetFeatureUsageW(szproduct: Pcwstr, szfeature: Pcwstr, pdwusecount: MutPtr<UInt>, pwdateused: MutPtr<UShort>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageW")

public actual fun msiGetFeatureValidStatesA(hinstall: Msihandle, szfeature: Pcstr, lpinstallstates: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesA")

public actual fun msiGetFeatureValidStatesW(hinstall: Msihandle, szfeature: Pcwstr, lpinstallstates: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesW")

public actual fun msiGetFileHashA(szfilepath: Pcstr, dwoptions: UInt, phash: MutPtr<Msifilehashinfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashA")

public actual fun msiGetFileHashW(szfilepath: Pcwstr, dwoptions: UInt, phash: MutPtr<Msifilehashinfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashW")

public actual fun msiGetFileSignatureInformationA(szsignedobjectpath: Pcstr, dwflags: UInt, ppccertcontext: MutPtr<MutPtr<CertContext>>, pbhashdata: MutPtr<UByte>, pcbhashdata: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationA")

public actual fun msiGetFileSignatureInformationW(szsignedobjectpath: Pcwstr, dwflags: UInt, ppccertcontext: MutPtr<MutPtr<CertContext>>, pbhashdata: MutPtr<UByte>, pcbhashdata: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationW")

public actual fun msiGetFileVersionA(szfilepath: Pcstr, lpversionbuf: Pstr, pcchversionbuf: MutPtr<UInt>, lplangbuf: Pstr, pcchlangbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionA")

public actual fun msiGetFileVersionW(szfilepath: Pcwstr, lpversionbuf: Pwstr, pcchversionbuf: MutPtr<UInt>, lplangbuf: Pwstr, pcchlangbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(hinstall: Int): Int

public actual fun msiGetLanguage(hinstall: Msihandle): UShort =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(hinstall.toInt()).toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord(): Int

public actual fun msiGetLastErrorRecord(): Msihandle =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(hinstall: Int, erunmode: Int): Int

public actual fun msiGetMode(hinstall: Msihandle, erunmode: Msirunmode): Bool =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(hinstall.toInt(), erunmode).toInt()

public actual fun msiGetPatchFileListA(szproductcode: Pcstr, szpatchpackages: Pcstr, pcfiles: MutPtr<UInt>, pphfilerecords: MutPtr<MutPtr<Msihandle>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListA")

public actual fun msiGetPatchFileListW(szproductcode: Pcwstr, szpatchpackages: Pcwstr, pcfiles: MutPtr<UInt>, pphfilerecords: MutPtr<MutPtr<Msihandle>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListW")

public actual fun msiGetPatchInfoA(szpatch: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoA")

public actual fun msiGetPatchInfoExA(szpatchcode: Pcstr, szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, lpvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExA")

public actual fun msiGetPatchInfoExW(szpatchcode: Pcwstr, szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, lpvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExW")

public actual fun msiGetPatchInfoW(szpatch: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoW")

public actual fun msiGetProductCodeA(szcomponent: Pcstr, lpbuf39: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeA")

public actual fun msiGetProductCodeW(szcomponent: Pcwstr, lpbuf39: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeW")

public actual fun msiGetProductInfoA(szproduct: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoA")

public actual fun msiGetProductInfoExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExA")

public actual fun msiGetProductInfoExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExW")

public actual fun msiGetProductInfoFromScriptA(szscriptfile: Pcstr, lpproductbuf39: Pstr, plgidlanguage: MutPtr<UShort>, pdwversion: MutPtr<UInt>, lpnamebuf: Pstr, pcchnamebuf: MutPtr<UInt>, lppackagebuf: Pstr, pcchpackagebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptA")

public actual fun msiGetProductInfoFromScriptW(szscriptfile: Pcwstr, lpproductbuf39: Pwstr, plgidlanguage: MutPtr<UShort>, pdwversion: MutPtr<UInt>, lpnamebuf: Pwstr, pcchnamebuf: MutPtr<UInt>, lppackagebuf: Pwstr, pcchpackagebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptW")

public actual fun msiGetProductInfoW(szproduct: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoW")

public actual fun msiGetProductPropertyA(hproduct: Msihandle, szproperty: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyA")

public actual fun msiGetProductPropertyW(hproduct: Msihandle, szproperty: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyW")

public actual fun msiGetPropertyA(hinstall: Msihandle, szname: Pcstr, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyA")

public actual fun msiGetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyW")

public actual fun msiGetShortcutTargetA(szshortcutpath: Pcstr, szproductcode: Pstr, szfeatureid: Pstr, szcomponentcode: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetA")

public actual fun msiGetShortcutTargetW(szshortcutpath: Pcwstr, szproductcode: Pwstr, szfeatureid: Pwstr, szcomponentcode: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetW")

public actual fun msiGetSourcePathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathA")

public actual fun msiGetSourcePathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathW")

public actual fun msiGetSummaryInformationA(hdatabase: Msihandle, szdatabasepath: Pcstr, uiupdatecount: UInt, phsummaryinfo: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationA")

public actual fun msiGetSummaryInformationW(hdatabase: Msihandle, szdatabasepath: Pcwstr, uiupdatecount: UInt, phsummaryinfo: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationW")

public actual fun msiGetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathA")

public actual fun msiGetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathW")

public actual fun msiGetUserInfoA(szproduct: Pcstr, lpusernamebuf: Pstr, pcchusernamebuf: MutPtr<UInt>, lporgnamebuf: Pstr, pcchorgnamebuf: MutPtr<UInt>, lpserialbuf: Pstr, pcchserialbuf: MutPtr<UInt>): Userinfostate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoA")

public actual fun msiGetUserInfoW(szproduct: Pcwstr, lpusernamebuf: Pwstr, pcchusernamebuf: MutPtr<UInt>, lporgnamebuf: Pwstr, pcchorgnamebuf: MutPtr<UInt>, lpserialbuf: Pwstr, pcchserialbuf: MutPtr<UInt>): Userinfostate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoW")

public actual fun msiInstallMissingComponentA(szproduct: Pcstr, szcomponent: Pcstr, einstallstate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentA")

public actual fun msiInstallMissingComponentW(szproduct: Pcwstr, szcomponent: Pcwstr, einstallstate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentW")

public actual fun msiInstallMissingFileA(szproduct: Pcstr, szfile: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileA")

public actual fun msiInstallMissingFileW(szproduct: Pcwstr, szfile: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileW")

public actual fun msiInstallProductA(szpackagepath: Pcstr, szcommandline: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductA")

public actual fun msiInstallProductW(szpackagepath: Pcwstr, szcommandline: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductW")

public actual fun msiIsProductElevatedA(szproduct: Pcstr, pfelevated: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedA")

public actual fun msiIsProductElevatedW(szproduct: Pcwstr, pfelevated: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedW")

public actual fun msiJoinTransaction(htransactionhandle: Msihandle, dwtransactionattributes: UInt, phchangeofownerevent: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiJoinTransaction")

public actual fun msiLocateComponentA(szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr<UInt>): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentA")

public actual fun msiLocateComponentW(szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr<UInt>): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentW")

public actual fun msiNotifySidChangeA(poldsid: Pcstr, pnewsid: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeA")

public actual fun msiNotifySidChangeW(poldsid: Pcwstr, pnewsid: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeW")

public actual fun msiOpenDatabaseA(szdatabasepath: Pcstr, szpersist: Pcstr, phdatabase: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseA")

public actual fun msiOpenDatabaseW(szdatabasepath: Pcwstr, szpersist: Pcwstr, phdatabase: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseW")

public actual fun msiOpenPackageA(szpackagepath: Pcstr, hproduct: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageA")

public actual fun msiOpenPackageExA(szpackagepath: Pcstr, dwoptions: UInt, hproduct: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExA")

public actual fun msiOpenPackageExW(szpackagepath: Pcwstr, dwoptions: UInt, hproduct: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExW")

public actual fun msiOpenPackageW(szpackagepath: Pcwstr, hproduct: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageW")

public actual fun msiOpenProductA(szproduct: Pcstr, hproduct: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductA")

public actual fun msiOpenProductW(szproduct: Pcwstr, hproduct: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductW")

public actual fun msiPreviewBillboardA(hpreview: Msihandle, szcontrolname: Pcstr, szbillboard: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardA")

public actual fun msiPreviewBillboardW(hpreview: Msihandle, szcontrolname: Pcwstr, szbillboard: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardW")

public actual fun msiPreviewDialogA(hpreview: Msihandle, szdialogname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogA")

public actual fun msiPreviewDialogW(hpreview: Msihandle, szdialogname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogW")

public actual fun msiProcessAdvertiseScriptA(szscriptfile: Pcstr, sziconfolder: Pcstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptA")

public actual fun msiProcessAdvertiseScriptW(szscriptfile: Pcwstr, sziconfolder: Pcwstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(hinstall: Int, emessagetype: Int, hrecord: Int): Int

public actual fun msiProcessMessage(hinstall: Msihandle, emessagetype: Installmessage, hrecord: Msihandle): Int =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt()).toInt()

public actual fun msiProvideAssemblyA(szassemblyname: Pcstr, szappcontext: Pcstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyA")

public actual fun msiProvideAssemblyW(szassemblyname: Pcwstr, szappcontext: Pcwstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyW")

public actual fun msiProvideComponentA(szproduct: Pcstr, szfeature: Pcstr, szcomponent: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentA")

public actual fun msiProvideComponentW(szproduct: Pcwstr, szfeature: Pcwstr, szcomponent: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentW")

public actual fun msiProvideQualifiedComponentA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentA")

public actual fun msiProvideQualifiedComponentExA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, szproduct: Pcstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExA")

public actual fun msiProvideQualifiedComponentExW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, szproduct: Pcwstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExW")

public actual fun msiProvideQualifiedComponentW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentW")

public actual fun msiQueryComponentStateA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcstr, pdwstate: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateA")

public actual fun msiQueryComponentStateW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcwstr, pdwstate: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateW")

public actual fun msiQueryFeatureStateA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateA")

public actual fun msiQueryFeatureStateExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szfeature: Pcstr, pdwstate: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExA")

public actual fun msiQueryFeatureStateExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szfeature: Pcwstr, pdwstate: MutPtr<Installstate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExW")

public actual fun msiQueryFeatureStateW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateW")

public actual fun msiQueryProductStateA(szproduct: Pcstr): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateA")

public actual fun msiQueryProductStateW(szproduct: Pcwstr): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(hrecord: Int): Int

public actual fun msiRecordClearData(hrecord: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(hrecord.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(hrecord: Int, ifield: Int): Int

public actual fun msiRecordDataSize(hrecord: Msihandle, ifield: UInt): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(hrecord.toInt(), ifield.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(hrecord: Int): Int

public actual fun msiRecordGetFieldCount(hrecord: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(hrecord.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(hrecord: Int, ifield: Int): Int

public actual fun msiRecordGetInteger(hrecord: Msihandle, ifield: UInt): Int =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(hrecord.toInt(), ifield.toInt()).toInt()

public actual fun msiRecordGetStringA(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringA")

public actual fun msiRecordGetStringW(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(hrecord: Int, ifield: Int): Int

public actual fun msiRecordIsNull(hrecord: Msihandle, ifield: UInt): Bool =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(hrecord.toInt(), ifield.toInt()).toInt()

public actual fun msiRecordReadStream(hrecord: Msihandle, ifield: UInt, szdatabuf: Pstr, pcbdatabuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordReadStream")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(hrecord: Int, ifield: Int, ivalue: Int): Int

public actual fun msiRecordSetInteger(hrecord: Msihandle, ifield: UInt, ivalue: Int): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue).toUInt()

public actual fun msiRecordSetStreamA(hrecord: Msihandle, ifield: UInt, szfilepath: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamA")

public actual fun msiRecordSetStreamW(hrecord: Msihandle, ifield: UInt, szfilepath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamW")

public actual fun msiRecordSetStringA(hrecord: Msihandle, ifield: UInt, szvalue: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringA")

public actual fun msiRecordSetStringW(hrecord: Msihandle, ifield: UInt, szvalue: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringW")

public actual fun msiReinstallFeatureA(szproduct: Pcstr, szfeature: Pcstr, dwreinstallmode: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureA")

public actual fun msiReinstallFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, dwreinstallmode: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureW")

public actual fun msiReinstallProductA(szproduct: Pcstr, szreinstallmode: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductA")

public actual fun msiReinstallProductW(szproduct: Pcwstr, szreinstallmode: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductW")

public actual fun msiRemovePatchesA(szpatchlist: Pcstr, szproductcode: Pcstr, euninstalltype: Installtype, szpropertylist: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesA")

public actual fun msiRemovePatchesW(szpatchlist: Pcwstr, szproductcode: Pcwstr, euninstalltype: Installtype, szpropertylist: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesW")

public actual fun msiSequenceA(hinstall: Msihandle, sztable: Pcstr, isequencemode: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceA")

public actual fun msiSequenceW(hinstall: Msihandle, sztable: Pcwstr, isequencemode: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceW")

public actual fun msiSetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, istate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateA")

public actual fun msiSetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, istate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateW")

public actual fun msiSetExternalUIA(puihandler: InstalluiHandlera, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>): InstalluiHandlera =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIA")

public actual fun msiSetExternalUIRecord(puihandler: PinstalluiHandlerRecord, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>, ppuiprevhandler: PinstalluiHandlerRecord): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIRecord")

public actual fun msiSetExternalUIW(puihandler: InstalluiHandlerw, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>): InstalluiHandlerw =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIW")

public actual fun msiSetFeatureAttributesA(hinstall: Msihandle, szfeature: Pcstr, dwattributes: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesA")

public actual fun msiSetFeatureAttributesW(hinstall: Msihandle, szfeature: Pcwstr, dwattributes: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesW")

public actual fun msiSetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, istate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateA")

public actual fun msiSetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, istate: Installstate): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(hinstall: Int, iinstalllevel: Int): Int

public actual fun msiSetInstallLevel(hinstall: Msihandle, iinstalllevel: Int): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(hinstall.toInt(), iinstalllevel).toUInt()

public actual fun msiSetInternalUI(dwuilevel: Installuilevel, phwnd: MutPtr<Hwnd>): Installuilevel =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInternalUI")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(hinstall: Int, erunmode: Int, fstate: Int): Int

public actual fun msiSetMode(hinstall: Msihandle, erunmode: Msirunmode, fstate: Bool): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(hinstall.toInt(), erunmode, fstate).toUInt()

public actual fun msiSetPropertyA(hinstall: Msihandle, szname: Pcstr, szvalue: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyA")

public actual fun msiSetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvalue: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyW")

public actual fun msiSetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szfolderpath: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathA")

public actual fun msiSetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szfolderpath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathW")

public actual fun msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcstr, szdiskprompt: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskA")

public actual fun msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcwstr, szdiskprompt: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskW")

public actual fun msiSourceListAddSourceA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt, szsource: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceA")

public actual fun msiSourceListAddSourceExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr, dwindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExA")

public actual fun msiSourceListAddSourceExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr, dwindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExW")

public actual fun msiSourceListAddSourceW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt, szsource: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceW")

public actual fun msiSourceListClearAllA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllA")

public actual fun msiSourceListClearAllExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExA")

public actual fun msiSourceListClearAllExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExW")

public actual fun msiSourceListClearAllW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllW")

public actual fun msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskA")

public actual fun msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskW")

public actual fun msiSourceListClearSourceA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceA")

public actual fun msiSourceListClearSourceW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceW")

public actual fun msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr<UInt>, szvolumelabel: Pstr, pcchvolumelabel: MutPtr<UInt>, szdiskprompt: Pstr, pcchdiskprompt: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksA")

public actual fun msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr<UInt>, szvolumelabel: Pwstr, pcchvolumelabel: MutPtr<UInt>, szdiskprompt: Pwstr, pcchdiskprompt: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksW")

public actual fun msiSourceListEnumSourcesA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pstr, pcchsource: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesA")

public actual fun msiSourceListEnumSourcesW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pwstr, pcchsource: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesW")

public actual fun msiSourceListForceResolutionA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionA")

public actual fun msiSourceListForceResolutionExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExA")

public actual fun msiSourceListForceResolutionExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExW")

public actual fun msiSourceListForceResolutionW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionW")

public actual fun msiSourceListGetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoA")

public actual fun msiSourceListGetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoW")

public actual fun msiSourceListSetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoA")

public actual fun msiSourceListSetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoW")

public actual fun msiSummaryInfoGetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr<UInt>, pivalue: MutPtr<Int>, pftvalue: MutPtr<Filetime>, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyA")

public actual fun msiSummaryInfoGetPropertyCount(hsummaryinfo: Msihandle, puipropertycount: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyCount")

public actual fun msiSummaryInfoGetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr<UInt>, pivalue: MutPtr<Int>, pftvalue: MutPtr<Filetime>, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(hsummaryinfo: Int): Int

public actual fun msiSummaryInfoPersist(hsummaryinfo: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(hsummaryinfo.toInt()).toUInt()

public actual fun msiSummaryInfoSetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr<Filetime>, szvalue: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyA")

public actual fun msiSummaryInfoSetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr<Filetime>, szvalue: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyW")

public actual fun msiUseFeatureA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureA")

public actual fun msiUseFeatureExA(szproduct: Pcstr, szfeature: Pcstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExA")

public actual fun msiUseFeatureExW(szproduct: Pcwstr, szfeature: Pcwstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExW")

public actual fun msiUseFeatureW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(hinstall: Int): Int

public actual fun msiVerifyDiskSpace(hinstall: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(hinstall.toInt()).toUInt()

public actual fun msiVerifyPackageA(szpackagepath: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageA")

public actual fun msiVerifyPackageW(szpackagepath: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(hview: Int): Int

public actual fun msiViewClose(hview: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(hview.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(hview: Int, hrecord: Int): Int

public actual fun msiViewExecute(hview: Msihandle, hrecord: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(hview.toInt(), hrecord.toInt()).toUInt()

public actual fun msiViewFetch(hview: Msihandle, phrecord: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewFetch")

public actual fun msiViewGetColumnInfo(hview: Msihandle, ecolumninfo: Msicolinfo, phrecord: MutPtr<Msihandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetColumnInfo")

public actual fun msiViewGetErrorA(hview: Msihandle, szcolumnnamebuffer: Pstr, pcchbuf: MutPtr<UInt>): Msidberror =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorA")

public actual fun msiViewGetErrorW(hview: Msihandle, szcolumnnamebuffer: Pwstr, pcchbuf: MutPtr<UInt>): Msidberror =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify")
private external fun wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(hview: Int, emodifymode: Int, hrecord: Int): Int

public actual fun msiViewModify(hview: Msihandle, emodifymode: Msimodify, hrecord: Msihandle): UInt =
    wasiWindowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(hview.toInt(), emodifymode, hrecord.toInt()).toUInt()

public actual fun normalizeFileForPatchSignature(filebuffer: MutPtr<CVoid>, filesize: UInt, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingNormalizeFileForPatchSignature")

public actual fun queryActCtxSettingsW(dwflags: UInt, hactctx: Handle, settingsnamespace: Pcwstr, settingname: Pcwstr, pvbuffer: Pwstr, dwbuffer: ULong, pdwwrittenorrequired: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxSettingsW")

public actual fun queryActCtxW(dwflags: UInt, hactctx: Handle, pvsubinstance: ConstPtr<CVoid>, ulinfoclass: UInt, pvbuffer: MutPtr<CVoid>, cbbuffer: ULong, pcbwrittenorrequired: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxW")

public actual fun releaseActCtx(hactctx: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingReleaseActCtx")

public actual fun sfcGetNextProtectedFile(rpchandle: Handle, protfiledata: MutPtr<ProtectedFileData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingSfcGetNextProtectedFile")

public actual fun sfcIsFileProtected(rpchandle: Handle, protfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsFileProtected")

public actual fun sfcIsKeyProtected(keyhandle: Hkey, subkeyname: Pcwstr, keysam: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsKeyProtected")

public actual fun sfpVerifyFile(pszfilename: Pcstr, pszerror: Pcstr, dwerrsize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingSfpVerifyFile")

public actual fun testApplyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, applyoptionflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileA")

public actual fun testApplyPatchToFileByBuffers(patchfilebuffer: ConstPtr<UByte>, patchfilesize: UInt, oldfilebuffer: ConstPtr<UByte>, oldfilesize: UInt, newfilesize: MutPtr<UInt>, applyoptionflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByBuffers")

public actual fun testApplyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, applyoptionflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByHandles")

public actual fun testApplyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, applyoptionflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileW")

public actual fun zombifyActCtx(hactctx: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemApplicationinstallationandservicingZombifyActCtx")
