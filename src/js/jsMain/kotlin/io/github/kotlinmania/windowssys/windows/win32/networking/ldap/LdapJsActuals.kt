@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private val windowsWin32NetworkingLdapNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ldapGetLastError(): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetLastError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(ldaperror.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(lpsrcstr.rawAddress.toString(), cchsrc, lpdeststr.rawAddress.toString(), cchdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berAllocT(options: Int): MutPtr<BerElement> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerAllocT(options) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvdup(pberval: MutPtr<LdapBerval>): MutPtr<LdapBerval> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerBvdup(pberval.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvecfree(pberval: MutPtr<MutPtr<LdapBerval>>) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerBvecfree(pberval.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berBvfree(bv: MutPtr<LdapBerval>) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerBvfree(bv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berFirstElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, ppopaque: MutPtr<MutPtr<Byte>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerFirstElement(pberelement.rawAddress.toString(), plen.rawAddress.toString(), ppopaque.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFlatten(pberelement: MutPtr<BerElement>, pberval: MutPtr<MutPtr<LdapBerval>>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerFlatten(pberelement.rawAddress.toString(), pberval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFree(pberelement: MutPtr<BerElement>, fbuf: Int) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerFree(pberelement.rawAddress.toString(), fbuf)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berInit(pberval: MutPtr<LdapBerval>): MutPtr<BerElement> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerInit(pberval.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berNextElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, opaque: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerNextElement(pberelement.rawAddress.toString(), plen.rawAddress.toString(), opaque.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPeekTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerPeekTag(pberelement.rawAddress.toString(), plen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPrintf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerPrintf(pberelement.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berScanf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerScanf(pberelement.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berSkipTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerSkipTag(pberelement.rawAddress.toString(), plen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapCldapOpen(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapCldapOpenA(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapCldapOpenW(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAbandon(ld: MutPtr<Ldap>, msgid: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAbandon(ld.rawAddress.toString(), msgid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAdd(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAdd(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExt(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExt(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddS(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBind(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBind(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindA(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindW(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindS(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindS(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindSA(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindSW(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterA(ld: MutPtr<Ldap>, searchfilter: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCheckFilterA(ld.rawAddress.toString(), searchfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterW(ld: MutPtr<Ldap>, searchfilter: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCheckFilterW(ld.rawAddress.toString(), searchfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCleanup(hinstance: Handle): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCleanup(hinstance.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCloseExtendedOp(ld: MutPtr<Ldap>, messagenumber: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(ld.rawAddress.toString(), messagenumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompare(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompare(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExt(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExt(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareS(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnFromMsg(primaryconn: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapConnFromMsg(primaryconn.rawAddress.toString(), res.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnect(ld: MutPtr<Ldap>, timeout: MutPtr<LdapTimeval>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapConnect(ld.rawAddress.toString(), timeout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFree(control: MutPtr<LDAPControlA>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlFree(control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeA(controls: MutPtr<LDAPControlA>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlFreeA(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeW(control: MutPtr<LDAPControlW>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlFreeW(control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFree(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlsFree(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlsFreeA(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeW(control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlsFreeW(control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountEntries(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountEntries(ld.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountReferences(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountReferences(ld.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValues(vals: ConstPtr<Pcstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValues(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesA(vals: ConstPtr<Pcstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValuesA(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesW(vals: ConstPtr<Pcwstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValuesW(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValuesLen(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControl(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreatePageControl(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlA(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlW(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControl(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateSortControl(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlA(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(externalhandle.rawAddress.toString(), vlvinfo.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlW(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(externalhandle.rawAddress.toString(), vlvinfo.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDelete(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDelete(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteA(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteA(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteW(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExt(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExt(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtS(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteS(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteS(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSA(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteSA(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteSW(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDn2ufn(dn.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDn2ufnA(dn.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDn2ufnW(dn.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, control: MutPtr<LDAPControlA>, criticality: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), control.rawAddress.toString(), criticality) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, control: MutPtr<LDAPControlW>, criticality: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), control.rawAddress.toString(), criticality) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2string(err: UInt): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapErr2string(err.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2stringA(err: UInt): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapErr2stringA(err.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapErr2stringW(err.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(sourcefilterelement.rawAddress.toString(), sourcelength.toInt(), destfilterelement.rawAddress.toString(), destlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(sourcefilterelement.rawAddress.toString(), sourcelength.toInt(), destfilterelement.rawAddress.toString(), destlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(sourcefilterelement.rawAddress.toString(), sourcelength.toInt(), destfilterelement.rawAddress.toString(), destlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr<Pstr> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExplodeDn(dn.rawAddress.toString(), notypes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr<Pstr> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExplodeDnA(dn.rawAddress.toString(), notypes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr<Pwstr> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExplodeDnW(dn.rawAddress.toString(), notypes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperation(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperation(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationA(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationW(ld: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSA(externalhandle: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, returnedoid: MutPtr<Pstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(externalhandle.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), returnedoid.rawAddress.toString(), returneddata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSW(externalhandle: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, returnedoid: MutPtr<Pwstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(externalhandle.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), returnedoid.rawAddress.toString(), returneddata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstAttribute(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstEntry(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstEntry(ld.rawAddress.toString(), res.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstReference(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstReference(ld.rawAddress.toString(), res.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControls(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFreeControls(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFreeControlsA(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsW(controls: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFreeControlsW(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDn(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetDn(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetDnA(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetDnW(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPage(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetNextPage(externalhandle.rawAddress.toString(), searchhandle.toString(), pagesize.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPageS(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, timeout: MutPtr<LdapTimeval>, pagesize: UInt, totalcount: MutPtr<UInt>, results: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetNextPageS(externalhandle.rawAddress.toString(), searchhandle.toString(), timeout.rawAddress.toString(), pagesize.toInt(), totalcount.rawAddress.toString(), results.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOption(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetOption(ld.rawAddress.toString(), option, outvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOptionW(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetOptionW(ld.rawAddress.toString(), option, outvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetPagedCount(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch, totalcount: MutPtr<UInt>, results: MutPtr<LDAPMessage>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetPagedCount(externalhandle.rawAddress.toString(), searchblock.toString(), totalcount.rawAddress.toString(), results.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValues(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValues(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesA(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<Pwstr> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesW(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLen(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesLen(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenA(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenW(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<MutPtr<LdapBerval>> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapInit(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapInitA(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapInitW(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMemfree(block: Pcstr) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapMemfree(block.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapMemfreeA(block: Pcstr) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapMemfreeA(block.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapMemfreeW(block.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapModify(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModify(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExt(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExt(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyS(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifySA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifySW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2A(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2A(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2W(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2W(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2S(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2S(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2SA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2SW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnS(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnS(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnSA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnSW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMsgfree(res: MutPtr<LDAPMessage>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapMsgfree(res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextAttribute(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextAttributeA(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextAttributeW(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextEntry(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextEntry(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextReference(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextReference(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapOpen(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapOpenA(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapOpenW(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), resultoid.rawAddress.toString(), resultdata.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pwstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), resultoid.rawAddress.toString(), resultdata.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControl(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParsePageControl(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlA(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParsePageControlA(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlW(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParsePageControlW(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReference(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseReference(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseReferenceA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseReferenceW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResult(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<Pstr>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseResult(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<MutPtr<Byte>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseResultA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pwstr>, errormessage: MutPtr<Pwstr>, referrals: MutPtr<MutPtr<MutPtr<UShort>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlW>>>, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseResultW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControl(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseSortControl(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseSortControlA(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, result: MutPtr<UInt>, attribute: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseSortControlW(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(externalhandle.rawAddress.toString(), control.rawAddress.toString(), targetpos.rawAddress.toString(), listcount.rawAddress.toString(), context.rawAddress.toString(), errcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(externalhandle.rawAddress.toString(), control.rawAddress.toString(), targetpos.rawAddress.toString(), listcount.rawAddress.toString(), context.rawAddress.toString(), errcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapPerror(ld: MutPtr<Ldap>, msg: Pcstr) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapPerror(ld.rawAddress.toString(), msg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapRenameExt(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExt(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtS(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult(ld: MutPtr<Ldap>, msgid: UInt, all: UInt, timeout: ConstPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapResult(ld.rawAddress.toString(), msgid.toInt(), all.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult2error(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>, freeit: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapResult2error(ld.rawAddress.toString(), res.rawAddress.toString(), freeit.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<Int>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindA(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<Int>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindW(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindSA(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), serverdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindSW(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), serverdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearch(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearch(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchAbandonPage(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(externalhandle.rawAddress.toString(), searchblock.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExt(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtS(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtSA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtSW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPage(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr<MutPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchInitPage(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr<ConstPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr<ConstPtr<UShort>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchS(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchSA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchSW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchSt(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchStA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchStW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapSetOption(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSetOption(ld.rawAddress.toString(), option, invalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetOptionW(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSetOptionW(ld.rawAddress.toString(), option, invalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBind(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBind(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindA(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindW(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindS(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindS(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSslinit(hostname.rawAddress.toString(), portnumber.toInt(), secure) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSslinitA(hostname.rawAddress.toString(), portnumber.toInt(), secure) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSslinitW(hostname.rawAddress.toString(), portnumber.toInt(), secure) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSA(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStartTlsSA(externalhandle.rawAddress.toString(), serverreturnvalue.rawAddress.toString(), result.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSW(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStartTlsSW(externalhandle.rawAddress.toString(), serverreturnvalue.rawAddress.toString(), result.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartup(version: MutPtr<LdapVersionInfo>, instance: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStartup(version.rawAddress.toString(), instance.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStopTlsS(externalhandle: MutPtr<Ldap>): Boolean =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStopTlsS(externalhandle.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUfn2dn(ufn.rawAddress.toString(), pdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUfn2dnA(ufn.rawAddress.toString(), pdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUfn2dnW(ufn.rawAddress.toString(), pdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbind(ld: MutPtr<Ldap>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUnbind(ld.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbindS(ld: MutPtr<Ldap>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUnbindS(ld.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFree(vals: ConstPtr<Pcstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFree(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeA(vals: ConstPtr<Pcstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFreeA(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeW(vals: ConstPtr<Pcwstr>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFreeW(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFreeLen(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
