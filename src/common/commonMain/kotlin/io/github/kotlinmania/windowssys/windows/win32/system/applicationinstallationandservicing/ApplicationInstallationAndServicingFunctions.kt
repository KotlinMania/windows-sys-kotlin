package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ALG_ID
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY

public fun interface FnCallback {
    public operator fun invoke(callbackcontext: Long, currentposition: UInt, maximumposition: UInt): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(pvcontext: Long, imessagetype: UInt, szmessage: PCSTR): Int
}

public fun interface FnCallback2 {
    public operator fun invoke(pvcontext: Long, imessagetype: UInt, hrecord: MSIHANDLE): Int
}

public fun interface FnCallback3 {
    public operator fun invoke(pvcontext: Long, imessagetype: UInt, szmessage: PCWSTR): Int
}

public fun ActivateActCtx(hactctx: HANDLE, lpcookie: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ActivateActCtx", longArrayOf(hactctx, lpcookie)).toInt()
}

public fun AddRefActCtx(hactctx: HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "AddRefActCtx", longArrayOf(hactctx))
}

public fun ApplyDeltaA(applyflags: Long, lpsourcename: PCSTR, lpdeltaname: PCSTR, lptargetname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "ApplyDeltaA", longArrayOf(applyflags, lpsourcename, lpdeltaname, lptargetname)).toInt()
}

public fun ApplyDeltaB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "ApplyDeltaB", longArrayOf(applyflags, Win32DynamicFfi.objectSlot(source), Win32DynamicFfi.objectSlot(delta), lptarget)).toInt()
}

public fun ApplyDeltaGetReverseB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lpreversefiletime: Long, lptarget: Long, lptargetreverse: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "ApplyDeltaGetReverseB", longArrayOf(applyflags, Win32DynamicFfi.objectSlot(source), Win32DynamicFfi.objectSlot(delta), lpreversefiletime, lptarget, lptargetreverse)).toInt()
}

public fun ApplyDeltaProvidedB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long, utargetsize: ULong): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "ApplyDeltaProvidedB", longArrayOf(applyflags, Win32DynamicFfi.objectSlot(source), Win32DynamicFfi.objectSlot(delta), lptarget, utargetsize.toLong())).toInt()
}

public fun ApplyDeltaW(applyflags: Long, lpsourcename: PCWSTR, lpdeltaname: PCWSTR, lptargetname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "ApplyDeltaW", longArrayOf(applyflags, lpsourcename, lpdeltaname, lptargetname)).toInt()
}

public fun ApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "ApplyPatchToFileA", longArrayOf(patchfilename, oldfilename, newfilename, applyoptionflags.toLong())).toInt()
}

public fun ApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: UInt, oldfilemapped: Long, oldfilesize: UInt, newfilebuffer: Long, newfilebuffersize: UInt, newfileactualsize: Long, newfiletime: Long, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "ApplyPatchToFileByBuffers", longArrayOf(patchfilemapped, patchfilesize.toLong(), oldfilemapped, oldfilesize.toLong(), newfilebuffer, newfilebuffersize.toLong(), newfileactualsize, newfiletime, applyoptionflags.toLong(), Win32DynamicFfi.objectSlot(progresscallback), callbackcontext)).toInt()
}

public fun ApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "ApplyPatchToFileByHandles", longArrayOf(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags.toLong())).toInt()
}

public fun ApplyPatchToFileByHandlesEx(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "ApplyPatchToFileByHandlesEx", longArrayOf(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags.toLong(), Win32DynamicFfi.objectSlot(progresscallback), callbackcontext)).toInt()
}

public fun ApplyPatchToFileExA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "ApplyPatchToFileExA", longArrayOf(patchfilename, oldfilename, newfilename, applyoptionflags.toLong(), Win32DynamicFfi.objectSlot(progresscallback), callbackcontext)).toInt()
}

public fun ApplyPatchToFileExW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "ApplyPatchToFileExW", longArrayOf(patchfilename, oldfilename, newfilename, applyoptionflags.toLong(), Win32DynamicFfi.objectSlot(progresscallback), callbackcontext)).toInt()
}

public fun ApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "ApplyPatchToFileW", longArrayOf(patchfilename, oldfilename, newfilename, applyoptionflags.toLong())).toInt()
}

public fun CreateActCtxA(pactctx: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateActCtxA", longArrayOf(pactctx))
}

public fun CreateActCtxW(pactctx: Long): HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreateActCtxW", longArrayOf(pactctx))
}

public fun CreateDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCSTR, lptargetname: PCSTR, lpsourceoptionsname: PCSTR, lptargetoptionsname: PCSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "CreateDeltaA", longArrayOf(filetypeset, setflags, resetflags, lpsourcename, lptargetname, lpsourceoptionsname, lptargetoptionsname, Win32DynamicFfi.objectSlot(globaloptions), lptargetfiletime, hashalgid.toLong(), lpdeltaname)).toInt()
}

public fun CreateDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DELTA_INPUT, target: DELTA_INPUT, sourceoptions: DELTA_INPUT, targetoptions: DELTA_INPUT, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdelta: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "CreateDeltaB", longArrayOf(filetypeset, setflags, resetflags, Win32DynamicFfi.objectSlot(source), Win32DynamicFfi.objectSlot(target), Win32DynamicFfi.objectSlot(sourceoptions), Win32DynamicFfi.objectSlot(targetoptions), Win32DynamicFfi.objectSlot(globaloptions), lptargetfiletime, hashalgid.toLong(), lpdelta)).toInt()
}

public fun CreateDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCWSTR, lptargetname: PCWSTR, lpsourceoptionsname: PCWSTR, lptargetoptionsname: PCWSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "CreateDeltaW", longArrayOf(filetypeset, setflags, resetflags, lpsourcename, lptargetname, lpsourceoptionsname, lptargetoptionsname, Win32DynamicFfi.objectSlot(globaloptions), lptargetfiletime, hashalgid.toLong(), lpdeltaname)).toInt()
}

public fun CreatePatchFileA(oldfilename: PCSTR, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "CreatePatchFileA", longArrayOf(oldfilename, newfilename, patchfilename, optionflags.toLong(), optiondata)).toInt()
}

public fun CreatePatchFileByHandles(oldfilehandle: HANDLE, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "CreatePatchFileByHandles", longArrayOf(oldfilehandle, newfilehandle, patchfilehandle, optionflags.toLong(), optiondata)).toInt()
}

public fun CreatePatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: Long, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "CreatePatchFileByHandlesEx", longArrayOf(oldfilecount.toLong(), oldfileinfoarray, newfilehandle, patchfilehandle, optionflags.toLong(), optiondata, Win32DynamicFfi.objectSlot(progresscallback), callbackcontext)).toInt()
}

public fun CreatePatchFileExA(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "CreatePatchFileExA", longArrayOf(oldfilecount.toLong(), oldfileinfoarray, newfilename, patchfilename, optionflags.toLong(), optiondata, Win32DynamicFfi.objectSlot(progresscallback), callbackcontext)).toInt()
}

public fun CreatePatchFileExW(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "CreatePatchFileExW", longArrayOf(oldfilecount.toLong(), oldfileinfoarray, newfilename, patchfilename, optionflags.toLong(), optiondata, Win32DynamicFfi.objectSlot(progresscallback), callbackcontext)).toInt()
}

public fun CreatePatchFileW(oldfilename: PCWSTR, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "CreatePatchFileW", longArrayOf(oldfilename, newfilename, patchfilename, optionflags.toLong(), optiondata)).toInt()
}

public fun DeactivateActCtx(dwflags: UInt, ulcookie: ULong): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "DeactivateActCtx", longArrayOf(dwflags.toLong(), ulcookie.toLong())).toInt()
}

public fun DeltaFree(lpmemory: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "DeltaFree", longArrayOf(lpmemory)).toInt()
}

public fun DeltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DELTA_INPUT, lpsource: Long, usourcesize: ULong): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "DeltaNormalizeProvidedB", longArrayOf(filetypeset, normalizeflags, Win32DynamicFfi.objectSlot(normalizeoptions), lpsource, usourcesize.toLong())).toInt()
}

public fun ExtractPatchHeaderToFileA(patchfilename: PCSTR, patchheaderfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "ExtractPatchHeaderToFileA", longArrayOf(patchfilename, patchheaderfilename)).toInt()
}

public fun ExtractPatchHeaderToFileByHandles(patchfilehandle: HANDLE, patchheaderfilehandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "ExtractPatchHeaderToFileByHandles", longArrayOf(patchfilehandle, patchheaderfilehandle)).toInt()
}

public fun ExtractPatchHeaderToFileW(patchfilename: PCWSTR, patchheaderfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("mspatchc.dll", "ExtractPatchHeaderToFileW", longArrayOf(patchfilename, patchheaderfilename)).toInt()
}

