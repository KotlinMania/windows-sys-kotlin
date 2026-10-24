// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=AddStroke; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `AddStroke`(`hrc` : `HRECOCONTEXT`, `ppacketdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`PACKET_DESCRIPTION`>?, `cbpacket` : UInt, `ppacket` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pxform` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`XFORM`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=AddWordsToWordList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddWordsToWordList`(`hwl` : `HRECOWORDLIST`, `pwcwords` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=AdviseInkChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AdviseInkChange`(`hrc` : `HRECOCONTEXT`, `bnewstroke` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=CreateContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateContext`(`hrec` : `HRECOGNIZER`, `phrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HRECOCONTEXT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=CreateRecognizer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateRecognizer`(`pclsid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `phrec` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HRECOGNIZER`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=DestroyContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyContext`(`hrc` : `HRECOCONTEXT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=DestroyRecognizer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyRecognizer`(`hrec` : `HRECOGNIZER`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=DestroyWordList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyWordList`(`hwl` : `HRECOWORDLIST`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=EndInkInput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EndInkInput`(`hrc` : `HRECOCONTEXT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetAllRecognizers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAllRecognizers`(`recognizerclsids` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`windows_sys`.`core`.`GUID`>>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetBestResultString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBestResultString`(`hrc` : `HRECOCONTEXT`, `pcsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pwcbestresult` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetLatticePtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLatticePtr`(`hrc` : `HRECOCONTEXT`, `pplattice` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RECO_LATTICE`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetLeftSeparator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLeftSeparator`(`hrc` : `HRECOCONTEXT`, `pcsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pwcleftseparator` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetRecoAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRecoAttributes`(`hrec` : `HRECOGNIZER`, `precoattrs` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RECO_ATTRS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetResultPropertyList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetResultPropertyList`(`hrec` : `HRECOGNIZER`, `ppropertycount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppropertyguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetRightSeparator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRightSeparator`(`hrc` : `HRECOCONTEXT`, `pcsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pwcrightseparator` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=GetUnicodeRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUnicodeRanges`(`hrec` : `HRECOGNIZER`, `pcranges` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CHARACTER_RANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=IsStringSupported; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsStringSupported`(`hrc` : `HRECOCONTEXT`, `wcstring` : UInt, `pwcstring` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=LoadCachedAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadCachedAttributes`(`clsid` : `windows_sys`.`core`.`GUID`, `precoattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RECO_ATTRS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=MakeWordList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MakeWordList`(`hrec` : `HRECOGNIZER`, `pbuffer` : `windows_sys`.`core`.`PCWSTR`, `phwl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HRECOWORDLIST`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=Process; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Process`(`hrc` : `HRECOCONTEXT`, `pbpartialprocessing` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=SetEnabledUnicodeRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetEnabledUnicodeRanges`(`hrc` : `HRECOCONTEXT`, `cranges` : UInt, `pcr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CHARACTER_RANGE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=SetFactoid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFactoid`(`hrc` : `HRECOCONTEXT`, `cwcfactoid` : UInt, `pwcfactoid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=SetFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFlags`(`hrc` : `HRECOCONTEXT`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=SetGuide; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetGuide`(`hrc` : `HRECOCONTEXT`, `pguide` : /* Rust *const */ kotlinx.cinterop.CPointer<`RECO_GUIDE`>?, `iindex` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=SetTextContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTextContext`(`hrc` : `HRECOCONTEXT`, `cwcbefore` : UInt, `pwcbefore` : `windows_sys`.`core`.`PCWSTR`, `cwcafter` : UInt, `pwcafter` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=inkobjcore.dll, ABI=system, export=SetWordList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetWordList`(`hrc` : `HRECOCONTEXT`, `hwl` : `HRECOWORDLIST`) : `windows_sys`.`core`.`HRESULT`
public typealias `ALT_BREAKS` = Int;
public const val `ALT_BREAKS_FULL`: `ALT_BREAKS` = 2;
public const val `ALT_BREAKS_SAME`: `ALT_BREAKS` = 0;
public const val `ALT_BREAKS_UNIQUE`: `ALT_BREAKS` = 1;
public const val `ASYNC_RECO_ADDSTROKE_FAILED`: UInt = 4u;
public const val `ASYNC_RECO_INTERRUPTED`: UInt = 1u;
public const val `ASYNC_RECO_PROCESS_FAILED`: UInt = 2u;
public const val `ASYNC_RECO_RESETCONTEXT_FAILED`: UInt = 16u;
public const val `ASYNC_RECO_SETCACMODE_FAILED`: UInt = 8u;
public const val `ASYNC_RECO_SETFACTOID_FAILED`: UInt = 128u;
public const val `ASYNC_RECO_SETFLAGS_FAILED`: UInt = 64u;
public const val `ASYNC_RECO_SETGUIDE_FAILED`: UInt = 32u;
public const val `ASYNC_RECO_SETTEXTCONTEXT_FAILED`: UInt = 256u;
public const val `ASYNC_RECO_SETWORDLIST_FAILED`: UInt = 512u;
public typealias `AppearanceConstants` = Int;
public const val `AsyncStylusQueue`: `StylusQueue` = 3;
public const val `AsyncStylusQueueImmediate`: `StylusQueue` = 2;
public const val `BEST_COMPLETE`: UInt = 2u;
public typealias `BorderStyleConstants` = Int;
public const val `CAC_FULL`: UInt = 0u;
public const val `CAC_PREFIX`: UInt = 1u;
public const val `CAC_RANDOM`: UInt = 2u;
public const val `CFL_INTERMEDIATE`: `CONFIDENCE_LEVEL` = 1;
public const val `CFL_POOR`: `CONFIDENCE_LEVEL` = 2;
public const val `CFL_STRONG`: `CONFIDENCE_LEVEL` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHARACTER_RANGE` (
    public var `wcLow`: UShort,
    public var `cChars`: UShort,
)
public typealias `CONFIDENCE_LEVEL` = Int;
public const val `Closed`: `VisualState` = 4;
public typealias `CorrectionMode` = Int;
public const val `CorrectionMode_NotVisible`: `CorrectionMode` = 0;
public const val `CorrectionMode_PostInsertionCollapsed`: `CorrectionMode` = 2;
public const val `CorrectionMode_PostInsertionExpanded`: `CorrectionMode` = 3;
public const val `CorrectionMode_PreInsertion`: `CorrectionMode` = 1;
public typealias `CorrectionPosition` = Int;
public const val `CorrectionPosition_Auto`: `CorrectionPosition` = 0;
public const val `CorrectionPosition_Bottom`: `CorrectionPosition` = 1;
public const val `CorrectionPosition_Top`: `CorrectionPosition` = 2;
public const val `DISPID_DAAntiAliased`: `DISPID_InkDrawingAttributes` = 6;
public const val `DISPID_DAClone`: `DISPID_InkDrawingAttributes` = 10;
public const val `DISPID_DAColor`: `DISPID_InkDrawingAttributes` = 2;
public const val `DISPID_DAExtendedProperties`: `DISPID_InkDrawingAttributes` = 11;
public const val `DISPID_DAFitToCurve`: `DISPID_InkDrawingAttributes` = 4;
public const val `DISPID_DAHeight`: `DISPID_InkDrawingAttributes` = 1;
public const val `DISPID_DAIgnorePressure`: `DISPID_InkDrawingAttributes` = 5;
public const val `DISPID_DAPenTip`: `DISPID_InkDrawingAttributes` = 9;
public const val `DISPID_DARasterOperation`: `DISPID_InkDrawingAttributes` = 8;
public const val `DISPID_DATransparency`: `DISPID_InkDrawingAttributes` = 7;
public const val `DISPID_DAWidth`: `DISPID_InkDrawingAttributes` = 3;
public const val `DISPID_DisableNoScroll`: `DISPID_InkEdit` = 3;
public const val `DISPID_DragIcon`: `DISPID_InkEdit` = 21;
public const val `DISPID_DrawAttr`: `DISPID_InkEdit` = 27;
public const val `DISPID_Enabled`: `DISPID_InkEdit` = 5;
public const val `DISPID_Factoid`: `DISPID_InkEdit` = 29;
public const val `DISPID_GetGestStatus`: `DISPID_InkEdit` = 33;
public const val `DISPID_Hwnd`: `DISPID_InkEdit` = 2;
public const val `DISPID_IAddStrokesAtRectangle`: `DISPID_Ink` = 17;
public const val `DISPID_ICAutoRedraw`: `DISPID_InkCollector` = 8;
public const val `DISPID_ICBId`: `DISPID_InkCursorButton` = 1;
public const val `DISPID_ICBName`: `DISPID_InkCursorButton` = 0;
public const val `DISPID_ICBState`: `DISPID_InkCursorButton` = 2;
public const val `DISPID_ICBsCount`: `DISPID_InkCursorButtons` = 1;
public const val `DISPID_ICBsItem`: `DISPID_InkCursorButtons` = 0;
public const val `DISPID_ICBs_NewEnum`: `DISPID_InkCursorButtons` = -4;
public const val `DISPID_ICCollectingInk`: `DISPID_InkCollector` = 9;
public const val `DISPID_ICCollectionMode`: `DISPID_InkCollector` = 28;
public const val `DISPID_ICCursors`: `DISPID_InkCollector` = 20;
public const val `DISPID_ICDefaultDrawingAttributes`: `DISPID_InkCollector` = 5;
public const val `DISPID_ICDesiredPacketDescription`: `DISPID_InkCollector` = 32;
public const val `DISPID_ICDynamicRendering`: `DISPID_InkCollector` = 31;
public const val `DISPID_ICECursorButtonDown`: `DISPID_InkCollectorEvent` = 5;
public const val `DISPID_ICECursorButtonUp`: `DISPID_InkCollectorEvent` = 6;
public const val `DISPID_ICECursorDown`: `DISPID_InkCollectorEvent` = 2;
public const val `DISPID_ICECursorInRange`: `DISPID_InkCollectorEvent` = 7;
public const val `DISPID_ICECursorOutOfRange`: `DISPID_InkCollectorEvent` = 8;
public const val `DISPID_ICEGesture`: `DISPID_InkCollectorEvent` = 10;
public const val `DISPID_ICENewInAirPackets`: `DISPID_InkCollectorEvent` = 4;
public const val `DISPID_ICENewPackets`: `DISPID_InkCollectorEvent` = 3;
public const val `DISPID_ICEStroke`: `DISPID_InkCollectorEvent` = 1;
public const val `DISPID_ICESystemGesture`: `DISPID_InkCollectorEvent` = 9;
public const val `DISPID_ICETabletAdded`: `DISPID_InkCollectorEvent` = 11;
public const val `DISPID_ICETabletRemoved`: `DISPID_InkCollectorEvent` = 12;
public const val `DISPID_ICEnabled`: `DISPID_InkCollector` = 1;
public const val `DISPID_ICGetEventInterest`: `DISPID_InkCollector` = 11;
public const val `DISPID_ICGetGestureStatus`: `DISPID_InkCollector` = 30;
public const val `DISPID_ICGetWindowInputRectangle`: `DISPID_InkCollector` = 24;
public const val `DISPID_ICHwnd`: `DISPID_InkCollector` = 2;
public const val `DISPID_ICInk`: `DISPID_InkCollector` = 7;
public const val `DISPID_ICMarginX`: `DISPID_InkCollector` = 21;
public const val `DISPID_ICMarginY`: `DISPID_InkCollector` = 22;
public const val `DISPID_ICMouseIcon`: `DISPID_InkCollector` = 35;
public const val `DISPID_ICMousePointer`: `DISPID_InkCollector` = 36;
public const val `DISPID_ICPaint`: `DISPID_InkCollector` = 3;
public const val `DISPID_ICRenderer`: `DISPID_InkCollector` = 6;
public const val `DISPID_ICSetAllTabletsMode`: `DISPID_InkCollector` = 26;
public const val `DISPID_ICSetEventInterest`: `DISPID_InkCollector` = 10;
public const val `DISPID_ICSetGestureStatus`: `DISPID_InkCollector` = 29;
public const val `DISPID_ICSetSingleTabletIntegratedMode`: `DISPID_InkCollector` = 27;
public const val `DISPID_ICSetWindowInputRectangle`: `DISPID_InkCollector` = 23;
public const val `DISPID_ICSsAdd`: `DISPID_InkCustomStrokes` = 2;
public const val `DISPID_ICSsClear`: `DISPID_InkCustomStrokes` = 4;
public const val `DISPID_ICSsCount`: `DISPID_InkCustomStrokes` = 1;
public const val `DISPID_ICSsItem`: `DISPID_InkCustomStrokes` = 0;
public const val `DISPID_ICSsRemove`: `DISPID_InkCustomStrokes` = 3;
public const val `DISPID_ICSs_NewEnum`: `DISPID_InkCustomStrokes` = -4;
public const val `DISPID_ICSupportHighContrastInk`: `DISPID_InkCollector` = 38;
public const val `DISPID_ICTablet`: `DISPID_InkCollector` = 25;
public const val `DISPID_ICText`: `DISPID_InkCollector` = 4;
public const val `DISPID_ICanPaste`: `DISPID_Ink` = 24;
public const val `DISPID_IClip`: `DISPID_Ink` = 18;
public const val `DISPID_IClipboardCopy`: `DISPID_Ink` = 23;
public const val `DISPID_IClipboardCopyWithRectangle`: `DISPID_Ink` = 22;
public const val `DISPID_IClipboardPaste`: `DISPID_Ink` = 25;
public const val `DISPID_IClone`: `DISPID_Ink` = 10;
public const val `DISPID_ICreateStroke`: `DISPID_Ink` = 16;
public const val `DISPID_ICreateStrokeFromPoints`: `DISPID_Ink` = 21;
public const val `DISPID_ICreateStrokes`: `DISPID_Ink` = 15;
public const val `DISPID_ICsCount`: `DISPID_InkCursors` = 1;
public const val `DISPID_ICsItem`: `DISPID_InkCursors` = 0;
public const val `DISPID_ICs_NewEnum`: `DISPID_InkCursors` = -4;
public const val `DISPID_ICsrButtons`: `DISPID_InkCursor` = 3;
public const val `DISPID_ICsrDrawingAttributes`: `DISPID_InkCursor` = 2;
public const val `DISPID_ICsrId`: `DISPID_InkCursor` = 1;
public const val `DISPID_ICsrInverted`: `DISPID_InkCursor` = 4;
public const val `DISPID_ICsrName`: `DISPID_InkCursor` = 0;
public const val `DISPID_ICsrTablet`: `DISPID_InkCursor` = 5;
public const val `DISPID_ICustomStrokes`: `DISPID_Ink` = 9;
public const val `DISPID_IDeleteStroke`: `DISPID_Ink` = 5;
public const val `DISPID_IDeleteStrokes`: `DISPID_Ink` = 4;
public const val `DISPID_IDirty`: `DISPID_Ink` = 8;
public const val `DISPID_IEInkAdded`: `DISPID_InkEvent` = 1;
public const val `DISPID_IEInkDeleted`: `DISPID_InkEvent` = 2;
public const val `DISPID_IEPData`: `DISPID_InkExtendedProperty` = 2;
public const val `DISPID_IEPGuid`: `DISPID_InkExtendedProperty` = 1;
public const val `DISPID_IEPsAdd`: `DISPID_InkExtendedProperties` = 2;
public const val `DISPID_IEPsClear`: `DISPID_InkExtendedProperties` = 4;
public const val `DISPID_IEPsCount`: `DISPID_InkExtendedProperties` = 1;
public const val `DISPID_IEPsDoesPropertyExist`: `DISPID_InkExtendedProperties` = 5;
public const val `DISPID_IEPsItem`: `DISPID_InkExtendedProperties` = 0;
public const val `DISPID_IEPsRemove`: `DISPID_InkExtendedProperties` = 3;
public const val `DISPID_IEPs_NewEnum`: `DISPID_InkExtendedProperties` = -4;
public const val `DISPID_IExtendedProperties`: `DISPID_Ink` = 2;
public const val `DISPID_IExtractStrokes`: `DISPID_Ink` = 6;
public const val `DISPID_IExtractWithRectangle`: `DISPID_Ink` = 7;
public const val `DISPID_IGConfidence`: `DISPID_InkGesture` = 2;
public const val `DISPID_IGGetHotPoint`: `DISPID_InkGesture` = 1;
public const val `DISPID_IGId`: `DISPID_InkGesture` = 0;
public const val `DISPID_IGetBoundingBox`: `DISPID_Ink` = 3;
public const val `DISPID_IHitTestCircle`: `DISPID_Ink` = 11;
public const val `DISPID_IHitTestWithLasso`: `DISPID_Ink` = 13;
public const val `DISPID_IHitTestWithRectangle`: `DISPID_Ink` = 12;
public const val `DISPID_IInkDivider_Divide`: `DISPID_InkDivider` = 4;
public const val `DISPID_IInkDivider_LineHeight`: `DISPID_InkDivider` = 3;
public const val `DISPID_IInkDivider_RecognizerContext`: `DISPID_InkDivider` = 2;
public const val `DISPID_IInkDivider_Strokes`: `DISPID_InkDivider` = 1;
public const val `DISPID_IInkDivisionResult_ResultByType`: `DISPID_InkDivisionResult` = 2;
public const val `DISPID_IInkDivisionResult_Strokes`: `DISPID_InkDivisionResult` = 1;
public const val `DISPID_IInkDivisionUnit_DivisionType`: `DISPID_InkDivisionUnit` = 2;
public const val `DISPID_IInkDivisionUnit_RecognizedString`: `DISPID_InkDivisionUnit` = 3;
public const val `DISPID_IInkDivisionUnit_RotationTransform`: `DISPID_InkDivisionUnit` = 4;
public const val `DISPID_IInkDivisionUnit_Strokes`: `DISPID_InkDivisionUnit` = 1;
public const val `DISPID_IInkDivisionUnits_Count`: `DISPID_InkDivisionUnits` = 1;
public const val `DISPID_IInkDivisionUnits_Item`: `DISPID_InkDivisionUnits` = 0;
public const val `DISPID_IInkDivisionUnits_NewEnum`: `DISPID_InkDivisionUnits` = -4;
public const val `DISPID_ILoad`: `DISPID_Ink` = 20;
public const val `DISPID_INearestPoint`: `DISPID_Ink` = 14;
public const val `DISPID_IOAttachMode`: `DISPID_InkCollector` = 14;
public const val `DISPID_IODraw`: `DISPID_InkCollector` = 16;
public const val `DISPID_IOEPainted`: `DISPID_InkCollectorEvent` = 14;
public const val `DISPID_IOEPainting`: `DISPID_InkCollectorEvent` = 13;
public const val `DISPID_IOESelectionChanged`: `DISPID_InkCollectorEvent` = 16;
public const val `DISPID_IOESelectionChanging`: `DISPID_InkCollectorEvent` = 15;
public const val `DISPID_IOESelectionMoved`: `DISPID_InkCollectorEvent` = 18;
public const val `DISPID_IOESelectionMoving`: `DISPID_InkCollectorEvent` = 17;
public const val `DISPID_IOESelectionResized`: `DISPID_InkCollectorEvent` = 20;
public const val `DISPID_IOESelectionResizing`: `DISPID_InkCollectorEvent` = 19;
public const val `DISPID_IOEStrokesDeleted`: `DISPID_InkCollectorEvent` = 22;
public const val `DISPID_IOEStrokesDeleting`: `DISPID_InkCollectorEvent` = 21;
public const val `DISPID_IOEditingMode`: `DISPID_InkCollector` = 12;
public const val `DISPID_IOEraserMode`: `DISPID_InkCollector` = 33;
public const val `DISPID_IOEraserWidth`: `DISPID_InkCollector` = 34;
public const val `DISPID_IOHitTestSelection`: `DISPID_InkCollector` = 15;
public const val `DISPID_IOSelection`: `DISPID_InkCollector` = 13;
public const val `DISPID_IOSupportHighContrastSelectionUI`: `DISPID_InkCollector` = 39;
public const val `DISPID_IPBackColor`: `DISPID_InkCollector` = 19;
public const val `DISPID_IPEChangeUICues`: `DISPID_InkCollectorEvent` = 23;
public const val `DISPID_IPEClick`: `DISPID_InkCollectorEvent` = 24;
public const val `DISPID_IPEDblClick`: `DISPID_InkCollectorEvent` = 25;
public const val `DISPID_IPEInvalidated`: `DISPID_InkCollectorEvent` = 26;
public const val `DISPID_IPEKeyDown`: `DISPID_InkCollectorEvent` = 37;
public const val `DISPID_IPEKeyPress`: `DISPID_InkCollectorEvent` = 38;
public const val `DISPID_IPEKeyUp`: `DISPID_InkCollectorEvent` = 39;
public const val `DISPID_IPEMouseDown`: `DISPID_InkCollectorEvent` = 27;
public const val `DISPID_IPEMouseEnter`: `DISPID_InkCollectorEvent` = 28;
public const val `DISPID_IPEMouseHover`: `DISPID_InkCollectorEvent` = 29;
public const val `DISPID_IPEMouseLeave`: `DISPID_InkCollectorEvent` = 30;
public const val `DISPID_IPEMouseMove`: `DISPID_InkCollectorEvent` = 31;
public const val `DISPID_IPEMouseUp`: `DISPID_InkCollectorEvent` = 32;
public const val `DISPID_IPEMouseWheel`: `DISPID_InkCollectorEvent` = 33;
public const val `DISPID_IPEResize`: `DISPID_InkCollectorEvent` = 40;
public const val `DISPID_IPESizeChanged`: `DISPID_InkCollectorEvent` = 41;
public const val `DISPID_IPESizeModeChanged`: `DISPID_InkCollectorEvent` = 34;
public const val `DISPID_IPEStyleChanged`: `DISPID_InkCollectorEvent` = 35;
public const val `DISPID_IPESystemColorsChanged`: `DISPID_InkCollectorEvent` = 36;
public const val `DISPID_IPInkEnabled`: `DISPID_InkCollector` = 37;
public const val `DISPID_IPPicture`: `DISPID_InkCollector` = 17;
public const val `DISPID_IPSizeMode`: `DISPID_InkCollector` = 18;
public const val `DISPID_IRBottom`: `DISPID_InkRectangle` = 3;
public const val `DISPID_IRData`: `DISPID_InkRectangle` = 7;
public const val `DISPID_IRDraw`: `DISPID_InkRenderer` = 5;
public const val `DISPID_IRDrawStroke`: `DISPID_InkRenderer` = 6;
public const val `DISPID_IRERecognition`: `DISPID_InkRecognitionEvent` = 2;
public const val `DISPID_IRERecognitionWithAlternates`: `DISPID_InkRecognitionEvent` = 1;
public const val `DISPID_IRGColumns`: `DISPID_InkRecognizerGuide` = 4;
public const val `DISPID_IRGDrawnBox`: `DISPID_InkRecognizerGuide` = 2;
public const val `DISPID_IRGGuideData`: `DISPID_InkRecognizerGuide` = 6;
public const val `DISPID_IRGMidline`: `DISPID_InkRecognizerGuide` = 5;
public const val `DISPID_IRGRows`: `DISPID_InkRecognizerGuide` = 3;
public const val `DISPID_IRGWritingBox`: `DISPID_InkRecognizerGuide` = 1;
public const val `DISPID_IRGetObjectTransform`: `DISPID_InkRenderer` = 3;
public const val `DISPID_IRGetRectangle`: `DISPID_InkRectangle` = 5;
public const val `DISPID_IRGetViewTransform`: `DISPID_InkRenderer` = 1;
public const val `DISPID_IRInkSpaceToPixel`: `DISPID_InkRenderer` = 8;
public const val `DISPID_IRInkSpaceToPixelFromPoints`: `DISPID_InkRenderer` = 10;
public const val `DISPID_IRLeft`: `DISPID_InkRectangle` = 2;
public const val `DISPID_IRMeasure`: `DISPID_InkRenderer` = 11;
public const val `DISPID_IRMeasureStroke`: `DISPID_InkRenderer` = 12;
public const val `DISPID_IRMove`: `DISPID_InkRenderer` = 13;
public const val `DISPID_IRPixelToInkSpace`: `DISPID_InkRenderer` = 7;
public const val `DISPID_IRPixelToInkSpaceFromPoints`: `DISPID_InkRenderer` = 9;
public const val `DISPID_IRRight`: `DISPID_InkRectangle` = 4;
public const val `DISPID_IRRotate`: `DISPID_InkRenderer` = 14;
public const val `DISPID_IRScale`: `DISPID_InkRenderer` = 15;
public const val `DISPID_IRSetObjectTransform`: `DISPID_InkRenderer` = 4;
public const val `DISPID_IRSetRectangle`: `DISPID_InkRectangle` = 6;
public const val `DISPID_IRSetViewTransform`: `DISPID_InkRenderer` = 2;
public const val `DISPID_IRTop`: `DISPID_InkRectangle` = 1;
public const val `DISPID_IRecoCtx2_EnabledUnicodeRanges`: `DISPID_InkRecoContext2` = 0;
public const val `DISPID_IRecoCtx_BackgroundRecognize`: `DISPID_InkRecoContext` = 15;
public const val `DISPID_IRecoCtx_BackgroundRecognizeWithAlternates`: `DISPID_InkRecoContext` = 16;
public const val `DISPID_IRecoCtx_CharacterAutoCompletionMode`: `DISPID_InkRecoContext` = 2;
public const val `DISPID_IRecoCtx_Clone`: `DISPID_InkRecoContext` = 11;
public const val `DISPID_IRecoCtx_EndInkInput`: `DISPID_InkRecoContext` = 14;
public const val `DISPID_IRecoCtx_Factoid`: `DISPID_InkRecoContext` = 3;
public const val `DISPID_IRecoCtx_Flags`: `DISPID_InkRecoContext` = 7;
public const val `DISPID_IRecoCtx_Guide`: `DISPID_InkRecoContext` = 6;
public const val `DISPID_IRecoCtx_IsStringSupported`: `DISPID_InkRecoContext` = 17;
public const val `DISPID_IRecoCtx_PrefixText`: `DISPID_InkRecoContext` = 8;
public const val `DISPID_IRecoCtx_Recognize`: `DISPID_InkRecoContext` = 12;
public const val `DISPID_IRecoCtx_Recognizer`: `DISPID_InkRecoContext` = 5;
public const val `DISPID_IRecoCtx_StopBackgroundRecognition`: `DISPID_InkRecoContext` = 13;
public const val `DISPID_IRecoCtx_StopRecognition`: `DISPID_InkRecoContext` = 10;
public const val `DISPID_IRecoCtx_Strokes`: `DISPID_InkRecoContext` = 1;
public const val `DISPID_IRecoCtx_SuffixText`: `DISPID_InkRecoContext` = 9;
public const val `DISPID_IRecoCtx_WordList`: `DISPID_InkRecoContext` = 4;
public const val `DISPID_IRecosCount`: `DISPID_InkRecognizers` = 1;
public const val `DISPID_IRecosGetDefaultRecognizer`: `DISPID_InkRecognizers` = 2;
public const val `DISPID_IRecosItem`: `DISPID_InkRecognizers` = 0;
public const val `DISPID_IRecos_NewEnum`: `DISPID_InkRecognizers` = -4;
public const val `DISPID_ISDBezierCusps`: `DISPID_InkStrokeDisp` = 15;
public const val `DISPID_ISDBezierPoints`: `DISPID_InkStrokeDisp` = 13;
public const val `DISPID_ISDClip`: `DISPID_InkStrokeDisp` = 7;
public const val `DISPID_ISDDeleted`: `DISPID_InkStrokeDisp` = 20;
public const val `DISPID_ISDDrawingAttributes`: `DISPID_InkStrokeDisp` = 4;
public const val `DISPID_ISDExtendedProperties`: `DISPID_InkStrokeDisp` = 11;
public const val `DISPID_ISDFindIntersections`: `DISPID_InkStrokeDisp` = 5;
public const val `DISPID_ISDGetBoundingBox`: `DISPID_InkStrokeDisp` = 3;
public const val `DISPID_ISDGetFlattenedBezierPoints`: `DISPID_InkStrokeDisp` = 27;
public const val `DISPID_ISDGetPacketData`: `DISPID_InkStrokeDisp` = 24;
public const val `DISPID_ISDGetPacketDescriptionPropertyMetrics`: `DISPID_InkStrokeDisp` = 21;
public const val `DISPID_ISDGetPacketValuesByProperty`: `DISPID_InkStrokeDisp` = 25;
public const val `DISPID_ISDGetPoints`: `DISPID_InkStrokeDisp` = 22;
public const val `DISPID_ISDGetRectangleIntersections`: `DISPID_InkStrokeDisp` = 6;
public const val `DISPID_ISDHitTestCircle`: `DISPID_InkStrokeDisp` = 8;
public const val `DISPID_ISDID`: `DISPID_InkStrokeDisp` = 2;
public const val `DISPID_ISDInk`: `DISPID_InkStrokeDisp` = 12;
public const val `DISPID_ISDInkIndex`: `DISPID_InkStrokeDisp` = 1;
public const val `DISPID_ISDMove`: `DISPID_InkStrokeDisp` = 30;
public const val `DISPID_ISDNearestPoint`: `DISPID_InkStrokeDisp` = 9;
public const val `DISPID_ISDPacketCount`: `DISPID_InkStrokeDisp` = 17;
public const val `DISPID_ISDPacketDescription`: `DISPID_InkStrokeDisp` = 19;
public const val `DISPID_ISDPacketSize`: `DISPID_InkStrokeDisp` = 18;
public const val `DISPID_ISDPolylineCusps`: `DISPID_InkStrokeDisp` = 14;
public const val `DISPID_ISDRotate`: `DISPID_InkStrokeDisp` = 31;
public const val `DISPID_ISDScale`: `DISPID_InkStrokeDisp` = 33;
public const val `DISPID_ISDScaleToRectangle`: `DISPID_InkStrokeDisp` = 28;
public const val `DISPID_ISDSelfIntersections`: `DISPID_InkStrokeDisp` = 16;
public const val `DISPID_ISDSetPacketValuesByProperty`: `DISPID_InkStrokeDisp` = 26;
public const val `DISPID_ISDSetPoints`: `DISPID_InkStrokeDisp` = 23;
public const val `DISPID_ISDShear`: `DISPID_InkStrokeDisp` = 32;
public const val `DISPID_ISDSplit`: `DISPID_InkStrokeDisp` = 10;
public const val `DISPID_ISDTransform`: `DISPID_InkStrokeDisp` = 29;
public const val `DISPID_ISave`: `DISPID_Ink` = 19;
public const val `DISPID_ISsAdd`: `DISPID_InkStrokes` = 4;
public const val `DISPID_ISsAddStrokes`: `DISPID_InkStrokes` = 5;
public const val `DISPID_ISsClip`: `DISPID_InkStrokes` = 17;
public const val `DISPID_ISsCount`: `DISPID_InkStrokes` = 1;
public const val `DISPID_ISsGetBoundingBox`: `DISPID_InkStrokes` = 10;
public const val `DISPID_ISsInk`: `DISPID_InkStrokes` = 3;
public const val `DISPID_ISsItem`: `DISPID_InkStrokes` = 0;
public const val `DISPID_ISsModifyDrawingAttributes`: `DISPID_InkStrokes` = 9;
public const val `DISPID_ISsMove`: `DISPID_InkStrokes` = 13;
public const val `DISPID_ISsRecognitionResult`: `DISPID_InkStrokes` = 18;
public const val `DISPID_ISsRemove`: `DISPID_InkStrokes` = 6;
public const val `DISPID_ISsRemoveRecognitionResult`: `DISPID_InkStrokes` = 19;
public const val `DISPID_ISsRemoveStrokes`: `DISPID_InkStrokes` = 7;
public const val `DISPID_ISsRotate`: `DISPID_InkStrokes` = 14;
public const val `DISPID_ISsScale`: `DISPID_InkStrokes` = 16;
public const val `DISPID_ISsScaleToRectangle`: `DISPID_InkStrokes` = 11;
public const val `DISPID_ISsShear`: `DISPID_InkStrokes` = 15;
public const val `DISPID_ISsToString`: `DISPID_InkStrokes` = 8;
public const val `DISPID_ISsTransform`: `DISPID_InkStrokes` = 12;
public const val `DISPID_ISsValid`: `DISPID_InkStrokes` = 2;
public const val `DISPID_ISs_NewEnum`: `DISPID_InkStrokes` = -4;
public const val `DISPID_IStrokes`: `DISPID_Ink` = 1;
public const val `DISPID_IT2DeviceKind`: `DISPID_InkTablet2` = 0;
public const val `DISPID_IT3IsMultiTouch`: `DISPID_InkTablet3` = 0;
public const val `DISPID_IT3MaximumCursors`: `DISPID_InkTablet3` = 1;
public const val `DISPID_ITData`: `DISPID_InkTransform` = 15;
public const val `DISPID_ITGetTransform`: `DISPID_InkTransform` = 13;
public const val `DISPID_ITHardwareCapabilities`: `DISPID_InkTablet` = 5;
public const val `DISPID_ITIsPacketPropertySupported`: `DISPID_InkTablet` = 3;
public const val `DISPID_ITMaximumInputRectangle`: `DISPID_InkTablet` = 4;
public const val `DISPID_ITName`: `DISPID_InkTablet` = 0;
public const val `DISPID_ITPlugAndPlayId`: `DISPID_InkTablet` = 1;
public const val `DISPID_ITPropertyMetrics`: `DISPID_InkTablet` = 2;
public const val `DISPID_ITReflect`: `DISPID_InkTransform` = 4;
public const val `DISPID_ITReset`: `DISPID_InkTransform` = 1;
public const val `DISPID_ITRotate`: `DISPID_InkTransform` = 3;
public const val `DISPID_ITScale`: `DISPID_InkTransform` = 6;
public const val `DISPID_ITSetTransform`: `DISPID_InkTransform` = 14;
public const val `DISPID_ITShear`: `DISPID_InkTransform` = 5;
public const val `DISPID_ITTranslate`: `DISPID_InkTransform` = 2;
public const val `DISPID_ITeDx`: `DISPID_InkTransform` = 11;
public const val `DISPID_ITeDy`: `DISPID_InkTransform` = 12;
public const val `DISPID_ITeM11`: `DISPID_InkTransform` = 7;
public const val `DISPID_ITeM12`: `DISPID_InkTransform` = 8;
public const val `DISPID_ITeM21`: `DISPID_InkTransform` = 9;
public const val `DISPID_ITeM22`: `DISPID_InkTransform` = 10;
public const val `DISPID_ITsCount`: `DISPID_InkTablets` = 2;
public const val `DISPID_ITsDefaultTablet`: `DISPID_InkTablets` = 1;
public const val `DISPID_ITsIsPacketPropertySupported`: `DISPID_InkTablets` = 3;
public const val `DISPID_ITsItem`: `DISPID_InkTablets` = 0;
public const val `DISPID_ITs_NewEnum`: `DISPID_InkTablets` = -4;
public const val `DISPID_IeeChange`: `DISPID_InkEditEvents` = 1;
public const val `DISPID_IeeClick`: `DISPID_InkEditEvents` = 9;
public const val `DISPID_IeeCursorDown`: `DISPID_InkEditEvents` = 21;
public const val `DISPID_IeeDblClick`: `DISPID_InkEditEvents` = 8;
public const val `DISPID_IeeGesture`: `DISPID_InkEditEvents` = 23;
public const val `DISPID_IeeKeyDown`: `DISPID_InkEditEvents` = 3;
public const val `DISPID_IeeKeyPress`: `DISPID_InkEditEvents` = 7;
public const val `DISPID_IeeKeyUp`: `DISPID_InkEditEvents` = 4;
public const val `DISPID_IeeMouseDown`: `DISPID_InkEditEvents` = 6;
public const val `DISPID_IeeMouseMove`: `DISPID_InkEditEvents` = 10;
public const val `DISPID_IeeMouseUp`: `DISPID_InkEditEvents` = 5;
public const val `DISPID_IeeRecognitionResult`: `DISPID_InkEditEvents` = 24;
public const val `DISPID_IeeSelChange`: `DISPID_InkEditEvents` = 2;
public const val `DISPID_IeeStroke`: `DISPID_InkEditEvents` = 22;
public typealias `DISPID_Ink` = Int;
public typealias `DISPID_InkCollector` = Int;
public typealias `DISPID_InkCollectorEvent` = Int;
public typealias `DISPID_InkCursor` = Int;
public typealias `DISPID_InkCursorButton` = Int;
public typealias `DISPID_InkCursorButtons` = Int;
public typealias `DISPID_InkCursors` = Int;
public typealias `DISPID_InkCustomStrokes` = Int;
public typealias `DISPID_InkDivider` = Int;
public typealias `DISPID_InkDivisionResult` = Int;
public typealias `DISPID_InkDivisionUnit` = Int;
public typealias `DISPID_InkDivisionUnits` = Int;
public typealias `DISPID_InkDrawingAttributes` = Int;
public typealias `DISPID_InkEdit` = Int;
public typealias `DISPID_InkEditEvents` = Int;
public typealias `DISPID_InkEvent` = Int;
public typealias `DISPID_InkExtendedProperties` = Int;
public typealias `DISPID_InkExtendedProperty` = Int;
public typealias `DISPID_InkGesture` = Int;
public const val `DISPID_InkInsertMode`: `DISPID_InkEdit` = 25;
public const val `DISPID_InkMode`: `DISPID_InkEdit` = 24;
public typealias `DISPID_InkRecoAlternate` = Int;
public const val `DISPID_InkRecoAlternate_AlternatesWithConstantPropertyValues`: `DISPID_InkRecoAlternate` = 15;
public const val `DISPID_InkRecoAlternate_Ascender`: `DISPID_InkRecoAlternate` = 5;
public const val `DISPID_InkRecoAlternate_Baseline`: `DISPID_InkRecoAlternate` = 3;
public const val `DISPID_InkRecoAlternate_Confidence`: `DISPID_InkRecoAlternate` = 7;
public const val `DISPID_InkRecoAlternate_ConfidenceAlternates`: `DISPID_InkRecoAlternate` = 14;
public const val `DISPID_InkRecoAlternate_Descender`: `DISPID_InkRecoAlternate` = 6;
public const val `DISPID_InkRecoAlternate_GetPropertyValue`: `DISPID_InkRecoAlternate` = 12;
public const val `DISPID_InkRecoAlternate_GetStrokesFromStrokeRanges`: `DISPID_InkRecoAlternate` = 9;
public const val `DISPID_InkRecoAlternate_GetStrokesFromTextRange`: `DISPID_InkRecoAlternate` = 10;
public const val `DISPID_InkRecoAlternate_GetTextRangeFromStrokes`: `DISPID_InkRecoAlternate` = 11;
public const val `DISPID_InkRecoAlternate_LineAlternates`: `DISPID_InkRecoAlternate` = 13;
public const val `DISPID_InkRecoAlternate_LineNumber`: `DISPID_InkRecoAlternate` = 2;
public const val `DISPID_InkRecoAlternate_Midline`: `DISPID_InkRecoAlternate` = 4;
public const val `DISPID_InkRecoAlternate_String`: `DISPID_InkRecoAlternate` = 1;
public const val `DISPID_InkRecoAlternate_Strokes`: `DISPID_InkRecoAlternate` = 8;
public typealias `DISPID_InkRecoContext` = Int;
public typealias `DISPID_InkRecoContext2` = Int;
public typealias `DISPID_InkRecognitionAlternates` = Int;
public const val `DISPID_InkRecognitionAlternates_Count`: `DISPID_InkRecognitionAlternates` = 1;
public const val `DISPID_InkRecognitionAlternates_Item`: `DISPID_InkRecognitionAlternates` = 0;
public const val `DISPID_InkRecognitionAlternates_NewEnum`: `DISPID_InkRecognitionAlternates` = -4;
public const val `DISPID_InkRecognitionAlternates_Strokes`: `DISPID_InkRecognitionAlternates` = 2;
public typealias `DISPID_InkRecognitionEvent` = Int;
public typealias `DISPID_InkRecognitionResult` = Int;
public const val `DISPID_InkRecognitionResult_AlternatesFromSelection`: `DISPID_InkRecognitionResult` = 5;
public const val `DISPID_InkRecognitionResult_ModifyTopAlternate`: `DISPID_InkRecognitionResult` = 6;
public const val `DISPID_InkRecognitionResult_SetResultOnStrokes`: `DISPID_InkRecognitionResult` = 7;
public const val `DISPID_InkRecognitionResult_Strokes`: `DISPID_InkRecognitionResult` = 3;
public const val `DISPID_InkRecognitionResult_TopAlternate`: `DISPID_InkRecognitionResult` = 2;
public const val `DISPID_InkRecognitionResult_TopConfidence`: `DISPID_InkRecognitionResult` = 4;
public const val `DISPID_InkRecognitionResult_TopString`: `DISPID_InkRecognitionResult` = 1;
public typealias `DISPID_InkRecognizer` = Int;
public typealias `DISPID_InkRecognizer2` = Int;
public typealias `DISPID_InkRecognizerGuide` = Int;
public typealias `DISPID_InkRecognizers` = Int;
public typealias `DISPID_InkRectangle` = Int;
public typealias `DISPID_InkRenderer` = Int;
public typealias `DISPID_InkStrokeDisp` = Int;
public typealias `DISPID_InkStrokes` = Int;
public typealias `DISPID_InkTablet` = Int;
public typealias `DISPID_InkTablet2` = Int;
public typealias `DISPID_InkTablet3` = Int;
public typealias `DISPID_InkTablets` = Int;
public typealias `DISPID_InkTransform` = Int;
public typealias `DISPID_InkWordList` = Int;
public typealias `DISPID_InkWordList2` = Int;
public const val `DISPID_InkWordList2_AddWords`: `DISPID_InkWordList2` = 3;
public const val `DISPID_InkWordList_AddWord`: `DISPID_InkWordList` = 0;
public const val `DISPID_InkWordList_Merge`: `DISPID_InkWordList` = 2;
public const val `DISPID_InkWordList_RemoveWord`: `DISPID_InkWordList` = 1;
public const val `DISPID_Locked`: `DISPID_InkEdit` = 4;
public const val `DISPID_MICClear`: `DISPID_MathInputControlEvents` = 3;
public const val `DISPID_MICClose`: `DISPID_MathInputControlEvents` = 1;
public const val `DISPID_MICInsert`: `DISPID_MathInputControlEvents` = 0;
public const val `DISPID_MICPaint`: `DISPID_MathInputControlEvents` = 2;
public typealias `DISPID_MathInputControlEvents` = Int;
public const val `DISPID_MaxLength`: `DISPID_InkEdit` = 6;
public const val `DISPID_MultiLine`: `DISPID_InkEdit` = 7;
public const val `DISPID_PIPAttachedEditWindow`: `DISPID_PenInputPanel` = 0;
public const val `DISPID_PIPAutoShow`: `DISPID_PenInputPanel` = 16;
public const val `DISPID_PIPBusy`: `DISPID_PenInputPanel` = 12;
public const val `DISPID_PIPCommitPendingInput`: `DISPID_PenInputPanel` = 10;
public const val `DISPID_PIPCurrentPanel`: `DISPID_PenInputPanel` = 2;
public const val `DISPID_PIPDefaultPanel`: `DISPID_PenInputPanel` = 3;
public const val `DISPID_PIPEInputFailed`: `DISPID_PenInputPanelEvents` = 2;
public const val `DISPID_PIPEPanelChanged`: `DISPID_PenInputPanelEvents` = 1;
public const val `DISPID_PIPEPanelMoving`: `DISPID_PenInputPanelEvents` = 3;
public const val `DISPID_PIPEVisibleChanged`: `DISPID_PenInputPanelEvents` = 0;
public const val `DISPID_PIPEnableTsf`: `DISPID_PenInputPanel` = 15;
public const val `DISPID_PIPFactoid`: `DISPID_PenInputPanel` = 1;
public const val `DISPID_PIPHeight`: `DISPID_PenInputPanel` = 8;
public const val `DISPID_PIPHorizontalOffset`: `DISPID_PenInputPanel` = 14;
public const val `DISPID_PIPLeft`: `DISPID_PenInputPanel` = 6;
public const val `DISPID_PIPMoveTo`: `DISPID_PenInputPanel` = 9;
public const val `DISPID_PIPRefresh`: `DISPID_PenInputPanel` = 11;
public const val `DISPID_PIPTop`: `DISPID_PenInputPanel` = 5;
public const val `DISPID_PIPVerticalOffset`: `DISPID_PenInputPanel` = 13;
public const val `DISPID_PIPVisible`: `DISPID_PenInputPanel` = 4;
public const val `DISPID_PIPWidth`: `DISPID_PenInputPanel` = 7;
public typealias `DISPID_PenInputPanel` = Int;
public typealias `DISPID_PenInputPanelEvents` = Int;
public const val `DISPID_RTSelLength`: `DISPID_InkEdit` = 10;
public const val `DISPID_RTSelStart`: `DISPID_InkEdit` = 9;
public const val `DISPID_RTSelText`: `DISPID_InkEdit` = 11;
public const val `DISPID_RecoCapabilities`: `DISPID_InkRecognizer` = 4;
public const val `DISPID_RecoClsid`: `DISPID_InkRecognizer` = 1;
public const val `DISPID_RecoCreateRecognizerContext`: `DISPID_InkRecognizer` = 7;
public const val `DISPID_RecoId`: `DISPID_InkRecognizer2` = 0;
public const val `DISPID_RecoLanguageID`: `DISPID_InkRecognizer` = 5;
public const val `DISPID_RecoName`: `DISPID_InkRecognizer` = 2;
public const val `DISPID_RecoPreferredPacketDescription`: `DISPID_InkRecognizer` = 6;
public const val `DISPID_RecoSupportedProperties`: `DISPID_InkRecognizer` = 8;
public const val `DISPID_RecoTimeout`: `DISPID_InkEdit` = 26;
public const val `DISPID_RecoUnicodeRanges`: `DISPID_InkRecognizer2` = 1;
public const val `DISPID_RecoVendor`: `DISPID_InkRecognizer` = 3;
public const val `DISPID_Recognize`: `DISPID_InkEdit` = 32;
public const val `DISPID_Recognizer`: `DISPID_InkEdit` = 28;
public const val `DISPID_Refresh`: `DISPID_InkEdit` = 35;
public const val `DISPID_SEStrokesAdded`: `DISPID_StrokeEvent` = 1;
public const val `DISPID_SEStrokesRemoved`: `DISPID_StrokeEvent` = 2;
public const val `DISPID_ScrollBars`: `DISPID_InkEdit` = 8;
public const val `DISPID_SelAlignment`: `DISPID_InkEdit` = 12;
public const val `DISPID_SelBold`: `DISPID_InkEdit` = 13;
public const val `DISPID_SelCharOffset`: `DISPID_InkEdit` = 14;
public const val `DISPID_SelColor`: `DISPID_InkEdit` = 15;
public const val `DISPID_SelFontName`: `DISPID_InkEdit` = 16;
public const val `DISPID_SelFontSize`: `DISPID_InkEdit` = 17;
public const val `DISPID_SelInk`: `DISPID_InkEdit` = 30;
public const val `DISPID_SelInksDisplayMode`: `DISPID_InkEdit` = 31;
public const val `DISPID_SelItalic`: `DISPID_InkEdit` = 18;
public const val `DISPID_SelRTF`: `DISPID_InkEdit` = 19;
public const val `DISPID_SelUnderline`: `DISPID_InkEdit` = 20;
public const val `DISPID_SetGestStatus`: `DISPID_InkEdit` = 34;
public const val `DISPID_Status`: `DISPID_InkEdit` = 22;
public typealias `DISPID_StrokeEvent` = Int;
public const val `DISPID_Text`: `DISPID_InkEdit` = 0;
public const val `DISPID_TextRTF`: `DISPID_InkEdit` = 1;
public const val `DISPID_UseMouseForInput`: `DISPID_InkEdit` = 23;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DYNAMIC_RENDERER_CACHED_DATA` (
    public var `strokeId`: Int,
    public var `dynamicRenderer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 537:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DYNAMIC_RENDERER_CACHED_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DockedBottom`: `VisualState` = 3;
public const val `DockedTop`: `VisualState` = 2;
// UNSUPPORTED Rust 544:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DynamicRenderer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecd32aea_746f_4dcb_bf68_082757faff18);

public const val `EM_GETDRAWATTR`: UInt = 1541u;
public const val `EM_GETFACTOID`: UInt = 1549u;
public const val `EM_GETGESTURESTATUS`: UInt = 1545u;
public const val `EM_GETINKINSERTMODE`: UInt = 1539u;
public const val `EM_GETINKMODE`: UInt = 1537u;
public const val `EM_GETMOUSEICON`: UInt = 1553u;
public const val `EM_GETMOUSEPOINTER`: UInt = 1555u;
public const val `EM_GETRECOGNIZER`: UInt = 1547u;
public const val `EM_GETRECOTIMEOUT`: UInt = 1543u;
public const val `EM_GETSELINK`: UInt = 1551u;
public const val `EM_GETSELINKDISPLAYMODE`: UInt = 1562u;
public const val `EM_GETSTATUS`: UInt = 1557u;
public const val `EM_GETUSEMOUSEFORINPUT`: UInt = 1559u;
public const val `EM_RECOGNIZE`: UInt = 1558u;
public const val `EM_SETDRAWATTR`: UInt = 1542u;
public const val `EM_SETFACTOID`: UInt = 1550u;
public const val `EM_SETGESTURESTATUS`: UInt = 1546u;
public const val `EM_SETINKINSERTMODE`: UInt = 1540u;
public const val `EM_SETINKMODE`: UInt = 1538u;
public const val `EM_SETMOUSEICON`: UInt = 1554u;
public const val `EM_SETMOUSEPOINTER`: UInt = 1556u;
public const val `EM_SETRECOGNIZER`: UInt = 1548u;
public const val `EM_SETRECOTIMEOUT`: UInt = 1544u;
public const val `EM_SETSELINK`: UInt = 1552u;
public const val `EM_SETSELINKDISPLAYMODE`: UInt = 1561u;
public const val `EM_SETUSEMOUSEFORINPUT`: UInt = 1560u;
public typealias `EventMask` = Int;
public const val `EventMask_All`: `EventMask` = 4095;
public const val `EventMask_CorrectionModeChanged`: `EventMask` = 128;
public const val `EventMask_CorrectionModeChanging`: `EventMask` = 64;
public const val `EventMask_InPlaceSizeChanged`: `EventMask` = 8;
public const val `EventMask_InPlaceSizeChanging`: `EventMask` = 4;
public const val `EventMask_InPlaceStateChanged`: `EventMask` = 2;
public const val `EventMask_InPlaceStateChanging`: `EventMask` = 1;
public const val `EventMask_InPlaceVisibilityChanged`: `EventMask` = 512;
public const val `EventMask_InPlaceVisibilityChanging`: `EventMask` = 256;
public const val `EventMask_InputAreaChanged`: `EventMask` = 32;
public const val `EventMask_InputAreaChanging`: `EventMask` = 16;
public const val `EventMask_TextInserted`: `EventMask` = 2048;
public const val `EventMask_TextInserting`: `EventMask` = 1024;
public const val `FACILITY_INK`: UInt = 40u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_BOPOMOFO`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BOPOMOFO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_CHINESESIMPLECOMMON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CHS_COMMON");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_CHINESETRADITIONALCOMMON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CHT_COMMON");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_CURRENCY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CURRENCY");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_DATE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DATE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_DEFAULT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DEFAULT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_DIGIT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DIGIT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_EMAIL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EMAIL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_FILENAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FILENAME");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_HANGULCOMMON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HANGUL_COMMON");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_HANGULRARE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HANGUL_RARE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_HIRAGANA`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HIRAGANA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_JAMO`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("JAMO");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_JAPANESECOMMON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("JPN_COMMON");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_KANJICOMMON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KANJI_COMMON");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_KANJIRARE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KANJI_RARE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_KATAKANA`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KATAKANA");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_KOREANCOMMON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KOR_COMMON");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_LOWERCHAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LOWERCHAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_NONE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NONE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_NUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NUMBER");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_NUMBERSIMPLE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NUMSIMPLE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_ONECHAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ONECHAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_PERCENT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PERCENT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_POSTALCODE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("POSTALCODE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_PUNCCHAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PUNCCHAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_SYSTEMDICTIONARY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SYSDICT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_TELEPHONE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TELEPHONE");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_TIME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TIME");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_UPPERCHAR`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UPPERCHAR");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_WEB`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WEB");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FACTOID_WORDLIST`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WORDLIST");
public typealias `FLICKACTION_COMMANDCODE` = Int;
public const val `FLICKACTION_COMMANDCODE_APPCOMMAND`: `FLICKACTION_COMMANDCODE` = 2;
public const val `FLICKACTION_COMMANDCODE_CUSTOMKEY`: `FLICKACTION_COMMANDCODE` = 3;
public const val `FLICKACTION_COMMANDCODE_KEYMODIFIER`: `FLICKACTION_COMMANDCODE` = 4;
public const val `FLICKACTION_COMMANDCODE_NULL`: `FLICKACTION_COMMANDCODE` = 0;
public const val `FLICKACTION_COMMANDCODE_SCROLL`: `FLICKACTION_COMMANDCODE` = 1;
public typealias `FLICKDIRECTION` = Int;
public const val `FLICKDIRECTION_DOWN`: `FLICKDIRECTION` = 6;
public const val `FLICKDIRECTION_DOWNLEFT`: `FLICKDIRECTION` = 5;
public const val `FLICKDIRECTION_DOWNRIGHT`: `FLICKDIRECTION` = 7;
public const val `FLICKDIRECTION_INVALID`: `FLICKDIRECTION` = 8;
public const val `FLICKDIRECTION_LEFT`: `FLICKDIRECTION` = 4;
public const val `FLICKDIRECTION_MIN`: `FLICKDIRECTION` = 0;
public const val `FLICKDIRECTION_RIGHT`: `FLICKDIRECTION` = 0;
public const val `FLICKDIRECTION_UP`: `FLICKDIRECTION` = 2;
public const val `FLICKDIRECTION_UPLEFT`: `FLICKDIRECTION` = 3;
public const val `FLICKDIRECTION_UPRIGHT`: `FLICKDIRECTION` = 1;
public typealias `FLICKMODE` = Int;
public const val `FLICKMODE_DEFAULT`: `FLICKMODE` = 1;
public const val `FLICKMODE_LEARNING`: `FLICKMODE` = 2;
public const val `FLICKMODE_MAX`: `FLICKMODE` = 2;
public const val `FLICKMODE_MIN`: `FLICKMODE` = 0;
public const val `FLICKMODE_OFF`: `FLICKMODE` = 0;
public const val `FLICKMODE_ON`: `FLICKMODE` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLICK_DATA` (
    public var `_bitfield`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FLICK_POINT` (
    public var `_bitfield`: Int,
)
public const val `FLICK_WM_HANDLED_MASK`: UInt = 1u;
public const val `Floating`: `VisualState` = 1;
public const val `GESTURE_ARROW_DOWN`: UInt = 61497u;
public const val `GESTURE_ARROW_LEFT`: UInt = 61498u;
public const val `GESTURE_ARROW_RIGHT`: UInt = 61499u;
public const val `GESTURE_ARROW_UP`: UInt = 61496u;
public const val `GESTURE_ASTERISK`: UInt = 61608u;
public const val `GESTURE_BRACE_LEFT`: UInt = 61674u;
public const val `GESTURE_BRACE_OVER`: UInt = 61672u;
public const val `GESTURE_BRACE_RIGHT`: UInt = 61675u;
public const val `GESTURE_BRACE_UNDER`: UInt = 61673u;
public const val `GESTURE_BRACKET_LEFT`: UInt = 61670u;
public const val `GESTURE_BRACKET_OVER`: UInt = 61668u;
public const val `GESTURE_BRACKET_RIGHT`: UInt = 61671u;
public const val `GESTURE_BRACKET_UNDER`: UInt = 61669u;
public const val `GESTURE_BULLET`: UInt = 61450u;
public const val `GESTURE_BULLET_CROSS`: UInt = 61451u;
public const val `GESTURE_CHECK`: UInt = 61445u;
public const val `GESTURE_CHEVRON_DOWN`: UInt = 61489u;
public const val `GESTURE_CHEVRON_LEFT`: UInt = 61490u;
public const val `GESTURE_CHEVRON_RIGHT`: UInt = 61491u;
public const val `GESTURE_CHEVRON_UP`: UInt = 61488u;
public const val `GESTURE_CIRCLE`: UInt = 61472u;
public const val `GESTURE_CIRCLE_CIRCLE`: UInt = 61475u;
public const val `GESTURE_CIRCLE_CROSS`: UInt = 61477u;
public const val `GESTURE_CIRCLE_LINE_HORZ`: UInt = 61479u;
public const val `GESTURE_CIRCLE_LINE_VERT`: UInt = 61478u;
public const val `GESTURE_CIRCLE_TAP`: UInt = 61474u;
public const val `GESTURE_CLOSEUP`: UInt = 61455u;
public const val `GESTURE_CROSS`: UInt = 61447u;
public const val `GESTURE_CURLICUE`: UInt = 61456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GESTURE_DATA` (
    public var `gestureId`: Int,
    public var `recoConfidence`: Int,
    public var `strokeCount`: Int,
)
public const val `GESTURE_DIAGONAL_LEFTDOWN`: UInt = 61534u;
public const val `GESTURE_DIAGONAL_LEFTUP`: UInt = 61532u;
public const val `GESTURE_DIAGONAL_RIGHTDOWN`: UInt = 61535u;
public const val `GESTURE_DIAGONAL_RIGHTUP`: UInt = 61533u;
public const val `GESTURE_DIGIT_0`: UInt = 61594u;
public const val `GESTURE_DIGIT_1`: UInt = 61595u;
public const val `GESTURE_DIGIT_2`: UInt = 61596u;
public const val `GESTURE_DIGIT_3`: UInt = 61597u;
public const val `GESTURE_DIGIT_4`: UInt = 61598u;
public const val `GESTURE_DIGIT_5`: UInt = 61599u;
public const val `GESTURE_DIGIT_6`: UInt = 61600u;
public const val `GESTURE_DIGIT_7`: UInt = 61601u;
public const val `GESTURE_DIGIT_8`: UInt = 61602u;
public const val `GESTURE_DIGIT_9`: UInt = 61603u;
public const val `GESTURE_DOLLAR`: UInt = 61607u;
public const val `GESTURE_DOUBLE_ARROW_DOWN`: UInt = 61501u;
public const val `GESTURE_DOUBLE_ARROW_LEFT`: UInt = 61502u;
public const val `GESTURE_DOUBLE_ARROW_RIGHT`: UInt = 61503u;
public const val `GESTURE_DOUBLE_ARROW_UP`: UInt = 61500u;
public const val `GESTURE_DOUBLE_CIRCLE`: UInt = 61473u;
public const val `GESTURE_DOUBLE_CURLICUE`: UInt = 61457u;
public const val `GESTURE_DOUBLE_DOWN`: UInt = 61625u;
public const val `GESTURE_DOUBLE_LEFT`: UInt = 61626u;
public const val `GESTURE_DOUBLE_RIGHT`: UInt = 61627u;
public const val `GESTURE_DOUBLE_TAP`: UInt = 61681u;
public const val `GESTURE_DOUBLE_UP`: UInt = 61624u;
public const val `GESTURE_DOWN`: UInt = 61529u;
public const val `GESTURE_DOWN_ARROW_LEFT`: UInt = 61506u;
public const val `GESTURE_DOWN_ARROW_RIGHT`: UInt = 61507u;
public const val `GESTURE_DOWN_LEFT`: UInt = 61546u;
public const val `GESTURE_DOWN_LEFT_LONG`: UInt = 61542u;
public const val `GESTURE_DOWN_RIGHT`: UInt = 61547u;
public const val `GESTURE_DOWN_RIGHT_LONG`: UInt = 61543u;
public const val `GESTURE_DOWN_UP`: UInt = 61537u;
public const val `GESTURE_EXCLAMATION`: UInt = 61604u;
public const val `GESTURE_INFINITY`: UInt = 61446u;
public const val `GESTURE_LEFT`: UInt = 61530u;
public const val `GESTURE_LEFT_ARROW_DOWN`: UInt = 61509u;
public const val `GESTURE_LEFT_ARROW_UP`: UInt = 61508u;
public const val `GESTURE_LEFT_DOWN`: UInt = 61549u;
public const val `GESTURE_LEFT_RIGHT`: UInt = 61538u;
public const val `GESTURE_LEFT_UP`: UInt = 61548u;
public const val `GESTURE_LETTER_A`: UInt = 61568u;
public const val `GESTURE_LETTER_B`: UInt = 61569u;
public const val `GESTURE_LETTER_C`: UInt = 61570u;
public const val `GESTURE_LETTER_D`: UInt = 61571u;
public const val `GESTURE_LETTER_E`: UInt = 61572u;
public const val `GESTURE_LETTER_F`: UInt = 61573u;
public const val `GESTURE_LETTER_G`: UInt = 61574u;
public const val `GESTURE_LETTER_H`: UInt = 61575u;
public const val `GESTURE_LETTER_I`: UInt = 61576u;
public const val `GESTURE_LETTER_J`: UInt = 61577u;
public const val `GESTURE_LETTER_K`: UInt = 61578u;
public const val `GESTURE_LETTER_L`: UInt = 61579u;
public const val `GESTURE_LETTER_M`: UInt = 61580u;
public const val `GESTURE_LETTER_N`: UInt = 61581u;
public const val `GESTURE_LETTER_O`: UInt = 61582u;
public const val `GESTURE_LETTER_P`: UInt = 61583u;
public const val `GESTURE_LETTER_Q`: UInt = 61584u;
public const val `GESTURE_LETTER_R`: UInt = 61585u;
public const val `GESTURE_LETTER_S`: UInt = 61586u;
public const val `GESTURE_LETTER_T`: UInt = 61587u;
public const val `GESTURE_LETTER_U`: UInt = 61588u;
public const val `GESTURE_LETTER_V`: UInt = 61589u;
public const val `GESTURE_LETTER_W`: UInt = 61590u;
public const val `GESTURE_LETTER_X`: UInt = 61591u;
public const val `GESTURE_LETTER_Y`: UInt = 61592u;
public const val `GESTURE_LETTER_Z`: UInt = 61593u;
public const val `GESTURE_NULL`: UInt = 61440u;
public const val `GESTURE_OPENUP`: UInt = 61454u;
public const val `GESTURE_PARAGRAPH`: UInt = 61448u;
public const val `GESTURE_PLUS`: UInt = 61609u;
public const val `GESTURE_QUAD_TAP`: UInt = 61683u;
public const val `GESTURE_QUESTION`: UInt = 61605u;
public const val `GESTURE_RECTANGLE`: UInt = 61458u;
public const val `GESTURE_RIGHT`: UInt = 61531u;
public const val `GESTURE_RIGHT_ARROW_DOWN`: UInt = 61511u;
public const val `GESTURE_RIGHT_ARROW_UP`: UInt = 61510u;
public const val `GESTURE_RIGHT_DOWN`: UInt = 61551u;
public const val `GESTURE_RIGHT_LEFT`: UInt = 61539u;
public const val `GESTURE_RIGHT_UP`: UInt = 61550u;
public const val `GESTURE_SCRATCHOUT`: UInt = 61441u;
public const val `GESTURE_SECTION`: UInt = 61449u;
public const val `GESTURE_SEMICIRCLE_LEFT`: UInt = 61480u;
public const val `GESTURE_SEMICIRCLE_RIGHT`: UInt = 61481u;
public const val `GESTURE_SHARP`: UInt = 61606u;
public const val `GESTURE_SQUARE`: UInt = 61443u;
public const val `GESTURE_SQUIGGLE`: UInt = 61452u;
public const val `GESTURE_STAR`: UInt = 61444u;
public const val `GESTURE_SWAP`: UInt = 61453u;
public const val `GESTURE_TAP`: UInt = 61680u;
public const val `GESTURE_TRIANGLE`: UInt = 61442u;
public const val `GESTURE_TRIPLE_DOWN`: UInt = 61629u;
public const val `GESTURE_TRIPLE_LEFT`: UInt = 61630u;
public const val `GESTURE_TRIPLE_RIGHT`: UInt = 61631u;
public const val `GESTURE_TRIPLE_TAP`: UInt = 61682u;
public const val `GESTURE_TRIPLE_UP`: UInt = 61628u;
public const val `GESTURE_UP`: UInt = 61528u;
public const val `GESTURE_UP_ARROW_LEFT`: UInt = 61504u;
public const val `GESTURE_UP_ARROW_RIGHT`: UInt = 61505u;
public const val `GESTURE_UP_DOWN`: UInt = 61536u;
public const val `GESTURE_UP_LEFT`: UInt = 61544u;
public const val `GESTURE_UP_LEFT_LONG`: UInt = 61540u;
public const val `GESTURE_UP_RIGHT`: UInt = 61545u;
public const val `GESTURE_UP_RIGHT_LONG`: UInt = 61541u;
public typealias `GET_DANDIDATE_FLAGS` = Int;
// UNSUPPORTED Rust 796:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DYNAMIC_RENDERER_CACHED_DATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf531b92_25bf_4a95_89ad_0e476b34b4f5);

// UNSUPPORTED Rust 797:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_GESTURE_DATA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41e4ec0f_26aa_455a_9aa5_2cd36cf63fb9);

// UNSUPPORTED Rust 798:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_ALTITUDE_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82dec5c7_f6ba_4906_894f_66d68dfc456c);

// UNSUPPORTED Rust 799:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_AZIMUTH_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x029123b4_8828_410b_b250_a0536595e5dc);

// UNSUPPORTED Rust 800:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_BUTTON_PRESSURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8b7fefc4_96aa_4bfe_ac26_8a5f0be07bf5);

// UNSUPPORTED Rust 801:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_DEVICE_CONTACT_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x02585b91_049b_4750_9615_df8948ab3c9c);

// UNSUPPORTED Rust 802:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_FINGERCONTACTCONFIDENCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe706c804_57f0_4f00_8a0c_853d57789be9);

// UNSUPPORTED Rust 803:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_HEIGHT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe61858d2_e447_4218_9d3f_18865c203df4);

// UNSUPPORTED Rust 804:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_NORMAL_PRESSURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7307502d_f9f4_4e18_b3f2_2ce1b1a3610c);

// UNSUPPORTED Rust 805:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_PACKET_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e0e07bf_afe7_4cf7_87d1_af6446208418);

// UNSUPPORTED Rust 806:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_PITCH_ROTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f7e57b7_be37_4be1_a356_7a84160e1893);

// UNSUPPORTED Rust 807:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_ROLL_ROTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d5d5e56_6ba9_4c5b_9fb0_851c91714e56);

// UNSUPPORTED Rust 808:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_SERIAL_NUMBER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x78a81b56_0935_4493_baae_00541a8a16c4);

// UNSUPPORTED Rust 809:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_TANGENT_PRESSURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6da4488b_5244_41ec_905b_32d89ab80809);

// UNSUPPORTED Rust 810:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_TIMER_TICK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x436510c5_fed3_45d1_8b76_71d3ea7a829d);

// UNSUPPORTED Rust 811:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_TWIST_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d324960_13b2_41e4_ace6_7ae9d43d2d3b);

// UNSUPPORTED Rust 812:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_WIDTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbaabe94d_2712_48f5_be9d_8f8b5ea0711a);

// UNSUPPORTED Rust 813:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_X: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x598a6a8f_52c0_4ba0_93af_af357411a561);

// UNSUPPORTED Rust 814:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_X_TILT_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa8d07b3a_8bf0_40b0_95a9_b80a6bb787bf);

// UNSUPPORTED Rust 815:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_Y: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb53f9f75_04e0_4498_a7ee_c30dbb5a9011);

// UNSUPPORTED Rust 816:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_YAW_ROTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a849980_7c3a_45b7_aa82_90a262950e89);

// UNSUPPORTED Rust 817:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_Y_TILT_ORIENTATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e932389_1d77_43af_ac00_5b950d6d4b2d);

// UNSUPPORTED Rust 818:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PACKETPROPERTY_GUID_Z: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x735adb30_0ebb_4788_a0e4_0f316490055d);

// UNSUPPORTED Rust 819:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GestureRecognizer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea30c654_c62c_441f_ac00_95f9a196782c);

// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRECOALT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRECOCONTEXT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRECOGNIZER` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRECOLATTICE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRECOWORDLIST` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// UNSUPPORTED Rust 825:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HandwrittenTextInsertion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9f074ee2_e6e9_4d8a_a047_eb5b5c3c55da);

public const val `IAG_AllGestures`: `InkApplicationGesture` = 0;
public const val `IAG_ArrowDown`: `InkApplicationGesture` = 61497;
public const val `IAG_ArrowLeft`: `InkApplicationGesture` = 61498;
public const val `IAG_ArrowRight`: `InkApplicationGesture` = 61499;
public const val `IAG_ArrowUp`: `InkApplicationGesture` = 61496;
public const val `IAG_Check`: `InkApplicationGesture` = 61445;
public const val `IAG_ChevronDown`: `InkApplicationGesture` = 61489;
public const val `IAG_ChevronLeft`: `InkApplicationGesture` = 61490;
public const val `IAG_ChevronRight`: `InkApplicationGesture` = 61491;
public const val `IAG_ChevronUp`: `InkApplicationGesture` = 61488;
public const val `IAG_Circle`: `InkApplicationGesture` = 61472;
public const val `IAG_Curlicue`: `InkApplicationGesture` = 61456;
public const val `IAG_DoubleCircle`: `InkApplicationGesture` = 61473;
public const val `IAG_DoubleCurlicue`: `InkApplicationGesture` = 61457;
public const val `IAG_DoubleTap`: `InkApplicationGesture` = 61681;
public const val `IAG_Down`: `InkApplicationGesture` = 61529;
public const val `IAG_DownLeft`: `InkApplicationGesture` = 61546;
public const val `IAG_DownLeftLong`: `InkApplicationGesture` = 61542;
public const val `IAG_DownRight`: `InkApplicationGesture` = 61547;
public const val `IAG_DownRightLong`: `InkApplicationGesture` = 61543;
public const val `IAG_DownUp`: `InkApplicationGesture` = 61537;
public const val `IAG_Exclamation`: `InkApplicationGesture` = 61604;
public const val `IAG_Left`: `InkApplicationGesture` = 61530;
public const val `IAG_LeftDown`: `InkApplicationGesture` = 61549;
public const val `IAG_LeftRight`: `InkApplicationGesture` = 61538;
public const val `IAG_LeftUp`: `InkApplicationGesture` = 61548;
public const val `IAG_NoGesture`: `InkApplicationGesture` = 61440;
public const val `IAG_Right`: `InkApplicationGesture` = 61531;
public const val `IAG_RightDown`: `InkApplicationGesture` = 61551;
public const val `IAG_RightLeft`: `InkApplicationGesture` = 61539;
public const val `IAG_RightUp`: `InkApplicationGesture` = 61550;
public const val `IAG_Scratchout`: `InkApplicationGesture` = 61441;
public const val `IAG_SemiCircleLeft`: `InkApplicationGesture` = 61480;
public const val `IAG_SemiCircleRight`: `InkApplicationGesture` = 61481;
public const val `IAG_Square`: `InkApplicationGesture` = 61443;
public const val `IAG_Star`: `InkApplicationGesture` = 61444;
public const val `IAG_Tap`: `InkApplicationGesture` = 61680;
public const val `IAG_Triangle`: `InkApplicationGesture` = 61442;
public const val `IAG_Up`: `InkApplicationGesture` = 61528;
public const val `IAG_UpDown`: `InkApplicationGesture` = 61536;
public const val `IAG_UpLeft`: `InkApplicationGesture` = 61544;
public const val `IAG_UpLeftLong`: `InkApplicationGesture` = 61540;
public const val `IAG_UpRight`: `InkApplicationGesture` = 61545;
public const val `IAG_UpRightLong`: `InkApplicationGesture` = 61541;
public const val `IBBM_CurveFit`: `InkBoundingBoxMode` = 2;
public const val `IBBM_Default`: `InkBoundingBoxMode` = 0;
public const val `IBBM_NoCurveFit`: `InkBoundingBoxMode` = 1;
public const val `IBBM_PointsOnly`: `InkBoundingBoxMode` = 3;
public const val `IBBM_Union`: `InkBoundingBoxMode` = 4;
public const val `ICBS_Down`: `InkCursorButtonState` = 2;
public const val `ICBS_Unavailable`: `InkCursorButtonState` = 0;
public const val `ICBS_Up`: `InkCursorButtonState` = 1;
public const val `ICB_Copy`: `InkClipboardModes` = 0;
public const val `ICB_Cut`: `InkClipboardModes` = 1;
public const val `ICB_Default`: `InkClipboardModes` = 0;
public const val `ICB_DelayedCopy`: `InkClipboardModes` = 32;
public const val `ICB_ExtractOnly`: `InkClipboardModes` = 48;
public const val `ICEI_AllEvents`: `InkCollectorEventInterest` = 16;
public const val `ICEI_CursorButtonDown`: `InkCollectorEventInterest` = 4;
public const val `ICEI_CursorButtonUp`: `InkCollectorEventInterest` = 5;
public const val `ICEI_CursorDown`: `InkCollectorEventInterest` = 0;
public const val `ICEI_CursorInRange`: `InkCollectorEventInterest` = 6;
public const val `ICEI_CursorOutOfRange`: `InkCollectorEventInterest` = 7;
public const val `ICEI_DblClick`: `InkCollectorEventInterest` = 15;
public const val `ICEI_DefaultEvents`: `InkCollectorEventInterest` = -1;
public const val `ICEI_MouseDown`: `InkCollectorEventInterest` = 11;
public const val `ICEI_MouseMove`: `InkCollectorEventInterest` = 12;
public const val `ICEI_MouseUp`: `InkCollectorEventInterest` = 13;
public const val `ICEI_MouseWheel`: `InkCollectorEventInterest` = 14;
public const val `ICEI_NewInAirPackets`: `InkCollectorEventInterest` = 3;
public const val `ICEI_NewPackets`: `InkCollectorEventInterest` = 2;
public const val `ICEI_Stroke`: `InkCollectorEventInterest` = 1;
public const val `ICEI_SystemGesture`: `InkCollectorEventInterest` = 8;
public const val `ICEI_TabletAdded`: `InkCollectorEventInterest` = 9;
public const val `ICEI_TabletRemoved`: `InkCollectorEventInterest` = 10;
public const val `ICF_Bitmap`: `InkClipboardFormats` = 64;
public const val `ICF_CopyMask`: `InkClipboardFormats` = 127;
public const val `ICF_Default`: `InkClipboardFormats` = 127;
public const val `ICF_EnhancedMetafile`: `InkClipboardFormats` = 8;
public const val `ICF_InkSerializedFormat`: `InkClipboardFormats` = 1;
public const val `ICF_Metafile`: `InkClipboardFormats` = 32;
public const val `ICF_None`: `InkClipboardFormats` = 0;
public const val `ICF_PasteMask`: `InkClipboardFormats` = 7;
public const val `ICF_SketchInk`: `InkClipboardFormats` = 2;
public const val `ICF_TextInk`: `InkClipboardFormats` = 6;
public const val `ICM_GestureOnly`: `InkCollectionMode` = 1;
public const val `ICM_InkAndGesture`: `InkCollectionMode` = 2;
public const val `ICM_InkOnly`: `InkCollectionMode` = 0;
public const val `IDM_Ink`: `InkDisplayMode` = 0;
public const val `IDM_Text`: `InkDisplayMode` = 1;
public const val `IDT_Drawing`: `InkDivisionType` = 3;
public const val `IDT_Line`: `InkDivisionType` = 1;
public const val `IDT_Paragraph`: `InkDivisionType` = 2;
public const val `IDT_Segment`: `InkDivisionType` = 0;
public const val `IECN_GESTURE`: UInt = 2050u;
public const val `IECN_RECOGNITIONRESULT`: UInt = 2051u;
public const val `IECN_STROKE`: UInt = 2049u;
public const val `IECN__BASE`: UInt = 2048u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant", feature = "Win32_UI_Controls"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IEC_GESTUREINFO` (
    public var `nmhdr`: `super`.`Controls`.`NMHDR`,
    public var `Cursor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Strokes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Gestures`: `super`.`super`.`System`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 933:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant", feature = "Win32_UI_Controls"))]
// impl Default for IEC_GESTUREINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_UI_Controls"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IEC_RECOGNITIONRESULTINFO` (
    public var `nmhdr`: `super`.`Controls`.`NMHDR`,
    public var `RecognitionResult`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 946:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_UI_Controls"))]
// impl Default for IEC_RECOGNITIONRESULTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_UI_Controls"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IEC_STROKEINFO` (
    public var `nmhdr`: `super`.`Controls`.`NMHDR`,
    public var `Cursor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Stroke`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 960:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_UI_Controls"))]
// impl Default for IEC_STROKEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IEC__BASE`: UInt = 1536u;
public const val `IEF_CopyFromOriginal`: `InkExtractFlags` = 0;
public const val `IEF_Default`: `InkExtractFlags` = 1;
public const val `IEF_RemoveFromOriginal`: `InkExtractFlags` = 1;
public const val `IEM_Disabled`: `InkMode` = 0;
public const val `IEM_Ink`: `InkMode` = 1;
public const val `IEM_InkAndGesture`: `InkMode` = 2;
public const val `IEM_InsertInk`: `InkInsertMode` = 1;
public const val `IEM_InsertText`: `InkInsertMode` = 0;
public const val `IES_Collecting`: `InkEditStatus` = 1;
public const val `IES_Idle`: `InkEditStatus` = 0;
public const val `IES_Recognizing`: `InkEditStatus` = 2;
public const val `IKM_Alt`: `InkShiftKeyModifierFlags` = 4;
public const val `IKM_Control`: `InkShiftKeyModifierFlags` = 2;
public const val `IKM_Shift`: `InkShiftKeyModifierFlags` = 1;
public const val `IMF_BOLD`: `INK_METRIC_FLAGS` = 4;
public const val `IMF_FONT_SELECTED_IN_HDC`: `INK_METRIC_FLAGS` = 1;
public const val `IMF_ITALIC`: `INK_METRIC_FLAGS` = 2;
public const val `IMF_Left`: `InkMouseButton` = 1;
public const val `IMF_Middle`: `InkMouseButton` = 4;
public const val `IMF_Right`: `InkMouseButton` = 2;
public const val `IMP_Arrow`: `InkMousePointer` = 1;
public const val `IMP_ArrowHourglass`: `InkMousePointer` = 11;
public const val `IMP_ArrowQuestion`: `InkMousePointer` = 12;
public const val `IMP_Crosshair`: `InkMousePointer` = 2;
public const val `IMP_Custom`: `InkMousePointer` = 99;
public const val `IMP_Default`: `InkMousePointer` = 0;
public const val `IMP_Hand`: `InkMousePointer` = 14;
public const val `IMP_Hourglass`: `InkMousePointer` = 9;
public const val `IMP_Ibeam`: `InkMousePointer` = 3;
public const val `IMP_NoDrop`: `InkMousePointer` = 10;
public const val `IMP_SizeAll`: `InkMousePointer` = 13;
public const val `IMP_SizeNESW`: `InkMousePointer` = 4;
public const val `IMP_SizeNS`: `InkMousePointer` = 5;
public const val `IMP_SizeNWSE`: `InkMousePointer` = 6;
public const val `IMP_SizeWE`: `InkMousePointer` = 7;
public const val `IMP_UpArrow`: `InkMousePointer` = 8;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKEDIT_CLASS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("INKEDIT");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKEDIT_CLASSW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("INKEDIT");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INKMETRIC` (
    public var `iHeight`: Int,
    public var `iFontAscent`: Int,
    public var `iFontDescent`: Int,
    public var `dwFlags`: UInt,
    public var `color`: `super`.`super`.`Foundation`.`COLORREF`,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_BOXNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{2C243E3A-F733-4EB6-B1F8-B5DC5C2C4CDA}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_CONFIDENCELEVEL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{7DFE11A7-FB5D-4958-8765-154ADF0D833F}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_HOTPOINT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{CA6F40DC-5292-452a-91FB-2181C0BEC0DE}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_LINEMETRICS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{8CC24B27-30A9-4b96-9056-2D3A90DA0727}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_LINENUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{DBF29F2C-5289-4BE8-B3D8-6EF63246253E}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_MAXIMUMSTROKECOUNT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{BF0EEC4E-4B7D-47a9-8CFA-234DD24BD22A}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_POINTSPERINCH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{7ED16B76-889C-468e-8276-0021B770187E}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INKRECOGNITIONPROPERTY_SEGMENTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{B3C0FE6C-FB51-4164-BA2F-844AF8F983DA}");
public typealias `INK_METRIC_FLAGS` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `INK_SERIALIZED_FORMAT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Ink Serialized Format");
public const val `IOAM_Behind`: `InkOverlayAttachMode` = 0;
public const val `IOAM_InFront`: `InkOverlayAttachMode` = 1;
public const val `IOEM_Delete`: `InkOverlayEditingMode` = 1;
public const val `IOEM_Ink`: `InkOverlayEditingMode` = 0;
public const val `IOEM_Select`: `InkOverlayEditingMode` = 2;
public const val `IOERM_PointErase`: `InkOverlayEraserMode` = 1;
public const val `IOERM_StrokeErase`: `InkOverlayEraserMode` = 0;
public const val `IPCM_Default`: `InkPersistenceCompressionMode` = 0;
public const val `IPCM_MaximumCompression`: `InkPersistenceCompressionMode` = 1;
public const val `IPCM_NoCompression`: `InkPersistenceCompressionMode` = 2;
public const val `IPF_Base64GIF`: `InkPersistenceFormat` = 3;
public const val `IPF_Base64InkSerializedFormat`: `InkPersistenceFormat` = 1;
public const val `IPF_GIF`: `InkPersistenceFormat` = 2;
public const val `IPF_InkSerializedFormat`: `InkPersistenceFormat` = 0;
public const val `IPSM_AutoSize`: `InkPictureSizeMode` = 0;
public const val `IPSM_CenterImage`: `InkPictureSizeMode` = 1;
public const val `IPSM_Normal`: `InkPictureSizeMode` = 2;
public const val `IPSM_StretchImage`: `InkPictureSizeMode` = 3;
public const val `IPT_Ball`: `InkPenTip` = 0;
public const val `IPT_Rectangle`: `InkPenTip` = 1;
public const val `IP_CURSOR_DOWN`: UInt = 1u;
public const val `IP_INVERTED`: UInt = 2u;
public const val `IP_MARGIN`: UInt = 4u;
public const val `IRAS_All`: `InkRecognitionAlternatesSelection` = -1;
public const val `IRAS_DefaultCount`: `InkRecognitionAlternatesSelection` = 10;
public const val `IRAS_Start`: `InkRecognitionAlternatesSelection` = 0;
public const val `IRCACM_Full`: `InkRecognizerCharacterAutoCompletionMode` = 0;
public const val `IRCACM_Prefix`: `InkRecognizerCharacterAutoCompletionMode` = 1;
public const val `IRCACM_Random`: `InkRecognizerCharacterAutoCompletionMode` = 2;
public const val `IRC_AdviseInkChange`: `InkRecognizerCapabilities` = 4096;
public const val `IRC_Alpha`: `InkRecognizerCapabilities` = 1048576;
public const val `IRC_ArbitraryAngle`: `InkRecognizerCapabilities` = 1024;
public const val `IRC_Beta`: `InkRecognizerCapabilities` = 2097152;
public const val `IRC_BoxedInput`: `InkRecognizerCapabilities` = 16;
public const val `IRC_CharacterAutoCompletionInput`: `InkRecognizerCapabilities` = 32;
public const val `IRC_Cursive`: `InkRecognizerCapabilities` = 262144;
public const val `IRC_DontCare`: `InkRecognizerCapabilities` = 1;
public const val `IRC_DownAndLeft`: `InkRecognizerCapabilities` = 256;
public const val `IRC_DownAndRight`: `InkRecognizerCapabilities` = 512;
public const val `IRC_FreeInput`: `InkRecognizerCapabilities` = 4;
public const val `IRC_Intermediate`: `InkRecognitionConfidence` = 1;
public const val `IRC_Lattice`: `InkRecognizerCapabilities` = 2048;
public const val `IRC_LeftAndDown`: `InkRecognizerCapabilities` = 128;
public const val `IRC_LinedInput`: `InkRecognizerCapabilities` = 8;
public const val `IRC_Object`: `InkRecognizerCapabilities` = 2;
public const val `IRC_Personalizable`: `InkRecognizerCapabilities` = 16384;
public const val `IRC_Poor`: `InkRecognitionConfidence` = 2;
public const val `IRC_PrefersArbitraryAngle`: `InkRecognizerCapabilities` = 32768;
public const val `IRC_PrefersParagraphBreaking`: `InkRecognizerCapabilities` = 65536;
public const val `IRC_PrefersSegmentation`: `InkRecognizerCapabilities` = 131072;
public const val `IRC_RightAndDown`: `InkRecognizerCapabilities` = 64;
public const val `IRC_StrokeReorder`: `InkRecognizerCapabilities` = 8192;
public const val `IRC_Strong`: `InkRecognitionConfidence` = 0;
public const val `IRC_TextPrediction`: `InkRecognizerCapabilities` = 524288;
public const val `IRM_AutoSpace`: `InkRecognitionModes` = 64;
public const val `IRM_Coerce`: `InkRecognitionModes` = 2;
public const val `IRM_DisablePersonalization`: `InkRecognitionModes` = 32;
public const val `IRM_LineMode`: `InkRecognitionModes` = 16;
public const val `IRM_Max`: `InkRecognitionModes` = 128;
public const val `IRM_None`: `InkRecognitionModes` = 0;
public const val `IRM_PrefixOk`: `InkRecognitionModes` = 8;
public const val `IRM_TopInkBreaksOnly`: `InkRecognitionModes` = 4;
public const val `IRM_WordModeOnly`: `InkRecognitionModes` = 1;
public const val `IRO_Black`: `InkRasterOperation` = 1;
public const val `IRO_CopyPen`: `InkRasterOperation` = 13;
public const val `IRO_MaskNotPen`: `InkRasterOperation` = 3;
public const val `IRO_MaskPen`: `InkRasterOperation` = 9;
public const val `IRO_MaskPenNot`: `InkRasterOperation` = 5;
public const val `IRO_MergeNotPen`: `InkRasterOperation` = 12;
public const val `IRO_MergePen`: `InkRasterOperation` = 15;
public const val `IRO_MergePenNot`: `InkRasterOperation` = 14;
public const val `IRO_NoOperation`: `InkRasterOperation` = 11;
public const val `IRO_Not`: `InkRasterOperation` = 6;
public const val `IRO_NotCopyPen`: `InkRasterOperation` = 4;
public const val `IRO_NotMaskPen`: `InkRasterOperation` = 8;
public const val `IRO_NotMergePen`: `InkRasterOperation` = 2;
public const val `IRO_NotXOrPen`: `InkRasterOperation` = 10;
public const val `IRO_White`: `InkRasterOperation` = 16;
public const val `IRO_XOrPen`: `InkRasterOperation` = 7;
public const val `IRS_InkAddedFailed`: `InkRecognitionStatus` = 4;
public const val `IRS_Interrupted`: `InkRecognitionStatus` = 1;
public const val `IRS_NoError`: `InkRecognitionStatus` = 0;
public const val `IRS_ProcessFailed`: `InkRecognitionStatus` = 2;
public const val `IRS_SetAutoCompletionModeFailed`: `InkRecognitionStatus` = 8;
public const val `IRS_SetFactoidFailed`: `InkRecognitionStatus` = 128;
public const val `IRS_SetFlagsFailed`: `InkRecognitionStatus` = 64;
public const val `IRS_SetGuideFailed`: `InkRecognitionStatus` = 32;
public const val `IRS_SetPrefixSuffixFailed`: `InkRecognitionStatus` = 256;
public const val `IRS_SetStrokesFailed`: `InkRecognitionStatus` = 16;
public const val `IRS_SetWordListFailed`: `InkRecognitionStatus` = 512;
public const val `ISC_AllElements`: `InkSelectionConstants` = -1;
public const val `ISC_FirstElement`: `InkSelectionConstants` = 0;
public const val `ISG_DoubleTap`: `InkSystemGesture` = 17;
public const val `ISG_Drag`: `InkSystemGesture` = 19;
public const val `ISG_Flick`: `InkSystemGesture` = 31;
public const val `ISG_HoldEnter`: `InkSystemGesture` = 21;
public const val `ISG_HoldLeave`: `InkSystemGesture` = 22;
public const val `ISG_HoverEnter`: `InkSystemGesture` = 23;
public const val `ISG_HoverLeave`: `InkSystemGesture` = 24;
public const val `ISG_RightDrag`: `InkSystemGesture` = 20;
public const val `ISG_RightTap`: `InkSystemGesture` = 18;
public const val `ISG_Tap`: `InkSystemGesture` = 16;
public const val `InPlace`: `VisualState` = 0;
public typealias `InPlaceDirection` = Int;
public const val `InPlaceDirection_Auto`: `InPlaceDirection` = 0;
public const val `InPlaceDirection_Bottom`: `InPlaceDirection` = 1;
public const val `InPlaceDirection_Top`: `InPlaceDirection` = 2;
public typealias `InPlaceState` = Int;
public const val `InPlaceState_Auto`: `InPlaceState` = 0;
public const val `InPlaceState_Expanded`: `InPlaceState` = 2;
public const val `InPlaceState_HoverTarget`: `InPlaceState` = 1;
// UNSUPPORTED Rust 1135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const Ink: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13de4a42_8d21_4c8e_bf9c_8f69cb068fca);

public typealias `InkApplicationGesture` = Int;
public typealias `InkBoundingBoxMode` = Int;
public typealias `InkClipboardFormats` = Int;
public typealias `InkClipboardModes` = Int;
public typealias `InkCollectionMode` = Int;
// UNSUPPORTED Rust 1141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkCollector: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43fb1553_ad74_4ee8_88e4_3e6daac915db);

public const val `InkCollectorClipInkToMargin`: Int = 0;
public const val `InkCollectorDefaultMargin`: Int = -2147483648;
public typealias `InkCollectorEventInterest` = Int;
public typealias `InkCursorButtonState` = Int;
// UNSUPPORTED Rust 1146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkDisp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x937c1a34_151d_4610_9ca6_a8cc9bdb5d83);

public typealias `InkDisplayMode` = Int;
// UNSUPPORTED Rust 1148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkDivider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8854f6a0_4683_4ae7_9191_752fe64612c3);

public typealias `InkDivisionType` = Int;
// UNSUPPORTED Rust 1150:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkDrawingAttributes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8bf32a2_05a5_44c3_b3aa_5e80ac7d2576);

// UNSUPPORTED Rust 1151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkEdit: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe5ca59f5_57c4_4dd8_9bd6_1deeedd27af4);

public typealias `InkEditStatus` = Int;
public typealias `InkExtractFlags` = Int;
public typealias `InkInsertMode` = Int;
public const val `InkMaxTransparencyValue`: Int = 255;
public const val `InkMinTransparencyValue`: Int = 0;
public typealias `InkMode` = Int;
public typealias `InkMouseButton` = Int;
public typealias `InkMousePointer` = Int;
// UNSUPPORTED Rust 1160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkOverlay: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65d00646_cde3_4a88_9163_6769f0f1a97d);

public typealias `InkOverlayAttachMode` = Int;
public typealias `InkOverlayEditingMode` = Int;
public typealias `InkOverlayEraserMode` = Int;
public typealias `InkPenTip` = Int;
public typealias `InkPersistenceCompressionMode` = Int;
public typealias `InkPersistenceFormat` = Int;
// UNSUPPORTED Rust 1167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkPicture: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04a1e553_fe36_4fde_865e_344194e69424);

public typealias `InkPictureSizeMode` = Int;
public typealias `InkRasterOperation` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `InkRecoGuide` (
    public var `rectWritingBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `rectDrawnBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `cRows`: Int,
    public var `cColumns`: Int,
    public var `midline`: Int,
)
public typealias `InkRecognitionAlternatesSelection` = Int;
public typealias `InkRecognitionConfidence` = Int;
public typealias `InkRecognitionModes` = Int;
public typealias `InkRecognitionStatus` = Int;
public typealias `InkRecognizerCapabilities` = Int;
public typealias `InkRecognizerCharacterAutoCompletionMode` = Int;
// UNSUPPORTED Rust 1185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkRecognizerContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaac46a37_9229_4fc0_8cce_4497569bf4d1);

// UNSUPPORTED Rust 1186:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkRecognizerGuide: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8770d941_a63a_4671_a375_2855a18eba73);

// UNSUPPORTED Rust 1187:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkRecognizers: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9fd4e808_f6e6_4e65_98d3_aa39054c1255);

// UNSUPPORTED Rust 1188:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkRectangle: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43b07326_aae0_4b62_a83d_5fd768b7353c);

// UNSUPPORTED Rust 1189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkRenderer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c1cc6e4_d7eb_4eeb_9091_15a7c8791ed9);

public typealias `InkSelectionConstants` = Int;
public typealias `InkShiftKeyModifierFlags` = Int;
// UNSUPPORTED Rust 1192:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkStrokes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48f491bc_240e_4860_b079_a1e94d3d2c86);

public typealias `InkSystemGesture` = Int;
// UNSUPPORTED Rust 1194:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkTablets: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e4fcb12_510a_4d40_9304_1da10ae9147c);

// UNSUPPORTED Rust 1195:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkTransform: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe3d5d93c_1663_4a78_a1a7_22375dfebaee);

// UNSUPPORTED Rust 1196:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InkWordList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9de85094_f71f_44f1_8471_15a2fa76fcf3);

public typealias `InteractionMode` = Int;
public const val `InteractionMode_DockedBottom`: `InteractionMode` = 3;
public const val `InteractionMode_DockedTop`: `InteractionMode` = 2;
public const val `InteractionMode_Floating`: `InteractionMode` = 1;
public const val `InteractionMode_InPlace`: `InteractionMode` = 0;
public typealias `KEYMODIFIER` = Int;
public const val `KEYMODIFIER_ALTGR`: `KEYMODIFIER` = 16;
public const val `KEYMODIFIER_CONTROL`: `KEYMODIFIER` = 1;
public const val `KEYMODIFIER_EXT`: `KEYMODIFIER` = 32;
public const val `KEYMODIFIER_MENU`: `KEYMODIFIER` = 2;
public const val `KEYMODIFIER_SHIFT`: `KEYMODIFIER` = 4;
public const val `KEYMODIFIER_WIN`: `KEYMODIFIER` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LATTICE_METRICS` (
    public var `lsBaseline`: `LINE_SEGMENT`,
    public var `iMidlineOffset`: Short,
)
public const val `LEFT_BUTTON`: `MouseButton` = 1;
public typealias `LINE_METRICS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LINE_SEGMENT` (
    public var `PtA`: `super`.`super`.`Foundation`.`POINT`,
    public var `PtB`: `super`.`super`.`Foundation`.`POINT`,
)
public const val `LM_ASCENDER`: `LINE_METRICS` = 2;
public const val `LM_BASELINE`: `LINE_METRICS` = 0;
public const val `LM_DESCENDER`: `LINE_METRICS` = 3;
public const val `LM_MIDLINE`: `LINE_METRICS` = 1;
public const val `MAX_FRIENDLYNAME`: UInt = 64u;
public const val `MAX_LANGUAGES`: UInt = 64u;
public const val `MAX_PACKET_BUTTON_COUNT`: UInt = 32u;
public const val `MAX_PACKET_PROPERTY_COUNT`: UInt = 32u;
public const val `MAX_VENDORNAME`: UInt = 32u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_PENINPUT_PANEL_PROPERTY_T`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft PenInputPanel 1.5");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_TIP_COMBOBOXLIST_PROPERTY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft TIP ComboBox List Window Identifier");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_TIP_NO_INSERT_BUTTON_PROPERTY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft TIP No Insert Option");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_TIP_OPENING_MSG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TabletInputPanelOpening");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MICROSOFT_URL_EXPERIENCE_PROPERTY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Microsoft TIP URL Experience");
public typealias `MICUIELEMENT` = Int;
public typealias `MICUIELEMENTSTATE` = Int;
public const val `MICUIELEMENTSTATE_DISABLED`: `MICUIELEMENTSTATE` = 4;
public const val `MICUIELEMENTSTATE_HOT`: `MICUIELEMENTSTATE` = 2;
public const val `MICUIELEMENTSTATE_NORMAL`: `MICUIELEMENTSTATE` = 1;
public const val `MICUIELEMENTSTATE_PRESSED`: `MICUIELEMENTSTATE` = 3;
public const val `MICUIELEMENT_BUTTON_CANCEL`: `MICUIELEMENT` = 128;
public const val `MICUIELEMENT_BUTTON_CLEAR`: `MICUIELEMENT` = 8;
public const val `MICUIELEMENT_BUTTON_CORRECT`: `MICUIELEMENT` = 4;
public const val `MICUIELEMENT_BUTTON_ERASE`: `MICUIELEMENT` = 2;
public const val `MICUIELEMENT_BUTTON_INSERT`: `MICUIELEMENT` = 64;
public const val `MICUIELEMENT_BUTTON_REDO`: `MICUIELEMENT` = 32;
public const val `MICUIELEMENT_BUTTON_UNDO`: `MICUIELEMENT` = 16;
public const val `MICUIELEMENT_BUTTON_WRITE`: `MICUIELEMENT` = 1;
public const val `MICUIELEMENT_INKPANEL_BACKGROUND`: `MICUIELEMENT` = 256;
public const val `MICUIELEMENT_RESULTPANEL_BACKGROUND`: `MICUIELEMENT` = 512;
public const val `MIDDLE_BUTTON`: `MouseButton` = 4;
// UNSUPPORTED Rust 1254:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MathInputControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc561816c_14d8_4090_830c_98d994b21c7b);

