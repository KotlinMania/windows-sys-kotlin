// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn LdapGetLastError() -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn LdapMapErrorToWin32(ldaperror : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn LdapUTF8ToUnicode(lpsrcstr : windows_sys::core::PCSTR, cchsrc : i32, lpdeststr : windows_sys::core::PWSTR, cchdest : i32) -> i32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn LdapUnicodeToUTF8(lpsrcstr : windows_sys::core::PCWSTR, cchsrc : i32, lpdeststr : windows_sys::core::PSTR, cchdest : i32) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_alloc_t(options : i32) -> *mut BerElement);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_bvdup(pberval : *mut LDAP_BERVAL) -> *mut LDAP_BERVAL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_bvecfree(pberval : *mut *mut LDAP_BERVAL));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_bvfree(bv : *mut LDAP_BERVAL));

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_first_element(pberelement : *mut BerElement, plen : *mut u32, ppopaque : *mut *mut i8) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_flatten(pberelement : *mut BerElement, pberval : *mut *mut LDAP_BERVAL) -> i32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_free(pberelement : *mut BerElement, fbuf : i32));

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_init(pberval : *mut LDAP_BERVAL) -> *mut BerElement);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_next_element(pberelement : *mut BerElement, plen : *mut u32, opaque : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_peek_tag(pberelement : *mut BerElement, plen : *mut u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_printf(pberelement : *mut BerElement, fmt : windows_sys::core::PCSTR, ...) -> i32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_scanf(pberelement : *mut BerElement, fmt : windows_sys::core::PCSTR, ...) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ber_skip_tag(pberelement : *mut BerElement, plen : *mut u32) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn cldap_open(hostname : windows_sys::core::PCSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn cldap_openA(hostname : windows_sys::core::PCSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn cldap_openW(hostname : windows_sys::core::PCWSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_abandon(ld : *mut LDAP, msgid : u32) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_addA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_addW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attrs : *mut *mut LDAPModW) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_ext(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_extA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_extW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attrs : *mut *mut LDAPModW, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_ext_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_ext_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_ext_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attrs : *mut *mut LDAPModW, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attrs : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_add_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attrs : *mut *mut LDAPModW) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_bind(ld : *mut LDAP, dn : windows_sys::core::PCSTR, cred : windows_sys::core::PCSTR, method : u32) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_bindA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, cred : windows_sys::core::PCSTR, method : u32) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_bindW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, cred : windows_sys::core::PCWSTR, method : u32) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_bind_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, cred : windows_sys::core::PCSTR, method : u32) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_bind_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, cred : windows_sys::core::PCSTR, method : u32) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_bind_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, cred : windows_sys::core::PCWSTR, method : u32) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_check_filterA(ld : *mut LDAP, searchfilter : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_check_filterW(ld : *mut LDAP, searchfilter : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_cleanup(hinstance : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_close_extended_op(ld : *mut LDAP, messagenumber : u32) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compareA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compareW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attr : windows_sys::core::PCWSTR, value : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_ext(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, data : *mut LDAP_BERVAL, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_extA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, data : *const LDAP_BERVAL, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_extW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attr : windows_sys::core::PCWSTR, value : windows_sys::core::PCWSTR, data : *const LDAP_BERVAL, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_ext_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, data : *mut LDAP_BERVAL, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_ext_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, data : *const LDAP_BERVAL, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_ext_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attr : windows_sys::core::PCWSTR, value : windows_sys::core::PCWSTR, data : *const LDAP_BERVAL, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, attr : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_compare_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, attr : windows_sys::core::PCWSTR, value : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_conn_from_msg(primaryconn : *mut LDAP, res : *mut LDAPMessage) -> *mut LDAP);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_connect(ld : *mut LDAP, timeout : *mut LDAP_TIMEVAL) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_control_free(control : *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_control_freeA(controls : *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_control_freeW(control : *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_controls_free(controls : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_controls_freeA(controls : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_controls_freeW(control : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_count_entries(ld : *mut LDAP, res : *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_count_references(ld : *mut LDAP, res : *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_count_values(vals : *const windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_count_valuesA(vals : *const windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_count_valuesW(vals : *const windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_count_values_len(vals : *mut *mut LDAP_BERVAL) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_page_control(externalhandle : *mut LDAP, pagesize : u32, cookie : *mut LDAP_BERVAL, iscritical : u8, control : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_page_controlA(externalhandle : *mut LDAP, pagesize : u32, cookie : *mut LDAP_BERVAL, iscritical : u8, control : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_page_controlW(externalhandle : *mut LDAP, pagesize : u32, cookie : *mut LDAP_BERVAL, iscritical : u8, control : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_sort_control(externalhandle : *mut LDAP, sortkeys : *mut *mut LDAPSortKeyA, iscritical : u8, control : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_sort_controlA(externalhandle : *mut LDAP, sortkeys : *mut *mut LDAPSortKeyA, iscritical : u8, control : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_sort_controlW(externalhandle : *mut LDAP, sortkeys : *mut *mut LDAPSortKeyW, iscritical : u8, control : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_vlv_controlA(externalhandle : *mut LDAP, vlvinfo : *mut LDAPVLVInfo, iscritical : u8, control : *mut *mut LDAPControlA) -> i32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_create_vlv_controlW(externalhandle : *mut LDAP, vlvinfo : *mut LDAPVLVInfo, iscritical : u8, control : *mut *mut LDAPControlW) -> i32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete(ld : *mut LDAP, dn : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_deleteA(ld : *mut LDAP, dn : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_deleteW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_ext(ld : *mut LDAP, dn : windows_sys::core::PCSTR, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_extA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_extW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_ext_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_ext_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_ext_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_delete_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_dn2ufn(dn : windows_sys::core::PCSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_dn2ufnA(dn : windows_sys::core::PCSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_dn2ufnW(dn : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_encode_sort_controlA(externalhandle : *mut LDAP, sortkeys : *mut *mut LDAPSortKeyA, control : *mut LDAPControlA, criticality : bool) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_encode_sort_controlW(externalhandle : *mut LDAP, sortkeys : *mut *mut LDAPSortKeyW, control : *mut LDAPControlW, criticality : bool) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_err2string(err : u32) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_err2stringA(err : u32) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_err2stringW(err : u32) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_escape_filter_element(sourcefilterelement : windows_sys::core::PCSTR, sourcelength : u32, destfilterelement : windows_sys::core::PSTR, destlength : u32) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_escape_filter_elementA(sourcefilterelement : windows_sys::core::PCSTR, sourcelength : u32, destfilterelement : windows_sys::core::PSTR, destlength : u32) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_escape_filter_elementW(sourcefilterelement : windows_sys::core::PCSTR, sourcelength : u32, destfilterelement : windows_sys::core::PWSTR, destlength : u32) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_explode_dn(dn : windows_sys::core::PCSTR, notypes : u32) -> *mut windows_sys::core::PSTR);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_explode_dnA(dn : windows_sys::core::PCSTR, notypes : u32) -> *mut windows_sys::core::PSTR);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_explode_dnW(dn : windows_sys::core::PCWSTR, notypes : u32) -> *mut windows_sys::core::PWSTR);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_extended_operation(ld : *mut LDAP, oid : windows_sys::core::PCSTR, data : *mut LDAP_BERVAL, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_extended_operationA(ld : *mut LDAP, oid : windows_sys::core::PCSTR, data : *mut LDAP_BERVAL, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_extended_operationW(ld : *mut LDAP, oid : windows_sys::core::PCWSTR, data : *mut LDAP_BERVAL, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_extended_operation_sA(externalhandle : *mut LDAP, oid : windows_sys::core::PCSTR, data : *mut LDAP_BERVAL, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, returnedoid : *mut windows_sys::core::PSTR, returneddata : *mut *mut LDAP_BERVAL) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_extended_operation_sW(externalhandle : *mut LDAP, oid : windows_sys::core::PCWSTR, data : *mut LDAP_BERVAL, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, returnedoid : *mut windows_sys::core::PWSTR, returneddata : *mut *mut LDAP_BERVAL) -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_first_attribute(ld : *mut LDAP, entry : *mut LDAPMessage, ptr : *mut *mut BerElement) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_first_attributeA(ld : *mut LDAP, entry : *mut LDAPMessage, ptr : *mut *mut BerElement) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_first_attributeW(ld : *mut LDAP, entry : *mut LDAPMessage, ptr : *mut *mut BerElement) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_first_entry(ld : *mut LDAP, res : *mut LDAPMessage) -> *mut LDAPMessage);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_first_reference(ld : *mut LDAP, res : *mut LDAPMessage) -> *mut LDAPMessage);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_free_controls(controls : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_free_controlsA(controls : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_free_controlsW(controls : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_dn(ld : *mut LDAP, entry : *mut LDAPMessage) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_dnA(ld : *mut LDAP, entry : *mut LDAPMessage) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_dnW(ld : *mut LDAP, entry : *mut LDAPMessage) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_next_page(externalhandle : *mut LDAP, searchhandle : PLDAPSearch, pagesize : u32, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_next_page_s(externalhandle : *mut LDAP, searchhandle : PLDAPSearch, timeout : *mut LDAP_TIMEVAL, pagesize : u32, totalcount : *mut u32, results : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_option(ld : *mut LDAP, option : i32, outvalue : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_optionW(ld : *mut LDAP, option : i32, outvalue : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_paged_count(externalhandle : *mut LDAP, searchblock : PLDAPSearch, totalcount : *mut u32, results : *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_values(ld : *mut LDAP, entry : *mut LDAPMessage, attr : windows_sys::core::PCSTR) -> *mut windows_sys::core::PSTR);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_valuesA(ld : *mut LDAP, entry : *mut LDAPMessage, attr : windows_sys::core::PCSTR) -> *mut windows_sys::core::PSTR);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_valuesW(ld : *mut LDAP, entry : *mut LDAPMessage, attr : windows_sys::core::PCWSTR) -> *mut windows_sys::core::PWSTR);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_values_len(externalhandle : *mut LDAP, message : *mut LDAPMessage, attr : windows_sys::core::PCSTR) -> *mut *mut LDAP_BERVAL);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_values_lenA(externalhandle : *mut LDAP, message : *mut LDAPMessage, attr : windows_sys::core::PCSTR) -> *mut *mut LDAP_BERVAL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_get_values_lenW(externalhandle : *mut LDAP, message : *mut LDAPMessage, attr : windows_sys::core::PCWSTR) -> *mut *mut LDAP_BERVAL);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_init(hostname : windows_sys::core::PCSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_initA(hostname : windows_sys::core::PCSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_initW(hostname : windows_sys::core::PCWSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_memfree(block : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_memfreeA(block : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_memfreeW(block : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modifyA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modifyW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, mods : *mut *mut LDAPModW) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_ext(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_extA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_extW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, mods : *mut *mut LDAPModW, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_ext_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_ext_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_ext_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, mods : *mut *mut LDAPModW, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, mods : *mut *mut LDAPModA) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modify_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, mods : *mut *mut LDAPModW) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn2(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR, deleteoldrdn : i32) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn2A(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR, deleteoldrdn : i32) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn2W(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCWSTR, newdistinguishedname : windows_sys::core::PCWSTR, deleteoldrdn : i32) -> u32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn2_s(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR, deleteoldrdn : i32) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn2_sA(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR, deleteoldrdn : i32) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn2_sW(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCWSTR, newdistinguishedname : windows_sys::core::PCWSTR, deleteoldrdn : i32) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdnA(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdnW(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCWSTR, newdistinguishedname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn_s(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn_sA(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, newdistinguishedname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_modrdn_sW(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCWSTR, newdistinguishedname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_msgfree(res : *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_next_attribute(ld : *mut LDAP, entry : *mut LDAPMessage, ptr : *mut BerElement) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_next_attributeA(ld : *mut LDAP, entry : *mut LDAPMessage, ptr : *mut BerElement) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_next_attributeW(ld : *mut LDAP, entry : *mut LDAPMessage, ptr : *mut BerElement) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_next_entry(ld : *mut LDAP, entry : *mut LDAPMessage) -> *mut LDAPMessage);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_next_reference(ld : *mut LDAP, entry : *mut LDAPMessage) -> *mut LDAPMessage);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_open(hostname : windows_sys::core::PCSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_openA(hostname : windows_sys::core::PCSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_openW(hostname : windows_sys::core::PCWSTR, portnumber : u32) -> *mut LDAP);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_extended_resultA(connection : *mut LDAP, resultmessage : *mut LDAPMessage, resultoid : *mut windows_sys::core::PSTR, resultdata : *mut *mut LDAP_BERVAL, freeit : bool) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_extended_resultW(connection : *mut LDAP, resultmessage : *mut LDAPMessage, resultoid : *mut windows_sys::core::PWSTR, resultdata : *mut *mut LDAP_BERVAL, freeit : bool) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_page_control(externalhandle : *mut LDAP, servercontrols : *mut *mut LDAPControlA, totalcount : *mut u32, cookie : *mut *mut LDAP_BERVAL) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_page_controlA(externalhandle : *mut LDAP, servercontrols : *mut *mut LDAPControlA, totalcount : *mut u32, cookie : *mut *mut LDAP_BERVAL) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_page_controlW(externalhandle : *mut LDAP, servercontrols : *mut *mut LDAPControlW, totalcount : *mut u32, cookie : *mut *mut LDAP_BERVAL) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_reference(connection : *mut LDAP, resultmessage : *mut LDAPMessage, referrals : *mut *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_referenceA(connection : *mut LDAP, resultmessage : *mut LDAPMessage, referrals : *mut *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_referenceW(connection : *mut LDAP, resultmessage : *mut LDAPMessage, referrals : *mut *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_result(connection : *mut LDAP, resultmessage : *mut LDAPMessage, returncode : *mut u32, matcheddns : *mut windows_sys::core::PSTR, errormessage : *mut windows_sys::core::PSTR, referrals : *mut *mut windows_sys::core::PSTR, servercontrols : *mut *mut *mut LDAPControlA, freeit : bool) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_resultA(connection : *mut LDAP, resultmessage : *mut LDAPMessage, returncode : *mut u32, matcheddns : *mut windows_sys::core::PSTR, errormessage : *mut windows_sys::core::PSTR, referrals : *mut *mut *mut i8, servercontrols : *mut *mut *mut LDAPControlA, freeit : bool) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_resultW(connection : *mut LDAP, resultmessage : *mut LDAPMessage, returncode : *mut u32, matcheddns : *mut windows_sys::core::PWSTR, errormessage : *mut windows_sys::core::PWSTR, referrals : *mut *mut *mut u16, servercontrols : *mut *mut *mut LDAPControlW, freeit : bool) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_sort_control(externalhandle : *mut LDAP, control : *mut *mut LDAPControlA, result : *mut u32, attribute : *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_sort_controlA(externalhandle : *mut LDAP, control : *mut *mut LDAPControlA, result : *mut u32, attribute : *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_sort_controlW(externalhandle : *mut LDAP, control : *mut *mut LDAPControlW, result : *mut u32, attribute : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_vlv_controlA(externalhandle : *mut LDAP, control : *mut *mut LDAPControlA, targetpos : *mut u32, listcount : *mut u32, context : *mut *mut LDAP_BERVAL, errcode : *mut i32) -> i32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_parse_vlv_controlW(externalhandle : *mut LDAP, control : *mut *mut LDAPControlW, targetpos : *mut u32, listcount : *mut u32, context : *mut *mut LDAP_BERVAL, errcode : *mut i32) -> i32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_perror(ld : *mut LDAP, msg : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_rename_ext(ld : *mut LDAP, dn : windows_sys::core::PCSTR, newrdn : windows_sys::core::PCSTR, newparent : windows_sys::core::PCSTR, deleteoldrdn : i32, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_rename_extA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, newrdn : windows_sys::core::PCSTR, newparent : windows_sys::core::PCSTR, deleteoldrdn : i32, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_rename_extW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, newrdn : windows_sys::core::PCWSTR, newparent : windows_sys::core::PCWSTR, deleteoldrdn : i32, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_rename_ext_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, newrdn : windows_sys::core::PCSTR, newparent : windows_sys::core::PCSTR, deleteoldrdn : i32, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_rename_ext_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, newrdn : windows_sys::core::PCSTR, newparent : windows_sys::core::PCSTR, deleteoldrdn : i32, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_rename_ext_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, newrdn : windows_sys::core::PCWSTR, newparent : windows_sys::core::PCWSTR, deleteoldrdn : i32, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_result(ld : *mut LDAP, msgid : u32, all : u32, timeout : *const LDAP_TIMEVAL, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_result2error(ld : *mut LDAP, res : *mut LDAPMessage, freeit : u32) -> u32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_sasl_bindA(externalhandle : *mut LDAP, distname : windows_sys::core::PCSTR, authmechanism : windows_sys::core::PCSTR, cred : *const LDAP_BERVAL, serverctrls : *mut *mut LDAPControlA, clientctrls : *mut *mut LDAPControlA, messagenumber : *mut i32) -> i32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_sasl_bindW(externalhandle : *mut LDAP, distname : windows_sys::core::PCWSTR, authmechanism : windows_sys::core::PCWSTR, cred : *const LDAP_BERVAL, serverctrls : *mut *mut LDAPControlW, clientctrls : *mut *mut LDAPControlW, messagenumber : *mut i32) -> i32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_sasl_bind_sA(externalhandle : *mut LDAP, distname : windows_sys::core::PCSTR, authmechanism : windows_sys::core::PCSTR, cred : *const LDAP_BERVAL, serverctrls : *mut *mut LDAPControlA, clientctrls : *mut *mut LDAPControlA, serverdata : *mut *mut LDAP_BERVAL) -> i32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_sasl_bind_sW(externalhandle : *mut LDAP, distname : windows_sys::core::PCWSTR, authmechanism : windows_sys::core::PCWSTR, cred : *const LDAP_BERVAL, serverctrls : *mut *mut LDAPControlW, clientctrls : *mut *mut LDAPControlW, serverdata : *mut *mut LDAP_BERVAL) -> i32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32) -> u32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_searchA(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32) -> u32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_searchW(ld : *mut LDAP, base : windows_sys::core::PCWSTR, scope : u32, filter : windows_sys::core::PCWSTR, attrs : *const *const u16, attrsonly : u32) -> u32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_abandon_page(externalhandle : *mut LDAP, searchblock : PLDAPSearch) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_ext(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, servercontrols : *const *const LDAPControlA, clientcontrols : *const *const LDAPControlA, timelimit : u32, sizelimit : u32, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_extA(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, servercontrols : *const *const LDAPControlA, clientcontrols : *const *const LDAPControlA, timelimit : u32, sizelimit : u32, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_extW(ld : *mut LDAP, base : windows_sys::core::PCWSTR, scope : u32, filter : windows_sys::core::PCWSTR, attrs : *const *const u16, attrsonly : u32, servercontrols : *const *const LDAPControlW, clientcontrols : *const *const LDAPControlW, timelimit : u32, sizelimit : u32, messagenumber : *mut u32) -> u32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_ext_s(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, servercontrols : *const *const LDAPControlA, clientcontrols : *const *const LDAPControlA, timeout : *mut LDAP_TIMEVAL, sizelimit : u32, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_ext_sA(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, servercontrols : *const *const LDAPControlA, clientcontrols : *const *const LDAPControlA, timeout : *mut LDAP_TIMEVAL, sizelimit : u32, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_ext_sW(ld : *mut LDAP, base : windows_sys::core::PCWSTR, scope : u32, filter : windows_sys::core::PCWSTR, attrs : *const *const u16, attrsonly : u32, servercontrols : *const *const LDAPControlW, clientcontrols : *const *const LDAPControlW, timeout : *mut LDAP_TIMEVAL, sizelimit : u32, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_init_page(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, scopeofsearch : u32, searchfilter : windows_sys::core::PCSTR, attributelist : *mut *mut i8, attributesonly : u32, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, pagetimelimit : u32, totalsizelimit : u32, sortkeys : *mut *mut LDAPSortKeyA) -> PLDAPSearch);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_init_pageA(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCSTR, scopeofsearch : u32, searchfilter : windows_sys::core::PCSTR, attributelist : *const *const i8, attributesonly : u32, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA, pagetimelimit : u32, totalsizelimit : u32, sortkeys : *mut *mut LDAPSortKeyA) -> PLDAPSearch);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_init_pageW(externalhandle : *mut LDAP, distinguishedname : windows_sys::core::PCWSTR, scopeofsearch : u32, searchfilter : windows_sys::core::PCWSTR, attributelist : *const *const u16, attributesonly : u32, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW, pagetimelimit : u32, totalsizelimit : u32, sortkeys : *mut *mut LDAPSortKeyW) -> PLDAPSearch);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_s(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_sA(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_sW(ld : *mut LDAP, base : windows_sys::core::PCWSTR, scope : u32, filter : windows_sys::core::PCWSTR, attrs : *const *const u16, attrsonly : u32, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_st(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, timeout : *mut LDAP_TIMEVAL, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_stA(ld : *mut LDAP, base : windows_sys::core::PCSTR, scope : u32, filter : windows_sys::core::PCSTR, attrs : *const *const i8, attrsonly : u32, timeout : *mut LDAP_TIMEVAL, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_search_stW(ld : *mut LDAP, base : windows_sys::core::PCWSTR, scope : u32, filter : windows_sys::core::PCWSTR, attrs : *const *const u16, attrsonly : u32, timeout : *mut LDAP_TIMEVAL, res : *mut *mut LDAPMessage) -> u32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_set_dbg_flags(newflags : u32) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_set_dbg_routine(debugprintroutine : DBGPRINT));

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_set_option(ld : *mut LDAP, option : i32, invalue : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_set_optionW(ld : *mut LDAP, option : i32, invalue : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_simple_bind(ld : *mut LDAP, dn : windows_sys::core::PCSTR, passwd : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_simple_bindA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, passwd : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_simple_bindW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, passwd : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_simple_bind_s(ld : *mut LDAP, dn : windows_sys::core::PCSTR, passwd : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_simple_bind_sA(ld : *mut LDAP, dn : windows_sys::core::PCSTR, passwd : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_simple_bind_sW(ld : *mut LDAP, dn : windows_sys::core::PCWSTR, passwd : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_sslinit(hostname : windows_sys::core::PCSTR, portnumber : u32, secure : i32) -> *mut LDAP);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_sslinitA(hostname : windows_sys::core::PCSTR, portnumber : u32, secure : i32) -> *mut LDAP);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_sslinitW(hostname : windows_sys::core::PCWSTR, portnumber : u32, secure : i32) -> *mut LDAP);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_start_tls_sA(externalhandle : *mut LDAP, serverreturnvalue : *mut u32, result : *mut *mut LDAPMessage, servercontrols : *mut *mut LDAPControlA, clientcontrols : *mut *mut LDAPControlA) -> u32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_start_tls_sW(externalhandle : *mut LDAP, serverreturnvalue : *mut u32, result : *mut *mut LDAPMessage, servercontrols : *mut *mut LDAPControlW, clientcontrols : *mut *mut LDAPControlW) -> u32);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_startup(version : *mut LDAP_VERSION_INFO, instance : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_stop_tls_s(externalhandle : *mut LDAP) -> bool);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_ufn2dn(ufn : windows_sys::core::PCSTR, pdn : *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_ufn2dnA(ufn : windows_sys::core::PCSTR, pdn : *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_ufn2dnW(ufn : windows_sys::core::PCWSTR, pdn : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_unbind(ld : *mut LDAP) -> u32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_unbind_s(ld : *mut LDAP) -> u32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_value_free(vals : *const windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_value_freeA(vals : *const windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_value_freeW(vals : *const windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("wldap32.dll" "C" fn ldap_value_free_len(vals : *mut *mut LDAP_BERVAL) -> u32);

// UNSUPPORTED Rust 244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BerElement {
//     pub opaque: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 249:1: declaration Impl has no candidate rule
// impl Default for BerElement {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 254:1: generic scalar type unsupported
// pub type DBGPRINT = Option<unsafe extern "system" fn(format: windows_sys::core::PCSTR) -> u32>;

// UNSUPPORTED Rust 255:1: generic scalar type unsupported
// pub type DEREFERENCECONNECTION = Option<unsafe extern "system" fn(primaryconnection: *mut LDAP, connectiontodereference: *mut LDAP) -> u32>;

public const val `LAPI_MAJOR_VER1`: UInt = 1u;
public const val `LAPI_MINOR_VER1`: UInt = 1u;
public const val `LBER_DEFAULT`: Int = -1;
public const val `LBER_ERROR`: Int = -1;
public const val `LBER_TRANSLATE_STRINGS`: UInt = 4u;
public const val `LBER_USE_DER`: UInt = 1u;
public const val `LBER_USE_INDEFINITE_LEN`: UInt = 2u;
// UNSUPPORTED Rust 263:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAP {
//     pub ld_sb: LDAP_0,
//     pub ld_host: windows_sys::core::PSTR,
//     pub ld_version: u32,
//     pub ld_lberoptions: u8,
//     pub ld_deref: u32,
//     pub ld_timelimit: u32,
//     pub ld_sizelimit: u32,
//     pub ld_errno: u32,
//     pub ld_matched: windows_sys::core::PSTR,
//     pub ld_error: windows_sys::core::PSTR,
//     pub ld_msgid: u32,
//     pub Reserved3: [u8; 25],
//     pub ld_cldaptries: u32,
//     pub ld_cldaptimeout: u32,
//     pub ld_refhoplimit: u32,
//     pub ld_options: u32,
// }

// UNSUPPORTED Rust 283:1: declaration Impl has no candidate rule
// impl Default for LDAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 288:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAP_0 {
//     pub sb_sd: usize,
//     pub Reserved1: [u8; 41],
//     pub sb_naddr: usize,
//     pub Reserved2: [u8; 24],
// }

// UNSUPPORTED Rust 296:1: declaration Impl has no candidate rule
// impl Default for LDAP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPAPIFeatureInfoA {
//     pub ldapaif_info_version: i32,
//     pub ldapaif_name: windows_sys::core::PSTR,
//     pub ldapaif_version: i32,
// }

// UNSUPPORTED Rust 308:1: declaration Impl has no candidate rule
// impl Default for LDAPAPIFeatureInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPAPIFeatureInfoW {
//     pub ldapaif_info_version: i32,
//     pub ldapaif_name: windows_sys::core::PWSTR,
//     pub ldapaif_version: i32,
// }

// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule
// impl Default for LDAPAPIFeatureInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPAPIInfoA {
//     pub ldapai_info_version: i32,
//     pub ldapai_api_version: i32,
//     pub ldapai_protocol_version: i32,
//     pub ldapai_extensions: *mut *mut i8,
//     pub ldapai_vendor_name: windows_sys::core::PSTR,
//     pub ldapai_vendor_version: i32,
// }

// UNSUPPORTED Rust 335:1: declaration Impl has no candidate rule
// impl Default for LDAPAPIInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 340:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPAPIInfoW {
//     pub ldapai_info_version: i32,
//     pub ldapai_api_version: i32,
//     pub ldapai_protocol_version: i32,
//     pub ldapai_extensions: *mut windows_sys::core::PWSTR,
//     pub ldapai_vendor_name: windows_sys::core::PWSTR,
//     pub ldapai_vendor_version: i32,
// }

// UNSUPPORTED Rust 350:1: declaration Impl has no candidate rule
// impl Default for LDAPAPIInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPControlA {
//     pub ldctl_oid: windows_sys::core::PSTR,
//     pub ldctl_value: LDAP_BERVAL,
//     pub ldctl_iscritical: bool,
// }

// UNSUPPORTED Rust 362:1: declaration Impl has no candidate rule
// impl Default for LDAPControlA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 367:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPControlW {
//     pub ldctl_oid: windows_sys::core::PWSTR,
//     pub ldctl_value: LDAP_BERVAL,
//     pub ldctl_iscritical: bool,
// }

// UNSUPPORTED Rust 374:1: declaration Impl has no candidate rule
// impl Default for LDAPControlW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPMessage {
//     pub lm_msgid: u32,
//     pub lm_msgtype: u32,
//     pub lm_ber: *mut core::ffi::c_void,
//     pub lm_chain: *mut LDAPMessage,
//     pub lm_next: *mut LDAPMessage,
//     pub lm_time: u32,
//     pub Connection: *mut LDAP,
//     pub Request: *mut core::ffi::c_void,
//     pub lm_returncode: u32,
//     pub lm_referral: u16,
//     pub lm_chased: bool,
//     pub lm_eom: bool,
//     pub ConnectionReferenced: bool,
// }

// UNSUPPORTED Rust 396:1: declaration Impl has no candidate rule
// impl Default for LDAPMessage {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 401:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPModA {
//     pub mod_op: u32,
//     pub mod_type: windows_sys::core::PSTR,
//     pub mod_vals: LDAPModA_0,
// }

// UNSUPPORTED Rust 408:1: declaration Impl has no candidate rule
// impl Default for LDAPModA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 413:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LDAPModA_0 {
//     pub modv_strvals: *mut windows_sys::core::PSTR,
//     pub modv_bvals: *mut *mut LDAP_BERVAL,
// }

// UNSUPPORTED Rust 419:1: declaration Impl has no candidate rule
// impl Default for LDAPModA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPModW {
//     pub mod_op: u32,
//     pub mod_type: windows_sys::core::PWSTR,
//     pub mod_vals: LDAPModW_0,
// }

// UNSUPPORTED Rust 431:1: declaration Impl has no candidate rule
// impl Default for LDAPModW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 436:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LDAPModW_0 {
//     pub modv_strvals: *mut windows_sys::core::PWSTR,
//     pub modv_bvals: *mut *mut LDAP_BERVAL,
// }

// UNSUPPORTED Rust 442:1: declaration Impl has no candidate rule
// impl Default for LDAPModW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 447:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPSortKeyA {
//     pub sk_attrtype: windows_sys::core::PSTR,
//     pub sk_matchruleoid: windows_sys::core::PSTR,
//     pub sk_reverseorder: bool,
// }

// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule
// impl Default for LDAPSortKeyA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPSortKeyW {
//     pub sk_attrtype: windows_sys::core::PWSTR,
//     pub sk_matchruleoid: windows_sys::core::PWSTR,
//     pub sk_reverseorder: bool,
// }

// UNSUPPORTED Rust 466:1: declaration Impl has no candidate rule
// impl Default for LDAPSortKeyW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 471:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAPVLVInfo {
//     pub ldvlv_version: i32,
//     pub ldvlv_before_count: u32,
//     pub ldvlv_after_count: u32,
//     pub ldvlv_offset: u32,
//     pub ldvlv_count: u32,
//     pub ldvlv_attrvalue: *mut LDAP_BERVAL,
//     pub ldvlv_context: *mut LDAP_BERVAL,
//     pub ldvlv_extradata: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 483:1: declaration Impl has no candidate rule
// impl Default for LDAPVLVInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LDAP_ABANDON_CMD`: Int = 80;
public const val `LDAP_ADD_CMD`: Int = 104;
public const val `LDAP_ADMIN_LIMIT_EXCEEDED`: `LDAP_RETCODE` = 11;
public const val `LDAP_AFFECTS_MULTIPLE_DSAS`: `LDAP_RETCODE` = 71;
public const val `LDAP_ALIAS_DEREF_PROBLEM`: `LDAP_RETCODE` = 36;
public const val `LDAP_ALIAS_PROBLEM`: `LDAP_RETCODE` = 33;
public const val `LDAP_ALREADY_EXISTS`: `LDAP_RETCODE` = 68;
public const val `LDAP_API_FEATURE_VIRTUAL_LIST_VIEW`: UInt = 1001u;
public const val `LDAP_API_INFO_VERSION`: UInt = 1u;
public const val `LDAP_API_VERSION`: UInt = 2004u;
public const val `LDAP_ATTRIBUTE_OR_VALUE_EXISTS`: `LDAP_RETCODE` = 20;
public const val `LDAP_AUTH_METHOD_NOT_SUPPORTED`: `LDAP_RETCODE` = 7;
public const val `LDAP_AUTH_OTHERKIND`: Int = 134;
public const val `LDAP_AUTH_SASL`: Int = 131;
public const val `LDAP_AUTH_SIMPLE`: Int = 128;
public const val `LDAP_AUTH_UNKNOWN`: `LDAP_RETCODE` = 86;
// UNSUPPORTED Rust 504:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDAP_BERVAL {
//     pub bv_len: u32,
//     pub bv_val: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule
// impl Default for LDAP_BERVAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LDAP_BIND_CMD`: Int = 96;
public const val `LDAP_BUSY`: `LDAP_RETCODE` = 51;
// UNSUPPORTED Rust 517:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_ADAM_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1851");

// UNSUPPORTED Rust 518:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_ADAM_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1851");

// UNSUPPORTED Rust 519:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_LDAP_INTEG_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1791");

// UNSUPPORTED Rust 520:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_LDAP_INTEG_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1791");

// UNSUPPORTED Rust 521:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.800");

// UNSUPPORTED Rust 522:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.800");

// UNSUPPORTED Rust 523:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_PARTIAL_SECRETS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1920");

// UNSUPPORTED Rust 524:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_PARTIAL_SECRETS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1920");

// UNSUPPORTED Rust 525:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V51_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1670");

// UNSUPPORTED Rust 526:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V51_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1670");

// UNSUPPORTED Rust 527:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V60_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1935");

// UNSUPPORTED Rust 528:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V60_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1935");

// UNSUPPORTED Rust 529:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V61_OID: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1935");

// UNSUPPORTED Rust 530:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V61_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1935");

// UNSUPPORTED Rust 531:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V61_R2_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2080");

// UNSUPPORTED Rust 532:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_V61_R2_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2080");

// UNSUPPORTED Rust 533:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_W8_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2237");

// UNSUPPORTED Rust 534:1: non-scalar type Ptr unsupported
// pub const LDAP_CAP_ACTIVE_DIRECTORY_W8_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2237");

public const val `LDAP_CHASE_EXTERNAL_REFERRALS`: UInt = 64u;
public const val `LDAP_CHASE_SUBORDINATE_REFERRALS`: UInt = 32u;
public const val `LDAP_CLIENT_LOOP`: `LDAP_RETCODE` = 96;
public const val `LDAP_COMPARE_CMD`: Int = 110;
public const val `LDAP_COMPARE_FALSE`: `LDAP_RETCODE` = 5;
public const val `LDAP_COMPARE_TRUE`: `LDAP_RETCODE` = 6;
public const val `LDAP_CONFIDENTIALITY_REQUIRED`: `LDAP_RETCODE` = 13;
public const val `LDAP_CONNECT_ERROR`: `LDAP_RETCODE` = 91;
public const val `LDAP_CONSTRAINT_VIOLATION`: `LDAP_RETCODE` = 19;
public const val `LDAP_CONTROL_NOT_FOUND`: `LDAP_RETCODE` = 93;
// UNSUPPORTED Rust 545:1: non-scalar type Ptr unsupported
// pub const LDAP_CONTROL_REFERRALS: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.616");

// UNSUPPORTED Rust 546:1: non-scalar type Ptr unsupported
// pub const LDAP_CONTROL_REFERRALS_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.616");

// UNSUPPORTED Rust 547:1: non-scalar type Ptr unsupported
// pub const LDAP_CONTROL_VLVREQUEST: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.3.4.9");

// UNSUPPORTED Rust 548:1: non-scalar type Ptr unsupported
// pub const LDAP_CONTROL_VLVREQUEST_W: windows_sys::core::PCWSTR = windows_sys::core::w!("2.16.840.1.113730.3.4.9");

// UNSUPPORTED Rust 549:1: non-scalar type Ptr unsupported
// pub const LDAP_CONTROL_VLVRESPONSE: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.3.4.10");

// UNSUPPORTED Rust 550:1: non-scalar type Ptr unsupported
// pub const LDAP_CONTROL_VLVRESPONSE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("2.16.840.1.113730.3.4.10");

public const val `LDAP_DECODING_ERROR`: `LDAP_RETCODE` = 84;
public const val `LDAP_DELETE_CMD`: Int = 74;
public const val `LDAP_DEREF_ALWAYS`: UInt = 3u;
public const val `LDAP_DEREF_FINDING`: UInt = 2u;
public const val `LDAP_DEREF_NEVER`: UInt = 0u;
public const val `LDAP_DEREF_SEARCHING`: UInt = 1u;
public const val `LDAP_DIRSYNC_ANCESTORS_FIRST_ORDER`: UInt = 2048u;
public const val `LDAP_DIRSYNC_INCREMENTAL_VALUES`: UInt = 2147483648u;
public const val `LDAP_DIRSYNC_OBJECT_SECURITY`: UInt = 1u;
public const val `LDAP_DIRSYNC_PUBLIC_DATA_ONLY`: UInt = 8192u;
public const val `LDAP_DIRSYNC_ROPAS_DATA_ONLY`: UInt = 1073741824u;
public const val `LDAP_ENCODING_ERROR`: `LDAP_RETCODE` = 83;
public const val `LDAP_EXTENDED_CMD`: Int = 119;
public const val `LDAP_FEATURE_INFO_VERSION`: UInt = 1u;
public const val `LDAP_FILTER_AND`: UInt = 160u;
public const val `LDAP_FILTER_APPROX`: UInt = 168u;
public const val `LDAP_FILTER_EQUALITY`: UInt = 163u;
public const val `LDAP_FILTER_ERROR`: `LDAP_RETCODE` = 87;
public const val `LDAP_FILTER_EXTENSIBLE`: UInt = 169u;
public const val `LDAP_FILTER_GE`: UInt = 165u;
public const val `LDAP_FILTER_LE`: UInt = 166u;
public const val `LDAP_FILTER_NOT`: UInt = 162u;
public const val `LDAP_FILTER_OR`: UInt = 161u;
public const val `LDAP_FILTER_PRESENT`: UInt = 135u;
public const val `LDAP_FILTER_SUBSTRINGS`: UInt = 164u;
public const val `LDAP_GC_PORT`: UInt = 3268u;
public const val `LDAP_INAPPROPRIATE_AUTH`: `LDAP_RETCODE` = 48;
public const val `LDAP_INAPPROPRIATE_MATCHING`: `LDAP_RETCODE` = 18;
public const val `LDAP_INSUFFICIENT_RIGHTS`: `LDAP_RETCODE` = 50;
public const val `LDAP_INVALID_CMD`: UInt = 255u;
public const val `LDAP_INVALID_CREDENTIALS`: `LDAP_RETCODE` = 49;
public const val `LDAP_INVALID_DN_SYNTAX`: `LDAP_RETCODE` = 34;
public const val `LDAP_INVALID_RES`: UInt = 255u;
public const val `LDAP_INVALID_SYNTAX`: `LDAP_RETCODE` = 21;
public const val `LDAP_IS_LEAF`: `LDAP_RETCODE` = 35;
public const val `LDAP_LOCAL_ERROR`: `LDAP_RETCODE` = 82;
public const val `LDAP_LOOP_DETECT`: `LDAP_RETCODE` = 54;
// UNSUPPORTED Rust 588:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_BIT_AND: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.803");

// UNSUPPORTED Rust 589:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_BIT_AND_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.803");

// UNSUPPORTED Rust 590:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_BIT_OR: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.804");

// UNSUPPORTED Rust 591:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_BIT_OR_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.804");

// UNSUPPORTED Rust 592:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_DN_BINARY_COMPLEX: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2253");

// UNSUPPORTED Rust 593:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_DN_BINARY_COMPLEX_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2253");

// UNSUPPORTED Rust 594:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_TRANSITIVE_EVALUATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1941");

// UNSUPPORTED Rust 595:1: non-scalar type Ptr unsupported
// pub const LDAP_MATCHING_RULE_TRANSITIVE_EVALUATION_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1941");

public const val `LDAP_MODIFY_CMD`: Int = 102;
public const val `LDAP_MODRDN_CMD`: Int = 108;
public const val `LDAP_MOD_ADD`: UInt = 0u;
public const val `LDAP_MOD_BVALUES`: UInt = 128u;
public const val `LDAP_MOD_DELETE`: UInt = 1u;
public const val `LDAP_MOD_REPLACE`: UInt = 2u;
public const val `LDAP_MORE_RESULTS_TO_RETURN`: `LDAP_RETCODE` = 95;
public const val `LDAP_MSG_ALL`: UInt = 1u;
public const val `LDAP_MSG_ONE`: UInt = 0u;
public const val `LDAP_MSG_RECEIVED`: UInt = 2u;
public const val `LDAP_NAMING_VIOLATION`: `LDAP_RETCODE` = 64;
public const val `LDAP_NOT_ALLOWED_ON_NONLEAF`: `LDAP_RETCODE` = 66;
public const val `LDAP_NOT_ALLOWED_ON_RDN`: `LDAP_RETCODE` = 67;
public const val `LDAP_NOT_SUPPORTED`: `LDAP_RETCODE` = 92;
public const val `LDAP_NO_LIMIT`: UInt = 0u;
public const val `LDAP_NO_MEMORY`: `LDAP_RETCODE` = 90;
public const val `LDAP_NO_OBJECT_CLASS_MODS`: `LDAP_RETCODE` = 69;
public const val `LDAP_NO_RESULTS_RETURNED`: `LDAP_RETCODE` = 94;
public const val `LDAP_NO_SUCH_ATTRIBUTE`: `LDAP_RETCODE` = 16;
public const val `LDAP_NO_SUCH_OBJECT`: `LDAP_RETCODE` = 32;
public const val `LDAP_OBJECT_CLASS_VIOLATION`: `LDAP_RETCODE` = 65;
public const val `LDAP_OFFSET_RANGE_ERROR`: `LDAP_RETCODE` = 61;
// UNSUPPORTED Rust 618:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_ABANDON_REPL: windows_sys::core::PCSTR = windows_sys::core::s!("abandonReplication");

// UNSUPPORTED Rust 619:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_ABANDON_REPL_W: windows_sys::core::PCWSTR = windows_sys::core::w!("abandonReplication");

// UNSUPPORTED Rust 620:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_DOM_MASTER: windows_sys::core::PCSTR = windows_sys::core::s!("becomeDomainMaster");

// UNSUPPORTED Rust 621:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_DOM_MASTER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("becomeDomainMaster");

// UNSUPPORTED Rust 622:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_PDC: windows_sys::core::PCSTR = windows_sys::core::s!("becomePdc");

// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_PDC_W: windows_sys::core::PCWSTR = windows_sys::core::w!("becomePdc");

// UNSUPPORTED Rust 624:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_RID_MASTER: windows_sys::core::PCSTR = windows_sys::core::s!("becomeRidMaster");

// UNSUPPORTED Rust 625:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_RID_MASTER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("becomeRidMaster");

// UNSUPPORTED Rust 626:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_SCHEMA_MASTER: windows_sys::core::PCSTR = windows_sys::core::s!("becomeSchemaMaster");

// UNSUPPORTED Rust 627:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_BECOME_SCHEMA_MASTER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("becomeSchemaMaster");

// UNSUPPORTED Rust 628:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_CONFIG_NAMING_CONTEXT: windows_sys::core::PCSTR = windows_sys::core::s!("configurationNamingContext");

// UNSUPPORTED Rust 629:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_CONFIG_NAMING_CONTEXT_W: windows_sys::core::PCWSTR = windows_sys::core::w!("configurationNamingContext");

// UNSUPPORTED Rust 630:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_CURRENT_TIME: windows_sys::core::PCSTR = windows_sys::core::s!("currentTime");

// UNSUPPORTED Rust 631:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_CURRENT_TIME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("currentTime");

// UNSUPPORTED Rust 632:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DEFAULT_NAMING_CONTEXT: windows_sys::core::PCSTR = windows_sys::core::s!("defaultNamingContext");

// UNSUPPORTED Rust 633:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DEFAULT_NAMING_CONTEXT_W: windows_sys::core::PCWSTR = windows_sys::core::w!("defaultNamingContext");

// UNSUPPORTED Rust 634:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DNS_HOST_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("dnsHostName");

// UNSUPPORTED Rust 635:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DNS_HOST_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("dnsHostName");

// UNSUPPORTED Rust 636:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DO_GARBAGE_COLLECTION: windows_sys::core::PCSTR = windows_sys::core::s!("doGarbageCollection");

// UNSUPPORTED Rust 637:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DO_GARBAGE_COLLECTION_W: windows_sys::core::PCWSTR = windows_sys::core::w!("doGarbageCollection");

// UNSUPPORTED Rust 638:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DS_SERVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("dsServiceName");

// UNSUPPORTED Rust 639:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_DS_SERVICE_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("dsServiceName");

// UNSUPPORTED Rust 640:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_FIXUP_INHERITANCE: windows_sys::core::PCSTR = windows_sys::core::s!("fixupInheritance");

// UNSUPPORTED Rust 641:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_FIXUP_INHERITANCE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("fixupInheritance");

// UNSUPPORTED Rust 642:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_HIGHEST_COMMITTED_USN: windows_sys::core::PCSTR = windows_sys::core::s!("highestCommitedUSN");

// UNSUPPORTED Rust 643:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_HIGHEST_COMMITTED_USN_W: windows_sys::core::PCWSTR = windows_sys::core::w!("highestCommitedUSN");

// UNSUPPORTED Rust 644:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_INVALIDATE_RID_POOL: windows_sys::core::PCSTR = windows_sys::core::s!("invalidateRidPool");

// UNSUPPORTED Rust 645:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_INVALIDATE_RID_POOL_W: windows_sys::core::PCWSTR = windows_sys::core::w!("invalidateRidPool");

// UNSUPPORTED Rust 646:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_LDAP_SERVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("ldapServiceName");

// UNSUPPORTED Rust 647:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_LDAP_SERVICE_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("ldapServiceName");

// UNSUPPORTED Rust 648:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_NAMING_CONTEXTS: windows_sys::core::PCSTR = windows_sys::core::s!("namingContexts");

// UNSUPPORTED Rust 649:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_NAMING_CONTEXTS_W: windows_sys::core::PCWSTR = windows_sys::core::w!("namingContexts");

// UNSUPPORTED Rust 650:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_RECALC_HIERARCHY: windows_sys::core::PCSTR = windows_sys::core::s!("recalcHierarchy");

// UNSUPPORTED Rust 651:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_RECALC_HIERARCHY_W: windows_sys::core::PCWSTR = windows_sys::core::w!("recalcHierarchy");

// UNSUPPORTED Rust 652:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_ROOT_DOMAIN_NAMING_CONTEXT: windows_sys::core::PCSTR = windows_sys::core::s!("rootDomainNamingContext");

// UNSUPPORTED Rust 653:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_ROOT_DOMAIN_NAMING_CONTEXT_W: windows_sys::core::PCWSTR = windows_sys::core::w!("rootDomainNamingContext");

// UNSUPPORTED Rust 654:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SCHEMA_NAMING_CONTEXT: windows_sys::core::PCSTR = windows_sys::core::s!("schemaNamingContext");

// UNSUPPORTED Rust 655:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SCHEMA_NAMING_CONTEXT_W: windows_sys::core::PCWSTR = windows_sys::core::w!("schemaNamingContext");

// UNSUPPORTED Rust 656:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SCHEMA_UPDATE_NOW: windows_sys::core::PCSTR = windows_sys::core::s!("schemaUpdateNow");

// UNSUPPORTED Rust 657:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SCHEMA_UPDATE_NOW_W: windows_sys::core::PCWSTR = windows_sys::core::w!("schemaUpdateNow");

// UNSUPPORTED Rust 658:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SERVER_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("serverName");

// UNSUPPORTED Rust 659:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SERVER_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("serverName");

// UNSUPPORTED Rust 660:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUBSCHEMA_SUBENTRY: windows_sys::core::PCSTR = windows_sys::core::s!("subschemaSubentry");

// UNSUPPORTED Rust 661:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUBSCHEMA_SUBENTRY_W: windows_sys::core::PCWSTR = windows_sys::core::w!("subschemaSubentry");

// UNSUPPORTED Rust 662:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_CAPABILITIES: windows_sys::core::PCSTR = windows_sys::core::s!("supportedCapabilities");

// UNSUPPORTED Rust 663:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_CAPABILITIES_W: windows_sys::core::PCWSTR = windows_sys::core::w!("supportedCapabilities");

// UNSUPPORTED Rust 664:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_CONTROL: windows_sys::core::PCSTR = windows_sys::core::s!("supportedControl");

// UNSUPPORTED Rust 665:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_CONTROL_W: windows_sys::core::PCWSTR = windows_sys::core::w!("supportedControl");

// UNSUPPORTED Rust 666:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_LDAP_POLICIES: windows_sys::core::PCSTR = windows_sys::core::s!("supportedLDAPPolicies");

// UNSUPPORTED Rust 667:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_LDAP_POLICIES_W: windows_sys::core::PCWSTR = windows_sys::core::w!("supportedLDAPPolicies");

// UNSUPPORTED Rust 668:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_LDAP_VERSION: windows_sys::core::PCSTR = windows_sys::core::s!("supportedLDAPVersion");

// UNSUPPORTED Rust 669:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_LDAP_VERSION_W: windows_sys::core::PCWSTR = windows_sys::core::w!("supportedLDAPVersion");

// UNSUPPORTED Rust 670:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_SASL_MECHANISM: windows_sys::core::PCSTR = windows_sys::core::s!("supportedSASLMechanisms");

// UNSUPPORTED Rust 671:1: non-scalar type Ptr unsupported
// pub const LDAP_OPATT_SUPPORTED_SASL_MECHANISM_W: windows_sys::core::PCWSTR = windows_sys::core::w!("supportedSASLMechanisms");

public const val `LDAP_OPERATIONS_ERROR`: `LDAP_RETCODE` = 1;
public const val `LDAP_OPT_API_FEATURE_INFO`: UInt = 21u;
public const val `LDAP_OPT_API_INFO`: UInt = 0u;
public const val `LDAP_OPT_AREC_EXCLUSIVE`: UInt = 152u;
public const val `LDAP_OPT_AUTO_RECONNECT`: UInt = 145u;
public const val `LDAP_OPT_CACHE_ENABLE`: UInt = 15u;
public const val `LDAP_OPT_CACHE_FN_PTRS`: UInt = 13u;
public const val `LDAP_OPT_CACHE_STRATEGY`: UInt = 14u;
public const val `LDAP_OPT_CHASE_REFERRALS`: UInt = 2u;
public const val `LDAP_OPT_CLDAP_TIMEOUT`: UInt = 69u;
public const val `LDAP_OPT_CLDAP_TRIES`: UInt = 70u;
public const val `LDAP_OPT_CLIENT_CERTIFICATE`: UInt = 128u;
public const val `LDAP_OPT_DEREF`: UInt = 2u;
public const val `LDAP_OPT_DESC`: UInt = 1u;
public const val `LDAP_OPT_DNS`: UInt = 1u;
public const val `LDAP_OPT_DNSDOMAIN_NAME`: UInt = 59u;
public const val `LDAP_OPT_ENCRYPT`: UInt = 150u;
public const val `LDAP_OPT_ERROR_NUMBER`: UInt = 49u;
public const val `LDAP_OPT_ERROR_STRING`: UInt = 50u;
public const val `LDAP_OPT_FAST_CONCURRENT_BIND`: UInt = 65u;
public const val `LDAP_OPT_GETDSNAME_FLAGS`: UInt = 61u;
public const val `LDAP_OPT_HOST_NAME`: UInt = 48u;
public const val `LDAP_OPT_HOST_REACHABLE`: UInt = 62u;
public const val `LDAP_OPT_IO_FN_PTRS`: UInt = 11u;
public const val `LDAP_OPT_PING_KEEP_ALIVE`: UInt = 54u;
public const val `LDAP_OPT_PING_LIMIT`: UInt = 56u;
public const val `LDAP_OPT_PING_WAIT_TIME`: UInt = 55u;
public const val `LDAP_OPT_PROMPT_CREDENTIALS`: UInt = 63u;
public const val `LDAP_OPT_PROTOCOL_VERSION`: UInt = 17u;
public const val `LDAP_OPT_REBIND_ARG`: UInt = 7u;
public const val `LDAP_OPT_REBIND_FN`: UInt = 6u;
public const val `LDAP_OPT_REFERRALS`: UInt = 8u;
public const val `LDAP_OPT_REFERRAL_CALLBACK`: UInt = 112u;
public const val `LDAP_OPT_REFERRAL_HOP_LIMIT`: UInt = 16u;
public const val `LDAP_OPT_REF_DEREF_CONN_PER_MSG`: UInt = 148u;
public const val `LDAP_OPT_RESTART`: UInt = 9u;
public const val `LDAP_OPT_RETURN_REFS`: UInt = 4u;
public const val `LDAP_OPT_ROOTDSE_CACHE`: UInt = 154u;
public const val `LDAP_OPT_SASL_METHOD`: UInt = 151u;
public const val `LDAP_OPT_SCH_FLAGS`: UInt = 67u;
public const val `LDAP_OPT_SECURITY_CONTEXT`: UInt = 153u;
public const val `LDAP_OPT_SEND_TIMEOUT`: UInt = 66u;
public const val `LDAP_OPT_SERVER_CERTIFICATE`: UInt = 129u;
public const val `LDAP_OPT_SERVER_ERROR`: UInt = 51u;
public const val `LDAP_OPT_SERVER_EXT_ERROR`: UInt = 52u;
public const val `LDAP_OPT_SIGN`: UInt = 149u;
public const val `LDAP_OPT_SIZELIMIT`: UInt = 3u;
public const val `LDAP_OPT_SOCKET_BIND_ADDRESSES`: UInt = 68u;
public const val `LDAP_OPT_SSL`: UInt = 10u;
public const val `LDAP_OPT_SSL_INFO`: UInt = 147u;
public const val `LDAP_OPT_SSPI_FLAGS`: UInt = 146u;
public const val `LDAP_OPT_TCP_KEEPALIVE`: UInt = 64u;
public const val `LDAP_OPT_THREAD_FN_PTRS`: UInt = 5u;
public const val `LDAP_OPT_TIMELIMIT`: UInt = 4u;
public const val `LDAP_OPT_TLS`: UInt = 10u;
public const val `LDAP_OPT_TLS_INFO`: UInt = 147u;
public const val `LDAP_OPT_VERSION`: UInt = 17u;
public const val `LDAP_OTHER`: `LDAP_RETCODE` = 80;
// UNSUPPORTED Rust 730:1: non-scalar type Ptr unsupported
// pub const LDAP_PAGED_RESULT_OID_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.319");

// UNSUPPORTED Rust 731:1: non-scalar type Ptr unsupported
// pub const LDAP_PAGED_RESULT_OID_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.319");

public const val `LDAP_PARAM_ERROR`: `LDAP_RETCODE` = 89;
public const val `LDAP_PARTIAL_RESULTS`: `LDAP_RETCODE` = 9;
public const val `LDAP_POLICYHINT_APPLY_FULLPWDPOLICY`: UInt = 1u;
public const val `LDAP_PORT`: UInt = 389u;
public const val `LDAP_PROTOCOL_ERROR`: `LDAP_RETCODE` = 2;
public const val `LDAP_REFERRAL`: `LDAP_RETCODE` = 10;
// UNSUPPORTED Rust 738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LDAP_REFERRAL_CALLBACK {
//     pub SizeOfCallbacks: u32,
//     pub QueryForConnection: QUERYFORCONNECTION,
//     pub NotifyRoutine: NOTIFYOFNEWCONNECTION,
//     pub DereferenceRoutine: DEREFERENCECONNECTION,
// }

public const val `LDAP_REFERRAL_LIMIT_EXCEEDED`: `LDAP_RETCODE` = 97;
public const val `LDAP_REFERRAL_V2`: `LDAP_RETCODE` = 9;
public const val `LDAP_RESULTS_TOO_LARGE`: `LDAP_RETCODE` = 70;
public const val `LDAP_RES_ADD`: Int = 105;
public const val `LDAP_RES_ANY`: Int = -1;
public const val `LDAP_RES_BIND`: Int = 97;
public const val `LDAP_RES_COMPARE`: Int = 111;
public const val `LDAP_RES_DELETE`: Int = 107;
public const val `LDAP_RES_EXTENDED`: Int = 120;
public const val `LDAP_RES_MODIFY`: Int = 103;
public const val `LDAP_RES_MODRDN`: Int = 109;
public const val `LDAP_RES_REFERRAL`: Int = 115;
public const val `LDAP_RES_SEARCH_ENTRY`: Int = 100;
public const val `LDAP_RES_SEARCH_RESULT`: Int = 101;
public const val `LDAP_RES_SESSION`: Int = 114;
public typealias `LDAP_RETCODE` = Int;
public const val `LDAP_SASL_BIND_IN_PROGRESS`: `LDAP_RETCODE` = 14;
public const val `LDAP_SCOPE_BASE`: UInt = 0u;
public const val `LDAP_SCOPE_ONELEVEL`: UInt = 1u;
public const val `LDAP_SCOPE_SUBTREE`: UInt = 2u;
public const val `LDAP_SEARCH_CMD`: Int = 99;
// UNSUPPORTED Rust 767:1: non-scalar type Ptr unsupported
// pub const LDAP_SEARCH_HINT_INDEX_ONLY_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2207");

// UNSUPPORTED Rust 768:1: non-scalar type Ptr unsupported
// pub const LDAP_SEARCH_HINT_INDEX_ONLY_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2207");

// UNSUPPORTED Rust 769:1: non-scalar type Ptr unsupported
// pub const LDAP_SEARCH_HINT_REQUIRED_INDEX_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2306");

// UNSUPPORTED Rust 770:1: non-scalar type Ptr unsupported
// pub const LDAP_SEARCH_HINT_REQUIRED_INDEX_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2306");

// UNSUPPORTED Rust 771:1: non-scalar type Ptr unsupported
// pub const LDAP_SEARCH_HINT_SOFT_SIZE_LIMIT_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2210");

// UNSUPPORTED Rust 772:1: non-scalar type Ptr unsupported
// pub const LDAP_SEARCH_HINT_SOFT_SIZE_LIMIT_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2210");

// UNSUPPORTED Rust 773:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_ASQ_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1504");

// UNSUPPORTED Rust 774:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_ASQ_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1504");

// UNSUPPORTED Rust 775:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_BATCH_REQUEST_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2212");

// UNSUPPORTED Rust 776:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_BATCH_REQUEST_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2212");

// UNSUPPORTED Rust 777:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_BYPASS_QUOTA_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2256");

// UNSUPPORTED Rust 778:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_BYPASS_QUOTA_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2256");

// UNSUPPORTED Rust 779:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_CROSSDOM_MOVE_TARGET_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.521");

// UNSUPPORTED Rust 780:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_CROSSDOM_MOVE_TARGET_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.521");

// UNSUPPORTED Rust 781:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DIRSYNC_EX_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2090");

// UNSUPPORTED Rust 782:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DIRSYNC_EX_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2090");

// UNSUPPORTED Rust 783:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DIRSYNC_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.841");

// UNSUPPORTED Rust 784:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DIRSYNC_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.841");

// UNSUPPORTED Rust 785:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DN_INPUT_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2026");

// UNSUPPORTED Rust 786:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DN_INPUT_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2026");

// UNSUPPORTED Rust 787:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DOMAIN_SCOPE_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1339");

// UNSUPPORTED Rust 788:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_DOMAIN_SCOPE_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1339");

public const val `LDAP_SERVER_DOWN`: `LDAP_RETCODE` = 81;
// UNSUPPORTED Rust 790:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_EXPECTED_ENTRY_COUNT_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2211");

// UNSUPPORTED Rust 791:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_EXPECTED_ENTRY_COUNT_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2211");

// UNSUPPORTED Rust 792:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_EXTENDED_DN_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.529");

// UNSUPPORTED Rust 793:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_EXTENDED_DN_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.529");

// UNSUPPORTED Rust 794:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_FAST_BIND_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1781");

// UNSUPPORTED Rust 795:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_FAST_BIND_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1781");

// UNSUPPORTED Rust 796:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_FORCE_UPDATE_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1974");

// UNSUPPORTED Rust 797:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_FORCE_UPDATE_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1974");

// UNSUPPORTED Rust 798:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_GET_STATS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.970");

// UNSUPPORTED Rust 799:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_GET_STATS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.970");

// UNSUPPORTED Rust 800:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_LAZY_COMMIT_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.619");

// UNSUPPORTED Rust 801:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_LAZY_COMMIT_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.619");

// UNSUPPORTED Rust 802:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_LINK_TTL_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2309");

// UNSUPPORTED Rust 803:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_LINK_TTL_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2309");

// UNSUPPORTED Rust 804:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_NOTIFICATION_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.528");

// UNSUPPORTED Rust 805:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_NOTIFICATION_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.528");

// UNSUPPORTED Rust 806:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_PERMISSIVE_MODIFY_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1413");

// UNSUPPORTED Rust 807:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_PERMISSIVE_MODIFY_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1413");

// UNSUPPORTED Rust 808:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_POLICY_HINTS_DEPRECATED_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2066");

// UNSUPPORTED Rust 809:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_POLICY_HINTS_DEPRECATED_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2066");

// UNSUPPORTED Rust 810:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_POLICY_HINTS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2239");

// UNSUPPORTED Rust 811:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_POLICY_HINTS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2239");

// UNSUPPORTED Rust 812:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_QUOTA_CONTROL_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1852");

// UNSUPPORTED Rust 813:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_QUOTA_CONTROL_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1852");

// UNSUPPORTED Rust 814:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_RANGE_OPTION_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.802");

// UNSUPPORTED Rust 815:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_RANGE_OPTION_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.802");

// UNSUPPORTED Rust 816:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_RANGE_RETRIEVAL_NOERR_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1948");

// UNSUPPORTED Rust 817:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_RANGE_RETRIEVAL_NOERR_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1948");

// UNSUPPORTED Rust 818:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_RESP_SORT_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.474");

// UNSUPPORTED Rust 819:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_RESP_SORT_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.474");

// UNSUPPORTED Rust 820:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SD_FLAGS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.801");

// UNSUPPORTED Rust 821:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SD_FLAGS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.801");

// UNSUPPORTED Rust 822:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SEARCH_HINTS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2206");

// UNSUPPORTED Rust 823:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SEARCH_HINTS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2206");

// UNSUPPORTED Rust 824:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SEARCH_OPTIONS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1340");

// UNSUPPORTED Rust 825:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SEARCH_OPTIONS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1340");

// UNSUPPORTED Rust 826:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SET_OWNER_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2255");

// UNSUPPORTED Rust 827:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SET_OWNER_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2255");

// UNSUPPORTED Rust 828:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHOW_DEACTIVATED_LINK_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2065");

// UNSUPPORTED Rust 829:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHOW_DEACTIVATED_LINK_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2065");

// UNSUPPORTED Rust 830:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHOW_DELETED_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.417");

// UNSUPPORTED Rust 831:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHOW_DELETED_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.417");

// UNSUPPORTED Rust 832:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHOW_RECYCLED_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2064");

// UNSUPPORTED Rust 833:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHOW_RECYCLED_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2064");

// UNSUPPORTED Rust 834:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHUTDOWN_NOTIFY_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1907");

// UNSUPPORTED Rust 835:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SHUTDOWN_NOTIFY_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1907");

// UNSUPPORTED Rust 836:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SORT_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.473");

// UNSUPPORTED Rust 837:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_SORT_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.473");

// UNSUPPORTED Rust 838:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_TREE_DELETE_EX_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2204");

// UNSUPPORTED Rust 839:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_TREE_DELETE_EX_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2204");

// UNSUPPORTED Rust 840:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_TREE_DELETE_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.805");

// UNSUPPORTED Rust 841:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_TREE_DELETE_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.805");

// UNSUPPORTED Rust 842:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_UPDATE_STATS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2205");

// UNSUPPORTED Rust 843:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_UPDATE_STATS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2205");

// UNSUPPORTED Rust 844:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_VERIFY_NAME_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.1338");

// UNSUPPORTED Rust 845:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_VERIFY_NAME_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.1338");

// UNSUPPORTED Rust 846:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_WHO_AM_I_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.4203.1.11.3");

// UNSUPPORTED Rust 847:1: non-scalar type Ptr unsupported
// pub const LDAP_SERVER_WHO_AM_I_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.6.1.4.1.4203.1.11.3");

public const val `LDAP_SESSION_CMD`: Int = 113;
public const val `LDAP_SIZELIMIT_EXCEEDED`: `LDAP_RETCODE` = 4;
public const val `LDAP_SORT_CONTROL_MISSING`: `LDAP_RETCODE` = 60;
public const val `LDAP_SSL_GC_PORT`: UInt = 3269u;
public const val `LDAP_SSL_PORT`: UInt = 636u;
// UNSUPPORTED Rust 853:1: non-scalar type Ptr unsupported
// pub const LDAP_START_TLS_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.1466.20037");

// UNSUPPORTED Rust 854:1: non-scalar type Ptr unsupported
// pub const LDAP_START_TLS_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.6.1.4.1.1466.20037");

public const val `LDAP_STRONG_AUTH_REQUIRED`: `LDAP_RETCODE` = 8;
public const val `LDAP_SUBSTRING_ANY`: Int = 129;
public const val `LDAP_SUBSTRING_FINAL`: Int = 130;
public const val `LDAP_SUBSTRING_INITIAL`: Int = 128;
public const val `LDAP_SUCCESS`: `LDAP_RETCODE` = 0;
public const val `LDAP_TIMELIMIT_EXCEEDED`: `LDAP_RETCODE` = 3;
public const val `LDAP_TIMEOUT`: `LDAP_RETCODE` = 85;
// UNSUPPORTED Rust 862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LDAP_TIMEVAL {
//     pub tv_sec: i32,
//     pub tv_usec: i32,
// }

// UNSUPPORTED Rust 868:1: non-scalar type Ptr unsupported
// pub const LDAP_TTL_EXTENDED_OP_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.1466.101.119.1");

// UNSUPPORTED Rust 869:1: non-scalar type Ptr unsupported
// pub const LDAP_TTL_EXTENDED_OP_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.6.1.4.1.1466.101.119.1");

public const val `LDAP_UNAVAILABLE`: `LDAP_RETCODE` = 52;
public const val `LDAP_UNAVAILABLE_CRIT_EXTENSION`: `LDAP_RETCODE` = 12;
public const val `LDAP_UNBIND_CMD`: Int = 66;
public const val `LDAP_UNDEFINED_TYPE`: `LDAP_RETCODE` = 17;
public const val `LDAP_UNICODE`: UInt = 1u;
public const val `LDAP_UNWILLING_TO_PERFORM`: `LDAP_RETCODE` = 53;
// UNSUPPORTED Rust 876:1: non-scalar type Ptr unsupported
// pub const LDAP_UPDATE_STATS_INVOCATIONID_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2209");

// UNSUPPORTED Rust 877:1: non-scalar type Ptr unsupported
// pub const LDAP_UPDATE_STATS_INVOCATIONID_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2209");

// UNSUPPORTED Rust 878:1: non-scalar type Ptr unsupported
// pub const LDAP_UPDATE_STATS_USN_OID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113556.1.4.2208");

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported
// pub const LDAP_UPDATE_STATS_USN_OID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113556.1.4.2208");

public const val `LDAP_USER_CANCELLED`: `LDAP_RETCODE` = 88;
// UNSUPPORTED Rust 881:1: non-scalar type Ptr unsupported
// pub const LDAP_VENDOR_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Corporation.");

// UNSUPPORTED Rust 882:1: non-scalar type Ptr unsupported
// pub const LDAP_VENDOR_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Corporation.");

public const val `LDAP_VENDOR_VERSION`: UInt = 510u;
public const val `LDAP_VERSION`: UInt = 2u;
public const val `LDAP_VERSION1`: UInt = 1u;
public const val `LDAP_VERSION2`: UInt = 2u;
public const val `LDAP_VERSION3`: UInt = 3u;
// UNSUPPORTED Rust 888:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LDAP_VERSION_INFO {
//     pub lv_size: u32,
//     pub lv_major: u32,
//     pub lv_minor: u32,
// }

public const val `LDAP_VERSION_MAX`: UInt = 3u;
public const val `LDAP_VERSION_MIN`: UInt = 2u;
public const val `LDAP_VIRTUAL_LIST_VIEW_ERROR`: `LDAP_RETCODE` = 76;
public const val `LDAP_VLVINFO_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 899:1: generic scalar type unsupported
// pub type NOTIFYOFNEWCONNECTION = Option<unsafe extern "system" fn(primaryconnection: *mut LDAP, referralfromconnection: *mut LDAP, newdn: windows_sys::core::PCWSTR, hostname: windows_sys::core::PCSTR, newconnection: *mut LDAP, portnumber: u32, secauthidentity: *mut core::ffi::c_void, currentuser: *mut core::ffi::c_void, errorcodefrombind: u32) -> bool>;

public typealias `PLDAPSearch` = Long;
// UNSUPPORTED Rust 901:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// pub type QUERYCLIENTCERT = Option<unsafe extern "system" fn(connection: *mut LDAP, trusted_cas: *mut super::super::Security::Authentication::Identity::SecPkgContext_IssuerListInfoEx, ppcertificate: *mut *mut super::super::Security::Cryptography::CERT_CONTEXT) -> bool>;

// UNSUPPORTED Rust 903:1: generic scalar type unsupported
// pub type QUERYFORCONNECTION = Option<unsafe extern "system" fn(primaryconnection: *mut LDAP, referralfromconnection: *mut LDAP, newdn: windows_sys::core::PCWSTR, hostname: windows_sys::core::PCSTR, portnumber: u32, secauthidentity: *mut core::ffi::c_void, currentusertoken: *mut core::ffi::c_void, connectiontouse: *mut *mut LDAP) -> u32>;

public const val `SERVER_SEARCH_FLAG_DOMAIN_SCOPE`: UInt = 1u;
public const val `SERVER_SEARCH_FLAG_PHANTOM_ROOT`: UInt = 2u;
// UNSUPPORTED Rust 906:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_Cryptography")]
// pub type VERIFYSERVERCERT = Option<unsafe extern "system" fn(connection: *mut LDAP, pservercert: *mut *mut super::super::Security::Cryptography::CERT_CONTEXT) -> bool>;

