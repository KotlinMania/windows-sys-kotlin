@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.LsaTokenInformationType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextIssuerListInfoEx
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertSelectCriteria
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertUsageMatch
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityCryptographyCertificatesNapiAddon(): Boolean

private val windowsWin32SecurityCryptographyCertificatesNapiAvailable: Boolean = initWindowsWin32SecurityCryptographyCertificatesNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

public actual fun certSrvBackupClose(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(hbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupEnd(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(hbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupFree(pv: MutPtr<CVoid>) {
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certSrvBackupGetBackupLogsW(hbc: ConstPtr<CVoid>, ppwszzbackuplogfiles: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(hbc.rawAddress.toString(), ppwszzbackuplogfiles.rawAddress.toString(), pcbsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr<CVoid>, ppwszzattachmentinformation: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(hbc.rawAddress.toString(), ppwszzattachmentinformation.rawAddress.toString(), pcbsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr<CVoid>, ppwszzfilelist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(hbc.rawAddress.toString(), ppwszzfilelist.rawAddress.toString(), pcbsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupOpenFileW(hbc: MutPtr<CVoid>, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(hbc.rawAddress.toString(), pwszattachmentname.rawAddress.toString(), cbreadhintsize.toInt(), plifilesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(pwszservername.rawAddress.toString(), grbitjet.toInt(), dwbackupflags.toInt(), phbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupRead(hbc: MutPtr<CVoid>, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbread: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(hbc.rawAddress.toString(), pvbuffer.rawAddress.toString(), cbbuffer.toInt(), pcbread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupTruncateLogs(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(hbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(pwszservername.rawAddress.toString(), pfserveronline.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreEnd(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(hbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr<CVoid>, ppwszzdatabaselocationlist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(hbc.rawAddress.toString(), ppwszzdatabaselocationlist.rawAddress.toString(), pcbsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(pwszservername.rawAddress.toString(), dwrestoreflags.toInt(), phbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterComplete(hbc: MutPtr<CVoid>, hrrestorestate: Hresult): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(hbc.rawAddress.toString(), hrrestorestate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterThroughFile(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(hbc.rawAddress.toString(), pwszcheckpointfilepath.rawAddress.toString(), pwszlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstmap, pwszbackuplogpath.rawAddress.toString(), genlow.toInt(), genhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterW(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(hbc.rawAddress.toString(), pwszcheckpointfilepath.rawAddress.toString(), pwszlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstmap, pwszbackuplogpath.rawAddress.toString(), genlow.toInt(), genhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr<UInt>, ppbout: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(pwszservername.rawAddress.toString(), dwcontrolflags.toInt(), pcbout.rawAddress.toString(), ppbout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstAcquirePrivateKey(pcert: ConstPtr<CertContext>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(pcert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetCertificateChain(pcert: ConstPtr<CertContext>, ptrustedissuers: ConstPtr<SecPkgContextIssuerListInfoEx>, ppcertchaincontext: MutPtr<MutPtr<CertChainContext>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(pcert.rawAddress.toString(), ptrustedissuers.rawAddress.toString(), ppcertchaincontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetCertificates(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, bisclient: Bool, pdwcertchaincontextcount: MutPtr<UInt>, ppcertchaincontexts: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(ptargetname.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), bisclient, pdwcertchaincontextcount.rawAddress.toString(), ppcertchaincontexts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetTrustAnchors(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(ptargetname.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), pptrustedissuers.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetTrustAnchorsEx(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pcertcontext: ConstPtr<CertContext>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(ptargetname.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), pcertcontext.rawAddress.toString(), pptrustedissuers.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetUserNameForCertificate(pcertcontext: ConstPtr<CertContext>, username: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(pcertcontext.rawAddress.toString(), username.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstMapCertificate(pcert: ConstPtr<CertContext>, ptokeninformationtype: MutPtr<LsaTokenInformationType>, pptokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(pcert.rawAddress.toString(), ptokeninformationtype.rawAddress.toString(), pptokeninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstValidate(ptargetname: ConstPtr<UnicodeString>, bisclient: Bool, prequestedissuancepolicy: ConstPtr<CertUsageMatch>, phadditionalcertstore: ConstPtr<Hcertstore>, pcert: ConstPtr<CertContext>, pprovguid: MutPtr<Guid>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(ptargetname.rawAddress.toString(), bisclient, prequestedissuancepolicy.rawAddress.toString(), phadditionalcertstore.rawAddress.toString(), pcert.rawAddress.toString(), pprovguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
