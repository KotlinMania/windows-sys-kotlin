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

public expect fun ldapGetLastError(): UInt

public expect fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error

public expect fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int

public expect fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int

public expect fun berAllocT(options: Int): MutPtr<BerElement>

public expect fun berBvdup(pberval: MutPtr<LdapBerval>): MutPtr<LdapBerval>

public expect fun berBvecfree(pberval: MutPtr<MutPtr<LdapBerval>>)

public expect fun berBvfree(bv: MutPtr<LdapBerval>)

public expect fun berFirstElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, ppopaque: MutPtr<MutPtr<Byte>>): UInt

public expect fun berFlatten(pberelement: MutPtr<BerElement>, pberval: MutPtr<MutPtr<LdapBerval>>): Int

public expect fun berFree(pberelement: MutPtr<BerElement>, fbuf: Int)

public expect fun berInit(pberval: MutPtr<LdapBerval>): MutPtr<BerElement>

public expect fun berNextElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, opaque: Pcstr): UInt

public expect fun berPeekTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt

public expect fun berPrintf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): Int

public expect fun berScanf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): UInt

public expect fun berSkipTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt

public expect fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap>

public expect fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap>

public expect fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap>

public expect fun ldapAbandon(ld: MutPtr<Ldap>, msgid: UInt): UInt

