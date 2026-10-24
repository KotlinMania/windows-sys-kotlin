// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=ClearVariantArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `ClearVariantArray`(`pvars` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?, `cvars` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=DosDateTimeToVariantTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DosDateTimeToVariantTime`(`wdosdate` : UShort, `wdostime` : UShort, `pvtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromBooleanArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromBooleanArray`(`prgf` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromBuffer`(`pv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cb` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromDoubleArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromDoubleArray`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromFileTime`(`pft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromFileTimeArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromFileTimeArray`(`prgft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromGUIDAsString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromGUIDAsString`(`guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromInt16Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromInt16Array`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromInt32Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromInt32Array`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromInt64Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromInt64Array`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromResource`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `id` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromStringArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromStringArray`(`prgsz` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromUInt16Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromUInt16Array`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromUInt32Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromUInt32Array`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromUInt64Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromUInt64Array`(`prgn` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `celems` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=InitVariantFromVariantArrayElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `InitVariantFromVariantArrayElem`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SystemTimeToVariantTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SystemTimeToVariantTime`(`lpsystemtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?, `pvtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VARIANT_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VARIANT_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantChangeType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantChangeType`(`pvargdest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pvarsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `wflags` : `VAR_CHANGE_FLAGS`, `vt` : `VARENUM`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantChangeTypeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantChangeTypeEx`(`pvargdest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pvarsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `lcid` : UInt, `wflags` : `VAR_CHANGE_FLAGS`, `vt` : `VARENUM`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantClear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantClear`(`pvarg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantCompare; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantCompare`(`var1` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `var2` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantCopy`(`pvargdest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pvargsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantCopyInd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantCopyInd`(`pvardest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pvargsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetBooleanElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetBooleanElem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pfval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetDoubleElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetDoubleElem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetElementCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetElementCount`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetInt16Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetInt16Elem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetInt32Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetInt32Elem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetInt64Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetInt64Elem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetStringElem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetStringElem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `ppszval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetUInt16Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetUInt16Elem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetUInt32Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetUInt32Elem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantGetUInt64Elem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantGetUInt64Elem`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ielem` : UInt, `pnval` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantInit`(`pvarg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VARIANT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantTimeToDosDateTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VariantTimeToDosDateTime`(`vtime` : Double, `pwdosdate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pwdostime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VariantTimeToSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VariantTimeToSystemTime`(`vtime` : Double, `lpsystemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToBoolean; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToBoolean`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pfret` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToBooleanArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToBooleanArray`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToBooleanArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToBooleanArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`BOOL`>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToBooleanWithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToBooleanWithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `fdefault` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToBuffer`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cb` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToDosDateTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToDosDateTime`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pwdate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `pwtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToDouble; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToDouble`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pdblret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToDoubleArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToDoubleArray`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToDoubleArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToDoubleArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.DoubleVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToDoubleWithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToDoubleWithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `dbldefault` : Double) : Double
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToFileTime`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `stfout` : `PSTIME_FLAGS`, `pftout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToGUID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToGUID`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt16`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `piret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt16Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt16Array`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt16ArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt16ArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ShortVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt16WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt16WithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `idefault` : Short) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt32`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `plret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt32Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt32Array`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt32ArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt32ArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.IntVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt32WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt32WithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ldefault` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt64`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pllret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt64Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt64Array`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt64ArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt64ArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.LongVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToInt64WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToInt64WithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `lldefault` : Long) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToString`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pszbuf` : `windows_sys`.`core`.`PWSTR`, `cchbuf` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToStringAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToStringAlloc`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ppszbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToStringArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToStringArray`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `crgsz` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToStringArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToStringArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToStringWithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToStringWithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pszdefault` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt16; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt16`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `puiret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt16Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt16Array`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt16ArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt16ArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt16WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt16WithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `uidefault` : UShort) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt32; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt32`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pulret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt32Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt32Array`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt32ArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt32ArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt32WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt32WithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `uldefault` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt64`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pullret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt64Array; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt64Array`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `prgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `crgn` : UInt, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt64ArrayAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt64ArrayAlloc`(`var` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `pprgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ULongVar>>?, `pcelem` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=propsys.dll, ABI=system, export=VariantToUInt64WithDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
public external fun `VariantToUInt64WithDefault`(`varin` : /* Rust *const */ kotlinx.cinterop.CPointer<`VARIANT`>?, `ulldefault` : ULong) : ULong
public const val `DPF_ERROR`: `DRAWPROGRESSFLAGS` = 4;
public const val `DPF_MARQUEE`: `DRAWPROGRESSFLAGS` = 1;
public const val `DPF_MARQUEE_COMPLETE`: `DRAWPROGRESSFLAGS` = 2;
public const val `DPF_NONE`: `DRAWPROGRESSFLAGS` = 0;
public const val `DPF_STOPPED`: `DRAWPROGRESSFLAGS` = 16;
public const val `DPF_WARNING`: `DRAWPROGRESSFLAGS` = 8;
public typealias `DRAWPROGRESSFLAGS` = Int;
public const val `PSTF_LOCAL`: `PSTIME_FLAGS` = 1;
public const val `PSTF_UTC`: `PSTIME_FLAGS` = 0;
public typealias `PSTIME_FLAGS` = Int;
public typealias `VARENUM` = UShort;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VARIANT` (
    public var `Anonymous`: `VARIANT_0`,
)
// UNSUPPORTED Rust 186:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 192:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// #[derive(Clone, Copy)]
// pub union VARIANT_0 {
//     pub Anonymous: VARIANT_0_0,
//     pub decVal: super::super::Foundation::DECIMAL,
// }

// UNSUPPORTED Rust 199:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VARIANT_0_0` (
    public var `vt`: `VARENUM`,
    public var `wReserved1`: UShort,
    public var `wReserved2`: UShort,
    public var `wReserved3`: UShort,
    public var `Anonymous`: `VARIANT_0_0_0`,
)
// UNSUPPORTED Rust 215:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 221:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// #[derive(Clone, Copy)]
// pub union VARIANT_0_0_0 {
//     pub llVal: i64,
//     pub lVal: i32,
//     pub bVal: u8,
//     pub iVal: i16,
//     pub fltVal: f32,
//     pub dblVal: f64,
//     pub boolVal: super::super::Foundation::VARIANT_BOOL,
//     pub __OBSOLETE__VARIANT_BOOL: super::super::Foundation::VARIANT_BOOL,
//     pub scode: i32,
//     pub cyVal: super::Com::CY,
//     pub date: f64,
//     pub bstrVal: windows_sys::core::BSTR,
//     pub punkVal: *mut core::ffi::c_void,
//     pub pdispVal: *mut core::ffi::c_void,
//     pub parray: *mut super::Com::SAFEARRAY,
//     pub pbVal: *mut u8,
//     pub piVal: *mut i16,
//     pub plVal: *mut i32,
//     pub pllVal: *mut i64,
//     pub pfltVal: *mut f32,
//     pub pdblVal: *mut f64,
//     pub pboolVal: *mut super::super::Foundation::VARIANT_BOOL,
//     pub __OBSOLETE__VARIANT_PBOOL: *mut super::super::Foundation::VARIANT_BOOL,
//     pub pscode: *mut i32,
//     pub pcyVal: *mut super::Com::CY,
//     pub pdate: *mut f64,
//     pub pbstrVal: *mut windows_sys::core::BSTR,
//     pub ppunkVal: *mut *mut core::ffi::c_void,
//     pub ppdispVal: *mut *mut core::ffi::c_void,
//     pub pparray: *mut *mut super::Com::SAFEARRAY,
//     pub pvarVal: *mut VARIANT,
//     pub byref: *mut core::ffi::c_void,
//     pub cVal: i8,
//     pub uiVal: u16,
//     pub ulVal: u32,
//     pub ullVal: u64,
//     pub intVal: i32,
//     pub uintVal: u32,
//     pub pdecVal: *mut super::super::Foundation::DECIMAL,
//     pub pcVal: windows_sys::core::PSTR,
//     pub puiVal: *mut u16,
//     pub pulVal: *mut u32,
//     pub pullVal: *mut u64,
//     pub pintVal: *mut i32,
//     pub puintVal: *mut u32,
//     pub Anonymous: VARIANT_0_0_0_0,
// }

// UNSUPPORTED Rust 272:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VARIANT_0_0_0_0` (
    public var `pvRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pRecInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 285:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VARIANT_ALPHABOOL`: `VAR_CHANGE_FLAGS` = 2u;
public const val `VARIANT_CALENDAR_GREGORIAN`: `VAR_CHANGE_FLAGS` = 64u;
public const val `VARIANT_CALENDAR_HIJRI`: `VAR_CHANGE_FLAGS` = 8u;
public const val `VARIANT_CALENDAR_THAI`: `VAR_CHANGE_FLAGS` = 32u;
public const val `VARIANT_LOCALBOOL`: `VAR_CHANGE_FLAGS` = 16u;
public const val `VARIANT_NOUSEROVERRIDE`: `VAR_CHANGE_FLAGS` = 4u;
public const val `VARIANT_NOVALUEPROP`: `VAR_CHANGE_FLAGS` = 1u;
public const val `VARIANT_USE_NLS`: `VAR_CHANGE_FLAGS` = 128u;
public typealias `VAR_CHANGE_FLAGS` = UShort;
public const val `VT_ARRAY`: `VARENUM` = 8192u;
public const val `VT_BLOB`: `VARENUM` = 65u;
public const val `VT_BLOB_OBJECT`: `VARENUM` = 70u;
public const val `VT_BOOL`: `VARENUM` = 11u;
public const val `VT_BSTR`: `VARENUM` = 8u;
public const val `VT_BSTR_BLOB`: `VARENUM` = 4095u;
public const val `VT_BYREF`: `VARENUM` = 16384u;
public const val `VT_CARRAY`: `VARENUM` = 28u;
public const val `VT_CF`: `VARENUM` = 71u;
public const val `VT_CLSID`: `VARENUM` = 72u;
public const val `VT_CY`: `VARENUM` = 6u;
public const val `VT_DATE`: `VARENUM` = 7u;
public const val `VT_DECIMAL`: `VARENUM` = 14u;
public const val `VT_DISPATCH`: `VARENUM` = 9u;
public const val `VT_EMPTY`: `VARENUM` = 0u;
public const val `VT_ERROR`: `VARENUM` = 10u;
public const val `VT_FILETIME`: `VARENUM` = 64u;
public const val `VT_HRESULT`: `VARENUM` = 25u;
public const val `VT_I1`: `VARENUM` = 16u;
public const val `VT_I2`: `VARENUM` = 2u;
public const val `VT_I4`: `VARENUM` = 3u;
public const val `VT_I8`: `VARENUM` = 20u;
public const val `VT_ILLEGAL`: `VARENUM` = 65535u;
public const val `VT_ILLEGALMASKED`: `VARENUM` = 4095u;
public const val `VT_INT`: `VARENUM` = 22u;
public const val `VT_INT_PTR`: `VARENUM` = 37u;
public const val `VT_LPSTR`: `VARENUM` = 30u;
public const val `VT_LPWSTR`: `VARENUM` = 31u;
public const val `VT_NULL`: `VARENUM` = 1u;
public const val `VT_PTR`: `VARENUM` = 26u;
public const val `VT_R4`: `VARENUM` = 4u;
public const val `VT_R8`: `VARENUM` = 5u;
public const val `VT_RECORD`: `VARENUM` = 36u;
public const val `VT_RESERVED`: `VARENUM` = 32768u;
public const val `VT_SAFEARRAY`: `VARENUM` = 27u;
public const val `VT_STORAGE`: `VARENUM` = 67u;
public const val `VT_STORED_OBJECT`: `VARENUM` = 69u;
public const val `VT_STREAM`: `VARENUM` = 66u;
public const val `VT_STREAMED_OBJECT`: `VARENUM` = 68u;
public const val `VT_TYPEMASK`: `VARENUM` = 4095u;
public const val `VT_UI1`: `VARENUM` = 17u;
public const val `VT_UI2`: `VARENUM` = 18u;
public const val `VT_UI4`: `VARENUM` = 19u;
public const val `VT_UI8`: `VARENUM` = 21u;
public const val `VT_UINT`: `VARENUM` = 23u;
public const val `VT_UINT_PTR`: `VARENUM` = 38u;
public const val `VT_UNKNOWN`: `VARENUM` = 13u;
public const val `VT_USERDEFINED`: `VARENUM` = 29u;
public const val `VT_VARIANT`: `VARENUM` = 12u;
public const val `VT_VECTOR`: `VARENUM` = 4096u;
public const val `VT_VERSIONED_STREAM`: `VARENUM` = 73u;
public const val `VT_VOID`: `VARENUM` = 24u;
