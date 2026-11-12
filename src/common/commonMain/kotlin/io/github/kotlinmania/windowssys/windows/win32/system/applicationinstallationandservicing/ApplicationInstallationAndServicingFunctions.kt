package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

public expect fun activateActCtx(hactctx: Handle, lpcookie: MutPtr): Bool

public expect fun addRefActCtx(hactctx: Handle)

public expect fun applyDeltaA(applyflags: Long, lpsourcename: Pcstr, lpdeltaname: Pcstr, lptargetname: Pcstr): Bool

public expect fun applyDeltaB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr): Bool

public expect fun applyDeltaGetReverseB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lpreversefiletime: ConstPtr, lptarget: MutPtr, lptargetreverse: MutPtr): Bool

public expect fun applyDeltaProvidedB(applyflags: Long, source: DeltaInput, delta: DeltaInput, lptarget: MutPtr, utargetsize: ULong): Bool

public expect fun applyDeltaW(applyflags: Long, lpsourcename: Pcwstr, lpdeltaname: Pcwstr, lptargetname: Pcwstr): Bool

public expect fun applyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt): Bool

public expect fun applyPatchToFileByBuffers(patchfilemapped: ConstPtr, patchfilesize: UInt, oldfilemapped: ConstPtr, oldfilesize: UInt, newfilebuffer: MutPtr, newfilebuffersize: UInt, newfileactualsize: MutPtr, newfiletime: MutPtr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool

public expect fun applyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt): Bool

