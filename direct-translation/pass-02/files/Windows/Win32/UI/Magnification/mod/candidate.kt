// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagGetColorEffect(hwnd : super::super::Foundation:: HWND, peffect : *mut MAGCOLOREFFECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagGetFullscreenColorEffect(peffect : *mut MAGCOLOREFFECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagGetFullscreenTransform(pmaglevel : *mut f32, pxoffset : *mut i32, pyoffset : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("magnification.dll" "system" fn MagGetImageScalingCallback(hwnd : super::super::Foundation:: HWND) -> MagImageScalingCallback);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagGetInputTransform(pfenabled : *mut windows_sys::core::BOOL, prectsource : *mut super::super::Foundation:: RECT, prectdest : *mut super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagGetWindowFilterList(hwnd : super::super::Foundation:: HWND, pdwfiltermode : *mut MW_FILTERMODE, count : i32, phwnd : *mut super::super::Foundation:: HWND) -> i32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagGetWindowSource(hwnd : super::super::Foundation:: HWND, prect : *mut super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagGetWindowTransform(hwnd : super::super::Foundation:: HWND, ptransform : *mut MAGTRANSFORM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagInitialize() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagSetColorEffect(hwnd : super::super::Foundation:: HWND, peffect : *mut MAGCOLOREFFECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagSetFullscreenColorEffect(peffect : *const MAGCOLOREFFECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagSetFullscreenTransform(maglevel : f32, xoffset : i32, yoffset : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("magnification.dll" "system" fn MagSetImageScalingCallback(hwnd : super::super::Foundation:: HWND, callback : MagImageScalingCallback) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagSetInputTransform(fenabled : windows_sys::core::BOOL, prectsource : *const super::super::Foundation:: RECT, prectdest : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagSetWindowFilterList(hwnd : super::super::Foundation:: HWND, dwfiltermode : MW_FILTERMODE, count : i32, phwnd : *mut super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagSetWindowSource(hwnd : super::super::Foundation:: HWND, rect : super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagSetWindowTransform(hwnd : super::super::Foundation:: HWND, ptransform : *mut MAGTRANSFORM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagShowSystemCursor(fshowcursor : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("magnification.dll" "system" fn MagUninitialize() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAGCOLOREFFECT {
//     pub transform: [f32; 25],
// }

// UNSUPPORTED Rust 27:1: declaration Impl has no candidate rule
// impl Default for MAGCOLOREFFECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 32:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MAGIMAGEHEADER {
//     pub width: u32,
//     pub height: u32,
//     pub format: windows_sys::core::GUID,
//     pub stride: u32,
//     pub offset: u32,
//     pub cbSize: usize,
// }

// UNSUPPORTED Rust 42:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAGTRANSFORM {
//     pub v: [f32; 9],
// }

// UNSUPPORTED Rust 47:1: declaration Impl has no candidate rule
// impl Default for MAGTRANSFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MS_CLIPAROUNDCURSOR`: Int = 2;
public const val `MS_INVERTCOLORS`: Int = 4;
public const val `MS_SHOWMAGNIFIEDCURSOR`: Int = 1;
public typealias `MW_FILTERMODE` = UInt;
public const val `MW_FILTERMODE_EXCLUDE`: `MW_FILTERMODE` = 0u;
public const val `MW_FILTERMODE_INCLUDE`: `MW_FILTERMODE` = 1u;
// UNSUPPORTED Rust 58:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type MagImageScalingCallback = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, srcdata: *mut core::ffi::c_void, srcheader: MAGIMAGEHEADER, destdata: *mut core::ffi::c_void, destheader: MAGIMAGEHEADER, unclipped: super::super::Foundation::RECT, clipped: super::super::Foundation::RECT, dirty: super::super::Graphics::Gdi::HRGN) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 60:1: non-scalar type Ptr unsupported
// pub const WC_MAGNIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("Magnifier");

// UNSUPPORTED Rust 61:1: non-scalar type Ptr unsupported
// pub const WC_MAGNIFIERA: windows_sys::core::PCSTR = windows_sys::core::s!("Magnifier");

// UNSUPPORTED Rust 62:1: non-scalar type Ptr unsupported
// pub const WC_MAGNIFIERW: windows_sys::core::PCWSTR = windows_sys::core::w!("Magnifier");

