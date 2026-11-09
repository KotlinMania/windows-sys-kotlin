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

public expect fun ActivateActCtx(hactctx: HANDLE, lpcookie: Long): BOOL

public expect fun AddRefActCtx(hactctx: HANDLE)

public expect fun ApplyDeltaA(applyflags: Long, lpsourcename: PCSTR, lpdeltaname: PCSTR, lptargetname: PCSTR): BOOL

public expect fun ApplyDeltaB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long): BOOL

public expect fun ApplyDeltaGetReverseB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lpreversefiletime: Long, lptarget: Long, lptargetreverse: Long): BOOL

public expect fun ApplyDeltaProvidedB(applyflags: Long, source: DELTA_INPUT, delta: DELTA_INPUT, lptarget: Long, utargetsize: ULong): BOOL

public expect fun ApplyDeltaW(applyflags: Long, lpsourcename: PCWSTR, lpdeltaname: PCWSTR, lptargetname: PCWSTR): BOOL

public expect fun ApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt): BOOL

public expect fun ApplyPatchToFileByBuffers(patchfilemapped: Long, patchfilesize: UInt, oldfilemapped: Long, oldfilesize: UInt, newfilebuffer: Long, newfilebuffersize: UInt, newfileactualsize: Long, newfiletime: Long, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL

public expect fun ApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt): BOOL

public expect fun ApplyPatchToFileByHandlesEx(patchfilehandle: HANDLE, oldfilehandle: HANDLE, newfilehandle: HANDLE, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL

public expect fun ApplyPatchToFileExA(patchfilename: PCSTR, oldfilename: PCSTR, newfilename: PCSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL

public expect fun ApplyPatchToFileExW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL

public expect fun ApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, newfilename: PCWSTR, applyoptionflags: UInt): BOOL

public expect fun CreateActCtxA(pactctx: Long): HANDLE

public expect fun CreateActCtxW(pactctx: Long): HANDLE

public expect fun CreateDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCSTR, lptargetname: PCSTR, lpsourceoptionsname: PCSTR, lptargetoptionsname: PCSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCSTR): BOOL

public expect fun CreateDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DELTA_INPUT, target: DELTA_INPUT, sourceoptions: DELTA_INPUT, targetoptions: DELTA_INPUT, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdelta: Long): BOOL

public expect fun CreateDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: PCWSTR, lptargetname: PCWSTR, lpsourceoptionsname: PCWSTR, lptargetoptionsname: PCWSTR, globaloptions: DELTA_INPUT, lptargetfiletime: Long, hashalgid: ALG_ID, lpdeltaname: PCWSTR): BOOL

public expect fun CreatePatchFileA(oldfilename: PCSTR, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long): BOOL

public expect fun CreatePatchFileByHandles(oldfilehandle: HANDLE, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long): BOOL

public expect fun CreatePatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: Long, newfilehandle: HANDLE, patchfilehandle: HANDLE, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL

public expect fun CreatePatchFileExA(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCSTR, patchfilename: PCSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL

public expect fun CreatePatchFileExW(oldfilecount: UInt, oldfileinfoarray: Long, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long, progresscallback: PPATCH_PROGRESS_CALLBACK, callbackcontext: Long): BOOL

public expect fun CreatePatchFileW(oldfilename: PCWSTR, newfilename: PCWSTR, patchfilename: PCWSTR, optionflags: UInt, optiondata: Long): BOOL

public expect fun DeactivateActCtx(dwflags: UInt, ulcookie: ULong): BOOL

public expect fun DeltaFree(lpmemory: Long): BOOL

public expect fun DeltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DELTA_INPUT, lpsource: Long, usourcesize: ULong): BOOL

public expect fun ExtractPatchHeaderToFileA(patchfilename: PCSTR, patchheaderfilename: PCSTR): BOOL

public expect fun ExtractPatchHeaderToFileByHandles(patchfilehandle: HANDLE, patchheaderfilehandle: HANDLE): BOOL

public expect fun ExtractPatchHeaderToFileW(patchfilename: PCWSTR, patchheaderfilename: PCWSTR): BOOL

public expect fun FindActCtxSectionGuid(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpguidtofind: Long, returneddata: Long): BOOL

public expect fun FindActCtxSectionStringA(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCSTR, returneddata: Long): BOOL

public expect fun FindActCtxSectionStringW(dwflags: UInt, lpextensionguid: Long, ulsectionid: UInt, lpstringtofind: PCWSTR, returneddata: Long): BOOL

public expect fun GetCurrentActCtx(lphactctx: Long): BOOL

public expect fun GetDeltaInfoA(lpdeltaname: PCSTR, lpheaderinfo: Long): BOOL

public expect fun GetDeltaInfoB(delta: DELTA_INPUT, lpheaderinfo: Long): BOOL

public expect fun GetDeltaInfoW(lpdeltaname: PCWSTR, lpheaderinfo: Long): BOOL

public expect fun GetDeltaSignatureA(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCSTR, lphash: Long): BOOL

public expect fun GetDeltaSignatureB(filetypeset: Long, hashalgid: ALG_ID, source: DELTA_INPUT, lphash: Long): BOOL

public expect fun GetDeltaSignatureW(filetypeset: Long, hashalgid: ALG_ID, lpsourcename: PCWSTR, lphash: Long): BOOL