public typealias `MouseButton` = Int;
public const val `NO_BUTTON`: `MouseButton` = 0;
public const val `NUM_FLICK_DIRECTIONS`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKET_DESCRIPTION` (
    public var `cbPacketSize`: UInt,
    public var `cPacketProperties`: UInt,
    public var `pPacketProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PACKET_PROPERTY`>?,
    public var `cButtons`: UInt,
    public var `pguidButtons`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 1267:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PACKET_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PACKET_PROPERTY` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `PropertyMetrics`: `PROPERTY_METRICS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROPERTY_METRICS` (
    public var `nLogicalMin`: Int,
    public var `nLogicalMax`: Int,
    public var `Units`: `PROPERTY_UNITS`,
    public var `fResolution`: Float,
)
public typealias `PROPERTY_UNITS` = Int;
public const val `PROPERTY_UNITS_AMPERE`: `PROPERTY_UNITS` = 15;
public const val `PROPERTY_UNITS_CANDELA`: `PROPERTY_UNITS` = 16;
public const val `PROPERTY_UNITS_CENTIMETERS`: `PROPERTY_UNITS` = 2;
public const val `PROPERTY_UNITS_DEFAULT`: `PROPERTY_UNITS` = 0;
public const val `PROPERTY_UNITS_DEGREES`: `PROPERTY_UNITS` = 3;
public const val `PROPERTY_UNITS_ENGLINEAR`: `PROPERTY_UNITS` = 10;
public const val `PROPERTY_UNITS_ENGROTATION`: `PROPERTY_UNITS` = 11;
public const val `PROPERTY_UNITS_FAHRENHEIT`: `PROPERTY_UNITS` = 14;
public const val `PROPERTY_UNITS_GRAMS`: `PROPERTY_UNITS` = 7;
public const val `PROPERTY_UNITS_INCHES`: `PROPERTY_UNITS` = 1;
public const val `PROPERTY_UNITS_KELVIN`: `PROPERTY_UNITS` = 13;
public const val `PROPERTY_UNITS_POUNDS`: `PROPERTY_UNITS` = 6;
public const val `PROPERTY_UNITS_RADIANS`: `PROPERTY_UNITS` = 4;
public const val `PROPERTY_UNITS_SECONDS`: `PROPERTY_UNITS` = 5;
public const val `PROPERTY_UNITS_SILINEAR`: `PROPERTY_UNITS` = 8;
public const val `PROPERTY_UNITS_SIROTATION`: `PROPERTY_UNITS` = 9;
public const val `PROPERTY_UNITS_SLUGS`: `PROPERTY_UNITS` = 12;
public const val `PT_Default`: `PanelType` = 0;
public const val `PT_Handwriting`: `PanelType` = 2;
public const val `PT_Inactive`: `PanelType` = 1;
public const val `PT_Keyboard`: `PanelType` = 3;
public typealias `PanelInputArea` = Int;
public const val `PanelInputArea_Auto`: `PanelInputArea` = 0;
public const val `PanelInputArea_CharacterPad`: `PanelInputArea` = 3;
public const val `PanelInputArea_Keyboard`: `PanelInputArea` = 1;
public const val `PanelInputArea_WritingPad`: `PanelInputArea` = 2;
public typealias `PanelType` = Int;
// UNSUPPORTED Rust 1314:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PenInputPanel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf744e496_1b5a_489e_81dc_fbd7ac6298a8);

