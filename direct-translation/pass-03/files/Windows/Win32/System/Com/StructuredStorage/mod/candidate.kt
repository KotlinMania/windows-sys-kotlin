// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=ClearPropVariantArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `ClearPropVariantArray`(`rgpropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `cvars` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoGetInstanceFromFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoGetInstanceFromFile`(`pserverinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`COSERVERINFO`>?, `pclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwclsctx` : `super`.`CLSCTX`, `grfmode` : UInt, `pwszname` : `windows_sys`.`core`.`PCWSTR`, `dwcount` : UInt, `presults` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`MULTI_QI`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoGetInstanceFromIStorage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoGetInstanceFromIStorage`(`pserverinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`COSERVERINFO`>?, `pclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwclsctx` : `super`.`CLSCTX`, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcount` : UInt, `presults` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`MULTI_QI`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoGetInterfaceAndReleaseStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoGetInterfaceAndReleaseStream`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `iid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CreateILockBytesOnHGlobal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateILockBytesOnHGlobal`(`hglobal` : `super`.`super`.`super`.`Foundation`.`HGLOBAL`, `fdeleteonrelease` : `windows_sys`.`core`.`BOOL`, `pplkbyt` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CreateStreamOnHGlobal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateStreamOnHGlobal`(`hglobal` : `super`.`super`.`super`.`Foundation`.`HGLOBAL`, `fdeleteonrelease` : `windows_sys`.`core`.`BOOL`, `ppstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=FmtIdToPropStgName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FmtIdToPropStgName`(`pfmtid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `oszname` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=FreePropVariantArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `FreePropVariantArray`(`cvariants` : UInt, `rgvars` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=GetConvertStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetConvertStg`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=GetHGlobalFromILockBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetHGlobalFromILockBytes`(`plkbyt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phglobal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=GetHGlobalFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetHGlobalFromStream`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phglobal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromBooleanVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromBooleanVector`(`prgf` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromBuffer`(`pv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cb` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromCLSID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromCLSID`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromDoubleVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromDoubleVector`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromFileTime`(`pftin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromFileTimeVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromFileTimeVector`(`prgft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromGUIDAsString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromGUIDAsString`(`guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromInt16Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromInt16Vector`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromInt32Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromInt32Vector`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromInt64Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromInt64Vector`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromPropVariantVectorElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromPropVariantVectorElem`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromResource`(`hinst` : `super`.`super`.`super`.`Foundation`.`HINSTANCE`, `id` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromStringAsVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromStringAsVector`(`psz` : `windows_sys`.`core`.`PCWSTR`, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromStringVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromStringVector`(`prgsz` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromUInt16Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromUInt16Vector`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromUInt32Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromUInt32Vector`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantFromUInt64Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantFromUInt64Vector`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `celems` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitPropVariantVectorFromPropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `InitPropVariantVectorFromPropVariant`(`propvarsingle` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ppropvarvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleConvertIStorageToOLESTREAM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleConvertIStorageToOLESTREAM`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpolestream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OLESTREAM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleConvertIStorageToOLESTREAMEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OleConvertIStorageToOLESTREAMEx`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cfformat` : UShort, `lwidth` : Int, `lheight` : Int, `dwsize` : UInt, `pmedium` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?, `polestm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OLESTREAM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleConvertOLESTREAMToIStorage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleConvertOLESTREAMToIStorage`(`lpolestream` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLESTREAM`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ptd` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`DVTARGETDEVICE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleConvertOLESTREAMToIStorageEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OleConvertOLESTREAMToIStorageEx`(`polestm` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLESTREAM`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcfformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `plwwidth` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `plheight` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pmedium` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=PropStgNameToFmtId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PropStgNameToFmtId`(`oszname` : `windows_sys`.`core`.`PCWSTR`, `pfmtid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantChangeType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantChangeType`(`ppropvardest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `propvarsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `flags` : `PROPVAR_CHANGE_FLAGS`, `vt` : `super`.`super`.`Variant`.`VARENUM`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=PropVariantClear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantClear`(`pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantCompareEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantCompareEx`(`propvar1` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `propvar2` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `unit` : `PROPVAR_COMPARE_UNIT`, `flags` : `PROPVAR_COMPARE_FLAGS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=PropVariantCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantCopy`(`pvardest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pvarsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetBooleanElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetBooleanElem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pfval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetDoubleElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetDoubleElem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetElementCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetElementCount`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetFileTimeElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetFileTimeElem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pftval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetInt16Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetInt16Elem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetInt32Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetInt32Elem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetInt64Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetInt64Elem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetStringElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetStringElem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `ppszval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetUInt16Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetUInt16Elem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetUInt32Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetUInt32Elem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantGetUInt64Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantGetUInt64Elem`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToBSTR; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToBSTR`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToBoolean; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToBoolean`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pfret` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToBooleanVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToBooleanVector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `crgf` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToBooleanVectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToBooleanVectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`BOOL`>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToBooleanWithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToBooleanWithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `fdefault` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToBuffer`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cb` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToDouble; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToDouble`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pdblret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToDoubleVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToDoubleVector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToDoubleVectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToDoubleVectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.DoubleVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToDoubleWithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToDoubleWithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `dbldefault` : Double) : Double
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToFileTime`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pstfout` : `super`.`super`.`Variant`.`PSTIME_FLAGS`, `pftout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToFileTimeVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToFileTimeVector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgft` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?, `crgft` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToFileTimeVectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToFileTimeVectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgft` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`FILETIME`>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToGUID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToGUID`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt16`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `piret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt16Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt16Vector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt16VectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt16VectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ShortVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt16WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt16WithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `idefault` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt32`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `plret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt32Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt32Vector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt32VectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt32VectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.IntVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt32WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt32WithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ldefault` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt64`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pllret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt64Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt64Vector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt64VectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt64VectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.LongVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToInt64WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToInt64WithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `lldefault` : Long) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToString`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `psz` : `windows_sys`.`core`.`PWSTR`, `cch` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToStringAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToStringAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ppszout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToStringVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToStringVector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `crgsz` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToStringVectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToStringVectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToStringWithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToStringWithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pszdefault` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt16`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `puiret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt16Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt16Vector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt16VectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt16VectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt16WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt16WithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `uidefault` : UShort) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt32`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pulret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt32Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt32Vector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt32VectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt32VectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt32WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt32WithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `uldefault` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt64`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pullret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt64Vector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt64Vector`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt64VectorAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt64VectorAlloc`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ULongVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToUInt64WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToUInt64WithDefault`(`propvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ulldefault` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `PropVariantToVariant`(`ppropvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=PropVariantToWinRTPropertyValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `PropVariantToWinRTPropertyValue`(`propvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=ReadClassStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadClassStg`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pclsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=ReadClassStm; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadClassStm`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pclsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=ReadFmtUserTypeStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadFmtUserTypeStg`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `lplpszusertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SetConvertStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetConvertStg`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fconvert` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgConvertPropertyToVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `StgConvertPropertyToVariant`(`pprop` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERIALIZEDPROPERTYVALUE`>?, `codepage` : UShort, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `pma` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgConvertVariantToProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `StgConvertVariantToProperty`(`pvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `codepage` : UShort, `pprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SERIALIZEDPROPERTYVALUE`>?, `pcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pid` : UInt, `freserved` : Boolean, `pcindirect` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`SERIALIZEDPROPERTYVALUE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgCreateDocfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgCreateDocfile`(`pwcsname` : `windows_sys`.`core`.`PCWSTR`, `grfmode` : `super`.`STGM`, `reserved` : UInt, `ppstgopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgCreateDocfileOnILockBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgCreateDocfileOnILockBytes`(`plkbyt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfmode` : `super`.`STGM`, `reserved` : UInt, `ppstgopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgCreatePropSetStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgCreatePropSetStg`(`pstorage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreserved` : UInt, `pppropsetstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgCreatePropStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgCreatePropStg`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fmtid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `grfflags` : UInt, `dwreserved` : UInt, `pppropstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgCreateStorageEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `StgCreateStorageEx`(`pwcsname` : `windows_sys`.`core`.`PCWSTR`, `grfmode` : `super`.`STGM`, `stgfmt` : `STGFMT`, `grfattrs` : UInt, `pstgoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STGOPTIONS`>?, `psecuritydescriptor` : `super`.`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppobjectopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=StgDeserializePropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `StgDeserializePropVariant`(`pprop` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERIALIZEDPROPERTYVALUE`>?, `cbmax` : UInt, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgGetIFillLockBytesOnFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgGetIFillLockBytesOnFile`(`pwcsname` : `windows_sys`.`core`.`PCWSTR`, `ppflb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgGetIFillLockBytesOnILockBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgGetIFillLockBytesOnILockBytes`(`pilb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppflb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgIsStorageFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgIsStorageFile`(`pwcsname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgIsStorageILockBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgIsStorageILockBytes`(`plkbyt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgOpenAsyncDocfileOnIFillLockBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgOpenAsyncDocfileOnIFillLockBytes`(`pflb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfmode` : UInt, `asyncflags` : UInt, `ppstgopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dflayout.dll, ABI=system, export=StgOpenLayoutDocfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgOpenLayoutDocfile`(`pwcsdfname` : `windows_sys`.`core`.`PCWSTR`, `grfmode` : UInt, `reserved` : UInt, `ppstgopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgOpenPropStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgOpenPropStg`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fmtid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `grfflags` : UInt, `dwreserved` : UInt, `pppropstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgOpenStorage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgOpenStorage`(`pwcsname` : `windows_sys`.`core`.`PCWSTR`, `pstgpriority` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfmode` : `super`.`STGM`, `snbexclude` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `reserved` : UInt, `ppstgopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgOpenStorageEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `StgOpenStorageEx`(`pwcsname` : `windows_sys`.`core`.`PCWSTR`, `grfmode` : `super`.`STGM`, `stgfmt` : `STGFMT`, `grfattrs` : UInt, `pstgoptions` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STGOPTIONS`>?, `psecuritydescriptor` : `super`.`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppobjectopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgOpenStorageOnILockBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgOpenStorageOnILockBytes`(`plkbyt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstgpriority` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `grfmode` : `super`.`STGM`, `snbexclude` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `reserved` : UInt, `ppstgopen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgPropertyLengthAsVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgPropertyLengthAsVariant`(`pprop` : /* Rust *const */ kotlinx.cinterop.CPointer<`SERIALIZEDPROPERTYVALUE`>?, `cbprop` : UInt, `codepage` : UShort, `breserved` : UByte) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=StgSerializePropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `StgSerializePropVariant`(`ppropvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?, `ppprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`SERIALIZEDPROPERTYVALUE`>>?, `pcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=StgSetTimes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StgSetTimes`(`lpszname` : `windows_sys`.`core`.`PCWSTR`, `pctime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?, `patime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?, `pmtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToPropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
public external fun `VariantToPropVariant`(`pvar` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Variant`.`VARIANT`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=WinRTPropertyValueToPropVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
public external fun `WinRTPropertyValueToPropVariant`(`punkpropertyvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppropvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=WriteClassStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteClassStg`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=WriteClassStm; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteClassStm`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=WriteFmtUserTypeStg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteFmtUserTypeStg`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cf` : UShort, `lpszusertype` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BSTRBLOB` (
    public var `cbSize`: UInt,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 221:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BSTRBLOB {
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
public class `CABOOL` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`VARIANT_BOOL`>?,
)
// UNSUPPORTED Rust 232:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CABOOL {
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
public class `CABSTR` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?,
)
// UNSUPPORTED Rust 243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CABSTR {
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
public class `CABSTRBLOB` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`BSTRBLOB`>?,
)
// UNSUPPORTED Rust 254:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CABSTRBLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAC` (
    public var `cElems`: UInt,
    public var `pElems`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 265:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAC {
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
public class `CACLIPDATA` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CLIPDATA`>?,
)
// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CACLIPDATA {
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
public class `CACLSID` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CACLSID {
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
public class `CACY` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`CY`>?,
)
// UNSUPPORTED Rust 298:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CACY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CADATE` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?,
)
// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CADATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CADBL` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?,
)
// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CADBL {
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
public class `CAFILETIME` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?,
)
// UNSUPPORTED Rust 331:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAFILETIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAFLT` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?,
)
// UNSUPPORTED Rust 342:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAFLT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAH` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?,
)
// UNSUPPORTED Rust 353:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAI` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?,
)
// UNSUPPORTED Rust 364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAL` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
)
// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAL {
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
public class `CALPSTR` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?,
)
// UNSUPPORTED Rust 386:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CALPSTR {
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
public class `CALPWSTR` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CALPWSTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAPROPVARIANT` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPVARIANT`>?,
)
// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for CAPROPVARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CASCODE` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
)
// UNSUPPORTED Rust 421:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CASCODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAUB` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 432:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAUB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAUH` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
)
// UNSUPPORTED Rust 443:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAUH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAUI` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
)
// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAUI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAUL` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAUL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CCH_MAX_PROPSTG_NAME`: UInt = 31u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLIPDATA` (
    public var `cbSize`: UInt,
    public var `ulClipFmt`: Int,
    public var `pClipData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 478:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLIPDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CWCSTORAGENAME`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLESTREAM` (
    public var `lpstbl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLESTREAMVTBL`>?,
)
// UNSUPPORTED Rust 489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLESTREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OLESTREAMVTBL` (
    public var `Get`: Long,
    public var `Put`: Long,
)
public const val `PIDDI_THUMBNAIL`: Int = 2;
public const val `PIDDSI_BYTECOUNT`: UInt = 4u;
public const val `PIDDSI_CATEGORY`: UInt = 2u;
public const val `PIDDSI_COMPANY`: UInt = 15u;
public const val `PIDDSI_DOCPARTS`: UInt = 13u;
public const val `PIDDSI_HEADINGPAIR`: UInt = 12u;
public const val `PIDDSI_HIDDENCOUNT`: UInt = 9u;
public const val `PIDDSI_LINECOUNT`: UInt = 5u;
public const val `PIDDSI_LINKSDIRTY`: UInt = 16u;
public const val `PIDDSI_MANAGER`: UInt = 14u;
public const val `PIDDSI_MMCLIPCOUNT`: UInt = 10u;
public const val `PIDDSI_NOTECOUNT`: UInt = 8u;
public const val `PIDDSI_PARCOUNT`: UInt = 6u;
public const val `PIDDSI_PRESFORMAT`: UInt = 3u;
public const val `PIDDSI_SCALE`: UInt = 11u;
public const val `PIDDSI_SLIDECOUNT`: UInt = 7u;
public const val `PIDMSI_COPYRIGHT`: Int = 11;
public const val `PIDMSI_EDITOR`: Int = 2;
public const val `PIDMSI_OWNER`: Int = 8;
public const val `PIDMSI_PRODUCTION`: Int = 10;
public const val `PIDMSI_PROJECT`: Int = 6;
public const val `PIDMSI_RATING`: Int = 9;
public const val `PIDMSI_SEQUENCE_NO`: Int = 5;
public const val `PIDMSI_SOURCE`: Int = 4;
public const val `PIDMSI_STATUS`: Int = 7;
public const val `PIDMSI_STATUS_DRAFT`: `PIDMSI_STATUS_VALUE` = 3;
public const val `PIDMSI_STATUS_EDIT`: `PIDMSI_STATUS_VALUE` = 5;
public const val `PIDMSI_STATUS_FINAL`: `PIDMSI_STATUS_VALUE` = 8;
public const val `PIDMSI_STATUS_INPROGRESS`: `PIDMSI_STATUS_VALUE` = 4;
public const val `PIDMSI_STATUS_NEW`: `PIDMSI_STATUS_VALUE` = 1;
public const val `PIDMSI_STATUS_NORMAL`: `PIDMSI_STATUS_VALUE` = 0;
public const val `PIDMSI_STATUS_OTHER`: `PIDMSI_STATUS_VALUE` = 32767;
public const val `PIDMSI_STATUS_PRELIM`: `PIDMSI_STATUS_VALUE` = 2;
public const val `PIDMSI_STATUS_PROOF`: `PIDMSI_STATUS_VALUE` = 7;
public const val `PIDMSI_STATUS_REVIEW`: `PIDMSI_STATUS_VALUE` = 6;
public typealias `PIDMSI_STATUS_VALUE` = Int;
public const val `PIDMSI_SUPPLIER`: Int = 3;
public const val `PIDSI_APPNAME`: Int = 18;
public const val `PIDSI_AUTHOR`: Int = 4;
public const val `PIDSI_CHARCOUNT`: Int = 16;
public const val `PIDSI_COMMENTS`: Int = 6;
public const val `PIDSI_CREATE_DTM`: Int = 12;
public const val `PIDSI_DOC_SECURITY`: Int = 19;
public const val `PIDSI_EDITTIME`: Int = 10;
public const val `PIDSI_KEYWORDS`: Int = 5;
public const val `PIDSI_LASTAUTHOR`: Int = 8;
public const val `PIDSI_LASTPRINTED`: Int = 11;
public const val `PIDSI_LASTSAVE_DTM`: Int = 13;
public const val `PIDSI_PAGECOUNT`: Int = 14;
public const val `PIDSI_REVNUMBER`: Int = 9;
public const val `PIDSI_SUBJECT`: Int = 3;
public const val `PIDSI_TEMPLATE`: Int = 7;
public const val `PIDSI_THUMBNAIL`: Int = 17;
public const val `PIDSI_TITLE`: Int = 2;
public const val `PIDSI_WORDCOUNT`: Int = 15;
public const val `PID_BEHAVIOR`: UInt = 2147483651u;
public const val `PID_CODEPAGE`: UInt = 1u;
public const val `PID_DICTIONARY`: UInt = 0u;
public const val `PID_FIRST_NAME_DEFAULT`: UInt = 4095u;
public const val `PID_FIRST_USABLE`: UInt = 2u;
public const val `PID_ILLEGAL`: UInt = 4294967295u;
public const val `PID_LOCALE`: UInt = 2147483648u;
public const val `PID_MAX_READONLY`: UInt = 3221225471u;
public const val `PID_MIN_READONLY`: UInt = 2147483648u;
public const val `PID_MODIFY_TIME`: UInt = 2147483649u;
public const val `PID_SECURITY`: UInt = 2147483650u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPBAG2` (
    public var `dwType`: UInt,
    public var `vt`: `super`.`super`.`Variant`.`VARENUM`,
    public var `cfType`: UShort,
    public var `dwHint`: UInt,
    public var `pstrName`: `windows_sys`.`core`.`PWSTR`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPBAG2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROPSETFLAG_ANSI`: UInt = 2u;