public expect fun applyPatchToFileByHandlesEx(patchfilehandle: Handle, oldfilehandle: Handle, newfilehandle: Handle, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool

public expect fun applyPatchToFileExA(patchfilename: Pcstr, oldfilename: Pcstr, newfilename: Pcstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool

public expect fun applyPatchToFileExW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool

public expect fun applyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, newfilename: Pcwstr, applyoptionflags: UInt): Bool

public expect fun createActCtxA(pactctx: ConstPtr): Handle

public expect fun createActCtxW(pactctx: ConstPtr): Handle

public expect fun createDeltaA(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcstr, lptargetname: Pcstr, lpsourceoptionsname: Pcstr, lptargetoptionsname: Pcstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr, hashalgid: AlgId, lpdeltaname: Pcstr): Bool

public expect fun createDeltaB(filetypeset: Long, setflags: Long, resetflags: Long, source: DeltaInput, target: DeltaInput, sourceoptions: DeltaInput, targetoptions: DeltaInput, globaloptions: DeltaInput, lptargetfiletime: ConstPtr, hashalgid: AlgId, lpdelta: MutPtr): Bool

public expect fun createDeltaW(filetypeset: Long, setflags: Long, resetflags: Long, lpsourcename: Pcwstr, lptargetname: Pcwstr, lpsourceoptionsname: Pcwstr, lptargetoptionsname: Pcwstr, globaloptions: DeltaInput, lptargetfiletime: ConstPtr, hashalgid: AlgId, lpdeltaname: Pcwstr): Bool

public expect fun createPatchFileA(oldfilename: Pcstr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr): Bool

public expect fun createPatchFileByHandles(oldfilehandle: Handle, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr): Bool

public expect fun createPatchFileByHandlesEx(oldfilecount: UInt, oldfileinfoarray: ConstPtr, newfilehandle: Handle, patchfilehandle: Handle, optionflags: UInt, optiondata: ConstPtr, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool

public expect fun createPatchFileExA(oldfilecount: UInt, oldfileinfoarray: ConstPtr, newfilename: Pcstr, patchfilename: Pcstr, optionflags: UInt, optiondata: ConstPtr, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool

public expect fun createPatchFileExW(oldfilecount: UInt, oldfileinfoarray: ConstPtr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr, progresscallback: PpatchProgressCallback, callbackcontext: ConstPtr): Bool

public expect fun createPatchFileW(oldfilename: Pcwstr, newfilename: Pcwstr, patchfilename: Pcwstr, optionflags: UInt, optiondata: ConstPtr): Bool

public expect fun deactivateActCtx(dwflags: UInt, ulcookie: ULong): Bool

public expect fun deltaFree(lpmemory: ConstPtr): Bool

public expect fun deltaNormalizeProvidedB(filetypeset: Long, normalizeflags: Long, normalizeoptions: DeltaInput, lpsource: MutPtr, usourcesize: ULong): Bool

public expect fun extractPatchHeaderToFileA(patchfilename: Pcstr, patchheaderfilename: Pcstr): Bool

public expect fun extractPatchHeaderToFileByHandles(patchfilehandle: Handle, patchheaderfilehandle: Handle): Bool

public expect fun extractPatchHeaderToFileW(patchfilename: Pcwstr, patchheaderfilename: Pcwstr): Bool

public expect fun findActCtxSectionGuid(dwflags: UInt, lpextensionguid: ConstPtr, ulsectionid: UInt, lpguidtofind: ConstPtr, returneddata: MutPtr): Bool

public expect fun findActCtxSectionStringA(dwflags: UInt, lpextensionguid: ConstPtr, ulsectionid: UInt, lpstringtofind: Pcstr, returneddata: MutPtr): Bool

public expect fun findActCtxSectionStringW(dwflags: UInt, lpextensionguid: ConstPtr, ulsectionid: UInt, lpstringtofind: Pcwstr, returneddata: MutPtr): Bool

public expect fun getCurrentActCtx(lphactctx: MutPtr): Bool

public expect fun getDeltaInfoA(lpdeltaname: Pcstr, lpheaderinfo: MutPtr): Bool

public expect fun getDeltaInfoB(delta: DeltaInput, lpheaderinfo: MutPtr): Bool

public expect fun getDeltaInfoW(lpdeltaname: Pcwstr, lpheaderinfo: MutPtr): Bool

public expect fun getDeltaSignatureA(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcstr, lphash: MutPtr): Bool

public expect fun getDeltaSignatureB(filetypeset: Long, hashalgid: AlgId, source: DeltaInput, lphash: MutPtr): Bool

public expect fun getDeltaSignatureW(filetypeset: Long, hashalgid: AlgId, lpsourcename: Pcwstr, lphash: MutPtr): Bool

public expect fun getFilePatchSignatureA(filename: Pcstr, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool

public expect fun getFilePatchSignatureByBuffer(filebufferwritable: MutPtr, filesize: UInt, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool

public expect fun getFilePatchSignatureByHandle(filehandle: Handle, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pstr): Bool

public expect fun getFilePatchSignatureW(filename: Pcwstr, optionflags: UInt, optiondata: ConstPtr, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr, signaturebuffersize: UInt, signaturebuffer: Pwstr): Bool

public expect fun msiAdvertiseProductA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort): UInt

public expect fun msiAdvertiseProductExA(szpackagepath: Pcstr, szscriptfilepath: Pcstr, sztransforms: Pcstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt

public expect fun msiAdvertiseProductExW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort, dwplatform: UInt, dwoptions: UInt): UInt

public expect fun msiAdvertiseProductW(szpackagepath: Pcwstr, szscriptfilepath: Pcwstr, sztransforms: Pcwstr, lgidlanguage: UShort): UInt

public expect fun msiAdvertiseScriptA(szscriptfile: Pcstr, dwflags: UInt, phregdata: ConstPtr, fremoveitems: Bool): UInt

public expect fun msiAdvertiseScriptW(szscriptfile: Pcwstr, dwflags: UInt, phregdata: ConstPtr, fremoveitems: Bool): UInt

public expect fun msiApplyMultiplePatchesA(szpatchpackages: Pcstr, szproductcode: Pcstr, szpropertieslist: Pcstr): UInt

public expect fun msiApplyMultiplePatchesW(szpatchpackages: Pcwstr, szproductcode: Pcwstr, szpropertieslist: Pcwstr): UInt

public expect fun msiApplyPatchA(szpatchpackage: Pcstr, szinstallpackage: Pcstr, einstalltype: Installtype, szcommandline: Pcstr): UInt

public expect fun msiApplyPatchW(szpatchpackage: Pcwstr, szinstallpackage: Pcwstr, einstalltype: Installtype, szcommandline: Pcwstr): UInt

public expect fun msiBeginTransactionA(szname: Pcstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr, phchangeofownerevent: MutPtr): UInt

public expect fun msiBeginTransactionW(szname: Pcwstr, dwtransactionattributes: UInt, phtransactionhandle: MutPtr, phchangeofownerevent: MutPtr): UInt

public expect fun msiCloseAllHandles(): UInt

public expect fun msiCloseHandle(hany: Msihandle): UInt

public expect fun msiCollectUserInfoA(szproduct: Pcstr): UInt

public expect fun msiCollectUserInfoW(szproduct: Pcwstr): UInt

public expect fun msiConfigureFeatureA(szproduct: Pcstr, szfeature: Pcstr, einstallstate: Installstate): UInt

public expect fun msiConfigureFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, einstallstate: Installstate): UInt

public expect fun msiConfigureProductA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt

public expect fun msiConfigureProductExA(szproduct: Pcstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcstr): UInt

public expect fun msiConfigureProductExW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate, szcommandline: Pcwstr): UInt

public expect fun msiConfigureProductW(szproduct: Pcwstr, iinstalllevel: Installlevel, einstallstate: Installstate): UInt

public expect fun msiCreateRecord(cparams: UInt): Msihandle

public expect fun msiCreateTransformSummaryInfoA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt

public expect fun msiCreateTransformSummaryInfoW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError, ivalidation: MsitransformValidate): UInt

public expect fun msiDatabaseApplyTransformA(hdatabase: Msihandle, sztransformfile: Pcstr, ierrorconditions: MsitransformError): UInt

public expect fun msiDatabaseApplyTransformW(hdatabase: Msihandle, sztransformfile: Pcwstr, ierrorconditions: MsitransformError): UInt

public expect fun msiDatabaseCommit(hdatabase: Msihandle): UInt

public expect fun msiDatabaseExportA(hdatabase: Msihandle, sztablename: Pcstr, szfolderpath: Pcstr, szfilename: Pcstr): UInt

public expect fun msiDatabaseExportW(hdatabase: Msihandle, sztablename: Pcwstr, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt

public expect fun msiDatabaseGenerateTransformA(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcstr, ireserved1: Int, ireserved2: Int): UInt

public expect fun msiDatabaseGenerateTransformW(hdatabase: Msihandle, hdatabasereference: Msihandle, sztransformfile: Pcwstr, ireserved1: Int, ireserved2: Int): UInt

public expect fun msiDatabaseGetPrimaryKeysA(hdatabase: Msihandle, sztablename: Pcstr, phrecord: MutPtr): UInt

public expect fun msiDatabaseGetPrimaryKeysW(hdatabase: Msihandle, sztablename: Pcwstr, phrecord: MutPtr): UInt

public expect fun msiDatabaseImportA(hdatabase: Msihandle, szfolderpath: Pcstr, szfilename: Pcstr): UInt

public expect fun msiDatabaseImportW(hdatabase: Msihandle, szfolderpath: Pcwstr, szfilename: Pcwstr): UInt

public expect fun msiDatabaseIsTablePersistentA(hdatabase: Msihandle, sztablename: Pcstr): Msicondition

public expect fun msiDatabaseIsTablePersistentW(hdatabase: Msihandle, sztablename: Pcwstr): Msicondition

public expect fun msiDatabaseMergeA(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcstr): UInt

public expect fun msiDatabaseMergeW(hdatabase: Msihandle, hdatabasemerge: Msihandle, sztablename: Pcwstr): UInt

public expect fun msiDatabaseOpenViewA(hdatabase: Msihandle, szquery: Pcstr, phview: MutPtr): UInt

public expect fun msiDatabaseOpenViewW(hdatabase: Msihandle, szquery: Pcwstr, phview: MutPtr): UInt

public expect fun msiDetermineApplicablePatchesA(szproductpackagepath: Pcstr, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt

public expect fun msiDetermineApplicablePatchesW(szproductpackagepath: Pcwstr, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt

public expect fun msiDeterminePatchSequenceA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt

public expect fun msiDeterminePatchSequenceW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, cpatchinfo: UInt, ppatchinfo: MutPtr): UInt

public expect fun msiDoActionA(hinstall: Msihandle, szaction: Pcstr): UInt

public expect fun msiDoActionW(hinstall: Msihandle, szaction: Pcwstr): UInt

public expect fun msiEnableLogA(dwlogmode: UInt, szlogfile: Pcstr, dwlogattributes: UInt): UInt

public expect fun msiEnableLogW(dwlogmode: UInt, szlogfile: Pcwstr, dwlogattributes: UInt): UInt

public expect fun msiEnableUIPreview(hdatabase: Msihandle, phpreview: MutPtr): UInt

public expect fun msiEndTransaction(dwtransactionstate: Msitransactionstate): UInt

public expect fun msiEnumClientsA(szcomponent: Pcstr, iproductindex: UInt, lpproductbuf: Pstr): UInt

public expect fun msiEnumClientsExA(szcomponent: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pstr, pdwinstalledcontext: MutPtr, szsid: Pstr, pcchsid: MutPtr): UInt

public expect fun msiEnumClientsExW(szcomponent: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwproductindex: UInt, szproductbuf: Pwstr, pdwinstalledcontext: MutPtr, szsid: Pwstr, pcchsid: MutPtr): UInt

public expect fun msiEnumClientsW(szcomponent: Pcwstr, iproductindex: UInt, lpproductbuf: Pwstr): UInt

public expect fun msiEnumComponentCostsA(hinstall: Msihandle, szcomponent: Pcstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pstr, pcchdrivebuf: MutPtr, picost: MutPtr, pitempcost: MutPtr): UInt

public expect fun msiEnumComponentCostsW(hinstall: Msihandle, szcomponent: Pcwstr, dwindex: UInt, istate: Installstate, szdrivebuf: Pwstr, pcchdrivebuf: MutPtr, picost: MutPtr, pitempcost: MutPtr): UInt

public expect fun msiEnumComponentQualifiersA(szcomponent: Pcstr, iindex: UInt, lpqualifierbuf: Pstr, pcchqualifierbuf: MutPtr, lpapplicationdatabuf: Pstr, pcchapplicationdatabuf: MutPtr): UInt

public expect fun msiEnumComponentQualifiersW(szcomponent: Pcwstr, iindex: UInt, lpqualifierbuf: Pwstr, pcchqualifierbuf: MutPtr, lpapplicationdatabuf: Pwstr, pcchapplicationdatabuf: MutPtr): UInt

public expect fun msiEnumComponentsA(icomponentindex: UInt, lpcomponentbuf: Pstr): UInt

public expect fun msiEnumComponentsExA(szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pstr, pdwinstalledcontext: MutPtr, szsid: Pstr, pcchsid: MutPtr): UInt

public expect fun msiEnumComponentsExW(szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledcomponentcode: Pwstr, pdwinstalledcontext: MutPtr, szsid: Pwstr, pcchsid: MutPtr): UInt

public expect fun msiEnumComponentsW(icomponentindex: UInt, lpcomponentbuf: Pwstr): UInt

public expect fun msiEnumFeaturesA(szproduct: Pcstr, ifeatureindex: UInt, lpfeaturebuf: Pstr, lpparentbuf: Pstr): UInt

public expect fun msiEnumFeaturesW(szproduct: Pcwstr, ifeatureindex: UInt, lpfeaturebuf: Pwstr, lpparentbuf: Pwstr): UInt

public expect fun msiEnumPatchesA(szproduct: Pcstr, ipatchindex: UInt, lppatchbuf: Pstr, lptransformsbuf: Pstr, pcchtransformsbuf: MutPtr): UInt

public expect fun msiEnumPatchesExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pstr, sztargetproductcode: Pstr, pdwtargetproductcontext: MutPtr, sztargetusersid: Pstr, pcchtargetusersid: MutPtr): UInt

public expect fun msiEnumPatchesExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwfilter: UInt, dwindex: UInt, szpatchcode: Pwstr, sztargetproductcode: Pwstr, pdwtargetproductcontext: MutPtr, sztargetusersid: Pwstr, pcchtargetusersid: MutPtr): UInt

public expect fun msiEnumPatchesW(szproduct: Pcwstr, ipatchindex: UInt, lppatchbuf: Pwstr, lptransformsbuf: Pwstr, pcchtransformsbuf: MutPtr): UInt

public expect fun msiEnumProductsA(iproductindex: UInt, lpproductbuf: Pstr): UInt

public expect fun msiEnumProductsExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pstr, pdwinstalledcontext: MutPtr, szsid: Pstr, pcchsid: MutPtr): UInt