public fun FindActCtxSectionGuid(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpguidtofind: Long, returneddata: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindActCtxSectionGuid", longArrayOf(dwflags.toLong(), lpextensionguid, ulsectionid.toLong(), lpguidtofind, returneddata)).toInt()
}

public fun FindActCtxSectionStringA(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCSTR, returneddata: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindActCtxSectionStringA", longArrayOf(dwflags.toLong(), lpextensionguid, ulsectionid.toLong(), lpstringtofind, returneddata)).toInt()
}

public fun FindActCtxSectionStringW(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCWSTR, returneddata: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindActCtxSectionStringW", longArrayOf(dwflags.toLong(), lpextensionguid, ulsectionid.toLong(), lpstringtofind, returneddata)).toInt()
}

public fun GetCurrentActCtx(lphactctx: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentActCtx", longArrayOf(lphactctx)).toInt()
}

public fun GetDeltaInfoA(lpdeltaname: PCSTR, lpheaderinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "GetDeltaInfoA", longArrayOf(lpdeltaname, lpheaderinfo)).toInt()
}

public fun GetDeltaInfoB(delta: DELTA_INPUT, lpheaderinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "GetDeltaInfoB", longArrayOf(Win32DynamicFfi.objectSlot(delta), lpheaderinfo)).toInt()
}

public fun GetDeltaInfoW(lpdeltaname: PCWSTR, lpheaderinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "GetDeltaInfoW", longArrayOf(lpdeltaname, lpheaderinfo)).toInt()
}

public fun GetDeltaSignatureA(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCSTR, lphash: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "GetDeltaSignatureA", longArrayOf(filetypeset, hashalgid.toLong(), lpsourcename, lphash)).toInt()
}

public fun GetDeltaSignatureB(filetypeset: Long, hashalgid: ALG_ID, source: DELTA_INPUT, lphash: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "GetDeltaSignatureB", longArrayOf(filetypeset, hashalgid.toLong(), Win32DynamicFfi.objectSlot(source), lphash)).toInt()
}

public fun GetDeltaSignatureW(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCWSTR, lphash: Long): BOOL {
    return Win32DynamicFfi.invoke("msdelta.dll", "GetDeltaSignatureW", longArrayOf(filetypeset, hashalgid.toLong(), lpsourcename, lphash)).toInt()
}

public fun GetFilePatchSignatureA(filename: PCSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "GetFilePatchSignatureA", longArrayOf(filename, optionflags.toLong(), optiondata, ignorerangecount.toLong(), ignorerangearray, retainrangecount.toLong(), retainrangearray, signaturebuffersize.toLong(), signaturebuffer)).toInt()
}

public fun GetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: UInt, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "GetFilePatchSignatureByBuffer", longArrayOf(filebufferwritable, filesize.toLong(), optionflags.toLong(), optiondata, ignorerangecount.toLong(), ignorerangearray, retainrangecount.toLong(), retainrangearray, signaturebuffersize.toLong(), signaturebuffer)).toInt()
}

public fun GetFilePatchSignatureByHandle(filehandle: HANDLE, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "GetFilePatchSignatureByHandle", longArrayOf(filehandle, optionflags.toLong(), optiondata, ignorerangecount.toLong(), ignorerangearray, retainrangecount.toLong(), retainrangearray, signaturebuffersize.toLong(), signaturebuffer)).toInt()
}

public fun GetFilePatchSignatureW(filename: PCWSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "GetFilePatchSignatureW", longArrayOf(filename, optionflags.toLong(), optiondata, ignorerangecount.toLong(), ignorerangearray, retainrangecount.toLong(), retainrangearray, signaturebuffersize.toLong(), signaturebuffer)).toInt()
}

public fun MsiAdvertiseProductA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiAdvertiseProductA", longArrayOf(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toLong())).toUInt()
}

public fun MsiAdvertiseProductExA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiAdvertiseProductExA", longArrayOf(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toLong(), dwplatform.toLong(), dwoptions.toLong())).toUInt()
}

public fun MsiAdvertiseProductExW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiAdvertiseProductExW", longArrayOf(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toLong(), dwplatform.toLong(), dwoptions.toLong())).toUInt()
}

public fun MsiAdvertiseProductW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiAdvertiseProductW", longArrayOf(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toLong())).toUInt()
}

public fun MsiAdvertiseScriptA(szscriptfile: PCSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiAdvertiseScriptA", longArrayOf(szscriptfile, dwflags.toLong(), phregdata, fremoveitems.toLong())).toUInt()
}

public fun MsiAdvertiseScriptW(szscriptfile: PCWSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiAdvertiseScriptW", longArrayOf(szscriptfile, dwflags.toLong(), phregdata, fremoveitems.toLong())).toUInt()
}

public fun MsiApplyMultiplePatchesA(szpatchpackages: PCSTR, szproductcode: PCSTR, szpropertieslist: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiApplyMultiplePatchesA", longArrayOf(szpatchpackages, szproductcode, szpropertieslist)).toUInt()
}

public fun MsiApplyMultiplePatchesW(szpatchpackages: PCWSTR, szproductcode: PCWSTR, szpropertieslist: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiApplyMultiplePatchesW", longArrayOf(szpatchpackages, szproductcode, szpropertieslist)).toUInt()
}

public fun MsiApplyPatchA(szpatchpackage: PCSTR, szinstallpackage: PCSTR, einstalltype: INSTALLTYPE, szcommandline: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiApplyPatchA", longArrayOf(szpatchpackage, szinstallpackage, einstalltype.toLong(), szcommandline)).toUInt()
}

public fun MsiApplyPatchW(szpatchpackage: PCWSTR, szinstallpackage: PCWSTR, einstalltype: INSTALLTYPE, szcommandline: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiApplyPatchW", longArrayOf(szpatchpackage, szinstallpackage, einstalltype.toLong(), szcommandline)).toUInt()
}

public fun MsiBeginTransactionA(szname: PCSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiBeginTransactionA", longArrayOf(szname, dwtransactionattributes.toLong(), phtransactionhandle, phchangeofownerevent)).toUInt()
}

public fun MsiBeginTransactionW(szname: PCWSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiBeginTransactionW", longArrayOf(szname, dwtransactionattributes.toLong(), phtransactionhandle, phchangeofownerevent)).toUInt()
}

public fun MsiCloseAllHandles(): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiCloseAllHandles", longArrayOf()).toUInt()
}

public fun MsiCloseHandle(hany: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiCloseHandle", longArrayOf(hany.toLong())).toUInt()
}

public fun MsiCollectUserInfoA(szproduct: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiCollectUserInfoA", longArrayOf(szproduct)).toUInt()
}

public fun MsiCollectUserInfoW(szproduct: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiCollectUserInfoW", longArrayOf(szproduct)).toUInt()
}

public fun MsiConfigureFeatureA(szproduct: PCSTR, szfeature: PCSTR, einstallstate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiConfigureFeatureA", longArrayOf(szproduct, szfeature, einstallstate.toLong())).toUInt()
}

public fun MsiConfigureFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, einstallstate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiConfigureFeatureW", longArrayOf(szproduct, szfeature, einstallstate.toLong())).toUInt()
}

public fun MsiConfigureProductA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiConfigureProductA", longArrayOf(szproduct, iinstalllevel.toLong(), einstallstate.toLong())).toUInt()
}

public fun MsiConfigureProductExA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiConfigureProductExA", longArrayOf(szproduct, iinstalllevel.toLong(), einstallstate.toLong(), szcommandline)).toUInt()
}

public fun MsiConfigureProductExW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiConfigureProductExW", longArrayOf(szproduct, iinstalllevel.toLong(), einstallstate.toLong(), szcommandline)).toUInt()
}

public fun MsiConfigureProductW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiConfigureProductW", longArrayOf(szproduct, iinstalllevel.toLong(), einstallstate.toLong())).toUInt()
}

public fun MsiCreateRecord(cparams: UInt): MSIHANDLE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiCreateRecord", longArrayOf(cparams.toLong())).toUInt()
}

public fun MsiCreateTransformSummaryInfoA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiCreateTransformSummaryInfoA", longArrayOf(hdatabase.toLong(), hdatabasereference.toLong(), sztransformfile, ierrorconditions.toLong(), ivalidation.toLong())).toUInt()
}

public fun MsiCreateTransformSummaryInfoW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiCreateTransformSummaryInfoW", longArrayOf(hdatabase.toLong(), hdatabasereference.toLong(), sztransformfile, ierrorconditions.toLong(), ivalidation.toLong())).toUInt()
}

public fun MsiDatabaseApplyTransformA(hdatabase: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseApplyTransformA", longArrayOf(hdatabase.toLong(), sztransformfile, ierrorconditions.toLong())).toUInt()
}

