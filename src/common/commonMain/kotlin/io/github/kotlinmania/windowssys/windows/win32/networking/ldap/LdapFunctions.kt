package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(format: PCSTR): UInt
}

public fun LdapGetLastError(): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "LdapGetLastError", longArrayOf()).toUInt()
}

public fun LdapMapErrorToWin32(ldaperror: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("wldap32.dll", "LdapMapErrorToWin32", longArrayOf(ldaperror.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun LdapUTF8ToUnicode(lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "LdapUTF8ToUnicode", longArrayOf(lpsrcstr, cchsrc.toLong(), lpdeststr, cchdest.toLong())).toInt()
}

public fun LdapUnicodeToUTF8(lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "LdapUnicodeToUTF8", longArrayOf(lpsrcstr, cchsrc.toLong(), lpdeststr, cchdest.toLong())).toInt()
}

public fun ber_alloc_t(options: Int): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_alloc_t", longArrayOf(options.toLong()))
}

public fun ber_bvdup(pberval: Long): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_bvdup", longArrayOf(pberval))
}

public fun ber_bvecfree(pberval: Long) {
    Win32DynamicFfi.invoke("wldap32.dll", "ber_bvecfree", longArrayOf(pberval))
}

public fun ber_bvfree(bv: Long) {
    Win32DynamicFfi.invoke("wldap32.dll", "ber_bvfree", longArrayOf(bv))
}

public fun ber_first_element(pberelement: Long, plen: Long, ppopaque: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_first_element", longArrayOf(pberelement, plen, ppopaque)).toUInt()
}

public fun ber_flatten(pberelement: Long, pberval: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_flatten", longArrayOf(pberelement, pberval)).toInt()
}

public fun ber_free(pberelement: Long, fbuf: Int) {
    Win32DynamicFfi.invoke("wldap32.dll", "ber_free", longArrayOf(pberelement, fbuf.toLong()))
}

public fun ber_init(pberval: Long): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_init", longArrayOf(pberval))
}

public fun ber_next_element(pberelement: Long, plen: Long, opaque: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_next_element", longArrayOf(pberelement, plen, opaque)).toUInt()
}

public fun ber_peek_tag(pberelement: Long, plen: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_peek_tag", longArrayOf(pberelement, plen)).toUInt()
}

public fun ber_printf(pberelement: Long, fmt: PCSTR, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_printf", longArrayOf(pberelement, fmt) + variadicArgs).toInt()
}

public fun ber_scanf(pberelement: Long, fmt: PCSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_scanf", longArrayOf(pberelement, fmt) + variadicArgs).toUInt()
}

public fun ber_skip_tag(pberelement: Long, plen: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ber_skip_tag", longArrayOf(pberelement, plen)).toUInt()
}

public fun cldap_open(hostname: PCSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "cldap_open", longArrayOf(hostname, portnumber.toLong()))
}

public fun cldap_openA(hostname: PCSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "cldap_openA", longArrayOf(hostname, portnumber.toLong()))
}

public fun cldap_openW(hostname: PCWSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "cldap_openW", longArrayOf(hostname, portnumber.toLong()))
}

public fun ldap_abandon(ld: Long, msgid: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_abandon", longArrayOf(ld, msgid.toLong())).toUInt()
}

public fun ldap_add(ld: Long, dn: PCSTR, attrs: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add", longArrayOf(ld, dn, attrs)).toUInt()
}

public fun ldap_addA(ld: Long, dn: PCSTR, attrs: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_addA", longArrayOf(ld, dn, attrs)).toUInt()
}

public fun ldap_addW(ld: Long, dn: PCWSTR, attrs: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_addW", longArrayOf(ld, dn, attrs)).toUInt()
}

