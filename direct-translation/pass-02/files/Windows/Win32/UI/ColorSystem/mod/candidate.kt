// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn AssociateColorProfileWithDeviceA(pmachinename : windows_sys::core::PCSTR, pprofilename : windows_sys::core::PCSTR, pdevicename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn AssociateColorProfileWithDeviceW(pmachinename : windows_sys::core::PCWSTR, pprofilename : windows_sys::core::PCWSTR, pdevicename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMCheckColors(hcmtransform : isize, lpainputcolors : *const COLOR, ncolors : u32, ctinput : COLORTYPE, lparesult : *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("icm32.dll" "system" fn CMCheckColorsInGamut(hcmtransform : isize, lpargbtriple : *const super::super::Graphics::Gdi:: RGBTRIPLE, lparesult : *mut u8, ncount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMCheckRGBs(hcmtransform : isize, lpsrcbits : *const core::ffi::c_void, bminput : BMFORMAT, dwwidth : u32, dwheight : u32, dwstride : u32, lparesult : *mut u8, pfncallback : LPBMCALLBACKFN, ulcallbackdata : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMConvertColorNameToIndex(hprofile : isize, pacolorname : *const *const i8, paindex : *mut u32, dwcount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMConvertIndexToColorName(hprofile : isize, paindex : *const u32, pacolorname : *mut *mut i8, dwcount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMCreateDeviceLinkProfile(pahprofiles : *const isize, nprofiles : u32, padwintents : *const u32, nintents : u32, dwflags : u32, lpprofiledata : *mut *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMCreateMultiProfileTransform(pahprofiles : *const isize, nprofiles : u32, padwintents : *const u32, nintents : u32, dwflags : u32) -> isize);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("icm32.dll" "system" fn CMCreateProfile(lpcolorspace : *mut LOGCOLORSPACEA, lpprofiledata : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("icm32.dll" "system" fn CMCreateProfileW(lpcolorspace : *mut LOGCOLORSPACEW, lpprofiledata : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("icm32.dll" "system" fn CMCreateTransform(lpcolorspace : *const LOGCOLORSPACEA, lpdevcharacter : *const core::ffi::c_void, lptargetdevcharacter : *const core::ffi::c_void) -> isize);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("icm32.dll" "system" fn CMCreateTransformExt(lpcolorspace : *const LOGCOLORSPACEA, lpdevcharacter : *const core::ffi::c_void, lptargetdevcharacter : *const core::ffi::c_void, dwflags : u32) -> isize);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("icm32.dll" "system" fn CMCreateTransformExtW(lpcolorspace : *const LOGCOLORSPACEW, lpdevcharacter : *const core::ffi::c_void, lptargetdevcharacter : *const core::ffi::c_void, dwflags : u32) -> isize);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("icm32.dll" "system" fn CMCreateTransformW(lpcolorspace : *const LOGCOLORSPACEW, lpdevcharacter : *const core::ffi::c_void, lptargetdevcharacter : *const core::ffi::c_void) -> isize);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMDeleteTransform(hcmtransform : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMGetInfo(dwinfo : u32) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMGetNamedProfileInfo(hprofile : isize, pnamedprofileinfo : *mut NAMED_PROFILE_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMIsProfileValid(hprofile : isize, lpbvalid : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMTranslateColors(hcmtransform : isize, lpainputcolors : *const COLOR, ncolors : u32, ctinput : COLORTYPE, lpaoutputcolors : *mut COLOR, ctoutput : COLORTYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMTranslateRGB(hcmtransform : isize, colorref : super::super::Foundation:: COLORREF, lpcolorref : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMTranslateRGBs(hcmtransform : isize, lpsrcbits : *const core::ffi::c_void, bminput : BMFORMAT, dwwidth : u32, dwheight : u32, dwstride : u32, lpdestbits : *mut core::ffi::c_void, bmoutput : BMFORMAT, dwtranslatedirection : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("icm32.dll" "system" fn CMTranslateRGBsExt(hcmtransform : isize, lpsrcbits : *const core::ffi::c_void, bminput : BMFORMAT, dwwidth : u32, dwheight : u32, dwinputstride : u32, lpdestbits : *mut core::ffi::c_void, bmoutput : BMFORMAT, dwoutputstride : u32, lpfncallback : LPBMCALLBACKFN, ulcallbackdata : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn CheckBitmapBits(hcolortransform : isize, psrcbits : *const core::ffi::c_void, bminput : BMFORMAT, dwwidth : u32, dwheight : u32, dwstride : u32, paresult : *mut u8, pfncallback : LPBMCALLBACKFN, lpcallbackdata : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn CheckColors(hcolortransform : isize, painputcolors : *const COLOR, ncolors : u32, ctinput : COLORTYPE, paresult : *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn CheckColorsInGamut(hdc : super::super::Graphics::Gdi:: HDC, lprgbtriple : *const super::super::Graphics::Gdi:: RGBTRIPLE, dlpbuffer : *mut core::ffi::c_void, ncount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn CloseColorProfile(hprofile : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn ColorCorrectPalette(hdc : super::super::Graphics::Gdi:: HDC, hpal : super::super::Graphics::Gdi:: HPALETTE, defirst : u32, num : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn ColorMatchToTarget(hdc : super::super::Graphics::Gdi:: HDC, hdctarget : super::super::Graphics::Gdi:: HDC, action : COLOR_MATCH_TO_TARGET_ACTION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ColorProfileAddDisplayAssociation(scope : WCS_PROFILE_MANAGEMENT_SCOPE, profilename : windows_sys::core::PCWSTR, targetadapterid : super::super::Foundation:: LUID, sourceid : u32, setasdefault : windows_sys::core::BOOL, associateasadvancedcolor : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ColorProfileGetDisplayDefault(scope : WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid : super::super::Foundation:: LUID, sourceid : u32, profiletype : COLORPROFILETYPE, profilesubtype : COLORPROFILESUBTYPE, profilename : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ColorProfileGetDisplayList(scope : WCS_PROFILE_MANAGEMENT_SCOPE, targetadapterid : super::super::Foundation:: LUID, sourceid : u32, profilelist : *mut *mut windows_sys::core::PWSTR, profilecount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ColorProfileGetDisplayUserScope(targetadapterid : super::super::Foundation:: LUID, sourceid : u32, scope : *mut WCS_PROFILE_MANAGEMENT_SCOPE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ColorProfileRemoveDisplayAssociation(scope : WCS_PROFILE_MANAGEMENT_SCOPE, profilename : windows_sys::core::PCWSTR, targetadapterid : super::super::Foundation:: LUID, sourceid : u32, dissociateadvancedcolor : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ColorProfileSetDisplayDefaultAssociation(scope : WCS_PROFILE_MANAGEMENT_SCOPE, profilename : windows_sys::core::PCWSTR, profiletype : COLORPROFILETYPE, profilesubtype : COLORPROFILESUBTYPE, targetadapterid : super::super::Foundation:: LUID, sourceid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ConvertColorNameToIndex(hprofile : isize, pacolorname : *const *const i8, paindex : *mut u32, dwcount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn ConvertIndexToColorName(hprofile : isize, paindex : *const u32, pacolorname : *mut *mut i8, dwcount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn CreateColorSpaceA(lplcs : *const LOGCOLORSPACEA) -> HCOLORSPACE);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn CreateColorSpaceW(lplcs : *const LOGCOLORSPACEW) -> HCOLORSPACE);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("mscms.dll" "system" fn CreateColorTransformA(plogcolorspace : *const LOGCOLORSPACEA, hdestprofile : isize, htargetprofile : isize, dwflags : u32) -> isize);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("mscms.dll" "system" fn CreateColorTransformW(plogcolorspace : *const LOGCOLORSPACEW, hdestprofile : isize, htargetprofile : isize, dwflags : u32) -> isize);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn CreateDeviceLinkProfile(hprofile : *const isize, nprofiles : u32, padwintent : *const u32, nintents : u32, dwflags : u32, pprofiledata : *mut *mut u8, indexpreferredcmm : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn CreateMultiProfileTransform(pahprofiles : *const isize, nprofiles : u32, padwintent : *const u32, nintents : u32, dwflags : u32, indexpreferredcmm : u32) -> isize);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("mscms.dll" "system" fn CreateProfileFromLogColorSpaceA(plogcolorspace : *const LOGCOLORSPACEA, pprofile : *mut *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("mscms.dll" "system" fn CreateProfileFromLogColorSpaceW(plogcolorspace : *const LOGCOLORSPACEW, pprofile : *mut *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn DeleteColorSpace(hcs : HCOLORSPACE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn DeleteColorTransform(hxform : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn DisassociateColorProfileFromDeviceA(pmachinename : windows_sys::core::PCSTR, pprofilename : windows_sys::core::PCSTR, pdevicename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn DisassociateColorProfileFromDeviceW(pmachinename : windows_sys::core::PCWSTR, pprofilename : windows_sys::core::PCWSTR, pdevicename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn EnumColorProfilesA(pmachinename : windows_sys::core::PCSTR, penumrecord : *const ENUMTYPEA, penumerationbuffer : *mut u8, pdwsizeofenumerationbuffer : *mut u32, pnprofiles : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn EnumColorProfilesW(pmachinename : windows_sys::core::PCWSTR, penumrecord : *const ENUMTYPEW, penumerationbuffer : *mut u8, pdwsizeofenumerationbuffer : *mut u32, pnprofiles : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EnumICMProfilesA(hdc : super::super::Graphics::Gdi:: HDC, proc : ICMENUMPROCA, param2 : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EnumICMProfilesW(hdc : super::super::Graphics::Gdi:: HDC, proc : ICMENUMPROCW, param2 : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetCMMInfo(hcolortransform : isize, param1 : u32) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetColorDirectoryA(pmachinename : windows_sys::core::PCSTR, pbuffer : windows_sys::core::PSTR, pdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetColorDirectoryW(pmachinename : windows_sys::core::PCWSTR, pbuffer : windows_sys::core::PWSTR, pdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetColorProfileElement(hprofile : isize, tag : u32, dwoffset : u32, pcbelement : *mut u32, pelement : *mut core::ffi::c_void, pbreference : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetColorProfileElementTag(hprofile : isize, dwindex : u32, ptag : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetColorProfileFromHandle(hprofile : isize, pprofile : *mut u8, pcbprofile : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("mscms.dll" "system" fn GetColorProfileHeader(hprofile : isize, pheader : *mut PROFILEHEADER) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetColorSpace(hdc : super::super::Graphics::Gdi:: HDC) -> HCOLORSPACE);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetCountColorProfileElements(hprofile : isize, pnelementcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetDeviceGammaRamp(hdc : super::super::Graphics::Gdi:: HDC, lpramp : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetICMProfileA(hdc : super::super::Graphics::Gdi:: HDC, pbufsize : *mut u32, pszfilename : windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetICMProfileW(hdc : super::super::Graphics::Gdi:: HDC, pbufsize : *mut u32, pszfilename : windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetLogColorSpaceA(hcolorspace : HCOLORSPACE, lpbuffer : *mut LOGCOLORSPACEA, nsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn GetLogColorSpaceW(hcolorspace : HCOLORSPACE, lpbuffer : *mut LOGCOLORSPACEW, nsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetNamedProfileInfo(hprofile : isize, pnamedprofileinfo : *mut NAMED_PROFILE_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetPS2ColorRenderingDictionary(hprofile : isize, dwintent : u32, pps2colorrenderingdictionary : *mut u8, pcbps2colorrenderingdictionary : *mut u32, pbbinary : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetPS2ColorRenderingIntent(hprofile : isize, dwintent : u32, pbuffer : *mut u8, pcbps2colorrenderingintent : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetPS2ColorSpaceArray(hprofile : isize, dwintent : u32, dwcsatype : u32, pps2colorspacearray : *mut u8, pcbps2colorspacearray : *mut u32, pbbinary : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetStandardColorSpaceProfileA(pmachinename : windows_sys::core::PCSTR, dwscs : u32, pbuffer : windows_sys::core::PSTR, pcbsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn GetStandardColorSpaceProfileW(pmachinename : windows_sys::core::PCWSTR, dwscs : u32, pbuffer : windows_sys::core::PWSTR, pcbsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn InstallColorProfileA(pmachinename : windows_sys::core::PCSTR, pprofilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn InstallColorProfileW(pmachinename : windows_sys::core::PCWSTR, pprofilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn IsColorProfileTagPresent(hprofile : isize, tag : u32, pbpresent : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn IsColorProfileValid(hprofile : isize, pbvalid : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn OpenColorProfileA(pprofile : *const PROFILE, dwdesiredaccess : u32, dwsharemode : u32, dwcreationmode : u32) -> isize);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn OpenColorProfileW(pprofile : *const PROFILE, dwdesiredaccess : u32, dwsharemode : u32, dwcreationmode : u32) -> isize);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn RegisterCMMA(pmachinename : windows_sys::core::PCSTR, cmmid : u32, pcmmdll : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn RegisterCMMW(pmachinename : windows_sys::core::PCWSTR, cmmid : u32, pcmmdll : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn SelectCMM(dwcmmtype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn SetColorProfileElement(hprofile : isize, tag : u32, dwoffset : u32, pcbelement : *const u32, pelement : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn SetColorProfileElementReference(hprofile : isize, newtag : u32, reftag : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn SetColorProfileElementSize(hprofile : isize, tagtype : u32, pcbelement : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("mscms.dll" "system" fn SetColorProfileHeader(hprofile : isize, pheader : *const PROFILEHEADER) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SetColorSpace(hdc : super::super::Graphics::Gdi:: HDC, hcs : HCOLORSPACE) -> HCOLORSPACE);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SetDeviceGammaRamp(hdc : super::super::Graphics::Gdi:: HDC, lpramp : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SetICMMode(hdc : super::super::Graphics::Gdi:: HDC, mode : ICM_MODE) -> i32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SetICMProfileA(hdc : super::super::Graphics::Gdi:: HDC, lpfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SetICMProfileW(hdc : super::super::Graphics::Gdi:: HDC, lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn SetStandardColorSpaceProfileA(pmachinename : windows_sys::core::PCSTR, dwprofileid : u32, pprofilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn SetStandardColorSpaceProfileW(pmachinename : windows_sys::core::PCWSTR, dwprofileid : u32, pprofilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("icmui.dll" "system" fn SetupColorMatchingA(pcms : *mut COLORMATCHSETUPA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("icmui.dll" "system" fn SetupColorMatchingW(pcms : *mut COLORMATCHSETUPW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn TranslateBitmapBits(hcolortransform : isize, psrcbits : *const core::ffi::c_void, bminput : BMFORMAT, dwwidth : u32, dwheight : u32, dwinputstride : u32, pdestbits : *mut core::ffi::c_void, bmoutput : BMFORMAT, dwoutputstride : u32, pfncallback : LPBMCALLBACKFN, ulcallbackdata : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn TranslateColors(hcolortransform : isize, painputcolors : *const COLOR, ncolors : u32, ctinput : COLORTYPE, paoutputcolors : *mut COLOR, ctoutput : COLORTYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn UninstallColorProfileA(pmachinename : windows_sys::core::PCSTR, pprofilename : windows_sys::core::PCSTR, bdelete : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn UninstallColorProfileW(pmachinename : windows_sys::core::PCWSTR, pprofilename : windows_sys::core::PCWSTR, bdelete : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn UnregisterCMMA(pmachinename : windows_sys::core::PCSTR, cmmid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn UnregisterCMMW(pmachinename : windows_sys::core::PCWSTR, cmmid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn UpdateICMRegKeyA(reserved : u32, lpszcmid : windows_sys::core::PCSTR, lpszfilename : windows_sys::core::PCSTR, command : ICM_COMMAND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn UpdateICMRegKeyW(reserved : u32, lpszcmid : windows_sys::core::PCWSTR, lpszfilename : windows_sys::core::PCWSTR, command : ICM_COMMAND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsAssociateColorProfileWithDevice(scope : WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename : windows_sys::core::PCWSTR, pdevicename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsCheckColors(hcolortransform : isize, ncolors : u32, ninputchannels : u32, cdtinput : COLORDATATYPE, cbinput : u32, pinputdata : *const core::ffi::c_void, paresult : *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsCreateIccProfile(hwcsprofile : isize, dwoptions : u32) -> isize);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsDisassociateColorProfileFromDevice(scope : WCS_PROFILE_MANAGEMENT_SCOPE, pprofilename : windows_sys::core::PCWSTR, pdevicename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsEnumColorProfiles(scope : WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord : *const ENUMTYPEW, pbuffer : *mut u8, dwsize : u32, pnprofiles : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsEnumColorProfilesSize(scope : WCS_PROFILE_MANAGEMENT_SCOPE, penumrecord : *const ENUMTYPEW, pdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsGetCalibrationManagementState(pbisenabled : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsGetDefaultColorProfile(scope : WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename : windows_sys::core::PCWSTR, cptcolorprofiletype : COLORPROFILETYPE, cpstcolorprofilesubtype : COLORPROFILESUBTYPE, dwprofileid : u32, cbprofilename : u32, pprofilename : windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsGetDefaultColorProfileSize(scope : WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename : windows_sys::core::PCWSTR, cptcolorprofiletype : COLORPROFILETYPE, cpstcolorprofilesubtype : COLORPROFILESUBTYPE, dwprofileid : u32, pcbprofilename : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsGetDefaultRenderingIntent(scope : WCS_PROFILE_MANAGEMENT_SCOPE, pdwrenderingintent : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsGetUsePerUserProfiles(pdevicename : windows_sys::core::PCWSTR, dwdeviceclass : u32, puseperuserprofiles : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsOpenColorProfileA(pcdmpprofile : *const PROFILE, pcampprofile : *const PROFILE, pgmmpprofile : *const PROFILE, dwdesireaccess : u32, dwsharemode : u32, dwcreationmode : u32, dwflags : u32) -> isize);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsOpenColorProfileW(pcdmpprofile : *const PROFILE, pcampprofile : *const PROFILE, pgmmpprofile : *const PROFILE, dwdesireaccess : u32, dwsharemode : u32, dwcreationmode : u32, dwflags : u32) -> isize);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsSetCalibrationManagementState(bisenabled : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsSetDefaultColorProfile(scope : WCS_PROFILE_MANAGEMENT_SCOPE, pdevicename : windows_sys::core::PCWSTR, cptcolorprofiletype : COLORPROFILETYPE, cpstcolorprofilesubtype : COLORPROFILESUBTYPE, dwprofileid : u32, pprofilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsSetDefaultRenderingIntent(scope : WCS_PROFILE_MANAGEMENT_SCOPE, dwrenderingintent : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsSetUsePerUserProfiles(pdevicename : windows_sys::core::PCWSTR, dwdeviceclass : u32, useperuserprofiles : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("mscms.dll" "system" fn WcsTranslateColors(hcolortransform : isize, ncolors : u32, ninputchannels : u32, cdtinput : COLORDATATYPE, cbinput : u32, pinputdata : *const core::ffi::c_void, noutputchannels : u32, cdtoutput : COLORDATATYPE, cboutput : u32, poutputdata : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

