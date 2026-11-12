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

public expect fun certSrvBackupClose(hbc: MutPtr<CVoid>): Hresult

public expect fun certSrvBackupEnd(hbc: MutPtr<CVoid>): Hresult

public expect fun certSrvBackupFree(pv: MutPtr<CVoid>)

public expect fun certSrvBackupGetBackupLogsW(hbc: ConstPtr<CVoid>, ppwszzbackuplogfiles: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult

public expect fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr<CVoid>, ppwszzattachmentinformation: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult

public expect fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr<CVoid>, ppwszzfilelist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult

public expect fun certSrvBackupOpenFileW(hbc: MutPtr<CVoid>, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr<Long>): Hresult

public expect fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun certSrvBackupRead(hbc: MutPtr<CVoid>, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbread: MutPtr<UInt>): Hresult

public expect fun certSrvBackupTruncateLogs(hbc: MutPtr<CVoid>): Hresult

public expect fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr<Bool>): Hresult

public expect fun certSrvRestoreEnd(hbc: MutPtr<CVoid>): Hresult

public expect fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr<CVoid>, ppwszzdatabaselocationlist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult

public expect fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun certSrvRestoreRegisterComplete(hbc: MutPtr<CVoid>, hrrestorestate: Hresult): Hresult

public expect fun certSrvRestoreRegisterThroughFile(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult

public expect fun certSrvRestoreRegisterW(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult

public expect fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr<UInt>, ppbout: MutPtr<MutPtr<UByte>>): Hresult

public expect fun pstAcquirePrivateKey(pcert: ConstPtr<CertContext>): Ntstatus

public expect fun pstGetCertificateChain(pcert: ConstPtr<CertContext>, ptrustedissuers: ConstPtr<SecPkgContextIssuerListInfoEx>, ppcertchaincontext: MutPtr<MutPtr<CertChainContext>>): Ntstatus

public expect fun pstGetCertificates(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, bisclient: Bool, pdwcertchaincontextcount: MutPtr<UInt>, ppcertchaincontexts: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Ntstatus

public expect fun pstGetTrustAnchors(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus

public expect fun pstGetTrustAnchorsEx(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pcertcontext: ConstPtr<CertContext>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus

public expect fun pstGetUserNameForCertificate(pcertcontext: ConstPtr<CertContext>, username: MutPtr<UnicodeString>): Ntstatus

public expect fun pstMapCertificate(pcert: ConstPtr<CertContext>, ptokeninformationtype: MutPtr<LsaTokenInformationType>, pptokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun pstValidate(ptargetname: ConstPtr<UnicodeString>, bisclient: Bool, prequestedissuancepolicy: ConstPtr<CertUsageMatch>, phadditionalcertstore: ConstPtr<Hcertstore>, pcert: ConstPtr<CertContext>, pprovguid: MutPtr<Guid>): Ntstatus