public expect fun msiEnumProductsExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: UInt, dwindex: UInt, szinstalledproductcode: Pwstr, pdwinstalledcontext: MutPtr, szsid: Pwstr, pcchsid: MutPtr): UInt

public expect fun msiEnumProductsW(iproductindex: UInt, lpproductbuf: Pwstr): UInt

public expect fun msiEnumRelatedProductsA(lpupgradecode: Pcstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pstr): UInt

public expect fun msiEnumRelatedProductsW(lpupgradecode: Pcwstr, dwreserved: UInt, iproductindex: UInt, lpproductbuf: Pwstr): UInt

public expect fun msiEvaluateConditionA(hinstall: Msihandle, szcondition: Pcstr): Msicondition

public expect fun msiEvaluateConditionW(hinstall: Msihandle, szcondition: Pcwstr): Msicondition

public expect fun msiExtractPatchXMLDataA(szpatchpath: Pcstr, dwreserved: UInt, szxmldata: Pstr, pcchxmldata: MutPtr): UInt

public expect fun msiExtractPatchXMLDataW(szpatchpath: Pcwstr, dwreserved: UInt, szxmldata: Pwstr, pcchxmldata: MutPtr): UInt

public expect fun msiFormatRecordA(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pstr, pcchresultbuf: MutPtr): UInt

