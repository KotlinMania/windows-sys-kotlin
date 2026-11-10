@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

private object WindowsWin32SystemApplicationinstallationandservicingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_activateActCtx(hactctx: Long, lpcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_addRefActCtx(hactctx: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaA(applyflags: Long, lpsourcename: Long, lpdeltaname: Long, lptargetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaW(applyflags: Long, lpsourcename: Long, lpdeltaname: Long, lptargetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileA(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: Int, oldfilemapped: Long, oldfilesize: Int, newfilebuffer: Long, newfilebuffersize: Int, newfileactualsize: Long, newfiletime: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandles(patchfilehandle: Long, oldfilehandle: Long, newfilehandle: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandlesEx(patchfilehandle: Long, oldfilehandle: Long, newfilehandle: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExA(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExW(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileW(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxA(pactctx: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxW(pactctx: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileA(oldfilename: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandles(oldfilehandle: Long, newfilehandle: Long, patchfilehandle: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandlesEx(oldfilecount: Int, oldfileinfoarray: Long, newfilehandle: Long, patchfilehandle: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExA(oldfilecount: Int, oldfileinfoarray: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExW(oldfilecount: Int, oldfileinfoarray: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileW(oldfilename: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_deactivateActCtx(dwflags: Int, ulcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_deltaFree(lpmemory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileA(patchfilename: Long, patchheaderfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileByHandles(patchfilehandle: Long, patchheaderfilehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileW(patchfilename: Long, patchheaderfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionGuid(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpguidtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringA(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpstringtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringW(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpstringtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getCurrentActCtx(lphactctx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoA(lpdeltaname: Long, lpheaderinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoW(lpdeltaname: Long, lpheaderinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureA(filetypeset: Long, hashalgid: Int, lpsourcename: Long, lphash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureW(filetypeset: Long, hashalgid: Int, lpsourcename: Long, lphash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureA(filename: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: Int, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByHandle(filehandle: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureW(filename: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductA(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExA(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short, dwplatform: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExW(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short, dwplatform: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductW(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptA(szscriptfile: Long, dwflags: Int, phregdata: Long, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptW(szscriptfile: Long, dwflags: Int, phregdata: Long, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesA(szpatchpackages: Long, szproductcode: Long, szpropertieslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesW(szpatchpackages: Long, szproductcode: Long, szpropertieslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchA(szpatchpackage: Long, szinstallpackage: Long, einstalltype: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchW(szpatchpackage: Long, szinstallpackage: Long, einstalltype: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionA(szname: Long, dwtransactionattributes: Int, phtransactionhandle: Long, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionW(szname: Long, dwtransactionattributes: Int, phtransactionhandle: Long, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseAllHandles(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseHandle(hany: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoA(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoW(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureA(szproduct: Long, szfeature: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureW(szproduct: Long, szfeature: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductA(szproduct: Long, iinstalllevel: Int, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExA(szproduct: Long, iinstalllevel: Int, einstallstate: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExW(szproduct: Long, iinstalllevel: Int, einstallstate: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductW(szproduct: Long, iinstalllevel: Int, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateRecord(cparams: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoA(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ierrorconditions: Int, ivalidation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoW(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ierrorconditions: Int, ivalidation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformA(hdatabase: Int, sztransformfile: Long, ierrorconditions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformW(hdatabase: Int, sztransformfile: Long, ierrorconditions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseCommit(hdatabase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportA(hdatabase: Int, sztablename: Long, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportW(hdatabase: Int, sztablename: Long, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformA(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ireserved1: Int, ireserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformW(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ireserved1: Int, ireserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysA(hdatabase: Int, sztablename: Long, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysW(hdatabase: Int, sztablename: Long, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportA(hdatabase: Int, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportW(hdatabase: Int, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentA(hdatabase: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentW(hdatabase: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeA(hdatabase: Int, hdatabasemerge: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeW(hdatabase: Int, hdatabasemerge: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewA(hdatabase: Int, szquery: Long, phview: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewW(hdatabase: Int, szquery: Long, phview: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesA(szproductpackagepath: Long, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesW(szproductpackagepath: Long, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceA(szproductcode: Long, szusersid: Long, dwcontext: Int, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceW(szproductcode: Long, szusersid: Long, dwcontext: Int, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionA(hinstall: Int, szaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionW(hinstall: Int, szaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogA(dwlogmode: Int, szlogfile: Long, dwlogattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogW(dwlogmode: Int, szlogfile: Long, dwlogattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableUIPreview(hdatabase: Int, phpreview: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEndTransaction(dwtransactionstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsA(szcomponent: Long, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExA(szcomponent: Long, szusersid: Long, dwcontext: Int, dwproductindex: Int, szproductbuf: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExW(szcomponent: Long, szusersid: Long, dwcontext: Int, dwproductindex: Int, szproductbuf: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsW(szcomponent: Long, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsA(hinstall: Int, szcomponent: Long, dwindex: Int, istate: Int, szdrivebuf: Long, pcchdrivebuf: Long, picost: Long, pitempcost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsW(hinstall: Int, szcomponent: Long, dwindex: Int, istate: Int, szdrivebuf: Long, pcchdrivebuf: Long, picost: Long, pitempcost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersA(szcomponent: Long, iindex: Int, lpqualifierbuf: Long, pcchqualifierbuf: Long, lpapplicationdatabuf: Long, pcchapplicationdatabuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersW(szcomponent: Long, iindex: Int, lpqualifierbuf: Long, pcchqualifierbuf: Long, lpapplicationdatabuf: Long, pcchapplicationdatabuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsA(icomponentindex: Int, lpcomponentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExA(szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledcomponentcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExW(szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledcomponentcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsW(icomponentindex: Int, lpcomponentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesA(szproduct: Long, ifeatureindex: Int, lpfeaturebuf: Long, lpparentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesW(szproduct: Long, ifeatureindex: Int, lpfeaturebuf: Long, lpparentbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesA(szproduct: Long, ipatchindex: Int, lppatchbuf: Long, lptransformsbuf: Long, pcchtransformsbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExA(szproductcode: Long, szusersid: Long, dwcontext: Int, dwfilter: Int, dwindex: Int, szpatchcode: Long, sztargetproductcode: Long, pdwtargetproductcontext: Long, sztargetusersid: Long, pcchtargetusersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExW(szproductcode: Long, szusersid: Long, dwcontext: Int, dwfilter: Int, dwindex: Int, szpatchcode: Long, sztargetproductcode: Long, pdwtargetproductcontext: Long, sztargetusersid: Long, pcchtargetusersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesW(szproduct: Long, ipatchindex: Int, lppatchbuf: Long, lptransformsbuf: Long, pcchtransformsbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsA(iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExA(szproductcode: Long, szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledproductcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExW(szproductcode: Long, szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledproductcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsW(iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsA(lpupgradecode: Long, dwreserved: Int, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsW(lpupgradecode: Long, dwreserved: Int, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionA(hinstall: Int, szcondition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionW(hinstall: Int, szcondition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataA(szpatchpath: Long, dwreserved: Int, szxmldata: Long, pcchxmldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataW(szpatchpath: Long, dwreserved: Int, szxmldata: Long, pcchxmldata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordA(hinstall: Int, hrecord: Int, szresultbuf: Long, pcchresultbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordW(hinstall: Int, hrecord: Int, szresultbuf: Long, pcchresultbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetActiveDatabase(hinstall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathA(szproduct: Long, szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExA(szproductcode: Long, szcomponentcode: Long, szusersid: Long, dwcontext: Int, lpoutpathbuffer: Long, pcchoutpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExW(szproductcode: Long, szcomponentcode: Long, szusersid: Long, dwcontext: Int, lpoutpathbuffer: Long, pcchoutpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathW(szproduct: Long, szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateA(hinstall: Int, szcomponent: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateW(hinstall: Int, szcomponent: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetDatabaseState(hdatabase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostA(hinstall: Int, szfeature: Long, icosttree: Int, istate: Int, picost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostW(hinstall: Int, szfeature: Long, icosttree: Int, istate: Int, picost: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoA(hproduct: Int, szfeature: Long, lpattributes: Long, lptitlebuf: Long, pcchtitlebuf: Long, lphelpbuf: Long, pcchhelpbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoW(hproduct: Int, szfeature: Long, lpattributes: Long, lptitlebuf: Long, pcchtitlebuf: Long, lphelpbuf: Long, pcchhelpbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateA(hinstall: Int, szfeature: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateW(hinstall: Int, szfeature: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageA(szproduct: Long, szfeature: Long, pdwusecount: Long, pwdateused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageW(szproduct: Long, szfeature: Long, pdwusecount: Long, pwdateused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesA(hinstall: Int, szfeature: Long, lpinstallstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesW(hinstall: Int, szfeature: Long, lpinstallstates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashA(szfilepath: Long, dwoptions: Int, phash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashW(szfilepath: Long, dwoptions: Int, phash: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationA(szsignedobjectpath: Long, dwflags: Int, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationW(szsignedobjectpath: Long, dwflags: Int, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionA(szfilepath: Long, lpversionbuf: Long, pcchversionbuf: Long, lplangbuf: Long, pcchlangbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionW(szfilepath: Long, lpversionbuf: Long, pcchversionbuf: Long, lplangbuf: Long, pcchlangbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLanguage(hinstall: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLastErrorRecord(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetMode(hinstall: Int, erunmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListA(szproductcode: Long, szpatchpackages: Long, pcfiles: Long, pphfilerecords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListW(szproductcode: Long, szpatchpackages: Long, pcfiles: Long, pphfilerecords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoA(szpatch: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExA(szpatchcode: Long, szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, lpvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExW(szpatchcode: Long, szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, lpvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoW(szpatch: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeA(szcomponent: Long, lpbuf39: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeW(szcomponent: Long, lpbuf39: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoA(szproduct: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExA(szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExW(szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptA(szscriptfile: Long, lpproductbuf39: Long, plgidlanguage: Long, pdwversion: Long, lpnamebuf: Long, pcchnamebuf: Long, lppackagebuf: Long, pcchpackagebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptW(szscriptfile: Long, lpproductbuf39: Long, plgidlanguage: Long, pdwversion: Long, lpnamebuf: Long, pcchnamebuf: Long, lppackagebuf: Long, pcchpackagebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoW(szproduct: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyA(hproduct: Int, szproperty: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyW(hproduct: Int, szproperty: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyA(hinstall: Int, szname: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyW(hinstall: Int, szname: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetA(szshortcutpath: Long, szproductcode: Long, szfeatureid: Long, szcomponentcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetW(szshortcutpath: Long, szproductcode: Long, szfeatureid: Long, szcomponentcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathA(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathW(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationA(hdatabase: Int, szdatabasepath: Long, uiupdatecount: Int, phsummaryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationW(hdatabase: Int, szdatabasepath: Long, uiupdatecount: Int, phsummaryinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathA(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathW(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoA(szproduct: Long, lpusernamebuf: Long, pcchusernamebuf: Long, lporgnamebuf: Long, pcchorgnamebuf: Long, lpserialbuf: Long, pcchserialbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoW(szproduct: Long, lpusernamebuf: Long, pcchusernamebuf: Long, lporgnamebuf: Long, pcchorgnamebuf: Long, lpserialbuf: Long, pcchserialbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentA(szproduct: Long, szcomponent: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentW(szproduct: Long, szcomponent: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileA(szproduct: Long, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileW(szproduct: Long, szfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductA(szpackagepath: Long, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductW(szpackagepath: Long, szcommandline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedA(szproduct: Long, pfelevated: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedW(szproduct: Long, pfelevated: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiJoinTransaction(htransactionhandle: Int, dwtransactionattributes: Int, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentA(szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentW(szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeA(poldsid: Long, pnewsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeW(poldsid: Long, pnewsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseA(szdatabasepath: Long, szpersist: Long, phdatabase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseW(szdatabasepath: Long, szpersist: Long, phdatabase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageA(szpackagepath: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExA(szpackagepath: Long, dwoptions: Int, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExW(szpackagepath: Long, dwoptions: Int, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageW(szpackagepath: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductA(szproduct: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductW(szproduct: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardA(hpreview: Int, szcontrolname: Long, szbillboard: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardW(hpreview: Int, szcontrolname: Long, szbillboard: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogA(hpreview: Int, szdialogname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogW(hpreview: Int, szdialogname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptA(szscriptfile: Long, sziconfolder: Long, hregdata: Long, fshortcuts: Int, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptW(szscriptfile: Long, sziconfolder: Long, hregdata: Long, fshortcuts: Int, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessMessage(hinstall: Int, emessagetype: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyA(szassemblyname: Long, szappcontext: Long, dwinstallmode: Int, dwassemblyinfo: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyW(szassemblyname: Long, szappcontext: Long, dwinstallmode: Int, dwassemblyinfo: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentA(szproduct: Long, szfeature: Long, szcomponent: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentW(szproduct: Long, szfeature: Long, szcomponent: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentA(szcategory: Long, szqualifier: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExA(szcategory: Long, szqualifier: Long, dwinstallmode: Int, szproduct: Long, dwunused1: Int, dwunused2: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExW(szcategory: Long, szqualifier: Long, dwinstallmode: Int, szproduct: Long, dwunused1: Int, dwunused2: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentW(szcategory: Long, szqualifier: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateA(szproductcode: Long, szusersid: Long, dwcontext: Int, szcomponentcode: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateW(szproductcode: Long, szusersid: Long, dwcontext: Int, szcomponentcode: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateA(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExA(szproductcode: Long, szusersid: Long, dwcontext: Int, szfeature: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExW(szproductcode: Long, szusersid: Long, dwcontext: Int, szfeature: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateW(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateA(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateW(szproduct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordClearData(hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordDataSize(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetFieldCount(hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetInteger(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringA(hrecord: Int, ifield: Int, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringW(hrecord: Int, ifield: Int, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordIsNull(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordReadStream(hrecord: Int, ifield: Int, szdatabuf: Long, pcbdatabuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetInteger(hrecord: Int, ifield: Int, ivalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamA(hrecord: Int, ifield: Int, szfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamW(hrecord: Int, ifield: Int, szfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringA(hrecord: Int, ifield: Int, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringW(hrecord: Int, ifield: Int, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureA(szproduct: Long, szfeature: Long, dwreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureW(szproduct: Long, szfeature: Long, dwreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductA(szproduct: Long, szreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductW(szproduct: Long, szreinstallmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesA(szpatchlist: Long, szproductcode: Long, euninstalltype: Int, szpropertylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesW(szpatchlist: Long, szproductcode: Long, euninstalltype: Int, szpropertylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceA(hinstall: Int, sztable: Long, isequencemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceW(hinstall: Int, sztable: Long, isequencemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateA(hinstall: Int, szcomponent: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateW(hinstall: Int, szcomponent: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIA(puihandler: Long, dwmessagefilter: Int, pvcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIRecord(puihandler: Long, dwmessagefilter: Int, pvcontext: Long, ppuiprevhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIW(puihandler: Long, dwmessagefilter: Int, pvcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesA(hinstall: Int, szfeature: Long, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesW(hinstall: Int, szfeature: Long, dwattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateA(hinstall: Int, szfeature: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateW(hinstall: Int, szfeature: Long, istate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInstallLevel(hinstall: Int, iinstalllevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInternalUI(dwuilevel: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetMode(hinstall: Int, erunmode: Int, fstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyA(hinstall: Int, szname: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyW(hinstall: Int, szname: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathA(hinstall: Int, szfolder: Long, szfolderpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathW(hinstall: Int, szfolder: Long, szfolderpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int, szvolumelabel: Long, szdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int, szvolumelabel: Long, szdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceA(szproduct: Long, szusername: Long, dwreserved: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceW(szproduct: Long, szusername: Long, dwreserved: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllA(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllW(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, pdwdiskid: Long, szvolumelabel: Long, pcchvolumelabel: Long, szdiskprompt: Long, pcchdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, pdwdiskid: Long, szvolumelabel: Long, pcchvolumelabel: Long, szdiskprompt: Long, pcchdiskprompt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, szsource: Long, pcchsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, szsource: Long, pcchsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionA(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionW(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyA(hsummaryinfo: Int, uiproperty: Int, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyCount(hsummaryinfo: Int, puipropertycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyW(hsummaryinfo: Int, uiproperty: Int, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoPersist(hsummaryinfo: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyA(hsummaryinfo: Int, uiproperty: Int, uidatatype: Int, ivalue: Int, pftvalue: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyW(hsummaryinfo: Int, uiproperty: Int, uidatatype: Int, ivalue: Int, pftvalue: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureA(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExA(szproduct: Long, szfeature: Long, dwinstallmode: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExW(szproduct: Long, szfeature: Long, dwinstallmode: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureW(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyDiskSpace(hinstall: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageA(szpackagepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageW(szpackagepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiViewClose(hview: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiViewExecute(hview: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiViewFetch(hview: Int, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetColumnInfo(hview: Int, ecolumninfo: Int, phrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorA(hview: Int, szcolumnnamebuffer: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorW(hview: Int, szcolumnnamebuffer: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_msiViewModify(hview: Int, emodifymode: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_normalizeFileForPatchSignature(filebuffer: Long, filesize: Int, optionflags: Int, optiondata: Long, newfilecoffbase: Int, newfilecofftime: Int, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxSettingsW(dwflags: Int, hactctx: Long, settingsnamespace: Long, settingname: Long, pvbuffer: Long, dwbuffer: Long, pdwwrittenorrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxW(dwflags: Int, hactctx: Long, pvsubinstance: Long, ulinfoclass: Int, pvbuffer: Long, cbbuffer: Long, pcbwrittenorrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_releaseActCtx(hactctx: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_sfcGetNextProtectedFile(rpchandle: Long, protfiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsFileProtected(rpchandle: Long, protfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsKeyProtected(keyhandle: Long, subkeyname: Long, keysam: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_sfpVerifyFile(pszfilename: Long, pszerror: Long, dwerrsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileA(patchfilename: Long, oldfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: Int, oldfilebuffer: Long, oldfilesize: Int, newfilesize: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByHandles(patchfilehandle: Long, oldfilehandle: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileW(patchfilename: Long, oldfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_applicationinstallationandservicing_zombifyActCtx(hactctx: Long): Int
}

public actual fun activateActCtx(hactctx: Handle, lpcookie: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_activateActCtx((hactctx?.value ?: 0L), (lpcookie?.value ?: 0L))

public actual fun addRefActCtx(hactctx: Handle) {
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_addRefActCtx((hactctx?.value ?: 0L))
}

public actual fun applyDeltaA(applyflags: Long, lpsourcename: Pcstr, lpdeltaname: Pcstr, lptargetname: Pcstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaA(applyflags, (lpsourcename?.value ?: 0L), (lpdeltaname?.value ?: 0L), (lptargetname?.value ?: 0L))

public actual fun applyDeltaB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: COpaquePointer?): Bool =
    0

public actual fun applyDeltaGetReverseB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lpreversefiletime: COpaquePointer?, lptarget: COpaquePointer?, lptargetreverse: COpaquePointer?): Bool =
    0

public actual fun applyDeltaProvidedB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: COpaquePointer?, utargetsize: ULong): Bool =
    0

public actual fun applyDeltaW(applyflags: Long, lpsourcename: Pcwstr, lpdeltaname: Pcwstr, lptargetname: Pcwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyDeltaW(applyflags, (lpsourcename?.value ?: 0L), (lpdeltaname?.value ?: 0L), (lptargetname?.value ?: 0L))

public actual fun applyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileA((patchfilename?.value ?: 0L), (oldfilename?.value ?: 0L), (newfilename?.value ?: 0L), applyoptionflags.toInt())

public actual fun applyPatchToFileByBuffers(patchfilemapped: COpaquePointer?, patchfilesize: UInt, oldfilemapped: COpaquePointer?, oldfilesize: UInt, newfilebuffer: COpaquePointer?, newfilebuffersize: UInt, newfileactualsize: COpaquePointer?, newfiletime: COpaquePointer?, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByBuffers((patchfilemapped?.value ?: 0L), patchfilesize.toInt(), (oldfilemapped?.value ?: 0L), oldfilesize.toInt(), (newfilebuffer?.value ?: 0L), newfilebuffersize.toInt(), (newfileactualsize?.value ?: 0L), (newfiletime?.value ?: 0L), applyoptionflags.toInt(), 0L, (callbackcontext?.value ?: 0L))

public actual fun applyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandles((patchfilehandle?.value ?: 0L), (oldfilehandle?.value ?: 0L), (newfilehandle?.value ?: 0L), applyoptionflags.toInt())

public actual fun applyPatchToFileByHandlesEx(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileByHandlesEx((patchfilehandle?.value ?: 0L), (oldfilehandle?.value ?: 0L), (newfilehandle?.value ?: 0L), applyoptionflags.toInt(), 0L, (callbackcontext?.value ?: 0L))

public actual fun applyPatchToFileExA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExA((patchfilename?.value ?: 0L), (oldfilename?.value ?: 0L), (newfilename?.value ?: 0L), applyoptionflags.toInt(), 0L, (callbackcontext?.value ?: 0L))

public actual fun applyPatchToFileExW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileExW((patchfilename?.value ?: 0L), (oldfilename?.value ?: 0L), (newfilename?.value ?: 0L), applyoptionflags.toInt(), 0L, (callbackcontext?.value ?: 0L))

public actual fun applyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_applyPatchToFileW((patchfilename?.value ?: 0L), (oldfilename?.value ?: 0L), (newfilename?.value ?: 0L), applyoptionflags.toInt())

public actual fun createActCtxA(pactctx: COpaquePointer?): Handle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxA((pactctx?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createActCtxW(pactctx: COpaquePointer?): Handle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createActCtxW((pactctx?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcstr, lptargetname: Pcstr, lpsourceoptionsname: Pcstr, lptargetoptionsname: Pcstr, globaloptions: DeltaInput, lptargetfiletime: COpaquePointer?, hashalgid: AlgId, lpdeltaname: Pcstr): Bool =
    0

public actual fun createDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DeltaInput, target: DeltaInput, sourceoptions: DeltaInput, targetoptions: DeltaInput, globaloptions: DeltaInput, lptargetfiletime: COpaquePointer?, hashalgid: AlgId, lpdelta: COpaquePointer?): Bool =
    0

public actual fun createDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcwstr, lptargetname: Pcwstr, lpsourceoptionsname: Pcwstr, lptargetoptionsname: Pcwstr, globaloptions: DeltaInput, lptargetfiletime: COpaquePointer?, hashalgid: AlgId, lpdeltaname: Pcwstr): Bool =
    0

public actual fun createPatchFileA(oldfilename: Pcstr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileA((oldfilename?.value ?: 0L), (newfilename?.value ?: 0L), (patchfilename?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L))

public actual fun createPatchFileByHandles(oldfilehandle: Handle, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandles((oldfilehandle?.value ?: 0L), (newfilehandle?.value ?: 0L), (patchfilehandle?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L))

public actual fun createPatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: COpaquePointer?, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: COpaquePointer?, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileByHandlesEx(oldfilecount.toInt(), (oldfileinfoarray?.value ?: 0L), (newfilehandle?.value ?: 0L), (patchfilehandle?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L))

public actual fun createPatchFileExA(oldfilecount: UInt, oldfileinfoarray: COpaquePointer?, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: COpaquePointer?, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExA(oldfilecount.toInt(), (oldfileinfoarray?.value ?: 0L), (newfilename?.value ?: 0L), (patchfilename?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L))

public actual fun createPatchFileExW(oldfilecount: UInt, oldfileinfoarray: COpaquePointer?, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: COpaquePointer?, progresscallback: PpatchProgressCallback, callbackcontext: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileExW(oldfilecount.toInt(), (oldfileinfoarray?.value ?: 0L), (newfilename?.value ?: 0L), (patchfilename?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L))

public actual fun createPatchFileW(oldfilename: Pcwstr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_createPatchFileW((oldfilename?.value ?: 0L), (newfilename?.value ?: 0L), (patchfilename?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L))

public actual fun deactivateActCtx(dwflags: UInt, ulcookie: ULong): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_deactivateActCtx(dwflags.toInt(), ulcookie.toLong())

public actual fun deltaFree(lpmemory: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_deltaFree((lpmemory?.value ?: 0L))

public actual fun deltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DeltaInput, lpsource: COpaquePointer?, usourcesize: ULong): Bool =
    0

public actual fun extractPatchHeaderToFileA(patchfilename: Pcstr, patchheaderfilename: Pcstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileA((patchfilename?.value ?: 0L), (patchheaderfilename?.value ?: 0L))

public actual fun extractPatchHeaderToFileByHandles(patchfilehandle: Handle, patchheaderfilehandle: Handle): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileByHandles((patchfilehandle?.value ?: 0L), (patchheaderfilehandle?.value ?: 0L))

public actual fun extractPatchHeaderToFileW(patchfilename: Pcwstr, patchheaderfilename: Pcwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_extractPatchHeaderToFileW((patchfilename?.value ?: 0L), (patchheaderfilename?.value ?: 0L))

public actual fun findActCtxSectionGuid(dwflags: UInt, lpextensionguid: COpaquePointer?, ulsectionid: UInt, lpguidtofind: COpaquePointer?, returneddata: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionGuid(dwflags.toInt(), (lpextensionguid?.value ?: 0L), ulsectionid.toInt(), (lpguidtofind?.value ?: 0L), (returneddata?.value ?: 0L))

public actual fun findActCtxSectionStringA(dwflags: UInt, lpextensionguid: COpaquePointer?, ulsectionid: UInt, lpstringtofind: Pcstr, returneddata: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringA(dwflags.toInt(), (lpextensionguid?.value ?: 0L), ulsectionid.toInt(), (lpstringtofind?.value ?: 0L), (returneddata?.value ?: 0L))

public actual fun findActCtxSectionStringW(dwflags: UInt, lpextensionguid: COpaquePointer?, ulsectionid: UInt, lpstringtofind: Pcwstr, returneddata: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_findActCtxSectionStringW(dwflags.toInt(), (lpextensionguid?.value ?: 0L), ulsectionid.toInt(), (lpstringtofind?.value ?: 0L), (returneddata?.value ?: 0L))

public actual fun getCurrentActCtx(lphactctx: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getCurrentActCtx((lphactctx?.value ?: 0L))

public actual fun getDeltaInfoA(lpdeltaname: Pcstr, lpheaderinfo: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoA((lpdeltaname?.value ?: 0L), (lpheaderinfo?.value ?: 0L))

public actual fun getDeltaInfoB(delta: DeltaInput, lpheaderinfo: COpaquePointer?): Bool =
    0

public actual fun getDeltaInfoW(lpdeltaname: Pcwstr, lpheaderinfo: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaInfoW((lpdeltaname?.value ?: 0L), (lpheaderinfo?.value ?: 0L))

public actual fun getDeltaSignatureA(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcstr, lphash: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureA(filetypeset, hashalgid.toInt(), (lpsourcename?.value ?: 0L), (lphash?.value ?: 0L))

public actual fun getDeltaSignatureB(filetypeset: Long, hashalgid: AlgId, source: DeltaInput, lphash: COpaquePointer?): Bool =
    0

public actual fun getDeltaSignatureW(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcwstr, lphash: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getDeltaSignatureW(filetypeset, hashalgid.toInt(), (lpsourcename?.value ?: 0L), (lphash?.value ?: 0L))

public actual fun getFilePatchSignatureA(filename: Pcstr, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureA((filename?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L), retainrangecount.toInt(), (retainrangearray?.value ?: 0L), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L))

public actual fun getFilePatchSignatureByBuffer(filebufferwritable: COpaquePointer?, filesize: UInt, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByBuffer((filebufferwritable?.value ?: 0L), filesize.toInt(), optionflags.toInt(), (optiondata?.value ?: 0L), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L), retainrangecount.toInt(), (retainrangearray?.value ?: 0L), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L))

public actual fun getFilePatchSignatureByHandle(filehandle: Handle, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureByHandle((filehandle?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L), retainrangecount.toInt(), (retainrangearray?.value ?: 0L), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L))

public actual fun getFilePatchSignatureW(filename: Pcwstr, optionflags: UInt, optiondata: COpaquePointer?, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?, signaturebuffersize: UInt, signaturebuffer: Pwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_getFilePatchSignatureW((filename?.value ?: 0L), optionflags.toInt(), (optiondata?.value ?: 0L), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L), retainrangecount.toInt(), (retainrangearray?.value ?: 0L), signaturebuffersize.toInt(), (signaturebuffer?.value ?: 0L))

public actual fun msiAdvertiseProductA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductA((szpackagepath?.value ?: 0L), (szscriptfilepath?.value ?: 0L), (sztransforms?.value ?: 0L), lgidlanguage.toShort()).toUInt()

public actual fun msiAdvertiseProductExA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExA((szpackagepath?.value ?: 0L), (szscriptfilepath?.value ?: 0L), (sztransforms?.value ?: 0L), lgidlanguage.toShort(), dwplatform.toInt(), dwoptions.toInt()).toUInt()

public actual fun msiAdvertiseProductExW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductExW((szpackagepath?.value ?: 0L), (szscriptfilepath?.value ?: 0L), (sztransforms?.value ?: 0L), lgidlanguage.toShort(), dwplatform.toInt(), dwoptions.toInt()).toUInt()

public actual fun msiAdvertiseProductW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseProductW((szpackagepath?.value ?: 0L), (szscriptfilepath?.value ?: 0L), (sztransforms?.value ?: 0L), lgidlanguage.toShort()).toUInt()

public actual fun msiAdvertiseScriptA(szscriptfile: Pcstr, dwflags: UInt, phregdata: COpaquePointer?, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptA((szscriptfile?.value ?: 0L), dwflags.toInt(), (phregdata?.value ?: 0L), fremoveitems).toUInt()

public actual fun msiAdvertiseScriptW(szscriptfile: Pcwstr, dwflags: UInt, phregdata: COpaquePointer?, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiAdvertiseScriptW((szscriptfile?.value ?: 0L), dwflags.toInt(), (phregdata?.value ?: 0L), fremoveitems).toUInt()

public actual fun msiApplyMultiplePatchesA(szpatchpackages: Pcstr, szproductcode: Pcstr, szpropertieslist: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesA((szpatchpackages?.value ?: 0L), (szproductcode?.value ?: 0L), (szpropertieslist?.value ?: 0L)).toUInt()

public actual fun msiApplyMultiplePatchesW(szpatchpackages: Pcwstr, szproductcode: Pcwstr, szpropertieslist: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyMultiplePatchesW((szpatchpackages?.value ?: 0L), (szproductcode?.value ?: 0L), (szpropertieslist?.value ?: 0L)).toUInt()

public actual fun msiApplyPatchA(szpatchpackage: Pcstr, szinstallpackage: Pcstr, einstalltype: Installtype, szcommandline: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchA((szpatchpackage?.value ?: 0L), (szinstallpackage?.value ?: 0L), einstalltype, (szcommandline?.value ?: 0L)).toUInt()

public actual fun msiApplyPatchW(szpatchpackage: Pcwstr, szinstallpackage: Pcwstr, einstalltype: Installtype, szcommandline: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiApplyPatchW((szpatchpackage?.value ?: 0L), (szinstallpackage?.value ?: 0L), einstalltype, (szcommandline?.value ?: 0L)).toUInt()

public actual fun msiBeginTransactionA(szname: Pcstr, dwtransactionattributes: UInt, phtransactionhandle: COpaquePointer?, phchangeofownerevent: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionA((szname?.value ?: 0L), dwtransactionattributes.toInt(), (phtransactionhandle?.value ?: 0L), (phchangeofownerevent?.value ?: 0L)).toUInt()

public actual fun msiBeginTransactionW(szname: Pcwstr, dwtransactionattributes: UInt, phtransactionhandle: COpaquePointer?, phchangeofownerevent: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiBeginTransactionW((szname?.value ?: 0L), dwtransactionattributes.toInt(), (phtransactionhandle?.value ?: 0L), (phchangeofownerevent?.value ?: 0L)).toUInt()

public actual fun msiCloseAllHandles(): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseAllHandles().toUInt()

public actual fun msiCloseHandle(hany: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiCloseHandle(hany.toInt()).toUInt()

public actual fun msiCollectUserInfoA(szproduct: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoA((szproduct?.value ?: 0L)).toUInt()

public actual fun msiCollectUserInfoW(szproduct: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiCollectUserInfoW((szproduct?.value ?: 0L)).toUInt()

public actual fun msiConfigureFeatureA(szproduct: Pcstr, szfeature: Pcstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureA((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), einstallstate).toUInt()

public actual fun msiConfigureFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureFeatureW((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), einstallstate).toUInt()

public actual fun msiConfigureProductA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductA((szproduct?.value ?: 0L), iinstalllevel, einstallstate).toUInt()

public actual fun msiConfigureProductExA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExA((szproduct?.value ?: 0L), iinstalllevel, einstallstate, (szcommandline?.value ?: 0L)).toUInt()

public actual fun msiConfigureProductExW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductExW((szproduct?.value ?: 0L), iinstalllevel, einstallstate, (szcommandline?.value ?: 0L)).toUInt()

public actual fun msiConfigureProductW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiConfigureProductW((szproduct?.value ?: 0L), iinstalllevel, einstallstate).toUInt()

public actual fun msiCreateRecord(cparams: UInt): Msihandle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateRecord(cparams.toInt()).toUInt()

public actual fun msiCreateTransformSummaryInfoA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoA(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L), ierrorconditions, ivalidation).toUInt()

public actual fun msiCreateTransformSummaryInfoW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiCreateTransformSummaryInfoW(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L), ierrorconditions, ivalidation).toUInt()

public actual fun msiDatabaseApplyTransformA(hdatabase: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformA(hdatabase.toInt(), (sztransformfile?.value ?: 0L), ierrorconditions).toUInt()

public actual fun msiDatabaseApplyTransformW(hdatabase: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseApplyTransformW(hdatabase.toInt(), (sztransformfile?.value ?: 0L), ierrorconditions).toUInt()

public actual fun msiDatabaseCommit(hdatabase: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseCommit(hdatabase.toInt()).toUInt()

public actual fun msiDatabaseExportA(hdatabase: Msihandle, sztablename: Pcstr, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportA(hdatabase.toInt(), (sztablename?.value ?: 0L), (szfolderpath?.value ?: 0L), (szfilename?.value ?: 0L)).toUInt()

public actual fun msiDatabaseExportW(hdatabase: Msihandle, sztablename: Pcwstr, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseExportW(hdatabase.toInt(), (sztablename?.value ?: 0L), (szfolderpath?.value ?: 0L), (szfilename?.value ?: 0L)).toUInt()

public actual fun msiDatabaseGenerateTransformA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ireserved1: Int, ireserved2: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformA(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L), ireserved1, ireserved2).toUInt()

public actual fun msiDatabaseGenerateTransformW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ireserved1: Int, ireserved2: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGenerateTransformW(hdatabase.toInt(), hdatabasereference.toInt(), (sztransformfile?.value ?: 0L), ireserved1, ireserved2).toUInt()

public actual fun msiDatabaseGetPrimaryKeysA(hdatabase: Msihandle, sztablename: Pcstr, phrecord: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysA(hdatabase.toInt(), (sztablename?.value ?: 0L), (phrecord?.value ?: 0L)).toUInt()

public actual fun msiDatabaseGetPrimaryKeysW(hdatabase: Msihandle, sztablename: Pcwstr, phrecord: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseGetPrimaryKeysW(hdatabase.toInt(), (sztablename?.value ?: 0L), (phrecord?.value ?: 0L)).toUInt()

public actual fun msiDatabaseImportA(hdatabase: Msihandle, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportA(hdatabase.toInt(), (szfolderpath?.value ?: 0L), (szfilename?.value ?: 0L)).toUInt()

public actual fun msiDatabaseImportW(hdatabase: Msihandle, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseImportW(hdatabase.toInt(), (szfolderpath?.value ?: 0L), (szfilename?.value ?: 0L)).toUInt()

public actual fun msiDatabaseIsTablePersistentA(hdatabase: Msihandle, sztablename: Pcstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentA(hdatabase.toInt(), (sztablename?.value ?: 0L))

public actual fun msiDatabaseIsTablePersistentW(hdatabase: Msihandle, sztablename: Pcwstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseIsTablePersistentW(hdatabase.toInt(), (sztablename?.value ?: 0L))

public actual fun msiDatabaseMergeA(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeA(hdatabase.toInt(), hdatabasemerge.toInt(), (sztablename?.value ?: 0L)).toUInt()

public actual fun msiDatabaseMergeW(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseMergeW(hdatabase.toInt(), hdatabasemerge.toInt(), (sztablename?.value ?: 0L)).toUInt()

public actual fun msiDatabaseOpenViewA(hdatabase: Msihandle, szquery: Pcstr, phview: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewA(hdatabase.toInt(), (szquery?.value ?: 0L), (phview?.value ?: 0L)).toUInt()

public actual fun msiDatabaseOpenViewW(hdatabase: Msihandle, szquery: Pcwstr, phview: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDatabaseOpenViewW(hdatabase.toInt(), (szquery?.value ?: 0L), (phview?.value ?: 0L)).toUInt()

public actual fun msiDetermineApplicablePatchesA(szproductpackagepath: Pcstr, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesA((szproductpackagepath?.value ?: 0L), cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L)).toUInt()

public actual fun msiDetermineApplicablePatchesW(szproductpackagepath: Pcwstr, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDetermineApplicablePatchesW((szproductpackagepath?.value ?: 0L), cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L)).toUInt()

public actual fun msiDeterminePatchSequenceA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceA((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L)).toUInt()

public actual fun msiDeterminePatchSequenceW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDeterminePatchSequenceW((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, cpatchinfo.toInt(), (ppatchinfo?.value ?: 0L)).toUInt()

public actual fun msiDoActionA(hinstall: Msihandle, szaction: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionA(hinstall.toInt(), (szaction?.value ?: 0L)).toUInt()

public actual fun msiDoActionW(hinstall: Msihandle, szaction: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiDoActionW(hinstall.toInt(), (szaction?.value ?: 0L)).toUInt()

public actual fun msiEnableLogA(dwlogmode: UInt, szlogfile: Pcstr, dwlogattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogA(dwlogmode.toInt(), (szlogfile?.value ?: 0L), dwlogattributes.toInt()).toUInt()

public actual fun msiEnableLogW(dwlogmode: UInt, szlogfile: Pcwstr, dwlogattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableLogW(dwlogmode.toInt(), (szlogfile?.value ?: 0L), dwlogattributes.toInt()).toUInt()

public actual fun msiEnableUIPreview(hdatabase: Msihandle, phpreview: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnableUIPreview(hdatabase.toInt(), (phpreview?.value ?: 0L)).toUInt()

public actual fun msiEndTransaction(dwtransactionstate: Msitransactionstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEndTransaction(dwtransactionstate.toInt()).toUInt()

public actual fun msiEnumClientsA(szcomponent: Pcstr, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsA((szcomponent?.value ?: 0L), iproductindex.toInt(), (lpproductbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumClientsExA(szcomponent: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pstr, pdwinstalledcontext: COpaquePointer?, szsid: Pstr, pcchsid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExA((szcomponent?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext.toInt(), dwproductindex.toInt(), (szproductbuf?.value ?: 0L), (pdwinstalledcontext?.value ?: 0L), (szsid?.value ?: 0L), (pcchsid?.value ?: 0L)).toUInt()

public actual fun msiEnumClientsExW(szcomponent: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pwstr, pdwinstalledcontext: COpaquePointer?, szsid: Pwstr, pcchsid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsExW((szcomponent?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext.toInt(), dwproductindex.toInt(), (szproductbuf?.value ?: 0L), (pdwinstalledcontext?.value ?: 0L), (szsid?.value ?: 0L), (pcchsid?.value ?: 0L)).toUInt()

public actual fun msiEnumClientsW(szcomponent: Pcwstr, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumClientsW((szcomponent?.value ?: 0L), iproductindex.toInt(), (lpproductbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentCostsA(hinstall: Msihandle, szcomponent: Pcstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pstr, pcchdrivebuf: COpaquePointer?, picost: COpaquePointer?, pitempcost: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsA(hinstall.toInt(), (szcomponent?.value ?: 0L), dwindex.toInt(), istate, (szdrivebuf?.value ?: 0L), (pcchdrivebuf?.value ?: 0L), (picost?.value ?: 0L), (pitempcost?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentCostsW(hinstall: Msihandle, szcomponent: Pcwstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pwstr, pcchdrivebuf: COpaquePointer?, picost: COpaquePointer?, pitempcost: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentCostsW(hinstall.toInt(), (szcomponent?.value ?: 0L), dwindex.toInt(), istate, (szdrivebuf?.value ?: 0L), (pcchdrivebuf?.value ?: 0L), (picost?.value ?: 0L), (pitempcost?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentQualifiersA(szcomponent: Pcstr, iindex: UInt, lpqualifierbuf: Pstr, pcchqualifierbuf: COpaquePointer?, lpapplicationdatabuf: Pstr, pcchapplicationdatabuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersA((szcomponent?.value ?: 0L), iindex.toInt(), (lpqualifierbuf?.value ?: 0L), (pcchqualifierbuf?.value ?: 0L), (lpapplicationdatabuf?.value ?: 0L), (pcchapplicationdatabuf?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentQualifiersW(szcomponent: Pcwstr, iindex: UInt, lpqualifierbuf: Pwstr, pcchqualifierbuf: COpaquePointer?, lpapplicationdatabuf: Pwstr, pcchapplicationdatabuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentQualifiersW((szcomponent?.value ?: 0L), iindex.toInt(), (lpqualifierbuf?.value ?: 0L), (pcchqualifierbuf?.value ?: 0L), (lpapplicationdatabuf?.value ?: 0L), (pcchapplicationdatabuf?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsA(icomponentindex.toInt(), (lpcomponentbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentsExA(szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pstr, pdwinstalledcontext: COpaquePointer?, szsid: Pstr, pcchsid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExA((szusersid?.value ?: 0L), dwcontext.toInt(), dwindex.toInt(), (szinstalledcomponentcode?.value ?: 0L), (pdwinstalledcontext?.value ?: 0L), (szsid?.value ?: 0L), (pcchsid?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentsExW(szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pwstr, pdwinstalledcontext: COpaquePointer?, szsid: Pwstr, pcchsid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsExW((szusersid?.value ?: 0L), dwcontext.toInt(), dwindex.toInt(), (szinstalledcomponentcode?.value ?: 0L), (pdwinstalledcontext?.value ?: 0L), (szsid?.value ?: 0L), (pcchsid?.value ?: 0L)).toUInt()

public actual fun msiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumComponentsW(icomponentindex.toInt(), (lpcomponentbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumFeaturesA(szproduct: Pcstr, ifeatureindex: UInt, lpfeaturebuf: Pstr, lpparentbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesA((szproduct?.value ?: 0L), ifeatureindex.toInt(), (lpfeaturebuf?.value ?: 0L), (lpparentbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumFeaturesW(szproduct: Pcwstr, ifeatureindex: UInt, lpfeaturebuf: Pwstr, lpparentbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumFeaturesW((szproduct?.value ?: 0L), ifeatureindex.toInt(), (lpfeaturebuf?.value ?: 0L), (lpparentbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumPatchesA(szproduct: Pcstr, ipatchindex: UInt, lppatchbuf: Pstr, lptransformsbuf: Pstr, pcchtransformsbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesA((szproduct?.value ?: 0L), ipatchindex.toInt(), (lppatchbuf?.value ?: 0L), (lptransformsbuf?.value ?: 0L), (pcchtransformsbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumPatchesExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pstr, sztargetproductcode: Pstr, pdwtargetproductcontext: COpaquePointer?, sztargetusersid: Pstr, pcchtargetusersid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExA((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), (szpatchcode?.value ?: 0L), (sztargetproductcode?.value ?: 0L), (pdwtargetproductcontext?.value ?: 0L), (sztargetusersid?.value ?: 0L), (pcchtargetusersid?.value ?: 0L)).toUInt()

public actual fun msiEnumPatchesExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pwstr, sztargetproductcode: Pwstr, pdwtargetproductcontext: COpaquePointer?, sztargetusersid: Pwstr, pcchtargetusersid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesExW((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), (szpatchcode?.value ?: 0L), (sztargetproductcode?.value ?: 0L), (pdwtargetproductcontext?.value ?: 0L), (sztargetusersid?.value ?: 0L), (pcchtargetusersid?.value ?: 0L)).toUInt()

public actual fun msiEnumPatchesW(szproduct: Pcwstr, ipatchindex: UInt, lppatchbuf: Pwstr, lptransformsbuf: Pwstr, pcchtransformsbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumPatchesW((szproduct?.value ?: 0L), ipatchindex.toInt(), (lppatchbuf?.value ?: 0L), (lptransformsbuf?.value ?: 0L), (pcchtransformsbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumProductsA(iproductindex: UInt, lpproductbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsA(iproductindex.toInt(), (lpproductbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumProductsExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pstr, pdwinstalledcontext: COpaquePointer?, szsid: Pstr, pcchsid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExA((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext.toInt(), dwindex.toInt(), (szinstalledproductcode?.value ?: 0L), (pdwinstalledcontext?.value ?: 0L), (szsid?.value ?: 0L), (pcchsid?.value ?: 0L)).toUInt()

public actual fun msiEnumProductsExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pwstr, pdwinstalledcontext: COpaquePointer?, szsid: Pwstr, pcchsid: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsExW((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext.toInt(), dwindex.toInt(), (szinstalledproductcode?.value ?: 0L), (pdwinstalledcontext?.value ?: 0L), (szsid?.value ?: 0L), (pcchsid?.value ?: 0L)).toUInt()

public actual fun msiEnumProductsW(iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumProductsW(iproductindex.toInt(), (lpproductbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumRelatedProductsA(lpupgradecode: Pcstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsA((lpupgradecode?.value ?: 0L), dwreserved.toInt(), iproductindex.toInt(), (lpproductbuf?.value ?: 0L)).toUInt()

public actual fun msiEnumRelatedProductsW(lpupgradecode: Pcwstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEnumRelatedProductsW((lpupgradecode?.value ?: 0L), dwreserved.toInt(), iproductindex.toInt(), (lpproductbuf?.value ?: 0L)).toUInt()

public actual fun msiEvaluateConditionA(hinstall: Msihandle, szcondition: Pcstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionA(hinstall.toInt(), (szcondition?.value ?: 0L))

public actual fun msiEvaluateConditionW(hinstall: Msihandle, szcondition: Pcwstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiEvaluateConditionW(hinstall.toInt(), (szcondition?.value ?: 0L))

public actual fun msiExtractPatchXMLDataA(szpatchpath: Pcstr, dwreserved: UInt, szxmldata: Pstr, pcchxmldata: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataA((szpatchpath?.value ?: 0L), dwreserved.toInt(), (szxmldata?.value ?: 0L), (pcchxmldata?.value ?: 0L)).toUInt()

public actual fun msiExtractPatchXMLDataW(szpatchpath: Pcwstr, dwreserved: UInt, szxmldata: Pwstr, pcchxmldata: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiExtractPatchXMLDataW((szpatchpath?.value ?: 0L), dwreserved.toInt(), (szxmldata?.value ?: 0L), (pcchxmldata?.value ?: 0L)).toUInt()

public actual fun msiFormatRecordA(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pstr, pcchresultbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordA(hinstall.toInt(), hrecord.toInt(), (szresultbuf?.value ?: 0L), (pcchresultbuf?.value ?: 0L)).toUInt()

public actual fun msiFormatRecordW(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pwstr, pcchresultbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiFormatRecordW(hinstall.toInt(), hrecord.toInt(), (szresultbuf?.value ?: 0L), (pcchresultbuf?.value ?: 0L)).toUInt()

public actual fun msiGetActiveDatabase(hinstall: Msihandle): Msihandle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetActiveDatabase(hinstall.toInt()).toUInt()

public actual fun msiGetComponentPathA(szproduct: Pcstr, szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: COpaquePointer?): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathA((szproduct?.value ?: 0L), (szcomponent?.value ?: 0L), (lppathbuf?.value ?: 0L), (pcchbuf?.value ?: 0L))

public actual fun msiGetComponentPathExA(szproductcode: Pcstr, szcomponentcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pstr, pcchoutpathbuffer: COpaquePointer?): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExA((szproductcode?.value ?: 0L), (szcomponentcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (lpoutpathbuffer?.value ?: 0L), (pcchoutpathbuffer?.value ?: 0L))

public actual fun msiGetComponentPathExW(szproductcode: Pcwstr, szcomponentcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pwstr, pcchoutpathbuffer: COpaquePointer?): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathExW((szproductcode?.value ?: 0L), (szcomponentcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (lpoutpathbuffer?.value ?: 0L), (pcchoutpathbuffer?.value ?: 0L))

public actual fun msiGetComponentPathW(szproduct: Pcwstr, szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: COpaquePointer?): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentPathW((szproduct?.value ?: 0L), (szcomponent?.value ?: 0L), (lppathbuf?.value ?: 0L), (pcchbuf?.value ?: 0L))

public actual fun msiGetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateA(hinstall.toInt(), (szcomponent?.value ?: 0L), (piinstalled?.value ?: 0L), (piaction?.value ?: 0L)).toUInt()

public actual fun msiGetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetComponentStateW(hinstall.toInt(), (szcomponent?.value ?: 0L), (piinstalled?.value ?: 0L), (piaction?.value ?: 0L)).toUInt()

public actual fun msiGetDatabaseState(hdatabase: Msihandle): Msidbstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetDatabaseState(hdatabase.toInt())

public actual fun msiGetFeatureCostA(hinstall: Msihandle, szfeature: Pcstr, icosttree: Msicosttree, istate: Installstate, picost: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostA(hinstall.toInt(), (szfeature?.value ?: 0L), icosttree, istate, (picost?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureCostW(hinstall: Msihandle, szfeature: Pcwstr, icosttree: Msicosttree, istate: Installstate, picost: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureCostW(hinstall.toInt(), (szfeature?.value ?: 0L), icosttree, istate, (picost?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureInfoA(hproduct: Msihandle, szfeature: Pcstr, lpattributes: COpaquePointer?, lptitlebuf: Pstr, pcchtitlebuf: COpaquePointer?, lphelpbuf: Pstr, pcchhelpbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoA(hproduct.toInt(), (szfeature?.value ?: 0L), (lpattributes?.value ?: 0L), (lptitlebuf?.value ?: 0L), (pcchtitlebuf?.value ?: 0L), (lphelpbuf?.value ?: 0L), (pcchhelpbuf?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureInfoW(hproduct: Msihandle, szfeature: Pcwstr, lpattributes: COpaquePointer?, lptitlebuf: Pwstr, pcchtitlebuf: COpaquePointer?, lphelpbuf: Pwstr, pcchhelpbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureInfoW(hproduct.toInt(), (szfeature?.value ?: 0L), (lpattributes?.value ?: 0L), (lptitlebuf?.value ?: 0L), (pcchtitlebuf?.value ?: 0L), (lphelpbuf?.value ?: 0L), (pcchhelpbuf?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateA(hinstall.toInt(), (szfeature?.value ?: 0L), (piinstalled?.value ?: 0L), (piaction?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, piinstalled: COpaquePointer?, piaction: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureStateW(hinstall.toInt(), (szfeature?.value ?: 0L), (piinstalled?.value ?: 0L), (piaction?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureUsageA(szproduct: Pcstr, szfeature: Pcstr, pdwusecount: COpaquePointer?, pwdateused: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageA((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), (pdwusecount?.value ?: 0L), (pwdateused?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureUsageW(szproduct: Pcwstr, szfeature: Pcwstr, pdwusecount: COpaquePointer?, pwdateused: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureUsageW((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), (pdwusecount?.value ?: 0L), (pwdateused?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureValidStatesA(hinstall: Msihandle, szfeature: Pcstr, lpinstallstates: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesA(hinstall.toInt(), (szfeature?.value ?: 0L), (lpinstallstates?.value ?: 0L)).toUInt()

public actual fun msiGetFeatureValidStatesW(hinstall: Msihandle, szfeature: Pcwstr, lpinstallstates: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFeatureValidStatesW(hinstall.toInt(), (szfeature?.value ?: 0L), (lpinstallstates?.value ?: 0L)).toUInt()

public actual fun msiGetFileHashA(szfilepath: Pcstr, dwoptions: UInt, phash: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashA((szfilepath?.value ?: 0L), dwoptions.toInt(), (phash?.value ?: 0L)).toUInt()

public actual fun msiGetFileHashW(szfilepath: Pcwstr, dwoptions: UInt, phash: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileHashW((szfilepath?.value ?: 0L), dwoptions.toInt(), (phash?.value ?: 0L)).toUInt()

public actual fun msiGetFileSignatureInformationA(szsignedobjectpath: Pcstr, dwflags: UInt, ppccertcontext: COpaquePointer?, pbhashdata: COpaquePointer?, pcbhashdata: COpaquePointer?): Hresult =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationA((szsignedobjectpath?.value ?: 0L), dwflags.toInt(), (ppccertcontext?.value ?: 0L), (pbhashdata?.value ?: 0L), (pcbhashdata?.value ?: 0L))

public actual fun msiGetFileSignatureInformationW(szsignedobjectpath: Pcwstr, dwflags: UInt, ppccertcontext: COpaquePointer?, pbhashdata: COpaquePointer?, pcbhashdata: COpaquePointer?): Hresult =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileSignatureInformationW((szsignedobjectpath?.value ?: 0L), dwflags.toInt(), (ppccertcontext?.value ?: 0L), (pbhashdata?.value ?: 0L), (pcbhashdata?.value ?: 0L))

public actual fun msiGetFileVersionA(szfilepath: Pcstr, lpversionbuf: Pstr, pcchversionbuf: COpaquePointer?, lplangbuf: Pstr, pcchlangbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionA((szfilepath?.value ?: 0L), (lpversionbuf?.value ?: 0L), (pcchversionbuf?.value ?: 0L), (lplangbuf?.value ?: 0L), (pcchlangbuf?.value ?: 0L)).toUInt()

public actual fun msiGetFileVersionW(szfilepath: Pcwstr, lpversionbuf: Pwstr, pcchversionbuf: COpaquePointer?, lplangbuf: Pwstr, pcchlangbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetFileVersionW((szfilepath?.value ?: 0L), (lpversionbuf?.value ?: 0L), (pcchversionbuf?.value ?: 0L), (lplangbuf?.value ?: 0L), (pcchlangbuf?.value ?: 0L)).toUInt()

public actual fun msiGetLanguage(hinstall: Msihandle): UShort =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLanguage(hinstall.toInt()).toUShort()

public actual fun msiGetLastErrorRecord(): Msihandle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetLastErrorRecord().toUInt()

public actual fun msiGetMode(hinstall: Msihandle, erunmode: Msirunmode): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetMode(hinstall.toInt(), erunmode)

public actual fun msiGetPatchFileListA(szproductcode: Pcstr, szpatchpackages: Pcstr, pcfiles: COpaquePointer?, pphfilerecords: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListA((szproductcode?.value ?: 0L), (szpatchpackages?.value ?: 0L), (pcfiles?.value ?: 0L), (pphfilerecords?.value ?: 0L)).toUInt()

public actual fun msiGetPatchFileListW(szproductcode: Pcwstr, szpatchpackages: Pcwstr, pcfiles: COpaquePointer?, pphfilerecords: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchFileListW((szproductcode?.value ?: 0L), (szpatchpackages?.value ?: 0L), (pcfiles?.value ?: 0L), (pphfilerecords?.value ?: 0L)).toUInt()

public actual fun msiGetPatchInfoA(szpatch: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoA((szpatch?.value ?: 0L), (szattribute?.value ?: 0L), (lpvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetPatchInfoExA(szpatchcode: Pcstr, szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, lpvalue: Pstr, pcchvalue: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExA((szpatchcode?.value ?: 0L), (szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szproperty?.value ?: 0L), (lpvalue?.value ?: 0L), (pcchvalue?.value ?: 0L)).toUInt()

public actual fun msiGetPatchInfoExW(szpatchcode: Pcwstr, szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, lpvalue: Pwstr, pcchvalue: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoExW((szpatchcode?.value ?: 0L), (szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szproperty?.value ?: 0L), (lpvalue?.value ?: 0L), (pcchvalue?.value ?: 0L)).toUInt()

public actual fun msiGetPatchInfoW(szpatch: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPatchInfoW((szpatch?.value ?: 0L), (szattribute?.value ?: 0L), (lpvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetProductCodeA(szcomponent: Pcstr, lpbuf39: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeA((szcomponent?.value ?: 0L), (lpbuf39?.value ?: 0L)).toUInt()

public actual fun msiGetProductCodeW(szcomponent: Pcwstr, lpbuf39: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductCodeW((szcomponent?.value ?: 0L), (lpbuf39?.value ?: 0L)).toUInt()

public actual fun msiGetProductInfoA(szproduct: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoA((szproduct?.value ?: 0L), (szattribute?.value ?: 0L), (lpvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetProductInfoExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, szvalue: Pstr, pcchvalue: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExA((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szproperty?.value ?: 0L), (szvalue?.value ?: 0L), (pcchvalue?.value ?: 0L)).toUInt()

public actual fun msiGetProductInfoExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoExW((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szproperty?.value ?: 0L), (szvalue?.value ?: 0L), (pcchvalue?.value ?: 0L)).toUInt()

public actual fun msiGetProductInfoFromScriptA(szscriptfile: Pcstr, lpproductbuf39: Pstr, plgidlanguage: COpaquePointer?, pdwversion: COpaquePointer?, lpnamebuf: Pstr, pcchnamebuf: COpaquePointer?, lppackagebuf: Pstr, pcchpackagebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptA((szscriptfile?.value ?: 0L), (lpproductbuf39?.value ?: 0L), (plgidlanguage?.value ?: 0L), (pdwversion?.value ?: 0L), (lpnamebuf?.value ?: 0L), (pcchnamebuf?.value ?: 0L), (lppackagebuf?.value ?: 0L), (pcchpackagebuf?.value ?: 0L)).toUInt()

public actual fun msiGetProductInfoFromScriptW(szscriptfile: Pcwstr, lpproductbuf39: Pwstr, plgidlanguage: COpaquePointer?, pdwversion: COpaquePointer?, lpnamebuf: Pwstr, pcchnamebuf: COpaquePointer?, lppackagebuf: Pwstr, pcchpackagebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoFromScriptW((szscriptfile?.value ?: 0L), (lpproductbuf39?.value ?: 0L), (plgidlanguage?.value ?: 0L), (pdwversion?.value ?: 0L), (lpnamebuf?.value ?: 0L), (pcchnamebuf?.value ?: 0L), (lppackagebuf?.value ?: 0L), (pcchpackagebuf?.value ?: 0L)).toUInt()

public actual fun msiGetProductInfoW(szproduct: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductInfoW((szproduct?.value ?: 0L), (szattribute?.value ?: 0L), (lpvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetProductPropertyA(hproduct: Msihandle, szproperty: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyA(hproduct.toInt(), (szproperty?.value ?: 0L), (lpvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetProductPropertyW(hproduct: Msihandle, szproperty: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetProductPropertyW(hproduct.toInt(), (szproperty?.value ?: 0L), (lpvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetPropertyA(hinstall: Msihandle, szname: Pcstr, szvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyA(hinstall.toInt(), (szname?.value ?: 0L), (szvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetPropertyW(hinstall.toInt(), (szname?.value ?: 0L), (szvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiGetShortcutTargetA(szshortcutpath: Pcstr, szproductcode: Pstr, szfeatureid: Pstr, szcomponentcode: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetA((szshortcutpath?.value ?: 0L), (szproductcode?.value ?: 0L), (szfeatureid?.value ?: 0L), (szcomponentcode?.value ?: 0L)).toUInt()

public actual fun msiGetShortcutTargetW(szshortcutpath: Pcwstr, szproductcode: Pwstr, szfeatureid: Pwstr, szcomponentcode: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetShortcutTargetW((szshortcutpath?.value ?: 0L), (szproductcode?.value ?: 0L), (szfeatureid?.value ?: 0L), (szcomponentcode?.value ?: 0L)).toUInt()

public actual fun msiGetSourcePathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathA(hinstall.toInt(), (szfolder?.value ?: 0L), (szpathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiGetSourcePathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSourcePathW(hinstall.toInt(), (szfolder?.value ?: 0L), (szpathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiGetSummaryInformationA(hdatabase: Msihandle, szdatabasepath: Pcstr, uiupdatecount: UInt, phsummaryinfo: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationA(hdatabase.toInt(), (szdatabasepath?.value ?: 0L), uiupdatecount.toInt(), (phsummaryinfo?.value ?: 0L)).toUInt()

public actual fun msiGetSummaryInformationW(hdatabase: Msihandle, szdatabasepath: Pcwstr, uiupdatecount: UInt, phsummaryinfo: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetSummaryInformationW(hdatabase.toInt(), (szdatabasepath?.value ?: 0L), uiupdatecount.toInt(), (phsummaryinfo?.value ?: 0L)).toUInt()

public actual fun msiGetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathA(hinstall.toInt(), (szfolder?.value ?: 0L), (szpathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiGetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetTargetPathW(hinstall.toInt(), (szfolder?.value ?: 0L), (szpathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiGetUserInfoA(szproduct: Pcstr, lpusernamebuf: Pstr, pcchusernamebuf: COpaquePointer?, lporgnamebuf: Pstr, pcchorgnamebuf: COpaquePointer?, lpserialbuf: Pstr, pcchserialbuf: COpaquePointer?): Userinfostate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoA((szproduct?.value ?: 0L), (lpusernamebuf?.value ?: 0L), (pcchusernamebuf?.value ?: 0L), (lporgnamebuf?.value ?: 0L), (pcchorgnamebuf?.value ?: 0L), (lpserialbuf?.value ?: 0L), (pcchserialbuf?.value ?: 0L))

public actual fun msiGetUserInfoW(szproduct: Pcwstr, lpusernamebuf: Pwstr, pcchusernamebuf: COpaquePointer?, lporgnamebuf: Pwstr, pcchorgnamebuf: COpaquePointer?, lpserialbuf: Pwstr, pcchserialbuf: COpaquePointer?): Userinfostate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiGetUserInfoW((szproduct?.value ?: 0L), (lpusernamebuf?.value ?: 0L), (pcchusernamebuf?.value ?: 0L), (lporgnamebuf?.value ?: 0L), (pcchorgnamebuf?.value ?: 0L), (lpserialbuf?.value ?: 0L), (pcchserialbuf?.value ?: 0L))

public actual fun msiInstallMissingComponentA(szproduct: Pcstr, szcomponent: Pcstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentA((szproduct?.value ?: 0L), (szcomponent?.value ?: 0L), einstallstate).toUInt()

public actual fun msiInstallMissingComponentW(szproduct: Pcwstr, szcomponent: Pcwstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingComponentW((szproduct?.value ?: 0L), (szcomponent?.value ?: 0L), einstallstate).toUInt()

public actual fun msiInstallMissingFileA(szproduct: Pcstr, szfile: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileA((szproduct?.value ?: 0L), (szfile?.value ?: 0L)).toUInt()

public actual fun msiInstallMissingFileW(szproduct: Pcwstr, szfile: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallMissingFileW((szproduct?.value ?: 0L), (szfile?.value ?: 0L)).toUInt()

public actual fun msiInstallProductA(szpackagepath: Pcstr, szcommandline: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductA((szpackagepath?.value ?: 0L), (szcommandline?.value ?: 0L)).toUInt()

public actual fun msiInstallProductW(szpackagepath: Pcwstr, szcommandline: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiInstallProductW((szpackagepath?.value ?: 0L), (szcommandline?.value ?: 0L)).toUInt()

public actual fun msiIsProductElevatedA(szproduct: Pcstr, pfelevated: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedA((szproduct?.value ?: 0L), (pfelevated?.value ?: 0L)).toUInt()

public actual fun msiIsProductElevatedW(szproduct: Pcwstr, pfelevated: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiIsProductElevatedW((szproduct?.value ?: 0L), (pfelevated?.value ?: 0L)).toUInt()

public actual fun msiJoinTransaction(htransactionhandle: Msihandle, dwtransactionattributes: UInt, phchangeofownerevent: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiJoinTransaction(htransactionhandle.toInt(), dwtransactionattributes.toInt(), (phchangeofownerevent?.value ?: 0L)).toUInt()

public actual fun msiLocateComponentA(szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: COpaquePointer?): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentA((szcomponent?.value ?: 0L), (lppathbuf?.value ?: 0L), (pcchbuf?.value ?: 0L))

public actual fun msiLocateComponentW(szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: COpaquePointer?): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiLocateComponentW((szcomponent?.value ?: 0L), (lppathbuf?.value ?: 0L), (pcchbuf?.value ?: 0L))

public actual fun msiNotifySidChangeA(poldsid: Pcstr, pnewsid: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeA((poldsid?.value ?: 0L), (pnewsid?.value ?: 0L)).toUInt()

public actual fun msiNotifySidChangeW(poldsid: Pcwstr, pnewsid: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiNotifySidChangeW((poldsid?.value ?: 0L), (pnewsid?.value ?: 0L)).toUInt()

public actual fun msiOpenDatabaseA(szdatabasepath: Pcstr, szpersist: Pcstr, phdatabase: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseA((szdatabasepath?.value ?: 0L), (szpersist?.value ?: 0L), (phdatabase?.value ?: 0L)).toUInt()

public actual fun msiOpenDatabaseW(szdatabasepath: Pcwstr, szpersist: Pcwstr, phdatabase: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenDatabaseW((szdatabasepath?.value ?: 0L), (szpersist?.value ?: 0L), (phdatabase?.value ?: 0L)).toUInt()

public actual fun msiOpenPackageA(szpackagepath: Pcstr, hproduct: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageA((szpackagepath?.value ?: 0L), (hproduct?.value ?: 0L)).toUInt()

public actual fun msiOpenPackageExA(szpackagepath: Pcstr, dwoptions: UInt, hproduct: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExA((szpackagepath?.value ?: 0L), dwoptions.toInt(), (hproduct?.value ?: 0L)).toUInt()

public actual fun msiOpenPackageExW(szpackagepath: Pcwstr, dwoptions: UInt, hproduct: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageExW((szpackagepath?.value ?: 0L), dwoptions.toInt(), (hproduct?.value ?: 0L)).toUInt()

public actual fun msiOpenPackageW(szpackagepath: Pcwstr, hproduct: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenPackageW((szpackagepath?.value ?: 0L), (hproduct?.value ?: 0L)).toUInt()

public actual fun msiOpenProductA(szproduct: Pcstr, hproduct: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductA((szproduct?.value ?: 0L), (hproduct?.value ?: 0L)).toUInt()

public actual fun msiOpenProductW(szproduct: Pcwstr, hproduct: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiOpenProductW((szproduct?.value ?: 0L), (hproduct?.value ?: 0L)).toUInt()

public actual fun msiPreviewBillboardA(hpreview: Msihandle, szcontrolname: Pcstr, szbillboard: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardA(hpreview.toInt(), (szcontrolname?.value ?: 0L), (szbillboard?.value ?: 0L)).toUInt()

public actual fun msiPreviewBillboardW(hpreview: Msihandle, szcontrolname: Pcwstr, szbillboard: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewBillboardW(hpreview.toInt(), (szcontrolname?.value ?: 0L), (szbillboard?.value ?: 0L)).toUInt()

public actual fun msiPreviewDialogA(hpreview: Msihandle, szdialogname: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogA(hpreview.toInt(), (szdialogname?.value ?: 0L)).toUInt()

public actual fun msiPreviewDialogW(hpreview: Msihandle, szdialogname: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiPreviewDialogW(hpreview.toInt(), (szdialogname?.value ?: 0L)).toUInt()

public actual fun msiProcessAdvertiseScriptA(szscriptfile: Pcstr, sziconfolder: Pcstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptA((szscriptfile?.value ?: 0L), (sziconfolder?.value ?: 0L), (hregdata?.value ?: 0L), fshortcuts, fremoveitems).toUInt()

public actual fun msiProcessAdvertiseScriptW(szscriptfile: Pcwstr, sziconfolder: Pcwstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessAdvertiseScriptW((szscriptfile?.value ?: 0L), (sziconfolder?.value ?: 0L), (hregdata?.value ?: 0L), fshortcuts, fremoveitems).toUInt()

public actual fun msiProcessMessage(hinstall: Msihandle, emessagetype: Installmessage, hrecord: Msihandle): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt())

public actual fun msiProvideAssemblyA(szassemblyname: Pcstr, szappcontext: Pcstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyA((szassemblyname?.value ?: 0L), (szappcontext?.value ?: 0L), dwinstallmode.toInt(), dwassemblyinfo.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiProvideAssemblyW(szassemblyname: Pcwstr, szappcontext: Pcwstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideAssemblyW((szassemblyname?.value ?: 0L), (szappcontext?.value ?: 0L), dwinstallmode.toInt(), dwassemblyinfo.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiProvideComponentA(szproduct: Pcstr, szfeature: Pcstr, szcomponent: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentA((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), (szcomponent?.value ?: 0L), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiProvideComponentW(szproduct: Pcwstr, szfeature: Pcwstr, szcomponent: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideComponentW((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), (szcomponent?.value ?: 0L), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiProvideQualifiedComponentA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentA((szcategory?.value ?: 0L), (szqualifier?.value ?: 0L), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiProvideQualifiedComponentExA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, szproduct: Pcstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExA((szcategory?.value ?: 0L), (szqualifier?.value ?: 0L), dwinstallmode.toInt(), (szproduct?.value ?: 0L), dwunused1.toInt(), dwunused2.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiProvideQualifiedComponentExW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, szproduct: Pcwstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentExW((szcategory?.value ?: 0L), (szqualifier?.value ?: 0L), dwinstallmode.toInt(), (szproduct?.value ?: 0L), dwunused1.toInt(), dwunused2.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiProvideQualifiedComponentW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiProvideQualifiedComponentW((szcategory?.value ?: 0L), (szqualifier?.value ?: 0L), dwinstallmode.toInt(), (lppathbuf?.value ?: 0L), (pcchpathbuf?.value ?: 0L)).toUInt()

public actual fun msiQueryComponentStateA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcstr, pdwstate: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateA((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szcomponentcode?.value ?: 0L), (pdwstate?.value ?: 0L)).toUInt()

public actual fun msiQueryComponentStateW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcwstr, pdwstate: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryComponentStateW((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szcomponentcode?.value ?: 0L), (pdwstate?.value ?: 0L)).toUInt()

public actual fun msiQueryFeatureStateA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateA((szproduct?.value ?: 0L), (szfeature?.value ?: 0L))

public actual fun msiQueryFeatureStateExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szfeature: Pcstr, pdwstate: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExA((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szfeature?.value ?: 0L), (pdwstate?.value ?: 0L)).toUInt()

public actual fun msiQueryFeatureStateExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szfeature: Pcwstr, pdwstate: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateExW((szproductcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, (szfeature?.value ?: 0L), (pdwstate?.value ?: 0L)).toUInt()

public actual fun msiQueryFeatureStateW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryFeatureStateW((szproduct?.value ?: 0L), (szfeature?.value ?: 0L))

public actual fun msiQueryProductStateA(szproduct: Pcstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateA((szproduct?.value ?: 0L))

public actual fun msiQueryProductStateW(szproduct: Pcwstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiQueryProductStateW((szproduct?.value ?: 0L))

public actual fun msiRecordClearData(hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordClearData(hrecord.toInt()).toUInt()

public actual fun msiRecordDataSize(hrecord: Msihandle, ifield: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordDataSize(hrecord.toInt(), ifield.toInt()).toUInt()

public actual fun msiRecordGetFieldCount(hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetFieldCount(hrecord.toInt()).toUInt()

public actual fun msiRecordGetInteger(hrecord: Msihandle, ifield: UInt): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetInteger(hrecord.toInt(), ifield.toInt())

public actual fun msiRecordGetStringA(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringA(hrecord.toInt(), ifield.toInt(), (szvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiRecordGetStringW(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordGetStringW(hrecord.toInt(), ifield.toInt(), (szvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiRecordIsNull(hrecord: Msihandle, ifield: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordIsNull(hrecord.toInt(), ifield.toInt())

public actual fun msiRecordReadStream(hrecord: Msihandle, ifield: UInt, szdatabuf: Pstr, pcbdatabuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordReadStream(hrecord.toInt(), ifield.toInt(), (szdatabuf?.value ?: 0L), (pcbdatabuf?.value ?: 0L)).toUInt()

public actual fun msiRecordSetInteger(hrecord: Msihandle, ifield: UInt, ivalue: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue).toUInt()

public actual fun msiRecordSetStreamA(hrecord: Msihandle, ifield: UInt, szfilepath: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamA(hrecord.toInt(), ifield.toInt(), (szfilepath?.value ?: 0L)).toUInt()

public actual fun msiRecordSetStreamW(hrecord: Msihandle, ifield: UInt, szfilepath: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStreamW(hrecord.toInt(), ifield.toInt(), (szfilepath?.value ?: 0L)).toUInt()

public actual fun msiRecordSetStringA(hrecord: Msihandle, ifield: UInt, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringA(hrecord.toInt(), ifield.toInt(), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiRecordSetStringW(hrecord: Msihandle, ifield: UInt, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRecordSetStringW(hrecord.toInt(), ifield.toInt(), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiReinstallFeatureA(szproduct: Pcstr, szfeature: Pcstr, dwreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureA((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), dwreinstallmode.toInt()).toUInt()

public actual fun msiReinstallFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, dwreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallFeatureW((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), dwreinstallmode.toInt()).toUInt()

public actual fun msiReinstallProductA(szproduct: Pcstr, szreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductA((szproduct?.value ?: 0L), szreinstallmode.toInt()).toUInt()

public actual fun msiReinstallProductW(szproduct: Pcwstr, szreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiReinstallProductW((szproduct?.value ?: 0L), szreinstallmode.toInt()).toUInt()

public actual fun msiRemovePatchesA(szpatchlist: Pcstr, szproductcode: Pcstr, euninstalltype: Installtype, szpropertylist: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesA((szpatchlist?.value ?: 0L), (szproductcode?.value ?: 0L), euninstalltype, (szpropertylist?.value ?: 0L)).toUInt()

public actual fun msiRemovePatchesW(szpatchlist: Pcwstr, szproductcode: Pcwstr, euninstalltype: Installtype, szpropertylist: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiRemovePatchesW((szpatchlist?.value ?: 0L), (szproductcode?.value ?: 0L), euninstalltype, (szpropertylist?.value ?: 0L)).toUInt()

public actual fun msiSequenceA(hinstall: Msihandle, sztable: Pcstr, isequencemode: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceA(hinstall.toInt(), (sztable?.value ?: 0L), isequencemode).toUInt()

public actual fun msiSequenceW(hinstall: Msihandle, sztable: Pcwstr, isequencemode: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSequenceW(hinstall.toInt(), (sztable?.value ?: 0L), isequencemode).toUInt()

public actual fun msiSetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateA(hinstall.toInt(), (szcomponent?.value ?: 0L), istate).toUInt()

public actual fun msiSetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetComponentStateW(hinstall.toInt(), (szcomponent?.value ?: 0L), istate).toUInt()

public actual fun msiSetExternalUIA(puihandler: InstalluiHandlera, dwmessagefilter: UInt, pvcontext: COpaquePointer?): InstalluiHandlera =
    null

public actual fun msiSetExternalUIRecord(puihandler: PinstalluiHandlerRecord, dwmessagefilter: UInt, pvcontext: COpaquePointer?, ppuiprevhandler: PinstalluiHandlerRecord): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetExternalUIRecord(0L, dwmessagefilter.toInt(), (pvcontext?.value ?: 0L), 0L).toUInt()

public actual fun msiSetExternalUIW(puihandler: InstalluiHandlerw, dwmessagefilter: UInt, pvcontext: COpaquePointer?): InstalluiHandlerw =
    null

public actual fun msiSetFeatureAttributesA(hinstall: Msihandle, szfeature: Pcstr, dwattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesA(hinstall.toInt(), (szfeature?.value ?: 0L), dwattributes.toInt()).toUInt()

public actual fun msiSetFeatureAttributesW(hinstall: Msihandle, szfeature: Pcwstr, dwattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureAttributesW(hinstall.toInt(), (szfeature?.value ?: 0L), dwattributes.toInt()).toUInt()

public actual fun msiSetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateA(hinstall.toInt(), (szfeature?.value ?: 0L), istate).toUInt()

public actual fun msiSetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetFeatureStateW(hinstall.toInt(), (szfeature?.value ?: 0L), istate).toUInt()

public actual fun msiSetInstallLevel(hinstall: Msihandle, iinstalllevel: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInstallLevel(hinstall.toInt(), iinstalllevel).toUInt()

public actual fun msiSetInternalUI(dwuilevel: Installuilevel, phwnd: COpaquePointer?): Installuilevel =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetInternalUI(dwuilevel, (phwnd?.value ?: 0L))

public actual fun msiSetMode(hinstall: Msihandle, erunmode: Msirunmode, fstate: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetMode(hinstall.toInt(), erunmode, fstate).toUInt()

public actual fun msiSetPropertyA(hinstall: Msihandle, szname: Pcstr, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyA(hinstall.toInt(), (szname?.value ?: 0L), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiSetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetPropertyW(hinstall.toInt(), (szname?.value ?: 0L), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiSetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szfolderpath: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathA(hinstall.toInt(), (szfolder?.value ?: 0L), (szfolderpath?.value ?: 0L)).toUInt()

public actual fun msiSetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szfolderpath: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSetTargetPathW(hinstall.toInt(), (szfolder?.value ?: 0L), (szfolderpath?.value ?: 0L)).toUInt()

public actual fun msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcstr, szdiskprompt: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), (szvolumelabel?.value ?: 0L), (szdiskprompt?.value ?: 0L)).toUInt()

public actual fun msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcwstr, szdiskprompt: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddMediaDiskW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwdiskid.toInt(), (szvolumelabel?.value ?: 0L), (szdiskprompt?.value ?: 0L)).toUInt()

public actual fun msiSourceListAddSourceA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt, szsource: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceA((szproduct?.value ?: 0L), (szusername?.value ?: 0L), dwreserved.toInt(), (szsource?.value ?: 0L)).toUInt()

public actual fun msiSourceListAddSourceExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr, dwindex: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L), dwindex.toInt()).toUInt()

public actual fun msiSourceListAddSourceExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr, dwindex: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceExW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L), dwindex.toInt()).toUInt()

public actual fun msiSourceListAddSourceW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt, szsource: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListAddSourceW((szproduct?.value ?: 0L), (szusername?.value ?: 0L), dwreserved.toInt(), (szsource?.value ?: 0L)).toUInt()

public actual fun msiSourceListClearAllA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllA((szproduct?.value ?: 0L), (szusername?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun msiSourceListClearAllExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListClearAllExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllExW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListClearAllW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearAllW((szproduct?.value ?: 0L), (szusername?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt()

public actual fun msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearMediaDiskW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt()

public actual fun msiSourceListClearSourceA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L)).toUInt()

public actual fun msiSourceListClearSourceW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListClearSourceW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szsource?.value ?: 0L)).toUInt()

public actual fun msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: COpaquePointer?, szvolumelabel: Pstr, pcchvolumelabel: COpaquePointer?, szdiskprompt: Pstr, pcchdiskprompt: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwindex.toInt(), (pdwdiskid?.value ?: 0L), (szvolumelabel?.value ?: 0L), (pcchvolumelabel?.value ?: 0L), (szdiskprompt?.value ?: 0L), (pcchdiskprompt?.value ?: 0L)).toUInt()

public actual fun msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: COpaquePointer?, szvolumelabel: Pwstr, pcchvolumelabel: COpaquePointer?, szdiskprompt: Pwstr, pcchdiskprompt: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumMediaDisksW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwindex.toInt(), (pdwdiskid?.value ?: 0L), (szvolumelabel?.value ?: 0L), (pcchvolumelabel?.value ?: 0L), (szdiskprompt?.value ?: 0L), (pcchdiskprompt?.value ?: 0L)).toUInt()

public actual fun msiSourceListEnumSourcesA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pstr, pcchsource: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwindex.toInt(), (szsource?.value ?: 0L), (pcchsource?.value ?: 0L)).toUInt()

public actual fun msiSourceListEnumSourcesW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pwstr, pcchsource: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListEnumSourcesW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), dwindex.toInt(), (szsource?.value ?: 0L), (pcchsource?.value ?: 0L)).toUInt()

public actual fun msiSourceListForceResolutionA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionA((szproduct?.value ?: 0L), (szusername?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun msiSourceListForceResolutionExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListForceResolutionExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionExW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListForceResolutionW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListForceResolutionW((szproduct?.value ?: 0L), (szusername?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun msiSourceListGetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pstr, pcchvalue: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L), (szvalue?.value ?: 0L), (pcchvalue?.value ?: 0L)).toUInt()

public actual fun msiSourceListGetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListGetInfoW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L), (szvalue?.value ?: 0L), (pcchvalue?.value ?: 0L)).toUInt()

public actual fun msiSourceListSetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoA((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiSourceListSetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSourceListSetInfoW((szproductcodeorpatchcode?.value ?: 0L), (szusersid?.value ?: 0L), dwcontext, dwoptions.toInt(), (szproperty?.value ?: 0L), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiSummaryInfoGetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: COpaquePointer?, pivalue: COpaquePointer?, pftvalue: COpaquePointer?, szvaluebuf: Pstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), (puidatatype?.value ?: 0L), (pivalue?.value ?: 0L), (pftvalue?.value ?: 0L), (szvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiSummaryInfoGetPropertyCount(hsummaryinfo: Msihandle, puipropertycount: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyCount(hsummaryinfo.toInt(), (puipropertycount?.value ?: 0L)).toUInt()

public actual fun msiSummaryInfoGetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: COpaquePointer?, pivalue: COpaquePointer?, pftvalue: COpaquePointer?, szvaluebuf: Pwstr, pcchvaluebuf: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoGetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), (puidatatype?.value ?: 0L), (pivalue?.value ?: 0L), (pftvalue?.value ?: 0L), (szvaluebuf?.value ?: 0L), (pcchvaluebuf?.value ?: 0L)).toUInt()

public actual fun msiSummaryInfoPersist(hsummaryinfo: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoPersist(hsummaryinfo.toInt()).toUInt()

public actual fun msiSummaryInfoSetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: COpaquePointer?, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, (pftvalue?.value ?: 0L), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiSummaryInfoSetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: COpaquePointer?, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiSummaryInfoSetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, (pftvalue?.value ?: 0L), (szvalue?.value ?: 0L)).toUInt()

public actual fun msiUseFeatureA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureA((szproduct?.value ?: 0L), (szfeature?.value ?: 0L))

public actual fun msiUseFeatureExA(szproduct: Pcstr, szfeature: Pcstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExA((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), dwinstallmode.toInt(), dwreserved.toInt())

public actual fun msiUseFeatureExW(szproduct: Pcwstr, szfeature: Pcwstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureExW((szproduct?.value ?: 0L), (szfeature?.value ?: 0L), dwinstallmode.toInt(), dwreserved.toInt())

public actual fun msiUseFeatureW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiUseFeatureW((szproduct?.value ?: 0L), (szfeature?.value ?: 0L))

public actual fun msiVerifyDiskSpace(hinstall: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyDiskSpace(hinstall.toInt()).toUInt()

public actual fun msiVerifyPackageA(szpackagepath: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageA((szpackagepath?.value ?: 0L)).toUInt()

public actual fun msiVerifyPackageW(szpackagepath: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiVerifyPackageW((szpackagepath?.value ?: 0L)).toUInt()

public actual fun msiViewClose(hview: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewClose(hview.toInt()).toUInt()

public actual fun msiViewExecute(hview: Msihandle, hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewExecute(hview.toInt(), hrecord.toInt()).toUInt()

public actual fun msiViewFetch(hview: Msihandle, phrecord: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewFetch(hview.toInt(), (phrecord?.value ?: 0L)).toUInt()

public actual fun msiViewGetColumnInfo(hview: Msihandle, ecolumninfo: Msicolinfo, phrecord: COpaquePointer?): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetColumnInfo(hview.toInt(), ecolumninfo, (phrecord?.value ?: 0L)).toUInt()

public actual fun msiViewGetErrorA(hview: Msihandle, szcolumnnamebuffer: Pstr, pcchbuf: COpaquePointer?): Msidberror =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorA(hview.toInt(), (szcolumnnamebuffer?.value ?: 0L), (pcchbuf?.value ?: 0L))

public actual fun msiViewGetErrorW(hview: Msihandle, szcolumnnamebuffer: Pwstr, pcchbuf: COpaquePointer?): Msidberror =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewGetErrorW(hview.toInt(), (szcolumnnamebuffer?.value ?: 0L), (pcchbuf?.value ?: 0L))

public actual fun msiViewModify(hview: Msihandle, emodifymode: Msimodify, hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_msiViewModify(hview.toInt(), emodifymode, hrecord.toInt()).toUInt()

public actual fun normalizeFileForPatchSignature(filebuffer: COpaquePointer?, filesize: UInt, optionflags: UInt, optiondata: COpaquePointer?, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: COpaquePointer?, retainrangecount: UInt, retainrangearray: COpaquePointer?): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_normalizeFileForPatchSignature((filebuffer?.value ?: 0L), filesize.toInt(), optionflags.toInt(), (optiondata?.value ?: 0L), newfilecoffbase.toInt(), newfilecofftime.toInt(), ignorerangecount.toInt(), (ignorerangearray?.value ?: 0L), retainrangecount.toInt(), (retainrangearray?.value ?: 0L))

public actual fun queryActCtxSettingsW(dwflags: UInt, hactctx: Handle, settingsnamespace: Pcwstr, settingname: Pcwstr, pvbuffer: Pwstr, dwbuffer: ULong, pdwwrittenorrequired: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxSettingsW(dwflags.toInt(), (hactctx?.value ?: 0L), (settingsnamespace?.value ?: 0L), (settingname?.value ?: 0L), (pvbuffer?.value ?: 0L), dwbuffer.toLong(), (pdwwrittenorrequired?.value ?: 0L))

public actual fun queryActCtxW(dwflags: UInt, hactctx: Handle, pvsubinstance: COpaquePointer?, ulinfoclass: UInt, pvbuffer: COpaquePointer?, cbbuffer: ULong, pcbwrittenorrequired: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_queryActCtxW(dwflags.toInt(), (hactctx?.value ?: 0L), (pvsubinstance?.value ?: 0L), ulinfoclass.toInt(), (pvbuffer?.value ?: 0L), cbbuffer.toLong(), (pcbwrittenorrequired?.value ?: 0L))

public actual fun releaseActCtx(hactctx: Handle) {
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_releaseActCtx((hactctx?.value ?: 0L))
}

public actual fun sfcGetNextProtectedFile(rpchandle: Handle, protfiledata: COpaquePointer?): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_sfcGetNextProtectedFile((rpchandle?.value ?: 0L), (protfiledata?.value ?: 0L))

public actual fun sfcIsFileProtected(rpchandle: Handle, protfilename: Pcwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsFileProtected((rpchandle?.value ?: 0L), (protfilename?.value ?: 0L))

public actual fun sfcIsKeyProtected(keyhandle: Hkey, subkeyname: Pcwstr, keysam: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_sfcIsKeyProtected((keyhandle?.value ?: 0L), (subkeyname?.value ?: 0L), keysam.toInt())

public actual fun sfpVerifyFile(pszfilename: Pcstr, pszerror: Pcstr, dwerrsize: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_sfpVerifyFile((pszfilename?.value ?: 0L), (pszerror?.value ?: 0L), dwerrsize.toInt())

public actual fun testApplyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileA((patchfilename?.value ?: 0L), (oldfilename?.value ?: 0L), applyoptionflags.toInt())

public actual fun testApplyPatchToFileByBuffers(patchfilebuffer: COpaquePointer?, patchfilesize: UInt, oldfilebuffer: COpaquePointer?, oldfilesize: UInt, newfilesize: COpaquePointer?, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByBuffers((patchfilebuffer?.value ?: 0L), patchfilesize.toInt(), (oldfilebuffer?.value ?: 0L), oldfilesize.toInt(), (newfilesize?.value ?: 0L), applyoptionflags.toInt())

public actual fun testApplyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileByHandles((patchfilehandle?.value ?: 0L), (oldfilehandle?.value ?: 0L), applyoptionflags.toInt())

public actual fun testApplyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_testApplyPatchToFileW((patchfilename?.value ?: 0L), (oldfilename?.value ?: 0L), applyoptionflags.toInt())

public actual fun zombifyActCtx(hactctx: Handle): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssys_windows_win32_system_applicationinstallationandservicing_zombifyActCtx((hactctx?.value ?: 0L))
