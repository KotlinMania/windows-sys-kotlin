// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserFree(param0 : *const u32, param1 : *const windows_sys::core::BSTR));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserFree64(param0 : *const u32, param1 : *const windows_sys::core::BSTR));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const windows_sys::core::BSTR) -> *mut u8);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const windows_sys::core::BSTR) -> *mut u8);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserSize(param0 : *const u32, param1 : u32, param2 : *const windows_sys::core::BSTR) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserSize64(param0 : *const u32, param1 : u32, param2 : *const windows_sys::core::BSTR) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut windows_sys::core::BSTR) -> *mut u8);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn BSTR_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut windows_sys::core::BSTR) -> *mut u8);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserFree(param0 : *const u32, param1 : *const u16));

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserFree64(param0 : *const u32, param1 : *const u16));

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const u16) -> *mut u8);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const u16) -> *mut u8);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserSize(param0 : *const u32, param1 : u32, param2 : *const u16) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserSize64(param0 : *const u32, param1 : u32, param2 : *const u16) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut u16) -> *mut u8);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CLIPFORMAT_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut u16) -> *mut u8);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoGetMarshalSizeMax(pulsize : *mut u32, riid : *const windows_sys::core::GUID, punk : * mut core::ffi::c_void, dwdestcontext : u32, pvdestcontext : *const core::ffi::c_void, mshlflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoGetStandardMarshal(riid : *const windows_sys::core::GUID, punk : * mut core::ffi::c_void, dwdestcontext : u32, pvdestcontext : *const core::ffi::c_void, mshlflags : u32, ppmarshal : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoGetStdMarshalEx(punkouter : * mut core::ffi::c_void, smexflags : u32, ppunkinner : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoMarshalHresult(pstm : * mut core::ffi::c_void, hresult : windows_sys::core::HRESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoMarshalInterThreadInterfaceInStream(riid : *const windows_sys::core::GUID, punk : * mut core::ffi::c_void, ppstm : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoMarshalInterface(pstm : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, punk : * mut core::ffi::c_void, dwdestcontext : u32, pvdestcontext : *const core::ffi::c_void, mshlflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoReleaseMarshalData(pstm : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoUnmarshalHresult(pstm : * mut core::ffi::c_void, phresult : *mut windows_sys::core::HRESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn CoUnmarshalInterface(pstm : * mut core::ffi::c_void, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserFree(param0 : *const u32, param1 : *const super::super::super::UI::WindowsAndMessaging:: HACCEL));

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserFree64(param0 : *const u32, param1 : *const super::super::super::UI::WindowsAndMessaging:: HACCEL));

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::UI::WindowsAndMessaging:: HACCEL) -> *mut u8);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::UI::WindowsAndMessaging:: HACCEL) -> *mut u8);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::UI::WindowsAndMessaging:: HACCEL) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::UI::WindowsAndMessaging:: HACCEL) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::UI::WindowsAndMessaging:: HACCEL) -> *mut u8);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HACCEL_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::UI::WindowsAndMessaging:: HACCEL) -> *mut u8);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserFree(param0 : *const u32, param1 : *const super::super::super::Graphics::Gdi:: HBITMAP));

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserFree64(param0 : *const u32, param1 : *const super::super::super::Graphics::Gdi:: HBITMAP));

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Graphics::Gdi:: HBITMAP) -> *mut u8);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Graphics::Gdi:: HBITMAP) -> *mut u8);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Graphics::Gdi:: HBITMAP) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Graphics::Gdi:: HBITMAP) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Graphics::Gdi:: HBITMAP) -> *mut u8);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HBITMAP_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Graphics::Gdi:: HBITMAP) -> *mut u8);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserFree(param0 : *const u32, param1 : *const super::super::super::Graphics::Gdi:: HDC));

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserFree64(param0 : *const u32, param1 : *const super::super::super::Graphics::Gdi:: HDC));

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Graphics::Gdi:: HDC) -> *mut u8);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Graphics::Gdi:: HDC) -> *mut u8);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Graphics::Gdi:: HDC) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Graphics::Gdi:: HDC) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Graphics::Gdi:: HDC) -> *mut u8);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HDC_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Graphics::Gdi:: HDC) -> *mut u8);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserFree(param0 : *const u32, param1 : *const super::super::super::Foundation:: HGLOBAL));

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserFree64(param0 : *const u32, param1 : *const super::super::super::Foundation:: HGLOBAL));

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Foundation:: HGLOBAL) -> *mut u8);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Foundation:: HGLOBAL) -> *mut u8);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Foundation:: HGLOBAL) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Foundation:: HGLOBAL) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Foundation:: HGLOBAL) -> *mut u8);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HGLOBAL_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Foundation:: HGLOBAL) -> *mut u8);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserFree(param0 : *const u32, param1 : *const super::super::super::UI::WindowsAndMessaging:: HICON));

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserFree64(param0 : *const u32, param1 : *const super::super::super::UI::WindowsAndMessaging:: HICON));

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::UI::WindowsAndMessaging:: HICON) -> *mut u8);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::UI::WindowsAndMessaging:: HICON) -> *mut u8);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::UI::WindowsAndMessaging:: HICON) -> u32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::UI::WindowsAndMessaging:: HICON) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::UI::WindowsAndMessaging:: HICON) -> *mut u8);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HICON_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::UI::WindowsAndMessaging:: HICON) -> *mut u8);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserFree(param0 : *const u32, param1 : *const super::super::super::UI::WindowsAndMessaging:: HMENU));

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserFree64(param0 : *const u32, param1 : *const super::super::super::UI::WindowsAndMessaging:: HMENU));

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::UI::WindowsAndMessaging:: HMENU) -> *mut u8);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::UI::WindowsAndMessaging:: HMENU) -> *mut u8);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::UI::WindowsAndMessaging:: HMENU) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::UI::WindowsAndMessaging:: HMENU) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::UI::WindowsAndMessaging:: HMENU) -> *mut u8);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ole32.dll" "system" fn HMENU_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::UI::WindowsAndMessaging:: HMENU) -> *mut u8);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserFree(param0 : *const u32, param1 : *const super::super::super::Graphics::Gdi:: HPALETTE));

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserFree64(param0 : *const u32, param1 : *const super::super::super::Graphics::Gdi:: HPALETTE));

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Graphics::Gdi:: HPALETTE) -> *mut u8);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Graphics::Gdi:: HPALETTE) -> *mut u8);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Graphics::Gdi:: HPALETTE) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Graphics::Gdi:: HPALETTE) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Graphics::Gdi:: HPALETTE) -> *mut u8);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("ole32.dll" "system" fn HPALETTE_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Graphics::Gdi:: HPALETTE) -> *mut u8);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserFree(param0 : *const u32, param1 : *const super::super::super::Foundation:: HWND));

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserFree64(param0 : *const u32, param1 : *const super::super::super::Foundation:: HWND));

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Foundation:: HWND) -> *mut u8);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super::super::super::Foundation:: HWND) -> *mut u8);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserSize(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super::super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Foundation:: HWND) -> *mut u8);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn HWND_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super::super::super::Foundation:: HWND) -> *mut u8);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserFree(param0 : *const u32, param1 : *const *const super:: SAFEARRAY));

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserFree64(param0 : *const u32, param1 : *const *const super:: SAFEARRAY));

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const *const super:: SAFEARRAY) -> *mut u8);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const *const super:: SAFEARRAY) -> *mut u8);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserSize(param0 : *const u32, param1 : u32, param2 : *const *const super:: SAFEARRAY) -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserSize64(param0 : *const u32, param1 : u32, param2 : *const *const super:: SAFEARRAY) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut *mut super:: SAFEARRAY) -> *mut u8);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("oleaut32.dll" "system" fn LPSAFEARRAY_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut *mut super:: SAFEARRAY) -> *mut u8);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserFree(param0 : *const u32, param1 : *const *const *const u16));

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserFree64(param0 : *const u32, param1 : *const *const *const u16));

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const *const *const u16) -> *mut u8);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const *const *const u16) -> *mut u8);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserSize(param0 : *const u32, param1 : u32, param2 : *const *const *const u16) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserSize64(param0 : *const u32, param1 : u32, param2 : *const *const *const u16) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut *mut *mut u16) -> *mut u8);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("ole32.dll" "system" fn SNB_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut *mut *mut u16) -> *mut u8);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserFree(param0 : *const u32, param1 : *const super:: STGMEDIUM));

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserFree64(param0 : *const u32, param1 : *const super:: STGMEDIUM));

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserMarshal(param0 : *const u32, param1 : *mut u8, param2 : *const super:: STGMEDIUM) -> *mut u8);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserMarshal64(param0 : *const u32, param1 : *mut u8, param2 : *const super:: STGMEDIUM) -> *mut u8);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserSize(param0 : *const u32, param1 : u32, param2 : *const super:: STGMEDIUM) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserSize64(param0 : *const u32, param1 : u32, param2 : *const super:: STGMEDIUM) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserUnmarshal(param0 : *const u32, param1 : *const u8, param2 : *mut super:: STGMEDIUM) -> *mut u8);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com_StructuredStorage"))]
// windows_link::link!("ole32.dll" "system" fn STGMEDIUM_UserUnmarshal64(param0 : *const u32, param1 : *const u8, param2 : *mut super:: STGMEDIUM) -> *mut u8);

public const val `SMEXF_HANDLER`: `STDMSHLFLAGS` = 2;
public const val `SMEXF_SERVER`: `STDMSHLFLAGS` = 1;
public typealias `STDMSHLFLAGS` = Int;
