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

private object WindowsWin32SystemApplicationinstallationandservicingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ActivateActCtx(hactctx: Long, lpcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_AddRefActCtx(hactctx: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaA(applyflags: Long, lpsourcename: Long, lpdeltaname: Long, lptargetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaW(applyflags: Long, lpsourcename: Long, lpdeltaname: Long, lptargetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileA(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: Int, oldfilemapped: Long, oldfilesize: Int, newfilebuffer: Long, newfilebuffersize: Int, newfileactualsize: Long, newfiletime: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandles(patchfilehandle: Long, oldfilehandle: Long, newfilehandle: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandlesEx(patchfilehandle: Long, oldfilehandle: Long, newfilehandle: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExA(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExW(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileW(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxA(pactctx: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxW(pactctx: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileA(oldfilename: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandles(oldfilehandle: Long, newfilehandle: Long, patchfilehandle: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandlesEx(oldfilecount: Int, oldfileinfoarray: Long, newfilehandle: Long, patchfilehandle: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExA(oldfilecount: Int, oldfileinfoarray: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExW(oldfilecount: Int, oldfileinfoarray: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileW(oldfilename: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_DeactivateActCtx(dwflags: Int, ulcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_DeltaFree(lpmemory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileA(patchfilename: Long, patchheaderfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileByHandles(patchfilehandle: Long, patchheaderfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileW(patchfilename: Long, patchheaderfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionGuid(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpguidtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringA(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpstringtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringW(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpstringtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetCurrentActCtx(lphactctx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoA(lpdeltaname: Long, lpheaderinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoW(lpdeltaname: Long, lpheaderinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureA(filetypeset: Long, hashalgid: Int, lpsourcename: Long, lphash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureW(filetypeset: Long, hashalgid: Int, lpsourcename: Long, lphash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureA(filename: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: Int, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByHandle(filehandle: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureW(filename: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductA(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExA(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short, dwplatform: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExW(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short, dwplatform: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductW(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptA(szscriptfile: Long, dwflags: Int, phregdata: Long, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptW(szscriptfile: Long, dwflags: Int, phregdata: Long, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesA(szpatchpackages: Long, szproductcode: Long, szpropertieslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesW(szpatchpackages: Long, szproductcode: Long, szpropertieslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchA(szpatchpackage: Long, szinstallpackage: Long, einstalltype: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchW(szpatchpackage: Long, szinstallpackage: Long, einstalltype: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionA(szname: Long, dwtransactionattributes: Int, phtransactionhandle: Long, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionW(szname: Long, dwtransactionattributes: Int, phtransactionhandle: Long, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseAllHandles(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseHandle(hany: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoA(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoW(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureA(szproduct: Long, szfeature: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureW(szproduct: Long, szfeature: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductA(szproduct: Long, iinstalllevel: Int, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExA(szproduct: Long, iinstalllevel: Int, einstallstate: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExW(szproduct: Long, iinstalllevel: Int, einstallstate: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductW(szproduct: Long, iinstalllevel: Int, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateRecord(cparams: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoA(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ierrorconditions: Int, ivalidation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoW(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ierrorconditions: Int, ivalidation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformA(hdatabase: Int, sztransformfile: Long, ierrorconditions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformW(hdatabase: Int, sztransformfile: Long, ierrorconditions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseCommit(hdatabase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportA(hdatabase: Int, sztablename: Long, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportW(hdatabase: Int, sztablename: Long, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformA(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ireserved1: Int, ireserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformW(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ireserved1: Int, ireserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysA(hdatabase: Int, sztablename: Long, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysW(hdatabase: Int, sztablename: Long, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportA(hdatabase: Int, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportW(hdatabase: Int, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentA(hdatabase: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentW(hdatabase: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeA(hdatabase: Int, hdatabasemerge: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeW(hdatabase: Int, hdatabasemerge: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewA(hdatabase: Int, szquery: Long, phview: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewW(hdatabase: Int, szquery: Long, phview: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesA(szproductpackagepath: Long, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesW(szproductpackagepath: Long, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceA(szproductcode: Long, szusersid: Long, dwcontext: Int, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceW(szproductcode: Long, szusersid: Long, dwcontext: Int, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionA(hinstall: Int, szaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionW(hinstall: Int, szaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogA(dwlogmode: Int, szlogfile: Long, dwlogattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogW(dwlogmode: Int, szlogfile: Long, dwlogattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableUIPreview(hdatabase: Int, phpreview: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEndTransaction(dwtransactionstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsA(szcomponent: Long, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExA(szcomponent: Long, szusersid: Long, dwcontext: Int, dwproductindex: Int, szproductbuf: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExW(szcomponent: Long, szusersid: Long, dwcontext: Int, dwproductindex: Int, szproductbuf: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsW(szcomponent: Long, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsA(hinstall: Int, szcomponent: Long, dwindex: Int, istate: Int, szdrivebuf: Long, pcchdrivebuf: Long, picost: Long, pitempcost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsW(hinstall: Int, szcomponent: Long, dwindex: Int, istate: Int, szdrivebuf: Long, pcchdrivebuf: Long, picost: Long, pitempcost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersA(szcomponent: Long, iindex: Int, lpqualifierbuf: Long, pcchqualifierbuf: Long, lpapplicationdatabuf: Long, pcchapplicationdatabuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersW(szcomponent: Long, iindex: Int, lpqualifierbuf: Long, pcchqualifierbuf: Long, lpapplicationdatabuf: Long, pcchapplicationdatabuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsA(icomponentindex: Int, lpcomponentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExA(szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledcomponentcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExW(szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledcomponentcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsW(icomponentindex: Int, lpcomponentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesA(szproduct: Long, ifeatureindex: Int, lpfeaturebuf: Long, lpparentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesW(szproduct: Long, ifeatureindex: Int, lpfeaturebuf: Long, lpparentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesA(szproduct: Long, ipatchindex: Int, lppatchbuf: Long, lptransformsbuf: Long, pcchtransformsbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExA(szproductcode: Long, szusersid: Long, dwcontext: Int, dwfilter: Int, dwindex: Int, szpatchcode: Long, sztargetproductcode: Long, pdwtargetproductcontext: Long, sztargetusersid: Long, pcchtargetusersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExW(szproductcode: Long, szusersid: Long, dwcontext: Int, dwfilter: Int, dwindex: Int, szpatchcode: Long, sztargetproductcode: Long, pdwtargetproductcontext: Long, sztargetusersid: Long, pcchtargetusersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesW(szproduct: Long, ipatchindex: Int, lppatchbuf: Long, lptransformsbuf: Long, pcchtransformsbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsA(iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExA(szproductcode: Long, szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledproductcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExW(szproductcode: Long, szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledproductcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsW(iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsA(lpupgradecode: Long, dwreserved: Int, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsW(lpupgradecode: Long, dwreserved: Int, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionA(hinstall: Int, szcondition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionW(hinstall: Int, szcondition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataA(szpatchpath: Long, dwreserved: Int, szxmldata: Long, pcchxmldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataW(szpatchpath: Long, dwreserved: Int, szxmldata: Long, pcchxmldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordA(hinstall: Int, hrecord: Int, szresultbuf: Long, pcchresultbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordW(hinstall: Int, hrecord: Int, szresultbuf: Long, pcchresultbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetActiveDatabase(hinstall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathA(szproduct: Long, szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExA(szproductcode: Long, szcomponentcode: Long, szusersid: Long, dwcontext: Int, lpoutpathbuffer: Long, pcchoutpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExW(szproductcode: Long, szcomponentcode: Long, szusersid: Long, dwcontext: Int, lpoutpathbuffer: Long, pcchoutpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathW(szproduct: Long, szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateA(hinstall: Int, szcomponent: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateW(hinstall: Int, szcomponent: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetDatabaseState(hdatabase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostA(hinstall: Int, szfeature: Long, icosttree: Int, istate: Int, picost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostW(hinstall: Int, szfeature: Long, icosttree: Int, istate: Int, picost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoA(hproduct: Int, szfeature: Long, lpattributes: Long, lptitlebuf: Long, pcchtitlebuf: Long, lphelpbuf: Long, pcchhelpbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoW(hproduct: Int, szfeature: Long, lpattributes: Long, lptitlebuf: Long, pcchtitlebuf: Long, lphelpbuf: Long, pcchhelpbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateA(hinstall: Int, szfeature: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateW(hinstall: Int, szfeature: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageA(szproduct: Long, szfeature: Long, pdwusecount: Long, pwdateused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageW(szproduct: Long, szfeature: Long, pdwusecount: Long, pwdateused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesA(hinstall: Int, szfeature: Long, lpinstallstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesW(hinstall: Int, szfeature: Long, lpinstallstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashA(szfilepath: Long, dwoptions: Int, phash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashW(szfilepath: Long, dwoptions: Int, phash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationA(szsignedobjectpath: Long, dwflags: Int, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationW(szsignedobjectpath: Long, dwflags: Int, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionA(szfilepath: Long, lpversionbuf: Long, pcchversionbuf: Long, lplangbuf: Long, pcchlangbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionW(szfilepath: Long, lpversionbuf: Long, pcchversionbuf: Long, lplangbuf: Long, pcchlangbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLanguage(hinstall: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLastErrorRecord(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetMode(hinstall: Int, erunmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListA(szproductcode: Long, szpatchpackages: Long, pcfiles: Long, pphfilerecords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListW(szproductcode: Long, szpatchpackages: Long, pcfiles: Long, pphfilerecords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoA(szpatch: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExA(szpatchcode: Long, szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, lpvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExW(szpatchcode: Long, szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, lpvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoW(szpatch: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeA(szcomponent: Long, lpbuf39: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeW(szcomponent: Long, lpbuf39: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoA(szproduct: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExA(szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExW(szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptA(szscriptfile: Long, lpproductbuf39: Long, plgidlanguage: Long, pdwversion: Long, lpnamebuf: Long, pcchnamebuf: Long, lppackagebuf: Long, pcchpackagebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptW(szscriptfile: Long, lpproductbuf39: Long, plgidlanguage: Long, pdwversion: Long, lpnamebuf: Long, pcchnamebuf: Long, lppackagebuf: Long, pcchpackagebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoW(szproduct: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyA(hproduct: Int, szproperty: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyW(hproduct: Int, szproperty: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyA(hinstall: Int, szname: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyW(hinstall: Int, szname: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetA(szshortcutpath: Long, szproductcode: Long, szfeatureid: Long, szcomponentcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetW(szshortcutpath: Long, szproductcode: Long, szfeatureid: Long, szcomponentcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathA(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathW(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationA(hdatabase: Int, szdatabasepath: Long, uiupdatecount: Int, phsummaryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationW(hdatabase: Int, szdatabasepath: Long, uiupdatecount: Int, phsummaryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathA(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathW(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoA(szproduct: Long, lpusernamebuf: Long, pcchusernamebuf: Long, lporgnamebuf: Long, pcchorgnamebuf: Long, lpserialbuf: Long, pcchserialbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoW(szproduct: Long, lpusernamebuf: Long, pcchusernamebuf: Long, lporgnamebuf: Long, pcchorgnamebuf: Long, lpserialbuf: Long, pcchserialbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentA(szproduct: Long, szcomponent: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentW(szproduct: Long, szcomponent: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileA(szproduct: Long, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileW(szproduct: Long, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductA(szpackagepath: Long, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductW(szpackagepath: Long, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedA(szproduct: Long, pfelevated: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedW(szproduct: Long, pfelevated: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiJoinTransaction(htransactionhandle: Int, dwtransactionattributes: Int, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentA(szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentW(szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeA(poldsid: Long, pnewsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeW(poldsid: Long, pnewsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseA(szdatabasepath: Long, szpersist: Long, phdatabase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseW(szdatabasepath: Long, szpersist: Long, phdatabase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageA(szpackagepath: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExA(szpackagepath: Long, dwoptions: Int, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExW(szpackagepath: Long, dwoptions: Int, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageW(szpackagepath: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductA(szproduct: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductW(szproduct: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardA(hpreview: Int, szcontrolname: Long, szbillboard: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardW(hpreview: Int, szcontrolname: Long, szbillboard: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogA(hpreview: Int, szdialogname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogW(hpreview: Int, szdialogname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptA(szscriptfile: Long, sziconfolder: Long, hregdata: Long, fshortcuts: Int, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptW(szscriptfile: Long, sziconfolder: Long, hregdata: Long, fshortcuts: Int, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessMessage(hinstall: Int, emessagetype: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyA(szassemblyname: Long, szappcontext: Long, dwinstallmode: Int, dwassemblyinfo: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyW(szassemblyname: Long, szappcontext: Long, dwinstallmode: Int, dwassemblyinfo: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentA(szproduct: Long, szfeature: Long, szcomponent: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentW(szproduct: Long, szfeature: Long, szcomponent: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentA(szcategory: Long, szqualifier: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExA(szcategory: Long, szqualifier: Long, dwinstallmode: Int, szproduct: Long, dwunused1: Int, dwunused2: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExW(szcategory: Long, szqualifier: Long, dwinstallmode: Int, szproduct: Long, dwunused1: Int, dwunused2: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentW(szcategory: Long, szqualifier: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateA(szproductcode: Long, szusersid: Long, dwcontext: Int, szcomponentcode: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateW(szproductcode: Long, szusersid: Long, dwcontext: Int, szcomponentcode: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateA(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExA(szproductcode: Long, szusersid: Long, dwcontext: Int, szfeature: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExW(szproductcode: Long, szusersid: Long, dwcontext: Int, szfeature: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateW(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateA(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateW(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordClearData(hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordDataSize(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetFieldCount(hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetInteger(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringA(hrecord: Int, ifield: Int, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringW(hrecord: Int, ifield: Int, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordIsNull(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordReadStream(hrecord: Int, ifield: Int, szdatabuf: Long, pcbdatabuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetInteger(hrecord: Int, ifield: Int, ivalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamA(hrecord: Int, ifield: Int, szfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamW(hrecord: Int, ifield: Int, szfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringA(hrecord: Int, ifield: Int, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringW(hrecord: Int, ifield: Int, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureA(szproduct: Long, szfeature: Long, dwreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureW(szproduct: Long, szfeature: Long, dwreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductA(szproduct: Long, szreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductW(szproduct: Long, szreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesA(szpatchlist: Long, szproductcode: Long, euninstalltype: Int, szpropertylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesW(szpatchlist: Long, szproductcode: Long, euninstalltype: Int, szpropertylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceA(hinstall: Int, sztable: Long, isequencemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceW(hinstall: Int, sztable: Long, isequencemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateA(hinstall: Int, szcomponent: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateW(hinstall: Int, szcomponent: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIA(puihandler: Long, dwmessagefilter: Int, pvcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIRecord(puihandler: Long, dwmessagefilter: Int, pvcontext: Long, ppuiprevhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIW(puihandler: Long, dwmessagefilter: Int, pvcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesA(hinstall: Int, szfeature: Long, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesW(hinstall: Int, szfeature: Long, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateA(hinstall: Int, szfeature: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateW(hinstall: Int, szfeature: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInstallLevel(hinstall: Int, iinstalllevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInternalUI(dwuilevel: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetMode(hinstall: Int, erunmode: Int, fstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyA(hinstall: Int, szname: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyW(hinstall: Int, szname: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathA(hinstall: Int, szfolder: Long, szfolderpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathW(hinstall: Int, szfolder: Long, szfolderpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int, szvolumelabel: Long, szdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int, szvolumelabel: Long, szdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceA(szproduct: Long, szusername: Long, dwreserved: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceW(szproduct: Long, szusername: Long, dwreserved: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllA(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllW(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, pdwdiskid: Long, szvolumelabel: Long, pcchvolumelabel: Long, szdiskprompt: Long, pcchdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, pdwdiskid: Long, szvolumelabel: Long, pcchvolumelabel: Long, szdiskprompt: Long, pcchdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, szsource: Long, pcchsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, szsource: Long, pcchsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionA(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionW(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyA(hsummaryinfo: Int, uiproperty: Int, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyCount(hsummaryinfo: Int, puipropertycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyW(hsummaryinfo: Int, uiproperty: Int, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoPersist(hsummaryinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyA(hsummaryinfo: Int, uiproperty: Int, uidatatype: Int, ivalue: Int, pftvalue: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyW(hsummaryinfo: Int, uiproperty: Int, uidatatype: Int, ivalue: Int, pftvalue: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureA(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExA(szproduct: Long, szfeature: Long, dwinstallmode: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExW(szproduct: Long, szfeature: Long, dwinstallmode: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureW(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyDiskSpace(hinstall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageA(szpackagepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageW(szpackagepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewClose(hview: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewExecute(hview: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewFetch(hview: Int, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetColumnInfo(hview: Int, ecolumninfo: Int, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorA(hview: Int, szcolumnnamebuffer: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorW(hview: Int, szcolumnnamebuffer: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewModify(hview: Int, emodifymode: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_NormalizeFileForPatchSignature(filebuffer: Long, filesize: Int, optionflags: Int, optiondata: Long, newfilecoffbase: Int, newfilecofftime: Int, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxSettingsW(dwflags: Int, hactctx: Long, settingsnamespace: Long, settingname: Long, pvbuffer: Long, dwbuffer: Long, pdwwrittenorrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxW(dwflags: Int, hactctx: Long, pvsubinstance: Long, ulinfoclass: Int, pvbuffer: Long, cbbuffer: Long, pcbwrittenorrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ReleaseActCtx(hactctx: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_SfcGetNextProtectedFile(rpchandle: Long, protfiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsFileProtected(rpchandle: Long, protfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsKeyProtected(keyhandle: Long, subkeyname: Long, keysam: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_SfpVerifyFile(pszfilename: Long, pszerror: Long, dwerrsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileA(patchfilename: Long, oldfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: Int, oldfilebuffer: Long, oldfilesize: Int, newfilesize: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByHandles(patchfilehandle: Long, oldfilehandle: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileW(patchfilename: Long, oldfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_ZombifyActCtx(hactctx: Long): Int
}

public actual fun ActivateActCtx(hactctx: HANDLE, lpcookie: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ActivateActCtx(hactctx, lpcookie)

public actual fun AddRefActCtx(hactctx: HANDLE) {
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_AddRefActCtx(hactctx)
}

public actual fun ApplyDeltaA(applyflags: Long, lpsourcename: PCSTR, lpdeltaname: PCSTR, lptargetname: PCSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaA(applyflags, lpsourcename, lpdeltaname, lptargetname)

public actual fun ApplyDeltaB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long): BOOL =
    0

public actual fun ApplyDeltaGetReverseB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lpreversefiletime: Long, lptarget: Long, lptargetreverse: Long): BOOL =
    0

public actual fun ApplyDeltaProvidedB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long, utargetsize: ULong): BOOL =
    0

public actual fun ApplyDeltaW(applyflags: Long, lpsourcename: PCWSTR, lpdeltaname: PCWSTR, lptargetname: PCWSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyDeltaW(applyflags, lpsourcename, lpdeltaname, lptargetname)

public actual fun ApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileA(patchfilename, oldfilename, newfilename, applyoptionflags.toInt())

public actual fun ApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: UInt, oldfilemapped: Long, oldfilesize: UInt, newfilebuffer: Long, newfilebuffersize: UInt, newfileactualsize: Long, newfiletime: Long, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByBuffers(patchfilemapped, patchfilesize.toInt(), oldfilemapped, oldfilesize.toInt(), newfilebuffer, newfilebuffersize.toInt(), newfileactualsize, newfiletime, applyoptionflags.toInt(), progresscallback.toLong(), callbackcontext)

public actual fun ApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandles(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags.toInt())

public actual fun ApplyPatchToFileByHandlesEx(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileByHandlesEx(patchfilehandle, oldfilehandle, newfilehandle, applyoptionflags.toInt(), progresscallback.toLong(), callbackcontext)

public actual fun ApplyPatchToFileExA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExA(patchfilename, oldfilename, newfilename, applyoptionflags.toInt(), progresscallback.toLong(), callbackcontext)

public actual fun ApplyPatchToFileExW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileExW(patchfilename, oldfilename, newfilename, applyoptionflags.toInt(), progresscallback.toLong(), callbackcontext)

public actual fun ApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ApplyPatchToFileW(patchfilename, oldfilename, newfilename, applyoptionflags.toInt())

public actual fun CreateActCtxA(pactctx: Long): HANDLE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxA(pactctx)

public actual fun CreateActCtxW(pactctx: Long): HANDLE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreateActCtxW(pactctx)

public actual fun CreateDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCSTR, lptargetname: PCSTR, lpsourceoptionsname: PCSTR, lptargetoptionsname: PCSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCSTR): BOOL =
    0

public actual fun CreateDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DELTA_INPUT, target: DELTA_INPUT, sourceoptions: DELTA_INPUT, targetoptions: DELTA_INPUT, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdelta: Long): BOOL =
    0

public actual fun CreateDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCWSTR, lptargetname: PCWSTR, lpsourceoptionsname: PCWSTR, lptargetoptionsname: PCWSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCWSTR): BOOL =
    0

public actual fun CreatePatchFileA(oldfilename: PCSTR, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileA(oldfilename, newfilename, patchfilename, optionflags.toInt(), optiondata)

public actual fun CreatePatchFileByHandles(oldfilehandle: HANDLE, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandles(oldfilehandle, newfilehandle, patchfilehandle, optionflags.toInt(), optiondata)

public actual fun CreatePatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: Long, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileByHandlesEx(oldfilecount.toInt(), oldfileinfoarray, newfilehandle, patchfilehandle, optionflags.toInt(), optiondata, progresscallback.toLong(), callbackcontext)

public actual fun CreatePatchFileExA(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExA(oldfilecount.toInt(), oldfileinfoarray, newfilename, patchfilename, optionflags.toInt(), optiondata, progresscallback.toLong(), callbackcontext)

public actual fun CreatePatchFileExW(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileExW(oldfilecount.toInt(), oldfileinfoarray, newfilename, patchfilename, optionflags.toInt(), optiondata, progresscallback.toLong(), callbackcontext)

public actual fun CreatePatchFileW(oldfilename: PCWSTR, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_CreatePatchFileW(oldfilename, newfilename, patchfilename, optionflags.toInt(), optiondata)

public actual fun DeactivateActCtx(dwflags: UInt, ulcookie: ULong): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_DeactivateActCtx(dwflags.toInt(), ulcookie.toLong())

public actual fun DeltaFree(lpmemory: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_DeltaFree(lpmemory)

public actual fun DeltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DELTA_INPUT, lpsource: Long, usourcesize: ULong): BOOL =
    0

public actual fun ExtractPatchHeaderToFileA(patchfilename: PCSTR, patchheaderfilename: PCSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileA(patchfilename, patchheaderfilename)

public actual fun ExtractPatchHeaderToFileByHandles(patchfilehandle: HANDLE, patchheaderfilehandle: HANDLE): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileByHandles(patchfilehandle, patchheaderfilehandle)

public actual fun ExtractPatchHeaderToFileW(patchfilename: PCWSTR, patchheaderfilename: PCWSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ExtractPatchHeaderToFileW(patchfilename, patchheaderfilename)

public actual fun FindActCtxSectionGuid(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpguidtofind: Long, returneddata: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionGuid(dwflags.toInt(), lpextensionguid, ulsectionid.toInt(), lpguidtofind, returneddata)

public actual fun FindActCtxSectionStringA(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCSTR, returneddata: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringA(dwflags.toInt(), lpextensionguid, ulsectionid.toInt(), lpstringtofind, returneddata)

public actual fun FindActCtxSectionStringW(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCWSTR, returneddata: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_FindActCtxSectionStringW(dwflags.toInt(), lpextensionguid, ulsectionid.toInt(), lpstringtofind, returneddata)

public actual fun GetCurrentActCtx(lphactctx: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetCurrentActCtx(lphactctx)

public actual fun GetDeltaInfoA(lpdeltaname: PCSTR, lpheaderinfo: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoA(lpdeltaname, lpheaderinfo)

public actual fun GetDeltaInfoB(delta: DELTA_INPUT, lpheaderinfo: Long): BOOL =
    0

public actual fun GetDeltaInfoW(lpdeltaname: PCWSTR, lpheaderinfo: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaInfoW(lpdeltaname, lpheaderinfo)

public actual fun GetDeltaSignatureA(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCSTR, lphash: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureA(filetypeset, hashalgid.toInt(), lpsourcename, lphash)

public actual fun GetDeltaSignatureB(filetypeset: Long, hashalgid: ALG_ID, source: DELTA_INPUT, lphash: Long): BOOL =
    0

public actual fun GetDeltaSignatureW(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCWSTR, lphash: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetDeltaSignatureW(filetypeset, hashalgid.toInt(), lpsourcename, lphash)

public actual fun GetFilePatchSignatureA(filename: PCSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureA(filename, optionflags.toInt(), optiondata, ignorerangecount.toInt(), ignorerangearray, retainrangecount.toInt(), retainrangearray, signaturebuffersize.toInt(), signaturebuffer)

public actual fun GetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: UInt, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByBuffer(filebufferwritable, filesize.toInt(), optionflags.toInt(), optiondata, ignorerangecount.toInt(), ignorerangearray, retainrangecount.toInt(), retainrangearray, signaturebuffersize.toInt(), signaturebuffer)

public actual fun GetFilePatchSignatureByHandle(filehandle: HANDLE, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureByHandle(filehandle, optionflags.toInt(), optiondata, ignorerangecount.toInt(), ignorerangearray, retainrangecount.toInt(), retainrangearray, signaturebuffersize.toInt(), signaturebuffer)

public actual fun GetFilePatchSignatureW(filename: PCWSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PWSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_GetFilePatchSignatureW(filename, optionflags.toInt(), optiondata, ignorerangecount.toInt(), ignorerangearray, retainrangecount.toInt(), retainrangearray, signaturebuffersize.toInt(), signaturebuffer)

public actual fun MsiAdvertiseProductA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductA(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toShort()).toUInt()

public actual fun MsiAdvertiseProductExA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExA(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toShort(), dwplatform.toInt(), dwoptions.toInt()).toUInt()

public actual fun MsiAdvertiseProductExW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductExW(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toShort(), dwplatform.toInt(), dwoptions.toInt()).toUInt()

public actual fun MsiAdvertiseProductW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseProductW(szpackagepath, szscriptfilepath, sztransforms, lgidlanguage.toShort()).toUInt()

public actual fun MsiAdvertiseScriptA(szscriptfile: PCSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptA(szscriptfile, dwflags.toInt(), phregdata, fremoveitems).toUInt()

public actual fun MsiAdvertiseScriptW(szscriptfile: PCWSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiAdvertiseScriptW(szscriptfile, dwflags.toInt(), phregdata, fremoveitems).toUInt()

public actual fun MsiApplyMultiplePatchesA(szpatchpackages: PCSTR, szproductcode: PCSTR, szpropertieslist: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesA(szpatchpackages, szproductcode, szpropertieslist).toUInt()

public actual fun MsiApplyMultiplePatchesW(szpatchpackages: PCWSTR, szproductcode: PCWSTR, szpropertieslist: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyMultiplePatchesW(szpatchpackages, szproductcode, szpropertieslist).toUInt()

public actual fun MsiApplyPatchA(szpatchpackage: PCSTR, szinstallpackage: PCSTR, einstalltype: INSTALLTYPE, szcommandline: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchA(szpatchpackage, szinstallpackage, einstalltype, szcommandline).toUInt()

public actual fun MsiApplyPatchW(szpatchpackage: PCWSTR, szinstallpackage: PCWSTR, einstalltype: INSTALLTYPE, szcommandline: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiApplyPatchW(szpatchpackage, szinstallpackage, einstalltype, szcommandline).toUInt()

public actual fun MsiBeginTransactionA(szname: PCSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionA(szname, dwtransactionattributes.toInt(), phtransactionhandle, phchangeofownerevent).toUInt()

public actual fun MsiBeginTransactionW(szname: PCWSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiBeginTransactionW(szname, dwtransactionattributes.toInt(), phtransactionhandle, phchangeofownerevent).toUInt()

public actual fun MsiCloseAllHandles(): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseAllHandles().toUInt()

public actual fun MsiCloseHandle(hany: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCloseHandle(hany.toInt()).toUInt()

public actual fun MsiCollectUserInfoA(szproduct: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoA(szproduct).toUInt()

public actual fun MsiCollectUserInfoW(szproduct: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCollectUserInfoW(szproduct).toUInt()

public actual fun MsiConfigureFeatureA(szproduct: PCSTR, szfeature: PCSTR, einstallstate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureA(szproduct, szfeature, einstallstate).toUInt()

public actual fun MsiConfigureFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureFeatureW(szproduct, szfeature, einstallstate).toUInt()

public actual fun MsiConfigureProductA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductA(szproduct, iinstalllevel, einstallstate).toUInt()

public actual fun MsiConfigureProductExA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExA(szproduct, iinstalllevel, einstallstate, szcommandline).toUInt()

public actual fun MsiConfigureProductExW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductExW(szproduct, iinstalllevel, einstallstate, szcommandline).toUInt()

public actual fun MsiConfigureProductW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiConfigureProductW(szproduct, iinstalllevel, einstallstate).toUInt()

public actual fun MsiCreateRecord(cparams: UInt): MSIHANDLE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateRecord(cparams.toInt()).toUInt()

public actual fun MsiCreateTransformSummaryInfoA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile, ierrorconditions, ivalidation).toUInt()

public actual fun MsiCreateTransformSummaryInfoW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiCreateTransformSummaryInfoW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile, ierrorconditions, ivalidation).toUInt()

public actual fun MsiDatabaseApplyTransformA(hdatabase: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformA(hdatabase.toInt(), sztransformfile, ierrorconditions).toUInt()

public actual fun MsiDatabaseApplyTransformW(hdatabase: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseApplyTransformW(hdatabase.toInt(), sztransformfile, ierrorconditions).toUInt()

public actual fun MsiDatabaseCommit(hdatabase: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseCommit(hdatabase.toInt()).toUInt()

public actual fun MsiDatabaseExportA(hdatabase: MSIHANDLE, sztablename: PCSTR, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportA(hdatabase.toInt(), sztablename, szfolderpath, szfilename).toUInt()

public actual fun MsiDatabaseExportW(hdatabase: MSIHANDLE, sztablename: PCWSTR, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseExportW(hdatabase.toInt(), sztablename, szfolderpath, szfilename).toUInt()

public actual fun MsiDatabaseGenerateTransformA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ireserved1: Int, ireserved2: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile, ireserved1, ireserved2).toUInt()

public actual fun MsiDatabaseGenerateTransformW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ireserved1: Int, ireserved2: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGenerateTransformW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile, ireserved1, ireserved2).toUInt()

public actual fun MsiDatabaseGetPrimaryKeysA(hdatabase: MSIHANDLE, sztablename: PCSTR, phrecord: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysA(hdatabase.toInt(), sztablename, phrecord).toUInt()

public actual fun MsiDatabaseGetPrimaryKeysW(hdatabase: MSIHANDLE, sztablename: PCWSTR, phrecord: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseGetPrimaryKeysW(hdatabase.toInt(), sztablename, phrecord).toUInt()

public actual fun MsiDatabaseImportA(hdatabase: MSIHANDLE, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportA(hdatabase.toInt(), szfolderpath, szfilename).toUInt()

public actual fun MsiDatabaseImportW(hdatabase: MSIHANDLE, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseImportW(hdatabase.toInt(), szfolderpath, szfilename).toUInt()

public actual fun MsiDatabaseIsTablePersistentA(hdatabase: MSIHANDLE, sztablename: PCSTR): MSICONDITION =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentA(hdatabase.toInt(), sztablename)

public actual fun MsiDatabaseIsTablePersistentW(hdatabase: MSIHANDLE, sztablename: PCWSTR): MSICONDITION =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseIsTablePersistentW(hdatabase.toInt(), sztablename)

public actual fun MsiDatabaseMergeA(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeA(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename).toUInt()

public actual fun MsiDatabaseMergeW(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseMergeW(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename).toUInt()

public actual fun MsiDatabaseOpenViewA(hdatabase: MSIHANDLE, szquery: PCSTR, phview: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewA(hdatabase.toInt(), szquery, phview).toUInt()

public actual fun MsiDatabaseOpenViewW(hdatabase: MSIHANDLE, szquery: PCWSTR, phview: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDatabaseOpenViewW(hdatabase.toInt(), szquery, phview).toUInt()

public actual fun MsiDetermineApplicablePatchesA(szproductpackagepath: PCSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesA(szproductpackagepath, cpatchinfo.toInt(), ppatchinfo).toUInt()

public actual fun MsiDetermineApplicablePatchesW(szproductpackagepath: PCWSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDetermineApplicablePatchesW(szproductpackagepath, cpatchinfo.toInt(), ppatchinfo).toUInt()

public actual fun MsiDeterminePatchSequenceA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceA(szproductcode, szusersid, dwcontext, cpatchinfo.toInt(), ppatchinfo).toUInt()

public actual fun MsiDeterminePatchSequenceW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDeterminePatchSequenceW(szproductcode, szusersid, dwcontext, cpatchinfo.toInt(), ppatchinfo).toUInt()

public actual fun MsiDoActionA(hinstall: MSIHANDLE, szaction: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionA(hinstall.toInt(), szaction).toUInt()

public actual fun MsiDoActionW(hinstall: MSIHANDLE, szaction: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiDoActionW(hinstall.toInt(), szaction).toUInt()

public actual fun MsiEnableLogA(dwlogmode: UInt, szlogfile: PCSTR, dwlogattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogA(dwlogmode.toInt(), szlogfile, dwlogattributes.toInt()).toUInt()

public actual fun MsiEnableLogW(dwlogmode: UInt, szlogfile: PCWSTR, dwlogattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableLogW(dwlogmode.toInt(), szlogfile, dwlogattributes.toInt()).toUInt()

public actual fun MsiEnableUIPreview(hdatabase: MSIHANDLE, phpreview: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnableUIPreview(hdatabase.toInt(), phpreview).toUInt()

public actual fun MsiEndTransaction(dwtransactionstate: MSITRANSACTIONSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEndTransaction(dwtransactionstate.toInt()).toUInt()

public actual fun MsiEnumClientsA(szcomponent: PCSTR, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsA(szcomponent, iproductindex.toInt(), lpproductbuf).toUInt()

public actual fun MsiEnumClientsExA(szcomponent: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExA(szcomponent, szusersid, dwcontext.toInt(), dwproductindex.toInt(), szproductbuf, pdwinstalledcontext, szsid, pcchsid).toUInt()

public actual fun MsiEnumClientsExW(szcomponent: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsExW(szcomponent, szusersid, dwcontext.toInt(), dwproductindex.toInt(), szproductbuf, pdwinstalledcontext, szsid, pcchsid).toUInt()

public actual fun MsiEnumClientsW(szcomponent: PCWSTR, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumClientsW(szcomponent, iproductindex.toInt(), lpproductbuf).toUInt()

public actual fun MsiEnumComponentCostsA(hinstall: MSIHANDLE, szcomponent: PCSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsA(hinstall.toInt(), szcomponent, dwindex.toInt(), istate, szdrivebuf, pcchdrivebuf, picost, pitempcost).toUInt()

public actual fun MsiEnumComponentCostsW(hinstall: MSIHANDLE, szcomponent: PCWSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PWSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentCostsW(hinstall.toInt(), szcomponent, dwindex.toInt(), istate, szdrivebuf, pcchdrivebuf, picost, pitempcost).toUInt()

public actual fun MsiEnumComponentQualifiersA(szcomponent: PCSTR, iindex: UInt, lpqualifierbuf: PSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PSTR, pcchapplicationdatabuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersA(szcomponent, iindex.toInt(), lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf).toUInt()

public actual fun MsiEnumComponentQualifiersW(szcomponent: PCWSTR, iindex: UInt, lpqualifierbuf: PWSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PWSTR, pcchapplicationdatabuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentQualifiersW(szcomponent, iindex.toInt(), lpqualifierbuf, pcchqualifierbuf, lpapplicationdatabuf, pcchapplicationdatabuf).toUInt()

public actual fun MsiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: PSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsA(icomponentindex.toInt(), lpcomponentbuf).toUInt()

public actual fun MsiEnumComponentsExA(szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExA(szusersid, dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid).toUInt()

public actual fun MsiEnumComponentsExW(szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsExW(szusersid, dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode, pdwinstalledcontext, szsid, pcchsid).toUInt()

public actual fun MsiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: PWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumComponentsW(icomponentindex.toInt(), lpcomponentbuf).toUInt()

public actual fun MsiEnumFeaturesA(szproduct: PCSTR, ifeatureindex: UInt, lpfeaturebuf: PSTR, lpparentbuf: PSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesA(szproduct, ifeatureindex.toInt(), lpfeaturebuf, lpparentbuf).toUInt()

public actual fun MsiEnumFeaturesW(szproduct: PCWSTR, ifeatureindex: UInt, lpfeaturebuf: PWSTR, lpparentbuf: PWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumFeaturesW(szproduct, ifeatureindex.toInt(), lpfeaturebuf, lpparentbuf).toUInt()

public actual fun MsiEnumPatchesA(szproduct: PCSTR, ipatchindex: UInt, lppatchbuf: PSTR, lptransformsbuf: PSTR, pcchtransformsbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesA(szproduct, ipatchindex.toInt(), lppatchbuf, lptransformsbuf, pcchtransformsbuf).toUInt()

public actual fun MsiEnumPatchesExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PSTR, sztargetproductcode: PSTR, pdwtargetproductcontext: Long, sztargetusersid: PSTR, pcchtargetusersid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExA(szproductcode, szusersid, dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid).toUInt()

public actual fun MsiEnumPatchesExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PWSTR, sztargetproductcode: PWSTR, pdwtargetproductcontext: Long, sztargetusersid: PWSTR, pcchtargetusersid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesExW(szproductcode, szusersid, dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode, sztargetproductcode, pdwtargetproductcontext, sztargetusersid, pcchtargetusersid).toUInt()

public actual fun MsiEnumPatchesW(szproduct: PCWSTR, ipatchindex: UInt, lppatchbuf: PWSTR, lptransformsbuf: PWSTR, pcchtransformsbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumPatchesW(szproduct, ipatchindex.toInt(), lppatchbuf, lptransformsbuf, pcchtransformsbuf).toUInt()

public actual fun MsiEnumProductsA(iproductindex: UInt, lpproductbuf: PSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsA(iproductindex.toInt(), lpproductbuf).toUInt()

public actual fun MsiEnumProductsExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExA(szproductcode, szusersid, dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid).toUInt()

public actual fun MsiEnumProductsExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsExW(szproductcode, szusersid, dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode, pdwinstalledcontext, szsid, pcchsid).toUInt()

public actual fun MsiEnumProductsW(iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumProductsW(iproductindex.toInt(), lpproductbuf).toUInt()

public actual fun MsiEnumRelatedProductsA(lpupgradecode: PCSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsA(lpupgradecode, dwreserved.toInt(), iproductindex.toInt(), lpproductbuf).toUInt()

public actual fun MsiEnumRelatedProductsW(lpupgradecode: PCWSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEnumRelatedProductsW(lpupgradecode, dwreserved.toInt(), iproductindex.toInt(), lpproductbuf).toUInt()

public actual fun MsiEvaluateConditionA(hinstall: MSIHANDLE, szcondition: PCSTR): MSICONDITION =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionA(hinstall.toInt(), szcondition)

public actual fun MsiEvaluateConditionW(hinstall: MSIHANDLE, szcondition: PCWSTR): MSICONDITION =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiEvaluateConditionW(hinstall.toInt(), szcondition)

public actual fun MsiExtractPatchXMLDataA(szpatchpath: PCSTR, dwreserved: UInt, szxmldata: PSTR, pcchxmldata: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataA(szpatchpath, dwreserved.toInt(), szxmldata, pcchxmldata).toUInt()

public actual fun MsiExtractPatchXMLDataW(szpatchpath: PCWSTR, dwreserved: UInt, szxmldata: PWSTR, pcchxmldata: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiExtractPatchXMLDataW(szpatchpath, dwreserved.toInt(), szxmldata, pcchxmldata).toUInt()

public actual fun MsiFormatRecordA(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PSTR, pcchresultbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordA(hinstall.toInt(), hrecord.toInt(), szresultbuf, pcchresultbuf).toUInt()

public actual fun MsiFormatRecordW(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PWSTR, pcchresultbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiFormatRecordW(hinstall.toInt(), hrecord.toInt(), szresultbuf, pcchresultbuf).toUInt()

public actual fun MsiGetActiveDatabase(hinstall: MSIHANDLE): MSIHANDLE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetActiveDatabase(hinstall.toInt()).toUInt()

public actual fun MsiGetComponentPathA(szproduct: PCSTR, szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathA(szproduct, szcomponent, lppathbuf, pcchbuf)

public actual fun MsiGetComponentPathExA(szproductcode: PCSTR, szcomponentcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExA(szproductcode, szcomponentcode, szusersid, dwcontext, lpoutpathbuffer, pcchoutpathbuffer)

public actual fun MsiGetComponentPathExW(szproductcode: PCWSTR, szcomponentcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PWSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathExW(szproductcode, szcomponentcode, szusersid, dwcontext, lpoutpathbuffer, pcchoutpathbuffer)

public actual fun MsiGetComponentPathW(szproduct: PCWSTR, szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentPathW(szproduct, szcomponent, lppathbuf, pcchbuf)

public actual fun MsiGetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, piinstalled: Long, piaction: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateA(hinstall.toInt(), szcomponent, piinstalled, piaction).toUInt()

public actual fun MsiGetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetComponentStateW(hinstall.toInt(), szcomponent, piinstalled, piaction).toUInt()

public actual fun MsiGetDatabaseState(hdatabase: MSIHANDLE): MSIDBSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetDatabaseState(hdatabase.toInt())

public actual fun MsiGetFeatureCostA(hinstall: MSIHANDLE, szfeature: PCSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostA(hinstall.toInt(), szfeature, icosttree, istate, picost).toUInt()

public actual fun MsiGetFeatureCostW(hinstall: MSIHANDLE, szfeature: PCWSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureCostW(hinstall.toInt(), szfeature, icosttree, istate, picost).toUInt()

public actual fun MsiGetFeatureInfoA(hproduct: MSIHANDLE, szfeature: PCSTR, lpattributes: Long, lptitlebuf: PSTR, pcchtitlebuf: Long, lphelpbuf: PSTR, pcchhelpbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoA(hproduct.toInt(), szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf).toUInt()

public actual fun MsiGetFeatureInfoW(hproduct: MSIHANDLE, szfeature: PCWSTR, lpattributes: Long, lptitlebuf: PWSTR, pcchtitlebuf: Long, lphelpbuf: PWSTR, pcchhelpbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureInfoW(hproduct.toInt(), szfeature, lpattributes, lptitlebuf, pcchtitlebuf, lphelpbuf, pcchhelpbuf).toUInt()

public actual fun MsiGetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, piinstalled: Long, piaction: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateA(hinstall.toInt(), szfeature, piinstalled, piaction).toUInt()

public actual fun MsiGetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureStateW(hinstall.toInt(), szfeature, piinstalled, piaction).toUInt()

public actual fun MsiGetFeatureUsageA(szproduct: PCSTR, szfeature: PCSTR, pdwusecount: Long, pwdateused: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageA(szproduct, szfeature, pdwusecount, pwdateused).toUInt()

public actual fun MsiGetFeatureUsageW(szproduct: PCWSTR, szfeature: PCWSTR, pdwusecount: Long, pwdateused: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureUsageW(szproduct, szfeature, pdwusecount, pwdateused).toUInt()

public actual fun MsiGetFeatureValidStatesA(hinstall: MSIHANDLE, szfeature: PCSTR, lpinstallstates: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesA(hinstall.toInt(), szfeature, lpinstallstates).toUInt()

public actual fun MsiGetFeatureValidStatesW(hinstall: MSIHANDLE, szfeature: PCWSTR, lpinstallstates: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFeatureValidStatesW(hinstall.toInt(), szfeature, lpinstallstates).toUInt()

public actual fun MsiGetFileHashA(szfilepath: PCSTR, dwoptions: UInt, phash: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashA(szfilepath, dwoptions.toInt(), phash).toUInt()

public actual fun MsiGetFileHashW(szfilepath: PCWSTR, dwoptions: UInt, phash: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileHashW(szfilepath, dwoptions.toInt(), phash).toUInt()

public actual fun MsiGetFileSignatureInformationA(szsignedobjectpath: PCSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationA(szsignedobjectpath, dwflags.toInt(), ppccertcontext, pbhashdata, pcbhashdata)

public actual fun MsiGetFileSignatureInformationW(szsignedobjectpath: PCWSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileSignatureInformationW(szsignedobjectpath, dwflags.toInt(), ppccertcontext, pbhashdata, pcbhashdata)

public actual fun MsiGetFileVersionA(szfilepath: PCSTR, lpversionbuf: PSTR, pcchversionbuf: Long, lplangbuf: PSTR, pcchlangbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionA(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf).toUInt()

public actual fun MsiGetFileVersionW(szfilepath: PCWSTR, lpversionbuf: PWSTR, pcchversionbuf: Long, lplangbuf: PWSTR, pcchlangbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetFileVersionW(szfilepath, lpversionbuf, pcchversionbuf, lplangbuf, pcchlangbuf).toUInt()

public actual fun MsiGetLanguage(hinstall: MSIHANDLE): UShort =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLanguage(hinstall.toInt()).toUShort()

public actual fun MsiGetLastErrorRecord(): MSIHANDLE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetLastErrorRecord().toUInt()

public actual fun MsiGetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetMode(hinstall.toInt(), erunmode)

public actual fun MsiGetPatchFileListA(szproductcode: PCSTR, szpatchpackages: PCSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListA(szproductcode, szpatchpackages, pcfiles, pphfilerecords).toUInt()

public actual fun MsiGetPatchFileListW(szproductcode: PCWSTR, szpatchpackages: PCWSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchFileListW(szproductcode, szpatchpackages, pcfiles, pphfilerecords).toUInt()

public actual fun MsiGetPatchInfoA(szpatch: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoA(szpatch, szattribute, lpvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetPatchInfoExA(szpatchcode: PCSTR, szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, lpvalue: PSTR, pcchvalue: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExA(szpatchcode, szproductcode, szusersid, dwcontext, szproperty, lpvalue, pcchvalue).toUInt()

public actual fun MsiGetPatchInfoExW(szpatchcode: PCWSTR, szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, lpvalue: PWSTR, pcchvalue: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoExW(szpatchcode, szproductcode, szusersid, dwcontext, szproperty, lpvalue, pcchvalue).toUInt()

public actual fun MsiGetPatchInfoW(szpatch: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPatchInfoW(szpatch, szattribute, lpvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetProductCodeA(szcomponent: PCSTR, lpbuf39: PSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeA(szcomponent, lpbuf39).toUInt()

public actual fun MsiGetProductCodeW(szcomponent: PCWSTR, lpbuf39: PWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductCodeW(szcomponent, lpbuf39).toUInt()

public actual fun MsiGetProductInfoA(szproduct: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoA(szproduct, szattribute, lpvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetProductInfoExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExA(szproductcode, szusersid, dwcontext, szproperty, szvalue, pcchvalue).toUInt()

public actual fun MsiGetProductInfoExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoExW(szproductcode, szusersid, dwcontext, szproperty, szvalue, pcchvalue).toUInt()

public actual fun MsiGetProductInfoFromScriptA(szscriptfile: PCSTR, lpproductbuf39: PSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PSTR, pcchnamebuf: Long, lppackagebuf: PSTR, pcchpackagebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptA(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf).toUInt()

public actual fun MsiGetProductInfoFromScriptW(szscriptfile: PCWSTR, lpproductbuf39: PWSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PWSTR, pcchnamebuf: Long, lppackagebuf: PWSTR, pcchpackagebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoFromScriptW(szscriptfile, lpproductbuf39, plgidlanguage, pdwversion, lpnamebuf, pcchnamebuf, lppackagebuf, pcchpackagebuf).toUInt()

public actual fun MsiGetProductInfoW(szproduct: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductInfoW(szproduct, szattribute, lpvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetProductPropertyA(hproduct: MSIHANDLE, szproperty: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyA(hproduct.toInt(), szproperty, lpvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetProductPropertyW(hproduct: MSIHANDLE, szproperty: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetProductPropertyW(hproduct.toInt(), szproperty, lpvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyA(hinstall.toInt(), szname, szvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetPropertyW(hinstall.toInt(), szname, szvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiGetShortcutTargetA(szshortcutpath: PCSTR, szproductcode: PSTR, szfeatureid: PSTR, szcomponentcode: PSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetA(szshortcutpath, szproductcode, szfeatureid, szcomponentcode).toUInt()

public actual fun MsiGetShortcutTargetW(szshortcutpath: PCWSTR, szproductcode: PWSTR, szfeatureid: PWSTR, szcomponentcode: PWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetShortcutTargetW(szshortcutpath, szproductcode, szfeatureid, szcomponentcode).toUInt()

public actual fun MsiGetSourcePathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathA(hinstall.toInt(), szfolder, szpathbuf, pcchpathbuf).toUInt()

public actual fun MsiGetSourcePathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSourcePathW(hinstall.toInt(), szfolder, szpathbuf, pcchpathbuf).toUInt()

public actual fun MsiGetSummaryInformationA(hdatabase: MSIHANDLE, szdatabasepath: PCSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationA(hdatabase.toInt(), szdatabasepath, uiupdatecount.toInt(), phsummaryinfo).toUInt()

public actual fun MsiGetSummaryInformationW(hdatabase: MSIHANDLE, szdatabasepath: PCWSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetSummaryInformationW(hdatabase.toInt(), szdatabasepath, uiupdatecount.toInt(), phsummaryinfo).toUInt()

public actual fun MsiGetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathA(hinstall.toInt(), szfolder, szpathbuf, pcchpathbuf).toUInt()

public actual fun MsiGetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetTargetPathW(hinstall.toInt(), szfolder, szpathbuf, pcchpathbuf).toUInt()

public actual fun MsiGetUserInfoA(szproduct: PCSTR, lpusernamebuf: PSTR, pcchusernamebuf: Long, lporgnamebuf: PSTR, pcchorgnamebuf: Long, lpserialbuf: PSTR, pcchserialbuf: Long): USERINFOSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoA(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf)

public actual fun MsiGetUserInfoW(szproduct: PCWSTR, lpusernamebuf: PWSTR, pcchusernamebuf: Long, lporgnamebuf: PWSTR, pcchorgnamebuf: Long, lpserialbuf: PWSTR, pcchserialbuf: Long): USERINFOSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiGetUserInfoW(szproduct, lpusernamebuf, pcchusernamebuf, lporgnamebuf, pcchorgnamebuf, lpserialbuf, pcchserialbuf)

public actual fun MsiInstallMissingComponentA(szproduct: PCSTR, szcomponent: PCSTR, einstallstate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentA(szproduct, szcomponent, einstallstate).toUInt()

public actual fun MsiInstallMissingComponentW(szproduct: PCWSTR, szcomponent: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingComponentW(szproduct, szcomponent, einstallstate).toUInt()

public actual fun MsiInstallMissingFileA(szproduct: PCSTR, szfile: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileA(szproduct, szfile).toUInt()

public actual fun MsiInstallMissingFileW(szproduct: PCWSTR, szfile: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallMissingFileW(szproduct, szfile).toUInt()

public actual fun MsiInstallProductA(szpackagepath: PCSTR, szcommandline: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductA(szpackagepath, szcommandline).toUInt()

public actual fun MsiInstallProductW(szpackagepath: PCWSTR, szcommandline: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiInstallProductW(szpackagepath, szcommandline).toUInt()

public actual fun MsiIsProductElevatedA(szproduct: PCSTR, pfelevated: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedA(szproduct, pfelevated).toUInt()

public actual fun MsiIsProductElevatedW(szproduct: PCWSTR, pfelevated: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiIsProductElevatedW(szproduct, pfelevated).toUInt()

public actual fun MsiJoinTransaction(htransactionhandle: MSIHANDLE, dwtransactionattributes: UInt, phchangeofownerevent: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiJoinTransaction(htransactionhandle.toInt(), dwtransactionattributes.toInt(), phchangeofownerevent).toUInt()

public actual fun MsiLocateComponentA(szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentA(szcomponent, lppathbuf, pcchbuf)

public actual fun MsiLocateComponentW(szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiLocateComponentW(szcomponent, lppathbuf, pcchbuf)

public actual fun MsiNotifySidChangeA(poldsid: PCSTR, pnewsid: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeA(poldsid, pnewsid).toUInt()

public actual fun MsiNotifySidChangeW(poldsid: PCWSTR, pnewsid: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiNotifySidChangeW(poldsid, pnewsid).toUInt()

public actual fun MsiOpenDatabaseA(szdatabasepath: PCSTR, szpersist: PCSTR, phdatabase: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseA(szdatabasepath, szpersist, phdatabase).toUInt()

public actual fun MsiOpenDatabaseW(szdatabasepath: PCWSTR, szpersist: PCWSTR, phdatabase: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenDatabaseW(szdatabasepath, szpersist, phdatabase).toUInt()

public actual fun MsiOpenPackageA(szpackagepath: PCSTR, hproduct: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageA(szpackagepath, hproduct).toUInt()

public actual fun MsiOpenPackageExA(szpackagepath: PCSTR, dwoptions: UInt, hproduct: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExA(szpackagepath, dwoptions.toInt(), hproduct).toUInt()

public actual fun MsiOpenPackageExW(szpackagepath: PCWSTR, dwoptions: UInt, hproduct: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageExW(szpackagepath, dwoptions.toInt(), hproduct).toUInt()

public actual fun MsiOpenPackageW(szpackagepath: PCWSTR, hproduct: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenPackageW(szpackagepath, hproduct).toUInt()

public actual fun MsiOpenProductA(szproduct: PCSTR, hproduct: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductA(szproduct, hproduct).toUInt()

public actual fun MsiOpenProductW(szproduct: PCWSTR, hproduct: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiOpenProductW(szproduct, hproduct).toUInt()

public actual fun MsiPreviewBillboardA(hpreview: MSIHANDLE, szcontrolname: PCSTR, szbillboard: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardA(hpreview.toInt(), szcontrolname, szbillboard).toUInt()

public actual fun MsiPreviewBillboardW(hpreview: MSIHANDLE, szcontrolname: PCWSTR, szbillboard: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewBillboardW(hpreview.toInt(), szcontrolname, szbillboard).toUInt()

public actual fun MsiPreviewDialogA(hpreview: MSIHANDLE, szdialogname: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogA(hpreview.toInt(), szdialogname).toUInt()

public actual fun MsiPreviewDialogW(hpreview: MSIHANDLE, szdialogname: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiPreviewDialogW(hpreview.toInt(), szdialogname).toUInt()

public actual fun MsiProcessAdvertiseScriptA(szscriptfile: PCSTR, sziconfolder: PCSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptA(szscriptfile, sziconfolder, hregdata, fshortcuts, fremoveitems).toUInt()

public actual fun MsiProcessAdvertiseScriptW(szscriptfile: PCWSTR, sziconfolder: PCWSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessAdvertiseScriptW(szscriptfile, sziconfolder, hregdata, fshortcuts, fremoveitems).toUInt()

public actual fun MsiProcessMessage(hinstall: MSIHANDLE, emessagetype: INSTALLMESSAGE, hrecord: MSIHANDLE): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt())

public actual fun MsiProvideAssemblyA(szassemblyname: PCSTR, szappcontext: PCSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyA(szassemblyname, szappcontext, dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiProvideAssemblyW(szassemblyname: PCWSTR, szappcontext: PCWSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideAssemblyW(szassemblyname, szappcontext, dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiProvideComponentA(szproduct: PCSTR, szfeature: PCSTR, szcomponent: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentA(szproduct, szfeature, szcomponent, dwinstallmode.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiProvideComponentW(szproduct: PCWSTR, szfeature: PCWSTR, szcomponent: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideComponentW(szproduct, szfeature, szcomponent, dwinstallmode.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiProvideQualifiedComponentA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentA(szcategory, szqualifier, dwinstallmode.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiProvideQualifiedComponentExA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, szproduct: PCSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExA(szcategory, szqualifier, dwinstallmode.toInt(), szproduct, dwunused1.toInt(), dwunused2.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiProvideQualifiedComponentExW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, szproduct: PCWSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentExW(szcategory, szqualifier, dwinstallmode.toInt(), szproduct, dwunused1.toInt(), dwunused2.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiProvideQualifiedComponentW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiProvideQualifiedComponentW(szcategory, szqualifier, dwinstallmode.toInt(), lppathbuf, pcchpathbuf).toUInt()

public actual fun MsiQueryComponentStateA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCSTR, pdwstate: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateA(szproductcode, szusersid, dwcontext, szcomponentcode, pdwstate).toUInt()

public actual fun MsiQueryComponentStateW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCWSTR, pdwstate: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryComponentStateW(szproductcode, szusersid, dwcontext, szcomponentcode, pdwstate).toUInt()

public actual fun MsiQueryFeatureStateA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateA(szproduct, szfeature)

public actual fun MsiQueryFeatureStateExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCSTR, pdwstate: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExA(szproductcode, szusersid, dwcontext, szfeature, pdwstate).toUInt()

public actual fun MsiQueryFeatureStateExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCWSTR, pdwstate: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateExW(szproductcode, szusersid, dwcontext, szfeature, pdwstate).toUInt()

public actual fun MsiQueryFeatureStateW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryFeatureStateW(szproduct, szfeature)

public actual fun MsiQueryProductStateA(szproduct: PCSTR): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateA(szproduct)

public actual fun MsiQueryProductStateW(szproduct: PCWSTR): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiQueryProductStateW(szproduct)

public actual fun MsiRecordClearData(hrecord: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordClearData(hrecord.toInt()).toUInt()

public actual fun MsiRecordDataSize(hrecord: MSIHANDLE, ifield: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordDataSize(hrecord.toInt(), ifield.toInt()).toUInt()

public actual fun MsiRecordGetFieldCount(hrecord: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetFieldCount(hrecord.toInt()).toUInt()

public actual fun MsiRecordGetInteger(hrecord: MSIHANDLE, ifield: UInt): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetInteger(hrecord.toInt(), ifield.toInt())

public actual fun MsiRecordGetStringA(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringA(hrecord.toInt(), ifield.toInt(), szvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiRecordGetStringW(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordGetStringW(hrecord.toInt(), ifield.toInt(), szvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiRecordIsNull(hrecord: MSIHANDLE, ifield: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordIsNull(hrecord.toInt(), ifield.toInt())

public actual fun MsiRecordReadStream(hrecord: MSIHANDLE, ifield: UInt, szdatabuf: PSTR, pcbdatabuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordReadStream(hrecord.toInt(), ifield.toInt(), szdatabuf, pcbdatabuf).toUInt()

public actual fun MsiRecordSetInteger(hrecord: MSIHANDLE, ifield: UInt, ivalue: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue).toUInt()

public actual fun MsiRecordSetStreamA(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamA(hrecord.toInt(), ifield.toInt(), szfilepath).toUInt()

public actual fun MsiRecordSetStreamW(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStreamW(hrecord.toInt(), ifield.toInt(), szfilepath).toUInt()

public actual fun MsiRecordSetStringA(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringA(hrecord.toInt(), ifield.toInt(), szvalue).toUInt()

public actual fun MsiRecordSetStringW(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRecordSetStringW(hrecord.toInt(), ifield.toInt(), szvalue).toUInt()

public actual fun MsiReinstallFeatureA(szproduct: PCSTR, szfeature: PCSTR, dwreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureA(szproduct, szfeature, dwreinstallmode.toInt()).toUInt()

public actual fun MsiReinstallFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, dwreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallFeatureW(szproduct, szfeature, dwreinstallmode.toInt()).toUInt()

public actual fun MsiReinstallProductA(szproduct: PCSTR, szreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductA(szproduct, szreinstallmode.toInt()).toUInt()

public actual fun MsiReinstallProductW(szproduct: PCWSTR, szreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiReinstallProductW(szproduct, szreinstallmode.toInt()).toUInt()

public actual fun MsiRemovePatchesA(szpatchlist: PCSTR, szproductcode: PCSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesA(szpatchlist, szproductcode, euninstalltype, szpropertylist).toUInt()

public actual fun MsiRemovePatchesW(szpatchlist: PCWSTR, szproductcode: PCWSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiRemovePatchesW(szpatchlist, szproductcode, euninstalltype, szpropertylist).toUInt()

public actual fun MsiSequenceA(hinstall: MSIHANDLE, sztable: PCSTR, isequencemode: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceA(hinstall.toInt(), sztable, isequencemode).toUInt()

public actual fun MsiSequenceW(hinstall: MSIHANDLE, sztable: PCWSTR, isequencemode: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSequenceW(hinstall.toInt(), sztable, isequencemode).toUInt()

public actual fun MsiSetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, istate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateA(hinstall.toInt(), szcomponent, istate).toUInt()

public actual fun MsiSetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, istate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetComponentStateW(hinstall.toInt(), szcomponent, istate).toUInt()

public actual fun MsiSetExternalUIA(puihandler: INSTALLUI_HANDLERA, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERA =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIA(puihandler.toLong(), dwmessagefilter.toInt(), pvcontext)

public actual fun MsiSetExternalUIRecord(puihandler: PINSTALLUI_HANDLER_RECORD, dwmessagefilter: UInt, pvcontext: Long, ppuiprevhandler: PINSTALLUI_HANDLER_RECORD): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIRecord(puihandler.toLong(), dwmessagefilter.toInt(), pvcontext, ppuiprevhandler.toLong()).toUInt()

public actual fun MsiSetExternalUIW(puihandler: INSTALLUI_HANDLERW, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERW =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetExternalUIW(puihandler.toLong(), dwmessagefilter.toInt(), pvcontext)

public actual fun MsiSetFeatureAttributesA(hinstall: MSIHANDLE, szfeature: PCSTR, dwattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesA(hinstall.toInt(), szfeature, dwattributes.toInt()).toUInt()

public actual fun MsiSetFeatureAttributesW(hinstall: MSIHANDLE, szfeature: PCWSTR, dwattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureAttributesW(hinstall.toInt(), szfeature, dwattributes.toInt()).toUInt()

public actual fun MsiSetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, istate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateA(hinstall.toInt(), szfeature, istate).toUInt()

public actual fun MsiSetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, istate: INSTALLSTATE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetFeatureStateW(hinstall.toInt(), szfeature, istate).toUInt()

public actual fun MsiSetInstallLevel(hinstall: MSIHANDLE, iinstalllevel: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInstallLevel(hinstall.toInt(), iinstalllevel).toUInt()

public actual fun MsiSetInternalUI(dwuilevel: INSTALLUILEVEL, phwnd: Long): INSTALLUILEVEL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetInternalUI(dwuilevel, phwnd)

public actual fun MsiSetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE, fstate: BOOL): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetMode(hinstall.toInt(), erunmode, fstate).toUInt()

public actual fun MsiSetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvalue: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyA(hinstall.toInt(), szname, szvalue).toUInt()

public actual fun MsiSetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvalue: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetPropertyW(hinstall.toInt(), szname, szvalue).toUInt()

public actual fun MsiSetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szfolderpath: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathA(hinstall.toInt(), szfolder, szfolderpath).toUInt()

public actual fun MsiSetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szfolderpath: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSetTargetPathW(hinstall.toInt(), szfolder, szfolderpath).toUInt()

public actual fun MsiSourceListAddMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCSTR, szdiskprompt: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel, szdiskprompt).toUInt()

public actual fun MsiSourceListAddMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCWSTR, szdiskprompt: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddMediaDiskW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel, szdiskprompt).toUInt()

public actual fun MsiSourceListAddSourceA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt, szsource: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceA(szproduct, szusername, dwreserved.toInt(), szsource).toUInt()

public actual fun MsiSourceListAddSourceExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR, dwindex: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szsource, dwindex.toInt()).toUInt()

public actual fun MsiSourceListAddSourceExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR, dwindex: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceExW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szsource, dwindex.toInt()).toUInt()

public actual fun MsiSourceListAddSourceW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt, szsource: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListAddSourceW(szproduct, szusername, dwreserved.toInt(), szsource).toUInt()

public actual fun MsiSourceListClearAllA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllA(szproduct, szusername, dwreserved.toInt()).toUInt()

public actual fun MsiSourceListClearAllExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt()).toUInt()

public actual fun MsiSourceListClearAllExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllExW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt()).toUInt()

public actual fun MsiSourceListClearAllW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearAllW(szproduct, szusername, dwreserved.toInt()).toUInt()

public actual fun MsiSourceListClearMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt()

public actual fun MsiSourceListClearMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearMediaDiskW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt()

public actual fun MsiSourceListClearSourceA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szsource).toUInt()

public actual fun MsiSourceListClearSourceW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListClearSourceW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szsource).toUInt()

public actual fun MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PSTR, pcchvolumelabel: Long, szdiskprompt: PSTR, pcchdiskprompt: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt).toUInt()

public actual fun MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PWSTR, pcchvolumelabel: Long, szdiskprompt: PWSTR, pcchdiskprompt: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid, szvolumelabel, pcchvolumelabel, szdiskprompt, pcchdiskprompt).toUInt()

public actual fun MsiSourceListEnumSourcesA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PSTR, pcchsource: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource, pcchsource).toUInt()

public actual fun MsiSourceListEnumSourcesW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PWSTR, pcchsource: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListEnumSourcesW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource, pcchsource).toUInt()

public actual fun MsiSourceListForceResolutionA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionA(szproduct, szusername, dwreserved.toInt()).toUInt()

public actual fun MsiSourceListForceResolutionExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt()).toUInt()

public actual fun MsiSourceListForceResolutionExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionExW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt()).toUInt()

public actual fun MsiSourceListForceResolutionW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListForceResolutionW(szproduct, szusername, dwreserved.toInt()).toUInt()

public actual fun MsiSourceListGetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szproperty, szvalue, pcchvalue).toUInt()

public actual fun MsiSourceListGetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListGetInfoW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szproperty, szvalue, pcchvalue).toUInt()

public actual fun MsiSourceListSetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoA(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szproperty, szvalue).toUInt()

public actual fun MsiSourceListSetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSourceListSetInfoW(szproductcodeorpatchcode, szusersid, dwcontext, dwoptions.toInt(), szproperty, szvalue).toUInt()

public actual fun MsiSummaryInfoGetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiSummaryInfoGetPropertyCount(hsummaryinfo: MSIHANDLE, puipropertycount: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyCount(hsummaryinfo.toInt(), puipropertycount).toUInt()

public actual fun MsiSummaryInfoGetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoGetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype, pivalue, pftvalue, szvaluebuf, pcchvaluebuf).toUInt()

public actual fun MsiSummaryInfoPersist(hsummaryinfo: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoPersist(hsummaryinfo.toInt()).toUInt()

public actual fun MsiSummaryInfoSetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue, szvalue).toUInt()

public actual fun MsiSummaryInfoSetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiSummaryInfoSetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue, szvalue).toUInt()

public actual fun MsiUseFeatureA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureA(szproduct, szfeature)

public actual fun MsiUseFeatureExA(szproduct: PCSTR, szfeature: PCSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExA(szproduct, szfeature, dwinstallmode.toInt(), dwreserved.toInt())

public actual fun MsiUseFeatureExW(szproduct: PCWSTR, szfeature: PCWSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureExW(szproduct, szfeature, dwinstallmode.toInt(), dwreserved.toInt())

public actual fun MsiUseFeatureW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiUseFeatureW(szproduct, szfeature)

public actual fun MsiVerifyDiskSpace(hinstall: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyDiskSpace(hinstall.toInt()).toUInt()

public actual fun MsiVerifyPackageA(szpackagepath: PCSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageA(szpackagepath).toUInt()

public actual fun MsiVerifyPackageW(szpackagepath: PCWSTR): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiVerifyPackageW(szpackagepath).toUInt()

public actual fun MsiViewClose(hview: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewClose(hview.toInt()).toUInt()

public actual fun MsiViewExecute(hview: MSIHANDLE, hrecord: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewExecute(hview.toInt(), hrecord.toInt()).toUInt()

public actual fun MsiViewFetch(hview: MSIHANDLE, phrecord: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewFetch(hview.toInt(), phrecord).toUInt()

public actual fun MsiViewGetColumnInfo(hview: MSIHANDLE, ecolumninfo: MSICOLINFO, phrecord: Long): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetColumnInfo(hview.toInt(), ecolumninfo, phrecord).toUInt()

public actual fun MsiViewGetErrorA(hview: MSIHANDLE, szcolumnnamebuffer: PSTR, pcchbuf: Long): MSIDBERROR =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorA(hview.toInt(), szcolumnnamebuffer, pcchbuf)

public actual fun MsiViewGetErrorW(hview: MSIHANDLE, szcolumnnamebuffer: PWSTR, pcchbuf: Long): MSIDBERROR =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewGetErrorW(hview.toInt(), szcolumnnamebuffer, pcchbuf)

public actual fun MsiViewModify(hview: MSIHANDLE, emodifymode: MSIMODIFY, hrecord: MSIHANDLE): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_MsiViewModify(hview.toInt(), emodifymode, hrecord.toInt()).toUInt()

public actual fun NormalizeFileForPatchSignature(filebuffer: Long, filesize: UInt, optionflags: UInt, optiondata: Long, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_NormalizeFileForPatchSignature(filebuffer, filesize.toInt(), optionflags.toInt(), optiondata, newfilecoffbase.toInt(), newfilecofftime.toInt(), ignorerangecount.toInt(), ignorerangearray, retainrangecount.toInt(), retainrangearray)

public actual fun QueryActCtxSettingsW(dwflags: UInt, hactctx: HANDLE, settingsnamespace: PCWSTR, settingname: PCWSTR, pvbuffer: PWSTR, dwbuffer: ULong, pdwwrittenorrequired: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxSettingsW(dwflags.toInt(), hactctx, settingsnamespace, settingname, pvbuffer, dwbuffer.toLong(), pdwwrittenorrequired)

public actual fun QueryActCtxW(dwflags: UInt, hactctx: HANDLE, pvsubinstance: Long, ulinfoclass: UInt, pvbuffer: Long, cbbuffer: ULong, pcbwrittenorrequired: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_QueryActCtxW(dwflags.toInt(), hactctx, pvsubinstance, ulinfoclass.toInt(), pvbuffer, cbbuffer.toLong(), pcbwrittenorrequired)

public actual fun ReleaseActCtx(hactctx: HANDLE) {
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ReleaseActCtx(hactctx)
}

public actual fun SfcGetNextProtectedFile(rpchandle: HANDLE, protfiledata: Long): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_SfcGetNextProtectedFile(rpchandle, protfiledata)

public actual fun SfcIsFileProtected(rpchandle: HANDLE, protfilename: PCWSTR): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsFileProtected(rpchandle, protfilename)

public actual fun SfcIsKeyProtected(keyhandle: HKEY, subkeyname: PCWSTR, keysam: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_SfcIsKeyProtected(keyhandle, subkeyname, keysam.toInt())

public actual fun SfpVerifyFile(pszfilename: PCSTR, pszerror: PCSTR, dwerrsize: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_SfpVerifyFile(pszfilename, pszerror, dwerrsize.toInt())

public actual fun TestApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, applyoptionflags: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileA(patchfilename, oldfilename, applyoptionflags.toInt())

public actual fun TestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: UInt, oldfilebuffer: Long, oldfilesize: UInt, newfilesize: Long, applyoptionflags: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByBuffers(patchfilebuffer, patchfilesize.toInt(), oldfilebuffer, oldfilesize.toInt(), newfilesize, applyoptionflags.toInt())

public actual fun TestApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileByHandles(patchfilehandle, oldfilehandle, applyoptionflags.toInt())

public actual fun TestApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_TestApplyPatchToFileW(patchfilename, oldfilename, applyoptionflags.toInt())

public actual fun ZombifyActCtx(hactctx: HANDLE): BOOL =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_ZombifyActCtx(hactctx)
