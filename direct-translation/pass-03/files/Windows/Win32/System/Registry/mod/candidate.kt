// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-state-helpers-l1-1-0.dll, ABI=system, export=GetRegistryValueWithFallbackW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRegistryValueWithFallbackW`(`hkeyprimary` : `HKEY`, `pwszprimarysubkey` : `windows_sys`.`core`.`PCWSTR`, `hkeyfallback` : `HKEY`, `pwszfallbacksubkey` : `windows_sys`.`core`.`PCWSTR`, `pwszvalue` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `pdwtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdatain` : UInt, `pcbdataout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCloseKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegCloseKey`(`hkey` : `HKEY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegConnectRegistryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegConnectRegistryA`(`lpmachinename` : `windows_sys`.`core`.`PCSTR`, `hkey` : `HKEY`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegConnectRegistryExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegConnectRegistryExA`(`lpmachinename` : `windows_sys`.`core`.`PCSTR`, `hkey` : `HKEY`, `flags` : UInt, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegConnectRegistryExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegConnectRegistryExW`(`lpmachinename` : `windows_sys`.`core`.`PCWSTR`, `hkey` : `HKEY`, `flags` : UInt, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegConnectRegistryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegConnectRegistryW`(`lpmachinename` : `windows_sys`.`core`.`PCWSTR`, `hkey` : `HKEY`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCopyTreeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegCopyTreeA`(`hkeysrc` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `hkeydest` : `HKEY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCopyTreeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegCopyTreeW`(`hkeysrc` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `hkeydest` : `HKEY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCreateKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegCreateKeyA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCreateKeyExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegCreateKeyExA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `reserved` : UInt, `lpclass` : `windows_sys`.`core`.`PCSTR`, `dwoptions` : `REG_OPEN_CREATE_OPTIONS`, `samdesired` : `REG_SAM_FLAGS`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `lpdwdisposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_CREATE_KEY_DISPOSITION`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCreateKeyExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegCreateKeyExW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `reserved` : UInt, `lpclass` : `windows_sys`.`core`.`PCWSTR`, `dwoptions` : `REG_OPEN_CREATE_OPTIONS`, `samdesired` : `REG_SAM_FLAGS`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `lpdwdisposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_CREATE_KEY_DISPOSITION`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCreateKeyTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegCreateKeyTransactedA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `reserved` : UInt, `lpclass` : `windows_sys`.`core`.`PCSTR`, `dwoptions` : `REG_OPEN_CREATE_OPTIONS`, `samdesired` : `REG_SAM_FLAGS`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `lpdwdisposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_CREATE_KEY_DISPOSITION`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pextendedparemeter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCreateKeyTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegCreateKeyTransactedW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `reserved` : UInt, `lpclass` : `windows_sys`.`core`.`PCWSTR`, `dwoptions` : `REG_OPEN_CREATE_OPTIONS`, `samdesired` : `REG_SAM_FLAGS`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `lpdwdisposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_CREATE_KEY_DISPOSITION`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pextendedparemeter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegCreateKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegCreateKeyW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyExA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `samdesired` : UInt, `reserved` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyExW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `samdesired` : UInt, `reserved` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyTransactedA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `samdesired` : UInt, `reserved` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pextendedparameter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyTransactedW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `samdesired` : UInt, `reserved` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pextendedparameter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyValueA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `lpvaluename` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyValueW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpvaluename` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteKeyW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteTreeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteTreeA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteTreeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteTreeW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteValueA`(`hkey` : `HKEY`, `lpvaluename` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDeleteValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDeleteValueW`(`hkey` : `HKEY`, `lpvaluename` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDisablePredefinedCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDisablePredefinedCache`() : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDisablePredefinedCacheEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDisablePredefinedCacheEx`() : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegDisableReflectionKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegDisableReflectionKey`(`hbase` : `HKEY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegEnableReflectionKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegEnableReflectionKey`(`hbase` : `HKEY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegEnumKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegEnumKeyA`(`hkey` : `HKEY`, `dwindex` : UInt, `lpname` : `windows_sys`.`core`.`PSTR`, `cchname` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegEnumKeyExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegEnumKeyExA`(`hkey` : `HKEY`, `dwindex` : UInt, `lpname` : `windows_sys`.`core`.`PSTR`, `lpcchname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpclass` : `windows_sys`.`core`.`PSTR`, `lpcchclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpftlastwritetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegEnumKeyExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegEnumKeyExW`(`hkey` : `HKEY`, `dwindex` : UInt, `lpname` : `windows_sys`.`core`.`PWSTR`, `lpcchname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpclass` : `windows_sys`.`core`.`PWSTR`, `lpcchclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpftlastwritetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegEnumKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegEnumKeyW`(`hkey` : `HKEY`, `dwindex` : UInt, `lpname` : `windows_sys`.`core`.`PWSTR`, `cchname` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegEnumValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegEnumValueA`(`hkey` : `HKEY`, `dwindex` : UInt, `lpvaluename` : `windows_sys`.`core`.`PSTR`, `lpcchvaluename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegEnumValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegEnumValueW`(`hkey` : `HKEY`, `dwindex` : UInt, `lpvaluename` : `windows_sys`.`core`.`PWSTR`, `lpcchvaluename` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegFlushKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegFlushKey`(`hkey` : `HKEY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegGetKeySecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegGetKeySecurity`(`hkey` : `HKEY`, `securityinformation` : `super`.`super`.`Security`.`OBJECT_SECURITY_INFORMATION`, `psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegGetValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegGetValueA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `lpvalue` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `REG_ROUTINE_FLAGS`, `pdwtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_VALUE_TYPE`>?, `pvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegGetValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegGetValueW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpvalue` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `REG_ROUTINE_FLAGS`, `pdwtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_VALUE_TYPE`>?, `pvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegLoadAppKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegLoadAppKeyA`(`lpfile` : `windows_sys`.`core`.`PCSTR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `samdesired` : UInt, `dwoptions` : UInt, `reserved` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegLoadAppKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegLoadAppKeyW`(`lpfile` : `windows_sys`.`core`.`PCWSTR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `samdesired` : UInt, `dwoptions` : UInt, `reserved` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegLoadKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegLoadKeyA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `lpfile` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegLoadKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegLoadKeyW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpfile` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegLoadMUIStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegLoadMUIStringA`(`hkey` : `HKEY`, `pszvalue` : `windows_sys`.`core`.`PCSTR`, `pszoutbuf` : `windows_sys`.`core`.`PSTR`, `cboutbuf` : UInt, `pcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : UInt, `pszdirectory` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegLoadMUIStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegLoadMUIStringW`(`hkey` : `HKEY`, `pszvalue` : `windows_sys`.`core`.`PCWSTR`, `pszoutbuf` : `windows_sys`.`core`.`PWSTR`, `cboutbuf` : UInt, `pcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : UInt, `pszdirectory` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegNotifyChangeKeyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegNotifyChangeKeyValue`(`hkey` : `HKEY`, `bwatchsubtree` : `windows_sys`.`core`.`BOOL`, `dwnotifyfilter` : `REG_NOTIFY_FILTER`, `hevent` : `super`.`super`.`Foundation`.`HANDLE`, `fasynchronous` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenCurrentUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenCurrentUser`(`samdesired` : UInt, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenKeyA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenKeyExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenKeyExA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `uloptions` : UInt, `samdesired` : `REG_SAM_FLAGS`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenKeyExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenKeyExW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `uloptions` : UInt, `samdesired` : `REG_SAM_FLAGS`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenKeyTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenKeyTransactedA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `uloptions` : UInt, `samdesired` : `REG_SAM_FLAGS`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pextendedparemeter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenKeyTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenKeyTransactedW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `uloptions` : UInt, `samdesired` : `REG_SAM_FLAGS`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pextendedparemeter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenKeyW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOpenUserClassesRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOpenUserClassesRoot`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`, `dwoptions` : UInt, `samdesired` : UInt, `phkresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HKEY`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegOverridePredefKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegOverridePredefKey`(`hkey` : `HKEY`, `hnewhkey` : `HKEY`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryInfoKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryInfoKeyA`(`hkey` : `HKEY`, `lpclass` : `windows_sys`.`core`.`PSTR`, `lpcchclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcsubkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxsubkeylen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxclasslen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxvaluenamelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxvaluelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpftlastwritetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryInfoKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryInfoKeyW`(`hkey` : `HKEY`, `lpclass` : `windows_sys`.`core`.`PWSTR`, `lpcchclass` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcsubkeys` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxsubkeylen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxclasslen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxvaluenamelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbmaxvaluelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcbsecuritydescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpftlastwritetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryMultipleValuesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryMultipleValuesA`(`hkey` : `HKEY`, `val_list` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VALENTA`>?, `num_vals` : UInt, `lpvaluebuf` : `windows_sys`.`core`.`PSTR`, `ldwtotsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryMultipleValuesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryMultipleValuesW`(`hkey` : `HKEY`, `val_list` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VALENTW`>?, `num_vals` : UInt, `lpvaluebuf` : `windows_sys`.`core`.`PWSTR`, `ldwtotsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryReflectionKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryReflectionKey`(`hbase` : `HKEY`, `bisreflectiondisabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryValueA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `lpdata` : `windows_sys`.`core`.`PSTR`, `lpcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryValueExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryValueExA`(`hkey` : `HKEY`, `lpvaluename` : `windows_sys`.`core`.`PCSTR`, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_VALUE_TYPE`>?, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryValueExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryValueExW`(`hkey` : `HKEY`, `lpvaluename` : `windows_sys`.`core`.`PCWSTR`, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REG_VALUE_TYPE`>?, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `lpcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegQueryValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegQueryValueW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpdata` : `windows_sys`.`core`.`PWSTR`, `lpcbdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegRenameKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegRenameKey`(`hkey` : `HKEY`, `lpsubkeyname` : `windows_sys`.`core`.`PCWSTR`, `lpnewkeyname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegReplaceKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegReplaceKeyA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `lpnewfile` : `windows_sys`.`core`.`PCSTR`, `lpoldfile` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegReplaceKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegReplaceKeyW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpnewfile` : `windows_sys`.`core`.`PCWSTR`, `lpoldfile` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegRestoreKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegRestoreKeyA`(`hkey` : `HKEY`, `lpfile` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegRestoreKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegRestoreKeyW`(`hkey` : `HKEY`, `lpfile` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSaveKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegSaveKeyA`(`hkey` : `HKEY`, `lpfile` : `windows_sys`.`core`.`PCSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSaveKeyExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegSaveKeyExA`(`hkey` : `HKEY`, `lpfile` : `windows_sys`.`core`.`PCSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `flags` : `REG_SAVE_FORMAT`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSaveKeyExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegSaveKeyExW`(`hkey` : `HKEY`, `lpfile` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `flags` : `REG_SAVE_FORMAT`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSaveKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegSaveKeyW`(`hkey` : `HKEY`, `lpfile` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSetKeySecurity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RegSetKeySecurity`(`hkey` : `HKEY`, `securityinformation` : `super`.`super`.`Security`.`OBJECT_SECURITY_INFORMATION`, `psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSetKeyValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegSetKeyValueA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `lpvaluename` : `windows_sys`.`core`.`PCSTR`, `dwtype` : UInt, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSetKeyValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegSetKeyValueW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `lpvaluename` : `windows_sys`.`core`.`PCWSTR`, `dwtype` : UInt, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSetValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegSetValueA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`, `dwtype` : `REG_VALUE_TYPE`, `lpdata` : `windows_sys`.`core`.`PCSTR`, `cbdata` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSetValueExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegSetValueExA`(`hkey` : `HKEY`, `lpvaluename` : `windows_sys`.`core`.`PCSTR`, `reserved` : UInt, `dwtype` : `REG_VALUE_TYPE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSetValueExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegSetValueExW`(`hkey` : `HKEY`, `lpvaluename` : `windows_sys`.`core`.`PCWSTR`, `reserved` : UInt, `dwtype` : `REG_VALUE_TYPE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbdata` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegSetValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegSetValueW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`, `dwtype` : `REG_VALUE_TYPE`, `lpdata` : `windows_sys`.`core`.`PCWSTR`, `cbdata` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegUnLoadKeyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegUnLoadKeyA`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegUnLoadKeyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegUnLoadKeyW`(`hkey` : `HKEY`, `lpsubkey` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
public const val `AGP_FLAG_NO_1X_RATE`: Int = 1;
public const val `AGP_FLAG_NO_2X_RATE`: Int = 2;
public const val `AGP_FLAG_NO_4X_RATE`: Int = 4;
public const val `AGP_FLAG_NO_8X_RATE`: Int = 8;
public const val `AGP_FLAG_NO_FW_ENABLE`: Int = 512;
public const val `AGP_FLAG_NO_SBA_ENABLE`: Int = 256;
public const val `AGP_FLAG_REVERSE_INITIALIZATION`: Int = 128;
public const val `AGP_FLAG_SPECIAL_RESERVE`: Int = 1015808;
public const val `AGP_FLAG_SPECIAL_TARGET`: Int = 1048575;
public const val `APMMENUSUSPEND_DISABLED`: UInt = 0u;
public const val `APMMENUSUSPEND_ENABLED`: UInt = 1u;
public const val `APMMENUSUSPEND_NOCHANGE`: UInt = 128u;
public const val `APMMENUSUSPEND_UNDOCKED`: UInt = 2u;
public const val `APMTIMEOUT_DISABLED`: UInt = 0u;
public const val `BIF_RAWDEVICENEEDSDRIVER`: UInt = 2u;
public const val `BIF_SHOWSIMILARDRIVERS`: UInt = 1u;
public const val `CSCONFIGFLAG_BITS`: UInt = 7u;
public const val `CSCONFIGFLAG_DISABLED`: UInt = 1u;
public const val `CSCONFIGFLAG_DO_NOT_CREATE`: UInt = 2u;
public const val `CSCONFIGFLAG_DO_NOT_START`: UInt = 4u;
public const val `DMSTATEFLAG_APPLYTOALL`: UInt = 1u;
public const val `DOSOPTF_ALWAYSUSE`: Int = 4;
public const val `DOSOPTF_DEFAULT`: Int = 1;
public const val `DOSOPTF_INDOSSTART`: Int = 64;
public const val `DOSOPTF_MULTIPLE`: Int = 128;
public const val `DOSOPTF_NEEDSETUP`: Int = 32;
public const val `DOSOPTF_PROVIDESUMB`: Int = 16;
public const val `DOSOPTF_SUPPORTED`: Int = 2;
public const val `DOSOPTF_USESPMODE`: Int = 8;
public const val `DOSOPTGF_DEFCLEAN`: Int = 1;
public const val `DRIVERSIGN_BLOCKING`: UInt = 2u;
public const val `DRIVERSIGN_NONE`: UInt = 0u;
public const val `DRIVERSIGN_WARNING`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSKTLSYSTEMTIME` (
    public var `wYear`: UShort,
    public var `wMonth`: UShort,
    public var `wDayOfWeek`: UShort,
    public var `wDay`: UShort,
    public var `wHour`: UShort,
    public var `wMinute`: UShort,
    public var `wSecond`: UShort,
    public var `wMilliseconds`: UShort,
    public var `wResult`: UShort,
)
public const val `DTRESULTFIX`: UInt = 1u;
public const val `DTRESULTOK`: UInt = 0u;
public const val `DTRESULTPART`: UInt = 3u;
public const val `DTRESULTPROB`: UInt = 2u;
public const val `EISAFLAG_NO_IO_MERGE`: UInt = 1u;
public const val `EISAFLAG_SLOT_IO_FIRST`: UInt = 2u;
public const val `EISA_NO_MAX_FUNCTION`: UInt = 255u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HKEY` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// UNSUPPORTED Rust 148:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_CLASSES_ROOT: HKEY = -2147483648i32 as _;

