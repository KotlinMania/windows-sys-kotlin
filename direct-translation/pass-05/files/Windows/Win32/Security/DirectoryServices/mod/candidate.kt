// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dssec.dll, ABI=system, export=DSCreateSecurityPage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public external fun `DSCreateSecurityPage`(`pwszobjectpath` : `windows_sys`.`core`.`PCWSTR`, `pwszobjectclass` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `phpage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`HPROPSHEETPAGE`>?, `pfnreadsd` : `PFNREADOBJECTSECURITY`, `pfnwritesd` : `PFNWRITEOBJECTSECURITY`, `lpcontext` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dssec.dll, ABI=system, export=DSEditSecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSEditSecurity`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `pwszobjectpath` : `windows_sys`.`core`.`PCWSTR`, `pwszobjectclass` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `pwszcaption` : `windows_sys`.`core`.`PCWSTR`, `pfnreadsd` : `PFNREADOBJECTSECURITY`, `pfnwritesd` : `PFNWRITEOBJECTSECURITY`, `lpcontext` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`HRESULT`
public const val `DSSI_IS_ROOT`: UInt = 16u;
public const val `DSSI_NO_ACCESS_CHECK`: UInt = 2u;
public const val `DSSI_NO_EDIT_OWNER`: UInt = 8u;
public const val `DSSI_NO_EDIT_SACL`: UInt = 4u;
public const val `DSSI_NO_FILTER`: UInt = 32u;
public const val `DSSI_NO_READONLY_MESSAGE`: UInt = 64u;
public const val `DSSI_READ_ONLY`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public typealias `PFNDSCREATESECPAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`HPROPSHEETPAGE`>?, `PFNREADOBJECTSECURITY`, `PFNWRITEOBJECTSECURITY`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDSEDITSECURITY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, `windows_sys`.`core`.`PCWSTR`, `PFNREADOBJECTSECURITY`, `PFNWRITEOBJECTSECURITY`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNREADOBJECTSECURITY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`PSECURITY_DESCRIPTOR`>?, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNWRITEOBJECTSECURITY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, `super`.`PSECURITY_DESCRIPTOR`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`HRESULT`>>>;