public fun ldap_add_ext(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_ext", longArrayOf(ld, dn, attrs, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_add_extA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_extA", longArrayOf(ld, dn, attrs, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_add_extW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_extW", longArrayOf(ld, dn, attrs, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_add_ext_s(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_ext_s", longArrayOf(ld, dn, attrs, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_add_ext_sA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_ext_sA", longArrayOf(ld, dn, attrs, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_add_ext_sW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_ext_sW", longArrayOf(ld, dn, attrs, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_add_s(ld: Long, dn: PCSTR, attrs: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_s", longArrayOf(ld, dn, attrs)).toUInt()
}

public fun ldap_add_sA(ld: Long, dn: PCSTR, attrs: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_sA", longArrayOf(ld, dn, attrs)).toUInt()
}

public fun ldap_add_sW(ld: Long, dn: PCWSTR, attrs: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_add_sW", longArrayOf(ld, dn, attrs)).toUInt()
}

public fun ldap_bind(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_bind", longArrayOf(ld, dn, cred, method.toLong())).toUInt()
}

public fun ldap_bindA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_bindA", longArrayOf(ld, dn, cred, method.toLong())).toUInt()
}

public fun ldap_bindW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_bindW", longArrayOf(ld, dn, cred, method.toLong())).toUInt()
}

public fun ldap_bind_s(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_bind_s", longArrayOf(ld, dn, cred, method.toLong())).toUInt()
}

public fun ldap_bind_sA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_bind_sA", longArrayOf(ld, dn, cred, method.toLong())).toUInt()
}

public fun ldap_bind_sW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_bind_sW", longArrayOf(ld, dn, cred, method.toLong())).toUInt()
}

public fun ldap_check_filterA(ld: Long, searchfilter: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_check_filterA", longArrayOf(ld, searchfilter)).toUInt()
}

public fun ldap_check_filterW(ld: Long, searchfilter: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_check_filterW", longArrayOf(ld, searchfilter)).toUInt()
}

public fun ldap_cleanup(hinstance: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_cleanup", longArrayOf(Win32DynamicFfi.objectSlot(hinstance))).toUInt()
}

public fun ldap_close_extended_op(ld: Long, messagenumber: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_close_extended_op", longArrayOf(ld, messagenumber.toLong())).toUInt()
}

public fun ldap_compare(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare", longArrayOf(ld, dn, attr, value)).toUInt()
}

public fun ldap_compareA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compareA", longArrayOf(ld, dn, attr, value)).toUInt()
}

public fun ldap_compareW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compareW", longArrayOf(ld, dn, attr, value)).toUInt()
}

public fun ldap_compare_ext(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_ext", longArrayOf(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_compare_extA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_extA", longArrayOf(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_compare_extW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_extW", longArrayOf(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_compare_ext_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_ext_s", longArrayOf(ld, dn, attr, value, data, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_compare_ext_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_ext_sA", longArrayOf(ld, dn, attr, value, data, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_compare_ext_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_ext_sW", longArrayOf(ld, dn, attr, value, data, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_compare_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_s", longArrayOf(ld, dn, attr, value)).toUInt()
}

public fun ldap_compare_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_sA", longArrayOf(ld, dn, attr, value)).toUInt()
}

public fun ldap_compare_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_compare_sW", longArrayOf(ld, dn, attr, value)).toUInt()
}

public fun ldap_conn_from_msg(primaryconn: Long, res: Long): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_conn_from_msg", longArrayOf(primaryconn, res))
}

public fun ldap_connect(ld: Long, timeout: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_connect", longArrayOf(ld, timeout)).toUInt()
}

public fun ldap_control_free(control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_control_free", longArrayOf(control)).toUInt()
}

public fun ldap_control_freeA(controls: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_control_freeA", longArrayOf(controls)).toUInt()
}

public fun ldap_control_freeW(control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_control_freeW", longArrayOf(control)).toUInt()
}

public fun ldap_controls_free(controls: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_controls_free", longArrayOf(controls)).toUInt()
}

public fun ldap_controls_freeA(controls: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_controls_freeA", longArrayOf(controls)).toUInt()
}

public fun ldap_controls_freeW(control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_controls_freeW", longArrayOf(control)).toUInt()
}

public fun ldap_count_entries(ld: Long, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_count_entries", longArrayOf(ld, res)).toUInt()
}

public fun ldap_count_references(ld: Long, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_count_references", longArrayOf(ld, res)).toUInt()
}

public fun ldap_count_values(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_count_values", longArrayOf(vals)).toUInt()
}

public fun ldap_count_valuesA(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_count_valuesA", longArrayOf(vals)).toUInt()
}