// UNSUPPORTED Rust 149:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_CURRENT_CONFIG: HKEY = -2147483643i32 as _;

// UNSUPPORTED Rust 150:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_CURRENT_USER: HKEY = -2147483647i32 as _;

// UNSUPPORTED Rust 151:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_CURRENT_USER_LOCAL_SETTINGS: HKEY = -2147483641i32 as _;

// UNSUPPORTED Rust 152:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_DYN_DATA: HKEY = -2147483642i32 as _;

// UNSUPPORTED Rust 153:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_LOCAL_MACHINE: HKEY = -2147483646i32 as _;

// UNSUPPORTED Rust 154:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_PERFORMANCE_DATA: HKEY = -2147483644i32 as _;

// UNSUPPORTED Rust 155:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_PERFORMANCE_NLSTEXT: HKEY = -2147483552i32 as _;

// UNSUPPORTED Rust 156:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_PERFORMANCE_TEXT: HKEY = -2147483568i32 as _;

// UNSUPPORTED Rust 157:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HKEY_USERS: HKEY = -2147483645i32 as _;

public const val `IT_COMPACT`: UInt = 0u;
public const val `IT_CUSTOM`: UInt = 3u;
public const val `IT_PORTABLE`: UInt = 2u;
public const val `IT_TYPICAL`: UInt = 1u;
public const val `KEY_ALL_ACCESS`: `REG_SAM_FLAGS` = 983103u;
public const val `KEY_CREATE_LINK`: `REG_SAM_FLAGS` = 32u;
public const val `KEY_CREATE_SUB_KEY`: `REG_SAM_FLAGS` = 4u;
public const val `KEY_ENUMERATE_SUB_KEYS`: `REG_SAM_FLAGS` = 8u;
public const val `KEY_EXECUTE`: `REG_SAM_FLAGS` = 131097u;
public const val `KEY_NOTIFY`: `REG_SAM_FLAGS` = 16u;
public const val `KEY_QUERY_VALUE`: `REG_SAM_FLAGS` = 1u;
public const val `KEY_READ`: `REG_SAM_FLAGS` = 131097u;
public const val `KEY_SET_VALUE`: `REG_SAM_FLAGS` = 2u;
public const val `KEY_WOW64_32KEY`: `REG_SAM_FLAGS` = 512u;
public const val `KEY_WOW64_64KEY`: `REG_SAM_FLAGS` = 256u;
public const val `KEY_WOW64_RES`: `REG_SAM_FLAGS` = 768u;
public const val `KEY_WRITE`: `REG_SAM_FLAGS` = 131078u;
public const val `LASTGOOD_OPERATION`: UInt = 255u;
public const val `LASTGOOD_OPERATION_DELETE`: UInt = 1u;
public const val `LASTGOOD_OPERATION_NOPOSTPROC`: UInt = 0u;
public const val `MF_FLAGS_CREATE_BUT_NO_SHOW_DISABLED`: UInt = 8u;
public const val `MF_FLAGS_EVEN_IF_NO_RESOURCE`: UInt = 1u;
public const val `MF_FLAGS_FILL_IN_UNKNOWN_RESOURCE`: UInt = 4u;
public const val `MF_FLAGS_NO_CREATE_IF_NO_RESOURCE`: UInt = 2u;
public const val `NUM_EISA_RANGES`: UInt = 4u;
public const val `NUM_RESOURCE_MAP`: UInt = 256u;
public const val `PCIC_DEFAULT_IRQMASK`: UInt = 20152u;
public const val `PCIC_DEFAULT_NUMSOCKETS`: UInt = 0u;
public const val `PCI_OPTIONS_USE_BIOS`: Int = 1;
public const val `PCI_OPTIONS_USE_IRQ_STEERING`: Int = 2;
public const val `PCMCIA_DEF_MEMBEGIN`: UInt = 786432u;
public const val `PCMCIA_DEF_MEMEND`: UInt = 16777215u;
public const val `PCMCIA_DEF_MEMLEN`: UInt = 4096u;
public const val `PCMCIA_DEF_MIN_REGION`: UInt = 65536u;
public const val `PCMCIA_OPT_AUTOMEM`: Int = 4;
public const val `PCMCIA_OPT_HAVE_SOCKET`: Int = 1;
public const val `PCMCIA_OPT_NO_APMREMOVE`: Int = 32;
public const val `PCMCIA_OPT_NO_AUDIO`: Int = 16;
public const val `PCMCIA_OPT_NO_SOUND`: Int = 8;
public const val `PIR_OPTION_DEFAULT`: UInt = 15u;
public const val `PIR_OPTION_ENABLED`: UInt = 1u;
public const val `PIR_OPTION_MSSPEC`: UInt = 4u;
public const val `PIR_OPTION_REALMODE`: UInt = 8u;
public const val `PIR_OPTION_REGISTRY`: UInt = 2u;
public const val `PIR_STATUS_DISABLED`: UInt = 2u;
public const val `PIR_STATUS_ENABLED`: UInt = 1u;
public const val `PIR_STATUS_ERROR`: UInt = 0u;
public const val `PIR_STATUS_MAX`: UInt = 3u;
public const val `PIR_STATUS_MINIPORT_COMPATIBLE`: UInt = 1u;
public const val `PIR_STATUS_MINIPORT_ERROR`: UInt = 4u;
public const val `PIR_STATUS_MINIPORT_INVALID`: UInt = 7u;
public const val `PIR_STATUS_MINIPORT_MAX`: UInt = 8u;
public const val `PIR_STATUS_MINIPORT_NOKEY`: UInt = 5u;
public const val `PIR_STATUS_MINIPORT_NONE`: UInt = 3u;
public const val `PIR_STATUS_MINIPORT_NORMAL`: UInt = 0u;
public const val `PIR_STATUS_MINIPORT_OVERRIDE`: UInt = 2u;
public const val `PIR_STATUS_MINIPORT_SUCCESS`: UInt = 6u;
public const val `PIR_STATUS_TABLE_BAD`: UInt = 5u;
public const val `PIR_STATUS_TABLE_ERROR`: UInt = 4u;
public const val `PIR_STATUS_TABLE_MAX`: UInt = 7u;
public const val `PIR_STATUS_TABLE_MSSPEC`: UInt = 1u;
public const val `PIR_STATUS_TABLE_NONE`: UInt = 3u;
public const val `PIR_STATUS_TABLE_REALMODE`: UInt = 2u;
public const val `PIR_STATUS_TABLE_REGISTRY`: UInt = 0u;
public const val `PIR_STATUS_TABLE_SUCCESS`: UInt = 6u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PQUERYHANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`val_context`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt) -> UInt>>>;
public const val `PROVIDER_KEEPS_VALUE_LENGTH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PVALUEA` (
    public var `pv_valuename`: `windows_sys`.`core`.`PSTR`,
    public var `pv_valuelen`: Int,
    public var `pv_value_context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pv_type`: UInt,
)
// UNSUPPORTED Rust 233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PVALUEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PVALUEW` (
    public var `pv_valuename`: `windows_sys`.`core`.`PWSTR`,
    public var `pv_valuelen`: Int,
    public var `pv_value_context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pv_type`: UInt,
)
// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PVALUEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REGDF_CONFLICTDMA`: UInt = 524288u;
public const val `REGDF_CONFLICTIO`: UInt = 65536u;
public const val `REGDF_CONFLICTIRQ`: UInt = 262144u;
public const val `REGDF_CONFLICTMEM`: UInt = 131072u;
public const val `REGDF_GENFORCEDCONFIG`: UInt = 32u;
public const val `REGDF_MAPIRQ2TO9`: UInt = 1048576u;
public const val `REGDF_NEEDFULLCONFIG`: UInt = 16u;
public const val `REGDF_NODETCONFIG`: UInt = 32768u;
public const val `REGDF_NOTDETDMA`: UInt = 8u;
public const val `REGDF_NOTDETIO`: UInt = 1u;
public const val `REGDF_NOTDETIRQ`: UInt = 4u;
public const val `REGDF_NOTDETMEM`: UInt = 2u;
public const val `REGDF_NOTVERIFIED`: UInt = 2147483648u;
// UNSUPPORTED Rust 264:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_DATA_NETOS_IPX: windows_sys::core::PCWSTR = windows_sys::core::w!("IPX");

// UNSUPPORTED Rust 265:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_DATA_NETOS_NDIS: windows_sys::core::PCWSTR = windows_sys::core::w!("NDIS");

// UNSUPPORTED Rust 266:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_DATA_NETOS_ODI: windows_sys::core::PCWSTR = windows_sys::core::w!("ODI");

// UNSUPPORTED Rust 267:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_DEFAULT_INSTANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("0000");

// UNSUPPORTED Rust 268:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_ACPIENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("ACPI");

// UNSUPPORTED Rust 269:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_APM: windows_sys::core::PCWSTR = windows_sys::core::w!("*PNP0C05");

// UNSUPPORTED Rust 270:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_BIOSENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("BIOS");

// UNSUPPORTED Rust 271:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Class");

// UNSUPPORTED Rust 272:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_CONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("Config");

// UNSUPPORTED Rust 273:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_CONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("Control");

// UNSUPPORTED Rust 274:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_CRASHES: windows_sys::core::PCWSTR = windows_sys::core::w!("Crashes");

// UNSUPPORTED Rust 275:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_CURRENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Current");

// UNSUPPORTED Rust 276:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_CURRENT_ENV: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Windows 4.0");

// UNSUPPORTED Rust 277:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DANGERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Dangers");

// UNSUPPORTED Rust 278:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("Default");

// UNSUPPORTED Rust 279:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DETMODVARS: windows_sys::core::PCWSTR = windows_sys::core::w!("DetModVars");

// UNSUPPORTED Rust 280:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DEVICEPARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Device Parameters");

// UNSUPPORTED Rust 281:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DEVICE_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Properties");

// UNSUPPORTED Rust 282:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DISPLAY_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Display");

// UNSUPPORTED Rust 283:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DOSOPTCDROM: windows_sys::core::PCWSTR = windows_sys::core::w!("CD-ROM");

// UNSUPPORTED Rust 284:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DOSOPTMOUSE: windows_sys::core::PCWSTR = windows_sys::core::w!("MOUSE");

// UNSUPPORTED Rust 285:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DRIVERPARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Driver Parameters");

// UNSUPPORTED Rust 286:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_DRIVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Drivers");

// UNSUPPORTED Rust 287:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EBDAUTOEXECBATKEYBOARD: windows_sys::core::PCWSTR = windows_sys::core::w!("EBDAutoexecBatKeyboard");

// UNSUPPORTED Rust 288:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EBDAUTOEXECBATLOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("EBDAutoexecBatLocale");

// UNSUPPORTED Rust 289:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EBDCONFIGSYSKEYBOARD: windows_sys::core::PCWSTR = windows_sys::core::w!("EBDConfigSysKeyboard");

// UNSUPPORTED Rust 290:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EBDCONFIGSYSLOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("EBDConfigSysLocale");

// UNSUPPORTED Rust 291:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EBDFILESKEYBOARD: windows_sys::core::PCWSTR = windows_sys::core::w!("EBDFilesKeyboard");

// UNSUPPORTED Rust 292:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EBDFILESLOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("EBDFilesLocale");

// UNSUPPORTED Rust 293:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EISAENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("EISA");

// UNSUPPORTED Rust 294:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_ENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("Enum");

// UNSUPPORTED Rust 295:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_EXPLORER: windows_sys::core::PCWSTR = windows_sys::core::w!("Explorer");

// UNSUPPORTED Rust 296:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_FILTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Filters");

// UNSUPPORTED Rust 297:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_INIUPDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("IniUpdate");

// UNSUPPORTED Rust 298:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_ISAENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("ISAPnP");

// UNSUPPORTED Rust 299:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_JOYCURR: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentJoystickSettings");

// UNSUPPORTED Rust 300:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_JOYSETTINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("JoystickSettings");

// UNSUPPORTED Rust 301:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_KEYBOARD_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Keyboard");

// UNSUPPORTED Rust 302:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_KNOWNDOCKINGSTATES: windows_sys::core::PCWSTR = windows_sys::core::w!("Hardware Profiles");

// UNSUPPORTED Rust 303:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_LOGCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("LogConfig");

// UNSUPPORTED Rust 304:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_LOGON: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Logon");

// UNSUPPORTED Rust 305:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_LOWER_FILTER_LEVEL_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("*Lower");

