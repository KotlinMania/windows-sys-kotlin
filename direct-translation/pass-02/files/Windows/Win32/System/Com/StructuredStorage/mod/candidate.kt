// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn ClearPropVariantArray(rgpropvar : *mut PROPVARIANT, cvars : u32));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoGetInstanceFromFile(pserverinfo : *const super:: COSERVERINFO, pclsid : *const windows_sys::core::GUID, punkouter : * mut core::ffi::c_void, dwclsctx : super:: CLSCTX, grfmode : u32, pwszname : windows_sys::core::PCWSTR, dwcount : u32, presults : *mut super:: MULTI_QI) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoGetInstanceFromIStorage(pserverinfo : *const super:: COSERVERINFO, pclsid : *const windows_sys::core::GUID, punkouter : * mut core::ffi::c_void, dwclsctx : super:: CLSCTX, pstg : * mut core::ffi::c_void, dwcount : u32, presults : *mut super:: MULTI_QI) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoGetInterfaceAndReleaseStream(pstm : * mut core::ffi::c_void, iid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CreateILockBytesOnHGlobal(hglobal : super::super::super::Foundation:: HGLOBAL, fdeleteonrelease : windows_sys::core::BOOL, pplkbyt : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CreateStreamOnHGlobal(hglobal : super::super::super::Foundation:: HGLOBAL, fdeleteonrelease : windows_sys::core::BOOL, ppstm : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn FmtIdToPropStgName(pfmtid : *const windows_sys::core::GUID, oszname : windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("ole32.dll" "system" fn FreePropVariantArray(cvariants : u32, rgvars : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn GetConvertStg(pstg : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn GetHGlobalFromILockBytes(plkbyt : * mut core::ffi::c_void, phglobal : *mut super::super::super::Foundation:: HGLOBAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn GetHGlobalFromStream(pstm : * mut core::ffi::c_void, phglobal : *mut super::super::super::Foundation:: HGLOBAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromBooleanVector(prgf : *const windows_sys::core::BOOL, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromBuffer(pv : *const core::ffi::c_void, cb : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromCLSID(clsid : *const windows_sys::core::GUID, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromDoubleVector(prgn : *const f64, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromFileTime(pftin : *const super::super::super::Foundation:: FILETIME, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromFileTimeVector(prgft : *const super::super::super::Foundation:: FILETIME, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromGUIDAsString(guid : *const windows_sys::core::GUID, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromInt16Vector(prgn : *const i16, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromInt32Vector(prgn : *const i32, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromInt64Vector(prgn : *const i64, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromPropVariantVectorElem(propvarin : *const PROPVARIANT, ielem : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromResource(hinst : super::super::super::Foundation:: HINSTANCE, id : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromStringAsVector(psz : windows_sys::core::PCWSTR, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromStringVector(prgsz : *const windows_sys::core::PCWSTR, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromUInt16Vector(prgn : *const u16, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromUInt32Vector(prgn : *const u32, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantFromUInt64Vector(prgn : *const u64, celems : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn InitPropVariantVectorFromPropVariant(propvarsingle : *const PROPVARIANT, ppropvarvector : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleConvertIStorageToOLESTREAM(pstg : * mut core::ffi::c_void, lpolestream : *mut OLESTREAM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn OleConvertIStorageToOLESTREAMEx(pstg : * mut core::ffi::c_void, cfformat : u16, lwidth : i32, lheight : i32, dwsize : u32, pmedium : *const super:: STGMEDIUM, polestm : *mut OLESTREAM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleConvertOLESTREAMToIStorage(lpolestream : *const OLESTREAM, pstg : * mut core::ffi::c_void, ptd : *const super:: DVTARGETDEVICE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn OleConvertOLESTREAMToIStorageEx(polestm : *const OLESTREAM, pstg : * mut core::ffi::c_void, pcfformat : *mut u16, plwwidth : *mut i32, plheight : *mut i32, pdwsize : *mut u32, pmedium : *mut super:: STGMEDIUM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn PropStgNameToFmtId(oszname : windows_sys::core::PCWSTR, pfmtid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantChangeType(ppropvardest : *mut PROPVARIANT, propvarsrc : *const PROPVARIANT, flags : PROPVAR_CHANGE_FLAGS, vt : super::super::Variant:: VARENUM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("ole32.dll" "system" fn PropVariantClear(pvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantCompareEx(propvar1 : *const PROPVARIANT, propvar2 : *const PROPVARIANT, unit : PROPVAR_COMPARE_UNIT, flags : PROPVAR_COMPARE_FLAGS) -> i32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("ole32.dll" "system" fn PropVariantCopy(pvardest : *mut PROPVARIANT, pvarsrc : *const PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetBooleanElem(propvar : *const PROPVARIANT, ielem : u32, pfval : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetDoubleElem(propvar : *const PROPVARIANT, ielem : u32, pnval : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetElementCount(propvar : *const PROPVARIANT) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetFileTimeElem(propvar : *const PROPVARIANT, ielem : u32, pftval : *mut super::super::super::Foundation:: FILETIME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetInt16Elem(propvar : *const PROPVARIANT, ielem : u32, pnval : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetInt32Elem(propvar : *const PROPVARIANT, ielem : u32, pnval : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetInt64Elem(propvar : *const PROPVARIANT, ielem : u32, pnval : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetStringElem(propvar : *const PROPVARIANT, ielem : u32, ppszval : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetUInt16Elem(propvar : *const PROPVARIANT, ielem : u32, pnval : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetUInt32Elem(propvar : *const PROPVARIANT, ielem : u32, pnval : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantGetUInt64Elem(propvar : *const PROPVARIANT, ielem : u32, pnval : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToBSTR(propvar : *const PROPVARIANT, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToBoolean(propvarin : *const PROPVARIANT, pfret : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToBooleanVector(propvar : *const PROPVARIANT, prgf : *mut windows_sys::core::BOOL, crgf : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToBooleanVectorAlloc(propvar : *const PROPVARIANT, pprgf : *mut *mut windows_sys::core::BOOL, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToBooleanWithDefault(propvarin : *const PROPVARIANT, fdefault : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToBuffer(propvar : *const PROPVARIANT, pv : *mut core::ffi::c_void, cb : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToDouble(propvarin : *const PROPVARIANT, pdblret : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToDoubleVector(propvar : *const PROPVARIANT, prgn : *mut f64, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToDoubleVectorAlloc(propvar : *const PROPVARIANT, pprgn : *mut *mut f64, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToDoubleWithDefault(propvarin : *const PROPVARIANT, dbldefault : f64) -> f64);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToFileTime(propvar : *const PROPVARIANT, pstfout : super::super::Variant:: PSTIME_FLAGS, pftout : *mut super::super::super::Foundation:: FILETIME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToFileTimeVector(propvar : *const PROPVARIANT, prgft : *mut super::super::super::Foundation:: FILETIME, crgft : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToFileTimeVectorAlloc(propvar : *const PROPVARIANT, pprgft : *mut *mut super::super::super::Foundation:: FILETIME, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToGUID(propvar : *const PROPVARIANT, pguid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt16(propvarin : *const PROPVARIANT, piret : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt16Vector(propvar : *const PROPVARIANT, prgn : *mut i16, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt16VectorAlloc(propvar : *const PROPVARIANT, pprgn : *mut *mut i16, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt16WithDefault(propvarin : *const PROPVARIANT, idefault : i16) -> i16);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt32(propvarin : *const PROPVARIANT, plret : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt32Vector(propvar : *const PROPVARIANT, prgn : *mut i32, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt32VectorAlloc(propvar : *const PROPVARIANT, pprgn : *mut *mut i32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt32WithDefault(propvarin : *const PROPVARIANT, ldefault : i32) -> i32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt64(propvarin : *const PROPVARIANT, pllret : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt64Vector(propvar : *const PROPVARIANT, prgn : *mut i64, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt64VectorAlloc(propvar : *const PROPVARIANT, pprgn : *mut *mut i64, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToInt64WithDefault(propvarin : *const PROPVARIANT, lldefault : i64) -> i64);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToString(propvar : *const PROPVARIANT, psz : windows_sys::core::PWSTR, cch : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToStringAlloc(propvar : *const PROPVARIANT, ppszout : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToStringVector(propvar : *const PROPVARIANT, prgsz : *mut windows_sys::core::PWSTR, crgsz : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToStringVectorAlloc(propvar : *const PROPVARIANT, pprgsz : *mut *mut windows_sys::core::PWSTR, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToStringWithDefault(propvarin : *const PROPVARIANT, pszdefault : windows_sys::core::PCWSTR) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt16(propvarin : *const PROPVARIANT, puiret : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt16Vector(propvar : *const PROPVARIANT, prgn : *mut u16, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt16VectorAlloc(propvar : *const PROPVARIANT, pprgn : *mut *mut u16, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt16WithDefault(propvarin : *const PROPVARIANT, uidefault : u16) -> u16);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt32(propvarin : *const PROPVARIANT, pulret : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt32Vector(propvar : *const PROPVARIANT, prgn : *mut u32, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt32VectorAlloc(propvar : *const PROPVARIANT, pprgn : *mut *mut u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt32WithDefault(propvarin : *const PROPVARIANT, uldefault : u32) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt64(propvarin : *const PROPVARIANT, pullret : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt64Vector(propvar : *const PROPVARIANT, prgn : *mut u64, crgn : u32, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt64VectorAlloc(propvar : *const PROPVARIANT, pprgn : *mut *mut u64, pcelem : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToUInt64WithDefault(propvarin : *const PROPVARIANT, ulldefault : u64) -> u64);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn PropVariantToVariant(ppropvar : *const PROPVARIANT, pvar : *mut super::super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn PropVariantToWinRTPropertyValue(propvar : *const PROPVARIANT, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn ReadClassStg(pstg : * mut core::ffi::c_void, pclsid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn ReadClassStm(pstm : * mut core::ffi::c_void, pclsid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn ReadFmtUserTypeStg(pstg : * mut core::ffi::c_void, pcf : *mut u16, lplpszusertype : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SetConvertStg(pstg : * mut core::ffi::c_void, fconvert : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("ole32.dll" "system" fn StgConvertPropertyToVariant(pprop : *const SERIALIZEDPROPERTYVALUE, codepage : u16, pvar : *mut PROPVARIANT, pma : * mut core::ffi::c_void) -> bool);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("ole32.dll" "system" fn StgConvertVariantToProperty(pvar : *const PROPVARIANT, codepage : u16, pprop : *mut SERIALIZEDPROPERTYVALUE, pcb : *mut u32, pid : u32, freserved : bool, pcindirect : *mut u32) -> *mut SERIALIZEDPROPERTYVALUE);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgCreateDocfile(pwcsname : windows_sys::core::PCWSTR, grfmode : super:: STGM, reserved : u32, ppstgopen : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgCreateDocfileOnILockBytes(plkbyt : * mut core::ffi::c_void, grfmode : super:: STGM, reserved : u32, ppstgopen : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgCreatePropSetStg(pstorage : * mut core::ffi::c_void, dwreserved : u32, pppropsetstg : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgCreatePropStg(punk : * mut core::ffi::c_void, fmtid : *const windows_sys::core::GUID, pclsid : *const windows_sys::core::GUID, grfflags : u32, dwreserved : u32, pppropstg : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ole32.dll" "system" fn StgCreateStorageEx(pwcsname : windows_sys::core::PCWSTR, grfmode : super:: STGM, stgfmt : STGFMT, grfattrs : u32, pstgoptions : *mut STGOPTIONS, psecuritydescriptor : super::super::super::Security:: PSECURITY_DESCRIPTOR, riid : *const windows_sys::core::GUID, ppobjectopen : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn StgDeserializePropVariant(pprop : *const SERIALIZEDPROPERTYVALUE, cbmax : u32, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgGetIFillLockBytesOnFile(pwcsname : windows_sys::core::PCWSTR, ppflb : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgGetIFillLockBytesOnILockBytes(pilb : * mut core::ffi::c_void, ppflb : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgIsStorageFile(pwcsname : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgIsStorageILockBytes(plkbyt : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgOpenAsyncDocfileOnIFillLockBytes(pflb : * mut core::ffi::c_void, grfmode : u32, asyncflags : u32, ppstgopen : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("dflayout.dll" "system" fn StgOpenLayoutDocfile(pwcsdfname : windows_sys::core::PCWSTR, grfmode : u32, reserved : u32, ppstgopen : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgOpenPropStg(punk : * mut core::ffi::c_void, fmtid : *const windows_sys::core::GUID, grfflags : u32, dwreserved : u32, pppropstg : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgOpenStorage(pwcsname : windows_sys::core::PCWSTR, pstgpriority : * mut core::ffi::c_void, grfmode : super:: STGM, snbexclude : *const *const u16, reserved : u32, ppstgopen : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ole32.dll" "system" fn StgOpenStorageEx(pwcsname : windows_sys::core::PCWSTR, grfmode : super:: STGM, stgfmt : STGFMT, grfattrs : u32, pstgoptions : *mut STGOPTIONS, psecuritydescriptor : super::super::super::Security:: PSECURITY_DESCRIPTOR, riid : *const windows_sys::core::GUID, ppobjectopen : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgOpenStorageOnILockBytes(plkbyt : * mut core::ffi::c_void, pstgpriority : * mut core::ffi::c_void, grfmode : super:: STGM, snbexclude : *const *const u16, reserved : u32, ppstgopen : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgPropertyLengthAsVariant(pprop : *const SERIALIZEDPROPERTYVALUE, cbprop : u32, codepage : u16, breserved : u8) -> u32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn StgSerializePropVariant(ppropvar : *const PROPVARIANT, ppprop : *mut *mut SERIALIZEDPROPERTYVALUE, pcb : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn StgSetTimes(lpszname : windows_sys::core::PCWSTR, pctime : *const super::super::super::Foundation:: FILETIME, patime : *const super::super::super::Foundation:: FILETIME, pmtime : *const super::super::super::Foundation:: FILETIME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("propsys.dll" "system" fn VariantToPropVariant(pvar : *const super::super::Variant:: VARIANT, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// windows_link::link!("propsys.dll" "system" fn WinRTPropertyValueToPropVariant(punkpropertyvalue : * mut core::ffi::c_void, ppropvar : *mut PROPVARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn WriteClassStg(pstg : * mut core::ffi::c_void, rclsid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn WriteClassStm(pstm : * mut core::ffi::c_void, rclsid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn WriteFmtUserTypeStg(pstg : * mut core::ffi::c_void, cf : u16, lpszusertype : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BSTRBLOB {
//     pub cbSize: u32,
//     pub pData: *mut u8,
// }

