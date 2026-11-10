@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32NetworkingLdapJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetLastError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapMapErrorToWin32(ldaperror: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapUTF8ToUnicode(lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapUnicodeToUTF8(lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berAllocT(options: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berBvdup(pberval: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berBvecfree(pberval: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berBvfree(bv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berFirstElement(pberelement: Long, plen: Long, ppopaque: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berFlatten(pberelement: Long, pberval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berFree(pberelement: Long, fbuf: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berInit(pberval: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berNextElement(pberelement: Long, plen: Long, opaque: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berPeekTag(pberelement: Long, plen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berPrintf(pberelement: Long, fmt: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berScanf(pberelement: Long, fmt: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_berSkipTag(pberelement: Long, plen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_cldapOpen(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_cldapOpenA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_cldapOpenW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAbandon(ld: Long, msgid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAdd(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddA(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddW(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddExt(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddExtA(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddExtW(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddExtS(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddExtSA(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddExtSW(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddS(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddSA(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapAddSW(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapBind(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapBindA(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapBindW(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapBindS(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapBindSA(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapBindSW(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCheckFilterA(ld: Long, searchfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCheckFilterW(ld: Long, searchfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCleanup(hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCloseExtendedOp(ld: Long, messagenumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompare(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareA(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareW(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareExt(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareExtA(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareExtW(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareExtS(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareExtSA(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareExtSW(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareS(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareSA(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCompareSW(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapConnFromMsg(primaryconn: Long, res: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapConnect(ld: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapControlFree(control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapControlFreeA(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapControlFreeW(control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapControlsFree(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapControlsFreeA(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapControlsFreeW(control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCountEntries(ld: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCountReferences(ld: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCountValues(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCountValuesA(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCountValuesW(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCountValuesLen(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreatePageControl(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreatePageControlA(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreatePageControlW(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreateSortControl(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreateSortControlA(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreateSortControlW(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreateVlvControlA(externalhandle: Long, vlvinfo: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapCreateVlvControlW(externalhandle: Long, vlvinfo: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDelete(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteA(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteW(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteExt(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteExtA(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteExtW(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteExtS(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteExtSA(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteExtSW(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteS(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteSA(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDeleteSW(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDn2ufn(dn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDn2ufnA(dn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapDn2ufnW(dn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapEncodeSortControlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapEncodeSortControlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapErr2string(err: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapErr2stringA(err: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapErr2stringW(err: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapEscapeFilterElement(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementA(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementW(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExplodeDn(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExplodeDnA(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExplodeDnW(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExtendedOperation(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExtendedOperationA(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExtendedOperationW(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExtendedOperationSA(externalhandle: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapExtendedOperationSW(externalhandle: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFirstAttribute(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFirstAttributeA(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFirstAttributeW(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFirstEntry(ld: Long, res: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFirstReference(ld: Long, res: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFreeControls(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFreeControlsA(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapFreeControlsW(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetDn(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetDnA(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetDnW(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetNextPage(externalhandle: Long, searchhandle: Long, pagesize: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetNextPageS(externalhandle: Long, searchhandle: Long, timeout: Long, pagesize: Int, totalcount: Long, results: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetOption(ld: Long, option: Int, outvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetOptionW(ld: Long, option: Int, outvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetPagedCount(externalhandle: Long, searchblock: Long, totalcount: Long, results: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetValues(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetValuesA(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetValuesW(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetValuesLen(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetValuesLenA(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapGetValuesLenW(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapInit(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapInitA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapInitW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapMemfree(block: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapMemfreeA(block: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapMemfreeW(block: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModify(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyA(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyW(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyExt(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyExtA(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyExtW(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyExtS(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyExtSA(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyExtSW(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifyS(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifySA(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModifySW(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdn(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdn2(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdn2A(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdn2W(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdn2S(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdn2SA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdn2SW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdnA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdnW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdnS(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdnSA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapModrdnSW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapMsgfree(res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapNextAttribute(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapNextAttributeA(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapNextAttributeW(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapNextEntry(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapNextReference(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapOpen(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapOpenA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapOpenW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseExtendedResultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseExtendedResultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParsePageControl(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParsePageControlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParsePageControlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseReference(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseReferenceA(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseReferenceW(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseResult(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseResultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseResultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseSortControl(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseSortControlA(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseSortControlW(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseVlvControlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapParseVlvControlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapPerror(ld: Long, msg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapRenameExt(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapRenameExtA(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapRenameExtW(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapRenameExtS(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapRenameExtSA(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapRenameExtSW(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapResult(ld: Long, msgid: Int, all: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapResult2error(ld: Long, res: Long, freeit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSaslBindA(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSaslBindW(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSaslBindSA(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSaslBindSW(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearch(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchAbandonPage(externalhandle: Long, searchblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchExt(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchExtA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchExtW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchExtS(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchExtSA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchExtSW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchInitPage(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchInitPageA(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchInitPageW(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchS(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchSA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchSW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchSt(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchStA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSearchStW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSetDbgFlags(newflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSetDbgRoutine(debugprintroutine: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSetOption(ld: Long, option: Int, invalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSetOptionW(ld: Long, option: Int, invalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSimpleBind(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSimpleBindA(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSimpleBindW(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSimpleBindS(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSimpleBindSA(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSimpleBindSW(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSslinit(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSslinitA(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapSslinitW(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapStartTlsSA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapStartTlsSW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapStartup(version: Long, instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapStopTlsS(externalhandle: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapUfn2dn(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapUfn2dnA(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapUfn2dnW(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapUnbind(ld: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapUnbindS(ld: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapValueFree(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapValueFreeA(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapValueFreeW(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldapValueFreeLen(vals: Long): Int
}

public actual fun ldapGetLastError(): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetLastError().toUInt()

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapMapErrorToWin32(ldaperror.toInt()).toUInt()

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapUTF8ToUnicode((lpsrcstr?.value ?: 0L), cchsrc, (lpdeststr?.value ?: 0L), cchdest)

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapUnicodeToUTF8((lpsrcstr?.value ?: 0L), cchsrc, (lpdeststr?.value ?: 0L), cchdest)

public actual fun berAllocT(options: Int): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berAllocT(options).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun berBvdup(pberval: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berBvdup((pberval?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun berBvecfree(pberval: COpaquePointer?) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berBvecfree((pberval?.value ?: 0L))
}

public actual fun berBvfree(bv: COpaquePointer?) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berBvfree((bv?.value ?: 0L))
}

public actual fun berFirstElement(pberelement: COpaquePointer?, plen: COpaquePointer?, ppopaque: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berFirstElement((pberelement?.value ?: 0L), (plen?.value ?: 0L), (ppopaque?.value ?: 0L)).toUInt()

public actual fun berFlatten(pberelement: COpaquePointer?, pberval: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berFlatten((pberelement?.value ?: 0L), (pberval?.value ?: 0L))

public actual fun berFree(pberelement: COpaquePointer?, fbuf: Int) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berFree((pberelement?.value ?: 0L), fbuf)
}

public actual fun berInit(pberval: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berInit((pberval?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun berNextElement(pberelement: COpaquePointer?, plen: COpaquePointer?, opaque: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berNextElement((pberelement?.value ?: 0L), (plen?.value ?: 0L), (opaque?.value ?: 0L)).toUInt()

public actual fun berPeekTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berPeekTag((pberelement?.value ?: 0L), (plen?.value ?: 0L)).toUInt()

public actual fun berPrintf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berPrintf((pberelement?.value ?: 0L), (fmt?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun berScanf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berScanf((pberelement?.value ?: 0L), (fmt?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun berSkipTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_berSkipTag((pberelement?.value ?: 0L), (plen?.value ?: 0L)).toUInt()

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_cldapOpen((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_cldapOpenA((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_cldapOpenW((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapAbandon(ld: COpaquePointer?, msgid: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAbandon((ld?.value ?: 0L), msgid.toInt()).toUInt()

public actual fun ldapAdd(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAdd((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L)).toUInt()

public actual fun ldapAddA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddA((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L)).toUInt()

public actual fun ldapAddW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddW((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L)).toUInt()

public actual fun ldapAddExt(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddExt((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapAddExtA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddExtA((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapAddExtW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddExtW((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapAddExtS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddExtS((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapAddExtSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddExtSA((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapAddExtSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddExtSW((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapAddS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddS((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L)).toUInt()

public actual fun ldapAddSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddSA((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L)).toUInt()

public actual fun ldapAddSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapAddSW((ld?.value ?: 0L), (dn?.value ?: 0L), (attrs?.value ?: 0L)).toUInt()

public actual fun ldapBind(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapBind((ld?.value ?: 0L), (dn?.value ?: 0L), (cred?.value ?: 0L), method.toInt()).toUInt()

public actual fun ldapBindA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapBindA((ld?.value ?: 0L), (dn?.value ?: 0L), (cred?.value ?: 0L), method.toInt()).toUInt()

public actual fun ldapBindW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapBindW((ld?.value ?: 0L), (dn?.value ?: 0L), (cred?.value ?: 0L), method.toInt()).toUInt()

public actual fun ldapBindS(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapBindS((ld?.value ?: 0L), (dn?.value ?: 0L), (cred?.value ?: 0L), method.toInt()).toUInt()

public actual fun ldapBindSA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapBindSA((ld?.value ?: 0L), (dn?.value ?: 0L), (cred?.value ?: 0L), method.toInt()).toUInt()

public actual fun ldapBindSW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapBindSW((ld?.value ?: 0L), (dn?.value ?: 0L), (cred?.value ?: 0L), method.toInt()).toUInt()

public actual fun ldapCheckFilterA(ld: COpaquePointer?, searchfilter: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCheckFilterA((ld?.value ?: 0L), (searchfilter?.value ?: 0L)).toUInt()

public actual fun ldapCheckFilterW(ld: COpaquePointer?, searchfilter: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCheckFilterW((ld?.value ?: 0L), (searchfilter?.value ?: 0L)).toUInt()

public actual fun ldapCleanup(hinstance: Handle): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCleanup((hinstance?.value ?: 0L)).toUInt()

public actual fun ldapCloseExtendedOp(ld: COpaquePointer?, messagenumber: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCloseExtendedOp((ld?.value ?: 0L), messagenumber.toInt()).toUInt()

public actual fun ldapCompare(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompare((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun ldapCompareA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareA((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun ldapCompareW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareW((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun ldapCompareExt(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareExt((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapCompareExtA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareExtA((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapCompareExtW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareExtW((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapCompareExtS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareExtS((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapCompareExtSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareExtSA((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapCompareExtSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareExtSW((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapCompareS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareS((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun ldapCompareSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareSA((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun ldapCompareSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCompareSW((ld?.value ?: 0L), (dn?.value ?: 0L), (attr?.value ?: 0L), (value?.value ?: 0L)).toUInt()

public actual fun ldapConnFromMsg(primaryconn: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapConnFromMsg((primaryconn?.value ?: 0L), (res?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapConnect(ld: COpaquePointer?, timeout: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapConnect((ld?.value ?: 0L), (timeout?.value ?: 0L)).toUInt()

public actual fun ldapControlFree(control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapControlFree((control?.value ?: 0L)).toUInt()

public actual fun ldapControlFreeA(controls: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapControlFreeA((controls?.value ?: 0L)).toUInt()

public actual fun ldapControlFreeW(control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapControlFreeW((control?.value ?: 0L)).toUInt()

public actual fun ldapControlsFree(controls: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapControlsFree((controls?.value ?: 0L)).toUInt()

public actual fun ldapControlsFreeA(controls: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapControlsFreeA((controls?.value ?: 0L)).toUInt()

public actual fun ldapControlsFreeW(control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapControlsFreeW((control?.value ?: 0L)).toUInt()

public actual fun ldapCountEntries(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCountEntries((ld?.value ?: 0L), (res?.value ?: 0L)).toUInt()

public actual fun ldapCountReferences(ld: COpaquePointer?, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCountReferences((ld?.value ?: 0L), (res?.value ?: 0L)).toUInt()

public actual fun ldapCountValues(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCountValues((vals?.value ?: 0L)).toUInt()

public actual fun ldapCountValuesA(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCountValuesA((vals?.value ?: 0L)).toUInt()

public actual fun ldapCountValuesW(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCountValuesW((vals?.value ?: 0L)).toUInt()

public actual fun ldapCountValuesLen(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCountValuesLen((vals?.value ?: 0L)).toUInt()

public actual fun ldapCreatePageControl(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreatePageControl((externalhandle?.value ?: 0L), pagesize.toInt(), (cookie?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L)).toUInt()

public actual fun ldapCreatePageControlA(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreatePageControlA((externalhandle?.value ?: 0L), pagesize.toInt(), (cookie?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L)).toUInt()

public actual fun ldapCreatePageControlW(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreatePageControlW((externalhandle?.value ?: 0L), pagesize.toInt(), (cookie?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L)).toUInt()

public actual fun ldapCreateSortControl(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreateSortControl((externalhandle?.value ?: 0L), (sortkeys?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L)).toUInt()

public actual fun ldapCreateSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreateSortControlA((externalhandle?.value ?: 0L), (sortkeys?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L)).toUInt()

public actual fun ldapCreateSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreateSortControlW((externalhandle?.value ?: 0L), (sortkeys?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L)).toUInt()

public actual fun ldapCreateVlvControlA(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreateVlvControlA((externalhandle?.value ?: 0L), (vlvinfo?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L))

public actual fun ldapCreateVlvControlW(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapCreateVlvControlW((externalhandle?.value ?: 0L), (vlvinfo?.value ?: 0L), iscritical.toByte(), (control?.value ?: 0L))

public actual fun ldapDelete(ld: COpaquePointer?, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDelete((ld?.value ?: 0L), (dn?.value ?: 0L)).toUInt()

public actual fun ldapDeleteA(ld: COpaquePointer?, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteA((ld?.value ?: 0L), (dn?.value ?: 0L)).toUInt()

public actual fun ldapDeleteW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteW((ld?.value ?: 0L), (dn?.value ?: 0L)).toUInt()

public actual fun ldapDeleteExt(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteExt((ld?.value ?: 0L), (dn?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapDeleteExtA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteExtA((ld?.value ?: 0L), (dn?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapDeleteExtW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteExtW((ld?.value ?: 0L), (dn?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapDeleteExtS(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteExtS((ld?.value ?: 0L), (dn?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapDeleteExtSA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteExtSA((ld?.value ?: 0L), (dn?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapDeleteExtSW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteExtSW((ld?.value ?: 0L), (dn?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapDeleteS(ld: COpaquePointer?, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteS((ld?.value ?: 0L), (dn?.value ?: 0L)).toUInt()

public actual fun ldapDeleteSA(ld: COpaquePointer?, dn: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteSA((ld?.value ?: 0L), (dn?.value ?: 0L)).toUInt()

public actual fun ldapDeleteSW(ld: COpaquePointer?, dn: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDeleteSW((ld?.value ?: 0L), (dn?.value ?: 0L)).toUInt()

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDn2ufn((dn?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDn2ufnA((dn?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapDn2ufnW((dn?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapEncodeSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapEncodeSortControlA((externalhandle?.value ?: 0L), (sortkeys?.value ?: 0L), (control?.value ?: 0L), criticality).toUInt()

public actual fun ldapEncodeSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapEncodeSortControlW((externalhandle?.value ?: 0L), (sortkeys?.value ?: 0L), (control?.value ?: 0L), criticality).toUInt()

public actual fun ldapErr2string(err: UInt): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapErr2string(err.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapErr2stringA(err: UInt): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapErr2stringA(err.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapErr2stringW(err.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElement((sourcefilterelement?.value ?: 0L), sourcelength.toInt(), (destfilterelement?.value ?: 0L), destlength.toInt()).toUInt()

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementA((sourcefilterelement?.value ?: 0L), sourcelength.toInt(), (destfilterelement?.value ?: 0L), destlength.toInt()).toUInt()

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapEscapeFilterElementW((sourcefilterelement?.value ?: 0L), sourcelength.toInt(), (destfilterelement?.value ?: 0L), destlength.toInt()).toUInt()

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExplodeDn((dn?.value ?: 0L), notypes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExplodeDnA((dn?.value ?: 0L), notypes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExplodeDnW((dn?.value ?: 0L), notypes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapExtendedOperation(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExtendedOperation((ld?.value ?: 0L), (oid?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapExtendedOperationA(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExtendedOperationA((ld?.value ?: 0L), (oid?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapExtendedOperationW(ld: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExtendedOperationW((ld?.value ?: 0L), (oid?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapExtendedOperationSA(externalhandle: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExtendedOperationSA((externalhandle?.value ?: 0L), (oid?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (returnedoid?.value ?: 0L), (returneddata?.value ?: 0L)).toUInt()

public actual fun ldapExtendedOperationSW(externalhandle: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapExtendedOperationSW((externalhandle?.value ?: 0L), (oid?.value ?: 0L), (data?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (returnedoid?.value ?: 0L), (returneddata?.value ?: 0L)).toUInt()

public actual fun ldapFirstAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFirstAttribute((ld?.value ?: 0L), (entry?.value ?: 0L), (ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapFirstAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFirstAttributeA((ld?.value ?: 0L), (entry?.value ?: 0L), (ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapFirstAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFirstAttributeW((ld?.value ?: 0L), (entry?.value ?: 0L), (ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapFirstEntry(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFirstEntry((ld?.value ?: 0L), (res?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapFirstReference(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFirstReference((ld?.value ?: 0L), (res?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapFreeControls(controls: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFreeControls((controls?.value ?: 0L)).toUInt()

public actual fun ldapFreeControlsA(controls: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFreeControlsA((controls?.value ?: 0L)).toUInt()

public actual fun ldapFreeControlsW(controls: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapFreeControlsW((controls?.value ?: 0L)).toUInt()

public actual fun ldapGetDn(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetDn((ld?.value ?: 0L), (entry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetDnA(ld: COpaquePointer?, entry: COpaquePointer?): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetDnA((ld?.value ?: 0L), (entry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetDnW(ld: COpaquePointer?, entry: COpaquePointer?): Pwstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetDnW((ld?.value ?: 0L), (entry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetNextPage(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetNextPage((externalhandle?.value ?: 0L), searchhandle.toLong(), pagesize.toInt(), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapGetNextPageS(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, timeout: COpaquePointer?, pagesize: UInt, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetNextPageS((externalhandle?.value ?: 0L), searchhandle.toLong(), (timeout?.value ?: 0L), pagesize.toInt(), (totalcount?.value ?: 0L), (results?.value ?: 0L)).toUInt()

public actual fun ldapGetOption(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetOption((ld?.value ?: 0L), option, (outvalue?.value ?: 0L)).toUInt()

public actual fun ldapGetOptionW(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetOptionW((ld?.value ?: 0L), option, (outvalue?.value ?: 0L)).toUInt()

public actual fun ldapGetPagedCount(externalhandle: COpaquePointer?, searchblock: PLDAPSearch, totalcount: COpaquePointer?, results: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetPagedCount((externalhandle?.value ?: 0L), searchblock.toLong(), (totalcount?.value ?: 0L), (results?.value ?: 0L)).toUInt()

public actual fun ldapGetValues(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetValues((ld?.value ?: 0L), (entry?.value ?: 0L), (attr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetValuesA(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetValuesA((ld?.value ?: 0L), (entry?.value ?: 0L), (attr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetValuesW(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetValuesW((ld?.value ?: 0L), (entry?.value ?: 0L), (attr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetValuesLen(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetValuesLen((externalhandle?.value ?: 0L), (message?.value ?: 0L), (attr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetValuesLenA(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetValuesLenA((externalhandle?.value ?: 0L), (message?.value ?: 0L), (attr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapGetValuesLenW(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcwstr): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapGetValuesLenW((externalhandle?.value ?: 0L), (message?.value ?: 0L), (attr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapInit((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapInitA((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapInitW((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapMemfree(block: Pcstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapMemfree((block?.value ?: 0L))
}

public actual fun ldapMemfreeA(block: Pcstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapMemfreeA((block?.value ?: 0L))
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapMemfreeW((block?.value ?: 0L))
}

public actual fun ldapModify(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModify((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L)).toUInt()

public actual fun ldapModifyA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyA((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L)).toUInt()

public actual fun ldapModifyW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyW((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L)).toUInt()

public actual fun ldapModifyExt(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyExt((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapModifyExtA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyExtA((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapModifyExtW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyExtW((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapModifyExtS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyExtS((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapModifyExtSA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyExtSA((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapModifyExtSW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyExtSW((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapModifyS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifyS((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L)).toUInt()

public actual fun ldapModifySA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifySA((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L)).toUInt()

public actual fun ldapModifySW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModifySW((ld?.value ?: 0L), (dn?.value ?: 0L), (mods?.value ?: 0L)).toUInt()

public actual fun ldapModrdn(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdn((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L)).toUInt()

public actual fun ldapModrdn2(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdn2((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L), deleteoldrdn).toUInt()

public actual fun ldapModrdn2A(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdn2A((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L), deleteoldrdn).toUInt()

public actual fun ldapModrdn2W(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdn2W((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L), deleteoldrdn).toUInt()

public actual fun ldapModrdn2S(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdn2S((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L), deleteoldrdn).toUInt()

public actual fun ldapModrdn2SA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdn2SA((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L), deleteoldrdn).toUInt()

public actual fun ldapModrdn2SW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdn2SW((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L), deleteoldrdn).toUInt()

public actual fun ldapModrdnA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdnA((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L)).toUInt()

public actual fun ldapModrdnW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdnW((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L)).toUInt()

public actual fun ldapModrdnS(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdnS((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L)).toUInt()

public actual fun ldapModrdnSA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdnSA((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L)).toUInt()

public actual fun ldapModrdnSW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapModrdnSW((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), (newdistinguishedname?.value ?: 0L)).toUInt()

public actual fun ldapMsgfree(res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapMsgfree((res?.value ?: 0L)).toUInt()

public actual fun ldapNextAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapNextAttribute((ld?.value ?: 0L), (entry?.value ?: 0L), (ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapNextAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapNextAttributeA((ld?.value ?: 0L), (entry?.value ?: 0L), (ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapNextAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapNextAttributeW((ld?.value ?: 0L), (entry?.value ?: 0L), (ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapNextEntry(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapNextEntry((ld?.value ?: 0L), (entry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapNextReference(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapNextReference((ld?.value ?: 0L), (entry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapOpen((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapOpenA((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapOpenW((hostname?.value ?: 0L), portnumber.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapParseExtendedResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseExtendedResultA((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (resultoid?.value ?: 0L), (resultdata?.value ?: 0L), freeit).toUInt()

public actual fun ldapParseExtendedResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseExtendedResultW((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (resultoid?.value ?: 0L), (resultdata?.value ?: 0L), freeit).toUInt()

public actual fun ldapParsePageControl(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParsePageControl((externalhandle?.value ?: 0L), (servercontrols?.value ?: 0L), (totalcount?.value ?: 0L), (cookie?.value ?: 0L)).toUInt()

public actual fun ldapParsePageControlA(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParsePageControlA((externalhandle?.value ?: 0L), (servercontrols?.value ?: 0L), (totalcount?.value ?: 0L), (cookie?.value ?: 0L)).toUInt()

public actual fun ldapParsePageControlW(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParsePageControlW((externalhandle?.value ?: 0L), (servercontrols?.value ?: 0L), (totalcount?.value ?: 0L), (cookie?.value ?: 0L)).toUInt()

public actual fun ldapParseReference(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseReference((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (referrals?.value ?: 0L)).toUInt()

public actual fun ldapParseReferenceA(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseReferenceA((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (referrals?.value ?: 0L)).toUInt()

public actual fun ldapParseReferenceW(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseReferenceW((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (referrals?.value ?: 0L)).toUInt()

public actual fun ldapParseResult(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseResult((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (returncode?.value ?: 0L), (matcheddns?.value ?: 0L), (errormessage?.value ?: 0L), (referrals?.value ?: 0L), (servercontrols?.value ?: 0L), freeit).toUInt()

public actual fun ldapParseResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseResultA((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (returncode?.value ?: 0L), (matcheddns?.value ?: 0L), (errormessage?.value ?: 0L), (referrals?.value ?: 0L), (servercontrols?.value ?: 0L), freeit).toUInt()

public actual fun ldapParseResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseResultW((connection?.value ?: 0L), (resultmessage?.value ?: 0L), (returncode?.value ?: 0L), (matcheddns?.value ?: 0L), (errormessage?.value ?: 0L), (referrals?.value ?: 0L), (servercontrols?.value ?: 0L), freeit).toUInt()

public actual fun ldapParseSortControl(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseSortControl((externalhandle?.value ?: 0L), (control?.value ?: 0L), (result?.value ?: 0L), (attribute?.value ?: 0L)).toUInt()

public actual fun ldapParseSortControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseSortControlA((externalhandle?.value ?: 0L), (control?.value ?: 0L), (result?.value ?: 0L), (attribute?.value ?: 0L)).toUInt()

public actual fun ldapParseSortControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseSortControlW((externalhandle?.value ?: 0L), (control?.value ?: 0L), (result?.value ?: 0L), (attribute?.value ?: 0L)).toUInt()

public actual fun ldapParseVlvControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseVlvControlA((externalhandle?.value ?: 0L), (control?.value ?: 0L), (targetpos?.value ?: 0L), (listcount?.value ?: 0L), (context?.value ?: 0L), (errcode?.value ?: 0L))

public actual fun ldapParseVlvControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapParseVlvControlW((externalhandle?.value ?: 0L), (control?.value ?: 0L), (targetpos?.value ?: 0L), (listcount?.value ?: 0L), (context?.value ?: 0L), (errcode?.value ?: 0L))

public actual fun ldapPerror(ld: COpaquePointer?, msg: Pcstr) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapPerror((ld?.value ?: 0L), (msg?.value ?: 0L))
}

public actual fun ldapRenameExt(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapRenameExt((ld?.value ?: 0L), (dn?.value ?: 0L), (newrdn?.value ?: 0L), (newparent?.value ?: 0L), deleteoldrdn, (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapRenameExtA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapRenameExtA((ld?.value ?: 0L), (dn?.value ?: 0L), (newrdn?.value ?: 0L), (newparent?.value ?: 0L), deleteoldrdn, (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapRenameExtW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapRenameExtW((ld?.value ?: 0L), (dn?.value ?: 0L), (newrdn?.value ?: 0L), (newparent?.value ?: 0L), deleteoldrdn, (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapRenameExtS(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapRenameExtS((ld?.value ?: 0L), (dn?.value ?: 0L), (newrdn?.value ?: 0L), (newparent?.value ?: 0L), deleteoldrdn, (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapRenameExtSA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapRenameExtSA((ld?.value ?: 0L), (dn?.value ?: 0L), (newrdn?.value ?: 0L), (newparent?.value ?: 0L), deleteoldrdn, (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapRenameExtSW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapRenameExtSW((ld?.value ?: 0L), (dn?.value ?: 0L), (newrdn?.value ?: 0L), (newparent?.value ?: 0L), deleteoldrdn, (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapResult(ld: COpaquePointer?, msgid: UInt, all: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapResult((ld?.value ?: 0L), msgid.toInt(), all.toInt(), (timeout?.value ?: 0L), (res?.value ?: 0L)).toUInt()

public actual fun ldapResult2error(ld: COpaquePointer?, res: COpaquePointer?, freeit: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapResult2error((ld?.value ?: 0L), (res?.value ?: 0L), freeit.toInt()).toUInt()

public actual fun ldapSaslBindA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSaslBindA((externalhandle?.value ?: 0L), (distname?.value ?: 0L), (authmechanism?.value ?: 0L), (cred?.value ?: 0L), (serverctrls?.value ?: 0L), (clientctrls?.value ?: 0L), (messagenumber?.value ?: 0L))

public actual fun ldapSaslBindW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSaslBindW((externalhandle?.value ?: 0L), (distname?.value ?: 0L), (authmechanism?.value ?: 0L), (cred?.value ?: 0L), (serverctrls?.value ?: 0L), (clientctrls?.value ?: 0L), (messagenumber?.value ?: 0L))

public actual fun ldapSaslBindSA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSaslBindSA((externalhandle?.value ?: 0L), (distname?.value ?: 0L), (authmechanism?.value ?: 0L), (cred?.value ?: 0L), (serverctrls?.value ?: 0L), (clientctrls?.value ?: 0L), (serverdata?.value ?: 0L))

public actual fun ldapSaslBindSW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSaslBindSW((externalhandle?.value ?: 0L), (distname?.value ?: 0L), (authmechanism?.value ?: 0L), (cred?.value ?: 0L), (serverctrls?.value ?: 0L), (clientctrls?.value ?: 0L), (serverdata?.value ?: 0L))

public actual fun ldapSearch(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearch((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt()).toUInt()

public actual fun ldapSearchA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchA((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt()).toUInt()

public actual fun ldapSearchW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchW((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt()).toUInt()

public actual fun ldapSearchAbandonPage(externalhandle: COpaquePointer?, searchblock: PLDAPSearch): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchAbandonPage((externalhandle?.value ?: 0L), searchblock.toLong()).toUInt()

public actual fun ldapSearchExt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchExt((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), timelimit.toInt(), sizelimit.toInt(), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapSearchExtA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchExtA((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), timelimit.toInt(), sizelimit.toInt(), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapSearchExtW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchExtW((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), timelimit.toInt(), sizelimit.toInt(), (messagenumber?.value ?: 0L)).toUInt()

public actual fun ldapSearchExtS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchExtS((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (timeout?.value ?: 0L), sizelimit.toInt(), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchExtSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchExtSA((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (timeout?.value ?: 0L), sizelimit.toInt(), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchExtSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchExtSW((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), (timeout?.value ?: 0L), sizelimit.toInt(), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchInitPage(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchInitPage((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), scopeofsearch.toInt(), (searchfilter?.value ?: 0L), (attributelist?.value ?: 0L), attributesonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), pagetimelimit.toInt(), totalsizelimit.toInt(), (sortkeys?.value ?: 0L))

public actual fun ldapSearchInitPageA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchInitPageA((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), scopeofsearch.toInt(), (searchfilter?.value ?: 0L), (attributelist?.value ?: 0L), attributesonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), pagetimelimit.toInt(), totalsizelimit.toInt(), (sortkeys?.value ?: 0L))

public actual fun ldapSearchInitPageW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchInitPageW((externalhandle?.value ?: 0L), (distinguishedname?.value ?: 0L), scopeofsearch.toInt(), (searchfilter?.value ?: 0L), (attributelist?.value ?: 0L), attributesonly.toInt(), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L), pagetimelimit.toInt(), totalsizelimit.toInt(), (sortkeys?.value ?: 0L))

public actual fun ldapSearchS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchS((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchSA((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchSW((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchSt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchSt((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (timeout?.value ?: 0L), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchStA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchStA((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (timeout?.value ?: 0L), (res?.value ?: 0L)).toUInt()

public actual fun ldapSearchStW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSearchStW((ld?.value ?: 0L), (base?.value ?: 0L), scope.toInt(), (filter?.value ?: 0L), (attrs?.value ?: 0L), attrsonly.toInt(), (timeout?.value ?: 0L), (res?.value ?: 0L)).toUInt()

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSetDbgFlags(newflags.toInt()).toUInt()

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSetDbgRoutine(0L)
}

public actual fun ldapSetOption(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSetOption((ld?.value ?: 0L), option, (invalue?.value ?: 0L)).toUInt()

public actual fun ldapSetOptionW(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSetOptionW((ld?.value ?: 0L), option, (invalue?.value ?: 0L)).toUInt()

public actual fun ldapSimpleBind(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSimpleBind((ld?.value ?: 0L), (dn?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun ldapSimpleBindA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSimpleBindA((ld?.value ?: 0L), (dn?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun ldapSimpleBindW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSimpleBindW((ld?.value ?: 0L), (dn?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun ldapSimpleBindS(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSimpleBindS((ld?.value ?: 0L), (dn?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun ldapSimpleBindSA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSimpleBindSA((ld?.value ?: 0L), (dn?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun ldapSimpleBindSW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSimpleBindSW((ld?.value ?: 0L), (dn?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSslinit((hostname?.value ?: 0L), portnumber.toInt(), secure).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSslinitA((hostname?.value ?: 0L), portnumber.toInt(), secure).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): COpaquePointer? =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapSslinitW((hostname?.value ?: 0L), portnumber.toInt(), secure).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ldapStartTlsSA(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapStartTlsSA((externalhandle?.value ?: 0L), (serverreturnvalue?.value ?: 0L), (result?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapStartTlsSW(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapStartTlsSW((externalhandle?.value ?: 0L), (serverreturnvalue?.value ?: 0L), (result?.value ?: 0L), (servercontrols?.value ?: 0L), (clientcontrols?.value ?: 0L)).toUInt()

public actual fun ldapStartup(version: COpaquePointer?, instance: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapStartup((version?.value ?: 0L), (instance?.value ?: 0L)).toUInt()

public actual fun ldapStopTlsS(externalhandle: COpaquePointer?): Boolean =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapStopTlsS((externalhandle?.value ?: 0L))

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapUfn2dn((ufn?.value ?: 0L), (pdn?.value ?: 0L)).toUInt()

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapUfn2dnA((ufn?.value ?: 0L), (pdn?.value ?: 0L)).toUInt()

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapUfn2dnW((ufn?.value ?: 0L), (pdn?.value ?: 0L)).toUInt()

public actual fun ldapUnbind(ld: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapUnbind((ld?.value ?: 0L)).toUInt()

public actual fun ldapUnbindS(ld: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapUnbindS((ld?.value ?: 0L)).toUInt()

public actual fun ldapValueFree(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapValueFree((vals?.value ?: 0L)).toUInt()

public actual fun ldapValueFreeA(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapValueFreeA((vals?.value ?: 0L)).toUInt()

public actual fun ldapValueFreeW(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapValueFreeW((vals?.value ?: 0L)).toUInt()

public actual fun ldapValueFreeLen(vals: COpaquePointer?): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldapValueFreeLen((vals?.value ?: 0L)).toUInt()
