@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemErrorreportingNapiAddon(): Boolean

private val _windowsWin32SystemErrorreportingNapiAvailable: Boolean = _initWindowsWin32SystemErrorreportingNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_reportFault(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_reportFault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werAddExcludedApplication(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werAddExcludedApplication(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werFreeString(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werFreeString(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werGetFlags(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werGetFlags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRegisterFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRegisterFile(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportAddDump(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportAddDump(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportAddFile(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportAddFile(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportCloseHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportCloseHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportCreate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportHang(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportHang(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportSetParameter(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportSetParameter(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportSetUIOption(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportSetUIOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werReportSubmit(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werReportSubmit(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werSetFlags(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werSetFlags(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreClose(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreClose(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreGetReportCount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetReportCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreOpen(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreOpen(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStorePurge()")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStorePurge(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werStoreUploadReport(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werStoreUploadReport(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump()")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werUnregisterFile(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock(p0)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule(p0: String, p1: String): Int

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA((szapplication?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW((wszapplication?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportFault(pep: COpaquePointer?, dwopt: UInt): EFaultRepRetVal =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_reportFault((pep?.value ?: 0L).toString(), dwopt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werAddExcludedApplication((pwzexename?.value ?: 0L).toString(), ballusers) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werFreeString(pwszstr: Pcwstr) {
    if (_windowsWin32SystemErrorreportingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_errorreporting_werFreeString((pwszstr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werGetFlags((hprocess?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump((localappdatarelativepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata((key?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterExcludedMemoryBlock(address: COpaquePointer?, size: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock((address?.value ?: 0L).toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRegisterFile((pwzfile?.value ?: 0L).toString(), regfiletype, dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterMemoryBlock(pvaddress: COpaquePointer?, dwsize: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock((pvaddress?.value ?: 0L).toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule((pwszoutofprocesscallbackdll?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication((pwzexename?.value ?: 0L).toString(), ballusers) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: COpaquePointer?, pdumpcustomoptions: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportAddDump((hreporthandle?.value ?: 0L).toString(), (hprocess?.value ?: 0L).toString(), (hthread?.value ?: 0L).toString(), dumptype, (pexceptionparam?.value ?: 0L).toString(), (pdumpcustomoptions?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportAddFile((hreporthandle?.value ?: 0L).toString(), (pwzpath?.value ?: 0L).toString(), repfiletype, dwfileflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportCloseHandle((hreporthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: COpaquePointer?, phreporthandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportCreate((pwzeventtype?.value ?: 0L).toString(), reptype, (preportinformation?.value ?: 0L).toString(), (phreporthandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportHang((hwndhungapp?.value ?: 0L).toString(), (pwzhungapplicationname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportSetParameter((hreporthandle?.value ?: 0L).toString(), dwparamid.toInt(), (pwzname?.value ?: 0L).toString(), (pwzvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportSetUIOption((hreporthandle?.value ?: 0L).toString(), repuitypeid, (pwzvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werReportSubmit((hreporthandle?.value ?: 0L).toString(), consent, dwflags.toInt(), (psubmitresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werSetFlags(dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreClose(hreportstore: Hreportstore) {
    if (_windowsWin32SystemErrorreportingNapiAvailable) {
        _wasm_windowssys_windows_win32_system_errorreporting_werStoreClose((hreportstore?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey((hreportstore?.value ?: 0L).toString(), (ppszreportkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey((hreportstore?.value ?: 0L).toString(), (ppszreportkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetReportCount((hreportstore?.value ?: 0L).toString(), (pdwreportcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk((hreportstore?.value ?: 0L).toString(), (pqwsizeinbytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreOpen(repstoretype, (phreportstore?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStorePurge(): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStorePurge() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), (preportmetadata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), (preportmetadata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), (preportmetadata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werStoreUploadReport((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), dwflags.toInt(), (psubmitresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess(processid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAppLocalDump(): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata((key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterExcludedMemoryBlock(address: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock((address?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterFile((pwzfilepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterMemoryBlock(pvaddress: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock((pvaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAvailable) _wasm_windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule((pwszoutofprocesscallbackdll?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