// UNSUPPORTED Rust 221:1: declaration Impl has no candidate rule
// impl Default for BSTRBLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CABOOL {
//     pub cElems: u32,
//     pub pElems: *mut super::super::super::Foundation::VARIANT_BOOL,
// }

// UNSUPPORTED Rust 232:1: declaration Impl has no candidate rule
// impl Default for CABOOL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CABSTR {
//     pub cElems: u32,
//     pub pElems: *mut windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 243:1: declaration Impl has no candidate rule
// impl Default for CABSTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CABSTRBLOB {
//     pub cElems: u32,
//     pub pElems: *mut BSTRBLOB,
// }

// UNSUPPORTED Rust 254:1: declaration Impl has no candidate rule
// impl Default for CABSTRBLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAC {
//     pub cElems: u32,
//     pub pElems: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 265:1: declaration Impl has no candidate rule
// impl Default for CAC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CACLIPDATA {
//     pub cElems: u32,
//     pub pElems: *mut CLIPDATA,
// }

// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule
// impl Default for CACLIPDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CACLSID {
//     pub cElems: u32,
//     pub pElems: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule
// impl Default for CACLSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CACY {
//     pub cElems: u32,
//     pub pElems: *mut super::CY,
// }

// UNSUPPORTED Rust 298:1: declaration Impl has no candidate rule
// impl Default for CACY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 303:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CADATE {
//     pub cElems: u32,
//     pub pElems: *mut f64,
// }

// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule
// impl Default for CADATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 314:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CADBL {
//     pub cElems: u32,
//     pub pElems: *mut f64,
// }

// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule
// impl Default for CADBL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAFILETIME {
//     pub cElems: u32,
//     pub pElems: *mut super::super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 331:1: declaration Impl has no candidate rule
// impl Default for CAFILETIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAFLT {
//     pub cElems: u32,
//     pub pElems: *mut f32,
// }

// UNSUPPORTED Rust 342:1: declaration Impl has no candidate rule
// impl Default for CAFLT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 347:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAH {
//     pub cElems: u32,
//     pub pElems: *mut i64,
// }

// UNSUPPORTED Rust 353:1: declaration Impl has no candidate rule
// impl Default for CAH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 358:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAI {
//     pub cElems: u32,
//     pub pElems: *mut i16,
// }

// UNSUPPORTED Rust 364:1: declaration Impl has no candidate rule
// impl Default for CAI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAL {
//     pub cElems: u32,
//     pub pElems: *mut i32,
// }

// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule
// impl Default for CAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CALPSTR {
//     pub cElems: u32,
//     pub pElems: *mut windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 386:1: declaration Impl has no candidate rule
// impl Default for CALPSTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 391:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CALPWSTR {
//     pub cElems: u32,
//     pub pElems: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 397:1: declaration Impl has no candidate rule
// impl Default for CALPWSTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub struct CAPROPVARIANT {
//     pub cElems: u32,
//     pub pElems: *mut PROPVARIANT,
// }