public expect fun msiFormatRecordW(hinstall: Msihandle, hrecord: Msihandle, szresultbuf: Pwstr, pcchresultbuf: MutPtr): UInt

public expect fun msiGetActiveDatabase(hinstall: Msihandle): Msihandle

public expect fun msiGetComponentPathA(szproduct: Pcstr, szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr): Installstate

public expect fun msiGetComponentPathExA(szproductcode: Pcstr, szcomponentcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pstr, pcchoutpathbuffer: MutPtr): Installstate

public expect fun msiGetComponentPathExW(szproductcode: Pcwstr, szcomponentcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, lpoutpathbuffer: Pwstr, pcchoutpathbuffer: MutPtr): Installstate

public expect fun msiGetComponentPathW(szproduct: Pcwstr, szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr): Installstate

public expect fun msiGetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, piinstalled: MutPtr, piaction: MutPtr): UInt

public expect fun msiGetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, piinstalled: MutPtr, piaction: MutPtr): UInt

public expect fun msiGetDatabaseState(hdatabase: Msihandle): Msidbstate

public expect fun msiGetFeatureCostA(hinstall: Msihandle, szfeature: Pcstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr): UInt

public expect fun msiGetFeatureCostW(hinstall: Msihandle, szfeature: Pcwstr, icosttree: Msicosttree, istate: Installstate, picost: MutPtr): UInt

public expect fun msiGetFeatureInfoA(hproduct: Msihandle, szfeature: Pcstr, lpattributes: MutPtr, lptitlebuf: Pstr, pcchtitlebuf: MutPtr, lphelpbuf: Pstr, pcchhelpbuf: MutPtr): UInt

public expect fun msiGetFeatureInfoW(hproduct: Msihandle, szfeature: Pcwstr, lpattributes: MutPtr, lptitlebuf: Pwstr, pcchtitlebuf: MutPtr, lphelpbuf: Pwstr, pcchhelpbuf: MutPtr): UInt

public expect fun msiGetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, piinstalled: MutPtr, piaction: MutPtr): UInt

public expect fun msiGetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, piinstalled: MutPtr, piaction: MutPtr): UInt

public expect fun msiGetFeatureUsageA(szproduct: Pcstr, szfeature: Pcstr, pdwusecount: MutPtr, pwdateused: MutPtr): UInt

public expect fun msiGetFeatureUsageW(szproduct: Pcwstr, szfeature: Pcwstr, pdwusecount: MutPtr, pwdateused: MutPtr): UInt

public expect fun msiGetFeatureValidStatesA(hinstall: Msihandle, szfeature: Pcstr, lpinstallstates: MutPtr): UInt

public expect fun msiGetFeatureValidStatesW(hinstall: Msihandle, szfeature: Pcwstr, lpinstallstates: MutPtr): UInt

public expect fun msiGetFileHashA(szfilepath: Pcstr, dwoptions: UInt, phash: MutPtr): UInt

public expect fun msiGetFileHashW(szfilepath: Pcwstr, dwoptions: UInt, phash: MutPtr): UInt

public expect fun msiGetFileSignatureInformationA(szsignedobjectpath: Pcstr, dwflags: UInt, ppccertcontext: MutPtr, pbhashdata: MutPtr, pcbhashdata: MutPtr): Hresult

public expect fun msiGetFileSignatureInformationW(szsignedobjectpath: Pcwstr, dwflags: UInt, ppccertcontext: MutPtr, pbhashdata: MutPtr, pcbhashdata: MutPtr): Hresult

public expect fun msiGetFileVersionA(szfilepath: Pcstr, lpversionbuf: Pstr, pcchversionbuf: MutPtr, lplangbuf: Pstr, pcchlangbuf: MutPtr): UInt

