// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CLRCreateInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLRCreateInstance`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppinterface` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CallFunctionShim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallFunctionShim`(`szdllname` : `windows_sys`.`core`.`PCWSTR`, `szfunctionname` : `windows_sys`.`core`.`PCSTR`, `lpvargument1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpvargument2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szversion` : `windows_sys`.`core`.`PCWSTR`, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=ClrCreateManagedInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClrCreateManagedInstance`(`ptypename` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorBindToCurrentRuntime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorBindToCurrentRuntime`(`pwszfilename` : `windows_sys`.`core`.`PCWSTR`, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorBindToRuntime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorBindToRuntime`(`pwszversion` : `windows_sys`.`core`.`PCWSTR`, `pwszbuildflavor` : `windows_sys`.`core`.`PCWSTR`, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorBindToRuntimeByCfg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `CorBindToRuntimeByCfg`(`pcfgstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reserved` : UInt, `startupflags` : UInt, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorBindToRuntimeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorBindToRuntimeEx`(`pwszversion` : `windows_sys`.`core`.`PCWSTR`, `pwszbuildflavor` : `windows_sys`.`core`.`PCWSTR`, `startupflags` : UInt, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorBindToRuntimeHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorBindToRuntimeHost`(`pwszversion` : `windows_sys`.`core`.`PCWSTR`, `pwszbuildflavor` : `windows_sys`.`core`.`PCWSTR`, `pwszhostconfigfile` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `startupflags` : UInt, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorExitProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorExitProcess`(`exitcode` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorLaunchApplication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public external fun `CorLaunchApplication`(`dwclickoncehost` : `HOST_TYPE`, `pwzappfullname` : `windows_sys`.`core`.`PCWSTR`, `dwmanifestpaths` : UInt, `ppwzmanifestpaths` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `dwactivationdata` : UInt, `ppwzactivationdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `lpprocessinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Threading`.`PROCESS_INFORMATION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CorMarkThreadInThreadPool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CorMarkThreadInThreadPool`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=CreateDebuggingInterfaceFromVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateDebuggingInterfaceFromVersion`(`idebuggerversion` : Int, `szdebuggeeversion` : `windows_sys`.`core`.`PCWSTR`, `ppcordb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetCLRIdentityManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCLRIdentityManager`(`riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppmanager` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetCORRequiredVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCORRequiredVersion`(`pbuffer` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetCORSystemDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCORSystemDirectory`(`pbuffer` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetCORVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCORVersion`(`pbbuffer` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetFileVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersion`(`szfilename` : `windows_sys`.`core`.`PCWSTR`, `szbuffer` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetRealProcAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRealProcAddress`(`pwszprocname` : `windows_sys`.`core`.`PCSTR`, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetRequestedRuntimeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRequestedRuntimeInfo`(`pexe` : `windows_sys`.`core`.`PCWSTR`, `pwszversion` : `windows_sys`.`core`.`PCWSTR`, `pconfigurationfile` : `windows_sys`.`core`.`PCWSTR`, `startupflags` : UInt, `runtimeinfoflags` : UInt, `pdirectory` : `windows_sys`.`core`.`PWSTR`, `dwdirectory` : UInt, `dwdirectorylength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pversion` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetRequestedRuntimeVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRequestedRuntimeVersion`(`pexe` : `windows_sys`.`core`.`PCWSTR`, `pversion` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetRequestedRuntimeVersionForCLSID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRequestedRuntimeVersionForCLSID`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pversion` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwresolutionflags` : `CLSID_RESOLUTION_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=GetVersionFromProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersionFromProcess`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `pversion` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `dwlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=LoadLibraryShim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadLibraryShim`(`szdllname` : `windows_sys`.`core`.`PCWSTR`, `szversion` : `windows_sys`.`core`.`PCWSTR`, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phmoddll` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HMODULE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=LoadStringRC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadStringRC`(`iresouceid` : UInt, `szbuffer` : `windows_sys`.`core`.`PWSTR`, `imax` : Int, `bquiet` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=LoadStringRCEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadStringRCEx`(`lcid` : UInt, `iresouceid` : UInt, `szbuffer` : `windows_sys`.`core`.`PWSTR`, `imax` : Int, `bquiet` : Int, `pcwchused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=LockClrVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LockClrVersion`(`hostcallback` : `FLockClrVersionCallback`, `pbeginhostsetup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLockClrVersionCallback`>?, `pendhostsetup` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FLockClrVersionCallback`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mscoree.dll, ABI=system, export=RunDll32ShimW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RunDll32ShimW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpszcmdline` : `windows_sys`.`core`.`PCWSTR`, `ncmdshow` : Int) : `windows_sys`.`core`.`HRESULT`
public const val `APPDOMAIN_FORCE_TRIVIAL_WAIT_OPERATIONS`: `APPDOMAIN_SECURITY_FLAGS` = 8;
public const val `APPDOMAIN_SECURITY_DEFAULT`: `APPDOMAIN_SECURITY_FLAGS` = 0;
public typealias `APPDOMAIN_SECURITY_FLAGS` = Int;
public const val `APPDOMAIN_SECURITY_FORBID_CROSSAD_REVERSE_PINVOKE`: `APPDOMAIN_SECURITY_FLAGS` = 2;
public const val `APPDOMAIN_SECURITY_SANDBOXED`: `APPDOMAIN_SECURITY_FLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AssemblyBindInfo` (
    public var `dwAppDomainId`: UInt,
    public var `lpReferencedIdentity`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpPostPolicyIdentity`: `windows_sys`.`core`.`PCWSTR`,
    public var `ePolicyLevel`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AssemblyBindInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AssemblyBindInfo`.Companion.`default`() : `AssemblyBindInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `BucketParamLength`: UInt = 255u;
public typealias `BucketParameterIndex` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2550 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BucketParameters` (
    public var `fInited`: `windows_sys`.`core`.`BOOL`,
    public var `pszEventTypeName`: UShortArray,
    public var `pszParams`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `BucketParameters`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `BucketParameters`.Companion.`default`() : `BucketParameters` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `BucketParamsCount`: UInt = 10u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CLRCreateInstanceFnPtr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// UNSUPPORTED Rust 64:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLRRuntimeHost: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90f1a06e_7712_4762_86b5_7a5eba6bdb02);

public const val `CLR_ASSEMBLY_BUILD_VERSION`: UInt = 0u;
public const val `CLR_ASSEMBLY_IDENTITY_FLAGS_DEFAULT`: `ECLRAssemblyIdentityFlags` = 0;
public const val `CLR_ASSEMBLY_MAJOR_VERSION`: UInt = 4u;
public const val `CLR_ASSEMBLY_MINOR_VERSION`: UInt = 0u;
public const val `CLR_BUILD_VERSION`: UInt = 22220u;
public const val `CLR_DEBUGGING_MANAGED_EVENT_DEBUGGER_LAUNCH`: `CLR_DEBUGGING_PROCESS_FLAGS` = 2;
public const val `CLR_DEBUGGING_MANAGED_EVENT_PENDING`: `CLR_DEBUGGING_PROCESS_FLAGS` = 1;
public typealias `CLR_DEBUGGING_PROCESS_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLR_DEBUGGING_VERSION` (
    public var `wStructVersion`: UShort,
    public var `wMajor`: UShort,
    public var `wMinor`: UShort,
    public var `wBuild`: UShort,
    public var `wRevision`: UShort,
)
public const val `CLR_MAJOR_VERSION`: UInt = 4u;
public const val `CLR_MINOR_VERSION`: UInt = 0u;
// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_CLRDebugging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbacc578d_fbdd_48a4_969f_02d932b74634);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_CLRDebuggingLegacy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf8395b5_a4ba_450b_a77c_a9a47762c520);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_CLRMetaHost: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9280188d_0e8e_4867_b30c_7fa83884e8de);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_CLRMetaHostPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ebcd49a_1b47_4a61_b13a_4a03701e594b);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_CLRProfiling: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd097ed8_733e_43fe_8ed7_a95ff9a8448c);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_CLRStrongName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb79b0acd_f5cd_409b_b5a5_a16244610b92);

public const val `CLSID_RESOLUTION_DEFAULT`: `CLSID_RESOLUTION_FLAGS` = 0;
public typealias `CLSID_RESOLUTION_FLAGS` = Int;
public const val `CLSID_RESOLUTION_REGISTERED`: `CLSID_RESOLUTION_FLAGS` = 1;
public const val `COR_GC_COUNTS`: `COR_GC_STAT_TYPES` = 1;
public const val `COR_GC_MEMORYUSAGE`: `COR_GC_STAT_TYPES` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COR_GC_STATS` (
    public var `Flags`: UInt,
    public var `ExplicitGCCount`: ULong,
    public var `GenCollectionsTaken`: ULongArray,
    public var `CommittedKBytes`: ULong,
    public var `ReservedKBytes`: ULong,
    public var `Gen0HeapSizeKBytes`: ULong,
    public var `Gen1HeapSizeKBytes`: ULong,
    public var `Gen2HeapSizeKBytes`: ULong,
    public var `LargeObjectHeapSizeKBytes`: ULong,
    public var `KBytesPromotedFromGen0`: ULong,
    public var `KBytesPromotedFromGen1`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `COR_GC_STATS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `COR_GC_STATS`.Companion.`default`() : `COR_GC_STATS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `COR_GC_STAT_TYPES` = Int;
public const val `COR_GC_THREAD_HAS_PROMOTED_BYTES`: `COR_GC_THREAD_STATS_TYPES` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COR_GC_THREAD_STATS` (
    public var `PerThreadAllocation`: ULong,
    public var `Flags`: UInt,
)
public typealias `COR_GC_THREAD_STATS_TYPES` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CallbackThreadSetFnPtr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CallbackThreadUnsetFnPtr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`HRESULT`>>>;
// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ComCallUnmarshal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f281000_e95a_11d2_886b_00c04f869f04);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ComCallUnmarshalV4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45fb4600_e6e8_4928_b25e_50476ff79425);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CorRuntimeHost: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb2f6723_ab3a_11d2_9c40_00c04fa30a3e);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CreateInterfaceFnPtr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CustomDumpItem` (
    public var `itemKind`: `ECustomDumpItemKind`,
    public var `Anonymous`: `CustomDumpItem_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CustomDumpItem`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CustomDumpItem`.Companion.`default`() : `CustomDumpItem` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 141:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CustomDumpItem_0 {
//     pub pReserved: usize,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CustomDumpItem_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CustomDumpItem_0`.Companion.`default`() : `CustomDumpItem_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DEPRECATED_CLR_API_MESG`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("This API has been deprecated. Refer to https://go.microsoft.com/fwlink/?LinkId=143720 for more details.");
public const val `DUMP_FLAVOR_CriticalCLRState`: `ECustomDumpFlavor` = 1;
public const val `DUMP_FLAVOR_Default`: `ECustomDumpFlavor` = 0;
public const val `DUMP_FLAVOR_Mini`: `ECustomDumpFlavor` = 0;
public const val `DUMP_FLAVOR_NonHeapCLRState`: `ECustomDumpFlavor` = 2;
public const val `DUMP_ITEM_None`: `ECustomDumpItemKind` = 0;
public typealias `EApiCategories` = Int;
public typealias `EBindPolicyLevels` = Int;
public typealias `ECLRAssemblyIdentityFlags` = Int;
public typealias `EClrEvent` = Int;
public typealias `EClrFailure` = Int;
public typealias `EClrOperation` = Int;
public typealias `EClrUnhandledException` = Int;
public typealias `EContextType` = Int;
public typealias `ECustomDumpFlavor` = Int;
public typealias `ECustomDumpItemKind` = Int;
public typealias `EHostApplicationPolicy` = Int;
public typealias `EHostBindingPolicyModifyFlags` = Int;
public typealias `EInitializeNewDomainFlags` = Int;
public typealias `EMemoryAvailable` = Int;
public typealias `EMemoryCriticalLevel` = Int;
public typealias `EPolicyAction` = Int;
public typealias `ESymbolReadingPolicy` = Int;
public typealias `ETaskType` = Int;
public const val `Event_ClrDisabled`: `EClrEvent` = 1;
public const val `Event_DomainUnload`: `EClrEvent` = 0;
public const val `Event_MDAFired`: `EClrEvent` = 2;
public const val `Event_StackOverflow`: `EClrEvent` = 3;
public const val `FAIL_AccessViolation`: `EClrFailure` = 5;
public const val `FAIL_CodeContract`: `EClrFailure` = 6;
public const val `FAIL_CriticalResource`: `EClrFailure` = 1;
public const val `FAIL_FatalRuntime`: `EClrFailure` = 2;
public const val `FAIL_NonCriticalResource`: `EClrFailure` = 0;
public const val `FAIL_OrphanedLock`: `EClrFailure` = 3;
public const val `FAIL_StackOverflow`: `EClrFailure` = 4;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FExecuteInAppDomainCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FLockClrVersionCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `HOST_APPLICATION_BINDING_POLICY`: `EHostApplicationPolicy` = 1;
public const val `HOST_BINDING_POLICY_MODIFY_CHAIN`: `EHostBindingPolicyModifyFlags` = 1;
public const val `HOST_BINDING_POLICY_MODIFY_DEFAULT`: `EHostBindingPolicyModifyFlags` = 0;
public const val `HOST_BINDING_POLICY_MODIFY_MAX`: `EHostBindingPolicyModifyFlags` = 3;
public const val `HOST_BINDING_POLICY_MODIFY_REMOVE`: `EHostBindingPolicyModifyFlags` = 2;
public typealias `HOST_TYPE` = Int;
public const val `HOST_TYPE_APPLAUNCH`: `HOST_TYPE` = 1;
public const val `HOST_TYPE_CORFLAG`: `HOST_TYPE` = 2;
public const val `HOST_TYPE_DEFAULT`: `HOST_TYPE` = 0;
public const val `InvalidBucketParamIndex`: `BucketParameterIndex` = 9;
// UNSUPPORTED Rust 198:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const LIBID_mscoree: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5477469e_83b1_11d2_8b49_00a0c9b7c9c4);

public const val `MALLOC_EXECUTABLE`: `MALLOC_TYPE` = 2;
public const val `MALLOC_THREADSAFE`: `MALLOC_TYPE` = 1;
public typealias `MALLOC_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MDAInfo` (
    public var `lpMDACaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpMDAMessage`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpStackTrace`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MDAInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MDAInfo`.Companion.`default`() : `MDAInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `METAHOST_CONFIG_FLAGS` = Int;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_FALSE`: `METAHOST_CONFIG_FLAGS` = 2;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_MASK`: `METAHOST_CONFIG_FLAGS` = 3;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_TRUE`: `METAHOST_CONFIG_FLAGS` = 1;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_UNSET`: `METAHOST_CONFIG_FLAGS` = 0;
public const val `METAHOST_POLICY_APPLY_UPGRADE_POLICY`: `METAHOST_POLICY_FLAGS` = 8;
public const val `METAHOST_POLICY_EMULATE_EXE_LAUNCH`: `METAHOST_POLICY_FLAGS` = 16;
public const val `METAHOST_POLICY_ENSURE_SKU_SUPPORTED`: `METAHOST_POLICY_FLAGS` = 128;
public typealias `METAHOST_POLICY_FLAGS` = Int;
public const val `METAHOST_POLICY_HIGHCOMPAT`: `METAHOST_POLICY_FLAGS` = 0;
public const val `METAHOST_POLICY_IGNORE_ERROR_MODE`: `METAHOST_POLICY_FLAGS` = 4096;
public const val `METAHOST_POLICY_SHOW_ERROR_DIALOG`: `METAHOST_POLICY_FLAGS` = 32;
public const val `METAHOST_POLICY_USE_PROCESS_IMAGE_PATH`: `METAHOST_POLICY_FLAGS` = 64;
public const val `MaxClrEvent`: `EClrEvent` = 4;
public const val `MaxClrFailure`: `EClrFailure` = 7;
public const val `MaxClrOperation`: `EClrOperation` = 7;
public const val `MaxPolicyAction`: `EPolicyAction` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ModuleBindInfo` (
    public var `dwAppDomainId`: UInt,
    public var `lpAssemblyIdentity`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpModuleName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ModuleBindInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ModuleBindInfo`.Companion.`default`() : `ModuleBindInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `OPR_AppDomainRudeUnload`: `EClrOperation` = 4;
public const val `OPR_AppDomainUnload`: `EClrOperation` = 3;
public const val `OPR_FinalizerRun`: `EClrOperation` = 6;
public const val `OPR_ProcessExit`: `EClrOperation` = 5;
public const val `OPR_ThreadAbort`: `EClrOperation` = 0;
public const val `OPR_ThreadRudeAbortInCriticalRegion`: `EClrOperation` = 2;
public const val `OPR_ThreadRudeAbortInNonCriticalRegion`: `EClrOperation` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PTLS_CALLBACK_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `Parameter1`: `BucketParameterIndex` = 0;
public const val `Parameter2`: `BucketParameterIndex` = 1;
public const val `Parameter3`: `BucketParameterIndex` = 2;
public const val `Parameter4`: `BucketParameterIndex` = 3;
public const val `Parameter5`: `BucketParameterIndex` = 4;
public const val `Parameter6`: `BucketParameterIndex` = 5;
public const val `Parameter7`: `BucketParameterIndex` = 6;
public const val `Parameter8`: `BucketParameterIndex` = 7;
public const val `Parameter9`: `BucketParameterIndex` = 8;
public const val `RUNTIME_INFO_DONT_RETURN_DIRECTORY`: `RUNTIME_INFO_FLAGS` = 16;
public const val `RUNTIME_INFO_DONT_RETURN_VERSION`: `RUNTIME_INFO_FLAGS` = 32;
public const val `RUNTIME_INFO_DONT_SHOW_ERROR_DIALOG`: `RUNTIME_INFO_FLAGS` = 64;
public typealias `RUNTIME_INFO_FLAGS` = Int;
public const val `RUNTIME_INFO_IGNORE_ERROR_MODE`: `RUNTIME_INFO_FLAGS` = 4096;
public const val `RUNTIME_INFO_REQUEST_AMD64`: `RUNTIME_INFO_FLAGS` = 4;
public const val `RUNTIME_INFO_REQUEST_ARM64`: `RUNTIME_INFO_FLAGS` = 8192;
public const val `RUNTIME_INFO_REQUEST_IA64`: `RUNTIME_INFO_FLAGS` = 2;
public const val `RUNTIME_INFO_REQUEST_X86`: `RUNTIME_INFO_FLAGS` = 8;
public const val `RUNTIME_INFO_UPGRADE_VERSION`: `RUNTIME_INFO_FLAGS` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `RuntimeLoadedCallbackFnPtr` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `CallbackThreadSetFnPtr`, `CallbackThreadUnsetFnPtr`) -> Unit>>>;
public const val `SO_ClrEngine`: `StackOverflowType` = 1;
public const val `SO_Managed`: `StackOverflowType` = 0;
public const val `SO_Other`: `StackOverflowType` = 2;
public const val `STARTUP_ALWAYSFLOW_IMPERSONATION`: `STARTUP_FLAGS` = 262144;
public const val `STARTUP_ARM`: `STARTUP_FLAGS` = 4194304;
public const val `STARTUP_CONCURRENT_GC`: `STARTUP_FLAGS` = 1;
public const val `STARTUP_DISABLE_COMMITTHREADSTACK`: `STARTUP_FLAGS` = 131072;
public const val `STARTUP_ETW`: `STARTUP_FLAGS` = 1048576;
public typealias `STARTUP_FLAGS` = Int;
public const val `STARTUP_HOARD_GC_VM`: `STARTUP_FLAGS` = 8192;
public const val `STARTUP_LEGACY_IMPERSONATION`: `STARTUP_FLAGS` = 65536;
public const val `STARTUP_LOADER_OPTIMIZATION_MASK`: `STARTUP_FLAGS` = 6;
public const val `STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN`: `STARTUP_FLAGS` = 4;
public const val `STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN_HOST`: `STARTUP_FLAGS` = 6;
public const val `STARTUP_LOADER_OPTIMIZATION_SINGLE_DOMAIN`: `STARTUP_FLAGS` = 2;
public const val `STARTUP_LOADER_SAFEMODE`: `STARTUP_FLAGS` = 16;
public const val `STARTUP_LOADER_SETPREFERENCE`: `STARTUP_FLAGS` = 256;
public const val `STARTUP_SERVER_GC`: `STARTUP_FLAGS` = 4096;
public const val `STARTUP_SINGLE_VERSION_HOSTING_INTERFACE`: `STARTUP_FLAGS` = 16384;
public const val `STARTUP_TRIM_GC_COMMIT`: `STARTUP_FLAGS` = 524288;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `StackOverflowInfo` (
    public var `soType`: `StackOverflowType`,
    public var `pExceptionInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`EXCEPTION_POINTERS`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `StackOverflowInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]

    public fun `StackOverflowInfo`.Companion.`default`() : `StackOverflowInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `StackOverflowType` = Int;
public const val `TT_ADUNLOAD`: `ETaskType` = 128;
public const val `TT_DEBUGGERHELPER`: `ETaskType` = 1;
public const val `TT_FINALIZER`: `ETaskType` = 4;
public const val `TT_GC`: `ETaskType` = 2;
public const val `TT_THREADPOOL_GATE`: `ETaskType` = 16;
public const val `TT_THREADPOOL_IOCOMPLETION`: `ETaskType` = 64;
public const val `TT_THREADPOOL_TIMER`: `ETaskType` = 8;
public const val `TT_THREADPOOL_WAIT`: `ETaskType` = 512;
public const val `TT_THREADPOOL_WORKER`: `ETaskType` = 32;
public const val `TT_UNKNOWN`: `ETaskType` = -2147483648;
public const val `TT_USER`: `ETaskType` = 256;
// UNSUPPORTED Rust 316:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TypeNameFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb81ff171_20f3_11d2_8dcc_00a0c9b00525);

public const val `WAIT_ALERTABLE`: `WAIT_OPTION` = 2;
public const val `WAIT_MSGPUMP`: `WAIT_OPTION` = 1;
public const val `WAIT_NOTINDEADLOCK`: `WAIT_OPTION` = 4;
public typealias `WAIT_OPTION` = Int;
public const val `eAbortThread`: `EPolicyAction` = 2;
public const val `eAll`: `EApiCategories` = 511;
public const val `eAppDomainCritical`: `EMemoryCriticalLevel` = 1;
public const val `eCurrentContext`: `EContextType` = 0;
public const val `eDisableRuntime`: `EPolicyAction` = 9;
public const val `eExitProcess`: `EPolicyAction` = 6;
public const val `eExternalProcessMgmt`: `EApiCategories` = 4;
public const val `eExternalThreading`: `EApiCategories` = 16;
public const val `eFastExitProcess`: `EPolicyAction` = 7;
public const val `eHostDeterminedPolicy`: `EClrUnhandledException` = 1;
public const val `eInitializeNewDomainFlags_NoSecurityChanges`: `EInitializeNewDomainFlags` = 2;
public const val `eInitializeNewDomainFlags_None`: `EInitializeNewDomainFlags` = 0;
public const val `eMayLeakOnAbort`: `EApiCategories` = 256;
public const val `eMemoryAvailableHigh`: `EMemoryAvailable` = 3;
public const val `eMemoryAvailableLow`: `EMemoryAvailable` = 1;
public const val `eMemoryAvailableNeutral`: `EMemoryAvailable` = 2;
public const val `eNoAction`: `EPolicyAction` = 0;
public const val `eNoChecks`: `EApiCategories` = 0;
public const val `ePolicyLevelAdmin`: `EBindPolicyLevels` = 32;
public const val `ePolicyLevelApp`: `EBindPolicyLevels` = 4;
public const val `ePolicyLevelHost`: `EBindPolicyLevels` = 16;
public const val `ePolicyLevelNone`: `EBindPolicyLevels` = 0;
public const val `ePolicyLevelPublisher`: `EBindPolicyLevels` = 8;
public const val `ePolicyLevelRetargetable`: `EBindPolicyLevels` = 1;
public const val `ePolicyPortability`: `EBindPolicyLevels` = 64;
public const val `ePolicyUnifiedToCLR`: `EBindPolicyLevels` = 2;
public const val `eProcessCritical`: `EMemoryCriticalLevel` = 2;
public const val `eRestrictedContext`: `EContextType` = 1;
public const val `eRudeAbortThread`: `EPolicyAction` = 3;
public const val `eRudeExitProcess`: `EPolicyAction` = 8;
public const val `eRudeUnloadAppDomain`: `EPolicyAction` = 5;
public const val `eRuntimeDeterminedPolicy`: `EClrUnhandledException` = 0;
public const val `eSecurityInfrastructure`: `EApiCategories` = 64;
public const val `eSelfAffectingProcessMgmt`: `EApiCategories` = 8;
public const val `eSelfAffectingThreading`: `EApiCategories` = 32;
public const val `eSharedState`: `EApiCategories` = 2;
public const val `eSymbolReadingAlways`: `ESymbolReadingPolicy` = 1;
public const val `eSymbolReadingFullTrustOnly`: `ESymbolReadingPolicy` = 2;
public const val `eSymbolReadingNever`: `ESymbolReadingPolicy` = 0;
public const val `eSynchronization`: `EApiCategories` = 1;
public const val `eTaskCritical`: `EMemoryCriticalLevel` = 0;
public const val `eThrowException`: `EPolicyAction` = 1;
public const val `eUI`: `EApiCategories` = 128;
public const val `eUnloadAppDomain`: `EPolicyAction` = 4;
