@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SecurityCredentialsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CredDeleteA(targetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredDeleteA(targetname.toString(), type.toInt(), flags.toInt()) as Int) else 0

public actual fun CredDeleteW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredDeleteW(targetname.toString(), type.toInt(), flags.toInt()) as Int) else 0

public actual fun CredEnumerateA(filter: PCSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredEnumerateA(filter.toString(), flags.toInt(), count.toString(), credential.toString()) as Int) else 0

public actual fun CredEnumerateW(filter: PCWSTR, flags: CRED_ENUMERATE_FLAGS, count: Long, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredEnumerateW(filter.toString(), flags.toInt(), count.toString(), credential.toString()) as Int) else 0

public actual fun CredFindBestCredentialA(targetname: PCSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredFindBestCredentialA(targetname.toString(), type.toInt(), flags.toInt(), credential.toString()) as Int) else 0

public actual fun CredFindBestCredentialW(targetname: PCWSTR, type: UInt, flags: UInt, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredFindBestCredentialW(targetname.toString(), type.toInt(), flags.toInt(), credential.toString()) as Int) else 0

public actual fun CredFree(buffer: Long) {
    if (_windowsWin32SecurityCredentialsNapiAddon != null) {
        _windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredFree(buffer.toString())
    }
}

public actual fun CredGetSessionTypes(maximumpersistcount: UInt, maximumpersist: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredGetSessionTypes(maximumpersistcount.toInt(), maximumpersist.toString()) as Int) else 0

public actual fun CredGetTargetInfoA(targetname: PCSTR, flags: UInt, targetinfo: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredGetTargetInfoA(targetname.toString(), flags.toInt(), targetinfo.toString()) as Int) else 0

public actual fun CredGetTargetInfoW(targetname: PCWSTR, flags: UInt, targetinfo: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredGetTargetInfoW(targetname.toString(), flags.toInt(), targetinfo.toString()) as Int) else 0

public actual fun CredIsMarshaledCredentialA(marshaledcredential: PCSTR): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA(marshaledcredential.toString()) as Int) else 0

public actual fun CredIsMarshaledCredentialW(marshaledcredential: PCWSTR): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW(marshaledcredential.toString()) as Int) else 0

public actual fun CredIsProtectedA(pszprotectedcredentials: PCSTR, pprotectiontype: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredIsProtectedA(pszprotectedcredentials.toString(), pprotectiontype.toString()) as Int) else 0

public actual fun CredIsProtectedW(pszprotectedcredentials: PCWSTR, pprotectiontype: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredIsProtectedW(pszprotectedcredentials.toString(), pprotectiontype.toString()) as Int) else 0

public actual fun CredMarshalCredentialA(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredMarshalCredentialA(credtype, credential.toString(), marshaledcredential.toString()) as Int) else 0

public actual fun CredMarshalCredentialW(credtype: CRED_MARSHAL_TYPE, credential: Long, marshaledcredential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredMarshalCredentialW(credtype, credential.toString(), marshaledcredential.toString()) as Int) else 0

public actual fun CredPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pszusername: PCSTR, pszpassword: PCSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA(dwflags.toInt(), pszusername.toString(), pszpassword.toString(), ppackedcredentials.toString(), pcbpackedcredentials.toString()) as Int) else 0

public actual fun CredPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pszusername: PCWSTR, pszpassword: PCWSTR, ppackedcredentials: Long, pcbpackedcredentials: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW(dwflags.toInt(), pszusername.toString(), pszpassword.toString(), ppackedcredentials.toString(), pcbpackedcredentials.toString()) as Int) else 0

public actual fun CredProtectA(fasself: BOOL, pszcredentials: PCSTR, cchcredentials: UInt, pszprotectedcredentials: PSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredProtectA(fasself, pszcredentials.toString(), cchcredentials.toInt(), pszprotectedcredentials.toString(), pcchmaxchars.toString(), protectiontype.toString()) as Int) else 0