public expect fun msiGetFileVersionW(szfilepath: Pcwstr, lpversionbuf: Pwstr, pcchversionbuf: MutPtr, lplangbuf: Pwstr, pcchlangbuf: MutPtr): UInt

public expect fun msiGetLanguage(hinstall: Msihandle): UShort

public expect fun msiGetLastErrorRecord(): Msihandle

public expect fun msiGetMode(hinstall: Msihandle, erunmode: Msirunmode): Bool

public expect fun msiGetPatchFileListA(szproductcode: Pcstr, szpatchpackages: Pcstr, pcfiles: MutPtr, pphfilerecords: MutPtr): UInt

public expect fun msiGetPatchFileListW(szproductcode: Pcwstr, szpatchpackages: Pcwstr, pcfiles: MutPtr, pphfilerecords: MutPtr): UInt

public expect fun msiGetPatchInfoA(szpatch: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetPatchInfoExA(szpatchcode: Pcstr, szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, lpvalue: Pstr, pcchvalue: MutPtr): UInt

public expect fun msiGetPatchInfoExW(szpatchcode: Pcwstr, szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, lpvalue: Pwstr, pcchvalue: MutPtr): UInt

public expect fun msiGetPatchInfoW(szpatch: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetProductCodeA(szcomponent: Pcstr, lpbuf39: Pstr): UInt

public expect fun msiGetProductCodeW(szcomponent: Pcwstr, lpbuf39: Pwstr): UInt

public expect fun msiGetProductInfoA(szproduct: Pcstr, szattribute: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetProductInfoExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr): UInt

public expect fun msiGetProductInfoExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr): UInt

public expect fun msiGetProductInfoFromScriptA(szscriptfile: Pcstr, lpproductbuf39: Pstr, plgidlanguage: MutPtr, pdwversion: MutPtr, lpnamebuf: Pstr, pcchnamebuf: MutPtr, lppackagebuf: Pstr, pcchpackagebuf: MutPtr): UInt

public expect fun msiGetProductInfoFromScriptW(szscriptfile: Pcwstr, lpproductbuf39: Pwstr, plgidlanguage: MutPtr, pdwversion: MutPtr, lpnamebuf: Pwstr, pcchnamebuf: MutPtr, lppackagebuf: Pwstr, pcchpackagebuf: MutPtr): UInt

public expect fun msiGetProductInfoW(szproduct: Pcwstr, szattribute: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetProductPropertyA(hproduct: Msihandle, szproperty: Pcstr, lpvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetProductPropertyW(hproduct: Msihandle, szproperty: Pcwstr, lpvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetPropertyA(hinstall: Msihandle, szname: Pcstr, szvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiGetShortcutTargetA(szshortcutpath: Pcstr, szproductcode: Pstr, szfeatureid: Pstr, szcomponentcode: Pstr): UInt

public expect fun msiGetShortcutTargetW(szshortcutpath: Pcwstr, szproductcode: Pwstr, szfeatureid: Pwstr, szcomponentcode: Pwstr): UInt

public expect fun msiGetSourcePathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr): UInt

public expect fun msiGetSourcePathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr): UInt

public expect fun msiGetSummaryInformationA(hdatabase: Msihandle, szdatabasepath: Pcstr, uiupdatecount: UInt, phsummaryinfo: MutPtr): UInt

public expect fun msiGetSummaryInformationW(hdatabase: Msihandle, szdatabasepath: Pcwstr, uiupdatecount: UInt, phsummaryinfo: MutPtr): UInt

public expect fun msiGetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szpathbuf: Pstr, pcchpathbuf: MutPtr): UInt

public expect fun msiGetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szpathbuf: Pwstr, pcchpathbuf: MutPtr): UInt

public expect fun msiGetUserInfoA(szproduct: Pcstr, lpusernamebuf: Pstr, pcchusernamebuf: MutPtr, lporgnamebuf: Pstr, pcchorgnamebuf: MutPtr, lpserialbuf: Pstr, pcchserialbuf: MutPtr): Userinfostate

public expect fun msiGetUserInfoW(szproduct: Pcwstr, lpusernamebuf: Pwstr, pcchusernamebuf: MutPtr, lporgnamebuf: Pwstr, pcchorgnamebuf: MutPtr, lpserialbuf: Pwstr, pcchserialbuf: MutPtr): Userinfostate

public expect fun msiInstallMissingComponentA(szproduct: Pcstr, szcomponent: Pcstr, einstallstate: Installstate): UInt

public expect fun msiInstallMissingComponentW(szproduct: Pcwstr, szcomponent: Pcwstr, einstallstate: Installstate): UInt

public expect fun msiInstallMissingFileA(szproduct: Pcstr, szfile: Pcstr): UInt

public expect fun msiInstallMissingFileW(szproduct: Pcwstr, szfile: Pcwstr): UInt

public expect fun msiInstallProductA(szpackagepath: Pcstr, szcommandline: Pcstr): UInt

public expect fun msiInstallProductW(szpackagepath: Pcwstr, szcommandline: Pcwstr): UInt

public expect fun msiIsProductElevatedA(szproduct: Pcstr, pfelevated: MutPtr): UInt

public expect fun msiIsProductElevatedW(szproduct: Pcwstr, pfelevated: MutPtr): UInt

public expect fun msiJoinTransaction(htransactionhandle: Msihandle, dwtransactionattributes: UInt, phchangeofownerevent: MutPtr): UInt

public expect fun msiLocateComponentA(szcomponent: Pcstr, lppathbuf: Pstr, pcchbuf: MutPtr): Installstate

public expect fun msiLocateComponentW(szcomponent: Pcwstr, lppathbuf: Pwstr, pcchbuf: MutPtr): Installstate

public expect fun msiNotifySidChangeA(poldsid: Pcstr, pnewsid: Pcstr): UInt

public expect fun msiNotifySidChangeW(poldsid: Pcwstr, pnewsid: Pcwstr): UInt

public expect fun msiOpenDatabaseA(szdatabasepath: Pcstr, szpersist: Pcstr, phdatabase: MutPtr): UInt

public expect fun msiOpenDatabaseW(szdatabasepath: Pcwstr, szpersist: Pcwstr, phdatabase: MutPtr): UInt

public expect fun msiOpenPackageA(szpackagepath: Pcstr, hproduct: MutPtr): UInt

public expect fun msiOpenPackageExA(szpackagepath: Pcstr, dwoptions: UInt, hproduct: MutPtr): UInt

public expect fun msiOpenPackageExW(szpackagepath: Pcwstr, dwoptions: UInt, hproduct: MutPtr): UInt

public expect fun msiOpenPackageW(szpackagepath: Pcwstr, hproduct: MutPtr): UInt

public expect fun msiOpenProductA(szproduct: Pcstr, hproduct: MutPtr): UInt

public expect fun msiOpenProductW(szproduct: Pcwstr, hproduct: MutPtr): UInt

public expect fun msiPreviewBillboardA(hpreview: Msihandle, szcontrolname: Pcstr, szbillboard: Pcstr): UInt

public expect fun msiPreviewBillboardW(hpreview: Msihandle, szcontrolname: Pcwstr, szbillboard: Pcwstr): UInt

public expect fun msiPreviewDialogA(hpreview: Msihandle, szdialogname: Pcstr): UInt

public expect fun msiPreviewDialogW(hpreview: Msihandle, szdialogname: Pcwstr): UInt

public expect fun msiProcessAdvertiseScriptA(szscriptfile: Pcstr, sziconfolder: Pcstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt

public expect fun msiProcessAdvertiseScriptW(szscriptfile: Pcwstr, sziconfolder: Pcwstr, hregdata: Hkey, fshortcuts: Bool, fremoveitems: Bool): UInt

public expect fun msiProcessMessage(hinstall: Msihandle, emessagetype: Installmessage, hrecord: Msihandle): Int

public expect fun msiProvideAssemblyA(szassemblyname: Pcstr, szappcontext: Pcstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt

public expect fun msiProvideAssemblyW(szassemblyname: Pcwstr, szappcontext: Pcwstr, dwinstallmode: UInt, dwassemblyinfo: Msiassemblyinfo, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt

public expect fun msiProvideComponentA(szproduct: Pcstr, szfeature: Pcstr, szcomponent: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt

public expect fun msiProvideComponentW(szproduct: Pcwstr, szfeature: Pcwstr, szcomponent: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt

public expect fun msiProvideQualifiedComponentA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt

public expect fun msiProvideQualifiedComponentExA(szcategory: Pcstr, szqualifier: Pcstr, dwinstallmode: UInt, szproduct: Pcstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pstr, pcchpathbuf: MutPtr): UInt

public expect fun msiProvideQualifiedComponentExW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, szproduct: Pcwstr, dwunused1: UInt, dwunused2: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt

public expect fun msiProvideQualifiedComponentW(szcategory: Pcwstr, szqualifier: Pcwstr, dwinstallmode: UInt, lppathbuf: Pwstr, pcchpathbuf: MutPtr): UInt

public expect fun msiQueryComponentStateA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcstr, pdwstate: MutPtr): UInt

public expect fun msiQueryComponentStateW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szcomponentcode: Pcwstr, pdwstate: MutPtr): UInt

public expect fun msiQueryFeatureStateA(szproduct: Pcstr, szfeature: Pcstr): Installstate

public expect fun msiQueryFeatureStateExA(szproductcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, szfeature: Pcstr, pdwstate: MutPtr): UInt

public expect fun msiQueryFeatureStateExW(szproductcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, szfeature: Pcwstr, pdwstate: MutPtr): UInt

public expect fun msiQueryFeatureStateW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate

public expect fun msiQueryProductStateA(szproduct: Pcstr): Installstate

public expect fun msiQueryProductStateW(szproduct: Pcwstr): Installstate

public expect fun msiRecordClearData(hrecord: Msihandle): UInt

public expect fun msiRecordDataSize(hrecord: Msihandle, ifield: UInt): UInt

public expect fun msiRecordGetFieldCount(hrecord: Msihandle): UInt

public expect fun msiRecordGetInteger(hrecord: Msihandle, ifield: UInt): Int

public expect fun msiRecordGetStringA(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiRecordGetStringW(hrecord: Msihandle, ifield: UInt, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiRecordIsNull(hrecord: Msihandle, ifield: UInt): Bool

public expect fun msiRecordReadStream(hrecord: Msihandle, ifield: UInt, szdatabuf: Pstr, pcbdatabuf: MutPtr): UInt

public expect fun msiRecordSetInteger(hrecord: Msihandle, ifield: UInt, ivalue: Int): UInt

public expect fun msiRecordSetStreamA(hrecord: Msihandle, ifield: UInt, szfilepath: Pcstr): UInt

public expect fun msiRecordSetStreamW(hrecord: Msihandle, ifield: UInt, szfilepath: Pcwstr): UInt

public expect fun msiRecordSetStringA(hrecord: Msihandle, ifield: UInt, szvalue: Pcstr): UInt

public expect fun msiRecordSetStringW(hrecord: Msihandle, ifield: UInt, szvalue: Pcwstr): UInt

public expect fun msiReinstallFeatureA(szproduct: Pcstr, szfeature: Pcstr, dwreinstallmode: UInt): UInt

public expect fun msiReinstallFeatureW(szproduct: Pcwstr, szfeature: Pcwstr, dwreinstallmode: UInt): UInt

public expect fun msiReinstallProductA(szproduct: Pcstr, szreinstallmode: UInt): UInt

public expect fun msiReinstallProductW(szproduct: Pcwstr, szreinstallmode: UInt): UInt

public expect fun msiRemovePatchesA(szpatchlist: Pcstr, szproductcode: Pcstr, euninstalltype: Installtype, szpropertylist: Pcstr): UInt

public expect fun msiRemovePatchesW(szpatchlist: Pcwstr, szproductcode: Pcwstr, euninstalltype: Installtype, szpropertylist: Pcwstr): UInt

public expect fun msiSequenceA(hinstall: Msihandle, sztable: Pcstr, isequencemode: Int): UInt

public expect fun msiSequenceW(hinstall: Msihandle, sztable: Pcwstr, isequencemode: Int): UInt

public expect fun msiSetComponentStateA(hinstall: Msihandle, szcomponent: Pcstr, istate: Installstate): UInt

public expect fun msiSetComponentStateW(hinstall: Msihandle, szcomponent: Pcwstr, istate: Installstate): UInt

public expect fun msiSetExternalUIA(puihandler: InstalluiHandlera, dwmessagefilter: UInt, pvcontext: ConstPtr): InstalluiHandlera

public expect fun msiSetExternalUIRecord(puihandler: PinstalluiHandlerRecord, dwmessagefilter: UInt, pvcontext: ConstPtr, ppuiprevhandler: PinstalluiHandlerRecord): UInt

public expect fun msiSetExternalUIW(puihandler: InstalluiHandlerw, dwmessagefilter: UInt, pvcontext: ConstPtr): InstalluiHandlerw

public expect fun msiSetFeatureAttributesA(hinstall: Msihandle, szfeature: Pcstr, dwattributes: UInt): UInt

public expect fun msiSetFeatureAttributesW(hinstall: Msihandle, szfeature: Pcwstr, dwattributes: UInt): UInt

public expect fun msiSetFeatureStateA(hinstall: Msihandle, szfeature: Pcstr, istate: Installstate): UInt

public expect fun msiSetFeatureStateW(hinstall: Msihandle, szfeature: Pcwstr, istate: Installstate): UInt

public expect fun msiSetInstallLevel(hinstall: Msihandle, iinstalllevel: Int): UInt

public expect fun msiSetInternalUI(dwuilevel: Installuilevel, phwnd: MutPtr): Installuilevel

public expect fun msiSetMode(hinstall: Msihandle, erunmode: Msirunmode, fstate: Bool): UInt

public expect fun msiSetPropertyA(hinstall: Msihandle, szname: Pcstr, szvalue: Pcstr): UInt

public expect fun msiSetPropertyW(hinstall: Msihandle, szname: Pcwstr, szvalue: Pcwstr): UInt

public expect fun msiSetTargetPathA(hinstall: Msihandle, szfolder: Pcstr, szfolderpath: Pcstr): UInt

public expect fun msiSetTargetPathW(hinstall: Msihandle, szfolder: Pcwstr, szfolderpath: Pcwstr): UInt

public expect fun msiSourceListAddMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcstr, szdiskprompt: Pcstr): UInt

public expect fun msiSourceListAddMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt, szvolumelabel: Pcwstr, szdiskprompt: Pcwstr): UInt

public expect fun msiSourceListAddSourceA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt, szsource: Pcstr): UInt

public expect fun msiSourceListAddSourceExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr, dwindex: UInt): UInt

public expect fun msiSourceListAddSourceExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr, dwindex: UInt): UInt

public expect fun msiSourceListAddSourceW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt, szsource: Pcwstr): UInt

