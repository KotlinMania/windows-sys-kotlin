package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun certSrvBackupClose(hbc: COpaquePointer?): Hresult

public expect fun certSrvBackupEnd(hbc: COpaquePointer?): Hresult

public expect fun certSrvBackupFree(pv: COpaquePointer?)

public expect fun certSrvBackupGetBackupLogsW(hbc: COpaquePointer?, ppwszzbackuplogfiles: COpaquePointer?, pcbsize: COpaquePointer?): Hresult

public expect fun certSrvBackupGetDatabaseNamesW(hbc: COpaquePointer?, ppwszzattachmentinformation: COpaquePointer?, pcbsize: COpaquePointer?): Hresult

public expect fun certSrvBackupGetDynamicFileListW(hbc: COpaquePointer?, ppwszzfilelist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult

public expect fun certSrvBackupOpenFileW(hbc: COpaquePointer?, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: COpaquePointer?): Hresult

public expect fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: COpaquePointer?): Hresult

public expect fun certSrvBackupRead(hbc: COpaquePointer?, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbread: COpaquePointer?): Hresult

public expect fun certSrvBackupTruncateLogs(hbc: COpaquePointer?): Hresult

public expect fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: COpaquePointer?): Hresult

public expect fun certSrvRestoreEnd(hbc: COpaquePointer?): Hresult

public expect fun certSrvRestoreGetDatabaseLocationsW(hbc: COpaquePointer?, ppwszzdatabaselocationlist: COpaquePointer?, pcbsize: COpaquePointer?): Hresult

public expect fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: COpaquePointer?): Hresult

public expect fun certSrvRestoreRegisterComplete(hbc: COpaquePointer?, hrrestorestate: Hresult): Hresult

public expect fun certSrvRestoreRegisterThroughFile(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult

public expect fun certSrvRestoreRegisterW(hbc: COpaquePointer?, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: COpaquePointer?, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult

public expect fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: COpaquePointer?, ppbout: COpaquePointer?): Hresult

public expect fun pstAcquirePrivateKey(pcert: COpaquePointer?): Ntstatus

public expect fun pstGetCertificateChain(pcert: COpaquePointer?, ptrustedissuers: COpaquePointer?, ppcertchaincontext: COpaquePointer?): Ntstatus

public expect fun pstGetCertificates(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, bisclient: Bool, pdwcertchaincontextcount: COpaquePointer?, ppcertchaincontexts: COpaquePointer?): Ntstatus

public expect fun pstGetTrustAnchors(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus

public expect fun pstGetTrustAnchorsEx(ptargetname: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, pcertcontext: COpaquePointer?, pptrustedissuers: COpaquePointer?): Ntstatus

public expect fun pstGetUserNameForCertificate(pcertcontext: COpaquePointer?, username: COpaquePointer?): Ntstatus

public expect fun pstMapCertificate(pcert: COpaquePointer?, ptokeninformationtype: COpaquePointer?, pptokeninformation: COpaquePointer?): Ntstatus

public expect fun pstValidate(ptargetname: COpaquePointer?, bisclient: Bool, prequestedissuancepolicy: COpaquePointer?, phadditionalcertstore: COpaquePointer?, pcert: COpaquePointer?, pprovguid: COpaquePointer?): Ntstatus
