// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=LdapGetLastError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LdapGetLastError`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=LdapMapErrorToWin32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LdapMapErrorToWin32`(`ldaperror` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=LdapUTF8ToUnicode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LdapUTF8ToUnicode`(`lpsrcstr` : `windows_sys`.`core`.`PCSTR`, `cchsrc` : Int, `lpdeststr` : `windows_sys`.`core`.`PWSTR`, `cchdest` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=LdapUnicodeToUTF8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LdapUnicodeToUTF8`(`lpsrcstr` : `windows_sys`.`core`.`PCWSTR`, `cchsrc` : Int, `lpdeststr` : `windows_sys`.`core`.`PSTR`, `cchdest` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_alloc_t; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_alloc_t`(`options` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_bvdup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_bvdup`(`pberval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_bvecfree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_bvecfree`(`pberval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_bvfree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_bvfree`(`bv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_first_element; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_first_element`(`pberelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?, `plen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppopaque` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_flatten; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_flatten`(`pberelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?, `pberval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_free; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_free`(`pberelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?, `fbuf` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_init; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_init`(`pberval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_next_element; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_next_element`(`pberelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?, `plen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `opaque` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_peek_tag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_peek_tag`(`pberelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?, `plen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// UNSUPPORTED Rust 15:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("wldap32.dll" "C" fn ber_printf(pberelement : *mut BerElement, fmt : windows_sys::core::PCSTR, ...) -> i32);

