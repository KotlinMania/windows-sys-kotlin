package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun AddERExcludedApplicationA(szapplication: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("faultrep.dll", "AddERExcludedApplicationA", longArrayOf(szapplication)).toInt()
}

public fun AddERExcludedApplicationW(wszapplication: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("faultrep.dll", "AddERExcludedApplicationW", longArrayOf(wszapplication)).toInt()
}

public fun ReportFault(pep: Long, dwopt: UInt): EFaultRepRetVal {
    return Win32DynamicFfi.invoke("faultrep.dll", "ReportFault", longArrayOf(pep, dwopt.toLong())).toInt()
}

public fun WerAddExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerAddExcludedApplication", longArrayOf(pwzexename, ballusers.toLong())).toInt()
}

public fun WerFreeString(pwszstr: PCWSTR) {
    Win32DynamicFfi.invoke("wer.dll", "WerFreeString", longArrayOf(pwszstr))
}

public fun WerGetFlags(hprocess: HANDLE, pdwflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerGetFlags", longArrayOf(hprocess, pdwflags)).toInt()
}

public fun WerRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerRegisterAdditionalProcess", longArrayOf(processid.toLong(), captureextrainfoforthreadid.toLong())).toInt()
}

public fun WerRegisterAppLocalDump(localappdatarelativepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerRegisterAppLocalDump", longArrayOf(localappdatarelativepath)).toInt()
}

public fun WerRegisterCustomMetadata(key: PCWSTR, value: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerRegisterCustomMetadata", longArrayOf(key, value)).toInt()
}

public fun WerRegisterExcludedMemoryBlock(address: Long, size: UInt): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerRegisterExcludedMemoryBlock", longArrayOf(address, size.toLong())).toInt()
}

public fun WerRegisterFile(pwzfile: PCWSTR, regfiletype: WER_REGISTER_FILE_TYPE, dwflags: WER_FILE): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerRegisterFile", longArrayOf(pwzfile, regfiletype.toLong(), dwflags.toLong())).toInt()
}

public fun WerRegisterMemoryBlock(pvaddress: Long, dwsize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerRegisterMemoryBlock", longArrayOf(pvaddress, dwsize.toLong())).toInt()
}

public fun WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerRegisterRuntimeExceptionModule", longArrayOf(pwszoutofprocesscallbackdll, pcontext)).toInt()
}

public fun WerRemoveExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerRemoveExcludedApplication", longArrayOf(pwzexename, ballusers.toLong())).toInt()
}

public fun WerReportAddDump(hreporthandle: HREPORT, hprocess: HANDLE, hthread: HANDLE, dumptype: WER_DUMP_TYPE, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerReportAddDump", longArrayOf(hreporthandle, hprocess, hthread, dumptype.toLong(), pexceptionparam, pdumpcustomoptions, dwflags.toLong())).toInt()
}

public fun WerReportAddFile(hreporthandle: HREPORT, pwzpath: PCWSTR, repfiletype: WER_FILE_TYPE, dwfileflags: WER_FILE): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerReportAddFile", longArrayOf(hreporthandle, pwzpath, repfiletype.toLong(), dwfileflags.toLong())).toInt()
}

public fun WerReportCloseHandle(hreporthandle: HREPORT): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerReportCloseHandle", longArrayOf(hreporthandle)).toInt()
}

public fun WerReportCreate(pwzeventtype: PCWSTR, reptype: WER_REPORT_TYPE, preportinformation: Long, phreporthandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerReportCreate", longArrayOf(pwzeventtype, reptype.toLong(), preportinformation, phreporthandle)).toInt()
}

public fun WerReportHang(hwndhungapp: HWND, pwzhungapplicationname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("faultrep.dll", "WerReportHang", longArrayOf(hwndhungapp, pwzhungapplicationname)).toInt()
}

public fun WerReportSetParameter(hreporthandle: HREPORT, dwparamid: UInt, pwzname: PCWSTR, pwzvalue: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerReportSetParameter", longArrayOf(hreporthandle, dwparamid.toLong(), pwzname, pwzvalue)).toInt()
}

public fun WerReportSetUIOption(hreporthandle: HREPORT, repuitypeid: WER_REPORT_UI, pwzvalue: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerReportSetUIOption", longArrayOf(hreporthandle, repuitypeid.toLong(), pwzvalue)).toInt()
}

public fun WerReportSubmit(hreporthandle: HREPORT, consent: WER_CONSENT, dwflags: WER_SUBMIT_FLAGS, psubmitresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerReportSubmit", longArrayOf(hreporthandle, consent.toLong(), dwflags.toLong(), psubmitresult)).toInt()
}

public fun WerSetFlags(dwflags: WER_FAULT_REPORTING): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerSetFlags", longArrayOf(dwflags.toLong())).toInt()
}

public fun WerStoreClose(hreportstore: HREPORTSTORE) {
    Win32DynamicFfi.invoke("wer.dll", "WerStoreClose", longArrayOf(hreportstore))
}

public fun WerStoreGetFirstReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreGetFirstReportKey", longArrayOf(hreportstore, ppszreportkey)).toInt()
}

public fun WerStoreGetNextReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreGetNextReportKey", longArrayOf(hreportstore, ppszreportkey)).toInt()
}

public fun WerStoreGetReportCount(hreportstore: HREPORTSTORE, pdwreportcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreGetReportCount", longArrayOf(hreportstore, pdwreportcount)).toInt()
}

public fun WerStoreGetSizeOnDisk(hreportstore: HREPORTSTORE, pqwsizeinbytes: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreGetSizeOnDisk", longArrayOf(hreportstore, pqwsizeinbytes)).toInt()
}

public fun WerStoreOpen(repstoretype: REPORT_STORE_TYPES, phreportstore: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreOpen", longArrayOf(repstoretype.toLong(), phreportstore)).toInt()
}

public fun WerStorePurge(): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStorePurge", longArrayOf()).toInt()
}

public fun WerStoreQueryReportMetadataV1(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreQueryReportMetadataV1", longArrayOf(hreportstore, pszreportkey, preportmetadata)).toInt()
}

public fun WerStoreQueryReportMetadataV2(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreQueryReportMetadataV2", longArrayOf(hreportstore, pszreportkey, preportmetadata)).toInt()
}

public fun WerStoreQueryReportMetadataV3(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreQueryReportMetadataV3", longArrayOf(hreportstore, pszreportkey, preportmetadata)).toInt()
}

public fun WerStoreUploadReport(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, dwflags: UInt, psubmitresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("wer.dll", "WerStoreUploadReport", longArrayOf(hreportstore, pszreportkey, dwflags.toLong(), psubmitresult)).toInt()
}

public fun WerUnregisterAdditionalProcess(processid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerUnregisterAdditionalProcess", longArrayOf(processid.toLong())).toInt()
}

public fun WerUnregisterAppLocalDump(): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerUnregisterAppLocalDump", longArrayOf()).toInt()
}

public fun WerUnregisterCustomMetadata(key: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerUnregisterCustomMetadata", longArrayOf(key)).toInt()
}

public fun WerUnregisterExcludedMemoryBlock(address: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerUnregisterExcludedMemoryBlock", longArrayOf(address)).toInt()
}

public fun WerUnregisterFile(pwzfilepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerUnregisterFile", longArrayOf(pwzfilepath)).toInt()
}

public fun WerUnregisterMemoryBlock(pvaddress: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerUnregisterMemoryBlock", longArrayOf(pvaddress)).toInt()
}

public fun WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "WerUnregisterRuntimeExceptionModule", longArrayOf(pwszoutofprocesscallbackdll, pcontext)).toInt()
}