public const val `ATTRIB_MATTE`: UInt = 2u;
public const val `ATTRIB_TRANSPARENCY`: UInt = 1u;
public const val `BEST_MODE`: UInt = 3u;
public typealias `BMFORMAT` = Int;
public const val `BM_10b_G3CH`: `BMFORMAT` = 1028;
public const val `BM_10b_Lab`: `BMFORMAT` = 1027;
public const val `BM_10b_RGB`: `BMFORMAT` = 9;
public const val `BM_10b_XYZ`: `BMFORMAT` = 1025;
public const val `BM_10b_Yxy`: `BMFORMAT` = 1026;
public const val `BM_16b_G3CH`: `BMFORMAT` = 1284;
public const val `BM_16b_GRAY`: `BMFORMAT` = 1285;
public const val `BM_16b_Lab`: `BMFORMAT` = 1283;
public const val `BM_16b_RGB`: `BMFORMAT` = 10;
public const val `BM_16b_XYZ`: `BMFORMAT` = 1281;
public const val `BM_16b_Yxy`: `BMFORMAT` = 1282;
public const val `BM_32b_scARGB`: `BMFORMAT` = 1538;
public const val `BM_32b_scRGB`: `BMFORMAT` = 1537;
public const val `BM_565RGB`: `BMFORMAT` = 1;
public const val `BM_5CHANNEL`: `BMFORMAT` = 517;
public const val `BM_6CHANNEL`: `BMFORMAT` = 518;
public const val `BM_7CHANNEL`: `BMFORMAT` = 519;
public const val `BM_8CHANNEL`: `BMFORMAT` = 520;
public const val `BM_BGRTRIPLETS`: `BMFORMAT` = 4;
public const val `BM_CMYKQUADS`: `BMFORMAT` = 32;
public const val `BM_G3CHTRIPLETS`: `BMFORMAT` = 516;
public const val `BM_GRAY`: `BMFORMAT` = 521;
public const val `BM_KYMCQUADS`: `BMFORMAT` = 773;
public const val `BM_LabTRIPLETS`: `BMFORMAT` = 515;
public const val `BM_NAMED_INDEX`: `BMFORMAT` = 1029;
public const val `BM_R10G10B10A2`: `BMFORMAT` = 1793;
public const val `BM_R10G10B10A2_XR`: `BMFORMAT` = 1794;
public const val `BM_R16G16B16A16_FLOAT`: `BMFORMAT` = 1795;
public const val `BM_RGBTRIPLETS`: `BMFORMAT` = 2;
public const val `BM_S2DOT13FIXED_scARGB`: `BMFORMAT` = 1540;
public const val `BM_S2DOT13FIXED_scRGB`: `BMFORMAT` = 1539;
public const val `BM_XYZTRIPLETS`: `BMFORMAT` = 513;
public const val `BM_YxyTRIPLETS`: `BMFORMAT` = 514;
public const val `BM_x555G3CH`: `BMFORMAT` = 260;
public const val `BM_x555Lab`: `BMFORMAT` = 259;
public const val `BM_x555RGB`: `BMFORMAT` = 0;
public const val `BM_x555XYZ`: `BMFORMAT` = 257;
public const val `BM_x555Yxy`: `BMFORMAT` = 258;
public const val `BM_xBGRQUADS`: `BMFORMAT` = 16;
public const val `BM_xG3CHQUADS`: `BMFORMAT` = 772;
public const val `BM_xRGBQUADS`: `BMFORMAT` = 8;
// UNSUPPORTED Rust 200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BlackInformation {
//     pub fBlackOnly: windows_sys::core::BOOL,
//     pub blackWeight: f32,
// }