public expect fun GetFilePatchSignatureA(filename: PCSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL

public expect fun GetFilePatchSignatureByBuffer(filebufferwritable: Long, filesize: UInt, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL

public expect fun GetFilePatchSignatureByHandle(filehandle: HANDLE, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PSTR): BOOL

public expect fun GetFilePatchSignatureW(filename: PCWSTR, optionflags: UInt, optiondata: Long, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long, signaturebuffersize: UInt, signaturebuffer: PWSTR): BOOL

public expect fun MsiAdvertiseProductA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort): UInt

public expect fun MsiAdvertiseProductExA(szpackagepath: PCSTR, szscriptfilepath: PCSTR, sztransforms: PCSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt

public expect fun MsiAdvertiseProductExW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt

public expect fun MsiAdvertiseProductW(szpackagepath: PCWSTR, szscriptfilepath: PCWSTR, sztransforms: PCWSTR, lgidlanguage: UShort): UInt

public expect fun MsiAdvertiseScriptA(szscriptfile: PCSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt

public expect fun MsiAdvertiseScriptW(szscriptfile: PCWSTR, dwflags: UInt, phregdata: Long, fremoveitems: BOOL): UInt

public expect fun MsiApplyMultiplePatchesA(szpatchpackages: PCSTR, szproductcode: PCSTR, szpropertieslist: PCSTR): UInt

public expect fun MsiApplyMultiplePatchesW(szpatchpackages: PCWSTR, szproductcode: PCWSTR, szpropertieslist: PCWSTR): UInt

public expect fun MsiApplyPatchA(szpatchpackage: PCSTR, szinstallpackage: PCSTR, einstalltype: INSTALLTYPE, szcommandline: PCSTR): UInt

public expect fun MsiApplyPatchW(szpatchpackage: PCWSTR, szinstallpackage: PCWSTR, einstalltype: INSTALLTYPE, szcommandline: PCWSTR): UInt

public expect fun MsiBeginTransactionA(szname: PCSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt

public expect fun MsiBeginTransactionW(szname: PCWSTR, dwtransactionattributes: UInt, phtransactionhandle: Long, phchangeofownerevent: Long): UInt

public expect fun MsiCloseAllHandles(): UInt

public expect fun MsiCloseHandle(hany: MSIHANDLE): UInt

public expect fun MsiCollectUserInfoA(szproduct: PCSTR): UInt

public expect fun MsiCollectUserInfoW(szproduct: PCWSTR): UInt

public expect fun MsiConfigureFeatureA(szproduct: PCSTR, szfeature: PCSTR, einstallstate: INSTALLSTATE): UInt

public expect fun MsiConfigureFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, einstallstate: INSTALLSTATE): UInt

public expect fun MsiConfigureProductA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt

public expect fun MsiConfigureProductExA(szproduct: PCSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCSTR): UInt

public expect fun MsiConfigureProductExW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE, szcommandline: PCWSTR): UInt

public expect fun MsiConfigureProductW(szproduct: PCWSTR, iinstalllevel: INSTALLLEVEL, einstallstate: INSTALLSTATE): UInt

public expect fun MsiCreateRecord(cparams: UInt): MSIHANDLE

public expect fun MsiCreateTransformSummaryInfoA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt

public expect fun MsiCreateTransformSummaryInfoW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR, ivalidation: MSITRANSFORM_VALIDATE): UInt

public expect fun MsiDatabaseApplyTransformA(hdatabase: MSIHANDLE, sztransformfile: PCSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt

public expect fun MsiDatabaseApplyTransformW(hdatabase: MSIHANDLE, sztransformfile: PCWSTR, ierrorconditions: MSITRANSFORM_ERROR): UInt

public expect fun MsiDatabaseCommit(hdatabase: MSIHANDLE): UInt

public expect fun MsiDatabaseExportA(hdatabase: MSIHANDLE, sztablename: PCSTR, szfolderpath: PCSTR, szfilename: PCSTR): UInt

public expect fun MsiDatabaseExportW(hdatabase: MSIHANDLE, sztablename: PCWSTR, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt

public expect fun MsiDatabaseGenerateTransformA(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCSTR, ireserved1: Int, ireserved2: Int): UInt

public expect fun MsiDatabaseGenerateTransformW(hdatabase: MSIHANDLE, hdatabasereference: MSIHANDLE, sztransformfile: PCWSTR, ireserved1: Int, ireserved2: Int): UInt

public expect fun MsiDatabaseGetPrimaryKeysA(hdatabase: MSIHANDLE, sztablename: PCSTR, phrecord: Long): UInt

public expect fun MsiDatabaseGetPrimaryKeysW(hdatabase: MSIHANDLE, sztablename: PCWSTR, phrecord: Long): UInt

public expect fun MsiDatabaseImportA(hdatabase: MSIHANDLE, szfolderpath: PCSTR, szfilename: PCSTR): UInt

public expect fun MsiDatabaseImportW(hdatabase: MSIHANDLE, szfolderpath: PCWSTR, szfilename: PCWSTR): UInt

public expect fun MsiDatabaseIsTablePersistentA(hdatabase: MSIHANDLE, sztablename: PCSTR): MSICONDITION

public expect fun MsiDatabaseIsTablePersistentW(hdatabase: MSIHANDLE, sztablename: PCWSTR): MSICONDITION

public expect fun MsiDatabaseMergeA(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCSTR): UInt

public expect fun MsiDatabaseMergeW(hdatabase: MSIHANDLE, hdatabasemerge: MSIHANDLE, sztablename: PCWSTR): UInt

public expect fun MsiDatabaseOpenViewA(hdatabase: MSIHANDLE, szquery: PCSTR, phview: Long): UInt

public expect fun MsiDatabaseOpenViewW(hdatabase: MSIHANDLE, szquery: PCWSTR, phview: Long): UInt

public expect fun MsiDetermineApplicablePatchesA(szproductpackagepath: PCSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt

public expect fun MsiDetermineApplicablePatchesW(szproductpackagepath: PCWSTR, cpatchinfo: UInt, ppatchinfo: Long): UInt

public expect fun MsiDeterminePatchSequenceA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt

public expect fun MsiDeterminePatchSequenceW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, cpatchinfo: UInt, ppatchinfo: Long): UInt

public expect fun MsiDoActionA(hinstall: MSIHANDLE, szaction: PCSTR): UInt

public expect fun MsiDoActionW(hinstall: MSIHANDLE, szaction: PCWSTR): UInt

public expect fun MsiEnableLogA(dwlogmode: UInt, szlogfile: PCSTR, dwlogattributes: UInt): UInt

public expect fun MsiEnableLogW(dwlogmode: UInt, szlogfile: PCWSTR, dwlogattributes: UInt): UInt

public expect fun MsiEnableUIPreview(hdatabase: MSIHANDLE, phpreview: Long): UInt

public expect fun MsiEndTransaction(dwtransactionstate: MSITRANSACTIONSTATE): UInt

public expect fun MsiEnumClientsA(szcomponent: PCSTR, iproductindex: UInt, lpproductbuf: PSTR): UInt

public expect fun MsiEnumClientsExA(szcomponent: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt

public expect fun MsiEnumClientsExW(szcomponent: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwproductindex: UInt, szproductbuf: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt

public expect fun MsiEnumClientsW(szcomponent: PCWSTR, iproductindex: UInt, lpproductbuf: PWSTR): UInt

public expect fun MsiEnumComponentCostsA(hinstall: MSIHANDLE, szcomponent: PCSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt

public expect fun MsiEnumComponentCostsW(hinstall: MSIHANDLE, szcomponent: PCWSTR, dwindex: UInt, istate: INSTALLSTATE, szdrivebuf: PWSTR, pcchdrivebuf: Long, picost: Long, pitempcost: Long): UInt

public expect fun MsiEnumComponentQualifiersA(szcomponent: PCSTR, iindex: UInt, lpqualifierbuf: PSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PSTR, pcchapplicationdatabuf: Long): UInt

public expect fun MsiEnumComponentQualifiersW(szcomponent: PCWSTR, iindex: UInt, lpqualifierbuf: PWSTR, pcchqualifierbuf: Long, lpapplicationdatabuf: PWSTR, pcchapplicationdatabuf: Long): UInt

public expect fun MsiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: PSTR): UInt

public expect fun MsiEnumComponentsExA(szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt

public expect fun MsiEnumComponentsExW(szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt

public expect fun MsiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: PWSTR): UInt

public expect fun MsiEnumFeaturesA(szproduct: PCSTR, ifeatureindex: UInt, lpfeaturebuf: PSTR, lpparentbuf: PSTR): UInt

public expect fun MsiEnumFeaturesW(szproduct: PCWSTR, ifeatureindex: UInt, lpfeaturebuf: PWSTR, lpparentbuf: PWSTR): UInt

public expect fun MsiEnumPatchesA(szproduct: PCSTR, ipatchindex: UInt, lppatchbuf: PSTR, lptransformsbuf: PSTR, pcchtransformsbuf: Long): UInt

public expect fun MsiEnumPatchesExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PSTR, sztargetproductcode: PSTR, pdwtargetproductcontext: Long, sztargetusersid: PSTR, pcchtargetusersid: Long): UInt

public expect fun MsiEnumPatchesExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: PWSTR, sztargetproductcode: PWSTR, pdwtargetproductcontext: Long, sztargetusersid: PWSTR, pcchtargetusersid: Long): UInt

public expect fun MsiEnumPatchesW(szproduct: PCWSTR, ipatchindex: UInt, lppatchbuf: PWSTR, lptransformsbuf: PWSTR, pcchtransformsbuf: Long): UInt

public expect fun MsiEnumProductsA(iproductindex: UInt, lpproductbuf: PSTR): UInt

public expect fun MsiEnumProductsExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PSTR, pdwinstalledcontext: Long, szsid: PSTR, pcchsid: Long): UInt

public expect fun MsiEnumProductsExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: PWSTR, pdwinstalledcontext: Long, szsid: PWSTR, pcchsid: Long): UInt

public expect fun MsiEnumProductsW(iproductindex: UInt, lpproductbuf: PWSTR): UInt

public expect fun MsiEnumRelatedProductsA(lpupgradecode: PCSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PSTR): UInt

public expect fun MsiEnumRelatedProductsW(lpupgradecode: PCWSTR, dwreserved: UInt, iproductindex: UInt, lpproductbuf: PWSTR): UInt

public expect fun MsiEvaluateConditionA(hinstall: MSIHANDLE, szcondition: PCSTR): MSICONDITION

public expect fun MsiEvaluateConditionW(hinstall: MSIHANDLE, szcondition: PCWSTR): MSICONDITION

public expect fun MsiExtractPatchXMLDataA(szpatchpath: PCSTR, dwreserved: UInt, szxmldata: PSTR, pcchxmldata: Long): UInt

public expect fun MsiExtractPatchXMLDataW(szpatchpath: PCWSTR, dwreserved: UInt, szxmldata: PWSTR, pcchxmldata: Long): UInt

public expect fun MsiFormatRecordA(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PSTR, pcchresultbuf: Long): UInt

public expect fun MsiFormatRecordW(hinstall: MSIHANDLE, hrecord: MSIHANDLE, szresultbuf: PWSTR, pcchresultbuf: Long): UInt

public expect fun MsiGetActiveDatabase(hinstall: MSIHANDLE): MSIHANDLE

public expect fun MsiGetComponentPathA(szproduct: PCSTR, szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE

public expect fun MsiGetComponentPathExA(szproductcode: PCSTR, szcomponentcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PSTR, pcchoutpathbuffer: Long): INSTALLSTATE

public expect fun MsiGetComponentPathExW(szproductcode: PCWSTR, szcomponentcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, lpoutpathbuffer: PWSTR, pcchoutpathbuffer: Long): INSTALLSTATE

public expect fun MsiGetComponentPathW(szproduct: PCWSTR, szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE

public expect fun MsiGetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, piinstalled: Long, piaction: Long): UInt

public expect fun MsiGetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, piinstalled: Long, piaction: Long): UInt

public expect fun MsiGetDatabaseState(hdatabase: MSIHANDLE): MSIDBSTATE

public expect fun MsiGetFeatureCostA(hinstall: MSIHANDLE, szfeature: PCSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt

public expect fun MsiGetFeatureCostW(hinstall: MSIHANDLE, szfeature: PCWSTR, icosttree: MSICOSTTREE, istate: INSTALLSTATE, picost: Long): UInt

public expect fun MsiGetFeatureInfoA(hproduct: MSIHANDLE, szfeature: PCSTR, lpattributes: Long, lptitlebuf: PSTR, pcchtitlebuf: Long, lphelpbuf: PSTR, pcchhelpbuf: Long): UInt

public expect fun MsiGetFeatureInfoW(hproduct: MSIHANDLE, szfeature: PCWSTR, lpattributes: Long, lptitlebuf: PWSTR, pcchtitlebuf: Long, lphelpbuf: PWSTR, pcchhelpbuf: Long): UInt

public expect fun MsiGetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, piinstalled: Long, piaction: Long): UInt

public expect fun MsiGetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, piinstalled: Long, piaction: Long): UInt

public expect fun MsiGetFeatureUsageA(szproduct: PCSTR, szfeature: PCSTR, pdwusecount: Long, pwdateused: Long): UInt

public expect fun MsiGetFeatureUsageW(szproduct: PCWSTR, szfeature: PCWSTR, pdwusecount: Long, pwdateused: Long): UInt

public expect fun MsiGetFeatureValidStatesA(hinstall: MSIHANDLE, szfeature: PCSTR, lpinstallstates: Long): UInt

public expect fun MsiGetFeatureValidStatesW(hinstall: MSIHANDLE, szfeature: PCWSTR, lpinstallstates: Long): UInt

public expect fun MsiGetFileHashA(szfilepath: PCSTR, dwoptions: UInt, phash: Long): UInt

public expect fun MsiGetFileHashW(szfilepath: PCWSTR, dwoptions: UInt, phash: Long): UInt

public expect fun MsiGetFileSignatureInformationA(szsignedobjectpath: PCSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT

public expect fun MsiGetFileSignatureInformationW(szsignedobjectpath: PCWSTR, dwflags: UInt, ppccertcontext: Long, pbhashdata: Long, pcbhashdata: Long): HRESULT

public expect fun MsiGetFileVersionA(szfilepath: PCSTR, lpversionbuf: PSTR, pcchversionbuf: Long, lplangbuf: PSTR, pcchlangbuf: Long): UInt

public expect fun MsiGetFileVersionW(szfilepath: PCWSTR, lpversionbuf: PWSTR, pcchversionbuf: Long, lplangbuf: PWSTR, pcchlangbuf: Long): UInt

public expect fun MsiGetLanguage(hinstall: MSIHANDLE): UShort

public expect fun MsiGetLastErrorRecord(): MSIHANDLE

public expect fun MsiGetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE): BOOL

public expect fun MsiGetPatchFileListA(szproductcode: PCSTR, szpatchpackages: PCSTR, pcfiles: Long, pphfilerecords: Long): UInt

public expect fun MsiGetPatchFileListW(szproductcode: PCWSTR, szpatchpackages: PCWSTR, pcfiles: Long, pphfilerecords: Long): UInt

public expect fun MsiGetPatchInfoA(szpatch: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetPatchInfoExA(szpatchcode: PCSTR, szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, lpvalue: PSTR, pcchvalue: Long): UInt

public expect fun MsiGetPatchInfoExW(szpatchcode: PCWSTR, szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, lpvalue: PWSTR, pcchvalue: Long): UInt

public expect fun MsiGetPatchInfoW(szpatch: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetProductCodeA(szcomponent: PCSTR, lpbuf39: PSTR): UInt

public expect fun MsiGetProductCodeW(szcomponent: PCWSTR, lpbuf39: PWSTR): UInt

public expect fun MsiGetProductInfoA(szproduct: PCSTR, szattribute: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetProductInfoExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt

public expect fun MsiGetProductInfoExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt

public expect fun MsiGetProductInfoFromScriptA(szscriptfile: PCSTR, lpproductbuf39: PSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PSTR, pcchnamebuf: Long, lppackagebuf: PSTR, pcchpackagebuf: Long): UInt

public expect fun MsiGetProductInfoFromScriptW(szscriptfile: PCWSTR, lpproductbuf39: PWSTR, plgidlanguage: Long, pdwversion: Long, lpnamebuf: PWSTR, pcchnamebuf: Long, lppackagebuf: PWSTR, pcchpackagebuf: Long): UInt

public expect fun MsiGetProductInfoW(szproduct: PCWSTR, szattribute: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetProductPropertyA(hproduct: MSIHANDLE, szproperty: PCSTR, lpvaluebuf: PSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetProductPropertyW(hproduct: MSIHANDLE, szproperty: PCWSTR, lpvaluebuf: PWSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt

public expect fun MsiGetShortcutTargetA(szshortcutpath: PCSTR, szproductcode: PSTR, szfeatureid: PSTR, szcomponentcode: PSTR): UInt

public expect fun MsiGetShortcutTargetW(szshortcutpath: PCWSTR, szproductcode: PWSTR, szfeatureid: PWSTR, szcomponentcode: PWSTR): UInt

public expect fun MsiGetSourcePathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt

public expect fun MsiGetSourcePathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt

public expect fun MsiGetSummaryInformationA(hdatabase: MSIHANDLE, szdatabasepath: PCSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt

public expect fun MsiGetSummaryInformationW(hdatabase: MSIHANDLE, szdatabasepath: PCWSTR, uiupdatecount: UInt, phsummaryinfo: Long): UInt

public expect fun MsiGetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szpathbuf: PSTR, pcchpathbuf: Long): UInt

public expect fun MsiGetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szpathbuf: PWSTR, pcchpathbuf: Long): UInt

public expect fun MsiGetUserInfoA(szproduct: PCSTR, lpusernamebuf: PSTR, pcchusernamebuf: Long, lporgnamebuf: PSTR, pcchorgnamebuf: Long, lpserialbuf: PSTR, pcchserialbuf: Long): USERINFOSTATE

public expect fun MsiGetUserInfoW(szproduct: PCWSTR, lpusernamebuf: PWSTR, pcchusernamebuf: Long, lporgnamebuf: PWSTR, pcchorgnamebuf: Long, lpserialbuf: PWSTR, pcchserialbuf: Long): USERINFOSTATE

public expect fun MsiInstallMissingComponentA(szproduct: PCSTR, szcomponent: PCSTR, einstallstate: INSTALLSTATE): UInt

public expect fun MsiInstallMissingComponentW(szproduct: PCWSTR, szcomponent: PCWSTR, einstallstate: INSTALLSTATE): UInt

public expect fun MsiInstallMissingFileA(szproduct: PCSTR, szfile: PCSTR): UInt

public expect fun MsiInstallMissingFileW(szproduct: PCWSTR, szfile: PCWSTR): UInt

public expect fun MsiInstallProductA(szpackagepath: PCSTR, szcommandline: PCSTR): UInt

public expect fun MsiInstallProductW(szpackagepath: PCWSTR, szcommandline: PCWSTR): UInt

public expect fun MsiIsProductElevatedA(szproduct: PCSTR, pfelevated: Long): UInt

public expect fun MsiIsProductElevatedW(szproduct: PCWSTR, pfelevated: Long): UInt

public expect fun MsiJoinTransaction(htransactionhandle: MSIHANDLE, dwtransactionattributes: UInt, phchangeofownerevent: Long): UInt

public expect fun MsiLocateComponentA(szcomponent: PCSTR, lppathbuf: PSTR, pcchbuf: Long): INSTALLSTATE

public expect fun MsiLocateComponentW(szcomponent: PCWSTR, lppathbuf: PWSTR, pcchbuf: Long): INSTALLSTATE

public expect fun MsiNotifySidChangeA(poldsid: PCSTR, pnewsid: PCSTR): UInt

public expect fun MsiNotifySidChangeW(poldsid: PCWSTR, pnewsid: PCWSTR): UInt

public expect fun MsiOpenDatabaseA(szdatabasepath: PCSTR, szpersist: PCSTR, phdatabase: Long): UInt

public expect fun MsiOpenDatabaseW(szdatabasepath: PCWSTR, szpersist: PCWSTR, phdatabase: Long): UInt

public expect fun MsiOpenPackageA(szpackagepath: PCSTR, hproduct: Long): UInt

public expect fun MsiOpenPackageExA(szpackagepath: PCSTR, dwoptions: UInt, hproduct: Long): UInt

public expect fun MsiOpenPackageExW(szpackagepath: PCWSTR, dwoptions: UInt, hproduct: Long): UInt

public expect fun MsiOpenPackageW(szpackagepath: PCWSTR, hproduct: Long): UInt

public expect fun MsiOpenProductA(szproduct: PCSTR, hproduct: Long): UInt

public expect fun MsiOpenProductW(szproduct: PCWSTR, hproduct: Long): UInt

public expect fun MsiPreviewBillboardA(hpreview: MSIHANDLE, szcontrolname: PCSTR, szbillboard: PCSTR): UInt

public expect fun MsiPreviewBillboardW(hpreview: MSIHANDLE, szcontrolname: PCWSTR, szbillboard: PCWSTR): UInt

public expect fun MsiPreviewDialogA(hpreview: MSIHANDLE, szdialogname: PCSTR): UInt

public expect fun MsiPreviewDialogW(hpreview: MSIHANDLE, szdialogname: PCWSTR): UInt

public expect fun MsiProcessAdvertiseScriptA(szscriptfile: PCSTR, sziconfolder: PCSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt

public expect fun MsiProcessAdvertiseScriptW(szscriptfile: PCWSTR, sziconfolder: PCWSTR, hregdata: HKEY, fshortcuts: BOOL, fremoveitems: BOOL): UInt

public expect fun MsiProcessMessage(hinstall: MSIHANDLE, emessagetype: INSTALLMESSAGE, hrecord: MSIHANDLE): Int

public expect fun MsiProvideAssemblyA(szassemblyname: PCSTR, szappcontext: PCSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PSTR, pcchpathbuf: Long): UInt

public expect fun MsiProvideAssemblyW(szassemblyname: PCWSTR, szappcontext: PCWSTR, dwinstallmode: UInt, dwassemblyinfo: MSIASSEMBLYINFO, lppathbuf: PWSTR, pcchpathbuf: Long): UInt

public expect fun MsiProvideComponentA(szproduct: PCSTR, szfeature: PCSTR, szcomponent: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt

public expect fun MsiProvideComponentW(szproduct: PCWSTR, szfeature: PCWSTR, szcomponent: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt

public expect fun MsiProvideQualifiedComponentA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt

public expect fun MsiProvideQualifiedComponentExA(szcategory: PCSTR, szqualifier: PCSTR, dwinstallmode: UInt, szproduct: PCSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PSTR, pcchpathbuf: Long): UInt

public expect fun MsiProvideQualifiedComponentExW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, szproduct: PCWSTR, dwunused1: UInt, dwunused2: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt

public expect fun MsiProvideQualifiedComponentW(szcategory: PCWSTR, szqualifier: PCWSTR, dwinstallmode: UInt, lppathbuf: PWSTR, pcchpathbuf: Long): UInt

public expect fun MsiQueryComponentStateA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCSTR, pdwstate: Long): UInt

public expect fun MsiQueryComponentStateW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szcomponentcode: PCWSTR, pdwstate: Long): UInt

public expect fun MsiQueryFeatureStateA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE

public expect fun MsiQueryFeatureStateExA(szproductcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCSTR, pdwstate: Long): UInt

public expect fun MsiQueryFeatureStateExW(szproductcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, szfeature: PCWSTR, pdwstate: Long): UInt

public expect fun MsiQueryFeatureStateW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE

public expect fun MsiQueryProductStateA(szproduct: PCSTR): INSTALLSTATE

public expect fun MsiQueryProductStateW(szproduct: PCWSTR): INSTALLSTATE

public expect fun MsiRecordClearData(hrecord: MSIHANDLE): UInt

public expect fun MsiRecordDataSize(hrecord: MSIHANDLE, ifield: UInt): UInt

public expect fun MsiRecordGetFieldCount(hrecord: MSIHANDLE): UInt

public expect fun MsiRecordGetInteger(hrecord: MSIHANDLE, ifield: UInt): Int

public expect fun MsiRecordGetStringA(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt

public expect fun MsiRecordGetStringW(hrecord: MSIHANDLE, ifield: UInt, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt

public expect fun MsiRecordIsNull(hrecord: MSIHANDLE, ifield: UInt): BOOL

public expect fun MsiRecordReadStream(hrecord: MSIHANDLE, ifield: UInt, szdatabuf: PSTR, pcbdatabuf: Long): UInt

public expect fun MsiRecordSetInteger(hrecord: MSIHANDLE, ifield: UInt, ivalue: Int): UInt

public expect fun MsiRecordSetStreamA(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCSTR): UInt

public expect fun MsiRecordSetStreamW(hrecord: MSIHANDLE, ifield: UInt, szfilepath: PCWSTR): UInt

public expect fun MsiRecordSetStringA(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCSTR): UInt

public expect fun MsiRecordSetStringW(hrecord: MSIHANDLE, ifield: UInt, szvalue: PCWSTR): UInt

public expect fun MsiReinstallFeatureA(szproduct: PCSTR, szfeature: PCSTR, dwreinstallmode: UInt): UInt

public expect fun MsiReinstallFeatureW(szproduct: PCWSTR, szfeature: PCWSTR, dwreinstallmode: UInt): UInt

public expect fun MsiReinstallProductA(szproduct: PCSTR, szreinstallmode: UInt): UInt

public expect fun MsiReinstallProductW(szproduct: PCWSTR, szreinstallmode: UInt): UInt

public expect fun MsiRemovePatchesA(szpatchlist: PCSTR, szproductcode: PCSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCSTR): UInt

public expect fun MsiRemovePatchesW(szpatchlist: PCWSTR, szproductcode: PCWSTR, euninstalltype: INSTALLTYPE, szpropertylist: PCWSTR): UInt

public expect fun MsiSequenceA(hinstall: MSIHANDLE, sztable: PCSTR, isequencemode: Int): UInt

public expect fun MsiSequenceW(hinstall: MSIHANDLE, sztable: PCWSTR, isequencemode: Int): UInt

public expect fun MsiSetComponentStateA(hinstall: MSIHANDLE, szcomponent: PCSTR, istate: INSTALLSTATE): UInt

public expect fun MsiSetComponentStateW(hinstall: MSIHANDLE, szcomponent: PCWSTR, istate: INSTALLSTATE): UInt

public expect fun MsiSetExternalUIA(puihandler: INSTALLUI_HANDLERA, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERA

public expect fun MsiSetExternalUIRecord(puihandler: PINSTALLUI_HANDLER_RECORD, dwmessagefilter: UInt, pvcontext: Long, ppuiprevhandler: PINSTALLUI_HANDLER_RECORD): UInt

public expect fun MsiSetExternalUIW(puihandler: INSTALLUI_HANDLERW, dwmessagefilter: UInt, pvcontext: Long): INSTALLUI_HANDLERW

public expect fun MsiSetFeatureAttributesA(hinstall: MSIHANDLE, szfeature: PCSTR, dwattributes: UInt): UInt

public expect fun MsiSetFeatureAttributesW(hinstall: MSIHANDLE, szfeature: PCWSTR, dwattributes: UInt): UInt

public expect fun MsiSetFeatureStateA(hinstall: MSIHANDLE, szfeature: PCSTR, istate: INSTALLSTATE): UInt

public expect fun MsiSetFeatureStateW(hinstall: MSIHANDLE, szfeature: PCWSTR, istate: INSTALLSTATE): UInt

public expect fun MsiSetInstallLevel(hinstall: MSIHANDLE, iinstalllevel: Int): UInt

public expect fun MsiSetInternalUI(dwuilevel: INSTALLUILEVEL, phwnd: Long): INSTALLUILEVEL

public expect fun MsiSetMode(hinstall: MSIHANDLE, erunmode: MSIRUNMODE, fstate: BOOL): UInt

public expect fun MsiSetPropertyA(hinstall: MSIHANDLE, szname: PCSTR, szvalue: PCSTR): UInt

public expect fun MsiSetPropertyW(hinstall: MSIHANDLE, szname: PCWSTR, szvalue: PCWSTR): UInt

public expect fun MsiSetTargetPathA(hinstall: MSIHANDLE, szfolder: PCSTR, szfolderpath: PCSTR): UInt

public expect fun MsiSetTargetPathW(hinstall: MSIHANDLE, szfolder: PCWSTR, szfolderpath: PCWSTR): UInt

public expect fun MsiSourceListAddMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCSTR, szdiskprompt: PCSTR): UInt

public expect fun MsiSourceListAddMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: PCWSTR, szdiskprompt: PCWSTR): UInt

public expect fun MsiSourceListAddSourceA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt, szsource: PCSTR): UInt

public expect fun MsiSourceListAddSourceExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR, dwindex: UInt): UInt

public expect fun MsiSourceListAddSourceExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR, dwindex: UInt): UInt

public expect fun MsiSourceListAddSourceW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt, szsource: PCWSTR): UInt

public expect fun MsiSourceListClearAllA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt

public expect fun MsiSourceListClearAllExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt

public expect fun MsiSourceListClearAllExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt

public expect fun MsiSourceListClearAllW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt

public expect fun MsiSourceListClearMediaDiskA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt

public expect fun MsiSourceListClearMediaDiskW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwdiskid: UInt): UInt

public expect fun MsiSourceListClearSourceA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCSTR): UInt

public expect fun MsiSourceListClearSourceW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szsource: PCWSTR): UInt

public expect fun MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PSTR, pcchvolumelabel: Long, szdiskprompt: PSTR, pcchdiskprompt: Long): UInt