// UNSUPPORTED Rust 409:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for CAPROPVARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 415:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CASCODE {
//     pub cElems: u32,
//     pub pElems: *mut i32,
// }

// UNSUPPORTED Rust 421:1: declaration Impl has no candidate rule
// impl Default for CASCODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 426:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAUB {
//     pub cElems: u32,
//     pub pElems: *mut u8,
// }

// UNSUPPORTED Rust 432:1: declaration Impl has no candidate rule
// impl Default for CAUB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAUH {
//     pub cElems: u32,
//     pub pElems: *mut u64,
// }

// UNSUPPORTED Rust 443:1: declaration Impl has no candidate rule
// impl Default for CAUH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 448:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAUI {
//     pub cElems: u32,
//     pub pElems: *mut u16,
// }

// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule
// impl Default for CAUI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAUL {
//     pub cElems: u32,
//     pub pElems: *mut u32,
// }

// UNSUPPORTED Rust 465:1: declaration Impl has no candidate rule
// impl Default for CAUL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CCH_MAX_PROPSTG_NAME`: UInt = 31u;
// UNSUPPORTED Rust 471:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLIPDATA {
//     pub cbSize: u32,
//     pub ulClipFmt: i32,
//     pub pClipData: *mut u8,
// }

// UNSUPPORTED Rust 478:1: declaration Impl has no candidate rule
// impl Default for CLIPDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CWCSTORAGENAME`: UInt = 32u;
// UNSUPPORTED Rust 484:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLESTREAM {
//     pub lpstbl: *mut OLESTREAMVTBL,
// }