public fun ldap_count_valuesW(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_count_valuesW", longArrayOf(vals)).toUInt()
}

public fun ldap_count_values_len(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_count_values_len", longArrayOf(vals)).toUInt()
}

public fun ldap_create_page_control(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_page_control", longArrayOf(externalhandle, pagesize.toLong(), cookie, iscritical.toLong(), control)).toUInt()
}

public fun ldap_create_page_controlA(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_page_controlA", longArrayOf(externalhandle, pagesize.toLong(), cookie, iscritical.toLong(), control)).toUInt()
}

public fun ldap_create_page_controlW(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_page_controlW", longArrayOf(externalhandle, pagesize.toLong(), cookie, iscritical.toLong(), control)).toUInt()
}

public fun ldap_create_sort_control(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_sort_control", longArrayOf(externalhandle, sortkeys, iscritical.toLong(), control)).toUInt()
}

public fun ldap_create_sort_controlA(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_sort_controlA", longArrayOf(externalhandle, sortkeys, iscritical.toLong(), control)).toUInt()
}

public fun ldap_create_sort_controlW(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_sort_controlW", longArrayOf(externalhandle, sortkeys, iscritical.toLong(), control)).toUInt()
}

public fun ldap_create_vlv_controlA(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_vlv_controlA", longArrayOf(externalhandle, vlvinfo, iscritical.toLong(), control)).toInt()
}

public fun ldap_create_vlv_controlW(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_create_vlv_controlW", longArrayOf(externalhandle, vlvinfo, iscritical.toLong(), control)).toInt()
}

public fun ldap_delete(ld: Long, dn: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete", longArrayOf(ld, dn)).toUInt()
}

public fun ldap_deleteA(ld: Long, dn: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_deleteA", longArrayOf(ld, dn)).toUInt()
}

public fun ldap_deleteW(ld: Long, dn: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_deleteW", longArrayOf(ld, dn)).toUInt()
}

public fun ldap_delete_ext(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_ext", longArrayOf(ld, dn, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_delete_extA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_extA", longArrayOf(ld, dn, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_delete_extW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_extW", longArrayOf(ld, dn, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_delete_ext_s(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_ext_s", longArrayOf(ld, dn, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_delete_ext_sA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_ext_sA", longArrayOf(ld, dn, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_delete_ext_sW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_ext_sW", longArrayOf(ld, dn, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_delete_s(ld: Long, dn: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_s", longArrayOf(ld, dn)).toUInt()
}

public fun ldap_delete_sA(ld: Long, dn: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_sA", longArrayOf(ld, dn)).toUInt()
}

public fun ldap_delete_sW(ld: Long, dn: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_delete_sW", longArrayOf(ld, dn)).toUInt()
}

public fun ldap_dn2ufn(dn: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_dn2ufn", longArrayOf(dn))
}

public fun ldap_dn2ufnA(dn: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_dn2ufnA", longArrayOf(dn))
}

public fun ldap_dn2ufnW(dn: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_dn2ufnW", longArrayOf(dn))
}

public fun ldap_encode_sort_controlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_encode_sort_controlA", longArrayOf(externalhandle, sortkeys, control, if (criticality) 1L else 0L)).toUInt()
}

public fun ldap_encode_sort_controlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_encode_sort_controlW", longArrayOf(externalhandle, sortkeys, control, if (criticality) 1L else 0L)).toUInt()
}

public fun ldap_err2string(err: UInt): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_err2string", longArrayOf(err.toLong()))
}

public fun ldap_err2stringA(err: UInt): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_err2stringA", longArrayOf(err.toLong()))
}

public fun ldap_err2stringW(err: UInt): PWSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_err2stringW", longArrayOf(err.toLong()))
}

public fun ldap_escape_filter_element(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_escape_filter_element", longArrayOf(sourcefilterelement, sourcelength.toLong(), destfilterelement, destlength.toLong())).toUInt()
}

public fun ldap_escape_filter_elementA(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_escape_filter_elementA", longArrayOf(sourcefilterelement, sourcelength.toLong(), destfilterelement, destlength.toLong())).toUInt()
}