// UNSUPPORTED Rust 16:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("wldap32.dll" "C" fn ber_scanf(pberelement : *mut BerElement, fmt : windows_sys::core::PCSTR, ...) -> u32);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ber_skip_tag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ber_skip_tag`(`pberelement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?, `plen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=cldap_open; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `cldap_open`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=cldap_openA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `cldap_openA`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=cldap_openW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `cldap_openW`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_abandon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_abandon`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `msgid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_addA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_addA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_addW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_addW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_ext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_ext`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_extA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_extA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_extW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_extW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_ext_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_ext_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_ext_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_ext_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_ext_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_ext_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_add_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_add_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_bind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_bind`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `cred` : `windows_sys`.`core`.`PCSTR`, `method` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_bindA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_bindA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `cred` : `windows_sys`.`core`.`PCSTR`, `method` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_bindW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_bindW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `cred` : `windows_sys`.`core`.`PCWSTR`, `method` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_bind_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_bind_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `cred` : `windows_sys`.`core`.`PCSTR`, `method` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_bind_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_bind_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `cred` : `windows_sys`.`core`.`PCSTR`, `method` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_bind_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_bind_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `cred` : `windows_sys`.`core`.`PCWSTR`, `method` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_check_filterA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_check_filterA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `searchfilter` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_check_filterW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_check_filterW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `searchfilter` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_cleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_cleanup`(`hinstance` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_close_extended_op; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_close_extended_op`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `messagenumber` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compareA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compareA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compareW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compareW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attr` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_ext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_ext`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_extA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_extA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_extW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_extW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attr` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PCWSTR`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_ext_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_ext_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_ext_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_ext_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_ext_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_ext_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attr` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PCWSTR`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `attr` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_compare_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_compare_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `attr` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_conn_from_msg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_conn_from_msg`(`primaryconn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_connect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_connect`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_control_free; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_control_free`(`control` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPControlA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_control_freeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_control_freeA`(`controls` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPControlA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_control_freeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_control_freeW`(`control` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPControlW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_controls_free; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_controls_free`(`controls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_controls_freeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_controls_freeA`(`controls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_controls_freeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_controls_freeW`(`control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_count_entries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_count_entries`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_count_references; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_count_references`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_count_values; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_count_values`(`vals` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_count_valuesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_count_valuesA`(`vals` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_count_valuesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_count_valuesW`(`vals` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_count_values_len; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_count_values_len`(`vals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_page_control; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_page_control`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `pagesize` : UInt, `cookie` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_page_controlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_page_controlA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `pagesize` : UInt, `cookie` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_page_controlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_page_controlW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `pagesize` : UInt, `cookie` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_sort_control; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_sort_control`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyA`>>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_sort_controlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_sort_controlA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyA`>>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_sort_controlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_sort_controlW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyW`>>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_vlv_controlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_vlv_controlA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `vlvinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPVLVInfo`>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_create_vlv_controlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_create_vlv_controlW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `vlvinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPVLVInfo`>?, `iscritical` : UByte, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_deleteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_deleteA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_deleteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_deleteW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_ext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_ext`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_extA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_extA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_extW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_extW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_ext_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_ext_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_ext_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_ext_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_ext_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_ext_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_delete_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_delete_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_dn2ufn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_dn2ufn`(`dn` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_dn2ufnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_dn2ufnA`(`dn` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_dn2ufnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_dn2ufnW`(`dn` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_encode_sort_controlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_encode_sort_controlA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyA`>>?, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPControlA`>?, `criticality` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_encode_sort_controlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_encode_sort_controlW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyW`>>?, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPControlW`>?, `criticality` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_err2string; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_err2string`(`err` : UInt) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_err2stringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_err2stringA`(`err` : UInt) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_err2stringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_err2stringW`(`err` : UInt) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_escape_filter_element; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_escape_filter_element`(`sourcefilterelement` : `windows_sys`.`core`.`PCSTR`, `sourcelength` : UInt, `destfilterelement` : `windows_sys`.`core`.`PSTR`, `destlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_escape_filter_elementA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_escape_filter_elementA`(`sourcefilterelement` : `windows_sys`.`core`.`PCSTR`, `sourcelength` : UInt, `destfilterelement` : `windows_sys`.`core`.`PSTR`, `destlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_escape_filter_elementW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_escape_filter_elementW`(`sourcefilterelement` : `windows_sys`.`core`.`PCSTR`, `sourcelength` : UInt, `destfilterelement` : `windows_sys`.`core`.`PWSTR`, `destlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_explode_dn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_explode_dn`(`dn` : `windows_sys`.`core`.`PCSTR`, `notypes` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_explode_dnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_explode_dnA`(`dn` : `windows_sys`.`core`.`PCSTR`, `notypes` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_explode_dnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_explode_dnW`(`dn` : `windows_sys`.`core`.`PCWSTR`, `notypes` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_extended_operation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_extended_operation`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `oid` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_extended_operationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_extended_operationA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `oid` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_extended_operationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_extended_operationW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `oid` : `windows_sys`.`core`.`PCWSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_extended_operation_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_extended_operation_sA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `oid` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `returnedoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `returneddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_extended_operation_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_extended_operation_sW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `oid` : `windows_sys`.`core`.`PCWSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `returnedoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `returneddata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_first_attribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_first_attribute`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`BerElement`>>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_first_attributeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_first_attributeA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`BerElement`>>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_first_attributeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_first_attributeW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`BerElement`>>?) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_first_entry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_first_entry`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_first_reference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_first_reference`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_free_controls; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_free_controls`(`controls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_free_controlsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_free_controlsA`(`controls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_free_controlsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_free_controlsW`(`controls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_dn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_dn`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_dnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_dnA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_dnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_dnW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_next_page; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_next_page`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `searchhandle` : `PLDAPSearch`, `pagesize` : UInt, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_next_page_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_next_page_s`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `searchhandle` : `PLDAPSearch`, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `pagesize` : UInt, `totalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `results` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_option; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_option`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `option` : Int, `outvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_optionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_optionW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `option` : Int, `outvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_paged_count; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_paged_count`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `searchblock` : `PLDAPSearch`, `totalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `results` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_values; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_values`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `attr` : `windows_sys`.`core`.`PCSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_valuesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_valuesA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `attr` : `windows_sys`.`core`.`PCSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_valuesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_valuesW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `attr` : `windows_sys`.`core`.`PCWSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_values_len; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_values_len`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `attr` : `windows_sys`.`core`.`PCSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_values_lenA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_values_lenA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `attr` : `windows_sys`.`core`.`PCSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_get_values_lenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_get_values_lenW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `message` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `attr` : `windows_sys`.`core`.`PCWSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_init; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_init`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_initA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_initA`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_initW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_initW`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_memfree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_memfree`(`block` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_memfreeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_memfreeA`(`block` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_memfreeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_memfreeW`(`block` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modifyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modifyA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modifyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modifyW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_ext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_ext`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_extA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_extA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_extW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_extW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_ext_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_ext_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_ext_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_ext_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_ext_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_ext_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modify_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modify_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `mods` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPModW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn2`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn2A`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn2W`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCWSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCWSTR`, `deleteoldrdn` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn2_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn2_s`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn2_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn2_sA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn2_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn2_sW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCWSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCWSTR`, `deleteoldrdn` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdnA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdnW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCWSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn_s`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn_sA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_modrdn_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_modrdn_sW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCWSTR`, `newdistinguishedname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_msgfree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_msgfree`(`res` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_next_attribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_next_attribute`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_next_attributeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_next_attributeA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_next_attributeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_next_attributeW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BerElement`>?) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_next_entry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_next_entry`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_next_reference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_next_reference`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `entry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_open; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_open`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_openA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_openA`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_openW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_openW`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `portnumber` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_extended_resultA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_extended_resultA`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `resultoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `resultdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?, `freeit` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_extended_resultW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_extended_resultW`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `resultoid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `resultdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?, `freeit` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_page_control; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_page_control`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `totalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cookie` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_page_controlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_page_controlA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `totalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cookie` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_page_controlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_page_controlW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `totalcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cookie` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_reference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_reference`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `referrals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_referenceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_referenceA`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `referrals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_referenceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_referenceW`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `referrals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_result; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_result`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `returncode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `matcheddns` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `errormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `referrals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PSTR`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>>?, `freeit` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_resultA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_resultA`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `returncode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `matcheddns` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `errormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `referrals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>>?, `freeit` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_resultW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_resultW`(`connection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `resultmessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `returncode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `matcheddns` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errormessage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `referrals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>>?, `freeit` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_sort_control; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_sort_control`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `attribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_sort_controlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_sort_controlA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `attribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_sort_controlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_sort_controlW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `attribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_vlv_controlA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_vlv_controlA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `targetpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `listcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?, `errcode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_parse_vlv_controlW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_parse_vlv_controlW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `control` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `targetpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `listcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?, `errcode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_perror; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_perror`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `msg` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_rename_ext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_rename_ext`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `newrdn` : `windows_sys`.`core`.`PCSTR`, `newparent` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_rename_extA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_rename_extA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `newrdn` : `windows_sys`.`core`.`PCSTR`, `newparent` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_rename_extW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_rename_extW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `newrdn` : `windows_sys`.`core`.`PCWSTR`, `newparent` : `windows_sys`.`core`.`PCWSTR`, `deleteoldrdn` : Int, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_rename_ext_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_rename_ext_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `newrdn` : `windows_sys`.`core`.`PCSTR`, `newparent` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_rename_ext_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_rename_ext_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `newrdn` : `windows_sys`.`core`.`PCSTR`, `newparent` : `windows_sys`.`core`.`PCSTR`, `deleteoldrdn` : Int, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_rename_ext_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_rename_ext_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `newrdn` : `windows_sys`.`core`.`PCWSTR`, `newparent` : `windows_sys`.`core`.`PCWSTR`, `deleteoldrdn` : Int, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_result; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_result`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `msgid` : UInt, `all` : UInt, `timeout` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_result2error; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_result2error`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?, `freeit` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_sasl_bindA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_sasl_bindA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distname` : `windows_sys`.`core`.`PCSTR`, `authmechanism` : `windows_sys`.`core`.`PCSTR`, `cred` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `serverctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_sasl_bindW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_sasl_bindW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distname` : `windows_sys`.`core`.`PCWSTR`, `authmechanism` : `windows_sys`.`core`.`PCWSTR`, `cred` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `serverctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_sasl_bind_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_sasl_bind_sA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distname` : `windows_sys`.`core`.`PCSTR`, `authmechanism` : `windows_sys`.`core`.`PCSTR`, `cred` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `serverctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `serverdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_sasl_bind_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_sasl_bind_sW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distname` : `windows_sys`.`core`.`PCWSTR`, `authmechanism` : `windows_sys`.`core`.`PCWSTR`, `cred` : /* Rust *const */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?, `serverctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientctrls` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `serverdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_searchA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_searchA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_searchW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_searchW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCWSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `attrsonly` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_abandon_page; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_abandon_page`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `searchblock` : `PLDAPSearch`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_ext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_ext`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `servercontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `timelimit` : UInt, `sizelimit` : UInt, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_extA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_extA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `servercontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `timelimit` : UInt, `sizelimit` : UInt, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_extW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_extW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCWSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `attrsonly` : UInt, `servercontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `timelimit` : UInt, `sizelimit` : UInt, `messagenumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_ext_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_ext_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `servercontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `sizelimit` : UInt, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_ext_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_ext_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `servercontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `sizelimit` : UInt, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_ext_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_ext_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCWSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `attrsonly` : UInt, `servercontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `sizelimit` : UInt, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_init_page; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_init_page`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `scopeofsearch` : UInt, `searchfilter` : `windows_sys`.`core`.`PCSTR`, `attributelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attributesonly` : UInt, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `pagetimelimit` : UInt, `totalsizelimit` : UInt, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyA`>>?) : `PLDAPSearch`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_init_pageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_init_pageA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCSTR`, `scopeofsearch` : UInt, `searchfilter` : `windows_sys`.`core`.`PCSTR`, `attributelist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attributesonly` : UInt, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `pagetimelimit` : UInt, `totalsizelimit` : UInt, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyA`>>?) : `PLDAPSearch`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_init_pageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_init_pageW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `distinguishedname` : `windows_sys`.`core`.`PCWSTR`, `scopeofsearch` : UInt, `searchfilter` : `windows_sys`.`core`.`PCWSTR`, `attributelist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `attributesonly` : UInt, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `pagetimelimit` : UInt, `totalsizelimit` : UInt, `sortkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPSortKeyW`>>?) : `PLDAPSearch`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCWSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `attrsonly` : UInt, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_st; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_st`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_stA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_stA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?, `attrsonly` : UInt, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_search_stW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_search_stW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `base` : `windows_sys`.`core`.`PCWSTR`, `scope` : UInt, `filter` : `windows_sys`.`core`.`PCWSTR`, `attrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `attrsonly` : UInt, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_TIMEVAL`>?, `res` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_set_dbg_flags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_set_dbg_flags`(`newflags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_set_dbg_routine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_set_dbg_routine`(`debugprintroutine` : `DBGPRINT`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_set_option; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_set_option`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `option` : Int, `invalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_set_optionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_set_optionW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `option` : Int, `invalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_simple_bind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_simple_bind`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `passwd` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_simple_bindA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_simple_bindA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `passwd` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_simple_bindW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_simple_bindW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `passwd` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_simple_bind_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_simple_bind_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `passwd` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_simple_bind_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_simple_bind_sA`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCSTR`, `passwd` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_simple_bind_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_simple_bind_sW`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `dn` : `windows_sys`.`core`.`PCWSTR`, `passwd` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_sslinit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_sslinit`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt, `secure` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_sslinitA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_sslinitA`(`hostname` : `windows_sys`.`core`.`PCSTR`, `portnumber` : UInt, `secure` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_sslinitW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_sslinitW`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `portnumber` : UInt, `secure` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_start_tls_sA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_start_tls_sA`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `serverreturnvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_start_tls_sW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_start_tls_sW`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `serverreturnvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPMessage`>>?, `servercontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?, `clientcontrols` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAPControlW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_startup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_startup`(`version` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_VERSION_INFO`>?, `instance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_stop_tls_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_stop_tls_s`(`externalhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_ufn2dn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_ufn2dn`(`ufn` : `windows_sys`.`core`.`PCSTR`, `pdn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_ufn2dnA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_ufn2dnA`(`ufn` : `windows_sys`.`core`.`PCSTR`, `pdn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_ufn2dnW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_ufn2dnW`(`ufn` : `windows_sys`.`core`.`PCWSTR`, `pdn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_unbind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_unbind`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_unbind_s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_unbind_s`(`ld` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_value_free; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_value_free`(`vals` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_value_freeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_value_freeA`(`vals` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_value_freeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_value_freeW`(`vals` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldap32.dll, ABI=C, export=ldap_value_free_len; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ldap_value_free_len`(`vals` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP_BERVAL`>>?) : UInt
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BerElement` (
    public var `opaque`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 249:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BerElement {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DBGPRINT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DEREFERENCECONNECTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?) -> UInt>>>;
public const val `LAPI_MAJOR_VER1`: UInt = 1u;
public const val `LAPI_MINOR_VER1`: UInt = 1u;
public const val `LBER_DEFAULT`: Int = -1;
public const val `LBER_ERROR`: Int = -1;
public const val `LBER_TRANSLATE_STRINGS`: UInt = 4u;
public const val `LBER_USE_DER`: UInt = 1u;
public const val `LBER_USE_INDEFINITE_LEN`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 25 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAP` (
    public var `ld_sb`: `LDAP_0`,
    public var `ld_host`: `windows_sys`.`core`.`PSTR`,
    public var `ld_version`: UInt,
    public var `ld_lberoptions`: UByte,
    public var `ld_deref`: UInt,
    public var `ld_timelimit`: UInt,
    public var `ld_sizelimit`: UInt,
    public var `ld_errno`: UInt,
    public var `ld_matched`: `windows_sys`.`core`.`PSTR`,
    public var `ld_error`: `windows_sys`.`core`.`PSTR`,
    public var `ld_msgid`: UInt,
    public var `Reserved3`: UByteArray,
    public var `ld_cldaptries`: UInt,
    public var `ld_cldaptimeout`: UInt,
    public var `ld_refhoplimit`: UInt,
    public var `ld_options`: UInt,
)
// UNSUPPORTED Rust 283:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 41 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 24 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAP_0` (
    public var `sb_sd`: ULong,
    public var `Reserved1`: UByteArray,
    public var `sb_naddr`: ULong,
    public var `Reserved2`: UByteArray,
)
// UNSUPPORTED Rust 296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPAPIFeatureInfoA` (
    public var `ldapaif_info_version`: Int,
    public var `ldapaif_name`: `windows_sys`.`core`.`PSTR`,
    public var `ldapaif_version`: Int,
)
// UNSUPPORTED Rust 308:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPAPIFeatureInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPAPIFeatureInfoW` (
    public var `ldapaif_info_version`: Int,
    public var `ldapaif_name`: `windows_sys`.`core`.`PWSTR`,
    public var `ldapaif_version`: Int,
)
// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPAPIFeatureInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPAPIInfoA` (
    public var `ldapai_info_version`: Int,
    public var `ldapai_api_version`: Int,
    public var `ldapai_protocol_version`: Int,
    public var `ldapai_extensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?,
    public var `ldapai_vendor_name`: `windows_sys`.`core`.`PSTR`,
    public var `ldapai_vendor_version`: Int,
)
// UNSUPPORTED Rust 335:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPAPIInfoA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPAPIInfoW` (
    public var `ldapai_info_version`: Int,
    public var `ldapai_api_version`: Int,
    public var `ldapai_protocol_version`: Int,
    public var `ldapai_extensions`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `ldapai_vendor_name`: `windows_sys`.`core`.`PWSTR`,
    public var `ldapai_vendor_version`: Int,
)
// UNSUPPORTED Rust 350:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPAPIInfoW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPControlA` (
    public var `ldctl_oid`: `windows_sys`.`core`.`PSTR`,
    public var `ldctl_value`: `LDAP_BERVAL`,
    public var `ldctl_iscritical`: Boolean,
)
// UNSUPPORTED Rust 362:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPControlA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPControlW` (
    public var `ldctl_oid`: `windows_sys`.`core`.`PWSTR`,
    public var `ldctl_value`: `LDAP_BERVAL`,
    public var `ldctl_iscritical`: Boolean,
)
// UNSUPPORTED Rust 374:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPControlW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPMessage` (
    public var `lm_msgid`: UInt,
    public var `lm_msgtype`: UInt,
    public var `lm_ber`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lm_chain`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?,
    public var `lm_next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAPMessage`>?,
    public var `lm_time`: UInt,
    public var `Connection`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?,
    public var `Request`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lm_returncode`: UInt,
    public var `lm_referral`: UShort,
    public var `lm_chased`: Boolean,
    public var `lm_eom`: Boolean,
    public var `ConnectionReferenced`: Boolean,
)
// UNSUPPORTED Rust 396:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPMessage {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPModA` (
    public var `mod_op`: UInt,
    public var `mod_type`: `windows_sys`.`core`.`PSTR`,
    public var `mod_vals`: `LDAPModA_0`,
)
// UNSUPPORTED Rust 408:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPModA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 413:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LDAPModA_0 {
//     pub modv_strvals: *mut windows_sys::core::PSTR,
//     pub modv_bvals: *mut *mut LDAP_BERVAL,
// }

