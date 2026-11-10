@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credDeleteA(targetname?.value?.toCPointer<ByteVar>(), type, flags)

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credDeleteW(targetname?.value?.toCPointer<ByteVar>(), type, flags)

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credEnumerateA(filter?.value?.toCPointer<ByteVar>(), flags, count?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>())

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credEnumerateW(filter?.value?.toCPointer<ByteVar>(), flags, count?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>())

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credFindBestCredentialA(targetname?.value?.toCPointer<ByteVar>(), type, flags, credential?.value?.toCPointer<ByteVar>())

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credFindBestCredentialW(targetname?.value?.toCPointer<ByteVar>(), type, flags, credential?.value?.toCPointer<ByteVar>())

public actual fun credFree(buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credFree(buffer?.value?.toCPointer<ByteVar>())
}

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credGetSessionTypes(maximumpersistcount, maximumpersist?.value?.toCPointer<ByteVar>())

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credGetTargetInfoA(targetname?.value?.toCPointer<ByteVar>(), flags, targetinfo?.value?.toCPointer<ByteVar>())

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credGetTargetInfoW(targetname?.value?.toCPointer<ByteVar>(), flags, targetinfo?.value?.toCPointer<ByteVar>())

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credIsMarshaledCredentialA(marshaledcredential?.value?.toCPointer<ByteVar>())

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credIsMarshaledCredentialW(marshaledcredential?.value?.toCPointer<ByteVar>())

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credIsProtectedA(pszprotectedcredentials?.value?.toCPointer<ByteVar>(), pprotectiontype?.value?.toCPointer<ByteVar>())

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credIsProtectedW(pszprotectedcredentials?.value?.toCPointer<ByteVar>(), pprotectiontype?.value?.toCPointer<ByteVar>())

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credMarshalCredentialA(credtype, credential?.value?.toCPointer<ByteVar>(), marshaledcredential?.value?.toCPointer<ByteVar>())

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credMarshalCredentialW(credtype, credential?.value?.toCPointer<ByteVar>(), marshaledcredential?.value?.toCPointer<ByteVar>())

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credPackAuthenticationBufferA(dwflags, pszusername?.value?.toCPointer<ByteVar>(), pszpassword?.value?.toCPointer<ByteVar>(), ppackedcredentials?.value?.toCPointer<ByteVar>(), pcbpackedcredentials?.value?.toCPointer<ByteVar>())

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credPackAuthenticationBufferW(dwflags, pszusername?.value?.toCPointer<ByteVar>(), pszpassword?.value?.toCPointer<ByteVar>(), ppackedcredentials?.value?.toCPointer<ByteVar>(), pcbpackedcredentials?.value?.toCPointer<ByteVar>())

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credProtectA(fasself, pszcredentials?.value?.toCPointer<ByteVar>(), cchcredentials, pszprotectedcredentials?.value?.toCPointer<ByteVar>(), pcchmaxchars?.value?.toCPointer<ByteVar>(), protectiontype?.value?.toCPointer<ByteVar>())

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credProtectW(fasself, pszcredentials?.value?.toCPointer<ByteVar>(), cchcredentials, pszprotectedcredentials?.value?.toCPointer<ByteVar>(), pcchmaxchars?.value?.toCPointer<ByteVar>(), protectiontype?.value?.toCPointer<ByteVar>())

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credReadA(targetname?.value?.toCPointer<ByteVar>(), type, flags, credential?.value?.toCPointer<ByteVar>())