public fun ldap_escape_filter_elementW(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PWSTR, destlength: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_escape_filter_elementW", longArrayOf(sourcefilterelement, sourcelength.toLong(), destfilterelement, destlength.toLong())).toUInt()
}

public fun ldap_explode_dn(dn: PCSTR, notypes: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_explode_dn", longArrayOf(dn, notypes.toLong()))
}

public fun ldap_explode_dnA(dn: PCSTR, notypes: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_explode_dnA", longArrayOf(dn, notypes.toLong()))
}

public fun ldap_explode_dnW(dn: PCWSTR, notypes: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_explode_dnW", longArrayOf(dn, notypes.toLong()))
}

public fun ldap_extended_operation(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_extended_operation", longArrayOf(ld, oid, data, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_extended_operationA(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_extended_operationA", longArrayOf(ld, oid, data, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_extended_operationW(ld: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_extended_operationW", longArrayOf(ld, oid, data, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_extended_operation_sA(externalhandle: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_extended_operation_sA", longArrayOf(externalhandle, oid, data, servercontrols, clientcontrols, returnedoid, returneddata)).toUInt()
}

public fun ldap_extended_operation_sW(externalhandle: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_extended_operation_sW", longArrayOf(externalhandle, oid, data, servercontrols, clientcontrols, returnedoid, returneddata)).toUInt()
}

public fun ldap_first_attribute(ld: Long, entry: Long, ptr: Long): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_first_attribute", longArrayOf(ld, entry, ptr))
}

public fun ldap_first_attributeA(ld: Long, entry: Long, ptr: Long): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_first_attributeA", longArrayOf(ld, entry, ptr))
}

public fun ldap_first_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_first_attributeW", longArrayOf(ld, entry, ptr))
}

public fun ldap_first_entry(ld: Long, res: Long): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_first_entry", longArrayOf(ld, res))
}

public fun ldap_first_reference(ld: Long, res: Long): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_first_reference", longArrayOf(ld, res))
}

public fun ldap_free_controls(controls: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_free_controls", longArrayOf(controls)).toUInt()
}

public fun ldap_free_controlsA(controls: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_free_controlsA", longArrayOf(controls)).toUInt()
}

public fun ldap_free_controlsW(controls: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_free_controlsW", longArrayOf(controls)).toUInt()
}

public fun ldap_get_dn(ld: Long, entry: Long): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_dn", longArrayOf(ld, entry))
}

public fun ldap_get_dnA(ld: Long, entry: Long): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_dnA", longArrayOf(ld, entry))
}

public fun ldap_get_dnW(ld: Long, entry: Long): PWSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_dnW", longArrayOf(ld, entry))
}

public fun ldap_get_next_page(externalhandle: Long, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_next_page", longArrayOf(externalhandle, searchhandle, pagesize.toLong(), messagenumber)).toUInt()
}

public fun ldap_get_next_page_s(externalhandle: Long, searchhandle: PLDAPSearch, timeout: Long, pagesize: UInt, totalcount: Long, results: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_next_page_s", longArrayOf(externalhandle, searchhandle, timeout, pagesize.toLong(), totalcount, results)).toUInt()
}

public fun ldap_get_option(ld: Long, option: Int, outvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_option", longArrayOf(ld, option.toLong(), outvalue)).toUInt()
}

public fun ldap_get_optionW(ld: Long, option: Int, outvalue: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_optionW", longArrayOf(ld, option.toLong(), outvalue)).toUInt()
}

public fun ldap_get_paged_count(externalhandle: Long, searchblock: PLDAPSearch, totalcount: Long, results: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_paged_count", longArrayOf(externalhandle, searchblock, totalcount, results)).toUInt()
}

public fun ldap_get_values(ld: Long, entry: Long, attr: PCSTR): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_values", longArrayOf(ld, entry, attr))
}

public fun ldap_get_valuesA(ld: Long, entry: Long, attr: PCSTR): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_valuesA", longArrayOf(ld, entry, attr))
}

public fun ldap_get_valuesW(ld: Long, entry: Long, attr: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_valuesW", longArrayOf(ld, entry, attr))
}

public fun ldap_get_values_len(externalhandle: Long, message: Long, attr: PCSTR): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_values_len", longArrayOf(externalhandle, message, attr))
}

