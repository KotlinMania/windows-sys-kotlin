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

public actual fun ActivateActCtx(hactctx: HANDLE, lpcookie: Long): BOOL =
    0

public actual fun AddRefActCtx(hactctx: HANDLE) {
}

public actual fun ApplyDeltaA(applyflags: Long, lpsourcename: PCSTR, lpdeltaname: PCSTR, lptargetname: PCSTR): BOOL =
    0

public actual fun ApplyDeltaB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long): BOOL =
    0

public actual fun ApplyDeltaGetReverseB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lpreversefiletime: Long, lptarget: Long, lptargetreverse: Long): BOOL =
    0

public actual fun ApplyDeltaProvidedB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long, utargetsize: ULong): BOOL =
    0

public actual fun ApplyDeltaW(applyflags: Long, lpsourcename: PCWSTR, lpdeltaname: PCWSTR, lptargetname: PCWSTR): BOOL =
    0

public actual fun ApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt): BOOL =
    0

public actual fun ApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: UInt, oldfilemapped: Long, oldfilesize: UInt, newfilebuffer: Long, newfilebuffersize: UInt, newfileactualsize: Long, newfiletime: Long, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    0

public actual fun ApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    0

public actual fun ApplyPatchToFileByHandlesEx(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    0

public actual fun ApplyPatchToFileExA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    0

public actual fun ApplyPatchToFileExW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    0

public actual fun ApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    0

public actual fun CreateActCtxA(pactctx: Long): HANDLE =
    0L

public actual fun CreateActCtxW(pactctx: Long): HANDLE =
    0L

public actual fun CreateDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCSTR, lptargetname: PCSTR, lpsourceoptionsname: PCSTR, lptargetoptionsname: PCSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCSTR): BOOL =
    0

public actual fun CreateDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DELTA_INPUT, target: DELTA_INPUT, sourceoptions: DELTA_INPUT, targetoptions: DELTA_INPUT, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdelta: Long): BOOL =
    0

public actual fun CreateDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCWSTR, lptargetname: PCWSTR, lpsourceoptionsname: PCWSTR, lptargetoptionsname: PCWSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCWSTR): BOOL =
    0

public actual fun CreatePatchFileA(oldfilename: PCSTR, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long): BOOL =
    0

public actual fun CreatePatchFileByHandles(oldfilehandle: HANDLE, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long): BOOL =
    0

public actual fun CreatePatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: Long, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    0

