@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public actual fun ldapGetLastError(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berAllocT(options: Int): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berBvdup(pberval: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berBvecfree(pberval: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun berBvfree(bv: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun berFirstElement(pberelement: COpaquePointer?, plen: COpaquePointer?, ppopaque: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berFlatten(pberelement: COpaquePointer?, pberval: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berFree(pberelement: COpaquePointer?, fbuf: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun berInit(pberval: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berNextElement(pberelement: COpaquePointer?, plen: COpaquePointer?, opaque: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berPeekTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berPrintf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berScanf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun berSkipTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAbandon(ld: COpaquePointer?, msgid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAdd(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddExt(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddExtA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddExtW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddExtS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddExtSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddExtSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapAddSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapBind(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapBindA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapBindW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapBindS(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapBindSA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapBindSW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCheckFilterA(ld: COpaquePointer?, searchfilter: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCheckFilterW(ld: COpaquePointer?, searchfilter: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCleanup(hinstance: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCloseExtendedOp(ld: COpaquePointer?, messagenumber: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompare(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareExt(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareExtA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareExtW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareExtS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareExtSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareExtSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCompareSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapConnFromMsg(primaryconn: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapConnect(ld: COpaquePointer?, timeout: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapControlFree(control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapControlFreeA(controls: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapControlFreeW(control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapControlsFree(controls: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapControlsFreeA(controls: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapControlsFreeW(control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCountEntries(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCountReferences(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCountValues(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCountValuesA(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCountValuesW(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCountValuesLen(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreatePageControl(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreatePageControlA(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreatePageControlW(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreateSortControl(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreateSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreateSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreateVlvControlA(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapCreateVlvControlW(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDelete(ld: COpaquePointer?, dn: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteA(ld: COpaquePointer?, dn: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteExt(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteExtA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteExtW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteExtS(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteExtSA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteExtSW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteS(ld: COpaquePointer?, dn: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteSA(ld: COpaquePointer?, dn: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDeleteSW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapEncodeSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapEncodeSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapErr2string(err: UInt): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapErr2stringA(err: UInt): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExtendedOperation(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExtendedOperationA(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExtendedOperationW(ld: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExtendedOperationSA(externalhandle: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapExtendedOperationSW(externalhandle: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFirstAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFirstAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFirstAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFirstEntry(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFirstReference(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFreeControls(controls: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFreeControlsA(controls: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapFreeControlsW(controls: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetDn(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetDnA(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetDnW(ld: COpaquePointer?, entry: COpaquePointer?): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetNextPage(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetNextPageS(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, timeout: COpaquePointer?, pagesize: UInt, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetOption(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetOptionW(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetPagedCount(externalhandle: COpaquePointer?, searchblock: PLDAPSearch, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetValues(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetValuesA(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetValuesW(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetValuesLen(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetValuesLenA(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapGetValuesLenW(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapMemfree(block: Pcstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ldapMemfreeA(block: Pcstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ldapModify(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyExt(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyExtA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyExtW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyExtS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyExtSA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyExtSW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifyS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifySA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModifySW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdn(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdn2(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdn2A(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdn2W(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdn2S(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdn2SA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdn2SW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdnA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdnW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdnS(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdnSA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapModrdnSW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapMsgfree(res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapNextAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapNextAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapNextAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapNextEntry(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapNextReference(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseExtendedResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseExtendedResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParsePageControl(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParsePageControlA(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParsePageControlW(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseReference(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseReferenceA(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseReferenceW(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseResult(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseSortControl(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseSortControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseSortControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseVlvControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapParseVlvControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapPerror(ld: COpaquePointer?, msg: Pcstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ldapRenameExt(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapRenameExtA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapRenameExtW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapRenameExtS(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapRenameExtSA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapRenameExtSW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapResult(ld: COpaquePointer?, msgid: UInt, all: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapResult2error(ld: COpaquePointer?, res: COpaquePointer?, freeit: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSaslBindA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSaslBindW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSaslBindSA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSaslBindSW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearch(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchAbandonPage(externalhandle: COpaquePointer?, searchblock: PLDAPSearch): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchExt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchExtA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchExtW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchExtS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchExtSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchExtSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchInitPage(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchInitPageA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchInitPageW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchSt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchStA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSearchStW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ldapSetOption(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSetOptionW(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSimpleBind(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSimpleBindA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSimpleBindW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSimpleBindS(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSimpleBindSA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSimpleBindSW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapStartTlsSA(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapStartTlsSW(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapStartup(version: COpaquePointer?, instance: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapStopTlsS(externalhandle: COpaquePointer?): Boolean =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapUnbind(ld: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapUnbindS(ld: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapValueFree(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapValueFreeA(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapValueFreeW(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldapValueFreeLen(vals: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
