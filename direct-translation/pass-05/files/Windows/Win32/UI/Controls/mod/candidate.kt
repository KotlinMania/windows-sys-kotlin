// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// pub mod Dialogs;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BeginBufferedAnimation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `BeginBufferedAnimation`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdctarget` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `prctarget` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dwformat` : `BP_BUFFERFORMAT`, `ppaintparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`BP_PAINTPARAMS`>?, `panimationparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`BP_ANIMATIONPARAMS`>?, `phdcfrom` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HDC`>?, `phdcto` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BeginBufferedPaint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `BeginBufferedPaint`(`hdctarget` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `prctarget` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dwformat` : `BP_BUFFERFORMAT`, `ppaintparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`BP_PAINTPARAMS`>?, `phdc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HDC`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BeginPanningFeedback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BeginPanningFeedback`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BufferedPaintClear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BufferedPaintClear`(`hbufferedpaint` : Long, `prc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BufferedPaintInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BufferedPaintInit`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BufferedPaintRenderAnimation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `BufferedPaintRenderAnimation`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdctarget` : `super`.`super`.`Graphics`.`Gdi`.`HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BufferedPaintSetAlpha; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BufferedPaintSetAlpha`(`hbufferedpaint` : Long, `prc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `alpha` : UByte) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BufferedPaintStopAllAnimations; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BufferedPaintStopAllAnimations`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=BufferedPaintUnInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BufferedPaintUnInit`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CheckDlgButton; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckDlgButton`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `nidbutton` : Int, `ucheck` : `DLG_BUTTON_CHECK_STATE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CheckRadioButton; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckRadioButton`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `nidfirstbutton` : Int, `nidlastbutton` : Int, `nidcheckbutton` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=CloseThemeData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseThemeData`(`htheme` : `HTHEME`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=CreateMappedBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CreateMappedBitmap`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `idbitmap` : Long, `wflags` : UInt, `lpcolormap` : /* Rust *const */ kotlinx.cinterop.CPointer<`COLORMAP`>?, `inummaps` : Int) : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=CreatePropertySheetPageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `CreatePropertySheetPageA`(`constpropsheetpagepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPSHEETPAGEA`>?) : `HPROPSHEETPAGE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=CreatePropertySheetPageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `CreatePropertySheetPageW`(`constpropsheetpagepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPSHEETPAGEW`>?) : `HPROPSHEETPAGE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=CreateStatusWindowA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateStatusWindowA`(`style` : Int, `lpsztext` : `windows_sys`.`core`.`PCSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `wid` : UInt) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=CreateStatusWindowW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateStatusWindowW`(`style` : Int, `lpsztext` : `windows_sys`.`core`.`PCWSTR`, `hwndparent` : `super`.`super`.`Foundation`.`HWND`, `wid` : UInt) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CreateSyntheticPointerDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `CreateSyntheticPointerDevice`(`pointertype` : `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`, `maxcount` : UInt, `mode` : `POINTER_FEEDBACK_MODE`) : `HSYNTHETICPOINTERDEVICE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=CreateToolbarEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateToolbarEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ws` : UInt, `wid` : UInt, `nbitmaps` : Int, `hbminst` : `super`.`super`.`Foundation`.`HINSTANCE`, `wbmid` : ULong, `lpbuttons` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TBBUTTON`>?, `inumbuttons` : Int, `dxbutton` : Int, `dybutton` : Int, `dxbitmap` : Int, `dybitmap` : Int, `ustructsize` : UInt) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=CreateUpDownControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateUpDownControl`(`dwstyle` : UInt, `x` : Int, `y` : Int, `cx` : Int, `cy` : Int, `hparent` : `super`.`super`.`Foundation`.`HWND`, `nid` : Int, `hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `hbuddy` : `super`.`super`.`Foundation`.`HWND`, `nupper` : Int, `nlower` : Int, `npos` : Int) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_Clone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_Clone`(`hdpa` : `HDPA`, `hdpanew` : `HDPA`) : `HDPA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_Create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_Create`(`citemgrow` : Int) : `HDPA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_CreateEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_CreateEx`(`cpgrow` : Int, `hheap` : `super`.`super`.`Foundation`.`HANDLE`) : `HDPA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_DeleteAllPtrs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_DeleteAllPtrs`(`hdpa` : `HDPA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_DeletePtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_DeletePtr`(`hdpa` : `HDPA`, `i` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_Destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_Destroy`(`hdpa` : `HDPA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_DestroyCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_DestroyCallback`(`hdpa` : `HDPA`, `pfncb` : `PFNDAENUMCALLBACK`, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_EnumCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_EnumCallback`(`hdpa` : `HDPA`, `pfncb` : `PFNDAENUMCALLBACK`, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_GetPtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_GetPtr`(`hdpa` : `HDPA`, `i` : Long) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_GetPtrIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_GetPtrIndex`(`hdpa` : `HDPA`, `p` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_GetSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_GetSize`(`hdpa` : `HDPA`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_Grow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_Grow`(`pdpa` : `HDPA`, `cp` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_InsertPtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_InsertPtr`(`hdpa` : `HDPA`, `i` : Int, `p` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_LoadStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `DPA_LoadStream`(`phdpa` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDPA`>?, `pfn` : `PFNDPASTREAM`, `pstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvinstdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_Merge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_Merge`(`hdpadest` : `HDPA`, `hdpasrc` : `HDPA`, `dwflags` : UInt, `pfncompare` : `PFNDACOMPARE`, `pfnmerge` : `PFNDPAMERGE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_SaveStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `DPA_SaveStream`(`hdpa` : `HDPA`, `pfn` : `PFNDPASTREAM`, `pstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvinstdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_Search; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_Search`(`hdpa` : `HDPA`, `pfind` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `istart` : Int, `pfncompare` : `PFNDACOMPARE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `options` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_SetPtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_SetPtr`(`hdpa` : `HDPA`, `i` : Int, `p` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DPA_Sort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DPA_Sort`(`hdpa` : `HDPA`, `pfncompare` : `PFNDACOMPARE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_Clone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_Clone`(`hdsa` : `HDSA`) : `HDSA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_Create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_Create`(`cbitem` : Int, `citemgrow` : Int) : `HDSA`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_DeleteAllItems; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_DeleteAllItems`(`hdsa` : `HDSA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_DeleteItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_DeleteItem`(`hdsa` : `HDSA`, `i` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_Destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_Destroy`(`hdsa` : `HDSA`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_DestroyCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_DestroyCallback`(`hdsa` : `HDSA`, `pfncb` : `PFNDAENUMCALLBACK`, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_EnumCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_EnumCallback`(`hdsa` : `HDSA`, `pfncb` : `PFNDAENUMCALLBACK`, `pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_GetItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_GetItem`(`hdsa` : `HDSA`, `i` : Int, `pitem` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_GetItemPtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_GetItemPtr`(`hdsa` : `HDSA`, `i` : Int) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_GetSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_GetSize`(`hdsa` : `HDSA`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_InsertItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_InsertItem`(`hdsa` : `HDSA`, `i` : Int, `pitem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_SetItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_SetItem`(`hdsa` : `HDSA`, `i` : Int, `pitem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DSA_Sort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DSA_Sort`(`pdsa` : `HDSA`, `pfncompare` : `PFNDACOMPARE`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DestroyPropertySheetPage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyPropertySheetPage`(`param0` : `HPROPSHEETPAGE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DestroySyntheticPointerDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroySyntheticPointerDevice`(`device` : `HSYNTHETICPOINTERDEVICE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirListA`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lppathspec` : `windows_sys`.`core`.`PSTR`, `nidlistbox` : Int, `nidstaticpath` : Int, `ufiletype` : `DLG_DIR_LIST_FILE_TYPE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirListComboBoxA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirListComboBoxA`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lppathspec` : `windows_sys`.`core`.`PSTR`, `nidcombobox` : Int, `nidstaticpath` : Int, `ufiletype` : `DLG_DIR_LIST_FILE_TYPE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirListComboBoxW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirListComboBoxW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lppathspec` : `windows_sys`.`core`.`PWSTR`, `nidcombobox` : Int, `nidstaticpath` : Int, `ufiletype` : `DLG_DIR_LIST_FILE_TYPE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirListW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lppathspec` : `windows_sys`.`core`.`PWSTR`, `nidlistbox` : Int, `nidstaticpath` : Int, `ufiletype` : `DLG_DIR_LIST_FILE_TYPE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirSelectComboBoxExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirSelectComboBoxExA`(`hwnddlg` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PSTR`, `cchout` : Int, `idcombobox` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirSelectComboBoxExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirSelectComboBoxExW`(`hwnddlg` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PWSTR`, `cchout` : Int, `idcombobox` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirSelectExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirSelectExA`(`hwnddlg` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PSTR`, `chcount` : Int, `idlistbox` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DlgDirSelectExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DlgDirSelectExW`(`hwnddlg` : `super`.`super`.`Foundation`.`HWND`, `lpstring` : `windows_sys`.`core`.`PWSTR`, `chcount` : Int, `idlistbox` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DrawInsert; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DrawInsert`(`handparent` : `super`.`super`.`Foundation`.`HWND`, `hlb` : `super`.`super`.`Foundation`.`HWND`, `nitem` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DrawShadowText; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawShadowText`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `psztext` : `windows_sys`.`core`.`PCWSTR`, `cch` : UInt, `prc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dwflags` : UInt, `crtext` : `super`.`super`.`Foundation`.`COLORREF`, `crshadow` : `super`.`super`.`Foundation`.`COLORREF`, `ixoffset` : Int, `iyoffset` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DrawStatusTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawStatusTextA`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `psztext` : `windows_sys`.`core`.`PCSTR`, `uflags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=DrawStatusTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawStatusTextW`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `psztext` : `windows_sys`.`core`.`PCWSTR`, `uflags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeBackground; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeBackground`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `prect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `pcliprect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeBackgroundEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeBackgroundEx`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `prect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `poptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`DTBGOPTS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeEdge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeEdge`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `pdestrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `uedge` : `super`.`super`.`Graphics`.`Gdi`.`DRAWEDGE_FLAGS`, `uflags` : `super`.`super`.`Graphics`.`Gdi`.`DRAW_EDGE_FLAGS`, `pcontentrect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeIcon`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `prect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `himl` : `HIMAGELIST`, `iimageindex` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeParentBackground; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeParentBackground`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `prc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeParentBackgroundEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeParentBackgroundEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `dwflags` : `DRAW_THEME_PARENT_BACKGROUND_FLAGS`, `prc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeText; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeText`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `psztext` : `windows_sys`.`core`.`PCWSTR`, `cchtext` : Int, `dwtextflags` : `super`.`super`.`Graphics`.`Gdi`.`DRAW_TEXT_FORMAT`, `dwtextflags2` : UInt, `prect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=DrawThemeTextEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DrawThemeTextEx`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `psztext` : `windows_sys`.`core`.`PCWSTR`, `cchtext` : Int, `dwtextflags` : `super`.`super`.`Graphics`.`Gdi`.`DRAW_TEXT_FORMAT`, `prect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `poptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`DTTOPTS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnableScrollBar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableScrollBar`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wsbflags` : UInt, `warrows` : `ENABLE_SCROLL_BAR_ARROWS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=EnableThemeDialogTexture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableThemeDialogTexture`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=EnableTheming; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableTheming`(`fenable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=EndBufferedAnimation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndBufferedAnimation`(`hbpanimation` : Long, `fupdatetarget` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=EndBufferedPaint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndBufferedPaint`(`hbufferedpaint` : Long, `fupdatetarget` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=EndPanningFeedback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndPanningFeedback`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `fanimateback` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EvaluateProximityToPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvaluateProximityToPolygon`(`numvertices` : UInt, `controlpolygon` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `phittestinginput` : /* Rust *const */ kotlinx.cinterop.CPointer<`TOUCH_HIT_TESTING_INPUT`>?, `pproximityeval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TOUCH_HIT_TESTING_PROXIMITY_EVALUATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EvaluateProximityToRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvaluateProximityToRect`(`controlboundingbox` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `phittestinginput` : /* Rust *const */ kotlinx.cinterop.CPointer<`TOUCH_HIT_TESTING_INPUT`>?, `pproximityeval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TOUCH_HIT_TESTING_PROXIMITY_EVALUATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_EnableScrollBar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlatSB_EnableScrollBar`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : Int, `param2` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_GetScrollInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `FlatSB_GetScrollInfo`(`param0` : `super`.`super`.`Foundation`.`HWND`, `code` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WindowsAndMessaging`.`SCROLLINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_GetScrollPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `FlatSB_GetScrollPos`(`param0` : `super`.`super`.`Foundation`.`HWND`, `code` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_GetScrollProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlatSB_GetScrollProp`(`param0` : `super`.`super`.`Foundation`.`HWND`, `propindex` : `WSB_PROP`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_GetScrollRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `FlatSB_GetScrollRange`(`param0` : `super`.`super`.`Foundation`.`HWND`, `code` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `param2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `param3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_SetScrollInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `FlatSB_SetScrollInfo`(`param0` : `super`.`super`.`Foundation`.`HWND`, `code` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `psi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WindowsAndMessaging`.`SCROLLINFO`>?, `fredraw` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_SetScrollPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `FlatSB_SetScrollPos`(`param0` : `super`.`super`.`Foundation`.`HWND`, `code` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `pos` : Int, `fredraw` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_SetScrollProp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlatSB_SetScrollProp`(`param0` : `super`.`super`.`Foundation`.`HWND`, `index` : UInt, `newvalue` : Long, `param3` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_SetScrollRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `FlatSB_SetScrollRange`(`param0` : `super`.`super`.`Foundation`.`HWND`, `code` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `min` : Int, `max` : Int, `fredraw` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=FlatSB_ShowScrollBar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `FlatSB_ShowScrollBar`(`param0` : `super`.`super`.`Foundation`.`HWND`, `code` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `param2` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetBufferedPaintBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetBufferedPaintBits`(`hbufferedpaint` : Long, `ppbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`Graphics`.`Gdi`.`RGBQUAD`>>?, `pcxrow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetBufferedPaintDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetBufferedPaintDC`(`hbufferedpaint` : Long) : `super`.`super`.`Graphics`.`Gdi`.`HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetBufferedPaintTargetDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetBufferedPaintTargetDC`(`hbufferedpaint` : Long) : `super`.`super`.`Graphics`.`Gdi`.`HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetBufferedPaintTargetRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBufferedPaintTargetRect`(`hbufferedpaint` : Long, `prc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetComboBoxInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComboBoxInfo`(`hwndcombo` : `super`.`super`.`Foundation`.`HWND`, `pcbi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMBOBOXINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetCurrentThemeName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentThemeName`(`pszthemefilename` : `windows_sys`.`core`.`PWSTR`, `cchmaxnamechars` : Int, `pszcolorbuff` : `windows_sys`.`core`.`PWSTR`, `cchmaxcolorchars` : Int, `pszsizebuff` : `windows_sys`.`core`.`PWSTR`, `cchmaxsizechars` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=GetEffectiveClientRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEffectiveClientRect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lprc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetListBoxInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetListBoxInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=GetMUILanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMUILanguage`() : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeAnimationProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeAnimationProperty`(`htheme` : `HTHEME`, `istoryboardid` : Int, `itargetid` : Int, `eproperty` : `TA_PROPERTY`, `pvproperty` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbsize` : UInt, `pcbsizeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeAnimationTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeAnimationTransform`(`htheme` : `HTHEME`, `istoryboardid` : Int, `itargetid` : Int, `dwtransformindex` : UInt, `ptransform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TA_TRANSFORM`>?, `cbsize` : UInt, `pcbsizeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeAppProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeAppProperties`() : `SET_THEME_APP_PROPERTIES_FLAGS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeBackgroundContentRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeBackgroundContentRect`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `pboundingrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `pcontentrect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeBackgroundExtent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeBackgroundExtent`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `pcontentrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `pextentrect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeBackgroundRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeBackgroundRegion`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `prect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `pregion` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HRGN`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeBitmap`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `dwflags` : `GET_THEME_BITMAP_FLAGS`, `phbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`HBITMAP`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeBool`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pfval` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeColor`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pcolor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`COLORREF`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeDocumentationProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeDocumentationProperty`(`pszthemename` : `windows_sys`.`core`.`PCWSTR`, `pszpropertyname` : `windows_sys`.`core`.`PCWSTR`, `pszvaluebuff` : `windows_sys`.`core`.`PWSTR`, `cchmaxvalchars` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeEnumValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeEnumValue`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pival` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeFilename; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeFilename`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pszthemefilename` : `windows_sys`.`core`.`PWSTR`, `cchmaxbuffchars` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeFont`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pfont` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeInt`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pival` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeIntList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeIntList`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pintlist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTLIST`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeMargins; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeMargins`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `prc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `pmargins` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MARGINS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeMetric; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeMetric`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pival` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemePartSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemePartSize`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `prc` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `esize` : `THEMESIZE`, `psz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemePosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemePosition`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `ppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemePropertyOrigin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemePropertyOrigin`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `porigin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPERTYORIGIN`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeRect`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `prect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeStream`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `ppvstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pcbstream` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hinst` : `super`.`super`.`Foundation`.`HINSTANCE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeString`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int, `ipropid` : Int, `pszbuff` : `windows_sys`.`core`.`PWSTR`, `cchmaxbuffchars` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeSysBool; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeSysBool`(`htheme` : `HTHEME`, `iboolid` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeSysColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeSysColor`(`htheme` : `HTHEME`, `icolorid` : Int) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeSysColorBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeSysColorBrush`(`htheme` : `HTHEME`, `icolorid` : Int) : `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeSysFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeSysFont`(`htheme` : `HTHEME`, `ifontid` : Int, `plf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeSysInt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeSysInt`(`htheme` : `HTHEME`, `iintid` : Int, `pivalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeSysSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeSysSize`(`htheme` : `HTHEME`, `isizeid` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeSysString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeSysString`(`htheme` : `HTHEME`, `istringid` : Int, `pszstringbuff` : `windows_sys`.`core`.`PWSTR`, `cchmaxstringchars` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeTextExtent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeTextExtent`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `psztext` : `windows_sys`.`core`.`PCWSTR`, `cchcharcount` : Int, `dwtextflags` : `super`.`super`.`Graphics`.`Gdi`.`DRAW_TEXT_FORMAT`, `pboundingrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `pextentrect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeTextMetrics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetThemeTextMetrics`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `ptm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`TEXTMETRICW`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeTimingFunction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeTimingFunction`(`htheme` : `HTHEME`, `itimingfunctionid` : Int, `ptimingfunction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TA_TIMINGFUNCTION`>?, `cbsize` : UInt, `pcbsizeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetThemeTransitionDuration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThemeTransitionDuration`(`htheme` : `HTHEME`, `ipartid` : Int, `istateidfrom` : Int, `istateidto` : Int, `ipropid` : Int, `pdwduration` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowFeedbackSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowFeedbackSetting`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `feedback` : `FEEDBACK_TYPE`, `dwflags` : UInt, `psize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `config` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=GetWindowTheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowTheme`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `HTHEME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=HIMAGELIST_QueryInterface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HIMAGELIST_QueryInterface`(`himl` : `HIMAGELIST`, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=HitTestThemeBackground; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `HitTestThemeBackground`(`htheme` : `HTHEME`, `hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `ipartid` : Int, `istateid` : Int, `dwoptions` : `HIT_TEST_BACKGROUND_OPTIONS`, `prect` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `hrgn` : `super`.`super`.`Graphics`.`Gdi`.`HRGN`, `pttest` : `super`.`super`.`Foundation`.`POINT`, `pwhittestcode` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Add; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImageList_Add`(`himl` : `HIMAGELIST`, `hbmimage` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`, `hbmmask` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_AddMasked; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImageList_AddMasked`(`himl` : `HIMAGELIST`, `hbmimage` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`, `crmask` : `super`.`super`.`Foundation`.`COLORREF`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_BeginDrag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_BeginDrag`(`himltrack` : `HIMAGELIST`, `itrack` : Int, `dxhotspot` : Int, `dyhotspot` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_CoCreateInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_CoCreateInstance`(`rclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Copy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_Copy`(`himldst` : `HIMAGELIST`, `idst` : Int, `himlsrc` : `HIMAGELIST`, `isrc` : Int, `uflags` : `IMAGE_LIST_COPY_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_Create`(`cx` : Int, `cy` : Int, `flags` : `IMAGELIST_CREATION_FLAGS`, `cinitial` : Int, `cgrow` : Int) : `HIMAGELIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Destroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_Destroy`(`himl` : `HIMAGELIST`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_DragEnter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_DragEnter`(`hwndlock` : `super`.`super`.`Foundation`.`HWND`, `x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_DragLeave; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_DragLeave`(`hwndlock` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_DragMove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_DragMove`(`x` : Int, `y` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_DragShowNolock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_DragShowNolock`(`fshow` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Draw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImageList_Draw`(`himl` : `HIMAGELIST`, `i` : Int, `hdcdst` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `x` : Int, `y` : Int, `fstyle` : `IMAGE_LIST_DRAW_STYLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_DrawEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImageList_DrawEx`(`himl` : `HIMAGELIST`, `i` : Int, `hdcdst` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `x` : Int, `y` : Int, `dx` : Int, `dy` : Int, `rgbbk` : `super`.`super`.`Foundation`.`COLORREF`, `rgbfg` : `super`.`super`.`Foundation`.`COLORREF`, `fstyle` : `IMAGE_LIST_DRAW_STYLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_DrawIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImageList_DrawIndirect`(`pimldp` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGELISTDRAWPARAMS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Duplicate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_Duplicate`(`himl` : `HIMAGELIST`) : `HIMAGELIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_EndDrag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_EndDrag`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_GetBkColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_GetBkColor`(`himl` : `HIMAGELIST`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_GetDragImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_GetDragImage`(`ppt` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `ppthotspot` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `HIMAGELIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_GetIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `ImageList_GetIcon`(`himl` : `HIMAGELIST`, `i` : Int, `flags` : `IMAGE_LIST_DRAW_STYLE`) : `super`.`WindowsAndMessaging`.`HICON`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_GetIconSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_GetIconSize`(`himl` : `HIMAGELIST`, `cx` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `cy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_GetImageCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_GetImageCount`(`himl` : `HIMAGELIST`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_GetImageInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImageList_GetImageInfo`(`himl` : `HIMAGELIST`, `i` : Int, `pimageinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_LoadImageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `ImageList_LoadImageA`(`hi` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpbmp` : `windows_sys`.`core`.`PCSTR`, `cx` : Int, `cgrow` : Int, `crmask` : `super`.`super`.`Foundation`.`COLORREF`, `utype` : UInt, `uflags` : `super`.`WindowsAndMessaging`.`IMAGE_FLAGS`) : `HIMAGELIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_LoadImageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `ImageList_LoadImageW`(`hi` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpbmp` : `windows_sys`.`core`.`PCWSTR`, `cx` : Int, `cgrow` : Int, `crmask` : `super`.`super`.`Foundation`.`COLORREF`, `utype` : UInt, `uflags` : `super`.`WindowsAndMessaging`.`IMAGE_FLAGS`) : `HIMAGELIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Merge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_Merge`(`himl1` : `HIMAGELIST`, `i1` : Int, `himl2` : `HIMAGELIST`, `i2` : Int, `dx` : Int, `dy` : Int) : `HIMAGELIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Read; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ImageList_Read`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `HIMAGELIST`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_ReadEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ImageList_ReadEx`(`dwflags` : UInt, `pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppv` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Remove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_Remove`(`himl` : `HIMAGELIST`, `i` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Replace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ImageList_Replace`(`himl` : `HIMAGELIST`, `i` : Int, `hbmimage` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`, `hbmmask` : `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_ReplaceIcon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `ImageList_ReplaceIcon`(`himl` : `HIMAGELIST`, `i` : Int, `hicon` : `super`.`WindowsAndMessaging`.`HICON`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_SetBkColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_SetBkColor`(`himl` : `HIMAGELIST`, `clrbk` : `super`.`super`.`Foundation`.`COLORREF`) : `super`.`super`.`Foundation`.`COLORREF`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_SetDragCursorImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_SetDragCursorImage`(`himldrag` : `HIMAGELIST`, `idrag` : Int, `dxhotspot` : Int, `dyhotspot` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_SetIconSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_SetIconSize`(`himl` : `HIMAGELIST`, `cx` : Int, `cy` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_SetImageCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_SetImageCount`(`himl` : `HIMAGELIST`, `unewcount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_SetOverlayImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageList_SetOverlayImage`(`himl` : `HIMAGELIST`, `iimage` : Int, `ioverlay` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_Write; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ImageList_Write`(`himl` : `HIMAGELIST`, `pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ImageList_WriteEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `ImageList_WriteEx`(`himl` : `HIMAGELIST`, `dwflags` : `IMAGE_LIST_WRITE_STREAM_FLAGS`, `pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=InitCommonControls; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InitCommonControls`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=InitCommonControlsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InitCommonControlsEx`(`picce` : /* Rust *const */ kotlinx.cinterop.CPointer<`INITCOMMONCONTROLSEX`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=InitMUILanguage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InitMUILanguage`(`uilang` : UShort)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=InitializeFlatSB; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InitializeFlatSB`(`param0` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=IsAppThemed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsAppThemed`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsCharLowerW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCharLowerW`(`ch` : UShort) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=IsCompositionActive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsCompositionActive`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsDlgButtonChecked; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDlgButtonChecked`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `nidbutton` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=IsThemeActive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsThemeActive`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=IsThemeBackgroundPartiallyTransparent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsThemeBackgroundPartiallyTransparent`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=IsThemeDialogTextureEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsThemeDialogTextureEnabled`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=IsThemePartDefined; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsThemePartDefined`(`htheme` : `HTHEME`, `ipartid` : Int, `istateid` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=LBItemFromPt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LBItemFromPt`(`hlb` : `super`.`super`.`Foundation`.`HWND`, `pt` : `super`.`super`.`Foundation`.`POINT`, `bautoscroll` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=LoadIconMetric; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `LoadIconMetric`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszname` : `windows_sys`.`core`.`PCWSTR`, `lims` : `_LI_METRIC`, `phico` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WindowsAndMessaging`.`HICON`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=LoadIconWithScaleDown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `LoadIconWithScaleDown`(`hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszname` : `windows_sys`.`core`.`PCWSTR`, `cx` : Int, `cy` : Int, `phico` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WindowsAndMessaging`.`HICON`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=MakeDragList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MakeDragList`(`hlb` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=MenuHelp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `MenuHelp`(`umsg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `hmainmenu` : `super`.`WindowsAndMessaging`.`HMENU`, `hinst` : `super`.`super`.`Foundation`.`HINSTANCE`, `hwndstatus` : `super`.`super`.`Foundation`.`HWND`, `lpwids` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=OpenThemeData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenThemeData`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszclasslist` : `windows_sys`.`core`.`PCWSTR`) : `HTHEME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=OpenThemeDataEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenThemeDataEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszclasslist` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `OPEN_THEME_DATA_FLAGS`) : `HTHEME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PackTouchHitTestingProximityEvaluation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PackTouchHitTestingProximityEvaluation`(`phittestinginput` : /* Rust *const */ kotlinx.cinterop.CPointer<`TOUCH_HIT_TESTING_INPUT`>?, `pproximityeval` : /* Rust *const */ kotlinx.cinterop.CPointer<`TOUCH_HIT_TESTING_PROXIMITY_EVALUATION`>?) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=PropertySheetA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `PropertySheetA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPSHEETHEADERA_V2`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=PropertySheetW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `PropertySheetW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPSHEETHEADERW_V2`>?) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterPointerDeviceNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterPointerDeviceNotifications`(`window` : `super`.`super`.`Foundation`.`HWND`, `notifyrange` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterTouchHitTestingWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterTouchHitTestingWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `value` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetScrollInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `SetScrollInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nbar` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `lpsi` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`WindowsAndMessaging`.`SCROLLINFO`>?, `redraw` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetScrollPos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `SetScrollPos`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nbar` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `npos` : Int, `bredraw` : `windows_sys`.`core`.`BOOL`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetScrollRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `SetScrollRange`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `nbar` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `nminpos` : Int, `nmaxpos` : Int, `bredraw` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=SetThemeAppProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetThemeAppProperties`(`dwflags` : `SET_THEME_APP_PROPERTIES_FLAGS`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetWindowFeedbackSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowFeedbackSetting`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `feedback` : `FEEDBACK_TYPE`, `dwflags` : UInt, `size` : UInt, `configuration` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=SetWindowTheme; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowTheme`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszsubappname` : `windows_sys`.`core`.`PCWSTR`, `pszsubidlist` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=SetWindowThemeAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWindowThemeAttribute`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `eattribute` : `WINDOWTHEMEATTRIBUTETYPE`, `pvattribute` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbattribute` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=ShowHideMenuCtl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowHideMenuCtl`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `uflags` : ULong, `lpinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=ShowScrollBar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `ShowScrollBar`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `wbar` : `super`.`WindowsAndMessaging`.`SCROLLBAR_CONSTANTS`, `bshow` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=Str_SetPtrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Str_SetPtrW`(`ppsz` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `psz` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=TaskDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TaskDialog`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszwindowtitle` : `windows_sys`.`core`.`PCWSTR`, `pszmaininstruction` : `windows_sys`.`core`.`PCWSTR`, `pszcontent` : `windows_sys`.`core`.`PCWSTR`, `dwcommonbuttons` : `TASKDIALOG_COMMON_BUTTON_FLAGS`, `pszicon` : `windows_sys`.`core`.`PCWSTR`, `pnbutton` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=TaskDialogIndirect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `TaskDialogIndirect`(`ptaskconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`TASKDIALOGCONFIG`>?, `pnbutton` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pnradiobutton` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pfverificationflagchecked` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comctl32.dll, ABI=system, export=UninitializeFlatSB; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UninitializeFlatSB`(`param0` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=UpdatePanningFeedback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdatePanningFeedback`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ltotaloverpanoffsetx` : Int, `ltotaloverpanoffsety` : Int, `fininertia` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
public const val `ABS_DOWNDISABLED`: `ARROWBTNSTATES` = 8;
public const val `ABS_DOWNHOT`: `ARROWBTNSTATES` = 6;
public const val `ABS_DOWNHOVER`: `ARROWBTNSTATES` = 18;
public const val `ABS_DOWNNORMAL`: `ARROWBTNSTATES` = 5;
public const val `ABS_DOWNPRESSED`: `ARROWBTNSTATES` = 7;
public const val `ABS_LEFTDISABLED`: `ARROWBTNSTATES` = 12;
public const val `ABS_LEFTHOT`: `ARROWBTNSTATES` = 10;
public const val `ABS_LEFTHOVER`: `ARROWBTNSTATES` = 19;
public const val `ABS_LEFTNORMAL`: `ARROWBTNSTATES` = 9;
public const val `ABS_LEFTPRESSED`: `ARROWBTNSTATES` = 11;
public const val `ABS_RIGHTDISABLED`: `ARROWBTNSTATES` = 16;
public const val `ABS_RIGHTHOT`: `ARROWBTNSTATES` = 14;
public const val `ABS_RIGHTHOVER`: `ARROWBTNSTATES` = 20;
public const val `ABS_RIGHTNORMAL`: `ARROWBTNSTATES` = 13;
public const val `ABS_RIGHTPRESSED`: `ARROWBTNSTATES` = 15;
public const val `ABS_UPDISABLED`: `ARROWBTNSTATES` = 4;
public const val `ABS_UPHOT`: `ARROWBTNSTATES` = 2;
public const val `ABS_UPHOVER`: `ARROWBTNSTATES` = 17;
public const val `ABS_UPNORMAL`: `ARROWBTNSTATES` = 1;
public const val `ABS_UPPRESSED`: `ARROWBTNSTATES` = 3;
public const val `ACM_ISPLAYING`: UInt = 1128u;
public const val `ACM_OPEN`: UInt = 1127u;
public const val `ACM_OPENA`: UInt = 1124u;
public const val `ACM_OPENW`: UInt = 1127u;
public const val `ACM_PLAY`: UInt = 1125u;
public const val `ACM_STOP`: UInt = 1126u;
public const val `ACN_START`: UInt = 1u;
public const val `ACN_STOP`: UInt = 2u;
public const val `ACS_AUTOPLAY`: UInt = 4u;
public const val `ACS_CENTER`: UInt = 1u;
public const val `ACS_TIMER`: UInt = 8u;
public const val `ACS_TRANSPARENT`: UInt = 2u;
public typealias `AEROWIZARDPARTS` = Int;
public const val `ALLOW_CONTROLS`: `SET_THEME_APP_PROPERTIES_FLAGS` = 2u;
public const val `ALLOW_NONCLIENT`: `SET_THEME_APP_PROPERTIES_FLAGS` = 1u;
public const val `ALLOW_WEBCONTENT`: `SET_THEME_APP_PROPERTIES_FLAGS` = 4u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ANIMATE_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysAnimate32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ANIMATE_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysAnimate32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ANIMATE_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysAnimate32");
public typealias `ARROWBTNSTATES` = Int;
public const val `AW_BUTTON`: `AEROWIZARDPARTS` = 5;
public const val `AW_COMMANDAREA`: `AEROWIZARDPARTS` = 4;
public const val `AW_CONTENTAREA`: `AEROWIZARDPARTS` = 3;
public const val `AW_HEADERAREA`: `AEROWIZARDPARTS` = 2;
public const val `AW_S_CONTENTAREA_NOMARGIN`: `CONTENTAREASTATES` = 1;
public const val `AW_S_HEADERAREA_NOMARGIN`: `HEADERAREASTATES` = 1;
public const val `AW_S_TITLEBAR_ACTIVE`: `TITLEBARSTATES` = 1;
public const val `AW_S_TITLEBAR_INACTIVE`: `TITLEBARSTATES` = 2;
public const val `AW_TITLEBAR`: `AEROWIZARDPARTS` = 1;
public typealias `BACKGROUNDSTATES` = Int;
public typealias `BACKGROUNDWITHBORDERSTATES` = Int;
public typealias `BALLOONSTATES` = Int;
public typealias `BALLOONSTEMSTATES` = Int;
public typealias `BARBACKGROUNDSTATES` = Int;
public typealias `BARITEMSTATES` = Int;
public const val `BCM_FIRST`: UInt = 5632u;
public const val `BCM_GETIDEALSIZE`: UInt = 5633u;
public const val `BCM_GETIMAGELIST`: UInt = 5635u;
public const val `BCM_GETNOTE`: UInt = 5642u;
public const val `BCM_GETNOTELENGTH`: UInt = 5643u;
public const val `BCM_GETSPLITINFO`: UInt = 5640u;
public const val `BCM_GETTEXTMARGIN`: UInt = 5637u;
public const val `BCM_SETDROPDOWNSTATE`: UInt = 5638u;
public const val `BCM_SETIMAGELIST`: UInt = 5634u;
public const val `BCM_SETNOTE`: UInt = 5641u;
public const val `BCM_SETSHIELD`: UInt = 5644u;
public const val `BCM_SETSPLITINFO`: UInt = 5639u;
public const val `BCM_SETTEXTMARGIN`: UInt = 5636u;
public const val `BCN_DROPDOWN`: UInt = 4294966048u;
public const val `BCN_FIRST`: UInt = 4294966046u;
public const val `BCN_HOTITEMCHANGE`: UInt = 4294966047u;
public const val `BCN_LAST`: UInt = 4294965946u;
public const val `BCSIF_GLYPH`: UInt = 1u;
public const val `BCSIF_IMAGE`: UInt = 2u;
public const val `BCSIF_SIZE`: UInt = 8u;
public const val `BCSIF_STYLE`: UInt = 4u;
public const val `BCSS_ALIGNLEFT`: UInt = 4u;
public const val `BCSS_IMAGE`: UInt = 8u;
public const val `BCSS_NOSPLIT`: UInt = 1u;
public const val `BCSS_STRETCH`: UInt = 2u;
public typealias `BGTYPE` = Int;
public typealias `BODYSTATES` = Int;
public typealias `BORDERSTATES` = Int;
public typealias `BORDERTYPE` = Int;
public typealias `BORDER_HSCROLLSTATES` = Int;
public typealias `BORDER_HVSCROLLSTATES` = Int;
public typealias `BORDER_NOSCROLLSTATES` = Int;
public typealias `BORDER_VSCROLLSTATES` = Int;
public const val `BPAS_CUBIC`: `BP_ANIMATIONSTYLE` = 2;
public const val `BPAS_LINEAR`: `BP_ANIMATIONSTYLE` = 1;
public const val `BPAS_NONE`: `BP_ANIMATIONSTYLE` = 0;
public const val `BPAS_SINE`: `BP_ANIMATIONSTYLE` = 3;
public const val `BPBF_COMPATIBLEBITMAP`: `BP_BUFFERFORMAT` = 0;
public const val `BPBF_DIB`: `BP_BUFFERFORMAT` = 1;
public const val `BPBF_TOPDOWNDIB`: `BP_BUFFERFORMAT` = 2;
public const val `BPBF_TOPDOWNMONODIB`: `BP_BUFFERFORMAT` = 3;
public const val `BPPF_ERASE`: `BP_PAINTPARAMS_FLAGS` = 1u;
public const val `BPPF_NOCLIP`: `BP_PAINTPARAMS_FLAGS` = 2u;
public const val `BPPF_NONCLIENT`: `BP_PAINTPARAMS_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BP_ANIMATIONPARAMS` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `style`: `BP_ANIMATIONSTYLE`,
    public var `dwDuration`: UInt,
)
public typealias `BP_ANIMATIONSTYLE` = Int;
public typealias `BP_BUFFERFORMAT` = Int;
public const val `BP_CHECKBOX`: `BUTTONPARTS` = 3;
public const val `BP_CHECKBOX_HCDISABLED`: `BUTTONPARTS` = 9;
public const val `BP_COMMANDLINK`: `BUTTONPARTS` = 6;
public const val `BP_COMMANDLINKGLYPH`: `BUTTONPARTS` = 7;
public const val `BP_GROUPBOX`: `BUTTONPARTS` = 4;
public const val `BP_GROUPBOX_HCDISABLED`: `BUTTONPARTS` = 10;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BP_PAINTPARAMS` (
    public var `cbSize`: UInt,
    public var `dwFlags`: `BP_PAINTPARAMS_FLAGS`,
    public var `prcExclude`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?,
    public var `pBlendFunction`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`BLENDFUNCTION`>?,
)
// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for BP_PAINTPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BP_PAINTPARAMS_FLAGS` = UInt;
public const val `BP_PUSHBUTTON`: `BUTTONPARTS` = 1;
public const val `BP_PUSHBUTTONDROPDOWN`: `BUTTONPARTS` = 11;
public const val `BP_RADIOBUTTON`: `BUTTONPARTS` = 2;
public const val `BP_RADIOBUTTON_HCDISABLED`: `BUTTONPARTS` = 8;
public const val `BP_USERBUTTON`: `BUTTONPARTS` = 5;
public const val `BST_CHECKED`: `DLG_BUTTON_CHECK_STATE` = 1u;
public const val `BST_DROPDOWNPUSHED`: UInt = 1024u;
public const val `BST_HOT`: UInt = 512u;
public const val `BST_INDETERMINATE`: `DLG_BUTTON_CHECK_STATE` = 2u;
public const val `BST_UNCHECKED`: `DLG_BUTTON_CHECK_STATE` = 0u;
public const val `BS_COMMANDLINK`: Int = 14;
public const val `BS_DEFCOMMANDLINK`: Int = 15;
public const val `BS_DEFSPLITBUTTON`: Int = 13;
public const val `BS_SPLITBUTTON`: Int = 12;
public const val `BTNS_AUTOSIZE`: UInt = 16u;
public const val `BTNS_BUTTON`: UInt = 0u;
public const val `BTNS_CHECK`: UInt = 2u;
public const val `BTNS_DROPDOWN`: UInt = 8u;
public const val `BTNS_GROUP`: UInt = 4u;
public const val `BTNS_NOPREFIX`: UInt = 32u;
public const val `BTNS_SEP`: UInt = 1u;
public const val `BTNS_SHOWTEXT`: UInt = 64u;
public const val `BTNS_WHOLEDROPDOWN`: UInt = 128u;
public const val `BT_BORDERFILL`: `BGTYPE` = 1;
public const val `BT_ELLIPSE`: `BORDERTYPE` = 2;
public const val `BT_IMAGEFILE`: `BGTYPE` = 0;
public const val `BT_NONE`: `BGTYPE` = 2;
public const val `BT_RECT`: `BORDERTYPE` = 0;
public const val `BT_ROUNDRECT`: `BORDERTYPE` = 1;
public typealias `BUTTONPARTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BUTTON_IMAGELIST` (
    public var `himl`: `HIMAGELIST`,
    public var `margin`: `super`.`super`.`Foundation`.`RECT`,
    public var `uAlign`: `BUTTON_IMAGELIST_ALIGN`,
)
public typealias `BUTTON_IMAGELIST_ALIGN` = UInt;
public const val `BUTTON_IMAGELIST_ALIGN_BOTTOM`: `BUTTON_IMAGELIST_ALIGN` = 3u;
public const val `BUTTON_IMAGELIST_ALIGN_CENTER`: `BUTTON_IMAGELIST_ALIGN` = 4u;
public const val `BUTTON_IMAGELIST_ALIGN_LEFT`: `BUTTON_IMAGELIST_ALIGN` = 0u;
public const val `BUTTON_IMAGELIST_ALIGN_RIGHT`: `BUTTON_IMAGELIST_ALIGN` = 1u;
public const val `BUTTON_IMAGELIST_ALIGN_TOP`: `BUTTON_IMAGELIST_ALIGN` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BUTTON_SPLITINFO` (
    public var `mask`: UInt,
    public var `himlGlyph`: `HIMAGELIST`,
    public var `uSplitStyle`: UInt,
    public var `size`: `super`.`super`.`Foundation`.`SIZE`,
)
public typealias `CAPTIONSTATES` = Int;
public const val `CA_CENTER`: `CONTENTALIGNMENT` = 1;
public const val `CA_LEFT`: `CONTENTALIGNMENT` = 0;
public const val `CA_RIGHT`: `CONTENTALIGNMENT` = 2;
public const val `CBB_DISABLED`: `BORDERSTATES` = 4;
public const val `CBB_FOCUSED`: `BORDERSTATES` = 3;
public const val `CBB_HOT`: `BORDERSTATES` = 2;
public const val `CBB_NORMAL`: `BORDERSTATES` = 1;
public const val `CBCB_DISABLED`: `CUEBANNERSTATES` = 4;
public const val `CBCB_HOT`: `CUEBANNERSTATES` = 2;
public const val `CBCB_NORMAL`: `CUEBANNERSTATES` = 1;
public const val `CBCB_PRESSED`: `CUEBANNERSTATES` = 3;
public const val `CBDI_HIGHLIGHTED`: `DROPDOWNITEMSTATES` = 2;
public const val `CBDI_NORMAL`: `DROPDOWNITEMSTATES` = 1;
public const val `CBEIF_DI_SETITEM`: `COMBOBOX_EX_ITEM_FLAGS` = 268435456u;
public const val `CBEIF_IMAGE`: `COMBOBOX_EX_ITEM_FLAGS` = 2u;
public const val `CBEIF_INDENT`: `COMBOBOX_EX_ITEM_FLAGS` = 16u;
public const val `CBEIF_LPARAM`: `COMBOBOX_EX_ITEM_FLAGS` = 32u;
public const val `CBEIF_OVERLAY`: `COMBOBOX_EX_ITEM_FLAGS` = 8u;
public const val `CBEIF_SELECTEDIMAGE`: `COMBOBOX_EX_ITEM_FLAGS` = 4u;
public const val `CBEIF_TEXT`: `COMBOBOX_EX_ITEM_FLAGS` = 1u;
public const val `CBEMAXSTRLEN`: UInt = 260u;
public const val `CBEM_GETCOMBOCONTROL`: UInt = 1030u;
public const val `CBEM_GETEDITCONTROL`: UInt = 1031u;
public const val `CBEM_GETEXSTYLE`: UInt = 1033u;
public const val `CBEM_GETEXTENDEDSTYLE`: UInt = 1033u;
public const val `CBEM_GETIMAGELIST`: UInt = 1027u;
public const val `CBEM_GETITEM`: UInt = 1037u;
public const val `CBEM_GETITEMA`: UInt = 1028u;
public const val `CBEM_GETITEMW`: UInt = 1037u;
public const val `CBEM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `CBEM_HASEDITCHANGED`: UInt = 1034u;
public const val `CBEM_INSERTITEM`: UInt = 1035u;
public const val `CBEM_INSERTITEMA`: UInt = 1025u;
public const val `CBEM_INSERTITEMW`: UInt = 1035u;
public const val `CBEM_SETEXSTYLE`: UInt = 1032u;
public const val `CBEM_SETEXTENDEDSTYLE`: UInt = 1038u;
public const val `CBEM_SETIMAGELIST`: UInt = 1026u;
public const val `CBEM_SETITEM`: UInt = 1036u;
public const val `CBEM_SETITEMA`: UInt = 1029u;
public const val `CBEM_SETITEMW`: UInt = 1036u;
public const val `CBEM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `CBEM_SETWINDOWTHEME`: UInt = 8203u;
public const val `CBENF_DROPDOWN`: UInt = 4u;
public const val `CBENF_ESCAPE`: UInt = 3u;
public const val `CBENF_KILLFOCUS`: UInt = 1u;
public const val `CBENF_RETURN`: UInt = 2u;
public const val `CBEN_BEGINEDIT`: UInt = 4294966492u;
public const val `CBEN_DELETEITEM`: UInt = 4294966494u;
public const val `CBEN_DRAGBEGIN`: UInt = 4294966487u;
public const val `CBEN_DRAGBEGINA`: UInt = 4294966488u;
public const val `CBEN_DRAGBEGINW`: UInt = 4294966487u;
public const val `CBEN_ENDEDIT`: UInt = 4294966490u;
public const val `CBEN_ENDEDITA`: UInt = 4294966491u;
public const val `CBEN_ENDEDITW`: UInt = 4294966490u;
public const val `CBEN_FIRST`: UInt = 4294966496u;
public const val `CBEN_GETDISPINFOA`: UInt = 4294966496u;
public const val `CBEN_GETDISPINFOW`: UInt = 4294966489u;
public const val `CBEN_INSERTITEM`: UInt = 4294966495u;
public const val `CBEN_LAST`: UInt = 4294966466u;
public const val `CBES_EX_CASESENSITIVE`: UInt = 16u;
public const val `CBES_EX_NOEDITIMAGE`: UInt = 1u;
public const val `CBES_EX_NOEDITIMAGEINDENT`: UInt = 2u;
public const val `CBES_EX_NOSIZELIMIT`: UInt = 8u;
public const val `CBES_EX_PATHWORDBREAKPROC`: UInt = 4u;
public const val `CBES_EX_TEXTENDELLIPSIS`: UInt = 32u;
public const val `CBM_FIRST`: UInt = 5888u;
public const val `CBRO_DISABLED`: `READONLYSTATES` = 4;
public const val `CBRO_HOT`: `READONLYSTATES` = 2;
public const val `CBRO_NORMAL`: `READONLYSTATES` = 1;
public const val `CBRO_PRESSED`: `READONLYSTATES` = 3;
public const val `CBS_CHECKEDDISABLED`: `CHECKBOXSTATES` = 8;
public const val `CBS_CHECKEDHOT`: `CHECKBOXSTATES` = 6;
public const val `CBS_CHECKEDNORMAL`: `CHECKBOXSTATES` = 5;
public const val `CBS_CHECKEDPRESSED`: `CHECKBOXSTATES` = 7;
public const val `CBS_DISABLED`: `CLOSEBUTTONSTATES` = 4;
public const val `CBS_EXCLUDEDDISABLED`: `CHECKBOXSTATES` = 20;
public const val `CBS_EXCLUDEDHOT`: `CHECKBOXSTATES` = 18;
public const val `CBS_EXCLUDEDNORMAL`: `CHECKBOXSTATES` = 17;
public const val `CBS_EXCLUDEDPRESSED`: `CHECKBOXSTATES` = 19;
public const val `CBS_HOT`: `CLOSEBUTTONSTATES` = 2;
public const val `CBS_IMPLICITDISABLED`: `CHECKBOXSTATES` = 16;
public const val `CBS_IMPLICITHOT`: `CHECKBOXSTATES` = 14;
public const val `CBS_IMPLICITNORMAL`: `CHECKBOXSTATES` = 13;
public const val `CBS_IMPLICITPRESSED`: `CHECKBOXSTATES` = 15;
public const val `CBS_MIXEDDISABLED`: `CHECKBOXSTATES` = 12;
public const val `CBS_MIXEDHOT`: `CHECKBOXSTATES` = 10;
public const val `CBS_MIXEDNORMAL`: `CHECKBOXSTATES` = 9;
public const val `CBS_MIXEDPRESSED`: `CHECKBOXSTATES` = 11;
public const val `CBS_NORMAL`: `CLOSEBUTTONSTATES` = 1;
public const val `CBS_PUSHED`: `CLOSEBUTTONSTATES` = 3;
public const val `CBS_UNCHECKEDDISABLED`: `CHECKBOXSTATES` = 4;
public const val `CBS_UNCHECKEDHOT`: `CHECKBOXSTATES` = 2;
public const val `CBS_UNCHECKEDNORMAL`: `CHECKBOXSTATES` = 1;
public const val `CBS_UNCHECKEDPRESSED`: `CHECKBOXSTATES` = 3;
public const val `CBTBS_DISABLED`: `TRANSPARENTBACKGROUNDSTATES` = 3;
public const val `CBTBS_FOCUSED`: `TRANSPARENTBACKGROUNDSTATES` = 4;
public const val `CBTBS_HOT`: `TRANSPARENTBACKGROUNDSTATES` = 2;
public const val `CBTBS_NORMAL`: `TRANSPARENTBACKGROUNDSTATES` = 1;
public const val `CBXSL_DISABLED`: `DROPDOWNBUTTONLEFTSTATES` = 4;
public const val `CBXSL_HOT`: `DROPDOWNBUTTONLEFTSTATES` = 2;
public const val `CBXSL_NORMAL`: `DROPDOWNBUTTONLEFTSTATES` = 1;
public const val `CBXSL_PRESSED`: `DROPDOWNBUTTONLEFTSTATES` = 3;
public const val `CBXSR_DISABLED`: `DROPDOWNBUTTONRIGHTSTATES` = 4;
public const val `CBXSR_HOT`: `DROPDOWNBUTTONRIGHTSTATES` = 2;
public const val `CBXSR_NORMAL`: `DROPDOWNBUTTONRIGHTSTATES` = 1;
public const val `CBXSR_PRESSED`: `DROPDOWNBUTTONRIGHTSTATES` = 3;
public const val `CBXS_DISABLED`: `COMBOBOXSTYLESTATES` = 4;
public const val `CBXS_HOT`: `COMBOBOXSTYLESTATES` = 2;
public const val `CBXS_NORMAL`: `COMBOBOXSTYLESTATES` = 1;
public const val `CBXS_PRESSED`: `COMBOBOXSTYLESTATES` = 3;
public const val `CB_GETCUEBANNER`: UInt = 5892u;
public const val `CB_GETMINVISIBLE`: UInt = 5890u;
public const val `CB_SETCUEBANNER`: UInt = 5891u;
public const val `CB_SETMINVISIBLE`: UInt = 5889u;
public const val `CCF_NOTEXT`: UInt = 1u;
public const val `CCHCCCLASS`: UInt = 32u;
public const val `CCHCCDESC`: UInt = 32u;
public const val `CCHCCTEXT`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CCINFOA` (
    public var `szClass`: ByteArray,
    public var `flOptions`: UInt,
    public var `szDesc`: ByteArray,
    public var `cxDefault`: UInt,
    public var `cyDefault`: UInt,
    public var `flStyleDefault`: UInt,
    public var `flExtStyleDefault`: UInt,
    public var `flCtrlTypeMask`: UInt,
    public var `szTextDefault`: ByteArray,
    public var `cStyleFlags`: Int,
    public var `aStyleFlags`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CCSTYLEFLAGA`>?,
    public var `lpfnStyle`: `LPFNCCSTYLEA`,
    public var `lpfnSizeToText`: `LPFNCCSIZETOTEXTA`,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
)
// UNSUPPORTED Rust 606:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CCINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CCINFOW` (
    public var `szClass`: UShortArray,
    public var `flOptions`: UInt,
    public var `szDesc`: UShortArray,
    public var `cxDefault`: UInt,
    public var `cyDefault`: UInt,
    public var `flStyleDefault`: UInt,
    public var `flExtStyleDefault`: UInt,
    public var `flCtrlTypeMask`: UInt,
    public var `cStyleFlags`: Int,
    public var `aStyleFlags`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CCSTYLEFLAGW`>?,
    public var `szTextDefault`: UShortArray,
    public var `lpfnStyle`: `LPFNCCSTYLEW`,
    public var `lpfnSizeToText`: `LPFNCCSIZETOTEXTW`,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
)
// UNSUPPORTED Rust 632:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CCINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CCM_DPISCALE`: UInt = 8204u;
public const val `CCM_FIRST`: UInt = 8192u;
public const val `CCM_GETCOLORSCHEME`: UInt = 8195u;
public const val `CCM_GETDROPTARGET`: UInt = 8196u;
public const val `CCM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `CCM_GETVERSION`: UInt = 8200u;
public const val `CCM_LAST`: UInt = 8704u;
public const val `CCM_SETBKCOLOR`: UInt = 8193u;
public const val `CCM_SETCOLORSCHEME`: UInt = 8194u;
public const val `CCM_SETNOTIFYWINDOW`: UInt = 8201u;
public const val `CCM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `CCM_SETVERSION`: UInt = 8199u;
public const val `CCM_SETWINDOWTHEME`: UInt = 8203u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CCSTYLEA` (
    public var `flStyle`: UInt,
    public var `flExtStyle`: UInt,
    public var `szText`: ByteArray,
    public var `lgid`: UShort,
    public var `wReserved1`: UShort,
)
// UNSUPPORTED Rust 660:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CCSTYLEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CCSTYLEFLAGA` (
    public var `flStyle`: UInt,
    public var `flStyleMask`: UInt,
    public var `pszStyle`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 672:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CCSTYLEFLAGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CCSTYLEFLAGW` (
    public var `flStyle`: UInt,
    public var `flStyleMask`: UInt,
    public var `pszStyle`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 684:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CCSTYLEFLAGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CCSTYLEW` (
    public var `flStyle`: UInt,
    public var `flExtStyle`: UInt,
    public var `szText`: UShortArray,
    public var `lgid`: UShort,
    public var `wReserved1`: UShort,
)
// UNSUPPORTED Rust 698:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CCSTYLEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CCS_ADJUSTABLE`: Int = 32;
public const val `CCS_BOTTOM`: Int = 3;
public const val `CCS_NODIVIDER`: Int = 64;
public const val `CCS_NOMOVEY`: Int = 2;
public const val `CCS_NOPARENTALIGN`: Int = 8;
public const val `CCS_NORESIZE`: Int = 4;
public const val `CCS_TOP`: Int = 1;
public const val `CCS_VERT`: Int = 128;
public const val `CDDS_ITEM`: UInt = 65536u;
public const val `CDDS_ITEMPOSTERASE`: `NMCUSTOMDRAW_DRAW_STAGE` = 65540u;
public const val `CDDS_ITEMPOSTPAINT`: `NMCUSTOMDRAW_DRAW_STAGE` = 65538u;
public const val `CDDS_ITEMPREERASE`: `NMCUSTOMDRAW_DRAW_STAGE` = 65539u;
public const val `CDDS_ITEMPREPAINT`: `NMCUSTOMDRAW_DRAW_STAGE` = 65537u;
public const val `CDDS_POSTERASE`: UInt = 4u;
public const val `CDDS_POSTPAINT`: `NMCUSTOMDRAW_DRAW_STAGE` = 2u;
public const val `CDDS_PREERASE`: `NMCUSTOMDRAW_DRAW_STAGE` = 3u;
public const val `CDDS_PREPAINT`: `NMCUSTOMDRAW_DRAW_STAGE` = 1u;
public const val `CDDS_SUBITEM`: `NMCUSTOMDRAW_DRAW_STAGE` = 131072u;
public const val `CDIS_CHECKED`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 8u;
public const val `CDIS_DEFAULT`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 32u;
public const val `CDIS_DISABLED`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 4u;
public const val `CDIS_DROPHILITED`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 4096u;
public const val `CDIS_FOCUS`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 16u;
public const val `CDIS_GRAYED`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 2u;
public const val `CDIS_HOT`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 64u;
public const val `CDIS_INDETERMINATE`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 256u;
public const val `CDIS_MARKED`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 128u;
public const val `CDIS_NEARHOT`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 1024u;
public const val `CDIS_OTHERSIDEHOT`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 2048u;
public const val `CDIS_SELECTED`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 1u;
public const val `CDIS_SHOWKEYBOARDCUES`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = 512u;
public const val `CDN_FIRST`: UInt = 4294966695u;
public const val `CDN_LAST`: UInt = 4294966597u;
public const val `CDRF_DODEFAULT`: UInt = 0u;
public const val `CDRF_DOERASE`: UInt = 8u;
public const val `CDRF_NEWFONT`: UInt = 2u;
public const val `CDRF_NOTIFYITEMDRAW`: UInt = 32u;
public const val `CDRF_NOTIFYPOSTERASE`: UInt = 64u;
public const val `CDRF_NOTIFYPOSTPAINT`: UInt = 16u;
public const val `CDRF_NOTIFYSUBITEMDRAW`: UInt = 32u;
public const val `CDRF_SKIPDEFAULT`: UInt = 4u;
public const val `CDRF_SKIPPOSTPAINT`: UInt = 256u;
public typealias `CHECKBOXSTATES` = Int;
public typealias `CHEVRONSTATES` = Int;
public typealias `CHEVRONVERTSTATES` = Int;
public const val `CHEVSV_HOT`: `CHEVRONVERTSTATES` = 2;
public const val `CHEVSV_NORMAL`: `CHEVRONVERTSTATES` = 1;
public const val `CHEVSV_PRESSED`: `CHEVRONVERTSTATES` = 3;
public const val `CHEVS_HOT`: `CHEVRONSTATES` = 2;
public const val `CHEVS_NORMAL`: `CHEVRONSTATES` = 1;
public const val `CHEVS_PRESSED`: `CHEVRONSTATES` = 3;
public typealias `CLOCKPARTS` = Int;
public typealias `CLOCKSTATES` = Int;
public typealias `CLOSEBUTTONSTATES` = Int;
public typealias `CLOSESTATES` = Int;
public const val `CLP_TIME`: `CLOCKPARTS` = 1;
public const val `CLR_DEFAULT`: Int = -16777216;
public const val `CLR_HILIGHT`: Int = -16777216;
public const val `CLR_NONE`: Int = -1;
public const val `CLS_HOT`: `CLOCKSTATES` = 2;
public const val `CLS_NORMAL`: `CLOCKSTATES` = 1;
public const val `CLS_PRESSED`: `CLOCKSTATES` = 3;
public const val `CMB_MASKED`: UInt = 2u;
public const val `CMDLGS_DEFAULTED`: `COMMANDLINKGLYPHSTATES` = 5;
public const val `CMDLGS_DISABLED`: `COMMANDLINKGLYPHSTATES` = 4;
public const val `CMDLGS_HOT`: `COMMANDLINKGLYPHSTATES` = 2;
public const val `CMDLGS_NORMAL`: `COMMANDLINKGLYPHSTATES` = 1;
public const val `CMDLGS_PRESSED`: `COMMANDLINKGLYPHSTATES` = 3;
public const val `CMDLS_DEFAULTED`: `COMMANDLINKSTATES` = 5;
public const val `CMDLS_DEFAULTED_ANIMATING`: `COMMANDLINKSTATES` = 6;
public const val `CMDLS_DISABLED`: `COMMANDLINKSTATES` = 4;
public const val `CMDLS_HOT`: `COMMANDLINKSTATES` = 2;
public const val `CMDLS_NORMAL`: `COMMANDLINKSTATES` = 1;
public const val `CMDLS_PRESSED`: `COMMANDLINKSTATES` = 3;
public typealias `COLLAPSEBUTTONSTATES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLORMAP` (
    public var `from`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `to`: `super`.`super`.`Foundation`.`COLORREF`,
)
public const val `COLORMGMTDLGORD`: UInt = 1551u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLORSCHEME` (
    public var `dwSize`: UInt,
    public var `clrBtnHighlight`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrBtnShadow`: `super`.`super`.`Foundation`.`COLORREF`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMBOBOXEXITEMA` (
    public var `mask`: `COMBOBOX_EX_ITEM_FLAGS`,
    public var `iItem`: Long,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `iSelectedImage`: Int,
    public var `iOverlay`: Int,
    public var `iIndent`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 805:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMBOBOXEXITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMBOBOXEXITEMW` (
    public var `mask`: `COMBOBOX_EX_ITEM_FLAGS`,
    public var `iItem`: Long,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `iSelectedImage`: Int,
    public var `iOverlay`: Int,
    public var `iIndent`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 823:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMBOBOXEXITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMBOBOXINFO` (
    public var `cbSize`: UInt,
    public var `rcItem`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcButton`: `super`.`super`.`Foundation`.`RECT`,
    public var `stateButton`: `COMBOBOXINFO_BUTTON_STATE`,
    public var `hwndCombo`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndItem`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndList`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 839:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMBOBOXINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COMBOBOXINFO_BUTTON_STATE` = UInt;
public typealias `COMBOBOXPARTS` = Int;
public typealias `COMBOBOXSTYLESTATES` = Int;
public typealias `COMBOBOX_EX_ITEM_FLAGS` = UInt;
public const val `COMCTL32_VERSION`: UInt = 6u;
public typealias `COMMANDLINKGLYPHSTATES` = Int;
public typealias `COMMANDLINKSTATES` = Int;
public typealias `COMMUNICATIONSPARTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMPAREITEMSTRUCT` (
    public var `CtlType`: `DRAWITEMSTRUCT_CTL_TYPE`,
    public var `CtlID`: UInt,
    public var `hwndItem`: `super`.`super`.`Foundation`.`HWND`,
    public var `itemID1`: UInt,
    public var `itemData1`: ULong,
    public var `itemID2`: UInt,
    public var `itemData2`: ULong,
    public var `dwLocaleId`: UInt,
)
// UNSUPPORTED Rust 864:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMPAREITEMSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CONTENTALIGNMENT` = Int;
public typealias `CONTENTAREASTATES` = Int;
public typealias `CONTENTLINKSTATES` = Int;
public typealias `CONTENTPANESTATES` = Int;
public typealias `CONTROLLABELSTATES` = Int;
public typealias `CONTROLPANELPARTS` = Int;
public typealias `COPYSTATES` = Int;
public const val `CPANEL_BANNERAREA`: `CONTROLPANELPARTS` = 18;
public const val `CPANEL_BODYTEXT`: `CONTROLPANELPARTS` = 6;
public const val `CPANEL_BODYTITLE`: `CONTROLPANELPARTS` = 19;
public const val `CPANEL_BUTTON`: `CONTROLPANELPARTS` = 14;
public const val `CPANEL_CONTENTLINK`: `CONTROLPANELPARTS` = 10;
public const val `CPANEL_CONTENTPANE`: `CONTROLPANELPARTS` = 2;
public const val `CPANEL_CONTENTPANELABEL`: `CONTROLPANELPARTS` = 4;
public const val `CPANEL_CONTENTPANELINE`: `CONTROLPANELPARTS` = 17;
public const val `CPANEL_GROUPTEXT`: `CONTROLPANELPARTS` = 9;
public const val `CPANEL_HELPLINK`: `CONTROLPANELPARTS` = 7;
public const val `CPANEL_LARGECOMMANDAREA`: `CONTROLPANELPARTS` = 12;
public const val `CPANEL_MESSAGETEXT`: `CONTROLPANELPARTS` = 15;
public const val `CPANEL_NAVIGATIONPANE`: `CONTROLPANELPARTS` = 1;
public const val `CPANEL_NAVIGATIONPANELABEL`: `CONTROLPANELPARTS` = 3;
public const val `CPANEL_NAVIGATIONPANELINE`: `CONTROLPANELPARTS` = 16;
public const val `CPANEL_SECTIONTITLELINK`: `CONTROLPANELPARTS` = 11;
public const val `CPANEL_SMALLCOMMANDAREA`: `CONTROLPANELPARTS` = 13;
public const val `CPANEL_TASKLINK`: `CONTROLPANELPARTS` = 8;
public const val `CPANEL_TITLE`: `CONTROLPANELPARTS` = 5;
public const val `CPCL_DISABLED`: `CONTENTLINKSTATES` = 4;
public const val `CPCL_HOT`: `CONTENTLINKSTATES` = 2;
public const val `CPCL_NORMAL`: `CONTENTLINKSTATES` = 1;
public const val `CPCL_PRESSED`: `CONTENTLINKSTATES` = 3;
public const val `CPHL_DISABLED`: `HELPLINKSTATES` = 4;
public const val `CPHL_HOT`: `HELPLINKSTATES` = 2;
public const val `CPHL_NORMAL`: `HELPLINKSTATES` = 1;
public const val `CPHL_PRESSED`: `HELPLINKSTATES` = 3;
public const val `CPSTL_HOT`: `SECTIONTITLELINKSTATES` = 2;
public const val `CPSTL_NORMAL`: `SECTIONTITLELINKSTATES` = 1;
public const val `CPTL_DISABLED`: `TASKLINKSTATES` = 4;
public const val `CPTL_HOT`: `TASKLINKSTATES` = 2;
public const val `CPTL_NORMAL`: `TASKLINKSTATES` = 1;
public const val `CPTL_PAGE`: `TASKLINKSTATES` = 5;
public const val `CPTL_PRESSED`: `TASKLINKSTATES` = 3;
public const val `CP_BACKGROUND`: `COMBOBOXPARTS` = 2;
public const val `CP_BORDER`: `COMBOBOXPARTS` = 4;
public const val `CP_CUEBANNER`: `COMBOBOXPARTS` = 8;
public const val `CP_DROPDOWNBUTTON`: `COMBOBOXPARTS` = 1;
public const val `CP_DROPDOWNBUTTONLEFT`: `COMBOBOXPARTS` = 7;
public const val `CP_DROPDOWNBUTTONRIGHT`: `COMBOBOXPARTS` = 6;
public const val `CP_DROPDOWNITEM`: `COMBOBOXPARTS` = 9;
public const val `CP_READONLY`: `COMBOBOXPARTS` = 5;
public const val `CP_TRANSPARENTBACKGROUND`: `COMBOBOXPARTS` = 3;
public typealias `CREATELINKSTATES` = Int;
public const val `CSST_TAB`: `COMMUNICATIONSPARTS` = 1;
public const val `CSTB_HOT`: `TABSTATES` = 2;
public const val `CSTB_NORMAL`: `TABSTATES` = 1;
public const val `CSTB_SELECTED`: `TABSTATES` = 3;
public const val `CS_ACTIVE`: `CAPTIONSTATES` = 1;
public const val `CS_DISABLED`: `CAPTIONSTATES` = 3;
public const val `CS_INACTIVE`: `CAPTIONSTATES` = 2;
public typealias `CUEBANNERSTATES` = Int;
public typealias `DATEBORDERSTATES` = Int;
public typealias `DATEPICKERPARTS` = Int;
public typealias `DATETEXTSTATES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DATETIMEPICKERINFO` (
    public var `cbSize`: UInt,
    public var `rcCheck`: `super`.`super`.`Foundation`.`RECT`,
    public var `stateCheck`: UInt,
    public var `rcButton`: `super`.`super`.`Foundation`.`RECT`,
    public var `stateButton`: UInt,
    public var `hwndEdit`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndUD`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndDropDown`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 943:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DATETIMEPICKERINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DATETIMEPICK_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysDateTimePick32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DATETIMEPICK_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysDateTimePick32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DATETIMEPICK_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysDateTimePick32");
public const val `DA_ERR`: Int = -1;
public const val `DA_LAST`: UInt = 2147483647u;
public const val `DDCOPY_HIGHLIGHT`: `COPYSTATES` = 1;
public const val `DDCOPY_NOHIGHLIGHT`: `COPYSTATES` = 2;
public const val `DDCREATELINK_HIGHLIGHT`: `CREATELINKSTATES` = 1;
public const val `DDCREATELINK_NOHIGHLIGHT`: `CREATELINKSTATES` = 2;
public const val `DDL_ARCHIVE`: `DLG_DIR_LIST_FILE_TYPE` = 32u;
public const val `DDL_DIRECTORY`: `DLG_DIR_LIST_FILE_TYPE` = 16u;
public const val `DDL_DRIVES`: `DLG_DIR_LIST_FILE_TYPE` = 16384u;
public const val `DDL_EXCLUSIVE`: `DLG_DIR_LIST_FILE_TYPE` = 32768u;
public const val `DDL_HIDDEN`: `DLG_DIR_LIST_FILE_TYPE` = 2u;
public const val `DDL_POSTMSGS`: `DLG_DIR_LIST_FILE_TYPE` = 8192u;
public const val `DDL_READONLY`: `DLG_DIR_LIST_FILE_TYPE` = 1u;
public const val `DDL_READWRITE`: `DLG_DIR_LIST_FILE_TYPE` = 0u;
public const val `DDL_SYSTEM`: `DLG_DIR_LIST_FILE_TYPE` = 4u;
public const val `DDMOVE_HIGHLIGHT`: `MOVESTATES` = 1;
public const val `DDMOVE_NOHIGHLIGHT`: `MOVESTATES` = 2;
public const val `DDNONE_HIGHLIGHT`: `NONESTATES` = 1;
public const val `DDNONE_NOHIGHLIGHT`: `NONESTATES` = 2;
public const val `DDUPDATEMETADATA_HIGHLIGHT`: `UPDATEMETADATASTATES` = 1;
public const val `DDUPDATEMETADATA_NOHIGHLIGHT`: `UPDATEMETADATASTATES` = 2;
public const val `DDWARNING_HIGHLIGHT`: `WARNINGSTATES` = 1;
public const val `DDWARNING_NOHIGHLIGHT`: `WARNINGSTATES` = 2;
public const val `DD_COPY`: `DRAGDROPPARTS` = 1;
public const val `DD_CREATELINK`: `DRAGDROPPARTS` = 4;
public const val `DD_IMAGEBG`: `DRAGDROPPARTS` = 7;
public const val `DD_MOVE`: `DRAGDROPPARTS` = 2;
public const val `DD_NONE`: `DRAGDROPPARTS` = 6;
public const val `DD_TEXTBG`: `DRAGDROPPARTS` = 8;
public const val `DD_UPDATEMETADATA`: `DRAGDROPPARTS` = 3;
public const val `DD_WARNING`: `DRAGDROPPARTS` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DELETEITEMSTRUCT` (
    public var `CtlType`: `DRAWITEMSTRUCT_CTL_TYPE`,
    public var `CtlID`: UInt,
    public var `itemID`: UInt,
    public var `hwndItem`: `super`.`super`.`Foundation`.`HWND`,
    public var `itemData`: ULong,
)
// UNSUPPORTED Rust 991:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DELETEITEMSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DLG_BUTTON_CHECK_STATE` = UInt;
public typealias `DLG_DIR_LIST_FILE_TYPE` = UInt;
public const val `DL_BEGINDRAG`: `DRAGLISTINFO_NOTIFICATION_FLAGS` = 1157u;
public const val `DL_CANCELDRAG`: `DRAGLISTINFO_NOTIFICATION_FLAGS` = 1160u;
public const val `DL_COPYCURSOR`: UInt = 2u;
public const val `DL_CURSORSET`: UInt = 0u;
public const val `DL_DRAGGING`: `DRAGLISTINFO_NOTIFICATION_FLAGS` = 1158u;
public const val `DL_DROPPED`: `DRAGLISTINFO_NOTIFICATION_FLAGS` = 1159u;
public const val `DL_MOVECURSOR`: UInt = 3u;
public const val `DL_STOPCURSOR`: UInt = 1u;
public const val `DNHZS_DISABLED`: `DOWNHORZSTATES` = 4;
public const val `DNHZS_HOT`: `DOWNHORZSTATES` = 2;
public const val `DNHZS_NORMAL`: `DOWNHORZSTATES` = 1;
public const val `DNHZS_PRESSED`: `DOWNHORZSTATES` = 3;
public const val `DNS_DISABLED`: `DOWNSTATES` = 4;
public const val `DNS_HOT`: `DOWNSTATES` = 2;
public const val `DNS_NORMAL`: `DOWNSTATES` = 1;
public const val `DNS_PRESSED`: `DOWNSTATES` = 3;
public typealias `DOWNHORZSTATES` = Int;
public typealias `DOWNSTATES` = Int;
public const val `DPAMM_DELETE`: `DPAMM_MESSAGE` = 2u;
public const val `DPAMM_INSERT`: `DPAMM_MESSAGE` = 3u;
public const val `DPAMM_MERGE`: `DPAMM_MESSAGE` = 1u;
public typealias `DPAMM_MESSAGE` = UInt;
public const val `DPAM_INTERSECT`: UInt = 8u;
public const val `DPAM_NORMAL`: UInt = 2u;
public const val `DPAM_SORTED`: UInt = 1u;
public const val `DPAM_UNION`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DPASTREAMINFO` (
    public var `iPos`: Int,
    public var `pvItem`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1030:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DPASTREAMINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DPAS_INSERTAFTER`: UInt = 4u;
public const val `DPAS_INSERTBEFORE`: UInt = 2u;
public const val `DPAS_SORTED`: UInt = 1u;
public const val `DPA_APPEND`: UInt = 2147483647u;
public const val `DPA_ERR`: Int = -1;
public const val `DPDB_DISABLED`: `DATEBORDERSTATES` = 4;
public const val `DPDB_FOCUSED`: `DATEBORDERSTATES` = 3;
public const val `DPDB_HOT`: `DATEBORDERSTATES` = 2;
public const val `DPDB_NORMAL`: `DATEBORDERSTATES` = 1;
public const val `DPDT_DISABLED`: `DATETEXTSTATES` = 2;
public const val `DPDT_NORMAL`: `DATETEXTSTATES` = 1;
public const val `DPDT_SELECTED`: `DATETEXTSTATES` = 3;
public const val `DPSCBR_DISABLED`: `SHOWCALENDARBUTTONRIGHTSTATES` = 4;
public const val `DPSCBR_HOT`: `SHOWCALENDARBUTTONRIGHTSTATES` = 2;
public const val `DPSCBR_NORMAL`: `SHOWCALENDARBUTTONRIGHTSTATES` = 1;
public const val `DPSCBR_PRESSED`: `SHOWCALENDARBUTTONRIGHTSTATES` = 3;
public const val `DP_DATEBORDER`: `DATEPICKERPARTS` = 2;
public const val `DP_DATETEXT`: `DATEPICKERPARTS` = 1;
public const val `DP_SHOWCALENDARBUTTONRIGHT`: `DATEPICKERPARTS` = 3;
public typealias `DRAGDROPPARTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRAGLISTINFO` (
    public var `uNotification`: `DRAGLISTINFO_NOTIFICATION_FLAGS`,
    public var `hWnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `ptCursor`: `super`.`super`.`Foundation`.`POINT`,
)
// UNSUPPORTED Rust 1062:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRAGLISTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DRAGLISTINFO_NOTIFICATION_FLAGS` = UInt;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DRAGLISTMSGSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commctrl_DragListMsg");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRAWITEMSTRUCT` (
    public var `CtlType`: `DRAWITEMSTRUCT_CTL_TYPE`,
    public var `CtlID`: UInt,
    public var `itemID`: UInt,
    public var `itemAction`: `ODA_FLAGS`,
    public var `itemState`: `ODS_FLAGS`,
    public var `hwndItem`: `super`.`super`.`Foundation`.`HWND`,
    public var `hDC`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `rcItem`: `super`.`super`.`Foundation`.`RECT`,
    public var `itemData`: ULong,
)
// UNSUPPORTED Rust 1083:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DRAWITEMSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DRAWITEMSTRUCT_CTL_TYPE` = UInt;
public typealias `DRAW_THEME_PARENT_BACKGROUND_FLAGS` = UInt;
public typealias `DROPDOWNBUTTONLEFTSTATES` = Int;
public typealias `DROPDOWNBUTTONRIGHTSTATES` = Int;
public typealias `DROPDOWNITEMSTATES` = Int;
public const val `DSA_APPEND`: UInt = 2147483647u;
public const val `DSA_ERR`: Int = -1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTBGOPTS` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `rcClip`: `super`.`super`.`Foundation`.`RECT`,
)
public const val `DTBG_CLIPRECT`: UInt = 1u;
public const val `DTBG_COMPUTINGREGION`: UInt = 16u;
public const val `DTBG_DRAWSOLID`: UInt = 2u;
public const val `DTBG_MIRRORDC`: UInt = 32u;
public const val `DTBG_NOMIRROR`: UInt = 64u;
public const val `DTBG_OMITBORDER`: UInt = 4u;
public const val `DTBG_OMITCONTENT`: UInt = 8u;
public const val `DTM_CLOSEMONTHCAL`: UInt = 4109u;
public const val `DTM_FIRST`: UInt = 4096u;
public const val `DTM_GETDATETIMEPICKERINFO`: UInt = 4110u;
public const val `DTM_GETIDEALSIZE`: UInt = 4111u;
public const val `DTM_GETMCCOLOR`: UInt = 4103u;
public const val `DTM_GETMCFONT`: UInt = 4106u;
public const val `DTM_GETMCSTYLE`: UInt = 4108u;
public const val `DTM_GETMONTHCAL`: UInt = 4104u;
public const val `DTM_GETRANGE`: UInt = 4099u;
public const val `DTM_GETSYSTEMTIME`: UInt = 4097u;
public const val `DTM_SETFORMAT`: UInt = 4146u;
public const val `DTM_SETFORMATA`: UInt = 4101u;
public const val `DTM_SETFORMATW`: UInt = 4146u;
public const val `DTM_SETMCCOLOR`: UInt = 4102u;
public const val `DTM_SETMCFONT`: UInt = 4105u;
public const val `DTM_SETMCSTYLE`: UInt = 4107u;
public const val `DTM_SETRANGE`: UInt = 4100u;
public const val `DTM_SETSYSTEMTIME`: UInt = 4098u;
public const val `DTN_CLOSEUP`: UInt = 4294966543u;
public const val `DTN_DATETIMECHANGE`: UInt = 4294966537u;
public const val `DTN_DROPDOWN`: UInt = 4294966542u;
public const val `DTN_FIRST`: UInt = 4294966556u;
public const val `DTN_FIRST2`: UInt = 4294966543u;
public const val `DTN_FORMAT`: UInt = 4294966553u;
public const val `DTN_FORMATA`: UInt = 4294966540u;
public const val `DTN_FORMATQUERY`: UInt = 4294966554u;
public const val `DTN_FORMATQUERYA`: UInt = 4294966541u;
public const val `DTN_FORMATQUERYW`: UInt = 4294966554u;
public const val `DTN_FORMATW`: UInt = 4294966553u;
public const val `DTN_LAST`: UInt = 4294966551u;
public const val `DTN_LAST2`: UInt = 4294966497u;
public const val `DTN_USERSTRING`: UInt = 4294966551u;
public const val `DTN_USERSTRINGA`: UInt = 4294966538u;
public const val `DTN_USERSTRINGW`: UInt = 4294966551u;
public const val `DTN_WMKEYDOWN`: UInt = 4294966552u;
public const val `DTN_WMKEYDOWNA`: UInt = 4294966539u;
public const val `DTN_WMKEYDOWNW`: UInt = 4294966552u;
public const val `DTPB_USECTLCOLORSTATIC`: `DRAW_THEME_PARENT_BACKGROUND_FLAGS` = 2u;
public const val `DTPB_USEERASEBKGND`: `DRAW_THEME_PARENT_BACKGROUND_FLAGS` = 4u;
public const val `DTPB_WINDOWDC`: `DRAW_THEME_PARENT_BACKGROUND_FLAGS` = 1u;
public const val `DTS_APPCANPARSE`: UInt = 16u;
public const val `DTS_LONGDATEFORMAT`: UInt = 4u;
public const val `DTS_RIGHTALIGN`: UInt = 32u;
public const val `DTS_SHORTDATECENTURYFORMAT`: UInt = 12u;
public const val `DTS_SHORTDATEFORMAT`: UInt = 0u;
public const val `DTS_SHOWNONE`: UInt = 2u;
public const val `DTS_TIMEFORMAT`: UInt = 9u;
public const val `DTS_UPDOWN`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DTTOPTS` (
    public var `dwSize`: UInt,
    public var `dwFlags`: `DTTOPTS_FLAGS`,
    public var `crText`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `crBorder`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `crShadow`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iTextShadowType`: Int,
    public var `ptShadowOffset`: `super`.`super`.`Foundation`.`POINT`,
    public var `iBorderSize`: Int,
    public var `iFontPropId`: Int,
    public var `iColorPropId`: Int,
    public var `iStateId`: Int,
    public var `fApplyOverlay`: `windows_sys`.`core`.`BOOL`,
    public var `iGlowSize`: Int,
    public var `pfnDrawTextCallback`: `DTT_CALLBACK_PROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
public typealias `DTTOPTS_FLAGS` = UInt;
public const val `DTT_APPLYOVERLAY`: `DTTOPTS_FLAGS` = 1024u;
public const val `DTT_BORDERCOLOR`: `DTTOPTS_FLAGS` = 2u;
public const val `DTT_BORDERSIZE`: `DTTOPTS_FLAGS` = 32u;
public const val `DTT_CALCRECT`: `DTTOPTS_FLAGS` = 512u;
public const val `DTT_CALLBACK`: `DTTOPTS_FLAGS` = 4096u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `DTT_CALLBACK_PROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Graphics`.`Gdi`.`HDC`, `windows_sys`.`core`.`PWSTR`, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, UInt, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
public const val `DTT_COLORPROP`: `DTTOPTS_FLAGS` = 128u;
public const val `DTT_COMPOSITED`: `DTTOPTS_FLAGS` = 8192u;
public const val `DTT_FLAGS2VALIDBITS`: UInt = 1u;
public const val `DTT_FONTPROP`: `DTTOPTS_FLAGS` = 64u;
public const val `DTT_GLOWSIZE`: `DTTOPTS_FLAGS` = 2048u;
public const val `DTT_GRAYED`: UInt = 1u;
public const val `DTT_SHADOWCOLOR`: `DTTOPTS_FLAGS` = 4u;
public const val `DTT_SHADOWOFFSET`: `DTTOPTS_FLAGS` = 16u;
public const val `DTT_SHADOWTYPE`: `DTTOPTS_FLAGS` = 8u;
public const val `DTT_STATEID`: `DTTOPTS_FLAGS` = 256u;
public const val `DTT_TEXTCOLOR`: `DTTOPTS_FLAGS` = 1u;
public const val `DTT_VALIDBITS`: `DTTOPTS_FLAGS` = 12287u;
public const val `EBHC_HOT`: `HEADERCLOSESTATES` = 2;
public const val `EBHC_NORMAL`: `HEADERCLOSESTATES` = 1;
public const val `EBHC_PRESSED`: `HEADERCLOSESTATES` = 3;
public const val `EBHP_HOT`: `HEADERPINSTATES` = 2;
public const val `EBHP_NORMAL`: `HEADERPINSTATES` = 1;
public const val `EBHP_PRESSED`: `HEADERPINSTATES` = 3;
public const val `EBHP_SELECTEDHOT`: `HEADERPINSTATES` = 5;
public const val `EBHP_SELECTEDNORMAL`: `HEADERPINSTATES` = 4;
public const val `EBHP_SELECTEDPRESSED`: `HEADERPINSTATES` = 6;
public const val `EBM_HOT`: `IEBARMENUSTATES` = 2;
public const val `EBM_NORMAL`: `IEBARMENUSTATES` = 1;
public const val `EBM_PRESSED`: `IEBARMENUSTATES` = 3;
public const val `EBNGC_HOT`: `NORMALGROUPCOLLAPSESTATES` = 2;
public const val `EBNGC_NORMAL`: `NORMALGROUPCOLLAPSESTATES` = 1;
public const val `EBNGC_PRESSED`: `NORMALGROUPCOLLAPSESTATES` = 3;
public const val `EBNGE_HOT`: `NORMALGROUPEXPANDSTATES` = 2;
public const val `EBNGE_NORMAL`: `NORMALGROUPEXPANDSTATES` = 1;
public const val `EBNGE_PRESSED`: `NORMALGROUPEXPANDSTATES` = 3;
public const val `EBP_HEADERBACKGROUND`: `EXPLORERBARPARTS` = 1;
public const val `EBP_HEADERCLOSE`: `EXPLORERBARPARTS` = 2;
public const val `EBP_HEADERPIN`: `EXPLORERBARPARTS` = 3;
public const val `EBP_IEBARMENU`: `EXPLORERBARPARTS` = 4;
public const val `EBP_NORMALGROUPBACKGROUND`: `EXPLORERBARPARTS` = 5;
public const val `EBP_NORMALGROUPCOLLAPSE`: `EXPLORERBARPARTS` = 6;
public const val `EBP_NORMALGROUPEXPAND`: `EXPLORERBARPARTS` = 7;
public const val `EBP_NORMALGROUPHEAD`: `EXPLORERBARPARTS` = 8;
public const val `EBP_SPECIALGROUPBACKGROUND`: `EXPLORERBARPARTS` = 9;
public const val `EBP_SPECIALGROUPCOLLAPSE`: `EXPLORERBARPARTS` = 10;
public const val `EBP_SPECIALGROUPEXPAND`: `EXPLORERBARPARTS` = 11;
public const val `EBP_SPECIALGROUPHEAD`: `EXPLORERBARPARTS` = 12;
public const val `EBSGC_HOT`: `SPECIALGROUPCOLLAPSESTATES` = 2;
public const val `EBSGC_NORMAL`: `SPECIALGROUPCOLLAPSESTATES` = 1;
public const val `EBSGC_PRESSED`: `SPECIALGROUPCOLLAPSESTATES` = 3;
public const val `EBSGE_HOT`: `SPECIALGROUPEXPANDSTATES` = 2;
public const val `EBSGE_NORMAL`: `SPECIALGROUPEXPANDSTATES` = 1;
public const val `EBSGE_PRESSED`: `SPECIALGROUPEXPANDSTATES` = 3;
public const val `EBS_ASSIST`: `BACKGROUNDSTATES` = 6;
public const val `EBS_DISABLED`: `BACKGROUNDSTATES` = 3;
public const val `EBS_FOCUSED`: `BACKGROUNDSTATES` = 4;
public const val `EBS_HOT`: `BACKGROUNDSTATES` = 2;
public const val `EBS_NORMAL`: `BACKGROUNDSTATES` = 1;
public const val `EBS_READONLY`: `BACKGROUNDSTATES` = 5;
public const val `EBWBS_DISABLED`: `BACKGROUNDWITHBORDERSTATES` = 3;
public const val `EBWBS_FOCUSED`: `BACKGROUNDWITHBORDERSTATES` = 4;
public const val `EBWBS_HOT`: `BACKGROUNDWITHBORDERSTATES` = 2;
public const val `EBWBS_NORMAL`: `BACKGROUNDWITHBORDERSTATES` = 1;
public const val `ECM_FIRST`: UInt = 5376u;
public typealias `EC_ENDOFLINE` = Int;
public const val `EC_ENDOFLINE_CR`: `EC_ENDOFLINE` = 2;
public const val `EC_ENDOFLINE_CRLF`: `EC_ENDOFLINE` = 1;
public const val `EC_ENDOFLINE_DETECTFROMCONTENT`: `EC_ENDOFLINE` = 0;
public const val `EC_ENDOFLINE_LF`: `EC_ENDOFLINE` = 3;
public typealias `EC_SEARCHWEB_ENTRYPOINT` = Int;
public const val `EC_SEARCHWEB_ENTRYPOINT_CONTEXTMENU`: `EC_SEARCHWEB_ENTRYPOINT` = 1;
public const val `EC_SEARCHWEB_ENTRYPOINT_EXTERNAL`: `EC_SEARCHWEB_ENTRYPOINT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EDITBALLOONTIP` (
    public var `cbStruct`: UInt,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszText`: `windows_sys`.`core`.`PCWSTR`,
    public var `ttiIcon`: `EDITBALLOONTIP_ICON`,
)
// UNSUPPORTED Rust 1261:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EDITBALLOONTIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EDITBALLOONTIP_ICON` = Int;
public typealias `EDITBORDER_HSCROLLSTATES` = Int;
public typealias `EDITBORDER_HVSCROLLSTATES` = Int;
public typealias `EDITBORDER_NOSCROLLSTATES` = Int;
public typealias `EDITBORDER_VSCROLLSTATES` = Int;
public typealias `EDITPARTS` = Int;
public typealias `EDITTEXTSTATES` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EDITWORDBREAKPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, Int, Int, `WORD_BREAK_ACTION`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EDITWORDBREAKPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, Int, Int, `WORD_BREAK_ACTION`) -> Int>>>;
public const val `EMF_CENTERED`: `NMLVEMPTYMARKUP_FLAGS` = 1u;
public typealias `EMPTYMARKUPPARTS` = Int;
public const val `EMP_MARKUPTEXT`: `EMPTYMARKUPPARTS` = 1;
public const val `EMT_LINKTEXT`: `MARKUPTEXTSTATES` = 2;
public const val `EMT_NORMALTEXT`: `MARKUPTEXTSTATES` = 1;
public const val `EM_CANUNDO`: UInt = 198u;
public const val `EM_CHARFROMPOS`: UInt = 215u;
public const val `EM_EMPTYUNDOBUFFER`: UInt = 205u;
public const val `EM_ENABLEFEATURE`: UInt = 218u;
public const val `EM_ENABLESEARCHWEB`: UInt = 5390u;
public const val `EM_FILELINEFROMCHAR`: UInt = 5395u;
public const val `EM_FILELINEINDEX`: UInt = 5396u;
public const val `EM_FILELINELENGTH`: UInt = 5397u;
public const val `EM_FMTLINES`: UInt = 200u;
public const val `EM_GETCARETINDEX`: UInt = 5394u;
public const val `EM_GETCUEBANNER`: UInt = 5378u;
public const val `EM_GETENDOFLINE`: UInt = 5389u;
public const val `EM_GETEXTENDEDSTYLE`: UInt = 5387u;
public const val `EM_GETFILELINE`: UInt = 5398u;
public const val `EM_GETFILELINECOUNT`: UInt = 5399u;
public const val `EM_GETFIRSTVISIBLELINE`: UInt = 206u;
public const val `EM_GETHANDLE`: UInt = 189u;
public const val `EM_GETHILITE`: UInt = 5382u;
public const val `EM_GETIMESTATUS`: UInt = 217u;
public const val `EM_GETLIMITTEXT`: UInt = 213u;
public const val `EM_GETLINE`: UInt = 196u;
public const val `EM_GETLINECOUNT`: UInt = 186u;
public const val `EM_GETMARGINS`: UInt = 212u;
public const val `EM_GETMODIFY`: UInt = 184u;
public const val `EM_GETPASSWORDCHAR`: UInt = 210u;
public const val `EM_GETRECT`: UInt = 178u;
public const val `EM_GETSEL`: UInt = 176u;
public const val `EM_GETTHUMB`: UInt = 190u;
public const val `EM_GETWORDBREAKPROC`: UInt = 209u;
public const val `EM_HIDEBALLOONTIP`: UInt = 5380u;
public const val `EM_LIMITTEXT`: UInt = 197u;
public const val `EM_LINEFROMCHAR`: UInt = 201u;
public const val `EM_LINEINDEX`: UInt = 187u;
public const val `EM_LINELENGTH`: UInt = 193u;
public const val `EM_LINESCROLL`: UInt = 182u;
public const val `EM_NOSETFOCUS`: UInt = 5383u;
public const val `EM_POSFROMCHAR`: UInt = 214u;
public const val `EM_REPLACESEL`: UInt = 194u;
public const val `EM_SCROLL`: UInt = 181u;
public const val `EM_SCROLLCARET`: UInt = 183u;
public const val `EM_SEARCHWEB`: UInt = 5391u;
public const val `EM_SETCARETINDEX`: UInt = 5393u;
public const val `EM_SETCUEBANNER`: UInt = 5377u;
public const val `EM_SETENDOFLINE`: UInt = 5388u;
public const val `EM_SETEXTENDEDSTYLE`: UInt = 5386u;
public const val `EM_SETHANDLE`: UInt = 188u;
public const val `EM_SETHILITE`: UInt = 5381u;
public const val `EM_SETIMESTATUS`: UInt = 216u;
public const val `EM_SETLIMITTEXT`: UInt = 197u;
public const val `EM_SETMARGINS`: UInt = 211u;
public const val `EM_SETMODIFY`: UInt = 185u;
public const val `EM_SETPASSWORDCHAR`: UInt = 204u;
public const val `EM_SETREADONLY`: UInt = 207u;
public const val `EM_SETRECT`: UInt = 179u;
public const val `EM_SETRECTNP`: UInt = 180u;
public const val `EM_SETSEL`: UInt = 177u;
public const val `EM_SETTABSTOPS`: UInt = 203u;
public const val `EM_SETWORDBREAKPROC`: UInt = 208u;
public const val `EM_SHOWBALLOONTIP`: UInt = 5379u;
public const val `EM_TAKEFOCUS`: UInt = 5384u;
public const val `EM_UNDO`: UInt = 199u;
public typealias `ENABLE_SCROLL_BAR_ARROWS` = UInt;
public const val `EN_FIRST`: UInt = 4294965776u;
public const val `EN_LAST`: UInt = 4294965756u;
public const val `EN_SEARCHWEB`: UInt = 4294965776u;
public const val `EPSHV_DISABLED`: `EDITBORDER_HVSCROLLSTATES` = 4;
public const val `EPSHV_FOCUSED`: `EDITBORDER_HVSCROLLSTATES` = 3;
public const val `EPSHV_HOT`: `EDITBORDER_HVSCROLLSTATES` = 2;
public const val `EPSHV_NORMAL`: `EDITBORDER_HVSCROLLSTATES` = 1;
public const val `EPSH_DISABLED`: `EDITBORDER_HSCROLLSTATES` = 4;
public const val `EPSH_FOCUSED`: `EDITBORDER_HSCROLLSTATES` = 3;
public const val `EPSH_HOT`: `EDITBORDER_HSCROLLSTATES` = 2;
public const val `EPSH_NORMAL`: `EDITBORDER_HSCROLLSTATES` = 1;
public const val `EPSN_DISABLED`: `EDITBORDER_NOSCROLLSTATES` = 4;
public const val `EPSN_FOCUSED`: `EDITBORDER_NOSCROLLSTATES` = 3;
public const val `EPSN_HOT`: `EDITBORDER_NOSCROLLSTATES` = 2;
public const val `EPSN_NORMAL`: `EDITBORDER_NOSCROLLSTATES` = 1;
public const val `EPSV_DISABLED`: `EDITBORDER_VSCROLLSTATES` = 4;
public const val `EPSV_FOCUSED`: `EDITBORDER_VSCROLLSTATES` = 3;
public const val `EPSV_HOT`: `EDITBORDER_VSCROLLSTATES` = 2;
public const val `EPSV_NORMAL`: `EDITBORDER_VSCROLLSTATES` = 1;
public const val `EP_BACKGROUND`: `EDITPARTS` = 3;
public const val `EP_BACKGROUNDWITHBORDER`: `EDITPARTS` = 5;
public const val `EP_CARET`: `EDITPARTS` = 2;
public const val `EP_EDITBORDER_HSCROLL`: `EDITPARTS` = 7;
public const val `EP_EDITBORDER_HVSCROLL`: `EDITPARTS` = 9;
public const val `EP_EDITBORDER_NOSCROLL`: `EDITPARTS` = 6;
public const val `EP_EDITBORDER_VSCROLL`: `EDITPARTS` = 8;
public const val `EP_EDITTEXT`: `EDITPARTS` = 1;
public const val `EP_PASSWORD`: `EDITPARTS` = 4;
public const val `ESB_DISABLE_BOTH`: `ENABLE_SCROLL_BAR_ARROWS` = 3u;
public const val `ESB_DISABLE_DOWN`: `ENABLE_SCROLL_BAR_ARROWS` = 2u;
public const val `ESB_DISABLE_LEFT`: `ENABLE_SCROLL_BAR_ARROWS` = 1u;
public const val `ESB_DISABLE_LTUP`: `ENABLE_SCROLL_BAR_ARROWS` = 1u;
public const val `ESB_DISABLE_RIGHT`: `ENABLE_SCROLL_BAR_ARROWS` = 2u;
public const val `ESB_DISABLE_RTDN`: `ENABLE_SCROLL_BAR_ARROWS` = 2u;
public const val `ESB_DISABLE_UP`: `ENABLE_SCROLL_BAR_ARROWS` = 1u;
public const val `ESB_ENABLE_BOTH`: `ENABLE_SCROLL_BAR_ARROWS` = 0u;
public const val `ES_EX_ALLOWEOL_CR`: Int = 1;
public const val `ES_EX_ALLOWEOL_LF`: Int = 2;
public const val `ES_EX_CONVERT_EOL_ON_PASTE`: Int = 4;
public const val `ES_EX_ZOOMABLE`: Int = 16;
public const val `ETDT_DISABLE`: UInt = 1u;
public const val `ETDT_ENABLE`: UInt = 2u;
public const val `ETDT_USEAEROWIZARDTABTEXTURE`: UInt = 8u;
public const val `ETDT_USETABTEXTURE`: UInt = 4u;
public const val `ETS_ASSIST`: `EDITTEXTSTATES` = 7;
public const val `ETS_CUEBANNER`: `EDITTEXTSTATES` = 8;
public const val `ETS_DISABLED`: `EDITTEXTSTATES` = 4;
public const val `ETS_FOCUSED`: `EDITTEXTSTATES` = 5;
public const val `ETS_HOT`: `EDITTEXTSTATES` = 2;
public const val `ETS_NORMAL`: `EDITTEXTSTATES` = 1;
public const val `ETS_READONLY`: `EDITTEXTSTATES` = 6;
public const val `ETS_SELECTED`: `EDITTEXTSTATES` = 3;
public typealias `EXPANDBUTTONSTATES` = Int;
public typealias `EXPANDOBUTTONSTATES` = Int;
public typealias `EXPLORERBARPARTS` = Int;
public const val `FBS_EMPHASIZED`: `BODYSTATES` = 2;
public const val `FBS_NORMAL`: `BODYSTATES` = 1;
public const val `FEEDBACK_GESTURE_PRESSANDTAP`: `FEEDBACK_TYPE` = 11;
public const val `FEEDBACK_MAX`: `FEEDBACK_TYPE` = -1;
public const val `FEEDBACK_PEN_BARRELVISUALIZATION`: `FEEDBACK_TYPE` = 2;
public const val `FEEDBACK_PEN_DOUBLETAP`: `FEEDBACK_TYPE` = 4;
public const val `FEEDBACK_PEN_PRESSANDHOLD`: `FEEDBACK_TYPE` = 5;
public const val `FEEDBACK_PEN_RIGHTTAP`: `FEEDBACK_TYPE` = 6;
public const val `FEEDBACK_PEN_TAP`: `FEEDBACK_TYPE` = 3;
public const val `FEEDBACK_TOUCH_CONTACTVISUALIZATION`: `FEEDBACK_TYPE` = 1;
public const val `FEEDBACK_TOUCH_DOUBLETAP`: `FEEDBACK_TYPE` = 8;
public const val `FEEDBACK_TOUCH_PRESSANDHOLD`: `FEEDBACK_TYPE` = 9;
public const val `FEEDBACK_TOUCH_RIGHTTAP`: `FEEDBACK_TYPE` = 10;
public const val `FEEDBACK_TOUCH_TAP`: `FEEDBACK_TYPE` = 7;
public typealias `FEEDBACK_TYPE` = Int;
public const val `FILEOPENORD`: UInt = 1536u;
public typealias `FILLSTATES` = Int;
public typealias `FILLTYPE` = Int;
public typealias `FILLVERTSTATES` = Int;
public const val `FINDDLGORD`: UInt = 1540u;
public const val `FLH_HOVER`: `LINKHEADERSTATES` = 2;
public const val `FLH_NORMAL`: `LINKHEADERSTATES` = 1;
public const val `FLS_DISABLED`: `LABELSTATES` = 4;
public const val `FLS_EMPHASIZED`: `LABELSTATES` = 3;
public const val `FLS_NORMAL`: `LABELSTATES` = 1;
public const val `FLS_SELECTED`: `LABELSTATES` = 2;
public const val `FLYOUTLINK_HOVER`: `LINKSTATES` = 2;
public const val `FLYOUTLINK_NORMAL`: `LINKSTATES` = 1;
public typealias `FLYOUTPARTS` = Int;
public const val `FLYOUT_BODY`: `FLYOUTPARTS` = 2;
public const val `FLYOUT_DIVIDER`: `FLYOUTPARTS` = 5;
public const val `FLYOUT_HEADER`: `FLYOUTPARTS` = 1;
public const val `FLYOUT_LABEL`: `FLYOUTPARTS` = 3;
public const val `FLYOUT_LINK`: `FLYOUTPARTS` = 4;
public const val `FLYOUT_LINKAREA`: `FLYOUTPARTS` = 7;
public const val `FLYOUT_LINKHEADER`: `FLYOUTPARTS` = 8;
public const val `FLYOUT_WINDOW`: `FLYOUTPARTS` = 6;
public const val `FONTDLGORD`: UInt = 1542u;
public const val `FORMATDLGORD30`: UInt = 1544u;
public const val `FORMATDLGORD31`: UInt = 1543u;
public typealias `FRAMEBOTTOMSTATES` = Int;
public typealias `FRAMELEFTSTATES` = Int;
public typealias `FRAMERIGHTSTATES` = Int;
public typealias `FRAMESTATES` = Int;
public const val `FRB_ACTIVE`: `FRAMEBOTTOMSTATES` = 1;
public const val `FRB_INACTIVE`: `FRAMEBOTTOMSTATES` = 2;
public const val `FRL_ACTIVE`: `FRAMELEFTSTATES` = 1;
public const val `FRL_INACTIVE`: `FRAMELEFTSTATES` = 2;
public const val `FRR_ACTIVE`: `FRAMERIGHTSTATES` = 1;
public const val `FRR_INACTIVE`: `FRAMERIGHTSTATES` = 2;
public const val `FSB_ENCARTA_MODE`: UInt = 1u;
public const val `FSB_FLAT_MODE`: UInt = 2u;
public const val `FSB_REGULAR_MODE`: UInt = 0u;
public const val `FS_ACTIVE`: `FRAMESTATES` = 1;
public const val `FS_INACTIVE`: `FRAMESTATES` = 2;
public const val `FT_HORZGRADIENT`: `FILLTYPE` = 2;
public const val `FT_RADIALGRADIENT`: `FILLTYPE` = 3;
public const val `FT_SOLID`: `FILLTYPE` = 0;
public const val `FT_TILEIMAGE`: `FILLTYPE` = 4;
public const val `FT_VERTGRADIENT`: `FILLTYPE` = 1;
public const val `GBF_COPY`: `GET_THEME_BITMAP_FLAGS` = 2u;
public const val `GBF_DIRECT`: `GET_THEME_BITMAP_FLAGS` = 1u;
public const val `GBF_VALIDBITS`: `GET_THEME_BITMAP_FLAGS` = 3u;
public const val `GBS_DISABLED`: `GROUPBOXSTATES` = 2;
public const val `GBS_NORMAL`: `GROUPBOXSTATES` = 1;
public const val `GDTR_MAX`: UInt = 2u;
public const val `GDTR_MIN`: UInt = 1u;
public const val `GDT_ERROR`: Int = -1;
public const val `GDT_NONE`: `NMDATETIMECHANGE_FLAGS` = 1u;
public const val `GDT_VALID`: `NMDATETIMECHANGE_FLAGS` = 0u;
public typealias `GET_THEME_BITMAP_FLAGS` = UInt;
public const val `GFST_DPI`: `GLYPHFONTSIZINGTYPE` = 2;
public const val `GFST_NONE`: `GLYPHFONTSIZINGTYPE` = 0;
public const val `GFST_SIZE`: `GLYPHFONTSIZINGTYPE` = 1;
public const val `GLPS_CLOSED`: `GLYPHSTATES` = 1;
public const val `GLPS_OPENED`: `GLYPHSTATES` = 2;
public typealias `GLYPHFONTSIZINGTYPE` = Int;
public typealias `GLYPHSTATES` = Int;
public typealias `GLYPHTYPE` = Int;
public const val `GMR_DAYSTATE`: UInt = 1u;
public const val `GMR_VISIBLE`: UInt = 0u;
public typealias `GRIDCELLBACKGROUNDSTATES` = Int;
public typealias `GRIDCELLSTATES` = Int;
public typealias `GRIDCELLUPPERSTATES` = Int;
public typealias `GRIPPERSTATES` = Int;
public typealias `GROUPBOXSTATES` = Int;
public typealias `GROUPHEADERLINESTATES` = Int;
public typealias `GROUPHEADERSTATES` = Int;
public const val `GT_FONTGLYPH`: `GLYPHTYPE` = 2;
public const val `GT_IMAGEGLYPH`: `GLYPHTYPE` = 1;
public const val `GT_NONE`: `GLYPHTYPE` = 0;
public typealias `HALIGN` = Int;
public const val `HA_CENTER`: `HALIGN` = 1;
public const val `HA_LEFT`: `HALIGN` = 0;
public const val `HA_RIGHT`: `HALIGN` = 2;
public const val `HBG_DETAILS`: `HEADERSTYLESTATES` = 1;
public const val `HBG_ICON`: `HEADERSTYLESTATES` = 2;
public const val `HBS_DISABLED`: `HELPBUTTONSTATES` = 4;
public const val `HBS_HOT`: `HELPBUTTONSTATES` = 2;
public const val `HBS_NORMAL`: `HELPBUTTONSTATES` = 1;
public const val `HBS_PUSHED`: `HELPBUTTONSTATES` = 3;
public const val `HDDFS_HOT`: `HEADERDROPDOWNFILTERSTATES` = 3;
public const val `HDDFS_NORMAL`: `HEADERDROPDOWNFILTERSTATES` = 1;
public const val `HDDFS_SOFTHOT`: `HEADERDROPDOWNFILTERSTATES` = 2;
public const val `HDDS_HOT`: `HEADERDROPDOWNSTATES` = 3;
public const val `HDDS_NORMAL`: `HEADERDROPDOWNSTATES` = 1;
public const val `HDDS_SOFTHOT`: `HEADERDROPDOWNSTATES` = 2;
public const val `HDFT_HASNOVALUE`: `HEADER_CONTROL_FORMAT_TYPE` = 32768u;
public const val `HDFT_ISDATE`: `HEADER_CONTROL_FORMAT_TYPE` = 2u;
public const val `HDFT_ISNUMBER`: `HEADER_CONTROL_FORMAT_TYPE` = 1u;
public const val `HDFT_ISSTRING`: `HEADER_CONTROL_FORMAT_TYPE` = 0u;
public const val `HDF_BITMAP`: `HEADER_CONTROL_FORMAT_FLAGS` = 8192;
public const val `HDF_BITMAP_ON_RIGHT`: `HEADER_CONTROL_FORMAT_FLAGS` = 4096;
public const val `HDF_CENTER`: `HEADER_CONTROL_FORMAT_FLAGS` = 2;
public const val `HDF_CHECKBOX`: `HEADER_CONTROL_FORMAT_FLAGS` = 64;
public const val `HDF_CHECKED`: `HEADER_CONTROL_FORMAT_FLAGS` = 128;
public const val `HDF_FIXEDWIDTH`: `HEADER_CONTROL_FORMAT_FLAGS` = 256;
public const val `HDF_IMAGE`: `HEADER_CONTROL_FORMAT_FLAGS` = 2048;
public const val `HDF_JUSTIFYMASK`: `HEADER_CONTROL_FORMAT_FLAGS` = 3;
public const val `HDF_LEFT`: `HEADER_CONTROL_FORMAT_FLAGS` = 0;
public const val `HDF_OWNERDRAW`: `HEADER_CONTROL_FORMAT_FLAGS` = 32768;
public const val `HDF_RIGHT`: `HEADER_CONTROL_FORMAT_FLAGS` = 1;
public const val `HDF_RTLREADING`: `HEADER_CONTROL_FORMAT_FLAGS` = 4;
public const val `HDF_SORTDOWN`: `HEADER_CONTROL_FORMAT_FLAGS` = 512;
public const val `HDF_SORTUP`: `HEADER_CONTROL_FORMAT_FLAGS` = 1024;
public const val `HDF_SPLITBUTTON`: `HEADER_CONTROL_FORMAT_FLAGS` = 16777216;
public const val `HDF_STRING`: `HEADER_CONTROL_FORMAT_FLAGS` = 16384;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HDHITTESTINFO` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `flags`: `HEADER_HITTEST_INFO_FLAGS`,
    public var `iItem`: Int,
)
public const val `HDIS_FOCUSED`: `HEADER_CONTROL_FORMAT_STATE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HDITEMA` (
    public var `mask`: `HDI_MASK`,
    public var `cxy`: Int,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `hbm`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `cchTextMax`: Int,
    public var `fmt`: `HEADER_CONTROL_FORMAT_FLAGS`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `iImage`: Int,
    public var `iOrder`: Int,
    public var `type`: `HEADER_CONTROL_FORMAT_TYPE`,
    public var `pvFilter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `state`: `HEADER_CONTROL_FORMAT_STATE`,
)
// UNSUPPORTED Rust 1549:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for HDITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HDITEMW` (
    public var `mask`: `HDI_MASK`,
    public var `cxy`: Int,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `hbm`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `cchTextMax`: Int,
    public var `fmt`: `HEADER_CONTROL_FORMAT_FLAGS`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `iImage`: Int,
    public var `iOrder`: Int,
    public var `type`: `HEADER_CONTROL_FORMAT_TYPE`,
    public var `pvFilter`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `state`: `HEADER_CONTROL_FORMAT_STATE`,
)
// UNSUPPORTED Rust 1572:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for HDITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HDI_BITMAP`: `HDI_MASK` = 16u;
public const val `HDI_DI_SETITEM`: `HDI_MASK` = 64u;
public const val `HDI_FILTER`: `HDI_MASK` = 256u;
public const val `HDI_FORMAT`: `HDI_MASK` = 4u;
public const val `HDI_HEIGHT`: `HDI_MASK` = 1u;
public const val `HDI_IMAGE`: `HDI_MASK` = 32u;
public const val `HDI_LPARAM`: `HDI_MASK` = 8u;
public typealias `HDI_MASK` = UInt;
public const val `HDI_ORDER`: `HDI_MASK` = 128u;
public const val `HDI_STATE`: `HDI_MASK` = 512u;
public const val `HDI_TEXT`: `HDI_MASK` = 2u;
public const val `HDI_WIDTH`: `HDI_MASK` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HDLAYOUT` (
    public var `prc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?,
    public var `pwpos`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`WindowsAndMessaging`.`WINDOWPOS`>?,
)
// UNSUPPORTED Rust 1597:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for HDLAYOUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HDM_CLEARFILTER`: UInt = 4632u;
public const val `HDM_CREATEDRAGIMAGE`: UInt = 4624u;
public const val `HDM_DELETEITEM`: UInt = 4610u;
public const val `HDM_EDITFILTER`: UInt = 4631u;
public const val `HDM_FIRST`: UInt = 4608u;
public const val `HDM_GETBITMAPMARGIN`: UInt = 4629u;
public const val `HDM_GETFOCUSEDITEM`: UInt = 4635u;
public const val `HDM_GETIMAGELIST`: UInt = 4617u;
public const val `HDM_GETITEM`: UInt = 4619u;
public const val `HDM_GETITEMA`: UInt = 4611u;
public const val `HDM_GETITEMCOUNT`: UInt = 4608u;
public const val `HDM_GETITEMDROPDOWNRECT`: UInt = 4633u;
public const val `HDM_GETITEMRECT`: UInt = 4615u;
public const val `HDM_GETITEMW`: UInt = 4619u;
public const val `HDM_GETORDERARRAY`: UInt = 4625u;
public const val `HDM_GETOVERFLOWRECT`: UInt = 4634u;
public const val `HDM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `HDM_HITTEST`: UInt = 4614u;
public const val `HDM_INSERTITEM`: UInt = 4618u;
public const val `HDM_INSERTITEMA`: UInt = 4609u;
public const val `HDM_INSERTITEMW`: UInt = 4618u;
public const val `HDM_LAYOUT`: UInt = 4613u;
public const val `HDM_ORDERTOINDEX`: UInt = 4623u;
public const val `HDM_SETBITMAPMARGIN`: UInt = 4628u;
public const val `HDM_SETFILTERCHANGETIMEOUT`: UInt = 4630u;
public const val `HDM_SETFOCUSEDITEM`: UInt = 4636u;
public const val `HDM_SETHOTDIVIDER`: UInt = 4627u;
public const val `HDM_SETIMAGELIST`: UInt = 4616u;
public const val `HDM_SETITEM`: UInt = 4620u;
public const val `HDM_SETITEMA`: UInt = 4612u;
public const val `HDM_SETITEMW`: UInt = 4620u;
public const val `HDM_SETORDERARRAY`: UInt = 4626u;
public const val `HDM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `HDN_BEGINDRAG`: UInt = 4294966986u;
public const val `HDN_BEGINFILTEREDIT`: UInt = 4294966982u;
public const val `HDN_BEGINTRACK`: UInt = 4294966970u;
public const val `HDN_BEGINTRACKA`: UInt = 4294966990u;
public const val `HDN_BEGINTRACKW`: UInt = 4294966970u;
public const val `HDN_DIVIDERDBLCLICK`: UInt = 4294966971u;
public const val `HDN_DIVIDERDBLCLICKA`: UInt = 4294966991u;
public const val `HDN_DIVIDERDBLCLICKW`: UInt = 4294966971u;
public const val `HDN_DROPDOWN`: UInt = 4294966978u;
public const val `HDN_ENDDRAG`: UInt = 4294966985u;
public const val `HDN_ENDFILTEREDIT`: UInt = 4294966981u;
public const val `HDN_ENDTRACK`: UInt = 4294966969u;
public const val `HDN_ENDTRACKA`: UInt = 4294966989u;
public const val `HDN_ENDTRACKW`: UInt = 4294966969u;
public const val `HDN_FILTERBTNCLICK`: UInt = 4294966983u;
public const val `HDN_FILTERCHANGE`: UInt = 4294966984u;
public const val `HDN_FIRST`: UInt = 4294966996u;
public const val `HDN_GETDISPINFO`: UInt = 4294966967u;
public const val `HDN_GETDISPINFOA`: UInt = 4294966987u;
public const val `HDN_GETDISPINFOW`: UInt = 4294966967u;
public const val `HDN_ITEMCHANGED`: UInt = 4294966975u;
public const val `HDN_ITEMCHANGEDA`: UInt = 4294966995u;
public const val `HDN_ITEMCHANGEDW`: UInt = 4294966975u;
public const val `HDN_ITEMCHANGING`: UInt = 4294966976u;
public const val `HDN_ITEMCHANGINGA`: UInt = 4294966996u;
public const val `HDN_ITEMCHANGINGW`: UInt = 4294966976u;
public const val `HDN_ITEMCLICK`: UInt = 4294966974u;
public const val `HDN_ITEMCLICKA`: UInt = 4294966994u;
public const val `HDN_ITEMCLICKW`: UInt = 4294966974u;
public const val `HDN_ITEMDBLCLICK`: UInt = 4294966973u;
public const val `HDN_ITEMDBLCLICKA`: UInt = 4294966993u;
public const val `HDN_ITEMDBLCLICKW`: UInt = 4294966973u;
public const val `HDN_ITEMKEYDOWN`: UInt = 4294966979u;
public const val `HDN_ITEMSTATEICONCLICK`: UInt = 4294966980u;
public const val `HDN_LAST`: UInt = 4294966897u;
public const val `HDN_OVERFLOWCLICK`: UInt = 4294966977u;
public const val `HDN_TRACK`: UInt = 4294966968u;
public const val `HDN_TRACKA`: UInt = 4294966988u;
public const val `HDN_TRACKW`: UInt = 4294966968u;
public typealias `HDPA` = Long;
public typealias `HDSA` = Long;
public const val `HDSIL_NORMAL`: UInt = 0u;
public const val `HDSIL_STATE`: UInt = 1u;
public const val `HDS_BUTTONS`: UInt = 2u;
public const val `HDS_CHECKBOXES`: UInt = 1024u;
public const val `HDS_DRAGDROP`: UInt = 64u;
public const val `HDS_FILTERBAR`: UInt = 256u;
public const val `HDS_FLAT`: UInt = 512u;
public const val `HDS_FULLDRAG`: UInt = 128u;
public const val `HDS_HIDDEN`: UInt = 8u;
public const val `HDS_HORZ`: UInt = 0u;
public const val `HDS_HOTTRACK`: UInt = 4u;
public const val `HDS_NOSIZING`: UInt = 2048u;
public const val `HDS_OVERFLOW`: UInt = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HD_TEXTFILTERA` (
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
)
// UNSUPPORTED Rust 1696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HD_TEXTFILTERA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HD_TEXTFILTERW` (
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
)
// UNSUPPORTED Rust 1707:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HD_TEXTFILTERW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HEADERAREASTATES` = Int;
public typealias `HEADERCLOSESTATES` = Int;
public typealias `HEADERDROPDOWNFILTERSTATES` = Int;
public typealias `HEADERDROPDOWNSTATES` = Int;
public typealias `HEADERITEMLEFTSTATES` = Int;
public typealias `HEADERITEMRIGHTSTATES` = Int;
public typealias `HEADERITEMSTATES` = Int;
public typealias `HEADEROVERFLOWSTATES` = Int;
public typealias `HEADERPARTS` = Int;
public typealias `HEADERPINSTATES` = Int;
public typealias `HEADERSORTARROWSTATES` = Int;
public typealias `HEADERSTYLESTATES` = Int;
public typealias `HEADER_CONTROL_FORMAT_FLAGS` = Int;
public typealias `HEADER_CONTROL_FORMAT_STATE` = UInt;
public typealias `HEADER_CONTROL_FORMAT_TYPE` = UInt;
public typealias `HEADER_CONTROL_NOTIFICATION_BUTTON` = Int;
public const val `HEADER_CONTROL_NOTIFICATION_BUTTON_LEFT`: `HEADER_CONTROL_NOTIFICATION_BUTTON` = 0;
public const val `HEADER_CONTROL_NOTIFICATION_BUTTON_MIDDLE`: `HEADER_CONTROL_NOTIFICATION_BUTTON` = 2;
public const val `HEADER_CONTROL_NOTIFICATION_BUTTON_RIGHT`: `HEADER_CONTROL_NOTIFICATION_BUTTON` = 1;
public typealias `HEADER_HITTEST_INFO_FLAGS` = UInt;
public typealias `HELPBUTTONSTATES` = Int;
public typealias `HELPLINKSTATES` = Int;
public const val `HGLPS_CLOSED`: `HOTGLYPHSTATES` = 1;
public const val `HGLPS_OPENED`: `HOTGLYPHSTATES` = 2;
public const val `HHT_ABOVE`: `HEADER_HITTEST_INFO_FLAGS` = 256u;
public const val `HHT_BELOW`: `HEADER_HITTEST_INFO_FLAGS` = 512u;
public const val `HHT_NOWHERE`: `HEADER_HITTEST_INFO_FLAGS` = 1u;
public const val `HHT_ONDIVIDER`: `HEADER_HITTEST_INFO_FLAGS` = 4u;
public const val `HHT_ONDIVOPEN`: `HEADER_HITTEST_INFO_FLAGS` = 8u;
public const val `HHT_ONDROPDOWN`: `HEADER_HITTEST_INFO_FLAGS` = 8192u;
public const val `HHT_ONFILTER`: `HEADER_HITTEST_INFO_FLAGS` = 16u;
public const val `HHT_ONFILTERBUTTON`: `HEADER_HITTEST_INFO_FLAGS` = 32u;
public const val `HHT_ONHEADER`: `HEADER_HITTEST_INFO_FLAGS` = 2u;
public const val `HHT_ONITEMSTATEICON`: `HEADER_HITTEST_INFO_FLAGS` = 4096u;
public const val `HHT_ONOVERFLOW`: `HEADER_HITTEST_INFO_FLAGS` = 16384u;
public const val `HHT_TOLEFT`: `HEADER_HITTEST_INFO_FLAGS` = 2048u;
public const val `HHT_TORIGHT`: `HEADER_HITTEST_INFO_FLAGS` = 1024u;
public const val `HICF_ACCELERATOR`: `NMTBHOTITEM_FLAGS` = 4u;
public const val `HICF_ARROWKEYS`: `NMTBHOTITEM_FLAGS` = 2u;
public const val `HICF_DUPACCEL`: `NMTBHOTITEM_FLAGS` = 8u;
public const val `HICF_ENTERING`: `NMTBHOTITEM_FLAGS` = 16u;
public const val `HICF_LEAVING`: `NMTBHOTITEM_FLAGS` = 32u;
public const val `HICF_LMOUSE`: `NMTBHOTITEM_FLAGS` = 128u;
public const val `HICF_MOUSE`: `NMTBHOTITEM_FLAGS` = 1u;
public const val `HICF_OTHER`: `NMTBHOTITEM_FLAGS` = 0u;
public const val `HICF_RESELECT`: `NMTBHOTITEM_FLAGS` = 64u;
public const val `HICF_TOGGLEDROPDOWN`: `NMTBHOTITEM_FLAGS` = 256u;
public const val `HILS_HOT`: `HEADERITEMLEFTSTATES` = 2;
public const val `HILS_NORMAL`: `HEADERITEMLEFTSTATES` = 1;
public const val `HILS_PRESSED`: `HEADERITEMLEFTSTATES` = 3;
public typealias `HIMAGELIST` = Long;
public const val `HIRS_HOT`: `HEADERITEMRIGHTSTATES` = 2;
public const val `HIRS_NORMAL`: `HEADERITEMRIGHTSTATES` = 1;
public const val `HIRS_PRESSED`: `HEADERITEMRIGHTSTATES` = 3;
public const val `HIST_ADDTOFAVORITES`: UInt = 3u;
public const val `HIST_BACK`: UInt = 0u;
public const val `HIST_FAVORITES`: UInt = 2u;
public const val `HIST_FORWARD`: UInt = 1u;
public const val `HIST_VIEWTREE`: UInt = 4u;
public const val `HIS_HOT`: `HEADERITEMSTATES` = 2;
public const val `HIS_ICONHOT`: `HEADERITEMSTATES` = 8;
public const val `HIS_ICONNORMAL`: `HEADERITEMSTATES` = 7;
public const val `HIS_ICONPRESSED`: `HEADERITEMSTATES` = 9;
public const val `HIS_ICONSORTEDHOT`: `HEADERITEMSTATES` = 11;
public const val `HIS_ICONSORTEDNORMAL`: `HEADERITEMSTATES` = 10;
public const val `HIS_ICONSORTEDPRESSED`: `HEADERITEMSTATES` = 12;
public const val `HIS_NORMAL`: `HEADERITEMSTATES` = 1;
public const val `HIS_PRESSED`: `HEADERITEMSTATES` = 3;
public const val `HIS_SORTEDHOT`: `HEADERITEMSTATES` = 5;
public const val `HIS_SORTEDNORMAL`: `HEADERITEMSTATES` = 4;
public const val `HIS_SORTEDPRESSED`: `HEADERITEMSTATES` = 6;
public typealias `HIT_TEST_BACKGROUND_OPTIONS` = UInt;
public const val `HKCOMB_A`: UInt = 8u;
public const val `HKCOMB_C`: UInt = 4u;
public const val `HKCOMB_CA`: UInt = 64u;
public const val `HKCOMB_NONE`: UInt = 1u;
public const val `HKCOMB_S`: UInt = 2u;
public const val `HKCOMB_SA`: UInt = 32u;
public const val `HKCOMB_SC`: UInt = 16u;
public const val `HKCOMB_SCA`: UInt = 128u;
public const val `HKM_GETHOTKEY`: UInt = 1026u;
public const val `HKM_SETHOTKEY`: UInt = 1025u;
public const val `HKM_SETRULES`: UInt = 1027u;
public const val `HLS_LINKTEXT`: `HYPERLINKSTATES` = 2;
public const val `HLS_NORMALTEXT`: `HYPERLINKSTATES` = 1;
public const val `HOFS_HOT`: `HEADEROVERFLOWSTATES` = 2;
public const val `HOFS_NORMAL`: `HEADEROVERFLOWSTATES` = 1;
public typealias `HORZSCROLLSTATES` = Int;
public typealias `HORZTHUMBSTATES` = Int;
public typealias `HOTGLYPHSTATES` = Int;
public const val `HOTKEYF_ALT`: UInt = 4u;
public const val `HOTKEYF_CONTROL`: UInt = 2u;
public const val `HOTKEYF_EXT`: UInt = 8u;
public const val `HOTKEYF_SHIFT`: UInt = 1u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `HOTKEY_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_hotkey32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `HOTKEY_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("msctls_hotkey32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `HOTKEY_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_hotkey32");
public typealias `HOVERBACKGROUNDSTATES` = Int;
public const val `HOVER_DEFAULT`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HPROPSHEETPAGE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HP_HEADERDROPDOWN`: `HEADERPARTS` = 5;
public const val `HP_HEADERDROPDOWNFILTER`: `HEADERPARTS` = 6;
public const val `HP_HEADERITEM`: `HEADERPARTS` = 1;
public const val `HP_HEADERITEMLEFT`: `HEADERPARTS` = 2;
public const val `HP_HEADERITEMRIGHT`: `HEADERPARTS` = 3;
public const val `HP_HEADEROVERFLOW`: `HEADERPARTS` = 7;
public const val `HP_HEADERSORTARROW`: `HEADERPARTS` = 4;
public const val `HSAS_SORTEDDOWN`: `HEADERSORTARROWSTATES` = 2;
public const val `HSAS_SORTEDUP`: `HEADERSORTARROWSTATES` = 1;
public const val `HSS_DISABLED`: `HORZSCROLLSTATES` = 4;
public const val `HSS_HOT`: `HORZSCROLLSTATES` = 2;
public const val `HSS_NORMAL`: `HORZSCROLLSTATES` = 1;
public const val `HSS_PUSHED`: `HORZSCROLLSTATES` = 3;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HSYNTHETICPOINTERDEVICE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `HTHEME` = Long;
public typealias `HTREEITEM` = Long;
public const val `HTS_DISABLED`: `HORZTHUMBSTATES` = 4;
public const val `HTS_HOT`: `HORZTHUMBSTATES` = 2;
public const val `HTS_NORMAL`: `HORZTHUMBSTATES` = 1;
public const val `HTS_PUSHED`: `HORZTHUMBSTATES` = 3;
public const val `HTTB_BACKGROUNDSEG`: `HIT_TEST_BACKGROUND_OPTIONS` = 0u;
public const val `HTTB_CAPTION`: `HIT_TEST_BACKGROUND_OPTIONS` = 4u;
public const val `HTTB_FIXEDBORDER`: `HIT_TEST_BACKGROUND_OPTIONS` = 2u;
public const val `HTTB_RESIZINGBORDER`: `HIT_TEST_BACKGROUND_OPTIONS` = 240u;
public const val `HTTB_RESIZINGBORDER_BOTTOM`: `HIT_TEST_BACKGROUND_OPTIONS` = 128u;
public const val `HTTB_RESIZINGBORDER_LEFT`: `HIT_TEST_BACKGROUND_OPTIONS` = 16u;
public const val `HTTB_RESIZINGBORDER_RIGHT`: `HIT_TEST_BACKGROUND_OPTIONS` = 64u;
public const val `HTTB_RESIZINGBORDER_TOP`: `HIT_TEST_BACKGROUND_OPTIONS` = 32u;
public const val `HTTB_SIZINGTEMPLATE`: `HIT_TEST_BACKGROUND_OPTIONS` = 256u;
public const val `HTTB_SYSTEMSIZINGMARGINS`: `HIT_TEST_BACKGROUND_OPTIONS` = 512u;
public typealias `HYPERLINKSTATES` = Int;
public typealias `HYPERLINKTEXTSTATES` = Int;
public const val `ICC_ANIMATE_CLASS`: `INITCOMMONCONTROLSEX_ICC` = 128u;
public const val `ICC_BAR_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 4u;
public const val `ICC_COOL_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 1024u;
public const val `ICC_DATE_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 256u;
public const val `ICC_HOTKEY_CLASS`: `INITCOMMONCONTROLSEX_ICC` = 64u;
public const val `ICC_INTERNET_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 2048u;
public const val `ICC_LINK_CLASS`: `INITCOMMONCONTROLSEX_ICC` = 32768u;
public const val `ICC_LISTVIEW_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 1u;
public const val `ICC_NATIVEFNTCTL_CLASS`: `INITCOMMONCONTROLSEX_ICC` = 8192u;
public const val `ICC_PAGESCROLLER_CLASS`: `INITCOMMONCONTROLSEX_ICC` = 4096u;
public const val `ICC_PROGRESS_CLASS`: `INITCOMMONCONTROLSEX_ICC` = 32u;
public const val `ICC_STANDARD_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 16384u;
public const val `ICC_TAB_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 8u;
public const val `ICC_TREEVIEW_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 2u;
public const val `ICC_UPDOWN_CLASS`: `INITCOMMONCONTROLSEX_ICC` = 16u;
public const val `ICC_USEREX_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 512u;
public const val `ICC_WIN95_CLASSES`: `INITCOMMONCONTROLSEX_ICC` = 255u;
public const val `ICE_ALPHA`: `ICONEFFECT` = 4;
public const val `ICE_GLOW`: `ICONEFFECT` = 1;
public const val `ICE_NONE`: `ICONEFFECT` = 0;
public const val `ICE_PULSE`: `ICONEFFECT` = 3;
public const val `ICE_SHADOW`: `ICONEFFECT` = 2;
public typealias `ICONEFFECT` = Int;
public const val `IDB_HIST_DISABLED`: UInt = 14u;
public const val `IDB_HIST_HOT`: UInt = 13u;
public const val `IDB_HIST_LARGE_COLOR`: UInt = 9u;
public const val `IDB_HIST_NORMAL`: UInt = 12u;
public const val `IDB_HIST_PRESSED`: UInt = 15u;
public const val `IDB_HIST_SMALL_COLOR`: UInt = 8u;
public const val `IDB_STD_LARGE_COLOR`: UInt = 1u;
public const val `IDB_STD_SMALL_COLOR`: UInt = 0u;
public const val `IDB_VIEW_LARGE_COLOR`: UInt = 5u;
public const val `IDB_VIEW_SMALL_COLOR`: UInt = 4u;
public const val `IDC_MANAGE_LINK`: UInt = 1592u;
public const val `ID_PSRESTARTWINDOWS`: UInt = 2u;
public typealias `IEBARMENUSTATES` = Int;
public const val `ILCF_MOVE`: `IMAGE_LIST_COPY_FLAGS` = 0u;
public const val `ILCF_SWAP`: `IMAGE_LIST_COPY_FLAGS` = 1u;
public const val `ILC_COLOR`: `IMAGELIST_CREATION_FLAGS` = 0u;
public const val `ILC_COLOR16`: `IMAGELIST_CREATION_FLAGS` = 16u;
public const val `ILC_COLOR24`: `IMAGELIST_CREATION_FLAGS` = 24u;
public const val `ILC_COLOR32`: `IMAGELIST_CREATION_FLAGS` = 32u;
public const val `ILC_COLOR4`: `IMAGELIST_CREATION_FLAGS` = 4u;
public const val `ILC_COLOR8`: `IMAGELIST_CREATION_FLAGS` = 8u;
public const val `ILC_COLORDDB`: `IMAGELIST_CREATION_FLAGS` = 254u;
public const val `ILC_HIGHQUALITYSCALE`: `IMAGELIST_CREATION_FLAGS` = 131072u;
public const val `ILC_MASK`: `IMAGELIST_CREATION_FLAGS` = 1u;
public const val `ILC_MIRROR`: `IMAGELIST_CREATION_FLAGS` = 8192u;
public const val `ILC_ORIGINALSIZE`: `IMAGELIST_CREATION_FLAGS` = 65536u;
public const val `ILC_PALETTE`: `IMAGELIST_CREATION_FLAGS` = 2048u;
public const val `ILC_PERITEMMIRROR`: `IMAGELIST_CREATION_FLAGS` = 32768u;
public const val `ILDI_PURGE`: UInt = 1u;
public const val `ILDI_QUERYACCESS`: UInt = 8u;
public const val `ILDI_RESETACCESS`: UInt = 4u;
public const val `ILDI_STANDBY`: UInt = 2u;
public const val `ILDRF_IMAGELOWQUALITY`: UInt = 1u;
public const val `ILDRF_OVERLAYLOWQUALITY`: UInt = 16u;
public const val `ILD_ASYNC`: `IMAGE_LIST_DRAW_STYLE` = 32768u;
public const val `ILD_BLEND`: `IMAGE_LIST_DRAW_STYLE` = 4u;
public const val `ILD_BLEND25`: `IMAGE_LIST_DRAW_STYLE` = 2u;
public const val `ILD_BLEND50`: `IMAGE_LIST_DRAW_STYLE` = 4u;
public const val `ILD_DPISCALE`: `IMAGE_LIST_DRAW_STYLE` = 16384u;
public const val `ILD_FOCUS`: `IMAGE_LIST_DRAW_STYLE` = 2u;
public const val `ILD_IMAGE`: `IMAGE_LIST_DRAW_STYLE` = 32u;
public const val `ILD_MASK`: `IMAGE_LIST_DRAW_STYLE` = 16u;
public const val `ILD_NORMAL`: `IMAGE_LIST_DRAW_STYLE` = 0u;
public const val `ILD_OVERLAYMASK`: `IMAGE_LIST_DRAW_STYLE` = 3840u;
public const val `ILD_PRESERVEALPHA`: `IMAGE_LIST_DRAW_STYLE` = 4096u;
public const val `ILD_ROP`: `IMAGE_LIST_DRAW_STYLE` = 64u;
public const val `ILD_SCALE`: `IMAGE_LIST_DRAW_STYLE` = 8192u;
public const val `ILD_SELECTED`: `IMAGE_LIST_DRAW_STYLE` = 4u;
public const val `ILD_TRANSPARENT`: `IMAGE_LIST_DRAW_STYLE` = 1u;
public const val `ILFIP_ALWAYS`: UInt = 0u;
public const val `ILFIP_FROMSTANDBY`: UInt = 1u;
public const val `ILGOS_ALWAYS`: UInt = 0u;
public const val `ILGOS_FROMSTANDBY`: UInt = 1u;
public const val `ILGT_ASYNC`: UInt = 1u;
public const val `ILGT_NORMAL`: UInt = 0u;
public const val `ILIF_ALPHA`: `IMAGE_LIST_ITEM_FLAGS` = 1u;
public const val `ILIF_LOWQUALITY`: `IMAGE_LIST_ITEM_FLAGS` = 2u;
public const val `ILP_DOWNLEVEL`: `IMAGE_LIST_WRITE_STREAM_FLAGS` = 1u;
public const val `ILP_NORMAL`: `IMAGE_LIST_WRITE_STREAM_FLAGS` = 0u;
public const val `ILR_DEFAULT`: UInt = 0u;
public const val `ILR_HORIZONTAL_CENTER`: UInt = 1u;
public const val `ILR_HORIZONTAL_LEFT`: UInt = 0u;
public const val `ILR_HORIZONTAL_RIGHT`: UInt = 2u;
public const val `ILR_SCALE_ASPECTRATIO`: UInt = 256u;
public const val `ILR_SCALE_CLIP`: UInt = 0u;
public const val `ILR_VERTICAL_BOTTOM`: UInt = 32u;
public const val `ILR_VERTICAL_CENTER`: UInt = 16u;
public const val `ILR_VERTICAL_TOP`: UInt = 0u;
public const val `ILS_ALPHA`: UInt = 8u;
public const val `ILS_GLOW`: UInt = 1u;
public const val `ILS_NORMAL`: UInt = 0u;
public const val `ILS_SATURATE`: UInt = 4u;
public const val `ILS_SHADOW`: UInt = 2u;
public const val `IL_HORIZONTAL`: `IMAGELAYOUT` = 1;
public const val `IL_VERTICAL`: `IMAGELAYOUT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEINFO` (
    public var `hbmImage`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `hbmMask`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `Unused1`: Int,
    public var `Unused2`: Int,
    public var `rcImage`: `super`.`super`.`Foundation`.`RECT`,
)
// UNSUPPORTED Rust 1952:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for IMAGEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGELAYOUT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGELISTDRAWPARAMS` (
    public var `cbSize`: UInt,
    public var `himl`: `HIMAGELIST`,
    public var `i`: Int,
    public var `hdcDst`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `x`: Int,
    public var `y`: Int,
    public var `cx`: Int,
    public var `cy`: Int,
    public var `xBitmap`: Int,
    public var `yBitmap`: Int,
    public var `rgbBk`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `rgbFg`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `fStyle`: UInt,
    public var `dwRop`: UInt,
    public var `fState`: UInt,
    public var `Frame`: UInt,
    public var `crEffect`: `super`.`super`.`Foundation`.`COLORREF`,
)
// UNSUPPORTED Rust 1981:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for IMAGELISTDRAWPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGELISTSTATS` (
    public var `cbSize`: UInt,
    public var `cAlloc`: Int,
    public var `cUsed`: Int,
    public var `cStandby`: Int,
)
public typealias `IMAGELIST_CREATION_FLAGS` = UInt;
public typealias `IMAGESELECTTYPE` = Int;
public typealias `IMAGE_LIST_COPY_FLAGS` = UInt;
public typealias `IMAGE_LIST_DRAW_STYLE` = UInt;
public typealias `IMAGE_LIST_ITEM_FLAGS` = UInt;
public typealias `IMAGE_LIST_WRITE_STREAM_FLAGS` = UInt;
public const val `INFOTIPSIZE`: UInt = 1024u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INITCOMMONCONTROLSEX` (
    public var `dwSize`: UInt,
    public var `dwICC`: `INITCOMMONCONTROLSEX_ICC`,
)
public typealias `INITCOMMONCONTROLSEX_ICC` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 402 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTLIST` (
    public var `iValueCount`: Int,
    public var `iValues`: IntArray,
)
// UNSUPPORTED Rust 2015:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INTLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INVALID_LINK_INDEX`: Int = -1;
public const val `IPM_CLEARADDRESS`: UInt = 1124u;
public const val `IPM_GETADDRESS`: UInt = 1126u;
public const val `IPM_ISBLANK`: UInt = 1129u;
public const val `IPM_SETADDRESS`: UInt = 1125u;
public const val `IPM_SETFOCUS`: UInt = 1128u;
public const val `IPM_SETRANGE`: UInt = 1127u;
public const val `IPN_FIELDCHANGED`: UInt = 4294966436u;
public const val `IPN_FIRST`: UInt = 4294966436u;
public const val `IPN_LAST`: UInt = 4294966417u;
public const val `IST_DPI`: `IMAGESELECTTYPE` = 2;
public const val `IST_NONE`: `IMAGESELECTTYPE` = 0;
public const val `IST_SIZE`: `IMAGESELECTTYPE` = 1;
public typealias `ITEMSTATES` = Int;
public const val `I_CHILDRENAUTO`: `TVITEMEXW_CHILDREN` = -2;
public const val `I_CHILDRENCALLBACK`: `TVITEMEXW_CHILDREN` = -1;
public const val `I_GROUPIDCALLBACK`: `LVITEMA_GROUP_ID` = -1;
public const val `I_GROUPIDNONE`: `LVITEMA_GROUP_ID` = -2;
public const val `I_IMAGECALLBACK`: Int = -1;
public const val `I_IMAGENONE`: Int = -2;
public const val `I_INDENTCALLBACK`: Int = -1;
public const val `I_ONE_OR_MORE`: `TVITEMEXW_CHILDREN` = 1;
public const val `I_ZERO`: `TVITEMEXW_CHILDREN` = 0;
// UNSUPPORTED Rust 2043:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ImageList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7c476ba2_02b1_48f4_8048_b24619ddc058);

public typealias `LABELSTATES` = Int;
public const val `LBCP_BORDER_HSCROLL`: `LISTBOXPARTS` = 1;
public const val `LBCP_BORDER_HVSCROLL`: `LISTBOXPARTS` = 2;
public const val `LBCP_BORDER_NOSCROLL`: `LISTBOXPARTS` = 3;
public const val `LBCP_BORDER_VSCROLL`: `LISTBOXPARTS` = 4;
public const val `LBCP_ITEM`: `LISTBOXPARTS` = 5;
public const val `LBPSHV_DISABLED`: `BORDER_HVSCROLLSTATES` = 4;
public const val `LBPSHV_FOCUSED`: `BORDER_HVSCROLLSTATES` = 2;
public const val `LBPSHV_HOT`: `BORDER_HVSCROLLSTATES` = 3;
public const val `LBPSHV_NORMAL`: `BORDER_HVSCROLLSTATES` = 1;
public const val `LBPSH_DISABLED`: `BORDER_HSCROLLSTATES` = 4;
public const val `LBPSH_FOCUSED`: `BORDER_HSCROLLSTATES` = 2;
public const val `LBPSH_HOT`: `BORDER_HSCROLLSTATES` = 3;
public const val `LBPSH_NORMAL`: `BORDER_HSCROLLSTATES` = 1;
public const val `LBPSI_HOT`: `ITEMSTATES` = 1;
public const val `LBPSI_HOTSELECTED`: `ITEMSTATES` = 2;
public const val `LBPSI_SELECTED`: `ITEMSTATES` = 3;
public const val `LBPSI_SELECTEDNOTFOCUS`: `ITEMSTATES` = 4;
public const val `LBPSN_DISABLED`: `BORDER_NOSCROLLSTATES` = 4;
public const val `LBPSN_FOCUSED`: `BORDER_NOSCROLLSTATES` = 2;
public const val `LBPSN_HOT`: `BORDER_NOSCROLLSTATES` = 3;
public const val `LBPSN_NORMAL`: `BORDER_NOSCROLLSTATES` = 1;
public const val `LBPSV_DISABLED`: `BORDER_VSCROLLSTATES` = 4;
public const val `LBPSV_FOCUSED`: `BORDER_VSCROLLSTATES` = 2;
public const val `LBPSV_HOT`: `BORDER_VSCROLLSTATES` = 3;
public const val `LBPSV_NORMAL`: `BORDER_VSCROLLSTATES` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LHITTESTINFO` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `item`: `LITEM`,
)
public const val `LIF_ITEMID`: `LIST_ITEM_FLAGS` = 4u;
public const val `LIF_ITEMINDEX`: `LIST_ITEM_FLAGS` = 1u;
public const val `LIF_STATE`: `LIST_ITEM_FLAGS` = 2u;
public const val `LIF_URL`: `LIST_ITEM_FLAGS` = 8u;
public const val `LIM_LARGE`: `_LI_METRIC` = 1;
public const val `LIM_SMALL`: `_LI_METRIC` = 0;
public typealias `LINKHEADERSTATES` = Int;
public typealias `LINKPARTS` = Int;
public typealias `LINKSTATES` = Int;
public const val `LISS_DISABLED`: `LISTITEMSTATES` = 4;
public const val `LISS_HOT`: `LISTITEMSTATES` = 2;
public const val `LISS_HOTSELECTED`: `LISTITEMSTATES` = 6;
public const val `LISS_NORMAL`: `LISTITEMSTATES` = 1;
public const val `LISS_SELECTED`: `LISTITEMSTATES` = 3;
public const val `LISS_SELECTEDNOTFOCUS`: `LISTITEMSTATES` = 5;
public typealias `LISTBOXPARTS` = Int;
public typealias `LISTITEMSTATES` = Int;
public typealias `LISTVIEWPARTS` = Int;
public typealias `LIST_ITEM_FLAGS` = UInt;
public typealias `LIST_ITEM_STATE_FLAGS` = UInt;
public typealias `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = UInt;
public typealias `LIST_VIEW_GROUP_ALIGN_FLAGS` = UInt;
public typealias `LIST_VIEW_GROUP_STATE_FLAGS` = UInt;
public typealias `LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS` = Int;
public typealias `LIST_VIEW_ITEM_FLAGS` = UInt;
public typealias `LIST_VIEW_ITEM_STATE_FLAGS` = UInt;
public const val `LIS_DEFAULTCOLORS`: `LIST_ITEM_STATE_FLAGS` = 16u;
public const val `LIS_ENABLED`: `LIST_ITEM_STATE_FLAGS` = 2u;
public const val `LIS_FOCUSED`: `LIST_ITEM_STATE_FLAGS` = 1u;
public const val `LIS_HOTTRACK`: `LIST_ITEM_STATE_FLAGS` = 8u;
public const val `LIS_VISITED`: `LIST_ITEM_STATE_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2084 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LITEM` (
    public var `mask`: `LIST_ITEM_FLAGS`,
    public var `iLink`: Int,
    public var `state`: `LIST_ITEM_STATE_FLAGS`,
    public var `stateMask`: `LIST_ITEM_STATE_FLAGS`,
    public var `szID`: UShortArray,
    public var `szUrl`: UShortArray,
)
// UNSUPPORTED Rust 2117:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LM_GETIDEALHEIGHT`: UInt = 1793u;
public const val `LM_GETIDEALSIZE`: UInt = 1793u;
public const val `LM_GETITEM`: UInt = 1795u;
public const val `LM_HITTEST`: UInt = 1792u;
public const val `LM_SETITEM`: UInt = 1794u;
public typealias `LOGOFFBUTTONSSTATES` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNADDPROPSHEETPAGES` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `LPFNSVADDPROPSHEETPAGE`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `LPFNCCINFOA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CCINFOA`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `LPFNCCINFOW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CCINFOW`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `LPFNCCSIZETOTEXTA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `super`.`super`.`Graphics`.`Gdi`.`HFONT`, `windows_sys`.`core`.`PCSTR`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `LPFNCCSIZETOTEXTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `super`.`super`.`Graphics`.`Gdi`.`HFONT`, `windows_sys`.`core`.`PCWSTR`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNCCSTYLEA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, /* Rust *mut */ kotlinx.cinterop.CPointer<`CCSTYLEA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNCCSTYLEW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, /* Rust *mut */ kotlinx.cinterop.CPointer<`CCSTYLEW`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public typealias `LPFNPSPCALLBACKA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `PSPCB_MESSAGE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPSHEETPAGEA`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
public typealias `LPFNPSPCALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, `PSPCB_MESSAGE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`PROPSHEETPAGEW`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFNSVADDPROPSHEETPAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HPROPSHEETPAGE`, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `LP_HYPERLINK`: `LINKPARTS` = 1;
public const val `LVA_ALIGNLEFT`: UInt = 1u;
public const val `LVA_ALIGNTOP`: UInt = 2u;
public const val `LVA_DEFAULT`: UInt = 0u;
public const val `LVA_SNAPTOGRID`: UInt = 5u;
public const val `LVBKIF_FLAG_ALPHABLEND`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 536870912u;
public const val `LVBKIF_FLAG_TILEOFFSET`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 256u;
public const val `LVBKIF_SOURCE_HBITMAP`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 1u;
public const val `LVBKIF_SOURCE_MASK`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 3u;
public const val `LVBKIF_SOURCE_NONE`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 0u;
public const val `LVBKIF_SOURCE_URL`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 2u;
public const val `LVBKIF_STYLE_MASK`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 16u;
public const val `LVBKIF_STYLE_NORMAL`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 0u;
public const val `LVBKIF_STYLE_TILE`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 16u;
public const val `LVBKIF_TYPE_WATERMARK`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS` = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVBKIMAGEA` (
    public var `ulFlags`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS`,
    public var `hbm`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `pszImage`: `windows_sys`.`core`.`PSTR`,
    public var `cchImageMax`: UInt,
    public var `xOffsetPercent`: Int,
    public var `yOffsetPercent`: Int,
)
// UNSUPPORTED Rust 2170:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for LVBKIMAGEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVBKIMAGEW` (
    public var `ulFlags`: `LIST_VIEW_BACKGROUND_IMAGE_FLAGS`,
    public var `hbm`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `pszImage`: `windows_sys`.`core`.`PWSTR`,
    public var `cchImageMax`: UInt,
    public var `xOffsetPercent`: Int,
    public var `yOffsetPercent`: Int,
)
// UNSUPPORTED Rust 2187:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for LVBKIMAGEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LVCB_HOVER`: `COLLAPSEBUTTONSTATES` = 2;
public const val `LVCB_NORMAL`: `COLLAPSEBUTTONSTATES` = 1;
public const val `LVCB_PUSHED`: `COLLAPSEBUTTONSTATES` = 3;
public const val `LVCDI_GROUP`: `NMLVCUSTOMDRAW_ITEM_TYPE` = 1u;
public const val `LVCDI_ITEM`: `NMLVCUSTOMDRAW_ITEM_TYPE` = 0u;
public const val `LVCDI_ITEMSLIST`: `NMLVCUSTOMDRAW_ITEM_TYPE` = 2u;
public const val `LVCDRF_NOGROUPFRAME`: UInt = 131072u;
public const val `LVCDRF_NOSELECT`: UInt = 65536u;
public const val `LVCFMT_BITMAP_ON_RIGHT`: `LVCOLUMNW_FORMAT` = 4096;
public const val `LVCFMT_CENTER`: `LVCOLUMNW_FORMAT` = 2;
public const val `LVCFMT_COL_HAS_IMAGES`: `LVCOLUMNW_FORMAT` = 32768;
public const val `LVCFMT_FILL`: `LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS` = 2097152;
public const val `LVCFMT_FIXED_RATIO`: `LVCOLUMNW_FORMAT` = 524288;
public const val `LVCFMT_FIXED_WIDTH`: `LVCOLUMNW_FORMAT` = 256;
public const val `LVCFMT_IMAGE`: `LVCOLUMNW_FORMAT` = 2048;
public const val `LVCFMT_JUSTIFYMASK`: `LVCOLUMNW_FORMAT` = 3;
public const val `LVCFMT_LEFT`: `LVCOLUMNW_FORMAT` = 0;
public const val `LVCFMT_LINE_BREAK`: `LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS` = 1048576;
public const val `LVCFMT_NO_DPI_SCALE`: `LVCOLUMNW_FORMAT` = 262144;
public const val `LVCFMT_NO_TITLE`: `LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS` = 8388608;
public const val `LVCFMT_RIGHT`: `LVCOLUMNW_FORMAT` = 1;
public const val `LVCFMT_SPLITBUTTON`: `LVCOLUMNW_FORMAT` = 16777216;
public const val `LVCFMT_TILE_PLACEMENTMASK`: `LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS` = 3145728;
public const val `LVCFMT_WRAP`: `LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS` = 4194304;
public const val `LVCF_DEFAULTWIDTH`: `LVCOLUMNW_MASK` = 128u;
public const val `LVCF_FMT`: `LVCOLUMNW_MASK` = 1u;
public const val `LVCF_IDEALWIDTH`: `LVCOLUMNW_MASK` = 256u;
public const val `LVCF_IMAGE`: `LVCOLUMNW_MASK` = 16u;
public const val `LVCF_MINWIDTH`: `LVCOLUMNW_MASK` = 64u;
public const val `LVCF_ORDER`: `LVCOLUMNW_MASK` = 32u;
public const val `LVCF_SUBITEM`: `LVCOLUMNW_MASK` = 8u;
public const val `LVCF_TEXT`: `LVCOLUMNW_MASK` = 4u;
public const val `LVCF_WIDTH`: `LVCOLUMNW_MASK` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVCOLUMNA` (
    public var `mask`: `LVCOLUMNW_MASK`,
    public var `fmt`: `LVCOLUMNW_FORMAT`,
    public var `cx`: Int,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iSubItem`: Int,
    public var `iImage`: Int,
    public var `iOrder`: Int,
    public var `cxMin`: Int,
    public var `cxDefault`: Int,
    public var `cxIdeal`: Int,
)
// UNSUPPORTED Rust 2241:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVCOLUMNA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVCOLUMNW` (
    public var `mask`: `LVCOLUMNW_MASK`,
    public var `fmt`: `LVCOLUMNW_FORMAT`,
    public var `cx`: Int,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iSubItem`: Int,
    public var `iImage`: Int,
    public var `iOrder`: Int,
    public var `cxMin`: Int,
    public var `cxDefault`: Int,
    public var `cxIdeal`: Int,
)
// UNSUPPORTED Rust 2261:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVCOLUMNW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LVCOLUMNW_FORMAT` = Int;
public typealias `LVCOLUMNW_MASK` = UInt;
public const val `LVEB_HOVER`: `EXPANDBUTTONSTATES` = 2;
public const val `LVEB_NORMAL`: `EXPANDBUTTONSTATES` = 1;
public const val `LVEB_PUSHED`: `EXPANDBUTTONSTATES` = 3;
public const val `LVFF_ITEMCOUNT`: UInt = 1u;
public const val `LVFIF_STATE`: `LVFOOTERITEM_MASK` = 2u;
public const val `LVFIF_TEXT`: `LVFOOTERITEM_MASK` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVFINDINFOA` (
    public var `flags`: `LVFINDINFOW_FLAGS`,
    public var `psz`: `windows_sys`.`core`.`PCSTR`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `vkDirection`: UInt,
)
// UNSUPPORTED Rust 2283:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVFINDINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVFINDINFOW` (
    public var `flags`: `LVFINDINFOW_FLAGS`,
    public var `psz`: `windows_sys`.`core`.`PCWSTR`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `vkDirection`: UInt,
)
// UNSUPPORTED Rust 2297:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVFINDINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LVFINDINFOW_FLAGS` = UInt;
public const val `LVFIS_FOCUSED`: UInt = 1u;
public const val `LVFI_NEARESTXY`: `LVFINDINFOW_FLAGS` = 64u;
public const val `LVFI_PARAM`: `LVFINDINFOW_FLAGS` = 1u;
public const val `LVFI_PARTIAL`: `LVFINDINFOW_FLAGS` = 8u;
public const val `LVFI_STRING`: `LVFINDINFOW_FLAGS` = 2u;
public const val `LVFI_SUBSTRING`: `LVFINDINFOW_FLAGS` = 4u;
public const val `LVFI_WRAP`: `LVFINDINFOW_FLAGS` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVFOOTERINFO` (
    public var `mask`: UInt,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `cItems`: UInt,
)
// UNSUPPORTED Rust 2318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVFOOTERINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVFOOTERITEM` (
    public var `mask`: `LVFOOTERITEM_MASK`,
    public var `iItem`: Int,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `state`: UInt,
    public var `stateMask`: UInt,
)
// UNSUPPORTED Rust 2333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVFOOTERITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LVFOOTERITEM_MASK` = UInt;
public const val `LVGA_FOOTER_CENTER`: `LIST_VIEW_GROUP_ALIGN_FLAGS` = 16u;
public const val `LVGA_FOOTER_LEFT`: `LIST_VIEW_GROUP_ALIGN_FLAGS` = 8u;
public const val `LVGA_FOOTER_RIGHT`: `LIST_VIEW_GROUP_ALIGN_FLAGS` = 32u;
public const val `LVGA_HEADER_CENTER`: `LIST_VIEW_GROUP_ALIGN_FLAGS` = 2u;
public const val `LVGA_HEADER_LEFT`: `LIST_VIEW_GROUP_ALIGN_FLAGS` = 1u;
public const val `LVGA_HEADER_RIGHT`: `LIST_VIEW_GROUP_ALIGN_FLAGS` = 4u;
public const val `LVGF_ALIGN`: `LVGROUP_MASK` = 8u;
public const val `LVGF_DESCRIPTIONBOTTOM`: `LVGROUP_MASK` = 2048u;
public const val `LVGF_DESCRIPTIONTOP`: `LVGROUP_MASK` = 1024u;
public const val `LVGF_EXTENDEDIMAGE`: `LVGROUP_MASK` = 8192u;
public const val `LVGF_FOOTER`: `LVGROUP_MASK` = 2u;
public const val `LVGF_GROUPID`: `LVGROUP_MASK` = 16u;
public const val `LVGF_HEADER`: `LVGROUP_MASK` = 1u;
public const val `LVGF_ITEMS`: `LVGROUP_MASK` = 16384u;
public const val `LVGF_NONE`: `LVGROUP_MASK` = 0u;
public const val `LVGF_STATE`: `LVGROUP_MASK` = 4u;
public const val `LVGF_SUBSET`: `LVGROUP_MASK` = 32768u;
public const val `LVGF_SUBSETITEMS`: `LVGROUP_MASK` = 65536u;
public const val `LVGF_SUBTITLE`: `LVGROUP_MASK` = 256u;
public const val `LVGF_TASK`: `LVGROUP_MASK` = 512u;
public const val `LVGF_TITLEIMAGE`: `LVGROUP_MASK` = 4096u;
public const val `LVGGR_GROUP`: UInt = 0u;
public const val `LVGGR_HEADER`: UInt = 1u;
public const val `LVGGR_LABEL`: UInt = 2u;
public const val `LVGGR_SUBSETLINK`: UInt = 3u;
public const val `LVGHL_CLOSE`: `GROUPHEADERLINESTATES` = 9;
public const val `LVGHL_CLOSEHOT`: `GROUPHEADERLINESTATES` = 10;
public const val `LVGHL_CLOSEMIXEDSELECTION`: `GROUPHEADERLINESTATES` = 15;
public const val `LVGHL_CLOSEMIXEDSELECTIONHOT`: `GROUPHEADERLINESTATES` = 16;
public const val `LVGHL_CLOSESELECTED`: `GROUPHEADERLINESTATES` = 11;
public const val `LVGHL_CLOSESELECTEDHOT`: `GROUPHEADERLINESTATES` = 12;
public const val `LVGHL_CLOSESELECTEDNOTFOCUSED`: `GROUPHEADERLINESTATES` = 13;
public const val `LVGHL_CLOSESELECTEDNOTFOCUSEDHOT`: `GROUPHEADERLINESTATES` = 14;
public const val `LVGHL_OPEN`: `GROUPHEADERLINESTATES` = 1;
public const val `LVGHL_OPENHOT`: `GROUPHEADERLINESTATES` = 2;
public const val `LVGHL_OPENMIXEDSELECTION`: `GROUPHEADERLINESTATES` = 7;
public const val `LVGHL_OPENMIXEDSELECTIONHOT`: `GROUPHEADERLINESTATES` = 8;
public const val `LVGHL_OPENSELECTED`: `GROUPHEADERLINESTATES` = 3;
public const val `LVGHL_OPENSELECTEDHOT`: `GROUPHEADERLINESTATES` = 4;
public const val `LVGHL_OPENSELECTEDNOTFOCUSED`: `GROUPHEADERLINESTATES` = 5;
public const val `LVGHL_OPENSELECTEDNOTFOCUSEDHOT`: `GROUPHEADERLINESTATES` = 6;
public const val `LVGH_CLOSE`: `GROUPHEADERSTATES` = 9;
public const val `LVGH_CLOSEHOT`: `GROUPHEADERSTATES` = 10;
public const val `LVGH_CLOSEMIXEDSELECTION`: `GROUPHEADERSTATES` = 15;
public const val `LVGH_CLOSEMIXEDSELECTIONHOT`: `GROUPHEADERSTATES` = 16;
public const val `LVGH_CLOSESELECTED`: `GROUPHEADERSTATES` = 11;
public const val `LVGH_CLOSESELECTEDHOT`: `GROUPHEADERSTATES` = 12;
public const val `LVGH_CLOSESELECTEDNOTFOCUSED`: `GROUPHEADERSTATES` = 13;
public const val `LVGH_CLOSESELECTEDNOTFOCUSEDHOT`: `GROUPHEADERSTATES` = 14;
public const val `LVGH_OPEN`: `GROUPHEADERSTATES` = 1;
public const val `LVGH_OPENHOT`: `GROUPHEADERSTATES` = 2;
public const val `LVGH_OPENMIXEDSELECTION`: `GROUPHEADERSTATES` = 7;
public const val `LVGH_OPENMIXEDSELECTIONHOT`: `GROUPHEADERSTATES` = 8;
public const val `LVGH_OPENSELECTED`: `GROUPHEADERSTATES` = 3;
public const val `LVGH_OPENSELECTEDHOT`: `GROUPHEADERSTATES` = 4;
public const val `LVGH_OPENSELECTEDNOTFOCUSED`: `GROUPHEADERSTATES` = 5;
public const val `LVGH_OPENSELECTEDNOTFOCUSEDHOT`: `GROUPHEADERSTATES` = 6;
public const val `LVGIT_UNFOLDED`: `NMLVGETINFOTIP_FLAGS` = 1u;
public const val `LVGIT_ZERO`: `NMLVGETINFOTIP_FLAGS` = 0u;
public const val `LVGMF_BORDERCOLOR`: UInt = 2u;
public const val `LVGMF_BORDERSIZE`: UInt = 1u;
public const val `LVGMF_NONE`: UInt = 0u;
public const val `LVGMF_TEXTCOLOR`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVGROUP` (
    public var `cbSize`: UInt,
    public var `mask`: `LVGROUP_MASK`,
    public var `pszHeader`: `windows_sys`.`core`.`PWSTR`,
    public var `cchHeader`: Int,
    public var `pszFooter`: `windows_sys`.`core`.`PWSTR`,
    public var `cchFooter`: Int,
    public var `iGroupId`: Int,
    public var `stateMask`: `LIST_VIEW_GROUP_STATE_FLAGS`,
    public var `state`: `LIST_VIEW_GROUP_STATE_FLAGS`,
    public var `uAlign`: `LIST_VIEW_GROUP_ALIGN_FLAGS`,
    public var `pszSubtitle`: `windows_sys`.`core`.`PWSTR`,
    public var `cchSubtitle`: UInt,
    public var `pszTask`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTask`: UInt,
    public var `pszDescriptionTop`: `windows_sys`.`core`.`PWSTR`,
    public var `cchDescriptionTop`: UInt,
    public var `pszDescriptionBottom`: `windows_sys`.`core`.`PWSTR`,
    public var `cchDescriptionBottom`: UInt,
    public var `iTitleImage`: Int,
    public var `iExtendedImage`: Int,
    public var `iFirstItem`: Int,
    public var `cItems`: UInt,
    public var `pszSubsetTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `cchSubsetTitle`: UInt,
)
// UNSUPPORTED Rust 2430:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVGROUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LVGROUPMETRICS` (
    public var `cbSize`: UInt,
    public var `mask`: UInt,
    public var `Left`: UInt,
    public var `Top`: UInt,
    public var `Right`: UInt,
    public var `Bottom`: UInt,
    public var `crLeft`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `crTop`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `crRight`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `crBottom`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `crHeader`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `crFooter`: `super`.`super`.`Foundation`.`COLORREF`,
)
public typealias `LVGROUP_MASK` = UInt;
public const val `LVGS_COLLAPSED`: `LIST_VIEW_GROUP_STATE_FLAGS` = 1u;
public const val `LVGS_COLLAPSIBLE`: `LIST_VIEW_GROUP_STATE_FLAGS` = 8u;
public const val `LVGS_FOCUSED`: `LIST_VIEW_GROUP_STATE_FLAGS` = 16u;
public const val `LVGS_HIDDEN`: `LIST_VIEW_GROUP_STATE_FLAGS` = 2u;
public const val `LVGS_NOHEADER`: `LIST_VIEW_GROUP_STATE_FLAGS` = 4u;
public const val `LVGS_NORMAL`: `LIST_VIEW_GROUP_STATE_FLAGS` = 0u;
public const val `LVGS_SELECTED`: `LIST_VIEW_GROUP_STATE_FLAGS` = 32u;
public const val `LVGS_SUBSETED`: `LIST_VIEW_GROUP_STATE_FLAGS` = 64u;
public const val `LVGS_SUBSETLINKFOCUSED`: `LIST_VIEW_GROUP_STATE_FLAGS` = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LVHITTESTINFO` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `flags`: `LVHITTESTINFO_FLAGS`,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
    public var `iGroup`: Int,
)
public typealias `LVHITTESTINFO_FLAGS` = UInt;
public const val `LVHT_ABOVE`: `LVHITTESTINFO_FLAGS` = 8u;
public const val `LVHT_BELOW`: `LVHITTESTINFO_FLAGS` = 16u;
public const val `LVHT_EX_FOOTER`: `LVHITTESTINFO_FLAGS` = 134217728u;
public const val `LVHT_EX_GROUP`: `LVHITTESTINFO_FLAGS` = 4076863488u;
public const val `LVHT_EX_GROUP_BACKGROUND`: `LVHITTESTINFO_FLAGS` = 2147483648u;
public const val `LVHT_EX_GROUP_COLLAPSE`: `LVHITTESTINFO_FLAGS` = 1073741824u;
public const val `LVHT_EX_GROUP_FOOTER`: `LVHITTESTINFO_FLAGS` = 536870912u;
public const val `LVHT_EX_GROUP_HEADER`: `LVHITTESTINFO_FLAGS` = 268435456u;
public const val `LVHT_EX_GROUP_STATEICON`: `LVHITTESTINFO_FLAGS` = 16777216u;
public const val `LVHT_EX_GROUP_SUBSETLINK`: `LVHITTESTINFO_FLAGS` = 33554432u;
public const val `LVHT_EX_ONCONTENTS`: `LVHITTESTINFO_FLAGS` = 67108864u;
public const val `LVHT_NOWHERE`: `LVHITTESTINFO_FLAGS` = 1u;
public const val `LVHT_ONITEMICON`: `LVHITTESTINFO_FLAGS` = 2u;
public const val `LVHT_ONITEMLABEL`: `LVHITTESTINFO_FLAGS` = 4u;
public const val `LVHT_ONITEMSTATEICON`: `LVHITTESTINFO_FLAGS` = 8u;
public const val `LVHT_TOLEFT`: `LVHITTESTINFO_FLAGS` = 64u;
public const val `LVHT_TORIGHT`: `LVHITTESTINFO_FLAGS` = 32u;
public const val `LVIF_COLFMT`: `LIST_VIEW_ITEM_FLAGS` = 65536u;
public const val `LVIF_COLUMNS`: `LIST_VIEW_ITEM_FLAGS` = 512u;
public const val `LVIF_DI_SETITEM`: `LIST_VIEW_ITEM_FLAGS` = 4096u;
public const val `LVIF_GROUPID`: `LIST_VIEW_ITEM_FLAGS` = 256u;
public const val `LVIF_IMAGE`: `LIST_VIEW_ITEM_FLAGS` = 2u;
public const val `LVIF_INDENT`: `LIST_VIEW_ITEM_FLAGS` = 16u;
public const val `LVIF_NORECOMPUTE`: `LIST_VIEW_ITEM_FLAGS` = 2048u;
public const val `LVIF_PARAM`: `LIST_VIEW_ITEM_FLAGS` = 4u;
public const val `LVIF_STATE`: `LIST_VIEW_ITEM_FLAGS` = 8u;
public const val `LVIF_TEXT`: `LIST_VIEW_ITEM_FLAGS` = 1u;
public const val `LVIM_AFTER`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVINSERTGROUPSORTED` (
    public var `pfnGroupCompare`: `PFNLVGROUPCOMPARE`,
    public var `pvData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lvGroup`: `LVGROUP`,
)
// UNSUPPORTED Rust 2506:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVINSERTGROUPSORTED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LVINSERTMARK` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `iItem`: Int,
    public var `dwReserved`: UInt,
)
public const val `LVIR_BOUNDS`: UInt = 0u;
public const val `LVIR_ICON`: UInt = 1u;
public const val `LVIR_LABEL`: UInt = 2u;
public const val `LVIR_SELECTBOUNDS`: UInt = 3u;
public const val `LVIS_ACTIVATING`: `LIST_VIEW_ITEM_STATE_FLAGS` = 32u;
public const val `LVIS_CUT`: `LIST_VIEW_ITEM_STATE_FLAGS` = 4u;
public const val `LVIS_DROPHILITED`: `LIST_VIEW_ITEM_STATE_FLAGS` = 8u;
public const val `LVIS_FOCUSED`: `LIST_VIEW_ITEM_STATE_FLAGS` = 1u;
public const val `LVIS_GLOW`: `LIST_VIEW_ITEM_STATE_FLAGS` = 16u;
public const val `LVIS_OVERLAYMASK`: `LIST_VIEW_ITEM_STATE_FLAGS` = 3840u;
public const val `LVIS_SELECTED`: `LIST_VIEW_ITEM_STATE_FLAGS` = 2u;
public const val `LVIS_STATEIMAGEMASK`: `LIST_VIEW_ITEM_STATE_FLAGS` = 61440u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVITEMA` (
    public var `mask`: `LIST_VIEW_ITEM_FLAGS`,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
    public var `state`: `LIST_VIEW_ITEM_STATE_FLAGS`,
    public var `stateMask`: `LIST_VIEW_ITEM_STATE_FLAGS`,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `iIndent`: Int,
    public var `iGroupId`: Int,
    public var `cColumns`: UInt,
    public var `puColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `piColFmt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS`>?,
    public var `iGroup`: Int,
)
// UNSUPPORTED Rust 2550:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `LVITEMA_GROUP_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LVITEMINDEX` (
    public var `iItem`: Int,
    public var `iGroup`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVITEMW` (
    public var `mask`: `LIST_VIEW_ITEM_FLAGS`,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
    public var `state`: `LIST_VIEW_ITEM_STATE_FLAGS`,
    public var `stateMask`: `LIST_VIEW_ITEM_STATE_FLAGS`,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `iIndent`: Int,
    public var `iGroupId`: Int,
    public var `cColumns`: UInt,
    public var `puColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `piColFmt`: /* Rust *mut */ kotlinx.cinterop.CPointer<`LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS`>?,
    public var `iGroup`: Int,
)
// UNSUPPORTED Rust 2581:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LVKF_ALT`: UInt = 1u;
public const val `LVKF_CONTROL`: UInt = 2u;
public const val `LVKF_SHIFT`: UInt = 4u;
public const val `LVM_APPROXIMATEVIEWRECT`: UInt = 4160u;
public const val `LVM_ARRANGE`: UInt = 4118u;
public const val `LVM_CANCELEDITLABEL`: UInt = 4275u;
public const val `LVM_CREATEDRAGIMAGE`: UInt = 4129u;
public const val `LVM_DELETEALLITEMS`: UInt = 4105u;
public const val `LVM_DELETECOLUMN`: UInt = 4124u;
public const val `LVM_DELETEITEM`: UInt = 4104u;
public const val `LVM_EDITLABEL`: UInt = 4214u;
public const val `LVM_EDITLABELA`: UInt = 4119u;
public const val `LVM_EDITLABELW`: UInt = 4214u;
public const val `LVM_ENABLEGROUPVIEW`: UInt = 4253u;
public const val `LVM_ENSUREVISIBLE`: UInt = 4115u;
public const val `LVM_FINDITEM`: UInt = 4179u;
public const val `LVM_FINDITEMA`: UInt = 4109u;
public const val `LVM_FINDITEMW`: UInt = 4179u;
public const val `LVM_FIRST`: UInt = 4096u;
public const val `LVM_GETBKCOLOR`: UInt = 4096u;
public const val `LVM_GETBKIMAGE`: UInt = 4235u;
public const val `LVM_GETBKIMAGEA`: UInt = 4165u;
public const val `LVM_GETBKIMAGEW`: UInt = 4235u;
public const val `LVM_GETCALLBACKMASK`: UInt = 4106u;
public const val `LVM_GETCOLUMN`: UInt = 4191u;
public const val `LVM_GETCOLUMNA`: UInt = 4121u;
public const val `LVM_GETCOLUMNORDERARRAY`: UInt = 4155u;
public const val `LVM_GETCOLUMNW`: UInt = 4191u;
public const val `LVM_GETCOLUMNWIDTH`: UInt = 4125u;
public const val `LVM_GETCOUNTPERPAGE`: UInt = 4136u;
public const val `LVM_GETEDITCONTROL`: UInt = 4120u;
public const val `LVM_GETEMPTYTEXT`: UInt = 4300u;
public const val `LVM_GETEXTENDEDLISTVIEWSTYLE`: UInt = 4151u;
public const val `LVM_GETFOCUSEDGROUP`: UInt = 4189u;
public const val `LVM_GETFOOTERINFO`: UInt = 4302u;
public const val `LVM_GETFOOTERITEM`: UInt = 4304u;
public const val `LVM_GETFOOTERITEMRECT`: UInt = 4303u;
public const val `LVM_GETFOOTERRECT`: UInt = 4301u;
public const val `LVM_GETGROUPCOUNT`: UInt = 4248u;
public const val `LVM_GETGROUPINFO`: UInt = 4245u;
public const val `LVM_GETGROUPINFOBYINDEX`: UInt = 4249u;
public const val `LVM_GETGROUPMETRICS`: UInt = 4252u;
public const val `LVM_GETGROUPRECT`: UInt = 4194u;
public const val `LVM_GETGROUPSTATE`: UInt = 4188u;
public const val `LVM_GETHEADER`: UInt = 4127u;
public const val `LVM_GETHOTCURSOR`: UInt = 4159u;
public const val `LVM_GETHOTITEM`: UInt = 4157u;
public const val `LVM_GETHOVERTIME`: UInt = 4168u;
public const val `LVM_GETIMAGELIST`: UInt = 4098u;
public const val `LVM_GETINSERTMARK`: UInt = 4263u;
public const val `LVM_GETINSERTMARKCOLOR`: UInt = 4267u;
public const val `LVM_GETINSERTMARKRECT`: UInt = 4265u;
public const val `LVM_GETISEARCHSTRING`: UInt = 4213u;
public const val `LVM_GETISEARCHSTRINGA`: UInt = 4148u;
public const val `LVM_GETISEARCHSTRINGW`: UInt = 4213u;
public const val `LVM_GETITEM`: UInt = 4171u;
public const val `LVM_GETITEMA`: UInt = 4101u;
public const val `LVM_GETITEMCOUNT`: UInt = 4100u;
public const val `LVM_GETITEMINDEXRECT`: UInt = 4305u;
public const val `LVM_GETITEMPOSITION`: UInt = 4112u;
public const val `LVM_GETITEMRECT`: UInt = 4110u;
public const val `LVM_GETITEMSPACING`: UInt = 4147u;
public const val `LVM_GETITEMSTATE`: UInt = 4140u;
public const val `LVM_GETITEMTEXT`: UInt = 4211u;
public const val `LVM_GETITEMTEXTA`: UInt = 4141u;
public const val `LVM_GETITEMTEXTW`: UInt = 4211u;
public const val `LVM_GETITEMW`: UInt = 4171u;
public const val `LVM_GETNEXTITEM`: UInt = 4108u;
public const val `LVM_GETNEXTITEMINDEX`: UInt = 4307u;
public const val `LVM_GETNUMBEROFWORKAREAS`: UInt = 4169u;
public const val `LVM_GETORIGIN`: UInt = 4137u;
public const val `LVM_GETOUTLINECOLOR`: UInt = 4272u;
public const val `LVM_GETSELECTEDCOLUMN`: UInt = 4270u;
public const val `LVM_GETSELECTEDCOUNT`: UInt = 4146u;
public const val `LVM_GETSELECTIONMARK`: UInt = 4162u;
public const val `LVM_GETSTRINGWIDTH`: UInt = 4183u;
public const val `LVM_GETSTRINGWIDTHA`: UInt = 4113u;
public const val `LVM_GETSTRINGWIDTHW`: UInt = 4183u;
public const val `LVM_GETSUBITEMRECT`: UInt = 4152u;
public const val `LVM_GETTEXTBKCOLOR`: UInt = 4133u;
public const val `LVM_GETTEXTCOLOR`: UInt = 4131u;
public const val `LVM_GETTILEINFO`: UInt = 4261u;
public const val `LVM_GETTILEVIEWINFO`: UInt = 4259u;
public const val `LVM_GETTOOLTIPS`: UInt = 4174u;
public const val `LVM_GETTOPINDEX`: UInt = 4135u;
public const val `LVM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `LVM_GETVIEW`: UInt = 4239u;
public const val `LVM_GETVIEWRECT`: UInt = 4130u;
public const val `LVM_GETWORKAREAS`: UInt = 4166u;
public const val `LVM_HASGROUP`: UInt = 4257u;
public const val `LVM_HITTEST`: UInt = 4114u;
public const val `LVM_INSERTCOLUMN`: UInt = 4193u;
public const val `LVM_INSERTCOLUMNA`: UInt = 4123u;
public const val `LVM_INSERTCOLUMNW`: UInt = 4193u;
public const val `LVM_INSERTGROUP`: UInt = 4241u;
public const val `LVM_INSERTGROUPSORTED`: UInt = 4255u;
public const val `LVM_INSERTITEM`: UInt = 4173u;
public const val `LVM_INSERTITEMA`: UInt = 4103u;
public const val `LVM_INSERTITEMW`: UInt = 4173u;
public const val `LVM_INSERTMARKHITTEST`: UInt = 4264u;
public const val `LVM_ISGROUPVIEWENABLED`: UInt = 4271u;
public const val `LVM_ISITEMVISIBLE`: UInt = 4278u;
public const val `LVM_MAPIDTOINDEX`: UInt = 4277u;
public const val `LVM_MAPINDEXTOID`: UInt = 4276u;
public const val `LVM_MOVEGROUP`: UInt = 4247u;
public const val `LVM_MOVEITEMTOGROUP`: UInt = 4250u;
public const val `LVM_REDRAWITEMS`: UInt = 4117u;
public const val `LVM_REMOVEALLGROUPS`: UInt = 4256u;
public const val `LVM_REMOVEGROUP`: UInt = 4246u;
public const val `LVM_SCROLL`: UInt = 4116u;
public const val `LVM_SETBKCOLOR`: UInt = 4097u;
public const val `LVM_SETBKIMAGE`: UInt = 4234u;
public const val `LVM_SETBKIMAGEA`: UInt = 4164u;
public const val `LVM_SETBKIMAGEW`: UInt = 4234u;
public const val `LVM_SETCALLBACKMASK`: UInt = 4107u;
public const val `LVM_SETCOLUMN`: UInt = 4192u;
public const val `LVM_SETCOLUMNA`: UInt = 4122u;
public const val `LVM_SETCOLUMNORDERARRAY`: UInt = 4154u;
public const val `LVM_SETCOLUMNW`: UInt = 4192u;
public const val `LVM_SETCOLUMNWIDTH`: UInt = 4126u;
public const val `LVM_SETEXTENDEDLISTVIEWSTYLE`: UInt = 4150u;
public const val `LVM_SETGROUPINFO`: UInt = 4243u;
public const val `LVM_SETGROUPMETRICS`: UInt = 4251u;
public const val `LVM_SETHOTCURSOR`: UInt = 4158u;
public const val `LVM_SETHOTITEM`: UInt = 4156u;
public const val `LVM_SETHOVERTIME`: UInt = 4167u;
public const val `LVM_SETICONSPACING`: UInt = 4149u;
public const val `LVM_SETIMAGELIST`: UInt = 4099u;
public const val `LVM_SETINFOTIP`: UInt = 4269u;
public const val `LVM_SETINSERTMARK`: UInt = 4262u;
public const val `LVM_SETINSERTMARKCOLOR`: UInt = 4266u;
public const val `LVM_SETITEM`: UInt = 4172u;
public const val `LVM_SETITEMA`: UInt = 4102u;
public const val `LVM_SETITEMCOUNT`: UInt = 4143u;
public const val `LVM_SETITEMINDEXSTATE`: UInt = 4306u;
public const val `LVM_SETITEMPOSITION`: UInt = 4111u;
public const val `LVM_SETITEMPOSITION32`: UInt = 4145u;
public const val `LVM_SETITEMSTATE`: UInt = 4139u;
public const val `LVM_SETITEMTEXT`: UInt = 4212u;
public const val `LVM_SETITEMTEXTA`: UInt = 4142u;
public const val `LVM_SETITEMTEXTW`: UInt = 4212u;
public const val `LVM_SETITEMW`: UInt = 4172u;
public const val `LVM_SETOUTLINECOLOR`: UInt = 4273u;
public const val `LVM_SETSELECTEDCOLUMN`: UInt = 4236u;
public const val `LVM_SETSELECTIONMARK`: UInt = 4163u;
public const val `LVM_SETTEXTBKCOLOR`: UInt = 4134u;
public const val `LVM_SETTEXTCOLOR`: UInt = 4132u;
public const val `LVM_SETTILEINFO`: UInt = 4260u;
public const val `LVM_SETTILEVIEWINFO`: UInt = 4258u;
public const val `LVM_SETTOOLTIPS`: UInt = 4170u;
public const val `LVM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `LVM_SETVIEW`: UInt = 4238u;
public const val `LVM_SETWORKAREAS`: UInt = 4161u;
public const val `LVM_SORTGROUPS`: UInt = 4254u;
public const val `LVM_SORTITEMS`: UInt = 4144u;
public const val `LVM_SORTITEMSEX`: UInt = 4177u;
public const val `LVM_SUBITEMHITTEST`: UInt = 4153u;
public const val `LVM_UPDATE`: UInt = 4138u;
public const val `LVNI_ABOVE`: UInt = 256u;
public const val `LVNI_ALL`: UInt = 0u;
public const val `LVNI_BELOW`: UInt = 512u;
public const val `LVNI_CUT`: UInt = 4u;
public const val `LVNI_DROPHILITED`: UInt = 8u;
public const val `LVNI_FOCUSED`: UInt = 1u;
public const val `LVNI_PREVIOUS`: UInt = 32u;
public const val `LVNI_SAMEGROUPONLY`: UInt = 128u;
public const val `LVNI_SELECTED`: UInt = 2u;
public const val `LVNI_TOLEFT`: UInt = 1024u;
public const val `LVNI_TORIGHT`: UInt = 2048u;
public const val `LVNI_VISIBLEONLY`: UInt = 64u;
public const val `LVNI_VISIBLEORDER`: UInt = 16u;
public const val `LVNSCH_DEFAULT`: Int = -1;
public const val `LVNSCH_ERROR`: Int = -2;
public const val `LVNSCH_IGNORE`: Int = -3;
public const val `LVN_BEGINDRAG`: UInt = 4294967187u;
public const val `LVN_BEGINLABELEDIT`: UInt = 4294967121u;
public const val `LVN_BEGINLABELEDITA`: UInt = 4294967191u;
public const val `LVN_BEGINLABELEDITW`: UInt = 4294967121u;
public const val `LVN_BEGINRDRAG`: UInt = 4294967185u;
public const val `LVN_BEGINSCROLL`: UInt = 4294967116u;
public const val `LVN_COLUMNCLICK`: UInt = 4294967188u;
public const val `LVN_COLUMNDROPDOWN`: UInt = 4294967132u;
public const val `LVN_COLUMNOVERFLOWCLICK`: UInt = 4294967130u;
public const val `LVN_DELETEALLITEMS`: UInt = 4294967192u;
public const val `LVN_DELETEITEM`: UInt = 4294967193u;
public const val `LVN_ENDLABELEDIT`: UInt = 4294967120u;
public const val `LVN_ENDLABELEDITA`: UInt = 4294967190u;
public const val `LVN_ENDLABELEDITW`: UInt = 4294967120u;
public const val `LVN_ENDSCROLL`: UInt = 4294967115u;
public const val `LVN_FIRST`: UInt = 4294967196u;
public const val `LVN_GETDISPINFO`: UInt = 4294967119u;
public const val `LVN_GETDISPINFOA`: UInt = 4294967146u;
public const val `LVN_GETDISPINFOW`: UInt = 4294967119u;
public const val `LVN_GETEMPTYMARKUP`: UInt = 4294967109u;
public const val `LVN_GETINFOTIP`: UInt = 4294967138u;
public const val `LVN_GETINFOTIPA`: UInt = 4294967139u;
public const val `LVN_GETINFOTIPW`: UInt = 4294967138u;
public const val `LVN_HOTTRACK`: UInt = 4294967175u;
public const val `LVN_INCREMENTALSEARCH`: UInt = 4294967133u;
public const val `LVN_INCREMENTALSEARCHA`: UInt = 4294967134u;
public const val `LVN_INCREMENTALSEARCHW`: UInt = 4294967133u;
public const val `LVN_INSERTITEM`: UInt = 4294967194u;
public const val `LVN_ITEMACTIVATE`: UInt = 4294967182u;
public const val `LVN_ITEMCHANGED`: UInt = 4294967195u;
public const val `LVN_ITEMCHANGING`: UInt = 4294967196u;
public const val `LVN_KEYDOWN`: UInt = 4294967141u;
public const val `LVN_LAST`: UInt = 4294967097u;
public const val `LVN_LINKCLICK`: UInt = 4294967112u;
public const val `LVN_MARQUEEBEGIN`: UInt = 4294967140u;
public const val `LVN_ODCACHEHINT`: UInt = 4294967183u;
public const val `LVN_ODFINDITEM`: UInt = 4294967117u;
public const val `LVN_ODFINDITEMA`: UInt = 4294967144u;
public const val `LVN_ODFINDITEMW`: UInt = 4294967117u;
public const val `LVN_ODSTATECHANGED`: UInt = 4294967181u;
public const val `LVN_SETDISPINFO`: UInt = 4294967118u;
public const val `LVN_SETDISPINFOA`: UInt = 4294967145u;
public const val `LVN_SETDISPINFOW`: UInt = 4294967118u;
public const val `LVP_COLLAPSEBUTTON`: `LISTVIEWPARTS` = 9;
public const val `LVP_COLUMNDETAIL`: `LISTVIEWPARTS` = 10;
public const val `LVP_EMPTYTEXT`: `LISTVIEWPARTS` = 5;
public const val `LVP_EXPANDBUTTON`: `LISTVIEWPARTS` = 8;
public const val `LVP_GROUPHEADER`: `LISTVIEWPARTS` = 6;
public const val `LVP_GROUPHEADERLINE`: `LISTVIEWPARTS` = 7;
public const val `LVP_LISTDETAIL`: `LISTVIEWPARTS` = 3;
public const val `LVP_LISTGROUP`: `LISTVIEWPARTS` = 2;
public const val `LVP_LISTITEM`: `LISTVIEWPARTS` = 1;
public const val `LVP_LISTSORTEDDETAIL`: `LISTVIEWPARTS` = 4;
public const val `LVSCW_AUTOSIZE`: Int = -1;
public const val `LVSCW_AUTOSIZE_USEHEADER`: Int = -2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVSETINFOTIP` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
)
// UNSUPPORTED Rust 2824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVSETINFOTIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LVSICF_NOINVALIDATEALL`: UInt = 1u;
public const val `LVSICF_NOSCROLL`: UInt = 2u;
public const val `LVSIL_GROUPHEADER`: UInt = 3u;
public const val `LVSIL_NORMAL`: UInt = 0u;
public const val `LVSIL_SMALL`: UInt = 1u;
public const val `LVSIL_STATE`: UInt = 2u;
public const val `LVS_ALIGNLEFT`: UInt = 2048u;
public const val `LVS_ALIGNMASK`: UInt = 3072u;
public const val `LVS_ALIGNTOP`: UInt = 0u;
public const val `LVS_AUTOARRANGE`: UInt = 256u;
public const val `LVS_EDITLABELS`: UInt = 512u;
public const val `LVS_EX_AUTOAUTOARRANGE`: UInt = 16777216u;
public const val `LVS_EX_AUTOCHECKSELECT`: UInt = 134217728u;
public const val `LVS_EX_AUTOSIZECOLUMNS`: UInt = 268435456u;
public const val `LVS_EX_BORDERSELECT`: UInt = 32768u;
public const val `LVS_EX_CHECKBOXES`: UInt = 4u;
public const val `LVS_EX_COLUMNOVERFLOW`: UInt = 2147483648u;
public const val `LVS_EX_COLUMNSNAPPOINTS`: UInt = 1073741824u;
public const val `LVS_EX_DOUBLEBUFFER`: UInt = 65536u;
public const val `LVS_EX_FLATSB`: UInt = 256u;
public const val `LVS_EX_FULLROWSELECT`: UInt = 32u;
public const val `LVS_EX_GRIDLINES`: UInt = 1u;
public const val `LVS_EX_HEADERDRAGDROP`: UInt = 16u;
public const val `LVS_EX_HEADERINALLVIEWS`: UInt = 33554432u;
public const val `LVS_EX_HIDELABELS`: UInt = 131072u;
public const val `LVS_EX_INFOTIP`: UInt = 1024u;
public const val `LVS_EX_JUSTIFYCOLUMNS`: UInt = 2097152u;
public const val `LVS_EX_LABELTIP`: UInt = 16384u;
public const val `LVS_EX_MULTIWORKAREAS`: UInt = 8192u;
public const val `LVS_EX_ONECLICKACTIVATE`: UInt = 64u;
public const val `LVS_EX_REGIONAL`: UInt = 512u;
public const val `LVS_EX_SIMPLESELECT`: UInt = 1048576u;
public const val `LVS_EX_SINGLEROW`: UInt = 262144u;
public const val `LVS_EX_SNAPTOGRID`: UInt = 524288u;
public const val `LVS_EX_SUBITEMIMAGES`: UInt = 2u;
public const val `LVS_EX_TRACKSELECT`: UInt = 8u;
public const val `LVS_EX_TRANSPARENTBKGND`: UInt = 4194304u;
public const val `LVS_EX_TRANSPARENTSHADOWTEXT`: UInt = 8388608u;
public const val `LVS_EX_TWOCLICKACTIVATE`: UInt = 128u;
public const val `LVS_EX_UNDERLINECOLD`: UInt = 4096u;
public const val `LVS_EX_UNDERLINEHOT`: UInt = 2048u;
public const val `LVS_ICON`: UInt = 0u;
public const val `LVS_LIST`: UInt = 3u;
public const val `LVS_NOCOLUMNHEADER`: UInt = 16384u;
public const val `LVS_NOLABELWRAP`: UInt = 128u;
public const val `LVS_NOSCROLL`: UInt = 8192u;
public const val `LVS_NOSORTHEADER`: UInt = 32768u;
public const val `LVS_OWNERDATA`: UInt = 4096u;
public const val `LVS_OWNERDRAWFIXED`: UInt = 1024u;
public const val `LVS_REPORT`: UInt = 1u;
public const val `LVS_SHAREIMAGELISTS`: UInt = 64u;
public const val `LVS_SHOWSELALWAYS`: UInt = 8u;
public const val `LVS_SINGLESEL`: UInt = 4u;
public const val `LVS_SMALLICON`: UInt = 2u;
public const val `LVS_SORTASCENDING`: UInt = 16u;
public const val `LVS_SORTDESCENDING`: UInt = 32u;
public const val `LVS_TYPEMASK`: UInt = 3u;
public const val `LVS_TYPESTYLEMASK`: UInt = 64512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LVTILEINFO` (
    public var `cbSize`: UInt,
    public var `iItem`: Int,
    public var `cColumns`: UInt,
    public var `puColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `piColFmt`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
)
// UNSUPPORTED Rust 2896:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LVTILEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LVTILEVIEWINFO` (
    public var `cbSize`: UInt,
    public var `dwMask`: `LVTILEVIEWINFO_MASK`,
    public var `dwFlags`: `LVTILEVIEWINFO_FLAGS`,
    public var `sizeTile`: `super`.`super`.`Foundation`.`SIZE`,
    public var `cLines`: Int,
    public var `rcLabelMargin`: `super`.`super`.`Foundation`.`RECT`,
)
public typealias `LVTILEVIEWINFO_FLAGS` = UInt;
public typealias `LVTILEVIEWINFO_MASK` = UInt;
public const val `LVTVIF_AUTOSIZE`: `LVTILEVIEWINFO_FLAGS` = 0u;
public const val `LVTVIF_EXTENDED`: UInt = 4u;
public const val `LVTVIF_FIXEDHEIGHT`: `LVTILEVIEWINFO_FLAGS` = 2u;
public const val `LVTVIF_FIXEDSIZE`: `LVTILEVIEWINFO_FLAGS` = 3u;
public const val `LVTVIF_FIXEDWIDTH`: `LVTILEVIEWINFO_FLAGS` = 1u;
public const val `LVTVIM_COLUMNS`: `LVTILEVIEWINFO_MASK` = 2u;
public const val `LVTVIM_LABELMARGIN`: `LVTILEVIEWINFO_MASK` = 4u;
public const val `LVTVIM_TILESIZE`: `LVTILEVIEWINFO_MASK` = 1u;
public const val `LV_MAX_WORKAREAS`: UInt = 16u;
public const val `LV_VIEW_DETAILS`: UInt = 1u;
public const val `LV_VIEW_ICON`: UInt = 0u;
public const val `LV_VIEW_LIST`: UInt = 3u;
public const val `LV_VIEW_MAX`: UInt = 4u;
public const val `LV_VIEW_SMALLICON`: UInt = 2u;
public const val `LV_VIEW_TILE`: UInt = 4u;
public const val `LWS_IGNORERETURN`: UInt = 2u;
public const val `LWS_NOPREFIX`: UInt = 4u;
public const val `LWS_RIGHT`: UInt = 32u;
public const val `LWS_TRANSPARENT`: UInt = 1u;
public const val `LWS_USECUSTOMTEXT`: UInt = 16u;
public const val `LWS_USEVISUALSTYLE`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MARGINS` (
    public var `cxLeftWidth`: Int,
    public var `cxRightWidth`: Int,
    public var `cyTopHeight`: Int,
    public var `cyBottomHeight`: Int,
)
public typealias `MARKUPTEXTSTATES` = Int;
public const val `MAXBS_DISABLED`: `MAXBUTTONSTATES` = 4;
public const val `MAXBS_HOT`: `MAXBUTTONSTATES` = 2;
public const val `MAXBS_NORMAL`: `MAXBUTTONSTATES` = 1;
public const val `MAXBS_PUSHED`: `MAXBUTTONSTATES` = 3;
public typealias `MAXBUTTONSTATES` = Int;
public typealias `MAXCAPTIONSTATES` = Int;
public const val `MAXPROPPAGES`: UInt = 100u;
public const val `MAX_INTLIST_COUNT`: UInt = 402u;
public const val `MAX_LINKID_TEXT`: UInt = 48u;
public const val `MAX_THEMECOLOR`: UInt = 64u;
public const val `MAX_THEMESIZE`: UInt = 64u;
public const val `MBI_DISABLED`: `BARITEMSTATES` = 4;
public const val `MBI_DISABLEDHOT`: `BARITEMSTATES` = 5;
public const val `MBI_DISABLEDPUSHED`: `BARITEMSTATES` = 6;
public const val `MBI_HOT`: `BARITEMSTATES` = 2;
public const val `MBI_NORMAL`: `BARITEMSTATES` = 1;
public const val `MBI_PUSHED`: `BARITEMSTATES` = 3;
public const val `MB_ACTIVE`: `BARBACKGROUNDSTATES` = 1;
public const val `MB_INACTIVE`: `BARBACKGROUNDSTATES` = 2;
public const val `MCB_BITMAP`: `POPUPCHECKBACKGROUNDSTATES` = 3;
public const val `MCB_DISABLED`: `POPUPCHECKBACKGROUNDSTATES` = 1;
public const val `MCB_NORMAL`: `POPUPCHECKBACKGROUNDSTATES` = 2;
public const val `MCGCB_HOT`: `GRIDCELLBACKGROUNDSTATES` = 2;
public const val `MCGCB_SELECTED`: `GRIDCELLBACKGROUNDSTATES` = 1;
public const val `MCGCB_SELECTEDHOT`: `GRIDCELLBACKGROUNDSTATES` = 3;
public const val `MCGCB_SELECTEDNOTFOCUSED`: `GRIDCELLBACKGROUNDSTATES` = 4;
public const val `MCGCB_TODAY`: `GRIDCELLBACKGROUNDSTATES` = 5;
public const val `MCGCB_TODAYSELECTED`: `GRIDCELLBACKGROUNDSTATES` = 6;
public const val `MCGCU_HASSTATE`: `GRIDCELLUPPERSTATES` = 2;
public const val `MCGCU_HASSTATEHOT`: `GRIDCELLUPPERSTATES` = 3;
public const val `MCGCU_HOT`: `GRIDCELLUPPERSTATES` = 1;
public const val `MCGCU_SELECTED`: `GRIDCELLUPPERSTATES` = 4;
public const val `MCGCU_SELECTEDHOT`: `GRIDCELLUPPERSTATES` = 5;
public const val `MCGC_HASSTATE`: `GRIDCELLSTATES` = 2;
public const val `MCGC_HASSTATEHOT`: `GRIDCELLSTATES` = 3;
public const val `MCGC_HOT`: `GRIDCELLSTATES` = 1;
public const val `MCGC_SELECTED`: `GRIDCELLSTATES` = 6;
public const val `MCGC_SELECTEDHOT`: `GRIDCELLSTATES` = 7;
public const val `MCGC_TODAY`: `GRIDCELLSTATES` = 4;
public const val `MCGC_TODAYSELECTED`: `GRIDCELLSTATES` = 5;
public const val `MCGIF_DATE`: `MCGRIDINFO_FLAGS` = 1u;
public const val `MCGIF_NAME`: `MCGRIDINFO_FLAGS` = 4u;
public const val `MCGIF_RECT`: `MCGRIDINFO_FLAGS` = 2u;
public const val `MCGIP_CALENDAR`: `MCGRIDINFO_PART` = 4u;
public const val `MCGIP_CALENDARBODY`: `MCGRIDINFO_PART` = 6u;
public const val `MCGIP_CALENDARCELL`: `MCGRIDINFO_PART` = 8u;
public const val `MCGIP_CALENDARCONTROL`: `MCGRIDINFO_PART` = 0u;
public const val `MCGIP_CALENDARHEADER`: `MCGRIDINFO_PART` = 5u;
public const val `MCGIP_CALENDARROW`: `MCGRIDINFO_PART` = 7u;
public const val `MCGIP_FOOTER`: `MCGRIDINFO_PART` = 3u;
public const val `MCGIP_NEXT`: `MCGRIDINFO_PART` = 1u;
public const val `MCGIP_PREV`: `MCGRIDINFO_PART` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MCGRIDINFO` (
    public var `cbSize`: UInt,
    public var `dwPart`: `MCGRIDINFO_PART`,
    public var `dwFlags`: `MCGRIDINFO_FLAGS`,
    public var `iCalendar`: Int,
    public var `iRow`: Int,
    public var `iCol`: Int,
    public var `bSelected`: `windows_sys`.`core`.`BOOL`,
    public var `stStart`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `stEnd`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `rc`: `super`.`super`.`Foundation`.`RECT`,
    public var `pszName`: `windows_sys`.`core`.`PWSTR`,
    public var `cchName`: ULong,
)
// UNSUPPORTED Rust 3011:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MCGRIDINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MCGRIDINFO_FLAGS` = UInt;
public typealias `MCGRIDINFO_PART` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MCHITTESTINFO` (
    public var `cbSize`: UInt,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `uHit`: `MCHITTESTINFO_HIT_FLAGS`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `rc`: `super`.`super`.`Foundation`.`RECT`,
    public var `iOffset`: Int,
    public var `iRow`: Int,
    public var `iCol`: Int,
)
public typealias `MCHITTESTINFO_HIT_FLAGS` = UInt;
public const val `MCHT_CALENDAR`: `MCHITTESTINFO_HIT_FLAGS` = 131072u;
public const val `MCHT_CALENDARBK`: `MCHITTESTINFO_HIT_FLAGS` = 131072u;
public const val `MCHT_CALENDARCONTROL`: `MCHITTESTINFO_HIT_FLAGS` = 1048576u;
public const val `MCHT_CALENDARDATE`: `MCHITTESTINFO_HIT_FLAGS` = 131073u;
public const val `MCHT_CALENDARDATEMAX`: `MCHITTESTINFO_HIT_FLAGS` = 131077u;
public const val `MCHT_CALENDARDATEMIN`: `MCHITTESTINFO_HIT_FLAGS` = 131076u;
public const val `MCHT_CALENDARDATENEXT`: `MCHITTESTINFO_HIT_FLAGS` = 16908289u;
public const val `MCHT_CALENDARDATEPREV`: `MCHITTESTINFO_HIT_FLAGS` = 33685505u;
public const val `MCHT_CALENDARDAY`: `MCHITTESTINFO_HIT_FLAGS` = 131074u;
public const val `MCHT_CALENDARWEEKNUM`: `MCHITTESTINFO_HIT_FLAGS` = 131075u;
public const val `MCHT_NEXT`: `MCHITTESTINFO_HIT_FLAGS` = 16777216u;
public const val `MCHT_NOWHERE`: `MCHITTESTINFO_HIT_FLAGS` = 0u;
public const val `MCHT_PREV`: `MCHITTESTINFO_HIT_FLAGS` = 33554432u;
public const val `MCHT_TITLE`: `MCHITTESTINFO_HIT_FLAGS` = 65536u;
public const val `MCHT_TITLEBK`: `MCHITTESTINFO_HIT_FLAGS` = 65536u;
public const val `MCHT_TITLEBTNNEXT`: `MCHITTESTINFO_HIT_FLAGS` = 16842755u;
public const val `MCHT_TITLEBTNPREV`: `MCHITTESTINFO_HIT_FLAGS` = 33619971u;
public const val `MCHT_TITLEMONTH`: `MCHITTESTINFO_HIT_FLAGS` = 65537u;
public const val `MCHT_TITLEYEAR`: `MCHITTESTINFO_HIT_FLAGS` = 65538u;
public const val `MCHT_TODAYLINK`: `MCHITTESTINFO_HIT_FLAGS` = 196608u;
public const val `MCMV_CENTURY`: `MONTH_CALDENDAR_MESSAGES_VIEW` = 3u;
public const val `MCMV_DECADE`: `MONTH_CALDENDAR_MESSAGES_VIEW` = 2u;
public const val `MCMV_MAX`: `MONTH_CALDENDAR_MESSAGES_VIEW` = 3u;
public const val `MCMV_MONTH`: `MONTH_CALDENDAR_MESSAGES_VIEW` = 0u;
public const val `MCMV_YEAR`: `MONTH_CALDENDAR_MESSAGES_VIEW` = 1u;
public const val `MCM_FIRST`: UInt = 4096u;
public const val `MCM_GETCALENDARBORDER`: UInt = 4127u;
public const val `MCM_GETCALENDARCOUNT`: UInt = 4119u;
public const val `MCM_GETCALENDARGRIDINFO`: UInt = 4120u;
public const val `MCM_GETCALID`: UInt = 4123u;
public const val `MCM_GETCOLOR`: UInt = 4107u;
public const val `MCM_GETCURRENTVIEW`: UInt = 4118u;
public const val `MCM_GETCURSEL`: UInt = 4097u;
public const val `MCM_GETFIRSTDAYOFWEEK`: UInt = 4112u;
public const val `MCM_GETMAXSELCOUNT`: UInt = 4099u;
public const val `MCM_GETMAXTODAYWIDTH`: UInt = 4117u;
public const val `MCM_GETMINREQRECT`: UInt = 4105u;
public const val `MCM_GETMONTHDELTA`: UInt = 4115u;
public const val `MCM_GETMONTHRANGE`: UInt = 4103u;
public const val `MCM_GETRANGE`: UInt = 4113u;
public const val `MCM_GETSELRANGE`: UInt = 4101u;
public const val `MCM_GETTODAY`: UInt = 4109u;
public const val `MCM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `MCM_HITTEST`: UInt = 4110u;
public const val `MCM_SETCALENDARBORDER`: UInt = 4126u;
public const val `MCM_SETCALID`: UInt = 4124u;
public const val `MCM_SETCOLOR`: UInt = 4106u;
public const val `MCM_SETCURRENTVIEW`: UInt = 4128u;
public const val `MCM_SETCURSEL`: UInt = 4098u;
public const val `MCM_SETDAYSTATE`: UInt = 4104u;
public const val `MCM_SETFIRSTDAYOFWEEK`: UInt = 4111u;
public const val `MCM_SETMAXSELCOUNT`: UInt = 4100u;
public const val `MCM_SETMONTHDELTA`: UInt = 4116u;
public const val `MCM_SETRANGE`: UInt = 4114u;
public const val `MCM_SETSELRANGE`: UInt = 4102u;
public const val `MCM_SETTODAY`: UInt = 4108u;
public const val `MCM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `MCM_SIZERECTTOMIN`: UInt = 4125u;
public const val `MCNN_DISABLED`: `NAVNEXTSTATES` = 4;
public const val `MCNN_HOT`: `NAVNEXTSTATES` = 2;
public const val `MCNN_NORMAL`: `NAVNEXTSTATES` = 1;
public const val `MCNN_PRESSED`: `NAVNEXTSTATES` = 3;
public const val `MCNP_DISABLED`: `NAVPREVSTATES` = 4;
public const val `MCNP_HOT`: `NAVPREVSTATES` = 2;
public const val `MCNP_NORMAL`: `NAVPREVSTATES` = 1;
public const val `MCNP_PRESSED`: `NAVPREVSTATES` = 3;
public const val `MCN_FIRST`: UInt = 4294966550u;
public const val `MCN_GETDAYSTATE`: UInt = 4294966549u;
public const val `MCN_LAST`: UInt = 4294966544u;
public const val `MCN_SELCHANGE`: UInt = 4294966547u;
public const val `MCN_SELECT`: UInt = 4294966550u;
public const val `MCN_VIEWCHANGE`: UInt = 4294966546u;
public const val `MCSC_BACKGROUND`: UInt = 0u;
public const val `MCSC_MONTHBK`: UInt = 4u;
public const val `MCSC_TEXT`: UInt = 1u;
public const val `MCSC_TITLEBK`: UInt = 2u;
public const val `MCSC_TITLETEXT`: UInt = 3u;
public const val `MCSC_TRAILINGTEXT`: UInt = 5u;
public const val `MCS_DAYSTATE`: UInt = 1u;
public const val `MCS_MULTISELECT`: UInt = 2u;
public const val `MCS_NOSELCHANGEONNAV`: UInt = 256u;
public const val `MCS_NOTODAY`: UInt = 16u;
public const val `MCS_NOTODAYCIRCLE`: UInt = 8u;
public const val `MCS_NOTRAILINGDATES`: UInt = 64u;
public const val `MCS_SHORTDAYSOFWEEK`: UInt = 128u;
public const val `MCS_WEEKNUMBERS`: UInt = 4u;
public const val `MCTGCU_HASSTATE`: `TRAILINGGRIDCELLUPPERSTATES` = 2;
public const val `MCTGCU_HASSTATEHOT`: `TRAILINGGRIDCELLUPPERSTATES` = 3;
public const val `MCTGCU_HOT`: `TRAILINGGRIDCELLUPPERSTATES` = 1;
public const val `MCTGCU_SELECTED`: `TRAILINGGRIDCELLUPPERSTATES` = 4;
public const val `MCTGCU_SELECTEDHOT`: `TRAILINGGRIDCELLUPPERSTATES` = 5;
public const val `MCTGC_HASSTATE`: `TRAILINGGRIDCELLSTATES` = 2;
public const val `MCTGC_HASSTATEHOT`: `TRAILINGGRIDCELLSTATES` = 3;
public const val `MCTGC_HOT`: `TRAILINGGRIDCELLSTATES` = 1;
public const val `MCTGC_SELECTED`: `TRAILINGGRIDCELLSTATES` = 6;
public const val `MCTGC_SELECTEDHOT`: `TRAILINGGRIDCELLSTATES` = 7;
public const val `MCTGC_TODAY`: `TRAILINGGRIDCELLSTATES` = 4;
public const val `MCTGC_TODAYSELECTED`: `TRAILINGGRIDCELLSTATES` = 5;
public const val `MC_BACKGROUND`: `MONTHCALPARTS` = 1;
public const val `MC_BORDERS`: `MONTHCALPARTS` = 2;
public const val `MC_BULLETDISABLED`: `POPUPCHECKSTATES` = 4;
public const val `MC_BULLETNORMAL`: `POPUPCHECKSTATES` = 3;
public const val `MC_CHECKMARKDISABLED`: `POPUPCHECKSTATES` = 2;
public const val `MC_CHECKMARKNORMAL`: `POPUPCHECKSTATES` = 1;
public const val `MC_COLHEADERSPLITTER`: `MONTHCALPARTS` = 4;
public const val `MC_GRIDBACKGROUND`: `MONTHCALPARTS` = 3;
public const val `MC_GRIDCELL`: `MONTHCALPARTS` = 6;
public const val `MC_GRIDCELLBACKGROUND`: `MONTHCALPARTS` = 5;
public const val `MC_GRIDCELLUPPER`: `MONTHCALPARTS` = 7;
public const val `MC_NAVNEXT`: `MONTHCALPARTS` = 10;
public const val `MC_NAVPREV`: `MONTHCALPARTS` = 11;
public const val `MC_TRAILINGGRIDCELL`: `MONTHCALPARTS` = 8;
public const val `MC_TRAILINGGRIDCELLUPPER`: `MONTHCALPARTS` = 9;
public const val `MDCL_DISABLED`: `MDICLOSEBUTTONSTATES` = 4;
public const val `MDCL_HOT`: `MDICLOSEBUTTONSTATES` = 2;
public const val `MDCL_NORMAL`: `MDICLOSEBUTTONSTATES` = 1;
public const val `MDCL_PUSHED`: `MDICLOSEBUTTONSTATES` = 3;
public typealias `MDICLOSEBUTTONSTATES` = Int;
public typealias `MDIMINBUTTONSTATES` = Int;
public typealias `MDIRESTOREBUTTONSTATES` = Int;
public const val `MDMI_DISABLED`: `MDIMINBUTTONSTATES` = 4;
public const val `MDMI_HOT`: `MDIMINBUTTONSTATES` = 2;
public const val `MDMI_NORMAL`: `MDIMINBUTTONSTATES` = 1;
public const val `MDMI_PUSHED`: `MDIMINBUTTONSTATES` = 3;
public const val `MDP_NEWAPPBUTTON`: `MENUBANDPARTS` = 1;
public const val `MDP_SEPERATOR`: `MENUBANDPARTS` = 2;
public const val `MDRE_DISABLED`: `MDIRESTOREBUTTONSTATES` = 4;
public const val `MDRE_HOT`: `MDIRESTOREBUTTONSTATES` = 2;
public const val `MDRE_NORMAL`: `MDIRESTOREBUTTONSTATES` = 1;
public const val `MDRE_PUSHED`: `MDIRESTOREBUTTONSTATES` = 3;
public const val `MDS_CHECKED`: `MENUBANDSTATES` = 5;
public const val `MDS_DISABLED`: `MENUBANDSTATES` = 4;
public const val `MDS_HOT`: `MENUBANDSTATES` = 2;
public const val `MDS_HOTCHECKED`: `MENUBANDSTATES` = 6;
public const val `MDS_NORMAL`: `MENUBANDSTATES` = 1;
public const val `MDS_PRESSED`: `MENUBANDSTATES` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEASUREITEMSTRUCT` (
    public var `CtlType`: `DRAWITEMSTRUCT_CTL_TYPE`,
    public var `CtlID`: UInt,
    public var `itemID`: UInt,
    public var `itemWidth`: UInt,
    public var `itemHeight`: UInt,
    public var `itemData`: ULong,
)
public typealias `MENUBANDPARTS` = Int;
public typealias `MENUBANDSTATES` = Int;
public typealias `MENUPARTS` = Int;
public const val `MENU_BARBACKGROUND`: `MENUPARTS` = 7;
public const val `MENU_BARITEM`: `MENUPARTS` = 8;
public const val `MENU_CHEVRON_TMSCHEMA`: `MENUPARTS` = 5;
public const val `MENU_MENUBARDROPDOWN_TMSCHEMA`: `MENUPARTS` = 4;
public const val `MENU_MENUBARITEM_TMSCHEMA`: `MENUPARTS` = 3;
public const val `MENU_MENUDROPDOWN_TMSCHEMA`: `MENUPARTS` = 2;
public const val `MENU_MENUITEM_TMSCHEMA`: `MENUPARTS` = 1;
public const val `MENU_POPUPBACKGROUND`: `MENUPARTS` = 9;
public const val `MENU_POPUPBORDERS`: `MENUPARTS` = 10;
public const val `MENU_POPUPCHECK`: `MENUPARTS` = 11;
public const val `MENU_POPUPCHECKBACKGROUND`: `MENUPARTS` = 12;
public const val `MENU_POPUPGUTTER`: `MENUPARTS` = 13;
public const val `MENU_POPUPITEM`: `MENUPARTS` = 14;
public const val `MENU_POPUPITEMKBFOCUS`: `MENUPARTS` = 26;
public const val `MENU_POPUPITEM_FOCUSABLE`: `MENUPARTS` = 27;
public const val `MENU_POPUPSEPARATOR`: `MENUPARTS` = 15;
public const val `MENU_POPUPSUBMENU`: `MENUPARTS` = 16;
public const val `MENU_POPUPSUBMENU_HCHOT`: `MENUPARTS` = 21;
public const val `MENU_SEPARATOR_TMSCHEMA`: `MENUPARTS` = 6;
public const val `MENU_SYSTEMCLOSE`: `MENUPARTS` = 17;
public const val `MENU_SYSTEMCLOSE_HCHOT`: `MENUPARTS` = 22;
public const val `MENU_SYSTEMMAXIMIZE`: `MENUPARTS` = 18;
public const val `MENU_SYSTEMMAXIMIZE_HCHOT`: `MENUPARTS` = 23;
public const val `MENU_SYSTEMMINIMIZE`: `MENUPARTS` = 19;
public const val `MENU_SYSTEMMINIMIZE_HCHOT`: `MENUPARTS` = 24;
public const val `MENU_SYSTEMRESTORE`: `MENUPARTS` = 20;
public const val `MENU_SYSTEMRESTORE_HCHOT`: `MENUPARTS` = 25;
public const val `MINBS_DISABLED`: `MINBUTTONSTATES` = 4;
public const val `MINBS_HOT`: `MINBUTTONSTATES` = 2;
public const val `MINBS_NORMAL`: `MINBUTTONSTATES` = 1;
public const val `MINBS_PUSHED`: `MINBUTTONSTATES` = 3;
public typealias `MINBUTTONSTATES` = Int;
public typealias `MINCAPTIONSTATES` = Int;
public const val `MNCS_ACTIVE`: `MINCAPTIONSTATES` = 1;
public const val `MNCS_DISABLED`: `MINCAPTIONSTATES` = 3;
public const val `MNCS_INACTIVE`: `MINCAPTIONSTATES` = 2;
public typealias `MONTHCALPARTS` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MONTHCAL_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysMonthCal32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MONTHCAL_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysMonthCal32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MONTHCAL_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysMonthCal32");
public typealias `MONTH_CALDENDAR_MESSAGES_VIEW` = UInt;
public typealias `MOREPROGRAMSARROWBACKSTATES` = Int;
public typealias `MOREPROGRAMSARROWSTATES` = Int;
public typealias `MOREPROGRAMSTABSTATES` = Int;
public typealias `MOVESTATES` = Int;
public const val `MPIF_DISABLED`: `POPUPITEMFOCUSABLESTATES` = 3;
public const val `MPIF_DISABLEDHOT`: `POPUPITEMFOCUSABLESTATES` = 4;
public const val `MPIF_HOT`: `POPUPITEMFOCUSABLESTATES` = 2;
public const val `MPIF_NORMAL`: `POPUPITEMFOCUSABLESTATES` = 1;
public const val `MPIKBFOCUS_NORMAL`: `POPUPITEMKBFOCUSSTATES` = 1;
public const val `MPI_DISABLED`: `POPUPITEMSTATES` = 3;
public const val `MPI_DISABLEDHOT`: `POPUPITEMSTATES` = 4;
public const val `MPI_HOT`: `POPUPITEMSTATES` = 2;
public const val `MPI_NORMAL`: `POPUPITEMSTATES` = 1;
public const val `MSGF_COMMCTRL_BEGINDRAG`: UInt = 16896u;
public const val `MSGF_COMMCTRL_DRAGSELECT`: UInt = 16898u;
public const val `MSGF_COMMCTRL_SIZEHEADER`: UInt = 16897u;
public const val `MSGF_COMMCTRL_TOOLBARCUST`: UInt = 16899u;
public const val `MSMHC_HOT`: `POPUPSUBMENUHCHOTSTATES` = 1;
public const val `MSM_DISABLED`: `POPUPSUBMENUSTATES` = 2;
public const val `MSM_NORMAL`: `POPUPSUBMENUSTATES` = 1;
public const val `MSYSCHC_HOT`: `SYSTEMCLOSEHCHOTSTATES` = 1;
public const val `MSYSC_DISABLED`: `SYSTEMCLOSESTATES` = 2;
public const val `MSYSC_NORMAL`: `SYSTEMCLOSESTATES` = 1;
public const val `MSYSMNHC_HOT`: `SYSTEMMINIMIZEHCHOTSTATES` = 1;
public const val `MSYSMN_DISABLED`: `SYSTEMMINIMIZESTATES` = 2;
public const val `MSYSMN_NORMAL`: `SYSTEMMINIMIZESTATES` = 1;
public const val `MSYSMXHC_HOT`: `SYSTEMMAXIMIZEHCHOTSTATES` = 1;
public const val `MSYSMX_DISABLED`: `SYSTEMMAXIMIZESTATES` = 2;
public const val `MSYSMX_NORMAL`: `SYSTEMMAXIMIZESTATES` = 1;
public const val `MSYSRHC_HOT`: `SYSTEMRESTOREHCHOTSTATES` = 1;
public const val `MSYSR_DISABLED`: `SYSTEMRESTORESTATES` = 2;
public const val `MSYSR_NORMAL`: `SYSTEMRESTORESTATES` = 1;
public const val `MULTIFILEOPENORD`: UInt = 1537u;
public const val `MXCS_ACTIVE`: `MAXCAPTIONSTATES` = 1;
public const val `MXCS_DISABLED`: `MAXCAPTIONSTATES` = 3;
public const val `MXCS_INACTIVE`: `MAXCAPTIONSTATES` = 2;
public typealias `NAVIGATIONPARTS` = Int;
public typealias `NAVNEXTSTATES` = Int;
public typealias `NAVPREVSTATES` = Int;
public const val `NAV_BACKBUTTON`: `NAVIGATIONPARTS` = 1;
public typealias `NAV_BACKBUTTONSTATES` = Int;
public const val `NAV_BB_DISABLED`: `NAV_BACKBUTTONSTATES` = 4;
public const val `NAV_BB_HOT`: `NAV_BACKBUTTONSTATES` = 2;
public const val `NAV_BB_NORMAL`: `NAV_BACKBUTTONSTATES` = 1;
public const val `NAV_BB_PRESSED`: `NAV_BACKBUTTONSTATES` = 3;
public const val `NAV_FB_DISABLED`: `NAV_FORWARDBUTTONSTATES` = 4;
public const val `NAV_FB_HOT`: `NAV_FORWARDBUTTONSTATES` = 2;
public const val `NAV_FB_NORMAL`: `NAV_FORWARDBUTTONSTATES` = 1;
public const val `NAV_FB_PRESSED`: `NAV_FORWARDBUTTONSTATES` = 3;
public const val `NAV_FORWARDBUTTON`: `NAVIGATIONPARTS` = 2;
public typealias `NAV_FORWARDBUTTONSTATES` = Int;
public const val `NAV_MB_DISABLED`: `NAV_MENUBUTTONSTATES` = 4;
public const val `NAV_MB_HOT`: `NAV_MENUBUTTONSTATES` = 2;
public const val `NAV_MB_NORMAL`: `NAV_MENUBUTTONSTATES` = 1;
public const val `NAV_MB_PRESSED`: `NAV_MENUBUTTONSTATES` = 3;
public const val `NAV_MENUBUTTON`: `NAVIGATIONPARTS` = 3;
public typealias `NAV_MENUBUTTONSTATES` = Int;
public const val `NEWFILEOPENORD`: UInt = 1547u;
public const val `NEWFILEOPENV2ORD`: UInt = 1552u;
public const val `NEWFILEOPENV3ORD`: UInt = 1553u;
public const val `NEWFORMATDLGWITHLINK`: UInt = 1591u;
public const val `NFS_ALL`: UInt = 16u;
public const val `NFS_BUTTON`: UInt = 8u;
public const val `NFS_EDIT`: UInt = 1u;
public const val `NFS_LISTCOMBO`: UInt = 4u;
public const val `NFS_STATIC`: UInt = 2u;
public const val `NFS_USEFONTASSOC`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMBCDROPDOWN` (
    public var `hdr`: `NMHDR`,
    public var `rcButton`: `super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMBCHOTITEM` (
    public var `hdr`: `NMHDR`,
    public var `dwFlags`: `NMTBHOTITEM_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMCBEDRAGBEGINA` (
    public var `hdr`: `NMHDR`,
    public var `iItemid`: Int,
    public var `szText`: ByteArray,
)
// UNSUPPORTED Rust 3307:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMCBEDRAGBEGINA {
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
public class `NMCBEDRAGBEGINW` (
    public var `hdr`: `NMHDR`,
    public var `iItemid`: Int,
    public var `szText`: UShortArray,
)
// UNSUPPORTED Rust 3319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMCBEDRAGBEGINW {
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
public class `NMCBEENDEDITA` (
    public var `hdr`: `NMHDR`,
    public var `fChanged`: `windows_sys`.`core`.`BOOL`,
    public var `iNewSelection`: Int,
    public var `szText`: ByteArray,
    public var `iWhy`: Int,
)
// UNSUPPORTED Rust 3333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMCBEENDEDITA {
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
public class `NMCBEENDEDITW` (
    public var `hdr`: `NMHDR`,
    public var `fChanged`: `windows_sys`.`core`.`BOOL`,
    public var `iNewSelection`: Int,
    public var `szText`: UShortArray,
    public var `iWhy`: Int,
)
// UNSUPPORTED Rust 3347:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMCBEENDEDITW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMCHAR` (
    public var `hdr`: `NMHDR`,
    public var `ch`: UInt,
    public var `dwItemPrev`: UInt,
    public var `dwItemNext`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMCOMBOBOXEXA` (
    public var `hdr`: `NMHDR`,
    public var `ceItem`: `COMBOBOXEXITEMA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMCOMBOBOXEXW` (
    public var `hdr`: `NMHDR`,
    public var `ceItem`: `COMBOBOXEXITEMW`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMCUSTOMDRAW` (
    public var `hdr`: `NMHDR`,
    public var `dwDrawStage`: `NMCUSTOMDRAW_DRAW_STAGE`,
    public var `hdc`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `rc`: `super`.`super`.`Foundation`.`RECT`,
    public var `dwItemSpec`: ULong,
    public var `uItemState`: `NMCUSTOMDRAW_DRAW_STATE_FLAGS`,
    public var `lItemlParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 3384:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for NMCUSTOMDRAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NMCUSTOMDRAW_DRAW_STAGE` = UInt;
public typealias `NMCUSTOMDRAW_DRAW_STATE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMCUSTOMSPLITRECTINFO` (
    public var `hdr`: `NMHDR`,
    public var `rcClient`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcButton`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcSplit`: `super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMCUSTOMTEXT` (
    public var `hdr`: `NMHDR`,
    public var `hDC`: `super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `lpString`: `windows_sys`.`core`.`PCWSTR`,
    public var `nCount`: Int,
    public var `lpRect`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?,
    public var `uFormat`: UInt,
    public var `fLink`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 3412:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for NMCUSTOMTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMDATETIMECHANGE` (
    public var `nmhdr`: `NMHDR`,
    public var `dwFlags`: `NMDATETIMECHANGE_FLAGS`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
public typealias `NMDATETIMECHANGE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMEFORMATA` (
    public var `nmhdr`: `NMHDR`,
    public var `pszFormat`: `windows_sys`.`core`.`PCSTR`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `pszDisplay`: `windows_sys`.`core`.`PCSTR`,
    public var `szDisplay`: ByteArray,
)
// UNSUPPORTED Rust 3435:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMEFORMATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMEFORMATQUERYA` (
    public var `nmhdr`: `NMHDR`,
    public var `pszFormat`: `windows_sys`.`core`.`PCSTR`,
    public var `szMax`: `super`.`super`.`Foundation`.`SIZE`,
)
// UNSUPPORTED Rust 3447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMEFORMATQUERYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMEFORMATQUERYW` (
    public var `nmhdr`: `NMHDR`,
    public var `pszFormat`: `windows_sys`.`core`.`PCWSTR`,
    public var `szMax`: `super`.`super`.`Foundation`.`SIZE`,
)
// UNSUPPORTED Rust 3459:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMEFORMATQUERYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMEFORMATW` (
    public var `nmhdr`: `NMHDR`,
    public var `pszFormat`: `windows_sys`.`core`.`PCWSTR`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `pszDisplay`: `windows_sys`.`core`.`PCWSTR`,
    public var `szDisplay`: UShortArray,
)
// UNSUPPORTED Rust 3473:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMEFORMATW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMESTRINGA` (
    public var `nmhdr`: `NMHDR`,
    public var `pszUserString`: `windows_sys`.`core`.`PCSTR`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 3486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMESTRINGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMESTRINGW` (
    public var `nmhdr`: `NMHDR`,
    public var `pszUserString`: `windows_sys`.`core`.`PCWSTR`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 3499:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMESTRINGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMEWMKEYDOWNA` (
    public var `nmhdr`: `NMHDR`,
    public var `nVirtKey`: Int,
    public var `pszFormat`: `windows_sys`.`core`.`PCSTR`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
// UNSUPPORTED Rust 3512:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMEWMKEYDOWNA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMDATETIMEWMKEYDOWNW` (
    public var `nmhdr`: `NMHDR`,
    public var `nVirtKey`: Int,
    public var `pszFormat`: `windows_sys`.`core`.`PCWSTR`,
    public var `st`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
// UNSUPPORTED Rust 3525:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDATETIMEWMKEYDOWNW {
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
public class `NMDAYSTATE` (
    public var `nmhdr`: `NMHDR`,
    public var `stStart`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `cDayState`: Int,
    public var `prgDayState`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 3538:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMDAYSTATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMHDDISPINFOA` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `mask`: `HDI_MASK`,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 3554:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMHDDISPINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMHDDISPINFOW` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `mask`: `HDI_MASK`,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 3570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMHDDISPINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMHDFILTERBTNCLICK` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `rc`: `super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMHDR` (
    public var `hwndFrom`: `super`.`super`.`Foundation`.`HWND`,
    public var `idFrom`: ULong,
    public var `code`: UInt,
)
// UNSUPPORTED Rust 3589:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMHDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMHEADERA` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `iButton`: `HEADER_CONTROL_NOTIFICATION_BUTTON`,
    public var `pitem`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HDITEMA`>?,
)
// UNSUPPORTED Rust 3603:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for NMHEADERA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMHEADERW` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `iButton`: `HEADER_CONTROL_NOTIFICATION_BUTTON`,
    public var `pitem`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HDITEMW`>?,
)
// UNSUPPORTED Rust 3618:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for NMHEADERW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMIPADDRESS` (
    public var `hdr`: `NMHDR`,
    public var `iField`: Int,
    public var `iValue`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMITEMACTIVATE` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
    public var `uNewState`: UInt,
    public var `uOldState`: UInt,
    public var `uChanged`: UInt,
    public var `ptAction`: `super`.`super`.`Foundation`.`POINT`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `uKeyFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMKEY` (
    public var `hdr`: `NMHDR`,
    public var `nVKey`: UInt,
    public var `uFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLINK` (
    public var `hdr`: `NMHDR`,
    public var `item`: `LITEM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLISTVIEW` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
    public var `uNewState`: UInt,
    public var `uOldState`: UInt,
    public var `uChanged`: `LIST_VIEW_ITEM_FLAGS`,
    public var `ptAction`: `super`.`super`.`Foundation`.`POINT`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVCACHEHINT` (
    public var `hdr`: `NMHDR`,
    public var `iFrom`: Int,
    public var `iTo`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVCUSTOMDRAW` (
    public var `nmcd`: `NMCUSTOMDRAW`,
    public var `clrText`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrTextBk`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iSubItem`: Int,
    public var `dwItemType`: `NMLVCUSTOMDRAW_ITEM_TYPE`,
    public var `clrFace`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iIconEffect`: Int,
    public var `iIconPhase`: Int,
    public var `iPartId`: Int,
    public var `iStateId`: Int,
    public var `rcText`: `super`.`super`.`Foundation`.`RECT`,
    public var `uAlign`: `LIST_VIEW_GROUP_ALIGN_FLAGS`,
)
public typealias `NMLVCUSTOMDRAW_ITEM_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVDISPINFOA` (
    public var `hdr`: `NMHDR`,
    public var `item`: `LVITEMA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVDISPINFOW` (
    public var `hdr`: `NMHDR`,
    public var `item`: `LVITEMW`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2084 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMLVEMPTYMARKUP` (
    public var `hdr`: `NMHDR`,
    public var `dwFlags`: `NMLVEMPTYMARKUP_FLAGS`,
    public var `szMarkup`: UShortArray,
)
// UNSUPPORTED Rust 3713:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMLVEMPTYMARKUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NMLVEMPTYMARKUP_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVFINDITEMA` (
    public var `hdr`: `NMHDR`,
    public var `iStart`: Int,
    public var `lvfi`: `LVFINDINFOA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVFINDITEMW` (
    public var `hdr`: `NMHDR`,
    public var `iStart`: Int,
    public var `lvfi`: `LVFINDINFOW`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMLVGETINFOTIPA` (
    public var `hdr`: `NMHDR`,
    public var `dwFlags`: `NMLVGETINFOTIP_FLAGS`,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 3744:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMLVGETINFOTIPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMLVGETINFOTIPW` (
    public var `hdr`: `NMHDR`,
    public var `dwFlags`: `NMLVGETINFOTIP_FLAGS`,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 3760:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMLVGETINFOTIPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NMLVGETINFOTIP_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVKEYDOWN` (
    public var `hdr`: `NMHDR`,
    public var `wVKey`: UShort,
    public var `flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVLINK` (
    public var `hdr`: `NMHDR`,
    public var `link`: `LITEM`,
    public var `iItem`: Int,
    public var `iSubItem`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVODSTATECHANGE` (
    public var `hdr`: `NMHDR`,
    public var `iFrom`: Int,
    public var `iTo`: Int,
    public var `uNewState`: `LIST_VIEW_ITEM_STATE_FLAGS`,
    public var `uOldState`: `LIST_VIEW_ITEM_STATE_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMLVSCROLL` (
    public var `hdr`: `NMHDR`,
    public var `dx`: Int,
    public var `dy`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMMOUSE` (
    public var `hdr`: `NMHDR`,
    public var `dwItemSpec`: ULong,
    public var `dwItemData`: ULong,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `dwHitInfo`: `super`.`super`.`Foundation`.`LPARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMOBJECTNOTIFY` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `piid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hResult`: `windows_sys`.`core`.`HRESULT`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 3816:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMOBJECTNOTIFY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMPGCALCSIZE` (
    public var `hdr`: `NMHDR`,
    public var `dwFlag`: `NMPGCALCSIZE_FLAGS`,
    public var `iWidth`: Int,
    public var `iHeight`: Int,
)
public typealias `NMPGCALCSIZE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMPGHOTITEM` (
    public var `hdr`: `NMHDR`,
    public var `idOld`: Int,
    public var `idNew`: Int,
    public var `dwFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMPGSCROLL` (
    public var `hdr`: `NMHDR`,
    public var `fwKeys`: `NMPGSCROLL_KEYS`,
    public var `rcParent`: `super`.`super`.`Foundation`.`RECT`,
    public var `iDir`: `NMPGSCROLL_DIR`,
    public var `iXpos`: Int,
    public var `iYpos`: Int,
    public var `iScroll`: Int,
)
public typealias `NMPGSCROLL_DIR` = Int;
public typealias `NMPGSCROLL_KEYS` = UShort;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMRBAUTOSIZE` (
    public var `hdr`: `NMHDR`,
    public var `fChanged`: `windows_sys`.`core`.`BOOL`,
    public var `rcTarget`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcActual`: `super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMREBAR` (
    public var `hdr`: `NMHDR`,
    public var `dwMask`: `NMREBAR_MASK_FLAGS`,
    public var `uBand`: UInt,
    public var `fStyle`: UInt,
    public var `wID`: UInt,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMREBARAUTOBREAK` (
    public var `hdr`: `NMHDR`,
    public var `uBand`: UInt,
    public var `wID`: UInt,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `uMsg`: UInt,
    public var `fStyleCurrent`: UInt,
    public var `fAutoBreak`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMREBARCHEVRON` (
    public var `hdr`: `NMHDR`,
    public var `uBand`: UInt,
    public var `wID`: UInt,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `rc`: `super`.`super`.`Foundation`.`RECT`,
    public var `lParamNM`: `super`.`super`.`Foundation`.`LPARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMREBARCHILDSIZE` (
    public var `hdr`: `NMHDR`,
    public var `uBand`: UInt,
    public var `wID`: UInt,
    public var `rcChild`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcBand`: `super`.`super`.`Foundation`.`RECT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMREBARSPLITTER` (
    public var `hdr`: `NMHDR`,
    public var `rcSizing`: `super`.`super`.`Foundation`.`RECT`,
)
public typealias `NMREBAR_MASK_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMSEARCHWEB` (
    public var `hdr`: `NMHDR`,
    public var `entrypoint`: `EC_SEARCHWEB_ENTRYPOINT`,
    public var `hasQueryText`: `windows_sys`.`core`.`BOOL`,
    public var `invokeSucceeded`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMSELCHANGE` (
    public var `nmhdr`: `NMHDR`,
    public var `stSelStart`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
    public var `stSelEnd`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTBCUSTOMDRAW` (
    public var `nmcd`: `NMCUSTOMDRAW`,
    public var `hbrMonoDither`: `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`,
    public var `hbrLines`: `super`.`super`.`Graphics`.`Gdi`.`HBRUSH`,
    public var `hpenLines`: `super`.`super`.`Graphics`.`Gdi`.`HPEN`,
    public var `clrText`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrMark`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrTextHighlight`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrBtnFace`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrBtnHighlight`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrHighlightHotTrack`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `rcText`: `super`.`super`.`Foundation`.`RECT`,
    public var `nStringBkMode`: Int,
    public var `nHLStringBkMode`: Int,
    public var `iListGap`: Int,
)
// UNSUPPORTED Rust 3940:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for NMTBCUSTOMDRAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTBDISPINFOA` (
    public var `hdr`: `NMHDR`,
    public var `dwMask`: `NMTBDISPINFOW_MASK`,
    public var `idCommand`: Int,
    public var `lParam`: ULong,
    public var `iImage`: Int,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchText`: Int,
)
// UNSUPPORTED Rust 3957:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTBDISPINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTBDISPINFOW` (
    public var `hdr`: `NMHDR`,
    public var `dwMask`: `NMTBDISPINFOW_MASK`,
    public var `idCommand`: Int,
    public var `lParam`: ULong,
    public var `iImage`: Int,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchText`: Int,
)
// UNSUPPORTED Rust 3973:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTBDISPINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NMTBDISPINFOW_MASK` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTBGETINFOTIPA` (
    public var `hdr`: `NMHDR`,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iItem`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 3988:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTBGETINFOTIPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTBGETINFOTIPW` (
    public var `hdr`: `NMHDR`,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iItem`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 4002:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTBGETINFOTIPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTBHOTITEM` (
    public var `hdr`: `NMHDR`,
    public var `idOld`: Int,
    public var `idNew`: Int,
    public var `dwFlags`: `NMTBHOTITEM_FLAGS`,
)
public typealias `NMTBHOTITEM_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTBRESTORE` (
    public var `hdr`: `NMHDR`,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pCurrent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cbData`: UInt,
    public var `iItem`: Int,
    public var `cButtons`: Int,
    public var `cbBytesPerRecord`: Int,
    public var `tbButton`: `TBBUTTON`,
)
// UNSUPPORTED Rust 4028:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTBRESTORE {
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
public class `NMTBSAVE` (
    public var `hdr`: `NMHDR`,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pCurrent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cbData`: UInt,
    public var `iItem`: Int,
    public var `cButtons`: Int,
    public var `tbButton`: `TBBUTTON`,
)
// UNSUPPORTED Rust 4044:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTBSAVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTCKEYDOWN` (
    public var `hdr`: `NMHDR`,
    public var `wVKey`: UShort,
    public var `flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTOOLBARA` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `tbButton`: `TBBUTTON`,
    public var `cchText`: Int,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `rcButton`: `super`.`super`.`Foundation`.`RECT`,
)
// UNSUPPORTED Rust 4066:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTOOLBARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTOOLBARW` (
    public var `hdr`: `NMHDR`,
    public var `iItem`: Int,
    public var `tbButton`: `TBBUTTON`,
    public var `cchText`: Int,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `rcButton`: `super`.`super`.`Foundation`.`RECT`,
)
// UNSUPPORTED Rust 4081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTOOLBARW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTOOLTIPSCREATED` (
    public var `hdr`: `NMHDR`,
    public var `hwndToolTips`: `super`.`super`.`Foundation`.`HWND`,
)
// UNSUPPORTED Rust 4092:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTOOLTIPSCREATED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTRBTHUMBPOSCHANGING` (
    public var `hdr`: `NMHDR`,
    public var `dwPos`: UInt,
    public var `nReason`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTREEVIEWA` (
    public var `hdr`: `NMHDR`,
    public var `action`: `NM_TREEVIEW_ACTION`,
    public var `itemOld`: `TVITEMA`,
    public var `itemNew`: `TVITEMA`,
    public var `ptDrag`: `super`.`super`.`Foundation`.`POINT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTREEVIEWW` (
    public var `hdr`: `NMHDR`,
    public var `action`: `NM_TREEVIEW_ACTION`,
    public var `itemOld`: `TVITEMW`,
    public var `itemNew`: `TVITEMW`,
    public var `ptDrag`: `super`.`super`.`Foundation`.`POINT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTTCUSTOMDRAW` (
    public var `nmcd`: `NMCUSTOMDRAW`,
    public var `uDrawFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTTDISPINFOA` (
    public var `hdr`: `NMHDR`,
    public var `lpszText`: `windows_sys`.`core`.`PSTR`,
    public var `szText`: ByteArray,
    public var `hinst`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `uFlags`: `TOOLTIP_FLAGS`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 4139:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTTDISPINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTTDISPINFOW` (
    public var `hdr`: `NMHDR`,
    public var `lpszText`: `windows_sys`.`core`.`PWSTR`,
    public var `szText`: UShortArray,
    public var `hinst`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `uFlags`: `TOOLTIP_FLAGS`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 4154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTTDISPINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTVASYNCDRAW` (
    public var `hdr`: `NMHDR`,
    public var `pimldp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGELISTDRAWPARAMS`>?,
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `hItem`: `HTREEITEM`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `dwRetFlags`: UInt,
    public var `iRetImageIndex`: Int,
)
// UNSUPPORTED Rust 4171:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for NMTVASYNCDRAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVCUSTOMDRAW` (
    public var `nmcd`: `NMCUSTOMDRAW`,
    public var `clrText`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrTextBk`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `iLevel`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVDISPINFOA` (
    public var `hdr`: `NMHDR`,
    public var `item`: `TVITEMA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVDISPINFOEXA` (
    public var `hdr`: `NMHDR`,
    public var `item`: `TVITEMEXA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVDISPINFOEXW` (
    public var `hdr`: `NMHDR`,
    public var `item`: `TVITEMEXW`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVDISPINFOW` (
    public var `hdr`: `NMHDR`,
    public var `item`: `TVITEMW`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTVGETINFOTIPA` (
    public var `hdr`: `NMHDR`,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `hItem`: `HTREEITEM`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 4219:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTVGETINFOTIPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NMTVGETINFOTIPW` (
    public var `hdr`: `NMHDR`,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `hItem`: `HTREEITEM`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 4233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NMTVGETINFOTIPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVITEMCHANGE` (
    public var `hdr`: `NMHDR`,
    public var `uChanged`: UInt,
    public var `hItem`: `HTREEITEM`,
    public var `uStateNew`: UInt,
    public var `uStateOld`: UInt,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVKEYDOWN` (
    public var `hdr`: `NMHDR`,
    public var `wVKey`: UShort,
    public var `flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMTVSTATEIMAGECHANGING` (
    public var `hdr`: `NMHDR`,
    public var `hti`: `HTREEITEM`,
    public var `iOldStateImageIndex`: Int,
    public var `iNewStateImageIndex`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMUPDOWN` (
    public var `hdr`: `NMHDR`,
    public var `iPos`: Int,
    public var `iDelta`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NMVIEWCHANGE` (
    public var `nmhdr`: `NMHDR`,
    public var `dwOldView`: `MONTH_CALDENDAR_MESSAGES_VIEW`,
    public var `dwNewView`: `MONTH_CALDENDAR_MESSAGES_VIEW`,
)
public const val `NM_CHAR`: UInt = 4294967278u;
public const val `NM_CLICK`: UInt = 4294967294u;
public const val `NM_CUSTOMDRAW`: UInt = 4294967284u;
public const val `NM_CUSTOMTEXT`: UInt = 4294967272u;
public const val `NM_DBLCLK`: UInt = 4294967293u;
public const val `NM_FIRST`: UInt = 0u;
public const val `NM_FONTCHANGED`: UInt = 4294967273u;
public const val `NM_GETCUSTOMSPLITRECT`: UInt = 4294966049u;
public const val `NM_HOVER`: UInt = 4294967283u;
public const val `NM_KEYDOWN`: UInt = 4294967281u;
public const val `NM_KILLFOCUS`: UInt = 4294967288u;
public const val `NM_LAST`: UInt = 4294967197u;
public const val `NM_LDOWN`: UInt = 4294967276u;
public const val `NM_NCHITTEST`: UInt = 4294967282u;
public const val `NM_OUTOFMEMORY`: UInt = 4294967295u;
public const val `NM_RCLICK`: UInt = 4294967291u;
public const val `NM_RDBLCLK`: UInt = 4294967290u;
public const val `NM_RDOWN`: UInt = 4294967275u;
public const val `NM_RELEASEDCAPTURE`: UInt = 4294967280u;
public const val `NM_RETURN`: UInt = 4294967292u;
public const val `NM_SETCURSOR`: UInt = 4294967279u;
public const val `NM_SETFOCUS`: UInt = 4294967289u;
public const val `NM_THEMECHANGED`: UInt = 4294967274u;
public const val `NM_TOOLTIPSCREATED`: UInt = 4294967277u;
public typealias `NM_TREEVIEW_ACTION` = UInt;
public const val `NM_TVSTATEIMAGECHANGING`: UInt = 4294967272u;
public typealias `NONESTATES` = Int;
public typealias `NORMALGROUPCOLLAPSESTATES` = Int;
public typealias `NORMALGROUPEXPANDSTATES` = Int;
public const val `ODA_DRAWENTIRE`: `ODA_FLAGS` = 1u;
public typealias `ODA_FLAGS` = UInt;
public const val `ODA_FOCUS`: `ODA_FLAGS` = 4u;
public const val `ODA_SELECT`: `ODA_FLAGS` = 2u;
public const val `ODS_CHECKED`: `ODS_FLAGS` = 8u;
public const val `ODS_COMBOBOXEDIT`: `ODS_FLAGS` = 4096u;
public const val `ODS_DEFAULT`: `ODS_FLAGS` = 32u;
public const val `ODS_DISABLED`: `ODS_FLAGS` = 4u;
public typealias `ODS_FLAGS` = UInt;
public const val `ODS_FOCUS`: `ODS_FLAGS` = 16u;
public const val `ODS_GRAYED`: `ODS_FLAGS` = 2u;
public const val `ODS_HOTLIGHT`: `ODS_FLAGS` = 64u;
public const val `ODS_INACTIVE`: `ODS_FLAGS` = 128u;
public const val `ODS_NOACCEL`: `ODS_FLAGS` = 256u;
public const val `ODS_NOFOCUSRECT`: `ODS_FLAGS` = 512u;
public const val `ODS_SELECTED`: `ODS_FLAGS` = 1u;
public const val `ODT_BUTTON`: `DRAWITEMSTRUCT_CTL_TYPE` = 4u;
public const val `ODT_COMBOBOX`: `DRAWITEMSTRUCT_CTL_TYPE` = 3u;
public const val `ODT_HEADER`: UInt = 100u;
public const val `ODT_LISTBOX`: `DRAWITEMSTRUCT_CTL_TYPE` = 2u;
public const val `ODT_LISTVIEW`: `DRAWITEMSTRUCT_CTL_TYPE` = 102u;
public const val `ODT_MENU`: `DRAWITEMSTRUCT_CTL_TYPE` = 1u;
public const val `ODT_STATIC`: `DRAWITEMSTRUCT_CTL_TYPE` = 5u;
public const val `ODT_TAB`: `DRAWITEMSTRUCT_CTL_TYPE` = 101u;
public typealias `OFFSETTYPE` = Int;
public typealias `OPENBOXSTATES` = Int;
public typealias `OPEN_THEME_DATA_FLAGS` = UInt;
public const val `OTD_FORCE_RECT_SIZING`: `OPEN_THEME_DATA_FLAGS` = 1u;
public const val `OTD_NONCLIENT`: `OPEN_THEME_DATA_FLAGS` = 2u;
public const val `OT_ABOVELASTBUTTON`: `OFFSETTYPE` = 12;
public const val `OT_BELOWLASTBUTTON`: `OFFSETTYPE` = 13;
public const val `OT_BOTTOMLEFT`: `OFFSETTYPE` = 3;
public const val `OT_BOTTOMMIDDLE`: `OFFSETTYPE` = 5;
public const val `OT_BOTTOMRIGHT`: `OFFSETTYPE` = 4;
public const val `OT_LEFTOFCAPTION`: `OFFSETTYPE` = 8;
public const val `OT_LEFTOFLASTBUTTON`: `OFFSETTYPE` = 10;
public const val `OT_MIDDLELEFT`: `OFFSETTYPE` = 6;
public const val `OT_MIDDLERIGHT`: `OFFSETTYPE` = 7;
public const val `OT_RIGHTOFCAPTION`: `OFFSETTYPE` = 9;
public const val `OT_RIGHTOFLASTBUTTON`: `OFFSETTYPE` = 11;
public const val `OT_TOPLEFT`: `OFFSETTYPE` = 0;
public const val `OT_TOPMIDDLE`: `OFFSETTYPE` = 2;
public const val `OT_TOPRIGHT`: `OFFSETTYPE` = 1;
public typealias `PAGEPARTS` = Int;
public const val `PAGESETUPDLGORD`: UInt = 1546u;
public const val `PAGESETUPDLGORDMOTIF`: UInt = 1550u;
public const val `PBBS_NORMAL`: `TRANSPARENTBARSTATES` = 1;
public const val `PBBS_PARTIAL`: `TRANSPARENTBARSTATES` = 2;
public const val `PBBVS_NORMAL`: `TRANSPARENTBARVERTSTATES` = 1;
public const val `PBBVS_PARTIAL`: `TRANSPARENTBARVERTSTATES` = 2;
public const val `PBDDS_DISABLED`: `PUSHBUTTONDROPDOWNSTATES` = 2;
public const val `PBDDS_NORMAL`: `PUSHBUTTONDROPDOWNSTATES` = 1;
public const val `PBFS_ERROR`: `FILLSTATES` = 2;
public const val `PBFS_NORMAL`: `FILLSTATES` = 1;
public const val `PBFS_PARTIAL`: `FILLSTATES` = 4;
public const val `PBFS_PAUSED`: `FILLSTATES` = 3;
public const val `PBFVS_ERROR`: `FILLVERTSTATES` = 2;
public const val `PBFVS_NORMAL`: `FILLVERTSTATES` = 1;
public const val `PBFVS_PARTIAL`: `FILLVERTSTATES` = 4;
public const val `PBFVS_PAUSED`: `FILLVERTSTATES` = 3;
public const val `PBM_DELTAPOS`: UInt = 1027u;
public const val `PBM_GETBARCOLOR`: UInt = 1039u;
public const val `PBM_GETBKCOLOR`: UInt = 1038u;
public const val `PBM_GETPOS`: UInt = 1032u;
public const val `PBM_GETRANGE`: UInt = 1031u;
public const val `PBM_GETSTATE`: UInt = 1041u;
public const val `PBM_GETSTEP`: UInt = 1037u;
public const val `PBM_SETBARCOLOR`: UInt = 1033u;
public const val `PBM_SETBKCOLOR`: UInt = 8193u;
public const val `PBM_SETMARQUEE`: UInt = 1034u;
public const val `PBM_SETPOS`: UInt = 1026u;
public const val `PBM_SETRANGE`: UInt = 1025u;
public const val `PBM_SETRANGE32`: UInt = 1030u;
public const val `PBM_SETSTATE`: UInt = 1040u;
public const val `PBM_SETSTEP`: UInt = 1028u;
public const val `PBM_STEPIT`: UInt = 1029u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PBRANGE` (
    public var `iLow`: Int,
    public var `iHigh`: Int,
)
public const val `PBST_ERROR`: UInt = 2u;
public const val `PBST_NORMAL`: UInt = 1u;
public const val `PBST_PAUSED`: UInt = 3u;
public const val `PBS_DEFAULTED`: `PUSHBUTTONSTATES` = 5;
public const val `PBS_DEFAULTED_ANIMATING`: `PUSHBUTTONSTATES` = 6;
public const val `PBS_DISABLED`: `PUSHBUTTONSTATES` = 4;
public const val `PBS_HOT`: `PUSHBUTTONSTATES` = 2;
public const val `PBS_MARQUEE`: UInt = 8u;
public const val `PBS_NORMAL`: `PUSHBUTTONSTATES` = 1;
public const val `PBS_PRESSED`: `PUSHBUTTONSTATES` = 3;
public const val `PBS_SMOOTH`: UInt = 1u;
public const val `PBS_SMOOTHREVERSE`: UInt = 16u;
public const val `PBS_VERTICAL`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDACOMPARE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDACOMPARECONST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDAENUMCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDAENUMCALLBACKCONST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDPAMERGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DPAMM_MESSAGE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`Foundation`.`LPARAM`) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDPAMERGECONST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DPAMM_MESSAGE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `super`.`super`.`Foundation`.`LPARAM`) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `PFNDPASTREAM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`DPASTREAMINFO`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNLVCOMPARE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`LPARAM`, `super`.`super`.`Foundation`.`LPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNLVGROUPCOMPARE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, Int, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNPROPSHEETCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNTVCOMPARE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`LPARAM`, `super`.`super`.`Foundation`.`LPARAM`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFTASKDIALOGCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`Foundation`.`LPARAM`, Long) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `PGB_BOTTOMORRIGHT`: UInt = 1u;
public const val `PGB_TOPORLEFT`: UInt = 0u;
public const val `PGF_CALCHEIGHT`: `NMPGCALCSIZE_FLAGS` = 2u;
public const val `PGF_CALCWIDTH`: `NMPGCALCSIZE_FLAGS` = 1u;
public const val `PGF_DEPRESSED`: UInt = 4u;
public const val `PGF_GRAYED`: UInt = 2u;
public const val `PGF_HOT`: UInt = 8u;
public const val `PGF_INVISIBLE`: UInt = 0u;
public const val `PGF_NORMAL`: UInt = 1u;
public const val `PGF_SCROLLDOWN`: `NMPGSCROLL_DIR` = 2;
public const val `PGF_SCROLLLEFT`: `NMPGSCROLL_DIR` = 4;
public const val `PGF_SCROLLRIGHT`: `NMPGSCROLL_DIR` = 8;
public const val `PGF_SCROLLUP`: `NMPGSCROLL_DIR` = 1;
public const val `PGK_CONTROL`: `NMPGSCROLL_KEYS` = 2u;
public const val `PGK_MENU`: `NMPGSCROLL_KEYS` = 4u;
public const val `PGK_NONE`: `NMPGSCROLL_KEYS` = 0u;
public const val `PGK_SHIFT`: `NMPGSCROLL_KEYS` = 1u;
public const val `PGM_FIRST`: UInt = 5120u;
public const val `PGM_FORWARDMOUSE`: UInt = 5123u;
public const val `PGM_GETBKCOLOR`: UInt = 5125u;
public const val `PGM_GETBORDER`: UInt = 5127u;
public const val `PGM_GETBUTTONSIZE`: UInt = 5131u;
public const val `PGM_GETBUTTONSTATE`: UInt = 5132u;
public const val `PGM_GETDROPTARGET`: UInt = 8196u;
public const val `PGM_GETPOS`: UInt = 5129u;
public const val `PGM_RECALCSIZE`: UInt = 5122u;
public const val `PGM_SETBKCOLOR`: UInt = 5124u;
public const val `PGM_SETBORDER`: UInt = 5126u;
public const val `PGM_SETBUTTONSIZE`: UInt = 5130u;
public const val `PGM_SETCHILD`: UInt = 5121u;
public const val `PGM_SETPOS`: UInt = 5128u;
public const val `PGM_SETSCROLLINFO`: UInt = 5133u;
public const val `PGN_CALCSIZE`: UInt = 4294966394u;
public const val `PGN_FIRST`: UInt = 4294966396u;
public const val `PGN_HOTITEMCHANGE`: UInt = 4294966393u;
public const val `PGN_LAST`: UInt = 4294966346u;
public const val `PGN_SCROLL`: UInt = 4294966395u;
public const val `PGRP_DOWN`: `PAGEPARTS` = 2;
public const val `PGRP_DOWNHORZ`: `PAGEPARTS` = 4;
public const val `PGRP_UP`: `PAGEPARTS` = 1;
public const val `PGRP_UPHORZ`: `PAGEPARTS` = 3;
public const val `PGS_AUTOSCROLL`: UInt = 2u;
public const val `PGS_DRAGNDROP`: UInt = 4u;
public const val `PGS_HORZ`: UInt = 1u;
public const val `PGS_VERT`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTER_DEVICE_CURSOR_INFO` (
    public var `cursorId`: UInt,
    public var `cursor`: `POINTER_DEVICE_CURSOR_TYPE`,
)
public typealias `POINTER_DEVICE_CURSOR_TYPE` = Int;
public const val `POINTER_DEVICE_CURSOR_TYPE_ERASER`: `POINTER_DEVICE_CURSOR_TYPE` = 2;
public const val `POINTER_DEVICE_CURSOR_TYPE_MAX`: `POINTER_DEVICE_CURSOR_TYPE` = -1;
public const val `POINTER_DEVICE_CURSOR_TYPE_TIP`: `POINTER_DEVICE_CURSOR_TYPE` = 1;
public const val `POINTER_DEVICE_CURSOR_TYPE_UNKNOWN`: `POINTER_DEVICE_CURSOR_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 520 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POINTER_DEVICE_INFO` (
    public var `displayOrientation`: UInt,
    public var `device`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pointerDeviceType`: `POINTER_DEVICE_TYPE`,
    public var `monitor`: `super`.`super`.`Graphics`.`Gdi`.`HMONITOR`,
    public var `startingCursorId`: UInt,
    public var `maxActiveContacts`: UShort,
    public var `productString`: UShortArray,
)
// UNSUPPORTED Rust 4482:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for POINTER_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTER_DEVICE_PROPERTY` (
    public var `logicalMin`: Int,
    public var `logicalMax`: Int,
    public var `physicalMin`: Int,
    public var `physicalMax`: Int,
    public var `unit`: UInt,
    public var `unitExponent`: UInt,
    public var `usagePageId`: UShort,
    public var `usageId`: UShort,
)
public typealias `POINTER_DEVICE_TYPE` = Int;
public const val `POINTER_DEVICE_TYPE_EXTERNAL_PEN`: `POINTER_DEVICE_TYPE` = 2;
public const val `POINTER_DEVICE_TYPE_INTEGRATED_PEN`: `POINTER_DEVICE_TYPE` = 1;
public const val `POINTER_DEVICE_TYPE_MAX`: `POINTER_DEVICE_TYPE` = -1;
public const val `POINTER_DEVICE_TYPE_TOUCH`: `POINTER_DEVICE_TYPE` = 3;
public const val `POINTER_DEVICE_TYPE_TOUCH_PAD`: `POINTER_DEVICE_TYPE` = 4;
public const val `POINTER_FEEDBACK_DEFAULT`: `POINTER_FEEDBACK_MODE` = 1;
public const val `POINTER_FEEDBACK_INDIRECT`: `POINTER_FEEDBACK_MODE` = 2;
public typealias `POINTER_FEEDBACK_MODE` = Int;
public const val `POINTER_FEEDBACK_NONE`: `POINTER_FEEDBACK_MODE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POINTER_TYPE_INFO` (
    public var `type`: `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`,
    public var `Anonymous`: `POINTER_TYPE_INFO_0`,
)
// UNSUPPORTED Rust 4517:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for POINTER_TYPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4523:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union POINTER_TYPE_INFO_0 {
//     pub touchInfo: super::Input::Pointer::POINTER_TOUCH_INFO,
//     pub penInfo: super::Input::Pointer::POINTER_PEN_INFO,
// }

// UNSUPPORTED Rust 4530:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for POINTER_TYPE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `POPUPCHECKBACKGROUNDSTATES` = Int;
public typealias `POPUPCHECKSTATES` = Int;
public typealias `POPUPITEMFOCUSABLESTATES` = Int;
public typealias `POPUPITEMKBFOCUSSTATES` = Int;
public typealias `POPUPITEMSTATES` = Int;
public typealias `POPUPSUBMENUHCHOTSTATES` = Int;
public typealias `POPUPSUBMENUSTATES` = Int;
public const val `PO_CLASS`: `PROPERTYORIGIN` = 2;
public const val `PO_GLOBAL`: `PROPERTYORIGIN` = 3;
public const val `PO_NOTFOUND`: `PROPERTYORIGIN` = 4;
public const val `PO_PART`: `PROPERTYORIGIN` = 1;
public const val `PO_STATE`: `PROPERTYORIGIN` = 0;
public const val `PP_BAR`: `PROGRESSPARTS` = 1;
public const val `PP_BARVERT`: `PROGRESSPARTS` = 2;
public const val `PP_CHUNK`: `PROGRESSPARTS` = 3;
public const val `PP_CHUNKVERT`: `PROGRESSPARTS` = 4;
public const val `PP_FILL`: `PROGRESSPARTS` = 5;
public const val `PP_FILLVERT`: `PROGRESSPARTS` = 6;
public const val `PP_MOVEOVERLAY`: `PROGRESSPARTS` = 8;
public const val `PP_MOVEOVERLAYVERT`: `PROGRESSPARTS` = 10;
public const val `PP_PULSEOVERLAY`: `PROGRESSPARTS` = 7;
public const val `PP_PULSEOVERLAYVERT`: `PROGRESSPARTS` = 9;
public const val `PP_TRANSPARENTBAR`: `PROGRESSPARTS` = 11;
public const val `PP_TRANSPARENTBARVERT`: `PROGRESSPARTS` = 12;
public const val `PRINTDLGEXORD`: UInt = 1549u;
public const val `PRINTDLGORD`: UInt = 1538u;
public const val `PRNSETUPDLGORD`: UInt = 1539u;
public typealias `PROGRESSPARTS` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PROGRESS_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_progress32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PROGRESS_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("msctls_progress32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PROGRESS_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_progress32");
public typealias `PROPERTYORIGIN` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETHEADERA_V1` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETHEADERA_V1_0`,
    public var `pszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `nPages`: UInt,
    public var `Anonymous2`: `PROPSHEETHEADERA_V1_1`,
    public var `Anonymous3`: `PROPSHEETHEADERA_V1_2`,
    public var `pfnCallback`: `PFNPROPSHEETCALLBACK`,
)
// UNSUPPORTED Rust 4583:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4589:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V1_0 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4596:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4602:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V1_1 {
//     pub nStartPage: u32,
//     pub pStartPage: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4609:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4615:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V1_2 {
//     pub ppsp: *mut PROPSHEETPAGEA,
//     pub phpage: *mut HPROPSHEETPAGE,
// }

// UNSUPPORTED Rust 4622:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V1_2 {
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
public class `PROPSHEETHEADERA_V2` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETHEADERA_V2_0`,
    public var `pszCaption`: `windows_sys`.`core`.`PCSTR`,
    public var `nPages`: UInt,
    public var `Anonymous2`: `PROPSHEETHEADERA_V2_1`,
    public var `Anonymous3`: `PROPSHEETHEADERA_V2_2`,
    public var `pfnCallback`: `PFNPROPSHEETCALLBACK`,
    public var `Anonymous4`: `PROPSHEETHEADERA_V2_3`,
    public var `hplWatermark`: `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`,
    public var `Anonymous5`: `PROPSHEETHEADERA_V2_4`,
)
// UNSUPPORTED Rust 4646:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4652:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V2_0 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4659:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4665:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V2_1 {
//     pub nStartPage: u32,
//     pub pStartPage: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4672:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4678:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V2_2 {
//     pub ppsp: *mut PROPSHEETPAGEA,
//     pub phpage: *mut HPROPSHEETPAGE,
// }

// UNSUPPORTED Rust 4685:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4691:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V2_3 {
//     pub hbmWatermark: super::super::Graphics::Gdi::HBITMAP,
//     pub pszbmWatermark: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4698:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V2_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4704:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERA_V2_4 {
//     pub hbmHeader: super::super::Graphics::Gdi::HBITMAP,
//     pub pszbmHeader: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4711:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERA_V2_4 {
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
public class `PROPSHEETHEADERW_V1` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETHEADERW_V1_0`,
    public var `pszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `nPages`: UInt,
    public var `Anonymous2`: `PROPSHEETHEADERW_V1_1`,
    public var `Anonymous3`: `PROPSHEETHEADERW_V1_2`,
    public var `pfnCallback`: `PFNPROPSHEETCALLBACK`,
)
// UNSUPPORTED Rust 4732:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4738:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V1_0 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4751:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V1_1 {
//     pub nStartPage: u32,
//     pub pStartPage: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4758:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4764:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V1_2 {
//     pub ppsp: *mut PROPSHEETPAGEW,
//     pub phpage: *mut HPROPSHEETPAGE,
// }

// UNSUPPORTED Rust 4771:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V1_2 {
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
public class `PROPSHEETHEADERW_V2` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETHEADERW_V2_0`,
    public var `pszCaption`: `windows_sys`.`core`.`PCWSTR`,
    public var `nPages`: UInt,
    public var `Anonymous2`: `PROPSHEETHEADERW_V2_1`,
    public var `Anonymous3`: `PROPSHEETHEADERW_V2_2`,
    public var `pfnCallback`: `PFNPROPSHEETCALLBACK`,
    public var `Anonymous4`: `PROPSHEETHEADERW_V2_3`,
    public var `hplWatermark`: `super`.`super`.`Graphics`.`Gdi`.`HPALETTE`,
    public var `Anonymous5`: `PROPSHEETHEADERW_V2_4`,
)
// UNSUPPORTED Rust 4795:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4801:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V2_0 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4808:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4814:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V2_1 {
//     pub nStartPage: u32,
//     pub pStartPage: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4821:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4827:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V2_2 {
//     pub ppsp: *mut PROPSHEETPAGEW,
//     pub phpage: *mut HPROPSHEETPAGE,
// }

// UNSUPPORTED Rust 4834:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4840:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V2_3 {
//     pub hbmWatermark: super::super::Graphics::Gdi::HBITMAP,
//     pub pszbmWatermark: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4847:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V2_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4853:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETHEADERW_V2_4 {
//     pub hbmHeader: super::super::Graphics::Gdi::HBITMAP,
//     pub pszbmHeader: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 4860:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETHEADERW_V2_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEA` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEA_0`,
    public var `Anonymous2`: `PROPSHEETPAGEA_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKA`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pszHeaderTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pszHeaderSubTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `hActCtx`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Anonymous3`: `PROPSHEETPAGEA_2`,
)
// UNSUPPORTED Rust 4885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4891:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_0 {
//     pub pszTemplate: windows_sys::core::PCSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 4898:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4904:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4911:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4917:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_2 {
//     pub hbmHeader: super::super::Graphics::Gdi::HBITMAP,
//     pub pszbmHeader: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4924:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEA_V1` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEA_V1_0`,
    public var `Anonymous2`: `PROPSHEETPAGEA_V1_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKA`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 4945:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4951:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_V1_0 {
//     pub pszTemplate: windows_sys::core::PCSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 4958:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4964:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_V1_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 4971:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEA_V2` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEA_V2_0`,
    public var `Anonymous2`: `PROPSHEETPAGEA_V2_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKA`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pszHeaderTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pszHeaderSubTitle`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 4994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5000:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_V2_0 {
//     pub pszTemplate: windows_sys::core::PCSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 5007:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5013:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_V2_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 5020:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEA_V3` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEA_V3_0`,
    public var `Anonymous2`: `PROPSHEETPAGEA_V3_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKA`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pszHeaderTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pszHeaderSubTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `hActCtx`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 5044:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5050:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_V3_0 {
//     pub pszTemplate: windows_sys::core::PCSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 5057:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5063:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEA_V3_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 5070:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEA_V3_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEW` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEW_0`,
    public var `Anonymous2`: `PROPSHEETPAGEW_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKW`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pszHeaderTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszHeaderSubTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `hActCtx`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Anonymous3`: `PROPSHEETPAGEW_2`,
)
// UNSUPPORTED Rust 5095:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5101:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_0 {
//     pub pszTemplate: windows_sys::core::PCWSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 5108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5114:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5127:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_2 {
//     pub hbmHeader: super::super::Graphics::Gdi::HBITMAP,
//     pub pszbmHeader: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5134:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEW_V1` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEW_V1_0`,
    public var `Anonymous2`: `PROPSHEETPAGEW_V1_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKW`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 5155:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5161:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_V1_0 {
//     pub pszTemplate: windows_sys::core::PCWSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 5168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5174:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_V1_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5181:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEW_V2` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEW_V2_0`,
    public var `Anonymous2`: `PROPSHEETPAGEW_V2_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKW`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pszHeaderTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszHeaderSubTitle`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 5204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5210:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_V2_0 {
//     pub pszTemplate: windows_sys::core::PCWSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 5217:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5223:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_V2_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5230:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROPSHEETPAGEW_V3` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Anonymous1`: `PROPSHEETPAGEW_V3_0`,
    public var `Anonymous2`: `PROPSHEETPAGEW_V3_1`,
    public var `pszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pfnDlgProc`: `super`.`WindowsAndMessaging`.`DLGPROC`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnCallback`: `LPFNPSPCALLBACKW`,
    public var `pcRefParent`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pszHeaderTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszHeaderSubTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `hActCtx`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 5254:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5260:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_V3_0 {
//     pub pszTemplate: windows_sys::core::PCWSTR,
//     pub pResource: *mut super::WindowsAndMessaging::DLGTEMPLATE,
// }

// UNSUPPORTED Rust 5267:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5273:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PROPSHEETPAGEW_V3_1 {
//     pub hIcon: super::WindowsAndMessaging::HICON,
//     pub pszIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PROPSHEETPAGEW_V3_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROP_LG_CXDLG`: UInt = 252u;
public const val `PROP_LG_CYDLG`: UInt = 218u;
public const val `PROP_MED_CXDLG`: UInt = 227u;
public const val `PROP_MED_CYDLG`: UInt = 215u;
public const val `PROP_SM_CXDLG`: UInt = 212u;
public const val `PROP_SM_CYDLG`: UInt = 188u;
public const val `PSBTN_APPLYNOW`: UInt = 4u;
public const val `PSBTN_BACK`: UInt = 0u;
public const val `PSBTN_CANCEL`: UInt = 5u;
public const val `PSBTN_FINISH`: UInt = 2u;
public const val `PSBTN_HELP`: UInt = 6u;
public const val `PSBTN_MAX`: UInt = 6u;
public const val `PSBTN_NEXT`: UInt = 1u;
public const val `PSBTN_OK`: UInt = 3u;
public const val `PSCB_BUTTONPRESSED`: UInt = 3u;
public const val `PSCB_INITIALIZED`: UInt = 1u;
public const val `PSCB_PRECREATE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PSHNOTIFY` (
    public var `hdr`: `NMHDR`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
public const val `PSH_AEROWIZARD`: UInt = 16384u;
public const val `PSH_DEFAULT`: UInt = 0u;
public const val `PSH_HASHELP`: UInt = 512u;
public const val `PSH_HEADER`: UInt = 524288u;
public const val `PSH_HEADERBITMAP`: UInt = 134217728u;
public const val `PSH_MODELESS`: UInt = 1024u;
public const val `PSH_NOAPPLYNOW`: UInt = 128u;
public const val `PSH_NOCONTEXTHELP`: UInt = 33554432u;
public const val `PSH_NOMARGIN`: UInt = 268435456u;
public const val `PSH_PROPSHEETPAGE`: UInt = 8u;
public const val `PSH_PROPTITLE`: UInt = 1u;
public const val `PSH_RESIZABLE`: UInt = 67108864u;
public const val `PSH_RTLREADING`: UInt = 2048u;
public const val `PSH_STRETCHWATERMARK`: UInt = 262144u;
public const val `PSH_USECALLBACK`: UInt = 256u;
public const val `PSH_USEHBMHEADER`: UInt = 1048576u;
public const val `PSH_USEHBMWATERMARK`: UInt = 65536u;
public const val `PSH_USEHICON`: UInt = 2u;
public const val `PSH_USEHPLWATERMARK`: UInt = 131072u;
public const val `PSH_USEICONID`: UInt = 4u;
public const val `PSH_USEPAGELANG`: UInt = 2097152u;
public const val `PSH_USEPSTARTPAGE`: UInt = 64u;
public const val `PSH_WATERMARK`: UInt = 32768u;
public const val `PSH_WIZARD`: UInt = 32u;
public const val `PSH_WIZARD97`: UInt = 8192u;
public const val `PSH_WIZARDCONTEXTHELP`: UInt = 4096u;
public const val `PSH_WIZARDHASFINISH`: UInt = 16u;
public const val `PSH_WIZARD_LITE`: UInt = 4194304u;
public const val `PSM_ADDPAGE`: UInt = 1127u;
public const val `PSM_APPLY`: UInt = 1134u;
public const val `PSM_CANCELTOCLOSE`: UInt = 1131u;
public const val `PSM_CHANGED`: UInt = 1128u;
public const val `PSM_ENABLEWIZBUTTONS`: UInt = 1163u;
public const val `PSM_GETCURRENTPAGEHWND`: UInt = 1142u;
public const val `PSM_GETRESULT`: UInt = 1159u;
public const val `PSM_GETTABCONTROL`: UInt = 1140u;
public const val `PSM_HWNDTOINDEX`: UInt = 1153u;
public const val `PSM_IDTOINDEX`: UInt = 1157u;
public const val `PSM_INDEXTOHWND`: UInt = 1154u;
public const val `PSM_INDEXTOID`: UInt = 1158u;
public const val `PSM_INDEXTOPAGE`: UInt = 1156u;
public const val `PSM_INSERTPAGE`: UInt = 1143u;
public const val `PSM_ISDIALOGMESSAGE`: UInt = 1141u;
public const val `PSM_PAGETOINDEX`: UInt = 1155u;
public const val `PSM_PRESSBUTTON`: UInt = 1137u;
public const val `PSM_QUERYSIBLINGS`: UInt = 1132u;
public const val `PSM_REBOOTSYSTEM`: UInt = 1130u;
public const val `PSM_RECALCPAGESIZES`: UInt = 1160u;
public const val `PSM_REMOVEPAGE`: UInt = 1126u;
public const val `PSM_RESTARTWINDOWS`: UInt = 1129u;
public const val `PSM_SETBUTTONTEXT`: UInt = 1164u;
public const val `PSM_SETBUTTONTEXTW`: UInt = 1164u;
public const val `PSM_SETCURSEL`: UInt = 1125u;
public const val `PSM_SETCURSELID`: UInt = 1138u;
public const val `PSM_SETFINISHTEXT`: UInt = 1145u;
public const val `PSM_SETFINISHTEXTA`: UInt = 1139u;
public const val `PSM_SETFINISHTEXTW`: UInt = 1145u;
public const val `PSM_SETHEADERSUBTITLE`: UInt = 1152u;
public const val `PSM_SETHEADERSUBTITLEA`: UInt = 1151u;
public const val `PSM_SETHEADERSUBTITLEW`: UInt = 1152u;
public const val `PSM_SETHEADERTITLE`: UInt = 1150u;
public const val `PSM_SETHEADERTITLEA`: UInt = 1149u;
public const val `PSM_SETHEADERTITLEW`: UInt = 1150u;
public const val `PSM_SETNEXTTEXT`: UInt = 1161u;
public const val `PSM_SETNEXTTEXTW`: UInt = 1161u;
public const val `PSM_SETTITLE`: UInt = 1144u;
public const val `PSM_SETTITLEA`: UInt = 1135u;
public const val `PSM_SETTITLEW`: UInt = 1144u;
public const val `PSM_SETWIZBUTTONS`: UInt = 1136u;
public const val `PSM_SHOWWIZBUTTONS`: UInt = 1162u;
public const val `PSM_UNCHANGED`: UInt = 1133u;
public const val `PSNRET_INVALID`: UInt = 1u;
public const val `PSNRET_INVALID_NOCHANGEPAGE`: UInt = 2u;
public const val `PSNRET_MESSAGEHANDLED`: UInt = 3u;
public const val `PSNRET_NOERROR`: UInt = 0u;
public const val `PSN_APPLY`: UInt = 4294967094u;
public const val `PSN_FIRST`: UInt = 4294967096u;
public const val `PSN_GETOBJECT`: UInt = 4294967086u;
public const val `PSN_HELP`: UInt = 4294967091u;
public const val `PSN_KILLACTIVE`: UInt = 4294967095u;
public const val `PSN_LAST`: UInt = 4294966997u;
public const val `PSN_QUERYCANCEL`: UInt = 4294967087u;
public const val `PSN_QUERYINITIALFOCUS`: UInt = 4294967083u;
public const val `PSN_RESET`: UInt = 4294967093u;
public const val `PSN_SETACTIVE`: UInt = 4294967096u;
public const val `PSN_TRANSLATEACCELERATOR`: UInt = 4294967084u;
public const val `PSN_WIZBACK`: UInt = 4294967090u;
public const val `PSN_WIZFINISH`: UInt = 4294967088u;
public const val `PSN_WIZNEXT`: UInt = 4294967089u;
public const val `PSPCB_ADDREF`: `PSPCB_MESSAGE` = 0u;
public const val `PSPCB_CREATE`: `PSPCB_MESSAGE` = 2u;
public typealias `PSPCB_MESSAGE` = UInt;
public const val `PSPCB_RELEASE`: `PSPCB_MESSAGE` = 1u;
public const val `PSPCB_SI_INITDIALOG`: `PSPCB_MESSAGE` = 1025u;
public const val `PSP_DEFAULT`: UInt = 0u;
public const val `PSP_DLGINDIRECT`: UInt = 1u;
public const val `PSP_HASHELP`: UInt = 32u;
public const val `PSP_HIDEHEADER`: UInt = 2048u;
public const val `PSP_PREMATURE`: UInt = 1024u;
public const val `PSP_RTLREADING`: UInt = 16u;
public const val `PSP_USECALLBACK`: UInt = 128u;
public const val `PSP_USEFUSIONCONTEXT`: UInt = 16384u;
public const val `PSP_USEHEADERSUBTITLE`: UInt = 8192u;
public const val `PSP_USEHEADERTITLE`: UInt = 4096u;
public const val `PSP_USEHICON`: UInt = 2u;
public const val `PSP_USEICONID`: UInt = 4u;
public const val `PSP_USEREFPARENT`: UInt = 64u;
public const val `PSP_USETITLE`: UInt = 8u;
public const val `PSWIZBF_ELEVATIONREQUIRED`: UInt = 1u;
public const val `PSWIZB_BACK`: UInt = 1u;
public const val `PSWIZB_CANCEL`: UInt = 16u;
public const val `PSWIZB_DISABLEDFINISH`: UInt = 8u;
public const val `PSWIZB_FINISH`: UInt = 4u;
public const val `PSWIZB_NEXT`: UInt = 2u;
public const val `PSWIZB_RESTORE`: UInt = 1u;
public const val `PSWIZB_SHOW`: UInt = 0u;
public typealias `PUSHBUTTONDROPDOWNSTATES` = Int;
public typealias `PUSHBUTTONSTATES` = Int;
public typealias `RADIOBUTTONSTATES` = Int;
public const val `RBAB_ADDBAND`: UInt = 2u;
public const val `RBAB_AUTOSIZE`: UInt = 1u;
public const val `RBBIM_BACKGROUND`: UInt = 128u;
public const val `RBBIM_CHEVRONLOCATION`: UInt = 4096u;
public const val `RBBIM_CHEVRONSTATE`: UInt = 8192u;
public const val `RBBIM_CHILD`: UInt = 16u;
public const val `RBBIM_CHILDSIZE`: UInt = 32u;
public const val `RBBIM_COLORS`: UInt = 2u;
public const val `RBBIM_HEADERSIZE`: UInt = 2048u;
public const val `RBBIM_ID`: UInt = 256u;
public const val `RBBIM_IDEALSIZE`: UInt = 512u;
public const val `RBBIM_IMAGE`: UInt = 8u;
public const val `RBBIM_LPARAM`: UInt = 1024u;
public const val `RBBIM_SIZE`: UInt = 64u;
public const val `RBBIM_STYLE`: UInt = 1u;
public const val `RBBIM_TEXT`: UInt = 4u;
public const val `RBBS_BREAK`: UInt = 1u;
public const val `RBBS_CHILDEDGE`: UInt = 4u;
public const val `RBBS_FIXEDBMP`: UInt = 32u;
public const val `RBBS_FIXEDSIZE`: UInt = 2u;
public const val `RBBS_GRIPPERALWAYS`: UInt = 128u;
public const val `RBBS_HIDDEN`: UInt = 8u;
public const val `RBBS_HIDETITLE`: UInt = 1024u;
public const val `RBBS_NOGRIPPER`: UInt = 256u;
public const val `RBBS_NOVERT`: UInt = 16u;
public const val `RBBS_TOPALIGN`: UInt = 2048u;
public const val `RBBS_USECHEVRON`: UInt = 512u;
public const val `RBBS_VARIABLEHEIGHT`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RBHITTESTINFO` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `flags`: UInt,
    public var `iBand`: Int,
)
public const val `RBHT_CAPTION`: UInt = 2u;
public const val `RBHT_CHEVRON`: UInt = 8u;
public const val `RBHT_CLIENT`: UInt = 3u;
public const val `RBHT_GRABBER`: UInt = 4u;
public const val `RBHT_NOWHERE`: UInt = 1u;
public const val `RBHT_SPLITTER`: UInt = 16u;
public const val `RBIM_IMAGELIST`: UInt = 1u;
public const val `RBNM_ID`: `NMREBAR_MASK_FLAGS` = 1u;
public const val `RBNM_LPARAM`: `NMREBAR_MASK_FLAGS` = 4u;
public const val `RBNM_STYLE`: `NMREBAR_MASK_FLAGS` = 2u;
public const val `RBN_AUTOBREAK`: UInt = 4294966443u;
public const val `RBN_AUTOSIZE`: UInt = 4294966462u;
public const val `RBN_BEGINDRAG`: UInt = 4294966461u;
public const val `RBN_CHEVRONPUSHED`: UInt = 4294966455u;
public const val `RBN_CHILDSIZE`: UInt = 4294966457u;
public const val `RBN_DELETEDBAND`: UInt = 4294966458u;
public const val `RBN_DELETINGBAND`: UInt = 4294966459u;
public const val `RBN_ENDDRAG`: UInt = 4294966460u;
public const val `RBN_FIRST`: UInt = 4294966465u;
public const val `RBN_GETOBJECT`: UInt = 4294966464u;
public const val `RBN_HEIGHTCHANGE`: UInt = 4294966465u;
public const val `RBN_LAST`: UInt = 4294966437u;
public const val `RBN_LAYOUTCHANGED`: UInt = 4294966463u;
public const val `RBN_MINMAX`: UInt = 4294966444u;
public const val `RBN_SPLITTERDRAG`: UInt = 4294966454u;
public const val `RBSTR_CHANGERECT`: UInt = 1u;
public const val `RBS_AUTOSIZE`: UInt = 8192u;
public const val `RBS_BANDBORDERS`: UInt = 1024u;
public const val `RBS_CHECKEDDISABLED`: `RADIOBUTTONSTATES` = 8;
public const val `RBS_CHECKEDHOT`: `RADIOBUTTONSTATES` = 6;
public const val `RBS_CHECKEDNORMAL`: `RADIOBUTTONSTATES` = 5;
public const val `RBS_CHECKEDPRESSED`: `RADIOBUTTONSTATES` = 7;
public const val `RBS_DBLCLKTOGGLE`: UInt = 32768u;
public const val `RBS_DISABLED`: `RESTOREBUTTONSTATES` = 4;
public const val `RBS_FIXEDORDER`: UInt = 2048u;
public const val `RBS_HOT`: `RESTOREBUTTONSTATES` = 2;
public const val `RBS_NORMAL`: `RESTOREBUTTONSTATES` = 1;
public const val `RBS_PUSHED`: `RESTOREBUTTONSTATES` = 3;
public const val `RBS_REGISTERDROP`: UInt = 4096u;
public const val `RBS_TOOLTIPS`: UInt = 256u;
public const val `RBS_UNCHECKEDDISABLED`: `RADIOBUTTONSTATES` = 4;
public const val `RBS_UNCHECKEDHOT`: `RADIOBUTTONSTATES` = 2;
public const val `RBS_UNCHECKEDNORMAL`: `RADIOBUTTONSTATES` = 1;
public const val `RBS_UNCHECKEDPRESSED`: `RADIOBUTTONSTATES` = 3;
public const val `RBS_VARHEIGHT`: UInt = 512u;
public const val `RBS_VERTICALGRIPPER`: UInt = 16384u;
public const val `RB_BEGINDRAG`: UInt = 1048u;
public const val `RB_DELETEBAND`: UInt = 1026u;
public const val `RB_DRAGMOVE`: UInt = 1050u;
public const val `RB_ENDDRAG`: UInt = 1049u;
public const val `RB_GETBANDBORDERS`: UInt = 1058u;
public const val `RB_GETBANDCOUNT`: UInt = 1036u;
public const val `RB_GETBANDINFO`: UInt = 1052u;
public const val `RB_GETBANDINFOA`: UInt = 1053u;
public const val `RB_GETBANDINFOW`: UInt = 1052u;
public const val `RB_GETBANDMARGINS`: UInt = 1064u;
public const val `RB_GETBARHEIGHT`: UInt = 1051u;
public const val `RB_GETBARINFO`: UInt = 1027u;
public const val `RB_GETBKCOLOR`: UInt = 1044u;
public const val `RB_GETCOLORSCHEME`: UInt = 8195u;
public const val `RB_GETDROPTARGET`: UInt = 8196u;
public const val `RB_GETEXTENDEDSTYLE`: UInt = 1066u;
public const val `RB_GETPALETTE`: UInt = 1062u;
public const val `RB_GETRECT`: UInt = 1033u;
public const val `RB_GETROWCOUNT`: UInt = 1037u;
public const val `RB_GETROWHEIGHT`: UInt = 1038u;
public const val `RB_GETTEXTCOLOR`: UInt = 1046u;
public const val `RB_GETTOOLTIPS`: UInt = 1041u;
public const val `RB_GETUNICODEFORMAT`: UInt = 8198u;
public const val `RB_HITTEST`: UInt = 1032u;
public const val `RB_IDTOINDEX`: UInt = 1040u;
public const val `RB_INSERTBAND`: UInt = 1034u;
public const val `RB_INSERTBANDA`: UInt = 1025u;
public const val `RB_INSERTBANDW`: UInt = 1034u;
public const val `RB_MAXIMIZEBAND`: UInt = 1055u;
public const val `RB_MINIMIZEBAND`: UInt = 1054u;
public const val `RB_MOVEBAND`: UInt = 1063u;
public const val `RB_PUSHCHEVRON`: UInt = 1067u;
public const val `RB_SETBANDINFO`: UInt = 1035u;
public const val `RB_SETBANDINFOA`: UInt = 1030u;
public const val `RB_SETBANDINFOW`: UInt = 1035u;
public const val `RB_SETBANDWIDTH`: UInt = 1068u;
public const val `RB_SETBARINFO`: UInt = 1028u;
public const val `RB_SETBKCOLOR`: UInt = 1043u;
public const val `RB_SETCOLORSCHEME`: UInt = 8194u;
public const val `RB_SETEXTENDEDSTYLE`: UInt = 1065u;
public const val `RB_SETPALETTE`: UInt = 1061u;
public const val `RB_SETPARENT`: UInt = 1031u;
public const val `RB_SETTEXTCOLOR`: UInt = 1045u;
public const val `RB_SETTOOLTIPS`: UInt = 1042u;
public const val `RB_SETUNICODEFORMAT`: UInt = 8197u;
public const val `RB_SETWINDOWTHEME`: UInt = 8203u;
public const val `RB_SHOWBAND`: UInt = 1059u;
public const val `RB_SIZETORECT`: UInt = 1047u;
public typealias `READONLYSTATES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REBARBANDINFOA` (
    public var `cbSize`: UInt,
    public var `fMask`: UInt,
    public var `fStyle`: UInt,
    public var `clrFore`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrBack`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `lpText`: `windows_sys`.`core`.`PSTR`,
    public var `cch`: UInt,
    public var `iImage`: Int,
    public var `hwndChild`: `super`.`super`.`Foundation`.`HWND`,
    public var `cxMinChild`: UInt,
    public var `cyMinChild`: UInt,
    public var `cx`: UInt,
    public var `hbmBack`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `wID`: UInt,
    public var `cyChild`: UInt,
    public var `cyMaxChild`: UInt,
    public var `cyIntegral`: UInt,
    public var `cxIdeal`: UInt,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `cxHeader`: UInt,
    public var `rcChevronLocation`: `super`.`super`.`Foundation`.`RECT`,
    public var `uChevronState`: UInt,
)
// UNSUPPORTED Rust 5585:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for REBARBANDINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REBARBANDINFOW` (
    public var `cbSize`: UInt,
    public var `fMask`: UInt,
    public var `fStyle`: UInt,
    public var `clrFore`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrBack`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `lpText`: `windows_sys`.`core`.`PWSTR`,
    public var `cch`: UInt,
    public var `iImage`: Int,
    public var `hwndChild`: `super`.`super`.`Foundation`.`HWND`,
    public var `cxMinChild`: UInt,
    public var `cyMinChild`: UInt,
    public var `cx`: UInt,
    public var `hbmBack`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
    public var `wID`: UInt,
    public var `cyChild`: UInt,
    public var `cyMaxChild`: UInt,
    public var `cyIntegral`: UInt,
    public var `cxIdeal`: UInt,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `cxHeader`: UInt,
    public var `rcChevronLocation`: `super`.`super`.`Foundation`.`RECT`,
    public var `uChevronState`: UInt,
)
// UNSUPPORTED Rust 5618:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for REBARBANDINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REBARCLASSNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReBarWindow32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REBARCLASSNAMEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ReBarWindow32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `REBARCLASSNAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReBarWindow32");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REBARINFO` (
    public var `cbSize`: UInt,
    public var `fMask`: UInt,
    public var `himl`: `HIMAGELIST`,
)
public typealias `REBARPARTS` = Int;
public const val `REPLACEDLGORD`: UInt = 1541u;
public typealias `RESTOREBUTTONSTATES` = Int;
public const val `RP_BACKGROUND`: `REBARPARTS` = 6;
public const val `RP_BAND`: `REBARPARTS` = 3;
public const val `RP_CHEVRON`: `REBARPARTS` = 4;
public const val `RP_CHEVRONVERT`: `REBARPARTS` = 5;
public const val `RP_GRIPPER`: `REBARPARTS` = 1;
public const val `RP_GRIPPERVERT`: `REBARPARTS` = 2;
public const val `RP_SPLITTER`: `REBARPARTS` = 7;
public const val `RP_SPLITTERVERT`: `REBARPARTS` = 8;
public const val `RUNDLGORD`: UInt = 1545u;
public const val `SBARS_SIZEGRIP`: UInt = 256u;
public const val `SBARS_TOOLTIPS`: UInt = 2048u;
public const val `SBN_FIRST`: UInt = 4294966416u;
public const val `SBN_LAST`: UInt = 4294966397u;
public const val `SBN_SIMPLEMODECHANGE`: UInt = 4294966416u;
public const val `SBP_ARROWBTN`: `SCROLLBARPARTS` = 1;
public const val `SBP_GRIPPERHORZ`: `SCROLLBARPARTS` = 8;
public const val `SBP_GRIPPERVERT`: `SCROLLBARPARTS` = 9;
public const val `SBP_LOWERTRACKHORZ`: `SCROLLBARPARTS` = 4;
public const val `SBP_LOWERTRACKVERT`: `SCROLLBARPARTS` = 6;
public const val `SBP_SIZEBOX`: `SCROLLBARPARTS` = 10;
public const val `SBP_SIZEBOXBKGND`: `SCROLLBARPARTS` = 11;
public const val `SBP_THUMBBTNHORZ`: `SCROLLBARPARTS` = 2;
public const val `SBP_THUMBBTNVERT`: `SCROLLBARPARTS` = 3;
public const val `SBP_UPPERTRACKHORZ`: `SCROLLBARPARTS` = 5;
public const val `SBP_UPPERTRACKVERT`: `SCROLLBARPARTS` = 7;
public const val `SBS_DISABLED`: `SYSBUTTONSTATES` = 4;
public const val `SBS_HOT`: `SYSBUTTONSTATES` = 2;
public const val `SBS_NORMAL`: `SYSBUTTONSTATES` = 1;
public const val `SBS_PUSHED`: `SYSBUTTONSTATES` = 3;
public const val `SBT_NOBORDERS`: UInt = 256u;
public const val `SBT_NOTABPARSING`: UInt = 2048u;
public const val `SBT_OWNERDRAW`: UInt = 4096u;
public const val `SBT_POPOUT`: UInt = 512u;
public const val `SBT_RTLREADING`: UInt = 1024u;
public const val `SBT_TOOLTIPS`: UInt = 2048u;
public const val `SB_GETBORDERS`: UInt = 1031u;
public const val `SB_GETICON`: UInt = 1044u;
public const val `SB_GETPARTS`: UInt = 1030u;
public const val `SB_GETRECT`: UInt = 1034u;
public const val `SB_GETTEXT`: UInt = 1037u;
public const val `SB_GETTEXTA`: UInt = 1026u;
public const val `SB_GETTEXTLENGTH`: UInt = 1036u;
public const val `SB_GETTEXTLENGTHA`: UInt = 1027u;
public const val `SB_GETTEXTLENGTHW`: UInt = 1036u;
public const val `SB_GETTEXTW`: UInt = 1037u;
public const val `SB_GETTIPTEXTA`: UInt = 1042u;
public const val `SB_GETTIPTEXTW`: UInt = 1043u;
public const val `SB_GETUNICODEFORMAT`: UInt = 8198u;
public const val `SB_ISSIMPLE`: UInt = 1038u;
public const val `SB_SETBKCOLOR`: UInt = 8193u;
public const val `SB_SETICON`: UInt = 1039u;
public const val `SB_SETMINHEIGHT`: UInt = 1032u;
public const val `SB_SETPARTS`: UInt = 1028u;
public const val `SB_SETTEXT`: UInt = 1035u;
public const val `SB_SETTEXTA`: UInt = 1025u;
public const val `SB_SETTEXTW`: UInt = 1035u;
public const val `SB_SETTIPTEXTA`: UInt = 1040u;
public const val `SB_SETTIPTEXTW`: UInt = 1041u;
public const val `SB_SETUNICODEFORMAT`: UInt = 8197u;
public const val `SB_SIMPLE`: UInt = 1033u;
public const val `SB_SIMPLEID`: UInt = 255u;
public const val `SCBS_DISABLED`: `SMALLCLOSEBUTTONSTATES` = 4;
public const val `SCBS_HOT`: `SMALLCLOSEBUTTONSTATES` = 2;
public const val `SCBS_NORMAL`: `SMALLCLOSEBUTTONSTATES` = 1;
public const val `SCBS_PUSHED`: `SMALLCLOSEBUTTONSTATES` = 3;
public const val `SCRBS_DISABLED`: `SCROLLBARSTYLESTATES` = 4;
public const val `SCRBS_HOT`: `SCROLLBARSTYLESTATES` = 2;
public const val `SCRBS_HOVER`: `SCROLLBARSTYLESTATES` = 5;
public const val `SCRBS_NORMAL`: `SCROLLBARSTYLESTATES` = 1;
public const val `SCRBS_PRESSED`: `SCROLLBARSTYLESTATES` = 3;
public typealias `SCROLLBARPARTS` = Int;
public typealias `SCROLLBARSTYLESTATES` = Int;
public const val `SCS_ACTIVE`: `SMALLCAPTIONSTATES` = 1;
public const val `SCS_DISABLED`: `SMALLCAPTIONSTATES` = 3;
public const val `SCS_INACTIVE`: `SMALLCAPTIONSTATES` = 2;
public typealias `SECTIONTITLELINKSTATES` = Int;
public typealias `SET_THEME_APP_PROPERTIES_FLAGS` = UInt;
public const val `SFRB_ACTIVE`: `SMALLFRAMEBOTTOMSTATES` = 1;
public const val `SFRB_INACTIVE`: `SMALLFRAMEBOTTOMSTATES` = 2;
public const val `SFRL_ACTIVE`: `SMALLFRAMELEFTSTATES` = 1;
public const val `SFRL_INACTIVE`: `SMALLFRAMELEFTSTATES` = 2;
public const val `SFRR_ACTIVE`: `SMALLFRAMERIGHTSTATES` = 1;
public const val `SFRR_INACTIVE`: `SMALLFRAMERIGHTSTATES` = 2;
public typealias `SHOWCALENDARBUTTONRIGHTSTATES` = Int;
public typealias `SIZEBOXSTATES` = Int;
public typealias `SIZINGTYPE` = Int;
public typealias `SMALLCAPTIONSTATES` = Int;
public typealias `SMALLCLOSEBUTTONSTATES` = Int;
public typealias `SMALLFRAMEBOTTOMSTATES` = Int;
public typealias `SMALLFRAMELEFTSTATES` = Int;
public typealias `SMALLFRAMERIGHTSTATES` = Int;
public typealias `SOFTWAREEXPLORERSTATES` = Int;
public typealias `SPECIALGROUPCOLLAPSESTATES` = Int;
public typealias `SPECIALGROUPEXPANDSTATES` = Int;
public typealias `SPINPARTS` = Int;
public const val `SPLITSV_HOT`: `SPLITTERVERTSTATES` = 2;
public const val `SPLITSV_NORMAL`: `SPLITTERVERTSTATES` = 1;
public const val `SPLITSV_PRESSED`: `SPLITTERVERTSTATES` = 3;
public const val `SPLITS_HOT`: `SPLITTERSTATES` = 2;
public const val `SPLITS_NORMAL`: `SPLITTERSTATES` = 1;
public const val `SPLITS_PRESSED`: `SPLITTERSTATES` = 3;
public typealias `SPLITTERSTATES` = Int;
public typealias `SPLITTERVERTSTATES` = Int;
public const val `SPLS_HOT`: `LOGOFFBUTTONSSTATES` = 2;
public const val `SPLS_NORMAL`: `LOGOFFBUTTONSSTATES` = 1;
public const val `SPLS_PRESSED`: `LOGOFFBUTTONSSTATES` = 3;
public const val `SPMPT_DISABLED`: `MOREPROGRAMSTABSTATES` = 4;
public const val `SPMPT_FOCUSED`: `MOREPROGRAMSTABSTATES` = 5;
public const val `SPMPT_HOT`: `MOREPROGRAMSTABSTATES` = 2;
public const val `SPMPT_NORMAL`: `MOREPROGRAMSTABSTATES` = 1;
public const val `SPMPT_SELECTED`: `MOREPROGRAMSTABSTATES` = 3;
public const val `SPNP_DOWN`: `SPINPARTS` = 2;
public const val `SPNP_DOWNHORZ`: `SPINPARTS` = 4;
public const val `SPNP_UP`: `SPINPARTS` = 1;
public const val `SPNP_UPHORZ`: `SPINPARTS` = 3;
public const val `SPOB_DISABLED`: `OPENBOXSTATES` = 4;
public const val `SPOB_FOCUSED`: `OPENBOXSTATES` = 5;
public const val `SPOB_HOT`: `OPENBOXSTATES` = 2;
public const val `SPOB_NORMAL`: `OPENBOXSTATES` = 1;
public const val `SPOB_SELECTED`: `OPENBOXSTATES` = 3;
public const val `SPP_LOGOFF`: `STARTPANELPARTS` = 8;
public const val `SPP_LOGOFFBUTTONS`: `STARTPANELPARTS` = 9;
public const val `SPP_LOGOFFSPLITBUTTONDROPDOWN`: `STARTPANELPARTS` = 19;
public const val `SPP_MOREPROGRAMS`: `STARTPANELPARTS` = 2;
public const val `SPP_MOREPROGRAMSARROW`: `STARTPANELPARTS` = 3;
public const val `SPP_MOREPROGRAMSARROWBACK`: `STARTPANELPARTS` = 17;
public const val `SPP_MOREPROGRAMSTAB`: `STARTPANELPARTS` = 12;
public const val `SPP_NSCHOST`: `STARTPANELPARTS` = 13;
public const val `SPP_OPENBOX`: `STARTPANELPARTS` = 15;
public const val `SPP_PLACESLIST`: `STARTPANELPARTS` = 6;
public const val `SPP_PLACESLISTSEPARATOR`: `STARTPANELPARTS` = 7;
public const val `SPP_PREVIEW`: `STARTPANELPARTS` = 11;
public const val `SPP_PROGLIST`: `STARTPANELPARTS` = 4;
public const val `SPP_PROGLISTSEPARATOR`: `STARTPANELPARTS` = 5;
public const val `SPP_SEARCHVIEW`: `STARTPANELPARTS` = 16;
public const val `SPP_SOFTWAREEXPLORER`: `STARTPANELPARTS` = 14;
public const val `SPP_TOPMATCH`: `STARTPANELPARTS` = 18;
public const val `SPP_USERPANE`: `STARTPANELPARTS` = 1;
public const val `SPP_USERPICTURE`: `STARTPANELPARTS` = 10;
public const val `SPSB_HOT`: `MOREPROGRAMSARROWBACKSTATES` = 2;
public const val `SPSB_NORMAL`: `MOREPROGRAMSARROWBACKSTATES` = 1;
public const val `SPSB_PRESSED`: `MOREPROGRAMSARROWBACKSTATES` = 3;
public const val `SPSE_DISABLED`: `SOFTWAREEXPLORERSTATES` = 4;
public const val `SPSE_FOCUSED`: `SOFTWAREEXPLORERSTATES` = 5;
public const val `SPSE_HOT`: `SOFTWAREEXPLORERSTATES` = 2;
public const val `SPSE_NORMAL`: `SOFTWAREEXPLORERSTATES` = 1;
public const val `SPSE_SELECTED`: `SOFTWAREEXPLORERSTATES` = 3;
public const val `SPS_HOT`: `MOREPROGRAMSARROWSTATES` = 2;
public const val `SPS_NORMAL`: `MOREPROGRAMSARROWSTATES` = 1;
public const val `SPS_PRESSED`: `MOREPROGRAMSARROWSTATES` = 3;
public const val `SP_GRIPPER`: `STATUSPARTS` = 3;
public const val `SP_GRIPPERPANE`: `STATUSPARTS` = 2;
public const val `SP_PANE`: `STATUSPARTS` = 1;
public typealias `STANDARDSTATES` = Int;
public typealias `STARTPANELPARTS` = Int;
public const val `STATE_SYSTEM_FOCUSABLE`: `COMBOBOXINFO_BUTTON_STATE` = 1048576u;
public const val `STATE_SYSTEM_INVISIBLE`: `COMBOBOXINFO_BUTTON_STATE` = 32768u;
public const val `STATE_SYSTEM_OFFSCREEN`: `COMBOBOXINFO_BUTTON_STATE` = 65536u;
public const val `STATE_SYSTEM_PRESSED`: `COMBOBOXINFO_BUTTON_STATE` = 8u;
public const val `STATE_SYSTEM_UNAVAILABLE`: `COMBOBOXINFO_BUTTON_STATE` = 1u;
public typealias `STATICPARTS` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STATUSCLASSNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_statusbar32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STATUSCLASSNAMEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("msctls_statusbar32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STATUSCLASSNAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_statusbar32");
public typealias `STATUSPARTS` = Int;
public const val `STAT_TEXT`: `STATICPARTS` = 1;
public const val `STD_COPY`: UInt = 1u;
public const val `STD_CUT`: UInt = 0u;
public const val `STD_DELETE`: UInt = 5u;
public const val `STD_FILENEW`: UInt = 6u;
public const val `STD_FILEOPEN`: UInt = 7u;
public const val `STD_FILESAVE`: UInt = 8u;
public const val `STD_FIND`: UInt = 12u;
public const val `STD_HELP`: UInt = 11u;
public const val `STD_PASTE`: UInt = 2u;
public const val `STD_PRINT`: UInt = 14u;
public const val `STD_PRINTPRE`: UInt = 9u;
public const val `STD_PROPERTIES`: UInt = 10u;
public const val `STD_REDOW`: UInt = 4u;
public const val `STD_REPLACE`: UInt = 13u;
public const val `STD_UNDO`: UInt = 3u;
public const val `ST_STRETCH`: `SIZINGTYPE` = 1;
public const val `ST_TILE`: `SIZINGTYPE` = 2;
public const val `ST_TRUESIZE`: `SIZINGTYPE` = 0;
public typealias `SYSBUTTONSTATES` = Int;
public typealias `SYSTEMCLOSEHCHOTSTATES` = Int;
public typealias `SYSTEMCLOSESTATES` = Int;
public typealias `SYSTEMMAXIMIZEHCHOTSTATES` = Int;
public typealias `SYSTEMMAXIMIZESTATES` = Int;
public typealias `SYSTEMMINIMIZEHCHOTSTATES` = Int;
public typealias `SYSTEMMINIMIZESTATES` = Int;
public typealias `SYSTEMRESTOREHCHOTSTATES` = Int;
public typealias `SYSTEMRESTORESTATES` = Int;
public const val `SZB_HALFBOTTOMLEFTALIGN`: `SIZEBOXSTATES` = 6;
public const val `SZB_HALFBOTTOMRIGHTALIGN`: `SIZEBOXSTATES` = 5;
public const val `SZB_HALFTOPLEFTALIGN`: `SIZEBOXSTATES` = 8;
public const val `SZB_HALFTOPRIGHTALIGN`: `SIZEBOXSTATES` = 7;
public const val `SZB_LEFTALIGN`: `SIZEBOXSTATES` = 2;
public const val `SZB_RIGHTALIGN`: `SIZEBOXSTATES` = 1;
public const val `SZB_TOPLEFTALIGN`: `SIZEBOXSTATES` = 4;
public const val `SZB_TOPRIGHTALIGN`: `SIZEBOXSTATES` = 3;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_THDOCPROP_AUTHOR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("author");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_THDOCPROP_CANONICALNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ThemeName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_THDOCPROP_DISPLAYNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DisplayName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_THDOCPROP_TOOLTIP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ToolTip");
public typealias `TABITEMBOTHEDGESTATES` = Int;
public typealias `TABITEMLEFTEDGESTATES` = Int;
public typealias `TABITEMRIGHTEDGESTATES` = Int;
public typealias `TABITEMSTATES` = Int;
public typealias `TABPARTS` = Int;
public const val `TABP_AEROWIZARDBODY`: `TABPARTS` = 11;
public const val `TABP_BODY`: `TABPARTS` = 10;
public const val `TABP_PANE`: `TABPARTS` = 9;
public const val `TABP_TABITEM`: `TABPARTS` = 1;
public const val `TABP_TABITEMBOTHEDGE`: `TABPARTS` = 4;
public const val `TABP_TABITEMLEFTEDGE`: `TABPARTS` = 2;
public const val `TABP_TABITEMRIGHTEDGE`: `TABPARTS` = 3;
public const val `TABP_TOPTABITEM`: `TABPARTS` = 5;
public const val `TABP_TOPTABITEMBOTHEDGE`: `TABPARTS` = 8;
public const val `TABP_TOPTABITEMLEFTEDGE`: `TABPARTS` = 6;
public const val `TABP_TOPTABITEMRIGHTEDGE`: `TABPARTS` = 7;
public typealias `TABSTATES` = Int;
public typealias `TAB_CONTROL_ITEM_STATE` = UInt;
public const val `TAPF_ALLOWCOLLECTION`: `TA_PROPERTY_FLAG` = 4;
public const val `TAPF_HASBACKGROUND`: `TA_PROPERTY_FLAG` = 8;
public const val `TAPF_HASPERSPECTIVE`: `TA_PROPERTY_FLAG` = 16;
public const val `TAPF_HASSTAGGER`: `TA_PROPERTY_FLAG` = 1;
public const val `TAPF_ISRTLAWARE`: `TA_PROPERTY_FLAG` = 2;
public const val `TAPF_NONE`: `TA_PROPERTY_FLAG` = 0;
public const val `TAP_FLAGS`: `TA_PROPERTY` = 0;
public const val `TAP_STAGGERDELAY`: `TA_PROPERTY` = 2;
public const val `TAP_STAGGERDELAYCAP`: `TA_PROPERTY` = 3;
public const val `TAP_STAGGERDELAYFACTOR`: `TA_PROPERTY` = 4;
public const val `TAP_TRANSFORMCOUNT`: `TA_PROPERTY` = 1;
public const val `TAP_ZORDER`: `TA_PROPERTY` = 5;
public typealias `TASKBANDPARTS` = Int;
public typealias `TASKBARPARTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TASKDIALOGCONFIG` (
    public var `cbSize`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `dwFlags`: `TASKDIALOG_FLAGS`,
    public var `dwCommonButtons`: `TASKDIALOG_COMMON_BUTTON_FLAGS`,
    public var `pszWindowTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `Anonymous1`: `TASKDIALOGCONFIG_0`,
    public var `pszMainInstruction`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszContent`: `windows_sys`.`core`.`PCWSTR`,
    public var `cButtons`: UInt,
    public var `pButtons`: /* Rust *const */ kotlinx.cinterop.CPointer<`TASKDIALOG_BUTTON`>?,
    public var `nDefaultButton`: Int,
    public var `cRadioButtons`: UInt,
    public var `pRadioButtons`: /* Rust *const */ kotlinx.cinterop.CPointer<`TASKDIALOG_BUTTON`>?,
    public var `nDefaultRadioButton`: Int,
    public var `pszVerificationText`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszExpandedInformation`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszExpandedControlText`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszCollapsedControlText`: `windows_sys`.`core`.`PCWSTR`,
    public var `Anonymous2`: `TASKDIALOGCONFIG_1`,
    public var `pszFooter`: `windows_sys`.`core`.`PCWSTR`,
    public var `pfCallback`: `PFTASKDIALOGCALLBACK`,
    public var `lpCallbackData`: Long,
    public var `cxWidth`: UInt,
)
// UNSUPPORTED Rust 5903:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for TASKDIALOGCONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5909:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union TASKDIALOGCONFIG_0 {
//     pub hMainIcon: super::WindowsAndMessaging::HICON,
//     pub pszMainIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for TASKDIALOGCONFIG_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5922:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union TASKDIALOGCONFIG_1 {
//     pub hFooterIcon: super::WindowsAndMessaging::HICON,
//     pub pszFooterIcon: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5929:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for TASKDIALOGCONFIG_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TASKDIALOGPARTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TASKDIALOG_BUTTON` (
    public var `nButtonID`: Int,
    public var `pszButtonText`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 5942:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TASKDIALOG_BUTTON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TASKDIALOG_COMMON_BUTTON_FLAGS` = Int;
public typealias `TASKDIALOG_ELEMENTS` = Int;
public typealias `TASKDIALOG_FLAGS` = Int;
public typealias `TASKDIALOG_ICON_ELEMENTS` = Int;
public typealias `TASKDIALOG_MESSAGES` = Int;
public typealias `TASKDIALOG_NOTIFICATIONS` = Int;
public typealias `TASKLINKSTATES` = Int;
public const val `TATF_HASINITIALVALUES`: `TA_TRANSFORM_FLAG` = 2;
public const val `TATF_HASORIGINVALUES`: `TA_TRANSFORM_FLAG` = 4;
public const val `TATF_NONE`: `TA_TRANSFORM_FLAG` = 0;
public const val `TATF_TARGETVALUES_USER`: `TA_TRANSFORM_FLAG` = 1;
public const val `TATT_CLIP`: `TA_TRANSFORM_TYPE` = 3;
public const val `TATT_OPACITY`: `TA_TRANSFORM_TYPE` = 2;
public const val `TATT_SCALE_2D`: `TA_TRANSFORM_TYPE` = 1;
public const val `TATT_TRANSLATE_2D`: `TA_TRANSFORM_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TA_CUBIC_BEZIER` (
    public var `header`: `TA_TIMINGFUNCTION`,
    public var `rX0`: Float,
    public var `rY0`: Float,
    public var `rX1`: Float,
    public var `rY1`: Float,
)
public typealias `TA_PROPERTY` = Int;
public typealias `TA_PROPERTY_FLAG` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TA_TIMINGFUNCTION` (
    public var `eTimingFunctionType`: `TA_TIMINGFUNCTION_TYPE`,
)
public typealias `TA_TIMINGFUNCTION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TA_TRANSFORM` (
    public var `eTransformType`: `TA_TRANSFORM_TYPE`,
    public var `dwTimingFunctionId`: UInt,
    public var `dwStartTime`: UInt,
    public var `dwDurationTime`: UInt,
    public var `eFlags`: `TA_TRANSFORM_FLAG`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TA_TRANSFORM_2D` (
    public var `header`: `TA_TRANSFORM`,
    public var `rX`: Float,
    public var `rY`: Float,
    public var `rInitialX`: Float,
    public var `rInitialY`: Float,
    public var `rOriginX`: Float,
    public var `rOriginY`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TA_TRANSFORM_CLIP` (
    public var `header`: `TA_TRANSFORM`,
    public var `rLeft`: Float,
    public var `rTop`: Float,
    public var `rRight`: Float,
    public var `rBottom`: Float,
    public var `rInitialLeft`: Float,
    public var `rInitialTop`: Float,
    public var `rInitialRight`: Float,
    public var `rInitialBottom`: Float,
)
public typealias `TA_TRANSFORM_FLAG` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TA_TRANSFORM_OPACITY` (
    public var `header`: `TA_TRANSFORM`,
    public var `rOpacity`: Float,
    public var `rInitialOpacity`: Float,
)
public typealias `TA_TRANSFORM_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBADDBITMAP` (
    public var `hInst`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `nID`: ULong,
)
// UNSUPPORTED Rust 6027:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TBADDBITMAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TBBF_LARGE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBBUTTON` (
    public var `iBitmap`: Int,
    public var `idCommand`: Int,
    public var `fsState`: UByte,
    public var `fsStyle`: UByte,
    public var `bReserved`: UByteArray,
    public var `dwData`: ULong,
    public var `iString`: Long,
)
// UNSUPPORTED Rust 6045:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for TBBUTTON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBBUTTON` (
    public var `iBitmap`: Int,
    public var `idCommand`: Int,
    public var `fsState`: UByte,
    public var `fsStyle`: UByte,
    public var `bReserved`: UByteArray,
    public var `dwData`: ULong,
    public var `iString`: Long,
)
// UNSUPPORTED Rust 6063:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for TBBUTTON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBBUTTONINFOA` (
    public var `cbSize`: UInt,
    public var `dwMask`: `TBBUTTONINFOW_MASK`,
    public var `idCommand`: Int,
    public var `iImage`: Int,
    public var `fsState`: UByte,
    public var `fsStyle`: UByte,
    public var `cx`: UShort,
    public var `lParam`: ULong,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchText`: Int,
)
// UNSUPPORTED Rust 6083:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TBBUTTONINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBBUTTONINFOW` (
    public var `cbSize`: UInt,
    public var `dwMask`: `TBBUTTONINFOW_MASK`,
    public var `idCommand`: Int,
    public var `iImage`: Int,
    public var `fsState`: UByte,
    public var `fsStyle`: UByte,
    public var `cx`: UShort,
    public var `lParam`: ULong,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchText`: Int,
)
// UNSUPPORTED Rust 6102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TBBUTTONINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TBBUTTONINFOW_MASK` = UInt;
public const val `TBCDRF_BLENDICON`: UInt = 2097152u;
public const val `TBCDRF_HILITEHOTTRACK`: UInt = 131072u;
public const val `TBCDRF_NOBACKGROUND`: UInt = 4194304u;
public const val `TBCDRF_NOEDGES`: UInt = 65536u;
public const val `TBCDRF_NOETCHEDEFFECT`: UInt = 1048576u;
public const val `TBCDRF_NOMARK`: UInt = 524288u;
public const val `TBCDRF_NOOFFSET`: UInt = 262144u;
public const val `TBCDRF_USECDCOLORS`: UInt = 8388608u;
public const val `TBCD_CHANNEL`: UInt = 3u;
public const val `TBCD_THUMB`: UInt = 2u;
public const val `TBCD_TICS`: UInt = 1u;
public const val `TBDDRET_DEFAULT`: UInt = 0u;
public const val `TBDDRET_NODEFAULT`: UInt = 1u;
public const val `TBDDRET_TREATPRESSED`: UInt = 2u;
public const val `TBIF_BYINDEX`: `TBBUTTONINFOW_MASK` = 2147483648u;
public const val `TBIF_COMMAND`: `TBBUTTONINFOW_MASK` = 32u;
public const val `TBIF_IMAGE`: `TBBUTTONINFOW_MASK` = 1u;
public const val `TBIF_LPARAM`: `TBBUTTONINFOW_MASK` = 16u;
public const val `TBIF_SIZE`: `TBBUTTONINFOW_MASK` = 64u;
public const val `TBIF_STATE`: `TBBUTTONINFOW_MASK` = 4u;
public const val `TBIF_STYLE`: `TBBUTTONINFOW_MASK` = 8u;
public const val `TBIF_TEXT`: `TBBUTTONINFOW_MASK` = 2u;
public const val `TBIMHT_AFTER`: `TBINSERTMARK_FLAGS` = 1u;
public const val `TBIMHT_BACKGROUND`: `TBINSERTMARK_FLAGS` = 2u;
public const val `TBIMHT_NONE`: `TBINSERTMARK_FLAGS` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TBINSERTMARK` (
    public var `iButton`: Int,
    public var `dwFlags`: `TBINSERTMARK_FLAGS`,
)
public typealias `TBINSERTMARK_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TBMETRICS` (
    public var `cbSize`: UInt,
    public var `dwMask`: UInt,
    public var `cxPad`: Int,
    public var `cyPad`: Int,
    public var `cxBarPad`: Int,
    public var `cyBarPad`: Int,
    public var `cxButtonSpacing`: Int,
    public var `cyButtonSpacing`: Int,
)
public const val `TBMF_BARPAD`: UInt = 2u;
public const val `TBMF_BUTTONSPACING`: UInt = 4u;
public const val `TBMF_PAD`: UInt = 1u;
public const val `TBM_CLEARSEL`: UInt = 1043u;
public const val `TBM_CLEARTICS`: UInt = 1033u;
public const val `TBM_GETBUDDY`: UInt = 1057u;
public const val `TBM_GETCHANNELRECT`: UInt = 1050u;
public const val `TBM_GETLINESIZE`: UInt = 1048u;
public const val `TBM_GETNUMTICS`: UInt = 1040u;
public const val `TBM_GETPAGESIZE`: UInt = 1046u;
public const val `TBM_GETPTICS`: UInt = 1038u;
public const val `TBM_GETRANGEMAX`: UInt = 1026u;
public const val `TBM_GETRANGEMIN`: UInt = 1025u;
public const val `TBM_GETSELEND`: UInt = 1042u;
public const val `TBM_GETSELSTART`: UInt = 1041u;
public const val `TBM_GETTHUMBLENGTH`: UInt = 1052u;
public const val `TBM_GETTHUMBRECT`: UInt = 1049u;
public const val `TBM_GETTIC`: UInt = 1027u;
public const val `TBM_GETTICPOS`: UInt = 1039u;
public const val `TBM_GETTOOLTIPS`: UInt = 1054u;
public const val `TBM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `TBM_SETBUDDY`: UInt = 1056u;
public const val `TBM_SETLINESIZE`: UInt = 1047u;
public const val `TBM_SETPAGESIZE`: UInt = 1045u;
public const val `TBM_SETPOS`: UInt = 1029u;
public const val `TBM_SETPOSNOTIFY`: UInt = 1058u;
public const val `TBM_SETRANGE`: UInt = 1030u;
public const val `TBM_SETRANGEMAX`: UInt = 1032u;
public const val `TBM_SETRANGEMIN`: UInt = 1031u;
public const val `TBM_SETSEL`: UInt = 1034u;
public const val `TBM_SETSELEND`: UInt = 1036u;
public const val `TBM_SETSELSTART`: UInt = 1035u;
public const val `TBM_SETTHUMBLENGTH`: UInt = 1051u;
public const val `TBM_SETTIC`: UInt = 1028u;
public const val `TBM_SETTICFREQ`: UInt = 1044u;
public const val `TBM_SETTIPSIDE`: UInt = 1055u;
public const val `TBM_SETTOOLTIPS`: UInt = 1053u;
public const val `TBM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `TBNF_DI_SETITEM`: `NMTBDISPINFOW_MASK` = 268435456u;
public const val `TBNF_IMAGE`: `NMTBDISPINFOW_MASK` = 1u;
public const val `TBNF_TEXT`: `NMTBDISPINFOW_MASK` = 2u;
public const val `TBNRF_ENDCUSTOMIZE`: UInt = 2u;
public const val `TBNRF_HIDEHELP`: UInt = 1u;
public const val `TBN_BEGINADJUST`: UInt = 4294966593u;
public const val `TBN_BEGINDRAG`: UInt = 4294966595u;
public const val `TBN_CUSTHELP`: UInt = 4294966587u;
public const val `TBN_DELETINGBUTTON`: UInt = 4294966581u;
public const val `TBN_DRAGOUT`: UInt = 4294966582u;
public const val `TBN_DRAGOVER`: UInt = 4294966569u;
public const val `TBN_DROPDOWN`: UInt = 4294966586u;
public const val `TBN_DUPACCELERATOR`: UInt = 4294966571u;
public const val `TBN_ENDADJUST`: UInt = 4294966592u;
public const val `TBN_ENDDRAG`: UInt = 4294966594u;
public const val `TBN_FIRST`: UInt = 4294966596u;
public const val `TBN_GETBUTTONINFO`: UInt = 4294966576u;
public const val `TBN_GETBUTTONINFOA`: UInt = 4294966596u;
public const val `TBN_GETBUTTONINFOW`: UInt = 4294966576u;
public const val `TBN_GETDISPINFO`: UInt = 4294966579u;
public const val `TBN_GETDISPINFOA`: UInt = 4294966580u;
public const val `TBN_GETDISPINFOW`: UInt = 4294966579u;
public const val `TBN_GETINFOTIP`: UInt = 4294966577u;
public const val `TBN_GETINFOTIPA`: UInt = 4294966578u;
public const val `TBN_GETINFOTIPW`: UInt = 4294966577u;
public const val `TBN_GETOBJECT`: UInt = 4294966584u;
public const val `TBN_HOTITEMCHANGE`: UInt = 4294966583u;
public const val `TBN_INITCUSTOMIZE`: UInt = 4294966573u;
public const val `TBN_LAST`: UInt = 4294966576u;
public const val `TBN_MAPACCELERATOR`: UInt = 4294966568u;
public const val `TBN_QUERYDELETE`: UInt = 4294966589u;
public const val `TBN_QUERYINSERT`: UInt = 4294966590u;
public const val `TBN_RESET`: UInt = 4294966591u;
public const val `TBN_RESTORE`: UInt = 4294966575u;
public const val `TBN_SAVE`: UInt = 4294966574u;
public const val `TBN_TOOLBARCHANGE`: UInt = 4294966588u;
public const val `TBN_WRAPACCELERATOR`: UInt = 4294966570u;
public const val `TBN_WRAPHOTITEM`: UInt = 4294966572u;
public const val `TBP_BACKGROUNDBOTTOM`: `TASKBARPARTS` = 1;
public const val `TBP_BACKGROUNDLEFT`: `TASKBARPARTS` = 4;
public const val `TBP_BACKGROUNDRIGHT`: `TASKBARPARTS` = 2;
public const val `TBP_BACKGROUNDTOP`: `TASKBARPARTS` = 3;
public const val `TBP_SIZINGBARBOTTOM`: `TASKBARPARTS` = 5;
public const val `TBP_SIZINGBARLEFT`: `TASKBARPARTS` = 8;
public const val `TBP_SIZINGBARRIGHT`: `TASKBARPARTS` = 6;
public const val `TBP_SIZINGBARTOP`: `TASKBARPARTS` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBREPLACEBITMAP` (
    public var `hInstOld`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `nIDOld`: ULong,
    public var `hInstNew`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `nIDNew`: ULong,
    public var `nButtons`: Int,
)
// UNSUPPORTED Rust 6245:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TBREPLACEBITMAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBSAVEPARAMSA` (
    public var `hkr`: `super`.`super`.`System`.`Registry`.`HKEY`,
    public var `pszSubKey`: `windows_sys`.`core`.`PCSTR`,
    public var `pszValueName`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 6258:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for TBSAVEPARAMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBSAVEPARAMSW` (
    public var `hkr`: `super`.`super`.`System`.`Registry`.`HKEY`,
    public var `pszSubKey`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszValueName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 6272:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for TBSAVEPARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TBSTATE_CHECKED`: UInt = 1u;
public const val `TBSTATE_ELLIPSES`: UInt = 64u;
public const val `TBSTATE_ENABLED`: UInt = 4u;
public const val `TBSTATE_HIDDEN`: UInt = 8u;
public const val `TBSTATE_INDETERMINATE`: UInt = 16u;
public const val `TBSTATE_MARKED`: UInt = 128u;
public const val `TBSTATE_PRESSED`: UInt = 2u;
public const val `TBSTATE_WRAP`: UInt = 32u;
public const val `TBSTYLE_ALTDRAG`: UInt = 1024u;
public const val `TBSTYLE_AUTOSIZE`: UInt = 16u;
public const val `TBSTYLE_BUTTON`: UInt = 0u;
public const val `TBSTYLE_CHECK`: UInt = 2u;
public const val `TBSTYLE_CUSTOMERASE`: UInt = 8192u;
public const val `TBSTYLE_DROPDOWN`: UInt = 8u;
public const val `TBSTYLE_EX_DOUBLEBUFFER`: UInt = 128u;
public const val `TBSTYLE_EX_DRAWDDARROWS`: UInt = 1u;
public const val `TBSTYLE_EX_HIDECLIPPEDBUTTONS`: UInt = 16u;
public const val `TBSTYLE_EX_MIXEDBUTTONS`: UInt = 8u;
public const val `TBSTYLE_EX_MULTICOLUMN`: UInt = 2u;
public const val `TBSTYLE_EX_VERTICAL`: UInt = 4u;
public const val `TBSTYLE_FLAT`: UInt = 2048u;
public const val `TBSTYLE_GROUP`: UInt = 4u;
public const val `TBSTYLE_LIST`: UInt = 4096u;
public const val `TBSTYLE_NOPREFIX`: UInt = 32u;
public const val `TBSTYLE_REGISTERDROP`: UInt = 16384u;
public const val `TBSTYLE_SEP`: UInt = 1u;
public const val `TBSTYLE_TOOLTIPS`: UInt = 256u;
public const val `TBSTYLE_TRANSPARENT`: UInt = 32768u;
public const val `TBSTYLE_WRAPABLE`: UInt = 512u;
public const val `TBS_AUTOTICKS`: UInt = 1u;
public const val `TBS_BOTH`: UInt = 8u;
public const val `TBS_BOTTOM`: UInt = 0u;
public const val `TBS_DOWNISLEFT`: UInt = 1024u;
public const val `TBS_ENABLESELRANGE`: UInt = 32u;
public const val `TBS_FIXEDLENGTH`: UInt = 64u;
public const val `TBS_HORZ`: UInt = 0u;
public const val `TBS_LEFT`: UInt = 4u;
public const val `TBS_NOTHUMB`: UInt = 128u;
public const val `TBS_NOTICKS`: UInt = 16u;
public const val `TBS_NOTIFYBEFOREMOVE`: UInt = 2048u;
public const val `TBS_REVERSED`: UInt = 512u;
public const val `TBS_RIGHT`: UInt = 0u;
public const val `TBS_TOOLTIPS`: UInt = 256u;
public const val `TBS_TOP`: UInt = 4u;
public const val `TBS_TRANSPARENTBKGND`: UInt = 4096u;
public const val `TBS_VERT`: UInt = 2u;
public const val `TBTS_BOTTOM`: UInt = 2u;
public const val `TBTS_LEFT`: UInt = 1u;
public const val `TBTS_RIGHT`: UInt = 3u;
public const val `TBTS_TOP`: UInt = 0u;
public const val `TB_ADDBITMAP`: UInt = 1043u;
public const val `TB_ADDBUTTONS`: UInt = 1092u;
public const val `TB_ADDBUTTONSA`: UInt = 1044u;
public const val `TB_ADDBUTTONSW`: UInt = 1092u;
public const val `TB_ADDSTRING`: UInt = 1101u;
public const val `TB_ADDSTRINGA`: UInt = 1052u;
public const val `TB_ADDSTRINGW`: UInt = 1101u;
public const val `TB_AUTOSIZE`: UInt = 1057u;
public const val `TB_BOTTOM`: UInt = 7u;
public const val `TB_BUTTONCOUNT`: UInt = 1048u;
public const val `TB_BUTTONSTRUCTSIZE`: UInt = 1054u;
public const val `TB_CHANGEBITMAP`: UInt = 1067u;
public const val `TB_CHECKBUTTON`: UInt = 1026u;
public const val `TB_COMMANDTOINDEX`: UInt = 1049u;
public const val `TB_CUSTOMIZE`: UInt = 1051u;
public const val `TB_DELETEBUTTON`: UInt = 1046u;
public const val `TB_ENABLEBUTTON`: UInt = 1025u;
public const val `TB_ENDTRACK`: UInt = 8u;
public const val `TB_GETANCHORHIGHLIGHT`: UInt = 1098u;
public const val `TB_GETBITMAP`: UInt = 1068u;
public const val `TB_GETBITMAPFLAGS`: UInt = 1065u;
public const val `TB_GETBUTTON`: UInt = 1047u;
public const val `TB_GETBUTTONINFO`: UInt = 1087u;
public const val `TB_GETBUTTONINFOA`: UInt = 1089u;
public const val `TB_GETBUTTONINFOW`: UInt = 1087u;
public const val `TB_GETBUTTONSIZE`: UInt = 1082u;
public const val `TB_GETBUTTONTEXT`: UInt = 1099u;
public const val `TB_GETBUTTONTEXTA`: UInt = 1069u;
public const val `TB_GETBUTTONTEXTW`: UInt = 1099u;
public const val `TB_GETCOLORSCHEME`: UInt = 8195u;
public const val `TB_GETDISABLEDIMAGELIST`: UInt = 1079u;
public const val `TB_GETEXTENDEDSTYLE`: UInt = 1109u;
public const val `TB_GETHOTIMAGELIST`: UInt = 1077u;
public const val `TB_GETHOTITEM`: UInt = 1095u;
public const val `TB_GETIDEALSIZE`: UInt = 1123u;
public const val `TB_GETIMAGELIST`: UInt = 1073u;
public const val `TB_GETIMAGELISTCOUNT`: UInt = 1122u;
public const val `TB_GETINSERTMARK`: UInt = 1103u;
public const val `TB_GETINSERTMARKCOLOR`: UInt = 1113u;
public const val `TB_GETITEMDROPDOWNRECT`: UInt = 1127u;
public const val `TB_GETITEMRECT`: UInt = 1053u;
public const val `TB_GETMAXSIZE`: UInt = 1107u;
public const val `TB_GETMETRICS`: UInt = 1125u;
public const val `TB_GETOBJECT`: UInt = 1086u;
public const val `TB_GETPADDING`: UInt = 1110u;
public const val `TB_GETPRESSEDIMAGELIST`: UInt = 1129u;
public const val `TB_GETRECT`: UInt = 1075u;
public const val `TB_GETROWS`: UInt = 1064u;
public const val `TB_GETSTATE`: UInt = 1042u;
public const val `TB_GETSTRING`: UInt = 1115u;
public const val `TB_GETSTRINGA`: UInt = 1116u;
public const val `TB_GETSTRINGW`: UInt = 1115u;
public const val `TB_GETSTYLE`: UInt = 1081u;
public const val `TB_GETTEXTROWS`: UInt = 1085u;
public const val `TB_GETTOOLTIPS`: UInt = 1059u;
public const val `TB_GETUNICODEFORMAT`: UInt = 8198u;
public const val `TB_HASACCELERATOR`: UInt = 1119u;
public const val `TB_HIDEBUTTON`: UInt = 1028u;
public const val `TB_HITTEST`: UInt = 1093u;
public const val `TB_INDETERMINATE`: UInt = 1029u;
public const val `TB_INSERTBUTTON`: UInt = 1091u;
public const val `TB_INSERTBUTTONA`: UInt = 1045u;
public const val `TB_INSERTBUTTONW`: UInt = 1091u;
public const val `TB_INSERTMARKHITTEST`: UInt = 1105u;
public const val `TB_ISBUTTONCHECKED`: UInt = 1034u;
public const val `TB_ISBUTTONENABLED`: UInt = 1033u;
public const val `TB_ISBUTTONHIDDEN`: UInt = 1036u;
public const val `TB_ISBUTTONHIGHLIGHTED`: UInt = 1038u;
public const val `TB_ISBUTTONINDETERMINATE`: UInt = 1037u;
public const val `TB_ISBUTTONPRESSED`: UInt = 1035u;
public const val `TB_LINEDOWN`: UInt = 1u;
public const val `TB_LINEUP`: UInt = 0u;
public const val `TB_LOADIMAGES`: UInt = 1074u;
public const val `TB_MAPACCELERATOR`: UInt = 1114u;
public const val `TB_MAPACCELERATORA`: UInt = 1102u;
public const val `TB_MAPACCELERATORW`: UInt = 1114u;
public const val `TB_MARKBUTTON`: UInt = 1030u;
public const val `TB_MOVEBUTTON`: UInt = 1106u;
public const val `TB_PAGEDOWN`: UInt = 3u;
public const val `TB_PAGEUP`: UInt = 2u;
public const val `TB_PRESSBUTTON`: UInt = 1027u;
public const val `TB_REPLACEBITMAP`: UInt = 1070u;
public const val `TB_SAVERESTORE`: UInt = 1100u;
public const val `TB_SAVERESTOREA`: UInt = 1050u;
public const val `TB_SAVERESTOREW`: UInt = 1100u;
public const val `TB_SETANCHORHIGHLIGHT`: UInt = 1097u;
public const val `TB_SETBITMAPSIZE`: UInt = 1056u;
public const val `TB_SETBOUNDINGSIZE`: UInt = 1117u;
public const val `TB_SETBUTTONINFO`: UInt = 1088u;
public const val `TB_SETBUTTONINFOA`: UInt = 1090u;
public const val `TB_SETBUTTONINFOW`: UInt = 1088u;
public const val `TB_SETBUTTONSIZE`: UInt = 1055u;
public const val `TB_SETBUTTONWIDTH`: UInt = 1083u;
public const val `TB_SETCMDID`: UInt = 1066u;
public const val `TB_SETCOLORSCHEME`: UInt = 8194u;
public const val `TB_SETDISABLEDIMAGELIST`: UInt = 1078u;
public const val `TB_SETDRAWTEXTFLAGS`: UInt = 1094u;
public const val `TB_SETEXTENDEDSTYLE`: UInt = 1108u;
public const val `TB_SETHOTIMAGELIST`: UInt = 1076u;
public const val `TB_SETHOTITEM`: UInt = 1096u;
public const val `TB_SETHOTITEM2`: UInt = 1118u;
public const val `TB_SETIMAGELIST`: UInt = 1072u;
public const val `TB_SETINDENT`: UInt = 1071u;
public const val `TB_SETINSERTMARK`: UInt = 1104u;
public const val `TB_SETINSERTMARKCOLOR`: UInt = 1112u;
public const val `TB_SETLISTGAP`: UInt = 1120u;
public const val `TB_SETMAXTEXTROWS`: UInt = 1084u;
public const val `TB_SETMETRICS`: UInt = 1126u;
public const val `TB_SETPADDING`: UInt = 1111u;
public const val `TB_SETPARENT`: UInt = 1061u;
public const val `TB_SETPRESSEDIMAGELIST`: UInt = 1128u;
public const val `TB_SETROWS`: UInt = 1063u;
public const val `TB_SETSTATE`: UInt = 1041u;
public const val `TB_SETSTYLE`: UInt = 1080u;
public const val `TB_SETTOOLTIPS`: UInt = 1060u;
public const val `TB_SETUNICODEFORMAT`: UInt = 8197u;
public const val `TB_SETWINDOWTHEME`: UInt = 8203u;
public const val `TB_THUMBPOSITION`: UInt = 4u;
public const val `TB_THUMBTRACK`: UInt = 5u;
public const val `TB_TOP`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCHITTESTINFO` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `flags`: `TCHITTESTINFO_FLAGS`,
)
public typealias `TCHITTESTINFO_FLAGS` = UInt;
public const val `TCHT_NOWHERE`: `TCHITTESTINFO_FLAGS` = 1u;
public const val `TCHT_ONITEM`: `TCHITTESTINFO_FLAGS` = 6u;
public const val `TCHT_ONITEMICON`: `TCHITTESTINFO_FLAGS` = 2u;
public const val `TCHT_ONITEMLABEL`: `TCHITTESTINFO_FLAGS` = 4u;
public const val `TCIF_IMAGE`: `TCITEMHEADERA_MASK` = 2u;
public const val `TCIF_PARAM`: `TCITEMHEADERA_MASK` = 8u;
public const val `TCIF_RTLREADING`: `TCITEMHEADERA_MASK` = 4u;
public const val `TCIF_STATE`: `TCITEMHEADERA_MASK` = 16u;
public const val `TCIF_TEXT`: `TCITEMHEADERA_MASK` = 1u;
public const val `TCIS_BUTTONPRESSED`: `TAB_CONTROL_ITEM_STATE` = 1u;
public const val `TCIS_HIGHLIGHTED`: `TAB_CONTROL_ITEM_STATE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCITEMA` (
    public var `mask`: `TCITEMHEADERA_MASK`,
    public var `dwState`: `TAB_CONTROL_ITEM_STATE`,
    public var `dwStateMask`: `TAB_CONTROL_ITEM_STATE`,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 6477:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCITEMHEADERA` (
    public var `mask`: `TCITEMHEADERA_MASK`,
    public var `lpReserved1`: UInt,
    public var `lpReserved2`: UInt,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
)
// UNSUPPORTED Rust 6492:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCITEMHEADERA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TCITEMHEADERA_MASK` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCITEMHEADERW` (
    public var `mask`: `TCITEMHEADERA_MASK`,
    public var `lpReserved1`: UInt,
    public var `lpReserved2`: UInt,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
)
// UNSUPPORTED Rust 6508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCITEMHEADERW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCITEMW` (
    public var `mask`: `TCITEMHEADERA_MASK`,
    public var `dwState`: `TAB_CONTROL_ITEM_STATE`,
    public var `dwStateMask`: `TAB_CONTROL_ITEM_STATE`,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 6524:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TCM_ADJUSTRECT`: UInt = 4904u;
public const val `TCM_DELETEALLITEMS`: UInt = 4873u;
public const val `TCM_DELETEITEM`: UInt = 4872u;
public const val `TCM_DESELECTALL`: UInt = 4914u;
public const val `TCM_FIRST`: UInt = 4864u;
public const val `TCM_GETCURFOCUS`: UInt = 4911u;
public const val `TCM_GETCURSEL`: UInt = 4875u;
public const val `TCM_GETEXTENDEDSTYLE`: UInt = 4917u;
public const val `TCM_GETIMAGELIST`: UInt = 4866u;
public const val `TCM_GETITEM`: UInt = 4924u;
public const val `TCM_GETITEMA`: UInt = 4869u;
public const val `TCM_GETITEMCOUNT`: UInt = 4868u;
public const val `TCM_GETITEMRECT`: UInt = 4874u;
public const val `TCM_GETITEMW`: UInt = 4924u;
public const val `TCM_GETROWCOUNT`: UInt = 4908u;
public const val `TCM_GETTOOLTIPS`: UInt = 4909u;
public const val `TCM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `TCM_HIGHLIGHTITEM`: UInt = 4915u;
public const val `TCM_HITTEST`: UInt = 4877u;
public const val `TCM_INSERTITEM`: UInt = 4926u;
public const val `TCM_INSERTITEMA`: UInt = 4871u;
public const val `TCM_INSERTITEMW`: UInt = 4926u;
public const val `TCM_REMOVEIMAGE`: UInt = 4906u;
public const val `TCM_SETCURFOCUS`: UInt = 4912u;
public const val `TCM_SETCURSEL`: UInt = 4876u;
public const val `TCM_SETEXTENDEDSTYLE`: UInt = 4916u;
public const val `TCM_SETIMAGELIST`: UInt = 4867u;
public const val `TCM_SETITEM`: UInt = 4925u;
public const val `TCM_SETITEMA`: UInt = 4870u;
public const val `TCM_SETITEMEXTRA`: UInt = 4878u;
public const val `TCM_SETITEMSIZE`: UInt = 4905u;
public const val `TCM_SETITEMW`: UInt = 4925u;
public const val `TCM_SETMINTABWIDTH`: UInt = 4913u;
public const val `TCM_SETPADDING`: UInt = 4907u;
public const val `TCM_SETTOOLTIPS`: UInt = 4910u;
public const val `TCM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `TCN_FIRST`: UInt = 4294966746u;
public const val `TCN_FOCUSCHANGE`: UInt = 4294966742u;
public const val `TCN_GETOBJECT`: UInt = 4294966743u;
public const val `TCN_KEYDOWN`: UInt = 4294966746u;
public const val `TCN_LAST`: UInt = 4294966716u;
public const val `TCN_SELCHANGE`: UInt = 4294966745u;
public const val `TCN_SELCHANGING`: UInt = 4294966744u;
public const val `TCS_BOTTOM`: UInt = 2u;
public const val `TCS_BUTTONS`: UInt = 256u;
public const val `TCS_EX_FLATSEPARATORS`: UInt = 1u;
public const val `TCS_EX_REGISTERDROP`: UInt = 2u;
public const val `TCS_FIXEDWIDTH`: UInt = 1024u;
public const val `TCS_FLATBUTTONS`: UInt = 8u;
public const val `TCS_FOCUSNEVER`: UInt = 32768u;
public const val `TCS_FOCUSONBUTTONDOWN`: UInt = 4096u;
public const val `TCS_FORCEICONLEFT`: UInt = 16u;
public const val `TCS_FORCELABELLEFT`: UInt = 32u;
public const val `TCS_HOTTRACK`: UInt = 64u;
public const val `TCS_MULTILINE`: UInt = 512u;
public const val `TCS_MULTISELECT`: UInt = 4u;
public const val `TCS_OWNERDRAWFIXED`: UInt = 8192u;
public const val `TCS_RAGGEDRIGHT`: UInt = 2048u;
public const val `TCS_RIGHT`: UInt = 2u;
public const val `TCS_RIGHTJUSTIFY`: UInt = 0u;
public const val `TCS_SCROLLOPPOSITE`: UInt = 1u;
public const val `TCS_SINGLELINE`: UInt = 0u;
public const val `TCS_TABS`: UInt = 0u;
public const val `TCS_TOOLTIPS`: UInt = 16384u;
public const val `TCS_VERTICAL`: UInt = 128u;
public const val `TDCBF_ABORT_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 65536;
public const val `TDCBF_CANCEL_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 8;
public const val `TDCBF_CLOSE_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 32;
public const val `TDCBF_CONTINUE_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 524288;
public const val `TDCBF_HELP_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 1048576;
public const val `TDCBF_IGNORE_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 131072;
public const val `TDCBF_NO_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 4;
public const val `TDCBF_OK_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 1;
public const val `TDCBF_RETRY_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 16;
public const val `TDCBF_TRYAGAIN_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 262144;
public const val `TDCBF_YES_BUTTON`: `TASKDIALOG_COMMON_BUTTON_FLAGS` = 2;
public const val `TDE_CONTENT`: `TASKDIALOG_ELEMENTS` = 0;
public const val `TDE_EXPANDED_INFORMATION`: `TASKDIALOG_ELEMENTS` = 1;
public const val `TDE_FOOTER`: `TASKDIALOG_ELEMENTS` = 2;
public const val `TDE_MAIN_INSTRUCTION`: `TASKDIALOG_ELEMENTS` = 3;
public const val `TDF_ALLOW_DIALOG_CANCELLATION`: `TASKDIALOG_FLAGS` = 8;
public const val `TDF_CALLBACK_TIMER`: `TASKDIALOG_FLAGS` = 2048;
public const val `TDF_CAN_BE_MINIMIZED`: `TASKDIALOG_FLAGS` = 32768;
public const val `TDF_ENABLE_HYPERLINKS`: `TASKDIALOG_FLAGS` = 1;
public const val `TDF_EXPANDED_BY_DEFAULT`: `TASKDIALOG_FLAGS` = 128;
public const val `TDF_EXPAND_FOOTER_AREA`: `TASKDIALOG_FLAGS` = 64;
public const val `TDF_NO_DEFAULT_RADIO_BUTTON`: `TASKDIALOG_FLAGS` = 16384;
public const val `TDF_NO_SET_FOREGROUND`: `TASKDIALOG_FLAGS` = 65536;
public const val `TDF_POSITION_RELATIVE_TO_WINDOW`: `TASKDIALOG_FLAGS` = 4096;
public const val `TDF_RTL_LAYOUT`: `TASKDIALOG_FLAGS` = 8192;
public const val `TDF_SHOW_MARQUEE_PROGRESS_BAR`: `TASKDIALOG_FLAGS` = 1024;
public const val `TDF_SHOW_PROGRESS_BAR`: `TASKDIALOG_FLAGS` = 512;
public const val `TDF_SIZE_TO_CONTENT`: `TASKDIALOG_FLAGS` = 16777216;
public const val `TDF_USE_COMMAND_LINKS`: `TASKDIALOG_FLAGS` = 16;
public const val `TDF_USE_COMMAND_LINKS_NO_ICON`: `TASKDIALOG_FLAGS` = 32;
public const val `TDF_USE_HICON_FOOTER`: `TASKDIALOG_FLAGS` = 4;
public const val `TDF_USE_HICON_MAIN`: `TASKDIALOG_FLAGS` = 2;
public const val `TDF_VERIFICATION_FLAG_CHECKED`: `TASKDIALOG_FLAGS` = 256;
public const val `TDIE_ICON_FOOTER`: `TASKDIALOG_ICON_ELEMENTS` = 1;
public const val `TDIE_ICON_MAIN`: `TASKDIALOG_ICON_ELEMENTS` = 0;
public const val `TDLGCPS_STANDALONE`: `CONTENTPANESTATES` = 1;
public const val `TDLGEBS_EXPANDEDDISABLED`: `EXPANDOBUTTONSTATES` = 8;
public const val `TDLGEBS_EXPANDEDHOVER`: `EXPANDOBUTTONSTATES` = 5;
public const val `TDLGEBS_EXPANDEDNORMAL`: `EXPANDOBUTTONSTATES` = 4;
public const val `TDLGEBS_EXPANDEDPRESSED`: `EXPANDOBUTTONSTATES` = 6;
public const val `TDLGEBS_HOVER`: `EXPANDOBUTTONSTATES` = 2;
public const val `TDLGEBS_NORMAL`: `EXPANDOBUTTONSTATES` = 1;
public const val `TDLGEBS_NORMALDISABLED`: `EXPANDOBUTTONSTATES` = 7;
public const val `TDLGEBS_PRESSED`: `EXPANDOBUTTONSTATES` = 3;
public const val `TDLG_BUTTONSECTION`: `TASKDIALOGPARTS` = 10;
public const val `TDLG_BUTTONWRAPPER`: `TASKDIALOGPARTS` = 11;
public const val `TDLG_COMMANDLINKPANE`: `TASKDIALOGPARTS` = 7;
public const val `TDLG_CONTENTICON`: `TASKDIALOGPARTS` = 5;
public const val `TDLG_CONTENTPANE`: `TASKDIALOGPARTS` = 4;
public const val `TDLG_CONTROLPANE`: `TASKDIALOGPARTS` = 9;
public const val `TDLG_EXPANDEDCONTENT`: `TASKDIALOGPARTS` = 6;
public const val `TDLG_EXPANDEDFOOTERAREA`: `TASKDIALOGPARTS` = 18;
public const val `TDLG_EXPANDOBUTTON`: `TASKDIALOGPARTS` = 13;
public const val `TDLG_EXPANDOTEXT`: `TASKDIALOGPARTS` = 12;
public const val `TDLG_FOOTNOTEAREA`: `TASKDIALOGPARTS` = 16;
public const val `TDLG_FOOTNOTEPANE`: `TASKDIALOGPARTS` = 15;
public const val `TDLG_FOOTNOTESEPARATOR`: `TASKDIALOGPARTS` = 17;
public const val `TDLG_IMAGEALIGNMENT`: `TASKDIALOGPARTS` = 20;
public const val `TDLG_MAINICON`: `TASKDIALOGPARTS` = 3;
public const val `TDLG_MAININSTRUCTIONPANE`: `TASKDIALOGPARTS` = 2;
public const val `TDLG_PRIMARYPANEL`: `TASKDIALOGPARTS` = 1;
public const val `TDLG_PROGRESSBAR`: `TASKDIALOGPARTS` = 19;
public const val `TDLG_RADIOBUTTONPANE`: `TASKDIALOGPARTS` = 21;
public const val `TDLG_SECONDARYPANEL`: `TASKDIALOGPARTS` = 8;
public const val `TDLG_VERIFICATIONTEXT`: `TASKDIALOGPARTS` = 14;
public const val `TDM_CLICK_BUTTON`: `TASKDIALOG_MESSAGES` = 1126;
public const val `TDM_CLICK_RADIO_BUTTON`: `TASKDIALOG_MESSAGES` = 1134;
public const val `TDM_CLICK_VERIFICATION`: `TASKDIALOG_MESSAGES` = 1137;
public const val `TDM_ENABLE_BUTTON`: `TASKDIALOG_MESSAGES` = 1135;
public const val `TDM_ENABLE_RADIO_BUTTON`: `TASKDIALOG_MESSAGES` = 1136;
public const val `TDM_NAVIGATE_PAGE`: `TASKDIALOG_MESSAGES` = 1125;
public const val `TDM_SET_BUTTON_ELEVATION_REQUIRED_STATE`: `TASKDIALOG_MESSAGES` = 1139;
public const val `TDM_SET_ELEMENT_TEXT`: `TASKDIALOG_MESSAGES` = 1132;
public const val `TDM_SET_MARQUEE_PROGRESS_BAR`: `TASKDIALOG_MESSAGES` = 1127;
public const val `TDM_SET_PROGRESS_BAR_MARQUEE`: `TASKDIALOG_MESSAGES` = 1131;
public const val `TDM_SET_PROGRESS_BAR_POS`: `TASKDIALOG_MESSAGES` = 1130;
public const val `TDM_SET_PROGRESS_BAR_RANGE`: `TASKDIALOG_MESSAGES` = 1129;
public const val `TDM_SET_PROGRESS_BAR_STATE`: `TASKDIALOG_MESSAGES` = 1128;
public const val `TDM_UPDATE_ELEMENT_TEXT`: `TASKDIALOG_MESSAGES` = 1138;
public const val `TDM_UPDATE_ICON`: `TASKDIALOG_MESSAGES` = 1140;
public const val `TDN_BUTTON_CLICKED`: `TASKDIALOG_NOTIFICATIONS` = 2;
public const val `TDN_CREATED`: `TASKDIALOG_NOTIFICATIONS` = 0;
public const val `TDN_DESTROYED`: `TASKDIALOG_NOTIFICATIONS` = 5;
public const val `TDN_DIALOG_CONSTRUCTED`: `TASKDIALOG_NOTIFICATIONS` = 7;
public const val `TDN_EXPANDO_BUTTON_CLICKED`: `TASKDIALOG_NOTIFICATIONS` = 10;
public const val `TDN_HELP`: `TASKDIALOG_NOTIFICATIONS` = 9;
public const val `TDN_HYPERLINK_CLICKED`: `TASKDIALOG_NOTIFICATIONS` = 3;
public const val `TDN_NAVIGATED`: `TASKDIALOG_NOTIFICATIONS` = 1;
public const val `TDN_RADIO_BUTTON_CLICKED`: `TASKDIALOG_NOTIFICATIONS` = 6;
public const val `TDN_TIMER`: `TASKDIALOG_NOTIFICATIONS` = 4;
public const val `TDN_VERIFICATION_CLICKED`: `TASKDIALOG_NOTIFICATIONS` = 8;
public const val `TDP_FLASHBUTTON`: `TASKBANDPARTS` = 2;
public const val `TDP_FLASHBUTTONGROUPMENU`: `TASKBANDPARTS` = 3;
public const val `TDP_GROUPCOUNT`: `TASKBANDPARTS` = 1;
// UNSUPPORTED Rust 6688:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const TD_ERROR_ICON: windows_sys::core::PCWSTR = 65534u16 as _;

// UNSUPPORTED Rust 6689:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const TD_INFORMATION_ICON: windows_sys::core::PCWSTR = 65533u16 as _;

// UNSUPPORTED Rust 6690:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const TD_SHIELD_ICON: windows_sys::core::PCWSTR = 65532u16 as _;

// UNSUPPORTED Rust 6691:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const TD_WARNING_ICON: windows_sys::core::PCWSTR = 65535u16 as _;

public typealias `TEXTSELECTIONGRIPPERPARTS` = Int;
public typealias `TEXTSHADOWTYPE` = Int;
public typealias `TEXTSTYLEPARTS` = Int;
public const val `TEXT_BODYTEXT`: `TEXTSTYLEPARTS` = 4;
public const val `TEXT_BODYTITLE`: `TEXTSTYLEPARTS` = 3;
public const val `TEXT_CONTROLLABEL`: `TEXTSTYLEPARTS` = 9;
public const val `TEXT_EXPANDED`: `TEXTSTYLEPARTS` = 7;
public const val `TEXT_HYPERLINKTEXT`: `TEXTSTYLEPARTS` = 6;
public const val `TEXT_INSTRUCTION`: `TEXTSTYLEPARTS` = 2;
public const val `TEXT_LABEL`: `TEXTSTYLEPARTS` = 8;
public const val `TEXT_MAININSTRUCTION`: `TEXTSTYLEPARTS` = 1;
public const val `TEXT_SECONDARYTEXT`: `TEXTSTYLEPARTS` = 5;
public typealias `THEMESIZE` = Int;
public typealias `THEME_PROPERTY_SYMBOL_ID` = UInt;
public typealias `THUMBBOTTOMSTATES` = Int;
public typealias `THUMBLEFTSTATES` = Int;
public typealias `THUMBRIGHTSTATES` = Int;
public typealias `THUMBSTATES` = Int;
public typealias `THUMBTOPSTATES` = Int;
public typealias `THUMBVERTSTATES` = Int;
public const val `TIBES_DISABLED`: `TABITEMBOTHEDGESTATES` = 4;
public const val `TIBES_FOCUSED`: `TABITEMBOTHEDGESTATES` = 5;
public const val `TIBES_HOT`: `TABITEMBOTHEDGESTATES` = 2;
public const val `TIBES_NORMAL`: `TABITEMBOTHEDGESTATES` = 1;
public const val `TIBES_SELECTED`: `TABITEMBOTHEDGESTATES` = 3;
public typealias `TICSSTATES` = Int;
public typealias `TICSVERTSTATES` = Int;
public const val `TILES_DISABLED`: `TABITEMLEFTEDGESTATES` = 4;
public const val `TILES_FOCUSED`: `TABITEMLEFTEDGESTATES` = 5;
public const val `TILES_HOT`: `TABITEMLEFTEDGESTATES` = 2;
public const val `TILES_NORMAL`: `TABITEMLEFTEDGESTATES` = 1;
public const val `TILES_SELECTED`: `TABITEMLEFTEDGESTATES` = 3;
public const val `TIRES_DISABLED`: `TABITEMRIGHTEDGESTATES` = 4;
public const val `TIRES_FOCUSED`: `TABITEMRIGHTEDGESTATES` = 5;
public const val `TIRES_HOT`: `TABITEMRIGHTEDGESTATES` = 2;
public const val `TIRES_NORMAL`: `TABITEMRIGHTEDGESTATES` = 1;
public const val `TIRES_SELECTED`: `TABITEMRIGHTEDGESTATES` = 3;
public const val `TIS_DISABLED`: `TABITEMSTATES` = 4;
public const val `TIS_FOCUSED`: `TABITEMSTATES` = 5;
public const val `TIS_HOT`: `TABITEMSTATES` = 2;
public const val `TIS_NORMAL`: `TABITEMSTATES` = 1;
public const val `TIS_SELECTED`: `TABITEMSTATES` = 3;
public typealias `TITLEBARSTATES` = Int;
public const val `TKP_THUMB`: `TRACKBARPARTS` = 3;
public const val `TKP_THUMBBOTTOM`: `TRACKBARPARTS` = 4;
public const val `TKP_THUMBLEFT`: `TRACKBARPARTS` = 7;
public const val `TKP_THUMBRIGHT`: `TRACKBARPARTS` = 8;
public const val `TKP_THUMBTOP`: `TRACKBARPARTS` = 5;
public const val `TKP_THUMBVERT`: `TRACKBARPARTS` = 6;
public const val `TKP_TICS`: `TRACKBARPARTS` = 9;
public const val `TKP_TICSVERT`: `TRACKBARPARTS` = 10;
public const val `TKP_TRACK`: `TRACKBARPARTS` = 1;
public const val `TKP_TRACKVERT`: `TRACKBARPARTS` = 2;
public const val `TKS_NORMAL`: `TRACKBARSTYLESTATES` = 1;
public const val `TMTVS_RESERVEDHIGH`: UInt = 19999u;
public const val `TMTVS_RESERVEDLOW`: UInt = 100000u;
public const val `TMT_ACCENTCOLORHINT`: `THEME_PROPERTY_SYMBOL_ID` = 3823u;
public const val `TMT_ACTIVEBORDER`: `THEME_PROPERTY_SYMBOL_ID` = 1611u;
public const val `TMT_ACTIVECAPTION`: `THEME_PROPERTY_SYMBOL_ID` = 1603u;
public const val `TMT_ALIAS`: `THEME_PROPERTY_SYMBOL_ID` = 1404u;
public const val `TMT_ALPHALEVEL`: `THEME_PROPERTY_SYMBOL_ID` = 2402u;
public const val `TMT_ALPHATHRESHOLD`: `THEME_PROPERTY_SYMBOL_ID` = 2415u;
public const val `TMT_ALWAYSSHOWSIZINGBAR`: `THEME_PROPERTY_SYMBOL_ID` = 2208u;
public const val `TMT_ANIMATIONBUTTONRECT`: `THEME_PROPERTY_SYMBOL_ID` = 5005u;
public const val `TMT_ANIMATIONDELAY`: `THEME_PROPERTY_SYMBOL_ID` = 2428u;
public const val `TMT_ANIMATIONDURATION`: `THEME_PROPERTY_SYMBOL_ID` = 5006u;
public const val `TMT_APPWORKSPACE`: `THEME_PROPERTY_SYMBOL_ID` = 1613u;
public const val `TMT_ATLASIMAGE`: `THEME_PROPERTY_SYMBOL_ID` = 8000u;
public const val `TMT_ATLASINPUTIMAGE`: `THEME_PROPERTY_SYMBOL_ID` = 8001u;
public const val `TMT_ATLASRECT`: `THEME_PROPERTY_SYMBOL_ID` = 8002u;
public const val `TMT_AUTHOR`: `THEME_PROPERTY_SYMBOL_ID` = 604u;
public const val `TMT_AUTOSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 2202u;
public const val `TMT_BACKGROUND`: `THEME_PROPERTY_SYMBOL_ID` = 1602u;
public const val `TMT_BGFILL`: `THEME_PROPERTY_SYMBOL_ID` = 2205u;
public const val `TMT_BGTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4001u;
public const val `TMT_BITMAPREF`: `THEME_PROPERTY_SYMBOL_ID` = 215u;
public const val `TMT_BLENDCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 5003u;
public const val `TMT_BODYFONT`: `THEME_PROPERTY_SYMBOL_ID` = 809u;
public const val `TMT_BODYTEXTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3827u;
public const val `TMT_BOOL`: `THEME_PROPERTY_SYMBOL_ID` = 203u;
public const val `TMT_BORDERCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3801u;
public const val `TMT_BORDERCOLORHINT`: `THEME_PROPERTY_SYMBOL_ID` = 3822u;
public const val `TMT_BORDERONLY`: `THEME_PROPERTY_SYMBOL_ID` = 2203u;
public const val `TMT_BORDERSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 2403u;
public const val `TMT_BORDERTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4002u;
public const val `TMT_BTNFACE`: `THEME_PROPERTY_SYMBOL_ID` = 1616u;
public const val `TMT_BTNHIGHLIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 1621u;
public const val `TMT_BTNSHADOW`: `THEME_PROPERTY_SYMBOL_ID` = 1617u;
public const val `TMT_BTNTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1619u;
public const val `TMT_BUTTONALTERNATEFACE`: `THEME_PROPERTY_SYMBOL_ID` = 1626u;
public const val `TMT_CAPTIONBARHEIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 1205u;
public const val `TMT_CAPTIONBARWIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 1204u;
public const val `TMT_CAPTIONFONT`: `THEME_PROPERTY_SYMBOL_ID` = 801u;
public const val `TMT_CAPTIONMARGINS`: `THEME_PROPERTY_SYMBOL_ID` = 3603u;
public const val `TMT_CAPTIONTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1610u;
public const val `TMT_CHARSET`: `THEME_PROPERTY_SYMBOL_ID` = 403u;
public const val `TMT_CLASSICVALUE`: `THEME_PROPERTY_SYMBOL_ID` = 3202u;
public const val `TMT_COLOR`: `THEME_PROPERTY_SYMBOL_ID` = 204u;
public const val `TMT_COLORIZATIONCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 2431u;
public const val `TMT_COLORIZATIONOPACITY`: `THEME_PROPERTY_SYMBOL_ID` = 2432u;
public const val `TMT_COLORSCHEMES`: `THEME_PROPERTY_SYMBOL_ID` = 401u;
public const val `TMT_COMPANY`: `THEME_PROPERTY_SYMBOL_ID` = 603u;
public const val `TMT_COMPOSITED`: `THEME_PROPERTY_SYMBOL_ID` = 2204u;
public const val `TMT_COMPOSITEDOPAQUE`: `THEME_PROPERTY_SYMBOL_ID` = 2219u;
public const val `TMT_CONTENTALIGNMENT`: `THEME_PROPERTY_SYMBOL_ID` = 4006u;
public const val `TMT_CONTENTMARGINS`: `THEME_PROPERTY_SYMBOL_ID` = 3602u;
public const val `TMT_COPYRIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 605u;
public const val `TMT_CSSNAME`: `THEME_PROPERTY_SYMBOL_ID` = 1401u;
public const val `TMT_CUSTOMSPLITRECT`: `THEME_PROPERTY_SYMBOL_ID` = 5004u;
public const val `TMT_DEFAULTPANESIZE`: `THEME_PROPERTY_SYMBOL_ID` = 5002u;
public const val `TMT_DESCRIPTION`: `THEME_PROPERTY_SYMBOL_ID` = 608u;
public const val `TMT_DIBDATA`: `THEME_PROPERTY_SYMBOL_ID` = 2u;
public const val `TMT_DISKSTREAM`: `THEME_PROPERTY_SYMBOL_ID` = 213u;
public const val `TMT_DISPLAYNAME`: `THEME_PROPERTY_SYMBOL_ID` = 601u;
public const val `TMT_DKSHADOW3D`: `THEME_PROPERTY_SYMBOL_ID` = 1622u;
public const val `TMT_DRAWBORDERS`: `THEME_PROPERTY_SYMBOL_ID` = 2214u;
public const val `TMT_EDGEDKSHADOWCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3807u;
public const val `TMT_EDGEFILLCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3808u;
public const val `TMT_EDGEHIGHLIGHTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3805u;
public const val `TMT_EDGELIGHTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3804u;
public const val `TMT_EDGESHADOWCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3806u;
public const val `TMT_ENUM`: `THEME_PROPERTY_SYMBOL_ID` = 200u;
public const val `TMT_FILENAME`: `THEME_PROPERTY_SYMBOL_ID` = 206u;
public const val `TMT_FILLCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3802u;
public const val `TMT_FILLCOLORHINT`: `THEME_PROPERTY_SYMBOL_ID` = 3821u;
public const val `TMT_FILLTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4003u;
public const val `TMT_FIRSTBOOL`: `THEME_PROPERTY_SYMBOL_ID` = 1001u;
public const val `TMT_FIRSTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 1601u;
public const val `TMT_FIRSTFONT`: `THEME_PROPERTY_SYMBOL_ID` = 801u;
public const val `TMT_FIRSTINT`: `THEME_PROPERTY_SYMBOL_ID` = 1301u;
public const val `TMT_FIRSTSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 1201u;
public const val `TMT_FIRSTSTRING`: `THEME_PROPERTY_SYMBOL_ID` = 1401u;
public const val `TMT_FIRST_RCSTRING_NAME`: `THEME_PROPERTY_SYMBOL_ID` = 601u;
public const val `TMT_FLATMENUS`: `THEME_PROPERTY_SYMBOL_ID` = 1001u;
public const val `TMT_FLOAT`: `THEME_PROPERTY_SYMBOL_ID` = 216u;
public const val `TMT_FLOATLIST`: `THEME_PROPERTY_SYMBOL_ID` = 217u;
public const val `TMT_FONT`: `THEME_PROPERTY_SYMBOL_ID` = 210u;
public const val `TMT_FRAMESPERSECOND`: `THEME_PROPERTY_SYMBOL_ID` = 2426u;
public const val `TMT_FROMCOLOR1`: `THEME_PROPERTY_SYMBOL_ID` = 2001u;
public const val `TMT_FROMCOLOR2`: `THEME_PROPERTY_SYMBOL_ID` = 2002u;
public const val `TMT_FROMCOLOR3`: `THEME_PROPERTY_SYMBOL_ID` = 2003u;
public const val `TMT_FROMCOLOR4`: `THEME_PROPERTY_SYMBOL_ID` = 2004u;
public const val `TMT_FROMCOLOR5`: `THEME_PROPERTY_SYMBOL_ID` = 2005u;
public const val `TMT_FROMHUE1`: `THEME_PROPERTY_SYMBOL_ID` = 1801u;
public const val `TMT_FROMHUE2`: `THEME_PROPERTY_SYMBOL_ID` = 1802u;
public const val `TMT_FROMHUE3`: `THEME_PROPERTY_SYMBOL_ID` = 1803u;
public const val `TMT_FROMHUE4`: `THEME_PROPERTY_SYMBOL_ID` = 1804u;
public const val `TMT_FROMHUE5`: `THEME_PROPERTY_SYMBOL_ID` = 1805u;
public const val `TMT_GLOWCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3816u;
public const val `TMT_GLOWINTENSITY`: `THEME_PROPERTY_SYMBOL_ID` = 2429u;
public const val `TMT_GLYPHDIBDATA`: `THEME_PROPERTY_SYMBOL_ID` = 8u;
public const val `TMT_GLYPHFONT`: `THEME_PROPERTY_SYMBOL_ID` = 2601u;
public const val `TMT_GLYPHFONTSIZINGTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4014u;
public const val `TMT_GLYPHIMAGEFILE`: `THEME_PROPERTY_SYMBOL_ID` = 3008u;
public const val `TMT_GLYPHINDEX`: `THEME_PROPERTY_SYMBOL_ID` = 2418u;
public const val `TMT_GLYPHONLY`: `THEME_PROPERTY_SYMBOL_ID` = 2207u;
public const val `TMT_GLYPHTEXTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3819u;
public const val `TMT_GLYPHTRANSPARENT`: `THEME_PROPERTY_SYMBOL_ID` = 2206u;
public const val `TMT_GLYPHTRANSPARENTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3820u;
public const val `TMT_GLYPHTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4012u;
public const val `TMT_GRADIENTACTIVECAPTION`: `THEME_PROPERTY_SYMBOL_ID` = 1628u;
public const val `TMT_GRADIENTCOLOR1`: `THEME_PROPERTY_SYMBOL_ID` = 3810u;
public const val `TMT_GRADIENTCOLOR2`: `THEME_PROPERTY_SYMBOL_ID` = 3811u;
public const val `TMT_GRADIENTCOLOR3`: `THEME_PROPERTY_SYMBOL_ID` = 3812u;
public const val `TMT_GRADIENTCOLOR4`: `THEME_PROPERTY_SYMBOL_ID` = 3813u;
public const val `TMT_GRADIENTCOLOR5`: `THEME_PROPERTY_SYMBOL_ID` = 3814u;
public const val `TMT_GRADIENTINACTIVECAPTION`: `THEME_PROPERTY_SYMBOL_ID` = 1629u;
public const val `TMT_GRADIENTRATIO1`: `THEME_PROPERTY_SYMBOL_ID` = 2406u;
public const val `TMT_GRADIENTRATIO2`: `THEME_PROPERTY_SYMBOL_ID` = 2407u;
public const val `TMT_GRADIENTRATIO3`: `THEME_PROPERTY_SYMBOL_ID` = 2408u;
public const val `TMT_GRADIENTRATIO4`: `THEME_PROPERTY_SYMBOL_ID` = 2409u;
public const val `TMT_GRADIENTRATIO5`: `THEME_PROPERTY_SYMBOL_ID` = 2410u;
public const val `TMT_GRAYTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1618u;
public const val `TMT_HALIGN`: `THEME_PROPERTY_SYMBOL_ID` = 4005u;
public const val `TMT_HBITMAP`: `THEME_PROPERTY_SYMBOL_ID` = 212u;
public const val `TMT_HEADING1FONT`: `THEME_PROPERTY_SYMBOL_ID` = 807u;
public const val `TMT_HEADING1TEXTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3825u;
public const val `TMT_HEADING2FONT`: `THEME_PROPERTY_SYMBOL_ID` = 808u;
public const val `TMT_HEADING2TEXTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3826u;
public const val `TMT_HEIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 2417u;
public const val `TMT_HIGHLIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 1614u;
public const val `TMT_HIGHLIGHTTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1615u;
public const val `TMT_HOTTRACKING`: `THEME_PROPERTY_SYMBOL_ID` = 1627u;
public const val `TMT_ICONEFFECT`: `THEME_PROPERTY_SYMBOL_ID` = 4009u;
public const val `TMT_ICONTITLEFONT`: `THEME_PROPERTY_SYMBOL_ID` = 806u;
public const val `TMT_IMAGECOUNT`: `THEME_PROPERTY_SYMBOL_ID` = 2401u;
public const val `TMT_IMAGEFILE`: `THEME_PROPERTY_SYMBOL_ID` = 3001u;
public const val `TMT_IMAGEFILE1`: `THEME_PROPERTY_SYMBOL_ID` = 3002u;
public const val `TMT_IMAGEFILE2`: `THEME_PROPERTY_SYMBOL_ID` = 3003u;
public const val `TMT_IMAGEFILE3`: `THEME_PROPERTY_SYMBOL_ID` = 3004u;
public const val `TMT_IMAGEFILE4`: `THEME_PROPERTY_SYMBOL_ID` = 3005u;
public const val `TMT_IMAGEFILE5`: `THEME_PROPERTY_SYMBOL_ID` = 3006u;
public const val `TMT_IMAGEFILE6`: `THEME_PROPERTY_SYMBOL_ID` = 3009u;
public const val `TMT_IMAGEFILE7`: `THEME_PROPERTY_SYMBOL_ID` = 3010u;
public const val `TMT_IMAGELAYOUT`: `THEME_PROPERTY_SYMBOL_ID` = 4011u;
public const val `TMT_IMAGESELECTTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4013u;
public const val `TMT_INACTIVEBORDER`: `THEME_PROPERTY_SYMBOL_ID` = 1612u;
public const val `TMT_INACTIVECAPTION`: `THEME_PROPERTY_SYMBOL_ID` = 1604u;
public const val `TMT_INACTIVECAPTIONTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1620u;
public const val `TMT_INFOBK`: `THEME_PROPERTY_SYMBOL_ID` = 1625u;
public const val `TMT_INFOTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1624u;
public const val `TMT_INT`: `THEME_PROPERTY_SYMBOL_ID` = 202u;
public const val `TMT_INTEGRALSIZING`: `THEME_PROPERTY_SYMBOL_ID` = 2211u;
public const val `TMT_INTLIST`: `THEME_PROPERTY_SYMBOL_ID` = 211u;
public const val `TMT_LASTBOOL`: `THEME_PROPERTY_SYMBOL_ID` = 1001u;
public const val `TMT_LASTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 1631u;
public const val `TMT_LASTFONT`: `THEME_PROPERTY_SYMBOL_ID` = 809u;
public const val `TMT_LASTINT`: `THEME_PROPERTY_SYMBOL_ID` = 1301u;
public const val `TMT_LASTSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 1210u;
public const val `TMT_LASTSTRING`: `THEME_PROPERTY_SYMBOL_ID` = 1404u;
public const val `TMT_LASTUPDATED`: `THEME_PROPERTY_SYMBOL_ID` = 1403u;
public const val `TMT_LAST_RCSTRING_NAME`: `THEME_PROPERTY_SYMBOL_ID` = 608u;
public const val `TMT_LIGHT3D`: `THEME_PROPERTY_SYMBOL_ID` = 1623u;
public const val `TMT_LOCALIZEDMIRRORIMAGE`: `THEME_PROPERTY_SYMBOL_ID` = 2220u;
public const val `TMT_MARGINS`: `THEME_PROPERTY_SYMBOL_ID` = 205u;
public const val `TMT_MENU`: `THEME_PROPERTY_SYMBOL_ID` = 1605u;
public const val `TMT_MENUBAR`: `THEME_PROPERTY_SYMBOL_ID` = 1631u;
public const val `TMT_MENUBARHEIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 1209u;
public const val `TMT_MENUBARWIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 1208u;
public const val `TMT_MENUFONT`: `THEME_PROPERTY_SYMBOL_ID` = 803u;
public const val `TMT_MENUHILIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 1630u;
public const val `TMT_MENUTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1608u;
public const val `TMT_MINCOLORDEPTH`: `THEME_PROPERTY_SYMBOL_ID` = 1301u;
public const val `TMT_MINDPI1`: `THEME_PROPERTY_SYMBOL_ID` = 2420u;
public const val `TMT_MINDPI2`: `THEME_PROPERTY_SYMBOL_ID` = 2421u;
public const val `TMT_MINDPI3`: `THEME_PROPERTY_SYMBOL_ID` = 2422u;
public const val `TMT_MINDPI4`: `THEME_PROPERTY_SYMBOL_ID` = 2423u;
public const val `TMT_MINDPI5`: `THEME_PROPERTY_SYMBOL_ID` = 2424u;
public const val `TMT_MINDPI6`: `THEME_PROPERTY_SYMBOL_ID` = 2433u;
public const val `TMT_MINDPI7`: `THEME_PROPERTY_SYMBOL_ID` = 2434u;
public const val `TMT_MINSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 3403u;
public const val `TMT_MINSIZE1`: `THEME_PROPERTY_SYMBOL_ID` = 3404u;
public const val `TMT_MINSIZE2`: `THEME_PROPERTY_SYMBOL_ID` = 3405u;
public const val `TMT_MINSIZE3`: `THEME_PROPERTY_SYMBOL_ID` = 3406u;
public const val `TMT_MINSIZE4`: `THEME_PROPERTY_SYMBOL_ID` = 3407u;
public const val `TMT_MINSIZE5`: `THEME_PROPERTY_SYMBOL_ID` = 3408u;
public const val `TMT_MINSIZE6`: `THEME_PROPERTY_SYMBOL_ID` = 3410u;
public const val `TMT_MINSIZE7`: `THEME_PROPERTY_SYMBOL_ID` = 3411u;
public const val `TMT_MIRRORIMAGE`: `THEME_PROPERTY_SYMBOL_ID` = 2209u;
public const val `TMT_MSGBOXFONT`: `THEME_PROPERTY_SYMBOL_ID` = 805u;
public const val `TMT_NAME`: `THEME_PROPERTY_SYMBOL_ID` = 600u;
public const val `TMT_NOETCHEDEFFECT`: `THEME_PROPERTY_SYMBOL_ID` = 2215u;
public const val `TMT_NORMALSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 3409u;
public const val `TMT_OFFSET`: `THEME_PROPERTY_SYMBOL_ID` = 3401u;
public const val `TMT_OFFSETTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4008u;
public const val `TMT_OPACITY`: `THEME_PROPERTY_SYMBOL_ID` = 2430u;
public const val `TMT_PADDEDBORDERWIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 1210u;
public const val `TMT_PIXELSPERFRAME`: `THEME_PROPERTY_SYMBOL_ID` = 2427u;
public const val `TMT_POSITION`: `THEME_PROPERTY_SYMBOL_ID` = 208u;
public const val `TMT_PROGRESSCHUNKSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 2411u;
public const val `TMT_PROGRESSSPACESIZE`: `THEME_PROPERTY_SYMBOL_ID` = 2412u;
public const val `TMT_RECT`: `THEME_PROPERTY_SYMBOL_ID` = 209u;
public const val `TMT_RESERVEDHIGH`: `THEME_PROPERTY_SYMBOL_ID` = 7999u;
public const val `TMT_RESERVEDLOW`: `THEME_PROPERTY_SYMBOL_ID` = 0u;
public const val `TMT_ROUNDCORNERHEIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 2405u;
public const val `TMT_ROUNDCORNERWIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 2404u;
public const val `TMT_SATURATION`: `THEME_PROPERTY_SYMBOL_ID` = 2413u;
public const val `TMT_SCALEDBACKGROUND`: `THEME_PROPERTY_SYMBOL_ID` = 7001u;
public const val `TMT_SCROLLBAR`: `THEME_PROPERTY_SYMBOL_ID` = 1601u;
public const val `TMT_SCROLLBARHEIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 1203u;
public const val `TMT_SCROLLBARWIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 1202u;
public const val `TMT_SHADOWCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3815u;
public const val `TMT_SIZE`: `THEME_PROPERTY_SYMBOL_ID` = 207u;
public const val `TMT_SIZES`: `THEME_PROPERTY_SYMBOL_ID` = 402u;
public const val `TMT_SIZINGBORDERWIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 1201u;
public const val `TMT_SIZINGMARGINS`: `THEME_PROPERTY_SYMBOL_ID` = 3601u;
public const val `TMT_SIZINGTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4004u;
public const val `TMT_SMALLCAPTIONFONT`: `THEME_PROPERTY_SYMBOL_ID` = 802u;
public const val `TMT_SMCAPTIONBARHEIGHT`: `THEME_PROPERTY_SYMBOL_ID` = 1207u;
public const val `TMT_SMCAPTIONBARWIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 1206u;
public const val `TMT_SOURCEGROW`: `THEME_PROPERTY_SYMBOL_ID` = 2212u;
public const val `TMT_SOURCESHRINK`: `THEME_PROPERTY_SYMBOL_ID` = 2213u;
public const val `TMT_STATUSFONT`: `THEME_PROPERTY_SYMBOL_ID` = 804u;
public const val `TMT_STREAM`: `THEME_PROPERTY_SYMBOL_ID` = 214u;
public const val `TMT_STRING`: `THEME_PROPERTY_SYMBOL_ID` = 201u;
public const val `TMT_TEXT`: `THEME_PROPERTY_SYMBOL_ID` = 3201u;
public const val `TMT_TEXTAPPLYOVERLAY`: `THEME_PROPERTY_SYMBOL_ID` = 2216u;
public const val `TMT_TEXTBORDERCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3817u;
public const val `TMT_TEXTBORDERSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 2414u;
public const val `TMT_TEXTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3803u;
public const val `TMT_TEXTCOLORHINT`: `THEME_PROPERTY_SYMBOL_ID` = 3824u;
public const val `TMT_TEXTGLOW`: `THEME_PROPERTY_SYMBOL_ID` = 2217u;
public const val `TMT_TEXTGLOWSIZE`: `THEME_PROPERTY_SYMBOL_ID` = 2425u;
public const val `TMT_TEXTITALIC`: `THEME_PROPERTY_SYMBOL_ID` = 2218u;
public const val `TMT_TEXTSHADOWCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3818u;
public const val `TMT_TEXTSHADOWOFFSET`: `THEME_PROPERTY_SYMBOL_ID` = 3402u;
public const val `TMT_TEXTSHADOWTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4010u;
public const val `TMT_TOCOLOR1`: `THEME_PROPERTY_SYMBOL_ID` = 2006u;
public const val `TMT_TOCOLOR2`: `THEME_PROPERTY_SYMBOL_ID` = 2007u;
public const val `TMT_TOCOLOR3`: `THEME_PROPERTY_SYMBOL_ID` = 2008u;
public const val `TMT_TOCOLOR4`: `THEME_PROPERTY_SYMBOL_ID` = 2009u;
public const val `TMT_TOCOLOR5`: `THEME_PROPERTY_SYMBOL_ID` = 2010u;
public const val `TMT_TOHUE1`: `THEME_PROPERTY_SYMBOL_ID` = 1806u;
public const val `TMT_TOHUE2`: `THEME_PROPERTY_SYMBOL_ID` = 1807u;
public const val `TMT_TOHUE3`: `THEME_PROPERTY_SYMBOL_ID` = 1808u;
public const val `TMT_TOHUE4`: `THEME_PROPERTY_SYMBOL_ID` = 1809u;
public const val `TMT_TOHUE5`: `THEME_PROPERTY_SYMBOL_ID` = 1810u;
public const val `TMT_TOOLTIP`: `THEME_PROPERTY_SYMBOL_ID` = 602u;
public const val `TMT_TRANSITIONDURATIONS`: `THEME_PROPERTY_SYMBOL_ID` = 6000u;
public const val `TMT_TRANSPARENT`: `THEME_PROPERTY_SYMBOL_ID` = 2201u;
public const val `TMT_TRANSPARENTCOLOR`: `THEME_PROPERTY_SYMBOL_ID` = 3809u;
public const val `TMT_TRUESIZESCALINGTYPE`: `THEME_PROPERTY_SYMBOL_ID` = 4015u;
public const val `TMT_TRUESIZESTRETCHMARK`: `THEME_PROPERTY_SYMBOL_ID` = 2419u;
public const val `TMT_UNIFORMSIZING`: `THEME_PROPERTY_SYMBOL_ID` = 2210u;
public const val `TMT_URL`: `THEME_PROPERTY_SYMBOL_ID` = 606u;
public const val `TMT_USERPICTURE`: `THEME_PROPERTY_SYMBOL_ID` = 5001u;
public const val `TMT_VALIGN`: `THEME_PROPERTY_SYMBOL_ID` = 4007u;
public const val `TMT_VERSION`: `THEME_PROPERTY_SYMBOL_ID` = 607u;
public const val `TMT_WIDTH`: `THEME_PROPERTY_SYMBOL_ID` = 2416u;
public const val `TMT_WINDOW`: `THEME_PROPERTY_SYMBOL_ID` = 1606u;
public const val `TMT_WINDOWFRAME`: `THEME_PROPERTY_SYMBOL_ID` = 1607u;
public const val `TMT_WINDOWTEXT`: `THEME_PROPERTY_SYMBOL_ID` = 1609u;
public const val `TMT_XMLNAME`: `THEME_PROPERTY_SYMBOL_ID` = 1402u;
public const val `TNP_ANIMBACKGROUND`: `TRAYNOTIFYPARTS` = 2;
public const val `TNP_BACKGROUND`: `TRAYNOTIFYPARTS` = 1;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TOOLBARCLASSNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ToolbarWindow32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TOOLBARCLASSNAMEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ToolbarWindow32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TOOLBARCLASSNAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ToolbarWindow32");
public typealias `TOOLBARPARTS` = Int;
public typealias `TOOLBARSTYLESTATES` = Int;
public typealias `TOOLTIPPARTS` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TOOLTIPS_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("tooltips_class32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TOOLTIPS_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("tooltips_class32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TOOLTIPS_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("tooltips_class32");
public typealias `TOOLTIP_FLAGS` = UInt;
public typealias `TOPTABITEMBOTHEDGESTATES` = Int;
public typealias `TOPTABITEMLEFTEDGESTATES` = Int;
public typealias `TOPTABITEMRIGHTEDGESTATES` = Int;
public typealias `TOPTABITEMSTATES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TOUCH_HIT_TESTING_INPUT` (
    public var `pointerId`: UInt,
    public var `point`: `super`.`super`.`Foundation`.`POINT`,
    public var `boundingBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `nonOccludedBoundingBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `orientation`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TOUCH_HIT_TESTING_PROXIMITY_EVALUATION` (
    public var `score`: UShort,
    public var `adjustedPoint`: `super`.`super`.`Foundation`.`POINT`,
)
public const val `TP_BUTTON`: `TOOLBARPARTS` = 1;
public const val `TP_DROPDOWNBUTTON`: `TOOLBARPARTS` = 2;
public const val `TP_DROPDOWNBUTTONGLYPH`: `TOOLBARPARTS` = 7;
public const val `TP_SEPARATOR`: `TOOLBARPARTS` = 5;
public const val `TP_SEPARATORVERT`: `TOOLBARPARTS` = 6;
public const val `TP_SPLITBUTTON`: `TOOLBARPARTS` = 3;
public const val `TP_SPLITBUTTONDROPDOWN`: `TOOLBARPARTS` = 4;
public typealias `TRACKBARPARTS` = Int;
public typealias `TRACKBARSTYLESTATES` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TRACKBAR_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_trackbar32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TRACKBAR_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("msctls_trackbar32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `TRACKBAR_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_trackbar32");
public typealias `TRACKSTATES` = Int;
public typealias `TRACKVERTSTATES` = Int;
public typealias `TRAILINGGRIDCELLSTATES` = Int;
public typealias `TRAILINGGRIDCELLUPPERSTATES` = Int;
public typealias `TRANSPARENTBACKGROUNDSTATES` = Int;
public typealias `TRANSPARENTBARSTATES` = Int;
public typealias `TRANSPARENTBARVERTSTATES` = Int;
public typealias `TRAYNOTIFYPARTS` = Int;
public const val `TRBN_FIRST`: UInt = 4294965795u;
public const val `TRBN_LAST`: UInt = 4294965777u;
public const val `TRBN_THUMBPOSCHANGING`: UInt = 4294965794u;
public typealias `TREEITEMSTATES` = Int;
public typealias `TREEVIEWPARTS` = Int;
public typealias `TREE_VIEW_ITEM_STATE_FLAGS` = UInt;
public const val `TREIS_DISABLED`: `TREEITEMSTATES` = 4;
public const val `TREIS_HOT`: `TREEITEMSTATES` = 2;
public const val `TREIS_HOTSELECTED`: `TREEITEMSTATES` = 6;
public const val `TREIS_NORMAL`: `TREEITEMSTATES` = 1;
public const val `TREIS_SELECTED`: `TREEITEMSTATES` = 3;
public const val `TREIS_SELECTEDNOTFOCUS`: `TREEITEMSTATES` = 5;
public const val `TRS_NORMAL`: `TRACKSTATES` = 1;
public typealias `TRUESIZESCALINGTYPE` = Int;
public const val `TRVS_NORMAL`: `TRACKVERTSTATES` = 1;
public const val `TSGP_GRIPPER`: `TEXTSELECTIONGRIPPERPARTS` = 1;
public const val `TSGS_CENTERED`: `GRIPPERSTATES` = 2;
public const val `TSGS_NORMAL`: `GRIPPERSTATES` = 1;
public const val `TSST_DPI`: `TRUESIZESCALINGTYPE` = 2;
public const val `TSST_NONE`: `TRUESIZESCALINGTYPE` = 0;
public const val `TSST_SIZE`: `TRUESIZESCALINGTYPE` = 1;
public const val `TSS_NORMAL`: `TICSSTATES` = 1;
public const val `TST_CONTINUOUS`: `TEXTSHADOWTYPE` = 2;
public const val `TST_NONE`: `TEXTSHADOWTYPE` = 0;
public const val `TST_SINGLE`: `TEXTSHADOWTYPE` = 1;
public const val `TSVS_NORMAL`: `TICSVERTSTATES` = 1;
public const val `TS_CHECKED`: `TOOLBARSTYLESTATES` = 5;
public const val `TS_CONTROLLABEL_DISABLED`: `CONTROLLABELSTATES` = 2;
public const val `TS_CONTROLLABEL_NORMAL`: `CONTROLLABELSTATES` = 1;
public const val `TS_DISABLED`: `TOOLBARSTYLESTATES` = 4;
public const val `TS_DRAW`: `THEMESIZE` = 2;
public const val `TS_HOT`: `TOOLBARSTYLESTATES` = 2;
public const val `TS_HOTCHECKED`: `TOOLBARSTYLESTATES` = 6;
public const val `TS_HYPERLINK_DISABLED`: `HYPERLINKTEXTSTATES` = 4;
public const val `TS_HYPERLINK_HOT`: `HYPERLINKTEXTSTATES` = 2;
public const val `TS_HYPERLINK_NORMAL`: `HYPERLINKTEXTSTATES` = 1;
public const val `TS_HYPERLINK_PRESSED`: `HYPERLINKTEXTSTATES` = 3;
public const val `TS_MIN`: `THEMESIZE` = 0;
public const val `TS_NEARHOT`: `TOOLBARSTYLESTATES` = 7;
public const val `TS_NORMAL`: `TOOLBARSTYLESTATES` = 1;
public const val `TS_OTHERSIDEHOT`: `TOOLBARSTYLESTATES` = 8;
public const val `TS_PRESSED`: `TOOLBARSTYLESTATES` = 3;
public const val `TS_TRUE`: `THEMESIZE` = 1;
public const val `TTBSS_POINTINGDOWNCENTERED`: `BALLOONSTEMSTATES` = 5;
public const val `TTBSS_POINTINGDOWNLEFTWALL`: `BALLOONSTEMSTATES` = 6;
public const val `TTBSS_POINTINGDOWNRIGHTWALL`: `BALLOONSTEMSTATES` = 4;
public const val `TTBSS_POINTINGUPCENTERED`: `BALLOONSTEMSTATES` = 2;
public const val `TTBSS_POINTINGUPLEFTWALL`: `BALLOONSTEMSTATES` = 1;
public const val `TTBSS_POINTINGUPRIGHTWALL`: `BALLOONSTEMSTATES` = 3;
public const val `TTBS_LINK`: `BALLOONSTATES` = 2;
public const val `TTBS_NORMAL`: `BALLOONSTATES` = 1;
public const val `TTCS_HOT`: `CLOSESTATES` = 2;
public const val `TTCS_NORMAL`: `CLOSESTATES` = 1;
public const val `TTCS_PRESSED`: `CLOSESTATES` = 3;
public const val `TTDT_AUTOMATIC`: UInt = 0u;
public const val `TTDT_AUTOPOP`: UInt = 2u;
public const val `TTDT_INITIAL`: UInt = 3u;
public const val `TTDT_RESHOW`: UInt = 1u;
public const val `TTFT_CUBIC_BEZIER`: `TA_TIMINGFUNCTION_TYPE` = 1;
public const val `TTFT_UNDEFINED`: `TA_TIMINGFUNCTION_TYPE` = 0;
public const val `TTF_ABSOLUTE`: `TOOLTIP_FLAGS` = 128u;
public const val `TTF_CENTERTIP`: `TOOLTIP_FLAGS` = 2u;
public const val `TTF_DI_SETITEM`: `TOOLTIP_FLAGS` = 32768u;
public const val `TTF_IDISHWND`: `TOOLTIP_FLAGS` = 1u;
public const val `TTF_PARSELINKS`: `TOOLTIP_FLAGS` = 4096u;
public const val `TTF_RTLREADING`: `TOOLTIP_FLAGS` = 4u;
public const val `TTF_SUBCLASS`: `TOOLTIP_FLAGS` = 16u;
public const val `TTF_TRACK`: `TOOLTIP_FLAGS` = 32u;
public const val `TTF_TRANSPARENT`: `TOOLTIP_FLAGS` = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTGETTITLE` (
    public var `dwSize`: UInt,
    public var `uTitleBitmap`: UInt,
    public var `cch`: UInt,
    public var `pszTitle`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 7133:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TTGETTITLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTHITTESTINFOA` (
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `ti`: `TTTOOLINFOA`,
)
// UNSUPPORTED Rust 7145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TTHITTESTINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTHITTESTINFOW` (
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `ti`: `TTTOOLINFOW`,
)
// UNSUPPORTED Rust 7157:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TTHITTESTINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TTIBES_DISABLED`: `TOPTABITEMBOTHEDGESTATES` = 4;
public const val `TTIBES_FOCUSED`: `TOPTABITEMBOTHEDGESTATES` = 5;
public const val `TTIBES_HOT`: `TOPTABITEMBOTHEDGESTATES` = 2;
public const val `TTIBES_NORMAL`: `TOPTABITEMBOTHEDGESTATES` = 1;
public const val `TTIBES_SELECTED`: `TOPTABITEMBOTHEDGESTATES` = 3;
public const val `TTILES_DISABLED`: `TOPTABITEMLEFTEDGESTATES` = 4;
public const val `TTILES_FOCUSED`: `TOPTABITEMLEFTEDGESTATES` = 5;
public const val `TTILES_HOT`: `TOPTABITEMLEFTEDGESTATES` = 2;
public const val `TTILES_NORMAL`: `TOPTABITEMLEFTEDGESTATES` = 1;
public const val `TTILES_SELECTED`: `TOPTABITEMLEFTEDGESTATES` = 3;
public const val `TTIRES_DISABLED`: `TOPTABITEMRIGHTEDGESTATES` = 4;
public const val `TTIRES_FOCUSED`: `TOPTABITEMRIGHTEDGESTATES` = 5;
public const val `TTIRES_HOT`: `TOPTABITEMRIGHTEDGESTATES` = 2;
public const val `TTIRES_NORMAL`: `TOPTABITEMRIGHTEDGESTATES` = 1;
public const val `TTIRES_SELECTED`: `TOPTABITEMRIGHTEDGESTATES` = 3;
public const val `TTIS_DISABLED`: `TOPTABITEMSTATES` = 4;
public const val `TTIS_FOCUSED`: `TOPTABITEMSTATES` = 5;
public const val `TTIS_HOT`: `TOPTABITEMSTATES` = 2;
public const val `TTIS_NORMAL`: `TOPTABITEMSTATES` = 1;
public const val `TTIS_SELECTED`: `TOPTABITEMSTATES` = 3;
public const val `TTI_ERROR`: `EDITBALLOONTIP_ICON` = 3;
public const val `TTI_ERROR_LARGE`: `EDITBALLOONTIP_ICON` = 6;
public const val `TTI_INFO`: `EDITBALLOONTIP_ICON` = 1;
public const val `TTI_INFO_LARGE`: `EDITBALLOONTIP_ICON` = 4;
public const val `TTI_NONE`: `EDITBALLOONTIP_ICON` = 0;
public const val `TTI_WARNING`: `EDITBALLOONTIP_ICON` = 2;
public const val `TTI_WARNING_LARGE`: `EDITBALLOONTIP_ICON` = 5;
public const val `TTM_ACTIVATE`: UInt = 1025u;
public const val `TTM_ADDTOOL`: UInt = 1074u;
public const val `TTM_ADDTOOLA`: UInt = 1028u;
public const val `TTM_ADDTOOLW`: UInt = 1074u;
public const val `TTM_ADJUSTRECT`: UInt = 1055u;
public const val `TTM_DELTOOL`: UInt = 1075u;
public const val `TTM_DELTOOLA`: UInt = 1029u;
public const val `TTM_DELTOOLW`: UInt = 1075u;
public const val `TTM_ENUMTOOLS`: UInt = 1082u;
public const val `TTM_ENUMTOOLSA`: UInt = 1038u;
public const val `TTM_ENUMTOOLSW`: UInt = 1082u;
public const val `TTM_GETBUBBLESIZE`: UInt = 1054u;
public const val `TTM_GETCURRENTTOOL`: UInt = 1083u;
public const val `TTM_GETCURRENTTOOLA`: UInt = 1039u;
public const val `TTM_GETCURRENTTOOLW`: UInt = 1083u;
public const val `TTM_GETDELAYTIME`: UInt = 1045u;
public const val `TTM_GETMARGIN`: UInt = 1051u;
public const val `TTM_GETMAXTIPWIDTH`: UInt = 1049u;
public const val `TTM_GETTEXT`: UInt = 1080u;
public const val `TTM_GETTEXTA`: UInt = 1035u;
public const val `TTM_GETTEXTW`: UInt = 1080u;
public const val `TTM_GETTIPBKCOLOR`: UInt = 1046u;
public const val `TTM_GETTIPTEXTCOLOR`: UInt = 1047u;
public const val `TTM_GETTITLE`: UInt = 1059u;
public const val `TTM_GETTOOLCOUNT`: UInt = 1037u;
public const val `TTM_GETTOOLINFO`: UInt = 1077u;
public const val `TTM_GETTOOLINFOA`: UInt = 1032u;
public const val `TTM_GETTOOLINFOW`: UInt = 1077u;
public const val `TTM_HITTEST`: UInt = 1079u;
public const val `TTM_HITTESTA`: UInt = 1034u;
public const val `TTM_HITTESTW`: UInt = 1079u;
public const val `TTM_NEWTOOLRECT`: UInt = 1076u;
public const val `TTM_NEWTOOLRECTA`: UInt = 1030u;
public const val `TTM_NEWTOOLRECTW`: UInt = 1076u;
public const val `TTM_POP`: UInt = 1052u;
public const val `TTM_POPUP`: UInt = 1058u;
public const val `TTM_RELAYEVENT`: UInt = 1031u;
public const val `TTM_SETDELAYTIME`: UInt = 1027u;
public const val `TTM_SETMARGIN`: UInt = 1050u;
public const val `TTM_SETMAXTIPWIDTH`: UInt = 1048u;
public const val `TTM_SETTIPBKCOLOR`: UInt = 1043u;
public const val `TTM_SETTIPTEXTCOLOR`: UInt = 1044u;
public const val `TTM_SETTITLE`: UInt = 1057u;
public const val `TTM_SETTITLEA`: UInt = 1056u;
public const val `TTM_SETTITLEW`: UInt = 1057u;
public const val `TTM_SETTOOLINFO`: UInt = 1078u;
public const val `TTM_SETTOOLINFOA`: UInt = 1033u;
public const val `TTM_SETTOOLINFOW`: UInt = 1078u;
public const val `TTM_SETWINDOWTHEME`: UInt = 8203u;
public const val `TTM_TRACKACTIVATE`: UInt = 1041u;
public const val `TTM_TRACKPOSITION`: UInt = 1042u;
public const val `TTM_UPDATE`: UInt = 1053u;
public const val `TTM_UPDATETIPTEXT`: UInt = 1081u;
public const val `TTM_UPDATETIPTEXTA`: UInt = 1036u;
public const val `TTM_UPDATETIPTEXTW`: UInt = 1081u;
public const val `TTM_WINDOWFROMPOINT`: UInt = 1040u;
public const val `TTN_FIRST`: UInt = 4294966776u;
public const val `TTN_GETDISPINFO`: UInt = 4294966766u;
public const val `TTN_GETDISPINFOA`: UInt = 4294966776u;
public const val `TTN_GETDISPINFOW`: UInt = 4294966766u;
public const val `TTN_LAST`: UInt = 4294966747u;
public const val `TTN_LINKCLICK`: UInt = 4294966773u;
public const val `TTN_NEEDTEXT`: UInt = 4294966766u;
public const val `TTN_NEEDTEXTA`: UInt = 4294966776u;
public const val `TTN_NEEDTEXTW`: UInt = 4294966766u;
public const val `TTN_POP`: UInt = 4294966774u;
public const val `TTN_SHOW`: UInt = 4294966775u;
public const val `TTP_BALLOON`: `TOOLTIPPARTS` = 3;
public const val `TTP_BALLOONSTEM`: `TOOLTIPPARTS` = 6;
public const val `TTP_BALLOONTITLE`: `TOOLTIPPARTS` = 4;
public const val `TTP_CLOSE`: `TOOLTIPPARTS` = 5;
public const val `TTP_STANDARD`: `TOOLTIPPARTS` = 1;
public const val `TTP_STANDARDTITLE`: `TOOLTIPPARTS` = 2;
public const val `TTP_WRENCH`: `TOOLTIPPARTS` = 7;
public const val `TTSS_LINK`: `STANDARDSTATES` = 2;
public const val `TTSS_NORMAL`: `STANDARDSTATES` = 1;
public const val `TTS_ALWAYSTIP`: UInt = 1u;
public const val `TTS_BALLOON`: UInt = 64u;
public const val `TTS_CLOSE`: UInt = 128u;
public const val `TTS_NOANIMATE`: UInt = 16u;
public const val `TTS_NOFADE`: UInt = 32u;
public const val `TTS_NOPREFIX`: UInt = 2u;
public const val `TTS_USEVISUALSTYLE`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TTTOOLINFOA` (
    public var `cbSize`: UInt,
    public var `uFlags`: `TOOLTIP_FLAGS`,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `uId`: ULong,
    public var `rect`: `super`.`super`.`Foundation`.`RECT`,
    public var `hinst`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszText`: `windows_sys`.`core`.`PSTR`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lpReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 7285:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TTTOOLINFOA {
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
public class `TTTOOLINFOW` (
    public var `cbSize`: UInt,
    public var `uFlags`: `TOOLTIP_FLAGS`,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `uId`: ULong,
    public var `rect`: `super`.`super`.`Foundation`.`RECT`,
    public var `hinst`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszText`: `windows_sys`.`core`.`PWSTR`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lpReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 7303:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TTTOOLINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TTWS_HOT`: `WRENCHSTATES` = 2;
public const val `TTWS_NORMAL`: `WRENCHSTATES` = 1;
public const val `TTWS_PRESSED`: `WRENCHSTATES` = 3;
public const val `TUBS_DISABLED`: `THUMBBOTTOMSTATES` = 5;
public const val `TUBS_FOCUSED`: `THUMBBOTTOMSTATES` = 4;
public const val `TUBS_HOT`: `THUMBBOTTOMSTATES` = 2;
public const val `TUBS_NORMAL`: `THUMBBOTTOMSTATES` = 1;
public const val `TUBS_PRESSED`: `THUMBBOTTOMSTATES` = 3;
public const val `TUS_DISABLED`: `THUMBSTATES` = 5;
public const val `TUS_FOCUSED`: `THUMBSTATES` = 4;
public const val `TUS_HOT`: `THUMBSTATES` = 2;
public const val `TUS_NORMAL`: `THUMBSTATES` = 1;
public const val `TUS_PRESSED`: `THUMBSTATES` = 3;
public const val `TUTS_DISABLED`: `THUMBTOPSTATES` = 5;
public const val `TUTS_FOCUSED`: `THUMBTOPSTATES` = 4;
public const val `TUTS_HOT`: `THUMBTOPSTATES` = 2;
public const val `TUTS_NORMAL`: `THUMBTOPSTATES` = 1;
public const val `TUTS_PRESSED`: `THUMBTOPSTATES` = 3;
public const val `TUVLS_DISABLED`: `THUMBLEFTSTATES` = 5;
public const val `TUVLS_FOCUSED`: `THUMBLEFTSTATES` = 4;
public const val `TUVLS_HOT`: `THUMBLEFTSTATES` = 2;
public const val `TUVLS_NORMAL`: `THUMBLEFTSTATES` = 1;
public const val `TUVLS_PRESSED`: `THUMBLEFTSTATES` = 3;
public const val `TUVRS_DISABLED`: `THUMBRIGHTSTATES` = 5;
public const val `TUVRS_FOCUSED`: `THUMBRIGHTSTATES` = 4;
public const val `TUVRS_HOT`: `THUMBRIGHTSTATES` = 2;
public const val `TUVRS_NORMAL`: `THUMBRIGHTSTATES` = 1;
public const val `TUVRS_PRESSED`: `THUMBRIGHTSTATES` = 3;
public const val `TUVS_DISABLED`: `THUMBVERTSTATES` = 5;
public const val `TUVS_FOCUSED`: `THUMBVERTSTATES` = 4;
public const val `TUVS_HOT`: `THUMBVERTSTATES` = 2;
public const val `TUVS_NORMAL`: `THUMBVERTSTATES` = 1;
public const val `TUVS_PRESSED`: `THUMBVERTSTATES` = 3;
public const val `TVCDRF_NOIMAGES`: UInt = 65536u;
public const val `TVC_BYKEYBOARD`: `NM_TREEVIEW_ACTION` = 2u;
public const val `TVC_BYMOUSE`: `NM_TREEVIEW_ACTION` = 1u;
public const val `TVC_UNKNOWN`: `NM_TREEVIEW_ACTION` = 0u;
public const val `TVE_COLLAPSE`: `NM_TREEVIEW_ACTION` = 1u;
public const val `TVE_COLLAPSERESET`: `NM_TREEVIEW_ACTION` = 32768u;
public const val `TVE_EXPAND`: `NM_TREEVIEW_ACTION` = 2u;
public const val `TVE_EXPANDPARTIAL`: `NM_TREEVIEW_ACTION` = 16384u;
public const val `TVE_TOGGLE`: `NM_TREEVIEW_ACTION` = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TVGETITEMPARTRECTINFO` (
    public var `hti`: `HTREEITEM`,
    public var `prc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?,
    public var `partID`: `TVITEMPART`,
)
// UNSUPPORTED Rust 7357:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVGETITEMPARTRECTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TVGIPR_BUTTON`: `TVITEMPART` = 1;
public const val `TVGN_CARET`: UInt = 9u;
public const val `TVGN_CHILD`: UInt = 4u;
public const val `TVGN_DROPHILITE`: UInt = 8u;
public const val `TVGN_FIRSTVISIBLE`: UInt = 5u;
public const val `TVGN_LASTVISIBLE`: UInt = 10u;
public const val `TVGN_NEXT`: UInt = 1u;
public const val `TVGN_NEXTSELECTED`: UInt = 11u;
public const val `TVGN_NEXTVISIBLE`: UInt = 6u;
public const val `TVGN_PARENT`: UInt = 3u;
public const val `TVGN_PREVIOUS`: UInt = 2u;
public const val `TVGN_PREVIOUSVISIBLE`: UInt = 7u;
public const val `TVGN_ROOT`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TVHITTESTINFO` (
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `flags`: `TVHITTESTINFO_FLAGS`,
    public var `hItem`: `HTREEITEM`,
)
public typealias `TVHITTESTINFO_FLAGS` = UInt;
public const val `TVHT_ABOVE`: `TVHITTESTINFO_FLAGS` = 256u;
public const val `TVHT_BELOW`: `TVHITTESTINFO_FLAGS` = 512u;
public const val `TVHT_NOWHERE`: `TVHITTESTINFO_FLAGS` = 1u;
public const val `TVHT_ONITEM`: `TVHITTESTINFO_FLAGS` = 70u;
public const val `TVHT_ONITEMBUTTON`: `TVHITTESTINFO_FLAGS` = 16u;
public const val `TVHT_ONITEMICON`: `TVHITTESTINFO_FLAGS` = 2u;
public const val `TVHT_ONITEMINDENT`: `TVHITTESTINFO_FLAGS` = 8u;
public const val `TVHT_ONITEMLABEL`: `TVHITTESTINFO_FLAGS` = 4u;
public const val `TVHT_ONITEMRIGHT`: `TVHITTESTINFO_FLAGS` = 32u;
public const val `TVHT_ONITEMSTATEICON`: `TVHITTESTINFO_FLAGS` = 64u;
public const val `TVHT_TOLEFT`: `TVHITTESTINFO_FLAGS` = 2048u;
public const val `TVHT_TORIGHT`: `TVHITTESTINFO_FLAGS` = 1024u;
public const val `TVIF_CHILDREN`: `TVITEM_MASK` = 64u;
public const val `TVIF_DI_SETITEM`: `TVITEM_MASK` = 4096u;
public const val `TVIF_EXPANDEDIMAGE`: `TVITEM_MASK` = 512u;
public const val `TVIF_HANDLE`: `TVITEM_MASK` = 16u;
public const val `TVIF_IMAGE`: `TVITEM_MASK` = 2u;
public const val `TVIF_INTEGRAL`: `TVITEM_MASK` = 128u;
public const val `TVIF_PARAM`: `TVITEM_MASK` = 4u;
public const val `TVIF_SELECTEDIMAGE`: `TVITEM_MASK` = 32u;
public const val `TVIF_STATE`: `TVITEM_MASK` = 8u;
public const val `TVIF_STATEEX`: `TVITEM_MASK` = 256u;
public const val `TVIF_TEXT`: `TVITEM_MASK` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TVINSERTSTRUCTA` (
    public var `hParent`: `HTREEITEM`,
    public var `hInsertAfter`: `HTREEITEM`,
    public var `Anonymous`: `TVINSERTSTRUCTA_0`,
)
// UNSUPPORTED Rust 7413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVINSERTSTRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7418:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TVINSERTSTRUCTA_0 {
//     pub itemex: TVITEMEXA,
//     pub item: TVITEMA,
// }

// UNSUPPORTED Rust 7424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVINSERTSTRUCTA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TVINSERTSTRUCTW` (
    public var `hParent`: `HTREEITEM`,
    public var `hInsertAfter`: `HTREEITEM`,
    public var `Anonymous`: `TVINSERTSTRUCTW_0`,
)
// UNSUPPORTED Rust 7436:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVINSERTSTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7441:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TVINSERTSTRUCTW_0 {
//     pub itemex: TVITEMEXW,
//     pub item: TVITEMW,
// }

// UNSUPPORTED Rust 7447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVINSERTSTRUCTW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TVIS_BOLD`: `TREE_VIEW_ITEM_STATE_FLAGS` = 16u;
public const val `TVIS_CUT`: `TREE_VIEW_ITEM_STATE_FLAGS` = 4u;
public const val `TVIS_DROPHILITED`: `TREE_VIEW_ITEM_STATE_FLAGS` = 8u;
public const val `TVIS_EXPANDED`: `TREE_VIEW_ITEM_STATE_FLAGS` = 32u;
public const val `TVIS_EXPANDEDONCE`: `TREE_VIEW_ITEM_STATE_FLAGS` = 64u;
public const val `TVIS_EXPANDPARTIAL`: `TREE_VIEW_ITEM_STATE_FLAGS` = 128u;
public const val `TVIS_EX_ALL`: `TREE_VIEW_ITEM_STATE_FLAGS` = 2u;
public const val `TVIS_EX_DISABLED`: `TREE_VIEW_ITEM_STATE_FLAGS` = 2u;
public const val `TVIS_EX_FLAT`: `TREE_VIEW_ITEM_STATE_FLAGS` = 1u;
public const val `TVIS_OVERLAYMASK`: `TREE_VIEW_ITEM_STATE_FLAGS` = 3840u;
public const val `TVIS_SELECTED`: `TREE_VIEW_ITEM_STATE_FLAGS` = 2u;
public const val `TVIS_STATEIMAGEMASK`: `TREE_VIEW_ITEM_STATE_FLAGS` = 61440u;
public const val `TVIS_USERMASK`: `TREE_VIEW_ITEM_STATE_FLAGS` = 61440u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TVITEMA` (
    public var `mask`: `TVITEM_MASK`,
    public var `hItem`: `HTREEITEM`,
    public var `state`: `TREE_VIEW_ITEM_STATE_FLAGS`,
    public var `stateMask`: `TREE_VIEW_ITEM_STATE_FLAGS`,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `iSelectedImage`: Int,
    public var `cChildren`: `TVITEMEXW_CHILDREN`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 7479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TVITEMEXA` (
    public var `mask`: `TVITEM_MASK`,
    public var `hItem`: `HTREEITEM`,
    public var `state`: UInt,
    public var `stateMask`: UInt,
    public var `pszText`: `windows_sys`.`core`.`PSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `iSelectedImage`: Int,
    public var `cChildren`: `TVITEMEXW_CHILDREN`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `iIntegral`: Int,
    public var `uStateEx`: UInt,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `iExpandedImage`: Int,
    public var `iReserved`: Int,
)
// UNSUPPORTED Rust 7503:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVITEMEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TVITEMEXW` (
    public var `mask`: `TVITEM_MASK`,
    public var `hItem`: `HTREEITEM`,
    public var `state`: UInt,
    public var `stateMask`: UInt,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `iSelectedImage`: Int,
    public var `cChildren`: `TVITEMEXW_CHILDREN`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `iIntegral`: Int,
    public var `uStateEx`: UInt,
    public var `hwnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `iExpandedImage`: Int,
    public var `iReserved`: Int,
)
// UNSUPPORTED Rust 7527:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVITEMEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TVITEMEXW_CHILDREN` = Int;
public typealias `TVITEMPART` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TVITEMW` (
    public var `mask`: `TVITEM_MASK`,
    public var `hItem`: `HTREEITEM`,
    public var `state`: `TREE_VIEW_ITEM_STATE_FLAGS`,
    public var `stateMask`: `TREE_VIEW_ITEM_STATE_FLAGS`,
    public var `pszText`: `windows_sys`.`core`.`PWSTR`,
    public var `cchTextMax`: Int,
    public var `iImage`: Int,
    public var `iSelectedImage`: Int,
    public var `cChildren`: `TVITEMEXW_CHILDREN`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
// UNSUPPORTED Rust 7548:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TVITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TVITEM_MASK` = UInt;
public const val `TVI_FIRST`: `HTREEITEM` = -65535L;
public const val `TVI_LAST`: `HTREEITEM` = -65534L;
public const val `TVI_ROOT`: `HTREEITEM` = -65536L;
public const val `TVI_SORT`: `HTREEITEM` = -65533L;
public const val `TVM_CREATEDRAGIMAGE`: UInt = 4370u;
public const val `TVM_DELETEITEM`: UInt = 4353u;
public const val `TVM_EDITLABEL`: UInt = 4417u;
public const val `TVM_EDITLABELA`: UInt = 4366u;
public const val `TVM_EDITLABELW`: UInt = 4417u;
public const val `TVM_ENDEDITLABELNOW`: UInt = 4374u;
public const val `TVM_ENSUREVISIBLE`: UInt = 4372u;
public const val `TVM_EXPAND`: UInt = 4354u;
public const val `TVM_GETBKCOLOR`: UInt = 4383u;
public const val `TVM_GETCOUNT`: UInt = 4357u;
public const val `TVM_GETEDITCONTROL`: UInt = 4367u;
public const val `TVM_GETEXTENDEDSTYLE`: UInt = 4397u;
public const val `TVM_GETIMAGELIST`: UInt = 4360u;
public const val `TVM_GETINDENT`: UInt = 4358u;
public const val `TVM_GETINSERTMARKCOLOR`: UInt = 4390u;
public const val `TVM_GETISEARCHSTRING`: UInt = 4416u;
public const val `TVM_GETISEARCHSTRINGA`: UInt = 4375u;
public const val `TVM_GETISEARCHSTRINGW`: UInt = 4416u;
public const val `TVM_GETITEM`: UInt = 4414u;
public const val `TVM_GETITEMA`: UInt = 4364u;
public const val `TVM_GETITEMHEIGHT`: UInt = 4380u;
public const val `TVM_GETITEMPARTRECT`: UInt = 4424u;
public const val `TVM_GETITEMRECT`: UInt = 4356u;
public const val `TVM_GETITEMSTATE`: UInt = 4391u;
public const val `TVM_GETITEMW`: UInt = 4414u;
public const val `TVM_GETLINECOLOR`: UInt = 4393u;
public const val `TVM_GETNEXTITEM`: UInt = 4362u;
public const val `TVM_GETSCROLLTIME`: UInt = 4386u;
public const val `TVM_GETSELECTEDCOUNT`: UInt = 4422u;
public const val `TVM_GETTEXTCOLOR`: UInt = 4384u;
public const val `TVM_GETTOOLTIPS`: UInt = 4377u;
public const val `TVM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `TVM_GETVISIBLECOUNT`: UInt = 4368u;
public const val `TVM_HITTEST`: UInt = 4369u;
public const val `TVM_INSERTITEM`: UInt = 4402u;
public const val `TVM_INSERTITEMA`: UInt = 4352u;
public const val `TVM_INSERTITEMW`: UInt = 4402u;
public const val `TVM_MAPACCIDTOHTREEITEM`: UInt = 4394u;
public const val `TVM_MAPHTREEITEMTOACCID`: UInt = 4395u;
public const val `TVM_SELECTITEM`: UInt = 4363u;
public const val `TVM_SETAUTOSCROLLINFO`: UInt = 4411u;
public const val `TVM_SETBKCOLOR`: UInt = 4381u;
public const val `TVM_SETBORDER`: UInt = 4387u;
public const val `TVM_SETEXTENDEDSTYLE`: UInt = 4396u;
public const val `TVM_SETHOT`: UInt = 4410u;
public const val `TVM_SETIMAGELIST`: UInt = 4361u;
public const val `TVM_SETINDENT`: UInt = 4359u;
public const val `TVM_SETINSERTMARK`: UInt = 4378u;
public const val `TVM_SETINSERTMARKCOLOR`: UInt = 4389u;
public const val `TVM_SETITEM`: UInt = 4415u;
public const val `TVM_SETITEMA`: UInt = 4365u;
public const val `TVM_SETITEMHEIGHT`: UInt = 4379u;
public const val `TVM_SETITEMW`: UInt = 4415u;
public const val `TVM_SETLINECOLOR`: UInt = 4392u;
public const val `TVM_SETSCROLLTIME`: UInt = 4385u;
public const val `TVM_SETTEXTCOLOR`: UInt = 4382u;
public const val `TVM_SETTOOLTIPS`: UInt = 4376u;
public const val `TVM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `TVM_SHOWINFOTIP`: UInt = 4423u;
public const val `TVM_SORTCHILDREN`: UInt = 4371u;
public const val `TVM_SORTCHILDRENCB`: UInt = 4373u;
public const val `TVNRET_DEFAULT`: UInt = 0u;
public const val `TVNRET_SKIPNEW`: UInt = 2u;
public const val `TVNRET_SKIPOLD`: UInt = 1u;
public const val `TVN_ASYNCDRAW`: UInt = 4294966876u;
public const val `TVN_BEGINDRAG`: UInt = 4294966840u;
public const val `TVN_BEGINDRAGA`: UInt = 4294966889u;
public const val `TVN_BEGINDRAGW`: UInt = 4294966840u;
public const val `TVN_BEGINLABELEDIT`: UInt = 4294966837u;
public const val `TVN_BEGINLABELEDITA`: UInt = 4294966886u;
public const val `TVN_BEGINLABELEDITW`: UInt = 4294966837u;
public const val `TVN_BEGINRDRAG`: UInt = 4294966839u;
public const val `TVN_BEGINRDRAGA`: UInt = 4294966888u;
public const val `TVN_BEGINRDRAGW`: UInt = 4294966839u;
public const val `TVN_DELETEITEM`: UInt = 4294966838u;
public const val `TVN_DELETEITEMA`: UInt = 4294966887u;
public const val `TVN_DELETEITEMW`: UInt = 4294966838u;
public const val `TVN_ENDLABELEDIT`: UInt = 4294966836u;
public const val `TVN_ENDLABELEDITA`: UInt = 4294966885u;
public const val `TVN_ENDLABELEDITW`: UInt = 4294966836u;
public const val `TVN_FIRST`: UInt = 4294966896u;
public const val `TVN_GETDISPINFO`: UInt = 4294966844u;
public const val `TVN_GETDISPINFOA`: UInt = 4294966893u;
public const val `TVN_GETDISPINFOW`: UInt = 4294966844u;
public const val `TVN_GETINFOTIP`: UInt = 4294966882u;
public const val `TVN_GETINFOTIPA`: UInt = 4294966883u;
public const val `TVN_GETINFOTIPW`: UInt = 4294966882u;
public const val `TVN_ITEMCHANGED`: UInt = 4294966877u;
public const val `TVN_ITEMCHANGEDA`: UInt = 4294966878u;
public const val `TVN_ITEMCHANGEDW`: UInt = 4294966877u;
public const val `TVN_ITEMCHANGING`: UInt = 4294966879u;
public const val `TVN_ITEMCHANGINGA`: UInt = 4294966880u;
public const val `TVN_ITEMCHANGINGW`: UInt = 4294966879u;
public const val `TVN_ITEMEXPANDED`: UInt = 4294966841u;
public const val `TVN_ITEMEXPANDEDA`: UInt = 4294966890u;
public const val `TVN_ITEMEXPANDEDW`: UInt = 4294966841u;
public const val `TVN_ITEMEXPANDING`: UInt = 4294966842u;
public const val `TVN_ITEMEXPANDINGA`: UInt = 4294966891u;
public const val `TVN_ITEMEXPANDINGW`: UInt = 4294966842u;
public const val `TVN_KEYDOWN`: UInt = 4294966884u;
public const val `TVN_LAST`: UInt = 4294966797u;
public const val `TVN_SELCHANGED`: UInt = 4294966845u;
public const val `TVN_SELCHANGEDA`: UInt = 4294966894u;
public const val `TVN_SELCHANGEDW`: UInt = 4294966845u;
public const val `TVN_SELCHANGING`: UInt = 4294966846u;
public const val `TVN_SELCHANGINGA`: UInt = 4294966895u;
public const val `TVN_SELCHANGINGW`: UInt = 4294966846u;
public const val `TVN_SETDISPINFO`: UInt = 4294966843u;
public const val `TVN_SETDISPINFOA`: UInt = 4294966892u;
public const val `TVN_SETDISPINFOW`: UInt = 4294966843u;
public const val `TVN_SINGLEEXPAND`: UInt = 4294966881u;
public const val `TVP_BRANCH`: `TREEVIEWPARTS` = 3;
public const val `TVP_GLYPH`: `TREEVIEWPARTS` = 2;
public const val `TVP_HOTGLYPH`: `TREEVIEWPARTS` = 4;
public const val `TVP_TREEITEM`: `TREEVIEWPARTS` = 1;
public const val `TVSBF_XBORDER`: UInt = 1u;
public const val `TVSBF_YBORDER`: UInt = 2u;
public const val `TVSIL_NORMAL`: UInt = 0u;
public const val `TVSIL_STATE`: UInt = 2u;
public const val `TVSI_NOSINGLEEXPAND`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TVSORTCB` (
    public var `hParent`: `HTREEITEM`,
    public var `lpfnCompare`: `PFNTVCOMPARE`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
)
public const val `TVS_CHECKBOXES`: UInt = 256u;
public const val `TVS_DISABLEDRAGDROP`: UInt = 16u;
public const val `TVS_EDITLABELS`: UInt = 8u;
public const val `TVS_EX_AUTOHSCROLL`: UInt = 32u;
public const val `TVS_EX_DIMMEDCHECKBOXES`: UInt = 512u;
public const val `TVS_EX_DOUBLEBUFFER`: UInt = 4u;
public const val `TVS_EX_DRAWIMAGEASYNC`: UInt = 1024u;
public const val `TVS_EX_EXCLUSIONCHECKBOXES`: UInt = 256u;
public const val `TVS_EX_FADEINOUTEXPANDOS`: UInt = 64u;
public const val `TVS_EX_MULTISELECT`: UInt = 2u;
public const val `TVS_EX_NOINDENTSTATE`: UInt = 8u;
public const val `TVS_EX_NOSINGLECOLLAPSE`: UInt = 1u;
public const val `TVS_EX_PARTIALCHECKBOXES`: UInt = 128u;
public const val `TVS_EX_RICHTOOLTIP`: UInt = 16u;
public const val `TVS_FULLROWSELECT`: UInt = 4096u;
public const val `TVS_HASBUTTONS`: UInt = 1u;
public const val `TVS_HASLINES`: UInt = 2u;
public const val `TVS_INFOTIP`: UInt = 2048u;
public const val `TVS_LINESATROOT`: UInt = 4u;
public const val `TVS_NOHSCROLL`: UInt = 32768u;
public const val `TVS_NONEVENHEIGHT`: UInt = 16384u;
public const val `TVS_NOSCROLL`: UInt = 8192u;
public const val `TVS_NOTOOLTIPS`: UInt = 128u;
public const val `TVS_RTLREADING`: UInt = 64u;
public const val `TVS_SHOWSELALWAYS`: UInt = 32u;
public const val `TVS_SINGLEEXPAND`: UInt = 1024u;
public const val `TVS_TRACKSELECT`: UInt = 512u;
public const val `TV_FIRST`: UInt = 4352u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UDACCEL` (
    public var `nSec`: UInt,
    public var `nInc`: UInt,
)
public const val `UDM_GETACCEL`: UInt = 1132u;
public const val `UDM_GETBASE`: UInt = 1134u;
public const val `UDM_GETBUDDY`: UInt = 1130u;
public const val `UDM_GETPOS`: UInt = 1128u;
public const val `UDM_GETPOS32`: UInt = 1138u;
public const val `UDM_GETRANGE`: UInt = 1126u;
public const val `UDM_GETRANGE32`: UInt = 1136u;
public const val `UDM_GETUNICODEFORMAT`: UInt = 8198u;
public const val `UDM_SETACCEL`: UInt = 1131u;
public const val `UDM_SETBASE`: UInt = 1133u;
public const val `UDM_SETBUDDY`: UInt = 1129u;
public const val `UDM_SETPOS`: UInt = 1127u;
public const val `UDM_SETPOS32`: UInt = 1137u;
public const val `UDM_SETRANGE`: UInt = 1125u;
public const val `UDM_SETRANGE32`: UInt = 1135u;
public const val `UDM_SETUNICODEFORMAT`: UInt = 8197u;
public const val `UDN_DELTAPOS`: UInt = 4294966574u;
public const val `UDN_FIRST`: UInt = 4294966575u;
public const val `UDN_LAST`: UInt = 4294966567u;
public const val `UDS_ALIGNLEFT`: UInt = 8u;
public const val `UDS_ALIGNRIGHT`: UInt = 4u;
public const val `UDS_ARROWKEYS`: UInt = 32u;
public const val `UDS_AUTOBUDDY`: UInt = 16u;
public const val `UDS_HORZ`: UInt = 64u;
public const val `UDS_HOTTRACK`: UInt = 256u;
public const val `UDS_NOTHOUSANDS`: UInt = 128u;
public const val `UDS_SETBUDDYINT`: UInt = 2u;
public const val `UDS_WRAP`: UInt = 1u;
public const val `UD_MAXVAL`: UInt = 32767u;
public typealias `UPDATEMETADATASTATES` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UPDOWN_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_updown32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UPDOWN_CLASSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("msctls_updown32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `UPDOWN_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("msctls_updown32");
public typealias `UPHORZSTATES` = Int;
public const val `UPHZS_DISABLED`: `UPHORZSTATES` = 4;
public const val `UPHZS_HOT`: `UPHORZSTATES` = 2;
public const val `UPHZS_NORMAL`: `UPHORZSTATES` = 1;
public const val `UPHZS_PRESSED`: `UPHORZSTATES` = 3;
public typealias `UPSTATES` = Int;
public const val `UPS_DISABLED`: `UPSTATES` = 4;
public const val `UPS_HOT`: `UPSTATES` = 2;
public const val `UPS_NORMAL`: `UPSTATES` = 1;
public const val `UPS_PRESSED`: `UPSTATES` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USAGE_PROPERTIES` (
    public var `level`: UShort,
    public var `page`: UShort,
    public var `usage`: UShort,
    public var `logicalMinimum`: Int,
    public var `logicalMaximum`: Int,
    public var `unit`: UShort,
    public var `exponent`: UShort,
    public var `count`: UByte,
    public var `physicalMinimum`: Int,
    public var `physicalMaximum`: Int,
)
public typealias `USERTILEPARTS` = Int;
public const val `UTP_HOVERBACKGROUND`: `USERTILEPARTS` = 2;
public const val `UTP_STROKEBACKGROUND`: `USERTILEPARTS` = 1;
public const val `UTS_HOT`: `HOVERBACKGROUNDSTATES` = 2;
public const val `UTS_NORMAL`: `HOVERBACKGROUNDSTATES` = 1;
public const val `UTS_PRESSED`: `HOVERBACKGROUNDSTATES` = 3;
public const val `VALIDBITS`: `SET_THEME_APP_PROPERTIES_FLAGS` = 7u;
public typealias `VALIGN` = Int;
public const val `VA_BOTTOM`: `VALIGN` = 2;
public const val `VA_CENTER`: `VALIGN` = 1;
public const val `VA_TOP`: `VALIGN` = 0;
public typealias `VERTSCROLLSTATES` = Int;
public typealias `VERTTHUMBSTATES` = Int;
public const val `VIEW_DETAILS`: UInt = 3u;
public const val `VIEW_LARGEICONS`: UInt = 0u;
public const val `VIEW_LIST`: UInt = 2u;
public const val `VIEW_NETCONNECT`: UInt = 9u;
public const val `VIEW_NETDISCONNECT`: UInt = 10u;
public const val `VIEW_NEWFOLDER`: UInt = 11u;
public const val `VIEW_PARENTFOLDER`: UInt = 8u;
public const val `VIEW_SMALLICONS`: UInt = 1u;
public const val `VIEW_SORTDATE`: UInt = 6u;
public const val `VIEW_SORTNAME`: UInt = 4u;
public const val `VIEW_SORTSIZE`: UInt = 5u;
public const val `VIEW_SORTTYPE`: UInt = 7u;
public const val `VIEW_VIEWMENU`: UInt = 12u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_AEROWIZARD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AEROWIZARD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_AEROWIZARDSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AEROWIZARDSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_BUTTON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BUTTON");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_BUTTONSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BUTTONSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_CLOCK`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CLOCK");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_COMBOBOX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("COMBOBOX");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_COMBOBOXSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("COMBOBOXSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_COMMUNICATIONS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("COMMUNICATIONS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_COMMUNICATIONSSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("COMMUNICATIONSSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_CONTROLPANEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CONTROLPANEL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_CONTROLPANELSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CONTROLPANELSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_DATEPICKER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DATEPICKER");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_DATEPICKERSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DATEPICKERSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_DRAGDROP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DRAGDROP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_DRAGDROPSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DRAGDROPSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_EDIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EDIT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_EDITSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EDITSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_EMPTYMARKUP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EMPTYMARKUP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_EXPLORERBAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EXPLORERBAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_EXPLORERBARSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EXPLORERBARSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_FLYOUT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FLYOUT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_FLYOUTSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FLYOUTSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_HEADER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HEADER");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_HEADERSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HEADERSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_LINK`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LINK");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_LISTBOX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LISTBOX");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_LISTBOXSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LISTBOXSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_LISTVIEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LISTVIEW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_LISTVIEWSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LISTVIEWSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_MENU`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MENU");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_MENUBAND`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MENUBAND");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_MENUSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MENUSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_MONTHCAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MONTHCAL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_NAVIGATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NAVIGATION");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_PAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PAGE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_PROGRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PROGRESS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_PROGRESSSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PROGRESSSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_REBAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("REBAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_REBARSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("REBARSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_SCROLLBAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SCROLLBAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_SCROLLBARSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SCROLLBARSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_SPIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SPIN");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_SPINSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SPINSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_STARTPANEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("STARTPANEL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_STATIC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("STATIC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_STATUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("STATUS");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_STATUSSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("STATUSSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TAB`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TAB");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TABSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TABSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TASKBAND`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TASKBAND");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TASKBAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TASKBAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TASKDIALOG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TASKDIALOG");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TASKDIALOGSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TASKDIALOGSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TEXTSELECTIONGRIPPER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TEXTSELECTIONGRIPPER");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TEXTSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TEXTSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TOOLBAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TOOLBAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TOOLBARSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TOOLBARSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TOOLTIP`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TOOLTIP");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TOOLTIPSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TOOLTIPSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TRACKBAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TRACKBAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TRACKBARSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TRACKBARSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TRAYNOTIFY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TRAYNOTIFY");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TREEVIEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TREEVIEW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_TREEVIEWSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TREEVIEWSTYLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_USERTILE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("USERTILE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_WINDOW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WINDOW");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VSCLASS_WINDOWSTYLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WINDOWSTYLE");
public const val `VSS_DISABLED`: `VERTSCROLLSTATES` = 4;
public const val `VSS_HOT`: `VERTSCROLLSTATES` = 2;
public const val `VSS_NORMAL`: `VERTSCROLLSTATES` = 1;
public const val `VSS_PUSHED`: `VERTSCROLLSTATES` = 3;
public const val `VTS_DISABLED`: `VERTTHUMBSTATES` = 4;
public const val `VTS_HOT`: `VERTTHUMBSTATES` = 2;
public const val `VTS_NORMAL`: `VERTTHUMBSTATES` = 1;
public const val `VTS_PUSHED`: `VERTTHUMBSTATES` = 3;
public typealias `WARNINGSTATES` = Int;
public const val `WB_CLASSIFY`: `WORD_BREAK_ACTION` = 3;
public const val `WB_ISDELIMITER`: `WORD_BREAK_ACTION` = 2;
public const val `WB_LEFT`: `WORD_BREAK_ACTION` = 0;
public const val `WB_LEFTBREAK`: `WORD_BREAK_ACTION` = 6;
public const val `WB_MOVEWORDLEFT`: `WORD_BREAK_ACTION` = 4;
public const val `WB_MOVEWORDRIGHT`: `WORD_BREAK_ACTION` = 5;
public const val `WB_RIGHT`: `WORD_BREAK_ACTION` = 1;
public const val `WB_RIGHTBREAK`: `WORD_BREAK_ACTION` = 7;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_BUTTON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Button");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_BUTTONA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Button");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_BUTTONW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Button");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_COMBOBOX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ComboBox");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_COMBOBOXA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ComboBox");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_COMBOBOXEX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ComboBoxEx32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_COMBOBOXEXA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ComboBoxEx32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_COMBOBOXEXW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ComboBoxEx32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_COMBOBOXW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ComboBox");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_EDIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Edit");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_EDITA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Edit");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_EDITW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Edit");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_HEADER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysHeader32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_HEADERA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysHeader32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_HEADERW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysHeader32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_IPADDRESS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysIPAddress32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_IPADDRESSA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysIPAddress32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_IPADDRESSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysIPAddress32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_LINK`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysLink");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_LISTBOX`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ListBox");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_LISTBOXA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ListBox");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_LISTBOXW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ListBox");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_LISTVIEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysListView32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_LISTVIEWA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysListView32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_LISTVIEWW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysListView32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_NATIVEFONTCTL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NativeFontCtl");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_NATIVEFONTCTLA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("NativeFontCtl");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_NATIVEFONTCTLW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NativeFontCtl");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_PAGESCROLLER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysPager");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_PAGESCROLLERA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysPager");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_PAGESCROLLERW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysPager");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_SCROLLBAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ScrollBar");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_SCROLLBARA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("ScrollBar");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_SCROLLBARW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ScrollBar");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_STATIC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Static");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_STATICA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("Static");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_STATICW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Static");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_TABCONTROL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysTabControl32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_TABCONTROLA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysTabControl32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_TABCONTROLW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysTabControl32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_TREEVIEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysTreeView32");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_TREEVIEWA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("SysTreeView32");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WC_TREEVIEWW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SysTreeView32");
public typealias `WINDOWPARTS` = Int;
public typealias `WINDOWTHEMEATTRIBUTETYPE` = Int;
public const val `WIZ_BODYCX`: UInt = 184u;
public const val `WIZ_BODYX`: UInt = 92u;
public const val `WIZ_CXBMP`: UInt = 80u;
public const val `WIZ_CXDLG`: UInt = 276u;
public const val `WIZ_CYDLG`: UInt = 140u;
public const val `WMN_FIRST`: UInt = 4294966296u;
public const val `WMN_LAST`: UInt = 4294966096u;
public const val `WM_CTLCOLOR`: UInt = 25u;
public const val `WM_MOUSEHOVER`: UInt = 673u;
public const val `WM_MOUSELEAVE`: UInt = 675u;
public typealias `WORD_BREAK_ACTION` = Int;
public const val `WP_BORDER`: `WINDOWPARTS` = 39;
public const val `WP_CAPTION`: `WINDOWPARTS` = 1;
public const val `WP_CAPTIONSIZINGTEMPLATE`: `WINDOWPARTS` = 30;
public const val `WP_CLOSEBUTTON`: `WINDOWPARTS` = 18;
public const val `WP_DIALOG`: `WINDOWPARTS` = 29;
public const val `WP_FRAME`: `WINDOWPARTS` = 38;
public const val `WP_FRAMEBOTTOM`: `WINDOWPARTS` = 9;
public const val `WP_FRAMEBOTTOMSIZINGTEMPLATE`: `WINDOWPARTS` = 36;
public const val `WP_FRAMELEFT`: `WINDOWPARTS` = 7;
public const val `WP_FRAMELEFTSIZINGTEMPLATE`: `WINDOWPARTS` = 32;
public const val `WP_FRAMERIGHT`: `WINDOWPARTS` = 8;
public const val `WP_FRAMERIGHTSIZINGTEMPLATE`: `WINDOWPARTS` = 34;
public const val `WP_HELPBUTTON`: `WINDOWPARTS` = 23;
public const val `WP_HORZSCROLL`: `WINDOWPARTS` = 25;
public const val `WP_HORZTHUMB`: `WINDOWPARTS` = 26;
public const val `WP_MAXBUTTON`: `WINDOWPARTS` = 17;
public const val `WP_MAXCAPTION`: `WINDOWPARTS` = 5;
public const val `WP_MDICLOSEBUTTON`: `WINDOWPARTS` = 20;
public const val `WP_MDIHELPBUTTON`: `WINDOWPARTS` = 24;
public const val `WP_MDIMINBUTTON`: `WINDOWPARTS` = 16;
public const val `WP_MDIRESTOREBUTTON`: `WINDOWPARTS` = 22;
public const val `WP_MDISYSBUTTON`: `WINDOWPARTS` = 14;
public const val `WP_MINBUTTON`: `WINDOWPARTS` = 15;
public const val `WP_MINCAPTION`: `WINDOWPARTS` = 3;
public const val `WP_RESTOREBUTTON`: `WINDOWPARTS` = 21;
public const val `WP_SMALLCAPTION`: `WINDOWPARTS` = 2;
public const val `WP_SMALLCAPTIONSIZINGTEMPLATE`: `WINDOWPARTS` = 31;
public const val `WP_SMALLCLOSEBUTTON`: `WINDOWPARTS` = 19;
public const val `WP_SMALLFRAMEBOTTOM`: `WINDOWPARTS` = 12;
public const val `WP_SMALLFRAMEBOTTOMSIZINGTEMPLATE`: `WINDOWPARTS` = 37;
public const val `WP_SMALLFRAMELEFT`: `WINDOWPARTS` = 10;
public const val `WP_SMALLFRAMELEFTSIZINGTEMPLATE`: `WINDOWPARTS` = 33;
public const val `WP_SMALLFRAMERIGHT`: `WINDOWPARTS` = 11;
public const val `WP_SMALLFRAMERIGHTSIZINGTEMPLATE`: `WINDOWPARTS` = 35;
public const val `WP_SMALLMAXCAPTION`: `WINDOWPARTS` = 6;
public const val `WP_SMALLMINCAPTION`: `WINDOWPARTS` = 4;
public const val `WP_SYSBUTTON`: `WINDOWPARTS` = 13;
public const val `WP_VERTSCROLL`: `WINDOWPARTS` = 27;
public const val `WP_VERTTHUMB`: `WINDOWPARTS` = 28;
public typealias `WRENCHSTATES` = Int;
public typealias `WSB_PROP` = Int;
public const val `WSB_PROP_CXHSCROLL`: `WSB_PROP` = 2;
public const val `WSB_PROP_CXHTHUMB`: `WSB_PROP` = 16;
public const val `WSB_PROP_CXVSCROLL`: `WSB_PROP` = 8;
public const val `WSB_PROP_CYHSCROLL`: `WSB_PROP` = 4;
public const val `WSB_PROP_CYVSCROLL`: `WSB_PROP` = 1;
public const val `WSB_PROP_CYVTHUMB`: `WSB_PROP` = 32;
public const val `WSB_PROP_HBKGCOLOR`: `WSB_PROP` = 128;
public const val `WSB_PROP_HSTYLE`: `WSB_PROP` = 512;
public const val `WSB_PROP_MASK`: Int = 4095;
public const val `WSB_PROP_PALETTE`: `WSB_PROP` = 2048;
public const val `WSB_PROP_VBKGCOLOR`: `WSB_PROP` = 64;
public const val `WSB_PROP_VSTYLE`: `WSB_PROP` = 256;
public const val `WSB_PROP_WINSTYLE`: `WSB_PROP` = 1024;
public const val `WTA_NONCLIENT`: `WINDOWTHEMEATTRIBUTETYPE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WTA_OPTIONS` (
    public var `dwFlags`: UInt,
    public var `dwMask`: UInt,
)
public const val `WTNCA_NODRAWCAPTION`: UInt = 1u;
public const val `WTNCA_NODRAWICON`: UInt = 2u;
public const val `WTNCA_NOMIRRORHELP`: UInt = 8u;
public const val `WTNCA_NOSYSMENU`: UInt = 4u;
public typealias `_LI_METRIC` = Int;
public const val `chx1`: UInt = 1040u;
public const val `chx10`: UInt = 1049u;
public const val `chx11`: UInt = 1050u;
public const val `chx12`: UInt = 1051u;
public const val `chx13`: UInt = 1052u;
public const val `chx14`: UInt = 1053u;
public const val `chx15`: UInt = 1054u;
public const val `chx16`: UInt = 1055u;
public const val `chx2`: UInt = 1041u;
public const val `chx3`: UInt = 1042u;
public const val `chx4`: UInt = 1043u;
public const val `chx5`: UInt = 1044u;
public const val `chx6`: UInt = 1045u;
public const val `chx7`: UInt = 1046u;
public const val `chx8`: UInt = 1047u;
public const val `chx9`: UInt = 1048u;
public const val `cmb1`: UInt = 1136u;
public const val `cmb10`: UInt = 1145u;
public const val `cmb11`: UInt = 1146u;
public const val `cmb12`: UInt = 1147u;
public const val `cmb13`: UInt = 1148u;
public const val `cmb14`: UInt = 1149u;
public const val `cmb15`: UInt = 1150u;
public const val `cmb16`: UInt = 1151u;
public const val `cmb2`: UInt = 1137u;
public const val `cmb3`: UInt = 1138u;
public const val `cmb4`: UInt = 1139u;
public const val `cmb5`: UInt = 1140u;
public const val `cmb6`: UInt = 1141u;
public const val `cmb7`: UInt = 1142u;
public const val `cmb8`: UInt = 1143u;
public const val `cmb9`: UInt = 1144u;
public const val `ctl1`: UInt = 1184u;
public const val `ctlFirst`: UInt = 1024u;
public const val `ctlLast`: UInt = 1279u;
public const val `edt1`: UInt = 1152u;
public const val `edt10`: UInt = 1161u;
public const val `edt11`: UInt = 1162u;
public const val `edt12`: UInt = 1163u;
public const val `edt13`: UInt = 1164u;
public const val `edt14`: UInt = 1165u;
public const val `edt15`: UInt = 1166u;
public const val `edt16`: UInt = 1167u;
public const val `edt2`: UInt = 1153u;
public const val `edt3`: UInt = 1154u;
public const val `edt4`: UInt = 1155u;
public const val `edt5`: UInt = 1156u;
public const val `edt6`: UInt = 1157u;
public const val `edt7`: UInt = 1158u;
public const val `edt8`: UInt = 1159u;
public const val `edt9`: UInt = 1160u;
public const val `frm1`: UInt = 1076u;
public const val `frm2`: UInt = 1077u;
public const val `frm3`: UInt = 1078u;
public const val `frm4`: UInt = 1079u;
public const val `grp1`: UInt = 1072u;
public const val `grp2`: UInt = 1073u;
public const val `grp3`: UInt = 1074u;
public const val `grp4`: UInt = 1075u;
public const val `ico1`: UInt = 1084u;
public const val `ico2`: UInt = 1085u;
public const val `ico3`: UInt = 1086u;
public const val `ico4`: UInt = 1087u;
public const val `lst1`: UInt = 1120u;
public const val `lst10`: UInt = 1129u;
public const val `lst11`: UInt = 1130u;
public const val `lst12`: UInt = 1131u;
public const val `lst13`: UInt = 1132u;
public const val `lst14`: UInt = 1133u;
public const val `lst15`: UInt = 1134u;
public const val `lst16`: UInt = 1135u;
public const val `lst2`: UInt = 1121u;
public const val `lst3`: UInt = 1122u;
public const val `lst4`: UInt = 1123u;
public const val `lst5`: UInt = 1124u;
public const val `lst6`: UInt = 1125u;
public const val `lst7`: UInt = 1126u;
public const val `lst8`: UInt = 1127u;
public const val `lst9`: UInt = 1128u;
public const val `psh1`: UInt = 1024u;
public const val `psh10`: UInt = 1033u;
public const val `psh11`: UInt = 1034u;
public const val `psh12`: UInt = 1035u;
public const val `psh13`: UInt = 1036u;
public const val `psh14`: UInt = 1037u;
public const val `psh15`: UInt = 1038u;
public const val `psh16`: UInt = 1039u;
public const val `psh2`: UInt = 1025u;
public const val `psh3`: UInt = 1026u;
public const val `psh4`: UInt = 1027u;
public const val `psh5`: UInt = 1028u;
public const val `psh6`: UInt = 1029u;
public const val `psh7`: UInt = 1030u;
public const val `psh8`: UInt = 1031u;
public const val `psh9`: UInt = 1032u;
public const val `pshHelp`: UInt = 1038u;
public const val `rad1`: UInt = 1056u;
public const val `rad10`: UInt = 1065u;
public const val `rad11`: UInt = 1066u;
public const val `rad12`: UInt = 1067u;
public const val `rad13`: UInt = 1068u;
public const val `rad14`: UInt = 1069u;
public const val `rad15`: UInt = 1070u;
public const val `rad16`: UInt = 1071u;
public const val `rad2`: UInt = 1057u;
public const val `rad3`: UInt = 1058u;
public const val `rad4`: UInt = 1059u;
public const val `rad5`: UInt = 1060u;
public const val `rad6`: UInt = 1061u;
public const val `rad7`: UInt = 1062u;
public const val `rad8`: UInt = 1063u;
public const val `rad9`: UInt = 1064u;
public const val `rct1`: UInt = 1080u;
public const val `rct2`: UInt = 1081u;
public const val `rct3`: UInt = 1082u;
public const val `rct4`: UInt = 1083u;
public const val `scr1`: UInt = 1168u;
public const val `scr2`: UInt = 1169u;
public const val `scr3`: UInt = 1170u;
public const val `scr4`: UInt = 1171u;
public const val `scr5`: UInt = 1172u;
public const val `scr6`: UInt = 1173u;
public const val `scr7`: UInt = 1174u;
public const val `scr8`: UInt = 1175u;
public const val `stc1`: UInt = 1088u;
public const val `stc10`: UInt = 1097u;
public const val `stc11`: UInt = 1098u;
public const val `stc12`: UInt = 1099u;
public const val `stc13`: UInt = 1100u;
public const val `stc14`: UInt = 1101u;
public const val `stc15`: UInt = 1102u;
public const val `stc16`: UInt = 1103u;
public const val `stc17`: UInt = 1104u;
public const val `stc18`: UInt = 1105u;
public const val `stc19`: UInt = 1106u;
public const val `stc2`: UInt = 1089u;
public const val `stc20`: UInt = 1107u;
public const val `stc21`: UInt = 1108u;
public const val `stc22`: UInt = 1109u;
public const val `stc23`: UInt = 1110u;
public const val `stc24`: UInt = 1111u;
public const val `stc25`: UInt = 1112u;
public const val `stc26`: UInt = 1113u;
public const val `stc27`: UInt = 1114u;
public const val `stc28`: UInt = 1115u;
public const val `stc29`: UInt = 1116u;
public const val `stc3`: UInt = 1090u;
public const val `stc30`: UInt = 1117u;
public const val `stc31`: UInt = 1118u;
public const val `stc32`: UInt = 1119u;
public const val `stc4`: UInt = 1091u;
public const val `stc5`: UInt = 1092u;
public const val `stc6`: UInt = 1093u;
public const val `stc7`: UInt = 1094u;
public const val `stc8`: UInt = 1095u;
public const val `stc9`: UInt = 1096u;
