@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWin32SecurityCryptographyCertificatesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(hbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(hbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(pv: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(hbc: Long, ppwszzbackuplogfiles: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(hbc: Long, ppwszzattachmentinformation: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(hbc: Long, ppwszzfilelist: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(hbc: Long, pwszattachmentname: Long, cbreadhintsize: Int, plifilesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(pwszservername: Long, grbitjet: Int, dwbackupflags: Int, phbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(hbc: Long, pvbuffer: Long, cbbuffer: Int, pcbread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(hbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(pwszservername: Long, pfserveronline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(hbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(hbc: Long, ppwszzdatabaselocationlist: Long, pcbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(pwszservername: Long, dwrestoreflags: Int, phbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(hbc: Long, hrrestorestate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(hbc: Long, pwszcheckpointfilepath: Long, pwszlogpath: Long, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: Long, genlow: Int, genhigh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(hbc: Long, pwszcheckpointfilepath: Long, pwszlogpath: Long, rgrstmap: Long, crstmap: Int, pwszbackuplogpath: Long, genlow: Int, genhigh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(pwszservername: Long, dwcontrolflags: Int, pcbout: Long, ppbout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(pcert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(pcert: Long, ptrustedissuers: Long, ppcertchaincontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, bisclient: Int, pdwcertchaincontextcount: Long, ppcertchaincontexts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, pptrustedissuers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(ptargetname: Long, ccriteria: Int, rgpcriteria: Long, pcertcontext: Long, pptrustedissuers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(pcertcontext: Long, username: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(pcert: Long, ptokeninformationtype: Long, pptokeninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(ptargetname: Long, bisclient: Int, prequestedissuancepolicy: Long, phadditionalcertstore: Long, pcert: Long, pprovguid: Long): Int
}

public actual fun certSrvBackupClose(hbc: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(hbc.rawAddress)

public actual fun certSrvBackupEnd(hbc: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(hbc.rawAddress)

public actual fun certSrvBackupFree(pv: MutPtr) {
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(pv.rawAddress)
}

public actual fun certSrvBackupGetBackupLogsW(hbc: ConstPtr, ppwszzbackuplogfiles: MutPtr, pcbsize: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(hbc.rawAddress, ppwszzbackuplogfiles.rawAddress, pcbsize.rawAddress)

public actual fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr, ppwszzattachmentinformation: MutPtr, pcbsize: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(hbc.rawAddress, ppwszzattachmentinformation.rawAddress, pcbsize.rawAddress)

public actual fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr, ppwszzfilelist: MutPtr, pcbsize: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(hbc.rawAddress, ppwszzfilelist.rawAddress, pcbsize.rawAddress)

public actual fun certSrvBackupOpenFileW(hbc: MutPtr, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(hbc.rawAddress, pwszattachmentname.rawAddress, cbreadhintsize.toInt(), plifilesize.rawAddress)

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(pwszservername.rawAddress, grbitjet.toInt(), dwbackupflags.toInt(), phbc.rawAddress)

public actual fun certSrvBackupRead(hbc: MutPtr, pvbuffer: MutPtr, cbbuffer: UInt, pcbread: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(hbc.rawAddress, pvbuffer.rawAddress, cbbuffer.toInt(), pcbread.rawAddress)

public actual fun certSrvBackupTruncateLogs(hbc: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(hbc.rawAddress)

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(pwszservername.rawAddress, pfserveronline.rawAddress)

public actual fun certSrvRestoreEnd(hbc: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(hbc.rawAddress)

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr, ppwszzdatabaselocationlist: MutPtr, pcbsize: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(hbc.rawAddress, ppwszzdatabaselocationlist.rawAddress, pcbsize.rawAddress)

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(pwszservername.rawAddress, dwrestoreflags.toInt(), phbc.rawAddress)

public actual fun certSrvRestoreRegisterComplete(hbc: MutPtr, hrrestorestate: Hresult): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(hbc.rawAddress, hrrestorestate)

public actual fun certSrvRestoreRegisterThroughFile(hbc: MutPtr, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(hbc.rawAddress, pwszcheckpointfilepath.rawAddress, pwszlogpath.rawAddress, rgrstmap.rawAddress, crstmap, pwszbackuplogpath.rawAddress, genlow.toInt(), genhigh.toInt())

public actual fun certSrvRestoreRegisterW(hbc: MutPtr, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(hbc.rawAddress, pwszcheckpointfilepath.rawAddress, pwszlogpath.rawAddress, rgrstmap.rawAddress, crstmap, pwszbackuplogpath.rawAddress, genlow.toInt(), genhigh.toInt())

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr, ppbout: MutPtr): Hresult =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(pwszservername.rawAddress, dwcontrolflags.toInt(), pcbout.rawAddress, ppbout.rawAddress)

public actual fun pstAcquirePrivateKey(pcert: ConstPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(pcert.rawAddress)

public actual fun pstGetCertificateChain(pcert: ConstPtr, ptrustedissuers: ConstPtr, ppcertchaincontext: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(pcert.rawAddress, ptrustedissuers.rawAddress, ppcertchaincontext.rawAddress)

public actual fun pstGetCertificates(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, bisclient: Bool, pdwcertchaincontextcount: MutPtr, ppcertchaincontexts: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(ptargetname.rawAddress, ccriteria.toInt(), rgpcriteria.rawAddress, bisclient, pdwcertchaincontextcount.rawAddress, ppcertchaincontexts.rawAddress)

public actual fun pstGetTrustAnchors(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, pptrustedissuers: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(ptargetname.rawAddress, ccriteria.toInt(), rgpcriteria.rawAddress, pptrustedissuers.rawAddress)

public actual fun pstGetTrustAnchorsEx(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, pcertcontext: ConstPtr, pptrustedissuers: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(ptargetname.rawAddress, ccriteria.toInt(), rgpcriteria.rawAddress, pcertcontext.rawAddress, pptrustedissuers.rawAddress)

public actual fun pstGetUserNameForCertificate(pcertcontext: ConstPtr, username: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(pcertcontext.rawAddress, username.rawAddress)

public actual fun pstMapCertificate(pcert: ConstPtr, ptokeninformationtype: MutPtr, pptokeninformation: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(pcert.rawAddress, ptokeninformationtype.rawAddress, pptokeninformation.rawAddress)

public actual fun pstValidate(ptargetname: ConstPtr, bisclient: Bool, prequestedissuancepolicy: ConstPtr, phadditionalcertstore: ConstPtr, pcert: ConstPtr, pprovguid: MutPtr): Ntstatus =
    WindowsWin32SecurityCryptographyCertificatesJniBridge.windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(ptargetname.rawAddress, bisclient, prequestedissuancepolicy.rawAddress, phadditionalcertstore.rawAddress, pcert.rawAddress, pprovguid.rawAddress)
