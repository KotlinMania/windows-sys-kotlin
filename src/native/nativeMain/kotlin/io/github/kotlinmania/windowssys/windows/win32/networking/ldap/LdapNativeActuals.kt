@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun LdapGetLastError(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_LdapGetLastError()

public actual fun LdapMapErrorToWin32(ldaperror: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_LdapMapErrorToWin32(ldaperror)

public actual fun LdapUTF8ToUnicode(lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_LdapUTF8ToUnicode(lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpdeststr.toCPointer<ByteVar>(), cchdest)

public actual fun LdapUnicodeToUTF8(lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_LdapUnicodeToUTF8(lpsrcstr.toCPointer<ByteVar>(), cchsrc, lpdeststr.toCPointer<ByteVar>(), cchdest)

public actual fun ber_alloc_t(options: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_alloc_t(options)?.toLong() ?: 0L

public actual fun ber_bvdup(pberval: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_bvdup(pberval.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ber_bvecfree(pberval: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_bvecfree(pberval.toCPointer<ByteVar>())
}

public actual fun ber_bvfree(bv: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_bvfree(bv.toCPointer<ByteVar>())
}

public actual fun ber_first_element(pberelement: Long, plen: Long, ppopaque: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_first_element(pberelement.toCPointer<ByteVar>(), plen.toCPointer<ByteVar>(), ppopaque.toCPointer<ByteVar>())

public actual fun ber_flatten(pberelement: Long, pberval: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_flatten(pberelement.toCPointer<ByteVar>(), pberval.toCPointer<ByteVar>())

public actual fun ber_free(pberelement: Long, fbuf: Int) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_free(pberelement.toCPointer<ByteVar>(), fbuf)
}

public actual fun ber_init(pberval: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_init(pberval.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ber_next_element(pberelement: Long, plen: Long, opaque: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_next_element(pberelement.toCPointer<ByteVar>(), plen.toCPointer<ByteVar>(), opaque.toCPointer<ByteVar>())

public actual fun ber_peek_tag(pberelement: Long, plen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_peek_tag(pberelement.toCPointer<ByteVar>(), plen.toCPointer<ByteVar>())

public actual fun ber_printf(pberelement: Long, fmt: PCSTR): Int =
    0

public actual fun ber_scanf(pberelement: Long, fmt: PCSTR): UInt =
    0u

public actual fun ber_skip_tag(pberelement: Long, plen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ber_skip_tag(pberelement.toCPointer<ByteVar>(), plen.toCPointer<ByteVar>())

public actual fun cldap_open(hostname: PCSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_cldap_open(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun cldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_cldap_openA(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun cldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_cldap_openW(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun ldap_abandon(ld: Long, msgid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_abandon(ld.toCPointer<ByteVar>(), msgid)

public actual fun ldap_add(ld: Long, dn: PCSTR, attrs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>())

public actual fun ldap_addA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_addA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>())

public actual fun ldap_addW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_addW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>())

public actual fun ldap_add_ext(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_ext(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_add_extA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_extA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_add_extW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_extW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_add_ext_s(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_ext_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_add_ext_sA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_ext_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_add_ext_sW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_ext_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_add_s(ld: Long, dn: PCSTR, attrs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>())

public actual fun ldap_add_sA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>())

public actual fun ldap_add_sW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_add_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>())

public actual fun ldap_bind(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_bind(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), method)

public actual fun ldap_bindA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_bindA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), method)

public actual fun ldap_bindW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_bindW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), method)

public actual fun ldap_bind_s(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_bind_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), method)

public actual fun ldap_bind_sA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_bind_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), method)

public actual fun ldap_bind_sW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_bind_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), method)

public actual fun ldap_check_filterA(ld: Long, searchfilter: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_check_filterA(ld.toCPointer<ByteVar>(), searchfilter.toCPointer<ByteVar>())

public actual fun ldap_check_filterW(ld: Long, searchfilter: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_check_filterW(ld.toCPointer<ByteVar>(), searchfilter.toCPointer<ByteVar>())

public actual fun ldap_cleanup(hinstance: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_cleanup(hinstance.toCPointer<ByteVar>())

public actual fun ldap_close_extended_op(ld: Long, messagenumber: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_close_extended_op(ld.toCPointer<ByteVar>(), messagenumber)

public actual fun ldap_compare(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun ldap_compareA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compareA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun ldap_compareW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compareW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun ldap_compare_ext(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_ext(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_compare_extA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_extA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_compare_extW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_extW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_compare_ext_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_ext_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_compare_ext_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_ext_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_compare_ext_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_ext_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_compare_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun ldap_compare_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun ldap_compare_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_compare_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun ldap_conn_from_msg(primaryconn: Long, res: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_conn_from_msg(primaryconn.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_connect(ld: Long, timeout: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_connect(ld.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>())

public actual fun ldap_control_free(control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_control_free(control.toCPointer<ByteVar>())

public actual fun ldap_control_freeA(controls: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_control_freeA(controls.toCPointer<ByteVar>())

public actual fun ldap_control_freeW(control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_control_freeW(control.toCPointer<ByteVar>())

public actual fun ldap_controls_free(controls: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_controls_free(controls.toCPointer<ByteVar>())

public actual fun ldap_controls_freeA(controls: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_controls_freeA(controls.toCPointer<ByteVar>())

public actual fun ldap_controls_freeW(control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_controls_freeW(control.toCPointer<ByteVar>())

public actual fun ldap_count_entries(ld: Long, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_count_entries(ld.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())

public actual fun ldap_count_references(ld: Long, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_count_references(ld.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())

public actual fun ldap_count_values(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_count_values(vals.toCPointer<ByteVar>())

public actual fun ldap_count_valuesA(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_count_valuesA(vals.toCPointer<ByteVar>())

public actual fun ldap_count_valuesW(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_count_valuesW(vals.toCPointer<ByteVar>())

public actual fun ldap_count_values_len(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_count_values_len(vals.toCPointer<ByteVar>())

public actual fun ldap_create_page_control(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_page_control(externalhandle.toCPointer<ByteVar>(), pagesize, cookie.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_create_page_controlA(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_page_controlA(externalhandle.toCPointer<ByteVar>(), pagesize, cookie.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_create_page_controlW(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_page_controlW(externalhandle.toCPointer<ByteVar>(), pagesize, cookie.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_create_sort_control(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_sort_control(externalhandle.toCPointer<ByteVar>(), sortkeys.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_create_sort_controlA(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_sort_controlA(externalhandle.toCPointer<ByteVar>(), sortkeys.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_create_sort_controlW(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_sort_controlW(externalhandle.toCPointer<ByteVar>(), sortkeys.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_create_vlv_controlA(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlA(externalhandle.toCPointer<ByteVar>(), vlvinfo.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_create_vlv_controlW(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlW(externalhandle.toCPointer<ByteVar>(), vlvinfo.toCPointer<ByteVar>(), iscritical, control.toCPointer<ByteVar>())

public actual fun ldap_delete(ld: Long, dn: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>())

public actual fun ldap_deleteA(ld: Long, dn: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_deleteA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>())

public actual fun ldap_deleteW(ld: Long, dn: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_deleteW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>())

public actual fun ldap_delete_ext(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_ext(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_delete_extA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_extA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_delete_extW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_extW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_delete_ext_s(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_ext_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_delete_ext_sA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_ext_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_delete_ext_sW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_ext_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_delete_s(ld: Long, dn: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>())

public actual fun ldap_delete_sA(ld: Long, dn: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>())

public actual fun ldap_delete_sW(ld: Long, dn: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_delete_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>())

public actual fun ldap_dn2ufn(dn: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_dn2ufn(dn.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_dn2ufnA(dn: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_dn2ufnA(dn.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_dn2ufnW(dn: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_dn2ufnW(dn.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_encode_sort_controlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlA(externalhandle.toCPointer<ByteVar>(), sortkeys.toCPointer<ByteVar>(), control.toCPointer<ByteVar>(), criticality)

public actual fun ldap_encode_sort_controlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlW(externalhandle.toCPointer<ByteVar>(), sortkeys.toCPointer<ByteVar>(), control.toCPointer<ByteVar>(), criticality)

public actual fun ldap_err2string(err: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_err2string(err)?.toLong() ?: 0L

public actual fun ldap_err2stringA(err: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_err2stringA(err)?.toLong() ?: 0L

public actual fun ldap_err2stringW(err: UInt): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_err2stringW(err)?.toLong() ?: 0L

public actual fun ldap_escape_filter_element(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_escape_filter_element(sourcefilterelement.toCPointer<ByteVar>(), sourcelength, destfilterelement.toCPointer<ByteVar>(), destlength)

public actual fun ldap_escape_filter_elementA(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementA(sourcefilterelement.toCPointer<ByteVar>(), sourcelength, destfilterelement.toCPointer<ByteVar>(), destlength)

public actual fun ldap_escape_filter_elementW(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PWSTR, destlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementW(sourcefilterelement.toCPointer<ByteVar>(), sourcelength, destfilterelement.toCPointer<ByteVar>(), destlength)

public actual fun ldap_explode_dn(dn: PCSTR, notypes: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_explode_dn(dn.toCPointer<ByteVar>(), notypes)?.toLong() ?: 0L

public actual fun ldap_explode_dnA(dn: PCSTR, notypes: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_explode_dnA(dn.toCPointer<ByteVar>(), notypes)?.toLong() ?: 0L

public actual fun ldap_explode_dnW(dn: PCWSTR, notypes: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_explode_dnW(dn.toCPointer<ByteVar>(), notypes)?.toLong() ?: 0L

public actual fun ldap_extended_operation(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_extended_operation(ld.toCPointer<ByteVar>(), oid.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_extended_operationA(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_extended_operationA(ld.toCPointer<ByteVar>(), oid.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_extended_operationW(ld: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_extended_operationW(ld.toCPointer<ByteVar>(), oid.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_extended_operation_sA(externalhandle: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_extended_operation_sA(externalhandle.toCPointer<ByteVar>(), oid.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), returnedoid.toCPointer<ByteVar>(), returneddata.toCPointer<ByteVar>())

public actual fun ldap_extended_operation_sW(externalhandle: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_extended_operation_sW(externalhandle.toCPointer<ByteVar>(), oid.toCPointer<ByteVar>(), data.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), returnedoid.toCPointer<ByteVar>(), returneddata.toCPointer<ByteVar>())

public actual fun ldap_first_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_first_attribute(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_first_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_first_attributeA(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_first_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_first_attributeW(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_first_entry(ld: Long, res: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_first_entry(ld.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_first_reference(ld: Long, res: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_first_reference(ld.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_free_controls(controls: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_free_controls(controls.toCPointer<ByteVar>())

public actual fun ldap_free_controlsA(controls: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_free_controlsA(controls.toCPointer<ByteVar>())

public actual fun ldap_free_controlsW(controls: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_free_controlsW(controls.toCPointer<ByteVar>())

public actual fun ldap_get_dn(ld: Long, entry: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_dn(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_dnA(ld: Long, entry: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_dnA(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_dnW(ld: Long, entry: Long): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_dnW(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_next_page(externalhandle: Long, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_next_page(externalhandle.toCPointer<ByteVar>(), searchhandle, pagesize, messagenumber.toCPointer<ByteVar>())

public actual fun ldap_get_next_page_s(externalhandle: Long, searchhandle: PLDAPSearch, timeout: Long, pagesize: UInt, totalcount: Long, results: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_next_page_s(externalhandle.toCPointer<ByteVar>(), searchhandle, timeout.toCPointer<ByteVar>(), pagesize, totalcount.toCPointer<ByteVar>(), results.toCPointer<ByteVar>())

public actual fun ldap_get_option(ld: Long, option: Int, outvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_option(ld.toCPointer<ByteVar>(), option, outvalue.toCPointer<ByteVar>())

public actual fun ldap_get_optionW(ld: Long, option: Int, outvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_optionW(ld.toCPointer<ByteVar>(), option, outvalue.toCPointer<ByteVar>())

public actual fun ldap_get_paged_count(externalhandle: Long, searchblock: PLDAPSearch, totalcount: Long, results: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_paged_count(externalhandle.toCPointer<ByteVar>(), searchblock, totalcount.toCPointer<ByteVar>(), results.toCPointer<ByteVar>())

public actual fun ldap_get_values(ld: Long, entry: Long, attr: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_values(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_valuesA(ld: Long, entry: Long, attr: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_valuesA(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_valuesW(ld: Long, entry: Long, attr: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_valuesW(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_values_len(externalhandle: Long, message: Long, attr: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_values_len(externalhandle.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_values_lenA(externalhandle: Long, message: Long, attr: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_values_lenA(externalhandle.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_get_values_lenW(externalhandle: Long, message: Long, attr: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_get_values_lenW(externalhandle.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), attr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_init(hostname: PCSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_init(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun ldap_initA(hostname: PCSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_initA(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun ldap_initW(hostname: PCWSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_initW(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun ldap_memfree(block: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_memfree(block.toCPointer<ByteVar>())
}

public actual fun ldap_memfreeA(block: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_memfreeA(block.toCPointer<ByteVar>())
}

public actual fun ldap_memfreeW(block: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_memfreeW(block.toCPointer<ByteVar>())
}

public actual fun ldap_modify(ld: Long, dn: PCSTR, mods: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>())

public actual fun ldap_modifyA(ld: Long, dn: PCSTR, mods: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modifyA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>())

public actual fun ldap_modifyW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modifyW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>())

public actual fun ldap_modify_ext(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_ext(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_modify_extA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_extA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_modify_extW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_extW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_modify_ext_s(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_ext_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_modify_ext_sA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_ext_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_modify_ext_sW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_ext_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_modify_s(ld: Long, dn: PCSTR, mods: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>())

public actual fun ldap_modify_sA(ld: Long, dn: PCSTR, mods: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>())

public actual fun ldap_modify_sW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modify_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), mods.toCPointer<ByteVar>())

public actual fun ldap_modrdn(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>())

public actual fun ldap_modrdn2(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn2(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldap_modrdn2A(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn2A(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldap_modrdn2W(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn2W(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldap_modrdn2_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn2_s(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldap_modrdn2_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn2_sA(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldap_modrdn2_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn2_sW(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldap_modrdnA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdnA(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>())

public actual fun ldap_modrdnW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdnW(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>())

public actual fun ldap_modrdn_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn_s(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>())

public actual fun ldap_modrdn_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn_sA(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>())

public actual fun ldap_modrdn_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_modrdn_sW(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), newdistinguishedname.toCPointer<ByteVar>())

public actual fun ldap_msgfree(res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_msgfree(res.toCPointer<ByteVar>())

public actual fun ldap_next_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_next_attribute(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_next_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_next_attributeA(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_next_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_next_attributeW(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>(), ptr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_next_entry(ld: Long, entry: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_next_entry(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_next_reference(ld: Long, entry: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_next_reference(ld.toCPointer<ByteVar>(), entry.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ldap_open(hostname: PCSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_open(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun ldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_openA(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun ldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_openW(hostname.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L

public actual fun ldap_parse_extended_resultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultA(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), resultoid.toCPointer<ByteVar>(), resultdata.toCPointer<ByteVar>(), freeit)

public actual fun ldap_parse_extended_resultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultW(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), resultoid.toCPointer<ByteVar>(), resultdata.toCPointer<ByteVar>(), freeit)

public actual fun ldap_parse_page_control(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_page_control(externalhandle.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), totalcount.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>())

public actual fun ldap_parse_page_controlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_page_controlA(externalhandle.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), totalcount.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>())

public actual fun ldap_parse_page_controlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_page_controlW(externalhandle.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), totalcount.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>())

public actual fun ldap_parse_reference(connection: Long, resultmessage: Long, referrals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_reference(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), referrals.toCPointer<ByteVar>())

public actual fun ldap_parse_referenceA(connection: Long, resultmessage: Long, referrals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_referenceA(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), referrals.toCPointer<ByteVar>())

public actual fun ldap_parse_referenceW(connection: Long, resultmessage: Long, referrals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_referenceW(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), referrals.toCPointer<ByteVar>())

public actual fun ldap_parse_result(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_result(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), returncode.toCPointer<ByteVar>(), matcheddns.toCPointer<ByteVar>(), errormessage.toCPointer<ByteVar>(), referrals.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), freeit)

public actual fun ldap_parse_resultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_resultA(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), returncode.toCPointer<ByteVar>(), matcheddns.toCPointer<ByteVar>(), errormessage.toCPointer<ByteVar>(), referrals.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), freeit)

public actual fun ldap_parse_resultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_resultW(connection.toCPointer<ByteVar>(), resultmessage.toCPointer<ByteVar>(), returncode.toCPointer<ByteVar>(), matcheddns.toCPointer<ByteVar>(), errormessage.toCPointer<ByteVar>(), referrals.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), freeit)

public actual fun ldap_parse_sort_control(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_sort_control(externalhandle.toCPointer<ByteVar>(), control.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), attribute.toCPointer<ByteVar>())

public actual fun ldap_parse_sort_controlA(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlA(externalhandle.toCPointer<ByteVar>(), control.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), attribute.toCPointer<ByteVar>())

public actual fun ldap_parse_sort_controlW(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlW(externalhandle.toCPointer<ByteVar>(), control.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), attribute.toCPointer<ByteVar>())

public actual fun ldap_parse_vlv_controlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlA(externalhandle.toCPointer<ByteVar>(), control.toCPointer<ByteVar>(), targetpos.toCPointer<ByteVar>(), listcount.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), errcode.toCPointer<ByteVar>())

public actual fun ldap_parse_vlv_controlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlW(externalhandle.toCPointer<ByteVar>(), control.toCPointer<ByteVar>(), targetpos.toCPointer<ByteVar>(), listcount.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), errcode.toCPointer<ByteVar>())

public actual fun ldap_perror(ld: Long, msg: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_perror(ld.toCPointer<ByteVar>(), msg.toCPointer<ByteVar>())
}

public actual fun ldap_rename_ext(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_rename_ext(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), newrdn.toCPointer<ByteVar>(), newparent.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_rename_extA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_rename_extA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), newrdn.toCPointer<ByteVar>(), newparent.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_rename_extW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_rename_extW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), newrdn.toCPointer<ByteVar>(), newparent.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_rename_ext_s(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_rename_ext_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), newrdn.toCPointer<ByteVar>(), newparent.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_rename_ext_sA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_rename_ext_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), newrdn.toCPointer<ByteVar>(), newparent.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_rename_ext_sW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_rename_ext_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), newrdn.toCPointer<ByteVar>(), newparent.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_result(ld: Long, msgid: UInt, all: UInt, timeout: Long, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_result(ld.toCPointer<ByteVar>(), msgid, all, timeout.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())

public actual fun ldap_result2error(ld: Long, res: Long, freeit: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_result2error(ld.toCPointer<ByteVar>(), res.toCPointer<ByteVar>(), freeit)

public actual fun ldap_sasl_bindA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_sasl_bindA(externalhandle.toCPointer<ByteVar>(), distname.toCPointer<ByteVar>(), authmechanism.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), serverctrls.toCPointer<ByteVar>(), clientctrls.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_sasl_bindW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_sasl_bindW(externalhandle.toCPointer<ByteVar>(), distname.toCPointer<ByteVar>(), authmechanism.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), serverctrls.toCPointer<ByteVar>(), clientctrls.toCPointer<ByteVar>(), messagenumber.toCPointer<ByteVar>())

public actual fun ldap_sasl_bind_sA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sA(externalhandle.toCPointer<ByteVar>(), distname.toCPointer<ByteVar>(), authmechanism.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), serverctrls.toCPointer<ByteVar>(), clientctrls.toCPointer<ByteVar>(), serverdata.toCPointer<ByteVar>())

public actual fun ldap_sasl_bind_sW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sW(externalhandle.toCPointer<ByteVar>(), distname.toCPointer<ByteVar>(), authmechanism.toCPointer<ByteVar>(), cred.toCPointer<ByteVar>(), serverctrls.toCPointer<ByteVar>(), clientctrls.toCPointer<ByteVar>(), serverdata.toCPointer<ByteVar>())

public actual fun ldap_search(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly)

public actual fun ldap_searchA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_searchA(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly)

public actual fun ldap_searchW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_searchW(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly)

public actual fun ldap_search_abandon_page(externalhandle: Long, searchblock: PLDAPSearch): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_abandon_page(externalhandle.toCPointer<ByteVar>(), searchblock)

public actual fun ldap_search_ext(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_ext(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber.toCPointer<ByteVar>())

public actual fun ldap_search_extA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_extA(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber.toCPointer<ByteVar>())

public actual fun ldap_search_extW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_extW(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber.toCPointer<ByteVar>())

public actual fun ldap_search_ext_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_ext_s(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), sizelimit, res.toCPointer<ByteVar>())

public actual fun ldap_search_ext_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_ext_sA(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), sizelimit, res.toCPointer<ByteVar>())

public actual fun ldap_search_ext_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_ext_sW(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), sizelimit, res.toCPointer<ByteVar>())

public actual fun ldap_search_init_page(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_init_page(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), scopeofsearch, searchfilter.toCPointer<ByteVar>(), attributelist.toCPointer<ByteVar>(), attributesonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys.toCPointer<ByteVar>())

public actual fun ldap_search_init_pageA(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_init_pageA(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), scopeofsearch, searchfilter.toCPointer<ByteVar>(), attributelist.toCPointer<ByteVar>(), attributesonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys.toCPointer<ByteVar>())

public actual fun ldap_search_init_pageW(externalhandle: Long, distinguishedname: PCWSTR, scopeofsearch: UInt, searchfilter: PCWSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_init_pageW(externalhandle.toCPointer<ByteVar>(), distinguishedname.toCPointer<ByteVar>(), scopeofsearch, searchfilter.toCPointer<ByteVar>(), attributelist.toCPointer<ByteVar>(), attributesonly, servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys.toCPointer<ByteVar>())

public actual fun ldap_search_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_s(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, res.toCPointer<ByteVar>())

public actual fun ldap_search_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_sA(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, res.toCPointer<ByteVar>())

public actual fun ldap_search_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_sW(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, res.toCPointer<ByteVar>())

public actual fun ldap_search_st(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_st(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, timeout.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())

public actual fun ldap_search_stA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_stA(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, timeout.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())

public actual fun ldap_search_stW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_search_stW(ld.toCPointer<ByteVar>(), base.toCPointer<ByteVar>(), scope, filter.toCPointer<ByteVar>(), attrs.toCPointer<ByteVar>(), attrsonly, timeout.toCPointer<ByteVar>(), res.toCPointer<ByteVar>())

public actual fun ldap_set_dbg_flags(newflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_set_dbg_flags(newflags)

public actual fun ldap_set_dbg_routine(debugprintroutine: DBGPRINT) {
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_set_dbg_routine(debugprintroutine.toLong().toCPointer<ByteVar>())
}

public actual fun ldap_set_option(ld: Long, option: Int, invalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_set_option(ld.toCPointer<ByteVar>(), option, invalue.toCPointer<ByteVar>())

public actual fun ldap_set_optionW(ld: Long, option: Int, invalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_set_optionW(ld.toCPointer<ByteVar>(), option, invalue.toCPointer<ByteVar>())

public actual fun ldap_simple_bind(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_simple_bind(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun ldap_simple_bindA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_simple_bindA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun ldap_simple_bindW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_simple_bindW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun ldap_simple_bind_s(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_simple_bind_s(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun ldap_simple_bind_sA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_simple_bind_sA(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun ldap_simple_bind_sW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_simple_bind_sW(ld.toCPointer<ByteVar>(), dn.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun ldap_sslinit(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_sslinit(hostname.toCPointer<ByteVar>(), portnumber, secure)?.toLong() ?: 0L

public actual fun ldap_sslinitA(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_sslinitA(hostname.toCPointer<ByteVar>(), portnumber, secure)?.toLong() ?: 0L

public actual fun ldap_sslinitW(hostname: PCWSTR, portnumber: UInt, secure: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_sslinitW(hostname.toCPointer<ByteVar>(), portnumber, secure)?.toLong() ?: 0L

public actual fun ldap_start_tls_sA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_start_tls_sA(externalhandle.toCPointer<ByteVar>(), serverreturnvalue.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_start_tls_sW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_start_tls_sW(externalhandle.toCPointer<ByteVar>(), serverreturnvalue.toCPointer<ByteVar>(), result.toCPointer<ByteVar>(), servercontrols.toCPointer<ByteVar>(), clientcontrols.toCPointer<ByteVar>())

public actual fun ldap_startup(version: Long, instance: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_startup(version.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>())

public actual fun ldap_stop_tls_s(externalhandle: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_stop_tls_s(externalhandle.toCPointer<ByteVar>())

public actual fun ldap_ufn2dn(ufn: PCSTR, pdn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_ufn2dn(ufn.toCPointer<ByteVar>(), pdn.toCPointer<ByteVar>())

public actual fun ldap_ufn2dnA(ufn: PCSTR, pdn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_ufn2dnA(ufn.toCPointer<ByteVar>(), pdn.toCPointer<ByteVar>())

public actual fun ldap_ufn2dnW(ufn: PCWSTR, pdn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_ufn2dnW(ufn.toCPointer<ByteVar>(), pdn.toCPointer<ByteVar>())

public actual fun ldap_unbind(ld: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_unbind(ld.toCPointer<ByteVar>())

public actual fun ldap_unbind_s(ld: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_unbind_s(ld.toCPointer<ByteVar>())

public actual fun ldap_value_free(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_value_free(vals.toCPointer<ByteVar>())

public actual fun ldap_value_freeA(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_value_freeA(vals.toCPointer<ByteVar>())

public actual fun ldap_value_freeW(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_value_freeW(vals.toCPointer<ByteVar>())

public actual fun ldap_value_free_len(vals: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssys_windows_win32_networking_ldap_ldap_value_free_len(vals.toCPointer<ByteVar>())
