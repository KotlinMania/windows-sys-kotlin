@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingLdapLdapGetLastError")
private external fun wasiWindowssysWindowsWin32NetworkingLdapLdapGetLastError(): Int

public actual fun ldapGetLastError(): UInt =
    wasiWindowssysWindowsWin32NetworkingLdapLdapGetLastError().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32")
private external fun wasiWindowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(ldaperror: Int): Int

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    wasiWindowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(ldaperror.toInt()).toUInt()

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode")

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8")

public actual fun berAllocT(options: Int): MutPtr<BerElement> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerAllocT")

public actual fun berBvdup(pberval: MutPtr<LdapBerval>): MutPtr<LdapBerval> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerBvdup")

public actual fun berBvecfree(pberval: MutPtr<MutPtr<LdapBerval>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerBvecfree")

public actual fun berBvfree(bv: MutPtr<LdapBerval>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerBvfree")

public actual fun berFirstElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, ppopaque: MutPtr<MutPtr<Byte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerFirstElement")

public actual fun berFlatten(pberelement: MutPtr<BerElement>, pberval: MutPtr<MutPtr<LdapBerval>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerFlatten")

public actual fun berFree(pberelement: MutPtr<BerElement>, fbuf: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerFree")

public actual fun berInit(pberval: MutPtr<LdapBerval>): MutPtr<BerElement> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerInit")

public actual fun berNextElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, opaque: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerNextElement")

public actual fun berPeekTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerPeekTag")

public actual fun berPrintf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerPrintf")

public actual fun berScanf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerScanf")

public actual fun berSkipTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerSkipTag")

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapCldapOpen")

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapCldapOpenA")

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapCldapOpenW")

public actual fun ldapAbandon(ld: MutPtr<Ldap>, msgid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAbandon")

public actual fun ldapAdd(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAdd")

public actual fun ldapAddA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddA")

public actual fun ldapAddW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddW")

public actual fun ldapAddExt(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExt")

public actual fun ldapAddExtA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtA")

public actual fun ldapAddExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtW")

public actual fun ldapAddExtS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtS")

public actual fun ldapAddExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtSA")

public actual fun ldapAddExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtSW")

public actual fun ldapAddS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddS")

public actual fun ldapAddSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddSA")

public actual fun ldapAddSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddSW")

public actual fun ldapBind(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBind")

public actual fun ldapBindA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindA")

public actual fun ldapBindW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindW")

public actual fun ldapBindS(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindS")

public actual fun ldapBindSA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindSA")

public actual fun ldapBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindSW")

public actual fun ldapCheckFilterA(ld: MutPtr<Ldap>, searchfilter: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCheckFilterA")

public actual fun ldapCheckFilterW(ld: MutPtr<Ldap>, searchfilter: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCheckFilterW")

public actual fun ldapCleanup(hinstance: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCleanup")

public actual fun ldapCloseExtendedOp(ld: MutPtr<Ldap>, messagenumber: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp")

public actual fun ldapCompare(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompare")

public actual fun ldapCompareA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareA")

public actual fun ldapCompareW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareW")

public actual fun ldapCompareExt(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExt")

public actual fun ldapCompareExtA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtA")

public actual fun ldapCompareExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtW")

public actual fun ldapCompareExtS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtS")

public actual fun ldapCompareExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtSA")

public actual fun ldapCompareExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtSW")

public actual fun ldapCompareS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareS")

public actual fun ldapCompareSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareSA")

public actual fun ldapCompareSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareSW")

public actual fun ldapConnFromMsg(primaryconn: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapConnFromMsg")

public actual fun ldapConnect(ld: MutPtr<Ldap>, timeout: MutPtr<LdapTimeval>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapConnect")

public actual fun ldapControlFree(control: MutPtr<LDAPControlA>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlFree")

public actual fun ldapControlFreeA(controls: MutPtr<LDAPControlA>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlFreeA")

public actual fun ldapControlFreeW(control: MutPtr<LDAPControlW>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlFreeW")

public actual fun ldapControlsFree(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlsFree")

public actual fun ldapControlsFreeA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlsFreeA")

public actual fun ldapControlsFreeW(control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlsFreeW")

public actual fun ldapCountEntries(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountEntries")

public actual fun ldapCountReferences(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountReferences")

public actual fun ldapCountValues(vals: ConstPtr<Pcstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValues")

public actual fun ldapCountValuesA(vals: ConstPtr<Pcstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValuesA")

public actual fun ldapCountValuesW(vals: ConstPtr<Pcwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValuesW")

public actual fun ldapCountValuesLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValuesLen")

public actual fun ldapCreatePageControl(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreatePageControl")

public actual fun ldapCreatePageControlA(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA")

public actual fun ldapCreatePageControlW(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW")

public actual fun ldapCreateSortControl(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateSortControl")

public actual fun ldapCreateSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA")

public actual fun ldapCreateSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW")

public actual fun ldapCreateVlvControlA(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA")

public actual fun ldapCreateVlvControlW(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW")

public actual fun ldapDelete(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDelete")

public actual fun ldapDeleteA(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteA")

public actual fun ldapDeleteW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteW")

public actual fun ldapDeleteExt(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExt")

public actual fun ldapDeleteExtA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtA")

public actual fun ldapDeleteExtW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtW")

public actual fun ldapDeleteExtS(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtS")

public actual fun ldapDeleteExtSA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA")

public actual fun ldapDeleteExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW")

public actual fun ldapDeleteS(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteS")

public actual fun ldapDeleteSA(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteSA")

public actual fun ldapDeleteSW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteSW")

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDn2ufn")

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDn2ufnA")

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDn2ufnW")

public actual fun ldapEncodeSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, control: MutPtr<LDAPControlA>, criticality: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA")

public actual fun ldapEncodeSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, control: MutPtr<LDAPControlW>, criticality: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW")

public actual fun ldapErr2string(err: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapErr2string")

public actual fun ldapErr2stringA(err: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapErr2stringA")

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapErr2stringW")

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement")

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA")

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW")

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr<Pstr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExplodeDn")

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr<Pstr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExplodeDnA")

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr<Pwstr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExplodeDnW")

public actual fun ldapExtendedOperation(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperation")

public actual fun ldapExtendedOperationA(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA")

public actual fun ldapExtendedOperationW(ld: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW")

public actual fun ldapExtendedOperationSA(externalhandle: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, returnedoid: MutPtr<Pstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA")

public actual fun ldapExtendedOperationSW(externalhandle: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, returnedoid: MutPtr<Pwstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW")

public actual fun ldapFirstAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstAttribute")

public actual fun ldapFirstAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA")

public actual fun ldapFirstAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW")

public actual fun ldapFirstEntry(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstEntry")

public actual fun ldapFirstReference(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstReference")

public actual fun ldapFreeControls(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFreeControls")

public actual fun ldapFreeControlsA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFreeControlsA")

public actual fun ldapFreeControlsW(controls: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFreeControlsW")

public actual fun ldapGetDn(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetDn")

public actual fun ldapGetDnA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetDnA")

public actual fun ldapGetDnW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetDnW")

public actual fun ldapGetNextPage(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetNextPage")

public actual fun ldapGetNextPageS(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, timeout: MutPtr<LdapTimeval>, pagesize: UInt, totalcount: MutPtr<UInt>, results: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetNextPageS")

public actual fun ldapGetOption(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetOption")

public actual fun ldapGetOptionW(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetOptionW")

public actual fun ldapGetPagedCount(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch, totalcount: MutPtr<UInt>, results: MutPtr<LDAPMessage>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetPagedCount")

public actual fun ldapGetValues(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValues")

public actual fun ldapGetValuesA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesA")

public actual fun ldapGetValuesW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<Pwstr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesW")

public actual fun ldapGetValuesLen(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesLen")

public actual fun ldapGetValuesLenA(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA")

public actual fun ldapGetValuesLenW(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<MutPtr<LdapBerval>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW")

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapInit")

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapInitA")

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapInitW")

public actual fun ldapMemfree(block: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMemfree")

public actual fun ldapMemfreeA(block: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMemfreeA")

public actual fun ldapMemfreeW(block: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMemfreeW")

public actual fun ldapModify(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModify")

public actual fun ldapModifyA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyA")

public actual fun ldapModifyW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyW")

public actual fun ldapModifyExt(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExt")

public actual fun ldapModifyExtA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtA")

public actual fun ldapModifyExtW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtW")

public actual fun ldapModifyExtS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtS")

public actual fun ldapModifyExtSA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtSA")

public actual fun ldapModifyExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtSW")

public actual fun ldapModifyS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyS")

public actual fun ldapModifySA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifySA")

public actual fun ldapModifySW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifySW")

public actual fun ldapModrdn(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn")

public actual fun ldapModrdn2(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2")

public actual fun ldapModrdn2A(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2A")

public actual fun ldapModrdn2W(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2W")

public actual fun ldapModrdn2S(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2S")

public actual fun ldapModrdn2SA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2SA")

public actual fun ldapModrdn2SW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2SW")

public actual fun ldapModrdnA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnA")

public actual fun ldapModrdnW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnW")

public actual fun ldapModrdnS(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnS")

public actual fun ldapModrdnSA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnSA")

public actual fun ldapModrdnSW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnSW")

public actual fun ldapMsgfree(res: MutPtr<LDAPMessage>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMsgfree")

public actual fun ldapNextAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextAttribute")

public actual fun ldapNextAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextAttributeA")

public actual fun ldapNextAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextAttributeW")

public actual fun ldapNextEntry(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextEntry")

public actual fun ldapNextReference(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextReference")

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapOpen")

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapOpenA")

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapOpenW")

public actual fun ldapParseExtendedResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA")

public actual fun ldapParseExtendedResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pwstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW")

public actual fun ldapParsePageControl(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParsePageControl")

public actual fun ldapParsePageControlA(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParsePageControlA")

public actual fun ldapParsePageControlW(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParsePageControlW")

public actual fun ldapParseReference(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseReference")

public actual fun ldapParseReferenceA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseReferenceA")

public actual fun ldapParseReferenceW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pwstr>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseReferenceW")

public actual fun ldapParseResult(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<Pstr>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseResult")

public actual fun ldapParseResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<MutPtr<Byte>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseResultA")

public actual fun ldapParseResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pwstr>, errormessage: MutPtr<Pwstr>, referrals: MutPtr<MutPtr<MutPtr<UShort>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlW>>>, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseResultW")

public actual fun ldapParseSortControl(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseSortControl")

public actual fun ldapParseSortControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseSortControlA")

public actual fun ldapParseSortControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, result: MutPtr<UInt>, attribute: MutPtr<Pwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseSortControlW")

public actual fun ldapParseVlvControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA")

public actual fun ldapParseVlvControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW")

public actual fun ldapPerror(ld: MutPtr<Ldap>, msg: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapPerror")

public actual fun ldapRenameExt(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExt")

public actual fun ldapRenameExtA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtA")

public actual fun ldapRenameExtW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtW")

public actual fun ldapRenameExtS(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtS")

public actual fun ldapRenameExtSA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtSA")

public actual fun ldapRenameExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtSW")

public actual fun ldapResult(ld: MutPtr<Ldap>, msgid: UInt, all: UInt, timeout: ConstPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapResult")

public actual fun ldapResult2error(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>, freeit: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapResult2error")

public actual fun ldapSaslBindA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindA")

public actual fun ldapSaslBindW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<Int>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindW")

public actual fun ldapSaslBindSA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindSA")

public actual fun ldapSaslBindSW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindSW")

public actual fun ldapSearch(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearch")

public actual fun ldapSearchA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchA")

public actual fun ldapSearchW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchW")

public actual fun ldapSearchAbandonPage(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage")

public actual fun ldapSearchExt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExt")

public actual fun ldapSearchExtA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtA")

public actual fun ldapSearchExtW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtW")

public actual fun ldapSearchExtS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtS")

public actual fun ldapSearchExtSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtSA")

public actual fun ldapSearchExtSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtSW")

public actual fun ldapSearchInitPage(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr<MutPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchInitPage")

public actual fun ldapSearchInitPageA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr<ConstPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA")

public actual fun ldapSearchInitPageW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr<ConstPtr<UShort>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>): PLDAPSearch =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW")

public actual fun ldapSearchS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchS")

public actual fun ldapSearchSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchSA")

public actual fun ldapSearchSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchSW")

public actual fun ldapSearchSt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchSt")

public actual fun ldapSearchStA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchStA")

public actual fun ldapSearchStW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchStW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags")
private external fun wasiWindowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags: Int): Int

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags.toInt()).toUInt()

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine")

public actual fun ldapSetOption(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSetOption")

public actual fun ldapSetOptionW(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSetOptionW")

public actual fun ldapSimpleBind(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBind")

public actual fun ldapSimpleBindA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindA")

public actual fun ldapSimpleBindW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindW")

public actual fun ldapSimpleBindS(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindS")

public actual fun ldapSimpleBindSA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA")

public actual fun ldapSimpleBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW")

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSslinit")

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSslinitA")

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSslinitW")

public actual fun ldapStartTlsSA(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStartTlsSA")

public actual fun ldapStartTlsSW(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStartTlsSW")

public actual fun ldapStartup(version: MutPtr<LdapVersionInfo>, instance: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStartup")

public actual fun ldapStopTlsS(externalhandle: MutPtr<Ldap>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStopTlsS")

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUfn2dn")

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUfn2dnA")

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr<Pwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUfn2dnW")

public actual fun ldapUnbind(ld: MutPtr<Ldap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUnbind")

public actual fun ldapUnbindS(ld: MutPtr<Ldap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUnbindS")

public actual fun ldapValueFree(vals: ConstPtr<Pcstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFree")

public actual fun ldapValueFreeA(vals: ConstPtr<Pcstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFreeA")

public actual fun ldapValueFreeW(vals: ConstPtr<Pcwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFreeW")

public actual fun ldapValueFreeLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFreeLen")
