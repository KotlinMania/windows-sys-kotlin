@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemErrorreportingNapiAddon(): Boolean

private val windowsWin32SystemErrorreportingNapiAvailable: Boolean = initWindowsWin32SystemErrorreportingNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingReportFault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingReportFault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerFreeString(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerFreeString(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerGetFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerGetFlags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRegisterFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterFile(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportAddDump(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportAddDump(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportAddFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportAddFile(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportCreate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportHang(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportHang(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportSetParameter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportSetParameter(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerReportSubmit(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerReportSubmit(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerSetFlags(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerSetFlags(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreOpen(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStorePurge()")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStorePurge(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump()")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerUnregisterFile(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(p0)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(p0: String, p1: String): Int

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(szapplication.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(wszapplication.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportFault(pep: ConstPtr, dwopt: UInt): EFaultRepRetVal =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingReportFault(pep.rawAddress.toString(), dwopt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(pwzexename.rawAddress.toString(), ballusers) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werFreeString(pwszstr: Pcwstr) {
    if (windowsWin32SystemErrorreportingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemErrorreportingWerFreeString(pwszstr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerGetFlags(hprocess.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(localappdatarelativepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(key.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterExcludedMemoryBlock(address: ConstPtr, size: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(address.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterFile(pwzfile.rawAddress.toString(), regfiletype, dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterMemoryBlock(pvaddress: ConstPtr, dwsize: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(pvaddress.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(pwzexename.rawAddress.toString(), ballusers) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: ConstPtr, pdumpcustomoptions: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportAddDump(hreporthandle.rawAddress.toString(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), dumptype, pexceptionparam.rawAddress.toString(), pdumpcustomoptions.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportAddFile(hreporthandle.rawAddress.toString(), pwzpath.rawAddress.toString(), repfiletype, dwfileflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(hreporthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: ConstPtr, phreporthandle: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportCreate(pwzeventtype.rawAddress.toString(), reptype, preportinformation.rawAddress.toString(), phreporthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportHang(hwndhungapp.rawAddress.toString(), pwzhungapplicationname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportSetParameter(hreporthandle.rawAddress.toString(), dwparamid.toInt(), pwzname.rawAddress.toString(), pwzvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(hreporthandle.rawAddress.toString(), repuitypeid, pwzvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerReportSubmit(hreporthandle.rawAddress.toString(), consent, dwflags.toInt(), psubmitresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerSetFlags(dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreClose(hreportstore: Hreportstore) {
    if (windowsWin32SystemErrorreportingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemErrorreportingWerStoreClose(hreportstore.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(hreportstore.rawAddress.toString(), ppszreportkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(hreportstore.rawAddress.toString(), ppszreportkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(hreportstore.rawAddress.toString(), pdwreportcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(hreportstore.rawAddress.toString(), pqwsizeinbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreOpen(repstoretype, phreportstore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStorePurge(): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStorePurge() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), preportmetadata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), preportmetadata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), preportmetadata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), dwflags.toInt(), psubmitresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(processid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAppLocalDump(): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterExcludedMemoryBlock(address: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(address.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterFile(pwzfilepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterMemoryBlock(pvaddress: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(pvaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAvailable) wasmWindowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