public expect fun ldapAdd(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapAddA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapAddW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt

public expect fun ldapAddExt(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapAddExtA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapAddExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapAddExtS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapAddExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapAddExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapAddS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapAddSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapAddSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt

public expect fun ldapBind(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt

public expect fun ldapBindS(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindSA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt

public expect fun ldapBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt

public expect fun ldapCheckFilterA(ld: MutPtr<Ldap>, searchfilter: Pcstr): UInt

public expect fun ldapCheckFilterW(ld: MutPtr<Ldap>, searchfilter: Pcwstr): UInt

public expect fun ldapCleanup(hinstance: Handle): UInt

public expect fun ldapCloseExtendedOp(ld: MutPtr<Ldap>, messagenumber: UInt): UInt

public expect fun ldapCompare(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt

public expect fun ldapCompareExt(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapCompareExtA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapCompareExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapCompareExtS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapCompareExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapCompareExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapCompareS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt

public expect fun ldapCompareSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt

public expect fun ldapConnFromMsg(primaryconn: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<Ldap>

public expect fun ldapConnect(ld: MutPtr<Ldap>, timeout: MutPtr<LdapTimeval>): UInt

public expect fun ldapControlFree(control: MutPtr<LDAPControlA>): UInt

public expect fun ldapControlFreeA(controls: MutPtr<LDAPControlA>): UInt

public expect fun ldapControlFreeW(control: MutPtr<LDAPControlW>): UInt

public expect fun ldapControlsFree(controls: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapControlsFreeA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapControlsFreeW(control: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapCountEntries(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt

public expect fun ldapCountReferences(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt

public expect fun ldapCountValues(vals: ConstPtr<Pcstr>): UInt

public expect fun ldapCountValuesA(vals: ConstPtr<Pcstr>): UInt

public expect fun ldapCountValuesW(vals: ConstPtr<Pcwstr>): UInt

public expect fun ldapCountValuesLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt

public expect fun ldapCreatePageControl(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapCreatePageControlA(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapCreatePageControlW(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapCreateSortControl(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapCreateSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapCreateSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapCreateVlvControlA(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): Int

public expect fun ldapCreateVlvControlW(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): Int

public expect fun ldapDelete(ld: MutPtr<Ldap>, dn: Pcstr): UInt

public expect fun ldapDeleteA(ld: MutPtr<Ldap>, dn: Pcstr): UInt

public expect fun ldapDeleteW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt

public expect fun ldapDeleteExt(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapDeleteExtA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapDeleteExtW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapDeleteExtS(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapDeleteExtSA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapDeleteExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapDeleteS(ld: MutPtr<Ldap>, dn: Pcstr): UInt

public expect fun ldapDeleteSA(ld: MutPtr<Ldap>, dn: Pcstr): UInt

public expect fun ldapDeleteSW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt

public expect fun ldapDn2ufn(dn: Pcstr): Pstr

public expect fun ldapDn2ufnA(dn: Pcstr): Pstr

public expect fun ldapDn2ufnW(dn: Pcwstr): Pwstr

public expect fun ldapEncodeSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, control: MutPtr<LDAPControlA>, criticality: Boolean): UInt

public expect fun ldapEncodeSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, control: MutPtr<LDAPControlW>, criticality: Boolean): UInt

public expect fun ldapErr2string(err: UInt): Pstr

public expect fun ldapErr2stringA(err: UInt): Pstr

public expect fun ldapErr2stringW(err: UInt): Pwstr

public expect fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt

public expect fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt

public expect fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt

public expect fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr<Pstr>

public expect fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr<Pstr>

public expect fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr<Pwstr>

public expect fun ldapExtendedOperation(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapExtendedOperationA(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapExtendedOperationW(ld: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapExtendedOperationSA(externalhandle: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, returnedoid: MutPtr<Pstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt

public expect fun ldapExtendedOperationSW(externalhandle: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, returnedoid: MutPtr<Pwstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt

public expect fun ldapFirstAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr

public expect fun ldapFirstAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr

public expect fun ldapFirstAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pwstr

public expect fun ldapFirstEntry(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage>

public expect fun ldapFirstReference(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage>

public expect fun ldapFreeControls(controls: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapFreeControlsA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapFreeControlsW(controls: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapGetDn(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr

public expect fun ldapGetDnA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr

public expect fun ldapGetDnW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pwstr

public expect fun ldapGetNextPage(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapGetNextPageS(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, timeout: MutPtr<LdapTimeval>, pagesize: UInt, totalcount: MutPtr<UInt>, results: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapGetOption(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt

public expect fun ldapGetOptionW(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt

public expect fun ldapGetPagedCount(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch, totalcount: MutPtr<UInt>, results: MutPtr<LDAPMessage>): UInt

public expect fun ldapGetValues(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr>

public expect fun ldapGetValuesA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr>

public expect fun ldapGetValuesW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<Pwstr>

public expect fun ldapGetValuesLen(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>>

public expect fun ldapGetValuesLenA(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>>

public expect fun ldapGetValuesLenW(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<MutPtr<LdapBerval>>

public expect fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap>

public expect fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap>

public expect fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap>

public expect fun ldapMemfree(block: Pcstr)

public expect fun ldapMemfreeA(block: Pcstr)

public expect fun ldapMemfreeW(block: Pcwstr)

public expect fun ldapModify(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapModifyA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapModifyW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt

public expect fun ldapModifyExt(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapModifyExtA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapModifyExtW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapModifyExtS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapModifyExtSA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapModifyExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapModifyS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapModifySA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt

public expect fun ldapModifySW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt

public expect fun ldapModrdn(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdn2(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2A(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2W(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2S(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2SA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdn2SW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt

public expect fun ldapModrdnA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt

public expect fun ldapModrdnS(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnSA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt

public expect fun ldapModrdnSW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt

public expect fun ldapMsgfree(res: MutPtr<LDAPMessage>): UInt

public expect fun ldapNextAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr

public expect fun ldapNextAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr

public expect fun ldapNextAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pwstr

public expect fun ldapNextEntry(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage>

public expect fun ldapNextReference(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage>

public expect fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap>

public expect fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap>

public expect fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap>

public expect fun ldapParseExtendedResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt

public expect fun ldapParseExtendedResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pwstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt

public expect fun ldapParsePageControl(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt

public expect fun ldapParsePageControlA(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt

public expect fun ldapParsePageControlW(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt

public expect fun ldapParseReference(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt

public expect fun ldapParseReferenceA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt

public expect fun ldapParseReferenceW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pwstr>>): UInt

public expect fun ldapParseResult(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<Pstr>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt

public expect fun ldapParseResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<MutPtr<Byte>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt

public expect fun ldapParseResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pwstr>, errormessage: MutPtr<Pwstr>, referrals: MutPtr<MutPtr<MutPtr<UShort>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlW>>>, freeit: Boolean): UInt

public expect fun ldapParseSortControl(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt

public expect fun ldapParseSortControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt

public expect fun ldapParseSortControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, result: MutPtr<UInt>, attribute: MutPtr<Pwstr>): UInt

public expect fun ldapParseVlvControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int

public expect fun ldapParseVlvControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int

public expect fun ldapPerror(ld: MutPtr<Ldap>, msg: Pcstr)

public expect fun ldapRenameExt(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapRenameExtA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapRenameExtW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapRenameExtS(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapRenameExtSA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapRenameExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapResult(ld: MutPtr<Ldap>, msgid: UInt, all: UInt, timeout: ConstPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapResult2error(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>, freeit: UInt): UInt

public expect fun ldapSaslBindA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<Int>): Int

public expect fun ldapSaslBindW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<Int>): Int

public expect fun ldapSaslBindSA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int

public expect fun ldapSaslBindSW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int

public expect fun ldapSearch(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt

public expect fun ldapSearchA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt

public expect fun ldapSearchW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt): UInt

public expect fun ldapSearchAbandonPage(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch): UInt

public expect fun ldapSearchExt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapSearchExtA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapSearchExtW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt

public expect fun ldapSearchExtS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchExtSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchExtSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchInitPage(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr<MutPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch

public expect fun ldapSearchInitPageA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr<ConstPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch

public expect fun ldapSearchInitPageW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr<ConstPtr<UShort>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>): PLDAPSearch

public expect fun ldapSearchS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchSt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchStA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSearchStW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt

public expect fun ldapSetDbgFlags(newflags: UInt): UInt

public expect fun ldapSetDbgRoutine(debugprintroutine: Dbgprint)

public expect fun ldapSetOption(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt

public expect fun ldapSetOptionW(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt

public expect fun ldapSimpleBind(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt

public expect fun ldapSimpleBindS(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindSA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt

public expect fun ldapSimpleBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt

public expect fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap>

public expect fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap>

public expect fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr<Ldap>

public expect fun ldapStartTlsSA(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt

public expect fun ldapStartTlsSW(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt

public expect fun ldapStartup(version: MutPtr<LdapVersionInfo>, instance: MutPtr<Handle>): UInt

public expect fun ldapStopTlsS(externalhandle: MutPtr<Ldap>): Boolean

public expect fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt

public expect fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt

public expect fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr<Pwstr>): UInt

public expect fun ldapUnbind(ld: MutPtr<Ldap>): UInt

public expect fun ldapUnbindS(ld: MutPtr<Ldap>): UInt

public expect fun ldapValueFree(vals: ConstPtr<Pcstr>): UInt

public expect fun ldapValueFreeA(vals: ConstPtr<Pcstr>): UInt

public expect fun ldapValueFreeW(vals: ConstPtr<Pcwstr>): UInt

public expect fun ldapValueFreeLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt
