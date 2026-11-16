package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun ldapGetLastError(): UInt

public expect fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error

public expect fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun berAllocT(options: Int): MutPtr

public expect fun berBvdup(pberval: MutPtr): MutPtr

public expect fun berBvecfree(pberval: MutPtr)

public expect fun berBvfree(bv: MutPtr)

public expect fun berFirstElement(pberelement: MutPtr, plen: MutPtr, ppopaque: MutPtr): UInt

public expect fun berFlatten(pberelement: MutPtr, pberval: MutPtr): Int

public expect fun berFree(pberelement: MutPtr, fbuf: Int)

public expect fun berInit(pberval: MutPtr): MutPtr

public expect fun berNextElement(pberelement: MutPtr, plen: MutPtr, opaque: Pcstr): UInt

public expect fun berPeekTag(pberelement: MutPtr, plen: MutPtr): UInt

public expect fun berPrintf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): Int

public expect fun berScanf(pberelement: MutPtr, fmt: Pcstr, vararg variadicArgs: Long): UInt

public expect fun berSkipTag(pberelement: MutPtr, plen: MutPtr): UInt

public expect fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr

public expect fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr

public expect fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr

public expect fun ldapAbandon(ld: MutPtr, msgid: UInt): UInt

public expect fun ldapAdd(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt

public expect fun ldapAddA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt

public expect fun ldapAddW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt

public expect fun ldapAddExt(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapAddExtA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapAddExtW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapAddExtS(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapAddExtSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapAddExtSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapAddS(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt

public expect fun ldapAddSA(ld: MutPtr, dn: Pcstr, attrs: MutPtr): UInt

public expect fun ldapAddSW(ld: MutPtr, dn: Pcwstr, attrs: MutPtr): UInt

public expect fun ldapBind(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt

public expect fun ldapBindS(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindSA(ld: MutPtr, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindSW(ld: MutPtr, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt

public expect fun ldapCheckFilterA(ld: MutPtr, searchfilter: Pcstr): UInt

public expect fun ldapCheckFilterW(ld: MutPtr, searchfilter: Pcwstr): UInt

public expect fun ldapCleanup(hinstance: Handle): UInt

public expect fun ldapCloseExtendedOp(ld: MutPtr, messagenumber: UInt): UInt

public expect fun ldapCompare(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt

public expect fun ldapCompareExt(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapCompareExtA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapCompareExtW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapCompareExtS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapCompareExtSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapCompareExtSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapCompareS(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareSA(ld: MutPtr, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareSW(ld: MutPtr, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt

public expect fun ldapConnFromMsg(primaryconn: MutPtr, res: MutPtr): MutPtr

public expect fun ldapConnect(ld: MutPtr, timeout: MutPtr): UInt

public expect fun ldapControlFree(control: MutPtr): UInt

public expect fun ldapControlFreeA(controls: MutPtr): UInt

public expect fun ldapControlFreeW(control: MutPtr): UInt

public expect fun ldapControlsFree(controls: MutPtr): UInt

public expect fun ldapControlsFreeA(controls: MutPtr): UInt

public expect fun ldapControlsFreeW(control: MutPtr): UInt

public expect fun ldapCountEntries(ld: MutPtr, res: MutPtr): UInt

public expect fun ldapCountReferences(ld: MutPtr, res: MutPtr): UInt

public expect fun ldapCountValues(vals: ConstPtr): UInt

public expect fun ldapCountValuesA(vals: ConstPtr): UInt

public expect fun ldapCountValuesW(vals: ConstPtr): UInt

public expect fun ldapCountValuesLen(vals: MutPtr): UInt

public expect fun ldapCreatePageControl(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt

public expect fun ldapCreatePageControlA(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt

public expect fun ldapCreatePageControlW(externalhandle: MutPtr, pagesize: UInt, cookie: MutPtr, iscritical: UByte, control: MutPtr): UInt

public expect fun ldapCreateSortControl(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt

public expect fun ldapCreateSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt

public expect fun ldapCreateSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, iscritical: UByte, control: MutPtr): UInt

public expect fun ldapCreateVlvControlA(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int

public expect fun ldapCreateVlvControlW(externalhandle: MutPtr, vlvinfo: MutPtr, iscritical: UByte, control: MutPtr): Int

public expect fun ldapDelete(ld: MutPtr, dn: Pcstr): UInt

public expect fun ldapDeleteA(ld: MutPtr, dn: Pcstr): UInt

public expect fun ldapDeleteW(ld: MutPtr, dn: Pcwstr): UInt

public expect fun ldapDeleteExt(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapDeleteExtA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapDeleteExtW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapDeleteExtS(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapDeleteExtSA(ld: MutPtr, dn: Pcstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapDeleteExtSW(ld: MutPtr, dn: Pcwstr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapDeleteS(ld: MutPtr, dn: Pcstr): UInt

public expect fun ldapDeleteSA(ld: MutPtr, dn: Pcstr): UInt

public expect fun ldapDeleteSW(ld: MutPtr, dn: Pcwstr): UInt

public expect fun ldapDn2ufn(dn: Pcstr): Pstr

public expect fun ldapDn2ufnA(dn: Pcstr): Pstr

public expect fun ldapDn2ufnW(dn: Pcwstr): Pwstr

public expect fun ldapEncodeSortControlA(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt

public expect fun ldapEncodeSortControlW(externalhandle: MutPtr, sortkeys: MutPtr, control: MutPtr, criticality: Boolean): UInt

public expect fun ldapErr2string(err: UInt): Pstr

public expect fun ldapErr2stringA(err: UInt): Pstr

public expect fun ldapErr2stringW(err: UInt): Pwstr

public expect fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt

public expect fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt

public expect fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt

public expect fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr

public expect fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr

public expect fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr

public expect fun ldapExtendedOperation(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapExtendedOperationA(ld: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapExtendedOperationW(ld: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapExtendedOperationSA(externalhandle: MutPtr, oid: Pcstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt

public expect fun ldapExtendedOperationSW(externalhandle: MutPtr, oid: Pcwstr, data: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, returnedoid: MutPtr, returneddata: MutPtr): UInt

public expect fun ldapFirstAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr

public expect fun ldapFirstAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr

public expect fun ldapFirstAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr

public expect fun ldapFirstEntry(ld: MutPtr, res: MutPtr): MutPtr

public expect fun ldapFirstReference(ld: MutPtr, res: MutPtr): MutPtr

public expect fun ldapFreeControls(controls: MutPtr): UInt

public expect fun ldapFreeControlsA(controls: MutPtr): UInt

public expect fun ldapFreeControlsW(controls: MutPtr): UInt

public expect fun ldapGetDn(ld: MutPtr, entry: MutPtr): Pstr

public expect fun ldapGetDnA(ld: MutPtr, entry: MutPtr): Pstr

public expect fun ldapGetDnW(ld: MutPtr, entry: MutPtr): Pwstr

public expect fun ldapGetNextPage(externalhandle: MutPtr, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr): UInt

public expect fun ldapGetNextPageS(externalhandle: MutPtr, searchhandle: PLDAPSearch, timeout: MutPtr, pagesize: UInt, totalcount: MutPtr, results: MutPtr): UInt

public expect fun ldapGetOption(ld: MutPtr, option: Int, outvalue: MutPtr): UInt

public expect fun ldapGetOptionW(ld: MutPtr, option: Int, outvalue: MutPtr): UInt

public expect fun ldapGetPagedCount(externalhandle: MutPtr, searchblock: PLDAPSearch, totalcount: MutPtr, results: MutPtr): UInt

public expect fun ldapGetValues(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr

public expect fun ldapGetValuesA(ld: MutPtr, entry: MutPtr, attr: Pcstr): MutPtr

public expect fun ldapGetValuesW(ld: MutPtr, entry: MutPtr, attr: Pcwstr): MutPtr

public expect fun ldapGetValuesLen(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr

public expect fun ldapGetValuesLenA(externalhandle: MutPtr, message: MutPtr, attr: Pcstr): MutPtr

public expect fun ldapGetValuesLenW(externalhandle: MutPtr, message: MutPtr, attr: Pcwstr): MutPtr

public expect fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr

public expect fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr

public expect fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr

public expect fun ldapMemfree(block: Pcstr)

public expect fun ldapMemfreeA(block: Pcstr)

public expect fun ldapMemfreeW(block: Pcwstr)

public expect fun ldapModify(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt

public expect fun ldapModifyA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt

public expect fun ldapModifyW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt

public expect fun ldapModifyExt(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapModifyExtA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapModifyExtW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapModifyExtS(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapModifyExtSA(ld: MutPtr, dn: Pcstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapModifyExtSW(ld: MutPtr, dn: Pcwstr, mods: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapModifyS(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt

public expect fun ldapModifySA(ld: MutPtr, dn: Pcstr, mods: MutPtr): UInt

public expect fun ldapModifySW(ld: MutPtr, dn: Pcwstr, mods: MutPtr): UInt

public expect fun ldapModrdn(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdn2(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2A(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2W(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2S(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2SA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2SW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdnA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt

public expect fun ldapModrdnS(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnSA(externalhandle: MutPtr, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnSW(externalhandle: MutPtr, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt

public expect fun ldapMsgfree(res: MutPtr): UInt

public expect fun ldapNextAttribute(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr

public expect fun ldapNextAttributeA(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pstr

public expect fun ldapNextAttributeW(ld: MutPtr, entry: MutPtr, ptr: MutPtr): Pwstr

public expect fun ldapNextEntry(ld: MutPtr, entry: MutPtr): MutPtr

public expect fun ldapNextReference(ld: MutPtr, entry: MutPtr): MutPtr

public expect fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr

public expect fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr

public expect fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr

public expect fun ldapParseExtendedResultA(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt

public expect fun ldapParseExtendedResultW(connection: MutPtr, resultmessage: MutPtr, resultoid: MutPtr, resultdata: MutPtr, freeit: Boolean): UInt

public expect fun ldapParsePageControl(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt

public expect fun ldapParsePageControlA(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt

public expect fun ldapParsePageControlW(externalhandle: MutPtr, servercontrols: MutPtr, totalcount: MutPtr, cookie: MutPtr): UInt

public expect fun ldapParseReference(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt

public expect fun ldapParseReferenceA(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt

public expect fun ldapParseReferenceW(connection: MutPtr, resultmessage: MutPtr, referrals: MutPtr): UInt

public expect fun ldapParseResult(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt

public expect fun ldapParseResultA(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt

public expect fun ldapParseResultW(connection: MutPtr, resultmessage: MutPtr, returncode: MutPtr, matcheddns: MutPtr, errormessage: MutPtr, referrals: MutPtr, servercontrols: MutPtr, freeit: Boolean): UInt

public expect fun ldapParseSortControl(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt

public expect fun ldapParseSortControlA(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt

public expect fun ldapParseSortControlW(externalhandle: MutPtr, control: MutPtr, result: MutPtr, attribute: MutPtr): UInt

public expect fun ldapParseVlvControlA(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int

public expect fun ldapParseVlvControlW(externalhandle: MutPtr, control: MutPtr, targetpos: MutPtr, listcount: MutPtr, context: MutPtr, errcode: MutPtr): Int

public expect fun ldapPerror(ld: MutPtr, msg: Pcstr)

public expect fun ldapRenameExt(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapRenameExtA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapRenameExtW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr, messagenumber: MutPtr): UInt

public expect fun ldapRenameExtS(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapRenameExtSA(ld: MutPtr, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapRenameExtSW(ld: MutPtr, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapResult(ld: MutPtr, msgid: UInt, all: UInt, timeout: ConstPtr, res: MutPtr): UInt

public expect fun ldapResult2error(ld: MutPtr, res: MutPtr, freeit: UInt): UInt

public expect fun ldapSaslBindA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int

public expect fun ldapSaslBindW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, messagenumber: MutPtr): Int

public expect fun ldapSaslBindSA(externalhandle: MutPtr, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int

public expect fun ldapSaslBindSW(externalhandle: MutPtr, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr, serverctrls: MutPtr, clientctrls: MutPtr, serverdata: MutPtr): Int

public expect fun ldapSearch(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt

public expect fun ldapSearchA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt): UInt

public expect fun ldapSearchW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt): UInt

public expect fun ldapSearchAbandonPage(externalhandle: MutPtr, searchblock: PLDAPSearch): UInt

public expect fun ldapSearchExt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt

public expect fun ldapSearchExtA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt

public expect fun ldapSearchExtW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr): UInt

public expect fun ldapSearchExtS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt

public expect fun ldapSearchExtSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt

public expect fun ldapSearchExtSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, servercontrols: ConstPtr, clientcontrols: ConstPtr, timeout: MutPtr, sizelimit: UInt, res: MutPtr): UInt

public expect fun ldapSearchInitPage(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch

public expect fun ldapSearchInitPageA(externalhandle: MutPtr, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch

public expect fun ldapSearchInitPageW(externalhandle: MutPtr, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr, attributesonly: UInt, servercontrols: MutPtr, clientcontrols: MutPtr, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr): PLDAPSearch

public expect fun ldapSearchS(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt

public expect fun ldapSearchSA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt

public expect fun ldapSearchSW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, res: MutPtr): UInt

public expect fun ldapSearchSt(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt

public expect fun ldapSearchStA(ld: MutPtr, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt

public expect fun ldapSearchStW(ld: MutPtr, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr, attrsonly: UInt, timeout: MutPtr, res: MutPtr): UInt

public expect fun ldapSetDbgFlags(newflags: UInt): UInt

public expect fun ldapSetDbgRoutine(debugprintroutine: Dbgprint)

public expect fun ldapSetOption(ld: MutPtr, option: Int, invalue: ConstPtr): UInt

public expect fun ldapSetOptionW(ld: MutPtr, option: Int, invalue: ConstPtr): UInt

public expect fun ldapSimpleBind(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt

public expect fun ldapSimpleBindS(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindSA(ld: MutPtr, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindSW(ld: MutPtr, dn: Pcwstr, passwd: Pcwstr): UInt

public expect fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr

public expect fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr

public expect fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr

public expect fun ldapStartTlsSA(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapStartTlsSW(externalhandle: MutPtr, serverreturnvalue: MutPtr, result: MutPtr, servercontrols: MutPtr, clientcontrols: MutPtr): UInt

public expect fun ldapStartup(version: MutPtr, instance: MutPtr): UInt

public expect fun ldapStopTlsS(externalhandle: MutPtr): Boolean

public expect fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr): UInt

public expect fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr): UInt

public expect fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr): UInt

public expect fun ldapUnbind(ld: MutPtr): UInt

public expect fun ldapUnbindS(ld: MutPtr): UInt

public expect fun ldapValueFree(vals: ConstPtr): UInt

public expect fun ldapValueFreeA(vals: ConstPtr): UInt

public expect fun ldapValueFreeW(vals: ConstPtr): UInt

public expect fun ldapValueFreeLen(vals: MutPtr): UInt
