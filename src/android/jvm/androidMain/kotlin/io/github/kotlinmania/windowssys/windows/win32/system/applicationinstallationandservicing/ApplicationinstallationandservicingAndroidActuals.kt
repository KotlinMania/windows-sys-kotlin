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

private object WindowsWin32SystemApplicationinstallationandservicingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingActivateActCtx(hactctx: Long, lpcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingAddRefActCtx(hactctx: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaA(applyflags: Long, lpsourcename: Long, lpdeltaname: Long, lptargetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaW(applyflags: Long, lpsourcename: Long, lpdeltaname: Long, lptargetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileA(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: Int, oldfilemapped: Long, oldfilesize: Int, newfilebuffer: Long, newfilebuffersize: Int, newfileactualsize: Long, newfiletime: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandles(patchfilehandle: Long, oldfilehandle: Long, newfilehandle: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandlesEx(patchfilehandle: Long, oldfilehandle: Long, newfilehandle: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExA(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExW(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileW(patchfilename: Long, oldfilename: Long, newfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxA(pactctx: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxW(pactctx: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileA(oldfilename: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandles(oldfilehandle: Long, newfilehandle: Long, patchfilehandle: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandlesEx(oldfilecount: Int, oldfileinfoarray: Long, newfilehandle: Long, patchfilehandle: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExA(oldfilecount: Int, oldfileinfoarray: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExW(oldfilecount: Int, oldfileinfoarray: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long, progresscallback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileW(oldfilename: Long, newfilename: Long, patchfilename: Long, optionflags: Int, optiondata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(dwflags: Int, ulcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingDeltaFree(lpmemory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileA(patchfilename: Long, patchheaderfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileByHandles(patchfilehandle: Long, patchheaderfilehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileW(patchfilename: Long, patchheaderfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionGuid(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpguidtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringA(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpstringtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringW(dwflags: Int, lpextensionguid: Long, ulsectionid: Int, lpstringtofind: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetCurrentActCtx(lphactctx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoA(lpdeltaname: Long, lpheaderinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoW(lpdeltaname: Long, lpheaderinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureA(filetypeset: Long, hashalgid: Int, lpsourcename: Long, lphash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureW(filetypeset: Long, hashalgid: Int, lpsourcename: Long, lphash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureA(filename: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: Int, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByHandle(filehandle: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureW(filename: Long, optionflags: Int, optiondata: Long, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long, signaturebuffersize: Int, signaturebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductA(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExA(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short, dwplatform: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExW(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short, dwplatform: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductW(szpackagepath: Long, szscriptfilepath: Long, sztransforms: Long, lgidlanguage: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptA(szscriptfile: Long, dwflags: Int, phregdata: Long, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptW(szscriptfile: Long, dwflags: Int, phregdata: Long, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesA(szpatchpackages: Long, szproductcode: Long, szpropertieslist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesW(szpatchpackages: Long, szproductcode: Long, szpropertieslist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchA(szpatchpackage: Long, szinstallpackage: Long, einstalltype: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchW(szpatchpackage: Long, szinstallpackage: Long, einstalltype: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionA(szname: Long, dwtransactionattributes: Int, phtransactionhandle: Long, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionW(szname: Long, dwtransactionattributes: Int, phtransactionhandle: Long, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(hany: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoA(szproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoW(szproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureA(szproduct: Long, szfeature: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureW(szproduct: Long, szfeature: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductA(szproduct: Long, iinstalllevel: Int, einstallstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExA(szproduct: Long, iinstalllevel: Int, einstallstate: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExW(szproduct: Long, iinstalllevel: Int, einstallstate: Int, szcommandline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductW(szproduct: Long, iinstalllevel: Int, einstallstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(cparams: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoA(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ierrorconditions: Int, ivalidation: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoW(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ierrorconditions: Int, ivalidation: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformA(hdatabase: Int, sztransformfile: Long, ierrorconditions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformW(hdatabase: Int, sztransformfile: Long, ierrorconditions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(hdatabase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportA(hdatabase: Int, sztablename: Long, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportW(hdatabase: Int, sztablename: Long, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformA(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ireserved1: Int, ireserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformW(hdatabase: Int, hdatabasereference: Int, sztransformfile: Long, ireserved1: Int, ireserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysA(hdatabase: Int, sztablename: Long, phrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysW(hdatabase: Int, sztablename: Long, phrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportA(hdatabase: Int, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportW(hdatabase: Int, szfolderpath: Long, szfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentA(hdatabase: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentW(hdatabase: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeA(hdatabase: Int, hdatabasemerge: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeW(hdatabase: Int, hdatabasemerge: Int, sztablename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewA(hdatabase: Int, szquery: Long, phview: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewW(hdatabase: Int, szquery: Long, phview: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesA(szproductpackagepath: Long, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesW(szproductpackagepath: Long, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceA(szproductcode: Long, szusersid: Long, dwcontext: Int, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceW(szproductcode: Long, szusersid: Long, dwcontext: Int, cpatchinfo: Int, ppatchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionA(hinstall: Int, szaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionW(hinstall: Int, szaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogA(dwlogmode: Int, szlogfile: Long, dwlogattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogW(dwlogmode: Int, szlogfile: Long, dwlogattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableUIPreview(hdatabase: Int, phpreview: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(dwtransactionstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsA(szcomponent: Long, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExA(szcomponent: Long, szusersid: Long, dwcontext: Int, dwproductindex: Int, szproductbuf: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExW(szcomponent: Long, szusersid: Long, dwcontext: Int, dwproductindex: Int, szproductbuf: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsW(szcomponent: Long, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsA(hinstall: Int, szcomponent: Long, dwindex: Int, istate: Int, szdrivebuf: Long, pcchdrivebuf: Long, picost: Long, pitempcost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsW(hinstall: Int, szcomponent: Long, dwindex: Int, istate: Int, szdrivebuf: Long, pcchdrivebuf: Long, picost: Long, pitempcost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersA(szcomponent: Long, iindex: Int, lpqualifierbuf: Long, pcchqualifierbuf: Long, lpapplicationdatabuf: Long, pcchapplicationdatabuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersW(szcomponent: Long, iindex: Int, lpqualifierbuf: Long, pcchqualifierbuf: Long, lpapplicationdatabuf: Long, pcchapplicationdatabuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsA(icomponentindex: Int, lpcomponentbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExA(szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledcomponentcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExW(szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledcomponentcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsW(icomponentindex: Int, lpcomponentbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesA(szproduct: Long, ifeatureindex: Int, lpfeaturebuf: Long, lpparentbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesW(szproduct: Long, ifeatureindex: Int, lpfeaturebuf: Long, lpparentbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesA(szproduct: Long, ipatchindex: Int, lppatchbuf: Long, lptransformsbuf: Long, pcchtransformsbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExA(szproductcode: Long, szusersid: Long, dwcontext: Int, dwfilter: Int, dwindex: Int, szpatchcode: Long, sztargetproductcode: Long, pdwtargetproductcontext: Long, sztargetusersid: Long, pcchtargetusersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExW(szproductcode: Long, szusersid: Long, dwcontext: Int, dwfilter: Int, dwindex: Int, szpatchcode: Long, sztargetproductcode: Long, pdwtargetproductcontext: Long, sztargetusersid: Long, pcchtargetusersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesW(szproduct: Long, ipatchindex: Int, lppatchbuf: Long, lptransformsbuf: Long, pcchtransformsbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsA(iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExA(szproductcode: Long, szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledproductcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExW(szproductcode: Long, szusersid: Long, dwcontext: Int, dwindex: Int, szinstalledproductcode: Long, pdwinstalledcontext: Long, szsid: Long, pcchsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsW(iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsA(lpupgradecode: Long, dwreserved: Int, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsW(lpupgradecode: Long, dwreserved: Int, iproductindex: Int, lpproductbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionA(hinstall: Int, szcondition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionW(hinstall: Int, szcondition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataA(szpatchpath: Long, dwreserved: Int, szxmldata: Long, pcchxmldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataW(szpatchpath: Long, dwreserved: Int, szxmldata: Long, pcchxmldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordA(hinstall: Int, hrecord: Int, szresultbuf: Long, pcchresultbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordW(hinstall: Int, hrecord: Int, szresultbuf: Long, pcchresultbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(hinstall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathA(szproduct: Long, szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExA(szproductcode: Long, szcomponentcode: Long, szusersid: Long, dwcontext: Int, lpoutpathbuffer: Long, pcchoutpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExW(szproductcode: Long, szcomponentcode: Long, szusersid: Long, dwcontext: Int, lpoutpathbuffer: Long, pcchoutpathbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathW(szproduct: Long, szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateA(hinstall: Int, szcomponent: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateW(hinstall: Int, szcomponent: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(hdatabase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostA(hinstall: Int, szfeature: Long, icosttree: Int, istate: Int, picost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostW(hinstall: Int, szfeature: Long, icosttree: Int, istate: Int, picost: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoA(hproduct: Int, szfeature: Long, lpattributes: Long, lptitlebuf: Long, pcchtitlebuf: Long, lphelpbuf: Long, pcchhelpbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoW(hproduct: Int, szfeature: Long, lpattributes: Long, lptitlebuf: Long, pcchtitlebuf: Long, lphelpbuf: Long, pcchhelpbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateA(hinstall: Int, szfeature: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateW(hinstall: Int, szfeature: Long, piinstalled: Long, piaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageA(szproduct: Long, szfeature: Long, pdwusecount: Long, pwdateused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageW(szproduct: Long, szfeature: Long, pdwusecount: Long, pwdateused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesA(hinstall: Int, szfeature: Long, lpinstallstates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesW(hinstall: Int, szfeature: Long, lpinstallstates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashA(szfilepath: Long, dwoptions: Int, phash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashW(szfilepath: Long, dwoptions: Int, phash: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationA(szsignedobjectpath: Long, dwflags: Int, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationW(szsignedobjectpath: Long, dwflags: Int, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionA(szfilepath: Long, lpversionbuf: Long, pcchversionbuf: Long, lplangbuf: Long, pcchlangbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionW(szfilepath: Long, lpversionbuf: Long, pcchversionbuf: Long, lplangbuf: Long, pcchlangbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(hinstall: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(hinstall: Int, erunmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListA(szproductcode: Long, szpatchpackages: Long, pcfiles: Long, pphfilerecords: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListW(szproductcode: Long, szpatchpackages: Long, pcfiles: Long, pphfilerecords: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoA(szpatch: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExA(szpatchcode: Long, szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, lpvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExW(szpatchcode: Long, szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, lpvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoW(szpatch: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeA(szcomponent: Long, lpbuf39: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeW(szcomponent: Long, lpbuf39: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoA(szproduct: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExA(szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExW(szproductcode: Long, szusersid: Long, dwcontext: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptA(szscriptfile: Long, lpproductbuf39: Long, plgidlanguage: Long, pdwversion: Long, lpnamebuf: Long, pcchnamebuf: Long, lppackagebuf: Long, pcchpackagebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptW(szscriptfile: Long, lpproductbuf39: Long, plgidlanguage: Long, pdwversion: Long, lpnamebuf: Long, pcchnamebuf: Long, lppackagebuf: Long, pcchpackagebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoW(szproduct: Long, szattribute: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyA(hproduct: Int, szproperty: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyW(hproduct: Int, szproperty: Long, lpvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyA(hinstall: Int, szname: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyW(hinstall: Int, szname: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetA(szshortcutpath: Long, szproductcode: Long, szfeatureid: Long, szcomponentcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetW(szshortcutpath: Long, szproductcode: Long, szfeatureid: Long, szcomponentcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathA(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathW(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationA(hdatabase: Int, szdatabasepath: Long, uiupdatecount: Int, phsummaryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationW(hdatabase: Int, szdatabasepath: Long, uiupdatecount: Int, phsummaryinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathA(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathW(hinstall: Int, szfolder: Long, szpathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoA(szproduct: Long, lpusernamebuf: Long, pcchusernamebuf: Long, lporgnamebuf: Long, pcchorgnamebuf: Long, lpserialbuf: Long, pcchserialbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoW(szproduct: Long, lpusernamebuf: Long, pcchusernamebuf: Long, lporgnamebuf: Long, pcchorgnamebuf: Long, lpserialbuf: Long, pcchserialbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentA(szproduct: Long, szcomponent: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentW(szproduct: Long, szcomponent: Long, einstallstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileA(szproduct: Long, szfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileW(szproduct: Long, szfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductA(szpackagepath: Long, szcommandline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductW(szpackagepath: Long, szcommandline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedA(szproduct: Long, pfelevated: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedW(szproduct: Long, pfelevated: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiJoinTransaction(htransactionhandle: Int, dwtransactionattributes: Int, phchangeofownerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentA(szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentW(szcomponent: Long, lppathbuf: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeA(poldsid: Long, pnewsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeW(poldsid: Long, pnewsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseA(szdatabasepath: Long, szpersist: Long, phdatabase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseW(szdatabasepath: Long, szpersist: Long, phdatabase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageA(szpackagepath: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExA(szpackagepath: Long, dwoptions: Int, hproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExW(szpackagepath: Long, dwoptions: Int, hproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageW(szpackagepath: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductA(szproduct: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductW(szproduct: Long, hproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardA(hpreview: Int, szcontrolname: Long, szbillboard: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardW(hpreview: Int, szcontrolname: Long, szbillboard: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogA(hpreview: Int, szdialogname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogW(hpreview: Int, szdialogname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptA(szscriptfile: Long, sziconfolder: Long, hregdata: Long, fshortcuts: Int, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptW(szscriptfile: Long, sziconfolder: Long, hregdata: Long, fshortcuts: Int, fremoveitems: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(hinstall: Int, emessagetype: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyA(szassemblyname: Long, szappcontext: Long, dwinstallmode: Int, dwassemblyinfo: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyW(szassemblyname: Long, szappcontext: Long, dwinstallmode: Int, dwassemblyinfo: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentA(szproduct: Long, szfeature: Long, szcomponent: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentW(szproduct: Long, szfeature: Long, szcomponent: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentA(szcategory: Long, szqualifier: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExA(szcategory: Long, szqualifier: Long, dwinstallmode: Int, szproduct: Long, dwunused1: Int, dwunused2: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExW(szcategory: Long, szqualifier: Long, dwinstallmode: Int, szproduct: Long, dwunused1: Int, dwunused2: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentW(szcategory: Long, szqualifier: Long, dwinstallmode: Int, lppathbuf: Long, pcchpathbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateA(szproductcode: Long, szusersid: Long, dwcontext: Int, szcomponentcode: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateW(szproductcode: Long, szusersid: Long, dwcontext: Int, szcomponentcode: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateA(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExA(szproductcode: Long, szusersid: Long, dwcontext: Int, szfeature: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExW(szproductcode: Long, szusersid: Long, dwcontext: Int, szfeature: Long, pdwstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateW(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateA(szproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateW(szproduct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(hrecord: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(hrecord: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringA(hrecord: Int, ifield: Int, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringW(hrecord: Int, ifield: Int, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(hrecord: Int, ifield: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordReadStream(hrecord: Int, ifield: Int, szdatabuf: Long, pcbdatabuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(hrecord: Int, ifield: Int, ivalue: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamA(hrecord: Int, ifield: Int, szfilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamW(hrecord: Int, ifield: Int, szfilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringA(hrecord: Int, ifield: Int, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringW(hrecord: Int, ifield: Int, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureA(szproduct: Long, szfeature: Long, dwreinstallmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureW(szproduct: Long, szfeature: Long, dwreinstallmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductA(szproduct: Long, szreinstallmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductW(szproduct: Long, szreinstallmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesA(szpatchlist: Long, szproductcode: Long, euninstalltype: Int, szpropertylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesW(szpatchlist: Long, szproductcode: Long, euninstalltype: Int, szpropertylist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceA(hinstall: Int, sztable: Long, isequencemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceW(hinstall: Int, sztable: Long, isequencemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateA(hinstall: Int, szcomponent: Long, istate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateW(hinstall: Int, szcomponent: Long, istate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIA(puihandler: Long, dwmessagefilter: Int, pvcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIRecord(puihandler: Long, dwmessagefilter: Int, pvcontext: Long, ppuiprevhandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIW(puihandler: Long, dwmessagefilter: Int, pvcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesA(hinstall: Int, szfeature: Long, dwattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesW(hinstall: Int, szfeature: Long, dwattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateA(hinstall: Int, szfeature: Long, istate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateW(hinstall: Int, szfeature: Long, istate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(hinstall: Int, iinstalllevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInternalUI(dwuilevel: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(hinstall: Int, erunmode: Int, fstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyA(hinstall: Int, szname: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyW(hinstall: Int, szname: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathA(hinstall: Int, szfolder: Long, szfolderpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathW(hinstall: Int, szfolder: Long, szfolderpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int, szvolumelabel: Long, szdiskprompt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int, szvolumelabel: Long, szdiskprompt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceA(szproduct: Long, szusername: Long, dwreserved: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long, dwindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceW(szproduct: Long, szusername: Long, dwreserved: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllA(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllW(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwdiskid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szsource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, pdwdiskid: Long, szvolumelabel: Long, pcchvolumelabel: Long, szdiskprompt: Long, pcchdiskprompt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, pdwdiskid: Long, szvolumelabel: Long, pcchvolumelabel: Long, szdiskprompt: Long, pcchdiskprompt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, szsource: Long, pcchsource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, dwindex: Int, szsource: Long, pcchsource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionA(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionW(szproduct: Long, szusername: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long, pcchvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoA(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoW(szproductcodeorpatchcode: Long, szusersid: Long, dwcontext: Int, dwoptions: Int, szproperty: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyA(hsummaryinfo: Int, uiproperty: Int, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyCount(hsummaryinfo: Int, puipropertycount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyW(hsummaryinfo: Int, uiproperty: Int, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: Long, pcchvaluebuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(hsummaryinfo: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyA(hsummaryinfo: Int, uiproperty: Int, uidatatype: Int, ivalue: Int, pftvalue: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyW(hsummaryinfo: Int, uiproperty: Int, uidatatype: Int, ivalue: Int, pftvalue: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureA(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExA(szproduct: Long, szfeature: Long, dwinstallmode: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExW(szproduct: Long, szfeature: Long, dwinstallmode: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureW(szproduct: Long, szfeature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(hinstall: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageA(szpackagepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageW(szpackagepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(hview: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(hview: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewFetch(hview: Int, phrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetColumnInfo(hview: Int, ecolumninfo: Int, phrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorA(hview: Int, szcolumnnamebuffer: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorW(hview: Int, szcolumnnamebuffer: Long, pcchbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(hview: Int, emodifymode: Int, hrecord: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingNormalizeFileForPatchSignature(filebuffer: Long, filesize: Int, optionflags: Int, optiondata: Long, newfilecoffbase: Int, newfilecofftime: Int, ignorerangecount: Int, ignorerangearray: Long, retainrangecount: Int, retainrangearray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxSettingsW(dwflags: Int, hactctx: Long, settingsnamespace: Long, settingname: Long, pvbuffer: Long, dwbuffer: Long, pdwwrittenorrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxW(dwflags: Int, hactctx: Long, pvsubinstance: Long, ulinfoclass: Int, pvbuffer: Long, cbbuffer: Long, pcbwrittenorrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingReleaseActCtx(hactctx: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingSfcGetNextProtectedFile(rpchandle: Long, protfiledata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsFileProtected(rpchandle: Long, protfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsKeyProtected(keyhandle: Long, subkeyname: Long, keysam: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingSfpVerifyFile(pszfilename: Long, pszerror: Long, dwerrsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileA(patchfilename: Long, oldfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: Int, oldfilebuffer: Long, oldfilesize: Int, newfilesize: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByHandles(patchfilehandle: Long, oldfilehandle: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileW(patchfilename: Long, oldfilename: Long, applyoptionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemApplicationinstallationandservicingZombifyActCtx(hactctx: Long): Int
}

public actual fun activateActCtx(hactctx: Handle, lpcookie: MutPtr<ULong>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingActivateActCtx(hactctx.rawAddress, lpcookie.rawAddress)

public actual fun addRefActCtx(hactctx: Handle) {
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingAddRefActCtx(hactctx.rawAddress)
}

public actual fun applyDeltaA(applyflags: Long, lpsourcename: Pcstr, lpdeltaname: Pcstr, lptargetname: Pcstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaA(applyflags, lpsourcename.rawAddress, lpdeltaname.rawAddress, lptargetname.rawAddress)

public actual fun applyDeltaB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr<DeltaOutput>): Bool =
    0

public actual fun applyDeltaGetReverseB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lpreversefiletime: ConstPtr<Filetime>, lptarget: MutPtr<DeltaOutput>, lptargetreverse: MutPtr<DeltaOutput>): Bool =
    0

public actual fun applyDeltaProvidedB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr<CVoid>, utargetsize: ULong): Bool =
    0

public actual fun applyDeltaW(applyflags: Long, lpsourcename: Pcwstr, lpdeltaname: Pcwstr, lptargetname: Pcwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyDeltaW(applyflags, lpsourcename.rawAddress, lpdeltaname.rawAddress, lptargetname.rawAddress)

public actual fun applyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileA(patchfilename.rawAddress, oldfilename.rawAddress, newfilename.rawAddress, applyoptionflags.toInt())

public actual fun applyPatchToFileByBuffers(patchfilemapped: ConstPtr<UByte>, patchfilesize: UInt, oldfilemapped: ConstPtr<UByte>, oldfilesize: UInt, newfilebuffer: MutPtr<MutPtr<UByte>>, newfilebuffersize: UInt, newfileactualsize: MutPtr<UInt>, newfiletime: MutPtr<Filetime>, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByBuffers(patchfilemapped.rawAddress, patchfilesize.toInt(), oldfilemapped.rawAddress, oldfilesize.toInt(), newfilebuffer.rawAddress, newfilebuffersize.toInt(), newfileactualsize.rawAddress, newfiletime.rawAddress, applyoptionflags.toInt(), 0L, callbackcontext.rawAddress)

public actual fun applyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandles(patchfilehandle.rawAddress, oldfilehandle.rawAddress, newfilehandle.rawAddress, applyoptionflags.toInt())

public actual fun applyPatchToFileByHandlesEx(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileByHandlesEx(patchfilehandle.rawAddress, oldfilehandle.rawAddress, newfilehandle.rawAddress, applyoptionflags.toInt(), 0L, callbackcontext.rawAddress)

public actual fun applyPatchToFileExA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExA(patchfilename.rawAddress, oldfilename.rawAddress, newfilename.rawAddress, applyoptionflags.toInt(), 0L, callbackcontext.rawAddress)

public actual fun applyPatchToFileExW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileExW(patchfilename.rawAddress, oldfilename.rawAddress, newfilename.rawAddress, applyoptionflags.toInt(), 0L, callbackcontext.rawAddress)

public actual fun applyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingApplyPatchToFileW(patchfilename.rawAddress, oldfilename.rawAddress, newfilename.rawAddress, applyoptionflags.toInt())

public actual fun createActCtxA(pactctx: ConstPtr<Actctxa>): Handle =
    MutPtr(WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxA(pactctx.rawAddress))

public actual fun createActCtxW(pactctx: ConstPtr<Actctxw>): Handle =
    MutPtr(WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreateActCtxW(pactctx.rawAddress))

public actual fun createDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcstr, lptargetname: Pcstr, lpsourceoptionsname: Pcstr, lptargetoptionsname: Pcstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdeltaname: Pcstr): Bool =
    0

public actual fun createDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DeltaInput, target: DeltaInput, sourceoptions: DeltaInput, targetoptions: DeltaInput, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdelta: MutPtr<DeltaOutput>): Bool =
    0

public actual fun createDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcwstr, lptargetname: Pcwstr, lpsourceoptionsname: Pcwstr, lptargetoptionsname: Pcwstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr<Filetime>, hashalgid: AlgId, lpdeltaname: Pcwstr): Bool =
    0

public actual fun createPatchFileA(oldfilename: Pcstr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileA(oldfilename.rawAddress, newfilename.rawAddress, patchfilename.rawAddress, optionflags.toInt(), optiondata.rawAddress)

public actual fun createPatchFileByHandles(oldfilehandle: Handle, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandles(oldfilehandle.rawAddress, newfilehandle.rawAddress, patchfilehandle.rawAddress, optionflags.toInt(), optiondata.rawAddress)

public actual fun createPatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoH>, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileByHandlesEx(oldfilecount.toInt(), oldfileinfoarray.rawAddress, newfilehandle.rawAddress, patchfilehandle.rawAddress, optionflags.toInt(), optiondata.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun createPatchFileExA(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoA>, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExA(oldfilecount.toInt(), oldfileinfoarray.rawAddress, newfilename.rawAddress, patchfilename.rawAddress, optionflags.toInt(), optiondata.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun createPatchFileExW(oldfilecount: UInt, oldfileinfoarray: ConstPtr<PatchOldFileInfoW>, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileExW(oldfilecount.toInt(), oldfileinfoarray.rawAddress, newfilename.rawAddress, patchfilename.rawAddress, optionflags.toInt(), optiondata.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun createPatchFileW(oldfilename: Pcwstr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingCreatePatchFileW(oldfilename.rawAddress, newfilename.rawAddress, patchfilename.rawAddress, optionflags.toInt(), optiondata.rawAddress)

public actual fun deactivateActCtx(dwflags: UInt, ulcookie: ULong): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingDeactivateActCtx(dwflags.toInt(), ulcookie.toLong())

public actual fun deltaFree(lpmemory: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingDeltaFree(lpmemory.rawAddress)

public actual fun deltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DeltaInput, lpsource: MutPtr<CVoid>, usourcesize: ULong): Bool =
    0

public actual fun extractPatchHeaderToFileA(patchfilename: Pcstr, patchheaderfilename: Pcstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileA(patchfilename.rawAddress, patchheaderfilename.rawAddress)

public actual fun extractPatchHeaderToFileByHandles(patchfilehandle: Handle, patchheaderfilehandle: Handle): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileByHandles(patchfilehandle.rawAddress, patchheaderfilehandle.rawAddress)

public actual fun extractPatchHeaderToFileW(patchfilename: Pcwstr, patchheaderfilename: Pcwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingExtractPatchHeaderToFileW(patchfilename.rawAddress, patchheaderfilename.rawAddress)

public actual fun findActCtxSectionGuid(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpguidtofind: ConstPtr<Guid>, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionGuid(dwflags.toInt(), lpextensionguid.rawAddress, ulsectionid.toInt(), lpguidtofind.rawAddress, returneddata.rawAddress)

public actual fun findActCtxSectionStringA(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpstringtofind: Pcstr, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringA(dwflags.toInt(), lpextensionguid.rawAddress, ulsectionid.toInt(), lpstringtofind.rawAddress, returneddata.rawAddress)

public actual fun findActCtxSectionStringW(dwflags: UInt, lpextensionguid: ConstPtr<Guid>, ulsectionid: UInt, lpstringtofind: Pcwstr, returneddata: MutPtr<ActctxSectionKeyedData>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingFindActCtxSectionStringW(dwflags.toInt(), lpextensionguid.rawAddress, ulsectionid.toInt(), lpstringtofind.rawAddress, returneddata.rawAddress)

public actual fun getCurrentActCtx(lphactctx: MutPtr<Handle>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetCurrentActCtx(lphactctx.rawAddress)

public actual fun getDeltaInfoA(lpdeltaname: Pcstr, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoA(lpdeltaname.rawAddress, lpheaderinfo.rawAddress)

public actual fun getDeltaInfoB(delta: DeltaInput, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    0

public actual fun getDeltaInfoW(lpdeltaname: Pcwstr, lpheaderinfo: MutPtr<DeltaHeaderInfo>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaInfoW(lpdeltaname.rawAddress, lpheaderinfo.rawAddress)

public actual fun getDeltaSignatureA(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcstr, lphash: MutPtr<DeltaHash>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureA(filetypeset, hashalgid.toInt(), lpsourcename.rawAddress, lphash.rawAddress)

public actual fun getDeltaSignatureB(filetypeset: Long, hashalgid: AlgId, source: DeltaInput, lphash: MutPtr<DeltaHash>): Bool =
    0

public actual fun getDeltaSignatureW(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcwstr, lphash: MutPtr<DeltaHash>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetDeltaSignatureW(filetypeset, hashalgid.toInt(), lpsourcename.rawAddress, lphash.rawAddress)

public actual fun getFilePatchSignatureA(filename: Pcstr, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureA(filename.rawAddress, optionflags.toInt(), optiondata.rawAddress, ignorerangecount.toInt(), ignorerangearray.rawAddress, retainrangecount.toInt(), retainrangearray.rawAddress, signaturebuffersize.toInt(), signaturebuffer.rawAddress)

public actual fun getFilePatchSignatureByBuffer(filebufferwritable: MutPtr<UByte>, filesize: UInt, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByBuffer(filebufferwritable.rawAddress, filesize.toInt(), optionflags.toInt(), optiondata.rawAddress, ignorerangecount.toInt(), ignorerangearray.rawAddress, retainrangecount.toInt(), retainrangearray.rawAddress, signaturebuffersize.toInt(), signaturebuffer.rawAddress)

public actual fun getFilePatchSignatureByHandle(filehandle: Handle, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureByHandle(filehandle.rawAddress, optionflags.toInt(), optiondata.rawAddress, ignorerangecount.toInt(), ignorerangearray.rawAddress, retainrangecount.toInt(), retainrangearray.rawAddress, signaturebuffersize.toInt(), signaturebuffer.rawAddress)

public actual fun getFilePatchSignatureW(filename: Pcwstr, optionflags: UInt, optiondata: ConstPtr<CVoid>, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>, signaturebuffersize: UInt, signaturebuffer: Pwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingGetFilePatchSignatureW(filename.rawAddress, optionflags.toInt(), optiondata.rawAddress, ignorerangecount.toInt(), ignorerangearray.rawAddress, retainrangecount.toInt(), retainrangearray.rawAddress, signaturebuffersize.toInt(), signaturebuffer.rawAddress)

public actual fun msiAdvertiseProductA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductA(szpackagepath.rawAddress, szscriptfilepath.rawAddress, sztransforms.rawAddress, lgidlanguage.toShort()).toUInt()

public actual fun msiAdvertiseProductExA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExA(szpackagepath.rawAddress, szscriptfilepath.rawAddress, sztransforms.rawAddress, lgidlanguage.toShort(), dwplatform.toInt(), dwoptions.toInt()).toUInt()

public actual fun msiAdvertiseProductExW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductExW(szpackagepath.rawAddress, szscriptfilepath.rawAddress, sztransforms.rawAddress, lgidlanguage.toShort(), dwplatform.toInt(), dwoptions.toInt()).toUInt()

public actual fun msiAdvertiseProductW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseProductW(szpackagepath.rawAddress, szscriptfilepath.rawAddress, sztransforms.rawAddress, lgidlanguage.toShort()).toUInt()

public actual fun msiAdvertiseScriptA(szscriptfile: Pcstr, dwflags: UInt, phregdata: ConstPtr<Hkey>, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptA(szscriptfile.rawAddress, dwflags.toInt(), phregdata.rawAddress, fremoveitems).toUInt()

public actual fun msiAdvertiseScriptW(szscriptfile: Pcwstr, dwflags: UInt, phregdata: ConstPtr<Hkey>, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiAdvertiseScriptW(szscriptfile.rawAddress, dwflags.toInt(), phregdata.rawAddress, fremoveitems).toUInt()

public actual fun msiApplyMultiplePatchesA(szpatchpackages: Pcstr, szproductcode: Pcstr, szpropertieslist: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesA(szpatchpackages.rawAddress, szproductcode.rawAddress, szpropertieslist.rawAddress).toUInt()

public actual fun msiApplyMultiplePatchesW(szpatchpackages: Pcwstr, szproductcode: Pcwstr, szpropertieslist: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyMultiplePatchesW(szpatchpackages.rawAddress, szproductcode.rawAddress, szpropertieslist.rawAddress).toUInt()

public actual fun msiApplyPatchA(szpatchpackage: Pcstr, szinstallpackage: Pcstr, einstalltype: Installtype, szcommandline: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchA(szpatchpackage.rawAddress, szinstallpackage.rawAddress, einstalltype, szcommandline.rawAddress).toUInt()

public actual fun msiApplyPatchW(szpatchpackage: Pcwstr, szinstallpackage: Pcwstr, einstalltype: Installtype, szcommandline: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiApplyPatchW(szpatchpackage.rawAddress, szinstallpackage.rawAddress, einstalltype, szcommandline.rawAddress).toUInt()

public actual fun msiBeginTransactionA(szname: Pcstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr<Msihandle>, phchangeofownerevent: MutPtr<Handle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionA(szname.rawAddress, dwtransactionattributes.toInt(), phtransactionhandle.rawAddress, phchangeofownerevent.rawAddress).toUInt()

public actual fun msiBeginTransactionW(szname: Pcwstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr<Msihandle>, phchangeofownerevent: MutPtr<Handle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiBeginTransactionW(szname.rawAddress, dwtransactionattributes.toInt(), phtransactionhandle.rawAddress, phchangeofownerevent.rawAddress).toUInt()

public actual fun msiCloseAllHandles(): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseAllHandles().toUInt()

public actual fun msiCloseHandle(hany: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCloseHandle(hany.toInt()).toUInt()

public actual fun msiCollectUserInfoA(szproduct: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoA(szproduct.rawAddress).toUInt()

public actual fun msiCollectUserInfoW(szproduct: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCollectUserInfoW(szproduct.rawAddress).toUInt()

public actual fun msiConfigureFeatureA(szproduct: Pcstr, szfeature: Pcstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureA(szproduct.rawAddress, szfeature.rawAddress, einstallstate).toUInt()

public actual fun msiConfigureFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureFeatureW(szproduct.rawAddress, szfeature.rawAddress, einstallstate).toUInt()

public actual fun msiConfigureProductA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductA(szproduct.rawAddress, iinstalllevel, einstallstate).toUInt()

public actual fun msiConfigureProductExA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExA(szproduct.rawAddress, iinstalllevel, einstallstate, szcommandline.rawAddress).toUInt()

public actual fun msiConfigureProductExW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductExW(szproduct.rawAddress, iinstalllevel, einstallstate, szcommandline.rawAddress).toUInt()

public actual fun msiConfigureProductW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiConfigureProductW(szproduct.rawAddress, iinstalllevel, einstallstate).toUInt()

public actual fun msiCreateRecord(cparams: UInt): Msihandle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateRecord(cparams.toInt()).toUInt()

public actual fun msiCreateTransformSummaryInfoA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress, ierrorconditions, ivalidation).toUInt()

public actual fun msiCreateTransformSummaryInfoW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiCreateTransformSummaryInfoW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress, ierrorconditions, ivalidation).toUInt()

public actual fun msiDatabaseApplyTransformA(hdatabase: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformA(hdatabase.toInt(), sztransformfile.rawAddress, ierrorconditions).toUInt()

public actual fun msiDatabaseApplyTransformW(hdatabase: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseApplyTransformW(hdatabase.toInt(), sztransformfile.rawAddress, ierrorconditions).toUInt()

public actual fun msiDatabaseCommit(hdatabase: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseCommit(hdatabase.toInt()).toUInt()

public actual fun msiDatabaseExportA(hdatabase: Msihandle, sztablename: Pcstr, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportA(hdatabase.toInt(), sztablename.rawAddress, szfolderpath.rawAddress, szfilename.rawAddress).toUInt()

public actual fun msiDatabaseExportW(hdatabase: Msihandle, sztablename: Pcwstr, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseExportW(hdatabase.toInt(), sztablename.rawAddress, szfolderpath.rawAddress, szfilename.rawAddress).toUInt()

public actual fun msiDatabaseGenerateTransformA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ireserved1: Int, ireserved2: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformA(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress, ireserved1, ireserved2).toUInt()

public actual fun msiDatabaseGenerateTransformW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ireserved1: Int, ireserved2: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGenerateTransformW(hdatabase.toInt(), hdatabasereference.toInt(), sztransformfile.rawAddress, ireserved1, ireserved2).toUInt()

public actual fun msiDatabaseGetPrimaryKeysA(hdatabase: Msihandle, sztablename: Pcstr, phrecord: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysA(hdatabase.toInt(), sztablename.rawAddress, phrecord.rawAddress).toUInt()

public actual fun msiDatabaseGetPrimaryKeysW(hdatabase: Msihandle, sztablename: Pcwstr, phrecord: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseGetPrimaryKeysW(hdatabase.toInt(), sztablename.rawAddress, phrecord.rawAddress).toUInt()

public actual fun msiDatabaseImportA(hdatabase: Msihandle, szfolderpath: Pcstr, szfilename: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportA(hdatabase.toInt(), szfolderpath.rawAddress, szfilename.rawAddress).toUInt()

public actual fun msiDatabaseImportW(hdatabase: Msihandle, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseImportW(hdatabase.toInt(), szfolderpath.rawAddress, szfilename.rawAddress).toUInt()

public actual fun msiDatabaseIsTablePersistentA(hdatabase: Msihandle, sztablename: Pcstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentA(hdatabase.toInt(), sztablename.rawAddress)

public actual fun msiDatabaseIsTablePersistentW(hdatabase: Msihandle, sztablename: Pcwstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseIsTablePersistentW(hdatabase.toInt(), sztablename.rawAddress)

public actual fun msiDatabaseMergeA(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeA(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.rawAddress).toUInt()

public actual fun msiDatabaseMergeW(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseMergeW(hdatabase.toInt(), hdatabasemerge.toInt(), sztablename.rawAddress).toUInt()

public actual fun msiDatabaseOpenViewA(hdatabase: Msihandle, szquery: Pcstr, phview: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewA(hdatabase.toInt(), szquery.rawAddress, phview.rawAddress).toUInt()

public actual fun msiDatabaseOpenViewW(hdatabase: Msihandle, szquery: Pcwstr, phview: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDatabaseOpenViewW(hdatabase.toInt(), szquery.rawAddress, phview.rawAddress).toUInt()

public actual fun msiDetermineApplicablePatchesA(szproductpackagepath: Pcstr, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfoa>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesA(szproductpackagepath.rawAddress, cpatchinfo.toInt(), ppatchinfo.rawAddress).toUInt()

public actual fun msiDetermineApplicablePatchesW(szproductpackagepath: Pcwstr, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfow>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDetermineApplicablePatchesW(szproductpackagepath.rawAddress, cpatchinfo.toInt(), ppatchinfo.rawAddress).toUInt()

public actual fun msiDeterminePatchSequenceA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfoa>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceA(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, cpatchinfo.toInt(), ppatchinfo.rawAddress).toUInt()

public actual fun msiDeterminePatchSequenceW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr<Msipatchsequenceinfow>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDeterminePatchSequenceW(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, cpatchinfo.toInt(), ppatchinfo.rawAddress).toUInt()

public actual fun msiDoActionA(hinstall: Msihandle, szaction: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionA(hinstall.toInt(), szaction.rawAddress).toUInt()

public actual fun msiDoActionW(hinstall: Msihandle, szaction: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiDoActionW(hinstall.toInt(), szaction.rawAddress).toUInt()

public actual fun msiEnableLogA(dwlogmode: UInt, szlogfile: Pcstr, dwlogattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogA(dwlogmode.toInt(), szlogfile.rawAddress, dwlogattributes.toInt()).toUInt()

public actual fun msiEnableLogW(dwlogmode: UInt, szlogfile: Pcwstr, dwlogattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableLogW(dwlogmode.toInt(), szlogfile.rawAddress, dwlogattributes.toInt()).toUInt()

public actual fun msiEnableUIPreview(hdatabase: Msihandle, phpreview: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnableUIPreview(hdatabase.toInt(), phpreview.rawAddress).toUInt()

public actual fun msiEndTransaction(dwtransactionstate: Msitransactionstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEndTransaction(dwtransactionstate.toInt()).toUInt()

public actual fun msiEnumClientsA(szcomponent: Pcstr, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsA(szcomponent.rawAddress, iproductindex.toInt(), lpproductbuf.rawAddress).toUInt()

public actual fun msiEnumClientsExA(szcomponent: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExA(szcomponent.rawAddress, szusersid.rawAddress, dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.rawAddress, pdwinstalledcontext.rawAddress, szsid.rawAddress, pcchsid.rawAddress).toUInt()

public actual fun msiEnumClientsExW(szcomponent: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsExW(szcomponent.rawAddress, szusersid.rawAddress, dwcontext.toInt(), dwproductindex.toInt(), szproductbuf.rawAddress, pdwinstalledcontext.rawAddress, szsid.rawAddress, pcchsid.rawAddress).toUInt()

public actual fun msiEnumClientsW(szcomponent: Pcwstr, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumClientsW(szcomponent.rawAddress, iproductindex.toInt(), lpproductbuf.rawAddress).toUInt()

public actual fun msiEnumComponentCostsA(hinstall: Msihandle, szcomponent: Pcstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pstr, pcchdrivebuf: MutPtr<UInt>, picost: MutPtr<Int>, pitempcost: MutPtr<Int>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsA(hinstall.toInt(), szcomponent.rawAddress, dwindex.toInt(), istate, szdrivebuf.rawAddress, pcchdrivebuf.rawAddress, picost.rawAddress, pitempcost.rawAddress).toUInt()

public actual fun msiEnumComponentCostsW(hinstall: Msihandle, szcomponent: Pcwstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pwstr, pcchdrivebuf: MutPtr<UInt>, picost: MutPtr<Int>, pitempcost: MutPtr<Int>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentCostsW(hinstall.toInt(), szcomponent.rawAddress, dwindex.toInt(), istate, szdrivebuf.rawAddress, pcchdrivebuf.rawAddress, picost.rawAddress, pitempcost.rawAddress).toUInt()

public actual fun msiEnumComponentQualifiersA(szcomponent: Pcstr, iindex: UInt, lpqualifierbuf: Pstr, pcchqualifierbuf: MutPtr<UInt>, lpapplicationdatabuf: Pstr, pcchapplicationdatabuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersA(szcomponent.rawAddress, iindex.toInt(), lpqualifierbuf.rawAddress, pcchqualifierbuf.rawAddress, lpapplicationdatabuf.rawAddress, pcchapplicationdatabuf.rawAddress).toUInt()

public actual fun msiEnumComponentQualifiersW(szcomponent: Pcwstr, iindex: UInt, lpqualifierbuf: Pwstr, pcchqualifierbuf: MutPtr<UInt>, lpapplicationdatabuf: Pwstr, pcchapplicationdatabuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentQualifiersW(szcomponent.rawAddress, iindex.toInt(), lpqualifierbuf.rawAddress, pcchqualifierbuf.rawAddress, lpapplicationdatabuf.rawAddress, pcchapplicationdatabuf.rawAddress).toUInt()

public actual fun msiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsA(icomponentindex.toInt(), lpcomponentbuf.rawAddress).toUInt()

public actual fun msiEnumComponentsExA(szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExA(szusersid.rawAddress, dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.rawAddress, pdwinstalledcontext.rawAddress, szsid.rawAddress, pcchsid.rawAddress).toUInt()

public actual fun msiEnumComponentsExW(szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsExW(szusersid.rawAddress, dwcontext.toInt(), dwindex.toInt(), szinstalledcomponentcode.rawAddress, pdwinstalledcontext.rawAddress, szsid.rawAddress, pcchsid.rawAddress).toUInt()

public actual fun msiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumComponentsW(icomponentindex.toInt(), lpcomponentbuf.rawAddress).toUInt()

public actual fun msiEnumFeaturesA(szproduct: Pcstr, ifeatureindex: UInt, lpfeaturebuf: Pstr, lpparentbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesA(szproduct.rawAddress, ifeatureindex.toInt(), lpfeaturebuf.rawAddress, lpparentbuf.rawAddress).toUInt()

public actual fun msiEnumFeaturesW(szproduct: Pcwstr, ifeatureindex: UInt, lpfeaturebuf: Pwstr, lpparentbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumFeaturesW(szproduct.rawAddress, ifeatureindex.toInt(), lpfeaturebuf.rawAddress, lpparentbuf.rawAddress).toUInt()

public actual fun msiEnumPatchesA(szproduct: Pcstr, ipatchindex: UInt, lppatchbuf: Pstr, lptransformsbuf: Pstr, pcchtransformsbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesA(szproduct.rawAddress, ipatchindex.toInt(), lppatchbuf.rawAddress, lptransformsbuf.rawAddress, pcchtransformsbuf.rawAddress).toUInt()

public actual fun msiEnumPatchesExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pstr, sztargetproductcode: Pstr, pdwtargetproductcontext: MutPtr<Msiinstallcontext>, sztargetusersid: Pstr, pcchtargetusersid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExA(szproductcode.rawAddress, szusersid.rawAddress, dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.rawAddress, sztargetproductcode.rawAddress, pdwtargetproductcontext.rawAddress, sztargetusersid.rawAddress, pcchtargetusersid.rawAddress).toUInt()

public actual fun msiEnumPatchesExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pwstr, sztargetproductcode: Pwstr, pdwtargetproductcontext: MutPtr<Msiinstallcontext>, sztargetusersid: Pwstr, pcchtargetusersid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesExW(szproductcode.rawAddress, szusersid.rawAddress, dwcontext.toInt(), dwfilter.toInt(), dwindex.toInt(), szpatchcode.rawAddress, sztargetproductcode.rawAddress, pdwtargetproductcontext.rawAddress, sztargetusersid.rawAddress, pcchtargetusersid.rawAddress).toUInt()

public actual fun msiEnumPatchesW(szproduct: Pcwstr, ipatchindex: UInt, lppatchbuf: Pwstr, lptransformsbuf: Pwstr, pcchtransformsbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumPatchesW(szproduct.rawAddress, ipatchindex.toInt(), lppatchbuf.rawAddress, lptransformsbuf.rawAddress, pcchtransformsbuf.rawAddress).toUInt()

public actual fun msiEnumProductsA(iproductindex: UInt, lpproductbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsA(iproductindex.toInt(), lpproductbuf.rawAddress).toUInt()

public actual fun msiEnumProductsExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pstr, pcchsid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExA(szproductcode.rawAddress, szusersid.rawAddress, dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.rawAddress, pdwinstalledcontext.rawAddress, szsid.rawAddress, pcchsid.rawAddress).toUInt()

public actual fun msiEnumProductsExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pwstr, pdwinstalledcontext: MutPtr<Msiinstallcontext>, szsid: Pwstr, pcchsid: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsExW(szproductcode.rawAddress, szusersid.rawAddress, dwcontext.toInt(), dwindex.toInt(), szinstalledproductcode.rawAddress, pdwinstalledcontext.rawAddress, szsid.rawAddress, pcchsid.rawAddress).toUInt()

public actual fun msiEnumProductsW(iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumProductsW(iproductindex.toInt(), lpproductbuf.rawAddress).toUInt()

public actual fun msiEnumRelatedProductsA(lpupgradecode: Pcstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsA(lpupgradecode.rawAddress, dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.rawAddress).toUInt()

public actual fun msiEnumRelatedProductsW(lpupgradecode: Pcwstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEnumRelatedProductsW(lpupgradecode.rawAddress, dwreserved.toInt(), iproductindex.toInt(), lpproductbuf.rawAddress).toUInt()

public actual fun msiEvaluateConditionA(hinstall: Msihandle, szcondition: Pcstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionA(hinstall.toInt(), szcondition.rawAddress)

public actual fun msiEvaluateConditionW(hinstall: Msihandle, szcondition: Pcwstr): Msicondition =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiEvaluateConditionW(hinstall.toInt(), szcondition.rawAddress)

public actual fun msiExtractPatchXMLDataA(szpatchpath: Pcstr, dwreserved: UInt, szxmldata: Pstr, pcchxmldata: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataA(szpatchpath.rawAddress, dwreserved.toInt(), szxmldata.rawAddress, pcchxmldata.rawAddress).toUInt()

public actual fun msiExtractPatchXMLDataW(szpatchpath: Pcwstr, dwreserved: UInt, szxmldata: Pwstr, pcchxmldata: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiExtractPatchXMLDataW(szpatchpath.rawAddress, dwreserved.toInt(), szxmldata.rawAddress, pcchxmldata.rawAddress).toUInt()

public actual fun msiFormatRecordA(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pstr, pcchresultbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordA(hinstall.toInt(), hrecord.toInt(), szresultbuf.rawAddress, pcchresultbuf.rawAddress).toUInt()

public actual fun msiFormatRecordW(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pwstr, pcchresultbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiFormatRecordW(hinstall.toInt(), hrecord.toInt(), szresultbuf.rawAddress, pcchresultbuf.rawAddress).toUInt()

public actual fun msiGetActiveDatabase(hinstall: Msihandle): Msihandle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetActiveDatabase(hinstall.toInt()).toUInt()

public actual fun msiGetComponentPathA(szproduct: Pcstr, szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr<UInt>): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathA(szproduct.rawAddress, szcomponent.rawAddress, lppathbuf.rawAddress, pcchbuf.rawAddress)

public actual fun msiGetComponentPathExA(szproductcode: Pcstr, szcomponentcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pstr, pcchoutpathbuffer: MutPtr<UInt>): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExA(szproductcode.rawAddress, szcomponentcode.rawAddress, szusersid.rawAddress, dwcontext, lpoutpathbuffer.rawAddress, pcchoutpathbuffer.rawAddress)

public actual fun msiGetComponentPathExW(szproductcode: Pcwstr, szcomponentcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pwstr, pcchoutpathbuffer: MutPtr<UInt>): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathExW(szproductcode.rawAddress, szcomponentcode.rawAddress, szusersid.rawAddress, dwcontext, lpoutpathbuffer.rawAddress, pcchoutpathbuffer.rawAddress)

public actual fun msiGetComponentPathW(szproduct: Pcwstr, szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr<UInt>): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentPathW(szproduct.rawAddress, szcomponent.rawAddress, lppathbuf.rawAddress, pcchbuf.rawAddress)

public actual fun msiGetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateA(hinstall.toInt(), szcomponent.rawAddress, piinstalled.rawAddress, piaction.rawAddress).toUInt()

public actual fun msiGetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetComponentStateW(hinstall.toInt(), szcomponent.rawAddress, piinstalled.rawAddress, piaction.rawAddress).toUInt()

public actual fun msiGetDatabaseState(hdatabase: Msihandle): Msidbstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetDatabaseState(hdatabase.toInt())

public actual fun msiGetFeatureCostA(hinstall: Msihandle, szfeature: Pcstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr<Int>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostA(hinstall.toInt(), szfeature.rawAddress, icosttree, istate, picost.rawAddress).toUInt()

public actual fun msiGetFeatureCostW(hinstall: Msihandle, szfeature: Pcwstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr<Int>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureCostW(hinstall.toInt(), szfeature.rawAddress, icosttree, istate, picost.rawAddress).toUInt()

public actual fun msiGetFeatureInfoA(hproduct: Msihandle, szfeature: Pcstr, lpattributes: MutPtr<UInt>, lptitlebuf: Pstr, pcchtitlebuf: MutPtr<UInt>, lphelpbuf: Pstr, pcchhelpbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoA(hproduct.toInt(), szfeature.rawAddress, lpattributes.rawAddress, lptitlebuf.rawAddress, pcchtitlebuf.rawAddress, lphelpbuf.rawAddress, pcchhelpbuf.rawAddress).toUInt()

public actual fun msiGetFeatureInfoW(hproduct: Msihandle, szfeature: Pcwstr, lpattributes: MutPtr<UInt>, lptitlebuf: Pwstr, pcchtitlebuf: MutPtr<UInt>, lphelpbuf: Pwstr, pcchhelpbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureInfoW(hproduct.toInt(), szfeature.rawAddress, lpattributes.rawAddress, lptitlebuf.rawAddress, pcchtitlebuf.rawAddress, lphelpbuf.rawAddress, pcchhelpbuf.rawAddress).toUInt()

public actual fun msiGetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateA(hinstall.toInt(), szfeature.rawAddress, piinstalled.rawAddress, piaction.rawAddress).toUInt()

public actual fun msiGetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, piinstalled: MutPtr<Installstate>, piaction: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureStateW(hinstall.toInt(), szfeature.rawAddress, piinstalled.rawAddress, piaction.rawAddress).toUInt()

public actual fun msiGetFeatureUsageA(szproduct: Pcstr, szfeature: Pcstr, pdwusecount: MutPtr<UInt>, pwdateused: MutPtr<UShort>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageA(szproduct.rawAddress, szfeature.rawAddress, pdwusecount.rawAddress, pwdateused.rawAddress).toUInt()

public actual fun msiGetFeatureUsageW(szproduct: Pcwstr, szfeature: Pcwstr, pdwusecount: MutPtr<UInt>, pwdateused: MutPtr<UShort>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureUsageW(szproduct.rawAddress, szfeature.rawAddress, pdwusecount.rawAddress, pwdateused.rawAddress).toUInt()

public actual fun msiGetFeatureValidStatesA(hinstall: Msihandle, szfeature: Pcstr, lpinstallstates: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesA(hinstall.toInt(), szfeature.rawAddress, lpinstallstates.rawAddress).toUInt()

public actual fun msiGetFeatureValidStatesW(hinstall: Msihandle, szfeature: Pcwstr, lpinstallstates: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFeatureValidStatesW(hinstall.toInt(), szfeature.rawAddress, lpinstallstates.rawAddress).toUInt()

public actual fun msiGetFileHashA(szfilepath: Pcstr, dwoptions: UInt, phash: MutPtr<Msifilehashinfo>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashA(szfilepath.rawAddress, dwoptions.toInt(), phash.rawAddress).toUInt()

public actual fun msiGetFileHashW(szfilepath: Pcwstr, dwoptions: UInt, phash: MutPtr<Msifilehashinfo>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileHashW(szfilepath.rawAddress, dwoptions.toInt(), phash.rawAddress).toUInt()

public actual fun msiGetFileSignatureInformationA(szsignedobjectpath: Pcstr, dwflags: UInt, ppccertcontext: MutPtr<MutPtr<CertContext>>, pbhashdata: MutPtr<UByte>, pcbhashdata: MutPtr<UInt>): Hresult =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationA(szsignedobjectpath.rawAddress, dwflags.toInt(), ppccertcontext.rawAddress, pbhashdata.rawAddress, pcbhashdata.rawAddress)

public actual fun msiGetFileSignatureInformationW(szsignedobjectpath: Pcwstr, dwflags: UInt, ppccertcontext: MutPtr<MutPtr<CertContext>>, pbhashdata: MutPtr<UByte>, pcbhashdata: MutPtr<UInt>): Hresult =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileSignatureInformationW(szsignedobjectpath.rawAddress, dwflags.toInt(), ppccertcontext.rawAddress, pbhashdata.rawAddress, pcbhashdata.rawAddress)

public actual fun msiGetFileVersionA(szfilepath: Pcstr, lpversionbuf: Pstr, pcchversionbuf: MutPtr<UInt>, lplangbuf: Pstr, pcchlangbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionA(szfilepath.rawAddress, lpversionbuf.rawAddress, pcchversionbuf.rawAddress, lplangbuf.rawAddress, pcchlangbuf.rawAddress).toUInt()

public actual fun msiGetFileVersionW(szfilepath: Pcwstr, lpversionbuf: Pwstr, pcchversionbuf: MutPtr<UInt>, lplangbuf: Pwstr, pcchlangbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetFileVersionW(szfilepath.rawAddress, lpversionbuf.rawAddress, pcchversionbuf.rawAddress, lplangbuf.rawAddress, pcchlangbuf.rawAddress).toUInt()

public actual fun msiGetLanguage(hinstall: Msihandle): UShort =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLanguage(hinstall.toInt()).toUShort()

public actual fun msiGetLastErrorRecord(): Msihandle =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetLastErrorRecord().toUInt()

public actual fun msiGetMode(hinstall: Msihandle, erunmode: Msirunmode): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetMode(hinstall.toInt(), erunmode)

public actual fun msiGetPatchFileListA(szproductcode: Pcstr, szpatchpackages: Pcstr, pcfiles: MutPtr<UInt>, pphfilerecords: MutPtr<MutPtr<Msihandle>>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListA(szproductcode.rawAddress, szpatchpackages.rawAddress, pcfiles.rawAddress, pphfilerecords.rawAddress).toUInt()

public actual fun msiGetPatchFileListW(szproductcode: Pcwstr, szpatchpackages: Pcwstr, pcfiles: MutPtr<UInt>, pphfilerecords: MutPtr<MutPtr<Msihandle>>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchFileListW(szproductcode.rawAddress, szpatchpackages.rawAddress, pcfiles.rawAddress, pphfilerecords.rawAddress).toUInt()

public actual fun msiGetPatchInfoA(szpatch: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoA(szpatch.rawAddress, szattribute.rawAddress, lpvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetPatchInfoExA(szpatchcode: Pcstr, szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, lpvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExA(szpatchcode.rawAddress, szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szproperty.rawAddress, lpvalue.rawAddress, pcchvalue.rawAddress).toUInt()

public actual fun msiGetPatchInfoExW(szpatchcode: Pcwstr, szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, lpvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoExW(szpatchcode.rawAddress, szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szproperty.rawAddress, lpvalue.rawAddress, pcchvalue.rawAddress).toUInt()

public actual fun msiGetPatchInfoW(szpatch: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPatchInfoW(szpatch.rawAddress, szattribute.rawAddress, lpvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetProductCodeA(szcomponent: Pcstr, lpbuf39: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeA(szcomponent.rawAddress, lpbuf39.rawAddress).toUInt()

public actual fun msiGetProductCodeW(szcomponent: Pcwstr, lpbuf39: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductCodeW(szcomponent.rawAddress, lpbuf39.rawAddress).toUInt()

public actual fun msiGetProductInfoA(szproduct: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoA(szproduct.rawAddress, szattribute.rawAddress, lpvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetProductInfoExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExA(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szproperty.rawAddress, szvalue.rawAddress, pcchvalue.rawAddress).toUInt()

public actual fun msiGetProductInfoExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoExW(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szproperty.rawAddress, szvalue.rawAddress, pcchvalue.rawAddress).toUInt()

public actual fun msiGetProductInfoFromScriptA(szscriptfile: Pcstr, lpproductbuf39: Pstr, plgidlanguage: MutPtr<UShort>, pdwversion: MutPtr<UInt>, lpnamebuf: Pstr, pcchnamebuf: MutPtr<UInt>, lppackagebuf: Pstr, pcchpackagebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptA(szscriptfile.rawAddress, lpproductbuf39.rawAddress, plgidlanguage.rawAddress, pdwversion.rawAddress, lpnamebuf.rawAddress, pcchnamebuf.rawAddress, lppackagebuf.rawAddress, pcchpackagebuf.rawAddress).toUInt()

public actual fun msiGetProductInfoFromScriptW(szscriptfile: Pcwstr, lpproductbuf39: Pwstr, plgidlanguage: MutPtr<UShort>, pdwversion: MutPtr<UInt>, lpnamebuf: Pwstr, pcchnamebuf: MutPtr<UInt>, lppackagebuf: Pwstr, pcchpackagebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoFromScriptW(szscriptfile.rawAddress, lpproductbuf39.rawAddress, plgidlanguage.rawAddress, pdwversion.rawAddress, lpnamebuf.rawAddress, pcchnamebuf.rawAddress, lppackagebuf.rawAddress, pcchpackagebuf.rawAddress).toUInt()

public actual fun msiGetProductInfoW(szproduct: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductInfoW(szproduct.rawAddress, szattribute.rawAddress, lpvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetProductPropertyA(hproduct: Msihandle, szproperty: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyA(hproduct.toInt(), szproperty.rawAddress, lpvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetProductPropertyW(hproduct: Msihandle, szproperty: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetProductPropertyW(hproduct.toInt(), szproperty.rawAddress, lpvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetPropertyA(hinstall: Msihandle, szname: Pcstr, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyA(hinstall.toInt(), szname.rawAddress, szvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetPropertyW(hinstall.toInt(), szname.rawAddress, szvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiGetShortcutTargetA(szshortcutpath: Pcstr, szproductcode: Pstr, szfeatureid: Pstr, szcomponentcode: Pstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetA(szshortcutpath.rawAddress, szproductcode.rawAddress, szfeatureid.rawAddress, szcomponentcode.rawAddress).toUInt()

public actual fun msiGetShortcutTargetW(szshortcutpath: Pcwstr, szproductcode: Pwstr, szfeatureid: Pwstr, szcomponentcode: Pwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetShortcutTargetW(szshortcutpath.rawAddress, szproductcode.rawAddress, szfeatureid.rawAddress, szcomponentcode.rawAddress).toUInt()

public actual fun msiGetSourcePathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathA(hinstall.toInt(), szfolder.rawAddress, szpathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiGetSourcePathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSourcePathW(hinstall.toInt(), szfolder.rawAddress, szpathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiGetSummaryInformationA(hdatabase: Msihandle, szdatabasepath: Pcstr, uiupdatecount: UInt, phsummaryinfo: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationA(hdatabase.toInt(), szdatabasepath.rawAddress, uiupdatecount.toInt(), phsummaryinfo.rawAddress).toUInt()

public actual fun msiGetSummaryInformationW(hdatabase: Msihandle, szdatabasepath: Pcwstr, uiupdatecount: UInt, phsummaryinfo: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetSummaryInformationW(hdatabase.toInt(), szdatabasepath.rawAddress, uiupdatecount.toInt(), phsummaryinfo.rawAddress).toUInt()

public actual fun msiGetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathA(hinstall.toInt(), szfolder.rawAddress, szpathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiGetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetTargetPathW(hinstall.toInt(), szfolder.rawAddress, szpathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiGetUserInfoA(szproduct: Pcstr, lpusernamebuf: Pstr, pcchusernamebuf: MutPtr<UInt>, lporgnamebuf: Pstr, pcchorgnamebuf: MutPtr<UInt>, lpserialbuf: Pstr, pcchserialbuf: MutPtr<UInt>): Userinfostate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoA(szproduct.rawAddress, lpusernamebuf.rawAddress, pcchusernamebuf.rawAddress, lporgnamebuf.rawAddress, pcchorgnamebuf.rawAddress, lpserialbuf.rawAddress, pcchserialbuf.rawAddress)

public actual fun msiGetUserInfoW(szproduct: Pcwstr, lpusernamebuf: Pwstr, pcchusernamebuf: MutPtr<UInt>, lporgnamebuf: Pwstr, pcchorgnamebuf: MutPtr<UInt>, lpserialbuf: Pwstr, pcchserialbuf: MutPtr<UInt>): Userinfostate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiGetUserInfoW(szproduct.rawAddress, lpusernamebuf.rawAddress, pcchusernamebuf.rawAddress, lporgnamebuf.rawAddress, pcchorgnamebuf.rawAddress, lpserialbuf.rawAddress, pcchserialbuf.rawAddress)

public actual fun msiInstallMissingComponentA(szproduct: Pcstr, szcomponent: Pcstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentA(szproduct.rawAddress, szcomponent.rawAddress, einstallstate).toUInt()

public actual fun msiInstallMissingComponentW(szproduct: Pcwstr, szcomponent: Pcwstr, einstallstate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingComponentW(szproduct.rawAddress, szcomponent.rawAddress, einstallstate).toUInt()

public actual fun msiInstallMissingFileA(szproduct: Pcstr, szfile: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileA(szproduct.rawAddress, szfile.rawAddress).toUInt()

public actual fun msiInstallMissingFileW(szproduct: Pcwstr, szfile: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallMissingFileW(szproduct.rawAddress, szfile.rawAddress).toUInt()

public actual fun msiInstallProductA(szpackagepath: Pcstr, szcommandline: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductA(szpackagepath.rawAddress, szcommandline.rawAddress).toUInt()

public actual fun msiInstallProductW(szpackagepath: Pcwstr, szcommandline: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiInstallProductW(szpackagepath.rawAddress, szcommandline.rawAddress).toUInt()

public actual fun msiIsProductElevatedA(szproduct: Pcstr, pfelevated: MutPtr<Bool>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedA(szproduct.rawAddress, pfelevated.rawAddress).toUInt()

public actual fun msiIsProductElevatedW(szproduct: Pcwstr, pfelevated: MutPtr<Bool>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiIsProductElevatedW(szproduct.rawAddress, pfelevated.rawAddress).toUInt()

public actual fun msiJoinTransaction(htransactionhandle: Msihandle, dwtransactionattributes: UInt, phchangeofownerevent: MutPtr<Handle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiJoinTransaction(htransactionhandle.toInt(), dwtransactionattributes.toInt(), phchangeofownerevent.rawAddress).toUInt()

public actual fun msiLocateComponentA(szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr<UInt>): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentA(szcomponent.rawAddress, lppathbuf.rawAddress, pcchbuf.rawAddress)

public actual fun msiLocateComponentW(szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr<UInt>): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiLocateComponentW(szcomponent.rawAddress, lppathbuf.rawAddress, pcchbuf.rawAddress)

public actual fun msiNotifySidChangeA(poldsid: Pcstr, pnewsid: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeA(poldsid.rawAddress, pnewsid.rawAddress).toUInt()

public actual fun msiNotifySidChangeW(poldsid: Pcwstr, pnewsid: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiNotifySidChangeW(poldsid.rawAddress, pnewsid.rawAddress).toUInt()

public actual fun msiOpenDatabaseA(szdatabasepath: Pcstr, szpersist: Pcstr, phdatabase: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseA(szdatabasepath.rawAddress, szpersist.rawAddress, phdatabase.rawAddress).toUInt()

public actual fun msiOpenDatabaseW(szdatabasepath: Pcwstr, szpersist: Pcwstr, phdatabase: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenDatabaseW(szdatabasepath.rawAddress, szpersist.rawAddress, phdatabase.rawAddress).toUInt()

public actual fun msiOpenPackageA(szpackagepath: Pcstr, hproduct: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageA(szpackagepath.rawAddress, hproduct.rawAddress).toUInt()

public actual fun msiOpenPackageExA(szpackagepath: Pcstr, dwoptions: UInt, hproduct: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExA(szpackagepath.rawAddress, dwoptions.toInt(), hproduct.rawAddress).toUInt()

public actual fun msiOpenPackageExW(szpackagepath: Pcwstr, dwoptions: UInt, hproduct: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageExW(szpackagepath.rawAddress, dwoptions.toInt(), hproduct.rawAddress).toUInt()

public actual fun msiOpenPackageW(szpackagepath: Pcwstr, hproduct: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenPackageW(szpackagepath.rawAddress, hproduct.rawAddress).toUInt()

public actual fun msiOpenProductA(szproduct: Pcstr, hproduct: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductA(szproduct.rawAddress, hproduct.rawAddress).toUInt()

public actual fun msiOpenProductW(szproduct: Pcwstr, hproduct: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiOpenProductW(szproduct.rawAddress, hproduct.rawAddress).toUInt()

public actual fun msiPreviewBillboardA(hpreview: Msihandle, szcontrolname: Pcstr, szbillboard: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardA(hpreview.toInt(), szcontrolname.rawAddress, szbillboard.rawAddress).toUInt()

public actual fun msiPreviewBillboardW(hpreview: Msihandle, szcontrolname: Pcwstr, szbillboard: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewBillboardW(hpreview.toInt(), szcontrolname.rawAddress, szbillboard.rawAddress).toUInt()

public actual fun msiPreviewDialogA(hpreview: Msihandle, szdialogname: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogA(hpreview.toInt(), szdialogname.rawAddress).toUInt()

public actual fun msiPreviewDialogW(hpreview: Msihandle, szdialogname: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiPreviewDialogW(hpreview.toInt(), szdialogname.rawAddress).toUInt()

public actual fun msiProcessAdvertiseScriptA(szscriptfile: Pcstr, sziconfolder: Pcstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptA(szscriptfile.rawAddress, sziconfolder.rawAddress, hregdata.rawAddress, fshortcuts, fremoveitems).toUInt()

public actual fun msiProcessAdvertiseScriptW(szscriptfile: Pcwstr, sziconfolder: Pcwstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessAdvertiseScriptW(szscriptfile.rawAddress, sziconfolder.rawAddress, hregdata.rawAddress, fshortcuts, fremoveitems).toUInt()

public actual fun msiProcessMessage(hinstall: Msihandle, emessagetype: Installmessage, hrecord: Msihandle): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProcessMessage(hinstall.toInt(), emessagetype, hrecord.toInt())

public actual fun msiProvideAssemblyA(szassemblyname: Pcstr, szappcontext: Pcstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyA(szassemblyname.rawAddress, szappcontext.rawAddress, dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiProvideAssemblyW(szassemblyname: Pcwstr, szappcontext: Pcwstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideAssemblyW(szassemblyname.rawAddress, szappcontext.rawAddress, dwinstallmode.toInt(), dwassemblyinfo.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiProvideComponentA(szproduct: Pcstr, szfeature: Pcstr, szcomponent: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentA(szproduct.rawAddress, szfeature.rawAddress, szcomponent.rawAddress, dwinstallmode.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiProvideComponentW(szproduct: Pcwstr, szfeature: Pcwstr, szcomponent: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideComponentW(szproduct.rawAddress, szfeature.rawAddress, szcomponent.rawAddress, dwinstallmode.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiProvideQualifiedComponentA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentA(szcategory.rawAddress, szqualifier.rawAddress, dwinstallmode.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiProvideQualifiedComponentExA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, szproduct: Pcstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExA(szcategory.rawAddress, szqualifier.rawAddress, dwinstallmode.toInt(), szproduct.rawAddress, dwunused1.toInt(), dwunused2.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiProvideQualifiedComponentExW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, szproduct: Pcwstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentExW(szcategory.rawAddress, szqualifier.rawAddress, dwinstallmode.toInt(), szproduct.rawAddress, dwunused1.toInt(), dwunused2.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiProvideQualifiedComponentW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiProvideQualifiedComponentW(szcategory.rawAddress, szqualifier.rawAddress, dwinstallmode.toInt(), lppathbuf.rawAddress, pcchpathbuf.rawAddress).toUInt()

public actual fun msiQueryComponentStateA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcstr, pdwstate: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateA(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szcomponentcode.rawAddress, pdwstate.rawAddress).toUInt()

public actual fun msiQueryComponentStateW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcwstr, pdwstate: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryComponentStateW(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szcomponentcode.rawAddress, pdwstate.rawAddress).toUInt()

public actual fun msiQueryFeatureStateA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateA(szproduct.rawAddress, szfeature.rawAddress)

public actual fun msiQueryFeatureStateExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szfeature: Pcstr, pdwstate: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExA(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szfeature.rawAddress, pdwstate.rawAddress).toUInt()

public actual fun msiQueryFeatureStateExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szfeature: Pcwstr, pdwstate: MutPtr<Installstate>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateExW(szproductcode.rawAddress, szusersid.rawAddress, dwcontext, szfeature.rawAddress, pdwstate.rawAddress).toUInt()

public actual fun msiQueryFeatureStateW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryFeatureStateW(szproduct.rawAddress, szfeature.rawAddress)

public actual fun msiQueryProductStateA(szproduct: Pcstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateA(szproduct.rawAddress)

public actual fun msiQueryProductStateW(szproduct: Pcwstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiQueryProductStateW(szproduct.rawAddress)

public actual fun msiRecordClearData(hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordClearData(hrecord.toInt()).toUInt()

public actual fun msiRecordDataSize(hrecord: Msihandle, ifield: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordDataSize(hrecord.toInt(), ifield.toInt()).toUInt()

public actual fun msiRecordGetFieldCount(hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetFieldCount(hrecord.toInt()).toUInt()

public actual fun msiRecordGetInteger(hrecord: Msihandle, ifield: UInt): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetInteger(hrecord.toInt(), ifield.toInt())

public actual fun msiRecordGetStringA(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringA(hrecord.toInt(), ifield.toInt(), szvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiRecordGetStringW(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordGetStringW(hrecord.toInt(), ifield.toInt(), szvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiRecordIsNull(hrecord: Msihandle, ifield: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordIsNull(hrecord.toInt(), ifield.toInt())

public actual fun msiRecordReadStream(hrecord: Msihandle, ifield: UInt, szdatabuf: Pstr, pcbdatabuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordReadStream(hrecord.toInt(), ifield.toInt(), szdatabuf.rawAddress, pcbdatabuf.rawAddress).toUInt()

public actual fun msiRecordSetInteger(hrecord: Msihandle, ifield: UInt, ivalue: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetInteger(hrecord.toInt(), ifield.toInt(), ivalue).toUInt()

public actual fun msiRecordSetStreamA(hrecord: Msihandle, ifield: UInt, szfilepath: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamA(hrecord.toInt(), ifield.toInt(), szfilepath.rawAddress).toUInt()

public actual fun msiRecordSetStreamW(hrecord: Msihandle, ifield: UInt, szfilepath: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStreamW(hrecord.toInt(), ifield.toInt(), szfilepath.rawAddress).toUInt()

public actual fun msiRecordSetStringA(hrecord: Msihandle, ifield: UInt, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringA(hrecord.toInt(), ifield.toInt(), szvalue.rawAddress).toUInt()

public actual fun msiRecordSetStringW(hrecord: Msihandle, ifield: UInt, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRecordSetStringW(hrecord.toInt(), ifield.toInt(), szvalue.rawAddress).toUInt()

public actual fun msiReinstallFeatureA(szproduct: Pcstr, szfeature: Pcstr, dwreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureA(szproduct.rawAddress, szfeature.rawAddress, dwreinstallmode.toInt()).toUInt()

public actual fun msiReinstallFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, dwreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallFeatureW(szproduct.rawAddress, szfeature.rawAddress, dwreinstallmode.toInt()).toUInt()

public actual fun msiReinstallProductA(szproduct: Pcstr, szreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductA(szproduct.rawAddress, szreinstallmode.toInt()).toUInt()

public actual fun msiReinstallProductW(szproduct: Pcwstr, szreinstallmode: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiReinstallProductW(szproduct.rawAddress, szreinstallmode.toInt()).toUInt()

public actual fun msiRemovePatchesA(szpatchlist: Pcstr, szproductcode: Pcstr, euninstalltype: Installtype, szpropertylist: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesA(szpatchlist.rawAddress, szproductcode.rawAddress, euninstalltype, szpropertylist.rawAddress).toUInt()

public actual fun msiRemovePatchesW(szpatchlist: Pcwstr, szproductcode: Pcwstr, euninstalltype: Installtype, szpropertylist: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiRemovePatchesW(szpatchlist.rawAddress, szproductcode.rawAddress, euninstalltype, szpropertylist.rawAddress).toUInt()

public actual fun msiSequenceA(hinstall: Msihandle, sztable: Pcstr, isequencemode: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceA(hinstall.toInt(), sztable.rawAddress, isequencemode).toUInt()

public actual fun msiSequenceW(hinstall: Msihandle, sztable: Pcwstr, isequencemode: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSequenceW(hinstall.toInt(), sztable.rawAddress, isequencemode).toUInt()

public actual fun msiSetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateA(hinstall.toInt(), szcomponent.rawAddress, istate).toUInt()

public actual fun msiSetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetComponentStateW(hinstall.toInt(), szcomponent.rawAddress, istate).toUInt()

public actual fun msiSetExternalUIA(puihandler: InstalluiHandlera, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>): InstalluiHandlera =
    null

public actual fun msiSetExternalUIRecord(puihandler: PinstalluiHandlerRecord, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>, ppuiprevhandler: PinstalluiHandlerRecord): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetExternalUIRecord(0L, dwmessagefilter.toInt(), pvcontext.rawAddress, 0L).toUInt()

public actual fun msiSetExternalUIW(puihandler: InstalluiHandlerw, dwmessagefilter: UInt, pvcontext: ConstPtr<CVoid>): InstalluiHandlerw =
    null

public actual fun msiSetFeatureAttributesA(hinstall: Msihandle, szfeature: Pcstr, dwattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesA(hinstall.toInt(), szfeature.rawAddress, dwattributes.toInt()).toUInt()

public actual fun msiSetFeatureAttributesW(hinstall: Msihandle, szfeature: Pcwstr, dwattributes: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureAttributesW(hinstall.toInt(), szfeature.rawAddress, dwattributes.toInt()).toUInt()

public actual fun msiSetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateA(hinstall.toInt(), szfeature.rawAddress, istate).toUInt()

public actual fun msiSetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, istate: Installstate): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetFeatureStateW(hinstall.toInt(), szfeature.rawAddress, istate).toUInt()

public actual fun msiSetInstallLevel(hinstall: Msihandle, iinstalllevel: Int): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInstallLevel(hinstall.toInt(), iinstalllevel).toUInt()

public actual fun msiSetInternalUI(dwuilevel: Installuilevel, phwnd: MutPtr<Hwnd>): Installuilevel =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetInternalUI(dwuilevel, phwnd.rawAddress)

public actual fun msiSetMode(hinstall: Msihandle, erunmode: Msirunmode, fstate: Bool): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetMode(hinstall.toInt(), erunmode, fstate).toUInt()

public actual fun msiSetPropertyA(hinstall: Msihandle, szname: Pcstr, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyA(hinstall.toInt(), szname.rawAddress, szvalue.rawAddress).toUInt()

public actual fun msiSetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetPropertyW(hinstall.toInt(), szname.rawAddress, szvalue.rawAddress).toUInt()

public actual fun msiSetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szfolderpath: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathA(hinstall.toInt(), szfolder.rawAddress, szfolderpath.rawAddress).toUInt()

public actual fun msiSetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szfolderpath: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSetTargetPathW(hinstall.toInt(), szfolder.rawAddress, szfolderpath.rawAddress).toUInt()

public actual fun msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcstr, szdiskprompt: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.rawAddress, szdiskprompt.rawAddress).toUInt()

public actual fun msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcwstr, szdiskprompt: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddMediaDiskW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwdiskid.toInt(), szvolumelabel.rawAddress, szdiskprompt.rawAddress).toUInt()

public actual fun msiSourceListAddSourceA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt, szsource: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceA(szproduct.rawAddress, szusername.rawAddress, dwreserved.toInt(), szsource.rawAddress).toUInt()

public actual fun msiSourceListAddSourceExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr, dwindex: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szsource.rawAddress, dwindex.toInt()).toUInt()

public actual fun msiSourceListAddSourceExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr, dwindex: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceExW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szsource.rawAddress, dwindex.toInt()).toUInt()

public actual fun msiSourceListAddSourceW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt, szsource: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListAddSourceW(szproduct.rawAddress, szusername.rawAddress, dwreserved.toInt(), szsource.rawAddress).toUInt()

public actual fun msiSourceListClearAllA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllA(szproduct.rawAddress, szusername.rawAddress, dwreserved.toInt()).toUInt()

public actual fun msiSourceListClearAllExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListClearAllExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllExW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListClearAllW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearAllW(szproduct.rawAddress, szusername.rawAddress, dwreserved.toInt()).toUInt()

public actual fun msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt()

public actual fun msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearMediaDiskW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwdiskid.toInt()).toUInt()

public actual fun msiSourceListClearSourceA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szsource.rawAddress).toUInt()

public actual fun msiSourceListClearSourceW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListClearSourceW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szsource.rawAddress).toUInt()

public actual fun msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr<UInt>, szvolumelabel: Pstr, pcchvolumelabel: MutPtr<UInt>, szdiskprompt: Pstr, pcchdiskprompt: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.rawAddress, szvolumelabel.rawAddress, pcchvolumelabel.rawAddress, szdiskprompt.rawAddress, pcchdiskprompt.rawAddress).toUInt()

public actual fun msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr<UInt>, szvolumelabel: Pwstr, pcchvolumelabel: MutPtr<UInt>, szdiskprompt: Pwstr, pcchdiskprompt: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumMediaDisksW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwindex.toInt(), pdwdiskid.rawAddress, szvolumelabel.rawAddress, pcchvolumelabel.rawAddress, szdiskprompt.rawAddress, pcchdiskprompt.rawAddress).toUInt()

public actual fun msiSourceListEnumSourcesA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pstr, pcchsource: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.rawAddress, pcchsource.rawAddress).toUInt()

public actual fun msiSourceListEnumSourcesW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pwstr, pcchsource: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListEnumSourcesW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), dwindex.toInt(), szsource.rawAddress, pcchsource.rawAddress).toUInt()

public actual fun msiSourceListForceResolutionA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionA(szproduct.rawAddress, szusername.rawAddress, dwreserved.toInt()).toUInt()

public actual fun msiSourceListForceResolutionExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListForceResolutionExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionExW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt()).toUInt()

public actual fun msiSourceListForceResolutionW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListForceResolutionW(szproduct.rawAddress, szusername.rawAddress, dwreserved.toInt()).toUInt()

public actual fun msiSourceListGetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szproperty.rawAddress, szvalue.rawAddress, pcchvalue.rawAddress).toUInt()

public actual fun msiSourceListGetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListGetInfoW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szproperty.rawAddress, szvalue.rawAddress, pcchvalue.rawAddress).toUInt()

public actual fun msiSourceListSetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoA(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szproperty.rawAddress, szvalue.rawAddress).toUInt()

public actual fun msiSourceListSetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSourceListSetInfoW(szproductcodeorpatchcode.rawAddress, szusersid.rawAddress, dwcontext, dwoptions.toInt(), szproperty.rawAddress, szvalue.rawAddress).toUInt()

public actual fun msiSummaryInfoGetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr<UInt>, pivalue: MutPtr<Int>, pftvalue: MutPtr<Filetime>, szvaluebuf: Pstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.rawAddress, pivalue.rawAddress, pftvalue.rawAddress, szvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiSummaryInfoGetPropertyCount(hsummaryinfo: Msihandle, puipropertycount: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyCount(hsummaryinfo.toInt(), puipropertycount.rawAddress).toUInt()

public actual fun msiSummaryInfoGetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr<UInt>, pivalue: MutPtr<Int>, pftvalue: MutPtr<Filetime>, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr<UInt>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoGetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), puidatatype.rawAddress, pivalue.rawAddress, pftvalue.rawAddress, szvaluebuf.rawAddress, pcchvaluebuf.rawAddress).toUInt()

public actual fun msiSummaryInfoPersist(hsummaryinfo: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoPersist(hsummaryinfo.toInt()).toUInt()

public actual fun msiSummaryInfoSetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr<Filetime>, szvalue: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyA(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.rawAddress, szvalue.rawAddress).toUInt()

public actual fun msiSummaryInfoSetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr<Filetime>, szvalue: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiSummaryInfoSetPropertyW(hsummaryinfo.toInt(), uiproperty.toInt(), uidatatype.toInt(), ivalue, pftvalue.rawAddress, szvalue.rawAddress).toUInt()

public actual fun msiUseFeatureA(szproduct: Pcstr, szfeature: Pcstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureA(szproduct.rawAddress, szfeature.rawAddress)

public actual fun msiUseFeatureExA(szproduct: Pcstr, szfeature: Pcstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExA(szproduct.rawAddress, szfeature.rawAddress, dwinstallmode.toInt(), dwreserved.toInt())

public actual fun msiUseFeatureExW(szproduct: Pcwstr, szfeature: Pcwstr, dwinstallmode: UInt, dwreserved: UInt): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureExW(szproduct.rawAddress, szfeature.rawAddress, dwinstallmode.toInt(), dwreserved.toInt())

public actual fun msiUseFeatureW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiUseFeatureW(szproduct.rawAddress, szfeature.rawAddress)

public actual fun msiVerifyDiskSpace(hinstall: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyDiskSpace(hinstall.toInt()).toUInt()

public actual fun msiVerifyPackageA(szpackagepath: Pcstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageA(szpackagepath.rawAddress).toUInt()

public actual fun msiVerifyPackageW(szpackagepath: Pcwstr): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiVerifyPackageW(szpackagepath.rawAddress).toUInt()

public actual fun msiViewClose(hview: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewClose(hview.toInt()).toUInt()

public actual fun msiViewExecute(hview: Msihandle, hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewExecute(hview.toInt(), hrecord.toInt()).toUInt()

public actual fun msiViewFetch(hview: Msihandle, phrecord: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewFetch(hview.toInt(), phrecord.rawAddress).toUInt()

public actual fun msiViewGetColumnInfo(hview: Msihandle, ecolumninfo: Msicolinfo, phrecord: MutPtr<Msihandle>): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetColumnInfo(hview.toInt(), ecolumninfo, phrecord.rawAddress).toUInt()

public actual fun msiViewGetErrorA(hview: Msihandle, szcolumnnamebuffer: Pstr, pcchbuf: MutPtr<UInt>): Msidberror =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorA(hview.toInt(), szcolumnnamebuffer.rawAddress, pcchbuf.rawAddress)

public actual fun msiViewGetErrorW(hview: Msihandle, szcolumnnamebuffer: Pwstr, pcchbuf: MutPtr<UInt>): Msidberror =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewGetErrorW(hview.toInt(), szcolumnnamebuffer.rawAddress, pcchbuf.rawAddress)

public actual fun msiViewModify(hview: Msihandle, emodifymode: Msimodify, hrecord: Msihandle): UInt =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingMsiViewModify(hview.toInt(), emodifymode, hrecord.toInt()).toUInt()

public actual fun normalizeFileForPatchSignature(filebuffer: MutPtr<CVoid>, filesize: UInt, optionflags: UInt, optiondata: ConstPtr<PatchOptionData>, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: ConstPtr<PatchIgnoreRange>, retainrangecount: UInt, retainrangearray: ConstPtr<PatchRetainRange>): Int =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingNormalizeFileForPatchSignature(filebuffer.rawAddress, filesize.toInt(), optionflags.toInt(), optiondata.rawAddress, newfilecoffbase.toInt(), newfilecofftime.toInt(), ignorerangecount.toInt(), ignorerangearray.rawAddress, retainrangecount.toInt(), retainrangearray.rawAddress)

public actual fun queryActCtxSettingsW(dwflags: UInt, hactctx: Handle, settingsnamespace: Pcwstr, settingname: Pcwstr, pvbuffer: Pwstr, dwbuffer: ULong, pdwwrittenorrequired: MutPtr<ULong>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxSettingsW(dwflags.toInt(), hactctx.rawAddress, settingsnamespace.rawAddress, settingname.rawAddress, pvbuffer.rawAddress, dwbuffer.toLong(), pdwwrittenorrequired.rawAddress)

public actual fun queryActCtxW(dwflags: UInt, hactctx: Handle, pvsubinstance: ConstPtr<CVoid>, ulinfoclass: UInt, pvbuffer: MutPtr<CVoid>, cbbuffer: ULong, pcbwrittenorrequired: MutPtr<ULong>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingQueryActCtxW(dwflags.toInt(), hactctx.rawAddress, pvsubinstance.rawAddress, ulinfoclass.toInt(), pvbuffer.rawAddress, cbbuffer.toLong(), pcbwrittenorrequired.rawAddress)

public actual fun releaseActCtx(hactctx: Handle) {
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingReleaseActCtx(hactctx.rawAddress)
}

public actual fun sfcGetNextProtectedFile(rpchandle: Handle, protfiledata: MutPtr<ProtectedFileData>): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcGetNextProtectedFile(rpchandle.rawAddress, protfiledata.rawAddress)

public actual fun sfcIsFileProtected(rpchandle: Handle, protfilename: Pcwstr): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsFileProtected(rpchandle.rawAddress, protfilename.rawAddress)

public actual fun sfcIsKeyProtected(keyhandle: Hkey, subkeyname: Pcwstr, keysam: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingSfcIsKeyProtected(keyhandle.rawAddress, subkeyname.rawAddress, keysam.toInt())

public actual fun sfpVerifyFile(pszfilename: Pcstr, pszerror: Pcstr, dwerrsize: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingSfpVerifyFile(pszfilename.rawAddress, pszerror.rawAddress, dwerrsize.toInt())

public actual fun testApplyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileA(patchfilename.rawAddress, oldfilename.rawAddress, applyoptionflags.toInt())

public actual fun testApplyPatchToFileByBuffers(patchfilebuffer: ConstPtr<UByte>, patchfilesize: UInt, oldfilebuffer: ConstPtr<UByte>, oldfilesize: UInt, newfilesize: MutPtr<UInt>, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByBuffers(patchfilebuffer.rawAddress, patchfilesize.toInt(), oldfilebuffer.rawAddress, oldfilesize.toInt(), newfilesize.rawAddress, applyoptionflags.toInt())

public actual fun testApplyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileByHandles(patchfilehandle.rawAddress, oldfilehandle.rawAddress, applyoptionflags.toInt())

public actual fun testApplyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, applyoptionflags: UInt): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingTestApplyPatchToFileW(patchfilename.rawAddress, oldfilename.rawAddress, applyoptionflags.toInt())

public actual fun zombifyActCtx(hactctx: Handle): Bool =
    WindowsWin32SystemApplicationinstallationandservicingJniBridge.windowssysWindowsWin32SystemApplicationinstallationandservicingZombifyActCtx(hactctx.rawAddress)
