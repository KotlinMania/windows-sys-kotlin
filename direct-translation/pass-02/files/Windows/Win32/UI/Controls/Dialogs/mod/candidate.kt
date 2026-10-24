// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn ChooseColorA(param0 : *mut CHOOSECOLORA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn ChooseColorW(param0 : *mut CHOOSECOLORW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("comdlg32.dll" "system" fn ChooseFontA(param0 : *mut CHOOSEFONTA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("comdlg32.dll" "system" fn ChooseFontW(param0 : *mut CHOOSEFONTW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn CommDlgExtendedError() -> COMMON_DLG_ERRORS);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn FindTextA(param0 : *mut FINDREPLACEA) -> super::super::super::Foundation:: HWND);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn FindTextW(param0 : *mut FINDREPLACEW) -> super::super::super::Foundation:: HWND);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn GetFileTitleA(param0 : windows_sys::core::PCSTR, buf : windows_sys::core::PSTR, cchsize : u16) -> i16);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn GetFileTitleW(param0 : windows_sys::core::PCWSTR, buf : windows_sys::core::PWSTR, cchsize : u16) -> i16);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn GetOpenFileNameA(param0 : *mut OPENFILENAMEA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn GetOpenFileNameW(param0 : *mut OPENFILENAMEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn GetSaveFileNameA(param0 : *mut OPENFILENAMEA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn GetSaveFileNameW(param0 : *mut OPENFILENAMEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn PageSetupDlgA(param0 : *mut PAGESETUPDLGA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn PageSetupDlgW(param0 : *mut PAGESETUPDLGW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("comdlg32.dll" "system" fn PrintDlgA(ppd : *mut PRINTDLGA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("comdlg32.dll" "system" fn PrintDlgExA(ppd : *mut PRINTDLGEXA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("comdlg32.dll" "system" fn PrintDlgExW(ppd : *mut PRINTDLGEXW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("comdlg32.dll" "system" fn PrintDlgW(ppd : *mut PRINTDLGW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn ReplaceTextA(param0 : *mut FINDREPLACEA) -> super::super::super::Foundation:: HWND);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("comdlg32.dll" "system" fn ReplaceTextW(param0 : *mut FINDREPLACEW) -> super::super::super::Foundation:: HWND);