// UNSUPPORTED Rust 206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CATID_WcsPlugin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0b402e0_8240_405f_8a16_8a5b4df2f0dd);

public const val `CMM_DESCRIPTION`: UInt = 5u;
public const val `CMM_DLL_VERSION`: UInt = 3u;
public const val `CMM_DRIVER_VERSION`: UInt = 2u;
public const val `CMM_FROM_PROFILE`: UInt = 0u;
public const val `CMM_IDENT`: UInt = 1u;
public const val `CMM_LOGOICON`: UInt = 6u;
public const val `CMM_VERSION`: UInt = 4u;
public const val `CMM_WIN_VERSION`: UInt = 0u;
public const val `CMS_BACKWARD`: UInt = 1u;
public const val `CMS_DISABLEICM`: UInt = 1u;
public const val `CMS_DISABLEINTENT`: UInt = 1024u;
public const val `CMS_DISABLERENDERINTENT`: UInt = 2048u;
public const val `CMS_ENABLEPROOFING`: UInt = 2u;
public const val `CMS_FORWARD`: UInt = 0u;
public const val `CMS_MONITOROVERFLOW`: Int = -2147483648;
public const val `CMS_PRINTEROVERFLOW`: Int = 1073741824;
public const val `CMS_SETMONITORPROFILE`: UInt = 16u;
public const val `CMS_SETPRINTERPROFILE`: UInt = 32u;
public const val `CMS_SETPROOFINTENT`: UInt = 8u;
public const val `CMS_SETRENDERINTENT`: UInt = 4u;
public const val `CMS_SETTARGETPROFILE`: UInt = 64u;
public const val `CMS_TARGETOVERFLOW`: Int = 536870912;
public const val `CMS_USEAPPLYCALLBACK`: UInt = 256u;
public const val `CMS_USEDESCRIPTION`: UInt = 512u;
public const val `CMS_USEHOOK`: UInt = 128u;
// UNSUPPORTED Rust 232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMYKCOLOR {
//     pub cyan: u16,
//     pub magenta: u16,
//     pub yellow: u16,
//     pub black: u16,
// }