// UNSUPPORTED Rust 419:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPModA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPModW` (
    public var `mod_op`: UInt,
    public var `mod_type`: `windows_sys`.`core`.`PWSTR`,
    public var `mod_vals`: `LDAPModW_0`,
)
// UNSUPPORTED Rust 431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPModW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 436:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LDAPModW_0 {
//     pub modv_strvals: *mut windows_sys::core::PWSTR,
//     pub modv_bvals: *mut *mut LDAP_BERVAL,
// }

// UNSUPPORTED Rust 442:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPModW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPSortKeyA` (
    public var `sk_attrtype`: `windows_sys`.`core`.`PSTR`,
    public var `sk_matchruleoid`: `windows_sys`.`core`.`PSTR`,
    public var `sk_reverseorder`: Boolean,
)
// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPSortKeyA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPSortKeyW` (
    public var `sk_attrtype`: `windows_sys`.`core`.`PWSTR`,
    public var `sk_matchruleoid`: `windows_sys`.`core`.`PWSTR`,
    public var `sk_reverseorder`: Boolean,
)
// UNSUPPORTED Rust 466:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAPSortKeyW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAPVLVInfo` (
    public var `ldvlv_version`: Int,
    public var `ldvlv_before_count`: UInt,
    public var `ldvlv_after_count`: UInt,
    public var `ldvlv_offset`: UInt,
    public var `ldvlv_count`: UInt,
    public var `ldvlv_attrvalue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?,
    public var `ldvlv_context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP_BERVAL`>?,
    public var `ldvlv_extradata`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 483:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDAP_BERVAL` (
    public var `bv_len`: UInt,
    public var `bv_val`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDAP_BERVAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LDAP_BIND_CMD`: Int = 96;
public const val `LDAP_BUSY`: `LDAP_RETCODE` = 51;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_ADAM_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1851");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_ADAM_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1851");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_LDAP_INTEG_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1791");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_LDAP_INTEG_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1791");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.800");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.800");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_PARTIAL_SECRETS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1920");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_PARTIAL_SECRETS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1920");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V51_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1670");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V51_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1670");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V60_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1935");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V60_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1935");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V61_OID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1935");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V61_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1935");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V61_R2_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2080");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_V61_R2_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2080");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_W8_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2237");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CAP_ACTIVE_DIRECTORY_W8_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2237");
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
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CONTROL_REFERRALS`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.616");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CONTROL_REFERRALS_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.616");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CONTROL_VLVREQUEST`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("2.16.840.1.113730.3.4.9");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CONTROL_VLVREQUEST_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("2.16.840.1.113730.3.4.9");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CONTROL_VLVRESPONSE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("2.16.840.1.113730.3.4.10");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_CONTROL_VLVRESPONSE_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("2.16.840.1.113730.3.4.10");
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
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_BIT_AND`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.803");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_BIT_AND_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.803");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_BIT_OR`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.804");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_BIT_OR_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.804");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_DN_BINARY_COMPLEX`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2253");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_DN_BINARY_COMPLEX_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2253");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_TRANSITIVE_EVALUATION`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1941");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_MATCHING_RULE_TRANSITIVE_EVALUATION_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1941");
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
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_ABANDON_REPL`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("abandonReplication");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_ABANDON_REPL_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("abandonReplication");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_DOM_MASTER`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("becomeDomainMaster");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_DOM_MASTER_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("becomeDomainMaster");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_PDC`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("becomePdc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_PDC_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("becomePdc");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_RID_MASTER`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("becomeRidMaster");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_RID_MASTER_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("becomeRidMaster");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_SCHEMA_MASTER`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("becomeSchemaMaster");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_BECOME_SCHEMA_MASTER_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("becomeSchemaMaster");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_CONFIG_NAMING_CONTEXT`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("configurationNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_CONFIG_NAMING_CONTEXT_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("configurationNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_CURRENT_TIME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("currentTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_CURRENT_TIME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("currentTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DEFAULT_NAMING_CONTEXT`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("defaultNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DEFAULT_NAMING_CONTEXT_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("defaultNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DNS_HOST_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("dnsHostName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DNS_HOST_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("dnsHostName");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DO_GARBAGE_COLLECTION`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("doGarbageCollection");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DO_GARBAGE_COLLECTION_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("doGarbageCollection");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DS_SERVICE_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("dsServiceName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_DS_SERVICE_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("dsServiceName");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_FIXUP_INHERITANCE`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("fixupInheritance");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_FIXUP_INHERITANCE_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("fixupInheritance");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_HIGHEST_COMMITTED_USN`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("highestCommitedUSN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_HIGHEST_COMMITTED_USN_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("highestCommitedUSN");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_INVALIDATE_RID_POOL`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("invalidateRidPool");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_INVALIDATE_RID_POOL_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("invalidateRidPool");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_LDAP_SERVICE_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ldapServiceName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_LDAP_SERVICE_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ldapServiceName");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_NAMING_CONTEXTS`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("namingContexts");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_NAMING_CONTEXTS_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("namingContexts");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_RECALC_HIERARCHY`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("recalcHierarchy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_RECALC_HIERARCHY_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("recalcHierarchy");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_ROOT_DOMAIN_NAMING_CONTEXT`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("rootDomainNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_ROOT_DOMAIN_NAMING_CONTEXT_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("rootDomainNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SCHEMA_NAMING_CONTEXT`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("schemaNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SCHEMA_NAMING_CONTEXT_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("schemaNamingContext");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SCHEMA_UPDATE_NOW`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("schemaUpdateNow");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SCHEMA_UPDATE_NOW_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("schemaUpdateNow");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SERVER_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("serverName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SERVER_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("serverName");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUBSCHEMA_SUBENTRY`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("subschemaSubentry");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUBSCHEMA_SUBENTRY_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("subschemaSubentry");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_CAPABILITIES`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("supportedCapabilities");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_CAPABILITIES_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("supportedCapabilities");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_CONTROL`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("supportedControl");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_CONTROL_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("supportedControl");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_LDAP_POLICIES`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("supportedLDAPPolicies");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_LDAP_POLICIES_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("supportedLDAPPolicies");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_LDAP_VERSION`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("supportedLDAPVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_LDAP_VERSION_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("supportedLDAPVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_SASL_MECHANISM`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("supportedSASLMechanisms");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_OPATT_SUPPORTED_SASL_MECHANISM_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("supportedSASLMechanisms");
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
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_PAGED_RESULT_OID_STRING`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.319");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_PAGED_RESULT_OID_STRING_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.319");
public const val `LDAP_PARAM_ERROR`: `LDAP_RETCODE` = 89;
public const val `LDAP_PARTIAL_RESULTS`: `LDAP_RETCODE` = 9;
public const val `LDAP_POLICYHINT_APPLY_FULLPWDPOLICY`: UInt = 1u;
public const val `LDAP_PORT`: UInt = 389u;
public const val `LDAP_PROTOCOL_ERROR`: `LDAP_RETCODE` = 2;
public const val `LDAP_REFERRAL`: `LDAP_RETCODE` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LDAP_REFERRAL_CALLBACK` (
    public var `SizeOfCallbacks`: UInt,
    public var `QueryForConnection`: `QUERYFORCONNECTION`,
    public var `NotifyRoutine`: `NOTIFYOFNEWCONNECTION`,
    public var `DereferenceRoutine`: `DEREFERENCECONNECTION`,
)
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
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SEARCH_HINT_INDEX_ONLY_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2207");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SEARCH_HINT_INDEX_ONLY_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2207");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SEARCH_HINT_REQUIRED_INDEX_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2306");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SEARCH_HINT_REQUIRED_INDEX_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2306");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SEARCH_HINT_SOFT_SIZE_LIMIT_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2210");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SEARCH_HINT_SOFT_SIZE_LIMIT_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2210");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_ASQ_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1504");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_ASQ_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1504");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_BATCH_REQUEST_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2212");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_BATCH_REQUEST_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2212");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_BYPASS_QUOTA_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2256");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_BYPASS_QUOTA_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2256");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_CROSSDOM_MOVE_TARGET_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.521");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_CROSSDOM_MOVE_TARGET_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.521");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DIRSYNC_EX_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2090");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DIRSYNC_EX_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2090");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DIRSYNC_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.841");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DIRSYNC_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.841");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DN_INPUT_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2026");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DN_INPUT_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2026");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DOMAIN_SCOPE_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1339");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_DOMAIN_SCOPE_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1339");
public const val `LDAP_SERVER_DOWN`: `LDAP_RETCODE` = 81;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_EXPECTED_ENTRY_COUNT_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2211");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_EXPECTED_ENTRY_COUNT_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2211");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_EXTENDED_DN_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.529");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_EXTENDED_DN_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.529");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_FAST_BIND_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1781");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_FAST_BIND_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1781");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_FORCE_UPDATE_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1974");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_FORCE_UPDATE_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1974");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_GET_STATS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.970");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_GET_STATS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.970");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_LAZY_COMMIT_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.619");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_LAZY_COMMIT_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.619");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_LINK_TTL_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2309");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_LINK_TTL_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2309");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_NOTIFICATION_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.528");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_NOTIFICATION_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.528");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_PERMISSIVE_MODIFY_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1413");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_PERMISSIVE_MODIFY_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1413");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_POLICY_HINTS_DEPRECATED_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2066");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_POLICY_HINTS_DEPRECATED_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2066");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_POLICY_HINTS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2239");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_POLICY_HINTS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2239");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_QUOTA_CONTROL_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1852");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_QUOTA_CONTROL_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1852");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_RANGE_OPTION_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.802");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_RANGE_OPTION_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.802");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_RANGE_RETRIEVAL_NOERR_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1948");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_RANGE_RETRIEVAL_NOERR_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1948");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_RESP_SORT_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.474");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_RESP_SORT_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.474");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SD_FLAGS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.801");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SD_FLAGS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.801");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SEARCH_HINTS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2206");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SEARCH_HINTS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2206");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SEARCH_OPTIONS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1340");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SEARCH_OPTIONS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1340");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SET_OWNER_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2255");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SET_OWNER_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2255");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHOW_DEACTIVATED_LINK_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2065");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHOW_DEACTIVATED_LINK_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2065");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHOW_DELETED_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.417");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHOW_DELETED_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.417");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHOW_RECYCLED_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2064");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHOW_RECYCLED_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2064");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHUTDOWN_NOTIFY_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1907");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SHUTDOWN_NOTIFY_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1907");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SORT_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.473");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_SORT_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.473");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_TREE_DELETE_EX_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2204");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_TREE_DELETE_EX_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2204");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_TREE_DELETE_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.805");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_TREE_DELETE_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.805");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_UPDATE_STATS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2205");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_UPDATE_STATS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2205");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_VERIFY_NAME_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.1338");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_VERIFY_NAME_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.1338");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_WHO_AM_I_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.3.6.1.4.1.4203.1.11.3");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_SERVER_WHO_AM_I_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.3.6.1.4.1.4203.1.11.3");
public const val `LDAP_SESSION_CMD`: Int = 113;
public const val `LDAP_SIZELIMIT_EXCEEDED`: `LDAP_RETCODE` = 4;
public const val `LDAP_SORT_CONTROL_MISSING`: `LDAP_RETCODE` = 60;
public const val `LDAP_SSL_GC_PORT`: UInt = 3269u;
public const val `LDAP_SSL_PORT`: UInt = 636u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_START_TLS_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.3.6.1.4.1.1466.20037");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_START_TLS_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.3.6.1.4.1.1466.20037");
public const val `LDAP_STRONG_AUTH_REQUIRED`: `LDAP_RETCODE` = 8;
public const val `LDAP_SUBSTRING_ANY`: Int = 129;
public const val `LDAP_SUBSTRING_FINAL`: Int = 130;
public const val `LDAP_SUBSTRING_INITIAL`: Int = 128;
public const val `LDAP_SUCCESS`: `LDAP_RETCODE` = 0;
public const val `LDAP_TIMELIMIT_EXCEEDED`: `LDAP_RETCODE` = 3;
public const val `LDAP_TIMEOUT`: `LDAP_RETCODE` = 85;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LDAP_TIMEVAL` (
    public var `tv_sec`: Int,
    public var `tv_usec`: Int,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_TTL_EXTENDED_OP_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.3.6.1.4.1.1466.101.119.1");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_TTL_EXTENDED_OP_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.3.6.1.4.1.1466.101.119.1");
public const val `LDAP_UNAVAILABLE`: `LDAP_RETCODE` = 52;
public const val `LDAP_UNAVAILABLE_CRIT_EXTENSION`: `LDAP_RETCODE` = 12;
public const val `LDAP_UNBIND_CMD`: Int = 66;
public const val `LDAP_UNDEFINED_TYPE`: `LDAP_RETCODE` = 17;
public const val `LDAP_UNICODE`: UInt = 1u;
public const val `LDAP_UNWILLING_TO_PERFORM`: `LDAP_RETCODE` = 53;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_UPDATE_STATS_INVOCATIONID_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2209");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_UPDATE_STATS_INVOCATIONID_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2209");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_UPDATE_STATS_USN_OID`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("1.2.840.113556.1.4.2208");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_UPDATE_STATS_USN_OID_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("1.2.840.113556.1.4.2208");
public const val `LDAP_USER_CANCELLED`: `LDAP_RETCODE` = 88;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_VENDOR_NAME`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Microsoft Corporation.");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LDAP_VENDOR_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft Corporation.");
public const val `LDAP_VENDOR_VERSION`: UInt = 510u;
public const val `LDAP_VERSION`: UInt = 2u;
public const val `LDAP_VERSION1`: UInt = 1u;
public const val `LDAP_VERSION2`: UInt = 2u;
public const val `LDAP_VERSION3`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LDAP_VERSION_INFO` (
    public var `lv_size`: UInt,
    public var `lv_major`: UInt,
    public var `lv_minor`: UInt,
)
public const val `LDAP_VERSION_MAX`: UInt = 3u;
public const val `LDAP_VERSION_MIN`: UInt = 2u;
public const val `LDAP_VIRTUAL_LIST_VIEW_ERROR`: `LDAP_RETCODE` = 76;
public const val `LDAP_VLVINFO_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NOTIFYOFNEWCONNECTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Boolean>>>;
public typealias `PLDAPSearch` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
public typealias `QUERYCLIENTCERT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`Authentication`.`Identity`.`SecPkgContext_IssuerListInfoEx`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `QUERYFORCONNECTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LDAP`>>?) -> UInt>>>;
public const val `SERVER_SEARCH_FLAG_DOMAIN_SCOPE`: UInt = 1u;
public const val `SERVER_SEARCH_FLAG_PHANTOM_ROOT`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public typealias `VERIFYSERVERCERT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`LDAP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`>>?) -> Boolean>>>;