// UNSUPPORTED Rust 489:1: declaration Impl has no candidate rule
// impl Default for OLESTREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OLESTREAMVTBL {
//     pub Get: isize,
//     pub Put: isize,
// }

public const val `PIDDI_THUMBNAIL`: Int = 2;
public const val `PIDDSI_BYTECOUNT`: UInt = 4u;
public const val `PIDDSI_CATEGORY`: UInt = 2u;
public const val `PIDDSI_COMPANY`: UInt = 15u;
public const val `PIDDSI_DOCPARTS`: UInt = 13u;
public const val `PIDDSI_HEADINGPAIR`: UInt = 12u;
public const val `PIDDSI_HIDDENCOUNT`: UInt = 9u;
public const val `PIDDSI_LINECOUNT`: UInt = 5u;
public const val `PIDDSI_LINKSDIRTY`: UInt = 16u;
public const val `PIDDSI_MANAGER`: UInt = 14u;
public const val `PIDDSI_MMCLIPCOUNT`: UInt = 10u;
public const val `PIDDSI_NOTECOUNT`: UInt = 8u;
public const val `PIDDSI_PARCOUNT`: UInt = 6u;
public const val `PIDDSI_PRESFORMAT`: UInt = 3u;
public const val `PIDDSI_SCALE`: UInt = 11u;
public const val `PIDDSI_SLIDECOUNT`: UInt = 7u;
public const val `PIDMSI_COPYRIGHT`: Int = 11;
public const val `PIDMSI_EDITOR`: Int = 2;
public const val `PIDMSI_OWNER`: Int = 8;
public const val `PIDMSI_PRODUCTION`: Int = 10;
public const val `PIDMSI_PROJECT`: Int = 6;
public const val `PIDMSI_RATING`: Int = 9;
public const val `PIDMSI_SEQUENCE_NO`: Int = 5;
public const val `PIDMSI_SOURCE`: Int = 4;
public const val `PIDMSI_STATUS`: Int = 7;
public const val `PIDMSI_STATUS_DRAFT`: `PIDMSI_STATUS_VALUE` = 3;
public const val `PIDMSI_STATUS_EDIT`: `PIDMSI_STATUS_VALUE` = 5;
public const val `PIDMSI_STATUS_FINAL`: `PIDMSI_STATUS_VALUE` = 8;
public const val `PIDMSI_STATUS_INPROGRESS`: `PIDMSI_STATUS_VALUE` = 4;
public const val `PIDMSI_STATUS_NEW`: `PIDMSI_STATUS_VALUE` = 1;
public const val `PIDMSI_STATUS_NORMAL`: `PIDMSI_STATUS_VALUE` = 0;
public const val `PIDMSI_STATUS_OTHER`: `PIDMSI_STATUS_VALUE` = 32767;
public const val `PIDMSI_STATUS_PRELIM`: `PIDMSI_STATUS_VALUE` = 2;
public const val `PIDMSI_STATUS_PROOF`: `PIDMSI_STATUS_VALUE` = 7;
public const val `PIDMSI_STATUS_REVIEW`: `PIDMSI_STATUS_VALUE` = 6;
public typealias `PIDMSI_STATUS_VALUE` = Int;
public const val `PIDMSI_SUPPLIER`: Int = 3;
public const val `PIDSI_APPNAME`: Int = 18;
public const val `PIDSI_AUTHOR`: Int = 4;
public const val `PIDSI_CHARCOUNT`: Int = 16;
public const val `PIDSI_COMMENTS`: Int = 6;
public const val `PIDSI_CREATE_DTM`: Int = 12;
public const val `PIDSI_DOC_SECURITY`: Int = 19;
public const val `PIDSI_EDITTIME`: Int = 10;
public const val `PIDSI_KEYWORDS`: Int = 5;
public const val `PIDSI_LASTAUTHOR`: Int = 8;
public const val `PIDSI_LASTPRINTED`: Int = 11;
public const val `PIDSI_LASTSAVE_DTM`: Int = 13;
public const val `PIDSI_PAGECOUNT`: Int = 14;
public const val `PIDSI_REVNUMBER`: Int = 9;
public const val `PIDSI_SUBJECT`: Int = 3;
public const val `PIDSI_TEMPLATE`: Int = 7;
public const val `PIDSI_THUMBNAIL`: Int = 17;
public const val `PIDSI_TITLE`: Int = 2;
public const val `PIDSI_WORDCOUNT`: Int = 15;
public const val `PID_BEHAVIOR`: UInt = 2147483651u;
public const val `PID_CODEPAGE`: UInt = 1u;
public const val `PID_DICTIONARY`: UInt = 0u;
public const val `PID_FIRST_NAME_DEFAULT`: UInt = 4095u;
public const val `PID_FIRST_USABLE`: UInt = 2u;
public const val `PID_ILLEGAL`: UInt = 4294967295u;
public const val `PID_LOCALE`: UInt = 2147483648u;
public const val `PID_MAX_READONLY`: UInt = 3221225471u;
public const val `PID_MIN_READONLY`: UInt = 2147483648u;
public const val `PID_MODIFY_TIME`: UInt = 2147483649u;
public const val `PID_SECURITY`: UInt = 2147483650u;
// UNSUPPORTED Rust 566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub struct PROPBAG2 {
//     pub dwType: u32,
//     pub vt: super::super::Variant::VARENUM,
//     pub cfType: u16,
//     pub dwHint: u32,
//     pub pstrName: windows_sys::core::PWSTR,
//     pub clsid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPBAG2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROPSETFLAG_ANSI`: UInt = 2u;
public const val `PROPSETFLAG_CASE_SENSITIVE`: UInt = 8u;
public const val `PROPSETFLAG_DEFAULT`: UInt = 0u;
public const val `PROPSETFLAG_NONSIMPLE`: UInt = 1u;
public const val `PROPSETFLAG_UNBUFFERED`: UInt = 4u;
public const val `PROPSETHDR_OSVERSION_UNKNOWN`: UInt = 4294967295u;
public const val `PROPSET_BEHAVIOR_CASE_SENSITIVE`: UInt = 1u;
// UNSUPPORTED Rust 590:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROPSPEC {
//     pub ulKind: PROPSPEC_KIND,
//     pub Anonymous: PROPSPEC_0,
// }