public actual fun CredProtectW(fasself: BOOL, pszcredentials: PCWSTR, cchcredentials: UInt, pszprotectedcredentials: PWSTR, pcchmaxchars: Long, protectiontype: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredProtectW(fasself, pszcredentials.toString(), cchcredentials.toInt(), pszprotectedcredentials.toString(), pcchmaxchars.toString(), protectiontype.toString()) as Int) else 0

public actual fun CredReadA(targetname: PCSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredReadA(targetname.toString(), type.toInt(), flags.toInt(), credential.toString()) as Int) else 0

public actual fun CredReadDomainCredentialsA(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA(targetinfo.toString(), flags.toInt(), count.toString(), credential.toString()) as Int) else 0

public actual fun CredReadDomainCredentialsW(targetinfo: Long, flags: UInt, count: Long, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW(targetinfo.toString(), flags.toInt(), count.toString(), credential.toString()) as Int) else 0

public actual fun CredReadW(targetname: PCWSTR, type: CRED_TYPE, flags: UInt, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredReadW(targetname.toString(), type.toInt(), flags.toInt(), credential.toString()) as Int) else 0

public actual fun CredRenameA(oldtargetname: PCSTR, newtargetname: PCSTR, type: CRED_TYPE, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredRenameA(oldtargetname.toString(), newtargetname.toString(), type.toInt(), flags.toInt()) as Int) else 0

public actual fun CredRenameW(oldtargetname: PCWSTR, newtargetname: PCWSTR, type: CRED_TYPE, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredRenameW(oldtargetname.toString(), newtargetname.toString(), type.toInt(), flags.toInt()) as Int) else 0