// UNSUPPORTED Rust 306:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_MEDIA_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("MEDIA");

// UNSUPPORTED Rust 307:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_MODEM_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Modem");

// UNSUPPORTED Rust 308:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_MODES: windows_sys::core::PCWSTR = windows_sys::core::w!("Modes");

// UNSUPPORTED Rust 309:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_MONITOR_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Monitor");

// UNSUPPORTED Rust 310:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_MOUSE_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Mouse");

// UNSUPPORTED Rust 311:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_NDISINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("NDISInfo");

// UNSUPPORTED Rust 312:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_NETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("Network");

// UNSUPPORTED Rust 313:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_NETWORKPROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("\\NetworkProvider");

// UNSUPPORTED Rust 314:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_NETWORK_PERSISTENT: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Persistent");

// UNSUPPORTED Rust 315:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_NETWORK_RECENT: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Recent");

// UNSUPPORTED Rust 316:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_OVERRIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("Override");

// UNSUPPORTED Rust 317:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PCIENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("PCI");

// UNSUPPORTED Rust 318:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PCMCIA: windows_sys::core::PCWSTR = windows_sys::core::w!("PCMCIA\\");

// UNSUPPORTED Rust 319:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PCMCIAENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("PCMCIA");

// UNSUPPORTED Rust 320:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PCMCIA_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("PCMCIA");

// UNSUPPORTED Rust 321:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PCMTD: windows_sys::core::PCWSTR = windows_sys::core::w!("MTD-");

// UNSUPPORTED Rust 322:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PCUNKNOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("UNKNOWN_MANUFACTURER");

// UNSUPPORTED Rust 323:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_POL_COMPUTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Computers");

// UNSUPPORTED Rust 324:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_POL_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!(".default");

// UNSUPPORTED Rust 325:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_POL_USERGROUPDATA: windows_sys::core::PCWSTR = windows_sys::core::w!("GroupData\\UserGroups\\Priority");

// UNSUPPORTED Rust 326:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_POL_USERGROUPS: windows_sys::core::PCWSTR = windows_sys::core::w!("UserGroups");

// UNSUPPORTED Rust 327:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_POL_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Users");

// UNSUPPORTED Rust 328:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PORTS_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("ports");

// UNSUPPORTED Rust 329:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PRINTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Printers");

// UNSUPPORTED Rust 330:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_PRINT_PROC: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Print Processors");

// UNSUPPORTED Rust 331:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_ROOTENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("Root");

// UNSUPPORTED Rust 332:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_RUNHISTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("RunHistory");

// UNSUPPORTED Rust 333:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_SCSI_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCSIAdapter");

// UNSUPPORTED Rust 334:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_SETUP: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Setup");

// UNSUPPORTED Rust 335:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_SHARES: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\LanMan");

// UNSUPPORTED Rust 336:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_SYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("System");

// UNSUPPORTED Rust 337:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_SYSTEMBOARD: windows_sys::core::PCWSTR = windows_sys::core::w!("*PNP0C01");

// UNSUPPORTED Rust 338:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_UPPER_FILTER_LEVEL_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("*Upper");

// UNSUPPORTED Rust 339:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_USER: windows_sys::core::PCWSTR = windows_sys::core::w!("User");

// UNSUPPORTED Rust 340:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_VPOWERDENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("VPOWERD");

// UNSUPPORTED Rust 341:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_KEY_WINOLDAPP: windows_sys::core::PCWSTR = windows_sys::core::w!("WinOldApp");

// UNSUPPORTED Rust 342:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_ATT_PC: windows_sys::core::PCWSTR = windows_sys::core::w!("AT&T PC");

// UNSUPPORTED Rust 343:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_HP_VECTRA: windows_sys::core::PCWSTR = windows_sys::core::w!("HP Vectra");

// UNSUPPORTED Rust 344:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPC: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PC");

// UNSUPPORTED Rust 345:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPCAT: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PC/AT");

// UNSUPPORTED Rust 346:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPCCONV: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PC Convertible");

// UNSUPPORTED Rust 347:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPCJR: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PCjr");

// UNSUPPORTED Rust 348:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPCXT: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PC/XT");

// UNSUPPORTED Rust 349:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPCXT_286: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PC/XT 286");

// UNSUPPORTED Rust 350:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS1: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/1");

// UNSUPPORTED Rust 351:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_25: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-25");

// UNSUPPORTED Rust 352:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_30: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-30");

// UNSUPPORTED Rust 353:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_30_286: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-30 286");

// UNSUPPORTED Rust 354:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_50: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-50");

// UNSUPPORTED Rust 355:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_50Z: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-50Z");

// UNSUPPORTED Rust 356:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_55SX: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-55SX");

// UNSUPPORTED Rust 357:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_60: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-60");

// UNSUPPORTED Rust 358:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_65SX: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-65SX");

// UNSUPPORTED Rust 359:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_70: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-70");

// UNSUPPORTED Rust 360:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_70_80: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-70/80");

// UNSUPPORTED Rust 361:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_80: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-80");

// UNSUPPORTED Rust 362:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_90: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-90");

// UNSUPPORTED Rust 363:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_IBMPS2_P70: windows_sys::core::PCWSTR = windows_sys::core::w!("IBM PS/2-P70");

// UNSUPPORTED Rust 364:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_PHOENIX_PCAT: windows_sys::core::PCWSTR = windows_sys::core::w!("Phoenix PC/AT Compatible");

// UNSUPPORTED Rust 365:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_UNKNOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("Unknown");

// UNSUPPORTED Rust 366:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_MACHTYPE_ZENITH_PC: windows_sys::core::PCWSTR = windows_sys::core::w!("Zenith PC");

public const val `REGSTR_MAX_VALUE_LENGTH`: UInt = 256u;
// UNSUPPORTED Rust 368:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_ADDRARB: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\Arbitrators\\AddrArb");

// UNSUPPORTED Rust 369:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_AEDEBUG: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows NT\\CurrentVersion\\AeDebug");

// UNSUPPORTED Rust 370:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_APPEARANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Appearance");

// UNSUPPORTED Rust 371:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_APPPATCH: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\AppPatches");

// UNSUPPORTED Rust 372:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_APPPATHS: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\App Paths");

// UNSUPPORTED Rust 373:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_BIOSINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\BiosInfo");

// UNSUPPORTED Rust 374:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_BUSINFORMATION: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\PnP\\BusInformation");

// UNSUPPORTED Rust 375:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CDFS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\FileSystem\\CDFS");

// UNSUPPORTED Rust 376:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHECKBADAPPS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\CheckBadApps");

// UNSUPPORTED Rust 377:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHECKBADAPPS400: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\CheckBadApps400");

// UNSUPPORTED Rust 378:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHECKDISK: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive");

// UNSUPPORTED Rust 379:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHECKDISKSET: windows_sys::core::PCWSTR = windows_sys::core::w!("Settings");

// UNSUPPORTED Rust 380:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHECKDISKUDRVS: windows_sys::core::PCWSTR = windows_sys::core::w!("NoUnknownDDErrDrvs");

// UNSUPPORTED Rust 381:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHECKVERDLLS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\CheckVerDLLs");

// UNSUPPORTED Rust 382:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHILD_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("Child");

// UNSUPPORTED Rust 383:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHKLASTCHECK: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive\\LastCheck");

// UNSUPPORTED Rust 384:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CHKLASTSURFAN: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive\\LastSurfaceAnalysis");

// UNSUPPORTED Rust 385:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\Class");

// UNSUPPORTED Rust 386:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CLASS_NT: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Class");

// UNSUPPORTED Rust 387:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CODEPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Nls\\Codepage");

// UNSUPPORTED Rust 388:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CODEVICEINSTALLERS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\CoDeviceInstallers");

// UNSUPPORTED Rust 389:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_COLORS: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Colors");

// UNSUPPORTED Rust 390:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_COMPUTRNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\ComputerName\\ComputerName");

// UNSUPPORTED Rust 391:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CONTROLPANEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel");

// UNSUPPORTED Rust 392:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CONTROLSFOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Controls Folder");

// UNSUPPORTED Rust 393:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CRITICALDEVICEDATABASE: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\CriticalDeviceDatabase");

// UNSUPPORTED Rust 394:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CURRENTCONTROLSET: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet");

// UNSUPPORTED Rust 395:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CURRENT_CONTROL_SET: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control");

// UNSUPPORTED Rust 396:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CURSORS: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Cursors");

// UNSUPPORTED Rust 397:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_CVNETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Network");

// UNSUPPORTED Rust 398:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DESKTOP: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Desktop");

// UNSUPPORTED Rust 399:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DETECT: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Detect");

// UNSUPPORTED Rust 400:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DEVICEINSTALLER: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Device Installer");

// UNSUPPORTED Rust 401:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DEVICE_CLASSES: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\DeviceClasses");

// UNSUPPORTED Rust 402:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DIFX: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\DIFX");

// UNSUPPORTED Rust 403:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DISPLAYSETTINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Display\\Settings");

// UNSUPPORTED Rust 404:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DMAARB: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\Arbitrators\\DMAArb");

// UNSUPPORTED Rust 405:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DRIVERSIGN: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Driver Signing");

// UNSUPPORTED Rust 406:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_DRIVERSIGN_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Policies\\Microsoft\\Windows NT\\Driver Signing");

// UNSUPPORTED Rust 407:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_ENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("Enum");

// UNSUPPORTED Rust 408:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_ENVIRONMENTS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Print\\Environments");

// UNSUPPORTED Rust 409:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_EVENTLABELS: windows_sys::core::PCWSTR = windows_sys::core::w!("AppEvents\\EventLabels");

// UNSUPPORTED Rust 410:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_EXPLORER: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer");

// UNSUPPORTED Rust 411:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_FAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Fault");

// UNSUPPORTED Rust 412:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_FILESYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\FileSystem");

// UNSUPPORTED Rust 413:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_FILESYSTEM_NOVOLTRACK: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\FileSystem\\NoVolTrack");

// UNSUPPORTED Rust 414:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_FLOATINGPOINTPROCESSOR: windows_sys::core::PCWSTR = windows_sys::core::w!("HARDWARE\\DESCRIPTION\\System\\FloatingPointProcessor");

// UNSUPPORTED Rust 415:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_FLOATINGPOINTPROCESSOR0: windows_sys::core::PCWSTR = windows_sys::core::w!("HARDWARE\\DESCRIPTION\\System\\FloatingPointProcessor\\0");

// UNSUPPORTED Rust 416:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_FONTS: windows_sys::core::PCWSTR = windows_sys::core::w!("Display\\Fonts");

// UNSUPPORTED Rust 417:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_GRPCONV: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\GrpConv");

// UNSUPPORTED Rust 418:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_HACKINIFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\HackIniFiles");

// UNSUPPORTED Rust 419:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_HWPROFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Hardware Profiles");

// UNSUPPORTED Rust 420:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_HWPROFILESCURRENT: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Hardware Profiles\\Current");

// UNSUPPORTED Rust 421:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_ICONS: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Icons");

// UNSUPPORTED Rust 422:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_IDCONFIGDB: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\IDConfigDB");

// UNSUPPORTED Rust 423:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_INSTALLEDFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\InstalledFiles");

// UNSUPPORTED Rust 424:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_IOARB: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\Arbitrators\\IOArb");

// UNSUPPORTED Rust 425:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_IOS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\VxD\\IOS");

// UNSUPPORTED Rust 426:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_IRQARB: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\Arbitrators\\IRQArb");

// UNSUPPORTED Rust 427:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_KEYBOARD: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Keyboard");

// UNSUPPORTED Rust 428:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_KNOWN16DLLS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\Known16DLLs");

// UNSUPPORTED Rust 429:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_KNOWNDLLS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\KnownDLLs");

// UNSUPPORTED Rust 430:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_KNOWNVXDS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\KnownVxDs");

// UNSUPPORTED Rust 431:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_LASTBACKUP: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastBackup");

// UNSUPPORTED Rust 432:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_LASTCHECK: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastCheck");

// UNSUPPORTED Rust 433:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_LASTGOOD: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\LastKnownGoodRecovery\\LastGood");

// UNSUPPORTED Rust 434:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_LASTGOODTMP: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\LastKnownGoodRecovery\\LastGood.Tmp");

// UNSUPPORTED Rust 435:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_LASTOPTIMIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastOptimize");

// UNSUPPORTED Rust 436:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_LOOKSCHEMES: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Appearance\\Schemes");

// UNSUPPORTED Rust 437:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_METRICS: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Desktop\\WindowMetrics");

// UNSUPPORTED Rust 438:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_MONITORS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Print\\Monitors");

// UNSUPPORTED Rust 439:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_MOUSE: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Mouse");

// UNSUPPORTED Rust 440:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_MSDOSOPTS: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\MS-DOSOptions");

// UNSUPPORTED Rust 441:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_MULTIMEDIA_AUDIO: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Multimedia\\Audio");

// UNSUPPORTED Rust 442:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_MULTI_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("MF");

// UNSUPPORTED Rust 443:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NCPSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\NcpServer\\Parameters");

// UNSUPPORTED Rust 444:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NETEQUIV: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\Equivalent");

// UNSUPPORTED Rust 445:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NETWORK_USERSETTINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Network");

// UNSUPPORTED Rust 446:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NEWDOSBOX: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\MS-DOSSpecialConfig");

// UNSUPPORTED Rust 447:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NONDRIVERSIGN: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Non-Driver Signing");

// UNSUPPORTED Rust 448:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NONDRIVERSIGN_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Policies\\Microsoft\\Windows NT\\Non-Driver Signing");

// UNSUPPORTED Rust 449:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NOSUGGMSDOS: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\NoMSDOSWarn");

// UNSUPPORTED Rust 450:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NT_CURRENTVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows NT\\CurrentVersion");

// UNSUPPORTED Rust 451:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_NWREDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\VxD\\NWREDIR");

// UNSUPPORTED Rust 452:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PCIIR: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Pnp\\PciIrqRouting");

// UNSUPPORTED Rust 453:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PER_HW_ID_STORAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows NT\\CurrentVersion\\PerHwIdStorage");