// UNSUPPORTED Rust 596:1: declaration Impl has no candidate rule
// impl Default for PROPSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 601:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROPSPEC_0 {
//     pub propid: u32,
//     pub lpwstr: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 607:1: declaration Impl has no candidate rule
// impl Default for PROPSPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PROPSPEC_KIND` = UInt;
// UNSUPPORTED Rust 613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub struct PROPVARIANT {
//     pub Anonymous: PROPVARIANT_0,
// }

// UNSUPPORTED Rust 619:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 625:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub union PROPVARIANT_0 {
//     pub Anonymous: PROPVARIANT_0_0,
//     pub decVal: super::super::super::Foundation::DECIMAL,
// }

// UNSUPPORTED Rust 632:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub struct PROPVARIANT_0_0 {
//     pub vt: super::super::Variant::VARENUM,
//     pub wReserved1: u16,
//     pub wReserved2: u16,
//     pub wReserved3: u16,
//     pub Anonymous: PROPVARIANT_0_0_0,
// }

// UNSUPPORTED Rust 648:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 654:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub union PROPVARIANT_0_0_0 {
//     pub cVal: i8,
//     pub bVal: u8,
//     pub iVal: i16,
//     pub uiVal: u16,
//     pub lVal: i32,
//     pub ulVal: u32,
//     pub intVal: i32,
//     pub uintVal: u32,
//     pub hVal: i64,
//     pub uhVal: u64,
//     pub fltVal: f32,
//     pub dblVal: f64,
//     pub boolVal: super::super::super::Foundation::VARIANT_BOOL,
//     pub __OBSOLETE__VARIANT_BOOL: super::super::super::Foundation::VARIANT_BOOL,
//     pub scode: i32,
//     pub cyVal: super::CY,
//     pub date: f64,
//     pub filetime: super::super::super::Foundation::FILETIME,
//     pub puuid: *mut windows_sys::core::GUID,
//     pub pclipdata: *mut CLIPDATA,
//     pub bstrVal: windows_sys::core::BSTR,
//     pub bstrblobVal: BSTRBLOB,
//     pub blob: super::BLOB,
//     pub pszVal: windows_sys::core::PSTR,
//     pub pwszVal: windows_sys::core::PWSTR,
//     pub punkVal: *mut core::ffi::c_void,
//     pub pdispVal: *mut core::ffi::c_void,
//     pub pStream: *mut core::ffi::c_void,
//     pub pStorage: *mut core::ffi::c_void,
//     pub pVersionedStream: *mut VERSIONEDSTREAM,
//     pub parray: *mut super::SAFEARRAY,
//     pub cac: CAC,
//     pub caub: CAUB,
//     pub cai: CAI,
//     pub caui: CAUI,
//     pub cal: CAL,
//     pub caul: CAUL,
//     pub cah: CAH,
//     pub cauh: CAUH,
//     pub caflt: CAFLT,
//     pub cadbl: CADBL,
//     pub cabool: CABOOL,
//     pub cascode: CASCODE,
//     pub cacy: CACY,
//     pub cadate: CADATE,
//     pub cafiletime: CAFILETIME,
//     pub cauuid: CACLSID,
//     pub caclipdata: CACLIPDATA,
//     pub cabstr: CABSTR,
//     pub cabstrblob: CABSTRBLOB,
//     pub calpstr: CALPSTR,
//     pub calpwstr: CALPWSTR,
//     pub capropvar: CAPROPVARIANT,
//     pub pcVal: windows_sys::core::PSTR,
//     pub pbVal: *mut u8,
//     pub piVal: *mut i16,
//     pub puiVal: *mut u16,
//     pub plVal: *mut i32,
//     pub pulVal: *mut u32,
//     pub pintVal: *mut i32,
//     pub puintVal: *mut u32,
//     pub pfltVal: *mut f32,
//     pub pdblVal: *mut f64,
//     pub pboolVal: *mut super::super::super::Foundation::VARIANT_BOOL,
//     pub pdecVal: *mut super::super::super::Foundation::DECIMAL,
//     pub pscode: *mut i32,
//     pub pcyVal: *mut super::CY,
//     pub pdate: *mut f64,
//     pub pbstrVal: *mut windows_sys::core::BSTR,
//     pub ppunkVal: *mut *mut core::ffi::c_void,
//     pub ppdispVal: *mut *mut core::ffi::c_void,
//     pub pparray: *mut *mut super::SAFEARRAY,
//     pub pvarVal: *mut PROPVARIANT,
// }

