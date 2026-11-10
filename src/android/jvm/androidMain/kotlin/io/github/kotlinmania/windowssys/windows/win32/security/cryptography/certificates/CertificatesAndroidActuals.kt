@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32SecurityCryptographyCertificatesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW(hbc: Long, pwszattachmentname: Long, cbreadhintsize: Int, plifilesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW(pwszservername: Long, grbitjet: Int, dwbackupflags: Int, phbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: Int, pcbread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW(pwszservername: Long, pfserveronline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW(pwszservername: Long, dwrestoreflags: Int, phbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: Long, pwszlogpath: Long, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: Long, genlow: Int, genhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: Long, pwszlogpath: Long, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: Long, genlow: Int, genhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW(pwszservername: Long, dwcontrolflags: Int, pcbout: Long, ppbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey(pcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, bisclient: Int, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, pptrustedissuers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate(pcertcontext: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_pstValidate(ptargetname: Long, bisclient: Int, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): Int
}

public actual fun certSrvBackupClose(hbc: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose((hbc?.value ?: 0L))

public actual fun certSrvBackupEnd(hbc: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd((hbc?.value ?: 0L))

public actual fun certSrvBackupFree(pv: COpaquePointer?) {
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree((pv?.value ?: 0L))
}

public actual fun certSrvBackupGetBackupLogsW(hbc: COpaquePointer?, ppwszzbackuplogfiles: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW((hbc?.value ?: 0L), (ppwszzbackuplogfiles?.value ?: 0L), (pcbsize?.value ?: 0L))

public actual fun certSrvBackupGetDatabaseNamesW(hbc: COpaquePointer?, ppwszzattachmentinformation: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW((hbc?.value ?: 0L), (ppwszzattachmentinformation?.value ?: 0L), (pcbsize?.value ?: 0L))

public actual fun certSrvBackupGetDynamicFileListW(hbc: COpaquePointer?, ppwszzfilelist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW((hbc?.value ?: 0L), (ppwszzfilelist?.value ?: 0L), (pcbsize?.value ?: 0L))

public actual fun certSrvBackupOpenFileW(hbc: COpaquePointer?, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW((hbc?.value ?: 0L), (pwszattachmentname?.value ?: 0L), cbreadhintsize.toInt(), (plifilesize?.value ?: 0L))

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW((pwszservername?.value ?: 0L), grbitjet.toInt(), dwbackupflags.toInt(), (phbc?.value ?: 0L))

public actual fun certSrvBackupRead(hbc: COpaquePointer?, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbread: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead((hbc?.value ?: 0L), (pvbuffer?.value ?: 0L), cbbuffer.toInt(), (pcbread?.value ?: 0L))

public actual fun certSrvBackupTruncateLogs(hbc: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs((hbc?.value ?: 0L))

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW((pwszservername?.value ?: 0L), (pfserveronline?.value ?: 0L))

public actual fun certSrvRestoreEnd(hbc: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd((hbc?.value ?: 0L))

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: COpaquePointer?, ppwszzdatabaselocationlist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW((hbc?.value ?: 0L), (ppwszzdatabaselocationlist?.value ?: 0L), (pcbsize?.value ?: 0L))

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW((pwszservername?.value ?: 0L), dwrestoreflags.toInt(), (phbc?.value ?: 0L))

public actual fun certSrvRestoreRegisterComplete(hbc: COpaquePointer?, hrrestorestate: Hresult): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete((hbc?.value ?: 0L), hrrestorestate)

public actual fun certSrvRestoreRegisterThroughFile(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile((hbc?.value ?: 0L), (pwszcheckpointfilepath?.value ?: 0L), (pwszlogpath?.value ?: 0L), (rgrstmap?.value ?: 0L), crstmap, (pwszbackuplogpath?.value ?: 0L), genlow.toInt(), genhigh.toInt())

public actual fun certSrvRestoreRegisterW(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW((hbc?.value ?: 0L), (pwszcheckpointfilepath?.value ?: 0L), (pwszlogpath?.value ?: 0L), (rgrstmap?.value ?: 0L), crstmap, (pwszbackuplogpath?.value ?: 0L), genlow.toInt(), genhigh.toInt())

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: COpaquePointer?, ppbout: COpaquePointer?): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW((pwszservername?.value ?: 0L), dwcontrolflags.toInt(), (pcbout?.value ?: 0L), (ppbout?.value ?: 0L))

public actual fun pstAcquirePrivateKey(pcert: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey((pcert?.value ?: 0L))

public actual fun pstGetCertificateChain(pcert: COpaquePointer?, ptrustedissuers: COpaquePointer?, ppcertchaincontext: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain((pcert?.value ?: 0L), (ptrustedissuers?.value ?: 0L), (ppcertchaincontext?.value ?: 0L))

public actual fun pstGetCertificates(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, bisclient: Bool, pdwcertchaincontextcount: COpaquePointer?, ppcertchaincontexts: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates((ptargetname?.value ?: 0L), ccriteria.toInt(), (rgpcriteria?.value ?: 0L), bisclient, (pdwcertchaincontextcount?.value ?: 0L), (ppcertchaincontexts?.value ?: 0L))

public actual fun pstGetTrustAnchors(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors((ptargetname?.value ?: 0L), ccriteria.toInt(), (rgpcriteria?.value ?: 0L), (pptrustedissuers?.value ?: 0L))

public actual fun pstGetTrustAnchorsEx(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pcertcontext: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx((ptargetname?.value ?: 0L), ccriteria.toInt(), (rgpcriteria?.value ?: 0L), (pcertcontext?.value ?: 0L), (pptrustedissuers?.value ?: 0L))

public actual fun pstGetUserNameForCertificate(pcertcontext: COpaquePointer?, username: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate((pcertcontext?.value ?: 0L), (username?.value ?: 0L))

public actual fun pstMapCertificate(pcert: COpaquePointer?, ptokeninformationtype: COpaquePointer?, pptokeninformation: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate((pcert?.value ?: 0L), (ptokeninformationtype?.value ?: 0L), (pptokeninformation?.value ?: 0L))

public actual fun pstValidate(ptargetname: COpaquePointer?, bisclient: Bool, prequestedissuancepolicy: COpaquePointer?, phadditionalcertstore: COpaquePointer?, pcert: COpaquePointer?, pprovguid: COpaquePointer?): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_pstValidate((ptargetname?.value ?: 0L), bisclient, (prequestedissuancepolicy?.value ?: 0L), (phadditionalcertstore?.value ?: 0L), (pcert?.value ?: 0L), (pprovguid?.value ?: 0L))