// UNSUPPORTED Rust 1315:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PenInputPanel_Internal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x802b1fb9_056b_4720_b0cc_80d23b71171e);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PfnRecoCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `HRECOCONTEXT`) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `RECOCONF_HIGHCONFIDENCE`: UInt = 1u;
public const val `RECOCONF_LOWCONFIDENCE`: Int = -1;
public const val `RECOCONF_MEDIUMCONFIDENCE`: UInt = 0u;
public const val `RECOCONF_NOTSET`: UInt = 128u;
public const val `RECOFLAG_AUTOSPACE`: UInt = 64u;
public const val `RECOFLAG_COERCE`: UInt = 2u;
public const val `RECOFLAG_DISABLEPERSONALIZATION`: UInt = 32u;
public const val `RECOFLAG_LINEMODE`: UInt = 16u;
public const val `RECOFLAG_PREFIXOK`: UInt = 8u;
public const val `RECOFLAG_SINGLESEG`: UInt = 4u;
public const val `RECOFLAG_WORDMODE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RECO_ATTRS` (
    public var `dwRecoCapabilityFlags`: UInt,
    public var `awcVendorName`: UShortArray,
    public var `awcFriendlyName`: UShortArray,
    public var `awLanguageId`: UShortArray,
)
// UNSUPPORTED Rust 1336:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RECO_ATTRS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RECO_GUIDE` (
    public var `xOrigin`: Int,
    public var `yOrigin`: Int,
    public var `cxBox`: Int,
    public var `cyBox`: Int,
    public var `cxBase`: Int,
    public var `cyBase`: Int,
    public var `cHorzBox`: Int,
    public var `cVertBox`: Int,
    public var `cyMid`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RECO_LATTICE` (
    public var `ulColumnCount`: UInt,
    public var `pLatticeColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RECO_LATTICE_COLUMN`>?,
    public var `ulPropertyCount`: UInt,
    public var `pGuidProperties`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `ulBestResultColumnCount`: UInt,
    public var `pulBestResultColumns`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pulBestResultIndexes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 1365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RECO_LATTICE {
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
public class `RECO_LATTICE_COLUMN` (
    public var `key`: UInt,
    public var `cpProp`: `RECO_LATTICE_PROPERTIES`,
    public var `cStrokes`: UInt,
    public var `pStrokes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `cLatticeElements`: UInt,
    public var `pLatticeElements`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RECO_LATTICE_ELEMENT`>?,
)
// UNSUPPORTED Rust 1380:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RECO_LATTICE_COLUMN {
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
public class `RECO_LATTICE_ELEMENT` (
    public var `score`: Int,
    public var `type`: UShort,
    public var `pData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ulNextColumn`: UInt,
    public var `ulStrokeNumber`: UInt,
    public var `epProp`: `RECO_LATTICE_PROPERTIES`,
)
// UNSUPPORTED Rust 1395:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RECO_LATTICE_ELEMENT {
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
public class `RECO_LATTICE_PROPERTIES` (
    public var `cProperties`: UInt,
    public var `apProps`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RECO_LATTICE_PROPERTY`>>?,
)
// UNSUPPORTED Rust 1406:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RECO_LATTICE_PROPERTIES {
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
public class `RECO_LATTICE_PROPERTY` (
    public var `guidProperty`: `windows_sys`.`core`.`GUID`,
    public var `cbPropertyValue`: UShort,
    public var `pPropertyValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1418:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RECO_LATTICE_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RECO_RANGE` (
    public var `iwcBegin`: UInt,
    public var `cCount`: UInt,
)
public typealias `RECO_TYPE` = Int;
public const val `RECO_TYPE_WCHAR`: `RECO_TYPE` = 1;
public const val `RECO_TYPE_WSTRING`: `RECO_TYPE` = 0;
public const val `RF_ADVISEINKCHANGE`: Int = 4096;
public const val `RF_ARBITRARY_ANGLE`: Int = 1024;
public const val `RF_BOXED_INPUT`: Int = 16;
public const val `RF_CAC_INPUT`: Int = 32;
public const val `RF_DONTCARE`: Int = 1;
public const val `RF_DOWN_AND_LEFT`: Int = 256;
public const val `RF_DOWN_AND_RIGHT`: Int = 512;
public const val `RF_FREE_INPUT`: Int = 4;
public const val `RF_LATTICE`: Int = 2048;
public const val `RF_LEFT_AND_DOWN`: Int = 128;
public const val `RF_LINED_INPUT`: Int = 8;
public const val `RF_OBJECT`: Int = 2;
public const val `RF_PERFORMSLINEBREAKING`: Int = 65536;
public const val `RF_PERSONALIZABLE`: Int = 16384;
public const val `RF_REQUIRESSEGMENTATIONBREAKING`: Int = 131072;
public const val `RF_RIGHT_AND_DOWN`: Int = 64;
public const val `RF_STROKEREORDER`: Int = 8192;
public const val `RIGHT_BUTTON`: `MouseButton` = 2;
public const val `RTSDI_AllData`: `RealTimeStylusDataInterest` = -1;
public const val `RTSDI_CustomStylusDataAdded`: `RealTimeStylusDataInterest` = 32768;
public const val `RTSDI_DefaultEvents`: `RealTimeStylusDataInterest` = 37766;
public const val `RTSDI_Error`: `RealTimeStylusDataInterest` = 1;
public const val `RTSDI_InAirPackets`: `RealTimeStylusDataInterest` = 32;
public const val `RTSDI_None`: `RealTimeStylusDataInterest` = 0;
public const val `RTSDI_Packets`: `RealTimeStylusDataInterest` = 256;
public const val `RTSDI_RealTimeStylusDisabled`: `RealTimeStylusDataInterest` = 4;
public const val `RTSDI_RealTimeStylusEnabled`: `RealTimeStylusDataInterest` = 2;
public const val `RTSDI_StylusButtonDown`: `RealTimeStylusDataInterest` = 2048;
public const val `RTSDI_StylusButtonUp`: `RealTimeStylusDataInterest` = 1024;
public const val `RTSDI_StylusDown`: `RealTimeStylusDataInterest` = 128;
public const val `RTSDI_StylusInRange`: `RealTimeStylusDataInterest` = 16;
public const val `RTSDI_StylusNew`: `RealTimeStylusDataInterest` = 8;
public const val `RTSDI_StylusOutOfRange`: `RealTimeStylusDataInterest` = 64;
public const val `RTSDI_StylusUp`: `RealTimeStylusDataInterest` = 512;
public const val `RTSDI_SystemEvents`: `RealTimeStylusDataInterest` = 4096;
public const val `RTSDI_TabletAdded`: `RealTimeStylusDataInterest` = 8192;
public const val `RTSDI_TabletRemoved`: `RealTimeStylusDataInterest` = 16384;
public const val `RTSDI_UpdateMapping`: `RealTimeStylusDataInterest` = 65536;
public const val `RTSLT_AsyncEventLock`: `RealTimeStylusLockType` = 4;
public const val `RTSLT_AsyncObjLock`: `RealTimeStylusLockType` = 13;
public const val `RTSLT_ExcludeCallback`: `RealTimeStylusLockType` = 8;
public const val `RTSLT_ObjLock`: `RealTimeStylusLockType` = 1;
public const val `RTSLT_SyncEventLock`: `RealTimeStylusLockType` = 2;
public const val `RTSLT_SyncObjLock`: `RealTimeStylusLockType` = 11;
// UNSUPPORTED Rust 1476:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const RealTimeStylus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe26b366d_f998_43ce_836f_cb6d904432b0);

public typealias `RealTimeStylusDataInterest` = Int;
public typealias `RealTimeStylusLockType` = Int;
public const val `SAFE_PARTIAL`: UInt = 1u;
public typealias `SCROLLDIRECTION` = Int;
public const val `SCROLLDIRECTION_DOWN`: `SCROLLDIRECTION` = 1;
public const val `SCROLLDIRECTION_UP`: `SCROLLDIRECTION` = 0;
public const val `SHR_E`: `SelectionHitResult` = 5;
public const val `SHR_N`: `SelectionHitResult` = 7;
public const val `SHR_NE`: `SelectionHitResult` = 3;
public const val `SHR_NW`: `SelectionHitResult` = 1;
public const val `SHR_None`: `SelectionHitResult` = 0;
public const val `SHR_S`: `SelectionHitResult` = 8;
public const val `SHR_SE`: `SelectionHitResult` = 2;
public const val `SHR_SW`: `SelectionHitResult` = 4;
public const val `SHR_Selection`: `SelectionHitResult` = 9;
public const val `SHR_W`: `SelectionHitResult` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STROKE_RANGE` (
    public var `iStrokeBegin`: UInt,
    public var `iStrokeEnd`: UInt,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_ALTITUDEORIENTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{82DEC5C7-F6BA-4906-894F-66D68DFC456C}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_AZIMUTHORIENTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{029123B4-8828-410B-B250-A0536595E5DC}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_BUTTONPRESSURE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{8B7FEFC4-96AA-4BFE-AC26-8A5F0BE07BF5}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_DEVICE_CONTACT_ID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{02585B91-049B-4750-9615-DF8948AB3C9C}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_FINGERCONTACTCONFIDENCE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{E706C804-57F0-4F00-8A0C-853D57789BE9}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_HEIGHT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{E61858D2-E447-4218-9D3F-18865C203DF4}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_NORMALPRESSURE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{7307502D-F9F4-4E18-B3F2-2CE1B1A3610C}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_PAKETSTATUS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{6E0E07BF-AFE7-4CF7-87D1-AF6446208418}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_PITCHROTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{7F7E57B7-BE37-4BE1-A356-7A84160E1893}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_ROLLROTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{5D5D5E56-6BA9-4C5B-9FB0-851C91714E56}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_SERIALNUMBER`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{78A81B56-0935-4493-BAAE-00541A8A16C4}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_TANGENTPRESSURE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{6DA4488B-5244-41EC-905B-32D89AB80809}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_TIMERTICK`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{436510C5-FED3-45D1-8B76-71D3EA7A829D}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_TWISTORIENTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{0D324960-13B2-41E4-ACE6-7AE9D43D2D3B}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_WIDTH`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{BAABE94D-2712-48F5-BE9D-8F8B5EA0711A}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_X`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{598A6A8F-52C0-4BA0-93AF-AF357411A561}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_XTILTORIENTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{A8D07B3A-8BF0-40B0-95A9-B80A6BB787BF}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_Y`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{B53F9F75-04E0-4498-A7EE-C30DBB5A9011}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_YAWROTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{6A849980-7C3A-45B7-AA82-90A262950E89}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_YTILTORIENTATION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{0E932389-1D77-43AF-AC00-5B950D6D4B2D}");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_GUID_Z`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("{735ADB30-0EBB-4788-A0E4-0F316490055D}");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_EVENT_DATA` (
    public var `bModifier`: UByte,
    public var `wKey`: UShort,
    public var `xPos`: Int,
    public var `yPos`: Int,
    public var `bCursorMode`: UByte,
    public var `dwButtonState`: UInt,
)
public typealias `ScrollBarsConstants` = Int;
public typealias `SelAlignmentConstants` = Int;
public typealias `SelectionHitResult` = Int;
// UNSUPPORTED Rust 1533:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SketchInk: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf0291081_e87c_4e07_97da_a0a03761e586);

