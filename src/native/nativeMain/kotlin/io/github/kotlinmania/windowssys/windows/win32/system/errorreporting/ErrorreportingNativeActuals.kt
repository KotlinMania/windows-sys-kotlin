@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_reportFault
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werAddExcludedApplication
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werFreeString
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werGetFlags
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRegisterFile
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportAddDump
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportAddFile
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportCreate
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportHang
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportSetParameter
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportSetUIOption
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werReportSubmit
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werSetFlags
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreClose
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreGetReportCount
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreOpen
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStorePurge
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werStoreUploadReport
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werUnregisterFile
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA(szapplication?.value?.toCPointer<ByteVar>())

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW(wszapplication?.value?.toCPointer<ByteVar>())

public actual fun reportFault(pep: COpaquePointer?, dwopt: UInt): EFaultRepRetVal =
    windowssys_windows_win32_system_errorreporting_reportFault(pep?.value?.toCPointer<ByteVar>(), dwopt)

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    windowssys_windows_win32_system_errorreporting_werAddExcludedApplication(pwzexename?.value?.toCPointer<ByteVar>(), ballusers)

public actual fun werFreeString(pwszstr: Pcwstr) {
    windowssys_windows_win32_system_errorreporting_werFreeString(pwszstr?.value?.toCPointer<ByteVar>())
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werGetFlags(hprocess?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>())

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess(processid, captureextrainfoforthreadid)

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump(localappdatarelativepath?.value?.toCPointer<ByteVar>())

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata(key?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun werRegisterExcludedMemoryBlock(address: COpaquePointer?, size: UInt): Hresult =
    windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock(address?.value?.toCPointer<ByteVar>(), size)

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    windowssys_windows_win32_system_errorreporting_werRegisterFile(pwzfile?.value?.toCPointer<ByteVar>(), regfiletype, dwflags)

public actual fun werRegisterMemoryBlock(pvaddress: COpaquePointer?, dwsize: UInt): Hresult =
    windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock(pvaddress?.value?.toCPointer<ByteVar>(), dwsize)

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication(pwzexename?.value?.toCPointer<ByteVar>(), ballusers)

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: COpaquePointer?, pdumpcustomoptions: COpaquePointer?, dwflags: UInt): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportAddDump(hreporthandle?.value?.toCPointer<ByteVar>(), hprocess?.value?.toCPointer<ByteVar>(), hthread?.value?.toCPointer<ByteVar>(), dumptype, pexceptionparam?.value?.toCPointer<ByteVar>(), pdumpcustomoptions?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportAddFile(hreporthandle?.value?.toCPointer<ByteVar>(), pwzpath?.value?.toCPointer<ByteVar>(), repfiletype, dwfileflags)

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportCloseHandle(hreporthandle?.value?.toCPointer<ByteVar>())

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: COpaquePointer?, phreporthandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportCreate(pwzeventtype?.value?.toCPointer<ByteVar>(), reptype, preportinformation?.value?.toCPointer<ByteVar>(), phreporthandle?.value?.toCPointer<ByteVar>())

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportHang(hwndhungapp?.value?.toCPointer<ByteVar>(), pwzhungapplicationname?.value?.toCPointer<ByteVar>())

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportSetParameter(hreporthandle?.value?.toCPointer<ByteVar>(), dwparamid, pwzname?.value?.toCPointer<ByteVar>(), pwzvalue?.value?.toCPointer<ByteVar>())

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportSetUIOption(hreporthandle?.value?.toCPointer<ByteVar>(), repuitypeid, pwzvalue?.value?.toCPointer<ByteVar>())

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werReportSubmit(hreporthandle?.value?.toCPointer<ByteVar>(), consent, dwflags, psubmitresult?.value?.toCPointer<ByteVar>())

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    windowssys_windows_win32_system_errorreporting_werSetFlags(dwflags)

public actual fun werStoreClose(hreportstore: Hreportstore) {
    windowssys_windows_win32_system_errorreporting_werStoreClose(hreportstore?.value?.toCPointer<ByteVar>())
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey(hreportstore?.value?.toCPointer<ByteVar>(), ppszreportkey?.value?.toCPointer<ByteVar>())

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey(hreportstore?.value?.toCPointer<ByteVar>(), ppszreportkey?.value?.toCPointer<ByteVar>())

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreGetReportCount(hreportstore?.value?.toCPointer<ByteVar>(), pdwreportcount?.value?.toCPointer<ByteVar>())

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk(hreportstore?.value?.toCPointer<ByteVar>(), pqwsizeinbytes?.value?.toCPointer<ByteVar>())

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreOpen(repstoretype, phreportstore?.value?.toCPointer<ByteVar>())

public actual fun werStorePurge(): Hresult =
    windowssys_windows_win32_system_errorreporting_werStorePurge()

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1(hreportstore?.value?.toCPointer<ByteVar>(), pszreportkey?.value?.toCPointer<ByteVar>(), preportmetadata?.value?.toCPointer<ByteVar>())

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2(hreportstore?.value?.toCPointer<ByteVar>(), pszreportkey?.value?.toCPointer<ByteVar>(), preportmetadata?.value?.toCPointer<ByteVar>())

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3(hreportstore?.value?.toCPointer<ByteVar>(), pszreportkey?.value?.toCPointer<ByteVar>(), preportmetadata?.value?.toCPointer<ByteVar>())

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werStoreUploadReport(hreportstore?.value?.toCPointer<ByteVar>(), pszreportkey?.value?.toCPointer<ByteVar>(), dwflags, psubmitresult?.value?.toCPointer<ByteVar>())

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess(processid)

public actual fun werUnregisterAppLocalDump(): Hresult =
    windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump()

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata(key?.value?.toCPointer<ByteVar>())

public actual fun werUnregisterExcludedMemoryBlock(address: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock(address?.value?.toCPointer<ByteVar>())

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_errorreporting_werUnregisterFile(pwzfilepath?.value?.toCPointer<ByteVar>())

public actual fun werUnregisterMemoryBlock(pvaddress: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock(pvaddress?.value?.toCPointer<ByteVar>())

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())