public actual fun CredUICmdLinePromptForCredentialsA(psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, username: PSTR, uluserbuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA(psztargetname.toString(), pcontext.toString(), dwautherror.toInt(), username.toString(), uluserbuffersize.toInt(), pszpassword.toString(), ulpasswordbuffersize.toInt(), pfsave.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun CredUICmdLinePromptForCredentialsW(psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, username: PWSTR, uluserbuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, pfsave: Long, dwflags: CREDUI_FLAGS): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW(psztargetname.toString(), pcontext.toString(), dwautherror.toInt(), username.toString(), uluserbuffersize.toInt(), pszpassword.toString(), ulpasswordbuffersize.toInt(), pfsave.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun CredUIConfirmCredentialsA(psztargetname: PCSTR, bconfirm: BOOL): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA(psztargetname.toString(), bconfirm) as Int).toUInt() else 0u

public actual fun CredUIConfirmCredentialsW(psztargetname: PCWSTR, bconfirm: BOOL): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW(psztargetname.toString(), bconfirm) as Int).toUInt() else 0u

public actual fun CredUIParseUserNameA(username: PCSTR, user: PSTR, userbuffersize: UInt, domain: PSTR, domainbuffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIParseUserNameA(username.toString(), user.toString(), userbuffersize.toInt(), domain.toString(), domainbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun CredUIParseUserNameW(username: PCWSTR, user: PWSTR, userbuffersize: UInt, domain: PWSTR, domainbuffersize: UInt): WIN32_ERROR =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIParseUserNameW(username.toString(), user.toString(), userbuffersize.toInt(), domain.toString(), domainbuffersize.toInt()) as Int).toUInt() else 0u

public actual fun CredUIPromptForCredentialsA(puiinfo: Long, psztargetname: PCSTR, pcontext: Long, dwautherror: UInt, pszusername: PSTR, ulusernamebuffersize: UInt, pszpassword: PSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA(puiinfo.toString(), psztargetname.toString(), pcontext.toString(), dwautherror.toInt(), pszusername.toString(), ulusernamebuffersize.toInt(), pszpassword.toString(), ulpasswordbuffersize.toInt(), save.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun CredUIPromptForCredentialsW(puiinfo: Long, psztargetname: PCWSTR, pcontext: Long, dwautherror: UInt, pszusername: PWSTR, ulusernamebuffersize: UInt, pszpassword: PWSTR, ulpasswordbuffersize: UInt, save: Long, dwflags: CREDUI_FLAGS): WIN32_ERROR =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW(puiinfo.toString(), psztargetname.toString(), pcontext.toString(), dwautherror.toInt(), pszusername.toString(), ulusernamebuffersize.toInt(), pszpassword.toString(), ulpasswordbuffersize.toInt(), save.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun CredUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA(puiinfo.toString(), dwautherror.toInt(), pulauthpackage.toString(), pvinauthbuffer.toString(), ulinauthbuffersize.toInt(), ppvoutauthbuffer.toString(), puloutauthbuffersize.toString(), pfsave.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun CredUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: UInt, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: UInt, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: CREDUIWIN_FLAGS): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW(puiinfo.toString(), dwautherror.toInt(), pulauthpackage.toString(), pvinauthbuffer.toString(), ulinauthbuffersize.toInt(), ppvoutauthbuffer.toString(), puloutauthbuffersize.toString(), pfsave.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun CredUIReadSSOCredW(pszrealm: PCWSTR, ppszusername: Long): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIReadSSOCredW(pszrealm.toString(), ppszusername.toString()) as Int).toUInt() else 0u

public actual fun CredUIStoreSSOCredW(pszrealm: PCWSTR, pszusername: PCWSTR, pszpassword: PCWSTR, bpersist: BOOL): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW(pszrealm.toString(), pszusername.toString(), pszpassword.toString(), bpersist) as Int).toUInt() else 0u

public actual fun CredUnPackAuthenticationBufferA(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PSTR, pcchlmaxusername: Long, pszdomainname: PSTR, pcchmaxdomainname: Long, pszpassword: PSTR, pcchmaxpassword: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA(dwflags.toInt(), pauthbuffer.toString(), cbauthbuffer.toInt(), pszusername.toString(), pcchlmaxusername.toString(), pszdomainname.toString(), pcchmaxdomainname.toString(), pszpassword.toString(), pcchmaxpassword.toString()) as Int) else 0

public actual fun CredUnPackAuthenticationBufferW(dwflags: CRED_PACK_FLAGS, pauthbuffer: Long, cbauthbuffer: UInt, pszusername: PWSTR, pcchmaxusername: Long, pszdomainname: PWSTR, pcchmaxdomainname: Long, pszpassword: PWSTR, pcchmaxpassword: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW(dwflags.toInt(), pauthbuffer.toString(), cbauthbuffer.toInt(), pszusername.toString(), pcchmaxusername.toString(), pszdomainname.toString(), pcchmaxdomainname.toString(), pszpassword.toString(), pcchmaxpassword.toString()) as Int) else 0

public actual fun CredUnmarshalCredentialA(marshaledcredential: PCSTR, credtype: Long, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA(marshaledcredential.toString(), credtype.toString(), credential.toString()) as Int) else 0

public actual fun CredUnmarshalCredentialW(marshaledcredential: PCWSTR, credtype: Long, credential: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW(marshaledcredential.toString(), credtype.toString(), credential.toString()) as Int) else 0

public actual fun CredUnprotectA(fasself: BOOL, pszprotectedcredentials: PCSTR, cchprotectedcredentials: UInt, pszcredentials: PSTR, pcchmaxchars: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUnprotectA(fasself, pszprotectedcredentials.toString(), cchprotectedcredentials.toInt(), pszcredentials.toString(), pcchmaxchars.toString()) as Int) else 0

public actual fun CredUnprotectW(fasself: BOOL, pszprotectedcredentials: PCWSTR, cchprotectedcredentials: UInt, pszcredentials: PWSTR, pcchmaxchars: Long): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredUnprotectW(fasself, pszprotectedcredentials.toString(), cchprotectedcredentials.toInt(), pszcredentials.toString(), pcchmaxchars.toString()) as Int) else 0

public actual fun CredWriteA(credential: Long, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredWriteA(credential.toString(), flags.toInt()) as Int) else 0

public actual fun CredWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA(targetinfo.toString(), credential.toString(), flags.toInt()) as Int) else 0

public actual fun CredWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW(targetinfo.toString(), credential.toString(), flags.toInt()) as Int) else 0

public actual fun CredWriteW(credential: Long, flags: UInt): BOOL =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_CredWriteW(credential.toString(), flags.toInt()) as Int) else 0