public expect fun msiSourceListClearAllA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt

public expect fun msiSourceListClearAllExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt

public expect fun msiSourceListClearAllExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt

public expect fun msiSourceListClearAllW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt

public expect fun msiSourceListClearMediaDiskA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt

public expect fun msiSourceListClearMediaDiskW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwdiskid: UInt): UInt

public expect fun msiSourceListClearSourceA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcstr): UInt

public expect fun msiSourceListClearSourceW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szsource: Pcwstr): UInt

public expect fun msiSourceListEnumMediaDisksA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr, szvolumelabel: Pstr, pcchvolumelabel: MutPtr, szdiskprompt: Pstr, pcchdiskprompt: MutPtr): UInt

public expect fun msiSourceListEnumMediaDisksW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, pdwdiskid: MutPtr, szvolumelabel: Pwstr, pcchvolumelabel: MutPtr, szdiskprompt: Pwstr, pcchdiskprompt: MutPtr): UInt

public expect fun msiSourceListEnumSourcesA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pstr, pcchsource: MutPtr): UInt

public expect fun msiSourceListEnumSourcesW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, dwindex: UInt, szsource: Pwstr, pcchsource: MutPtr): UInt

public expect fun msiSourceListForceResolutionA(szproduct: Pcstr, szusername: Pcstr, dwreserved: UInt): UInt