public const val `BOLD_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 256u;
public const val `CCERR_CHOOSECOLORCODES`: `COMMON_DLG_ERRORS` = 20480u;
public const val `CC_ANYCOLOR`: `CHOOSECOLOR_FLAGS` = 256u;
public const val `CC_ENABLEHOOK`: `CHOOSECOLOR_FLAGS` = 16u;
public const val `CC_ENABLETEMPLATE`: `CHOOSECOLOR_FLAGS` = 32u;
public const val `CC_ENABLETEMPLATEHANDLE`: `CHOOSECOLOR_FLAGS` = 64u;
public const val `CC_FULLOPEN`: `CHOOSECOLOR_FLAGS` = 2u;
public const val `CC_PREVENTFULLOPEN`: `CHOOSECOLOR_FLAGS` = 4u;
public const val `CC_RGBINIT`: `CHOOSECOLOR_FLAGS` = 1u;
public const val `CC_SHOWHELP`: `CHOOSECOLOR_FLAGS` = 8u;
public const val `CC_SOLIDCOLOR`: `CHOOSECOLOR_FLAGS` = 128u;
public const val `CDERR_DIALOGFAILURE`: `COMMON_DLG_ERRORS` = 65535u;
public const val `CDERR_FINDRESFAILURE`: `COMMON_DLG_ERRORS` = 6u;
public const val `CDERR_GENERALCODES`: `COMMON_DLG_ERRORS` = 0u;
public const val `CDERR_INITIALIZATION`: `COMMON_DLG_ERRORS` = 2u;
public const val `CDERR_LOADRESFAILURE`: `COMMON_DLG_ERRORS` = 7u;
public const val `CDERR_LOADSTRFAILURE`: `COMMON_DLG_ERRORS` = 5u;
public const val `CDERR_LOCKRESFAILURE`: `COMMON_DLG_ERRORS` = 8u;
public const val `CDERR_MEMALLOCFAILURE`: `COMMON_DLG_ERRORS` = 9u;
public const val `CDERR_MEMLOCKFAILURE`: `COMMON_DLG_ERRORS` = 10u;
public const val `CDERR_NOHINSTANCE`: `COMMON_DLG_ERRORS` = 4u;
public const val `CDERR_NOHOOK`: `COMMON_DLG_ERRORS` = 11u;
public const val `CDERR_NOTEMPLATE`: `COMMON_DLG_ERRORS` = 3u;
public const val `CDERR_REGISTERMSGFAIL`: `COMMON_DLG_ERRORS` = 12u;
public const val `CDERR_STRUCTSIZE`: `COMMON_DLG_ERRORS` = 1u;
public const val `CDM_FIRST`: UInt = 1124u;
public const val `CDM_GETFILEPATH`: UInt = 1125u;
public const val `CDM_GETFOLDERIDLIST`: UInt = 1127u;
public const val `CDM_GETFOLDERPATH`: UInt = 1126u;
public const val `CDM_GETSPEC`: UInt = 1124u;
public const val `CDM_HIDECONTROL`: UInt = 1129u;
public const val `CDM_LAST`: UInt = 1224u;
public const val `CDM_SETCONTROLTEXT`: UInt = 1128u;
public const val `CDM_SETDEFEXT`: UInt = 1130u;
public const val `CDN_FILEOK`: UInt = 4294966690u;
public const val `CDN_FOLDERCHANGE`: UInt = 4294966693u;
public const val `CDN_HELP`: UInt = 4294966691u;
public const val `CDN_INCLUDEITEM`: UInt = 4294966688u;
public const val `CDN_INITDONE`: UInt = 4294966695u;
public const val `CDN_SELCHANGE`: UInt = 4294966694u;
public const val `CDN_SHAREVIOLATION`: UInt = 4294966692u;
public const val `CDN_TYPECHANGE`: UInt = 4294966689u;
public const val `CD_LBSELADD`: UInt = 2u;
public const val `CD_LBSELCHANGE`: UInt = 0u;
public const val `CD_LBSELNOITEMS`: Int = -1;
public const val `CD_LBSELSUB`: UInt = 1u;
public const val `CFERR_CHOOSEFONTCODES`: `COMMON_DLG_ERRORS` = 8192u;
public const val `CFERR_MAXLESSTHANMIN`: `COMMON_DLG_ERRORS` = 8194u;
public const val `CFERR_NOFONTS`: `COMMON_DLG_ERRORS` = 8193u;
public const val `CF_ANSIONLY`: `CHOOSEFONT_FLAGS` = 1024u;
public const val `CF_APPLY`: `CHOOSEFONT_FLAGS` = 512u;
public const val `CF_BOTH`: `CHOOSEFONT_FLAGS` = 3u;
public const val `CF_EFFECTS`: `CHOOSEFONT_FLAGS` = 256u;
public const val `CF_ENABLEHOOK`: `CHOOSEFONT_FLAGS` = 8u;
public const val `CF_ENABLETEMPLATE`: `CHOOSEFONT_FLAGS` = 16u;
public const val `CF_ENABLETEMPLATEHANDLE`: `CHOOSEFONT_FLAGS` = 32u;
public const val `CF_FIXEDPITCHONLY`: `CHOOSEFONT_FLAGS` = 16384u;
public const val `CF_FORCEFONTEXIST`: `CHOOSEFONT_FLAGS` = 65536u;
public const val `CF_INACTIVEFONTS`: `CHOOSEFONT_FLAGS` = 33554432u;
public const val `CF_INITTOLOGFONTSTRUCT`: `CHOOSEFONT_FLAGS` = 64u;
public const val `CF_LIMITSIZE`: `CHOOSEFONT_FLAGS` = 8192u;
public const val `CF_NOFACESEL`: `CHOOSEFONT_FLAGS` = 524288u;
public const val `CF_NOOEMFONTS`: `CHOOSEFONT_FLAGS` = 2048u;
public const val `CF_NOSCRIPTSEL`: `CHOOSEFONT_FLAGS` = 8388608u;
public const val `CF_NOSIMULATIONS`: `CHOOSEFONT_FLAGS` = 4096u;
public const val `CF_NOSIZESEL`: `CHOOSEFONT_FLAGS` = 2097152u;
public const val `CF_NOSTYLESEL`: `CHOOSEFONT_FLAGS` = 1048576u;
public const val `CF_NOVECTORFONTS`: `CHOOSEFONT_FLAGS` = 2048u;
public const val `CF_NOVERTFONTS`: `CHOOSEFONT_FLAGS` = 16777216u;
public const val `CF_PRINTERFONTS`: `CHOOSEFONT_FLAGS` = 2u;
public const val `CF_SCALABLEONLY`: `CHOOSEFONT_FLAGS` = 131072u;
public const val `CF_SCREENFONTS`: `CHOOSEFONT_FLAGS` = 1u;
public const val `CF_SCRIPTSONLY`: `CHOOSEFONT_FLAGS` = 1024u;
public const val `CF_SELECTSCRIPT`: `CHOOSEFONT_FLAGS` = 4194304u;
public const val `CF_SHOWHELP`: `CHOOSEFONT_FLAGS` = 4u;
public const val `CF_TTONLY`: `CHOOSEFONT_FLAGS` = 262144u;
public const val `CF_USESTYLE`: `CHOOSEFONT_FLAGS` = 128u;
public const val `CF_WYSIWYG`: `CHOOSEFONT_FLAGS` = 32768u;
// UNSUPPORTED Rust 106:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct CHOOSECOLORA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HWND,
//     pub rgbResult: super::super::super::Foundation::COLORREF,
//     pub lpCustColors: *mut super::super::super::Foundation::COLORREF,
//     pub Flags: CHOOSECOLOR_FLAGS,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCCHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 120:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for CHOOSECOLORA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct CHOOSECOLORA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HWND,
//     pub rgbResult: super::super::super::Foundation::COLORREF,
//     pub lpCustColors: *mut super::super::super::Foundation::COLORREF,
//     pub Flags: CHOOSECOLOR_FLAGS,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCCHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 140:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CHOOSECOLORA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 146:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct CHOOSECOLORW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HWND,
//     pub rgbResult: super::super::super::Foundation::COLORREF,
//     pub lpCustColors: *mut super::super::super::Foundation::COLORREF,
//     pub Flags: CHOOSECOLOR_FLAGS,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCCHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 160:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for CHOOSECOLORW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 166:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct CHOOSECOLORW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HWND,
//     pub rgbResult: super::super::super::Foundation::COLORREF,
//     pub lpCustColors: *mut super::super::super::Foundation::COLORREF,
//     pub Flags: CHOOSECOLOR_FLAGS,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCCHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 180:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CHOOSECOLORW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CHOOSECOLOR_FLAGS` = UInt;
// UNSUPPORTED Rust 187:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct CHOOSEFONTA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub lpLogFont: *mut super::super::super::Graphics::Gdi::LOGFONTA,
//     pub iPointSize: i32,
//     pub Flags: CHOOSEFONT_FLAGS,
//     pub rgbColors: super::super::super::Foundation::COLORREF,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCFHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpszStyle: windows_sys::core::PSTR,
//     pub nFontType: CHOOSEFONT_FONT_TYPE,
//     pub ___MISSING_ALIGNMENT__: u16,
//     pub nSizeMin: i32,
//     pub nSizeMax: i32,
// }

// UNSUPPORTED Rust 209:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CHOOSEFONTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct CHOOSEFONTA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub lpLogFont: *mut super::super::super::Graphics::Gdi::LOGFONTA,
//     pub iPointSize: i32,
//     pub Flags: CHOOSEFONT_FLAGS,
//     pub rgbColors: super::super::super::Foundation::COLORREF,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCFHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpszStyle: windows_sys::core::PSTR,
//     pub nFontType: CHOOSEFONT_FONT_TYPE,
//     pub ___MISSING_ALIGNMENT__: u16,
//     pub nSizeMin: i32,
//     pub nSizeMax: i32,
// }

// UNSUPPORTED Rust 238:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CHOOSEFONTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 245:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct CHOOSEFONTW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub lpLogFont: *mut super::super::super::Graphics::Gdi::LOGFONTW,
//     pub iPointSize: i32,
//     pub Flags: CHOOSEFONT_FLAGS,
//     pub rgbColors: super::super::super::Foundation::COLORREF,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCFHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpszStyle: windows_sys::core::PWSTR,
//     pub nFontType: CHOOSEFONT_FONT_TYPE,
//     pub ___MISSING_ALIGNMENT__: u16,
//     pub nSizeMin: i32,
//     pub nSizeMax: i32,
// }

