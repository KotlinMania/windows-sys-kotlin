@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ALG_ID
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY

private val _windowsWin32SystemApplicationinstallationandservicingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ActivateActCtx(hactctx: HANDLE, lpcookie: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ActivateActCtx(hactctx.toString(), lpcookie.toString()) as Int) else 0

public actual fun AddRefActCtx(hactctx: HANDLE) {
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) {
        _windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_AddRefActCtx(hactctx.toString())
    }
}

public actual fun ApplyDeltaA(applyflags: Long, lpsourcename: PCSTR, lpdeltaname: PCSTR, lptargetname: PCSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaA(applyflags.toString(), lpsourcename.toString(), lpdeltaname.toString(), lptargetname.toString()) as Int) else 0

public actual fun ApplyDeltaB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long): BOOL =
    0

public actual fun ApplyDeltaGetReverseB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lpreversefiletime: Long, lptarget: Long, lptargetreverse: Long): BOOL =
    0

public actual fun ApplyDeltaProvidedB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long, utargetsize: ULong): BOOL =
    0

public actual fun ApplyDeltaW(applyflags: Long, lpsourcename: PCWSTR, lpdeltaname: PCWSTR, lptargetname: PCWSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaW(applyflags.toString(), lpsourcename.toString(), lpdeltaname.toString(), lptargetname.toString()) as Int) else 0

public actual fun ApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileA(patchfilename.toString(), oldfilename.toString(), newfilename.toString(), applyoptionflags.toInt()) as Int) else 0

public actual fun ApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: UInt, oldfilemapped: Long, oldfilesize: UInt, newfilebuffer: Long, newfilebuffersize: UInt, newfileactualsize: Long, newfiletime: Long, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByBuffers(patchfilemapped.toString(), patchfilesize.toInt(), oldfilemapped.toString(), oldfilesize.toInt(), newfilebuffer.toString(), newfilebuffersize.toInt(), newfileactualsize.toString(), newfiletime.toString(), applyoptionflags.toInt(), progresscallback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun ApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandles(patchfilehandle.toString(), oldfilehandle.toString(), newfilehandle.toString(), applyoptionflags.toInt()) as Int) else 0

public actual fun ApplyPatchToFileByHandlesEx(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandlesEx(patchfilehandle.toString(), oldfilehandle.toString(), newfilehandle.toString(), applyoptionflags.toInt(), progresscallback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun ApplyPatchToFileExA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExA(patchfilename.toString(), oldfilename.toString(), newfilename.toString(), applyoptionflags.toInt(), progresscallback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun ApplyPatchToFileExW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExW(patchfilename.toString(), oldfilename.toString(), newfilename.toString(), applyoptionflags.toInt(), progresscallback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun ApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileW(patchfilename.toString(), oldfilename.toString(), newfilename.toString(), applyoptionflags.toInt()) as Int) else 0

public actual fun CreateActCtxA(pactctx: Long): HANDLE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxA(pactctx.toString()) as String).toLong() else 0L

public actual fun CreateActCtxW(pactctx: Long): HANDLE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxW(pactctx.toString()) as String).toLong() else 0L

public actual fun CreateDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCSTR, lptargetname: PCSTR, lpsourceoptionsname: PCSTR, lptargetoptionsname: PCSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCSTR): BOOL =
    0

public actual fun CreateDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DELTA_INPUT, target: DELTA_INPUT, sourceoptions: DELTA_INPUT, targetoptions: DELTA_INPUT, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdelta: Long): BOOL =
    0

public actual fun CreateDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCWSTR, lptargetname: PCWSTR, lpsourceoptionsname: PCWSTR, lptargetoptionsname: PCWSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCWSTR): BOOL =
    0

public actual fun CreatePatchFileA(oldfilename: PCSTR, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileA(oldfilename.toString(), newfilename.toString(), patchfilename.toString(), optionflags.toInt(), optiondata.toString()) as Int) else 0

public actual fun CreatePatchFileByHandles(oldfilehandle: HANDLE, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandles(oldfilehandle.toString(), newfilehandle.toString(), patchfilehandle.toString(), optionflags.toInt(), optiondata.toString()) as Int) else 0

public actual fun CreatePatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: Long, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandlesEx(oldfilecount.toInt(), oldfileinfoarray.toString(), newfilehandle.toString(), patchfilehandle.toString(), optionflags.toInt(), optiondata.toString(), progresscallback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun CreatePatchFileExA(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExA(oldfilecount.toInt(), oldfileinfoarray.toString(), newfilename.toString(), patchfilename.toString(), optionflags.toInt(), optiondata.toString(), progresscallback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun CreatePatchFileExW(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExW(oldfilecount.toInt(), oldfileinfoarray.toString(), newfilename.toString(), patchfilename.toString(), optionflags.toInt(), optiondata.toString(), progresscallback.toLong().toString(), callbackcontext.toString()) as Int) else 0

public actual fun CreatePatchFileW(oldfilename: PCWSTR, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileW(oldfilename.toString(), newfilename.toString(), patchfilename.toString(), optionflags.toInt(), optiondata.toString()) as Int) else 0

public actual fun DeactivateActCtx(dwflags: UInt, ulcookie: ULong): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_DeactivateActCtx(dwflags.toInt(), ulcookie.toString()) as Int) else 0

public actual fun DeltaFree(lpmemory: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_DeltaFree(lpmemory.toString()) as Int) else 0

public actual fun DeltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DELTA_INPUT, lpsource: Long, usourcesize: ULong): BOOL =
    0

public actual fun ExtractPatchHeaderToFileA(patchfilename: PCSTR, patchheaderfilename: PCSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileA(patchfilename.toString(), patchheaderfilename.toString()) as Int) else 0

public actual fun ExtractPatchHeaderToFileByHandles(patchfilehandle: HANDLE, patchheaderfilehandle: HANDLE): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileByHandles(patchfilehandle.toString(), patchheaderfilehandle.toString()) as Int) else 0

public actual fun ExtractPatchHeaderToFileW(patchfilename: PCWSTR, patchheaderfilename: PCWSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileW(patchfilename.toString(), patchheaderfilename.toString()) as Int) else 0

public actual fun FindActCtxSectionGuid(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpguidtofind: Long, returneddata: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionGuid(dwflags.toInt(), lpextensionguid.toString(), ulsectionid.toInt(), lpguidtofind.toString(), returneddata.toString()) as Int) else 0

public actual fun FindActCtxSectionStringA(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCSTR, returneddata: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringA(dwflags.toInt(), lpextensionguid.toString(), ulsectionid.toInt(), lpstringtofind.toString(), returneddata.toString()) as Int) else 0

public actual fun FindActCtxSectionStringW(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCWSTR, returneddata: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringW(dwflags.toInt(), lpextensionguid.toString(), ulsectionid.toInt(), lpstringtofind.toString(), returneddata.toString()) as Int) else 0

public actual fun GetCurrentActCtx(lphactctx: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetCurrentActCtx(lphactctx.toString()) as Int) else 0

public actual fun GetDeltaInfoA(lpdeltaname: PCSTR, lpheaderinfo: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoA(lpdeltaname.toString(), lpheaderinfo.toString()) as Int) else 0

public actual fun GetDeltaInfoB(delta: DELTA_INPUT, lpheaderinfo: Long): BOOL =
    0

public actual fun GetDeltaInfoW(lpdeltaname: PCWSTR, lpheaderinfo: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoW(lpdeltaname.toString(), lpheaderinfo.toString()) as Int) else 0