public expect fun msiSourceListForceResolutionExA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt

public expect fun msiSourceListForceResolutionExW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt): UInt

public expect fun msiSourceListForceResolutionW(szproduct: Pcwstr, szusername: Pcwstr, dwreserved: UInt): UInt

public expect fun msiSourceListGetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pstr, pcchvalue: MutPtr): UInt

public expect fun msiSourceListGetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pwstr, pcchvalue: MutPtr): UInt

public expect fun msiSourceListSetInfoA(szproductcodeorpatchcode: Pcstr, szusersid: Pcstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcstr, szvalue: Pcstr): UInt

public expect fun msiSourceListSetInfoW(szproductcodeorpatchcode: Pcwstr, szusersid: Pcwstr, dwcontext: Msiinstallcontext, dwoptions: UInt, szproperty: Pcwstr, szvalue: Pcwstr): UInt

public expect fun msiSummaryInfoGetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr, pivalue: MutPtr, pftvalue: MutPtr, szvaluebuf: Pstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiSummaryInfoGetPropertyCount(hsummaryinfo: Msihandle, puipropertycount: MutPtr): UInt

public expect fun msiSummaryInfoGetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, puidatatype: MutPtr, pivalue: MutPtr, pftvalue: MutPtr, szvaluebuf: Pwstr, pcchvaluebuf: MutPtr): UInt

