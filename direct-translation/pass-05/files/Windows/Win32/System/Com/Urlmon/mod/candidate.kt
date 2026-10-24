// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoGetClassObjectFromURL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoGetClassObjectFromURL`(`rclassid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `szcode` : `windows_sys`.`core`.`PCWSTR`, `dwfileversionms` : UInt, `dwfileversionls` : UInt, `sztype` : `windows_sys`.`core`.`PCWSTR`, `pbindctx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwclscontext` : `super`.`CLSCTX`, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetCombineIUri; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetCombineIUri`(`pbaseuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `prelativeuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcombineflags` : UInt, `ppcombineduri` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwreserved` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetCombineUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetCombineUrl`(`pwzbaseurl` : `windows_sys`.`core`.`PCWSTR`, `pwzrelativeurl` : `windows_sys`.`core`.`PCWSTR`, `dwcombineflags` : UInt, `pszresult` : `windows_sys`.`core`.`PWSTR`, `cchresult` : UInt, `pcchresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetCombineUrlEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetCombineUrlEx`(`pbaseuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzrelativeurl` : `windows_sys`.`core`.`PCWSTR`, `dwcombineflags` : UInt, `ppcombineduri` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwreserved` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetCompareUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetCompareUrl`(`pwzurl1` : `windows_sys`.`core`.`PCWSTR`, `pwzurl2` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetCreateSecurityManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetCreateSecurityManager`(`psp` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppsm` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetCreateZoneManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetCreateZoneManager`(`psp` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppzm` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetGetProtocolFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetGetProtocolFlags`(`pwzurl` : `windows_sys`.`core`.`PCWSTR`, `pdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetGetSecurityUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetGetSecurityUrl`(`pwszurl` : `windows_sys`.`core`.`PCWSTR`, `ppwszsecurl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `psuaction` : `PSUACTION`, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetGetSecurityUrlEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetGetSecurityUrlEx`(`puri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppsecuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `psuaction` : `PSUACTION`, `dwreserved` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetGetSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetGetSession`(`dwsessionmode` : UInt, `ppiinternetsession` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetIsFeatureEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetIsFeatureEnabled`(`featureentry` : `INTERNETFEATURELIST`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetIsFeatureEnabledForIUri; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetIsFeatureEnabledForIUri`(`featureentry` : `INTERNETFEATURELIST`, `dwflags` : UInt, `piuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `psecmgr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetIsFeatureEnabledForUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetIsFeatureEnabledForUrl`(`featureentry` : `INTERNETFEATURELIST`, `dwflags` : UInt, `szurl` : `windows_sys`.`core`.`PCWSTR`, `psecmgr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetIsFeatureZoneElevationEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetIsFeatureZoneElevationEnabled`(`szfromurl` : `windows_sys`.`core`.`PCWSTR`, `sztourl` : `windows_sys`.`core`.`PCWSTR`, `psecmgr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetParseIUri; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetParseIUri`(`piuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `parseaction` : `PARSEACTION`, `dwflags` : UInt, `pwzresult` : `windows_sys`.`core`.`PWSTR`, `cchresult` : UInt, `pcchresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetParseUrl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetParseUrl`(`pwzurl` : `windows_sys`.`core`.`PCWSTR`, `parseaction` : `PARSEACTION`, `dwflags` : UInt, `pszresult` : `windows_sys`.`core`.`PWSTR`, `cchresult` : UInt, `pcchresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetQueryInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetQueryInfo`(`pwzurl` : `windows_sys`.`core`.`PCWSTR`, `queryoptions` : `QUERYOPTION`, `dwqueryflags` : UInt, `pvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbuffer` : UInt, `pcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CoInternetSetFeatureEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoInternetSetFeatureEnabled`(`featureentry` : `INTERNETFEATURELIST`, `dwflags` : UInt, `fenable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CompareSecurityIds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CompareSecurityIds`(`pbsecurityid1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwlen1` : UInt, `pbsecurityid2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwlen2` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CompatFlagsFromClsid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CompatFlagsFromClsid`(`pclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pdwcompatflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwmiscstatusflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CopyBindInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `CopyBindInfo`(`pcbisrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`BINDINFO`>?, `pbidest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`BINDINFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CopyStgMedium; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `CopyStgMedium`(`pcstgmedsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?, `pstgmeddest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CreateAsyncBindCtx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateAsyncBindCtx`(`reserved` : UInt, `pbscb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pefetc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CreateAsyncBindCtxEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateAsyncBindCtxEx`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwoptions` : UInt, `pbscb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `penum` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `reserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CreateFormatEnumerator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateFormatEnumerator`(`cfmtetc` : UInt, `rgfmtetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`FORMATETC`>?, `ppenumfmtetc` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CreateURLMoniker; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateURLMoniker`(`pmkctx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szurl` : `windows_sys`.`core`.`PCWSTR`, `ppmk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CreateURLMonikerEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateURLMonikerEx`(`pmkctx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szurl` : `windows_sys`.`core`.`PCWSTR`, `ppmk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=CreateURLMonikerEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateURLMonikerEx2`(`pmkctx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `puri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppmk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=FaultInIEFeature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FaultInIEFeature`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `pclassspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`uCLSSPEC`>?, `pquery` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`QUERYCONTEXT`>?, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=FindMediaType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindMediaType`(`rgsztypes` : `windows_sys`.`core`.`PCSTR`, `rgcftypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=FindMediaTypeClass; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindMediaTypeClass`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sztype` : `windows_sys`.`core`.`PCSTR`, `pclsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `reserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=FindMimeFromData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindMimeFromData`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pwzurl` : `windows_sys`.`core`.`PCWSTR`, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbsize` : UInt, `pwzmimeproposed` : `windows_sys`.`core`.`PCWSTR`, `dwmimeflags` : UInt, `ppwzmimeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=GetClassFileOrMime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClassFileOrMime`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szfilename` : `windows_sys`.`core`.`PCWSTR`, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbsize` : UInt, `szmime` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt, `pclsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=GetClassURL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetClassURL`(`szurl` : `windows_sys`.`core`.`PCWSTR`, `pclsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=GetComponentIDFromCLSSPEC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComponentIDFromCLSSPEC`(`pclassspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`uCLSSPEC`>?, `ppszcomponentid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=GetSoftwareUpdateInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSoftwareUpdateInfo`(`szdistunit` : `windows_sys`.`core`.`PCWSTR`, `psdi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SOFTDISTINFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=HlinkGoBack; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HlinkGoBack`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=HlinkGoForward; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HlinkGoForward`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=HlinkNavigateMoniker; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HlinkNavigateMoniker`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pmktarget` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=HlinkNavigateString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HlinkNavigateString`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `sztarget` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=HlinkSimpleNavigateToMoniker; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HlinkSimpleNavigateToMoniker`(`pmktarget` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szlocation` : `windows_sys`.`core`.`PCWSTR`, `sztargetframename` : `windows_sys`.`core`.`PCWSTR`, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfhlnf` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=HlinkSimpleNavigateToString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HlinkSimpleNavigateToString`(`sztarget` : `windows_sys`.`core`.`PCWSTR`, `szlocation` : `windows_sys`.`core`.`PCWSTR`, `sztargetframename` : `windows_sys`.`core`.`PCWSTR`, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfhlnf` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=IEGetUserPrivateNamespaceName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IEGetUserPrivateNamespaceName`() : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=IEInstallScope; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IEInstallScope`(`pdwscope` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=IsAsyncMoniker; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsAsyncMoniker`(`pmk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=IsLoggingEnabledA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsLoggingEnabledA`(`pszurl` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=IsLoggingEnabledW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsLoggingEnabledW`(`pwszurl` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=IsValidURL; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsValidURL`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szurl` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=MkParseDisplayNameEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MkParseDisplayNameEx`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szdisplayname` : `windows_sys`.`core`.`PCWSTR`, `pcheaten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppmk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=ObtainUserAgentString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ObtainUserAgentString`(`dwoption` : UInt, `pszuaout` : `windows_sys`.`core`.`PSTR`, `cbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=RegisterBindStatusCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterBindStatusCallback`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbscb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppbscbprev` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=RegisterFormatEnumerator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterFormatEnumerator`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pefetc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=RegisterMediaTypeClass; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterMediaTypeClass`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ctypes` : UInt, `rgsztypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `rgclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `reserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=RegisterMediaTypes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterMediaTypes`(`ctypes` : UInt, `rgsztypes` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `rgcftypes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=ReleaseBindInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `ReleaseBindInfo`(`pbindinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`BINDINFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=RevokeBindStatusCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RevokeBindStatusCallback`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbscb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=RevokeFormatEnumerator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RevokeFormatEnumerator`(`pbc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pefetc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=SetAccessForIEAppContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetAccessForIEAppContainer`(`hobject` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `ieobjecttype` : `IEObjectType`, `dwaccessmask` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=SetSoftwareUpdateAdvertisementState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSoftwareUpdateAdvertisementState`(`szdistunit` : `windows_sys`.`core`.`PCWSTR`, `dwadstate` : UInt, `dwadvertisedversionms` : UInt, `dwadvertisedversionls` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLDownloadToCacheFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLDownloadToCacheFileA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : `windows_sys`.`core`.`PSTR`, `cchfilename` : UInt, `param4` : UInt, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLDownloadToCacheFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLDownloadToCacheFileW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : `windows_sys`.`core`.`PWSTR`, `cchfilename` : UInt, `param4` : UInt, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLDownloadToFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLDownloadToFileA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : `windows_sys`.`core`.`PCSTR`, `param3` : UInt, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLDownloadToFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLDownloadToFileW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : `windows_sys`.`core`.`PCWSTR`, `param3` : UInt, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLOpenBlockingStreamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLOpenBlockingStreamA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `param3` : UInt, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLOpenBlockingStreamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLOpenBlockingStreamW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `param3` : UInt, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLOpenPullStreamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLOpenPullStreamA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLOpenPullStreamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLOpenPullStreamW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLOpenStreamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLOpenStreamA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCSTR`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=URLOpenStreamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `URLOpenStreamW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `param1` : `windows_sys`.`core`.`PCWSTR`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=UrlMkGetSessionOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlMkGetSessionOption`(`dwoption` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt, `pdwbufferlengthout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=UrlMkSetSessionOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UrlMkSetSessionOption`(`dwoption` : UInt, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbufferlength` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=urlmon.dll, ABI=system, export=WriteHitLogging; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteHitLogging`(`lplogginginfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`HIT_LOGGING_INFO`>?) : `windows_sys`.`core`.`BOOL`
public typealias `AUTHENTICATEF` = Int;
public const val `AUTHENTICATEF_BASIC`: `AUTHENTICATEF` = 2;
public const val `AUTHENTICATEF_HTTP`: `AUTHENTICATEF` = 4;
public const val `AUTHENTICATEF_PROXY`: `AUTHENTICATEF` = 1;
public typealias `BINDF` = Int;
public typealias `BINDF2` = Int;
public const val `BINDF2_ALLOW_PROXY_CRED_PROMPT`: `BINDF2` = 256;
public const val `BINDF2_DISABLEAUTOCOOKIEHANDLING`: `BINDF2` = 2;
public const val `BINDF2_DISABLEBASICOVERHTTP`: `BINDF2` = 1;
public const val `BINDF2_DISABLE_HTTP_REDIRECT_CACHING`: `BINDF2` = 64;
public const val `BINDF2_DISABLE_HTTP_REDIRECT_XSECURITYID`: `BINDF2` = 8;
public const val `BINDF2_KEEP_CALLBACK_MODULE_LOADED`: `BINDF2` = 128;
public const val `BINDF2_READ_DATA_GREATER_THAN_4GB`: `BINDF2` = 4;
public const val `BINDF2_RESERVED_1`: `BINDF2` = -2147483648;
public const val `BINDF2_RESERVED_10`: `BINDF2` = 65536;
public const val `BINDF2_RESERVED_11`: `BINDF2` = 32768;
public const val `BINDF2_RESERVED_12`: `BINDF2` = 16384;
public const val `BINDF2_RESERVED_13`: `BINDF2` = 8192;
public const val `BINDF2_RESERVED_14`: `BINDF2` = 4096;
public const val `BINDF2_RESERVED_15`: `BINDF2` = 2048;
public const val `BINDF2_RESERVED_16`: `BINDF2` = 1024;
public const val `BINDF2_RESERVED_17`: `BINDF2` = 512;
public const val `BINDF2_RESERVED_2`: `BINDF2` = 1073741824;
public const val `BINDF2_RESERVED_3`: `BINDF2` = 536870912;
public const val `BINDF2_RESERVED_4`: `BINDF2` = 268435456;
public const val `BINDF2_RESERVED_5`: `BINDF2` = 134217728;
public const val `BINDF2_RESERVED_6`: `BINDF2` = 67108864;
public const val `BINDF2_RESERVED_7`: `BINDF2` = 33554432;
public const val `BINDF2_RESERVED_8`: `BINDF2` = 16777216;
public const val `BINDF2_RESERVED_9`: `BINDF2` = 8388608;
public const val `BINDF2_RESERVED_A`: `BINDF2` = 4194304;
public const val `BINDF2_RESERVED_B`: `BINDF2` = 2097152;
public const val `BINDF2_RESERVED_C`: `BINDF2` = 1048576;
public const val `BINDF2_RESERVED_D`: `BINDF2` = 524288;
public const val `BINDF2_RESERVED_E`: `BINDF2` = 262144;
public const val `BINDF2_RESERVED_F`: `BINDF2` = 131072;
public const val `BINDF2_SETDOWNLOADMODE`: `BINDF2` = 32;
public const val `BINDF_ASYNCHRONOUS`: `BINDF` = 1;
public const val `BINDF_ASYNCSTORAGE`: `BINDF` = 2;
public const val `BINDF_DIRECT_READ`: `BINDF` = 131072;
public const val `BINDF_ENFORCERESTRICTED`: `BINDF` = 8388608;
public const val `BINDF_FORMS_SUBMIT`: `BINDF` = 262144;
public const val `BINDF_FREE_THREADED`: `BINDF` = 65536;
public const val `BINDF_FROMURLMON`: `BINDF` = 1048576;
public const val `BINDF_FWD_BACK`: `BINDF` = 2097152;
public const val `BINDF_GETCLASSOBJECT`: `BINDF` = 16384;
public const val `BINDF_GETFROMCACHE_IF_NET_FAIL`: `BINDF` = 524288;
public const val `BINDF_GETNEWESTVERSION`: `BINDF` = 16;
public const val `BINDF_HYPERLINK`: `BINDF` = 1024;
public const val `BINDF_IGNORESECURITYPROBLEM`: `BINDF` = 256;
public const val `BINDF_NEEDFILE`: `BINDF` = 64;
public const val `BINDF_NOPROGRESSIVERENDERING`: `BINDF` = 4;
public const val `BINDF_NOWRITECACHE`: `BINDF` = 32;
public const val `BINDF_NO_UI`: `BINDF` = 2048;
public const val `BINDF_OFFLINEOPERATION`: `BINDF` = 8;
public const val `BINDF_PRAGMA_NO_CACHE`: `BINDF` = 8192;
public const val `BINDF_PREFERDEFAULTHANDLER`: `BINDF` = 4194304;
public const val `BINDF_PULLDATA`: `BINDF` = 128;
public const val `BINDF_RESERVED_1`: `BINDF` = 32768;
public const val `BINDF_RESERVED_2`: `BINDF` = -2147483648;
public const val `BINDF_RESERVED_3`: `BINDF` = 16777216;
public const val `BINDF_RESERVED_4`: `BINDF` = 33554432;
public const val `BINDF_RESERVED_5`: `BINDF` = 67108864;
public const val `BINDF_RESERVED_6`: `BINDF` = 134217728;
public const val `BINDF_RESERVED_7`: `BINDF` = 1073741824;
public const val `BINDF_RESERVED_8`: `BINDF` = 536870912;
public const val `BINDF_RESYNCHRONIZE`: `BINDF` = 512;
public const val `BINDF_SILENTOPERATION`: `BINDF` = 4096;
public typealias `BINDHANDLETYPES` = Int;
public const val `BINDHANDLETYPES_APPCACHE`: `BINDHANDLETYPES` = 0;
public const val `BINDHANDLETYPES_COUNT`: `BINDHANDLETYPES` = 2;
public const val `BINDHANDLETYPES_DEPENDENCY`: `BINDHANDLETYPES` = 1;
public typealias `BINDINFO_OPTIONS` = Int;
public const val `BINDINFO_OPTIONS_ALLOWCONNECTDATA`: `BINDINFO_OPTIONS` = 536870912;
public const val `BINDINFO_OPTIONS_BINDTOOBJECT`: `BINDINFO_OPTIONS` = 1048576;
public const val `BINDINFO_OPTIONS_DISABLEAUTOREDIRECTS`: `BINDINFO_OPTIONS` = 1073741824;
public const val `BINDINFO_OPTIONS_DISABLE_UTF8`: `BINDINFO_OPTIONS` = 262144;
public const val `BINDINFO_OPTIONS_ENABLE_UTF8`: `BINDINFO_OPTIONS` = 131072;
public const val `BINDINFO_OPTIONS_IGNOREHTTPHTTPSREDIRECTS`: `BINDINFO_OPTIONS` = 16777216;
public const val `BINDINFO_OPTIONS_IGNOREMIMETEXTPLAIN`: `BINDINFO_OPTIONS` = 4194304;
public const val `BINDINFO_OPTIONS_IGNORE_SSLERRORS_ONCE`: `BINDINFO_OPTIONS` = 33554432;
public const val `BINDINFO_OPTIONS_SECURITYOPTOUT`: `BINDINFO_OPTIONS` = 2097152;
public const val `BINDINFO_OPTIONS_SHDOCVW_NAVIGATE`: `BINDINFO_OPTIONS` = -2147483648;
public const val `BINDINFO_OPTIONS_USEBINDSTRINGCREDS`: `BINDINFO_OPTIONS` = 8388608;
public const val `BINDINFO_OPTIONS_USE_IE_ENCODING`: `BINDINFO_OPTIONS` = 524288;
public const val `BINDINFO_OPTIONS_WININETFLAG`: `BINDINFO_OPTIONS` = 65536;
public const val `BINDINFO_WPC_DOWNLOADBLOCKED`: `BINDINFO_OPTIONS` = 134217728;
public const val `BINDINFO_WPC_LOGGING_ENABLED`: `BINDINFO_OPTIONS` = 268435456;
public typealias `BINDSTATUS` = Int;
public const val `BINDSTATUS_64BIT_PROGRESS`: `BINDSTATUS` = 56;
public const val `BINDSTATUS_ACCEPTRANGES`: `BINDSTATUS` = 33;
public const val `BINDSTATUS_BEGINDOWNLOADCOMPONENTS`: `BINDSTATUS` = 7;
public const val `BINDSTATUS_BEGINDOWNLOADDATA`: `BINDSTATUS` = 4;
public const val `BINDSTATUS_BEGINSYNCOPERATION`: `BINDSTATUS` = 15;
public const val `BINDSTATUS_BEGINUPLOADDATA`: `BINDSTATUS` = 17;
public const val `BINDSTATUS_CACHECONTROL`: `BINDSTATUS` = 48;
public const val `BINDSTATUS_CACHEFILENAMEAVAILABLE`: `BINDSTATUS` = 14;
public const val `BINDSTATUS_CLASSIDAVAILABLE`: `BINDSTATUS` = 12;
public const val `BINDSTATUS_CLASSINSTALLLOCATION`: `BINDSTATUS` = 23;
public const val `BINDSTATUS_CLSIDCANINSTANTIATE`: `BINDSTATUS` = 28;
public const val `BINDSTATUS_COMPACT_POLICY_RECEIVED`: `BINDSTATUS` = 35;
public const val `BINDSTATUS_CONNECTING`: `BINDSTATUS` = 2;
public const val `BINDSTATUS_CONTENTDISPOSITIONATTACH`: `BINDSTATUS` = 26;
public const val `BINDSTATUS_CONTENTDISPOSITIONFILENAME`: `BINDSTATUS` = 49;
public const val `BINDSTATUS_COOKIE_SENT`: `BINDSTATUS` = 34;
public const val `BINDSTATUS_COOKIE_STATE_ACCEPT`: `BINDSTATUS` = 38;
public const val `BINDSTATUS_COOKIE_STATE_DOWNGRADE`: `BINDSTATUS` = 42;
public const val `BINDSTATUS_COOKIE_STATE_LEASH`: `BINDSTATUS` = 41;
public const val `BINDSTATUS_COOKIE_STATE_PROMPT`: `BINDSTATUS` = 40;
public const val `BINDSTATUS_COOKIE_STATE_REJECT`: `BINDSTATUS` = 39;
public const val `BINDSTATUS_COOKIE_STATE_UNKNOWN`: `BINDSTATUS` = 37;
public const val `BINDSTATUS_COOKIE_SUPPRESSED`: `BINDSTATUS` = 36;
public const val `BINDSTATUS_DECODING`: `BINDSTATUS` = 24;
public const val `BINDSTATUS_DIRECTBIND`: `BINDSTATUS` = 30;
public const val `BINDSTATUS_DISPLAYNAMEAVAILABLE`: `BINDSTATUS` = 52;
public const val `BINDSTATUS_DOWNLOADINGDATA`: `BINDSTATUS` = 5;
public const val `BINDSTATUS_ENCODING`: `BINDSTATUS` = 21;
public const val `BINDSTATUS_ENDDOWNLOADCOMPONENTS`: `BINDSTATUS` = 9;
public const val `BINDSTATUS_ENDDOWNLOADDATA`: `BINDSTATUS` = 6;
public const val `BINDSTATUS_ENDSYNCOPERATION`: `BINDSTATUS` = 16;
public const val `BINDSTATUS_ENDUPLOADDATA`: `BINDSTATUS` = 19;
public const val `BINDSTATUS_FILTERREPORTMIMETYPE`: `BINDSTATUS` = 27;
public const val `BINDSTATUS_FINDINGRESOURCE`: `BINDSTATUS` = 1;
public const val `BINDSTATUS_INSTALLINGCOMPONENTS`: `BINDSTATUS` = 8;
public const val `BINDSTATUS_IUNKNOWNAVAILABLE`: `BINDSTATUS` = 29;
public const val `BINDSTATUS_LAST`: `BINDSTATUS` = 56;
public const val `BINDSTATUS_LAST_PRIVATE`: `BINDSTATUS` = 77;
public const val `BINDSTATUS_LOADINGMIMEHANDLER`: `BINDSTATUS` = 25;
public const val `BINDSTATUS_MIMETEXTPLAINMISMATCH`: `BINDSTATUS` = 50;
public const val `BINDSTATUS_MIMETYPEAVAILABLE`: `BINDSTATUS` = 13;
public const val `BINDSTATUS_P3P_HEADER`: `BINDSTATUS` = 44;
public const val `BINDSTATUS_PERSISTENT_COOKIE_RECEIVED`: `BINDSTATUS` = 46;
public const val `BINDSTATUS_POLICY_HREF`: `BINDSTATUS` = 43;
public const val `BINDSTATUS_PROTOCOLCLASSID`: `BINDSTATUS` = 20;
public const val `BINDSTATUS_PROXYDETECTING`: `BINDSTATUS` = 32;
public const val `BINDSTATUS_PUBLISHERAVAILABLE`: `BINDSTATUS` = 51;
public const val `BINDSTATUS_RAWMIMETYPE`: `BINDSTATUS` = 31;
public const val `BINDSTATUS_REDIRECTING`: `BINDSTATUS` = 3;
public const val `BINDSTATUS_RESERVED_0`: `BINDSTATUS` = 57;
public const val `BINDSTATUS_RESERVED_1`: `BINDSTATUS` = 58;
public const val `BINDSTATUS_RESERVED_10`: `BINDSTATUS` = 73;
public const val `BINDSTATUS_RESERVED_11`: `BINDSTATUS` = 74;
public const val `BINDSTATUS_RESERVED_12`: `BINDSTATUS` = 75;
public const val `BINDSTATUS_RESERVED_13`: `BINDSTATUS` = 76;
public const val `BINDSTATUS_RESERVED_14`: `BINDSTATUS` = 77;
public const val `BINDSTATUS_RESERVED_2`: `BINDSTATUS` = 59;
public const val `BINDSTATUS_RESERVED_3`: `BINDSTATUS` = 60;
public const val `BINDSTATUS_RESERVED_4`: `BINDSTATUS` = 61;
public const val `BINDSTATUS_RESERVED_5`: `BINDSTATUS` = 62;
public const val `BINDSTATUS_RESERVED_6`: `BINDSTATUS` = 63;
public const val `BINDSTATUS_RESERVED_7`: `BINDSTATUS` = 64;
public const val `BINDSTATUS_RESERVED_8`: `BINDSTATUS` = 65;
public const val `BINDSTATUS_RESERVED_9`: `BINDSTATUS` = 66;
public const val `BINDSTATUS_RESERVED_A`: `BINDSTATUS` = 67;
public const val `BINDSTATUS_RESERVED_B`: `BINDSTATUS` = 68;
public const val `BINDSTATUS_RESERVED_C`: `BINDSTATUS` = 69;
public const val `BINDSTATUS_RESERVED_D`: `BINDSTATUS` = 70;
public const val `BINDSTATUS_RESERVED_E`: `BINDSTATUS` = 71;
public const val `BINDSTATUS_RESERVED_F`: `BINDSTATUS` = 72;
public const val `BINDSTATUS_SENDINGREQUEST`: `BINDSTATUS` = 11;
public const val `BINDSTATUS_SERVER_MIMETYPEAVAILABLE`: `BINDSTATUS` = 54;
public const val `BINDSTATUS_SESSION_COOKIES_ALLOWED`: `BINDSTATUS` = 47;
public const val `BINDSTATUS_SESSION_COOKIE_RECEIVED`: `BINDSTATUS` = 45;
public const val `BINDSTATUS_SNIFFED_CLASSIDAVAILABLE`: `BINDSTATUS` = 55;
public const val `BINDSTATUS_SSLUX_NAVBLOCKED`: `BINDSTATUS` = 53;
public const val `BINDSTATUS_UPLOADINGDATA`: `BINDSTATUS` = 18;
public const val `BINDSTATUS_USINGCACHEDCOPY`: `BINDSTATUS` = 10;
public const val `BINDSTATUS_VERIFIEDMIMETYPEAVAILABLE`: `BINDSTATUS` = 22;
public typealias `BINDSTRING` = Int;
public const val `BINDSTRING_ACCEPT_ENCODINGS`: `BINDSTRING` = 11;
public const val `BINDSTRING_ACCEPT_MIMES`: `BINDSTRING` = 2;
public const val `BINDSTRING_DOC_URL`: `BINDSTRING` = 25;
public const val `BINDSTRING_DOWNLOADPATH`: `BINDSTRING` = 19;
public const val `BINDSTRING_ENTERPRISE_ID`: `BINDSTRING` = 24;
public const val `BINDSTRING_EXTRA_URL`: `BINDSTRING` = 3;
public const val `BINDSTRING_FLAG_BIND_TO_OBJECT`: `BINDSTRING` = 16;
public const val `BINDSTRING_HEADERS`: `BINDSTRING` = 1;
public const val `BINDSTRING_IID`: `BINDSTRING` = 15;
public const val `BINDSTRING_INITIAL_FILENAME`: `BINDSTRING` = 21;
public const val `BINDSTRING_LANGUAGE`: `BINDSTRING` = 4;
public const val `BINDSTRING_OS`: `BINDSTRING` = 9;
public const val `BINDSTRING_PASSWORD`: `BINDSTRING` = 6;
public const val `BINDSTRING_POST_COOKIE`: `BINDSTRING` = 12;
public const val `BINDSTRING_POST_DATA_MIME`: `BINDSTRING` = 13;
public const val `BINDSTRING_PROXY_PASSWORD`: `BINDSTRING` = 23;
public const val `BINDSTRING_PROXY_USERNAME`: `BINDSTRING` = 22;
public const val `BINDSTRING_PTR_BIND_CONTEXT`: `BINDSTRING` = 17;
public const val `BINDSTRING_ROOTDOC_URL`: `BINDSTRING` = 20;
public const val `BINDSTRING_SAMESITE_COOKIE_LEVEL`: `BINDSTRING` = 26;
public const val `BINDSTRING_UA_COLOR`: `BINDSTRING` = 8;
public const val `BINDSTRING_UA_PIXELS`: `BINDSTRING` = 7;
public const val `BINDSTRING_URL`: `BINDSTRING` = 14;
public const val `BINDSTRING_USERNAME`: `BINDSTRING` = 5;
public const val `BINDSTRING_USER_AGENT`: `BINDSTRING` = 10;
public const val `BINDSTRING_XDR_ORIGIN`: `BINDSTRING` = 18;
public typealias `BINDVERB` = Int;
public const val `BINDVERB_CUSTOM`: `BINDVERB` = 3;
public const val `BINDVERB_GET`: `BINDVERB` = 0;
public const val `BINDVERB_POST`: `BINDVERB` = 1;
public const val `BINDVERB_PUT`: `BINDVERB` = 2;
public const val `BINDVERB_RESERVED1`: `BINDVERB` = 4;
public typealias `BSCF` = Int;
public const val `BSCF_64BITLENGTHDOWNLOAD`: `BSCF` = 64;
public const val `BSCF_AVAILABLEDATASIZEUNKNOWN`: `BSCF` = 16;
public const val `BSCF_DATAFULLYAVAILABLE`: `BSCF` = 8;
public const val `BSCF_FIRSTDATANOTIFICATION`: `BSCF` = 1;
public const val `BSCF_INTERMEDIATEDATANOTIFICATION`: `BSCF` = 2;
public const val `BSCF_LASTDATANOTIFICATION`: `BSCF` = 4;
public const val `BSCF_SKIPDRAINDATAFORFILEURLS`: `BSCF` = 32;
public const val `CF_NULL`: UInt = 0u;
public const val `CIP_ACCESS_DENIED`: `CIP_STATUS` = 1;
public const val `CIP_DISK_FULL`: `CIP_STATUS` = 0;
public const val `CIP_EXE_SELF_REGISTERATION_TIMEOUT`: `CIP_STATUS` = 6;
public const val `CIP_NAME_CONFLICT`: `CIP_STATUS` = 4;
public const val `CIP_NEED_REBOOT`: `CIP_STATUS` = 8;
public const val `CIP_NEED_REBOOT_UI_PERMISSION`: `CIP_STATUS` = 9;
public const val `CIP_NEWER_VERSION_EXISTS`: `CIP_STATUS` = 2;
public const val `CIP_OLDER_VERSION_EXISTS`: `CIP_STATUS` = 3;
public typealias `CIP_STATUS` = Int;
public const val `CIP_TRUST_VERIFICATION_COMPONENT_MISSING`: `CIP_STATUS` = 5;
public const val `CIP_UNSAFE_TO_ABORT`: `CIP_STATUS` = 7;
public const val `CLASSIDPROP`: `MONIKERPROPERTY` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CODEBASEHOLD` (
    public var `cbSize`: UInt,
    public var `szDistUnit`: `windows_sys`.`core`.`PWSTR`,
    public var `szCodeBase`: `windows_sys`.`core`.`PWSTR`,
    public var `dwVersionMS`: UInt,
    public var `dwVersionLS`: UInt,
    public var `dwStyle`: UInt,
)
// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CODEBASEHOLD {
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
public class `CONFIRMSAFETY` (
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `pUnk`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 321:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONFIRMSAFETY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONFIRMSAFETYACTION_LOADOBJECT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DATAINFO` (
    public var `ulTotalSize`: UInt,
    public var `ulavrPacketSize`: UInt,
    public var `ulConnectSpeed`: UInt,
    public var `ulProcessorSpeed`: UInt,
)
public const val `E_PENDING`: Int = -2147483638;
public const val `FEATURE_ADDON_MANAGEMENT`: `INTERNETFEATURELIST` = 13;
public const val `FEATURE_BEHAVIORS`: `INTERNETFEATURELIST` = 6;
public const val `FEATURE_BLOCK_INPUT_PROMPTS`: `INTERNETFEATURELIST` = 27;
public const val `FEATURE_DISABLE_LEGACY_COMPRESSION`: `INTERNETFEATURELIST` = 22;
public const val `FEATURE_DISABLE_MK_PROTOCOL`: `INTERNETFEATURELIST` = 7;
public const val `FEATURE_DISABLE_NAVIGATION_SOUNDS`: `INTERNETFEATURELIST` = 21;
public const val `FEATURE_DISABLE_TELNET_PROTOCOL`: `INTERNETFEATURELIST` = 25;
public const val `FEATURE_ENTRY_COUNT`: `INTERNETFEATURELIST` = 28;
public const val `FEATURE_FEEDS`: `INTERNETFEATURELIST` = 26;
public const val `FEATURE_FORCE_ADDR_AND_STATUS`: `INTERNETFEATURELIST` = 23;
public const val `FEATURE_GET_URL_DOM_FILEPATH_UNENCODED`: `INTERNETFEATURELIST` = 18;
public const val `FEATURE_HTTP_USERNAME_PASSWORD_DISABLE`: `INTERNETFEATURELIST` = 15;
public const val `FEATURE_LOCALMACHINE_LOCKDOWN`: `INTERNETFEATURELIST` = 8;
public const val `FEATURE_MIME_HANDLING`: `INTERNETFEATURELIST` = 2;
public const val `FEATURE_MIME_SNIFFING`: `INTERNETFEATURELIST` = 3;
public const val `FEATURE_OBJECT_CACHING`: `INTERNETFEATURELIST` = 0;
public const val `FEATURE_PROTOCOL_LOCKDOWN`: `INTERNETFEATURELIST` = 14;
public const val `FEATURE_RESTRICT_ACTIVEXINSTALL`: `INTERNETFEATURELIST` = 10;
public const val `FEATURE_RESTRICT_FILEDOWNLOAD`: `INTERNETFEATURELIST` = 12;
public const val `FEATURE_SAFE_BINDTOOBJECT`: `INTERNETFEATURELIST` = 16;
public const val `FEATURE_SECURITYBAND`: `INTERNETFEATURELIST` = 9;
public const val `FEATURE_SSLUX`: `INTERNETFEATURELIST` = 20;
public const val `FEATURE_TABBED_BROWSING`: `INTERNETFEATURELIST` = 19;
public const val `FEATURE_UNC_SAVEDFILECHECK`: `INTERNETFEATURELIST` = 17;
public const val `FEATURE_VALIDATE_NAVIGATE_URL`: `INTERNETFEATURELIST` = 11;
public const val `FEATURE_WEBOC_POPUPMANAGEMENT`: `INTERNETFEATURELIST` = 5;
public const val `FEATURE_WINDOW_RESTRICTIONS`: `INTERNETFEATURELIST` = 4;
public const val `FEATURE_XMLHTTP`: `INTERNETFEATURELIST` = 24;
public const val `FEATURE_ZONE_ELEVATION`: `INTERNETFEATURELIST` = 1;
public const val `FIEF_FLAG_FORCE_JITUI`: UInt = 1u;
public const val `FIEF_FLAG_PEEK`: UInt = 2u;
public const val `FIEF_FLAG_RESERVED_0`: UInt = 8u;
public const val `FIEF_FLAG_SKIP_INSTALLED_VERSION_CHECK`: UInt = 4u;
public const val `FMFD_DEFAULT`: UInt = 0u;
public const val `FMFD_ENABLEMIMESNIFFING`: UInt = 2u;
public const val `FMFD_IGNOREMIMETEXTPLAIN`: UInt = 4u;
public const val `FMFD_RESERVED_1`: UInt = 64u;
public const val `FMFD_RESERVED_2`: UInt = 128u;
public const val `FMFD_RESPECTTEXTPLAIN`: UInt = 16u;
public const val `FMFD_RETURNUPDATEDIMGMIMES`: UInt = 32u;
public const val `FMFD_SERVERMIME`: UInt = 8u;
public const val `FMFD_URLASFILENAME`: UInt = 1u;
public const val `GET_FEATURE_FROM_PROCESS`: UInt = 2u;
public const val `GET_FEATURE_FROM_REGISTRY`: UInt = 4u;
public const val `GET_FEATURE_FROM_THREAD`: UInt = 1u;
public const val `GET_FEATURE_FROM_THREAD_INTERNET`: UInt = 64u;
public const val `GET_FEATURE_FROM_THREAD_INTRANET`: UInt = 16u;
public const val `GET_FEATURE_FROM_THREAD_LOCALMACHINE`: UInt = 8u;
public const val `GET_FEATURE_FROM_THREAD_RESTRICTED`: UInt = 128u;
public const val `GET_FEATURE_FROM_THREAD_TRUSTED`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HIT_LOGGING_INFO` (
    public var `dwStructSize`: UInt,
    public var `lpszLoggedUrlName`: `windows_sys`.`core`.`PSTR`,
    public var `StartTime`: `super`.`super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `EndTime`: `super`.`super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `lpszExtendedInfo`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 395:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HIT_LOGGING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IEObjectType` = Int;