// UNSUPPORTED Rust 267:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CHOOSEFONTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 274:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct CHOOSEFONTW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub lpLogFont: *mut super::super::super::Graphics::Gdi::LOGFONTW,
//     pub iPointSize: i32,
//     pub Flags: CHOOSEFONT_FLAGS,
//     pub rgbColors: super::super::super::Foundation::COLORREF,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPCFHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpszStyle: windows_sys::core::PWSTR,
//     pub nFontType: CHOOSEFONT_FONT_TYPE,
//     pub ___MISSING_ALIGNMENT__: u16,
//     pub nSizeMin: i32,
//     pub nSizeMax: i32,
// }

// UNSUPPORTED Rust 296:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CHOOSEFONTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CHOOSEFONT_FLAGS` = UInt;
public typealias `CHOOSEFONT_FONT_TYPE` = UShort;
// UNSUPPORTED Rust 305:1: non-scalar type Ptr unsupported
// pub const COLOROKSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_ColorOK");

// UNSUPPORTED Rust 306:1: non-scalar type Ptr unsupported
// pub const COLOROKSTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("commdlg_ColorOK");

// UNSUPPORTED Rust 307:1: non-scalar type Ptr unsupported
// pub const COLOROKSTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_ColorOK");

public const val `COLOR_ADD`: UInt = 712u;
public const val `COLOR_BLUE`: UInt = 708u;
public const val `COLOR_BLUEACCEL`: UInt = 728u;
public const val `COLOR_BOX1`: UInt = 720u;
public const val `COLOR_CURRENT`: UInt = 709u;
public const val `COLOR_CUSTOM1`: UInt = 721u;
public const val `COLOR_ELEMENT`: UInt = 716u;
public const val `COLOR_GREEN`: UInt = 707u;
public const val `COLOR_GREENACCEL`: UInt = 727u;
public const val `COLOR_HUE`: UInt = 703u;
public const val `COLOR_HUEACCEL`: UInt = 723u;
public const val `COLOR_HUESCROLL`: UInt = 700u;
public const val `COLOR_LUM`: UInt = 705u;
public const val `COLOR_LUMACCEL`: UInt = 725u;
public const val `COLOR_LUMSCROLL`: UInt = 702u;
public const val `COLOR_MIX`: UInt = 719u;
public const val `COLOR_PALETTE`: UInt = 718u;
public const val `COLOR_RAINBOW`: UInt = 710u;
public const val `COLOR_RED`: UInt = 706u;
public const val `COLOR_REDACCEL`: UInt = 726u;
public const val `COLOR_SAMPLES`: UInt = 717u;
public const val `COLOR_SAT`: UInt = 704u;
public const val `COLOR_SATACCEL`: UInt = 724u;
public const val `COLOR_SATSCROLL`: UInt = 701u;
public const val `COLOR_SAVE`: UInt = 711u;
public const val `COLOR_SCHEMES`: UInt = 715u;
public const val `COLOR_SOLID`: UInt = 713u;
public const val `COLOR_SOLID_LEFT`: UInt = 730u;
public const val `COLOR_SOLID_RIGHT`: UInt = 731u;
public const val `COLOR_TUNE`: UInt = 714u;
public typealias `COMMON_DLG_ERRORS` = UInt;
// UNSUPPORTED Rust 339:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct DEVNAMES {
//     pub wDriverOffset: u16,
//     pub wDeviceOffset: u16,
//     pub wOutputOffset: u16,
//     pub wDefault: u16,
// }

// UNSUPPORTED Rust 348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct DEVNAMES {
//     pub wDriverOffset: u16,
//     pub wDeviceOffset: u16,
//     pub wOutputOffset: u16,
//     pub wDefault: u16,
// }

public const val `DLG_COLOR`: UInt = 10u;
public const val `DN_DEFAULTPRN`: UInt = 1u;
// UNSUPPORTED Rust 359:1: non-scalar type Ptr unsupported
// pub const FILEOKSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_FileNameOK");

// UNSUPPORTED Rust 360:1: non-scalar type Ptr unsupported
// pub const FILEOKSTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("commdlg_FileNameOK");

// UNSUPPORTED Rust 361:1: non-scalar type Ptr unsupported
// pub const FILEOKSTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_FileNameOK");

// UNSUPPORTED Rust 362:1: non-scalar type Ptr unsupported
// pub const FINDMSGSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_FindReplace");

// UNSUPPORTED Rust 363:1: non-scalar type Ptr unsupported
// pub const FINDMSGSTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("commdlg_FindReplace");

// UNSUPPORTED Rust 364:1: non-scalar type Ptr unsupported
// pub const FINDMSGSTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_FindReplace");

