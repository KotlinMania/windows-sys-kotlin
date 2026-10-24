// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtMapViewOfSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtMapViewOfSection`(`sectionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `zerobits` : ULong, `commitsize` : ULong, `sectionoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `viewsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `inheritdisposition` : `SECTION_INHERIT`, `allocationtype` : UInt, `win32protect` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenSection`(`sectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtUnmapViewOfSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtUnmapViewOfSection`(`processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwMapViewOfSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwMapViewOfSection`(`sectionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `zerobits` : ULong, `commitsize` : ULong, `sectionoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `viewsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `inheritdisposition` : `SECTION_INHERIT`, `allocationtype` : UInt, `win32protect` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenSection`(`sectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwUnmapViewOfSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwUnmapViewOfSection`(`processhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
public typealias `SECTION_INHERIT` = Int;
public const val `ViewShare`: `SECTION_INHERIT` = 1;
public const val `ViewUnmap`: `SECTION_INHERIT` = 2;