public actual fun GetOpenCardNameA(param0: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_GetOpenCardNameA(param0.toString()) as Int) else 0

public actual fun GetOpenCardNameW(param0: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_GetOpenCardNameW(param0.toString()) as Int) else 0

public actual fun KeyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long) {
    if (_windowsWin32SecurityCredentialsNapiAddon != null) {
        _windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation(keycredentialmanagerinfo.toString())
    }
}

public actual fun KeyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): HRESULT =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation(keycredentialmanagerinfo.toString()) as Int) else 0

public actual fun KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: Long, keycredentialmanageroperationerrorstates: Long): HRESULT =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready.toString(), keycredentialmanageroperationerrorstates.toString()) as Int) else 0

public actual fun KeyCredentialManagerShowUIOperation(hwndowner: HWND, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): HRESULT =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation(hwndowner.toString(), keycredentialmanageroperationtype) as Int) else 0

public actual fun SCardAccessStartedEvent(): HANDLE =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardAccessStartedEvent() as String).toLong() else 0L

public actual fun SCardAddReaderToGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA(hcontext.toString(), szreadername.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardAddReaderToGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW(hcontext.toString(), szreadername.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardAudit(hcontext: ULong, dwevent: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardAudit(hcontext.toString(), dwevent.toInt()) as Int) else 0

public actual fun SCardBeginTransaction(hcard: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardBeginTransaction(hcard.toString()) as Int) else 0

public actual fun SCardCancel(hcontext: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardCancel(hcontext.toString()) as Int) else 0

public actual fun SCardConnectA(hcontext: ULong, szreader: PCSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardConnectA(hcontext.toString(), szreader.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.toString(), pdwactiveprotocol.toString()) as Int) else 0

public actual fun SCardConnectW(hcontext: ULong, szreader: PCWSTR, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: Long, pdwactiveprotocol: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardConnectW(hcontext.toString(), szreader.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.toString(), pdwactiveprotocol.toString()) as Int) else 0

public actual fun SCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardControl(hcard.toString(), dwcontrolcode.toInt(), lpinbuffer.toString(), cbinbuffersize.toInt(), lpoutbuffer.toString(), cboutbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0

public actual fun SCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardDisconnect(hcard.toString(), dwdisposition.toInt()) as Int) else 0

public actual fun SCardDlgExtendedError(): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardDlgExtendedError() as Int) else 0

public actual fun SCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardEndTransaction(hcard.toString(), dwdisposition.toInt()) as Int) else 0

public actual fun SCardEstablishContext(dwscope: SCARD_SCOPE, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardEstablishContext(dwscope.toInt(), pvreserved1.toString(), pvreserved2.toString(), phcontext.toString()) as Int) else 0

public actual fun SCardForgetCardTypeA(hcontext: ULong, szcardname: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardForgetCardTypeA(hcontext.toString(), szcardname.toString()) as Int) else 0

public actual fun SCardForgetCardTypeW(hcontext: ULong, szcardname: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardForgetCardTypeW(hcontext.toString(), szcardname.toString()) as Int) else 0

public actual fun SCardForgetReaderA(hcontext: ULong, szreadername: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardForgetReaderA(hcontext.toString(), szreadername.toString()) as Int) else 0

