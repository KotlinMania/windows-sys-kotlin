@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionPointers
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingReportFault
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerFreeString
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerGetFlags
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRegisterFile
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportAddDump
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportAddFile
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportCreate
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportHang
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportSetParameter
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerReportSubmit
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerSetFlags
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreClose
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreOpen
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStorePurge
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerUnregisterFile
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock
import io.github.kotlinmania.windowssys.windows.win32.system.errorreporting.cinterop.windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(szapplication.rawAddress.toCPointer<ByteVar>())

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(wszapplication.rawAddress.toCPointer<ByteVar>())

public actual fun reportFault(pep: ConstPtr<ExceptionPointers>, dwopt: UInt): EFaultRepRetVal =
    windowssysWindowsWin32SystemErrorreportingReportFault(pep.rawAddress.toCPointer<ByteVar>(), dwopt)

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(pwzexename.rawAddress.toCPointer<ByteVar>(), ballusers)

public actual fun werFreeString(pwszstr: Pcwstr) {
    windowssysWindowsWin32SystemErrorreportingWerFreeString(pwszstr.rawAddress.toCPointer<ByteVar>())
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: MutPtr<WerFaultReporting>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerGetFlags(hprocess.rawAddress.toCPointer<ByteVar>(), pdwflags.rawAddress.toCPointer<ByteVar>())

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(processid, captureextrainfoforthreadid)

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(localappdatarelativepath.rawAddress.toCPointer<ByteVar>())

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(key.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun werRegisterExcludedMemoryBlock(address: ConstPtr<CVoid>, size: UInt): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(address.rawAddress.toCPointer<ByteVar>(), size)

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRegisterFile(pwzfile.rawAddress.toCPointer<ByteVar>(), regfiletype, dwflags)

public actual fun werRegisterMemoryBlock(pvaddress: ConstPtr<CVoid>, dwsize: UInt): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(pvaddress.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(pwzexename.rawAddress.toCPointer<ByteVar>(), ballusers)

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: ConstPtr<WerExceptionInformation>, pdumpcustomoptions: ConstPtr<WerDumpCustomOptions>, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportAddDump(hreporthandle.rawAddress.toCPointer<ByteVar>(), hprocess.rawAddress.toCPointer<ByteVar>(), hthread.rawAddress.toCPointer<ByteVar>(), dumptype, pexceptionparam.rawAddress.toCPointer<ByteVar>(), pdumpcustomoptions.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportAddFile(hreporthandle.rawAddress.toCPointer<ByteVar>(), pwzpath.rawAddress.toCPointer<ByteVar>(), repfiletype, dwfileflags)

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(hreporthandle.rawAddress.toCPointer<ByteVar>())

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: ConstPtr<WerReportInformation>, phreporthandle: MutPtr<Hreport>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportCreate(pwzeventtype.rawAddress.toCPointer<ByteVar>(), reptype, preportinformation.rawAddress.toCPointer<ByteVar>(), phreporthandle.rawAddress.toCPointer<ByteVar>())

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportHang(hwndhungapp.rawAddress.toCPointer<ByteVar>(), pwzhungapplicationname.rawAddress.toCPointer<ByteVar>())

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportSetParameter(hreporthandle.rawAddress.toCPointer<ByteVar>(), dwparamid, pwzname.rawAddress.toCPointer<ByteVar>(), pwzvalue.rawAddress.toCPointer<ByteVar>())

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(hreporthandle.rawAddress.toCPointer<ByteVar>(), repuitypeid, pwzvalue.rawAddress.toCPointer<ByteVar>())

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: MutPtr<WerSubmitResult>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerReportSubmit(hreporthandle.rawAddress.toCPointer<ByteVar>(), consent, dwflags, psubmitresult.rawAddress.toCPointer<ByteVar>())

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerSetFlags(dwflags)

public actual fun werStoreClose(hreportstore: Hreportstore) {
    windowssysWindowsWin32SystemErrorreportingWerStoreClose(hreportstore.rawAddress.toCPointer<ByteVar>())
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr<Pcwstr>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(hreportstore.rawAddress.toCPointer<ByteVar>(), ppszreportkey.rawAddress.toCPointer<ByteVar>())

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr<Pcwstr>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(hreportstore.rawAddress.toCPointer<ByteVar>(), ppszreportkey.rawAddress.toCPointer<ByteVar>())

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(hreportstore.rawAddress.toCPointer<ByteVar>(), pdwreportcount.rawAddress.toCPointer<ByteVar>())

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(hreportstore.rawAddress.toCPointer<ByteVar>(), pqwsizeinbytes.rawAddress.toCPointer<ByteVar>())

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: MutPtr<Hreportstore>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreOpen(repstoretype, phreportstore.rawAddress.toCPointer<ByteVar>())

public actual fun werStorePurge(): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStorePurge()

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV1>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(hreportstore.rawAddress.toCPointer<ByteVar>(), pszreportkey.rawAddress.toCPointer<ByteVar>(), preportmetadata.rawAddress.toCPointer<ByteVar>())

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV2>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(hreportstore.rawAddress.toCPointer<ByteVar>(), pszreportkey.rawAddress.toCPointer<ByteVar>(), preportmetadata.rawAddress.toCPointer<ByteVar>())

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV3>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(hreportstore.rawAddress.toCPointer<ByteVar>(), pszreportkey.rawAddress.toCPointer<ByteVar>(), preportmetadata.rawAddress.toCPointer<ByteVar>())

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: MutPtr<WerSubmitResult>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(hreportstore.rawAddress.toCPointer<ByteVar>(), pszreportkey.rawAddress.toCPointer<ByteVar>(), dwflags, psubmitresult.rawAddress.toCPointer<ByteVar>())

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(processid)

public actual fun werUnregisterAppLocalDump(): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump()

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(key.rawAddress.toCPointer<ByteVar>())

public actual fun werUnregisterExcludedMemoryBlock(address: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(address.rawAddress.toCPointer<ByteVar>())

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerUnregisterFile(pwzfilepath.rawAddress.toCPointer<ByteVar>())

public actual fun werUnregisterMemoryBlock(pvaddress: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(pvaddress.rawAddress.toCPointer<ByteVar>())

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())
