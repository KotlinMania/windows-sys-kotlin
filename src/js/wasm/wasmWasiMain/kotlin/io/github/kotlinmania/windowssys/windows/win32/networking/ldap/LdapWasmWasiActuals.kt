@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

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

public actual fun berAllocT(options: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerAllocT")

public actual fun berBvdup(pberval: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerBvdup")

public actual fun berBvecfree(pberval: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerBvecfree")

public actual fun berBvfree(bv: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerBvfree")

public actual fun berFirstElement(pberelement: MutPtr, plen: MutPtr, ppopaque: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerFirstElement")

public actual fun berFlatten(pberelement: MutPtr, pberval: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerFlatten")

public actual fun berFree(pberelement: MutPtr, fbuf: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerFree")

public actual fun berInit(pberval: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerInit")

public actual fun berNextElement(pberelement: MutPtr, plen: MutPtr, opaque: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerNextElement")

public actual fun berPeekTag(pberelement: MutPtr, plen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerPeekTag")

public actual fun berPrintf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerPrintf")

public actual fun berScanf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerScanf")

public actual fun berSkipTag(pberelement: MutPtr, plen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapBerSkipTag")

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapCldapOpen")

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapCldapOpenA")

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapCldapOpenW")

public actual fun ldapAbandon(ld: MutPtr, msgid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAbandon")

public actual fun ldapAdd(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAdd")

public actual fun ldapAddA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddA")

public actual fun ldapAddW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddW")

public actual fun ldapAddExt(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExt")

public actual fun ldapAddExtA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtA")

public actual fun ldapAddExtW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtW")

public actual fun ldapAddExtS(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtS")

public actual fun ldapAddExtSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtSA")

public actual fun ldapAddExtSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddExtSW")

public actual fun ldapAddS(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddS")

public actual fun ldapAddSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddSA")

public actual fun ldapAddSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapAddSW")

public actual fun ldapBind(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBind")

public actual fun ldapBindA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindA")

public actual fun ldapBindW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindW")

public actual fun ldapBindS(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindS")

public actual fun ldapBindSA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindSA")

public actual fun ldapBindSW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapBindSW")

public actual fun ldapCheckFilterA(ld: MutPtr, searchfilter: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCheckFilterA")

public actual fun ldapCheckFilterW(ld: MutPtr, searchfilter: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCheckFilterW")

public actual fun ldapCleanup(hinstance: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCleanup")

public actual fun ldapCloseExtendedOp(ld: MutPtr, messagenumber: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp")

public actual fun ldapCompare(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompare")

public actual fun ldapCompareA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareA")

public actual fun ldapCompareW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareW")

public actual fun ldapCompareExt(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExt")

public actual fun ldapCompareExtA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtA")

public actual fun ldapCompareExtW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtW")

public actual fun ldapCompareExtS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtS")

public actual fun ldapCompareExtSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtSA")

public actual fun ldapCompareExtSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareExtSW")

public actual fun ldapCompareS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareS")

public actual fun ldapCompareSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareSA")

public actual fun ldapCompareSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCompareSW")

public actual fun ldapConnFromMsg(primaryconn: MutPtr, res: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapConnFromMsg")

public actual fun ldapConnect(ld: MutPtr, timeout: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapConnect")

public actual fun ldapControlFree(control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlFree")

public actual fun ldapControlFreeA(controls: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlFreeA")

public actual fun ldapControlFreeW(control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlFreeW")

public actual fun ldapControlsFree(controls: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlsFree")

public actual fun ldapControlsFreeA(controls: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlsFreeA")

public actual fun ldapControlsFreeW(control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapControlsFreeW")

public actual fun ldapCountEntries(ld: MutPtr, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountEntries")

public actual fun ldapCountReferences(ld: MutPtr, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountReferences")

public actual fun ldapCountValues(vals: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValues")

public actual fun ldapCountValuesA(vals: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValuesA")

public actual fun ldapCountValuesW(vals: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValuesW")

public actual fun ldapCountValuesLen(vals: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCountValuesLen")

public actual fun ldapCreatePageControl(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreatePageControl")

public actual fun ldapCreatePageControlA(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA")

public actual fun ldapCreatePageControlW(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW")

public actual fun ldapCreateSortControl(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateSortControl")

public actual fun ldapCreateSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA")

public actual fun ldapCreateSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW")

public actual fun ldapCreateVlvControlA(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA")

public actual fun ldapCreateVlvControlW(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW")

public actual fun ldapDelete(ld: MutPtr, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDelete")

public actual fun ldapDeleteA(ld: MutPtr, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteA")

public actual fun ldapDeleteW(ld: MutPtr, dn: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteW")

public actual fun ldapDeleteExt(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExt")

public actual fun ldapDeleteExtA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtA")

public actual fun ldapDeleteExtW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtW")

public actual fun ldapDeleteExtS(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtS")

public actual fun ldapDeleteExtSA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA")

public actual fun ldapDeleteExtSW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW")

public actual fun ldapDeleteS(ld: MutPtr, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteS")

public actual fun ldapDeleteSA(ld: MutPtr, dn: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteSA")

public actual fun ldapDeleteSW(ld: MutPtr, dn: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDeleteSW")

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDn2ufn")

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDn2ufnA")

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapDn2ufnW")

public actual fun ldapEncodeSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA")

public actual fun ldapEncodeSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt =
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

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExplodeDn")

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExplodeDnA")

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExplodeDnW")

public actual fun ldapExtendedOperation(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperation")

public actual fun ldapExtendedOperationA(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA")

public actual fun ldapExtendedOperationW(ld: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW")

public actual fun ldapExtendedOperationSA(externalhandle: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA")

public actual fun ldapExtendedOperationSW(externalhandle: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW")

public actual fun ldapFirstAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstAttribute")

public actual fun ldapFirstAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA")

public actual fun ldapFirstAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW")

public actual fun ldapFirstEntry(ld: MutPtr, res: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstEntry")

public actual fun ldapFirstReference(ld: MutPtr, res: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFirstReference")

public actual fun ldapFreeControls(controls: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFreeControls")

public actual fun ldapFreeControlsA(controls: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFreeControlsA")

public actual fun ldapFreeControlsW(controls: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapFreeControlsW")

public actual fun ldapGetDn(ld: MutPtr, entry: MutPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetDn")

public actual fun ldapGetDnA(ld: MutPtr, entry: MutPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetDnA")

public actual fun ldapGetDnW(ld: MutPtr, entry: MutPtr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetDnW")

public actual fun ldapGetNextPage(externalhandle: MutPtr, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetNextPage")

public actual fun ldapGetNextPageS(externalhandle: MutPtr, searchhandle: PLDAPSearch, timeout: MutPtr, pagesize: UInt, totalcount: MutPtr, results: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetNextPageS")

public actual fun ldapGetOption(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetOption")

public actual fun ldapGetOptionW(ld: MutPtr, option: Int, outvalue: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetOptionW")

public actual fun ldapGetPagedCount(externalhandle: MutPtr, searchblock: PLDAPSearch, totalcount: MutPtr, results: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetPagedCount")

public actual fun ldapGetValues(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValues")

public actual fun ldapGetValuesA(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesA")

public actual fun ldapGetValuesW(ld: MutPtr, entry: MutPtr, attr: Pcwstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesW")

public actual fun ldapGetValuesLen(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesLen")

public actual fun ldapGetValuesLenA(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA")

public actual fun ldapGetValuesLenW(externalhandle: MutPtr, message: MutPtr, attr: Pcwstr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW")

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapInit")

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapInitA")

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapInitW")

public actual fun ldapMemfree(block: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMemfree")

public actual fun ldapMemfreeA(block: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMemfreeA")

public actual fun ldapMemfreeW(block: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMemfreeW")

public actual fun ldapModify(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModify")

public actual fun ldapModifyA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyA")

public actual fun ldapModifyW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyW")

public actual fun ldapModifyExt(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExt")

public actual fun ldapModifyExtA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtA")

public actual fun ldapModifyExtW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtW")

public actual fun ldapModifyExtS(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtS")

public actual fun ldapModifyExtSA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtSA")

public actual fun ldapModifyExtSW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyExtSW")

public actual fun ldapModifyS(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifyS")

public actual fun ldapModifySA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifySA")

public actual fun ldapModifySW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModifySW")

public actual fun ldapModrdn(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn")

public actual fun ldapModrdn2(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2")

public actual fun ldapModrdn2A(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2A")

public actual fun ldapModrdn2W(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2W")

public actual fun ldapModrdn2S(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2S")

public actual fun ldapModrdn2SA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2SA")

public actual fun ldapModrdn2SW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdn2SW")

public actual fun ldapModrdnA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnA")

public actual fun ldapModrdnW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnW")

public actual fun ldapModrdnS(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnS")

public actual fun ldapModrdnSA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnSA")

public actual fun ldapModrdnSW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapModrdnSW")

public actual fun ldapMsgfree(res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapMsgfree")

public actual fun ldapNextAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextAttribute")

public actual fun ldapNextAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextAttributeA")

public actual fun ldapNextAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextAttributeW")

public actual fun ldapNextEntry(ld: MutPtr, entry: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextEntry")

public actual fun ldapNextReference(ld: MutPtr, entry: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapNextReference")

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapOpen")

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapOpenA")

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapOpenW")

public actual fun ldapParseExtendedResultA(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA")

public actual fun ldapParseExtendedResultW(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW")

public actual fun ldapParsePageControl(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParsePageControl")

public actual fun ldapParsePageControlA(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParsePageControlA")

public actual fun ldapParsePageControlW(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParsePageControlW")

public actual fun ldapParseReference(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseReference")

public actual fun ldapParseReferenceA(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseReferenceA")

public actual fun ldapParseReferenceW(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseReferenceW")

public actual fun ldapParseResult(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseResult")

public actual fun ldapParseResultA(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseResultA")

public actual fun ldapParseResultW(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseResultW")

public actual fun ldapParseSortControl(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseSortControl")

public actual fun ldapParseSortControlA(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseSortControlA")

public actual fun ldapParseSortControlW(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseSortControlW")

public actual fun ldapParseVlvControlA(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA")

public actual fun ldapParseVlvControlW(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW")

public actual fun ldapPerror(ld: MutPtr, msg: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapPerror")

public actual fun ldapRenameExt(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExt")

public actual fun ldapRenameExtA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtA")

public actual fun ldapRenameExtW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtW")

public actual fun ldapRenameExtS(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtS")

public actual fun ldapRenameExtSA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtSA")

public actual fun ldapRenameExtSW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapRenameExtSW")

public actual fun ldapResult(ld: MutPtr, msgid: UInt, all: UInt, timeout: ConstPtr, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapResult")

public actual fun ldapResult2error(ld: MutPtr, res: MutPtr, freeit: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapResult2error")

public actual fun ldapSaslBindA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindA")

public actual fun ldapSaslBindW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindW")

public actual fun ldapSaslBindSA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindSA")

public actual fun ldapSaslBindSW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSaslBindSW")

public actual fun ldapSearch(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearch")

public actual fun ldapSearchA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchA")

public actual fun ldapSearchW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchW")

public actual fun ldapSearchAbandonPage(externalhandle: MutPtr, searchblock: PLDAPSearch): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage")

public actual fun ldapSearchExt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExt")

public actual fun ldapSearchExtA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtA")

public actual fun ldapSearchExtW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtW")

public actual fun ldapSearchExtS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtS")

public actual fun ldapSearchExtSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtSA")

public actual fun ldapSearchExtSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchExtSW")

public actual fun ldapSearchInitPage(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchInitPage")

public actual fun ldapSearchInitPageA(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA")

public actual fun ldapSearchInitPageW(externalhandle: MutPtr, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW")

public actual fun ldapSearchS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchS")

public actual fun ldapSearchSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchSA")

public actual fun ldapSearchSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchSW")

public actual fun ldapSearchSt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchSt")

public actual fun ldapSearchStA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchStA")

public actual fun ldapSearchStW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSearchStW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags")
private external fun wasiWindowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags: Int): Int

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags.toInt()).toUInt()

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine")

public actual fun ldapSetOption(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSetOption")

public actual fun ldapSetOptionW(ld: MutPtr, option: Int, invalue: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSetOptionW")

public actual fun ldapSimpleBind(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBind")

public actual fun ldapSimpleBindA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindA")

public actual fun ldapSimpleBindW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindW")

public actual fun ldapSimpleBindS(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindS")

public actual fun ldapSimpleBindSA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA")

public actual fun ldapSimpleBindSW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW")

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSslinit")

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSslinitA")

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapSslinitW")

public actual fun ldapStartTlsSA(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStartTlsSA")

public actual fun ldapStartTlsSW(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStartTlsSW")

public actual fun ldapStartup(version: MutPtr, instance: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStartup")

public actual fun ldapStopTlsS(externalhandle: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapStopTlsS")

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUfn2dn")

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUfn2dnA")

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUfn2dnW")

public actual fun ldapUnbind(ld: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUnbind")

public actual fun ldapUnbindS(ld: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapUnbindS")

public actual fun ldapValueFree(vals: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFree")

public actual fun ldapValueFreeA(vals: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFreeA")

public actual fun ldapValueFreeW(vals: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFreeW")

public actual fun ldapValueFreeLen(vals: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingLdapLdapValueFreeLen")
