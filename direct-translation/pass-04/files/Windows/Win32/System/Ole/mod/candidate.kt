// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BstrFromVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `BstrFromVector`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `pbstr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=ClearCustData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `ClearCustData`(`pcustdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CUSTDATA`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=CreateDispTypeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `CreateDispTypeInfo`(`pidata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERFACEDATA`>?, `lcid` : UInt, `pptinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=CreateErrorInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateErrorInfo`(`pperrinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CreateOleAdviseHolder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateOleAdviseHolder`(`ppoaholder` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=CreateStdDispatch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `CreateStdDispatch`(`punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvthis` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ptinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppunkstddisp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=CreateTypeLib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `CreateTypeLib`(`syskind` : `super`.`Com`.`SYSKIND`, `szfile` : `windows_sys`.`core`.`PCWSTR`, `ppctlib` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=CreateTypeLib2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `CreateTypeLib2`(`syskind` : `super`.`Com`.`SYSKIND`, `szfile` : `windows_sys`.`core`.`PCWSTR`, `ppctlib` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=DispCallFunc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `DispCallFunc`(`pvinstance` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ovft` : ULong, `cc` : `super`.`Com`.`CALLCONV`, `vtreturn` : `super`.`Variant`.`VARENUM`, `cactuals` : UInt, `prgvt` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `prgpvarg` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Variant`.`VARIANT`>>?, `pvargresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=DispGetIDsOfNames; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `DispGetIDsOfNames`(`ptinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgsznames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `cnames` : UInt, `rgdispid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=DispGetParam; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `DispGetParam`(`pdispparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`DISPPARAMS`>?, `position` : UInt, `vttarg` : `super`.`Variant`.`VARENUM`, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `puargerr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=DispInvoke; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `DispInvoke`(`_this` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ptinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dispidmember` : Int, `wflags` : UShort, `pparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`DISPPARAMS`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pexcepinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`EXCEPINFO`>?, `puargerr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=DoDragDrop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `DoDragDrop`(`pdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdropsource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwokeffects` : `DROPEFFECT`, `pdweffect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DROPEFFECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=GetActiveObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetActiveObject`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppunk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=GetAltMonthNames; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAltMonthNames`(`lcid` : UInt, `prgp` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`PWSTR`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=GetRecordInfoFromGuids; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRecordInfoFromGuids`(`rguidtypelib` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `uvermajor` : UInt, `uverminor` : UInt, `lcid` : UInt, `rguidtypeinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pprecinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=GetRecordInfoFromTypeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GetRecordInfoFromTypeInfo`(`ptypeinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pprecinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HRGN_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-marshal-l1-1-0.dll, ABI=system, export=HRGN_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HRGN_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-marshal-l1-1-0.dll, ABI=system, export=HRGN_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HRGN_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-marshal-l1-1-0.dll, ABI=system, export=HRGN_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HRGN_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-marshal-l1-1-0.dll, ABI=system, export=HRGN_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HRGN_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=IsAccelerator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `IsAccelerator`(`haccel` : `super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`, `caccelentries` : Int, `lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`MSG`>?, `lpwcmd` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LHashValOfNameSys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LHashValOfNameSys`(`syskind` : `super`.`Com`.`SYSKIND`, `lcid` : UInt, `szname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LHashValOfNameSysA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LHashValOfNameSysA`(`syskind` : `super`.`Com`.`SYSKIND`, `lcid` : UInt, `szname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LoadRegTypeLib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LoadRegTypeLib`(`rguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `wvermajor` : UShort, `wverminor` : UShort, `lcid` : UInt, `pptlib` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LoadTypeLib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LoadTypeLib`(`szfile` : `windows_sys`.`core`.`PCWSTR`, `pptlib` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LoadTypeLibEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `LoadTypeLibEx`(`szfile` : `windows_sys`.`core`.`PCWSTR`, `regkind` : `REGKIND`, `pptlib` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OaBuildVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OaBuildVersion`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OaEnablePerUserTLibRegistration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OaEnablePerUserTLibRegistration`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleBuildVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleBuildVersion`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleConvertOLESTREAMToIStorage2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleConvertOLESTREAMToIStorage2`(`lpolestream` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`OLESTREAM`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ptd` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`DVTARGETDEVICE`>?, `opt` : UInt, `pvcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pqueryconvertolelinkcallback` : `OLESTREAMQUERYCONVERTOLELINKCALLBACK`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleConvertOLESTREAMToIStorageEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `OleConvertOLESTREAMToIStorageEx2`(`polestm` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`StructuredStorage`.`OLESTREAM`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcfformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `plwwidth` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `plheight` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pmedium` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`STGMEDIUM`>?, `opt` : UInt, `pvcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pqueryconvertolelinkcallback` : `OLESTREAMQUERYCONVERTOLELINKCALLBACK`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreate`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `renderopt` : UInt, `pformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateDefaultHandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleCreateDefaultHandler`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lplpobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateEmbeddingHelper; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleCreateEmbeddingHelper`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flags` : `EMBDHLP_FLAGS`, `pcf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lplpobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateEx`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : `OLECREATE`, `renderopt` : UInt, `cformats` : UInt, `rgadvf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `lpadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleCreateFontIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleCreateFontIndirect`(`lpfontdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`FONTDESC`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lplpvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateFromData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateFromData`(`psrcdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `renderopt` : UInt, `pformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateFromDataEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateFromDataEx`(`psrcdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : `OLECREATE`, `renderopt` : UInt, `cformats` : UInt, `rgadvf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `lpadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateFromFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateFromFile`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `renderopt` : UInt, `lpformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateFromFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateFromFileEx`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : `OLECREATE`, `renderopt` : UInt, `cformats` : UInt, `rgadvf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `lpadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateLink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateLink`(`pmklinksrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `renderopt` : UInt, `lpformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateLinkEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateLinkEx`(`pmklinksrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : `OLECREATE`, `renderopt` : UInt, `cformats` : UInt, `rgadvf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `lpadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateLinkFromData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateLinkFromData`(`psrcdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `renderopt` : UInt, `pformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateLinkFromDataEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateLinkFromDataEx`(`psrcdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : `OLECREATE`, `renderopt` : UInt, `cformats` : UInt, `rgadvf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `lpadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateLinkToFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateLinkToFile`(`lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `renderopt` : UInt, `lpformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateLinkToFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateLinkToFileEx`(`lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : `OLECREATE`, `renderopt` : UInt, `cformats` : UInt, `rgadvf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rgformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `lpadvisesink` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgdwconnection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateMenuDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `OleCreateMenuDescriptor`(`hmenucombined` : `super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`, `lpmenuwidths` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEMENUGROUPWIDTHS`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleCreatePictureIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `OleCreatePictureIndirect`(`lppictdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`PICTDESC`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `fown` : `windows_sys`.`core`.`BOOL`, `lplpvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleCreatePropertyFrame; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleCreatePropertyFrame`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `x` : UInt, `y` : UInt, `lpszcaption` : `windows_sys`.`core`.`PCWSTR`, `cobjects` : UInt, `ppunk` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `cpages` : UInt, `ppageclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lcid` : UInt, `dwreserved` : UInt, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleCreatePropertyFrameIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleCreatePropertyFrameIndirect`(`lpparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`OCPFIPARAMS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleCreateStaticFromData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleCreateStaticFromData`(`psrcdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `iid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `renderopt` : UInt, `pformatetc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleDestroyMenuDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleDestroyMenuDescriptor`(`holemenu` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleDoAutoConvert; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleDoAutoConvert`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pclsidnew` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleDraw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OleDraw`(`punknown` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwaspect` : UInt, `hdcdraw` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lprcbounds` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleDuplicateData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
public external fun `OleDuplicateData`(`hsrc` : `super`.`super`.`Foundation`.`HANDLE`, `cfformat` : `CLIPBOARD_FORMAT`, `uiflags` : `super`.`Memory`.`GLOBAL_ALLOC_FLAGS`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleFlushClipboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleFlushClipboard`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleGetAutoConvert; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleGetAutoConvert`(`clsidold` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pclsidnew` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleGetClipboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleGetClipboard`(`ppdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleGetClipboardWithEnterpriseInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleGetClipboardWithEnterpriseInfo`(`dataobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `dataenterpriseid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `sourcedescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `targetdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `datadescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleGetIconOfClass; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleGetIconOfClass`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lpszlabel` : `windows_sys`.`core`.`PCWSTR`, `fusetypeaslabel` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`HGLOBAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleGetIconOfFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleGetIconOfFile`(`lpszpath` : `windows_sys`.`core`.`PCWSTR`, `fusefileaslabel` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`HGLOBAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleIconToCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `OleIconToCursor`(`hinstexe` : `super`.`super`.`Foundation`.`HINSTANCE`, `hicon` : `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`) : `super`.`super`.`UI`.`WindowsAndMessaging`.`HCURSOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleInitialize`(`pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleIsCurrentClipboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleIsCurrentClipboard`(`pdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleIsRunning; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleIsRunning`(`pobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleLoad; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleLoad`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pclientsite` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleLoadFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleLoadFromStream`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `iidinterface` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleLoadPicture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleLoadPicture`(`lpstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lsize` : Int, `frunmode` : `windows_sys`.`core`.`BOOL`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `lplpvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleLoadPictureEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleLoadPictureEx`(`lpstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lsize` : Int, `frunmode` : `windows_sys`.`core`.`BOOL`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `xsizedesired` : UInt, `ysizedesired` : UInt, `dwflags` : `LOAD_PICTURE_FLAGS`, `lplpvobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleLoadPictureFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `OleLoadPictureFile`(`varfilename` : `super`.`Variant`.`VARIANT`, `lplpdisppicture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleLoadPictureFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `OleLoadPictureFileEx`(`varfilename` : `super`.`Variant`.`VARIANT`, `xsizedesired` : UInt, `ysizedesired` : UInt, `dwflags` : `LOAD_PICTURE_FLAGS`, `lplpdisppicture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleLoadPicturePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleLoadPicturePath`(`szurlorpath` : `windows_sys`.`core`.`PCWSTR`, `punkcaller` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreserved` : UInt, `clrreserved` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppvret` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleLockRunning; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleLockRunning`(`punknown` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `flock` : `windows_sys`.`core`.`BOOL`, `flastunlockcloses` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleMetafilePictFromIconAndLabel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `OleMetafilePictFromIconAndLabel`(`hicon` : `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`, `lpszlabel` : `windows_sys`.`core`.`PCWSTR`, `lpszsourcefile` : `windows_sys`.`core`.`PCWSTR`, `iiconindex` : UInt) : `super`.`super`.`Foundation`.`HGLOBAL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleNoteObjectVisible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleNoteObjectVisible`(`punknown` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fvisible` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleQueryCreateFromData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleQueryCreateFromData`(`psrcdataobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleQueryLinkFromData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleQueryLinkFromData`(`psrcdataobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleRegEnumFormatEtc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleRegEnumFormatEtc`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwdirection` : UInt, `ppenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleRegEnumVerbs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleRegEnumVerbs`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppenum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleRegGetMiscStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleRegGetMiscStatus`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwaspect` : UInt, `pdwstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleRegGetUserType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleRegGetUserType`(`clsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwformoftype` : UInt, `pszusertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleRun; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleRun`(`punknown` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleSave; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleSave`(`pps` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fsameasload` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleSavePictureFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleSavePictureFile`(`lpdisppicture` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bstrfilename` : `windows_sys`.`core`.`BSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleSaveToStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleSaveToStream`(`ppstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleSetAutoConvert; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleSetAutoConvert`(`clsidold` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `clsidnew` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleSetClipboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleSetClipboard`(`pdataobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleSetContainedObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleSetContainedObject`(`punknown` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fcontained` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleSetMenuDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleSetMenuDescriptor`(`holemenu` : Long, `hwndframe` : `super`.`super`.`Foundation`.`HWND`, `hwndactiveobject` : `super`.`super`.`Foundation`.`HWND`, `lpframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpactiveobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleTranslateAccelerator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `OleTranslateAccelerator`(`lpframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpframeinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEINPLACEFRAMEINFO`>?, `lpmsg` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`MSG`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=OleTranslateColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `OleTranslateColor`(`clr` : UInt, `hpal` : `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`, `lpcolorref` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`COLORREF`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIAddVerbMenuA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `OleUIAddVerbMenuA`(`lpoleobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszshorttype` : `windows_sys`.`core`.`PCSTR`, `hmenu` : `super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`, `upos` : UInt, `uidverbmin` : UInt, `uidverbmax` : UInt, `baddconvert` : `windows_sys`.`core`.`BOOL`, `idconvert` : UInt, `lphmenu` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIAddVerbMenuW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `OleUIAddVerbMenuW`(`lpoleobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpszshorttype` : `windows_sys`.`core`.`PCWSTR`, `hmenu` : `super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`, `upos` : UInt, `uidverbmin` : UInt, `uidverbmax` : UInt, `baddconvert` : `windows_sys`.`core`.`BOOL`, `idconvert` : UInt, `lphmenu` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIBusyA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Media")]
public external fun `OleUIBusyA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIBUSYA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIBusyW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Media")]
public external fun `OleUIBusyW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIBUSYW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUICanConvertOrActivateAs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUICanConvertOrActivateAs`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `fislinkedobject` : `windows_sys`.`core`.`BOOL`, `wformat` : UShort) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIChangeIconA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIChangeIconA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUICHANGEICONA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIChangeIconW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIChangeIconW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUICHANGEICONW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIChangeSourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls_Dialogs")]
public external fun `OleUIChangeSourceA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUICHANGESOURCEA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIChangeSourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls_Dialogs")]
public external fun `OleUIChangeSourceW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUICHANGESOURCEW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIConvertA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIConvertA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUICONVERTA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIConvertW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIConvertW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUICONVERTW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIEditLinksA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIEditLinksA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIEDITLINKSA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIEditLinksW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIEditLinksW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIEDITLINKSW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIInsertObjectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleUIInsertObjectA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIINSERTOBJECTA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIInsertObjectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `OleUIInsertObjectW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIINSERTOBJECTW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIObjectPropertiesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `OleUIObjectPropertiesA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIObjectPropertiesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `OleUIObjectPropertiesW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIPasteSpecialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleUIPasteSpecialA`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIPASTESPECIALA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIPasteSpecialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `OleUIPasteSpecialW`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`OLEUIPASTESPECIALW`>?) : UInt
// UNSUPPORTED Rust 196:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("oledlg.dll" "C" fn OleUIPromptUserA(ntemplate : i32, hwndparent : super::super::Foundation:: HWND, ...) -> i32);

// UNSUPPORTED Rust 197:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("oledlg.dll" "C" fn OleUIPromptUserW(ntemplate : i32, hwndparent : super::super::Foundation:: HWND, ...) -> i32);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIUpdateLinksA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIUpdateLinksA`(`lpoleuilinkcntr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpsztitle` : `windows_sys`.`core`.`PCSTR`, `clinks` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oledlg.dll, ABI=system, export=OleUIUpdateLinksW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUIUpdateLinksW`(`lpoleuilinkcntr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `lpsztitle` : `windows_sys`.`core`.`PCWSTR`, `clinks` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=OleUninitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OleUninitialize`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=QueryPathOfRegTypeLib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryPathOfRegTypeLib`(`guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `wmaj` : UShort, `wmin` : UShort, `lcid` : UInt, `lpbstrpathname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=RegisterActiveObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterActiveObject`(`punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwflags` : `ACTIVEOBJECT_FLAGS`, `pdwregister` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=RegisterDragDrop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDragDrop`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pdroptarget` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=RegisterTypeLib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RegisterTypeLib`(`ptlib` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szfullpath` : `windows_sys`.`core`.`PCWSTR`, `szhelpdir` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=RegisterTypeLibForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `RegisterTypeLibForUser`(`ptlib` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `szfullpath` : `windows_sys`.`core`.`PCWSTR`, `szhelpdir` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=ReleaseStgMedium; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `ReleaseStgMedium`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`STGMEDIUM`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=RevokeActiveObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RevokeActiveObject`(`dwregister` : UInt, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=RevokeDragDrop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RevokeDragDrop`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayAccessData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayAccessData`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `ppvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayAddRef; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayAddRef`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `ppdatatorelease` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayAllocData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayAllocData`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayAllocDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayAllocDescriptor`(`cdims` : UInt, `ppsaout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayAllocDescriptorEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `SafeArrayAllocDescriptorEx`(`vt` : `super`.`Variant`.`VARENUM`, `cdims` : UInt, `ppsaout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayCopy`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `ppsaout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayCopyData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayCopyData`(`psasource` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `psatarget` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `SafeArrayCreate`(`vt` : `super`.`Variant`.`VARENUM`, `cdims` : UInt, `rgsabound` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAYBOUND`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayCreateEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `SafeArrayCreateEx`(`vt` : `super`.`Variant`.`VARENUM`, `cdims` : UInt, `rgsabound` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAYBOUND`>?, `pvextra` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayCreateVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `SafeArrayCreateVector`(`vt` : `super`.`Variant`.`VARENUM`, `llbound` : Int, `celements` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayCreateVectorEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `SafeArrayCreateVectorEx`(`vt` : `super`.`Variant`.`VARENUM`, `llbound` : Int, `celements` : UInt, `pvextra` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayDestroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayDestroy`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayDestroyData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayDestroyData`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayDestroyDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayDestroyDescriptor`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetDim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayGetDim`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayGetElement`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `rgindices` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetElemsize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayGetElemsize`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetIID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayGetIID`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `pguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetLBound; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayGetLBound`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `ndim` : UInt, `pllbound` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetRecordInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayGetRecordInfo`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `prinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetUBound; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayGetUBound`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `ndim` : UInt, `plubound` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayGetVartype; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `SafeArrayGetVartype`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `pvt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARENUM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayLock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayLock`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayPtrOfIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayPtrOfIndex`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `rgindices` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `ppvdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayPutElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayPutElement`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `rgindices` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pv` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayRedim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayRedim`(`psa` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `psaboundnew` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAYBOUND`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayReleaseData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SafeArrayReleaseData`(`pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayReleaseDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayReleaseDescriptor`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArraySetIID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArraySetIID`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArraySetRecordInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArraySetRecordInfo`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?, `prinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayUnaccessData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayUnaccessData`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=SafeArrayUnlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `SafeArrayUnlock`(`psa` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=UnRegisterTypeLib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UnRegisterTypeLib`(`libid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `wvermajor` : UShort, `wverminor` : UShort, `lcid` : UInt, `syskind` : `super`.`Com`.`SYSKIND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=UnRegisterTypeLibForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `UnRegisterTypeLibForUser`(`libid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `wmajorvernum` : UShort, `wminorvernum` : UShort, `lcid` : UInt, `syskind` : `super`.`Com`.`SYSKIND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarAbs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarAbs`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarAdd`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarAnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarAnd`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarBoolFromCy`(`cyin` : `super`.`Com`.`CY`, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromDate`(`datein` : Double, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarBoolFromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromI1`(`cin` : Byte, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromI2`(`sin` : Short, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromI4`(`lin` : Int, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromI8`(`i64in` : Long, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromR4`(`fltin` : Float, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromR8`(`dblin` : Double, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromUI1`(`bin` : UByte, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromUI2`(`uiin` : UShort, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromUI4`(`ulin` : UInt, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBoolFromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBoolFromUI8`(`i64in` : ULong, `pboolout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`VARIANT_BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrCat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrCat`(`bstrleft` : `windows_sys`.`core`.`BSTR`, `bstrright` : `windows_sys`.`core`.`BSTR`, `pbstrresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrCmp`(`bstrleft` : `windows_sys`.`core`.`BSTR`, `bstrright` : `windows_sys`.`core`.`BSTR`, `lcid` : UInt, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarBstrFromCy`(`cyin` : `super`.`Com`.`CY`, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromDate`(`datein` : Double, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarBstrFromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromI1`(`cin` : Byte, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromI2`(`ival` : Short, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromI4`(`lin` : Int, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromI8`(`i64in` : Long, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromR4`(`fltin` : Float, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromR8`(`dblin` : Double, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromUI1`(`bval` : UByte, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromUI2`(`uiin` : UShort, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromUI4`(`ulin` : UInt, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarBstrFromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarBstrFromUI8`(`ui64in` : ULong, `lcid` : UInt, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarCat`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarCmp`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `lcid` : UInt, `dwflags` : UInt) : `VARCMP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyAbs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyAbs`(`cyin` : `super`.`Com`.`CY`, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyAdd`(`cyleft` : `super`.`Com`.`CY`, `cyright` : `super`.`Com`.`CY`, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyCmp`(`cyleft` : `super`.`Com`.`CY`, `cyright` : `super`.`Com`.`CY`) : `VARCMP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyCmpR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyCmpR8`(`cyleft` : `super`.`Com`.`CY`, `dblright` : Double) : `VARCMP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFix`(`cyin` : `super`.`Com`.`CY`, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromDate`(`datein` : Double, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromI1`(`cin` : Byte, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromI2`(`sin` : Short, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromI4`(`lin` : Int, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromI8`(`i64in` : Long, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromR4`(`fltin` : Float, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromR8`(`dblin` : Double, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromUI1`(`bin` : UByte, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromUI2`(`uiin` : UShort, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromUI4`(`ulin` : UInt, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyFromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyFromUI8`(`ui64in` : ULong, `pcyout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyInt`(`cyin` : `super`.`Com`.`CY`, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyMul; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyMul`(`cyleft` : `super`.`Com`.`CY`, `cyright` : `super`.`Com`.`CY`, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyMulI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyMulI4`(`cyleft` : `super`.`Com`.`CY`, `lright` : Int, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyMulI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyMulI8`(`cyleft` : `super`.`Com`.`CY`, `lright` : Long, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyNeg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyNeg`(`cyin` : `super`.`Com`.`CY`, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCyRound; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCyRound`(`cyin` : `super`.`Com`.`CY`, `cdecimals` : Int, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarCySub; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarCySub`(`cyleft` : `super`.`Com`.`CY`, `cyright` : `super`.`Com`.`CY`, `pcyresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`CY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarDateFromCy`(`cyin` : `super`.`Com`.`CY`, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarDateFromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromI1`(`cin` : Byte, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromI2`(`sin` : Short, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromI4`(`lin` : Int, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromI8`(`i64in` : Long, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromR4`(`fltin` : Float, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromR8`(`dblin` : Double, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromUI1`(`bin` : UByte, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromUI2`(`uiin` : UShort, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromUI4`(`ulin` : UInt, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromUI8`(`ui64in` : ULong, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromUdate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromUdate`(`pudatein` : /* Rust *const */ kotlinx.cinterop.CPointer<`UDATE`>?, `dwflags` : UInt, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDateFromUdateEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDateFromUdateEx`(`pudatein` : /* Rust *const */ kotlinx.cinterop.CPointer<`UDATE`>?, `lcid` : UInt, `dwflags` : UInt, `pdateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecAbs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecAbs`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecAdd`(`pdecleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecCmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecCmp`(`pdecleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `VARCMP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecCmpR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecCmpR8`(`pdecleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `dblright` : Double) : `VARCMP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecDiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecDiv`(`pdecleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFix`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarDecFromCy`(`cyin` : `super`.`Com`.`CY`, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromDate`(`datein` : Double, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarDecFromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromI1`(`cin` : Byte, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromI2`(`uiin` : Short, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromI4`(`lin` : Int, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromI8`(`i64in` : Long, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromR4`(`fltin` : Float, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromR8`(`dblin` : Double, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromUI1`(`bin` : UByte, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromUI2`(`uiin` : UShort, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromUI4`(`ulin` : UInt, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecFromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecFromUI8`(`ui64in` : ULong, `pdecout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecInt`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecMul; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecMul`(`pdecleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecNeg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecNeg`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecRound; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecRound`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `cdecimals` : Int, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDecSub; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarDecSub`(`pdecleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdecresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarDiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarDiv`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarEqv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarEqv`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarFix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarFix`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarFormat`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pstrformat` : `windows_sys`.`core`.`PCWSTR`, `ifirstday` : `VARFORMAT_FIRST_DAY`, `ifirstweek` : `VARFORMAT_FIRST_WEEK`, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarFormatCurrency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarFormatCurrency`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `inumdig` : Int, `iinclead` : Int, `iuseparens` : Int, `igroup` : Int, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarFormatDateTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarFormatDateTime`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `inamedformat` : `VARFORMAT_NAMED_FORMAT`, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarFormatFromTokens; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarFormatFromTokens`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pstrformat` : `windows_sys`.`core`.`PCWSTR`, `pbtokcur` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?, `lcid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarFormatNumber; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarFormatNumber`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `inumdig` : Int, `iinclead` : `VARFORMAT_LEADING_DIGIT`, `iuseparens` : `VARFORMAT_PARENTHESES`, `igroup` : `VARFORMAT_GROUP`, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarFormatPercent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarFormatPercent`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `inumdig` : Int, `iinclead` : `VARFORMAT_LEADING_DIGIT`, `iuseparens` : `VARFORMAT_PARENTHESES`, `igroup` : `VARFORMAT_GROUP`, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI1FromCy`(`cyin` : `super`.`Com`.`CY`, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromDate`(`datein` : Double, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI1FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromI2`(`uiin` : Short, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromI4`(`lin` : Int, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromI8`(`i64in` : Long, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromR4`(`fltin` : Float, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromR8`(`dblin` : Double, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromUI1`(`bin` : UByte, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromUI2`(`uiin` : UShort, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromUI4`(`ulin` : UInt, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI1FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI1FromUI8`(`i64in` : ULong, `pcout` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI2FromCy`(`cyin` : `super`.`Com`.`CY`, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromDate`(`datein` : Double, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI2FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromI1`(`cin` : Byte, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromI4`(`lin` : Int, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromI8`(`i64in` : Long, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromR4`(`fltin` : Float, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromR8`(`dblin` : Double, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromUI1`(`bin` : UByte, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromUI2`(`uiin` : UShort, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromUI4`(`ulin` : UInt, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI2FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI2FromUI8`(`ui64in` : ULong, `psout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI4FromCy`(`cyin` : `super`.`Com`.`CY`, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromDate`(`datein` : Double, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI4FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromI1`(`cin` : Byte, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromI2`(`sin` : Short, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromI8`(`i64in` : Long, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromR4`(`fltin` : Float, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromR8`(`dblin` : Double, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromUI1`(`bin` : UByte, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromUI2`(`uiin` : UShort, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromUI4`(`ulin` : UInt, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI4FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI4FromUI8`(`ui64in` : ULong, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI8FromCy`(`cyin` : `super`.`Com`.`CY`, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromDate`(`datein` : Double, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarI8FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromI1`(`cin` : Byte, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromI2`(`sin` : Short, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromR4`(`fltin` : Float, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromR8`(`dblin` : Double, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromUI1`(`bin` : UByte, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromUI2`(`uiin` : UShort, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromUI4`(`ulin` : UInt, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarI8FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarI8FromUI8`(`ui64in` : ULong, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarIdiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarIdiv`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarImp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarImp`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarInt`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarMod; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarMod`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarMonthName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarMonthName`(`imonth` : Int, `fabbrev` : Int, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarMul; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarMul`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarNeg; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarNeg`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarNot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarNot`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarNumFromParseNum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarNumFromParseNum`(`pnumprs` : /* Rust *const */ kotlinx.cinterop.CPointer<`NUMPARSE`>?, `rgbdig` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `dwvtbits` : UInt, `pvar` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarOr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarOr`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarParseNumFromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarParseNumFromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pnumprs` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NUMPARSE`>?, `rgbdig` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarPow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarPow`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4CmpR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4CmpR8`(`fltleft` : Float, `dblright` : Double) : `VARCMP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarR4FromCy`(`cyin` : `super`.`Com`.`CY`, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromDate`(`datein` : Double, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarR4FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromI1`(`cin` : Byte, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromI2`(`sin` : Short, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromI4`(`lin` : Int, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromI8`(`i64in` : Long, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromR8`(`dblin` : Double, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromUI1`(`bin` : UByte, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromUI2`(`uiin` : UShort, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromUI4`(`ulin` : UInt, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR4FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR4FromUI8`(`ui64in` : ULong, `pfltout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarR8FromCy`(`cyin` : `super`.`Com`.`CY`, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromDate`(`datein` : Double, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarR8FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromI1`(`cin` : Byte, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromI2`(`sin` : Short, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromI4`(`lin` : Int, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromI8`(`i64in` : Long, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromR4`(`fltin` : Float, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromUI1`(`bin` : UByte, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromUI2`(`uiin` : UShort, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromUI4`(`ulin` : UInt, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8FromUI8`(`ui64in` : ULong, `pdblout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8Pow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8Pow`(`dblleft` : Double, `dblright` : Double, `pdblresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarR8Round; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarR8Round`(`dblin` : Double, `cdecimals` : Int, `pdblresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarRound; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarRound`(`pvarin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `cdecimals` : Int, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarSub; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarSub`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarTokenizeFormatString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarTokenizeFormatString`(`pstrformat` : `windows_sys`.`core`.`PCWSTR`, `rgbtok` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbtok` : Int, `ifirstday` : `VARFORMAT_FIRST_DAY`, `ifirstweek` : `VARFORMAT_FIRST_WEEK`, `lcid` : UInt, `pcbactual` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI1FromCy`(`cyin` : `super`.`Com`.`CY`, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromDate`(`datein` : Double, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI1FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromI1`(`cin` : Byte, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromI2`(`sin` : Short, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromI4`(`lin` : Int, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromI8`(`i64in` : Long, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromR4`(`fltin` : Float, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromR8`(`dblin` : Double, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromUI2`(`uiin` : UShort, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromUI4`(`ulin` : UInt, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI1FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI1FromUI8`(`ui64in` : ULong, `pbout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI2FromCy`(`cyin` : `super`.`Com`.`CY`, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromDate`(`datein` : Double, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI2FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromI1`(`cin` : Byte, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromI2`(`uiin` : Short, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromI4`(`lin` : Int, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromI8`(`i64in` : Long, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromR4`(`fltin` : Float, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromR8`(`dblin` : Double, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromUI1`(`bin` : UByte, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromUI4`(`ulin` : UInt, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI2FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI2FromUI8`(`i64in` : ULong, `puiout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI4FromCy`(`cyin` : `super`.`Com`.`CY`, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromDate`(`datein` : Double, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI4FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromI1`(`cin` : Byte, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromI2`(`uiin` : Short, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromI4`(`lin` : Int, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromI8`(`i64in` : Long, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromR4`(`fltin` : Float, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromR8`(`dblin` : Double, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromUI1`(`bin` : UByte, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromUI2`(`uiin` : UShort, `pulout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI4FromUI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI4FromUI8`(`ui64in` : ULong, `plout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromBool`(`boolin` : `super`.`super`.`Foundation`.`VARIANT_BOOL`, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromCy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI8FromCy`(`cyin` : `super`.`Com`.`CY`, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromDate`(`datein` : Double, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromDec; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromDec`(`pdecin` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`DECIMAL`>?, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromDisp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VarUI8FromDisp`(`pdispin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lcid` : UInt, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromI1`(`cin` : Byte, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromI2`(`sin` : Short, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromI8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromI8`(`ui64in` : Long, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromR4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromR4`(`fltin` : Float, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromR8; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromR8`(`dblin` : Double, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromStr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromStr`(`strin` : `windows_sys`.`core`.`PCWSTR`, `lcid` : UInt, `dwflags` : UInt, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromUI1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromUI1`(`bin` : UByte, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromUI2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromUI2`(`uiin` : UShort, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUI8FromUI4; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUI8FromUI4`(`ulin` : UInt, `pi64out` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarUdateFromDate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarUdateFromDate`(`datein` : Double, `dwflags` : UInt, `pudateout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UDATE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarWeekdayName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VarWeekdayName`(`iweekday` : Int, `fabbrev` : Int, `ifirstday` : Int, `dwflags` : UInt, `pbstrout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VarXor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
public external fun `VarXor`(`pvarleft` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarright` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?, `pvarresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Variant`.`VARIANT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=VectorFromBstr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `VectorFromBstr`(`bstr` : `windows_sys`.`core`.`BSTR`, `ppsa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Com`.`SAFEARRAY`>>?) : `windows_sys`.`core`.`HRESULT`
public typealias `ACTIVATEFLAGS` = Int;
public const val `ACTIVATE_WINDOWLESS`: `ACTIVATEFLAGS` = 1;
public typealias `ACTIVEOBJECT_FLAGS` = UInt;
public const val `ACTIVEOBJECT_STRONG`: `ACTIVEOBJECT_FLAGS` = 0u;
public const val `ACTIVEOBJECT_WEAK`: `ACTIVEOBJECT_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ARRAYDESC` (
    public var `tdescElem`: `super`.`Com`.`TYPEDESC`,
    public var `cDims`: UShort,
    public var `rgbounds`: Array<`super`.`Com`.`SAFEARRAYBOUND`>,
)
// UNSUPPORTED Rust 661:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for ARRAYDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BINDSPEED` = Int;
public const val `BINDSPEED_IMMEDIATE`: `BINDSPEED` = 3;
public const val `BINDSPEED_INDEFINITE`: `BINDSPEED` = 1;
public const val `BINDSPEED_MODERATE`: `BINDSPEED` = 2;
public typealias `BUSY_DIALOG_FLAGS` = UInt;
public const val `BZ_DISABLECANCELBUTTON`: `BUSY_DIALOG_FLAGS` = 1u;
public const val `BZ_DISABLERETRYBUTTON`: `BUSY_DIALOG_FLAGS` = 4u;
public const val `BZ_DISABLESWITCHTOBUTTON`: `BUSY_DIALOG_FLAGS` = 2u;
public const val `BZ_NOTRESPONDINGDIALOG`: `BUSY_DIALOG_FLAGS` = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CADWORD` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CADWORD {
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
public class `CALPOLESTR` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
)
// UNSUPPORTED Rust 693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CALPOLESTR {
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
public class `CAUUID` (
    public var `cElems`: UInt,
    public var `pElems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 704:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAUUID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CF_BITMAP`: `CLIPBOARD_FORMAT` = 2u;
public const val `CF_CONVERTONLY`: `UI_CONVERT_FLAGS` = 256u;
public const val `CF_DIB`: `CLIPBOARD_FORMAT` = 8u;
public const val `CF_DIBV5`: `CLIPBOARD_FORMAT` = 17u;
public const val `CF_DIF`: `CLIPBOARD_FORMAT` = 5u;
public const val `CF_DISABLEACTIVATEAS`: `UI_CONVERT_FLAGS` = 64u;
public const val `CF_DISABLEDISPLAYASICON`: `UI_CONVERT_FLAGS` = 32u;
public const val `CF_DSPBITMAP`: `CLIPBOARD_FORMAT` = 130u;
public const val `CF_DSPENHMETAFILE`: `CLIPBOARD_FORMAT` = 142u;
public const val `CF_DSPMETAFILEPICT`: `CLIPBOARD_FORMAT` = 131u;
public const val `CF_DSPTEXT`: `CLIPBOARD_FORMAT` = 129u;
public const val `CF_ENHMETAFILE`: `CLIPBOARD_FORMAT` = 14u;
public const val `CF_GDIOBJFIRST`: `CLIPBOARD_FORMAT` = 768u;
public const val `CF_GDIOBJLAST`: `CLIPBOARD_FORMAT` = 1023u;
public const val `CF_HDROP`: `CLIPBOARD_FORMAT` = 15u;
public const val `CF_HIDECHANGEICON`: `UI_CONVERT_FLAGS` = 128u;
public const val `CF_LOCALE`: `CLIPBOARD_FORMAT` = 16u;
public const val `CF_MAX`: `CLIPBOARD_FORMAT` = 18u;
public const val `CF_METAFILEPICT`: `CLIPBOARD_FORMAT` = 3u;
public const val `CF_OEMTEXT`: `CLIPBOARD_FORMAT` = 7u;
public const val `CF_OWNERDISPLAY`: `CLIPBOARD_FORMAT` = 128u;
public const val `CF_PALETTE`: `CLIPBOARD_FORMAT` = 9u;
public const val `CF_PENDATA`: `CLIPBOARD_FORMAT` = 10u;
public const val `CF_PRIVATEFIRST`: `CLIPBOARD_FORMAT` = 512u;
public const val `CF_PRIVATELAST`: `CLIPBOARD_FORMAT` = 767u;
public const val `CF_RIFF`: `CLIPBOARD_FORMAT` = 11u;
public const val `CF_SELECTACTIVATEAS`: `UI_CONVERT_FLAGS` = 16u;
public const val `CF_SELECTCONVERTTO`: `UI_CONVERT_FLAGS` = 8u;
public const val `CF_SETACTIVATEDEFAULT`: `UI_CONVERT_FLAGS` = 4u;
public const val `CF_SETCONVERTDEFAULT`: `UI_CONVERT_FLAGS` = 2u;
public const val `CF_SHOWHELPBUTTON`: `UI_CONVERT_FLAGS` = 1u;
public const val `CF_SYLK`: `CLIPBOARD_FORMAT` = 4u;
public const val `CF_TEXT`: `CLIPBOARD_FORMAT` = 1u;
public const val `CF_TIFF`: `CLIPBOARD_FORMAT` = 6u;
public const val `CF_UNICODETEXT`: `CLIPBOARD_FORMAT` = 13u;
public const val `CF_WAVE`: `CLIPBOARD_FORMAT` = 12u;
public typealias `CHANGEKIND` = Int;
public const val `CHANGEKIND_ADDMEMBER`: `CHANGEKIND` = 0;
public const val `CHANGEKIND_CHANGEFAILED`: `CHANGEKIND` = 6;
public const val `CHANGEKIND_DELETEMEMBER`: `CHANGEKIND` = 1;
public const val `CHANGEKIND_GENERAL`: `CHANGEKIND` = 4;
public const val `CHANGEKIND_INVALIDATE`: `CHANGEKIND` = 5;
public const val `CHANGEKIND_MAX`: `CHANGEKIND` = 7;
public const val `CHANGEKIND_SETDOCUMENTATION`: `CHANGEKIND` = 3;
public const val `CHANGEKIND_SETNAMES`: `CHANGEKIND` = 2;
public typealias `CHANGE_ICON_FLAGS` = UInt;
public typealias `CHANGE_SOURCE_FLAGS` = UInt;
public const val `CIF_SELECTCURRENT`: `CHANGE_ICON_FLAGS` = 2u;
public const val `CIF_SELECTDEFAULT`: `CHANGE_ICON_FLAGS` = 4u;
public const val `CIF_SELECTFROMFILE`: `CHANGE_ICON_FLAGS` = 8u;
public const val `CIF_SHOWHELP`: `CHANGE_ICON_FLAGS` = 1u;
public const val `CIF_USEICONEXE`: `CHANGE_ICON_FLAGS` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLEANLOCALSTORAGE` (
    public var `pInterface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pStorage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `flags`: UInt,
)
// UNSUPPORTED Rust 768:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLEANLOCALSTORAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLIPBOARD_FORMAT` = UShort;
// UNSUPPORTED Rust 774:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_CColorPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35201_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 775:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_CFontPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35200_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 776:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_CPicturePropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35202_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 777:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_ConvertVBX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb8f0822_0164_101b_84ed_08002b2ec713);

// UNSUPPORTED Rust 778:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_PersistPropset: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb8f0821_0164_101b_84ed_08002b2ec713);

// UNSUPPORTED Rust 779:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_StdFont: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35203_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 780:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_StdPicture: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35204_8f91_11ce_9de3_00aa004bb851);

public const val `CONNECT_E_ADVISELIMIT`: Int = -2147220991;
public const val `CONNECT_E_CANNOTCONNECT`: Int = -2147220990;
public const val `CONNECT_E_FIRST`: Int = -2147220992;
public const val `CONNECT_E_LAST`: Int = -2147220977;
public const val `CONNECT_E_NOCONNECTION`: Int = -2147220992;
public const val `CONNECT_E_OVERRIDDEN`: Int = -2147220989;
public const val `CONNECT_S_FIRST`: Int = 262656;
public const val `CONNECT_S_LAST`: Int = 262671;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTROLINFO` (
    public var `cb`: UInt,
    public var `hAccel`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`,
    public var `cAccel`: UShort,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 798:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CONTROLINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CSF_EXPLORER`: `CHANGE_SOURCE_FLAGS` = 8u;
public const val `CSF_ONLYGETSOURCE`: `CHANGE_SOURCE_FLAGS` = 4u;
public const val `CSF_SHOWHELP`: `CHANGE_SOURCE_FLAGS` = 1u;
public const val `CSF_VALIDSOURCE`: `CHANGE_SOURCE_FLAGS` = 2u;
public const val `CTL_E_ILLEGALFUNCTIONCALL`: Int = -2146828283;
public typealias `CTRLINFO` = Int;
public const val `CTRLINFO_EATS_ESCAPE`: `CTRLINFO` = 2;
public const val `CTRLINFO_EATS_RETURN`: `CTRLINFO` = 1;
public const val `DD_DEFDRAGDELAY`: UInt = 200u;
public const val `DD_DEFDRAGMINDIST`: UInt = 2u;
public const val `DD_DEFSCROLLDELAY`: UInt = 50u;
public const val `DD_DEFSCROLLINSET`: UInt = 11u;
public const val `DD_DEFSCROLLINTERVAL`: UInt = 50u;
public typealias `DISCARDCACHE` = Int;
public const val `DISCARDCACHE_NOSAVE`: `DISCARDCACHE` = 1;
public const val `DISCARDCACHE_SAVEIFDIRTY`: `DISCARDCACHE` = 0;
public const val `DISPATCH_CONSTRUCT`: UInt = 16384u;
public const val `DISPID_ABOUTBOX`: Int = -552;
public const val `DISPID_ACCELERATOR`: Int = -543;
public const val `DISPID_ADDITEM`: Int = -553;
public const val `DISPID_AMBIENT_APPEARANCE`: Int = -716;
public const val `DISPID_AMBIENT_AUTOCLIP`: Int = -715;
public const val `DISPID_AMBIENT_BACKCOLOR`: Int = -701;
public const val `DISPID_AMBIENT_CHARSET`: Int = -727;
public const val `DISPID_AMBIENT_CODEPAGE`: Int = -725;
public const val `DISPID_AMBIENT_DISPLAYASDEFAULT`: Int = -713;
public const val `DISPID_AMBIENT_DISPLAYNAME`: Int = -702;
public const val `DISPID_AMBIENT_FONT`: Int = -703;
public const val `DISPID_AMBIENT_FORECOLOR`: Int = -704;
public const val `DISPID_AMBIENT_LOCALEID`: Int = -705;
public const val `DISPID_AMBIENT_MESSAGEREFLECT`: Int = -706;
public const val `DISPID_AMBIENT_PALETTE`: Int = -726;
public const val `DISPID_AMBIENT_RIGHTTOLEFT`: Int = -732;
public const val `DISPID_AMBIENT_SCALEUNITS`: Int = -707;
public const val `DISPID_AMBIENT_SHOWGRABHANDLES`: Int = -711;
public const val `DISPID_AMBIENT_SHOWHATCHING`: Int = -712;
public const val `DISPID_AMBIENT_SUPPORTSMNEMONICS`: Int = -714;
public const val `DISPID_AMBIENT_TEXTALIGN`: Int = -708;
public const val `DISPID_AMBIENT_TOPTOBOTTOM`: Int = -733;
public const val `DISPID_AMBIENT_TRANSFERPRIORITY`: Int = -728;
public const val `DISPID_AMBIENT_UIDEAD`: Int = -710;
public const val `DISPID_AMBIENT_USERMODE`: Int = -709;
public const val `DISPID_APPEARANCE`: Int = -520;
public const val `DISPID_AUTOSIZE`: Int = -500;
public const val `DISPID_BACKCOLOR`: Int = -501;
public const val `DISPID_BACKSTYLE`: Int = -502;
public const val `DISPID_BORDERCOLOR`: Int = -503;
public const val `DISPID_BORDERSTYLE`: Int = -504;
public const val `DISPID_BORDERVISIBLE`: Int = -519;
public const val `DISPID_BORDERWIDTH`: Int = -505;
public const val `DISPID_CAPTION`: Int = -518;
public const val `DISPID_CLEAR`: Int = -554;
public const val `DISPID_CLICK`: Int = -600;
public const val `DISPID_CLICK_VALUE`: Int = -610;
public const val `DISPID_COLLECT`: Int = -8;
public const val `DISPID_COLUMN`: Int = -529;
public const val `DISPID_CONSTRUCTOR`: Int = -6;
public const val `DISPID_DBLCLICK`: Int = -601;
public const val `DISPID_DESTRUCTOR`: Int = -7;
public const val `DISPID_DISPLAYSTYLE`: Int = -540;
public const val `DISPID_DOCLICK`: Int = -551;
public const val `DISPID_DRAWMODE`: Int = -507;
public const val `DISPID_DRAWSTYLE`: Int = -508;
public const val `DISPID_DRAWWIDTH`: Int = -509;
public const val `DISPID_Delete`: Int = -801;
public const val `DISPID_ENABLED`: Int = -514;
public const val `DISPID_ENTERKEYBEHAVIOR`: Int = -544;
public const val `DISPID_ERROREVENT`: Int = -608;
public const val `DISPID_EVALUATE`: Int = -5;
public const val `DISPID_FILLCOLOR`: Int = -510;
public const val `DISPID_FILLSTYLE`: Int = -511;
public const val `DISPID_FONT`: Int = -512;
public const val `DISPID_FONT_BOLD`: UInt = 3u;
public const val `DISPID_FONT_CHANGED`: UInt = 9u;
public const val `DISPID_FONT_CHARSET`: UInt = 8u;
public const val `DISPID_FONT_ITALIC`: UInt = 4u;
public const val `DISPID_FONT_NAME`: UInt = 0u;
public const val `DISPID_FONT_SIZE`: UInt = 2u;
public const val `DISPID_FONT_STRIKE`: UInt = 6u;
public const val `DISPID_FONT_UNDER`: UInt = 5u;
public const val `DISPID_FONT_WEIGHT`: UInt = 7u;
public const val `DISPID_FORECOLOR`: Int = -513;
public const val `DISPID_GROUPNAME`: Int = -541;
public const val `DISPID_HWND`: Int = -515;
public const val `DISPID_IMEMODE`: Int = -542;
public const val `DISPID_KEYDOWN`: Int = -602;
public const val `DISPID_KEYPRESS`: Int = -603;
public const val `DISPID_KEYUP`: Int = -604;
public const val `DISPID_LIST`: Int = -528;
public const val `DISPID_LISTCOUNT`: Int = -531;
public const val `DISPID_LISTINDEX`: Int = -526;
public const val `DISPID_MAXLENGTH`: Int = -533;
public const val `DISPID_MOUSEDOWN`: Int = -605;
public const val `DISPID_MOUSEICON`: Int = -522;
public const val `DISPID_MOUSEMOVE`: Int = -606;
public const val `DISPID_MOUSEPOINTER`: Int = -521;
public const val `DISPID_MOUSEUP`: Int = -607;
public const val `DISPID_MULTILINE`: Int = -537;
public const val `DISPID_MULTISELECT`: Int = -532;
public const val `DISPID_NEWENUM`: Int = -4;
public const val `DISPID_NUMBEROFCOLUMNS`: Int = -539;
public const val `DISPID_NUMBEROFROWS`: Int = -538;
public const val `DISPID_Name`: Int = -800;
public const val `DISPID_Object`: Int = -802;
public const val `DISPID_PASSWORDCHAR`: Int = -534;
public const val `DISPID_PICTURE`: Int = -523;
public const val `DISPID_PICT_HANDLE`: UInt = 0u;
public const val `DISPID_PICT_HEIGHT`: UInt = 5u;
public const val `DISPID_PICT_HPAL`: UInt = 2u;
public const val `DISPID_PICT_RENDER`: UInt = 6u;
public const val `DISPID_PICT_TYPE`: UInt = 3u;
public const val `DISPID_PICT_WIDTH`: UInt = 4u;
public const val `DISPID_PROPERTYPUT`: Int = -3;
public const val `DISPID_Parent`: Int = -803;
public const val `DISPID_READYSTATE`: Int = -525;
public const val `DISPID_READYSTATECHANGE`: Int = -609;
public const val `DISPID_REFRESH`: Int = -550;
public const val `DISPID_REMOVEITEM`: Int = -555;
public const val `DISPID_RIGHTTOLEFT`: Int = -611;
public const val `DISPID_SCROLLBARS`: Int = -535;
public const val `DISPID_SELECTED`: Int = -527;
public const val `DISPID_SELLENGTH`: Int = -548;
public const val `DISPID_SELSTART`: Int = -547;
public const val `DISPID_SELTEXT`: Int = -546;
public const val `DISPID_STARTENUM`: Int = -1;
public const val `DISPID_TABKEYBEHAVIOR`: Int = -545;
public const val `DISPID_TABSTOP`: Int = -516;
public const val `DISPID_TEXT`: Int = -517;
public const val `DISPID_THIS`: Int = -613;
public const val `DISPID_TOPTOBOTTOM`: Int = -612;
public const val `DISPID_UNKNOWN`: Int = -1;
public const val `DISPID_VALID`: Int = -524;
public const val `DISPID_VALUE`: UInt = 0u;
public const val `DISPID_WORDWRAP`: Int = -536;
public typealias `DOCMISC` = Int;
public const val `DOCMISC_CANCREATEMULTIPLEVIEWS`: `DOCMISC` = 1;
public const val `DOCMISC_CANTOPENEDIT`: `DOCMISC` = 4;
public const val `DOCMISC_NOFILESUPPORT`: `DOCMISC` = 8;
public const val `DOCMISC_SUPPORTCOMPLEXRECTANGLES`: `DOCMISC` = 2;
public typealias `DROPEFFECT` = UInt;
public const val `DROPEFFECT_COPY`: `DROPEFFECT` = 1u;
public const val `DROPEFFECT_LINK`: `DROPEFFECT` = 4u;
public const val `DROPEFFECT_MOVE`: `DROPEFFECT` = 2u;
public const val `DROPEFFECT_NONE`: `DROPEFFECT` = 0u;
public const val `DROPEFFECT_SCROLL`: `DROPEFFECT` = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVASPECTINFO` (
    public var `cb`: UInt,
    public var `dwFlags`: UInt,
)
public typealias `DVASPECTINFOFLAG` = Int;
public const val `DVASPECTINFOFLAG_CANOPTIMIZE`: `DVASPECTINFOFLAG` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVEXTENTINFO` (
    public var `cb`: UInt,
    public var `dwExtentMode`: UInt,
    public var `sizelProposed`: `super`.`super`.`Foundation`.`SIZE`,
)
public typealias `DVEXTENTMODE` = Int;
public const val `DVEXTENT_CONTENT`: `DVEXTENTMODE` = 0;
public const val `DVEXTENT_INTEGRAL`: `DVEXTENTMODE` = 1;
public typealias `EDIT_LINKS_FLAGS` = UInt;
public const val `ELF_DISABLECANCELLINK`: `EDIT_LINKS_FLAGS` = 16u;
public const val `ELF_DISABLECHANGESOURCE`: `EDIT_LINKS_FLAGS` = 8u;
public const val `ELF_DISABLEOPENSOURCE`: `EDIT_LINKS_FLAGS` = 4u;
public const val `ELF_DISABLEUPDATENOW`: `EDIT_LINKS_FLAGS` = 2u;
public const val `ELF_SHOWHELP`: `EDIT_LINKS_FLAGS` = 1u;
public const val `EMBDHLP_CREATENOW`: `EMBDHLP_FLAGS` = 0u;
public const val `EMBDHLP_DELAYCREATE`: `EMBDHLP_FLAGS` = 65536u;
public typealias `EMBDHLP_FLAGS` = UInt;
public const val `EMBDHLP_INPROC_HANDLER`: `EMBDHLP_FLAGS` = 0u;
public const val `EMBDHLP_INPROC_SERVER`: `EMBDHLP_FLAGS` = 1u;
public typealias `ENUM_CONTROLS_WHICH_FLAGS` = UInt;
public typealias `FDEX_PROP_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FONTDESC` (
    public var `cbSizeofstruct`: UInt,
    public var `lpstrName`: `windows_sys`.`core`.`PWSTR`,
    public var `cySize`: `super`.`Com`.`CY`,
    public var `sWeight`: Short,
    public var `sCharset`: Short,
    public var `fItalic`: `windows_sys`.`core`.`BOOL`,
    public var `fUnderline`: `windows_sys`.`core`.`BOOL`,
    public var `fStrikethrough`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 993:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for FONTDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GCW_WCH_SIBLING`: `ENUM_CONTROLS_WHICH_FLAGS` = 1u;
public const val `GC_WCH_ALL`: `ENUM_CONTROLS_WHICH_FLAGS` = 4u;
public const val `GC_WCH_CONTAINED`: `ENUM_CONTROLS_WHICH_FLAGS` = 3u;
public const val `GC_WCH_CONTAINER`: `ENUM_CONTROLS_WHICH_FLAGS` = 2u;
public const val `GC_WCH_FONLYAFTER`: `ENUM_CONTROLS_WHICH_FLAGS` = 268435456u;
public const val `GC_WCH_FONLYBEFORE`: `ENUM_CONTROLS_WHICH_FLAGS` = 536870912u;
public const val `GC_WCH_FREVERSEDIR`: `ENUM_CONTROLS_WHICH_FLAGS` = 134217728u;
public const val `GC_WCH_FSELECTED`: `ENUM_CONTROLS_WHICH_FLAGS` = 1073741824u;
public const val `GC_WCH_SIBLING`: Int = 1;
public typealias `GUIDKIND` = Int;
public const val `GUIDKIND_DEFAULT_SOURCE_DISP_IID`: `GUIDKIND` = 1;
// UNSUPPORTED Rust 1010:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_CHECKVALUEEXCLUSIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430c_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1011:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_COLOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504301_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1012:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_FONTBOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430f_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1013:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_FONTITALIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504310_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1014:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_FONTNAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430d_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1015:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_FONTSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430e_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1016:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_FONTSTRIKETHROUGH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504312_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1017:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_FONTUNDERSCORE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504311_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1018:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HANDLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504313_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1019:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_HIMETRIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504300_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1020:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_OPTIONVALUEEXCLUSIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430b_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1021:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_TRISTATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430a_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1022:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_XPOS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504306_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1023:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_XPOSPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504302_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1024:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_XSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504308_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1025:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_XSIZEPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504304_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1026:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_YPOS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504307_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1027:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_YPOSPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504303_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1028:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_YSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504309_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1029:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_YSIZEPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504305_be0f_101a_8bbb_00aa00300cab);

public typealias `HITRESULT` = Int;
public const val `HITRESULT_CLOSE`: `HITRESULT` = 2;
public const val `HITRESULT_HIT`: `HITRESULT` = 3;
public const val `HITRESULT_OUTSIDE`: `HITRESULT` = 0;
public const val `HITRESULT_TRANSPARENT`: `HITRESULT` = 1;
public const val `IDC_BZ_ICON`: UInt = 601u;
public const val `IDC_BZ_MESSAGE1`: UInt = 602u;
public const val `IDC_BZ_RETRY`: UInt = 600u;
public const val `IDC_BZ_SWITCHTO`: UInt = 604u;
public const val `IDC_CI_BROWSE`: UInt = 130u;
public const val `IDC_CI_CURRENT`: UInt = 121u;
public const val `IDC_CI_CURRENTICON`: UInt = 122u;
public const val `IDC_CI_DEFAULT`: UInt = 123u;
public const val `IDC_CI_DEFAULTICON`: UInt = 124u;
public const val `IDC_CI_FROMFILE`: UInt = 125u;
public const val `IDC_CI_FROMFILEEDIT`: UInt = 126u;
public const val `IDC_CI_GROUP`: UInt = 120u;
public const val `IDC_CI_ICONDISPLAY`: UInt = 131u;
public const val `IDC_CI_ICONLIST`: UInt = 127u;
public const val `IDC_CI_LABEL`: UInt = 128u;
public const val `IDC_CI_LABELEDIT`: UInt = 129u;
public const val `IDC_CV_ACTIVATEAS`: UInt = 156u;
public const val `IDC_CV_ACTIVATELIST`: UInt = 154u;
public const val `IDC_CV_CHANGEICON`: UInt = 153u;
public const val `IDC_CV_CONVERTLIST`: UInt = 158u;
public const val `IDC_CV_CONVERTTO`: UInt = 155u;
public const val `IDC_CV_DISPLAYASICON`: UInt = 152u;
public const val `IDC_CV_ICONDISPLAY`: UInt = 165u;
public const val `IDC_CV_OBJECTTYPE`: UInt = 150u;
public const val `IDC_CV_RESULTTEXT`: UInt = 157u;
public const val `IDC_EL_AUTOMATIC`: UInt = 202u;
public const val `IDC_EL_CANCELLINK`: UInt = 209u;
public const val `IDC_EL_CHANGESOURCE`: UInt = 201u;
public const val `IDC_EL_COL1`: UInt = 220u;
public const val `IDC_EL_COL2`: UInt = 221u;
public const val `IDC_EL_COL3`: UInt = 222u;
public const val `IDC_EL_LINKSLISTBOX`: UInt = 206u;
public const val `IDC_EL_LINKSOURCE`: UInt = 216u;
public const val `IDC_EL_LINKTYPE`: UInt = 217u;
public const val `IDC_EL_MANUAL`: UInt = 212u;
public const val `IDC_EL_OPENSOURCE`: UInt = 211u;
public const val `IDC_EL_UPDATENOW`: UInt = 210u;
public const val `IDC_GP_CONVERT`: UInt = 1013u;
public const val `IDC_GP_OBJECTICON`: UInt = 1014u;
public const val `IDC_GP_OBJECTLOCATION`: UInt = 1022u;
public const val `IDC_GP_OBJECTNAME`: UInt = 1009u;
public const val `IDC_GP_OBJECTSIZE`: UInt = 1011u;
public const val `IDC_GP_OBJECTTYPE`: UInt = 1010u;
public const val `IDC_IO_ADDCONTROL`: UInt = 2115u;
public const val `IDC_IO_CHANGEICON`: UInt = 2105u;
public const val `IDC_IO_CONTROLTYPELIST`: UInt = 2116u;
public const val `IDC_IO_CREATEFROMFILE`: UInt = 2101u;
public const val `IDC_IO_CREATENEW`: UInt = 2100u;
public const val `IDC_IO_DISPLAYASICON`: UInt = 2104u;
public const val `IDC_IO_FILE`: UInt = 2106u;
public const val `IDC_IO_FILEDISPLAY`: UInt = 2107u;
public const val `IDC_IO_FILETEXT`: UInt = 2112u;
public const val `IDC_IO_FILETYPE`: UInt = 2113u;
public const val `IDC_IO_ICONDISPLAY`: UInt = 2110u;
public const val `IDC_IO_INSERTCONTROL`: UInt = 2114u;
public const val `IDC_IO_LINKFILE`: UInt = 2102u;
public const val `IDC_IO_OBJECTTYPELIST`: UInt = 2103u;
public const val `IDC_IO_OBJECTTYPETEXT`: UInt = 2111u;
public const val `IDC_IO_RESULTIMAGE`: UInt = 2108u;
public const val `IDC_IO_RESULTTEXT`: UInt = 2109u;
public const val `IDC_LP_AUTOMATIC`: UInt = 1016u;
public const val `IDC_LP_BREAKLINK`: UInt = 1008u;
public const val `IDC_LP_CHANGESOURCE`: UInt = 1015u;
public const val `IDC_LP_DATE`: UInt = 1018u;
public const val `IDC_LP_LINKSOURCE`: UInt = 1012u;
public const val `IDC_LP_MANUAL`: UInt = 1017u;
public const val `IDC_LP_OPENSOURCE`: UInt = 1006u;
public const val `IDC_LP_TIME`: UInt = 1019u;
public const val `IDC_LP_UPDATENOW`: UInt = 1007u;
public const val `IDC_OLEUIHELP`: UInt = 99u;
public const val `IDC_PS_CHANGEICON`: UInt = 508u;
public const val `IDC_PS_DISPLAYASICON`: UInt = 506u;
public const val `IDC_PS_DISPLAYLIST`: UInt = 505u;
public const val `IDC_PS_ICONDISPLAY`: UInt = 507u;
public const val `IDC_PS_PASTE`: UInt = 500u;
public const val `IDC_PS_PASTELINK`: UInt = 501u;
public const val `IDC_PS_PASTELINKLIST`: UInt = 504u;
public const val `IDC_PS_PASTELIST`: UInt = 503u;
public const val `IDC_PS_RESULTIMAGE`: UInt = 509u;
public const val `IDC_PS_RESULTTEXT`: UInt = 510u;
public const val `IDC_PS_SOURCETEXT`: UInt = 502u;
public const val `IDC_PU_CONVERT`: UInt = 902u;
public const val `IDC_PU_ICON`: UInt = 908u;
public const val `IDC_PU_LINKS`: UInt = 900u;
public const val `IDC_PU_TEXT`: UInt = 901u;
public const val `IDC_UL_METER`: UInt = 1029u;
public const val `IDC_UL_PERCENT`: UInt = 1031u;
public const val `IDC_UL_PROGRESS`: UInt = 1032u;
public const val `IDC_UL_STOP`: UInt = 1030u;
public const val `IDC_VP_ASICON`: UInt = 1003u;
public const val `IDC_VP_CHANGEICON`: UInt = 1001u;
public const val `IDC_VP_EDITABLE`: UInt = 1002u;
public const val `IDC_VP_ICONDISPLAY`: UInt = 1021u;
public const val `IDC_VP_PERCENT`: UInt = 1000u;
public const val `IDC_VP_RELATIVE`: UInt = 1005u;
public const val `IDC_VP_RESULTIMAGE`: UInt = 1033u;
public const val `IDC_VP_SCALETXT`: UInt = 1034u;
public const val `IDC_VP_SPIN`: UInt = 1006u;
public const val `IDD_BUSY`: UInt = 1006u;
public const val `IDD_CANNOTUPDATELINK`: UInt = 1008u;
public const val `IDD_CHANGEICON`: UInt = 1001u;
public const val `IDD_CHANGEICONBROWSE`: UInt = 1011u;
public const val `IDD_CHANGESOURCE`: UInt = 1009u;
public const val `IDD_CHANGESOURCE4`: UInt = 1013u;
public const val `IDD_CONVERT`: UInt = 1002u;
public const val `IDD_CONVERT4`: UInt = 1103u;
public const val `IDD_CONVERTONLY`: UInt = 1012u;
public const val `IDD_CONVERTONLY4`: UInt = 1104u;
public const val `IDD_EDITLINKS`: UInt = 1004u;
public const val `IDD_EDITLINKS4`: UInt = 1105u;
public const val `IDD_GNRLPROPS`: UInt = 1100u;
public const val `IDD_GNRLPROPS4`: UInt = 1106u;
public const val `IDD_INSERTFILEBROWSE`: UInt = 1010u;
public const val `IDD_INSERTOBJECT`: UInt = 1000u;
public const val `IDD_LINKPROPS`: UInt = 1102u;
public const val `IDD_LINKPROPS4`: UInt = 1107u;
public const val `IDD_LINKSOURCEUNAVAILABLE`: UInt = 1020u;
public const val `IDD_LINKTYPECHANGED`: UInt = 1022u;
public const val `IDD_LINKTYPECHANGEDA`: UInt = 1026u;
public const val `IDD_LINKTYPECHANGEDW`: UInt = 1022u;
public const val `IDD_OUTOFMEMORY`: UInt = 1024u;
public const val `IDD_PASTESPECIAL`: UInt = 1003u;
public const val `IDD_PASTESPECIAL4`: UInt = 1108u;
public const val `IDD_SERVERNOTFOUND`: UInt = 1023u;
public const val `IDD_SERVERNOTREG`: UInt = 1021u;
public const val `IDD_SERVERNOTREGA`: UInt = 1025u;
public const val `IDD_SERVERNOTREGW`: UInt = 1021u;
public const val `IDD_UPDATELINKS`: UInt = 1007u;
public const val `IDD_VIEWPROPS`: UInt = 1101u;
public const val `ID_BROWSE_ADDCONTROL`: UInt = 3u;
public const val `ID_BROWSE_CHANGEICON`: UInt = 1u;
public const val `ID_BROWSE_CHANGESOURCE`: UInt = 4u;
public const val `ID_BROWSE_INSERTFILE`: UInt = 2u;
public const val `ID_DEFAULTINST`: Int = -2;
public typealias `IGNOREMIME` = Int;
public const val `IGNOREMIME_PROMPT`: `IGNOREMIME` = 1;
public const val `IGNOREMIME_TEXT`: `IGNOREMIME` = 2;
public typealias `INSERT_OBJECT_FLAGS` = UInt;
public const val `INSTALL_SCOPE_INVALID`: UInt = 0u;
public const val `INSTALL_SCOPE_MACHINE`: UInt = 1u;
public const val `INSTALL_SCOPE_USER`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERFACEDATA` (
    public var `pmethdata`: /* Rust *mut */ kotlinx.cinterop.CPointer<`METHODDATA`>?,
    public var `cMembers`: UInt,
)
// UNSUPPORTED Rust 1183:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for INTERFACEDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IOF_CHECKDISPLAYASICON`: `INSERT_OBJECT_FLAGS` = 16u;
public const val `IOF_CHECKLINK`: `INSERT_OBJECT_FLAGS` = 8u;
public const val `IOF_CREATEFILEOBJECT`: `INSERT_OBJECT_FLAGS` = 64u;
public const val `IOF_CREATELINKOBJECT`: `INSERT_OBJECT_FLAGS` = 128u;
public const val `IOF_CREATENEWOBJECT`: `INSERT_OBJECT_FLAGS` = 32u;
public const val `IOF_DISABLEDISPLAYASICON`: `INSERT_OBJECT_FLAGS` = 1024u;
public const val `IOF_DISABLELINK`: `INSERT_OBJECT_FLAGS` = 256u;
public const val `IOF_HIDECHANGEICON`: `INSERT_OBJECT_FLAGS` = 2048u;
public const val `IOF_SELECTCREATECONTROL`: `INSERT_OBJECT_FLAGS` = 8192u;
public const val `IOF_SELECTCREATEFROMFILE`: `INSERT_OBJECT_FLAGS` = 4u;
public const val `IOF_SELECTCREATENEW`: `INSERT_OBJECT_FLAGS` = 2u;
public const val `IOF_SHOWHELP`: `INSERT_OBJECT_FLAGS` = 1u;
public const val `IOF_SHOWINSERTCONTROL`: `INSERT_OBJECT_FLAGS` = 4096u;
public const val `IOF_VERIFYSERVERSEXIST`: `INSERT_OBJECT_FLAGS` = 512u;
public typealias `KEYMODIFIERS` = UInt;
public const val `KEYMOD_ALT`: `KEYMODIFIERS` = 4u;
public const val `KEYMOD_CONTROL`: `KEYMODIFIERS` = 2u;
public const val `KEYMOD_SHIFT`: `KEYMODIFIERS` = 1u;
public typealias `LIBFLAGS` = Int;
public const val `LIBFLAG_FCONTROL`: `LIBFLAGS` = 2;
public const val `LIBFLAG_FHASDISKIMAGE`: `LIBFLAGS` = 8;
public const val `LIBFLAG_FHIDDEN`: `LIBFLAGS` = 4;
public const val `LIBFLAG_FRESTRICTED`: `LIBFLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LICINFO` (
    public var `cbLicInfo`: Int,
    public var `fRuntimeKeyAvail`: `windows_sys`.`core`.`BOOL`,
    public var `fLicVerified`: `windows_sys`.`core`.`BOOL`,
)
public typealias `LOAD_PICTURE_FLAGS` = UInt;
public const val `LOAD_TLB_AS_32BIT`: UInt = 32u;
public const val `LOAD_TLB_AS_64BIT`: UInt = 64u;
public const val `LOCALE_USE_NLS`: UInt = 268435456u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNOLEUIHOOK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> UInt>>>;
public const val `LP_COLOR`: `LOAD_PICTURE_FLAGS` = 4u;
public const val `LP_DEFAULT`: `LOAD_PICTURE_FLAGS` = 0u;
public const val `LP_MONOCHROME`: `LOAD_PICTURE_FLAGS` = 1u;
public const val `LP_VGACOLOR`: `LOAD_PICTURE_FLAGS` = 2u;
public const val `MEDIAPLAYBACK_PAUSE`: `MEDIAPLAYBACK_STATE` = 1;
public const val `MEDIAPLAYBACK_PAUSE_AND_SUSPEND`: `MEDIAPLAYBACK_STATE` = 2;
public const val `MEDIAPLAYBACK_RESUME`: `MEDIAPLAYBACK_STATE` = 0;
public const val `MEDIAPLAYBACK_RESUME_FROM_SUSPEND`: `MEDIAPLAYBACK_STATE` = 3;
public typealias `MEDIAPLAYBACK_STATE` = Int;
public const val `MEMBERID_NIL`: Int = -1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `METHODDATA` (
    public var `szName`: `windows_sys`.`core`.`PWSTR`,
    public var `ppdata`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PARAMDATA`>?,
    public var `dispid`: Int,
    public var `iMeth`: UInt,
    public var `cc`: `super`.`Com`.`CALLCONV`,
    public var `cArgs`: UInt,
    public var `wFlags`: UShort,
    public var `vtReturn`: `super`.`Variant`.`VARENUM`,
)
// UNSUPPORTED Rust 1247:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for METHODDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MK_ALT`: UInt = 32u;
public const val `MSOCMDERR_E_CANCELED`: Int = -2147221245;
public const val `MSOCMDERR_E_DISABLED`: Int = -2147221247;
public const val `MSOCMDERR_E_FIRST`: Int = -2147221248;
public const val `MSOCMDERR_E_NOHELP`: Int = -2147221246;
public const val `MSOCMDERR_E_NOTSUPPORTED`: Int = -2147221248;
public const val `MSOCMDERR_E_UNKNOWNGROUP`: Int = -2147221244;
public typealias `MULTICLASSINFO_FLAGS` = UInt;
public const val `MULTICLASSINFO_GETIIDPRIMARY`: `MULTICLASSINFO_FLAGS` = 4u;
public const val `MULTICLASSINFO_GETIIDSOURCE`: `MULTICLASSINFO_FLAGS` = 8u;
public const val `MULTICLASSINFO_GETNUMRESERVEDDISPIDS`: `MULTICLASSINFO_FLAGS` = 2u;
public const val `MULTICLASSINFO_GETTYPEINFO`: `MULTICLASSINFO_FLAGS` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NUMPARSE` (
    public var `cDig`: Int,
    public var `dwInFlags`: `NUMPARSE_FLAGS`,
    public var `dwOutFlags`: `NUMPARSE_FLAGS`,
    public var `cchUsed`: Int,
    public var `nBaseShift`: Int,
    public var `nPwr10`: Int,
)
public typealias `NUMPARSE_FLAGS` = UInt;
public const val `NUMPRS_CURRENCY`: `NUMPARSE_FLAGS` = 1024u;
public const val `NUMPRS_DECIMAL`: `NUMPARSE_FLAGS` = 256u;
public const val `NUMPRS_EXPONENT`: `NUMPARSE_FLAGS` = 2048u;
public const val `NUMPRS_HEX_OCT`: `NUMPARSE_FLAGS` = 64u;
public const val `NUMPRS_INEXACT`: `NUMPARSE_FLAGS` = 131072u;
public const val `NUMPRS_LEADING_MINUS`: `NUMPARSE_FLAGS` = 16u;
public const val `NUMPRS_LEADING_PLUS`: `NUMPARSE_FLAGS` = 4u;
public const val `NUMPRS_LEADING_WHITE`: `NUMPARSE_FLAGS` = 1u;
public const val `NUMPRS_NEG`: `NUMPARSE_FLAGS` = 65536u;
public const val `NUMPRS_PARENS`: `NUMPARSE_FLAGS` = 128u;
public const val `NUMPRS_STD`: `NUMPARSE_FLAGS` = 8191u;
public const val `NUMPRS_THOUSANDS`: `NUMPARSE_FLAGS` = 512u;
public const val `NUMPRS_TRAILING_MINUS`: `NUMPARSE_FLAGS` = 32u;
public const val `NUMPRS_TRAILING_PLUS`: `NUMPARSE_FLAGS` = 8u;
public const val `NUMPRS_TRAILING_WHITE`: `NUMPARSE_FLAGS` = 2u;
public const val `NUMPRS_USE_ALL`: `NUMPARSE_FLAGS` = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OBJECTDESCRIPTOR` (
    public var `cbSize`: UInt,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `dwDrawAspect`: UInt,
    public var `sizel`: `super`.`super`.`Foundation`.`SIZE`,
    public var `pointl`: `super`.`super`.`Foundation`.`POINTL`,
    public var `dwStatus`: UInt,
    public var `dwFullUserTypeName`: UInt,
    public var `dwSrcOfCopy`: UInt,
)
public typealias `OBJECT_PROPERTIES_FLAGS` = UInt;
public const val `OCM__BASE`: UInt = 8192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OCPFIPARAMS` (
    public var `cbStructSize`: UInt,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `x`: Int,
    public var `y`: Int,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `cObjects`: UInt,
    public var `lplpUnk`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `cPages`: UInt,
    public var `lpPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `lcid`: UInt,
    public var `dispidInitialProperty`: Int,
)
// UNSUPPORTED Rust 1321:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OCPFIPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OF_GET`: UInt = 2u;
public const val `OF_HANDLER`: UInt = 4u;
public const val `OF_SET`: UInt = 1u;
public typealias `OLECLOSE` = Int;
public const val `OLECLOSE_NOSAVE`: `OLECLOSE` = 1;
public const val `OLECLOSE_PROMPTSAVE`: `OLECLOSE` = 2;
public const val `OLECLOSE_SAVEIFDIRTY`: `OLECLOSE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OLECMD` (
    public var `cmdID`: UInt,
    public var `cmdf`: UInt,
)
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_CLSID`: UInt = 2u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_DISPLAYNAME`: UInt = 1u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_INSTALLSCOPE`: UInt = 3u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_PUBLISHER`: UInt = 0u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_SOURCEURL`: UInt = 4u;
public const val `OLECMDARGINDEX_SHOWPAGEACTIONMENU_HWND`: UInt = 0u;
public const val `OLECMDARGINDEX_SHOWPAGEACTIONMENU_X`: UInt = 1u;
public const val `OLECMDARGINDEX_SHOWPAGEACTIONMENU_Y`: UInt = 2u;
public const val `OLECMDERR_E_CANCELED`: Int = -2147221245;
public const val `OLECMDERR_E_DISABLED`: Int = -2147221247;
public const val `OLECMDERR_E_FIRST`: Int = -2147221248;
public const val `OLECMDERR_E_NOHELP`: Int = -2147221246;
public const val `OLECMDERR_E_NOTSUPPORTED`: Int = -2147221248;
public const val `OLECMDERR_E_UNKNOWNGROUP`: Int = -2147221244;
public typealias `OLECMDEXECOPT` = Int;
public const val `OLECMDEXECOPT_DODEFAULT`: `OLECMDEXECOPT` = 0;
public const val `OLECMDEXECOPT_DONTPROMPTUSER`: `OLECMDEXECOPT` = 2;
public const val `OLECMDEXECOPT_PROMPTUSER`: `OLECMDEXECOPT` = 1;
public const val `OLECMDEXECOPT_SHOWHELP`: `OLECMDEXECOPT` = 3;
public typealias `OLECMDF` = Int;
public const val `OLECMDF_DEFHIDEONCTXTMENU`: `OLECMDF` = 32;
public const val `OLECMDF_ENABLED`: `OLECMDF` = 2;
public const val `OLECMDF_INVISIBLE`: `OLECMDF` = 16;
public const val `OLECMDF_LATCHED`: `OLECMDF` = 4;
public const val `OLECMDF_NINCHED`: `OLECMDF` = 8;
public const val `OLECMDF_SUPPORTED`: `OLECMDF` = 1;
public typealias `OLECMDID` = Int;
public const val `OLECMDIDF_BROWSERSTATE_BLOCKEDVERSION`: `OLECMDID_BROWSERSTATEFLAG` = 64;
public const val `OLECMDIDF_BROWSERSTATE_DESKTOPHTMLDIALOG`: `OLECMDID_BROWSERSTATEFLAG` = 32;
public const val `OLECMDIDF_BROWSERSTATE_EXTENSIONSOFF`: `OLECMDID_BROWSERSTATEFLAG` = 1;
public const val `OLECMDIDF_BROWSERSTATE_IESECURITY`: `OLECMDID_BROWSERSTATEFLAG` = 2;
public const val `OLECMDIDF_BROWSERSTATE_PROTECTEDMODE_OFF`: `OLECMDID_BROWSERSTATEFLAG` = 4;
public const val `OLECMDIDF_BROWSERSTATE_REQUIRESACTIVEX`: `OLECMDID_BROWSERSTATEFLAG` = 16;
public const val `OLECMDIDF_BROWSERSTATE_RESET`: `OLECMDID_BROWSERSTATEFLAG` = 8;
public const val `OLECMDIDF_OPTICAL_ZOOM_NOLAYOUT`: `OLECMDID_OPTICAL_ZOOMFLAG` = 16;
public const val `OLECMDIDF_OPTICAL_ZOOM_NOPERSIST`: `OLECMDID_OPTICAL_ZOOMFLAG` = 1;
public const val `OLECMDIDF_OPTICAL_ZOOM_NOTRANSIENT`: `OLECMDID_OPTICAL_ZOOMFLAG` = 32;
public const val `OLECMDIDF_OPTICAL_ZOOM_RELOADFORNEWTAB`: `OLECMDID_OPTICAL_ZOOMFLAG` = 64;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXDISALLOW`: `OLECMDID_PAGEACTIONFLAG` = 16;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXINSTALL`: `OLECMDID_PAGEACTIONFLAG` = 2;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXTRUSTFAIL`: `OLECMDID_PAGEACTIONFLAG` = 4;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXUNSAFE`: `OLECMDID_PAGEACTIONFLAG` = 32;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXUSERAPPROVAL`: `OLECMDID_PAGEACTIONFLAG` = 262144;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXUSERDISABLE`: `OLECMDID_PAGEACTIONFLAG` = 8;
public const val `OLECMDIDF_PAGEACTION_ACTIVEX_EPM_INCOMPATIBLE`: `OLECMDID_PAGEACTIONFLAG` = 16777216;
public const val `OLECMDIDF_PAGEACTION_EXTENSION_COMPAT_BLOCKED`: `OLECMDID_PAGEACTIONFLAG` = 268435456;
public const val `OLECMDIDF_PAGEACTION_FILEDOWNLOAD`: `OLECMDID_PAGEACTIONFLAG` = 1;
public const val `OLECMDIDF_PAGEACTION_GENERIC_STATE`: `OLECMDID_PAGEACTIONFLAG` = 1073741824;
public const val `OLECMDIDF_PAGEACTION_INTRANETZONEREQUEST`: `OLECMDID_PAGEACTIONFLAG` = 2097152;
public const val `OLECMDIDF_PAGEACTION_INVALID_CERT`: `OLECMDID_PAGEACTIONFLAG` = 1048576;
public const val `OLECMDIDF_PAGEACTION_LOCALMACHINE`: `OLECMDID_PAGEACTIONFLAG` = 128;
public const val `OLECMDIDF_PAGEACTION_MIMETEXTPLAIN`: `OLECMDID_PAGEACTIONFLAG` = 256;
public const val `OLECMDIDF_PAGEACTION_MIXEDCONTENT`: `OLECMDID_PAGEACTIONFLAG` = 524288;
public const val `OLECMDIDF_PAGEACTION_NORESETACTIVEX`: `OLECMDID_PAGEACTIONFLAG` = 536870912;
public const val `OLECMDIDF_PAGEACTION_POPUPALLOWED`: `OLECMDID_PAGEACTIONFLAG` = 65536;
public const val `OLECMDIDF_PAGEACTION_POPUPWINDOW`: `OLECMDID_PAGEACTIONFLAG` = 64;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNDENY`: `OLECMDID_PAGEACTIONFLAG` = 32768;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNINTERNET`: `OLECMDID_PAGEACTIONFLAG` = 8192;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNINTRANET`: `OLECMDID_PAGEACTIONFLAG` = 4096;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNLOCALMACHINE`: `OLECMDID_PAGEACTIONFLAG` = 1024;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNRESTRICTED`: `OLECMDID_PAGEACTIONFLAG` = 16384;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNTRUSTED`: `OLECMDID_PAGEACTIONFLAG` = 2048;
public const val `OLECMDIDF_PAGEACTION_RESET`: `OLECMDID_PAGEACTIONFLAG` = -2147483648;
public const val `OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE`: `OLECMDID_PAGEACTIONFLAG` = 512;
public const val `OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE_ACTIVEXINSTALL`: `OLECMDID_PAGEACTIONFLAG` = 512;
public const val `OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE_ACTIVEXUSERAPPROVAL`: `OLECMDID_PAGEACTIONFLAG` = 33554432;
public const val `OLECMDIDF_PAGEACTION_SCRIPTPROMPT`: `OLECMDID_PAGEACTIONFLAG` = 131072;
public const val `OLECMDIDF_PAGEACTION_SPOOFABLEIDNHOST`: `OLECMDID_PAGEACTIONFLAG` = 8388608;
public const val `OLECMDIDF_PAGEACTION_WPCBLOCKED`: `OLECMDID_PAGEACTIONFLAG` = 67108864;
public const val `OLECMDIDF_PAGEACTION_WPCBLOCKED_ACTIVEX`: `OLECMDID_PAGEACTIONFLAG` = 134217728;
public const val `OLECMDIDF_PAGEACTION_XSSFILTERED`: `OLECMDID_PAGEACTIONFLAG` = 4194304;
public const val `OLECMDIDF_REFRESH_CLEARUSERINPUT`: `OLECMDID_REFRESHFLAG` = 4096;
public const val `OLECMDIDF_REFRESH_COMPLETELY`: `OLECMDID_REFRESHFLAG` = 3;
public const val `OLECMDIDF_REFRESH_CONTINUE`: `OLECMDID_REFRESHFLAG` = 2;
public const val `OLECMDIDF_REFRESH_IFEXPIRED`: `OLECMDID_REFRESHFLAG` = 1;
public const val `OLECMDIDF_REFRESH_LEVELMASK`: `OLECMDID_REFRESHFLAG` = 255;
public const val `OLECMDIDF_REFRESH_NORMAL`: `OLECMDID_REFRESHFLAG` = 0;
public const val `OLECMDIDF_REFRESH_NO_CACHE`: `OLECMDID_REFRESHFLAG` = 4;
public const val `OLECMDIDF_REFRESH_PAGEACTION_ACTIVEXINSTALL`: `OLECMDID_REFRESHFLAG` = 65536;
public const val `OLECMDIDF_REFRESH_PAGEACTION_ALLOW_VERSION`: `OLECMDID_REFRESHFLAG` = 134217728;
public const val `OLECMDIDF_REFRESH_PAGEACTION_FILEDOWNLOAD`: `OLECMDID_REFRESHFLAG` = 131072;
public const val `OLECMDIDF_REFRESH_PAGEACTION_INVALID_CERT`: `OLECMDID_REFRESHFLAG` = 67108864;
public const val `OLECMDIDF_REFRESH_PAGEACTION_LOCALMACHINE`: `OLECMDID_REFRESHFLAG` = 262144;
public const val `OLECMDIDF_REFRESH_PAGEACTION_MIXEDCONTENT`: `OLECMDID_REFRESHFLAG` = 33554432;
public const val `OLECMDIDF_REFRESH_PAGEACTION_POPUPWINDOW`: `OLECMDID_REFRESHFLAG` = 524288;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNINTERNET`: `OLECMDID_REFRESHFLAG` = 8388608;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNINTRANET`: `OLECMDID_REFRESHFLAG` = 4194304;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNLOCALMACHINE`: `OLECMDID_REFRESHFLAG` = 1048576;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNRESTRICTED`: `OLECMDID_REFRESHFLAG` = 16777216;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNTRUSTED`: `OLECMDID_REFRESHFLAG` = 2097152;
public const val `OLECMDIDF_REFRESH_PROMPTIFOFFLINE`: `OLECMDID_REFRESHFLAG` = 8192;
public const val `OLECMDIDF_REFRESH_RELOAD`: `OLECMDID_REFRESHFLAG` = 5;
public const val `OLECMDIDF_REFRESH_SKIPBEFOREUNLOADEVENT`: `OLECMDID_REFRESHFLAG` = 32768;
public const val `OLECMDIDF_REFRESH_THROUGHSCRIPT`: `OLECMDID_REFRESHFLAG` = 16384;
public const val `OLECMDIDF_VIEWPORTMODE_EXCLUDE_VISUAL_BOTTOM`: `OLECMDID_VIEWPORT_MODE_FLAG` = 2;
public const val `OLECMDIDF_VIEWPORTMODE_EXCLUDE_VISUAL_BOTTOM_VALID`: `OLECMDID_VIEWPORT_MODE_FLAG` = 131072;
public const val `OLECMDIDF_VIEWPORTMODE_FIXED_LAYOUT_WIDTH`: `OLECMDID_VIEWPORT_MODE_FLAG` = 1;
public const val `OLECMDIDF_VIEWPORTMODE_FIXED_LAYOUT_WIDTH_VALID`: `OLECMDID_VIEWPORT_MODE_FLAG` = 65536;
public const val `OLECMDIDF_WINDOWSTATE_ENABLED`: `OLECMDID_WINDOWSTATE_FLAG` = 2;
public const val `OLECMDIDF_WINDOWSTATE_ENABLED_VALID`: `OLECMDID_WINDOWSTATE_FLAG` = 131072;
public const val `OLECMDIDF_WINDOWSTATE_USERVISIBLE`: `OLECMDID_WINDOWSTATE_FLAG` = 1;
public const val `OLECMDIDF_WINDOWSTATE_USERVISIBLE_VALID`: `OLECMDID_WINDOWSTATE_FLAG` = 65536;
public const val `OLECMDID_ACTIVEXINSTALLSCOPE`: `OLECMDID` = 66;
public const val `OLECMDID_ADDTRAVELENTRY`: `OLECMDID` = 60;
public const val `OLECMDID_ALLOWUILESSSAVEAS`: `OLECMDID` = 46;
public typealias `OLECMDID_BROWSERSTATEFLAG` = Int;
public const val `OLECMDID_CLEARSELECTION`: `OLECMDID` = 18;
public const val `OLECMDID_CLOSE`: `OLECMDID` = 45;
public const val `OLECMDID_COPY`: `OLECMDID` = 12;
public const val `OLECMDID_CUT`: `OLECMDID` = 11;
public const val `OLECMDID_DELETE`: `OLECMDID` = 33;
public const val `OLECMDID_DONTDOWNLOADCSS`: `OLECMDID` = 47;
public const val `OLECMDID_ENABLE_INTERACTION`: `OLECMDID` = 36;
public const val `OLECMDID_ENABLE_VISIBILITY`: `OLECMDID` = 77;
public const val `OLECMDID_EXITFULLSCREEN`: `OLECMDID` = 81;
public const val `OLECMDID_FIND`: `OLECMDID` = 32;
public const val `OLECMDID_FOCUSVIEWCONTROLS`: `OLECMDID` = 57;
public const val `OLECMDID_FOCUSVIEWCONTROLSQUERY`: `OLECMDID` = 58;
public const val `OLECMDID_GETPRINTTEMPLATE`: `OLECMDID` = 52;
public const val `OLECMDID_GETUSERSCALABLE`: `OLECMDID` = 75;
public const val `OLECMDID_GETZOOMRANGE`: `OLECMDID` = 20;
public const val `OLECMDID_HIDETOOLBARS`: `OLECMDID` = 24;
public const val `OLECMDID_HTTPEQUIV`: `OLECMDID` = 34;
public const val `OLECMDID_HTTPEQUIV_DONE`: `OLECMDID` = 35;
public const val `OLECMDID_LAYOUT_VIEWPORT_WIDTH`: `OLECMDID` = 71;
public const val `OLECMDID_MEDIA_PLAYBACK`: `OLECMDID` = 78;
public const val `OLECMDID_NEW`: `OLECMDID` = 2;
public const val `OLECMDID_ONBEFOREUNLOAD`: `OLECMDID` = 83;
public const val `OLECMDID_ONTOOLBARACTIVATED`: `OLECMDID` = 31;
public const val `OLECMDID_ONUNLOAD`: `OLECMDID` = 37;
public const val `OLECMDID_OPEN`: `OLECMDID` = 1;
public const val `OLECMDID_OPTICAL_GETZOOMRANGE`: `OLECMDID` = 64;
public const val `OLECMDID_OPTICAL_ZOOM`: `OLECMDID` = 63;
public typealias `OLECMDID_OPTICAL_ZOOMFLAG` = Int;
public const val `OLECMDID_PAGEACTIONBLOCKED`: `OLECMDID` = 55;
public typealias `OLECMDID_PAGEACTIONFLAG` = Int;
public const val `OLECMDID_PAGEACTIONUIQUERY`: `OLECMDID` = 56;
public const val `OLECMDID_PAGEAVAILABLE`: `OLECMDID` = 74;
public const val `OLECMDID_PAGESETUP`: `OLECMDID` = 8;
public const val `OLECMDID_PASTE`: `OLECMDID` = 13;
public const val `OLECMDID_PASTESPECIAL`: `OLECMDID` = 14;
public const val `OLECMDID_POPSTATEEVENT`: `OLECMDID` = 69;
public const val `OLECMDID_PREREFRESH`: `OLECMDID` = 39;
public const val `OLECMDID_PRINT`: `OLECMDID` = 6;
public const val `OLECMDID_PRINT2`: `OLECMDID` = 49;
public const val `OLECMDID_PRINTPREVIEW`: `OLECMDID` = 7;
public const val `OLECMDID_PRINTPREVIEW2`: `OLECMDID` = 50;
public const val `OLECMDID_PROPERTIES`: `OLECMDID` = 10;
public const val `OLECMDID_PROPERTYBAG2`: `OLECMDID` = 38;
public const val `OLECMDID_REDO`: `OLECMDID` = 16;
public const val `OLECMDID_REFRESH`: `OLECMDID` = 22;
public typealias `OLECMDID_REFRESHFLAG` = Int;
public const val `OLECMDID_SAVE`: `OLECMDID` = 3;
public const val `OLECMDID_SAVEAS`: `OLECMDID` = 4;
public const val `OLECMDID_SAVECOPYAS`: `OLECMDID` = 5;
public const val `OLECMDID_SCROLLCOMPLETE`: `OLECMDID` = 82;
public const val `OLECMDID_SELECTALL`: `OLECMDID` = 17;
public const val `OLECMDID_SETDOWNLOADSTATE`: `OLECMDID` = 29;
public const val `OLECMDID_SETFAVICON`: `OLECMDID` = 79;
public const val `OLECMDID_SETPRINTTEMPLATE`: `OLECMDID` = 51;
public const val `OLECMDID_SETPROGRESSMAX`: `OLECMDID` = 25;
public const val `OLECMDID_SETPROGRESSPOS`: `OLECMDID` = 26;
public const val `OLECMDID_SETPROGRESSTEXT`: `OLECMDID` = 27;
public const val `OLECMDID_SETTITLE`: `OLECMDID` = 28;
public const val `OLECMDID_SET_HOST_FULLSCREENMODE`: `OLECMDID` = 80;
public const val `OLECMDID_SHOWFIND`: `OLECMDID` = 42;
public const val `OLECMDID_SHOWMESSAGE`: `OLECMDID` = 41;
public const val `OLECMDID_SHOWMESSAGE_BLOCKABLE`: `OLECMDID` = 84;
public const val `OLECMDID_SHOWPAGEACTIONMENU`: `OLECMDID` = 59;
public const val `OLECMDID_SHOWPAGESETUP`: `OLECMDID` = 43;
public const val `OLECMDID_SHOWPRINT`: `OLECMDID` = 44;
public const val `OLECMDID_SHOWSCRIPTERROR`: `OLECMDID` = 40;
public const val `OLECMDID_SHOWTASKDLG`: `OLECMDID` = 68;
public const val `OLECMDID_SHOWTASKDLG_BLOCKABLE`: `OLECMDID` = 85;
public const val `OLECMDID_SPELL`: `OLECMDID` = 9;
public const val `OLECMDID_STOP`: `OLECMDID` = 23;
public const val `OLECMDID_STOPDOWNLOAD`: `OLECMDID` = 30;
public const val `OLECMDID_UNDO`: `OLECMDID` = 15;
public const val `OLECMDID_UPDATEBACKFORWARDSTATE`: `OLECMDID` = 62;
public const val `OLECMDID_UPDATECOMMANDS`: `OLECMDID` = 21;
public const val `OLECMDID_UPDATEPAGESTATUS`: `OLECMDID` = 48;
public const val `OLECMDID_UPDATETRAVELENTRY`: `OLECMDID` = 61;
public const val `OLECMDID_UPDATETRAVELENTRY_DATARECOVERY`: `OLECMDID` = 67;
public const val `OLECMDID_UPDATE_CARET`: `OLECMDID` = 76;
public const val `OLECMDID_USER_OPTICAL_ZOOM`: `OLECMDID` = 73;
public const val `OLECMDID_VIEWPORT_MODE`: `OLECMDID` = 70;
public typealias `OLECMDID_VIEWPORT_MODE_FLAG` = Int;
public const val `OLECMDID_VISUAL_VIEWPORT_EXCLUDE_BOTTOM`: `OLECMDID` = 72;
public const val `OLECMDID_WINDOWSTATECHANGED`: `OLECMDID` = 65;
public typealias `OLECMDID_WINDOWSTATE_FLAG` = Int;
public const val `OLECMDID_ZOOM`: `OLECMDID` = 19;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLECMDTEXT` (
    public var `cmdtextf`: UInt,
    public var `cwActual`: UInt,
    public var `cwBuf`: UInt,
    public var `rgwz`: UShortArray,
)
// UNSUPPORTED Rust 1538:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLECMDTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLECMDTEXTF` = Int;
public const val `OLECMDTEXTF_NAME`: `OLECMDTEXTF` = 1;
public const val `OLECMDTEXTF_NONE`: `OLECMDTEXTF` = 0;
public const val `OLECMDTEXTF_STATUS`: `OLECMDTEXTF` = 2;
public const val `OLECMD_TASKDLGID_ONBEFOREUNLOAD`: UInt = 1u;
public typealias `OLECONTF` = Int;
public const val `OLECONTF_EMBEDDINGS`: `OLECONTF` = 1;
public const val `OLECONTF_LINKS`: `OLECONTF` = 2;
public const val `OLECONTF_ONLYIFRUNNING`: `OLECONTF` = 16;
public const val `OLECONTF_ONLYUSER`: `OLECONTF` = 8;
public const val `OLECONTF_OTHERS`: `OLECONTF` = 4;
public typealias `OLECREATE` = UInt;
public const val `OLECREATE_LEAVERUNNING`: `OLECREATE` = 1u;
public const val `OLECREATE_ZERO`: `OLECREATE` = 0u;
public typealias `OLEDCFLAGS` = Int;
public const val `OLEDC_NODRAW`: `OLEDCFLAGS` = 1;
public const val `OLEDC_OFFSCREEN`: `OLEDCFLAGS` = 4;
public const val `OLEDC_PAINTBKGND`: `OLEDCFLAGS` = 2;
public typealias `OLEGETMONIKER` = Int;
public const val `OLEGETMONIKER_FORCEASSIGN`: `OLEGETMONIKER` = 2;
public const val `OLEGETMONIKER_ONLYIFTHERE`: `OLEGETMONIKER` = 1;
public const val `OLEGETMONIKER_TEMPFORUSER`: `OLEGETMONIKER` = 4;
public const val `OLEGETMONIKER_UNASSIGN`: `OLEGETMONIKER` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEINPLACEFRAMEINFO` (
    public var `cb`: UInt,
    public var `fMDIApp`: `windows_sys`.`core`.`BOOL`,
    public var `hwndFrame`: `super`.`super`.`Foundation`.`HWND`,
    public var `haccel`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`,
    public var `cAccelEntries`: UInt,
)
// UNSUPPORTED Rust 1576:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OLEINPLACEFRAMEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEIVERB` = Int;
public const val `OLEIVERB_DISCARDUNDOSTATE`: `OLEIVERB` = -6;
public const val `OLEIVERB_HIDE`: `OLEIVERB` = -3;
public const val `OLEIVERB_INPLACEACTIVATE`: `OLEIVERB` = -5;
public const val `OLEIVERB_OPEN`: `OLEIVERB` = -2;
public const val `OLEIVERB_PRIMARY`: `OLEIVERB` = 0;
public const val `OLEIVERB_PROPERTIES`: Int = -7;
public const val `OLEIVERB_SHOW`: `OLEIVERB` = -1;
public const val `OLEIVERB_UIACTIVATE`: `OLEIVERB` = -4;
public typealias `OLELINKBIND` = Int;
public const val `OLELINKBIND_EVENIFCLASSDIFF`: `OLELINKBIND` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEMENUGROUPWIDTHS` (
    public var `width`: IntArray,
)
// UNSUPPORTED Rust 1598:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLEMENUGROUPWIDTHS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEMISC` = Int;
public const val `OLEMISC_ACTIVATEWHENVISIBLE`: `OLEMISC` = 256;
public const val `OLEMISC_ACTSLIKEBUTTON`: `OLEMISC` = 4096;
public const val `OLEMISC_ACTSLIKELABEL`: `OLEMISC` = 8192;
public const val `OLEMISC_ALIGNABLE`: `OLEMISC` = 32768;
public const val `OLEMISC_ALWAYSRUN`: `OLEMISC` = 2048;
public const val `OLEMISC_CANLINKBYOLE1`: `OLEMISC` = 32;
public const val `OLEMISC_CANTLINKINSIDE`: `OLEMISC` = 16;
public const val `OLEMISC_IGNOREACTIVATEWHENVISIBLE`: `OLEMISC` = 524288;
public const val `OLEMISC_IMEMODE`: `OLEMISC` = 262144;
public const val `OLEMISC_INSERTNOTREPLACE`: `OLEMISC` = 4;
public const val `OLEMISC_INSIDEOUT`: `OLEMISC` = 128;
public const val `OLEMISC_INVISIBLEATRUNTIME`: `OLEMISC` = 1024;
public const val `OLEMISC_ISLINKOBJECT`: `OLEMISC` = 64;
public const val `OLEMISC_NOUIACTIVATE`: `OLEMISC` = 16384;
public const val `OLEMISC_ONLYICONIC`: `OLEMISC` = 2;
public const val `OLEMISC_RECOMPOSEONRESIZE`: `OLEMISC` = 1;
public const val `OLEMISC_RENDERINGISDEVICEINDEPENDENT`: `OLEMISC` = 512;
public const val `OLEMISC_SETCLIENTSITEFIRST`: `OLEMISC` = 131072;
public const val `OLEMISC_SIMPLEFRAME`: `OLEMISC` = 65536;
public const val `OLEMISC_STATIC`: `OLEMISC` = 8;
public const val `OLEMISC_SUPPORTSMULTILEVELUNDO`: `OLEMISC` = 2097152;
public const val `OLEMISC_WANTSTOMENUMERGE`: `OLEMISC` = 1048576;
public typealias `OLERENDER` = Int;
public const val `OLERENDER_ASIS`: `OLERENDER` = 3;
public const val `OLERENDER_DRAW`: `OLERENDER` = 1;
public const val `OLERENDER_FORMAT`: `OLERENDER` = 2;
public const val `OLERENDER_NONE`: `OLERENDER` = 0;
// UNSUPPORTED Rust 1631:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OLESTDDELIM: windows_sys::core::PCWSTR = windows_sys::core::w!("\\");

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `OLESTREAMQUERYCONVERTOLELINKCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `OLESTREAM_CONVERSION_DEFAULT`: Int = 0;
public const val `OLESTREAM_CONVERSION_DISABLEOLELINK`: Int = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Media")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIBUSYA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `BUSY_DIALOG_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `hTask`: `super`.`super`.`Media`.`HTASK`,
    public var `lphWndDialog`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?,
)
// UNSUPPORTED Rust 1651:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Media")]
// impl Default for OLEUIBUSYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Media")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIBUSYW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `BUSY_DIALOG_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCWSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `hTask`: `super`.`super`.`Media`.`HTASK`,
    public var `lphWndDialog`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?,
)
// UNSUPPORTED Rust 1673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Media")]
// impl Default for OLEUIBUSYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUICHANGEICONA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `CHANGE_ICON_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `szIconExe`: ByteArray,
    public var `cchIconExe`: Int,
)
// UNSUPPORTED Rust 1696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLEUICHANGEICONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUICHANGEICONW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `CHANGE_ICON_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCWSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `szIconExe`: UShortArray,
    public var `cchIconExe`: Int,
)
// UNSUPPORTED Rust 1718:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLEUICHANGEICONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUICHANGESOURCEA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `CHANGE_SOURCE_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`Dialogs`.`OPENFILENAMEA`>?,
    public var `dwReserved1`: UIntArray,
    public var `lpOleUILinkContainer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwLink`: UInt,
    public var `lpszDisplayName`: `windows_sys`.`core`.`PSTR`,
    public var `nFileLength`: UInt,
    public var `lpszFrom`: `windows_sys`.`core`.`PSTR`,
    public var `lpszTo`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// impl Default for OLEUICHANGESOURCEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUICHANGESOURCEW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `CHANGE_SOURCE_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCWSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`Dialogs`.`OPENFILENAMEW`>?,
    public var `dwReserved1`: UIntArray,
    public var `lpOleUILinkContainer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwLink`: UInt,
    public var `lpszDisplayName`: `windows_sys`.`core`.`PWSTR`,
    public var `nFileLength`: UInt,
    public var `lpszFrom`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszTo`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1773:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// impl Default for OLEUICHANGESOURCEW {
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
public class `OLEUICONVERTA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `UI_CONVERT_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `clsidConvertDefault`: `windows_sys`.`core`.`GUID`,
    public var `clsidActivateDefault`: `windows_sys`.`core`.`GUID`,
    public var `clsidNew`: `windows_sys`.`core`.`GUID`,
    public var `dvAspect`: UInt,
    public var `wFormat`: UShort,
    public var `fIsLinkedObject`: `windows_sys`.`core`.`BOOL`,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
    public var `lpszUserType`: `windows_sys`.`core`.`PSTR`,
    public var `fObjectsIconChanged`: `windows_sys`.`core`.`BOOL`,
    public var `lpszDefLabel`: `windows_sys`.`core`.`PSTR`,
    public var `cClsidExclude`: UInt,
    public var `lpClsidExclude`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 1805:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLEUICONVERTA {
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
public class `OLEUICONVERTW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `UI_CONVERT_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCWSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `clsidConvertDefault`: `windows_sys`.`core`.`GUID`,
    public var `clsidActivateDefault`: `windows_sys`.`core`.`GUID`,
    public var `clsidNew`: `windows_sys`.`core`.`GUID`,
    public var `dvAspect`: UInt,
    public var `wFormat`: UShort,
    public var `fIsLinkedObject`: `windows_sys`.`core`.`BOOL`,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
    public var `lpszUserType`: `windows_sys`.`core`.`PWSTR`,
    public var `fObjectsIconChanged`: `windows_sys`.`core`.`BOOL`,
    public var `lpszDefLabel`: `windows_sys`.`core`.`PWSTR`,
    public var `cClsidExclude`: UInt,
    public var `lpClsidExclude`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 1836:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLEUICONVERTW {
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
public class `OLEUIEDITLINKSA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `EDIT_LINKS_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `lpOleUILinkContainer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1855:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLEUIEDITLINKSA {
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
public class `OLEUIEDITLINKSW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `EDIT_LINKS_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCWSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `lpOleUILinkContainer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OLEUIEDITLINKSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIGNRLPROPSA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `dwReserved1`: UIntArray,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReserved2`: UIntArray,
    public var `lpOP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSA`>?,
)
// UNSUPPORTED Rust 1891:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIGNRLPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIGNRLPROPSW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `dwReserved1`: UIntArray,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReserved2`: UIntArray,
    public var `lpOP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSW`>?,
)
// UNSUPPORTED Rust 1909:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIGNRLPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIINSERTOBJECTA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `INSERT_OBJECT_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `lpszFile`: `windows_sys`.`core`.`PSTR`,
    public var `cchFile`: UInt,
    public var `cClsidExclude`: UInt,
    public var `lpClsidExclude`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `iid`: `windows_sys`.`core`.`GUID`,
    public var `oleRender`: UInt,
    public var `lpFormatEtc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?,
    public var `lpIOleClientSite`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpIStorage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ppvObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `sc`: Int,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
)
// UNSUPPORTED Rust 1942:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OLEUIINSERTOBJECTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIINSERTOBJECTW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `INSERT_OBJECT_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCWSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `clsid`: `windows_sys`.`core`.`GUID`,
    public var `lpszFile`: `windows_sys`.`core`.`PWSTR`,
    public var `cchFile`: UInt,
    public var `cClsidExclude`: UInt,
    public var `lpClsidExclude`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `iid`: `windows_sys`.`core`.`GUID`,
    public var `oleRender`: UInt,
    public var `lpFormatEtc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`FORMATETC`>?,
    public var `lpIOleClientSite`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpIStorage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ppvObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `sc`: Int,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
)
// UNSUPPORTED Rust 1975:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OLEUIINSERTOBJECTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUILINKPROPSA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `dwReserved1`: UIntArray,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReserved2`: UIntArray,
    public var `lpOP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSA`>?,
)
// UNSUPPORTED Rust 1993:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUILINKPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUILINKPROPSW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: UInt,
    public var `dwReserved1`: UIntArray,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReserved2`: UIntArray,
    public var `lpOP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSW`>?,
)
// UNSUPPORTED Rust 2011:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUILINKPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIOBJECTPROPSA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `OBJECT_PROPERTIES_FLAGS`,
    public var `lpPS`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`PROPSHEETHEADERA_V2`>?,
    public var `dwObject`: UInt,
    public var `lpObjInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwLink`: UInt,
    public var `lpLinkInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpGP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIGNRLPROPSA`>?,
    public var `lpVP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIVIEWPROPSA`>?,
    public var `lpLP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUILINKPROPSA`>?,
)
// UNSUPPORTED Rust 2032:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIOBJECTPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIOBJECTPROPSW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `OBJECT_PROPERTIES_FLAGS`,
    public var `lpPS`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`PROPSHEETHEADERW_V2`>?,
    public var `dwObject`: UInt,
    public var `lpObjInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwLink`: UInt,
    public var `lpLinkInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpGP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIGNRLPROPSW`>?,
    public var `lpVP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIVIEWPROPSW`>?,
    public var `lpLP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUILINKPROPSW`>?,
)
// UNSUPPORTED Rust 2053:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIOBJECTPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIPASTEENTRYA` (
    public var `fmtetc`: `super`.`Com`.`FORMATETC`,
    public var `lpstrFormatName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrResultText`: `windows_sys`.`core`.`PCSTR`,
    public var `dwFlags`: UInt,
    public var `dwScratchSpace`: UInt,
)
// UNSUPPORTED Rust 2069:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTEENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIPASTEENTRYW` (
    public var `fmtetc`: `super`.`Com`.`FORMATETC`,
    public var `lpstrFormatName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrResultText`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwFlags`: UInt,
    public var `dwScratchSpace`: UInt,
)
// UNSUPPORTED Rust 2085:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTEENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEUIPASTEFLAG` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIPASTESPECIALA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `PASTE_SPECIAL_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `lpSrcDataObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `arrPasteEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIPASTEENTRYA`>?,
    public var `cPasteEntries`: Int,
    public var `arrLinkTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cLinkTypes`: Int,
    public var `cClsidExclude`: UInt,
    public var `lpClsidExclude`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `nSelectedIndex`: Int,
    public var `fLink`: `windows_sys`.`core`.`BOOL`,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
    public var `sizel`: `super`.`super`.`Foundation`.`SIZE`,
)
// UNSUPPORTED Rust 2117:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTESPECIALA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIPASTESPECIALW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `PASTE_SPECIAL_FLAGS`,
    public var `hWndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszTemplate`: `windows_sys`.`core`.`PCWSTR`,
    public var `hResource`: `super`.`super`.`Foundation`.`HRSRC`,
    public var `lpSrcDataObj`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `arrPasteEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIPASTEENTRYW`>?,
    public var `cPasteEntries`: Int,
    public var `arrLinkTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cLinkTypes`: Int,
    public var `cClsidExclude`: UInt,
    public var `lpClsidExclude`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `nSelectedIndex`: Int,
    public var `fLink`: `windows_sys`.`core`.`BOOL`,
    public var `hMetaPict`: `super`.`super`.`Foundation`.`HGLOBAL`,
    public var `sizel`: `super`.`super`.`Foundation`.`SIZE`,
)
// UNSUPPORTED Rust 2148:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTESPECIALW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OLEUIPASTE_ENABLEICON`: `OLEUIPASTEFLAG` = 2048;
public const val `OLEUIPASTE_LINKANYTYPE`: `OLEUIPASTEFLAG` = 1024;
public const val `OLEUIPASTE_LINKTYPE1`: `OLEUIPASTEFLAG` = 1;
public const val `OLEUIPASTE_LINKTYPE2`: `OLEUIPASTEFLAG` = 2;
public const val `OLEUIPASTE_LINKTYPE3`: `OLEUIPASTEFLAG` = 4;
public const val `OLEUIPASTE_LINKTYPE4`: `OLEUIPASTEFLAG` = 8;
public const val `OLEUIPASTE_LINKTYPE5`: `OLEUIPASTEFLAG` = 16;
public const val `OLEUIPASTE_LINKTYPE6`: `OLEUIPASTEFLAG` = 32;
public const val `OLEUIPASTE_LINKTYPE7`: `OLEUIPASTEFLAG` = 64;
public const val `OLEUIPASTE_LINKTYPE8`: `OLEUIPASTEFLAG` = 128;
public const val `OLEUIPASTE_PASTE`: `OLEUIPASTEFLAG` = 512;
public const val `OLEUIPASTE_PASTEONLY`: `OLEUIPASTEFLAG` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIVIEWPROPSA` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `VIEW_OBJECT_PROPERTIES_FLAGS`,
    public var `dwReserved1`: UIntArray,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReserved2`: UIntArray,
    public var `lpOP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSA`>?,
    public var `nScaleMin`: Int,
    public var `nScaleMax`: Int,
)
// UNSUPPORTED Rust 2180:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIVIEWPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEUIVIEWPROPSW` (
    public var `cbStruct`: UInt,
    public var `dwFlags`: `VIEW_OBJECT_PROPERTIES_FLAGS`,
    public var `dwReserved1`: UIntArray,
    public var `lpfnHook`: `LPFNOLEUIHOOK`,
    public var `lCustData`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwReserved2`: UIntArray,
    public var `lpOP`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OLEUIOBJECTPROPSW`>?,
    public var `nScaleMin`: Int,
    public var `nScaleMax`: Int,
)
// UNSUPPORTED Rust 2200:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIVIEWPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OLEUI_BZERR_HTASKINVALID`: UInt = 116u;
public const val `OLEUI_BZ_CALLUNBLOCKED`: UInt = 119u;
public const val `OLEUI_BZ_RETRYSELECTED`: UInt = 118u;
public const val `OLEUI_BZ_SWITCHTOSELECTED`: UInt = 117u;
public const val `OLEUI_CANCEL`: UInt = 2u;
public const val `OLEUI_CIERR_MUSTHAVECLSID`: UInt = 116u;
public const val `OLEUI_CIERR_MUSTHAVECURRENTMETAFILE`: UInt = 117u;
public const val `OLEUI_CIERR_SZICONEXEINVALID`: UInt = 118u;
public const val `OLEUI_CSERR_FROMNOTNULL`: UInt = 118u;
public const val `OLEUI_CSERR_LINKCNTRINVALID`: UInt = 117u;
public const val `OLEUI_CSERR_LINKCNTRNULL`: UInt = 116u;
public const val `OLEUI_CSERR_SOURCEINVALID`: UInt = 121u;
public const val `OLEUI_CSERR_SOURCENULL`: UInt = 120u;
public const val `OLEUI_CSERR_SOURCEPARSEERROR`: UInt = 122u;
public const val `OLEUI_CSERR_SOURCEPARSERROR`: UInt = 122u;
public const val `OLEUI_CSERR_TONOTNULL`: UInt = 119u;
public const val `OLEUI_CTERR_CBFORMATINVALID`: UInt = 119u;
public const val `OLEUI_CTERR_CLASSIDINVALID`: UInt = 117u;
public const val `OLEUI_CTERR_DVASPECTINVALID`: UInt = 118u;
public const val `OLEUI_CTERR_HMETAPICTINVALID`: UInt = 120u;
public const val `OLEUI_CTERR_STRINGINVALID`: UInt = 121u;
public const val `OLEUI_ELERR_LINKCNTRINVALID`: UInt = 117u;
public const val `OLEUI_ELERR_LINKCNTRNULL`: UInt = 116u;
public const val `OLEUI_ERR_CBSTRUCTINCORRECT`: UInt = 103u;
public const val `OLEUI_ERR_DIALOGFAILURE`: UInt = 112u;
public const val `OLEUI_ERR_FINDTEMPLATEFAILURE`: UInt = 110u;
public const val `OLEUI_ERR_GLOBALMEMALLOC`: UInt = 114u;
public const val `OLEUI_ERR_HINSTANCEINVALID`: UInt = 107u;
public const val `OLEUI_ERR_HRESOURCEINVALID`: UInt = 109u;
public const val `OLEUI_ERR_HWNDOWNERINVALID`: UInt = 104u;
public const val `OLEUI_ERR_LOADSTRING`: UInt = 115u;
public const val `OLEUI_ERR_LOADTEMPLATEFAILURE`: UInt = 111u;
public const val `OLEUI_ERR_LOCALMEMALLOC`: UInt = 113u;
public const val `OLEUI_ERR_LPFNHOOKINVALID`: UInt = 106u;
public const val `OLEUI_ERR_LPSZCAPTIONINVALID`: UInt = 105u;
public const val `OLEUI_ERR_LPSZTEMPLATEINVALID`: UInt = 108u;
public const val `OLEUI_ERR_OLEMEMALLOC`: UInt = 100u;
public const val `OLEUI_ERR_STANDARDMAX`: UInt = 116u;
public const val `OLEUI_ERR_STANDARDMIN`: UInt = 100u;
public const val `OLEUI_ERR_STRUCTUREINVALID`: UInt = 102u;
public const val `OLEUI_ERR_STRUCTURENULL`: UInt = 101u;
public const val `OLEUI_FALSE`: UInt = 0u;
public const val `OLEUI_GPERR_CBFORMATINVALID`: UInt = 130u;
public const val `OLEUI_GPERR_CLASSIDINVALID`: UInt = 128u;
public const val `OLEUI_GPERR_LPCLSIDEXCLUDEINVALID`: UInt = 129u;
public const val `OLEUI_GPERR_STRINGINVALID`: UInt = 127u;
public const val `OLEUI_IOERR_ARRLINKTYPESINVALID`: UInt = 118u;
public const val `OLEUI_IOERR_ARRPASTEENTRIESINVALID`: UInt = 117u;
public const val `OLEUI_IOERR_CCHFILEINVALID`: UInt = 125u;
public const val `OLEUI_IOERR_HICONINVALID`: UInt = 118u;
public const val `OLEUI_IOERR_LPCLSIDEXCLUDEINVALID`: UInt = 124u;
public const val `OLEUI_IOERR_LPFORMATETCINVALID`: UInt = 119u;
public const val `OLEUI_IOERR_LPIOLECLIENTSITEINVALID`: UInt = 121u;
public const val `OLEUI_IOERR_LPISTORAGEINVALID`: UInt = 122u;
public const val `OLEUI_IOERR_LPSZFILEINVALID`: UInt = 116u;
public const val `OLEUI_IOERR_LPSZLABELINVALID`: UInt = 117u;
public const val `OLEUI_IOERR_PPVOBJINVALID`: UInt = 120u;
public const val `OLEUI_IOERR_SCODEHASERROR`: UInt = 123u;
public const val `OLEUI_IOERR_SRCDATAOBJECTINVALID`: UInt = 116u;
public const val `OLEUI_LPERR_LINKCNTRINVALID`: UInt = 134u;
public const val `OLEUI_LPERR_LINKCNTRNULL`: UInt = 133u;
public const val `OLEUI_OK`: UInt = 1u;
public const val `OLEUI_OPERR_DLGPROCNOTNULL`: UInt = 125u;
public const val `OLEUI_OPERR_INVALIDPAGES`: UInt = 123u;
public const val `OLEUI_OPERR_LINKINFOINVALID`: UInt = 137u;
public const val `OLEUI_OPERR_LPARAMNOTZERO`: UInt = 126u;
public const val `OLEUI_OPERR_NOTSUPPORTED`: UInt = 124u;
public const val `OLEUI_OPERR_OBJINFOINVALID`: UInt = 136u;
public const val `OLEUI_OPERR_PAGESINCORRECT`: UInt = 122u;
public const val `OLEUI_OPERR_PROPERTYSHEET`: UInt = 135u;
public const val `OLEUI_OPERR_PROPSHEETINVALID`: UInt = 119u;
public const val `OLEUI_OPERR_PROPSHEETNULL`: UInt = 118u;
public const val `OLEUI_OPERR_PROPSINVALID`: UInt = 121u;
public const val `OLEUI_OPERR_SUBPROPINVALID`: UInt = 117u;
public const val `OLEUI_OPERR_SUBPROPNULL`: UInt = 116u;
public const val `OLEUI_OPERR_SUPPROP`: UInt = 120u;
public const val `OLEUI_PSERR_CLIPBOARDCHANGED`: UInt = 119u;
public const val `OLEUI_PSERR_GETCLIPBOARDFAILED`: UInt = 120u;
public const val `OLEUI_QUERY_GETCLASSID`: UInt = 65280u;
public const val `OLEUI_QUERY_LINKBROKEN`: UInt = 65281u;
public const val `OLEUI_SUCCESS`: UInt = 1u;
public const val `OLEUI_VPERR_DVASPECTINVALID`: UInt = 132u;
public const val `OLEUI_VPERR_METAPICTINVALID`: UInt = 131u;
public typealias `OLEUPDATE` = Int;
public const val `OLEUPDATE_ALWAYS`: `OLEUPDATE` = 1;
public const val `OLEUPDATE_ONCALL`: `OLEUPDATE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OLEVERB` (
    public var `lVerb`: `OLEIVERB`,
    public var `lpszVerbName`: `windows_sys`.`core`.`PWSTR`,
    public var `fuFlags`: `super`.`super`.`UI`.`WindowsAndMessaging`.`MENU_ITEM_FLAGS`,
    public var `grfAttribs`: UInt,
)
// UNSUPPORTED Rust 2301:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OLEVERB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEVERBATTRIB` = Int;
public const val `OLEVERBATTRIB_NEVERDIRTIES`: `OLEVERBATTRIB` = 1;
public const val `OLEVERBATTRIB_ONCONTAINERMENU`: `OLEVERBATTRIB` = 2;
public const val `OLEVERB_PRIMARY`: UInt = 0u;
public typealias `OLEWHICHMK` = Int;
public const val `OLEWHICHMK_CONTAINER`: `OLEWHICHMK` = 1;
public const val `OLEWHICHMK_OBJFULL`: `OLEWHICHMK` = 3;
public const val `OLEWHICHMK_OBJREL`: `OLEWHICHMK` = 2;
public typealias `OLE_HANDLE` = UInt;
public typealias `OLE_TRISTATE` = Int;
public const val `OPF_DISABLECONVERT`: `OBJECT_PROPERTIES_FLAGS` = 8u;
public const val `OPF_NOFILLDEFAULT`: `OBJECT_PROPERTIES_FLAGS` = 2u;
public const val `OPF_OBJECTISLINK`: `OBJECT_PROPERTIES_FLAGS` = 1u;
public const val `OPF_SHOWHELP`: `OBJECT_PROPERTIES_FLAGS` = 4u;
public const val `OT_EMBEDDED`: Int = 2;
public const val `OT_LINK`: Int = 1;
public const val `OT_STATIC`: Int = 3;
public typealias `PAGEACTION_UI` = Int;
public const val `PAGEACTION_UI_DEFAULT`: `PAGEACTION_UI` = 0;
public const val `PAGEACTION_UI_MODAL`: `PAGEACTION_UI` = 1;
public const val `PAGEACTION_UI_MODELESS`: `PAGEACTION_UI` = 2;
public const val `PAGEACTION_UI_SILENT`: `PAGEACTION_UI` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PAGERANGE` (
    public var `nFromPage`: Int,
    public var `nToPage`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PAGESET` (
    public var `cbStruct`: UInt,
    public var `fOddPages`: `windows_sys`.`core`.`BOOL`,
    public var `fEvenPages`: `windows_sys`.`core`.`BOOL`,
    public var `cPageRange`: UInt,
    public var `rgPages`: Array<`PAGERANGE`>,
)
// UNSUPPORTED Rust 2344:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PAGESET {
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
public class `PARAMDATA` (
    public var `szName`: `windows_sys`.`core`.`PWSTR`,
    public var `vt`: `super`.`Variant`.`VARENUM`,
)
// UNSUPPORTED Rust 2356:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PARAMDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PARAMDESC` (
    public var `pparamdescex`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PARAMDESCEX`>?,
    public var `wParamFlags`: `PARAMFLAGS`,
)
// UNSUPPORTED Rust 2369:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for PARAMDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PARAMDESCEX` (
    public var `cBytes`: UInt,
    public var `varDefaultValue`: `super`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 2382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for PARAMDESCEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PARAMFLAGS` = UShort;
public const val `PARAMFLAG_FHASCUSTDATA`: `PARAMFLAGS` = 64u;
public const val `PARAMFLAG_FHASDEFAULT`: `PARAMFLAGS` = 32u;
public const val `PARAMFLAG_FIN`: `PARAMFLAGS` = 1u;
public const val `PARAMFLAG_FLCID`: `PARAMFLAGS` = 4u;
public const val `PARAMFLAG_FOPT`: `PARAMFLAGS` = 16u;
public const val `PARAMFLAG_FOUT`: `PARAMFLAGS` = 2u;
public const val `PARAMFLAG_FRETVAL`: `PARAMFLAGS` = 8u;
public const val `PARAMFLAG_NONE`: `PARAMFLAGS` = 0u;
public typealias `PASTE_SPECIAL_FLAGS` = UInt;
public const val `PERPROP_E_FIRST`: Int = -2147220992;
public const val `PERPROP_E_LAST`: Int = -2147220977;
public const val `PERPROP_E_NOPAGEAVAILABLE`: Int = -2147220992;
public const val `PERPROP_S_FIRST`: Int = 262656;
public const val `PERPROP_S_LAST`: Int = 262671;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PICTDESC` (
    public var `cbSizeofstruct`: UInt,
    public var `picType`: UInt,
    public var `Anonymous`: `PICTDESC_0`,
)
// UNSUPPORTED Rust 2411:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2417:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PICTDESC_0 {
//     pub bmp: PICTDESC_0_0,
//     pub wmf: PICTDESC_0_1,
//     pub icon: PICTDESC_0_2,
//     pub emf: PICTDESC_0_3,
// }

// UNSUPPORTED Rust 2426:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PICTDESC_0_0` (
    public var `hbitmap`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hpal`: `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`,
)
// UNSUPPORTED Rust 2439:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PICTDESC_0_3` (
    public var `hemf`: `super`.`super`.`Graphics`.`Gdi`.`HENHMETAFILE`,
)
// UNSUPPORTED Rust 2451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PICTDESC_0_2` (
    public var `hicon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
)
// UNSUPPORTED Rust 2463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PICTDESC_0_1` (
    public var `hmeta`: `super`.`super`.`Graphics`.`Gdi`.`HMETAFILE`,
    public var `xExt`: Int,
    public var `yExt`: Int,
)
// UNSUPPORTED Rust 2477:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PICTUREATTRIBUTES` = Int;
public const val `PICTURE_SCALABLE`: `PICTUREATTRIBUTES` = 1;
public const val `PICTURE_TRANSPARENT`: `PICTUREATTRIBUTES` = 2;
public typealias `PICTYPE` = Short;
public const val `PICTYPE_BITMAP`: `PICTYPE` = 1;
public const val `PICTYPE_ENHMETAFILE`: `PICTYPE` = 4;
public const val `PICTYPE_ICON`: `PICTYPE` = 3;
public const val `PICTYPE_METAFILE`: `PICTYPE` = 2;
public const val `PICTYPE_NONE`: `PICTYPE` = 0;
public const val `PICTYPE_UNINITIALIZED`: `PICTYPE` = -1;
public typealias `POINTERINACTIVE` = Int;
public const val `POINTERINACTIVE_ACTIVATEONDRAG`: `POINTERINACTIVE` = 4;
public const val `POINTERINACTIVE_ACTIVATEONENTRY`: `POINTERINACTIVE` = 1;
public const val `POINTERINACTIVE_DEACTIVATEONLEAVE`: `POINTERINACTIVE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTF` (
    public var `x`: Float,
    public var `y`: Float,
)
public typealias `PRINTFLAG` = Int;
public const val `PRINTFLAG_DONTACTUALLYPRINT`: `PRINTFLAG` = 16;
public const val `PRINTFLAG_FORCEPROPERTIES`: `PRINTFLAG` = 32;
public const val `PRINTFLAG_MAYBOTHERUSER`: `PRINTFLAG` = 1;
public const val `PRINTFLAG_PRINTTOFILE`: `PRINTFLAG` = 64;
public const val `PRINTFLAG_PROMPTUSER`: `PRINTFLAG` = 2;
public const val `PRINTFLAG_RECOMPOSETODEVICE`: `PRINTFLAG` = 8;
public const val `PRINTFLAG_USERMAYCHANGEPRINTER`: `PRINTFLAG` = 4;
public typealias `PROPBAG2_TYPE` = Int;
public const val `PROPBAG2_TYPE_DATA`: `PROPBAG2_TYPE` = 1;
public const val `PROPBAG2_TYPE_MONIKER`: `PROPBAG2_TYPE` = 6;
public const val `PROPBAG2_TYPE_OBJECT`: `PROPBAG2_TYPE` = 3;
public const val `PROPBAG2_TYPE_STORAGE`: `PROPBAG2_TYPE` = 5;
public const val `PROPBAG2_TYPE_STREAM`: `PROPBAG2_TYPE` = 4;
public const val `PROPBAG2_TYPE_UNDEFINED`: `PROPBAG2_TYPE` = 0;
public const val `PROPBAG2_TYPE_URL`: `PROPBAG2_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPPAGEINFO` (
    public var `cb`: UInt,
    public var `pszTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `size`: `super`.`super`.`Foundation`.`SIZE`,
    public var `pszDocString`: `windows_sys`.`core`.`PWSTR`,
    public var `pszHelpFile`: `windows_sys`.`core`.`PWSTR`,
    public var `dwHelpContext`: UInt,
)
// UNSUPPORTED Rust 2529:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROPPAGEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PROPPAGESTATUS` = Int;
public const val `PROPPAGESTATUS_CLEAN`: `PROPPAGESTATUS` = 4;
public const val `PROPPAGESTATUS_DIRTY`: `PROPPAGESTATUS` = 1;
public const val `PROPPAGESTATUS_VALIDATE`: `PROPPAGESTATUS` = 2;
// UNSUPPORTED Rust 2538:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const PROP_HWND_CHGICONDLG: windows_sys::core::PCWSTR = windows_sys::core::w!("HWND_CIDLG");

public const val `PSF_CHECKDISPLAYASICON`: `PASTE_SPECIAL_FLAGS` = 8u;
public const val `PSF_DISABLEDISPLAYASICON`: `PASTE_SPECIAL_FLAGS` = 16u;
public const val `PSF_HIDECHANGEICON`: `PASTE_SPECIAL_FLAGS` = 32u;
public const val `PSF_NOREFRESHDATAOBJECT`: `PASTE_SPECIAL_FLAGS` = 128u;
public const val `PSF_SELECTPASTE`: `PASTE_SPECIAL_FLAGS` = 2u;
public const val `PSF_SELECTPASTELINK`: `PASTE_SPECIAL_FLAGS` = 4u;
public const val `PSF_SHOWHELP`: `PASTE_SPECIAL_FLAGS` = 1u;
public const val `PSF_STAYONCLIPBOARDCHANGE`: `PASTE_SPECIAL_FLAGS` = 64u;
public const val `PS_MAXLINKTYPES`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QACONTAINER` (
    public var `cbSize`: UInt,
    public var `pClientSite`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pAdviseSink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pPropertyNotifySink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pUnkEventSink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwAmbientFlags`: UInt,
    public var `colorFore`: UInt,
    public var `colorBack`: UInt,
    public var `pFont`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pUndoMgr`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwAppearance`: UInt,
    public var `lcid`: Int,
    public var `hpal`: `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`,
    public var `pBindHost`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pOleControlSite`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pServiceProvider`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2569:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
// impl Default for QACONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `QACONTAINERFLAGS` = Int;
public const val `QACONTAINER_AUTOCLIP`: `QACONTAINERFLAGS` = 32;
public const val `QACONTAINER_DISPLAYASDEFAULT`: `QACONTAINERFLAGS` = 8;
public const val `QACONTAINER_MESSAGEREFLECT`: `QACONTAINERFLAGS` = 64;
public const val `QACONTAINER_SHOWGRABHANDLES`: `QACONTAINERFLAGS` = 2;
public const val `QACONTAINER_SHOWHATCHING`: `QACONTAINERFLAGS` = 1;
public const val `QACONTAINER_SUPPORTSMNEMONICS`: `QACONTAINERFLAGS` = 128;
public const val `QACONTAINER_UIDEAD`: `QACONTAINERFLAGS` = 16;
public const val `QACONTAINER_USERMODE`: `QACONTAINERFLAGS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QACONTROL` (
    public var `cbSize`: UInt,
    public var `dwMiscStatus`: UInt,
    public var `dwViewStatus`: UInt,
    public var `dwEventCookie`: UInt,
    public var `dwPropNotifyCookie`: UInt,
    public var `dwPointerActivationPolicy`: UInt,
)
public typealias `READYSTATE` = Int;
public const val `READYSTATE_COMPLETE`: `READYSTATE` = 4;
public const val `READYSTATE_INTERACTIVE`: `READYSTATE` = 3;
public const val `READYSTATE_LOADED`: `READYSTATE` = 2;
public const val `READYSTATE_LOADING`: `READYSTATE` = 1;
public const val `READYSTATE_UNINITIALIZED`: `READYSTATE` = 0;
public typealias `REGKIND` = Int;
public const val `REGKIND_DEFAULT`: `REGKIND` = 0;
public const val `REGKIND_NONE`: `REGKIND` = 2;
public const val `REGKIND_REGISTER`: `REGKIND` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAFEARRAYUNION` (
    public var `sfType`: UInt,
    public var `u`: `SAFEARRAYUNION_0`,
)
// UNSUPPORTED Rust 2611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARRAYUNION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2617:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union SAFEARRAYUNION_0 {
//     pub BstrStr: SAFEARR_BSTR,
//     pub UnknownStr: SAFEARR_UNKNOWN,
//     pub DispatchStr: SAFEARR_DISPATCH,
//     pub VariantStr: SAFEARR_VARIANT,
//     pub RecordStr: SAFEARR_BRECORD,
//     pub HaveIidStr: SAFEARR_HAVEIID,
//     pub ByteStr: super::Com::BYTE_SIZEDARR,
//     pub WordStr: super::Com::WORD_SIZEDARR,
//     pub LongStr: super::Com::DWORD_SIZEDARR,
//     pub HyperStr: super::Com::HYPER_SIZEDARR,
// }

// UNSUPPORTED Rust 2632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARRAYUNION_0 {
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
public class `SAFEARR_BRECORD` (
    public var `Size`: UInt,
    public var `aRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`_wireBRECORD`>>?,
)
// UNSUPPORTED Rust 2644:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAFEARR_BRECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAFEARR_BSTR` (
    public var `Size`: UInt,
    public var `aBstr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`Com`.`FLAGGED_WORD_BLOB`>>?,
)
// UNSUPPORTED Rust 2656:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARR_BSTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAFEARR_DISPATCH` (
    public var `Size`: UInt,
    public var `apDispatch`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
)
// UNSUPPORTED Rust 2669:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARR_DISPATCH {
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
public class `SAFEARR_HAVEIID` (
    public var `Size`: UInt,
    public var `apUnknown`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `iid`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAFEARR_HAVEIID {
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
public class `SAFEARR_UNKNOWN` (
    public var `Size`: UInt,
    public var `apUnknown`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
)
// UNSUPPORTED Rust 2693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SAFEARR_UNKNOWN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SAFEARR_VARIANT` (
    public var `Size`: UInt,
    public var `aVariant`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`_wireVARIANT`>>?,
)
// UNSUPPORTED Rust 2705:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARR_VARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SELFREG_E_CLASS`: Int = -2147220991;
public const val `SELFREG_E_FIRST`: Int = -2147220992;
public const val `SELFREG_E_LAST`: Int = -2147220977;
public const val `SELFREG_E_TYPELIB`: Int = -2147220992;
public const val `SELFREG_S_FIRST`: Int = 262656;
public const val `SELFREG_S_LAST`: Int = 262671;
public const val `SF_BSTR`: `SF_TYPE` = 8;
public const val `SF_DISPATCH`: `SF_TYPE` = 9;
public const val `SF_ERROR`: `SF_TYPE` = 10;
public const val `SF_HAVEIID`: `SF_TYPE` = 32781;
public const val `SF_I1`: `SF_TYPE` = 16;
public const val `SF_I2`: `SF_TYPE` = 2;
public const val `SF_I4`: `SF_TYPE` = 3;
public const val `SF_I8`: `SF_TYPE` = 20;
public const val `SF_RECORD`: `SF_TYPE` = 36;
public typealias `SF_TYPE` = Int;
public const val `SF_UNKNOWN`: `SF_TYPE` = 13;
public const val `SF_VARIANT`: `SF_TYPE` = 12;
// UNSUPPORTED Rust 2729:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SID_GetCaller: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4717cc40_bcb9_11d0_9336_00a0c90dcaa9);

// UNSUPPORTED Rust 2730:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SID_ProvideRuntimeContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74a5040c_dd0c_48f0_ac85_194c3259180a);

// UNSUPPORTED Rust 2731:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SID_VariantConversion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1f101481_bccd_11d0_9336_00a0c90dcaa9);

public const val `STDOLE2_LCID`: UInt = 0u;
public const val `STDOLE2_MAJORVERNUM`: UInt = 2u;
public const val `STDOLE2_MINORVERNUM`: UInt = 0u;
public const val `STDOLE_LCID`: UInt = 0u;
public const val `STDOLE_MAJORVERNUM`: UInt = 1u;
public const val `STDOLE_MINORVERNUM`: UInt = 0u;
// UNSUPPORTED Rust 2738:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const STDOLE_TLB: windows_sys::core::PCSTR = windows_sys::core::s!("stdole2.tlb");

// UNSUPPORTED Rust 2739:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const STDTYPE_TLB: windows_sys::core::PCSTR = windows_sys::core::s!("stdole2.tlb");

// UNSUPPORTED Rust 2740:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_ADDCONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_ADDCONTROL");

// UNSUPPORTED Rust 2741:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_BROWSE: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_BROWSE");

// UNSUPPORTED Rust 2742:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_BROWSE_OFN: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_BROWSE_OFN");

// UNSUPPORTED Rust 2743:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_CHANGEICON: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CHANGEICON");

// UNSUPPORTED Rust 2744:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_CHANGESOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CHANGESOURCE");

// UNSUPPORTED Rust 2745:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_CLOSEBUSYDIALOG: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CLOSEBUSYDIALOG");

// UNSUPPORTED Rust 2746:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_CONVERT: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CONVERT");

// UNSUPPORTED Rust 2747:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_ENDDIALOG: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_ENDDIALOG");

// UNSUPPORTED Rust 2748:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SZOLEUI_MSG_HELP: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_HELP");

public const val `TIFLAGS_EXTENDDISPATCHONLY`: UInt = 1u;
public typealias `TYPEFLAGS` = Int;
public const val `TYPEFLAG_FAGGREGATABLE`: `TYPEFLAGS` = 1024;
public const val `TYPEFLAG_FAPPOBJECT`: `TYPEFLAGS` = 1;
public const val `TYPEFLAG_FCANCREATE`: `TYPEFLAGS` = 2;
public const val `TYPEFLAG_FCONTROL`: `TYPEFLAGS` = 32;
public const val `TYPEFLAG_FDISPATCHABLE`: `TYPEFLAGS` = 4096;
public const val `TYPEFLAG_FDUAL`: `TYPEFLAGS` = 64;
public const val `TYPEFLAG_FHIDDEN`: `TYPEFLAGS` = 16;
public const val `TYPEFLAG_FLICENSED`: `TYPEFLAGS` = 4;
public const val `TYPEFLAG_FNONEXTENSIBLE`: `TYPEFLAGS` = 128;
public const val `TYPEFLAG_FOLEAUTOMATION`: `TYPEFLAGS` = 256;
public const val `TYPEFLAG_FPREDECLID`: `TYPEFLAGS` = 8;
public const val `TYPEFLAG_FPROXY`: `TYPEFLAGS` = 16384;
public const val `TYPEFLAG_FREPLACEABLE`: `TYPEFLAGS` = 2048;
public const val `TYPEFLAG_FRESTRICTED`: `TYPEFLAGS` = 512;
public const val `TYPEFLAG_FREVERSEBIND`: `TYPEFLAGS` = 8192;
public typealias `UASFLAGS` = Int;
public const val `UAS_BLOCKED`: `UASFLAGS` = 1;
public const val `UAS_MASK`: `UASFLAGS` = 3;
public const val `UAS_NOPARENTENABLE`: `UASFLAGS` = 2;
public const val `UAS_NORMAL`: `UASFLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UDATE` (
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `wDayOfYear`: UShort,
)
public typealias `UI_CONVERT_FLAGS` = UInt;
public const val `UPDFCACHE_ALL`: `UPDFCACHE_FLAGS` = 2147483647u;
public const val `UPDFCACHE_ALLBUTNODATACACHE`: `UPDFCACHE_FLAGS` = 2147483646u;
public typealias `UPDFCACHE_FLAGS` = UInt;
public const val `UPDFCACHE_IFBLANK`: `UPDFCACHE_FLAGS` = 16u;
public const val `UPDFCACHE_IFBLANKORONSAVECACHE`: `UPDFCACHE_FLAGS` = 18u;
public const val `UPDFCACHE_NODATACACHE`: `UPDFCACHE_FLAGS` = 1u;
public const val `UPDFCACHE_NORMALCACHE`: `UPDFCACHE_FLAGS` = 8u;
public const val `UPDFCACHE_ONLYIFBLANK`: `UPDFCACHE_FLAGS` = 2147483648u;
public const val `UPDFCACHE_ONSAVECACHE`: `UPDFCACHE_FLAGS` = 2u;
public const val `UPDFCACHE_ONSTOPCACHE`: `UPDFCACHE_FLAGS` = 4u;
public typealias `USERCLASSTYPE` = Int;
public const val `USERCLASSTYPE_APPNAME`: `USERCLASSTYPE` = 3;
public const val `USERCLASSTYPE_FULL`: `USERCLASSTYPE` = 1;
public const val `USERCLASSTYPE_SHORT`: `USERCLASSTYPE` = 2;
public typealias `VARCMP` = UInt;
public const val `VARCMP_EQ`: `VARCMP` = 1u;
public const val `VARCMP_GT`: `VARCMP` = 2u;
public const val `VARCMP_LT`: `VARCMP` = 0u;
public const val `VARCMP_NULL`: `VARCMP` = 3u;
public typealias `VARFORMAT_FIRST_DAY` = Int;
public const val `VARFORMAT_FIRST_DAY_FRIDAY`: `VARFORMAT_FIRST_DAY` = 5;
public const val `VARFORMAT_FIRST_DAY_MONDAY`: `VARFORMAT_FIRST_DAY` = 1;
public const val `VARFORMAT_FIRST_DAY_SATURDAY`: `VARFORMAT_FIRST_DAY` = 6;
public const val `VARFORMAT_FIRST_DAY_SUNDAY`: `VARFORMAT_FIRST_DAY` = 7;
public const val `VARFORMAT_FIRST_DAY_SYSTEMDEFAULT`: `VARFORMAT_FIRST_DAY` = 0;
public const val `VARFORMAT_FIRST_DAY_THURSDAY`: `VARFORMAT_FIRST_DAY` = 4;
public const val `VARFORMAT_FIRST_DAY_TUESDAY`: `VARFORMAT_FIRST_DAY` = 2;
public const val `VARFORMAT_FIRST_DAY_WEDNESDAY`: `VARFORMAT_FIRST_DAY` = 3;
public typealias `VARFORMAT_FIRST_WEEK` = Int;
public const val `VARFORMAT_FIRST_WEEK_CONTAINS_JANUARY_FIRST`: `VARFORMAT_FIRST_WEEK` = 1;
public const val `VARFORMAT_FIRST_WEEK_HAS_SEVEN_DAYS`: `VARFORMAT_FIRST_WEEK` = 3;
public const val `VARFORMAT_FIRST_WEEK_LARGER_HALF_IN_CURRENT_YEAR`: `VARFORMAT_FIRST_WEEK` = 2;
public const val `VARFORMAT_FIRST_WEEK_SYSTEMDEFAULT`: `VARFORMAT_FIRST_WEEK` = 0;
public typealias `VARFORMAT_GROUP` = Int;
public const val `VARFORMAT_GROUP_NOTTHOUSANDS`: `VARFORMAT_GROUP` = 0;
public const val `VARFORMAT_GROUP_SYSTEMDEFAULT`: `VARFORMAT_GROUP` = -2;
public const val `VARFORMAT_GROUP_THOUSANDS`: `VARFORMAT_GROUP` = -1;
public typealias `VARFORMAT_LEADING_DIGIT` = Int;
public const val `VARFORMAT_LEADING_DIGIT_INCLUDED`: `VARFORMAT_LEADING_DIGIT` = -1;
public const val `VARFORMAT_LEADING_DIGIT_NOTINCLUDED`: `VARFORMAT_LEADING_DIGIT` = 0;
public const val `VARFORMAT_LEADING_DIGIT_SYSTEMDEFAULT`: `VARFORMAT_LEADING_DIGIT` = -2;
public typealias `VARFORMAT_NAMED_FORMAT` = Int;
public const val `VARFORMAT_NAMED_FORMAT_GENERALDATE`: `VARFORMAT_NAMED_FORMAT` = 0;
public const val `VARFORMAT_NAMED_FORMAT_LONGDATE`: `VARFORMAT_NAMED_FORMAT` = 1;
public const val `VARFORMAT_NAMED_FORMAT_LONGTIME`: `VARFORMAT_NAMED_FORMAT` = 3;
public const val `VARFORMAT_NAMED_FORMAT_SHORTDATE`: `VARFORMAT_NAMED_FORMAT` = 2;
public const val `VARFORMAT_NAMED_FORMAT_SHORTTIME`: `VARFORMAT_NAMED_FORMAT` = 4;
public typealias `VARFORMAT_PARENTHESES` = Int;
public const val `VARFORMAT_PARENTHESES_NOTUSED`: `VARFORMAT_PARENTHESES` = 0;
public const val `VARFORMAT_PARENTHESES_SYSTEMDEFAULT`: `VARFORMAT_PARENTHESES` = -2;
public const val `VARFORMAT_PARENTHESES_USED`: `VARFORMAT_PARENTHESES` = -1;
public const val `VAR_CALENDAR_GREGORIAN`: UInt = 256u;
public const val `VAR_CALENDAR_HIJRI`: UInt = 8u;
public const val `VAR_CALENDAR_THAI`: UInt = 128u;
public const val `VAR_DATEVALUEONLY`: UInt = 2u;
public const val `VAR_FORMAT_NOSUBSTITUTE`: UInt = 32u;
public const val `VAR_FOURDIGITYEARS`: UInt = 64u;
public const val `VAR_LOCALBOOL`: UInt = 16u;
public const val `VAR_TIMEVALUEONLY`: UInt = 1u;
public const val `VAR_VALIDDATE`: UInt = 4u;
public typealias `VIEWSTATUS` = Int;
public const val `VIEWSTATUS_3DSURFACE`: `VIEWSTATUS` = 32;
public const val `VIEWSTATUS_DVASPECTOPAQUE`: `VIEWSTATUS` = 4;
public const val `VIEWSTATUS_DVASPECTTRANSPARENT`: `VIEWSTATUS` = 8;
public const val `VIEWSTATUS_OPAQUE`: `VIEWSTATUS` = 1;
public const val `VIEWSTATUS_SOLIDBKGND`: `VIEWSTATUS` = 2;
public const val `VIEWSTATUS_SURFACE`: `VIEWSTATUS` = 16;
public typealias `VIEW_OBJECT_PROPERTIES_FLAGS` = UInt;
public const val `VPF_DISABLERELATIVE`: `VIEW_OBJECT_PROPERTIES_FLAGS` = 2u;
public const val `VPF_DISABLESCALE`: `VIEW_OBJECT_PROPERTIES_FLAGS` = 4u;
public const val `VPF_SELECTRELATIVE`: `VIEW_OBJECT_PROPERTIES_FLAGS` = 1u;
public const val `VTDATEGRE_MAX`: UInt = 2958465u;
public const val `VTDATEGRE_MIN`: Int = -657434;
public const val `VT_BLOB_PROPSET`: UInt = 75u;
public const val `VT_STORED_PROPSET`: UInt = 74u;
public const val `VT_STREAMED_PROPSET`: UInt = 73u;
public const val `VT_VERBOSE_ENUM`: UInt = 76u;
public const val `WIN32`: UInt = 100u;
public typealias `WPCSETTING` = Int;
public const val `WPCSETTING_FILEDOWNLOAD_BLOCKED`: `WPCSETTING` = 2;
public const val `WPCSETTING_LOGGING_ENABLED`: `WPCSETTING` = 1;
public typealias `XFORMCOORDS` = Int;
public const val `XFORMCOORDS_CONTAINERTOHIMETRIC`: `XFORMCOORDS` = 8;
public const val `XFORMCOORDS_EVENTCOMPAT`: `XFORMCOORDS` = 16;
public const val `XFORMCOORDS_HIMETRICTOCONTAINER`: `XFORMCOORDS` = 4;
public const val `XFORMCOORDS_POSITION`: `XFORMCOORDS` = 1;
public const val `XFORMCOORDS_SIZE`: `XFORMCOORDS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_wireBRECORD` (
    public var `fFlags`: UInt,
    public var `clSize`: UInt,
    public var `pRecInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 2873:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _wireBRECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_wireSAFEARRAY` (
    public var `cDims`: UShort,
    public var `fFeatures`: UShort,
    public var `cbElements`: UInt,
    public var `cLocks`: UInt,
    public var `uArrayStructs`: `SAFEARRAYUNION`,
    public var `rgsabound`: Array<`super`.`Com`.`SAFEARRAYBOUND`>,
)
// UNSUPPORTED Rust 2889:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for _wireSAFEARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_wireVARIANT` (
    public var `clSize`: UInt,
    public var `rpcReserved`: UInt,
    public var `vt`: UShort,
    public var `wReserved1`: UShort,
    public var `wReserved2`: UShort,
    public var `wReserved3`: UShort,
    public var `Anonymous`: `_wireVARIANT_0`,
)
// UNSUPPORTED Rust 2907:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for _wireVARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2913:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union _wireVARIANT_0 {
//     pub llVal: i64,
//     pub lVal: i32,
//     pub bVal: u8,
//     pub iVal: i16,
//     pub fltVal: f32,
//     pub dblVal: f64,
//     pub boolVal: super::super::Foundation::VARIANT_BOOL,
//     pub scode: i32,
//     pub cyVal: super::Com::CY,
//     pub date: f64,
//     pub bstrVal: *mut super::Com::FLAGGED_WORD_BLOB,
//     pub punkVal: *mut core::ffi::c_void,
//     pub pdispVal: *mut core::ffi::c_void,
//     pub parray: *mut *mut _wireSAFEARRAY,
//     pub brecVal: *mut _wireBRECORD,
//     pub pbVal: *mut u8,
//     pub piVal: *mut i16,
//     pub plVal: *mut i32,
//     pub pllVal: *mut i64,
//     pub pfltVal: *mut f32,
//     pub pdblVal: *mut f64,
//     pub pboolVal: *mut super::super::Foundation::VARIANT_BOOL,
//     pub pscode: *mut i32,
//     pub pcyVal: *mut super::Com::CY,
//     pub pdate: *mut f64,
//     pub pbstrVal: *mut *mut super::Com::FLAGGED_WORD_BLOB,
//     pub ppunkVal: *mut *mut core::ffi::c_void,
//     pub ppdispVal: *mut *mut core::ffi::c_void,
//     pub pparray: *mut *mut *mut _wireSAFEARRAY,
//     pub pvarVal: *mut *mut _wireVARIANT,
//     pub cVal: i8,
//     pub uiVal: u16,
//     pub ulVal: u32,
//     pub ullVal: u64,
//     pub intVal: i32,
//     pub uintVal: u32,
//     pub decVal: super::super::Foundation::DECIMAL,
//     pub pdecVal: *mut super::super::Foundation::DECIMAL,
//     pub pcVal: windows_sys::core::PSTR,
//     pub puiVal: *mut u16,
//     pub pulVal: *mut u32,
//     pub pullVal: *mut u64,
//     pub pintVal: *mut i32,
//     pub puintVal: *mut u32,
// }

// UNSUPPORTED Rust 2962:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for _wireVARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `fdexEnumAll`: Int = 2;
public const val `fdexEnumDefault`: Int = 1;
public const val `fdexNameCaseInsensitive`: Int = 8;
public const val `fdexNameCaseSensitive`: Int = 1;
public const val `fdexNameEnsure`: Int = 2;
public const val `fdexNameImplicit`: Int = 4;
public const val `fdexNameInternal`: Int = 16;
public const val `fdexNameNoDynamicProperties`: Int = 32;
public const val `fdexPropCanCall`: `FDEX_PROP_FLAGS` = 256u;
public const val `fdexPropCanConstruct`: `FDEX_PROP_FLAGS` = 1024u;
public const val `fdexPropCanGet`: `FDEX_PROP_FLAGS` = 1u;
public const val `fdexPropCanPut`: `FDEX_PROP_FLAGS` = 4u;
public const val `fdexPropCanPutRef`: `FDEX_PROP_FLAGS` = 16u;
public const val `fdexPropCanSourceEvents`: `FDEX_PROP_FLAGS` = 4096u;
public const val `fdexPropCannotCall`: `FDEX_PROP_FLAGS` = 512u;
public const val `fdexPropCannotConstruct`: `FDEX_PROP_FLAGS` = 2048u;
public const val `fdexPropCannotGet`: `FDEX_PROP_FLAGS` = 2u;
public const val `fdexPropCannotPut`: `FDEX_PROP_FLAGS` = 8u;
public const val `fdexPropCannotPutRef`: `FDEX_PROP_FLAGS` = 32u;
public const val `fdexPropCannotSourceEvents`: `FDEX_PROP_FLAGS` = 8192u;
public const val `fdexPropDynamicType`: `FDEX_PROP_FLAGS` = 128u;
public const val `fdexPropNoSideEffects`: `FDEX_PROP_FLAGS` = 64u;
public const val `triChecked`: `OLE_TRISTATE` = 1;
public const val `triGray`: `OLE_TRISTATE` = 2;
public const val `triUnchecked`: `OLE_TRISTATE` = 0;