public actual fun credReadDomainCredentialsA(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credReadDomainCredentialsA(targetinfo?.value?.toCPointer<ByteVar>(), flags, count?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>())

public actual fun credReadDomainCredentialsW(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credReadDomainCredentialsW(targetinfo?.value?.toCPointer<ByteVar>(), flags, count?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>())

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credReadW(targetname?.value?.toCPointer<ByteVar>(), type, flags, credential?.value?.toCPointer<ByteVar>())

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credRenameA(oldtargetname?.value?.toCPointer<ByteVar>(), newtargetname?.value?.toCPointer<ByteVar>(), type, flags)

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credRenameW(oldtargetname?.value?.toCPointer<ByteVar>(), newtargetname?.value?.toCPointer<ByteVar>(), type, flags)

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsA(psztargetname?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), dwautherror, username?.value?.toCPointer<ByteVar>(), uluserbuffersize, pszpassword?.value?.toCPointer<ByteVar>(), ulpasswordbuffersize, pfsave?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsW(psztargetname?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), dwautherror, username?.value?.toCPointer<ByteVar>(), uluserbuffersize, pszpassword?.value?.toCPointer<ByteVar>(), ulpasswordbuffersize, pfsave?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIConfirmCredentialsA(psztargetname?.value?.toCPointer<ByteVar>(), bconfirm)

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIConfirmCredentialsW(psztargetname?.value?.toCPointer<ByteVar>(), bconfirm)

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIParseUserNameA(username?.value?.toCPointer<ByteVar>(), user?.value?.toCPointer<ByteVar>(), userbuffersize, domain?.value?.toCPointer<ByteVar>(), domainbuffersize)

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIParseUserNameW(username?.value?.toCPointer<ByteVar>(), user?.value?.toCPointer<ByteVar>(), userbuffersize, domain?.value?.toCPointer<ByteVar>(), domainbuffersize)

public actual fun credUIPromptForCredentialsA(puiinfo: COpaquePointer?, psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIPromptForCredentialsA(puiinfo?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), dwautherror, pszusername?.value?.toCPointer<ByteVar>(), ulusernamebuffersize, pszpassword?.value?.toCPointer<ByteVar>(), ulpasswordbuffersize, save?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun credUIPromptForCredentialsW(puiinfo: COpaquePointer?, psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIPromptForCredentialsW(puiinfo?.value?.toCPointer<ByteVar>(), psztargetname?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), dwautherror, pszusername?.value?.toCPointer<ByteVar>(), ulusernamebuffersize, pszpassword?.value?.toCPointer<ByteVar>(), ulpasswordbuffersize, save?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsA(puiinfo?.value?.toCPointer<ByteVar>(), dwautherror, pulauthpackage?.value?.toCPointer<ByteVar>(), pvinauthbuffer?.value?.toCPointer<ByteVar>(), ulinauthbuffersize, ppvoutauthbuffer?.value?.toCPointer<ByteVar>(), puloutauthbuffersize?.value?.toCPointer<ByteVar>(), pfsave?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsW(puiinfo?.value?.toCPointer<ByteVar>(), dwautherror, pulauthpackage?.value?.toCPointer<ByteVar>(), pvinauthbuffer?.value?.toCPointer<ByteVar>(), ulinauthbuffersize, ppvoutauthbuffer?.value?.toCPointer<ByteVar>(), puloutauthbuffersize?.value?.toCPointer<ByteVar>(), pfsave?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIReadSSOCredW(pszrealm?.value?.toCPointer<ByteVar>(), ppszusername?.value?.toCPointer<ByteVar>())

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUIStoreSSOCredW(pszrealm?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pszpassword?.value?.toCPointer<ByteVar>(), bpersist)

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: COpaquePointer?, pszdomainname: Pstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pstr, pcchmaxpassword: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferA(dwflags, pauthbuffer?.value?.toCPointer<ByteVar>(), cbauthbuffer, pszusername?.value?.toCPointer<ByteVar>(), pcchlmaxusername?.value?.toCPointer<ByteVar>(), pszdomainname?.value?.toCPointer<ByteVar>(), pcchmaxdomainname?.value?.toCPointer<ByteVar>(), pszpassword?.value?.toCPointer<ByteVar>(), pcchmaxpassword?.value?.toCPointer<ByteVar>())

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: COpaquePointer?, pszdomainname: Pwstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pwstr, pcchmaxpassword: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferW(dwflags, pauthbuffer?.value?.toCPointer<ByteVar>(), cbauthbuffer, pszusername?.value?.toCPointer<ByteVar>(), pcchmaxusername?.value?.toCPointer<ByteVar>(), pszdomainname?.value?.toCPointer<ByteVar>(), pcchmaxdomainname?.value?.toCPointer<ByteVar>(), pszpassword?.value?.toCPointer<ByteVar>(), pcchmaxpassword?.value?.toCPointer<ByteVar>())

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUnmarshalCredentialA(marshaledcredential?.value?.toCPointer<ByteVar>(), credtype?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>())

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUnmarshalCredentialW(marshaledcredential?.value?.toCPointer<ByteVar>(), credtype?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>())

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUnprotectA(fasself, pszprotectedcredentials?.value?.toCPointer<ByteVar>(), cchprotectedcredentials, pszcredentials?.value?.toCPointer<ByteVar>(), pcchmaxchars?.value?.toCPointer<ByteVar>())

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credUnprotectW(fasself, pszprotectedcredentials?.value?.toCPointer<ByteVar>(), cchprotectedcredentials, pszcredentials?.value?.toCPointer<ByteVar>(), pcchmaxchars?.value?.toCPointer<ByteVar>())

public actual fun credWriteA(credential: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credWriteA(credential?.value?.toCPointer<ByteVar>(), flags)

public actual fun credWriteDomainCredentialsA(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credWriteDomainCredentialsA(targetinfo?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>(), flags)

public actual fun credWriteDomainCredentialsW(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credWriteDomainCredentialsW(targetinfo?.value?.toCPointer<ByteVar>(), credential?.value?.toCPointer<ByteVar>(), flags)

public actual fun credWriteW(credential: COpaquePointer?, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_credWriteW(credential?.value?.toCPointer<ByteVar>(), flags)

public actual fun getOpenCardNameA(param0: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_getOpenCardNameA(param0?.value?.toCPointer<ByteVar>())

public actual fun getOpenCardNameW(param0: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_getOpenCardNameW(param0?.value?.toCPointer<ByteVar>())

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_keyCredentialManagerFreeInformation(keycredentialmanagerinfo?.value?.toCPointer<ByteVar>())
}

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_keyCredentialManagerGetInformation(keycredentialmanagerinfo?.value?.toCPointer<ByteVar>())

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: COpaquePointer?, keycredentialmanageroperationerrorstates: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready?.value?.toCPointer<ByteVar>(), keycredentialmanageroperationerrorstates?.value?.toCPointer<ByteVar>())

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_keyCredentialManagerShowUIOperation(hwndowner?.value?.toCPointer<ByteVar>(), keycredentialmanageroperationtype)

public actual fun sCardAccessStartedEvent(): Handle =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardAccessStartedEvent()?.let { COpaquePointer(it.toLong()) }

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardAddReaderToGroupA(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardAddReaderToGroupW(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardAudit(hcontext, dwevent)

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardBeginTransaction(hcard)

public actual fun sCardCancel(hcontext: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardCancel(hcontext)

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardConnectA(hcontext, szreader?.value?.toCPointer<ByteVar>(), dwsharemode, dwpreferredprotocols, phcard?.value?.toCPointer<ByteVar>(), pdwactiveprotocol?.value?.toCPointer<ByteVar>())

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardConnectW(hcontext, szreader?.value?.toCPointer<ByteVar>(), dwsharemode, dwpreferredprotocols, phcard?.value?.toCPointer<ByteVar>(), pdwactiveprotocol?.value?.toCPointer<ByteVar>())

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardControl(hcard, dwcontrolcode, lpinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardDisconnect(hcard, dwdisposition)

public actual fun sCardDlgExtendedError(): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardDlgExtendedError()

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardEndTransaction(hcard, dwdisposition)

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: COpaquePointer?, pvreserved2: COpaquePointer?, phcontext: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardEstablishContext(dwscope, pvreserved1?.value?.toCPointer<ByteVar>(), pvreserved2?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>())

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardForgetCardTypeA(hcontext, szcardname?.value?.toCPointer<ByteVar>())

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardForgetCardTypeW(hcontext, szcardname?.value?.toCPointer<ByteVar>())

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardForgetReaderA(hcontext, szreadername?.value?.toCPointer<ByteVar>())

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardForgetReaderGroupA(hcontext, szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardForgetReaderGroupW(hcontext, szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardForgetReaderW(hcontext, szreadername?.value?.toCPointer<ByteVar>())

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardFreeMemory(hcontext, pvmem?.value?.toCPointer<ByteVar>())

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, pcbattrlen: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetAttrib(hcard, dwattrid, pbattr?.value?.toCPointer<ByteVar>(), pcbattrlen?.value?.toCPointer<ByteVar>())

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameA(hcontext, szcardname?.value?.toCPointer<ByteVar>(), dwproviderid, szprovider?.value?.toCPointer<ByteVar>(), pcchprovider?.value?.toCPointer<ByteVar>())

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameW(hcontext, szcardname?.value?.toCPointer<ByteVar>(), dwproviderid, szprovider?.value?.toCPointer<ByteVar>(), pcchprovider?.value?.toCPointer<ByteVar>())

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdA(hcontext, szreadername?.value?.toCPointer<ByteVar>(), pdwdevicetypeid?.value?.toCPointer<ByteVar>())

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdW(hcontext, szreadername?.value?.toCPointer<ByteVar>(), pdwdevicetypeid?.value?.toCPointer<ByteVar>())

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetProviderIdA(hcontext, szcard?.value?.toCPointer<ByteVar>(), pguidproviderid?.value?.toCPointer<ByteVar>())

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetProviderIdW(hcontext, szcard?.value?.toCPointer<ByteVar>(), pguidproviderid?.value?.toCPointer<ByteVar>())

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdA(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szdeviceinstanceid?.value?.toCPointer<ByteVar>(), pcchdeviceinstanceid?.value?.toCPointer<ByteVar>())

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdW(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szdeviceinstanceid?.value?.toCPointer<ByteVar>(), pcchdeviceinstanceid?.value?.toCPointer<ByteVar>())

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetReaderIconA(hcontext, szreadername?.value?.toCPointer<ByteVar>(), pbicon?.value?.toCPointer<ByteVar>(), pcbicon?.value?.toCPointer<ByteVar>())

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetReaderIconW(hcontext, szreadername?.value?.toCPointer<ByteVar>(), pbicon?.value?.toCPointer<ByteVar>(), pcbicon?.value?.toCPointer<ByteVar>())

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetStatusChangeA(hcontext, dwtimeout, rgreaderstates?.value?.toCPointer<ByteVar>(), creaders)

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetStatusChangeW(hcontext, dwtimeout, rgreaderstates?.value?.toCPointer<ByteVar>(), creaders)

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardGetTransmitCount(hcard, pctransmitcount?.value?.toCPointer<ByteVar>())

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeA(hcontext, szcardname?.value?.toCPointer<ByteVar>(), pguidprimaryprovider?.value?.toCPointer<ByteVar>(), rgguidinterfaces?.value?.toCPointer<ByteVar>(), dwinterfacecount, pbatr?.value?.toCPointer<ByteVar>(), pbatrmask?.value?.toCPointer<ByteVar>(), cbatrlen)

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeW(hcontext, szcardname?.value?.toCPointer<ByteVar>(), pguidprimaryprovider?.value?.toCPointer<ByteVar>(), rgguidinterfaces?.value?.toCPointer<ByteVar>(), dwinterfacecount, pbatr?.value?.toCPointer<ByteVar>(), pbatrmask?.value?.toCPointer<ByteVar>(), cbatrlen)

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardIntroduceReaderA(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szdevicename?.value?.toCPointer<ByteVar>())

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupA(hcontext, szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupW(hcontext, szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardIntroduceReaderW(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szdevicename?.value?.toCPointer<ByteVar>())

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardIsValidContext(hcontext)

public actual fun sCardListCardsA(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListCardsA(hcontext, pbatr?.value?.toCPointer<ByteVar>(), rgquidinterfaces?.value?.toCPointer<ByteVar>(), cguidinterfacecount, mszcards?.value?.toCPointer<ByteVar>(), pcchcards?.value?.toCPointer<ByteVar>())

public actual fun sCardListCardsW(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListCardsW(hcontext, pbatr?.value?.toCPointer<ByteVar>(), rgquidinterfaces?.value?.toCPointer<ByteVar>(), cguidinterfacecount, mszcards?.value?.toCPointer<ByteVar>(), pcchcards?.value?.toCPointer<ByteVar>())

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListInterfacesA(hcontext, szcard?.value?.toCPointer<ByteVar>(), pguidinterfaces?.value?.toCPointer<ByteVar>(), pcguidinterfaces?.value?.toCPointer<ByteVar>())

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListInterfacesW(hcontext, szcard?.value?.toCPointer<ByteVar>(), pguidinterfaces?.value?.toCPointer<ByteVar>(), pcguidinterfaces?.value?.toCPointer<ByteVar>())

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListReaderGroupsA(hcontext, mszgroups?.value?.toCPointer<ByteVar>(), pcchgroups?.value?.toCPointer<ByteVar>())

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListReaderGroupsW(hcontext, mszgroups?.value?.toCPointer<ByteVar>(), pcchgroups?.value?.toCPointer<ByteVar>())

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListReadersA(hcontext, mszgroups?.value?.toCPointer<ByteVar>(), mszreaders?.value?.toCPointer<ByteVar>(), pcchreaders?.value?.toCPointer<ByteVar>())

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListReadersW(hcontext, mszgroups?.value?.toCPointer<ByteVar>(), mszreaders?.value?.toCPointer<ByteVar>(), pcchreaders?.value?.toCPointer<ByteVar>())

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdA(hcontext, szdeviceinstanceid?.value?.toCPointer<ByteVar>(), mszreaders?.value?.toCPointer<ByteVar>(), pcchreaders?.value?.toCPointer<ByteVar>())

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdW(hcontext, szdeviceinstanceid?.value?.toCPointer<ByteVar>(), mszreaders?.value?.toCPointer<ByteVar>(), pcchreaders?.value?.toCPointer<ByteVar>())

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardLocateCardsA(hcontext, mszcards?.value?.toCPointer<ByteVar>(), rgreaderstates?.value?.toCPointer<ByteVar>(), creaders)

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardLocateCardsByATRA(hcontext, rgatrmasks?.value?.toCPointer<ByteVar>(), catrs, rgreaderstates?.value?.toCPointer<ByteVar>(), creaders)

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardLocateCardsByATRW(hcontext, rgatrmasks?.value?.toCPointer<ByteVar>(), catrs, rgreaderstates?.value?.toCPointer<ByteVar>(), creaders)

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardLocateCardsW(hcontext, mszcards?.value?.toCPointer<ByteVar>(), rgreaderstates?.value?.toCPointer<ByteVar>(), creaders)

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardReadCacheA(hcontext, cardidentifier?.value?.toCPointer<ByteVar>(), freshnesscounter, lookupname?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), datalen?.value?.toCPointer<ByteVar>())

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardReadCacheW(hcontext, cardidentifier?.value?.toCPointer<ByteVar>(), freshnesscounter, lookupname?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), datalen?.value?.toCPointer<ByteVar>())

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardReconnect(hcard, dwsharemode, dwpreferredprotocols, dwinitialization, pdwactiveprotocol?.value?.toCPointer<ByteVar>())

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardReleaseContext(hcontext)

public actual fun sCardReleaseStartedEvent() {
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardReleaseStartedEvent()
}

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupA(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupW(hcontext, szreadername?.value?.toCPointer<ByteVar>(), szgroupname?.value?.toCPointer<ByteVar>())

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, cbattrlen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardSetAttrib(hcard, dwattrid, pbattr?.value?.toCPointer<ByteVar>(), cbattrlen)

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameA(hcontext, szcardname?.value?.toCPointer<ByteVar>(), dwproviderid, szprovider?.value?.toCPointer<ByteVar>())

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameW(hcontext, szcardname?.value?.toCPointer<ByteVar>(), dwproviderid, szprovider?.value?.toCPointer<ByteVar>())

public actual fun sCardState(hcard: ULong, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardState(hcard, pdwstate?.value?.toCPointer<ByteVar>(), pdwprotocol?.value?.toCPointer<ByteVar>(), pbatr?.value?.toCPointer<ByteVar>(), pcbatrlen?.value?.toCPointer<ByteVar>())

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardStatusA(hcard, mszreadernames?.value?.toCPointer<ByteVar>(), pcchreaderlen?.value?.toCPointer<ByteVar>(), pdwstate?.value?.toCPointer<ByteVar>(), pdwprotocol?.value?.toCPointer<ByteVar>(), pbatr?.value?.toCPointer<ByteVar>(), pcbatrlen?.value?.toCPointer<ByteVar>())

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardStatusW(hcard, mszreadernames?.value?.toCPointer<ByteVar>(), pcchreaderlen?.value?.toCPointer<ByteVar>(), pdwstate?.value?.toCPointer<ByteVar>(), pdwprotocol?.value?.toCPointer<ByteVar>(), pbatr?.value?.toCPointer<ByteVar>(), pcbatrlen?.value?.toCPointer<ByteVar>())

public actual fun sCardTransmit(hcard: ULong, piosendpci: COpaquePointer?, pbsendbuffer: COpaquePointer?, cbsendlength: UInt, piorecvpci: COpaquePointer?, pbrecvbuffer: COpaquePointer?, pcbrecvlength: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardTransmit(hcard, piosendpci?.value?.toCPointer<ByteVar>(), pbsendbuffer?.value?.toCPointer<ByteVar>(), cbsendlength, piorecvpci?.value?.toCPointer<ByteVar>(), pbrecvbuffer?.value?.toCPointer<ByteVar>(), pcbrecvlength?.value?.toCPointer<ByteVar>())

public actual fun sCardUIDlgSelectCardA(param0: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardA(param0?.value?.toCPointer<ByteVar>())

public actual fun sCardUIDlgSelectCardW(param0: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardW(param0?.value?.toCPointer<ByteVar>())

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardWriteCacheA(hcontext, cardidentifier?.value?.toCPointer<ByteVar>(), freshnesscounter, lookupname?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), datalen)

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_sCardWriteCacheW(hcontext, cardidentifier?.value?.toCPointer<ByteVar>(), freshnesscounter, lookupname?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>(), datalen)