public expect fun msiSummaryInfoPersist(hsummaryinfo: Msihandle): UInt

public expect fun msiSummaryInfoSetPropertyA(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr, szvalue: Pcstr): UInt

public expect fun msiSummaryInfoSetPropertyW(hsummaryinfo: Msihandle, uiproperty: UInt, uidatatype: UInt, ivalue: Int, pftvalue: MutPtr, szvalue: Pcwstr): UInt

public expect fun msiUseFeatureA(szproduct: Pcstr, szfeature: Pcstr): Installstate

public expect fun msiUseFeatureExA(szproduct: Pcstr, szfeature: Pcstr, dwinstallmode: UInt, dwreserved: UInt): Installstate

public expect fun msiUseFeatureExW(szproduct: Pcwstr, szfeature: Pcwstr, dwinstallmode: UInt, dwreserved: UInt): Installstate

public expect fun msiUseFeatureW(szproduct: Pcwstr, szfeature: Pcwstr): Installstate

public expect fun msiVerifyDiskSpace(hinstall: Msihandle): UInt

public expect fun msiVerifyPackageA(szpackagepath: Pcstr): UInt

public expect fun msiVerifyPackageW(szpackagepath: Pcwstr): UInt

public expect fun msiViewClose(hview: Msihandle): UInt

public expect fun msiViewExecute(hview: Msihandle, hrecord: Msihandle): UInt

public expect fun msiViewFetch(hview: Msihandle, phrecord: MutPtr): UInt

public expect fun msiViewGetColumnInfo(hview: Msihandle, ecolumninfo: Msicolinfo, phrecord: MutPtr): UInt

public expect fun msiViewGetErrorA(hview: Msihandle, szcolumnnamebuffer: Pstr, pcchbuf: MutPtr): Msidberror

public expect fun msiViewGetErrorW(hview: Msihandle, szcolumnnamebuffer: Pwstr, pcchbuf: MutPtr): Msidberror

public expect fun msiViewModify(hview: Msihandle, emodifymode: Msimodify, hrecord: Msihandle): UInt

public expect fun normalizeFileForPatchSignature(filebuffer: MutPtr, filesize: UInt, optionflags: UInt, optiondata: ConstPtr, newfilecoffbase: UInt, newfilecofftime: UInt, ignorerangecount: UInt, ignorerangearray: ConstPtr, retainrangecount: UInt, retainrangearray: ConstPtr): Int

public expect fun queryActCtxSettingsW(dwflags: UInt, hactctx: Handle, settingsnamespace: Pcwstr, settingname: Pcwstr, pvbuffer: Pwstr, dwbuffer: ULong, pdwwrittenorrequired: MutPtr): Bool

public expect fun queryActCtxW(dwflags: UInt, hactctx: Handle, pvsubinstance: ConstPtr, ulinfoclass: UInt, pvbuffer: MutPtr, cbbuffer: ULong, pcbwrittenorrequired: MutPtr): Bool

public expect fun releaseActCtx(hactctx: Handle)

public expect fun sfcGetNextProtectedFile(rpchandle: Handle, protfiledata: MutPtr): Bool

public expect fun sfcIsFileProtected(rpchandle: Handle, protfilename: Pcwstr): Bool

public expect fun sfcIsKeyProtected(keyhandle: Hkey, subkeyname: Pcwstr, keysam: UInt): Bool

public expect fun sfpVerifyFile(pszfilename: Pcstr, pszerror: Pcstr, dwerrsize: UInt): Bool

public expect fun testApplyPatchToFileA(patchfilename: Pcstr, oldfilename: Pcstr, applyoptionflags: UInt): Bool

public expect fun testApplyPatchToFileByBuffers(patchfilebuffer: ConstPtr, patchfilesize: UInt, oldfilebuffer: ConstPtr, oldfilesize: UInt, newfilesize: MutPtr, applyoptionflags: UInt): Bool

public expect fun testApplyPatchToFileByHandles(patchfilehandle: Handle, oldfilehandle: Handle, applyoptionflags: UInt): Bool

public expect fun testApplyPatchToFileW(patchfilename: Pcwstr, oldfilename: Pcwstr, applyoptionflags: UInt): Bool

public expect fun zombifyActCtx(hactctx: Handle): Bool
