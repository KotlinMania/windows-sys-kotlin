package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun AddERExcludedApplicationA(szapplication: PCSTR): BOOL

public expect fun AddERExcludedApplicationW(wszapplication: PCWSTR): BOOL

public expect fun ReportFault(pep: Long, dwopt: UInt): EFaultRepRetVal

public expect fun WerAddExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT

public expect fun WerFreeString(pwszstr: PCWSTR)

public expect fun WerGetFlags(hprocess: HANDLE, pdwflags: Long): HRESULT

public expect fun WerRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): HRESULT

public expect fun WerRegisterAppLocalDump(localappdatarelativepath: PCWSTR): HRESULT

public expect fun WerRegisterCustomMetadata(key: PCWSTR, value: PCWSTR): HRESULT

public expect fun WerRegisterExcludedMemoryBlock(address: Long, size: UInt): HRESULT

public expect fun WerRegisterFile(pwzfile: PCWSTR, regfiletype: WER_REGISTER_FILE_TYPE, dwflags: WER_FILE): HRESULT

public expect fun WerRegisterMemoryBlock(pvaddress: Long, dwsize: UInt): HRESULT

public expect fun WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT

public expect fun WerRemoveExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT

public expect fun WerReportAddDump(hreporthandle: HREPORT, hprocess: HANDLE, hthread: HANDLE, dumptype: WER_DUMP_TYPE, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: UInt): HRESULT

public expect fun WerReportAddFile(hreporthandle: HREPORT, pwzpath: PCWSTR, repfiletype: WER_FILE_TYPE, dwfileflags: WER_FILE): HRESULT

public expect fun WerReportCloseHandle(hreporthandle: HREPORT): HRESULT

public expect fun WerReportCreate(pwzeventtype: PCWSTR, reptype: WER_REPORT_TYPE, preportinformation: Long, phreporthandle: Long): HRESULT

public expect fun WerReportHang(hwndhungapp: HWND, pwzhungapplicationname: PCWSTR): HRESULT

public expect fun WerReportSetParameter(hreporthandle: HREPORT, dwparamid: UInt, pwzname: PCWSTR, pwzvalue: PCWSTR): HRESULT

public expect fun WerReportSetUIOption(hreporthandle: HREPORT, repuitypeid: WER_REPORT_UI, pwzvalue: PCWSTR): HRESULT

public expect fun WerReportSubmit(hreporthandle: HREPORT, consent: WER_CONSENT, dwflags: WER_SUBMIT_FLAGS, psubmitresult: Long): HRESULT

public expect fun WerSetFlags(dwflags: WER_FAULT_REPORTING): HRESULT

public expect fun WerStoreClose(hreportstore: HREPORTSTORE)

public expect fun WerStoreGetFirstReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT

public expect fun WerStoreGetNextReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT

public expect fun WerStoreGetReportCount(hreportstore: HREPORTSTORE, pdwreportcount: Long): HRESULT

public expect fun WerStoreGetSizeOnDisk(hreportstore: HREPORTSTORE, pqwsizeinbytes: Long): HRESULT

public expect fun WerStoreOpen(repstoretype: REPORT_STORE_TYPES, phreportstore: Long): HRESULT

public expect fun WerStorePurge(): HRESULT

public expect fun WerStoreQueryReportMetadataV1(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT

public expect fun WerStoreQueryReportMetadataV2(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT

public expect fun WerStoreQueryReportMetadataV3(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT

public expect fun WerStoreUploadReport(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, dwflags: UInt, psubmitresult: Long): HRESULT

public expect fun WerUnregisterAdditionalProcess(processid: UInt): HRESULT

public expect fun WerUnregisterAppLocalDump(): HRESULT

public expect fun WerUnregisterCustomMetadata(key: PCWSTR): HRESULT

public expect fun WerUnregisterExcludedMemoryBlock(address: Long): HRESULT

public expect fun WerUnregisterFile(pwzfilepath: PCWSTR): HRESULT

public expect fun WerUnregisterMemoryBlock(pvaddress: Long): HRESULT

public expect fun WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT
