package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun CertSrvBackupClose(hbc: Long): HRESULT

public expect fun CertSrvBackupEnd(hbc: Long): HRESULT

public expect fun CertSrvBackupFree(pv: Long)

public expect fun CertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): HRESULT

public expect fun CertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): HRESULT

public expect fun CertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): HRESULT

public expect fun CertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: PCWSTR, cbreadhintsize: UInt, plifilesize: Long): HRESULT

public expect fun CertSrvBackupPrepareW(pwszservername: PCWSTR, grbitjet: UInt, dwbackupflags: CSBACKUP_TYPE, phbc: Long): HRESULT

public expect fun CertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: UInt, pcbread: Long): HRESULT

public expect fun CertSrvBackupTruncateLogs(hbc: Long): HRESULT

public expect fun CertSrvIsServerOnlineW(pwszservername: PCWSTR, pfserveronline: Long): HRESULT

public expect fun CertSrvRestoreEnd(hbc: Long): HRESULT

public expect fun CertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): HRESULT

public expect fun CertSrvRestorePrepareW(pwszservername: PCWSTR, dwrestoreflags: UInt, phbc: Long): HRESULT

public expect fun CertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: HRESULT): HRESULT

public expect fun CertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT

public expect fun CertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT

public expect fun CertSrvServerControlW(pwszservername: PCWSTR, dwcontrolflags: UInt, pcbout: Long, ppbout: Long): HRESULT

public expect fun PstAcquirePrivateKey(pcert: Long): NTSTATUS

public expect fun PstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): NTSTATUS

public expect fun PstGetCertificates(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, bisclient: BOOL, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): NTSTATUS

public expect fun PstGetTrustAnchors(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pptrustedissuers: Long): NTSTATUS

public expect fun PstGetTrustAnchorsEx(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): NTSTATUS

public expect fun PstGetUserNameForCertificate(pcertcontext: Long, username: Long): NTSTATUS

public expect fun PstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): NTSTATUS

public expect fun PstValidate(ptargetname: Long, bisclient: BOOL, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): NTSTATUS