public fun MsiDatabaseApplyTransformW(hdatabase: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseApplyTransformW", longArrayOf(hdatabase.toLong(), sztransformfile, ierrorconditions.toLong())).toUInt()
}

public fun MsiDatabaseCommit(hdatabase: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseCommit", longArrayOf(hdatabase.toLong())).toUInt()
}

public fun MsiDatabaseExportA(hdatabase: MSIHANDLE, sztablename: PCSTR, szfolderpath: PCSTR, szfilename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseExportA", longArrayOf(hdatabase.toLong(), sztablename, szfolderpath, szfilename)).toUInt()
}

public fun MsiDatabaseExportW(hdatabase: MSIHANDLE, sztablename: PCWSTR, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseExportW", longArrayOf(hdatabase.toLong(), sztablename, szfolderpath, szfilename)).toUInt()
}

public fun MsiDatabaseGenerateTransformA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ireserved1: Int, ireserved2: Int): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseGenerateTransformA", longArrayOf(hdatabase.toLong(), hdatabasereference.toLong(), sztransformfile, ireserved1.toLong(), ireserved2.toLong())).toUInt()
}

public fun MsiDatabaseGenerateTransformW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ireserved1: Int, ireserved2: Int): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseGenerateTransformW", longArrayOf(hdatabase.toLong(), hdatabasereference.toLong(), sztransformfile, ireserved1.toLong(), ireserved2.toLong())).toUInt()
}

public fun MsiDatabaseGetPrimaryKeysA(hdatabase: MSIHANDLE, sztablename: PCSTR, phrecord: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseGetPrimaryKeysA", longArrayOf(hdatabase.toLong(), sztablename, phrecord)).toUInt()
}

public fun MsiDatabaseGetPrimaryKeysW(hdatabase: MSIHANDLE, sztablename: PCWSTR, phrecord: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseGetPrimaryKeysW", longArrayOf(hdatabase.toLong(), sztablename, phrecord)).toUInt()
}

public fun MsiDatabaseImportA(hdatabase: MSIHANDLE, szfolderpath: PCSTR, szfilename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseImportA", longArrayOf(hdatabase.toLong(), szfolderpath, szfilename)).toUInt()
}

public fun MsiDatabaseImportW(hdatabase: MSIHANDLE, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseImportW", longArrayOf(hdatabase.toLong(), szfolderpath, szfilename)).toUInt()
}

public fun MsiDatabaseIsTablePersistentA(hdatabase: MSIHANDLE, sztablename: PCSTR): MSICONDITION {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseIsTablePersistentA", longArrayOf(hdatabase.toLong(), sztablename)).toInt()
}

public fun MsiDatabaseIsTablePersistentW(hdatabase: MSIHANDLE, sztablename: PCWSTR): MSICONDITION {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseIsTablePersistentW", longArrayOf(hdatabase.toLong(), sztablename)).toInt()
}

public fun MsiDatabaseMergeA(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseMergeA", longArrayOf(hdatabase.toLong(), hdatabasemerge.toLong(), sztablename)).toUInt()
}

public fun MsiDatabaseMergeW(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseMergeW", longArrayOf(hdatabase.toLong(), hdatabasemerge.toLong(), sztablename)).toUInt()
}

public fun MsiDatabaseOpenViewA(hdatabase: MSIHANDLE, szquery: PCSTR, phview: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseOpenViewA", longArrayOf(hdatabase.toLong(), szquery, phview)).toUInt()
}

public fun MsiDatabaseOpenViewW(hdatabase: MSIHANDLE, szquery: PCWSTR, phview: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDatabaseOpenViewW", longArrayOf(hdatabase.toLong(), szquery, phview)).toUInt()
}

public fun MsiDetermineApplicablePatchesA(szproductpackagepath: PCSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDetermineApplicablePatchesA", longArrayOf(szproductpackagepath, cpatchinfo.toLong(), ppatchinfo)).toUInt()
}

public fun MsiDetermineApplicablePatchesW(szproductpackagepath: PCWSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDetermineApplicablePatchesW", longArrayOf(szproductpackagepath, cpatchinfo.toLong(), ppatchinfo)).toUInt()
}

public fun MsiDeterminePatchSequenceA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDeterminePatchSequenceA", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), cpatchinfo.toLong(), ppatchinfo)).toUInt()
}

public fun MsiDeterminePatchSequenceW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDeterminePatchSequenceW", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), cpatchinfo.toLong(), ppatchinfo)).toUInt()
}

public fun MsiDoActionA(hinstall: MSIHANDLE, szaction: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDoActionA", longArrayOf(hinstall.toLong(), szaction)).toUInt()
}

public fun MsiDoActionW(hinstall: MSIHANDLE, szaction: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiDoActionW", longArrayOf(hinstall.toLong(), szaction)).toUInt()
}

public fun MsiEnableLogA(dwlogmode: UInt, szlogfile: PCSTR, dwlogattributes: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnableLogA", longArrayOf(dwlogmode.toLong(), szlogfile, dwlogattributes.toLong())).toUInt()
}

public fun MsiEnableLogW(dwlogmode: UInt, szlogfile: PCWSTR, dwlogattributes: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnableLogW", longArrayOf(dwlogmode.toLong(), szlogfile, dwlogattributes.toLong())).toUInt()
}

public fun MsiEnableUIPreview(hdatabase: MSIHANDLE, phpreview: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnableUIPreview", longArrayOf(hdatabase.toLong(), phpreview)).toUInt()
}

public fun MsiEndTransaction(dwtransactionstate: MSITRANSACTIONSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEndTransaction", longArrayOf(dwtransactionstate.toLong())).toUInt()
}

public fun MsiEnumClientsA(szcomponent: PCSTR, iproductindex: UInt, lpproductbuf: PSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumClientsA", longArrayOf(szcomponent, iproductindex.toLong(), lpproductbuf)).toUInt()
}

public fun MsiEnumClientsExA(szcomponent: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumClientsExA", longArrayOf(szcomponent, szusersid, dwcontext.toLong(), dwproductindex.toLong(), szproductbuf, pdwinstalledcontext, szsid, pcchsid)).toUInt()
}

public fun MsiEnumClientsExW(szcomponent: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumClientsExW", longArrayOf(szcomponent, szusersid, dwcontext.toLong(), dwproductindex.toLong(), szproductbuf, pdwinstalledcontext, szsid, pcchsid)).toUInt()
}

public fun MsiEnumClientsW(szcomponent: PCWSTR, iproductindex: UInt, lpproductbuf: PWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumClientsW", longArrayOf(szcomponent, iproductindex.toLong(), lpproductbuf)).toUInt()
}

public fun MsiEnumComponentCostsA(hinstall: MSIHANDLE, szcomponent: PCSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentCostsA", longArrayOf(hinstall.toLong(), szcomponent, dwindex.toLong(), istate.toLong(), szdrivebuf, pcchdrivebuf, picost, pitempcost)).toUInt()
}

public fun MsiEnumComponentCostsW(hinstall: MSIHANDLE, szcomponent: PCWSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PWSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentCostsW", longArrayOf(hinstall.toLong(), szcomponent, dwindex.toLong(), istate.toLong(), szdrivebuf, pcchdrivebuf, picost, pitempcost)).toUInt()
}

public fun MsiEnumComponentQualifiersA(szcomponent: PCSTR, iindex: UInt, lpqualifierbuf: PSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PSTR, pcchapplicationdatabuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentQualifiersA", longArrayOf(szcomponent, iindex.toLong(), lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf)).toUInt()
}

public fun MsiEnumComponentQualifiersW(szcomponent: PCWSTR, iindex: UInt, lpqualifierbuf: PWSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PWSTR, pcchapplicationdatabuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentQualifiersW", longArrayOf(szcomponent, iindex.toLong(), lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf)).toUInt()
}

public fun MsiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: PSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentsA", longArrayOf(icomponentindex.toLong(), lpcomponentbuf)).toUInt()
}

public fun MsiEnumComponentsExA(szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentsExA", longArrayOf(szusersid, dwcontext.toLong(), dwindex.toLong(), szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid)).toUInt()
}

public fun MsiEnumComponentsExW(szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentsExW", longArrayOf(szusersid, dwcontext.toLong(), dwindex.toLong(), szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid)).toUInt()
}

public fun MsiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: PWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumComponentsW", longArrayOf(icomponentindex.toLong(), lpcomponentbuf)).toUInt()
}

public fun MsiEnumFeaturesA(szproduct: PCSTR, ifeatureindex: UInt, lpfeaturebuf: PSTR, lpparentbuf: PSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumFeaturesA", longArrayOf(szproduct, ifeatureindex.toLong(), lpfeaturebuf, lpparentbuf)).toUInt()
}

public fun MsiEnumFeaturesW(szproduct: PCWSTR, ifeatureindex: UInt, lpfeaturebuf: PWSTR, lpparentbuf: PWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumFeaturesW", longArrayOf(szproduct, ifeatureindex.toLong(), lpfeaturebuf, lpparentbuf)).toUInt()
}