public expect fun MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, pdwdiskid: Long, szvolumelabel: PWSTR, pcchvolumelabel: Long, szdiskprompt: PWSTR, pcchdiskprompt: Long): UInt

public expect fun MsiSourceListEnumSourcesA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PSTR, pcchsource: Long): UInt

public expect fun MsiSourceListEnumSourcesW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, dwindex: UInt, szsource: PWSTR, pcchsource: Long): UInt

public expect fun MsiSourceListForceResolutionA(szproduct: PCSTR, szusername: PCSTR, dwreserved: UInt): UInt

public expect fun MsiSourceListForceResolutionExA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt

public expect fun MsiSourceListForceResolutionExW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt): UInt

public expect fun MsiSourceListForceResolutionW(szproduct: PCWSTR, szusername: PCWSTR, dwreserved: UInt): UInt

public expect fun MsiSourceListGetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PSTR, pcchvalue: Long): UInt

public expect fun MsiSourceListGetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PWSTR, pcchvalue: Long): UInt

public expect fun MsiSourceListSetInfoA(szproductcodeorpatchcode: PCSTR, szusersid: PCSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCSTR, szvalue: PCSTR): UInt

public expect fun MsiSourceListSetInfoW(szproductcodeorpatchcode: PCWSTR, szusersid: PCWSTR, dwcontext: MSIINSTALLCONTEXT, dwoptions: UInt, szproperty: PCWSTR, szvalue: PCWSTR): UInt

