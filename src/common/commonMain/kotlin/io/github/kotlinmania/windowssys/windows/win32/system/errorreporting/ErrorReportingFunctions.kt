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

public expect fun addERExcludedApplicationA(szapplication: Pcstr): Bool

public expect fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool

public expect fun reportFault(pep: ConstPtr<ExceptionPointers>, dwopt: UInt): EFaultRepRetVal

public expect fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult

public expect fun werFreeString(pwszstr: Pcwstr)

public expect fun werGetFlags(hprocess: Handle, pdwflags: MutPtr<WerFaultReporting>): Hresult

public expect fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult

public expect fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult

public expect fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult

public expect fun werRegisterExcludedMemoryBlock(address: ConstPtr<CVoid>, size: UInt): Hresult

public expect fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult

public expect fun werRegisterMemoryBlock(pvaddress: ConstPtr<CVoid>, dwsize: UInt): Hresult

public expect fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr<CVoid>): Hresult

public expect fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult

public expect fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: ConstPtr<WerExceptionInformation>, pdumpcustomoptions: ConstPtr<WerDumpCustomOptions>, dwflags: UInt): Hresult

public expect fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult

public expect fun werReportCloseHandle(hreporthandle: Hreport): Hresult

public expect fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: ConstPtr<WerReportInformation>, phreporthandle: MutPtr<Hreport>): Hresult

public expect fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult

public expect fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult

public expect fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult

public expect fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: MutPtr<WerSubmitResult>): Hresult

public expect fun werSetFlags(dwflags: WerFaultReporting): Hresult

public expect fun werStoreClose(hreportstore: Hreportstore)

public expect fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr<Pcwstr>): Hresult

public expect fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr<Pcwstr>): Hresult

public expect fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: MutPtr<UInt>): Hresult

public expect fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: MutPtr<ULong>): Hresult

public expect fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: MutPtr<Hreportstore>): Hresult

public expect fun werStorePurge(): Hresult

public expect fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV1>): Hresult

public expect fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV2>): Hresult

public expect fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV3>): Hresult

public expect fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: MutPtr<WerSubmitResult>): Hresult

public expect fun werUnregisterAdditionalProcess(processid: UInt): Hresult

public expect fun werUnregisterAppLocalDump(): Hresult

public expect fun werUnregisterCustomMetadata(key: Pcwstr): Hresult

public expect fun werUnregisterExcludedMemoryBlock(address: ConstPtr<CVoid>): Hresult

public expect fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult

public expect fun werUnregisterMemoryBlock(pvaddress: ConstPtr<CVoid>): Hresult

public expect fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr<CVoid>): Hresult
