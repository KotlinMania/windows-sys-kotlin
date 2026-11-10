@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32SystemErrorreportingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationA((szapplication?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_addERExcludedApplicationW((wszapplication?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportFault(pep: COpaquePointer?, dwopt: UInt): EFaultRepRetVal =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_reportFault((pep?.value ?: 0L).toString(), dwopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werAddExcludedApplication((pwzexename?.value ?: 0L).toString(), ballusers) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werFreeString(pwszstr: Pcwstr) {
    if (_windowsWin32SystemErrorreportingNapiAddon != null) {
        _windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werFreeString((pwszstr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werGetFlags((hprocess?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRegisterAppLocalDump((localappdatarelativepath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRegisterCustomMetadata((key?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterExcludedMemoryBlock(address: COpaquePointer?, size: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRegisterExcludedMemoryBlock((address?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRegisterFile((pwzfile?.value ?: 0L).toString(), regfiletype, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterMemoryBlock(pvaddress: COpaquePointer?, dwsize: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRegisterMemoryBlock((pvaddress?.value ?: 0L).toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRegisterRuntimeExceptionModule((pwszoutofprocesscallbackdll?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werRemoveExcludedApplication((pwzexename?.value ?: 0L).toString(), ballusers) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: COpaquePointer?, pdumpcustomoptions: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportAddDump((hreporthandle?.value ?: 0L).toString(), (hprocess?.value ?: 0L).toString(), (hthread?.value ?: 0L).toString(), dumptype, (pexceptionparam?.value ?: 0L).toString(), (pdumpcustomoptions?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportAddFile((hreporthandle?.value ?: 0L).toString(), (pwzpath?.value ?: 0L).toString(), repfiletype, dwfileflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportCloseHandle((hreporthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: COpaquePointer?, phreporthandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportCreate((pwzeventtype?.value ?: 0L).toString(), reptype, (preportinformation?.value ?: 0L).toString(), (phreporthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportHang((hwndhungapp?.value ?: 0L).toString(), (pwzhungapplicationname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportSetParameter((hreporthandle?.value ?: 0L).toString(), dwparamid.toInt(), (pwzname?.value ?: 0L).toString(), (pwzvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportSetUIOption((hreporthandle?.value ?: 0L).toString(), repuitypeid, (pwzvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werReportSubmit((hreporthandle?.value ?: 0L).toString(), consent, dwflags.toInt(), (psubmitresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werSetFlags(dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreClose(hreportstore: Hreportstore) {
    if (_windowsWin32SystemErrorreportingNapiAddon != null) {
        _windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreClose((hreportstore?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreGetFirstReportKey((hreportstore?.value ?: 0L).toString(), (ppszreportkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreGetNextReportKey((hreportstore?.value ?: 0L).toString(), (ppszreportkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreGetReportCount((hreportstore?.value ?: 0L).toString(), (pdwreportcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreGetSizeOnDisk((hreportstore?.value ?: 0L).toString(), (pqwsizeinbytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreOpen(repstoretype, (phreportstore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStorePurge(): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStorePurge() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV1((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), (preportmetadata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV2((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), (preportmetadata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreQueryReportMetadataV3((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), (preportmetadata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werStoreUploadReport((hreportstore?.value ?: 0L).toString(), (pszreportkey?.value ?: 0L).toString(), dwflags.toInt(), (psubmitresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werUnregisterAdditionalProcess(processid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAppLocalDump(): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werUnregisterAppLocalDump() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werUnregisterCustomMetadata((key?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterExcludedMemoryBlock(address: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werUnregisterExcludedMemoryBlock((address?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werUnregisterFile((pwzfilepath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterMemoryBlock(pvaddress: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werUnregisterMemoryBlock((pvaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemErrorreportingNapiAddon != null) (_windowsWin32SystemErrorreportingNapiAddon.windowssys_windows_win32_system_errorreporting_werUnregisterRuntimeExceptionModule((pwszoutofprocesscallbackdll?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
