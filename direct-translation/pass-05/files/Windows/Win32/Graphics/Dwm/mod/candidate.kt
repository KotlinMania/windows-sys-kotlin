// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmAttachMilContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmAttachMilContent`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmDefWindowProc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmDefWindowProc`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `msg` : UInt, `wparam` : `super`.`super`.`Foundation`.`WPARAM`, `lparam` : `super`.`super`.`Foundation`.`LPARAM`, `plresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`LRESULT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmDetachMilContent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmDetachMilContent`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmEnableBlurBehindWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DwmEnableBlurBehindWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pblurbehind` : /* Rust *const */ kotlinx.cinterop.CPointer<`DWM_BLURBEHIND`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmEnableComposition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmEnableComposition`(`ucompositionaction` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmEnableMMCSS; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmEnableMMCSS`(`fenablemmcss` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmExtendFrameIntoClientArea; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public external fun `DwmExtendFrameIntoClientArea`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pmarinset` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Controls`.`MARGINS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmFlush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmFlush`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmGetColorizationColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmGetColorizationColor`(`pcrcolorization` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfopaqueblend` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmGetCompositionTimingInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmGetCompositionTimingInfo`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ptiminginfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DWM_TIMING_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmGetGraphicsStreamClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmGetGraphicsStreamClient`(`uindex` : UInt, `pclientuuid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmGetGraphicsStreamTransformHint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmGetGraphicsStreamTransformHint`(`uindex` : UInt, `ptransform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MilMatrix3x2D`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmGetTransportAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmGetTransportAttributes`(`pfisremoting` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pfisconnected` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pdwgeneration` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmGetUnmetTabRequirements; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmGetUnmetTabRequirements`(`appwindow` : `super`.`super`.`Foundation`.`HWND`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DWM_TAB_WINDOW_REQUIREMENTS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmGetWindowAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmGetWindowAttribute`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwattribute` : UInt, `pvattribute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbattribute` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmInvalidateIconicBitmaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmInvalidateIconicBitmaps`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmIsCompositionEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmIsCompositionEnabled`(`pfenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmModifyPreviousDxFrameDuration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmModifyPreviousDxFrameDuration`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `crefreshes` : Int, `frelative` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmQueryThumbnailSourceSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmQueryThumbnailSourceSize`(`hthumbnail` : Long, `psize` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`SIZE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmRegisterThumbnail; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmRegisterThumbnail`(`hwnddestination` : `super`.`super`.`Foundation`.`HWND`, `hwndsource` : `super`.`super`.`Foundation`.`HWND`, `phthumbnailid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmRenderGesture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmRenderGesture`(`gt` : `GESTURE_TYPE`, `ccontacts` : UInt, `pdwpointerid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmSetDxFrameDuration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmSetDxFrameDuration`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `crefreshes` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmSetIconicLivePreviewBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DwmSetIconicLivePreviewBitmap`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hbmp` : `super`.`Gdi`.`HBITMAP`, `pptclient` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?, `dwsitflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmSetIconicThumbnail; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DwmSetIconicThumbnail`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hbmp` : `super`.`Gdi`.`HBITMAP`, `dwsitflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmSetPresentParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmSetPresentParameters`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ppresentparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DWM_PRESENT_PARAMETERS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmSetWindowAttribute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmSetWindowAttribute`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwattribute` : UInt, `pvattribute` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbattribute` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmShowContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmShowContact`(`dwpointerid` : UInt, `eshowcontact` : `DWM_SHOWCONTACT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmTetherContact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmTetherContact`(`dwpointerid` : UInt, `fenable` : `windows_sys`.`core`.`BOOL`, `pttether` : `super`.`super`.`Foundation`.`POINT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmTransitionOwnedWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmTransitionOwnedWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `target` : `DWMTRANSITION_OWNEDWINDOW_TARGET`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmUnregisterThumbnail; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmUnregisterThumbnail`(`hthumbnailid` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dwmapi.dll, ABI=system, export=DwmUpdateThumbnailProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DwmUpdateThumbnailProperties`(`hthumbnailid` : Long, `ptnproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`DWM_THUMBNAIL_PROPERTIES`>?) : `windows_sys`.`core`.`HRESULT`
public typealias `DWMFLIP3DWINDOWPOLICY` = Int;
public const val `DWMFLIP3D_DEFAULT`: `DWMFLIP3DWINDOWPOLICY` = 0;
public const val `DWMFLIP3D_EXCLUDEABOVE`: `DWMFLIP3DWINDOWPOLICY` = 2;
public const val `DWMFLIP3D_EXCLUDEBELOW`: `DWMFLIP3DWINDOWPOLICY` = 1;
public const val `DWMFLIP3D_LAST`: `DWMFLIP3DWINDOWPOLICY` = 3;
public typealias `DWMNCRENDERINGPOLICY` = Int;
public const val `DWMNCRP_DISABLED`: `DWMNCRENDERINGPOLICY` = 1;
public const val `DWMNCRP_ENABLED`: `DWMNCRENDERINGPOLICY` = 2;
public const val `DWMNCRP_LAST`: `DWMNCRENDERINGPOLICY` = 3;
public const val `DWMNCRP_USEWINDOWSTYLE`: `DWMNCRENDERINGPOLICY` = 0;
public const val `DWMSBT_AUTO`: `DWM_SYSTEMBACKDROP_TYPE` = 0;
public const val `DWMSBT_MAINWINDOW`: `DWM_SYSTEMBACKDROP_TYPE` = 2;
public const val `DWMSBT_NONE`: `DWM_SYSTEMBACKDROP_TYPE` = 1;
public const val `DWMSBT_TABBEDWINDOW`: `DWM_SYSTEMBACKDROP_TYPE` = 4;
public const val `DWMSBT_TRANSIENTWINDOW`: `DWM_SYSTEMBACKDROP_TYPE` = 3;
public const val `DWMSC_ALL`: `DWM_SHOWCONTACT` = 4294967295u;
public const val `DWMSC_DOWN`: `DWM_SHOWCONTACT` = 1u;
public const val `DWMSC_DRAG`: `DWM_SHOWCONTACT` = 4u;
public const val `DWMSC_HOLD`: `DWM_SHOWCONTACT` = 8u;
public const val `DWMSC_NONE`: `DWM_SHOWCONTACT` = 0u;
public const val `DWMSC_PENBARREL`: `DWM_SHOWCONTACT` = 16u;
public const val `DWMSC_UP`: `DWM_SHOWCONTACT` = 2u;
public const val `DWMTRANSITION_OWNEDWINDOW_NULL`: `DWMTRANSITION_OWNEDWINDOW_TARGET` = -1;
public const val `DWMTRANSITION_OWNEDWINDOW_REPOSITION`: `DWMTRANSITION_OWNEDWINDOW_TARGET` = 0;
public typealias `DWMTRANSITION_OWNEDWINDOW_TARGET` = Int;
public const val `DWMTWR_APP_COMPAT`: `DWM_TAB_WINDOW_REQUIREMENTS` = 512;
public const val `DWMTWR_GROUP_POLICY`: `DWM_TAB_WINDOW_REQUIREMENTS` = 256;
public const val `DWMTWR_IMPLEMENTED_BY_SYSTEM`: `DWM_TAB_WINDOW_REQUIREMENTS` = 1;
public const val `DWMTWR_NONE`: `DWM_TAB_WINDOW_REQUIREMENTS` = 0;
public const val `DWMTWR_TABBING_ENABLED`: `DWM_TAB_WINDOW_REQUIREMENTS` = 64;
public const val `DWMTWR_USER_POLICY`: `DWM_TAB_WINDOW_REQUIREMENTS` = 128;
public const val `DWMTWR_WINDOW_DWM_ATTRIBUTES`: `DWM_TAB_WINDOW_REQUIREMENTS` = 16;
public const val `DWMTWR_WINDOW_MARGINS`: `DWM_TAB_WINDOW_REQUIREMENTS` = 32;
public const val `DWMTWR_WINDOW_REGION`: `DWM_TAB_WINDOW_REQUIREMENTS` = 8;
public const val `DWMTWR_WINDOW_RELATIONSHIP`: `DWM_TAB_WINDOW_REQUIREMENTS` = 2;
public const val `DWMTWR_WINDOW_STYLES`: `DWM_TAB_WINDOW_REQUIREMENTS` = 4;
public const val `DWMWA_ALLOW_NCPAINT`: `DWMWINDOWATTRIBUTE` = 4;
public const val `DWMWA_BORDER_COLOR`: `DWMWINDOWATTRIBUTE` = 34;
public const val `DWMWA_CAPTION_BUTTON_BOUNDS`: `DWMWINDOWATTRIBUTE` = 5;
public const val `DWMWA_CAPTION_COLOR`: `DWMWINDOWATTRIBUTE` = 35;
public const val `DWMWA_CLOAK`: `DWMWINDOWATTRIBUTE` = 13;
public const val `DWMWA_CLOAKED`: `DWMWINDOWATTRIBUTE` = 14;
public const val `DWMWA_COLOR_DEFAULT`: UInt = 4294967295u;
public const val `DWMWA_COLOR_NONE`: UInt = 4294967294u;
public const val `DWMWA_DISALLOW_PEEK`: `DWMWINDOWATTRIBUTE` = 11;
public const val `DWMWA_EXCLUDED_FROM_PEEK`: `DWMWINDOWATTRIBUTE` = 12;
public const val `DWMWA_EXTENDED_FRAME_BOUNDS`: `DWMWINDOWATTRIBUTE` = 9;
public const val `DWMWA_FLIP3D_POLICY`: `DWMWINDOWATTRIBUTE` = 8;
public const val `DWMWA_FORCE_ICONIC_REPRESENTATION`: `DWMWINDOWATTRIBUTE` = 7;
public const val `DWMWA_FREEZE_REPRESENTATION`: `DWMWINDOWATTRIBUTE` = 15;
public const val `DWMWA_HAS_ICONIC_BITMAP`: `DWMWINDOWATTRIBUTE` = 10;
public const val `DWMWA_LAST`: `DWMWINDOWATTRIBUTE` = 39;
public const val `DWMWA_NCRENDERING_ENABLED`: `DWMWINDOWATTRIBUTE` = 1;
public const val `DWMWA_NCRENDERING_POLICY`: `DWMWINDOWATTRIBUTE` = 2;
public const val `DWMWA_NONCLIENT_RTL_LAYOUT`: `DWMWINDOWATTRIBUTE` = 6;
public const val `DWMWA_PASSIVE_UPDATE_MODE`: `DWMWINDOWATTRIBUTE` = 16;
public const val `DWMWA_SYSTEMBACKDROP_TYPE`: `DWMWINDOWATTRIBUTE` = 38;
public const val `DWMWA_TEXT_COLOR`: `DWMWINDOWATTRIBUTE` = 36;
public const val `DWMWA_TRANSITIONS_FORCEDISABLED`: `DWMWINDOWATTRIBUTE` = 3;
public const val `DWMWA_USE_HOSTBACKDROPBRUSH`: `DWMWINDOWATTRIBUTE` = 17;
public const val `DWMWA_USE_IMMERSIVE_DARK_MODE`: `DWMWINDOWATTRIBUTE` = 20;
public const val `DWMWA_VISIBLE_FRAME_BORDER_THICKNESS`: `DWMWINDOWATTRIBUTE` = 37;
public const val `DWMWA_WINDOW_CORNER_PREFERENCE`: `DWMWINDOWATTRIBUTE` = 33;
public const val `DWMWCP_DEFAULT`: `DWM_WINDOW_CORNER_PREFERENCE` = 0;
public const val `DWMWCP_DONOTROUND`: `DWM_WINDOW_CORNER_PREFERENCE` = 1;
public const val `DWMWCP_ROUND`: `DWM_WINDOW_CORNER_PREFERENCE` = 2;
public const val `DWMWCP_ROUNDSMALL`: `DWM_WINDOW_CORNER_PREFERENCE` = 3;
public typealias `DWMWINDOWATTRIBUTE` = Int;
public const val `DWM_BB_BLURREGION`: UInt = 2u;
public const val `DWM_BB_ENABLE`: UInt = 1u;
public const val `DWM_BB_TRANSITIONONMAXIMIZED`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DWM_BLURBEHIND` (
    public var `dwFlags`: UInt,
    public var `fEnable`: `windows_sys`.`core`.`BOOL`,
    public var `hRgnBlur`: `super`.`Gdi`.`HRGN`,
    public var `fTransitionOnMaximized`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 116:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DWM_BLURBEHIND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DWM_CLOAKED_APP`: UInt = 1u;