public fun ldap_get_values_lenA(externalhandle: Long, message: Long, attr: PCSTR): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_values_lenA", longArrayOf(externalhandle, message, attr))
}

public fun ldap_get_values_lenW(externalhandle: Long, message: Long, attr: PCWSTR): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_get_values_lenW", longArrayOf(externalhandle, message, attr))
}

public fun ldap_init(hostname: PCSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_init", longArrayOf(hostname, portnumber.toLong()))
}

public fun ldap_initA(hostname: PCSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_initA", longArrayOf(hostname, portnumber.toLong()))
}

public fun ldap_initW(hostname: PCWSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_initW", longArrayOf(hostname, portnumber.toLong()))
}

public fun ldap_memfree(block: PCSTR) {
    Win32DynamicFfi.invoke("wldap32.dll", "ldap_memfree", longArrayOf(block))
}

public fun ldap_memfreeA(block: PCSTR) {
    Win32DynamicFfi.invoke("wldap32.dll", "ldap_memfreeA", longArrayOf(block))
}

public fun ldap_memfreeW(block: PCWSTR) {
    Win32DynamicFfi.invoke("wldap32.dll", "ldap_memfreeW", longArrayOf(block))
}

public fun ldap_modify(ld: Long, dn: PCSTR, mods: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify", longArrayOf(ld, dn, mods)).toUInt()
}

public fun ldap_modifyA(ld: Long, dn: PCSTR, mods: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modifyA", longArrayOf(ld, dn, mods)).toUInt()
}

public fun ldap_modifyW(ld: Long, dn: PCWSTR, mods: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modifyW", longArrayOf(ld, dn, mods)).toUInt()
}

public fun ldap_modify_ext(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_ext", longArrayOf(ld, dn, mods, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_modify_extA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_extA", longArrayOf(ld, dn, mods, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_modify_extW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_extW", longArrayOf(ld, dn, mods, servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_modify_ext_s(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_ext_s", longArrayOf(ld, dn, mods, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_modify_ext_sA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_ext_sA", longArrayOf(ld, dn, mods, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_modify_ext_sW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_ext_sW", longArrayOf(ld, dn, mods, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_modify_s(ld: Long, dn: PCSTR, mods: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_s", longArrayOf(ld, dn, mods)).toUInt()
}

public fun ldap_modify_sA(ld: Long, dn: PCSTR, mods: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_sA", longArrayOf(ld, dn, mods)).toUInt()
}

public fun ldap_modify_sW(ld: Long, dn: PCWSTR, mods: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modify_sW", longArrayOf(ld, dn, mods)).toUInt()
}

public fun ldap_modrdn(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn", longArrayOf(externalhandle, distinguishedname, newdistinguishedname)).toUInt()
}

public fun ldap_modrdn2(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn2", longArrayOf(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn.toLong())).toUInt()
}

public fun ldap_modrdn2A(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn2A", longArrayOf(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn.toLong())).toUInt()
}

public fun ldap_modrdn2W(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn2W", longArrayOf(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn.toLong())).toUInt()
}

public fun ldap_modrdn2_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn2_s", longArrayOf(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn.toLong())).toUInt()
}

public fun ldap_modrdn2_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn2_sA", longArrayOf(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn.toLong())).toUInt()
}

public fun ldap_modrdn2_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn2_sW", longArrayOf(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn.toLong())).toUInt()
}

public fun ldap_modrdnA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdnA", longArrayOf(externalhandle, distinguishedname, newdistinguishedname)).toUInt()
}

public fun ldap_modrdnW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdnW", longArrayOf(externalhandle, distinguishedname, newdistinguishedname)).toUInt()
}

public fun ldap_modrdn_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn_s", longArrayOf(externalhandle, distinguishedname, newdistinguishedname)).toUInt()
}

public fun ldap_modrdn_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn_sA", longArrayOf(externalhandle, distinguishedname, newdistinguishedname)).toUInt()
}

public fun ldap_modrdn_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_modrdn_sW", longArrayOf(externalhandle, distinguishedname, newdistinguishedname)).toUInt()
}

public fun ldap_msgfree(res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_msgfree", longArrayOf(res)).toUInt()
}

