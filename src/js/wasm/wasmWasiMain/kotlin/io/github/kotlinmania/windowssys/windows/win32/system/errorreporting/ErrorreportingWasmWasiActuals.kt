@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun AddERExcludedApplicationA(szapplication: PCSTR): BOOL =
    0

public actual fun AddERExcludedApplicationW(wszapplication: PCWSTR): BOOL =
    0

public actual fun ReportFault(pep: Long, dwopt: UInt): EFaultRepRetVal =
    0

public actual fun WerAddExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    0

public actual fun WerFreeString(pwszstr: PCWSTR) {
}

public actual fun WerGetFlags(hprocess: HANDLE, pdwflags: Long): HRESULT =
    0

public actual fun WerRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): HRESULT =
    0

public actual fun WerRegisterAppLocalDump(localappdatarelativepath: PCWSTR): HRESULT =
    0

public actual fun WerRegisterCustomMetadata(key: PCWSTR, value: PCWSTR): HRESULT =
    0

public actual fun WerRegisterExcludedMemoryBlock(address: Long, size: UInt): HRESULT =
    0

public actual fun WerRegisterFile(pwzfile: PCWSTR, regfiletype: WER_REGISTER_FILE_TYPE, dwflags: WER_FILE): HRESULT =
    0

public actual fun WerRegisterMemoryBlock(pvaddress: Long, dwsize: UInt): HRESULT =
    0

public actual fun WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    0

public actual fun WerRemoveExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    0

public actual fun WerReportAddDump(hreporthandle: HREPORT, hprocess: HANDLE, hthread: HANDLE, dumptype: WER_DUMP_TYPE, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: UInt): HRESULT =
    0

public actual fun WerReportAddFile(hreporthandle: HREPORT, pwzpath: PCWSTR, repfiletype: WER_FILE_TYPE, dwfileflags: WER_FILE): HRESULT =
    0

public actual fun WerReportCloseHandle(hreporthandle: HREPORT): HRESULT =
    0

public actual fun WerReportCreate(pwzeventtype: PCWSTR, reptype: WER_REPORT_TYPE, preportinformation: Long, phreporthandle: Long): HRESULT =
    0

public actual fun WerReportHang(hwndhungapp: HWND, pwzhungapplicationname: PCWSTR): HRESULT =
    0

public actual fun WerReportSetParameter(hreporthandle: HREPORT, dwparamid: UInt, pwzname: PCWSTR, pwzvalue: PCWSTR): HRESULT =
    0

public actual fun WerReportSetUIOption(hreporthandle: HREPORT, repuitypeid: WER_REPORT_UI, pwzvalue: PCWSTR): HRESULT =
    0

public actual fun WerReportSubmit(hreporthandle: HREPORT, consent: WER_CONSENT, dwflags: WER_SUBMIT_FLAGS, psubmitresult: Long): HRESULT =
    0

public actual fun WerSetFlags(dwflags: WER_FAULT_REPORTING): HRESULT =
    0

public actual fun WerStoreClose(hreportstore: HREPORTSTORE) {
}

public actual fun WerStoreGetFirstReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    0

public actual fun WerStoreGetNextReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    0

public actual fun WerStoreGetReportCount(hreportstore: HREPORTSTORE, pdwreportcount: Long): HRESULT =
    0

public actual fun WerStoreGetSizeOnDisk(hreportstore: HREPORTSTORE, pqwsizeinbytes: Long): HRESULT =
    0

public actual fun WerStoreOpen(repstoretype: REPORT_STORE_TYPES, phreportstore: Long): HRESULT =
    0

public actual fun WerStorePurge(): HRESULT =
    0

public actual fun WerStoreQueryReportMetadataV1(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    0

public actual fun WerStoreQueryReportMetadataV2(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    0

public actual fun WerStoreQueryReportMetadataV3(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    0

public actual fun WerStoreUploadReport(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, dwflags: UInt, psubmitresult: Long): HRESULT =
    0

public actual fun WerUnregisterAdditionalProcess(processid: UInt): HRESULT =
    0

public actual fun WerUnregisterAppLocalDump(): HRESULT =
    0

public actual fun WerUnregisterCustomMetadata(key: PCWSTR): HRESULT =
    0

public actual fun WerUnregisterExcludedMemoryBlock(address: Long): HRESULT =
    0

public actual fun WerUnregisterFile(pwzfilepath: PCWSTR): HRESULT =
    0

public actual fun WerUnregisterMemoryBlock(pvaddress: Long): HRESULT =
    0

public actual fun WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    0