public const val `PROPSETFLAG_CASE_SENSITIVE`: UInt = 8u;
public const val `PROPSETFLAG_DEFAULT`: UInt = 0u;
public const val `PROPSETFLAG_NONSIMPLE`: UInt = 1u;
public const val `PROPSETFLAG_UNBUFFERED`: UInt = 4u;
public const val `PROPSETHDR_OSVERSION_UNKNOWN`: UInt = 4294967295u;
public const val `PROPSET_BEHAVIOR_CASE_SENSITIVE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSPEC` (
    public var `ulKind`: `PROPSPEC_KIND`,
    public var `Anonymous`: `PROPSPEC_0`,
)
// UNSUPPORTED Rust 596:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROPSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 601:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROPSPEC_0 {
//     pub propid: u32,
//     pub lpwstr: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 607:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROPSPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PROPSPEC_KIND` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPVARIANT` (
    public var `Anonymous`: `PROPVARIANT_0`,
)
// UNSUPPORTED Rust 619:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 625:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub union PROPVARIANT_0 {
//     pub Anonymous: PROPVARIANT_0_0,
//     pub decVal: super::super::super::Foundation::DECIMAL,
// }

// UNSUPPORTED Rust 632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPVARIANT_0_0` (
    public var `vt`: `super`.`super`.`Variant`.`VARENUM`,
    public var `wReserved1`: UShort,
    public var `wReserved2`: UShort,
    public var `wReserved3`: UShort,
    public var `Anonymous`: `PROPVARIANT_0_0_0`,
)
// UNSUPPORTED Rust 648:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 654:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub union PROPVARIANT_0_0_0 {
//     pub cVal: i8,
//     pub bVal: u8,
//     pub iVal: i16,
//     pub uiVal: u16,
//     pub lVal: i32,
//     pub ulVal: u32,
//     pub intVal: i32,
//     pub uintVal: u32,
//     pub hVal: i64,
//     pub uhVal: u64,
//     pub fltVal: f32,
//     pub dblVal: f64,
//     pub boolVal: super::super::super::Foundation::VARIANT_BOOL,
//     pub __OBSOLETE__VARIANT_BOOL: super::super::super::Foundation::VARIANT_BOOL,
//     pub scode: i32,
//     pub cyVal: super::CY,
//     pub date: f64,
//     pub filetime: super::super::super::Foundation::FILETIME,
//     pub puuid: *mut windows_sys::core::GUID,
//     pub pclipdata: *mut CLIPDATA,
//     pub bstrVal: windows_sys::core::BSTR,
//     pub bstrblobVal: BSTRBLOB,
//     pub blob: super::BLOB,
//     pub pszVal: windows_sys::core::PSTR,
//     pub pwszVal: windows_sys::core::PWSTR,
//     pub punkVal: *mut core::ffi::c_void,
//     pub pdispVal: *mut core::ffi::c_void,
//     pub pStream: *mut core::ffi::c_void,
//     pub pStorage: *mut core::ffi::c_void,
//     pub pVersionedStream: *mut VERSIONEDSTREAM,
//     pub parray: *mut super::SAFEARRAY,
//     pub cac: CAC,
//     pub caub: CAUB,
//     pub cai: CAI,
//     pub caui: CAUI,
//     pub cal: CAL,
//     pub caul: CAUL,
//     pub cah: CAH,
//     pub cauh: CAUH,
//     pub caflt: CAFLT,
//     pub cadbl: CADBL,
//     pub cabool: CABOOL,
//     pub cascode: CASCODE,
//     pub cacy: CACY,
//     pub cadate: CADATE,
//     pub cafiletime: CAFILETIME,
//     pub cauuid: CACLSID,
//     pub caclipdata: CACLIPDATA,
//     pub cabstr: CABSTR,
//     pub cabstrblob: CABSTRBLOB,
//     pub calpstr: CALPSTR,
//     pub calpwstr: CALPWSTR,
//     pub capropvar: CAPROPVARIANT,
//     pub pcVal: windows_sys::core::PSTR,
//     pub pbVal: *mut u8,
//     pub piVal: *mut i16,
//     pub puiVal: *mut u16,
//     pub plVal: *mut i32,
//     pub pulVal: *mut u32,
//     pub pintVal: *mut i32,
//     pub puintVal: *mut u32,
//     pub pfltVal: *mut f32,
//     pub pdblVal: *mut f64,
//     pub pboolVal: *mut super::super::super::Foundation::VARIANT_BOOL,
//     pub pdecVal: *mut super::super::super::Foundation::DECIMAL,
//     pub pscode: *mut i32,
//     pub pcyVal: *mut super::CY,
//     pub pdate: *mut f64,
//     pub pbstrVal: *mut windows_sys::core::BSTR,
//     pub ppunkVal: *mut *mut core::ffi::c_void,
//     pub ppdispVal: *mut *mut core::ffi::c_void,
//     pub pparray: *mut *mut super::SAFEARRAY,
//     pub pvarVal: *mut PROPVARIANT,
// }