// UNSUPPORTED Rust 1534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const StrokeBuilder: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe810cee7_6e51_4cb0_aa3a_0b985b70daf7);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `StylusInfo` (
    public var `tcid`: UInt,
    public var `cid`: UInt,
    public var `bIsInvertedCursor`: `windows_sys`.`core`.`BOOL`,
)
public typealias `StylusQueue` = Int;
public const val `SyncStylusQueue`: `StylusQueue` = 1;
public const val `TABLET_DISABLE_FLICKFALLBACKKEYS`: UInt = 1048576u;
public const val `TABLET_DISABLE_FLICKS`: UInt = 65536u;
public const val `TABLET_DISABLE_PENBARRELFEEDBACK`: UInt = 16u;
public const val `TABLET_DISABLE_PENTAPFEEDBACK`: UInt = 8u;
public const val `TABLET_DISABLE_PRESSANDHOLD`: UInt = 1u;
public const val `TABLET_DISABLE_SMOOTHSCROLLING`: UInt = 524288u;
public const val `TABLET_DISABLE_TOUCHSWITCH`: UInt = 32768u;
public const val `TABLET_DISABLE_TOUCHUIFORCEOFF`: UInt = 512u;
public const val `TABLET_DISABLE_TOUCHUIFORCEON`: UInt = 256u;
public const val `TABLET_ENABLE_FLICKLEARNINGMODE`: UInt = 262144u;
public const val `TABLET_ENABLE_FLICKSONCONTEXT`: UInt = 131072u;
public const val `TABLET_ENABLE_MULTITOUCHDATA`: UInt = 16777216u;
public const val `TCF_ALLOW_RECOGNITION`: `GET_DANDIDATE_FLAGS` = 1;
public const val `TCF_FORCE_RECOGNITION`: `GET_DANDIDATE_FLAGS` = 2;
public const val `TDK_Mouse`: `TabletDeviceKind` = 0;
public const val `TDK_Pen`: `TabletDeviceKind` = 1;
public const val `TDK_Touch`: `TabletDeviceKind` = 2;
public const val `THWC_CursorMustTouch`: `TabletHardwareCapabilities` = 2;
public const val `THWC_CursorsHavePhysicalIds`: `TabletHardwareCapabilities` = 8;
public const val `THWC_HardProximity`: `TabletHardwareCapabilities` = 4;
public const val `THWC_Integrated`: `TabletHardwareCapabilities` = 1;
public const val `TPMU_Centimeters`: `TabletPropertyMetricUnit` = 2;
public const val `TPMU_Default`: `TabletPropertyMetricUnit` = 0;
public const val `TPMU_Degrees`: `TabletPropertyMetricUnit` = 3;
public const val `TPMU_Grams`: `TabletPropertyMetricUnit` = 7;
public const val `TPMU_Inches`: `TabletPropertyMetricUnit` = 1;
public const val `TPMU_Pounds`: `TabletPropertyMetricUnit` = 6;
public const val `TPMU_Radians`: `TabletPropertyMetricUnit` = 4;
public const val `TPMU_Seconds`: `TabletPropertyMetricUnit` = 5;
public typealias `TabletDeviceKind` = Int;
public typealias `TabletHardwareCapabilities` = Int;
public typealias `TabletPropertyMetricUnit` = Int;
// UNSUPPORTED Rust 1576:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TextInputPanel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf9b189d7_228b_4f2b_8650_b97f59e02c8c);

