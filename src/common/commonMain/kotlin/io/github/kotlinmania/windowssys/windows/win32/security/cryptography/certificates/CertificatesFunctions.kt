package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun certSrvBackupClose(hbc: MutPtr): Hresult

public expect fun certSrvBackupEnd(hbc: MutPtr): Hresult

public expect fun certSrvBackupFree(pv: MutPtr)

public expect fun certSrvBackupGetBackupLogsW(hbc: ConstPtr, ppwszzbackuplogfiles: MutPtr, pcbsize: MutPtr): Hresult

public expect fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr, ppwszzattachmentinformation: MutPtr, pcbsize: MutPtr): Hresult

public expect fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr, ppwszzfilelist: MutPtr, pcbsize: MutPtr): Hresult

public expect fun certSrvBackupOpenFileW(hbc: MutPtr, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr): Hresult

public expect fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr): Hresult

public expect fun certSrvBackupRead(hbc: MutPtr, pvbuffer: MutPtr, cbbuffer: UInt, pcbread: MutPtr): Hresult

public expect fun certSrvBackupTruncateLogs(hbc: MutPtr): Hresult

public expect fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr): Hresult

public expect fun certSrvRestoreEnd(hbc: MutPtr): Hresult

public expect fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr, ppwszzdatabaselocationlist: MutPtr, pcbsize: MutPtr): Hresult

public expect fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr): Hresult

public expect fun certSrvRestoreRegisterComplete(hbc: MutPtr, hrrestorestate: Hresult): Hresult

public expect fun certSrvRestoreRegisterThroughFile(hbc: MutPtr, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult

public expect fun certSrvRestoreRegisterW(hbc: MutPtr, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult

public expect fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr, ppbout: MutPtr): Hresult

public expect fun pstAcquirePrivateKey(pcert: ConstPtr): Ntstatus

public expect fun pstGetCertificateChain(pcert: ConstPtr, ptrustedissuers: ConstPtr, ppcertchaincontext: MutPtr): Ntstatus

public expect fun pstGetCertificates(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, bisclient: Bool, pdwcertchaincontextcount: MutPtr, ppcertchaincontexts: MutPtr): Ntstatus

public expect fun pstGetTrustAnchors(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, pptrustedissuers: MutPtr): Ntstatus

public expect fun pstGetTrustAnchorsEx(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, pcertcontext: ConstPtr, pptrustedissuers: MutPtr): Ntstatus

public expect fun pstGetUserNameForCertificate(pcertcontext: ConstPtr, username: MutPtr): Ntstatus

public expect fun pstMapCertificate(pcert: ConstPtr, ptokeninformationtype: MutPtr, pptokeninformation: MutPtr): Ntstatus

public expect fun pstValidate(ptargetname: ConstPtr, bisclient: Bool, prequestedissuancepolicy: ConstPtr, phadditionalcertstore: ConstPtr, pcert: ConstPtr, pprovguid: MutPtr): Ntstatus
