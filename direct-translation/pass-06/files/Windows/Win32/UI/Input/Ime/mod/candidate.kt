// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmAssociateContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmAssociateContext`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`, `param1` : `HIMC`) : `HIMC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmAssociateContextEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmAssociateContextEx`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`, `param1` : `HIMC`, `param2` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmConfigureIMEA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmConfigureIMEA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `super`.`super`.`super`.`Foundation`.`HWND`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmConfigureIMEW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmConfigureIMEW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `super`.`super`.`super`.`Foundation`.`HWND`, `param2` : UInt, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmCreateContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmCreateContext`() : `HIMC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmCreateIMCC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmCreateIMCC`(`param0` : UInt) : `HIMCC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmCreateSoftKeyboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmCreateSoftKeyboard`(`param0` : UInt, `param1` : `super`.`super`.`super`.`Foundation`.`HWND`, `param2` : Int, `param3` : Int) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmDestroyContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmDestroyContext`(`param0` : `HIMC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmDestroyIMCC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmDestroyIMCC`(`param0` : `HIMCC`) : `HIMCC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmDestroySoftKeyboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmDestroySoftKeyboard`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmDisableIME; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmDisableIME`(`param0` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmDisableLegacyIME; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmDisableLegacyIME`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmDisableTextFrameService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmDisableTextFrameService`(`idthread` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmEnumInputContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmEnumInputContext`(`idthread` : UInt, `lpfn` : `IMCENUMPROC`, `lparam` : `super`.`super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmEnumRegisterWordA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmEnumRegisterWordA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `REGISTERWORDENUMPROCA`, `lpszreading` : `windows_sys`.`core`.`PCSTR`, `param3` : UInt, `lpszregister` : `windows_sys`.`core`.`PCSTR`, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmEnumRegisterWordW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmEnumRegisterWordW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `REGISTERWORDENUMPROCW`, `lpszreading` : `windows_sys`.`core`.`PCWSTR`, `param3` : UInt, `lpszregister` : `windows_sys`.`core`.`PCWSTR`, `param5` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmEscapeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmEscapeA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `HIMC`, `param2` : `IME_ESCAPE`, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmEscapeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmEscapeW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `HIMC`, `param2` : `IME_ESCAPE`, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGenerateMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGenerateMessage`(`param0` : `HIMC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCandidateListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCandidateListA`(`param0` : `HIMC`, `deindex` : UInt, `lpcandlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CANDIDATELIST`>?, `dwbuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCandidateListCountA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCandidateListCountA`(`param0` : `HIMC`, `lpdwlistcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCandidateListCountW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCandidateListCountW`(`param0` : `HIMC`, `lpdwlistcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCandidateListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCandidateListW`(`param0` : `HIMC`, `deindex` : UInt, `lpcandlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CANDIDATELIST`>?, `dwbuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCandidateWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCandidateWindow`(`param0` : `HIMC`, `param1` : UInt, `lpcandidate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CANDIDATEFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCompositionFontA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImmGetCompositionFontA`(`param0` : `HIMC`, `lplf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCompositionFontW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImmGetCompositionFontW`(`param0` : `HIMC`, `lplf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCompositionStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCompositionStringA`(`param0` : `HIMC`, `param1` : `IME_COMPOSITION_STRING`, `lpbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuflen` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCompositionStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCompositionStringW`(`param0` : `HIMC`, `param1` : `IME_COMPOSITION_STRING`, `lpbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuflen` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetCompositionWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetCompositionWindow`(`param0` : `HIMC`, `lpcompform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMPOSITIONFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetContext`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`) : `HIMC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetConversionListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetConversionListA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `HIMC`, `lpsrc` : `windows_sys`.`core`.`PCSTR`, `lpdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CANDIDATELIST`>?, `dwbuflen` : UInt, `uflag` : `GET_CONVERSION_LIST_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetConversionListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetConversionListW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : `HIMC`, `lpsrc` : `windows_sys`.`core`.`PCWSTR`, `lpdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CANDIDATELIST`>?, `dwbuflen` : UInt, `uflag` : `GET_CONVERSION_LIST_FLAG`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetConversionStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetConversionStatus`(`param0` : `HIMC`, `lpfdwconversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IME_CONVERSION_MODE`>?, `lpfdwsentence` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IME_SENTENCE_MODE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetDefaultIMEWnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetDefaultIMEWnd`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetDescriptionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetDescriptionA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszdescription` : `windows_sys`.`core`.`PSTR`, `ubuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetDescriptionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetDescriptionW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszdescription` : `windows_sys`.`core`.`PWSTR`, `ubuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetGuideLineA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetGuideLineA`(`param0` : `HIMC`, `dwindex` : `GET_GUIDE_LINE_TYPE`, `lpbuf` : `windows_sys`.`core`.`PSTR`, `dwbuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetGuideLineW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetGuideLineW`(`param0` : `HIMC`, `dwindex` : `GET_GUIDE_LINE_TYPE`, `lpbuf` : `windows_sys`.`core`.`PWSTR`, `dwbuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetHotKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetHotKey`(`param0` : UInt, `lpumodifiers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpuvkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `phkl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`KeyboardAndMouse`.`HKL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetIMCCLockCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetIMCCLockCount`(`param0` : `HIMCC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetIMCCSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetIMCCSize`(`param0` : `HIMCC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetIMCLockCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetIMCLockCount`(`param0` : `HIMC`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetIMEFileNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetIMEFileNameA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszfilename` : `windows_sys`.`core`.`PSTR`, `ubuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetIMEFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetIMEFileNameW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszfilename` : `windows_sys`.`core`.`PWSTR`, `ubuflen` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetImeMenuItemsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImmGetImeMenuItemsA`(`param0` : `HIMC`, `param1` : UInt, `param2` : UInt, `lpimeparentmenu` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEMENUITEMINFOA`>?, `lpimemenu` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEMENUITEMINFOA`>?, `dwsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetImeMenuItemsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImmGetImeMenuItemsW`(`param0` : `HIMC`, `param1` : UInt, `param2` : UInt, `lpimeparentmenu` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEMENUITEMINFOW`>?, `lpimemenu` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEMENUITEMINFOW`>?, `dwsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetOpenStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetOpenStatus`(`param0` : `HIMC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetProperty`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `param1` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetRegisterWordStyleA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetRegisterWordStyleA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `nitem` : UInt, `lpstylebuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STYLEBUFA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetRegisterWordStyleW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmGetRegisterWordStyleW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `nitem` : UInt, `lpstylebuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STYLEBUFW`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetStatusWindowPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetStatusWindowPos`(`param0` : `HIMC`, `lpptpos` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmGetVirtualKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmGetVirtualKey`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmInstallIMEA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmInstallIMEA`(`lpszimefilename` : `windows_sys`.`core`.`PCSTR`, `lpszlayouttext` : `windows_sys`.`core`.`PCSTR`) : `super`.`KeyboardAndMouse`.`HKL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmInstallIMEW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmInstallIMEW`(`lpszimefilename` : `windows_sys`.`core`.`PCWSTR`, `lpszlayouttext` : `windows_sys`.`core`.`PCWSTR`) : `super`.`KeyboardAndMouse`.`HKL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmIsIME; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmIsIME`(`param0` : `super`.`KeyboardAndMouse`.`HKL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmIsUIMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmIsUIMessageA`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`, `param1` : UInt, `param2` : `super`.`super`.`super`.`Foundation`.`WPARAM`, `param3` : `super`.`super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmIsUIMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmIsUIMessageW`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`, `param1` : UInt, `param2` : `super`.`super`.`super`.`Foundation`.`WPARAM`, `param3` : `super`.`super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmLockIMC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImmLockIMC`(`param0` : `HIMC`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`INPUTCONTEXT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmLockIMCC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmLockIMCC`(`param0` : `HIMCC`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmNotifyIME; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmNotifyIME`(`param0` : `HIMC`, `dwaction` : `NOTIFY_IME_ACTION`, `dwindex` : `NOTIFY_IME_INDEX`, `dwvalue` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmReSizeIMCC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmReSizeIMCC`(`param0` : `HIMCC`, `param1` : UInt) : `HIMCC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmRegisterWordA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmRegisterWordA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszreading` : `windows_sys`.`core`.`PCSTR`, `param2` : UInt, `lpszregister` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmRegisterWordW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmRegisterWordW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszreading` : `windows_sys`.`core`.`PCWSTR`, `param2` : UInt, `lpszregister` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmReleaseContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmReleaseContext`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`, `param1` : `HIMC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmRequestMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmRequestMessageA`(`param0` : `HIMC`, `param1` : `super`.`super`.`super`.`Foundation`.`WPARAM`, `param2` : `super`.`super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmRequestMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmRequestMessageW`(`param0` : `HIMC`, `param1` : `super`.`super`.`super`.`Foundation`.`WPARAM`, `param2` : `super`.`super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetCandidateWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSetCandidateWindow`(`param0` : `HIMC`, `lpcandidate` : /* Rust *const */ kotlinx.cinterop.CPointer<`CANDIDATEFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetCompositionFontA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImmSetCompositionFontA`(`param0` : `HIMC`, `lplf` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetCompositionFontW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImmSetCompositionFontW`(`param0` : `HIMC`, `lplf` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetCompositionStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSetCompositionStringA`(`param0` : `HIMC`, `dwindex` : `SET_COMPOSITION_STRING_TYPE`, `lpcomp` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcomplen` : UInt, `lpread` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreadlen` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetCompositionStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSetCompositionStringW`(`param0` : `HIMC`, `dwindex` : `SET_COMPOSITION_STRING_TYPE`, `lpcomp` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwcomplen` : UInt, `lpread` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreadlen` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetCompositionWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSetCompositionWindow`(`param0` : `HIMC`, `lpcompform` : /* Rust *const */ kotlinx.cinterop.CPointer<`COMPOSITIONFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetConversionStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSetConversionStatus`(`param0` : `HIMC`, `param1` : `IME_CONVERSION_MODE`, `param2` : `IME_SENTENCE_MODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetHotKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmSetHotKey`(`param0` : UInt, `param1` : UInt, `param2` : UInt, `param3` : `super`.`KeyboardAndMouse`.`HKL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetOpenStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSetOpenStatus`(`param0` : `HIMC`, `param1` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSetStatusWindowPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSetStatusWindowPos`(`param0` : `HIMC`, `lpptpos` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmShowSoftKeyboard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmShowSoftKeyboard`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`, `param1` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmSimulateHotKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmSimulateHotKey`(`param0` : `super`.`super`.`super`.`Foundation`.`HWND`, `param1` : `IME_HOTKEY_IDENTIFIER`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmUnlockIMC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmUnlockIMC`(`param0` : `HIMC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmUnlockIMCC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImmUnlockIMCC`(`param0` : `HIMCC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmUnregisterWordA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmUnregisterWordA`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszreading` : `windows_sys`.`core`.`PCSTR`, `param2` : UInt, `lpszunregister` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imm32.dll, ABI=system, export=ImmUnregisterWordW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
public external fun `ImmUnregisterWordW`(`param0` : `super`.`KeyboardAndMouse`.`HKL`, `lpszreading` : `windows_sys`.`core`.`PCWSTR`, `param2` : UInt, `lpszunregister` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPLETIDLIST` (
    public var `count`: Int,
    public var `pIIDList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `APPLETIDLIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `APPLETIDLIST`.Companion.`default`() : `APPLETIDLIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPLYCANDEXPARAM` (
    public var `dwSize`: UInt,
    public var `lpwstrDisplay`: `windows_sys`.`core`.`PWSTR`,
    public var `lpwstrReading`: `windows_sys`.`core`.`PWSTR`,
    public var `dwReserved`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `APPLYCANDEXPARAM`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `APPLYCANDEXPARAM`.Companion.`default`() : `APPLYCANDEXPARAM` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `ATTR_CONVERTED`: UInt = 2u;
public const val `ATTR_FIXEDCONVERTED`: UInt = 5u;
public const val `ATTR_INPUT`: UInt = 0u;
public const val `ATTR_INPUT_ERROR`: UInt = 4u;
public const val `ATTR_TARGET_CONVERTED`: UInt = 1u;
public const val `ATTR_TARGET_NOTCONVERTED`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CANDIDATEFORM` (
    public var `dwIndex`: UInt,
    public var `dwStyle`: UInt,
    public var `ptCurrentPos`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `rcArea`: `super`.`super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CANDIDATEINFO` (
    public var `dwSize`: UInt,
    public var `dwCount`: UInt,
    public var `dwOffset`: UIntArray,
    public var `dwPrivateSize`: UInt,
    public var `dwPrivateOffset`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CANDIDATEINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CANDIDATEINFO`.Companion.`default`() : `CANDIDATEINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CANDIDATELIST` (
    public var `dwSize`: UInt,
    public var `dwStyle`: UInt,
    public var `dwCount`: UInt,
    public var `dwSelection`: UInt,
    public var `dwPageStart`: UInt,
    public var `dwPageSize`: UInt,
    public var `dwOffset`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CANDIDATELIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `CANDIDATELIST`.Companion.`default`() : `CANDIDATELIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 182:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_MSIME_IImePadApplet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7566cad1_4ec9_4478_9fe9_8ed766619edf);

// UNSUPPORTED Rust 183:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_MSIME_IImePadApplet1000: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe081e1d6_2389_43cb_b66f_609f823d9f9c);

// UNSUPPORTED Rust 184:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_MSIME_IImePadApplet1200: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa47fb5fc_7d15_4223_a789_b781bf9ae667);

// UNSUPPORTED Rust 185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_MSIME_IImePadApplet900: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfaae51bf_5e5b_4a1d_8de1_17c1d9e1728d);

// UNSUPPORTED Rust 186:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_MSIME_IImePadApplet_VER7: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4a0f8e31_c3ee_11d1_afef_00805f0c8b6d);

// UNSUPPORTED Rust 187:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_MSIME_IImePadApplet_VER80: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x56f7a792_fef1_11d3_8463_00c04f7a06e5);

// UNSUPPORTED Rust 188:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CATID_MSIME_IImePadApplet_VER81: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x656520b0_bb88_11d4_84c0_00c04f7a06e5);

// UNSUPPORTED Rust 189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CActiveIMM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4955dd33_b159_11d0_8fcf_00aa006bcc59);

public const val `CFS_CANDIDATEPOS`: UInt = 64u;
public const val `CFS_DEFAULT`: UInt = 0u;
public const val `CFS_EXCLUDE`: UInt = 128u;
public const val `CFS_FORCE_POSITION`: UInt = 32u;
public const val `CFS_POINT`: UInt = 2u;
public const val `CFS_RECT`: UInt = 1u;
public const val `CHARINFO_APPLETID_MASK`: UInt = 4278190080u;
public const val `CHARINFO_CHARID_MASK`: UInt = 65535u;
public const val `CHARINFO_FEID_MASK`: UInt = 15728640u;
// UNSUPPORTED Rust 199:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_ImePlugInDictDictionaryList_CHS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7bf0129b_5bef_4de4_9b0b_5edb66ac2fa6);

// UNSUPPORTED Rust 200:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_ImePlugInDictDictionaryList_JPN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4fe2776b_b0f9_4396_b5fc_e9d4cf1ec195);

// UNSUPPORTED Rust 201:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_VERSION_DEPENDENT_MSIME_JAPANESE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a91029e_aa49_471b_aee7_7d332785660d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COMPOSITIONFORM` (
    public var `dwStyle`: UInt,
    public var `ptCurrentPos`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `rcArea`: `super`.`super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COMPOSITIONSTRING` (
    public var `dwSize`: UInt,
    public var `dwCompReadAttrLen`: UInt,
    public var `dwCompReadAttrOffset`: UInt,
    public var `dwCompReadClauseLen`: UInt,
    public var `dwCompReadClauseOffset`: UInt,
    public var `dwCompReadStrLen`: UInt,
    public var `dwCompReadStrOffset`: UInt,
    public var `dwCompAttrLen`: UInt,
    public var `dwCompAttrOffset`: UInt,
    public var `dwCompClauseLen`: UInt,
    public var `dwCompClauseOffset`: UInt,
    public var `dwCompStrLen`: UInt,
    public var `dwCompStrOffset`: UInt,
    public var `dwCursorPos`: UInt,
    public var `dwDeltaStart`: UInt,
    public var `dwResultReadClauseLen`: UInt,
    public var `dwResultReadClauseOffset`: UInt,
    public var `dwResultReadStrLen`: UInt,
    public var `dwResultReadStrOffset`: UInt,
    public var `dwResultClauseLen`: UInt,
    public var `dwResultClauseOffset`: UInt,
    public var `dwResultStrLen`: UInt,
    public var `dwResultStrOffset`: UInt,
    public var `dwPrivateSize`: UInt,
    public var `dwPrivateOffset`: UInt,
)
public const val `CPS_CANCEL`: `NOTIFY_IME_INDEX` = 4u;
public const val `CPS_COMPLETE`: `NOTIFY_IME_INDEX` = 1u;
public const val `CPS_CONVERT`: `NOTIFY_IME_INDEX` = 2u;
public const val `CPS_REVERT`: `NOTIFY_IME_INDEX` = 3u;
public const val `CS_INSERTCHAR`: UInt = 8192u;
public const val `CS_NOMOVECARET`: UInt = 16384u;
public const val `E_LARGEINPUT`: UInt = 51u;
public const val `E_NOCAND`: UInt = 48u;
public const val `E_NOTENOUGH_BUFFER`: UInt = 49u;
public const val `E_NOTENOUGH_WDD`: UInt = 50u;
public const val `FEID_CHINESE_HONGKONG`: UInt = 3u;
public const val `FEID_CHINESE_SIMPLIFIED`: UInt = 2u;
public const val `FEID_CHINESE_SINGAPORE`: UInt = 4u;
public const val `FEID_CHINESE_TRADITIONAL`: UInt = 1u;
public const val `FEID_JAPANESE`: UInt = 5u;
public const val `FEID_KOREAN`: UInt = 6u;
public const val `FEID_KOREAN_JOHAB`: UInt = 7u;
public const val `FEID_NONE`: UInt = 0u;
public const val `FELANG_CLMN_FIXD`: UInt = 32u;
public const val `FELANG_CLMN_FIXR`: UInt = 16u;
public const val `FELANG_CLMN_NOPBREAK`: UInt = 8u;
public const val `FELANG_CLMN_NOWBREAK`: UInt = 2u;
public const val `FELANG_CLMN_PBREAK`: UInt = 4u;
public const val `FELANG_CLMN_WBREAK`: UInt = 1u;
public const val `FELANG_CMODE_AUTOMATIC`: UInt = 134217728u;
public const val `FELANG_CMODE_BESTFIRST`: UInt = 16384u;
public const val `FELANG_CMODE_BOPOMOFO`: UInt = 64u;
public const val `FELANG_CMODE_CONVERSATION`: UInt = 536870912u;
public const val `FELANG_CMODE_FULLWIDTHOUT`: UInt = 32u;
public const val `FELANG_CMODE_HALFWIDTHOUT`: UInt = 16u;
public const val `FELANG_CMODE_HANGUL`: UInt = 128u;
public const val `FELANG_CMODE_HIRAGANAOUT`: UInt = 0u;
public const val `FELANG_CMODE_KATAKANAOUT`: UInt = 8u;
public const val `FELANG_CMODE_MERGECAND`: UInt = 4096u;
public const val `FELANG_CMODE_MONORUBY`: UInt = 2u;
public const val `FELANG_CMODE_NAME`: UInt = 268435456u;
public const val `FELANG_CMODE_NOINVISIBLECHAR`: UInt = 1073741824u;
public const val `FELANG_CMODE_NONE`: UInt = 16777216u;
public const val `FELANG_CMODE_NOPRUNING`: UInt = 4u;
public const val `FELANG_CMODE_PHRASEPREDICT`: UInt = 268435456u;
public const val `FELANG_CMODE_PINYIN`: UInt = 256u;
public const val `FELANG_CMODE_PLAURALCLAUSE`: UInt = 33554432u;
public const val `FELANG_CMODE_PRECONV`: UInt = 512u;
public const val `FELANG_CMODE_RADICAL`: UInt = 1024u;
public const val `FELANG_CMODE_ROMAN`: UInt = 8192u;
public const val `FELANG_CMODE_SINGLECONVERT`: UInt = 67108864u;
public const val `FELANG_CMODE_UNKNOWNREADING`: UInt = 2048u;
public const val `FELANG_CMODE_USENOREVWORDS`: UInt = 32768u;
public const val `FELANG_INVALD_PO`: UInt = 65535u;
public const val `FELANG_REQ_CONV`: UInt = 65536u;
public const val `FELANG_REQ_RECONV`: UInt = 131072u;
public const val `FELANG_REQ_REV`: UInt = 196608u;
public const val `FID_MSIME_KMS_DEL_KEYLIST`: UInt = 4u;
public const val `FID_MSIME_KMS_FUNCDESC`: UInt = 9u;
public const val `FID_MSIME_KMS_GETMAP`: UInt = 6u;
public const val `FID_MSIME_KMS_GETMAPFAST`: UInt = 11u;
public const val `FID_MSIME_KMS_GETMAPSEAMLESS`: UInt = 10u;
public const val `FID_MSIME_KMS_INIT`: UInt = 2u;
public const val `FID_MSIME_KMS_INVOKE`: UInt = 7u;
public const val `FID_MSIME_KMS_NOTIFY`: UInt = 5u;
public const val `FID_MSIME_KMS_SETMAP`: UInt = 8u;
public const val `FID_MSIME_KMS_TERM`: UInt = 3u;
public const val `FID_MSIME_KMS_VERSION`: UInt = 1u;
public const val `FID_MSIME_VERSION`: UInt = 0u;
public const val `FID_RECONVERT_VERSION`: UInt = 268435456u;
public const val `GCL_CONVERSION`: `GET_CONVERSION_LIST_FLAG` = 1u;
public const val `GCL_REVERSECONVERSION`: `GET_CONVERSION_LIST_FLAG` = 2u;
public const val `GCL_REVERSE_LENGTH`: `GET_CONVERSION_LIST_FLAG` = 3u;
public const val `GCSEX_CANCELRECONVERT`: UInt = 268435456u;
public const val `GCS_COMPATTR`: `IME_COMPOSITION_STRING` = 16u;
public const val `GCS_COMPCLAUSE`: `IME_COMPOSITION_STRING` = 32u;
public const val `GCS_COMPREADATTR`: `IME_COMPOSITION_STRING` = 2u;
public const val `GCS_COMPREADCLAUSE`: `IME_COMPOSITION_STRING` = 4u;
public const val `GCS_COMPREADSTR`: `IME_COMPOSITION_STRING` = 1u;
public const val `GCS_COMPSTR`: `IME_COMPOSITION_STRING` = 8u;
public const val `GCS_CURSORPOS`: `IME_COMPOSITION_STRING` = 128u;
public const val `GCS_DELTASTART`: `IME_COMPOSITION_STRING` = 256u;
public const val `GCS_RESULTCLAUSE`: `IME_COMPOSITION_STRING` = 4096u;
public const val `GCS_RESULTREADCLAUSE`: `IME_COMPOSITION_STRING` = 1024u;
public const val `GCS_RESULTREADSTR`: `IME_COMPOSITION_STRING` = 512u;
public const val `GCS_RESULTSTR`: `IME_COMPOSITION_STRING` = 2048u;
public typealias `GET_CONVERSION_LIST_FLAG` = UInt;
public typealias `GET_GUIDE_LINE_TYPE` = UInt;
public const val `GGL_INDEX`: `GET_GUIDE_LINE_TYPE` = 2u;
public const val `GGL_LEVEL`: `GET_GUIDE_LINE_TYPE` = 1u;
public const val `GGL_PRIVATE`: `GET_GUIDE_LINE_TYPE` = 4u;
public const val `GGL_STRING`: `GET_GUIDE_LINE_TYPE` = 3u;
public const val `GL_ID_CANNOTSAVE`: UInt = 17u;
public const val `GL_ID_CHOOSECANDIDATE`: UInt = 40u;
public const val `GL_ID_INPUTCODE`: UInt = 38u;
public const val `GL_ID_INPUTRADICAL`: UInt = 37u;
public const val `GL_ID_INPUTREADING`: UInt = 36u;
public const val `GL_ID_INPUTSYMBOL`: UInt = 39u;
public const val `GL_ID_NOCONVERT`: UInt = 32u;
public const val `GL_ID_NODICTIONARY`: UInt = 16u;
public const val `GL_ID_NOMODULE`: UInt = 1u;
public const val `GL_ID_PRIVATE_FIRST`: UInt = 32768u;
public const val `GL_ID_PRIVATE_LAST`: UInt = 65535u;
public const val `GL_ID_READINGCONFLICT`: UInt = 35u;
public const val `GL_ID_REVERSECONVERSION`: UInt = 41u;
public const val `GL_ID_TOOMANYSTROKE`: UInt = 34u;
public const val `GL_ID_TYPINGERROR`: UInt = 33u;
public const val `GL_ID_UNKNOWN`: UInt = 0u;
public const val `GL_LEVEL_ERROR`: UInt = 2u;
public const val `GL_LEVEL_FATAL`: UInt = 1u;
public const val `GL_LEVEL_INFORMATION`: UInt = 4u;
public const val `GL_LEVEL_NOGUIDELINE`: UInt = 0u;
public const val `GL_LEVEL_WARNING`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GUIDELINE` (
    public var `dwSize`: UInt,
    public var `dwLevel`: UInt,
    public var `dwIndex`: UInt,
    public var `dwStrLen`: UInt,
    public var `dwStrOffset`: UInt,
    public var `dwPrivateSize`: UInt,
    public var `dwPrivateOffset`: UInt,
)
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HIMC` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HIMCC` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `IACE_CHILDREN`: UInt = 1u;
public const val `IACE_DEFAULT`: UInt = 16u;
public const val `IACE_IGNORENOCONTEXT`: UInt = 32u;
public const val `IFEC_S_ALREADY_DEFAULT`: Int = 291840;
public const val `IFED_ACTIVE_DICT`: `IMEFMT` = 13;
public const val `IFED_ATOK10`: `IMEFMT` = 15;
public const val `IFED_ATOK9`: `IMEFMT` = 14;
public const val `IFED_E_INVALID_FORMAT`: Int = -2147192063;
public const val `IFED_E_NOT_FOUND`: Int = -2147192064;
public const val `IFED_E_NOT_SUPPORTED`: Int = -2147192057;
public const val `IFED_E_NOT_USER_DIC`: Int = -2147192058;
public const val `IFED_E_NO_ENTRY`: Int = -2147192060;
public const val `IFED_E_OPEN_FAILED`: Int = -2147192062;
public const val `IFED_E_REGISTER_DISCONNECTED`: Int = -2147192053;
public const val `IFED_E_REGISTER_FAILED`: Int = -2147192059;
public const val `IFED_E_REGISTER_ILLEGAL_POS`: Int = -2147192055;
public const val `IFED_E_REGISTER_IMPROPER_WORD`: Int = -2147192054;
public const val `IFED_E_USER_COMMENT`: Int = -2147192056;
public const val `IFED_E_WRITE_FAILED`: Int = -2147192061;
public const val `IFED_MSIME2_BIN_SYSTEM`: `IMEFMT` = 1;
public const val `IFED_MSIME2_BIN_USER`: `IMEFMT` = 2;
public const val `IFED_MSIME2_TEXT_USER`: `IMEFMT` = 3;
public const val `IFED_MSIME95_BIN_SYSTEM`: `IMEFMT` = 4;
public const val `IFED_MSIME95_BIN_USER`: `IMEFMT` = 5;
public const val `IFED_MSIME95_TEXT_USER`: `IMEFMT` = 6;
public const val `IFED_MSIME97_BIN_SYSTEM`: `IMEFMT` = 7;
public const val `IFED_MSIME97_BIN_USER`: `IMEFMT` = 8;
public const val `IFED_MSIME97_TEXT_USER`: `IMEFMT` = 9;
public const val `IFED_MSIME98_BIN_SYSTEM`: `IMEFMT` = 10;
public const val `IFED_MSIME98_BIN_USER`: `IMEFMT` = 11;
public const val `IFED_MSIME98_SYSTEM_CE`: `IMEFMT` = 20;
public const val `IFED_MSIME98_TEXT_USER`: `IMEFMT` = 12;
public const val `IFED_MSIME_BIN_SYSTEM`: `IMEFMT` = 21;
public const val `IFED_MSIME_BIN_USER`: `IMEFMT` = 22;
public const val `IFED_MSIME_TEXT_USER`: `IMEFMT` = 23;
public const val `IFED_NEC_AI_`: `IMEFMT` = 16;
public const val `IFED_PIME2_BIN_STANDARD_SYSTEM`: `IMEFMT` = 26;
public const val `IFED_PIME2_BIN_SYSTEM`: `IMEFMT` = 25;
public const val `IFED_PIME2_BIN_USER`: `IMEFMT` = 24;
public const val `IFED_POS_ADJECTIVE`: UInt = 4u;
public const val `IFED_POS_ADJECTIVE_VERB`: UInt = 8u;
public const val `IFED_POS_ADNOUN`: UInt = 32u;
public const val `IFED_POS_ADVERB`: UInt = 16u;
public const val `IFED_POS_AFFIX`: UInt = 1536u;
public const val `IFED_POS_ALL`: UInt = 131071u;
public const val `IFED_POS_AUXILIARY_VERB`: UInt = 32768u;
public const val `IFED_POS_CONJUNCTION`: UInt = 64u;
public const val `IFED_POS_DEPENDENT`: UInt = 114688u;
public const val `IFED_POS_IDIOMS`: UInt = 4096u;
public const val `IFED_POS_INDEPENDENT`: UInt = 255u;
public const val `IFED_POS_INFLECTIONALSUFFIX`: UInt = 256u;
public const val `IFED_POS_INTERJECTION`: UInt = 128u;
public const val `IFED_POS_NONE`: UInt = 0u;
public const val `IFED_POS_NOUN`: UInt = 1u;
public const val `IFED_POS_PARTICLE`: UInt = 16384u;
public const val `IFED_POS_PREFIX`: UInt = 512u;
public const val `IFED_POS_SUB_VERB`: UInt = 65536u;
public const val `IFED_POS_SUFFIX`: UInt = 1024u;
public const val `IFED_POS_SYMBOLS`: UInt = 8192u;
public const val `IFED_POS_TANKANJI`: UInt = 2048u;
public const val `IFED_POS_VERB`: UInt = 2u;
public const val `IFED_REG_ALL`: UInt = 7u;
public const val `IFED_REG_AUTO`: UInt = 2u;
public const val `IFED_REG_DEL`: `IMEREG` = 2;
public const val `IFED_REG_GRAMMAR`: UInt = 4u;
public const val `IFED_REG_HEAD`: `IMEREG` = 0;
public const val `IFED_REG_NONE`: UInt = 0u;
public const val `IFED_REG_TAIL`: `IMEREG` = 1;
public const val `IFED_REG_USER`: UInt = 1u;
public const val `IFED_REL_ALL`: `IMEREL` = 24;
public const val `IFED_REL_DE`: `IMEREL` = 5;
public const val `IFED_REL_FUKU_YOUGEN`: `IMEREL` = 12;
public const val `IFED_REL_GA`: `IMEREL` = 2;
public const val `IFED_REL_HE`: `IMEREL` = 9;
public const val `IFED_REL_IDEOM`: `IMEREL` = 11;
public const val `IFED_REL_KARA`: `IMEREL` = 7;
public const val `IFED_REL_KEIDOU1_YOUGEN`: `IMEREL` = 14;
public const val `IFED_REL_KEIDOU2_YOUGEN`: `IMEREL` = 15;
public const val `IFED_REL_KEIYOU_TARU_YOUGEN`: `IMEREL` = 21;
public const val `IFED_REL_KEIYOU_TO_YOUGEN`: `IMEREL` = 20;
public const val `IFED_REL_KEIYOU_YOUGEN`: `IMEREL` = 13;
public const val `IFED_REL_MADE`: `IMEREL` = 8;
public const val `IFED_REL_NI`: `IMEREL` = 4;
public const val `IFED_REL_NO`: `IMEREL` = 1;
public const val `IFED_REL_NONE`: `IMEREL` = 0;
public const val `IFED_REL_RENSOU`: `IMEREL` = 19;
public const val `IFED_REL_RENTAI_MEI`: `IMEREL` = 18;
public const val `IFED_REL_TAIGEN`: `IMEREL` = 16;
public const val `IFED_REL_TO`: `IMEREL` = 10;
public const val `IFED_REL_UNKNOWN1`: `IMEREL` = 22;
public const val `IFED_REL_UNKNOWN2`: `IMEREL` = 23;
public const val `IFED_REL_WO`: `IMEREL` = 3;
public const val `IFED_REL_YORI`: `IMEREL` = 6;
public const val `IFED_REL_YOUGEN`: `IMEREL` = 17;
public const val `IFED_SELECT_ALL`: UInt = 15u;
public const val `IFED_SELECT_COMMENT`: UInt = 8u;
public const val `IFED_SELECT_DISPLAY`: UInt = 2u;
public const val `IFED_SELECT_NONE`: UInt = 0u;
public const val `IFED_SELECT_POS`: UInt = 4u;
public const val `IFED_SELECT_READING`: UInt = 1u;
public const val `IFED_S_COMMENT_CHANGED`: Int = 291331;
public const val `IFED_S_EMPTY_DICTIONARY`: Int = 291329;
public const val `IFED_S_MORE_ENTRIES`: Int = 291328;
public const val `IFED_S_WORD_EXISTS`: Int = 291330;
public const val `IFED_TYPE_ALL`: UInt = 31u;
public const val `IFED_TYPE_ENGLISH`: UInt = 16u;
public const val `IFED_TYPE_GENERAL`: UInt = 1u;
public const val `IFED_TYPE_NAMEPLACE`: UInt = 2u;
public const val `IFED_TYPE_NONE`: UInt = 0u;
public const val `IFED_TYPE_REVERSE`: UInt = 8u;
public const val `IFED_TYPE_SPEECH`: UInt = 4u;
public const val `IFED_UCT_MAX`: `IMEUCT` = 4;
public const val `IFED_UCT_NONE`: `IMEUCT` = 0;
public const val `IFED_UCT_STRING_SJIS`: `IMEUCT` = 1;
public const val `IFED_UCT_STRING_UNICODE`: `IMEUCT` = 2;
public const val `IFED_UCT_USER_DEFINED`: `IMEUCT` = 3;
public const val `IFED_UNKNOWN`: `IMEFMT` = 0;
public const val `IFED_VJE_20`: `IMEFMT` = 19;
public const val `IFED_WX_II`: `IMEFMT` = 17;
public const val `IFED_WX_III`: `IMEFMT` = 18;
public const val `IGIMIF_RIGHTMENU`: UInt = 1u;
public const val `IGIMII_CMODE`: UInt = 1u;
public const val `IGIMII_CONFIGURE`: UInt = 4u;
public const val `IGIMII_HELP`: UInt = 16u;
public const val `IGIMII_INPUTTOOLS`: UInt = 64u;
public const val `IGIMII_OTHER`: UInt = 32u;
public const val `IGIMII_SMODE`: UInt = 2u;
public const val `IGIMII_TOOLS`: UInt = 8u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `IMCENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HIMC`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `IMC_CLOSESTATUSWINDOW`: UInt = 33u;
public const val `IMC_GETCANDIDATEPOS`: UInt = 7u;
public const val `IMC_GETCOMPOSITIONFONT`: UInt = 9u;
public const val `IMC_GETCOMPOSITIONWINDOW`: UInt = 11u;
public const val `IMC_GETSOFTKBDFONT`: UInt = 17u;
public const val `IMC_GETSOFTKBDPOS`: UInt = 19u;
public const val `IMC_GETSOFTKBDSUBTYPE`: UInt = 21u;
public const val `IMC_GETSTATUSWINDOWPOS`: UInt = 15u;
public const val `IMC_OPENSTATUSWINDOW`: UInt = 34u;
public const val `IMC_SETCANDIDATEPOS`: UInt = 8u;
public const val `IMC_SETCOMPOSITIONFONT`: UInt = 10u;
public const val `IMC_SETCOMPOSITIONWINDOW`: UInt = 12u;
public const val `IMC_SETCONVERSIONMODE`: UInt = 2u;
public const val `IMC_SETOPENSTATUS`: UInt = 6u;
public const val `IMC_SETSENTENCEMODE`: UInt = 4u;
public const val `IMC_SETSOFTKBDDATA`: UInt = 24u;
public const val `IMC_SETSOFTKBDFONT`: UInt = 18u;
public const val `IMC_SETSOFTKBDPOS`: UInt = 20u;
public const val `IMC_SETSOFTKBDSUBTYPE`: UInt = 22u;
public const val `IMC_SETSTATUSWINDOWPOS`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEAPPLETCFG` (
    public var `dwConfig`: UInt,
    public var `wchTitle`: UShortArray,
    public var `wchTitleFontFace`: UShortArray,
    public var `dwCharSet`: UInt,
    public var `iCategory`: Int,
    public var `hIcon`: `super`.`super`.`WindowsAndMessaging`.`HICON`,
    public var `langID`: UShort,
    public var `dummy`: UShort,
    public var `lReserved1`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEAPPLETCFG`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]

    public fun `IMEAPPLETCFG`.Companion.`default`() : `IMEAPPLETCFG` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEAPPLETUI` (
    public var `hwnd`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `dwStyle`: UInt,
    public var `width`: Int,
    public var `height`: Int,
    public var `minWidth`: Int,
    public var `minHeight`: Int,
    public var `maxWidth`: Int,
    public var `maxHeight`: Int,
    public var `lReserved1`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lReserved2`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEAPPLETUI`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEAPPLETUI`.Companion.`default`() : `IMEAPPLETUI` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMECHARINFO` (
    public var `wch`: UShort,
    public var `dwCharInfo`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMECHARPOSITION` (
    public var `dwSize`: UInt,
    public var `dwCharPos`: UInt,
    public var `pt`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `cLineHeight`: UInt,
    public var `rcDocument`: `super`.`super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMECOMPOSITIONSTRINGINFO` (
    public var `iCompStrLen`: Int,
    public var `iCaretPos`: Int,
    public var `iEditStart`: Int,
    public var `iEditLen`: Int,
    public var `iTargetStart`: Int,
    public var `iTargetLen`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEDLG` (
    public var `cbIMEDLG`: Int,
    public var `hwnd`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `lpwstrWord`: `windows_sys`.`core`.`PWSTR`,
    public var `nTabId`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEDLG`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEDLG`.Companion.`default`() : `IMEDLG` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEDP` (
    public var `wrdModifier`: `IMEWRD`,
    public var `wrdModifiee`: `IMEWRD`,
    public var `relID`: `IMEREL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEDP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEDP`.Companion.`default`() : `IMEDP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEFAREASTINFO` (
    public var `dwSize`: UInt,
    public var `dwType`: UInt,
    public var `dwData`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEFAREASTINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEFAREASTINFO`.Companion.`default`() : `IMEFAREASTINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `IMEFAREASTINFO_TYPE_COMMENT`: UInt = 2u;
public const val `IMEFAREASTINFO_TYPE_COSTTIME`: UInt = 3u;
public const val `IMEFAREASTINFO_TYPE_DEFAULT`: UInt = 0u;
public const val `IMEFAREASTINFO_TYPE_READING`: UInt = 1u;
public typealias `IMEFMT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMEINFO` (
    public var `dwPrivateDataSize`: UInt,
    public var `fdwProperty`: UInt,
    public var `fdwConversionCaps`: UInt,
    public var `fdwSentenceCaps`: UInt,
    public var `fdwUICaps`: UInt,
    public var `fdwSCSCaps`: UInt,
    public var `fdwSelectCaps`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEITEM` (
    public var `cbSize`: Int,
    public var `iType`: Int,
    public var `lpItemData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEITEM`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEITEM`.Companion.`default`() : `IMEITEM` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEITEMCANDIDATE` (
    public var `uCount`: UInt,
    public var `imeItem`: Array<`IMEITEM`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEITEMCANDIDATE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEITEMCANDIDATE`.Companion.`default`() : `IMEITEMCANDIDATE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `IMEKEYCTRLMASK_ALT`: UInt = 1u;
public const val `IMEKEYCTRLMASK_CTRL`: UInt = 2u;
public const val `IMEKEYCTRLMASK_SHIFT`: UInt = 4u;
public const val `IMEKEYCTRL_DOWN`: UInt = 0u;
public const val `IMEKEYCTRL_UP`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEKMS` (
    public var `cbSize`: Int,
    public var `hIMC`: `HIMC`,
    public var `cKeyList`: UInt,
    public var `pKeyList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEKMSKEY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMS`.Companion.`default`() : `IMEKMS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEKMSFUNCDESC` (
    public var `cbSize`: Int,
    public var `idLang`: UShort,
    public var `dwControl`: UInt,
    public var `pwszDescription`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSFUNCDESC`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSFUNCDESC`.Companion.`default`() : `IMEKMSFUNCDESC` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEKMSINIT` (
    public var `cbSize`: Int,
    public var `hWnd`: `super`.`super`.`super`.`Foundation`.`HWND`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSINIT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSINIT`.Companion.`default`() : `IMEKMSINIT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEKMSINVK` (
    public var `cbSize`: Int,
    public var `hIMC`: `HIMC`,
    public var `dwControl`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSINVK`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSINVK`.Companion.`default`() : `IMEKMSINVK` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEKMSKEY` (
    public var `dwStatus`: UInt,
    public var `dwCompStatus`: UInt,
    public var `dwVKEY`: UInt,
    public var `Anonymous1`: `IMEKMSKEY_0`,
    public var `Anonymous2`: `IMEKMSKEY_1`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSKEY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSKEY`.Companion.`default`() : `IMEKMSKEY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 716:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union IMEKMSKEY_0 {
//     pub dwControl: u32,
//     pub dwNotUsed: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSKEY_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSKEY_0`.Companion.`default`() : `IMEKMSKEY_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 727:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union IMEKMSKEY_1 {
//     pub pwszDscr: [u16; 31],
//     pub pwszNoUse: [u16; 31],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSKEY_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSKEY_1`.Companion.`default`() : `IMEKMSKEY_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEKMSKMP` (
    public var `cbSize`: Int,
    public var `hIMC`: `HIMC`,
    public var `idLang`: UShort,
    public var `wVKStart`: UShort,
    public var `wVKEnd`: UShort,
    public var `cKeyList`: Int,
    public var `pKeyList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEKMSKEY`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSKMP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSKMP`.Companion.`default`() : `IMEKMSKMP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEKMSNTFY` (
    public var `cbSize`: Int,
    public var `hIMC`: `HIMC`,
    public var `fSelect`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEKMSNTFY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEKMSNTFY`.Companion.`default`() : `IMEKMSNTFY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `IMEKMS_2NDLEVEL`: UInt = 4u;
public const val `IMEKMS_CANDIDATE`: UInt = 6u;
public const val `IMEKMS_COMPOSITION`: UInt = 1u;
public const val `IMEKMS_IMEOFF`: UInt = 3u;
public const val `IMEKMS_INPTGL`: UInt = 5u;
public const val `IMEKMS_NOCOMPOSITION`: UInt = 0u;
public const val `IMEKMS_SELECTION`: UInt = 2u;
public const val `IMEKMS_TYPECAND`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEMENUITEMINFOA` (
    public var `cbSize`: UInt,
    public var `fType`: UInt,
    public var `fState`: UInt,
    public var `wID`: UInt,
    public var `hbmpChecked`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmpUnchecked`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `dwItemData`: UInt,
    public var `szString`: ByteArray,
    public var `hbmpItem`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEMENUITEMINFOA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `IMEMENUITEMINFOA`.Companion.`default`() : `IMEMENUITEMINFOA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEMENUITEMINFOW` (
    public var `cbSize`: UInt,
    public var `fType`: UInt,
    public var `fState`: UInt,
    public var `wID`: UInt,
    public var `hbmpChecked`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmpUnchecked`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `dwItemData`: UInt,
    public var `szString`: UShortArray,
    public var `hbmpItem`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEMENUITEMINFOW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `IMEMENUITEMINFOW`.Companion.`default`() : `IMEMENUITEMINFOW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `IMEMENUITEM_STRING_SIZE`: UInt = 80u;
public const val `IMEMOUSERET_NOTHANDLED`: Int = -1;
public const val `IMEMOUSE_LDOWN`: UInt = 1u;
public const val `IMEMOUSE_MDOWN`: UInt = 4u;
public const val `IMEMOUSE_NONE`: UInt = 0u;
public const val `IMEMOUSE_RDOWN`: UInt = 2u;
public const val `IMEMOUSE_VERSION`: UInt = 255u;
public const val `IMEMOUSE_WDOWN`: UInt = 32u;
public const val `IMEMOUSE_WUP`: UInt = 16u;
public const val `IMEPADCTRL_CARETBACKSPACE`: UInt = 10u;
public const val `IMEPADCTRL_CARETBOTTOM`: UInt = 9u;
public const val `IMEPADCTRL_CARETDELETE`: UInt = 11u;
public const val `IMEPADCTRL_CARETLEFT`: UInt = 6u;
public const val `IMEPADCTRL_CARETRIGHT`: UInt = 7u;
public const val `IMEPADCTRL_CARETSET`: UInt = 5u;
public const val `IMEPADCTRL_CARETTOP`: UInt = 8u;
public const val `IMEPADCTRL_CLEARALL`: UInt = 4u;
public const val `IMEPADCTRL_CONVERTALL`: UInt = 1u;
public const val `IMEPADCTRL_DETERMINALL`: UInt = 2u;
public const val `IMEPADCTRL_DETERMINCHAR`: UInt = 3u;
public const val `IMEPADCTRL_INSERTFULLSPACE`: UInt = 14u;
public const val `IMEPADCTRL_INSERTHALFSPACE`: UInt = 15u;
public const val `IMEPADCTRL_INSERTSPACE`: UInt = 13u;
public const val `IMEPADCTRL_OFFIME`: UInt = 17u;
public const val `IMEPADCTRL_OFFPRECONVERSION`: UInt = 19u;
public const val `IMEPADCTRL_ONIME`: UInt = 16u;
public const val `IMEPADCTRL_ONPRECONVERSION`: UInt = 18u;
public const val `IMEPADCTRL_PHONETICCANDIDATE`: UInt = 20u;
public const val `IMEPADCTRL_PHRASEDELETE`: UInt = 12u;
public const val `IMEPADREQ_CHANGESTRING`: `IME_PAD_REQUEST_FLAGS` = 4113u;
public const val `IMEPADREQ_CHANGESTRINGCANDIDATEINFO`: UInt = 4111u;
public const val `IMEPADREQ_CHANGESTRINGINFO`: UInt = 4115u;
public const val `IMEPADREQ_DELETESTRING`: `IME_PAD_REQUEST_FLAGS` = 4112u;
public const val `IMEPADREQ_FIRST`: UInt = 4096u;
public const val `IMEPADREQ_FORCEIMEPADWINDOWSHOW`: `IME_PAD_REQUEST_FLAGS` = 4117u;
public const val `IMEPADREQ_GETAPPLETDATA`: UInt = 4106u;
public const val `IMEPADREQ_GETAPPLETUISTYLE`: `IME_PAD_REQUEST_FLAGS` = 4121u;
public const val `IMEPADREQ_GETAPPLHWND`: `IME_PAD_REQUEST_FLAGS` = 4116u;
public const val `IMEPADREQ_GETCOMPOSITIONSTRING`: `IME_PAD_REQUEST_FLAGS` = 4102u;
public const val `IMEPADREQ_GETCOMPOSITIONSTRINGID`: UInt = 4109u;
public const val `IMEPADREQ_GETCOMPOSITIONSTRINGINFO`: `IME_PAD_REQUEST_FLAGS` = 4108u;
public const val `IMEPADREQ_GETCONVERSIONSTATUS`: `IME_PAD_REQUEST_FLAGS` = 4126u;
public const val `IMEPADREQ_GETCURRENTIMEINFO`: `IME_PAD_REQUEST_FLAGS` = 4128u;
public const val `IMEPADREQ_GETCURRENTUILANGID`: UInt = 4120u;
public const val `IMEPADREQ_GETDEFAULTUILANGID`: `IME_PAD_REQUEST_FLAGS` = 4119u;
public const val `IMEPADREQ_GETSELECTEDSTRING`: UInt = 4103u;
public const val `IMEPADREQ_GETVERSION`: `IME_PAD_REQUEST_FLAGS` = 4127u;
public const val `IMEPADREQ_INSERTITEMCANDIDATE`: UInt = 4099u;
public const val `IMEPADREQ_INSERTSTRING`: `IME_PAD_REQUEST_FLAGS` = 4097u;
public const val `IMEPADREQ_INSERTSTRINGCANDIDATE`: UInt = 4098u;
public const val `IMEPADREQ_INSERTSTRINGCANDIDATEINFO`: UInt = 4110u;
public const val `IMEPADREQ_INSERTSTRINGINFO`: UInt = 4114u;
public const val `IMEPADREQ_ISAPPLETACTIVE`: `IME_PAD_REQUEST_FLAGS` = 4123u;
public const val `IMEPADREQ_ISIMEPADWINDOWVISIBLE`: `IME_PAD_REQUEST_FLAGS` = 4124u;
public const val `IMEPADREQ_POSTMODALNOTIFY`: `IME_PAD_REQUEST_FLAGS` = 4118u;
public const val `IMEPADREQ_SENDCONTROL`: `IME_PAD_REQUEST_FLAGS` = 4100u;
public const val `IMEPADREQ_SENDKEYCONTROL`: UInt = 4101u;
public const val `IMEPADREQ_SETAPPLETDATA`: UInt = 4105u;
public const val `IMEPADREQ_SETAPPLETMINMAXSIZE`: `IME_PAD_REQUEST_FLAGS` = 4125u;
public const val `IMEPADREQ_SETAPPLETSIZE`: `IME_PAD_REQUEST_FLAGS` = 4104u;
public const val `IMEPADREQ_SETAPPLETUISTYLE`: `IME_PAD_REQUEST_FLAGS` = 4122u;
public const val `IMEPADREQ_SETTITLEFONT`: UInt = 4107u;
public const val `IMEPN_ACTIVATE`: UInt = 257u;
public const val `IMEPN_APPLYCAND`: UInt = 267u;
public const val `IMEPN_APPLYCANDEX`: UInt = 268u;
public const val `IMEPN_CONFIG`: UInt = 264u;
public const val `IMEPN_FIRST`: UInt = 256u;
public const val `IMEPN_HELP`: UInt = 265u;
public const val `IMEPN_HIDE`: UInt = 261u;
public const val `IMEPN_INACTIVATE`: UInt = 258u;
public const val `IMEPN_QUERYCAND`: UInt = 266u;
public const val `IMEPN_SETTINGCHANGED`: UInt = 269u;
public const val `IMEPN_SHOW`: UInt = 260u;
public const val `IMEPN_SIZECHANGED`: UInt = 263u;
public const val `IMEPN_SIZECHANGING`: UInt = 262u;
public const val `IMEPN_USER`: UInt = 356u;
public typealias `IMEREG` = Int;
public typealias `IMEREL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMESHF` (
    public var `cbShf`: UShort,
    public var `verDic`: UShort,
    public var `szTitle`: ByteArray,
    public var `szDescription`: ByteArray,
    public var `szCopyright`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMESHF`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMESHF`.Companion.`default`() : `IMESHF` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMESTRINGCANDIDATE` (
    public var `uCount`: UInt,
    public var `lpwstr`: Array<`windows_sys`.`core`.`PWSTR`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMESTRINGCANDIDATE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMESTRINGCANDIDATE`.Companion.`default`() : `IMESTRINGCANDIDATE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMESTRINGCANDIDATEINFO` (
    public var `dwFarEastId`: UInt,
    public var `lpFarEastInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEFAREASTINFO`>?,
    public var `fInfoMask`: UInt,
    public var `iSelIndex`: Int,
    public var `uCount`: UInt,
    public var `lpwstr`: Array<`windows_sys`.`core`.`PWSTR`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMESTRINGCANDIDATEINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMESTRINGCANDIDATEINFO`.Companion.`default`() : `IMESTRINGCANDIDATEINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMESTRINGINFO` (
    public var `dwFarEastId`: UInt,
    public var `lpwstr`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMESTRINGINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMESTRINGINFO`.Companion.`default`() : `IMESTRINGINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `IMEUCT` = Int;
public const val `IMEVER_0310`: UInt = 196618u;
public const val `IMEVER_0400`: UInt = 262144u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEWRD` (
    public var `pwchReading`: `windows_sys`.`core`.`PWSTR`,
    public var `pwchDisplay`: `windows_sys`.`core`.`PWSTR`,
    public var `Anonymous`: `IMEWRD_0`,
    public var `rgulAttrs`: UIntArray,
    public var `cbComment`: Int,
    public var `uct`: `IMEUCT`,
    public var `pvComment`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEWRD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEWRD`.Companion.`default`() : `IMEWRD` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 962:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union IMEWRD_0 {
//     pub ulPos: u32,
//     pub Anonymous: IMEWRD_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IMEWRD_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IMEWRD_0`.Companion.`default`() : `IMEWRD_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMEWRD_0_0` (
    public var `nPos1`: UShort,
    public var `nPos2`: UShort,
)
public const val `IME_CAND_CODE`: UInt = 2u;
public const val `IME_CAND_MEANING`: UInt = 3u;
public const val `IME_CAND_RADICAL`: UInt = 4u;
public const val `IME_CAND_READ`: UInt = 1u;
public const val `IME_CAND_STROKE`: UInt = 5u;
public const val `IME_CAND_UNKNOWN`: UInt = 0u;
public const val `IME_CHOTKEY_IME_NONIME_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 16u;
public const val `IME_CHOTKEY_SHAPE_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 17u;
public const val `IME_CHOTKEY_SYMBOL_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 18u;
public const val `IME_CMODE_ALPHANUMERIC`: `IME_CONVERSION_MODE` = 0u;
public const val `IME_CMODE_CHARCODE`: `IME_CONVERSION_MODE` = 32u;
public const val `IME_CMODE_CHINESE`: `IME_CONVERSION_MODE` = 1u;
public const val `IME_CMODE_EUDC`: `IME_CONVERSION_MODE` = 512u;
public const val `IME_CMODE_FIXED`: `IME_CONVERSION_MODE` = 2048u;
public const val `IME_CMODE_FULLSHAPE`: `IME_CONVERSION_MODE` = 8u;
public const val `IME_CMODE_HANGEUL`: `IME_CONVERSION_MODE` = 1u;
public const val `IME_CMODE_HANGUL`: `IME_CONVERSION_MODE` = 1u;
public const val `IME_CMODE_HANJACONVERT`: `IME_CONVERSION_MODE` = 64u;
public const val `IME_CMODE_JAPANESE`: `IME_CONVERSION_MODE` = 1u;
public const val `IME_CMODE_KATAKANA`: `IME_CONVERSION_MODE` = 2u;
public const val `IME_CMODE_LANGUAGE`: `IME_CONVERSION_MODE` = 3u;
public const val `IME_CMODE_NATIVE`: `IME_CONVERSION_MODE` = 1u;
public const val `IME_CMODE_NATIVESYMBOL`: `IME_CONVERSION_MODE` = 128u;
public const val `IME_CMODE_NOCONVERSION`: `IME_CONVERSION_MODE` = 256u;
public const val `IME_CMODE_RESERVED`: `IME_CONVERSION_MODE` = 4026531840u;
public const val `IME_CMODE_ROMAN`: `IME_CONVERSION_MODE` = 16u;
public const val `IME_CMODE_SOFTKBD`: `IME_CONVERSION_MODE` = 128u;
public const val `IME_CMODE_SYMBOL`: `IME_CONVERSION_MODE` = 1024u;
public typealias `IME_COMPOSITION_STRING` = UInt;
public const val `IME_CONFIG_GENERAL`: UInt = 1u;
public const val `IME_CONFIG_REGISTERWORD`: UInt = 2u;
public const val `IME_CONFIG_SELECTDICTIONARY`: UInt = 3u;
public typealias `IME_CONVERSION_MODE` = UInt;
public typealias `IME_ESCAPE` = UInt;
public const val `IME_ESC_AUTOMATA`: `IME_ESCAPE` = 4105u;
public const val `IME_ESC_GETHELPFILENAME`: `IME_ESCAPE` = 4107u;
public const val `IME_ESC_GET_EUDC_DICTIONARY`: `IME_ESCAPE` = 4099u;
public const val `IME_ESC_HANJA_MODE`: `IME_ESCAPE` = 4104u;
public const val `IME_ESC_IME_NAME`: `IME_ESCAPE` = 4102u;
public const val `IME_ESC_MAX_KEY`: `IME_ESCAPE` = 4101u;
public const val `IME_ESC_PRIVATE_FIRST`: `IME_ESCAPE` = 2048u;
public const val `IME_ESC_PRIVATE_HOTKEY`: `IME_ESCAPE` = 4106u;
public const val `IME_ESC_PRIVATE_LAST`: `IME_ESCAPE` = 4095u;
public const val `IME_ESC_QUERY_SUPPORT`: `IME_ESCAPE` = 3u;
public const val `IME_ESC_RESERVED_FIRST`: `IME_ESCAPE` = 4u;
public const val `IME_ESC_RESERVED_LAST`: `IME_ESCAPE` = 2047u;
public const val `IME_ESC_SEQUENCE_TO_INTERNAL`: `IME_ESCAPE` = 4097u;
public const val `IME_ESC_SET_EUDC_DICTIONARY`: `IME_ESCAPE` = 4100u;
public const val `IME_ESC_STRING_BUFFER_SIZE`: UInt = 80u;
public const val `IME_ESC_SYNC_HOTKEY`: `IME_ESCAPE` = 4103u;
public const val `IME_HOTKEY_DSWITCH_FIRST`: UInt = 256u;
public const val `IME_HOTKEY_DSWITCH_LAST`: UInt = 287u;
public typealias `IME_HOTKEY_IDENTIFIER` = UInt;
public const val `IME_HOTKEY_PRIVATE_FIRST`: UInt = 512u;
public const val `IME_HOTKEY_PRIVATE_LAST`: UInt = 543u;
public const val `IME_ITHOTKEY_PREVIOUS_COMPOSITION`: `IME_HOTKEY_IDENTIFIER` = 513u;
public const val `IME_ITHOTKEY_RECONVERTSTRING`: `IME_HOTKEY_IDENTIFIER` = 515u;
public const val `IME_ITHOTKEY_RESEND_RESULTSTR`: `IME_HOTKEY_IDENTIFIER` = 512u;
public const val `IME_ITHOTKEY_UISTYLE_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 514u;
public const val `IME_JHOTKEY_CLOSE_OPEN`: `IME_HOTKEY_IDENTIFIER` = 48u;
public const val `IME_KHOTKEY_ENGLISH`: `IME_HOTKEY_IDENTIFIER` = 82u;
public const val `IME_KHOTKEY_HANJACONVERT`: `IME_HOTKEY_IDENTIFIER` = 81u;
public const val `IME_KHOTKEY_SHAPE_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 80u;
public typealias `IME_PAD_REQUEST_FLAGS` = UInt;
public const val `IME_PROP_ACCEPT_WIDE_VKEY`: UInt = 32u;
public const val `IME_PROP_AT_CARET`: UInt = 65536u;
public const val `IME_PROP_CANDLIST_START_FROM_1`: UInt = 262144u;
public const val `IME_PROP_COMPLETE_ON_UNSELECT`: UInt = 1048576u;
public const val `IME_PROP_END_UNLOAD`: UInt = 1u;
public const val `IME_PROP_IGNORE_UPKEYS`: UInt = 4u;
public const val `IME_PROP_KBD_CHAR_FIRST`: UInt = 2u;
public const val `IME_PROP_NEED_ALTKEY`: UInt = 8u;
public const val `IME_PROP_NO_KEYS_ON_CLOSE`: UInt = 16u;
public const val `IME_PROP_SPECIAL_UI`: UInt = 131072u;
public const val `IME_PROP_UNICODE`: UInt = 524288u;
public const val `IME_REGWORD_STYLE_EUDC`: UInt = 1u;
public const val `IME_REGWORD_STYLE_USER_FIRST`: UInt = 2147483648u;
public const val `IME_REGWORD_STYLE_USER_LAST`: UInt = 4294967295u;
public typealias `IME_SENTENCE_MODE` = UInt;
public const val `IME_SMODE_AUTOMATIC`: `IME_SENTENCE_MODE` = 4u;
public const val `IME_SMODE_CONVERSATION`: `IME_SENTENCE_MODE` = 16u;
public const val `IME_SMODE_NONE`: `IME_SENTENCE_MODE` = 0u;
public const val `IME_SMODE_PHRASEPREDICT`: `IME_SENTENCE_MODE` = 8u;
public const val `IME_SMODE_PLAURALCLAUSE`: `IME_SENTENCE_MODE` = 1u;
public const val `IME_SMODE_RESERVED`: `IME_SENTENCE_MODE` = 61440u;
public const val `IME_SMODE_SINGLECONVERT`: `IME_SENTENCE_MODE` = 2u;
public const val `IME_SYSINFO_WINLOGON`: UInt = 1u;
public const val `IME_THOTKEY_IME_NONIME_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 112u;
public const val `IME_THOTKEY_SHAPE_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 113u;
public const val `IME_THOTKEY_SYMBOL_TOGGLE`: `IME_HOTKEY_IDENTIFIER` = 114u;
public const val `IME_UI_CLASS_NAME_SIZE`: UInt = 16u;
public const val `IMFT_RADIOCHECK`: UInt = 1u;
public const val `IMFT_SEPARATOR`: UInt = 2u;
public const val `IMFT_SUBMENU`: UInt = 4u;
public const val `IMMGWLP_IMC`: UInt = 0u;
public const val `IMMGWL_IMC`: UInt = 0u;
public const val `IMM_ERROR_GENERAL`: Int = -2;
public const val `IMM_ERROR_NODATA`: Int = -1;
public const val `IMN_CHANGECANDIDATE`: UInt = 3u;
public const val `IMN_CLOSECANDIDATE`: UInt = 4u;
public const val `IMN_CLOSESTATUSWINDOW`: UInt = 1u;
public const val `IMN_GUIDELINE`: UInt = 13u;
public const val `IMN_OPENCANDIDATE`: UInt = 5u;
public const val `IMN_OPENSTATUSWINDOW`: UInt = 2u;
public const val `IMN_PRIVATE`: UInt = 14u;
public const val `IMN_SETCANDIDATEPOS`: UInt = 9u;
public const val `IMN_SETCOMPOSITIONFONT`: UInt = 10u;
public const val `IMN_SETCOMPOSITIONWINDOW`: UInt = 11u;
public const val `IMN_SETCONVERSIONMODE`: UInt = 6u;
public const val `IMN_SETOPENSTATUS`: UInt = 8u;
public const val `IMN_SETSENTENCEMODE`: UInt = 7u;
public const val `IMN_SETSTATUSWINDOWPOS`: UInt = 12u;
public const val `IMN_SOFTKBDDESTROYED`: UInt = 17u;
public const val `IMR_CANDIDATEWINDOW`: UInt = 2u;
public const val `IMR_COMPOSITIONFONT`: UInt = 3u;
public const val `IMR_COMPOSITIONWINDOW`: UInt = 1u;
public const val `IMR_CONFIRMRECONVERTSTRING`: UInt = 5u;
public const val `IMR_DOCUMENTFEED`: UInt = 7u;
public const val `IMR_QUERYCHARPOSITION`: UInt = 6u;
public const val `IMR_RECONVERTSTRING`: UInt = 4u;
public const val `INFOMASK_APPLY_CAND`: UInt = 2u;
public const val `INFOMASK_APPLY_CAND_EX`: UInt = 4u;
public const val `INFOMASK_BLOCK_CAND`: UInt = 262144u;
public const val `INFOMASK_HIDE_CAND`: UInt = 131072u;
public const val `INFOMASK_NONE`: UInt = 0u;
public const val `INFOMASK_QUERY_CAND`: UInt = 1u;
public const val `INFOMASK_STRING_FIX`: UInt = 65536u;
public const val `INIT_COMPFORM`: UInt = 16u;
public const val `INIT_CONVERSION`: UInt = 2u;
public const val `INIT_LOGFONT`: UInt = 8u;
public const val `INIT_SENTENCE`: UInt = 4u;
public const val `INIT_SOFTKBDPOS`: UInt = 32u;
public const val `INIT_STATUSWNDPOS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INPUTCONTEXT` (
    public var `hWnd`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `fOpen`: `windows_sys`.`core`.`BOOL`,
    public var `ptStatusWndPos`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `ptSoftKbdPos`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `fdwConversion`: UInt,
    public var `fdwSentence`: UInt,
    public var `lfFont`: `INPUTCONTEXT_0`,
    public var `cfCompForm`: `COMPOSITIONFORM`,
    public var `cfCandForm`: Array<`CANDIDATEFORM`>,
    public var `hCompStr`: `HIMCC`,
    public var `hCandInfo`: `HIMCC`,
    public var `hGuideLine`: `HIMCC`,
    public var `hPrivate`: `HIMCC`,
    public var `dwNumMsgBuf`: UInt,
    public var `hMsgBuf`: `HIMCC`,
    public var `fdwInit`: UInt,
    public var `dwReserve`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `INPUTCONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `INPUTCONTEXT`.Companion.`default`() : `INPUTCONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1140:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub union INPUTCONTEXT_0 {
//     pub A: super::super::super::Graphics::Gdi::LOGFONTA,
//     pub W: super::super::super::Graphics::Gdi::LOGFONTW,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `INPUTCONTEXT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `INPUTCONTEXT_0`.Companion.`default`() : `INPUTCONTEXT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `IPACFG_CATEGORY`: Int = 262144;
public const val `IPACFG_HELP`: Int = 2;
public const val `IPACFG_LANG`: Int = 16;
public const val `IPACFG_NONE`: Int = 0;
public const val `IPACFG_PROPERTY`: Int = 1;
public const val `IPACFG_TITLE`: Int = 65536;
public const val `IPACFG_TITLEFONTFACE`: Int = 131072;
public const val `IPACID_CHARLIST`: UInt = 9u;
public const val `IPACID_EPWING`: UInt = 7u;
public const val `IPACID_HANDWRITING`: UInt = 2u;
public const val `IPACID_NONE`: UInt = 0u;
public const val `IPACID_OCR`: UInt = 8u;
public const val `IPACID_RADICALSEARCH`: UInt = 4u;
public const val `IPACID_SOFTKEY`: UInt = 1u;
public const val `IPACID_STROKESEARCH`: UInt = 3u;
public const val `IPACID_SYMBOLSEARCH`: UInt = 5u;
public const val `IPACID_USER`: UInt = 256u;
public const val `IPACID_VOICE`: UInt = 6u;
public const val `IPAWS_ENABLED`: Int = 1;
public const val `IPAWS_HORIZONTALFIXED`: Int = 512;
public const val `IPAWS_MAXHEIGHTFIXED`: Int = 8192;
public const val `IPAWS_MAXSIZEFIXED`: Int = 12288;
public const val `IPAWS_MAXWIDTHFIXED`: Int = 4096;
public const val `IPAWS_MINHEIGHTFIXED`: Int = 131072;
public const val `IPAWS_MINSIZEFIXED`: Int = 196608;
public const val `IPAWS_MINWIDTHFIXED`: Int = 65536;
public const val `IPAWS_SIZEFIXED`: Int = 768;
public const val `IPAWS_SIZINGNOTIFY`: Int = 4;
public const val `IPAWS_VERTICALFIXED`: Int = 256;
public const val `ISC_SHOWUIALL`: UInt = 3221225487u;
public const val `ISC_SHOWUIALLCANDIDATEWINDOW`: UInt = 15u;
public const val `ISC_SHOWUICANDIDATEWINDOW`: UInt = 1u;
public const val `ISC_SHOWUICOMPOSITIONWINDOW`: UInt = 2147483648u;
public const val `ISC_SHOWUIGUIDELINE`: UInt = 1073741824u;
public const val `JPOS_1DAN`: UInt = 213u;
public const val `JPOS_4DAN_HA`: UInt = 212u;
public const val `JPOS_5DAN_AWA`: UInt = 200u;
public const val `JPOS_5DAN_AWAUON`: UInt = 209u;
public const val `JPOS_5DAN_BA`: UInt = 206u;
public const val `JPOS_5DAN_GA`: UInt = 202u;
public const val `JPOS_5DAN_KA`: UInt = 201u;
public const val `JPOS_5DAN_KASOKUON`: UInt = 210u;
public const val `JPOS_5DAN_MA`: UInt = 207u;
public const val `JPOS_5DAN_NA`: UInt = 205u;
public const val `JPOS_5DAN_RA`: UInt = 208u;
public const val `JPOS_5DAN_RAHEN`: UInt = 211u;
public const val `JPOS_5DAN_SA`: UInt = 203u;
public const val `JPOS_5DAN_TA`: UInt = 204u;
public const val `JPOS_BUPPIN`: UInt = 122u;
public const val `JPOS_CHIMEI`: UInt = 109u;
public const val `JPOS_CHIMEI_EKI`: UInt = 117u;
public const val `JPOS_CHIMEI_GUN`: UInt = 112u;
public const val `JPOS_CHIMEI_KEN`: UInt = 111u;
public const val `JPOS_CHIMEI_KU`: UInt = 113u;
public const val `JPOS_CHIMEI_KUNI`: UInt = 110u;
public const val `JPOS_CHIMEI_MACHI`: UInt = 115u;
public const val `JPOS_CHIMEI_MURA`: UInt = 116u;
public const val `JPOS_CHIMEI_SHI`: UInt = 114u;
public const val `JPOS_CLOSEBRACE`: UInt = 911u;
public const val `JPOS_DAIMEISHI`: UInt = 123u;
public const val `JPOS_DAIMEISHI_NINSHOU`: UInt = 124u;
public const val `JPOS_DAIMEISHI_SHIJI`: UInt = 125u;
public const val `JPOS_DOKURITSUGO`: UInt = 903u;
public const val `JPOS_EIJI`: UInt = 906u;
public const val `JPOS_FUKUSHI`: UInt = 500u;
public const val `JPOS_FUKUSHI_DA`: UInt = 504u;
public const val `JPOS_FUKUSHI_NANO`: UInt = 503u;
public const val `JPOS_FUKUSHI_NI`: UInt = 502u;
public const val `JPOS_FUKUSHI_SAHEN`: UInt = 501u;
public const val `JPOS_FUKUSHI_TO`: UInt = 505u;
public const val `JPOS_FUKUSHI_TOSURU`: UInt = 506u;
public const val `JPOS_FUTEIGO`: UInt = 904u;
public const val `JPOS_HUKUSIMEISHI`: UInt = 104u;
public const val `JPOS_JINMEI`: UInt = 106u;
public const val `JPOS_JINMEI_MEI`: UInt = 108u;
public const val `JPOS_JINMEI_SEI`: UInt = 107u;
public const val `JPOS_KANDOUSHI`: UInt = 670u;
public const val `JPOS_KANJI`: UInt = 909u;
public const val `JPOS_KANYOUKU`: UInt = 902u;
public const val `JPOS_KAZU`: UInt = 126u;
public const val `JPOS_KAZU_SURYOU`: UInt = 127u;
public const val `JPOS_KAZU_SUSHI`: UInt = 128u;
public const val `JPOS_KEIDOU`: UInt = 400u;
public const val `JPOS_KEIDOU_GARU`: UInt = 403u;
public const val `JPOS_KEIDOU_NO`: UInt = 401u;
public const val `JPOS_KEIDOU_TARU`: UInt = 402u;
public const val `JPOS_KEIYOU`: UInt = 300u;
public const val `JPOS_KEIYOU_GARU`: UInt = 301u;
public const val `JPOS_KEIYOU_GE`: UInt = 302u;
public const val `JPOS_KEIYOU_ME`: UInt = 303u;
public const val `JPOS_KEIYOU_U`: UInt = 305u;
public const val `JPOS_KEIYOU_YUU`: UInt = 304u;
public const val `JPOS_KENCHIKU`: UInt = 121u;
public const val `JPOS_KIGOU`: UInt = 905u;
public const val `JPOS_KURU_KI`: UInt = 219u;
public const val `JPOS_KURU_KITA`: UInt = 220u;
public const val `JPOS_KURU_KITARA`: UInt = 221u;
public const val `JPOS_KURU_KITARI`: UInt = 222u;
public const val `JPOS_KURU_KITAROU`: UInt = 223u;
public const val `JPOS_KURU_KITE`: UInt = 224u;
public const val `JPOS_KURU_KO`: UInt = 226u;
public const val `JPOS_KURU_KOI`: UInt = 227u;
public const val `JPOS_KURU_KOYOU`: UInt = 228u;
public const val `JPOS_KURU_KUREBA`: UInt = 225u;
public const val `JPOS_KUTEN`: UInt = 907u;
public const val `JPOS_MEISA_KEIDOU`: UInt = 105u;
public const val `JPOS_MEISHI_FUTSU`: UInt = 100u;
public const val `JPOS_MEISHI_KEIYOUDOUSHI`: UInt = 103u;
public const val `JPOS_MEISHI_SAHEN`: UInt = 101u;
public const val `JPOS_MEISHI_ZAHEN`: UInt = 102u;
public const val `JPOS_OPENBRACE`: UInt = 910u;
public const val `JPOS_RENTAISHI`: UInt = 600u;
public const val `JPOS_RENTAISHI_SHIJI`: UInt = 601u;
public const val `JPOS_RENYOU_SETSUBI`: UInt = 826u;
public const val `JPOS_SETSUBI`: UInt = 800u;
public const val `JPOS_SETSUBI_CHIMEI`: UInt = 811u;
public const val `JPOS_SETSUBI_CHOU`: UInt = 818u;
public const val `JPOS_SETSUBI_CHU`: UInt = 804u;
public const val `JPOS_SETSUBI_DONO`: UInt = 835u;
public const val `JPOS_SETSUBI_EKI`: UInt = 821u;
public const val `JPOS_SETSUBI_FU`: UInt = 805u;
public const val `JPOS_SETSUBI_FUKUSU`: UInt = 836u;
public const val `JPOS_SETSUBI_GUN`: UInt = 814u;
public const val `JPOS_SETSUBI_JIKAN`: UInt = 829u;
public const val `JPOS_SETSUBI_JIKANPLUS`: UInt = 830u;
public const val `JPOS_SETSUBI_JINMEI`: UInt = 810u;
public const val `JPOS_SETSUBI_JOSUSHI`: UInt = 827u;
public const val `JPOS_SETSUBI_JOSUSHIPLUS`: UInt = 828u;
public const val `JPOS_SETSUBI_KA`: UInt = 803u;
public const val `JPOS_SETSUBI_KATA`: UInt = 808u;
public const val `JPOS_SETSUBI_KEN`: UInt = 813u;
public const val `JPOS_SETSUBI_KENCHIKU`: UInt = 825u;
public const val `JPOS_SETSUBI_KU`: UInt = 815u;
public const val `JPOS_SETSUBI_KUN`: UInt = 833u;
public const val `JPOS_SETSUBI_KUNI`: UInt = 812u;
public const val `JPOS_SETSUBI_MACHI`: UInt = 817u;
public const val `JPOS_SETSUBI_MEISHIRENDAKU`: UInt = 809u;
public const val `JPOS_SETSUBI_MURA`: UInt = 819u;
public const val `JPOS_SETSUBI_RA`: UInt = 838u;
public const val `JPOS_SETSUBI_RYU`: UInt = 806u;
public const val `JPOS_SETSUBI_SAMA`: UInt = 834u;
public const val `JPOS_SETSUBI_SAN`: UInt = 832u;
public const val `JPOS_SETSUBI_SEI`: UInt = 802u;
public const val `JPOS_SETSUBI_SHAMEI`: UInt = 823u;
public const val `JPOS_SETSUBI_SHI`: UInt = 816u;
public const val `JPOS_SETSUBI_SON`: UInt = 820u;
public const val `JPOS_SETSUBI_SONOTA`: UInt = 822u;
public const val `JPOS_SETSUBI_SOSHIKI`: UInt = 824u;
public const val `JPOS_SETSUBI_TACHI`: UInt = 837u;
public const val `JPOS_SETSUBI_TEINEI`: UInt = 831u;
public const val `JPOS_SETSUBI_TEKI`: UInt = 801u;
public const val `JPOS_SETSUBI_YOU`: UInt = 807u;
public const val `JPOS_SETSUZOKUSHI`: UInt = 650u;
public const val `JPOS_SETTOU`: UInt = 700u;
public const val `JPOS_SETTOU_CHIMEI`: UInt = 710u;
public const val `JPOS_SETTOU_CHOUTAN`: UInt = 707u;
public const val `JPOS_SETTOU_DAISHOU`: UInt = 705u;
public const val `JPOS_SETTOU_FUKU`: UInt = 703u;
public const val `JPOS_SETTOU_JINMEI`: UInt = 709u;
public const val `JPOS_SETTOU_JOSUSHI`: UInt = 712u;
public const val `JPOS_SETTOU_KAKU`: UInt = 701u;
public const val `JPOS_SETTOU_KOUTEI`: UInt = 706u;
public const val `JPOS_SETTOU_MI`: UInt = 704u;
public const val `JPOS_SETTOU_SAI`: UInt = 702u;
public const val `JPOS_SETTOU_SHINKYU`: UInt = 708u;
public const val `JPOS_SETTOU_SONOTA`: UInt = 711u;
public const val `JPOS_SETTOU_TEINEI_GO`: UInt = 714u;
public const val `JPOS_SETTOU_TEINEI_O`: UInt = 713u;
public const val `JPOS_SETTOU_TEINEI_ON`: UInt = 715u;
public const val `JPOS_SHAMEI`: UInt = 119u;
public const val `JPOS_SONOTA`: UInt = 118u;
public const val `JPOS_SOSHIKI`: UInt = 120u;
public const val `JPOS_SURU_SA`: UInt = 229u;
public const val `JPOS_SURU_SE`: UInt = 238u;
public const val `JPOS_SURU_SEYO`: UInt = 239u;
public const val `JPOS_SURU_SI`: UInt = 230u;
public const val `JPOS_SURU_SIATRI`: UInt = 233u;
public const val `JPOS_SURU_SITA`: UInt = 231u;
public const val `JPOS_SURU_SITARA`: UInt = 232u;
public const val `JPOS_SURU_SITAROU`: UInt = 234u;
public const val `JPOS_SURU_SITE`: UInt = 235u;
public const val `JPOS_SURU_SIYOU`: UInt = 236u;
public const val `JPOS_SURU_SUREBA`: UInt = 237u;
public const val `JPOS_TANKANJI`: UInt = 900u;
public const val `JPOS_TANKANJI_KAO`: UInt = 901u;
public const val `JPOS_TANSHUKU`: UInt = 913u;
public const val `JPOS_TOKUSHU_KAHEN`: UInt = 214u;
public const val `JPOS_TOKUSHU_NAHEN`: UInt = 218u;
public const val `JPOS_TOKUSHU_SAHEN`: UInt = 216u;
public const val `JPOS_TOKUSHU_SAHENSURU`: UInt = 215u;
public const val `JPOS_TOKUSHU_ZAHEN`: UInt = 217u;
public const val `JPOS_TOUTEN`: UInt = 908u;
public const val `JPOS_UNDEFINED`: UInt = 0u;
public const val `JPOS_YOKUSEI`: UInt = 912u;
public const val `MAX_APPLETTITLE`: UInt = 64u;
public const val `MAX_FONTFACE`: UInt = 32u;
public const val `MODEBIASMODE_DEFAULT`: UInt = 0u;
public const val `MODEBIASMODE_DIGIT`: UInt = 4u;
public const val `MODEBIASMODE_FILENAME`: UInt = 1u;
public const val `MODEBIASMODE_READING`: UInt = 2u;
public const val `MODEBIAS_GETVALUE`: UInt = 2u;
public const val `MODEBIAS_GETVERSION`: UInt = 0u;
public const val `MODEBIAS_SETVALUE`: UInt = 1u;
public const val `MOD_IGNORE_ALL_MODIFIER`: UInt = 1024u;
public const val `MOD_LEFT`: UInt = 32768u;
public const val `MOD_ON_KEYUP`: UInt = 2048u;
public const val `MOD_RIGHT`: UInt = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MORRSLT` (
    public var `dwSize`: UInt,
    public var `pwchOutput`: `windows_sys`.`core`.`PWSTR`,
    public var `cchOutput`: UShort,
    public var `Anonymous1`: `MORRSLT_0`,
    public var `Anonymous2`: `MORRSLT_1`,
    public var `pchInputPos`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `pchOutputIdxWDD`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `Anonymous3`: `MORRSLT_2`,
    public var `paMonoRubyPos`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?,
    public var `pWDD`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WDD`>?,
    public var `cWDD`: Int,
    public var `pPrivate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BLKBuff`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MORRSLT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MORRSLT`.Companion.`default`() : `MORRSLT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1382:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MORRSLT_0 {
//     pub pwchRead: windows_sys::core::PWSTR,
//     pub pwchComp: windows_sys::core::PWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MORRSLT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MORRSLT_0`.Companion.`default`() : `MORRSLT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1393:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MORRSLT_1 {
//     pub cchRead: u16,
//     pub cchComp: u16,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MORRSLT_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MORRSLT_1`.Companion.`default`() : `MORRSLT_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1404:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MORRSLT_2 {
//     pub pchReadIdxWDD: *mut u16,
//     pub pchCompIdxWDD: *mut u16,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MORRSLT_2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MORRSLT_2`.Companion.`default`() : `MORRSLT_2` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `NI_CHANGECANDIDATELIST`: `NOTIFY_IME_ACTION` = 19u;
public const val `NI_CLOSECANDIDATE`: `NOTIFY_IME_ACTION` = 17u;
public const val `NI_COMPOSITIONSTR`: `NOTIFY_IME_ACTION` = 21u;
public const val `NI_CONTEXTUPDATED`: UInt = 3u;
public const val `NI_FINALIZECONVERSIONRESULT`: UInt = 20u;
public const val `NI_IMEMENUSELECTED`: `NOTIFY_IME_ACTION` = 24u;
public const val `NI_OPENCANDIDATE`: `NOTIFY_IME_ACTION` = 16u;
public const val `NI_SELECTCANDIDATESTR`: `NOTIFY_IME_ACTION` = 18u;
public const val `NI_SETCANDIDATE_PAGESIZE`: `NOTIFY_IME_ACTION` = 23u;
public const val `NI_SETCANDIDATE_PAGESTART`: `NOTIFY_IME_ACTION` = 22u;
public typealias `NOTIFY_IME_ACTION` = UInt;
public typealias `NOTIFY_IME_INDEX` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNLOG` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`IMEDP`>?, `windows_sys`.`core`.`HRESULT`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POSTBL` (
    public var `nPos`: UShort,
    public var `szName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `POSTBL`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `POSTBL`.Companion.`default`() : `POSTBL` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `POS_UNDEFINED`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RECONVERTSTRING` (
    public var `dwSize`: UInt,
    public var `dwVersion`: UInt,
    public var `dwStrLen`: UInt,
    public var `dwStrOffset`: UInt,
    public var `dwCompStrLen`: UInt,
    public var `dwCompStrOffset`: UInt,
    public var `dwTargetStrLen`: UInt,
    public var `dwTargetStrOffset`: UInt,
)
public const val `RECONVOPT_NONE`: UInt = 0u;
public const val `RECONVOPT_USECANCELNOTIFY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REGISTERWORDA` (
    public var `lpReading`: `windows_sys`.`core`.`PSTR`,
    public var `lpWord`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `REGISTERWORDA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `REGISTERWORDA`.Companion.`default`() : `REGISTERWORDA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `REGISTERWORDENUMPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UInt, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `REGISTERWORDENUMPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REGISTERWORDW` (
    public var `lpReading`: `windows_sys`.`core`.`PWSTR`,
    public var `lpWord`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `REGISTERWORDW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `REGISTERWORDW`.Companion.`default`() : `REGISTERWORDW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_CHGKEYMAP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEChangeKeyMap");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_DOCUMENTFEED`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEDocumentFeed");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_KEYMAP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEKeyMap");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_MODEBIAS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEModeBias");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_MOUSE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEMouseOperation");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_NTFYKEYMAP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMENotifyKeyMap");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_QUERYPOSITION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEQueryPosition");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_RECONVERT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEReconvert");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_RECONVERTOPTIONS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEReconvertOptions");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_RECONVERTREQUEST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEReconvertRequest");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_SERVICE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEService");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_SHOWIMEPAD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEShowImePad");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RWM_UIREADY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIMEUIReady");
public const val `SCS_CAP_COMPSTR`: UInt = 1u;
public const val `SCS_CAP_MAKEREAD`: UInt = 2u;
public const val `SCS_CAP_SETRECONVERTSTRING`: UInt = 4u;
public const val `SCS_CHANGEATTR`: `SET_COMPOSITION_STRING_TYPE` = 18u;
public const val `SCS_CHANGECLAUSE`: `SET_COMPOSITION_STRING_TYPE` = 36u;
public const val `SCS_QUERYRECONVERTSTRING`: `SET_COMPOSITION_STRING_TYPE` = 131072u;
public const val `SCS_SETRECONVERTSTRING`: `SET_COMPOSITION_STRING_TYPE` = 65536u;
public const val `SCS_SETSTR`: `SET_COMPOSITION_STRING_TYPE` = 9u;
public const val `SELECT_CAP_CONVERSION`: UInt = 1u;
public const val `SELECT_CAP_SENTENCE`: UInt = 2u;
public typealias `SET_COMPOSITION_STRING_TYPE` = UInt;
public const val `SHOWIMEPAD_CATEGORY`: UInt = 1u;
public const val `SHOWIMEPAD_DEFAULT`: UInt = 0u;
public const val `SHOWIMEPAD_GUID`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SOFTKBDDATA` (
    public var `uCount`: UInt,
    public var `wCode`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SOFTKBDDATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SOFTKBDDATA`.Companion.`default`() : `SOFTKBDDATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SOFTKEYBOARD_TYPE_C1`: UInt = 2u;
public const val `SOFTKEYBOARD_TYPE_T1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STYLEBUFA` (
    public var `dwStyle`: UInt,
    public var `szDescription`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STYLEBUFA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STYLEBUFA`.Companion.`default`() : `STYLEBUFA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STYLEBUFW` (
    public var `dwStyle`: UInt,
    public var `szDescription`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `STYLEBUFW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `STYLEBUFW`.Companion.`default`() : `STYLEBUFW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `STYLE_DESCRIPTION_SIZE`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSMSG` (
    public var `message`: UInt,
    public var `wParam`: `super`.`super`.`super`.`Foundation`.`WPARAM`,
    public var `lParam`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSMSGLIST` (
    public var `uMsgCount`: UInt,
    public var `TransMsg`: Array<`TRANSMSG`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TRANSMSGLIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TRANSMSGLIST`.Companion.`default`() : `TRANSMSGLIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `UI_CAP_2700`: UInt = 1u;
public const val `UI_CAP_ROT90`: UInt = 2u;
public const val `UI_CAP_ROTANY`: UInt = 4u;
public const val `UI_CAP_SOFTKBD`: UInt = 65536u;
public const val `VERSION_DOCUMENTFEED`: UInt = 1u;
public const val `VERSION_ID_CHINESE_SIMPLIFIED`: UInt = 134217728u;
public const val `VERSION_ID_CHINESE_TRADITIONAL`: UInt = 67108864u;
public const val `VERSION_ID_JAPANESE`: UInt = 16777216u;
public const val `VERSION_ID_KOREAN`: UInt = 33554432u;
public const val `VERSION_MODEBIAS`: UInt = 1u;
public const val `VERSION_MOUSE_OPERATION`: UInt = 1u;
public const val `VERSION_QUERYPOSITION`: UInt = 1u;
public const val `VERSION_RECONVERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WDD` (
    public var `wDispPos`: UShort,
    public var `Anonymous1`: `WDD_0`,
    public var `cchDisp`: UShort,
    public var `Anonymous2`: `WDD_1`,
    public var `WDD_nReserve1`: UInt,
    public var `nPos`: UShort,
    public var `_bitfield`: UShort,
    public var `pReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WDD`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WDD`.Companion.`default`() : `WDD` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1589:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union WDD_0 {
//     pub wReadPos: u16,
//     pub wCompPos: u16,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WDD_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WDD_0`.Companion.`default`() : `WDD_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1600:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union WDD_1 {
//     pub cchRead: u16,
//     pub cchComp: u16,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WDD_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WDD_1`.Companion.`default`() : `WDD_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `cbCommentMax`: UInt = 256u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `fpCreateIFECommonInstanceType` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `fpCreateIFEDictionaryInstanceType` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `fpCreateIFELanguageInstanceType` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szImeChina`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIME.China");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szImeJapan`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIME.Japan");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szImeKorea`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIME.Korea");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szImeTaiwan`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MSIME.Taiwan");
public const val `wchPrivate1`: UInt = 57344u;
