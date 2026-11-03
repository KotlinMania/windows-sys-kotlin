package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun CertSrvBackupClose(hbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupClose", longArrayOf(hbc)).toInt()
}

public fun CertSrvBackupEnd(hbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupEnd", longArrayOf(hbc)).toInt()
}

public fun CertSrvBackupFree(pv: Long) {
    Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupFree", longArrayOf(pv))
}

public fun CertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupGetBackupLogsW", longArrayOf(hbc, ppwszzbackuplogfiles, pcbsize)).toInt()
}

public fun CertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupGetDatabaseNamesW", longArrayOf(hbc, ppwszzattachmentinformation, pcbsize)).toInt()
}

public fun CertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupGetDynamicFileListW", longArrayOf(hbc, ppwszzfilelist, pcbsize)).toInt()
}

public fun CertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: PCWSTR, cbreadhintsize: UInt, plifilesize: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupOpenFileW", longArrayOf(hbc, pwszattachmentname, cbreadhintsize.toLong(), plifilesize)).toInt()
}

public fun CertSrvBackupPrepareW(pwszservername: PCWSTR, grbitjet: UInt, dwbackupflags: CSBACKUP_TYPE, phbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupPrepareW", longArrayOf(pwszservername, grbitjet.toLong(), dwbackupflags.toLong(), phbc)).toInt()
}

public fun CertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: UInt, pcbread: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupRead", longArrayOf(hbc, pvbuffer, cbbuffer.toLong(), pcbread)).toInt()
}

public fun CertSrvBackupTruncateLogs(hbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvBackupTruncateLogs", longArrayOf(hbc)).toInt()
}

public fun CertSrvIsServerOnlineW(pwszservername: PCWSTR, pfserveronline: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvIsServerOnlineW", longArrayOf(pwszservername, pfserveronline)).toInt()
}

public fun CertSrvRestoreEnd(hbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvRestoreEnd", longArrayOf(hbc)).toInt()
}

public fun CertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvRestoreGetDatabaseLocationsW", longArrayOf(hbc, ppwszzdatabaselocationlist, pcbsize)).toInt()
}

public fun CertSrvRestorePrepareW(pwszservername: PCWSTR, dwrestoreflags: UInt, phbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvRestorePrepareW", longArrayOf(pwszservername, dwrestoreflags.toLong(), phbc)).toInt()
}

public fun CertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: HRESULT): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvRestoreRegisterComplete", longArrayOf(hbc, hrrestorestate.toLong())).toInt()
}

public fun CertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvRestoreRegisterThroughFile", longArrayOf(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap.toLong(), pwszbackuplogpath, genlow.toLong(), genhigh.toLong())).toInt()
}

public fun CertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: PCWSTR, pwszlogpath: PCWSTR, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: PCWSTR, genlow: UInt, genhigh: UInt): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvRestoreRegisterW", longArrayOf(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap.toLong(), pwszbackuplogpath, genlow.toLong(), genhigh.toLong())).toInt()
}

public fun CertSrvServerControlW(pwszservername: PCWSTR, dwcontrolflags: UInt, pcbout: Long, ppbout: Long): HRESULT {
    return Win32DynamicFfi.invoke("certadm.dll", "CertSrvServerControlW", longArrayOf(pwszservername, dwcontrolflags.toLong(), pcbout, ppbout)).toInt()
}

public fun PstAcquirePrivateKey(pcert: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstAcquirePrivateKey", longArrayOf(pcert))
    return Foundation.NTSTATUS()
}

public fun PstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstGetCertificateChain", longArrayOf(pcert, ptrustedissuers, ppcertchaincontext))
    return Foundation.NTSTATUS()
}

public fun PstGetCertificates(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, bisclient: BOOL, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstGetCertificates", longArrayOf(ptargetname, ccriteria.toLong(), rgpcriteria, bisclient.toLong(), pdwcertchaincontextcount, ppcertchaincontexts))
    return Foundation.NTSTATUS()
}

public fun PstGetTrustAnchors(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pptrustedissuers: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstGetTrustAnchors", longArrayOf(ptargetname, ccriteria.toLong(), rgpcriteria, pptrustedissuers))
    return Foundation.NTSTATUS()
}

public fun PstGetTrustAnchorsEx(ptargetname: Long, ccriteria: UInt, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstGetTrustAnchorsEx", longArrayOf(ptargetname, ccriteria.toLong(), rgpcriteria, pcertcontext, pptrustedissuers))
    return Foundation.NTSTATUS()
}

public fun PstGetUserNameForCertificate(pcertcontext: Long, username: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstGetUserNameForCertificate", longArrayOf(pcertcontext, username))
    return Foundation.NTSTATUS()
}

public fun PstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstMapCertificate", longArrayOf(pcert, ptokeninformationtype, pptokeninformation))
    return Foundation.NTSTATUS()
}

public fun PstValidate(ptargetname: Long, bisclient: BOOL, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("certpoleng.dll", "PstValidate", longArrayOf(ptargetname, bisclient.toLong(), prequestedissuancepolicy, phadditionalcertstore, pcert, pprovguid))
    return Foundation.NTSTATUS()
}
