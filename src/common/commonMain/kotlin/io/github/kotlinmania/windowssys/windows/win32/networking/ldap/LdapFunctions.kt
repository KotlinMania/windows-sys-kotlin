package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.COpaquePointer
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

public expect fun berAllocT(options: Int): COpaquePointer?

public expect fun berBvdup(pberval: COpaquePointer?): COpaquePointer?

public expect fun berBvecfree(pberval: COpaquePointer?)

public expect fun berBvfree(bv: COpaquePointer?)

public expect fun berFirstElement(pberelement: COpaquePointer?, plen: COpaquePointer?, ppopaque: COpaquePointer?): UInt

public expect fun berFlatten(pberelement: COpaquePointer?, pberval: COpaquePointer?): Int

public expect fun berFree(pberelement: COpaquePointer?, fbuf: Int)

public expect fun berInit(pberval: COpaquePointer?): COpaquePointer?

public expect fun berNextElement(pberelement: COpaquePointer?, plen: COpaquePointer?, opaque: Pcstr): UInt

public expect fun berPeekTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt

public expect fun berPrintf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): Int

public expect fun berScanf(pberelement: COpaquePointer?, fmt: Pcstr, vararg variadicArgs: Long): UInt

public expect fun berSkipTag(pberelement: COpaquePointer?, plen: COpaquePointer?): UInt

public expect fun cldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer?

public expect fun cldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer?

public expect fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer?

public expect fun ldapAbandon(ld: COpaquePointer?, msgid: UInt): UInt