public actual fun GetDeltaSignatureA(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCSTR, lphash: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureA(filetypeset.toString(), hashalgid.toInt(), lpsourcename.toString(), lphash.toString()) as Int) else 0

public actual fun GetDeltaSignatureB(filetypeset: Long, hashalgid: ALG_ID, source: DELTA_INPUT, lphash: Long): BOOL =
    0

public actual fun GetDeltaSignatureW(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCWSTR, lphash: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureW(filetypeset.toString(), hashalgid.toInt(), lpsourcename.toString(), lphash.toString()) as Int) else 0

public actual fun GetFilePatchSignatureA(filename: PCSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureA(filename.toString(), optionflags.toInt(), optiondata.toString(), ignorerangecount.toInt(), ignorerangearray.toString(), retainrangecount.toInt(), retainrangearray.toString(), signaturebuffersize.toInt(), signaturebuffer.toString()) as Int) else 0

public actual fun GetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: UInt, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByBuffer(filebufferwritable.toString(), filesize.toInt(), optionflags.toInt(), optiondata.toString(), ignorerangecount.toInt(), ignorerangearray.toString(), retainrangecount.toInt(), retainrangearray.toString(), signaturebuffersize.toInt(), signaturebuffer.toString()) as Int) else 0

public actual fun GetFilePatchSignatureByHandle(filehandle: HANDLE, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByHandle(filehandle.toString(), optionflags.toInt(), optiondata.toString(), ignorerangecount.toInt(), ignorerangearray.toString(), retainrangecount.toInt(), retainrangearray.toString(), signaturebuffersize.toInt(), signaturebuffer.toString()) as Int) else 0

public actual fun GetFilePatchSignatureW(filename: PCWSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PWSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureW(filename.toString(), optionflags.toInt(), optiondata.toString(), ignorerangecount.toInt(), ignorerangearray.toString(), retainrangecount.toInt(), retainrangearray.toString(), signaturebuffersize.toInt(), signaturebuffer.toString()) as Int) else 0

public actual fun MsiAdvertiseProductA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductA(szpackagepath.toString(), szscriptfilepath.toString(), sztransforms.toString(), lgidlanguage.toInt()) as Int).toUInt() else 0u

public actual fun MsiAdvertiseProductExA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExA(szpackagepath.toString(), szscriptfilepath.toString(), sztransforms.toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()) as Int).toUInt() else 0u

public actual fun MsiAdvertiseProductExW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExW(szpackagepath.toString(), szscriptfilepath.toString(), sztransforms.toString(), lgidlanguage.toInt(), dwplatform.toInt(), dwoptions.toInt()) as Int).toUInt() else 0u

public actual fun MsiAdvertiseProductW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductW(szpackagepath.toString(), szscriptfilepath.toString(), sztransforms.toString(), lgidlanguage.toInt()) as Int).toUInt() else 0u

public actual fun MsiAdvertiseScriptA(szscriptfile: PCSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptA(szscriptfile.toString(), dwflags.toInt(), phregdata.toString(), fremoveitems) as Int).toUInt() else 0u

public actual fun MsiAdvertiseScriptW(szscriptfile: PCWSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptW(szscriptfile.toString(), dwflags.toInt(), phregdata.toString(), fremoveitems) as Int).toUInt() else 0u

public actual fun MsiApplyMultiplePatchesA(szpatchpackages: PCSTR, szproductcode: PCSTR, szpropertieslist: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesA(szpatchpackages.toString(), szproductcode.toString(), szpropertieslist.toString()) as Int).toUInt() else 0u

public actual fun MsiApplyMultiplePatchesW(szpatchpackages: PCWSTR, szproductcode: PCWSTR, szpropertieslist: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesW(szpatchpackages.toString(), szproductcode.toString(), szpropertieslist.toString()) as Int).toUInt() else 0u

public actual fun MsiApplyPatchA(szpatchpackage: PCSTR, szinstallpackage: PCSTR, einstalltype: INSTALLTYPE, szcommandline: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchA(szpatchpackage.toString(), szinstallpackage.toString(), einstalltype, szcommandline.toString()) as Int).toUInt() else 0u

public actual fun MsiApplyPatchW(szpatchpackage: PCWSTR, szinstallpackage: PCWSTR, einstalltype: INSTALLTYPE, szcommandline: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchW(szpatchpackage.toString(), szinstallpackage.toString(), einstalltype, szcommandline.toString()) as Int).toUInt() else 0u

public actual fun MsiBeginTransactionA(szname: PCSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionA(szname.toString(), dwtransactionattributes.toInt(), phtransactionhandle.toString(), phchangeofownerevent.toString()) as Int).toUInt() else 0u

public actual fun MsiBeginTransactionW(szname: PCWSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionW(szname.toString(), dwtransactionattributes.toInt(), phtransactionhandle.toString(), phchangeofownerevent.toString()) as Int).toUInt() else 0u

public actual fun MsiCloseAllHandles(): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseAllHandles() as Int).toUInt() else 0u

public actual fun MsiCloseHandle(hany: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseHandle(hany.toInt()) as Int).toUInt() else 0u

public actual fun MsiCollectUserInfoA(szproduct: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoA(szproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiCollectUserInfoW(szproduct: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoW(szproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiConfigureFeatureA(szproduct: PCSTR, szfeature: PCSTR, einstallstate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureA(szproduct.toString(), szfeature.toString(), einstallstate) as Int).toUInt() else 0u

public actual fun MsiConfigureFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureW(szproduct.toString(), szfeature.toString(), einstallstate) as Int).toUInt() else 0u

public actual fun MsiConfigureProductA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductA(szproduct.toString(), iinstalllevel, einstallstate) as Int).toUInt() else 0u

public actual fun MsiConfigureProductExA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExA(szproduct.toString(), iinstalllevel, einstallstate, szcommandline.toString()) as Int).toUInt() else 0u

public actual fun MsiConfigureProductExW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExW(szproduct.toString(), iinstalllevel, einstallstate, szcommandline.toString()) as Int).toUInt() else 0u

public actual fun MsiConfigureProductW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductW(szproduct.toString(), iinstalllevel, einstallstate) as Int).toUInt() else 0u

public actual fun MsiCreateRecord(cparams: UInt): MSIHANDLE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateRecord(cparams.toInt()) as Int).toUInt() else 0u

public actual fun MsiCreateTransformSummaryInfoA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.toString(), ierrorconditions, ivalidation) as Int).toUInt() else 0u

public actual fun MsiCreateTransformSummaryInfoW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.toString(), ierrorconditions, ivalidation) as Int).toUInt() else 0u

public actual fun MsiDatabaseApplyTransformA(hdatabase: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformA(hdatabase.toInt(), sztransformfile.toString(), ierrorconditions) as Int).toUInt() else 0u

public actual fun MsiDatabaseApplyTransformW(hdatabase: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformW(hdatabase.toInt(), sztransformfile.toString(), ierrorconditions) as Int).toUInt() else 0u

public actual fun MsiDatabaseCommit(hdatabase: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseCommit(hdatabase.toInt()) as Int).toUInt() else 0u

public actual fun MsiDatabaseExportA(hdatabase: MSIHANDLE, sztablename: PCSTR, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportA(hdatabase.toInt(), sztablename.toString(), szfolderpath.toString(), szfilename.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseExportW(hdatabase: MSIHANDLE, sztablename: PCWSTR, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportW(hdatabase.toInt(), sztablename.toString(), szfolderpath.toString(), szfilename.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseGenerateTransformA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ireserved1: Int, ireserved2: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.toString(), ireserved1, ireserved2) as Int).toUInt() else 0u

public actual fun MsiDatabaseGenerateTransformW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ireserved1: Int, ireserved2: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.toString(), ireserved1, ireserved2) as Int).toUInt() else 0u