// UNSUPPORTED Rust 454:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PIFCONVERT: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\PIFConvert");

// UNSUPPORTED Rust 455:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_POLICIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Policies");

// UNSUPPORTED Rust 456:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PRINT: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Print");

// UNSUPPORTED Rust 457:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PRINTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Print\\Printers");

// UNSUPPORTED Rust 458:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PROPERTYSYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\PropertySystem");

// UNSUPPORTED Rust 459:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PROVIDERS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Print\\Providers");

// UNSUPPORTED Rust 460:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_PWDPROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\PwdProvider");

// UNSUPPORTED Rust 461:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_REALMODENET: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\Real Mode Net");

// UNSUPPORTED Rust 462:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_REINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Reinstall");

// UNSUPPORTED Rust 463:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RELIABILITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Reliability");

// UNSUPPORTED Rust 464:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RELIABILITY_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Policies\\Microsoft\\Windows NT\\Reliability");

// UNSUPPORTED Rust 465:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RELIABILITY_POLICY_REPORTSNAPSHOT: windows_sys::core::PCWSTR = windows_sys::core::w!("ReportSnapshot");

// UNSUPPORTED Rust 466:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RELIABILITY_POLICY_SHUTDOWNREASONUI: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownReasonUI");

// UNSUPPORTED Rust 467:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RELIABILITY_POLICY_SNAPSHOT: windows_sys::core::PCWSTR = windows_sys::core::w!("Snapshot");

// UNSUPPORTED Rust 468:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_ROOT: windows_sys::core::PCWSTR = windows_sys::core::w!("Enum\\Root");

// UNSUPPORTED Rust 469:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RUN: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Run");

// UNSUPPORTED Rust 470:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RUNONCE: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\RunOnce");

// UNSUPPORTED Rust 471:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RUNONCEEX: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\RunOnceEx");

// UNSUPPORTED Rust 472:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RUNSERVICES: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\RunServices");

// UNSUPPORTED Rust 473:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_RUNSERVICESONCE: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\RunServicesOnce");

// UNSUPPORTED Rust 474:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SCHEMES: windows_sys::core::PCWSTR = windows_sys::core::w!("AppEvents\\Schemes");

// UNSUPPORTED Rust 475:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SCREENSAVE: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Desktop");

// UNSUPPORTED Rust 476:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SERVICES: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services");

// UNSUPPORTED Rust 477:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SETUP: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion");

// UNSUPPORTED Rust 478:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SHUTDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Shutdown");

// UNSUPPORTED Rust 479:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SOUND: windows_sys::core::PCWSTR = windows_sys::core::w!("Control Panel\\Sound");

// UNSUPPORTED Rust 480:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SYSTEMENUM: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Enum");

// UNSUPPORTED Rust 481:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_SYSTRAY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\SysTray");

// UNSUPPORTED Rust 482:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_TIMEZONE: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\TimeZoneInformation");

// UNSUPPORTED Rust 483:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_UNINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Uninstall");

// UNSUPPORTED Rust 484:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_UPDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Update");

// UNSUPPORTED Rust 485:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_VCOMM: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\VxD\\VCOMM");

// UNSUPPORTED Rust 486:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_VMM: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\VxD\\VMM");

// UNSUPPORTED Rust 487:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_VMM32FILES: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\VMM32Files");

// UNSUPPORTED Rust 488:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_VNETSUP: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\VxD\\VNETSUP");

// UNSUPPORTED Rust 489:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_VOLUMECACHE: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\VolumeCaches");

// UNSUPPORTED Rust 490:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_VPOWERD: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\VxD\\VPOWERD");

// UNSUPPORTED Rust 491:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_VXD: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\VxD");

// UNSUPPORTED Rust 492:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_WARNVERDLLS: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\SessionManager\\WarnVerDLLs");

// UNSUPPORTED Rust 493:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_WINBOOT: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\WinBoot");

// UNSUPPORTED Rust 494:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_WINDOWSAPPLETS: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Applets");

// UNSUPPORTED Rust 495:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_WINLOGON: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\Winlogon");

// UNSUPPORTED Rust 496:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PATH_WMI_SECURITY: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\Wmi\\Security");

// UNSUPPORTED Rust 497:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PCI_DUAL_IDE: windows_sys::core::PCWSTR = windows_sys::core::w!("PCIDualIDE");

// UNSUPPORTED Rust 498:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_PCI_OPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("Options");

// UNSUPPORTED Rust 499:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_DEFAULTLOC: windows_sys::core::PCWSTR = windows_sys::core::w!("UseDefaultNetLocation");

// UNSUPPORTED Rust 500:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_ENABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Enable");

// UNSUPPORTED Rust 501:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_LOWPOWERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenSaveLowPowerActive");

// UNSUPPORTED Rust 502:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_LOWPOWERTIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenSaveLowPowerTimeout");

// UNSUPPORTED Rust 503:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_NETPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("NetworkPath");

// UNSUPPORTED Rust 504:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_POWEROFFACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenSavePowerOffActive");

// UNSUPPORTED Rust 505:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_POWEROFFTIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenSavePowerOffTimeout");

// UNSUPPORTED Rust 506:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_SCRPASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenSave_Data");

// UNSUPPORTED Rust 507:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_USESCRPASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenSaveUsePassword");

// UNSUPPORTED Rust 508:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VALUE_VERBOSE: windows_sys::core::PCWSTR = windows_sys::core::w!("Verbose");

// UNSUPPORTED Rust 509:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ACDRIVESPINDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("ACDriveSpinDown");

// UNSUPPORTED Rust 510:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ACSPINDOWNPREVIOUS: windows_sys::core::PCWSTR = windows_sys::core::w!("ACSpinDownPrevious");

// UNSUPPORTED Rust 511:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ACTIVESERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("ActiveService");

// UNSUPPORTED Rust 512:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Address");

// UNSUPPORTED Rust 513:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AEDEBUG_AUTO: windows_sys::core::PCWSTR = windows_sys::core::w!("Auto");

// UNSUPPORTED Rust 514:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AEDEBUG_DEBUGGER: windows_sys::core::PCWSTR = windows_sys::core::w!("Debugger");

// UNSUPPORTED Rust 515:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ALPHANUMPWDS: windows_sys::core::PCWSTR = windows_sys::core::w!("AlphanumPwds");

// UNSUPPORTED Rust 516:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APISUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("APISupport");

// UNSUPPORTED Rust 517:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APMACTIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("APMACTimeout");

// UNSUPPORTED Rust 518:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APMBATTIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("APMBatTimeout");

// UNSUPPORTED Rust 519:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APMBIOSVER: windows_sys::core::PCWSTR = windows_sys::core::w!("APMBiosVer");

// UNSUPPORTED Rust 520:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APMFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("APMFlags");

// UNSUPPORTED Rust 521:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APMMENUSUSPEND: windows_sys::core::PCWSTR = windows_sys::core::w!("APMMenuSuspend");

// UNSUPPORTED Rust 522:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APMSHUTDOWNPOWER: windows_sys::core::PCWSTR = windows_sys::core::w!("APMShutDownPower");

// UNSUPPORTED Rust 523:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_APPINSTPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("AppInstallPath");

// UNSUPPORTED Rust 524:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ASKFORCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("AskForConfig");

// UNSUPPORTED Rust 525:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ASKFORCONFIGFUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("AskForConfigFunc");

// UNSUPPORTED Rust 526:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ASYNCFILECOMMIT: windows_sys::core::PCWSTR = windows_sys::core::w!("AsyncFileCommit");

// UNSUPPORTED Rust 527:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUDIO_BITMAP: windows_sys::core::PCWSTR = windows_sys::core::w!("bitmap");

// UNSUPPORTED Rust 528:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUDIO_ICON: windows_sys::core::PCWSTR = windows_sys::core::w!("icon");

// UNSUPPORTED Rust 529:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUTHENT_AGENT: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthenticatingAgent");

// UNSUPPORTED Rust 530:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUTOEXEC: windows_sys::core::PCWSTR = windows_sys::core::w!("Autoexec.Bat");

// UNSUPPORTED Rust 531:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUTOINSNOTE: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoInsertNotification");

// UNSUPPORTED Rust 532:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUTOLOGON: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoLogon");

// UNSUPPORTED Rust 533:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUTOMOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoMountDrives");

// UNSUPPORTED Rust 534:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_AUTOSTART: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoStart");

// UNSUPPORTED Rust 535:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BASICPROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("BasicProperties");

// UNSUPPORTED Rust 536:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BASICPROPERTIES_32: windows_sys::core::PCWSTR = windows_sys::core::w!("BasicProperties32");

// UNSUPPORTED Rust 537:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BATDRIVESPINDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("BatDriveSpinDown");

// UNSUPPORTED Rust 538:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BATSPINDOWNPREVIOUS: windows_sys::core::PCWSTR = windows_sys::core::w!("BatSpinDownPrevious");

// UNSUPPORTED Rust 539:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BEHAVIOR_ON_FAILED_VERIFY: windows_sys::core::PCWSTR = windows_sys::core::w!("BehaviorOnFailedVerify");

// UNSUPPORTED Rust 540:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BIOSDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("BIOSDate");

// UNSUPPORTED Rust 541:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BIOSNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("BIOSName");

// UNSUPPORTED Rust 542:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BIOSVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("BIOSVersion");

// UNSUPPORTED Rust 543:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BITSPERPIXEL: windows_sys::core::PCWSTR = windows_sys::core::w!("BitsPerPixel");

// UNSUPPORTED Rust 544:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BOOTCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("BootConfig");

// UNSUPPORTED Rust 545:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BOOTCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("BootCount");

// UNSUPPORTED Rust 546:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BOOTDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("BootDir");

// UNSUPPORTED Rust 547:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BPP: windows_sys::core::PCWSTR = windows_sys::core::w!("BPP");

// UNSUPPORTED Rust 548:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BT: windows_sys::core::PCWSTR = windows_sys::core::w!("6005BT");

// UNSUPPORTED Rust 549:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BUFFAGETIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("BufferAgeTimeout");

// UNSUPPORTED Rust 550:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BUFFIDLETIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("BufferIdleTimeout");

// UNSUPPORTED Rust 551:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_BUSTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("BusType");

// UNSUPPORTED Rust 552:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CAPABILITIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Capabilities");

// UNSUPPORTED Rust 553:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CARDSPECIFIC: windows_sys::core::PCWSTR = windows_sys::core::w!("CardSpecific");

// UNSUPPORTED Rust 554:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDCACHESIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("CacheSize");

// UNSUPPORTED Rust 555:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDCOMPATNAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("MSCDEXCompatNames");

// UNSUPPORTED Rust 556:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDEXTERRORS: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtendedErrors");

// UNSUPPORTED Rust 557:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDNOREADAHEAD: windows_sys::core::PCWSTR = windows_sys::core::w!("NoReadAhead");

// UNSUPPORTED Rust 558:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDPREFETCH: windows_sys::core::PCWSTR = windows_sys::core::w!("Prefetch");

// UNSUPPORTED Rust 559:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDPREFETCHTAIL: windows_sys::core::PCWSTR = windows_sys::core::w!("PrefetchTail");

// UNSUPPORTED Rust 560:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDRAWCACHE: windows_sys::core::PCWSTR = windows_sys::core::w!("RawCache");

// UNSUPPORTED Rust 561:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDROM: windows_sys::core::PCWSTR = windows_sys::core::w!("GenCD");

// UNSUPPORTED Rust 562:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDROMCLASSNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CDROM");

// UNSUPPORTED Rust 563:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDSHOWVERSIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("ShowVersions");

// UNSUPPORTED Rust 564:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CDSVDSENSE: windows_sys::core::PCWSTR = windows_sys::core::w!("SVDSense");

// UNSUPPORTED Rust 565:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CHECKSUM: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentChecksum");

// UNSUPPORTED Rust 566:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Class");

// UNSUPPORTED Rust 567:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CLASSDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("ClassDesc");

// UNSUPPORTED Rust 568:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CLASSGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("ClassGUID");

// UNSUPPORTED Rust 569:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CMDRIVFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("CMDrivFlags");

// UNSUPPORTED Rust 570:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CMENUMFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("CMEnumFlags");

// UNSUPPORTED Rust 571:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COINSTALLERS_32: windows_sys::core::PCWSTR = windows_sys::core::w!("CoInstallers32");

// UNSUPPORTED Rust 572:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("ComInfo");

// UNSUPPORTED Rust 573:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Comment");

// UNSUPPORTED Rust 574:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMPATIBLEIDS: windows_sys::core::PCWSTR = windows_sys::core::w!("CompatibleIDs");

// UNSUPPORTED Rust 575:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMPRESSIONMETHOD: windows_sys::core::PCWSTR = windows_sys::core::w!("CompressionAlgorithm");

// UNSUPPORTED Rust 576:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMPRESSIONTHRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("CompressionThreshold");

// UNSUPPORTED Rust 577:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMPUTERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ComputerName");

// UNSUPPORTED Rust 578:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMPUTRNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ComputerName");

// UNSUPPORTED Rust 579:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_COMVERIFYBASE: windows_sys::core::PCWSTR = windows_sys::core::w!("COMVerifyBase");

// UNSUPPORTED Rust 580:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigPath");

// UNSUPPORTED Rust 581:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONFIGFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigFlags");

// UNSUPPORTED Rust 582:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONFIGMG: windows_sys::core::PCWSTR = windows_sys::core::w!("CONFIGMG");

// UNSUPPORTED Rust 583:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONFIGSYS: windows_sys::core::PCWSTR = windows_sys::core::w!("Config.Sys");

// UNSUPPORTED Rust 584:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONNECTION_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ConnectionType");

// UNSUPPORTED Rust 585:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONTAINERID: windows_sys::core::PCWSTR = windows_sys::core::w!("ContainerID");

// UNSUPPORTED Rust 586:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONTIGFILEALLOC: windows_sys::core::PCWSTR = windows_sys::core::w!("ContigFileAllocSize");

// UNSUPPORTED Rust 587:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CONVMEM: windows_sys::core::PCWSTR = windows_sys::core::w!("ConvMem");

