@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private val _windowsWin32SecurityCryptographyCertificatesNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CertSrvBackupClose(hbc: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose(hbc.toString()) as Int) else 0

public actual fun CertSrvBackupEnd(hbc: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd(hbc.toString()) as Int) else 0

public actual fun CertSrvBackupFree(pv: Long) {
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) {
        _windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree(pv.toString())
    }
}

public actual fun CertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW(hbc.toString(), ppwszzbackuplogfiles.toString(), pcbsize.toString()) as Int) else 0

public actual fun CertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW(hbc.toString(), ppwszzattachmentinformation.toString(), pcbsize.toString()) as Int) else 0

public actual fun CertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW(hbc.toString(), ppwszzfilelist.toString(), pcbsize.toString()) as Int) else 0

public actual fun CertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: PCWSTR, cbreadhintsize: UInt, plifilesize: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW(hbc.toString(), pwszattachmentname.toString(), cbreadhintsize.toInt(), plifilesize.toString()) as Int) else 0

public actual fun CertSrvBackupPrepareW(pwszservername: PCWSTR, grbitjet: UInt, dwbackupflags: CSBACKUP_TYPE, phbc: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW(pwszservername.toString(), grbitjet.toInt(), dwbackupflags.toInt(), phbc.toString()) as Int) else 0

public actual fun CertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: UInt, pcbread: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead(hbc.toString(), pvbuffer.toString(), cbbuffer.toInt(), pcbread.toString()) as Int) else 0

public actual fun CertSrvBackupTruncateLogs(hbc: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs(hbc.toString()) as Int) else 0

public actual fun CertSrvIsServerOnlineW(pwszservername: PCWSTR, pfserveronline: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW(pwszservername.toString(), pfserveronline.toString()) as Int) else 0

public actual fun CertSrvRestoreEnd(hbc: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd(hbc.toString()) as Int) else 0

public actual fun CertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW(hbc.toString(), ppwszzdatabaselocationlist.toString(), pcbsize.toString()) as Int) else 0

public actual fun CertSrvRestorePrepareW(pwszservername: PCWSTR, dwrestoreflags: UInt, phbc: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW(pwszservername.toString(), dwrestoreflags.toInt(), phbc.toString()) as Int) else 0

public actual fun CertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: HRESULT): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete(hbc.toString(), hrrestorestate) as Int) else 0

public actual fun CertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile(hbc.toString(), pwszcheckpointfilepath.toString(), pwszlogpath.toString(), rgrstmap.toString(), crstmap, pwszbackuplogpath.toString(), genlow.toInt(), genhigh.toInt()) as Int) else 0

public actual fun CertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW(hbc.toString(), pwszcheckpointfilepath.toString(), pwszlogpath.toString(), rgrstmap.toString(), crstmap, pwszbackuplogpath.toString(), genlow.toInt(), genhigh.toInt()) as Int) else 0

public actual fun CertSrvServerControlW(pwszservername: PCWSTR, dwcontrolflags: UInt, pcbout: Long, ppbout: Long): HRESULT =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW(pwszservername.toString(), dwcontrolflags.toInt(), pcbout.toString(), ppbout.toString()) as Int) else 0

public actual fun PstAcquirePrivateKey(pcert: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey(pcert.toString()) as Int) else 0

public actual fun PstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain(pcert.toString(), ptrustedissuers.toString(), ppcertchaincontext.toString()) as Int) else 0

public actual fun PstGetCertificates(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, bisclient: BOOL, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates(ptargetname.toString(), ccriteria.toInt(), rgpcriteria.toString(), bisclient, pdwcertchaincontextcount.toString(), ppcertchaincontexts.toString()) as Int) else 0

public actual fun PstGetTrustAnchors(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pptrustedissuers: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors(ptargetname.toString(), ccriteria.toInt(), rgpcriteria.toString(), pptrustedissuers.toString()) as Int) else 0

public actual fun PstGetTrustAnchorsEx(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx(ptargetname.toString(), ccriteria.toInt(), rgpcriteria.toString(), pcertcontext.toString(), pptrustedissuers.toString()) as Int) else 0

public actual fun PstGetUserNameForCertificate(pcertcontext: Long, username: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate(pcertcontext.toString(), username.toString()) as Int) else 0

public actual fun PstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate(pcert.toString(), ptokeninformationtype.toString(), pptokeninformation.toString()) as Int) else 0

public actual fun PstValidate(ptargetname: Long, bisclient: BOOL, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): NTSTATUS =
    if (_windowsWin32SecurityCryptographyCertificatesNapiAddon != null) (_windowsWin32SecurityCryptographyCertificatesNapiAddon.windowssys_windows_win32_security_cryptography_certificates_PstValidate(ptargetname.toString(), bisclient, prequestedissuancepolicy.toString(), phadditionalcertstore.toString(), pcert.toString(), pprovguid.toString()) as Int) else 0