// UNSUPPORTED Rust 240:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLOR {
//     pub gray: GRAYCOLOR,
//     pub rgb: RGBCOLOR,
//     pub cmyk: CMYKCOLOR,
//     pub XYZ: XYZCOLOR,
//     pub Yxy: YxyCOLOR,
//     pub Lab: LabCOLOR,
//     pub gen3ch: GENERIC3CHANNEL,
//     pub named: NAMEDCOLOR,
//     pub hifi: HiFiCOLOR,
//     pub Anonymous: COLOR_0,
// }

// UNSUPPORTED Rust 254:1: declaration Impl has no candidate rule
// impl Default for COLOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLOR_0 {
//     pub reserved1: u32,
//     pub reserved2: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 265:1: declaration Impl has no candidate rule
// impl Default for COLOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COLORDATATYPE` = Int;
// UNSUPPORTED Rust 271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct COLORMATCHSETUPA {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub pSourceName: windows_sys::core::PCSTR,
//     pub pDisplayName: windows_sys::core::PCSTR,
//     pub pPrinterName: windows_sys::core::PCSTR,
//     pub dwRenderIntent: u32,
//     pub dwProofingIntent: u32,
//     pub pMonitorProfile: windows_sys::core::PSTR,
//     pub ccMonitorProfile: u32,
//     pub pPrinterProfile: windows_sys::core::PSTR,
//     pub ccPrinterProfile: u32,
//     pub pTargetProfile: windows_sys::core::PSTR,
//     pub ccTargetProfile: u32,
//     pub lpfnHook: super::WindowsAndMessaging::DLGPROC,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub lpfnApplyCallback: PCMSCALLBACKA,
//     pub lParamApplyCallback: super::super::Foundation::LPARAM,
// }

// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for COLORMATCHSETUPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct COLORMATCHSETUPW {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub pSourceName: windows_sys::core::PCWSTR,
//     pub pDisplayName: windows_sys::core::PCWSTR,
//     pub pPrinterName: windows_sys::core::PCWSTR,
//     pub dwRenderIntent: u32,
//     pub dwProofingIntent: u32,
//     pub pMonitorProfile: windows_sys::core::PWSTR,
//     pub ccMonitorProfile: u32,
//     pub pPrinterProfile: windows_sys::core::PWSTR,
//     pub ccPrinterProfile: u32,
//     pub pTargetProfile: windows_sys::core::PWSTR,
//     pub ccTargetProfile: u32,
//     pub lpfnHook: super::WindowsAndMessaging::DLGPROC,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub lpfnApplyCallback: PCMSCALLBACKW,
//     pub lParamApplyCallback: super::super::Foundation::LPARAM,
// }

// UNSUPPORTED Rust 325:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for COLORMATCHSETUPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COLORPROFILESUBTYPE` = Int;
public typealias `COLORPROFILETYPE` = Int;
public typealias `COLORTYPE` = Int;
public const val `COLOR_10b_R10G10B10A2`: `COLORDATATYPE` = 5;
public const val `COLOR_10b_R10G10B10A2_XR`: `COLORDATATYPE` = 6;
public const val `COLOR_3_CHANNEL`: `COLORTYPE` = 6;
public const val `COLOR_5_CHANNEL`: `COLORTYPE` = 8;
public const val `COLOR_6_CHANNEL`: `COLORTYPE` = 9;
public const val `COLOR_7_CHANNEL`: `COLORTYPE` = 10;
public const val `COLOR_8_CHANNEL`: `COLORTYPE` = 11;
public const val `COLOR_BYTE`: `COLORDATATYPE` = 1;
public const val `COLOR_CMYK`: `COLORTYPE` = 7;
public const val `COLOR_FLOAT`: `COLORDATATYPE` = 3;
public const val `COLOR_FLOAT16`: `COLORDATATYPE` = 7;
public const val `COLOR_GRAY`: `COLORTYPE` = 1;
public const val `COLOR_Lab`: `COLORTYPE` = 5;
public typealias `COLOR_MATCH_TO_TARGET_ACTION` = UInt;
public const val `COLOR_MATCH_VERSION`: UInt = 512u;
public const val `COLOR_NAMED`: `COLORTYPE` = 12;
public const val `COLOR_RGB`: `COLORTYPE` = 2;
public const val `COLOR_S2DOT13FIXED`: `COLORDATATYPE` = 4;
public const val `COLOR_WORD`: `COLORDATATYPE` = 2;
public const val `COLOR_XYZ`: `COLORTYPE` = 3;
public const val `COLOR_Yxy`: `COLORTYPE` = 4;
public const val `CPST_ABSOLUTE_COLORIMETRIC`: `COLORPROFILESUBTYPE` = 3;
public const val `CPST_CUSTOM_WORKING_SPACE`: `COLORPROFILESUBTYPE` = 6;
public const val `CPST_EXTENDED_DISPLAY_COLOR_MODE`: `COLORPROFILESUBTYPE` = 8;
public const val `CPST_NONE`: `COLORPROFILESUBTYPE` = 4;
public const val `CPST_PERCEPTUAL`: `COLORPROFILESUBTYPE` = 0;
public const val `CPST_RELATIVE_COLORIMETRIC`: `COLORPROFILESUBTYPE` = 1;
public const val `CPST_RGB_WORKING_SPACE`: `COLORPROFILESUBTYPE` = 5;
public const val `CPST_SATURATION`: `COLORPROFILESUBTYPE` = 2;
public const val `CPST_STANDARD_DISPLAY_COLOR_MODE`: `COLORPROFILESUBTYPE` = 7;
public const val `CPT_CAMP`: `COLORPROFILETYPE` = 2;
public const val `CPT_DMP`: `COLORPROFILETYPE` = 1;
public const val `CPT_GMMP`: `COLORPROFILETYPE` = 3;
public const val `CPT_ICC`: `COLORPROFILETYPE` = 0;
public const val `CSA_A`: UInt = 1u;
public const val `CSA_ABC`: UInt = 2u;
public const val `CSA_CMYK`: UInt = 7u;
public const val `CSA_DEF`: UInt = 3u;
public const val `CSA_DEFG`: UInt = 4u;
public const val `CSA_GRAY`: UInt = 5u;
public const val `CSA_Lab`: UInt = 8u;
public const val `CSA_RGB`: UInt = 6u;
public const val `CS_DELETE_TRANSFORM`: `COLOR_MATCH_TO_TARGET_ACTION` = 3u;
public const val `CS_DISABLE`: `COLOR_MATCH_TO_TARGET_ACTION` = 2u;
public const val `CS_ENABLE`: `COLOR_MATCH_TO_TARGET_ACTION` = 1u;
public const val `DONT_USE_EMBEDDED_WCS_PROFILES`: Int = 1;
// UNSUPPORTED Rust 380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct EMRCREATECOLORSPACE {
//     pub emr: super::super::Graphics::Gdi::EMR,
//     pub ihCS: u32,
//     pub lcs: LOGCOLORSPACEA,
// }

