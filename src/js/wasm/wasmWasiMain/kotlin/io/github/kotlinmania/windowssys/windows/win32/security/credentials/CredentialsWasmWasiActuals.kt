@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredDeleteA")

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredDeleteW")

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentiala>>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredEnumerateA")

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentialw>>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredEnumerateW")

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: MutPtr<MutPtr<Credentiala>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA")

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr<MutPtr<Credentialw>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW")

public actual fun credFree(buffer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredFree")

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes")

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: MutPtr<MutPtr<CredentialTargetInformationa>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA")

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: MutPtr<MutPtr<CredentialTargetInformationw>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW")

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA")

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW")

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: MutPtr<CredProtectionType>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredIsProtectedA")

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: MutPtr<CredProtectionType>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredIsProtectedW")

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: ConstPtr<CVoid>, marshaledcredential: MutPtr<Pstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA")

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: ConstPtr<CVoid>, marshaledcredential: MutPtr<Pwstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW")

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: MutPtr<UByte>, pcbpackedcredentials: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA")

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: MutPtr<UByte>, pcbpackedcredentials: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW")

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: MutPtr<UInt>, protectiontype: MutPtr<CredProtectionType>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredProtectA")

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: MutPtr<UInt>, protectiontype: MutPtr<CredProtectionType>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredProtectW")

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: MutPtr<MutPtr<Credentiala>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredReadA")

public actual fun credReadDomainCredentialsA(targetinfo: ConstPtr<CredentialTargetInformationa>, flags: UInt, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentiala>>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA")

public actual fun credReadDomainCredentialsW(targetinfo: ConstPtr<CredentialTargetInformationw>, flags: UInt, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<Credentialw>>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW")

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: MutPtr<MutPtr<Credentialw>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredReadW")

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredRenameA")

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredRenameW")

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: MutPtr<Bool>, dwflags: CreduiFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA")

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: MutPtr<Bool>, dwflags: CreduiFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW")

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA")

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW")

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA")

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW")

public actual fun credUIPromptForCredentialsA(puiinfo: ConstPtr<CreduiInfoa>, psztargetname: Pcstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: MutPtr<Bool>, dwflags: CreduiFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA")

public actual fun credUIPromptForCredentialsW(puiinfo: ConstPtr<CreduiInfow>, psztargetname: Pcwstr, pcontext: ConstPtr<SecHandle>, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: MutPtr<Bool>, dwflags: CreduiFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW")

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: ConstPtr<CreduiInfoa>, dwautherror: UInt, pulauthpackage: MutPtr<UInt>, pvinauthbuffer: ConstPtr<CVoid>, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr<MutPtr<CVoid>>, puloutauthbuffersize: MutPtr<UInt>, pfsave: MutPtr<Bool>, dwflags: CreduiwinFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA")

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: ConstPtr<CreduiInfow>, dwautherror: UInt, pulauthpackage: MutPtr<UInt>, pvinauthbuffer: ConstPtr<CVoid>, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr<MutPtr<CVoid>>, puloutauthbuffersize: MutPtr<UInt>, pfsave: MutPtr<Bool>, dwflags: CreduiwinFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW")

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: MutPtr<Pwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW")

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW")

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: MutPtr<UInt>, pszdomainname: Pstr, pcchmaxdomainname: MutPtr<UInt>, pszpassword: Pstr, pcchmaxpassword: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA")

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: MutPtr<UInt>, pszdomainname: Pwstr, pcchmaxdomainname: MutPtr<UInt>, pszpassword: Pwstr, pcchmaxpassword: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW")

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: MutPtr<CredMarshalType>, credential: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA")

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: MutPtr<CredMarshalType>, credential: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW")

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUnprotectA")

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredUnprotectW")

public actual fun credWriteA(credential: ConstPtr<Credentiala>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredWriteA")

public actual fun credWriteDomainCredentialsA(targetinfo: ConstPtr<CredentialTargetInformationa>, credential: ConstPtr<Credentiala>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA")

public actual fun credWriteDomainCredentialsW(targetinfo: ConstPtr<CredentialTargetInformationw>, credential: ConstPtr<Credentialw>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW")

public actual fun credWriteW(credential: ConstPtr<Credentialw>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsCredWriteW")

public actual fun getOpenCardNameA(param0: MutPtr<Opencardnamea>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA")

public actual fun getOpenCardNameW(param0: MutPtr<Opencardnamew>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW")

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: ConstPtr<KeyCredentialManagerInfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation")

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: MutPtr<MutPtr<KeyCredentialManagerInfo>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation")

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: MutPtr<Bool>, keycredentialmanageroperationerrorstates: MutPtr<KeyCredentialManagerOperationErrorStates>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates")

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation")

public actual fun sCardAccessStartedEvent(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent")

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA")

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardAudit")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardAudit(hcontext: Long, dwevent: Int): Int

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardAudit(hcontext.toLong(), dwevent.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(hcard: Long): Int

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(hcard.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardCancel")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardCancel(hcontext: Long): Int

public actual fun sCardCancel(hcontext: ULong): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardCancel(hcontext.toLong())

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr<ULong>, pdwactiveprotocol: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardConnectA")

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr<ULong>, pdwactiveprotocol: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardConnectW")

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardControl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardDisconnect")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardDisconnect(hcard: Long, dwdisposition: Int): Int

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardDisconnect(hcard.toLong(), dwdisposition.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError(): Int

public actual fun sCardDlgExtendedError(): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardEndTransaction")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardEndTransaction(hcard: Long, dwdisposition: Int): Int

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardEndTransaction(hcard.toLong(), dwdisposition.toInt())

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: ConstPtr<CVoid>, pvreserved2: ConstPtr<CVoid>, phcontext: MutPtr<ULong>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardEstablishContext")

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA")

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW")

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA")

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA")

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW")

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW")

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardFreeMemory")

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: MutPtr<UByte>, pcbattrlen: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetAttrib")

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA")

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW")

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA")

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW")

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: MutPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA")

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: MutPtr<Guid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW")

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA")

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW")

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: MutPtr<UByte>, pcbicon: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA")

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: MutPtr<UByte>, pcbicon: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW")

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA")

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW")

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount")

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: ConstPtr<Guid>, rgguidinterfaces: ConstPtr<Guid>, dwinterfacecount: UInt, pbatr: ConstPtr<UByte>, pbatrmask: ConstPtr<UByte>, cbatrlen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA")

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: ConstPtr<Guid>, rgguidinterfaces: ConstPtr<Guid>, dwinterfacecount: UInt, pbatr: ConstPtr<UByte>, pbatrmask: ConstPtr<UByte>, cbatrlen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW")

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA")

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA")

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW")

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardIsValidContext")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardIsValidContext(hcontext: Long): Int

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardIsValidContext(hcontext.toLong())

public actual fun sCardListCardsA(hcontext: ULong, pbatr: ConstPtr<UByte>, rgquidinterfaces: ConstPtr<Guid>, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListCardsA")

public actual fun sCardListCardsW(hcontext: ULong, pbatr: ConstPtr<UByte>, rgquidinterfaces: ConstPtr<Guid>, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListCardsW")

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: MutPtr<Guid>, pcguidinterfaces: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA")

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: MutPtr<Guid>, pcguidinterfaces: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW")

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA")

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW")

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListReadersA")

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListReadersW")

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA")

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW")

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA")

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: ConstPtr<ScardAtrmask>, catrs: UInt, rgreaderstates: MutPtr<ScardReaderstatea>, creaders: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA")

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: ConstPtr<ScardAtrmask>, catrs: UInt, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW")

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: MutPtr<ScardReaderstatew>, creaders: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW")

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcstr, data: MutPtr<UByte>, datalen: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardReadCacheA")

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcwstr, data: MutPtr<UByte>, datalen: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardReadCacheW")

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardReconnect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardReleaseContext")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardReleaseContext(hcontext: Long): Int

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardReleaseContext(hcontext.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent")
private external fun wasiWindowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent(): Unit

public actual fun sCardReleaseStartedEvent(): Unit =
    wasiWindowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA")

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW")

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: ConstPtr<UByte>, cbattrlen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardSetAttrib")

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA")

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW")

public actual fun sCardState(hcard: ULong, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardState")

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: MutPtr<UInt>, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardStatusA")

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: MutPtr<UInt>, pdwstate: MutPtr<UInt>, pdwprotocol: MutPtr<UInt>, pbatr: MutPtr<UByte>, pcbatrlen: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardStatusW")

public actual fun sCardTransmit(hcard: ULong, piosendpci: ConstPtr<ScardIoRequest>, pbsendbuffer: ConstPtr<UByte>, cbsendlength: UInt, piorecvpci: MutPtr<ScardIoRequest>, pbrecvbuffer: MutPtr<UByte>, pcbrecvlength: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardTransmit")

public actual fun sCardUIDlgSelectCardA(param0: MutPtr<OpencardnameExa>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA")

public actual fun sCardUIDlgSelectCardW(param0: MutPtr<OpencardnameExw>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW")

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcstr, data: ConstPtr<UByte>, datalen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA")

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: ConstPtr<Guid>, freshnesscounter: UInt, lookupname: Pcwstr, data: ConstPtr<UByte>, datalen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW")