public actual fun CreatePatchFileExA(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    0

public actual fun CreatePatchFileExW(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL =
    0

public actual fun CreatePatchFileW(oldfilename: PCWSTR, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long): BOOL =
    0

public actual fun DeactivateActCtx(dwflags: UInt, ulcookie: ULong): BOOL =
    0

public actual fun DeltaFree(lpmemory: Long): BOOL =
    0

public actual fun DeltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DELTA_INPUT, lpsource: Long, usourcesize: ULong): BOOL =
    0

public actual fun ExtractPatchHeaderToFileA(patchfilename: PCSTR, patchheaderfilename: PCSTR): BOOL =
    0

public actual fun ExtractPatchHeaderToFileByHandles(patchfilehandle: HANDLE, patchheaderfilehandle: HANDLE): BOOL =
    0

public actual fun ExtractPatchHeaderToFileW(patchfilename: PCWSTR, patchheaderfilename: PCWSTR): BOOL =
    0

public actual fun FindActCtxSectionGuid(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpguidtofind: Long, returneddata: Long): BOOL =
    0

public actual fun FindActCtxSectionStringA(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCSTR, returneddata: Long): BOOL =
    0

public actual fun FindActCtxSectionStringW(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCWSTR, returneddata: Long): BOOL =
    0

public actual fun GetCurrentActCtx(lphactctx: Long): BOOL =
    0

public actual fun GetDeltaInfoA(lpdeltaname: PCSTR, lpheaderinfo: Long): BOOL =
    0

public actual fun GetDeltaInfoB(delta: DELTA_INPUT, lpheaderinfo: Long): BOOL =
    0

public actual fun GetDeltaInfoW(lpdeltaname: PCWSTR, lpheaderinfo: Long): BOOL =
    0

public actual fun GetDeltaSignatureA(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCSTR, lphash: Long): BOOL =
    0

public actual fun GetDeltaSignatureB(filetypeset: Long, hashalgid: ALG_ID, source: DELTA_INPUT, lphash: Long): BOOL =
    0

public actual fun GetDeltaSignatureW(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCWSTR, lphash: Long): BOOL =
    0

public actual fun GetFilePatchSignatureA(filename: PCSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    0

public actual fun GetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: UInt, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    0

public actual fun GetFilePatchSignatureByHandle(filehandle: HANDLE, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL =
    0

public actual fun GetFilePatchSignatureW(filename: PCWSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PWSTR): BOOL =
    0

public actual fun MsiAdvertiseProductA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort): UInt =
    0u

public actual fun MsiAdvertiseProductExA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    0u

public actual fun MsiAdvertiseProductExW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt =
    0u

public actual fun MsiAdvertiseProductW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort): UInt =
    0u

public actual fun MsiAdvertiseScriptA(szscriptfile: PCSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    0u

public actual fun MsiAdvertiseScriptW(szscriptfile: PCWSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt =
    0u

public actual fun MsiApplyMultiplePatchesA(szpatchpackages: PCSTR, szproductcode: PCSTR, szpropertieslist: PCSTR): UInt =
    0u

public actual fun MsiApplyMultiplePatchesW(szpatchpackages: PCWSTR, szproductcode: PCWSTR, szpropertieslist: PCWSTR): UInt =
    0u

public actual fun MsiApplyPatchA(szpatchpackage: PCSTR, szinstallpackage: PCSTR, einstalltype: INSTALLTYPE, szcommandline: PCSTR): UInt =
    0u

public actual fun MsiApplyPatchW(szpatchpackage: PCWSTR, szinstallpackage: PCWSTR, einstalltype: INSTALLTYPE, szcommandline: PCWSTR): UInt =
    0u

public actual fun MsiBeginTransactionA(szname: PCSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    0u

public actual fun MsiBeginTransactionW(szname: PCWSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt =
    0u

public actual fun MsiCloseAllHandles(): UInt =
    0u

public actual fun MsiCloseHandle(hany: MSIHANDLE): UInt =
    0u

public actual fun MsiCollectUserInfoA(szproduct: PCSTR): UInt =
    0u

public actual fun MsiCollectUserInfoW(szproduct: PCWSTR): UInt =
    0u

public actual fun MsiConfigureFeatureA(szproduct: PCSTR, szfeature: PCSTR, einstallstate: INSTALLSTATE): UInt =
    0u

public actual fun MsiConfigureFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    0u

public actual fun MsiConfigureProductA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    0u

public actual fun MsiConfigureProductExA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCSTR): UInt =
    0u

public actual fun MsiConfigureProductExW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCWSTR): UInt =
    0u

public actual fun MsiConfigureProductW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt =
    0u

public actual fun MsiCreateRecord(cparams: UInt): MSIHANDLE =
    0u

public actual fun MsiCreateTransformSummaryInfoA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    0u

public actual fun MsiCreateTransformSummaryInfoW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt =
    0u

public actual fun MsiDatabaseApplyTransformA(hdatabase: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    0u

public actual fun MsiDatabaseApplyTransformW(hdatabase: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt =
    0u

public actual fun MsiDatabaseCommit(hdatabase: MSIHANDLE): UInt =
    0u

public actual fun MsiDatabaseExportA(hdatabase: MSIHANDLE, sztablename: PCSTR, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    0u

public actual fun MsiDatabaseExportW(hdatabase: MSIHANDLE, sztablename: PCWSTR, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    0u

public actual fun MsiDatabaseGenerateTransformA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ireserved1: Int, ireserved2: Int): UInt =
    0u

public actual fun MsiDatabaseGenerateTransformW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ireserved1: Int, ireserved2: Int): UInt =
    0u

public actual fun MsiDatabaseGetPrimaryKeysA(hdatabase: MSIHANDLE, sztablename: PCSTR, phrecord: Long): UInt =
    0u

public actual fun MsiDatabaseGetPrimaryKeysW(hdatabase: MSIHANDLE, sztablename: PCWSTR, phrecord: Long): UInt =
    0u

public actual fun MsiDatabaseImportA(hdatabase: MSIHANDLE, szfolderpath: PCSTR, szfilename: PCSTR): UInt =
    0u

public actual fun MsiDatabaseImportW(hdatabase: MSIHANDLE, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt =
    0u

public actual fun MsiDatabaseIsTablePersistentA(hdatabase: MSIHANDLE, sztablename: PCSTR): MSICONDITION =
    0

public actual fun MsiDatabaseIsTablePersistentW(hdatabase: MSIHANDLE, sztablename: PCWSTR): MSICONDITION =
    0

public actual fun MsiDatabaseMergeA(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCSTR): UInt =
    0u

public actual fun MsiDatabaseMergeW(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCWSTR): UInt =
    0u

public actual fun MsiDatabaseOpenViewA(hdatabase: MSIHANDLE, szquery: PCSTR, phview: Long): UInt =
    0u

public actual fun MsiDatabaseOpenViewW(hdatabase: MSIHANDLE, szquery: PCWSTR, phview: Long): UInt =
    0u

public actual fun MsiDetermineApplicablePatchesA(szproductpackagepath: PCSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    0u

public actual fun MsiDetermineApplicablePatchesW(szproductpackagepath: PCWSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    0u

public actual fun MsiDeterminePatchSequenceA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    0u

public actual fun MsiDeterminePatchSequenceW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt =
    0u

public actual fun MsiDoActionA(hinstall: MSIHANDLE, szaction: PCSTR): UInt =
    0u

public actual fun MsiDoActionW(hinstall: MSIHANDLE, szaction: PCWSTR): UInt =
    0u

public actual fun MsiEnableLogA(dwlogmode: UInt, szlogfile: PCSTR, dwlogattributes: UInt): UInt =
    0u

public actual fun MsiEnableLogW(dwlogmode: UInt, szlogfile: PCWSTR, dwlogattributes: UInt): UInt =
    0u

public actual fun MsiEnableUIPreview(hdatabase: MSIHANDLE, phpreview: Long): UInt =
    0u

public actual fun MsiEndTransaction(dwtransactionstate: MSITRANSACTIONSTATE): UInt =
    0u

public actual fun MsiEnumClientsA(szcomponent: PCSTR, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    0u

public actual fun MsiEnumClientsExA(szcomponent: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    0u

public actual fun MsiEnumClientsExW(szcomponent: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    0u

public actual fun MsiEnumClientsW(szcomponent: PCWSTR, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    0u

public actual fun MsiEnumComponentCostsA(hinstall: MSIHANDLE, szcomponent: PCSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    0u

public actual fun MsiEnumComponentCostsW(hinstall: MSIHANDLE, szcomponent: PCWSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PWSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt =
    0u

public actual fun MsiEnumComponentQualifiersA(szcomponent: PCSTR, iindex: UInt, lpqualifierbuf: PSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PSTR, pcchapplicationdatabuf: Long): UInt =
    0u

public actual fun MsiEnumComponentQualifiersW(szcomponent: PCWSTR, iindex: UInt, lpqualifierbuf: PWSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PWSTR, pcchapplicationdatabuf: Long): UInt =
    0u

public actual fun MsiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: PSTR): UInt =
    0u

public actual fun MsiEnumComponentsExA(szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    0u

public actual fun MsiEnumComponentsExW(szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    0u

public actual fun MsiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: PWSTR): UInt =
    0u

public actual fun MsiEnumFeaturesA(szproduct: PCSTR, ifeatureindex: UInt, lpfeaturebuf: PSTR, lpparentbuf: PSTR): UInt =
    0u

public actual fun MsiEnumFeaturesW(szproduct: PCWSTR, ifeatureindex: UInt, lpfeaturebuf: PWSTR, lpparentbuf: PWSTR): UInt =
    0u

public actual fun MsiEnumPatchesA(szproduct: PCSTR, ipatchindex: UInt, lppatchbuf: PSTR, lptransformsbuf: PSTR, pcchtransformsbuf: Long): UInt =
    0u

public actual fun MsiEnumPatchesExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PSTR, sztargetproductcode: PSTR, pdwtargetproductcontext: Long, sztargetusersid: PSTR, pcchtargetusersid: Long): UInt =
    0u

public actual fun MsiEnumPatchesExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PWSTR, sztargetproductcode: PWSTR, pdwtargetproductcontext: Long, sztargetusersid: PWSTR, pcchtargetusersid: Long): UInt =
    0u

public actual fun MsiEnumPatchesW(szproduct: PCWSTR, ipatchindex: UInt, lppatchbuf: PWSTR, lptransformsbuf: PWSTR, pcchtransformsbuf: Long): UInt =
    0u

public actual fun MsiEnumProductsA(iproductindex: UInt, lpproductbuf: PSTR): UInt =
    0u

public actual fun MsiEnumProductsExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt =
    0u

public actual fun MsiEnumProductsExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt =
    0u

public actual fun MsiEnumProductsW(iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    0u

public actual fun MsiEnumRelatedProductsA(lpupgradecode: PCSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PSTR): UInt =
    0u

public actual fun MsiEnumRelatedProductsW(lpupgradecode: PCWSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PWSTR): UInt =
    0u

public actual fun MsiEvaluateConditionA(hinstall: MSIHANDLE, szcondition: PCSTR): MSICONDITION =
    0

public actual fun MsiEvaluateConditionW(hinstall: MSIHANDLE, szcondition: PCWSTR): MSICONDITION =
    0

public actual fun MsiExtractPatchXMLDataA(szpatchpath: PCSTR, dwreserved: UInt, szxmldata: PSTR, pcchxmldata: Long): UInt =
    0u

public actual fun MsiExtractPatchXMLDataW(szpatchpath: PCWSTR, dwreserved: UInt, szxmldata: PWSTR, pcchxmldata: Long): UInt =
    0u

public actual fun MsiFormatRecordA(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PSTR, pcchresultbuf: Long): UInt =
    0u

public actual fun MsiFormatRecordW(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PWSTR, pcchresultbuf: Long): UInt =
    0u

public actual fun MsiGetActiveDatabase(hinstall: MSIHANDLE): MSIHANDLE =
    0u

public actual fun MsiGetComponentPathA(szproduct: PCSTR, szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    0

public actual fun MsiGetComponentPathExA(szproductcode: PCSTR, szcomponentcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    0

public actual fun MsiGetComponentPathExW(szproductcode: PCWSTR, szcomponentcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PWSTR, pcchoutpathbuffer: Long): INSTALLSTATE =
    0

public actual fun MsiGetComponentPathW(szproduct: PCWSTR, szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    0

public actual fun MsiGetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, piinstalled: Long, piaction: Long): UInt =
    0u

public actual fun MsiGetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    0u

public actual fun MsiGetDatabaseState(hdatabase: MSIHANDLE): MSIDBSTATE =
    0

public actual fun MsiGetFeatureCostA(hinstall: MSIHANDLE, szfeature: PCSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    0u

public actual fun MsiGetFeatureCostW(hinstall: MSIHANDLE, szfeature: PCWSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt =
    0u

public actual fun MsiGetFeatureInfoA(hproduct: MSIHANDLE, szfeature: PCSTR, lpattributes: Long, lptitlebuf: PSTR, pcchtitlebuf: Long, lphelpbuf: PSTR, pcchhelpbuf: Long): UInt =
    0u

public actual fun MsiGetFeatureInfoW(hproduct: MSIHANDLE, szfeature: PCWSTR, lpattributes: Long, lptitlebuf: PWSTR, pcchtitlebuf: Long, lphelpbuf: PWSTR, pcchhelpbuf: Long): UInt =
    0u

public actual fun MsiGetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, piinstalled: Long, piaction: Long): UInt =
    0u

public actual fun MsiGetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, piinstalled: Long, piaction: Long): UInt =
    0u

public actual fun MsiGetFeatureUsageA(szproduct: PCSTR, szfeature: PCSTR, pdwusecount: Long, pwdateused: Long): UInt =
    0u

public actual fun MsiGetFeatureUsageW(szproduct: PCWSTR, szfeature: PCWSTR, pdwusecount: Long, pwdateused: Long): UInt =
    0u

public actual fun MsiGetFeatureValidStatesA(hinstall: MSIHANDLE, szfeature: PCSTR, lpinstallstates: Long): UInt =
    0u

public actual fun MsiGetFeatureValidStatesW(hinstall: MSIHANDLE, szfeature: PCWSTR, lpinstallstates: Long): UInt =
    0u

public actual fun MsiGetFileHashA(szfilepath: PCSTR, dwoptions: UInt, phash: Long): UInt =
    0u

public actual fun MsiGetFileHashW(szfilepath: PCWSTR, dwoptions: UInt, phash: Long): UInt =
    0u

public actual fun MsiGetFileSignatureInformationA(szsignedobjectpath: PCSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    0

public actual fun MsiGetFileSignatureInformationW(szsignedobjectpath: PCWSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT =
    0

public actual fun MsiGetFileVersionA(szfilepath: PCSTR, lpversionbuf: PSTR, pcchversionbuf: Long, lplangbuf: PSTR, pcchlangbuf: Long): UInt =
    0u

public actual fun MsiGetFileVersionW(szfilepath: PCWSTR, lpversionbuf: PWSTR, pcchversionbuf: Long, lplangbuf: PWSTR, pcchlangbuf: Long): UInt =
    0u

public actual fun MsiGetLanguage(hinstall: MSIHANDLE): UShort =
    0u

public actual fun MsiGetLastErrorRecord(): MSIHANDLE =
    0u

public actual fun MsiGetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE): BOOL =
    0

public actual fun MsiGetPatchFileListA(szproductcode: PCSTR, szpatchpackages: PCSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    0u

public actual fun MsiGetPatchFileListW(szproductcode: PCWSTR, szpatchpackages: PCWSTR, pcfiles: Long, pphfilerecords: Long): UInt =
    0u

public actual fun MsiGetPatchInfoA(szpatch: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetPatchInfoExA(szpatchcode: PCSTR, szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, lpvalue: PSTR, pcchvalue: Long): UInt =
    0u

public actual fun MsiGetPatchInfoExW(szpatchcode: PCWSTR, szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, lpvalue: PWSTR, pcchvalue: Long): UInt =
    0u

public actual fun MsiGetPatchInfoW(szpatch: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetProductCodeA(szcomponent: PCSTR, lpbuf39: PSTR): UInt =
    0u

public actual fun MsiGetProductCodeW(szcomponent: PCWSTR, lpbuf39: PWSTR): UInt =
    0u

public actual fun MsiGetProductInfoA(szproduct: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetProductInfoExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    0u

public actual fun MsiGetProductInfoExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    0u

public actual fun MsiGetProductInfoFromScriptA(szscriptfile: PCSTR, lpproductbuf39: PSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PSTR, pcchnamebuf: Long, lppackagebuf: PSTR, pcchpackagebuf: Long): UInt =
    0u

public actual fun MsiGetProductInfoFromScriptW(szscriptfile: PCWSTR, lpproductbuf39: PWSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PWSTR, pcchnamebuf: Long, lppackagebuf: PWSTR, pcchpackagebuf: Long): UInt =
    0u

public actual fun MsiGetProductInfoW(szproduct: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetProductPropertyA(hproduct: MSIHANDLE, szproperty: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetProductPropertyW(hproduct: MSIHANDLE, szproperty: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiGetShortcutTargetA(szshortcutpath: PCSTR, szproductcode: PSTR, szfeatureid: PSTR, szcomponentcode: PSTR): UInt =
    0u

public actual fun MsiGetShortcutTargetW(szshortcutpath: PCWSTR, szproductcode: PWSTR, szfeatureid: PWSTR, szcomponentcode: PWSTR): UInt =
    0u

public actual fun MsiGetSourcePathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiGetSourcePathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiGetSummaryInformationA(hdatabase: MSIHANDLE, szdatabasepath: PCSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    0u

public actual fun MsiGetSummaryInformationW(hdatabase: MSIHANDLE, szdatabasepath: PCWSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt =
    0u

public actual fun MsiGetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiGetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiGetUserInfoA(szproduct: PCSTR, lpusernamebuf: PSTR, pcchusernamebuf: Long, lporgnamebuf: PSTR, pcchorgnamebuf: Long, lpserialbuf: PSTR, pcchserialbuf: Long): USERINFOSTATE =
    0

public actual fun MsiGetUserInfoW(szproduct: PCWSTR, lpusernamebuf: PWSTR, pcchusernamebuf: Long, lporgnamebuf: PWSTR, pcchorgnamebuf: Long, lpserialbuf: PWSTR, pcchserialbuf: Long): USERINFOSTATE =
    0

public actual fun MsiInstallMissingComponentA(szproduct: PCSTR, szcomponent: PCSTR, einstallstate: INSTALLSTATE): UInt =
    0u

public actual fun MsiInstallMissingComponentW(szproduct: PCWSTR, szcomponent: PCWSTR, einstallstate: INSTALLSTATE): UInt =
    0u

public actual fun MsiInstallMissingFileA(szproduct: PCSTR, szfile: PCSTR): UInt =
    0u

public actual fun MsiInstallMissingFileW(szproduct: PCWSTR, szfile: PCWSTR): UInt =
    0u

public actual fun MsiInstallProductA(szpackagepath: PCSTR, szcommandline: PCSTR): UInt =
    0u

public actual fun MsiInstallProductW(szpackagepath: PCWSTR, szcommandline: PCWSTR): UInt =
    0u

public actual fun MsiIsProductElevatedA(szproduct: PCSTR, pfelevated: Long): UInt =
    0u

public actual fun MsiIsProductElevatedW(szproduct: PCWSTR, pfelevated: Long): UInt =
    0u

public actual fun MsiJoinTransaction(htransactionhandle: MSIHANDLE, dwtransactionattributes: UInt, phchangeofownerevent: Long): UInt =
    0u

public actual fun MsiLocateComponentA(szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE =
    0

public actual fun MsiLocateComponentW(szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE =
    0

public actual fun MsiNotifySidChangeA(poldsid: PCSTR, pnewsid: PCSTR): UInt =
    0u

public actual fun MsiNotifySidChangeW(poldsid: PCWSTR, pnewsid: PCWSTR): UInt =
    0u

public actual fun MsiOpenDatabaseA(szdatabasepath: PCSTR, szpersist: PCSTR, phdatabase: Long): UInt =
    0u

public actual fun MsiOpenDatabaseW(szdatabasepath: PCWSTR, szpersist: PCWSTR, phdatabase: Long): UInt =
    0u

public actual fun MsiOpenPackageA(szpackagepath: PCSTR, hproduct: Long): UInt =
    0u

public actual fun MsiOpenPackageExA(szpackagepath: PCSTR, dwoptions: UInt, hproduct: Long): UInt =
    0u

public actual fun MsiOpenPackageExW(szpackagepath: PCWSTR, dwoptions: UInt, hproduct: Long): UInt =
    0u

public actual fun MsiOpenPackageW(szpackagepath: PCWSTR, hproduct: Long): UInt =
    0u

public actual fun MsiOpenProductA(szproduct: PCSTR, hproduct: Long): UInt =
    0u

public actual fun MsiOpenProductW(szproduct: PCWSTR, hproduct: Long): UInt =
    0u

public actual fun MsiPreviewBillboardA(hpreview: MSIHANDLE, szcontrolname: PCSTR, szbillboard: PCSTR): UInt =
    0u

public actual fun MsiPreviewBillboardW(hpreview: MSIHANDLE, szcontrolname: PCWSTR, szbillboard: PCWSTR): UInt =
    0u

public actual fun MsiPreviewDialogA(hpreview: MSIHANDLE, szdialogname: PCSTR): UInt =
    0u

public actual fun MsiPreviewDialogW(hpreview: MSIHANDLE, szdialogname: PCWSTR): UInt =
    0u

public actual fun MsiProcessAdvertiseScriptA(szscriptfile: PCSTR, sziconfolder: PCSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    0u

public actual fun MsiProcessAdvertiseScriptW(szscriptfile: PCWSTR, sziconfolder: PCWSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt =
    0u

public actual fun MsiProcessMessage(hinstall: MSIHANDLE, emessagetype: INSTALLMESSAGE, hrecord: MSIHANDLE): Int =
    0

public actual fun MsiProvideAssemblyA(szassemblyname: PCSTR, szappcontext: PCSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiProvideAssemblyW(szassemblyname: PCWSTR, szappcontext: PCWSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiProvideComponentA(szproduct: PCSTR, szfeature: PCSTR, szcomponent: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiProvideComponentW(szproduct: PCWSTR, szfeature: PCWSTR, szcomponent: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiProvideQualifiedComponentA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiProvideQualifiedComponentExA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, szproduct: PCSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiProvideQualifiedComponentExW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, szproduct: PCWSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiProvideQualifiedComponentW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt =
    0u

public actual fun MsiQueryComponentStateA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCSTR, pdwstate: Long): UInt =
    0u

public actual fun MsiQueryComponentStateW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCWSTR, pdwstate: Long): UInt =
    0u

public actual fun MsiQueryFeatureStateA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    0

public actual fun MsiQueryFeatureStateExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCSTR, pdwstate: Long): UInt =
    0u

public actual fun MsiQueryFeatureStateExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCWSTR, pdwstate: Long): UInt =
    0u

public actual fun MsiQueryFeatureStateW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    0

public actual fun MsiQueryProductStateA(szproduct: PCSTR): INSTALLSTATE =
    0

public actual fun MsiQueryProductStateW(szproduct: PCWSTR): INSTALLSTATE =
    0

public actual fun MsiRecordClearData(hrecord: MSIHANDLE): UInt =
    0u

public actual fun MsiRecordDataSize(hrecord: MSIHANDLE, ifield: UInt): UInt =
    0u

public actual fun MsiRecordGetFieldCount(hrecord: MSIHANDLE): UInt =
    0u

public actual fun MsiRecordGetInteger(hrecord: MSIHANDLE, ifield: UInt): Int =
    0

public actual fun MsiRecordGetStringA(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiRecordGetStringW(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiRecordIsNull(hrecord: MSIHANDLE, ifield: UInt): BOOL =
    0

public actual fun MsiRecordReadStream(hrecord: MSIHANDLE, ifield: UInt, szdatabuf: PSTR, pcbdatabuf: Long): UInt =
    0u

public actual fun MsiRecordSetInteger(hrecord: MSIHANDLE, ifield: UInt, ivalue: Int): UInt =
    0u

public actual fun MsiRecordSetStreamA(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCSTR): UInt =
    0u

public actual fun MsiRecordSetStreamW(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCWSTR): UInt =
    0u

public actual fun MsiRecordSetStringA(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCSTR): UInt =
    0u

public actual fun MsiRecordSetStringW(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCWSTR): UInt =
    0u

public actual fun MsiReinstallFeatureA(szproduct: PCSTR, szfeature: PCSTR, dwreinstallmode: UInt): UInt =
    0u

public actual fun MsiReinstallFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, dwreinstallmode: UInt): UInt =
    0u

public actual fun MsiReinstallProductA(szproduct: PCSTR, szreinstallmode: UInt): UInt =
    0u

public actual fun MsiReinstallProductW(szproduct: PCWSTR, szreinstallmode: UInt): UInt =
    0u

public actual fun MsiRemovePatchesA(szpatchlist: PCSTR, szproductcode: PCSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCSTR): UInt =
    0u

public actual fun MsiRemovePatchesW(szpatchlist: PCWSTR, szproductcode: PCWSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCWSTR): UInt =
    0u

public actual fun MsiSequenceA(hinstall: MSIHANDLE, sztable: PCSTR, isequencemode: Int): UInt =
    0u

public actual fun MsiSequenceW(hinstall: MSIHANDLE, sztable: PCWSTR, isequencemode: Int): UInt =
    0u

public actual fun MsiSetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, istate: INSTALLSTATE): UInt =
    0u

public actual fun MsiSetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, istate: INSTALLSTATE): UInt =
    0u

public actual fun MsiSetExternalUIA(puihandler: INSTALLUI_HANDLERA, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERA =
    null

public actual fun MsiSetExternalUIRecord(puihandler: PINSTALLUI_HANDLER_RECORD, dwmessagefilter: UInt, pvcontext: Long, ppuiprevhandler: PINSTALLUI_HANDLER_RECORD): UInt =
    0u

public actual fun MsiSetExternalUIW(puihandler: INSTALLUI_HANDLERW, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERW =
    null

public actual fun MsiSetFeatureAttributesA(hinstall: MSIHANDLE, szfeature: PCSTR, dwattributes: UInt): UInt =
    0u

public actual fun MsiSetFeatureAttributesW(hinstall: MSIHANDLE, szfeature: PCWSTR, dwattributes: UInt): UInt =
    0u

public actual fun MsiSetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, istate: INSTALLSTATE): UInt =
    0u

public actual fun MsiSetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, istate: INSTALLSTATE): UInt =
    0u

public actual fun MsiSetInstallLevel(hinstall: MSIHANDLE, iinstalllevel: Int): UInt =
    0u

public actual fun MsiSetInternalUI(dwuilevel: INSTALLUILEVEL, phwnd: Long): INSTALLUILEVEL =
    0

public actual fun MsiSetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE, fstate: BOOL): UInt =
    0u

public actual fun MsiSetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvalue: PCSTR): UInt =
    0u

public actual fun MsiSetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvalue: PCWSTR): UInt =
    0u

public actual fun MsiSetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szfolderpath: PCSTR): UInt =
    0u

public actual fun MsiSetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szfolderpath: PCWSTR): UInt =
    0u

public actual fun MsiSourceListAddMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCSTR, szdiskprompt: PCSTR): UInt =
    0u

public actual fun MsiSourceListAddMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCWSTR, szdiskprompt: PCWSTR): UInt =
    0u

public actual fun MsiSourceListAddSourceA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt, szsource: PCSTR): UInt =
    0u

public actual fun MsiSourceListAddSourceExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR, dwindex: UInt): UInt =
    0u

public actual fun MsiSourceListAddSourceExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR, dwindex: UInt): UInt =
    0u

public actual fun MsiSourceListAddSourceW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt, szsource: PCWSTR): UInt =
    0u

public actual fun MsiSourceListClearAllA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    0u

public actual fun MsiSourceListClearAllExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    0u

public actual fun MsiSourceListClearAllExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    0u

public actual fun MsiSourceListClearAllW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    0u

public actual fun MsiSourceListClearMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    0u

public actual fun MsiSourceListClearMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt =
    0u

public actual fun MsiSourceListClearSourceA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR): UInt =
    0u

public actual fun MsiSourceListClearSourceW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR): UInt =
    0u

public actual fun MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PSTR, pcchvolumelabel: Long, szdiskprompt: PSTR, pcchdiskprompt: Long): UInt =
    0u

public actual fun MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PWSTR, pcchvolumelabel: Long, szdiskprompt: PWSTR, pcchdiskprompt: Long): UInt =
    0u

public actual fun MsiSourceListEnumSourcesA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PSTR, pcchsource: Long): UInt =
    0u

public actual fun MsiSourceListEnumSourcesW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PWSTR, pcchsource: Long): UInt =
    0u

public actual fun MsiSourceListForceResolutionA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt =
    0u

public actual fun MsiSourceListForceResolutionExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    0u

public actual fun MsiSourceListForceResolutionExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt =
    0u

public actual fun MsiSourceListForceResolutionW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt =
    0u

public actual fun MsiSourceListGetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt =
    0u

public actual fun MsiSourceListGetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt =
    0u

public actual fun MsiSourceListSetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PCSTR): UInt =
    0u

public actual fun MsiSourceListSetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PCWSTR): UInt =
    0u

public actual fun MsiSummaryInfoGetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiSummaryInfoGetPropertyCount(hsummaryinfo: MSIHANDLE, puipropertycount: Long): UInt =
    0u

public actual fun MsiSummaryInfoGetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt =
    0u

public actual fun MsiSummaryInfoPersist(hsummaryinfo: MSIHANDLE): UInt =
    0u

public actual fun MsiSummaryInfoSetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCSTR): UInt =
    0u

public actual fun MsiSummaryInfoSetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCWSTR): UInt =
    0u

public actual fun MsiUseFeatureA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE =
    0

public actual fun MsiUseFeatureExA(szproduct: PCSTR, szfeature: PCSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    0

public actual fun MsiUseFeatureExW(szproduct: PCWSTR, szfeature: PCWSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE =
    0

public actual fun MsiUseFeatureW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE =
    0

public actual fun MsiVerifyDiskSpace(hinstall: MSIHANDLE): UInt =
    0u

public actual fun MsiVerifyPackageA(szpackagepath: PCSTR): UInt =
    0u

public actual fun MsiVerifyPackageW(szpackagepath: PCWSTR): UInt =
    0u

public actual fun MsiViewClose(hview: MSIHANDLE): UInt =
    0u

public actual fun MsiViewExecute(hview: MSIHANDLE, hrecord: MSIHANDLE): UInt =
    0u

public actual fun MsiViewFetch(hview: MSIHANDLE, phrecord: Long): UInt =
    0u

public actual fun MsiViewGetColumnInfo(hview: MSIHANDLE, ecolumninfo: MSICOLINFO, phrecord: Long): UInt =
    0u

public actual fun MsiViewGetErrorA(hview: MSIHANDLE, szcolumnnamebuffer: PSTR, pcchbuf: Long): MSIDBERROR =
    0

public actual fun MsiViewGetErrorW(hview: MSIHANDLE, szcolumnnamebuffer: PWSTR, pcchbuf: Long): MSIDBERROR =
    0

public actual fun MsiViewModify(hview: MSIHANDLE, emodifymode: MSIMODIFY, hrecord: MSIHANDLE): UInt =
    0u

public actual fun NormalizeFileForPatchSignature(filebuffer: Long, filesize: UInt, optionflags: UInt, optiondata: Long, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long): Int =
    0

public actual fun QueryActCtxSettingsW(dwflags: UInt, hactctx: HANDLE, settingsnamespace: PCWSTR, settingname: PCWSTR, pvbuffer: PWSTR, dwbuffer: ULong, pdwwrittenorrequired: Long): BOOL =
    0

public actual fun QueryActCtxW(dwflags: UInt, hactctx: HANDLE, pvsubinstance: Long, ulinfoclass: UInt, pvbuffer: Long, cbbuffer: ULong, pcbwrittenorrequired: Long): BOOL =
    0

public actual fun ReleaseActCtx(hactctx: HANDLE) {
}

public actual fun SfcGetNextProtectedFile(rpchandle: HANDLE, protfiledata: Long): BOOL =
    0

public actual fun SfcIsFileProtected(rpchandle: HANDLE, protfilename: PCWSTR): BOOL =
    0

public actual fun SfcIsKeyProtected(keyhandle: HKEY, subkeyname: PCWSTR, keysam: UInt): BOOL =
    0

public actual fun SfpVerifyFile(pszfilename: PCSTR, pszerror: PCSTR, dwerrsize: UInt): BOOL =
    0

public actual fun TestApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, applyoptionflags: UInt): BOOL =
    0

public actual fun TestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: UInt, oldfilebuffer: Long, oldfilesize: UInt, newfilesize: Long, applyoptionflags: UInt): BOOL =
    0

public actual fun TestApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, applyoptionflags: UInt): BOOL =
    0

public actual fun TestApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, applyoptionflags: UInt): BOOL =
    0

public actual fun ZombifyActCtx(hactctx: HANDLE): BOOL =
    0
