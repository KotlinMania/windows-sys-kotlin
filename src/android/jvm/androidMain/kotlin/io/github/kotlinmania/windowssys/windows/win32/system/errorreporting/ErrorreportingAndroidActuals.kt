@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32SystemErrorreportingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationA(szapplication: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationW(wszapplication: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_ReportFault(pep: Long, dwopt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerAddExcludedApplication(pwzexename: Long, ballusers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerFreeString(pwszstr: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerGetFlags(hprocess: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRegisterAdditionalProcess(processid: Int, captureextrainfoforthreadid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRegisterAppLocalDump(localappdatarelativepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRegisterCustomMetadata(key: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRegisterExcludedMemoryBlock(address: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRegisterFile(pwzfile: Long, regfiletype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRegisterMemoryBlock(pvaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerRemoveExcludedApplication(pwzexename: Long, ballusers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportAddDump(hreporthandle: Long, hprocess: Long, hthread: Long, dumptype: Int, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportAddFile(hreporthandle: Long, pwzpath: Long, repfiletype: Int, dwfileflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportCloseHandle(hreporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportCreate(pwzeventtype: Long, reptype: Int, preportinformation: Long, phreporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportHang(hwndhungapp: Long, pwzhungapplicationname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportSetParameter(hreporthandle: Long, dwparamid: Int, pwzname: Long, pwzvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportSetUIOption(hreporthandle: Long, repuitypeid: Int, pwzvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerReportSubmit(hreporthandle: Long, consent: Int, dwflags: Int, psubmitresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerSetFlags(dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreClose(hreportstore: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreGetFirstReportKey(hreportstore: Long, ppszreportkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreGetNextReportKey(hreportstore: Long, ppszreportkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreGetReportCount(hreportstore: Long, pdwreportcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreGetSizeOnDisk(hreportstore: Long, pqwsizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreOpen(repstoretype: Int, phreportstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStorePurge(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV1(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV2(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV3(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerStoreUploadReport(hreportstore: Long, pszreportkey: Long, dwflags: Int, psubmitresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerUnregisterAdditionalProcess(processid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerUnregisterAppLocalDump(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerUnregisterCustomMetadata(key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerUnregisterExcludedMemoryBlock(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerUnregisterFile(pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerUnregisterMemoryBlock(pvaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Long, pcontext: Long): Int
}

public actual fun AddERExcludedApplicationA(szapplication: PCSTR): BOOL =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationA(szapplication)

public actual fun AddERExcludedApplicationW(wszapplication: PCWSTR): BOOL =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationW(wszapplication)

public actual fun ReportFault(pep: Long, dwopt: UInt): EFaultRepRetVal =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_ReportFault(pep, dwopt.toInt())

public actual fun WerAddExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerAddExcludedApplication(pwzexename, ballusers)

public actual fun WerFreeString(pwszstr: PCWSTR) {
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerFreeString(pwszstr)
}

public actual fun WerGetFlags(hprocess: HANDLE, pdwflags: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerGetFlags(hprocess, pdwflags)

public actual fun WerRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt())

public actual fun WerRegisterAppLocalDump(localappdatarelativepath: PCWSTR): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRegisterAppLocalDump(localappdatarelativepath)

public actual fun WerRegisterCustomMetadata(key: PCWSTR, value: PCWSTR): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRegisterCustomMetadata(key, value)

public actual fun WerRegisterExcludedMemoryBlock(address: Long, size: UInt): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRegisterExcludedMemoryBlock(address, size.toInt())

public actual fun WerRegisterFile(pwzfile: PCWSTR, regfiletype: WER_REGISTER_FILE_TYPE, dwflags: WER_FILE): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRegisterFile(pwzfile, regfiletype, dwflags.toInt())

public actual fun WerRegisterMemoryBlock(pvaddress: Long, dwsize: UInt): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRegisterMemoryBlock(pvaddress, dwsize.toInt())

public actual fun WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll, pcontext)

public actual fun WerRemoveExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerRemoveExcludedApplication(pwzexename, ballusers)

public actual fun WerReportAddDump(hreporthandle: HREPORT, hprocess: HANDLE, hthread: HANDLE, dumptype: WER_DUMP_TYPE, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: UInt): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportAddDump(hreporthandle, hprocess, hthread, dumptype, pexceptionparam, pdumpcustomoptions, dwflags.toInt())

public actual fun WerReportAddFile(hreporthandle: HREPORT, pwzpath: PCWSTR, repfiletype: WER_FILE_TYPE, dwfileflags: WER_FILE): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportAddFile(hreporthandle, pwzpath, repfiletype, dwfileflags.toInt())

public actual fun WerReportCloseHandle(hreporthandle: HREPORT): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportCloseHandle(hreporthandle)

public actual fun WerReportCreate(pwzeventtype: PCWSTR, reptype: WER_REPORT_TYPE, preportinformation: Long, phreporthandle: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportCreate(pwzeventtype, reptype, preportinformation, phreporthandle)

public actual fun WerReportHang(hwndhungapp: HWND, pwzhungapplicationname: PCWSTR): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportHang(hwndhungapp, pwzhungapplicationname)

public actual fun WerReportSetParameter(hreporthandle: HREPORT, dwparamid: UInt, pwzname: PCWSTR, pwzvalue: PCWSTR): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportSetParameter(hreporthandle, dwparamid.toInt(), pwzname, pwzvalue)

public actual fun WerReportSetUIOption(hreporthandle: HREPORT, repuitypeid: WER_REPORT_UI, pwzvalue: PCWSTR): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportSetUIOption(hreporthandle, repuitypeid, pwzvalue)

public actual fun WerReportSubmit(hreporthandle: HREPORT, consent: WER_CONSENT, dwflags: WER_SUBMIT_FLAGS, psubmitresult: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerReportSubmit(hreporthandle, consent, dwflags.toInt(), psubmitresult)

public actual fun WerSetFlags(dwflags: WER_FAULT_REPORTING): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerSetFlags(dwflags.toInt())

public actual fun WerStoreClose(hreportstore: HREPORTSTORE) {
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreClose(hreportstore)
}

public actual fun WerStoreGetFirstReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreGetFirstReportKey(hreportstore, ppszreportkey)

public actual fun WerStoreGetNextReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreGetNextReportKey(hreportstore, ppszreportkey)

public actual fun WerStoreGetReportCount(hreportstore: HREPORTSTORE, pdwreportcount: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreGetReportCount(hreportstore, pdwreportcount)

public actual fun WerStoreGetSizeOnDisk(hreportstore: HREPORTSTORE, pqwsizeinbytes: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreGetSizeOnDisk(hreportstore, pqwsizeinbytes)

public actual fun WerStoreOpen(repstoretype: REPORT_STORE_TYPES, phreportstore: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreOpen(repstoretype, phreportstore)

public actual fun WerStorePurge(): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStorePurge()

public actual fun WerStoreQueryReportMetadataV1(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV1(hreportstore, pszreportkey, preportmetadata)

public actual fun WerStoreQueryReportMetadataV2(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV2(hreportstore, pszreportkey, preportmetadata)

public actual fun WerStoreQueryReportMetadataV3(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV3(hreportstore, pszreportkey, preportmetadata)

public actual fun WerStoreUploadReport(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, dwflags: UInt, psubmitresult: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerStoreUploadReport(hreportstore, pszreportkey, dwflags.toInt(), psubmitresult)

public actual fun WerUnregisterAdditionalProcess(processid: UInt): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerUnregisterAdditionalProcess(processid.toInt())

public actual fun WerUnregisterAppLocalDump(): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerUnregisterAppLocalDump()

public actual fun WerUnregisterCustomMetadata(key: PCWSTR): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerUnregisterCustomMetadata(key)

public actual fun WerUnregisterExcludedMemoryBlock(address: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerUnregisterExcludedMemoryBlock(address)

public actual fun WerUnregisterFile(pwzfilepath: PCWSTR): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerUnregisterFile(pwzfilepath)

public actual fun WerUnregisterMemoryBlock(pvaddress: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerUnregisterMemoryBlock(pvaddress)

public actual fun WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll, pcontext)