public fun MsiEnumPatchesA(szproduct: PCSTR, ipatchindex: UInt, lppatchbuf: PSTR, lptransformsbuf: PSTR, pcchtransformsbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumPatchesA", longArrayOf(szproduct, ipatchindex.toLong(), lppatchbuf, lptransformsbuf, pcchtransformsbuf)).toUInt()
}

public fun MsiEnumPatchesExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PSTR, sztargetproductcode: PSTR, pdwtargetproductcontext: Long, sztargetusersid: PSTR, pcchtargetusersid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumPatchesExA", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), dwfilter.toLong(), dwindex.toLong(), szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid)).toUInt()
}

public fun MsiEnumPatchesExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PWSTR, sztargetproductcode: PWSTR, pdwtargetproductcontext: Long, sztargetusersid: PWSTR, pcchtargetusersid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumPatchesExW", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), dwfilter.toLong(), dwindex.toLong(), szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid)).toUInt()
}

public fun MsiEnumPatchesW(szproduct: PCWSTR, ipatchindex: UInt, lppatchbuf: PWSTR, lptransformsbuf: PWSTR, pcchtransformsbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumPatchesW", longArrayOf(szproduct, ipatchindex.toLong(), lppatchbuf, lptransformsbuf, pcchtransformsbuf)).toUInt()
}

public fun MsiEnumProductsA(iproductindex: UInt, lpproductbuf: PSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumProductsA", longArrayOf(iproductindex.toLong(), lpproductbuf)).toUInt()
}

public fun MsiEnumProductsExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumProductsExA", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), dwindex.toLong(), szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid)).toUInt()
}

public fun MsiEnumProductsExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumProductsExW", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), dwindex.toLong(), szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid)).toUInt()
}

public fun MsiEnumProductsW(iproductindex: UInt, lpproductbuf: PWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumProductsW", longArrayOf(iproductindex.toLong(), lpproductbuf)).toUInt()
}

public fun MsiEnumRelatedProductsA(lpupgradecode: PCSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumRelatedProductsA", longArrayOf(lpupgradecode, dwreserved.toLong(), iproductindex.toLong(), lpproductbuf)).toUInt()
}

public fun MsiEnumRelatedProductsW(lpupgradecode: PCWSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEnumRelatedProductsW", longArrayOf(lpupgradecode, dwreserved.toLong(), iproductindex.toLong(), lpproductbuf)).toUInt()
}

public fun MsiEvaluateConditionA(hinstall: MSIHANDLE, szcondition: PCSTR): MSICONDITION {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEvaluateConditionA", longArrayOf(hinstall.toLong(), szcondition)).toInt()
}

public fun MsiEvaluateConditionW(hinstall: MSIHANDLE, szcondition: PCWSTR): MSICONDITION {
    return Win32DynamicFfi.invoke("msi.dll", "MsiEvaluateConditionW", longArrayOf(hinstall.toLong(), szcondition)).toInt()
}

public fun MsiExtractPatchXMLDataA(szpatchpath: PCSTR, dwreserved: UInt, szxmldata: PSTR, pcchxmldata: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiExtractPatchXMLDataA", longArrayOf(szpatchpath, dwreserved.toLong(), szxmldata, pcchxmldata)).toUInt()
}

public fun MsiExtractPatchXMLDataW(szpatchpath: PCWSTR, dwreserved: UInt, szxmldata: PWSTR, pcchxmldata: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiExtractPatchXMLDataW", longArrayOf(szpatchpath, dwreserved.toLong(), szxmldata, pcchxmldata)).toUInt()
}

public fun MsiFormatRecordA(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PSTR, pcchresultbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiFormatRecordA", longArrayOf(hinstall.toLong(), hrecord.toLong(), szresultbuf, pcchresultbuf)).toUInt()
}

public fun MsiFormatRecordW(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PWSTR, pcchresultbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiFormatRecordW", longArrayOf(hinstall.toLong(), hrecord.toLong(), szresultbuf, pcchresultbuf)).toUInt()
}

public fun MsiGetActiveDatabase(hinstall: MSIHANDLE): MSIHANDLE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetActiveDatabase", longArrayOf(hinstall.toLong())).toUInt()
}

public fun MsiGetComponentPathA(szproduct: PCSTR, szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetComponentPathA", longArrayOf(szproduct, szcomponent, lppathbuf, pcchbuf)).toInt()
}

public fun MsiGetComponentPathExA(szproductcode: PCSTR, szcomponentcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PSTR, pcchoutpathbuffer: Long): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetComponentPathExA", longArrayOf(szproductcode, szcomponentcode, szusersid, dwcontext.toLong(), lpoutpathbuffer, pcchoutpathbuffer)).toInt()
}

public fun MsiGetComponentPathExW(szproductcode: PCWSTR, szcomponentcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PWSTR, pcchoutpathbuffer: Long): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetComponentPathExW", longArrayOf(szproductcode, szcomponentcode, szusersid, dwcontext.toLong(), lpoutpathbuffer, pcchoutpathbuffer)).toInt()
}

public fun MsiGetComponentPathW(szproduct: PCWSTR, szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetComponentPathW", longArrayOf(szproduct, szcomponent, lppathbuf, pcchbuf)).toInt()
}

public fun MsiGetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, piinstalled: Long, piaction: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetComponentStateA", longArrayOf(hinstall.toLong(), szcomponent, piinstalled, piaction)).toUInt()
}

public fun MsiGetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, piinstalled: Long, piaction: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetComponentStateW", longArrayOf(hinstall.toLong(), szcomponent, piinstalled, piaction)).toUInt()
}

public fun MsiGetDatabaseState(hdatabase: MSIHANDLE): MSIDBSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetDatabaseState", longArrayOf(hdatabase.toLong())).toInt()
}

public fun MsiGetFeatureCostA(hinstall: MSIHANDLE, szfeature: PCSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureCostA", longArrayOf(hinstall.toLong(), szfeature, icosttree.toLong(), istate.toLong(), picost)).toUInt()
}

public fun MsiGetFeatureCostW(hinstall: MSIHANDLE, szfeature: PCWSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureCostW", longArrayOf(hinstall.toLong(), szfeature, icosttree.toLong(), istate.toLong(), picost)).toUInt()
}

public fun MsiGetFeatureInfoA(hproduct: MSIHANDLE, szfeature: PCSTR, lpattributes: Long, lptitlebuf: PSTR, pcchtitlebuf: Long, lphelpbuf: PSTR, pcchhelpbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureInfoA", longArrayOf(hproduct.toLong(), szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf)).toUInt()
}

public fun MsiGetFeatureInfoW(hproduct: MSIHANDLE, szfeature: PCWSTR, lpattributes: Long, lptitlebuf: PWSTR, pcchtitlebuf: Long, lphelpbuf: PWSTR, pcchhelpbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureInfoW", longArrayOf(hproduct.toLong(), szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf)).toUInt()
}

public fun MsiGetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, piinstalled: Long, piaction: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureStateA", longArrayOf(hinstall.toLong(), szfeature, piinstalled, piaction)).toUInt()
}

public fun MsiGetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, piinstalled: Long, piaction: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureStateW", longArrayOf(hinstall.toLong(), szfeature, piinstalled, piaction)).toUInt()
}

public fun MsiGetFeatureUsageA(szproduct: PCSTR, szfeature: PCSTR, pdwusecount: Long, pwdateused: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureUsageA", longArrayOf(szproduct, szfeature, pdwusecount, pwdateused)).toUInt()
}

public fun MsiGetFeatureUsageW(szproduct: PCWSTR, szfeature: PCWSTR, pdwusecount: Long, pwdateused: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureUsageW", longArrayOf(szproduct, szfeature, pdwusecount, pwdateused)).toUInt()
}

public fun MsiGetFeatureValidStatesA(hinstall: MSIHANDLE, szfeature: PCSTR, lpinstallstates: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureValidStatesA", longArrayOf(hinstall.toLong(), szfeature, lpinstallstates)).toUInt()
}

public fun MsiGetFeatureValidStatesW(hinstall: MSIHANDLE, szfeature: PCWSTR, lpinstallstates: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFeatureValidStatesW", longArrayOf(hinstall.toLong(), szfeature, lpinstallstates)).toUInt()
}

public fun MsiGetFileHashA(szfilepath: PCSTR, dwoptions: UInt, phash: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFileHashA", longArrayOf(szfilepath, dwoptions.toLong(), phash)).toUInt()
}

public fun MsiGetFileHashW(szfilepath: PCWSTR, dwoptions: UInt, phash: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFileHashW", longArrayOf(szfilepath, dwoptions.toLong(), phash)).toUInt()
}

