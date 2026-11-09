@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

private val _windowsWin32NetworkingLdapNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun LdapGetLastError(): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_LdapGetLastError() as Int).toUInt() else 0u

public actual fun LdapMapErrorToWin32(ldaperror: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_LdapMapErrorToWin32(ldaperror.toInt()) as Int).toUInt() else 0u

public actual fun LdapUTF8ToUnicode(lpsrcstr: PCSTR, cchsrc: Int, lpdeststr: PWSTR, cchdest: Int): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_LdapUTF8ToUnicode(lpsrcstr.toString(), cchsrc, lpdeststr.toString(), cchdest) as Int) else 0

public actual fun LdapUnicodeToUTF8(lpsrcstr: PCWSTR, cchsrc: Int, lpdeststr: PSTR, cchdest: Int): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_LdapUnicodeToUTF8(lpsrcstr.toString(), cchsrc, lpdeststr.toString(), cchdest) as Int) else 0

public actual fun ber_alloc_t(options: Int): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_alloc_t(options) as String).toLong() else 0L

public actual fun ber_bvdup(pberval: Long): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_bvdup(pberval.toString()) as String).toLong() else 0L

public actual fun ber_bvecfree(pberval: Long) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_bvecfree(pberval.toString())
    }
}

public actual fun ber_bvfree(bv: Long) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_bvfree(bv.toString())
    }
}

public actual fun ber_first_element(pberelement: Long, plen: Long, ppopaque: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_first_element(pberelement.toString(), plen.toString(), ppopaque.toString()) as Int).toUInt() else 0u

public actual fun ber_flatten(pberelement: Long, pberval: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_flatten(pberelement.toString(), pberval.toString()) as Int) else 0

public actual fun ber_free(pberelement: Long, fbuf: Int) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_free(pberelement.toString(), fbuf)
    }
}

public actual fun ber_init(pberval: Long): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_init(pberval.toString()) as String).toLong() else 0L

public actual fun ber_next_element(pberelement: Long, plen: Long, opaque: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_next_element(pberelement.toString(), plen.toString(), opaque.toString()) as Int).toUInt() else 0u

public actual fun ber_peek_tag(pberelement: Long, plen: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_peek_tag(pberelement.toString(), plen.toString()) as Int).toUInt() else 0u

public actual fun ber_printf(pberelement: Long, fmt: PCSTR): Int =
    0

public actual fun ber_scanf(pberelement: Long, fmt: PCSTR): UInt =
    0u

public actual fun ber_skip_tag(pberelement: Long, plen: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ber_skip_tag(pberelement.toString(), plen.toString()) as Int).toUInt() else 0u

