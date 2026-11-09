@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AddERExcludedApplicationA(szapplication: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationA(szapplication.toCPointer<ByteVar>())

public actual fun AddERExcludedApplicationW(wszapplication: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationW(wszapplication.toCPointer<ByteVar>())

public actual fun ReportFault(pep: Long, dwopt: UInt): EFaultRepRetVal =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_ReportFault(pep.toCPointer<ByteVar>(), dwopt)

public actual fun WerAddExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerAddExcludedApplication(pwzexename.toCPointer<ByteVar>(), ballusers)

public actual fun WerFreeString(pwszstr: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerFreeString(pwszstr.toCPointer<ByteVar>())
}

public actual fun WerGetFlags(hprocess: HANDLE, pdwflags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerGetFlags(hprocess.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun WerRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRegisterAdditionalProcess(processid, captureextrainfoforthreadid)

public actual fun WerRegisterAppLocalDump(localappdatarelativepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRegisterAppLocalDump(localappdatarelativepath.toCPointer<ByteVar>())

public actual fun WerRegisterCustomMetadata(key: PCWSTR, value: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRegisterCustomMetadata(key.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun WerRegisterExcludedMemoryBlock(address: Long, size: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRegisterExcludedMemoryBlock(address.toCPointer<ByteVar>(), size)

public actual fun WerRegisterFile(pwzfile: PCWSTR, regfiletype: WER_REGISTER_FILE_TYPE, dwflags: WER_FILE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRegisterFile(pwzfile.toCPointer<ByteVar>(), regfiletype, dwflags)

public actual fun WerRegisterMemoryBlock(pvaddress: Long, dwsize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRegisterMemoryBlock(pvaddress.toCPointer<ByteVar>(), dwsize)

public actual fun WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun WerRemoveExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerRemoveExcludedApplication(pwzexename.toCPointer<ByteVar>(), ballusers)

public actual fun WerReportAddDump(hreporthandle: HREPORT, hprocess: HANDLE, hthread: HANDLE, dumptype: WER_DUMP_TYPE, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportAddDump(hreporthandle.toCPointer<ByteVar>(), hprocess.toCPointer<ByteVar>(), hthread.toCPointer<ByteVar>(), dumptype, pexceptionparam.toCPointer<ByteVar>(), pdumpcustomoptions.toCPointer<ByteVar>(), dwflags)

public actual fun WerReportAddFile(hreporthandle: HREPORT, pwzpath: PCWSTR, repfiletype: WER_FILE_TYPE, dwfileflags: WER_FILE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportAddFile(hreporthandle.toCPointer<ByteVar>(), pwzpath.toCPointer<ByteVar>(), repfiletype, dwfileflags)

public actual fun WerReportCloseHandle(hreporthandle: HREPORT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportCloseHandle(hreporthandle.toCPointer<ByteVar>())

public actual fun WerReportCreate(pwzeventtype: PCWSTR, reptype: WER_REPORT_TYPE, preportinformation: Long, phreporthandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportCreate(pwzeventtype.toCPointer<ByteVar>(), reptype, preportinformation.toCPointer<ByteVar>(), phreporthandle.toCPointer<ByteVar>())

public actual fun WerReportHang(hwndhungapp: HWND, pwzhungapplicationname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportHang(hwndhungapp.toCPointer<ByteVar>(), pwzhungapplicationname.toCPointer<ByteVar>())

public actual fun WerReportSetParameter(hreporthandle: HREPORT, dwparamid: UInt, pwzname: PCWSTR, pwzvalue: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportSetParameter(hreporthandle.toCPointer<ByteVar>(), dwparamid, pwzname.toCPointer<ByteVar>(), pwzvalue.toCPointer<ByteVar>())

public actual fun WerReportSetUIOption(hreporthandle: HREPORT, repuitypeid: WER_REPORT_UI, pwzvalue: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportSetUIOption(hreporthandle.toCPointer<ByteVar>(), repuitypeid, pwzvalue.toCPointer<ByteVar>())

public actual fun WerReportSubmit(hreporthandle: HREPORT, consent: WER_CONSENT, dwflags: WER_SUBMIT_FLAGS, psubmitresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerReportSubmit(hreporthandle.toCPointer<ByteVar>(), consent, dwflags, psubmitresult.toCPointer<ByteVar>())

public actual fun WerSetFlags(dwflags: WER_FAULT_REPORTING): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerSetFlags(dwflags)

public actual fun WerStoreClose(hreportstore: HREPORTSTORE) {
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreClose(hreportstore.toCPointer<ByteVar>())
}

public actual fun WerStoreGetFirstReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreGetFirstReportKey(hreportstore.toCPointer<ByteVar>(), ppszreportkey.toCPointer<ByteVar>())

public actual fun WerStoreGetNextReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreGetNextReportKey(hreportstore.toCPointer<ByteVar>(), ppszreportkey.toCPointer<ByteVar>())

public actual fun WerStoreGetReportCount(hreportstore: HREPORTSTORE, pdwreportcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreGetReportCount(hreportstore.toCPointer<ByteVar>(), pdwreportcount.toCPointer<ByteVar>())

public actual fun WerStoreGetSizeOnDisk(hreportstore: HREPORTSTORE, pqwsizeinbytes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreGetSizeOnDisk(hreportstore.toCPointer<ByteVar>(), pqwsizeinbytes.toCPointer<ByteVar>())

public actual fun WerStoreOpen(repstoretype: REPORT_STORE_TYPES, phreportstore: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreOpen(repstoretype, phreportstore.toCPointer<ByteVar>())

public actual fun WerStorePurge(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStorePurge()

public actual fun WerStoreQueryReportMetadataV1(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV1(hreportstore.toCPointer<ByteVar>(), pszreportkey.toCPointer<ByteVar>(), preportmetadata.toCPointer<ByteVar>())

public actual fun WerStoreQueryReportMetadataV2(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV2(hreportstore.toCPointer<ByteVar>(), pszreportkey.toCPointer<ByteVar>(), preportmetadata.toCPointer<ByteVar>())

public actual fun WerStoreQueryReportMetadataV3(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV3(hreportstore.toCPointer<ByteVar>(), pszreportkey.toCPointer<ByteVar>(), preportmetadata.toCPointer<ByteVar>())

public actual fun WerStoreUploadReport(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, dwflags: UInt, psubmitresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerStoreUploadReport(hreportstore.toCPointer<ByteVar>(), pszreportkey.toCPointer<ByteVar>(), dwflags, psubmitresult.toCPointer<ByteVar>())

public actual fun WerUnregisterAdditionalProcess(processid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerUnregisterAdditionalProcess(processid)

public actual fun WerUnregisterAppLocalDump(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerUnregisterAppLocalDump()

public actual fun WerUnregisterCustomMetadata(key: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerUnregisterCustomMetadata(key.toCPointer<ByteVar>())

public actual fun WerUnregisterExcludedMemoryBlock(address: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerUnregisterExcludedMemoryBlock(address.toCPointer<ByteVar>())

public actual fun WerUnregisterFile(pwzfilepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerUnregisterFile(pwzfilepath.toCPointer<ByteVar>())

public actual fun WerUnregisterMemoryBlock(pvaddress: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerUnregisterMemoryBlock(pvaddress.toCPointer<ByteVar>())

public actual fun WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())