// UNSUPPORTED Rust 365:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FINDREPLACEA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub Flags: FINDREPLACE_FLAGS,
//     pub lpstrFindWhat: windows_sys::core::PSTR,
//     pub lpstrReplaceWith: windows_sys::core::PSTR,
//     pub wFindWhatLen: u16,
//     pub wReplaceWithLen: u16,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPFRHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 381:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FINDREPLACEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 387:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FINDREPLACEA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub Flags: FINDREPLACE_FLAGS,
//     pub lpstrFindWhat: windows_sys::core::PSTR,
//     pub lpstrReplaceWith: windows_sys::core::PSTR,
//     pub wFindWhatLen: u16,
//     pub wReplaceWithLen: u16,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPFRHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 403:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FINDREPLACEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 409:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FINDREPLACEW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub Flags: FINDREPLACE_FLAGS,
//     pub lpstrFindWhat: windows_sys::core::PWSTR,
//     pub lpstrReplaceWith: windows_sys::core::PWSTR,
//     pub wFindWhatLen: u16,
//     pub wReplaceWithLen: u16,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPFRHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 425:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FINDREPLACEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 431:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FINDREPLACEW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub Flags: FINDREPLACE_FLAGS,
//     pub lpstrFindWhat: windows_sys::core::PWSTR,
//     pub lpstrReplaceWith: windows_sys::core::PWSTR,
//     pub wFindWhatLen: u16,
//     pub wReplaceWithLen: u16,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPFRHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 447:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FINDREPLACEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FINDREPLACE_FLAGS` = UInt;
public const val `FNERR_BUFFERTOOSMALL`: `COMMON_DLG_ERRORS` = 12291u;
public const val `FNERR_FILENAMECODES`: `COMMON_DLG_ERRORS` = 12288u;
public const val `FNERR_INVALIDFILENAME`: `COMMON_DLG_ERRORS` = 12290u;
public const val `FNERR_SUBCLASSFAILURE`: `COMMON_DLG_ERRORS` = 12289u;
public const val `FRERR_BUFFERLENGTHZERO`: `COMMON_DLG_ERRORS` = 16385u;
public const val `FRERR_FINDREPLACECODES`: `COMMON_DLG_ERRORS` = 16384u;
public const val `FRM_FIRST`: UInt = 1124u;
public const val `FRM_LAST`: UInt = 1224u;
public const val `FRM_SETOPERATIONRESULT`: UInt = 1124u;
public const val `FRM_SETOPERATIONRESULTTEXT`: UInt = 1125u;
public const val `FR_DIALOGTERM`: `FINDREPLACE_FLAGS` = 64u;
public const val `FR_DOWN`: `FINDREPLACE_FLAGS` = 1u;
public const val `FR_ENABLEHOOK`: `FINDREPLACE_FLAGS` = 256u;
public const val `FR_ENABLETEMPLATE`: `FINDREPLACE_FLAGS` = 512u;
public const val `FR_ENABLETEMPLATEHANDLE`: `FINDREPLACE_FLAGS` = 8192u;
public const val `FR_FINDNEXT`: `FINDREPLACE_FLAGS` = 8u;
public const val `FR_HIDEMATCHCASE`: `FINDREPLACE_FLAGS` = 32768u;
public const val `FR_HIDEUPDOWN`: `FINDREPLACE_FLAGS` = 16384u;
public const val `FR_HIDEWHOLEWORD`: `FINDREPLACE_FLAGS` = 65536u;
public const val `FR_MATCHALEFHAMZA`: `FINDREPLACE_FLAGS` = 2147483648u;
public const val `FR_MATCHCASE`: `FINDREPLACE_FLAGS` = 4u;
public const val `FR_MATCHDIAC`: `FINDREPLACE_FLAGS` = 536870912u;
public const val `FR_MATCHKASHIDA`: `FINDREPLACE_FLAGS` = 1073741824u;
public const val `FR_NOMATCHCASE`: `FINDREPLACE_FLAGS` = 2048u;
public const val `FR_NOUPDOWN`: `FINDREPLACE_FLAGS` = 1024u;
public const val `FR_NOWHOLEWORD`: `FINDREPLACE_FLAGS` = 4096u;
public const val `FR_NOWRAPAROUND`: `FINDREPLACE_FLAGS` = 524288u;
public const val `FR_RAW`: `FINDREPLACE_FLAGS` = 131072u;
public const val `FR_REPLACE`: `FINDREPLACE_FLAGS` = 16u;
public const val `FR_REPLACEALL`: `FINDREPLACE_FLAGS` = 32u;
public const val `FR_SHOWHELP`: `FINDREPLACE_FLAGS` = 128u;
public const val `FR_SHOWWRAPAROUND`: `FINDREPLACE_FLAGS` = 262144u;
public const val `FR_WHOLEWORD`: `FINDREPLACE_FLAGS` = 2u;
public const val `FR_WRAPAROUND`: `FINDREPLACE_FLAGS` = 1048576u;
// UNSUPPORTED Rust 488:1: non-scalar type Ptr unsupported
// pub const HELPMSGSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_help");

// UNSUPPORTED Rust 489:1: non-scalar type Ptr unsupported
// pub const HELPMSGSTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("commdlg_help");

// UNSUPPORTED Rust 490:1: non-scalar type Ptr unsupported
// pub const HELPMSGSTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_help");

