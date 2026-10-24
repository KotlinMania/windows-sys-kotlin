// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmAttachMilContent(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmDefWindowProc(hwnd : super::super::Foundation:: HWND, msg : u32, wparam : super::super::Foundation:: WPARAM, lparam : super::super::Foundation:: LPARAM, plresult : *mut super::super::Foundation:: LRESULT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmDetachMilContent(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dwmapi.dll" "system" fn DwmEnableBlurBehindWindow(hwnd : super::super::Foundation:: HWND, pblurbehind : *const DWM_BLURBEHIND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmEnableComposition(ucompositionaction : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmEnableMMCSS(fenablemmcss : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("dwmapi.dll" "system" fn DwmExtendFrameIntoClientArea(hwnd : super::super::Foundation:: HWND, pmarinset : *const super::super::UI::Controls:: MARGINS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmFlush() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmGetColorizationColor(pcrcolorization : *mut u32, pfopaqueblend : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmGetCompositionTimingInfo(hwnd : super::super::Foundation:: HWND, ptiminginfo : *mut DWM_TIMING_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmGetGraphicsStreamClient(uindex : u32, pclientuuid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmGetGraphicsStreamTransformHint(uindex : u32, ptransform : *mut MilMatrix3x2D) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmGetTransportAttributes(pfisremoting : *mut windows_sys::core::BOOL, pfisconnected : *mut windows_sys::core::BOOL, pdwgeneration : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmGetUnmetTabRequirements(appwindow : super::super::Foundation:: HWND, value : *mut DWM_TAB_WINDOW_REQUIREMENTS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmGetWindowAttribute(hwnd : super::super::Foundation:: HWND, dwattribute : u32, pvattribute : *mut core::ffi::c_void, cbattribute : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmInvalidateIconicBitmaps(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmIsCompositionEnabled(pfenabled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmModifyPreviousDxFrameDuration(hwnd : super::super::Foundation:: HWND, crefreshes : i32, frelative : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmQueryThumbnailSourceSize(hthumbnail : isize, psize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmRegisterThumbnail(hwnddestination : super::super::Foundation:: HWND, hwndsource : super::super::Foundation:: HWND, phthumbnailid : *mut isize) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmRenderGesture(gt : GESTURE_TYPE, ccontacts : u32, pdwpointerid : *const u32, ppoints : *const super::super::Foundation:: POINT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmSetDxFrameDuration(hwnd : super::super::Foundation:: HWND, crefreshes : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dwmapi.dll" "system" fn DwmSetIconicLivePreviewBitmap(hwnd : super::super::Foundation:: HWND, hbmp : super::Gdi:: HBITMAP, pptclient : *const super::super::Foundation:: POINT, dwsitflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dwmapi.dll" "system" fn DwmSetIconicThumbnail(hwnd : super::super::Foundation:: HWND, hbmp : super::Gdi:: HBITMAP, dwsitflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmSetPresentParameters(hwnd : super::super::Foundation:: HWND, ppresentparams : *mut DWM_PRESENT_PARAMETERS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmSetWindowAttribute(hwnd : super::super::Foundation:: HWND, dwattribute : u32, pvattribute : *const core::ffi::c_void, cbattribute : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmShowContact(dwpointerid : u32, eshowcontact : DWM_SHOWCONTACT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmTetherContact(dwpointerid : u32, fenable : windows_sys::core::BOOL, pttether : super::super::Foundation:: POINT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmTransitionOwnedWindow(hwnd : super::super::Foundation:: HWND, target : DWMTRANSITION_OWNEDWINDOW_TARGET) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmUnregisterThumbnail(hthumbnailid : isize) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("dwmapi.dll" "system" fn DwmUpdateThumbnailProperties(hthumbnailid : isize, ptnproperties : *const DWM_THUMBNAIL_PROPERTIES) -> windows_sys::core::HRESULT);

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
// UNSUPPORTED Rust 107:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DWM_BLURBEHIND {
//     pub dwFlags: u32,
//     pub fEnable: windows_sys::core::BOOL,
//     pub hRgnBlur: super::Gdi::HRGN,
//     pub fTransitionOnMaximized: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 116:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 128:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DWM_PRESENT_PARAMETERS {
//     pub cbSize: u32,
//     pub fQueue: windows_sys::core::BOOL,
//     pub cRefreshStart: u64,
//     pub cBuffer: u32,
//     pub fUseSourceRate: windows_sys::core::BOOL,
//     pub rateSource: UNSIGNED_RATIO,
//     pub cRefreshesPerFrame: u32,
//     pub eSampling: DWM_SOURCE_FRAME_SAMPLING,
// }

