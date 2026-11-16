@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private val windowsWin32SecurityCredentialsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredDeleteA(targetname.rawAddress.toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredDeleteW(targetname.rawAddress.toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredEnumerateA(filter.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredEnumerateW(filter.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credFree(buffer: ConstPtr) {
    if (windowsWin32SecurityCredentialsNapiAddon != null) {
        windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(maximumpersistcount.toInt(), maximumpersist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(targetname.rawAddress.toString(), flags.toInt(), targetinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(targetname.rawAddress.toString(), flags.toInt(), targetinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(marshaledcredential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(marshaledcredential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredIsProtectedA(pszprotectedcredentials.rawAddress.toString(), pprotectiontype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredIsProtectedW(pszprotectedcredentials.rawAddress.toString(), pprotectiontype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(credtype, credential.rawAddress.toString(), marshaledcredential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(credtype, credential.rawAddress.toString(), marshaledcredential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(dwflags.toInt(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), ppackedcredentials.rawAddress.toString(), pcbpackedcredentials.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(dwflags.toInt(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), ppackedcredentials.rawAddress.toString(), pcbpackedcredentials.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredProtectA(fasself, pszcredentials.rawAddress.toString(), cchcredentials.toInt(), pszprotectedcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString(), protectiontype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredProtectW(fasself, pszcredentials.rawAddress.toString(), cchcredentials.toInt(), pszprotectedcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString(), protectiontype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredReadA(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadDomainCredentialsA(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(targetinfo.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadDomainCredentialsW(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(targetinfo.rawAddress.toString(), flags.toInt(), count.rawAddress.toString(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredReadW(targetname.rawAddress.toString(), type.toInt(), flags.toInt(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredRenameA(oldtargetname.rawAddress.toString(), newtargetname.rawAddress.toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredRenameW(oldtargetname.rawAddress.toString(), newtargetname.rawAddress.toString(), type.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), username.rawAddress.toString(), uluserbuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), username.rawAddress.toString(), uluserbuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(psztargetname.rawAddress.toString(), bconfirm) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(psztargetname.rawAddress.toString(), bconfirm) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(username.rawAddress.toString(), user.rawAddress.toString(), userbuffersize.toInt(), domain.rawAddress.toString(), domainbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(username.rawAddress.toString(), user.rawAddress.toString(), userbuffersize.toInt(), domain.rawAddress.toString(), domainbuffersize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForCredentialsA(puiinfo: ConstPtr, psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(puiinfo.rawAddress.toString(), psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), pszusername.rawAddress.toString(), ulusernamebuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), save.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForCredentialsW(puiinfo: ConstPtr, psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(puiinfo.rawAddress.toString(), psztargetname.rawAddress.toString(), pcontext.rawAddress.toString(), dwautherror.toInt(), pszusername.rawAddress.toString(), ulusernamebuffersize.toInt(), pszpassword.rawAddress.toString(), ulpasswordbuffersize.toInt(), save.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(puiinfo.rawAddress.toString(), dwautherror.toInt(), pulauthpackage.rawAddress.toString(), pvinauthbuffer.rawAddress.toString(), ulinauthbuffersize.toInt(), ppvoutauthbuffer.rawAddress.toString(), puloutauthbuffersize.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(puiinfo.rawAddress.toString(), dwautherror.toInt(), pulauthpackage.rawAddress.toString(), pvinauthbuffer.rawAddress.toString(), ulinauthbuffersize.toInt(), ppvoutauthbuffer.rawAddress.toString(), puloutauthbuffersize.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: MutPtr): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(pszrealm.rawAddress.toString(), ppszusername.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(pszrealm.rawAddress.toString(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), bpersist) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: MutPtr, pszdomainname: Pstr, pcchmaxdomainname: MutPtr, pszpassword: Pstr, pcchmaxpassword: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(dwflags.toInt(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), pszusername.rawAddress.toString(), pcchlmaxusername.rawAddress.toString(), pszdomainname.rawAddress.toString(), pcchmaxdomainname.rawAddress.toString(), pszpassword.rawAddress.toString(), pcchmaxpassword.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: MutPtr, pszdomainname: Pwstr, pcchmaxdomainname: MutPtr, pszpassword: Pwstr, pcchmaxpassword: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(dwflags.toInt(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), pszusername.rawAddress.toString(), pcchmaxusername.rawAddress.toString(), pszdomainname.rawAddress.toString(), pcchmaxdomainname.rawAddress.toString(), pszpassword.rawAddress.toString(), pcchmaxpassword.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: MutPtr, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(marshaledcredential.rawAddress.toString(), credtype.rawAddress.toString(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: MutPtr, credential: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(marshaledcredential.rawAddress.toString(), credtype.rawAddress.toString(), credential.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUnprotectA(fasself, pszprotectedcredentials.rawAddress.toString(), cchprotectedcredentials.toInt(), pszcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: MutPtr): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredUnprotectW(fasself, pszprotectedcredentials.rawAddress.toString(), cchprotectedcredentials.toInt(), pszcredentials.rawAddress.toString(), pcchmaxchars.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteA(credential: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredWriteA(credential.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteDomainCredentialsA(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(targetinfo.rawAddress.toString(), credential.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteDomainCredentialsW(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(targetinfo.rawAddress.toString(), credential.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credWriteW(credential: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsCredWriteW(credential.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenCardNameA(param0: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenCardNameW(param0: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: ConstPtr) {
    if (windowsWin32SecurityCredentialsNapiAddon != null) {
        windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(keycredentialmanagerinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: MutPtr): Hresult =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(keycredentialmanagerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: MutPtr, keycredentialmanageroperationerrorstates: MutPtr): Hresult =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready.rawAddress.toString(), keycredentialmanageroperationerrorstates.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(hwndowner.rawAddress.toString(), keycredentialmanageroperationtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAccessStartedEvent(): Handle =
    if (windowsWin32SecurityCredentialsNapiAddon != null) MutPtr((windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardAudit(hcontext.toString(), dwevent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(hcard.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardCancel(hcontext: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardCancel(hcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardConnectA(hcontext.toString(), szreader.rawAddress.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.rawAddress.toString(), pdwactiveprotocol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardConnectW(hcontext.toString(), szreader.rawAddress.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.rawAddress.toString(), pdwactiveprotocol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardControl(hcard.toString(), dwcontrolcode.toInt(), lpinbuffer.rawAddress.toString(), cbinbuffersize.toInt(), lpoutbuffer.rawAddress.toString(), cboutbuffersize.toInt(), lpbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardDisconnect(hcard.toString(), dwdisposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardDlgExtendedError(): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardEndTransaction(hcard.toString(), dwdisposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: ConstPtr, pvreserved2: ConstPtr, phcontext: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardEstablishContext(dwscope.toInt(), pvreserved1.rawAddress.toString(), pvreserved2.rawAddress.toString(), phcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(hcontext.toString(), szcardname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(hcontext.toString(), szcardname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(hcontext.toString(), szreadername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(hcontext.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(hcontext.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(hcontext.toString(), szreadername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: ConstPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardFreeMemory(hcontext.toString(), pvmem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: MutPtr, pcbattrlen: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetAttrib(hcard.toString(), dwattrid.toInt(), pbattr.rawAddress.toString(), pcbattrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString(), pcchprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString(), pcchprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(hcontext.toString(), szreadername.rawAddress.toString(), pdwdevicetypeid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(hcontext.toString(), szreadername.rawAddress.toString(), pdwdevicetypeid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(hcontext.toString(), szcard.rawAddress.toString(), pguidproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(hcontext.toString(), szcard.rawAddress.toString(), pguidproviderid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(hcontext.toString(), szreadername.rawAddress.toString(), szdeviceinstanceid.rawAddress.toString(), pcchdeviceinstanceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(hcontext.toString(), szreadername.rawAddress.toString(), szdeviceinstanceid.rawAddress.toString(), pcchdeviceinstanceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: MutPtr, pcbicon: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(hcontext.toString(), szreadername.rawAddress.toString(), pbicon.rawAddress.toString(), pcbicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: MutPtr, pcbicon: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(hcontext.toString(), szreadername.rawAddress.toString(), pbicon.rawAddress.toString(), pcbicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(hcontext.toString(), dwtimeout.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(hcontext.toString(), dwtimeout.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(hcard.toString(), pctransmitcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(hcontext.toString(), szcardname.rawAddress.toString(), pguidprimaryprovider.rawAddress.toString(), rgguidinterfaces.rawAddress.toString(), dwinterfacecount.toInt(), pbatr.rawAddress.toString(), pbatrmask.rawAddress.toString(), cbatrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(hcontext.toString(), szcardname.rawAddress.toString(), pguidprimaryprovider.rawAddress.toString(), rgguidinterfaces.rawAddress.toString(), dwinterfacecount.toInt(), pbatr.rawAddress.toString(), pbatrmask.rawAddress.toString(), cbatrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(hcontext.toString(), szreadername.rawAddress.toString(), szdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(hcontext.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(hcontext.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(hcontext.toString(), szreadername.rawAddress.toString(), szdevicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardIsValidContext(hcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListCardsA(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListCardsA(hcontext.toString(), pbatr.rawAddress.toString(), rgquidinterfaces.rawAddress.toString(), cguidinterfacecount.toInt(), mszcards.rawAddress.toString(), pcchcards.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListCardsW(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListCardsW(hcontext.toString(), pbatr.rawAddress.toString(), rgquidinterfaces.rawAddress.toString(), cguidinterfacecount.toInt(), mszcards.rawAddress.toString(), pcchcards.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(hcontext.toString(), szcard.rawAddress.toString(), pguidinterfaces.rawAddress.toString(), pcguidinterfaces.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(hcontext.toString(), szcard.rawAddress.toString(), pguidinterfaces.rawAddress.toString(), pcguidinterfaces.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(hcontext.toString(), mszgroups.rawAddress.toString(), pcchgroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(hcontext.toString(), mszgroups.rawAddress.toString(), pcchgroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListReadersA(hcontext.toString(), mszgroups.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListReadersW(hcontext.toString(), mszgroups.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(hcontext.toString(), szdeviceinstanceid.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(hcontext.toString(), szdeviceinstanceid.rawAddress.toString(), mszreaders.rawAddress.toString(), pcchreaders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: MutPtr, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(hcontext.toString(), mszcards.rawAddress.toString(), rgreaderstates.rawAddress.toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(hcontext.toString(), rgatrmasks.rawAddress.toString(), catrs.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(hcontext.toString(), rgatrmasks.rawAddress.toString(), catrs.toInt(), rgreaderstates.rawAddress.toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: MutPtr, creaders: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(hcontext.toString(), mszcards.rawAddress.toString(), rgreaderstates.rawAddress.toString(), creaders.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: MutPtr, datalen: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardReadCacheA(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: MutPtr, datalen: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardReadCacheW(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardReconnect(hcard.toString(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), dwinitialization.toInt(), pdwactiveprotocol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardReleaseContext(hcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardReleaseStartedEvent() {
    if (windowsWin32SecurityCredentialsNapiAddon != null) {
        windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(hcontext.toString(), szreadername.rawAddress.toString(), szgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: ConstPtr, cbattrlen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardSetAttrib(hcard.toString(), dwattrid.toInt(), pbattr.rawAddress.toString(), cbattrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(hcontext.toString(), szcardname.rawAddress.toString(), dwproviderid.toInt(), szprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardState(hcard: ULong, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardState(hcard.toString(), pdwstate.rawAddress.toString(), pdwprotocol.rawAddress.toString(), pbatr.rawAddress.toString(), pcbatrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardStatusA(hcard.toString(), mszreadernames.rawAddress.toString(), pcchreaderlen.rawAddress.toString(), pdwstate.rawAddress.toString(), pdwprotocol.rawAddress.toString(), pbatr.rawAddress.toString(), pcbatrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardStatusW(hcard.toString(), mszreadernames.rawAddress.toString(), pcchreaderlen.rawAddress.toString(), pdwstate.rawAddress.toString(), pdwprotocol.rawAddress.toString(), pbatr.rawAddress.toString(), pcbatrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardTransmit(hcard: ULong, piosendpci: ConstPtr, pbsendbuffer: ConstPtr, cbsendlength: UInt, piorecvpci: MutPtr, pbrecvbuffer: MutPtr, pcbrecvlength: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardTransmit(hcard.toString(), piosendpci.rawAddress.toString(), pbsendbuffer.rawAddress.toString(), cbsendlength.toInt(), piorecvpci.rawAddress.toString(), pbrecvbuffer.rawAddress.toString(), pcbrecvlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardUIDlgSelectCardA(param0: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardUIDlgSelectCardW(param0: MutPtr): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: ConstPtr, datalen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: ConstPtr, datalen: UInt): Int =
    if (windowsWin32SecurityCredentialsNapiAddon != null) (windowsWin32SecurityCredentialsNapiAddon.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(hcontext.toString(), cardidentifier.rawAddress.toString(), freshnesscounter.toInt(), lookupname.rawAddress.toString(), data.rawAddress.toString(), datalen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