public actual fun SCardForgetReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA(hcontext.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardForgetReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW(hcontext.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardForgetReaderW(hcontext: ULong, szreadername: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardForgetReaderW(hcontext.toString(), szreadername.toString()) as Int) else 0

public actual fun SCardFreeMemory(hcontext: ULong, pvmem: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardFreeMemory(hcontext.toString(), pvmem.toString()) as Int) else 0

public actual fun SCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, pcbattrlen: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetAttrib(hcard.toString(), dwattrid.toInt(), pbattr.toString(), pcbattrlen.toString()) as Int) else 0

public actual fun SCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PSTR, pcchprovider: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA(hcontext.toString(), szcardname.toString(), dwproviderid.toInt(), szprovider.toString(), pcchprovider.toString()) as Int) else 0

public actual fun SCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PWSTR, pcchprovider: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW(hcontext.toString(), szcardname.toString(), dwproviderid.toInt(), szprovider.toString(), pcchprovider.toString()) as Int) else 0

public actual fun SCardGetDeviceTypeIdA(hcontext: ULong, szreadername: PCSTR, pdwdevicetypeid: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA(hcontext.toString(), szreadername.toString(), pdwdevicetypeid.toString()) as Int) else 0

public actual fun SCardGetDeviceTypeIdW(hcontext: ULong, szreadername: PCWSTR, pdwdevicetypeid: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW(hcontext.toString(), szreadername.toString(), pdwdevicetypeid.toString()) as Int) else 0

public actual fun SCardGetProviderIdA(hcontext: ULong, szcard: PCSTR, pguidproviderid: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetProviderIdA(hcontext.toString(), szcard.toString(), pguidproviderid.toString()) as Int) else 0

public actual fun SCardGetProviderIdW(hcontext: ULong, szcard: PCWSTR, pguidproviderid: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetProviderIdW(hcontext.toString(), szcard.toString(), pguidproviderid.toString()) as Int) else 0

public actual fun SCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: PCSTR, szdeviceinstanceid: PSTR, pcchdeviceinstanceid: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA(hcontext.toString(), szreadername.toString(), szdeviceinstanceid.toString(), pcchdeviceinstanceid.toString()) as Int) else 0

public actual fun SCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: PCWSTR, szdeviceinstanceid: PWSTR, pcchdeviceinstanceid: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW(hcontext.toString(), szreadername.toString(), szdeviceinstanceid.toString(), pcchdeviceinstanceid.toString()) as Int) else 0

public actual fun SCardGetReaderIconA(hcontext: ULong, szreadername: PCSTR, pbicon: Long, pcbicon: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetReaderIconA(hcontext.toString(), szreadername.toString(), pbicon.toString(), pcbicon.toString()) as Int) else 0

public actual fun SCardGetReaderIconW(hcontext: ULong, szreadername: PCWSTR, pbicon: Long, pcbicon: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetReaderIconW(hcontext.toString(), szreadername.toString(), pbicon.toString(), pcbicon.toString()) as Int) else 0

public actual fun SCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetStatusChangeA(hcontext.toString(), dwtimeout.toInt(), rgreaderstates.toString(), creaders.toInt()) as Int) else 0

public actual fun SCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: Long, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetStatusChangeW(hcontext.toString(), dwtimeout.toInt(), rgreaderstates.toString(), creaders.toInt()) as Int) else 0

public actual fun SCardGetTransmitCount(hcard: ULong, pctransmitcount: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardGetTransmitCount(hcard.toString(), pctransmitcount.toString()) as Int) else 0

public actual fun SCardIntroduceCardTypeA(hcontext: ULong, szcardname: PCSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA(hcontext.toString(), szcardname.toString(), pguidprimaryprovider.toString(), rgguidinterfaces.toString(), dwinterfacecount.toInt(), pbatr.toString(), pbatrmask.toString(), cbatrlen.toInt()) as Int) else 0

public actual fun SCardIntroduceCardTypeW(hcontext: ULong, szcardname: PCWSTR, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: UInt, pbatr: Long, pbatrmask: Long, cbatrlen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW(hcontext.toString(), szcardname.toString(), pguidprimaryprovider.toString(), rgguidinterfaces.toString(), dwinterfacecount.toInt(), pbatr.toString(), pbatrmask.toString(), cbatrlen.toInt()) as Int) else 0

