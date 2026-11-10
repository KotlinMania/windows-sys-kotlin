@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SecurityCryptographyCertificatesNapiAddon(): Boolean

private val _windowsWin32SecurityCryptographyCertificatesNapiAvailable: Boolean = _initWindowsWin32SecurityCryptographyCertificatesNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey(p0)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_cryptography_certificates_pstValidate(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_security_cryptography_certificates_pstValidate(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

public actual fun certSrvBackupClose(hbc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose((hbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupEnd(hbc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd((hbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupFree(pv: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) {
        _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree((pv?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certSrvBackupGetBackupLogsW(hbc: COpaquePointer?, ppwszzbackuplogfiles: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW((hbc?.value ?: 0L).toString(), (ppwszzbackuplogfiles?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupGetDatabaseNamesW(hbc: COpaquePointer?, ppwszzattachmentinformation: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW((hbc?.value ?: 0L).toString(), (ppwszzattachmentinformation?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupGetDynamicFileListW(hbc: COpaquePointer?, ppwszzfilelist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW((hbc?.value ?: 0L).toString(), (ppwszzfilelist?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupOpenFileW(hbc: COpaquePointer?, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW((hbc?.value ?: 0L).toString(), (pwszattachmentname?.value ?: 0L).toString(), cbreadhintsize.toInt(), (plifilesize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW((pwszservername?.value ?: 0L).toString(), grbitjet.toInt(), dwbackupflags.toInt(), (phbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupRead(hbc: COpaquePointer?, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbread: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead((hbc?.value ?: 0L).toString(), (pvbuffer?.value ?: 0L).toString(), cbbuffer.toInt(), (pcbread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupTruncateLogs(hbc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs((hbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW((pwszservername?.value ?: 0L).toString(), (pfserveronline?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreEnd(hbc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd((hbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: COpaquePointer?, ppwszzdatabaselocationlist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW((hbc?.value ?: 0L).toString(), (ppwszzdatabaselocationlist?.value ?: 0L).toString(), (pcbsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW((pwszservername?.value ?: 0L).toString(), dwrestoreflags.toInt(), (phbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterComplete(hbc: COpaquePointer?, hrrestorestate: Hresult): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete((hbc?.value ?: 0L).toString(), hrrestorestate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterThroughFile(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile((hbc?.value ?: 0L).toString(), (pwszcheckpointfilepath?.value ?: 0L).toString(), (pwszlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstmap, (pwszbackuplogpath?.value ?: 0L).toString(), genlow.toInt(), genhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterW(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW((hbc?.value ?: 0L).toString(), (pwszcheckpointfilepath?.value ?: 0L).toString(), (pwszlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstmap, (pwszbackuplogpath?.value ?: 0L).toString(), genlow.toInt(), genhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: COpaquePointer?, ppbout: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW((pwszservername?.value ?: 0L).toString(), dwcontrolflags.toInt(), (pcbout?.value ?: 0L).toString(), (ppbout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstAcquirePrivateKey(pcert: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey((pcert?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetCertificateChain(pcert: COpaquePointer?, ptrustedissuers: COpaquePointer?, ppcertchaincontext: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain((pcert?.value ?: 0L).toString(), (ptrustedissuers?.value ?: 0L).toString(), (ppcertchaincontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetCertificates(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, bisclient: Bool, pdwcertchaincontextcount: COpaquePointer?, ppcertchaincontexts: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates((ptargetname?.value ?: 0L).toString(), ccriteria.toInt(), (rgpcriteria?.value ?: 0L).toString(), bisclient, (pdwcertchaincontextcount?.value ?: 0L).toString(), (ppcertchaincontexts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetTrustAnchors(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors((ptargetname?.value ?: 0L).toString(), ccriteria.toInt(), (rgpcriteria?.value ?: 0L).toString(), (pptrustedissuers?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetTrustAnchorsEx(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pcertcontext: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx((ptargetname?.value ?: 0L).toString(), ccriteria.toInt(), (rgpcriteria?.value ?: 0L).toString(), (pcertcontext?.value ?: 0L).toString(), (pptrustedissuers?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetUserNameForCertificate(pcertcontext: COpaquePointer?, username: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate((pcertcontext?.value ?: 0L).toString(), (username?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstMapCertificate(pcert: COpaquePointer?, ptokeninformationtype: COpaquePointer?, pptokeninformation: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate((pcert?.value ?: 0L).toString(), (ptokeninformationtype?.value ?: 0L).toString(), (pptokeninformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstValidate(ptargetname: COpaquePointer?, bisclient: Bool, prequestedissuancepolicy: COpaquePointer?, phadditionalcertstore: COpaquePointer?, pcert: COpaquePointer?, pprovguid: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAvailable) _wasm_windowssys_windows_win32_security_cryptography_certificates_pstValidate((ptargetname?.value ?: 0L).toString(), bisclient, (prequestedissuancepolicy?.value ?: 0L).toString(), (phadditionalcertstore?.value ?: 0L).toString(), (pcert?.value ?: 0L).toString(), (pprovguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
