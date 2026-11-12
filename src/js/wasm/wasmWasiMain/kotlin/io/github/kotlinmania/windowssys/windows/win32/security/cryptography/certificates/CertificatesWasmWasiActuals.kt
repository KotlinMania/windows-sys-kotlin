@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun certSrvBackupClose(hbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose")

public actual fun certSrvBackupEnd(hbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd")

public actual fun certSrvBackupFree(pv: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree")

public actual fun certSrvBackupGetBackupLogsW(hbc: ConstPtr, ppwszzbackuplogfiles: MutPtr, pcbsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW")

public actual fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr, ppwszzattachmentinformation: MutPtr, pcbsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW")

public actual fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr, ppwszzfilelist: MutPtr, pcbsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW")

public actual fun certSrvBackupOpenFileW(hbc: MutPtr, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW")

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW")

public actual fun certSrvBackupRead(hbc: MutPtr, pvbuffer: MutPtr, cbbuffer: UInt, pcbread: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead")

public actual fun certSrvBackupTruncateLogs(hbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs")

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW")

public actual fun certSrvRestoreEnd(hbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd")

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr, ppwszzdatabaselocationlist: MutPtr, pcbsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW")

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW")

public actual fun certSrvRestoreRegisterComplete(hbc: MutPtr, hrrestorestate: Hresult): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete")

public actual fun certSrvRestoreRegisterThroughFile(hbc: MutPtr, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile")

public actual fun certSrvRestoreRegisterW(hbc: MutPtr, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW")

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr, ppbout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW")

public actual fun pstAcquirePrivateKey(pcert: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey")

public actual fun pstGetCertificateChain(pcert: ConstPtr, ptrustedissuers: ConstPtr, ppcertchaincontext: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain")

public actual fun pstGetCertificates(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, bisclient: Bool, pdwcertchaincontextcount: MutPtr, ppcertchaincontexts: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates")

public actual fun pstGetTrustAnchors(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, pptrustedissuers: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors")

public actual fun pstGetTrustAnchorsEx(ptargetname: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, pcertcontext: ConstPtr, pptrustedissuers: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx")

public actual fun pstGetUserNameForCertificate(pcertcontext: ConstPtr, username: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate")

public actual fun pstMapCertificate(pcert: ConstPtr, ptokeninformationtype: MutPtr, pptokeninformation: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate")

public actual fun pstValidate(ptargetname: ConstPtr, bisclient: Bool, prequestedissuancepolicy: ConstPtr, phadditionalcertstore: ConstPtr, pcert: ConstPtr, pprovguid: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate")