public actual fun MsiDatabaseGetPrimaryKeysA(hdatabase: MSIHANDLE, sztablename: PCSTR, phrecord: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysA(hdatabase.toInt(), sztablename.toString(), phrecord.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseGetPrimaryKeysW(hdatabase: MSIHANDLE, sztablename: PCWSTR, phrecord: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysW(hdatabase.toInt(), sztablename.toString(), phrecord.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseImportA(hdatabase: MSIHANDLE, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportA(hdatabase.toInt(), szfolderpath.toString(), szfilename.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseImportW(hdatabase: MSIHANDLE, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportW(hdatabase.toInt(), szfolderpath.toString(), szfilename.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseIsTablePersistentA(hdatabase: MSIHANDLE, sztablename: PCSTR): MSICONDITION =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentA(hdatabase.toInt(), sztablename.toString()) as Int) else 0

public actual fun MsiDatabaseIsTablePersistentW(hdatabase: MSIHANDLE, sztablename: PCWSTR): MSICONDITION =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentW(hdatabase.toInt(), sztablename.toString()) as Int) else 0

public actual fun MsiDatabaseMergeA(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeA(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseMergeW(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeW(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseOpenViewA(hdatabase: MSIHANDLE, szquery: PCSTR, phview: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewA(hdatabase.toInt(), szquery.toString(), phview.toString()) as Int).toUInt() else 0u

public actual fun MsiDatabaseOpenViewW(hdatabase: MSIHANDLE, szquery: PCWSTR, phview: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewW(hdatabase.toInt(), szquery.toString(), phview.toString()) as Int).toUInt() else 0u

public actual fun MsiDetermineApplicablePatchesA(szproductpackagepath: PCSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesA(szproductpackagepath.toString(), cpatchinfo.toInt(), ppatchinfo.toString()) as Int).toUInt() else 0u

public actual fun MsiDetermineApplicablePatchesW(szproductpackagepath: PCWSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesW(szproductpackagepath.toString(), cpatchinfo.toInt(), ppatchinfo.toString()) as Int).toUInt() else 0u

public actual fun MsiDeterminePatchSequenceA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceA(szproductcode.toString(), szusersid.toString(), dwcontext, cpatchinfo.toInt(), ppatchinfo.toString()) as Int).toUInt() else 0u

public actual fun MsiDeterminePatchSequenceW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceW(szproductcode.toString(), szusersid.toString(), dwcontext, cpatchinfo.toInt(), ppatchinfo.toString()) as Int).toUInt() else 0u

public actual fun MsiDoActionA(hinstall: MSIHANDLE, szaction: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionA(hinstall.toInt(), szaction.toString()) as Int).toUInt() else 0u

public actual fun MsiDoActionW(hinstall: MSIHANDLE, szaction: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionW(hinstall.toInt(), szaction.toString()) as Int).toUInt() else 0u

public actual fun MsiEnableLogA(dwlogmode: UInt, szlogfile: PCSTR, dwlogattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogA(dwlogmode.toInt(), szlogfile.toString(), dwlogattributes.toInt()) as Int).toUInt() else 0u

public actual fun MsiEnableLogW(dwlogmode: UInt, szlogfile: PCWSTR, dwlogattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogW(dwlogmode.toInt(), szlogfile.toString(), dwlogattributes.toInt()) as Int).toUInt() else 0u

public actual fun MsiEnableUIPreview(hdatabase: MSIHANDLE, phpreview: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableUIPreview(hdatabase.toInt(), phpreview.toString()) as Int).toUInt() else 0u

public actual fun MsiEndTransaction(dwtransactionstate: MSITRANSACTIONSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEndTransaction(dwtransactionstate.toInt()) as Int).toUInt() else 0u

public actual fun MsiEnumClientsA(szcomponent: PCSTR, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsA(szcomponent.toString(), iproductindex.toInt(), lpproductbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumClientsExA(szcomponent: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExA(szcomponent.toString(), szusersid.toString(), dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.toString(), pdwinstalledcontext.toString(), szsid.toString(), pcchsid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumClientsExW(szcomponent: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExW(szcomponent.toString(), szusersid.toString(), dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.toString(), pdwinstalledcontext.toString(), szsid.toString(), pcchsid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumClientsW(szcomponent: PCWSTR, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsW(szcomponent.toString(), iproductindex.toInt(), lpproductbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentCostsA(hinstall: MSIHANDLE, szcomponent: PCSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsA(hinstall.toInt(), szcomponent.toString(), dwindex.toInt(), istate, szdrivebuf.toString(), pcchdrivebuf.toString(), picost.toString(), pitempcost.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentCostsW(hinstall: MSIHANDLE, szcomponent: PCWSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PWSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsW(hinstall.toInt(), szcomponent.toString(), dwindex.toInt(), istate, szdrivebuf.toString(), pcchdrivebuf.toString(), picost.toString(), pitempcost.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentQualifiersA(szcomponent: PCSTR, iindex: UInt, lpqualifierbuf: PSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PSTR, pcchapplicationdatabuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersA(szcomponent.toString(), iindex.toInt(), lpqualifierbuf.toString(), pcchqualifierbuf.toString(), lpapplicationdatabuf.toString(), pcchapplicationdatabuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentQualifiersW(szcomponent: PCWSTR, iindex: UInt, lpqualifierbuf: PWSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PWSTR, pcchapplicationdatabuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersW(szcomponent.toString(), iindex.toInt(), lpqualifierbuf.toString(), pcchqualifierbuf.toString(), lpapplicationdatabuf.toString(), pcchapplicationdatabuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: PSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsA(icomponentindex.toInt(), lpcomponentbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentsExA(szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExA(szusersid.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.toString(), pdwinstalledcontext.toString(), szsid.toString(), pcchsid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentsExW(szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExW(szusersid.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.toString(), pdwinstalledcontext.toString(), szsid.toString(), pcchsid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: PWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsW(icomponentindex.toInt(), lpcomponentbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumFeaturesA(szproduct: PCSTR, ifeatureindex: UInt, lpfeaturebuf: PSTR, lpparentbuf: PSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesA(szproduct.toString(), ifeatureindex.toInt(), lpfeaturebuf.toString(), lpparentbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumFeaturesW(szproduct: PCWSTR, ifeatureindex: UInt, lpfeaturebuf: PWSTR, lpparentbuf: PWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesW(szproduct.toString(), ifeatureindex.toInt(), lpfeaturebuf.toString(), lpparentbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumPatchesA(szproduct: PCSTR, ipatchindex: UInt, lppatchbuf: PSTR, lptransformsbuf: PSTR, pcchtransformsbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesA(szproduct.toString(), ipatchindex.toInt(), lppatchbuf.toString(), lptransformsbuf.toString(), pcchtransformsbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumPatchesExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PSTR, sztargetproductcode: PSTR, pdwtargetproductcontext: Long, sztargetusersid: PSTR, pcchtargetusersid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExA(szproductcode.toString(), szusersid.toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.toString(), sztargetproductcode.toString(), pdwtargetproductcontext.toString(), sztargetusersid.toString(), pcchtargetusersid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumPatchesExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PWSTR, sztargetproductcode: PWSTR, pdwtargetproductcontext: Long, sztargetusersid: PWSTR, pcchtargetusersid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExW(szproductcode.toString(), szusersid.toString(), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.toString(), sztargetproductcode.toString(), pdwtargetproductcontext.toString(), sztargetusersid.toString(), pcchtargetusersid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumPatchesW(szproduct: PCWSTR, ipatchindex: UInt, lppatchbuf: PWSTR, lptransformsbuf: PWSTR, pcchtransformsbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesW(szproduct.toString(), ipatchindex.toInt(), lppatchbuf.toString(), lptransformsbuf.toString(), pcchtransformsbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumProductsA(iproductindex: UInt, lpproductbuf: PSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsA(iproductindex.toInt(), lpproductbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumProductsExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExA(szproductcode.toString(), szusersid.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.toString(), pdwinstalledcontext.toString(), szsid.toString(), pcchsid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumProductsExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExW(szproductcode.toString(), szusersid.toString(), dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.toString(), pdwinstalledcontext.toString(), szsid.toString(), pcchsid.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumProductsW(iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsW(iproductindex.toInt(), lpproductbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumRelatedProductsA(lpupgradecode: PCSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsA(lpupgradecode.toString(), dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEnumRelatedProductsW(lpupgradecode: PCWSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsW(lpupgradecode.toString(), dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiEvaluateConditionA(hinstall: MSIHANDLE, szcondition: PCSTR): MSICONDITION =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionA(hinstall.toInt(), szcondition.toString()) as Int) else 0

public actual fun MsiEvaluateConditionW(hinstall: MSIHANDLE, szcondition: PCWSTR): MSICONDITION =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionW(hinstall.toInt(), szcondition.toString()) as Int) else 0

public actual fun MsiExtractPatchXMLDataA(szpatchpath: PCSTR, dwreserved: UInt, szxmldata: PSTR, pcchxmldata: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataA(szpatchpath.toString(), dwreserved.toInt(), szxmldata.toString(), pcchxmldata.toString()) as Int).toUInt() else 0u

public actual fun MsiExtractPatchXMLDataW(szpatchpath: PCWSTR, dwreserved: UInt, szxmldata: PWSTR, pcchxmldata: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataW(szpatchpath.toString(), dwreserved.toInt(), szxmldata.toString(), pcchxmldata.toString()) as Int).toUInt() else 0u

public actual fun MsiFormatRecordA(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PSTR, pcchresultbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordA(hinstall.toInt(), hrecord.toInt(), szresultbuf.toString(), pcchresultbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiFormatRecordW(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PWSTR, pcchresultbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordW(hinstall.toInt(), hrecord.toInt(), szresultbuf.toString(), pcchresultbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetActiveDatabase(hinstall: MSIHANDLE): MSIHANDLE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetActiveDatabase(hinstall.toInt()) as Int).toUInt() else 0u

public actual fun MsiGetComponentPathA(szproduct: PCSTR, szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathA(szproduct.toString(), szcomponent.toString(), lppathbuf.toString(), pcchbuf.toString()) as Int) else 0

public actual fun MsiGetComponentPathExA(szproductcode: PCSTR, szcomponentcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExA(szproductcode.toString(), szcomponentcode.toString(), szusersid.toString(), dwcontext, lpoutpathbuffer.toString(), pcchoutpathbuffer.toString()) as Int) else 0

public actual fun MsiGetComponentPathExW(szproductcode: PCWSTR, szcomponentcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PWSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExW(szproductcode.toString(), szcomponentcode.toString(), szusersid.toString(), dwcontext, lpoutpathbuffer.toString(), pcchoutpathbuffer.toString()) as Int) else 0

public actual fun MsiGetComponentPathW(szproduct: PCWSTR, szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathW(szproduct.toString(), szcomponent.toString(), lppathbuf.toString(), pcchbuf.toString()) as Int) else 0

public actual fun MsiGetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, piinstalled: Long, piaction: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateA(hinstall.toInt(), szcomponent.toString(), piinstalled.toString(), piaction.toString()) as Int).toUInt() else 0u

public actual fun MsiGetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateW(hinstall.toInt(), szcomponent.toString(), piinstalled.toString(), piaction.toString()) as Int).toUInt() else 0u

public actual fun MsiGetDatabaseState(hdatabase: MSIHANDLE): MSIDBSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetDatabaseState(hdatabase.toInt()) as Int) else 0

public actual fun MsiGetFeatureCostA(hinstall: MSIHANDLE, szfeature: PCSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostA(hinstall.toInt(), szfeature.toString(), icosttree, istate, picost.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureCostW(hinstall: MSIHANDLE, szfeature: PCWSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostW(hinstall.toInt(), szfeature.toString(), icosttree, istate, picost.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureInfoA(hproduct: MSIHANDLE, szfeature: PCSTR, lpattributes: Long, lptitlebuf: PSTR, pcchtitlebuf: Long, lphelpbuf: PSTR, pcchhelpbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoA(hproduct.toInt(), szfeature.toString(), lpattributes.toString(), lptitlebuf.toString(), pcchtitlebuf.toString(), lphelpbuf.toString(), pcchhelpbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureInfoW(hproduct: MSIHANDLE, szfeature: PCWSTR, lpattributes: Long, lptitlebuf: PWSTR, pcchtitlebuf: Long, lphelpbuf: PWSTR, pcchhelpbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoW(hproduct.toInt(), szfeature.toString(), lpattributes.toString(), lptitlebuf.toString(), pcchtitlebuf.toString(), lphelpbuf.toString(), pcchhelpbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, piinstalled: Long, piaction: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateA(hinstall.toInt(), szfeature.toString(), piinstalled.toString(), piaction.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateW(hinstall.toInt(), szfeature.toString(), piinstalled.toString(), piaction.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureUsageA(szproduct: PCSTR, szfeature: PCSTR, pdwusecount: Long, pwdateused: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageA(szproduct.toString(), szfeature.toString(), pdwusecount.toString(), pwdateused.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureUsageW(szproduct: PCWSTR, szfeature: PCWSTR, pdwusecount: Long, pwdateused: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageW(szproduct.toString(), szfeature.toString(), pdwusecount.toString(), pwdateused.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureValidStatesA(hinstall: MSIHANDLE, szfeature: PCSTR, lpinstallstates: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesA(hinstall.toInt(), szfeature.toString(), lpinstallstates.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFeatureValidStatesW(hinstall: MSIHANDLE, szfeature: PCWSTR, lpinstallstates: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesW(hinstall.toInt(), szfeature.toString(), lpinstallstates.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFileHashA(szfilepath: PCSTR, dwoptions: UInt, phash: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashA(szfilepath.toString(), dwoptions.toInt(), phash.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFileHashW(szfilepath: PCWSTR, dwoptions: UInt, phash: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashW(szfilepath.toString(), dwoptions.toInt(), phash.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFileSignatureInformationA(szsignedobjectpath: PCSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationA(szsignedobjectpath.toString(), dwflags.toInt(), ppccertcontext.toString(), pbhashdata.toString(), pcbhashdata.toString()) as Int) else 0

public actual fun MsiGetFileSignatureInformationW(szsignedobjectpath: PCWSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationW(szsignedobjectpath.toString(), dwflags.toInt(), ppccertcontext.toString(), pbhashdata.toString(), pcbhashdata.toString()) as Int) else 0

public actual fun MsiGetFileVersionA(szfilepath: PCSTR, lpversionbuf: PSTR, pcchversionbuf: Long, lplangbuf: PSTR, pcchlangbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionA(szfilepath.toString(), lpversionbuf.toString(), pcchversionbuf.toString(), lplangbuf.toString(), pcchlangbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetFileVersionW(szfilepath: PCWSTR, lpversionbuf: PWSTR, pcchversionbuf: Long, lplangbuf: PWSTR, pcchlangbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionW(szfilepath.toString(), lpversionbuf.toString(), pcchversionbuf.toString(), lplangbuf.toString(), pcchlangbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetLanguage(hinstall: MSIHANDLE): UShort =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLanguage(hinstall.toInt()) as Int).toUShort() else 0u

public actual fun MsiGetLastErrorRecord(): MSIHANDLE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLastErrorRecord() as Int).toUInt() else 0u

public actual fun MsiGetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetMode(hinstall.toInt(), erunmode) as Int) else 0

public actual fun MsiGetPatchFileListA(szproductcode: PCSTR, szpatchpackages: PCSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListA(szproductcode.toString(), szpatchpackages.toString(), pcfiles.toString(), pphfilerecords.toString()) as Int).toUInt() else 0u

public actual fun MsiGetPatchFileListW(szproductcode: PCWSTR, szpatchpackages: PCWSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListW(szproductcode.toString(), szpatchpackages.toString(), pcfiles.toString(), pphfilerecords.toString()) as Int).toUInt() else 0u

public actual fun MsiGetPatchInfoA(szpatch: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoA(szpatch.toString(), szattribute.toString(), lpvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetPatchInfoExA(szpatchcode: PCSTR, szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, lpvalue: PSTR, pcchvalue: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExA(szpatchcode.toString(), szproductcode.toString(), szusersid.toString(), dwcontext, szproperty.toString(), lpvalue.toString(), pcchvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiGetPatchInfoExW(szpatchcode: PCWSTR, szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, lpvalue: PWSTR, pcchvalue: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExW(szpatchcode.toString(), szproductcode.toString(), szusersid.toString(), dwcontext, szproperty.toString(), lpvalue.toString(), pcchvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiGetPatchInfoW(szpatch: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoW(szpatch.toString(), szattribute.toString(), lpvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductCodeA(szcomponent: PCSTR, lpbuf39: PSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeA(szcomponent.toString(), lpbuf39.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductCodeW(szcomponent: PCWSTR, lpbuf39: PWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeW(szcomponent.toString(), lpbuf39.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductInfoA(szproduct: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoA(szproduct.toString(), szattribute.toString(), lpvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductInfoExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExA(szproductcode.toString(), szusersid.toString(), dwcontext, szproperty.toString(), szvalue.toString(), pcchvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductInfoExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExW(szproductcode.toString(), szusersid.toString(), dwcontext, szproperty.toString(), szvalue.toString(), pcchvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductInfoFromScriptA(szscriptfile: PCSTR, lpproductbuf39: PSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PSTR, pcchnamebuf: Long, lppackagebuf: PSTR, pcchpackagebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptA(szscriptfile.toString(), lpproductbuf39.toString(), plgidlanguage.toString(), pdwversion.toString(), lpnamebuf.toString(), pcchnamebuf.toString(), lppackagebuf.toString(), pcchpackagebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductInfoFromScriptW(szscriptfile: PCWSTR, lpproductbuf39: PWSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PWSTR, pcchnamebuf: Long, lppackagebuf: PWSTR, pcchpackagebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptW(szscriptfile.toString(), lpproductbuf39.toString(), plgidlanguage.toString(), pdwversion.toString(), lpnamebuf.toString(), pcchnamebuf.toString(), lppackagebuf.toString(), pcchpackagebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductInfoW(szproduct: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoW(szproduct.toString(), szattribute.toString(), lpvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductPropertyA(hproduct: MSIHANDLE, szproperty: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyA(hproduct.toInt(), szproperty.toString(), lpvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetProductPropertyW(hproduct: MSIHANDLE, szproperty: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyW(hproduct.toInt(), szproperty.toString(), lpvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyA(hinstall.toInt(), szname.toString(), szvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyW(hinstall.toInt(), szname.toString(), szvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetShortcutTargetA(szshortcutpath: PCSTR, szproductcode: PSTR, szfeatureid: PSTR, szcomponentcode: PSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetA(szshortcutpath.toString(), szproductcode.toString(), szfeatureid.toString(), szcomponentcode.toString()) as Int).toUInt() else 0u

public actual fun MsiGetShortcutTargetW(szshortcutpath: PCWSTR, szproductcode: PWSTR, szfeatureid: PWSTR, szcomponentcode: PWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetW(szshortcutpath.toString(), szproductcode.toString(), szfeatureid.toString(), szcomponentcode.toString()) as Int).toUInt() else 0u

public actual fun MsiGetSourcePathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathA(hinstall.toInt(), szfolder.toString(), szpathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetSourcePathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathW(hinstall.toInt(), szfolder.toString(), szpathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetSummaryInformationA(hdatabase: MSIHANDLE, szdatabasepath: PCSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationA(hdatabase.toInt(), szdatabasepath.toString(), uiupdatecount.toInt(), phsummaryinfo.toString()) as Int).toUInt() else 0u

public actual fun MsiGetSummaryInformationW(hdatabase: MSIHANDLE, szdatabasepath: PCWSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationW(hdatabase.toInt(), szdatabasepath.toString(), uiupdatecount.toInt(), phsummaryinfo.toString()) as Int).toUInt() else 0u

public actual fun MsiGetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathA(hinstall.toInt(), szfolder.toString(), szpathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathW(hinstall.toInt(), szfolder.toString(), szpathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiGetUserInfoA(szproduct: PCSTR, lpusernamebuf: PSTR, pcchusernamebuf: Long, lporgnamebuf: PSTR, pcchorgnamebuf: Long, lpserialbuf: PSTR, pcchserialbuf: Long): USERINFOSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoA(szproduct.toString(), lpusernamebuf.toString(), pcchusernamebuf.toString(), lporgnamebuf.toString(), pcchorgnamebuf.toString(), lpserialbuf.toString(), pcchserialbuf.toString()) as Int) else 0

public actual fun MsiGetUserInfoW(szproduct: PCWSTR, lpusernamebuf: PWSTR, pcchusernamebuf: Long, lporgnamebuf: PWSTR, pcchorgnamebuf: Long, lpserialbuf: PWSTR, pcchserialbuf: Long): USERINFOSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoW(szproduct.toString(), lpusernamebuf.toString(), pcchusernamebuf.toString(), lporgnamebuf.toString(), pcchorgnamebuf.toString(), lpserialbuf.toString(), pcchserialbuf.toString()) as Int) else 0

public actual fun MsiInstallMissingComponentA(szproduct: PCSTR, szcomponent: PCSTR, einstallstate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentA(szproduct.toString(), szcomponent.toString(), einstallstate) as Int).toUInt() else 0u

public actual fun MsiInstallMissingComponentW(szproduct: PCWSTR, szcomponent: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentW(szproduct.toString(), szcomponent.toString(), einstallstate) as Int).toUInt() else 0u

public actual fun MsiInstallMissingFileA(szproduct: PCSTR, szfile: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileA(szproduct.toString(), szfile.toString()) as Int).toUInt() else 0u

public actual fun MsiInstallMissingFileW(szproduct: PCWSTR, szfile: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileW(szproduct.toString(), szfile.toString()) as Int).toUInt() else 0u

public actual fun MsiInstallProductA(szpackagepath: PCSTR, szcommandline: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductA(szpackagepath.toString(), szcommandline.toString()) as Int).toUInt() else 0u

public actual fun MsiInstallProductW(szpackagepath: PCWSTR, szcommandline: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductW(szpackagepath.toString(), szcommandline.toString()) as Int).toUInt() else 0u

public actual fun MsiIsProductElevatedA(szproduct: PCSTR, pfelevated: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedA(szproduct.toString(), pfelevated.toString()) as Int).toUInt() else 0u

public actual fun MsiIsProductElevatedW(szproduct: PCWSTR, pfelevated: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedW(szproduct.toString(), pfelevated.toString()) as Int).toUInt() else 0u

public actual fun MsiJoinTransaction(htransactionhandle: MSIHANDLE, dwtransactionattributes: UInt, phchangeofownerevent: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiJoinTransaction(htransactionhandle.toInt(), dwtransactionattributes.toInt(), phchangeofownerevent.toString()) as Int).toUInt() else 0u

public actual fun MsiLocateComponentA(szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentA(szcomponent.toString(), lppathbuf.toString(), pcchbuf.toString()) as Int) else 0

public actual fun MsiLocateComponentW(szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentW(szcomponent.toString(), lppathbuf.toString(), pcchbuf.toString()) as Int) else 0

public actual fun MsiNotifySidChangeA(poldsid: PCSTR, pnewsid: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeA(poldsid.toString(), pnewsid.toString()) as Int).toUInt() else 0u

public actual fun MsiNotifySidChangeW(poldsid: PCWSTR, pnewsid: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeW(poldsid.toString(), pnewsid.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenDatabaseA(szdatabasepath: PCSTR, szpersist: PCSTR, phdatabase: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseA(szdatabasepath.toString(), szpersist.toString(), phdatabase.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenDatabaseW(szdatabasepath: PCWSTR, szpersist: PCWSTR, phdatabase: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseW(szdatabasepath.toString(), szpersist.toString(), phdatabase.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenPackageA(szpackagepath: PCSTR, hproduct: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageA(szpackagepath.toString(), hproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenPackageExA(szpackagepath: PCSTR, dwoptions: UInt, hproduct: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExA(szpackagepath.toString(), dwoptions.toInt(), hproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenPackageExW(szpackagepath: PCWSTR, dwoptions: UInt, hproduct: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExW(szpackagepath.toString(), dwoptions.toInt(), hproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenPackageW(szpackagepath: PCWSTR, hproduct: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageW(szpackagepath.toString(), hproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenProductA(szproduct: PCSTR, hproduct: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductA(szproduct.toString(), hproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiOpenProductW(szproduct: PCWSTR, hproduct: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductW(szproduct.toString(), hproduct.toString()) as Int).toUInt() else 0u

public actual fun MsiPreviewBillboardA(hpreview: MSIHANDLE, szcontrolname: PCSTR, szbillboard: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardA(hpreview.toInt(), szcontrolname.toString(), szbillboard.toString()) as Int).toUInt() else 0u

public actual fun MsiPreviewBillboardW(hpreview: MSIHANDLE, szcontrolname: PCWSTR, szbillboard: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardW(hpreview.toInt(), szcontrolname.toString(), szbillboard.toString()) as Int).toUInt() else 0u

public actual fun MsiPreviewDialogA(hpreview: MSIHANDLE, szdialogname: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogA(hpreview.toInt(), szdialogname.toString()) as Int).toUInt() else 0u

public actual fun MsiPreviewDialogW(hpreview: MSIHANDLE, szdialogname: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogW(hpreview.toInt(), szdialogname.toString()) as Int).toUInt() else 0u

public actual fun MsiProcessAdvertiseScriptA(szscriptfile: PCSTR, sziconfolder: PCSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptA(szscriptfile.toString(), sziconfolder.toString(), hregdata.toString(), fshortcuts, fremoveitems) as Int).toUInt() else 0u

public actual fun MsiProcessAdvertiseScriptW(szscriptfile: PCWSTR, sziconfolder: PCWSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptW(szscriptfile.toString(), sziconfolder.toString(), hregdata.toString(), fshortcuts, fremoveitems) as Int).toUInt() else 0u

public actual fun MsiProcessMessage(hinstall: MSIHANDLE, emessagetype: INSTALLMESSAGE, hrecord: MSIHANDLE): Int =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt()) as Int) else 0

public actual fun MsiProvideAssemblyA(szassemblyname: PCSTR, szappcontext: PCSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyA(szassemblyname.toString(), szappcontext.toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiProvideAssemblyW(szassemblyname: PCWSTR, szappcontext: PCWSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyW(szassemblyname.toString(), szappcontext.toString(), dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiProvideComponentA(szproduct: PCSTR, szfeature: PCSTR, szcomponent: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentA(szproduct.toString(), szfeature.toString(), szcomponent.toString(), dwinstallmode.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiProvideComponentW(szproduct: PCWSTR, szfeature: PCWSTR, szcomponent: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentW(szproduct.toString(), szfeature.toString(), szcomponent.toString(), dwinstallmode.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiProvideQualifiedComponentA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentA(szcategory.toString(), szqualifier.toString(), dwinstallmode.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiProvideQualifiedComponentExA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, szproduct: PCSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExA(szcategory.toString(), szqualifier.toString(), dwinstallmode.toInt(), szproduct.toString(), dwunused1.toInt(), dwunused2.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiProvideQualifiedComponentExW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, szproduct: PCWSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExW(szcategory.toString(), szqualifier.toString(), dwinstallmode.toInt(), szproduct.toString(), dwunused1.toInt(), dwunused2.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiProvideQualifiedComponentW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentW(szcategory.toString(), szqualifier.toString(), dwinstallmode.toInt(), lppathbuf.toString(), pcchpathbuf.toString()) as Int).toUInt() else 0u

public actual fun MsiQueryComponentStateA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCSTR, pdwstate: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateA(szproductcode.toString(), szusersid.toString(), dwcontext, szcomponentcode.toString(), pdwstate.toString()) as Int).toUInt() else 0u

public actual fun MsiQueryComponentStateW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCWSTR, pdwstate: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateW(szproductcode.toString(), szusersid.toString(), dwcontext, szcomponentcode.toString(), pdwstate.toString()) as Int).toUInt() else 0u

public actual fun MsiQueryFeatureStateA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateA(szproduct.toString(), szfeature.toString()) as Int) else 0

public actual fun MsiQueryFeatureStateExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCSTR, pdwstate: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExA(szproductcode.toString(), szusersid.toString(), dwcontext, szfeature.toString(), pdwstate.toString()) as Int).toUInt() else 0u

public actual fun MsiQueryFeatureStateExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCWSTR, pdwstate: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExW(szproductcode.toString(), szusersid.toString(), dwcontext, szfeature.toString(), pdwstate.toString()) as Int).toUInt() else 0u

public actual fun MsiQueryFeatureStateW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateW(szproduct.toString(), szfeature.toString()) as Int) else 0

public actual fun MsiQueryProductStateA(szproduct: PCSTR): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateA(szproduct.toString()) as Int) else 0

public actual fun MsiQueryProductStateW(szproduct: PCWSTR): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateW(szproduct.toString()) as Int) else 0

public actual fun MsiRecordClearData(hrecord: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordClearData(hrecord.toInt()) as Int).toUInt() else 0u

public actual fun MsiRecordDataSize(hrecord: MSIHANDLE, ifield: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordDataSize(hrecord.toInt(), ifield.toInt()) as Int).toUInt() else 0u

public actual fun MsiRecordGetFieldCount(hrecord: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetFieldCount(hrecord.toInt()) as Int).toUInt() else 0u

public actual fun MsiRecordGetInteger(hrecord: MSIHANDLE, ifield: UInt): Int =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetInteger(hrecord.toInt(), ifield.toInt()) as Int) else 0

public actual fun MsiRecordGetStringA(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringA(hrecord.toInt(), ifield.toInt(), szvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiRecordGetStringW(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringW(hrecord.toInt(), ifield.toInt(), szvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiRecordIsNull(hrecord: MSIHANDLE, ifield: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordIsNull(hrecord.toInt(), ifield.toInt()) as Int) else 0

public actual fun MsiRecordReadStream(hrecord: MSIHANDLE, ifield: UInt, szdatabuf: PSTR, pcbdatabuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordReadStream(hrecord.toInt(), ifield.toInt(), szdatabuf.toString(), pcbdatabuf.toString()) as Int).toUInt() else 0u

public actual fun MsiRecordSetInteger(hrecord: MSIHANDLE, ifield: UInt, ivalue: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue) as Int).toUInt() else 0u

public actual fun MsiRecordSetStreamA(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamA(hrecord.toInt(), ifield.toInt(), szfilepath.toString()) as Int).toUInt() else 0u

public actual fun MsiRecordSetStreamW(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamW(hrecord.toInt(), ifield.toInt(), szfilepath.toString()) as Int).toUInt() else 0u

public actual fun MsiRecordSetStringA(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringA(hrecord.toInt(), ifield.toInt(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiRecordSetStringW(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringW(hrecord.toInt(), ifield.toInt(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiReinstallFeatureA(szproduct: PCSTR, szfeature: PCSTR, dwreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureA(szproduct.toString(), szfeature.toString(), dwreinstallmode.toInt()) as Int).toUInt() else 0u

public actual fun MsiReinstallFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, dwreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureW(szproduct.toString(), szfeature.toString(), dwreinstallmode.toInt()) as Int).toUInt() else 0u

public actual fun MsiReinstallProductA(szproduct: PCSTR, szreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductA(szproduct.toString(), szreinstallmode.toInt()) as Int).toUInt() else 0u

public actual fun MsiReinstallProductW(szproduct: PCWSTR, szreinstallmode: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductW(szproduct.toString(), szreinstallmode.toInt()) as Int).toUInt() else 0u

public actual fun MsiRemovePatchesA(szpatchlist: PCSTR, szproductcode: PCSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesA(szpatchlist.toString(), szproductcode.toString(), euninstalltype, szpropertylist.toString()) as Int).toUInt() else 0u

public actual fun MsiRemovePatchesW(szpatchlist: PCWSTR, szproductcode: PCWSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesW(szpatchlist.toString(), szproductcode.toString(), euninstalltype, szpropertylist.toString()) as Int).toUInt() else 0u

public actual fun MsiSequenceA(hinstall: MSIHANDLE, sztable: PCSTR, isequencemode: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceA(hinstall.toInt(), sztable.toString(), isequencemode) as Int).toUInt() else 0u

public actual fun MsiSequenceW(hinstall: MSIHANDLE, sztable: PCWSTR, isequencemode: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceW(hinstall.toInt(), sztable.toString(), isequencemode) as Int).toUInt() else 0u

public actual fun MsiSetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, istate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateA(hinstall.toInt(), szcomponent.toString(), istate) as Int).toUInt() else 0u

public actual fun MsiSetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, istate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateW(hinstall.toInt(), szcomponent.toString(), istate) as Int).toUInt() else 0u

public actual fun MsiSetExternalUIA(puihandler: INSTALLUI_HANDLERA, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERA =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIA(puihandler.toLong().toString(), dwmessagefilter.toInt(), pvcontext.toString()) as String).toLong() else null

public actual fun MsiSetExternalUIRecord(puihandler: PINSTALLUI_HANDLER_RECORD, dwmessagefilter: UInt, pvcontext: Long, ppuiprevhandler: PINSTALLUI_HANDLER_RECORD): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIRecord(puihandler.toLong().toString(), dwmessagefilter.toInt(), pvcontext.toString(), ppuiprevhandler.toLong().toString()) as Int).toUInt() else 0u

public actual fun MsiSetExternalUIW(puihandler: INSTALLUI_HANDLERW, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERW =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIW(puihandler.toLong().toString(), dwmessagefilter.toInt(), pvcontext.toString()) as String).toLong() else null

public actual fun MsiSetFeatureAttributesA(hinstall: MSIHANDLE, szfeature: PCSTR, dwattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesA(hinstall.toInt(), szfeature.toString(), dwattributes.toInt()) as Int).toUInt() else 0u

public actual fun MsiSetFeatureAttributesW(hinstall: MSIHANDLE, szfeature: PCWSTR, dwattributes: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesW(hinstall.toInt(), szfeature.toString(), dwattributes.toInt()) as Int).toUInt() else 0u

public actual fun MsiSetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, istate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateA(hinstall.toInt(), szfeature.toString(), istate) as Int).toUInt() else 0u

public actual fun MsiSetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, istate: INSTALLSTATE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateW(hinstall.toInt(), szfeature.toString(), istate) as Int).toUInt() else 0u

public actual fun MsiSetInstallLevel(hinstall: MSIHANDLE, iinstalllevel: Int): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInstallLevel(hinstall.toInt(), iinstalllevel) as Int).toUInt() else 0u

public actual fun MsiSetInternalUI(dwuilevel: INSTALLUILEVEL, phwnd: Long): INSTALLUILEVEL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInternalUI(dwuilevel, phwnd.toString()) as Int) else 0

public actual fun MsiSetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE, fstate: BOOL): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetMode(hinstall.toInt(), erunmode, fstate) as Int).toUInt() else 0u

public actual fun MsiSetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvalue: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyA(hinstall.toInt(), szname.toString(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiSetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvalue: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyW(hinstall.toInt(), szname.toString(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiSetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szfolderpath: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathA(hinstall.toInt(), szfolder.toString(), szfolderpath.toString()) as Int).toUInt() else 0u

public actual fun MsiSetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szfolderpath: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathW(hinstall.toInt(), szfolder.toString(), szfolderpath.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListAddMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCSTR, szdiskprompt: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.toString(), szdiskprompt.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListAddMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCWSTR, szdiskprompt: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.toString(), szdiskprompt.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListAddSourceA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt, szsource: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceA(szproduct.toString(), szusername.toString(), dwreserved.toInt(), szsource.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListAddSourceExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR, dwindex: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szsource.toString(), dwindex.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListAddSourceExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR, dwindex: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szsource.toString(), dwindex.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListAddSourceW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt, szsource: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceW(szproduct.toString(), szusername.toString(), dwreserved.toInt(), szsource.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearAllA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllA(szproduct.toString(), szusername.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearAllExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearAllExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearAllW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllW(szproduct.toString(), szusername.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwdiskid.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearSourceA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szsource.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListClearSourceW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szsource.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PSTR, pcchvolumelabel: Long, szdiskprompt: PSTR, pcchdiskprompt: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.toString(), szvolumelabel.toString(), pcchvolumelabel.toString(), szdiskprompt.toString(), pcchdiskprompt.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PWSTR, pcchvolumelabel: Long, szdiskprompt: PWSTR, pcchdiskprompt: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.toString(), szvolumelabel.toString(), pcchvolumelabel.toString(), szdiskprompt.toString(), pcchdiskprompt.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListEnumSourcesA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PSTR, pcchsource: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.toString(), pcchsource.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListEnumSourcesW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PWSTR, pcchsource: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.toString(), pcchsource.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListForceResolutionA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionA(szproduct.toString(), szusername.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListForceResolutionExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListForceResolutionExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListForceResolutionW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionW(szproduct.toString(), szusername.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun MsiSourceListGetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szproperty.toString(), szvalue.toString(), pcchvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListGetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szproperty.toString(), szvalue.toString(), pcchvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListSetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoA(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szproperty.toString(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiSourceListSetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoW(szproductcodeorpatchcode.toString(), szusersid.toString(), dwcontext, dwoptions.toInt(), szproperty.toString(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiSummaryInfoGetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.toString(), pivalue.toString(), pftvalue.toString(), szvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiSummaryInfoGetPropertyCount(hsummaryinfo: MSIHANDLE, puipropertycount: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyCount(hsummaryinfo.toInt(), puipropertycount.toString()) as Int).toUInt() else 0u

public actual fun MsiSummaryInfoGetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.toString(), pivalue.toString(), pftvalue.toString(), szvaluebuf.toString(), pcchvaluebuf.toString()) as Int).toUInt() else 0u

public actual fun MsiSummaryInfoPersist(hsummaryinfo: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoPersist(hsummaryinfo.toInt()) as Int).toUInt() else 0u

public actual fun MsiSummaryInfoSetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.toString(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiSummaryInfoSetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.toString(), szvalue.toString()) as Int).toUInt() else 0u

public actual fun MsiUseFeatureA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureA(szproduct.toString(), szfeature.toString()) as Int) else 0

public actual fun MsiUseFeatureExA(szproduct: PCSTR, szfeature: PCSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExA(szproduct.toString(), szfeature.toString(), dwinstallmode.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun MsiUseFeatureExW(szproduct: PCWSTR, szfeature: PCWSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExW(szproduct.toString(), szfeature.toString(), dwinstallmode.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun MsiUseFeatureW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureW(szproduct.toString(), szfeature.toString()) as Int) else 0

public actual fun MsiVerifyDiskSpace(hinstall: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyDiskSpace(hinstall.toInt()) as Int).toUInt() else 0u

public actual fun MsiVerifyPackageA(szpackagepath: PCSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageA(szpackagepath.toString()) as Int).toUInt() else 0u

public actual fun MsiVerifyPackageW(szpackagepath: PCWSTR): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageW(szpackagepath.toString()) as Int).toUInt() else 0u

public actual fun MsiViewClose(hview: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewClose(hview.toInt()) as Int).toUInt() else 0u

public actual fun MsiViewExecute(hview: MSIHANDLE, hrecord: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewExecute(hview.toInt(), hrecord.toInt()) as Int).toUInt() else 0u

public actual fun MsiViewFetch(hview: MSIHANDLE, phrecord: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewFetch(hview.toInt(), phrecord.toString()) as Int).toUInt() else 0u

public actual fun MsiViewGetColumnInfo(hview: MSIHANDLE, ecolumninfo: MSICOLINFO, phrecord: Long): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetColumnInfo(hview.toInt(), ecolumninfo, phrecord.toString()) as Int).toUInt() else 0u

public actual fun MsiViewGetErrorA(hview: MSIHANDLE, szcolumnnamebuffer: PSTR, pcchbuf: Long): MSIDBERROR =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorA(hview.toInt(), szcolumnnamebuffer.toString(), pcchbuf.toString()) as Int) else 0

public actual fun MsiViewGetErrorW(hview: MSIHANDLE, szcolumnnamebuffer: PWSTR, pcchbuf: Long): MSIDBERROR =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorW(hview.toInt(), szcolumnnamebuffer.toString(), pcchbuf.toString()) as Int) else 0

public actual fun MsiViewModify(hview: MSIHANDLE, emodifymode: MSIMODIFY, hrecord: MSIHANDLE): UInt =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewModify(hview.toInt(), emodifymode, hrecord.toInt()) as Int).toUInt() else 0u

public actual fun NormalizeFileForPatchSignature(filebuffer: Long, filesize: UInt, optionflags: UInt, optiondata: Long, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long): Int =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_NormalizeFileForPatchSignature(filebuffer.toString(), filesize.toInt(), optionflags.toInt(), optiondata.toString(), newfilecoffbase.toInt(), newfilecofftime.toInt(), ignorerangecount.toInt(), ignorerangearray.toString(), retainrangecount.toInt(), retainrangearray.toString()) as Int) else 0

public actual fun QueryActCtxSettingsW(dwflags: UInt, hactctx: HANDLE, settingsnamespace: PCWSTR, settingname: PCWSTR, pvbuffer: PWSTR, dwbuffer: ULong, pdwwrittenorrequired: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxSettingsW(dwflags.toInt(), hactctx.toString(), settingsnamespace.toString(), settingname.toString(), pvbuffer.toString(), dwbuffer.toString(), pdwwrittenorrequired.toString()) as Int) else 0

public actual fun QueryActCtxW(dwflags: UInt, hactctx: HANDLE, pvsubinstance: Long, ulinfoclass: UInt, pvbuffer: Long, cbbuffer: ULong, pcbwrittenorrequired: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxW(dwflags.toInt(), hactctx.toString(), pvsubinstance.toString(), ulinfoclass.toInt(), pvbuffer.toString(), cbbuffer.toString(), pcbwrittenorrequired.toString()) as Int) else 0

public actual fun ReleaseActCtx(hactctx: HANDLE) {
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) {
        _windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ReleaseActCtx(hactctx.toString())
    }
}

public actual fun SfcGetNextProtectedFile(rpchandle: HANDLE, protfiledata: Long): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_SfcGetNextProtectedFile(rpchandle.toString(), protfiledata.toString()) as Int) else 0

public actual fun SfcIsFileProtected(rpchandle: HANDLE, protfilename: PCWSTR): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsFileProtected(rpchandle.toString(), protfilename.toString()) as Int) else 0

public actual fun SfcIsKeyProtected(keyhandle: HKEY, subkeyname: PCWSTR, keysam: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsKeyProtected(keyhandle.toString(), subkeyname.toString(), keysam.toInt()) as Int) else 0

public actual fun SfpVerifyFile(pszfilename: PCSTR, pszerror: PCSTR, dwerrsize: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_SfpVerifyFile(pszfilename.toString(), pszerror.toString(), dwerrsize.toInt()) as Int) else 0

public actual fun TestApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, applyoptionflags: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileA(patchfilename.toString(), oldfilename.toString(), applyoptionflags.toInt()) as Int) else 0

public actual fun TestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: UInt, oldfilebuffer: Long, oldfilesize: UInt, newfilesize: Long, applyoptionflags: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByBuffers(patchfilebuffer.toString(), patchfilesize.toInt(), oldfilebuffer.toString(), oldfilesize.toInt(), newfilesize.toString(), applyoptionflags.toInt()) as Int) else 0

public actual fun TestApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByHandles(patchfilehandle.toString(), oldfilehandle.toString(), applyoptionflags.toInt()) as Int) else 0

public actual fun TestApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileW(patchfilename.toString(), oldfilename.toString(), applyoptionflags.toInt()) as Int) else 0

public actual fun ZombifyActCtx(hactctx: HANDLE): BOOL =
    if (_windowsWin32SystemApplicationinstallationandservicingNapiAddon != null) (_windowsWin32SystemApplicationinstallationandservicingNapiAddon.windowssys_windows_win32_system_applicationinstallationandservicing_ZombifyActCtx(hactctx.toString()) as Int) else 0
