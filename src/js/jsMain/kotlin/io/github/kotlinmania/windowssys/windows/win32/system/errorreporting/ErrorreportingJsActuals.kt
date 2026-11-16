@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32SystemErrorreportingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(szapplication.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(wszapplication.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportFault(pep: ConstPtr, dwopt: UInt): EFaultRepRetVal =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingReportFault(pep.rawAddress.toString(), dwopt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(pwzexename.rawAddress.toString(), ballusers) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werFreeString(pwszstr: Pcwstr) {
    if (windowsWin32SystemErrorreportingNapiAddon != null) {
        windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerFreeString(pwszstr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerGetFlags(hprocess.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(localappdatarelativepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(key.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterExcludedMemoryBlock(address: ConstPtr, size: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(address.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRegisterFile(pwzfile.rawAddress.toString(), regfiletype, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterMemoryBlock(pvaddress: ConstPtr, dwsize: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(pvaddress.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(pwzexename.rawAddress.toString(), ballusers) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: ConstPtr, pdumpcustomoptions: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportAddDump(hreporthandle.rawAddress.toString(), hprocess.rawAddress.toString(), hthread.rawAddress.toString(), dumptype, pexceptionparam.rawAddress.toString(), pdumpcustomoptions.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportAddFile(hreporthandle.rawAddress.toString(), pwzpath.rawAddress.toString(), repfiletype, dwfileflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(hreporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: ConstPtr, phreporthandle: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportCreate(pwzeventtype.rawAddress.toString(), reptype, preportinformation.rawAddress.toString(), phreporthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportHang(hwndhungapp.rawAddress.toString(), pwzhungapplicationname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportSetParameter(hreporthandle.rawAddress.toString(), dwparamid.toInt(), pwzname.rawAddress.toString(), pwzvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(hreporthandle.rawAddress.toString(), repuitypeid, pwzvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerReportSubmit(hreporthandle.rawAddress.toString(), consent, dwflags.toInt(), psubmitresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerSetFlags(dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreClose(hreportstore: Hreportstore) {
    if (windowsWin32SystemErrorreportingNapiAddon != null) {
        windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreClose(hreportstore.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(hreportstore.rawAddress.toString(), ppszreportkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(hreportstore.rawAddress.toString(), ppszreportkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(hreportstore.rawAddress.toString(), pdwreportcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(hreportstore.rawAddress.toString(), pqwsizeinbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreOpen(repstoretype, phreportstore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStorePurge(): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStorePurge() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), preportmetadata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), preportmetadata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), preportmetadata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: MutPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(hreportstore.rawAddress.toString(), pszreportkey.rawAddress.toString(), dwflags.toInt(), psubmitresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(processid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterAppLocalDump(): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterExcludedMemoryBlock(address: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(address.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerUnregisterFile(pwzfilepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterMemoryBlock(pvaddress: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(pvaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr): Hresult =
    if (windowsWin32SystemErrorreportingNapiAddon != null) (windowsWin32SystemErrorreportingNapiAddon.windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
