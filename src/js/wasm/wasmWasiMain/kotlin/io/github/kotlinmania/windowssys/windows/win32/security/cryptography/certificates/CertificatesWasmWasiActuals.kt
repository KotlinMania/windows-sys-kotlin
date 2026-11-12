@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun certSrvBackupClose(hbc: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose")

public actual fun certSrvBackupEnd(hbc: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd")

public actual fun certSrvBackupFree(pv: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree")

public actual fun certSrvBackupGetBackupLogsW(hbc: ConstPtr<CVoid>, ppwszzbackuplogfiles: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW")

public actual fun certSrvBackupGetDatabaseNamesW(hbc: ConstPtr<CVoid>, ppwszzattachmentinformation: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW")

public actual fun certSrvBackupGetDynamicFileListW(hbc: ConstPtr<CVoid>, ppwszzfilelist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW")

public actual fun certSrvBackupOpenFileW(hbc: MutPtr<CVoid>, pwszattachmentname: Pcwstr, cbreadhintsize: UInt, plifilesize: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW")

public actual fun certSrvBackupPrepareW(pwszservername: Pcwstr, grbitjet: UInt, dwbackupflags: CsbackupType, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW")

public actual fun certSrvBackupRead(hbc: MutPtr<CVoid>, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbread: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead")

public actual fun certSrvBackupTruncateLogs(hbc: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs")

public actual fun certSrvIsServerOnlineW(pwszservername: Pcwstr, pfserveronline: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW")

public actual fun certSrvRestoreEnd(hbc: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd")

public actual fun certSrvRestoreGetDatabaseLocationsW(hbc: ConstPtr<CVoid>, ppwszzdatabaselocationlist: MutPtr<Pwstr>, pcbsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW")

public actual fun certSrvRestorePrepareW(pwszservername: Pcwstr, dwrestoreflags: UInt, phbc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW")

public actual fun certSrvRestoreRegisterComplete(hbc: MutPtr<CVoid>, hrrestorestate: Hresult): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete")

public actual fun certSrvRestoreRegisterThroughFile(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile")

public actual fun certSrvRestoreRegisterW(hbc: MutPtr<CVoid>, pwszcheckpointfilepath: Pcwstr, pwszlogpath: Pcwstr, rgrstmap: MutPtr<CsedbRstmapw>, crstmap: Int, pwszbackuplogpath: Pcwstr, genlow: UInt, genhigh: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW")

public actual fun certSrvServerControlW(pwszservername: Pcwstr, dwcontrolflags: UInt, pcbout: MutPtr<UInt>, ppbout: MutPtr<MutPtr<UByte>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW")

public actual fun pstAcquirePrivateKey(pcert: ConstPtr<CertContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey")

public actual fun pstGetCertificateChain(pcert: ConstPtr<CertContext>, ptrustedissuers: ConstPtr<SecPkgContextIssuerListInfoEx>, ppcertchaincontext: MutPtr<MutPtr<CertChainContext>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain")

public actual fun pstGetCertificates(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, bisclient: Bool, pdwcertchaincontextcount: MutPtr<UInt>, ppcertchaincontexts: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates")

public actual fun pstGetTrustAnchors(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors")

public actual fun pstGetTrustAnchorsEx(ptargetname: ConstPtr<UnicodeString>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, pcertcontext: ConstPtr<CertContext>, pptrustedissuers: MutPtr<MutPtr<SecPkgContextIssuerListInfoEx>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx")

public actual fun pstGetUserNameForCertificate(pcertcontext: ConstPtr<CertContext>, username: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate")

public actual fun pstMapCertificate(pcert: ConstPtr<CertContext>, ptokeninformationtype: MutPtr<LsaTokenInformationType>, pptokeninformation: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate")

public actual fun pstValidate(ptargetname: ConstPtr<UnicodeString>, bisclient: Bool, prequestedissuancepolicy: ConstPtr<CertUsageMatch>, phadditionalcertstore: ConstPtr<Hcertstore>, pcert: ConstPtr<CertContext>, pprovguid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate")