public const val `ITALIC_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 512u;
// UNSUPPORTED Rust 492:1: non-scalar type Ptr unsupported
// pub const LBSELCHSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_LBSelChangedNotify");

// UNSUPPORTED Rust 493:1: non-scalar type Ptr unsupported
// pub const LBSELCHSTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("commdlg_LBSelChangedNotify");

// UNSUPPORTED Rust 494:1: non-scalar type Ptr unsupported
// pub const LBSELCHSTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_LBSelChangedNotify");

// UNSUPPORTED Rust 495:1: generic scalar type unsupported
// pub type LPCCHOOKPROC = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

// UNSUPPORTED Rust 496:1: generic scalar type unsupported
// pub type LPCFHOOKPROC = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

// UNSUPPORTED Rust 497:1: generic scalar type unsupported
// pub type LPFRHOOKPROC = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

// UNSUPPORTED Rust 498:1: generic scalar type unsupported
// pub type LPOFNHOOKPROC = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

// UNSUPPORTED Rust 499:1: generic scalar type unsupported
// pub type LPPAGEPAINTHOOK = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

// UNSUPPORTED Rust 500:1: generic scalar type unsupported
// pub type LPPAGESETUPHOOK = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

// UNSUPPORTED Rust 501:1: generic scalar type unsupported
// pub type LPPRINTHOOKPROC = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

// UNSUPPORTED Rust 502:1: generic scalar type unsupported
// pub type LPSETUPHOOKPROC = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HWND, param1: u32, param2: super::super::super::Foundation::WPARAM, param3: super::super::super::Foundation::LPARAM) -> usize>;

public const val `NUM_BASIC_COLORS`: UInt = 48u;
public const val `NUM_CUSTOM_COLORS`: UInt = 16u;
// UNSUPPORTED Rust 505:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYA {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEA,
//     pub pszFile: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 513:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OFNOTIFYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 519:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYA {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEA,
//     pub pszFile: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 527:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OFNOTIFYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 533:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYEXA {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEA,
//     pub psf: *mut core::ffi::c_void,
//     pub pidl: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 542:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OFNOTIFYEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 548:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYEXA {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEA,
//     pub psf: *mut core::ffi::c_void,
//     pub pidl: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 557:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OFNOTIFYEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 563:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYEXW {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEW,
//     pub psf: *mut core::ffi::c_void,
//     pub pidl: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 572:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OFNOTIFYEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYEXW {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEW,
//     pub psf: *mut core::ffi::c_void,
//     pub pidl: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 587:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OFNOTIFYEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 593:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYW {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEW,
//     pub pszFile: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 601:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OFNOTIFYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OFNOTIFYW {
//     pub hdr: super::NMHDR,
//     pub lpOFN: *mut OPENFILENAMEW,
//     pub pszFile: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 615:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OFNOTIFYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OFN_ALLOWMULTISELECT`: `OPEN_FILENAME_FLAGS` = 512u;
public const val `OFN_CREATEPROMPT`: `OPEN_FILENAME_FLAGS` = 8192u;
public const val `OFN_DONTADDTORECENT`: `OPEN_FILENAME_FLAGS` = 33554432u;
public const val `OFN_ENABLEHOOK`: `OPEN_FILENAME_FLAGS` = 32u;
public const val `OFN_ENABLEINCLUDENOTIFY`: `OPEN_FILENAME_FLAGS` = 4194304u;
public const val `OFN_ENABLESIZING`: `OPEN_FILENAME_FLAGS` = 8388608u;
public const val `OFN_ENABLETEMPLATE`: `OPEN_FILENAME_FLAGS` = 64u;
public const val `OFN_ENABLETEMPLATEHANDLE`: `OPEN_FILENAME_FLAGS` = 128u;
public const val `OFN_EXPLORER`: `OPEN_FILENAME_FLAGS` = 524288u;
public const val `OFN_EXTENSIONDIFFERENT`: `OPEN_FILENAME_FLAGS` = 1024u;
public const val `OFN_EX_NONE`: `OPEN_FILENAME_FLAGS_EX` = 0u;
public const val `OFN_EX_NOPLACESBAR`: `OPEN_FILENAME_FLAGS_EX` = 1u;
public const val `OFN_FILEMUSTEXIST`: `OPEN_FILENAME_FLAGS` = 4096u;
public const val `OFN_FORCESHOWHIDDEN`: `OPEN_FILENAME_FLAGS` = 268435456u;
public const val `OFN_HIDEREADONLY`: `OPEN_FILENAME_FLAGS` = 4u;
public const val `OFN_LONGNAMES`: `OPEN_FILENAME_FLAGS` = 2097152u;
public const val `OFN_NOCHANGEDIR`: `OPEN_FILENAME_FLAGS` = 8u;
public const val `OFN_NODEREFERENCELINKS`: `OPEN_FILENAME_FLAGS` = 1048576u;
public const val `OFN_NOLONGNAMES`: `OPEN_FILENAME_FLAGS` = 262144u;
public const val `OFN_NONETWORKBUTTON`: `OPEN_FILENAME_FLAGS` = 131072u;
public const val `OFN_NOREADONLYRETURN`: `OPEN_FILENAME_FLAGS` = 32768u;
public const val `OFN_NOTESTFILECREATE`: `OPEN_FILENAME_FLAGS` = 65536u;
public const val `OFN_NOVALIDATE`: `OPEN_FILENAME_FLAGS` = 256u;
public const val `OFN_OVERWRITEPROMPT`: `OPEN_FILENAME_FLAGS` = 2u;
public const val `OFN_PATHMUSTEXIST`: `OPEN_FILENAME_FLAGS` = 2048u;
public const val `OFN_READONLY`: `OPEN_FILENAME_FLAGS` = 1u;
public const val `OFN_SHAREAWARE`: `OPEN_FILENAME_FLAGS` = 16384u;
public const val `OFN_SHAREFALLTHROUGH`: UInt = 2u;
public const val `OFN_SHARENOWARN`: UInt = 1u;
public const val `OFN_SHAREWARN`: UInt = 0u;
public const val `OFN_SHOWHELP`: `OPEN_FILENAME_FLAGS` = 16u;
// UNSUPPORTED Rust 652:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAMEA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCSTR,
//     pub lpstrCustomFilter: windows_sys::core::PSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCSTR,
//     pub lpstrTitle: windows_sys::core::PCSTR,
//     pub Flags: OPEN_FILENAME_FLAGS,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
//     pub pvReserved: *mut core::ffi::c_void,
//     pub dwReserved: u32,
//     pub FlagsEx: OPEN_FILENAME_FLAGS_EX,
// }

// UNSUPPORTED Rust 680:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OPENFILENAMEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 686:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAMEA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCSTR,
//     pub lpstrCustomFilter: windows_sys::core::PSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCSTR,
//     pub lpstrTitle: windows_sys::core::PCSTR,
//     pub Flags: OPEN_FILENAME_FLAGS,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
//     pub pvReserved: *mut core::ffi::c_void,
//     pub dwReserved: u32,
//     pub FlagsEx: OPEN_FILENAME_FLAGS_EX,
// }

// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OPENFILENAMEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 720:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAMEW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCWSTR,
//     pub lpstrCustomFilter: windows_sys::core::PWSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PWSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PWSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCWSTR,
//     pub lpstrTitle: windows_sys::core::PCWSTR,
//     pub Flags: OPEN_FILENAME_FLAGS,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCWSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
//     pub pvReserved: *mut core::ffi::c_void,
//     pub dwReserved: u32,
//     pub FlagsEx: OPEN_FILENAME_FLAGS_EX,
// }

// UNSUPPORTED Rust 748:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OPENFILENAMEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 754:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAMEW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCWSTR,
//     pub lpstrCustomFilter: windows_sys::core::PWSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PWSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PWSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCWSTR,
//     pub lpstrTitle: windows_sys::core::PCWSTR,
//     pub Flags: OPEN_FILENAME_FLAGS,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCWSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
//     pub pvReserved: *mut core::ffi::c_void,
//     pub dwReserved: u32,
//     pub FlagsEx: OPEN_FILENAME_FLAGS_EX,
// }