public actual fun SCardIntroduceReaderA(hcontext: ULong, szreadername: PCSTR, szdevicename: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardIntroduceReaderA(hcontext.toString(), szreadername.toString(), szdevicename.toString()) as Int) else 0

public actual fun SCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA(hcontext.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW(hcontext.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardIntroduceReaderW(hcontext: ULong, szreadername: PCWSTR, szdevicename: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardIntroduceReaderW(hcontext.toString(), szreadername.toString(), szdevicename.toString()) as Int) else 0

public actual fun SCardIsValidContext(hcontext: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardIsValidContext(hcontext.toString()) as Int) else 0

public actual fun SCardListCardsA(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PSTR, pcchcards: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListCardsA(hcontext.toString(), pbatr.toString(), rgquidinterfaces.toString(), cguidinterfacecount.toInt(), mszcards.toString(), pcchcards.toString()) as Int) else 0

public actual fun SCardListCardsW(hcontext: ULong, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: UInt, mszcards: PWSTR, pcchcards: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListCardsW(hcontext.toString(), pbatr.toString(), rgquidinterfaces.toString(), cguidinterfacecount.toInt(), mszcards.toString(), pcchcards.toString()) as Int) else 0

public actual fun SCardListInterfacesA(hcontext: ULong, szcard: PCSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListInterfacesA(hcontext.toString(), szcard.toString(), pguidinterfaces.toString(), pcguidinterfaces.toString()) as Int) else 0

public actual fun SCardListInterfacesW(hcontext: ULong, szcard: PCWSTR, pguidinterfaces: Long, pcguidinterfaces: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListInterfacesW(hcontext.toString(), szcard.toString(), pguidinterfaces.toString(), pcguidinterfaces.toString()) as Int) else 0

public actual fun SCardListReaderGroupsA(hcontext: ULong, mszgroups: PSTR, pcchgroups: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListReaderGroupsA(hcontext.toString(), mszgroups.toString(), pcchgroups.toString()) as Int) else 0

public actual fun SCardListReaderGroupsW(hcontext: ULong, mszgroups: PWSTR, pcchgroups: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListReaderGroupsW(hcontext.toString(), mszgroups.toString(), pcchgroups.toString()) as Int) else 0

public actual fun SCardListReadersA(hcontext: ULong, mszgroups: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListReadersA(hcontext.toString(), mszgroups.toString(), mszreaders.toString(), pcchreaders.toString()) as Int) else 0

public actual fun SCardListReadersW(hcontext: ULong, mszgroups: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListReadersW(hcontext.toString(), mszgroups.toString(), mszreaders.toString(), pcchreaders.toString()) as Int) else 0

public actual fun SCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: PCSTR, mszreaders: PSTR, pcchreaders: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA(hcontext.toString(), szdeviceinstanceid.toString(), mszreaders.toString(), pcchreaders.toString()) as Int) else 0

public actual fun SCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: PCWSTR, mszreaders: PWSTR, pcchreaders: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW(hcontext.toString(), szdeviceinstanceid.toString(), mszreaders.toString(), pcchreaders.toString()) as Int) else 0

public actual fun SCardLocateCardsA(hcontext: ULong, mszcards: PCSTR, rgreaderstates: Long, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardLocateCardsA(hcontext.toString(), mszcards.toString(), rgreaderstates.toString(), creaders.toInt()) as Int) else 0

public actual fun SCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA(hcontext.toString(), rgatrmasks.toString(), catrs.toInt(), rgreaderstates.toString(), creaders.toInt()) as Int) else 0

public actual fun SCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: Long, catrs: UInt, rgreaderstates: Long, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW(hcontext.toString(), rgatrmasks.toString(), catrs.toInt(), rgreaderstates.toString(), creaders.toInt()) as Int) else 0