public fun ldap_next_attribute(ld: Long, entry: Long, ptr: Long): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_next_attribute", longArrayOf(ld, entry, ptr))
}

public fun ldap_next_attributeA(ld: Long, entry: Long, ptr: Long): PSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_next_attributeA", longArrayOf(ld, entry, ptr))
}

public fun ldap_next_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_next_attributeW", longArrayOf(ld, entry, ptr))
}

public fun ldap_next_entry(ld: Long, entry: Long): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_next_entry", longArrayOf(ld, entry))
}

public fun ldap_next_reference(ld: Long, entry: Long): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_next_reference", longArrayOf(ld, entry))
}

public fun ldap_open(hostname: PCSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_open", longArrayOf(hostname, portnumber.toLong()))
}

public fun ldap_openA(hostname: PCSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_openA", longArrayOf(hostname, portnumber.toLong()))
}

public fun ldap_openW(hostname: PCWSTR, portnumber: UInt): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_openW", longArrayOf(hostname, portnumber.toLong()))
}

public fun ldap_parse_extended_resultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_extended_resultA", longArrayOf(connection, resultmessage, resultoid, resultdata, if (freeit) 1L else 0L)).toUInt()
}

public fun ldap_parse_extended_resultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_extended_resultW", longArrayOf(connection, resultmessage, resultoid, resultdata, if (freeit) 1L else 0L)).toUInt()
}

public fun ldap_parse_page_control(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_page_control", longArrayOf(externalhandle, servercontrols, totalcount, cookie)).toUInt()
}

public fun ldap_parse_page_controlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_page_controlA", longArrayOf(externalhandle, servercontrols, totalcount, cookie)).toUInt()
}

public fun ldap_parse_page_controlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_page_controlW", longArrayOf(externalhandle, servercontrols, totalcount, cookie)).toUInt()
}

public fun ldap_parse_reference(connection: Long, resultmessage: Long, referrals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_reference", longArrayOf(connection, resultmessage, referrals)).toUInt()
}

public fun ldap_parse_referenceA(connection: Long, resultmessage: Long, referrals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_referenceA", longArrayOf(connection, resultmessage, referrals)).toUInt()
}

public fun ldap_parse_referenceW(connection: Long, resultmessage: Long, referrals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_referenceW", longArrayOf(connection, resultmessage, referrals)).toUInt()
}

public fun ldap_parse_result(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_result", longArrayOf(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, if (freeit) 1L else 0L)).toUInt()
}

public fun ldap_parse_resultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_resultA", longArrayOf(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, if (freeit) 1L else 0L)).toUInt()
}

public fun ldap_parse_resultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_resultW", longArrayOf(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, if (freeit) 1L else 0L)).toUInt()
}

public fun ldap_parse_sort_control(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_sort_control", longArrayOf(externalhandle, control, result, attribute)).toUInt()
}

public fun ldap_parse_sort_controlA(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_sort_controlA", longArrayOf(externalhandle, control, result, attribute)).toUInt()
}

public fun ldap_parse_sort_controlW(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_sort_controlW", longArrayOf(externalhandle, control, result, attribute)).toUInt()
}

public fun ldap_parse_vlv_controlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_vlv_controlA", longArrayOf(externalhandle, control, targetpos, listcount, context, errcode)).toInt()
}

public fun ldap_parse_vlv_controlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_parse_vlv_controlW", longArrayOf(externalhandle, control, targetpos, listcount, context, errcode)).toInt()
}

public fun ldap_perror(ld: Long, msg: PCSTR) {
    Win32DynamicFfi.invoke("wldap32.dll", "ldap_perror", longArrayOf(ld, msg))
}

public fun ldap_rename_ext(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_rename_ext", longArrayOf(ld, dn, newrdn, newparent, deleteoldrdn.toLong(), servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_rename_extA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_rename_extA", longArrayOf(ld, dn, newrdn, newparent, deleteoldrdn.toLong(), servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_rename_extW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_rename_extW", longArrayOf(ld, dn, newrdn, newparent, deleteoldrdn.toLong(), servercontrols, clientcontrols, messagenumber)).toUInt()
}

public fun ldap_rename_ext_s(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_rename_ext_s", longArrayOf(ld, dn, newrdn, newparent, deleteoldrdn.toLong(), servercontrols, clientcontrols)).toUInt()
}

public fun ldap_rename_ext_sA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_rename_ext_sA", longArrayOf(ld, dn, newrdn, newparent, deleteoldrdn.toLong(), servercontrols, clientcontrols)).toUInt()
}

