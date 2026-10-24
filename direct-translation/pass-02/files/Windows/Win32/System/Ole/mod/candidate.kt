// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn BstrFromVector(psa : *const super::Com:: SAFEARRAY, pbstr : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn ClearCustData(pcustdata : *mut super::Com:: CUSTDATA));

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn CreateDispTypeInfo(pidata : *mut INTERFACEDATA, lcid : u32, pptinfo : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn CreateErrorInfo(pperrinfo : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CreateOleAdviseHolder(ppoaholder : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn CreateStdDispatch(punkouter : * mut core::ffi::c_void, pvthis : *mut core::ffi::c_void, ptinfo : * mut core::ffi::c_void, ppunkstddisp : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn CreateTypeLib(syskind : super::Com:: SYSKIND, szfile : windows_sys::core::PCWSTR, ppctlib : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn CreateTypeLib2(syskind : super::Com:: SYSKIND, szfile : windows_sys::core::PCWSTR, ppctlib : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn DispCallFunc(pvinstance : *const core::ffi::c_void, ovft : usize, cc : super::Com:: CALLCONV, vtreturn : super::Variant:: VARENUM, cactuals : u32, prgvt : *const u16, prgpvarg : *const *const super::Variant:: VARIANT, pvargresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn DispGetIDsOfNames(ptinfo : * mut core::ffi::c_void, rgsznames : *const windows_sys::core::PCWSTR, cnames : u32, rgdispid : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn DispGetParam(pdispparams : *const super::Com:: DISPPARAMS, position : u32, vttarg : super::Variant:: VARENUM, pvarresult : *mut super::Variant:: VARIANT, puargerr : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn DispInvoke(_this : *mut core::ffi::c_void, ptinfo : * mut core::ffi::c_void, dispidmember : i32, wflags : u16, pparams : *mut super::Com:: DISPPARAMS, pvarresult : *mut super::Variant:: VARIANT, pexcepinfo : *mut super::Com:: EXCEPINFO, puargerr : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn DoDragDrop(pdataobj : * mut core::ffi::c_void, pdropsource : * mut core::ffi::c_void, dwokeffects : DROPEFFECT, pdweffect : *mut DROPEFFECT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn GetActiveObject(rclsid : *const windows_sys::core::GUID, pvreserved : *mut core::ffi::c_void, ppunk : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn GetAltMonthNames(lcid : u32, prgp : *mut *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn GetRecordInfoFromGuids(rguidtypelib : *const windows_sys::core::GUID, uvermajor : u32, uverminor : u32, lcid : u32, rguidtypeinfo : *const windows_sys::core::GUID, pprecinfo : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn GetRecordInfoFromTypeInfo(ptypeinfo : * mut core::ffi::c_void, pprecinfo : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HRGN_UserFree(param0 : *const u32, param1 : *const super::super::Graphics::Gdi:: HRGN));

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("api-ms-win-core-marshal-l1-1-0.dll" "system" fn HRGN_UserFree64(param0 : *const u32, param1 : *const super::super::Graphics::Gdi:: HRGN));

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HRGN_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::Graphics::Gdi:: HRGN) -> *mut u8);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("api-ms-win-core-marshal-l1-1-0.dll" "system" fn HRGN_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::Graphics::Gdi:: HRGN) -> *mut u8);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HRGN_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::Graphics::Gdi:: HRGN) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("api-ms-win-core-marshal-l1-1-0.dll" "system" fn HRGN_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::Graphics::Gdi:: HRGN) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HRGN_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::Graphics::Gdi:: HRGN) -> *mut u8);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("api-ms-win-core-marshal-l1-1-0.dll" "system" fn HRGN_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::Graphics::Gdi:: HRGN) -> *mut u8);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn IsAccelerator(haccel : super::super::UI::WindowsAndMessaging:: HACCEL, caccelentries : i32, lpmsg : *const super::super::UI::WindowsAndMessaging:: MSG, lpwcmd : *mut u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn LHashValOfNameSys(syskind : super::Com:: SYSKIND, lcid : u32, szname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn LHashValOfNameSysA(syskind : super::Com:: SYSKIND, lcid : u32, szname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn LoadRegTypeLib(rguid : *const windows_sys::core::GUID, wvermajor : u16, wverminor : u16, lcid : u32, pptlib : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn LoadTypeLib(szfile : windows_sys::core::PCWSTR, pptlib : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn LoadTypeLibEx(szfile : windows_sys::core::PCWSTR, regkind : REGKIND, pptlib : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn OaBuildVersion() -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn OaEnablePerUserTLibRegistration());

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleBuildVersion() -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleConvertOLESTREAMToIStorage2(lpolestream : *const super::Com::StructuredStorage:: OLESTREAM, pstg : * mut core::ffi::c_void, ptd : *const super::Com:: DVTARGETDEVICE, opt : u32, pvcallbackcontext : *const core::ffi::c_void, pqueryconvertolelinkcallback : OLESTREAMQUERYCONVERTOLELINKCALLBACK) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn OleConvertOLESTREAMToIStorageEx2(polestm : *const super::Com::StructuredStorage:: OLESTREAM, pstg : * mut core::ffi::c_void, pcfformat : *mut u16, plwwidth : *mut i32, plheight : *mut i32, pdwsize : *mut u32, pmedium : *mut super::Com:: STGMEDIUM, opt : u32, pvcallbackcontext : *const core::ffi::c_void, pqueryconvertolelinkcallback : OLESTREAMQUERYCONVERTOLELINKCALLBACK) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreate(rclsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, renderopt : u32, pformatetc : *const super::Com:: FORMATETC, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleCreateDefaultHandler(clsid : *const windows_sys::core::GUID, punkouter : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, lplpobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleCreateEmbeddingHelper(clsid : *const windows_sys::core::GUID, punkouter : * mut core::ffi::c_void, flags : EMBDHLP_FLAGS, pcf : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, lplpobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateEx(rclsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, dwflags : OLECREATE, renderopt : u32, cformats : u32, rgadvf : *const u32, rgformatetc : *const super::Com:: FORMATETC, lpadvisesink : * mut core::ffi::c_void, rgdwconnection : *mut u32, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn OleCreateFontIndirect(lpfontdesc : *const FONTDESC, riid : *const windows_sys::core::GUID, lplpvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateFromData(psrcdataobj : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, renderopt : u32, pformatetc : *const super::Com:: FORMATETC, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateFromDataEx(psrcdataobj : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, dwflags : OLECREATE, renderopt : u32, cformats : u32, rgadvf : *const u32, rgformatetc : *const super::Com:: FORMATETC, lpadvisesink : * mut core::ffi::c_void, rgdwconnection : *mut u32, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateFromFile(rclsid : *const windows_sys::core::GUID, lpszfilename : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, renderopt : u32, lpformatetc : *const super::Com:: FORMATETC, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateFromFileEx(rclsid : *const windows_sys::core::GUID, lpszfilename : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, dwflags : OLECREATE, renderopt : u32, cformats : u32, rgadvf : *const u32, rgformatetc : *const super::Com:: FORMATETC, lpadvisesink : * mut core::ffi::c_void, rgdwconnection : *mut u32, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateLink(pmklinksrc : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, renderopt : u32, lpformatetc : *const super::Com:: FORMATETC, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateLinkEx(pmklinksrc : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, dwflags : OLECREATE, renderopt : u32, cformats : u32, rgadvf : *const u32, rgformatetc : *const super::Com:: FORMATETC, lpadvisesink : * mut core::ffi::c_void, rgdwconnection : *mut u32, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateLinkFromData(psrcdataobj : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, renderopt : u32, pformatetc : *const super::Com:: FORMATETC, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateLinkFromDataEx(psrcdataobj : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, dwflags : OLECREATE, renderopt : u32, cformats : u32, rgadvf : *const u32, rgformatetc : *const super::Com:: FORMATETC, lpadvisesink : * mut core::ffi::c_void, rgdwconnection : *mut u32, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateLinkToFile(lpszfilename : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, renderopt : u32, lpformatetc : *const super::Com:: FORMATETC, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateLinkToFileEx(lpszfilename : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, dwflags : OLECREATE, renderopt : u32, cformats : u32, rgadvf : *const u32, rgformatetc : *const super::Com:: FORMATETC, lpadvisesink : * mut core::ffi::c_void, rgdwconnection : *mut u32, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn OleCreateMenuDescriptor(hmenucombined : super::super::UI::WindowsAndMessaging:: HMENU, lpmenuwidths : *const OLEMENUGROUPWIDTHS) -> isize);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("oleaut32.dll" "system" fn OleCreatePictureIndirect(lppictdesc : *const PICTDESC, riid : *const windows_sys::core::GUID, fown : windows_sys::core::BOOL, lplpvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn OleCreatePropertyFrame(hwndowner : super::super::Foundation:: HWND, x : u32, y : u32, lpszcaption : windows_sys::core::PCWSTR, cobjects : u32, ppunk : *const * mut core::ffi::c_void, cpages : u32, ppageclsid : *const windows_sys::core::GUID, lcid : u32, dwreserved : u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn OleCreatePropertyFrameIndirect(lpparams : *const OCPFIPARAMS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleCreateStaticFromData(psrcdataobj : * mut core::ffi::c_void, iid : *const windows_sys::core::GUID, renderopt : u32, pformatetc : *const super::Com:: FORMATETC, pclientsite : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleDestroyMenuDescriptor(holemenu : isize) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleDoAutoConvert(pstg : * mut core::ffi::c_void, pclsidnew : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn OleDraw(punknown : * mut core::ffi::c_void, dwaspect : u32, hdcdraw : super::super::Graphics::Gdi:: HDC, lprcbounds : *const super::super::Foundation:: RECT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Memory")]
// windows_link::link!("ole32.dll" "system" fn OleDuplicateData(hsrc : super::super::Foundation:: HANDLE, cfformat : CLIPBOARD_FORMAT, uiflags : super::Memory:: GLOBAL_ALLOC_FLAGS) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleFlushClipboard() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleGetAutoConvert(clsidold : *const windows_sys::core::GUID, pclsidnew : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleGetClipboard(ppdataobj : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleGetClipboardWithEnterpriseInfo(dataobject : *mut * mut core::ffi::c_void, dataenterpriseid : *mut windows_sys::core::PWSTR, sourcedescription : *mut windows_sys::core::PWSTR, targetdescription : *mut windows_sys::core::PWSTR, datadescription : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleGetIconOfClass(rclsid : *const windows_sys::core::GUID, lpszlabel : windows_sys::core::PCWSTR, fusetypeaslabel : windows_sys::core::BOOL) -> super::super::Foundation:: HGLOBAL);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleGetIconOfFile(lpszpath : windows_sys::core::PCWSTR, fusefileaslabel : windows_sys::core::BOOL) -> super::super::Foundation:: HGLOBAL);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("oleaut32.dll" "system" fn OleIconToCursor(hinstexe : super::super::Foundation:: HINSTANCE, hicon : super::super::UI::WindowsAndMessaging:: HICON) -> super::super::UI::WindowsAndMessaging:: HCURSOR);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleInitialize(pvreserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleIsCurrentClipboard(pdataobj : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleIsRunning(pobject : * mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleLoad(pstg : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, pclientsite : * mut core::ffi::c_void, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleLoadFromStream(pstm : * mut core::ffi::c_void, iidinterface : *const windows_sys::core::GUID, ppvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn OleLoadPicture(lpstream : * mut core::ffi::c_void, lsize : i32, frunmode : windows_sys::core::BOOL, riid : *const windows_sys::core::GUID, lplpvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn OleLoadPictureEx(lpstream : * mut core::ffi::c_void, lsize : i32, frunmode : windows_sys::core::BOOL, riid : *const windows_sys::core::GUID, xsizedesired : u32, ysizedesired : u32, dwflags : LOAD_PICTURE_FLAGS, lplpvobj : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn OleLoadPictureFile(varfilename : super::Variant:: VARIANT, lplpdisppicture : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn OleLoadPictureFileEx(varfilename : super::Variant:: VARIANT, xsizedesired : u32, ysizedesired : u32, dwflags : LOAD_PICTURE_FLAGS, lplpdisppicture : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn OleLoadPicturePath(szurlorpath : windows_sys::core::PCWSTR, punkcaller : * mut core::ffi::c_void, dwreserved : u32, clrreserved : u32, riid : *const windows_sys::core::GUID, ppvret : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleLockRunning(punknown : * mut core::ffi::c_void, flock : windows_sys::core::BOOL, flastunlockcloses : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn OleMetafilePictFromIconAndLabel(hicon : super::super::UI::WindowsAndMessaging:: HICON, lpszlabel : windows_sys::core::PCWSTR, lpszsourcefile : windows_sys::core::PCWSTR, iiconindex : u32) -> super::super::Foundation:: HGLOBAL);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleNoteObjectVisible(punknown : * mut core::ffi::c_void, fvisible : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleQueryCreateFromData(psrcdataobject : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleQueryLinkFromData(psrcdataobject : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleRegEnumFormatEtc(clsid : *const windows_sys::core::GUID, dwdirection : u32, ppenum : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleRegEnumVerbs(clsid : *const windows_sys::core::GUID, ppenum : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleRegGetMiscStatus(clsid : *const windows_sys::core::GUID, dwaspect : u32, pdwstatus : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleRegGetUserType(clsid : *const windows_sys::core::GUID, dwformoftype : u32, pszusertype : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleRun(punknown : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("ole32.dll" "system" fn OleSave(pps : * mut core::ffi::c_void, pstg : * mut core::ffi::c_void, fsameasload : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn OleSavePictureFile(lpdisppicture : * mut core::ffi::c_void, bstrfilename : windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleSaveToStream(ppstm : * mut core::ffi::c_void, pstm : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleSetAutoConvert(clsidold : *const windows_sys::core::GUID, clsidnew : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("ole32.dll" "system" fn OleSetClipboard(pdataobj : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleSetContainedObject(punknown : * mut core::ffi::c_void, fcontained : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleSetMenuDescriptor(holemenu : isize, hwndframe : super::super::Foundation:: HWND, hwndactiveobject : super::super::Foundation:: HWND, lpframe : * mut core::ffi::c_void, lpactiveobj : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn OleTranslateAccelerator(lpframe : * mut core::ffi::c_void, lpframeinfo : *const OLEINPLACEFRAMEINFO, lpmsg : *const super::super::UI::WindowsAndMessaging:: MSG) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("oleaut32.dll" "system" fn OleTranslateColor(clr : u32, hpal : super::super::Graphics::Gdi:: HPALETTE, lpcolorref : *mut super::super::Foundation:: COLORREF) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("oledlg.dll" "system" fn OleUIAddVerbMenuA(lpoleobj : * mut core::ffi::c_void, lpszshorttype : windows_sys::core::PCSTR, hmenu : super::super::UI::WindowsAndMessaging:: HMENU, upos : u32, uidverbmin : u32, uidverbmax : u32, baddconvert : windows_sys::core::BOOL, idconvert : u32, lphmenu : *mut super::super::UI::WindowsAndMessaging:: HMENU) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("oledlg.dll" "system" fn OleUIAddVerbMenuW(lpoleobj : * mut core::ffi::c_void, lpszshorttype : windows_sys::core::PCWSTR, hmenu : super::super::UI::WindowsAndMessaging:: HMENU, upos : u32, uidverbmin : u32, uidverbmax : u32, baddconvert : windows_sys::core::BOOL, idconvert : u32, lphmenu : *mut super::super::UI::WindowsAndMessaging:: HMENU) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Media")]
// windows_link::link!("oledlg.dll" "system" fn OleUIBusyA(param0 : *const OLEUIBUSYA) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Media")]
// windows_link::link!("oledlg.dll" "system" fn OleUIBusyW(param0 : *const OLEUIBUSYW) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUICanConvertOrActivateAs(rclsid : *const windows_sys::core::GUID, fislinkedobject : windows_sys::core::BOOL, wformat : u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIChangeIconA(param0 : *const OLEUICHANGEICONA) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIChangeIconW(param0 : *const OLEUICHANGEICONW) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// windows_link::link!("oledlg.dll" "system" fn OleUIChangeSourceA(param0 : *const OLEUICHANGESOURCEA) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// windows_link::link!("oledlg.dll" "system" fn OleUIChangeSourceW(param0 : *const OLEUICHANGESOURCEW) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIConvertA(param0 : *const OLEUICONVERTA) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIConvertW(param0 : *const OLEUICONVERTW) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIEditLinksA(param0 : *const OLEUIEDITLINKSA) -> u32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIEditLinksW(param0 : *const OLEUIEDITLINKSW) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("oledlg.dll" "system" fn OleUIInsertObjectA(param0 : *const OLEUIINSERTOBJECTA) -> u32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("oledlg.dll" "system" fn OleUIInsertObjectW(param0 : *const OLEUIINSERTOBJECTW) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("oledlg.dll" "system" fn OleUIObjectPropertiesA(param0 : *const OLEUIOBJECTPROPSA) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("oledlg.dll" "system" fn OleUIObjectPropertiesW(param0 : *const OLEUIOBJECTPROPSW) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oledlg.dll" "system" fn OleUIPasteSpecialA(param0 : *const OLEUIPASTESPECIALA) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oledlg.dll" "system" fn OleUIPasteSpecialW(param0 : *const OLEUIPASTESPECIALW) -> u32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "C" fn OleUIPromptUserA(ntemplate : i32, hwndparent : super::super::Foundation:: HWND, ...) -> i32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "C" fn OleUIPromptUserW(ntemplate : i32, hwndparent : super::super::Foundation:: HWND, ...) -> i32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIUpdateLinksA(lpoleuilinkcntr : * mut core::ffi::c_void, hwndparent : super::super::Foundation:: HWND, lpsztitle : windows_sys::core::PCSTR, clinks : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("oledlg.dll" "system" fn OleUIUpdateLinksW(lpoleuilinkcntr : * mut core::ffi::c_void, hwndparent : super::super::Foundation:: HWND, lpsztitle : windows_sys::core::PCWSTR, clinks : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn OleUninitialize());

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn QueryPathOfRegTypeLib(guid : *const windows_sys::core::GUID, wmaj : u16, wmin : u16, lcid : u32, lpbstrpathname : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn RegisterActiveObject(punk : * mut core::ffi::c_void, rclsid : *const windows_sys::core::GUID, dwflags : ACTIVEOBJECT_FLAGS, pdwregister : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn RegisterDragDrop(hwnd : super::super::Foundation:: HWND, pdroptarget : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn RegisterTypeLib(ptlib : * mut core::ffi::c_void, szfullpath : windows_sys::core::PCWSTR, szhelpdir : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn RegisterTypeLibForUser(ptlib : * mut core::ffi::c_void, szfullpath : windows_sys::core::PCWSTR, szhelpdir : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn ReleaseStgMedium(param0 : *mut super::Com:: STGMEDIUM));

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn RevokeActiveObject(dwregister : u32, pvreserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn RevokeDragDrop(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayAccessData(psa : *const super::Com:: SAFEARRAY, ppvdata : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayAddRef(psa : *const super::Com:: SAFEARRAY, ppdatatorelease : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayAllocData(psa : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayAllocDescriptor(cdims : u32, ppsaout : *mut *mut super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayAllocDescriptorEx(vt : super::Variant:: VARENUM, cdims : u32, ppsaout : *mut *mut super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayCopy(psa : *const super::Com:: SAFEARRAY, ppsaout : *mut *mut super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayCopyData(psasource : *const super::Com:: SAFEARRAY, psatarget : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayCreate(vt : super::Variant:: VARENUM, cdims : u32, rgsabound : *const super::Com:: SAFEARRAYBOUND) -> *mut super::Com:: SAFEARRAY);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayCreateEx(vt : super::Variant:: VARENUM, cdims : u32, rgsabound : *const super::Com:: SAFEARRAYBOUND, pvextra : *const core::ffi::c_void) -> *mut super::Com:: SAFEARRAY);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayCreateVector(vt : super::Variant:: VARENUM, llbound : i32, celements : u32) -> *mut super::Com:: SAFEARRAY);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayCreateVectorEx(vt : super::Variant:: VARENUM, llbound : i32, celements : u32, pvextra : *const core::ffi::c_void) -> *mut super::Com:: SAFEARRAY);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayDestroy(psa : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayDestroyData(psa : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayDestroyDescriptor(psa : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetDim(psa : *const super::Com:: SAFEARRAY) -> u32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetElement(psa : *const super::Com:: SAFEARRAY, rgindices : *const i32, pv : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetElemsize(psa : *const super::Com:: SAFEARRAY) -> u32);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetIID(psa : *const super::Com:: SAFEARRAY, pguid : *mut windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetLBound(psa : *const super::Com:: SAFEARRAY, ndim : u32, pllbound : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetRecordInfo(psa : *const super::Com:: SAFEARRAY, prinfo : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetUBound(psa : *const super::Com:: SAFEARRAY, ndim : u32, plubound : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayGetVartype(psa : *const super::Com:: SAFEARRAY, pvt : *mut super::Variant:: VARENUM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayLock(psa : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayPtrOfIndex(psa : *const super::Com:: SAFEARRAY, rgindices : *const i32, ppvdata : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayPutElement(psa : *const super::Com:: SAFEARRAY, rgindices : *const i32, pv : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayRedim(psa : *mut super::Com:: SAFEARRAY, psaboundnew : *const super::Com:: SAFEARRAYBOUND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayReleaseData(pdata : *const core::ffi::c_void));

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayReleaseDescriptor(psa : *const super::Com:: SAFEARRAY));

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArraySetIID(psa : *const super::Com:: SAFEARRAY, guid : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArraySetRecordInfo(psa : *const super::Com:: SAFEARRAY, prinfo : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayUnaccessData(psa : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn SafeArrayUnlock(psa : *const super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn UnRegisterTypeLib(libid : *const windows_sys::core::GUID, wvermajor : u16, wverminor : u16, lcid : u32, syskind : super::Com:: SYSKIND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn UnRegisterTypeLibForUser(libid : *const windows_sys::core::GUID, wmajorvernum : u16, wminorvernum : u16, lcid : u32, syskind : super::Com:: SYSKIND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarAbs(pvarin : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarAdd(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarAnd(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromCy(cyin : super::Com:: CY, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromDate(datein : f64, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromDec(pdecin : *const super::super::Foundation:: DECIMAL, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromI1(cin : i8, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromI2(sin : i16, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromI4(lin : i32, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromI8(i64in : i64, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromR4(fltin : f32, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromR8(dblin : f64, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromUI1(bin : u8, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromUI2(uiin : u16, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromUI4(ulin : u32, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBoolFromUI8(i64in : u64, pboolout : *mut super::super::Foundation:: VARIANT_BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrCat(bstrleft : windows_sys::core::BSTR, bstrright : windows_sys::core::BSTR, pbstrresult : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrCmp(bstrleft : windows_sys::core::BSTR, bstrright : windows_sys::core::BSTR, lcid : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromBool(boolin : super::super::Foundation:: VARIANT_BOOL, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromCy(cyin : super::Com:: CY, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromDate(datein : f64, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromDec(pdecin : *const super::super::Foundation:: DECIMAL, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromI1(cin : i8, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromI2(ival : i16, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromI4(lin : i32, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromI8(i64in : i64, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromR4(fltin : f32, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromR8(dblin : f64, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromUI1(bval : u8, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromUI2(uiin : u16, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromUI4(ulin : u32, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarBstrFromUI8(ui64in : u64, lcid : u32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarCat(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarCmp(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, lcid : u32, dwflags : u32) -> VARCMP);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyAbs(cyin : super::Com:: CY, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyAdd(cyleft : super::Com:: CY, cyright : super::Com:: CY, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyCmp(cyleft : super::Com:: CY, cyright : super::Com:: CY) -> VARCMP);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyCmpR8(cyleft : super::Com:: CY, dblright : f64) -> VARCMP);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFix(cyin : super::Com:: CY, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromDate(datein : f64, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromDec(pdecin : *const super::super::Foundation:: DECIMAL, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromI1(cin : i8, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromI2(sin : i16, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromI4(lin : i32, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromI8(i64in : i64, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromR4(fltin : f32, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromR8(dblin : f64, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromUI1(bin : u8, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromUI2(uiin : u16, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromUI4(ulin : u32, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyFromUI8(ui64in : u64, pcyout : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyInt(cyin : super::Com:: CY, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyMul(cyleft : super::Com:: CY, cyright : super::Com:: CY, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyMulI4(cyleft : super::Com:: CY, lright : i32, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyMulI8(cyleft : super::Com:: CY, lright : i64, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyNeg(cyin : super::Com:: CY, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCyRound(cyin : super::Com:: CY, cdecimals : i32, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarCySub(cyleft : super::Com:: CY, cyright : super::Com:: CY, pcyresult : *mut super::Com:: CY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromCy(cyin : super::Com:: CY, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromDec(pdecin : *const super::super::Foundation:: DECIMAL, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromI1(cin : i8, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromI2(sin : i16, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromI4(lin : i32, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromI8(i64in : i64, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromR4(fltin : f32, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromR8(dblin : f64, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromUI1(bin : u8, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromUI2(uiin : u16, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromUI4(ulin : u32, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromUI8(ui64in : u64, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromUdate(pudatein : *const UDATE, dwflags : u32, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDateFromUdateEx(pudatein : *const UDATE, lcid : u32, dwflags : u32, pdateout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecAbs(pdecin : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 399:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecAdd(pdecleft : *const super::super::Foundation:: DECIMAL, pdecright : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecCmp(pdecleft : *const super::super::Foundation:: DECIMAL, pdecright : *const super::super::Foundation:: DECIMAL) -> VARCMP);

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecCmpR8(pdecleft : *const super::super::Foundation:: DECIMAL, dblright : f64) -> VARCMP);

// UNSUPPORTED Rust 402:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecDiv(pdecleft : *const super::super::Foundation:: DECIMAL, pdecright : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFix(pdecin : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 405:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromCy(cyin : super::Com:: CY, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromDate(datein : f64, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromI1(cin : i8, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 411:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromI2(uiin : i16, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromI4(lin : i32, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromI8(i64in : i64, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 414:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromR4(fltin : f32, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromR8(dblin : f64, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 416:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromUI1(bin : u8, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 418:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromUI2(uiin : u16, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromUI4(ulin : u32, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 420:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecFromUI8(ui64in : u64, pdecout : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecInt(pdecin : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 422:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecMul(pdecleft : *const super::super::Foundation:: DECIMAL, pdecright : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecNeg(pdecin : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecRound(pdecin : *const super::super::Foundation:: DECIMAL, cdecimals : i32, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarDecSub(pdecleft : *const super::super::Foundation:: DECIMAL, pdecright : *const super::super::Foundation:: DECIMAL, pdecresult : *mut super::super::Foundation:: DECIMAL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarDiv(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarEqv(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarFix(pvarin : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarFormat(pvarin : *const super::Variant:: VARIANT, pstrformat : windows_sys::core::PCWSTR, ifirstday : VARFORMAT_FIRST_DAY, ifirstweek : VARFORMAT_FIRST_WEEK, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarFormatCurrency(pvarin : *const super::Variant:: VARIANT, inumdig : i32, iinclead : i32, iuseparens : i32, igroup : i32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 436:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarFormatDateTime(pvarin : *const super::Variant:: VARIANT, inamedformat : VARFORMAT_NAMED_FORMAT, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 438:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarFormatFromTokens(pvarin : *const super::Variant:: VARIANT, pstrformat : windows_sys::core::PCWSTR, pbtokcur : *const u8, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR, lcid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarFormatNumber(pvarin : *const super::Variant:: VARIANT, inumdig : i32, iinclead : VARFORMAT_LEADING_DIGIT, iuseparens : VARFORMAT_PARENTHESES, igroup : VARFORMAT_GROUP, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarFormatPercent(pvarin : *const super::Variant:: VARIANT, inumdig : i32, iinclead : VARFORMAT_LEADING_DIGIT, iuseparens : VARFORMAT_PARENTHESES, igroup : VARFORMAT_GROUP, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromCy(cyin : super::Com:: CY, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromDate(datein : f64, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromDec(pdecin : *const super::super::Foundation:: DECIMAL, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 451:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromI2(uiin : i16, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromI4(lin : i32, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 453:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromI8(i64in : i64, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromR4(fltin : f32, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 455:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromR8(dblin : f64, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 457:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromUI1(bin : u8, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromUI2(uiin : u16, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 459:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromUI4(ulin : u32, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI1FromUI8(i64in : u64, pcout : windows_sys::core::PSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 461:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromCy(cyin : super::Com:: CY, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 464:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromDate(datein : f64, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 465:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromDec(pdecin : *const super::super::Foundation:: DECIMAL, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 466:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 468:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromI1(cin : i8, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 469:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromI4(lin : i32, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 470:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromI8(i64in : i64, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 471:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromR4(fltin : f32, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 472:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromR8(dblin : f64, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 473:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 474:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromUI1(bin : u8, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 475:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromUI2(uiin : u16, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 476:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromUI4(ulin : u32, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 477:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI2FromUI8(ui64in : u64, psout : *mut i16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 478:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 479:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromCy(cyin : super::Com:: CY, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 481:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromDate(datein : f64, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 482:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromDec(pdecin : *const super::super::Foundation:: DECIMAL, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 483:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 485:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromI1(cin : i8, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 486:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromI2(sin : i16, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 487:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromI8(i64in : i64, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 488:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromR4(fltin : f32, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 489:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromR8(dblin : f64, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 490:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 491:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromUI1(bin : u8, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 492:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromUI2(uiin : u16, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 493:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromUI4(ulin : u32, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 494:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI4FromUI8(ui64in : u64, plout : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 495:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 496:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromCy(cyin : super::Com:: CY, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 498:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromDate(datein : f64, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 499:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromDec(pdecin : *const super::super::Foundation:: DECIMAL, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 500:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 502:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromI1(cin : i8, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 503:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromI2(sin : i16, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 504:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromR4(fltin : f32, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 505:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromR8(dblin : f64, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 506:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 507:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromUI1(bin : u8, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 508:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromUI2(uiin : u16, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 509:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromUI4(ulin : u32, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 510:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarI8FromUI8(ui64in : u64, pi64out : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 511:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarIdiv(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 513:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarImp(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 515:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarInt(pvarin : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 517:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarMod(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 519:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarMonthName(imonth : i32, fabbrev : i32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 520:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarMul(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 522:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarNeg(pvarin : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 524:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarNot(pvarin : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 526:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarNumFromParseNum(pnumprs : *const NUMPARSE, rgbdig : *const u8, dwvtbits : u32, pvar : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 528:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarOr(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 530:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarParseNumFromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pnumprs : *mut NUMPARSE, rgbdig : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 531:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarPow(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 533:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4CmpR8(fltleft : f32, dblright : f64) -> VARCMP);

// UNSUPPORTED Rust 534:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 535:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromCy(cyin : super::Com:: CY, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 537:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromDate(datein : f64, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 538:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromDec(pdecin : *const super::super::Foundation:: DECIMAL, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 539:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 541:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromI1(cin : i8, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 542:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromI2(sin : i16, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 543:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromI4(lin : i32, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 544:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromI8(i64in : i64, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 545:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromR8(dblin : f64, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 546:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 547:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromUI1(bin : u8, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 548:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromUI2(uiin : u16, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 549:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromUI4(ulin : u32, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 550:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR4FromUI8(ui64in : u64, pfltout : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 551:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 552:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromCy(cyin : super::Com:: CY, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 554:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromDate(datein : f64, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 555:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromDec(pdecin : *const super::super::Foundation:: DECIMAL, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 556:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 558:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromI1(cin : i8, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 559:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromI2(sin : i16, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 560:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromI4(lin : i32, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 561:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromI8(i64in : i64, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 562:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromR4(fltin : f32, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 563:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 564:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromUI1(bin : u8, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 565:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromUI2(uiin : u16, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 566:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromUI4(ulin : u32, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 567:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8FromUI8(ui64in : u64, pdblout : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 568:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8Pow(dblleft : f64, dblright : f64, pdblresult : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 569:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarR8Round(dblin : f64, cdecimals : i32, pdblresult : *mut f64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 570:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarRound(pvarin : *const super::Variant:: VARIANT, cdecimals : i32, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 572:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarSub(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 574:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarTokenizeFormatString(pstrformat : windows_sys::core::PCWSTR, rgbtok : *mut u8, cbtok : i32, ifirstday : VARFORMAT_FIRST_DAY, ifirstweek : VARFORMAT_FIRST_WEEK, lcid : u32, pcbactual : *const i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 575:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 576:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromCy(cyin : super::Com:: CY, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 578:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromDate(datein : f64, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 579:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromDec(pdecin : *const super::super::Foundation:: DECIMAL, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 580:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 582:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromI1(cin : i8, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 583:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromI2(sin : i16, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 584:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromI4(lin : i32, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 585:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromI8(i64in : i64, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 586:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromR4(fltin : f32, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 587:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromR8(dblin : f64, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 588:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 589:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromUI2(uiin : u16, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 590:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromUI4(ulin : u32, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 591:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI1FromUI8(ui64in : u64, pbout : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 592:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 593:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromCy(cyin : super::Com:: CY, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 595:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromDate(datein : f64, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 596:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromDec(pdecin : *const super::super::Foundation:: DECIMAL, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 597:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 599:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromI1(cin : i8, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 600:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromI2(uiin : i16, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 601:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromI4(lin : i32, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 602:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromI8(i64in : i64, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 603:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromR4(fltin : f32, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 604:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromR8(dblin : f64, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 605:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 606:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromUI1(bin : u8, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 607:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromUI4(ulin : u32, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 608:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI2FromUI8(i64in : u64, puiout : *mut u16) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 609:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 610:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromCy(cyin : super::Com:: CY, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 612:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromDate(datein : f64, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 613:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromDec(pdecin : *const super::super::Foundation:: DECIMAL, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 614:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 616:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromI1(cin : i8, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 617:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromI2(uiin : i16, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 618:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromI4(lin : i32, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 619:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromI8(i64in : i64, plout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 620:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromR4(fltin : f32, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 621:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromR8(dblin : f64, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 622:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 623:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromUI1(bin : u8, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 624:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromUI2(uiin : u16, pulout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 625:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI4FromUI8(ui64in : u64, plout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 626:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromBool(boolin : super::super::Foundation:: VARIANT_BOOL, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 627:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromCy(cyin : super::Com:: CY, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 629:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromDate(datein : f64, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 630:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromDec(pdecin : *const super::super::Foundation:: DECIMAL, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 631:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromDisp(pdispin : * mut core::ffi::c_void, lcid : u32, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 633:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromI1(cin : i8, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 634:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromI2(sin : i16, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 635:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromI8(ui64in : i64, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 636:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromR4(fltin : f32, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 637:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromR8(dblin : f64, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 638:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromStr(strin : windows_sys::core::PCWSTR, lcid : u32, dwflags : u32, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 639:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromUI1(bin : u8, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 640:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromUI2(uiin : u16, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 641:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUI8FromUI4(ulin : u32, pi64out : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 642:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarUdateFromDate(datein : f64, dwflags : u32, pudateout : *mut UDATE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 643:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn VarWeekdayName(iweekday : i32, fabbrev : i32, ifirstday : i32, dwflags : u32, pbstrout : *mut windows_sys::core::BSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 644:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// windows_link::link!("oleaut32.dll" "system" fn VarXor(pvarleft : *const super::Variant:: VARIANT, pvarright : *const super::Variant:: VARIANT, pvarresult : *mut super::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 646:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("oleaut32.dll" "system" fn VectorFromBstr(bstr : windows_sys::core::BSTR, ppsa : *mut *mut super::Com:: SAFEARRAY) -> windows_sys::core::HRESULT);

public typealias `ACTIVATEFLAGS` = Int;
public const val `ACTIVATE_WINDOWLESS`: `ACTIVATEFLAGS` = 1;
public typealias `ACTIVEOBJECT_FLAGS` = UInt;
public const val `ACTIVEOBJECT_STRONG`: `ACTIVEOBJECT_FLAGS` = 0u;
public const val `ACTIVEOBJECT_WEAK`: `ACTIVEOBJECT_FLAGS` = 1u;
// UNSUPPORTED Rust 653:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct ARRAYDESC {
//     pub tdescElem: super::Com::TYPEDESC,
//     pub cDims: u16,
//     pub rgbounds: [super::Com::SAFEARRAYBOUND; 1],
// }

// UNSUPPORTED Rust 661:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for ARRAYDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BINDSPEED` = Int;
public const val `BINDSPEED_IMMEDIATE`: `BINDSPEED` = 3;
public const val `BINDSPEED_INDEFINITE`: `BINDSPEED` = 1;
public const val `BINDSPEED_MODERATE`: `BINDSPEED` = 2;
public typealias `BUSY_DIALOG_FLAGS` = UInt;
public const val `BZ_DISABLECANCELBUTTON`: `BUSY_DIALOG_FLAGS` = 1u;
public const val `BZ_DISABLERETRYBUTTON`: `BUSY_DIALOG_FLAGS` = 4u;
public const val `BZ_DISABLESWITCHTOBUTTON`: `BUSY_DIALOG_FLAGS` = 2u;
public const val `BZ_NOTRESPONDINGDIALOG`: `BUSY_DIALOG_FLAGS` = 8u;
// UNSUPPORTED Rust 676:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CADWORD {
//     pub cElems: u32,
//     pub pElems: *mut u32,
// }

// UNSUPPORTED Rust 682:1: declaration Impl has no candidate rule
// impl Default for CADWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CALPOLESTR {
//     pub cElems: u32,
//     pub pElems: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 693:1: declaration Impl has no candidate rule
// impl Default for CALPOLESTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 698:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAUUID {
//     pub cElems: u32,
//     pub pElems: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 704:1: declaration Impl has no candidate rule
// impl Default for CAUUID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CF_BITMAP`: `CLIPBOARD_FORMAT` = 2u;
public const val `CF_CONVERTONLY`: `UI_CONVERT_FLAGS` = 256u;
public const val `CF_DIB`: `CLIPBOARD_FORMAT` = 8u;
public const val `CF_DIBV5`: `CLIPBOARD_FORMAT` = 17u;
public const val `CF_DIF`: `CLIPBOARD_FORMAT` = 5u;
public const val `CF_DISABLEACTIVATEAS`: `UI_CONVERT_FLAGS` = 64u;
public const val `CF_DISABLEDISPLAYASICON`: `UI_CONVERT_FLAGS` = 32u;
public const val `CF_DSPBITMAP`: `CLIPBOARD_FORMAT` = 130u;
public const val `CF_DSPENHMETAFILE`: `CLIPBOARD_FORMAT` = 142u;
public const val `CF_DSPMETAFILEPICT`: `CLIPBOARD_FORMAT` = 131u;
public const val `CF_DSPTEXT`: `CLIPBOARD_FORMAT` = 129u;
public const val `CF_ENHMETAFILE`: `CLIPBOARD_FORMAT` = 14u;
public const val `CF_GDIOBJFIRST`: `CLIPBOARD_FORMAT` = 768u;
public const val `CF_GDIOBJLAST`: `CLIPBOARD_FORMAT` = 1023u;
public const val `CF_HDROP`: `CLIPBOARD_FORMAT` = 15u;
public const val `CF_HIDECHANGEICON`: `UI_CONVERT_FLAGS` = 128u;
public const val `CF_LOCALE`: `CLIPBOARD_FORMAT` = 16u;
public const val `CF_MAX`: `CLIPBOARD_FORMAT` = 18u;
public const val `CF_METAFILEPICT`: `CLIPBOARD_FORMAT` = 3u;
public const val `CF_OEMTEXT`: `CLIPBOARD_FORMAT` = 7u;
public const val `CF_OWNERDISPLAY`: `CLIPBOARD_FORMAT` = 128u;
public const val `CF_PALETTE`: `CLIPBOARD_FORMAT` = 9u;
public const val `CF_PENDATA`: `CLIPBOARD_FORMAT` = 10u;
public const val `CF_PRIVATEFIRST`: `CLIPBOARD_FORMAT` = 512u;
public const val `CF_PRIVATELAST`: `CLIPBOARD_FORMAT` = 767u;
public const val `CF_RIFF`: `CLIPBOARD_FORMAT` = 11u;
public const val `CF_SELECTACTIVATEAS`: `UI_CONVERT_FLAGS` = 16u;
public const val `CF_SELECTCONVERTTO`: `UI_CONVERT_FLAGS` = 8u;
public const val `CF_SETACTIVATEDEFAULT`: `UI_CONVERT_FLAGS` = 4u;
public const val `CF_SETCONVERTDEFAULT`: `UI_CONVERT_FLAGS` = 2u;
public const val `CF_SHOWHELPBUTTON`: `UI_CONVERT_FLAGS` = 1u;
public const val `CF_SYLK`: `CLIPBOARD_FORMAT` = 4u;
public const val `CF_TEXT`: `CLIPBOARD_FORMAT` = 1u;
public const val `CF_TIFF`: `CLIPBOARD_FORMAT` = 6u;
public const val `CF_UNICODETEXT`: `CLIPBOARD_FORMAT` = 13u;
public const val `CF_WAVE`: `CLIPBOARD_FORMAT` = 12u;
public typealias `CHANGEKIND` = Int;
public const val `CHANGEKIND_ADDMEMBER`: `CHANGEKIND` = 0;
public const val `CHANGEKIND_CHANGEFAILED`: `CHANGEKIND` = 6;
public const val `CHANGEKIND_DELETEMEMBER`: `CHANGEKIND` = 1;
public const val `CHANGEKIND_GENERAL`: `CHANGEKIND` = 4;
public const val `CHANGEKIND_INVALIDATE`: `CHANGEKIND` = 5;
public const val `CHANGEKIND_MAX`: `CHANGEKIND` = 7;
public const val `CHANGEKIND_SETDOCUMENTATION`: `CHANGEKIND` = 3;
public const val `CHANGEKIND_SETNAMES`: `CHANGEKIND` = 2;
public typealias `CHANGE_ICON_FLAGS` = UInt;
public typealias `CHANGE_SOURCE_FLAGS` = UInt;
public const val `CIF_SELECTCURRENT`: `CHANGE_ICON_FLAGS` = 2u;
public const val `CIF_SELECTDEFAULT`: `CHANGE_ICON_FLAGS` = 4u;
public const val `CIF_SELECTFROMFILE`: `CHANGE_ICON_FLAGS` = 8u;
public const val `CIF_SHOWHELP`: `CHANGE_ICON_FLAGS` = 1u;
public const val `CIF_USEICONEXE`: `CHANGE_ICON_FLAGS` = 16u;
// UNSUPPORTED Rust 761:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLEANLOCALSTORAGE {
//     pub pInterface: *mut core::ffi::c_void,
//     pub pStorage: *mut core::ffi::c_void,
//     pub flags: u32,
// }

// UNSUPPORTED Rust 768:1: declaration Impl has no candidate rule
// impl Default for CLEANLOCALSTORAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLIPBOARD_FORMAT` = UShort;
// UNSUPPORTED Rust 774:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CColorPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35201_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 775:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CFontPropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35200_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 776:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CPicturePropPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35202_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 777:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_ConvertVBX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb8f0822_0164_101b_84ed_08002b2ec713);

// UNSUPPORTED Rust 778:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_PersistPropset: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb8f0821_0164_101b_84ed_08002b2ec713);

// UNSUPPORTED Rust 779:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_StdFont: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35203_8f91_11ce_9de3_00aa004bb851);

// UNSUPPORTED Rust 780:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_StdPicture: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0be35204_8f91_11ce_9de3_00aa004bb851);

public const val `CONNECT_E_ADVISELIMIT`: Int = -2147220991;
public const val `CONNECT_E_CANNOTCONNECT`: Int = -2147220990;
public const val `CONNECT_E_FIRST`: Int = -2147220992;
public const val `CONNECT_E_LAST`: Int = -2147220977;
public const val `CONNECT_E_NOCONNECTION`: Int = -2147220992;
public const val `CONNECT_E_OVERRIDDEN`: Int = -2147220989;
public const val `CONNECT_S_FIRST`: Int = 262656;
public const val `CONNECT_S_LAST`: Int = 262671;
// UNSUPPORTED Rust 789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct CONTROLINFO {
//     pub cb: u32,
//     pub hAccel: super::super::UI::WindowsAndMessaging::HACCEL,
//     pub cAccel: u16,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 798:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CONTROLINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CSF_EXPLORER`: `CHANGE_SOURCE_FLAGS` = 8u;
public const val `CSF_ONLYGETSOURCE`: `CHANGE_SOURCE_FLAGS` = 4u;
public const val `CSF_SHOWHELP`: `CHANGE_SOURCE_FLAGS` = 1u;
public const val `CSF_VALIDSOURCE`: `CHANGE_SOURCE_FLAGS` = 2u;
public const val `CTL_E_ILLEGALFUNCTIONCALL`: Int = -2146828283;
public typealias `CTRLINFO` = Int;
public const val `CTRLINFO_EATS_ESCAPE`: `CTRLINFO` = 2;
public const val `CTRLINFO_EATS_RETURN`: `CTRLINFO` = 1;
public const val `DD_DEFDRAGDELAY`: UInt = 200u;
public const val `DD_DEFDRAGMINDIST`: UInt = 2u;
public const val `DD_DEFSCROLLDELAY`: UInt = 50u;
public const val `DD_DEFSCROLLINSET`: UInt = 11u;
public const val `DD_DEFSCROLLINTERVAL`: UInt = 50u;
public typealias `DISCARDCACHE` = Int;
public const val `DISCARDCACHE_NOSAVE`: `DISCARDCACHE` = 1;
public const val `DISCARDCACHE_SAVEIFDIRTY`: `DISCARDCACHE` = 0;
public const val `DISPATCH_CONSTRUCT`: UInt = 16384u;
public const val `DISPID_ABOUTBOX`: Int = -552;
public const val `DISPID_ACCELERATOR`: Int = -543;
public const val `DISPID_ADDITEM`: Int = -553;
public const val `DISPID_AMBIENT_APPEARANCE`: Int = -716;
public const val `DISPID_AMBIENT_AUTOCLIP`: Int = -715;
public const val `DISPID_AMBIENT_BACKCOLOR`: Int = -701;
public const val `DISPID_AMBIENT_CHARSET`: Int = -727;
public const val `DISPID_AMBIENT_CODEPAGE`: Int = -725;
public const val `DISPID_AMBIENT_DISPLAYASDEFAULT`: Int = -713;
public const val `DISPID_AMBIENT_DISPLAYNAME`: Int = -702;
public const val `DISPID_AMBIENT_FONT`: Int = -703;
public const val `DISPID_AMBIENT_FORECOLOR`: Int = -704;
public const val `DISPID_AMBIENT_LOCALEID`: Int = -705;
public const val `DISPID_AMBIENT_MESSAGEREFLECT`: Int = -706;
public const val `DISPID_AMBIENT_PALETTE`: Int = -726;
public const val `DISPID_AMBIENT_RIGHTTOLEFT`: Int = -732;
public const val `DISPID_AMBIENT_SCALEUNITS`: Int = -707;
public const val `DISPID_AMBIENT_SHOWGRABHANDLES`: Int = -711;
public const val `DISPID_AMBIENT_SHOWHATCHING`: Int = -712;
public const val `DISPID_AMBIENT_SUPPORTSMNEMONICS`: Int = -714;
public const val `DISPID_AMBIENT_TEXTALIGN`: Int = -708;
public const val `DISPID_AMBIENT_TOPTOBOTTOM`: Int = -733;
public const val `DISPID_AMBIENT_TRANSFERPRIORITY`: Int = -728;
public const val `DISPID_AMBIENT_UIDEAD`: Int = -710;
public const val `DISPID_AMBIENT_USERMODE`: Int = -709;
public const val `DISPID_APPEARANCE`: Int = -520;
public const val `DISPID_AUTOSIZE`: Int = -500;
public const val `DISPID_BACKCOLOR`: Int = -501;
public const val `DISPID_BACKSTYLE`: Int = -502;
public const val `DISPID_BORDERCOLOR`: Int = -503;
public const val `DISPID_BORDERSTYLE`: Int = -504;
public const val `DISPID_BORDERVISIBLE`: Int = -519;
public const val `DISPID_BORDERWIDTH`: Int = -505;
public const val `DISPID_CAPTION`: Int = -518;
public const val `DISPID_CLEAR`: Int = -554;
public const val `DISPID_CLICK`: Int = -600;
public const val `DISPID_CLICK_VALUE`: Int = -610;
public const val `DISPID_COLLECT`: Int = -8;
public const val `DISPID_COLUMN`: Int = -529;
public const val `DISPID_CONSTRUCTOR`: Int = -6;
public const val `DISPID_DBLCLICK`: Int = -601;
public const val `DISPID_DESTRUCTOR`: Int = -7;
public const val `DISPID_DISPLAYSTYLE`: Int = -540;
public const val `DISPID_DOCLICK`: Int = -551;
public const val `DISPID_DRAWMODE`: Int = -507;
public const val `DISPID_DRAWSTYLE`: Int = -508;
public const val `DISPID_DRAWWIDTH`: Int = -509;
public const val `DISPID_Delete`: Int = -801;
public const val `DISPID_ENABLED`: Int = -514;
public const val `DISPID_ENTERKEYBEHAVIOR`: Int = -544;
public const val `DISPID_ERROREVENT`: Int = -608;
public const val `DISPID_EVALUATE`: Int = -5;
public const val `DISPID_FILLCOLOR`: Int = -510;
public const val `DISPID_FILLSTYLE`: Int = -511;
public const val `DISPID_FONT`: Int = -512;
public const val `DISPID_FONT_BOLD`: UInt = 3u;
public const val `DISPID_FONT_CHANGED`: UInt = 9u;
public const val `DISPID_FONT_CHARSET`: UInt = 8u;
public const val `DISPID_FONT_ITALIC`: UInt = 4u;
public const val `DISPID_FONT_NAME`: UInt = 0u;
public const val `DISPID_FONT_SIZE`: UInt = 2u;
public const val `DISPID_FONT_STRIKE`: UInt = 6u;
public const val `DISPID_FONT_UNDER`: UInt = 5u;
public const val `DISPID_FONT_WEIGHT`: UInt = 7u;
public const val `DISPID_FORECOLOR`: Int = -513;
public const val `DISPID_GROUPNAME`: Int = -541;
public const val `DISPID_HWND`: Int = -515;
public const val `DISPID_IMEMODE`: Int = -542;
public const val `DISPID_KEYDOWN`: Int = -602;
public const val `DISPID_KEYPRESS`: Int = -603;
public const val `DISPID_KEYUP`: Int = -604;
public const val `DISPID_LIST`: Int = -528;
public const val `DISPID_LISTCOUNT`: Int = -531;
public const val `DISPID_LISTINDEX`: Int = -526;
public const val `DISPID_MAXLENGTH`: Int = -533;
public const val `DISPID_MOUSEDOWN`: Int = -605;
public const val `DISPID_MOUSEICON`: Int = -522;
public const val `DISPID_MOUSEMOVE`: Int = -606;
public const val `DISPID_MOUSEPOINTER`: Int = -521;
public const val `DISPID_MOUSEUP`: Int = -607;
public const val `DISPID_MULTILINE`: Int = -537;
public const val `DISPID_MULTISELECT`: Int = -532;
public const val `DISPID_NEWENUM`: Int = -4;
public const val `DISPID_NUMBEROFCOLUMNS`: Int = -539;
public const val `DISPID_NUMBEROFROWS`: Int = -538;
public const val `DISPID_Name`: Int = -800;
public const val `DISPID_Object`: Int = -802;
public const val `DISPID_PASSWORDCHAR`: Int = -534;
public const val `DISPID_PICTURE`: Int = -523;
public const val `DISPID_PICT_HANDLE`: UInt = 0u;
public const val `DISPID_PICT_HEIGHT`: UInt = 5u;
public const val `DISPID_PICT_HPAL`: UInt = 2u;
public const val `DISPID_PICT_RENDER`: UInt = 6u;
public const val `DISPID_PICT_TYPE`: UInt = 3u;
public const val `DISPID_PICT_WIDTH`: UInt = 4u;
public const val `DISPID_PROPERTYPUT`: Int = -3;
public const val `DISPID_Parent`: Int = -803;
public const val `DISPID_READYSTATE`: Int = -525;
public const val `DISPID_READYSTATECHANGE`: Int = -609;
public const val `DISPID_REFRESH`: Int = -550;
public const val `DISPID_REMOVEITEM`: Int = -555;
public const val `DISPID_RIGHTTOLEFT`: Int = -611;
public const val `DISPID_SCROLLBARS`: Int = -535;
public const val `DISPID_SELECTED`: Int = -527;
public const val `DISPID_SELLENGTH`: Int = -548;
public const val `DISPID_SELSTART`: Int = -547;
public const val `DISPID_SELTEXT`: Int = -546;
public const val `DISPID_STARTENUM`: Int = -1;
public const val `DISPID_TABKEYBEHAVIOR`: Int = -545;
public const val `DISPID_TABSTOP`: Int = -516;
public const val `DISPID_TEXT`: Int = -517;
public const val `DISPID_THIS`: Int = -613;
public const val `DISPID_TOPTOBOTTOM`: Int = -612;
public const val `DISPID_UNKNOWN`: Int = -1;
public const val `DISPID_VALID`: Int = -524;
public const val `DISPID_VALUE`: UInt = 0u;
public const val `DISPID_WORDWRAP`: Int = -536;
public typealias `DOCMISC` = Int;
public const val `DOCMISC_CANCREATEMULTIPLEVIEWS`: `DOCMISC` = 1;
public const val `DOCMISC_CANTOPENEDIT`: `DOCMISC` = 4;
public const val `DOCMISC_NOFILESUPPORT`: `DOCMISC` = 8;
public const val `DOCMISC_SUPPORTCOMPLEXRECTANGLES`: `DOCMISC` = 2;
public typealias `DROPEFFECT` = UInt;
public const val `DROPEFFECT_COPY`: `DROPEFFECT` = 1u;
public const val `DROPEFFECT_LINK`: `DROPEFFECT` = 4u;
public const val `DROPEFFECT_MOVE`: `DROPEFFECT` = 2u;
public const val `DROPEFFECT_NONE`: `DROPEFFECT` = 0u;
public const val `DROPEFFECT_SCROLL`: `DROPEFFECT` = 2147483648u;
// UNSUPPORTED Rust 949:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DVASPECTINFO {
//     pub cb: u32,
//     pub dwFlags: u32,
// }

public typealias `DVASPECTINFOFLAG` = Int;
public const val `DVASPECTINFOFLAG_CANOPTIMIZE`: `DVASPECTINFOFLAG` = 1;
// UNSUPPORTED Rust 957:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DVEXTENTINFO {
//     pub cb: u32,
//     pub dwExtentMode: u32,
//     pub sizelProposed: super::super::Foundation::SIZE,
// }

public typealias `DVEXTENTMODE` = Int;
public const val `DVEXTENT_CONTENT`: `DVEXTENTMODE` = 0;
public const val `DVEXTENT_INTEGRAL`: `DVEXTENTMODE` = 1;
public typealias `EDIT_LINKS_FLAGS` = UInt;
public const val `ELF_DISABLECANCELLINK`: `EDIT_LINKS_FLAGS` = 16u;
public const val `ELF_DISABLECHANGESOURCE`: `EDIT_LINKS_FLAGS` = 8u;
public const val `ELF_DISABLEOPENSOURCE`: `EDIT_LINKS_FLAGS` = 4u;
public const val `ELF_DISABLEUPDATENOW`: `EDIT_LINKS_FLAGS` = 2u;
public const val `ELF_SHOWHELP`: `EDIT_LINKS_FLAGS` = 1u;
public const val `EMBDHLP_CREATENOW`: `EMBDHLP_FLAGS` = 0u;
public const val `EMBDHLP_DELAYCREATE`: `EMBDHLP_FLAGS` = 65536u;
public typealias `EMBDHLP_FLAGS` = UInt;
public const val `EMBDHLP_INPROC_HANDLER`: `EMBDHLP_FLAGS` = 0u;
public const val `EMBDHLP_INPROC_SERVER`: `EMBDHLP_FLAGS` = 1u;
public typealias `ENUM_CONTROLS_WHICH_FLAGS` = UInt;
public typealias `FDEX_PROP_FLAGS` = UInt;
// UNSUPPORTED Rust 980:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct FONTDESC {
//     pub cbSizeofstruct: u32,
//     pub lpstrName: windows_sys::core::PWSTR,
//     pub cySize: super::Com::CY,
//     pub sWeight: i16,
//     pub sCharset: i16,
//     pub fItalic: windows_sys::core::BOOL,
//     pub fUnderline: windows_sys::core::BOOL,
//     pub fStrikethrough: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 993:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for FONTDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GCW_WCH_SIBLING`: `ENUM_CONTROLS_WHICH_FLAGS` = 1u;
public const val `GC_WCH_ALL`: `ENUM_CONTROLS_WHICH_FLAGS` = 4u;
public const val `GC_WCH_CONTAINED`: `ENUM_CONTROLS_WHICH_FLAGS` = 3u;
public const val `GC_WCH_CONTAINER`: `ENUM_CONTROLS_WHICH_FLAGS` = 2u;
public const val `GC_WCH_FONLYAFTER`: `ENUM_CONTROLS_WHICH_FLAGS` = 268435456u;
public const val `GC_WCH_FONLYBEFORE`: `ENUM_CONTROLS_WHICH_FLAGS` = 536870912u;
public const val `GC_WCH_FREVERSEDIR`: `ENUM_CONTROLS_WHICH_FLAGS` = 134217728u;
public const val `GC_WCH_FSELECTED`: `ENUM_CONTROLS_WHICH_FLAGS` = 1073741824u;
public const val `GC_WCH_SIBLING`: Int = 1;
public typealias `GUIDKIND` = Int;
public const val `GUIDKIND_DEFAULT_SOURCE_DISP_IID`: `GUIDKIND` = 1;
// UNSUPPORTED Rust 1010:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_CHECKVALUEEXCLUSIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430c_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1011:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_COLOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504301_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1012:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_FONTBOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430f_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1013:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_FONTITALIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504310_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1014:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_FONTNAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430d_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1015:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_FONTSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430e_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1016:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_FONTSTRIKETHROUGH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504312_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1017:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_FONTUNDERSCORE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504311_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1018:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_HANDLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504313_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1019:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_HIMETRIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504300_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1020:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_OPTIONVALUEEXCLUSIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430b_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1021:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_TRISTATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6650430a_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1022:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_XPOS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504306_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1023:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_XPOSPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504302_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1024:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_XSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504308_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1025:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_XSIZEPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504304_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1026:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_YPOS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504307_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1027:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_YPOSPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504303_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1028:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_YSIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504309_be0f_101a_8bbb_00aa00300cab);

// UNSUPPORTED Rust 1029:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_YSIZEPIXEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66504305_be0f_101a_8bbb_00aa00300cab);

public typealias `HITRESULT` = Int;
public const val `HITRESULT_CLOSE`: `HITRESULT` = 2;
public const val `HITRESULT_HIT`: `HITRESULT` = 3;
public const val `HITRESULT_OUTSIDE`: `HITRESULT` = 0;
public const val `HITRESULT_TRANSPARENT`: `HITRESULT` = 1;
public const val `IDC_BZ_ICON`: UInt = 601u;
public const val `IDC_BZ_MESSAGE1`: UInt = 602u;
public const val `IDC_BZ_RETRY`: UInt = 600u;
public const val `IDC_BZ_SWITCHTO`: UInt = 604u;
public const val `IDC_CI_BROWSE`: UInt = 130u;
public const val `IDC_CI_CURRENT`: UInt = 121u;
public const val `IDC_CI_CURRENTICON`: UInt = 122u;
public const val `IDC_CI_DEFAULT`: UInt = 123u;
public const val `IDC_CI_DEFAULTICON`: UInt = 124u;
public const val `IDC_CI_FROMFILE`: UInt = 125u;
public const val `IDC_CI_FROMFILEEDIT`: UInt = 126u;
public const val `IDC_CI_GROUP`: UInt = 120u;
public const val `IDC_CI_ICONDISPLAY`: UInt = 131u;
public const val `IDC_CI_ICONLIST`: UInt = 127u;
public const val `IDC_CI_LABEL`: UInt = 128u;
public const val `IDC_CI_LABELEDIT`: UInt = 129u;
public const val `IDC_CV_ACTIVATEAS`: UInt = 156u;
public const val `IDC_CV_ACTIVATELIST`: UInt = 154u;
public const val `IDC_CV_CHANGEICON`: UInt = 153u;
public const val `IDC_CV_CONVERTLIST`: UInt = 158u;
public const val `IDC_CV_CONVERTTO`: UInt = 155u;
public const val `IDC_CV_DISPLAYASICON`: UInt = 152u;
public const val `IDC_CV_ICONDISPLAY`: UInt = 165u;
public const val `IDC_CV_OBJECTTYPE`: UInt = 150u;
public const val `IDC_CV_RESULTTEXT`: UInt = 157u;
public const val `IDC_EL_AUTOMATIC`: UInt = 202u;
public const val `IDC_EL_CANCELLINK`: UInt = 209u;
public const val `IDC_EL_CHANGESOURCE`: UInt = 201u;
public const val `IDC_EL_COL1`: UInt = 220u;
public const val `IDC_EL_COL2`: UInt = 221u;
public const val `IDC_EL_COL3`: UInt = 222u;
public const val `IDC_EL_LINKSLISTBOX`: UInt = 206u;
public const val `IDC_EL_LINKSOURCE`: UInt = 216u;
public const val `IDC_EL_LINKTYPE`: UInt = 217u;
public const val `IDC_EL_MANUAL`: UInt = 212u;
public const val `IDC_EL_OPENSOURCE`: UInt = 211u;
public const val `IDC_EL_UPDATENOW`: UInt = 210u;
public const val `IDC_GP_CONVERT`: UInt = 1013u;
public const val `IDC_GP_OBJECTICON`: UInt = 1014u;
public const val `IDC_GP_OBJECTLOCATION`: UInt = 1022u;
public const val `IDC_GP_OBJECTNAME`: UInt = 1009u;
public const val `IDC_GP_OBJECTSIZE`: UInt = 1011u;
public const val `IDC_GP_OBJECTTYPE`: UInt = 1010u;
public const val `IDC_IO_ADDCONTROL`: UInt = 2115u;
public const val `IDC_IO_CHANGEICON`: UInt = 2105u;
public const val `IDC_IO_CONTROLTYPELIST`: UInt = 2116u;
public const val `IDC_IO_CREATEFROMFILE`: UInt = 2101u;
public const val `IDC_IO_CREATENEW`: UInt = 2100u;
public const val `IDC_IO_DISPLAYASICON`: UInt = 2104u;
public const val `IDC_IO_FILE`: UInt = 2106u;
public const val `IDC_IO_FILEDISPLAY`: UInt = 2107u;
public const val `IDC_IO_FILETEXT`: UInt = 2112u;
public const val `IDC_IO_FILETYPE`: UInt = 2113u;
public const val `IDC_IO_ICONDISPLAY`: UInt = 2110u;
public const val `IDC_IO_INSERTCONTROL`: UInt = 2114u;
public const val `IDC_IO_LINKFILE`: UInt = 2102u;
public const val `IDC_IO_OBJECTTYPELIST`: UInt = 2103u;
public const val `IDC_IO_OBJECTTYPETEXT`: UInt = 2111u;
public const val `IDC_IO_RESULTIMAGE`: UInt = 2108u;
public const val `IDC_IO_RESULTTEXT`: UInt = 2109u;
public const val `IDC_LP_AUTOMATIC`: UInt = 1016u;
public const val `IDC_LP_BREAKLINK`: UInt = 1008u;
public const val `IDC_LP_CHANGESOURCE`: UInt = 1015u;
public const val `IDC_LP_DATE`: UInt = 1018u;
public const val `IDC_LP_LINKSOURCE`: UInt = 1012u;
public const val `IDC_LP_MANUAL`: UInt = 1017u;
public const val `IDC_LP_OPENSOURCE`: UInt = 1006u;
public const val `IDC_LP_TIME`: UInt = 1019u;
public const val `IDC_LP_UPDATENOW`: UInt = 1007u;
public const val `IDC_OLEUIHELP`: UInt = 99u;
public const val `IDC_PS_CHANGEICON`: UInt = 508u;
public const val `IDC_PS_DISPLAYASICON`: UInt = 506u;
public const val `IDC_PS_DISPLAYLIST`: UInt = 505u;
public const val `IDC_PS_ICONDISPLAY`: UInt = 507u;
public const val `IDC_PS_PASTE`: UInt = 500u;
public const val `IDC_PS_PASTELINK`: UInt = 501u;
public const val `IDC_PS_PASTELINKLIST`: UInt = 504u;
public const val `IDC_PS_PASTELIST`: UInt = 503u;
public const val `IDC_PS_RESULTIMAGE`: UInt = 509u;
public const val `IDC_PS_RESULTTEXT`: UInt = 510u;
public const val `IDC_PS_SOURCETEXT`: UInt = 502u;
public const val `IDC_PU_CONVERT`: UInt = 902u;
public const val `IDC_PU_ICON`: UInt = 908u;
public const val `IDC_PU_LINKS`: UInt = 900u;
public const val `IDC_PU_TEXT`: UInt = 901u;
public const val `IDC_UL_METER`: UInt = 1029u;
public const val `IDC_UL_PERCENT`: UInt = 1031u;
public const val `IDC_UL_PROGRESS`: UInt = 1032u;
public const val `IDC_UL_STOP`: UInt = 1030u;
public const val `IDC_VP_ASICON`: UInt = 1003u;
public const val `IDC_VP_CHANGEICON`: UInt = 1001u;
public const val `IDC_VP_EDITABLE`: UInt = 1002u;
public const val `IDC_VP_ICONDISPLAY`: UInt = 1021u;
public const val `IDC_VP_PERCENT`: UInt = 1000u;
public const val `IDC_VP_RELATIVE`: UInt = 1005u;
public const val `IDC_VP_RESULTIMAGE`: UInt = 1033u;
public const val `IDC_VP_SCALETXT`: UInt = 1034u;
public const val `IDC_VP_SPIN`: UInt = 1006u;
public const val `IDD_BUSY`: UInt = 1006u;
public const val `IDD_CANNOTUPDATELINK`: UInt = 1008u;
public const val `IDD_CHANGEICON`: UInt = 1001u;
public const val `IDD_CHANGEICONBROWSE`: UInt = 1011u;
public const val `IDD_CHANGESOURCE`: UInt = 1009u;
public const val `IDD_CHANGESOURCE4`: UInt = 1013u;
public const val `IDD_CONVERT`: UInt = 1002u;
public const val `IDD_CONVERT4`: UInt = 1103u;
public const val `IDD_CONVERTONLY`: UInt = 1012u;
public const val `IDD_CONVERTONLY4`: UInt = 1104u;
public const val `IDD_EDITLINKS`: UInt = 1004u;
public const val `IDD_EDITLINKS4`: UInt = 1105u;
public const val `IDD_GNRLPROPS`: UInt = 1100u;
public const val `IDD_GNRLPROPS4`: UInt = 1106u;
public const val `IDD_INSERTFILEBROWSE`: UInt = 1010u;
public const val `IDD_INSERTOBJECT`: UInt = 1000u;
public const val `IDD_LINKPROPS`: UInt = 1102u;
public const val `IDD_LINKPROPS4`: UInt = 1107u;
public const val `IDD_LINKSOURCEUNAVAILABLE`: UInt = 1020u;
public const val `IDD_LINKTYPECHANGED`: UInt = 1022u;
public const val `IDD_LINKTYPECHANGEDA`: UInt = 1026u;
public const val `IDD_LINKTYPECHANGEDW`: UInt = 1022u;
public const val `IDD_OUTOFMEMORY`: UInt = 1024u;
public const val `IDD_PASTESPECIAL`: UInt = 1003u;
public const val `IDD_PASTESPECIAL4`: UInt = 1108u;
public const val `IDD_SERVERNOTFOUND`: UInt = 1023u;
public const val `IDD_SERVERNOTREG`: UInt = 1021u;
public const val `IDD_SERVERNOTREGA`: UInt = 1025u;
public const val `IDD_SERVERNOTREGW`: UInt = 1021u;
public const val `IDD_UPDATELINKS`: UInt = 1007u;
public const val `IDD_VIEWPROPS`: UInt = 1101u;
public const val `ID_BROWSE_ADDCONTROL`: UInt = 3u;
public const val `ID_BROWSE_CHANGEICON`: UInt = 1u;
public const val `ID_BROWSE_CHANGESOURCE`: UInt = 4u;
public const val `ID_BROWSE_INSERTFILE`: UInt = 2u;
public const val `ID_DEFAULTINST`: Int = -2;
public typealias `IGNOREMIME` = Int;
public const val `IGNOREMIME_PROMPT`: `IGNOREMIME` = 1;
public const val `IGNOREMIME_TEXT`: `IGNOREMIME` = 2;
public typealias `INSERT_OBJECT_FLAGS` = UInt;
public const val `INSTALL_SCOPE_INVALID`: UInt = 0u;
public const val `INSTALL_SCOPE_MACHINE`: UInt = 1u;
public const val `INSTALL_SCOPE_USER`: UInt = 2u;
// UNSUPPORTED Rust 1176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct INTERFACEDATA {
//     pub pmethdata: *mut METHODDATA,
//     pub cMembers: u32,
// }

// UNSUPPORTED Rust 1183:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for INTERFACEDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IOF_CHECKDISPLAYASICON`: `INSERT_OBJECT_FLAGS` = 16u;
public const val `IOF_CHECKLINK`: `INSERT_OBJECT_FLAGS` = 8u;
public const val `IOF_CREATEFILEOBJECT`: `INSERT_OBJECT_FLAGS` = 64u;
public const val `IOF_CREATELINKOBJECT`: `INSERT_OBJECT_FLAGS` = 128u;
public const val `IOF_CREATENEWOBJECT`: `INSERT_OBJECT_FLAGS` = 32u;
public const val `IOF_DISABLEDISPLAYASICON`: `INSERT_OBJECT_FLAGS` = 1024u;
public const val `IOF_DISABLELINK`: `INSERT_OBJECT_FLAGS` = 256u;
public const val `IOF_HIDECHANGEICON`: `INSERT_OBJECT_FLAGS` = 2048u;
public const val `IOF_SELECTCREATECONTROL`: `INSERT_OBJECT_FLAGS` = 8192u;
public const val `IOF_SELECTCREATEFROMFILE`: `INSERT_OBJECT_FLAGS` = 4u;
public const val `IOF_SELECTCREATENEW`: `INSERT_OBJECT_FLAGS` = 2u;
public const val `IOF_SHOWHELP`: `INSERT_OBJECT_FLAGS` = 1u;
public const val `IOF_SHOWINSERTCONTROL`: `INSERT_OBJECT_FLAGS` = 4096u;
public const val `IOF_VERIFYSERVERSEXIST`: `INSERT_OBJECT_FLAGS` = 512u;
public typealias `KEYMODIFIERS` = UInt;
public const val `KEYMOD_ALT`: `KEYMODIFIERS` = 4u;
public const val `KEYMOD_CONTROL`: `KEYMODIFIERS` = 2u;
public const val `KEYMOD_SHIFT`: `KEYMODIFIERS` = 1u;
public typealias `LIBFLAGS` = Int;
public const val `LIBFLAG_FCONTROL`: `LIBFLAGS` = 2;
public const val `LIBFLAG_FHASDISKIMAGE`: `LIBFLAGS` = 8;
public const val `LIBFLAG_FHIDDEN`: `LIBFLAGS` = 4;
public const val `LIBFLAG_FRESTRICTED`: `LIBFLAGS` = 1;
// UNSUPPORTED Rust 1212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LICINFO {
//     pub cbLicInfo: i32,
//     pub fRuntimeKeyAvail: windows_sys::core::BOOL,
//     pub fLicVerified: windows_sys::core::BOOL,
// }

public typealias `LOAD_PICTURE_FLAGS` = UInt;
public const val `LOAD_TLB_AS_32BIT`: UInt = 32u;
public const val `LOAD_TLB_AS_64BIT`: UInt = 64u;
public const val `LOCALE_USE_NLS`: UInt = 268435456u;
// UNSUPPORTED Rust 1223:1: generic scalar type unsupported
// pub type LPFNOLEUIHOOK = Option<unsafe extern "system" fn(param0: super::super::Foundation::HWND, param1: u32, param2: super::super::Foundation::WPARAM, param3: super::super::Foundation::LPARAM) -> u32>;

public const val `LP_COLOR`: `LOAD_PICTURE_FLAGS` = 4u;
public const val `LP_DEFAULT`: `LOAD_PICTURE_FLAGS` = 0u;
public const val `LP_MONOCHROME`: `LOAD_PICTURE_FLAGS` = 1u;
public const val `LP_VGACOLOR`: `LOAD_PICTURE_FLAGS` = 2u;
public const val `MEDIAPLAYBACK_PAUSE`: `MEDIAPLAYBACK_STATE` = 1;
public const val `MEDIAPLAYBACK_PAUSE_AND_SUSPEND`: `MEDIAPLAYBACK_STATE` = 2;
public const val `MEDIAPLAYBACK_RESUME`: `MEDIAPLAYBACK_STATE` = 0;
public const val `MEDIAPLAYBACK_RESUME_FROM_SUSPEND`: `MEDIAPLAYBACK_STATE` = 3;
public typealias `MEDIAPLAYBACK_STATE` = Int;
public const val `MEMBERID_NIL`: Int = -1;
// UNSUPPORTED Rust 1234:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct METHODDATA {
//     pub szName: windows_sys::core::PWSTR,
//     pub ppdata: *mut PARAMDATA,
//     pub dispid: i32,
//     pub iMeth: u32,
//     pub cc: super::Com::CALLCONV,
//     pub cArgs: u32,
//     pub wFlags: u16,
//     pub vtReturn: super::Variant::VARENUM,
// }

// UNSUPPORTED Rust 1247:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for METHODDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MK_ALT`: UInt = 32u;
public const val `MSOCMDERR_E_CANCELED`: Int = -2147221245;
public const val `MSOCMDERR_E_DISABLED`: Int = -2147221247;
public const val `MSOCMDERR_E_FIRST`: Int = -2147221248;
public const val `MSOCMDERR_E_NOHELP`: Int = -2147221246;
public const val `MSOCMDERR_E_NOTSUPPORTED`: Int = -2147221248;
public const val `MSOCMDERR_E_UNKNOWNGROUP`: Int = -2147221244;
public typealias `MULTICLASSINFO_FLAGS` = UInt;
public const val `MULTICLASSINFO_GETIIDPRIMARY`: `MULTICLASSINFO_FLAGS` = 4u;
public const val `MULTICLASSINFO_GETIIDSOURCE`: `MULTICLASSINFO_FLAGS` = 8u;
public const val `MULTICLASSINFO_GETNUMRESERVEDDISPIDS`: `MULTICLASSINFO_FLAGS` = 2u;
public const val `MULTICLASSINFO_GETTYPEINFO`: `MULTICLASSINFO_FLAGS` = 1u;
// UNSUPPORTED Rust 1265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NUMPARSE {
//     pub cDig: i32,
//     pub dwInFlags: NUMPARSE_FLAGS,
//     pub dwOutFlags: NUMPARSE_FLAGS,
//     pub cchUsed: i32,
//     pub nBaseShift: i32,
//     pub nPwr10: i32,
// }

public typealias `NUMPARSE_FLAGS` = UInt;
public const val `NUMPRS_CURRENCY`: `NUMPARSE_FLAGS` = 1024u;
public const val `NUMPRS_DECIMAL`: `NUMPARSE_FLAGS` = 256u;
public const val `NUMPRS_EXPONENT`: `NUMPARSE_FLAGS` = 2048u;
public const val `NUMPRS_HEX_OCT`: `NUMPARSE_FLAGS` = 64u;
public const val `NUMPRS_INEXACT`: `NUMPARSE_FLAGS` = 131072u;
public const val `NUMPRS_LEADING_MINUS`: `NUMPARSE_FLAGS` = 16u;
public const val `NUMPRS_LEADING_PLUS`: `NUMPARSE_FLAGS` = 4u;
public const val `NUMPRS_LEADING_WHITE`: `NUMPARSE_FLAGS` = 1u;
public const val `NUMPRS_NEG`: `NUMPARSE_FLAGS` = 65536u;
public const val `NUMPRS_PARENS`: `NUMPARSE_FLAGS` = 128u;
public const val `NUMPRS_STD`: `NUMPARSE_FLAGS` = 8191u;
public const val `NUMPRS_THOUSANDS`: `NUMPARSE_FLAGS` = 512u;
public const val `NUMPRS_TRAILING_MINUS`: `NUMPARSE_FLAGS` = 32u;
public const val `NUMPRS_TRAILING_PLUS`: `NUMPARSE_FLAGS` = 8u;
public const val `NUMPRS_TRAILING_WHITE`: `NUMPARSE_FLAGS` = 2u;
public const val `NUMPRS_USE_ALL`: `NUMPARSE_FLAGS` = 4096u;
// UNSUPPORTED Rust 1292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OBJECTDESCRIPTOR {
//     pub cbSize: u32,
//     pub clsid: windows_sys::core::GUID,
//     pub dwDrawAspect: u32,
//     pub sizel: super::super::Foundation::SIZE,
//     pub pointl: super::super::Foundation::POINTL,
//     pub dwStatus: u32,
//     pub dwFullUserTypeName: u32,
//     pub dwSrcOfCopy: u32,
// }

public typealias `OBJECT_PROPERTIES_FLAGS` = UInt;
public const val `OCM__BASE`: UInt = 8192u;
// UNSUPPORTED Rust 1306:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCPFIPARAMS {
//     pub cbStructSize: u32,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub x: i32,
//     pub y: i32,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub cObjects: u32,
//     pub lplpUnk: *mut *mut core::ffi::c_void,
//     pub cPages: u32,
//     pub lpPages: *mut windows_sys::core::GUID,
//     pub lcid: u32,
//     pub dispidInitialProperty: i32,
// }

// UNSUPPORTED Rust 1321:1: declaration Impl has no candidate rule
// impl Default for OCPFIPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OF_GET`: UInt = 2u;
public const val `OF_HANDLER`: UInt = 4u;
public const val `OF_SET`: UInt = 1u;
public typealias `OLECLOSE` = Int;
public const val `OLECLOSE_NOSAVE`: `OLECLOSE` = 1;
public const val `OLECLOSE_PROMPTSAVE`: `OLECLOSE` = 2;
public const val `OLECLOSE_SAVEIFDIRTY`: `OLECLOSE` = 0;
// UNSUPPORTED Rust 1333:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OLECMD {
//     pub cmdID: u32,
//     pub cmdf: u32,
// }

public const val `OLECMDARGINDEX_ACTIVEXINSTALL_CLSID`: UInt = 2u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_DISPLAYNAME`: UInt = 1u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_INSTALLSCOPE`: UInt = 3u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_PUBLISHER`: UInt = 0u;
public const val `OLECMDARGINDEX_ACTIVEXINSTALL_SOURCEURL`: UInt = 4u;
public const val `OLECMDARGINDEX_SHOWPAGEACTIONMENU_HWND`: UInt = 0u;
public const val `OLECMDARGINDEX_SHOWPAGEACTIONMENU_X`: UInt = 1u;
public const val `OLECMDARGINDEX_SHOWPAGEACTIONMENU_Y`: UInt = 2u;
public const val `OLECMDERR_E_CANCELED`: Int = -2147221245;
public const val `OLECMDERR_E_DISABLED`: Int = -2147221247;
public const val `OLECMDERR_E_FIRST`: Int = -2147221248;
public const val `OLECMDERR_E_NOHELP`: Int = -2147221246;
public const val `OLECMDERR_E_NOTSUPPORTED`: Int = -2147221248;
public const val `OLECMDERR_E_UNKNOWNGROUP`: Int = -2147221244;
public typealias `OLECMDEXECOPT` = Int;
public const val `OLECMDEXECOPT_DODEFAULT`: `OLECMDEXECOPT` = 0;
public const val `OLECMDEXECOPT_DONTPROMPTUSER`: `OLECMDEXECOPT` = 2;
public const val `OLECMDEXECOPT_PROMPTUSER`: `OLECMDEXECOPT` = 1;
public const val `OLECMDEXECOPT_SHOWHELP`: `OLECMDEXECOPT` = 3;
public typealias `OLECMDF` = Int;
public const val `OLECMDF_DEFHIDEONCTXTMENU`: `OLECMDF` = 32;
public const val `OLECMDF_ENABLED`: `OLECMDF` = 2;
public const val `OLECMDF_INVISIBLE`: `OLECMDF` = 16;
public const val `OLECMDF_LATCHED`: `OLECMDF` = 4;
public const val `OLECMDF_NINCHED`: `OLECMDF` = 8;
public const val `OLECMDF_SUPPORTED`: `OLECMDF` = 1;
public typealias `OLECMDID` = Int;
public const val `OLECMDIDF_BROWSERSTATE_BLOCKEDVERSION`: `OLECMDID_BROWSERSTATEFLAG` = 64;
public const val `OLECMDIDF_BROWSERSTATE_DESKTOPHTMLDIALOG`: `OLECMDID_BROWSERSTATEFLAG` = 32;
public const val `OLECMDIDF_BROWSERSTATE_EXTENSIONSOFF`: `OLECMDID_BROWSERSTATEFLAG` = 1;
public const val `OLECMDIDF_BROWSERSTATE_IESECURITY`: `OLECMDID_BROWSERSTATEFLAG` = 2;
public const val `OLECMDIDF_BROWSERSTATE_PROTECTEDMODE_OFF`: `OLECMDID_BROWSERSTATEFLAG` = 4;
public const val `OLECMDIDF_BROWSERSTATE_REQUIRESACTIVEX`: `OLECMDID_BROWSERSTATEFLAG` = 16;
public const val `OLECMDIDF_BROWSERSTATE_RESET`: `OLECMDID_BROWSERSTATEFLAG` = 8;
public const val `OLECMDIDF_OPTICAL_ZOOM_NOLAYOUT`: `OLECMDID_OPTICAL_ZOOMFLAG` = 16;
public const val `OLECMDIDF_OPTICAL_ZOOM_NOPERSIST`: `OLECMDID_OPTICAL_ZOOMFLAG` = 1;
public const val `OLECMDIDF_OPTICAL_ZOOM_NOTRANSIENT`: `OLECMDID_OPTICAL_ZOOMFLAG` = 32;
public const val `OLECMDIDF_OPTICAL_ZOOM_RELOADFORNEWTAB`: `OLECMDID_OPTICAL_ZOOMFLAG` = 64;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXDISALLOW`: `OLECMDID_PAGEACTIONFLAG` = 16;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXINSTALL`: `OLECMDID_PAGEACTIONFLAG` = 2;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXTRUSTFAIL`: `OLECMDID_PAGEACTIONFLAG` = 4;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXUNSAFE`: `OLECMDID_PAGEACTIONFLAG` = 32;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXUSERAPPROVAL`: `OLECMDID_PAGEACTIONFLAG` = 262144;
public const val `OLECMDIDF_PAGEACTION_ACTIVEXUSERDISABLE`: `OLECMDID_PAGEACTIONFLAG` = 8;
public const val `OLECMDIDF_PAGEACTION_ACTIVEX_EPM_INCOMPATIBLE`: `OLECMDID_PAGEACTIONFLAG` = 16777216;
public const val `OLECMDIDF_PAGEACTION_EXTENSION_COMPAT_BLOCKED`: `OLECMDID_PAGEACTIONFLAG` = 268435456;
public const val `OLECMDIDF_PAGEACTION_FILEDOWNLOAD`: `OLECMDID_PAGEACTIONFLAG` = 1;
public const val `OLECMDIDF_PAGEACTION_GENERIC_STATE`: `OLECMDID_PAGEACTIONFLAG` = 1073741824;
public const val `OLECMDIDF_PAGEACTION_INTRANETZONEREQUEST`: `OLECMDID_PAGEACTIONFLAG` = 2097152;
public const val `OLECMDIDF_PAGEACTION_INVALID_CERT`: `OLECMDID_PAGEACTIONFLAG` = 1048576;
public const val `OLECMDIDF_PAGEACTION_LOCALMACHINE`: `OLECMDID_PAGEACTIONFLAG` = 128;
public const val `OLECMDIDF_PAGEACTION_MIMETEXTPLAIN`: `OLECMDID_PAGEACTIONFLAG` = 256;
public const val `OLECMDIDF_PAGEACTION_MIXEDCONTENT`: `OLECMDID_PAGEACTIONFLAG` = 524288;
public const val `OLECMDIDF_PAGEACTION_NORESETACTIVEX`: `OLECMDID_PAGEACTIONFLAG` = 536870912;
public const val `OLECMDIDF_PAGEACTION_POPUPALLOWED`: `OLECMDID_PAGEACTIONFLAG` = 65536;
public const val `OLECMDIDF_PAGEACTION_POPUPWINDOW`: `OLECMDID_PAGEACTIONFLAG` = 64;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNDENY`: `OLECMDID_PAGEACTIONFLAG` = 32768;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNINTERNET`: `OLECMDID_PAGEACTIONFLAG` = 8192;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNINTRANET`: `OLECMDID_PAGEACTIONFLAG` = 4096;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNLOCALMACHINE`: `OLECMDID_PAGEACTIONFLAG` = 1024;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNRESTRICTED`: `OLECMDID_PAGEACTIONFLAG` = 16384;
public const val `OLECMDIDF_PAGEACTION_PROTLOCKDOWNTRUSTED`: `OLECMDID_PAGEACTIONFLAG` = 2048;
public const val `OLECMDIDF_PAGEACTION_RESET`: `OLECMDID_PAGEACTIONFLAG` = -2147483648;
public const val `OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE`: `OLECMDID_PAGEACTIONFLAG` = 512;
public const val `OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE_ACTIVEXINSTALL`: `OLECMDID_PAGEACTIONFLAG` = 512;
public const val `OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE_ACTIVEXUSERAPPROVAL`: `OLECMDID_PAGEACTIONFLAG` = 33554432;
public const val `OLECMDIDF_PAGEACTION_SCRIPTPROMPT`: `OLECMDID_PAGEACTIONFLAG` = 131072;
public const val `OLECMDIDF_PAGEACTION_SPOOFABLEIDNHOST`: `OLECMDID_PAGEACTIONFLAG` = 8388608;
public const val `OLECMDIDF_PAGEACTION_WPCBLOCKED`: `OLECMDID_PAGEACTIONFLAG` = 67108864;
public const val `OLECMDIDF_PAGEACTION_WPCBLOCKED_ACTIVEX`: `OLECMDID_PAGEACTIONFLAG` = 134217728;
public const val `OLECMDIDF_PAGEACTION_XSSFILTERED`: `OLECMDID_PAGEACTIONFLAG` = 4194304;
public const val `OLECMDIDF_REFRESH_CLEARUSERINPUT`: `OLECMDID_REFRESHFLAG` = 4096;
public const val `OLECMDIDF_REFRESH_COMPLETELY`: `OLECMDID_REFRESHFLAG` = 3;
public const val `OLECMDIDF_REFRESH_CONTINUE`: `OLECMDID_REFRESHFLAG` = 2;
public const val `OLECMDIDF_REFRESH_IFEXPIRED`: `OLECMDID_REFRESHFLAG` = 1;
public const val `OLECMDIDF_REFRESH_LEVELMASK`: `OLECMDID_REFRESHFLAG` = 255;
public const val `OLECMDIDF_REFRESH_NORMAL`: `OLECMDID_REFRESHFLAG` = 0;
public const val `OLECMDIDF_REFRESH_NO_CACHE`: `OLECMDID_REFRESHFLAG` = 4;
public const val `OLECMDIDF_REFRESH_PAGEACTION_ACTIVEXINSTALL`: `OLECMDID_REFRESHFLAG` = 65536;
public const val `OLECMDIDF_REFRESH_PAGEACTION_ALLOW_VERSION`: `OLECMDID_REFRESHFLAG` = 134217728;
public const val `OLECMDIDF_REFRESH_PAGEACTION_FILEDOWNLOAD`: `OLECMDID_REFRESHFLAG` = 131072;
public const val `OLECMDIDF_REFRESH_PAGEACTION_INVALID_CERT`: `OLECMDID_REFRESHFLAG` = 67108864;
public const val `OLECMDIDF_REFRESH_PAGEACTION_LOCALMACHINE`: `OLECMDID_REFRESHFLAG` = 262144;
public const val `OLECMDIDF_REFRESH_PAGEACTION_MIXEDCONTENT`: `OLECMDID_REFRESHFLAG` = 33554432;
public const val `OLECMDIDF_REFRESH_PAGEACTION_POPUPWINDOW`: `OLECMDID_REFRESHFLAG` = 524288;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNINTERNET`: `OLECMDID_REFRESHFLAG` = 8388608;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNINTRANET`: `OLECMDID_REFRESHFLAG` = 4194304;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNLOCALMACHINE`: `OLECMDID_REFRESHFLAG` = 1048576;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNRESTRICTED`: `OLECMDID_REFRESHFLAG` = 16777216;
public const val `OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNTRUSTED`: `OLECMDID_REFRESHFLAG` = 2097152;
public const val `OLECMDIDF_REFRESH_PROMPTIFOFFLINE`: `OLECMDID_REFRESHFLAG` = 8192;
public const val `OLECMDIDF_REFRESH_RELOAD`: `OLECMDID_REFRESHFLAG` = 5;
public const val `OLECMDIDF_REFRESH_SKIPBEFOREUNLOADEVENT`: `OLECMDID_REFRESHFLAG` = 32768;
public const val `OLECMDIDF_REFRESH_THROUGHSCRIPT`: `OLECMDID_REFRESHFLAG` = 16384;
public const val `OLECMDIDF_VIEWPORTMODE_EXCLUDE_VISUAL_BOTTOM`: `OLECMDID_VIEWPORT_MODE_FLAG` = 2;
public const val `OLECMDIDF_VIEWPORTMODE_EXCLUDE_VISUAL_BOTTOM_VALID`: `OLECMDID_VIEWPORT_MODE_FLAG` = 131072;
public const val `OLECMDIDF_VIEWPORTMODE_FIXED_LAYOUT_WIDTH`: `OLECMDID_VIEWPORT_MODE_FLAG` = 1;
public const val `OLECMDIDF_VIEWPORTMODE_FIXED_LAYOUT_WIDTH_VALID`: `OLECMDID_VIEWPORT_MODE_FLAG` = 65536;
public const val `OLECMDIDF_WINDOWSTATE_ENABLED`: `OLECMDID_WINDOWSTATE_FLAG` = 2;
public const val `OLECMDIDF_WINDOWSTATE_ENABLED_VALID`: `OLECMDID_WINDOWSTATE_FLAG` = 131072;
public const val `OLECMDIDF_WINDOWSTATE_USERVISIBLE`: `OLECMDID_WINDOWSTATE_FLAG` = 1;
public const val `OLECMDIDF_WINDOWSTATE_USERVISIBLE_VALID`: `OLECMDID_WINDOWSTATE_FLAG` = 65536;
public const val `OLECMDID_ACTIVEXINSTALLSCOPE`: `OLECMDID` = 66;
public const val `OLECMDID_ADDTRAVELENTRY`: `OLECMDID` = 60;
public const val `OLECMDID_ALLOWUILESSSAVEAS`: `OLECMDID` = 46;
public typealias `OLECMDID_BROWSERSTATEFLAG` = Int;
public const val `OLECMDID_CLEARSELECTION`: `OLECMDID` = 18;
public const val `OLECMDID_CLOSE`: `OLECMDID` = 45;
public const val `OLECMDID_COPY`: `OLECMDID` = 12;
public const val `OLECMDID_CUT`: `OLECMDID` = 11;
public const val `OLECMDID_DELETE`: `OLECMDID` = 33;
public const val `OLECMDID_DONTDOWNLOADCSS`: `OLECMDID` = 47;
public const val `OLECMDID_ENABLE_INTERACTION`: `OLECMDID` = 36;
public const val `OLECMDID_ENABLE_VISIBILITY`: `OLECMDID` = 77;
public const val `OLECMDID_EXITFULLSCREEN`: `OLECMDID` = 81;
public const val `OLECMDID_FIND`: `OLECMDID` = 32;
public const val `OLECMDID_FOCUSVIEWCONTROLS`: `OLECMDID` = 57;
public const val `OLECMDID_FOCUSVIEWCONTROLSQUERY`: `OLECMDID` = 58;
public const val `OLECMDID_GETPRINTTEMPLATE`: `OLECMDID` = 52;
public const val `OLECMDID_GETUSERSCALABLE`: `OLECMDID` = 75;
public const val `OLECMDID_GETZOOMRANGE`: `OLECMDID` = 20;
public const val `OLECMDID_HIDETOOLBARS`: `OLECMDID` = 24;
public const val `OLECMDID_HTTPEQUIV`: `OLECMDID` = 34;
public const val `OLECMDID_HTTPEQUIV_DONE`: `OLECMDID` = 35;
public const val `OLECMDID_LAYOUT_VIEWPORT_WIDTH`: `OLECMDID` = 71;
public const val `OLECMDID_MEDIA_PLAYBACK`: `OLECMDID` = 78;
public const val `OLECMDID_NEW`: `OLECMDID` = 2;
public const val `OLECMDID_ONBEFOREUNLOAD`: `OLECMDID` = 83;
public const val `OLECMDID_ONTOOLBARACTIVATED`: `OLECMDID` = 31;
public const val `OLECMDID_ONUNLOAD`: `OLECMDID` = 37;
public const val `OLECMDID_OPEN`: `OLECMDID` = 1;
public const val `OLECMDID_OPTICAL_GETZOOMRANGE`: `OLECMDID` = 64;
public const val `OLECMDID_OPTICAL_ZOOM`: `OLECMDID` = 63;
public typealias `OLECMDID_OPTICAL_ZOOMFLAG` = Int;
public const val `OLECMDID_PAGEACTIONBLOCKED`: `OLECMDID` = 55;
public typealias `OLECMDID_PAGEACTIONFLAG` = Int;
public const val `OLECMDID_PAGEACTIONUIQUERY`: `OLECMDID` = 56;
public const val `OLECMDID_PAGEAVAILABLE`: `OLECMDID` = 74;
public const val `OLECMDID_PAGESETUP`: `OLECMDID` = 8;
public const val `OLECMDID_PASTE`: `OLECMDID` = 13;
public const val `OLECMDID_PASTESPECIAL`: `OLECMDID` = 14;
public const val `OLECMDID_POPSTATEEVENT`: `OLECMDID` = 69;
public const val `OLECMDID_PREREFRESH`: `OLECMDID` = 39;
public const val `OLECMDID_PRINT`: `OLECMDID` = 6;
public const val `OLECMDID_PRINT2`: `OLECMDID` = 49;
public const val `OLECMDID_PRINTPREVIEW`: `OLECMDID` = 7;
public const val `OLECMDID_PRINTPREVIEW2`: `OLECMDID` = 50;
public const val `OLECMDID_PROPERTIES`: `OLECMDID` = 10;
public const val `OLECMDID_PROPERTYBAG2`: `OLECMDID` = 38;
public const val `OLECMDID_REDO`: `OLECMDID` = 16;
public const val `OLECMDID_REFRESH`: `OLECMDID` = 22;
public typealias `OLECMDID_REFRESHFLAG` = Int;
public const val `OLECMDID_SAVE`: `OLECMDID` = 3;
public const val `OLECMDID_SAVEAS`: `OLECMDID` = 4;
public const val `OLECMDID_SAVECOPYAS`: `OLECMDID` = 5;
public const val `OLECMDID_SCROLLCOMPLETE`: `OLECMDID` = 82;
public const val `OLECMDID_SELECTALL`: `OLECMDID` = 17;
public const val `OLECMDID_SETDOWNLOADSTATE`: `OLECMDID` = 29;
public const val `OLECMDID_SETFAVICON`: `OLECMDID` = 79;
public const val `OLECMDID_SETPRINTTEMPLATE`: `OLECMDID` = 51;
public const val `OLECMDID_SETPROGRESSMAX`: `OLECMDID` = 25;
public const val `OLECMDID_SETPROGRESSPOS`: `OLECMDID` = 26;
public const val `OLECMDID_SETPROGRESSTEXT`: `OLECMDID` = 27;
public const val `OLECMDID_SETTITLE`: `OLECMDID` = 28;
public const val `OLECMDID_SET_HOST_FULLSCREENMODE`: `OLECMDID` = 80;
public const val `OLECMDID_SHOWFIND`: `OLECMDID` = 42;
public const val `OLECMDID_SHOWMESSAGE`: `OLECMDID` = 41;
public const val `OLECMDID_SHOWMESSAGE_BLOCKABLE`: `OLECMDID` = 84;
public const val `OLECMDID_SHOWPAGEACTIONMENU`: `OLECMDID` = 59;
public const val `OLECMDID_SHOWPAGESETUP`: `OLECMDID` = 43;
public const val `OLECMDID_SHOWPRINT`: `OLECMDID` = 44;
public const val `OLECMDID_SHOWSCRIPTERROR`: `OLECMDID` = 40;
public const val `OLECMDID_SHOWTASKDLG`: `OLECMDID` = 68;
public const val `OLECMDID_SHOWTASKDLG_BLOCKABLE`: `OLECMDID` = 85;
public const val `OLECMDID_SPELL`: `OLECMDID` = 9;
public const val `OLECMDID_STOP`: `OLECMDID` = 23;
public const val `OLECMDID_STOPDOWNLOAD`: `OLECMDID` = 30;
public const val `OLECMDID_UNDO`: `OLECMDID` = 15;
public const val `OLECMDID_UPDATEBACKFORWARDSTATE`: `OLECMDID` = 62;
public const val `OLECMDID_UPDATECOMMANDS`: `OLECMDID` = 21;
public const val `OLECMDID_UPDATEPAGESTATUS`: `OLECMDID` = 48;
public const val `OLECMDID_UPDATETRAVELENTRY`: `OLECMDID` = 61;
public const val `OLECMDID_UPDATETRAVELENTRY_DATARECOVERY`: `OLECMDID` = 67;
public const val `OLECMDID_UPDATE_CARET`: `OLECMDID` = 76;
public const val `OLECMDID_USER_OPTICAL_ZOOM`: `OLECMDID` = 73;
public const val `OLECMDID_VIEWPORT_MODE`: `OLECMDID` = 70;
public typealias `OLECMDID_VIEWPORT_MODE_FLAG` = Int;
public const val `OLECMDID_VISUAL_VIEWPORT_EXCLUDE_BOTTOM`: `OLECMDID` = 72;
public const val `OLECMDID_WINDOWSTATECHANGED`: `OLECMDID` = 65;
public typealias `OLECMDID_WINDOWSTATE_FLAG` = Int;
public const val `OLECMDID_ZOOM`: `OLECMDID` = 19;
// UNSUPPORTED Rust 1530:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLECMDTEXT {
//     pub cmdtextf: u32,
//     pub cwActual: u32,
//     pub cwBuf: u32,
//     pub rgwz: [u16; 1],
// }

// UNSUPPORTED Rust 1538:1: declaration Impl has no candidate rule
// impl Default for OLECMDTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLECMDTEXTF` = Int;
public const val `OLECMDTEXTF_NAME`: `OLECMDTEXTF` = 1;
public const val `OLECMDTEXTF_NONE`: `OLECMDTEXTF` = 0;
public const val `OLECMDTEXTF_STATUS`: `OLECMDTEXTF` = 2;
public const val `OLECMD_TASKDLGID_ONBEFOREUNLOAD`: UInt = 1u;
public typealias `OLECONTF` = Int;
public const val `OLECONTF_EMBEDDINGS`: `OLECONTF` = 1;
public const val `OLECONTF_LINKS`: `OLECONTF` = 2;
public const val `OLECONTF_ONLYIFRUNNING`: `OLECONTF` = 16;
public const val `OLECONTF_ONLYUSER`: `OLECONTF` = 8;
public const val `OLECONTF_OTHERS`: `OLECONTF` = 4;
public typealias `OLECREATE` = UInt;
public const val `OLECREATE_LEAVERUNNING`: `OLECREATE` = 1u;
public const val `OLECREATE_ZERO`: `OLECREATE` = 0u;
public typealias `OLEDCFLAGS` = Int;
public const val `OLEDC_NODRAW`: `OLEDCFLAGS` = 1;
public const val `OLEDC_OFFSCREEN`: `OLEDCFLAGS` = 4;
public const val `OLEDC_PAINTBKGND`: `OLEDCFLAGS` = 2;
public typealias `OLEGETMONIKER` = Int;
public const val `OLEGETMONIKER_FORCEASSIGN`: `OLEGETMONIKER` = 2;
public const val `OLEGETMONIKER_ONLYIFTHERE`: `OLEGETMONIKER` = 1;
public const val `OLEGETMONIKER_TEMPFORUSER`: `OLEGETMONIKER` = 4;
public const val `OLEGETMONIKER_UNASSIGN`: `OLEGETMONIKER` = 3;
// UNSUPPORTED Rust 1566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct OLEINPLACEFRAMEINFO {
//     pub cb: u32,
//     pub fMDIApp: windows_sys::core::BOOL,
//     pub hwndFrame: super::super::Foundation::HWND,
//     pub haccel: super::super::UI::WindowsAndMessaging::HACCEL,
//     pub cAccelEntries: u32,
// }

// UNSUPPORTED Rust 1576:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OLEINPLACEFRAMEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEIVERB` = Int;
public const val `OLEIVERB_DISCARDUNDOSTATE`: `OLEIVERB` = -6;
public const val `OLEIVERB_HIDE`: `OLEIVERB` = -3;
public const val `OLEIVERB_INPLACEACTIVATE`: `OLEIVERB` = -5;
public const val `OLEIVERB_OPEN`: `OLEIVERB` = -2;
public const val `OLEIVERB_PRIMARY`: `OLEIVERB` = 0;
public const val `OLEIVERB_PROPERTIES`: Int = -7;
public const val `OLEIVERB_SHOW`: `OLEIVERB` = -1;
public const val `OLEIVERB_UIACTIVATE`: `OLEIVERB` = -4;
public typealias `OLELINKBIND` = Int;
public const val `OLELINKBIND_EVENIFCLASSDIFF`: `OLELINKBIND` = 1;
// UNSUPPORTED Rust 1593:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLEMENUGROUPWIDTHS {
//     pub width: [i32; 6],
// }

// UNSUPPORTED Rust 1598:1: declaration Impl has no candidate rule
// impl Default for OLEMENUGROUPWIDTHS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEMISC` = Int;
public const val `OLEMISC_ACTIVATEWHENVISIBLE`: `OLEMISC` = 256;
public const val `OLEMISC_ACTSLIKEBUTTON`: `OLEMISC` = 4096;
public const val `OLEMISC_ACTSLIKELABEL`: `OLEMISC` = 8192;
public const val `OLEMISC_ALIGNABLE`: `OLEMISC` = 32768;
public const val `OLEMISC_ALWAYSRUN`: `OLEMISC` = 2048;
public const val `OLEMISC_CANLINKBYOLE1`: `OLEMISC` = 32;
public const val `OLEMISC_CANTLINKINSIDE`: `OLEMISC` = 16;
public const val `OLEMISC_IGNOREACTIVATEWHENVISIBLE`: `OLEMISC` = 524288;
public const val `OLEMISC_IMEMODE`: `OLEMISC` = 262144;
public const val `OLEMISC_INSERTNOTREPLACE`: `OLEMISC` = 4;
public const val `OLEMISC_INSIDEOUT`: `OLEMISC` = 128;
public const val `OLEMISC_INVISIBLEATRUNTIME`: `OLEMISC` = 1024;
public const val `OLEMISC_ISLINKOBJECT`: `OLEMISC` = 64;
public const val `OLEMISC_NOUIACTIVATE`: `OLEMISC` = 16384;
public const val `OLEMISC_ONLYICONIC`: `OLEMISC` = 2;
public const val `OLEMISC_RECOMPOSEONRESIZE`: `OLEMISC` = 1;
public const val `OLEMISC_RENDERINGISDEVICEINDEPENDENT`: `OLEMISC` = 512;
public const val `OLEMISC_SETCLIENTSITEFIRST`: `OLEMISC` = 131072;
public const val `OLEMISC_SIMPLEFRAME`: `OLEMISC` = 65536;
public const val `OLEMISC_STATIC`: `OLEMISC` = 8;
public const val `OLEMISC_SUPPORTSMULTILEVELUNDO`: `OLEMISC` = 2097152;
public const val `OLEMISC_WANTSTOMENUMERGE`: `OLEMISC` = 1048576;
public typealias `OLERENDER` = Int;
public const val `OLERENDER_ASIS`: `OLERENDER` = 3;
public const val `OLERENDER_DRAW`: `OLERENDER` = 1;
public const val `OLERENDER_FORMAT`: `OLERENDER` = 2;
public const val `OLERENDER_NONE`: `OLERENDER` = 0;
// UNSUPPORTED Rust 1631:1: non-scalar type Ptr unsupported
// pub const OLESTDDELIM: windows_sys::core::PCWSTR = windows_sys::core::w!("\\");

// UNSUPPORTED Rust 1632:1: generic scalar type unsupported
// pub type OLESTREAMQUERYCONVERTOLELINKCALLBACK = Option<unsafe extern "system" fn(pclsid: *const windows_sys::core::GUID, szclass: windows_sys::core::PCWSTR, sztopicname: windows_sys::core::PCWSTR, szitemname: windows_sys::core::PCWSTR, szuncname: windows_sys::core::PCWSTR, linkupdatingoption: u32, pvcontext: *const core::ffi::c_void) -> windows_sys::core::HRESULT>;

public const val `OLESTREAM_CONVERSION_DEFAULT`: Int = 0;
public const val `OLESTREAM_CONVERSION_DISABLEOLELINK`: Int = 1;
// UNSUPPORTED Rust 1635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Media")]
// #[derive(Clone, Copy)]
// pub struct OLEUIBUSYA {
//     pub cbStruct: u32,
//     pub dwFlags: BUSY_DIALOG_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub hTask: super::super::Media::HTASK,
//     pub lphWndDialog: *mut super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 1651:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Media")]
// impl Default for OLEUIBUSYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Media")]
// #[derive(Clone, Copy)]
// pub struct OLEUIBUSYW {
//     pub cbStruct: u32,
//     pub dwFlags: BUSY_DIALOG_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCWSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub hTask: super::super::Media::HTASK,
//     pub lphWndDialog: *mut super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 1673:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Media")]
// impl Default for OLEUIBUSYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLEUICHANGEICONA {
//     pub cbStruct: u32,
//     pub dwFlags: CHANGE_ICON_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
//     pub clsid: windows_sys::core::GUID,
//     pub szIconExe: [i8; 260],
//     pub cchIconExe: i32,
// }

// UNSUPPORTED Rust 1696:1: declaration Impl has no candidate rule
// impl Default for OLEUICHANGEICONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLEUICHANGEICONW {
//     pub cbStruct: u32,
//     pub dwFlags: CHANGE_ICON_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCWSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
//     pub clsid: windows_sys::core::GUID,
//     pub szIconExe: [u16; 260],
//     pub cchIconExe: i32,
// }

// UNSUPPORTED Rust 1718:1: declaration Impl has no candidate rule
// impl Default for OLEUICHANGEICONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1723:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// #[derive(Clone, Copy)]
// pub struct OLEUICHANGESOURCEA {
//     pub cbStruct: u32,
//     pub dwFlags: CHANGE_SOURCE_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub lpOFN: *mut super::super::UI::Controls::Dialogs::OPENFILENAMEA,
//     pub dwReserved1: [u32; 4],
//     pub lpOleUILinkContainer: *mut core::ffi::c_void,
//     pub dwLink: u32,
//     pub lpszDisplayName: windows_sys::core::PSTR,
//     pub nFileLength: u32,
//     pub lpszFrom: windows_sys::core::PSTR,
//     pub lpszTo: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1745:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// impl Default for OLEUICHANGESOURCEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// #[derive(Clone, Copy)]
// pub struct OLEUICHANGESOURCEW {
//     pub cbStruct: u32,
//     pub dwFlags: CHANGE_SOURCE_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCWSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub lpOFN: *mut super::super::UI::Controls::Dialogs::OPENFILENAMEW,
//     pub dwReserved1: [u32; 4],
//     pub lpOleUILinkContainer: *mut core::ffi::c_void,
//     pub dwLink: u32,
//     pub lpszDisplayName: windows_sys::core::PWSTR,
//     pub nFileLength: u32,
//     pub lpszFrom: windows_sys::core::PWSTR,
//     pub lpszTo: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1773:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// impl Default for OLEUICHANGESOURCEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1779:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLEUICONVERTA {
//     pub cbStruct: u32,
//     pub dwFlags: UI_CONVERT_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub clsid: windows_sys::core::GUID,
//     pub clsidConvertDefault: windows_sys::core::GUID,
//     pub clsidActivateDefault: windows_sys::core::GUID,
//     pub clsidNew: windows_sys::core::GUID,
//     pub dvAspect: u32,
//     pub wFormat: u16,
//     pub fIsLinkedObject: windows_sys::core::BOOL,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
//     pub lpszUserType: windows_sys::core::PSTR,
//     pub fObjectsIconChanged: windows_sys::core::BOOL,
//     pub lpszDefLabel: windows_sys::core::PSTR,
//     pub cClsidExclude: u32,
//     pub lpClsidExclude: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1805:1: declaration Impl has no candidate rule
// impl Default for OLEUICONVERTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1810:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLEUICONVERTW {
//     pub cbStruct: u32,
//     pub dwFlags: UI_CONVERT_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCWSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub clsid: windows_sys::core::GUID,
//     pub clsidConvertDefault: windows_sys::core::GUID,
//     pub clsidActivateDefault: windows_sys::core::GUID,
//     pub clsidNew: windows_sys::core::GUID,
//     pub dvAspect: u32,
//     pub wFormat: u16,
//     pub fIsLinkedObject: windows_sys::core::BOOL,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
//     pub lpszUserType: windows_sys::core::PWSTR,
//     pub fObjectsIconChanged: windows_sys::core::BOOL,
//     pub lpszDefLabel: windows_sys::core::PWSTR,
//     pub cClsidExclude: u32,
//     pub lpClsidExclude: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1836:1: declaration Impl has no candidate rule
// impl Default for OLEUICONVERTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1841:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLEUIEDITLINKSA {
//     pub cbStruct: u32,
//     pub dwFlags: EDIT_LINKS_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub lpOleUILinkContainer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1855:1: declaration Impl has no candidate rule
// impl Default for OLEUIEDITLINKSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1860:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OLEUIEDITLINKSW {
//     pub cbStruct: u32,
//     pub dwFlags: EDIT_LINKS_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCWSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub lpOleUILinkContainer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1874:1: declaration Impl has no candidate rule
// impl Default for OLEUIEDITLINKSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUIGNRLPROPSA {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub dwReserved1: [u32; 2],
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub dwReserved2: [u32; 3],
//     pub lpOP: *mut OLEUIOBJECTPROPSA,
// }

// UNSUPPORTED Rust 1891:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIGNRLPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1897:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUIGNRLPROPSW {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub dwReserved1: [u32; 2],
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub dwReserved2: [u32; 3],
//     pub lpOP: *mut OLEUIOBJECTPROPSW,
// }

// UNSUPPORTED Rust 1909:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIGNRLPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1915:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// #[derive(Clone, Copy)]
// pub struct OLEUIINSERTOBJECTA {
//     pub cbStruct: u32,
//     pub dwFlags: INSERT_OBJECT_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub clsid: windows_sys::core::GUID,
//     pub lpszFile: windows_sys::core::PSTR,
//     pub cchFile: u32,
//     pub cClsidExclude: u32,
//     pub lpClsidExclude: *mut windows_sys::core::GUID,
//     pub iid: windows_sys::core::GUID,
//     pub oleRender: u32,
//     pub lpFormatEtc: *mut super::Com::FORMATETC,
//     pub lpIOleClientSite: *mut core::ffi::c_void,
//     pub lpIStorage: *mut core::ffi::c_void,
//     pub ppvObj: *mut *mut core::ffi::c_void,
//     pub sc: i32,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 1942:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OLEUIINSERTOBJECTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1948:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// #[derive(Clone, Copy)]
// pub struct OLEUIINSERTOBJECTW {
//     pub cbStruct: u32,
//     pub dwFlags: INSERT_OBJECT_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCWSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub clsid: windows_sys::core::GUID,
//     pub lpszFile: windows_sys::core::PWSTR,
//     pub cchFile: u32,
//     pub cClsidExclude: u32,
//     pub lpClsidExclude: *mut windows_sys::core::GUID,
//     pub iid: windows_sys::core::GUID,
//     pub oleRender: u32,
//     pub lpFormatEtc: *mut super::Com::FORMATETC,
//     pub lpIOleClientSite: *mut core::ffi::c_void,
//     pub lpIStorage: *mut core::ffi::c_void,
//     pub ppvObj: *mut *mut core::ffi::c_void,
//     pub sc: i32,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
// }

// UNSUPPORTED Rust 1975:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OLEUIINSERTOBJECTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1981:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUILINKPROPSA {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub dwReserved1: [u32; 2],
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub dwReserved2: [u32; 3],
//     pub lpOP: *mut OLEUIOBJECTPROPSA,
// }

// UNSUPPORTED Rust 1993:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUILINKPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1999:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUILINKPROPSW {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub dwReserved1: [u32; 2],
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub dwReserved2: [u32; 3],
//     pub lpOP: *mut OLEUIOBJECTPROPSW,
// }

// UNSUPPORTED Rust 2011:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUILINKPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUIOBJECTPROPSA {
//     pub cbStruct: u32,
//     pub dwFlags: OBJECT_PROPERTIES_FLAGS,
//     pub lpPS: *mut super::super::UI::Controls::PROPSHEETHEADERA_V2,
//     pub dwObject: u32,
//     pub lpObjInfo: *mut core::ffi::c_void,
//     pub dwLink: u32,
//     pub lpLinkInfo: *mut core::ffi::c_void,
//     pub lpGP: *mut OLEUIGNRLPROPSA,
//     pub lpVP: *mut OLEUIVIEWPROPSA,
//     pub lpLP: *mut OLEUILINKPROPSA,
// }

// UNSUPPORTED Rust 2032:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIOBJECTPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2038:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUIOBJECTPROPSW {
//     pub cbStruct: u32,
//     pub dwFlags: OBJECT_PROPERTIES_FLAGS,
//     pub lpPS: *mut super::super::UI::Controls::PROPSHEETHEADERW_V2,
//     pub dwObject: u32,
//     pub lpObjInfo: *mut core::ffi::c_void,
//     pub dwLink: u32,
//     pub lpLinkInfo: *mut core::ffi::c_void,
//     pub lpGP: *mut OLEUIGNRLPROPSW,
//     pub lpVP: *mut OLEUIVIEWPROPSW,
//     pub lpLP: *mut OLEUILINKPROPSW,
// }

// UNSUPPORTED Rust 2053:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIOBJECTPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2059:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct OLEUIPASTEENTRYA {
//     pub fmtetc: super::Com::FORMATETC,
//     pub lpstrFormatName: windows_sys::core::PCSTR,
//     pub lpstrResultText: windows_sys::core::PCSTR,
//     pub dwFlags: u32,
//     pub dwScratchSpace: u32,
// }

// UNSUPPORTED Rust 2069:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTEENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2075:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct OLEUIPASTEENTRYW {
//     pub fmtetc: super::Com::FORMATETC,
//     pub lpstrFormatName: windows_sys::core::PCWSTR,
//     pub lpstrResultText: windows_sys::core::PCWSTR,
//     pub dwFlags: u32,
//     pub dwScratchSpace: u32,
// }

// UNSUPPORTED Rust 2085:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTEENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEUIPASTEFLAG` = Int;
// UNSUPPORTED Rust 2092:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct OLEUIPASTESPECIALA {
//     pub cbStruct: u32,
//     pub dwFlags: PASTE_SPECIAL_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub lpSrcDataObj: *mut core::ffi::c_void,
//     pub arrPasteEntries: *mut OLEUIPASTEENTRYA,
//     pub cPasteEntries: i32,
//     pub arrLinkTypes: *mut u32,
//     pub cLinkTypes: i32,
//     pub cClsidExclude: u32,
//     pub lpClsidExclude: *mut windows_sys::core::GUID,
//     pub nSelectedIndex: i32,
//     pub fLink: windows_sys::core::BOOL,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
//     pub sizel: super::super::Foundation::SIZE,
// }

// UNSUPPORTED Rust 2117:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTESPECIALA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct OLEUIPASTESPECIALW {
//     pub cbStruct: u32,
//     pub dwFlags: PASTE_SPECIAL_FLAGS,
//     pub hWndOwner: super::super::Foundation::HWND,
//     pub lpszCaption: windows_sys::core::PCWSTR,
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub lpszTemplate: windows_sys::core::PCWSTR,
//     pub hResource: super::super::Foundation::HRSRC,
//     pub lpSrcDataObj: *mut core::ffi::c_void,
//     pub arrPasteEntries: *mut OLEUIPASTEENTRYW,
//     pub cPasteEntries: i32,
//     pub arrLinkTypes: *mut u32,
//     pub cLinkTypes: i32,
//     pub cClsidExclude: u32,
//     pub lpClsidExclude: *mut windows_sys::core::GUID,
//     pub nSelectedIndex: i32,
//     pub fLink: windows_sys::core::BOOL,
//     pub hMetaPict: super::super::Foundation::HGLOBAL,
//     pub sizel: super::super::Foundation::SIZE,
// }

// UNSUPPORTED Rust 2148:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for OLEUIPASTESPECIALW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OLEUIPASTE_ENABLEICON`: `OLEUIPASTEFLAG` = 2048;
public const val `OLEUIPASTE_LINKANYTYPE`: `OLEUIPASTEFLAG` = 1024;
public const val `OLEUIPASTE_LINKTYPE1`: `OLEUIPASTEFLAG` = 1;
public const val `OLEUIPASTE_LINKTYPE2`: `OLEUIPASTEFLAG` = 2;
public const val `OLEUIPASTE_LINKTYPE3`: `OLEUIPASTEFLAG` = 4;
public const val `OLEUIPASTE_LINKTYPE4`: `OLEUIPASTEFLAG` = 8;
public const val `OLEUIPASTE_LINKTYPE5`: `OLEUIPASTEFLAG` = 16;
public const val `OLEUIPASTE_LINKTYPE6`: `OLEUIPASTEFLAG` = 32;
public const val `OLEUIPASTE_LINKTYPE7`: `OLEUIPASTEFLAG` = 64;
public const val `OLEUIPASTE_LINKTYPE8`: `OLEUIPASTEFLAG` = 128;
public const val `OLEUIPASTE_PASTE`: `OLEUIPASTEFLAG` = 512;
public const val `OLEUIPASTE_PASTEONLY`: `OLEUIPASTEFLAG` = 0;
// UNSUPPORTED Rust 2166:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUIVIEWPROPSA {
//     pub cbStruct: u32,
//     pub dwFlags: VIEW_OBJECT_PROPERTIES_FLAGS,
//     pub dwReserved1: [u32; 2],
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub dwReserved2: [u32; 3],
//     pub lpOP: *mut OLEUIOBJECTPROPSA,
//     pub nScaleMin: i32,
//     pub nScaleMax: i32,
// }

// UNSUPPORTED Rust 2180:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIVIEWPROPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2186:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct OLEUIVIEWPROPSW {
//     pub cbStruct: u32,
//     pub dwFlags: VIEW_OBJECT_PROPERTIES_FLAGS,
//     pub dwReserved1: [u32; 2],
//     pub lpfnHook: LPFNOLEUIHOOK,
//     pub lCustData: super::super::Foundation::LPARAM,
//     pub dwReserved2: [u32; 3],
//     pub lpOP: *mut OLEUIOBJECTPROPSW,
//     pub nScaleMin: i32,
//     pub nScaleMax: i32,
// }

// UNSUPPORTED Rust 2200:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for OLEUIVIEWPROPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OLEUI_BZERR_HTASKINVALID`: UInt = 116u;
public const val `OLEUI_BZ_CALLUNBLOCKED`: UInt = 119u;
public const val `OLEUI_BZ_RETRYSELECTED`: UInt = 118u;
public const val `OLEUI_BZ_SWITCHTOSELECTED`: UInt = 117u;
public const val `OLEUI_CANCEL`: UInt = 2u;
public const val `OLEUI_CIERR_MUSTHAVECLSID`: UInt = 116u;
public const val `OLEUI_CIERR_MUSTHAVECURRENTMETAFILE`: UInt = 117u;
public const val `OLEUI_CIERR_SZICONEXEINVALID`: UInt = 118u;
public const val `OLEUI_CSERR_FROMNOTNULL`: UInt = 118u;
public const val `OLEUI_CSERR_LINKCNTRINVALID`: UInt = 117u;
public const val `OLEUI_CSERR_LINKCNTRNULL`: UInt = 116u;
public const val `OLEUI_CSERR_SOURCEINVALID`: UInt = 121u;
public const val `OLEUI_CSERR_SOURCENULL`: UInt = 120u;
public const val `OLEUI_CSERR_SOURCEPARSEERROR`: UInt = 122u;
public const val `OLEUI_CSERR_SOURCEPARSERROR`: UInt = 122u;
public const val `OLEUI_CSERR_TONOTNULL`: UInt = 119u;
public const val `OLEUI_CTERR_CBFORMATINVALID`: UInt = 119u;
public const val `OLEUI_CTERR_CLASSIDINVALID`: UInt = 117u;
public const val `OLEUI_CTERR_DVASPECTINVALID`: UInt = 118u;
public const val `OLEUI_CTERR_HMETAPICTINVALID`: UInt = 120u;
public const val `OLEUI_CTERR_STRINGINVALID`: UInt = 121u;
public const val `OLEUI_ELERR_LINKCNTRINVALID`: UInt = 117u;
public const val `OLEUI_ELERR_LINKCNTRNULL`: UInt = 116u;
public const val `OLEUI_ERR_CBSTRUCTINCORRECT`: UInt = 103u;
public const val `OLEUI_ERR_DIALOGFAILURE`: UInt = 112u;
public const val `OLEUI_ERR_FINDTEMPLATEFAILURE`: UInt = 110u;
public const val `OLEUI_ERR_GLOBALMEMALLOC`: UInt = 114u;
public const val `OLEUI_ERR_HINSTANCEINVALID`: UInt = 107u;
public const val `OLEUI_ERR_HRESOURCEINVALID`: UInt = 109u;
public const val `OLEUI_ERR_HWNDOWNERINVALID`: UInt = 104u;
public const val `OLEUI_ERR_LOADSTRING`: UInt = 115u;
public const val `OLEUI_ERR_LOADTEMPLATEFAILURE`: UInt = 111u;
public const val `OLEUI_ERR_LOCALMEMALLOC`: UInt = 113u;
public const val `OLEUI_ERR_LPFNHOOKINVALID`: UInt = 106u;
public const val `OLEUI_ERR_LPSZCAPTIONINVALID`: UInt = 105u;
public const val `OLEUI_ERR_LPSZTEMPLATEINVALID`: UInt = 108u;
public const val `OLEUI_ERR_OLEMEMALLOC`: UInt = 100u;
public const val `OLEUI_ERR_STANDARDMAX`: UInt = 116u;
public const val `OLEUI_ERR_STANDARDMIN`: UInt = 100u;
public const val `OLEUI_ERR_STRUCTUREINVALID`: UInt = 102u;
public const val `OLEUI_ERR_STRUCTURENULL`: UInt = 101u;
public const val `OLEUI_FALSE`: UInt = 0u;
public const val `OLEUI_GPERR_CBFORMATINVALID`: UInt = 130u;
public const val `OLEUI_GPERR_CLASSIDINVALID`: UInt = 128u;
public const val `OLEUI_GPERR_LPCLSIDEXCLUDEINVALID`: UInt = 129u;
public const val `OLEUI_GPERR_STRINGINVALID`: UInt = 127u;
public const val `OLEUI_IOERR_ARRLINKTYPESINVALID`: UInt = 118u;
public const val `OLEUI_IOERR_ARRPASTEENTRIESINVALID`: UInt = 117u;
public const val `OLEUI_IOERR_CCHFILEINVALID`: UInt = 125u;
public const val `OLEUI_IOERR_HICONINVALID`: UInt = 118u;
public const val `OLEUI_IOERR_LPCLSIDEXCLUDEINVALID`: UInt = 124u;
public const val `OLEUI_IOERR_LPFORMATETCINVALID`: UInt = 119u;
public const val `OLEUI_IOERR_LPIOLECLIENTSITEINVALID`: UInt = 121u;
public const val `OLEUI_IOERR_LPISTORAGEINVALID`: UInt = 122u;
public const val `OLEUI_IOERR_LPSZFILEINVALID`: UInt = 116u;
public const val `OLEUI_IOERR_LPSZLABELINVALID`: UInt = 117u;
public const val `OLEUI_IOERR_PPVOBJINVALID`: UInt = 120u;
public const val `OLEUI_IOERR_SCODEHASERROR`: UInt = 123u;
public const val `OLEUI_IOERR_SRCDATAOBJECTINVALID`: UInt = 116u;
public const val `OLEUI_LPERR_LINKCNTRINVALID`: UInt = 134u;
public const val `OLEUI_LPERR_LINKCNTRNULL`: UInt = 133u;
public const val `OLEUI_OK`: UInt = 1u;
public const val `OLEUI_OPERR_DLGPROCNOTNULL`: UInt = 125u;
public const val `OLEUI_OPERR_INVALIDPAGES`: UInt = 123u;
public const val `OLEUI_OPERR_LINKINFOINVALID`: UInt = 137u;
public const val `OLEUI_OPERR_LPARAMNOTZERO`: UInt = 126u;
public const val `OLEUI_OPERR_NOTSUPPORTED`: UInt = 124u;
public const val `OLEUI_OPERR_OBJINFOINVALID`: UInt = 136u;
public const val `OLEUI_OPERR_PAGESINCORRECT`: UInt = 122u;
public const val `OLEUI_OPERR_PROPERTYSHEET`: UInt = 135u;
public const val `OLEUI_OPERR_PROPSHEETINVALID`: UInt = 119u;
public const val `OLEUI_OPERR_PROPSHEETNULL`: UInt = 118u;
public const val `OLEUI_OPERR_PROPSINVALID`: UInt = 121u;
public const val `OLEUI_OPERR_SUBPROPINVALID`: UInt = 117u;
public const val `OLEUI_OPERR_SUBPROPNULL`: UInt = 116u;
public const val `OLEUI_OPERR_SUPPROP`: UInt = 120u;
public const val `OLEUI_PSERR_CLIPBOARDCHANGED`: UInt = 119u;
public const val `OLEUI_PSERR_GETCLIPBOARDFAILED`: UInt = 120u;
public const val `OLEUI_QUERY_GETCLASSID`: UInt = 65280u;
public const val `OLEUI_QUERY_LINKBROKEN`: UInt = 65281u;
public const val `OLEUI_SUCCESS`: UInt = 1u;
public const val `OLEUI_VPERR_DVASPECTINVALID`: UInt = 132u;
public const val `OLEUI_VPERR_METAPICTINVALID`: UInt = 131u;
public typealias `OLEUPDATE` = Int;
public const val `OLEUPDATE_ALWAYS`: `OLEUPDATE` = 1;
public const val `OLEUPDATE_ONCALL`: `OLEUPDATE` = 3;
// UNSUPPORTED Rust 2292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct OLEVERB {
//     pub lVerb: OLEIVERB,
//     pub lpszVerbName: windows_sys::core::PWSTR,
//     pub fuFlags: super::super::UI::WindowsAndMessaging::MENU_ITEM_FLAGS,
//     pub grfAttribs: u32,
// }

// UNSUPPORTED Rust 2301:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OLEVERB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `OLEVERBATTRIB` = Int;
public const val `OLEVERBATTRIB_NEVERDIRTIES`: `OLEVERBATTRIB` = 1;
public const val `OLEVERBATTRIB_ONCONTAINERMENU`: `OLEVERBATTRIB` = 2;
public const val `OLEVERB_PRIMARY`: UInt = 0u;
public typealias `OLEWHICHMK` = Int;
public const val `OLEWHICHMK_CONTAINER`: `OLEWHICHMK` = 1;
public const val `OLEWHICHMK_OBJFULL`: `OLEWHICHMK` = 3;
public const val `OLEWHICHMK_OBJREL`: `OLEWHICHMK` = 2;
public typealias `OLE_HANDLE` = UInt;
public typealias `OLE_TRISTATE` = Int;
public const val `OPF_DISABLECONVERT`: `OBJECT_PROPERTIES_FLAGS` = 8u;
public const val `OPF_NOFILLDEFAULT`: `OBJECT_PROPERTIES_FLAGS` = 2u;
public const val `OPF_OBJECTISLINK`: `OBJECT_PROPERTIES_FLAGS` = 1u;
public const val `OPF_SHOWHELP`: `OBJECT_PROPERTIES_FLAGS` = 4u;
public const val `OT_EMBEDDED`: Int = 2;
public const val `OT_LINK`: Int = 1;
public const val `OT_STATIC`: Int = 3;
public typealias `PAGEACTION_UI` = Int;
public const val `PAGEACTION_UI_DEFAULT`: `PAGEACTION_UI` = 0;
public const val `PAGEACTION_UI_MODAL`: `PAGEACTION_UI` = 1;
public const val `PAGEACTION_UI_MODELESS`: `PAGEACTION_UI` = 2;
public const val `PAGEACTION_UI_SILENT`: `PAGEACTION_UI` = 3;
// UNSUPPORTED Rust 2329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PAGERANGE {
//     pub nFromPage: i32,
//     pub nToPage: i32,
// }

// UNSUPPORTED Rust 2335:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PAGESET {
//     pub cbStruct: u32,
//     pub fOddPages: windows_sys::core::BOOL,
//     pub fEvenPages: windows_sys::core::BOOL,
//     pub cPageRange: u32,
//     pub rgPages: [PAGERANGE; 1],
// }

// UNSUPPORTED Rust 2344:1: declaration Impl has no candidate rule
// impl Default for PAGESET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Variant")]
// #[derive(Clone, Copy)]
// pub struct PARAMDATA {
//     pub szName: windows_sys::core::PWSTR,
//     pub vt: super::Variant::VARENUM,
// }

// UNSUPPORTED Rust 2356:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Variant")]
// impl Default for PARAMDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2362:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct PARAMDESC {
//     pub pparamdescex: *mut PARAMDESCEX,
//     pub wParamFlags: PARAMFLAGS,
// }

// UNSUPPORTED Rust 2369:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for PARAMDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct PARAMDESCEX {
//     pub cBytes: u32,
//     pub varDefaultValue: super::Variant::VARIANT,
// }

// UNSUPPORTED Rust 2382:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Variant"))]
// impl Default for PARAMDESCEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PARAMFLAGS` = UShort;
public const val `PARAMFLAG_FHASCUSTDATA`: `PARAMFLAGS` = 64u;
public const val `PARAMFLAG_FHASDEFAULT`: `PARAMFLAGS` = 32u;
public const val `PARAMFLAG_FIN`: `PARAMFLAGS` = 1u;
public const val `PARAMFLAG_FLCID`: `PARAMFLAGS` = 4u;
public const val `PARAMFLAG_FOPT`: `PARAMFLAGS` = 16u;
public const val `PARAMFLAG_FOUT`: `PARAMFLAGS` = 2u;
public const val `PARAMFLAG_FRETVAL`: `PARAMFLAGS` = 8u;
public const val `PARAMFLAG_NONE`: `PARAMFLAGS` = 0u;
public typealias `PASTE_SPECIAL_FLAGS` = UInt;
public const val `PERPROP_E_FIRST`: Int = -2147220992;
public const val `PERPROP_E_LAST`: Int = -2147220977;
public const val `PERPROP_E_NOPAGEAVAILABLE`: Int = -2147220992;
public const val `PERPROP_S_FIRST`: Int = 262656;
public const val `PERPROP_S_LAST`: Int = 262671;
// UNSUPPORTED Rust 2403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct PICTDESC {
//     pub cbSizeofstruct: u32,
//     pub picType: u32,
//     pub Anonymous: PICTDESC_0,
// }

// UNSUPPORTED Rust 2411:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2417:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union PICTDESC_0 {
//     pub bmp: PICTDESC_0_0,
//     pub wmf: PICTDESC_0_1,
//     pub icon: PICTDESC_0_2,
//     pub emf: PICTDESC_0_3,
// }

// UNSUPPORTED Rust 2426:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct PICTDESC_0_0 {
//     pub hbitmap: super::super::Graphics::Gdi::HBITMAP,
//     pub hpal: super::super::Graphics::Gdi::HPALETTE,
// }

// UNSUPPORTED Rust 2439:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct PICTDESC_0_3 {
//     pub hemf: super::super::Graphics::Gdi::HENHMETAFILE,
// }

// UNSUPPORTED Rust 2451:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2457:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct PICTDESC_0_2 {
//     pub hicon: super::super::UI::WindowsAndMessaging::HICON,
// }

// UNSUPPORTED Rust 2463:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct PICTDESC_0_1 {
//     pub hmeta: super::super::Graphics::Gdi::HMETAFILE,
//     pub xExt: i32,
//     pub yExt: i32,
// }

// UNSUPPORTED Rust 2477:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for PICTDESC_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PICTUREATTRIBUTES` = Int;
public const val `PICTURE_SCALABLE`: `PICTUREATTRIBUTES` = 1;
public const val `PICTURE_TRANSPARENT`: `PICTUREATTRIBUTES` = 2;
public typealias `PICTYPE` = Short;
public const val `PICTYPE_BITMAP`: `PICTYPE` = 1;
public const val `PICTYPE_ENHMETAFILE`: `PICTYPE` = 4;
public const val `PICTYPE_ICON`: `PICTYPE` = 3;
public const val `PICTYPE_METAFILE`: `PICTYPE` = 2;
public const val `PICTYPE_NONE`: `PICTYPE` = 0;
public const val `PICTYPE_UNINITIALIZED`: `PICTYPE` = -1;
public typealias `POINTERINACTIVE` = Int;
public const val `POINTERINACTIVE_ACTIVATEONDRAG`: `POINTERINACTIVE` = 4;
public const val `POINTERINACTIVE_ACTIVATEONENTRY`: `POINTERINACTIVE` = 1;
public const val `POINTERINACTIVE_DEACTIVATEONLEAVE`: `POINTERINACTIVE` = 2;
// UNSUPPORTED Rust 2497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POINTF {
//     pub x: f32,
//     pub y: f32,
// }

public typealias `PRINTFLAG` = Int;
public const val `PRINTFLAG_DONTACTUALLYPRINT`: `PRINTFLAG` = 16;
public const val `PRINTFLAG_FORCEPROPERTIES`: `PRINTFLAG` = 32;
public const val `PRINTFLAG_MAYBOTHERUSER`: `PRINTFLAG` = 1;
public const val `PRINTFLAG_PRINTTOFILE`: `PRINTFLAG` = 64;
public const val `PRINTFLAG_PROMPTUSER`: `PRINTFLAG` = 2;
public const val `PRINTFLAG_RECOMPOSETODEVICE`: `PRINTFLAG` = 8;
public const val `PRINTFLAG_USERMAYCHANGEPRINTER`: `PRINTFLAG` = 4;
public typealias `PROPBAG2_TYPE` = Int;
public const val `PROPBAG2_TYPE_DATA`: `PROPBAG2_TYPE` = 1;
public const val `PROPBAG2_TYPE_MONIKER`: `PROPBAG2_TYPE` = 6;
public const val `PROPBAG2_TYPE_OBJECT`: `PROPBAG2_TYPE` = 3;
public const val `PROPBAG2_TYPE_STORAGE`: `PROPBAG2_TYPE` = 5;
public const val `PROPBAG2_TYPE_STREAM`: `PROPBAG2_TYPE` = 4;
public const val `PROPBAG2_TYPE_UNDEFINED`: `PROPBAG2_TYPE` = 0;
public const val `PROPBAG2_TYPE_URL`: `PROPBAG2_TYPE` = 2;
// UNSUPPORTED Rust 2519:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROPPAGEINFO {
//     pub cb: u32,
//     pub pszTitle: windows_sys::core::PWSTR,
//     pub size: super::super::Foundation::SIZE,
//     pub pszDocString: windows_sys::core::PWSTR,
//     pub pszHelpFile: windows_sys::core::PWSTR,
//     pub dwHelpContext: u32,
// }

// UNSUPPORTED Rust 2529:1: declaration Impl has no candidate rule
// impl Default for PROPPAGEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PROPPAGESTATUS` = Int;
public const val `PROPPAGESTATUS_CLEAN`: `PROPPAGESTATUS` = 4;
public const val `PROPPAGESTATUS_DIRTY`: `PROPPAGESTATUS` = 1;
public const val `PROPPAGESTATUS_VALIDATE`: `PROPPAGESTATUS` = 2;
// UNSUPPORTED Rust 2538:1: non-scalar type Ptr unsupported
// pub const PROP_HWND_CHGICONDLG: windows_sys::core::PCWSTR = windows_sys::core::w!("HWND_CIDLG");

public const val `PSF_CHECKDISPLAYASICON`: `PASTE_SPECIAL_FLAGS` = 8u;
public const val `PSF_DISABLEDISPLAYASICON`: `PASTE_SPECIAL_FLAGS` = 16u;
public const val `PSF_HIDECHANGEICON`: `PASTE_SPECIAL_FLAGS` = 32u;
public const val `PSF_NOREFRESHDATAOBJECT`: `PASTE_SPECIAL_FLAGS` = 128u;
public const val `PSF_SELECTPASTE`: `PASTE_SPECIAL_FLAGS` = 2u;
public const val `PSF_SELECTPASTELINK`: `PASTE_SPECIAL_FLAGS` = 4u;
public const val `PSF_SHOWHELP`: `PASTE_SPECIAL_FLAGS` = 1u;
public const val `PSF_STAYONCLIPBOARDCHANGE`: `PASTE_SPECIAL_FLAGS` = 64u;
public const val `PS_MAXLINKTYPES`: UInt = 8u;
// UNSUPPORTED Rust 2548:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
// #[derive(Clone, Copy)]
// pub struct QACONTAINER {
//     pub cbSize: u32,
//     pub pClientSite: *mut core::ffi::c_void,
//     pub pAdviseSink: *mut core::ffi::c_void,
//     pub pPropertyNotifySink: *mut core::ffi::c_void,
//     pub pUnkEventSink: *mut core::ffi::c_void,
//     pub dwAmbientFlags: u32,
//     pub colorFore: u32,
//     pub colorBack: u32,
//     pub pFont: *mut core::ffi::c_void,
//     pub pUndoMgr: *mut core::ffi::c_void,
//     pub dwAppearance: u32,
//     pub lcid: i32,
//     pub hpal: super::super::Graphics::Gdi::HPALETTE,
//     pub pBindHost: *mut core::ffi::c_void,
//     pub pOleControlSite: *mut core::ffi::c_void,
//     pub pServiceProvider: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2569:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
// impl Default for QACONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `QACONTAINERFLAGS` = Int;
public const val `QACONTAINER_AUTOCLIP`: `QACONTAINERFLAGS` = 32;
public const val `QACONTAINER_DISPLAYASDEFAULT`: `QACONTAINERFLAGS` = 8;
public const val `QACONTAINER_MESSAGEREFLECT`: `QACONTAINERFLAGS` = 64;
public const val `QACONTAINER_SHOWGRABHANDLES`: `QACONTAINERFLAGS` = 2;
public const val `QACONTAINER_SHOWHATCHING`: `QACONTAINERFLAGS` = 1;
public const val `QACONTAINER_SUPPORTSMNEMONICS`: `QACONTAINERFLAGS` = 128;
public const val `QACONTAINER_UIDEAD`: `QACONTAINERFLAGS` = 16;
public const val `QACONTAINER_USERMODE`: `QACONTAINERFLAGS` = 4;
// UNSUPPORTED Rust 2584:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QACONTROL {
//     pub cbSize: u32,
//     pub dwMiscStatus: u32,
//     pub dwViewStatus: u32,
//     pub dwEventCookie: u32,
//     pub dwPropNotifyCookie: u32,
//     pub dwPointerActivationPolicy: u32,
// }

public typealias `READYSTATE` = Int;
public const val `READYSTATE_COMPLETE`: `READYSTATE` = 4;
public const val `READYSTATE_INTERACTIVE`: `READYSTATE` = 3;
public const val `READYSTATE_LOADED`: `READYSTATE` = 2;
public const val `READYSTATE_LOADING`: `READYSTATE` = 1;
public const val `READYSTATE_UNINITIALIZED`: `READYSTATE` = 0;
public typealias `REGKIND` = Int;
public const val `REGKIND_DEFAULT`: `REGKIND` = 0;
public const val `REGKIND_NONE`: `REGKIND` = 2;
public const val `REGKIND_REGISTER`: `REGKIND` = 1;
// UNSUPPORTED Rust 2604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SAFEARRAYUNION {
//     pub sfType: u32,
//     pub u: SAFEARRAYUNION_0,
// }

// UNSUPPORTED Rust 2611:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARRAYUNION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2617:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union SAFEARRAYUNION_0 {
//     pub BstrStr: SAFEARR_BSTR,
//     pub UnknownStr: SAFEARR_UNKNOWN,
//     pub DispatchStr: SAFEARR_DISPATCH,
//     pub VariantStr: SAFEARR_VARIANT,
//     pub RecordStr: SAFEARR_BRECORD,
//     pub HaveIidStr: SAFEARR_HAVEIID,
//     pub ByteStr: super::Com::BYTE_SIZEDARR,
//     pub WordStr: super::Com::WORD_SIZEDARR,
//     pub LongStr: super::Com::DWORD_SIZEDARR,
//     pub HyperStr: super::Com::HYPER_SIZEDARR,
// }

// UNSUPPORTED Rust 2632:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARRAYUNION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAFEARR_BRECORD {
//     pub Size: u32,
//     pub aRecord: *mut *mut _wireBRECORD,
// }

// UNSUPPORTED Rust 2644:1: declaration Impl has no candidate rule
// impl Default for SAFEARR_BRECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SAFEARR_BSTR {
//     pub Size: u32,
//     pub aBstr: *mut *mut super::Com::FLAGGED_WORD_BLOB,
// }

// UNSUPPORTED Rust 2656:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARR_BSTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2662:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SAFEARR_DISPATCH {
//     pub Size: u32,
//     pub apDispatch: *mut *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2669:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARR_DISPATCH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2675:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAFEARR_HAVEIID {
//     pub Size: u32,
//     pub apUnknown: *mut *mut core::ffi::c_void,
//     pub iid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2682:1: declaration Impl has no candidate rule
// impl Default for SAFEARR_HAVEIID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAFEARR_UNKNOWN {
//     pub Size: u32,
//     pub apUnknown: *mut *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2693:1: declaration Impl has no candidate rule
// impl Default for SAFEARR_UNKNOWN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2698:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SAFEARR_VARIANT {
//     pub Size: u32,
//     pub aVariant: *mut *mut _wireVARIANT,
// }

// UNSUPPORTED Rust 2705:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAFEARR_VARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SELFREG_E_CLASS`: Int = -2147220991;
public const val `SELFREG_E_FIRST`: Int = -2147220992;
public const val `SELFREG_E_LAST`: Int = -2147220977;
public const val `SELFREG_E_TYPELIB`: Int = -2147220992;
public const val `SELFREG_S_FIRST`: Int = 262656;
public const val `SELFREG_S_LAST`: Int = 262671;
public const val `SF_BSTR`: `SF_TYPE` = 8;
public const val `SF_DISPATCH`: `SF_TYPE` = 9;
public const val `SF_ERROR`: `SF_TYPE` = 10;
public const val `SF_HAVEIID`: `SF_TYPE` = 32781;
public const val `SF_I1`: `SF_TYPE` = 16;
public const val `SF_I2`: `SF_TYPE` = 2;
public const val `SF_I4`: `SF_TYPE` = 3;
public const val `SF_I8`: `SF_TYPE` = 20;
public const val `SF_RECORD`: `SF_TYPE` = 36;
public typealias `SF_TYPE` = Int;
public const val `SF_UNKNOWN`: `SF_TYPE` = 13;
public const val `SF_VARIANT`: `SF_TYPE` = 12;
// UNSUPPORTED Rust 2729:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SID_GetCaller: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4717cc40_bcb9_11d0_9336_00a0c90dcaa9);

// UNSUPPORTED Rust 2730:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SID_ProvideRuntimeContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74a5040c_dd0c_48f0_ac85_194c3259180a);

// UNSUPPORTED Rust 2731:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SID_VariantConversion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1f101481_bccd_11d0_9336_00a0c90dcaa9);

public const val `STDOLE2_LCID`: UInt = 0u;
public const val `STDOLE2_MAJORVERNUM`: UInt = 2u;
public const val `STDOLE2_MINORVERNUM`: UInt = 0u;
public const val `STDOLE_LCID`: UInt = 0u;
public const val `STDOLE_MAJORVERNUM`: UInt = 1u;
public const val `STDOLE_MINORVERNUM`: UInt = 0u;
// UNSUPPORTED Rust 2738:1: non-scalar type Ptr unsupported
// pub const STDOLE_TLB: windows_sys::core::PCSTR = windows_sys::core::s!("stdole2.tlb");

// UNSUPPORTED Rust 2739:1: non-scalar type Ptr unsupported
// pub const STDTYPE_TLB: windows_sys::core::PCSTR = windows_sys::core::s!("stdole2.tlb");

// UNSUPPORTED Rust 2740:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_ADDCONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_ADDCONTROL");

// UNSUPPORTED Rust 2741:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_BROWSE: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_BROWSE");

// UNSUPPORTED Rust 2742:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_BROWSE_OFN: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_BROWSE_OFN");

// UNSUPPORTED Rust 2743:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_CHANGEICON: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CHANGEICON");

// UNSUPPORTED Rust 2744:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_CHANGESOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CHANGESOURCE");

// UNSUPPORTED Rust 2745:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_CLOSEBUSYDIALOG: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CLOSEBUSYDIALOG");

// UNSUPPORTED Rust 2746:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_CONVERT: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_CONVERT");

// UNSUPPORTED Rust 2747:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_ENDDIALOG: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_ENDDIALOG");

// UNSUPPORTED Rust 2748:1: non-scalar type Ptr unsupported
// pub const SZOLEUI_MSG_HELP: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEUI_MSG_HELP");

public const val `TIFLAGS_EXTENDDISPATCHONLY`: UInt = 1u;
public typealias `TYPEFLAGS` = Int;
public const val `TYPEFLAG_FAGGREGATABLE`: `TYPEFLAGS` = 1024;
public const val `TYPEFLAG_FAPPOBJECT`: `TYPEFLAGS` = 1;
public const val `TYPEFLAG_FCANCREATE`: `TYPEFLAGS` = 2;
public const val `TYPEFLAG_FCONTROL`: `TYPEFLAGS` = 32;
public const val `TYPEFLAG_FDISPATCHABLE`: `TYPEFLAGS` = 4096;
public const val `TYPEFLAG_FDUAL`: `TYPEFLAGS` = 64;
public const val `TYPEFLAG_FHIDDEN`: `TYPEFLAGS` = 16;
public const val `TYPEFLAG_FLICENSED`: `TYPEFLAGS` = 4;
public const val `TYPEFLAG_FNONEXTENSIBLE`: `TYPEFLAGS` = 128;
public const val `TYPEFLAG_FOLEAUTOMATION`: `TYPEFLAGS` = 256;
public const val `TYPEFLAG_FPREDECLID`: `TYPEFLAGS` = 8;
public const val `TYPEFLAG_FPROXY`: `TYPEFLAGS` = 16384;
public const val `TYPEFLAG_FREPLACEABLE`: `TYPEFLAGS` = 2048;
public const val `TYPEFLAG_FRESTRICTED`: `TYPEFLAGS` = 512;
public const val `TYPEFLAG_FREVERSEBIND`: `TYPEFLAGS` = 8192;
public typealias `UASFLAGS` = Int;
public const val `UAS_BLOCKED`: `UASFLAGS` = 1;
public const val `UAS_MASK`: `UASFLAGS` = 3;
public const val `UAS_NOPARENTENABLE`: `UASFLAGS` = 2;
public const val `UAS_NORMAL`: `UASFLAGS` = 0;
// UNSUPPORTED Rust 2771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UDATE {
//     pub st: super::super::Foundation::SYSTEMTIME,
//     pub wDayOfYear: u16,
// }

public typealias `UI_CONVERT_FLAGS` = UInt;
public const val `UPDFCACHE_ALL`: `UPDFCACHE_FLAGS` = 2147483647u;
public const val `UPDFCACHE_ALLBUTNODATACACHE`: `UPDFCACHE_FLAGS` = 2147483646u;
public typealias `UPDFCACHE_FLAGS` = UInt;
public const val `UPDFCACHE_IFBLANK`: `UPDFCACHE_FLAGS` = 16u;
public const val `UPDFCACHE_IFBLANKORONSAVECACHE`: `UPDFCACHE_FLAGS` = 18u;
public const val `UPDFCACHE_NODATACACHE`: `UPDFCACHE_FLAGS` = 1u;
public const val `UPDFCACHE_NORMALCACHE`: `UPDFCACHE_FLAGS` = 8u;
public const val `UPDFCACHE_ONLYIFBLANK`: `UPDFCACHE_FLAGS` = 2147483648u;
public const val `UPDFCACHE_ONSAVECACHE`: `UPDFCACHE_FLAGS` = 2u;
public const val `UPDFCACHE_ONSTOPCACHE`: `UPDFCACHE_FLAGS` = 4u;
public typealias `USERCLASSTYPE` = Int;
public const val `USERCLASSTYPE_APPNAME`: `USERCLASSTYPE` = 3;
public const val `USERCLASSTYPE_FULL`: `USERCLASSTYPE` = 1;
public const val `USERCLASSTYPE_SHORT`: `USERCLASSTYPE` = 2;
public typealias `VARCMP` = UInt;
public const val `VARCMP_EQ`: `VARCMP` = 1u;
public const val `VARCMP_GT`: `VARCMP` = 2u;
public const val `VARCMP_LT`: `VARCMP` = 0u;
public const val `VARCMP_NULL`: `VARCMP` = 3u;
public typealias `VARFORMAT_FIRST_DAY` = Int;
public const val `VARFORMAT_FIRST_DAY_FRIDAY`: `VARFORMAT_FIRST_DAY` = 5;
public const val `VARFORMAT_FIRST_DAY_MONDAY`: `VARFORMAT_FIRST_DAY` = 1;
public const val `VARFORMAT_FIRST_DAY_SATURDAY`: `VARFORMAT_FIRST_DAY` = 6;
public const val `VARFORMAT_FIRST_DAY_SUNDAY`: `VARFORMAT_FIRST_DAY` = 7;
public const val `VARFORMAT_FIRST_DAY_SYSTEMDEFAULT`: `VARFORMAT_FIRST_DAY` = 0;
public const val `VARFORMAT_FIRST_DAY_THURSDAY`: `VARFORMAT_FIRST_DAY` = 4;
public const val `VARFORMAT_FIRST_DAY_TUESDAY`: `VARFORMAT_FIRST_DAY` = 2;
public const val `VARFORMAT_FIRST_DAY_WEDNESDAY`: `VARFORMAT_FIRST_DAY` = 3;
public typealias `VARFORMAT_FIRST_WEEK` = Int;
public const val `VARFORMAT_FIRST_WEEK_CONTAINS_JANUARY_FIRST`: `VARFORMAT_FIRST_WEEK` = 1;
public const val `VARFORMAT_FIRST_WEEK_HAS_SEVEN_DAYS`: `VARFORMAT_FIRST_WEEK` = 3;
public const val `VARFORMAT_FIRST_WEEK_LARGER_HALF_IN_CURRENT_YEAR`: `VARFORMAT_FIRST_WEEK` = 2;
public const val `VARFORMAT_FIRST_WEEK_SYSTEMDEFAULT`: `VARFORMAT_FIRST_WEEK` = 0;
public typealias `VARFORMAT_GROUP` = Int;
public const val `VARFORMAT_GROUP_NOTTHOUSANDS`: `VARFORMAT_GROUP` = 0;
public const val `VARFORMAT_GROUP_SYSTEMDEFAULT`: `VARFORMAT_GROUP` = -2;
public const val `VARFORMAT_GROUP_THOUSANDS`: `VARFORMAT_GROUP` = -1;
public typealias `VARFORMAT_LEADING_DIGIT` = Int;
public const val `VARFORMAT_LEADING_DIGIT_INCLUDED`: `VARFORMAT_LEADING_DIGIT` = -1;
public const val `VARFORMAT_LEADING_DIGIT_NOTINCLUDED`: `VARFORMAT_LEADING_DIGIT` = 0;
public const val `VARFORMAT_LEADING_DIGIT_SYSTEMDEFAULT`: `VARFORMAT_LEADING_DIGIT` = -2;
public typealias `VARFORMAT_NAMED_FORMAT` = Int;
public const val `VARFORMAT_NAMED_FORMAT_GENERALDATE`: `VARFORMAT_NAMED_FORMAT` = 0;
public const val `VARFORMAT_NAMED_FORMAT_LONGDATE`: `VARFORMAT_NAMED_FORMAT` = 1;
public const val `VARFORMAT_NAMED_FORMAT_LONGTIME`: `VARFORMAT_NAMED_FORMAT` = 3;
public const val `VARFORMAT_NAMED_FORMAT_SHORTDATE`: `VARFORMAT_NAMED_FORMAT` = 2;
public const val `VARFORMAT_NAMED_FORMAT_SHORTTIME`: `VARFORMAT_NAMED_FORMAT` = 4;
public typealias `VARFORMAT_PARENTHESES` = Int;
public const val `VARFORMAT_PARENTHESES_NOTUSED`: `VARFORMAT_PARENTHESES` = 0;
public const val `VARFORMAT_PARENTHESES_SYSTEMDEFAULT`: `VARFORMAT_PARENTHESES` = -2;
public const val `VARFORMAT_PARENTHESES_USED`: `VARFORMAT_PARENTHESES` = -1;
public const val `VAR_CALENDAR_GREGORIAN`: UInt = 256u;
public const val `VAR_CALENDAR_HIJRI`: UInt = 8u;
public const val `VAR_CALENDAR_THAI`: UInt = 128u;
public const val `VAR_DATEVALUEONLY`: UInt = 2u;
public const val `VAR_FORMAT_NOSUBSTITUTE`: UInt = 32u;
public const val `VAR_FOURDIGITYEARS`: UInt = 64u;
public const val `VAR_LOCALBOOL`: UInt = 16u;
public const val `VAR_TIMEVALUEONLY`: UInt = 1u;
public const val `VAR_VALIDDATE`: UInt = 4u;
public typealias `VIEWSTATUS` = Int;
public const val `VIEWSTATUS_3DSURFACE`: `VIEWSTATUS` = 32;
public const val `VIEWSTATUS_DVASPECTOPAQUE`: `VIEWSTATUS` = 4;
public const val `VIEWSTATUS_DVASPECTTRANSPARENT`: `VIEWSTATUS` = 8;
public const val `VIEWSTATUS_OPAQUE`: `VIEWSTATUS` = 1;
public const val `VIEWSTATUS_SOLIDBKGND`: `VIEWSTATUS` = 2;
public const val `VIEWSTATUS_SURFACE`: `VIEWSTATUS` = 16;
public typealias `VIEW_OBJECT_PROPERTIES_FLAGS` = UInt;
public const val `VPF_DISABLERELATIVE`: `VIEW_OBJECT_PROPERTIES_FLAGS` = 2u;
public const val `VPF_DISABLESCALE`: `VIEW_OBJECT_PROPERTIES_FLAGS` = 4u;
public const val `VPF_SELECTRELATIVE`: `VIEW_OBJECT_PROPERTIES_FLAGS` = 1u;
public const val `VTDATEGRE_MAX`: UInt = 2958465u;
public const val `VTDATEGRE_MIN`: Int = -657434;
public const val `VT_BLOB_PROPSET`: UInt = 75u;
public const val `VT_STORED_PROPSET`: UInt = 74u;
public const val `VT_STREAMED_PROPSET`: UInt = 73u;
public const val `VT_VERBOSE_ENUM`: UInt = 76u;
public const val `WIN32`: UInt = 100u;
public typealias `WPCSETTING` = Int;
public const val `WPCSETTING_FILEDOWNLOAD_BLOCKED`: `WPCSETTING` = 2;
public const val `WPCSETTING_LOGGING_ENABLED`: `WPCSETTING` = 1;
public typealias `XFORMCOORDS` = Int;
public const val `XFORMCOORDS_CONTAINERTOHIMETRIC`: `XFORMCOORDS` = 8;
public const val `XFORMCOORDS_EVENTCOMPAT`: `XFORMCOORDS` = 16;
public const val `XFORMCOORDS_HIMETRICTOCONTAINER`: `XFORMCOORDS` = 4;
public const val `XFORMCOORDS_POSITION`: `XFORMCOORDS` = 1;
public const val `XFORMCOORDS_SIZE`: `XFORMCOORDS` = 2;
// UNSUPPORTED Rust 2865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _wireBRECORD {
//     pub fFlags: u32,
//     pub clSize: u32,
//     pub pRecInfo: *mut core::ffi::c_void,
//     pub pRecord: *mut u8,
// }

// UNSUPPORTED Rust 2873:1: declaration Impl has no candidate rule
// impl Default for _wireBRECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2878:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct _wireSAFEARRAY {
//     pub cDims: u16,
//     pub fFeatures: u16,
//     pub cbElements: u32,
//     pub cLocks: u32,
//     pub uArrayStructs: SAFEARRAYUNION,
//     pub rgsabound: [super::Com::SAFEARRAYBOUND; 1],
// }

// UNSUPPORTED Rust 2889:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for _wireSAFEARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2895:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct _wireVARIANT {
//     pub clSize: u32,
//     pub rpcReserved: u32,
//     pub vt: u16,
//     pub wReserved1: u16,
//     pub wReserved2: u16,
//     pub wReserved3: u16,
//     pub Anonymous: _wireVARIANT_0,
// }

// UNSUPPORTED Rust 2907:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for _wireVARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2913:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union _wireVARIANT_0 {
//     pub llVal: i64,
//     pub lVal: i32,
//     pub bVal: u8,
//     pub iVal: i16,
//     pub fltVal: f32,
//     pub dblVal: f64,
//     pub boolVal: super::super::Foundation::VARIANT_BOOL,
//     pub scode: i32,
//     pub cyVal: super::Com::CY,
//     pub date: f64,
//     pub bstrVal: *mut super::Com::FLAGGED_WORD_BLOB,
//     pub punkVal: *mut core::ffi::c_void,
//     pub pdispVal: *mut core::ffi::c_void,
//     pub parray: *mut *mut _wireSAFEARRAY,
//     pub brecVal: *mut _wireBRECORD,
//     pub pbVal: *mut u8,
//     pub piVal: *mut i16,
//     pub plVal: *mut i32,
//     pub pllVal: *mut i64,
//     pub pfltVal: *mut f32,
//     pub pdblVal: *mut f64,
//     pub pboolVal: *mut super::super::Foundation::VARIANT_BOOL,
//     pub pscode: *mut i32,
//     pub pcyVal: *mut super::Com::CY,
//     pub pdate: *mut f64,
//     pub pbstrVal: *mut *mut super::Com::FLAGGED_WORD_BLOB,
//     pub ppunkVal: *mut *mut core::ffi::c_void,
//     pub ppdispVal: *mut *mut core::ffi::c_void,
//     pub pparray: *mut *mut *mut _wireSAFEARRAY,
//     pub pvarVal: *mut *mut _wireVARIANT,
//     pub cVal: i8,
//     pub uiVal: u16,
//     pub ulVal: u32,
//     pub ullVal: u64,
//     pub intVal: i32,
//     pub uintVal: u32,
//     pub decVal: super::super::Foundation::DECIMAL,
//     pub pdecVal: *mut super::super::Foundation::DECIMAL,
//     pub pcVal: windows_sys::core::PSTR,
//     pub puiVal: *mut u16,
//     pub pulVal: *mut u32,
//     pub pullVal: *mut u64,
//     pub pintVal: *mut i32,
//     pub puintVal: *mut u32,
// }

// UNSUPPORTED Rust 2962:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for _wireVARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `fdexEnumAll`: Int = 2;
public const val `fdexEnumDefault`: Int = 1;
public const val `fdexNameCaseInsensitive`: Int = 8;
public const val `fdexNameCaseSensitive`: Int = 1;
public const val `fdexNameEnsure`: Int = 2;
public const val `fdexNameImplicit`: Int = 4;
public const val `fdexNameInternal`: Int = 16;
public const val `fdexNameNoDynamicProperties`: Int = 32;
public const val `fdexPropCanCall`: `FDEX_PROP_FLAGS` = 256u;
public const val `fdexPropCanConstruct`: `FDEX_PROP_FLAGS` = 1024u;
public const val `fdexPropCanGet`: `FDEX_PROP_FLAGS` = 1u;
public const val `fdexPropCanPut`: `FDEX_PROP_FLAGS` = 4u;
public const val `fdexPropCanPutRef`: `FDEX_PROP_FLAGS` = 16u;
public const val `fdexPropCanSourceEvents`: `FDEX_PROP_FLAGS` = 4096u;
public const val `fdexPropCannotCall`: `FDEX_PROP_FLAGS` = 512u;
public const val `fdexPropCannotConstruct`: `FDEX_PROP_FLAGS` = 2048u;
public const val `fdexPropCannotGet`: `FDEX_PROP_FLAGS` = 2u;
public const val `fdexPropCannotPut`: `FDEX_PROP_FLAGS` = 8u;
public const val `fdexPropCannotPutRef`: `FDEX_PROP_FLAGS` = 32u;
public const val `fdexPropCannotSourceEvents`: `FDEX_PROP_FLAGS` = 8192u;
public const val `fdexPropDynamicType`: `FDEX_PROP_FLAGS` = 128u;
public const val `fdexPropNoSideEffects`: `FDEX_PROP_FLAGS` = 64u;
public const val `triChecked`: `OLE_TRISTATE` = 1;
public const val `triGray`: `OLE_TRISTATE` = 2;
public const val `triUnchecked`: `OLE_TRISTATE` = 0;