public actual fun SCardLocateCardsW(hcontext: ULong, mszcards: PCWSTR, rgreaderstates: Long, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardLocateCardsW(hcontext.toString(), mszcards.toString(), rgreaderstates.toString(), creaders.toInt()) as Int) else 0

public actual fun SCardReadCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardReadCacheA(hcontext.toString(), cardidentifier.toString(), freshnesscounter.toInt(), lookupname.toString(), data.toString(), datalen.toString()) as Int) else 0

public actual fun SCardReadCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardReadCacheW(hcontext.toString(), cardidentifier.toString(), freshnesscounter.toInt(), lookupname.toString(), data.toString(), datalen.toString()) as Int) else 0

public actual fun SCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardReconnect(hcard.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), dwinitialization.toInt(), pdwactiveprotocol.toString()) as Int) else 0

public actual fun SCardReleaseContext(hcontext: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardReleaseContext(hcontext.toString()) as Int) else 0

public actual fun SCardReleaseStartedEvent() {
    if (_windowsWin32SecurityCredentialsNapiAddon != null) {
        _windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent()
    }
}

public actual fun SCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: PCSTR, szgroupname: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA(hcontext.toString(), szreadername.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: PCWSTR, szgroupname: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW(hcontext.toString(), szreadername.toString(), szgroupname.toString()) as Int) else 0

public actual fun SCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: Long, cbattrlen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardSetAttrib(hcard.toString(), dwattrid.toInt(), pbattr.toString(), cbattrlen.toInt()) as Int) else 0

public actual fun SCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: PCSTR, dwproviderid: UInt, szprovider: PCSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA(hcontext.toString(), szcardname.toString(), dwproviderid.toInt(), szprovider.toString()) as Int) else 0

public actual fun SCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: PCWSTR, dwproviderid: UInt, szprovider: PCWSTR): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW(hcontext.toString(), szcardname.toString(), dwproviderid.toInt(), szprovider.toString()) as Int) else 0

public actual fun SCardState(hcard: ULong, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardState(hcard.toString(), pdwstate.toString(), pdwprotocol.toString(), pbatr.toString(), pcbatrlen.toString()) as Int) else 0

public actual fun SCardStatusA(hcard: ULong, mszreadernames: PSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardStatusA(hcard.toString(), mszreadernames.toString(), pcchreaderlen.toString(), pdwstate.toString(), pdwprotocol.toString(), pbatr.toString(), pcbatrlen.toString()) as Int) else 0

public actual fun SCardStatusW(hcard: ULong, mszreadernames: PWSTR, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardStatusW(hcard.toString(), mszreadernames.toString(), pcchreaderlen.toString(), pdwstate.toString(), pdwprotocol.toString(), pbatr.toString(), pcbatrlen.toString()) as Int) else 0

public actual fun SCardTransmit(hcard: ULong, piosendpci: Long, pbsendbuffer: Long, cbsendlength: UInt, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardTransmit(hcard.toString(), piosendpci.toString(), pbsendbuffer.toString(), cbsendlength.toInt(), piorecvpci.toString(), pbrecvbuffer.toString(), pcbrecvlength.toString()) as Int) else 0

public actual fun SCardUIDlgSelectCardA(param0: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA(param0.toString()) as Int) else 0

public actual fun SCardUIDlgSelectCardW(param0: Long): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW(param0.toString()) as Int) else 0

public actual fun SCardWriteCacheA(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCSTR, data: Long, datalen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardWriteCacheA(hcontext.toString(), cardidentifier.toString(), freshnesscounter.toInt(), lookupname.toString(), data.toString(), datalen.toInt()) as Int) else 0

public actual fun SCardWriteCacheW(hcontext: ULong, cardidentifier: Long, freshnesscounter: UInt, lookupname: PCWSTR, data: Long, datalen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_SCardWriteCacheW(hcontext.toString(), cardidentifier.toString(), freshnesscounter.toInt(), lookupname.toString(), data.toString(), datalen.toInt()) as Int) else 0
