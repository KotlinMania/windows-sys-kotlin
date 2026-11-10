@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemErrorreportingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA(szapplication: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW(wszapplication: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_reportFault(pep: Long, dwopt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werAddExcludedApplication(pwzexename: Long, ballusers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werFreeString(pwszstr: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werGetFlags(hprocess: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess(processid: Int, captureextrainfoforthreadid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump(localappdatarelativepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata(key: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock(address: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRegisterFile(pwzfile: Long, regfiletype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock(pvaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication(pwzexename: Long, ballusers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportAddDump(hreporthandle: Long, hprocess: Long, hthread: Long, dumptype: Int, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportAddFile(hreporthandle: Long, pwzpath: Long, repfiletype: Int, dwfileflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportCloseHandle(hreporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportCreate(pwzeventtype: Long, reptype: Int, preportinformation: Long, phreporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportHang(hwndhungapp: Long, pwzhungapplicationname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportSetParameter(hreporthandle: Long, dwparamid: Int, pwzname: Long, pwzvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportSetUIOption(hreporthandle: Long, repuitypeid: Int, pwzvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werReportSubmit(hreporthandle: Long, consent: Int, dwflags: Int, psubmitresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werSetFlags(dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreClose(hreportstore: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey(hreportstore: Long, ppszreportkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey(hreportstore: Long, ppszreportkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreGetReportCount(hreportstore: Long, pdwreportcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk(hreportstore: Long, pqwsizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreOpen(repstoretype: Int, phreportstore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStorePurge(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werStoreUploadReport(hreportstore: Long, pszreportkey: Long, dwflags: Int, psubmitresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess(processid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata(key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werUnregisterFile(pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock(pvaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Long, pcontext: Long): Int
}

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA((szapplication?.value ?: 0L))

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW((wszapplication?.value ?: 0L))

public actual fun reportFault(pep: COpaquePointer?, dwopt: UInt): EFaultRepRetVal =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_reportFault((pep?.value ?: 0L), dwopt.toInt())

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werAddExcludedApplication((pwzexename?.value ?: 0L), ballusers)

public actual fun werFreeString(pwszstr: Pcwstr) {
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werFreeString((pwszstr?.value ?: 0L))
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werGetFlags((hprocess?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt())

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump((localappdatarelativepath?.value ?: 0L))

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata((key?.value ?: 0L), (value?.value ?: 0L))

public actual fun werRegisterExcludedMemoryBlock(address: COpaquePointer?, size: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock((address?.value ?: 0L), size.toInt())

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRegisterFile((pwzfile?.value ?: 0L), regfiletype, dwflags.toInt())

public actual fun werRegisterMemoryBlock(pvaddress: COpaquePointer?, dwsize: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock((pvaddress?.value ?: 0L), dwsize.toInt())

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule((pwszoutofprocesscallbackdll?.value ?: 0L), (pcontext?.value ?: 0L))

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication((pwzexename?.value ?: 0L), ballusers)

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: COpaquePointer?, pdumpcustomoptions: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportAddDump((hreporthandle?.value ?: 0L), (hprocess?.value ?: 0L), (hthread?.value ?: 0L), dumptype, (pexceptionparam?.value ?: 0L), (pdumpcustomoptions?.value ?: 0L), dwflags.toInt())

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportAddFile((hreporthandle?.value ?: 0L), (pwzpath?.value ?: 0L), repfiletype, dwfileflags.toInt())

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportCloseHandle((hreporthandle?.value ?: 0L))

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: COpaquePointer?, phreporthandle: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportCreate((pwzeventtype?.value ?: 0L), reptype, (preportinformation?.value ?: 0L), (phreporthandle?.value ?: 0L))

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportHang((hwndhungapp?.value ?: 0L), (pwzhungapplicationname?.value ?: 0L))

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportSetParameter((hreporthandle?.value ?: 0L), dwparamid.toInt(), (pwzname?.value ?: 0L), (pwzvalue?.value ?: 0L))

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportSetUIOption((hreporthandle?.value ?: 0L), repuitypeid, (pwzvalue?.value ?: 0L))

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werReportSubmit((hreporthandle?.value ?: 0L), consent, dwflags.toInt(), (psubmitresult?.value ?: 0L))

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werSetFlags(dwflags.toInt())

public actual fun werStoreClose(hreportstore: Hreportstore) {
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreClose((hreportstore?.value ?: 0L))
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey((hreportstore?.value ?: 0L), (ppszreportkey?.value ?: 0L))

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey((hreportstore?.value ?: 0L), (ppszreportkey?.value ?: 0L))

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreGetReportCount((hreportstore?.value ?: 0L), (pdwreportcount?.value ?: 0L))

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk((hreportstore?.value ?: 0L), (pqwsizeinbytes?.value ?: 0L))

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreOpen(repstoretype, (phreportstore?.value ?: 0L))

public actual fun werStorePurge(): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStorePurge()

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1((hreportstore?.value ?: 0L), (pszreportkey?.value ?: 0L), (preportmetadata?.value ?: 0L))

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2((hreportstore?.value ?: 0L), (pszreportkey?.value ?: 0L), (preportmetadata?.value ?: 0L))

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3((hreportstore?.value ?: 0L), (pszreportkey?.value ?: 0L), (preportmetadata?.value ?: 0L))

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werStoreUploadReport((hreportstore?.value ?: 0L), (pszreportkey?.value ?: 0L), dwflags.toInt(), (psubmitresult?.value ?: 0L))

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess(processid.toInt())

public actual fun werUnregisterAppLocalDump(): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump()

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata((key?.value ?: 0L))

public actual fun werUnregisterExcludedMemoryBlock(address: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock((address?.value ?: 0L))

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werUnregisterFile((pwzfilepath?.value ?: 0L))

public actual fun werUnregisterMemoryBlock(pvaddress: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock((pvaddress?.value ?: 0L))

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule((pwszoutofprocesscallbackdll?.value ?: 0L), (pcontext?.value ?: 0L))