public expect fun ldapAdd(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt

public expect fun ldapAddA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt

public expect fun ldapAddW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt

public expect fun ldapAddExt(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapAddExtA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapAddExtW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapAddExtS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapAddExtSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapAddExtSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapAddS(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt

public expect fun ldapAddSA(ld: COpaquePointer?, dn: Pcstr, attrs: COpaquePointer?): UInt

public expect fun ldapAddSW(ld: COpaquePointer?, dn: Pcwstr, attrs: COpaquePointer?): UInt

public expect fun ldapBind(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt

public expect fun ldapBindS(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindSA(ld: COpaquePointer?, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindSW(ld: COpaquePointer?, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt

public expect fun ldapCheckFilterA(ld: COpaquePointer?, searchfilter: Pcstr): UInt

public expect fun ldapCheckFilterW(ld: COpaquePointer?, searchfilter: Pcwstr): UInt

public expect fun ldapCleanup(hinstance: Handle): UInt

public expect fun ldapCloseExtendedOp(ld: COpaquePointer?, messagenumber: UInt): UInt

public expect fun ldapCompare(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt

public expect fun ldapCompareExt(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapCompareExtA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapCompareExtW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapCompareExtS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapCompareExtSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapCompareExtSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapCompareS(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareSA(ld: COpaquePointer?, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareSW(ld: COpaquePointer?, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt

public expect fun ldapConnFromMsg(primaryconn: COpaquePointer?, res: COpaquePointer?): COpaquePointer?

public expect fun ldapConnect(ld: COpaquePointer?, timeout: COpaquePointer?): UInt

public expect fun ldapControlFree(control: COpaquePointer?): UInt

public expect fun ldapControlFreeA(controls: COpaquePointer?): UInt

public expect fun ldapControlFreeW(control: COpaquePointer?): UInt

public expect fun ldapControlsFree(controls: COpaquePointer?): UInt

public expect fun ldapControlsFreeA(controls: COpaquePointer?): UInt

public expect fun ldapControlsFreeW(control: COpaquePointer?): UInt

public expect fun ldapCountEntries(ld: COpaquePointer?, res: COpaquePointer?): UInt

public expect fun ldapCountReferences(ld: COpaquePointer?, res: COpaquePointer?): UInt

public expect fun ldapCountValues(vals: COpaquePointer?): UInt

public expect fun ldapCountValuesA(vals: COpaquePointer?): UInt

public expect fun ldapCountValuesW(vals: COpaquePointer?): UInt

public expect fun ldapCountValuesLen(vals: COpaquePointer?): UInt

public expect fun ldapCreatePageControl(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt

public expect fun ldapCreatePageControlA(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt

public expect fun ldapCreatePageControlW(externalhandle: COpaquePointer?, pagesize: UInt, cookie: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt

public expect fun ldapCreateSortControl(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt

public expect fun ldapCreateSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt

public expect fun ldapCreateSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): UInt

public expect fun ldapCreateVlvControlA(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int

public expect fun ldapCreateVlvControlW(externalhandle: COpaquePointer?, vlvinfo: COpaquePointer?, iscritical: UByte, control: COpaquePointer?): Int

public expect fun ldapDelete(ld: COpaquePointer?, dn: Pcstr): UInt

public expect fun ldapDeleteA(ld: COpaquePointer?, dn: Pcstr): UInt

public expect fun ldapDeleteW(ld: COpaquePointer?, dn: Pcwstr): UInt

public expect fun ldapDeleteExt(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapDeleteExtA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapDeleteExtW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapDeleteExtS(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapDeleteExtSA(ld: COpaquePointer?, dn: Pcstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapDeleteExtSW(ld: COpaquePointer?, dn: Pcwstr, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapDeleteS(ld: COpaquePointer?, dn: Pcstr): UInt

public expect fun ldapDeleteSA(ld: COpaquePointer?, dn: Pcstr): UInt

public expect fun ldapDeleteSW(ld: COpaquePointer?, dn: Pcwstr): UInt

public expect fun ldapDn2ufn(dn: Pcstr): Pstr

public expect fun ldapDn2ufnA(dn: Pcstr): Pstr

public expect fun ldapDn2ufnW(dn: Pcwstr): Pwstr

public expect fun ldapEncodeSortControlA(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt

public expect fun ldapEncodeSortControlW(externalhandle: COpaquePointer?, sortkeys: COpaquePointer?, control: COpaquePointer?, criticality: Boolean): UInt

public expect fun ldapErr2string(err: UInt): Pstr

public expect fun ldapErr2stringA(err: UInt): Pstr

public expect fun ldapErr2stringW(err: UInt): Pwstr

public expect fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt

public expect fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt

public expect fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt

public expect fun ldapExplodeDn(dn: Pcstr, notypes: UInt): COpaquePointer?

public expect fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): COpaquePointer?

public expect fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): COpaquePointer?

public expect fun ldapExtendedOperation(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapExtendedOperationA(ld: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapExtendedOperationW(ld: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapExtendedOperationSA(externalhandle: COpaquePointer?, oid: Pcstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt

public expect fun ldapExtendedOperationSW(externalhandle: COpaquePointer?, oid: Pcwstr, data: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, returnedoid: COpaquePointer?, returneddata: COpaquePointer?): UInt

public expect fun ldapFirstAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr

public expect fun ldapFirstAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr

public expect fun ldapFirstAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr

public expect fun ldapFirstEntry(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer?

public expect fun ldapFirstReference(ld: COpaquePointer?, res: COpaquePointer?): COpaquePointer?

public expect fun ldapFreeControls(controls: COpaquePointer?): UInt

public expect fun ldapFreeControlsA(controls: COpaquePointer?): UInt

public expect fun ldapFreeControlsW(controls: COpaquePointer?): UInt

public expect fun ldapGetDn(ld: COpaquePointer?, entry: COpaquePointer?): Pstr

public expect fun ldapGetDnA(ld: COpaquePointer?, entry: COpaquePointer?): Pstr

public expect fun ldapGetDnW(ld: COpaquePointer?, entry: COpaquePointer?): Pwstr

public expect fun ldapGetNextPage(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: COpaquePointer?): UInt

public expect fun ldapGetNextPageS(externalhandle: COpaquePointer?, searchhandle: PLDAPSearch, timeout: COpaquePointer?, pagesize: UInt, totalcount: COpaquePointer?, results: COpaquePointer?): UInt

public expect fun ldapGetOption(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt

public expect fun ldapGetOptionW(ld: COpaquePointer?, option: Int, outvalue: COpaquePointer?): UInt

public expect fun ldapGetPagedCount(externalhandle: COpaquePointer?, searchblock: PLDAPSearch, totalcount: COpaquePointer?, results: COpaquePointer?): UInt

public expect fun ldapGetValues(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer?

public expect fun ldapGetValuesA(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcstr): COpaquePointer?

public expect fun ldapGetValuesW(ld: COpaquePointer?, entry: COpaquePointer?, attr: Pcwstr): COpaquePointer?

public expect fun ldapGetValuesLen(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer?

public expect fun ldapGetValuesLenA(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcstr): COpaquePointer?

public expect fun ldapGetValuesLenW(externalhandle: COpaquePointer?, message: COpaquePointer?, attr: Pcwstr): COpaquePointer?

public expect fun ldapInit(hostname: Pcstr, portnumber: UInt): COpaquePointer?

public expect fun ldapInitA(hostname: Pcstr, portnumber: UInt): COpaquePointer?

public expect fun ldapInitW(hostname: Pcwstr, portnumber: UInt): COpaquePointer?

public expect fun ldapMemfree(block: Pcstr)

public expect fun ldapMemfreeA(block: Pcstr)

public expect fun ldapMemfreeW(block: Pcwstr)

public expect fun ldapModify(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt

public expect fun ldapModifyA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt

public expect fun ldapModifyW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt

public expect fun ldapModifyExt(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapModifyExtA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapModifyExtW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapModifyExtS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapModifyExtSA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapModifyExtSW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapModifyS(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt

public expect fun ldapModifySA(ld: COpaquePointer?, dn: Pcstr, mods: COpaquePointer?): UInt

public expect fun ldapModifySW(ld: COpaquePointer?, dn: Pcwstr, mods: COpaquePointer?): UInt

public expect fun ldapModrdn(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdn2(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2A(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2W(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2S(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2SA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2SW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdnA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt

public expect fun ldapModrdnS(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnSA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnSW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt

public expect fun ldapMsgfree(res: COpaquePointer?): UInt

public expect fun ldapNextAttribute(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr

public expect fun ldapNextAttributeA(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pstr

public expect fun ldapNextAttributeW(ld: COpaquePointer?, entry: COpaquePointer?, ptr: COpaquePointer?): Pwstr

public expect fun ldapNextEntry(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer?

public expect fun ldapNextReference(ld: COpaquePointer?, entry: COpaquePointer?): COpaquePointer?

public expect fun ldapOpen(hostname: Pcstr, portnumber: UInt): COpaquePointer?

public expect fun ldapOpenA(hostname: Pcstr, portnumber: UInt): COpaquePointer?

public expect fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): COpaquePointer?

public expect fun ldapParseExtendedResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt

public expect fun ldapParseExtendedResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, resultoid: COpaquePointer?, resultdata: COpaquePointer?, freeit: Boolean): UInt

public expect fun ldapParsePageControl(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt

public expect fun ldapParsePageControlA(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt

public expect fun ldapParsePageControlW(externalhandle: COpaquePointer?, servercontrols: COpaquePointer?, totalcount: COpaquePointer?, cookie: COpaquePointer?): UInt

public expect fun ldapParseReference(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt

public expect fun ldapParseReferenceA(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt

public expect fun ldapParseReferenceW(connection: COpaquePointer?, resultmessage: COpaquePointer?, referrals: COpaquePointer?): UInt

public expect fun ldapParseResult(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt

public expect fun ldapParseResultA(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt

public expect fun ldapParseResultW(connection: COpaquePointer?, resultmessage: COpaquePointer?, returncode: COpaquePointer?, matcheddns: COpaquePointer?, errormessage: COpaquePointer?, referrals: COpaquePointer?, servercontrols: COpaquePointer?, freeit: Boolean): UInt

public expect fun ldapParseSortControl(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt

public expect fun ldapParseSortControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt

public expect fun ldapParseSortControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, result: COpaquePointer?, attribute: COpaquePointer?): UInt

public expect fun ldapParseVlvControlA(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int

public expect fun ldapParseVlvControlW(externalhandle: COpaquePointer?, control: COpaquePointer?, targetpos: COpaquePointer?, listcount: COpaquePointer?, context: COpaquePointer?, errcode: COpaquePointer?): Int

public expect fun ldapPerror(ld: COpaquePointer?, msg: Pcstr)

public expect fun ldapRenameExt(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapRenameExtA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapRenameExtW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, messagenumber: COpaquePointer?): UInt

public expect fun ldapRenameExtS(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapRenameExtSA(ld: COpaquePointer?, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapRenameExtSW(ld: COpaquePointer?, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapResult(ld: COpaquePointer?, msgid: UInt, all: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt

public expect fun ldapResult2error(ld: COpaquePointer?, res: COpaquePointer?, freeit: UInt): UInt

public expect fun ldapSaslBindA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int

public expect fun ldapSaslBindW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, messagenumber: COpaquePointer?): Int

public expect fun ldapSaslBindSA(externalhandle: COpaquePointer?, distname: Pcstr, authmechanism: Pcstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int

public expect fun ldapSaslBindSW(externalhandle: COpaquePointer?, distname: Pcwstr, authmechanism: Pcwstr, cred: COpaquePointer?, serverctrls: COpaquePointer?, clientctrls: COpaquePointer?, serverdata: COpaquePointer?): Int

public expect fun ldapSearch(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt

public expect fun ldapSearchA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt): UInt

public expect fun ldapSearchW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt): UInt

public expect fun ldapSearchAbandonPage(externalhandle: COpaquePointer?, searchblock: PLDAPSearch): UInt

public expect fun ldapSearchExt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt

public expect fun ldapSearchExtA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt

public expect fun ldapSearchExtW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timelimit: UInt, sizelimit: UInt, messagenumber: COpaquePointer?): UInt

public expect fun ldapSearchExtS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt

public expect fun ldapSearchExtSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt

public expect fun ldapSearchExtSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, timeout: COpaquePointer?, sizelimit: UInt, res: COpaquePointer?): UInt

public expect fun ldapSearchInitPage(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch

public expect fun ldapSearchInitPageA(externalhandle: COpaquePointer?, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch

public expect fun ldapSearchInitPageW(externalhandle: COpaquePointer?, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: COpaquePointer?, attributesonly: UInt, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: COpaquePointer?): PLDAPSearch

public expect fun ldapSearchS(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt

public expect fun ldapSearchSA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt

public expect fun ldapSearchSW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, res: COpaquePointer?): UInt

public expect fun ldapSearchSt(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt

public expect fun ldapSearchStA(ld: COpaquePointer?, base: Pcstr, scope: UInt, filter: Pcstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt

public expect fun ldapSearchStW(ld: COpaquePointer?, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: COpaquePointer?, attrsonly: UInt, timeout: COpaquePointer?, res: COpaquePointer?): UInt

public expect fun ldapSetDbgFlags(newflags: UInt): UInt

public expect fun ldapSetDbgRoutine(debugprintroutine: Dbgprint)

public expect fun ldapSetOption(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt

public expect fun ldapSetOptionW(ld: COpaquePointer?, option: Int, invalue: COpaquePointer?): UInt

public expect fun ldapSimpleBind(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt

public expect fun ldapSimpleBindS(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindSA(ld: COpaquePointer?, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindSW(ld: COpaquePointer?, dn: Pcwstr, passwd: Pcwstr): UInt

public expect fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer?

public expect fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): COpaquePointer?

public expect fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): COpaquePointer?

public expect fun ldapStartTlsSA(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapStartTlsSW(externalhandle: COpaquePointer?, serverreturnvalue: COpaquePointer?, result: COpaquePointer?, servercontrols: COpaquePointer?, clientcontrols: COpaquePointer?): UInt

public expect fun ldapStartup(version: COpaquePointer?, instance: COpaquePointer?): UInt

public expect fun ldapStopTlsS(externalhandle: COpaquePointer?): Boolean

public expect fun ldapUfn2dn(ufn: Pcstr, pdn: COpaquePointer?): UInt

public expect fun ldapUfn2dnA(ufn: Pcstr, pdn: COpaquePointer?): UInt

public expect fun ldapUfn2dnW(ufn: Pcwstr, pdn: COpaquePointer?): UInt

public expect fun ldapUnbind(ld: COpaquePointer?): UInt

public expect fun ldapUnbindS(ld: COpaquePointer?): UInt

public expect fun ldapValueFree(vals: COpaquePointer?): UInt

public expect fun ldapValueFreeA(vals: COpaquePointer?): UInt

public expect fun ldapValueFreeW(vals: COpaquePointer?): UInt

public expect fun ldapValueFreeLen(vals: COpaquePointer?): UInt
