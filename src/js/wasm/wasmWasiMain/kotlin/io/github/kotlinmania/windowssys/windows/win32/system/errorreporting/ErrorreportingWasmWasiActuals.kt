@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA")

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW")

public actual fun reportFault(pep: ConstPtr, dwopt: UInt): EFaultRepRetVal =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingReportFault")

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication")

public actual fun werFreeString(pwszstr: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerFreeString")

public actual fun werGetFlags(hprocess: Handle, pdwflags: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerGetFlags")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess")
private external fun wasiWindowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(processid: Int, captureextrainfoforthreadid: Int): Int

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt())

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump")

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata")

public actual fun werRegisterExcludedMemoryBlock(address: ConstPtr, size: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock")

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerRegisterFile")

public actual fun werRegisterMemoryBlock(pvaddress: ConstPtr, dwsize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock")

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule")

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication")

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: ConstPtr, pdumpcustomoptions: ConstPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportAddDump")

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportAddFile")

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle")

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: ConstPtr, phreporthandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportCreate")

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportHang")

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportSetParameter")

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption")

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerReportSubmit")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemErrorreportingWerSetFlags")
private external fun wasiWindowssysWindowsWin32SystemErrorreportingWerSetFlags(dwflags: Int): Int

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    wasiWindowssysWindowsWin32SystemErrorreportingWerSetFlags(dwflags.toInt())

public actual fun werStoreClose(hreportstore: Hreportstore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreClose")

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey")

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey")

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount")

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk")

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreOpen")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemErrorreportingWerStorePurge")
private external fun wasiWindowssysWindowsWin32SystemErrorreportingWerStorePurge(): Int

public actual fun werStorePurge(): Hresult =
    wasiWindowssysWindowsWin32SystemErrorreportingWerStorePurge()

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1")

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2")

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3")

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess")
private external fun wasiWindowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(processid: Int): Int

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(processid.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump")
private external fun wasiWindowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump(): Int

public actual fun werUnregisterAppLocalDump(): Hresult =
    wasiWindowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump()

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata")

public actual fun werUnregisterExcludedMemoryBlock(address: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock")

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerUnregisterFile")

public actual fun werUnregisterMemoryBlock(pvaddress: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock")

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule")