public actual fun cldap_open(hostname: PCSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_cldap_open(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun cldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_cldap_openA(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun cldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_cldap_openW(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun ldap_abandon(ld: Long, msgid: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_abandon(ld.toString(), msgid.toInt()) as Int).toUInt() else 0u

public actual fun ldap_add(ld: Long, dn: PCSTR, attrs: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add(ld.toString(), dn.toString(), attrs.toString()) as Int).toUInt() else 0u

public actual fun ldap_addA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_addA(ld.toString(), dn.toString(), attrs.toString()) as Int).toUInt() else 0u

public actual fun ldap_addW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_addW(ld.toString(), dn.toString(), attrs.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_ext(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_ext(ld.toString(), dn.toString(), attrs.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_extA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_extA(ld.toString(), dn.toString(), attrs.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_extW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_extW(ld.toString(), dn.toString(), attrs.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_ext_s(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_ext_s(ld.toString(), dn.toString(), attrs.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_ext_sA(ld: Long, dn: PCSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_ext_sA(ld.toString(), dn.toString(), attrs.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_ext_sW(ld: Long, dn: PCWSTR, attrs: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_ext_sW(ld.toString(), dn.toString(), attrs.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_s(ld: Long, dn: PCSTR, attrs: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_s(ld.toString(), dn.toString(), attrs.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_sA(ld: Long, dn: PCSTR, attrs: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_sA(ld.toString(), dn.toString(), attrs.toString()) as Int).toUInt() else 0u

public actual fun ldap_add_sW(ld: Long, dn: PCWSTR, attrs: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_add_sW(ld.toString(), dn.toString(), attrs.toString()) as Int).toUInt() else 0u

public actual fun ldap_bind(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_bind(ld.toString(), dn.toString(), cred.toString(), method.toInt()) as Int).toUInt() else 0u

public actual fun ldap_bindA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_bindA(ld.toString(), dn.toString(), cred.toString(), method.toInt()) as Int).toUInt() else 0u

public actual fun ldap_bindW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_bindW(ld.toString(), dn.toString(), cred.toString(), method.toInt()) as Int).toUInt() else 0u

public actual fun ldap_bind_s(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_bind_s(ld.toString(), dn.toString(), cred.toString(), method.toInt()) as Int).toUInt() else 0u

public actual fun ldap_bind_sA(ld: Long, dn: PCSTR, cred: PCSTR, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_bind_sA(ld.toString(), dn.toString(), cred.toString(), method.toInt()) as Int).toUInt() else 0u

public actual fun ldap_bind_sW(ld: Long, dn: PCWSTR, cred: PCWSTR, method: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_bind_sW(ld.toString(), dn.toString(), cred.toString(), method.toInt()) as Int).toUInt() else 0u

public actual fun ldap_check_filterA(ld: Long, searchfilter: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_check_filterA(ld.toString(), searchfilter.toString()) as Int).toUInt() else 0u

public actual fun ldap_check_filterW(ld: Long, searchfilter: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_check_filterW(ld.toString(), searchfilter.toString()) as Int).toUInt() else 0u

public actual fun ldap_cleanup(hinstance: HANDLE): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_cleanup(hinstance.toString()) as Int).toUInt() else 0u

public actual fun ldap_close_extended_op(ld: Long, messagenumber: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_close_extended_op(ld.toString(), messagenumber.toInt()) as Int).toUInt() else 0u

public actual fun ldap_compare(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare(ld.toString(), dn.toString(), attr.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun ldap_compareA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compareA(ld.toString(), dn.toString(), attr.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun ldap_compareW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compareW(ld.toString(), dn.toString(), attr.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_ext(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_ext(ld.toString(), dn.toString(), attr.toString(), value.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_extA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_extA(ld.toString(), dn.toString(), attr.toString(), value.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_extW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_extW(ld.toString(), dn.toString(), attr.toString(), value.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_ext_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_ext_s(ld.toString(), dn.toString(), attr.toString(), value.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_ext_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_ext_sA(ld.toString(), dn.toString(), attr.toString(), value.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_ext_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_ext_sW(ld.toString(), dn.toString(), attr.toString(), value.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_s(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_s(ld.toString(), dn.toString(), attr.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_sA(ld: Long, dn: PCSTR, attr: PCSTR, value: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_sA(ld.toString(), dn.toString(), attr.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun ldap_compare_sW(ld: Long, dn: PCWSTR, attr: PCWSTR, value: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_compare_sW(ld.toString(), dn.toString(), attr.toString(), value.toString()) as Int).toUInt() else 0u

public actual fun ldap_conn_from_msg(primaryconn: Long, res: Long): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_conn_from_msg(primaryconn.toString(), res.toString()) as String).toLong() else 0L

public actual fun ldap_connect(ld: Long, timeout: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_connect(ld.toString(), timeout.toString()) as Int).toUInt() else 0u

public actual fun ldap_control_free(control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_control_free(control.toString()) as Int).toUInt() else 0u

public actual fun ldap_control_freeA(controls: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_control_freeA(controls.toString()) as Int).toUInt() else 0u

public actual fun ldap_control_freeW(control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_control_freeW(control.toString()) as Int).toUInt() else 0u

public actual fun ldap_controls_free(controls: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_controls_free(controls.toString()) as Int).toUInt() else 0u

public actual fun ldap_controls_freeA(controls: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_controls_freeA(controls.toString()) as Int).toUInt() else 0u

public actual fun ldap_controls_freeW(control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_controls_freeW(control.toString()) as Int).toUInt() else 0u

public actual fun ldap_count_entries(ld: Long, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_count_entries(ld.toString(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_count_references(ld: Long, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_count_references(ld.toString(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_count_values(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_count_values(vals.toString()) as Int).toUInt() else 0u

public actual fun ldap_count_valuesA(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_count_valuesA(vals.toString()) as Int).toUInt() else 0u

public actual fun ldap_count_valuesW(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_count_valuesW(vals.toString()) as Int).toUInt() else 0u

public actual fun ldap_count_values_len(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_count_values_len(vals.toString()) as Int).toUInt() else 0u

public actual fun ldap_create_page_control(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_page_control(externalhandle.toString(), pagesize.toInt(), cookie.toString(), iscritical.toInt(), control.toString()) as Int).toUInt() else 0u

public actual fun ldap_create_page_controlA(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_page_controlA(externalhandle.toString(), pagesize.toInt(), cookie.toString(), iscritical.toInt(), control.toString()) as Int).toUInt() else 0u

public actual fun ldap_create_page_controlW(externalhandle: Long, pagesize: UInt, cookie: Long, iscritical: UByte, control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_page_controlW(externalhandle.toString(), pagesize.toInt(), cookie.toString(), iscritical.toInt(), control.toString()) as Int).toUInt() else 0u

public actual fun ldap_create_sort_control(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_sort_control(externalhandle.toString(), sortkeys.toString(), iscritical.toInt(), control.toString()) as Int).toUInt() else 0u

public actual fun ldap_create_sort_controlA(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_sort_controlA(externalhandle.toString(), sortkeys.toString(), iscritical.toInt(), control.toString()) as Int).toUInt() else 0u

public actual fun ldap_create_sort_controlW(externalhandle: Long, sortkeys: Long, iscritical: UByte, control: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_sort_controlW(externalhandle.toString(), sortkeys.toString(), iscritical.toInt(), control.toString()) as Int).toUInt() else 0u

public actual fun ldap_create_vlv_controlA(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlA(externalhandle.toString(), vlvinfo.toString(), iscritical.toInt(), control.toString()) as Int) else 0

public actual fun ldap_create_vlv_controlW(externalhandle: Long, vlvinfo: Long, iscritical: UByte, control: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_create_vlv_controlW(externalhandle.toString(), vlvinfo.toString(), iscritical.toInt(), control.toString()) as Int) else 0

public actual fun ldap_delete(ld: Long, dn: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete(ld.toString(), dn.toString()) as Int).toUInt() else 0u

public actual fun ldap_deleteA(ld: Long, dn: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_deleteA(ld.toString(), dn.toString()) as Int).toUInt() else 0u

public actual fun ldap_deleteW(ld: Long, dn: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_deleteW(ld.toString(), dn.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_ext(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_ext(ld.toString(), dn.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_extA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_extA(ld.toString(), dn.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_extW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_extW(ld.toString(), dn.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_ext_s(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_ext_s(ld.toString(), dn.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_ext_sA(ld: Long, dn: PCSTR, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_ext_sA(ld.toString(), dn.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_ext_sW(ld: Long, dn: PCWSTR, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_ext_sW(ld.toString(), dn.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_s(ld: Long, dn: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_s(ld.toString(), dn.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_sA(ld: Long, dn: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_sA(ld.toString(), dn.toString()) as Int).toUInt() else 0u

public actual fun ldap_delete_sW(ld: Long, dn: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_delete_sW(ld.toString(), dn.toString()) as Int).toUInt() else 0u

public actual fun ldap_dn2ufn(dn: PCSTR): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_dn2ufn(dn.toString()) as String).toLong() else 0L

public actual fun ldap_dn2ufnA(dn: PCSTR): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_dn2ufnA(dn.toString()) as String).toLong() else 0L

public actual fun ldap_dn2ufnW(dn: PCWSTR): PWSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_dn2ufnW(dn.toString()) as String).toLong() else 0L

public actual fun ldap_encode_sort_controlA(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlA(externalhandle.toString(), sortkeys.toString(), control.toString(), criticality) as Int).toUInt() else 0u

public actual fun ldap_encode_sort_controlW(externalhandle: Long, sortkeys: Long, control: Long, criticality: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_encode_sort_controlW(externalhandle.toString(), sortkeys.toString(), control.toString(), criticality) as Int).toUInt() else 0u

public actual fun ldap_err2string(err: UInt): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_err2string(err.toInt()) as String).toLong() else 0L

public actual fun ldap_err2stringA(err: UInt): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_err2stringA(err.toInt()) as String).toLong() else 0L

public actual fun ldap_err2stringW(err: UInt): PWSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_err2stringW(err.toInt()) as String).toLong() else 0L

public actual fun ldap_escape_filter_element(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_escape_filter_element(sourcefilterelement.toString(), sourcelength.toInt(), destfilterelement.toString(), destlength.toInt()) as Int).toUInt() else 0u

public actual fun ldap_escape_filter_elementA(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PSTR, destlength: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementA(sourcefilterelement.toString(), sourcelength.toInt(), destfilterelement.toString(), destlength.toInt()) as Int).toUInt() else 0u

public actual fun ldap_escape_filter_elementW(sourcefilterelement: PCSTR, sourcelength: UInt, destfilterelement: PWSTR, destlength: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_escape_filter_elementW(sourcefilterelement.toString(), sourcelength.toInt(), destfilterelement.toString(), destlength.toInt()) as Int).toUInt() else 0u

public actual fun ldap_explode_dn(dn: PCSTR, notypes: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_explode_dn(dn.toString(), notypes.toInt()) as String).toLong() else 0L

public actual fun ldap_explode_dnA(dn: PCSTR, notypes: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_explode_dnA(dn.toString(), notypes.toInt()) as String).toLong() else 0L

public actual fun ldap_explode_dnW(dn: PCWSTR, notypes: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_explode_dnW(dn.toString(), notypes.toInt()) as String).toLong() else 0L

public actual fun ldap_extended_operation(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_extended_operation(ld.toString(), oid.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_extended_operationA(ld: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_extended_operationA(ld.toString(), oid.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_extended_operationW(ld: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_extended_operationW(ld.toString(), oid.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_extended_operation_sA(externalhandle: Long, oid: PCSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_extended_operation_sA(externalhandle.toString(), oid.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), returnedoid.toString(), returneddata.toString()) as Int).toUInt() else 0u

public actual fun ldap_extended_operation_sW(externalhandle: Long, oid: PCWSTR, data: Long, servercontrols: Long, clientcontrols: Long, returnedoid: Long, returneddata: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_extended_operation_sW(externalhandle.toString(), oid.toString(), data.toString(), servercontrols.toString(), clientcontrols.toString(), returnedoid.toString(), returneddata.toString()) as Int).toUInt() else 0u

public actual fun ldap_first_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_first_attribute(ld.toString(), entry.toString(), ptr.toString()) as String).toLong() else 0L

public actual fun ldap_first_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_first_attributeA(ld.toString(), entry.toString(), ptr.toString()) as String).toLong() else 0L

public actual fun ldap_first_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_first_attributeW(ld.toString(), entry.toString(), ptr.toString()) as String).toLong() else 0L

public actual fun ldap_first_entry(ld: Long, res: Long): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_first_entry(ld.toString(), res.toString()) as String).toLong() else 0L

public actual fun ldap_first_reference(ld: Long, res: Long): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_first_reference(ld.toString(), res.toString()) as String).toLong() else 0L

public actual fun ldap_free_controls(controls: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_free_controls(controls.toString()) as Int).toUInt() else 0u

public actual fun ldap_free_controlsA(controls: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_free_controlsA(controls.toString()) as Int).toUInt() else 0u

public actual fun ldap_free_controlsW(controls: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_free_controlsW(controls.toString()) as Int).toUInt() else 0u

public actual fun ldap_get_dn(ld: Long, entry: Long): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_dn(ld.toString(), entry.toString()) as String).toLong() else 0L

public actual fun ldap_get_dnA(ld: Long, entry: Long): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_dnA(ld.toString(), entry.toString()) as String).toLong() else 0L

public actual fun ldap_get_dnW(ld: Long, entry: Long): PWSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_dnW(ld.toString(), entry.toString()) as String).toLong() else 0L

public actual fun ldap_get_next_page(externalhandle: Long, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_next_page(externalhandle.toString(), searchhandle.toString(), pagesize.toInt(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_get_next_page_s(externalhandle: Long, searchhandle: PLDAPSearch, timeout: Long, pagesize: UInt, totalcount: Long, results: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_next_page_s(externalhandle.toString(), searchhandle.toString(), timeout.toString(), pagesize.toInt(), totalcount.toString(), results.toString()) as Int).toUInt() else 0u

public actual fun ldap_get_option(ld: Long, option: Int, outvalue: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_option(ld.toString(), option, outvalue.toString()) as Int).toUInt() else 0u

public actual fun ldap_get_optionW(ld: Long, option: Int, outvalue: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_optionW(ld.toString(), option, outvalue.toString()) as Int).toUInt() else 0u

public actual fun ldap_get_paged_count(externalhandle: Long, searchblock: PLDAPSearch, totalcount: Long, results: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_paged_count(externalhandle.toString(), searchblock.toString(), totalcount.toString(), results.toString()) as Int).toUInt() else 0u

public actual fun ldap_get_values(ld: Long, entry: Long, attr: PCSTR): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_values(ld.toString(), entry.toString(), attr.toString()) as String).toLong() else 0L

public actual fun ldap_get_valuesA(ld: Long, entry: Long, attr: PCSTR): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_valuesA(ld.toString(), entry.toString(), attr.toString()) as String).toLong() else 0L

public actual fun ldap_get_valuesW(ld: Long, entry: Long, attr: PCWSTR): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_valuesW(ld.toString(), entry.toString(), attr.toString()) as String).toLong() else 0L

public actual fun ldap_get_values_len(externalhandle: Long, message: Long, attr: PCSTR): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_values_len(externalhandle.toString(), message.toString(), attr.toString()) as String).toLong() else 0L

public actual fun ldap_get_values_lenA(externalhandle: Long, message: Long, attr: PCSTR): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_values_lenA(externalhandle.toString(), message.toString(), attr.toString()) as String).toLong() else 0L

public actual fun ldap_get_values_lenW(externalhandle: Long, message: Long, attr: PCWSTR): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_get_values_lenW(externalhandle.toString(), message.toString(), attr.toString()) as String).toLong() else 0L

public actual fun ldap_init(hostname: PCSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_init(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun ldap_initA(hostname: PCSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_initA(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun ldap_initW(hostname: PCWSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_initW(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun ldap_memfree(block: PCSTR) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_memfree(block.toString())
    }
}

public actual fun ldap_memfreeA(block: PCSTR) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_memfreeA(block.toString())
    }
}

public actual fun ldap_memfreeW(block: PCWSTR) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_memfreeW(block.toString())
    }
}

public actual fun ldap_modify(ld: Long, dn: PCSTR, mods: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify(ld.toString(), dn.toString(), mods.toString()) as Int).toUInt() else 0u

public actual fun ldap_modifyA(ld: Long, dn: PCSTR, mods: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modifyA(ld.toString(), dn.toString(), mods.toString()) as Int).toUInt() else 0u

public actual fun ldap_modifyW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modifyW(ld.toString(), dn.toString(), mods.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_ext(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_ext(ld.toString(), dn.toString(), mods.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_extA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_extA(ld.toString(), dn.toString(), mods.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_extW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_extW(ld.toString(), dn.toString(), mods.toString(), servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_ext_s(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_ext_s(ld.toString(), dn.toString(), mods.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_ext_sA(ld: Long, dn: PCSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_ext_sA(ld.toString(), dn.toString(), mods.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_ext_sW(ld: Long, dn: PCWSTR, mods: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_ext_sW(ld.toString(), dn.toString(), mods.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_s(ld: Long, dn: PCSTR, mods: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_s(ld.toString(), dn.toString(), mods.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_sA(ld: Long, dn: PCSTR, mods: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_sA(ld.toString(), dn.toString(), mods.toString()) as Int).toUInt() else 0u

public actual fun ldap_modify_sW(ld: Long, dn: PCWSTR, mods: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modify_sW(ld.toString(), dn.toString(), mods.toString()) as Int).toUInt() else 0u

public actual fun ldap_modrdn(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString()) as Int).toUInt() else 0u

public actual fun ldap_modrdn2(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn2(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString(), deleteoldrdn) as Int).toUInt() else 0u

public actual fun ldap_modrdn2A(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn2A(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString(), deleteoldrdn) as Int).toUInt() else 0u

public actual fun ldap_modrdn2W(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn2W(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString(), deleteoldrdn) as Int).toUInt() else 0u

public actual fun ldap_modrdn2_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn2_s(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString(), deleteoldrdn) as Int).toUInt() else 0u

public actual fun ldap_modrdn2_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn2_sA(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString(), deleteoldrdn) as Int).toUInt() else 0u

public actual fun ldap_modrdn2_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR, deleteoldrdn: Int): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn2_sW(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString(), deleteoldrdn) as Int).toUInt() else 0u

public actual fun ldap_modrdnA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdnA(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString()) as Int).toUInt() else 0u

public actual fun ldap_modrdnW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdnW(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString()) as Int).toUInt() else 0u

public actual fun ldap_modrdn_s(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn_s(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString()) as Int).toUInt() else 0u

public actual fun ldap_modrdn_sA(externalhandle: Long, distinguishedname: PCSTR, newdistinguishedname: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn_sA(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString()) as Int).toUInt() else 0u

public actual fun ldap_modrdn_sW(externalhandle: Long, distinguishedname: PCWSTR, newdistinguishedname: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_modrdn_sW(externalhandle.toString(), distinguishedname.toString(), newdistinguishedname.toString()) as Int).toUInt() else 0u

public actual fun ldap_msgfree(res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_msgfree(res.toString()) as Int).toUInt() else 0u

public actual fun ldap_next_attribute(ld: Long, entry: Long, ptr: Long): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_next_attribute(ld.toString(), entry.toString(), ptr.toString()) as String).toLong() else 0L

public actual fun ldap_next_attributeA(ld: Long, entry: Long, ptr: Long): PSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_next_attributeA(ld.toString(), entry.toString(), ptr.toString()) as String).toLong() else 0L

public actual fun ldap_next_attributeW(ld: Long, entry: Long, ptr: Long): PWSTR =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_next_attributeW(ld.toString(), entry.toString(), ptr.toString()) as String).toLong() else 0L

public actual fun ldap_next_entry(ld: Long, entry: Long): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_next_entry(ld.toString(), entry.toString()) as String).toLong() else 0L

public actual fun ldap_next_reference(ld: Long, entry: Long): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_next_reference(ld.toString(), entry.toString()) as String).toLong() else 0L

public actual fun ldap_open(hostname: PCSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_open(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun ldap_openA(hostname: PCSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_openA(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun ldap_openW(hostname: PCWSTR, portnumber: UInt): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_openW(hostname.toString(), portnumber.toInt()) as String).toLong() else 0L

public actual fun ldap_parse_extended_resultA(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultA(connection.toString(), resultmessage.toString(), resultoid.toString(), resultdata.toString(), freeit) as Int).toUInt() else 0u

public actual fun ldap_parse_extended_resultW(connection: Long, resultmessage: Long, resultoid: Long, resultdata: Long, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_extended_resultW(connection.toString(), resultmessage.toString(), resultoid.toString(), resultdata.toString(), freeit) as Int).toUInt() else 0u

public actual fun ldap_parse_page_control(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_page_control(externalhandle.toString(), servercontrols.toString(), totalcount.toString(), cookie.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_page_controlA(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_page_controlA(externalhandle.toString(), servercontrols.toString(), totalcount.toString(), cookie.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_page_controlW(externalhandle: Long, servercontrols: Long, totalcount: Long, cookie: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_page_controlW(externalhandle.toString(), servercontrols.toString(), totalcount.toString(), cookie.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_reference(connection: Long, resultmessage: Long, referrals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_reference(connection.toString(), resultmessage.toString(), referrals.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_referenceA(connection: Long, resultmessage: Long, referrals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_referenceA(connection.toString(), resultmessage.toString(), referrals.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_referenceW(connection: Long, resultmessage: Long, referrals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_referenceW(connection.toString(), resultmessage.toString(), referrals.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_result(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_result(connection.toString(), resultmessage.toString(), returncode.toString(), matcheddns.toString(), errormessage.toString(), referrals.toString(), servercontrols.toString(), freeit) as Int).toUInt() else 0u

public actual fun ldap_parse_resultA(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_resultA(connection.toString(), resultmessage.toString(), returncode.toString(), matcheddns.toString(), errormessage.toString(), referrals.toString(), servercontrols.toString(), freeit) as Int).toUInt() else 0u

public actual fun ldap_parse_resultW(connection: Long, resultmessage: Long, returncode: Long, matcheddns: Long, errormessage: Long, referrals: Long, servercontrols: Long, freeit: Boolean): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_resultW(connection.toString(), resultmessage.toString(), returncode.toString(), matcheddns.toString(), errormessage.toString(), referrals.toString(), servercontrols.toString(), freeit) as Int).toUInt() else 0u

public actual fun ldap_parse_sort_control(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_sort_control(externalhandle.toString(), control.toString(), result.toString(), attribute.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_sort_controlA(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlA(externalhandle.toString(), control.toString(), result.toString(), attribute.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_sort_controlW(externalhandle: Long, control: Long, result: Long, attribute: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_sort_controlW(externalhandle.toString(), control.toString(), result.toString(), attribute.toString()) as Int).toUInt() else 0u

public actual fun ldap_parse_vlv_controlA(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlA(externalhandle.toString(), control.toString(), targetpos.toString(), listcount.toString(), context.toString(), errcode.toString()) as Int) else 0

public actual fun ldap_parse_vlv_controlW(externalhandle: Long, control: Long, targetpos: Long, listcount: Long, context: Long, errcode: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_parse_vlv_controlW(externalhandle.toString(), control.toString(), targetpos.toString(), listcount.toString(), context.toString(), errcode.toString()) as Int) else 0

public actual fun ldap_perror(ld: Long, msg: PCSTR) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_perror(ld.toString(), msg.toString())
    }
}

public actual fun ldap_rename_ext(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_rename_ext(ld.toString(), dn.toString(), newrdn.toString(), newparent.toString(), deleteoldrdn, servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_rename_extA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_rename_extA(ld.toString(), dn.toString(), newrdn.toString(), newparent.toString(), deleteoldrdn, servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_rename_extW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_rename_extW(ld.toString(), dn.toString(), newrdn.toString(), newparent.toString(), deleteoldrdn, servercontrols.toString(), clientcontrols.toString(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_rename_ext_s(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_rename_ext_s(ld.toString(), dn.toString(), newrdn.toString(), newparent.toString(), deleteoldrdn, servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_rename_ext_sA(ld: Long, dn: PCSTR, newrdn: PCSTR, newparent: PCSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_rename_ext_sA(ld.toString(), dn.toString(), newrdn.toString(), newparent.toString(), deleteoldrdn, servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_rename_ext_sW(ld: Long, dn: PCWSTR, newrdn: PCWSTR, newparent: PCWSTR, deleteoldrdn: Int, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_rename_ext_sW(ld.toString(), dn.toString(), newrdn.toString(), newparent.toString(), deleteoldrdn, servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_result(ld: Long, msgid: UInt, all: UInt, timeout: Long, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_result(ld.toString(), msgid.toInt(), all.toInt(), timeout.toString(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_result2error(ld: Long, res: Long, freeit: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_result2error(ld.toString(), res.toString(), freeit.toInt()) as Int).toUInt() else 0u

public actual fun ldap_sasl_bindA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_sasl_bindA(externalhandle.toString(), distname.toString(), authmechanism.toString(), cred.toString(), serverctrls.toString(), clientctrls.toString(), messagenumber.toString()) as Int) else 0

public actual fun ldap_sasl_bindW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, messagenumber: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_sasl_bindW(externalhandle.toString(), distname.toString(), authmechanism.toString(), cred.toString(), serverctrls.toString(), clientctrls.toString(), messagenumber.toString()) as Int) else 0

public actual fun ldap_sasl_bind_sA(externalhandle: Long, distname: PCSTR, authmechanism: PCSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sA(externalhandle.toString(), distname.toString(), authmechanism.toString(), cred.toString(), serverctrls.toString(), clientctrls.toString(), serverdata.toString()) as Int) else 0

public actual fun ldap_sasl_bind_sW(externalhandle: Long, distname: PCWSTR, authmechanism: PCWSTR, cred: Long, serverctrls: Long, clientctrls: Long, serverdata: Long): Int =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_sasl_bind_sW(externalhandle.toString(), distname.toString(), authmechanism.toString(), cred.toString(), serverctrls.toString(), clientctrls.toString(), serverdata.toString()) as Int) else 0

public actual fun ldap_search(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt()) as Int).toUInt() else 0u

public actual fun ldap_searchA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_searchA(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt()) as Int).toUInt() else 0u

public actual fun ldap_searchW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_searchW(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt()) as Int).toUInt() else 0u

public actual fun ldap_search_abandon_page(externalhandle: Long, searchblock: PLDAPSearch): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_abandon_page(externalhandle.toString(), searchblock.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_ext(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_ext(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), servercontrols.toString(), clientcontrols.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_extA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_extA(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), servercontrols.toString(), clientcontrols.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_extW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timelimit: UInt, sizelimit: UInt, messagenumber: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_extW(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), servercontrols.toString(), clientcontrols.toString(), timelimit.toInt(), sizelimit.toInt(), messagenumber.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_ext_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_ext_s(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), servercontrols.toString(), clientcontrols.toString(), timeout.toString(), sizelimit.toInt(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_ext_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_ext_sA(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), servercontrols.toString(), clientcontrols.toString(), timeout.toString(), sizelimit.toInt(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_ext_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, servercontrols: Long, clientcontrols: Long, timeout: Long, sizelimit: UInt, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_ext_sW(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), servercontrols.toString(), clientcontrols.toString(), timeout.toString(), sizelimit.toInt(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_init_page(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_init_page(externalhandle.toString(), distinguishedname.toString(), scopeofsearch.toInt(), searchfilter.toString(), attributelist.toString(), attributesonly.toInt(), servercontrols.toString(), clientcontrols.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.toString()) as String).toLong() else 0L

public actual fun ldap_search_init_pageA(externalhandle: Long, distinguishedname: PCSTR, scopeofsearch: UInt, searchfilter: PCSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_init_pageA(externalhandle.toString(), distinguishedname.toString(), scopeofsearch.toInt(), searchfilter.toString(), attributelist.toString(), attributesonly.toInt(), servercontrols.toString(), clientcontrols.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.toString()) as String).toLong() else 0L

public actual fun ldap_search_init_pageW(externalhandle: Long, distinguishedname: PCWSTR, scopeofsearch: UInt, searchfilter: PCWSTR, attributelist: Long, attributesonly: UInt, servercontrols: Long, clientcontrols: Long, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: Long): PLDAPSearch =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_init_pageW(externalhandle.toString(), distinguishedname.toString(), scopeofsearch.toInt(), searchfilter.toString(), attributelist.toString(), attributesonly.toInt(), servercontrols.toString(), clientcontrols.toString(), pagetimelimit.toInt(), totalsizelimit.toInt(), sortkeys.toString()) as String).toLong() else 0L

public actual fun ldap_search_s(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_s(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_sA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_sA(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_sW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_sW(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_st(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_st(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), timeout.toString(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_stA(ld: Long, base: PCSTR, scope: UInt, filter: PCSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_stA(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), timeout.toString(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_search_stW(ld: Long, base: PCWSTR, scope: UInt, filter: PCWSTR, attrs: Long, attrsonly: UInt, timeout: Long, res: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_search_stW(ld.toString(), base.toString(), scope.toInt(), filter.toString(), attrs.toString(), attrsonly.toInt(), timeout.toString(), res.toString()) as Int).toUInt() else 0u

public actual fun ldap_set_dbg_flags(newflags: UInt): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_set_dbg_flags(newflags.toInt()) as Int).toUInt() else 0u

public actual fun ldap_set_dbg_routine(debugprintroutine: DBGPRINT) {
    if (_windowsWin32NetworkingLdapNapiAddon != null) {
        _windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_set_dbg_routine(debugprintroutine.toLong().toString())
    }
}

public actual fun ldap_set_option(ld: Long, option: Int, invalue: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_set_option(ld.toString(), option, invalue.toString()) as Int).toUInt() else 0u

public actual fun ldap_set_optionW(ld: Long, option: Int, invalue: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_set_optionW(ld.toString(), option, invalue.toString()) as Int).toUInt() else 0u

public actual fun ldap_simple_bind(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_simple_bind(ld.toString(), dn.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun ldap_simple_bindA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_simple_bindA(ld.toString(), dn.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun ldap_simple_bindW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_simple_bindW(ld.toString(), dn.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun ldap_simple_bind_s(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_simple_bind_s(ld.toString(), dn.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun ldap_simple_bind_sA(ld: Long, dn: PCSTR, passwd: PCSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_simple_bind_sA(ld.toString(), dn.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun ldap_simple_bind_sW(ld: Long, dn: PCWSTR, passwd: PCWSTR): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_simple_bind_sW(ld.toString(), dn.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun ldap_sslinit(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_sslinit(hostname.toString(), portnumber.toInt(), secure) as String).toLong() else 0L

public actual fun ldap_sslinitA(hostname: PCSTR, portnumber: UInt, secure: Int): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_sslinitA(hostname.toString(), portnumber.toInt(), secure) as String).toLong() else 0L

public actual fun ldap_sslinitW(hostname: PCWSTR, portnumber: UInt, secure: Int): Long =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_sslinitW(hostname.toString(), portnumber.toInt(), secure) as String).toLong() else 0L

public actual fun ldap_start_tls_sA(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_start_tls_sA(externalhandle.toString(), serverreturnvalue.toString(), result.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_start_tls_sW(externalhandle: Long, serverreturnvalue: Long, result: Long, servercontrols: Long, clientcontrols: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_start_tls_sW(externalhandle.toString(), serverreturnvalue.toString(), result.toString(), servercontrols.toString(), clientcontrols.toString()) as Int).toUInt() else 0u

public actual fun ldap_startup(version: Long, instance: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_startup(version.toString(), instance.toString()) as Int).toUInt() else 0u

public actual fun ldap_stop_tls_s(externalhandle: Long): Boolean =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_stop_tls_s(externalhandle.toString()) as Boolean) else false

public actual fun ldap_ufn2dn(ufn: PCSTR, pdn: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_ufn2dn(ufn.toString(), pdn.toString()) as Int).toUInt() else 0u

public actual fun ldap_ufn2dnA(ufn: PCSTR, pdn: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_ufn2dnA(ufn.toString(), pdn.toString()) as Int).toUInt() else 0u

public actual fun ldap_ufn2dnW(ufn: PCWSTR, pdn: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_ufn2dnW(ufn.toString(), pdn.toString()) as Int).toUInt() else 0u

public actual fun ldap_unbind(ld: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_unbind(ld.toString()) as Int).toUInt() else 0u

public actual fun ldap_unbind_s(ld: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_unbind_s(ld.toString()) as Int).toUInt() else 0u

public actual fun ldap_value_free(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_value_free(vals.toString()) as Int).toUInt() else 0u

public actual fun ldap_value_freeA(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_value_freeA(vals.toString()) as Int).toUInt() else 0u

public actual fun ldap_value_freeW(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_value_freeW(vals.toString()) as Int).toUInt() else 0u

public actual fun ldap_value_free_len(vals: Long): UInt =
    if (_windowsWin32NetworkingLdapNapiAddon != null) (_windowsWin32NetworkingLdapNapiAddon.windowssys_windows_win32_networking_ldap_ldap_value_free_len(vals.toString()) as Int).toUInt() else 0u
