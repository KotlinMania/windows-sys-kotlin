@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

private object WindowsWin32NetworkingLdapJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_LdapGetLastError(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_LdapMapErrorToWin32(ldaperror: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_LdapUTF8ToUnicode(lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_LdapUnicodeToUTF8(lpsrcstr: Long, cchsrc: Int, lpdeststr: Long, cchdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_alloc_t(options: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_bvdup(pberval: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_bvecfree(pberval: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_bvfree(bv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_first_element(pberelement: Long, plen: Long, ppopaque: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_flatten(pberelement: Long, pberval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_free(pberelement: Long, fbuf: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_init(pberval: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_next_element(pberelement: Long, plen: Long, opaque: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_peek_tag(pberelement: Long, plen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ber_skip_tag(pberelement: Long, plen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_cldap_open(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_cldap_openA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_cldap_openW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_abandon(ld: Long, msgid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_addA(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_addW(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_ext(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_extA(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_extW(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_ext_s(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_ext_sA(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_ext_sW(ld: Long, dn: Long, attrs: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_s(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_sA(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_add_sW(ld: Long, dn: Long, attrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_bind(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_bindA(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_bindW(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_bind_s(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_bind_sA(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_bind_sW(ld: Long, dn: Long, cred: Long, method: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_check_filterA(ld: Long, searchfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_check_filterW(ld: Long, searchfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_cleanup(hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_close_extended_op(ld: Long, messagenumber: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compareA(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compareW(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_ext(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_extA(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_extW(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_ext_s(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_ext_sA(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_ext_sW(ld: Long, dn: Long, attr: Long, value: Long, data: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_s(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_sA(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_compare_sW(ld: Long, dn: Long, attr: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_conn_from_msg(primaryconn: Long, res: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_connect(ld: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_control_free(control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_control_freeA(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_control_freeW(control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_controls_free(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_controls_freeA(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_controls_freeW(control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_count_entries(ld: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_count_references(ld: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_count_values(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_count_valuesA(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_count_valuesW(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_count_values_len(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_page_control(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_page_controlA(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_page_controlW(externalhandle: Long, pagesize: Int, cookie: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_sort_control(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_sort_controlA(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_sort_controlW(externalhandle: Long, sortkeys: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlA(externalhandle: Long, vlvinfo: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlW(externalhandle: Long, vlvinfo: Long, iscritical: Byte, control: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_deleteA(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_deleteW(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_ext(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_extA(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_extW(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_ext_s(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_ext_sA(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_ext_sW(ld: Long, dn: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_s(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_sA(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_delete_sW(ld: Long, dn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_dn2ufn(dn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_dn2ufnA(dn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_dn2ufnW(dn: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_err2string(err: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_err2stringA(err: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_err2stringW(err: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_escape_filter_element(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementA(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementW(sourcefilterelement: Long, sourcelength: Int, destfilterelement: Long, destlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_explode_dn(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_explode_dnA(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_explode_dnW(dn: Long, notypes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_extended_operation(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_extended_operationA(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_extended_operationW(ld: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_extended_operation_sA(externalhandle: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_extended_operation_sW(externalhandle: Long, oid: Long, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_first_attribute(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_first_attributeA(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_first_attributeW(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_first_entry(ld: Long, res: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_first_reference(ld: Long, res: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_free_controls(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_free_controlsA(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_free_controlsW(controls: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_dn(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_dnA(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_dnW(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_next_page(externalhandle: Long, searchhandle: Long, pagesize: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_next_page_s(externalhandle: Long, searchhandle: Long, timeout: Long, pagesize: Int, totalcount: Long, results: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_option(ld: Long, option: Int, outvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_optionW(ld: Long, option: Int, outvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_paged_count(externalhandle: Long, searchblock: Long, totalcount: Long, results: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_values(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_valuesA(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_valuesW(ld: Long, entry: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_values_len(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_values_lenA(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_get_values_lenW(externalhandle: Long, message: Long, attr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_init(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_initA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_initW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_memfree(block: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_memfreeA(block: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_memfreeW(block: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modifyA(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modifyW(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_ext(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_extA(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_extW(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_ext_s(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_ext_sA(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_ext_sW(ld: Long, dn: Long, mods: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_s(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_sA(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modify_sW(ld: Long, dn: Long, mods: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn2(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn2A(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn2W(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn2_s(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn2_sA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn2_sW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long, deleteoldrdn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdnA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdnW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn_s(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn_sA(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_modrdn_sW(externalhandle: Long, distinguishedname: Long, newdistinguishedname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_msgfree(res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_next_attribute(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_next_attributeA(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_next_attributeW(ld: Long, entry: Long, ptr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_next_entry(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_next_reference(ld: Long, entry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_open(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_openA(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_openW(hostname: Long, portnumber: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_page_control(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_page_controlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_page_controlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_reference(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_referenceA(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_referenceW(connection: Long, resultmessage: Long, referrals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_result(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_resultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_resultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_sort_control(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlA(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlW(externalhandle: Long, control: Long, result: Long, attribute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_perror(ld: Long, msg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_rename_ext(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_rename_extA(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_rename_extW(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_rename_ext_s(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_rename_ext_sA(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_rename_ext_sW(ld: Long, dn: Long, newrdn: Long, newparent: Long, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_result(ld: Long, msgid: Int, all: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_result2error(ld: Long, res: Long, freeit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_sasl_bindA(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_sasl_bindW(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sA(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sW(externalhandle: Long, distname: Long, authmechanism: Long, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_searchA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_searchW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_abandon_page(externalhandle: Long, searchblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_ext(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_extA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_extW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timelimit: Int, sizelimit: Int, messagenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_ext_s(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_ext_sA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_ext_sW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_init_page(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_init_pageA(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_init_pageW(externalhandle: Long, distinguishedname: Long, scopeofsearch: Int, searchfilter: Long, attributelist: Long, attributesonly: Int, servercontrols: Long, clientcontrols: Long, pagetimelimit: Int, totalsizelimit: Int, sortkeys: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_s(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_sA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_sW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_st(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_stA(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_search_stW(ld: Long, base: Long, scope: Int, filter: Long, attrs: Long, attrsonly: Int, timeout: Long, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_set_dbg_flags(newflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_set_dbg_routine(debugprintroutine: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_set_option(ld: Long, option: Int, invalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_set_optionW(ld: Long, option: Int, invalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_simple_bind(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_simple_bindA(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_simple_bindW(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_simple_bind_s(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_simple_bind_sA(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_simple_bind_sW(ld: Long, dn: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_sslinit(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_sslinitA(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_sslinitW(hostname: Long, portnumber: Int, secure: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_start_tls_sA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_start_tls_sW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_startup(version: Long, instance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_stop_tls_s(externalhandle: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_ufn2dn(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_ufn2dnA(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_ufn2dnW(ufn: Long, pdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_unbind(ld: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_unbind_s(ld: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_value_free(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_value_freeA(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_value_freeW(vals: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_ldap_ldap_value_free_len(vals: Long): Int
}

public actual fun LdapGetLastError(): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_LdapGetLastError().toUInt()

public actual fun LdapMapErrorToWin32(ldaperror: UInt): WIN32_ERROR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_LdapMapErrorToWin32(ldaperror.toInt()).toUInt()

public actual fun LdapUTF8ToUnicode(lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_LdapUTF8ToUnicode(lpsrcstr, cchsrc, lpdeststr, cchdest)

public actual fun LdapUnicodeToUTF8(lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_LdapUnicodeToUTF8(lpsrcstr, cchsrc, lpdeststr, cchdest)

public actual fun ber_alloc_t(options: Int): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_alloc_t(options)

public actual fun ber_bvdup(pberval: Long): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_bvdup(pberval)

public actual fun ber_bvecfree(pberval: Long) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_bvecfree(pberval)
}

public actual fun ber_bvfree(bv: Long) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_bvfree(bv)
}

public actual fun ber_first_element(pberelement: Long, plen: Long, ppopaque: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_first_element(pberelement, plen, ppopaque).toUInt()

public actual fun ber_flatten(pberelement: Long, pberval: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_flatten(pberelement, pberval)

public actual fun ber_free(pberelement: Long, fbuf: Int) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_free(pberelement, fbuf)
}

public actual fun ber_init(pberval: Long): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_init(pberval)

public actual fun ber_next_element(pberelement: Long, plen: Long, opaque: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_next_element(pberelement, plen, opaque).toUInt()

public actual fun ber_peek_tag(pberelement: Long, plen: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_peek_tag(pberelement, plen).toUInt()

public actual fun ber_printf(pberelement: Long, fmt: PCSTR): Int =
    0

public actual fun ber_scanf(pberelement: Long, fmt: PCSTR): UInt =
    0u

public actual fun ber_skip_tag(pberelement: Long, plen: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ber_skip_tag(pberelement, plen).toUInt()

public actual fun cldap_open(hostname: PCSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_cldap_open(hostname, portnumber.toInt())

public actual fun cldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_cldap_openA(hostname, portnumber.toInt())

public actual fun cldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_cldap_openW(hostname, portnumber.toInt())

public actual fun ldap_abandon(ld: Long, msgid: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_abandon(ld, msgid.toInt()).toUInt()

public actual fun ldap_add(ld: Long, dn: PCSTR, attrs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add(ld, dn, attrs).toUInt()

public actual fun ldap_addA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_addA(ld, dn, attrs).toUInt()

public actual fun ldap_addW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_addW(ld, dn, attrs).toUInt()

public actual fun ldap_add_ext(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_ext(ld, dn, attrs, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_add_extA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_extA(ld, dn, attrs, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_add_extW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_extW(ld, dn, attrs, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_add_ext_s(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_ext_s(ld, dn, attrs, servercontrols, clientcontrols).toUInt()

public actual fun ldap_add_ext_sA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_ext_sA(ld, dn, attrs, servercontrols, clientcontrols).toUInt()

public actual fun ldap_add_ext_sW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_ext_sW(ld, dn, attrs, servercontrols, clientcontrols).toUInt()

public actual fun ldap_add_s(ld: Long, dn: PCSTR, attrs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_s(ld, dn, attrs).toUInt()

public actual fun ldap_add_sA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_sA(ld, dn, attrs).toUInt()

public actual fun ldap_add_sW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_add_sW(ld, dn, attrs).toUInt()

public actual fun ldap_bind(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_bind(ld, dn, cred, method.toInt()).toUInt()

public actual fun ldap_bindA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_bindA(ld, dn, cred, method.toInt()).toUInt()

public actual fun ldap_bindW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_bindW(ld, dn, cred, method.toInt()).toUInt()

public actual fun ldap_bind_s(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_bind_s(ld, dn, cred, method.toInt()).toUInt()

public actual fun ldap_bind_sA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_bind_sA(ld, dn, cred, method.toInt()).toUInt()

public actual fun ldap_bind_sW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_bind_sW(ld, dn, cred, method.toInt()).toUInt()

public actual fun ldap_check_filterA(ld: Long, searchfilter: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_check_filterA(ld, searchfilter).toUInt()

public actual fun ldap_check_filterW(ld: Long, searchfilter: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_check_filterW(ld, searchfilter).toUInt()

public actual fun ldap_cleanup(hinstance: HANDLE): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_cleanup(hinstance).toUInt()

public actual fun ldap_close_extended_op(ld: Long, messagenumber: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_close_extended_op(ld, messagenumber.toInt()).toUInt()

public actual fun ldap_compare(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare(ld, dn, attr, value).toUInt()

public actual fun ldap_compareA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compareA(ld, dn, attr, value).toUInt()

public actual fun ldap_compareW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compareW(ld, dn, attr, value).toUInt()

public actual fun ldap_compare_ext(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_ext(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_compare_extA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_extA(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_compare_extW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_extW(ld, dn, attr, value, data, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_compare_ext_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_ext_s(ld, dn, attr, value, data, servercontrols, clientcontrols).toUInt()

public actual fun ldap_compare_ext_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_ext_sA(ld, dn, attr, value, data, servercontrols, clientcontrols).toUInt()

public actual fun ldap_compare_ext_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_ext_sW(ld, dn, attr, value, data, servercontrols, clientcontrols).toUInt()

public actual fun ldap_compare_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_s(ld, dn, attr, value).toUInt()

public actual fun ldap_compare_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_sA(ld, dn, attr, value).toUInt()

public actual fun ldap_compare_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_compare_sW(ld, dn, attr, value).toUInt()

public actual fun ldap_conn_from_msg(primaryconn: Long, res: Long): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_conn_from_msg(primaryconn, res)

public actual fun ldap_connect(ld: Long, timeout: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_connect(ld, timeout).toUInt()

public actual fun ldap_control_free(control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_control_free(control).toUInt()

public actual fun ldap_control_freeA(controls: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_control_freeA(controls).toUInt()

public actual fun ldap_control_freeW(control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_control_freeW(control).toUInt()

public actual fun ldap_controls_free(controls: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_controls_free(controls).toUInt()

public actual fun ldap_controls_freeA(controls: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_controls_freeA(controls).toUInt()

public actual fun ldap_controls_freeW(control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_controls_freeW(control).toUInt()

public actual fun ldap_count_entries(ld: Long, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_count_entries(ld, res).toUInt()

public actual fun ldap_count_references(ld: Long, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_count_references(ld, res).toUInt()

public actual fun ldap_count_values(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_count_values(vals).toUInt()

public actual fun ldap_count_valuesA(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_count_valuesA(vals).toUInt()

public actual fun ldap_count_valuesW(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_count_valuesW(vals).toUInt()

public actual fun ldap_count_values_len(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_count_values_len(vals).toUInt()

public actual fun ldap_create_page_control(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_page_control(externalhandle, pagesize.toInt(), cookie, iscritical.toByte(), control).toUInt()

public actual fun ldap_create_page_controlA(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_page_controlA(externalhandle, pagesize.toInt(), cookie, iscritical.toByte(), control).toUInt()

public actual fun ldap_create_page_controlW(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_page_controlW(externalhandle, pagesize.toInt(), cookie, iscritical.toByte(), control).toUInt()

public actual fun ldap_create_sort_control(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_sort_control(externalhandle, sortkeys, iscritical.toByte(), control).toUInt()

public actual fun ldap_create_sort_controlA(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_sort_controlA(externalhandle, sortkeys, iscritical.toByte(), control).toUInt()

public actual fun ldap_create_sort_controlW(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_sort_controlW(externalhandle, sortkeys, iscritical.toByte(), control).toUInt()

public actual fun ldap_create_vlv_controlA(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlA(externalhandle, vlvinfo, iscritical.toByte(), control)

public actual fun ldap_create_vlv_controlW(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlW(externalhandle, vlvinfo, iscritical.toByte(), control)

public actual fun ldap_delete(ld: Long, dn: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete(ld, dn).toUInt()

public actual fun ldap_deleteA(ld: Long, dn: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_deleteA(ld, dn).toUInt()

public actual fun ldap_deleteW(ld: Long, dn: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_deleteW(ld, dn).toUInt()

public actual fun ldap_delete_ext(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_ext(ld, dn, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_delete_extA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_extA(ld, dn, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_delete_extW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_extW(ld, dn, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_delete_ext_s(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_ext_s(ld, dn, servercontrols, clientcontrols).toUInt()

public actual fun ldap_delete_ext_sA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_ext_sA(ld, dn, servercontrols, clientcontrols).toUInt()

public actual fun ldap_delete_ext_sW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_ext_sW(ld, dn, servercontrols, clientcontrols).toUInt()

public actual fun ldap_delete_s(ld: Long, dn: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_s(ld, dn).toUInt()

public actual fun ldap_delete_sA(ld: Long, dn: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_sA(ld, dn).toUInt()

public actual fun ldap_delete_sW(ld: Long, dn: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_delete_sW(ld, dn).toUInt()

public actual fun ldap_dn2ufn(dn: PCSTR): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_dn2ufn(dn)

public actual fun ldap_dn2ufnA(dn: PCSTR): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_dn2ufnA(dn)

public actual fun ldap_dn2ufnW(dn: PCWSTR): PWSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_dn2ufnW(dn)

public actual fun ldap_encode_sort_controlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlA(externalhandle, sortkeys, control, criticality).toUInt()

public actual fun ldap_encode_sort_controlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlW(externalhandle, sortkeys, control, criticality).toUInt()

public actual fun ldap_err2string(err: UInt): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_err2string(err.toInt())

public actual fun ldap_err2stringA(err: UInt): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_err2stringA(err.toInt())

public actual fun ldap_err2stringW(err: UInt): PWSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_err2stringW(err.toInt())

public actual fun ldap_escape_filter_element(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_escape_filter_element(sourcefilterelement, sourcelength.toInt(), destfilterelement, destlength.toInt()).toUInt()

public actual fun ldap_escape_filter_elementA(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementA(sourcefilterelement, sourcelength.toInt(), destfilterelement, destlength.toInt()).toUInt()

public actual fun ldap_escape_filter_elementW(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PWSTR, destlength: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementW(sourcefilterelement, sourcelength.toInt(), destfilterelement, destlength.toInt()).toUInt()

public actual fun ldap_explode_dn(dn: PCSTR, notypes: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_explode_dn(dn, notypes.toInt())

public actual fun ldap_explode_dnA(dn: PCSTR, notypes: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_explode_dnA(dn, notypes.toInt())

public actual fun ldap_explode_dnW(dn: PCWSTR, notypes: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_explode_dnW(dn, notypes.toInt())

public actual fun ldap_extended_operation(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_extended_operation(ld, oid, data, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_extended_operationA(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_extended_operationA(ld, oid, data, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_extended_operationW(ld: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_extended_operationW(ld, oid, data, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_extended_operation_sA(externalhandle: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_extended_operation_sA(externalhandle, oid, data, servercontrols, clientcontrols, returnedoid, returneddata).toUInt()

public actual fun ldap_extended_operation_sW(externalhandle: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_extended_operation_sW(externalhandle, oid, data, servercontrols, clientcontrols, returnedoid, returneddata).toUInt()

public actual fun ldap_first_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_first_attribute(ld, entry, ptr)

public actual fun ldap_first_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_first_attributeA(ld, entry, ptr)

public actual fun ldap_first_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_first_attributeW(ld, entry, ptr)

public actual fun ldap_first_entry(ld: Long, res: Long): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_first_entry(ld, res)

public actual fun ldap_first_reference(ld: Long, res: Long): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_first_reference(ld, res)

public actual fun ldap_free_controls(controls: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_free_controls(controls).toUInt()

public actual fun ldap_free_controlsA(controls: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_free_controlsA(controls).toUInt()

public actual fun ldap_free_controlsW(controls: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_free_controlsW(controls).toUInt()

public actual fun ldap_get_dn(ld: Long, entry: Long): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_dn(ld, entry)

public actual fun ldap_get_dnA(ld: Long, entry: Long): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_dnA(ld, entry)

public actual fun ldap_get_dnW(ld: Long, entry: Long): PWSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_dnW(ld, entry)

public actual fun ldap_get_next_page(externalhandle: Long, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_next_page(externalhandle, searchhandle, pagesize.toInt(), messagenumber).toUInt()

public actual fun ldap_get_next_page_s(externalhandle: Long, searchhandle: PLDAPSearch, timeout: Long, pagesize: UInt, totalcount: Long, results: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_next_page_s(externalhandle, searchhandle, timeout, pagesize.toInt(), totalcount, results).toUInt()

public actual fun ldap_get_option(ld: Long, option: Int, outvalue: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_option(ld, option, outvalue).toUInt()

public actual fun ldap_get_optionW(ld: Long, option: Int, outvalue: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_optionW(ld, option, outvalue).toUInt()

public actual fun ldap_get_paged_count(externalhandle: Long, searchblock: PLDAPSearch, totalcount: Long, results: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_paged_count(externalhandle, searchblock, totalcount, results).toUInt()

public actual fun ldap_get_values(ld: Long, entry: Long, attr: PCSTR): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_values(ld, entry, attr)

public actual fun ldap_get_valuesA(ld: Long, entry: Long, attr: PCSTR): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_valuesA(ld, entry, attr)

public actual fun ldap_get_valuesW(ld: Long, entry: Long, attr: PCWSTR): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_valuesW(ld, entry, attr)

public actual fun ldap_get_values_len(externalhandle: Long, message: Long, attr: PCSTR): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_values_len(externalhandle, message, attr)

public actual fun ldap_get_values_lenA(externalhandle: Long, message: Long, attr: PCSTR): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_values_lenA(externalhandle, message, attr)

public actual fun ldap_get_values_lenW(externalhandle: Long, message: Long, attr: PCWSTR): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_get_values_lenW(externalhandle, message, attr)

public actual fun ldap_init(hostname: PCSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_init(hostname, portnumber.toInt())

public actual fun ldap_initA(hostname: PCSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_initA(hostname, portnumber.toInt())

public actual fun ldap_initW(hostname: PCWSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_initW(hostname, portnumber.toInt())

public actual fun ldap_memfree(block: PCSTR) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_memfree(block)
}

public actual fun ldap_memfreeA(block: PCSTR) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_memfreeA(block)
}

public actual fun ldap_memfreeW(block: PCWSTR) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_memfreeW(block)
}

public actual fun ldap_modify(ld: Long, dn: PCSTR, mods: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify(ld, dn, mods).toUInt()

public actual fun ldap_modifyA(ld: Long, dn: PCSTR, mods: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modifyA(ld, dn, mods).toUInt()

public actual fun ldap_modifyW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modifyW(ld, dn, mods).toUInt()

public actual fun ldap_modify_ext(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_ext(ld, dn, mods, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_modify_extA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_extA(ld, dn, mods, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_modify_extW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_extW(ld, dn, mods, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_modify_ext_s(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_ext_s(ld, dn, mods, servercontrols, clientcontrols).toUInt()

public actual fun ldap_modify_ext_sA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_ext_sA(ld, dn, mods, servercontrols, clientcontrols).toUInt()

public actual fun ldap_modify_ext_sW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_ext_sW(ld, dn, mods, servercontrols, clientcontrols).toUInt()

public actual fun ldap_modify_s(ld: Long, dn: PCSTR, mods: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_s(ld, dn, mods).toUInt()

public actual fun ldap_modify_sA(ld: Long, dn: PCSTR, mods: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_sA(ld, dn, mods).toUInt()

public actual fun ldap_modify_sW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modify_sW(ld, dn, mods).toUInt()

public actual fun ldap_modrdn(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn(externalhandle, distinguishedname, newdistinguishedname).toUInt()

public actual fun ldap_modrdn2(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn2(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn).toUInt()

public actual fun ldap_modrdn2A(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn2A(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn).toUInt()

public actual fun ldap_modrdn2W(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn2W(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn).toUInt()

public actual fun ldap_modrdn2_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn2_s(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn).toUInt()

public actual fun ldap_modrdn2_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn2_sA(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn).toUInt()

public actual fun ldap_modrdn2_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn2_sW(externalhandle, distinguishedname, newdistinguishedname, deleteoldrdn).toUInt()

public actual fun ldap_modrdnA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdnA(externalhandle, distinguishedname, newdistinguishedname).toUInt()

public actual fun ldap_modrdnW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdnW(externalhandle, distinguishedname, newdistinguishedname).toUInt()

public actual fun ldap_modrdn_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn_s(externalhandle, distinguishedname, newdistinguishedname).toUInt()

public actual fun ldap_modrdn_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn_sA(externalhandle, distinguishedname, newdistinguishedname).toUInt()

public actual fun ldap_modrdn_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_modrdn_sW(externalhandle, distinguishedname, newdistinguishedname).toUInt()

public actual fun ldap_msgfree(res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_msgfree(res).toUInt()

public actual fun ldap_next_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_next_attribute(ld, entry, ptr)

public actual fun ldap_next_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_next_attributeA(ld, entry, ptr)

public actual fun ldap_next_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_next_attributeW(ld, entry, ptr)

public actual fun ldap_next_entry(ld: Long, entry: Long): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_next_entry(ld, entry)

public actual fun ldap_next_reference(ld: Long, entry: Long): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_next_reference(ld, entry)

public actual fun ldap_open(hostname: PCSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_open(hostname, portnumber.toInt())

public actual fun ldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_openA(hostname, portnumber.toInt())

public actual fun ldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_openW(hostname, portnumber.toInt())

public actual fun ldap_parse_extended_resultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultA(connection, resultmessage, resultoid, resultdata, freeit).toUInt()

public actual fun ldap_parse_extended_resultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultW(connection, resultmessage, resultoid, resultdata, freeit).toUInt()

public actual fun ldap_parse_page_control(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_page_control(externalhandle, servercontrols, totalcount, cookie).toUInt()

public actual fun ldap_parse_page_controlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_page_controlA(externalhandle, servercontrols, totalcount, cookie).toUInt()

public actual fun ldap_parse_page_controlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_page_controlW(externalhandle, servercontrols, totalcount, cookie).toUInt()

public actual fun ldap_parse_reference(connection: Long, resultmessage: Long, referrals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_reference(connection, resultmessage, referrals).toUInt()

public actual fun ldap_parse_referenceA(connection: Long, resultmessage: Long, referrals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_referenceA(connection, resultmessage, referrals).toUInt()

public actual fun ldap_parse_referenceW(connection: Long, resultmessage: Long, referrals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_referenceW(connection, resultmessage, referrals).toUInt()

public actual fun ldap_parse_result(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_result(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, freeit).toUInt()

public actual fun ldap_parse_resultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_resultA(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, freeit).toUInt()

public actual fun ldap_parse_resultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_resultW(connection, resultmessage, returncode, matcheddns, errormessage, referrals, servercontrols, freeit).toUInt()

public actual fun ldap_parse_sort_control(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_sort_control(externalhandle, control, result, attribute).toUInt()

public actual fun ldap_parse_sort_controlA(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlA(externalhandle, control, result, attribute).toUInt()

public actual fun ldap_parse_sort_controlW(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlW(externalhandle, control, result, attribute).toUInt()

public actual fun ldap_parse_vlv_controlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlA(externalhandle, control, targetpos, listcount, context, errcode)

public actual fun ldap_parse_vlv_controlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlW(externalhandle, control, targetpos, listcount, context, errcode)

public actual fun ldap_perror(ld: Long, msg: PCSTR) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_perror(ld, msg)
}

public actual fun ldap_rename_ext(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_rename_ext(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_rename_extA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_rename_extA(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_rename_extW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_rename_extW(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols, messagenumber).toUInt()

public actual fun ldap_rename_ext_s(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_rename_ext_s(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols).toUInt()

public actual fun ldap_rename_ext_sA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_rename_ext_sA(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols).toUInt()

public actual fun ldap_rename_ext_sW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_rename_ext_sW(ld, dn, newrdn, newparent, deleteoldrdn, servercontrols, clientcontrols).toUInt()

public actual fun ldap_result(ld: Long, msgid: UInt, all: UInt, timeout: Long, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_result(ld, msgid.toInt(), all.toInt(), timeout, res).toUInt()

public actual fun ldap_result2error(ld: Long, res: Long, freeit: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_result2error(ld, res, freeit.toInt()).toUInt()

public actual fun ldap_sasl_bindA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_sasl_bindA(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, messagenumber)

public actual fun ldap_sasl_bindW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_sasl_bindW(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, messagenumber)

public actual fun ldap_sasl_bind_sA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sA(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, serverdata)

public actual fun ldap_sasl_bind_sW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sW(externalhandle, distname, authmechanism, cred, serverctrls, clientctrls, serverdata)

public actual fun ldap_search(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt()).toUInt()

public actual fun ldap_searchA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_searchA(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt()).toUInt()

public actual fun ldap_searchW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_searchW(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt()).toUInt()

public actual fun ldap_search_abandon_page(externalhandle: Long, searchblock: PLDAPSearch): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_abandon_page(externalhandle, searchblock).toUInt()

public actual fun ldap_search_ext(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_ext(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), servercontrols, clientcontrols, timelimit.toInt(), sizelimit.toInt(), messagenumber).toUInt()

public actual fun ldap_search_extA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_extA(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), servercontrols, clientcontrols, timelimit.toInt(), sizelimit.toInt(), messagenumber).toUInt()

public actual fun ldap_search_extW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_extW(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), servercontrols, clientcontrols, timelimit.toInt(), sizelimit.toInt(), messagenumber).toUInt()

public actual fun ldap_search_ext_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_ext_s(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), servercontrols, clientcontrols, timeout, sizelimit.toInt(), res).toUInt()

public actual fun ldap_search_ext_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_ext_sA(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), servercontrols, clientcontrols, timeout, sizelimit.toInt(), res).toUInt()

public actual fun ldap_search_ext_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_ext_sW(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), servercontrols, clientcontrols, timeout, sizelimit.toInt(), res).toUInt()

public actual fun ldap_search_init_page(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_init_page(externalhandle, distinguishedname, scopeofsearch.toInt(), searchfilter, attributelist, attributesonly.toInt(), servercontrols, clientcontrols, pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys)

public actual fun ldap_search_init_pageA(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_init_pageA(externalhandle, distinguishedname, scopeofsearch.toInt(), searchfilter, attributelist, attributesonly.toInt(), servercontrols, clientcontrols, pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys)

public actual fun ldap_search_init_pageW(externalhandle: Long, distinguishedname: PCWSTR, scopeofsearch: UInt, searchfilter: PCWSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_init_pageW(externalhandle, distinguishedname, scopeofsearch.toInt(), searchfilter, attributelist, attributesonly.toInt(), servercontrols, clientcontrols, pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys)

public actual fun ldap_search_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_s(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), res).toUInt()

public actual fun ldap_search_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_sA(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), res).toUInt()

public actual fun ldap_search_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_sW(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), res).toUInt()

public actual fun ldap_search_st(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_st(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), timeout, res).toUInt()

public actual fun ldap_search_stA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_stA(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), timeout, res).toUInt()

public actual fun ldap_search_stW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_search_stW(ld, base, scope.toInt(), filter, attrs, attrsonly.toInt(), timeout, res).toUInt()

public actual fun ldap_set_dbg_flags(newflags: UInt): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_set_dbg_flags(newflags.toInt()).toUInt()

public actual fun ldap_set_dbg_routine(debugprintroutine: DBGPRINT) {
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_set_dbg_routine(debugprintroutine.toLong())
}

public actual fun ldap_set_option(ld: Long, option: Int, invalue: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_set_option(ld, option, invalue).toUInt()

public actual fun ldap_set_optionW(ld: Long, option: Int, invalue: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_set_optionW(ld, option, invalue).toUInt()

public actual fun ldap_simple_bind(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_simple_bind(ld, dn, passwd).toUInt()

public actual fun ldap_simple_bindA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_simple_bindA(ld, dn, passwd).toUInt()

public actual fun ldap_simple_bindW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_simple_bindW(ld, dn, passwd).toUInt()

public actual fun ldap_simple_bind_s(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_simple_bind_s(ld, dn, passwd).toUInt()

public actual fun ldap_simple_bind_sA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_simple_bind_sA(ld, dn, passwd).toUInt()

public actual fun ldap_simple_bind_sW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_simple_bind_sW(ld, dn, passwd).toUInt()

public actual fun ldap_sslinit(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_sslinit(hostname, portnumber.toInt(), secure)

public actual fun ldap_sslinitA(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_sslinitA(hostname, portnumber.toInt(), secure)

public actual fun ldap_sslinitW(hostname: PCWSTR, portnumber: UInt, secure: Int): Long =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_sslinitW(hostname, portnumber.toInt(), secure)

public actual fun ldap_start_tls_sA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_start_tls_sA(externalhandle, serverreturnvalue, result, servercontrols, clientcontrols).toUInt()

public actual fun ldap_start_tls_sW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_start_tls_sW(externalhandle, serverreturnvalue, result, servercontrols, clientcontrols).toUInt()

public actual fun ldap_startup(version: Long, instance: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_startup(version, instance).toUInt()

public actual fun ldap_stop_tls_s(externalhandle: Long): Boolean =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_stop_tls_s(externalhandle)

public actual fun ldap_ufn2dn(ufn: PCSTR, pdn: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_ufn2dn(ufn, pdn).toUInt()

public actual fun ldap_ufn2dnA(ufn: PCSTR, pdn: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_ufn2dnA(ufn, pdn).toUInt()

public actual fun ldap_ufn2dnW(ufn: PCWSTR, pdn: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_ufn2dnW(ufn, pdn).toUInt()

public actual fun ldap_unbind(ld: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_unbind(ld).toUInt()

public actual fun ldap_unbind_s(ld: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_unbind_s(ld).toUInt()

public actual fun ldap_value_free(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_value_free(vals).toUInt()

public actual fun ldap_value_freeA(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_value_freeA(vals).toUInt()

public actual fun ldap_value_freeW(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_value_freeW(vals).toUInt()

public actual fun ldap_value_free_len(vals: Long): UInt =
    WindowsWin32NetworkingLdapJniBridge.windowssys_windows_win32_networking_ldap_ldap_value_free_len(vals).toUInt()
