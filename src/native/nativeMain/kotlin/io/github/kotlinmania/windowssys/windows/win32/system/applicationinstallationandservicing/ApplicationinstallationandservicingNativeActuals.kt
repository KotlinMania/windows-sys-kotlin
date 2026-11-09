@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ActivateActCtx(hactctx: HANDLE, lpcookie: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ActivateActCtx(hactctx.toCPointer<ByteVar>(), lpcookie.toCPointer<ByteVar>())

public actual fun AddRefActCtx(hactctx: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_AddRefActCtx(hactctx.toCPointer<ByteVar>())
}

public actual fun ApplyDeltaA(applyflags: Long, lpsourcename: PCSTR, lpdeltaname: PCSTR, lptargetname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaA(applyflags, lpsourcename.toCPointer<ByteVar>(), lpdeltaname.toCPointer<ByteVar>(), lptargetname.toCPointer<ByteVar>())

public actual fun ApplyDeltaB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long): BOOL =
    0

public actual fun ApplyDeltaGetReverseB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lpreversefiletime: Long, lptarget: Long, lptargetreverse: Long): BOOL =
    0

public actual fun ApplyDeltaProvidedB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long, utargetsize: ULong): BOOL =
    0

public actual fun ApplyDeltaW(applyflags: Long, lpsourcename: PCWSTR, lpdeltaname: PCWSTR, lptargetname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaW(applyflags, lpsourcename.toCPointer<ByteVar>(), lpdeltaname.toCPointer<ByteVar>(), lptargetname.toCPointer<ByteVar>())

public actual fun ApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileA(patchfilename.toCPointer<ByteVar>(), oldfilename.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), applyoptionflags)

