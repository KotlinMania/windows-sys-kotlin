@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SecurityCredentialsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credDeleteA((targetname?.value ?: 0L).toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credDeleteW((targetname?.value ?: 0L).toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credEnumerateA((filter?.value ?: 0L).toString(), flags.toInt(), (count?.value ?: 0L).toString(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credEnumerateW((filter?.value ?: 0L).toString(), flags.toInt(), (count?.value ?: 0L).toString(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credFindBestCredentialA((targetname?.value ?: 0L).toString(), type.toInt(), flags.toInt(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credFindBestCredentialW((targetname?.value ?: 0L).toString(), type.toInt(), flags.toInt(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFree(buffer: COpaquePointer?) {
    if (_windowsWin32SecurityCredentialsNapiAddon != null) {
        _windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credFree((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credGetSessionTypes(maximumpersistcount.toInt(), (maximumpersist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credGetTargetInfoA((targetname?.value ?: 0L).toString(), flags.toInt(), (targetinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credGetTargetInfoW((targetname?.value ?: 0L).toString(), flags.toInt(), (targetinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credIsMarshaledCredentialA((marshaledcredential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credIsMarshaledCredentialW((marshaledcredential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credIsProtectedA((pszprotectedcredentials?.value ?: 0L).toString(), (pprotectiontype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credIsProtectedW((pszprotectedcredentials?.value ?: 0L).toString(), (pprotectiontype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credMarshalCredentialA(credtype, (credential?.value ?: 0L).toString(), (marshaledcredential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: COpaquePointer?, marshaledcredential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credMarshalCredentialW(credtype, (credential?.value ?: 0L).toString(), (marshaledcredential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credPackAuthenticationBufferA(dwflags.toInt(), (pszusername?.value ?: 0L).toString(), (pszpassword?.value ?: 0L).toString(), (ppackedcredentials?.value ?: 0L).toString(), (pcbpackedcredentials?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: COpaquePointer?, pcbpackedcredentials: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credPackAuthenticationBufferW(dwflags.toInt(), (pszusername?.value ?: 0L).toString(), (pszpassword?.value ?: 0L).toString(), (ppackedcredentials?.value ?: 0L).toString(), (pcbpackedcredentials?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credProtectA(fasself, (pszcredentials?.value ?: 0L).toString(), cchcredentials.toInt(), (pszprotectedcredentials?.value ?: 0L).toString(), (pcchmaxchars?.value ?: 0L).toString(), (protectiontype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: COpaquePointer?, protectiontype: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credProtectW(fasself, (pszcredentials?.value ?: 0L).toString(), cchcredentials.toInt(), (pszprotectedcredentials?.value ?: 0L).toString(), (pcchmaxchars?.value ?: 0L).toString(), (protectiontype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credReadA((targetname?.value ?: 0L).toString(), type.toInt(), flags.toInt(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadDomainCredentialsA(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credReadDomainCredentialsA((targetinfo?.value ?: 0L).toString(), flags.toInt(), (count?.value ?: 0L).toString(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadDomainCredentialsW(targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credReadDomainCredentialsW((targetinfo?.value ?: 0L).toString(), flags.toInt(), (count?.value ?: 0L).toString(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credReadW((targetname?.value ?: 0L).toString(), type.toInt(), flags.toInt(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credRenameA((oldtargetname?.value ?: 0L).toString(), (newtargetname?.value ?: 0L).toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credRenameW((oldtargetname?.value ?: 0L).toString(), (newtargetname?.value ?: 0L).toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsA((psztargetname?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), dwautherror.toInt(), (username?.value ?: 0L).toString(), uluserbuffersize.toInt(), (pszpassword?.value ?: 0L).toString(), ulpasswordbuffersize.toInt(), (pfsave?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: COpaquePointer?, dwflags: CreduiFlags): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUICmdLinePromptForCredentialsW((psztargetname?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), dwautherror.toInt(), (username?.value ?: 0L).toString(), uluserbuffersize.toInt(), (pszpassword?.value ?: 0L).toString(), ulpasswordbuffersize.toInt(), (pfsave?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIConfirmCredentialsA((psztargetname?.value ?: 0L).toString(), bconfirm) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIConfirmCredentialsW((psztargetname?.value ?: 0L).toString(), bconfirm) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIParseUserNameA((username?.value ?: 0L).toString(), (user?.value ?: 0L).toString(), userbuffersize.toInt(), (domain?.value ?: 0L).toString(), domainbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIParseUserNameW((username?.value ?: 0L).toString(), (user?.value ?: 0L).toString(), userbuffersize.toInt(), (domain?.value ?: 0L).toString(), domainbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForCredentialsA(puiinfo: COpaquePointer?, psztargetname: Pcstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIPromptForCredentialsA((puiinfo?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), dwautherror.toInt(), (pszusername?.value ?: 0L).toString(), ulusernamebuffersize.toInt(), (pszpassword?.value ?: 0L).toString(), ulpasswordbuffersize.toInt(), (save?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForCredentialsW(puiinfo: COpaquePointer?, psztargetname: Pcwstr, pcontext: COpaquePointer?, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: COpaquePointer?, dwflags: CreduiFlags): Win32Error =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIPromptForCredentialsW((puiinfo?.value ?: 0L).toString(), (psztargetname?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString(), dwautherror.toInt(), (pszusername?.value ?: 0L).toString(), ulusernamebuffersize.toInt(), (pszpassword?.value ?: 0L).toString(), ulpasswordbuffersize.toInt(), (save?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsA((puiinfo?.value ?: 0L).toString(), dwautherror.toInt(), (pulauthpackage?.value ?: 0L).toString(), (pvinauthbuffer?.value ?: 0L).toString(), ulinauthbuffersize.toInt(), (ppvoutauthbuffer?.value ?: 0L).toString(), (puloutauthbuffersize?.value ?: 0L).toString(), (pfsave?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: COpaquePointer?, dwautherror: UInt, pulauthpackage: COpaquePointer?, pvinauthbuffer: COpaquePointer?, ulinauthbuffersize: UInt, ppvoutauthbuffer: COpaquePointer?, puloutauthbuffersize: COpaquePointer?, pfsave: COpaquePointer?, dwflags: CreduiwinFlags): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIPromptForWindowsCredentialsW((puiinfo?.value ?: 0L).toString(), dwautherror.toInt(), (pulauthpackage?.value ?: 0L).toString(), (pvinauthbuffer?.value ?: 0L).toString(), ulinauthbuffersize.toInt(), (ppvoutauthbuffer?.value ?: 0L).toString(), (puloutauthbuffersize?.value ?: 0L).toString(), (pfsave?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: COpaquePointer?): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIReadSSOCredW((pszrealm?.value ?: 0L).toString(), (ppszusername?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUIStoreSSOCredW((pszrealm?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pszpassword?.value ?: 0L).toString(), bpersist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: COpaquePointer?, pszdomainname: Pstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pstr, pcchmaxpassword: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferA(dwflags.toInt(), (pauthbuffer?.value ?: 0L).toString(), cbauthbuffer.toInt(), (pszusername?.value ?: 0L).toString(), (pcchlmaxusername?.value ?: 0L).toString(), (pszdomainname?.value ?: 0L).toString(), (pcchmaxdomainname?.value ?: 0L).toString(), (pszpassword?.value ?: 0L).toString(), (pcchmaxpassword?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: COpaquePointer?, pszdomainname: Pwstr, pcchmaxdomainname: COpaquePointer?, pszpassword: Pwstr, pcchmaxpassword: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUnPackAuthenticationBufferW(dwflags.toInt(), (pauthbuffer?.value ?: 0L).toString(), cbauthbuffer.toInt(), (pszusername?.value ?: 0L).toString(), (pcchmaxusername?.value ?: 0L).toString(), (pszdomainname?.value ?: 0L).toString(), (pcchmaxdomainname?.value ?: 0L).toString(), (pszpassword?.value ?: 0L).toString(), (pcchmaxpassword?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUnmarshalCredentialA((marshaledcredential?.value ?: 0L).toString(), (credtype?.value ?: 0L).toString(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: COpaquePointer?, credential: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUnmarshalCredentialW((marshaledcredential?.value ?: 0L).toString(), (credtype?.value ?: 0L).toString(), (credential?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUnprotectA(fasself, (pszprotectedcredentials?.value ?: 0L).toString(), cchprotectedcredentials.toInt(), (pszcredentials?.value ?: 0L).toString(), (pcchmaxchars?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credUnprotectW(fasself, (pszprotectedcredentials?.value ?: 0L).toString(), cchprotectedcredentials.toInt(), (pszcredentials?.value ?: 0L).toString(), (pcchmaxchars?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteA(credential: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credWriteA((credential?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteDomainCredentialsA(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credWriteDomainCredentialsA((targetinfo?.value ?: 0L).toString(), (credential?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteDomainCredentialsW(targetinfo: COpaquePointer?, credential: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credWriteDomainCredentialsW((targetinfo?.value ?: 0L).toString(), (credential?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteW(credential: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_credWriteW((credential?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenCardNameA(param0: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_getOpenCardNameA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenCardNameW(param0: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_getOpenCardNameW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: COpaquePointer?) {
    if (_windowsWin32SecurityCredentialsNapiAddon != null) {
        _windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_keyCredentialManagerFreeInformation((keycredentialmanagerinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_keyCredentialManagerGetInformation((keycredentialmanagerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: COpaquePointer?, keycredentialmanageroperationerrorstates: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, (isready?.value ?: 0L).toString(), (keycredentialmanageroperationerrorstates?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_keyCredentialManagerShowUIOperation((hwndowner?.value ?: 0L).toString(), keycredentialmanageroperationtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAccessStartedEvent(): Handle =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardAccessStartedEvent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardAddReaderToGroupA(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardAddReaderToGroupW(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardAudit(hcontext.toString(), dwevent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardBeginTransaction(hcard.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardCancel(hcontext: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardCancel(hcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardConnectA(hcontext.toString(), (szreader?.value ?: 0L).toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), (phcard?.value ?: 0L).toString(), (pdwactiveprotocol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: COpaquePointer?, pdwactiveprotocol: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardConnectW(hcontext.toString(), (szreader?.value ?: 0L).toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), (phcard?.value ?: 0L).toString(), (pdwactiveprotocol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardControl(hcard.toString(), dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L).toString(), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L).toString(), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardDisconnect(hcard.toString(), dwdisposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardDlgExtendedError(): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardDlgExtendedError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardEndTransaction(hcard.toString(), dwdisposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: COpaquePointer?, pvreserved2: COpaquePointer?, phcontext: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardEstablishContext(dwscope.toInt(), (pvreserved1?.value ?: 0L).toString(), (pvreserved2?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardForgetCardTypeA(hcontext.toString(), (szcardname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardForgetCardTypeW(hcontext.toString(), (szcardname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardForgetReaderA(hcontext.toString(), (szreadername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardForgetReaderGroupA(hcontext.toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardForgetReaderGroupW(hcontext.toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardForgetReaderW(hcontext.toString(), (szreadername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardFreeMemory(hcontext.toString(), (pvmem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, pcbattrlen: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetAttrib(hcard.toString(), dwattrid.toInt(), (pbattr?.value ?: 0L).toString(), (pcbattrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameA(hcontext.toString(), (szcardname?.value ?: 0L).toString(), dwproviderid.toInt(), (szprovider?.value ?: 0L).toString(), (pcchprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetCardTypeProviderNameW(hcontext.toString(), (szcardname?.value ?: 0L).toString(), dwproviderid.toInt(), (szprovider?.value ?: 0L).toString(), (pcchprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdA(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (pdwdevicetypeid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetDeviceTypeIdW(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (pdwdevicetypeid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetProviderIdA(hcontext.toString(), (szcard?.value ?: 0L).toString(), (pguidproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetProviderIdW(hcontext.toString(), (szcard?.value ?: 0L).toString(), (pguidproviderid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdA(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szdeviceinstanceid?.value ?: 0L).toString(), (pcchdeviceinstanceid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetReaderDeviceInstanceIdW(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szdeviceinstanceid?.value ?: 0L).toString(), (pcchdeviceinstanceid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetReaderIconA(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (pbicon?.value ?: 0L).toString(), (pcbicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: COpaquePointer?, pcbicon: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetReaderIconW(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (pbicon?.value ?: 0L).toString(), (pcbicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetStatusChangeA(hcontext.toString(), dwtimeout.toInt(), (rgreaderstates?.value ?: 0L).toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetStatusChangeW(hcontext.toString(), dwtimeout.toInt(), (rgreaderstates?.value ?: 0L).toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardGetTransmitCount(hcard.toString(), (pctransmitcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeA(hcontext.toString(), (szcardname?.value ?: 0L).toString(), (pguidprimaryprovider?.value ?: 0L).toString(), (rgguidinterfaces?.value ?: 0L).toString(), dwinterfacecount.toInt(), (pbatr?.value ?: 0L).toString(), (pbatrmask?.value ?: 0L).toString(), cbatrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: COpaquePointer?, rgguidinterfaces: COpaquePointer?, dwinterfacecount: UInt, pbatr: COpaquePointer?, pbatrmask: COpaquePointer?, cbatrlen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardIntroduceCardTypeW(hcontext.toString(), (szcardname?.value ?: 0L).toString(), (pguidprimaryprovider?.value ?: 0L).toString(), (rgguidinterfaces?.value ?: 0L).toString(), dwinterfacecount.toInt(), (pbatr?.value ?: 0L).toString(), (pbatrmask?.value ?: 0L).toString(), cbatrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardIntroduceReaderA(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupA(hcontext.toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardIntroduceReaderGroupW(hcontext.toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardIntroduceReaderW(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szdevicename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardIsValidContext(hcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListCardsA(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListCardsA(hcontext.toString(), (pbatr?.value ?: 0L).toString(), (rgquidinterfaces?.value ?: 0L).toString(), cguidinterfacecount.toInt(), (mszcards?.value ?: 0L).toString(), (pcchcards?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListCardsW(hcontext: ULong, pbatr: COpaquePointer?, rgquidinterfaces: COpaquePointer?, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListCardsW(hcontext.toString(), (pbatr?.value ?: 0L).toString(), (rgquidinterfaces?.value ?: 0L).toString(), cguidinterfacecount.toInt(), (mszcards?.value ?: 0L).toString(), (pcchcards?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListInterfacesA(hcontext.toString(), (szcard?.value ?: 0L).toString(), (pguidinterfaces?.value ?: 0L).toString(), (pcguidinterfaces?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: COpaquePointer?, pcguidinterfaces: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListInterfacesW(hcontext.toString(), (szcard?.value ?: 0L).toString(), (pguidinterfaces?.value ?: 0L).toString(), (pcguidinterfaces?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListReaderGroupsA(hcontext.toString(), (mszgroups?.value ?: 0L).toString(), (pcchgroups?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListReaderGroupsW(hcontext.toString(), (mszgroups?.value ?: 0L).toString(), (pcchgroups?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListReadersA(hcontext.toString(), (mszgroups?.value ?: 0L).toString(), (mszreaders?.value ?: 0L).toString(), (pcchreaders?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListReadersW(hcontext.toString(), (mszgroups?.value ?: 0L).toString(), (mszreaders?.value ?: 0L).toString(), (pcchreaders?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdA(hcontext.toString(), (szdeviceinstanceid?.value ?: 0L).toString(), (mszreaders?.value ?: 0L).toString(), (pcchreaders?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardListReadersWithDeviceInstanceIdW(hcontext.toString(), (szdeviceinstanceid?.value ?: 0L).toString(), (mszreaders?.value ?: 0L).toString(), (pcchreaders?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardLocateCardsA(hcontext.toString(), (mszcards?.value ?: 0L).toString(), (rgreaderstates?.value ?: 0L).toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardLocateCardsByATRA(hcontext.toString(), (rgatrmasks?.value ?: 0L).toString(), catrs.toInt(), (rgreaderstates?.value ?: 0L).toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: COpaquePointer?, catrs: UInt, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardLocateCardsByATRW(hcontext.toString(), (rgatrmasks?.value ?: 0L).toString(), catrs.toInt(), (rgreaderstates?.value ?: 0L).toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: COpaquePointer?, creaders: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardLocateCardsW(hcontext.toString(), (mszcards?.value ?: 0L).toString(), (rgreaderstates?.value ?: 0L).toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardReadCacheA(hcontext.toString(), (cardidentifier?.value ?: 0L).toString(), freshnesscounter.toInt(), (lookupname?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (datalen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardReadCacheW(hcontext.toString(), (cardidentifier?.value ?: 0L).toString(), freshnesscounter.toInt(), (lookupname?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (datalen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardReconnect(hcard.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), dwinitialization.toInt(), (pdwactiveprotocol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardReleaseContext(hcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReleaseStartedEvent() {
    if (_windowsWin32SecurityCredentialsNapiAddon != null) {
        _windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardReleaseStartedEvent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupA(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardRemoveReaderFromGroupW(hcontext.toString(), (szreadername?.value ?: 0L).toString(), (szgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: COpaquePointer?, cbattrlen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardSetAttrib(hcard.toString(), dwattrid.toInt(), (pbattr?.value ?: 0L).toString(), cbattrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameA(hcontext.toString(), (szcardname?.value ?: 0L).toString(), dwproviderid.toInt(), (szprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardSetCardTypeProviderNameW(hcontext.toString(), (szcardname?.value ?: 0L).toString(), dwproviderid.toInt(), (szprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardState(hcard: ULong, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardState(hcard.toString(), (pdwstate?.value ?: 0L).toString(), (pdwprotocol?.value ?: 0L).toString(), (pbatr?.value ?: 0L).toString(), (pcbatrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardStatusA(hcard.toString(), (mszreadernames?.value ?: 0L).toString(), (pcchreaderlen?.value ?: 0L).toString(), (pdwstate?.value ?: 0L).toString(), (pdwprotocol?.value ?: 0L).toString(), (pbatr?.value ?: 0L).toString(), (pcbatrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: COpaquePointer?, pdwstate: COpaquePointer?, pdwprotocol: COpaquePointer?, pbatr: COpaquePointer?, pcbatrlen: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardStatusW(hcard.toString(), (mszreadernames?.value ?: 0L).toString(), (pcchreaderlen?.value ?: 0L).toString(), (pdwstate?.value ?: 0L).toString(), (pdwprotocol?.value ?: 0L).toString(), (pbatr?.value ?: 0L).toString(), (pcbatrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardTransmit(hcard: ULong, piosendpci: COpaquePointer?, pbsendbuffer: COpaquePointer?, cbsendlength: UInt, piorecvpci: COpaquePointer?, pbrecvbuffer: COpaquePointer?, pcbrecvlength: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardTransmit(hcard.toString(), (piosendpci?.value ?: 0L).toString(), (pbsendbuffer?.value ?: 0L).toString(), cbsendlength.toInt(), (piorecvpci?.value ?: 0L).toString(), (pbrecvbuffer?.value ?: 0L).toString(), (pcbrecvlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardUIDlgSelectCardA(param0: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardUIDlgSelectCardW(param0: COpaquePointer?): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardUIDlgSelectCardW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcstr, data: COpaquePointer?, datalen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardWriteCacheA(hcontext.toString(), (cardidentifier?.value ?: 0L).toString(), freshnesscounter.toInt(), (lookupname?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), datalen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: COpaquePointer?, freshnesscounter: UInt, lookupname: Pcwstr, data: COpaquePointer?, datalen: UInt): Int =
    if (_windowsWin32SecurityCredentialsNapiAddon != null) (_windowsWin32SecurityCredentialsNapiAddon.windowssys_windows_win32_security_credentials_sCardWriteCacheW(hcontext.toString(), (cardidentifier?.value ?: 0L).toString(), freshnesscounter.toInt(), (lookupname?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), datalen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
