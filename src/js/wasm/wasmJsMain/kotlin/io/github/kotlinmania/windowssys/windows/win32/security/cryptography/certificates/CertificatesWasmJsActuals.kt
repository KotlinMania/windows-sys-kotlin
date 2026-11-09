@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public actual fun CertSrvBackupClose(hbc: Long): HRESULT =
    0

public actual fun CertSrvBackupEnd(hbc: Long): HRESULT =
    0

public actual fun CertSrvBackupFree(pv: Long) {
}

public actual fun CertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): HRESULT =
    0

public actual fun CertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): HRESULT =
    0

public actual fun CertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): HRESULT =
    0

public actual fun CertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: PCWSTR, cbreadhintsize: UInt, plifilesize: Long): HRESULT =
    0

public actual fun CertSrvBackupPrepareW(pwszservername: PCWSTR, grbitjet: UInt, dwbackupflags: CSBACKUP_TYPE, phbc: Long): HRESULT =
    0

public actual fun CertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: UInt, pcbread: Long): HRESULT =
    0

public actual fun CertSrvBackupTruncateLogs(hbc: Long): HRESULT =
    0

public actual fun CertSrvIsServerOnlineW(pwszservername: PCWSTR, pfserveronline: Long): HRESULT =
    0

public actual fun CertSrvRestoreEnd(hbc: Long): HRESULT =
    0

public actual fun CertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): HRESULT =
    0

public actual fun CertSrvRestorePrepareW(pwszservername: PCWSTR, dwrestoreflags: UInt, phbc: Long): HRESULT =
    0

public actual fun CertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: HRESULT): HRESULT =
    0

public actual fun CertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    0

public actual fun CertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT =
    0

public actual fun CertSrvServerControlW(pwszservername: PCWSTR, dwcontrolflags: UInt, pcbout: Long, ppbout: Long): HRESULT =
    0

public actual fun PstAcquirePrivateKey(pcert: Long): NTSTATUS =
    0

public actual fun PstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): NTSTATUS =
    0

public actual fun PstGetCertificates(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, bisclient: BOOL, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): NTSTATUS =
    0

public actual fun PstGetTrustAnchors(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pptrustedissuers: Long): NTSTATUS =
    0

public actual fun PstGetTrustAnchorsEx(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): NTSTATUS =
    0

public actual fun PstGetUserNameForCertificate(pcertcontext: Long, username: Long): NTSTATUS =
    0

public actual fun PstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): NTSTATUS =
    0

public actual fun PstValidate(ptargetname: Long, bisclient: BOOL, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): NTSTATUS =
    0
