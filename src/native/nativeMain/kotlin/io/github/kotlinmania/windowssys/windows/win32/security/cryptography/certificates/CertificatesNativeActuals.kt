@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates.cinterop.windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun certSrvBackupClose(hbc: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(hbc.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupEnd(hbc: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(hbc.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupFree(pv: MutPtr<CVoid>) {
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(pv.rawAddress.toCPointer<ByteVar>())
}

public actual fun certSrvBackupGetBackupLogsW(hbc: ConstPtr<CVoid>, ppwszzbackuplogfiles: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(hbc.rawAddress.toCPointer<ByteVar>(), ppwszzbackuplogfiles.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr<CVoid>, ppwszzattachmentinformation: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(hbc.rawAddress.toCPointer<ByteVar>(), ppwszzattachmentinformation.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr<CVoid>, ppwszzfilelist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(hbc.rawAddress.toCPointer<ByteVar>(), ppwszzfilelist.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupOpenFileW(hbc: MutPtr<CVoid>, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr<Long>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(hbc.rawAddress.toCPointer<ByteVar>(), pwszattachmentname.rawAddress.toCPointer<ByteVar>(), cbreadhintsize, plifilesize.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(pwszservername.rawAddress.toCPointer<ByteVar>(), grbitjet, dwbackupflags, phbc.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupRead(hbc: MutPtr<CVoid>, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbread: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(hbc.rawAddress.toCPointer<ByteVar>(), pvbuffer.rawAddress.toCPointer<ByteVar>(), cbbuffer, pcbread.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvBackupTruncateLogs(hbc: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(hbc.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(pwszservername.rawAddress.toCPointer<ByteVar>(), pfserveronline.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvRestoreEnd(hbc: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(hbc.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr<CVoid>, ppwszzdatabaselocationlist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(hbc.rawAddress.toCPointer<ByteVar>(), ppwszzdatabaselocationlist.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(pwszservername.rawAddress.toCPointer<ByteVar>(), dwrestoreflags, phbc.rawAddress.toCPointer<ByteVar>())

public actual fun certSrvRestoreRegisterComplete(hbc: MutPtr<CVoid>, hrrestorestate: Hresult): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(hbc.rawAddress.toCPointer<ByteVar>(), hrrestorestate)

public actual fun certSrvRestoreRegisterThroughFile(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(hbc.rawAddress.toCPointer<ByteVar>(), pwszcheckpointfilepath.rawAddress.toCPointer<ByteVar>(), pwszlogpath.rawAddress.toCPointer<ByteVar>(), rgrstmap.rawAddress.toCPointer<ByteVar>(), crstmap, pwszbackuplogpath.rawAddress.toCPointer<ByteVar>(), genlow, genhigh)

public actual fun certSrvRestoreRegisterW(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(hbc.rawAddress.toCPointer<ByteVar>(), pwszcheckpointfilepath.rawAddress.toCPointer<ByteVar>(), pwszlogpath.rawAddress.toCPointer<ByteVar>(), rgrstmap.rawAddress.toCPointer<ByteVar>(), crstmap, pwszbackuplogpath.rawAddress.toCPointer<ByteVar>(), genlow, genhigh)

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr<UInt>, ppbout: MutPtr<MutPtr<UByte>>): Hresult =
    windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(pwszservername.rawAddress.toCPointer<ByteVar>(), dwcontrolflags, pcbout.rawAddress.toCPointer<ByteVar>(), ppbout.rawAddress.toCPointer<ByteVar>())

public actual fun pstAcquirePrivateKey(pcert: ConstPtr<CertContext>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(pcert.rawAddress.toCPointer<ByteVar>())

public actual fun pstGetCertificateChain(pcert: ConstPtr<CertContext>, ptrustedissuers: ConstPtr<SecPkgContextIssuerListInfoEx>, ppcertchaincontext: MutPtr<MutPtr<CertChainContext>>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(pcert.rawAddress.toCPointer<ByteVar>(), ptrustedissuers.rawAddress.toCPointer<ByteVar>(), ppcertchaincontext.rawAddress.toCPointer<ByteVar>())

public actual fun pstGetCertificates(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, bisclient: Bool, pdwcertchaincontextcount: MutPtr<UInt>, ppcertchaincontexts: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(ptargetname.rawAddress.toCPointer<ByteVar>(), ccriteria, rgpcriteria.rawAddress.toCPointer<ByteVar>(), bisclient, pdwcertchaincontextcount.rawAddress.toCPointer<ByteVar>(), ppcertchaincontexts.rawAddress.toCPointer<ByteVar>())

public actual fun pstGetTrustAnchors(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(ptargetname.rawAddress.toCPointer<ByteVar>(), ccriteria, rgpcriteria.rawAddress.toCPointer<ByteVar>(), pptrustedissuers.rawAddress.toCPointer<ByteVar>())

public actual fun pstGetTrustAnchorsEx(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pcertcontext: ConstPtr<CertContext>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(ptargetname.rawAddress.toCPointer<ByteVar>(), ccriteria, rgpcriteria.rawAddress.toCPointer<ByteVar>(), pcertcontext.rawAddress.toCPointer<ByteVar>(), pptrustedissuers.rawAddress.toCPointer<ByteVar>())

public actual fun pstGetUserNameForCertificate(pcertcontext: ConstPtr<CertContext>, username: MutPtr<UnicodeString>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(pcertcontext.rawAddress.toCPointer<ByteVar>(), username.rawAddress.toCPointer<ByteVar>())

public actual fun pstMapCertificate(pcert: ConstPtr<CertContext>, ptokeninformationtype: MutPtr<LsaTokenInformationType>, pptokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(pcert.rawAddress.toCPointer<ByteVar>(), ptokeninformationtype.rawAddress.toCPointer<ByteVar>(), pptokeninformation.rawAddress.toCPointer<ByteVar>())

public actual fun pstValidate(ptargetname: ConstPtr<UnicodeString>, bisclient: Bool, prequestedissuancepolicy: ConstPtr<CertUsageMatch>, phadditionalcertstore: ConstPtr<Hcertstore>, pcert: ConstPtr<CertContext>, pprovguid: MutPtr<Guid>): Ntstatus =
    windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(ptargetname.rawAddress.toCPointer<ByteVar>(), bisclient, prequestedissuancepolicy.rawAddress.toCPointer<ByteVar>(), phadditionalcertstore.rawAddress.toCPointer<ByteVar>(), pcert.rawAddress.toCPointer<ByteVar>(), pprovguid.rawAddress.toCPointer<ByteVar>())