// UNSUPPORTED Rust 782:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OPENFILENAMEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 788:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAME_NT4A {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCSTR,
//     pub lpstrCustomFilter: windows_sys::core::PSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCSTR,
//     pub lpstrTitle: windows_sys::core::PCSTR,
//     pub Flags: u32,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 813:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OPENFILENAME_NT4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 819:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAME_NT4A {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCSTR,
//     pub lpstrCustomFilter: windows_sys::core::PSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCSTR,
//     pub lpstrTitle: windows_sys::core::PCSTR,
//     pub Flags: u32,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 844:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OPENFILENAME_NT4A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 850:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAME_NT4W {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCWSTR,
//     pub lpstrCustomFilter: windows_sys::core::PWSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PWSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PWSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCWSTR,
//     pub lpstrTitle: windows_sys::core::PCWSTR,
//     pub Flags: u32,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCWSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 875:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for OPENFILENAME_NT4W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct OPENFILENAME_NT4W {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpstrFilter: windows_sys::core::PCWSTR,
//     pub lpstrCustomFilter: windows_sys::core::PWSTR,
//     pub nMaxCustFilter: u32,
//     pub nFilterIndex: u32,
//     pub lpstrFile: windows_sys::core::PWSTR,
//     pub nMaxFile: u32,
//     pub lpstrFileTitle: windows_sys::core::PWSTR,
//     pub nMaxFileTitle: u32,
//     pub lpstrInitialDir: windows_sys::core::PCWSTR,
//     pub lpstrTitle: windows_sys::core::PCWSTR,
//     pub Flags: u32,
//     pub nFileOffset: u16,
//     pub nFileExtension: u16,
//     pub lpstrDefExt: windows_sys::core::PCWSTR,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnHook: LPOFNHOOKPROC,
//     pub lpTemplateName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 906:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for OPENFILENAME_NT4W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OPEN_FILENAME_FLAGS` = UInt;
public typealias `OPEN_FILENAME_FLAGS_EX` = UInt;
// UNSUPPORTED Rust 914:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct PAGESETUPDLGA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub Flags: PAGESETUPDLG_FLAGS,
//     pub ptPaperSize: super::super::super::Foundation::POINT,
//     pub rtMinMargin: super::super::super::Foundation::RECT,
//     pub rtMargin: super::super::super::Foundation::RECT,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPageSetupHook: LPPAGESETUPHOOK,
//     pub lpfnPagePaintHook: LPPAGEPAINTHOOK,
//     pub lpPageSetupTemplateName: windows_sys::core::PCSTR,
//     pub hPageSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 933:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for PAGESETUPDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 939:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct PAGESETUPDLGA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub Flags: PAGESETUPDLG_FLAGS,
//     pub ptPaperSize: super::super::super::Foundation::POINT,
//     pub rtMinMargin: super::super::super::Foundation::RECT,
//     pub rtMargin: super::super::super::Foundation::RECT,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPageSetupHook: LPPAGESETUPHOOK,
//     pub lpfnPagePaintHook: LPPAGEPAINTHOOK,
//     pub lpPageSetupTemplateName: windows_sys::core::PCSTR,
//     pub hPageSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 958:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for PAGESETUPDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 964:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct PAGESETUPDLGW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub Flags: PAGESETUPDLG_FLAGS,
//     pub ptPaperSize: super::super::super::Foundation::POINT,
//     pub rtMinMargin: super::super::super::Foundation::RECT,
//     pub rtMargin: super::super::super::Foundation::RECT,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPageSetupHook: LPPAGESETUPHOOK,
//     pub lpfnPagePaintHook: LPPAGEPAINTHOOK,
//     pub lpPageSetupTemplateName: windows_sys::core::PCWSTR,
//     pub hPageSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 983:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for PAGESETUPDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 989:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct PAGESETUPDLGW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub Flags: PAGESETUPDLG_FLAGS,
//     pub ptPaperSize: super::super::super::Foundation::POINT,
//     pub rtMinMargin: super::super::super::Foundation::RECT,
//     pub rtMargin: super::super::super::Foundation::RECT,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPageSetupHook: LPPAGESETUPHOOK,
//     pub lpfnPagePaintHook: LPPAGEPAINTHOOK,
//     pub lpPageSetupTemplateName: windows_sys::core::PCWSTR,
//     pub hPageSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 1008:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for PAGESETUPDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PAGESETUPDLG_FLAGS` = UInt;
public const val `PDERR_CREATEICFAILURE`: `COMMON_DLG_ERRORS` = 4106u;
public const val `PDERR_DEFAULTDIFFERENT`: `COMMON_DLG_ERRORS` = 4108u;
public const val `PDERR_DNDMMISMATCH`: `COMMON_DLG_ERRORS` = 4105u;
public const val `PDERR_GETDEVMODEFAIL`: `COMMON_DLG_ERRORS` = 4101u;
public const val `PDERR_INITFAILURE`: `COMMON_DLG_ERRORS` = 4102u;
public const val `PDERR_LOADDRVFAILURE`: `COMMON_DLG_ERRORS` = 4100u;
public const val `PDERR_NODEFAULTPRN`: `COMMON_DLG_ERRORS` = 4104u;
public const val `PDERR_NODEVICES`: `COMMON_DLG_ERRORS` = 4103u;
public const val `PDERR_PARSEFAILURE`: `COMMON_DLG_ERRORS` = 4098u;
public const val `PDERR_PRINTERCODES`: `COMMON_DLG_ERRORS` = 4096u;
public const val `PDERR_PRINTERNOTFOUND`: `COMMON_DLG_ERRORS` = 4107u;
public const val `PDERR_RETDEFFAILURE`: `COMMON_DLG_ERRORS` = 4099u;
public const val `PDERR_SETUPFAILURE`: `COMMON_DLG_ERRORS` = 4097u;
public const val `PD_ALLPAGES`: `PRINTDLGEX_FLAGS` = 0u;
public const val `PD_COLLATE`: `PRINTDLGEX_FLAGS` = 16u;
public const val `PD_CURRENTPAGE`: `PRINTDLGEX_FLAGS` = 4194304u;
public const val `PD_DISABLEPRINTTOFILE`: `PRINTDLGEX_FLAGS` = 524288u;
public const val `PD_ENABLEPRINTHOOK`: `PRINTDLGEX_FLAGS` = 4096u;
public const val `PD_ENABLEPRINTTEMPLATE`: `PRINTDLGEX_FLAGS` = 16384u;
public const val `PD_ENABLEPRINTTEMPLATEHANDLE`: `PRINTDLGEX_FLAGS` = 65536u;
public const val `PD_ENABLESETUPHOOK`: `PRINTDLGEX_FLAGS` = 8192u;
public const val `PD_ENABLESETUPTEMPLATE`: `PRINTDLGEX_FLAGS` = 32768u;
public const val `PD_ENABLESETUPTEMPLATEHANDLE`: `PRINTDLGEX_FLAGS` = 131072u;
public const val `PD_EXCLUSIONFLAGS`: `PRINTDLGEX_FLAGS` = 16777216u;
public const val `PD_HIDEPRINTTOFILE`: `PRINTDLGEX_FLAGS` = 1048576u;
public const val `PD_NOCURRENTPAGE`: `PRINTDLGEX_FLAGS` = 8388608u;
public const val `PD_NONETWORKBUTTON`: `PRINTDLGEX_FLAGS` = 2097152u;
public const val `PD_NOPAGENUMS`: `PRINTDLGEX_FLAGS` = 8u;
public const val `PD_NOSELECTION`: `PRINTDLGEX_FLAGS` = 4u;
public const val `PD_NOWARNING`: `PRINTDLGEX_FLAGS` = 128u;
public const val `PD_PAGENUMS`: `PRINTDLGEX_FLAGS` = 2u;
public const val `PD_PRINTSETUP`: `PRINTDLGEX_FLAGS` = 64u;
public const val `PD_PRINTTOFILE`: `PRINTDLGEX_FLAGS` = 32u;
public const val `PD_RESULT_APPLY`: UInt = 2u;
public const val `PD_RESULT_CANCEL`: UInt = 0u;
public const val `PD_RESULT_PRINT`: UInt = 1u;
public const val `PD_RETURNDC`: `PRINTDLGEX_FLAGS` = 256u;
public const val `PD_RETURNDEFAULT`: `PRINTDLGEX_FLAGS` = 1024u;
public const val `PD_RETURNIC`: `PRINTDLGEX_FLAGS` = 512u;
public const val `PD_SELECTION`: `PRINTDLGEX_FLAGS` = 1u;
public const val `PD_SHOWHELP`: `PRINTDLGEX_FLAGS` = 2048u;
public const val `PD_USEDEVMODECOPIES`: `PRINTDLGEX_FLAGS` = 262144u;
public const val `PD_USEDEVMODECOPIESANDCOLLATE`: `PRINTDLGEX_FLAGS` = 262144u;
public const val `PD_USELARGETEMPLATE`: `PRINTDLGEX_FLAGS` = 268435456u;
// UNSUPPORTED Rust 1059:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub nFromPage: u16,
//     pub nToPage: u16,
//     pub nMinPage: u16,
//     pub nMaxPage: u16,
//     pub nCopies: u16,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPrintHook: LPPRINTHOOKPROC,
//     pub lpfnSetupHook: LPSETUPHOOKPROC,
//     pub lpPrintTemplateName: windows_sys::core::PCSTR,
//     pub lpSetupTemplateName: windows_sys::core::PCSTR,
//     pub hPrintTemplate: super::super::super::Foundation::HGLOBAL,
//     pub hSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 1084:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub nFromPage: u16,
//     pub nToPage: u16,
//     pub nMinPage: u16,
//     pub nMaxPage: u16,
//     pub nCopies: u16,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPrintHook: LPPRINTHOOKPROC,
//     pub lpfnSetupHook: LPSETUPHOOKPROC,
//     pub lpPrintTemplateName: windows_sys::core::PCSTR,
//     pub lpSetupTemplateName: windows_sys::core::PCSTR,
//     pub hPrintTemplate: super::super::super::Foundation::HGLOBAL,
//     pub hSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 1116:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1123:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGEXA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub Flags2: u32,
//     pub ExclusionFlags: u32,
//     pub nPageRanges: u32,
//     pub nMaxPageRanges: u32,
//     pub lpPageRanges: *mut PRINTPAGERANGE,
//     pub nMinPage: u32,
//     pub nMaxPage: u32,
//     pub nCopies: u32,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpPrintTemplateName: windows_sys::core::PCSTR,
//     pub lpCallback: *mut core::ffi::c_void,
//     pub nPropertyPages: u32,
//     pub lphPropertyPages: *mut super::HPROPSHEETPAGE,
//     pub nStartPage: u32,
//     pub dwResultAction: u32,
// }

