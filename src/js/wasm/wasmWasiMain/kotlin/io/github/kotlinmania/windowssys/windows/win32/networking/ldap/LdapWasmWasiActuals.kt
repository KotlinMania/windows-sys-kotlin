@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public actual fun LdapGetLastError(): UInt =
    0u

public actual fun LdapMapErrorToWin32(ldaperror: UInt): WIN32_ERROR =
    0u

public actual fun LdapUTF8ToUnicode(lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    0

public actual fun LdapUnicodeToUTF8(lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    0

public actual fun ber_alloc_t(options: Int): Long =
    0L

public actual fun ber_bvdup(pberval: Long): Long =
    0L

public actual fun ber_bvecfree(pberval: Long) {
}

public actual fun ber_bvfree(bv: Long) {
}

public actual fun ber_first_element(pberelement: Long, plen: Long, ppopaque: Long): UInt =
    0u

public actual fun ber_flatten(pberelement: Long, pberval: Long): Int =
    0

public actual fun ber_free(pberelement: Long, fbuf: Int) {
}

public actual fun ber_init(pberval: Long): Long =
    0L

public actual fun ber_next_element(pberelement: Long, plen: Long, opaque: PCSTR): UInt =
    0u

public actual fun ber_peek_tag(pberelement: Long, plen: Long): UInt =
    0u

public actual fun ber_printf(pberelement: Long, fmt: PCSTR): Int =
    0

public actual fun ber_scanf(pberelement: Long, fmt: PCSTR): UInt =
    0u

public actual fun ber_skip_tag(pberelement: Long, plen: Long): UInt =
    0u

public actual fun cldap_open(hostname: PCSTR, portnumber: UInt): Long =
    0L

public actual fun cldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    0L

public actual fun cldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    0L

public actual fun ldap_abandon(ld: Long, msgid: UInt): UInt =
    0u

public actual fun ldap_add(ld: Long, dn: PCSTR, attrs: Long): UInt =
    0u

public actual fun ldap_addA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    0u

public actual fun ldap_addW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    0u

public actual fun ldap_add_ext(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_add_extA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_add_extW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_add_ext_s(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_add_ext_sA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_add_ext_sW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_add_s(ld: Long, dn: PCSTR, attrs: Long): UInt =
    0u

public actual fun ldap_add_sA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    0u

public actual fun ldap_add_sW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    0u

public actual fun ldap_bind(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    0u

public actual fun ldap_bindA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    0u

public actual fun ldap_bindW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    0u

public actual fun ldap_bind_s(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    0u

public actual fun ldap_bind_sA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    0u

public actual fun ldap_bind_sW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    0u

public actual fun ldap_check_filterA(ld: Long, searchfilter: PCSTR): UInt =
    0u

public actual fun ldap_check_filterW(ld: Long, searchfilter: PCWSTR): UInt =
    0u

public actual fun ldap_cleanup(hinstance: HANDLE): UInt =
    0u

public actual fun ldap_close_extended_op(ld: Long, messagenumber: UInt): UInt =
    0u

public actual fun ldap_compare(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    0u

public actual fun ldap_compareA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    0u

public actual fun ldap_compareW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    0u

public actual fun ldap_compare_ext(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_compare_extA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_compare_extW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_compare_ext_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_compare_ext_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_compare_ext_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_compare_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    0u

public actual fun ldap_compare_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    0u

public actual fun ldap_compare_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    0u

public actual fun ldap_conn_from_msg(primaryconn: Long, res: Long): Long =
    0L

public actual fun ldap_connect(ld: Long, timeout: Long): UInt =
    0u

public actual fun ldap_control_free(control: Long): UInt =
    0u

public actual fun ldap_control_freeA(controls: Long): UInt =
    0u

public actual fun ldap_control_freeW(control: Long): UInt =
    0u

public actual fun ldap_controls_free(controls: Long): UInt =
    0u

public actual fun ldap_controls_freeA(controls: Long): UInt =
    0u

public actual fun ldap_controls_freeW(control: Long): UInt =
    0u

public actual fun ldap_count_entries(ld: Long, res: Long): UInt =
    0u

public actual fun ldap_count_references(ld: Long, res: Long): UInt =
    0u

public actual fun ldap_count_values(vals: Long): UInt =
    0u

public actual fun ldap_count_valuesA(vals: Long): UInt =
    0u

public actual fun ldap_count_valuesW(vals: Long): UInt =
    0u

public actual fun ldap_count_values_len(vals: Long): UInt =
    0u

public actual fun ldap_create_page_control(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    0u

public actual fun ldap_create_page_controlA(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    0u

public actual fun ldap_create_page_controlW(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    0u

public actual fun ldap_create_sort_control(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    0u

public actual fun ldap_create_sort_controlA(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    0u

public actual fun ldap_create_sort_controlW(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    0u

public actual fun ldap_create_vlv_controlA(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    0

public actual fun ldap_create_vlv_controlW(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    0

public actual fun ldap_delete(ld: Long, dn: PCSTR): UInt =
    0u

public actual fun ldap_deleteA(ld: Long, dn: PCSTR): UInt =
    0u

public actual fun ldap_deleteW(ld: Long, dn: PCWSTR): UInt =
    0u

public actual fun ldap_delete_ext(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_delete_extA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_delete_extW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_delete_ext_s(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_delete_ext_sA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_delete_ext_sW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_delete_s(ld: Long, dn: PCSTR): UInt =
    0u

public actual fun ldap_delete_sA(ld: Long, dn: PCSTR): UInt =
    0u

public actual fun ldap_delete_sW(ld: Long, dn: PCWSTR): UInt =
    0u

public actual fun ldap_dn2ufn(dn: PCSTR): PSTR =
    0L

public actual fun ldap_dn2ufnA(dn: PCSTR): PSTR =
    0L

public actual fun ldap_dn2ufnW(dn: PCWSTR): PWSTR =
    0L

public actual fun ldap_encode_sort_controlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    0u

public actual fun ldap_encode_sort_controlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    0u

public actual fun ldap_err2string(err: UInt): PSTR =
    0L

public actual fun ldap_err2stringA(err: UInt): PSTR =
    0L

public actual fun ldap_err2stringW(err: UInt): PWSTR =
    0L

public actual fun ldap_escape_filter_element(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    0u

public actual fun ldap_escape_filter_elementA(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    0u

public actual fun ldap_escape_filter_elementW(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PWSTR, destlength: UInt): UInt =
    0u

public actual fun ldap_explode_dn(dn: PCSTR, notypes: UInt): Long =
    0L

public actual fun ldap_explode_dnA(dn: PCSTR, notypes: UInt): Long =
    0L

public actual fun ldap_explode_dnW(dn: PCWSTR, notypes: UInt): Long =
    0L

public actual fun ldap_extended_operation(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_extended_operationA(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_extended_operationW(ld: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_extended_operation_sA(externalhandle: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    0u

public actual fun ldap_extended_operation_sW(externalhandle: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    0u

public actual fun ldap_first_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    0L

public actual fun ldap_first_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    0L

public actual fun ldap_first_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    0L

public actual fun ldap_first_entry(ld: Long, res: Long): Long =
    0L

public actual fun ldap_first_reference(ld: Long, res: Long): Long =
    0L

public actual fun ldap_free_controls(controls: Long): UInt =
    0u

public actual fun ldap_free_controlsA(controls: Long): UInt =
    0u

public actual fun ldap_free_controlsW(controls: Long): UInt =
    0u

public actual fun ldap_get_dn(ld: Long, entry: Long): PSTR =
    0L

public actual fun ldap_get_dnA(ld: Long, entry: Long): PSTR =
    0L

public actual fun ldap_get_dnW(ld: Long, entry: Long): PWSTR =
    0L

public actual fun ldap_get_next_page(externalhandle: Long, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: Long): UInt =
    0u

public actual fun ldap_get_next_page_s(externalhandle: Long, searchhandle: PLDAPSearch, timeout: Long, pagesize: UInt, totalcount: Long, results: Long): UInt =
    0u

public actual fun ldap_get_option(ld: Long, option: Int, outvalue: Long): UInt =
    0u

public actual fun ldap_get_optionW(ld: Long, option: Int, outvalue: Long): UInt =
    0u

public actual fun ldap_get_paged_count(externalhandle: Long, searchblock: PLDAPSearch, totalcount: Long, results: Long): UInt =
    0u

public actual fun ldap_get_values(ld: Long, entry: Long, attr: PCSTR): Long =
    0L

public actual fun ldap_get_valuesA(ld: Long, entry: Long, attr: PCSTR): Long =
    0L

public actual fun ldap_get_valuesW(ld: Long, entry: Long, attr: PCWSTR): Long =
    0L

public actual fun ldap_get_values_len(externalhandle: Long, message: Long, attr: PCSTR): Long =
    0L

public actual fun ldap_get_values_lenA(externalhandle: Long, message: Long, attr: PCSTR): Long =
    0L

public actual fun ldap_get_values_lenW(externalhandle: Long, message: Long, attr: PCWSTR): Long =
    0L

public actual fun ldap_init(hostname: PCSTR, portnumber: UInt): Long =
    0L

public actual fun ldap_initA(hostname: PCSTR, portnumber: UInt): Long =
    0L

public actual fun ldap_initW(hostname: PCWSTR, portnumber: UInt): Long =
    0L

public actual fun ldap_memfree(block: PCSTR) {
}

public actual fun ldap_memfreeA(block: PCSTR) {
}

public actual fun ldap_memfreeW(block: PCWSTR) {
}

public actual fun ldap_modify(ld: Long, dn: PCSTR, mods: Long): UInt =
    0u

public actual fun ldap_modifyA(ld: Long, dn: PCSTR, mods: Long): UInt =
    0u

public actual fun ldap_modifyW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    0u

public actual fun ldap_modify_ext(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_modify_extA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_modify_extW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_modify_ext_s(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_modify_ext_sA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_modify_ext_sW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_modify_s(ld: Long, dn: PCSTR, mods: Long): UInt =
    0u

public actual fun ldap_modify_sA(ld: Long, dn: PCSTR, mods: Long): UInt =
    0u

public actual fun ldap_modify_sW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    0u

public actual fun ldap_modrdn(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    0u

public actual fun ldap_modrdn2(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    0u

public actual fun ldap_modrdn2A(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    0u

public actual fun ldap_modrdn2W(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    0u

public actual fun ldap_modrdn2_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    0u

public actual fun ldap_modrdn2_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    0u

public actual fun ldap_modrdn2_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    0u

public actual fun ldap_modrdnA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    0u

public actual fun ldap_modrdnW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    0u

public actual fun ldap_modrdn_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    0u

public actual fun ldap_modrdn_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    0u

public actual fun ldap_modrdn_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    0u

public actual fun ldap_msgfree(res: Long): UInt =
    0u

public actual fun ldap_next_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    0L

public actual fun ldap_next_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    0L

public actual fun ldap_next_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    0L

public actual fun ldap_next_entry(ld: Long, entry: Long): Long =
    0L

public actual fun ldap_next_reference(ld: Long, entry: Long): Long =
    0L

public actual fun ldap_open(hostname: PCSTR, portnumber: UInt): Long =
    0L

public actual fun ldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    0L

public actual fun ldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    0L

public actual fun ldap_parse_extended_resultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    0u

public actual fun ldap_parse_extended_resultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    0u

public actual fun ldap_parse_page_control(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    0u

public actual fun ldap_parse_page_controlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    0u

public actual fun ldap_parse_page_controlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    0u

public actual fun ldap_parse_reference(connection: Long, resultmessage: Long, referrals: Long): UInt =
    0u

public actual fun ldap_parse_referenceA(connection: Long, resultmessage: Long, referrals: Long): UInt =
    0u

public actual fun ldap_parse_referenceW(connection: Long, resultmessage: Long, referrals: Long): UInt =
    0u

public actual fun ldap_parse_result(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    0u

public actual fun ldap_parse_resultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    0u

public actual fun ldap_parse_resultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    0u

public actual fun ldap_parse_sort_control(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    0u

public actual fun ldap_parse_sort_controlA(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    0u

public actual fun ldap_parse_sort_controlW(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    0u

public actual fun ldap_parse_vlv_controlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    0

public actual fun ldap_parse_vlv_controlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    0

public actual fun ldap_perror(ld: Long, msg: PCSTR) {
}

public actual fun ldap_rename_ext(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_rename_extA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_rename_extW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    0u

public actual fun ldap_rename_ext_s(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_rename_ext_sA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_rename_ext_sW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_result(ld: Long, msgid: UInt, all: UInt, timeout: Long, res: Long): UInt =
    0u

public actual fun ldap_result2error(ld: Long, res: Long, freeit: UInt): UInt =
    0u

public actual fun ldap_sasl_bindA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    0

public actual fun ldap_sasl_bindW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    0

public actual fun ldap_sasl_bind_sA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    0

public actual fun ldap_sasl_bind_sW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    0

public actual fun ldap_search(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    0u

public actual fun ldap_searchA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    0u

public actual fun ldap_searchW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt): UInt =
    0u

public actual fun ldap_search_abandon_page(externalhandle: Long, searchblock: PLDAPSearch): UInt =
    0u

public actual fun ldap_search_ext(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    0u

public actual fun ldap_search_extA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    0u

public actual fun ldap_search_extW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    0u

public actual fun ldap_search_ext_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    0u

public actual fun ldap_search_ext_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    0u

public actual fun ldap_search_ext_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    0u

public actual fun ldap_search_init_page(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    0L

public actual fun ldap_search_init_pageA(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    0L

public actual fun ldap_search_init_pageW(externalhandle: Long, distinguishedname: PCWSTR, scopeofsearch: UInt, searchfilter: PCWSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    0L

public actual fun ldap_search_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    0u

public actual fun ldap_search_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    0u

public actual fun ldap_search_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    0u

public actual fun ldap_search_st(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    0u

public actual fun ldap_search_stA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    0u

public actual fun ldap_search_stW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    0u

public actual fun ldap_set_dbg_flags(newflags: UInt): UInt =
    0u

public actual fun ldap_set_dbg_routine(debugprintroutine: DBGPRINT) {
}

public actual fun ldap_set_option(ld: Long, option: Int, invalue: Long): UInt =
    0u

public actual fun ldap_set_optionW(ld: Long, option: Int, invalue: Long): UInt =
    0u

public actual fun ldap_simple_bind(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    0u

public actual fun ldap_simple_bindA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    0u

public actual fun ldap_simple_bindW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    0u

public actual fun ldap_simple_bind_s(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    0u

public actual fun ldap_simple_bind_sA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    0u

public actual fun ldap_simple_bind_sW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    0u

public actual fun ldap_sslinit(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    0L

public actual fun ldap_sslinitA(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    0L

public actual fun ldap_sslinitW(hostname: PCWSTR, portnumber: UInt, secure: Int): Long =
    0L

public actual fun ldap_start_tls_sA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_start_tls_sW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    0u

public actual fun ldap_startup(version: Long, instance: Long): UInt =
    0u

public actual fun ldap_stop_tls_s(externalhandle: Long): Boolean =
    false

public actual fun ldap_ufn2dn(ufn: PCSTR, pdn: Long): UInt =
    0u

public actual fun ldap_ufn2dnA(ufn: PCSTR, pdn: Long): UInt =
    0u

public actual fun ldap_ufn2dnW(ufn: PCWSTR, pdn: Long): UInt =
    0u

public actual fun ldap_unbind(ld: Long): UInt =
    0u

public actual fun ldap_unbind_s(ld: Long): UInt =
    0u

public actual fun ldap_value_free(vals: Long): UInt =
    0u

public actual fun ldap_value_freeA(vals: Long): UInt =
    0u

public actual fun ldap_value_freeW(vals: Long): UInt =
    0u

public actual fun ldap_value_free_len(vals: Long): UInt =
    0u
