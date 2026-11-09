@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32SystemErrorreportingNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AddERExcludedApplicationA(szapplication: PCSTR): BOOL =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationA(szapplication.toString()) as Int) else 0

public actual fun AddERExcludedApplicationW(wszapplication: PCWSTR): BOOL =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_AddERExcludedApplicationW(wszapplication.toString()) as Int) else 0

public actual fun ReportFault(pep: Long, dwopt: UInt): EFaultRepRetVal =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_ReportFault(pep.toString(), dwopt.toInt()) as Int) else 0

public actual fun WerAddExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerAddExcludedApplication(pwzexename.toString(), ballusers) as Int) else 0

public actual fun WerFreeString(pwszstr: PCWSTR) {
    if (_windowsWin32SystemErrorreportingNapiAddon != null) {
        _windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerFreeString(pwszstr.toString())
    }
}

public actual fun WerGetFlags(hprocess: HANDLE, pdwflags: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerGetFlags(hprocess.toString(), pdwflags.toString()) as Int) else 0

public actual fun WerRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt()) as Int) else 0

public actual fun WerRegisterAppLocalDump(localappdatarelativepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRegisterAppLocalDump(localappdatarelativepath.toString()) as Int) else 0

public actual fun WerRegisterCustomMetadata(key: PCWSTR, value: PCWSTR): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRegisterCustomMetadata(key.toString(), value.toString()) as Int) else 0

public actual fun WerRegisterExcludedMemoryBlock(address: Long, size: UInt): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRegisterExcludedMemoryBlock(address.toString(), size.toInt()) as Int) else 0

public actual fun WerRegisterFile(pwzfile: PCWSTR, regfiletype: WER_REGISTER_FILE_TYPE, dwflags: WER_FILE): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRegisterFile(pwzfile.toString(), regfiletype, dwflags.toInt()) as Int) else 0

public actual fun WerRegisterMemoryBlock(pvaddress: Long, dwsize: UInt): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRegisterMemoryBlock(pvaddress.toString(), dwsize.toInt()) as Int) else 0

public actual fun WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.toString(), pcontext.toString()) as Int) else 0

public actual fun WerRemoveExcludedApplication(pwzexename: PCWSTR, ballusers: BOOL): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerRemoveExcludedApplication(pwzexename.toString(), ballusers) as Int) else 0

public actual fun WerReportAddDump(hreporthandle: HREPORT, hprocess: HANDLE, hthread: HANDLE, dumptype: WER_DUMP_TYPE, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportAddDump(hreporthandle.toString(), hprocess.toString(), hthread.toString(), dumptype, pexceptionparam.toString(), pdumpcustomoptions.toString(), dwflags.toInt()) as Int) else 0

public actual fun WerReportAddFile(hreporthandle: HREPORT, pwzpath: PCWSTR, repfiletype: WER_FILE_TYPE, dwfileflags: WER_FILE): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportAddFile(hreporthandle.toString(), pwzpath.toString(), repfiletype, dwfileflags.toInt()) as Int) else 0

public actual fun WerReportCloseHandle(hreporthandle: HREPORT): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportCloseHandle(hreporthandle.toString()) as Int) else 0

public actual fun WerReportCreate(pwzeventtype: PCWSTR, reptype: WER_REPORT_TYPE, preportinformation: Long, phreporthandle: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportCreate(pwzeventtype.toString(), reptype, preportinformation.toString(), phreporthandle.toString()) as Int) else 0

public actual fun WerReportHang(hwndhungapp: HWND, pwzhungapplicationname: PCWSTR): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportHang(hwndhungapp.toString(), pwzhungapplicationname.toString()) as Int) else 0

public actual fun WerReportSetParameter(hreporthandle: HREPORT, dwparamid: UInt, pwzname: PCWSTR, pwzvalue: PCWSTR): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportSetParameter(hreporthandle.toString(), dwparamid.toInt(), pwzname.toString(), pwzvalue.toString()) as Int) else 0

