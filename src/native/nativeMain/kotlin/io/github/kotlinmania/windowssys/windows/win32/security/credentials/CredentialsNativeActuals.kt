@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CredDeleteA(targetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredDeleteA(targetname.toCPointer<ByteVar>(), type, flags)

public actual fun CredDeleteW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredDeleteW(targetname.toCPointer<ByteVar>(), type, flags)

public actual fun CredEnumerateA(filter: PCSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredEnumerateA(filter.toCPointer<ByteVar>(), flags, count.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>())

public actual fun CredEnumerateW(filter: PCWSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredEnumerateW(filter.toCPointer<ByteVar>(), flags, count.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>())

public actual fun CredFindBestCredentialA(targetname: PCSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredFindBestCredentialA(targetname.toCPointer<ByteVar>(), type, flags, credential.toCPointer<ByteVar>())

public actual fun CredFindBestCredentialW(targetname: PCWSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredFindBestCredentialW(targetname.toCPointer<ByteVar>(), type, flags, credential.toCPointer<ByteVar>())

public actual fun CredFree(buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredFree(buffer.toCPointer<ByteVar>())
}

public actual fun CredGetSessionTypes(maximumpersistcount: UInt, maximumpersist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredGetSessionTypes(maximumpersistcount, maximumpersist.toCPointer<ByteVar>())

public actual fun CredGetTargetInfoA(targetname: PCSTR, flags: UInt, targetinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredGetTargetInfoA(targetname.toCPointer<ByteVar>(), flags, targetinfo.toCPointer<ByteVar>())

public actual fun CredGetTargetInfoW(targetname: PCWSTR, flags: UInt, targetinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredGetTargetInfoW(targetname.toCPointer<ByteVar>(), flags, targetinfo.toCPointer<ByteVar>())

public actual fun CredIsMarshaledCredentialA(marshaledcredential: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA(marshaledcredential.toCPointer<ByteVar>())

public actual fun CredIsMarshaledCredentialW(marshaledcredential: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW(marshaledcredential.toCPointer<ByteVar>())

public actual fun CredIsProtectedA(pszprotectedcredentials: PCSTR, pprotectiontype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredIsProtectedA(pszprotectedcredentials.toCPointer<ByteVar>(), pprotectiontype.toCPointer<ByteVar>())

public actual fun CredIsProtectedW(pszprotectedcredentials: PCWSTR, pprotectiontype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredIsProtectedW(pszprotectedcredentials.toCPointer<ByteVar>(), pprotectiontype.toCPointer<ByteVar>())

public actual fun CredMarshalCredentialA(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredMarshalCredentialA(credtype, credential.toCPointer<ByteVar>(), marshaledcredential.toCPointer<ByteVar>())

public actual fun CredMarshalCredentialW(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredMarshalCredentialW(credtype, credential.toCPointer<ByteVar>(), marshaledcredential.toCPointer<ByteVar>())

public actual fun CredPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pszusername: PCSTR, pszpassword: PCSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA(dwflags, pszusername.toCPointer<ByteVar>(), pszpassword.toCPointer<ByteVar>(), ppackedcredentials.toCPointer<ByteVar>(), pcbpackedcredentials.toCPointer<ByteVar>())

public actual fun CredPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pszusername: PCWSTR, pszpassword: PCWSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW(dwflags, pszusername.toCPointer<ByteVar>(), pszpassword.toCPointer<ByteVar>(), ppackedcredentials.toCPointer<ByteVar>(), pcbpackedcredentials.toCPointer<ByteVar>())

public actual fun CredProtectA(fasself: BOOL, pszcredentials: PCSTR, cchcredentials: UInt, pszprotectedcredentials: PSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredProtectA(fasself, pszcredentials.toCPointer<ByteVar>(), cchcredentials, pszprotectedcredentials.toCPointer<ByteVar>(), pcchmaxchars.toCPointer<ByteVar>(), protectiontype.toCPointer<ByteVar>())

public actual fun CredProtectW(fasself: BOOL, pszcredentials: PCWSTR, cchcredentials: UInt, pszprotectedcredentials: PWSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredProtectW(fasself, pszcredentials.toCPointer<ByteVar>(), cchcredentials, pszprotectedcredentials.toCPointer<ByteVar>(), pcchmaxchars.toCPointer<ByteVar>(), protectiontype.toCPointer<ByteVar>())

public actual fun CredReadA(targetname: PCSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredReadA(targetname.toCPointer<ByteVar>(), type, flags, credential.toCPointer<ByteVar>())

public actual fun CredReadDomainCredentialsA(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA(targetinfo.toCPointer<ByteVar>(), flags, count.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>())

public actual fun CredReadDomainCredentialsW(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW(targetinfo.toCPointer<ByteVar>(), flags, count.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>())

public actual fun CredReadW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredReadW(targetname.toCPointer<ByteVar>(), type, flags, credential.toCPointer<ByteVar>())

public actual fun CredRenameA(oldtargetname: PCSTR, newtargetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredRenameA(oldtargetname.toCPointer<ByteVar>(), newtargetname.toCPointer<ByteVar>(), type, flags)

public actual fun CredRenameW(oldtargetname: PCWSTR, newtargetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredRenameW(oldtargetname.toCPointer<ByteVar>(), newtargetname.toCPointer<ByteVar>(), type, flags)

public actual fun CredUICmdLinePromptForCredentialsA(psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, username: PSTR, uluserbuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA(psztargetname.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), dwautherror, username.toCPointer<ByteVar>(), uluserbuffersize, pszpassword.toCPointer<ByteVar>(), ulpasswordbuffersize, pfsave.toCPointer<ByteVar>(), dwflags)

public actual fun CredUICmdLinePromptForCredentialsW(psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, username: PWSTR, uluserbuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW(psztargetname.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), dwautherror, username.toCPointer<ByteVar>(), uluserbuffersize, pszpassword.toCPointer<ByteVar>(), ulpasswordbuffersize, pfsave.toCPointer<ByteVar>(), dwflags)

public actual fun CredUIConfirmCredentialsA(psztargetname: PCSTR, bconfirm: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA(psztargetname.toCPointer<ByteVar>(), bconfirm)

public actual fun CredUIConfirmCredentialsW(psztargetname: PCWSTR, bconfirm: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW(psztargetname.toCPointer<ByteVar>(), bconfirm)

public actual fun CredUIParseUserNameA(username: PCSTR, user: PSTR, userbuffersize: UInt, domain: PSTR, domainbuffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIParseUserNameA(username.toCPointer<ByteVar>(), user.toCPointer<ByteVar>(), userbuffersize, domain.toCPointer<ByteVar>(), domainbuffersize)

public actual fun CredUIParseUserNameW(username: PCWSTR, user: PWSTR, userbuffersize: UInt, domain: PWSTR, domainbuffersize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIParseUserNameW(username.toCPointer<ByteVar>(), user.toCPointer<ByteVar>(), userbuffersize, domain.toCPointer<ByteVar>(), domainbuffersize)

public actual fun CredUIPromptForCredentialsA(puiinfo: Long, psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, pszusername: PSTR, ulusernamebuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA(puiinfo.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), dwautherror, pszusername.toCPointer<ByteVar>(), ulusernamebuffersize, pszpassword.toCPointer<ByteVar>(), ulpasswordbuffersize, save.toCPointer<ByteVar>(), dwflags)

public actual fun CredUIPromptForCredentialsW(puiinfo: Long, psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, pszusername: PWSTR, ulusernamebuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW(puiinfo.toCPointer<ByteVar>(), psztargetname.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), dwautherror, pszusername.toCPointer<ByteVar>(), ulusernamebuffersize, pszpassword.toCPointer<ByteVar>(), ulpasswordbuffersize, save.toCPointer<ByteVar>(), dwflags)

public actual fun CredUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA(puiinfo.toCPointer<ByteVar>(), dwautherror, pulauthpackage.toCPointer<ByteVar>(), pvinauthbuffer.toCPointer<ByteVar>(), ulinauthbuffersize, ppvoutauthbuffer.toCPointer<ByteVar>(), puloutauthbuffersize.toCPointer<ByteVar>(), pfsave.toCPointer<ByteVar>(), dwflags)

public actual fun CredUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW(puiinfo.toCPointer<ByteVar>(), dwautherror, pulauthpackage.toCPointer<ByteVar>(), pvinauthbuffer.toCPointer<ByteVar>(), ulinauthbuffersize, ppvoutauthbuffer.toCPointer<ByteVar>(), puloutauthbuffersize.toCPointer<ByteVar>(), pfsave.toCPointer<ByteVar>(), dwflags)

public actual fun CredUIReadSSOCredW(pszrealm: PCWSTR, ppszusername: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIReadSSOCredW(pszrealm.toCPointer<ByteVar>(), ppszusername.toCPointer<ByteVar>())

public actual fun CredUIStoreSSOCredW(pszrealm: PCWSTR, pszusername: PCWSTR, pszpassword: PCWSTR, bpersist: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW(pszrealm.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), pszpassword.toCPointer<ByteVar>(), bpersist)

public actual fun CredUnPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PSTR, pcchlmaxusername: Long, pszdomainname: PSTR, pcchmaxdomainname: Long, pszpassword: PSTR, pcchmaxpassword: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA(dwflags, pauthbuffer.toCPointer<ByteVar>(), cbauthbuffer, pszusername.toCPointer<ByteVar>(), pcchlmaxusername.toCPointer<ByteVar>(), pszdomainname.toCPointer<ByteVar>(), pcchmaxdomainname.toCPointer<ByteVar>(), pszpassword.toCPointer<ByteVar>(), pcchmaxpassword.toCPointer<ByteVar>())

public actual fun CredUnPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PWSTR, pcchmaxusername: Long, pszdomainname: PWSTR, pcchmaxdomainname: Long, pszpassword: PWSTR, pcchmaxpassword: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW(dwflags, pauthbuffer.toCPointer<ByteVar>(), cbauthbuffer, pszusername.toCPointer<ByteVar>(), pcchmaxusername.toCPointer<ByteVar>(), pszdomainname.toCPointer<ByteVar>(), pcchmaxdomainname.toCPointer<ByteVar>(), pszpassword.toCPointer<ByteVar>(), pcchmaxpassword.toCPointer<ByteVar>())

public actual fun CredUnmarshalCredentialA(marshaledcredential: PCSTR, credtype: Long, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA(marshaledcredential.toCPointer<ByteVar>(), credtype.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>())

public actual fun CredUnmarshalCredentialW(marshaledcredential: PCWSTR, credtype: Long, credential: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW(marshaledcredential.toCPointer<ByteVar>(), credtype.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>())

public actual fun CredUnprotectA(fasself: BOOL, pszprotectedcredentials: PCSTR, cchprotectedcredentials: UInt, pszcredentials: PSTR, pcchmaxchars: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUnprotectA(fasself, pszprotectedcredentials.toCPointer<ByteVar>(), cchprotectedcredentials, pszcredentials.toCPointer<ByteVar>(), pcchmaxchars.toCPointer<ByteVar>())

public actual fun CredUnprotectW(fasself: BOOL, pszprotectedcredentials: PCWSTR, cchprotectedcredentials: UInt, pszcredentials: PWSTR, pcchmaxchars: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredUnprotectW(fasself, pszprotectedcredentials.toCPointer<ByteVar>(), cchprotectedcredentials, pszcredentials.toCPointer<ByteVar>(), pcchmaxchars.toCPointer<ByteVar>())

public actual fun CredWriteA(credential: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredWriteA(credential.toCPointer<ByteVar>(), flags)

public actual fun CredWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA(targetinfo.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>(), flags)

public actual fun CredWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW(targetinfo.toCPointer<ByteVar>(), credential.toCPointer<ByteVar>(), flags)

public actual fun CredWriteW(credential: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_CredWriteW(credential.toCPointer<ByteVar>(), flags)

public actual fun GetOpenCardNameA(param0: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_GetOpenCardNameA(param0.toCPointer<ByteVar>())

public actual fun GetOpenCardNameW(param0: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_GetOpenCardNameW(param0.toCPointer<ByteVar>())

public actual fun KeyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation(keycredentialmanagerinfo.toCPointer<ByteVar>())
}

public actual fun KeyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation(keycredentialmanagerinfo.toCPointer<ByteVar>())

public actual fun KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: Long, keycredentialmanageroperationerrorstates: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready.toCPointer<ByteVar>(), keycredentialmanageroperationerrorstates.toCPointer<ByteVar>())

public actual fun KeyCredentialManagerShowUIOperation(hwndowner: HWND, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation(hwndowner.toCPointer<ByteVar>(), keycredentialmanageroperationtype)

public actual fun SCardAccessStartedEvent(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardAccessStartedEvent()?.toLong() ?: 0L

public actual fun SCardAddReaderToGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA(hcontext, szreadername.toCPointer<ByteVar>(), szgroupname.toCPointer<ByteVar>())

public actual fun SCardAddReaderToGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW(hcontext, szreadername.toCPointer<ByteVar>(), szgroupname.toCPointer<ByteVar>())

public actual fun SCardAudit(hcontext: ULong, dwevent: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardAudit(hcontext, dwevent)

public actual fun SCardBeginTransaction(hcard: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardBeginTransaction(hcard)

public actual fun SCardCancel(hcontext: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardCancel(hcontext)

public actual fun SCardConnectA(hcontext: ULong, szreader: PCSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardConnectA(hcontext, szreader.toCPointer<ByteVar>(), dwsharemode, dwpreferredprotocols, phcard.toCPointer<ByteVar>(), pdwactiveprotocol.toCPointer<ByteVar>())

public actual fun SCardConnectW(hcontext: ULong, szreader: PCWSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardConnectW(hcontext, szreader.toCPointer<ByteVar>(), dwsharemode, dwpreferredprotocols, phcard.toCPointer<ByteVar>(), pdwactiveprotocol.toCPointer<ByteVar>())

public actual fun SCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardControl(hcard, dwcontrolcode, lpinbuffer.toCPointer<ByteVar>(), cbinbuffersize, lpoutbuffer.toCPointer<ByteVar>(), cboutbuffersize, lpbytesreturned.toCPointer<ByteVar>())

public actual fun SCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardDisconnect(hcard, dwdisposition)

public actual fun SCardDlgExtendedError(): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardDlgExtendedError()

public actual fun SCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardEndTransaction(hcard, dwdisposition)

public actual fun SCardEstablishContext(dwscope: SCARD_SCOPE, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardEstablishContext(dwscope, pvreserved1.toCPointer<ByteVar>(), pvreserved2.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>())

public actual fun SCardForgetCardTypeA(hcontext: ULong, szcardname: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardForgetCardTypeA(hcontext, szcardname.toCPointer<ByteVar>())

public actual fun SCardForgetCardTypeW(hcontext: ULong, szcardname: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardForgetCardTypeW(hcontext, szcardname.toCPointer<ByteVar>())

public actual fun SCardForgetReaderA(hcontext: ULong, szreadername: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardForgetReaderA(hcontext, szreadername.toCPointer<ByteVar>())

public actual fun SCardForgetReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA(hcontext, szgroupname.toCPointer<ByteVar>())

public actual fun SCardForgetReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW(hcontext, szgroupname.toCPointer<ByteVar>())

public actual fun SCardForgetReaderW(hcontext: ULong, szreadername: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardForgetReaderW(hcontext, szreadername.toCPointer<ByteVar>())

public actual fun SCardFreeMemory(hcontext: ULong, pvmem: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardFreeMemory(hcontext, pvmem.toCPointer<ByteVar>())

public actual fun SCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, pcbattrlen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetAttrib(hcard, dwattrid, pbattr.toCPointer<ByteVar>(), pcbattrlen.toCPointer<ByteVar>())

public actual fun SCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PSTR, pcchprovider: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA(hcontext, szcardname.toCPointer<ByteVar>(), dwproviderid, szprovider.toCPointer<ByteVar>(), pcchprovider.toCPointer<ByteVar>())

public actual fun SCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PWSTR, pcchprovider: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW(hcontext, szcardname.toCPointer<ByteVar>(), dwproviderid, szprovider.toCPointer<ByteVar>(), pcchprovider.toCPointer<ByteVar>())

public actual fun SCardGetDeviceTypeIdA(hcontext: ULong, szreadername: PCSTR, pdwdevicetypeid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA(hcontext, szreadername.toCPointer<ByteVar>(), pdwdevicetypeid.toCPointer<ByteVar>())

public actual fun SCardGetDeviceTypeIdW(hcontext: ULong, szreadername: PCWSTR, pdwdevicetypeid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW(hcontext, szreadername.toCPointer<ByteVar>(), pdwdevicetypeid.toCPointer<ByteVar>())

public actual fun SCardGetProviderIdA(hcontext: ULong, szcard: PCSTR, pguidproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetProviderIdA(hcontext, szcard.toCPointer<ByteVar>(), pguidproviderid.toCPointer<ByteVar>())

public actual fun SCardGetProviderIdW(hcontext: ULong, szcard: PCWSTR, pguidproviderid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetProviderIdW(hcontext, szcard.toCPointer<ByteVar>(), pguidproviderid.toCPointer<ByteVar>())

public actual fun SCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: PCSTR, szdeviceinstanceid: PSTR, pcchdeviceinstanceid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA(hcontext, szreadername.toCPointer<ByteVar>(), szdeviceinstanceid.toCPointer<ByteVar>(), pcchdeviceinstanceid.toCPointer<ByteVar>())

public actual fun SCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: PCWSTR, szdeviceinstanceid: PWSTR, pcchdeviceinstanceid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW(hcontext, szreadername.toCPointer<ByteVar>(), szdeviceinstanceid.toCPointer<ByteVar>(), pcchdeviceinstanceid.toCPointer<ByteVar>())

public actual fun SCardGetReaderIconA(hcontext: ULong, szreadername: PCSTR, pbicon: Long, pcbicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetReaderIconA(hcontext, szreadername.toCPointer<ByteVar>(), pbicon.toCPointer<ByteVar>(), pcbicon.toCPointer<ByteVar>())

public actual fun SCardGetReaderIconW(hcontext: ULong, szreadername: PCWSTR, pbicon: Long, pcbicon: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetReaderIconW(hcontext, szreadername.toCPointer<ByteVar>(), pbicon.toCPointer<ByteVar>(), pcbicon.toCPointer<ByteVar>())

public actual fun SCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetStatusChangeA(hcontext, dwtimeout, rgreaderstates.toCPointer<ByteVar>(), creaders)

public actual fun SCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetStatusChangeW(hcontext, dwtimeout, rgreaderstates.toCPointer<ByteVar>(), creaders)

public actual fun SCardGetTransmitCount(hcard: ULong, pctransmitcount: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardGetTransmitCount(hcard, pctransmitcount.toCPointer<ByteVar>())

public actual fun SCardIntroduceCardTypeA(hcontext: ULong, szcardname: PCSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA(hcontext, szcardname.toCPointer<ByteVar>(), pguidprimaryprovider.toCPointer<ByteVar>(), rgguidinterfaces.toCPointer<ByteVar>(), dwinterfacecount, pbatr.toCPointer<ByteVar>(), pbatrmask.toCPointer<ByteVar>(), cbatrlen)

public actual fun SCardIntroduceCardTypeW(hcontext: ULong, szcardname: PCWSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW(hcontext, szcardname.toCPointer<ByteVar>(), pguidprimaryprovider.toCPointer<ByteVar>(), rgguidinterfaces.toCPointer<ByteVar>(), dwinterfacecount, pbatr.toCPointer<ByteVar>(), pbatrmask.toCPointer<ByteVar>(), cbatrlen)

public actual fun SCardIntroduceReaderA(hcontext: ULong, szreadername: PCSTR, szdevicename: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardIntroduceReaderA(hcontext, szreadername.toCPointer<ByteVar>(), szdevicename.toCPointer<ByteVar>())

public actual fun SCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA(hcontext, szgroupname.toCPointer<ByteVar>())

public actual fun SCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW(hcontext, szgroupname.toCPointer<ByteVar>())

public actual fun SCardIntroduceReaderW(hcontext: ULong, szreadername: PCWSTR, szdevicename: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardIntroduceReaderW(hcontext, szreadername.toCPointer<ByteVar>(), szdevicename.toCPointer<ByteVar>())

public actual fun SCardIsValidContext(hcontext: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardIsValidContext(hcontext)

public actual fun SCardListCardsA(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PSTR, pcchcards: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListCardsA(hcontext, pbatr.toCPointer<ByteVar>(), rgquidinterfaces.toCPointer<ByteVar>(), cguidinterfacecount, mszcards.toCPointer<ByteVar>(), pcchcards.toCPointer<ByteVar>())

public actual fun SCardListCardsW(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PWSTR, pcchcards: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListCardsW(hcontext, pbatr.toCPointer<ByteVar>(), rgquidinterfaces.toCPointer<ByteVar>(), cguidinterfacecount, mszcards.toCPointer<ByteVar>(), pcchcards.toCPointer<ByteVar>())

public actual fun SCardListInterfacesA(hcontext: ULong, szcard: PCSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListInterfacesA(hcontext, szcard.toCPointer<ByteVar>(), pguidinterfaces.toCPointer<ByteVar>(), pcguidinterfaces.toCPointer<ByteVar>())

public actual fun SCardListInterfacesW(hcontext: ULong, szcard: PCWSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListInterfacesW(hcontext, szcard.toCPointer<ByteVar>(), pguidinterfaces.toCPointer<ByteVar>(), pcguidinterfaces.toCPointer<ByteVar>())

public actual fun SCardListReaderGroupsA(hcontext: ULong, mszgroups: PSTR, pcchgroups: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListReaderGroupsA(hcontext, mszgroups.toCPointer<ByteVar>(), pcchgroups.toCPointer<ByteVar>())

public actual fun SCardListReaderGroupsW(hcontext: ULong, mszgroups: PWSTR, pcchgroups: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListReaderGroupsW(hcontext, mszgroups.toCPointer<ByteVar>(), pcchgroups.toCPointer<ByteVar>())

public actual fun SCardListReadersA(hcontext: ULong, mszgroups: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListReadersA(hcontext, mszgroups.toCPointer<ByteVar>(), mszreaders.toCPointer<ByteVar>(), pcchreaders.toCPointer<ByteVar>())

public actual fun SCardListReadersW(hcontext: ULong, mszgroups: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListReadersW(hcontext, mszgroups.toCPointer<ByteVar>(), mszreaders.toCPointer<ByteVar>(), pcchreaders.toCPointer<ByteVar>())

public actual fun SCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA(hcontext, szdeviceinstanceid.toCPointer<ByteVar>(), mszreaders.toCPointer<ByteVar>(), pcchreaders.toCPointer<ByteVar>())

public actual fun SCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW(hcontext, szdeviceinstanceid.toCPointer<ByteVar>(), mszreaders.toCPointer<ByteVar>(), pcchreaders.toCPointer<ByteVar>())

public actual fun SCardLocateCardsA(hcontext: ULong, mszcards: PCSTR, rgreaderstates: Long, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardLocateCardsA(hcontext, mszcards.toCPointer<ByteVar>(), rgreaderstates.toCPointer<ByteVar>(), creaders)

public actual fun SCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA(hcontext, rgatrmasks.toCPointer<ByteVar>(), catrs, rgreaderstates.toCPointer<ByteVar>(), creaders)

public actual fun SCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW(hcontext, rgatrmasks.toCPointer<ByteVar>(), catrs, rgreaderstates.toCPointer<ByteVar>(), creaders)

public actual fun SCardLocateCardsW(hcontext: ULong, mszcards: PCWSTR, rgreaderstates: Long, creaders: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardLocateCardsW(hcontext, mszcards.toCPointer<ByteVar>(), rgreaderstates.toCPointer<ByteVar>(), creaders)

public actual fun SCardReadCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardReadCacheA(hcontext, cardidentifier.toCPointer<ByteVar>(), freshnesscounter, lookupname.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), datalen.toCPointer<ByteVar>())

public actual fun SCardReadCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardReadCacheW(hcontext, cardidentifier.toCPointer<ByteVar>(), freshnesscounter, lookupname.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), datalen.toCPointer<ByteVar>())

public actual fun SCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardReconnect(hcard, dwsharemode, dwpreferredprotocols, dwinitialization, pdwactiveprotocol.toCPointer<ByteVar>())

public actual fun SCardReleaseContext(hcontext: ULong): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardReleaseContext(hcontext)

public actual fun SCardReleaseStartedEvent() {
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent()
}

public actual fun SCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA(hcontext, szreadername.toCPointer<ByteVar>(), szgroupname.toCPointer<ByteVar>())

public actual fun SCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW(hcontext, szreadername.toCPointer<ByteVar>(), szgroupname.toCPointer<ByteVar>())

public actual fun SCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, cbattrlen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardSetAttrib(hcard, dwattrid, pbattr.toCPointer<ByteVar>(), cbattrlen)

public actual fun SCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA(hcontext, szcardname.toCPointer<ByteVar>(), dwproviderid, szprovider.toCPointer<ByteVar>())

public actual fun SCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW(hcontext, szcardname.toCPointer<ByteVar>(), dwproviderid, szprovider.toCPointer<ByteVar>())

public actual fun SCardState(hcard: ULong, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardState(hcard, pdwstate.toCPointer<ByteVar>(), pdwprotocol.toCPointer<ByteVar>(), pbatr.toCPointer<ByteVar>(), pcbatrlen.toCPointer<ByteVar>())

public actual fun SCardStatusA(hcard: ULong, mszreadernames: PSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardStatusA(hcard, mszreadernames.toCPointer<ByteVar>(), pcchreaderlen.toCPointer<ByteVar>(), pdwstate.toCPointer<ByteVar>(), pdwprotocol.toCPointer<ByteVar>(), pbatr.toCPointer<ByteVar>(), pcbatrlen.toCPointer<ByteVar>())

public actual fun SCardStatusW(hcard: ULong, mszreadernames: PWSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardStatusW(hcard, mszreadernames.toCPointer<ByteVar>(), pcchreaderlen.toCPointer<ByteVar>(), pdwstate.toCPointer<ByteVar>(), pdwprotocol.toCPointer<ByteVar>(), pbatr.toCPointer<ByteVar>(), pcbatrlen.toCPointer<ByteVar>())

public actual fun SCardTransmit(hcard: ULong, piosendpci: Long, pbsendbuffer: Long, cbsendlength: UInt, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardTransmit(hcard, piosendpci.toCPointer<ByteVar>(), pbsendbuffer.toCPointer<ByteVar>(), cbsendlength, piorecvpci.toCPointer<ByteVar>(), pbrecvbuffer.toCPointer<ByteVar>(), pcbrecvlength.toCPointer<ByteVar>())

public actual fun SCardUIDlgSelectCardA(param0: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA(param0.toCPointer<ByteVar>())

public actual fun SCardUIDlgSelectCardW(param0: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW(param0.toCPointer<ByteVar>())

public actual fun SCardWriteCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardWriteCacheA(hcontext, cardidentifier.toCPointer<ByteVar>(), freshnesscounter, lookupname.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), datalen)

public actual fun SCardWriteCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.security.credentials.cinterop.windowssys_windows_win32_security_credentials_SCardWriteCacheW(hcontext, cardidentifier.toCPointer<ByteVar>(), freshnesscounter, lookupname.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), datalen)
