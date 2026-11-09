@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CertSrvBackupClose(hbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose(hbc.toCPointer<ByteVar>())

public actual fun CertSrvBackupEnd(hbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd(hbc.toCPointer<ByteVar>())

public actual fun CertSrvBackupFree(pv: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree(pv.toCPointer<ByteVar>())
}

public actual fun CertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW(hbc.toCPointer<ByteVar>(), ppwszzbackuplogfiles.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun CertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW(hbc.toCPointer<ByteVar>(), ppwszzattachmentinformation.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun CertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW(hbc.toCPointer<ByteVar>(), ppwszzfilelist.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun CertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: PCWSTR, cbreadhintsize: UInt, plifilesize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW(hbc.toCPointer<ByteVar>(), pwszattachmentname.toCPointer<ByteVar>(), cbreadhintsize, plifilesize.toCPointer<ByteVar>())

public actual fun CertSrvBackupPrepareW(pwszservername: PCWSTR, grbitjet: UInt, dwbackupflags: CSBACKUP_TYPE, phbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW(pwszservername.toCPointer<ByteVar>(), grbitjet, dwbackupflags, phbc.toCPointer<ByteVar>())

public actual fun CertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: UInt, pcbread: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead(hbc.toCPointer<ByteVar>(), pvbuffer.toCPointer<ByteVar>(), cbbuffer, pcbread.toCPointer<ByteVar>())

public actual fun CertSrvBackupTruncateLogs(hbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs(hbc.toCPointer<ByteVar>())

public actual fun CertSrvIsServerOnlineW(pwszservername: PCWSTR, pfserveronline: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW(pwszservername.toCPointer<ByteVar>(), pfserveronline.toCPointer<ByteVar>())

public actual fun CertSrvRestoreEnd(hbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd(hbc.toCPointer<ByteVar>())

public actual fun CertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW(hbc.toCPointer<ByteVar>(), ppwszzdatabaselocationlist.toCPointer<ByteVar>(), pcbsize.toCPointer<ByteVar>())

public actual fun CertSrvRestorePrepareW(pwszservername: PCWSTR, dwrestoreflags: UInt, phbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW(pwszservername.toCPointer<ByteVar>(), dwrestoreflags, phbc.toCPointer<ByteVar>())

public actual fun CertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: HRESULT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete(hbc.toCPointer<ByteVar>(), hrrestorestate)

public actual fun CertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile(hbc.toCPointer<ByteVar>(), pwszcheckpointfilepath.toCPointer<ByteVar>(), pwszlogpath.toCPointer<ByteVar>(), rgrstmap.toCPointer<ByteVar>(), crstmap, pwszbackuplogpath.toCPointer<ByteVar>(), genlow, genhigh)

public actual fun CertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW(hbc.toCPointer<ByteVar>(), pwszcheckpointfilepath.toCPointer<ByteVar>(), pwszlogpath.toCPointer<ByteVar>(), rgrstmap.toCPointer<ByteVar>(), crstmap, pwszbackuplogpath.toCPointer<ByteVar>(), genlow, genhigh)

public actual fun CertSrvServerControlW(pwszservername: PCWSTR, dwcontrolflags: UInt, pcbout: Long, ppbout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW(pwszservername.toCPointer<ByteVar>(), dwcontrolflags, pcbout.toCPointer<ByteVar>(), ppbout.toCPointer<ByteVar>())

public actual fun PstAcquirePrivateKey(pcert: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey(pcert.toCPointer<ByteVar>())

public actual fun PstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain(pcert.toCPointer<ByteVar>(), ptrustedissuers.toCPointer<ByteVar>(), ppcertchaincontext.toCPointer<ByteVar>())

public actual fun PstGetCertificates(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, bisclient: BOOL, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates(ptargetname.toCPointer<ByteVar>(), ccriteria, rgpcriteria.toCPointer<ByteVar>(), bisclient, pdwcertchaincontextcount.toCPointer<ByteVar>(), ppcertchaincontexts.toCPointer<ByteVar>())

public actual fun PstGetTrustAnchors(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pptrustedissuers: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors(ptargetname.toCPointer<ByteVar>(), ccriteria, rgpcriteria.toCPointer<ByteVar>(), pptrustedissuers.toCPointer<ByteVar>())

public actual fun PstGetTrustAnchorsEx(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx(ptargetname.toCPointer<ByteVar>(), ccriteria, rgpcriteria.toCPointer<ByteVar>(), pcertcontext.toCPointer<ByteVar>(), pptrustedissuers.toCPointer<ByteVar>())

public actual fun PstGetUserNameForCertificate(pcertcontext: Long, username: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate(pcertcontext.toCPointer<ByteVar>(), username.toCPointer<ByteVar>())

public actual fun PstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate(pcert.toCPointer<ByteVar>(), ptokeninformationtype.toCPointer<ByteVar>(), pptokeninformation.toCPointer<ByteVar>())

public actual fun PstValidate(ptargetname: Long, bisclient: BOOL, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_PstValidate(ptargetname.toCPointer<ByteVar>(), bisclient, prequestedissuancepolicy.toCPointer<ByteVar>(), phadditionalcertstore.toCPointer<ByteVar>(), pcert.toCPointer<ByteVar>(), pprovguid.toCPointer<ByteVar>())