public expect fun MsiSummaryInfoGetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PSTR, pcchvaluebuf: Long): UInt

public expect fun MsiSummaryInfoGetPropertyCount(hsummaryinfo: MSIHANDLE, puipropertycount: Long): UInt

public expect fun MsiSummaryInfoGetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, puidatatype: Long, pivalue: Long, pftvalue: Long, szvaluebuf: PWSTR, pcchvaluebuf: Long): UInt

public expect fun MsiSummaryInfoPersist(hsummaryinfo: MSIHANDLE): UInt

public expect fun MsiSummaryInfoSetPropertyA(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCSTR): UInt

public expect fun MsiSummaryInfoSetPropertyW(hsummaryinfo: MSIHANDLE, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: Long, szvalue: PCWSTR): UInt

public expect fun MsiUseFeatureA(szproduct: PCSTR, szfeature: PCSTR): INSTALLSTATE

public expect fun MsiUseFeatureExA(szproduct: PCSTR, szfeature: PCSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE

public expect fun MsiUseFeatureExW(szproduct: PCWSTR, szfeature: PCWSTR, dwinstallmode: UInt, dwreserved: UInt): INSTALLSTATE

public expect fun MsiUseFeatureW(szproduct: PCWSTR, szfeature: PCWSTR): INSTALLSTATE

public expect fun MsiVerifyDiskSpace(hinstall: MSIHANDLE): UInt

public expect fun MsiVerifyPackageA(szpackagepath: PCSTR): UInt

public expect fun MsiVerifyPackageW(szpackagepath: PCWSTR): UInt

public expect fun MsiViewClose(hview: MSIHANDLE): UInt

public expect fun MsiViewExecute(hview: MSIHANDLE, hrecord: MSIHANDLE): UInt

public expect fun MsiViewFetch(hview: MSIHANDLE, phrecord: Long): UInt

public expect fun MsiViewGetColumnInfo(hview: MSIHANDLE, ecolumninfo: MSICOLINFO, phrecord: Long): UInt

public expect fun MsiViewGetErrorA(hview: MSIHANDLE, szcolumnnamebuffer: PSTR, pcchbuf: Long): MSIDBERROR

public expect fun MsiViewGetErrorW(hview: MSIHANDLE, szcolumnnamebuffer: PWSTR, pcchbuf: Long): MSIDBERROR

public expect fun MsiViewModify(hview: MSIHANDLE, emodifymode: MSIMODIFY, hrecord: MSIHANDLE): UInt

public expect fun NormalizeFileForPatchSignature(filebuffer: Long, filesize: UInt, optionflags: UInt, optiondata: Long, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: Long, retainrangecount: UInt, retainrangearray: Long): Int

public expect fun QueryActCtxSettingsW(dwflags: UInt, hactctx: HANDLE, settingsnamespace: PCWSTR, settingname: PCWSTR, pvbuffer: PWSTR, dwbuffer: ULong, pdwwrittenorrequired: Long): BOOL

public expect fun QueryActCtxW(dwflags: UInt, hactctx: HANDLE, pvsubinstance: Long, ulinfoclass: UInt, pvbuffer: Long, cbbuffer: ULong, pcbwrittenorrequired: Long): BOOL

public expect fun ReleaseActCtx(hactctx: HANDLE)

public expect fun SfcGetNextProtectedFile(rpchandle: HANDLE, protfiledata: Long): BOOL

public expect fun SfcIsFileProtected(rpchandle: HANDLE, protfilename: PCWSTR): BOOL

public expect fun SfcIsKeyProtected(keyhandle: HKEY, subkeyname: PCWSTR, keysam: UInt): BOOL

public expect fun SfpVerifyFile(pszfilename: PCSTR, pszerror: PCSTR, dwerrsize: UInt): BOOL

public expect fun TestApplyPatchToFileA(patchfilename: PCSTR, oldfilename: PCSTR, applyoptionflags: UInt): BOOL

public expect fun TestApplyPatchToFileByBuffers(patchfilebuffer: Long, patchfilesize: UInt, oldfilebuffer: Long, oldfilesize: UInt, newfilesize: Long, applyoptionflags: UInt): BOOL

public expect fun TestApplyPatchToFileByHandles(patchfilehandle: HANDLE, oldfilehandle: HANDLE, applyoptionflags: UInt): BOOL

public expect fun TestApplyPatchToFileW(patchfilename: PCWSTR, oldfilename: PCWSTR, applyoptionflags: UInt): BOOL

public expect fun ZombifyActCtx(hactctx: HANDLE): BOOL