// UNSUPPORTED Rust 1577:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TipAutoCompleteClient: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x807c1e6c_1d00_453f_b920_b61bb7cdd997);

public typealias `VisualState` = Int;
public const val `WM_TABLET_ADDED`: UInt = 712u;
public const val `WM_TABLET_DEFBASE`: UInt = 704u;
public const val `WM_TABLET_DELETED`: UInt = 713u;
public const val `WM_TABLET_FLICK`: UInt = 715u;
public const val `WM_TABLET_MAXOFFSET`: UInt = 32u;
public const val `WM_TABLET_QUERYSYSTEMGESTURESTATUS`: UInt = 716u;
public const val `rtfBoth`: `ScrollBarsConstants` = 3;
public const val `rtfCenter`: `SelAlignmentConstants` = 2;
public const val `rtfFixedSingle`: `BorderStyleConstants` = 1;
public const val `rtfFlat`: `AppearanceConstants` = 0;
public const val `rtfHorizontal`: `ScrollBarsConstants` = 1;
public const val `rtfLeft`: `SelAlignmentConstants` = 0;
public const val `rtfNoBorder`: `BorderStyleConstants` = 0;
public const val `rtfNone`: `ScrollBarsConstants` = 0;
public const val `rtfRight`: `SelAlignmentConstants` = 1;
public const val `rtfThreeD`: `AppearanceConstants` = 1;
public const val `rtfVertical`: `ScrollBarsConstants` = 2;
