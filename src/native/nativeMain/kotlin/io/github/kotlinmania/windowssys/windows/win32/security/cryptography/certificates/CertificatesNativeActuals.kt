@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssys_windows_win32_security_cryptography_certificates_pstValidate
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun certSrvBackupClose(hbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupClose(hbc?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupEnd(hbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupEnd(hbc?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupFree(pv: COpaquePointer?) {
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupFree(pv?.value?.toCPointer<ByteVar>())
}

public actual fun certSrvBackupGetBackupLogsW(hbc: COpaquePointer?, ppwszzbackuplogfiles: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetBackupLogsW(hbc?.value?.toCPointer<ByteVar>(), ppwszzbackuplogfiles?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupGetDatabaseNamesW(hbc: COpaquePointer?, ppwszzattachmentinformation: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDatabaseNamesW(hbc?.value?.toCPointer<ByteVar>(), ppwszzattachmentinformation?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupGetDynamicFileListW(hbc: COpaquePointer?, ppwszzfilelist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupGetDynamicFileListW(hbc?.value?.toCPointer<ByteVar>(), ppwszzfilelist?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupOpenFileW(hbc: COpaquePointer?, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupOpenFileW(hbc?.value?.toCPointer<ByteVar>(), pwszattachmentname?.value?.toCPointer<ByteVar>(), cbreadhintsize, plifilesize?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupPrepareW(pwszservername?.value?.toCPointer<ByteVar>(), grbitjet, dwbackupflags, phbc?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupRead(hbc: COpaquePointer?, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbread: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupRead(hbc?.value?.toCPointer<ByteVar>(), pvbuffer?.value?.toCPointer<ByteVar>(), cbbuffer, pcbread?.value?.toCPointer<ByteVar>())

public actual fun certSrvBackupTruncateLogs(hbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvBackupTruncateLogs(hbc?.value?.toCPointer<ByteVar>())

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvIsServerOnlineW(pwszservername?.value?.toCPointer<ByteVar>(), pfserveronline?.value?.toCPointer<ByteVar>())

public actual fun certSrvRestoreEnd(hbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreEnd(hbc?.value?.toCPointer<ByteVar>())

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: COpaquePointer?, ppwszzdatabaselocationlist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreGetDatabaseLocationsW(hbc?.value?.toCPointer<ByteVar>(), ppwszzdatabaselocationlist?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvRestorePrepareW(pwszservername?.value?.toCPointer<ByteVar>(), dwrestoreflags, phbc?.value?.toCPointer<ByteVar>())

public actual fun certSrvRestoreRegisterComplete(hbc: COpaquePointer?, hrrestorestate: Hresult): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterComplete(hbc?.value?.toCPointer<ByteVar>(), hrrestorestate)

public actual fun certSrvRestoreRegisterThroughFile(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterThroughFile(hbc?.value?.toCPointer<ByteVar>(), pwszcheckpointfilepath?.value?.toCPointer<ByteVar>(), pwszlogpath?.value?.toCPointer<ByteVar>(), rgrstmap?.value?.toCPointer<ByteVar>(), crstmap, pwszbackuplogpath?.value?.toCPointer<ByteVar>(), genlow, genhigh)

public actual fun certSrvRestoreRegisterW(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvRestoreRegisterW(hbc?.value?.toCPointer<ByteVar>(), pwszcheckpointfilepath?.value?.toCPointer<ByteVar>(), pwszlogpath?.value?.toCPointer<ByteVar>(), rgrstmap?.value?.toCPointer<ByteVar>(), crstmap, pwszbackuplogpath?.value?.toCPointer<ByteVar>(), genlow, genhigh)

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: COpaquePointer?, ppbout: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_cryptography_certificates_certSrvServerControlW(pwszservername?.value?.toCPointer<ByteVar>(), dwcontrolflags, pcbout?.value?.toCPointer<ByteVar>(), ppbout?.value?.toCPointer<ByteVar>())

public actual fun pstAcquirePrivateKey(pcert: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstAcquirePrivateKey(pcert?.value?.toCPointer<ByteVar>())

public actual fun pstGetCertificateChain(pcert: COpaquePointer?, ptrustedissuers: COpaquePointer?, ppcertchaincontext: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstGetCertificateChain(pcert?.value?.toCPointer<ByteVar>(), ptrustedissuers?.value?.toCPointer<ByteVar>(), ppcertchaincontext?.value?.toCPointer<ByteVar>())

public actual fun pstGetCertificates(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, bisclient: Bool, pdwcertchaincontextcount: COpaquePointer?, ppcertchaincontexts: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstGetCertificates(ptargetname?.value?.toCPointer<ByteVar>(), ccriteria, rgpcriteria?.value?.toCPointer<ByteVar>(), bisclient, pdwcertchaincontextcount?.value?.toCPointer<ByteVar>(), ppcertchaincontexts?.value?.toCPointer<ByteVar>())

public actual fun pstGetTrustAnchors(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchors(ptargetname?.value?.toCPointer<ByteVar>(), ccriteria, rgpcriteria?.value?.toCPointer<ByteVar>(), pptrustedissuers?.value?.toCPointer<ByteVar>())

public actual fun pstGetTrustAnchorsEx(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pcertcontext: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstGetTrustAnchorsEx(ptargetname?.value?.toCPointer<ByteVar>(), ccriteria, rgpcriteria?.value?.toCPointer<ByteVar>(), pcertcontext?.value?.toCPointer<ByteVar>(), pptrustedissuers?.value?.toCPointer<ByteVar>())

public actual fun pstGetUserNameForCertificate(pcertcontext: COpaquePointer?, username: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstGetUserNameForCertificate(pcertcontext?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>())

public actual fun pstMapCertificate(pcert: COpaquePointer?, ptokeninformationtype: COpaquePointer?, pptokeninformation: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstMapCertificate(pcert?.value?.toCPointer<ByteVar>(), ptokeninformationtype?.value?.toCPointer<ByteVar>(), pptokeninformation?.value?.toCPointer<ByteVar>())

public actual fun pstValidate(ptargetname: COpaquePointer?, bisclient: Bool, prequestedissuancepolicy: COpaquePointer?, phadditionalcertstore: COpaquePointer?, pcert: COpaquePointer?, pprovguid: COpaquePointer?): Ntstatus =
    windowssys_windows_win32_security_cryptography_certificates_pstValidate(ptargetname?.value?.toCPointer<ByteVar>(), bisclient, prequestedissuancepolicy?.value?.toCPointer<ByteVar>(), phadditionalcertstore?.value?.toCPointer<ByteVar>(), pcert?.value?.toCPointer<ByteVar>(), pprovguid?.value?.toCPointer<ByteVar>())