// UNSUPPORTED Rust 388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct EMRCREATECOLORSPACEW {
//     pub emr: super::super::Graphics::Gdi::EMR,
//     pub ihCS: u32,
//     pub lcs: LOGCOLORSPACEW,
//     pub dwFlags: u32,
//     pub cbData: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for EMRCREATECOLORSPACEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENABLE_GAMUT_CHECKING`: UInt = 65536u;
// UNSUPPORTED Rust 406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUMTYPEA {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub dwFields: u32,
//     pub pDeviceName: windows_sys::core::PCSTR,
//     pub dwMediaType: u32,
//     pub dwDitheringMode: u32,
//     pub dwResolution: [u32; 2],
//     pub dwCMMType: u32,
//     pub dwClass: u32,
//     pub dwDataColorSpace: u32,
//     pub dwConnectionSpace: u32,
//     pub dwSignature: u32,
//     pub dwPlatform: u32,
//     pub dwProfileFlags: u32,
//     pub dwManufacturer: u32,
//     pub dwModel: u32,
//     pub dwAttributes: [u32; 2],
//     pub dwRenderingIntent: u32,
//     pub dwCreator: u32,
//     pub dwDeviceClass: u32,
// }

// UNSUPPORTED Rust 430:1: declaration Impl has no candidate rule
// impl Default for ENUMTYPEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 435:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUMTYPEW {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub dwFields: u32,
//     pub pDeviceName: windows_sys::core::PCWSTR,
//     pub dwMediaType: u32,
//     pub dwDitheringMode: u32,
//     pub dwResolution: [u32; 2],
//     pub dwCMMType: u32,
//     pub dwClass: u32,
//     pub dwDataColorSpace: u32,
//     pub dwConnectionSpace: u32,
//     pub dwSignature: u32,
//     pub dwPlatform: u32,
//     pub dwProfileFlags: u32,
//     pub dwManufacturer: u32,
//     pub dwModel: u32,
//     pub dwAttributes: [u32; 2],
//     pub dwRenderingIntent: u32,
//     pub dwCreator: u32,
//     pub dwDeviceClass: u32,
// }