public const val `DWM_CLOAKED_INHERITED`: UInt = 4u;
public const val `DWM_CLOAKED_SHELL`: UInt = 2u;
public const val `DWM_EC_DISABLECOMPOSITION`: UInt = 0u;
public const val `DWM_EC_ENABLECOMPOSITION`: UInt = 1u;
public const val `DWM_FRAME_DURATION_DEFAULT`: Int = -1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DWM_PRESENT_PARAMETERS` (
    public var `cbSize`: UInt,
    public var `fQueue`: `windows_sys`.`core`.`BOOL`,
    public var `cRefreshStart`: ULong,
    public var `cBuffer`: UInt,
    public var `fUseSourceRate`: `windows_sys`.`core`.`BOOL`,
    public var `rateSource`: `UNSIGNED_RATIO`,
    public var `cRefreshesPerFrame`: UInt,
    public var `eSampling`: `DWM_SOURCE_FRAME_SAMPLING`,
)
public typealias `DWM_SHOWCONTACT` = UInt;
public const val `DWM_SIT_DISPLAYFRAME`: UInt = 1u;
public typealias `DWM_SOURCE_FRAME_SAMPLING` = Int;
public const val `DWM_SOURCE_FRAME_SAMPLING_COVERAGE`: `DWM_SOURCE_FRAME_SAMPLING` = 1;
public const val `DWM_SOURCE_FRAME_SAMPLING_LAST`: `DWM_SOURCE_FRAME_SAMPLING` = 2;
public const val `DWM_SOURCE_FRAME_SAMPLING_POINT`: `DWM_SOURCE_FRAME_SAMPLING` = 0;
public typealias `DWM_SYSTEMBACKDROP_TYPE` = Int;
public typealias `DWM_TAB_WINDOW_REQUIREMENTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DWM_THUMBNAIL_PROPERTIES` (
    public var `dwFlags`: UInt,
    public var `rcDestination`: `super`.`super`.`Foundation`.`RECT`,
    public var `rcSource`: `super`.`super`.`Foundation`.`RECT`,
    public var `opacity`: UByte,
    public var `fVisible`: `windows_sys`.`core`.`BOOL`,
    public var `fSourceClientAreaOnly`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DWM_TIMING_INFO` (
    public var `cbSize`: UInt,
    public var `rateRefresh`: `UNSIGNED_RATIO`,
    public var `qpcRefreshPeriod`: ULong,
    public var `rateCompose`: `UNSIGNED_RATIO`,
    public var `qpcVBlank`: ULong,
    public var `cRefresh`: ULong,
    public var `cDXRefresh`: UInt,
    public var `qpcCompose`: ULong,
    public var `cFrame`: ULong,
    public var `cDXPresent`: UInt,
    public var `cRefreshFrame`: ULong,
    public var `cFrameSubmitted`: ULong,
    public var `cDXPresentSubmitted`: UInt,
    public var `cFrameConfirmed`: ULong,
    public var `cDXPresentConfirmed`: UInt,
    public var `cRefreshConfirmed`: ULong,
    public var `cDXRefreshConfirmed`: UInt,
    public var `cFramesLate`: ULong,
    public var `cFramesOutstanding`: UInt,
    public var `cFrameDisplayed`: ULong,
    public var `qpcFrameDisplayed`: ULong,
    public var `cRefreshFrameDisplayed`: ULong,
    public var `cFrameComplete`: ULong,
    public var `qpcFrameComplete`: ULong,
    public var `cFramePending`: ULong,
    public var `qpcFramePending`: ULong,
    public var `cFramesDisplayed`: ULong,
    public var `cFramesComplete`: ULong,
    public var `cFramesPending`: ULong,
    public var `cFramesAvailable`: ULong,
    public var `cFramesDropped`: ULong,
    public var `cFramesMissed`: ULong,
    public var `cRefreshNextDisplayed`: ULong,
    public var `cRefreshNextPresented`: ULong,
    public var `cRefreshesDisplayed`: ULong,
    public var `cRefreshesPresented`: ULong,
    public var `cRefreshStarted`: ULong,
    public var `cPixelsReceived`: ULong,
    public var `cPixelsDrawn`: ULong,
    public var `cBuffersEmpty`: ULong,
)
public const val `DWM_TNP_OPACITY`: UInt = 4u;
public const val `DWM_TNP_RECTDESTINATION`: UInt = 1u;
public const val `DWM_TNP_RECTSOURCE`: UInt = 2u;
public const val `DWM_TNP_SOURCECLIENTAREAONLY`: UInt = 16u;
public const val `DWM_TNP_VISIBLE`: UInt = 8u;
public typealias `DWM_WINDOW_CORNER_PREFERENCE` = Int;
public typealias `GESTURE_TYPE` = Int;
public const val `GT_PEN_DOUBLETAP`: `GESTURE_TYPE` = 1;
public const val `GT_PEN_PRESSANDHOLD`: `GESTURE_TYPE` = 3;
public const val `GT_PEN_PRESSANDHOLDABORT`: `GESTURE_TYPE` = 4;
public const val `GT_PEN_RIGHTTAP`: `GESTURE_TYPE` = 2;
public const val `GT_PEN_TAP`: `GESTURE_TYPE` = 0;
public const val `GT_TOUCH_DOUBLETAP`: `GESTURE_TYPE` = 6;
public const val `GT_TOUCH_PRESSANDHOLD`: `GESTURE_TYPE` = 8;
public const val `GT_TOUCH_PRESSANDHOLDABORT`: `GESTURE_TYPE` = 9;
public const val `GT_TOUCH_PRESSANDTAP`: `GESTURE_TYPE` = 10;
public const val `GT_TOUCH_RIGHTTAP`: `GESTURE_TYPE` = 7;
public const val `GT_TOUCH_TAP`: `GESTURE_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MilMatrix3x2D` (
    public var `S_11`: Double,
    public var `S_12`: Double,
    public var `S_21`: Double,
    public var `S_22`: Double,
    public var `DX`: Double,
    public var `DY`: Double,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UNSIGNED_RATIO` (
    public var `uiNumerator`: UInt,
    public var `uiDenominator`: UInt,
)
public const val `c_DwmMaxAdapters`: UInt = 16u;
public const val `c_DwmMaxMonitors`: UInt = 16u;
public const val `c_DwmMaxQueuedBuffers`: UInt = 8u;