// UNSUPPORTED Rust 732:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PROPVARIANT_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PROPVAR_CHANGE_FLAGS` = Int;
public typealias `PROPVAR_COMPARE_FLAGS` = Int;
public typealias `PROPVAR_COMPARE_UNIT` = Int;
public const val `PRSPEC_INVALID`: UInt = 4294967295u;
public const val `PRSPEC_LPWSTR`: `PROPSPEC_KIND` = 0u;
public const val `PRSPEC_PROPID`: `PROPSPEC_KIND` = 1u;
public const val `PVCF_DEFAULT`: `PROPVAR_COMPARE_FLAGS` = 0;
public const val `PVCF_DIGITSASNUMBERS_CASESENSITIVE`: `PROPVAR_COMPARE_FLAGS` = 32;
public const val `PVCF_TREATEMPTYASGREATERTHAN`: `PROPVAR_COMPARE_FLAGS` = 1;
public const val `PVCF_USESTRCMP`: `PROPVAR_COMPARE_FLAGS` = 2;
public const val `PVCF_USESTRCMPC`: `PROPVAR_COMPARE_FLAGS` = 4;
public const val `PVCF_USESTRCMPI`: `PROPVAR_COMPARE_FLAGS` = 8;
public const val `PVCF_USESTRCMPIC`: `PROPVAR_COMPARE_FLAGS` = 16;
public const val `PVCHF_ALPHABOOL`: `PROPVAR_CHANGE_FLAGS` = 2;
public const val `PVCHF_DEFAULT`: `PROPVAR_CHANGE_FLAGS` = 0;
public const val `PVCHF_LOCALBOOL`: `PROPVAR_CHANGE_FLAGS` = 8;
public const val `PVCHF_NOHEXSTRING`: `PROPVAR_CHANGE_FLAGS` = 16;
public const val `PVCHF_NOUSEROVERRIDE`: `PROPVAR_CHANGE_FLAGS` = 4;
public const val `PVCHF_NOVALUEPROP`: `PROPVAR_CHANGE_FLAGS` = 1;
public const val `PVCU_DAY`: `PROPVAR_COMPARE_UNIT` = 4;
public const val `PVCU_DEFAULT`: `PROPVAR_COMPARE_UNIT` = 0;
public const val `PVCU_HOUR`: `PROPVAR_COMPARE_UNIT` = 3;
public const val `PVCU_MINUTE`: `PROPVAR_COMPARE_UNIT` = 2;
public const val `PVCU_MONTH`: `PROPVAR_COMPARE_UNIT` = 5;
public const val `PVCU_SECOND`: `PROPVAR_COMPARE_UNIT` = 1;
public const val `PVCU_YEAR`: `PROPVAR_COMPARE_UNIT` = 6;
// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RemSNB {
//     pub ulCntStr: u32,
//     pub ulCntChar: u32,
//     pub rgString: [u16; 1],
// }

// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule
// impl Default for RemSNB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 776:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERIALIZEDPROPERTYVALUE {
//     pub dwType: u32,
//     pub rgb: [u8; 1],
// }

// UNSUPPORTED Rust 782:1: declaration Impl has no candidate rule
// impl Default for SERIALIZEDPROPERTYVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 787:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STATPROPSETSTG {
//     pub fmtid: windows_sys::core::GUID,
//     pub clsid: windows_sys::core::GUID,
//     pub grfFlags: u32,
//     pub mtime: super::super::super::Foundation::FILETIME,
//     pub ctime: super::super::super::Foundation::FILETIME,
//     pub atime: super::super::super::Foundation::FILETIME,
//     pub dwOSVersion: u32,
// }

// UNSUPPORTED Rust 798:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub struct STATPROPSTG {
//     pub lpwstrName: windows_sys::core::PWSTR,
//     pub propid: u32,
//     pub vt: super::super::Variant::VARENUM,
// }

// UNSUPPORTED Rust 806:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for STATPROPSTG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STGFMT` = UInt;
public const val `STGFMT_ANY`: `STGFMT` = 4u;
public const val `STGFMT_DOCFILE`: `STGFMT` = 5u;
public const val `STGFMT_DOCUMENT`: `STGFMT` = 0u;
public const val `STGFMT_FILE`: `STGFMT` = 3u;
public const val `STGFMT_NATIVE`: `STGFMT` = 1u;
public const val `STGFMT_STORAGE`: `STGFMT` = 0u;
public typealias `STGMOVE` = Int;
public const val `STGMOVE_COPY`: `STGMOVE` = 1;
public const val `STGMOVE_MOVE`: `STGMOVE` = 0;
public const val `STGMOVE_SHALLOWCOPY`: `STGMOVE` = 2;
// UNSUPPORTED Rust 823:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STGOPTIONS {
//     pub usVersion: u16,
//     pub reserved: u16,
//     pub ulSectorSize: u32,
//     pub pwcsTemplateFile: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule
// impl Default for STGOPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STGOPTIONS_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 837:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VERSIONEDSTREAM {
//     pub guidVersion: windows_sys::core::GUID,
//     pub pStream: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 843:1: declaration Impl has no candidate rule
// impl Default for VERSIONEDSTREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

