@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SecurityCryptographyCertificatesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun certSrvBackupClose(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(hbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupEnd(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(hbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupFree(pv: MutPtr<CVoid>) {
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) {
        windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certSrvBackupGetBackupLogsW(hbc: ConstPtr<CVoid>, ppwszzbackuplogfiles: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(hbc.rawAddress.toString(), ppwszzbackuplogfiles.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr<CVoid>, ppwszzattachmentinformation: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(hbc.rawAddress.toString(), ppwszzattachmentinformation.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr<CVoid>, ppwszzfilelist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(hbc.rawAddress.toString(), ppwszzfilelist.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupOpenFileW(hbc: MutPtr<CVoid>, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(hbc.rawAddress.toString(), pwszattachmentname.rawAddress.toString(), cbreadhintsize.toInt(), plifilesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(pwszservername.rawAddress.toString(), grbitjet.toInt(), dwbackupflags.toInt(), phbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupRead(hbc: MutPtr<CVoid>, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbread: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(hbc.rawAddress.toString(), pvbuffer.rawAddress.toString(), cbbuffer.toInt(), pcbread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvBackupTruncateLogs(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(hbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(pwszservername.rawAddress.toString(), pfserveronline.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreEnd(hbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(hbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr<CVoid>, ppwszzdatabaselocationlist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(hbc.rawAddress.toString(), ppwszzdatabaselocationlist.rawAddress.toString(), pcbsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(pwszservername.rawAddress.toString(), dwrestoreflags.toInt(), phbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterComplete(hbc: MutPtr<CVoid>, hrrestorestate: Hresult): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(hbc.rawAddress.toString(), hrrestorestate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterThroughFile(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(hbc.rawAddress.toString(), pwszcheckpointfilepath.rawAddress.toString(), pwszlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstmap, pwszbackuplogpath.rawAddress.toString(), genlow.toInt(), genhigh.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvRestoreRegisterW(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(hbc.rawAddress.toString(), pwszcheckpointfilepath.rawAddress.toString(), pwszlogpath.rawAddress.toString(), rgrstmap.rawAddress.toString(), crstmap, pwszbackuplogpath.rawAddress.toString(), genlow.toInt(), genhigh.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr<UInt>, ppbout: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(pwszservername.rawAddress.toString(), dwcontrolflags.toInt(), pcbout.rawAddress.toString(), ppbout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstAcquirePrivateKey(pcert: ConstPtr<CertContext>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(pcert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetCertificateChain(pcert: ConstPtr<CertContext>, ptrustedissuers: ConstPtr<SecPkgContextIssuerListInfoEx>, ppcertchaincontext: MutPtr<MutPtr<CertChainContext>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(pcert.rawAddress.toString(), ptrustedissuers.rawAddress.toString(), ppcertchaincontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetCertificates(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, bisclient: Bool, pdwcertchaincontextcount: MutPtr<UInt>, ppcertchaincontexts: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(ptargetname.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), bisclient, pdwcertchaincontextcount.rawAddress.toString(), ppcertchaincontexts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetTrustAnchors(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(ptargetname.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), pptrustedissuers.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetTrustAnchorsEx(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pcertcontext: ConstPtr<CertContext>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(ptargetname.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), pcertcontext.rawAddress.toString(), pptrustedissuers.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstGetUserNameForCertificate(pcertcontext: ConstPtr<CertContext>, username: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(pcertcontext.rawAddress.toString(), username.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstMapCertificate(pcert: ConstPtr<CertContext>, ptokeninformationtype: MutPtr<LsaTokenInformationType>, pptokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(pcert.rawAddress.toString(), ptokeninformationtype.rawAddress.toString(), pptokeninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pstValidate(ptargetname: ConstPtr<UnicodeString>, bisclient: Bool, prequestedissuancepolicy: ConstPtr<CertUsageMatch>, phadditionalcertstore: ConstPtr<Hcertstore>, pcert: ConstPtr<CertContext>, pprovguid: MutPtr<Guid>): Ntstatus =
    if (windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(ptargetname.rawAddress.toString(), bisclient, prequestedissuancepolicy.rawAddress.toString(), phadditionalcertstore.rawAddress.toString(), pcert.rawAddress.toString(), pprovguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