// UNSUPPORTED Rust 588:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CPU: windows_sys::core::PCWSTR = windows_sys::core::w!("CPU");

// UNSUPPORTED Rust 589:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CRASHFUNCS: windows_sys::core::PCWSTR = windows_sys::core::w!("CrashFuncs");

// UNSUPPORTED Rust 590:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CSCONFIGFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("CSConfigFlags");

// UNSUPPORTED Rust 591:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentConfig");

// UNSUPPORTED Rust 592:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURDRVLET: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentDriveLetterAssignment");

// UNSUPPORTED Rust 593:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURRENTCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentConfig");

// UNSUPPORTED Rust 594:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURRENT_BUILD: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentBuildNumber");

// UNSUPPORTED Rust 595:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURRENT_CSDVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("CSDVersion");

// UNSUPPORTED Rust 596:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURRENT_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentType");

// UNSUPPORTED Rust 597:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURRENT_USER: windows_sys::core::PCWSTR = windows_sys::core::w!("Current User");

// UNSUPPORTED Rust 598:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CURRENT_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentVersion");

// UNSUPPORTED Rust 599:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CUSTOMCOLORS: windows_sys::core::PCWSTR = windows_sys::core::w!("CustomColors");

// UNSUPPORTED Rust 600:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CUSTOM_PROPERTY_CACHE_DATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CustomPropertyCacheDate");

// UNSUPPORTED Rust 601:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_CUSTOM_PROPERTY_HW_ID_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("CustomPropertyHwIdKey");

// UNSUPPORTED Rust 602:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("Default");

// UNSUPPORTED Rust 603:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DETCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("DetConfig");

// UNSUPPORTED Rust 604:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DETECT: windows_sys::core::PCWSTR = windows_sys::core::w!("Detect");

// UNSUPPORTED Rust 605:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DETECTFUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("DetectFunc");

// UNSUPPORTED Rust 606:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DETFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("DetFlags");

// UNSUPPORTED Rust 607:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DETFUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("DetFunc");

// UNSUPPORTED Rust 608:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceDesc");

// UNSUPPORTED Rust 609:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVICEDRIVER: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceDriver");

// UNSUPPORTED Rust 610:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVICEPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("DevicePath");

// UNSUPPORTED Rust 611:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVICE_CHARACTERISTICS: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceCharacteristics");

// UNSUPPORTED Rust 612:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVICE_EXCLUSIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("Exclusive");

// UNSUPPORTED Rust 613:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVICE_INSTANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceInstance");

// UNSUPPORTED Rust 614:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVICE_SECURITY_DESCRIPTOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Security");

// UNSUPPORTED Rust 615:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVICE_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceType");

// UNSUPPORTED Rust 616:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVLOADER: windows_sys::core::PCWSTR = windows_sys::core::w!("DevLoader");

// UNSUPPORTED Rust 617:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DEVTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceType");

// UNSUPPORTED Rust 618:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DIRECTHOST: windows_sys::core::PCWSTR = windows_sys::core::w!("DirectHost");

// UNSUPPORTED Rust 619:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DIRTYSHUTDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("DirtyShutdown");

// UNSUPPORTED Rust 620:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DIRTYSHUTDOWNTIME: windows_sys::core::PCWSTR = windows_sys::core::w!("DirtyShutdownTime");

// UNSUPPORTED Rust 621:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISABLECOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableCount");

// UNSUPPORTED Rust 622:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISABLEPWDCACHING: windows_sys::core::PCWSTR = windows_sys::core::w!("DisablePwdCaching");

// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISABLEREGTOOLS: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableRegistryTools");

// UNSUPPORTED Rust 624:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISCONNECT: windows_sys::core::PCWSTR = windows_sys::core::w!("Disconnect");

// UNSUPPORTED Rust 625:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISK: windows_sys::core::PCWSTR = windows_sys::core::w!("GenDisk");

// UNSUPPORTED Rust 626:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISKCLASSNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskDrive");

// UNSUPPORTED Rust 627:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISPCPL_NOAPPEARANCEPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDispAppearancePage");

// UNSUPPORTED Rust 628:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISPCPL_NOBACKGROUNDPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDispBackgroundPage");

// UNSUPPORTED Rust 629:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISPCPL_NODISPCPL: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDispCPL");

// UNSUPPORTED Rust 630:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISPCPL_NOSCRSAVPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDispScrSavPage");

// UNSUPPORTED Rust 631:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISPCPL_NOSETTINGSPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDispSettingsPage");

// UNSUPPORTED Rust 632:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISPLAY: windows_sys::core::PCWSTR = windows_sys::core::w!("display");

// UNSUPPORTED Rust 633:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DISPLAYFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("DisplayFlags");

// UNSUPPORTED Rust 634:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOCKED: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentDockedState");

// UNSUPPORTED Rust 635:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOCKSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("DockState");

// UNSUPPORTED Rust 636:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOES_POLLING: windows_sys::core::PCWSTR = windows_sys::core::w!("PollingSupportNeeded");

// UNSUPPORTED Rust 637:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DONTLOADIFCONFLICT: windows_sys::core::PCWSTR = windows_sys::core::w!("DontLoadIfConflict");

// UNSUPPORTED Rust 638:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DONTUSEMEM: windows_sys::core::PCWSTR = windows_sys::core::w!("DontAllocLastMem");

// UNSUPPORTED Rust 639:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOSCP: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCP");

// UNSUPPORTED Rust 640:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOSOPTFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

// UNSUPPORTED Rust 641:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOSOPTGLOBALFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("GlobalFlags");

// UNSUPPORTED Rust 642:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOSOPTTIP: windows_sys::core::PCWSTR = windows_sys::core::w!("TipText");

// UNSUPPORTED Rust 643:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOSPAGER: windows_sys::core::PCWSTR = windows_sys::core::w!("DOSPager");

// UNSUPPORTED Rust 644:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOS_SPOOL_MASK: windows_sys::core::PCWSTR = windows_sys::core::w!("DOSSpoolMask");

// UNSUPPORTED Rust 645:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DOUBLEBUFFER: windows_sys::core::PCWSTR = windows_sys::core::w!("DoubleBuffer");

// UNSUPPORTED Rust 646:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DPI: windows_sys::core::PCWSTR = windows_sys::core::w!("dpi");

// UNSUPPORTED Rust 647:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DPILOGICALX: windows_sys::core::PCWSTR = windows_sys::core::w!("DPILogicalX");

// UNSUPPORTED Rust 648:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DPILOGICALY: windows_sys::core::PCWSTR = windows_sys::core::w!("DPILogicalY");

// UNSUPPORTED Rust 649:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DPIPHYSICALX: windows_sys::core::PCWSTR = windows_sys::core::w!("DPIPhysicalX");

// UNSUPPORTED Rust 650:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DPIPHYSICALY: windows_sys::core::PCWSTR = windows_sys::core::w!("DPIPhysicalY");

// UNSUPPORTED Rust 651:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DPMS: windows_sys::core::PCWSTR = windows_sys::core::w!("DPMS");

// UNSUPPORTED Rust 652:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVER: windows_sys::core::PCWSTR = windows_sys::core::w!("Driver");

// UNSUPPORTED Rust 653:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVERCACHEPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverCachePath");

// UNSUPPORTED Rust 654:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVERDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverDate");

// UNSUPPORTED Rust 655:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVERDATEDATA: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverDateData");

// UNSUPPORTED Rust 656:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVERVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverVersion");

// UNSUPPORTED Rust 657:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVESPINDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("DriveSpinDown");

// UNSUPPORTED Rust 658:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVEWRITEBEHIND: windows_sys::core::PCWSTR = windows_sys::core::w!("DriveWriteBehind");

// UNSUPPORTED Rust 659:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRIVE_SPINDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDispSpinDown");

// UNSUPPORTED Rust 660:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRV: windows_sys::core::PCWSTR = windows_sys::core::w!("drv");

// UNSUPPORTED Rust 661:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DRVDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverDesc");

// UNSUPPORTED Rust 662:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_DYNAMIC: windows_sys::core::PCWSTR = windows_sys::core::w!("Dynamic");

// UNSUPPORTED Rust 663:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EISA_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("EISAFlags");

// UNSUPPORTED Rust 664:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EISA_FUNCTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("EISAFunctions");

// UNSUPPORTED Rust 665:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EISA_FUNCTIONS_MASK: windows_sys::core::PCWSTR = windows_sys::core::w!("EISAFunctionsMask");

// UNSUPPORTED Rust 666:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EISA_RANGES: windows_sys::core::PCWSTR = windows_sys::core::w!("EISARanges");

// UNSUPPORTED Rust 667:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EISA_SIMULATE_INT15: windows_sys::core::PCWSTR = windows_sys::core::w!("EISASimulateInt15");

// UNSUPPORTED Rust 668:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EJECT_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("EjectPriority");

// UNSUPPORTED Rust 669:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ENABLEINTS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableInts");

// UNSUPPORTED Rust 670:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ENUMERATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Enumerator");

// UNSUPPORTED Rust 671:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ENUMPROPPAGES: windows_sys::core::PCWSTR = windows_sys::core::w!("EnumPropPages");

// UNSUPPORTED Rust 672:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ENUMPROPPAGES_32: windows_sys::core::PCWSTR = windows_sys::core::w!("EnumPropPages32");

// UNSUPPORTED Rust 673:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ESDI: windows_sys::core::PCWSTR = windows_sys::core::w!("ESDI\\");

// UNSUPPORTED Rust 674:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EXISTS: windows_sys::core::PCWSTR = windows_sys::core::w!("Exists");

// UNSUPPORTED Rust 675:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_EXTMEM: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtMem");

// UNSUPPORTED Rust 676:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FAULT_LOGFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("LogFile");

// UNSUPPORTED Rust 677:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FIFODEPTH: windows_sys::core::PCWSTR = windows_sys::core::w!("FIFODepth");

// UNSUPPORTED Rust 678:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FILESHARING: windows_sys::core::PCWSTR = windows_sys::core::w!("FileSharing");

// UNSUPPORTED Rust 679:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FIRSTINSTALLDATETIME: windows_sys::core::PCWSTR = windows_sys::core::w!("FirstInstallDateTime");

// UNSUPPORTED Rust 680:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FIRSTNETDRIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("FirstNetworkDrive");

// UNSUPPORTED Rust 681:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FLOP: windows_sys::core::PCWSTR = windows_sys::core::w!("FLOP\\");

// UNSUPPORTED Rust 682:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FLOPPY: windows_sys::core::PCWSTR = windows_sys::core::w!("FLOPPY");

// UNSUPPORTED Rust 683:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FONTSIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("FontSize");

// UNSUPPORTED Rust 684:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FORCECL: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceChangeLine");

// UNSUPPORTED Rust 685:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FORCEDCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("ForcedConfig");

// UNSUPPORTED Rust 686:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FORCEFIFO: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceFIFO");

// UNSUPPORTED Rust 687:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FORCELOAD: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceLoadPD");

// UNSUPPORTED Rust 688:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FORCEPMIO: windows_sys::core::PCWSTR = windows_sys::core::w!("ForcePMIO");

// UNSUPPORTED Rust 689:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FORCEREBOOT: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceReboot");

// UNSUPPORTED Rust 690:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FORCERMIO: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceRMIO");

// UNSUPPORTED Rust 691:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FREESPACERATIO: windows_sys::core::PCWSTR = windows_sys::core::w!("FreeSpaceRatio");

// UNSUPPORTED Rust 692:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FRIENDLYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FriendlyName");

// UNSUPPORTED Rust 693:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FSFILTERCLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("FSFilterClass");

// UNSUPPORTED Rust 694:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FULLTRACE: windows_sys::core::PCWSTR = windows_sys::core::w!("FullTrace");

// UNSUPPORTED Rust 695:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_FUNCDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("FunctionDesc");

// UNSUPPORTED Rust 696:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_GAPTIME: windows_sys::core::PCWSTR = windows_sys::core::w!("GapTime");

// UNSUPPORTED Rust 697:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_GRB: windows_sys::core::PCWSTR = windows_sys::core::w!("grb");

// UNSUPPORTED Rust 698:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_HARDWAREID: windows_sys::core::PCWSTR = windows_sys::core::w!("HardwareID");

// UNSUPPORTED Rust 699:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_HIDESHAREPWDS: windows_sys::core::PCWSTR = windows_sys::core::w!("HideSharePwds");

// UNSUPPORTED Rust 700:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_HRES: windows_sys::core::PCWSTR = windows_sys::core::w!("HRes");

// UNSUPPORTED Rust 701:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_HWDETECT: windows_sys::core::PCWSTR = windows_sys::core::w!("HardwareDetect");

// UNSUPPORTED Rust 702:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_HWMECHANISM: windows_sys::core::PCWSTR = windows_sys::core::w!("HWMechanism");

// UNSUPPORTED Rust 703:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_HWREV: windows_sys::core::PCWSTR = windows_sys::core::w!("HWRevision");

// UNSUPPORTED Rust 704:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentID");

// UNSUPPORTED Rust 705:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_IDE_FORCE_SERIALIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceSerialization");

// UNSUPPORTED Rust 706:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_IDE_NO_SERIALIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("IDENoSerialize");

// UNSUPPORTED Rust 707:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INFNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("InfName");

// UNSUPPORTED Rust 708:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INFPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("InfPath");

// UNSUPPORTED Rust 709:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INFSECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("InfSection");

// UNSUPPORTED Rust 710:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INFSECTIONEXT: windows_sys::core::PCWSTR = windows_sys::core::w!("InfSectionExt");

// UNSUPPORTED Rust 711:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INHIBITRESULTS: windows_sys::core::PCWSTR = windows_sys::core::w!("InhibitResults");

// UNSUPPORTED Rust 712:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INSICON: windows_sys::core::PCWSTR = windows_sys::core::w!("Icon");

// UNSUPPORTED Rust 713:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INSTALLER: windows_sys::core::PCWSTR = windows_sys::core::w!("Installer");

