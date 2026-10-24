// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=BSTR_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BSTR_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CLIPFORMAT_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CLIPFORMAT_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoGetMarshalSizeMax; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoGetMarshalSizeMax`(`pulsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwdestcontext` : UInt, `pvdestcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mshlflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoGetStandardMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoGetStandardMarshal`(`riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwdestcontext` : UInt, `pvdestcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mshlflags` : UInt, `ppmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoGetStdMarshalEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoGetStdMarshalEx`(`punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `smexflags` : UInt, `ppunkinner` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoMarshalHresult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoMarshalHresult`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hresult` : `windows_sys`.`core`.`HRESULT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoMarshalInterThreadInterfaceInStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoMarshalInterThreadInterfaceInStream`(`riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoMarshalInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoMarshalInterface`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punk` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwdestcontext` : UInt, `pvdestcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mshlflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoReleaseMarshalData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoReleaseMarshalData`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoUnmarshalHresult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoUnmarshalHresult`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=CoUnmarshalInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CoUnmarshalInterface`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HACCEL_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HACCEL_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HACCEL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HBITMAP_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HBITMAP_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HDC_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HDC_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HGLOBAL_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HGLOBAL_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HGLOBAL`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HICON_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HICON_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HMENU_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `HMENU_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`HMENU`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HPALETTE_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HPALETTE_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`HPALETTE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=HWND_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HWND_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`HWND`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=oleaut32.dll, ABI=system, export=LPSAFEARRAY_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LPSAFEARRAY_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`SAFEARRAY`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=SNB_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SNB_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UShortVar>>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserFree`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserFree64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserFree64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserMarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserMarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserMarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserMarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserSize`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserSize64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserSize64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : UInt, `param2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserUnmarshal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserUnmarshal`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ole32.dll, ABI=system, export=STGMEDIUM_UserUnmarshal64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
public external fun `STGMEDIUM_UserUnmarshal64`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`STGMEDIUM`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
public const val `SMEXF_HANDLER`: `STDMSHLFLAGS` = 2;
public const val `SMEXF_SERVER`: `STDMSHLFLAGS` = 1;
public typealias `STDMSHLFLAGS` = Int;