public fun ldap_rename_ext_sW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_rename_ext_sW", longArrayOf(ld, dn, newrdn, newparent, deleteoldrdn.toLong(), servercontrols, clientcontrols)).toUInt()
}

public fun ldap_result(ld: Long, msgid: UInt, all: UInt, timeout: Long, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_result", longArrayOf(ld, msgid.toLong(), all.toLong(), timeout, res)).toUInt()
}

public fun ldap_result2error(ld: Long, res: Long, freeit: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_result2error", longArrayOf(ld, res, freeit.toLong())).toUInt()
}

public fun ldap_sasl_bindA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_sasl_bindA", longArrayOf(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, messagenumber)).toInt()
}

public fun ldap_sasl_bindW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_sasl_bindW", longArrayOf(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, messagenumber)).toInt()
}

public fun ldap_sasl_bind_sA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_sasl_bind_sA", longArrayOf(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, serverdata)).toInt()
}

public fun ldap_sasl_bind_sW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_sasl_bind_sW", longArrayOf(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, serverdata)).toInt()
}

public fun ldap_search(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong())).toUInt()
}

public fun ldap_searchA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_searchA", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong())).toUInt()
}

public fun ldap_searchW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_searchW", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong())).toUInt()
}

public fun ldap_search_abandon_page(externalhandle: Long, searchblock: PLDAPSearch): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_abandon_page", longArrayOf(externalhandle, searchblock)).toUInt()
}

public fun ldap_search_ext(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_ext", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), servercontrols, clientcontrols, timelimit.toLong(), sizelimit.toLong(), messagenumber)).toUInt()
}

public fun ldap_search_extA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_extA", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), servercontrols, clientcontrols, timelimit.toLong(), sizelimit.toLong(), messagenumber)).toUInt()
}

public fun ldap_search_extW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_extW", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), servercontrols, clientcontrols, timelimit.toLong(), sizelimit.toLong(), messagenumber)).toUInt()
}

public fun ldap_search_ext_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_ext_s", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), servercontrols, clientcontrols, timeout, sizelimit.toLong(), res)).toUInt()
}

public fun ldap_search_ext_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_ext_sA", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), servercontrols, clientcontrols, timeout, sizelimit.toLong(), res)).toUInt()
}

public fun ldap_search_ext_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_ext_sW", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), servercontrols, clientcontrols, timeout, sizelimit.toLong(), res)).toUInt()
}

public fun ldap_search_init_page(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_init_page", longArrayOf(externalhandle, distinguishedname, scopeofsearch.toLong(), searchfilter, attributelist, attributesonly.toLong(), servercontrols, clientcontrols, pagetimelimit.toLong(), totalsizelimit.toLong(), sortkeys))
}

public fun ldap_search_init_pageA(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_init_pageA", longArrayOf(externalhandle, distinguishedname, scopeofsearch.toLong(), searchfilter, attributelist, attributesonly.toLong(), servercontrols, clientcontrols, pagetimelimit.toLong(), totalsizelimit.toLong(), sortkeys))
}

public fun ldap_search_init_pageW(externalhandle: Long, distinguishedname: PCWSTR, scopeofsearch: UInt, searchfilter: PCWSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_init_pageW", longArrayOf(externalhandle, distinguishedname, scopeofsearch.toLong(), searchfilter, attributelist, attributesonly.toLong(), servercontrols, clientcontrols, pagetimelimit.toLong(), totalsizelimit.toLong(), sortkeys))
}

public fun ldap_search_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_s", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), res)).toUInt()
}

public fun ldap_search_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_sA", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), res)).toUInt()
}

public fun ldap_search_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_sW", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), res)).toUInt()
}

public fun ldap_search_st(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_st", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), timeout, res)).toUInt()
}

public fun ldap_search_stA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_stA", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), timeout, res)).toUInt()
}