public fun MsiGetFileSignatureInformationA(szsignedobjectpath: PCSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFileSignatureInformationA", longArrayOf(szsignedobjectpath, dwflags.toLong(), ppccertcontext, pbhashdata, pcbhashdata)).toInt()
}

public fun MsiGetFileSignatureInformationW(szsignedobjectpath: PCWSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFileSignatureInformationW", longArrayOf(szsignedobjectpath, dwflags.toLong(), ppccertcontext, pbhashdata, pcbhashdata)).toInt()
}

public fun MsiGetFileVersionA(szfilepath: PCSTR, lpversionbuf: PSTR, pcchversionbuf: Long, lplangbuf: PSTR, pcchlangbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFileVersionA", longArrayOf(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf)).toUInt()
}

public fun MsiGetFileVersionW(szfilepath: PCWSTR, lpversionbuf: PWSTR, pcchversionbuf: Long, lplangbuf: PWSTR, pcchlangbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetFileVersionW", longArrayOf(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf)).toUInt()
}

public fun MsiGetLanguage(hinstall: MSIHANDLE): UShort {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetLanguage", longArrayOf(hinstall.toLong())).toUShort()
}

public fun MsiGetLastErrorRecord(): MSIHANDLE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetLastErrorRecord", longArrayOf()).toUInt()
}

public fun MsiGetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE): BOOL {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetMode", longArrayOf(hinstall.toLong(), erunmode.toLong())).toInt()
}

public fun MsiGetPatchFileListA(szproductcode: PCSTR, szpatchpackages: PCSTR, pcfiles: Long, pphfilerecords: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPatchFileListA", longArrayOf(szproductcode, szpatchpackages, pcfiles, pphfilerecords)).toUInt()
}

public fun MsiGetPatchFileListW(szproductcode: PCWSTR, szpatchpackages: PCWSTR, pcfiles: Long, pphfilerecords: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPatchFileListW", longArrayOf(szproductcode, szpatchpackages, pcfiles, pphfilerecords)).toUInt()
}

public fun MsiGetPatchInfoA(szpatch: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPatchInfoA", longArrayOf(szpatch, szattribute, lpvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetPatchInfoExA(szpatchcode: PCSTR, szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, lpvalue: PSTR, pcchvalue: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPatchInfoExA", longArrayOf(szpatchcode, szproductcode, szusersid, dwcontext.toLong(), szproperty, lpvalue, pcchvalue)).toUInt()
}

public fun MsiGetPatchInfoExW(szpatchcode: PCWSTR, szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, lpvalue: PWSTR, pcchvalue: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPatchInfoExW", longArrayOf(szpatchcode, szproductcode, szusersid, dwcontext.toLong(), szproperty, lpvalue, pcchvalue)).toUInt()
}

public fun MsiGetPatchInfoW(szpatch: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPatchInfoW", longArrayOf(szpatch, szattribute, lpvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetProductCodeA(szcomponent: PCSTR, lpbuf39: PSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductCodeA", longArrayOf(szcomponent, lpbuf39)).toUInt()
}

public fun MsiGetProductCodeW(szcomponent: PCWSTR, lpbuf39: PWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductCodeW", longArrayOf(szcomponent, lpbuf39)).toUInt()
}

public fun MsiGetProductInfoA(szproduct: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductInfoA", longArrayOf(szproduct, szattribute, lpvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetProductInfoExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductInfoExA", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), szproperty, szvalue, pcchvalue)).toUInt()
}

public fun MsiGetProductInfoExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductInfoExW", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), szproperty, szvalue, pcchvalue)).toUInt()
}

public fun MsiGetProductInfoFromScriptA(szscriptfile: PCSTR, lpproductbuf39: PSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PSTR, pcchnamebuf: Long, lppackagebuf: PSTR, pcchpackagebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductInfoFromScriptA", longArrayOf(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf)).toUInt()
}

public fun MsiGetProductInfoFromScriptW(szscriptfile: PCWSTR, lpproductbuf39: PWSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PWSTR, pcchnamebuf: Long, lppackagebuf: PWSTR, pcchpackagebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductInfoFromScriptW", longArrayOf(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf)).toUInt()
}

public fun MsiGetProductInfoW(szproduct: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductInfoW", longArrayOf(szproduct, szattribute, lpvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetProductPropertyA(hproduct: MSIHANDLE, szproperty: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductPropertyA", longArrayOf(hproduct.toLong(), szproperty, lpvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetProductPropertyW(hproduct: MSIHANDLE, szproperty: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetProductPropertyW", longArrayOf(hproduct.toLong(), szproperty, lpvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPropertyA", longArrayOf(hinstall.toLong(), szname, szvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetPropertyW", longArrayOf(hinstall.toLong(), szname, szvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiGetShortcutTargetA(szshortcutpath: PCSTR, szproductcode: PSTR, szfeatureid: PSTR, szcomponentcode: PSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetShortcutTargetA", longArrayOf(szshortcutpath, szproductcode, szfeatureid, szcomponentcode)).toUInt()
}

public fun MsiGetShortcutTargetW(szshortcutpath: PCWSTR, szproductcode: PWSTR, szfeatureid: PWSTR, szcomponentcode: PWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetShortcutTargetW", longArrayOf(szshortcutpath, szproductcode, szfeatureid, szcomponentcode)).toUInt()
}

public fun MsiGetSourcePathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetSourcePathA", longArrayOf(hinstall.toLong(), szfolder, szpathbuf, pcchpathbuf)).toUInt()
}

public fun MsiGetSourcePathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetSourcePathW", longArrayOf(hinstall.toLong(), szfolder, szpathbuf, pcchpathbuf)).toUInt()
}

public fun MsiGetSummaryInformationA(hdatabase: MSIHANDLE, szdatabasepath: PCSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetSummaryInformationA", longArrayOf(hdatabase.toLong(), szdatabasepath, uiupdatecount.toLong(), phsummaryinfo)).toUInt()
}

public fun MsiGetSummaryInformationW(hdatabase: MSIHANDLE, szdatabasepath: PCWSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetSummaryInformationW", longArrayOf(hdatabase.toLong(), szdatabasepath, uiupdatecount.toLong(), phsummaryinfo)).toUInt()
}

public fun MsiGetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetTargetPathA", longArrayOf(hinstall.toLong(), szfolder, szpathbuf, pcchpathbuf)).toUInt()
}

public fun MsiGetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetTargetPathW", longArrayOf(hinstall.toLong(), szfolder, szpathbuf, pcchpathbuf)).toUInt()
}

public fun MsiGetUserInfoA(szproduct: PCSTR, lpusernamebuf: PSTR, pcchusernamebuf: Long, lporgnamebuf: PSTR, pcchorgnamebuf: Long, lpserialbuf: PSTR, pcchserialbuf: Long): USERINFOSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetUserInfoA", longArrayOf(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf)).toInt()
}

public fun MsiGetUserInfoW(szproduct: PCWSTR, lpusernamebuf: PWSTR, pcchusernamebuf: Long, lporgnamebuf: PWSTR, pcchorgnamebuf: Long, lpserialbuf: PWSTR, pcchserialbuf: Long): USERINFOSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiGetUserInfoW", longArrayOf(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf)).toInt()
}

public fun MsiInstallMissingComponentA(szproduct: PCSTR, szcomponent: PCSTR, einstallstate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiInstallMissingComponentA", longArrayOf(szproduct, szcomponent, einstallstate.toLong())).toUInt()
}

public fun MsiInstallMissingComponentW(szproduct: PCWSTR, szcomponent: PCWSTR, einstallstate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiInstallMissingComponentW", longArrayOf(szproduct, szcomponent, einstallstate.toLong())).toUInt()
}

public fun MsiInstallMissingFileA(szproduct: PCSTR, szfile: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiInstallMissingFileA", longArrayOf(szproduct, szfile)).toUInt()
}

public fun MsiInstallMissingFileW(szproduct: PCWSTR, szfile: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiInstallMissingFileW", longArrayOf(szproduct, szfile)).toUInt()
}

public fun MsiInstallProductA(szpackagepath: PCSTR, szcommandline: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiInstallProductA", longArrayOf(szpackagepath, szcommandline)).toUInt()
}

public fun MsiInstallProductW(szpackagepath: PCWSTR, szcommandline: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiInstallProductW", longArrayOf(szpackagepath, szcommandline)).toUInt()
}

public fun MsiIsProductElevatedA(szproduct: PCSTR, pfelevated: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiIsProductElevatedA", longArrayOf(szproduct, pfelevated)).toUInt()
}

public fun MsiIsProductElevatedW(szproduct: PCWSTR, pfelevated: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiIsProductElevatedW", longArrayOf(szproduct, pfelevated)).toUInt()
}

