// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORCloseHive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORCloseHive`(`handle` : `ORHKEY`) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORCloseKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORCloseKey`(`keyhandle` : `ORHKEY`) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORCreateHive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORCreateHive`(`horkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ORHKEY`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORCreateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `ORCreateKey`(`keyhandle` : `ORHKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpclass` : `windows_sys`.`core`.`PCWSTR`, `dwoptions` : UInt, `psecuritydescriptor` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ORHKEY`>?, `pdwdisposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORDeleteKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORDeleteKey`(`handle` : `ORHKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORDeleteValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORDeleteValue`(`handle` : `ORHKEY`, `lpvaluename` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=OREnumKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OREnumKey`(`handle` : `ORHKEY`, `dwindex` : UInt, `lpname` : `windows_sys`.`core`.`PWSTR`, `lpcname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpclass` : `windows_sys`.`core`.`PWSTR`, `lpcclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpftlastwritetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`FILETIME`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=OREnumValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OREnumValue`(`handle` : `ORHKEY`, `dwindex` : UInt, `lpvaluename` : `windows_sys`.`core`.`PWSTR`, `lpcvaluename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORGetKeySecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `ORGetKeySecurity`(`handle` : `ORHKEY`, `securityinformation` : UInt, `psecuritydescriptor` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORGetValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORGetValue`(`handle` : `ORHKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpvalue` : `windows_sys`.`core`.`PCWSTR`, `pdwtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORGetVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORGetVersion`(`pdwmajorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwminorversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORGetVirtualFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORGetVirtualFlags`(`handle` : `ORHKEY`, `pdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORMergeHives; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORMergeHives`(`hivehandles` : /* Rust *const */ kotlinx.cinterop.CPointer<`ORHKEY`>?, `hivecount` : UInt, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ORHKEY`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=OROpenHive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OROpenHive`(`filepath` : `windows_sys`.`core`.`PCWSTR`, `horkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ORHKEY`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=OROpenHiveByHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OROpenHiveByHandle`(`filehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `horkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ORHKEY`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=OROpenKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OROpenKey`(`handle` : `ORHKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ORHKEY`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORQueryInfoKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORQueryInfoKey`(`handle` : `ORHKEY`, `lpclass` : `windows_sys`.`core`.`PWSTR`, `lpcclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcsubkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcmaxsubkeylen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcmaxclasslen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcmaxvaluenamelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcmaxvaluelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpftlastwritetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`FILETIME`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORRenameKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORRenameKey`(`handle` : `ORHKEY`, `lpnewname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORSaveHive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORSaveHive`(`horkey` : `ORHKEY`, `hivepath` : `windows_sys`.`core`.`PCWSTR`, `osmajorversion` : UInt, `osminorversion` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORSetKeySecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `ORSetKeySecurity`(`handle` : `ORHKEY`, `securityinformation` : UInt, `psecuritydescriptor` : `super`.`super`.`super`.`Win32`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORSetValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORSetValue`(`handle` : `ORHKEY`, `lpvaluename` : `windows_sys`.`core`.`PCWSTR`, `dwtype` : UInt, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORSetVirtualFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORSetVirtualFlags`(`handle` : `ORHKEY`, `dwflags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORShutdown`() : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=offreg.dll, ABI=system, export=ORStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ORStart`() : `super`.`super`.`super`.`Win32`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ORHKEY` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
