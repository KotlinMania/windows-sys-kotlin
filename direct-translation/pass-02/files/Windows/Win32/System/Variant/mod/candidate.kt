// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn ClearVariantArray(pvars : *mut VARIANT, cvars : u32));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn DosDateTimeToVariantTime(wdosdate : u16, wdostime : u16, pvtime : *mut f64) -> i32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromBooleanArray(prgf : *const windows_sys::core::BOOL, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromBuffer(pv : *const core::ffi::c_void, cb : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromDoubleArray(prgn : *const f64, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromFileTime(pft : *const super::super::Foundation:: FILETIME, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromFileTimeArray(prgft : *const super::super::Foundation:: FILETIME, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromGUIDAsString(guid : *const windows_sys::core::GUID, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromInt16Array(prgn : *const i16, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromInt32Array(prgn : *const i32, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromInt64Array(prgn : *const i64, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromResource(hinst : super::super::Foundation:: HINSTANCE, id : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromStringArray(prgsz : *const windows_sys::core::PCWSTR, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromUInt16Array(prgn : *const u16, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromUInt32Array(prgn : *const u32, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromUInt64Array(prgn : *const u64, celems : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn InitVariantFromVariantArrayElem(varin : *const VARIANT, ielem : u32, pvar : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn SystemTimeToVariantTime(lpsystemtime : *const super::super::Foundation:: SYSTEMTIME, pvtime : *mut f64) -> i32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserFree(param0 : *const u32, param1 : *const VARIANT));

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserFree64(param0 : *const u32, param1 : *const VARIANT));

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const VARIANT) -> *mut u8);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const VARIANT) -> *mut u8);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserSize(param0 : *const u32, param1 : u32, param2 : *const VARIANT) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserSize64(param0 : *const u32, param1 : u32, param2 : *const VARIANT) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut VARIANT) -> *mut u8);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VARIANT_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut VARIANT) -> *mut u8);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VariantChangeType(pvargdest : *mut VARIANT, pvarsrc : *const VARIANT, wflags : VAR_CHANGE_FLAGS, vt : VARENUM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VariantChangeTypeEx(pvargdest : *mut VARIANT, pvarsrc : *const VARIANT, lcid : u32, wflags : VAR_CHANGE_FLAGS, vt : VARENUM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VariantClear(pvarg : *mut VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantCompare(var1 : *const VARIANT, var2 : *const VARIANT) -> i32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VariantCopy(pvargdest : *mut VARIANT, pvargsrc : *const VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VariantCopyInd(pvardest : *mut VARIANT, pvargsrc : *const VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetBooleanElem(var : *const VARIANT, ielem : u32, pfval : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetDoubleElem(var : *const VARIANT, ielem : u32, pnval : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetElementCount(varin : *const VARIANT) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetInt16Elem(var : *const VARIANT, ielem : u32, pnval : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetInt32Elem(var : *const VARIANT, ielem : u32, pnval : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetInt64Elem(var : *const VARIANT, ielem : u32, pnval : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetStringElem(var : *const VARIANT, ielem : u32, ppszval : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetUInt16Elem(var : *const VARIANT, ielem : u32, pnval : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetUInt32Elem(var : *const VARIANT, ielem : u32, pnval : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantGetUInt64Elem(var : *const VARIANT, ielem : u32, pnval : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("oleaut32.dll" "system" fn VariantInit(pvarg : *mut VARIANT));

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VariantTimeToDosDateTime(vtime : f64, pwdosdate : *mut u16, pwdostime : *mut u16) -> i32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VariantTimeToSystemTime(vtime : f64, lpsystemtime : *mut super::super::Foundation:: SYSTEMTIME) -> i32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToBoolean(varin : *const VARIANT, pfret : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToBooleanArray(var : *const VARIANT, prgf : *mut windows_sys::core::BOOL, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToBooleanArrayAlloc(var : *const VARIANT, pprgf : *mut *mut windows_sys::core::BOOL, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToBooleanWithDefault(varin : *const VARIANT, fdefault : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToBuffer(varin : *const VARIANT, pv : *mut core::ffi::c_void, cb : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToDosDateTime(varin : *const VARIANT, pwdate : *mut u16, pwtime : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToDouble(varin : *const VARIANT, pdblret : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToDoubleArray(var : *const VARIANT, prgn : *mut f64, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToDoubleArrayAlloc(var : *const VARIANT, pprgn : *mut *mut f64, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToDoubleWithDefault(varin : *const VARIANT, dbldefault : f64) -> f64);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToFileTime(varin : *const VARIANT, stfout : PSTIME_FLAGS, pftout : *mut super::super::Foundation:: FILETIME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToGUID(varin : *const VARIANT, pguid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt16(varin : *const VARIANT, piret : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt16Array(var : *const VARIANT, prgn : *mut i16, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt16ArrayAlloc(var : *const VARIANT, pprgn : *mut *mut i16, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt16WithDefault(varin : *const VARIANT, idefault : i16) -> i16);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt32(varin : *const VARIANT, plret : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt32Array(var : *const VARIANT, prgn : *mut i32, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt32ArrayAlloc(var : *const VARIANT, pprgn : *mut *mut i32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt32WithDefault(varin : *const VARIANT, ldefault : i32) -> i32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt64(varin : *const VARIANT, pllret : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt64Array(var : *const VARIANT, prgn : *mut i64, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt64ArrayAlloc(var : *const VARIANT, pprgn : *mut *mut i64, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToInt64WithDefault(varin : *const VARIANT, lldefault : i64) -> i64);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToString(varin : *const VARIANT, pszbuf : windows_sys::core::PWSTR, cchbuf : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToStringAlloc(varin : *const VARIANT, ppszbuf : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToStringArray(var : *const VARIANT, prgsz : *mut windows_sys::core::PWSTR, crgsz : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToStringArrayAlloc(var : *const VARIANT, pprgsz : *mut *mut windows_sys::core::PWSTR, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToStringWithDefault(varin : *const VARIANT, pszdefault : windows_sys::core::PCWSTR) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt16(varin : *const VARIANT, puiret : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt16Array(var : *const VARIANT, prgn : *mut u16, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt16ArrayAlloc(var : *const VARIANT, pprgn : *mut *mut u16, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt16WithDefault(varin : *const VARIANT, uidefault : u16) -> u16);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt32(varin : *const VARIANT, pulret : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt32Array(var : *const VARIANT, prgn : *mut u32, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt32ArrayAlloc(var : *const VARIANT, pprgn : *mut *mut u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt32WithDefault(varin : *const VARIANT, uldefault : u32) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt64(varin : *const VARIANT, pullret : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt64Array(var : *const VARIANT, prgn : *mut u64, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt64ArrayAlloc(var : *const VARIANT, pprgn : *mut *mut u64, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("propsys.dll" "system" fn VariantToUInt64WithDefault(varin : *const VARIANT, ulldefault : u64) -> u64);

public const val `DPF_ERROR`: `DRAWPROGRESSFLAGS` = 4;
public const val `DPF_MARQUEE`: `DRAWPROGRESSFLAGS` = 1;
public const val `DPF_MARQUEE_COMPLETE`: `DRAWPROGRESSFLAGS` = 2;
public const val `DPF_NONE`: `DRAWPROGRESSFLAGS` = 0;
public const val `DPF_STOPPED`: `DRAWPROGRESSFLAGS` = 16;
public const val `DPF_WARNING`: `DRAWPROGRESSFLAGS` = 8;
public typealias `DRAWPROGRESSFLAGS` = Int;
public const val `PSTF_LOCAL`: `PSTIME_FLAGS` = 1;
public const val `PSTF_UTC`: `PSTIME_FLAGS` = 0;
public typealias `PSTIME_FLAGS` = Int;
public typealias `VARENUM` = UShort;
// UNSUPPORTED Rust 180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// #[derive(Clone, Copy)]
// pub struct VARIANT {
//     pub Anonymous: VARIANT_0,
// }

// UNSUPPORTED Rust 186:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 192:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// #[derive(Clone, Copy)]
// pub union VARIANT_0 {
//     pub Anonymous: VARIANT_0_0,
//     pub decVal: super::super::Foundation::DECIMAL,
// }

// UNSUPPORTED Rust 199:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// #[derive(Clone, Copy)]
// pub struct VARIANT_0_0 {
//     pub vt: VARENUM,
//     pub wReserved1: u16,
//     pub wReserved2: u16,
//     pub wReserved3: u16,
//     pub Anonymous: VARIANT_0_0_0,
// }

// UNSUPPORTED Rust 215:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 221:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// #[derive(Clone, Copy)]
// pub union VARIANT_0_0_0 {
//     pub llVal: i64,
//     pub lVal: i32,
//     pub bVal: u8,
//     pub iVal: i16,
//     pub fltVal: f32,
//     pub dblVal: f64,
//     pub boolVal: super::super::Foundation::VARIANT_BOOL,
//     pub __OBSOLETE__VARIANT_BOOL: super::super::Foundation::VARIANT_BOOL,
//     pub scode: i32,
//     pub cyVal: super::Com::CY,
//     pub date: f64,
//     pub bstrVal: windows_sys::core::BSTR,
//     pub punkVal: *mut core::ffi::c_void,
//     pub pdispVal: *mut core::ffi::c_void,
//     pub parray: *mut super::Com::SAFEARRAY,
//     pub pbVal: *mut u8,
//     pub piVal: *mut i16,
//     pub plVal: *mut i32,
//     pub pllVal: *mut i64,
//     pub pfltVal: *mut f32,
//     pub pdblVal: *mut f64,
//     pub pboolVal: *mut super::super::Foundation::VARIANT_BOOL,
//     pub __OBSOLETE__VARIANT_PBOOL: *mut super::super::Foundation::VARIANT_BOOL,
//     pub pscode: *mut i32,
//     pub pcyVal: *mut super::Com::CY,
//     pub pdate: *mut f64,
//     pub pbstrVal: *mut windows_sys::core::BSTR,
//     pub ppunkVal: *mut *mut core::ffi::c_void,
//     pub ppdispVal: *mut *mut core::ffi::c_void,
//     pub pparray: *mut *mut super::Com::SAFEARRAY,
//     pub pvarVal: *mut VARIANT,
//     pub byref: *mut core::ffi::c_void,
//     pub cVal: i8,
//     pub uiVal: u16,
//     pub ulVal: u32,
//     pub ullVal: u64,
//     pub intVal: i32,
//     pub uintVal: u32,
//     pub pdecVal: *mut super::super::Foundation::DECIMAL,
//     pub pcVal: windows_sys::core::PSTR,
//     pub puiVal: *mut u16,
//     pub pulVal: *mut u32,
//     pub pullVal: *mut u64,
//     pub pintVal: *mut i32,
//     pub puintVal: *mut u32,
//     pub Anonymous: VARIANT_0_0_0_0,
// }

// UNSUPPORTED Rust 272:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// #[derive(Clone, Copy)]
// pub struct VARIANT_0_0_0_0 {
//     pub pvRecord: *mut core::ffi::c_void,
//     pub pRecInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 285:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// impl Default for VARIANT_0_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VARIANT_ALPHABOOL`: `VAR_CHANGE_FLAGS` = 2u;
public const val `VARIANT_CALENDAR_GREGORIAN`: `VAR_CHANGE_FLAGS` = 64u;
public const val `VARIANT_CALENDAR_HIJRI`: `VAR_CHANGE_FLAGS` = 8u;
public const val `VARIANT_CALENDAR_THAI`: `VAR_CHANGE_FLAGS` = 32u;
public const val `VARIANT_LOCALBOOL`: `VAR_CHANGE_FLAGS` = 16u;
public const val `VARIANT_NOUSEROVERRIDE`: `VAR_CHANGE_FLAGS` = 4u;
public const val `VARIANT_NOVALUEPROP`: `VAR_CHANGE_FLAGS` = 1u;
public const val `VARIANT_USE_NLS`: `VAR_CHANGE_FLAGS` = 128u;
public typealias `VAR_CHANGE_FLAGS` = UShort;
public const val `VT_ARRAY`: `VARENUM` = 8192u;
public const val `VT_BLOB`: `VARENUM` = 65u;
public const val `VT_BLOB_OBJECT`: `VARENUM` = 70u;
public const val `VT_BOOL`: `VARENUM` = 11u;
public const val `VT_BSTR`: `VARENUM` = 8u;
public const val `VT_BSTR_BLOB`: `VARENUM` = 4095u;
public const val `VT_BYREF`: `VARENUM` = 16384u;
public const val `VT_CARRAY`: `VARENUM` = 28u;
public const val `VT_CF`: `VARENUM` = 71u;
public const val `VT_CLSID`: `VARENUM` = 72u;
public const val `VT_CY`: `VARENUM` = 6u;
public const val `VT_DATE`: `VARENUM` = 7u;
public const val `VT_DECIMAL`: `VARENUM` = 14u;
public const val `VT_DISPATCH`: `VARENUM` = 9u;
public const val `VT_EMPTY`: `VARENUM` = 0u;
public const val `VT_ERROR`: `VARENUM` = 10u;
public const val `VT_FILETIME`: `VARENUM` = 64u;
public const val `VT_HRESULT`: `VARENUM` = 25u;
public const val `VT_I1`: `VARENUM` = 16u;
public const val `VT_I2`: `VARENUM` = 2u;
public const val `VT_I4`: `VARENUM` = 3u;
public const val `VT_I8`: `VARENUM` = 20u;
public const val `VT_ILLEGAL`: `VARENUM` = 65535u;
public const val `VT_ILLEGALMASKED`: `VARENUM` = 4095u;
public const val `VT_INT`: `VARENUM` = 22u;
public const val `VT_INT_PTR`: `VARENUM` = 37u;
public const val `VT_LPSTR`: `VARENUM` = 30u;
public const val `VT_LPWSTR`: `VARENUM` = 31u;
public const val `VT_NULL`: `VARENUM` = 1u;
public const val `VT_PTR`: `VARENUM` = 26u;
public const val `VT_R4`: `VARENUM` = 4u;
public const val `VT_R8`: `VARENUM` = 5u;
public const val `VT_RECORD`: `VARENUM` = 36u;
public const val `VT_RESERVED`: `VARENUM` = 32768u;
public const val `VT_SAFEARRAY`: `VARENUM` = 27u;
public const val `VT_STORAGE`: `VARENUM` = 67u;
public const val `VT_STORED_OBJECT`: `VARENUM` = 69u;
public const val `VT_STREAM`: `VARENUM` = 66u;
public const val `VT_STREAMED_OBJECT`: `VARENUM` = 68u;
public const val `VT_TYPEMASK`: `VARENUM` = 4095u;
public const val `VT_UI1`: `VARENUM` = 17u;
public const val `VT_UI2`: `VARENUM` = 18u;
public const val `VT_UI4`: `VARENUM` = 19u;
public const val `VT_UI8`: `VARENUM` = 21u;
public const val `VT_UINT`: `VARENUM` = 23u;
public const val `VT_UINT_PTR`: `VARENUM` = 38u;
public const val `VT_UNKNOWN`: `VARENUM` = 13u;
public const val `VT_USERDEFINED`: `VARENUM` = 29u;
public const val `VT_VARIANT`: `VARENUM` = 12u;
public const val `VT_VECTOR`: `VARENUM` = 4096u;
public const val `VT_VERSIONED_STREAM`: `VARENUM` = 73u;
public const val `VT_VOID`: `VARENUM` = 24u;