// UNSUPPORTED Rust 459:1: declaration Impl has no candidate rule
// impl Default for ENUMTYPEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENUM_TYPE_VERSION`: UInt = 768u;
public const val `ET_ATTRIBUTES`: UInt = 8192u;
public const val `ET_CLASS`: UInt = 32u;
public const val `ET_CMMTYPE`: UInt = 16u;
public const val `ET_CONNECTIONSPACE`: UInt = 128u;
public const val `ET_CREATOR`: UInt = 32768u;
public const val `ET_DATACOLORSPACE`: UInt = 64u;
public const val `ET_DEVICECLASS`: UInt = 65536u;
public const val `ET_DEVICENAME`: UInt = 1u;
public const val `ET_DITHERMODE`: UInt = 4u;
public const val `ET_EXTENDEDDISPLAYCOLOR`: UInt = 262144u;
public const val `ET_MANUFACTURER`: UInt = 2048u;
public const val `ET_MEDIATYPE`: UInt = 2u;
public const val `ET_MODEL`: UInt = 4096u;
public const val `ET_PLATFORM`: UInt = 512u;
public const val `ET_PROFILEFLAGS`: UInt = 1024u;
public const val `ET_RENDERINGINTENT`: UInt = 16384u;
public const val `ET_RESOLUTION`: UInt = 8u;
public const val `ET_SIGNATURE`: UInt = 256u;
public const val `ET_STANDARDDISPLAYCOLOR`: UInt = 131072u;
public const val `FAST_TRANSLATE`: UInt = 262144u;
public const val `FLAG_DEPENDENTONDATA`: UInt = 2u;
public const val `FLAG_EMBEDDEDPROFILE`: UInt = 1u;
public const val `FLAG_ENABLE_CHROMATIC_ADAPTATION`: UInt = 33554432u;
// UNSUPPORTED Rust 488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GENERIC3CHANNEL {
//     pub ch1: u16,
//     pub ch2: u16,
//     pub ch3: u16,
// }

// UNSUPPORTED Rust 495:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GRAYCOLOR {
//     pub gray: u16,
// }

// UNSUPPORTED Rust 500:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GamutBoundaryDescription {
//     pub pPrimaries: *mut PrimaryJabColors,
//     pub cNeutralSamples: u32,
//     pub pNeutralSamples: *mut JabColorF,
//     pub pReferenceShell: *mut GamutShell,
//     pub pPlausibleShell: *mut GamutShell,
//     pub pPossibleShell: *mut GamutShell,
// }

// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule
// impl Default for GamutBoundaryDescription {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 515:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GamutShell {
//     pub JMin: f32,
//     pub JMax: f32,
//     pub cVertices: u32,
//     pub cTriangles: u32,
//     pub pVertices: *mut JabColorF,
//     pub pTriangles: *mut GamutShellTriangle,
// }

// UNSUPPORTED Rust 525:1: declaration Impl has no candidate rule
// impl Default for GamutShell {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 530:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GamutShellTriangle {
//     pub aVertexIndex: [u32; 3],
// }

// UNSUPPORTED Rust 535:1: declaration Impl has no candidate rule
// impl Default for GamutShellTriangle {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 540:1: non-scalar type Ptr unsupported
// pub type HCOLORSPACE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 541:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HiFiCOLOR {
//     pub channel: [u8; 8],
// }

// UNSUPPORTED Rust 546:1: declaration Impl has no candidate rule
// impl Default for HiFiCOLOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 551:1: generic scalar type unsupported
// pub type ICMENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 552:1: generic scalar type unsupported
// pub type ICMENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::super::Foundation::LPARAM) -> i32>;

public const val `ICM_ADDPROFILE`: `ICM_COMMAND` = 1u;
public typealias `ICM_COMMAND` = UInt;
public const val `ICM_DELETEPROFILE`: `ICM_COMMAND` = 2u;
public const val `ICM_DONE_OUTSIDEDC`: `ICM_MODE` = 4;
public typealias `ICM_MODE` = Int;
public const val `ICM_OFF`: `ICM_MODE` = 1;
public const val `ICM_ON`: `ICM_MODE` = 2;
public const val `ICM_QUERY`: `ICM_MODE` = 3;
public const val `ICM_QUERYMATCH`: `ICM_COMMAND` = 7u;
public const val `ICM_QUERYPROFILE`: `ICM_COMMAND` = 3u;
public const val `ICM_REGISTERICMATCHER`: `ICM_COMMAND` = 5u;
public const val `ICM_SETDEFAULTPROFILE`: `ICM_COMMAND` = 4u;
public const val `ICM_UNREGISTERICMATCHER`: `ICM_COMMAND` = 6u;
public const val `INDEX_DONT_CARE`: UInt = 0u;
public const val `INTENT_ABSOLUTE_COLORIMETRIC`: UInt = 3u;
public const val `INTENT_PERCEPTUAL`: UInt = 0u;
public const val `INTENT_RELATIVE_COLORIMETRIC`: UInt = 1u;
public const val `INTENT_SATURATION`: UInt = 2u;
// UNSUPPORTED Rust 571:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JChColorF {
//     pub J: f32,
//     pub C: f32,
//     pub h: f32,
// }

// UNSUPPORTED Rust 578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JabColorF {
//     pub J: f32,
//     pub a: f32,
//     pub b: f32,
// }

public typealias `LCSCSTYPE` = Int;
public const val `LCS_CALIBRATED_RGB`: `LCSCSTYPE` = 0;
public const val `LCS_WINDOWS_COLOR_SPACE`: `LCSCSTYPE` = 1466527264;
public const val `LCS_sRGB`: `LCSCSTYPE` = 1934772034;
// UNSUPPORTED Rust 589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct LOGCOLORSPACEA {
//     pub lcsSignature: u32,
//     pub lcsVersion: u32,
//     pub lcsSize: u32,
//     pub lcsCSType: LCSCSTYPE,
//     pub lcsIntent: i32,
//     pub lcsEndpoints: super::super::Graphics::Gdi::CIEXYZTRIPLE,
//     pub lcsGammaRed: u32,
//     pub lcsGammaGreen: u32,
//     pub lcsGammaBlue: u32,
//     pub lcsFilename: [i8; 260],
// }

// UNSUPPORTED Rust 604:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for LOGCOLORSPACEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct LOGCOLORSPACEW {
//     pub lcsSignature: u32,
//     pub lcsVersion: u32,
//     pub lcsSize: u32,
//     pub lcsCSType: LCSCSTYPE,
//     pub lcsIntent: i32,
//     pub lcsEndpoints: super::super::Graphics::Gdi::CIEXYZTRIPLE,
//     pub lcsGammaRed: u32,
//     pub lcsGammaGreen: u32,
//     pub lcsGammaBlue: u32,
//     pub lcsFilename: [u16; 260],
// }

// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for LOGCOLORSPACEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 631:1: generic scalar type unsupported
// pub type LPBMCALLBACKFN = Option<unsafe extern "system" fn(param0: u32, param1: u32, param2: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 632:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LabCOLOR {
//     pub L: u16,
//     pub a: u16,
//     pub b: u16,
// }

public const val `MAX_COLOR_CHANNELS`: UInt = 8u;
public const val `MicrosoftHardwareColorV2`: `WCS_DEVICE_CAPABILITIES_TYPE` = 2;
// UNSUPPORTED Rust 641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NAMEDCOLOR {
//     pub dwIndex: u32,
// }

// UNSUPPORTED Rust 646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NAMED_PROFILE_INFO {
//     pub dwFlags: u32,
//     pub dwCount: u32,
//     pub dwCountDevCoordinates: u32,
//     pub szPrefix: [i8; 32],
//     pub szSuffix: [i8; 32],
// }

// UNSUPPORTED Rust 655:1: declaration Impl has no candidate rule
// impl Default for NAMED_PROFILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NORMAL_MODE`: UInt = 2u;
// UNSUPPORTED Rust 661:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type PCMSCALLBACKA = Option<unsafe extern "system" fn(param0: *mut COLORMATCHSETUPA, param1: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 663:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type PCMSCALLBACKW = Option<unsafe extern "system" fn(param0: *mut COLORMATCHSETUPW, param1: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

public const val `PRESERVEBLACK`: UInt = 1048576u;
// UNSUPPORTED Rust 666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROFILE {
//     pub dwType: u32,
//     pub pProfileData: *mut core::ffi::c_void,
//     pub cbDataSize: u32,
// }

// UNSUPPORTED Rust 673:1: declaration Impl has no candidate rule
// impl Default for PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 678:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct PROFILEHEADER {
//     pub phSize: u32,
//     pub phCMMType: u32,
//     pub phVersion: u32,
//     pub phClass: u32,
//     pub phDataColorSpace: u32,
//     pub phConnectionSpace: u32,
//     pub phDateTime: [u32; 3],
//     pub phSignature: u32,
//     pub phPlatform: u32,
//     pub phProfileFlags: u32,
//     pub phManufacturer: u32,
//     pub phModel: u32,
//     pub phAttributes: [u32; 2],
//     pub phRenderingIntent: u32,
//     pub phIlluminant: super::super::Graphics::Gdi::CIEXYZ,
//     pub phCreator: u32,
//     pub phReserved: [u8; 44],
// }

// UNSUPPORTED Rust 700:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for PROFILEHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROFILE_FILENAME`: UInt = 1u;
public const val `PROFILE_MEMBUFFER`: UInt = 2u;
public const val `PROFILE_READ`: UInt = 1u;
public const val `PROFILE_READWRITE`: UInt = 2u;
public const val `PROOF_MODE`: UInt = 1u;
// UNSUPPORTED Rust 711:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PrimaryJabColors {
//     pub red: JabColorF,
//     pub yellow: JabColorF,
//     pub green: JabColorF,
//     pub cyan: JabColorF,
//     pub blue: JabColorF,
//     pub magenta: JabColorF,
//     pub black: JabColorF,
//     pub white: JabColorF,
// }

// UNSUPPORTED Rust 723:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PrimaryXYZColors {
//     pub red: XYZColorF,
//     pub yellow: XYZColorF,
//     pub green: XYZColorF,
//     pub cyan: XYZColorF,
//     pub blue: XYZColorF,
//     pub magenta: XYZColorF,
//     pub black: XYZColorF,
//     pub white: XYZColorF,
// }

public const val `RESERVED`: UInt = 2147483648u;
// UNSUPPORTED Rust 736:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RGBCOLOR {
//     pub red: u16,
//     pub green: u16,
//     pub blue: u16,
// }

public const val `SEQUENTIAL_TRANSFORM`: UInt = 2155872256u;
public const val `USE_RELATIVE_COLORIMETRIC`: UInt = 131072u;
public const val `VideoCardGammaTable`: `WCS_DEVICE_CAPABILITIES_TYPE` = 1;
public const val `WCS_ALWAYS`: UInt = 2097152u;
public const val `WCS_DEFAULT`: Int = 0;
public typealias `WCS_DEVICE_CAPABILITIES_TYPE` = Int;
// UNSUPPORTED Rust 749:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WCS_DEVICE_MHC2_CAPABILITIES {
//     pub Size: u32,
//     pub SupportsMhc2: windows_sys::core::BOOL,
//     pub RegammaLutEntryCount: u32,
//     pub CscXyzMatrixRows: u32,
//     pub CscXyzMatrixColumns: u32,
// }

// UNSUPPORTED Rust 758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WCS_DEVICE_VCGT_CAPABILITIES {
//     pub Size: u32,
//     pub SupportsVcgt: windows_sys::core::BOOL,
// }

public const val `WCS_ICCONLY`: Int = 65536;
public typealias `WCS_PROFILE_MANAGEMENT_SCOPE` = Int;
public const val `WCS_PROFILE_MANAGEMENT_SCOPE_CURRENT_USER`: `WCS_PROFILE_MANAGEMENT_SCOPE` = 1;
public const val `WCS_PROFILE_MANAGEMENT_SCOPE_SYSTEM_WIDE`: `WCS_PROFILE_MANAGEMENT_SCOPE` = 0;
// UNSUPPORTED Rust 768:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XYZCOLOR {
//     pub X: u16,
//     pub Y: u16,
//     pub Z: u16,
// }

// UNSUPPORTED Rust 775:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XYZColorF {
//     pub X: f32,
//     pub Y: f32,
//     pub Z: f32,
// }

// UNSUPPORTED Rust 782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct YxyCOLOR {
//     pub Y: u16,
//     pub x: u16,
//     pub y: u16,
// }