public fun ldap_search_stW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_search_stW", longArrayOf(ld, base, scope.toLong(), filter, attrs, attrsonly.toLong(), timeout, res)).toUInt()
}

public fun ldap_set_dbg_flags(newflags: UInt): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_set_dbg_flags", longArrayOf(newflags.toLong())).toUInt()
}

public fun ldap_set_dbg_routine(debugprintroutine: DBGPRINT) {
    Win32DynamicFfi.invoke("wldap32.dll", "ldap_set_dbg_routine", longArrayOf(Win32DynamicFfi.objectSlot(debugprintroutine)))
}

public fun ldap_set_option(ld: Long, option: Int, invalue: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_set_option", longArrayOf(ld, option.toLong(), invalue)).toUInt()
}

public fun ldap_set_optionW(ld: Long, option: Int, invalue: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_set_optionW", longArrayOf(ld, option.toLong(), invalue)).toUInt()
}

public fun ldap_simple_bind(ld: Long, dn: PCSTR, passwd: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_simple_bind", longArrayOf(ld, dn, passwd)).toUInt()
}

public fun ldap_simple_bindA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_simple_bindA", longArrayOf(ld, dn, passwd)).toUInt()
}

public fun ldap_simple_bindW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_simple_bindW", longArrayOf(ld, dn, passwd)).toUInt()
}

public fun ldap_simple_bind_s(ld: Long, dn: PCSTR, passwd: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_simple_bind_s", longArrayOf(ld, dn, passwd)).toUInt()
}

public fun ldap_simple_bind_sA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_simple_bind_sA", longArrayOf(ld, dn, passwd)).toUInt()
}

public fun ldap_simple_bind_sW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_simple_bind_sW", longArrayOf(ld, dn, passwd)).toUInt()
}

public fun ldap_sslinit(hostname: PCSTR, portnumber: UInt, secure: Int): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_sslinit", longArrayOf(hostname, portnumber.toLong(), secure.toLong()))
}

public fun ldap_sslinitA(hostname: PCSTR, portnumber: UInt, secure: Int): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_sslinitA", longArrayOf(hostname, portnumber.toLong(), secure.toLong()))
}

public fun ldap_sslinitW(hostname: PCWSTR, portnumber: UInt, secure: Int): Long {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_sslinitW", longArrayOf(hostname, portnumber.toLong(), secure.toLong()))
}

public fun ldap_start_tls_sA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_start_tls_sA", longArrayOf(externalhandle, serverreturnvalue, result, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_start_tls_sW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_start_tls_sW", longArrayOf(externalhandle, serverreturnvalue, result, servercontrols, clientcontrols)).toUInt()
}

public fun ldap_startup(version: Long, instance: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_startup", longArrayOf(version, instance)).toUInt()
}

public fun ldap_stop_tls_s(externalhandle: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("wldap32.dll", "ldap_stop_tls_s", longArrayOf(externalhandle))
    return (rawRet and 0xFFL) != 0L
}

public fun ldap_ufn2dn(ufn: PCSTR, pdn: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_ufn2dn", longArrayOf(ufn, pdn)).toUInt()
}

public fun ldap_ufn2dnA(ufn: PCSTR, pdn: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_ufn2dnA", longArrayOf(ufn, pdn)).toUInt()
}

public fun ldap_ufn2dnW(ufn: PCWSTR, pdn: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_ufn2dnW", longArrayOf(ufn, pdn)).toUInt()
}

public fun ldap_unbind(ld: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_unbind", longArrayOf(ld)).toUInt()
}

public fun ldap_unbind_s(ld: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_unbind_s", longArrayOf(ld)).toUInt()
}

public fun ldap_value_free(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_value_free", longArrayOf(vals)).toUInt()
}

public fun ldap_value_freeA(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_value_freeA", longArrayOf(vals)).toUInt()
}

public fun ldap_value_freeW(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_value_freeW", longArrayOf(vals)).toUInt()
}

public fun ldap_value_free_len(vals: Long): UInt {
    return Win32DynamicFfi.invoke("wldap32.dll", "ldap_value_free_len", longArrayOf(vals)).toUInt()
}