// UNSUPPORTED Rust 714:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INSTALLER_32: windows_sys::core::PCWSTR = windows_sys::core::w!("Installer32");

// UNSUPPORTED Rust 715:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INSTALLTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("InstallType");

// UNSUPPORTED Rust 716:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_INT13: windows_sys::core::PCWSTR = windows_sys::core::w!("Int13");

// UNSUPPORTED Rust 717:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ISAPNP: windows_sys::core::PCWSTR = windows_sys::core::w!("ISAPNP");

// UNSUPPORTED Rust 718:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ISAPNP_RDP_OVERRIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("RDPOverRide");

// UNSUPPORTED Rust 719:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYCALLOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("JoystickCallout");

// UNSUPPORTED Rust 720:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYNCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("Joystick%dConfiguration");

// UNSUPPORTED Rust 721:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYNOEMCALLOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("Joystick%dOEMCallout");

// UNSUPPORTED Rust 722:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYNOEMNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Joystick%dOEMName");

// UNSUPPORTED Rust 723:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL1: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal1");

// UNSUPPORTED Rust 724:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL10: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal10");

// UNSUPPORTED Rust 725:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL11: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal11");

// UNSUPPORTED Rust 726:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL12: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal12");

// UNSUPPORTED Rust 727:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL2: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal2");

// UNSUPPORTED Rust 728:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL3: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal3");

// UNSUPPORTED Rust 729:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL4: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal4");

// UNSUPPORTED Rust 730:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL5: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal5");

// UNSUPPORTED Rust 731:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL6: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal6");

// UNSUPPORTED Rust 732:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL7: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal7");

// UNSUPPORTED Rust 733:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL8: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal8");

// UNSUPPORTED Rust 734:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCAL9: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCal9");

// UNSUPPORTED Rust 735:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCALCAP: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCalCap");

// UNSUPPORTED Rust 736:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCALLOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCallout");

// UNSUPPORTED Rust 737:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMCALWINCAP: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMCalWinCap");

// UNSUPPORTED Rust 738:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMDATA: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMData");

// UNSUPPORTED Rust 739:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMName");

// UNSUPPORTED Rust 740:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMPOVLABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMPOVLabel");

// UNSUPPORTED Rust 741:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMRLABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMRLabel");

// UNSUPPORTED Rust 742:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMTESTBUTTONCAP: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMTestButtonCap");

// UNSUPPORTED Rust 743:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMTESTBUTTONDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMTestButtonDesc");

// UNSUPPORTED Rust 744:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMTESTMOVECAP: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMTestMoveCap");

// UNSUPPORTED Rust 745:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMTESTMOVEDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMTestMoveDesc");

// UNSUPPORTED Rust 746:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMTESTWINCAP: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMTestWinCap");

// UNSUPPORTED Rust 747:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMULABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMULabel");

// UNSUPPORTED Rust 748:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMVLABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMVLabel");

// UNSUPPORTED Rust 749:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMXYLABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMXYLabel");

// UNSUPPORTED Rust 750:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYOEMZLABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("OEMZLabel");

// UNSUPPORTED Rust 751:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_JOYUSERVALUES: windows_sys::core::PCWSTR = windows_sys::core::w!("JoystickUserValues");

// UNSUPPORTED Rust 752:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVEBT: windows_sys::core::PCWSTR = windows_sys::core::w!("LastAliveBT");

// UNSUPPORTED Rust 753:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVEINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("TimeStampInterval");

// UNSUPPORTED Rust 754:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVEPMPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("LastAlivePMPolicy");

// UNSUPPORTED Rust 755:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVESTAMP: windows_sys::core::PCWSTR = windows_sys::core::w!("LastAliveStamp");

// UNSUPPORTED Rust 756:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVESTAMPFORCED: windows_sys::core::PCWSTR = windows_sys::core::w!("LastAliveStampForced");

// UNSUPPORTED Rust 757:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVESTAMPINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("LastAliveStampInterval");

// UNSUPPORTED Rust 758:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVESTAMPPOLICYINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("LastAliveStampPolicyInterval");

// UNSUPPORTED Rust 759:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTALIVEUPTIME: windows_sys::core::PCWSTR = windows_sys::core::w!("LastAliveUptime");

// UNSUPPORTED Rust 760:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTBOOTPMDRVS: windows_sys::core::PCWSTR = windows_sys::core::w!("LastBootPMDrvs");

// UNSUPPORTED Rust 761:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTCOMPUTERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("LastComputerName");

// UNSUPPORTED Rust 762:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LASTPCIBUSNUM: windows_sys::core::PCWSTR = windows_sys::core::w!("LastPCIBusNum");

// UNSUPPORTED Rust 763:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LAST_UPDATE_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("LastUpdateTime");

// UNSUPPORTED Rust 764:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LEGALNOTICECAPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("LegalNoticeCaption");

// UNSUPPORTED Rust 765:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LEGALNOTICETEXT: windows_sys::core::PCWSTR = windows_sys::core::w!("LegalNoticeText");

// UNSUPPORTED Rust 766:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LICENSINGINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("LicensingInfo");

// UNSUPPORTED Rust 767:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LINKED: windows_sys::core::PCWSTR = windows_sys::core::w!("Linked");

// UNSUPPORTED Rust 768:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LOADHI: windows_sys::core::PCWSTR = windows_sys::core::w!("LoadHi");

// UNSUPPORTED Rust 769:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LOADRMDRIVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("LoadRMDrivers");

// UNSUPPORTED Rust 770:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LOCATION_INFORMATION: windows_sys::core::PCWSTR = windows_sys::core::w!("LocationInformation");

// UNSUPPORTED Rust 771:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LOCATION_INFORMATION_OVERRIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("LocationInformationOverride");

// UNSUPPORTED Rust 772:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LOWERFILTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("LowerFilters");

// UNSUPPORTED Rust 773:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LOWER_FILTER_DEFAULT_LEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("LowerFilterDefaultLevel");

// UNSUPPORTED Rust 774:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_LOWER_FILTER_LEVELS: windows_sys::core::PCWSTR = windows_sys::core::w!("LowerFilterLevels");

// UNSUPPORTED Rust 775:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MACHINETYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("MachineType");

// UNSUPPORTED Rust 776:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MANUFACTURER: windows_sys::core::PCWSTR = windows_sys::core::w!("Manufacturer");

// UNSUPPORTED Rust 777:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MAP: windows_sys::core::PCWSTR = windows_sys::core::w!("Map");

// UNSUPPORTED Rust 778:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MATCHINGDEVID: windows_sys::core::PCWSTR = windows_sys::core::w!("MatchingDeviceId");

// UNSUPPORTED Rust 779:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MAXCONNECTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxConnections");

// UNSUPPORTED Rust 780:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MAXLIP: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxLIP");

// UNSUPPORTED Rust 781:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MAXRES: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxResolution");

// UNSUPPORTED Rust 782:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MAXRETRY: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxRetry");

public const val `REGSTR_VAL_MAX_HCID_LEN`: UInt = 1024u;
// UNSUPPORTED Rust 784:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MEDIA: windows_sys::core::PCWSTR = windows_sys::core::w!("MediaPath");

// UNSUPPORTED Rust 785:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MFG: windows_sys::core::PCWSTR = windows_sys::core::w!("Mfg");

// UNSUPPORTED Rust 786:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MF_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("MFFlags");

// UNSUPPORTED Rust 787:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MINIPORT_STAT: windows_sys::core::PCWSTR = windows_sys::core::w!("MiniportStatus");

// UNSUPPORTED Rust 788:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MINPWDLEN: windows_sys::core::PCWSTR = windows_sys::core::w!("MinPwdLen");

// UNSUPPORTED Rust 789:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MINRETRY: windows_sys::core::PCWSTR = windows_sys::core::w!("MinRetry");

// UNSUPPORTED Rust 790:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("Mode");

// UNSUPPORTED Rust 791:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MODEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Model");

// UNSUPPORTED Rust 792:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MSDOSMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("MSDOSMode");

// UNSUPPORTED Rust 793:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MSDOSMODEDISCARD: windows_sys::core::PCWSTR = windows_sys::core::w!("Discard");

// UNSUPPORTED Rust 794:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_MUSTBEVALIDATED: windows_sys::core::PCWSTR = windows_sys::core::w!("MustBeValidated");

// UNSUPPORTED Rust 795:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NAMECACHECOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("NameCache");

// UNSUPPORTED Rust 796:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NAMENUMERICTAIL: windows_sys::core::PCWSTR = windows_sys::core::w!("NameNumericTail");

// UNSUPPORTED Rust 797:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NCP_BROWSEMASTER: windows_sys::core::PCWSTR = windows_sys::core::w!("BrowseMaster");

// UNSUPPORTED Rust 798:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NCP_USEPEERBROWSING: windows_sys::core::PCWSTR = windows_sys::core::w!("Use_PeerBrowsing");

// UNSUPPORTED Rust 799:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NCP_USESAP: windows_sys::core::PCWSTR = windows_sys::core::w!("Use_Sap");

// UNSUPPORTED Rust 800:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NDP: windows_sys::core::PCWSTR = windows_sys::core::w!("NDP");

// UNSUPPORTED Rust 801:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NETCARD: windows_sys::core::PCWSTR = windows_sys::core::w!("Netcard");

// UNSUPPORTED Rust 802:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NETCLEAN: windows_sys::core::PCWSTR = windows_sys::core::w!("NetClean");

// UNSUPPORTED Rust 803:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NETOSTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("NetOSType");

// UNSUPPORTED Rust 804:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NETSETUP_DISABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoNetSetup");

// UNSUPPORTED Rust 805:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NETSETUP_NOCONFIGPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoNetSetupConfigPage");

// UNSUPPORTED Rust 806:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NETSETUP_NOIDPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoNetSetupIDPage");

// UNSUPPORTED Rust 807:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NETSETUP_NOSECURITYPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoNetSetupSecurityPage");

// UNSUPPORTED Rust 808:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOCMOSORFDPT: windows_sys::core::PCWSTR = windows_sys::core::w!("NoCMOSorFDPT");

// UNSUPPORTED Rust 809:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NODISPLAYCLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDisplayClass");

// UNSUPPORTED Rust 810:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOENTIRENETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("NoEntireNetwork");

// UNSUPPORTED Rust 811:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOFILESHARING: windows_sys::core::PCWSTR = windows_sys::core::w!("NoFileSharing");

// UNSUPPORTED Rust 812:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOFILESHARINGCTRL: windows_sys::core::PCWSTR = windows_sys::core::w!("NoFileSharingControl");

// UNSUPPORTED Rust 813:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoIDE");

// UNSUPPORTED Rust 814:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOINSTALLCLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("NoInstallClass");

// UNSUPPORTED Rust 815:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NONSTANDARD_ATAPI: windows_sys::core::PCWSTR = windows_sys::core::w!("NonStandardATAPI");

// UNSUPPORTED Rust 816:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOPRINTSHARING: windows_sys::core::PCWSTR = windows_sys::core::w!("NoPrintSharing");

// UNSUPPORTED Rust 817:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOPRINTSHARINGCTRL: windows_sys::core::PCWSTR = windows_sys::core::w!("NoPrintSharingControl");

// UNSUPPORTED Rust 818:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOUSECLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("NoUseClass");

// UNSUPPORTED Rust 819:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_NOWORKGROUPCONTENTS: windows_sys::core::PCWSTR = windows_sys::core::w!("NoWorkgroupContents");

// UNSUPPORTED Rust 820:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_OLDMSDOSVER: windows_sys::core::PCWSTR = windows_sys::core::w!("OldMSDOSVer");

// UNSUPPORTED Rust 821:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_OLDWINDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("OldWinDir");

// UNSUPPORTED Rust 822:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_OPTIMIZESFN: windows_sys::core::PCWSTR = windows_sys::core::w!("OptimizeSFN");

// UNSUPPORTED Rust 823:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_OPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("Options");

// UNSUPPORTED Rust 824:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_OPTORDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Order");

// UNSUPPORTED Rust 825:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_P1284MDL: windows_sys::core::PCWSTR = windows_sys::core::w!("Model");

// UNSUPPORTED Rust 826:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_P1284MFG: windows_sys::core::PCWSTR = windows_sys::core::w!("Manufacturer");

// UNSUPPORTED Rust 827:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PATHCACHECOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("PathCache");

// UNSUPPORTED Rust 828:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCCARD_POWER: windows_sys::core::PCWSTR = windows_sys::core::w!("EnablePowerManagement");

// UNSUPPORTED Rust 829:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCI: windows_sys::core::PCWSTR = windows_sys::core::w!("PCI");

// UNSUPPORTED Rust 830:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCIBIOSVER: windows_sys::core::PCWSTR = windows_sys::core::w!("PCIBIOSVer");

// UNSUPPORTED Rust 831:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCICIRQMAP: windows_sys::core::PCWSTR = windows_sys::core::w!("PCICIRQMap");

// UNSUPPORTED Rust 832:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCICOPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("PCICOptions");

// UNSUPPORTED Rust 833:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCMCIA_ALLOC: windows_sys::core::PCWSTR = windows_sys::core::w!("AllocMemWin");

// UNSUPPORTED Rust 834:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCMCIA_ATAD: windows_sys::core::PCWSTR = windows_sys::core::w!("ATADelay");

// UNSUPPORTED Rust 835:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCMCIA_MEM: windows_sys::core::PCWSTR = windows_sys::core::w!("Memory");

// UNSUPPORTED Rust 836:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCMCIA_OPT: windows_sys::core::PCWSTR = windows_sys::core::w!("Options");

// UNSUPPORTED Rust 837:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCMCIA_SIZ: windows_sys::core::PCWSTR = windows_sys::core::w!("MinRegionSize");

// UNSUPPORTED Rust 838:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCMTDRIVER: windows_sys::core::PCWSTR = windows_sys::core::w!("MTD");

// UNSUPPORTED Rust 839:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PCSSDRIVER: windows_sys::core::PCWSTR = windows_sys::core::w!("Driver");

// UNSUPPORTED Rust 840:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PHYSICALDEVICEOBJECT: windows_sys::core::PCWSTR = windows_sys::core::w!("PhysicalDeviceObject");