// UNSUPPORTED Rust 1150:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1157:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGEXA {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub Flags2: u32,
//     pub ExclusionFlags: u32,
//     pub nPageRanges: u32,
//     pub nMaxPageRanges: u32,
//     pub lpPageRanges: *mut PRINTPAGERANGE,
//     pub nMinPage: u32,
//     pub nMaxPage: u32,
//     pub nCopies: u32,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpPrintTemplateName: windows_sys::core::PCSTR,
//     pub lpCallback: *mut core::ffi::c_void,
//     pub nPropertyPages: u32,
//     pub lphPropertyPages: *mut super::HPROPSHEETPAGE,
//     pub nStartPage: u32,
//     pub dwResultAction: u32,
// }

// UNSUPPORTED Rust 1184:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1191:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGEXW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub Flags2: u32,
//     pub ExclusionFlags: u32,
//     pub nPageRanges: u32,
//     pub nMaxPageRanges: u32,
//     pub lpPageRanges: *mut PRINTPAGERANGE,
//     pub nMinPage: u32,
//     pub nMaxPage: u32,
//     pub nCopies: u32,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpPrintTemplateName: windows_sys::core::PCWSTR,
//     pub lpCallback: *mut core::ffi::c_void,
//     pub nPropertyPages: u32,
//     pub lphPropertyPages: *mut super::HPROPSHEETPAGE,
//     pub nStartPage: u32,
//     pub dwResultAction: u32,
// }

// UNSUPPORTED Rust 1218:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGEXW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub Flags2: u32,
//     pub ExclusionFlags: u32,
//     pub nPageRanges: u32,
//     pub nMaxPageRanges: u32,
//     pub lpPageRanges: *mut PRINTPAGERANGE,
//     pub nMinPage: u32,
//     pub nMaxPage: u32,
//     pub nCopies: u32,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lpPrintTemplateName: windows_sys::core::PCWSTR,
//     pub lpCallback: *mut core::ffi::c_void,
//     pub nPropertyPages: u32,
//     pub lphPropertyPages: *mut super::HPROPSHEETPAGE,
//     pub nStartPage: u32,
//     pub dwResultAction: u32,
// }

