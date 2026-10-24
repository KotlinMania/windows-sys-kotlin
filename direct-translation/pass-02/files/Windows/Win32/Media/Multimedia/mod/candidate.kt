// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIBuildFilterA(lpszfilter : windows_sys::core::PSTR, cbfilter : i32, fsaving : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIBuildFilterW(lpszfilter : windows_sys::core::PWSTR, cbfilter : i32, fsaving : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIClearClipboard() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileAddRef(pfile : * mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileCreateStreamA(pfile : * mut core::ffi::c_void, ppavi : *mut * mut core::ffi::c_void, psi : *const AVISTREAMINFOA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileCreateStreamW(pfile : * mut core::ffi::c_void, ppavi : *mut * mut core::ffi::c_void, psi : *const AVISTREAMINFOW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileEndRecord(pfile : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileExit());

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileGetStream(pfile : * mut core::ffi::c_void, ppavi : *mut * mut core::ffi::c_void, fcctype : u32, lparam : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileInfoA(pfile : * mut core::ffi::c_void, pfi : *mut AVIFILEINFOA, lsize : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileInfoW(pfile : * mut core::ffi::c_void, pfi : *mut AVIFILEINFOW, lsize : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileInit());

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileOpenA(ppfile : *mut * mut core::ffi::c_void, szfile : windows_sys::core::PCSTR, umode : u32, lphandler : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileOpenW(ppfile : *mut * mut core::ffi::c_void, szfile : windows_sys::core::PCWSTR, umode : u32, lphandler : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileReadData(pfile : * mut core::ffi::c_void, ckid : u32, lpdata : *mut core::ffi::c_void, lpcbdata : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileRelease(pfile : * mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIFileWriteData(pfile : * mut core::ffi::c_void, ckid : u32, lpdata : *const core::ffi::c_void, cbdata : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIGetFromClipboard(lppf : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIMakeCompressedStream(ppscompressed : *mut * mut core::ffi::c_void, ppssource : * mut core::ffi::c_void, lpoptions : *const AVICOMPRESSOPTIONS, pclsidhandler : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIMakeFileFromStreams(ppfile : *mut * mut core::ffi::c_void, nstreams : i32, papstreams : *const * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIMakeStreamFromClipboard(cfformat : u32, hglobal : super::super::Foundation:: HANDLE, ppstream : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIPutFileOnClipboard(pf : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "C" fn AVISaveA(szfile : windows_sys::core::PCSTR, pclsidhandler : *const windows_sys::core::GUID, lpfncallback : AVISAVECALLBACK, nstreams : i32, pfile : * mut core::ffi::c_void, lpoptions : *const AVICOMPRESSOPTIONS, ...) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVISaveOptions(hwnd : super::super::Foundation:: HWND, uiflags : u32, nstreams : i32, ppavi : *const * mut core::ffi::c_void, plpoptions : *mut *mut AVICOMPRESSOPTIONS) -> isize);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVISaveOptionsFree(nstreams : i32, plpoptions : *const *const AVICOMPRESSOPTIONS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVISaveVA(szfile : windows_sys::core::PCSTR, pclsidhandler : *const windows_sys::core::GUID, lpfncallback : AVISAVECALLBACK, nstreams : i32, ppavi : *const * mut core::ffi::c_void, plpoptions : *const *const AVICOMPRESSOPTIONS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVISaveVW(szfile : windows_sys::core::PCWSTR, pclsidhandler : *const windows_sys::core::GUID, lpfncallback : AVISAVECALLBACK, nstreams : i32, ppavi : *const * mut core::ffi::c_void, plpoptions : *const *const AVICOMPRESSOPTIONS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "C" fn AVISaveW(szfile : windows_sys::core::PCWSTR, pclsidhandler : *const windows_sys::core::GUID, lpfncallback : AVISAVECALLBACK, nstreams : i32, pfile : * mut core::ffi::c_void, lpoptions : *const AVICOMPRESSOPTIONS, ...) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamAddRef(pavi : * mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamBeginStreaming(pavi : * mut core::ffi::c_void, lstart : i32, lend : i32, lrate : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamCreate(ppavi : *mut * mut core::ffi::c_void, lparam1 : i32, lparam2 : i32, pclsidhandler : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamEndStreaming(pavi : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamFindSample(pavi : * mut core::ffi::c_void, lpos : i32, lflags : i32) -> i32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamGetFrame(pg : * mut core::ffi::c_void, lpos : i32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamGetFrameClose(pg : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("avifil32.dll" "system" fn AVIStreamGetFrameOpen(pavi : * mut core::ffi::c_void, lpbiwanted : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER) -> * mut core::ffi::c_void);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamInfoA(pavi : * mut core::ffi::c_void, psi : *mut AVISTREAMINFOA, lsize : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamInfoW(pavi : * mut core::ffi::c_void, psi : *mut AVISTREAMINFOW, lsize : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamLength(pavi : * mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamOpenFromFileA(ppavi : *mut * mut core::ffi::c_void, szfile : windows_sys::core::PCSTR, fcctype : u32, lparam : i32, mode : u32, pclsidhandler : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamOpenFromFileW(ppavi : *mut * mut core::ffi::c_void, szfile : windows_sys::core::PCWSTR, fcctype : u32, lparam : i32, mode : u32, pclsidhandler : *const windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamRead(pavi : * mut core::ffi::c_void, lstart : i32, lsamples : i32, lpbuffer : *mut core::ffi::c_void, cbbuffer : i32, plbytes : *mut i32, plsamples : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamReadData(pavi : * mut core::ffi::c_void, fcc : u32, lp : *mut core::ffi::c_void, lpcb : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamReadFormat(pavi : * mut core::ffi::c_void, lpos : i32, lpformat : *mut core::ffi::c_void, lpcbformat : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamRelease(pavi : * mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamSampleToTime(pavi : * mut core::ffi::c_void, lsample : i32) -> i32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamSetFormat(pavi : * mut core::ffi::c_void, lpos : i32, lpformat : *const core::ffi::c_void, cbformat : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamStart(pavi : * mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamTimeToSample(pavi : * mut core::ffi::c_void, ltime : i32) -> i32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamWrite(pavi : * mut core::ffi::c_void, lstart : i32, lsamples : i32, lpbuffer : *const core::ffi::c_void, cbbuffer : i32, dwflags : u32, plsampwritten : *mut i32, plbyteswritten : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn AVIStreamWriteData(pavi : * mut core::ffi::c_void, fcc : u32, lp : *const core::ffi::c_void, cb : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn CloseDriver(hdriver : HDRVR, lparam1 : super::super::Foundation:: LPARAM, lparam2 : super::super::Foundation:: LPARAM) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn CreateEditableStream(ppseditable : *mut * mut core::ffi::c_void, pssource : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn DefDriverProc(dwdriveridentifier : usize, hdrvr : HDRVR, umsg : u32, lparam1 : super::super::Foundation:: LPARAM, lparam2 : super::super::Foundation:: LPARAM) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibBegin(hdd : isize, hdc : super::super::Graphics::Gdi:: HDC, dxdst : i32, dydst : i32, lpbi : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, dxsrc : i32, dysrc : i32, wflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibChangePalette(hdd : isize, istart : i32, ilen : i32, lppe : *const super::super::Graphics::Gdi:: PALETTEENTRY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn DrawDibClose(hdd : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibDraw(hdd : isize, hdc : super::super::Graphics::Gdi:: HDC, xdst : i32, ydst : i32, dxdst : i32, dydst : i32, lpbi : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpbits : *const core::ffi::c_void, xsrc : i32, ysrc : i32, dxsrc : i32, dysrc : i32, wflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn DrawDibEnd(hdd : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibGetBuffer(hdd : isize, lpbi : *mut super::super::Graphics::Gdi:: BITMAPINFOHEADER, dwsize : u32, dwflags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibGetPalette(hdd : isize) -> super::super::Graphics::Gdi:: HPALETTE);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn DrawDibOpen() -> isize);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibProfileDisplay(lpbi : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibRealize(hdd : isize, hdc : super::super::Graphics::Gdi:: HDC, fbackground : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn DrawDibSetPalette(hdd : isize, hpal : super::super::Graphics::Gdi:: HPALETTE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn DrawDibStart(hdd : isize, rate : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn DrawDibStop(hdd : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn DrawDibTime(hdd : isize, lpddtime : *mut DRAWDIBTIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn DriverCallback(dwcallback : usize, dwflags : u32, hdevice : HDRVR, dwmsg : u32, dwuser : usize, dwparam1 : usize, dwparam2 : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn DrvGetModuleHandle(hdriver : HDRVR) -> super::super::Foundation:: HMODULE);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamClone(pavi : * mut core::ffi::c_void, ppresult : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamCopy(pavi : * mut core::ffi::c_void, plstart : *mut i32, pllength : *mut i32, ppresult : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamCut(pavi : * mut core::ffi::c_void, plstart : *mut i32, pllength : *mut i32, ppresult : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamPaste(pavi : * mut core::ffi::c_void, plpos : *mut i32, pllength : *mut i32, pstream : * mut core::ffi::c_void, lstart : i32, lend : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamSetInfoA(pavi : * mut core::ffi::c_void, lpinfo : *const AVISTREAMINFOA, cbinfo : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamSetInfoW(pavi : * mut core::ffi::c_void, lpinfo : *const AVISTREAMINFOW, cbinfo : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamSetNameA(pavi : * mut core::ffi::c_void, lpszname : windows_sys::core::PCSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("avifil32.dll" "system" fn EditStreamSetNameW(pavi : * mut core::ffi::c_void, lpszname : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn GetDriverModuleHandle(hdriver : HDRVR) -> super::super::Foundation:: HMODULE);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// windows_link::link!("msvfw32.dll" "system" fn GetOpenFileNamePreviewA(lpofn : *mut super::super::UI::Controls::Dialogs:: OPENFILENAMEA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// windows_link::link!("msvfw32.dll" "system" fn GetOpenFileNamePreviewW(lpofn : *mut super::super::UI::Controls::Dialogs:: OPENFILENAMEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// windows_link::link!("msvfw32.dll" "system" fn GetSaveFileNamePreviewA(lpofn : *mut super::super::UI::Controls::Dialogs:: OPENFILENAMEA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls_Dialogs")]
// windows_link::link!("msvfw32.dll" "system" fn GetSaveFileNamePreviewW(lpofn : *mut super::super::UI::Controls::Dialogs:: OPENFILENAMEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICClose(hic : HIC) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "C" fn ICCompress(hic : HIC, dwflags : u32, lpbioutput : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpdata : *mut core::ffi::c_void, lpbiinput : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpbits : *const core::ffi::c_void, lpckid : *mut u32, lpdwflags : *mut u32, lframenum : i32, dwframesize : u32, dwquality : u32, lpbiprev : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpprev : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICCompressorChoose(hwnd : super::super::Foundation:: HWND, uiflags : u32, pvin : *const core::ffi::c_void, lpdata : *const core::ffi::c_void, pc : *mut COMPVARS, lpsztitle : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICCompressorFree(pc : *const COMPVARS));

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "C" fn ICDecompress(hic : HIC, dwflags : u32, lpbiformat : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpdata : *const core::ffi::c_void, lpbi : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpbits : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "C" fn ICDraw(hic : HIC, dwflags : u32, lpformat : *const core::ffi::c_void, lpdata : *const core::ffi::c_void, cbdata : u32, ltime : i32) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "C" fn ICDrawBegin(hic : HIC, dwflags : u32, hpal : super::super::Graphics::Gdi:: HPALETTE, hwnd : super::super::Foundation:: HWND, hdc : super::super::Graphics::Gdi:: HDC, xdst : i32, ydst : i32, dxdst : i32, dydst : i32, lpbi : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, xsrc : i32, ysrc : i32, dxsrc : i32, dysrc : i32, dwrate : u32, dwscale : u32) -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICGetDisplayFormat(hic : HIC, lpbiin : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpbiout : *mut super::super::Graphics::Gdi:: BITMAPINFOHEADER, bitdepth : i32, dx : i32, dy : i32) -> HIC);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICGetInfo(hic : HIC, picinfo : *mut ICINFO, cb : u32) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICImageCompress(hic : HIC, uiflags : u32, lpbiin : *const super::super::Graphics::Gdi:: BITMAPINFO, lpbits : *const core::ffi::c_void, lpbiout : *const super::super::Graphics::Gdi:: BITMAPINFO, lquality : i32, plsize : *mut i32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICImageDecompress(hic : HIC, uiflags : u32, lpbiin : *const super::super::Graphics::Gdi:: BITMAPINFO, lpbits : *const core::ffi::c_void, lpbiout : *const super::super::Graphics::Gdi:: BITMAPINFO) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICInfo(fcctype : u32, fcchandler : u32, lpicinfo : *mut ICINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICInstall(fcctype : u32, fcchandler : u32, lparam : super::super::Foundation:: LPARAM, szdesc : windows_sys::core::PCSTR, wflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICLocate(fcctype : u32, fcchandler : u32, lpbiin : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, lpbiout : *const super::super::Graphics::Gdi:: BITMAPINFOHEADER, wflags : u16) -> HIC);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICOpen(fcctype : u32, fcchandler : u32, wmode : u32) -> HIC);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICOpenFunction(fcctype : u32, fcchandler : u32, wmode : u32, lpfnhandler : super::super::Foundation:: FARPROC) -> HIC);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICRemove(fcctype : u32, fcchandler : u32, wflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn ICSendMessage(hic : HIC, msg : u32, dw1 : usize, dw2 : usize) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICSeqCompressFrame(pc : *const COMPVARS, uiflags : u32, lpbits : *const core::ffi::c_void, pfkey : *mut windows_sys::core::BOOL, plsize : *mut i32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICSeqCompressFrameEnd(pc : *const COMPVARS));

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("msvfw32.dll" "system" fn ICSeqCompressFrameStart(pc : *const COMPVARS, lpbiin : *const super::super::Graphics::Gdi:: BITMAPINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "C" fn MCIWndCreateA(hwndparent : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, dwstyle : u32, szfile : windows_sys::core::PCSTR) -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "C" fn MCIWndCreateW(hwndparent : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, dwstyle : u32, szfile : windows_sys::core::PCWSTR) -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "C" fn MCIWndRegisterClass() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn OpenDriver(szdrivername : windows_sys::core::PCWSTR, szsectionname : windows_sys::core::PCWSTR, lparam2 : super::super::Foundation:: LPARAM) -> HDRVR);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn SendDriverMessage(hdriver : HDRVR, message : u32, lparam1 : super::super::Foundation:: LPARAM, lparam2 : super::super::Foundation:: LPARAM) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("msvfw32.dll" "system" fn VideoForWindowsVersion() -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("avicap32.dll" "system" fn capCreateCaptureWindowA(lpszwindowname : windows_sys::core::PCSTR, dwstyle : u32, x : i32, y : i32, nwidth : i32, nheight : i32, hwndparent : super::super::Foundation:: HWND, nid : i32) -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("avicap32.dll" "system" fn capCreateCaptureWindowW(lpszwindowname : windows_sys::core::PCWSTR, dwstyle : u32, x : i32, y : i32, nwidth : i32, nheight : i32, hwndparent : super::super::Foundation:: HWND, nid : i32) -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("avicap32.dll" "system" fn capGetDriverDescriptionA(wdriverindex : u32, lpszname : windows_sys::core::PSTR, cbname : i32, lpszver : windows_sys::core::PSTR, cbver : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("avicap32.dll" "system" fn capGetDriverDescriptionW(wdriverindex : u32, lpszname : windows_sys::core::PWSTR, cbname : i32, lpszver : windows_sys::core::PWSTR, cbver : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joyGetDevCapsA(ujoyid : usize, pjc : *mut JOYCAPSA, cbjc : u32) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joyGetDevCapsW(ujoyid : usize, pjc : *mut JOYCAPSW, cbjc : u32) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joyGetNumDevs() -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joyGetPos(ujoyid : u32, pji : *mut JOYINFO) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joyGetPosEx(ujoyid : u32, pji : *mut JOYINFOEX) -> u32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joyGetThreshold(ujoyid : u32, puthreshold : *mut u32) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joyReleaseCapture(ujoyid : u32) -> u32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joySetCapture(hwnd : super::super::Foundation:: HWND, ujoyid : u32, uperiod : u32, fchanged : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn joySetThreshold(ujoyid : u32, uthreshold : u32) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciDriverNotify(hwndcallback : super::super::Foundation:: HANDLE, wdeviceid : u32, ustatus : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciDriverYield(wdeviceid : u32) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciFreeCommandResource(wtable : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetCreatorTask(mciid : u32) -> super:: HTASK);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetDeviceIDA(pszdevice : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetDeviceIDFromElementIDA(dwelementid : u32, lpstrtype : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetDeviceIDFromElementIDW(dwelementid : u32, lpstrtype : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetDeviceIDW(pszdevice : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetDriverData(wdeviceid : u32) -> usize);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetErrorStringA(mcierr : u32, psztext : windows_sys::core::PSTR, cchtext : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetErrorStringW(mcierr : u32, psztext : windows_sys::core::PWSTR, cchtext : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciGetYieldProc(mciid : u32, pdwyielddata : *const u32) -> YIELDPROC);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciLoadCommandResource(hinstance : super::super::Foundation:: HANDLE, lpresname : windows_sys::core::PCWSTR, wtype : u32) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciSendCommandA(mciid : u32, umsg : u32, dwparam1 : usize, dwparam2 : usize) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciSendCommandW(mciid : u32, umsg : u32, dwparam1 : usize, dwparam2 : usize) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciSendStringA(lpstrcommand : windows_sys::core::PCSTR, lpstrreturnstring : windows_sys::core::PSTR, ureturnlength : u32, hwndcallback : super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciSendStringW(lpstrcommand : windows_sys::core::PCWSTR, lpstrreturnstring : windows_sys::core::PWSTR, ureturnlength : u32, hwndcallback : super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciSetDriverData(wdeviceid : u32, dwdata : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mciSetYieldProc(mciid : u32, fpyieldproc : YIELDPROC, dwyielddata : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmDrvInstall(hdriver : HDRVR, wszdrventry : windows_sys::core::PCWSTR, drvmessage : DRIVERMSGPROC, wflags : u32) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmGetCurrentTask() -> u32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmTaskBlock(h : u32));

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmTaskCreate(lpfn : LPTASKCALLBACK, lph : *mut super::super::Foundation:: HANDLE, dwinst : usize) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmTaskSignal(h : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmTaskYield());

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioAdvance(hmmio : HMMIO, pmmioinfo : *const MMIOINFO, fuadvance : u32) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioAscend(hmmio : HMMIO, pmmcki : *const MMCKINFO, fuascend : u32) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioClose(hmmio : HMMIO, fuclose : u32) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioCreateChunk(hmmio : HMMIO, pmmcki : *const MMCKINFO, fucreate : u32) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioDescend(hmmio : HMMIO, pmmcki : *mut MMCKINFO, pmmckiparent : *const MMCKINFO, fudescend : u32) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioFlush(hmmio : HMMIO, fuflush : u32) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioGetInfo(hmmio : HMMIO, pmmioinfo : *mut MMIOINFO, fuinfo : u32) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioInstallIOProcA(fccioproc : u32, pioproc : LPMMIOPROC, dwflags : u32) -> LPMMIOPROC);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioInstallIOProcW(fccioproc : u32, pioproc : LPMMIOPROC, dwflags : u32) -> LPMMIOPROC);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioOpenA(pszfilename : windows_sys::core::PSTR, pmmioinfo : *mut MMIOINFO, fdwopen : u32) -> HMMIO);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioOpenW(pszfilename : windows_sys::core::PWSTR, pmmioinfo : *mut MMIOINFO, fdwopen : u32) -> HMMIO);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioRead(hmmio : HMMIO, pch : *mut i8, cch : i32) -> i32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioRenameA(pszfilename : windows_sys::core::PCSTR, psznewfilename : windows_sys::core::PCSTR, pmmioinfo : *const MMIOINFO, fdwrename : u32) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioRenameW(pszfilename : windows_sys::core::PCWSTR, psznewfilename : windows_sys::core::PCWSTR, pmmioinfo : *const MMIOINFO, fdwrename : u32) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioSeek(hmmio : HMMIO, loffset : i32, iorigin : i32) -> i32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioSendMessage(hmmio : HMMIO, umsg : u32, lparam1 : super::super::Foundation:: LPARAM, lparam2 : super::super::Foundation:: LPARAM) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioSetBuffer(hmmio : HMMIO, pchbuffer : windows_sys::core::PSTR, cchbuffer : i32, fubuffer : u32) -> u32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioSetInfo(hmmio : HMMIO, pmmioinfo : *const MMIOINFO, fuinfo : u32) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioStringToFOURCCA(sz : windows_sys::core::PCSTR, uflags : u32) -> u32);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioStringToFOURCCW(sz : windows_sys::core::PCWSTR, uflags : u32) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn mmioWrite(hmmio : HMMIO, pch : windows_sys::core::PCSTR, cch : i32) -> i32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-mm-misc-l1-1-1.dll" "system" fn sndOpenSound(eventname : windows_sys::core::PCWSTR, appname : windows_sys::core::PCWSTR, flags : i32, filehandle : *mut super::super::Foundation:: HANDLE) -> i32);

public const val `ACMDM_BASE`: UInt = 24576u;
public const val `ACM_MPEG_COPYRIGHT`: UInt = 2u;
public const val `ACM_MPEG_DUALCHANNEL`: UInt = 4u;
public const val `ACM_MPEG_ID_MPEG1`: UInt = 16u;
public const val `ACM_MPEG_JOINTSTEREO`: UInt = 2u;
public const val `ACM_MPEG_LAYER1`: UInt = 1u;
public const val `ACM_MPEG_LAYER2`: UInt = 2u;
public const val `ACM_MPEG_LAYER3`: UInt = 4u;
public const val `ACM_MPEG_ORIGINALHOME`: UInt = 4u;
public const val `ACM_MPEG_PRIVATEBIT`: UInt = 1u;
public const val `ACM_MPEG_PROTECTIONBIT`: UInt = 8u;
public const val `ACM_MPEG_SINGLECHANNEL`: UInt = 8u;
public const val `ACM_MPEG_STEREO`: UInt = 1u;
// UNSUPPORTED Rust 209:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct ADPCMCOEFSET {
//     pub iCoef1: i16,
//     pub iCoef2: i16,
// }

// UNSUPPORTED Rust 215:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct ADPCMEWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

// UNSUPPORTED Rust 222:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy)]
// pub struct ADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
//     pub wNumCoef: u16,
//     pub aCoef: [ADPCMCOEFSET; 1],
// }

// UNSUPPORTED Rust 231:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Media_Audio")]
// impl Default for ADPCMWAVEFORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 237:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct APTXWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 243:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct AUDIOFILE_AF10WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 249:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct AUDIOFILE_AF36WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

public const val `AUXDM_GETDEVCAPS`: UInt = 4u;
public const val `AUXDM_GETNUMDEVS`: UInt = 3u;
public const val `AUXDM_GETVOLUME`: UInt = 5u;
public const val `AUXDM_SETVOLUME`: UInt = 6u;
public const val `AUXM_INIT`: UInt = 100u;
public const val `AUXM_INIT_EX`: UInt = 104u;
public const val `AVICOMPRESSF_DATARATE`: UInt = 2u;
public const val `AVICOMPRESSF_INTERLEAVE`: UInt = 1u;
public const val `AVICOMPRESSF_KEYFRAMES`: UInt = 4u;
public const val `AVICOMPRESSF_VALID`: UInt = 8u;
// UNSUPPORTED Rust 265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVICOMPRESSOPTIONS {
//     pub fccType: u32,
//     pub fccHandler: u32,
//     pub dwKeyFrameEvery: u32,
//     pub dwQuality: u32,
//     pub dwBytesPerSecond: u32,
//     pub dwFlags: u32,
//     pub lpFormat: *mut core::ffi::c_void,
//     pub cbFormat: u32,
//     pub lpParms: *mut core::ffi::c_void,
//     pub cbParms: u32,
//     pub dwInterleaveEvery: u32,
// }

// UNSUPPORTED Rust 280:1: declaration Impl has no candidate rule
// impl Default for AVICOMPRESSOPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AVIERR_OK`: Int = 0;
public const val `AVIFILECAPS_ALLKEYFRAMES`: UInt = 16u;
public const val `AVIFILECAPS_CANREAD`: UInt = 1u;
public const val `AVIFILECAPS_CANWRITE`: UInt = 2u;
public const val `AVIFILECAPS_NOCOMPRESSION`: UInt = 32u;
public const val `AVIFILEHANDLER_CANACCEPTNONRGB`: UInt = 4u;
public const val `AVIFILEHANDLER_CANREAD`: UInt = 1u;
public const val `AVIFILEHANDLER_CANWRITE`: UInt = 2u;
// UNSUPPORTED Rust 293:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVIFILEINFOA {
//     pub dwMaxBytesPerSec: u32,
//     pub dwFlags: u32,
//     pub dwCaps: u32,
//     pub dwStreams: u32,
//     pub dwSuggestedBufferSize: u32,
//     pub dwWidth: u32,
//     pub dwHeight: u32,
//     pub dwScale: u32,
//     pub dwRate: u32,
//     pub dwLength: u32,
//     pub dwEditCount: u32,
//     pub szFileType: [i8; 64],
// }

// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule
// impl Default for AVIFILEINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 314:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVIFILEINFOW {
//     pub dwMaxBytesPerSec: u32,
//     pub dwFlags: u32,
//     pub dwCaps: u32,
//     pub dwStreams: u32,
//     pub dwSuggestedBufferSize: u32,
//     pub dwWidth: u32,
//     pub dwHeight: u32,
//     pub dwScale: u32,
//     pub dwRate: u32,
//     pub dwLength: u32,
//     pub dwEditCount: u32,
//     pub szFileType: [u16; 64],
// }

// UNSUPPORTED Rust 330:1: declaration Impl has no candidate rule
// impl Default for AVIFILEINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AVIFILEINFO_COPYRIGHTED`: UInt = 131072u;
public const val `AVIFILEINFO_HASINDEX`: UInt = 16u;
public const val `AVIFILEINFO_ISINTERLEAVED`: UInt = 256u;
public const val `AVIFILEINFO_MUSTUSEINDEX`: UInt = 32u;
public const val `AVIFILEINFO_WASCAPTUREFILE`: UInt = 65536u;
public const val `AVIGETFRAMEF_BESTDISPLAYFMT`: UInt = 1u;
public const val `AVIIF_CONTROLFRAME`: Int = 512;
public const val `AVIIF_TWOCC`: Int = 2;
// UNSUPPORTED Rust 343:1: generic scalar type unsupported
// pub type AVISAVECALLBACK = Option<unsafe extern "system" fn(param0: i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVISTREAMINFOA {
//     pub fccType: u32,
//     pub fccHandler: u32,
//     pub dwFlags: u32,
//     pub dwCaps: u32,
//     pub wPriority: u16,
//     pub wLanguage: u16,
//     pub dwScale: u32,
//     pub dwRate: u32,
//     pub dwStart: u32,
//     pub dwLength: u32,
//     pub dwInitialFrames: u32,
//     pub dwSuggestedBufferSize: u32,
//     pub dwQuality: u32,
//     pub dwSampleSize: u32,
//     pub rcFrame: super::super::Foundation::RECT,
//     pub dwEditCount: u32,
//     pub dwFormatChangeCount: u32,
//     pub szName: [i8; 64],
// }

// UNSUPPORTED Rust 366:1: declaration Impl has no candidate rule
// impl Default for AVISTREAMINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 371:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AVISTREAMINFOW {
//     pub fccType: u32,
//     pub fccHandler: u32,
//     pub dwFlags: u32,
//     pub dwCaps: u32,
//     pub wPriority: u16,
//     pub wLanguage: u16,
//     pub dwScale: u32,
//     pub dwRate: u32,
//     pub dwStart: u32,
//     pub dwLength: u32,
//     pub dwInitialFrames: u32,
//     pub dwSuggestedBufferSize: u32,
//     pub dwQuality: u32,
//     pub dwSampleSize: u32,
//     pub rcFrame: super::super::Foundation::RECT,
//     pub dwEditCount: u32,
//     pub dwFormatChangeCount: u32,
//     pub szName: [u16; 64],
// }

// UNSUPPORTED Rust 393:1: declaration Impl has no candidate rule
// impl Default for AVISTREAMINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AVISTREAMINFO_DISABLED`: UInt = 1u;
public const val `AVISTREAMINFO_FORMATCHANGES`: UInt = 65536u;
public const val `AVISTREAMREAD_CONVENIENT`: Int = -1;
public const val `AVSTREAMMASTER_AUDIO`: UInt = 0u;
public const val `AVSTREAMMASTER_NONE`: UInt = 1u;
public const val `BI_1632`: UInt = 842217009u;
// UNSUPPORTED Rust 404:1: generic scalar type unsupported
// pub type CAPCONTROLCALLBACK = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, nstate: i32) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 405:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAPDRIVERCAPS {
//     pub wDeviceIndex: u32,
//     pub fHasOverlay: windows_sys::core::BOOL,
//     pub fHasDlgVideoSource: windows_sys::core::BOOL,
//     pub fHasDlgVideoFormat: windows_sys::core::BOOL,
//     pub fHasDlgVideoDisplay: windows_sys::core::BOOL,
//     pub fCaptureInitialized: windows_sys::core::BOOL,
//     pub fDriverSuppliesPalettes: windows_sys::core::BOOL,
//     pub hVideoIn: super::super::Foundation::HANDLE,
//     pub hVideoOut: super::super::Foundation::HANDLE,
//     pub hVideoExtIn: super::super::Foundation::HANDLE,
//     pub hVideoExtOut: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 420:1: declaration Impl has no candidate rule
// impl Default for CAPDRIVERCAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 425:1: generic scalar type unsupported
// pub type CAPERRORCALLBACKA = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, nid: i32, lpsz: windows_sys::core::PCSTR) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 426:1: generic scalar type unsupported
// pub type CAPERRORCALLBACKW = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, nid: i32, lpsz: windows_sys::core::PCWSTR) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 427:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAPINFOCHUNK {
//     pub fccInfoID: u32,
//     pub lpData: *mut core::ffi::c_void,
//     pub cbData: i32,
// }

// UNSUPPORTED Rust 434:1: declaration Impl has no candidate rule
// impl Default for CAPINFOCHUNK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 439:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct CAPSTATUS {
//     pub uiImageWidth: u32,
//     pub uiImageHeight: u32,
//     pub fLiveWindow: windows_sys::core::BOOL,
//     pub fOverlayWindow: windows_sys::core::BOOL,
//     pub fScale: windows_sys::core::BOOL,
//     pub ptScroll: super::super::Foundation::POINT,
//     pub fUsingDefaultPalette: windows_sys::core::BOOL,
//     pub fAudioHardware: windows_sys::core::BOOL,
//     pub fCapFileExists: windows_sys::core::BOOL,
//     pub dwCurrentVideoFrame: u32,
//     pub dwCurrentVideoFramesDropped: u32,
//     pub dwCurrentWaveSamples: u32,
//     pub dwCurrentTimeElapsedMS: u32,
//     pub hPalCurrent: super::super::Graphics::Gdi::HPALETTE,
//     pub fCapturingNow: windows_sys::core::BOOL,
//     pub dwReturn: u32,
//     pub wNumVideoAllocated: u32,
//     pub wNumAudioAllocated: u32,
// }

// UNSUPPORTED Rust 462:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CAPSTATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 468:1: generic scalar type unsupported
// pub type CAPSTATUSCALLBACKA = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, nid: i32, lpsz: windows_sys::core::PCSTR) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 469:1: generic scalar type unsupported
// pub type CAPSTATUSCALLBACKW = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, nid: i32, lpsz: windows_sys::core::PCWSTR) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 470:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CAPTUREPARMS {
//     pub dwRequestMicroSecPerFrame: u32,
//     pub fMakeUserHitOKToCapture: windows_sys::core::BOOL,
//     pub wPercentDropForError: u32,
//     pub fYield: windows_sys::core::BOOL,
//     pub dwIndexSize: u32,
//     pub wChunkGranularity: u32,
//     pub fUsingDOSMemory: windows_sys::core::BOOL,
//     pub wNumVideoRequested: u32,
//     pub fCaptureAudio: windows_sys::core::BOOL,
//     pub wNumAudioRequested: u32,
//     pub vKeyAbort: u32,
//     pub fAbortLeftMouse: windows_sys::core::BOOL,
//     pub fAbortRightMouse: windows_sys::core::BOOL,
//     pub fLimitEnabled: windows_sys::core::BOOL,
//     pub wTimeLimit: u32,
//     pub fMCIControl: windows_sys::core::BOOL,
//     pub fStepMCIDevice: windows_sys::core::BOOL,
//     pub dwMCIStartTime: u32,
//     pub dwMCIStopTime: u32,
//     pub fStepCaptureAt2x: windows_sys::core::BOOL,
//     pub wStepCaptureAverageFrames: u32,
//     pub dwAudioBufferSize: u32,
//     pub fDisableWriteCache: windows_sys::core::BOOL,
//     pub AVStreamMaster: u32,
// }

// UNSUPPORTED Rust 498:1: generic scalar type unsupported
// pub type CAPVIDEOCALLBACK = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, lpvhdr: *const VIDEOHDR) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 499:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Media_Audio")]
// pub type CAPWAVECALLBACK = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, lpwhdr: *const super::Audio::WAVEHDR) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 501:1: generic scalar type unsupported
// pub type CAPYIELDCALLBACK = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 502:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CHANNEL_CAPS {
//     pub dwFlags: u32,
//     pub dwSrcRectXMod: u32,
//     pub dwSrcRectYMod: u32,
//     pub dwSrcRectWidthMod: u32,
//     pub dwSrcRectHeightMod: u32,
//     pub dwDstRectXMod: u32,
//     pub dwDstRectYMod: u32,
//     pub dwDstRectWidthMod: u32,
//     pub dwDstRectHeightMod: u32,
// }

// UNSUPPORTED Rust 515:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_AVIFile: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00020000_0000_0000_c000_000000000046);

// UNSUPPORTED Rust 516:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_AVISimpleUnMarshal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00020009_0000_0000_c000_000000000046);

// UNSUPPORTED Rust 517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct COMPVARS {
//     pub cbSize: i32,
//     pub dwFlags: u32,
//     pub hic: HIC,
//     pub fccType: u32,
//     pub fccHandler: u32,
//     pub lpbiIn: *mut super::super::Graphics::Gdi::BITMAPINFO,
//     pub lpbiOut: *mut super::super::Graphics::Gdi::BITMAPINFO,
//     pub lpBitsOut: *mut core::ffi::c_void,
//     pub lpBitsPrev: *mut core::ffi::c_void,
//     pub lFrame: i32,
//     pub lKey: i32,
//     pub lDataRate: i32,
//     pub lQ: i32,
//     pub lKeyCount: i32,
//     pub lpState: *mut core::ffi::c_void,
//     pub cbState: i32,
// }

// UNSUPPORTED Rust 538:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for COMPVARS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 544:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct CONTRESCR10WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

// UNSUPPORTED Rust 551:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct CONTRESVQLPCWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

public const val `CONTROLCALLBACK_CAPTURING`: UInt = 2u;
public const val `CONTROLCALLBACK_PREROLL`: UInt = 1u;
// UNSUPPORTED Rust 560:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct CREATIVEADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wRevision: u16,
// }

// UNSUPPORTED Rust 567:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct CREATIVEFASTSPEECH10WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wRevision: u16,
// }

// UNSUPPORTED Rust 574:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct CREATIVEFASTSPEECH8WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wRevision: u16,
// }

public const val `CRYSTAL_NET_SFM_CODEC`: UInt = 1u;
// UNSUPPORTED Rust 582:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct CSIMAADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

public const val `DCB_EVENT`: UInt = 5u;
public const val `DCB_FUNCTION`: UInt = 3u;
public const val `DCB_NOSWITCH`: UInt = 8u;
public const val `DCB_NULL`: UInt = 0u;
public const val `DCB_TASK`: UInt = 2u;
public const val `DCB_TYPEMASK`: UInt = 7u;
public const val `DCB_WINDOW`: UInt = 1u;
public const val `DDF_0001`: UInt = 1u;
public const val `DDF_2000`: UInt = 8192u;
public const val `DDF_ANIMATE`: UInt = 32u;
public const val `DDF_BACKGROUNDPAL`: UInt = 512u;
public const val `DDF_BUFFER`: UInt = 64u;
public const val `DDF_DONTDRAW`: UInt = 16u;
public const val `DDF_FULLSCREEN`: UInt = 256u;
public const val `DDF_HALFTONE`: UInt = 4096u;
public const val `DDF_HURRYUP`: UInt = 2048u;
public const val `DDF_JUSTDRAWIT`: UInt = 128u;
public const val `DDF_NOTKEYFRAME`: UInt = 1024u;
public const val `DDF_PREROLL`: UInt = 16u;
public const val `DDF_SAME_DIB`: UInt = 8u;
public const val `DDF_SAME_DRAW`: UInt = 8u;
public const val `DDF_SAME_HDC`: UInt = 4u;
public const val `DDF_SAME_SIZE`: UInt = 8u;
public const val `DDF_UPDATE`: UInt = 2u;
// UNSUPPORTED Rust 612:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DIALOGICOKIADPCMWAVEFORMAT {
//     pub ewf: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 618:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DIGIADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

// UNSUPPORTED Rust 625:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DIGIFIXWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 631:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DIGIREALWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

// UNSUPPORTED Rust 638:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DIGISTDWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

public const val `DLG_ACMFILTERCHOOSE_ID`: UInt = 71u;
public const val `DLG_ACMFORMATCHOOSE_ID`: UInt = 70u;
// UNSUPPORTED Rust 646:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DOLBYAC2WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub nAuxBitsCode: u16,
// }

// UNSUPPORTED Rust 653:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DRAWDIBTIME {
//     pub timeCount: i32,
//     pub timeDraw: i32,
//     pub timeDecompress: i32,
//     pub timeDither: i32,
//     pub timeStretch: i32,
//     pub timeBlt: i32,
//     pub timeSetDIBits: i32,
// }

// UNSUPPORTED Rust 664:1: generic scalar type unsupported
// pub type DRIVERMSGPROC = Option<unsafe extern "system" fn(param0: u32, param1: u32, param2: usize, param3: usize, param4: usize) -> u32>;

// UNSUPPORTED Rust 665:1: generic scalar type unsupported
// pub type DRIVERPROC = Option<unsafe extern "system" fn(param0: usize, param1: HDRVR, param2: u32, param3: super::super::Foundation::LPARAM, param4: super::super::Foundation::LPARAM) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 666:1: non-scalar type Ptr unsupported
// pub const DRIVERS_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DRIVERS32");

// UNSUPPORTED Rust 667:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DRMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wReserved: u16,
//     pub ulContentId: u32,
//     pub wfxSecure: super::Audio::WAVEFORMATEX,
// }

public const val `DRVCNF_CANCEL`: UInt = 0u;
public const val `DRVCNF_OK`: UInt = 1u;
public const val `DRVCNF_RESTART`: UInt = 2u;
// UNSUPPORTED Rust 679:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DRVCONFIGINFO {
//     pub dwDCISize: u32,
//     pub lpszDCISectionName: windows_sys::core::PCWSTR,
//     pub lpszDCIAliasName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 686:1: declaration Impl has no candidate rule
// impl Default for DRVCONFIGINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 691:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DRVCONFIGINFOEX {
//     pub dwDCISize: u32,
//     pub lpszDCISectionName: windows_sys::core::PCWSTR,
//     pub lpszDCIAliasName: windows_sys::core::PCWSTR,
//     pub dnDevNode: u32,
// }

// UNSUPPORTED Rust 699:1: declaration Impl has no candidate rule
// impl Default for DRVCONFIGINFOEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DRVM_ADD_THRU`: UInt = 257u;
public const val `DRVM_DISABLE`: UInt = 102u;
public const val `DRVM_ENABLE`: UInt = 103u;
public const val `DRVM_EXIT`: UInt = 101u;
public const val `DRVM_INIT`: UInt = 100u;
public const val `DRVM_INIT_EX`: UInt = 104u;
public const val `DRVM_IOCTL`: UInt = 256u;
public const val `DRVM_IOCTL_CMD_SYSTEM`: Int = -2147483648;
public const val `DRVM_IOCTL_CMD_USER`: Int = 0;
// UNSUPPORTED Rust 713:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DRVM_IOCTL_DATA {
//     pub dwSize: u32,
//     pub dwCmd: u32,
// }

public const val `DRVM_IOCTL_LAST`: UInt = 261u;
public const val `DRVM_MAPPER_CONSOLEVOICECOM_GET`: UInt = 8215u;
public const val `DRVM_MAPPER_PREFERRED_FLAGS_PREFERREDONLY`: UInt = 1u;
public const val `DRVM_MAPPER_PREFERRED_GET`: UInt = 8213u;
public const val `DRVM_MAPPER_RECONFIGURE`: UInt = 8193u;
public const val `DRVM_REMOVE_THRU`: UInt = 258u;
public const val `DRVM_USER`: UInt = 16384u;
public const val `DRV_CANCEL`: UInt = 0u;
public const val `DRV_CLOSE`: UInt = 4u;
public const val `DRV_CONFIGURE`: UInt = 7u;
public const val `DRV_DISABLE`: UInt = 5u;
public const val `DRV_ENABLE`: UInt = 2u;
public const val `DRV_EXITSESSION`: UInt = 11u;
public const val `DRV_FREE`: UInt = 6u;
public const val `DRV_INSTALL`: UInt = 9u;
public const val `DRV_LOAD`: UInt = 1u;
public const val `DRV_MCI_FIRST`: UInt = 2048u;
public const val `DRV_MCI_LAST`: UInt = 6143u;
public const val `DRV_OK`: UInt = 1u;
public const val `DRV_OPEN`: UInt = 3u;
public const val `DRV_PNPINSTALL`: UInt = 2059u;
public const val `DRV_POWER`: UInt = 15u;
public const val `DRV_QUERYCONFIGURE`: UInt = 8u;
public const val `DRV_QUERYDEVICEINTERFACE`: UInt = 2060u;
public const val `DRV_QUERYDEVICEINTERFACESIZE`: UInt = 2061u;
public const val `DRV_QUERYDEVNODE`: UInt = 2050u;
public const val `DRV_QUERYFUNCTIONINSTANCEID`: UInt = 2065u;
public const val `DRV_QUERYFUNCTIONINSTANCEIDSIZE`: UInt = 2066u;
public const val `DRV_QUERYIDFROMSTRINGID`: UInt = 2064u;
public const val `DRV_QUERYMAPPABLE`: UInt = 2053u;
public const val `DRV_QUERYMODULE`: UInt = 2057u;
public const val `DRV_QUERYSTRINGID`: UInt = 2062u;
public const val `DRV_QUERYSTRINGIDSIZE`: UInt = 2063u;
public const val `DRV_REMOVE`: UInt = 10u;
public const val `DRV_RESERVED`: UInt = 2048u;
public const val `DRV_RESTART`: UInt = 2u;
public const val `DRV_USER`: UInt = 16384u;
// UNSUPPORTED Rust 756:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct DVIADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

public const val `DVM_CONFIGURE_END`: UInt = 8191u;
public const val `DVM_CONFIGURE_START`: UInt = 4096u;
public const val `DVM_DST_RECT`: UInt = 4101u;
public const val `DVM_FORMAT`: UInt = 4098u;
public const val `DVM_PALETTE`: UInt = 4097u;
public const val `DVM_PALETTERGB555`: UInt = 4099u;
public const val `DVM_SRC_RECT`: UInt = 4100u;
public const val `DVM_USER`: UInt = 16384u;
public const val `DV_ERR_13`: UInt = 16u;
public const val `DV_ERR_ALLOCATED`: UInt = 19u;
public const val `DV_ERR_BADDEVICEID`: UInt = 20u;
public const val `DV_ERR_BADERRNUM`: UInt = 22u;
public const val `DV_ERR_BADFORMAT`: UInt = 2u;
public const val `DV_ERR_BADINSTALL`: UInt = 8u;
public const val `DV_ERR_BASE`: UInt = 1u;
public const val `DV_ERR_CONFIG1`: UInt = 13u;
public const val `DV_ERR_CONFIG2`: UInt = 14u;
public const val `DV_ERR_CREATEPALETTE`: UInt = 9u;
public const val `DV_ERR_DMA_CONFLICT`: UInt = 26u;
public const val `DV_ERR_FLAGS`: UInt = 15u;
public const val `DV_ERR_INT_CONFLICT`: UInt = 27u;
public const val `DV_ERR_INVALHANDLE`: UInt = 21u;
public const val `DV_ERR_IO_CONFLICT`: UInt = 25u;
public const val `DV_ERR_LASTERROR`: UInt = 28u;
public const val `DV_ERR_MEM_CONFLICT`: UInt = 24u;
public const val `DV_ERR_NOMEM`: UInt = 18u;
public const val `DV_ERR_NONSPECIFIC`: UInt = 1u;
public const val `DV_ERR_NOTDETECTED`: UInt = 7u;
public const val `DV_ERR_NOTSUPPORTED`: UInt = 17u;
public const val `DV_ERR_NO_BUFFERS`: UInt = 23u;
public const val `DV_ERR_OK`: UInt = 0u;
public const val `DV_ERR_PARAM1`: UInt = 11u;
public const val `DV_ERR_PARAM2`: UInt = 12u;
public const val `DV_ERR_PROTECT_ONLY`: UInt = 28u;
public const val `DV_ERR_SIZEFIELD`: UInt = 10u;
public const val `DV_ERR_STILLPLAYING`: UInt = 3u;
public const val `DV_ERR_SYNC`: UInt = 5u;
public const val `DV_ERR_TOOMANYCHANNELS`: UInt = 6u;
public const val `DV_ERR_UNPREPARED`: UInt = 4u;
public const val `DV_ERR_USER_MSG`: UInt = 1001u;
public const val `DV_VM_CLOSE`: UInt = 977u;
public const val `DV_VM_DATA`: UInt = 978u;
public const val `DV_VM_ERROR`: UInt = 979u;
public const val `DV_VM_OPEN`: UInt = 976u;
// UNSUPPORTED Rust 807:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct ECHOSC1WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 813:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct EXBMINFOHEADER {
//     pub bmi: super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub biExtDataOffset: u32,
// }

public const val `FACILITY_NS`: UInt = 13u;
public const val `FACILITY_NS_WIN32`: UInt = 7u;
public const val `FIND_ANY`: Int = 32;
public const val `FIND_DIR`: Int = 15;
public const val `FIND_FORMAT`: Int = 64;
public const val `FIND_FROM_START`: Int = 8;
public const val `FIND_INDEX`: Int = 16384;
public const val `FIND_KEY`: Int = 16;
public const val `FIND_LENGTH`: Int = 4096;
public const val `FIND_NEXT`: Int = 1;
public const val `FIND_OFFSET`: Int = 8192;
public const val `FIND_POS`: Int = 0;
public const val `FIND_PREV`: Int = 4;
public const val `FIND_RET`: Int = 61440;
public const val `FIND_SIZE`: Int = 12288;
public const val `FIND_TYPE`: Int = 240;
// UNSUPPORTED Rust 836:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct FMTOWNS_SND_WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wRevision: u16,
// }

// UNSUPPORTED Rust 843:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct G721_ADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub nAuxBlockSize: u16,
// }

// UNSUPPORTED Rust 850:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct G723_ADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub cbExtraSize: u16,
//     pub nAuxBlockSize: u16,
// }

// UNSUPPORTED Rust 858:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct GSM610WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

// UNSUPPORTED Rust 865:1: non-scalar type Ptr unsupported
// pub type HDRVR = *mut core::ffi::c_void;

// UNSUPPORTED Rust 866:1: non-scalar type Ptr unsupported
// pub type HIC = *mut core::ffi::c_void;

// UNSUPPORTED Rust 867:1: non-scalar type Ptr unsupported
// pub type HMMIO = *mut core::ffi::c_void;

// UNSUPPORTED Rust 868:1: non-scalar type Ptr unsupported
// pub type HVIDEO = *mut core::ffi::c_void;

// UNSUPPORTED Rust 869:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct ICCOMPRESS {
//     pub dwFlags: u32,
//     pub lpbiOutput: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpOutput: *mut core::ffi::c_void,
//     pub lpbiInput: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpInput: *mut core::ffi::c_void,
//     pub lpckid: *mut u32,
//     pub lpdwFlags: *mut u32,
//     pub lFrameNum: i32,
//     pub dwFrameSize: u32,
//     pub dwQuality: u32,
//     pub lpbiPrev: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpPrev: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 886:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICCOMPRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 892:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct ICCOMPRESSFRAMES {
//     pub dwFlags: u32,
//     pub lpbiOutput: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lOutput: super::super::Foundation::LPARAM,
//     pub lpbiInput: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lInput: super::super::Foundation::LPARAM,
//     pub lStartFrame: i32,
//     pub lFrameCount: i32,
//     pub lQuality: i32,
//     pub lDataRate: i32,
//     pub lKeyRate: i32,
//     pub dwRate: u32,
//     pub dwScale: u32,
//     pub dwOverheadPerFrame: u32,
//     pub dwReserved2: u32,
//     pub GetData: isize,
//     pub PutData: isize,
// }

// UNSUPPORTED Rust 913:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICCOMPRESSFRAMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICCOMPRESSFRAMES_PADDING`: UInt = 1u;
public const val `ICCOMPRESS_KEYFRAME`: Int = 1;
// UNSUPPORTED Rust 921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct ICDECOMPRESS {
//     pub dwFlags: u32,
//     pub lpbiInput: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpInput: *mut core::ffi::c_void,
//     pub lpbiOutput: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpOutput: *mut core::ffi::c_void,
//     pub ckid: u32,
// }

// UNSUPPORTED Rust 932:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICDECOMPRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct ICDECOMPRESSEX {
//     pub dwFlags: u32,
//     pub lpbiSrc: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpSrc: *mut core::ffi::c_void,
//     pub lpbiDst: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpDst: *mut core::ffi::c_void,
//     pub xDst: i32,
//     pub yDst: i32,
//     pub dxDst: i32,
//     pub dyDst: i32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub dxSrc: i32,
//     pub dySrc: i32,
// }

// UNSUPPORTED Rust 956:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICDECOMPRESSEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICDECOMPRESS_HURRYUP`: Int = -2147483648;
public const val `ICDECOMPRESS_NOTKEYFRAME`: Int = 134217728;
public const val `ICDECOMPRESS_NULLFRAME`: Int = 268435456;
public const val `ICDECOMPRESS_PREROLL`: Int = 536870912;
public const val `ICDECOMPRESS_UPDATE`: Int = 1073741824;
// UNSUPPORTED Rust 967:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICDRAW {
//     pub dwFlags: u32,
//     pub lpFormat: *mut core::ffi::c_void,
//     pub lpData: *mut core::ffi::c_void,
//     pub cbData: u32,
//     pub lTime: i32,
// }

// UNSUPPORTED Rust 976:1: declaration Impl has no candidate rule
// impl Default for ICDRAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 981:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct ICDRAWBEGIN {
//     pub dwFlags: u32,
//     pub hpal: super::super::Graphics::Gdi::HPALETTE,
//     pub hwnd: super::super::Foundation::HWND,
//     pub hdc: super::super::Graphics::Gdi::HDC,
//     pub xDst: i32,
//     pub yDst: i32,
//     pub dxDst: i32,
//     pub dyDst: i32,
//     pub lpbi: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub dxSrc: i32,
//     pub dySrc: i32,
//     pub dwRate: u32,
//     pub dwScale: u32,
// }

// UNSUPPORTED Rust 1001:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICDRAWBEGIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1007:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct ICDRAWSUGGEST {
//     pub lpbiIn: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub lpbiSuggest: *mut super::super::Graphics::Gdi::BITMAPINFOHEADER,
//     pub dxSrc: i32,
//     pub dySrc: i32,
//     pub dxDst: i32,
//     pub dyDst: i32,
//     pub hicDecompressor: HIC,
// }

// UNSUPPORTED Rust 1019:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICDRAWSUGGEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICDRAW_ANIMATE`: Int = 8;
public const val `ICDRAW_BUFFER`: Int = 256;
public const val `ICDRAW_CONTINUE`: Int = 16;
public const val `ICDRAW_FULLSCREEN`: Int = 2;
public const val `ICDRAW_HDC`: Int = 4;
public const val `ICDRAW_HURRYUP`: Int = -2147483648;
public const val `ICDRAW_MEMORYDC`: Int = 32;
public const val `ICDRAW_NOTKEYFRAME`: Int = 134217728;
public const val `ICDRAW_NULLFRAME`: Int = 268435456;
public const val `ICDRAW_PREROLL`: Int = 536870912;
public const val `ICDRAW_QUERY`: Int = 1;
public const val `ICDRAW_RENDER`: Int = 128;
public const val `ICDRAW_UPDATE`: Int = 1073741824;
public const val `ICDRAW_UPDATING`: Int = 64;
public const val `ICERR_ABORT`: Int = -10;
public const val `ICERR_BADBITDEPTH`: Int = -200;
public const val `ICERR_BADFLAGS`: Int = -5;
public const val `ICERR_BADFORMAT`: Int = -2;
public const val `ICERR_BADHANDLE`: Int = -8;
public const val `ICERR_BADIMAGESIZE`: Int = -201;
public const val `ICERR_BADPARAM`: Int = -6;
public const val `ICERR_BADSIZE`: Int = -7;
public const val `ICERR_CANTUPDATE`: Int = -9;
public const val `ICERR_CUSTOM`: Int = -400;
public const val `ICERR_DONTDRAW`: Int = 1;
public const val `ICERR_ERROR`: Int = -100;
public const val `ICERR_GOTOKEYFRAME`: Int = 3;
public const val `ICERR_INTERNAL`: Int = -4;
public const val `ICERR_MEMORY`: Int = -3;
public const val `ICERR_NEWPALETTE`: Int = 2;
public const val `ICERR_OK`: Int = 0;
public const val `ICERR_STOPDRAWING`: Int = 4;
public const val `ICERR_UNSUPPORTED`: Int = -1;
// UNSUPPORTED Rust 1058:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICINFO {
//     pub dwSize: u32,
//     pub fccType: u32,
//     pub fccHandler: u32,
//     pub dwFlags: u32,
//     pub dwVersion: u32,
//     pub dwVersionICM: u32,
//     pub szName: [u16; 16],
//     pub szDescription: [u16; 128],
//     pub szDriver: [u16; 128],
// }

// UNSUPPORTED Rust 1071:1: declaration Impl has no candidate rule
// impl Default for ICINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICINSTALL_DRIVER`: UInt = 2u;
public const val `ICINSTALL_DRIVERW`: UInt = 32770u;
public const val `ICINSTALL_FUNCTION`: UInt = 1u;
public const val `ICINSTALL_HDRV`: UInt = 4u;
public const val `ICINSTALL_UNICODE`: UInt = 32768u;
public const val `ICMF_ABOUT_QUERY`: UInt = 1u;
public const val `ICMF_CHOOSE_ALLCOMPRESSORS`: UInt = 8u;
public const val `ICMF_CHOOSE_DATARATE`: UInt = 2u;
public const val `ICMF_CHOOSE_KEYFRAME`: UInt = 1u;
public const val `ICMF_CHOOSE_PREVIEW`: UInt = 4u;
public const val `ICMF_COMPVARS_VALID`: UInt = 1u;
public const val `ICMF_CONFIGURE_QUERY`: UInt = 1u;
public const val `ICMODE_COMPRESS`: UInt = 1u;
public const val `ICMODE_DECOMPRESS`: UInt = 2u;
public const val `ICMODE_DRAW`: UInt = 8u;
public const val `ICMODE_FASTCOMPRESS`: UInt = 5u;
public const val `ICMODE_FASTDECOMPRESS`: UInt = 3u;
public const val `ICMODE_INTERNALF_FUNCTION32`: UInt = 32768u;
public const val `ICMODE_INTERNALF_MASK`: UInt = 32768u;
public const val `ICMODE_QUERY`: UInt = 4u;
public const val `ICM_ABOUT`: UInt = 20491u;
public const val `ICM_COMPRESS`: UInt = 16392u;
public const val `ICM_COMPRESS_BEGIN`: UInt = 16391u;
public const val `ICM_COMPRESS_END`: UInt = 16393u;
public const val `ICM_COMPRESS_FRAMES`: UInt = 16455u;
public const val `ICM_COMPRESS_FRAMES_INFO`: UInt = 16454u;
public const val `ICM_COMPRESS_GET_FORMAT`: UInt = 16388u;
public const val `ICM_COMPRESS_GET_SIZE`: UInt = 16389u;
public const val `ICM_COMPRESS_QUERY`: UInt = 16390u;
public const val `ICM_CONFIGURE`: UInt = 20490u;
public const val `ICM_DECOMPRESS`: UInt = 16397u;
public const val `ICM_DECOMPRESSEX`: UInt = 16446u;
public const val `ICM_DECOMPRESSEX_BEGIN`: UInt = 16444u;
public const val `ICM_DECOMPRESSEX_END`: UInt = 16447u;
public const val `ICM_DECOMPRESSEX_QUERY`: UInt = 16445u;
public const val `ICM_DECOMPRESS_BEGIN`: UInt = 16396u;
public const val `ICM_DECOMPRESS_END`: UInt = 16398u;
public const val `ICM_DECOMPRESS_GET_FORMAT`: UInt = 16394u;
public const val `ICM_DECOMPRESS_GET_PALETTE`: UInt = 16414u;
public const val `ICM_DECOMPRESS_QUERY`: UInt = 16395u;
public const val `ICM_DECOMPRESS_SET_PALETTE`: UInt = 16413u;
public const val `ICM_DRAW`: UInt = 16417u;
public const val `ICM_DRAW_BEGIN`: UInt = 16399u;
public const val `ICM_DRAW_BITS`: UInt = 16404u;
public const val `ICM_DRAW_CHANGEPALETTE`: UInt = 16435u;
public const val `ICM_DRAW_END`: UInt = 16405u;
public const val `ICM_DRAW_FLUSH`: UInt = 16421u;
public const val `ICM_DRAW_GETTIME`: UInt = 16416u;
public const val `ICM_DRAW_GET_PALETTE`: UInt = 16400u;
public const val `ICM_DRAW_IDLE`: UInt = 16436u;
public const val `ICM_DRAW_QUERY`: UInt = 16415u;
public const val `ICM_DRAW_REALIZE`: UInt = 16420u;
public const val `ICM_DRAW_RENDERBUFFER`: UInt = 16422u;
public const val `ICM_DRAW_SETTIME`: UInt = 16419u;
public const val `ICM_DRAW_START`: UInt = 16402u;
public const val `ICM_DRAW_START_PLAY`: UInt = 16423u;
public const val `ICM_DRAW_STOP`: UInt = 16403u;
public const val `ICM_DRAW_STOP_PLAY`: UInt = 16424u;
public const val `ICM_DRAW_SUGGESTFORMAT`: UInt = 16434u;
public const val `ICM_DRAW_UPDATE`: UInt = 16401u;
public const val `ICM_DRAW_WINDOW`: UInt = 16418u;
public const val `ICM_ENUMFORMATS`: UInt = 20501u;
public const val `ICM_GET`: UInt = 20521u;
public const val `ICM_GETBUFFERSWANTED`: UInt = 16425u;
public const val `ICM_GETDEFAULTKEYFRAMERATE`: UInt = 16426u;
public const val `ICM_GETDEFAULTQUALITY`: UInt = 20510u;
public const val `ICM_GETERRORTEXT`: UInt = 20492u;
public const val `ICM_GETFORMATNAME`: UInt = 20500u;
public const val `ICM_GETINFO`: UInt = 20482u;
public const val `ICM_GETQUALITY`: UInt = 20511u;
public const val `ICM_GETSTATE`: UInt = 20480u;
public const val `ICM_RESERVED`: UInt = 20480u;
public const val `ICM_RESERVED_HIGH`: UInt = 24576u;
public const val `ICM_RESERVED_LOW`: UInt = 20480u;
public const val `ICM_SET`: UInt = 20520u;
public const val `ICM_SETQUALITY`: UInt = 20512u;
public const val `ICM_SETSTATE`: UInt = 20481u;
public const val `ICM_SET_STATUS_PROC`: UInt = 16456u;
public const val `ICM_USER`: UInt = 16384u;
// UNSUPPORTED Rust 1155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ICOPEN {
//     pub dwSize: u32,
//     pub fccType: u32,
//     pub fccHandler: u32,
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub dwError: super::super::Foundation::LRESULT,
//     pub pV1Reserved: *mut core::ffi::c_void,
//     pub pV2Reserved: *mut core::ffi::c_void,
//     pub dnDevNode: u32,
// }

// UNSUPPORTED Rust 1168:1: declaration Impl has no candidate rule
// impl Default for ICOPEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1173:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct ICPALETTE {
//     pub dwFlags: u32,
//     pub iStart: i32,
//     pub iLen: i32,
//     pub lppe: *mut super::super::Graphics::Gdi::PALETTEENTRY,
// }

// UNSUPPORTED Rust 1182:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for ICPALETTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ICQUALITY_DEFAULT`: Int = -1;
public const val `ICQUALITY_HIGH`: UInt = 10000u;
public const val `ICQUALITY_LOW`: UInt = 0u;
// UNSUPPORTED Rust 1191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ICSETSTATUSPROC {
//     pub dwFlags: u32,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub Status: isize,
// }

public const val `ICSTATUS_END`: UInt = 2u;
public const val `ICSTATUS_ERROR`: UInt = 3u;
public const val `ICSTATUS_START`: UInt = 0u;
public const val `ICSTATUS_STATUS`: UInt = 1u;
public const val `ICSTATUS_YIELD`: UInt = 4u;
public const val `ICVERSION`: UInt = 260u;
public const val `IDD_ACMFILTERCHOOSE_BTN_DELNAME`: UInt = 104u;
public const val `IDD_ACMFILTERCHOOSE_BTN_HELP`: UInt = 9u;
public const val `IDD_ACMFILTERCHOOSE_BTN_SETNAME`: UInt = 103u;
public const val `IDD_ACMFILTERCHOOSE_CMB_CUSTOM`: UInt = 100u;
public const val `IDD_ACMFILTERCHOOSE_CMB_FILTER`: UInt = 102u;
public const val `IDD_ACMFILTERCHOOSE_CMB_FILTERTAG`: UInt = 101u;
public const val `IDD_ACMFORMATCHOOSE_BTN_DELNAME`: UInt = 104u;
public const val `IDD_ACMFORMATCHOOSE_BTN_HELP`: UInt = 9u;
public const val `IDD_ACMFORMATCHOOSE_BTN_SETNAME`: UInt = 103u;
public const val `IDD_ACMFORMATCHOOSE_CMB_CUSTOM`: UInt = 100u;
public const val `IDD_ACMFORMATCHOOSE_CMB_FORMAT`: UInt = 102u;
public const val `IDD_ACMFORMATCHOOSE_CMB_FORMATTAG`: UInt = 101u;
public const val `IDS_CAP_AUDIO_DROP_COMPERROR`: UInt = 442u;
public const val `IDS_CAP_AUDIO_DROP_ERROR`: UInt = 441u;
public const val `IDS_CAP_AVI_DRAWDIB_ERROR`: UInt = 439u;
public const val `IDS_CAP_AVI_INIT_ERROR`: UInt = 433u;
public const val `IDS_CAP_BEGIN`: UInt = 300u;
public const val `IDS_CAP_CANTOPEN`: UInt = 409u;
public const val `IDS_CAP_COMPRESSOR_ERROR`: UInt = 440u;
public const val `IDS_CAP_DEFAVIEXT`: UInt = 407u;
public const val `IDS_CAP_DEFPALEXT`: UInt = 408u;
public const val `IDS_CAP_DRIVER_ERROR`: UInt = 418u;
public const val `IDS_CAP_END`: UInt = 301u;
public const val `IDS_CAP_ERRORDIBSAVE`: UInt = 406u;
public const val `IDS_CAP_ERRORPALOPEN`: UInt = 404u;
public const val `IDS_CAP_ERRORPALSAVE`: UInt = 405u;
public const val `IDS_CAP_FILEEXISTS`: UInt = 403u;
public const val `IDS_CAP_FILE_OPEN_ERROR`: UInt = 429u;
public const val `IDS_CAP_FILE_WRITE_ERROR`: UInt = 430u;
public const val `IDS_CAP_INFO`: UInt = 401u;
public const val `IDS_CAP_MCI_CANT_STEP_ERROR`: UInt = 437u;
public const val `IDS_CAP_MCI_CONTROL_ERROR`: UInt = 436u;
public const val `IDS_CAP_NODISKSPACE`: UInt = 415u;
public const val `IDS_CAP_NO_AUDIO_CAP_ERROR`: UInt = 438u;
public const val `IDS_CAP_NO_FRAME_CAP_ERROR`: UInt = 434u;
public const val `IDS_CAP_NO_PALETTE_WARN`: UInt = 435u;
public const val `IDS_CAP_OUTOFMEM`: UInt = 402u;
public const val `IDS_CAP_READONLYFILE`: UInt = 413u;
public const val `IDS_CAP_RECORDING_ERROR`: UInt = 431u;
public const val `IDS_CAP_RECORDING_ERROR2`: UInt = 432u;
public const val `IDS_CAP_SAVEASPERCENT`: UInt = 417u;
public const val `IDS_CAP_SEQ_MSGSTART`: UInt = 410u;
public const val `IDS_CAP_SEQ_MSGSTOP`: UInt = 411u;
public const val `IDS_CAP_SETFILESIZE`: UInt = 416u;
public const val `IDS_CAP_STAT_CAP_AUDIO`: UInt = 509u;
public const val `IDS_CAP_STAT_CAP_FINI`: UInt = 503u;
public const val `IDS_CAP_STAT_CAP_INIT`: UInt = 502u;
public const val `IDS_CAP_STAT_CAP_L_FRAMES`: UInt = 508u;
public const val `IDS_CAP_STAT_FRAMESDROPPED`: UInt = 513u;
public const val `IDS_CAP_STAT_I_FRAMES`: UInt = 506u;
public const val `IDS_CAP_STAT_LIVE_MODE`: UInt = 500u;
public const val `IDS_CAP_STAT_L_FRAMES`: UInt = 507u;
public const val `IDS_CAP_STAT_OPTPAL_BUILD`: UInt = 505u;
public const val `IDS_CAP_STAT_OVERLAY_MODE`: UInt = 501u;
public const val `IDS_CAP_STAT_PALETTE_BUILD`: UInt = 504u;
public const val `IDS_CAP_STAT_VIDEOAUDIO`: UInt = 511u;
public const val `IDS_CAP_STAT_VIDEOCURRENT`: UInt = 510u;
public const val `IDS_CAP_STAT_VIDEOONLY`: UInt = 512u;
public const val `IDS_CAP_VIDEDITERR`: UInt = 412u;
public const val `IDS_CAP_VIDEO_ADD_ERROR`: UInt = 427u;
public const val `IDS_CAP_VIDEO_ALLOC_ERROR`: UInt = 425u;
public const val `IDS_CAP_VIDEO_OPEN_ERROR`: UInt = 424u;
public const val `IDS_CAP_VIDEO_PREPARE_ERROR`: UInt = 426u;
public const val `IDS_CAP_VIDEO_SIZE_ERROR`: UInt = 428u;
public const val `IDS_CAP_WAVE_ADD_ERROR`: UInt = 422u;
public const val `IDS_CAP_WAVE_ALLOC_ERROR`: UInt = 420u;
public const val `IDS_CAP_WAVE_OPEN_ERROR`: UInt = 419u;
public const val `IDS_CAP_WAVE_PREPARE_ERROR`: UInt = 421u;
public const val `IDS_CAP_WAVE_SIZE_ERROR`: UInt = 423u;
public const val `IDS_CAP_WRITEERROR`: UInt = 414u;
// UNSUPPORTED Rust 1274:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct IMAADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

public const val `JDD_CONFIGCHANGED`: UInt = 2307u;
public const val `JDD_GETDEVCAPS`: UInt = 2050u;
public const val `JDD_GETNUMDEVS`: UInt = 2049u;
public const val `JDD_GETPOS`: UInt = 2305u;
public const val `JDD_GETPOSEX`: UInt = 2308u;
public const val `JDD_SETCALIBRATION`: UInt = 2306u;
public const val `JIFMK_00`: UInt = 65280u;
public const val `JIFMK_APP0`: UInt = 65504u;
public const val `JIFMK_APP1`: UInt = 65505u;
public const val `JIFMK_APP2`: UInt = 65506u;
public const val `JIFMK_APP3`: UInt = 65507u;
public const val `JIFMK_APP4`: UInt = 65508u;
public const val `JIFMK_APP5`: UInt = 65509u;
public const val `JIFMK_APP6`: UInt = 65510u;
public const val `JIFMK_APP7`: UInt = 65511u;
public const val `JIFMK_COM`: UInt = 65534u;
public const val `JIFMK_DAC`: UInt = 65484u;
public const val `JIFMK_DHP`: UInt = 65502u;
public const val `JIFMK_DHT`: UInt = 65476u;
public const val `JIFMK_DNL`: UInt = 65500u;
public const val `JIFMK_DQT`: UInt = 65499u;
public const val `JIFMK_DRI`: UInt = 65501u;
public const val `JIFMK_EOI`: UInt = 65497u;
public const val `JIFMK_EXP`: UInt = 65503u;
public const val `JIFMK_FF`: UInt = 65535u;
public const val `JIFMK_JPG`: UInt = 65480u;
public const val `JIFMK_JPG0`: UInt = 65520u;
public const val `JIFMK_JPG1`: UInt = 65521u;
public const val `JIFMK_JPG10`: UInt = 65530u;
public const val `JIFMK_JPG11`: UInt = 65531u;
public const val `JIFMK_JPG12`: UInt = 65532u;
public const val `JIFMK_JPG13`: UInt = 65533u;
public const val `JIFMK_JPG2`: UInt = 65522u;
public const val `JIFMK_JPG3`: UInt = 65523u;
public const val `JIFMK_JPG4`: UInt = 65524u;
public const val `JIFMK_JPG5`: UInt = 65525u;
public const val `JIFMK_JPG6`: UInt = 65526u;
public const val `JIFMK_JPG7`: UInt = 65527u;
public const val `JIFMK_JPG8`: UInt = 65528u;
public const val `JIFMK_JPG9`: UInt = 65529u;
public const val `JIFMK_RES`: UInt = 65282u;
public const val `JIFMK_RST0`: UInt = 65488u;
public const val `JIFMK_RST1`: UInt = 65489u;
public const val `JIFMK_RST2`: UInt = 65490u;
public const val `JIFMK_RST3`: UInt = 65491u;
public const val `JIFMK_RST4`: UInt = 65492u;
public const val `JIFMK_RST5`: UInt = 65493u;
public const val `JIFMK_RST6`: UInt = 65494u;
public const val `JIFMK_RST7`: UInt = 65495u;
public const val `JIFMK_SOF0`: UInt = 65472u;
public const val `JIFMK_SOF1`: UInt = 65473u;
public const val `JIFMK_SOF10`: UInt = 65482u;
public const val `JIFMK_SOF11`: UInt = 65483u;
public const val `JIFMK_SOF13`: UInt = 65485u;
public const val `JIFMK_SOF14`: UInt = 65486u;
public const val `JIFMK_SOF15`: UInt = 65487u;
public const val `JIFMK_SOF2`: UInt = 65474u;
public const val `JIFMK_SOF3`: UInt = 65475u;
public const val `JIFMK_SOF5`: UInt = 65477u;
public const val `JIFMK_SOF6`: UInt = 65478u;
public const val `JIFMK_SOF7`: UInt = 65479u;
public const val `JIFMK_SOF9`: UInt = 65481u;
public const val `JIFMK_SOI`: UInt = 65496u;
public const val `JIFMK_SOS`: UInt = 65498u;
public const val `JIFMK_TEM`: UInt = 65281u;
// UNSUPPORTED Rust 1346:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct JOYCAPS2A {
//     pub wMid: u16,
//     pub wPid: u16,
//     pub szPname: [i8; 32],
//     pub wXmin: u32,
//     pub wXmax: u32,
//     pub wYmin: u32,
//     pub wYmax: u32,
//     pub wZmin: u32,
//     pub wZmax: u32,
//     pub wNumButtons: u32,
//     pub wPeriodMin: u32,
//     pub wPeriodMax: u32,
//     pub wRmin: u32,
//     pub wRmax: u32,
//     pub wUmin: u32,
//     pub wUmax: u32,
//     pub wVmin: u32,
//     pub wVmax: u32,
//     pub wCaps: u32,
//     pub wMaxAxes: u32,
//     pub wNumAxes: u32,
//     pub wMaxButtons: u32,
//     pub szRegKey: [i8; 32],
//     pub szOEMVxD: [i8; 260],
//     pub ManufacturerGuid: windows_sys::core::GUID,
//     pub ProductGuid: windows_sys::core::GUID,
//     pub NameGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule
// impl Default for JOYCAPS2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1382:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct JOYCAPS2W {
//     pub wMid: u16,
//     pub wPid: u16,
//     pub szPname: [u16; 32],
//     pub wXmin: u32,
//     pub wXmax: u32,
//     pub wYmin: u32,
//     pub wYmax: u32,
//     pub wZmin: u32,
//     pub wZmax: u32,
//     pub wNumButtons: u32,
//     pub wPeriodMin: u32,
//     pub wPeriodMax: u32,
//     pub wRmin: u32,
//     pub wRmax: u32,
//     pub wUmin: u32,
//     pub wUmax: u32,
//     pub wVmin: u32,
//     pub wVmax: u32,
//     pub wCaps: u32,
//     pub wMaxAxes: u32,
//     pub wNumAxes: u32,
//     pub wMaxButtons: u32,
//     pub szRegKey: [u16; 32],
//     pub szOEMVxD: [u16; 260],
//     pub ManufacturerGuid: windows_sys::core::GUID,
//     pub ProductGuid: windows_sys::core::GUID,
//     pub NameGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1413:1: declaration Impl has no candidate rule
// impl Default for JOYCAPS2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1418:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct JOYCAPSA {
//     pub wMid: u16,
//     pub wPid: u16,
//     pub szPname: [i8; 32],
//     pub wXmin: u32,
//     pub wXmax: u32,
//     pub wYmin: u32,
//     pub wYmax: u32,
//     pub wZmin: u32,
//     pub wZmax: u32,
//     pub wNumButtons: u32,
//     pub wPeriodMin: u32,
//     pub wPeriodMax: u32,
//     pub wRmin: u32,
//     pub wRmax: u32,
//     pub wUmin: u32,
//     pub wUmax: u32,
//     pub wVmin: u32,
//     pub wVmax: u32,
//     pub wCaps: u32,
//     pub wMaxAxes: u32,
//     pub wNumAxes: u32,
//     pub wMaxButtons: u32,
//     pub szRegKey: [i8; 32],
//     pub szOEMVxD: [i8; 260],
// }

// UNSUPPORTED Rust 1446:1: declaration Impl has no candidate rule
// impl Default for JOYCAPSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1451:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct JOYCAPSW {
//     pub wMid: u16,
//     pub wPid: u16,
//     pub szPname: [u16; 32],
//     pub wXmin: u32,
//     pub wXmax: u32,
//     pub wYmin: u32,
//     pub wYmax: u32,
//     pub wZmin: u32,
//     pub wZmax: u32,
//     pub wNumButtons: u32,
//     pub wPeriodMin: u32,
//     pub wPeriodMax: u32,
//     pub wRmin: u32,
//     pub wRmax: u32,
//     pub wUmin: u32,
//     pub wUmax: u32,
//     pub wVmin: u32,
//     pub wVmax: u32,
//     pub wCaps: u32,
//     pub wMaxAxes: u32,
//     pub wNumAxes: u32,
//     pub wMaxButtons: u32,
//     pub szRegKey: [u16; 32],
//     pub szOEMVxD: [u16; 260],
// }

// UNSUPPORTED Rust 1479:1: declaration Impl has no candidate rule
// impl Default for JOYCAPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `JOYCAPS_HASPOV`: UInt = 16u;
public const val `JOYCAPS_HASR`: UInt = 2u;
public const val `JOYCAPS_HASU`: UInt = 4u;
public const val `JOYCAPS_HASV`: UInt = 8u;
public const val `JOYCAPS_HASZ`: UInt = 1u;
public const val `JOYCAPS_POV4DIR`: UInt = 32u;
public const val `JOYCAPS_POVCTS`: UInt = 64u;
public const val `JOYERR_NOCANDO`: UInt = 166u;
public const val `JOYERR_NOERROR`: UInt = 0u;
public const val `JOYERR_PARMS`: UInt = 165u;
public const val `JOYERR_UNPLUGGED`: UInt = 167u;
// UNSUPPORTED Rust 1495:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct JOYINFO {
//     pub wXpos: u32,
//     pub wYpos: u32,
//     pub wZpos: u32,
//     pub wButtons: u32,
// }

// UNSUPPORTED Rust 1503:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct JOYINFOEX {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwXpos: u32,
//     pub dwYpos: u32,
//     pub dwZpos: u32,
//     pub dwRpos: u32,
//     pub dwUpos: u32,
//     pub dwVpos: u32,
//     pub dwButtons: u32,
//     pub dwButtonNumber: u32,
//     pub dwPOV: u32,
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
// }

public const val `JOYSTICKID1`: UInt = 0u;
public const val `JOYSTICKID2`: UInt = 1u;
public const val `JOY_BUTTON1`: UInt = 1u;
public const val `JOY_BUTTON10`: Int = 512;
public const val `JOY_BUTTON11`: Int = 1024;
public const val `JOY_BUTTON12`: Int = 2048;
public const val `JOY_BUTTON13`: Int = 4096;
public const val `JOY_BUTTON14`: Int = 8192;
public const val `JOY_BUTTON15`: Int = 16384;
public const val `JOY_BUTTON16`: Int = 32768;
public const val `JOY_BUTTON17`: Int = 65536;
public const val `JOY_BUTTON18`: Int = 131072;
public const val `JOY_BUTTON19`: Int = 262144;
public const val `JOY_BUTTON1CHG`: UInt = 256u;
public const val `JOY_BUTTON2`: UInt = 2u;
public const val `JOY_BUTTON20`: Int = 524288;
public const val `JOY_BUTTON21`: Int = 1048576;
public const val `JOY_BUTTON22`: Int = 2097152;
public const val `JOY_BUTTON23`: Int = 4194304;
public const val `JOY_BUTTON24`: Int = 8388608;
public const val `JOY_BUTTON25`: Int = 16777216;
public const val `JOY_BUTTON26`: Int = 33554432;
public const val `JOY_BUTTON27`: Int = 67108864;
public const val `JOY_BUTTON28`: Int = 134217728;
public const val `JOY_BUTTON29`: Int = 268435456;
public const val `JOY_BUTTON2CHG`: UInt = 512u;
public const val `JOY_BUTTON3`: UInt = 4u;
public const val `JOY_BUTTON30`: Int = 536870912;
public const val `JOY_BUTTON31`: Int = 1073741824;
public const val `JOY_BUTTON32`: Int = -2147483648;
public const val `JOY_BUTTON3CHG`: UInt = 1024u;
public const val `JOY_BUTTON4`: UInt = 8u;
public const val `JOY_BUTTON4CHG`: UInt = 2048u;
public const val `JOY_BUTTON5`: Int = 16;
public const val `JOY_BUTTON6`: Int = 32;
public const val `JOY_BUTTON7`: Int = 64;
public const val `JOY_BUTTON8`: Int = 128;
public const val `JOY_BUTTON9`: Int = 256;
public const val `JOY_CAL_READ3`: Int = 262144;
public const val `JOY_CAL_READ4`: Int = 524288;
public const val `JOY_CAL_READ5`: Int = 4194304;
public const val `JOY_CAL_READ6`: Int = 8388608;
public const val `JOY_CAL_READALWAYS`: Int = 65536;
public const val `JOY_CAL_READRONLY`: Int = 33554432;
public const val `JOY_CAL_READUONLY`: Int = 67108864;
public const val `JOY_CAL_READVONLY`: Int = 134217728;
public const val `JOY_CAL_READXONLY`: Int = 1048576;
public const val `JOY_CAL_READXYONLY`: Int = 131072;
public const val `JOY_CAL_READYONLY`: Int = 2097152;
public const val `JOY_CAL_READZONLY`: Int = 16777216;
// UNSUPPORTED Rust 1570:1: non-scalar type Ptr unsupported
// pub const JOY_CONFIGCHANGED_MSGSTRING: windows_sys::core::PCSTR = windows_sys::core::s!("MSJSTICK_VJOYD_MSGSTR");

public const val `JOY_POVBACKWARD`: UInt = 18000u;
public const val `JOY_POVFORWARD`: UInt = 0u;
public const val `JOY_POVLEFT`: UInt = 27000u;
public const val `JOY_POVRIGHT`: UInt = 9000u;
public const val `JOY_RETURNBUTTONS`: Int = 128;
public const val `JOY_RETURNCENTERED`: Int = 1024;
public const val `JOY_RETURNPOV`: Int = 64;
public const val `JOY_RETURNPOVCTS`: Int = 512;
public const val `JOY_RETURNR`: Int = 8;
public const val `JOY_RETURNRAWDATA`: Int = 256;
public const val `JOY_RETURNU`: Int = 16;
public const val `JOY_RETURNV`: Int = 32;
public const val `JOY_RETURNX`: Int = 1;
public const val `JOY_RETURNY`: Int = 2;
public const val `JOY_RETURNZ`: Int = 4;
public const val `JOY_USEDEADZONE`: Int = 2048;
// UNSUPPORTED Rust 1587:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct JPEGINFOHEADER {
//     pub JPEGSize: u32,
//     pub JPEGProcess: u32,
//     pub JPEGColorSpaceID: u32,
//     pub JPEGBitsPerSample: u32,
//     pub JPEGHSubSampling: u32,
//     pub JPEGVSubSampling: u32,
// }

public const val `JPEG_PROCESS_BASELINE`: UInt = 0u;
public const val `JPEG_RGB`: UInt = 3u;
public const val `JPEG_Y`: UInt = 1u;
public const val `JPEG_YCbCr`: UInt = 2u;
// UNSUPPORTED Rust 1601:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const KSDATAFORMAT_SUBTYPE_IEEE_FLOAT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000003_0000_0010_8000_00aa00389b71);

// UNSUPPORTED Rust 1602:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_IO")]
// pub type LPFNEXTDEVIO = Option<unsafe extern "system" fn(lparam: super::super::Foundation::LPARAM, dwflags: u32, dwiocontrolcode: u32, lpinbuffer: *mut core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpoverlapped: *mut super::super::System::IO::OVERLAPPED) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1604:1: generic scalar type unsupported
// pub type LPMMIOPROC = Option<unsafe extern "system" fn(lpmmioinfo: windows_sys::core::PCSTR, umsg: u32, lparam1: super::super::Foundation::LPARAM, lparam2: super::super::Foundation::LPARAM) -> super::super::Foundation::LRESULT>;

// UNSUPPORTED Rust 1605:1: generic scalar type unsupported
// pub type LPTASKCALLBACK = Option<unsafe extern "system" fn(dwinst: usize)>;

public const val `MCIERR_AVI_AUDIOERROR`: UInt = 619u;
public const val `MCIERR_AVI_BADPALETTE`: UInt = 620u;
public const val `MCIERR_AVI_CANTPLAYFULLSCREEN`: UInt = 615u;
public const val `MCIERR_AVI_DISPLAYERROR`: UInt = 618u;
public const val `MCIERR_AVI_NOCOMPRESSOR`: UInt = 617u;
public const val `MCIERR_AVI_NODISPDIB`: UInt = 614u;
public const val `MCIERR_AVI_NOTINTERLEAVED`: UInt = 613u;
public const val `MCIERR_AVI_OLDAVIFORMAT`: UInt = 612u;
public const val `MCIERR_AVI_TOOBIGFORVGA`: UInt = 616u;
public const val `MCIERR_BAD_CONSTANT`: UInt = 290u;
public const val `MCIERR_BAD_INTEGER`: UInt = 270u;
public const val `MCIERR_BAD_TIME_FORMAT`: UInt = 293u;
public const val `MCIERR_CANNOT_LOAD_DRIVER`: UInt = 266u;
public const val `MCIERR_CANNOT_USE_ALL`: UInt = 279u;
public const val `MCIERR_CREATEWINDOW`: UInt = 347u;
public const val `MCIERR_CUSTOM_DRIVER_BASE`: UInt = 512u;
public const val `MCIERR_DEVICE_LENGTH`: UInt = 310u;
public const val `MCIERR_DEVICE_LOCKED`: UInt = 288u;
public const val `MCIERR_DEVICE_NOT_INSTALLED`: UInt = 306u;
public const val `MCIERR_DEVICE_NOT_READY`: UInt = 276u;
public const val `MCIERR_DEVICE_OPEN`: UInt = 265u;
public const val `MCIERR_DEVICE_ORD_LENGTH`: UInt = 311u;
public const val `MCIERR_DEVICE_TYPE_REQUIRED`: UInt = 287u;
public const val `MCIERR_DGV_BAD_CLIPBOARD_RANGE`: UInt = 517u;
public const val `MCIERR_DGV_DEVICE_LIMIT`: UInt = 512u;
public const val `MCIERR_DGV_DEVICE_MEMORY_FULL`: UInt = 516u;
public const val `MCIERR_DGV_DISK_FULL`: UInt = 515u;
public const val `MCIERR_DGV_IOERR`: UInt = 513u;
public const val `MCIERR_DGV_WORKSPACE_EMPTY`: UInt = 514u;
public const val `MCIERR_DRIVER`: UInt = 278u;
public const val `MCIERR_DRIVER_INTERNAL`: UInt = 272u;
public const val `MCIERR_DUPLICATE_ALIAS`: UInt = 289u;
public const val `MCIERR_DUPLICATE_FLAGS`: UInt = 295u;
public const val `MCIERR_EXTENSION_NOT_FOUND`: UInt = 281u;
public const val `MCIERR_EXTRA_CHARACTERS`: UInt = 305u;
public const val `MCIERR_FILENAME_REQUIRED`: UInt = 304u;
public const val `MCIERR_FILE_NOT_FOUND`: UInt = 275u;
public const val `MCIERR_FILE_NOT_SAVED`: UInt = 286u;
public const val `MCIERR_FILE_READ`: UInt = 348u;
public const val `MCIERR_FILE_WRITE`: UInt = 349u;
public const val `MCIERR_FLAGS_NOT_COMPATIBLE`: UInt = 284u;
public const val `MCIERR_GET_CD`: UInt = 307u;
public const val `MCIERR_HARDWARE`: UInt = 262u;
public const val `MCIERR_ILLEGAL_FOR_AUTO_OPEN`: UInt = 303u;
public const val `MCIERR_INTERNAL`: UInt = 277u;
public const val `MCIERR_INVALID_DEVICE_ID`: UInt = 257u;
public const val `MCIERR_INVALID_DEVICE_NAME`: UInt = 263u;
public const val `MCIERR_INVALID_FILE`: UInt = 296u;
public const val `MCIERR_MISSING_COMMAND_STRING`: UInt = 267u;
public const val `MCIERR_MISSING_DEVICE_NAME`: UInt = 292u;
public const val `MCIERR_MISSING_PARAMETER`: UInt = 273u;
public const val `MCIERR_MISSING_STRING_ARGUMENT`: UInt = 269u;
public const val `MCIERR_MULTIPLE`: UInt = 280u;
public const val `MCIERR_MUST_USE_SHAREABLE`: UInt = 291u;
public const val `MCIERR_NEW_REQUIRES_ALIAS`: UInt = 299u;
public const val `MCIERR_NONAPPLICABLE_FUNCTION`: UInt = 302u;
public const val `MCIERR_NOTIFY_ON_AUTO_OPEN`: UInt = 300u;
public const val `MCIERR_NO_CLOSING_QUOTE`: UInt = 294u;
public const val `MCIERR_NO_ELEMENT_ALLOWED`: UInt = 301u;
public const val `MCIERR_NO_IDENTITY`: UInt = 350u;
public const val `MCIERR_NO_INTEGER`: UInt = 312u;
public const val `MCIERR_NO_WINDOW`: UInt = 346u;
public const val `MCIERR_NULL_PARAMETER_BLOCK`: UInt = 297u;
public const val `MCIERR_OUTOFRANGE`: UInt = 282u;
public const val `MCIERR_OUT_OF_MEMORY`: UInt = 264u;
public const val `MCIERR_PARAM_OVERFLOW`: UInt = 268u;
public const val `MCIERR_PARSER_INTERNAL`: UInt = 271u;
public const val `MCIERR_SEQ_DIV_INCOMPATIBLE`: UInt = 336u;
public const val `MCIERR_SEQ_NOMIDIPRESENT`: UInt = 343u;
public const val `MCIERR_SEQ_PORTUNSPECIFIED`: UInt = 342u;
public const val `MCIERR_SEQ_PORT_INUSE`: UInt = 337u;
public const val `MCIERR_SEQ_PORT_MAPNODEVICE`: UInt = 339u;
public const val `MCIERR_SEQ_PORT_MISCERROR`: UInt = 340u;
public const val `MCIERR_SEQ_PORT_NONEXISTENT`: UInt = 338u;
public const val `MCIERR_SEQ_TIMER`: UInt = 341u;
public const val `MCIERR_SET_CD`: UInt = 308u;
public const val `MCIERR_SET_DRIVE`: UInt = 309u;
public const val `MCIERR_UNNAMED_RESOURCE`: UInt = 298u;
public const val `MCIERR_UNRECOGNIZED_COMMAND`: UInt = 261u;
public const val `MCIERR_UNRECOGNIZED_KEYWORD`: UInt = 259u;
public const val `MCIERR_UNSUPPORTED_FUNCTION`: UInt = 274u;
public const val `MCIERR_WAVE_INPUTSINUSE`: UInt = 322u;
public const val `MCIERR_WAVE_INPUTSUNSUITABLE`: UInt = 328u;
public const val `MCIERR_WAVE_INPUTUNSPECIFIED`: UInt = 325u;
public const val `MCIERR_WAVE_OUTPUTSINUSE`: UInt = 320u;
public const val `MCIERR_WAVE_OUTPUTSUNSUITABLE`: UInt = 326u;
public const val `MCIERR_WAVE_OUTPUTUNSPECIFIED`: UInt = 324u;
public const val `MCIERR_WAVE_SETINPUTINUSE`: UInt = 323u;
public const val `MCIERR_WAVE_SETINPUTUNSUITABLE`: UInt = 329u;
public const val `MCIERR_WAVE_SETOUTPUTINUSE`: UInt = 321u;
public const val `MCIERR_WAVE_SETOUTPUTUNSUITABLE`: UInt = 327u;
public const val `MCIWNDF_NOAUTOSIZEMOVIE`: UInt = 4u;
public const val `MCIWNDF_NOAUTOSIZEWINDOW`: UInt = 1u;
public const val `MCIWNDF_NOERRORDLG`: UInt = 16384u;
public const val `MCIWNDF_NOMENU`: UInt = 8u;
public const val `MCIWNDF_NOOPEN`: UInt = 32768u;
public const val `MCIWNDF_NOPLAYBAR`: UInt = 2u;
public const val `MCIWNDF_NOTIFYALL`: UInt = 7936u;
public const val `MCIWNDF_NOTIFYANSI`: UInt = 128u;
public const val `MCIWNDF_NOTIFYERROR`: UInt = 4096u;
public const val `MCIWNDF_NOTIFYMEDIA`: UInt = 2048u;
public const val `MCIWNDF_NOTIFYMEDIAA`: UInt = 2176u;
public const val `MCIWNDF_NOTIFYMEDIAW`: UInt = 2048u;
public const val `MCIWNDF_NOTIFYMODE`: UInt = 256u;
public const val `MCIWNDF_NOTIFYPOS`: UInt = 512u;
public const val `MCIWNDF_NOTIFYSIZE`: UInt = 1024u;
public const val `MCIWNDF_RECORD`: UInt = 8192u;
public const val `MCIWNDF_SHOWALL`: UInt = 112u;
public const val `MCIWNDF_SHOWMODE`: UInt = 64u;
public const val `MCIWNDF_SHOWNAME`: UInt = 16u;
public const val `MCIWNDF_SHOWPOS`: UInt = 32u;
public const val `MCIWNDM_CAN_CONFIG`: UInt = 1173u;
public const val `MCIWNDM_CAN_EJECT`: UInt = 1172u;
public const val `MCIWNDM_CAN_PLAY`: UInt = 1168u;
public const val `MCIWNDM_CAN_RECORD`: UInt = 1170u;
public const val `MCIWNDM_CAN_SAVE`: UInt = 1171u;
public const val `MCIWNDM_CAN_WINDOW`: UInt = 1169u;
public const val `MCIWNDM_CHANGESTYLES`: UInt = 1159u;
public const val `MCIWNDM_EJECT`: UInt = 1131u;
public const val `MCIWNDM_GETACTIVETIMER`: UInt = 1156u;
public const val `MCIWNDM_GETALIAS`: UInt = 1161u;
public const val `MCIWNDM_GETDEVICE`: UInt = 1249u;
public const val `MCIWNDM_GETDEVICEA`: UInt = 1149u;
public const val `MCIWNDM_GETDEVICEID`: UInt = 1124u;
public const val `MCIWNDM_GETDEVICEW`: UInt = 1249u;
public const val `MCIWNDM_GETEND`: UInt = 1129u;
public const val `MCIWNDM_GETERROR`: UInt = 1252u;
public const val `MCIWNDM_GETERRORA`: UInt = 1152u;
public const val `MCIWNDM_GETERRORW`: UInt = 1252u;
public const val `MCIWNDM_GETFILENAME`: UInt = 1248u;
public const val `MCIWNDM_GETFILENAMEA`: UInt = 1148u;
public const val `MCIWNDM_GETFILENAMEW`: UInt = 1248u;
public const val `MCIWNDM_GETINACTIVETIMER`: UInt = 1157u;
public const val `MCIWNDM_GETLENGTH`: UInt = 1128u;
public const val `MCIWNDM_GETMODE`: UInt = 1230u;
public const val `MCIWNDM_GETMODEA`: UInt = 1130u;
public const val `MCIWNDM_GETMODEW`: UInt = 1230u;
public const val `MCIWNDM_GETPALETTE`: UInt = 1150u;
public const val `MCIWNDM_GETPOSITION`: UInt = 1226u;
public const val `MCIWNDM_GETPOSITIONA`: UInt = 1126u;
public const val `MCIWNDM_GETPOSITIONW`: UInt = 1226u;
public const val `MCIWNDM_GETREPEAT`: UInt = 1139u;
public const val `MCIWNDM_GETSPEED`: UInt = 1137u;
public const val `MCIWNDM_GETSTART`: UInt = 1127u;
public const val `MCIWNDM_GETSTYLES`: UInt = 1160u;
public const val `MCIWNDM_GETTIMEFORMAT`: UInt = 1244u;
public const val `MCIWNDM_GETTIMEFORMATA`: UInt = 1144u;
public const val `MCIWNDM_GETTIMEFORMATW`: UInt = 1244u;
public const val `MCIWNDM_GETVOLUME`: UInt = 1135u;
public const val `MCIWNDM_GETZOOM`: UInt = 1133u;
public const val `MCIWNDM_GET_DEST`: UInt = 1166u;
public const val `MCIWNDM_GET_SOURCE`: UInt = 1164u;
public const val `MCIWNDM_NEW`: UInt = 1258u;
public const val `MCIWNDM_NEWA`: UInt = 1158u;
public const val `MCIWNDM_NEWW`: UInt = 1258u;
public const val `MCIWNDM_NOTIFYERROR`: UInt = 1229u;
public const val `MCIWNDM_NOTIFYMEDIA`: UInt = 1227u;
public const val `MCIWNDM_NOTIFYMODE`: UInt = 1224u;
public const val `MCIWNDM_NOTIFYPOS`: UInt = 1225u;
public const val `MCIWNDM_NOTIFYSIZE`: UInt = 1226u;
public const val `MCIWNDM_OPEN`: UInt = 1276u;
public const val `MCIWNDM_OPENA`: UInt = 1177u;
public const val `MCIWNDM_OPENINTERFACE`: UInt = 1175u;
public const val `MCIWNDM_OPENW`: UInt = 1276u;
public const val `MCIWNDM_PALETTEKICK`: UInt = 1174u;
public const val `MCIWNDM_PLAYFROM`: UInt = 1146u;
public const val `MCIWNDM_PLAYREVERSE`: UInt = 1163u;
public const val `MCIWNDM_PLAYTO`: UInt = 1147u;
public const val `MCIWNDM_PUT_DEST`: UInt = 1167u;
public const val `MCIWNDM_PUT_SOURCE`: UInt = 1165u;
public const val `MCIWNDM_REALIZE`: UInt = 1142u;
public const val `MCIWNDM_RETURNSTRING`: UInt = 1262u;
public const val `MCIWNDM_RETURNSTRINGA`: UInt = 1162u;
public const val `MCIWNDM_RETURNSTRINGW`: UInt = 1262u;
public const val `MCIWNDM_SENDSTRING`: UInt = 1225u;
public const val `MCIWNDM_SENDSTRINGA`: UInt = 1125u;
public const val `MCIWNDM_SENDSTRINGW`: UInt = 1225u;
public const val `MCIWNDM_SETACTIVETIMER`: UInt = 1154u;
public const val `MCIWNDM_SETINACTIVETIMER`: UInt = 1155u;
public const val `MCIWNDM_SETOWNER`: UInt = 1176u;
public const val `MCIWNDM_SETPALETTE`: UInt = 1151u;
public const val `MCIWNDM_SETREPEAT`: UInt = 1138u;
public const val `MCIWNDM_SETSPEED`: UInt = 1136u;
public const val `MCIWNDM_SETTIMEFORMAT`: UInt = 1243u;
public const val `MCIWNDM_SETTIMEFORMATA`: UInt = 1143u;
public const val `MCIWNDM_SETTIMEFORMATW`: UInt = 1243u;
public const val `MCIWNDM_SETTIMERS`: UInt = 1153u;
public const val `MCIWNDM_SETVOLUME`: UInt = 1134u;
public const val `MCIWNDM_SETZOOM`: UInt = 1132u;
public const val `MCIWNDM_VALIDATEMEDIA`: UInt = 1145u;
public const val `MCIWNDOPENF_NEW`: UInt = 1u;
public const val `MCIWND_END`: Int = -2;
public const val `MCIWND_START`: Int = -1;
// UNSUPPORTED Rust 1799:1: non-scalar type Ptr unsupported
// pub const MCIWND_WINDOW_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("MCIWndClass");

public const val `MCI_ANIM_GETDEVCAPS_CAN_REVERSE`: Int = 16385;
public const val `MCI_ANIM_GETDEVCAPS_CAN_STRETCH`: Int = 16391;
public const val `MCI_ANIM_GETDEVCAPS_FAST_RATE`: Int = 16386;
public const val `MCI_ANIM_GETDEVCAPS_MAX_WINDOWS`: Int = 16392;
public const val `MCI_ANIM_GETDEVCAPS_NORMAL_RATE`: Int = 16388;
public const val `MCI_ANIM_GETDEVCAPS_PALETTES`: Int = 16390;
public const val `MCI_ANIM_GETDEVCAPS_SLOW_RATE`: Int = 16387;
public const val `MCI_ANIM_INFO_TEXT`: Int = 65536;
public const val `MCI_ANIM_OPEN_NOSTATIC`: Int = 262144;
public const val `MCI_ANIM_OPEN_PARENT`: Int = 131072;
// UNSUPPORTED Rust 1810:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_ANIM_OPEN_PARMSA {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCSTR,
//     pub lpstrElementName: windows_sys::core::PCSTR,
//     pub lpstrAlias: windows_sys::core::PCSTR,
//     pub dwStyle: u32,
//     pub hWndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 1821:1: declaration Impl has no candidate rule
// impl Default for MCI_ANIM_OPEN_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1826:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_ANIM_OPEN_PARMSW {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCWSTR,
//     pub lpstrElementName: windows_sys::core::PCWSTR,
//     pub lpstrAlias: windows_sys::core::PCWSTR,
//     pub dwStyle: u32,
//     pub hWndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 1837:1: declaration Impl has no candidate rule
// impl Default for MCI_ANIM_OPEN_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_ANIM_OPEN_WS`: Int = 65536;
public const val `MCI_ANIM_PLAY_FAST`: Int = 262144;
// UNSUPPORTED Rust 1844:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_ANIM_PLAY_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
//     pub dwSpeed: u32,
// }

public const val `MCI_ANIM_PLAY_REVERSE`: Int = 131072;
public const val `MCI_ANIM_PLAY_SCAN`: Int = 1048576;
public const val `MCI_ANIM_PLAY_SLOW`: Int = 524288;
public const val `MCI_ANIM_PLAY_SPEED`: Int = 65536;
public const val `MCI_ANIM_PUT_DESTINATION`: Int = 262144;
public const val `MCI_ANIM_PUT_SOURCE`: Int = 131072;
public const val `MCI_ANIM_REALIZE_BKGD`: Int = 131072;
public const val `MCI_ANIM_REALIZE_NORM`: Int = 65536;
public const val `MCI_ANIM_RECT`: Int = 65536;
// UNSUPPORTED Rust 1861:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_ANIM_RECT_PARMS {
//     pub dwCallback: usize,
//     pub rc: super::super::Foundation::RECT,
// }

public const val `MCI_ANIM_STATUS_FORWARD`: Int = 16386;
public const val `MCI_ANIM_STATUS_HPAL`: Int = 16388;
public const val `MCI_ANIM_STATUS_HWND`: Int = 16387;
public const val `MCI_ANIM_STATUS_SPEED`: Int = 16385;
public const val `MCI_ANIM_STATUS_STRETCH`: Int = 16389;
public const val `MCI_ANIM_STEP_FRAMES`: Int = 131072;
// UNSUPPORTED Rust 1873:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_ANIM_STEP_PARMS {
//     pub dwCallback: usize,
//     pub dwFrames: u32,
// }

public const val `MCI_ANIM_STEP_REVERSE`: Int = 65536;
public const val `MCI_ANIM_UPDATE_HDC`: Int = 131072;
// UNSUPPORTED Rust 1881:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct MCI_ANIM_UPDATE_PARMS {
//     pub dwCallback: usize,
//     pub rc: super::super::Foundation::RECT,
//     pub hDC: super::super::Graphics::Gdi::HDC,
// }

// UNSUPPORTED Rust 1889:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for MCI_ANIM_UPDATE_PARMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_ANIM_WHERE_DESTINATION`: Int = 262144;
public const val `MCI_ANIM_WHERE_SOURCE`: Int = 131072;
public const val `MCI_ANIM_WINDOW_DEFAULT`: Int = 0;
public const val `MCI_ANIM_WINDOW_DISABLE_STRETCH`: Int = 2097152;
public const val `MCI_ANIM_WINDOW_ENABLE_STRETCH`: Int = 1048576;
public const val `MCI_ANIM_WINDOW_HWND`: Int = 65536;
// UNSUPPORTED Rust 1901:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_ANIM_WINDOW_PARMSA {
//     pub dwCallback: usize,
//     pub hWnd: super::super::Foundation::HWND,
//     pub nCmdShow: u32,
//     pub lpstrText: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 1909:1: declaration Impl has no candidate rule
// impl Default for MCI_ANIM_WINDOW_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1914:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_ANIM_WINDOW_PARMSW {
//     pub dwCallback: usize,
//     pub hWnd: super::super::Foundation::HWND,
//     pub nCmdShow: u32,
//     pub lpstrText: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1922:1: declaration Impl has no candidate rule
// impl Default for MCI_ANIM_WINDOW_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_ANIM_WINDOW_STATE`: Int = 262144;
public const val `MCI_ANIM_WINDOW_TEXT`: Int = 524288;
public const val `MCI_AVI_SETVIDEO_DRAW_PROCEDURE`: Int = 32768;
public const val `MCI_AVI_SETVIDEO_PALETTE_COLOR`: Int = 33024;
public const val `MCI_AVI_SETVIDEO_PALETTE_HALFTONE`: Int = 65535;
public const val `MCI_AVI_STATUS_AUDIO_BREAKS`: Int = 32771;
public const val `MCI_AVI_STATUS_FRAMES_SKIPPED`: Int = 32769;
public const val `MCI_AVI_STATUS_LAST_PLAY_SPEED`: Int = 32770;
public const val `MCI_BREAK`: UInt = 2065u;
public const val `MCI_BREAK_HWND`: Int = 512;
public const val `MCI_BREAK_KEY`: Int = 256;
public const val `MCI_BREAK_OFF`: Int = 1024;
// UNSUPPORTED Rust 1939:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_BREAK_PARMS {
//     pub dwCallback: usize,
//     pub nVirtKey: i32,
//     pub hwndBreak: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 1946:1: declaration Impl has no candidate rule
// impl Default for MCI_BREAK_PARMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_CAPTURE`: UInt = 2160u;
public const val `MCI_CDA_STATUS_TYPE_TRACK`: Int = 16385;
public const val `MCI_CDA_TRACK_AUDIO`: UInt = 1088u;
public const val `MCI_CDA_TRACK_OTHER`: UInt = 1089u;
public const val `MCI_CLOSE`: UInt = 2052u;
public const val `MCI_CLOSE_DRIVER`: UInt = 2050u;
public const val `MCI_COLONIZED3_RETURN`: UInt = 131072u;
public const val `MCI_COLONIZED4_RETURN`: UInt = 262144u;
public const val `MCI_COMMAND_HEAD`: UInt = 0u;
public const val `MCI_CONFIGURE`: UInt = 2170u;
public const val `MCI_CONSTANT`: UInt = 8u;
public const val `MCI_COPY`: UInt = 2130u;
public const val `MCI_CUE`: UInt = 2096u;
public const val `MCI_CUT`: UInt = 2129u;
public const val `MCI_DELETE`: UInt = 2134u;
public const val `MCI_DEVTYPE_ANIMATION`: UInt = 519u;
public const val `MCI_DEVTYPE_CD_AUDIO`: UInt = 516u;
public const val `MCI_DEVTYPE_DAT`: UInt = 517u;
public const val `MCI_DEVTYPE_DIGITAL_VIDEO`: UInt = 520u;
public const val `MCI_DEVTYPE_FIRST`: UInt = 513u;
public const val `MCI_DEVTYPE_FIRST_USER`: UInt = 4096u;
public const val `MCI_DEVTYPE_LAST`: UInt = 523u;
public const val `MCI_DEVTYPE_OTHER`: UInt = 521u;
public const val `MCI_DEVTYPE_OVERLAY`: UInt = 515u;
public const val `MCI_DEVTYPE_SCANNER`: UInt = 518u;
public const val `MCI_DEVTYPE_SEQUENCER`: UInt = 523u;
public const val `MCI_DEVTYPE_VCR`: UInt = 513u;
public const val `MCI_DEVTYPE_VIDEODISC`: UInt = 514u;
public const val `MCI_DEVTYPE_WAVEFORM_AUDIO`: UInt = 522u;
public const val `MCI_DGV_CAPTURE_AS`: Int = 65536;
public const val `MCI_DGV_CAPTURE_AT`: Int = 131072;
// UNSUPPORTED Rust 1982:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_CAPTURE_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrFileName: windows_sys::core::PSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 1989:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_CAPTURE_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1994:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_CAPTURE_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrFileName: windows_sys::core::PWSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2001:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_CAPTURE_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_COPY_AT`: Int = 65536;
public const val `MCI_DGV_COPY_AUDIO_STREAM`: Int = 131072;
// UNSUPPORTED Rust 2008:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_COPY_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
//     pub rc: super::super::Foundation::RECT,
//     pub dwAudioStream: u32,
//     pub dwVideoStream: u32,
// }

public const val `MCI_DGV_COPY_VIDEO_STREAM`: Int = 262144;
public const val `MCI_DGV_CUE_INPUT`: Int = 65536;
public const val `MCI_DGV_CUE_NOSHOW`: Int = 262144;
public const val `MCI_DGV_CUE_OUTPUT`: Int = 131072;
// UNSUPPORTED Rust 2022:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_CUE_PARMS {
//     pub dwCallback: usize,
//     pub dwTo: u32,
// }

public const val `MCI_DGV_CUT_AT`: Int = 65536;
public const val `MCI_DGV_CUT_AUDIO_STREAM`: Int = 131072;
// UNSUPPORTED Rust 2030:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_CUT_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
//     pub rc: super::super::Foundation::RECT,
//     pub dwAudioStream: u32,
//     pub dwVideoStream: u32,
// }

public const val `MCI_DGV_CUT_VIDEO_STREAM`: Int = 262144;
public const val `MCI_DGV_DELETE_AT`: Int = 65536;
public const val `MCI_DGV_DELETE_AUDIO_STREAM`: Int = 131072;
// UNSUPPORTED Rust 2043:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_DELETE_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
//     pub rc: super::super::Foundation::RECT,
//     pub dwAudioStream: u32,
//     pub dwVideoStream: u32,
// }

public const val `MCI_DGV_DELETE_VIDEO_STREAM`: Int = 262144;
public const val `MCI_DGV_FF_AVI`: Int = 16385;
public const val `MCI_DGV_FF_AVSS`: Int = 16384;
public const val `MCI_DGV_FF_DIB`: Int = 16386;
public const val `MCI_DGV_FF_JFIF`: Int = 16390;
public const val `MCI_DGV_FF_JPEG`: Int = 16388;
public const val `MCI_DGV_FF_MPEG`: Int = 16391;
public const val `MCI_DGV_FF_RDIB`: Int = 16387;
public const val `MCI_DGV_FF_RJPEG`: Int = 16389;
public const val `MCI_DGV_FILE_MODE_EDITING`: UInt = 3u;
public const val `MCI_DGV_FILE_MODE_EDITING_S`: Int = 32774;
public const val `MCI_DGV_FILE_MODE_IDLE`: UInt = 4u;
public const val `MCI_DGV_FILE_MODE_IDLE_S`: Int = 32775;
public const val `MCI_DGV_FILE_MODE_LOADING`: UInt = 2u;
public const val `MCI_DGV_FILE_MODE_LOADING_S`: Int = 32773;
public const val `MCI_DGV_FILE_MODE_SAVING`: UInt = 1u;
public const val `MCI_DGV_FILE_MODE_SAVING_S`: Int = 32772;
public const val `MCI_DGV_FILE_S`: Int = 32770;
public const val `MCI_DGV_FREEZE_AT`: Int = 65536;
public const val `MCI_DGV_FREEZE_OUTSIDE`: Int = 131072;
public const val `MCI_DGV_GETDEVCAPS_CAN_FREEZE`: Int = 16386;
public const val `MCI_DGV_GETDEVCAPS_CAN_LOCK`: Int = 16384;
public const val `MCI_DGV_GETDEVCAPS_CAN_REVERSE`: Int = 16388;
public const val `MCI_DGV_GETDEVCAPS_CAN_STRETCH`: Int = 16385;
public const val `MCI_DGV_GETDEVCAPS_CAN_STR_IN`: Int = 16392;
public const val `MCI_DGV_GETDEVCAPS_CAN_TEST`: Int = 16393;
public const val `MCI_DGV_GETDEVCAPS_HAS_STILL`: Int = 16389;
public const val `MCI_DGV_GETDEVCAPS_MAXIMUM_RATE`: Int = 16394;
public const val `MCI_DGV_GETDEVCAPS_MAX_WINDOWS`: Int = 16387;
public const val `MCI_DGV_GETDEVCAPS_MINIMUM_RATE`: Int = 16395;
public const val `MCI_DGV_GETDEVCAPS_PALETTES`: Int = 16390;
public const val `MCI_DGV_INFO_AUDIO_ALG`: Int = 16388;
public const val `MCI_DGV_INFO_AUDIO_QUALITY`: Int = 16385;
public const val `MCI_DGV_INFO_ITEM`: Int = 131072;
// UNSUPPORTED Rust 2087:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_INFO_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PSTR,
//     pub dwRetSize: u32,
//     pub dwItem: u32,
// }

// UNSUPPORTED Rust 2095:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_INFO_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2100:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_INFO_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PWSTR,
//     pub dwRetSize: u32,
//     pub dwItem: u32,
// }

// UNSUPPORTED Rust 2108:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_INFO_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_INFO_STILL_ALG`: Int = 16389;
public const val `MCI_DGV_INFO_STILL_QUALITY`: Int = 16386;
public const val `MCI_DGV_INFO_TEXT`: Int = 65536;
public const val `MCI_DGV_INFO_USAGE`: Int = 16384;
public const val `MCI_DGV_INFO_VIDEO_ALG`: Int = 16390;
public const val `MCI_DGV_INFO_VIDEO_QUALITY`: Int = 16387;
public const val `MCI_DGV_INPUT_S`: Int = 32771;
public const val `MCI_DGV_LIST_ALG`: Int = 524288;
public const val `MCI_DGV_LIST_AUDIO_ALG`: Int = 16384;
public const val `MCI_DGV_LIST_AUDIO_QUALITY`: Int = 16385;
public const val `MCI_DGV_LIST_AUDIO_STREAM`: Int = 16386;
public const val `MCI_DGV_LIST_COUNT`: Int = 131072;
public const val `MCI_DGV_LIST_ITEM`: Int = 65536;
public const val `MCI_DGV_LIST_NUMBER`: Int = 262144;
// UNSUPPORTED Rust 2127:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_LIST_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PSTR,
//     pub dwLength: u32,
//     pub dwNumber: u32,
//     pub dwItem: u32,
//     pub lpstrAlgorithm: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2137:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_LIST_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2142:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_LIST_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PWSTR,
//     pub dwLength: u32,
//     pub dwNumber: u32,
//     pub dwItem: u32,
//     pub lpstrAlgorithm: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2152:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_LIST_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_LIST_STILL_ALG`: Int = 16387;
public const val `MCI_DGV_LIST_STILL_QUALITY`: Int = 16388;
public const val `MCI_DGV_LIST_VIDEO_ALG`: Int = 16389;
public const val `MCI_DGV_LIST_VIDEO_QUALITY`: Int = 16390;
public const val `MCI_DGV_LIST_VIDEO_SOURCE`: Int = 16392;
public const val `MCI_DGV_LIST_VIDEO_STREAM`: Int = 16391;
public const val `MCI_DGV_METHOD_DIRECT`: Int = 40962;
public const val `MCI_DGV_METHOD_POST`: Int = 40961;
public const val `MCI_DGV_METHOD_PRE`: Int = 40960;
public const val `MCI_DGV_MONITOR_FILE`: Int = 16385;
public const val `MCI_DGV_MONITOR_INPUT`: Int = 16384;
public const val `MCI_DGV_MONITOR_METHOD`: Int = 65536;
// UNSUPPORTED Rust 2169:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_MONITOR_PARMS {
//     pub dwCallback: usize,
//     pub dwSource: u32,
//     pub dwMethod: u32,
// }

public const val `MCI_DGV_MONITOR_SOURCE`: Int = 131072;
public const val `MCI_DGV_OPEN_16BIT`: Int = 524288;
public const val `MCI_DGV_OPEN_32BIT`: Int = 1048576;
public const val `MCI_DGV_OPEN_NOSTATIC`: Int = 262144;
public const val `MCI_DGV_OPEN_PARENT`: Int = 131072;
// UNSUPPORTED Rust 2181:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_OPEN_PARMSA {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PSTR,
//     pub lpstrElementName: windows_sys::core::PSTR,
//     pub lpstrAlias: windows_sys::core::PSTR,
//     pub dwStyle: u32,
//     pub hWndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 2192:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_OPEN_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2197:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_OPEN_PARMSW {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PWSTR,
//     pub lpstrElementName: windows_sys::core::PWSTR,
//     pub lpstrAlias: windows_sys::core::PWSTR,
//     pub dwStyle: u32,
//     pub hWndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 2208:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_OPEN_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_OPEN_WS`: Int = 65536;
public const val `MCI_DGV_PASTE_AT`: Int = 65536;
public const val `MCI_DGV_PASTE_AUDIO_STREAM`: Int = 131072;
public const val `MCI_DGV_PASTE_INSERT`: Int = 524288;
public const val `MCI_DGV_PASTE_OVERWRITE`: Int = 1048576;
// UNSUPPORTED Rust 2218:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_PASTE_PARMS {
//     pub dwCallback: usize,
//     pub dwTo: u32,
//     pub rc: super::super::Foundation::RECT,
//     pub dwAudioStream: u32,
//     pub dwVideoStream: u32,
// }

public const val `MCI_DGV_PASTE_VIDEO_STREAM`: Int = 262144;
public const val `MCI_DGV_PLAY_REPEAT`: Int = 65536;
public const val `MCI_DGV_PLAY_REVERSE`: Int = 131072;
public const val `MCI_DGV_PUT_CLIENT`: Int = 4194304;
public const val `MCI_DGV_PUT_DESTINATION`: Int = 262144;
public const val `MCI_DGV_PUT_FRAME`: Int = 524288;
public const val `MCI_DGV_PUT_SOURCE`: Int = 131072;
public const val `MCI_DGV_PUT_VIDEO`: Int = 1048576;
public const val `MCI_DGV_PUT_WINDOW`: Int = 2097152;
// UNSUPPORTED Rust 2236:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_QUALITY_PARMSA {
//     pub dwCallback: usize,
//     pub dwItem: u32,
//     pub lpstrName: windows_sys::core::PSTR,
//     pub lpstrAlgorithm: u32,
//     pub dwHandle: u32,
// }

// UNSUPPORTED Rust 2245:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_QUALITY_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2250:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_QUALITY_PARMSW {
//     pub dwCallback: usize,
//     pub dwItem: u32,
//     pub lpstrName: windows_sys::core::PWSTR,
//     pub lpstrAlgorithm: u32,
//     pub dwHandle: u32,
// }

// UNSUPPORTED Rust 2259:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_QUALITY_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_REALIZE_BKGD`: Int = 131072;
public const val `MCI_DGV_REALIZE_NORM`: Int = 65536;
public const val `MCI_DGV_RECORD_AUDIO_STREAM`: Int = 262144;
public const val `MCI_DGV_RECORD_HOLD`: Int = 131072;
// UNSUPPORTED Rust 2268:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_RECORD_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
//     pub rc: super::super::Foundation::RECT,
//     pub dwAudioStream: u32,
//     pub dwVideoStream: u32,
// }

public const val `MCI_DGV_RECORD_VIDEO_STREAM`: Int = 524288;
public const val `MCI_DGV_RECT`: Int = 65536;
// UNSUPPORTED Rust 2280:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_RECT_PARMS {
//     pub dwCallback: usize,
//     pub rc: super::super::Foundation::RECT,
// }

public const val `MCI_DGV_RESERVE_IN`: Int = 65536;
// UNSUPPORTED Rust 2287:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_RESERVE_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrPath: windows_sys::core::PSTR,
//     pub dwSize: u32,
// }

// UNSUPPORTED Rust 2294:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_RESERVE_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2299:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_RESERVE_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrPath: windows_sys::core::PWSTR,
//     pub dwSize: u32,
// }

// UNSUPPORTED Rust 2306:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_RESERVE_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_RESERVE_SIZE`: Int = 131072;
public const val `MCI_DGV_RESTORE_AT`: Int = 131072;
public const val `MCI_DGV_RESTORE_FROM`: Int = 65536;
// UNSUPPORTED Rust 2314:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_RESTORE_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrFileName: windows_sys::core::PSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2321:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_RESTORE_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2326:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_RESTORE_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrFileName: windows_sys::core::PWSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2333:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_RESTORE_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_SAVE_ABORT`: Int = 131072;
public const val `MCI_DGV_SAVE_KEEPRESERVE`: Int = 262144;
// UNSUPPORTED Rust 2340:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_SAVE_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrFileName: windows_sys::core::PSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2347:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_SAVE_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2352:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_SAVE_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrFileName: windows_sys::core::PWSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2359:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_SAVE_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_SETAUDIO_ALG`: Int = 262144;
public const val `MCI_DGV_SETAUDIO_AVGBYTESPERSEC`: Int = 16390;
public const val `MCI_DGV_SETAUDIO_BASS`: Int = 16385;
public const val `MCI_DGV_SETAUDIO_BITSPERSAMPLE`: Int = 16392;
public const val `MCI_DGV_SETAUDIO_BLOCKALIGN`: Int = 16391;
public const val `MCI_DGV_SETAUDIO_CLOCKTIME`: Int = 131072;
public const val `MCI_DGV_SETAUDIO_INPUT`: Int = 33554432;
public const val `MCI_DGV_SETAUDIO_ITEM`: Int = 8388608;
public const val `MCI_DGV_SETAUDIO_LEFT`: Int = 2097152;
public const val `MCI_DGV_SETAUDIO_OUTPUT`: Int = 67108864;
public const val `MCI_DGV_SETAUDIO_OVER`: Int = 65536;
// UNSUPPORTED Rust 2375:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_SETAUDIO_PARMSA {
//     pub dwCallback: usize,
//     pub dwItem: u32,
//     pub dwValue: u32,
//     pub dwOver: u32,
//     pub lpstrAlgorithm: windows_sys::core::PSTR,
//     pub lpstrQuality: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2385:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_SETAUDIO_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2390:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_SETAUDIO_PARMSW {
//     pub dwCallback: usize,
//     pub dwItem: u32,
//     pub dwValue: u32,
//     pub dwOver: u32,
//     pub lpstrAlgorithm: windows_sys::core::PWSTR,
//     pub lpstrQuality: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2400:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_SETAUDIO_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_SETAUDIO_QUALITY`: Int = 524288;
public const val `MCI_DGV_SETAUDIO_RECORD`: Int = 1048576;
public const val `MCI_DGV_SETAUDIO_RIGHT`: Int = 4194304;
public const val `MCI_DGV_SETAUDIO_SAMPLESPERSEC`: Int = 16389;
public const val `MCI_DGV_SETAUDIO_SOURCE`: Int = 16388;
public const val `MCI_DGV_SETAUDIO_SOURCE_AVERAGE`: Int = 16384;
public const val `MCI_DGV_SETAUDIO_SOURCE_LEFT`: Int = 1;
public const val `MCI_DGV_SETAUDIO_SOURCE_RIGHT`: Int = 2;
public const val `MCI_DGV_SETAUDIO_SOURCE_STEREO`: Int = 0;
public const val `MCI_DGV_SETAUDIO_SRC_AVERAGE_S`: Int = 32802;
public const val `MCI_DGV_SETAUDIO_SRC_LEFT_S`: Int = 32800;
public const val `MCI_DGV_SETAUDIO_SRC_RIGHT_S`: Int = 32801;
public const val `MCI_DGV_SETAUDIO_SRC_STEREO_S`: Int = 32803;
public const val `MCI_DGV_SETAUDIO_STREAM`: Int = 16387;
public const val `MCI_DGV_SETAUDIO_TREBLE`: Int = 16384;
public const val `MCI_DGV_SETAUDIO_VALUE`: Int = 16777216;
public const val `MCI_DGV_SETAUDIO_VOLUME`: Int = 16386;
public const val `MCI_DGV_SETVIDEO_ALG`: Int = 131072;
public const val `MCI_DGV_SETVIDEO_BITSPERPEL`: Int = 16396;
public const val `MCI_DGV_SETVIDEO_BRIGHTNESS`: Int = 16384;
public const val `MCI_DGV_SETVIDEO_CLOCKTIME`: Int = 262144;
public const val `MCI_DGV_SETVIDEO_COLOR`: Int = 16385;
public const val `MCI_DGV_SETVIDEO_CONTRAST`: Int = 16386;
public const val `MCI_DGV_SETVIDEO_FRAME_RATE`: Int = 16392;
public const val `MCI_DGV_SETVIDEO_GAMMA`: Int = 16389;
public const val `MCI_DGV_SETVIDEO_INPUT`: Int = 33554432;
public const val `MCI_DGV_SETVIDEO_ITEM`: Int = 1048576;
public const val `MCI_DGV_SETVIDEO_KEY_COLOR`: Int = 16395;
public const val `MCI_DGV_SETVIDEO_KEY_INDEX`: Int = 16394;
public const val `MCI_DGV_SETVIDEO_OUTPUT`: Int = 67108864;
public const val `MCI_DGV_SETVIDEO_OVER`: Int = 2097152;
public const val `MCI_DGV_SETVIDEO_PALHANDLE`: Int = 16391;
// UNSUPPORTED Rust 2437:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_SETVIDEO_PARMSA {
//     pub dwCallback: usize,
//     pub dwItem: u32,
//     pub dwValue: u32,
//     pub dwOver: u32,
//     pub lpstrAlgorithm: windows_sys::core::PSTR,
//     pub lpstrQuality: windows_sys::core::PSTR,
//     pub dwSourceNumber: u32,
// }

// UNSUPPORTED Rust 2448:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_SETVIDEO_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2453:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_SETVIDEO_PARMSW {
//     pub dwCallback: usize,
//     pub dwItem: u32,
//     pub dwValue: u32,
//     pub dwOver: u32,
//     pub lpstrAlgorithm: windows_sys::core::PWSTR,
//     pub lpstrQuality: windows_sys::core::PWSTR,
//     pub dwSourceNumber: u32,
// }

// UNSUPPORTED Rust 2464:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_SETVIDEO_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_SETVIDEO_QUALITY`: Int = 65536;
public const val `MCI_DGV_SETVIDEO_RECORD`: Int = 4194304;
public const val `MCI_DGV_SETVIDEO_SHARPNESS`: Int = 16388;
public const val `MCI_DGV_SETVIDEO_SOURCE`: Int = 16393;
public const val `MCI_DGV_SETVIDEO_SRC_GENERIC`: Int = 16389;
public const val `MCI_DGV_SETVIDEO_SRC_GENERIC_S`: Int = 32789;
public const val `MCI_DGV_SETVIDEO_SRC_NTSC`: Int = 16384;
public const val `MCI_DGV_SETVIDEO_SRC_NTSC_S`: Int = 32784;
public const val `MCI_DGV_SETVIDEO_SRC_NUMBER`: Int = 524288;
public const val `MCI_DGV_SETVIDEO_SRC_PAL`: Int = 16387;
public const val `MCI_DGV_SETVIDEO_SRC_PAL_S`: Int = 32787;
public const val `MCI_DGV_SETVIDEO_SRC_RGB`: Int = 16385;
public const val `MCI_DGV_SETVIDEO_SRC_RGB_S`: Int = 32785;
public const val `MCI_DGV_SETVIDEO_SRC_SECAM`: Int = 16388;
public const val `MCI_DGV_SETVIDEO_SRC_SECAM_S`: Int = 32788;
public const val `MCI_DGV_SETVIDEO_SRC_SVIDEO`: Int = 16386;
public const val `MCI_DGV_SETVIDEO_SRC_SVIDEO_S`: Int = 32786;
public const val `MCI_DGV_SETVIDEO_STILL`: Int = 8388608;
public const val `MCI_DGV_SETVIDEO_STREAM`: Int = 16390;
public const val `MCI_DGV_SETVIDEO_TINT`: Int = 16387;
public const val `MCI_DGV_SETVIDEO_VALUE`: Int = 16777216;
public const val `MCI_DGV_SET_FILEFORMAT`: Int = 524288;
// UNSUPPORTED Rust 2491:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_SET_PARMS {
//     pub dwCallback: usize,
//     pub dwTimeFormat: u32,
//     pub dwAudio: u32,
//     pub dwFileFormat: u32,
//     pub dwSpeed: u32,
// }

public const val `MCI_DGV_SET_SEEK_EXACTLY`: Int = 65536;
public const val `MCI_DGV_SET_SPEED`: Int = 131072;
public const val `MCI_DGV_SET_STILL`: Int = 262144;
public const val `MCI_DGV_SIGNAL_AT`: Int = 65536;
public const val `MCI_DGV_SIGNAL_CANCEL`: Int = 524288;
public const val `MCI_DGV_SIGNAL_EVERY`: Int = 131072;
// UNSUPPORTED Rust 2506:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_SIGNAL_PARMS {
//     pub dwCallback: usize,
//     pub dwPosition: u32,
//     pub dwPeriod: u32,
//     pub dwUserParm: u32,
// }

public const val `MCI_DGV_SIGNAL_POSITION`: Int = 1048576;
public const val `MCI_DGV_SIGNAL_USERVAL`: Int = 262144;
public const val `MCI_DGV_STATUS_AUDIO`: Int = 16404;
public const val `MCI_DGV_STATUS_AUDIO_INPUT`: Int = 16384;
public const val `MCI_DGV_STATUS_AUDIO_RECORD`: Int = 16410;
public const val `MCI_DGV_STATUS_AUDIO_SOURCE`: Int = 16393;
public const val `MCI_DGV_STATUS_AUDIO_STREAM`: Int = 16429;
public const val `MCI_DGV_STATUS_AVGBYTESPERSEC`: Int = 16424;
public const val `MCI_DGV_STATUS_BASS`: Int = 16399;
public const val `MCI_DGV_STATUS_BITSPERPEL`: Int = 16427;
public const val `MCI_DGV_STATUS_BITSPERSAMPLE`: Int = 16426;
public const val `MCI_DGV_STATUS_BLOCKALIGN`: Int = 16425;
public const val `MCI_DGV_STATUS_BRIGHTNESS`: Int = 16389;
public const val `MCI_DGV_STATUS_COLOR`: Int = 16390;
public const val `MCI_DGV_STATUS_CONTRAST`: Int = 16391;
public const val `MCI_DGV_STATUS_DISKSPACE`: Int = 2097152;
public const val `MCI_DGV_STATUS_FILEFORMAT`: Int = 16392;
public const val `MCI_DGV_STATUS_FILE_COMPLETION`: Int = 16416;
public const val `MCI_DGV_STATUS_FILE_MODE`: Int = 16415;
public const val `MCI_DGV_STATUS_FORWARD`: Int = 16428;
public const val `MCI_DGV_STATUS_FRAME_RATE`: Int = 16398;
public const val `MCI_DGV_STATUS_GAMMA`: Int = 16394;
public const val `MCI_DGV_STATUS_HPAL`: Int = 16388;
public const val `MCI_DGV_STATUS_HWND`: Int = 16385;
public const val `MCI_DGV_STATUS_INPUT`: Int = 4194304;
public const val `MCI_DGV_STATUS_KEY_COLOR`: Int = 16421;
public const val `MCI_DGV_STATUS_KEY_INDEX`: Int = 16420;
public const val `MCI_DGV_STATUS_LEFT`: Int = 524288;
public const val `MCI_DGV_STATUS_MONITOR`: Int = 16395;
public const val `MCI_DGV_STATUS_MONITOR_METHOD`: Int = 16396;
public const val `MCI_DGV_STATUS_NOMINAL`: Int = 131072;
public const val `MCI_DGV_STATUS_OUTPUT`: Int = 8388608;
// UNSUPPORTED Rust 2546:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_STATUS_PARMSA {
//     pub dwCallback: usize,
//     pub dwReturn: usize,
//     pub dwItem: u32,
//     pub dwTrack: u32,
//     pub lpstrDrive: windows_sys::core::PSTR,
//     pub dwReference: u32,
// }

// UNSUPPORTED Rust 2556:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_STATUS_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2561:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_STATUS_PARMSW {
//     pub dwCallback: usize,
//     pub dwReturn: usize,
//     pub dwItem: u32,
//     pub dwTrack: u32,
//     pub lpstrDrive: windows_sys::core::PWSTR,
//     pub dwReference: u32,
// }

// UNSUPPORTED Rust 2571:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_STATUS_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_STATUS_PAUSE_MODE`: Int = 16422;
public const val `MCI_DGV_STATUS_RECORD`: Int = 16777216;
public const val `MCI_DGV_STATUS_REFERENCE`: Int = 262144;
public const val `MCI_DGV_STATUS_RIGHT`: Int = 1048576;
public const val `MCI_DGV_STATUS_SAMPLESPERSEC`: Int = 16423;
public const val `MCI_DGV_STATUS_SEEK_EXACTLY`: Int = 16401;
public const val `MCI_DGV_STATUS_SHARPNESS`: Int = 16402;
public const val `MCI_DGV_STATUS_SIZE`: Int = 16400;
public const val `MCI_DGV_STATUS_SMPTE`: Int = 16403;
public const val `MCI_DGV_STATUS_SPEED`: Int = 16387;
public const val `MCI_DGV_STATUS_STILL_FILEFORMAT`: Int = 16413;
public const val `MCI_DGV_STATUS_TINT`: Int = 16405;
public const val `MCI_DGV_STATUS_TREBLE`: Int = 16406;
public const val `MCI_DGV_STATUS_UNSAVED`: Int = 16407;
public const val `MCI_DGV_STATUS_VIDEO`: Int = 16408;
public const val `MCI_DGV_STATUS_VIDEO_RECORD`: Int = 16412;
public const val `MCI_DGV_STATUS_VIDEO_SOURCE`: Int = 16411;
public const val `MCI_DGV_STATUS_VIDEO_SRC_NUM`: Int = 16414;
public const val `MCI_DGV_STATUS_VIDEO_STREAM`: Int = 16430;
public const val `MCI_DGV_STATUS_VOLUME`: Int = 16409;
public const val `MCI_DGV_STATUS_WINDOW_MAXIMIZED`: Int = 16419;
public const val `MCI_DGV_STATUS_WINDOW_MINIMIZED`: Int = 16418;
public const val `MCI_DGV_STATUS_WINDOW_VISIBLE`: Int = 16417;
public const val `MCI_DGV_STEP_FRAMES`: Int = 131072;
// UNSUPPORTED Rust 2600:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_DGV_STEP_PARMS {
//     pub dwCallback: usize,
//     pub dwFrames: u32,
// }

public const val `MCI_DGV_STEP_REVERSE`: Int = 65536;
public const val `MCI_DGV_STOP_HOLD`: Int = 65536;
public const val `MCI_DGV_UPDATE_HDC`: Int = 131072;
public const val `MCI_DGV_UPDATE_PAINT`: Int = 262144;
// UNSUPPORTED Rust 2610:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_UPDATE_PARMS {
//     pub dwCallback: usize,
//     pub rc: super::super::Foundation::RECT,
//     pub hDC: super::super::Graphics::Gdi::HDC,
// }

// UNSUPPORTED Rust 2618:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for MCI_DGV_UPDATE_PARMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_WHERE_DESTINATION`: Int = 262144;
public const val `MCI_DGV_WHERE_FRAME`: Int = 524288;
public const val `MCI_DGV_WHERE_MAX`: Int = 4194304;
public const val `MCI_DGV_WHERE_SOURCE`: Int = 131072;
public const val `MCI_DGV_WHERE_VIDEO`: Int = 1048576;
public const val `MCI_DGV_WHERE_WINDOW`: Int = 2097152;
public const val `MCI_DGV_WINDOW_DEFAULT`: Int = 0;
public const val `MCI_DGV_WINDOW_HWND`: Int = 65536;
// UNSUPPORTED Rust 2632:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_WINDOW_PARMSA {
//     pub dwCallback: usize,
//     pub hWnd: super::super::Foundation::HWND,
//     pub nCmdShow: u32,
//     pub lpstrText: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2640:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_WINDOW_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2645:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_DGV_WINDOW_PARMSW {
//     pub dwCallback: usize,
//     pub hWnd: super::super::Foundation::HWND,
//     pub nCmdShow: u32,
//     pub lpstrText: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2653:1: declaration Impl has no candidate rule
// impl Default for MCI_DGV_WINDOW_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_DGV_WINDOW_STATE`: Int = 262144;
public const val `MCI_DGV_WINDOW_TEXT`: Int = 524288;
public const val `MCI_END_COMMAND`: UInt = 3u;
public const val `MCI_END_COMMAND_LIST`: UInt = 6u;
public const val `MCI_END_CONSTANT`: UInt = 9u;
public const val `MCI_ESCAPE`: UInt = 2053u;
public const val `MCI_FALSE`: UInt = 531u;
public const val `MCI_FIRST`: UInt = 2048u;
public const val `MCI_FLAG`: UInt = 5u;
public const val `MCI_FORMAT_BYTES`: UInt = 8u;
public const val `MCI_FORMAT_BYTES_S`: UInt = 541u;
public const val `MCI_FORMAT_FRAMES`: UInt = 3u;
public const val `MCI_FORMAT_FRAMES_S`: UInt = 536u;
public const val `MCI_FORMAT_HMS`: UInt = 1u;
public const val `MCI_FORMAT_HMS_S`: UInt = 534u;
public const val `MCI_FORMAT_MILLISECONDS`: UInt = 0u;
public const val `MCI_FORMAT_MILLISECONDS_S`: UInt = 533u;
public const val `MCI_FORMAT_MSF`: UInt = 2u;
public const val `MCI_FORMAT_MSF_S`: UInt = 535u;
public const val `MCI_FORMAT_SAMPLES`: UInt = 9u;
public const val `MCI_FORMAT_SAMPLES_S`: UInt = 542u;
public const val `MCI_FORMAT_SMPTE_24`: UInt = 4u;
public const val `MCI_FORMAT_SMPTE_24_S`: UInt = 537u;
public const val `MCI_FORMAT_SMPTE_25`: UInt = 5u;
public const val `MCI_FORMAT_SMPTE_25_S`: UInt = 538u;
public const val `MCI_FORMAT_SMPTE_30`: UInt = 6u;
public const val `MCI_FORMAT_SMPTE_30DROP`: UInt = 7u;
public const val `MCI_FORMAT_SMPTE_30DROP_S`: UInt = 540u;
public const val `MCI_FORMAT_SMPTE_30_S`: UInt = 539u;
public const val `MCI_FORMAT_TMSF`: UInt = 10u;
public const val `MCI_FORMAT_TMSF_S`: UInt = 543u;
public const val `MCI_FREEZE`: UInt = 2116u;
public const val `MCI_FROM`: Int = 4;
// UNSUPPORTED Rust 2691:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_GENERIC_PARMS {
//     pub dwCallback: usize,
// }

public const val `MCI_GETDEVCAPS`: UInt = 2059u;
public const val `MCI_GETDEVCAPS_CAN_EJECT`: Int = 7;
public const val `MCI_GETDEVCAPS_CAN_PLAY`: Int = 8;
public const val `MCI_GETDEVCAPS_CAN_RECORD`: Int = 1;
public const val `MCI_GETDEVCAPS_CAN_SAVE`: Int = 9;
public const val `MCI_GETDEVCAPS_COMPOUND_DEVICE`: Int = 6;
public const val `MCI_GETDEVCAPS_DEVICE_TYPE`: Int = 4;
public const val `MCI_GETDEVCAPS_HAS_AUDIO`: Int = 2;
public const val `MCI_GETDEVCAPS_HAS_VIDEO`: Int = 3;
public const val `MCI_GETDEVCAPS_ITEM`: Int = 256;
// UNSUPPORTED Rust 2706:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_GETDEVCAPS_PARMS {
//     pub dwCallback: usize,
//     pub dwReturn: u32,
//     pub dwItem: u32,
// }

public const val `MCI_GETDEVCAPS_USES_FILES`: Int = 5;
public const val `MCI_HDC`: UInt = 12u;
public const val `MCI_HPAL`: UInt = 11u;
public const val `MCI_HWND`: UInt = 10u;
public const val `MCI_INFO`: UInt = 2058u;
public const val `MCI_INFO_COPYRIGHT`: Int = 8192;
public const val `MCI_INFO_FILE`: Int = 512;
public const val `MCI_INFO_MEDIA_IDENTITY`: Int = 2048;
public const val `MCI_INFO_MEDIA_UPC`: Int = 1024;
public const val `MCI_INFO_NAME`: Int = 4096;
// UNSUPPORTED Rust 2723:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_INFO_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PSTR,
//     pub dwRetSize: u32,
// }

// UNSUPPORTED Rust 2730:1: declaration Impl has no candidate rule
// impl Default for MCI_INFO_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2735:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_INFO_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PWSTR,
//     pub dwRetSize: u32,
// }

// UNSUPPORTED Rust 2742:1: declaration Impl has no candidate rule
// impl Default for MCI_INFO_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_INFO_PRODUCT`: Int = 256;
public const val `MCI_INFO_VERSION`: Int = 1024;
public const val `MCI_INTEGER`: UInt = 2u;
public const val `MCI_INTEGER64`: UInt = 13u;
public const val `MCI_INTEGER_RETURNED`: UInt = 524288u;
public const val `MCI_LAST`: UInt = 4095u;
public const val `MCI_LIST`: UInt = 2168u;
public const val `MCI_LOAD`: UInt = 2128u;
public const val `MCI_LOAD_FILE`: Int = 256;
// UNSUPPORTED Rust 2756:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_LOAD_PARMSA {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 2762:1: declaration Impl has no candidate rule
// impl Default for MCI_LOAD_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2767:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_LOAD_PARMSW {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 2773:1: declaration Impl has no candidate rule
// impl Default for MCI_LOAD_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_MAX_DEVICE_TYPE_LENGTH`: UInt = 80u;
public const val `MCI_MCIAVI_PLAY_FULLBY2`: Int = 67108864;
public const val `MCI_MCIAVI_PLAY_FULLSCREEN`: Int = 33554432;
public const val `MCI_MCIAVI_PLAY_WINDOW`: Int = 16777216;
public const val `MCI_MODE_NOT_READY`: UInt = 524u;
public const val `MCI_MODE_OPEN`: UInt = 530u;
public const val `MCI_MODE_PAUSE`: UInt = 529u;
public const val `MCI_MODE_PLAY`: UInt = 526u;
public const val `MCI_MODE_RECORD`: UInt = 527u;
public const val `MCI_MODE_SEEK`: UInt = 528u;
public const val `MCI_MODE_STOP`: UInt = 525u;
public const val `MCI_MONITOR`: UInt = 2161u;
public const val `MCI_NOTIFY`: Int = 1;
public const val `MCI_NOTIFY_ABORTED`: UInt = 4u;
public const val `MCI_NOTIFY_FAILURE`: UInt = 8u;
public const val `MCI_NOTIFY_SUCCESSFUL`: UInt = 1u;
public const val `MCI_NOTIFY_SUPERSEDED`: UInt = 2u;
public const val `MCI_OFF`: UInt = 0u;
public const val `MCI_OFF_S`: Int = 32769;
public const val `MCI_ON`: UInt = 1u;
public const val `MCI_ON_S`: Int = 32768;
public const val `MCI_OPEN`: UInt = 2051u;
public const val `MCI_OPEN_ALIAS`: Int = 1024;
public const val `MCI_OPEN_DRIVER`: UInt = 2049u;
// UNSUPPORTED Rust 2802:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OPEN_DRIVER_PARMS {
//     pub wDeviceID: u32,
//     pub lpstrParams: windows_sys::core::PCWSTR,
//     pub wCustomCommandTable: u32,
//     pub wType: u32,
// }

// UNSUPPORTED Rust 2810:1: declaration Impl has no candidate rule
// impl Default for MCI_OPEN_DRIVER_PARMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_OPEN_ELEMENT`: Int = 512;
public const val `MCI_OPEN_ELEMENT_ID`: Int = 2048;
// UNSUPPORTED Rust 2817:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OPEN_PARMSA {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCSTR,
//     pub lpstrElementName: windows_sys::core::PCSTR,
//     pub lpstrAlias: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 2826:1: declaration Impl has no candidate rule
// impl Default for MCI_OPEN_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2831:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OPEN_PARMSW {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCWSTR,
//     pub lpstrElementName: windows_sys::core::PCWSTR,
//     pub lpstrAlias: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 2840:1: declaration Impl has no candidate rule
// impl Default for MCI_OPEN_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_OPEN_SHAREABLE`: Int = 256;
public const val `MCI_OPEN_TYPE`: Int = 8192;
public const val `MCI_OPEN_TYPE_ID`: Int = 4096;
public const val `MCI_OVLY_GETDEVCAPS_CAN_FREEZE`: Int = 16386;
public const val `MCI_OVLY_GETDEVCAPS_CAN_STRETCH`: Int = 16385;
public const val `MCI_OVLY_GETDEVCAPS_MAX_WINDOWS`: Int = 16387;
public const val `MCI_OVLY_INFO_TEXT`: Int = 65536;
// UNSUPPORTED Rust 2852:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_LOAD_PARMSA {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2859:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_LOAD_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2864:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_LOAD_PARMSW {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCWSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2871:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_LOAD_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_OVLY_OPEN_PARENT`: Int = 131072;
// UNSUPPORTED Rust 2877:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_OPEN_PARMSA {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCSTR,
//     pub lpstrElementName: windows_sys::core::PCSTR,
//     pub lpstrAlias: windows_sys::core::PCSTR,
//     pub dwStyle: u32,
//     pub hWndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 2888:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_OPEN_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2893:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_OPEN_PARMSW {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCWSTR,
//     pub lpstrElementName: windows_sys::core::PCWSTR,
//     pub lpstrAlias: windows_sys::core::PCWSTR,
//     pub dwStyle: u32,
//     pub hWndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 2904:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_OPEN_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_OVLY_OPEN_WS`: Int = 65536;
public const val `MCI_OVLY_PUT_DESTINATION`: Int = 262144;
public const val `MCI_OVLY_PUT_FRAME`: Int = 524288;
public const val `MCI_OVLY_PUT_SOURCE`: Int = 131072;
public const val `MCI_OVLY_PUT_VIDEO`: Int = 1048576;
public const val `MCI_OVLY_RECT`: Int = 65536;
// UNSUPPORTED Rust 2915:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_OVLY_RECT_PARMS {
//     pub dwCallback: usize,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2921:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_SAVE_PARMSA {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2928:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_SAVE_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2933:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_SAVE_PARMSW {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCWSTR,
//     pub rc: super::super::Foundation::RECT,
// }

// UNSUPPORTED Rust 2940:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_SAVE_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_OVLY_STATUS_HWND`: Int = 16385;
public const val `MCI_OVLY_STATUS_STRETCH`: Int = 16386;
public const val `MCI_OVLY_WHERE_DESTINATION`: Int = 262144;
public const val `MCI_OVLY_WHERE_FRAME`: Int = 524288;
public const val `MCI_OVLY_WHERE_SOURCE`: Int = 131072;
public const val `MCI_OVLY_WHERE_VIDEO`: Int = 1048576;
public const val `MCI_OVLY_WINDOW_DEFAULT`: Int = 0;
public const val `MCI_OVLY_WINDOW_DISABLE_STRETCH`: Int = 2097152;
public const val `MCI_OVLY_WINDOW_ENABLE_STRETCH`: Int = 1048576;
public const val `MCI_OVLY_WINDOW_HWND`: Int = 65536;
// UNSUPPORTED Rust 2955:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_WINDOW_PARMSA {
//     pub dwCallback: usize,
//     pub hWnd: super::super::Foundation::HWND,
//     pub nCmdShow: u32,
//     pub lpstrText: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 2963:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_WINDOW_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2968:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_OVLY_WINDOW_PARMSW {
//     pub dwCallback: usize,
//     pub hWnd: super::super::Foundation::HWND,
//     pub nCmdShow: u32,
//     pub lpstrText: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 2976:1: declaration Impl has no candidate rule
// impl Default for MCI_OVLY_WINDOW_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_OVLY_WINDOW_STATE`: Int = 262144;
public const val `MCI_OVLY_WINDOW_TEXT`: Int = 524288;
public const val `MCI_PASTE`: UInt = 2131u;
public const val `MCI_PAUSE`: UInt = 2057u;
public const val `MCI_PLAY`: UInt = 2054u;
// UNSUPPORTED Rust 2986:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_PLAY_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
// }

public const val `MCI_PUT`: UInt = 2114u;
public const val `MCI_QUALITY`: UInt = 2167u;
public const val `MCI_QUALITY_ALG`: Int = 262144;
public const val `MCI_QUALITY_DIALOG`: Int = 524288;
public const val `MCI_QUALITY_HANDLE`: Int = 1048576;
public const val `MCI_QUALITY_ITEM`: Int = 65536;
public const val `MCI_QUALITY_ITEM_AUDIO`: Int = 16384;
public const val `MCI_QUALITY_ITEM_STILL`: Int = 16385;
public const val `MCI_QUALITY_ITEM_VIDEO`: Int = 16386;
public const val `MCI_QUALITY_NAME`: Int = 131072;
public const val `MCI_REALIZE`: UInt = 2112u;
public const val `MCI_RECORD`: UInt = 2063u;
public const val `MCI_RECORD_INSERT`: Int = 256;
public const val `MCI_RECORD_OVERWRITE`: Int = 512;
// UNSUPPORTED Rust 3007:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_RECORD_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
// }

public const val `MCI_RECT`: UInt = 7u;
public const val `MCI_RESERVE`: UInt = 2162u;
public const val `MCI_RESOURCE_DRIVER`: UInt = 1048576u;
public const val `MCI_RESOURCE_RETURNED`: UInt = 65536u;
public const val `MCI_RESTORE`: UInt = 2171u;
public const val `MCI_RESUME`: UInt = 2133u;
public const val `MCI_RETURN`: UInt = 4u;
public const val `MCI_SAVE`: UInt = 2067u;
public const val `MCI_SAVE_FILE`: Int = 256;
// UNSUPPORTED Rust 3023:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_SAVE_PARMSA {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 3029:1: declaration Impl has no candidate rule
// impl Default for MCI_SAVE_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3034:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_SAVE_PARMSW {
//     pub dwCallback: usize,
//     pub lpfilename: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 3040:1: declaration Impl has no candidate rule
// impl Default for MCI_SAVE_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3045:1: non-scalar type Ptr unsupported
// pub const MCI_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("MCI32");

public const val `MCI_SEEK`: UInt = 2055u;
// UNSUPPORTED Rust 3047:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_SEEK_PARMS {
//     pub dwCallback: usize,
//     pub dwTo: u32,
// }

public const val `MCI_SEEK_TO_END`: Int = 512;
public const val `MCI_SEEK_TO_START`: Int = 256;
public const val `MCI_SEQ_FILE`: UInt = 16386u;
public const val `MCI_SEQ_FILE_S`: UInt = 1222u;
public const val `MCI_SEQ_FORMAT_SONGPTR`: UInt = 16385u;
public const val `MCI_SEQ_FORMAT_SONGPTR_S`: UInt = 1225u;
public const val `MCI_SEQ_MAPPER`: UInt = 65535u;
public const val `MCI_SEQ_MAPPER_S`: UInt = 1221u;
public const val `MCI_SEQ_MIDI`: UInt = 16387u;
public const val `MCI_SEQ_MIDI_S`: UInt = 1223u;
public const val `MCI_SEQ_NONE`: UInt = 65533u;
public const val `MCI_SEQ_NONE_S`: UInt = 1226u;
public const val `MCI_SEQ_SET_MASTER`: Int = 524288;
public const val `MCI_SEQ_SET_OFFSET`: Int = 16777216;
// UNSUPPORTED Rust 3067:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_SEQ_SET_PARMS {
//     pub dwCallback: usize,
//     pub dwTimeFormat: u32,
//     pub dwAudio: u32,
//     pub dwTempo: u32,
//     pub dwPort: u32,
//     pub dwSlave: u32,
//     pub dwMaster: u32,
//     pub dwOffset: u32,
// }

public const val `MCI_SEQ_SET_PORT`: Int = 131072;
public const val `MCI_SEQ_SET_SLAVE`: Int = 262144;
public const val `MCI_SEQ_SET_TEMPO`: Int = 65536;
public const val `MCI_SEQ_SMPTE`: UInt = 16388u;
public const val `MCI_SEQ_SMPTE_S`: UInt = 1224u;
public const val `MCI_SEQ_STATUS_COPYRIGHT`: Int = 16396;
public const val `MCI_SEQ_STATUS_DIVTYPE`: Int = 16394;
public const val `MCI_SEQ_STATUS_MASTER`: Int = 16392;
public const val `MCI_SEQ_STATUS_NAME`: Int = 16395;
public const val `MCI_SEQ_STATUS_OFFSET`: Int = 16393;
public const val `MCI_SEQ_STATUS_PORT`: Int = 16387;
public const val `MCI_SEQ_STATUS_SLAVE`: Int = 16391;
public const val `MCI_SEQ_STATUS_TEMPO`: Int = 16386;
public const val `MCI_SET`: UInt = 2061u;
public const val `MCI_SETAUDIO`: UInt = 2163u;
public const val `MCI_SETVIDEO`: UInt = 2166u;
public const val `MCI_SET_AUDIO`: Int = 2048;
public const val `MCI_SET_AUDIO_ALL`: Int = 0;
public const val `MCI_SET_AUDIO_LEFT`: Int = 1;
public const val `MCI_SET_AUDIO_RIGHT`: Int = 2;
public const val `MCI_SET_DOOR_CLOSED`: Int = 512;
public const val `MCI_SET_DOOR_OPEN`: Int = 256;
public const val `MCI_SET_OFF`: Int = 16384;
public const val `MCI_SET_ON`: Int = 8192;
// UNSUPPORTED Rust 3103:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_SET_PARMS {
//     pub dwCallback: usize,
//     pub dwTimeFormat: u32,
//     pub dwAudio: u32,
// }

public const val `MCI_SET_TIME_FORMAT`: Int = 1024;
public const val `MCI_SET_VIDEO`: Int = 4096;
public const val `MCI_SIGNAL`: UInt = 2165u;
public const val `MCI_SPIN`: UInt = 2060u;
public const val `MCI_STATUS`: UInt = 2068u;
public const val `MCI_STATUS_CURRENT_TRACK`: Int = 8;
public const val `MCI_STATUS_ITEM`: Int = 256;
public const val `MCI_STATUS_LENGTH`: Int = 1;
public const val `MCI_STATUS_MEDIA_PRESENT`: Int = 5;
public const val `MCI_STATUS_MODE`: Int = 4;
public const val `MCI_STATUS_NUMBER_OF_TRACKS`: Int = 3;
// UNSUPPORTED Rust 3121:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_STATUS_PARMS {
//     pub dwCallback: usize,
//     pub dwReturn: usize,
//     pub dwItem: u32,
//     pub dwTrack: u32,
// }

public const val `MCI_STATUS_POSITION`: Int = 2;
public const val `MCI_STATUS_READY`: Int = 7;
public const val `MCI_STATUS_START`: Int = 512;
public const val `MCI_STATUS_TIME_FORMAT`: Int = 6;
public const val `MCI_STEP`: UInt = 2062u;
public const val `MCI_STOP`: UInt = 2056u;
public const val `MCI_STRING`: UInt = 1u;
public const val `MCI_SYSINFO`: UInt = 2064u;
public const val `MCI_SYSINFO_INSTALLNAME`: Int = 2048;
public const val `MCI_SYSINFO_NAME`: Int = 1024;
public const val `MCI_SYSINFO_OPEN`: Int = 512;
// UNSUPPORTED Rust 3140:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_SYSINFO_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PSTR,
//     pub dwRetSize: u32,
//     pub dwNumber: u32,
//     pub wDeviceType: u32,
// }

// UNSUPPORTED Rust 3149:1: declaration Impl has no candidate rule
// impl Default for MCI_SYSINFO_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3154:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_SYSINFO_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrReturn: windows_sys::core::PWSTR,
//     pub dwRetSize: u32,
//     pub dwNumber: u32,
//     pub wDeviceType: u32,
// }

// UNSUPPORTED Rust 3163:1: declaration Impl has no candidate rule
// impl Default for MCI_SYSINFO_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_SYSINFO_QUANTITY`: Int = 256;
public const val `MCI_TEST`: Int = 32;
public const val `MCI_TO`: Int = 8;
public const val `MCI_TRACK`: Int = 16;
public const val `MCI_TRUE`: UInt = 532u;
public const val `MCI_UNDO`: UInt = 2169u;
public const val `MCI_UNFREEZE`: UInt = 2117u;
public const val `MCI_UPDATE`: UInt = 2132u;
public const val `MCI_USER_MESSAGES`: UInt = 3072u;
// UNSUPPORTED Rust 3177:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_VD_ESCAPE_PARMSA {
//     pub dwCallback: usize,
//     pub lpstrCommand: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 3183:1: declaration Impl has no candidate rule
// impl Default for MCI_VD_ESCAPE_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3188:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_VD_ESCAPE_PARMSW {
//     pub dwCallback: usize,
//     pub lpstrCommand: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 3194:1: declaration Impl has no candidate rule
// impl Default for MCI_VD_ESCAPE_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_VD_ESCAPE_STRING`: Int = 256;
public const val `MCI_VD_FORMAT_TRACK`: UInt = 16385u;
public const val `MCI_VD_FORMAT_TRACK_S`: UInt = 1029u;
public const val `MCI_VD_GETDEVCAPS_CAN_REVERSE`: Int = 16386;
public const val `MCI_VD_GETDEVCAPS_CAV`: Int = 131072;
public const val `MCI_VD_GETDEVCAPS_CLV`: Int = 65536;
public const val `MCI_VD_GETDEVCAPS_FAST_RATE`: Int = 16387;
public const val `MCI_VD_GETDEVCAPS_NORMAL_RATE`: Int = 16389;
public const val `MCI_VD_GETDEVCAPS_SLOW_RATE`: Int = 16388;
public const val `MCI_VD_MEDIA_CAV`: UInt = 1027u;
public const val `MCI_VD_MEDIA_CLV`: UInt = 1026u;
public const val `MCI_VD_MEDIA_OTHER`: UInt = 1028u;
public const val `MCI_VD_MODE_PARK`: UInt = 1025u;
public const val `MCI_VD_PLAY_FAST`: Int = 131072;
// UNSUPPORTED Rust 3213:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_VD_PLAY_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
//     pub dwSpeed: u32,
// }

public const val `MCI_VD_PLAY_REVERSE`: Int = 65536;
public const val `MCI_VD_PLAY_SCAN`: Int = 524288;
public const val `MCI_VD_PLAY_SLOW`: Int = 1048576;
public const val `MCI_VD_PLAY_SPEED`: Int = 262144;
public const val `MCI_VD_SEEK_REVERSE`: Int = 65536;
public const val `MCI_VD_SPIN_DOWN`: Int = 131072;
public const val `MCI_VD_SPIN_UP`: Int = 65536;
public const val `MCI_VD_STATUS_DISC_SIZE`: Int = 16390;
public const val `MCI_VD_STATUS_FORWARD`: Int = 16387;
public const val `MCI_VD_STATUS_MEDIA_TYPE`: Int = 16388;
public const val `MCI_VD_STATUS_SIDE`: Int = 16389;
public const val `MCI_VD_STATUS_SPEED`: Int = 16386;
public const val `MCI_VD_STEP_FRAMES`: Int = 65536;
// UNSUPPORTED Rust 3234:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_VD_STEP_PARMS {
//     pub dwCallback: usize,
//     pub dwFrames: u32,
// }

public const val `MCI_VD_STEP_REVERSE`: Int = 131072;
public const val `MCI_WAIT`: Int = 2;
// UNSUPPORTED Rust 3242:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_WAVE_DELETE_PARMS {
//     pub dwCallback: usize,
//     pub dwFrom: u32,
//     pub dwTo: u32,
// }

public const val `MCI_WAVE_GETDEVCAPS_INPUTS`: Int = 16385;
public const val `MCI_WAVE_GETDEVCAPS_OUTPUTS`: Int = 16386;
public const val `MCI_WAVE_INPUT`: Int = 4194304;
public const val `MCI_WAVE_MAPPER`: UInt = 1153u;
public const val `MCI_WAVE_OPEN_BUFFER`: Int = 65536;
// UNSUPPORTED Rust 3254:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_WAVE_OPEN_PARMSA {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCSTR,
//     pub lpstrElementName: windows_sys::core::PCSTR,
//     pub lpstrAlias: windows_sys::core::PCSTR,
//     pub dwBufferSeconds: u32,
// }

// UNSUPPORTED Rust 3264:1: declaration Impl has no candidate rule
// impl Default for MCI_WAVE_OPEN_PARMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3269:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MCI_WAVE_OPEN_PARMSW {
//     pub dwCallback: usize,
//     pub wDeviceID: u32,
//     pub lpstrDeviceType: windows_sys::core::PCWSTR,
//     pub lpstrElementName: windows_sys::core::PCWSTR,
//     pub lpstrAlias: windows_sys::core::PCWSTR,
//     pub dwBufferSeconds: u32,
// }

// UNSUPPORTED Rust 3279:1: declaration Impl has no candidate rule
// impl Default for MCI_WAVE_OPEN_PARMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCI_WAVE_OUTPUT`: Int = 8388608;
public const val `MCI_WAVE_PCM`: UInt = 1152u;
public const val `MCI_WAVE_SET_ANYINPUT`: Int = 67108864;
public const val `MCI_WAVE_SET_ANYOUTPUT`: Int = 134217728;
public const val `MCI_WAVE_SET_AVGBYTESPERSEC`: Int = 524288;
public const val `MCI_WAVE_SET_BITSPERSAMPLE`: Int = 2097152;
public const val `MCI_WAVE_SET_BLOCKALIGN`: Int = 1048576;
public const val `MCI_WAVE_SET_CHANNELS`: Int = 131072;
public const val `MCI_WAVE_SET_FORMATTAG`: Int = 65536;
// UNSUPPORTED Rust 3293:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MCI_WAVE_SET_PARMS {
//     pub dwCallback: usize,
//     pub dwTimeFormat: u32,
//     pub dwAudio: u32,
//     pub wInput: u32,
//     pub wOutput: u32,
//     pub wFormatTag: u16,
//     pub wReserved2: u16,
//     pub nChannels: u16,
//     pub wReserved3: u16,
//     pub nSamplesPerSec: u32,
//     pub nAvgBytesPerSec: u32,
//     pub nBlockAlign: u16,
//     pub wReserved4: u16,
//     pub wBitsPerSample: u16,
//     pub wReserved5: u16,
// }

public const val `MCI_WAVE_SET_SAMPLESPERSEC`: Int = 262144;
public const val `MCI_WAVE_STATUS_AVGBYTESPERSEC`: Int = 16388;
public const val `MCI_WAVE_STATUS_BITSPERSAMPLE`: Int = 16390;
public const val `MCI_WAVE_STATUS_BLOCKALIGN`: Int = 16389;
public const val `MCI_WAVE_STATUS_CHANNELS`: Int = 16386;
public const val `MCI_WAVE_STATUS_FORMATTAG`: Int = 16385;
public const val `MCI_WAVE_STATUS_LEVEL`: Int = 16391;
public const val `MCI_WAVE_STATUS_SAMPLESPERSEC`: Int = 16387;
public const val `MCI_WHERE`: UInt = 2115u;
public const val `MCI_WINDOW`: UInt = 2113u;
public const val `MCMADM_E_REGKEY_NOT_FOUND`: Int = -1072889750;
public const val `MCMADM_I_NO_EVENTS`: Int = 1074593897;
// UNSUPPORTED Rust 3324:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct MEDIASPACEADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wRevision: u16,
// }

public const val `MIDIMAPPER_S`: UInt = 1227u;
// UNSUPPORTED Rust 3332:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MIDIOPENSTRMID {
//     pub dwStreamID: u32,
//     pub uDeviceID: u32,
// }

public const val `MIDI_IO_COOKED`: Int = 2;
public const val `MIDI_IO_PACKED`: Int = 0;
public const val `MIDM_ADDBUFFER`: UInt = 59u;
public const val `MIDM_CLOSE`: UInt = 56u;
public const val `MIDM_GETDEVCAPS`: UInt = 54u;
public const val `MIDM_GETNUMDEVS`: UInt = 53u;
public const val `MIDM_INIT`: UInt = 100u;
public const val `MIDM_INIT_EX`: UInt = 104u;
public const val `MIDM_MAPPER`: UInt = 8192u;
public const val `MIDM_OPEN`: UInt = 55u;
public const val `MIDM_PREPARE`: UInt = 57u;
public const val `MIDM_RESET`: UInt = 62u;
public const val `MIDM_START`: UInt = 60u;
public const val `MIDM_STOP`: UInt = 61u;
public const val `MIDM_UNPREPARE`: UInt = 58u;
public const val `MIDM_USER`: UInt = 16384u;
public const val `MIXERCONTROL_CONTROLTYPE_SRS_MTS`: UInt = 536936454u;
public const val `MIXERCONTROL_CONTROLTYPE_SRS_ONOFF`: UInt = 536936455u;
public const val `MIXERCONTROL_CONTROLTYPE_SRS_SYNTHSELECT`: UInt = 536936456u;
// UNSUPPORTED Rust 3357:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy)]
// pub struct MIXEROPENDESC {
//     pub hmx: super::Audio::HMIXER,
//     pub pReserved0: *mut core::ffi::c_void,
//     pub dwCallback: usize,
//     pub dwInstance: usize,
//     pub dnDevNode: usize,
// }

// UNSUPPORTED Rust 3367:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Media_Audio")]
// impl Default for MIXEROPENDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3373:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MMCKINFO {
//     pub ckid: u32,
//     pub cksize: u32,
//     pub fccType: u32,
//     pub dwDataOffset: u32,
//     pub dwFlags: u32,
// }

public const val `MMIOERR_ACCESSDENIED`: UInt = 268u;
public const val `MMIOERR_BASE`: UInt = 256u;
public const val `MMIOERR_CANNOTCLOSE`: UInt = 260u;
public const val `MMIOERR_CANNOTEXPAND`: UInt = 264u;
public const val `MMIOERR_CANNOTOPEN`: UInt = 259u;
public const val `MMIOERR_CANNOTREAD`: UInt = 261u;
public const val `MMIOERR_CANNOTSEEK`: UInt = 263u;
public const val `MMIOERR_CANNOTWRITE`: UInt = 262u;
public const val `MMIOERR_CHUNKNOTFOUND`: UInt = 265u;
public const val `MMIOERR_FILENOTFOUND`: UInt = 257u;
public const val `MMIOERR_INVALIDFILE`: UInt = 272u;
public const val `MMIOERR_NETWORKERROR`: UInt = 270u;
public const val `MMIOERR_OUTOFMEMORY`: UInt = 258u;
public const val `MMIOERR_PATHNOTFOUND`: UInt = 267u;
public const val `MMIOERR_SHARINGVIOLATION`: UInt = 269u;
public const val `MMIOERR_TOOMANYOPENFILES`: UInt = 271u;
public const val `MMIOERR_UNBUFFERED`: UInt = 266u;
// UNSUPPORTED Rust 3399:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MMIOINFO {
//     pub dwFlags: u32,
//     pub fccIOProc: u32,
//     pub pIOProc: LPMMIOPROC,
//     pub wErrorRet: u32,
//     pub htask: super::HTASK,
//     pub cchBuffer: i32,
//     pub pchBuffer: *mut i8,
//     pub pchNext: *mut i8,
//     pub pchEndRead: *mut i8,
//     pub pchEndWrite: *mut i8,
//     pub lBufOffset: i32,
//     pub lDiskOffset: i32,
//     pub adwInfo: [u32; 3],
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
//     pub hmmio: HMMIO,
// }

// UNSUPPORTED Rust 3419:1: declaration Impl has no candidate rule
// impl Default for MMIOINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MMIOM_CLOSE`: UInt = 4u;
public const val `MMIOM_OPEN`: UInt = 3u;
public const val `MMIOM_READ`: UInt = 0u;
public const val `MMIOM_RENAME`: UInt = 6u;
public const val `MMIOM_SEEK`: UInt = 2u;
public const val `MMIOM_USER`: UInt = 32768u;
public const val `MMIOM_WRITE`: UInt = 1u;
public const val `MMIOM_WRITEFLUSH`: UInt = 5u;
public const val `MMIO_ALLOCBUF`: UInt = 65536u;
public const val `MMIO_COMPAT`: UInt = 0u;
public const val `MMIO_CREATE`: UInt = 4096u;
public const val `MMIO_CREATELIST`: UInt = 64u;
public const val `MMIO_CREATERIFF`: UInt = 32u;
public const val `MMIO_DEFAULTBUFFER`: UInt = 8192u;
public const val `MMIO_DELETE`: UInt = 512u;
public const val `MMIO_DENYNONE`: UInt = 64u;
public const val `MMIO_DENYREAD`: UInt = 48u;
public const val `MMIO_DENYWRITE`: UInt = 32u;
public const val `MMIO_DIRTY`: UInt = 268435456u;
public const val `MMIO_EMPTYBUF`: UInt = 16u;
public const val `MMIO_EXCLUSIVE`: UInt = 16u;
public const val `MMIO_EXIST`: UInt = 16384u;
public const val `MMIO_FHOPEN`: UInt = 16u;
public const val `MMIO_FINDCHUNK`: UInt = 16u;
public const val `MMIO_FINDLIST`: UInt = 64u;
public const val `MMIO_FINDPROC`: UInt = 262144u;
public const val `MMIO_FINDRIFF`: UInt = 32u;
public const val `MMIO_GETTEMP`: UInt = 131072u;
public const val `MMIO_GLOBALPROC`: UInt = 268435456u;
public const val `MMIO_INSTALLPROC`: UInt = 65536u;
public const val `MMIO_PARSE`: UInt = 256u;
public const val `MMIO_READ`: UInt = 0u;
public const val `MMIO_READWRITE`: UInt = 2u;
public const val `MMIO_REMOVEPROC`: UInt = 131072u;
public const val `MMIO_RWMODE`: UInt = 3u;
public const val `MMIO_SHAREMODE`: UInt = 112u;
public const val `MMIO_TOUPPER`: UInt = 16u;
public const val `MMIO_UNICODEPROC`: UInt = 16777216u;
public const val `MMIO_WRITE`: UInt = 1u;
public const val `MM_3COM`: UInt = 260u;
public const val `MM_3COM_CB_MIXER`: UInt = 1u;
public const val `MM_3COM_CB_WAVEIN`: UInt = 2u;
public const val `MM_3COM_CB_WAVEOUT`: UInt = 3u;
public const val `MM_3DFX`: UInt = 262u;
public const val `MM_AARDVARK`: UInt = 11u;
public const val `MM_AARDVARK_STUDIO12_WAVEIN`: UInt = 2u;
public const val `MM_AARDVARK_STUDIO12_WAVEOUT`: UInt = 1u;
public const val `MM_AARDVARK_STUDIO88_WAVEIN`: UInt = 4u;
public const val `MM_AARDVARK_STUDIO88_WAVEOUT`: UInt = 3u;
public const val `MM_ACTIVEVOICE`: UInt = 225u;
public const val `MM_ACTIVEVOICE_ACM_VOXADPCM`: UInt = 1u;
public const val `MM_ACULAB`: UInt = 14u;
public const val `MM_ADDX`: UInt = 118u;
public const val `MM_ADDX_PCTV_AUX_CD`: UInt = 5u;
public const val `MM_ADDX_PCTV_AUX_LINE`: UInt = 6u;
public const val `MM_ADDX_PCTV_DIGITALMIX`: UInt = 1u;
public const val `MM_ADDX_PCTV_MIXER`: UInt = 4u;
public const val `MM_ADDX_PCTV_WAVEIN`: UInt = 2u;
public const val `MM_ADDX_PCTV_WAVEOUT`: UInt = 3u;
public const val `MM_ADLACC`: UInt = 91u;
public const val `MM_ADMOS`: UInt = 235u;
public const val `MM_ADMOS_FM_SYNTH`: UInt = 1u;
public const val `MM_ADMOS_QS3AMIDIIN`: UInt = 3u;
public const val `MM_ADMOS_QS3AMIDIOUT`: UInt = 2u;
public const val `MM_ADMOS_QS3AWAVEIN`: UInt = 5u;
public const val `MM_ADMOS_QS3AWAVEOUT`: UInt = 4u;
public const val `MM_AHEAD`: UInt = 77u;
public const val `MM_AHEAD_GENERIC`: UInt = 4u;
public const val `MM_AHEAD_MULTISOUND`: UInt = 1u;
public const val `MM_AHEAD_PROAUDIO`: UInt = 3u;
public const val `MM_AHEAD_SOUNDBLASTER`: UInt = 2u;
public const val `MM_ALARIS`: UInt = 174u;
public const val `MM_ALDIGITAL`: UInt = 143u;
public const val `MM_ALESIS`: UInt = 243u;
public const val `MM_ALGOVISION`: UInt = 266u;
public const val `MM_ALGOVISION_VB80AUX`: UInt = 4u;
public const val `MM_ALGOVISION_VB80AUX2`: UInt = 5u;
public const val `MM_ALGOVISION_VB80MIXER`: UInt = 3u;
public const val `MM_ALGOVISION_VB80WAVEIN`: UInt = 2u;
public const val `MM_ALGOVISION_VB80WAVEOUT`: UInt = 1u;
public const val `MM_AMD`: UInt = 146u;
public const val `MM_AMD_INTERWAVE_AUX1`: UInt = 10u;
public const val `MM_AMD_INTERWAVE_AUX2`: UInt = 11u;
public const val `MM_AMD_INTERWAVE_AUX_CD`: UInt = 13u;
public const val `MM_AMD_INTERWAVE_AUX_MIC`: UInt = 12u;
public const val `MM_AMD_INTERWAVE_EX_CD`: UInt = 7u;
public const val `MM_AMD_INTERWAVE_EX_TELEPHONY`: UInt = 16u;
public const val `MM_AMD_INTERWAVE_JOYSTICK`: UInt = 6u;
public const val `MM_AMD_INTERWAVE_MIDIIN`: UInt = 8u;
public const val `MM_AMD_INTERWAVE_MIDIOUT`: UInt = 9u;
public const val `MM_AMD_INTERWAVE_MIXER1`: UInt = 4u;
public const val `MM_AMD_INTERWAVE_MIXER2`: UInt = 5u;
public const val `MM_AMD_INTERWAVE_MONO_IN`: UInt = 14u;
public const val `MM_AMD_INTERWAVE_MONO_OUT`: UInt = 15u;
public const val `MM_AMD_INTERWAVE_STEREO_ENHANCED`: UInt = 19u;
public const val `MM_AMD_INTERWAVE_SYNTH`: UInt = 3u;
public const val `MM_AMD_INTERWAVE_WAVEIN`: UInt = 1u;
public const val `MM_AMD_INTERWAVE_WAVEOUT`: UInt = 2u;
public const val `MM_AMD_INTERWAVE_WAVEOUT_BASE`: UInt = 17u;
public const val `MM_AMD_INTERWAVE_WAVEOUT_TREBLE`: UInt = 18u;
public const val `MM_ANALOGDEVICES`: UInt = 252u;
public const val `MM_ANTEX`: UInt = 31u;
public const val `MM_ANTEX_AUDIOPORT22_FEEDTHRU`: UInt = 9u;
public const val `MM_ANTEX_AUDIOPORT22_WAVEIN`: UInt = 7u;
public const val `MM_ANTEX_AUDIOPORT22_WAVEOUT`: UInt = 8u;
public const val `MM_ANTEX_SX12_WAVEIN`: UInt = 1u;
public const val `MM_ANTEX_SX12_WAVEOUT`: UInt = 2u;
public const val `MM_ANTEX_SX15_WAVEIN`: UInt = 3u;
public const val `MM_ANTEX_SX15_WAVEOUT`: UInt = 4u;
public const val `MM_ANTEX_VP625_WAVEIN`: UInt = 5u;
public const val `MM_ANTEX_VP625_WAVEOUT`: UInt = 6u;
public const val `MM_APICOM`: UInt = 116u;
public const val `MM_APPLE`: UInt = 99u;
public const val `MM_APPS`: UInt = 42u;
public const val `MM_APT`: UInt = 56u;
public const val `MM_APT_ACE100CD`: UInt = 1u;
public const val `MM_ARRAY`: UInt = 231u;
public const val `MM_ARTISOFT`: UInt = 20u;
public const val `MM_ARTISOFT_SBWAVEIN`: UInt = 1u;
public const val `MM_ARTISOFT_SBWAVEOUT`: UInt = 2u;
public const val `MM_AST`: UInt = 64u;
public const val `MM_AST_MODEMWAVE_WAVEIN`: UInt = 13u;
public const val `MM_AST_MODEMWAVE_WAVEOUT`: UInt = 14u;
public const val `MM_ATI`: UInt = 27u;
public const val `MM_ATT`: UInt = 185u;
public const val `MM_ATT_G729A`: UInt = 1u;
public const val `MM_ATT_MICROELECTRONICS`: UInt = 139u;
public const val `MM_AU8820_AUX`: UInt = 21u;
public const val `MM_AU8820_MIDIIN`: UInt = 23u;
public const val `MM_AU8820_MIDIOUT`: UInt = 22u;
public const val `MM_AU8820_MIXER`: UInt = 20u;
public const val `MM_AU8820_SYNTH`: UInt = 17u;
public const val `MM_AU8820_WAVEIN`: UInt = 19u;
public const val `MM_AU8820_WAVEOUT`: UInt = 18u;
public const val `MM_AU8830_AUX`: UInt = 37u;
public const val `MM_AU8830_MIDIIN`: UInt = 39u;
public const val `MM_AU8830_MIDIOUT`: UInt = 38u;
public const val `MM_AU8830_MIXER`: UInt = 36u;
public const val `MM_AU8830_SYNTH`: UInt = 33u;
public const val `MM_AU8830_WAVEIN`: UInt = 35u;
public const val `MM_AU8830_WAVEOUT`: UInt = 34u;
public const val `MM_AUDIOFILE`: UInt = 47u;
public const val `MM_AUDIOPT`: UInt = 74u;
public const val `MM_AUDIOSCIENCE`: UInt = 217u;
public const val `MM_AURAVISION`: UInt = 80u;
public const val `MM_AUREAL`: UInt = 181u;
public const val `MM_AUREAL_AU8820`: UInt = 16u;
public const val `MM_AUREAL_AU8830`: UInt = 32u;
public const val `MM_AZTECH`: UInt = 52u;
public const val `MM_AZTECH_AUX`: UInt = 404u;
public const val `MM_AZTECH_AUX_CD`: UInt = 401u;
public const val `MM_AZTECH_AUX_LINE`: UInt = 402u;
public const val `MM_AZTECH_AUX_MIC`: UInt = 403u;
public const val `MM_AZTECH_DSP16_FMSYNTH`: UInt = 68u;
public const val `MM_AZTECH_DSP16_WAVEIN`: UInt = 65u;
public const val `MM_AZTECH_DSP16_WAVEOUT`: UInt = 66u;
public const val `MM_AZTECH_DSP16_WAVESYNTH`: UInt = 70u;
public const val `MM_AZTECH_FMSYNTH`: UInt = 20u;
public const val `MM_AZTECH_MIDIIN`: UInt = 4u;
public const val `MM_AZTECH_MIDIOUT`: UInt = 3u;
public const val `MM_AZTECH_MIXER`: UInt = 21u;
public const val `MM_AZTECH_NOVA16_MIXER`: UInt = 73u;
public const val `MM_AZTECH_NOVA16_WAVEIN`: UInt = 71u;
public const val `MM_AZTECH_NOVA16_WAVEOUT`: UInt = 72u;
public const val `MM_AZTECH_PRO16_FMSYNTH`: UInt = 38u;
public const val `MM_AZTECH_PRO16_WAVEIN`: UInt = 33u;
public const val `MM_AZTECH_PRO16_WAVEOUT`: UInt = 34u;
public const val `MM_AZTECH_WASH16_MIXER`: UInt = 76u;
public const val `MM_AZTECH_WASH16_WAVEIN`: UInt = 74u;
public const val `MM_AZTECH_WASH16_WAVEOUT`: UInt = 75u;
public const val `MM_AZTECH_WAVEIN`: UInt = 17u;
public const val `MM_AZTECH_WAVEOUT`: UInt = 18u;
public const val `MM_BCB`: UInt = 192u;
public const val `MM_BCB_NETBOARD_10`: UInt = 1u;
public const val `MM_BCB_TT75_10`: UInt = 2u;
public const val `MM_BECUBED`: UInt = 10u;
public const val `MM_BERCOS`: UInt = 199u;
public const val `MM_BERCOS_MIXER`: UInt = 2u;
public const val `MM_BERCOS_WAVEIN`: UInt = 1u;
public const val `MM_BERCOS_WAVEOUT`: UInt = 3u;
public const val `MM_BERKOM`: UInt = 189u;
public const val `MM_BINTEC`: UInt = 12u;
public const val `MM_BINTEC_TAPI_WAVE`: UInt = 1u;
public const val `MM_BROOKTREE`: UInt = 121u;
public const val `MM_BTV_AUX_CD`: UInt = 8u;
public const val `MM_BTV_AUX_LINE`: UInt = 6u;
public const val `MM_BTV_AUX_MIC`: UInt = 7u;
public const val `MM_BTV_DIGITALIN`: UInt = 9u;
public const val `MM_BTV_DIGITALOUT`: UInt = 10u;
public const val `MM_BTV_MIDIIN`: UInt = 3u;
public const val `MM_BTV_MIDIOUT`: UInt = 4u;
public const val `MM_BTV_MIDISYNTH`: UInt = 5u;
public const val `MM_BTV_MIDIWAVESTREAM`: UInt = 11u;
public const val `MM_BTV_MIXER`: UInt = 12u;
public const val `MM_BTV_WAVEIN`: UInt = 1u;
public const val `MM_BTV_WAVEOUT`: UInt = 2u;
public const val `MM_CANAM`: UInt = 148u;
public const val `MM_CANAM_CBXWAVEIN`: UInt = 2u;
public const val `MM_CANAM_CBXWAVEOUT`: UInt = 1u;
public const val `MM_CANOPUS`: UInt = 49u;
public const val `MM_CANOPUS_ACM_DVREX`: UInt = 1u;
public const val `MM_CASIO`: UInt = 162u;
public const val `MM_CASIO_LSG_MIDIOUT`: UInt = 3u;
public const val `MM_CASIO_WP150_MIDIIN`: UInt = 2u;
public const val `MM_CASIO_WP150_MIDIOUT`: UInt = 1u;
public const val `MM_CAT`: UInt = 41u;
public const val `MM_CAT_WAVEOUT`: UInt = 1u;
public const val `MM_CDPC_AUX`: UInt = 119u;
public const val `MM_CDPC_MIDIIN`: UInt = 114u;
public const val `MM_CDPC_MIDIOUT`: UInt = 113u;
public const val `MM_CDPC_MIXER`: UInt = 118u;
public const val `MM_CDPC_SYNTH`: UInt = 115u;
public const val `MM_CDPC_WAVEIN`: UInt = 117u;
public const val `MM_CDPC_WAVEOUT`: UInt = 116u;
public const val `MM_CHROMATIC`: UInt = 155u;
public const val `MM_CHROMATIC_M1`: UInt = 1u;
public const val `MM_CHROMATIC_M1_AUX`: UInt = 6u;
public const val `MM_CHROMATIC_M1_AUX_CD`: UInt = 7u;
public const val `MM_CHROMATIC_M1_FMSYNTH`: UInt = 4u;
public const val `MM_CHROMATIC_M1_MIDIIN`: UInt = 8u;
public const val `MM_CHROMATIC_M1_MIDIOUT`: UInt = 9u;
public const val `MM_CHROMATIC_M1_MIXER`: UInt = 5u;
public const val `MM_CHROMATIC_M1_MPEGWAVEIN`: UInt = 17u;
public const val `MM_CHROMATIC_M1_MPEGWAVEOUT`: UInt = 18u;
public const val `MM_CHROMATIC_M1_WAVEIN`: UInt = 2u;
public const val `MM_CHROMATIC_M1_WAVEOUT`: UInt = 3u;
public const val `MM_CHROMATIC_M1_WTSYNTH`: UInt = 16u;
public const val `MM_CHROMATIC_M2`: UInt = 19u;
public const val `MM_CHROMATIC_M2_AUX`: UInt = 24u;
public const val `MM_CHROMATIC_M2_AUX_CD`: UInt = 25u;
public const val `MM_CHROMATIC_M2_FMSYNTH`: UInt = 22u;
public const val `MM_CHROMATIC_M2_MIDIIN`: UInt = 32u;
public const val `MM_CHROMATIC_M2_MIDIOUT`: UInt = 33u;
public const val `MM_CHROMATIC_M2_MIXER`: UInt = 23u;
public const val `MM_CHROMATIC_M2_MPEGWAVEIN`: UInt = 35u;
public const val `MM_CHROMATIC_M2_MPEGWAVEOUT`: UInt = 36u;
public const val `MM_CHROMATIC_M2_WAVEIN`: UInt = 20u;
public const val `MM_CHROMATIC_M2_WAVEOUT`: UInt = 21u;
public const val `MM_CHROMATIC_M2_WTSYNTH`: UInt = 34u;
public const val `MM_CIRRUSLOGIC`: UInt = 105u;
public const val `MM_COLORGRAPH`: UInt = 179u;
public const val `MM_COMPAQ`: UInt = 92u;
public const val `MM_COMPAQ_BB_WAVEAUX`: UInt = 3u;
public const val `MM_COMPAQ_BB_WAVEIN`: UInt = 1u;
public const val `MM_COMPAQ_BB_WAVEOUT`: UInt = 2u;
public const val `MM_COMPUSIC`: UInt = 89u;
public const val `MM_COMPUTER_FRIENDS`: UInt = 45u;
public const val `MM_CONCEPTS`: UInt = 108u;
public const val `MM_CONNECTIX`: UInt = 158u;
public const val `MM_CONNECTIX_VIDEC_CODEC`: UInt = 1u;
public const val `MM_CONTROLRES`: UInt = 84u;
public const val `MM_COREDYNAMICS`: UInt = 147u;
public const val `MM_COREDYNAMICS_DYNAGRAFX_VGA`: UInt = 9u;
public const val `MM_COREDYNAMICS_DYNAGRAFX_WAVE_IN`: UInt = 10u;
public const val `MM_COREDYNAMICS_DYNAGRAFX_WAVE_OUT`: UInt = 11u;
public const val `MM_COREDYNAMICS_DYNAMIXHR`: UInt = 1u;
public const val `MM_COREDYNAMICS_DYNASONIX_AUDIO_IN`: UInt = 7u;
public const val `MM_COREDYNAMICS_DYNASONIX_AUDIO_OUT`: UInt = 8u;
public const val `MM_COREDYNAMICS_DYNASONIX_MIDI_IN`: UInt = 3u;
public const val `MM_COREDYNAMICS_DYNASONIX_MIDI_OUT`: UInt = 4u;
public const val `MM_COREDYNAMICS_DYNASONIX_SYNTH`: UInt = 2u;
public const val `MM_COREDYNAMICS_DYNASONIX_WAVE_IN`: UInt = 5u;
public const val `MM_COREDYNAMICS_DYNASONIX_WAVE_OUT`: UInt = 6u;
public const val `MM_CREATIVE`: UInt = 2u;
public const val `MM_CREATIVE_AUX_CD`: UInt = 401u;
public const val `MM_CREATIVE_AUX_LINE`: UInt = 402u;
public const val `MM_CREATIVE_AUX_MASTER`: UInt = 404u;
public const val `MM_CREATIVE_AUX_MIC`: UInt = 403u;
public const val `MM_CREATIVE_AUX_MIDI`: UInt = 407u;
public const val `MM_CREATIVE_AUX_PCSPK`: UInt = 405u;
public const val `MM_CREATIVE_AUX_WAVE`: UInt = 406u;
public const val `MM_CREATIVE_FMSYNTH_MONO`: UInt = 301u;
public const val `MM_CREATIVE_FMSYNTH_STEREO`: UInt = 302u;
public const val `MM_CREATIVE_MIDIIN`: UInt = 202u;
public const val `MM_CREATIVE_MIDIOUT`: UInt = 201u;
public const val `MM_CREATIVE_MIDI_AWE32`: UInt = 303u;
public const val `MM_CREATIVE_PHNBLST_WAVEIN`: UInt = 5u;
public const val `MM_CREATIVE_PHNBLST_WAVEOUT`: UInt = 105u;
public const val `MM_CREATIVE_SB15_WAVEIN`: UInt = 1u;
public const val `MM_CREATIVE_SB15_WAVEOUT`: UInt = 101u;
public const val `MM_CREATIVE_SB16_MIXER`: UInt = 409u;
public const val `MM_CREATIVE_SB20_WAVEIN`: UInt = 2u;
public const val `MM_CREATIVE_SB20_WAVEOUT`: UInt = 102u;
public const val `MM_CREATIVE_SBP16_WAVEIN`: UInt = 4u;
public const val `MM_CREATIVE_SBP16_WAVEOUT`: UInt = 104u;
public const val `MM_CREATIVE_SBPRO_MIXER`: UInt = 408u;
public const val `MM_CREATIVE_SBPRO_WAVEIN`: UInt = 3u;
public const val `MM_CREATIVE_SBPRO_WAVEOUT`: UInt = 103u;
public const val `MM_CRYSTAL`: UInt = 132u;
public const val `MM_CRYSTAL_CS4232_INPUTGAIN_AUX1`: UInt = 13u;
public const val `MM_CRYSTAL_CS4232_INPUTGAIN_LOOP`: UInt = 14u;
public const val `MM_CRYSTAL_CS4232_MIDIIN`: UInt = 9u;
public const val `MM_CRYSTAL_CS4232_MIDIOUT`: UInt = 10u;
public const val `MM_CRYSTAL_CS4232_WAVEAUX_AUX1`: UInt = 4u;
public const val `MM_CRYSTAL_CS4232_WAVEAUX_AUX2`: UInt = 5u;
public const val `MM_CRYSTAL_CS4232_WAVEAUX_LINE`: UInt = 6u;
public const val `MM_CRYSTAL_CS4232_WAVEAUX_MASTER`: UInt = 8u;
public const val `MM_CRYSTAL_CS4232_WAVEAUX_MONO`: UInt = 7u;
public const val `MM_CRYSTAL_CS4232_WAVEIN`: UInt = 1u;
public const val `MM_CRYSTAL_CS4232_WAVEMIXER`: UInt = 3u;
public const val `MM_CRYSTAL_CS4232_WAVEOUT`: UInt = 2u;
public const val `MM_CRYSTAL_NET`: UInt = 154u;
public const val `MM_CRYSTAL_SOUND_FUSION_JOYSTICK`: UInt = 26u;
public const val `MM_CRYSTAL_SOUND_FUSION_MIDIIN`: UInt = 24u;
public const val `MM_CRYSTAL_SOUND_FUSION_MIDIOUT`: UInt = 25u;
public const val `MM_CRYSTAL_SOUND_FUSION_MIXER`: UInt = 23u;
public const val `MM_CRYSTAL_SOUND_FUSION_WAVEIN`: UInt = 21u;
public const val `MM_CRYSTAL_SOUND_FUSION_WAVEOUT`: UInt = 22u;
public const val `MM_CS`: UInt = 242u;
public const val `MM_CYRIX`: UInt = 6u;
public const val `MM_CYRIX_XAAUX`: UInt = 6u;
public const val `MM_CYRIX_XAMIDIIN`: UInt = 2u;
public const val `MM_CYRIX_XAMIDIOUT`: UInt = 3u;
public const val `MM_CYRIX_XAMIXER`: UInt = 7u;
public const val `MM_CYRIX_XASYNTH`: UInt = 1u;
public const val `MM_CYRIX_XAWAVEIN`: UInt = 4u;
public const val `MM_CYRIX_XAWAVEOUT`: UInt = 5u;
public const val `MM_DATAFUSION`: UInt = 196u;
public const val `MM_DATARAN`: UInt = 232u;
public const val `MM_DDD`: UInt = 151u;
public const val `MM_DDD_MIDILINK_MIDIIN`: UInt = 1u;
public const val `MM_DDD_MIDILINK_MIDIOUT`: UInt = 2u;
public const val `MM_DF_ACM_G726`: UInt = 1u;
public const val `MM_DF_ACM_GSM610`: UInt = 2u;
public const val `MM_DIACOUSTICS`: UInt = 129u;
public const val `MM_DIACOUSTICS_DRUM_ACTION`: UInt = 1u;
public const val `MM_DIALOGIC`: UInt = 93u;
public const val `MM_DIAMONDMM`: UInt = 163u;
public const val `MM_DICTAPHONE`: UInt = 214u;
public const val `MM_DICTAPHONE_G726`: UInt = 1u;
public const val `MM_DIGIGRAM`: UInt = 227u;
public const val `MM_DIGITAL`: UInt = 100u;
public const val `MM_DIGITAL_ACM_G723`: UInt = 3u;
public const val `MM_DIGITAL_AUDIO_LABS`: UInt = 136u;
public const val `MM_DIGITAL_AUDIO_LABS_CDLX`: UInt = 19u;
public const val `MM_DIGITAL_AUDIO_LABS_CPRO`: UInt = 17u;
public const val `MM_DIGITAL_AUDIO_LABS_CTDIF`: UInt = 20u;
public const val `MM_DIGITAL_AUDIO_LABS_DOC`: UInt = 2u;
public const val `MM_DIGITAL_AUDIO_LABS_TC`: UInt = 1u;
public const val `MM_DIGITAL_AUDIO_LABS_V8`: UInt = 16u;
public const val `MM_DIGITAL_AUDIO_LABS_VP`: UInt = 18u;
public const val `MM_DIGITAL_AV320_WAVEIN`: UInt = 1u;
public const val `MM_DIGITAL_AV320_WAVEOUT`: UInt = 2u;
public const val `MM_DIGITAL_ICM_H261`: UInt = 5u;
public const val `MM_DIGITAL_ICM_H263`: UInt = 4u;
public const val `MM_DIMD_AUX_LINE`: UInt = 9u;
public const val `MM_DIMD_DIRSOUND`: UInt = 1u;
public const val `MM_DIMD_MIDIIN`: UInt = 7u;
public const val `MM_DIMD_MIDIOUT`: UInt = 8u;
public const val `MM_DIMD_MIXER`: UInt = 10u;
public const val `MM_DIMD_PLATFORM`: UInt = 0u;
public const val `MM_DIMD_VIRTJOY`: UInt = 4u;
public const val `MM_DIMD_VIRTMPU`: UInt = 2u;
public const val `MM_DIMD_VIRTSB`: UInt = 3u;
public const val `MM_DIMD_WAVEIN`: UInt = 5u;
public const val `MM_DIMD_WAVEOUT`: UInt = 6u;
public const val `MM_DIMD_WSS_AUX`: UInt = 21u;
public const val `MM_DIMD_WSS_MIXER`: UInt = 17u;
public const val `MM_DIMD_WSS_SYNTH`: UInt = 76u;
public const val `MM_DIMD_WSS_WAVEIN`: UInt = 14u;
public const val `MM_DIMD_WSS_WAVEOUT`: UInt = 15u;
public const val `MM_DOLBY`: UInt = 78u;
public const val `MM_DPSINC`: UInt = 191u;
public const val `MM_DSP_GROUP`: UInt = 43u;
public const val `MM_DSP_GROUP_TRUESPEECH`: UInt = 1u;
public const val `MM_DSP_SOLUTIONS`: UInt = 25u;
public const val `MM_DSP_SOLUTIONS_AUX`: UInt = 4u;
public const val `MM_DSP_SOLUTIONS_SYNTH`: UInt = 3u;
public const val `MM_DSP_SOLUTIONS_WAVEIN`: UInt = 2u;
public const val `MM_DSP_SOLUTIONS_WAVEOUT`: UInt = 1u;
public const val `MM_DTS`: UInt = 226u;
public const val `MM_DTS_DS`: UInt = 1u;
public const val `MM_DUCK`: UInt = 197u;
public const val `MM_DVISION`: UInt = 165u;
public const val `MM_ECHO`: UInt = 39u;
public const val `MM_ECHO_AUX`: UInt = 6u;
public const val `MM_ECHO_MIDIIN`: UInt = 5u;
public const val `MM_ECHO_MIDIOUT`: UInt = 4u;
public const val `MM_ECHO_SYNTH`: UInt = 1u;
public const val `MM_ECHO_WAVEIN`: UInt = 3u;
public const val `MM_ECHO_WAVEOUT`: UInt = 2u;
public const val `MM_ECS`: UInt = 145u;
public const val `MM_ECS_AADF_MIDI_IN`: UInt = 10u;
public const val `MM_ECS_AADF_MIDI_OUT`: UInt = 11u;
public const val `MM_ECS_AADF_WAVE2MIDI_IN`: UInt = 12u;
public const val `MM_EES`: UInt = 219u;
public const val `MM_EES_PCMIDI14`: UInt = 1u;
public const val `MM_EES_PCMIDI14_IN`: UInt = 2u;
public const val `MM_EES_PCMIDI14_OUT1`: UInt = 3u;
public const val `MM_EES_PCMIDI14_OUT2`: UInt = 4u;
public const val `MM_EES_PCMIDI14_OUT3`: UInt = 5u;
public const val `MM_EES_PCMIDI14_OUT4`: UInt = 6u;
public const val `MM_EMAGIC`: UInt = 208u;
public const val `MM_EMAGIC_UNITOR8`: UInt = 1u;
public const val `MM_EMU`: UInt = 19u;
public const val `MM_EMU_APSMIDIIN`: UInt = 2u;
public const val `MM_EMU_APSMIDIOUT`: UInt = 3u;
public const val `MM_EMU_APSSYNTH`: UInt = 1u;
public const val `MM_EMU_APSWAVEIN`: UInt = 4u;
public const val `MM_EMU_APSWAVEOUT`: UInt = 5u;
public const val `MM_ENET`: UInt = 206u;
public const val `MM_ENET_T2000_HANDSETIN`: UInt = 3u;
public const val `MM_ENET_T2000_HANDSETOUT`: UInt = 4u;
public const val `MM_ENET_T2000_LINEIN`: UInt = 1u;
public const val `MM_ENET_T2000_LINEOUT`: UInt = 2u;
public const val `MM_ENSONIQ`: UInt = 125u;
public const val `MM_ENSONIQ_SOUNDSCAPE`: UInt = 16u;
public const val `MM_EPSON`: UInt = 50u;
public const val `MM_EPS_FMSND`: UInt = 1u;
public const val `MM_ESS`: UInt = 46u;
public const val `MM_ESS_AMAUX`: UInt = 3u;
public const val `MM_ESS_AMMIDIIN`: UInt = 6u;
public const val `MM_ESS_AMMIDIOUT`: UInt = 5u;
public const val `MM_ESS_AMSYNTH`: UInt = 4u;
public const val `MM_ESS_AMWAVEIN`: UInt = 2u;
public const val `MM_ESS_AMWAVEOUT`: UInt = 1u;
public const val `MM_ESS_AUX_CD`: UInt = 8u;
public const val `MM_ESS_ES1488_MIXER`: UInt = 24u;
public const val `MM_ESS_ES1488_WAVEIN`: UInt = 23u;
public const val `MM_ESS_ES1488_WAVEOUT`: UInt = 22u;
public const val `MM_ESS_ES1688_MIXER`: UInt = 27u;
public const val `MM_ESS_ES1688_WAVEIN`: UInt = 26u;
public const val `MM_ESS_ES1688_WAVEOUT`: UInt = 25u;
public const val `MM_ESS_ES1788_MIXER`: UInt = 30u;
public const val `MM_ESS_ES1788_WAVEIN`: UInt = 29u;
public const val `MM_ESS_ES1788_WAVEOUT`: UInt = 28u;
public const val `MM_ESS_ES1868_MIXER`: UInt = 36u;
public const val `MM_ESS_ES1868_WAVEIN`: UInt = 35u;
public const val `MM_ESS_ES1868_WAVEOUT`: UInt = 34u;
public const val `MM_ESS_ES1878_MIXER`: UInt = 39u;
public const val `MM_ESS_ES1878_WAVEIN`: UInt = 38u;
public const val `MM_ESS_ES1878_WAVEOUT`: UInt = 37u;
public const val `MM_ESS_ES1888_MIXER`: UInt = 33u;
public const val `MM_ESS_ES1888_WAVEIN`: UInt = 32u;
public const val `MM_ESS_ES1888_WAVEOUT`: UInt = 31u;
public const val `MM_ESS_ES488_MIXER`: UInt = 18u;
public const val `MM_ESS_ES488_WAVEIN`: UInt = 17u;
public const val `MM_ESS_ES488_WAVEOUT`: UInt = 16u;
public const val `MM_ESS_ES688_MIXER`: UInt = 21u;
public const val `MM_ESS_ES688_WAVEIN`: UInt = 20u;
public const val `MM_ESS_ES688_WAVEOUT`: UInt = 19u;
public const val `MM_ESS_MIXER`: UInt = 7u;
public const val `MM_ESS_MPU401_MIDIIN`: UInt = 10u;
public const val `MM_ESS_MPU401_MIDIOUT`: UInt = 9u;
public const val `MM_ETEK`: UInt = 241u;
public const val `MM_ETEK_KWIKMIDI_MIDIIN`: UInt = 1u;
public const val `MM_ETEK_KWIKMIDI_MIDIOUT`: UInt = 2u;
public const val `MM_EUPHONICS`: UInt = 152u;
public const val `MM_EUPHONICS_AUX_CD`: UInt = 1u;
public const val `MM_EUPHONICS_AUX_LINE`: UInt = 2u;
public const val `MM_EUPHONICS_AUX_MASTER`: UInt = 3u;
public const val `MM_EUPHONICS_AUX_MIC`: UInt = 4u;
public const val `MM_EUPHONICS_AUX_MIDI`: UInt = 5u;
public const val `MM_EUPHONICS_AUX_WAVE`: UInt = 6u;
public const val `MM_EUPHONICS_EUSYNTH`: UInt = 14u;
public const val `MM_EUPHONICS_FMSYNTH_MONO`: UInt = 7u;
public const val `MM_EUPHONICS_FMSYNTH_STEREO`: UInt = 8u;
public const val `MM_EUPHONICS_MIDIIN`: UInt = 9u;
public const val `MM_EUPHONICS_MIDIOUT`: UInt = 10u;
public const val `MM_EUPHONICS_MIXER`: UInt = 11u;
public const val `MM_EUPHONICS_WAVEIN`: UInt = 12u;
public const val `MM_EUPHONICS_WAVEOUT`: UInt = 13u;
public const val `MM_EVEREX`: UInt = 38u;
public const val `MM_EVEREX_CARRIER`: UInt = 1u;
public const val `MM_EXAN`: UInt = 63u;
public const val `MM_FAITH`: UInt = 15u;
public const val `MM_FAST`: UInt = 126u;
public const val `MM_FHGIIS_MPEGLAYER3`: UInt = 10u;
public const val `MM_FHGIIS_MPEGLAYER3_ADVANCED`: UInt = 12u;
public const val `MM_FHGIIS_MPEGLAYER3_ADVANCEDPLUS`: UInt = 14u;
public const val `MM_FHGIIS_MPEGLAYER3_BASIC`: UInt = 11u;
public const val `MM_FHGIIS_MPEGLAYER3_DECODE`: UInt = 9u;
public const val `MM_FHGIIS_MPEGLAYER3_LITE`: UInt = 10u;
public const val `MM_FHGIIS_MPEGLAYER3_PROFESSIONAL`: UInt = 13u;
public const val `MM_FLEXION`: UInt = 249u;
public const val `MM_FLEXION_X300_WAVEIN`: UInt = 1u;
public const val `MM_FLEXION_X300_WAVEOUT`: UInt = 2u;
public const val `MM_FORTEMEDIA`: UInt = 229u;
public const val `MM_FORTEMEDIA_AUX`: UInt = 5u;
public const val `MM_FORTEMEDIA_FMSYNC`: UInt = 3u;
public const val `MM_FORTEMEDIA_MIXER`: UInt = 4u;
public const val `MM_FORTEMEDIA_WAVEIN`: UInt = 1u;
public const val `MM_FORTEMEDIA_WAVEOUT`: UInt = 2u;
public const val `MM_FRAUNHOFER_IIS`: UInt = 172u;
public const val `MM_FRONTIER`: UInt = 160u;
public const val `MM_FRONTIER_WAVECENTER_MIDIIN`: UInt = 1u;
public const val `MM_FRONTIER_WAVECENTER_MIDIOUT`: UInt = 2u;
public const val `MM_FRONTIER_WAVECENTER_WAVEIN`: UInt = 3u;
public const val `MM_FRONTIER_WAVECENTER_WAVEOUT`: UInt = 4u;
public const val `MM_FTR`: UInt = 198u;
public const val `MM_FTR_ACM`: UInt = 2u;
public const val `MM_FTR_ENCODER_WAVEIN`: UInt = 1u;
public const val `MM_FUJITSU`: UInt = 4u;
public const val `MM_GADGETLABS`: UInt = 159u;
public const val `MM_GADGETLABS_WAVE42_WAVEIN`: UInt = 3u;
public const val `MM_GADGETLABS_WAVE42_WAVEOUT`: UInt = 4u;
public const val `MM_GADGETLABS_WAVE44_WAVEIN`: UInt = 1u;
public const val `MM_GADGETLABS_WAVE44_WAVEOUT`: UInt = 2u;
public const val `MM_GADGETLABS_WAVE4_MIDIIN`: UInt = 5u;
public const val `MM_GADGETLABS_WAVE4_MIDIOUT`: UInt = 6u;
public const val `MM_GRANDE`: UInt = 117u;
public const val `MM_GRAVIS`: UInt = 34u;
public const val `MM_GUILLEMOT`: UInt = 207u;
public const val `MM_GULBRANSEN`: UInt = 130u;
public const val `MM_HAFTMANN`: UInt = 220u;
public const val `MM_HAFTMANN_LPTDAC2`: UInt = 1u;
public const val `MM_HEADSPACE`: UInt = 222u;
public const val `MM_HEADSPACE_HAEMIXER`: UInt = 4u;
public const val `MM_HEADSPACE_HAESYNTH`: UInt = 1u;
public const val `MM_HEADSPACE_HAEWAVEIN`: UInt = 3u;
public const val `MM_HEADSPACE_HAEWAVEOUT`: UInt = 2u;
public const val `MM_HEWLETT_PACKARD`: UInt = 13u;
public const val `MM_HEWLETT_PACKARD_CU_CODEC`: UInt = 1u;
public const val `MM_HORIZONS`: UInt = 107u;
public const val `MM_HP`: UInt = 253u;
public const val `MM_HP_WAVEIN`: UInt = 2u;
public const val `MM_HP_WAVEOUT`: UInt = 1u;
public const val `MM_HYPERACTIVE`: UInt = 246u;
public const val `MM_IBM`: UInt = 22u;
public const val `MM_IBM_MWAVE_AUX`: UInt = 23u;
public const val `MM_IBM_MWAVE_MIDIIN`: UInt = 21u;
public const val `MM_IBM_MWAVE_MIDIOUT`: UInt = 22u;
public const val `MM_IBM_MWAVE_MIXER`: UInt = 20u;
public const val `MM_IBM_MWAVE_WAVEIN`: UInt = 18u;
public const val `MM_IBM_MWAVE_WAVEOUT`: UInt = 19u;
public const val `MM_IBM_PCMCIA_AUX`: UInt = 16u;
public const val `MM_IBM_PCMCIA_MIDIIN`: UInt = 14u;
public const val `MM_IBM_PCMCIA_MIDIOUT`: UInt = 15u;
public const val `MM_IBM_PCMCIA_SYNTH`: UInt = 13u;
public const val `MM_IBM_PCMCIA_WAVEIN`: UInt = 11u;
public const val `MM_IBM_PCMCIA_WAVEOUT`: UInt = 12u;
public const val `MM_IBM_THINKPAD200`: UInt = 17u;
public const val `MM_IBM_WC_MIDIOUT`: UInt = 30u;
public const val `MM_IBM_WC_MIXEROUT`: UInt = 33u;
public const val `MM_IBM_WC_WAVEOUT`: UInt = 31u;
public const val `MM_ICCC`: UInt = 259u;
public const val `MM_ICCC_UNA3_AUX`: UInt = 3u;
public const val `MM_ICCC_UNA3_MIXER`: UInt = 4u;
public const val `MM_ICCC_UNA3_WAVEIN`: UInt = 1u;
public const val `MM_ICCC_UNA3_WAVEOUT`: UInt = 2u;
public const val `MM_ICE`: UInt = 239u;
public const val `MM_ICE_AUX`: UInt = 11u;
public const val `MM_ICE_MIDIIN1`: UInt = 6u;
public const val `MM_ICE_MIDIIN2`: UInt = 8u;
public const val `MM_ICE_MIDIOUT1`: UInt = 5u;
public const val `MM_ICE_MIDIOUT2`: UInt = 7u;
public const val `MM_ICE_MIXER`: UInt = 10u;
public const val `MM_ICE_MTWAVEIN`: UInt = 4u;
public const val `MM_ICE_MTWAVEOUT`: UInt = 3u;
public const val `MM_ICE_SYNTH`: UInt = 9u;
public const val `MM_ICE_WAVEIN`: UInt = 2u;
public const val `MM_ICE_WAVEOUT`: UInt = 1u;
public const val `MM_ICL_PS`: UInt = 32u;
public const val `MM_ICOM_AUX`: UInt = 6u;
public const val `MM_ICOM_LINE`: UInt = 7u;
public const val `MM_ICOM_MIXER`: UInt = 5u;
public const val `MM_ICOM_WAVEIN`: UInt = 3u;
public const val `MM_ICOM_WAVEOUT`: UInt = 4u;
public const val `MM_ICS`: UInt = 57u;
public const val `MM_ICS_2115_LITE_MIDIOUT`: UInt = 13u;
public const val `MM_ICS_2120_LITE_MIDIOUT`: UInt = 14u;
public const val `MM_ICS_WAVEDECK_AUX`: UInt = 4u;
public const val `MM_ICS_WAVEDECK_MIXER`: UInt = 3u;
public const val `MM_ICS_WAVEDECK_SYNTH`: UInt = 5u;
public const val `MM_ICS_WAVEDECK_WAVEIN`: UInt = 2u;
public const val `MM_ICS_WAVEDECK_WAVEOUT`: UInt = 1u;
public const val `MM_ICS_WAVEDEC_SB_AUX`: UInt = 12u;
public const val `MM_ICS_WAVEDEC_SB_FM_MIDIOUT`: UInt = 8u;
public const val `MM_ICS_WAVEDEC_SB_MIXER`: UInt = 11u;
public const val `MM_ICS_WAVEDEC_SB_MPU401_MIDIIN`: UInt = 10u;
public const val `MM_ICS_WAVEDEC_SB_MPU401_MIDIOUT`: UInt = 9u;
public const val `MM_ICS_WAVEDEC_SB_WAVEIN`: UInt = 7u;
public const val `MM_ICS_WAVEDEC_SB_WAVEOUT`: UInt = 6u;
public const val `MM_INSOFT`: UInt = 94u;
public const val `MM_INTEL`: UInt = 33u;
public const val `MM_INTELOPD_AUX`: UInt = 401u;
public const val `MM_INTELOPD_WAVEIN`: UInt = 1u;
public const val `MM_INTELOPD_WAVEOUT`: UInt = 101u;
public const val `MM_INTEL_NSPMODEMLINEIN`: UInt = 501u;
public const val `MM_INTEL_NSPMODEMLINEOUT`: UInt = 502u;
public const val `MM_INTERACTIVE`: UInt = 36u;
public const val `MM_INTERACTIVE_WAVEIN`: UInt = 69u;
public const val `MM_INTERACTIVE_WAVEOUT`: UInt = 69u;
public const val `MM_INTERNET`: UInt = 244u;
public const val `MM_INTERNET_SSW_MIDIIN`: UInt = 11u;
public const val `MM_INTERNET_SSW_MIDIOUT`: UInt = 10u;
public const val `MM_INTERNET_SSW_WAVEIN`: UInt = 13u;
public const val `MM_INTERNET_SSW_WAVEOUT`: UInt = 12u;
public const val `MM_INVISION`: UInt = 188u;
public const val `MM_IODD`: UInt = 258u;
public const val `MM_IOMAGIC`: UInt = 82u;
public const val `MM_IOMAGIC_TEMPO_AUXOUT`: UInt = 6u;
public const val `MM_IOMAGIC_TEMPO_MIDIOUT`: UInt = 4u;
public const val `MM_IOMAGIC_TEMPO_MXDOUT`: UInt = 5u;
public const val `MM_IOMAGIC_TEMPO_SYNTH`: UInt = 3u;
public const val `MM_IOMAGIC_TEMPO_WAVEIN`: UInt = 2u;
public const val `MM_IOMAGIC_TEMPO_WAVEOUT`: UInt = 1u;
public const val `MM_IPI`: UInt = 238u;
public const val `MM_IPI_ACM_HSX`: UInt = 1u;
public const val `MM_IPI_ACM_RPELP`: UInt = 2u;
public const val `MM_IPI_AT_MIXER`: UInt = 6u;
public const val `MM_IPI_AT_WAVEIN`: UInt = 5u;
public const val `MM_IPI_AT_WAVEOUT`: UInt = 4u;
public const val `MM_IPI_WF_ASSS`: UInt = 3u;
public const val `MM_ISOLUTION`: UInt = 106u;
public const val `MM_ISOLUTION_PASCAL`: UInt = 1u;
public const val `MM_ITERATEDSYS`: UInt = 58u;
public const val `MM_ITERATEDSYS_FUFCODEC`: UInt = 1u;
public const val `MM_I_LINK`: UInt = 233u;
public const val `MM_I_LINK_VOICE_CODER`: UInt = 1u;
public const val `MM_KAY_ELEMETRICS`: UInt = 131u;
public const val `MM_KAY_ELEMETRICS_CSL`: UInt = 17152u;
public const val `MM_KAY_ELEMETRICS_CSL_4CHANNEL`: UInt = 17161u;
public const val `MM_KAY_ELEMETRICS_CSL_DAT`: UInt = 17160u;
public const val `MM_KORG`: UInt = 55u;
public const val `MM_KORG_1212IO_MSWAVEIN`: UInt = 3u;
public const val `MM_KORG_1212IO_MSWAVEOUT`: UInt = 4u;
public const val `MM_KORG_PCIF_MIDIIN`: UInt = 2u;
public const val `MM_KORG_PCIF_MIDIOUT`: UInt = 1u;
public const val `MM_LERNOUT_ANDHAUSPIE_LHCODECACM`: UInt = 1u;
public const val `MM_LERNOUT_AND_HAUSPIE`: UInt = 97u;
public const val `MM_LEXICON`: UInt = 236u;
public const val `MM_LEXICON_STUDIO_WAVE_IN`: UInt = 2u;
public const val `MM_LEXICON_STUDIO_WAVE_OUT`: UInt = 1u;
public const val `MM_LOGITECH`: UInt = 60u;
public const val `MM_LUCENT`: UInt = 184u;
public const val `MM_LUCENT_ACM_G723`: UInt = 0u;
public const val `MM_LUCID`: UInt = 221u;
public const val `MM_LUCID_PCI24WAVEIN`: UInt = 1u;
public const val `MM_LUCID_PCI24WAVEOUT`: UInt = 2u;
public const val `MM_LUMINOSITI`: UInt = 224u;
public const val `MM_LUMINOSITI_SCWAVEIN`: UInt = 1u;
public const val `MM_LUMINOSITI_SCWAVEMIX`: UInt = 3u;
public const val `MM_LUMINOSITI_SCWAVEOUT`: UInt = 2u;
public const val `MM_LYNX`: UInt = 212u;
public const val `MM_LYRRUS`: UInt = 88u;
public const val `MM_LYRRUS_BRIDGE_GUITAR`: UInt = 1u;
public const val `MM_MALDEN`: UInt = 261u;
public const val `MM_MARIAN`: UInt = 190u;
public const val `MM_MARIAN_ARC44WAVEIN`: UInt = 1u;
public const val `MM_MARIAN_ARC44WAVEOUT`: UInt = 2u;
public const val `MM_MARIAN_ARC88WAVEIN`: UInt = 5u;
public const val `MM_MARIAN_ARC88WAVEOUT`: UInt = 6u;
public const val `MM_MARIAN_PRODIF24WAVEIN`: UInt = 3u;
public const val `MM_MARIAN_PRODIF24WAVEOUT`: UInt = 4u;
public const val `MM_MATROX_DIV`: UInt = 254u;
public const val `MM_MATSUSHITA`: UInt = 83u;
public const val `MM_MATSUSHITA_AUX`: UInt = 5u;
public const val `MM_MATSUSHITA_FMSYNTH_STEREO`: UInt = 3u;
public const val `MM_MATSUSHITA_MIXER`: UInt = 4u;
public const val `MM_MATSUSHITA_WAVEIN`: UInt = 1u;
public const val `MM_MATSUSHITA_WAVEOUT`: UInt = 2u;
public const val `MM_MEDIASONIC`: UInt = 71u;
public const val `MM_MEDIASONIC_ACM_G723`: UInt = 1u;
public const val `MM_MEDIASONIC_ICOM`: UInt = 2u;
public const val `MM_MEDIATRIX`: UInt = 141u;
public const val `MM_MEDIAVISION`: UInt = 3u;
public const val `MM_MEDIAVISION_CDPC`: UInt = 112u;
public const val `MM_MEDIAVISION_OPUS1208`: UInt = 128u;
public const val `MM_MEDIAVISION_OPUS1216`: UInt = 144u;
public const val `MM_MEDIAVISION_PROAUDIO`: UInt = 16u;
public const val `MM_MEDIAVISION_PROAUDIO_16`: UInt = 96u;
public const val `MM_MEDIAVISION_PROAUDIO_PLUS`: UInt = 80u;
public const val `MM_MEDIAVISION_PROSTUDIO_16`: UInt = 96u;
public const val `MM_MEDIAVISION_THUNDER`: UInt = 32u;
public const val `MM_MEDIAVISION_TPORT`: UInt = 64u;
public const val `MM_MELABS`: UInt = 44u;
public const val `MM_MELABS_MIDI2GO`: UInt = 1u;
public const val `MM_MERGING_MPEGL3`: UInt = 1u;
public const val `MM_MERGING_TECHNOLOGIES`: UInt = 177u;
public const val `MM_METHEUS`: UInt = 59u;
public const val `MM_METHEUS_ZIPPER`: UInt = 1u;
public const val `MM_MICRONAS`: UInt = 251u;
public const val `MM_MICRONAS_CLP833`: UInt = 2u;
public const val `MM_MICRONAS_SC4`: UInt = 1u;
public const val `MM_MINDMAKER`: UInt = 263u;
public const val `MM_MINDMAKER_GC_MIXER`: UInt = 3u;
public const val `MM_MINDMAKER_GC_WAVEIN`: UInt = 1u;
public const val `MM_MINDMAKER_GC_WAVEOUT`: UInt = 2u;
public const val `MM_MIRO`: UInt = 104u;
public const val `MM_MIRO_DC30_MIX`: UInt = 7u;
public const val `MM_MIRO_DC30_WAVEIN`: UInt = 6u;
public const val `MM_MIRO_DC30_WAVEOUT`: UInt = 5u;
public const val `MM_MIRO_MOVIEPRO`: UInt = 1u;
public const val `MM_MIRO_VIDEOD1`: UInt = 2u;
public const val `MM_MIRO_VIDEODC1TV`: UInt = 3u;
public const val `MM_MIRO_VIDEOTD`: UInt = 4u;
public const val `MM_MITEL`: UInt = 16u;
public const val `MM_MITEL_MEDIAPATH_WAVEIN`: UInt = 301u;
public const val `MM_MITEL_MEDIAPATH_WAVEOUT`: UInt = 300u;
public const val `MM_MITEL_MPA_HANDSET_WAVEIN`: UInt = 201u;
public const val `MM_MITEL_MPA_HANDSET_WAVEOUT`: UInt = 200u;
public const val `MM_MITEL_MPA_HANDSFREE_WAVEIN`: UInt = 203u;
public const val `MM_MITEL_MPA_HANDSFREE_WAVEOUT`: UInt = 202u;
public const val `MM_MITEL_MPA_LINE1_WAVEIN`: UInt = 205u;
public const val `MM_MITEL_MPA_LINE1_WAVEOUT`: UInt = 204u;
public const val `MM_MITEL_MPA_LINE2_WAVEIN`: UInt = 207u;
public const val `MM_MITEL_MPA_LINE2_WAVEOUT`: UInt = 206u;
public const val `MM_MITEL_TALKTO_BRIDGED_WAVEIN`: UInt = 105u;
public const val `MM_MITEL_TALKTO_BRIDGED_WAVEOUT`: UInt = 104u;
public const val `MM_MITEL_TALKTO_HANDSET_WAVEIN`: UInt = 103u;
public const val `MM_MITEL_TALKTO_HANDSET_WAVEOUT`: UInt = 102u;
public const val `MM_MITEL_TALKTO_LINE_WAVEIN`: UInt = 101u;
public const val `MM_MITEL_TALKTO_LINE_WAVEOUT`: UInt = 100u;
public const val `MM_MMOTION_WAVEAUX`: UInt = 1u;
public const val `MM_MMOTION_WAVEIN`: UInt = 3u;
public const val `MM_MMOTION_WAVEOUT`: UInt = 2u;
public const val `MM_MOSCOM`: UInt = 68u;
public const val `MM_MOSCOM_VPC2400_IN`: UInt = 1u;
public const val `MM_MOSCOM_VPC2400_OUT`: UInt = 2u;
public const val `MM_MOTIONPIXELS`: UInt = 193u;
public const val `MM_MOTIONPIXELS_MVI2`: UInt = 1u;
public const val `MM_MOTOROLA`: UInt = 48u;
public const val `MM_MOTU`: UInt = 101u;
public const val `MM_MOTU_DTX_MIDI_IN_A`: UInt = 801u;
public const val `MM_MOTU_DTX_MIDI_IN_B`: UInt = 802u;
public const val `MM_MOTU_DTX_MIDI_IN_SYNC`: UInt = 800u;
public const val `MM_MOTU_DTX_MIDI_OUT_A`: UInt = 801u;
public const val `MM_MOTU_DTX_MIDI_OUT_B`: UInt = 802u;
public const val `MM_MOTU_FLYER_MIDI_IN_A`: UInt = 601u;
public const val `MM_MOTU_FLYER_MIDI_IN_B`: UInt = 602u;
public const val `MM_MOTU_FLYER_MIDI_IN_SYNC`: UInt = 600u;
public const val `MM_MOTU_FLYER_MIDI_OUT_A`: UInt = 601u;
public const val `MM_MOTU_FLYER_MIDI_OUT_B`: UInt = 602u;
public const val `MM_MOTU_MTPAV_MIDIIN_1`: UInt = 901u;
public const val `MM_MOTU_MTPAV_MIDIIN_2`: UInt = 902u;
public const val `MM_MOTU_MTPAV_MIDIIN_3`: UInt = 903u;
public const val `MM_MOTU_MTPAV_MIDIIN_4`: UInt = 904u;
public const val `MM_MOTU_MTPAV_MIDIIN_5`: UInt = 905u;
public const val `MM_MOTU_MTPAV_MIDIIN_6`: UInt = 906u;
public const val `MM_MOTU_MTPAV_MIDIIN_7`: UInt = 907u;
public const val `MM_MOTU_MTPAV_MIDIIN_8`: UInt = 908u;
public const val `MM_MOTU_MTPAV_MIDIIN_ADAT`: UInt = 917u;
public const val `MM_MOTU_MTPAV_MIDIIN_SYNC`: UInt = 900u;
public const val `MM_MOTU_MTPAV_MIDIOUT_1`: UInt = 901u;
public const val `MM_MOTU_MTPAV_MIDIOUT_2`: UInt = 902u;
public const val `MM_MOTU_MTPAV_MIDIOUT_3`: UInt = 903u;
public const val `MM_MOTU_MTPAV_MIDIOUT_4`: UInt = 904u;
public const val `MM_MOTU_MTPAV_MIDIOUT_5`: UInt = 905u;
public const val `MM_MOTU_MTPAV_MIDIOUT_6`: UInt = 906u;
public const val `MM_MOTU_MTPAV_MIDIOUT_7`: UInt = 907u;
public const val `MM_MOTU_MTPAV_MIDIOUT_8`: UInt = 908u;
public const val `MM_MOTU_MTPAV_MIDIOUT_ADAT`: UInt = 917u;
public const val `MM_MOTU_MTPAV_MIDIOUT_ALL`: UInt = 900u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_1`: UInt = 909u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_2`: UInt = 910u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_3`: UInt = 911u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_4`: UInt = 912u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_5`: UInt = 913u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_6`: UInt = 914u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_7`: UInt = 915u;
public const val `MM_MOTU_MTPAV_NET_MIDIIN_8`: UInt = 916u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_1`: UInt = 909u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_2`: UInt = 910u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_3`: UInt = 911u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_4`: UInt = 912u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_5`: UInt = 913u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_6`: UInt = 914u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_7`: UInt = 915u;
public const val `MM_MOTU_MTPAV_NET_MIDIOUT_8`: UInt = 916u;
public const val `MM_MOTU_MTPII_MIDIIN_1`: UInt = 201u;
public const val `MM_MOTU_MTPII_MIDIIN_2`: UInt = 202u;
public const val `MM_MOTU_MTPII_MIDIIN_3`: UInt = 203u;
public const val `MM_MOTU_MTPII_MIDIIN_4`: UInt = 204u;
public const val `MM_MOTU_MTPII_MIDIIN_5`: UInt = 205u;
public const val `MM_MOTU_MTPII_MIDIIN_6`: UInt = 206u;
public const val `MM_MOTU_MTPII_MIDIIN_7`: UInt = 207u;
public const val `MM_MOTU_MTPII_MIDIIN_8`: UInt = 208u;
public const val `MM_MOTU_MTPII_MIDIIN_SYNC`: UInt = 200u;
public const val `MM_MOTU_MTPII_MIDIOUT_1`: UInt = 201u;
public const val `MM_MOTU_MTPII_MIDIOUT_2`: UInt = 202u;
public const val `MM_MOTU_MTPII_MIDIOUT_3`: UInt = 203u;
public const val `MM_MOTU_MTPII_MIDIOUT_4`: UInt = 204u;
public const val `MM_MOTU_MTPII_MIDIOUT_5`: UInt = 205u;
public const val `MM_MOTU_MTPII_MIDIOUT_6`: UInt = 206u;
public const val `MM_MOTU_MTPII_MIDIOUT_7`: UInt = 207u;
public const val `MM_MOTU_MTPII_MIDIOUT_8`: UInt = 208u;
public const val `MM_MOTU_MTPII_MIDIOUT_ALL`: UInt = 200u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_1`: UInt = 209u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_2`: UInt = 210u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_3`: UInt = 211u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_4`: UInt = 212u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_5`: UInt = 213u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_6`: UInt = 214u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_7`: UInt = 215u;
public const val `MM_MOTU_MTPII_NET_MIDIIN_8`: UInt = 216u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_1`: UInt = 209u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_2`: UInt = 210u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_3`: UInt = 211u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_4`: UInt = 212u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_5`: UInt = 213u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_6`: UInt = 214u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_7`: UInt = 215u;
public const val `MM_MOTU_MTPII_NET_MIDIOUT_8`: UInt = 216u;
public const val `MM_MOTU_MTP_MIDIIN_1`: UInt = 101u;
public const val `MM_MOTU_MTP_MIDIIN_2`: UInt = 102u;
public const val `MM_MOTU_MTP_MIDIIN_3`: UInt = 103u;
public const val `MM_MOTU_MTP_MIDIIN_4`: UInt = 104u;
public const val `MM_MOTU_MTP_MIDIIN_5`: UInt = 105u;
public const val `MM_MOTU_MTP_MIDIIN_6`: UInt = 106u;
public const val `MM_MOTU_MTP_MIDIIN_7`: UInt = 107u;
public const val `MM_MOTU_MTP_MIDIIN_8`: UInt = 108u;
public const val `MM_MOTU_MTP_MIDIOUT_1`: UInt = 101u;
public const val `MM_MOTU_MTP_MIDIOUT_2`: UInt = 102u;
public const val `MM_MOTU_MTP_MIDIOUT_3`: UInt = 103u;
public const val `MM_MOTU_MTP_MIDIOUT_4`: UInt = 104u;
public const val `MM_MOTU_MTP_MIDIOUT_5`: UInt = 105u;
public const val `MM_MOTU_MTP_MIDIOUT_6`: UInt = 106u;
public const val `MM_MOTU_MTP_MIDIOUT_7`: UInt = 107u;
public const val `MM_MOTU_MTP_MIDIOUT_8`: UInt = 108u;
public const val `MM_MOTU_MTP_MIDIOUT_ALL`: UInt = 100u;
public const val `MM_MOTU_MXN_MIDIIN_1`: UInt = 501u;
public const val `MM_MOTU_MXN_MIDIIN_2`: UInt = 502u;
public const val `MM_MOTU_MXN_MIDIIN_3`: UInt = 503u;
public const val `MM_MOTU_MXN_MIDIIN_4`: UInt = 504u;
public const val `MM_MOTU_MXN_MIDIIN_SYNC`: UInt = 500u;
public const val `MM_MOTU_MXN_MIDIOUT_1`: UInt = 501u;
public const val `MM_MOTU_MXN_MIDIOUT_2`: UInt = 502u;
public const val `MM_MOTU_MXN_MIDIOUT_3`: UInt = 503u;
public const val `MM_MOTU_MXN_MIDIOUT_4`: UInt = 504u;
public const val `MM_MOTU_MXN_MIDIOUT_ALL`: UInt = 500u;
public const val `MM_MOTU_MXPMPU_MIDIIN_1`: UInt = 401u;
public const val `MM_MOTU_MXPMPU_MIDIIN_2`: UInt = 402u;
public const val `MM_MOTU_MXPMPU_MIDIIN_3`: UInt = 403u;
public const val `MM_MOTU_MXPMPU_MIDIIN_4`: UInt = 404u;
public const val `MM_MOTU_MXPMPU_MIDIIN_5`: UInt = 405u;
public const val `MM_MOTU_MXPMPU_MIDIIN_6`: UInt = 406u;
public const val `MM_MOTU_MXPMPU_MIDIIN_SYNC`: UInt = 400u;
public const val `MM_MOTU_MXPMPU_MIDIOUT_1`: UInt = 401u;
public const val `MM_MOTU_MXPMPU_MIDIOUT_2`: UInt = 402u;
public const val `MM_MOTU_MXPMPU_MIDIOUT_3`: UInt = 403u;
public const val `MM_MOTU_MXPMPU_MIDIOUT_4`: UInt = 404u;
public const val `MM_MOTU_MXPMPU_MIDIOUT_5`: UInt = 405u;
public const val `MM_MOTU_MXPMPU_MIDIOUT_6`: UInt = 406u;
public const val `MM_MOTU_MXPMPU_MIDIOUT_ALL`: UInt = 400u;
public const val `MM_MOTU_MXPXT_MIDIIN_1`: UInt = 1001u;
public const val `MM_MOTU_MXPXT_MIDIIN_2`: UInt = 1002u;
public const val `MM_MOTU_MXPXT_MIDIIN_3`: UInt = 1003u;
public const val `MM_MOTU_MXPXT_MIDIIN_4`: UInt = 1004u;
public const val `MM_MOTU_MXPXT_MIDIIN_5`: UInt = 1005u;
public const val `MM_MOTU_MXPXT_MIDIIN_6`: UInt = 1006u;
public const val `MM_MOTU_MXPXT_MIDIIN_7`: UInt = 1007u;
public const val `MM_MOTU_MXPXT_MIDIIN_8`: UInt = 1008u;
public const val `MM_MOTU_MXPXT_MIDIIN_SYNC`: UInt = 1000u;
public const val `MM_MOTU_MXPXT_MIDIOUT_1`: UInt = 1001u;
public const val `MM_MOTU_MXPXT_MIDIOUT_2`: UInt = 1002u;
public const val `MM_MOTU_MXPXT_MIDIOUT_3`: UInt = 1003u;
public const val `MM_MOTU_MXPXT_MIDIOUT_4`: UInt = 1004u;
public const val `MM_MOTU_MXPXT_MIDIOUT_5`: UInt = 1005u;
public const val `MM_MOTU_MXPXT_MIDIOUT_6`: UInt = 1006u;
public const val `MM_MOTU_MXPXT_MIDIOUT_7`: UInt = 1007u;
public const val `MM_MOTU_MXPXT_MIDIOUT_8`: UInt = 1008u;
public const val `MM_MOTU_MXPXT_MIDIOUT_ALL`: UInt = 1000u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIIN_1`: UInt = 301u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIIN_2`: UInt = 302u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIIN_3`: UInt = 303u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIIN_4`: UInt = 304u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIIN_5`: UInt = 305u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIIN_6`: UInt = 306u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIOUT_1`: UInt = 301u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIOUT_2`: UInt = 302u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIOUT_3`: UInt = 303u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIOUT_4`: UInt = 304u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIOUT_5`: UInt = 305u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIOUT_6`: UInt = 306u;
public const val `MM_MOTU_MXP_MIDIIN_MIDIOUT_ALL`: UInt = 300u;
public const val `MM_MOTU_MXP_MIDIIN_SYNC`: UInt = 300u;
public const val `MM_MOTU_PKX_MIDI_IN_A`: UInt = 701u;
public const val `MM_MOTU_PKX_MIDI_IN_B`: UInt = 702u;
public const val `MM_MOTU_PKX_MIDI_IN_SYNC`: UInt = 700u;
public const val `MM_MOTU_PKX_MIDI_OUT_A`: UInt = 701u;
public const val `MM_MOTU_PKX_MIDI_OUT_B`: UInt = 702u;
public const val `MM_MPTUS`: UInt = 95u;
public const val `MM_MPTUS_SPWAVEOUT`: UInt = 1u;
public const val `MM_MSFT_ACM_G711`: UInt = 37u;
public const val `MM_MSFT_ACM_GSM610`: UInt = 36u;
public const val `MM_MSFT_ACM_IMAADPCM`: UInt = 34u;
public const val `MM_MSFT_ACM_MSADPCM`: UInt = 33u;
public const val `MM_MSFT_ACM_MSAUDIO1`: UInt = 39u;
public const val `MM_MSFT_ACM_MSFILTER`: UInt = 35u;
public const val `MM_MSFT_ACM_MSG723`: UInt = 92u;
public const val `MM_MSFT_ACM_MSNAUDIO`: UInt = 91u;
public const val `MM_MSFT_ACM_MSRT24`: UInt = 93u;
public const val `MM_MSFT_ACM_PCM`: UInt = 38u;
public const val `MM_MSFT_ACM_WMAUDIO`: UInt = 39u;
public const val `MM_MSFT_ACM_WMAUDIO2`: UInt = 101u;
public const val `MM_MSFT_GENERIC_AUX_CD`: UInt = 30u;
public const val `MM_MSFT_GENERIC_AUX_LINE`: UInt = 28u;
public const val `MM_MSFT_GENERIC_AUX_MIC`: UInt = 29u;
public const val `MM_MSFT_GENERIC_MIDIIN`: UInt = 25u;
public const val `MM_MSFT_GENERIC_MIDIOUT`: UInt = 26u;
public const val `MM_MSFT_GENERIC_MIDISYNTH`: UInt = 27u;
public const val `MM_MSFT_GENERIC_WAVEIN`: UInt = 23u;
public const val `MM_MSFT_GENERIC_WAVEOUT`: UInt = 24u;
public const val `MM_MSFT_MSACM`: UInt = 32u;
public const val `MM_MSFT_MSOPL_SYNTH`: UInt = 76u;
public const val `MM_MSFT_SB16_AUX_CD`: UInt = 66u;
public const val `MM_MSFT_SB16_AUX_LINE`: UInt = 65u;
public const val `MM_MSFT_SB16_MIDIIN`: UInt = 62u;
public const val `MM_MSFT_SB16_MIDIOUT`: UInt = 63u;
public const val `MM_MSFT_SB16_MIXER`: UInt = 67u;
public const val `MM_MSFT_SB16_SYNTH`: UInt = 64u;
public const val `MM_MSFT_SB16_WAVEIN`: UInt = 60u;
public const val `MM_MSFT_SB16_WAVEOUT`: UInt = 61u;
public const val `MM_MSFT_SBPRO_AUX_CD`: UInt = 74u;
public const val `MM_MSFT_SBPRO_AUX_LINE`: UInt = 73u;
public const val `MM_MSFT_SBPRO_MIDIIN`: UInt = 70u;
public const val `MM_MSFT_SBPRO_MIDIOUT`: UInt = 71u;
public const val `MM_MSFT_SBPRO_MIXER`: UInt = 75u;
public const val `MM_MSFT_SBPRO_SYNTH`: UInt = 72u;
public const val `MM_MSFT_SBPRO_WAVEIN`: UInt = 68u;
public const val `MM_MSFT_SBPRO_WAVEOUT`: UInt = 69u;
public const val `MM_MSFT_VMDMS_HANDSET_WAVEIN`: UInt = 82u;
public const val `MM_MSFT_VMDMS_HANDSET_WAVEOUT`: UInt = 83u;
public const val `MM_MSFT_VMDMS_LINE_WAVEIN`: UInt = 80u;
public const val `MM_MSFT_VMDMS_LINE_WAVEOUT`: UInt = 81u;
public const val `MM_MSFT_VMDMW_HANDSET_WAVEIN`: UInt = 86u;
public const val `MM_MSFT_VMDMW_HANDSET_WAVEOUT`: UInt = 87u;
public const val `MM_MSFT_VMDMW_LINE_WAVEIN`: UInt = 84u;
public const val `MM_MSFT_VMDMW_LINE_WAVEOUT`: UInt = 85u;
public const val `MM_MSFT_VMDMW_MIXER`: UInt = 88u;
public const val `MM_MSFT_VMDM_GAME_WAVEIN`: UInt = 90u;
public const val `MM_MSFT_VMDM_GAME_WAVEOUT`: UInt = 89u;
public const val `MM_MSFT_WDMAUDIO_AUX`: UInt = 105u;
public const val `MM_MSFT_WDMAUDIO_MIDIIN`: UInt = 103u;
public const val `MM_MSFT_WDMAUDIO_MIDIOUT`: UInt = 102u;
public const val `MM_MSFT_WDMAUDIO_MIXER`: UInt = 104u;
public const val `MM_MSFT_WDMAUDIO_WAVEIN`: UInt = 101u;
public const val `MM_MSFT_WDMAUDIO_WAVEOUT`: UInt = 100u;
public const val `MM_MSFT_WSS_AUX`: UInt = 21u;
public const val `MM_MSFT_WSS_FMSYNTH_STEREO`: UInt = 16u;
public const val `MM_MSFT_WSS_MIXER`: UInt = 17u;
public const val `MM_MSFT_WSS_NT_AUX`: UInt = 59u;
public const val `MM_MSFT_WSS_NT_FMSYNTH_STEREO`: UInt = 57u;
public const val `MM_MSFT_WSS_NT_MIXER`: UInt = 58u;
public const val `MM_MSFT_WSS_NT_WAVEIN`: UInt = 55u;
public const val `MM_MSFT_WSS_NT_WAVEOUT`: UInt = 56u;
public const val `MM_MSFT_WSS_OEM_AUX`: UInt = 22u;
public const val `MM_MSFT_WSS_OEM_FMSYNTH_STEREO`: UInt = 20u;
public const val `MM_MSFT_WSS_OEM_MIXER`: UInt = 31u;
public const val `MM_MSFT_WSS_OEM_WAVEIN`: UInt = 18u;
public const val `MM_MSFT_WSS_OEM_WAVEOUT`: UInt = 19u;
public const val `MM_MSFT_WSS_WAVEIN`: UInt = 14u;
public const val `MM_MSFT_WSS_WAVEOUT`: UInt = 15u;
public const val `MM_MWM`: UInt = 209u;
public const val `MM_NCR`: UInt = 62u;
public const val `MM_NCR_BA_AUX`: UInt = 4u;
public const val `MM_NCR_BA_MIXER`: UInt = 5u;
public const val `MM_NCR_BA_SYNTH`: UInt = 3u;
public const val `MM_NCR_BA_WAVEIN`: UInt = 1u;
public const val `MM_NCR_BA_WAVEOUT`: UInt = 2u;
public const val `MM_NEC`: UInt = 26u;
public const val `MM_NEC_26_SYNTH`: UInt = 9u;
public const val `MM_NEC_73_86_SYNTH`: UInt = 5u;
public const val `MM_NEC_73_86_WAVEIN`: UInt = 7u;
public const val `MM_NEC_73_86_WAVEOUT`: UInt = 6u;
public const val `MM_NEC_JOYSTICK`: UInt = 12u;
public const val `MM_NEC_MPU401_MIDIIN`: UInt = 11u;
public const val `MM_NEC_MPU401_MIDIOUT`: UInt = 10u;
public const val `MM_NEOMAGIC`: UInt = 176u;
public const val `MM_NEOMAGIC_AUX`: UInt = 6u;
public const val `MM_NEOMAGIC_MIDIIN`: UInt = 5u;
public const val `MM_NEOMAGIC_MIDIOUT`: UInt = 4u;
public const val `MM_NEOMAGIC_MW3DX_AUX`: UInt = 17u;
public const val `MM_NEOMAGIC_MW3DX_FMSYNTH`: UInt = 14u;
public const val `MM_NEOMAGIC_MW3DX_GMSYNTH`: UInt = 15u;
public const val `MM_NEOMAGIC_MW3DX_MIDIIN`: UInt = 13u;
public const val `MM_NEOMAGIC_MW3DX_MIDIOUT`: UInt = 12u;
public const val `MM_NEOMAGIC_MW3DX_MIXER`: UInt = 16u;
public const val `MM_NEOMAGIC_MW3DX_WAVEIN`: UInt = 11u;
public const val `MM_NEOMAGIC_MW3DX_WAVEOUT`: UInt = 10u;
public const val `MM_NEOMAGIC_MWAVE_AUX`: UInt = 25u;
public const val `MM_NEOMAGIC_MWAVE_MIDIIN`: UInt = 23u;
public const val `MM_NEOMAGIC_MWAVE_MIDIOUT`: UInt = 22u;
public const val `MM_NEOMAGIC_MWAVE_MIXER`: UInt = 24u;
public const val `MM_NEOMAGIC_MWAVE_WAVEIN`: UInt = 21u;
public const val `MM_NEOMAGIC_MWAVE_WAVEOUT`: UInt = 20u;
public const val `MM_NEOMAGIC_SYNTH`: UInt = 1u;
public const val `MM_NEOMAGIC_WAVEIN`: UInt = 3u;
public const val `MM_NEOMAGIC_WAVEOUT`: UInt = 2u;
public const val `MM_NETSCAPE`: UInt = 166u;
public const val `MM_NETXL`: UInt = 8u;
public const val `MM_NETXL_XLVIDEO`: UInt = 1u;
public const val `MM_NEWMEDIA`: UInt = 86u;
public const val `MM_NEWMEDIA_WAVJAMMER`: UInt = 1u;
public const val `MM_NMP`: UInt = 195u;
public const val `MM_NMP_ACM_AMR`: UInt = 10u;
public const val `MM_NMP_CCP_WAVEIN`: UInt = 1u;
public const val `MM_NMP_CCP_WAVEOUT`: UInt = 2u;
public const val `MM_NMS`: UInt = 87u;
public const val `MM_NOGATECH`: UInt = 75u;
public const val `MM_NORRIS`: UInt = 150u;
public const val `MM_NORRIS_VOICELINK`: UInt = 1u;
public const val `MM_NORTEL_MPXAC_WAVEIN`: UInt = 1u;
public const val `MM_NORTEL_MPXAC_WAVEOUT`: UInt = 2u;
public const val `MM_NORTHERN_TELECOM`: UInt = 115u;
public const val `MM_NVIDIA`: UInt = 127u;
public const val `MM_NVIDIA_AUX`: UInt = 7u;
public const val `MM_NVIDIA_GAMEPORT`: UInt = 5u;
public const val `MM_NVIDIA_MIDIIN`: UInt = 4u;
public const val `MM_NVIDIA_MIDIOUT`: UInt = 3u;
public const val `MM_NVIDIA_MIXER`: UInt = 6u;
public const val `MM_NVIDIA_WAVEIN`: UInt = 2u;
public const val `MM_NVIDIA_WAVEOUT`: UInt = 1u;
public const val `MM_OKI`: UInt = 79u;
public const val `MM_OKSORI`: UInt = 128u;
public const val `MM_OKSORI_BASE`: UInt = 0u;
public const val `MM_OKSORI_EXT_MIC1`: UInt = 15u;
public const val `MM_OKSORI_EXT_MIC2`: UInt = 16u;
public const val `MM_OKSORI_FM_OPL4`: UInt = 5u;
public const val `MM_OKSORI_MIDIIN`: UInt = 18u;
public const val `MM_OKSORI_MIDIOUT`: UInt = 17u;
public const val `MM_OKSORI_MIX_AUX1`: UInt = 13u;
public const val `MM_OKSORI_MIX_CD`: UInt = 10u;
public const val `MM_OKSORI_MIX_ECHO`: UInt = 12u;
public const val `MM_OKSORI_MIX_FM`: UInt = 8u;
public const val `MM_OKSORI_MIX_LINE`: UInt = 9u;
public const val `MM_OKSORI_MIX_LINE1`: UInt = 14u;
public const val `MM_OKSORI_MIX_MASTER`: UInt = 6u;
public const val `MM_OKSORI_MIX_MIC`: UInt = 11u;
public const val `MM_OKSORI_MIX_WAVE`: UInt = 7u;
public const val `MM_OKSORI_MPEG_CDVISION`: UInt = 19u;
public const val `MM_OKSORI_OSR16_WAVEIN`: UInt = 4u;
public const val `MM_OKSORI_OSR16_WAVEOUT`: UInt = 3u;
public const val `MM_OKSORI_OSR8_WAVEIN`: UInt = 2u;
public const val `MM_OKSORI_OSR8_WAVEOUT`: UInt = 1u;
public const val `MM_OLIVETTI`: UInt = 81u;
public const val `MM_OLIVETTI_ACM_ADPCM`: UInt = 10u;
public const val `MM_OLIVETTI_ACM_CELP`: UInt = 11u;
public const val `MM_OLIVETTI_ACM_GSM`: UInt = 9u;
public const val `MM_OLIVETTI_ACM_OPR`: UInt = 13u;
public const val `MM_OLIVETTI_ACM_SBC`: UInt = 12u;
public const val `MM_OLIVETTI_AUX`: UInt = 4u;
public const val `MM_OLIVETTI_JOYSTICK`: UInt = 8u;
public const val `MM_OLIVETTI_MIDIIN`: UInt = 5u;
public const val `MM_OLIVETTI_MIDIOUT`: UInt = 6u;
public const val `MM_OLIVETTI_MIXER`: UInt = 3u;
public const val `MM_OLIVETTI_SYNTH`: UInt = 7u;
public const val `MM_OLIVETTI_WAVEIN`: UInt = 1u;
public const val `MM_OLIVETTI_WAVEOUT`: UInt = 2u;
public const val `MM_ONLIVE`: UInt = 200u;
public const val `MM_ONLIVE_MPCODEC`: UInt = 1u;
public const val `MM_OPCODE`: UInt = 113u;
public const val `MM_OPTI`: UInt = 90u;
public const val `MM_OPTI_M16_AUX`: UInt = 7u;
public const val `MM_OPTI_M16_FMSYNTH_STEREO`: UInt = 1u;
public const val `MM_OPTI_M16_MIDIIN`: UInt = 2u;
public const val `MM_OPTI_M16_MIDIOUT`: UInt = 3u;
public const val `MM_OPTI_M16_MIXER`: UInt = 6u;
public const val `MM_OPTI_M16_WAVEIN`: UInt = 4u;
public const val `MM_OPTI_M16_WAVEOUT`: UInt = 5u;
public const val `MM_OPTI_M32_AUX`: UInt = 38u;
public const val `MM_OPTI_M32_MIDIIN`: UInt = 34u;
public const val `MM_OPTI_M32_MIDIOUT`: UInt = 35u;
public const val `MM_OPTI_M32_MIXER`: UInt = 37u;
public const val `MM_OPTI_M32_SYNTH_STEREO`: UInt = 36u;
public const val `MM_OPTI_M32_WAVEIN`: UInt = 32u;
public const val `MM_OPTI_M32_WAVEOUT`: UInt = 33u;
public const val `MM_OPTI_P16_AUX`: UInt = 22u;
public const val `MM_OPTI_P16_FMSYNTH_STEREO`: UInt = 16u;
public const val `MM_OPTI_P16_MIDIIN`: UInt = 17u;
public const val `MM_OPTI_P16_MIDIOUT`: UInt = 18u;
public const val `MM_OPTI_P16_MIXER`: UInt = 21u;
public const val `MM_OPTI_P16_WAVEIN`: UInt = 19u;
public const val `MM_OPTI_P16_WAVEOUT`: UInt = 20u;
public const val `MM_OPUS1208_AUX`: UInt = 135u;
public const val `MM_OPUS1208_MIXER`: UInt = 134u;
public const val `MM_OPUS1208_SYNTH`: UInt = 131u;
public const val `MM_OPUS1208_WAVEIN`: UInt = 133u;
public const val `MM_OPUS1208_WAVEOUT`: UInt = 132u;
public const val `MM_OPUS1216_AUX`: UInt = 151u;
public const val `MM_OPUS1216_MIDIIN`: UInt = 146u;
public const val `MM_OPUS1216_MIDIOUT`: UInt = 145u;
public const val `MM_OPUS1216_MIXER`: UInt = 150u;
public const val `MM_OPUS1216_SYNTH`: UInt = 147u;
public const val `MM_OPUS1216_WAVEIN`: UInt = 149u;
public const val `MM_OPUS1216_WAVEOUT`: UInt = 148u;
public const val `MM_OPUS401_MIDIIN`: UInt = 130u;
public const val `MM_OPUS401_MIDIOUT`: UInt = 129u;
public const val `MM_OSITECH`: UInt = 103u;
public const val `MM_OSITECH_TRUMPCARD`: UInt = 1u;
public const val `MM_OSPREY`: UInt = 140u;
public const val `MM_OSPREY_1000WAVEIN`: UInt = 1u;
public const val `MM_OSPREY_1000WAVEOUT`: UInt = 2u;
public const val `MM_OTI`: UInt = 180u;
public const val `MM_OTI_611MIDIN`: UInt = 18u;
public const val `MM_OTI_611MIDIOUT`: UInt = 19u;
public const val `MM_OTI_611MIXER`: UInt = 7u;
public const val `MM_OTI_611WAVEIN`: UInt = 5u;
public const val `MM_OTI_611WAVEOUT`: UInt = 6u;
public const val `MM_PACIFICRESEARCH`: UInt = 210u;
public const val `MM_PCSPEAKER_WAVEOUT`: UInt = 13u;
public const val `MM_PHILIPS_ACM_LPCBB`: UInt = 1u;
public const val `MM_PHILIPS_SPEECH_PROCESSING`: UInt = 7u;
public const val `MM_PHONET`: UInt = 203u;
public const val `MM_PHONET_PP_MIXER`: UInt = 3u;
public const val `MM_PHONET_PP_WAVEIN`: UInt = 2u;
public const val `MM_PHONET_PP_WAVEOUT`: UInt = 1u;
public const val `MM_PICTURETEL`: UInt = 138u;
public const val `MM_PID_UNMAPPED`: UInt = 65535u;
public const val `MM_PINNACLE`: UInt = 218u;
public const val `MM_PRAGMATRAX`: UInt = 5u;
public const val `MM_PRECEPT`: UInt = 153u;
public const val `MM_PROAUD_16_AUX`: UInt = 103u;
public const val `MM_PROAUD_16_MIDIIN`: UInt = 98u;
public const val `MM_PROAUD_16_MIDIOUT`: UInt = 97u;
public const val `MM_PROAUD_16_MIXER`: UInt = 102u;
public const val `MM_PROAUD_16_SYNTH`: UInt = 99u;
public const val `MM_PROAUD_16_WAVEIN`: UInt = 101u;
public const val `MM_PROAUD_16_WAVEOUT`: UInt = 100u;
public const val `MM_PROAUD_AUX`: UInt = 23u;
public const val `MM_PROAUD_MIDIIN`: UInt = 18u;
public const val `MM_PROAUD_MIDIOUT`: UInt = 17u;
public const val `MM_PROAUD_MIXER`: UInt = 22u;
public const val `MM_PROAUD_PLUS_AUX`: UInt = 87u;
public const val `MM_PROAUD_PLUS_MIDIIN`: UInt = 82u;
public const val `MM_PROAUD_PLUS_MIDIOUT`: UInt = 81u;
public const val `MM_PROAUD_PLUS_MIXER`: UInt = 86u;
public const val `MM_PROAUD_PLUS_SYNTH`: UInt = 83u;
public const val `MM_PROAUD_PLUS_WAVEIN`: UInt = 85u;
public const val `MM_PROAUD_PLUS_WAVEOUT`: UInt = 84u;
public const val `MM_PROAUD_SYNTH`: UInt = 19u;
public const val `MM_PROAUD_WAVEIN`: UInt = 21u;
public const val `MM_PROAUD_WAVEOUT`: UInt = 20u;
public const val `MM_QCIAR`: UInt = 98u;
public const val `MM_QDESIGN`: UInt = 194u;
public const val `MM_QDESIGN_ACM_MPEG`: UInt = 1u;
public const val `MM_QDESIGN_ACM_QDESIGN_MUSIC`: UInt = 2u;
public const val `MM_QTEAM`: UInt = 169u;
public const val `MM_QUALCOMM`: UInt = 215u;
public const val `MM_QUANTUM3D`: UInt = 17u;
public const val `MM_QUARTERDECK`: UInt = 134u;
public const val `MM_QUARTERDECK_LHWAVEIN`: UInt = 0u;
public const val `MM_QUARTERDECK_LHWAVEOUT`: UInt = 1u;
public const val `MM_QUICKAUDIO`: UInt = 255u;
public const val `MM_QUICKAUDIO_MAXIMIDI`: UInt = 2u;
public const val `MM_QUICKAUDIO_MINIMIDI`: UInt = 1u;
public const val `MM_QUICKNET`: UInt = 173u;
public const val `MM_QUICKNET_PJWAVEIN`: UInt = 1u;
public const val `MM_QUICKNET_PJWAVEOUT`: UInt = 2u;
public const val `MM_RADIUS`: UInt = 110u;
public const val `MM_RHETOREX`: UInt = 120u;
public const val `MM_RHETOREX_WAVEIN`: UInt = 1u;
public const val `MM_RHETOREX_WAVEOUT`: UInt = 2u;
public const val `MM_RICHMOND`: UInt = 257u;
public const val `MM_ROCKWELL`: UInt = 111u;
public const val `MM_ROLAND`: UInt = 24u;
public const val `MM_ROLAND_MPU401_MIDIIN`: UInt = 16u;
public const val `MM_ROLAND_MPU401_MIDIOUT`: UInt = 15u;
public const val `MM_ROLAND_RAP10_MIDIIN`: UInt = 11u;
public const val `MM_ROLAND_RAP10_MIDIOUT`: UInt = 10u;
public const val `MM_ROLAND_RAP10_SYNTH`: UInt = 12u;
public const val `MM_ROLAND_RAP10_WAVEIN`: UInt = 14u;
public const val `MM_ROLAND_RAP10_WAVEOUT`: UInt = 13u;
public const val `MM_ROLAND_SC7_MIDIIN`: UInt = 22u;
public const val `MM_ROLAND_SC7_MIDIOUT`: UInt = 21u;
public const val `MM_ROLAND_SCP_AUX`: UInt = 48u;
public const val `MM_ROLAND_SCP_MIDIIN`: UInt = 39u;
public const val `MM_ROLAND_SCP_MIDIOUT`: UInt = 38u;
public const val `MM_ROLAND_SCP_MIXER`: UInt = 42u;
public const val `MM_ROLAND_SCP_WAVEIN`: UInt = 41u;
public const val `MM_ROLAND_SCP_WAVEOUT`: UInt = 40u;
public const val `MM_ROLAND_SERIAL_MIDIIN`: UInt = 24u;
public const val `MM_ROLAND_SERIAL_MIDIOUT`: UInt = 23u;
public const val `MM_ROLAND_SMPU_MIDIINA`: UInt = 19u;
public const val `MM_ROLAND_SMPU_MIDIINB`: UInt = 20u;
public const val `MM_ROLAND_SMPU_MIDIOUTA`: UInt = 17u;
public const val `MM_ROLAND_SMPU_MIDIOUTB`: UInt = 18u;
public const val `MM_RZS`: UInt = 216u;
public const val `MM_RZS_ACM_TUBGSM`: UInt = 1u;
public const val `MM_S3`: UInt = 164u;
public const val `MM_S3_AUX`: UInt = 7u;
public const val `MM_S3_FMSYNTH`: UInt = 5u;
public const val `MM_S3_MIDIIN`: UInt = 4u;
public const val `MM_S3_MIDIOUT`: UInt = 3u;
public const val `MM_S3_MIXER`: UInt = 6u;
public const val `MM_S3_WAVEIN`: UInt = 2u;
public const val `MM_S3_WAVEOUT`: UInt = 1u;
public const val `MM_SANYO`: UInt = 72u;
public const val `MM_SANYO_ACM_LD_ADPCM`: UInt = 1u;
public const val `MM_SCALACS`: UInt = 54u;
public const val `MM_SEERSYS`: UInt = 137u;
public const val `MM_SEERSYS_REALITY`: UInt = 6u;
public const val `MM_SEERSYS_SEERMIX`: UInt = 3u;
public const val `MM_SEERSYS_SEERSYNTH`: UInt = 1u;
public const val `MM_SEERSYS_SEERWAVE`: UInt = 2u;
public const val `MM_SEERSYS_WAVESYNTH`: UInt = 4u;
public const val `MM_SEERSYS_WAVESYNTH_WG`: UInt = 5u;
public const val `MM_SELSIUS_SYSTEMS`: UInt = 234u;
public const val `MM_SELSIUS_SYSTEMS_RTPWAVEIN`: UInt = 2u;
public const val `MM_SELSIUS_SYSTEMS_RTPWAVEOUT`: UInt = 1u;
public const val `MM_SGI`: UInt = 237u;
public const val `MM_SGI_320_MIXER`: UInt = 3u;
public const val `MM_SGI_320_WAVEIN`: UInt = 1u;
public const val `MM_SGI_320_WAVEOUT`: UInt = 2u;
public const val `MM_SGI_540_MIXER`: UInt = 6u;
public const val `MM_SGI_540_WAVEIN`: UInt = 4u;
public const val `MM_SGI_540_WAVEOUT`: UInt = 5u;
public const val `MM_SGI_RAD_ADAT8CHAN_WAVEIN`: UInt = 19u;
public const val `MM_SGI_RAD_ADAT8CHAN_WAVEOUT`: UInt = 32u;
public const val `MM_SGI_RAD_ADATMONO1_WAVEIN`: UInt = 7u;
public const val `MM_SGI_RAD_ADATMONO1_WAVEOUT`: UInt = 20u;
public const val `MM_SGI_RAD_ADATMONO2_WAVEIN`: UInt = 8u;
public const val `MM_SGI_RAD_ADATMONO2_WAVEOUT`: UInt = 21u;
public const val `MM_SGI_RAD_ADATMONO3_WAVEIN`: UInt = 9u;
public const val `MM_SGI_RAD_ADATMONO3_WAVEOUT`: UInt = 22u;
public const val `MM_SGI_RAD_ADATMONO4_WAVEIN`: UInt = 10u;
public const val `MM_SGI_RAD_ADATMONO4_WAVEOUT`: UInt = 23u;
public const val `MM_SGI_RAD_ADATMONO5_WAVEIN`: UInt = 11u;
public const val `MM_SGI_RAD_ADATMONO5_WAVEOUT`: UInt = 24u;
public const val `MM_SGI_RAD_ADATMONO6_WAVEIN`: UInt = 12u;
public const val `MM_SGI_RAD_ADATMONO6_WAVEOUT`: UInt = 25u;
public const val `MM_SGI_RAD_ADATMONO7_WAVEIN`: UInt = 13u;
public const val `MM_SGI_RAD_ADATMONO7_WAVEOUT`: UInt = 26u;
public const val `MM_SGI_RAD_ADATMONO8_WAVEIN`: UInt = 14u;
public const val `MM_SGI_RAD_ADATMONO8_WAVEOUT`: UInt = 27u;
public const val `MM_SGI_RAD_ADATSTEREO12_WAVEIN`: UInt = 15u;
public const val `MM_SGI_RAD_ADATSTEREO12_WAVEOUT`: UInt = 28u;
public const val `MM_SGI_RAD_ADATSTEREO32_WAVEOUT`: UInt = 29u;
public const val `MM_SGI_RAD_ADATSTEREO34_WAVEIN`: UInt = 16u;
public const val `MM_SGI_RAD_ADATSTEREO56_WAVEIN`: UInt = 17u;
public const val `MM_SGI_RAD_ADATSTEREO56_WAVEOUT`: UInt = 30u;
public const val `MM_SGI_RAD_ADATSTEREO78_WAVEIN`: UInt = 18u;
public const val `MM_SGI_RAD_ADATSTEREO78_WAVEOUT`: UInt = 31u;
public const val `MM_SGI_RAD_AESMONO1_WAVEIN`: UInt = 33u;
public const val `MM_SGI_RAD_AESMONO1_WAVEOUT`: UInt = 36u;
public const val `MM_SGI_RAD_AESMONO2_WAVEIN`: UInt = 34u;
public const val `MM_SGI_RAD_AESMONO2_WAVEOUT`: UInt = 37u;
public const val `MM_SGI_RAD_AESSTEREO_WAVEIN`: UInt = 35u;
public const val `MM_SGI_RAD_AESSTEREO_WAVEOUT`: UInt = 38u;
public const val `MM_SHARP`: UInt = 183u;
public const val `MM_SHARP_MDC_AUX`: UInt = 6u;
public const val `MM_SHARP_MDC_AUX_BASS`: UInt = 101u;
public const val `MM_SHARP_MDC_AUX_CHR`: UInt = 109u;
public const val `MM_SHARP_MDC_AUX_MASTER`: UInt = 100u;
public const val `MM_SHARP_MDC_AUX_MIDI_VOL`: UInt = 103u;
public const val `MM_SHARP_MDC_AUX_RVB`: UInt = 108u;
public const val `MM_SHARP_MDC_AUX_TREBLE`: UInt = 102u;
public const val `MM_SHARP_MDC_AUX_VOL`: UInt = 107u;
public const val `MM_SHARP_MDC_AUX_WAVE_CHR`: UInt = 106u;
public const val `MM_SHARP_MDC_AUX_WAVE_RVB`: UInt = 105u;
public const val `MM_SHARP_MDC_AUX_WAVE_VOL`: UInt = 104u;
public const val `MM_SHARP_MDC_MIDI_IN`: UInt = 2u;
public const val `MM_SHARP_MDC_MIDI_OUT`: UInt = 3u;
public const val `MM_SHARP_MDC_MIDI_SYNTH`: UInt = 1u;
public const val `MM_SHARP_MDC_MIXER`: UInt = 10u;
public const val `MM_SHARP_MDC_WAVE_IN`: UInt = 4u;
public const val `MM_SHARP_MDC_WAVE_OUT`: UInt = 5u;
public const val `MM_SICRESOURCE`: UInt = 175u;
public const val `MM_SICRESOURCE_SSO3D`: UInt = 2u;
public const val `MM_SICRESOURCE_SSOW3DI`: UInt = 3u;
public const val `MM_SIEMENS_SBC`: UInt = 201u;
public const val `MM_SIERRA`: UInt = 40u;
public const val `MM_SIERRA_ARIA_AUX`: UInt = 25u;
public const val `MM_SIERRA_ARIA_AUX2`: UInt = 32u;
public const val `MM_SIERRA_ARIA_MIDIIN`: UInt = 21u;
public const val `MM_SIERRA_ARIA_MIDIOUT`: UInt = 20u;
public const val `MM_SIERRA_ARIA_SYNTH`: UInt = 22u;
public const val `MM_SIERRA_ARIA_WAVEIN`: UInt = 24u;
public const val `MM_SIERRA_ARIA_WAVEOUT`: UInt = 23u;
public const val `MM_SIERRA_QUARTET_AUX_CD`: UInt = 85u;
public const val `MM_SIERRA_QUARTET_AUX_LINE`: UInt = 86u;
public const val `MM_SIERRA_QUARTET_AUX_MODEM`: UInt = 87u;
public const val `MM_SIERRA_QUARTET_MIDIIN`: UInt = 82u;
public const val `MM_SIERRA_QUARTET_MIDIOUT`: UInt = 83u;
public const val `MM_SIERRA_QUARTET_MIXER`: UInt = 88u;
public const val `MM_SIERRA_QUARTET_SYNTH`: UInt = 84u;
public const val `MM_SIERRA_QUARTET_WAVEIN`: UInt = 80u;
public const val `MM_SIERRA_QUARTET_WAVEOUT`: UInt = 81u;
public const val `MM_SILICONSOFT`: UInt = 69u;
public const val `MM_SILICONSOFT_SC1_WAVEIN`: UInt = 1u;
public const val `MM_SILICONSOFT_SC1_WAVEOUT`: UInt = 2u;
public const val `MM_SILICONSOFT_SC2_WAVEIN`: UInt = 3u;
public const val `MM_SILICONSOFT_SC2_WAVEOUT`: UInt = 4u;
public const val `MM_SILICONSOFT_SOUNDJR2PR_WAVEIN`: UInt = 6u;
public const val `MM_SILICONSOFT_SOUNDJR2PR_WAVEOUT`: UInt = 7u;
public const val `MM_SILICONSOFT_SOUNDJR2_WAVEOUT`: UInt = 5u;
public const val `MM_SILICONSOFT_SOUNDJR3_WAVEOUT`: UInt = 8u;
public const val `MM_SIPROLAB`: UInt = 211u;
public const val `MM_SIPROLAB_ACELPNET`: UInt = 1u;
public const val `MM_SNI`: UInt = 18u;
public const val `MM_SNI_ACM_G721`: UInt = 1u;
public const val `MM_SOFTLAB_NSK`: UInt = 228u;
public const val `MM_SOFTLAB_NSK_FRW_AUX`: UInt = 4u;
public const val `MM_SOFTLAB_NSK_FRW_MIXER`: UInt = 3u;
public const val `MM_SOFTLAB_NSK_FRW_WAVEIN`: UInt = 1u;
public const val `MM_SOFTLAB_NSK_FRW_WAVEOUT`: UInt = 2u;
public const val `MM_SOFTSOUND`: UInt = 149u;
public const val `MM_SOFTSOUND_CODEC`: UInt = 1u;
public const val `MM_SONICFOUNDRY`: UInt = 66u;
public const val `MM_SONORUS`: UInt = 230u;
public const val `MM_SONORUS_STUDIO`: UInt = 1u;
public const val `MM_SONY`: UInt = 245u;
public const val `MM_SONY_ACM_SCX`: UInt = 1u;
public const val `MM_SORVIS`: UInt = 187u;
public const val `MM_SOUNDESIGNS`: UInt = 142u;
public const val `MM_SOUNDESIGNS_WAVEIN`: UInt = 1u;
public const val `MM_SOUNDESIGNS_WAVEOUT`: UInt = 2u;
public const val `MM_SOUNDSCAPE_AUX`: UInt = 24u;
public const val `MM_SOUNDSCAPE_MIDIIN`: UInt = 21u;
public const val `MM_SOUNDSCAPE_MIDIOUT`: UInt = 20u;
public const val `MM_SOUNDSCAPE_MIXER`: UInt = 23u;
public const val `MM_SOUNDSCAPE_SYNTH`: UInt = 22u;
public const val `MM_SOUNDSCAPE_WAVEIN`: UInt = 19u;
public const val `MM_SOUNDSCAPE_WAVEOUT`: UInt = 17u;
public const val `MM_SOUNDSCAPE_WAVEOUT_AUX`: UInt = 18u;
public const val `MM_SOUNDSPACE`: UInt = 167u;
public const val `MM_SPECTRUM_PRODUCTIONS`: UInt = 213u;
public const val `MM_SPECTRUM_SIGNAL_PROCESSING`: UInt = 144u;
public const val `MM_SPEECHCOMP`: UInt = 76u;
public const val `MM_SPLASH_STUDIOS`: UInt = 133u;
public const val `MM_SSP_SNDFESAUX`: UInt = 7u;
public const val `MM_SSP_SNDFESMIDIIN`: UInt = 3u;
public const val `MM_SSP_SNDFESMIDIOUT`: UInt = 4u;
public const val `MM_SSP_SNDFESMIX`: UInt = 6u;
public const val `MM_SSP_SNDFESSYNTH`: UInt = 5u;
public const val `MM_SSP_SNDFESWAVEIN`: UInt = 1u;
public const val `MM_SSP_SNDFESWAVEOUT`: UInt = 2u;
public const val `MM_STUDER`: UInt = 171u;
public const val `MM_STUDIO_16_AUX`: UInt = 103u;
public const val `MM_STUDIO_16_MIDIIN`: UInt = 98u;
public const val `MM_STUDIO_16_MIDIOUT`: UInt = 97u;
public const val `MM_STUDIO_16_MIXER`: UInt = 102u;
public const val `MM_STUDIO_16_SYNTH`: UInt = 99u;
public const val `MM_STUDIO_16_WAVEIN`: UInt = 101u;
public const val `MM_STUDIO_16_WAVEOUT`: UInt = 100u;
public const val `MM_ST_MICROELECTRONICS`: UInt = 265u;
public const val `MM_SUNCOM`: UInt = 186u;
public const val `MM_SUPERMAC`: UInt = 73u;
public const val `MM_SYDEC_NV`: UInt = 248u;
public const val `MM_SYDEC_NV_WAVEIN`: UInt = 1u;
public const val `MM_SYDEC_NV_WAVEOUT`: UInt = 2u;
public const val `MM_TANDY`: UInt = 29u;
public const val `MM_TANDY_PSSJWAVEIN`: UInt = 9u;
public const val `MM_TANDY_PSSJWAVEOUT`: UInt = 10u;
public const val `MM_TANDY_SENS_MMAMIDIIN`: UInt = 6u;
public const val `MM_TANDY_SENS_MMAMIDIOUT`: UInt = 7u;
public const val `MM_TANDY_SENS_MMAWAVEIN`: UInt = 4u;
public const val `MM_TANDY_SENS_MMAWAVEOUT`: UInt = 5u;
public const val `MM_TANDY_SENS_VISWAVEOUT`: UInt = 8u;
public const val `MM_TANDY_VISBIOSSYNTH`: UInt = 3u;
public const val `MM_TANDY_VISWAVEIN`: UInt = 1u;
public const val `MM_TANDY_VISWAVEOUT`: UInt = 2u;
public const val `MM_TBS_TROPEZ_AUX1`: UInt = 39u;
public const val `MM_TBS_TROPEZ_AUX2`: UInt = 40u;
public const val `MM_TBS_TROPEZ_LINE`: UInt = 41u;
public const val `MM_TBS_TROPEZ_WAVEIN`: UInt = 37u;
public const val `MM_TBS_TROPEZ_WAVEOUT`: UInt = 38u;
public const val `MM_TDK`: UInt = 135u;
public const val `MM_TDK_MW_AUX`: UInt = 6u;
public const val `MM_TDK_MW_AUX_BASS`: UInt = 101u;
public const val `MM_TDK_MW_AUX_CHR`: UInt = 109u;
public const val `MM_TDK_MW_AUX_MASTER`: UInt = 100u;
public const val `MM_TDK_MW_AUX_MIDI_VOL`: UInt = 103u;
public const val `MM_TDK_MW_AUX_RVB`: UInt = 108u;
public const val `MM_TDK_MW_AUX_TREBLE`: UInt = 102u;
public const val `MM_TDK_MW_AUX_VOL`: UInt = 107u;
public const val `MM_TDK_MW_AUX_WAVE_CHR`: UInt = 106u;
public const val `MM_TDK_MW_AUX_WAVE_RVB`: UInt = 105u;
public const val `MM_TDK_MW_AUX_WAVE_VOL`: UInt = 104u;
public const val `MM_TDK_MW_MIDI_IN`: UInt = 2u;
public const val `MM_TDK_MW_MIDI_OUT`: UInt = 3u;
public const val `MM_TDK_MW_MIDI_SYNTH`: UInt = 1u;
public const val `MM_TDK_MW_MIXER`: UInt = 10u;
public const val `MM_TDK_MW_WAVE_IN`: UInt = 4u;
public const val `MM_TDK_MW_WAVE_OUT`: UInt = 5u;
public const val `MM_TELEKOL`: UInt = 264u;
public const val `MM_TELEKOL_WAVEIN`: UInt = 2u;
public const val `MM_TELEKOL_WAVEOUT`: UInt = 1u;
public const val `MM_TERALOGIC`: UInt = 202u;
public const val `MM_TERRATEC`: UInt = 70u;
public const val `MM_THUNDER_AUX`: UInt = 39u;
public const val `MM_THUNDER_SYNTH`: UInt = 35u;
public const val `MM_THUNDER_WAVEIN`: UInt = 37u;
public const val `MM_THUNDER_WAVEOUT`: UInt = 36u;
public const val `MM_TPORT_SYNTH`: UInt = 67u;
public const val `MM_TPORT_WAVEIN`: UInt = 66u;
public const val `MM_TPORT_WAVEOUT`: UInt = 65u;
public const val `MM_TRUEVISION`: UInt = 51u;
public const val `MM_TRUEVISION_WAVEIN1`: UInt = 1u;
public const val `MM_TRUEVISION_WAVEOUT1`: UInt = 2u;
public const val `MM_TTEWS_AUX`: UInt = 9u;
public const val `MM_TTEWS_MIDIIN`: UInt = 3u;
public const val `MM_TTEWS_MIDIMONITOR`: UInt = 6u;
public const val `MM_TTEWS_MIDIOUT`: UInt = 4u;
public const val `MM_TTEWS_MIDISYNTH`: UInt = 5u;
public const val `MM_TTEWS_MIXER`: UInt = 10u;
public const val `MM_TTEWS_VMIDIIN`: UInt = 7u;
public const val `MM_TTEWS_VMIDIOUT`: UInt = 8u;
public const val `MM_TTEWS_WAVEIN`: UInt = 1u;
public const val `MM_TTEWS_WAVEOUT`: UInt = 2u;
public const val `MM_TURTLE_BEACH`: UInt = 21u;
public const val `MM_UHER_INFORMATIC`: UInt = 247u;
public const val `MM_UH_ACM_ADPCM`: UInt = 1u;
public const val `MM_UNISYS`: UInt = 223u;
public const val `MM_UNISYS_ACM_NAP`: UInt = 1u;
public const val `MM_UNMAPPED`: UInt = 65535u;
public const val `MM_VAL`: UInt = 35u;
public const val `MM_VAL_MICROKEY_AP_WAVEIN`: UInt = 1u;
public const val `MM_VAL_MICROKEY_AP_WAVEOUT`: UInt = 2u;
public const val `MM_VANKOEVERING`: UInt = 168u;
public const val `MM_VIA`: UInt = 250u;
public const val `MM_VIA_AUX`: UInt = 4u;
public const val `MM_VIA_MIXER`: UInt = 3u;
public const val `MM_VIA_MPU401_MIDIIN`: UInt = 6u;
public const val `MM_VIA_MPU401_MIDIOUT`: UInt = 5u;
public const val `MM_VIA_SWFM_SYNTH`: UInt = 7u;
public const val `MM_VIA_WAVEIN`: UInt = 2u;
public const val `MM_VIA_WAVEOUT`: UInt = 1u;
public const val `MM_VIA_WDM_MIXER`: UInt = 10u;
public const val `MM_VIA_WDM_MPU401_MIDIIN`: UInt = 12u;
public const val `MM_VIA_WDM_MPU401_MIDIOUT`: UInt = 11u;
public const val `MM_VIA_WDM_WAVEIN`: UInt = 9u;
public const val `MM_VIA_WDM_WAVEOUT`: UInt = 8u;
public const val `MM_VIDEOLOGIC`: UInt = 53u;
public const val `MM_VIDEOLOGIC_MSWAVEIN`: UInt = 1u;
public const val `MM_VIDEOLOGIC_MSWAVEOUT`: UInt = 2u;
public const val `MM_VIENNASYS`: UInt = 157u;
public const val `MM_VIENNASYS_TSP_WAVE_DRIVER`: UInt = 1u;
public const val `MM_VIONA`: UInt = 161u;
public const val `MM_VIONAQVINPCI_WAVEOUT`: UInt = 3u;
public const val `MM_VIONA_BUSTER_MIXER`: UInt = 4u;
public const val `MM_VIONA_CINEMASTER_MIXER`: UInt = 5u;
public const val `MM_VIONA_CONCERTO_MIXER`: UInt = 6u;
public const val `MM_VIONA_QVINPCI_MIXER`: UInt = 1u;
public const val `MM_VIONA_QVINPCI_WAVEIN`: UInt = 2u;
public const val `MM_VIRTUALMUSIC`: UInt = 205u;
public const val `MM_VITEC`: UInt = 67u;
public const val `MM_VITEC_VMAKER`: UInt = 1u;
public const val `MM_VITEC_VMPRO`: UInt = 2u;
public const val `MM_VIVO`: UInt = 182u;
public const val `MM_VIVO_AUDIO_CODEC`: UInt = 1u;
public const val `MM_VKC_MPU401_MIDIIN`: UInt = 256u;
public const val `MM_VKC_MPU401_MIDIOUT`: UInt = 512u;
public const val `MM_VKC_SERIAL_MIDIIN`: UInt = 257u;
public const val `MM_VKC_SERIAL_MIDIOUT`: UInt = 513u;
public const val `MM_VOCALTEC`: UInt = 23u;
public const val `MM_VOCALTEC_WAVEIN`: UInt = 2u;
public const val `MM_VOCALTEC_WAVEOUT`: UInt = 1u;
public const val `MM_VOICEINFO`: UInt = 156u;
public const val `MM_VOICEMIXER`: UInt = 1u;
public const val `MM_VOXWARE`: UInt = 114u;
public const val `MM_VOXWARE_CODEC`: UInt = 1u;
public const val `MM_VOYETRA`: UInt = 30u;
public const val `MM_VQST`: UInt = 240u;
public const val `MM_VQST_VQC1`: UInt = 1u;
public const val `MM_VQST_VQC2`: UInt = 2u;
public const val `MM_VTG`: UInt = 109u;
public const val `MM_WANGLABS`: UInt = 28u;
public const val `MM_WANGLABS_WAVEIN1`: UInt = 1u;
public const val `MM_WANGLABS_WAVEOUT1`: UInt = 2u;
public const val `MM_WEITEK`: UInt = 96u;
public const val `MM_WILDCAT`: UInt = 119u;
public const val `MM_WILDCAT_AUTOSCOREMIDIIN`: UInt = 1u;
public const val `MM_WILLOPOND_SNDCOMM_WAVEIN`: UInt = 108u;
public const val `MM_WILLOWPOND`: UInt = 65u;
public const val `MM_WILLOWPOND_FMSYNTH_STEREO`: UInt = 20u;
public const val `MM_WILLOWPOND_GENERIC_AUX`: UInt = 115u;
public const val `MM_WILLOWPOND_GENERIC_MIXER`: UInt = 114u;
public const val `MM_WILLOWPOND_GENERIC_WAVEIN`: UInt = 112u;
public const val `MM_WILLOWPOND_GENERIC_WAVEOUT`: UInt = 113u;
public const val `MM_WILLOWPOND_MPU401`: UInt = 21u;
public const val `MM_WILLOWPOND_PH_AUX`: UInt = 107u;
public const val `MM_WILLOWPOND_PH_MIXER`: UInt = 106u;
public const val `MM_WILLOWPOND_PH_WAVEIN`: UInt = 104u;
public const val `MM_WILLOWPOND_PH_WAVEOUT`: UInt = 105u;
public const val `MM_WILLOWPOND_SNDCOMM_AUX`: UInt = 111u;
public const val `MM_WILLOWPOND_SNDCOMM_MIXER`: UInt = 110u;
public const val `MM_WILLOWPOND_SNDCOMM_WAVEOUT`: UInt = 109u;
public const val `MM_WILLOWPOND_SNDPORT_AUX`: UInt = 103u;
public const val `MM_WILLOWPOND_SNDPORT_MIXER`: UInt = 102u;
public const val `MM_WILLOWPOND_SNDPORT_WAVEIN`: UInt = 100u;
public const val `MM_WILLOWPOND_SNDPORT_WAVEOUT`: UInt = 101u;
public const val `MM_WINBOND`: UInt = 204u;
public const val `MM_WINNOV`: UInt = 61u;
public const val `MM_WINNOV_CAVIAR_CHAMPAGNE`: UInt = 4u;
public const val `MM_WINNOV_CAVIAR_VIDC`: UInt = 3u;
public const val `MM_WINNOV_CAVIAR_WAVEIN`: UInt = 1u;
public const val `MM_WINNOV_CAVIAR_WAVEOUT`: UInt = 2u;
public const val `MM_WINNOV_CAVIAR_YUV8`: UInt = 5u;
public const val `MM_WORKBIT`: UInt = 102u;
public const val `MM_WORKBIT_AUX`: UInt = 7u;
public const val `MM_WORKBIT_FMSYNTH`: UInt = 6u;
public const val `MM_WORKBIT_JOYSTICK`: UInt = 8u;
public const val `MM_WORKBIT_MIDIIN`: UInt = 4u;
public const val `MM_WORKBIT_MIDIOUT`: UInt = 5u;
public const val `MM_WORKBIT_MIXER`: UInt = 1u;
public const val `MM_WORKBIT_WAVEIN`: UInt = 3u;
public const val `MM_WORKBIT_WAVEOUT`: UInt = 2u;
public const val `MM_WSS_SB16_AUX_CD`: UInt = 45u;
public const val `MM_WSS_SB16_AUX_LINE`: UInt = 44u;
public const val `MM_WSS_SB16_MIDIIN`: UInt = 41u;
public const val `MM_WSS_SB16_MIDIOUT`: UInt = 42u;
public const val `MM_WSS_SB16_MIXER`: UInt = 46u;
public const val `MM_WSS_SB16_SYNTH`: UInt = 43u;
public const val `MM_WSS_SB16_WAVEIN`: UInt = 39u;
public const val `MM_WSS_SB16_WAVEOUT`: UInt = 40u;
public const val `MM_WSS_SBPRO_AUX_CD`: UInt = 53u;
public const val `MM_WSS_SBPRO_AUX_LINE`: UInt = 52u;
public const val `MM_WSS_SBPRO_MIDIIN`: UInt = 49u;
public const val `MM_WSS_SBPRO_MIDIOUT`: UInt = 50u;
public const val `MM_WSS_SBPRO_MIXER`: UInt = 54u;
public const val `MM_WSS_SBPRO_SYNTH`: UInt = 51u;
public const val `MM_WSS_SBPRO_WAVEIN`: UInt = 47u;
public const val `MM_WSS_SBPRO_WAVEOUT`: UInt = 48u;
public const val `MM_XEBEC`: UInt = 85u;
public const val `MM_XIRLINK`: UInt = 178u;
public const val `MM_XIRLINK_VISIONLINK`: UInt = 1u;
public const val `MM_XYZ`: UInt = 112u;
public const val `MM_YAMAHA`: UInt = 37u;
public const val `MM_YAMAHA_ACXG_AUX`: UInt = 41u;
public const val `MM_YAMAHA_ACXG_MIDIOUT`: UInt = 39u;
public const val `MM_YAMAHA_ACXG_MIXER`: UInt = 40u;
public const val `MM_YAMAHA_ACXG_WAVEIN`: UInt = 37u;
public const val `MM_YAMAHA_ACXG_WAVEOUT`: UInt = 38u;
public const val `MM_YAMAHA_GSS_AUX`: UInt = 6u;
public const val `MM_YAMAHA_GSS_MIDIIN`: UInt = 5u;
public const val `MM_YAMAHA_GSS_MIDIOUT`: UInt = 4u;
public const val `MM_YAMAHA_GSS_SYNTH`: UInt = 1u;
public const val `MM_YAMAHA_GSS_WAVEIN`: UInt = 3u;
public const val `MM_YAMAHA_GSS_WAVEOUT`: UInt = 2u;
public const val `MM_YAMAHA_OPL3SA_FMSYNTH`: UInt = 18u;
public const val `MM_YAMAHA_OPL3SA_JOYSTICK`: UInt = 24u;
public const val `MM_YAMAHA_OPL3SA_MIDIIN`: UInt = 21u;
public const val `MM_YAMAHA_OPL3SA_MIDIOUT`: UInt = 20u;
public const val `MM_YAMAHA_OPL3SA_MIXER`: UInt = 23u;
public const val `MM_YAMAHA_OPL3SA_WAVEIN`: UInt = 17u;
public const val `MM_YAMAHA_OPL3SA_WAVEOUT`: UInt = 16u;
public const val `MM_YAMAHA_OPL3SA_YSYNTH`: UInt = 19u;
public const val `MM_YAMAHA_SERIAL_MIDIIN`: UInt = 8u;
public const val `MM_YAMAHA_SERIAL_MIDIOUT`: UInt = 7u;
public const val `MM_YAMAHA_SXG_MIDIOUT`: UInt = 34u;
public const val `MM_YAMAHA_SXG_MIXER`: UInt = 36u;
public const val `MM_YAMAHA_SXG_WAVEOUT`: UInt = 35u;
public const val `MM_YAMAHA_YMF724LEG_FMSYNTH`: UInt = 32u;
public const val `MM_YAMAHA_YMF724LEG_MIDIIN`: UInt = 26u;
public const val `MM_YAMAHA_YMF724LEG_MIDIOUT`: UInt = 25u;
public const val `MM_YAMAHA_YMF724LEG_MIXER`: UInt = 33u;
public const val `MM_YAMAHA_YMF724_AUX`: UInt = 30u;
public const val `MM_YAMAHA_YMF724_MIDIOUT`: UInt = 29u;
public const val `MM_YAMAHA_YMF724_MIXER`: UInt = 31u;
public const val `MM_YAMAHA_YMF724_WAVEIN`: UInt = 28u;
public const val `MM_YAMAHA_YMF724_WAVEOUT`: UInt = 27u;
public const val `MM_YOUCOM`: UInt = 256u;
public const val `MM_ZEFIRO`: UInt = 170u;
public const val `MM_ZEFIRO_ZA2`: UInt = 2u;
public const val `MM_ZYXEL`: UInt = 9u;
public const val `MM_ZYXEL_ACM_ADPCM`: UInt = 1u;
public const val `MODM_CACHEDRUMPATCHES`: UInt = 13u;
public const val `MODM_CACHEPATCHES`: UInt = 12u;
public const val `MODM_CLOSE`: UInt = 4u;
public const val `MODM_DATA`: UInt = 7u;
public const val `MODM_GETDEVCAPS`: UInt = 2u;
public const val `MODM_GETNUMDEVS`: UInt = 1u;
public const val `MODM_GETPOS`: UInt = 17u;
public const val `MODM_GETVOLUME`: UInt = 10u;
public const val `MODM_INIT`: UInt = 100u;
public const val `MODM_INIT_EX`: UInt = 104u;
public const val `MODM_LONGDATA`: UInt = 8u;
public const val `MODM_MAPPER`: UInt = 8192u;
public const val `MODM_OPEN`: UInt = 3u;
public const val `MODM_PAUSE`: UInt = 18u;
public const val `MODM_PREFERRED`: UInt = 22u;
public const val `MODM_PREPARE`: UInt = 5u;
public const val `MODM_PROPERTIES`: UInt = 21u;
public const val `MODM_RECONFIGURE`: UInt = 18280u;
public const val `MODM_RESET`: UInt = 9u;
public const val `MODM_RESTART`: UInt = 19u;
public const val `MODM_SETVOLUME`: UInt = 11u;
public const val `MODM_STOP`: UInt = 20u;
public const val `MODM_STRMDATA`: UInt = 14u;
public const val `MODM_UNPREPARE`: UInt = 6u;
public const val `MODM_USER`: UInt = 16384u;
public const val `MPEGLAYER3_ID_CONSTANTFRAMESIZE`: UInt = 2u;
public const val `MPEGLAYER3_ID_MPEG`: UInt = 1u;
public const val `MPEGLAYER3_ID_UNKNOWN`: UInt = 0u;
public const val `MPEGLAYER3_WFX_EXTRA_BYTES`: UInt = 12u;
// UNSUPPORTED Rust 5001:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct MSAUDIO1WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
//     pub wEncodeOptions: u16,
// }

public const val `MSAUDIO1_BITS_PER_SAMPLE`: UInt = 16u;
public const val `MSAUDIO1_MAX_CHANNELS`: UInt = 2u;
public const val `MXDM_BASE`: UInt = 1u;
public const val `MXDM_CLOSE`: UInt = 4u;
public const val `MXDM_GETCONTROLDETAILS`: UInt = 7u;
public const val `MXDM_GETDEVCAPS`: UInt = 2u;
public const val `MXDM_GETLINECONTROLS`: UInt = 6u;
public const val `MXDM_GETLINEINFO`: UInt = 5u;
public const val `MXDM_GETNUMDEVS`: UInt = 1u;
public const val `MXDM_INIT`: UInt = 100u;
public const val `MXDM_INIT_EX`: UInt = 104u;
public const val `MXDM_OPEN`: UInt = 3u;
public const val `MXDM_SETCONTROLDETAILS`: UInt = 8u;
public const val `MXDM_USER`: UInt = 16384u;
// UNSUPPORTED Rust 5023:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct NMS_VBXADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wSamplesPerBlock: u16,
// }

public const val `NS_DRM_E_MIGRATION_IMAGE_ALREADY_EXISTS`: Int = -1072879730;
public const val `NS_DRM_E_MIGRATION_SOURCE_MACHINE_IN_USE`: Int = -1072879732;
public const val `NS_DRM_E_MIGRATION_TARGET_MACHINE_LESS_THAN_LH`: Int = -1072879731;
public const val `NS_DRM_E_MIGRATION_UPGRADE_WITH_DIFF_SID`: Int = -1072879733;
public const val `NS_E_8BIT_WAVE_UNSUPPORTED`: Int = -1072886834;
public const val `NS_E_ACTIVE_SG_DEVICE_CONTROL_DISCONNECTED`: Int = -1072882778;
public const val `NS_E_ACTIVE_SG_DEVICE_DISCONNECTED`: Int = -1072882779;
public const val `NS_E_ADVANCEDEDIT_TOO_MANY_PICTURES`: Int = -1072884886;
public const val `NS_E_ALLOCATE_FILE_FAIL`: Int = -1072889759;
public const val `NS_E_ALL_PROTOCOLS_DISABLED`: Int = -1072877845;
public const val `NS_E_ALREADY_CONNECTED`: Int = -1072889840;
public const val `NS_E_ANALOG_VIDEO_PROTECTION_LEVEL_UNSUPPORTED`: Int = -1072879353;
public const val `NS_E_ARCHIVE_ABORT_DUE_TO_BCAST`: Int = -1072884338;
public const val `NS_E_ARCHIVE_FILENAME_NOTSET`: Int = -1072882823;
public const val `NS_E_ARCHIVE_GAP_DETECTED`: Int = -1072884337;
public const val `NS_E_ARCHIVE_REACH_QUOTA`: Int = -1072884339;
public const val `NS_E_ARCHIVE_SAME_AS_INPUT`: Int = -1072882812;
public const val `NS_E_ASSERT`: Int = -1072889653;
public const val `NS_E_ASX_INVALIDFORMAT`: Int = -1072885655;
public const val `NS_E_ASX_INVALIDVERSION`: Int = -1072885654;
public const val `NS_E_ASX_INVALID_REPEAT_BLOCK`: Int = -1072885653;
public const val `NS_E_ASX_NOTHING_TO_WRITE`: Int = -1072885652;
public const val `NS_E_ATTRIBUTE_NOT_ALLOWED`: Int = -1072886825;
public const val `NS_E_ATTRIBUTE_READ_ONLY`: Int = -1072886826;
public const val `NS_E_AUDIENCE_CONTENTTYPE_MISMATCH`: Int = -1072882791;
public const val `NS_E_AUDIENCE__LANGUAGE_CONTENTTYPE_MISMATCH`: Int = -1072882717;
public const val `NS_E_AUDIODEVICE_BADFORMAT`: Int = -1072882845;
public const val `NS_E_AUDIODEVICE_BUSY`: Int = -1072882847;
public const val `NS_E_AUDIODEVICE_UNEXPECTED`: Int = -1072882846;
public const val `NS_E_AUDIO_BITRATE_STEPDOWN`: Int = -1072882759;
public const val `NS_E_AUDIO_CODEC_ERROR`: Int = -1072886845;
public const val `NS_E_AUDIO_CODEC_NOT_INSTALLED`: Int = -1072886846;
public const val `NS_E_AUTHORIZATION_FILE_NOT_FOUND`: Int = -1072884336;
public const val `NS_E_BACKUP_RESTORE_BAD_DATA`: Int = -1072879803;
public const val `NS_E_BACKUP_RESTORE_BAD_REQUEST_ID`: Int = -1072879826;
public const val `NS_E_BACKUP_RESTORE_FAILURE`: Int = -1072879827;
public const val `NS_E_BACKUP_RESTORE_TOO_MANY_RESETS`: Int = -1072879770;
public const val `NS_E_BAD_ADAPTER_ADDRESS`: Int = -1072889799;
public const val `NS_E_BAD_ADAPTER_NAME`: Int = -1072889652;
public const val `NS_E_BAD_BLOCK0_VERSION`: Int = -1072889757;
public const val `NS_E_BAD_CONTENTEDL`: Int = -1072882774;
public const val `NS_E_BAD_CONTROL_DATA`: Int = -1072889806;
public const val `NS_E_BAD_CUB_UID`: Int = -1072889454;
public const val `NS_E_BAD_DELIVERY_MODE`: Int = -1072889798;
public const val `NS_E_BAD_DISK_UID`: Int = -1072889756;
public const val `NS_E_BAD_FSMAJOR_VERSION`: Int = -1072889755;
public const val `NS_E_BAD_MARKIN`: Int = -1072882856;
public const val `NS_E_BAD_MARKOUT`: Int = -1072882855;
public const val `NS_E_BAD_MULTICAST_ADDRESS`: Int = -1072889800;
public const val `NS_E_BAD_REQUEST`: Int = -1072877853;
public const val `NS_E_BAD_STAMPNUMBER`: Int = -1072889754;
public const val `NS_E_BAD_SYNTAX_IN_SERVER_RESPONSE`: Int = -1072877826;
public const val `NS_E_BKGDOWNLOAD_CALLFUNCENDED`: Int = -1072885145;
public const val `NS_E_BKGDOWNLOAD_CALLFUNCFAILED`: Int = -1072885147;
public const val `NS_E_BKGDOWNLOAD_CALLFUNCTIMEOUT`: Int = -1072885146;
public const val `NS_E_BKGDOWNLOAD_CANCELCOMPLETEDJOB`: Int = -1072885153;
public const val `NS_E_BKGDOWNLOAD_COMPLETECANCELLEDJOB`: Int = -1072885154;
public const val `NS_E_BKGDOWNLOAD_FAILEDINITIALIZE`: Int = -1072885143;
public const val `NS_E_BKGDOWNLOAD_FAILED_TO_CREATE_TEMPFILE`: Int = -1072885150;
public const val `NS_E_BKGDOWNLOAD_INVALIDJOBSIGNATURE`: Int = -1072885151;
public const val `NS_E_BKGDOWNLOAD_INVALID_FILE_NAME`: Int = -1072885141;
public const val `NS_E_BKGDOWNLOAD_NOJOBPOINTER`: Int = -1072885152;
public const val `NS_E_BKGDOWNLOAD_PLUGIN_FAILEDINITIALIZE`: Int = -1072885149;
public const val `NS_E_BKGDOWNLOAD_PLUGIN_FAILEDTOMOVEFILE`: Int = -1072885148;
public const val `NS_E_BKGDOWNLOAD_WMDUNPACKFAILED`: Int = -1072885144;
public const val `NS_E_BKGDOWNLOAD_WRONG_NO_FILES`: Int = -1072885155;
public const val `NS_E_BUSY`: Int = -1072889819;
public const val `NS_E_CACHE_ARCHIVE_CONFLICT`: Int = -1072884756;
public const val `NS_E_CACHE_CANNOT_BE_CACHED`: Int = -1072884752;
public const val `NS_E_CACHE_NOT_BROADCAST`: Int = -1072884753;
public const val `NS_E_CACHE_NOT_MODIFIED`: Int = -1072884751;
public const val `NS_E_CACHE_ORIGIN_SERVER_NOT_FOUND`: Int = -1072884755;
public const val `NS_E_CACHE_ORIGIN_SERVER_TIMEOUT`: Int = -1072884754;
public const val `NS_E_CANNOTCONNECT`: Int = -1072889850;
public const val `NS_E_CANNOTCONNECTEVENTS`: Int = -1072889745;
public const val `NS_E_CANNOTDESTROYTITLE`: Int = -1072889849;
public const val `NS_E_CANNOTOFFLINEDISK`: Int = -1072889847;
public const val `NS_E_CANNOTONLINEDISK`: Int = -1072889846;
public const val `NS_E_CANNOTRENAMETITLE`: Int = -1072889848;
public const val `NS_E_CANNOT_BUY_OR_DOWNLOAD_CONTENT`: Int = -1072884904;
public const val `NS_E_CANNOT_BUY_OR_DOWNLOAD_FROM_MULTIPLE_SERVICES`: Int = -1072884905;
public const val `NS_E_CANNOT_CONNECT_TO_PROXY`: Int = -1072877842;
public const val `NS_E_CANNOT_DELETE_ACTIVE_SOURCEGROUP`: Int = -1072882848;
public const val `NS_E_CANNOT_GENERATE_BROADCAST_INFO_FOR_QUALITYVBR`: Int = -1072882721;
public const val `NS_E_CANNOT_PAUSE_LIVEBROADCAST`: Int = -1072882802;
public const val `NS_E_CANNOT_READ_PLAYLIST_FROM_MEDIASERVER`: Int = -1072877838;
public const val `NS_E_CANNOT_REMOVE_PLUGIN`: Int = -1072884655;
public const val `NS_E_CANNOT_REMOVE_PUBLISHING_POINT`: Int = -1072884656;
public const val `NS_E_CANNOT_SYNC_DRM_TO_NON_JANUS_DEVICE`: Int = -1072885178;
public const val `NS_E_CANNOT_SYNC_PREVIOUS_SYNC_RUNNING`: Int = -1072885177;
public const val `NS_E_CANT_READ_DIGITAL`: Int = -1072885855;
public const val `NS_E_CCLINK_DOWN`: Int = -1072889821;
public const val `NS_E_CD_COPYTO_CD`: Int = -1072885842;
public const val `NS_E_CD_DRIVER_PROBLEM`: Int = -1072885838;
public const val `NS_E_CD_EMPTY_TRACK_QUEUE`: Int = -1072885255;
public const val `NS_E_CD_ISRC_INVALID`: Int = -1072885253;
public const val `NS_E_CD_MEDIA_CATALOG_NUMBER_INVALID`: Int = -1072885252;
public const val `NS_E_CD_NO_BUFFERS_READ`: Int = -1072885256;
public const val `NS_E_CD_NO_READER`: Int = -1072885254;
public const val `NS_E_CD_QUEUEING_DISABLED`: Int = -1072885249;
public const val `NS_E_CD_READ_ERROR`: Int = -1072885844;
public const val `NS_E_CD_READ_ERROR_NO_CORRECTION`: Int = -1072885845;
public const val `NS_E_CD_REFRESH`: Int = -1072885839;
public const val `NS_E_CD_SLOW_COPY`: Int = -1072885843;
public const val `NS_E_CD_SPEEDDETECT_NOT_ENOUGH_READS`: Int = -1072885250;
public const val `NS_E_CHANGING_PROXYBYPASS`: Int = -1072885565;
public const val `NS_E_CHANGING_PROXY_EXCEPTIONLIST`: Int = -1072885566;
public const val `NS_E_CHANGING_PROXY_NAME`: Int = -1072885568;
public const val `NS_E_CHANGING_PROXY_PORT`: Int = -1072885567;
public const val `NS_E_CHANGING_PROXY_PROTOCOL_NOT_FOUND`: Int = -1072885564;
public const val `NS_E_CLOSED_ON_SUSPEND`: Int = -1072877839;
public const val `NS_E_CODEC_DMO_ERROR`: Int = -1072886822;
public const val `NS_E_CODEC_UNAVAILABLE`: Int = -1072882813;
public const val `NS_E_COMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED`: Int = -1072879352;
public const val `NS_E_COMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED`: Int = -1072879355;
public const val `NS_E_CONNECTION_FAILURE`: Int = -1072889815;
public const val `NS_E_CONNECT_TIMEOUT`: Int = -1072877818;
public const val `NS_E_CONTENT_PARTNER_STILL_INITIALIZING`: Int = -1072884894;
public const val `NS_E_CORECD_NOTAMEDIACD`: Int = -1072885561;
public const val `NS_E_CRITICAL_ERROR`: Int = -1072884452;
public const val `NS_E_CUB_FAIL`: Int = -1072889773;
public const val `NS_E_CUB_FAIL_LINK`: Int = -1072889456;
public const val `NS_E_CURLHELPER_NOTADIRECTORY`: Int = -1072884947;
public const val `NS_E_CURLHELPER_NOTAFILE`: Int = -1072884946;
public const val `NS_E_CURLHELPER_NOTRELATIVE`: Int = -1072884944;
public const val `NS_E_CURL_CANTDECODE`: Int = -1072884945;
public const val `NS_E_CURL_CANTWALK`: Int = -1072884949;
public const val `NS_E_CURL_INVALIDBUFFERSIZE`: Int = -1072884943;
public const val `NS_E_CURL_INVALIDCHAR`: Int = -1072884955;
public const val `NS_E_CURL_INVALIDHOSTNAME`: Int = -1072884954;
public const val `NS_E_CURL_INVALIDPATH`: Int = -1072884953;
public const val `NS_E_CURL_INVALIDPORT`: Int = -1072884948;
public const val `NS_E_CURL_INVALIDSCHEME`: Int = -1072884952;
public const val `NS_E_CURL_INVALIDURL`: Int = -1072884951;
public const val `NS_E_CURL_NOTSAFE`: Int = -1072884956;
public const val `NS_E_DAMAGED_FILE`: Int = -1072885813;
public const val `NS_E_DATAPATH_NO_SINK`: Int = -1072884456;
public const val `NS_E_DATA_SOURCE_ENUMERATION_NOT_SUPPORTED`: Int = -1072884352;
public const val `NS_E_DATA_UNIT_EXTENSION_TOO_LARGE`: Int = -1072886823;
public const val `NS_E_DDRAW_GENERIC`: Int = -1072885571;
public const val `NS_E_DEVCONTROL_FAILED_SEEK`: Int = -1072882796;
public const val `NS_E_DEVICECONTROL_UNSTABLE`: Int = -1072882719;
public const val `NS_E_DEVICE_DISCONNECTED`: Int = -1072885854;
public const val `NS_E_DEVICE_IS_NOT_READY`: Int = -1072885385;
public const val `NS_E_DEVICE_NOT_READY`: Int = -1072885814;
public const val `NS_E_DEVICE_NOT_SUPPORT_FORMAT`: Int = -1072885853;
public const val `NS_E_DEVICE_NOT_WMDRM_DEVICE`: Int = -1072879749;
public const val `NS_E_DISK_FAIL`: Int = -1072889771;
public const val `NS_E_DISK_READ`: Int = -1072889833;
public const val `NS_E_DISK_WRITE`: Int = -1072889834;
public const val `NS_E_DISPLAY_MODE_CHANGE_FAILED`: Int = -1072885570;
public const val `NS_E_DRMPROFILE_NOTFOUND`: Int = -1072882731;
public const val `NS_E_DRM_ACQUIRING_LICENSE`: Int = -1072879829;
public const val `NS_E_DRM_ACTION_NOT_QUERIED`: Int = -1072879830;
public const val `NS_E_DRM_ALREADY_INDIVIDUALIZED`: Int = -1072879831;
public const val `NS_E_DRM_APPCERT_REVOKED`: Int = -1072879790;
public const val `NS_E_DRM_ATTRIBUTE_TOO_LONG`: Int = -1072879438;
public const val `NS_E_DRM_BACKUPRESTORE_BUSY`: Int = -1072879804;
public const val `NS_E_DRM_BACKUP_CORRUPT`: Int = -1072879805;
public const val `NS_E_DRM_BACKUP_EXISTS`: Int = -1072879806;
public const val `NS_E_DRM_BAD_REQUEST`: Int = -1072879440;
public const val `NS_E_DRM_BB_UNABLE_TO_INITIALIZE`: Int = -1072879744;
public const val `NS_E_DRM_BUFFER_TOO_SMALL`: Int = -1072879780;
public const val `NS_E_DRM_BUSY`: Int = -1072879551;
public const val `NS_E_DRM_CACHED_CONTENT_ERROR`: Int = -1072879797;
public const val `NS_E_DRM_CERTIFICATE_REVOKED`: Int = -1072879455;
public const val `NS_E_DRM_CERTIFICATE_SECURITY_LEVEL_INADEQUATE`: Int = -1072879442;
public const val `NS_E_DRM_CHAIN_TOO_LONG`: Int = -1072879540;
public const val `NS_E_DRM_CHECKPOINT_CORRUPT`: Int = -1072879721;
public const val `NS_E_DRM_CHECKPOINT_FAILED`: Int = -1072879745;
public const val `NS_E_DRM_CHECKPOINT_MISMATCH`: Int = -1072879722;
public const val `NS_E_DRM_CLIENT_CODE_EXPIRED`: Int = -1072879545;
public const val `NS_E_DRM_DATASTORE_CORRUPT`: Int = -1072879741;
public const val `NS_E_DRM_DEBUGGING_NOT_ALLOWED`: Int = -1072879769;
public const val `NS_E_DRM_DECRYPT_ERROR`: Int = -1072879837;
public const val `NS_E_DRM_DEVICE_ACTIVATION_CANCELED`: Int = -1072879771;
public const val `NS_E_DRM_DEVICE_ALREADY_REGISTERED`: Int = -1072879445;
public const val `NS_E_DRM_DEVICE_LIMIT_REACHED`: Int = -1072879453;
public const val `NS_E_DRM_DEVICE_NOT_OPEN`: Int = -1072879446;
public const val `NS_E_DRM_DEVICE_NOT_REGISTERED`: Int = -1072879646;
public const val `NS_E_DRM_DRIVER_AUTH_FAILURE`: Int = -1072879795;
public const val `NS_E_DRM_DRIVER_DIGIOUT_FAILURE`: Int = -1072879792;
public const val `NS_E_DRM_DRMV2CLT_REVOKED`: Int = -1072879434;
public const val `NS_E_DRM_ENCRYPT_ERROR`: Int = -1072879838;
public const val `NS_E_DRM_ENUM_LICENSE_FAILED`: Int = -1072879845;
public const val `NS_E_DRM_ERROR_BAD_NET_RESP`: Int = -1072879778;
public const val `NS_E_DRM_EXPIRED_LICENSEBLOB`: Int = -1072879437;
public const val `NS_E_DRM_GET_CONTENTSTRING_ERROR`: Int = -1072879811;
public const val `NS_E_DRM_GET_LICENSESTRING_ERROR`: Int = -1072879812;
public const val `NS_E_DRM_GET_LICENSE_ERROR`: Int = -1072879815;
public const val `NS_E_DRM_HARDWAREID_MISMATCH`: Int = -1072879729;
public const val `NS_E_DRM_HARDWARE_INCONSISTENT`: Int = -1072879788;
public const val `NS_E_DRM_INCLUSION_LIST_REQUIRED`: Int = -1072879435;
public const val `NS_E_DRM_INDIVIDUALIZATION_INCOMPLETE`: Int = -1072879796;
public const val `NS_E_DRM_INDIVIDUALIZE_ERROR`: Int = -1072879818;
public const val `NS_E_DRM_INDIVIDUALIZING`: Int = -1072879828;
public const val `NS_E_DRM_INDIV_FRAUD`: Int = -1072879549;
public const val `NS_E_DRM_INDIV_NO_CABS`: Int = -1072879548;
public const val `NS_E_DRM_INDIV_SERVICE_UNAVAILABLE`: Int = -1072879547;
public const val `NS_E_DRM_INVALID_APPCERT`: Int = -1072879748;
public const val `NS_E_DRM_INVALID_APPDATA`: Int = -1072879808;
public const val `NS_E_DRM_INVALID_APPDATA_VERSION`: Int = -1072879807;
public const val `NS_E_DRM_INVALID_APPLICATION`: Int = -1072879855;
public const val `NS_E_DRM_INVALID_CERTIFICATE`: Int = -1072879456;
public const val `NS_E_DRM_INVALID_CONTENT`: Int = -1072879850;
public const val `NS_E_DRM_INVALID_CRL`: Int = -1072879439;
public const val `NS_E_DRM_INVALID_DATA`: Int = -1072879775;
public const val `NS_E_DRM_INVALID_KID`: Int = -1072879543;
public const val `NS_E_DRM_INVALID_LICENSE`: Int = -1072879848;
public const val `NS_E_DRM_INVALID_LICENSEBLOB`: Int = -1072879436;
public const val `NS_E_DRM_INVALID_LICENSE_ACQUIRED`: Int = -1072879841;
public const val `NS_E_DRM_INVALID_LICENSE_REQUEST`: Int = -1072879844;
public const val `NS_E_DRM_INVALID_MACHINE`: Int = -1072879847;
public const val `NS_E_DRM_INVALID_MIGRATION_IMAGE`: Int = -1072879736;
public const val `NS_E_DRM_INVALID_PROPERTY`: Int = -1072879799;
public const val `NS_E_DRM_INVALID_PROXIMITY_RESPONSE`: Int = -1072879448;
public const val `NS_E_DRM_INVALID_SECURESTORE_PASSWORD`: Int = -1072879791;
public const val `NS_E_DRM_INVALID_SESSION`: Int = -1072879447;
public const val `NS_E_DRM_KEY_ERROR`: Int = -1072879839;
public const val `NS_E_DRM_LICENSE_APPSECLOW`: Int = -1072879654;
public const val `NS_E_DRM_LICENSE_APP_NOTALLOWED`: Int = -1072879651;
public const val `NS_E_DRM_LICENSE_CERT_EXPIRED`: Int = -1072879649;
public const val `NS_E_DRM_LICENSE_CLOSE_ERROR`: Int = -1072879816;
public const val `NS_E_DRM_LICENSE_CONTENT_REVOKED`: Int = -1072879647;
public const val `NS_E_DRM_LICENSE_DELETION_ERROR`: Int = -1072879538;
public const val `NS_E_DRM_LICENSE_EXPIRED`: Int = -1072879656;
public const val `NS_E_DRM_LICENSE_INITIALIZATION_ERROR`: Int = -1072879542;
public const val `NS_E_DRM_LICENSE_INVALID_XML`: Int = -1072879835;
public const val `NS_E_DRM_LICENSE_NOSAP`: Int = -1072879606;
public const val `NS_E_DRM_LICENSE_NOSVP`: Int = -1072879605;
public const val `NS_E_DRM_LICENSE_NOTACQUIRED`: Int = -1072879783;
public const val `NS_E_DRM_LICENSE_NOTENABLED`: Int = -1072879655;
public const val `NS_E_DRM_LICENSE_NOTRUSTEDCODEC`: Int = -1072879603;
public const val `NS_E_DRM_LICENSE_NOWDM`: Int = -1072879604;
public const val `NS_E_DRM_LICENSE_OPEN_ERROR`: Int = -1072879817;
public const val `NS_E_DRM_LICENSE_SECLOW`: Int = -1072879648;
public const val `NS_E_DRM_LICENSE_SERVER_INFO_MISSING`: Int = -1072879552;
public const val `NS_E_DRM_LICENSE_STORE_ERROR`: Int = -1072879854;
public const val `NS_E_DRM_LICENSE_STORE_SAVE_ERROR`: Int = -1072879852;
public const val `NS_E_DRM_LICENSE_UNAVAILABLE`: Int = -1072879454;
public const val `NS_E_DRM_LICENSE_UNUSABLE`: Int = -1072879800;
public const val `NS_E_DRM_LIC_NEEDS_DEVICE_CLOCK_SET`: Int = -1072879751;
public const val `NS_E_DRM_MALFORMED_CONTENT_HEADER`: Int = -1072879716;
public const val `NS_E_DRM_MIGRATION_IMPORTER_NOT_AVAILABLE`: Int = -1072879734;
public const val `NS_E_DRM_MIGRATION_INVALID_LEGACYV2_DATA`: Int = -1072879727;
public const val `NS_E_DRM_MIGRATION_INVALID_LEGACYV2_SST_PASSWORD`: Int = -1072879725;
public const val `NS_E_DRM_MIGRATION_LICENSE_ALREADY_EXISTS`: Int = -1072879726;
public const val `NS_E_DRM_MIGRATION_NOT_SUPPORTED`: Int = -1072879724;
public const val `NS_E_DRM_MIGRATION_OBJECT_IN_USE`: Int = -1072879717;
public const val `NS_E_DRM_MIGRATION_OPERATION_CANCELLED`: Int = -1072879718;
public const val `NS_E_DRM_MIGRATION_TARGET_NOT_ONLINE`: Int = -1072879737;
public const val `NS_E_DRM_MIGRATION_TARGET_STATES_CORRUPTED`: Int = -1072879735;
public const val `NS_E_DRM_MONITOR_ERROR`: Int = -1072879810;
public const val `NS_E_DRM_MUST_APPROVE`: Int = -1072879450;
public const val `NS_E_DRM_MUST_REGISTER`: Int = -1072879451;
public const val `NS_E_DRM_MUST_REVALIDATE`: Int = -1072879449;
public const val `NS_E_DRM_NEEDS_INDIVIDUALIZATION`: Int = -1072879832;
public const val `NS_E_DRM_NEEDS_UPGRADE_TEMPFILE`: Int = -1072879555;
public const val `NS_E_DRM_NEED_UPGRADE_MSSAP`: Int = -1072879794;
public const val `NS_E_DRM_NEED_UPGRADE_PD`: Int = -1072879554;
public const val `NS_E_DRM_NOT_CONFIGURED`: Int = -1072879772;
public const val `NS_E_DRM_NO_RIGHTS`: Int = -1072879840;
public const val `NS_E_DRM_NO_UPLINK_LICENSE`: Int = -1072879544;
public const val `NS_E_DRM_OPERATION_CANCELED`: Int = -1072879768;
public const val `NS_E_DRM_PARAMETERS_MISMATCHED`: Int = -1072879825;
public const val `NS_E_DRM_PASSWORD_TOO_LONG`: Int = -1072882797;
public const val `NS_E_DRM_PD_TOO_MANY_DEVICES`: Int = -1072879550;
public const val `NS_E_DRM_POLICY_DISABLE_ONLINE`: Int = -1072879774;
public const val `NS_E_DRM_POLICY_METERING_DISABLED`: Int = -1072879754;
public const val `NS_E_DRM_PROFILE_NOT_SET`: Int = -1072882801;
public const val `NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_CHALLENGE`: Int = -1072879746;
public const val `NS_E_DRM_PROTOCOL_FORCEFUL_TERMINATION_ON_PETITION`: Int = -1072879747;
public const val `NS_E_DRM_QUERY_ERROR`: Int = -1072879814;
public const val `NS_E_DRM_REOPEN_CONTENT`: Int = -1072879793;
public const val `NS_E_DRM_REPORT_ERROR`: Int = -1072879813;
public const val `NS_E_DRM_RESTORE_FRAUD`: Int = -1072879789;
public const val `NS_E_DRM_RESTORE_SERVICE_UNAVAILABLE`: Int = -1072879546;
public const val `NS_E_DRM_RESTRICTIONS_NOT_RETRIEVED`: Int = -1072879767;
public const val `NS_E_DRM_RIV_TOO_SMALL`: Int = -1072879433;
public const val `NS_E_DRM_SDK_VERSIONMISMATCH`: Int = -1072879752;
public const val `NS_E_DRM_SDMI_NOMORECOPIES`: Int = -1072879786;
public const val `NS_E_DRM_SDMI_TRIGGER`: Int = -1072879787;
public const val `NS_E_DRM_SECURE_STORE_ERROR`: Int = -1072879853;
public const val `NS_E_DRM_SECURE_STORE_NOT_FOUND`: Int = -1072879798;
public const val `NS_E_DRM_SECURE_STORE_UNLOCK_ERROR`: Int = -1072879851;
public const val `NS_E_DRM_SECURITY_COMPONENT_SIGNATURE_INVALID`: Int = -1072879776;
public const val `NS_E_DRM_SIGNATURE_FAILURE`: Int = -1072879553;
public const val `NS_E_DRM_SOURCEID_NOT_SUPPORTED`: Int = -1072879602;
public const val `NS_E_DRM_STORE_NEEDINDI`: Int = -1072879653;
public const val `NS_E_DRM_STORE_NOTALLOWED`: Int = -1072879652;
public const val `NS_E_DRM_STORE_NOTALLSTORED`: Int = -1072879777;
public const val `NS_E_DRM_STUBLIB_REQUIRED`: Int = -1072879739;
public const val `NS_E_DRM_TRACK_EXCEEDED_PLAYLIST_RESTICTION`: Int = -1072879760;
public const val `NS_E_DRM_TRACK_EXCEEDED_TRACKBURN_RESTRICTION`: Int = -1072879759;
public const val `NS_E_DRM_TRANSFER_CHAINED_LICENSES_UNSUPPORTED`: Int = -1072879753;
public const val `NS_E_DRM_UNABLE_TO_ACQUIRE_LICENSE`: Int = -1072879842;
public const val `NS_E_DRM_UNABLE_TO_CREATE_AUTHENTICATION_OBJECT`: Int = -1072879773;
public const val `NS_E_DRM_UNABLE_TO_CREATE_BACKUP_OBJECT`: Int = -1072879819;
public const val `NS_E_DRM_UNABLE_TO_CREATE_CERTIFICATE_OBJECT`: Int = -1072879738;
public const val `NS_E_DRM_UNABLE_TO_CREATE_CODING_OBJECT`: Int = -1072879782;
public const val `NS_E_DRM_UNABLE_TO_CREATE_DECRYPT_OBJECT`: Int = -1072879821;
public const val `NS_E_DRM_UNABLE_TO_CREATE_DEVICE_REGISTRATION_OBJECT`: Int = -1072879764;
public const val `NS_E_DRM_UNABLE_TO_CREATE_ENCRYPT_OBJECT`: Int = -1072879822;
public const val `NS_E_DRM_UNABLE_TO_CREATE_HEADER_OBJECT`: Int = -1072879785;
public const val `NS_E_DRM_UNABLE_TO_CREATE_INDI_OBJECT`: Int = -1072879823;
public const val `NS_E_DRM_UNABLE_TO_CREATE_INMEMORYSTORE_OBJECT`: Int = -1072879740;
public const val `NS_E_DRM_UNABLE_TO_CREATE_KEYS_OBJECT`: Int = -1072879784;
public const val `NS_E_DRM_UNABLE_TO_CREATE_LICENSE_OBJECT`: Int = -1072879824;
public const val `NS_E_DRM_UNABLE_TO_CREATE_METERING_OBJECT`: Int = -1072879763;
public const val `NS_E_DRM_UNABLE_TO_CREATE_MIGRATION_IMPORTER_OBJECT`: Int = -1072879723;
public const val `NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_BURN_OBJECT`: Int = -1072879765;
public const val `NS_E_DRM_UNABLE_TO_CREATE_PLAYLIST_OBJECT`: Int = -1072879766;
public const val `NS_E_DRM_UNABLE_TO_CREATE_PROPERTIES_OBJECT`: Int = -1072879820;
public const val `NS_E_DRM_UNABLE_TO_CREATE_STATE_DATA_OBJECT`: Int = -1072879781;
public const val `NS_E_DRM_UNABLE_TO_GET_DEVICE_CERT`: Int = -1072879758;
public const val `NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK`: Int = -1072879757;
public const val `NS_E_DRM_UNABLE_TO_GET_SECURE_CLOCK_FROM_SERVER`: Int = -1072879755;
public const val `NS_E_DRM_UNABLE_TO_INITIALIZE`: Int = -1072879843;
public const val `NS_E_DRM_UNABLE_TO_LOAD_HARDWARE_ID`: Int = -1072879743;
public const val `NS_E_DRM_UNABLE_TO_OPEN_DATA_STORE`: Int = -1072879742;
public const val `NS_E_DRM_UNABLE_TO_OPEN_LICENSE`: Int = -1072879849;
public const val `NS_E_DRM_UNABLE_TO_OPEN_PORT`: Int = -1072879441;
public const val `NS_E_DRM_UNABLE_TO_SET_PARAMETER`: Int = -1072879809;
public const val `NS_E_DRM_UNABLE_TO_SET_SECURE_CLOCK`: Int = -1072879756;
public const val `NS_E_DRM_UNABLE_TO_VERIFY_PROXIMITY`: Int = -1072879452;
public const val `NS_E_DRM_UNSUPPORTED_ACTION`: Int = -1072879443;
public const val `NS_E_DRM_UNSUPPORTED_ALGORITHM`: Int = -1072879539;
public const val `NS_E_DRM_UNSUPPORTED_PROPERTY`: Int = -1072879779;
public const val `NS_E_DRM_UNSUPPORTED_PROTOCOL_VERSION`: Int = -1072879444;
public const val `NS_E_DUPLICATE_ADDRESS`: Int = -1072889801;
public const val `NS_E_DUPLICATE_DRMPROFILE`: Int = -1072882800;
public const val `NS_E_DUPLICATE_NAME`: Int = -1072889802;
public const val `NS_E_DUPLICATE_PACKET`: Int = -1072886829;
public const val `NS_E_DVD_AUTHORING_PROBLEM`: Int = -1072885404;
public const val `NS_E_DVD_CANNOT_COPY_PROTECTED`: Int = -1072885390;
public const val `NS_E_DVD_CANNOT_JUMP`: Int = -1072885393;
public const val `NS_E_DVD_COMPATIBLE_VIDEO_CARD`: Int = -1072885402;
public const val `NS_E_DVD_COPY_PROTECT`: Int = -1072885405;
public const val `NS_E_DVD_DEVICE_CONTENTION`: Int = -1072885392;
public const val `NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_FAILED`: Int = -1072885407;
public const val `NS_E_DVD_DISC_COPY_PROTECT_OUTPUT_NS`: Int = -1072885408;
public const val `NS_E_DVD_DISC_DECODER_REGION`: Int = -1072885399;
public const val `NS_E_DVD_GRAPH_BUILDING`: Int = -1072885396;
public const val `NS_E_DVD_INVALID_DISC_REGION`: Int = -1072885403;
public const val `NS_E_DVD_INVALID_TITLE_CHAPTER`: Int = -1072885388;
public const val `NS_E_DVD_MACROVISION`: Int = -1072885401;
public const val `NS_E_DVD_NO_AUDIO_STREAM`: Int = -1072885397;
public const val `NS_E_DVD_NO_DECODER`: Int = -1072885395;
public const val `NS_E_DVD_NO_SUBPICTURE_STREAM`: Int = -1072885406;
public const val `NS_E_DVD_NO_VIDEO_MEMORY`: Int = -1072885391;
public const val `NS_E_DVD_NO_VIDEO_STREAM`: Int = -1072885398;
public const val `NS_E_DVD_PARENTAL`: Int = -1072885394;
public const val `NS_E_DVD_REQUIRED_PROPERTY_NOT_SET`: Int = -1072885389;
public const val `NS_E_DVD_SYSTEM_DECODER_REGION`: Int = -1072885400;
public const val `NS_E_EDL_REQUIRED_FOR_DEVICE_MULTIPASS`: Int = -1072882713;
public const val `NS_E_EMPTY_PLAYLIST`: Int = -1072884555;
public const val `NS_E_EMPTY_PROGRAM_NAME`: Int = -1072889642;
public const val `NS_E_ENACTPLAN_GIVEUP`: Int = -1072889752;
public const val `NS_E_END_OF_PLAYLIST`: Int = -1072876856;
public const val `NS_E_END_OF_TAPE`: Int = -1072882770;
public const val `NS_E_ERROR_FROM_PROXY`: Int = -1072877852;
public const val `NS_E_EXCEED_MAX_DRM_PROFILE_LIMIT`: Int = -1072882720;
public const val `NS_E_EXPECT_MONO_WAV_INPUT`: Int = -1072882783;
public const val `NS_E_FAILED_DOWNLOAD_ABORT_BURN`: Int = -1072885540;
public const val `NS_E_FAIL_LAUNCH_ROXIO_PLUGIN`: Int = -1072885376;
public const val `NS_E_FEATURE_DISABLED_BY_GROUP_POLICY`: Int = -1072886820;
public const val `NS_E_FEATURE_DISABLED_IN_SKU`: Int = -1072886819;
public const val `NS_E_FEATURE_REQUIRES_ENTERPRISE_SERVER`: Int = -1072884349;
public const val `NS_E_FILE_ALLOCATION_FAILED`: Int = -1072889826;
public const val `NS_E_FILE_BANDWIDTH_LIMIT`: Int = -1072889808;
public const val `NS_E_FILE_EXISTS`: Int = -1072889829;
public const val `NS_E_FILE_FAILED_CHECKS`: Int = -1072885811;
public const val `NS_E_FILE_INIT_FAILED`: Int = -1072889825;
public const val `NS_E_FILE_NOT_FOUND`: Int = -1072889830;
public const val `NS_E_FILE_OPEN_FAILED`: Int = -1072889827;
public const val `NS_E_FILE_PLAY_FAILED`: Int = -1072889824;
public const val `NS_E_FILE_READ`: Int = -1072889831;
public const val `NS_E_FILE_WRITE`: Int = -1072889832;
public const val `NS_E_FIREWALL`: Int = -1072877831;
public const val `NS_E_FLASH_PLAYBACK_NOT_ALLOWED`: Int = -1072885553;
public const val `NS_E_GLITCH_MODE`: Int = -1072889451;
public const val `NS_E_GRAPH_NOAUDIOLANGUAGE`: Int = -1072885563;
public const val `NS_E_GRAPH_NOAUDIOLANGUAGESELECTED`: Int = -1072885562;
public const val `NS_E_HDS_KEY_MISMATCH`: Int = -1072879719;
public const val `NS_E_HEADER_MISMATCH`: Int = -1072884449;
public const val `NS_E_HTTP_DISABLED`: Int = -1072889645;
public const val `NS_E_HTTP_TEXT_DATACONTAINER_INVALID_SERVER_RESPONSE`: Int = -1072884340;
public const val `NS_E_HTTP_TEXT_DATACONTAINER_SIZE_LIMIT_EXCEEDED`: Int = -1072884343;
public const val `NS_E_ICMQUERYFORMAT`: Int = -1072882836;
public const val `NS_E_IE_DISALLOWS_ACTIVEX_CONTROLS`: Int = -1072885554;
public const val `NS_E_IMAGE_DOWNLOAD_FAILED`: Int = -1072885106;
public const val `NS_E_IMAPI_LOSSOFSTREAMING`: Int = -1072885378;
public const val `NS_E_IMAPI_MEDIUM_INVALIDTYPE`: Int = -1072885374;
public const val `NS_E_INCOMPATIBLE_FORMAT`: Int = -1072889791;
public const val `NS_E_INCOMPATIBLE_PUSH_SERVER`: Int = -1072877812;
public const val `NS_E_INCOMPATIBLE_SERVER`: Int = -1072877848;
public const val `NS_E_INCOMPATIBLE_VERSION`: Int = -1072886841;
public const val `NS_E_INCOMPLETE_PLAYLIST`: Int = -1072885182;
public const val `NS_E_INCORRECTCLIPSETTINGS`: Int = -1072882820;
public const val `NS_E_INDUCED`: Int = -1072889822;
public const val `NS_E_INPUTSOURCE_PROBLEM`: Int = -1072882806;
public const val `NS_E_INPUT_DOESNOT_SUPPORT_SMPTE`: Int = -1072882776;
public const val `NS_E_INPUT_WAVFORMAT_MISMATCH`: Int = -1072882782;
public const val `NS_E_INSUFFICIENT_BANDWIDTH`: Int = -1072889812;
public const val `NS_E_INSUFFICIENT_DATA`: Int = -1072889654;
public const val `NS_E_INTERFACE_NOT_REGISTERED_IN_GIT`: Int = -1072885142;
public const val `NS_E_INTERLACEMODE_MISMATCH`: Int = -1072882773;
public const val `NS_E_INTERLACE_REQUIRE_SAMESIZE`: Int = -1072882795;
public const val `NS_E_INTERNAL`: Int = -1072889820;
public const val `NS_E_INTERNAL_SERVER_ERROR`: Int = -1072877854;
public const val `NS_E_INVALIDCALL_WHILE_ARCHIVAL_RUNNING`: Int = -1072882828;
public const val `NS_E_INVALIDCALL_WHILE_ENCODER_RUNNING`: Int = -1072882842;
public const val `NS_E_INVALIDCALL_WHILE_ENCODER_STOPPED`: Int = -1072882817;
public const val `NS_E_INVALIDINPUTFPS`: Int = -1072882815;
public const val `NS_E_INVALIDPACKETSIZE`: Int = -1072882827;
public const val `NS_E_INVALIDPROFILE`: Int = -1072886842;
public const val `NS_E_INVALID_ARCHIVE`: Int = -1072889795;
public const val `NS_E_INVALID_AUDIO_BUFFERMAX`: Int = -1072882756;
public const val `NS_E_INVALID_AUDIO_PEAKRATE`: Int = -1072882758;
public const val `NS_E_INVALID_AUDIO_PEAKRATE_2`: Int = -1072882757;
public const val `NS_E_INVALID_BLACKHOLE_ADDRESS`: Int = -1072889792;
public const val `NS_E_INVALID_CHANNEL`: Int = -1072889797;
public const val `NS_E_INVALID_CLIENT`: Int = -1072889793;
public const val `NS_E_INVALID_DATA`: Int = -1072889809;
public const val `NS_E_INVALID_DEVICE`: Int = -1072882799;
public const val `NS_E_INVALID_DRMV2CLT_STUBLIB`: Int = -1072879728;
public const val `NS_E_INVALID_EDL`: Int = -1072886824;
public const val `NS_E_INVALID_FILE_BITRATE`: Int = -1072882735;
public const val `NS_E_INVALID_FOLDDOWN_COEFFICIENTS`: Int = -1072882732;
public const val `NS_E_INVALID_INDEX`: Int = -1072889839;
public const val `NS_E_INVALID_INDEX2`: Int = -1072889639;
public const val `NS_E_INVALID_INPUT_AUDIENCE_INDEX`: Int = -1072882786;
public const val `NS_E_INVALID_INPUT_FORMAT`: Int = -1072886856;
public const val `NS_E_INVALID_INPUT_LANGUAGE`: Int = -1072882785;
public const val `NS_E_INVALID_INPUT_STREAM`: Int = -1072882784;
public const val `NS_E_INVALID_INTERLACEMODE`: Int = -1072882725;
public const val `NS_E_INVALID_INTERLACE_COMPAT`: Int = -1072882724;
public const val `NS_E_INVALID_KEY`: Int = -1072889790;
public const val `NS_E_INVALID_LOG_URL`: Int = -1072884347;
public const val `NS_E_INVALID_MTU_RANGE`: Int = -1072884346;
public const val `NS_E_INVALID_NAME`: Int = -1072889828;
public const val `NS_E_INVALID_NONSQUAREPIXEL_COMPAT`: Int = -1072882723;
public const val `NS_E_INVALID_NUM_PASSES`: Int = -1072886827;
public const val `NS_E_INVALID_OPERATING_SYSTEM_VERSION`: Int = -1072884647;
public const val `NS_E_INVALID_OUTPUT_FORMAT`: Int = -1072886853;
public const val `NS_E_INVALID_PIXEL_ASPECT_RATIO`: Int = -1072882718;
public const val `NS_E_INVALID_PLAY_STATISTICS`: Int = -1072884345;
public const val `NS_E_INVALID_PLUGIN_LOAD_TYPE_CONFIGURATION`: Int = -1072884652;
public const val `NS_E_INVALID_PORT`: Int = -1072889789;
public const val `NS_E_INVALID_PROFILE_CONTENTTYPE`: Int = -1072882716;
public const val `NS_E_INVALID_PUBLISHING_POINT_NAME`: Int = -1072884651;
public const val `NS_E_INVALID_PUSH_PUBLISHING_POINT`: Int = -1072884453;
public const val `NS_E_INVALID_PUSH_PUBLISHING_POINT_START_REQUEST`: Int = -1072884645;
public const val `NS_E_INVALID_PUSH_TEMPLATE`: Int = -1072884454;
public const val `NS_E_INVALID_QUERY_OPERATOR`: Int = -1072876849;
public const val `NS_E_INVALID_QUERY_PROPERTY`: Int = -1072876848;
public const val `NS_E_INVALID_REDIRECT`: Int = -1072877846;
public const val `NS_E_INVALID_REQUEST`: Int = -1072889813;
public const val `NS_E_INVALID_SAMPLING_RATE`: Int = -1072886832;
public const val `NS_E_INVALID_SCRIPT_BITRATE`: Int = -1072882737;
public const val `NS_E_INVALID_SOURCE_WITH_DEVICE_CONTROL`: Int = -1072882722;
public const val `NS_E_INVALID_STREAM`: Int = -1072889796;
public const val `NS_E_INVALID_TIMECODE`: Int = -1072882730;
public const val `NS_E_INVALID_TTL`: Int = -1072889788;
public const val `NS_E_INVALID_VBR_COMPAT`: Int = -1072882766;
public const val `NS_E_INVALID_VBR_WITH_UNCOMP`: Int = -1072882764;
public const val `NS_E_INVALID_VIDEO_BITRATE`: Int = -1072882753;
public const val `NS_E_INVALID_VIDEO_BUFFER`: Int = -1072882743;
public const val `NS_E_INVALID_VIDEO_BUFFERMAX`: Int = -1072882742;
public const val `NS_E_INVALID_VIDEO_BUFFERMAX_2`: Int = -1072882741;
public const val `NS_E_INVALID_VIDEO_CQUALITY`: Int = -1072882744;
public const val `NS_E_INVALID_VIDEO_FPS`: Int = -1072882747;
public const val `NS_E_INVALID_VIDEO_HEIGHT`: Int = -1072882748;
public const val `NS_E_INVALID_VIDEO_HEIGHT_ALIGN`: Int = -1072882739;
public const val `NS_E_INVALID_VIDEO_IQUALITY`: Int = -1072882745;
public const val `NS_E_INVALID_VIDEO_KEYFRAME`: Int = -1072882746;
public const val `NS_E_INVALID_VIDEO_PEAKRATE`: Int = -1072882751;
public const val `NS_E_INVALID_VIDEO_PEAKRATE_2`: Int = -1072882750;
public const val `NS_E_INVALID_VIDEO_WIDTH`: Int = -1072882749;
public const val `NS_E_INVALID_VIDEO_WIDTH_ALIGN`: Int = -1072882740;
public const val `NS_E_INVALID_VIDEO_WIDTH_FOR_INTERLACED_ENCODING`: Int = -1072882712;
public const val `NS_E_LANGUAGE_MISMATCH`: Int = -1072882788;
public const val `NS_E_LATE_OPERATION`: Int = -1072889810;
public const val `NS_E_LATE_PACKET`: Int = -1072886830;
public const val `NS_E_LICENSE_EXPIRED`: Int = -1072889644;
public const val `NS_E_LICENSE_HEADER_MISSING_URL`: Int = -1072879750;
public const val `NS_E_LICENSE_INCORRECT_RIGHTS`: Int = -1072886847;
public const val `NS_E_LICENSE_OUTOFDATE`: Int = -1072886848;
public const val `NS_E_LICENSE_REQUIRED`: Int = -1072886850;
public const val `NS_E_LOGFILEPERIOD`: Int = -1072889784;
public const val `NS_E_LOG_FILE_SIZE`: Int = -1072889782;
public const val `NS_E_LOG_NEED_TO_BE_SKIPPED`: Int = -1072884344;
public const val `NS_E_MARKIN_UNSUPPORTED`: Int = -1072882711;
public const val `NS_E_MAX_BITRATE`: Int = -1072889785;
public const val `NS_E_MAX_CLIENTS`: Int = -1072889783;
public const val `NS_E_MAX_FILERATE`: Int = -1072889781;
public const val `NS_E_MAX_FUNNELS_ALERT`: Int = -1072889760;
public const val `NS_E_MAX_PACKET_SIZE_TOO_SMALL`: Int = -1072886831;
public const val `NS_E_MEDIACD_READ_ERROR`: Int = -1072885555;
public const val `NS_E_MEDIA_LIBRARY_FAILED`: Int = -1072885810;
public const val `NS_E_MEDIA_PARSER_INVALID_FORMAT`: Int = -1072884351;
public const val `NS_E_MEMSTORAGE_BAD_DATA`: Int = -1072885381;
public const val `NS_E_METADATA_CACHE_DATA_NOT_AVAILABLE`: Int = -1072876837;
public const val `NS_E_METADATA_CANNOT_RETRIEVE_FROM_OFFLINE_CACHE`: Int = -1072876834;
public const val `NS_E_METADATA_CANNOT_SET_LOCALE`: Int = -1072876841;
public const val `NS_E_METADATA_FORMAT_NOT_SUPPORTED`: Int = -1072876843;
public const val `NS_E_METADATA_IDENTIFIER_NOT_AVAILABLE`: Int = -1072876835;
public const val `NS_E_METADATA_INVALID_DOCUMENT_TYPE`: Int = -1072876836;
public const val `NS_E_METADATA_LANGUAGE_NOT_SUPORTED`: Int = -1072876840;
public const val `NS_E_METADATA_NOT_AVAILABLE`: Int = -1072876838;
public const val `NS_E_METADATA_NO_EDITING_CAPABILITY`: Int = -1072876842;
public const val `NS_E_METADATA_NO_RFC1766_NAME_FOR_LOCALE`: Int = -1072876839;
public const val `NS_E_MISMATCHED_MEDIACONTENT`: Int = -1072882849;
public const val `NS_E_MISSING_AUDIENCE`: Int = -1072882792;
public const val `NS_E_MISSING_CHANNEL`: Int = -1072889641;
public const val `NS_E_MISSING_SOURCE_INDEX`: Int = -1072882790;
public const val `NS_E_MIXER_INVALID_CONTROL`: Int = -1072885850;
public const val `NS_E_MIXER_INVALID_LINE`: Int = -1072885851;
public const val `NS_E_MIXER_INVALID_VALUE`: Int = -1072885849;
public const val `NS_E_MIXER_NODRIVER`: Int = -1072885841;
public const val `NS_E_MIXER_UNKNOWN_MMRESULT`: Int = -1072885848;
public const val `NS_E_MLS_SMARTPLAYLIST_FILTER_NOT_REGISTERED`: Int = -1072885643;
public const val `NS_E_MMSAUTOSERVER_CANTFINDWALKER`: Int = -1072889786;
public const val `NS_E_MMS_NOT_SUPPORTED`: Int = -1072877830;
public const val `NS_E_MONITOR_GIVEUP`: Int = -1072889656;
public const val `NS_E_MP3_FORMAT_NOT_FOUND`: Int = -1072885846;
public const val `NS_E_MPDB_GENERIC`: Int = -1072885812;
public const val `NS_E_MSAUDIO_NOT_INSTALLED`: Int = -1072886855;
public const val `NS_E_MSBD_NO_LONGER_SUPPORTED`: Int = -1072877844;
public const val `NS_E_MULTICAST_DISABLED`: Int = -1072877847;
public const val `NS_E_MULTICAST_PLUGIN_NOT_ENABLED`: Int = -1072884648;
public const val `NS_E_MULTIPLE_AUDIO_CODECS`: Int = -1072882761;
public const val `NS_E_MULTIPLE_AUDIO_FORMATS`: Int = -1072882760;
public const val `NS_E_MULTIPLE_FILE_BITRATES`: Int = -1072882736;
public const val `NS_E_MULTIPLE_SCRIPT_BITRATES`: Int = -1072882738;
public const val `NS_E_MULTIPLE_VBR_AUDIENCES`: Int = -1072882763;
public const val `NS_E_MULTIPLE_VIDEO_CODECS`: Int = -1072882755;
public const val `NS_E_MULTIPLE_VIDEO_SIZES`: Int = -1072882754;
public const val `NS_E_NAMESPACE_BAD_NAME`: Int = -1072884842;
public const val `NS_E_NAMESPACE_BUFFER_TOO_SMALL`: Int = -1072884850;
public const val `NS_E_NAMESPACE_CALLBACK_NOT_FOUND`: Int = -1072884847;
public const val `NS_E_NAMESPACE_DUPLICATE_CALLBACK`: Int = -1072884848;
public const val `NS_E_NAMESPACE_DUPLICATE_NAME`: Int = -1072884845;
public const val `NS_E_NAMESPACE_EMPTY_NAME`: Int = -1072884844;
public const val `NS_E_NAMESPACE_INDEX_TOO_LARGE`: Int = -1072884843;
public const val `NS_E_NAMESPACE_NAME_TOO_LONG`: Int = -1072884846;
public const val `NS_E_NAMESPACE_NODE_CONFLICT`: Int = -1072884852;
public const val `NS_E_NAMESPACE_NODE_NOT_FOUND`: Int = -1072884851;
public const val `NS_E_NAMESPACE_TOO_MANY_CALLBACKS`: Int = -1072884849;
public const val `NS_E_NAMESPACE_WRONG_PERSIST`: Int = -1072884854;
public const val `NS_E_NAMESPACE_WRONG_SECURITY`: Int = -1072884841;
public const val `NS_E_NAMESPACE_WRONG_TYPE`: Int = -1072884853;
public const val `NS_E_NEED_CORE_REFERENCE`: Int = -1072885556;
public const val `NS_E_NEED_TO_ASK_USER`: Int = -1072885798;
public const val `NS_E_NETWORK_BUSY`: Int = -1072889842;
public const val `NS_E_NETWORK_RESOURCE_FAILURE`: Int = -1072889816;
public const val `NS_E_NETWORK_SERVICE_FAILURE`: Int = -1072889817;
public const val `NS_E_NETWORK_SINK_WRITE`: Int = -1072877832;
public const val `NS_E_NET_READ`: Int = -1072889835;
public const val `NS_E_NET_WRITE`: Int = -1072889836;
public const val `NS_E_NOCONNECTION`: Int = -1072889851;
public const val `NS_E_NOFUNNEL`: Int = -1072889844;
public const val `NS_E_NOMATCHING_ELEMENT`: Int = -1072882850;
public const val `NS_E_NOMATCHING_MEDIASOURCE`: Int = -1072882854;
public const val `NS_E_NONSQUAREPIXELMODE_MISMATCH`: Int = -1072882772;
public const val `NS_E_NOREGISTEREDWALKER`: Int = -1072889845;
public const val `NS_E_NOSOURCEGROUPS`: Int = -1072882816;
public const val `NS_E_NOSTATSAVAILABLE`: Int = -1072882819;
public const val `NS_E_NOTARCHIVING`: Int = -1072882818;
public const val `NS_E_NOTHING_TO_DO`: Int = -1072887823;
public const val `NS_E_NOTITLES`: Int = -1072889794;
public const val `NS_E_NOT_CONFIGURED`: Int = -1072886852;
public const val `NS_E_NOT_CONNECTED`: Int = -1072886837;
public const val `NS_E_NOT_CONTENT_PARTNER_TRACK`: Int = -1072884902;
public const val `NS_E_NOT_LICENSED`: Int = -1072889651;
public const val `NS_E_NOT_REBUILDING`: Int = -1072889811;
public const val `NS_E_NO_ACTIVE_SOURCEGROUP`: Int = -1072882830;
public const val `NS_E_NO_AUDIENCES`: Int = -1072882768;
public const val `NS_E_NO_AUDIODATA`: Int = -1072882807;
public const val `NS_E_NO_AUDIO_COMPAT`: Int = -1072882767;
public const val `NS_E_NO_AUDIO_TIMECOMPRESSION`: Int = -1072882729;
public const val `NS_E_NO_CD`: Int = -1072885856;
public const val `NS_E_NO_CD_BURNER`: Int = -1072885386;
public const val `NS_E_NO_CHANNELS`: Int = -1072889640;
public const val `NS_E_NO_DATAVIEW_SUPPORT`: Int = -1072882814;
public const val `NS_E_NO_DEVICE`: Int = -1072889743;
public const val `NS_E_NO_ERROR_STRING_FOUND`: Int = -1072885808;
public const val `NS_E_NO_EXISTING_PACKETIZER`: Int = -1072877827;
public const val `NS_E_NO_FORMATS`: Int = -1072889749;
public const val `NS_E_NO_FRAMES_SUBMITTED_TO_ANALYZER`: Int = -1072882777;
public const val `NS_E_NO_LOCALPLAY`: Int = -1072889843;
public const val `NS_E_NO_MBR_WITH_TIMECODE`: Int = -1072882726;
public const val `NS_E_NO_MEDIAFORMAT_IN_SOURCE`: Int = -1072882833;
public const val `NS_E_NO_MEDIA_IN_AUDIENCE`: Int = -1072882769;
public const val `NS_E_NO_MEDIA_PROTOCOL`: Int = -1072889445;
public const val `NS_E_NO_MORE_SAMPLES`: Int = -1072886833;
public const val `NS_E_NO_MULTICAST`: Int = -1072887822;
public const val `NS_E_NO_MULTIPASS_FOR_LIVEDEVICE`: Int = -1072882793;
public const val `NS_E_NO_NEW_CONNECTIONS`: Int = -1072884451;
public const val `NS_E_NO_PAL_INVERSE_TELECINE`: Int = -1072882780;
public const val `NS_E_NO_PDA`: Int = -1072885383;
public const val `NS_E_NO_PROFILE_IN_SOURCEGROUP`: Int = -1072882841;
public const val `NS_E_NO_PROFILE_NAME`: Int = -1072882765;
public const val `NS_E_NO_REALTIME_PREPROCESS`: Int = -1072882804;
public const val `NS_E_NO_REALTIME_TIMECOMPRESSION`: Int = -1072882810;
public const val `NS_E_NO_REFERENCES`: Int = -1072889748;
public const val `NS_E_NO_REPEAT_PREPROCESS`: Int = -1072882803;
public const val `NS_E_NO_SCRIPT_ENGINE`: Int = -1072884356;
public const val `NS_E_NO_SCRIPT_STREAM`: Int = -1072882829;
public const val `NS_E_NO_SERVER_CONTACT`: Int = -1072889650;
public const val `NS_E_NO_SMPTE_WITH_MULTIPLE_SOURCEGROUPS`: Int = -1072882775;
public const val `NS_E_NO_SPECIFIED_DEVICE`: Int = -1072889742;
public const val `NS_E_NO_STREAM`: Int = -1072889805;
public const val `NS_E_NO_TWOPASS_TIMECOMPRESSION`: Int = -1072882728;
public const val `NS_E_NO_VALID_OUTPUT_STREAM`: Int = -1072882832;
public const val `NS_E_NO_VALID_SOURCE_PLUGIN`: Int = -1072882831;
public const val `NS_E_NUM_LANGUAGE_MISMATCH`: Int = -1072882789;
public const val `NS_E_OFFLINE_MODE`: Int = -1072886838;
public const val `NS_E_OPEN_CONTAINING_FOLDER_FAILED`: Int = -1072884893;
public const val `NS_E_OPEN_FILE_LIMIT`: Int = -1072889807;
public const val `NS_E_OUTPUT_PROTECTION_LEVEL_UNSUPPORTED`: Int = -1072879356;
public const val `NS_E_OUTPUT_PROTECTION_SCHEME_UNSUPPORTED`: Int = -1072879350;
public const val `NS_E_PACKETSINK_UNKNOWN_FEC_STREAM`: Int = -1072877814;
public const val `NS_E_PAGING_ERROR`: Int = -1072889758;
public const val `NS_E_PARTIALLY_REBUILT_DISK`: Int = -1072889753;
public const val `NS_E_PDA_CANNOT_CREATE_ADDITIONAL_SYNC_RELATIONSHIP`: Int = -1072885371;
public const val `NS_E_PDA_CANNOT_SYNC_FROM_INTERNET`: Int = -1072885196;
public const val `NS_E_PDA_CANNOT_SYNC_FROM_LOCATION`: Int = -1072885357;
public const val `NS_E_PDA_CANNOT_SYNC_INVALID_PLAYLIST`: Int = -1072885195;
public const val `NS_E_PDA_CANNOT_TRANSCODE`: Int = -1072885367;
public const val `NS_E_PDA_CANNOT_TRANSCODE_TO_AUDIO`: Int = -1072885187;
public const val `NS_E_PDA_CANNOT_TRANSCODE_TO_IMAGE`: Int = -1072885185;
public const val `NS_E_PDA_CANNOT_TRANSCODE_TO_VIDEO`: Int = -1072885186;
public const val `NS_E_PDA_CEWMDM_DRM_ERROR`: Int = -1072885183;
public const val `NS_E_PDA_DELETE_FAILED`: Int = -1072885192;
public const val `NS_E_PDA_DEVICESUPPORTDISABLED`: Int = -1072885360;
public const val `NS_E_PDA_DEVICE_FULL`: Int = -1072885377;
public const val `NS_E_PDA_DEVICE_FULL_IN_SESSION`: Int = -1072885375;
public const val `NS_E_PDA_DEVICE_NOT_RESPONDING`: Int = -1072885190;
public const val `NS_E_PDA_ENCODER_NOT_RESPONDING`: Int = -1072885358;
public const val `NS_E_PDA_FAILED_TO_BURN`: Int = -1072885542;
public const val `NS_E_PDA_FAILED_TO_ENCRYPT_TRANSCODED_FILE`: Int = -1072885188;
public const val `NS_E_PDA_FAILED_TO_RETRIEVE_FILE`: Int = -1072885191;
public const val `NS_E_PDA_FAILED_TO_SYNCHRONIZE_FILE`: Int = -1072885194;
public const val `NS_E_PDA_FAILED_TO_TRANSCODE_PHOTO`: Int = -1072885189;
public const val `NS_E_PDA_FAIL_READ_WAVE_FILE`: Int = -1072885379;
public const val `NS_E_PDA_FAIL_SELECT_DEVICE`: Int = -1072885380;
public const val `NS_E_PDA_INITIALIZINGDEVICES`: Int = -1072885363;
public const val `NS_E_PDA_MANUALDEVICE`: Int = -1072885373;
public const val `NS_E_PDA_NO_LONGER_AVAILABLE`: Int = -1072885359;
public const val `NS_E_PDA_NO_TRANSCODE_OF_DRM`: Int = -1072885370;
public const val `NS_E_PDA_OBSOLETE_SP`: Int = -1072885362;
public const val `NS_E_PDA_PARTNERSHIPNOTEXIST`: Int = -1072885372;
public const val `NS_E_PDA_RETRIEVED_FILE_FILENAME_TOO_LONG`: Int = -1072885184;
public const val `NS_E_PDA_SYNC_FAILED`: Int = -1072885193;
public const val `NS_E_PDA_SYNC_LOGIN_ERROR`: Int = -1072885180;
public const val `NS_E_PDA_SYNC_RUNNING`: Int = -1072885181;
public const val `NS_E_PDA_TITLE_COLLISION`: Int = -1072885361;
public const val `NS_E_PDA_TOO_MANY_FILES_IN_DIRECTORY`: Int = -1072885366;
public const val `NS_E_PDA_TOO_MANY_FILE_COLLISIONS`: Int = -1072885368;
public const val `NS_E_PDA_TRANSCODECACHEFULL`: Int = -1072885369;
public const val `NS_E_PDA_TRANSCODE_CODEC_NOT_FOUND`: Int = -1072885179;
public const val `NS_E_PDA_TRANSCODE_NOT_PERMITTED`: Int = -1072885364;
public const val `NS_E_PDA_UNSPECIFIED_ERROR`: Int = -1072885382;
public const val `NS_E_PDA_UNSUPPORTED_FORMAT`: Int = -1072885384;
public const val `NS_E_PLAYLIST_CONTAINS_ERRORS`: Int = -1072885569;
public const val `NS_E_PLAYLIST_END_RECEDING`: Int = -1072884547;
public const val `NS_E_PLAYLIST_ENTRY_ALREADY_PLAYING`: Int = -1072884556;
public const val `NS_E_PLAYLIST_ENTRY_HAS_CHANGED`: Int = -1072877835;
public const val `NS_E_PLAYLIST_ENTRY_NOT_IN_PLAYLIST`: Int = -1072884552;
public const val `NS_E_PLAYLIST_ENTRY_SEEK`: Int = -1072884551;
public const val `NS_E_PLAYLIST_PARSE_FAILURE`: Int = -1072884554;
public const val `NS_E_PLAYLIST_PLUGIN_NOT_FOUND`: Int = -1072884353;
public const val `NS_E_PLAYLIST_RECURSIVE_PLAYLISTS`: Int = -1072884550;
public const val `NS_E_PLAYLIST_SHUTDOWN`: Int = -1072884548;
public const val `NS_E_PLAYLIST_TOO_MANY_NESTED_PLAYLISTS`: Int = -1072884549;
public const val `NS_E_PLAYLIST_UNSUPPORTED_ENTRY`: Int = -1072884553;
public const val `NS_E_PLUGIN_CLSID_INVALID`: Int = -1072882826;
public const val `NS_E_PLUGIN_ERROR_REPORTED`: Int = -1072884355;
public const val `NS_E_PLUGIN_NOTSHUTDOWN`: Int = -1072885802;
public const val `NS_E_PORT_IN_USE`: Int = -1072884342;
public const val `NS_E_PORT_IN_USE_HTTP`: Int = -1072884341;
public const val `NS_E_PROCESSINGSHOWSYNCWIZARD`: Int = -1072885365;
public const val `NS_E_PROFILE_MISMATCH`: Int = -1072882821;
public const val `NS_E_PROPERTY_NOT_FOUND`: Int = -1072876854;
public const val `NS_E_PROPERTY_NOT_SUPPORTED`: Int = -1072876846;
public const val `NS_E_PROPERTY_READ_ONLY`: Int = -1072876852;
public const val `NS_E_PROTECTED_CONTENT`: Int = -1072886851;
public const val `NS_E_PROTOCOL_MISMATCH`: Int = -1072889838;
public const val `NS_E_PROXY_ACCESSDENIED`: Int = -1072877834;
public const val `NS_E_PROXY_CONNECT_TIMEOUT`: Int = -1072877817;
public const val `NS_E_PROXY_DNS_TIMEOUT`: Int = -1072877840;
public const val `NS_E_PROXY_NOT_FOUND`: Int = -1072877843;
public const val `NS_E_PROXY_SOURCE_ACCESSDENIED`: Int = -1072877833;
public const val `NS_E_PROXY_TIMEOUT`: Int = -1072877851;
public const val `NS_E_PUBLISHING_POINT_INVALID_REQUEST_WHILE_STARTED`: Int = -1072884649;
public const val `NS_E_PUBLISHING_POINT_REMOVED`: Int = -1072884646;
public const val `NS_E_PUBLISHING_POINT_STOPPED`: Int = -1072884642;
public const val `NS_E_PUSH_CANNOTCONNECT`: Int = -1072877813;
public const val `NS_E_PUSH_DUPLICATE_PUBLISHING_POINT_NAME`: Int = -1072884448;
public const val `NS_E_REBOOT_RECOMMENDED`: Int = -1072878854;
public const val `NS_E_REBOOT_REQUIRED`: Int = -1072878853;
public const val `NS_E_RECORDQ_DISK_FULL`: Int = -1072882781;
public const val `NS_E_REDBOOK_ENABLED_WHILE_COPYING`: Int = -1072885840;
public const val `NS_E_REDIRECT`: Int = -1072884856;
public const val `NS_E_REDIRECT_TO_PROXY`: Int = -1072877855;
public const val `NS_E_REFUSED_BY_SERVER`: Int = -1072877849;
public const val `NS_E_REG_FLUSH_FAILURE`: Int = -1072879720;
public const val `NS_E_REMIRRORED_DISK`: Int = -1072889655;
public const val `NS_E_REQUIRE_STREAMING_CLIENT`: Int = -1072877836;
public const val `NS_E_RESET_SOCKET_CONNECTION`: Int = -1072877824;
public const val `NS_E_RESOURCE_GONE`: Int = -1072877828;
public const val `NS_E_SAME_AS_INPUT_COMBINATION`: Int = -1072882734;
public const val `NS_E_SCHEMA_CLASSIFY_FAILURE`: Int = -1072876844;
public const val `NS_E_SCRIPT_DEBUGGER_NOT_INSTALLED`: Int = -1072884350;
public const val `NS_E_SDK_BUFFERTOOSMALL`: Int = -1072886828;
public const val `NS_E_SERVER_ACCESSDENIED`: Int = -1072877829;
public const val `NS_E_SERVER_DNS_TIMEOUT`: Int = -1072877841;
public const val `NS_E_SERVER_NOT_FOUND`: Int = -1072889803;
public const val `NS_E_SERVER_UNAVAILABLE`: Int = -1072877850;
public const val `NS_E_SESSION_INVALID`: Int = -1072877816;
public const val `NS_E_SESSION_NOT_FOUND`: Int = -1072877837;
public const val `NS_E_SETUP_BLOCKED`: Int = -1072878848;
public const val `NS_E_SETUP_DRM_MIGRATION_FAILED`: Int = -1072878851;
public const val `NS_E_SETUP_DRM_MIGRATION_FAILED_AND_IGNORABLE_FAILURE`: Int = -1072878849;
public const val `NS_E_SETUP_IGNORABLE_FAILURE`: Int = -1072878850;
public const val `NS_E_SETUP_INCOMPLETE`: Int = -1072878852;
public const val `NS_E_SET_DISK_UID_FAILED`: Int = -1072889823;
public const val `NS_E_SHARING_STATE_OUT_OF_SYNC`: Int = -1072885772;
public const val `NS_E_SHARING_VIOLATION`: Int = -1072885809;
public const val `NS_E_SHUTDOWN`: Int = -1072889814;
public const val `NS_E_SLOW_READ_DIGITAL`: Int = -1072885852;
public const val `NS_E_SLOW_READ_DIGITAL_WITH_ERRORCORRECTION`: Int = -1072885251;
public const val `NS_E_SMPTEMODE_MISMATCH`: Int = -1072882771;
public const val `NS_E_SOURCEGROUP_NOTPREPARED`: Int = -1072882822;
public const val `NS_E_SOURCE_CANNOT_LOOP`: Int = -1072882733;
public const val `NS_E_SOURCE_NOTSPECIFIED`: Int = -1072882811;
public const val `NS_E_SOURCE_PLUGIN_NOT_FOUND`: Int = -1072884354;
public const val `NS_E_SPEECHEDL_ON_NON_MIXEDMODE`: Int = -1072882798;
public const val `NS_E_STALE_PRESENTATION`: Int = -1072884855;
public const val `NS_E_STREAM_END`: Int = -1072889804;
public const val `NS_E_STRIDE_REFUSED`: Int = -1072889787;
public const val `NS_E_SUBSCRIPTIONSERVICE_DOWNLOAD_TIMEOUT`: Int = -1072884896;
public const val `NS_E_SUBSCRIPTIONSERVICE_LOGIN_FAILED`: Int = -1072884897;
public const val `NS_E_SUBSCRIPTIONSERVICE_PLAYBACK_DISALLOWED`: Int = -1072884906;
public const val `NS_E_SYNCWIZ_CANNOT_CHANGE_SETTINGS`: Int = -1072885265;
public const val `NS_E_SYNCWIZ_DEVICE_FULL`: Int = -1072885266;
public const val `NS_E_TABLE_KEY_NOT_FOUND`: Int = -1072876851;
public const val `NS_E_TAMPERED_CONTENT`: Int = -1072886849;
public const val `NS_E_TCP_DISABLED`: Int = -1072889646;
public const val `NS_E_TIGER_FAIL`: Int = -1072889776;
public const val `NS_E_TIMECODE_REQUIRES_VIDEOSTREAM`: Int = -1072882727;
public const val `NS_E_TIMEOUT`: Int = -1072889837;
public const val `NS_E_TITLE_BITRATE`: Int = -1072889643;
public const val `NS_E_TITLE_SIZE_EXCEEDED`: Int = -1072889648;
public const val `NS_E_TOO_MANY_AUDIO`: Int = -1072882852;
public const val `NS_E_TOO_MANY_DEVICECONTROL`: Int = -1072882794;
public const val `NS_E_TOO_MANY_HOPS`: Int = -1072877822;
public const val `NS_E_TOO_MANY_MULTICAST_SINKS`: Int = -1072884650;
public const val `NS_E_TOO_MANY_SESS`: Int = -1072889841;
public const val `NS_E_TOO_MANY_TITLES`: Int = -1072889649;
public const val `NS_E_TOO_MANY_VIDEO`: Int = -1072882851;
public const val `NS_E_TOO_MUCH_DATA`: Int = -1072886836;
public const val `NS_E_TOO_MUCH_DATA_FROM_SERVER`: Int = -1072877819;
public const val `NS_E_TRACK_DOWNLOAD_REQUIRES_ALBUM_PURCHASE`: Int = -1072884901;
public const val `NS_E_TRACK_DOWNLOAD_REQUIRES_PURCHASE`: Int = -1072884900;
public const val `NS_E_TRACK_PURCHASE_MAXIMUM_EXCEEDED`: Int = -1072884899;
public const val `NS_E_TRANSCODE_DELETECACHEERROR`: Int = -1072885264;
public const val `NS_E_TRANSFORM_PLUGIN_INVALID`: Int = -1072882714;
public const val `NS_E_TRANSFORM_PLUGIN_NOT_FOUND`: Int = -1072882715;
public const val `NS_E_UDP_DISABLED`: Int = -1072889647;
public const val `NS_E_UNABLE_TO_CREATE_RIP_LOCATION`: Int = -1072885552;
public const val `NS_E_UNCOMPRESSED_DIGITAL_AUDIO_PROTECTION_LEVEL_UNSUPPORTED`: Int = -1072879351;
public const val `NS_E_UNCOMPRESSED_DIGITAL_VIDEO_PROTECTION_LEVEL_UNSUPPORTED`: Int = -1072879354;
public const val `NS_E_UNCOMP_COMP_COMBINATION`: Int = -1072882762;
public const val `NS_E_UNEXPECTED_DISPLAY_SETTINGS`: Int = -1072882808;
public const val `NS_E_UNEXPECTED_MSAUDIO_ERROR`: Int = -1072886854;
public const val `NS_E_UNKNOWN_PROTOCOL`: Int = -1072877856;
public const val `NS_E_UNRECOGNIZED_STREAM_TYPE`: Int = -1072889818;
public const val `NS_E_UNSUPPORTED_ARCHIVEOPERATION`: Int = -1072882824;
public const val `NS_E_UNSUPPORTED_ARCHIVETYPE`: Int = -1072882825;
public const val `NS_E_UNSUPPORTED_ENCODER_DEVICE`: Int = -1072882809;
public const val `NS_E_UNSUPPORTED_LANGUAGE`: Int = -1072884644;
public const val `NS_E_UNSUPPORTED_LOAD_TYPE`: Int = -1072884653;
public const val `NS_E_UNSUPPORTED_PROPERTY`: Int = -1072886835;
public const val `NS_E_UNSUPPORTED_SOURCETYPE`: Int = -1072882853;
public const val `NS_E_URLLIST_INVALIDFORMAT`: Int = -1072885651;
public const val `NS_E_USER_STOP`: Int = -1072885847;
public const val `NS_E_USE_FILE_SOURCE`: Int = -1072876855;
public const val `NS_E_VBRMODE_MISMATCH`: Int = -1072882787;
public const val `NS_E_VIDCAPCREATEWINDOW`: Int = -1072882835;
public const val `NS_E_VIDCAPDRVINUSE`: Int = -1072882834;
public const val `NS_E_VIDCAPSTARTFAILED`: Int = -1072882839;
public const val `NS_E_VIDEODEVICE_BUSY`: Int = -1072882844;
public const val `NS_E_VIDEODEVICE_UNEXPECTED`: Int = -1072882843;
public const val `NS_E_VIDEODRIVER_UNSTABLE`: Int = -1072882840;
public const val `NS_E_VIDEO_BITRATE_STEPDOWN`: Int = -1072882752;
public const val `NS_E_VIDEO_CODEC_ERROR`: Int = -1072886843;
public const val `NS_E_VIDEO_CODEC_NOT_INSTALLED`: Int = -1072886844;
public const val `NS_E_VIDSOURCECOMPRESSION`: Int = -1072882838;
public const val `NS_E_VIDSOURCESIZE`: Int = -1072882837;
public const val `NS_E_WALKER_SERVER`: Int = -1072889779;
public const val `NS_E_WALKER_UNKNOWN`: Int = -1072889780;
public const val `NS_E_WALKER_USAGE`: Int = -1072889778;
public const val `NS_E_WAVE_OPEN`: Int = -1072889747;
public const val `NS_E_WINSOCK_ERROR_STRING`: Int = -1072885463;
public const val `NS_E_WIZARD_RUNNING`: Int = -1072884348;
public const val `NS_E_WMDM_REVOKED`: Int = -1072885572;
public const val `NS_E_WMDRM_DEPRECATED`: Int = -1072886818;
public const val `NS_E_WME_VERSION_MISMATCH`: Int = -1072882805;
public const val `NS_E_WMG_CANNOTQUEUE`: Int = -1072885684;
public const val `NS_E_WMG_COPP_SECURITY_INVALID`: Int = -1072885678;
public const val `NS_E_WMG_COPP_UNSUPPORTED`: Int = -1072885677;
public const val `NS_E_WMG_FILETRANSFERNOTALLOWED`: Int = -1072885672;
public const val `NS_E_WMG_INVALIDSTATE`: Int = -1072885676;
public const val `NS_E_WMG_INVALID_COPP_CERTIFICATE`: Int = -1072885679;
public const val `NS_E_WMG_LICENSE_TAMPERED`: Int = -1072885660;
public const val `NS_E_WMG_NOSDKINTERFACE`: Int = -1072885674;
public const val `NS_E_WMG_NOTALLOUTPUTSRENDERED`: Int = -1072885673;
public const val `NS_E_WMG_PLUGINUNAVAILABLE`: Int = -1072885685;
public const val `NS_E_WMG_PREROLLLICENSEACQUISITIONNOTALLOWED`: Int = -1072885683;
public const val `NS_E_WMG_RATEUNAVAILABLE`: Int = -1072885686;
public const val `NS_E_WMG_SINKALREADYEXISTS`: Int = -1072885675;
public const val `NS_E_WMG_UNEXPECTEDPREROLLSTATUS`: Int = -1072885682;
public const val `NS_E_WMPBR_BACKUPCANCEL`: Int = -1072885455;
public const val `NS_E_WMPBR_BACKUPRESTOREFAILED`: Int = -1072885448;
public const val `NS_E_WMPBR_DRIVE_INVALID`: Int = -1072885449;
public const val `NS_E_WMPBR_ERRORWITHURL`: Int = -1072885453;
public const val `NS_E_WMPBR_NAMECOLLISION`: Int = -1072885452;
public const val `NS_E_WMPBR_NOLISTENER`: Int = -1072885456;
public const val `NS_E_WMPBR_RESTORECANCEL`: Int = -1072885454;
public const val `NS_E_WMPCORE_BUFFERTOOSMALL`: Int = -1072885633;
public const val `NS_E_WMPCORE_BUSY`: Int = -1072885577;
public const val `NS_E_WMPCORE_COCREATEFAILEDFORGITOBJECT`: Int = -1072885635;
public const val `NS_E_WMPCORE_CODEC_DOWNLOAD_NOT_ALLOWED`: Int = -1072885604;
public const val `NS_E_WMPCORE_CODEC_NOT_FOUND`: Int = -1072885605;
public const val `NS_E_WMPCORE_CODEC_NOT_TRUSTED`: Int = -1072885606;
public const val `NS_E_WMPCORE_CURRENT_MEDIA_NOT_ACTIVE`: Int = -1072885591;
public const val `NS_E_WMPCORE_DEVICE_DRIVERS_MISSING`: Int = -1072885539;
public const val `NS_E_WMPCORE_ERRORMANAGERNOTAVAILABLE`: Int = -1072885619;
public const val `NS_E_WMPCORE_ERRORSINKNOTREGISTERED`: Int = -1072885620;
public const val `NS_E_WMPCORE_ERROR_DOWNLOADING_PLAYLIST`: Int = -1072885603;
public const val `NS_E_WMPCORE_FAILEDTOGETMARSHALLEDEVENTHANDLERINTERFACE`: Int = -1072885634;
public const val `NS_E_WMPCORE_FAILED_TO_BUILD_PLAYLIST`: Int = -1072885602;
public const val `NS_E_WMPCORE_FILE_NOT_FOUND`: Int = -1072885574;
public const val `NS_E_WMPCORE_GRAPH_NOT_IN_LIST`: Int = -1072885622;
public const val `NS_E_WMPCORE_INVALIDPLAYLISTMODE`: Int = -1072885631;
public const val `NS_E_WMPCORE_INVALID_PLAYLIST_URL`: Int = -1072885585;
public const val `NS_E_WMPCORE_ITEMNOTINPLAYLIST`: Int = -1072885626;
public const val `NS_E_WMPCORE_LIST_ENTRY_NO_REF`: Int = -1072885608;
public const val `NS_E_WMPCORE_MEDIA_ALTERNATE_REF_EMPTY`: Int = -1072885596;
public const val `NS_E_WMPCORE_MEDIA_CHILD_PLAYLIST_UNAVAILABLE`: Int = -1072885576;
public const val `NS_E_WMPCORE_MEDIA_ERROR_RESUME_FAILED`: Int = -1072885617;
public const val `NS_E_WMPCORE_MEDIA_NO_CHILD_PLAYLIST`: Int = -1072885575;
public const val `NS_E_WMPCORE_MEDIA_UNAVAILABLE`: Int = -1072885581;
public const val `NS_E_WMPCORE_MEDIA_URL_TOO_LONG`: Int = -1072885560;
public const val `NS_E_WMPCORE_MISMATCHED_RUNTIME`: Int = -1072885584;
public const val `NS_E_WMPCORE_MISNAMED_FILE`: Int = -1072885607;
public const val `NS_E_WMPCORE_NOBROWSER`: Int = -1072885624;
public const val `NS_E_WMPCORE_NOSOURCEURLSTRING`: Int = -1072885636;
public const val `NS_E_WMPCORE_NO_PLAYABLE_MEDIA_IN_PLAYLIST`: Int = -1072885579;
public const val `NS_E_WMPCORE_NO_REF_IN_ENTRY`: Int = -1072885616;
public const val `NS_E_WMPCORE_PLAYLISTEMPTY`: Int = -1072885625;
public const val `NS_E_WMPCORE_PLAYLIST_EMPTY_NESTED_PLAYLIST_SKIPPED_ITEMS`: Int = -1072885578;
public const val `NS_E_WMPCORE_PLAYLIST_EMPTY_OR_SINGLE_MEDIA`: Int = -1072885621;
public const val `NS_E_WMPCORE_PLAYLIST_EVENT_ATTRIBUTE_ABSENT`: Int = -1072885594;
public const val `NS_E_WMPCORE_PLAYLIST_EVENT_EMPTY`: Int = -1072885593;
public const val `NS_E_WMPCORE_PLAYLIST_IMPORT_FAILED_NO_ITEMS`: Int = -1072885583;
public const val `NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_EXHAUSTED`: Int = -1072885600;
public const val `NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_INIT_FAILED`: Int = -1072885597;
public const val `NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_MORPH_FAILED`: Int = -1072885598;
public const val `NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NAME_NOT_FOUND`: Int = -1072885599;
public const val `NS_E_WMPCORE_PLAYLIST_ITEM_ALTERNATE_NONE`: Int = -1072885601;
public const val `NS_E_WMPCORE_PLAYLIST_NO_EVENT_NAME`: Int = -1072885595;
public const val `NS_E_WMPCORE_PLAYLIST_REPEAT_EMPTY`: Int = -1072885588;
public const val `NS_E_WMPCORE_PLAYLIST_REPEAT_END_MEDIA_NONE`: Int = -1072885586;
public const val `NS_E_WMPCORE_PLAYLIST_REPEAT_START_MEDIA_NONE`: Int = -1072885587;
public const val `NS_E_WMPCORE_PLAYLIST_STACK_EMPTY`: Int = -1072885592;
public const val `NS_E_WMPCORE_SOME_CODECS_MISSING`: Int = -1072885551;
public const val `NS_E_WMPCORE_TEMP_FILE_NOT_FOUND`: Int = -1072885573;
public const val `NS_E_WMPCORE_UNAVAILABLE`: Int = -1072885632;
public const val `NS_E_WMPCORE_UNRECOGNIZED_MEDIA_URL`: Int = -1072885623;
public const val `NS_E_WMPCORE_USER_CANCEL`: Int = -1072885589;
public const val `NS_E_WMPCORE_VIDEO_TRANSFORM_FILTER_INSERTION`: Int = -1072885582;
public const val `NS_E_WMPCORE_WEBHELPFAILED`: Int = -1072885618;
public const val `NS_E_WMPCORE_WMX_ENTRYREF_NO_REF`: Int = -1072885580;
public const val `NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_EMPTY`: Int = -1072885615;
public const val `NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_NAME_ILLEGAL`: Int = -1072885614;
public const val `NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_EMPTY`: Int = -1072885613;
public const val `NS_E_WMPCORE_WMX_LIST_ATTRIBUTE_VALUE_ILLEGAL`: Int = -1072885612;
public const val `NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_EMPTY`: Int = -1072885611;
public const val `NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_NAME_ILLEGAL`: Int = -1072885610;
public const val `NS_E_WMPCORE_WMX_LIST_ITEM_ATTRIBUTE_VALUE_EMPTY`: Int = -1072885609;
public const val `NS_E_WMPFLASH_CANT_FIND_COM_SERVER`: Int = -1072885559;
public const val `NS_E_WMPFLASH_INCOMPATIBLEVERSION`: Int = -1072885558;
public const val `NS_E_WMPIM_DIALUPFAILED`: Int = -1072885464;
public const val `NS_E_WMPIM_USERCANCELED`: Int = -1072885465;
public const val `NS_E_WMPIM_USEROFFLINE`: Int = -1072885466;
public const val `NS_E_WMPOCXGRAPH_IE_DISALLOWS_ACTIVEX_CONTROLS`: Int = -1072885557;
public const val `NS_E_WMPOCX_ERRORMANAGERNOTAVAILABLE`: Int = -1072885803;
public const val `NS_E_WMPOCX_NOT_RUNNING_REMOTELY`: Int = -1072885805;
public const val `NS_E_WMPOCX_NO_ACTIVE_CORE`: Int = -1072885806;
public const val `NS_E_WMPOCX_NO_REMOTE_CORE`: Int = -1072885807;
public const val `NS_E_WMPOCX_NO_REMOTE_WINDOW`: Int = -1072885804;
public const val `NS_E_WMPOCX_PLAYER_NOT_DOCKED`: Int = -1072885797;
public const val `NS_E_WMPOCX_REMOTE_PLAYER_ALREADY_RUNNING`: Int = -1072885766;
public const val `NS_E_WMPOCX_UNABLE_TO_LOAD_SKIN`: Int = -1072885781;
public const val `NS_E_WMPXML_ATTRIBUTENOTFOUND`: Int = -1072885833;
public const val `NS_E_WMPXML_EMPTYDOC`: Int = -1072885831;
public const val `NS_E_WMPXML_ENDOFDATA`: Int = -1072885835;
public const val `NS_E_WMPXML_NOERROR`: Int = -1072885836;
public const val `NS_E_WMPXML_PARSEERROR`: Int = -1072885834;
public const val `NS_E_WMPXML_PINOTFOUND`: Int = -1072885832;
public const val `NS_E_WMPZIP_CORRUPT`: Int = -1072885735;
public const val `NS_E_WMPZIP_FILENOTFOUND`: Int = -1072885734;
public const val `NS_E_WMPZIP_NOTAZIPFILE`: Int = -1072885736;
public const val `NS_E_WMP_ACCESS_DENIED`: Int = -1072885294;
public const val `NS_E_WMP_ADDTOLIBRARY_FAILED`: Int = -1072885817;
public const val `NS_E_WMP_ALREADY_IN_USE`: Int = -1072885346;
public const val `NS_E_WMP_AUDIO_CODEC_NOT_INSTALLED`: Int = -1072885305;
public const val `NS_E_WMP_AUDIO_DEVICE_LOST`: Int = -1072885275;
public const val `NS_E_WMP_AUDIO_HW_PROBLEM`: Int = -1072885318;
public const val `NS_E_WMP_AUTOPLAY_INVALID_STATE`: Int = -1072884996;
public const val `NS_E_WMP_BAD_DRIVER`: Int = -1072885295;
public const val `NS_E_WMP_BMP_BITMAP_NOT_CREATED`: Int = -1072885712;
public const val `NS_E_WMP_BMP_COMPRESSION_UNSUPPORTED`: Int = -1072885711;
public const val `NS_E_WMP_BMP_INVALID_BITMASK`: Int = -1072885714;
public const val `NS_E_WMP_BMP_INVALID_FORMAT`: Int = -1072885710;
public const val `NS_E_WMP_BMP_TOPDOWN_DIB_UNSUPPORTED`: Int = -1072885713;
public const val `NS_E_WMP_BSTR_TOO_LONG`: Int = -1072885006;
public const val `NS_E_WMP_BURN_DISC_OVERFLOW`: Int = -1072885287;
public const val `NS_E_WMP_CANNOT_BURN_NON_LOCAL_FILE`: Int = -1072885546;
public const val `NS_E_WMP_CANNOT_FIND_FILE`: Int = -1072885353;
public const val `NS_E_WMP_CANNOT_FIND_FOLDER`: Int = -1072885801;
public const val `NS_E_WMP_CANT_PLAY_PROTECTED`: Int = -1072885773;
public const val `NS_E_WMP_CD_ANOTHER_USER`: Int = -1072885297;
public const val `NS_E_WMP_CD_STASH_NO_SPACE`: Int = -1072885291;
public const val `NS_E_WMP_CODEC_NEEDED_WITH_4CC`: Int = -1072885343;
public const val `NS_E_WMP_CODEC_NEEDED_WITH_FORMATTAG`: Int = -1072885342;
public const val `NS_E_WMP_COMPONENT_REVOKED`: Int = -1072884986;
public const val `NS_E_WMP_CONNECT_TIMEOUT`: Int = -1072885311;
public const val `NS_E_WMP_CONVERT_FILE_CORRUPT`: Int = -1072885413;
public const val `NS_E_WMP_CONVERT_FILE_FAILED`: Int = -1072885416;
public const val `NS_E_WMP_CONVERT_NO_RIGHTS_ERRORURL`: Int = -1072885415;
public const val `NS_E_WMP_CONVERT_NO_RIGHTS_NOERRORURL`: Int = -1072885414;
public const val `NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_ERRORURL`: Int = -1072885412;
public const val `NS_E_WMP_CONVERT_PLUGIN_UNAVAILABLE_NOERRORURL`: Int = -1072885411;
public const val `NS_E_WMP_CONVERT_PLUGIN_UNKNOWN_FILE_OWNER`: Int = -1072885410;
public const val `NS_E_WMP_CS_JPGPOSITIONIMAGE`: Int = -1072885746;
public const val `NS_E_WMP_CS_NOTEVENLYDIVISIBLE`: Int = -1072885745;
public const val `NS_E_WMP_DAI_SONGTOOSHORT`: Int = -1072885687;
public const val `NS_E_WMP_DRM_ACQUIRING_LICENSE`: Int = -1072885246;
public const val `NS_E_WMP_DRM_CANNOT_RESTORE`: Int = -1072885288;
public const val `NS_E_WMP_DRM_COMPONENT_FAILURE`: Int = -1072885278;
public const val `NS_E_WMP_DRM_CORRUPT_BACKUP`: Int = -1072885324;
public const val `NS_E_WMP_DRM_DRIVER_AUTH_FAILURE`: Int = -1072885302;
public const val `NS_E_WMP_DRM_GENERIC_LICENSE_FAILURE`: Int = -1072885286;
public const val `NS_E_WMP_DRM_INDIV_FAILED`: Int = -1072885283;
public const val `NS_E_WMP_DRM_INVALID_SIG`: Int = -1072885289;
public const val `NS_E_WMP_DRM_LICENSE_CONTENT_REVOKED`: Int = -1072885241;
public const val `NS_E_WMP_DRM_LICENSE_EXPIRED`: Int = -1072885245;
public const val `NS_E_WMP_DRM_LICENSE_NOSAP`: Int = -1072885240;
public const val `NS_E_WMP_DRM_LICENSE_NOTACQUIRED`: Int = -1072885244;
public const val `NS_E_WMP_DRM_LICENSE_NOTENABLED`: Int = -1072885243;
public const val `NS_E_WMP_DRM_LICENSE_SERVER_UNAVAILABLE`: Int = -1072885323;
public const val `NS_E_WMP_DRM_LICENSE_UNUSABLE`: Int = -1072885242;
public const val `NS_E_WMP_DRM_NEEDS_AUTHORIZATION`: Int = -1072885296;
public const val `NS_E_WMP_DRM_NEW_HARDWARE`: Int = -1072885290;
public const val `NS_E_WMP_DRM_NOT_ACQUIRING`: Int = -1072885055;
public const val `NS_E_WMP_DRM_NO_DEVICE_CERT`: Int = -1072885277;
public const val `NS_E_WMP_DRM_NO_RIGHTS`: Int = -1072885284;
public const val `NS_E_WMP_DRM_NO_SECURE_CLOCK`: Int = -1072885285;
public const val `NS_E_WMP_DRM_UNABLE_TO_ACQUIRE_LICENSE`: Int = -1072885239;
public const val `NS_E_WMP_DSHOW_UNSUPPORTED_FORMAT`: Int = -1072885350;
public const val `NS_E_WMP_ERASE_FAILED`: Int = -1072885548;
public const val `NS_E_WMP_EXTERNAL_NOTREADY`: Int = -1072885796;
public const val `NS_E_WMP_FAILED_TO_OPEN_IMAGE`: Int = -1072885692;
public const val `NS_E_WMP_FAILED_TO_OPEN_WMD`: Int = -1072885774;
public const val `NS_E_WMP_FAILED_TO_RIP_TRACK`: Int = -1072885549;
public const val `NS_E_WMP_FAILED_TO_SAVE_FILE`: Int = -1072885777;
public const val `NS_E_WMP_FAILED_TO_SAVE_PLAYLIST`: Int = -1072885775;
public const val `NS_E_WMP_FILESCANALREADYSTARTED`: Int = -1072885826;
public const val `NS_E_WMP_FILE_DOES_NOT_FIT_ON_CD`: Int = -1072885544;
public const val `NS_E_WMP_FILE_NO_DURATION`: Int = -1072885543;
public const val `NS_E_WMP_FILE_OPEN_FAILED`: Int = -1072885327;
public const val `NS_E_WMP_FILE_TYPE_CANNOT_BURN_TO_AUDIO_CD`: Int = -1072885545;
public const val `NS_E_WMP_FORMAT_FAILED`: Int = -1072885547;
public const val `NS_E_WMP_GIF_BAD_VERSION_NUMBER`: Int = -1072885722;
public const val `NS_E_WMP_GIF_INVALID_FORMAT`: Int = -1072885723;
public const val `NS_E_WMP_GIF_NO_IMAGE_IN_FILE`: Int = -1072885721;
public const val `NS_E_WMP_GIF_UNEXPECTED_ENDOFFILE`: Int = -1072885724;
public const val `NS_E_WMP_GOFULLSCREEN_FAILED`: Int = -1072885313;
public const val `NS_E_WMP_HME_INVALIDOBJECTID`: Int = -1072885825;
public const val `NS_E_WMP_HME_NOTSEARCHABLEFORITEMS`: Int = -1072885823;
public const val `NS_E_WMP_HME_STALEREQUEST`: Int = -1072885822;
public const val `NS_E_WMP_HWND_NOTFOUND`: Int = -1072885156;
public const val `NS_E_WMP_IMAGE_FILETYPE_UNSUPPORTED`: Int = -1072885726;
public const val `NS_E_WMP_IMAGE_INVALID_FORMAT`: Int = -1072885725;
public const val `NS_E_WMP_IMAPI2_ERASE_DEVICE_BUSY`: Int = -1072885279;
public const val `NS_E_WMP_IMAPI2_ERASE_FAIL`: Int = -1072885280;
public const val `NS_E_WMP_IMAPI_DEVICE_BUSY`: Int = -1072885330;
public const val `NS_E_WMP_IMAPI_DEVICE_INVALIDTYPE`: Int = -1072885303;
public const val `NS_E_WMP_IMAPI_DEVICE_NOTPRESENT`: Int = -1072885331;
public const val `NS_E_WMP_IMAPI_FAILURE`: Int = -1072885345;
public const val `NS_E_WMP_IMAPI_GENERIC`: Int = -1072885333;
public const val `NS_E_WMP_IMAPI_LOSS_OF_STREAMING`: Int = -1072885329;
public const val `NS_E_WMP_IMAPI_MEDIA_INCOMPATIBLE`: Int = -1072885274;
public const val `NS_E_WMP_INVALID_ASX`: Int = -1072885347;
public const val `NS_E_WMP_INVALID_KEY`: Int = -1072885298;
public const val `NS_E_WMP_INVALID_LIBRARY_ADD`: Int = -1072885316;
public const val `NS_E_WMP_INVALID_MAX_VAL`: Int = -1072885751;
public const val `NS_E_WMP_INVALID_MIN_VAL`: Int = -1072885750;
public const val `NS_E_WMP_INVALID_PROTOCOL`: Int = -1072885317;
public const val `NS_E_WMP_INVALID_REQUEST`: Int = -1072885292;
public const val `NS_E_WMP_INVALID_SKIN`: Int = -1072885780;
public const val `NS_E_WMP_JPGTRANSPARENCY`: Int = -1072885755;
public const val `NS_E_WMP_JPG_BAD_DCTSIZE`: Int = -1072885707;
public const val `NS_E_WMP_JPG_BAD_PRECISION`: Int = -1072885705;
public const val `NS_E_WMP_JPG_BAD_VERSION_NUMBER`: Int = -1072885706;
public const val `NS_E_WMP_JPG_CCIR601_NOTIMPL`: Int = -1072885704;
public const val `NS_E_WMP_JPG_FRACT_SAMPLE_NOTIMPL`: Int = -1072885701;
public const val `NS_E_WMP_JPG_IMAGE_TOO_BIG`: Int = -1072885700;
public const val `NS_E_WMP_JPG_INVALID_FORMAT`: Int = -1072885708;
public const val `NS_E_WMP_JPG_JERR_ARITHCODING_NOTIMPL`: Int = -1072885709;
public const val `NS_E_WMP_JPG_NO_IMAGE_IN_FILE`: Int = -1072885703;
public const val `NS_E_WMP_JPG_READ_ERROR`: Int = -1072885702;
public const val `NS_E_WMP_JPG_SOF_UNSUPPORTED`: Int = -1072885698;
public const val `NS_E_WMP_JPG_UNEXPECTED_ENDOFFILE`: Int = -1072885699;
public const val `NS_E_WMP_JPG_UNKNOWN_MARKER`: Int = -1072885697;
public const val `NS_E_WMP_LICENSE_REQUIRED`: Int = -1072885238;
public const val `NS_E_WMP_LICENSE_RESTRICTS`: Int = -1072885293;
public const val `NS_E_WMP_LOCKEDINSKINMODE`: Int = -1072885778;
public const val `NS_E_WMP_LOGON_FAILURE`: Int = -1072885354;
public const val `NS_E_WMP_MF_CODE_EXPIRED`: Int = -1072885824;
public const val `NS_E_WMP_MLS_STALE_DATA`: Int = -1072885795;
public const val `NS_E_WMP_MMS_NOT_SUPPORTED`: Int = -1072885315;
public const val `NS_E_WMP_MSSAP_NOT_AVAILABLE`: Int = -1072885341;
public const val `NS_E_WMP_MULTICAST_DISABLED`: Int = -1072885310;
public const val `NS_E_WMP_MULTIPLE_ERROR_IN_PLAYLIST`: Int = -1072885281;
public const val `NS_E_WMP_NEED_UPGRADE`: Int = -1072885319;
public const val `NS_E_WMP_NETWORK_ERROR`: Int = -1072885312;
public const val `NS_E_WMP_NETWORK_FIREWALL`: Int = -1072885322;
public const val `NS_E_WMP_NETWORK_RESOURCE_FAILURE`: Int = -1072885301;
public const val `NS_E_WMP_NONMEDIA_FILES`: Int = -1072885348;
public const val `NS_E_WMP_NO_DISK_SPACE`: Int = -1072885355;
public const val `NS_E_WMP_NO_PROTOCOLS_SELECTED`: Int = -1072885314;
public const val `NS_E_WMP_NO_REMOVABLE_MEDIA`: Int = -1072885321;
public const val `NS_E_WMP_OUTOFMEMORY`: Int = -1072885306;
public const val `NS_E_WMP_PATH_ALREADY_IN_LIBRARY`: Int = -1072885830;
public const val `NS_E_WMP_PLAYLIST_EXISTS`: Int = -1072885349;
public const val `NS_E_WMP_PLUGINDLL_NOTFOUND`: Int = -1072885799;
public const val `NS_E_WMP_PNG_INVALIDFORMAT`: Int = -1072885720;
public const val `NS_E_WMP_PNG_UNSUPPORTED_BAD_CRC`: Int = -1072885715;
public const val `NS_E_WMP_PNG_UNSUPPORTED_BITDEPTH`: Int = -1072885719;
public const val `NS_E_WMP_PNG_UNSUPPORTED_COMPRESSION`: Int = -1072885718;
public const val `NS_E_WMP_PNG_UNSUPPORTED_FILTER`: Int = -1072885717;
public const val `NS_E_WMP_PNG_UNSUPPORTED_INTERLACE`: Int = -1072885716;
public const val `NS_E_WMP_POLICY_VALUE_NOT_CONFIGURED`: Int = -1072885206;
public const val `NS_E_WMP_PROTECTED_CONTENT`: Int = -1072885237;
public const val `NS_E_WMP_PROTOCOL_PROBLEM`: Int = -1072885356;
public const val `NS_E_WMP_PROXY_CONNECT_TIMEOUT`: Int = -1072885320;
public const val `NS_E_WMP_PROXY_NOT_FOUND`: Int = -1072885308;
public const val `NS_E_WMP_RBC_JPGMAPPINGIMAGE`: Int = -1072885756;
public const val `NS_E_WMP_RECORDING_NOT_ALLOWED`: Int = -1072885815;
public const val `NS_E_WMP_RIP_FAILED`: Int = -1072885550;
public const val `NS_E_WMP_SAVEAS_READONLY`: Int = -1072885776;
public const val `NS_E_WMP_SENDMAILFAILED`: Int = -1072885779;
public const val `NS_E_WMP_SERVER_DNS_TIMEOUT`: Int = -1072885309;
public const val `NS_E_WMP_SERVER_INACCESSIBLE`: Int = -1072885352;
public const val `NS_E_WMP_SERVER_NONEWCONNECTIONS`: Int = -1072885282;
public const val `NS_E_WMP_SERVER_NOT_RESPONDING`: Int = -1072885325;
public const val `NS_E_WMP_SERVER_SECURITY_ERROR`: Int = -1072885276;
public const val `NS_E_WMP_SERVER_UNAVAILABLE`: Int = -1072885328;
public const val `NS_E_WMP_STREAMING_RECORDING_NOT_ALLOWED`: Int = -1072885800;
public const val `NS_E_WMP_TAMPERED_CONTENT`: Int = -1072885307;
public const val `NS_E_WMP_UDRM_NOUSERLIST`: Int = -1072885056;
public const val `NS_E_WMP_UI_NOSKININZIP`: Int = -1072885785;
public const val `NS_E_WMP_UI_NOTATHEMEFILE`: Int = -1072885792;
public const val `NS_E_WMP_UI_OBJECTNOTFOUND`: Int = -1072885787;
public const val `NS_E_WMP_UI_PASSTHROUGH`: Int = -1072885788;
public const val `NS_E_WMP_UI_SECONDHANDLER`: Int = -1072885786;
public const val `NS_E_WMP_UI_SUBCONTROLSNOTSUPPORTED`: Int = -1072885794;
public const val `NS_E_WMP_UI_SUBELEMENTNOTFOUND`: Int = -1072885791;
public const val `NS_E_WMP_UI_VERSIONMISMATCH`: Int = -1072885793;
public const val `NS_E_WMP_UI_VERSIONPARSE`: Int = -1072885790;
public const val `NS_E_WMP_UI_VIEWIDNOTFOUND`: Int = -1072885789;
public const val `NS_E_WMP_UNKNOWN_ERROR`: Int = -1072885299;
public const val `NS_E_WMP_UNSUPPORTED_FORMAT`: Int = -1072885351;
public const val `NS_E_WMP_UPGRADE_APPLICATION`: Int = -1072885300;
public const val `NS_E_WMP_URLDOWNLOADFAILED`: Int = -1072885782;
public const val `NS_E_WMP_VERIFY_ONLINE`: Int = -1072885326;
public const val `NS_E_WMP_VIDEO_CODEC_NOT_INSTALLED`: Int = -1072885304;
public const val `NS_E_WMP_WINDOWSAPIFAILURE`: Int = -1072885816;
public const val `NS_E_WMP_WMDM_BUSY`: Int = -1072885336;
public const val `NS_E_WMP_WMDM_FAILURE`: Int = -1072885344;
public const val `NS_E_WMP_WMDM_INCORRECT_RIGHTS`: Int = -1072885334;
public const val `NS_E_WMP_WMDM_INTERFACEDEAD`: Int = -1072885340;
public const val `NS_E_WMP_WMDM_LICENSE_EXPIRED`: Int = -1072885337;
public const val `NS_E_WMP_WMDM_LICENSE_NOTEXIST`: Int = -1072885338;
public const val `NS_E_WMP_WMDM_NORIGHTS`: Int = -1072885335;
public const val `NS_E_WMP_WMDM_NOTCERTIFIED`: Int = -1072885339;
public const val `NS_E_WMR_CANNOT_RENDER_BINARY_STREAM`: Int = -1072885661;
public const val `NS_E_WMR_NOCALLBACKAVAILABLE`: Int = -1072885666;
public const val `NS_E_WMR_NOSOURCEFILTER`: Int = -1072885668;
public const val `NS_E_WMR_PINNOTFOUND`: Int = -1072885670;
public const val `NS_E_WMR_PINTYPENOMATCH`: Int = -1072885667;
public const val `NS_E_WMR_SAMPLEPROPERTYNOTSET`: Int = -1072885662;
public const val `NS_E_WMR_UNSUPPORTEDSTREAM`: Int = -1072885671;
public const val `NS_E_WMR_WAITINGONFORMATSWITCH`: Int = -1072885669;
public const val `NS_E_WMR_WILLNOT_RENDER_BINARY_STREAM`: Int = -1072885659;
public const val `NS_E_WMX_ATTRIBUTE_ALREADY_EXISTS`: Int = -1072885649;
public const val `NS_E_WMX_ATTRIBUTE_DOES_NOT_EXIST`: Int = -1072885650;
public const val `NS_E_WMX_ATTRIBUTE_UNRETRIEVABLE`: Int = -1072885648;
public const val `NS_E_WMX_INVALID_FORMAT_OVER_NESTING`: Int = -1072885642;
public const val `NS_E_WMX_ITEM_DOES_NOT_EXIST`: Int = -1072885647;
public const val `NS_E_WMX_ITEM_TYPE_ILLEGAL`: Int = -1072885646;
public const val `NS_E_WMX_ITEM_UNSETTABLE`: Int = -1072885645;
public const val `NS_E_WMX_PLAYLIST_EMPTY`: Int = -1072885644;
public const val `NS_E_WMX_UNRECOGNIZED_PLAYLIST_FORMAT`: Int = -1072885656;
public const val `NS_E_WONT_DO_DIGITAL`: Int = -1072885837;
public const val `NS_E_WRONG_OS_VERSION`: Int = -1072884643;
public const val `NS_E_WRONG_PUBLISHING_POINT_TYPE`: Int = -1072884654;
public const val `NS_E_WSX_INVALID_VERSION`: Int = -1072884450;
public const val `NS_I_CATATONIC_AUTO_UNFAIL`: Int = -2146631270;
public const val `NS_I_CATATONIC_FAILURE`: Int = -2146631271;
public const val `NS_I_CUB_RUNNING`: Int = 1074593874;
public const val `NS_I_CUB_START`: Int = 1074593873;
public const val `NS_I_CUB_UNFAIL_LINK`: Int = 1074594193;
public const val `NS_I_DISK_REBUILD_ABORTED`: Int = 1074593880;
public const val `NS_I_DISK_REBUILD_FINISHED`: Int = 1074593879;
public const val `NS_I_DISK_REBUILD_STARTED`: Int = 1074593878;
public const val `NS_I_DISK_START`: Int = 1074593876;
public const val `NS_I_DISK_STOP`: Int = 1074594200;
public const val `NS_I_EXISTING_PACKETIZER`: Int = 1074605827;
public const val `NS_I_KILL_CONNECTION`: Int = 1074593886;
public const val `NS_I_KILL_USERSESSION`: Int = 1074593885;
public const val `NS_I_LIMIT_BANDWIDTH`: Int = 1074593904;
public const val `NS_I_LIMIT_FUNNELS`: Int = 1074593881;
public const val `NS_I_LOGGING_FAILED`: Int = 1074593902;
public const val `NS_I_MANUAL_PROXY`: Int = 1074605828;
public const val `NS_I_NOLOG_STOP`: Int = 1074605825;
public const val `NS_I_PLAYLIST_CHANGE_RECEDING`: Int = 1074599102;
public const val `NS_I_REBUILD_DISK`: Int = 1074593887;
public const val `NS_I_RECONNECTED`: Int = 1074605823;
public const val `NS_I_RESTRIPE_CUB_OUT`: Int = 1074594199;
public const val `NS_I_RESTRIPE_DISK_OUT`: Int = 1074594198;
public const val `NS_I_RESTRIPE_DONE`: Int = 1074594196;
public const val `NS_I_RESTRIPE_START`: Int = 1074594195;
public const val `NS_I_START_DISK`: Int = 1074593882;
public const val `NS_I_STOP_CUB`: Int = 1074593884;
public const val `NS_I_STOP_DISK`: Int = 1074593883;
public const val `NS_I_TIGER_START`: Int = 1074593871;
public const val `NS_S_CALLABORTED`: Int = 851969;
public const val `NS_S_CALLPENDING`: Int = 851968;
public const val `NS_S_CHANGENOTICE`: Int = 864013;
public const val `NS_S_DEGRADING_QUALITY`: Int = 854985;
public const val `NS_S_DRM_ACQUIRE_CANCELLED`: Int = 862023;
public const val `NS_S_DRM_BURNABLE_TRACK`: Int = 862062;
public const val `NS_S_DRM_BURNABLE_TRACK_WITH_PLAYLIST_RESTRICTION`: Int = 862063;
public const val `NS_S_DRM_INDIVIDUALIZED`: Int = 861991;
public const val `NS_S_DRM_LICENSE_ACQUIRED`: Int = 861990;
public const val `NS_S_DRM_MONITOR_CANCELLED`: Int = 862022;
public const val `NS_S_DRM_NEEDS_INDIVIDUALIZATION`: Int = 862174;
public const val `NS_S_EOSRECEDING`: Int = 864009;
public const val `NS_S_NAVIGATION_COMPLETE_WITH_ERRORS`: Int = 856926;
public const val `NS_S_NEED_TO_BUY_BURN_RIGHTS`: Int = 856283;
public const val `NS_S_OPERATION_PENDING`: Int = 856398;
public const val `NS_S_PUBLISHING_POINT_STARTED_WITH_FAILED_SINKS`: Int = 857369;
public const val `NS_S_REBOOT_RECOMMENDED`: Int = 862968;
public const val `NS_S_REBOOT_REQUIRED`: Int = 862969;
public const val `NS_S_REBUFFERING`: Int = 854984;
public const val `NS_S_STREAM_TRUNCATED`: Int = 851970;
public const val `NS_S_TRACK_ALREADY_DOWNLOADED`: Int = 856929;
public const val `NS_S_TRACK_BUY_REQUIRES_ALBUM_PURCHASE`: Int = 856921;
public const val `NS_S_TRANSCRYPTOR_EOF`: Int = 855003;
public const val `NS_S_WMG_ADVISE_DROP_FRAME`: Int = 856166;
public const val `NS_S_WMG_ADVISE_DROP_TO_KEYFRAME`: Int = 856167;
public const val `NS_S_WMG_FORCE_DROP_FRAME`: Int = 856143;
public const val `NS_S_WMPBR_PARTIALSUCCESS`: Int = 856374;
public const val `NS_S_WMPBR_SUCCESS`: Int = 856373;
public const val `NS_S_WMPCORE_COMMAND_NOT_AVAILABLE`: Int = 856325;
public const val `NS_S_WMPCORE_MEDIA_CHILD_PLAYLIST_OPEN_PENDING`: Int = 856329;
public const val `NS_S_WMPCORE_MEDIA_VALIDATION_PENDING`: Int = 856323;
public const val `NS_S_WMPCORE_MORE_NODES_AVAIABLE`: Int = 856330;
public const val `NS_S_WMPCORE_PLAYLISTCLEARABORT`: Int = 856318;
public const val `NS_S_WMPCORE_PLAYLISTREMOVEITEMABORT`: Int = 856319;
public const val `NS_S_WMPCORE_PLAYLIST_COLLAPSED_TO_SINGLE_MEDIA`: Int = 856328;
public const val `NS_S_WMPCORE_PLAYLIST_CREATION_PENDING`: Int = 856322;
public const val `NS_S_WMPCORE_PLAYLIST_IMPORT_MISSING_ITEMS`: Int = 856327;
public const val `NS_S_WMPCORE_PLAYLIST_NAME_AUTO_GENERATED`: Int = 856326;
public const val `NS_S_WMPCORE_PLAYLIST_REPEAT_SECONDARY_SEGMENTS_IGNORED`: Int = 856324;
public const val `NS_S_WMPEFFECT_OPAQUE`: Int = 856389;
public const val `NS_S_WMPEFFECT_TRANSPARENT`: Int = 856388;
public const val `NS_S_WMP_EXCEPTION`: Int = 856041;
public const val `NS_S_WMP_LOADED_BMP_IMAGE`: Int = 856130;
public const val `NS_S_WMP_LOADED_GIF_IMAGE`: Int = 856128;
public const val `NS_S_WMP_LOADED_JPG_IMAGE`: Int = 856131;
public const val `NS_S_WMP_LOADED_PNG_IMAGE`: Int = 856129;
public const val `NS_S_WMP_UI_VERSIONMISMATCH`: Int = 856040;
public const val `NS_S_WMR_ALREADYRENDERED`: Int = 856159;
public const val `NS_S_WMR_PINTYPEFULLMATCH`: Int = 856161;
public const val `NS_S_WMR_PINTYPEPARTIALMATCH`: Int = 856160;
public const val `NS_W_FILE_BANDWIDTH_LIMIT`: Int = -2146631676;
public const val `NS_W_SERVER_BANDWIDTH_LIMIT`: Int = -2146631677;
public const val `NS_W_UNKNOWN_EVENT`: Int = -2146631584;
// UNSUPPORTED Rust 6235:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct OLIADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 6241:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct OLICELPWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 6247:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct OLIGSMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 6253:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct OLIOPRWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 6259:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct OLISBCWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

public const val `PD_CAN_DRAW_DIB`: UInt = 1u;
public const val `PD_CAN_STRETCHDIB`: UInt = 2u;
public const val `PD_STRETCHDIB_1_1_OK`: UInt = 4u;
public const val `PD_STRETCHDIB_1_2_OK`: UInt = 8u;
public const val `PD_STRETCHDIB_1_N_OK`: UInt = 16u;
public const val `ROCKWELL_WA1_MIXER`: UInt = 103u;
public const val `ROCKWELL_WA1_MPU401_IN`: UInt = 104u;
public const val `ROCKWELL_WA1_MPU401_OUT`: UInt = 105u;
public const val `ROCKWELL_WA1_SYNTH`: UInt = 102u;
public const val `ROCKWELL_WA1_WAVEIN`: UInt = 100u;
public const val `ROCKWELL_WA1_WAVEOUT`: UInt = 101u;
public const val `ROCKWELL_WA2_MIXER`: UInt = 203u;
public const val `ROCKWELL_WA2_MPU401_IN`: UInt = 204u;
public const val `ROCKWELL_WA2_MPU401_OUT`: UInt = 205u;
public const val `ROCKWELL_WA2_SYNTH`: UInt = 202u;
public const val `ROCKWELL_WA2_WAVEIN`: UInt = 200u;
public const val `ROCKWELL_WA2_WAVEOUT`: UInt = 201u;
public const val `SEARCH_ANY`: Int = 32;
public const val `SEARCH_BACKWARD`: Int = 4;
public const val `SEARCH_FORWARD`: Int = 1;
public const val `SEARCH_KEY`: Int = 16;
public const val `SEARCH_NEAREST`: Int = 4;
public const val `SEEK_CUR`: UInt = 1u;
public const val `SEEK_END`: UInt = 2u;
public const val `SEEK_SET`: UInt = 0u;
// UNSUPPORTED Rust 6290:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct SIERRAADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wRevision: u16,
// }

// UNSUPPORTED Rust 6297:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct SONARCWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wCompType: u16,
// }

// UNSUPPORTED Rust 6304:1: non-scalar type Ptr unsupported
// pub const TARGET_DEVICE_FRIENDLY_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("TargetDeviceFriendlyName");

// UNSUPPORTED Rust 6305:1: non-scalar type Ptr unsupported
// pub const TARGET_DEVICE_OPEN_EXCLUSIVELY: windows_sys::core::PCSTR = windows_sys::core::s!("TargetDeviceOpenExclusively");

public const val `TASKERR_NOTASKSUPPORT`: UInt = 1u;
public const val `TASKERR_OUTOFMEMORY`: UInt = 2u;
public const val `TDD_BEGINMINPERIOD`: UInt = 2064u;
public const val `TDD_ENDMINPERIOD`: UInt = 2068u;
public const val `TDD_GETDEVCAPS`: UInt = 2060u;
public const val `TDD_GETSYSTEMTIME`: UInt = 2056u;
public const val `TDD_KILLTIMEREVENT`: UInt = 2048u;
public const val `TDD_SETTIMEREVENT`: UInt = 2052u;
// UNSUPPORTED Rust 6314:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct TIMEREVENT {
//     pub wDelay: u16,
//     pub wResolution: u16,
//     pub lpFunction: super::LPTIMECALLBACK,
//     pub dwUser: u32,
//     pub wFlags: u16,
//     pub wReserved1: u16,
// }

// UNSUPPORTED Rust 6324:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy)]
// pub struct TRUESPEECHWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wRevision: u16,
//     pub nSamplesPerBlock: u16,
//     pub abReserved: [u8; 28],
// }

// UNSUPPORTED Rust 6333:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Media_Audio")]
// impl Default for TRUESPEECHWAVEFORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VADMAD_Device_ID`: UInt = 1092u;
public const val `VCAPS_CAN_SCALE`: UInt = 8u;
public const val `VCAPS_DST_CAN_CLIP`: UInt = 4u;
public const val `VCAPS_OVERLAY`: UInt = 1u;
public const val `VCAPS_SRC_CAN_CLIP`: UInt = 2u;
// UNSUPPORTED Rust 6344:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_Controls")]
// pub type VFWWDMExtensionProc = Option<unsafe extern "system" fn(pfndeviceiocontrol: *mut core::ffi::c_void, pfnaddpropertypage: super::super::UI::Controls::LPFNSVADDPROPSHEETPAGE, lparam: super::super::Foundation::LPARAM) -> u32>;

public const val `VFW_HIDE_CAMERACONTROL_PAGE`: UInt = 4u;
public const val `VFW_HIDE_SETTINGS_PAGE`: UInt = 1u;
public const val `VFW_HIDE_VIDEOSRC_PAGE`: UInt = 2u;
public const val `VFW_OEM_ADD_PAGE`: UInt = 2147483648u;
public const val `VFW_QUERY_DEV_CHANGED`: UInt = 256u;
public const val `VFW_USE_DEVICE_HANDLE`: UInt = 1u;
public const val `VFW_USE_STREAM_HANDLE`: UInt = 2u;
public const val `VHDR_DONE`: UInt = 1u;
public const val `VHDR_INQUEUE`: UInt = 4u;
public const val `VHDR_KEYFRAME`: UInt = 8u;
public const val `VHDR_PREPARED`: UInt = 2u;
public const val `VHDR_VALID`: UInt = 15u;
public const val `VIDCF_COMPRESSFRAMES`: UInt = 8u;
public const val `VIDCF_CRUNCH`: UInt = 2u;
public const val `VIDCF_DRAW`: UInt = 16u;
public const val `VIDCF_FASTTEMPORALC`: UInt = 32u;
public const val `VIDCF_FASTTEMPORALD`: UInt = 128u;
public const val `VIDCF_QUALITY`: UInt = 1u;
public const val `VIDCF_TEMPORAL`: UInt = 4u;
// UNSUPPORTED Rust 6365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEOHDR {
//     pub lpData: *mut u8,
//     pub dwBufferLength: u32,
//     pub dwBytesUsed: u32,
//     pub dwTimeCaptured: u32,
//     pub dwUser: usize,
//     pub dwFlags: u32,
//     pub dwReserved: [usize; 4],
// }

// UNSUPPORTED Rust 6376:1: declaration Impl has no candidate rule
// impl Default for VIDEOHDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_CONFIGURE_CURRENT`: UInt = 16u;
public const val `VIDEO_CONFIGURE_GET`: UInt = 8192u;
public const val `VIDEO_CONFIGURE_MAX`: UInt = 128u;
public const val `VIDEO_CONFIGURE_MIN`: UInt = 64u;
public const val `VIDEO_CONFIGURE_NOMINAL`: UInt = 32u;
public const val `VIDEO_CONFIGURE_QUERY`: UInt = 32768u;
public const val `VIDEO_CONFIGURE_QUERYSIZE`: UInt = 1u;
public const val `VIDEO_CONFIGURE_SET`: UInt = 4096u;
public const val `VIDEO_DLG_QUERY`: UInt = 16u;
public const val `VIDEO_EXTERNALIN`: UInt = 1u;
public const val `VIDEO_EXTERNALOUT`: UInt = 2u;
public const val `VIDEO_IN`: UInt = 4u;
public const val `VIDEO_OUT`: UInt = 8u;
public const val `VP_COMMAND_GET`: UInt = 1u;
public const val `VP_COMMAND_SET`: UInt = 2u;
public const val `VP_CP_CMD_ACTIVATE`: UInt = 1u;
public const val `VP_CP_CMD_CHANGE`: UInt = 4u;
public const val `VP_CP_CMD_DEACTIVATE`: UInt = 2u;
public const val `VP_CP_TYPE_APS_TRIGGER`: UInt = 1u;
public const val `VP_CP_TYPE_MACROVISION`: UInt = 2u;
public const val `VP_FLAGS_BRIGHTNESS`: UInt = 64u;
public const val `VP_FLAGS_CONTRAST`: UInt = 128u;
public const val `VP_FLAGS_COPYPROTECT`: UInt = 256u;
public const val `VP_FLAGS_FLICKER`: UInt = 4u;
public const val `VP_FLAGS_MAX_UNSCALED`: UInt = 16u;
public const val `VP_FLAGS_OVERSCAN`: UInt = 8u;
public const val `VP_FLAGS_POSITION`: UInt = 32u;
public const val `VP_FLAGS_TV_MODE`: UInt = 1u;
public const val `VP_FLAGS_TV_STANDARD`: UInt = 2u;
public const val `VP_MODE_TV_PLAYBACK`: UInt = 2u;
public const val `VP_MODE_WIN_GRAPHICS`: UInt = 1u;
public const val `VP_TV_STANDARD_NTSC_433`: UInt = 65536u;
public const val `VP_TV_STANDARD_NTSC_M`: UInt = 1u;
public const val `VP_TV_STANDARD_NTSC_M_J`: UInt = 2u;
public const val `VP_TV_STANDARD_PAL_60`: UInt = 262144u;
public const val `VP_TV_STANDARD_PAL_B`: UInt = 4u;
public const val `VP_TV_STANDARD_PAL_D`: UInt = 8u;
public const val `VP_TV_STANDARD_PAL_G`: UInt = 131072u;
public const val `VP_TV_STANDARD_PAL_H`: UInt = 16u;
public const val `VP_TV_STANDARD_PAL_I`: UInt = 32u;
public const val `VP_TV_STANDARD_PAL_M`: UInt = 64u;
public const val `VP_TV_STANDARD_PAL_N`: UInt = 128u;
public const val `VP_TV_STANDARD_SECAM_B`: UInt = 256u;
public const val `VP_TV_STANDARD_SECAM_D`: UInt = 512u;
public const val `VP_TV_STANDARD_SECAM_G`: UInt = 1024u;
public const val `VP_TV_STANDARD_SECAM_H`: UInt = 2048u;
public const val `VP_TV_STANDARD_SECAM_K`: UInt = 4096u;
public const val `VP_TV_STANDARD_SECAM_K1`: UInt = 8192u;
public const val `VP_TV_STANDARD_SECAM_L`: UInt = 16384u;
public const val `VP_TV_STANDARD_SECAM_L1`: UInt = 524288u;
public const val `VP_TV_STANDARD_WIN_VGA`: UInt = 32768u;
// UNSUPPORTED Rust 6432:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy)]
// pub struct WAVEOPENDESC {
//     pub hWave: super::Audio::HWAVE,
//     pub lpFormat: *mut super::Audio::WAVEFORMAT,
//     pub dwCallback: usize,
//     pub dwInstance: usize,
//     pub uMappedDeviceID: u32,
//     pub dnDevNode: usize,
// }

// UNSUPPORTED Rust 6443:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Media_Audio")]
// impl Default for WAVEOPENDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WAVE_FILTER_DEVELOPMENT`: UInt = 65535u;
public const val `WAVE_FILTER_ECHO`: UInt = 2u;
public const val `WAVE_FILTER_UNKNOWN`: UInt = 0u;
public const val `WAVE_FILTER_VOLUME`: UInt = 1u;
public const val `WAVE_FORMAT_3COM_NBX`: UInt = 28672u;
public const val `WAVE_FORMAT_ADPCM`: UInt = 2u;
public const val `WAVE_FORMAT_ALAC`: UInt = 27745u;
public const val `WAVE_FORMAT_ALAW`: UInt = 6u;
public const val `WAVE_FORMAT_AMR_NB`: UInt = 29537u;
public const val `WAVE_FORMAT_AMR_WB`: UInt = 29538u;
public const val `WAVE_FORMAT_AMR_WP`: UInt = 29539u;
public const val `WAVE_FORMAT_ANTEX_ADPCME`: UInt = 51u;
public const val `WAVE_FORMAT_APTX`: UInt = 37u;
public const val `WAVE_FORMAT_AUDIOFILE_AF10`: UInt = 38u;
public const val `WAVE_FORMAT_AUDIOFILE_AF36`: UInt = 36u;
public const val `WAVE_FORMAT_BTV_DIGITAL`: UInt = 1024u;
public const val `WAVE_FORMAT_CANOPUS_ATRAC`: UInt = 99u;
public const val `WAVE_FORMAT_CIRRUS`: UInt = 96u;
public const val `WAVE_FORMAT_CODIAN`: UInt = 41252u;
public const val `WAVE_FORMAT_COMVERSE_INFOSYS_AVQSBC`: UInt = 41217u;
public const val `WAVE_FORMAT_COMVERSE_INFOSYS_G723_1`: UInt = 41216u;
public const val `WAVE_FORMAT_COMVERSE_INFOSYS_SBC`: UInt = 41218u;
public const val `WAVE_FORMAT_CONGRUENCY`: UInt = 141u;
public const val `WAVE_FORMAT_CONTROL_RES_CR10`: UInt = 55u;
public const val `WAVE_FORMAT_CONTROL_RES_VQLPC`: UInt = 52u;
public const val `WAVE_FORMAT_CONVEDIA_G729`: UInt = 140u;
public const val `WAVE_FORMAT_CREATIVE_ADPCM`: UInt = 512u;
public const val `WAVE_FORMAT_CREATIVE_FASTSPEECH10`: UInt = 515u;
public const val `WAVE_FORMAT_CREATIVE_FASTSPEECH8`: UInt = 514u;
public const val `WAVE_FORMAT_CS2`: UInt = 608u;
public const val `WAVE_FORMAT_CS_IMAADPCM`: UInt = 57u;
public const val `WAVE_FORMAT_CUSEEME`: UInt = 7939u;
public const val `WAVE_FORMAT_CU_CODEC`: UInt = 25u;
public const val `WAVE_FORMAT_DEVELOPMENT`: UInt = 65535u;
public const val `WAVE_FORMAT_DF_G726`: UInt = 133u;
public const val `WAVE_FORMAT_DF_GSM610`: UInt = 134u;
public const val `WAVE_FORMAT_DIALOGIC_OKI_ADPCM`: UInt = 23u;
public const val `WAVE_FORMAT_DICTAPHONE_CELP54`: UInt = 322u;
public const val `WAVE_FORMAT_DICTAPHONE_CELP68`: UInt = 321u;
public const val `WAVE_FORMAT_DIGIADPCM`: UInt = 54u;
public const val `WAVE_FORMAT_DIGIFIX`: UInt = 22u;
public const val `WAVE_FORMAT_DIGIREAL`: UInt = 53u;
public const val `WAVE_FORMAT_DIGISTD`: UInt = 21u;
public const val `WAVE_FORMAT_DIGITAL_G723`: UInt = 291u;
public const val `WAVE_FORMAT_DIVIO_G726`: UInt = 16963u;
public const val `WAVE_FORMAT_DIVIO_MPEG4_AAC`: UInt = 16707u;
public const val `WAVE_FORMAT_DOLBY_AC2`: UInt = 48u;
public const val `WAVE_FORMAT_DOLBY_AC3_SPDIF`: UInt = 146u;
public const val `WAVE_FORMAT_DOLBY_AC4`: UInt = 44096u;
public const val `WAVE_FORMAT_DRM`: UInt = 9u;
public const val `WAVE_FORMAT_DSAT`: UInt = 102u;
public const val `WAVE_FORMAT_DSAT_DISPLAY`: UInt = 103u;
public const val `WAVE_FORMAT_DSPGROUP_TRUESPEECH`: UInt = 34u;
public const val `WAVE_FORMAT_DTS`: UInt = 8u;
public const val `WAVE_FORMAT_DTS2`: UInt = 8193u;
public const val `WAVE_FORMAT_DTS_DS`: UInt = 400u;
public const val `WAVE_FORMAT_DVI_ADPCM`: UInt = 17u;
public const val `WAVE_FORMAT_DVM`: UInt = 8192u;
public const val `WAVE_FORMAT_ECHOSC1`: UInt = 35u;
public const val `WAVE_FORMAT_ECHOSC3`: UInt = 58u;
public const val `WAVE_FORMAT_ENCORE_G726`: UInt = 41223u;
public const val `WAVE_FORMAT_ESPCM`: UInt = 97u;
public const val `WAVE_FORMAT_ESST_AC3`: UInt = 577u;
public const val `WAVE_FORMAT_FAAD_AAC`: UInt = 28781u;
public const val `WAVE_FORMAT_FLAC`: UInt = 61868u;
public const val `WAVE_FORMAT_FM_TOWNS_SND`: UInt = 768u;
public const val `WAVE_FORMAT_FRACE_TELECOM_G729`: UInt = 41251u;
public const val `WAVE_FORMAT_FRAUNHOFER_IIS_MPEG2_AAC`: UInt = 384u;
public const val `WAVE_FORMAT_G721_ADPCM`: UInt = 64u;
public const val `WAVE_FORMAT_G722_ADPCM`: UInt = 101u;
public const val `WAVE_FORMAT_G723_ADPCM`: UInt = 20u;
public const val `WAVE_FORMAT_G726ADPCM`: UInt = 320u;
public const val `WAVE_FORMAT_G726_ADPCM`: UInt = 100u;
public const val `WAVE_FORMAT_G728_CELP`: UInt = 65u;
public const val `WAVE_FORMAT_G729A`: UInt = 131u;
public const val `WAVE_FORMAT_GENERIC_PASSTHRU`: UInt = 585u;
public const val `WAVE_FORMAT_GLOBAL_IP_ILBC`: UInt = 41238u;
public const val `WAVE_FORMAT_GSM610`: UInt = 49u;
public const val `WAVE_FORMAT_GSM_610`: UInt = 41229u;
public const val `WAVE_FORMAT_GSM_620`: UInt = 41230u;
public const val `WAVE_FORMAT_GSM_660`: UInt = 41231u;
public const val `WAVE_FORMAT_GSM_690`: UInt = 41232u;
public const val `WAVE_FORMAT_GSM_ADAPTIVE_MULTIRATE_WB`: UInt = 41233u;
public const val `WAVE_FORMAT_GSM_AMR_CBR`: UInt = 31265u;
public const val `WAVE_FORMAT_GSM_AMR_VBR_SID`: UInt = 31266u;
public const val `WAVE_FORMAT_HP_DYN_VOICE`: UInt = 26u;
public const val `WAVE_FORMAT_IBM_CVSD`: UInt = 5u;
public const val `WAVE_FORMAT_IEEE_FLOAT`: UInt = 3u;
public const val `WAVE_FORMAT_ILINK_VC`: UInt = 560u;
public const val `WAVE_FORMAT_IMA_ADPCM`: UInt = 17u;
public const val `WAVE_FORMAT_INDEO_AUDIO`: UInt = 1026u;
public const val `WAVE_FORMAT_INFOCOM_ITS_G721_ADPCM`: UInt = 139u;
public const val `WAVE_FORMAT_INGENIENT_G726`: UInt = 41221u;
public const val `WAVE_FORMAT_INNINGS_TELECOM_ADPCM`: UInt = 6521u;
public const val `WAVE_FORMAT_INTEL_G723_1`: UInt = 67u;
public const val `WAVE_FORMAT_INTEL_G729`: UInt = 68u;
public const val `WAVE_FORMAT_INTEL_MUSIC_CODER`: UInt = 1025u;
public const val `WAVE_FORMAT_IPI_HSX`: UInt = 592u;
public const val `WAVE_FORMAT_IPI_RPELP`: UInt = 593u;
public const val `WAVE_FORMAT_IRAT`: UInt = 257u;
public const val `WAVE_FORMAT_ISIAUDIO`: UInt = 136u;
public const val `WAVE_FORMAT_ISIAUDIO_2`: UInt = 5121u;
public const val `WAVE_FORMAT_KNOWLEDGE_ADVENTURE_ADPCM`: UInt = 376u;
public const val `WAVE_FORMAT_LEAD_SPEECH`: UInt = 17228u;
public const val `WAVE_FORMAT_LEAD_VORBIS`: UInt = 22092u;
public const val `WAVE_FORMAT_LH_CODEC`: UInt = 4352u;
public const val `WAVE_FORMAT_LH_CODEC_CELP`: UInt = 4353u;
public const val `WAVE_FORMAT_LH_CODEC_SBC12`: UInt = 4355u;
public const val `WAVE_FORMAT_LH_CODEC_SBC16`: UInt = 4356u;
public const val `WAVE_FORMAT_LH_CODEC_SBC8`: UInt = 4354u;
public const val `WAVE_FORMAT_LIGHTWAVE_LOSSLESS`: UInt = 2222u;
public const val `WAVE_FORMAT_LRC`: UInt = 40u;
public const val `WAVE_FORMAT_LUCENT_G723`: UInt = 89u;
public const val `WAVE_FORMAT_LUCENT_SX5363S`: UInt = 7180u;
public const val `WAVE_FORMAT_LUCENT_SX8300P`: UInt = 7175u;
public const val `WAVE_FORMAT_MAKEAVIS`: UInt = 13075u;
public const val `WAVE_FORMAT_MALDEN_PHONYTALK`: UInt = 160u;
public const val `WAVE_FORMAT_MEDIASONIC_G723`: UInt = 147u;
public const val `WAVE_FORMAT_MEDIASPACE_ADPCM`: UInt = 18u;
public const val `WAVE_FORMAT_MEDIAVISION_ADPCM`: UInt = 24u;
public const val `WAVE_FORMAT_MICRONAS`: UInt = 848u;
public const val `WAVE_FORMAT_MICRONAS_CELP833`: UInt = 849u;
public const val `WAVE_FORMAT_MPEG`: UInt = 80u;
public const val `WAVE_FORMAT_MPEG4_AAC`: UInt = 41222u;
public const val `WAVE_FORMAT_MPEGLAYER3`: UInt = 85u;
public const val `WAVE_FORMAT_MPEG_ADTS_AAC`: UInt = 5632u;
public const val `WAVE_FORMAT_MPEG_HEAAC`: UInt = 5648u;
public const val `WAVE_FORMAT_MPEG_LOAS`: UInt = 5634u;
public const val `WAVE_FORMAT_MPEG_RAW_AAC`: UInt = 5633u;
public const val `WAVE_FORMAT_MSAUDIO1`: UInt = 352u;
public const val `WAVE_FORMAT_MSG723`: UInt = 66u;
public const val `WAVE_FORMAT_MSNAUDIO`: UInt = 50u;
public const val `WAVE_FORMAT_MSRT24`: UInt = 130u;
public const val `WAVE_FORMAT_MULAW`: UInt = 7u;
public const val `WAVE_FORMAT_MULTITUDE_FT_SX20`: UInt = 138u;
public const val `WAVE_FORMAT_MVI_MVI2`: UInt = 132u;
public const val `WAVE_FORMAT_NEC_AAC`: UInt = 176u;
public const val `WAVE_FORMAT_NICE_ACA`: UInt = 41240u;
public const val `WAVE_FORMAT_NICE_ADPCM`: UInt = 41241u;
public const val `WAVE_FORMAT_NICE_G728`: UInt = 41250u;
public const val `WAVE_FORMAT_NMS_VBXADPCM`: UInt = 56u;
public const val `WAVE_FORMAT_NOKIA_ADAPTIVE_MULTIRATE`: UInt = 16897u;
public const val `WAVE_FORMAT_NOKIA_MPEG_ADTS_AAC`: UInt = 5640u;
public const val `WAVE_FORMAT_NOKIA_MPEG_RAW_AAC`: UInt = 5641u;
public const val `WAVE_FORMAT_NORCOM_VOICE_SYSTEMS_ADPCM`: UInt = 645u;
public const val `WAVE_FORMAT_NORRIS`: UInt = 5120u;
public const val `WAVE_FORMAT_NTCSOFT_ALF2CM_ACM`: UInt = 8132u;
public const val `WAVE_FORMAT_OGG_VORBIS_MODE_1`: UInt = 26447u;
public const val `WAVE_FORMAT_OGG_VORBIS_MODE_1_PLUS`: UInt = 26479u;
public const val `WAVE_FORMAT_OGG_VORBIS_MODE_2`: UInt = 26448u;
public const val `WAVE_FORMAT_OGG_VORBIS_MODE_2_PLUS`: UInt = 26480u;
public const val `WAVE_FORMAT_OGG_VORBIS_MODE_3`: UInt = 26449u;
public const val `WAVE_FORMAT_OGG_VORBIS_MODE_3_PLUS`: UInt = 26481u;
public const val `WAVE_FORMAT_OKI_ADPCM`: UInt = 16u;
public const val `WAVE_FORMAT_OLIADPCM`: UInt = 4097u;
public const val `WAVE_FORMAT_OLICELP`: UInt = 4098u;
public const val `WAVE_FORMAT_OLIGSM`: UInt = 4096u;
public const val `WAVE_FORMAT_OLIOPR`: UInt = 4100u;
public const val `WAVE_FORMAT_OLISBC`: UInt = 4099u;
public const val `WAVE_FORMAT_ON2_VP6_AUDIO`: UInt = 1281u;
public const val `WAVE_FORMAT_ON2_VP7_AUDIO`: UInt = 1280u;
public const val `WAVE_FORMAT_ONLIVE`: UInt = 137u;
public const val `WAVE_FORMAT_OPUS`: UInt = 28751u;
public const val `WAVE_FORMAT_PAC`: UInt = 83u;
public const val `WAVE_FORMAT_PACKED`: UInt = 153u;
public const val `WAVE_FORMAT_PCM_S`: UInt = 1152u;
public const val `WAVE_FORMAT_PHILIPS_CELP`: UInt = 288u;
public const val `WAVE_FORMAT_PHILIPS_GRUNDIG`: UInt = 289u;
public const val `WAVE_FORMAT_PHILIPS_LPCBB`: UInt = 152u;
public const val `WAVE_FORMAT_POLYCOM_G722`: UInt = 41234u;
public const val `WAVE_FORMAT_POLYCOM_G728`: UInt = 41235u;
public const val `WAVE_FORMAT_POLYCOM_G729_A`: UInt = 41236u;
public const val `WAVE_FORMAT_POLYCOM_SIREN`: UInt = 41237u;
public const val `WAVE_FORMAT_PROSODY_1612`: UInt = 39u;
public const val `WAVE_FORMAT_PROSODY_8KBPS`: UInt = 148u;
public const val `WAVE_FORMAT_QDESIGN_MUSIC`: UInt = 1104u;
public const val `WAVE_FORMAT_QUALCOMM_HALFRATE`: UInt = 337u;
public const val `WAVE_FORMAT_QUALCOMM_PUREVOICE`: UInt = 336u;
public const val `WAVE_FORMAT_QUARTERDECK`: UInt = 544u;
public const val `WAVE_FORMAT_RACAL_RECORDER_G720_A`: UInt = 162u;
public const val `WAVE_FORMAT_RACAL_RECORDER_G723_1`: UInt = 163u;
public const val `WAVE_FORMAT_RACAL_RECORDER_GSM`: UInt = 161u;
public const val `WAVE_FORMAT_RACAL_RECORDER_TETRA_ACELP`: UInt = 164u;
public const val `WAVE_FORMAT_RADIOTIME_TIME_SHIFT_RADIO`: UInt = 41239u;
public const val `WAVE_FORMAT_RAW_AAC1`: UInt = 255u;
public const val `WAVE_FORMAT_RAW_SPORT`: UInt = 576u;
public const val `WAVE_FORMAT_RHETOREX_ADPCM`: UInt = 256u;
public const val `WAVE_FORMAT_ROCKWELL_ADPCM`: UInt = 59u;
public const val `WAVE_FORMAT_ROCKWELL_DIGITALK`: UInt = 60u;
public const val `WAVE_FORMAT_RT24`: UInt = 82u;
public const val `WAVE_FORMAT_SANYO_LD_ADPCM`: UInt = 293u;
public const val `WAVE_FORMAT_SBC24`: UInt = 145u;
public const val `WAVE_FORMAT_SHARP_G726`: UInt = 69u;
public const val `WAVE_FORMAT_SIERRA_ADPCM`: UInt = 19u;
public const val `WAVE_FORMAT_SIPROLAB_ACELP4800`: UInt = 305u;
public const val `WAVE_FORMAT_SIPROLAB_ACELP8V3`: UInt = 306u;
public const val `WAVE_FORMAT_SIPROLAB_ACEPLNET`: UInt = 304u;
public const val `WAVE_FORMAT_SIPROLAB_G729`: UInt = 307u;
public const val `WAVE_FORMAT_SIPROLAB_G729A`: UInt = 308u;
public const val `WAVE_FORMAT_SIPROLAB_KELVIN`: UInt = 309u;
public const val `WAVE_FORMAT_SOFTSOUND`: UInt = 128u;
public const val `WAVE_FORMAT_SONARC`: UInt = 33u;
public const val `WAVE_FORMAT_SONICFOUNDRY_LOSSLESS`: UInt = 6513u;
public const val `WAVE_FORMAT_SONY_ATRAC3`: UInt = 626u;
public const val `WAVE_FORMAT_SONY_SCX`: UInt = 624u;
public const val `WAVE_FORMAT_SONY_SCY`: UInt = 625u;
public const val `WAVE_FORMAT_SONY_SPC`: UInt = 627u;
public const val `WAVE_FORMAT_SOUNDSPACE_MUSICOMPRESS`: UInt = 5376u;
public const val `WAVE_FORMAT_SPEEX_VOICE`: UInt = 41225u;
public const val `WAVE_FORMAT_SYCOM_ACM_SYC008`: UInt = 372u;
public const val `WAVE_FORMAT_SYCOM_ACM_SYC701_CELP54`: UInt = 374u;
public const val `WAVE_FORMAT_SYCOM_ACM_SYC701_CELP68`: UInt = 375u;
public const val `WAVE_FORMAT_SYCOM_ACM_SYC701_G726L`: UInt = 373u;
public const val `WAVE_FORMAT_SYMBOL_G729_A`: UInt = 41219u;
public const val `WAVE_FORMAT_TELUM_AUDIO`: UInt = 640u;
public const val `WAVE_FORMAT_TELUM_IA_AUDIO`: UInt = 641u;
public const val `WAVE_FORMAT_TPC`: UInt = 1665u;
public const val `WAVE_FORMAT_TUBGSM`: UInt = 341u;
public const val `WAVE_FORMAT_UHER_ADPCM`: UInt = 528u;
public const val `WAVE_FORMAT_ULEAD_DV_AUDIO`: UInt = 533u;
public const val `WAVE_FORMAT_ULEAD_DV_AUDIO_1`: UInt = 534u;
public const val `WAVE_FORMAT_UNISYS_NAP_16K`: UInt = 371u;
public const val `WAVE_FORMAT_UNISYS_NAP_ADPCM`: UInt = 368u;
public const val `WAVE_FORMAT_UNISYS_NAP_ALAW`: UInt = 370u;
public const val `WAVE_FORMAT_UNISYS_NAP_ULAW`: UInt = 369u;
public const val `WAVE_FORMAT_UNKNOWN`: UInt = 0u;
public const val `WAVE_FORMAT_VIANIX_MASC`: UInt = 41226u;
public const val `WAVE_FORMAT_VIVO_G723`: UInt = 273u;
public const val `WAVE_FORMAT_VIVO_SIREN`: UInt = 274u;
public const val `WAVE_FORMAT_VME_VMPCM`: UInt = 1664u;
public const val `WAVE_FORMAT_VOCORD_G721`: UInt = 41242u;
public const val `WAVE_FORMAT_VOCORD_G722_1`: UInt = 41244u;
public const val `WAVE_FORMAT_VOCORD_G723_1`: UInt = 41248u;
public const val `WAVE_FORMAT_VOCORD_G726`: UInt = 41243u;
public const val `WAVE_FORMAT_VOCORD_G728`: UInt = 41245u;
public const val `WAVE_FORMAT_VOCORD_G729`: UInt = 41246u;
public const val `WAVE_FORMAT_VOCORD_G729_A`: UInt = 41247u;
public const val `WAVE_FORMAT_VOCORD_LBC`: UInt = 41249u;
public const val `WAVE_FORMAT_VODAFONE_MPEG_ADTS_AAC`: UInt = 5642u;
public const val `WAVE_FORMAT_VODAFONE_MPEG_RAW_AAC`: UInt = 5643u;
public const val `WAVE_FORMAT_VOICEAGE_AMR`: UInt = 310u;
public const val `WAVE_FORMAT_VOICEAGE_AMR_WB`: UInt = 41220u;
public const val `WAVE_FORMAT_VOXWARE`: UInt = 98u;
public const val `WAVE_FORMAT_VOXWARE_AC10`: UInt = 113u;
public const val `WAVE_FORMAT_VOXWARE_AC16`: UInt = 114u;
public const val `WAVE_FORMAT_VOXWARE_AC20`: UInt = 115u;
public const val `WAVE_FORMAT_VOXWARE_AC8`: UInt = 112u;
public const val `WAVE_FORMAT_VOXWARE_BYTE_ALIGNED`: UInt = 105u;
public const val `WAVE_FORMAT_VOXWARE_RT24`: UInt = 116u;
public const val `WAVE_FORMAT_VOXWARE_RT24_SPEECH`: UInt = 6172u;
public const val `WAVE_FORMAT_VOXWARE_RT29`: UInt = 117u;
public const val `WAVE_FORMAT_VOXWARE_RT29HW`: UInt = 118u;
public const val `WAVE_FORMAT_VOXWARE_SC3`: UInt = 122u;
public const val `WAVE_FORMAT_VOXWARE_SC3_1`: UInt = 123u;
public const val `WAVE_FORMAT_VOXWARE_TQ40`: UInt = 121u;
public const val `WAVE_FORMAT_VOXWARE_TQ60`: UInt = 129u;
public const val `WAVE_FORMAT_VOXWARE_VR12`: UInt = 119u;
public const val `WAVE_FORMAT_VOXWARE_VR18`: UInt = 120u;
public const val `WAVE_FORMAT_VSELP`: UInt = 4u;
public const val `WAVE_FORMAT_WAVPACK_AUDIO`: UInt = 22358u;
public const val `WAVE_FORMAT_WM9_SPECTRUM_ANALYZER`: UInt = 41227u;
public const val `WAVE_FORMAT_WMASPDIF`: UInt = 356u;
public const val `WAVE_FORMAT_WMAUDIO2`: UInt = 353u;
public const val `WAVE_FORMAT_WMAUDIO3`: UInt = 354u;
public const val `WAVE_FORMAT_WMAUDIO_LOSSLESS`: UInt = 355u;
public const val `WAVE_FORMAT_WMAVOICE10`: UInt = 11u;
public const val `WAVE_FORMAT_WMAVOICE9`: UInt = 10u;
public const val `WAVE_FORMAT_WMF_SPECTRUM_ANAYZER`: UInt = 41228u;
public const val `WAVE_FORMAT_XEBEC`: UInt = 61u;
public const val `WAVE_FORMAT_YAMAHA_ADPCM`: UInt = 32u;
public const val `WAVE_FORMAT_ZOLL_ASAO`: UInt = 41224u;
public const val `WAVE_FORMAT_ZYXEL_ADPCM`: UInt = 151u;
public const val `WAVE_MAPPER_S`: UInt = 1153u;
public const val `WIDM_ADDBUFFER`: UInt = 56u;
public const val `WIDM_CLOSE`: UInt = 53u;
public const val `WIDM_GETDEVCAPS`: UInt = 51u;
public const val `WIDM_GETNUMDEVS`: UInt = 50u;
public const val `WIDM_GETPOS`: UInt = 60u;
public const val `WIDM_INIT`: UInt = 100u;
public const val `WIDM_INIT_EX`: UInt = 104u;
public const val `WIDM_OPEN`: UInt = 52u;
public const val `WIDM_PREFERRED`: UInt = 61u;
public const val `WIDM_PREPARE`: UInt = 54u;
public const val `WIDM_RESET`: UInt = 59u;
public const val `WIDM_START`: UInt = 57u;
public const val `WIDM_STOP`: UInt = 58u;
public const val `WIDM_UNPREPARE`: UInt = 55u;
// UNSUPPORTED Rust 6736:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct WMAUDIO2WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub dwSamplesPerBlock: u32,
//     pub wEncodeOptions: u16,
//     pub dwSuperBlockAlign: u32,
// }

public const val `WMAUDIO2_BITS_PER_SAMPLE`: UInt = 16u;
public const val `WMAUDIO2_MAX_CHANNELS`: UInt = 2u;
// UNSUPPORTED Rust 6747:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct WMAUDIO3WAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
//     pub wValidBitsPerSample: u16,
//     pub dwChannelMask: u32,
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
//     pub wEncodeOptions: u16,
//     pub wReserved3: u16,
// }

public const val `WMAUDIO_BITS_PER_SAMPLE`: UInt = 16u;
public const val `WMAUDIO_MAX_CHANNELS`: UInt = 2u;
public const val `WM_CAP_ABORT`: UInt = 1093u;
public const val `WM_CAP_DLG_VIDEOCOMPRESSION`: UInt = 1070u;
public const val `WM_CAP_DLG_VIDEODISPLAY`: UInt = 1067u;
public const val `WM_CAP_DLG_VIDEOFORMAT`: UInt = 1065u;
public const val `WM_CAP_DLG_VIDEOSOURCE`: UInt = 1066u;
public const val `WM_CAP_DRIVER_CONNECT`: UInt = 1034u;
public const val `WM_CAP_DRIVER_DISCONNECT`: UInt = 1035u;
public const val `WM_CAP_DRIVER_GET_CAPS`: UInt = 1038u;
public const val `WM_CAP_DRIVER_GET_NAME`: UInt = 1136u;
public const val `WM_CAP_DRIVER_GET_NAMEA`: UInt = 1036u;
public const val `WM_CAP_DRIVER_GET_NAMEW`: UInt = 1136u;
public const val `WM_CAP_DRIVER_GET_VERSION`: UInt = 1137u;
public const val `WM_CAP_DRIVER_GET_VERSIONA`: UInt = 1037u;
public const val `WM_CAP_DRIVER_GET_VERSIONW`: UInt = 1137u;
public const val `WM_CAP_EDIT_COPY`: UInt = 1054u;
public const val `WM_CAP_END`: UInt = 1205u;
public const val `WM_CAP_FILE_ALLOCATE`: UInt = 1046u;
public const val `WM_CAP_FILE_GET_CAPTURE_FILE`: UInt = 1145u;
public const val `WM_CAP_FILE_GET_CAPTURE_FILEA`: UInt = 1045u;
public const val `WM_CAP_FILE_GET_CAPTURE_FILEW`: UInt = 1145u;
public const val `WM_CAP_FILE_SAVEAS`: UInt = 1147u;
public const val `WM_CAP_FILE_SAVEASA`: UInt = 1047u;
public const val `WM_CAP_FILE_SAVEASW`: UInt = 1147u;
public const val `WM_CAP_FILE_SAVEDIB`: UInt = 1149u;
public const val `WM_CAP_FILE_SAVEDIBA`: UInt = 1049u;
public const val `WM_CAP_FILE_SAVEDIBW`: UInt = 1149u;
public const val `WM_CAP_FILE_SET_CAPTURE_FILE`: UInt = 1144u;
public const val `WM_CAP_FILE_SET_CAPTURE_FILEA`: UInt = 1044u;
public const val `WM_CAP_FILE_SET_CAPTURE_FILEW`: UInt = 1144u;
public const val `WM_CAP_FILE_SET_INFOCHUNK`: UInt = 1048u;
public const val `WM_CAP_GET_AUDIOFORMAT`: UInt = 1060u;
public const val `WM_CAP_GET_CAPSTREAMPTR`: UInt = 1025u;
public const val `WM_CAP_GET_MCI_DEVICE`: UInt = 1191u;
public const val `WM_CAP_GET_MCI_DEVICEA`: UInt = 1091u;
public const val `WM_CAP_GET_MCI_DEVICEW`: UInt = 1191u;
public const val `WM_CAP_GET_SEQUENCE_SETUP`: UInt = 1089u;
public const val `WM_CAP_GET_STATUS`: UInt = 1078u;
public const val `WM_CAP_GET_USER_DATA`: UInt = 1032u;
public const val `WM_CAP_GET_VIDEOFORMAT`: UInt = 1068u;
public const val `WM_CAP_GRAB_FRAME`: UInt = 1084u;
public const val `WM_CAP_GRAB_FRAME_NOSTOP`: UInt = 1085u;
public const val `WM_CAP_PAL_AUTOCREATE`: UInt = 1107u;
public const val `WM_CAP_PAL_MANUALCREATE`: UInt = 1108u;
public const val `WM_CAP_PAL_OPEN`: UInt = 1204u;
public const val `WM_CAP_PAL_OPENA`: UInt = 1104u;
public const val `WM_CAP_PAL_OPENW`: UInt = 1204u;
public const val `WM_CAP_PAL_PASTE`: UInt = 1106u;
public const val `WM_CAP_PAL_SAVE`: UInt = 1205u;
public const val `WM_CAP_PAL_SAVEA`: UInt = 1105u;
public const val `WM_CAP_PAL_SAVEW`: UInt = 1205u;
public const val `WM_CAP_SEQUENCE`: UInt = 1086u;
public const val `WM_CAP_SEQUENCE_NOFILE`: UInt = 1087u;
public const val `WM_CAP_SET_AUDIOFORMAT`: UInt = 1059u;
public const val `WM_CAP_SET_CALLBACK_CAPCONTROL`: UInt = 1109u;
public const val `WM_CAP_SET_CALLBACK_ERROR`: UInt = 1126u;
public const val `WM_CAP_SET_CALLBACK_ERRORA`: UInt = 1026u;
public const val `WM_CAP_SET_CALLBACK_ERRORW`: UInt = 1126u;
public const val `WM_CAP_SET_CALLBACK_FRAME`: UInt = 1029u;
public const val `WM_CAP_SET_CALLBACK_STATUS`: UInt = 1127u;
public const val `WM_CAP_SET_CALLBACK_STATUSA`: UInt = 1027u;
public const val `WM_CAP_SET_CALLBACK_STATUSW`: UInt = 1127u;
public const val `WM_CAP_SET_CALLBACK_VIDEOSTREAM`: UInt = 1030u;
public const val `WM_CAP_SET_CALLBACK_WAVESTREAM`: UInt = 1031u;
public const val `WM_CAP_SET_CALLBACK_YIELD`: UInt = 1028u;
public const val `WM_CAP_SET_MCI_DEVICE`: UInt = 1190u;
public const val `WM_CAP_SET_MCI_DEVICEA`: UInt = 1090u;
public const val `WM_CAP_SET_MCI_DEVICEW`: UInt = 1190u;
public const val `WM_CAP_SET_OVERLAY`: UInt = 1075u;
public const val `WM_CAP_SET_PREVIEW`: UInt = 1074u;
public const val `WM_CAP_SET_PREVIEWRATE`: UInt = 1076u;
public const val `WM_CAP_SET_SCALE`: UInt = 1077u;
public const val `WM_CAP_SET_SCROLL`: UInt = 1079u;
public const val `WM_CAP_SET_SEQUENCE_SETUP`: UInt = 1088u;
public const val `WM_CAP_SET_USER_DATA`: UInt = 1033u;
public const val `WM_CAP_SET_VIDEOFORMAT`: UInt = 1069u;
public const val `WM_CAP_SINGLE_FRAME`: UInt = 1096u;
public const val `WM_CAP_SINGLE_FRAME_CLOSE`: UInt = 1095u;
public const val `WM_CAP_SINGLE_FRAME_OPEN`: UInt = 1094u;
public const val `WM_CAP_START`: UInt = 1024u;
public const val `WM_CAP_STOP`: UInt = 1092u;
public const val `WM_CAP_UNICODE_END`: UInt = 1205u;
public const val `WM_CAP_UNICODE_START`: UInt = 1124u;
public const val `WODM_BREAKLOOP`: UInt = 20u;
public const val `WODM_BUSY`: UInt = 21u;
public const val `WODM_CLOSE`: UInt = 6u;
public const val `WODM_GETDEVCAPS`: UInt = 4u;
public const val `WODM_GETNUMDEVS`: UInt = 3u;
public const val `WODM_GETPITCH`: UInt = 14u;
public const val `WODM_GETPLAYBACKRATE`: UInt = 18u;
public const val `WODM_GETPOS`: UInt = 13u;
public const val `WODM_GETVOLUME`: UInt = 16u;
public const val `WODM_INIT`: UInt = 100u;
public const val `WODM_INIT_EX`: UInt = 104u;
public const val `WODM_OPEN`: UInt = 5u;
public const val `WODM_PAUSE`: UInt = 10u;
public const val `WODM_PREFERRED`: UInt = 21u;
public const val `WODM_PREPARE`: UInt = 7u;
public const val `WODM_RESET`: UInt = 12u;
public const val `WODM_RESTART`: UInt = 11u;
public const val `WODM_SETPITCH`: UInt = 15u;
public const val `WODM_SETPLAYBACKRATE`: UInt = 19u;
public const val `WODM_SETVOLUME`: UInt = 17u;
public const val `WODM_UNPREPARE`: UInt = 8u;
public const val `WODM_WRITE`: UInt = 9u;
// UNSUPPORTED Rust 6865:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(feature = "Win32_Media_Audio")]
// #[derive(Clone, Copy, Default)]
// pub struct YAMAHA_ADPCMWAVEFORMAT {
//     pub wfx: super::Audio::WAVEFORMATEX,
// }

// UNSUPPORTED Rust 6871:1: generic scalar type unsupported
// pub type YIELDPROC = Option<unsafe extern "system" fn(mciid: u32, dwyielddata: u32) -> u32>;

// UNSUPPORTED Rust 6872:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct s_RIFFWAVE_inst {
//     pub bUnshiftedNote: u8,
//     pub chFineTune: i8,
//     pub chGain: i8,
//     pub bLowNote: u8,
//     pub bHighNote: u8,
//     pub bLowVelocity: u8,
//     pub bHighVelocity: u8,
// }