// UNSUPPORTED Rust 841:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PMODE_INT13: windows_sys::core::PCWSTR = windows_sys::core::w!("PModeInt13");

// UNSUPPORTED Rust 842:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PNPBIOSVER: windows_sys::core::PCWSTR = windows_sys::core::w!("PnPBIOSVer");

// UNSUPPORTED Rust 843:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PNPSTRUCOFFSET: windows_sys::core::PCWSTR = windows_sys::core::w!("PnPStrucOffset");

// UNSUPPORTED Rust 844:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("Policy");

// UNSUPPORTED Rust 845:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_POLLING: windows_sys::core::PCWSTR = windows_sys::core::w!("Polling");

// UNSUPPORTED Rust 846:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PORTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PortName");

// UNSUPPORTED Rust 847:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PORTSUBCLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("PortSubClass");

// UNSUPPORTED Rust 848:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PREFREDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("PreferredRedir");

// UNSUPPORTED Rust 849:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRESERVECASE: windows_sys::core::PCWSTR = windows_sys::core::w!("PreserveCase");

// UNSUPPORTED Rust 850:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRESERVELONGNAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("PreserveLongNames");

// UNSUPPORTED Rust 851:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRINTERS_HIDETABS: windows_sys::core::PCWSTR = windows_sys::core::w!("NoPrinterTabs");

// UNSUPPORTED Rust 852:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRINTERS_MASK: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintersMask");

// UNSUPPORTED Rust 853:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRINTERS_NOADD: windows_sys::core::PCWSTR = windows_sys::core::w!("NoAddPrinter");

// UNSUPPORTED Rust 854:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRINTERS_NODELETE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDeletePrinter");

// UNSUPPORTED Rust 855:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRINTSHARING: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintSharing");

// UNSUPPORTED Rust 856:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Priority");

// UNSUPPORTED Rust 857:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRIVATE: windows_sys::core::PCWSTR = windows_sys::core::w!("Private");

// UNSUPPORTED Rust 858:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRIVATEFUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("PrivateFunc");

// UNSUPPORTED Rust 859:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRIVATEPROBLEM: windows_sys::core::PCWSTR = windows_sys::core::w!("PrivateProblem");

// UNSUPPORTED Rust 860:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRODUCTID: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductId");

// UNSUPPORTED Rust 861:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PRODUCTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductType");

// UNSUPPORTED Rust 862:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PROFILEFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ProfileFlags");

// UNSUPPORTED Rust 863:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Properties");

// UNSUPPORTED Rust 864:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PROTINIPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("ProtIniPath");

// UNSUPPORTED Rust 865:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PROVIDER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderName");

// UNSUPPORTED Rust 866:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDEXPIRATION: windows_sys::core::PCWSTR = windows_sys::core::w!("PwdExpiration");

// UNSUPPORTED Rust 867:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDPROVIDER_CHANGEORDER: windows_sys::core::PCWSTR = windows_sys::core::w!("ChangeOrder");

// UNSUPPORTED Rust 868:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDPROVIDER_CHANGEPWD: windows_sys::core::PCWSTR = windows_sys::core::w!("ChangePassword");

// UNSUPPORTED Rust 869:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDPROVIDER_CHANGEPWDHWND: windows_sys::core::PCWSTR = windows_sys::core::w!("ChangePasswordHwnd");

// UNSUPPORTED Rust 870:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDPROVIDER_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 871:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDPROVIDER_GETPWDSTATUS: windows_sys::core::PCWSTR = windows_sys::core::w!("GetPasswordStatus");

// UNSUPPORTED Rust 872:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDPROVIDER_ISNP: windows_sys::core::PCWSTR = windows_sys::core::w!("NetworkProvider");

// UNSUPPORTED Rust 873:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_PWDPROVIDER_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderPath");

// UNSUPPORTED Rust 874:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RDINTTHRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("RDIntThreshold");

// UNSUPPORTED Rust 875:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_READAHEADTHRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("ReadAheadThreshold");

// UNSUPPORTED Rust 876:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_READCACHING: windows_sys::core::PCWSTR = windows_sys::core::w!("ReadCaching");

// UNSUPPORTED Rust 877:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REALNETSTART: windows_sys::core::PCWSTR = windows_sys::core::w!("RealNetStart");

// UNSUPPORTED Rust 878:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REASONCODE: windows_sys::core::PCWSTR = windows_sys::core::w!("ReasonCode");

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REFRESHRATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RefreshRate");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REGITEMDELETEMESSAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Removal Message");

// UNSUPPORTED Rust 881:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REGORGANIZATION: windows_sys::core::PCWSTR = windows_sys::core::w!("RegisteredOrganization");

// UNSUPPORTED Rust 882:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REGOWNER: windows_sys::core::PCWSTR = windows_sys::core::w!("RegisteredOwner");

// UNSUPPORTED Rust 883:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REINSTALL_DEVICEINSTANCEIDS: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceInstanceIds");

// UNSUPPORTED Rust 884:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REINSTALL_DISPLAYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisplayName");

// UNSUPPORTED Rust 885:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REINSTALL_STRING: windows_sys::core::PCWSTR = windows_sys::core::w!("ReinstallString");

// UNSUPPORTED Rust 886:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REMOTE_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("RemotePath");

// UNSUPPORTED Rust 887:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REMOVABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Removable");

// UNSUPPORTED Rust 888:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REMOVAL_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("RemovalPolicy");

// UNSUPPORTED Rust 889:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REMOVEROMOKAY: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoveRomOkay");

// UNSUPPORTED Rust 890:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REMOVEROMOKAYFUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoveRomOkayFunc");

// UNSUPPORTED Rust 891:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESERVED_DEVNODE: windows_sys::core::PCWSTR = windows_sys::core::w!("HTREE\\RESERVED\\0");

// UNSUPPORTED Rust 892:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESOLUTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Resolution");

// UNSUPPORTED Rust 893:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESOURCES: windows_sys::core::PCWSTR = windows_sys::core::w!("Resources");

// UNSUPPORTED Rust 894:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESOURCE_MAP: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourceMap");

// UNSUPPORTED Rust 895:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESOURCE_PICKER_EXCEPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourcePickerExceptions");

// UNSUPPORTED Rust 896:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESOURCE_PICKER_TAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourcePickerTags");

// UNSUPPORTED Rust 897:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESTRICTRUN: windows_sys::core::PCWSTR = windows_sys::core::w!("RestrictRun");

// UNSUPPORTED Rust 898:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RESUMERESET: windows_sys::core::PCWSTR = windows_sys::core::w!("ResumeReset");

// UNSUPPORTED Rust 899:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REVISION: windows_sys::core::PCWSTR = windows_sys::core::w!("Revision");

// UNSUPPORTED Rust 900:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_REVLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("RevisionLevel");

// UNSUPPORTED Rust 901:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_ROOT_DEVNODE: windows_sys::core::PCWSTR = windows_sys::core::w!("HTREE\\ROOT\\0");

// UNSUPPORTED Rust 902:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_RUNLOGINSCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("ProcessLoginScript");

// UNSUPPORTED Rust 903:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SCANNER: windows_sys::core::PCWSTR = windows_sys::core::w!("SCANNER");

// UNSUPPORTED Rust 904:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SCAN_ONLY_FIRST: windows_sys::core::PCWSTR = windows_sys::core::w!("ScanOnlyFirstDrive");

// UNSUPPORTED Rust 905:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SCSI: windows_sys::core::PCWSTR = windows_sys::core::w!("SCSI\\");

// UNSUPPORTED Rust 906:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SCSILUN: windows_sys::core::PCWSTR = windows_sys::core::w!("SCSILUN");

// UNSUPPORTED Rust 907:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SCSITID: windows_sys::core::PCWSTR = windows_sys::core::w!("SCSITargetID");

// UNSUPPORTED Rust 908:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SEARCHMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("SearchMode");

// UNSUPPORTED Rust 909:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SEARCHOPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("SearchOptions");

// UNSUPPORTED Rust 910:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SECCPL_NOADMINPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoAdminPage");

// UNSUPPORTED Rust 911:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SECCPL_NOPROFILEPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoProfilePage");

// UNSUPPORTED Rust 912:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SECCPL_NOPWDPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoPwdPage");

// UNSUPPORTED Rust 913:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SECCPL_NOSECCPL: windows_sys::core::PCWSTR = windows_sys::core::w!("NoSecCPL");

// UNSUPPORTED Rust 914:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("Service");

// UNSUPPORTED Rust 915:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SETUPFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("SetupFlags");

// UNSUPPORTED Rust 916:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SETUPMACHINETYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("SetupMachineType");

// UNSUPPORTED Rust 917:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SETUPN: windows_sys::core::PCWSTR = windows_sys::core::w!("SetupN");

// UNSUPPORTED Rust 918:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SETUPNPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("SetupNPath");

// UNSUPPORTED Rust 919:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SETUPPROGRAMRAN: windows_sys::core::PCWSTR = windows_sys::core::w!("SetupProgramRan");

// UNSUPPORTED Rust 920:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHARES_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

// UNSUPPORTED Rust 921:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHARES_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Path");

// UNSUPPORTED Rust 922:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHARES_REMARK: windows_sys::core::PCWSTR = windows_sys::core::w!("Remark");

// UNSUPPORTED Rust 923:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHARES_RO_PASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Parm2");

// UNSUPPORTED Rust 924:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHARES_RW_PASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Parm1");

// UNSUPPORTED Rust 925:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHARES_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("Type");

// UNSUPPORTED Rust 926:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHARE_IRQ: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceIRQSharing");

// UNSUPPORTED Rust 927:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHELLVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("ShellVersion");

// UNSUPPORTED Rust 928:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHOWDOTS: windows_sys::core::PCWSTR = windows_sys::core::w!("ShowDots");

// UNSUPPORTED Rust 929:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHOWREASONUI: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownReasonUI");

// UNSUPPORTED Rust 930:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWNREASON: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownReason");

// UNSUPPORTED Rust 931:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWNREASON_CODE: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownReasonCode");

// UNSUPPORTED Rust 932:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWNREASON_COMMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownReasonComment");

// UNSUPPORTED Rust 933:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWNREASON_PROCESS: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownReasonProcess");

// UNSUPPORTED Rust 934:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWNREASON_USERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownReasonUserName");

// UNSUPPORTED Rust 935:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWN_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownFlags");

// UNSUPPORTED Rust 936:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWN_IGNORE_PREDEFINED: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownIgnorePredefinedReasons");

// UNSUPPORTED Rust 937:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SHUTDOWN_STATE_SNAPSHOT: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownStateSnapshot");

// UNSUPPORTED Rust 938:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SILENTINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("SilentInstall");

// UNSUPPORTED Rust 939:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SLSUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("SLSupport");

// UNSUPPORTED Rust 940:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SOFTCOMPATMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftCompatMode");

// UNSUPPORTED Rust 941:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SRCPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("SourcePath");

// UNSUPPORTED Rust 942:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SRVNAMECACHE: windows_sys::core::PCWSTR = windows_sys::core::w!("ServerNameCache");

// UNSUPPORTED Rust 943:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SRVNAMECACHECOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("ServerNameCacheMax");

// UNSUPPORTED Rust 944:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SRVNAMECACHENETPROV: windows_sys::core::PCWSTR = windows_sys::core::w!("ServerNameCacheNumNets");

// UNSUPPORTED Rust 945:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_START_ON_BOOT: windows_sys::core::PCWSTR = windows_sys::core::w!("StartOnBoot");

// UNSUPPORTED Rust 946:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_STAT: windows_sys::core::PCWSTR = windows_sys::core::w!("Status");

// UNSUPPORTED Rust 947:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_STATICDRIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("StaticDrive");

// UNSUPPORTED Rust 948:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_STATICVXD: windows_sys::core::PCWSTR = windows_sys::core::w!("StaticVxD");

// UNSUPPORTED Rust 949:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_STDDOSOPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("StdOption");

// UNSUPPORTED Rust 950:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SUBMODEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Submodel");

// UNSUPPORTED Rust 951:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SUPPORTBURST: windows_sys::core::PCWSTR = windows_sys::core::w!("SupportBurst");

// UNSUPPORTED Rust 952:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SUPPORTLFN: windows_sys::core::PCWSTR = windows_sys::core::w!("SupportLFN");

// UNSUPPORTED Rust 953:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SUPPORTTUNNELLING: windows_sys::core::PCWSTR = windows_sys::core::w!("SupportTunnelling");

// UNSUPPORTED Rust 954:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYMBOLIC_LINK: windows_sys::core::PCWSTR = windows_sys::core::w!("SymbolicLink");

// UNSUPPORTED Rust 955:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYNCDATAXFER: windows_sys::core::PCWSTR = windows_sys::core::w!("SyncDataXfer");

// UNSUPPORTED Rust 956:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSDM: windows_sys::core::PCWSTR = windows_sys::core::w!("SysDM");

// UNSUPPORTED Rust 957:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSDMFUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("SysDMFunc");

// UNSUPPORTED Rust 958:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTEMCPL_NOCONFIGPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoConfigPage");

// UNSUPPORTED Rust 959:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTEMCPL_NODEVMGRPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoDevMgrPage");

// UNSUPPORTED Rust 960:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTEMCPL_NOFILESYSPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoFileSysPage");

// UNSUPPORTED Rust 961:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTEMCPL_NOVIRTMEMPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoVirtMemPage");

// UNSUPPORTED Rust 962:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTEMROOT: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemRoot");

// UNSUPPORTED Rust 963:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTRAYBATFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("PowerFlags");

// UNSUPPORTED Rust 964:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTRAYPCCARDFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("PCMCIAFlags");

// UNSUPPORTED Rust 965:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_SYSTRAYSVCS: windows_sys::core::PCWSTR = windows_sys::core::w!("Services");

// UNSUPPORTED Rust 966:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TABLE_STAT: windows_sys::core::PCWSTR = windows_sys::core::w!("TableStatus");

// UNSUPPORTED Rust 967:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TAPE: windows_sys::core::PCWSTR = windows_sys::core::w!("TAPE");