public fun MsiJoinTransaction(htransactionhandle: MSIHANDLE, dwtransactionattributes: UInt, phchangeofownerevent: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiJoinTransaction", longArrayOf(htransactionhandle.toLong(), dwtransactionattributes.toLong(), phchangeofownerevent)).toUInt()
}

public fun MsiLocateComponentA(szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiLocateComponentA", longArrayOf(szcomponent, lppathbuf, pcchbuf)).toInt()
}

public fun MsiLocateComponentW(szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiLocateComponentW", longArrayOf(szcomponent, lppathbuf, pcchbuf)).toInt()
}

public fun MsiNotifySidChangeA(poldsid: PCSTR, pnewsid: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiNotifySidChangeA", longArrayOf(poldsid, pnewsid)).toUInt()
}

public fun MsiNotifySidChangeW(poldsid: PCWSTR, pnewsid: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiNotifySidChangeW", longArrayOf(poldsid, pnewsid)).toUInt()
}

public fun MsiOpenDatabaseA(szdatabasepath: PCSTR, szpersist: PCSTR, phdatabase: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenDatabaseA", longArrayOf(szdatabasepath, szpersist, phdatabase)).toUInt()
}

public fun MsiOpenDatabaseW(szdatabasepath: PCWSTR, szpersist: PCWSTR, phdatabase: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenDatabaseW", longArrayOf(szdatabasepath, szpersist, phdatabase)).toUInt()
}

public fun MsiOpenPackageA(szpackagepath: PCSTR, hproduct: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenPackageA", longArrayOf(szpackagepath, hproduct)).toUInt()
}

public fun MsiOpenPackageExA(szpackagepath: PCSTR, dwoptions: UInt, hproduct: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenPackageExA", longArrayOf(szpackagepath, dwoptions.toLong(), hproduct)).toUInt()
}

public fun MsiOpenPackageExW(szpackagepath: PCWSTR, dwoptions: UInt, hproduct: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenPackageExW", longArrayOf(szpackagepath, dwoptions.toLong(), hproduct)).toUInt()
}

public fun MsiOpenPackageW(szpackagepath: PCWSTR, hproduct: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenPackageW", longArrayOf(szpackagepath, hproduct)).toUInt()
}

public fun MsiOpenProductA(szproduct: PCSTR, hproduct: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenProductA", longArrayOf(szproduct, hproduct)).toUInt()
}

public fun MsiOpenProductW(szproduct: PCWSTR, hproduct: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiOpenProductW", longArrayOf(szproduct, hproduct)).toUInt()
}

public fun MsiPreviewBillboardA(hpreview: MSIHANDLE, szcontrolname: PCSTR, szbillboard: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiPreviewBillboardA", longArrayOf(hpreview.toLong(), szcontrolname, szbillboard)).toUInt()
}

public fun MsiPreviewBillboardW(hpreview: MSIHANDLE, szcontrolname: PCWSTR, szbillboard: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiPreviewBillboardW", longArrayOf(hpreview.toLong(), szcontrolname, szbillboard)).toUInt()
}

public fun MsiPreviewDialogA(hpreview: MSIHANDLE, szdialogname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiPreviewDialogA", longArrayOf(hpreview.toLong(), szdialogname)).toUInt()
}

public fun MsiPreviewDialogW(hpreview: MSIHANDLE, szdialogname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiPreviewDialogW", longArrayOf(hpreview.toLong(), szdialogname)).toUInt()
}

public fun MsiProcessAdvertiseScriptA(szscriptfile: PCSTR, sziconfolder: PCSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProcessAdvertiseScriptA", longArrayOf(szscriptfile, sziconfolder, hregdata, fshortcuts.toLong(), fremoveitems.toLong())).toUInt()
}

public fun MsiProcessAdvertiseScriptW(szscriptfile: PCWSTR, sziconfolder: PCWSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProcessAdvertiseScriptW", longArrayOf(szscriptfile, sziconfolder, hregdata, fshortcuts.toLong(), fremoveitems.toLong())).toUInt()
}

public fun MsiProcessMessage(hinstall: MSIHANDLE, emessagetype: INSTALLMESSAGE, hrecord: MSIHANDLE): Int {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProcessMessage", longArrayOf(hinstall.toLong(), emessagetype.toLong(), hrecord.toLong())).toInt()
}

public fun MsiProvideAssemblyA(szassemblyname: PCSTR, szappcontext: PCSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideAssemblyA", longArrayOf(szassemblyname, szappcontext, dwinstallmode.toLong(), dwassemblyinfo.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiProvideAssemblyW(szassemblyname: PCWSTR, szappcontext: PCWSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PWSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideAssemblyW", longArrayOf(szassemblyname, szappcontext, dwinstallmode.toLong(), dwassemblyinfo.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiProvideComponentA(szproduct: PCSTR, szfeature: PCSTR, szcomponent: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideComponentA", longArrayOf(szproduct, szfeature, szcomponent, dwinstallmode.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiProvideComponentW(szproduct: PCWSTR, szfeature: PCWSTR, szcomponent: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideComponentW", longArrayOf(szproduct, szfeature, szcomponent, dwinstallmode.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiProvideQualifiedComponentA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideQualifiedComponentA", longArrayOf(szcategory, szqualifier, dwinstallmode.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiProvideQualifiedComponentExA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, szproduct: PCSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideQualifiedComponentExA", longArrayOf(szcategory, szqualifier, dwinstallmode.toLong(), szproduct, dwunused1.toLong(), dwunused2.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiProvideQualifiedComponentExW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, szproduct: PCWSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideQualifiedComponentExW", longArrayOf(szcategory, szqualifier, dwinstallmode.toLong(), szproduct, dwunused1.toLong(), dwunused2.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiProvideQualifiedComponentW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiProvideQualifiedComponentW", longArrayOf(szcategory, szqualifier, dwinstallmode.toLong(), lppathbuf, pcchpathbuf)).toUInt()
}

public fun MsiQueryComponentStateA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCSTR, pdwstate: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryComponentStateA", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), szcomponentcode, pdwstate)).toUInt()
}

public fun MsiQueryComponentStateW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCWSTR, pdwstate: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryComponentStateW", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), szcomponentcode, pdwstate)).toUInt()
}

public fun MsiQueryFeatureStateA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryFeatureStateA", longArrayOf(szproduct, szfeature)).toInt()
}

public fun MsiQueryFeatureStateExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCSTR, pdwstate: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryFeatureStateExA", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), szfeature, pdwstate)).toUInt()
}

public fun MsiQueryFeatureStateExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCWSTR, pdwstate: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryFeatureStateExW", longArrayOf(szproductcode, szusersid, dwcontext.toLong(), szfeature, pdwstate)).toUInt()
}

public fun MsiQueryFeatureStateW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryFeatureStateW", longArrayOf(szproduct, szfeature)).toInt()
}

public fun MsiQueryProductStateA(szproduct: PCSTR): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryProductStateA", longArrayOf(szproduct)).toInt()
}

public fun MsiQueryProductStateW(szproduct: PCWSTR): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiQueryProductStateW", longArrayOf(szproduct)).toInt()
}

public fun MsiRecordClearData(hrecord: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordClearData", longArrayOf(hrecord.toLong())).toUInt()
}

public fun MsiRecordDataSize(hrecord: MSIHANDLE, ifield: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordDataSize", longArrayOf(hrecord.toLong(), ifield.toLong())).toUInt()
}

public fun MsiRecordGetFieldCount(hrecord: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordGetFieldCount", longArrayOf(hrecord.toLong())).toUInt()
}

public fun MsiRecordGetInteger(hrecord: MSIHANDLE, ifield: UInt): Int {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordGetInteger", longArrayOf(hrecord.toLong(), ifield.toLong())).toInt()
}

public fun MsiRecordGetStringA(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordGetStringA", longArrayOf(hrecord.toLong(), ifield.toLong(), szvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiRecordGetStringW(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordGetStringW", longArrayOf(hrecord.toLong(), ifield.toLong(), szvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiRecordIsNull(hrecord: MSIHANDLE, ifield: UInt): BOOL {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordIsNull", longArrayOf(hrecord.toLong(), ifield.toLong())).toInt()
}

public fun MsiRecordReadStream(hrecord: MSIHANDLE, ifield: UInt, szdatabuf: PSTR, pcbdatabuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordReadStream", longArrayOf(hrecord.toLong(), ifield.toLong(), szdatabuf, pcbdatabuf)).toUInt()
}

public fun MsiRecordSetInteger(hrecord: MSIHANDLE, ifield: UInt, ivalue: Int): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordSetInteger", longArrayOf(hrecord.toLong(), ifield.toLong(), ivalue.toLong())).toUInt()
}

public fun MsiRecordSetStreamA(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordSetStreamA", longArrayOf(hrecord.toLong(), ifield.toLong(), szfilepath)).toUInt()
}

public fun MsiRecordSetStreamW(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordSetStreamW", longArrayOf(hrecord.toLong(), ifield.toLong(), szfilepath)).toUInt()
}

public fun MsiRecordSetStringA(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordSetStringA", longArrayOf(hrecord.toLong(), ifield.toLong(), szvalue)).toUInt()
}

public fun MsiRecordSetStringW(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRecordSetStringW", longArrayOf(hrecord.toLong(), ifield.toLong(), szvalue)).toUInt()
}

public fun MsiReinstallFeatureA(szproduct: PCSTR, szfeature: PCSTR, dwreinstallmode: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiReinstallFeatureA", longArrayOf(szproduct, szfeature, dwreinstallmode.toLong())).toUInt()
}

public fun MsiReinstallFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, dwreinstallmode: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiReinstallFeatureW", longArrayOf(szproduct, szfeature, dwreinstallmode.toLong())).toUInt()
}

public fun MsiReinstallProductA(szproduct: PCSTR, szreinstallmode: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiReinstallProductA", longArrayOf(szproduct, szreinstallmode.toLong())).toUInt()
}

public fun MsiReinstallProductW(szproduct: PCWSTR, szreinstallmode: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiReinstallProductW", longArrayOf(szproduct, szreinstallmode.toLong())).toUInt()
}

public fun MsiRemovePatchesA(szpatchlist: PCSTR, szproductcode: PCSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRemovePatchesA", longArrayOf(szpatchlist, szproductcode, euninstalltype.toLong(), szpropertylist)).toUInt()
}

public fun MsiRemovePatchesW(szpatchlist: PCWSTR, szproductcode: PCWSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiRemovePatchesW", longArrayOf(szpatchlist, szproductcode, euninstalltype.toLong(), szpropertylist)).toUInt()
}

public fun MsiSequenceA(hinstall: MSIHANDLE, sztable: PCSTR, isequencemode: Int): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSequenceA", longArrayOf(hinstall.toLong(), sztable, isequencemode.toLong())).toUInt()
}

public fun MsiSequenceW(hinstall: MSIHANDLE, sztable: PCWSTR, isequencemode: Int): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSequenceW", longArrayOf(hinstall.toLong(), sztable, isequencemode.toLong())).toUInt()
}

public fun MsiSetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, istate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetComponentStateA", longArrayOf(hinstall.toLong(), szcomponent, istate.toLong())).toUInt()
}

public fun MsiSetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, istate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetComponentStateW", longArrayOf(hinstall.toLong(), szcomponent, istate.toLong())).toUInt()
}

public fun MsiSetExternalUIA(puihandler: INSTALLUI_HANDLERA, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERA {
    val rawRet = Win32DynamicFfi.invoke("msi.dll", "MsiSetExternalUIA", longArrayOf(Win32DynamicFfi.objectSlot(puihandler), dwmessagefilter.toLong(), pvcontext))
    return if (rawRet == 0L) null else INSTALLUI_HANDLERAFn { p0, p1, p2 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1.toLong(), p2)).toInt() }
}

public fun MsiSetExternalUIRecord(puihandler: PINSTALLUI_HANDLER_RECORD, dwmessagefilter: UInt, pvcontext: Long, ppuiprevhandler: PINSTALLUI_HANDLER_RECORD): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetExternalUIRecord", longArrayOf(Win32DynamicFfi.objectSlot(puihandler), dwmessagefilter.toLong(), pvcontext, Win32DynamicFfi.objectSlot(ppuiprevhandler))).toUInt()
}

public fun MsiSetExternalUIW(puihandler: INSTALLUI_HANDLERW, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERW {
    val rawRet = Win32DynamicFfi.invoke("msi.dll", "MsiSetExternalUIW", longArrayOf(Win32DynamicFfi.objectSlot(puihandler), dwmessagefilter.toLong(), pvcontext))
    return if (rawRet == 0L) null else INSTALLUI_HANDLERWFn { p0, p1, p2 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1.toLong(), p2)).toInt() }
}

public fun MsiSetFeatureAttributesA(hinstall: MSIHANDLE, szfeature: PCSTR, dwattributes: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetFeatureAttributesA", longArrayOf(hinstall.toLong(), szfeature, dwattributes.toLong())).toUInt()
}

public fun MsiSetFeatureAttributesW(hinstall: MSIHANDLE, szfeature: PCWSTR, dwattributes: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetFeatureAttributesW", longArrayOf(hinstall.toLong(), szfeature, dwattributes.toLong())).toUInt()
}

public fun MsiSetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, istate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetFeatureStateA", longArrayOf(hinstall.toLong(), szfeature, istate.toLong())).toUInt()
}

public fun MsiSetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, istate: INSTALLSTATE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetFeatureStateW", longArrayOf(hinstall.toLong(), szfeature, istate.toLong())).toUInt()
}

public fun MsiSetInstallLevel(hinstall: MSIHANDLE, iinstalllevel: Int): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetInstallLevel", longArrayOf(hinstall.toLong(), iinstalllevel.toLong())).toUInt()
}

public fun MsiSetInternalUI(dwuilevel: INSTALLUILEVEL, phwnd: Long): INSTALLUILEVEL {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetInternalUI", longArrayOf(dwuilevel.toLong(), phwnd)).toInt()
}

public fun MsiSetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE, fstate: BOOL): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetMode", longArrayOf(hinstall.toLong(), erunmode.toLong(), fstate.toLong())).toUInt()
}

public fun MsiSetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvalue: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetPropertyA", longArrayOf(hinstall.toLong(), szname, szvalue)).toUInt()
}

public fun MsiSetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvalue: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetPropertyW", longArrayOf(hinstall.toLong(), szname, szvalue)).toUInt()
}

public fun MsiSetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szfolderpath: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetTargetPathA", longArrayOf(hinstall.toLong(), szfolder, szfolderpath)).toUInt()
}

public fun MsiSetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szfolderpath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSetTargetPathW", longArrayOf(hinstall.toLong(), szfolder, szfolderpath)).toUInt()
}

public fun MsiSourceListAddMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCSTR, szdiskprompt: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListAddMediaDiskA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwdiskid.toLong(), szvolumelabel, szdiskprompt)).toUInt()
}

public fun MsiSourceListAddMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCWSTR, szdiskprompt: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListAddMediaDiskW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwdiskid.toLong(), szvolumelabel, szdiskprompt)).toUInt()
}

public fun MsiSourceListAddSourceA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt, szsource: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListAddSourceA", longArrayOf(szproduct, szusername, dwreserved.toLong(), szsource)).toUInt()
}

public fun MsiSourceListAddSourceExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR, dwindex: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListAddSourceExA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szsource, dwindex.toLong())).toUInt()
}

public fun MsiSourceListAddSourceExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR, dwindex: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListAddSourceExW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szsource, dwindex.toLong())).toUInt()
}

public fun MsiSourceListAddSourceW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt, szsource: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListAddSourceW", longArrayOf(szproduct, szusername, dwreserved.toLong(), szsource)).toUInt()
}

public fun MsiSourceListClearAllA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearAllA", longArrayOf(szproduct, szusername, dwreserved.toLong())).toUInt()
}

public fun MsiSourceListClearAllExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearAllExA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong())).toUInt()
}

public fun MsiSourceListClearAllExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearAllExW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong())).toUInt()
}

public fun MsiSourceListClearAllW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearAllW", longArrayOf(szproduct, szusername, dwreserved.toLong())).toUInt()
}

public fun MsiSourceListClearMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearMediaDiskA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwdiskid.toLong())).toUInt()
}

public fun MsiSourceListClearMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearMediaDiskW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwdiskid.toLong())).toUInt()
}

public fun MsiSourceListClearSourceA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearSourceA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szsource)).toUInt()
}

public fun MsiSourceListClearSourceW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListClearSourceW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szsource)).toUInt()
}

public fun MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PSTR, pcchvolumelabel: Long, szdiskprompt: PSTR, pcchdiskprompt: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListEnumMediaDisksA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwindex.toLong(), pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt)).toUInt()
}

public fun MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PWSTR, pcchvolumelabel: Long, szdiskprompt: PWSTR, pcchdiskprompt: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListEnumMediaDisksW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwindex.toLong(), pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt)).toUInt()
}

public fun MsiSourceListEnumSourcesA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PSTR, pcchsource: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListEnumSourcesA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwindex.toLong(), szsource, pcchsource)).toUInt()
}

public fun MsiSourceListEnumSourcesW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PWSTR, pcchsource: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListEnumSourcesW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), dwindex.toLong(), szsource, pcchsource)).toUInt()
}

public fun MsiSourceListForceResolutionA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListForceResolutionA", longArrayOf(szproduct, szusername, dwreserved.toLong())).toUInt()
}

public fun MsiSourceListForceResolutionExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListForceResolutionExA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong())).toUInt()
}

public fun MsiSourceListForceResolutionExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListForceResolutionExW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong())).toUInt()
}

public fun MsiSourceListForceResolutionW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListForceResolutionW", longArrayOf(szproduct, szusername, dwreserved.toLong())).toUInt()
}

public fun MsiSourceListGetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListGetInfoA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szproperty, szvalue, pcchvalue)).toUInt()
}

public fun MsiSourceListGetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListGetInfoW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szproperty, szvalue, pcchvalue)).toUInt()
}

public fun MsiSourceListSetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListSetInfoA", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szproperty, szvalue)).toUInt()
}

public fun MsiSourceListSetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSourceListSetInfoW", longArrayOf(szproductcodeorpatchcode, szusersid, dwcontext.toLong(), dwoptions.toLong(), szproperty, szvalue)).toUInt()
}

public fun MsiSummaryInfoGetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSummaryInfoGetPropertyA", longArrayOf(hsummaryinfo.toLong(), uiproperty.toLong(), puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiSummaryInfoGetPropertyCount(hsummaryinfo: MSIHANDLE, puipropertycount: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSummaryInfoGetPropertyCount", longArrayOf(hsummaryinfo.toLong(), puipropertycount)).toUInt()
}

public fun MsiSummaryInfoGetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSummaryInfoGetPropertyW", longArrayOf(hsummaryinfo.toLong(), uiproperty.toLong(), puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf)).toUInt()
}

public fun MsiSummaryInfoPersist(hsummaryinfo: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSummaryInfoPersist", longArrayOf(hsummaryinfo.toLong())).toUInt()
}

public fun MsiSummaryInfoSetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSummaryInfoSetPropertyA", longArrayOf(hsummaryinfo.toLong(), uiproperty.toLong(), uidatatype.toLong(), ivalue.toLong(), pftvalue, szvalue)).toUInt()
}

public fun MsiSummaryInfoSetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiSummaryInfoSetPropertyW", longArrayOf(hsummaryinfo.toLong(), uiproperty.toLong(), uidatatype.toLong(), ivalue.toLong(), pftvalue, szvalue)).toUInt()
}

public fun MsiUseFeatureA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiUseFeatureA", longArrayOf(szproduct, szfeature)).toInt()
}

public fun MsiUseFeatureExA(szproduct: PCSTR, szfeature: PCSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiUseFeatureExA", longArrayOf(szproduct, szfeature, dwinstallmode.toLong(), dwreserved.toLong())).toInt()
}

public fun MsiUseFeatureExW(szproduct: PCWSTR, szfeature: PCWSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiUseFeatureExW", longArrayOf(szproduct, szfeature, dwinstallmode.toLong(), dwreserved.toLong())).toInt()
}

public fun MsiUseFeatureW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE {
    return Win32DynamicFfi.invoke("msi.dll", "MsiUseFeatureW", longArrayOf(szproduct, szfeature)).toInt()
}

public fun MsiVerifyDiskSpace(hinstall: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiVerifyDiskSpace", longArrayOf(hinstall.toLong())).toUInt()
}

public fun MsiVerifyPackageA(szpackagepath: PCSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiVerifyPackageA", longArrayOf(szpackagepath)).toUInt()
}

public fun MsiVerifyPackageW(szpackagepath: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiVerifyPackageW", longArrayOf(szpackagepath)).toUInt()
}

public fun MsiViewClose(hview: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiViewClose", longArrayOf(hview.toLong())).toUInt()
}

public fun MsiViewExecute(hview: MSIHANDLE, hrecord: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiViewExecute", longArrayOf(hview.toLong(), hrecord.toLong())).toUInt()
}

public fun MsiViewFetch(hview: MSIHANDLE, phrecord: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiViewFetch", longArrayOf(hview.toLong(), phrecord)).toUInt()
}

public fun MsiViewGetColumnInfo(hview: MSIHANDLE, ecolumninfo: MSICOLINFO, phrecord: Long): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiViewGetColumnInfo", longArrayOf(hview.toLong(), ecolumninfo.toLong(), phrecord)).toUInt()
}

public fun MsiViewGetErrorA(hview: MSIHANDLE, szcolumnnamebuffer: PSTR, pcchbuf: Long): MSIDBERROR {
    return Win32DynamicFfi.invoke("msi.dll", "MsiViewGetErrorA", longArrayOf(hview.toLong(), szcolumnnamebuffer, pcchbuf)).toInt()
}

public fun MsiViewGetErrorW(hview: MSIHANDLE, szcolumnnamebuffer: PWSTR, pcchbuf: Long): MSIDBERROR {
    return Win32DynamicFfi.invoke("msi.dll", "MsiViewGetErrorW", longArrayOf(hview.toLong(), szcolumnnamebuffer, pcchbuf)).toInt()
}

public fun MsiViewModify(hview: MSIHANDLE, emodifymode: MSIMODIFY, hrecord: MSIHANDLE): UInt {
    return Win32DynamicFfi.invoke("msi.dll", "MsiViewModify", longArrayOf(hview.toLong(), emodifymode.toLong(), hrecord.toLong())).toUInt()
}

public fun NormalizeFileForPatchSignature(filebuffer: Long, filesize: UInt, optionflags: UInt, optiondata: Long, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long): Int {
    return Win32DynamicFfi.invoke("mspatcha.dll", "NormalizeFileForPatchSignature", longArrayOf(filebuffer, filesize.toLong(), optionflags.toLong(), optiondata, newfilecoffbase.toLong(), newfilecofftime.toLong(), ignorerangecount.toLong(), ignorerangearray, retainrangecount.toLong(), retainrangearray)).toInt()
}

public fun QueryActCtxSettingsW(dwflags: UInt, hactctx: HANDLE, settingsnamespace: PCWSTR, settingname: PCWSTR, pvbuffer: PWSTR, dwbuffer: ULong, pdwwrittenorrequired: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryActCtxSettingsW", longArrayOf(dwflags.toLong(), hactctx, settingsnamespace, settingname, pvbuffer, dwbuffer.toLong(), pdwwrittenorrequired)).toInt()
}

public fun QueryActCtxW(dwflags: UInt, hactctx: HANDLE, pvsubinstance: Long, ulinfoclass: UInt, pvbuffer: Long, cbbuffer: ULong, pcbwrittenorrequired: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryActCtxW", longArrayOf(dwflags.toLong(), hactctx, pvsubinstance, ulinfoclass.toLong(), pvbuffer, cbbuffer.toLong(), pcbwrittenorrequired)).toInt()
}

public fun ReleaseActCtx(hactctx: HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleaseActCtx", longArrayOf(hactctx))
}

public fun SfcGetNextProtectedFile(rpchandle: HANDLE, protfiledata: Long): BOOL {
    return Win32DynamicFfi.invoke("sfc.dll", "SfcGetNextProtectedFile", longArrayOf(rpchandle, protfiledata)).toInt()
}

public fun SfcIsFileProtected(rpchandle: HANDLE, protfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("sfc.dll", "SfcIsFileProtected", longArrayOf(rpchandle, protfilename)).toInt()
}

public fun SfcIsKeyProtected(keyhandle: HKEY, subkeyname: PCWSTR, keysam: UInt): BOOL {
    return Win32DynamicFfi.invoke("sfc.dll", "SfcIsKeyProtected", longArrayOf(keyhandle, subkeyname, keysam.toLong())).toInt()
}

public fun SfpVerifyFile(pszfilename: PCSTR, pszerror: PCSTR, dwerrsize: UInt): BOOL {
    return Win32DynamicFfi.invoke("sfc.dll", "SfpVerifyFile", longArrayOf(pszfilename, pszerror, dwerrsize.toLong())).toInt()
}

public fun TestApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, applyoptionflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "TestApplyPatchToFileA", longArrayOf(patchfilename, oldfilename, applyoptionflags.toLong())).toInt()
}

public fun TestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: UInt, oldfilebuffer: Long, oldfilesize: UInt, newfilesize: Long, applyoptionflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "TestApplyPatchToFileByBuffers", longArrayOf(patchfilebuffer, patchfilesize.toLong(), oldfilebuffer, oldfilesize.toLong(), newfilesize, applyoptionflags.toLong())).toInt()
}

public fun TestApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, applyoptionflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "TestApplyPatchToFileByHandles", longArrayOf(patchfilehandle, oldfilehandle, applyoptionflags.toLong())).toInt()
}

public fun TestApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, applyoptionflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("mspatcha.dll", "TestApplyPatchToFileW", longArrayOf(patchfilename, oldfilename, applyoptionflags.toLong())).toInt()
}

public fun ZombifyActCtx(hactctx: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ZombifyActCtx", longArrayOf(hactctx)).toInt()
}