public actual fun ApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: UInt, oldfilemapped: Long, oldfilesize: UInt, newfilebuffer: Long, newfilebuffersize: UInt, newfileactualsize: Long, newfiletime: Long, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByBuffers(patchfilemapped.toCPointer<ByteVar>(), patchfilesize, oldfilemapped.toCPointer<ByteVar>(), oldfilesize, newfilebuffer.toCPointer<ByteVar>(), newfilebuffersize, newfileactualsize.toCPointer<ByteVar>(), newfiletime.toCPointer<ByteVar>(), applyoptionflags, progresscallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun ApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandles(patchfilehandle.toCPointer<ByteVar>(), oldfilehandle.toCPointer<ByteVar>(), newfilehandle.toCPointer<ByteVar>(), applyoptionflags)

public actual fun ApplyPatchToFileByHandlesEx(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandlesEx(patchfilehandle.toCPointer<ByteVar>(), oldfilehandle.toCPointer<ByteVar>(), newfilehandle.toCPointer<ByteVar>(), applyoptionflags, progresscallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun ApplyPatchToFileExA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExA(patchfilename.toCPointer<ByteVar>(), oldfilename.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), applyoptionflags, progresscallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun ApplyPatchToFileExW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExW(patchfilename.toCPointer<ByteVar>(), oldfilename.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), applyoptionflags, progresscallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun ApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileW(patchfilename.toCPointer<ByteVar>(), oldfilename.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), applyoptionflags)

public actual fun CreateActCtxA(pactctx: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxA(pactctx.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateActCtxW(pactctx: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxW(pactctx.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCSTR, lptargetname: PCSTR, lpsourceoptionsname: PCSTR, lptargetoptionsname: PCSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCSTR): BOOL =
    0

public actual fun CreateDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DELTA_INPUT, target: DELTA_INPUT, sourceoptions: DELTA_INPUT, targetoptions: DELTA_INPUT, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdelta: Long): BOOL =
    0

public actual fun CreateDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCWSTR, lptargetname: PCWSTR, lpsourceoptionsname: PCWSTR, lptargetoptionsname: PCWSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCWSTR): BOOL =
    0

public actual fun CreatePatchFileA(oldfilename: PCSTR, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileA(oldfilename.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), patchfilename.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>())

public actual fun CreatePatchFileByHandles(oldfilehandle: HANDLE, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandles(oldfilehandle.toCPointer<ByteVar>(), newfilehandle.toCPointer<ByteVar>(), patchfilehandle.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>())

public actual fun CreatePatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: Long, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandlesEx(oldfilecount, oldfileinfoarray.toCPointer<ByteVar>(), newfilehandle.toCPointer<ByteVar>(), patchfilehandle.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>(), progresscallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun CreatePatchFileExA(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExA(oldfilecount, oldfileinfoarray.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), patchfilename.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>(), progresscallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun CreatePatchFileExW(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExW(oldfilecount, oldfileinfoarray.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), patchfilename.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>(), progresscallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>())

public actual fun CreatePatchFileW(oldfilename: PCWSTR, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileW(oldfilename.toCPointer<ByteVar>(), newfilename.toCPointer<ByteVar>(), patchfilename.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>())

public actual fun DeactivateActCtx(dwflags: UInt, ulcookie: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_DeactivateActCtx(dwflags, ulcookie)

public actual fun DeltaFree(lpmemory: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_DeltaFree(lpmemory.toCPointer<ByteVar>())

public actual fun DeltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DELTA_INPUT, lpsource: Long, usourcesize: ULong): BOOL =
    0

public actual fun ExtractPatchHeaderToFileA(patchfilename: PCSTR, patchheaderfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileA(patchfilename.toCPointer<ByteVar>(), patchheaderfilename.toCPointer<ByteVar>())

public actual fun ExtractPatchHeaderToFileByHandles(patchfilehandle: HANDLE, patchheaderfilehandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileByHandles(patchfilehandle.toCPointer<ByteVar>(), patchheaderfilehandle.toCPointer<ByteVar>())

public actual fun ExtractPatchHeaderToFileW(patchfilename: PCWSTR, patchheaderfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileW(patchfilename.toCPointer<ByteVar>(), patchheaderfilename.toCPointer<ByteVar>())

public actual fun FindActCtxSectionGuid(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpguidtofind: Long, returneddata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionGuid(dwflags, lpextensionguid.toCPointer<ByteVar>(), ulsectionid, lpguidtofind.toCPointer<ByteVar>(), returneddata.toCPointer<ByteVar>())

public actual fun FindActCtxSectionStringA(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCSTR, returneddata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringA(dwflags, lpextensionguid.toCPointer<ByteVar>(), ulsectionid, lpstringtofind.toCPointer<ByteVar>(), returneddata.toCPointer<ByteVar>())

public actual fun FindActCtxSectionStringW(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCWSTR, returneddata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringW(dwflags, lpextensionguid.toCPointer<ByteVar>(), ulsectionid, lpstringtofind.toCPointer<ByteVar>(), returneddata.toCPointer<ByteVar>())

public actual fun GetCurrentActCtx(lphactctx: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetCurrentActCtx(lphactctx.toCPointer<ByteVar>())

public actual fun GetDeltaInfoA(lpdeltaname: PCSTR, lpheaderinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoA(lpdeltaname.toCPointer<ByteVar>(), lpheaderinfo.toCPointer<ByteVar>())

public actual fun GetDeltaInfoB(delta: DELTA_INPUT, lpheaderinfo: Long): BOOL =
    0

public actual fun GetDeltaInfoW(lpdeltaname: PCWSTR, lpheaderinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoW(lpdeltaname.toCPointer<ByteVar>(), lpheaderinfo.toCPointer<ByteVar>())

public actual fun GetDeltaSignatureA(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCSTR, lphash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureA(filetypeset, hashalgid, lpsourcename.toCPointer<ByteVar>(), lphash.toCPointer<ByteVar>())

public actual fun GetDeltaSignatureB(filetypeset: Long, hashalgid: ALG_ID, source: DELTA_INPUT, lphash: Long): BOOL =
    0

public actual fun GetDeltaSignatureW(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCWSTR, lphash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureW(filetypeset, hashalgid, lpsourcename.toCPointer<ByteVar>(), lphash.toCPointer<ByteVar>())

public actual fun GetFilePatchSignatureA(filename: PCSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureA(filename.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>(), ignorerangecount, ignorerangearray.toCPointer<ByteVar>(), retainrangecount, retainrangearray.toCPointer<ByteVar>(), signaturebuffersize, signaturebuffer.toCPointer<ByteVar>())

public actual fun GetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: UInt, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByBuffer(filebufferwritable.toCPointer<ByteVar>(), filesize, optionflags, optiondata.toCPointer<ByteVar>(), ignorerangecount, ignorerangearray.toCPointer<ByteVar>(), retainrangecount, retainrangearray.toCPointer<ByteVar>(), signaturebuffersize, signaturebuffer.toCPointer<ByteVar>())

public actual fun GetFilePatchSignatureByHandle(filehandle: HANDLE, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByHandle(filehandle.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>(), ignorerangecount, ignorerangearray.toCPointer<ByteVar>(), retainrangecount, retainrangearray.toCPointer<ByteVar>(), signaturebuffersize, signaturebuffer.toCPointer<ByteVar>())

public actual fun GetFilePatchSignatureW(filename: PCWSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureW(filename.toCPointer<ByteVar>(), optionflags, optiondata.toCPointer<ByteVar>(), ignorerangecount, ignorerangearray.toCPointer<ByteVar>(), retainrangecount, retainrangearray.toCPointer<ByteVar>(), signaturebuffersize, signaturebuffer.toCPointer<ByteVar>())

public actual fun MsiAdvertiseProductA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductA(szpackagepath.toCPointer<ByteVar>(), szscriptfilepath.toCPointer<ByteVar>(), sztransforms.toCPointer<ByteVar>(), lgidlanguage)

public actual fun MsiAdvertiseProductExA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExA(szpackagepath.toCPointer<ByteVar>(), szscriptfilepath.toCPointer<ByteVar>(), sztransforms.toCPointer<ByteVar>(), lgidlanguage, dwplatform, dwoptions)

public actual fun MsiAdvertiseProductExW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExW(szpackagepath.toCPointer<ByteVar>(), szscriptfilepath.toCPointer<ByteVar>(), sztransforms.toCPointer<ByteVar>(), lgidlanguage, dwplatform, dwoptions)

public actual fun MsiAdvertiseProductW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductW(szpackagepath.toCPointer<ByteVar>(), szscriptfilepath.toCPointer<ByteVar>(), sztransforms.toCPointer<ByteVar>(), lgidlanguage)

public actual fun MsiAdvertiseScriptA(szscriptfile: PCSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptA(szscriptfile.toCPointer<ByteVar>(), dwflags, phregdata.toCPointer<ByteVar>(), fremoveitems)

public actual fun MsiAdvertiseScriptW(szscriptfile: PCWSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptW(szscriptfile.toCPointer<ByteVar>(), dwflags, phregdata.toCPointer<ByteVar>(), fremoveitems)

public actual fun MsiApplyMultiplePatchesA(szpatchpackages: PCSTR, szproductcode: PCSTR, szpropertieslist: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesA(szpatchpackages.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), szpropertieslist.toCPointer<ByteVar>())

public actual fun MsiApplyMultiplePatchesW(szpatchpackages: PCWSTR, szproductcode: PCWSTR, szpropertieslist: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesW(szpatchpackages.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), szpropertieslist.toCPointer<ByteVar>())

public actual fun MsiApplyPatchA(szpatchpackage: PCSTR, szinstallpackage: PCSTR, einstalltype: INSTALLTYPE, szcommandline: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchA(szpatchpackage.toCPointer<ByteVar>(), szinstallpackage.toCPointer<ByteVar>(), einstalltype, szcommandline.toCPointer<ByteVar>())

public actual fun MsiApplyPatchW(szpatchpackage: PCWSTR, szinstallpackage: PCWSTR, einstalltype: INSTALLTYPE, szcommandline: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchW(szpatchpackage.toCPointer<ByteVar>(), szinstallpackage.toCPointer<ByteVar>(), einstalltype, szcommandline.toCPointer<ByteVar>())

public actual fun MsiBeginTransactionA(szname: PCSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionA(szname.toCPointer<ByteVar>(), dwtransactionattributes, phtransactionhandle.toCPointer<ByteVar>(), phchangeofownerevent.toCPointer<ByteVar>())

public actual fun MsiBeginTransactionW(szname: PCWSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionW(szname.toCPointer<ByteVar>(), dwtransactionattributes, phtransactionhandle.toCPointer<ByteVar>(), phchangeofownerevent.toCPointer<ByteVar>())

public actual fun MsiCloseAllHandles(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseAllHandles()

public actual fun MsiCloseHandle(hany: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseHandle(hany)

public actual fun MsiCollectUserInfoA(szproduct: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoA(szproduct.toCPointer<ByteVar>())

public actual fun MsiCollectUserInfoW(szproduct: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoW(szproduct.toCPointer<ByteVar>())

public actual fun MsiConfigureFeatureA(szproduct: PCSTR, szfeature: PCSTR, einstallstate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureA(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), einstallstate)

public actual fun MsiConfigureFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureW(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), einstallstate)

public actual fun MsiConfigureProductA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductA(szproduct.toCPointer<ByteVar>(), iinstalllevel, einstallstate)

public actual fun MsiConfigureProductExA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExA(szproduct.toCPointer<ByteVar>(), iinstalllevel, einstallstate, szcommandline.toCPointer<ByteVar>())

public actual fun MsiConfigureProductExW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExW(szproduct.toCPointer<ByteVar>(), iinstalllevel, einstallstate, szcommandline.toCPointer<ByteVar>())

public actual fun MsiConfigureProductW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductW(szproduct.toCPointer<ByteVar>(), iinstalllevel, einstallstate)

public actual fun MsiCreateRecord(cparams: UInt): MSIHANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateRecord(cparams)

public actual fun MsiCreateTransformSummaryInfoA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoA(hdatabase, hdatabasereference, sztransformfile.toCPointer<ByteVar>(), ierrorconditions, ivalidation)

public actual fun MsiCreateTransformSummaryInfoW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoW(hdatabase, hdatabasereference, sztransformfile.toCPointer<ByteVar>(), ierrorconditions, ivalidation)

public actual fun MsiDatabaseApplyTransformA(hdatabase: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformA(hdatabase, sztransformfile.toCPointer<ByteVar>(), ierrorconditions)

public actual fun MsiDatabaseApplyTransformW(hdatabase: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformW(hdatabase, sztransformfile.toCPointer<ByteVar>(), ierrorconditions)

public actual fun MsiDatabaseCommit(hdatabase: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseCommit(hdatabase)

public actual fun MsiDatabaseExportA(hdatabase: MSIHANDLE, sztablename: PCSTR, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportA(hdatabase, sztablename.toCPointer<ByteVar>(), szfolderpath.toCPointer<ByteVar>(), szfilename.toCPointer<ByteVar>())

public actual fun MsiDatabaseExportW(hdatabase: MSIHANDLE, sztablename: PCWSTR, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportW(hdatabase, sztablename.toCPointer<ByteVar>(), szfolderpath.toCPointer<ByteVar>(), szfilename.toCPointer<ByteVar>())

public actual fun MsiDatabaseGenerateTransformA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ireserved1: Int, ireserved2: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformA(hdatabase, hdatabasereference, sztransformfile.toCPointer<ByteVar>(), ireserved1, ireserved2)

public actual fun MsiDatabaseGenerateTransformW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ireserved1: Int, ireserved2: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformW(hdatabase, hdatabasereference, sztransformfile.toCPointer<ByteVar>(), ireserved1, ireserved2)

public actual fun MsiDatabaseGetPrimaryKeysA(hdatabase: MSIHANDLE, sztablename: PCSTR, phrecord: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysA(hdatabase, sztablename.toCPointer<ByteVar>(), phrecord.toCPointer<ByteVar>())

public actual fun MsiDatabaseGetPrimaryKeysW(hdatabase: MSIHANDLE, sztablename: PCWSTR, phrecord: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysW(hdatabase, sztablename.toCPointer<ByteVar>(), phrecord.toCPointer<ByteVar>())

public actual fun MsiDatabaseImportA(hdatabase: MSIHANDLE, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportA(hdatabase, szfolderpath.toCPointer<ByteVar>(), szfilename.toCPointer<ByteVar>())

public actual fun MsiDatabaseImportW(hdatabase: MSIHANDLE, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportW(hdatabase, szfolderpath.toCPointer<ByteVar>(), szfilename.toCPointer<ByteVar>())

public actual fun MsiDatabaseIsTablePersistentA(hdatabase: MSIHANDLE, sztablename: PCSTR): MSICONDITION =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentA(hdatabase, sztablename.toCPointer<ByteVar>())

public actual fun MsiDatabaseIsTablePersistentW(hdatabase: MSIHANDLE, sztablename: PCWSTR): MSICONDITION =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentW(hdatabase, sztablename.toCPointer<ByteVar>())

public actual fun MsiDatabaseMergeA(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeA(hdatabase, hdatabasemerge, sztablename.toCPointer<ByteVar>())

public actual fun MsiDatabaseMergeW(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeW(hdatabase, hdatabasemerge, sztablename.toCPointer<ByteVar>())

public actual fun MsiDatabaseOpenViewA(hdatabase: MSIHANDLE, szquery: PCSTR, phview: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewA(hdatabase, szquery.toCPointer<ByteVar>(), phview.toCPointer<ByteVar>())

public actual fun MsiDatabaseOpenViewW(hdatabase: MSIHANDLE, szquery: PCWSTR, phview: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewW(hdatabase, szquery.toCPointer<ByteVar>(), phview.toCPointer<ByteVar>())

public actual fun MsiDetermineApplicablePatchesA(szproductpackagepath: PCSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesA(szproductpackagepath.toCPointer<ByteVar>(), cpatchinfo, ppatchinfo.toCPointer<ByteVar>())

public actual fun MsiDetermineApplicablePatchesW(szproductpackagepath: PCWSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesW(szproductpackagepath.toCPointer<ByteVar>(), cpatchinfo, ppatchinfo.toCPointer<ByteVar>())

public actual fun MsiDeterminePatchSequenceA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceA(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, cpatchinfo, ppatchinfo.toCPointer<ByteVar>())

public actual fun MsiDeterminePatchSequenceW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceW(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, cpatchinfo, ppatchinfo.toCPointer<ByteVar>())

public actual fun MsiDoActionA(hinstall: MSIHANDLE, szaction: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionA(hinstall, szaction.toCPointer<ByteVar>())

public actual fun MsiDoActionW(hinstall: MSIHANDLE, szaction: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionW(hinstall, szaction.toCPointer<ByteVar>())

public actual fun MsiEnableLogA(dwlogmode: UInt, szlogfile: PCSTR, dwlogattributes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogA(dwlogmode, szlogfile.toCPointer<ByteVar>(), dwlogattributes)

public actual fun MsiEnableLogW(dwlogmode: UInt, szlogfile: PCWSTR, dwlogattributes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogW(dwlogmode, szlogfile.toCPointer<ByteVar>(), dwlogattributes)

public actual fun MsiEnableUIPreview(hdatabase: MSIHANDLE, phpreview: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableUIPreview(hdatabase, phpreview.toCPointer<ByteVar>())

public actual fun MsiEndTransaction(dwtransactionstate: MSITRANSACTIONSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEndTransaction(dwtransactionstate)

public actual fun MsiEnumClientsA(szcomponent: PCSTR, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsA(szcomponent.toCPointer<ByteVar>(), iproductindex, lpproductbuf.toCPointer<ByteVar>())

public actual fun MsiEnumClientsExA(szcomponent: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExA(szcomponent.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwproductindex, szproductbuf.toCPointer<ByteVar>(), pdwinstalledcontext.toCPointer<ByteVar>(), szsid.toCPointer<ByteVar>(), pcchsid.toCPointer<ByteVar>())

public actual fun MsiEnumClientsExW(szcomponent: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExW(szcomponent.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwproductindex, szproductbuf.toCPointer<ByteVar>(), pdwinstalledcontext.toCPointer<ByteVar>(), szsid.toCPointer<ByteVar>(), pcchsid.toCPointer<ByteVar>())

public actual fun MsiEnumClientsW(szcomponent: PCWSTR, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsW(szcomponent.toCPointer<ByteVar>(), iproductindex, lpproductbuf.toCPointer<ByteVar>())

public actual fun MsiEnumComponentCostsA(hinstall: MSIHANDLE, szcomponent: PCSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsA(hinstall, szcomponent.toCPointer<ByteVar>(), dwindex, istate, szdrivebuf.toCPointer<ByteVar>(), pcchdrivebuf.toCPointer<ByteVar>(), picost.toCPointer<ByteVar>(), pitempcost.toCPointer<ByteVar>())

public actual fun MsiEnumComponentCostsW(hinstall: MSIHANDLE, szcomponent: PCWSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PWSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsW(hinstall, szcomponent.toCPointer<ByteVar>(), dwindex, istate, szdrivebuf.toCPointer<ByteVar>(), pcchdrivebuf.toCPointer<ByteVar>(), picost.toCPointer<ByteVar>(), pitempcost.toCPointer<ByteVar>())

public actual fun MsiEnumComponentQualifiersA(szcomponent: PCSTR, iindex: UInt, lpqualifierbuf: PSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PSTR, pcchapplicationdatabuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersA(szcomponent.toCPointer<ByteVar>(), iindex, lpqualifierbuf.toCPointer<ByteVar>(), pcchqualifierbuf.toCPointer<ByteVar>(), lpapplicationdatabuf.toCPointer<ByteVar>(), pcchapplicationdatabuf.toCPointer<ByteVar>())

public actual fun MsiEnumComponentQualifiersW(szcomponent: PCWSTR, iindex: UInt, lpqualifierbuf: PWSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PWSTR, pcchapplicationdatabuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersW(szcomponent.toCPointer<ByteVar>(), iindex, lpqualifierbuf.toCPointer<ByteVar>(), pcchqualifierbuf.toCPointer<ByteVar>(), lpapplicationdatabuf.toCPointer<ByteVar>(), pcchapplicationdatabuf.toCPointer<ByteVar>())

public actual fun MsiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsA(icomponentindex, lpcomponentbuf.toCPointer<ByteVar>())

public actual fun MsiEnumComponentsExA(szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExA(szusersid.toCPointer<ByteVar>(), dwcontext, dwindex, szinstalledcomponentcode.toCPointer<ByteVar>(), pdwinstalledcontext.toCPointer<ByteVar>(), szsid.toCPointer<ByteVar>(), pcchsid.toCPointer<ByteVar>())

public actual fun MsiEnumComponentsExW(szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExW(szusersid.toCPointer<ByteVar>(), dwcontext, dwindex, szinstalledcomponentcode.toCPointer<ByteVar>(), pdwinstalledcontext.toCPointer<ByteVar>(), szsid.toCPointer<ByteVar>(), pcchsid.toCPointer<ByteVar>())

public actual fun MsiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsW(icomponentindex, lpcomponentbuf.toCPointer<ByteVar>())

public actual fun MsiEnumFeaturesA(szproduct: PCSTR, ifeatureindex: UInt, lpfeaturebuf: PSTR, lpparentbuf: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesA(szproduct.toCPointer<ByteVar>(), ifeatureindex, lpfeaturebuf.toCPointer<ByteVar>(), lpparentbuf.toCPointer<ByteVar>())

public actual fun MsiEnumFeaturesW(szproduct: PCWSTR, ifeatureindex: UInt, lpfeaturebuf: PWSTR, lpparentbuf: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesW(szproduct.toCPointer<ByteVar>(), ifeatureindex, lpfeaturebuf.toCPointer<ByteVar>(), lpparentbuf.toCPointer<ByteVar>())

public actual fun MsiEnumPatchesA(szproduct: PCSTR, ipatchindex: UInt, lppatchbuf: PSTR, lptransformsbuf: PSTR, pcchtransformsbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesA(szproduct.toCPointer<ByteVar>(), ipatchindex, lppatchbuf.toCPointer<ByteVar>(), lptransformsbuf.toCPointer<ByteVar>(), pcchtransformsbuf.toCPointer<ByteVar>())

public actual fun MsiEnumPatchesExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PSTR, sztargetproductcode: PSTR, pdwtargetproductcontext: Long, sztargetusersid: PSTR, pcchtargetusersid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExA(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwfilter, dwindex, szpatchcode.toCPointer<ByteVar>(), sztargetproductcode.toCPointer<ByteVar>(), pdwtargetproductcontext.toCPointer<ByteVar>(), sztargetusersid.toCPointer<ByteVar>(), pcchtargetusersid.toCPointer<ByteVar>())

public actual fun MsiEnumPatchesExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PWSTR, sztargetproductcode: PWSTR, pdwtargetproductcontext: Long, sztargetusersid: PWSTR, pcchtargetusersid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExW(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwfilter, dwindex, szpatchcode.toCPointer<ByteVar>(), sztargetproductcode.toCPointer<ByteVar>(), pdwtargetproductcontext.toCPointer<ByteVar>(), sztargetusersid.toCPointer<ByteVar>(), pcchtargetusersid.toCPointer<ByteVar>())

public actual fun MsiEnumPatchesW(szproduct: PCWSTR, ipatchindex: UInt, lppatchbuf: PWSTR, lptransformsbuf: PWSTR, pcchtransformsbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesW(szproduct.toCPointer<ByteVar>(), ipatchindex, lppatchbuf.toCPointer<ByteVar>(), lptransformsbuf.toCPointer<ByteVar>(), pcchtransformsbuf.toCPointer<ByteVar>())

public actual fun MsiEnumProductsA(iproductindex: UInt, lpproductbuf: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsA(iproductindex, lpproductbuf.toCPointer<ByteVar>())

public actual fun MsiEnumProductsExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExA(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwindex, szinstalledproductcode.toCPointer<ByteVar>(), pdwinstalledcontext.toCPointer<ByteVar>(), szsid.toCPointer<ByteVar>(), pcchsid.toCPointer<ByteVar>())

public actual fun MsiEnumProductsExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExW(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwindex, szinstalledproductcode.toCPointer<ByteVar>(), pdwinstalledcontext.toCPointer<ByteVar>(), szsid.toCPointer<ByteVar>(), pcchsid.toCPointer<ByteVar>())

public actual fun MsiEnumProductsW(iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsW(iproductindex, lpproductbuf.toCPointer<ByteVar>())

public actual fun MsiEnumRelatedProductsA(lpupgradecode: PCSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsA(lpupgradecode.toCPointer<ByteVar>(), dwreserved, iproductindex, lpproductbuf.toCPointer<ByteVar>())

public actual fun MsiEnumRelatedProductsW(lpupgradecode: PCWSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsW(lpupgradecode.toCPointer<ByteVar>(), dwreserved, iproductindex, lpproductbuf.toCPointer<ByteVar>())

public actual fun MsiEvaluateConditionA(hinstall: MSIHANDLE, szcondition: PCSTR): MSICONDITION =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionA(hinstall, szcondition.toCPointer<ByteVar>())

public actual fun MsiEvaluateConditionW(hinstall: MSIHANDLE, szcondition: PCWSTR): MSICONDITION =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionW(hinstall, szcondition.toCPointer<ByteVar>())

public actual fun MsiExtractPatchXMLDataA(szpatchpath: PCSTR, dwreserved: UInt, szxmldata: PSTR, pcchxmldata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataA(szpatchpath.toCPointer<ByteVar>(), dwreserved, szxmldata.toCPointer<ByteVar>(), pcchxmldata.toCPointer<ByteVar>())

public actual fun MsiExtractPatchXMLDataW(szpatchpath: PCWSTR, dwreserved: UInt, szxmldata: PWSTR, pcchxmldata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataW(szpatchpath.toCPointer<ByteVar>(), dwreserved, szxmldata.toCPointer<ByteVar>(), pcchxmldata.toCPointer<ByteVar>())

public actual fun MsiFormatRecordA(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PSTR, pcchresultbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordA(hinstall, hrecord, szresultbuf.toCPointer<ByteVar>(), pcchresultbuf.toCPointer<ByteVar>())

public actual fun MsiFormatRecordW(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PWSTR, pcchresultbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordW(hinstall, hrecord, szresultbuf.toCPointer<ByteVar>(), pcchresultbuf.toCPointer<ByteVar>())

public actual fun MsiGetActiveDatabase(hinstall: MSIHANDLE): MSIHANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetActiveDatabase(hinstall)

public actual fun MsiGetComponentPathA(szproduct: PCSTR, szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathA(szproduct.toCPointer<ByteVar>(), szcomponent.toCPointer<ByteVar>(), lppathbuf.toCPointer<ByteVar>(), pcchbuf.toCPointer<ByteVar>())

public actual fun MsiGetComponentPathExA(szproductcode: PCSTR, szcomponentcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExA(szproductcode.toCPointer<ByteVar>(), szcomponentcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, lpoutpathbuffer.toCPointer<ByteVar>(), pcchoutpathbuffer.toCPointer<ByteVar>())

public actual fun MsiGetComponentPathExW(szproductcode: PCWSTR, szcomponentcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PWSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExW(szproductcode.toCPointer<ByteVar>(), szcomponentcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, lpoutpathbuffer.toCPointer<ByteVar>(), pcchoutpathbuffer.toCPointer<ByteVar>())

public actual fun MsiGetComponentPathW(szproduct: PCWSTR, szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathW(szproduct.toCPointer<ByteVar>(), szcomponent.toCPointer<ByteVar>(), lppathbuf.toCPointer<ByteVar>(), pcchbuf.toCPointer<ByteVar>())

public actual fun MsiGetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, piinstalled: Long, piaction: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateA(hinstall, szcomponent.toCPointer<ByteVar>(), piinstalled.toCPointer<ByteVar>(), piaction.toCPointer<ByteVar>())

public actual fun MsiGetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateW(hinstall, szcomponent.toCPointer<ByteVar>(), piinstalled.toCPointer<ByteVar>(), piaction.toCPointer<ByteVar>())

public actual fun MsiGetDatabaseState(hdatabase: MSIHANDLE): MSIDBSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetDatabaseState(hdatabase)

public actual fun MsiGetFeatureCostA(hinstall: MSIHANDLE, szfeature: PCSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostA(hinstall, szfeature.toCPointer<ByteVar>(), icosttree, istate, picost.toCPointer<ByteVar>())

public actual fun MsiGetFeatureCostW(hinstall: MSIHANDLE, szfeature: PCWSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostW(hinstall, szfeature.toCPointer<ByteVar>(), icosttree, istate, picost.toCPointer<ByteVar>())

public actual fun MsiGetFeatureInfoA(hproduct: MSIHANDLE, szfeature: PCSTR, lpattributes: Long, lptitlebuf: PSTR, pcchtitlebuf: Long, lphelpbuf: PSTR, pcchhelpbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoA(hproduct, szfeature.toCPointer<ByteVar>(), lpattributes.toCPointer<ByteVar>(), lptitlebuf.toCPointer<ByteVar>(), pcchtitlebuf.toCPointer<ByteVar>(), lphelpbuf.toCPointer<ByteVar>(), pcchhelpbuf.toCPointer<ByteVar>())

public actual fun MsiGetFeatureInfoW(hproduct: MSIHANDLE, szfeature: PCWSTR, lpattributes: Long, lptitlebuf: PWSTR, pcchtitlebuf: Long, lphelpbuf: PWSTR, pcchhelpbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoW(hproduct, szfeature.toCPointer<ByteVar>(), lpattributes.toCPointer<ByteVar>(), lptitlebuf.toCPointer<ByteVar>(), pcchtitlebuf.toCPointer<ByteVar>(), lphelpbuf.toCPointer<ByteVar>(), pcchhelpbuf.toCPointer<ByteVar>())

public actual fun MsiGetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, piinstalled: Long, piaction: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateA(hinstall, szfeature.toCPointer<ByteVar>(), piinstalled.toCPointer<ByteVar>(), piaction.toCPointer<ByteVar>())

public actual fun MsiGetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateW(hinstall, szfeature.toCPointer<ByteVar>(), piinstalled.toCPointer<ByteVar>(), piaction.toCPointer<ByteVar>())

public actual fun MsiGetFeatureUsageA(szproduct: PCSTR, szfeature: PCSTR, pdwusecount: Long, pwdateused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageA(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), pdwusecount.toCPointer<ByteVar>(), pwdateused.toCPointer<ByteVar>())

public actual fun MsiGetFeatureUsageW(szproduct: PCWSTR, szfeature: PCWSTR, pdwusecount: Long, pwdateused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageW(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), pdwusecount.toCPointer<ByteVar>(), pwdateused.toCPointer<ByteVar>())

public actual fun MsiGetFeatureValidStatesA(hinstall: MSIHANDLE, szfeature: PCSTR, lpinstallstates: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesA(hinstall, szfeature.toCPointer<ByteVar>(), lpinstallstates.toCPointer<ByteVar>())

public actual fun MsiGetFeatureValidStatesW(hinstall: MSIHANDLE, szfeature: PCWSTR, lpinstallstates: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesW(hinstall, szfeature.toCPointer<ByteVar>(), lpinstallstates.toCPointer<ByteVar>())

public actual fun MsiGetFileHashA(szfilepath: PCSTR, dwoptions: UInt, phash: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashA(szfilepath.toCPointer<ByteVar>(), dwoptions, phash.toCPointer<ByteVar>())

public actual fun MsiGetFileHashW(szfilepath: PCWSTR, dwoptions: UInt, phash: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashW(szfilepath.toCPointer<ByteVar>(), dwoptions, phash.toCPointer<ByteVar>())

public actual fun MsiGetFileSignatureInformationA(szsignedobjectpath: PCSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationA(szsignedobjectpath.toCPointer<ByteVar>(), dwflags, ppccertcontext.toCPointer<ByteVar>(), pbhashdata.toCPointer<ByteVar>(), pcbhashdata.toCPointer<ByteVar>())

public actual fun MsiGetFileSignatureInformationW(szsignedobjectpath: PCWSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationW(szsignedobjectpath.toCPointer<ByteVar>(), dwflags, ppccertcontext.toCPointer<ByteVar>(), pbhashdata.toCPointer<ByteVar>(), pcbhashdata.toCPointer<ByteVar>())

public actual fun MsiGetFileVersionA(szfilepath: PCSTR, lpversionbuf: PSTR, pcchversionbuf: Long, lplangbuf: PSTR, pcchlangbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionA(szfilepath.toCPointer<ByteVar>(), lpversionbuf.toCPointer<ByteVar>(), pcchversionbuf.toCPointer<ByteVar>(), lplangbuf.toCPointer<ByteVar>(), pcchlangbuf.toCPointer<ByteVar>())

public actual fun MsiGetFileVersionW(szfilepath: PCWSTR, lpversionbuf: PWSTR, pcchversionbuf: Long, lplangbuf: PWSTR, pcchlangbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionW(szfilepath.toCPointer<ByteVar>(), lpversionbuf.toCPointer<ByteVar>(), pcchversionbuf.toCPointer<ByteVar>(), lplangbuf.toCPointer<ByteVar>(), pcchlangbuf.toCPointer<ByteVar>())

public actual fun MsiGetLanguage(hinstall: MSIHANDLE): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLanguage(hinstall)

public actual fun MsiGetLastErrorRecord(): MSIHANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLastErrorRecord()

public actual fun MsiGetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetMode(hinstall, erunmode)

public actual fun MsiGetPatchFileListA(szproductcode: PCSTR, szpatchpackages: PCSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListA(szproductcode.toCPointer<ByteVar>(), szpatchpackages.toCPointer<ByteVar>(), pcfiles.toCPointer<ByteVar>(), pphfilerecords.toCPointer<ByteVar>())

public actual fun MsiGetPatchFileListW(szproductcode: PCWSTR, szpatchpackages: PCWSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListW(szproductcode.toCPointer<ByteVar>(), szpatchpackages.toCPointer<ByteVar>(), pcfiles.toCPointer<ByteVar>(), pphfilerecords.toCPointer<ByteVar>())

public actual fun MsiGetPatchInfoA(szpatch: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoA(szpatch.toCPointer<ByteVar>(), szattribute.toCPointer<ByteVar>(), lpvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetPatchInfoExA(szpatchcode: PCSTR, szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, lpvalue: PSTR, pcchvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExA(szpatchcode.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szproperty.toCPointer<ByteVar>(), lpvalue.toCPointer<ByteVar>(), pcchvalue.toCPointer<ByteVar>())

public actual fun MsiGetPatchInfoExW(szpatchcode: PCWSTR, szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, lpvalue: PWSTR, pcchvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExW(szpatchcode.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szproperty.toCPointer<ByteVar>(), lpvalue.toCPointer<ByteVar>(), pcchvalue.toCPointer<ByteVar>())

public actual fun MsiGetPatchInfoW(szpatch: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoW(szpatch.toCPointer<ByteVar>(), szattribute.toCPointer<ByteVar>(), lpvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetProductCodeA(szcomponent: PCSTR, lpbuf39: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeA(szcomponent.toCPointer<ByteVar>(), lpbuf39.toCPointer<ByteVar>())

public actual fun MsiGetProductCodeW(szcomponent: PCWSTR, lpbuf39: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeW(szcomponent.toCPointer<ByteVar>(), lpbuf39.toCPointer<ByteVar>())

public actual fun MsiGetProductInfoA(szproduct: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoA(szproduct.toCPointer<ByteVar>(), szattribute.toCPointer<ByteVar>(), lpvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetProductInfoExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExA(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szproperty.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>(), pcchvalue.toCPointer<ByteVar>())

public actual fun MsiGetProductInfoExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExW(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szproperty.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>(), pcchvalue.toCPointer<ByteVar>())

public actual fun MsiGetProductInfoFromScriptA(szscriptfile: PCSTR, lpproductbuf39: PSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PSTR, pcchnamebuf: Long, lppackagebuf: PSTR, pcchpackagebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptA(szscriptfile.toCPointer<ByteVar>(), lpproductbuf39.toCPointer<ByteVar>(), plgidlanguage.toCPointer<ByteVar>(), pdwversion.toCPointer<ByteVar>(), lpnamebuf.toCPointer<ByteVar>(), pcchnamebuf.toCPointer<ByteVar>(), lppackagebuf.toCPointer<ByteVar>(), pcchpackagebuf.toCPointer<ByteVar>())

public actual fun MsiGetProductInfoFromScriptW(szscriptfile: PCWSTR, lpproductbuf39: PWSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PWSTR, pcchnamebuf: Long, lppackagebuf: PWSTR, pcchpackagebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptW(szscriptfile.toCPointer<ByteVar>(), lpproductbuf39.toCPointer<ByteVar>(), plgidlanguage.toCPointer<ByteVar>(), pdwversion.toCPointer<ByteVar>(), lpnamebuf.toCPointer<ByteVar>(), pcchnamebuf.toCPointer<ByteVar>(), lppackagebuf.toCPointer<ByteVar>(), pcchpackagebuf.toCPointer<ByteVar>())

public actual fun MsiGetProductInfoW(szproduct: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoW(szproduct.toCPointer<ByteVar>(), szattribute.toCPointer<ByteVar>(), lpvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetProductPropertyA(hproduct: MSIHANDLE, szproperty: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyA(hproduct, szproperty.toCPointer<ByteVar>(), lpvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetProductPropertyW(hproduct: MSIHANDLE, szproperty: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyW(hproduct, szproperty.toCPointer<ByteVar>(), lpvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyA(hinstall, szname.toCPointer<ByteVar>(), szvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyW(hinstall, szname.toCPointer<ByteVar>(), szvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiGetShortcutTargetA(szshortcutpath: PCSTR, szproductcode: PSTR, szfeatureid: PSTR, szcomponentcode: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetA(szshortcutpath.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), szfeatureid.toCPointer<ByteVar>(), szcomponentcode.toCPointer<ByteVar>())

public actual fun MsiGetShortcutTargetW(szshortcutpath: PCWSTR, szproductcode: PWSTR, szfeatureid: PWSTR, szcomponentcode: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetW(szshortcutpath.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), szfeatureid.toCPointer<ByteVar>(), szcomponentcode.toCPointer<ByteVar>())

public actual fun MsiGetSourcePathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathA(hinstall, szfolder.toCPointer<ByteVar>(), szpathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiGetSourcePathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathW(hinstall, szfolder.toCPointer<ByteVar>(), szpathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiGetSummaryInformationA(hdatabase: MSIHANDLE, szdatabasepath: PCSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationA(hdatabase, szdatabasepath.toCPointer<ByteVar>(), uiupdatecount, phsummaryinfo.toCPointer<ByteVar>())

public actual fun MsiGetSummaryInformationW(hdatabase: MSIHANDLE, szdatabasepath: PCWSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationW(hdatabase, szdatabasepath.toCPointer<ByteVar>(), uiupdatecount, phsummaryinfo.toCPointer<ByteVar>())

public actual fun MsiGetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathA(hinstall, szfolder.toCPointer<ByteVar>(), szpathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiGetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathW(hinstall, szfolder.toCPointer<ByteVar>(), szpathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiGetUserInfoA(szproduct: PCSTR, lpusernamebuf: PSTR, pcchusernamebuf: Long, lporgnamebuf: PSTR, pcchorgnamebuf: Long, lpserialbuf: PSTR, pcchserialbuf: Long): USERINFOSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoA(szproduct.toCPointer<ByteVar>(), lpusernamebuf.toCPointer<ByteVar>(), pcchusernamebuf.toCPointer<ByteVar>(), lporgnamebuf.toCPointer<ByteVar>(), pcchorgnamebuf.toCPointer<ByteVar>(), lpserialbuf.toCPointer<ByteVar>(), pcchserialbuf.toCPointer<ByteVar>())

public actual fun MsiGetUserInfoW(szproduct: PCWSTR, lpusernamebuf: PWSTR, pcchusernamebuf: Long, lporgnamebuf: PWSTR, pcchorgnamebuf: Long, lpserialbuf: PWSTR, pcchserialbuf: Long): USERINFOSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoW(szproduct.toCPointer<ByteVar>(), lpusernamebuf.toCPointer<ByteVar>(), pcchusernamebuf.toCPointer<ByteVar>(), lporgnamebuf.toCPointer<ByteVar>(), pcchorgnamebuf.toCPointer<ByteVar>(), lpserialbuf.toCPointer<ByteVar>(), pcchserialbuf.toCPointer<ByteVar>())

public actual fun MsiInstallMissingComponentA(szproduct: PCSTR, szcomponent: PCSTR, einstallstate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentA(szproduct.toCPointer<ByteVar>(), szcomponent.toCPointer<ByteVar>(), einstallstate)

public actual fun MsiInstallMissingComponentW(szproduct: PCWSTR, szcomponent: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentW(szproduct.toCPointer<ByteVar>(), szcomponent.toCPointer<ByteVar>(), einstallstate)

public actual fun MsiInstallMissingFileA(szproduct: PCSTR, szfile: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileA(szproduct.toCPointer<ByteVar>(), szfile.toCPointer<ByteVar>())

public actual fun MsiInstallMissingFileW(szproduct: PCWSTR, szfile: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileW(szproduct.toCPointer<ByteVar>(), szfile.toCPointer<ByteVar>())

public actual fun MsiInstallProductA(szpackagepath: PCSTR, szcommandline: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductA(szpackagepath.toCPointer<ByteVar>(), szcommandline.toCPointer<ByteVar>())

public actual fun MsiInstallProductW(szpackagepath: PCWSTR, szcommandline: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductW(szpackagepath.toCPointer<ByteVar>(), szcommandline.toCPointer<ByteVar>())

public actual fun MsiIsProductElevatedA(szproduct: PCSTR, pfelevated: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedA(szproduct.toCPointer<ByteVar>(), pfelevated.toCPointer<ByteVar>())

public actual fun MsiIsProductElevatedW(szproduct: PCWSTR, pfelevated: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedW(szproduct.toCPointer<ByteVar>(), pfelevated.toCPointer<ByteVar>())

public actual fun MsiJoinTransaction(htransactionhandle: MSIHANDLE, dwtransactionattributes: UInt, phchangeofownerevent: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiJoinTransaction(htransactionhandle, dwtransactionattributes, phchangeofownerevent.toCPointer<ByteVar>())

public actual fun MsiLocateComponentA(szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentA(szcomponent.toCPointer<ByteVar>(), lppathbuf.toCPointer<ByteVar>(), pcchbuf.toCPointer<ByteVar>())

public actual fun MsiLocateComponentW(szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentW(szcomponent.toCPointer<ByteVar>(), lppathbuf.toCPointer<ByteVar>(), pcchbuf.toCPointer<ByteVar>())

public actual fun MsiNotifySidChangeA(poldsid: PCSTR, pnewsid: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeA(poldsid.toCPointer<ByteVar>(), pnewsid.toCPointer<ByteVar>())

public actual fun MsiNotifySidChangeW(poldsid: PCWSTR, pnewsid: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeW(poldsid.toCPointer<ByteVar>(), pnewsid.toCPointer<ByteVar>())

public actual fun MsiOpenDatabaseA(szdatabasepath: PCSTR, szpersist: PCSTR, phdatabase: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseA(szdatabasepath.toCPointer<ByteVar>(), szpersist.toCPointer<ByteVar>(), phdatabase.toCPointer<ByteVar>())

public actual fun MsiOpenDatabaseW(szdatabasepath: PCWSTR, szpersist: PCWSTR, phdatabase: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseW(szdatabasepath.toCPointer<ByteVar>(), szpersist.toCPointer<ByteVar>(), phdatabase.toCPointer<ByteVar>())

public actual fun MsiOpenPackageA(szpackagepath: PCSTR, hproduct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageA(szpackagepath.toCPointer<ByteVar>(), hproduct.toCPointer<ByteVar>())

public actual fun MsiOpenPackageExA(szpackagepath: PCSTR, dwoptions: UInt, hproduct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExA(szpackagepath.toCPointer<ByteVar>(), dwoptions, hproduct.toCPointer<ByteVar>())

public actual fun MsiOpenPackageExW(szpackagepath: PCWSTR, dwoptions: UInt, hproduct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExW(szpackagepath.toCPointer<ByteVar>(), dwoptions, hproduct.toCPointer<ByteVar>())

public actual fun MsiOpenPackageW(szpackagepath: PCWSTR, hproduct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageW(szpackagepath.toCPointer<ByteVar>(), hproduct.toCPointer<ByteVar>())

public actual fun MsiOpenProductA(szproduct: PCSTR, hproduct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductA(szproduct.toCPointer<ByteVar>(), hproduct.toCPointer<ByteVar>())

public actual fun MsiOpenProductW(szproduct: PCWSTR, hproduct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductW(szproduct.toCPointer<ByteVar>(), hproduct.toCPointer<ByteVar>())

public actual fun MsiPreviewBillboardA(hpreview: MSIHANDLE, szcontrolname: PCSTR, szbillboard: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardA(hpreview, szcontrolname.toCPointer<ByteVar>(), szbillboard.toCPointer<ByteVar>())

public actual fun MsiPreviewBillboardW(hpreview: MSIHANDLE, szcontrolname: PCWSTR, szbillboard: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardW(hpreview, szcontrolname.toCPointer<ByteVar>(), szbillboard.toCPointer<ByteVar>())

public actual fun MsiPreviewDialogA(hpreview: MSIHANDLE, szdialogname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogA(hpreview, szdialogname.toCPointer<ByteVar>())

public actual fun MsiPreviewDialogW(hpreview: MSIHANDLE, szdialogname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogW(hpreview, szdialogname.toCPointer<ByteVar>())

public actual fun MsiProcessAdvertiseScriptA(szscriptfile: PCSTR, sziconfolder: PCSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptA(szscriptfile.toCPointer<ByteVar>(), sziconfolder.toCPointer<ByteVar>(), hregdata.toCPointer<ByteVar>(), fshortcuts, fremoveitems)

public actual fun MsiProcessAdvertiseScriptW(szscriptfile: PCWSTR, sziconfolder: PCWSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptW(szscriptfile.toCPointer<ByteVar>(), sziconfolder.toCPointer<ByteVar>(), hregdata.toCPointer<ByteVar>(), fshortcuts, fremoveitems)

public actual fun MsiProcessMessage(hinstall: MSIHANDLE, emessagetype: INSTALLMESSAGE, hrecord: MSIHANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessMessage(hinstall, emessagetype, hrecord)

public actual fun MsiProvideAssemblyA(szassemblyname: PCSTR, szappcontext: PCSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyA(szassemblyname.toCPointer<ByteVar>(), szappcontext.toCPointer<ByteVar>(), dwinstallmode, dwassemblyinfo, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiProvideAssemblyW(szassemblyname: PCWSTR, szappcontext: PCWSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyW(szassemblyname.toCPointer<ByteVar>(), szappcontext.toCPointer<ByteVar>(), dwinstallmode, dwassemblyinfo, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiProvideComponentA(szproduct: PCSTR, szfeature: PCSTR, szcomponent: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentA(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), szcomponent.toCPointer<ByteVar>(), dwinstallmode, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiProvideComponentW(szproduct: PCWSTR, szfeature: PCWSTR, szcomponent: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentW(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), szcomponent.toCPointer<ByteVar>(), dwinstallmode, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiProvideQualifiedComponentA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentA(szcategory.toCPointer<ByteVar>(), szqualifier.toCPointer<ByteVar>(), dwinstallmode, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiProvideQualifiedComponentExA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, szproduct: PCSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExA(szcategory.toCPointer<ByteVar>(), szqualifier.toCPointer<ByteVar>(), dwinstallmode, szproduct.toCPointer<ByteVar>(), dwunused1, dwunused2, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiProvideQualifiedComponentExW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, szproduct: PCWSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExW(szcategory.toCPointer<ByteVar>(), szqualifier.toCPointer<ByteVar>(), dwinstallmode, szproduct.toCPointer<ByteVar>(), dwunused1, dwunused2, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiProvideQualifiedComponentW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentW(szcategory.toCPointer<ByteVar>(), szqualifier.toCPointer<ByteVar>(), dwinstallmode, lppathbuf.toCPointer<ByteVar>(), pcchpathbuf.toCPointer<ByteVar>())

public actual fun MsiQueryComponentStateA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCSTR, pdwstate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateA(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szcomponentcode.toCPointer<ByteVar>(), pdwstate.toCPointer<ByteVar>())

public actual fun MsiQueryComponentStateW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCWSTR, pdwstate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateW(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szcomponentcode.toCPointer<ByteVar>(), pdwstate.toCPointer<ByteVar>())

public actual fun MsiQueryFeatureStateA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateA(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>())

public actual fun MsiQueryFeatureStateExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCSTR, pdwstate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExA(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szfeature.toCPointer<ByteVar>(), pdwstate.toCPointer<ByteVar>())

public actual fun MsiQueryFeatureStateExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCWSTR, pdwstate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExW(szproductcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, szfeature.toCPointer<ByteVar>(), pdwstate.toCPointer<ByteVar>())

public actual fun MsiQueryFeatureStateW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateW(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>())

public actual fun MsiQueryProductStateA(szproduct: PCSTR): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateA(szproduct.toCPointer<ByteVar>())

public actual fun MsiQueryProductStateW(szproduct: PCWSTR): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateW(szproduct.toCPointer<ByteVar>())

public actual fun MsiRecordClearData(hrecord: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordClearData(hrecord)

public actual fun MsiRecordDataSize(hrecord: MSIHANDLE, ifield: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordDataSize(hrecord, ifield)

public actual fun MsiRecordGetFieldCount(hrecord: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetFieldCount(hrecord)

public actual fun MsiRecordGetInteger(hrecord: MSIHANDLE, ifield: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetInteger(hrecord, ifield)

public actual fun MsiRecordGetStringA(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringA(hrecord, ifield, szvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiRecordGetStringW(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringW(hrecord, ifield, szvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiRecordIsNull(hrecord: MSIHANDLE, ifield: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordIsNull(hrecord, ifield)

public actual fun MsiRecordReadStream(hrecord: MSIHANDLE, ifield: UInt, szdatabuf: PSTR, pcbdatabuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordReadStream(hrecord, ifield, szdatabuf.toCPointer<ByteVar>(), pcbdatabuf.toCPointer<ByteVar>())

public actual fun MsiRecordSetInteger(hrecord: MSIHANDLE, ifield: UInt, ivalue: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetInteger(hrecord, ifield, ivalue)

public actual fun MsiRecordSetStreamA(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamA(hrecord, ifield, szfilepath.toCPointer<ByteVar>())

public actual fun MsiRecordSetStreamW(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamW(hrecord, ifield, szfilepath.toCPointer<ByteVar>())

public actual fun MsiRecordSetStringA(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringA(hrecord, ifield, szvalue.toCPointer<ByteVar>())

public actual fun MsiRecordSetStringW(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringW(hrecord, ifield, szvalue.toCPointer<ByteVar>())

public actual fun MsiReinstallFeatureA(szproduct: PCSTR, szfeature: PCSTR, dwreinstallmode: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureA(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), dwreinstallmode)

public actual fun MsiReinstallFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, dwreinstallmode: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureW(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), dwreinstallmode)

public actual fun MsiReinstallProductA(szproduct: PCSTR, szreinstallmode: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductA(szproduct.toCPointer<ByteVar>(), szreinstallmode)

public actual fun MsiReinstallProductW(szproduct: PCWSTR, szreinstallmode: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductW(szproduct.toCPointer<ByteVar>(), szreinstallmode)

public actual fun MsiRemovePatchesA(szpatchlist: PCSTR, szproductcode: PCSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesA(szpatchlist.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), euninstalltype, szpropertylist.toCPointer<ByteVar>())

public actual fun MsiRemovePatchesW(szpatchlist: PCWSTR, szproductcode: PCWSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesW(szpatchlist.toCPointer<ByteVar>(), szproductcode.toCPointer<ByteVar>(), euninstalltype, szpropertylist.toCPointer<ByteVar>())

public actual fun MsiSequenceA(hinstall: MSIHANDLE, sztable: PCSTR, isequencemode: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceA(hinstall, sztable.toCPointer<ByteVar>(), isequencemode)

public actual fun MsiSequenceW(hinstall: MSIHANDLE, sztable: PCWSTR, isequencemode: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceW(hinstall, sztable.toCPointer<ByteVar>(), isequencemode)

public actual fun MsiSetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, istate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateA(hinstall, szcomponent.toCPointer<ByteVar>(), istate)

public actual fun MsiSetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, istate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateW(hinstall, szcomponent.toCPointer<ByteVar>(), istate)

public actual fun MsiSetExternalUIA(puihandler: INSTALLUI_HANDLERA, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERA =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIA(puihandler.toLong().toCPointer<ByteVar>(), dwmessagefilter, pvcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MsiSetExternalUIRecord(puihandler: PINSTALLUI_HANDLER_RECORD, dwmessagefilter: UInt, pvcontext: Long, ppuiprevhandler: PINSTALLUI_HANDLER_RECORD): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIRecord(puihandler.toLong().toCPointer<ByteVar>(), dwmessagefilter, pvcontext.toCPointer<ByteVar>(), ppuiprevhandler.toLong().toCPointer<ByteVar>())

public actual fun MsiSetExternalUIW(puihandler: INSTALLUI_HANDLERW, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERW =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIW(puihandler.toLong().toCPointer<ByteVar>(), dwmessagefilter, pvcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun MsiSetFeatureAttributesA(hinstall: MSIHANDLE, szfeature: PCSTR, dwattributes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesA(hinstall, szfeature.toCPointer<ByteVar>(), dwattributes)

public actual fun MsiSetFeatureAttributesW(hinstall: MSIHANDLE, szfeature: PCWSTR, dwattributes: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesW(hinstall, szfeature.toCPointer<ByteVar>(), dwattributes)

public actual fun MsiSetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, istate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateA(hinstall, szfeature.toCPointer<ByteVar>(), istate)

public actual fun MsiSetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, istate: INSTALLSTATE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateW(hinstall, szfeature.toCPointer<ByteVar>(), istate)

public actual fun MsiSetInstallLevel(hinstall: MSIHANDLE, iinstalllevel: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInstallLevel(hinstall, iinstalllevel)

public actual fun MsiSetInternalUI(dwuilevel: INSTALLUILEVEL, phwnd: Long): INSTALLUILEVEL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInternalUI(dwuilevel, phwnd.toCPointer<ByteVar>())

public actual fun MsiSetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE, fstate: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetMode(hinstall, erunmode, fstate)

public actual fun MsiSetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvalue: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyA(hinstall, szname.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>())

public actual fun MsiSetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvalue: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyW(hinstall, szname.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>())

public actual fun MsiSetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szfolderpath: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathA(hinstall, szfolder.toCPointer<ByteVar>(), szfolderpath.toCPointer<ByteVar>())

public actual fun MsiSetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szfolderpath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathW(hinstall, szfolder.toCPointer<ByteVar>(), szfolderpath.toCPointer<ByteVar>())

public actual fun MsiSourceListAddMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCSTR, szdiskprompt: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwdiskid, szvolumelabel.toCPointer<ByteVar>(), szdiskprompt.toCPointer<ByteVar>())

public actual fun MsiSourceListAddMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCWSTR, szdiskprompt: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwdiskid, szvolumelabel.toCPointer<ByteVar>(), szdiskprompt.toCPointer<ByteVar>())

public actual fun MsiSourceListAddSourceA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt, szsource: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceA(szproduct.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), dwreserved, szsource.toCPointer<ByteVar>())

public actual fun MsiSourceListAddSourceExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR, dwindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szsource.toCPointer<ByteVar>(), dwindex)

public actual fun MsiSourceListAddSourceExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR, dwindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szsource.toCPointer<ByteVar>(), dwindex)

public actual fun MsiSourceListAddSourceW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt, szsource: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceW(szproduct.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), dwreserved, szsource.toCPointer<ByteVar>())

public actual fun MsiSourceListClearAllA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllA(szproduct.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), dwreserved)

public actual fun MsiSourceListClearAllExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions)

public actual fun MsiSourceListClearAllExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions)

public actual fun MsiSourceListClearAllW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllW(szproduct.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), dwreserved)

public actual fun MsiSourceListClearMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwdiskid)

public actual fun MsiSourceListClearMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwdiskid)

public actual fun MsiSourceListClearSourceA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szsource.toCPointer<ByteVar>())

public actual fun MsiSourceListClearSourceW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szsource.toCPointer<ByteVar>())

public actual fun MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PSTR, pcchvolumelabel: Long, szdiskprompt: PSTR, pcchdiskprompt: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwindex, pdwdiskid.toCPointer<ByteVar>(), szvolumelabel.toCPointer<ByteVar>(), pcchvolumelabel.toCPointer<ByteVar>(), szdiskprompt.toCPointer<ByteVar>(), pcchdiskprompt.toCPointer<ByteVar>())

public actual fun MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PWSTR, pcchvolumelabel: Long, szdiskprompt: PWSTR, pcchdiskprompt: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwindex, pdwdiskid.toCPointer<ByteVar>(), szvolumelabel.toCPointer<ByteVar>(), pcchvolumelabel.toCPointer<ByteVar>(), szdiskprompt.toCPointer<ByteVar>(), pcchdiskprompt.toCPointer<ByteVar>())

public actual fun MsiSourceListEnumSourcesA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PSTR, pcchsource: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwindex, szsource.toCPointer<ByteVar>(), pcchsource.toCPointer<ByteVar>())

public actual fun MsiSourceListEnumSourcesW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PWSTR, pcchsource: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, dwindex, szsource.toCPointer<ByteVar>(), pcchsource.toCPointer<ByteVar>())

public actual fun MsiSourceListForceResolutionA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionA(szproduct.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), dwreserved)

public actual fun MsiSourceListForceResolutionExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions)

public actual fun MsiSourceListForceResolutionExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions)

public actual fun MsiSourceListForceResolutionW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionW(szproduct.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), dwreserved)

public actual fun MsiSourceListGetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szproperty.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>(), pcchvalue.toCPointer<ByteVar>())

public actual fun MsiSourceListGetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szproperty.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>(), pcchvalue.toCPointer<ByteVar>())

public actual fun MsiSourceListSetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoA(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szproperty.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>())

public actual fun MsiSourceListSetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoW(szproductcodeorpatchcode.toCPointer<ByteVar>(), szusersid.toCPointer<ByteVar>(), dwcontext, dwoptions, szproperty.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>())

public actual fun MsiSummaryInfoGetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyA(hsummaryinfo, uiproperty, puidatatype.toCPointer<ByteVar>(), pivalue.toCPointer<ByteVar>(), pftvalue.toCPointer<ByteVar>(), szvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiSummaryInfoGetPropertyCount(hsummaryinfo: MSIHANDLE, puipropertycount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyCount(hsummaryinfo, puipropertycount.toCPointer<ByteVar>())

public actual fun MsiSummaryInfoGetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyW(hsummaryinfo, uiproperty, puidatatype.toCPointer<ByteVar>(), pivalue.toCPointer<ByteVar>(), pftvalue.toCPointer<ByteVar>(), szvaluebuf.toCPointer<ByteVar>(), pcchvaluebuf.toCPointer<ByteVar>())

public actual fun MsiSummaryInfoPersist(hsummaryinfo: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoPersist(hsummaryinfo)

public actual fun MsiSummaryInfoSetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyA(hsummaryinfo, uiproperty, uidatatype, ivalue, pftvalue.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>())

public actual fun MsiSummaryInfoSetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyW(hsummaryinfo, uiproperty, uidatatype, ivalue, pftvalue.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>())

public actual fun MsiUseFeatureA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureA(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>())

public actual fun MsiUseFeatureExA(szproduct: PCSTR, szfeature: PCSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExA(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), dwinstallmode, dwreserved)

public actual fun MsiUseFeatureExW(szproduct: PCWSTR, szfeature: PCWSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExW(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>(), dwinstallmode, dwreserved)

public actual fun MsiUseFeatureW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureW(szproduct.toCPointer<ByteVar>(), szfeature.toCPointer<ByteVar>())

public actual fun MsiVerifyDiskSpace(hinstall: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyDiskSpace(hinstall)

public actual fun MsiVerifyPackageA(szpackagepath: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageA(szpackagepath.toCPointer<ByteVar>())

public actual fun MsiVerifyPackageW(szpackagepath: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageW(szpackagepath.toCPointer<ByteVar>())

public actual fun MsiViewClose(hview: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewClose(hview)

public actual fun MsiViewExecute(hview: MSIHANDLE, hrecord: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewExecute(hview, hrecord)

public actual fun MsiViewFetch(hview: MSIHANDLE, phrecord: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewFetch(hview, phrecord.toCPointer<ByteVar>())

public actual fun MsiViewGetColumnInfo(hview: MSIHANDLE, ecolumninfo: MSICOLINFO, phrecord: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetColumnInfo(hview, ecolumninfo, phrecord.toCPointer<ByteVar>())

public actual fun MsiViewGetErrorA(hview: MSIHANDLE, szcolumnnamebuffer: PSTR, pcchbuf: Long): MSIDBERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorA(hview, szcolumnnamebuffer.toCPointer<ByteVar>(), pcchbuf.toCPointer<ByteVar>())

public actual fun MsiViewGetErrorW(hview: MSIHANDLE, szcolumnnamebuffer: PWSTR, pcchbuf: Long): MSIDBERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorW(hview, szcolumnnamebuffer.toCPointer<ByteVar>(), pcchbuf.toCPointer<ByteVar>())

public actual fun MsiViewModify(hview: MSIHANDLE, emodifymode: MSIMODIFY, hrecord: MSIHANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewModify(hview, emodifymode, hrecord)

public actual fun NormalizeFileForPatchSignature(filebuffer: Long, filesize: UInt, optionflags: UInt, optiondata: Long, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_NormalizeFileForPatchSignature(filebuffer.toCPointer<ByteVar>(), filesize, optionflags, optiondata.toCPointer<ByteVar>(), newfilecoffbase, newfilecofftime, ignorerangecount, ignorerangearray.toCPointer<ByteVar>(), retainrangecount, retainrangearray.toCPointer<ByteVar>())

public actual fun QueryActCtxSettingsW(dwflags: UInt, hactctx: HANDLE, settingsnamespace: PCWSTR, settingname: PCWSTR, pvbuffer: PWSTR, dwbuffer: ULong, pdwwrittenorrequired: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxSettingsW(dwflags, hactctx.toCPointer<ByteVar>(), settingsnamespace.toCPointer<ByteVar>(), settingname.toCPointer<ByteVar>(), pvbuffer.toCPointer<ByteVar>(), dwbuffer, pdwwrittenorrequired.toCPointer<ByteVar>())

public actual fun QueryActCtxW(dwflags: UInt, hactctx: HANDLE, pvsubinstance: Long, ulinfoclass: UInt, pvbuffer: Long, cbbuffer: ULong, pcbwrittenorrequired: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxW(dwflags, hactctx.toCPointer<ByteVar>(), pvsubinstance.toCPointer<ByteVar>(), ulinfoclass, pvbuffer.toCPointer<ByteVar>(), cbbuffer, pcbwrittenorrequired.toCPointer<ByteVar>())

public actual fun ReleaseActCtx(hactctx: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ReleaseActCtx(hactctx.toCPointer<ByteVar>())
}

public actual fun SfcGetNextProtectedFile(rpchandle: HANDLE, protfiledata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_SfcGetNextProtectedFile(rpchandle.toCPointer<ByteVar>(), protfiledata.toCPointer<ByteVar>())

public actual fun SfcIsFileProtected(rpchandle: HANDLE, protfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsFileProtected(rpchandle.toCPointer<ByteVar>(), protfilename.toCPointer<ByteVar>())

public actual fun SfcIsKeyProtected(keyhandle: HKEY, subkeyname: PCWSTR, keysam: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsKeyProtected(keyhandle.toCPointer<ByteVar>(), subkeyname.toCPointer<ByteVar>(), keysam)

public actual fun SfpVerifyFile(pszfilename: PCSTR, pszerror: PCSTR, dwerrsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_SfpVerifyFile(pszfilename.toCPointer<ByteVar>(), pszerror.toCPointer<ByteVar>(), dwerrsize)

public actual fun TestApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, applyoptionflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileA(patchfilename.toCPointer<ByteVar>(), oldfilename.toCPointer<ByteVar>(), applyoptionflags)

public actual fun TestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: UInt, oldfilebuffer: Long, oldfilesize: UInt, newfilesize: Long, applyoptionflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByBuffers(patchfilebuffer.toCPointer<ByteVar>(), patchfilesize, oldfilebuffer.toCPointer<ByteVar>(), oldfilesize, newfilesize.toCPointer<ByteVar>(), applyoptionflags)

public actual fun TestApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByHandles(patchfilehandle.toCPointer<ByteVar>(), oldfilehandle.toCPointer<ByteVar>(), applyoptionflags)

public actual fun TestApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileW(patchfilename.toCPointer<ByteVar>(), oldfilename.toCPointer<ByteVar>(), applyoptionflags)

public actual fun ZombifyActCtx(hactctx: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing.cinterop.windowssys_windows_win32_system_applicationinstallationandservicing_ZombifyActCtx(hactctx.toCPointer<ByteVar>())