public actual fun WerReportSetUIOption(hreporthandle: HREPORT, repuitypeid: WER_REPORT_UI, pwzvalue: PCWSTR): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportSetUIOption(hreporthandle.toString(), repuitypeid, pwzvalue.toString()) as Int) else 0

public actual fun WerReportSubmit(hreporthandle: HREPORT, consent: WER_CONSENT, dwflags: WER_SUBMIT_FLAGS, psubmitresult: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerReportSubmit(hreporthandle.toString(), consent, dwflags.toInt(), psubmitresult.toString()) as Int) else 0

public actual fun WerSetFlags(dwflags: WER_FAULT_REPORTING): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerSetFlags(dwflags.toInt()) as Int) else 0

public actual fun WerStoreClose(hreportstore: HREPORTSTORE) {
    if (_windowsWin32SystemErrorreportingNapiAddon != null) {
        _windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreClose(hreportstore.toString())
    }
}

public actual fun WerStoreGetFirstReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreGetFirstReportKey(hreportstore.toString(), ppszreportkey.toString()) as Int) else 0

public actual fun WerStoreGetNextReportKey(hreportstore: HREPORTSTORE, ppszreportkey: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreGetNextReportKey(hreportstore.toString(), ppszreportkey.toString()) as Int) else 0

public actual fun WerStoreGetReportCount(hreportstore: HREPORTSTORE, pdwreportcount: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreGetReportCount(hreportstore.toString(), pdwreportcount.toString()) as Int) else 0

public actual fun WerStoreGetSizeOnDisk(hreportstore: HREPORTSTORE, pqwsizeinbytes: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreGetSizeOnDisk(hreportstore.toString(), pqwsizeinbytes.toString()) as Int) else 0

public actual fun WerStoreOpen(repstoretype: REPORT_STORE_TYPES, phreportstore: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreOpen(repstoretype, phreportstore.toString()) as Int) else 0

public actual fun WerStorePurge(): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStorePurge() as Int) else 0

public actual fun WerStoreQueryReportMetadataV1(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV1(hreportstore.toString(), pszreportkey.toString(), preportmetadata.toString()) as Int) else 0

public actual fun WerStoreQueryReportMetadataV2(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV2(hreportstore.toString(), pszreportkey.toString(), preportmetadata.toString()) as Int) else 0

public actual fun WerStoreQueryReportMetadataV3(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, preportmetadata: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreQueryReportMetadataV3(hreportstore.toString(), pszreportkey.toString(), preportmetadata.toString()) as Int) else 0

public actual fun WerStoreUploadReport(hreportstore: HREPORTSTORE, pszreportkey: PCWSTR, dwflags: UInt, psubmitresult: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerStoreUploadReport(hreportstore.toString(), pszreportkey.toString(), dwflags.toInt(), psubmitresult.toString()) as Int) else 0

public actual fun WerUnregisterAdditionalProcess(processid: UInt): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerUnregisterAdditionalProcess(processid.toInt()) as Int) else 0

public actual fun WerUnregisterAppLocalDump(): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerUnregisterAppLocalDump() as Int) else 0

public actual fun WerUnregisterCustomMetadata(key: PCWSTR): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerUnregisterCustomMetadata(key.toString()) as Int) else 0

public actual fun WerUnregisterExcludedMemoryBlock(address: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerUnregisterExcludedMemoryBlock(address.toString()) as Int) else 0

public actual fun WerUnregisterFile(pwzfilepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerUnregisterFile(pwzfilepath.toString()) as Int) else 0

public actual fun WerUnregisterMemoryBlock(pvaddress: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerUnregisterMemoryBlock(pvaddress.toString()) as Int) else 0

public actual fun WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: PCWSTR, pcontext: Long): HRESULT =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_WerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.toString(), pcontext.toString()) as Int) else 0
