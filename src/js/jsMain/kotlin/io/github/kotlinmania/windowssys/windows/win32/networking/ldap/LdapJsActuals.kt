@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private val _windowsWin32NetworkingLdapNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ldapGetLastError(): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetLastError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapMapErrorToWin32(ldaperror.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapUTF8ToUnicode((lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpdeststr?.value ?: 0L).toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapUnicodeToUTF8((lpsrcstr?.value ?: 0L).toString(), cchsrc, (lpdeststr?.value ?: 0L).toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berAllocT(options: Int): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berAllocT(options) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvdup(pberval: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berBvdup((pberval?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvecfree(pberval: COpaquePointer?) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berBvecfree((pberval?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berBvfree(bv: COpaquePointer?) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berBvfree((bv?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berFirstElement(pberelement: COpaquePointer?, plen: COpaquePointer?, ppopaque: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berFirstElement((pberelement?.value ?: 0L).toString(), (plen?.value ?: 0L).toString(), (ppopaque?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFlatten(pberelement: COpaquePointer?, pberval: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berFlatten((pberelement?.value ?: 0L).toString(), (pberval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFree(pberelement: COpaquePointer?, fbuf: Int) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berFree((pberelement?.value ?: 0L).toString(), fbuf)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berInit(pberval: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berInit((pberval?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berNextElement(pberelement: COpaquePointer?, plen: COpaquePointer?, opaque: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berNextElement((pberelement?.value ?: 0L).toString(), (plen?.value ?: 0L).toString(), (opaque?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPeekTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berPeekTag((pberelement?.value ?: 0L).toString(), (plen?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPrintf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berPrintf((pberelement?.value ?: 0L).toString(), (fmt?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berScanf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berScanf((pberelement?.value ?: 0L).toString(), (fmt?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berSkipTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_berSkipTag((pberelement?.value ?: 0L).toString(), (plen?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_cldapOpen((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_cldapOpenA((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_cldapOpenW((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAbandon(ld: COpaquePointer?, msgid: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAbandon((ld?.value ?: 0L).toString(), msgid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAdd(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAdd((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExt(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddExt((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddExtA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddExtW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddExtS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddExtSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddExtSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapAddSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBind(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapBind((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapBindA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapBindW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindS(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapBindS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapBindSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapBindSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterA(ld: COpaquePointer?, searchfilter: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCheckFilterA((ld?.value ?: 0L).toString(), (searchfilter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterW(ld: COpaquePointer?, searchfilter: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCheckFilterW((ld?.value ?: 0L).toString(), (searchfilter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCleanup(hinstance: Handle): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCleanup((hinstance?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCloseExtendedOp(ld: COpaquePointer?, messagenumber: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCloseExtendedOp((ld?.value ?: 0L).toString(), messagenumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompare(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompare((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExt(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareExt((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareExtA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareExtW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareExtS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareExtSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareExtSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCompareSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnFromMsg(primaryconn: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapConnFromMsg((primaryconn?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnect(ld: COpaquePointer?, timeout: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapConnect((ld?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFree(control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapControlFree((control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeA(controls: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapControlFreeA((controls?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeW(control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapControlFreeW((control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFree(controls: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapControlsFree((controls?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeA(controls: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapControlsFreeA((controls?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeW(control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapControlsFreeW((control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountEntries(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCountEntries((ld?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountReferences(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCountReferences((ld?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValues(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCountValues((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesA(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCountValuesA((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesW(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCountValuesW((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesLen(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCountValuesLen((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControl(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreatePageControl((externalhandle?.value ?: 0L).toString(), pagesize.toInt(), (cookie?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlA(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreatePageControlA((externalhandle?.value ?: 0L).toString(), pagesize.toInt(), (cookie?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlW(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreatePageControlW((externalhandle?.value ?: 0L).toString(), pagesize.toInt(), (cookie?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControl(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreateSortControl((externalhandle?.value ?: 0L).toString(), (sortkeys?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreateSortControlA((externalhandle?.value ?: 0L).toString(), (sortkeys?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreateSortControlW((externalhandle?.value ?: 0L).toString(), (sortkeys?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlA(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreateVlvControlA((externalhandle?.value ?: 0L).toString(), (vlvinfo?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlW(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapCreateVlvControlW((externalhandle?.value ?: 0L).toString(), (vlvinfo?.value ?: 0L).toString(), iscritical.toInt(), (control?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDelete(ld: COpaquePointer?, dn: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDelete((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteA(ld: COpaquePointer?, dn: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExt(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteExt((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteExtA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteExtW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtS(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteExtS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteExtSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteExtSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteS(ld: COpaquePointer?, dn: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSA(ld: COpaquePointer?, dn: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDeleteSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDn2ufn((dn?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDn2ufnA((dn?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapDn2ufnW((dn?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapEncodeSortControlA((externalhandle?.value ?: 0L).toString(), (sortkeys?.value ?: 0L).toString(), (control?.value ?: 0L).toString(), criticality) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapEncodeSortControlW((externalhandle?.value ?: 0L).toString(), (sortkeys?.value ?: 0L).toString(), (control?.value ?: 0L).toString(), criticality) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2string(err: UInt): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapErr2string(err.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2stringA(err: UInt): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapErr2stringA(err.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapErr2stringW(err.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElement((sourcefilterelement?.value ?: 0L).toString(), sourcelength.toInt(), (destfilterelement?.value ?: 0L).toString(), destlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementA((sourcefilterelement?.value ?: 0L).toString(), sourcelength.toInt(), (destfilterelement?.value ?: 0L).toString(), destlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementW((sourcefilterelement?.value ?: 0L).toString(), sourcelength.toInt(), (destfilterelement?.value ?: 0L).toString(), destlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExplodeDn((dn?.value ?: 0L).toString(), notypes.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExplodeDnA((dn?.value ?: 0L).toString(), notypes.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExplodeDnW((dn?.value ?: 0L).toString(), notypes.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperation(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExtendedOperation((ld?.value ?: 0L).toString(), (oid?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationA(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExtendedOperationA((ld?.value ?: 0L).toString(), (oid?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationW(ld: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExtendedOperationW((ld?.value ?: 0L).toString(), (oid?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSA(externalhandle: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExtendedOperationSA((externalhandle?.value ?: 0L).toString(), (oid?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (returnedoid?.value ?: 0L).toString(), (returneddata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSW(externalhandle: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapExtendedOperationSW((externalhandle?.value ?: 0L).toString(), (oid?.value ?: 0L).toString(), (data?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (returnedoid?.value ?: 0L).toString(), (returneddata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFirstAttribute((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFirstAttributeA((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFirstAttributeW((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstEntry(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFirstEntry((ld?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstReference(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFirstReference((ld?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControls(controls: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFreeControls((controls?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsA(controls: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFreeControlsA((controls?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsW(controls: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapFreeControlsW((controls?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDn(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetDn((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnA(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetDnA((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnW(ld: COpaquePointer?, entry: COpaquePointer?): Pwstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetDnW((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPage(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetNextPage((externalhandle?.value ?: 0L).toString(), searchhandle.toString(), pagesize.toInt(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPageS(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, timeout: COpaquePointer?, pagesize: UInt, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetNextPageS((externalhandle?.value ?: 0L).toString(), searchhandle.toString(), (timeout?.value ?: 0L).toString(), pagesize.toInt(), (totalcount?.value ?: 0L).toString(), (results?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOption(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetOption((ld?.value ?: 0L).toString(), option, (outvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOptionW(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetOptionW((ld?.value ?: 0L).toString(), option, (outvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetPagedCount(externalhandle: COpaquePointer?, searchblock: PLDAPSearch, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetPagedCount((externalhandle?.value ?: 0L).toString(), searchblock.toString(), (totalcount?.value ?: 0L).toString(), (results?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValues(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetValues((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesA(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetValuesA((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesW(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetValuesW((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLen(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetValuesLen((externalhandle?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenA(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetValuesLenA((externalhandle?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenW(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapGetValuesLenW((externalhandle?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapInit((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapInitA((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapInitW((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMemfree(block: Pcstr) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapMemfree((block?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapMemfreeA(block: Pcstr) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapMemfreeA((block?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapMemfreeW((block?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapModify(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModify((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExt(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyExt((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyExtA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyExtW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyExtS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyExtSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyExtSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifyS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifySA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModifySW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (mods?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdn((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdn2((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2A(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdn2A((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2W(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdn2W((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2S(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdn2S((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdn2SA((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdn2SW((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdnA((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdnW((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnS(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdnS((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdnSA((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapModrdnSW((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), (newdistinguishedname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMsgfree(res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapMsgfree((res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapNextAttribute((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapNextAttributeA((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapNextAttributeW((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextEntry(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapNextEntry((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextReference(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapNextReference((ld?.value ?: 0L).toString(), (entry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapOpen((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapOpenA((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapOpenW((hostname?.value ?: 0L).toString(), portnumber.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseExtendedResultA((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (resultoid?.value ?: 0L).toString(), (resultdata?.value ?: 0L).toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseExtendedResultW((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (resultoid?.value ?: 0L).toString(), (resultdata?.value ?: 0L).toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControl(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParsePageControl((externalhandle?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (totalcount?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlA(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParsePageControlA((externalhandle?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (totalcount?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlW(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParsePageControlW((externalhandle?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (totalcount?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReference(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseReference((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (referrals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceA(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseReferenceA((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (referrals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceW(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseReferenceW((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (referrals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResult(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseResult((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (returncode?.value ?: 0L).toString(), (matcheddns?.value ?: 0L).toString(), (errormessage?.value ?: 0L).toString(), (referrals?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseResultA((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (returncode?.value ?: 0L).toString(), (matcheddns?.value ?: 0L).toString(), (errormessage?.value ?: 0L).toString(), (referrals?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseResultW((connection?.value ?: 0L).toString(), (resultmessage?.value ?: 0L).toString(), (returncode?.value ?: 0L).toString(), (matcheddns?.value ?: 0L).toString(), (errormessage?.value ?: 0L).toString(), (referrals?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControl(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseSortControl((externalhandle?.value ?: 0L).toString(), (control?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), (attribute?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseSortControlA((externalhandle?.value ?: 0L).toString(), (control?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), (attribute?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseSortControlW((externalhandle?.value ?: 0L).toString(), (control?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), (attribute?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseVlvControlA((externalhandle?.value ?: 0L).toString(), (control?.value ?: 0L).toString(), (targetpos?.value ?: 0L).toString(), (listcount?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (errcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapParseVlvControlW((externalhandle?.value ?: 0L).toString(), (control?.value ?: 0L).toString(), (targetpos?.value ?: 0L).toString(), (listcount?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (errcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapPerror(ld: COpaquePointer?, msg: Pcstr) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapPerror((ld?.value ?: 0L).toString(), (msg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapRenameExt(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapRenameExt((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (newrdn?.value ?: 0L).toString(), (newparent?.value ?: 0L).toString(), deleteoldrdn, (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapRenameExtA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (newrdn?.value ?: 0L).toString(), (newparent?.value ?: 0L).toString(), deleteoldrdn, (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapRenameExtW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (newrdn?.value ?: 0L).toString(), (newparent?.value ?: 0L).toString(), deleteoldrdn, (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtS(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapRenameExtS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (newrdn?.value ?: 0L).toString(), (newparent?.value ?: 0L).toString(), deleteoldrdn, (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapRenameExtSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (newrdn?.value ?: 0L).toString(), (newparent?.value ?: 0L).toString(), deleteoldrdn, (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapRenameExtSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (newrdn?.value ?: 0L).toString(), (newparent?.value ?: 0L).toString(), deleteoldrdn, (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult(ld: COpaquePointer?, msgid: UInt, all: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapResult((ld?.value ?: 0L).toString(), msgid.toInt(), all.toInt(), (timeout?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult2error(ld: COpaquePointer?, res: COpaquePointer?, freeit: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapResult2error((ld?.value ?: 0L).toString(), (res?.value ?: 0L).toString(), freeit.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSaslBindA((externalhandle?.value ?: 0L).toString(), (distname?.value ?: 0L).toString(), (authmechanism?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), (serverctrls?.value ?: 0L).toString(), (clientctrls?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSaslBindW((externalhandle?.value ?: 0L).toString(), (distname?.value ?: 0L).toString(), (authmechanism?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), (serverctrls?.value ?: 0L).toString(), (clientctrls?.value ?: 0L).toString(), (messagenumber?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSaslBindSA((externalhandle?.value ?: 0L).toString(), (distname?.value ?: 0L).toString(), (authmechanism?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), (serverctrls?.value ?: 0L).toString(), (clientctrls?.value ?: 0L).toString(), (serverdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSaslBindSW((externalhandle?.value ?: 0L).toString(), (distname?.value ?: 0L).toString(), (authmechanism?.value ?: 0L).toString(), (cred?.value ?: 0L).toString(), (serverctrls?.value ?: 0L).toString(), (clientctrls?.value ?: 0L).toString(), (serverdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearch(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearch((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchA((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchW((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchAbandonPage(externalhandle: COpaquePointer?, searchblock: PLDAPSearch): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchAbandonPage((externalhandle?.value ?: 0L).toString(), searchblock.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchExt((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), timelimit.toInt(), sizelimit.toInt(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchExtA((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), timelimit.toInt(), sizelimit.toInt(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchExtW((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), timelimit.toInt(), sizelimit.toInt(), (messagenumber?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchExtS((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), sizelimit.toInt(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchExtSA((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), sizelimit.toInt(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchExtSW((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), sizelimit.toInt(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPage(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchInitPage((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), scopeofsearch.toInt(), (searchfilter?.value ?: 0L).toString(), (attributelist?.value ?: 0L).toString(), attributesonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), (sortkeys?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchInitPageA((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), scopeofsearch.toInt(), (searchfilter?.value ?: 0L).toString(), (attributelist?.value ?: 0L).toString(), attributesonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), (sortkeys?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchInitPageW((externalhandle?.value ?: 0L).toString(), (distinguishedname?.value ?: 0L).toString(), scopeofsearch.toInt(), (searchfilter?.value ?: 0L).toString(), (attributelist?.value ?: 0L).toString(), attributesonly.toInt(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), (sortkeys?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchS((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchSA((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchSW((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchSt((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (timeout?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchStA((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (timeout?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSearchStW((ld?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), scope.toInt(), (filter?.value ?: 0L).toString(), (attrs?.value ?: 0L).toString(), attrsonly.toInt(), (timeout?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSetDbgFlags(newflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSetDbgRoutine(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapSetOption(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSetOption((ld?.value ?: 0L).toString(), option, (invalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetOptionW(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSetOptionW((ld?.value ?: 0L).toString(), option, (invalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBind(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSimpleBind((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSimpleBindA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSimpleBindW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindS(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSimpleBindS((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSimpleBindSA((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSimpleBindSW((ld?.value ?: 0L).toString(), (dn?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSslinit((hostname?.value ?: 0L).toString(), portnumber.toInt(), secure) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSslinitA((hostname?.value ?: 0L).toString(), portnumber.toInt(), secure) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): COpaquePointer? =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapSslinitW((hostname?.value ?: 0L).toString(), portnumber.toInt(), secure) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSA(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapStartTlsSA((externalhandle?.value ?: 0L).toString(), (serverreturnvalue?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSW(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapStartTlsSW((externalhandle?.value ?: 0L).toString(), (serverreturnvalue?.value ?: 0L).toString(), (result?.value ?: 0L).toString(), (servercontrols?.value ?: 0L).toString(), (clientcontrols?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartup(version: COpaquePointer?, instance: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapStartup((version?.value ?: 0L).toString(), (instance?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStopTlsS(externalhandle: COpaquePointer?): Boolean =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapStopTlsS((externalhandle?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapUfn2dn((ufn?.value ?: 0L).toString(), (pdn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapUfn2dnA((ufn?.value ?: 0L).toString(), (pdn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapUfn2dnW((ufn?.value ?: 0L).toString(), (pdn?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbind(ld: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapUnbind((ld?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbindS(ld: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapUnbindS((ld?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFree(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapValueFree((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeA(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapValueFreeA((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeW(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapValueFreeW((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeLen(vals: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldapValueFreeLen((vals?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