// UNSUPPORTED Rust 732:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PROPVAR_CHANGE_FLAGS` = Int;
public typealias `PROPVAR_COMPARE_FLAGS` = Int;
public typealias `PROPVAR_COMPARE_UNIT` = Int;
public const val `PRSPEC_INVALID`: UInt = 4294967295u;
public const val `PRSPEC_LPWSTR`: `PROPSPEC_KIND` = 0u;
public const val `PRSPEC_PROPID`: `PROPSPEC_KIND` = 1u;
public const val `PVCF_DEFAULT`: `PROPVAR_COMPARE_FLAGS` = 0;
public const val `PVCF_DIGITSASNUMBERS_CASESENSITIVE`: `PROPVAR_COMPARE_FLAGS` = 32;
public const val `PVCF_TREATEMPTYASGREATERTHAN`: `PROPVAR_COMPARE_FLAGS` = 1;
public const val `PVCF_USESTRCMP`: `PROPVAR_COMPARE_FLAGS` = 2;
public const val `PVCF_USESTRCMPC`: `PROPVAR_COMPARE_FLAGS` = 4;
public const val `PVCF_USESTRCMPI`: `PROPVAR_COMPARE_FLAGS` = 8;
public const val `PVCF_USESTRCMPIC`: `PROPVAR_COMPARE_FLAGS` = 16;
public const val `PVCHF_ALPHABOOL`: `PROPVAR_CHANGE_FLAGS` = 2;
public const val `PVCHF_DEFAULT`: `PROPVAR_CHANGE_FLAGS` = 0;
public const val `PVCHF_LOCALBOOL`: `PROPVAR_CHANGE_FLAGS` = 8;
public const val `PVCHF_NOHEXSTRING`: `PROPVAR_CHANGE_FLAGS` = 16;
public const val `PVCHF_NOUSEROVERRIDE`: `PROPVAR_CHANGE_FLAGS` = 4;
public const val `PVCHF_NOVALUEPROP`: `PROPVAR_CHANGE_FLAGS` = 1;
public const val `PVCU_DAY`: `PROPVAR_COMPARE_UNIT` = 4;
public const val `PVCU_DEFAULT`: `PROPVAR_COMPARE_UNIT` = 0;
public const val `PVCU_HOUR`: `PROPVAR_COMPARE_UNIT` = 3;
public const val `PVCU_MINUTE`: `PROPVAR_COMPARE_UNIT` = 2;
public const val `PVCU_MONTH`: `PROPVAR_COMPARE_UNIT` = 5;
public const val `PVCU_SECOND`: `PROPVAR_COMPARE_UNIT` = 1;
public const val `PVCU_YEAR`: `PROPVAR_COMPARE_UNIT` = 6;
// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RemSNB {
//     pub ulCntStr: u32,
//     pub ulCntChar: u32,
//     pub rgString: [u16; 1],
// }

// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RemSNB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 776:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERIALIZEDPROPERTYVALUE {
//     pub dwType: u32,
//     pub rgb: [u8; 1],
// }

// UNSUPPORTED Rust 782:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERIALIZEDPROPERTYVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STATPROPSETSTG` (
    public var `fmtid`: `windows_sys`.`core`.`GUID`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `grfFlags`: UInt,
    public var `mtime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `ctime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `atime`: `super`.`super`.`super`.`Foundation`.`FILETIME`,
    public var `dwOSVersion`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Variant")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STATPROPSTG` (
    public var `lpwstrName`: `windows_sys`.`core`.`PWSTR`,
    public var `propid`: UInt,
    public var `vt`: `super`.`super`.`Variant`.`VARENUM`,
)
// UNSUPPORTED Rust 806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for STATPROPSTG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STGFMT` = UInt;
public const val `STGFMT_ANY`: `STGFMT` = 4u;
public const val `STGFMT_DOCFILE`: `STGFMT` = 5u;
public const val `STGFMT_DOCUMENT`: `STGFMT` = 0u;
public const val `STGFMT_FILE`: `STGFMT` = 3u;
public const val `STGFMT_NATIVE`: `STGFMT` = 1u;
public const val `STGFMT_STORAGE`: `STGFMT` = 0u;
public typealias `STGMOVE` = Int;
public const val `STGMOVE_COPY`: `STGMOVE` = 1;
public const val `STGMOVE_MOVE`: `STGMOVE` = 0;
public const val `STGMOVE_SHALLOWCOPY`: `STGMOVE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STGOPTIONS` (
    public var `usVersion`: UShort,
    public var `reserved`: UShort,
    public var `ulSectorSize`: UInt,
    public var `pwcsTemplateFile`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STGOPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STGOPTIONS_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VERSIONEDSTREAM` (
    public var `guidVersion`: `windows_sys`.`core`.`GUID`,
    public var `pStream`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 843:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VERSIONEDSTREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