public const val `IE_EPM_OBJECT_EVENT`: `IEObjectType` = 0;
public const val `IE_EPM_OBJECT_FILE`: `IEObjectType` = 5;
public const val `IE_EPM_OBJECT_MUTEX`: `IEObjectType` = 1;
public const val `IE_EPM_OBJECT_NAMED_PIPE`: `IEObjectType` = 6;
public const val `IE_EPM_OBJECT_REGISTRY`: `IEObjectType` = 7;
public const val `IE_EPM_OBJECT_SEMAPHORE`: `IEObjectType` = 2;
public const val `IE_EPM_OBJECT_SHARED_MEMORY`: `IEObjectType` = 3;
public const val `IE_EPM_OBJECT_WAITABLE_TIMER`: `IEObjectType` = 4;
public const val `INET_E_AUTHENTICATION_REQUIRED`: Int = -2146697207;
public const val `INET_E_BLOCKED_ENHANCEDPROTECTEDMODE`: Int = -2146695930;
public const val `INET_E_BLOCKED_PLUGGABLE_PROTOCOL`: Int = -2146695931;
public const val `INET_E_BLOCKED_REDIRECT_XSECURITYID`: Int = -2146697189;
public const val `INET_E_CANNOT_CONNECT`: Int = -2146697212;
public const val `INET_E_CANNOT_INSTANTIATE_OBJECT`: Int = -2146697200;
public const val `INET_E_CANNOT_LOAD_DATA`: Int = -2146697201;
public const val `INET_E_CANNOT_LOCK_REQUEST`: Int = -2146697194;
public const val `INET_E_CANNOT_REPLACE_SFP_FILE`: Int = -2146696448;
public const val `INET_E_CODE_DOWNLOAD_DECLINED`: Int = -2146696960;
public const val `INET_E_CODE_INSTALL_BLOCKED_ARM`: Int = -2146695932;
public const val `INET_E_CODE_INSTALL_BLOCKED_BITNESS`: Int = -2146695929;
public const val `INET_E_CODE_INSTALL_BLOCKED_BY_HASH_POLICY`: Int = -2146695936;
public const val `INET_E_CODE_INSTALL_BLOCKED_IMMERSIVE`: Int = -2146695934;
public const val `INET_E_CODE_INSTALL_SUPPRESSED`: Int = -2146696192;
public const val `INET_E_CONNECTION_TIMEOUT`: Int = -2146697205;
public const val `INET_E_DATA_NOT_AVAILABLE`: Int = -2146697209;
public const val `INET_E_DEFAULT_ACTION`: Int = -2146697199;
public const val `INET_E_DOMINJECTIONVALIDATION`: Int = -2146697188;
public const val `INET_E_DOWNLOAD_BLOCKED_BY_CSP`: Int = -2146695928;
public const val `INET_E_DOWNLOAD_BLOCKED_BY_INPRIVATE`: Int = -2146695935;
public const val `INET_E_DOWNLOAD_FAILURE`: Int = -2146697208;
public const val `INET_E_ERROR_FIRST`: Int = -2146697214;
public const val `INET_E_ERROR_LAST`: Int = -2146695928;
public const val `INET_E_FORBIDFRAMING`: Int = -2146695933;
public const val `INET_E_HSTS_CERTIFICATE_ERROR`: Int = -2146697186;
public const val `INET_E_INVALID_CERTIFICATE`: Int = -2146697191;
public const val `INET_E_INVALID_REQUEST`: Int = -2146697204;
public const val `INET_E_INVALID_URL`: Int = -2146697214;
public const val `INET_E_NO_SESSION`: Int = -2146697213;
public const val `INET_E_NO_VALID_MEDIA`: Int = -2146697206;
public const val `INET_E_OBJECT_NOT_FOUND`: Int = -2146697210;
public const val `INET_E_QUERYOPTION_UNKNOWN`: Int = -2146697197;
public const val `INET_E_REDIRECTING`: Int = -2146697196;
public const val `INET_E_REDIRECT_FAILED`: Int = -2146697196;
public const val `INET_E_REDIRECT_TO_DIR`: Int = -2146697195;
public const val `INET_E_RESERVED_1`: Int = -2146697190;
public const val `INET_E_RESERVED_2`: Int = -2146697185;
public const val `INET_E_RESERVED_3`: Int = -2146697184;
public const val `INET_E_RESERVED_4`: Int = -2146697183;
public const val `INET_E_RESERVED_5`: Int = -2146697182;
public const val `INET_E_RESOURCE_NOT_FOUND`: Int = -2146697211;
public const val `INET_E_RESULT_DISPATCHED`: Int = -2146696704;
public const val `INET_E_SECURITY_PROBLEM`: Int = -2146697202;
public const val `INET_E_TERMINATED_BIND`: Int = -2146697192;
public const val `INET_E_UNKNOWN_PROTOCOL`: Int = -2146697203;
public const val `INET_E_USE_DEFAULT_PROTOCOLHANDLER`: Int = -2146697199;
public const val `INET_E_USE_DEFAULT_SETTING`: Int = -2146697198;
public const val `INET_E_USE_EXTEND_BINDING`: Int = -2146697193;
public const val `INET_E_VTAB_SWITCH_FORCE_ENGINE`: Int = -2146697187;
public typealias `INET_ZONE_MANAGER_CONSTANTS` = Int;
public typealias `INTERNETFEATURELIST` = Int;
public const val `MAX_SIZE_SECURITY_ID`: UInt = 512u;
public const val `MAX_ZONE_DESCRIPTION`: `INET_ZONE_MANAGER_CONSTANTS` = 200;
public const val `MAX_ZONE_PATH`: `INET_ZONE_MANAGER_CONSTANTS` = 260;
public const val `MIMETYPEPROP`: `MONIKERPROPERTY` = 0;
public const val `MKSYS_URLMONIKER`: UInt = 6u;
public const val `MK_S_ASYNCHRONOUS`: Int = 262632;
public typealias `MONIKERPROPERTY` = Int;
public const val `MUTZ_ACCEPT_WILDCARD_SCHEME`: UInt = 128u;
public const val `MUTZ_DONT_UNESCAPE`: UInt = 2048u;
public const val `MUTZ_DONT_USE_CACHE`: UInt = 4096u;
public const val `MUTZ_ENFORCERESTRICTED`: UInt = 256u;
public const val `MUTZ_FORCE_INTRANET_FLAGS`: UInt = 8192u;
public const val `MUTZ_IGNORE_ZONE_MAPPINGS`: UInt = 16384u;
public const val `MUTZ_ISFILE`: UInt = 2u;
public const val `MUTZ_NOSAVEDFILECHECK`: UInt = 1u;
public const val `MUTZ_REQUIRESAVEDFILECHECK`: UInt = 1024u;
public const val `MUTZ_RESERVED`: UInt = 512u;
public const val `OIBDG_APARTMENTTHREADED`: `OIBDG_FLAGS` = 256;
public const val `OIBDG_DATAONLY`: `OIBDG_FLAGS` = 4096;
public typealias `OIBDG_FLAGS` = Int;
public typealias `PARSEACTION` = Int;
public const val `PARSE_ANCHOR`: `PARSEACTION` = 6;
public const val `PARSE_CANONICALIZE`: `PARSEACTION` = 1;
public const val `PARSE_DECODE_IS_ESCAPE`: `PARSEACTION` = 8;
public const val `PARSE_DOCUMENT`: `PARSEACTION` = 5;
public const val `PARSE_DOMAIN`: `PARSEACTION` = 15;
public const val `PARSE_ENCODE_IS_UNESCAPE`: `PARSEACTION` = 7;
public const val `PARSE_ESCAPE`: `PARSEACTION` = 18;
public const val `PARSE_FRIENDLY`: `PARSEACTION` = 2;
public const val `PARSE_LOCATION`: `PARSEACTION` = 16;
public const val `PARSE_MIME`: `PARSEACTION` = 11;
public const val `PARSE_PATH_FROM_URL`: `PARSEACTION` = 9;
public const val `PARSE_ROOTDOCUMENT`: `PARSEACTION` = 4;
public const val `PARSE_SCHEMA`: `PARSEACTION` = 13;
public const val `PARSE_SECURITY_DOMAIN`: `PARSEACTION` = 17;
public const val `PARSE_SECURITY_URL`: `PARSEACTION` = 3;
public const val `PARSE_SERVER`: `PARSEACTION` = 12;
public const val `PARSE_SITE`: `PARSEACTION` = 14;
public const val `PARSE_UNESCAPE`: `PARSEACTION` = 19;
public const val `PARSE_URL_FROM_PATH`: `PARSEACTION` = 10;
public const val `PD_FORCE_SWITCH`: `PI_FLAGS` = 65536;
public const val `PI_APARTMENTTHREADED`: `PI_FLAGS` = 256;
public const val `PI_CLASSINSTALL`: `PI_FLAGS` = 512;
public const val `PI_CLSIDLOOKUP`: `PI_FLAGS` = 32;
public const val `PI_DATAPROGRESS`: `PI_FLAGS` = 64;
public const val `PI_FILTER_MODE`: `PI_FLAGS` = 2;
public typealias `PI_FLAGS` = Int;
public const val `PI_FORCE_ASYNC`: `PI_FLAGS` = 4;
public const val `PI_LOADAPPDIRECT`: `PI_FLAGS` = 16384;
public const val `PI_MIMEVERIFICATION`: `PI_FLAGS` = 16;
public const val `PI_NOMIMEHANDLER`: `PI_FLAGS` = 32768;
public const val `PI_PARSE_URL`: `PI_FLAGS` = 1;
public const val `PI_PASSONBINDCTX`: `PI_FLAGS` = 8192;
public const val `PI_PREFERDEFAULTHANDLER`: `PI_FLAGS` = 131072;
public const val `PI_SYNCHRONOUS`: `PI_FLAGS` = 128;
public const val `PI_USE_WORKERTHREAD`: `PI_FLAGS` = 8;
public const val `POPUPLEVELPROP`: `MONIKERPROPERTY` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROTOCOLDATA` (
    public var `grfFlags`: UInt,
    public var `dwState`: UInt,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbData`: UInt,
)
// UNSUPPORTED Rust 526:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROTOCOLDATA {
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
public class `PROTOCOLFILTERDATA` (
    public var `cbSize`: UInt,
    public var `pProtocolSink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pProtocol`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pUnk`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwFilterFlags`: UInt,
)
// UNSUPPORTED Rust 540:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROTOCOLFILTERDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROTOCOLFLAG_NO_PICS_CHECK`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROTOCOL_ARGUMENT` (
    public var `szMethod`: `windows_sys`.`core`.`PCWSTR`,
    public var `szTargetUrl`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 552:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROTOCOL_ARGUMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PSUACTION` = Int;
public const val `PSU_DEFAULT`: `PSUACTION` = 1;
public const val `PSU_SECURITY_URL_ONLY`: `PSUACTION` = 2;
public typealias `PUAF` = Int;
public typealias `PUAFOUT` = Int;
public const val `PUAFOUT_DEFAULT`: `PUAFOUT` = 0;
public const val `PUAFOUT_ISLOCKZONEPOLICY`: `PUAFOUT` = 1;
public const val `PUAF_ACCEPT_WILDCARD_SCHEME`: `PUAF` = 128;
public const val `PUAF_CHECK_TIFS`: `PUAF` = 16;
public const val `PUAF_DEFAULT`: `PUAF` = 0;
public const val `PUAF_DEFAULTZONEPOL`: `PUAF` = 262144;
public const val `PUAF_DONTCHECKBOXINDIALOG`: `PUAF` = 32;
public const val `PUAF_DONT_USE_CACHE`: `PUAF` = 4096;
public const val `PUAF_DRAGPROTOCOLCHECK`: `PUAF` = 2097152;
public const val `PUAF_ENFORCERESTRICTED`: `PUAF` = 256;
public const val `PUAF_FORCEUI_FOREGROUND`: `PUAF` = 8;
public const val `PUAF_ISFILE`: `PUAF` = 2;
public const val `PUAF_LMZ_LOCKED`: `PUAF` = 131072;
public const val `PUAF_LMZ_UNLOCKED`: `PUAF` = 65536;
public const val `PUAF_NOSAVEDFILECHECK`: `PUAF` = 512;
public const val `PUAF_NOUI`: `PUAF` = 1;
public const val `PUAF_NOUIIFLOCKED`: `PUAF` = 1048576;
public const val `PUAF_NPL_USE_LOCKED_IF_RESTRICTED`: `PUAF` = 524288;
public const val `PUAF_REQUIRESAVEDFILECHECK`: `PUAF` = 1024;
public const val `PUAF_RESERVED1`: `PUAF` = 8192;
public const val `PUAF_RESERVED2`: `PUAF` = 16384;
public const val `PUAF_TRUSTED`: `PUAF` = 64;
public const val `PUAF_WARN_IF_DENIED`: `PUAF` = 4;
public typealias `QUERYOPTION` = Int;
public const val `QUERY_CAN_NAVIGATE`: `QUERYOPTION` = 7;
public const val `QUERY_CONTENT_ENCODING`: `QUERYOPTION` = 3;
public const val `QUERY_CONTENT_TYPE`: `QUERYOPTION` = 4;
public const val `QUERY_EXPIRATION_DATE`: `QUERYOPTION` = 1;
public const val `QUERY_IS_CACHED`: `QUERYOPTION` = 9;
public const val `QUERY_IS_CACHED_AND_USABLE_OFFLINE`: `QUERYOPTION` = 16;
public const val `QUERY_IS_CACHED_OR_MAPPED`: `QUERYOPTION` = 11;
public const val `QUERY_IS_INSTALLEDENTRY`: `QUERYOPTION` = 10;
public const val `QUERY_IS_SAFE`: `QUERYOPTION` = 14;
public const val `QUERY_IS_SECURE`: `QUERYOPTION` = 13;
public const val `QUERY_RECOMBINE`: `QUERYOPTION` = 6;
public const val `QUERY_REFRESH`: `QUERYOPTION` = 5;
public const val `QUERY_TIME_OF_LAST_CHANGE`: `QUERYOPTION` = 2;
public const val `QUERY_USES_CACHE`: `QUERYOPTION` = 12;
public const val `QUERY_USES_HISTORYFOLDER`: `QUERYOPTION` = 15;
public const val `QUERY_USES_NETWORK`: `QUERYOPTION` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REMSECURITY_ATTRIBUTES` (
    public var `nLength`: UInt,
    public var `lpSecurityDescriptor`: UInt,
    public var `bInheritHandle`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RemBINDINFO` (
    public var `cbSize`: UInt,
    public var `szExtraInfo`: `windows_sys`.`core`.`PWSTR`,
    public var `grfBindInfoF`: UInt,
    public var `dwBindVerb`: UInt,
    public var `szCustomVerb`: `windows_sys`.`core`.`PWSTR`,
    public var `cbstgmedData`: UInt,
    public var `dwOptions`: UInt,
    public var `dwOptionsFlags`: UInt,
    public var `dwCodePage`: UInt,
    public var `securityAttributes`: `REMSECURITY_ATTRIBUTES`,
    public var `iid`: `windows_sys`.`core`.`GUID`,
    public var `pUnk`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemBINDINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RemFORMATETC` (
    public var `cfFormat`: UInt,
    public var `ptd`: UInt,
    public var `dwAspect`: UInt,
    public var `lindex`: Int,
    public var `tymed`: UInt,
)
public const val `SECURITY_IE_STATE_GREEN`: UInt = 0u;
public const val `SECURITY_IE_STATE_RED`: UInt = 1u;
public const val `SET_FEATURE_IN_REGISTRY`: UInt = 4u;
public const val `SET_FEATURE_ON_PROCESS`: UInt = 2u;
public const val `SET_FEATURE_ON_THREAD`: UInt = 1u;
public const val `SET_FEATURE_ON_THREAD_INTERNET`: UInt = 64u;
public const val `SET_FEATURE_ON_THREAD_INTRANET`: UInt = 16u;
public const val `SET_FEATURE_ON_THREAD_LOCALMACHINE`: UInt = 8u;
public const val `SET_FEATURE_ON_THREAD_RESTRICTED`: UInt = 128u;
public const val `SET_FEATURE_ON_THREAD_TRUSTED`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SOFTDISTINFO` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwAdState`: UInt,
    public var `szTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `szAbstract`: `windows_sys`.`core`.`PWSTR`,
    public var `szHREF`: `windows_sys`.`core`.`PWSTR`,
    public var `dwInstalledVersionMS`: UInt,
    public var `dwInstalledVersionLS`: UInt,
    public var `dwUpdateVersionMS`: UInt,
    public var `dwUpdateVersionLS`: UInt,
    public var `dwAdvertisedVersionMS`: UInt,
    public var `dwAdvertisedVersionLS`: UInt,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 667:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SOFTDISTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SOFTDIST_ADSTATE_AVAILABLE`: UInt = 1u;
public const val `SOFTDIST_ADSTATE_DOWNLOADED`: UInt = 2u;
public const val `SOFTDIST_ADSTATE_INSTALLED`: UInt = 3u;
public const val `SOFTDIST_ADSTATE_NONE`: UInt = 0u;
public const val `SOFTDIST_FLAG_DELETE_SUBSCRIPTION`: UInt = 8u;
public const val `SOFTDIST_FLAG_USAGE_AUTOINSTALL`: UInt = 4u;
public const val `SOFTDIST_FLAG_USAGE_EMAIL`: UInt = 1u;
public const val `SOFTDIST_FLAG_USAGE_PRECACHE`: UInt = 2u;
public const val `SZM_CREATE`: `SZM_FLAGS` = 0;
public const val `SZM_DELETE`: `SZM_FLAGS` = 1;
public typealias `SZM_FLAGS` = Int;
public const val `S_ASYNCHRONOUS`: Int = 262632;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `StartParam` (
    public var `iid`: `windows_sys`.`core`.`GUID`,
    public var `pIBindCtx`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pItf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for StartParam {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TRUSTEDDOWNLOADPROP`: `MONIKERPROPERTY` = 3;
public const val `UAS_EXACTLEGACY`: UInt = 4096u;
public const val `URLACTION_ACTIVEX_ALLOW_TDC`: UInt = 4620u;
public const val `URLACTION_ACTIVEX_CONFIRM_NOOBJECTSAFETY`: UInt = 4612u;
public const val `URLACTION_ACTIVEX_CURR_MAX`: UInt = 4620u;
public const val `URLACTION_ACTIVEX_DYNSRC_VIDEO_AND_ANIMATION`: UInt = 4618u;
public const val `URLACTION_ACTIVEX_MAX`: UInt = 5119u;
public const val `URLACTION_ACTIVEX_MIN`: UInt = 4608u;
public const val `URLACTION_ACTIVEX_NO_WEBOC_SCRIPT`: UInt = 4614u;
public const val `URLACTION_ACTIVEX_OVERRIDE_DATA_SAFETY`: UInt = 4610u;
public const val `URLACTION_ACTIVEX_OVERRIDE_DOMAINLIST`: UInt = 4619u;
public const val `URLACTION_ACTIVEX_OVERRIDE_OBJECT_SAFETY`: UInt = 4609u;
public const val `URLACTION_ACTIVEX_OVERRIDE_OPTIN`: UInt = 4616u;
public const val `URLACTION_ACTIVEX_OVERRIDE_REPURPOSEDETECTION`: UInt = 4615u;
public const val `URLACTION_ACTIVEX_OVERRIDE_SCRIPT_SAFETY`: UInt = 4611u;
public const val `URLACTION_ACTIVEX_RUN`: UInt = 4608u;
public const val `URLACTION_ACTIVEX_SCRIPTLET_RUN`: UInt = 4617u;
public const val `URLACTION_ACTIVEX_TREATASUNTRUSTED`: UInt = 4613u;
public const val `URLACTION_ALLOW_ACTIVEX_FILTERING`: UInt = 9986u;
public const val `URLACTION_ALLOW_ANTIMALWARE_SCANNING_OF_ACTIVEX`: UInt = 9996u;
public const val `URLACTION_ALLOW_APEVALUATION`: UInt = 8961u;
public const val `URLACTION_ALLOW_AUDIO_VIDEO`: UInt = 9985u;
public const val `URLACTION_ALLOW_AUDIO_VIDEO_PLUGINS`: UInt = 9988u;
public const val `URLACTION_ALLOW_CROSSDOMAIN_APPCACHE_MANIFEST`: UInt = 9994u;
public const val `URLACTION_ALLOW_CROSSDOMAIN_DROP_ACROSS_WINDOWS`: UInt = 9993u;
public const val `URLACTION_ALLOW_CROSSDOMAIN_DROP_WITHIN_WINDOW`: UInt = 9992u;
public const val `URLACTION_ALLOW_CSS_EXPRESSIONS`: UInt = 9997u;
public const val `URLACTION_ALLOW_JSCRIPT_IE`: UInt = 5133u;
public const val `URLACTION_ALLOW_RENDER_LEGACY_DXTFILTERS`: UInt = 9995u;
public const val `URLACTION_ALLOW_RESTRICTEDPROTOCOLS`: UInt = 8960u;
public const val `URLACTION_ALLOW_STRUCTURED_STORAGE_SNIFFING`: UInt = 9987u;
public const val `URLACTION_ALLOW_VBSCRIPT_IE`: UInt = 5132u;
public const val `URLACTION_ALLOW_XDOMAIN_SUBFRAME_RESIZE`: UInt = 5128u;
public const val `URLACTION_ALLOW_XHR_EVALUATION`: UInt = 8962u;
public const val `URLACTION_ALLOW_ZONE_ELEVATION_OPT_OUT_ADDITION`: UInt = 9990u;
public const val `URLACTION_ALLOW_ZONE_ELEVATION_VIA_OPT_OUT`: UInt = 9989u;
public const val `URLACTION_AUTHENTICATE_CLIENT`: UInt = 6657u;
public const val `URLACTION_AUTOMATIC_ACTIVEX_UI`: UInt = 8705u;
public const val `URLACTION_AUTOMATIC_DOWNLOAD_UI`: UInt = 8704u;
public const val `URLACTION_AUTOMATIC_DOWNLOAD_UI_MIN`: UInt = 8704u;
public const val `URLACTION_BEHAVIOR_MIN`: UInt = 8192u;
public const val `URLACTION_BEHAVIOR_RUN`: UInt = 8192u;
public const val `URLACTION_CHANNEL_SOFTDIST_MAX`: UInt = 7935u;
public const val `URLACTION_CHANNEL_SOFTDIST_MIN`: UInt = 7680u;
public const val `URLACTION_CHANNEL_SOFTDIST_PERMISSIONS`: UInt = 7685u;
public const val `URLACTION_CLIENT_CERT_PROMPT`: UInt = 6660u;
public const val `URLACTION_COOKIES`: UInt = 6658u;
public const val `URLACTION_COOKIES_ENABLED`: UInt = 6672u;
public const val `URLACTION_COOKIES_SESSION`: UInt = 6659u;
public const val `URLACTION_COOKIES_SESSION_THIRD_PARTY`: UInt = 6662u;
public const val `URLACTION_COOKIES_THIRD_PARTY`: UInt = 6661u;
public const val `URLACTION_CREDENTIALS_USE`: UInt = 6656u;
public const val `URLACTION_CROSS_DOMAIN_DATA`: UInt = 5126u;
public const val `URLACTION_DOTNET_USERCONTROLS`: UInt = 8197u;
public const val `URLACTION_DOWNLOAD_CURR_MAX`: UInt = 4100u;
public const val `URLACTION_DOWNLOAD_MAX`: UInt = 4607u;
public const val `URLACTION_DOWNLOAD_MIN`: UInt = 4096u;
public const val `URLACTION_DOWNLOAD_SIGNED_ACTIVEX`: UInt = 4097u;
public const val `URLACTION_DOWNLOAD_UNSIGNED_ACTIVEX`: UInt = 4100u;
public const val `URLACTION_FEATURE_BLOCK_INPUT_PROMPTS`: UInt = 8453u;
public const val `URLACTION_FEATURE_CROSSDOMAIN_FOCUS_CHANGE`: UInt = 8455u;
public const val `URLACTION_FEATURE_DATA_BINDING`: UInt = 8454u;
public const val `URLACTION_FEATURE_FORCE_ADDR_AND_STATUS`: UInt = 8452u;
public const val `URLACTION_FEATURE_MIME_SNIFFING`: UInt = 8448u;
public const val `URLACTION_FEATURE_MIN`: UInt = 8448u;
public const val `URLACTION_FEATURE_SCRIPT_STATUS_BAR`: UInt = 8451u;
public const val `URLACTION_FEATURE_WINDOW_RESTRICTIONS`: UInt = 8450u;
public const val `URLACTION_FEATURE_ZONE_ELEVATION`: UInt = 8449u;
public const val `URLACTION_HTML_ALLOW_CROSS_DOMAIN_CANVAS`: UInt = 5645u;
public const val `URLACTION_HTML_ALLOW_CROSS_DOMAIN_TEXTTRACK`: UInt = 5648u;
public const val `URLACTION_HTML_ALLOW_CROSS_DOMAIN_WEBWORKER`: UInt = 5647u;
public const val `URLACTION_HTML_ALLOW_INDEXEDDB`: UInt = 5649u;
public const val `URLACTION_HTML_ALLOW_INJECTED_DYNAMIC_HTML`: UInt = 5643u;
public const val `URLACTION_HTML_ALLOW_WINDOW_CLOSE`: UInt = 5646u;
public const val `URLACTION_HTML_FONT_DOWNLOAD`: UInt = 5636u;
public const val `URLACTION_HTML_INCLUDE_FILE_PATH`: UInt = 5642u;
public const val `URLACTION_HTML_JAVA_RUN`: UInt = 5637u;
public const val `URLACTION_HTML_MAX`: UInt = 6143u;
public const val `URLACTION_HTML_META_REFRESH`: UInt = 5640u;
public const val `URLACTION_HTML_MIN`: UInt = 5632u;
public const val `URLACTION_HTML_MIXED_CONTENT`: UInt = 5641u;
public const val `URLACTION_HTML_REQUIRE_UTF8_DOCUMENT_CODEPAGE`: UInt = 5644u;
public const val `URLACTION_HTML_SUBFRAME_NAVIGATE`: UInt = 5639u;
public const val `URLACTION_HTML_SUBMIT_FORMS`: UInt = 5633u;
public const val `URLACTION_HTML_SUBMIT_FORMS_FROM`: UInt = 5634u;
public const val `URLACTION_HTML_SUBMIT_FORMS_TO`: UInt = 5635u;
public const val `URLACTION_HTML_USERDATA_SAVE`: UInt = 5638u;
public const val `URLACTION_INFODELIVERY_CURR_MAX`: UInt = 7430u;
public const val `URLACTION_INFODELIVERY_MAX`: UInt = 7679u;
public const val `URLACTION_INFODELIVERY_MIN`: UInt = 7424u;
public const val `URLACTION_INFODELIVERY_NO_ADDING_CHANNELS`: UInt = 7424u;
public const val `URLACTION_INFODELIVERY_NO_ADDING_SUBSCRIPTIONS`: UInt = 7427u;
public const val `URLACTION_INFODELIVERY_NO_CHANNEL_LOGGING`: UInt = 7430u;
public const val `URLACTION_INFODELIVERY_NO_EDITING_CHANNELS`: UInt = 7425u;
public const val `URLACTION_INFODELIVERY_NO_EDITING_SUBSCRIPTIONS`: UInt = 7428u;
public const val `URLACTION_INFODELIVERY_NO_REMOVING_CHANNELS`: UInt = 7426u;
public const val `URLACTION_INFODELIVERY_NO_REMOVING_SUBSCRIPTIONS`: UInt = 7429u;
public const val `URLACTION_INPRIVATE_BLOCKING`: UInt = 9984u;
public const val `URLACTION_JAVA_CURR_MAX`: UInt = 7168u;
public const val `URLACTION_JAVA_MAX`: UInt = 7423u;
public const val `URLACTION_JAVA_MIN`: UInt = 7168u;
public const val `URLACTION_JAVA_PERMISSIONS`: UInt = 7168u;
public const val `URLACTION_LOOSE_XAML`: UInt = 9218u;
public const val `URLACTION_LOWRIGHTS`: UInt = 9472u;
public const val `URLACTION_MIN`: UInt = 4096u;
public const val `URLACTION_NETWORK_CURR_MAX`: UInt = 6672u;
public const val `URLACTION_NETWORK_MAX`: UInt = 7167u;
public const val `URLACTION_NETWORK_MIN`: UInt = 6656u;
public const val `URLACTION_PLUGGABLE_PROTOCOL_XHR`: UInt = 5131u;
public const val `URLACTION_SCRIPT_CURR_MAX`: UInt = 5133u;
public const val `URLACTION_SCRIPT_JAVA_USE`: UInt = 5122u;
public const val `URLACTION_SCRIPT_MAX`: UInt = 5631u;
public const val `URLACTION_SCRIPT_MIN`: UInt = 5120u;
public const val `URLACTION_SCRIPT_NAVIGATE`: UInt = 5130u;
public const val `URLACTION_SCRIPT_OVERRIDE_SAFETY`: UInt = 5121u;
public const val `URLACTION_SCRIPT_PASTE`: UInt = 5127u;
public const val `URLACTION_SCRIPT_RUN`: UInt = 5120u;
public const val `URLACTION_SCRIPT_SAFE_ACTIVEX`: UInt = 5125u;
public const val `URLACTION_SCRIPT_XSSFILTER`: UInt = 5129u;
public const val `URLACTION_SHELL_ALLOW_CROSS_SITE_SHARE`: UInt = 6161u;
public const val `URLACTION_SHELL_CURR_MAX`: UInt = 6162u;
public const val `URLACTION_SHELL_ENHANCED_DRAGDROP_SECURITY`: UInt = 6155u;
public const val `URLACTION_SHELL_EXECUTE_HIGHRISK`: UInt = 6150u;
public const val `URLACTION_SHELL_EXECUTE_LOWRISK`: UInt = 6152u;
public const val `URLACTION_SHELL_EXECUTE_MODRISK`: UInt = 6151u;
public const val `URLACTION_SHELL_EXTENSIONSECURITY`: UInt = 6156u;
public const val `URLACTION_SHELL_FILE_DOWNLOAD`: UInt = 6147u;
public const val `URLACTION_SHELL_INSTALL_DTITEMS`: UInt = 6144u;
public const val `URLACTION_SHELL_MAX`: UInt = 6655u;
public const val `URLACTION_SHELL_MIN`: UInt = 6144u;
public const val `URLACTION_SHELL_MOVE_OR_COPY`: UInt = 6146u;
public const val `URLACTION_SHELL_POPUPMGR`: UInt = 6153u;
public const val `URLACTION_SHELL_PREVIEW`: UInt = 6159u;
public const val `URLACTION_SHELL_REMOTEQUERY`: UInt = 6158u;
public const val `URLACTION_SHELL_RTF_OBJECTS_LOAD`: UInt = 6154u;
public const val `URLACTION_SHELL_SECURE_DRAGSOURCE`: UInt = 6157u;
public const val `URLACTION_SHELL_SHARE`: UInt = 6160u;
public const val `URLACTION_SHELL_SHELLEXECUTE`: UInt = 6150u;
public const val `URLACTION_SHELL_TOCTOU_RISK`: UInt = 6162u;
public const val `URLACTION_SHELL_VERB`: UInt = 6148u;
public const val `URLACTION_SHELL_WEBVIEW_VERB`: UInt = 6149u;
public const val `URLACTION_WINDOWS_BROWSER_APPLICATIONS`: UInt = 9216u;
public const val `URLACTION_WINFX_SETUP`: UInt = 9728u;
public const val `URLACTION_XPS_DOCUMENTS`: UInt = 9217u;
public const val `URLMON_OPTION_URL_ENCODING`: UInt = 268435460u;
public const val `URLMON_OPTION_USERAGENT`: UInt = 268435457u;
public const val `URLMON_OPTION_USERAGENT_REFRESH`: UInt = 268435458u;
public const val `URLMON_OPTION_USE_BINDSTRINGCREDS`: UInt = 268435464u;
public const val `URLMON_OPTION_USE_BROWSERAPPSDOCUMENTS`: UInt = 268435472u;
public const val `URLOSTRM_GETNEWESTVERSION`: UInt = 3u;
public const val `URLOSTRM_USECACHEDCOPY`: UInt = 2u;
public const val `URLOSTRM_USECACHEDCOPY_ONLY`: UInt = 1u;
public const val `URLPOLICY_ACTIVEX_CHECK_LIST`: UInt = 65536u;
public const val `URLPOLICY_ALLOW`: UInt = 0u;
public const val `URLPOLICY_AUTHENTICATE_CHALLENGE_RESPONSE`: UInt = 65536u;
public const val `URLPOLICY_AUTHENTICATE_CLEARTEXT_OK`: UInt = 0u;
public const val `URLPOLICY_AUTHENTICATE_MUTUAL_ONLY`: UInt = 196608u;
public const val `URLPOLICY_BEHAVIOR_CHECK_LIST`: UInt = 65536u;
public const val `URLPOLICY_CHANNEL_SOFTDIST_AUTOINSTALL`: UInt = 196608u;
public const val `URLPOLICY_CHANNEL_SOFTDIST_PRECACHE`: UInt = 131072u;
public const val `URLPOLICY_CHANNEL_SOFTDIST_PROHIBIT`: UInt = 65536u;
public const val `URLPOLICY_CREDENTIALS_ANONYMOUS_ONLY`: UInt = 196608u;
public const val `URLPOLICY_CREDENTIALS_CONDITIONAL_PROMPT`: UInt = 131072u;
public const val `URLPOLICY_CREDENTIALS_MUST_PROMPT_USER`: UInt = 65536u;
public const val `URLPOLICY_CREDENTIALS_SILENT_LOGON_OK`: UInt = 0u;
public const val `URLPOLICY_DISALLOW`: UInt = 3u;
public const val `URLPOLICY_DONTCHECKDLGBOX`: UInt = 256u;
public const val `URLPOLICY_JAVA_CUSTOM`: UInt = 8388608u;
public const val `URLPOLICY_JAVA_HIGH`: UInt = 65536u;
public const val `URLPOLICY_JAVA_LOW`: UInt = 196608u;
public const val `URLPOLICY_JAVA_MEDIUM`: UInt = 131072u;
public const val `URLPOLICY_JAVA_PROHIBIT`: UInt = 0u;
public const val `URLPOLICY_LOG_ON_ALLOW`: UInt = 64u;
public const val `URLPOLICY_LOG_ON_DISALLOW`: UInt = 128u;
public const val `URLPOLICY_MASK_PERMISSIONS`: UInt = 15u;
public const val `URLPOLICY_NOTIFY_ON_ALLOW`: UInt = 16u;
public const val `URLPOLICY_NOTIFY_ON_DISALLOW`: UInt = 32u;
public const val `URLPOLICY_QUERY`: UInt = 1u;
public typealias `URLTEMPLATE` = Int;
public const val `URLTEMPLATE_CUSTOM`: `URLTEMPLATE` = 0;
public const val `URLTEMPLATE_HIGH`: `URLTEMPLATE` = 73728;
public const val `URLTEMPLATE_LOW`: `URLTEMPLATE` = 65536;
public const val `URLTEMPLATE_MEDHIGH`: `URLTEMPLATE` = 70912;
public const val `URLTEMPLATE_MEDIUM`: `URLTEMPLATE` = 69632;
public const val `URLTEMPLATE_MEDLOW`: `URLTEMPLATE` = 66816;
public const val `URLTEMPLATE_PREDEFINED_MAX`: `URLTEMPLATE` = 131072;
public const val `URLTEMPLATE_PREDEFINED_MIN`: `URLTEMPLATE` = 65536;
public typealias `URLZONE` = Int;
public typealias `URLZONEREG` = Int;
public const val `URLZONEREG_DEFAULT`: `URLZONEREG` = 0;
public const val `URLZONEREG_HKCU`: `URLZONEREG` = 2;
public const val `URLZONEREG_HKLM`: `URLZONEREG` = 1;
public const val `URLZONE_ESC_FLAG`: UInt = 256u;
public const val `URLZONE_INTERNET`: `URLZONE` = 3;
public const val `URLZONE_INTRANET`: `URLZONE` = 1;
public const val `URLZONE_INVALID`: `URLZONE` = -1;
public const val `URLZONE_LOCAL_MACHINE`: `URLZONE` = 0;
public const val `URLZONE_PREDEFINED_MAX`: `URLZONE` = 999;
public const val `URLZONE_PREDEFINED_MIN`: `URLZONE` = 0;
public const val `URLZONE_TRUSTED`: `URLZONE` = 2;
public const val `URLZONE_UNTRUSTED`: `URLZONE` = 4;
public const val `URLZONE_USER_MAX`: `URLZONE` = 10000;
public const val `URLZONE_USER_MIN`: `URLZONE` = 1000;
public typealias `URL_ENCODING` = Int;
public const val `URL_ENCODING_DISABLE_UTF8`: `URL_ENCODING` = 536870912;
public const val `URL_ENCODING_ENABLE_UTF8`: `URL_ENCODING` = 268435456;
public const val `URL_ENCODING_NONE`: `URL_ENCODING` = 0;
public const val `URL_MK_LEGACY`: UInt = 0u;
public const val `URL_MK_NO_CANONICALIZE`: UInt = 2u;
public const val `URL_MK_UNIFORM`: UInt = 1u;
public const val `USE_SRC_URL`: `MONIKERPROPERTY` = 1;
public const val `UriBuilder_USE_ORIGINAL_FLAGS`: UInt = 1u;
public const val `Uri_DISPLAY_IDN_HOST`: UInt = 4u;
public const val `Uri_DISPLAY_NO_FRAGMENT`: UInt = 1u;
public const val `Uri_DISPLAY_NO_PUNYCODE`: UInt = 8u;
public const val `Uri_ENCODING_HOST_IS_IDN`: UInt = 4u;
public const val `Uri_ENCODING_HOST_IS_PERCENT_ENCODED_CP`: UInt = 16u;
public const val `Uri_ENCODING_HOST_IS_PERCENT_ENCODED_UTF8`: UInt = 8u;
public const val `Uri_ENCODING_QUERY_AND_FRAGMENT_IS_CP`: UInt = 64u;
public const val `Uri_ENCODING_QUERY_AND_FRAGMENT_IS_PERCENT_ENCODED_UTF8`: UInt = 32u;
public const val `Uri_ENCODING_USER_INFO_AND_PATH_IS_CP`: UInt = 2u;
public const val `Uri_ENCODING_USER_INFO_AND_PATH_IS_PERCENT_ENCODED_UTF8`: UInt = 1u;
public const val `Uri_HOST_DNS`: `Uri_HOST_TYPE` = 1;
public const val `Uri_HOST_IDN`: `Uri_HOST_TYPE` = 4;
public const val `Uri_HOST_IPV4`: `Uri_HOST_TYPE` = 2;
public const val `Uri_HOST_IPV6`: `Uri_HOST_TYPE` = 3;
public typealias `Uri_HOST_TYPE` = Int;
public const val `Uri_HOST_UNKNOWN`: `Uri_HOST_TYPE` = 0;
public const val `Uri_PUNYCODE_IDN_HOST`: UInt = 2u;
public const val `WININETINFO_OPTION_LOCK_HANDLE`: UInt = 65534u;
public typealias `ZAFLAGS` = Int;
public const val `ZAFLAGS_ADD_SITES`: `ZAFLAGS` = 2;
public const val `ZAFLAGS_CUSTOM_EDIT`: `ZAFLAGS` = 1;
public const val `ZAFLAGS_DETECT_INTRANET`: `ZAFLAGS` = 256;
public const val `ZAFLAGS_INCLUDE_INTRANET_SITES`: `ZAFLAGS` = 16;
public const val `ZAFLAGS_INCLUDE_PROXY_OVERRIDE`: `ZAFLAGS` = 8;
public const val `ZAFLAGS_NO_CACHE`: `ZAFLAGS` = 262144;
public const val `ZAFLAGS_NO_UI`: `ZAFLAGS` = 32;
public const val `ZAFLAGS_REQUIRE_VERIFICATION`: `ZAFLAGS` = 4;
public const val `ZAFLAGS_SUPPORTS_VERIFICATION`: `ZAFLAGS` = 64;
public const val `ZAFLAGS_UNC_AS_INTRANET`: `ZAFLAGS` = 128;
public const val `ZAFLAGS_USE_LOCKED_ZONES`: `ZAFLAGS` = 65536;
public const val `ZAFLAGS_VERIFY_TEMPLATE_SETTINGS`: `ZAFLAGS` = 131072;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 200 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ZONEATTRIBUTES` (
    public var `cbSize`: UInt,
    public var `szDisplayName`: UShortArray,
    public var `szDescription`: UShortArray,
    public var `szIconPath`: UShortArray,
    public var `dwTemplateMinLevel`: UInt,
    public var `dwTemplateRecommended`: UInt,
    public var `dwTemplateCurrentLevel`: UInt,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 951:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ZONEATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