// UNSUPPORTED Rust 968:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TRANSITION: windows_sys::core::PCWSTR = windows_sys::core::w!("Transition");

// UNSUPPORTED Rust 969:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TRANSPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("Transport");

// UNSUPPORTED Rust 970:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZACTBIAS: windows_sys::core::PCWSTR = windows_sys::core::w!("ActiveTimeBias");

// UNSUPPORTED Rust 971:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZBIAS: windows_sys::core::PCWSTR = windows_sys::core::w!("Bias");

// UNSUPPORTED Rust 972:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZDLTBIAS: windows_sys::core::PCWSTR = windows_sys::core::w!("DaylightBias");

// UNSUPPORTED Rust 973:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZDLTFLAG: windows_sys::core::PCWSTR = windows_sys::core::w!("DaylightFlag");

// UNSUPPORTED Rust 974:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZDLTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DaylightName");

// UNSUPPORTED Rust 975:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZDLTSTART: windows_sys::core::PCWSTR = windows_sys::core::w!("DaylightStart");

// UNSUPPORTED Rust 976:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZNOAUTOTIME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableAutoDaylightTimeSet");

// UNSUPPORTED Rust 977:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZNOCHANGEEND: windows_sys::core::PCWSTR = windows_sys::core::w!("NoChangeEnd");

// UNSUPPORTED Rust 978:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZNOCHANGESTART: windows_sys::core::PCWSTR = windows_sys::core::w!("NoChangeStart");

// UNSUPPORTED Rust 979:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZSTDBIAS: windows_sys::core::PCWSTR = windows_sys::core::w!("StandardBias");

// UNSUPPORTED Rust 980:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZSTDNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("StandardName");

// UNSUPPORTED Rust 981:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_TZSTDSTART: windows_sys::core::PCWSTR = windows_sys::core::w!("StandardStart");

// UNSUPPORTED Rust 982:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UI_NUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("UINumber");

// UNSUPPORTED Rust 983:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UI_NUMBER_DESC_FORMAT: windows_sys::core::PCWSTR = windows_sys::core::w!("UINumberDescFormat");

// UNSUPPORTED Rust 984:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UNDOCK_WITHOUT_LOGON: windows_sys::core::PCWSTR = windows_sys::core::w!("UndockWithoutLogon");

// UNSUPPORTED Rust 985:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UNINSTALLER_COMMANDLINE: windows_sys::core::PCWSTR = windows_sys::core::w!("UninstallString");

// UNSUPPORTED Rust 986:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UNINSTALLER_DISPLAYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisplayName");

// UNSUPPORTED Rust 987:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UPGRADE: windows_sys::core::PCWSTR = windows_sys::core::w!("Upgrade");

// UNSUPPORTED Rust 988:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UPPERFILTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("UpperFilters");

// UNSUPPORTED Rust 989:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UPPER_FILTER_DEFAULT_LEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("UpperFilterDefaultLevel");

// UNSUPPORTED Rust 990:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_UPPER_FILTER_LEVELS: windows_sys::core::PCWSTR = windows_sys::core::w!("UpperFilterLevels");

// UNSUPPORTED Rust 991:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_USERSETTINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("AdapterSettings");

// UNSUPPORTED Rust 992:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_USER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("UserName");

// UNSUPPORTED Rust 993:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_USRDRVLET: windows_sys::core::PCWSTR = windows_sys::core::w!("UserDriveLetterAssignment");

// UNSUPPORTED Rust 994:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VDD: windows_sys::core::PCWSTR = windows_sys::core::w!("vdd");

// UNSUPPORTED Rust 995:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VER: windows_sys::core::PCWSTR = windows_sys::core::w!("Ver");

// UNSUPPORTED Rust 996:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VERIFYKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("VerifyKey");

// UNSUPPORTED Rust 997:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VIRTUALHDIRQ: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualHDIRQ");

// UNSUPPORTED Rust 998:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VOLIDLETIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("VolumeIdleTimeout");

// UNSUPPORTED Rust 999:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VPOWERDFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

// UNSUPPORTED Rust 1000:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VRES: windows_sys::core::PCWSTR = windows_sys::core::w!("VRes");

// UNSUPPORTED Rust 1001:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_VXDGROUPS: windows_sys::core::PCWSTR = windows_sys::core::w!("VXDGroups");

// UNSUPPORTED Rust 1002:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WAITFORUNDOCK: windows_sys::core::PCWSTR = windows_sys::core::w!("WaitForUndock");

// UNSUPPORTED Rust 1003:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WAITFORUNDOCKFUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("WaitForUndockFunc");

// UNSUPPORTED Rust 1004:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WIN31FILESYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("Win31FileSystem");

// UNSUPPORTED Rust 1005:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WIN31PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Win31Provider");

// UNSUPPORTED Rust 1006:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WINBOOTDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("WinbootDir");

// UNSUPPORTED Rust 1007:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WINCP: windows_sys::core::PCWSTR = windows_sys::core::w!("ACP");

// UNSUPPORTED Rust 1008:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WINDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("WinDir");

// UNSUPPORTED Rust 1009:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WINOLDAPP_DISABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Disabled");

// UNSUPPORTED Rust 1010:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WINOLDAPP_NOREALMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("NoRealMode");

// UNSUPPORTED Rust 1011:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WORKGROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("Workgroup");

// UNSUPPORTED Rust 1012:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WRAPPER: windows_sys::core::PCWSTR = windows_sys::core::w!("Wrapper");

// UNSUPPORTED Rust 1013:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WRINTTHRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("WRIntThreshold");

// UNSUPPORTED Rust 1014:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WRKGRP_FORCEMAPPING: windows_sys::core::PCWSTR = windows_sys::core::w!("WrkgrpForceMapping");

// UNSUPPORTED Rust 1015:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REGSTR_VAL_WRKGRP_REQUIRED: windows_sys::core::PCWSTR = windows_sys::core::w!("WrkgrpRequired");

public const val `REG_BINARY`: `REG_VALUE_TYPE` = 3u;
public const val `REG_CREATED_NEW_KEY`: `REG_CREATE_KEY_DISPOSITION` = 1u;
public typealias `REG_CREATE_KEY_DISPOSITION` = UInt;
public const val `REG_DWORD`: `REG_VALUE_TYPE` = 4u;
public const val `REG_DWORD_BIG_ENDIAN`: `REG_VALUE_TYPE` = 5u;
public const val `REG_DWORD_LITTLE_ENDIAN`: `REG_VALUE_TYPE` = 4u;
public const val `REG_EXPAND_SZ`: `REG_VALUE_TYPE` = 2u;
public const val `REG_FORCE_RESTORE`: `REG_RESTORE_KEY_FLAGS` = 8;
public const val `REG_FULL_RESOURCE_DESCRIPTOR`: `REG_VALUE_TYPE` = 9u;
// UNSUPPORTED Rust 1025:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REG_KEY_INSTDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Installed");

public const val `REG_LATEST_FORMAT`: `REG_SAVE_FORMAT` = 2u;
public const val `REG_LINK`: `REG_VALUE_TYPE` = 6u;
public const val `REG_MUI_STRING_TRUNCATE`: UInt = 1u;
public const val `REG_MULTI_SZ`: `REG_VALUE_TYPE` = 7u;
public const val `REG_NONE`: `REG_VALUE_TYPE` = 0u;
public const val `REG_NOTIFY_CHANGE_ATTRIBUTES`: `REG_NOTIFY_FILTER` = 2u;
public const val `REG_NOTIFY_CHANGE_LAST_SET`: `REG_NOTIFY_FILTER` = 4u;
public const val `REG_NOTIFY_CHANGE_NAME`: `REG_NOTIFY_FILTER` = 1u;
public const val `REG_NOTIFY_CHANGE_SECURITY`: `REG_NOTIFY_FILTER` = 8u;
public typealias `REG_NOTIFY_FILTER` = UInt;
public const val `REG_NOTIFY_THREAD_AGNOSTIC`: `REG_NOTIFY_FILTER` = 268435456u;
public const val `REG_NO_COMPRESSION`: `REG_SAVE_FORMAT` = 4u;
public const val `REG_OPENED_EXISTING_KEY`: `REG_CREATE_KEY_DISPOSITION` = 2u;
public typealias `REG_OPEN_CREATE_OPTIONS` = UInt;
public const val `REG_OPTION_BACKUP_RESTORE`: `REG_OPEN_CREATE_OPTIONS` = 4u;
public const val `REG_OPTION_CREATE_LINK`: `REG_OPEN_CREATE_OPTIONS` = 2u;
public const val `REG_OPTION_DONT_VIRTUALIZE`: `REG_OPEN_CREATE_OPTIONS` = 16u;
public const val `REG_OPTION_NON_VOLATILE`: `REG_OPEN_CREATE_OPTIONS` = 0u;
public const val `REG_OPTION_OPEN_LINK`: `REG_OPEN_CREATE_OPTIONS` = 8u;
public const val `REG_OPTION_RESERVED`: `REG_OPEN_CREATE_OPTIONS` = 0u;
public const val `REG_OPTION_VOLATILE`: `REG_OPEN_CREATE_OPTIONS` = 1u;
public const val `REG_PROCESS_APPKEY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REG_PROVIDER` (
    public var `pi_R0_1val`: `PQUERYHANDLER`,
    public var `pi_R0_allvals`: `PQUERYHANDLER`,
    public var `pi_R3_1val`: `PQUERYHANDLER`,
    public var `pi_R3_allvals`: `PQUERYHANDLER`,
    public var `pi_flags`: UInt,
    public var `pi_key_context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1058:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REG_PROVIDER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REG_QWORD`: `REG_VALUE_TYPE` = 11u;
public const val `REG_QWORD_LITTLE_ENDIAN`: `REG_VALUE_TYPE` = 11u;
public const val `REG_RESOURCE_LIST`: `REG_VALUE_TYPE` = 8u;
public const val `REG_RESOURCE_REQUIREMENTS_LIST`: `REG_VALUE_TYPE` = 10u;
public typealias `REG_RESTORE_KEY_FLAGS` = Int;
public typealias `REG_ROUTINE_FLAGS` = UInt;
public typealias `REG_SAM_FLAGS` = UInt;
public typealias `REG_SAVE_FORMAT` = UInt;
public const val `REG_SECURE_CONNECTION`: UInt = 1u;
public const val `REG_STANDARD_FORMAT`: `REG_SAVE_FORMAT` = 1u;
public const val `REG_SZ`: `REG_VALUE_TYPE` = 1u;
public const val `REG_USE_CURRENT_SECURITY_CONTEXT`: UInt = 2u;
public typealias `REG_VALUE_TYPE` = UInt;
public const val `REG_WHOLE_HIVE_VOLATILE`: `REG_RESTORE_KEY_FLAGS` = 1;
public const val `RRF_NOEXPAND`: `REG_ROUTINE_FLAGS` = 268435456u;
public const val `RRF_RT_ANY`: `REG_ROUTINE_FLAGS` = 65535u;
public const val `RRF_RT_DWORD`: `REG_ROUTINE_FLAGS` = 24u;
public const val `RRF_RT_QWORD`: `REG_ROUTINE_FLAGS` = 72u;
public const val `RRF_RT_REG_BINARY`: `REG_ROUTINE_FLAGS` = 8u;
public const val `RRF_RT_REG_DWORD`: `REG_ROUTINE_FLAGS` = 16u;
public const val `RRF_RT_REG_EXPAND_SZ`: `REG_ROUTINE_FLAGS` = 4u;
public const val `RRF_RT_REG_MULTI_SZ`: `REG_ROUTINE_FLAGS` = 32u;
public const val `RRF_RT_REG_NONE`: `REG_ROUTINE_FLAGS` = 1u;
public const val `RRF_RT_REG_QWORD`: `REG_ROUTINE_FLAGS` = 64u;
public const val `RRF_RT_REG_SZ`: `REG_ROUTINE_FLAGS` = 2u;
public const val `RRF_SUBKEY_WOW6432KEY`: `REG_ROUTINE_FLAGS` = 131072u;
public const val `RRF_SUBKEY_WOW6464KEY`: `REG_ROUTINE_FLAGS` = 65536u;
public const val `RRF_WOW64_MASK`: `REG_ROUTINE_FLAGS` = 196608u;
public const val `RRF_ZEROONFAILURE`: `REG_ROUTINE_FLAGS` = 536870912u;
public const val `SUF_BATCHINF`: Int = 4;
public const val `SUF_CLEAN`: Int = 8;
public const val `SUF_EXPRESS`: Int = 2;
public const val `SUF_FIRSTTIME`: Int = 1;
public const val `SUF_INSETUP`: Int = 16;
public const val `SUF_NETHDBOOT`: Int = 64;
public const val `SUF_NETRPLBOOT`: Int = 128;
public const val `SUF_NETSETUP`: Int = 32;
public const val `SUF_SBSCOPYOK`: Int = 256;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VALENTA` (
    public var `ve_valuename`: `windows_sys`.`core`.`PSTR`,
    public var `ve_valuelen`: UInt,
    public var `ve_valueptr`: ULong,
    public var `ve_type`: `REG_VALUE_TYPE`,
)
// UNSUPPORTED Rust 1109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VALENTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VALENTW` (
    public var `ve_valuename`: `windows_sys`.`core`.`PWSTR`,
    public var `ve_valuelen`: UInt,
    public var `ve_valueptr`: ULong,
    public var `ve_type`: `REG_VALUE_TYPE`,
)
// UNSUPPORTED Rust 1122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VALENTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VPDF_DISABLEPWRMGMT`: UInt = 1u;
public const val `VPDF_DISABLEPWRSTATUSPOLL`: UInt = 8u;
public const val `VPDF_DISABLERINGRESUME`: UInt = 16u;
public const val `VPDF_FORCEAPM10MODE`: UInt = 2u;
public const val `VPDF_SHOWMULTIBATT`: UInt = 32u;
public const val `VPDF_SKIPINTELSLCHECK`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `val_context` (
    public var `valuelen`: Int,
    public var `value_context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `val_buff_ptr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1140:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for val_context {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

