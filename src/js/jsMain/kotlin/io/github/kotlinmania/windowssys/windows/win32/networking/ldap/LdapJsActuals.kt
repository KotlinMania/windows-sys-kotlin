@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

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

public actual fun berAllocT(options: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerAllocT(options) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvdup(pberval: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerBvdup(pberval.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berBvecfree(pberval: MutPtr) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerBvecfree(pberval.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berBvfree(bv: MutPtr) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerBvfree(bv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berFirstElement(pberelement: MutPtr, plen: MutPtr, ppopaque: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerFirstElement(pberelement.rawAddress.toString(), plen.rawAddress.toString(), ppopaque.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFlatten(pberelement: MutPtr, pberval: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerFlatten(pberelement.rawAddress.toString(), pberval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berFree(pberelement: MutPtr, fbuf: Int) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerFree(pberelement.rawAddress.toString(), fbuf)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun berInit(pberval: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerInit(pberval.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berNextElement(pberelement: MutPtr, plen: MutPtr, opaque: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerNextElement(pberelement.rawAddress.toString(), plen.rawAddress.toString(), opaque.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPeekTag(pberelement: MutPtr, plen: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerPeekTag(pberelement.rawAddress.toString(), plen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berPrintf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerPrintf(pberelement.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berScanf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerScanf(pberelement.rawAddress.toString(), fmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun berSkipTag(pberelement: MutPtr, plen: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapBerSkipTag(pberelement.rawAddress.toString(), plen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapCldapOpen(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapCldapOpenA(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapCldapOpenW(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAbandon(ld: MutPtr, msgid: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAbandon(ld.rawAddress.toString(), msgid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAdd(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAdd(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExt(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExt(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtS(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddExtSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddS(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddS(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapAddSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapAddSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attrs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBind(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBind(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindA(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindW(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindS(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindS(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindSA(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapBindSW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapBindSW(ld.rawAddress.toString(), dn.rawAddress.toString(), cred.rawAddress.toString(), method.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterA(ld: MutPtr, searchfilter: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCheckFilterA(ld.rawAddress.toString(), searchfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCheckFilterW(ld: MutPtr, searchfilter: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCheckFilterW(ld.rawAddress.toString(), searchfilter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCleanup(hinstance: Handle): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCleanup(hinstance.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCloseExtendedOp(ld: MutPtr, messagenumber: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(ld.rawAddress.toString(), messagenumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompare(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompare(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExt(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExt(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareExtSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareS(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareSA(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCompareSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCompareSW(ld.rawAddress.toString(), dn.rawAddress.toString(), attr.rawAddress.toString(), value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnFromMsg(primaryconn: MutPtr, res: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapConnFromMsg(primaryconn.rawAddress.toString(), res.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapConnect(ld: MutPtr, timeout: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapConnect(ld.rawAddress.toString(), timeout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFree(control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlFree(control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeA(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlFreeA(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlFreeW(control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlFreeW(control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFree(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlsFree(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeA(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlsFreeA(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapControlsFreeW(control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapControlsFreeW(control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountEntries(ld: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountEntries(ld.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountReferences(ld: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountReferences(ld.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValues(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValues(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesA(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValuesA(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesW(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValuesW(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCountValuesLen(vals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCountValuesLen(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControl(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreatePageControl(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlA(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreatePageControlW(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(externalhandle.rawAddress.toString(), pagesize.toInt(), cookie.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControl(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateSortControl(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlA(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(externalhandle.rawAddress.toString(), vlvinfo.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapCreateVlvControlW(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(externalhandle.rawAddress.toString(), vlvinfo.rawAddress.toString(), iscritical.toInt(), control.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDelete(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDelete(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteA(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteA(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteW(ld: MutPtr, dn: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteW(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExt(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExt(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtS(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteExtSW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteS(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteS(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSA(ld: MutPtr, dn: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteSA(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDeleteSW(ld: MutPtr, dn: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDeleteSW(ld.rawAddress.toString(), dn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDn2ufn(dn.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDn2ufnA(dn.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapDn2ufnW(dn.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(externalhandle.rawAddress.toString(), sortkeys.rawAddress.toString(), control.rawAddress.toString(), criticality) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapEncodeSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
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

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExplodeDn(dn.rawAddress.toString(), notypes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExplodeDnA(dn.rawAddress.toString(), notypes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExplodeDnW(dn.rawAddress.toString(), notypes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperation(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperation(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationA(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationW(ld: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(ld.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSA(externalhandle: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(externalhandle.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), returnedoid.rawAddress.toString(), returneddata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapExtendedOperationSW(externalhandle: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(externalhandle.rawAddress.toString(), oid.rawAddress.toString(), data.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), returnedoid.rawAddress.toString(), returneddata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstAttribute(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstEntry(ld: MutPtr, res: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstEntry(ld.rawAddress.toString(), res.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFirstReference(ld: MutPtr, res: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFirstReference(ld.rawAddress.toString(), res.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControls(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFreeControls(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsA(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFreeControlsA(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapFreeControlsW(controls: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapFreeControlsW(controls.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDn(ld: MutPtr, entry: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetDn(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnA(ld: MutPtr, entry: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetDnA(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetDnW(ld: MutPtr, entry: MutPtr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetDnW(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPage(externalhandle: MutPtr, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetNextPage(externalhandle.rawAddress.toString(), searchhandle.toString(), pagesize.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetNextPageS(externalhandle: MutPtr, searchhandle: PLDAPSearch, timeout: MutPtr, pagesize: UInt, totalcount: MutPtr, results: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetNextPageS(externalhandle.rawAddress.toString(), searchhandle.toString(), timeout.rawAddress.toString(), pagesize.toInt(), totalcount.rawAddress.toString(), results.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOption(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetOption(ld.rawAddress.toString(), option, outvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetOptionW(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetOptionW(ld.rawAddress.toString(), option, outvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetPagedCount(externalhandle: MutPtr, searchblock: PLDAPSearch, totalcount: MutPtr, results: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetPagedCount(externalhandle.rawAddress.toString(), searchblock.toString(), totalcount.rawAddress.toString(), results.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValues(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValues(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesA(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesA(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesW(ld: MutPtr, entry: MutPtr, attr: Pcwstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesW(ld.rawAddress.toString(), entry.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLen(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesLen(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenA(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapGetValuesLenW(externalhandle: MutPtr, message: MutPtr, attr: Pcwstr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(externalhandle.rawAddress.toString(), message.rawAddress.toString(), attr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapInit(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapInitA(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr =
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

public actual fun ldapModify(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModify(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExt(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExt(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtS(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyExtSW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifyS(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifyS(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifySA(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModifySW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModifySW(ld.rawAddress.toString(), dn.rawAddress.toString(), mods.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2A(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2A(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2W(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2W(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2S(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2S(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2SA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdn2SW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdn2SW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString(), deleteoldrdn) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnS(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnS(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnSA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapModrdnSW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapModrdnSW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), newdistinguishedname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapMsgfree(res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapMsgfree(res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextAttribute(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextAttributeA(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextAttributeW(ld.rawAddress.toString(), entry.rawAddress.toString(), ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextEntry(ld: MutPtr, entry: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextEntry(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapNextReference(ld: MutPtr, entry: MutPtr): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapNextReference(ld.rawAddress.toString(), entry.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapOpen(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapOpenA(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapOpenW(hostname.rawAddress.toString(), portnumber.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultA(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), resultoid.rawAddress.toString(), resultdata.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseExtendedResultW(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), resultoid.rawAddress.toString(), resultdata.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControl(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParsePageControl(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlA(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParsePageControlA(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParsePageControlW(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParsePageControlW(externalhandle.rawAddress.toString(), servercontrols.rawAddress.toString(), totalcount.rawAddress.toString(), cookie.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReference(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseReference(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceA(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseReferenceA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseReferenceW(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseReferenceW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), referrals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResult(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseResult(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultA(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseResultA(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseResultW(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseResultW(connection.rawAddress.toString(), resultmessage.rawAddress.toString(), returncode.rawAddress.toString(), matcheddns.rawAddress.toString(), errormessage.rawAddress.toString(), referrals.rawAddress.toString(), servercontrols.rawAddress.toString(), freeit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControl(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseSortControl(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlA(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseSortControlA(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseSortControlW(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseSortControlW(externalhandle.rawAddress.toString(), control.rawAddress.toString(), result.rawAddress.toString(), attribute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlA(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(externalhandle.rawAddress.toString(), control.rawAddress.toString(), targetpos.rawAddress.toString(), listcount.rawAddress.toString(), context.rawAddress.toString(), errcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapParseVlvControlW(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(externalhandle.rawAddress.toString(), control.rawAddress.toString(), targetpos.rawAddress.toString(), listcount.rawAddress.toString(), context.rawAddress.toString(), errcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapPerror(ld: MutPtr, msg: Pcstr) {
    if (windowsWin32NetworkingLdapNapiAddon != null) {
        windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapPerror(ld.rawAddress.toString(), msg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ldapRenameExt(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExt(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtA(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtW(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtS(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtS(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtSA(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapRenameExtSW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapRenameExtSW(ld.rawAddress.toString(), dn.rawAddress.toString(), newrdn.rawAddress.toString(), newparent.rawAddress.toString(), deleteoldrdn, servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult(ld: MutPtr, msgid: UInt, all: UInt, timeout: ConstPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapResult(ld.rawAddress.toString(), msgid.toInt(), all.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapResult2error(ld: MutPtr, res: MutPtr, freeit: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapResult2error(ld.rawAddress.toString(), res.rawAddress.toString(), freeit.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindA(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindW(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), messagenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindSA(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), serverdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSaslBindSW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSaslBindSW(externalhandle.rawAddress.toString(), distname.rawAddress.toString(), authmechanism.rawAddress.toString(), cred.rawAddress.toString(), serverctrls.rawAddress.toString(), clientctrls.rawAddress.toString(), serverdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearch(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearch(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchAbandonPage(externalhandle: MutPtr, searchblock: PLDAPSearch): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(externalhandle.rawAddress.toString(), searchblock.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExt(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtS(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtSA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchExtSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchExtSW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), timeout.rawAddress.toString(), sizelimit.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPage(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchInitPage(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageA(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchInitPageW(externalhandle: MutPtr, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(externalhandle.rawAddress.toString(), distinguishedname.rawAddress.toString(), scopeofsearch.toInt(), searchfilter.rawAddress.toString(), attributelist.rawAddress.toString(), attributesonly.toInt(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchS(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchSA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchSW(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchSt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchSt(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSearchStA(ld.rawAddress.toString(), base.rawAddress.toString(), scope.toInt(), filter.rawAddress.toString(), attrs.rawAddress.toString(), attrsonly.toInt(), timeout.rawAddress.toString(), res.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSearchStW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
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

public actual fun ldapSetOption(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSetOption(ld.rawAddress.toString(), option, invalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSetOptionW(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSetOptionW(ld.rawAddress.toString(), option, invalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBind(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBind(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindA(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindW(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindS(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindS(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSimpleBindSW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(ld.rawAddress.toString(), dn.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSslinit(hostname.rawAddress.toString(), portnumber.toInt(), secure) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSslinitA(hostname.rawAddress.toString(), portnumber.toInt(), secure) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr =
    if (windowsWin32NetworkingLdapNapiAddon != null) MutPtr((windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapSslinitW(hostname.rawAddress.toString(), portnumber.toInt(), secure) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSA(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStartTlsSA(externalhandle.rawAddress.toString(), serverreturnvalue.rawAddress.toString(), result.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartTlsSW(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStartTlsSW(externalhandle.rawAddress.toString(), serverreturnvalue.rawAddress.toString(), result.rawAddress.toString(), servercontrols.rawAddress.toString(), clientcontrols.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStartup(version: MutPtr, instance: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStartup(version.rawAddress.toString(), instance.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapStopTlsS(externalhandle: MutPtr): Boolean =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapStopTlsS(externalhandle.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUfn2dn(ufn.rawAddress.toString(), pdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUfn2dnA(ufn.rawAddress.toString(), pdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUfn2dnW(ufn.rawAddress.toString(), pdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbind(ld: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUnbind(ld.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapUnbindS(ld: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapUnbindS(ld.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFree(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFree(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeA(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFreeA(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeW(vals: ConstPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFreeW(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldapValueFreeLen(vals: MutPtr): UInt =
    if (windowsWin32NetworkingLdapNapiAddon != null) (windowsWin32NetworkingLdapNapiAddon.windowssysWindowsWin32NetworkingLdapLdapValueFreeLen(vals.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
