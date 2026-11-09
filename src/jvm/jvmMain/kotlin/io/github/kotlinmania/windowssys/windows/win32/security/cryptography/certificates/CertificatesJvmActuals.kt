@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWin32SecurityCryptographyCertificatesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: Long, cbreadhintsize: Int, plifilesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW(pwszservername: Long, grbitjet: Int, dwbackupflags: Int, phbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: Int, pcbread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW(pwszservername: Long, pfserveronline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd(hbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW(pwszservername: Long, dwrestoreflags: Int, phbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: Long, pwszlogpath: Long, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: Long, genlow: Int, genhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: Long, pwszlogpath: Long, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: Long, genlow: Int, genhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW(pwszservername: Long, dwcontrolflags: Int, pcbout: Long, ppbout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey(pcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, bisclient: Int, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, pptrustedissuers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate(pcertcontext: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_cryptography_certificates_PstValidate(ptargetname: Long, bisclient: Int, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): Int
}

public actual fun CertSrvBackupClose(hbc: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose(hbc)

public actual fun CertSrvBackupEnd(hbc: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd(hbc)

public actual fun CertSrvBackupFree(pv: Long) {
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree(pv)
}

public actual fun CertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW(hbc, ppwszzbackuplogfiles, pcbsize)

public actual fun CertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW(hbc, ppwszzattachmentinformation, pcbsize)

public actual fun CertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW(hbc, ppwszzfilelist, pcbsize)

public actual fun CertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: PCWSTR, cbreadhintsize: UInt, plifilesize: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW(hbc, pwszattachmentname, cbreadhintsize.toInt(), plifilesize)

public actual fun CertSrvBackupPrepareW(pwszservername: PCWSTR, grbitjet: UInt, dwbackupflags: CSBACKUP_TYPE, phbc: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW(pwszservername, grbitjet.toInt(), dwbackupflags.toInt(), phbc)

public actual fun CertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: UInt, pcbread: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead(hbc, pvbuffer, cbbuffer.toInt(), pcbread)

public actual fun CertSrvBackupTruncateLogs(hbc: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs(hbc)

public actual fun CertSrvIsServerOnlineW(pwszservername: PCWSTR, pfserveronline: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW(pwszservername, pfserveronline)

public actual fun CertSrvRestoreEnd(hbc: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd(hbc)

public actual fun CertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW(hbc, ppwszzdatabaselocationlist, pcbsize)

public actual fun CertSrvRestorePrepareW(pwszservername: PCWSTR, dwrestoreflags: UInt, phbc: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW(pwszservername, dwrestoreflags.toInt(), phbc)

public actual fun CertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: HRESULT): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete(hbc, hrrestorestate)

public actual fun CertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap, pwszbackuplogpath, genlow.toInt(), genhigh.toInt())

public actual fun CertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap, pwszbackuplogpath, genlow.toInt(), genhigh.toInt())

public actual fun CertSrvServerControlW(pwszservername: PCWSTR, dwcontrolflags: UInt, pcbout: Long, ppbout: Long): HRESULT =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW(pwszservername, dwcontrolflags.toInt(), pcbout, ppbout)

public actual fun PstAcquirePrivateKey(pcert: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey(pcert)

public actual fun PstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain(pcert, ptrustedissuers, ppcertchaincontext)

public actual fun PstGetCertificates(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, bisclient: BOOL, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates(ptargetname, ccriteria.toInt(), rgpcriteria, bisclient, pdwcertchaincontextcount, ppcertchaincontexts)

public actual fun PstGetTrustAnchors(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pptrustedissuers: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors(ptargetname, ccriteria.toInt(), rgpcriteria, pptrustedissuers)

public actual fun PstGetTrustAnchorsEx(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx(ptargetname, ccriteria.toInt(), rgpcriteria, pcertcontext, pptrustedissuers)

public actual fun PstGetUserNameForCertificate(pcertcontext: Long, username: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate(pcertcontext, username)

public actual fun PstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate(pcert, ptokeninformationtype, pptokeninformation)

public actual fun PstValidate(ptargetname: Long, bisclient: BOOL, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): NTSTATUS =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssys_windows_win32_security_cryptography_certificates_PstValidate(ptargetname, bisclient, prequestedissuancepolicy, phadditionalcertstore, pcert, pprovguid)