// UNSUPPORTED Rust 1252:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PRINTDLGEX_FLAGS` = UInt;
// UNSUPPORTED Rust 1260:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub nFromPage: u16,
//     pub nToPage: u16,
//     pub nMinPage: u16,
//     pub nMaxPage: u16,
//     pub nCopies: u16,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPrintHook: LPPRINTHOOKPROC,
//     pub lpfnSetupHook: LPSETUPHOOKPROC,
//     pub lpPrintTemplateName: windows_sys::core::PCWSTR,
//     pub lpSetupTemplateName: windows_sys::core::PCWSTR,
//     pub hPrintTemplate: super::super::super::Foundation::HGLOBAL,
//     pub hSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 1285:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PRINTDLGW {
//     pub lStructSize: u32,
//     pub hwndOwner: super::super::super::Foundation::HWND,
//     pub hDevMode: super::super::super::Foundation::HGLOBAL,
//     pub hDevNames: super::super::super::Foundation::HGLOBAL,
//     pub hDC: super::super::super::Graphics::Gdi::HDC,
//     pub Flags: PRINTDLGEX_FLAGS,
//     pub nFromPage: u16,
//     pub nToPage: u16,
//     pub nMinPage: u16,
//     pub nMaxPage: u16,
//     pub nCopies: u16,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub lpfnPrintHook: LPPRINTHOOKPROC,
//     pub lpfnSetupHook: LPSETUPHOOKPROC,
//     pub lpPrintTemplateName: windows_sys::core::PCWSTR,
//     pub lpSetupTemplateName: windows_sys::core::PCWSTR,
//     pub hPrintTemplate: super::super::super::Foundation::HGLOBAL,
//     pub hSetupTemplate: super::super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 1317:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PRINTDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PRINTER_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 16384u;
// UNSUPPORTED Rust 1325:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTPAGERANGE {
//     pub nFromPage: u32,
//     pub nToPage: u32,
// }

// UNSUPPORTED Rust 1332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct PRINTPAGERANGE {
//     pub nFromPage: u32,
//     pub nToPage: u32,
// }

public const val `PSD_DEFAULTMINMARGINS`: `PAGESETUPDLG_FLAGS` = 0u;
public const val `PSD_DISABLEMARGINS`: `PAGESETUPDLG_FLAGS` = 16u;
public const val `PSD_DISABLEORIENTATION`: `PAGESETUPDLG_FLAGS` = 256u;
public const val `PSD_DISABLEPAGEPAINTING`: `PAGESETUPDLG_FLAGS` = 524288u;
public const val `PSD_DISABLEPAPER`: `PAGESETUPDLG_FLAGS` = 512u;
public const val `PSD_DISABLEPRINTER`: `PAGESETUPDLG_FLAGS` = 32u;
public const val `PSD_ENABLEPAGEPAINTHOOK`: `PAGESETUPDLG_FLAGS` = 262144u;
public const val `PSD_ENABLEPAGESETUPHOOK`: `PAGESETUPDLG_FLAGS` = 8192u;
public const val `PSD_ENABLEPAGESETUPTEMPLATE`: `PAGESETUPDLG_FLAGS` = 32768u;
public const val `PSD_ENABLEPAGESETUPTEMPLATEHANDLE`: `PAGESETUPDLG_FLAGS` = 131072u;
public const val `PSD_INHUNDREDTHSOFMILLIMETERS`: `PAGESETUPDLG_FLAGS` = 8u;
public const val `PSD_INTHOUSANDTHSOFINCHES`: `PAGESETUPDLG_FLAGS` = 4u;
public const val `PSD_INWININIINTLMEASURE`: `PAGESETUPDLG_FLAGS` = 0u;
public const val `PSD_MARGINS`: `PAGESETUPDLG_FLAGS` = 2u;
public const val `PSD_MINMARGINS`: `PAGESETUPDLG_FLAGS` = 1u;
public const val `PSD_NONETWORKBUTTON`: `PAGESETUPDLG_FLAGS` = 2097152u;
public const val `PSD_NOWARNING`: `PAGESETUPDLG_FLAGS` = 128u;
public const val `PSD_RETURNDEFAULT`: `PAGESETUPDLG_FLAGS` = 1024u;
public const val `PSD_SHOWHELP`: `PAGESETUPDLG_FLAGS` = 2048u;
public const val `PS_OPENTYPE_FONTTYPE`: UInt = 65536u;
public const val `REGULAR_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 1024u;
public const val `SCREEN_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 8192u;
// UNSUPPORTED Rust 1361:1: non-scalar type Ptr unsupported
// pub const SETRGBSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_SetRGBColor");

// UNSUPPORTED Rust 1362:1: non-scalar type Ptr unsupported
// pub const SETRGBSTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("commdlg_SetRGBColor");

// UNSUPPORTED Rust 1363:1: non-scalar type Ptr unsupported
// pub const SETRGBSTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_SetRGBColor");

// UNSUPPORTED Rust 1364:1: non-scalar type Ptr unsupported
// pub const SHAREVISTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_ShareViolation");

// UNSUPPORTED Rust 1365:1: non-scalar type Ptr unsupported
// pub const SHAREVISTRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("commdlg_ShareViolation");

// UNSUPPORTED Rust 1366:1: non-scalar type Ptr unsupported
// pub const SHAREVISTRINGW: windows_sys::core::PCWSTR = windows_sys::core::w!("commdlg_ShareViolation");

public const val `SIMULATED_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 32768u;
public const val `START_PAGE_GENERAL`: UInt = 4294967295u;
public const val `SYMBOL_FONTTYPE`: UInt = 524288u;
public const val `TT_OPENTYPE_FONTTYPE`: UInt = 131072u;
public const val `TYPE1_FONTTYPE`: UInt = 262144u;
public const val `WM_CHOOSEFONT_GETLOGFONT`: UInt = 1025u;
public const val `WM_CHOOSEFONT_SETFLAGS`: UInt = 1126u;
public const val `WM_CHOOSEFONT_SETLOGFONT`: UInt = 1125u;
public const val `WM_PSD_ENVSTAMPRECT`: UInt = 1029u;
public const val `WM_PSD_FULLPAGERECT`: UInt = 1025u;
public const val `WM_PSD_GREEKTEXTRECT`: UInt = 1028u;
public const val `WM_PSD_MARGINRECT`: UInt = 1027u;
public const val `WM_PSD_MINMARGINRECT`: UInt = 1026u;
public const val `WM_PSD_YAFULLPAGERECT`: UInt = 1030u;