public typealias `DWM_SHOWCONTACT` = UInt;
public const val `DWM_SIT_DISPLAYFRAME`: UInt = 1u;
public typealias `DWM_SOURCE_FRAME_SAMPLING` = Int;
public const val `DWM_SOURCE_FRAME_SAMPLING_COVERAGE`: `DWM_SOURCE_FRAME_SAMPLING` = 1;
public const val `DWM_SOURCE_FRAME_SAMPLING_LAST`: `DWM_SOURCE_FRAME_SAMPLING` = 2;
public const val `DWM_SOURCE_FRAME_SAMPLING_POINT`: `DWM_SOURCE_FRAME_SAMPLING` = 0;
public typealias `DWM_SYSTEMBACKDROP_TYPE` = Int;
public typealias `DWM_TAB_WINDOW_REQUIREMENTS` = Int;
// UNSUPPORTED Rust 148:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DWM_THUMBNAIL_PROPERTIES {
//     pub dwFlags: u32,
//     pub rcDestination: super::super::Foundation::RECT,
//     pub rcSource: super::super::Foundation::RECT,
//     pub opacity: u8,
//     pub fVisible: windows_sys::core::BOOL,
//     pub fSourceClientAreaOnly: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 158:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DWM_TIMING_INFO {
//     pub cbSize: u32,
//     pub rateRefresh: UNSIGNED_RATIO,
//     pub qpcRefreshPeriod: u64,
//     pub rateCompose: UNSIGNED_RATIO,
//     pub qpcVBlank: u64,
//     pub cRefresh: u64,
//     pub cDXRefresh: u32,
//     pub qpcCompose: u64,
//     pub cFrame: u64,
//     pub cDXPresent: u32,
//     pub cRefreshFrame: u64,
//     pub cFrameSubmitted: u64,
//     pub cDXPresentSubmitted: u32,
//     pub cFrameConfirmed: u64,
//     pub cDXPresentConfirmed: u32,
//     pub cRefreshConfirmed: u64,
//     pub cDXRefreshConfirmed: u32,
//     pub cFramesLate: u64,
//     pub cFramesOutstanding: u32,
//     pub cFrameDisplayed: u64,
//     pub qpcFrameDisplayed: u64,
//     pub cRefreshFrameDisplayed: u64,
//     pub cFrameComplete: u64,
//     pub qpcFrameComplete: u64,
//     pub cFramePending: u64,
//     pub qpcFramePending: u64,
//     pub cFramesDisplayed: u64,
//     pub cFramesComplete: u64,
//     pub cFramesPending: u64,
//     pub cFramesAvailable: u64,
//     pub cFramesDropped: u64,
//     pub cFramesMissed: u64,
//     pub cRefreshNextDisplayed: u64,
//     pub cRefreshNextPresented: u64,
//     pub cRefreshesDisplayed: u64,
//     pub cRefreshesPresented: u64,
//     pub cRefreshStarted: u64,
//     pub cPixelsReceived: u64,
//     pub cPixelsDrawn: u64,
//     pub cBuffersEmpty: u64,
// }

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
// UNSUPPORTED Rust 220:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MilMatrix3x2D {
//     pub S_11: f64,
//     pub S_12: f64,
//     pub S_21: f64,
//     pub S_22: f64,
//     pub DX: f64,
//     pub DY: f64,
// }

// UNSUPPORTED Rust 230:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct UNSIGNED_RATIO {
//     pub uiNumerator: u32,
//     pub uiDenominator: u32,
// }

public const val `c_DwmMaxAdapters`: UInt = 16u;
public const val `c_DwmMaxMonitors`: UInt = 16u;
public const val `c_DwmMaxQueuedBuffers`: UInt = 8u;
