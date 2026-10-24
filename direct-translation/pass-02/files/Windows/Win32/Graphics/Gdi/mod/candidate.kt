// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AbortPath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AddFontMemResourceEx(pfileview : *const core::ffi::c_void, cjsize : u32, pvresrved : *const core::ffi::c_void, pnumfonts : *const u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AddFontResourceA(param0 : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AddFontResourceExA(name : windows_sys::core::PCSTR, fl : FONT_RESOURCE_CHARACTERISTICS, res : *const core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AddFontResourceExW(name : windows_sys::core::PCWSTR, fl : FONT_RESOURCE_CHARACTERISTICS, res : *const core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AddFontResourceW(param0 : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("msimg32.dll" "system" fn AlphaBlend(hdcdest : HDC, xorigindest : i32, yorigindest : i32, wdest : i32, hdest : i32, hdcsrc : HDC, xoriginsrc : i32, yoriginsrc : i32, wsrc : i32, hsrc : i32, ftn : BLENDFUNCTION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AngleArc(hdc : HDC, x : i32, y : i32, r : u32, startangle : f32, sweepangle : f32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn AnimatePalette(hpal : HPALETTE, istartindex : u32, centries : u32, ppe : *const PALETTEENTRY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn Arc(hdc : HDC, x1 : i32, y1 : i32, x2 : i32, y2 : i32, x3 : i32, y3 : i32, x4 : i32, y4 : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ArcTo(hdc : HDC, left : i32, top : i32, right : i32, bottom : i32, xr1 : i32, yr1 : i32, xr2 : i32, yr2 : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn BeginPaint(hwnd : super::super::Foundation:: HWND, lppaint : *mut PAINTSTRUCT) -> HDC);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn BeginPath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn BitBlt(hdc : HDC, x : i32, y : i32, cx : i32, cy : i32, hdcsrc : HDC, x1 : i32, y1 : i32, rop : ROP_CODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CancelDC(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ChangeDisplaySettingsA(lpdevmode : *const DEVMODEA, dwflags : CDS_TYPE) -> DISP_CHANGE);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ChangeDisplaySettingsExA(lpszdevicename : windows_sys::core::PCSTR, lpdevmode : *const DEVMODEA, hwnd : super::super::Foundation:: HWND, dwflags : CDS_TYPE, lparam : *const core::ffi::c_void) -> DISP_CHANGE);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ChangeDisplaySettingsExW(lpszdevicename : windows_sys::core::PCWSTR, lpdevmode : *const DEVMODEW, hwnd : super::super::Foundation:: HWND, dwflags : CDS_TYPE, lparam : *const core::ffi::c_void) -> DISP_CHANGE);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ChangeDisplaySettingsW(lpdevmode : *const DEVMODEW, dwflags : CDS_TYPE) -> DISP_CHANGE);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn Chord(hdc : HDC, x1 : i32, y1 : i32, x2 : i32, y2 : i32, x3 : i32, y3 : i32, x4 : i32, y4 : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ClientToScreen(hwnd : super::super::Foundation:: HWND, lppoint : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CloseEnhMetaFile(hdc : HDC) -> HENHMETAFILE);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CloseFigure(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CloseMetaFile(hdc : HDC) -> HMETAFILE);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CombineRgn(hrgndst : HRGN, hrgnsrc1 : HRGN, hrgnsrc2 : HRGN, imode : RGN_COMBINE_MODE) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CombineTransform(lpxfout : *mut XFORM, lpxf1 : *const XFORM, lpxf2 : *const XFORM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CopyEnhMetaFileA(henh : HENHMETAFILE, lpfilename : windows_sys::core::PCSTR) -> HENHMETAFILE);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CopyEnhMetaFileW(henh : HENHMETAFILE, lpfilename : windows_sys::core::PCWSTR) -> HENHMETAFILE);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CopyMetaFileA(param0 : HMETAFILE, param1 : windows_sys::core::PCSTR) -> HMETAFILE);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CopyMetaFileW(param0 : HMETAFILE, param1 : windows_sys::core::PCWSTR) -> HMETAFILE);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn CopyRect(lprcdst : *mut super::super::Foundation:: RECT, lprcsrc : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateBitmap(nwidth : i32, nheight : i32, nplanes : u32, nbitcount : u32, lpbits : *const core::ffi::c_void) -> HBITMAP);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateBitmapIndirect(pbm : *const BITMAP) -> HBITMAP);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateBrushIndirect(plbrush : *const LOGBRUSH) -> HBRUSH);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateCompatibleBitmap(hdc : HDC, cx : i32, cy : i32) -> HBITMAP);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateCompatibleDC(hdc : HDC) -> HDC);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateDCA(pwszdriver : windows_sys::core::PCSTR, pwszdevice : windows_sys::core::PCSTR, pszport : windows_sys::core::PCSTR, pdm : *const DEVMODEA) -> HDC);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateDCW(pwszdriver : windows_sys::core::PCWSTR, pwszdevice : windows_sys::core::PCWSTR, pszport : windows_sys::core::PCWSTR, pdm : *const DEVMODEW) -> HDC);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateDIBPatternBrush(h : super::super::Foundation:: HGLOBAL, iusage : DIB_USAGE) -> HBRUSH);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateDIBPatternBrushPt(lppackeddib : *const core::ffi::c_void, iusage : DIB_USAGE) -> HBRUSH);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateDIBSection(hdc : HDC, pbmi : *const BITMAPINFO, usage : DIB_USAGE, ppvbits : *mut *mut core::ffi::c_void, hsection : super::super::Foundation:: HANDLE, offset : u32) -> HBITMAP);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateDIBitmap(hdc : HDC, pbmih : *const BITMAPINFOHEADER, flinit : u32, pjbits : *const core::ffi::c_void, pbmi : *const BITMAPINFO, iusage : DIB_USAGE) -> HBITMAP);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateDiscardableBitmap(hdc : HDC, cx : i32, cy : i32) -> HBITMAP);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateEllipticRgn(x1 : i32, y1 : i32, x2 : i32, y2 : i32) -> HRGN);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateEllipticRgnIndirect(lprect : *const super::super::Foundation:: RECT) -> HRGN);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateEnhMetaFileA(hdc : HDC, lpfilename : windows_sys::core::PCSTR, lprc : *const super::super::Foundation:: RECT, lpdesc : windows_sys::core::PCSTR) -> HDC);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateEnhMetaFileW(hdc : HDC, lpfilename : windows_sys::core::PCWSTR, lprc : *const super::super::Foundation:: RECT, lpdesc : windows_sys::core::PCWSTR) -> HDC);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateFontA(cheight : i32, cwidth : i32, cescapement : i32, corientation : i32, cweight : i32, bitalic : u32, bunderline : u32, bstrikeout : u32, icharset : u32, ioutprecision : u32, iclipprecision : u32, iquality : u32, ipitchandfamily : u32, pszfacename : windows_sys::core::PCSTR) -> HFONT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateFontIndirectA(lplf : *const LOGFONTA) -> HFONT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateFontIndirectExA(param0 : *const ENUMLOGFONTEXDVA) -> HFONT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateFontIndirectExW(param0 : *const ENUMLOGFONTEXDVW) -> HFONT);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateFontIndirectW(lplf : *const LOGFONTW) -> HFONT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("fontsub.dll" "C" fn CreateFontPackage(puchsrcbuffer : *const u8, ulsrcbuffersize : u32, ppuchfontpackagebuffer : *mut *mut u8, pulfontpackagebuffersize : *mut u32, pulbyteswritten : *mut u32, usflag : u16, usttcindex : u16, ussubsetformat : u16, ussubsetlanguage : u16, ussubsetplatform : CREATE_FONT_PACKAGE_SUBSET_PLATFORM, ussubsetencoding : CREATE_FONT_PACKAGE_SUBSET_ENCODING, pussubsetkeeplist : *const u16, ussubsetlistcount : u16, lpfnallocate : CFP_ALLOCPROC, lpfnreallocate : CFP_REALLOCPROC, lpfnfree : CFP_FREEPROC, lpvreserved : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateFontW(cheight : i32, cwidth : i32, cescapement : i32, corientation : i32, cweight : i32, bitalic : u32, bunderline : u32, bstrikeout : u32, icharset : u32, ioutprecision : u32, iclipprecision : u32, iquality : u32, ipitchandfamily : u32, pszfacename : windows_sys::core::PCWSTR) -> HFONT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateHalftonePalette(hdc : HDC) -> HPALETTE);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateHatchBrush(ihatch : HATCH_BRUSH_STYLE, color : super::super::Foundation:: COLORREF) -> HBRUSH);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateICA(pszdriver : windows_sys::core::PCSTR, pszdevice : windows_sys::core::PCSTR, pszport : windows_sys::core::PCSTR, pdm : *const DEVMODEA) -> HDC);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateICW(pszdriver : windows_sys::core::PCWSTR, pszdevice : windows_sys::core::PCWSTR, pszport : windows_sys::core::PCWSTR, pdm : *const DEVMODEW) -> HDC);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateMetaFileA(pszfile : windows_sys::core::PCSTR) -> HDC);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateMetaFileW(pszfile : windows_sys::core::PCWSTR) -> HDC);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreatePalette(plpal : *const LOGPALETTE) -> HPALETTE);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreatePatternBrush(hbm : HBITMAP) -> HBRUSH);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreatePen(istyle : PEN_STYLE, cwidth : i32, color : super::super::Foundation:: COLORREF) -> HPEN);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreatePenIndirect(plpen : *const LOGPEN) -> HPEN);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreatePolyPolygonRgn(pptl : *const super::super::Foundation:: POINT, pc : *const i32, cpoly : i32, imode : CREATE_POLYGON_RGN_MODE) -> HRGN);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreatePolygonRgn(pptl : *const super::super::Foundation:: POINT, cpoint : i32, imode : CREATE_POLYGON_RGN_MODE) -> HRGN);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateRectRgn(x1 : i32, y1 : i32, x2 : i32, y2 : i32) -> HRGN);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateRectRgnIndirect(lprect : *const super::super::Foundation:: RECT) -> HRGN);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateRoundRectRgn(x1 : i32, y1 : i32, x2 : i32, y2 : i32, w : i32, h : i32) -> HRGN);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateScalableFontResourceA(fdwhidden : u32, lpszfont : windows_sys::core::PCSTR, lpszfile : windows_sys::core::PCSTR, lpszpath : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateScalableFontResourceW(fdwhidden : u32, lpszfont : windows_sys::core::PCWSTR, lpszfile : windows_sys::core::PCWSTR, lpszpath : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CreateSolidBrush(color : super::super::Foundation:: COLORREF) -> HBRUSH);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn DPtoLP(hdc : HDC, lppt : *mut super::super::Foundation:: POINT, c : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn DeleteDC(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn DeleteEnhMetaFile(hmf : HENHMETAFILE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn DeleteMetaFile(hmf : HMETAFILE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn DeleteObject(ho : HGDIOBJ) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawAnimatedRects(hwnd : super::super::Foundation:: HWND, idani : i32, lprcfrom : *const super::super::Foundation:: RECT, lprcto : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawCaption(hwnd : super::super::Foundation:: HWND, hdc : HDC, lprect : *const super::super::Foundation:: RECT, flags : DRAW_CAPTION_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawEdge(hdc : HDC, qrc : *mut super::super::Foundation:: RECT, edge : DRAWEDGE_FLAGS, grfflags : DRAW_EDGE_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn DrawEscape(hdc : HDC, iescape : i32, cjin : i32, lpin : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawFocusRect(hdc : HDC, lprc : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawFrameControl(param0 : HDC, param1 : *mut super::super::Foundation:: RECT, param2 : DFC_TYPE, param3 : DFCS_STATE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawStateA(hdc : HDC, hbrfore : HBRUSH, qfncallback : DRAWSTATEPROC, ldata : super::super::Foundation:: LPARAM, wdata : super::super::Foundation:: WPARAM, x : i32, y : i32, cx : i32, cy : i32, uflags : DRAWSTATE_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawStateW(hdc : HDC, hbrfore : HBRUSH, qfncallback : DRAWSTATEPROC, ldata : super::super::Foundation:: LPARAM, wdata : super::super::Foundation:: WPARAM, x : i32, y : i32, cx : i32, cy : i32, uflags : DRAWSTATE_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawTextA(hdc : HDC, lpchtext : windows_sys::core::PCSTR, cchtext : i32, lprc : *mut super::super::Foundation:: RECT, format : DRAW_TEXT_FORMAT) -> i32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawTextExA(hdc : HDC, lpchtext : windows_sys::core::PSTR, cchtext : i32, lprc : *mut super::super::Foundation:: RECT, format : DRAW_TEXT_FORMAT, lpdtp : *const DRAWTEXTPARAMS) -> i32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawTextExW(hdc : HDC, lpchtext : windows_sys::core::PWSTR, cchtext : i32, lprc : *mut super::super::Foundation:: RECT, format : DRAW_TEXT_FORMAT, lpdtp : *const DRAWTEXTPARAMS) -> i32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DrawTextW(hdc : HDC, lpchtext : windows_sys::core::PCWSTR, cchtext : i32, lprc : *mut super::super::Foundation:: RECT, format : DRAW_TEXT_FORMAT) -> i32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn Ellipse(hdc : HDC, left : i32, top : i32, right : i32, bottom : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EndPaint(hwnd : super::super::Foundation:: HWND, lppaint : *const PAINTSTRUCT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EndPath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDisplayDevicesA(lpdevice : windows_sys::core::PCSTR, idevnum : u32, lpdisplaydevice : *mut DISPLAY_DEVICEA, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDisplayDevicesW(lpdevice : windows_sys::core::PCWSTR, idevnum : u32, lpdisplaydevice : *mut DISPLAY_DEVICEW, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDisplayMonitors(hdc : HDC, lprcclip : *const super::super::Foundation:: RECT, lpfnenum : MONITORENUMPROC, dwdata : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDisplaySettingsA(lpszdevicename : windows_sys::core::PCSTR, imodenum : ENUM_DISPLAY_SETTINGS_MODE, lpdevmode : *mut DEVMODEA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDisplaySettingsExA(lpszdevicename : windows_sys::core::PCSTR, imodenum : ENUM_DISPLAY_SETTINGS_MODE, lpdevmode : *mut DEVMODEA, dwflags : ENUM_DISPLAY_SETTINGS_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDisplaySettingsExW(lpszdevicename : windows_sys::core::PCWSTR, imodenum : ENUM_DISPLAY_SETTINGS_MODE, lpdevmode : *mut DEVMODEW, dwflags : ENUM_DISPLAY_SETTINGS_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDisplaySettingsW(lpszdevicename : windows_sys::core::PCWSTR, imodenum : ENUM_DISPLAY_SETTINGS_MODE, lpdevmode : *mut DEVMODEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumEnhMetaFile(hdc : HDC, hmf : HENHMETAFILE, proc : ENHMFENUMPROC, param3 : *const core::ffi::c_void, lprect : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumFontFamiliesA(hdc : HDC, lplogfont : windows_sys::core::PCSTR, lpproc : FONTENUMPROCA, lparam : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumFontFamiliesExA(hdc : HDC, lplogfont : *const LOGFONTA, lpproc : FONTENUMPROCA, lparam : super::super::Foundation:: LPARAM, dwflags : u32) -> i32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumFontFamiliesExW(hdc : HDC, lplogfont : *const LOGFONTW, lpproc : FONTENUMPROCW, lparam : super::super::Foundation:: LPARAM, dwflags : u32) -> i32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumFontFamiliesW(hdc : HDC, lplogfont : windows_sys::core::PCWSTR, lpproc : FONTENUMPROCW, lparam : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumFontsA(hdc : HDC, lplogfont : windows_sys::core::PCSTR, lpproc : FONTENUMPROCA, lparam : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumFontsW(hdc : HDC, lplogfont : windows_sys::core::PCWSTR, lpproc : FONTENUMPROCW, lparam : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumMetaFile(hdc : HDC, hmf : HMETAFILE, proc : MFENUMPROC, param3 : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EnumObjects(hdc : HDC, ntype : OBJ_TYPE, lpfunc : GOBJENUMPROC, lparam : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EqualRect(lprc1 : *const super::super::Foundation:: RECT, lprc2 : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EqualRgn(hrgn1 : HRGN, hrgn2 : HRGN) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ExcludeClipRect(hdc : HDC, left : i32, top : i32, right : i32, bottom : i32) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ExcludeUpdateRgn(hdc : HDC, hwnd : super::super::Foundation:: HWND) -> i32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ExtCreatePen(ipenstyle : u32, cwidth : u32, plbrush : *const LOGBRUSH, cstyle : u32, pstyle : *const u32) -> HPEN);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ExtCreateRegion(lpx : *const XFORM, ncount : u32, lpdata : *const RGNDATA) -> HRGN);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ExtFloodFill(hdc : HDC, x : i32, y : i32, color : super::super::Foundation:: COLORREF, r#type : EXT_FLOOD_FILL_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ExtSelectClipRgn(hdc : HDC, hrgn : HRGN, mode : RGN_COMBINE_MODE) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ExtTextOutA(hdc : HDC, x : i32, y : i32, options : ETO_OPTIONS, lprect : *const super::super::Foundation:: RECT, lpstring : windows_sys::core::PCSTR, c : u32, lpdx : *const i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ExtTextOutW(hdc : HDC, x : i32, y : i32, options : ETO_OPTIONS, lprect : *const super::super::Foundation:: RECT, lpstring : windows_sys::core::PCWSTR, c : u32, lpdx : *const i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FillPath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn FillRect(hdc : HDC, lprc : *const super::super::Foundation:: RECT, hbr : HBRUSH) -> i32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FillRgn(hdc : HDC, hrgn : HRGN, hbr : HBRUSH) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FixBrushOrgEx(hdc : HDC, x : i32, y : i32, ptl : *const super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FlattenPath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FloodFill(hdc : HDC, x : i32, y : i32, color : super::super::Foundation:: COLORREF) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn FrameRect(hdc : HDC, lprc : *const super::super::Foundation:: RECT, hbr : HBRUSH) -> i32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FrameRgn(hdc : HDC, hrgn : HRGN, hbr : HBRUSH, w : i32, h : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiAlphaBlend(hdcdest : HDC, xorigindest : i32, yorigindest : i32, wdest : i32, hdest : i32, hdcsrc : HDC, xoriginsrc : i32, yoriginsrc : i32, wsrc : i32, hsrc : i32, ftn : BLENDFUNCTION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiComment(hdc : HDC, nsize : u32, lpdata : *const u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiFlush() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiGetBatchLimit() -> u32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiGradientFill(hdc : HDC, pvertex : *const TRIVERTEX, nvertex : u32, pmesh : *const core::ffi::c_void, ncount : u32, ulmode : GRADIENT_FILL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiSetBatchLimit(dw : u32) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GdiTransparentBlt(hdcdest : HDC, xorigindest : i32, yorigindest : i32, wdest : i32, hdest : i32, hdcsrc : HDC, xoriginsrc : i32, yoriginsrc : i32, wsrc : i32, hsrc : i32, crtransparent : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetArcDirection(hdc : HDC) -> i32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetAspectRatioFilterEx(hdc : HDC, lpsize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetBitmapBits(hbit : HBITMAP, cb : i32, lpvbits : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetBitmapDimensionEx(hbit : HBITMAP, lpsize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetBkColor(hdc : HDC) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetBkMode(hdc : HDC) -> i32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetBoundsRect(hdc : HDC, lprect : *mut super::super::Foundation:: RECT, flags : u32) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetBrushOrgEx(hdc : HDC, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharABCWidthsA(hdc : HDC, wfirst : u32, wlast : u32, lpabc : *mut ABC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharABCWidthsFloatA(hdc : HDC, ifirst : u32, ilast : u32, lpabc : *mut ABCFLOAT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharABCWidthsFloatW(hdc : HDC, ifirst : u32, ilast : u32, lpabc : *mut ABCFLOAT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharABCWidthsI(hdc : HDC, gifirst : u32, cgi : u32, pgi : *const u16, pabc : *mut ABC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharABCWidthsW(hdc : HDC, wfirst : u32, wlast : u32, lpabc : *mut ABC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharWidth32A(hdc : HDC, ifirst : u32, ilast : u32, lpbuffer : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharWidth32W(hdc : HDC, ifirst : u32, ilast : u32, lpbuffer : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharWidthA(hdc : HDC, ifirst : u32, ilast : u32, lpbuffer : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharWidthFloatA(hdc : HDC, ifirst : u32, ilast : u32, lpbuffer : *mut f32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharWidthFloatW(hdc : HDC, ifirst : u32, ilast : u32, lpbuffer : *mut f32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharWidthI(hdc : HDC, gifirst : u32, cgi : u32, pgi : *const u16, piwidths : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharWidthW(hdc : HDC, ifirst : u32, ilast : u32, lpbuffer : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharacterPlacementA(hdc : HDC, lpstring : windows_sys::core::PCSTR, ncount : i32, nmexextent : i32, lpresults : *mut GCP_RESULTSA, dwflags : GET_CHARACTER_PLACEMENT_FLAGS) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCharacterPlacementW(hdc : HDC, lpstring : windows_sys::core::PCWSTR, ncount : i32, nmexextent : i32, lpresults : *mut GCP_RESULTSW, dwflags : GET_CHARACTER_PLACEMENT_FLAGS) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetClipBox(hdc : HDC, lprect : *mut super::super::Foundation:: RECT) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetClipRgn(hdc : HDC, hrgn : HRGN) -> i32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetColorAdjustment(hdc : HDC, lpca : *mut COLORADJUSTMENT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCurrentObject(hdc : HDC, r#type : u32) -> HGDIOBJ);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetCurrentPositionEx(hdc : HDC, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDC(hwnd : super::super::Foundation:: HWND) -> HDC);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetDCBrushColor(hdc : HDC) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDCEx(hwnd : super::super::Foundation:: HWND, hrgnclip : HRGN, flags : GET_DCX_FLAGS) -> HDC);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetDCOrgEx(hdc : HDC, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetDCPenColor(hdc : HDC) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetDIBColorTable(hdc : HDC, istart : u32, centries : u32, prgbq : *mut RGBQUAD) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetDIBits(hdc : HDC, hbm : HBITMAP, start : u32, clines : u32, lpvbits : *mut core::ffi::c_void, lpbmi : *mut BITMAPINFO, usage : DIB_USAGE) -> i32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetDeviceCaps(hdc : HDC, index : i32) -> i32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFileA(lpname : windows_sys::core::PCSTR) -> HENHMETAFILE);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFileBits(hemf : HENHMETAFILE, nsize : u32, lpdata : *mut u8) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFileDescriptionA(hemf : HENHMETAFILE, cchbuffer : u32, lpdescription : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFileDescriptionW(hemf : HENHMETAFILE, cchbuffer : u32, lpdescription : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFileHeader(hemf : HENHMETAFILE, nsize : u32, lpenhmetaheader : *mut ENHMETAHEADER) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFilePaletteEntries(hemf : HENHMETAFILE, nnumentries : u32, lppaletteentries : *mut PALETTEENTRY) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetEnhMetaFileW(lpname : windows_sys::core::PCWSTR) -> HENHMETAFILE);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetFontData(hdc : HDC, dwtable : u32, dwoffset : u32, pvbuffer : *mut core::ffi::c_void, cjbuffer : u32) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetFontLanguageInfo(hdc : HDC) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetFontUnicodeRanges(hdc : HDC, lpgs : *mut GLYPHSET) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetGlyphIndicesA(hdc : HDC, lpstr : windows_sys::core::PCSTR, c : i32, pgi : *mut u16, fl : u32) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetGlyphIndicesW(hdc : HDC, lpstr : windows_sys::core::PCWSTR, c : i32, pgi : *mut u16, fl : u32) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetGlyphOutlineA(hdc : HDC, uchar : u32, fuformat : GET_GLYPH_OUTLINE_FORMAT, lpgm : *mut GLYPHMETRICS, cjbuffer : u32, pvbuffer : *mut core::ffi::c_void, lpmat2 : *const MAT2) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetGlyphOutlineW(hdc : HDC, uchar : u32, fuformat : GET_GLYPH_OUTLINE_FORMAT, lpgm : *mut GLYPHMETRICS, cjbuffer : u32, pvbuffer : *mut core::ffi::c_void, lpmat2 : *const MAT2) -> u32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetGraphicsMode(hdc : HDC) -> i32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetKerningPairsA(hdc : HDC, npairs : u32, lpkernpair : *mut KERNINGPAIR) -> u32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetKerningPairsW(hdc : HDC, npairs : u32, lpkernpair : *mut KERNINGPAIR) -> u32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetLayout(hdc : HDC) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetMapMode(hdc : HDC) -> HDC_MAP_MODE);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetMetaFileA(lpname : windows_sys::core::PCSTR) -> HMETAFILE);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetMetaFileBitsEx(hmf : HMETAFILE, cbbuffer : u32, lpdata : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetMetaFileW(lpname : windows_sys::core::PCWSTR) -> HMETAFILE);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetMetaRgn(hdc : HDC, hrgn : HRGN) -> i32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetMiterLimit(hdc : HDC, plimit : *mut f32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetMonitorInfoA(hmonitor : HMONITOR, lpmi : *mut MONITORINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetMonitorInfoW(hmonitor : HMONITOR, lpmi : *mut MONITORINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetNearestColor(hdc : HDC, color : super::super::Foundation:: COLORREF) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetNearestPaletteIndex(h : HPALETTE, color : super::super::Foundation:: COLORREF) -> u32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetObjectA(h : HGDIOBJ, c : i32, pv : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetObjectType(h : HGDIOBJ) -> u32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetObjectW(h : HGDIOBJ, c : i32, pv : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetOutlineTextMetricsA(hdc : HDC, cjcopy : u32, potm : *mut OUTLINETEXTMETRICA) -> u32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetOutlineTextMetricsW(hdc : HDC, cjcopy : u32, potm : *mut OUTLINETEXTMETRICW) -> u32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetPaletteEntries(hpal : HPALETTE, istart : u32, centries : u32, ppalentries : *mut PALETTEENTRY) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetPath(hdc : HDC, apt : *mut super::super::Foundation:: POINT, aj : *mut u8, cpt : i32) -> i32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetPixel(hdc : HDC, x : i32, y : i32) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetPolyFillMode(hdc : HDC) -> i32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetROP2(hdc : HDC) -> R2_MODE);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetRandomRgn(hdc : HDC, hrgn : HRGN, i : i32) -> i32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetRasterizerCaps(lpraststat : *mut RASTERIZER_STATUS, cjbytes : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetRegionData(hrgn : HRGN, ncount : u32, lprgndata : *mut RGNDATA) -> u32);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetRgnBox(hrgn : HRGN, lprc : *mut super::super::Foundation:: RECT) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetStockObject(i : GET_STOCK_OBJECT_FLAGS) -> HGDIOBJ);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetStretchBltMode(hdc : HDC) -> i32);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetSysColor(nindex : SYS_COLOR_INDEX) -> u32);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetSysColorBrush(nindex : SYS_COLOR_INDEX) -> HBRUSH);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetSystemPaletteEntries(hdc : HDC, istart : u32, centries : u32, ppalentries : *mut PALETTEENTRY) -> u32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetSystemPaletteUse(hdc : HDC) -> u32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetTabbedTextExtentA(hdc : HDC, lpstring : windows_sys::core::PCSTR, chcount : i32, ntabpositions : i32, lpntabstoppositions : *const i32) -> u32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetTabbedTextExtentW(hdc : HDC, lpstring : windows_sys::core::PCWSTR, chcount : i32, ntabpositions : i32, lpntabstoppositions : *const i32) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextAlign(hdc : HDC) -> TEXT_ALIGN_OPTIONS);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextCharacterExtra(hdc : HDC) -> i32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextColor(hdc : HDC) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentExPointA(hdc : HDC, lpszstring : windows_sys::core::PCSTR, cchstring : i32, nmaxextent : i32, lpnfit : *mut i32, lpndx : *mut i32, lpsize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentExPointI(hdc : HDC, lpwszstring : *const u16, cwchstring : i32, nmaxextent : i32, lpnfit : *mut i32, lpndx : *mut i32, lpsize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentExPointW(hdc : HDC, lpszstring : windows_sys::core::PCWSTR, cchstring : i32, nmaxextent : i32, lpnfit : *mut i32, lpndx : *mut i32, lpsize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentPoint32A(hdc : HDC, lpstring : windows_sys::core::PCSTR, c : i32, psizl : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentPoint32W(hdc : HDC, lpstring : windows_sys::core::PCWSTR, c : i32, psizl : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentPointA(hdc : HDC, lpstring : windows_sys::core::PCSTR, c : i32, lpsz : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentPointI(hdc : HDC, pgiin : *const u16, cgi : i32, psize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextExtentPointW(hdc : HDC, lpstring : windows_sys::core::PCWSTR, c : i32, lpsz : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextFaceA(hdc : HDC, c : i32, lpname : windows_sys::core::PSTR) -> i32);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextFaceW(hdc : HDC, c : i32, lpname : windows_sys::core::PWSTR) -> i32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextMetricsA(hdc : HDC, lptm : *mut TEXTMETRICA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetTextMetricsW(hdc : HDC, lptm : *mut TEXTMETRICW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetUpdateRect(hwnd : super::super::Foundation:: HWND, lprect : *mut super::super::Foundation:: RECT, berase : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetUpdateRgn(hwnd : super::super::Foundation:: HWND, hrgn : HRGN, berase : windows_sys::core::BOOL) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetViewportExtEx(hdc : HDC, lpsize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetViewportOrgEx(hdc : HDC, lppoint : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetWinMetaFileBits(hemf : HENHMETAFILE, cbdata16 : u32, pdata16 : *mut u8, imapmode : i32, hdcref : HDC) -> u32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetWindowDC(hwnd : super::super::Foundation:: HWND) -> HDC);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetWindowExtEx(hdc : HDC, lpsize : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetWindowOrgEx(hdc : HDC, lppoint : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetWindowRgn(hwnd : super::super::Foundation:: HWND, hrgn : HRGN) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetWindowRgnBox(hwnd : super::super::Foundation:: HWND, lprc : *mut super::super::Foundation:: RECT) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn GetWorldTransform(hdc : HDC, lpxf : *mut XFORM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("msimg32.dll" "system" fn GradientFill(hdc : HDC, pvertex : *const TRIVERTEX, nvertex : u32, pmesh : *const core::ffi::c_void, nmesh : u32, ulmode : GRADIENT_FILL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GrayStringA(hdc : HDC, hbrush : HBRUSH, lpoutputfunc : GRAYSTRINGPROC, lpdata : super::super::Foundation:: LPARAM, ncount : i32, x : i32, y : i32, nwidth : i32, nheight : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GrayStringW(hdc : HDC, hbrush : HBRUSH, lpoutputfunc : GRAYSTRINGPROC, lpdata : super::super::Foundation:: LPARAM, ncount : i32, x : i32, y : i32, nwidth : i32, nheight : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn InflateRect(lprc : *mut super::super::Foundation:: RECT, dx : i32, dy : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn IntersectClipRect(hdc : HDC, left : i32, top : i32, right : i32, bottom : i32) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IntersectRect(lprcdst : *mut super::super::Foundation:: RECT, lprcsrc1 : *const super::super::Foundation:: RECT, lprcsrc2 : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn InvalidateRect(hwnd : super::super::Foundation:: HWND, lprect : *const super::super::Foundation:: RECT, berase : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn InvalidateRgn(hwnd : super::super::Foundation:: HWND, hrgn : HRGN, berase : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn InvertRect(hdc : HDC, lprc : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn InvertRgn(hdc : HDC, hrgn : HRGN) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IsRectEmpty(lprc : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn LPtoDP(hdc : HDC, lppt : *mut super::super::Foundation:: POINT, c : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn LineDDA(xstart : i32, ystart : i32, xend : i32, yend : i32, lpproc : LINEDDAPROC, data : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn LineTo(hdc : HDC, x : i32, y : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn LoadBitmapA(hinstance : super::super::Foundation:: HINSTANCE, lpbitmapname : windows_sys::core::PCSTR) -> HBITMAP);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn LoadBitmapW(hinstance : super::super::Foundation:: HINSTANCE, lpbitmapname : windows_sys::core::PCWSTR) -> HBITMAP);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn LockWindowUpdate(hwndlock : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn MapWindowPoints(hwndfrom : super::super::Foundation:: HWND, hwndto : super::super::Foundation:: HWND, lppoints : *mut super::super::Foundation:: POINT, cpoints : u32) -> i32);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn MaskBlt(hdcdest : HDC, xdest : i32, ydest : i32, width : i32, height : i32, hdcsrc : HDC, xsrc : i32, ysrc : i32, hbmmask : HBITMAP, xmask : i32, ymask : i32, rop : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("fontsub.dll" "C" fn MergeFontPackage(puchmergefontbuffer : *const u8, ulmergefontbuffersize : u32, puchfontpackagebuffer : *const u8, ulfontpackagebuffersize : u32, ppuchdestbuffer : *mut *mut u8, puldestbuffersize : *mut u32, pulbyteswritten : *mut u32, usmode : u16, lpfnallocate : CFP_ALLOCPROC, lpfnreallocate : CFP_REALLOCPROC, lpfnfree : CFP_FREEPROC, lpvreserved : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ModifyWorldTransform(hdc : HDC, lpxf : *const XFORM, mode : MODIFY_WORLD_TRANSFORM_MODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn MonitorFromPoint(pt : super::super::Foundation:: POINT, dwflags : MONITOR_FROM_FLAGS) -> HMONITOR);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn MonitorFromRect(lprc : *const super::super::Foundation:: RECT, dwflags : MONITOR_FROM_FLAGS) -> HMONITOR);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn MonitorFromWindow(hwnd : super::super::Foundation:: HWND, dwflags : MONITOR_FROM_FLAGS) -> HMONITOR);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn MoveToEx(hdc : HDC, x : i32, y : i32, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn OffsetClipRgn(hdc : HDC, x : i32, y : i32) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn OffsetRect(lprc : *mut super::super::Foundation:: RECT, dx : i32, dy : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn OffsetRgn(hrgn : HRGN, x : i32, y : i32) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn OffsetViewportOrgEx(hdc : HDC, x : i32, y : i32, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn OffsetWindowOrgEx(hdc : HDC, x : i32, y : i32, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn PaintDesktop(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PaintRgn(hdc : HDC, hrgn : HRGN) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PatBlt(hdc : HDC, x : i32, y : i32, w : i32, h : i32, rop : ROP_CODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PathToRegion(hdc : HDC) -> HRGN);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn Pie(hdc : HDC, left : i32, top : i32, right : i32, bottom : i32, xr1 : i32, yr1 : i32, xr2 : i32, yr2 : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PlayEnhMetaFile(hdc : HDC, hmf : HENHMETAFILE, lprect : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PlayEnhMetaFileRecord(hdc : HDC, pht : *const HANDLETABLE, pmr : *const ENHMETARECORD, cht : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PlayMetaFile(hdc : HDC, hmf : HMETAFILE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PlayMetaFileRecord(hdc : HDC, lphandletable : *const HANDLETABLE, lpmr : *const METARECORD, noobjs : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PlgBlt(hdcdest : HDC, lppoint : *const super::super::Foundation:: POINT, hdcsrc : HDC, xsrc : i32, ysrc : i32, width : i32, height : i32, hbmmask : HBITMAP, xmask : i32, ymask : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolyBezier(hdc : HDC, apt : *const super::super::Foundation:: POINT, cpt : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolyBezierTo(hdc : HDC, apt : *const super::super::Foundation:: POINT, cpt : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolyDraw(hdc : HDC, apt : *const super::super::Foundation:: POINT, aj : *const u8, cpt : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolyPolygon(hdc : HDC, apt : *const super::super::Foundation:: POINT, asz : *const i32, csz : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolyPolyline(hdc : HDC, apt : *const super::super::Foundation:: POINT, asz : *const u32, csz : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolyTextOutA(hdc : HDC, ppt : *const POLYTEXTA, nstrings : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolyTextOutW(hdc : HDC, ppt : *const POLYTEXTW, nstrings : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn Polygon(hdc : HDC, apt : *const super::super::Foundation:: POINT, cpt : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn Polyline(hdc : HDC, apt : *const super::super::Foundation:: POINT, cpt : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PolylineTo(hdc : HDC, apt : *const super::super::Foundation:: POINT, cpt : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn PtInRect(lprc : *const super::super::Foundation:: RECT, pt : super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PtInRegion(hrgn : HRGN, x : i32, y : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PtVisible(hdc : HDC, x : i32, y : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RealizePalette(hdc : HDC) -> u32);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RectInRegion(hrgn : HRGN, lprect : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RectVisible(hdc : HDC, lprect : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn Rectangle(hdc : HDC, left : i32, top : i32, right : i32, bottom : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn RedrawWindow(hwnd : super::super::Foundation:: HWND, lprcupdate : *const super::super::Foundation:: RECT, hrgnupdate : HRGN, flags : REDRAW_WINDOW_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ReleaseDC(hwnd : super::super::Foundation:: HWND, hdc : HDC) -> i32);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RemoveFontMemResourceEx(h : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RemoveFontResourceA(lpfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RemoveFontResourceExA(name : windows_sys::core::PCSTR, fl : u32, pdv : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RemoveFontResourceExW(name : windows_sys::core::PCWSTR, fl : u32, pdv : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RemoveFontResourceW(lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ResetDCA(hdc : HDC, lpdm : *const DEVMODEA) -> HDC);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ResetDCW(hdc : HDC, lpdm : *const DEVMODEW) -> HDC);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ResizePalette(hpal : HPALETTE, n : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RestoreDC(hdc : HDC, nsaveddc : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn RoundRect(hdc : HDC, left : i32, top : i32, right : i32, bottom : i32, width : i32, height : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SaveDC(hdc : HDC) -> i32);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ScaleViewportExtEx(hdc : HDC, xn : i32, dx : i32, yn : i32, yd : i32, lpsz : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn ScaleWindowExtEx(hdc : HDC, xn : i32, xd : i32, yn : i32, yd : i32, lpsz : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ScreenToClient(hwnd : super::super::Foundation:: HWND, lppoint : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SelectClipPath(hdc : HDC, mode : RGN_COMBINE_MODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SelectClipRgn(hdc : HDC, hrgn : HRGN) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SelectObject(hdc : HDC, h : HGDIOBJ) -> HGDIOBJ);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SelectPalette(hdc : HDC, hpal : HPALETTE, bforcebkgd : windows_sys::core::BOOL) -> HPALETTE);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetArcDirection(hdc : HDC, dir : ARC_DIRECTION) -> i32);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetBitmapBits(hbm : HBITMAP, cb : u32, pvbits : *const core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetBitmapDimensionEx(hbm : HBITMAP, w : i32, h : i32, lpsz : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetBkColor(hdc : HDC, color : super::super::Foundation:: COLORREF) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetBkMode(hdc : HDC, mode : i32) -> i32);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetBoundsRect(hdc : HDC, lprect : *const super::super::Foundation:: RECT, flags : SET_BOUNDS_RECT_FLAGS) -> u32);

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetBrushOrgEx(hdc : HDC, x : i32, y : i32, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetColorAdjustment(hdc : HDC, lpca : *const COLORADJUSTMENT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetDCBrushColor(hdc : HDC, color : super::super::Foundation:: COLORREF) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetDCPenColor(hdc : HDC, color : super::super::Foundation:: COLORREF) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetDIBColorTable(hdc : HDC, istart : u32, centries : u32, prgbq : *const RGBQUAD) -> u32);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetDIBits(hdc : HDC, hbm : HBITMAP, start : u32, clines : u32, lpbits : *const core::ffi::c_void, lpbmi : *const BITMAPINFO, coloruse : DIB_USAGE) -> i32);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetDIBitsToDevice(hdc : HDC, xdest : i32, ydest : i32, w : u32, h : u32, xsrc : i32, ysrc : i32, startscan : u32, clines : u32, lpvbits : *const core::ffi::c_void, lpbmi : *const BITMAPINFO, coloruse : DIB_USAGE) -> i32);

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetEnhMetaFileBits(nsize : u32, pb : *const u8) -> HENHMETAFILE);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetGraphicsMode(hdc : HDC, imode : GRAPHICS_MODE) -> i32);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetLayout(hdc : HDC, l : DC_LAYOUT) -> u32);

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetMapMode(hdc : HDC, imode : HDC_MAP_MODE) -> i32);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetMapperFlags(hdc : HDC, flags : u32) -> u32);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetMetaFileBitsEx(cbbuffer : u32, lpdata : *const u8) -> HMETAFILE);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetMetaRgn(hdc : HDC) -> GDI_REGION_TYPE);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetMiterLimit(hdc : HDC, limit : f32, old : *mut f32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetPaletteEntries(hpal : HPALETTE, istart : u32, centries : u32, ppalentries : *const PALETTEENTRY) -> u32);

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetPixel(hdc : HDC, x : i32, y : i32, color : super::super::Foundation:: COLORREF) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetPixelV(hdc : HDC, x : i32, y : i32, color : super::super::Foundation:: COLORREF) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetPolyFillMode(hdc : HDC, mode : CREATE_POLYGON_RGN_MODE) -> i32);

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetROP2(hdc : HDC, rop2 : R2_MODE) -> i32);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetRect(lprc : *mut super::super::Foundation:: RECT, xleft : i32, ytop : i32, xright : i32, ybottom : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetRectEmpty(lprc : *mut super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 350:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetRectRgn(hrgn : HRGN, left : i32, top : i32, right : i32, bottom : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetStretchBltMode(hdc : HDC, mode : STRETCH_BLT_MODE) -> i32);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetSysColors(celements : i32, lpaelements : *const i32, lpargbvalues : *const super::super::Foundation:: COLORREF) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetSystemPaletteUse(hdc : HDC, r#use : SYSTEM_PALETTE_USE) -> u32);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetTextAlign(hdc : HDC, align : TEXT_ALIGN_OPTIONS) -> u32);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetTextCharacterExtra(hdc : HDC, extra : i32) -> i32);

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetTextColor(hdc : HDC, color : super::super::Foundation:: COLORREF) -> super::super::Foundation:: COLORREF);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetTextJustification(hdc : HDC, extra : i32, count : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetViewportExtEx(hdc : HDC, x : i32, y : i32, lpsz : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetViewportOrgEx(hdc : HDC, x : i32, y : i32, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetWindowExtEx(hdc : HDC, x : i32, y : i32, lpsz : *mut super::super::Foundation:: SIZE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetWindowOrgEx(hdc : HDC, x : i32, y : i32, lppt : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetWindowRgn(hwnd : super::super::Foundation:: HWND, hrgn : HRGN, bredraw : windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn SetWorldTransform(hdc : HDC, lpxf : *const XFORM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn StretchBlt(hdcdest : HDC, xdest : i32, ydest : i32, wdest : i32, hdest : i32, hdcsrc : HDC, xsrc : i32, ysrc : i32, wsrc : i32, hsrc : i32, rop : ROP_CODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn StretchDIBits(hdc : HDC, xdest : i32, ydest : i32, destwidth : i32, destheight : i32, xsrc : i32, ysrc : i32, srcwidth : i32, srcheight : i32, lpbits : *const core::ffi::c_void, lpbmi : *const BITMAPINFO, iusage : DIB_USAGE, rop : ROP_CODE) -> i32);

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn StrokeAndFillPath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn StrokePath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SubtractRect(lprcdst : *mut super::super::Foundation:: RECT, lprcsrc1 : *const super::super::Foundation:: RECT, lprcsrc2 : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTCharToUnicode(hdc : HDC, puccharcodes : *const u8, ulcharcodesize : u32, pusshortcodes : *mut u16, ulshortcodesize : u32, ulflags : u32) -> i32);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTDeleteEmbeddedFont(hfontreference : super::super::Foundation:: HANDLE, ulflags : u32, pulstatus : *mut u32) -> i32);

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTEmbedFont(hdc : HDC, ulflags : TTEMBED_FLAGS, ulcharset : EMBED_FONT_CHARSET, pulprivstatus : *mut EMBEDDED_FONT_PRIV_STATUS, pulstatus : *mut u32, lpfnwritetostream : WRITEEMBEDPROC, lpvwritestream : *const core::ffi::c_void, puscharcodeset : *const u16, uscharcodecount : u16, uslanguage : u16, pttembedinfo : *const TTEMBEDINFO) -> i32);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTEmbedFontEx(hdc : HDC, ulflags : TTEMBED_FLAGS, ulcharset : EMBED_FONT_CHARSET, pulprivstatus : *mut EMBEDDED_FONT_PRIV_STATUS, pulstatus : *mut u32, lpfnwritetostream : WRITEEMBEDPROC, lpvwritestream : *const core::ffi::c_void, pulcharcodeset : *const u32, uscharcodecount : u16, uslanguage : u16, pttembedinfo : *const TTEMBEDINFO) -> i32);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTEmbedFontFromFileA(hdc : HDC, szfontfilename : windows_sys::core::PCSTR, usttcindex : u16, ulflags : TTEMBED_FLAGS, ulcharset : EMBED_FONT_CHARSET, pulprivstatus : *mut EMBEDDED_FONT_PRIV_STATUS, pulstatus : *mut u32, lpfnwritetostream : WRITEEMBEDPROC, lpvwritestream : *const core::ffi::c_void, puscharcodeset : *const u16, uscharcodecount : u16, uslanguage : u16, pttembedinfo : *const TTEMBEDINFO) -> i32);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTEnableEmbeddingForFacename(lpszfacename : windows_sys::core::PCSTR, benable : windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTGetEmbeddedFontInfo(ulflags : TTEMBED_FLAGS, pulprivstatus : *mut u32, ulprivs : FONT_LICENSE_PRIVS, pulstatus : *mut u32, lpfnreadfromstream : READEMBEDPROC, lpvreadstream : *const core::ffi::c_void, pttloadinfo : *const TTLOADINFO) -> i32);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTGetEmbeddingType(hdc : HDC, pulembedtype : *mut EMBEDDED_FONT_PRIV_STATUS) -> i32);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTGetNewFontName(phfontreference : *const super::super::Foundation:: HANDLE, wzwinfamilyname : windows_sys::core::PWSTR, cchmaxwinname : i32, szmacfamilyname : windows_sys::core::PSTR, cchmaxmacname : i32) -> i32);

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTIsEmbeddingEnabled(hdc : HDC, pbenabled : *mut windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTIsEmbeddingEnabledForFacename(lpszfacename : windows_sys::core::PCSTR, pbenabled : *mut windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTLoadEmbeddedFont(phfontreference : *mut super::super::Foundation:: HANDLE, ulflags : u32, pulprivstatus : *mut EMBEDDED_FONT_PRIV_STATUS, ulprivs : FONT_LICENSE_PRIVS, pulstatus : *mut TTLOAD_EMBEDDED_FONT_STATUS, lpfnreadfromstream : READEMBEDPROC, lpvreadstream : *const core::ffi::c_void, szwinfamilyname : windows_sys::core::PCWSTR, szmacfamilyname : windows_sys::core::PCSTR, pttloadinfo : *const TTLOADINFO) -> i32);

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTRunValidationTests(hdc : HDC, ptestparam : *const TTVALIDATIONTESTSPARAMS) -> i32);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("t2embed.dll" "system" fn TTRunValidationTestsEx(hdc : HDC, ptestparam : *const TTVALIDATIONTESTSPARAMSEX) -> i32);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn TabbedTextOutA(hdc : HDC, x : i32, y : i32, lpstring : windows_sys::core::PCSTR, chcount : i32, ntabpositions : i32, lpntabstoppositions : *const i32, ntaborigin : i32) -> i32);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn TabbedTextOutW(hdc : HDC, x : i32, y : i32, lpstring : windows_sys::core::PCWSTR, chcount : i32, ntabpositions : i32, lpntabstoppositions : *const i32, ntaborigin : i32) -> i32);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn TextOutA(hdc : HDC, x : i32, y : i32, lpstring : windows_sys::core::PCSTR, c : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn TextOutW(hdc : HDC, x : i32, y : i32, lpstring : windows_sys::core::PCWSTR, c : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("msimg32.dll" "system" fn TransparentBlt(hdcdest : HDC, xorigindest : i32, yorigindest : i32, wdest : i32, hdest : i32, hdcsrc : HDC, xoriginsrc : i32, yoriginsrc : i32, wsrc : i32, hsrc : i32, crtransparent : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn UnionRect(lprcdst : *mut super::super::Foundation:: RECT, lprcsrc1 : *const super::super::Foundation:: RECT, lprcsrc2 : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn UnrealizeObject(h : HGDIOBJ) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn UpdateColors(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn UpdateWindow(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ValidateRect(hwnd : super::super::Foundation:: HWND, lprect : *const super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ValidateRgn(hwnd : super::super::Foundation:: HWND, hrgn : HRGN) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn WidenPath(hdc : HDC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn WindowFromDC(hdc : HDC) -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("opengl32.dll" "system" fn wglSwapMultipleBuffers(param0 : u32, param1 : *const WGLSWAP) -> u32);

// UNSUPPORTED Rust 397:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ABC {
//     pub abcA: i32,
//     pub abcB: u32,
//     pub abcC: i32,
// }

// UNSUPPORTED Rust 404:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ABCFLOAT {
//     pub abcfA: f32,
//     pub abcfB: f32,
//     pub abcfC: f32,
// }

public const val `ABORTDOC`: UInt = 2u;
// UNSUPPORTED Rust 412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ABORTPATH {
//     pub emr: EMR,
// }

public const val `ABSOLUTE`: UInt = 1u;
public const val `AC_SRC_ALPHA`: UInt = 1u;
public const val `AC_SRC_OVER`: UInt = 0u;
public const val `AD_CLOCKWISE`: `ARC_DIRECTION` = 2;
public const val `AD_COUNTERCLOCKWISE`: `ARC_DIRECTION` = 1;
public const val `ALTERNATE`: `CREATE_POLYGON_RGN_MODE` = 1;
public const val `ANSI_CHARSET`: `FONT_CHARSET` = 0u;
public const val `ANSI_FIXED_FONT`: `GET_STOCK_OBJECT_FLAGS` = 11;
public const val `ANSI_VAR_FONT`: `GET_STOCK_OBJECT_FLAGS` = 12;
public const val `ANTIALIASED_QUALITY`: `FONT_QUALITY` = 4u;
public const val `ARABIC_CHARSET`: `FONT_CHARSET` = 178u;
public typealias `ARC_DIRECTION` = Int;
public const val `ASPECTX`: `GET_DEVICE_CAPS_INDEX` = 40u;
public const val `ASPECTXY`: `GET_DEVICE_CAPS_INDEX` = 44u;
public const val `ASPECTY`: `GET_DEVICE_CAPS_INDEX` = 42u;
public const val `ASPECT_FILTERING`: UInt = 1u;
// UNSUPPORTED Rust 433:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AXESLISTA {
//     pub axlReserved: u32,
//     pub axlNumAxes: u32,
//     pub axlAxisInfo: [AXISINFOA; 16],
// }

// UNSUPPORTED Rust 440:1: declaration Impl has no candidate rule
// impl Default for AXESLISTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AXESLISTW {
//     pub axlReserved: u32,
//     pub axlNumAxes: u32,
//     pub axlAxisInfo: [AXISINFOW; 16],
// }

// UNSUPPORTED Rust 452:1: declaration Impl has no candidate rule
// impl Default for AXESLISTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 457:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AXISINFOA {
//     pub axMinValue: i32,
//     pub axMaxValue: i32,
//     pub axAxisName: [u8; 16],
// }

// UNSUPPORTED Rust 464:1: declaration Impl has no candidate rule
// impl Default for AXISINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AXISINFOW {
//     pub axMinValue: i32,
//     pub axMaxValue: i32,
//     pub axAxisName: [u16; 16],
// }

// UNSUPPORTED Rust 476:1: declaration Impl has no candidate rule
// impl Default for AXISINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BACKGROUND_MODE` = UInt;
public const val `BALTIC_CHARSET`: `FONT_CHARSET` = 186u;
public const val `BANDINFO`: UInt = 24u;
public const val `BDR_INNER`: `DRAWEDGE_FLAGS` = 12u;
public const val `BDR_OUTER`: `DRAWEDGE_FLAGS` = 3u;
public const val `BDR_RAISED`: `DRAWEDGE_FLAGS` = 5u;
public const val `BDR_RAISEDINNER`: `DRAWEDGE_FLAGS` = 4u;
public const val `BDR_RAISEDOUTER`: `DRAWEDGE_FLAGS` = 1u;
public const val `BDR_SUNKEN`: `DRAWEDGE_FLAGS` = 10u;
public const val `BDR_SUNKENINNER`: `DRAWEDGE_FLAGS` = 8u;
public const val `BDR_SUNKENOUTER`: `DRAWEDGE_FLAGS` = 2u;
public const val `BEGIN_PATH`: UInt = 4096u;
public const val `BF_ADJUST`: `DRAW_EDGE_FLAGS` = 8192u;
public const val `BF_BOTTOM`: `DRAW_EDGE_FLAGS` = 8u;
public const val `BF_BOTTOMLEFT`: `DRAW_EDGE_FLAGS` = 9u;
public const val `BF_BOTTOMRIGHT`: `DRAW_EDGE_FLAGS` = 12u;
public const val `BF_DIAGONAL`: `DRAW_EDGE_FLAGS` = 16u;
public const val `BF_DIAGONAL_ENDBOTTOMLEFT`: `DRAW_EDGE_FLAGS` = 25u;
public const val `BF_DIAGONAL_ENDBOTTOMRIGHT`: `DRAW_EDGE_FLAGS` = 28u;
public const val `BF_DIAGONAL_ENDTOPLEFT`: `DRAW_EDGE_FLAGS` = 19u;
public const val `BF_DIAGONAL_ENDTOPRIGHT`: `DRAW_EDGE_FLAGS` = 22u;
public const val `BF_FLAT`: `DRAW_EDGE_FLAGS` = 16384u;
public const val `BF_LEFT`: `DRAW_EDGE_FLAGS` = 1u;
public const val `BF_MIDDLE`: `DRAW_EDGE_FLAGS` = 2048u;
public const val `BF_MONO`: `DRAW_EDGE_FLAGS` = 32768u;
public const val `BF_RECT`: `DRAW_EDGE_FLAGS` = 15u;
public const val `BF_RIGHT`: `DRAW_EDGE_FLAGS` = 4u;
public const val `BF_SOFT`: `DRAW_EDGE_FLAGS` = 4096u;
public const val `BF_TOP`: `DRAW_EDGE_FLAGS` = 2u;
public const val `BF_TOPLEFT`: `DRAW_EDGE_FLAGS` = 3u;
public const val `BF_TOPRIGHT`: `DRAW_EDGE_FLAGS` = 6u;
// UNSUPPORTED Rust 512:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BITMAP {
//     pub bmType: i32,
//     pub bmWidth: i32,
//     pub bmHeight: i32,
//     pub bmWidthBytes: i32,
//     pub bmPlanes: u16,
//     pub bmBitsPixel: u16,
//     pub bmBits: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 523:1: declaration Impl has no candidate rule
// impl Default for BITMAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 528:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BITMAPCOREHEADER {
//     pub bcSize: u32,
//     pub bcWidth: u16,
//     pub bcHeight: u16,
//     pub bcPlanes: u16,
//     pub bcBitCount: u16,
// }

// UNSUPPORTED Rust 537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BITMAPCOREINFO {
//     pub bmciHeader: BITMAPCOREHEADER,
//     pub bmciColors: [RGBTRIPLE; 1],
// }

// UNSUPPORTED Rust 543:1: declaration Impl has no candidate rule
// impl Default for BITMAPCOREINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 548:1: declaration Struct has no candidate rule
// #[repr(C, packed(2))]
// #[derive(Clone, Copy, Default)]
// pub struct BITMAPFILEHEADER {
//     pub bfType: u16,
//     pub bfSize: u32,
//     pub bfReserved1: u16,
//     pub bfReserved2: u16,
//     pub bfOffBits: u32,
// }

// UNSUPPORTED Rust 557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BITMAPINFO {
//     pub bmiHeader: BITMAPINFOHEADER,
//     pub bmiColors: [RGBQUAD; 1],
// }

// UNSUPPORTED Rust 563:1: declaration Impl has no candidate rule
// impl Default for BITMAPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 568:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BITMAPINFOHEADER {
//     pub biSize: u32,
//     pub biWidth: i32,
//     pub biHeight: i32,
//     pub biPlanes: u16,
//     pub biBitCount: u16,
//     pub biCompression: u32,
//     pub biSizeImage: u32,
//     pub biXPelsPerMeter: i32,
//     pub biYPelsPerMeter: i32,
//     pub biClrUsed: u32,
//     pub biClrImportant: u32,
// }

// UNSUPPORTED Rust 583:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BITMAPV4HEADER {
//     pub bV4Size: u32,
//     pub bV4Width: i32,
//     pub bV4Height: i32,
//     pub bV4Planes: u16,
//     pub bV4BitCount: u16,
//     pub bV4V4Compression: BI_COMPRESSION,
//     pub bV4SizeImage: u32,
//     pub bV4XPelsPerMeter: i32,
//     pub bV4YPelsPerMeter: i32,
//     pub bV4ClrUsed: u32,
//     pub bV4ClrImportant: u32,
//     pub bV4RedMask: u32,
//     pub bV4GreenMask: u32,
//     pub bV4BlueMask: u32,
//     pub bV4AlphaMask: u32,
//     pub bV4CSType: u32,
//     pub bV4Endpoints: CIEXYZTRIPLE,
//     pub bV4GammaRed: u32,
//     pub bV4GammaGreen: u32,
//     pub bV4GammaBlue: u32,
// }

// UNSUPPORTED Rust 607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BITMAPV5HEADER {
//     pub bV5Size: u32,
//     pub bV5Width: i32,
//     pub bV5Height: i32,
//     pub bV5Planes: u16,
//     pub bV5BitCount: u16,
//     pub bV5Compression: BI_COMPRESSION,
//     pub bV5SizeImage: u32,
//     pub bV5XPelsPerMeter: i32,
//     pub bV5YPelsPerMeter: i32,
//     pub bV5ClrUsed: u32,
//     pub bV5ClrImportant: u32,
//     pub bV5RedMask: u32,
//     pub bV5GreenMask: u32,
//     pub bV5BlueMask: u32,
//     pub bV5AlphaMask: u32,
//     pub bV5CSType: u32,
//     pub bV5Endpoints: CIEXYZTRIPLE,
//     pub bV5GammaRed: u32,
//     pub bV5GammaGreen: u32,
//     pub bV5GammaBlue: u32,
//     pub bV5Intent: u32,
//     pub bV5ProfileData: u32,
//     pub bV5ProfileSize: u32,
//     pub bV5Reserved: u32,
// }

public const val `BITSPIXEL`: `GET_DEVICE_CAPS_INDEX` = 12u;
public const val `BI_BITFIELDS`: `BI_COMPRESSION` = 3u;
public typealias `BI_COMPRESSION` = UInt;
public const val `BI_JPEG`: `BI_COMPRESSION` = 4u;
public const val `BI_PNG`: `BI_COMPRESSION` = 5u;
public const val `BI_RGB`: `BI_COMPRESSION` = 0u;
public const val `BI_RLE4`: `BI_COMPRESSION` = 2u;
public const val `BI_RLE8`: `BI_COMPRESSION` = 1u;
public const val `BKMODE_LAST`: UInt = 2u;
public const val `BLACKNESS`: `ROP_CODE` = 66u;
public const val `BLACKONWHITE`: `STRETCH_BLT_MODE` = 1;
public const val `BLACK_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 4;
public const val `BLACK_PEN`: `GET_STOCK_OBJECT_FLAGS` = 7;
// UNSUPPORTED Rust 648:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BLENDFUNCTION {
//     pub BlendOp: u8,
//     pub BlendFlags: u8,
//     pub SourceConstantAlpha: u8,
//     pub AlphaFormat: u8,
// }

public const val `BLTALIGNMENT`: `GET_DEVICE_CAPS_INDEX` = 119u;
public typealias `BRUSH_STYLE` = UInt;
public const val `BS_DIBPATTERN`: `BRUSH_STYLE` = 5u;
public const val `BS_DIBPATTERN8X8`: `BRUSH_STYLE` = 8u;
public const val `BS_DIBPATTERNPT`: `BRUSH_STYLE` = 6u;
public const val `BS_HATCHED`: `BRUSH_STYLE` = 2u;
public const val `BS_HOLLOW`: `BRUSH_STYLE` = 1u;
public const val `BS_INDEXED`: `BRUSH_STYLE` = 4u;
public const val `BS_MONOPATTERN`: `BRUSH_STYLE` = 9u;
public const val `BS_NULL`: `BRUSH_STYLE` = 1u;
public const val `BS_PATTERN`: `BRUSH_STYLE` = 3u;
public const val `BS_PATTERN8X8`: `BRUSH_STYLE` = 7u;
public const val `BS_SOLID`: `BRUSH_STYLE` = 0u;
public const val `CAPTUREBLT`: `ROP_CODE` = 1073741824u;
public const val `CA_LOG_FILTER`: UInt = 2u;
public const val `CA_NEGATIVE`: UInt = 1u;
public const val `CBM_INIT`: Int = 4;
public const val `CCHFORMNAME`: UInt = 32u;
public const val `CC_CHORD`: UInt = 4u;
public const val `CC_CIRCLES`: UInt = 1u;
public const val `CC_ELLIPSES`: UInt = 8u;
public const val `CC_INTERIORS`: UInt = 128u;
public const val `CC_NONE`: UInt = 0u;
public const val `CC_PIE`: UInt = 2u;
public const val `CC_ROUNDRECT`: UInt = 256u;
public const val `CC_STYLED`: UInt = 32u;
public const val `CC_WIDE`: UInt = 16u;
public const val `CC_WIDESTYLED`: UInt = 64u;
public const val `CDS_DISABLE_UNSAFE_MODES`: `CDS_TYPE` = 512u;
public const val `CDS_ENABLE_UNSAFE_MODES`: `CDS_TYPE` = 256u;
public const val `CDS_FULLSCREEN`: `CDS_TYPE` = 4u;
public const val `CDS_GLOBAL`: `CDS_TYPE` = 8u;
public const val `CDS_NORESET`: `CDS_TYPE` = 268435456u;
public const val `CDS_RESET`: `CDS_TYPE` = 1073741824u;
public const val `CDS_RESET_EX`: `CDS_TYPE` = 536870912u;
public const val `CDS_SET_PRIMARY`: `CDS_TYPE` = 16u;
public const val `CDS_TEST`: `CDS_TYPE` = 2u;
public typealias `CDS_TYPE` = UInt;
public const val `CDS_UPDATEREGISTRY`: `CDS_TYPE` = 1u;
public const val `CDS_VIDEOPARAMETERS`: `CDS_TYPE` = 32u;
// UNSUPPORTED Rust 696:1: generic scalar type unsupported
// pub type CFP_ALLOCPROC = Option<unsafe extern "system" fn(param0: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 697:1: generic scalar type unsupported
// pub type CFP_FREEPROC = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 698:1: generic scalar type unsupported
// pub type CFP_REALLOCPROC = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: usize) -> *mut core::ffi::c_void>;

public const val `CHARSET_DEFAULT`: UInt = 1u;
public const val `CHARSET_GLYPHIDX`: UInt = 3u;
public const val `CHARSET_SYMBOL`: `EMBED_FONT_CHARSET` = 2u;
public const val `CHARSET_UNICODE`: `EMBED_FONT_CHARSET` = 1u;
public const val `CHECKJPEGFORMAT`: UInt = 4119u;
public const val `CHECKPNGFORMAT`: UInt = 4120u;
public const val `CHINESEBIG5_CHARSET`: `FONT_CHARSET` = 136u;
// UNSUPPORTED Rust 706:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CIEXYZ {
//     pub ciexyzX: i32,
//     pub ciexyzY: i32,
//     pub ciexyzZ: i32,
// }

// UNSUPPORTED Rust 713:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CIEXYZTRIPLE {
//     pub ciexyzRed: CIEXYZ,
//     pub ciexyzGreen: CIEXYZ,
//     pub ciexyzBlue: CIEXYZ,
// }

public const val `CLEARTYPE_NATURAL_QUALITY`: UInt = 6u;
public const val `CLEARTYPE_QUALITY`: `FONT_QUALITY` = 5u;
public const val `CLIPCAPS`: `GET_DEVICE_CAPS_INDEX` = 36u;
public const val `CLIP_CHARACTER_PRECIS`: `FONT_CLIP_PRECISION` = 1u;
public const val `CLIP_DEFAULT_PRECIS`: `FONT_CLIP_PRECISION` = 0u;
public const val `CLIP_DFA_DISABLE`: `FONT_CLIP_PRECISION` = 64u;
public const val `CLIP_DFA_OVERRIDE`: `FONT_CLIP_PRECISION` = 64u;
public const val `CLIP_EMBEDDED`: `FONT_CLIP_PRECISION` = 128u;
public const val `CLIP_LH_ANGLES`: `FONT_CLIP_PRECISION` = 16u;
public const val `CLIP_MASK`: `FONT_CLIP_PRECISION` = 15u;
public const val `CLIP_STROKE_PRECIS`: `FONT_CLIP_PRECISION` = 2u;
public const val `CLIP_TO_PATH`: UInt = 4097u;
public const val `CLIP_TT_ALWAYS`: `FONT_CLIP_PRECISION` = 32u;
public const val `CLOSECHANNEL`: UInt = 4112u;
public const val `CLR_INVALID`: UInt = 4294967295u;
public const val `CM_CMYK_COLOR`: UInt = 4u;
public const val `CM_DEVICE_ICM`: UInt = 1u;
public const val `CM_GAMMA_RAMP`: UInt = 2u;
public const val `CM_IN_GAMUT`: UInt = 0u;
public const val `CM_NONE`: UInt = 0u;
public const val `CM_OUT_OF_GAMUT`: UInt = 255u;
// UNSUPPORTED Rust 741:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COLORADJUSTMENT {
//     pub caSize: u16,
//     pub caFlags: u16,
//     pub caIlluminantIndex: u16,
//     pub caRedGamma: u16,
//     pub caGreenGamma: u16,
//     pub caBlueGamma: u16,
//     pub caReferenceBlack: u16,
//     pub caReferenceWhite: u16,
//     pub caContrast: i16,
//     pub caBrightness: i16,
//     pub caColorfulness: i16,
//     pub caRedGreenTint: i16,
// }

public const val `COLORMATCHTOTARGET_EMBEDED`: UInt = 1u;
public const val `COLORMGMTCAPS`: `GET_DEVICE_CAPS_INDEX` = 121u;
public const val `COLORONCOLOR`: `STRETCH_BLT_MODE` = 3;
public const val `COLORRES`: `GET_DEVICE_CAPS_INDEX` = 108u;
public const val `COLOR_3DDKSHADOW`: `SYS_COLOR_INDEX` = 21;
public const val `COLOR_3DFACE`: `SYS_COLOR_INDEX` = 15;
public const val `COLOR_3DHIGHLIGHT`: `SYS_COLOR_INDEX` = 20;
public const val `COLOR_3DHILIGHT`: `SYS_COLOR_INDEX` = 20;
public const val `COLOR_3DLIGHT`: `SYS_COLOR_INDEX` = 22;
public const val `COLOR_3DSHADOW`: `SYS_COLOR_INDEX` = 16;
public const val `COLOR_ACTIVEBORDER`: `SYS_COLOR_INDEX` = 10;
public const val `COLOR_ACTIVECAPTION`: `SYS_COLOR_INDEX` = 2;
public const val `COLOR_APPWORKSPACE`: `SYS_COLOR_INDEX` = 12;
public const val `COLOR_BACKGROUND`: `SYS_COLOR_INDEX` = 1;
public const val `COLOR_BTNFACE`: `SYS_COLOR_INDEX` = 15;
public const val `COLOR_BTNHIGHLIGHT`: `SYS_COLOR_INDEX` = 20;
public const val `COLOR_BTNHILIGHT`: `SYS_COLOR_INDEX` = 20;
public const val `COLOR_BTNSHADOW`: `SYS_COLOR_INDEX` = 16;
public const val `COLOR_BTNTEXT`: `SYS_COLOR_INDEX` = 18;
public const val `COLOR_CAPTIONTEXT`: `SYS_COLOR_INDEX` = 9;
public const val `COLOR_DESKTOP`: `SYS_COLOR_INDEX` = 1;
public const val `COLOR_GRADIENTACTIVECAPTION`: `SYS_COLOR_INDEX` = 27;
public const val `COLOR_GRADIENTINACTIVECAPTION`: `SYS_COLOR_INDEX` = 28;
public const val `COLOR_GRAYTEXT`: `SYS_COLOR_INDEX` = 17;
public const val `COLOR_HIGHLIGHT`: `SYS_COLOR_INDEX` = 13;
public const val `COLOR_HIGHLIGHTTEXT`: `SYS_COLOR_INDEX` = 14;
public const val `COLOR_HOTLIGHT`: `SYS_COLOR_INDEX` = 26;
public const val `COLOR_INACTIVEBORDER`: `SYS_COLOR_INDEX` = 11;
public const val `COLOR_INACTIVECAPTION`: `SYS_COLOR_INDEX` = 3;
public const val `COLOR_INACTIVECAPTIONTEXT`: `SYS_COLOR_INDEX` = 19;
public const val `COLOR_INFOBK`: `SYS_COLOR_INDEX` = 24;
public const val `COLOR_INFOTEXT`: `SYS_COLOR_INDEX` = 23;
public const val `COLOR_MENU`: `SYS_COLOR_INDEX` = 4;
public const val `COLOR_MENUBAR`: `SYS_COLOR_INDEX` = 30;
public const val `COLOR_MENUHILIGHT`: `SYS_COLOR_INDEX` = 29;
public const val `COLOR_MENUTEXT`: `SYS_COLOR_INDEX` = 7;
public const val `COLOR_SCROLLBAR`: `SYS_COLOR_INDEX` = 0;
public const val `COLOR_WINDOW`: `SYS_COLOR_INDEX` = 5;
public const val `COLOR_WINDOWFRAME`: `SYS_COLOR_INDEX` = 6;
public const val `COLOR_WINDOWTEXT`: `SYS_COLOR_INDEX` = 8;
public const val `COMPLEXREGION`: `GDI_REGION_TYPE` = 3;
public const val `CP_NONE`: UInt = 0u;
public const val `CP_RECTANGLE`: UInt = 1u;
public const val `CP_REGION`: UInt = 2u;
public const val `CREATECOLORSPACE_EMBEDED`: UInt = 1u;
public typealias `CREATE_FONT_PACKAGE_SUBSET_ENCODING` = Short;
public typealias `CREATE_FONT_PACKAGE_SUBSET_PLATFORM` = Short;
public typealias `CREATE_POLYGON_RGN_MODE` = Int;
public const val `CURVECAPS`: `GET_DEVICE_CAPS_INDEX` = 28u;
public const val `DCBA_FACEDOWNCENTER`: UInt = 257u;
public const val `DCBA_FACEDOWNLEFT`: UInt = 258u;
public const val `DCBA_FACEDOWNNONE`: UInt = 256u;
public const val `DCBA_FACEDOWNRIGHT`: UInt = 259u;
public const val `DCBA_FACEUPCENTER`: UInt = 1u;
public const val `DCBA_FACEUPLEFT`: UInt = 2u;
public const val `DCBA_FACEUPNONE`: UInt = 0u;
public const val `DCBA_FACEUPRIGHT`: UInt = 3u;
public const val `DCB_ACCUMULATE`: `SET_BOUNDS_RECT_FLAGS` = 2u;
public const val `DCB_DISABLE`: `SET_BOUNDS_RECT_FLAGS` = 8u;
public const val `DCB_ENABLE`: `SET_BOUNDS_RECT_FLAGS` = 4u;
public const val `DCB_RESET`: `SET_BOUNDS_RECT_FLAGS` = 1u;
public const val `DCTT_BITMAP`: Int = 1;
public const val `DCTT_DOWNLOAD`: Int = 2;
public const val `DCTT_DOWNLOAD_OUTLINE`: Int = 8;
public const val `DCTT_SUBDEV`: Int = 4;
public const val `DCX_CACHE`: `GET_DCX_FLAGS` = 2u;
public const val `DCX_CLIPCHILDREN`: `GET_DCX_FLAGS` = 8u;
public const val `DCX_CLIPSIBLINGS`: `GET_DCX_FLAGS` = 16u;
public const val `DCX_EXCLUDERGN`: `GET_DCX_FLAGS` = 64u;
public const val `DCX_INTERSECTRGN`: `GET_DCX_FLAGS` = 128u;
public const val `DCX_INTERSECTUPDATE`: `GET_DCX_FLAGS` = 512u;
public const val `DCX_LOCKWINDOWUPDATE`: `GET_DCX_FLAGS` = 1024u;
public const val `DCX_NORESETATTRS`: `GET_DCX_FLAGS` = 4u;
public const val `DCX_PARENTCLIP`: `GET_DCX_FLAGS` = 32u;
public const val `DCX_VALIDATE`: `GET_DCX_FLAGS` = 2097152u;
public const val `DCX_WINDOW`: `GET_DCX_FLAGS` = 1u;
public const val `DC_ACTIVE`: `DRAW_CAPTION_FLAGS` = 1u;
public const val `DC_BINADJUST`: UInt = 19u;
public const val `DC_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 18;
public const val `DC_BUTTONS`: `DRAW_CAPTION_FLAGS` = 4096u;
public const val `DC_DATATYPE_PRODUCED`: UInt = 21u;
public const val `DC_EMF_COMPLIANT`: UInt = 20u;
public const val `DC_GRADIENT`: `DRAW_CAPTION_FLAGS` = 32u;
public const val `DC_ICON`: `DRAW_CAPTION_FLAGS` = 4u;
public const val `DC_INBUTTON`: `DRAW_CAPTION_FLAGS` = 16u;
public typealias `DC_LAYOUT` = UInt;
public const val `DC_MANUFACTURER`: UInt = 23u;
public const val `DC_MODEL`: UInt = 24u;
public const val `DC_PEN`: `GET_STOCK_OBJECT_FLAGS` = 19;
public const val `DC_SMALLCAP`: `DRAW_CAPTION_FLAGS` = 2u;
public const val `DC_TEXT`: `DRAW_CAPTION_FLAGS` = 8u;
public const val `DEFAULT_CHARSET`: `FONT_CHARSET` = 1u;
public const val `DEFAULT_GUI_FONT`: `GET_STOCK_OBJECT_FLAGS` = 17;
public const val `DEFAULT_PALETTE`: `GET_STOCK_OBJECT_FLAGS` = 15;
public const val `DEFAULT_PITCH`: `FONT_PITCH` = 0u;
public const val `DEFAULT_QUALITY`: `FONT_QUALITY` = 0u;
// UNSUPPORTED Rust 853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DESIGNVECTOR {
//     pub dvReserved: u32,
//     pub dvNumAxes: u32,
//     pub dvValues: [i32; 16],
// }

// UNSUPPORTED Rust 860:1: declaration Impl has no candidate rule
// impl Default for DESIGNVECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DESKTOPHORZRES`: `GET_DEVICE_CAPS_INDEX` = 118u;
public const val `DESKTOPVERTRES`: `GET_DEVICE_CAPS_INDEX` = 117u;
public const val `DEVICEDATA`: UInt = 19u;
public const val `DEVICE_DEFAULT_FONT`: `GET_STOCK_OBJECT_FLAGS` = 14;
public const val `DEVICE_FONTTYPE`: UInt = 2u;
// UNSUPPORTED Rust 870:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEVMODEA {
//     pub dmDeviceName: [u8; 32],
//     pub dmSpecVersion: u16,
//     pub dmDriverVersion: u16,
//     pub dmSize: u16,
//     pub dmDriverExtra: u16,
//     pub dmFields: DEVMODE_FIELD_FLAGS,
//     pub Anonymous1: DEVMODEA_0,
//     pub dmColor: DEVMODE_COLOR,
//     pub dmDuplex: DEVMODE_DUPLEX,
//     pub dmYResolution: i16,
//     pub dmTTOption: DEVMODE_TRUETYPE_OPTION,
//     pub dmCollate: DEVMODE_COLLATE,
//     pub dmFormName: [u8; 32],
//     pub dmLogPixels: u16,
//     pub dmBitsPerPel: u32,
//     pub dmPelsWidth: u32,
//     pub dmPelsHeight: u32,
//     pub Anonymous2: DEVMODEA_1,
//     pub dmDisplayFrequency: u32,
//     pub dmICMMethod: u32,
//     pub dmICMIntent: u32,
//     pub dmMediaType: u32,
//     pub dmDitherType: u32,
//     pub dmReserved1: u32,
//     pub dmReserved2: u32,
//     pub dmPanningWidth: u32,
//     pub dmPanningHeight: u32,
// }

// UNSUPPORTED Rust 901:1: declaration Impl has no candidate rule
// impl Default for DEVMODEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 906:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEA_0 {
//     pub Anonymous1: DEVMODEA_0_0,
//     pub Anonymous2: DEVMODEA_0_1,
// }

// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule
// impl Default for DEVMODEA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 917:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEVMODEA_0_0 {
//     pub dmOrientation: i16,
//     pub dmPaperSize: i16,
//     pub dmPaperLength: i16,
//     pub dmPaperWidth: i16,
//     pub dmScale: i16,
//     pub dmCopies: i16,
//     pub dmDefaultSource: i16,
//     pub dmPrintQuality: i16,
// }

// UNSUPPORTED Rust 929:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEVMODEA_0_1 {
//     pub dmPosition: super::super::Foundation::POINTL,
//     pub dmDisplayOrientation: DEVMODE_DISPLAY_ORIENTATION,
//     pub dmDisplayFixedOutput: DEVMODE_DISPLAY_FIXED_OUTPUT,
// }

// UNSUPPORTED Rust 936:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEA_1 {
//     pub dmDisplayFlags: u32,
//     pub dmNup: u32,
// }

// UNSUPPORTED Rust 942:1: declaration Impl has no candidate rule
// impl Default for DEVMODEA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 947:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEVMODEW {
//     pub dmDeviceName: [u16; 32],
//     pub dmSpecVersion: u16,
//     pub dmDriverVersion: u16,
//     pub dmSize: u16,
//     pub dmDriverExtra: u16,
//     pub dmFields: DEVMODE_FIELD_FLAGS,
//     pub Anonymous1: DEVMODEW_0,
//     pub dmColor: DEVMODE_COLOR,
//     pub dmDuplex: DEVMODE_DUPLEX,
//     pub dmYResolution: i16,
//     pub dmTTOption: DEVMODE_TRUETYPE_OPTION,
//     pub dmCollate: DEVMODE_COLLATE,
//     pub dmFormName: [u16; 32],
//     pub dmLogPixels: u16,
//     pub dmBitsPerPel: u32,
//     pub dmPelsWidth: u32,
//     pub dmPelsHeight: u32,
//     pub Anonymous2: DEVMODEW_1,
//     pub dmDisplayFrequency: u32,
//     pub dmICMMethod: u32,
//     pub dmICMIntent: u32,
//     pub dmMediaType: u32,
//     pub dmDitherType: u32,
//     pub dmReserved1: u32,
//     pub dmReserved2: u32,
//     pub dmPanningWidth: u32,
//     pub dmPanningHeight: u32,
// }

// UNSUPPORTED Rust 978:1: declaration Impl has no candidate rule
// impl Default for DEVMODEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 983:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEW_0 {
//     pub Anonymous1: DEVMODEW_0_0,
//     pub Anonymous2: DEVMODEW_0_1,
// }

// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule
// impl Default for DEVMODEW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 994:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEVMODEW_0_0 {
//     pub dmOrientation: i16,
//     pub dmPaperSize: i16,
//     pub dmPaperLength: i16,
//     pub dmPaperWidth: i16,
//     pub dmScale: i16,
//     pub dmCopies: i16,
//     pub dmDefaultSource: i16,
//     pub dmPrintQuality: i16,
// }

// UNSUPPORTED Rust 1006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEVMODEW_0_1 {
//     pub dmPosition: super::super::Foundation::POINTL,
//     pub dmDisplayOrientation: DEVMODE_DISPLAY_ORIENTATION,
//     pub dmDisplayFixedOutput: DEVMODE_DISPLAY_FIXED_OUTPUT,
// }

// UNSUPPORTED Rust 1013:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVMODEW_1 {
//     pub dmDisplayFlags: u32,
//     pub dmNup: u32,
// }

// UNSUPPORTED Rust 1019:1: declaration Impl has no candidate rule
// impl Default for DEVMODEW_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEVMODE_COLLATE` = Short;
public typealias `DEVMODE_COLOR` = Short;
public typealias `DEVMODE_DISPLAY_FIXED_OUTPUT` = UInt;
public typealias `DEVMODE_DISPLAY_ORIENTATION` = UInt;
public typealias `DEVMODE_DUPLEX` = Short;
public typealias `DEVMODE_FIELD_FLAGS` = UInt;
public typealias `DEVMODE_TRUETYPE_OPTION` = Short;
public const val `DFCS_ADJUSTRECT`: `DFCS_STATE` = 8192u;
public const val `DFCS_BUTTON3STATE`: `DFCS_STATE` = 8u;
public const val `DFCS_BUTTONCHECK`: `DFCS_STATE` = 0u;
public const val `DFCS_BUTTONPUSH`: `DFCS_STATE` = 16u;
public const val `DFCS_BUTTONRADIO`: `DFCS_STATE` = 4u;
public const val `DFCS_BUTTONRADIOIMAGE`: `DFCS_STATE` = 1u;
public const val `DFCS_BUTTONRADIOMASK`: `DFCS_STATE` = 2u;
public const val `DFCS_CAPTIONCLOSE`: `DFCS_STATE` = 0u;
public const val `DFCS_CAPTIONHELP`: `DFCS_STATE` = 4u;
public const val `DFCS_CAPTIONMAX`: `DFCS_STATE` = 2u;
public const val `DFCS_CAPTIONMIN`: `DFCS_STATE` = 1u;
public const val `DFCS_CAPTIONRESTORE`: `DFCS_STATE` = 3u;
public const val `DFCS_CHECKED`: `DFCS_STATE` = 1024u;
public const val `DFCS_FLAT`: `DFCS_STATE` = 16384u;
public const val `DFCS_HOT`: `DFCS_STATE` = 4096u;
public const val `DFCS_INACTIVE`: `DFCS_STATE` = 256u;
public const val `DFCS_MENUARROW`: `DFCS_STATE` = 0u;
public const val `DFCS_MENUARROWRIGHT`: `DFCS_STATE` = 4u;
public const val `DFCS_MENUBULLET`: `DFCS_STATE` = 2u;
public const val `DFCS_MENUCHECK`: `DFCS_STATE` = 1u;
public const val `DFCS_MONO`: `DFCS_STATE` = 32768u;
public const val `DFCS_PUSHED`: `DFCS_STATE` = 512u;
public const val `DFCS_SCROLLCOMBOBOX`: `DFCS_STATE` = 5u;
public const val `DFCS_SCROLLDOWN`: `DFCS_STATE` = 1u;
public const val `DFCS_SCROLLLEFT`: `DFCS_STATE` = 2u;
public const val `DFCS_SCROLLRIGHT`: `DFCS_STATE` = 3u;
public const val `DFCS_SCROLLSIZEGRIP`: `DFCS_STATE` = 8u;
public const val `DFCS_SCROLLSIZEGRIPRIGHT`: `DFCS_STATE` = 16u;
public const val `DFCS_SCROLLUP`: `DFCS_STATE` = 0u;
public typealias `DFCS_STATE` = UInt;
public const val `DFCS_TRANSPARENT`: `DFCS_STATE` = 2048u;
public const val `DFC_BUTTON`: `DFC_TYPE` = 4u;
public const val `DFC_CAPTION`: `DFC_TYPE` = 1u;
public const val `DFC_MENU`: `DFC_TYPE` = 2u;
public const val `DFC_POPUPMENU`: `DFC_TYPE` = 5u;
public const val `DFC_SCROLL`: `DFC_TYPE` = 3u;
public typealias `DFC_TYPE` = UInt;
// UNSUPPORTED Rust 1068:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIBSECTION {
//     pub dsBm: BITMAP,
//     pub dsBmih: BITMAPINFOHEADER,
//     pub dsBitfields: [u32; 3],
//     pub dshSection: super::super::Foundation::HANDLE,
//     pub dsOffset: u32,
// }

// UNSUPPORTED Rust 1077:1: declaration Impl has no candidate rule
// impl Default for DIBSECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIB_PAL_COLORS`: `DIB_USAGE` = 1u;
public const val `DIB_RGB_COLORS`: `DIB_USAGE` = 0u;
public typealias `DIB_USAGE` = UInt;
public typealias `DISPLAYCONFIG_COLOR_ENCODING` = Int;
public const val `DISPLAYCONFIG_COLOR_ENCODING_INTENSITY`: `DISPLAYCONFIG_COLOR_ENCODING` = 4;
public const val `DISPLAYCONFIG_COLOR_ENCODING_RGB`: `DISPLAYCONFIG_COLOR_ENCODING` = 0;
public const val `DISPLAYCONFIG_COLOR_ENCODING_YCBCR420`: `DISPLAYCONFIG_COLOR_ENCODING` = 3;
public const val `DISPLAYCONFIG_COLOR_ENCODING_YCBCR422`: `DISPLAYCONFIG_COLOR_ENCODING` = 2;
public const val `DISPLAYCONFIG_COLOR_ENCODING_YCBCR444`: `DISPLAYCONFIG_COLOR_ENCODING` = 1;
public const val `DISPLAYCONFIG_MAXPATH`: UInt = 1024u;
public const val `DISPLAYCONFIG_PATH_ACTIVE`: UInt = 1u;
public const val `DISPLAYCONFIG_PATH_CLONE_GROUP_INVALID`: UInt = 65535u;
public const val `DISPLAYCONFIG_PATH_DESKTOP_IMAGE_IDX_INVALID`: UInt = 65535u;
public const val `DISPLAYCONFIG_PATH_MODE_IDX_INVALID`: UInt = 4294967295u;
public const val `DISPLAYCONFIG_PATH_PREFERRED_UNSCALED`: UInt = 4u;
public const val `DISPLAYCONFIG_PATH_SOURCE_MODE_IDX_INVALID`: UInt = 65535u;
public const val `DISPLAYCONFIG_PATH_SUPPORT_VIRTUAL_MODE`: UInt = 8u;
public const val `DISPLAYCONFIG_PATH_TARGET_MODE_IDX_INVALID`: UInt = 65535u;
public const val `DISPLAYCONFIG_PATH_VALID_FLAGS`: UInt = 29u;
public const val `DISPLAYCONFIG_SOURCE_IN_USE`: UInt = 1u;
public const val `DISPLAYCONFIG_TARGET_FORCED_AVAILABILITY_BOOT`: UInt = 4u;
public const val `DISPLAYCONFIG_TARGET_FORCED_AVAILABILITY_PATH`: UInt = 8u;
public const val `DISPLAYCONFIG_TARGET_FORCED_AVAILABILITY_SYSTEM`: UInt = 16u;
public const val `DISPLAYCONFIG_TARGET_FORCIBLE`: UInt = 2u;
public const val `DISPLAYCONFIG_TARGET_IN_USE`: UInt = 1u;
public const val `DISPLAYCONFIG_TARGET_IS_HMD`: UInt = 32u;
// UNSUPPORTED Rust 1108:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAY_DEVICEA {
//     pub cb: u32,
//     pub DeviceName: [i8; 32],
//     pub DeviceString: [i8; 128],
//     pub StateFlags: DISPLAY_DEVICE_STATE_FLAGS,
//     pub DeviceID: [i8; 128],
//     pub DeviceKey: [i8; 128],
// }

// UNSUPPORTED Rust 1118:1: declaration Impl has no candidate rule
// impl Default for DISPLAY_DEVICEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAY_DEVICEW {
//     pub cb: u32,
//     pub DeviceName: [u16; 32],
//     pub DeviceString: [u16; 128],
//     pub StateFlags: DISPLAY_DEVICE_STATE_FLAGS,
//     pub DeviceID: [u16; 128],
//     pub DeviceKey: [u16; 128],
// }

// UNSUPPORTED Rust 1133:1: declaration Impl has no candidate rule
// impl Default for DISPLAY_DEVICEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DISPLAY_DEVICE_ACC_DRIVER`: `DISPLAY_DEVICE_STATE_FLAGS` = 64u;
public const val `DISPLAY_DEVICE_ACTIVE`: `DISPLAY_DEVICE_STATE_FLAGS` = 1u;
public const val `DISPLAY_DEVICE_ATTACHED`: `DISPLAY_DEVICE_STATE_FLAGS` = 2u;
public const val `DISPLAY_DEVICE_ATTACHED_TO_DESKTOP`: `DISPLAY_DEVICE_STATE_FLAGS` = 1u;
public const val `DISPLAY_DEVICE_DISCONNECT`: `DISPLAY_DEVICE_STATE_FLAGS` = 33554432u;
public const val `DISPLAY_DEVICE_MIRRORING_DRIVER`: `DISPLAY_DEVICE_STATE_FLAGS` = 8u;
public const val `DISPLAY_DEVICE_MODESPRUNED`: `DISPLAY_DEVICE_STATE_FLAGS` = 134217728u;
public const val `DISPLAY_DEVICE_MULTI_DRIVER`: `DISPLAY_DEVICE_STATE_FLAGS` = 2u;
public const val `DISPLAY_DEVICE_PRIMARY_DEVICE`: `DISPLAY_DEVICE_STATE_FLAGS` = 4u;
public const val `DISPLAY_DEVICE_RDPUDD`: `DISPLAY_DEVICE_STATE_FLAGS` = 16777216u;
public const val `DISPLAY_DEVICE_REMOTE`: `DISPLAY_DEVICE_STATE_FLAGS` = 67108864u;
public const val `DISPLAY_DEVICE_REMOVABLE`: `DISPLAY_DEVICE_STATE_FLAGS` = 32u;
public typealias `DISPLAY_DEVICE_STATE_FLAGS` = UInt;
public const val `DISPLAY_DEVICE_TS_COMPATIBLE`: `DISPLAY_DEVICE_STATE_FLAGS` = 2097152u;
public const val `DISPLAY_DEVICE_UNSAFE_MODES_ON`: `DISPLAY_DEVICE_STATE_FLAGS` = 524288u;
public const val `DISPLAY_DEVICE_VGA_COMPATIBLE`: `DISPLAY_DEVICE_STATE_FLAGS` = 16u;
public typealias `DISP_CHANGE` = Int;
public const val `DISP_CHANGE_BADDUALVIEW`: `DISP_CHANGE` = -6;
public const val `DISP_CHANGE_BADFLAGS`: `DISP_CHANGE` = -4;
public const val `DISP_CHANGE_BADMODE`: `DISP_CHANGE` = -2;
public const val `DISP_CHANGE_BADPARAM`: `DISP_CHANGE` = -5;
public const val `DISP_CHANGE_FAILED`: `DISP_CHANGE` = -1;
public const val `DISP_CHANGE_NOTUPDATED`: `DISP_CHANGE` = -3;
public const val `DISP_CHANGE_RESTART`: `DISP_CHANGE` = 1;
public const val `DISP_CHANGE_SUCCESSFUL`: `DISP_CHANGE` = 0;
public const val `DI_APPBANDING`: UInt = 1u;
public const val `DI_ROPS_READ_DESTINATION`: UInt = 2u;
public const val `DKGRAY_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 3;
public const val `DMBIN_AUTO`: UInt = 7u;
public const val `DMBIN_CASSETTE`: UInt = 14u;
public const val `DMBIN_ENVELOPE`: UInt = 5u;
public const val `DMBIN_ENVMANUAL`: UInt = 6u;
public const val `DMBIN_FORMSOURCE`: UInt = 15u;
public const val `DMBIN_LARGECAPACITY`: UInt = 11u;
public const val `DMBIN_LARGEFMT`: UInt = 10u;
public const val `DMBIN_LAST`: UInt = 15u;
public const val `DMBIN_LOWER`: UInt = 2u;
public const val `DMBIN_MANUAL`: UInt = 4u;
public const val `DMBIN_MIDDLE`: UInt = 3u;
public const val `DMBIN_ONLYONE`: UInt = 1u;
public const val `DMBIN_SMALLFMT`: UInt = 9u;
public const val `DMBIN_TRACTOR`: UInt = 8u;
public const val `DMBIN_UPPER`: UInt = 1u;
public const val `DMBIN_USER`: UInt = 256u;
public const val `DMCOLLATE_FALSE`: `DEVMODE_COLLATE` = 0;
public const val `DMCOLLATE_TRUE`: `DEVMODE_COLLATE` = 1;
public const val `DMCOLOR_COLOR`: `DEVMODE_COLOR` = 2;
public const val `DMCOLOR_MONOCHROME`: `DEVMODE_COLOR` = 1;
public const val `DMDFO_CENTER`: `DEVMODE_DISPLAY_FIXED_OUTPUT` = 2u;
public const val `DMDFO_DEFAULT`: `DEVMODE_DISPLAY_FIXED_OUTPUT` = 0u;
public const val `DMDFO_STRETCH`: `DEVMODE_DISPLAY_FIXED_OUTPUT` = 1u;
public const val `DMDISPLAYFLAGS_TEXTMODE`: UInt = 4u;
public const val `DMDITHER_COARSE`: UInt = 2u;
public const val `DMDITHER_ERRORDIFFUSION`: UInt = 5u;
public const val `DMDITHER_FINE`: UInt = 3u;
public const val `DMDITHER_GRAYSCALE`: UInt = 10u;
public const val `DMDITHER_LINEART`: UInt = 4u;
public const val `DMDITHER_NONE`: UInt = 1u;
public const val `DMDITHER_RESERVED6`: UInt = 6u;
public const val `DMDITHER_RESERVED7`: UInt = 7u;
public const val `DMDITHER_RESERVED8`: UInt = 8u;
public const val `DMDITHER_RESERVED9`: UInt = 9u;
public const val `DMDITHER_USER`: UInt = 256u;
public const val `DMDO_180`: `DEVMODE_DISPLAY_ORIENTATION` = 2u;
public const val `DMDO_270`: `DEVMODE_DISPLAY_ORIENTATION` = 3u;
public const val `DMDO_90`: `DEVMODE_DISPLAY_ORIENTATION` = 1u;
public const val `DMDO_DEFAULT`: `DEVMODE_DISPLAY_ORIENTATION` = 0u;
public const val `DMDUP_HORIZONTAL`: `DEVMODE_DUPLEX` = 3;
public const val `DMDUP_SIMPLEX`: `DEVMODE_DUPLEX` = 1;
public const val `DMDUP_VERTICAL`: `DEVMODE_DUPLEX` = 2;
public const val `DMICMMETHOD_DEVICE`: UInt = 4u;
public const val `DMICMMETHOD_DRIVER`: UInt = 3u;
public const val `DMICMMETHOD_NONE`: UInt = 1u;
public const val `DMICMMETHOD_SYSTEM`: UInt = 2u;
public const val `DMICMMETHOD_USER`: UInt = 256u;
public const val `DMICM_ABS_COLORIMETRIC`: UInt = 4u;
public const val `DMICM_COLORIMETRIC`: UInt = 3u;
public const val `DMICM_CONTRAST`: UInt = 2u;
public const val `DMICM_SATURATE`: UInt = 1u;
public const val `DMICM_USER`: UInt = 256u;
public const val `DMMEDIA_GLOSSY`: UInt = 3u;
public const val `DMMEDIA_STANDARD`: UInt = 1u;
public const val `DMMEDIA_TRANSPARENCY`: UInt = 2u;
public const val `DMMEDIA_USER`: UInt = 256u;
public const val `DMNUP_ONEUP`: UInt = 2u;
public const val `DMNUP_SYSTEM`: UInt = 1u;
public const val `DMORIENT_LANDSCAPE`: UInt = 2u;
public const val `DMORIENT_PORTRAIT`: UInt = 1u;
public const val `DMPAPER_10X11`: UInt = 45u;
public const val `DMPAPER_10X14`: UInt = 16u;
public const val `DMPAPER_11X17`: UInt = 17u;
public const val `DMPAPER_12X11`: UInt = 90u;
public const val `DMPAPER_15X11`: UInt = 46u;
public const val `DMPAPER_9X11`: UInt = 44u;
public const val `DMPAPER_A2`: UInt = 66u;
public const val `DMPAPER_A3`: UInt = 8u;
public const val `DMPAPER_A3_EXTRA`: UInt = 63u;
public const val `DMPAPER_A3_EXTRA_TRANSVERSE`: UInt = 68u;
public const val `DMPAPER_A3_ROTATED`: UInt = 76u;
public const val `DMPAPER_A3_TRANSVERSE`: UInt = 67u;
public const val `DMPAPER_A4`: UInt = 9u;
public const val `DMPAPER_A4SMALL`: UInt = 10u;
public const val `DMPAPER_A4_EXTRA`: UInt = 53u;
public const val `DMPAPER_A4_PLUS`: UInt = 60u;
public const val `DMPAPER_A4_ROTATED`: UInt = 77u;
public const val `DMPAPER_A4_TRANSVERSE`: UInt = 55u;
public const val `DMPAPER_A5`: UInt = 11u;
public const val `DMPAPER_A5_EXTRA`: UInt = 64u;
public const val `DMPAPER_A5_ROTATED`: UInt = 78u;
public const val `DMPAPER_A5_TRANSVERSE`: UInt = 61u;
public const val `DMPAPER_A6`: UInt = 70u;
public const val `DMPAPER_A6_ROTATED`: UInt = 83u;
public const val `DMPAPER_A_PLUS`: UInt = 57u;
public const val `DMPAPER_B4`: UInt = 12u;
public const val `DMPAPER_B4_JIS_ROTATED`: UInt = 79u;
public const val `DMPAPER_B5`: UInt = 13u;
public const val `DMPAPER_B5_EXTRA`: UInt = 65u;
public const val `DMPAPER_B5_JIS_ROTATED`: UInt = 80u;
public const val `DMPAPER_B5_TRANSVERSE`: UInt = 62u;
public const val `DMPAPER_B6_JIS`: UInt = 88u;
public const val `DMPAPER_B6_JIS_ROTATED`: UInt = 89u;
public const val `DMPAPER_B_PLUS`: UInt = 58u;
public const val `DMPAPER_CSHEET`: UInt = 24u;
public const val `DMPAPER_DBL_JAPANESE_POSTCARD`: UInt = 69u;
public const val `DMPAPER_DBL_JAPANESE_POSTCARD_ROTATED`: UInt = 82u;
public const val `DMPAPER_DSHEET`: UInt = 25u;
public const val `DMPAPER_ENV_10`: UInt = 20u;
public const val `DMPAPER_ENV_11`: UInt = 21u;
public const val `DMPAPER_ENV_12`: UInt = 22u;
public const val `DMPAPER_ENV_14`: UInt = 23u;
public const val `DMPAPER_ENV_9`: UInt = 19u;
public const val `DMPAPER_ENV_B4`: UInt = 33u;
public const val `DMPAPER_ENV_B5`: UInt = 34u;
public const val `DMPAPER_ENV_B6`: UInt = 35u;
public const val `DMPAPER_ENV_C3`: UInt = 29u;
public const val `DMPAPER_ENV_C4`: UInt = 30u;
public const val `DMPAPER_ENV_C5`: UInt = 28u;
public const val `DMPAPER_ENV_C6`: UInt = 31u;
public const val `DMPAPER_ENV_C65`: UInt = 32u;
public const val `DMPAPER_ENV_DL`: UInt = 27u;
public const val `DMPAPER_ENV_INVITE`: UInt = 47u;
public const val `DMPAPER_ENV_ITALY`: UInt = 36u;
public const val `DMPAPER_ENV_MONARCH`: UInt = 37u;
public const val `DMPAPER_ENV_PERSONAL`: UInt = 38u;
public const val `DMPAPER_ESHEET`: UInt = 26u;
public const val `DMPAPER_EXECUTIVE`: UInt = 7u;
public const val `DMPAPER_FANFOLD_LGL_GERMAN`: UInt = 41u;
public const val `DMPAPER_FANFOLD_STD_GERMAN`: UInt = 40u;
public const val `DMPAPER_FANFOLD_US`: UInt = 39u;
public const val `DMPAPER_FOLIO`: UInt = 14u;
public const val `DMPAPER_ISO_B4`: UInt = 42u;
public const val `DMPAPER_JAPANESE_POSTCARD`: UInt = 43u;
public const val `DMPAPER_JAPANESE_POSTCARD_ROTATED`: UInt = 81u;
public const val `DMPAPER_JENV_CHOU3`: UInt = 73u;
public const val `DMPAPER_JENV_CHOU3_ROTATED`: UInt = 86u;
public const val `DMPAPER_JENV_CHOU4`: UInt = 74u;
public const val `DMPAPER_JENV_CHOU4_ROTATED`: UInt = 87u;
public const val `DMPAPER_JENV_KAKU2`: UInt = 71u;
public const val `DMPAPER_JENV_KAKU2_ROTATED`: UInt = 84u;
public const val `DMPAPER_JENV_KAKU3`: UInt = 72u;
public const val `DMPAPER_JENV_KAKU3_ROTATED`: UInt = 85u;
public const val `DMPAPER_JENV_YOU4`: UInt = 91u;
public const val `DMPAPER_JENV_YOU4_ROTATED`: UInt = 92u;
public const val `DMPAPER_LAST`: UInt = 118u;
public const val `DMPAPER_LEDGER`: UInt = 4u;
public const val `DMPAPER_LEGAL`: UInt = 5u;
public const val `DMPAPER_LEGAL_EXTRA`: UInt = 51u;
public const val `DMPAPER_LETTER`: UInt = 1u;
public const val `DMPAPER_LETTERSMALL`: UInt = 2u;
public const val `DMPAPER_LETTER_EXTRA`: UInt = 50u;
public const val `DMPAPER_LETTER_EXTRA_TRANSVERSE`: UInt = 56u;
public const val `DMPAPER_LETTER_PLUS`: UInt = 59u;
public const val `DMPAPER_LETTER_ROTATED`: UInt = 75u;
public const val `DMPAPER_LETTER_TRANSVERSE`: UInt = 54u;
public const val `DMPAPER_NOTE`: UInt = 18u;
public const val `DMPAPER_P16K`: UInt = 93u;
public const val `DMPAPER_P16K_ROTATED`: UInt = 106u;
public const val `DMPAPER_P32K`: UInt = 94u;
public const val `DMPAPER_P32KBIG`: UInt = 95u;
public const val `DMPAPER_P32KBIG_ROTATED`: UInt = 108u;
public const val `DMPAPER_P32K_ROTATED`: UInt = 107u;
public const val `DMPAPER_PENV_1`: UInt = 96u;
public const val `DMPAPER_PENV_10`: UInt = 105u;
public const val `DMPAPER_PENV_10_ROTATED`: UInt = 118u;
public const val `DMPAPER_PENV_1_ROTATED`: UInt = 109u;
public const val `DMPAPER_PENV_2`: UInt = 97u;
public const val `DMPAPER_PENV_2_ROTATED`: UInt = 110u;
public const val `DMPAPER_PENV_3`: UInt = 98u;
public const val `DMPAPER_PENV_3_ROTATED`: UInt = 111u;
public const val `DMPAPER_PENV_4`: UInt = 99u;
public const val `DMPAPER_PENV_4_ROTATED`: UInt = 112u;
public const val `DMPAPER_PENV_5`: UInt = 100u;
public const val `DMPAPER_PENV_5_ROTATED`: UInt = 113u;
public const val `DMPAPER_PENV_6`: UInt = 101u;
public const val `DMPAPER_PENV_6_ROTATED`: UInt = 114u;
public const val `DMPAPER_PENV_7`: UInt = 102u;
public const val `DMPAPER_PENV_7_ROTATED`: UInt = 115u;
public const val `DMPAPER_PENV_8`: UInt = 103u;
public const val `DMPAPER_PENV_8_ROTATED`: UInt = 116u;
public const val `DMPAPER_PENV_9`: UInt = 104u;
public const val `DMPAPER_PENV_9_ROTATED`: UInt = 117u;
public const val `DMPAPER_QUARTO`: UInt = 15u;
public const val `DMPAPER_RESERVED_48`: UInt = 48u;
public const val `DMPAPER_RESERVED_49`: UInt = 49u;
public const val `DMPAPER_STATEMENT`: UInt = 6u;
public const val `DMPAPER_TABLOID`: UInt = 3u;
public const val `DMPAPER_TABLOID_EXTRA`: UInt = 52u;
public const val `DMPAPER_USER`: UInt = 256u;
public const val `DMRES_DRAFT`: Int = -1;
public const val `DMRES_HIGH`: Int = -4;
public const val `DMRES_LOW`: Int = -2;
public const val `DMRES_MEDIUM`: Int = -3;
public const val `DMTT_BITMAP`: `DEVMODE_TRUETYPE_OPTION` = 1;
public const val `DMTT_DOWNLOAD`: `DEVMODE_TRUETYPE_OPTION` = 2;
public const val `DMTT_DOWNLOAD_OUTLINE`: `DEVMODE_TRUETYPE_OPTION` = 4;
public const val `DMTT_SUBDEV`: `DEVMODE_TRUETYPE_OPTION` = 3;
public const val `DM_BITSPERPEL`: `DEVMODE_FIELD_FLAGS` = 262144u;
public const val `DM_COLLATE`: `DEVMODE_FIELD_FLAGS` = 32768u;
public const val `DM_COLOR`: `DEVMODE_FIELD_FLAGS` = 2048u;
public const val `DM_COPIES`: `DEVMODE_FIELD_FLAGS` = 256u;
public const val `DM_COPY`: `DEVMODE_FIELD_FLAGS` = 2u;
public const val `DM_DEFAULTSOURCE`: `DEVMODE_FIELD_FLAGS` = 512u;
public const val `DM_DISPLAYFIXEDOUTPUT`: `DEVMODE_FIELD_FLAGS` = 536870912u;
public const val `DM_DISPLAYFLAGS`: `DEVMODE_FIELD_FLAGS` = 2097152u;
public const val `DM_DISPLAYFREQUENCY`: `DEVMODE_FIELD_FLAGS` = 4194304u;
public const val `DM_DISPLAYORIENTATION`: `DEVMODE_FIELD_FLAGS` = 128u;
public const val `DM_DITHERTYPE`: `DEVMODE_FIELD_FLAGS` = 67108864u;
public const val `DM_DUPLEX`: `DEVMODE_FIELD_FLAGS` = 4096u;
public const val `DM_FORMNAME`: `DEVMODE_FIELD_FLAGS` = 65536u;
public const val `DM_ICMINTENT`: `DEVMODE_FIELD_FLAGS` = 16777216u;
public const val `DM_ICMMETHOD`: `DEVMODE_FIELD_FLAGS` = 8388608u;
public const val `DM_INTERLACED`: `DEVMODE_FIELD_FLAGS` = 2u;
public const val `DM_IN_BUFFER`: `DEVMODE_FIELD_FLAGS` = 8u;
public const val `DM_IN_PROMPT`: `DEVMODE_FIELD_FLAGS` = 4u;
public const val `DM_LOGPIXELS`: `DEVMODE_FIELD_FLAGS` = 131072u;
public const val `DM_MEDIATYPE`: `DEVMODE_FIELD_FLAGS` = 33554432u;
public const val `DM_MODIFY`: `DEVMODE_FIELD_FLAGS` = 8u;
public const val `DM_NUP`: `DEVMODE_FIELD_FLAGS` = 64u;
public const val `DM_ORIENTATION`: `DEVMODE_FIELD_FLAGS` = 1u;
public const val `DM_OUT_BUFFER`: `DEVMODE_FIELD_FLAGS` = 2u;
public const val `DM_OUT_DEFAULT`: `DEVMODE_FIELD_FLAGS` = 1u;
public const val `DM_PANNINGHEIGHT`: `DEVMODE_FIELD_FLAGS` = 268435456u;
public const val `DM_PANNINGWIDTH`: `DEVMODE_FIELD_FLAGS` = 134217728u;
public const val `DM_PAPERLENGTH`: `DEVMODE_FIELD_FLAGS` = 4u;
public const val `DM_PAPERSIZE`: `DEVMODE_FIELD_FLAGS` = 2u;
public const val `DM_PAPERWIDTH`: `DEVMODE_FIELD_FLAGS` = 8u;
public const val `DM_PELSHEIGHT`: `DEVMODE_FIELD_FLAGS` = 1048576u;
public const val `DM_PELSWIDTH`: `DEVMODE_FIELD_FLAGS` = 524288u;
public const val `DM_POSITION`: `DEVMODE_FIELD_FLAGS` = 32u;
public const val `DM_PRINTQUALITY`: `DEVMODE_FIELD_FLAGS` = 1024u;
public const val `DM_PROMPT`: `DEVMODE_FIELD_FLAGS` = 4u;
public const val `DM_SCALE`: `DEVMODE_FIELD_FLAGS` = 16u;
public const val `DM_SPECVERSION`: `DEVMODE_FIELD_FLAGS` = 1025u;
public const val `DM_TTOPTION`: `DEVMODE_FIELD_FLAGS` = 16384u;
public const val `DM_UPDATE`: `DEVMODE_FIELD_FLAGS` = 1u;
public const val `DM_YRESOLUTION`: `DEVMODE_FIELD_FLAGS` = 8192u;
public const val `DOWNLOADFACE`: UInt = 514u;
public const val `DOWNLOADHEADER`: UInt = 4111u;
public const val `DRAFTMODE`: UInt = 7u;
public const val `DRAFT_QUALITY`: `FONT_QUALITY` = 1u;
public typealias `DRAWEDGE_FLAGS` = UInt;
public const val `DRAWPATTERNRECT`: UInt = 25u;
// UNSUPPORTED Rust 1400:1: generic scalar type unsupported
// pub type DRAWSTATEPROC = Option<unsafe extern "system" fn(hdc: HDC, ldata: super::super::Foundation::LPARAM, wdata: super::super::Foundation::WPARAM, cx: i32, cy: i32) -> windows_sys::core::BOOL>;

public typealias `DRAWSTATE_FLAGS` = UInt;
// UNSUPPORTED Rust 1402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DRAWTEXTPARAMS {
//     pub cbSize: u32,
//     pub iTabLength: i32,
//     pub iLeftMargin: i32,
//     pub iRightMargin: i32,
//     pub uiLengthDrawn: u32,
// }

public typealias `DRAW_CAPTION_FLAGS` = UInt;
public typealias `DRAW_EDGE_FLAGS` = UInt;
public typealias `DRAW_TEXT_FORMAT` = UInt;
public const val `DRIVERVERSION`: `GET_DEVICE_CAPS_INDEX` = 0u;
public const val `DSS_DISABLED`: `DRAWSTATE_FLAGS` = 32u;
public const val `DSS_HIDEPREFIX`: `DRAWSTATE_FLAGS` = 512u;
public const val `DSS_MONO`: `DRAWSTATE_FLAGS` = 128u;
public const val `DSS_NORMAL`: `DRAWSTATE_FLAGS` = 0u;
public const val `DSS_PREFIXONLY`: `DRAWSTATE_FLAGS` = 1024u;
public const val `DSS_RIGHT`: `DRAWSTATE_FLAGS` = 32768u;
public const val `DSS_UNION`: `DRAWSTATE_FLAGS` = 16u;
public const val `DSTINVERT`: `ROP_CODE` = 5570569u;
public const val `DST_BITMAP`: `DRAWSTATE_FLAGS` = 4u;
public const val `DST_COMPLEX`: `DRAWSTATE_FLAGS` = 0u;
public const val `DST_ICON`: `DRAWSTATE_FLAGS` = 3u;
public const val `DST_PREFIXTEXT`: `DRAWSTATE_FLAGS` = 2u;
public const val `DST_TEXT`: `DRAWSTATE_FLAGS` = 1u;
public const val `DT_BOTTOM`: `DRAW_TEXT_FORMAT` = 8u;
public const val `DT_CALCRECT`: `DRAW_TEXT_FORMAT` = 1024u;
public const val `DT_CENTER`: `DRAW_TEXT_FORMAT` = 1u;
public const val `DT_CHARSTREAM`: UInt = 4u;
public const val `DT_DISPFILE`: UInt = 6u;
public const val `DT_EDITCONTROL`: `DRAW_TEXT_FORMAT` = 8192u;
public const val `DT_END_ELLIPSIS`: `DRAW_TEXT_FORMAT` = 32768u;
public const val `DT_EXPANDTABS`: `DRAW_TEXT_FORMAT` = 64u;
public const val `DT_EXTERNALLEADING`: `DRAW_TEXT_FORMAT` = 512u;
public const val `DT_HIDEPREFIX`: `DRAW_TEXT_FORMAT` = 1048576u;
public const val `DT_INTERNAL`: `DRAW_TEXT_FORMAT` = 4096u;
public const val `DT_LEFT`: `DRAW_TEXT_FORMAT` = 0u;
public const val `DT_METAFILE`: UInt = 5u;
public const val `DT_MODIFYSTRING`: `DRAW_TEXT_FORMAT` = 65536u;
public const val `DT_NOCLIP`: `DRAW_TEXT_FORMAT` = 256u;
public const val `DT_NOFULLWIDTHCHARBREAK`: `DRAW_TEXT_FORMAT` = 524288u;
public const val `DT_NOPREFIX`: `DRAW_TEXT_FORMAT` = 2048u;
public const val `DT_PATH_ELLIPSIS`: `DRAW_TEXT_FORMAT` = 16384u;
public const val `DT_PLOTTER`: UInt = 0u;
public const val `DT_PREFIXONLY`: `DRAW_TEXT_FORMAT` = 2097152u;
public const val `DT_RASCAMERA`: UInt = 3u;
public const val `DT_RASDISPLAY`: UInt = 1u;
public const val `DT_RASPRINTER`: UInt = 2u;
public const val `DT_RIGHT`: `DRAW_TEXT_FORMAT` = 2u;
public const val `DT_RTLREADING`: `DRAW_TEXT_FORMAT` = 131072u;
public const val `DT_SINGLELINE`: `DRAW_TEXT_FORMAT` = 32u;
public const val `DT_TABSTOP`: `DRAW_TEXT_FORMAT` = 128u;
public const val `DT_TOP`: `DRAW_TEXT_FORMAT` = 0u;
public const val `DT_VCENTER`: `DRAW_TEXT_FORMAT` = 4u;
public const val `DT_WORDBREAK`: `DRAW_TEXT_FORMAT` = 16u;
public const val `DT_WORD_ELLIPSIS`: `DRAW_TEXT_FORMAT` = 262144u;
public const val `EASTEUROPE_CHARSET`: `FONT_CHARSET` = 238u;
public const val `EDGE_BUMP`: `DRAWEDGE_FLAGS` = 9u;
public const val `EDGE_ETCHED`: `DRAWEDGE_FLAGS` = 6u;
public const val `EDGE_RAISED`: `DRAWEDGE_FLAGS` = 5u;
public const val `EDGE_SUNKEN`: `DRAWEDGE_FLAGS` = 10u;
public const val `EDS_RAWMODE`: `ENUM_DISPLAY_SETTINGS_FLAGS` = 2u;
public const val `EDS_ROTATEDMODE`: `ENUM_DISPLAY_SETTINGS_FLAGS` = 4u;
public const val `ELF_CULTURE_LATIN`: UInt = 0u;
public const val `ELF_VENDOR_SIZE`: UInt = 4u;
public const val `ELF_VERSION`: UInt = 0u;
public typealias `EMBEDDED_FONT_PRIV_STATUS` = UInt;
public const val `EMBED_EDITABLE`: `EMBEDDED_FONT_PRIV_STATUS` = 2u;
public typealias `EMBED_FONT_CHARSET` = UInt;
public const val `EMBED_INSTALLABLE`: `EMBEDDED_FONT_PRIV_STATUS` = 3u;
public const val `EMBED_NOEMBEDDING`: `EMBEDDED_FONT_PRIV_STATUS` = 4u;
public const val `EMBED_PREVIEWPRINT`: `EMBEDDED_FONT_PRIV_STATUS` = 1u;
// UNSUPPORTED Rust 1475:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMR {
//     pub iType: ENHANCED_METAFILE_RECORD_TYPE,
//     pub nSize: u32,
// }

// UNSUPPORTED Rust 1481:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRALPHABLEND {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub xDest: i32,
//     pub yDest: i32,
//     pub cxDest: i32,
//     pub cyDest: i32,
//     pub dwRop: u32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub xformSrc: XFORM,
//     pub crBkColorSrc: super::super::Foundation::COLORREF,
//     pub iUsageSrc: u32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
//     pub cxSrc: i32,
//     pub cySrc: i32,
// }

// UNSUPPORTED Rust 1503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRANGLEARC {
//     pub emr: EMR,
//     pub ptlCenter: super::super::Foundation::POINTL,
//     pub nRadius: u32,
//     pub eStartAngle: f32,
//     pub eSweepAngle: f32,
// }

// UNSUPPORTED Rust 1512:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRARC {
//     pub emr: EMR,
//     pub rclBox: super::super::Foundation::RECTL,
//     pub ptlStart: super::super::Foundation::POINTL,
//     pub ptlEnd: super::super::Foundation::POINTL,
// }

// UNSUPPORTED Rust 1520:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRBITBLT {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub xDest: i32,
//     pub yDest: i32,
//     pub cxDest: i32,
//     pub cyDest: i32,
//     pub dwRop: u32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub xformSrc: XFORM,
//     pub crBkColorSrc: super::super::Foundation::COLORREF,
//     pub iUsageSrc: u32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
// }

// UNSUPPORTED Rust 1540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRCOLORCORRECTPALETTE {
//     pub emr: EMR,
//     pub ihPalette: u32,
//     pub nFirstEntry: u32,
//     pub nPalEntries: u32,
//     pub nReserved: u32,
// }

// UNSUPPORTED Rust 1549:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRCOLORMATCHTOTARGET {
//     pub emr: EMR,
//     pub dwAction: u32,
//     pub dwFlags: u32,
//     pub cbName: u32,
//     pub cbData: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 1559:1: declaration Impl has no candidate rule
// impl Default for EMRCOLORMATCHTOTARGET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRCREATEBRUSHINDIRECT {
//     pub emr: EMR,
//     pub ihBrush: u32,
//     pub lb: LOGBRUSH32,
// }

// UNSUPPORTED Rust 1571:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRCREATEDIBPATTERNBRUSHPT {
//     pub emr: EMR,
//     pub ihBrush: u32,
//     pub iUsage: u32,
//     pub offBmi: u32,
//     pub cbBmi: u32,
//     pub offBits: u32,
//     pub cbBits: u32,
// }

// UNSUPPORTED Rust 1582:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRCREATEMONOBRUSH {
//     pub emr: EMR,
//     pub ihBrush: u32,
//     pub iUsage: u32,
//     pub offBmi: u32,
//     pub cbBmi: u32,
//     pub offBits: u32,
//     pub cbBits: u32,
// }

// UNSUPPORTED Rust 1593:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRCREATEPALETTE {
//     pub emr: EMR,
//     pub ihPal: u32,
//     pub lgpl: LOGPALETTE,
// }

// UNSUPPORTED Rust 1600:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRCREATEPEN {
//     pub emr: EMR,
//     pub ihPen: u32,
//     pub lopn: LOGPEN,
// }

// UNSUPPORTED Rust 1607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRELLIPSE {
//     pub emr: EMR,
//     pub rclBox: super::super::Foundation::RECTL,
// }

// UNSUPPORTED Rust 1613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMREOF {
//     pub emr: EMR,
//     pub nPalEntries: u32,
//     pub offPalEntries: u32,
//     pub nSizeLast: u32,
// }

// UNSUPPORTED Rust 1621:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMREXCLUDECLIPRECT {
//     pub emr: EMR,
//     pub rclClip: super::super::Foundation::RECTL,
// }

// UNSUPPORTED Rust 1627:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMREXTCREATEFONTINDIRECTW {
//     pub emr: EMR,
//     pub ihFont: u32,
//     pub elfw: EXTLOGFONTW,
// }

// UNSUPPORTED Rust 1634:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMREXTCREATEPEN {
//     pub emr: EMR,
//     pub ihPen: u32,
//     pub offBmi: u32,
//     pub cbBmi: u32,
//     pub offBits: u32,
//     pub cbBits: u32,
//     pub elp: EXTLOGPEN32,
// }

// UNSUPPORTED Rust 1645:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMREXTESCAPE {
//     pub emr: EMR,
//     pub iEscape: i32,
//     pub cbEscData: i32,
//     pub EscData: [u8; 1],
// }

// UNSUPPORTED Rust 1653:1: declaration Impl has no candidate rule
// impl Default for EMREXTESCAPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMREXTFLOODFILL {
//     pub emr: EMR,
//     pub ptlStart: super::super::Foundation::POINTL,
//     pub crColor: super::super::Foundation::COLORREF,
//     pub iMode: u32,
// }

// UNSUPPORTED Rust 1666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMREXTSELECTCLIPRGN {
//     pub emr: EMR,
//     pub cbRgnData: u32,
//     pub iMode: u32,
//     pub RgnData: [u8; 1],
// }

// UNSUPPORTED Rust 1674:1: declaration Impl has no candidate rule
// impl Default for EMREXTSELECTCLIPRGN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMREXTTEXTOUTA {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub iGraphicsMode: u32,
//     pub exScale: f32,
//     pub eyScale: f32,
//     pub emrtext: EMRTEXT,
// }

// UNSUPPORTED Rust 1689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRFILLPATH {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
// }

// UNSUPPORTED Rust 1695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRFILLRGN {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cbRgnData: u32,
//     pub ihBrush: u32,
//     pub RgnData: [u8; 1],
// }

// UNSUPPORTED Rust 1704:1: declaration Impl has no candidate rule
// impl Default for EMRFILLRGN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRFORMAT {
//     pub dSignature: u32,
//     pub nVersion: u32,
//     pub cbData: u32,
//     pub offData: u32,
// }

// UNSUPPORTED Rust 1717:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRFRAMERGN {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cbRgnData: u32,
//     pub ihBrush: u32,
//     pub szlStroke: super::super::Foundation::SIZE,
//     pub RgnData: [u8; 1],
// }

// UNSUPPORTED Rust 1727:1: declaration Impl has no candidate rule
// impl Default for EMRFRAMERGN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRGDICOMMENT {
//     pub emr: EMR,
//     pub cbData: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 1739:1: declaration Impl has no candidate rule
// impl Default for EMRGDICOMMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1744:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRGLSBOUNDEDRECORD {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cbData: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 1752:1: declaration Impl has no candidate rule
// impl Default for EMRGLSBOUNDEDRECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1757:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRGLSRECORD {
//     pub emr: EMR,
//     pub cbData: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 1764:1: declaration Impl has no candidate rule
// impl Default for EMRGLSRECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRGRADIENTFILL {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub nVer: u32,
//     pub nTri: u32,
//     pub ulMode: GRADIENT_FILL,
//     pub Ver: [TRIVERTEX; 1],
// }

// UNSUPPORTED Rust 1779:1: declaration Impl has no candidate rule
// impl Default for EMRGRADIENTFILL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1784:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRINVERTRGN {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cbRgnData: u32,
//     pub RgnData: [u8; 1],
// }

// UNSUPPORTED Rust 1792:1: declaration Impl has no candidate rule
// impl Default for EMRINVERTRGN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1797:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRLINETO {
//     pub emr: EMR,
//     pub ptl: super::super::Foundation::POINTL,
// }

// UNSUPPORTED Rust 1803:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRMASKBLT {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub xDest: i32,
//     pub yDest: i32,
//     pub cxDest: i32,
//     pub cyDest: i32,
//     pub dwRop: u32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub xformSrc: XFORM,
//     pub crBkColorSrc: super::super::Foundation::COLORREF,
//     pub iUsageSrc: u32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
//     pub xMask: i32,
//     pub yMask: i32,
//     pub iUsageMask: u32,
//     pub offBmiMask: u32,
//     pub cbBmiMask: u32,
//     pub offBitsMask: u32,
//     pub cbBitsMask: u32,
// }

// UNSUPPORTED Rust 1830:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRMODIFYWORLDTRANSFORM {
//     pub emr: EMR,
//     pub xform: XFORM,
//     pub iMode: MODIFY_WORLD_TRANSFORM_MODE,
// }

// UNSUPPORTED Rust 1837:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRNAMEDESCAPE {
//     pub emr: EMR,
//     pub iEscape: i32,
//     pub cbDriver: i32,
//     pub cbEscData: i32,
//     pub EscData: [u8; 1],
// }

// UNSUPPORTED Rust 1846:1: declaration Impl has no candidate rule
// impl Default for EMRNAMEDESCAPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1851:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMROFFSETCLIPRGN {
//     pub emr: EMR,
//     pub ptlOffset: super::super::Foundation::POINTL,
// }

// UNSUPPORTED Rust 1857:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPLGBLT {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub aptlDest: [super::super::Foundation::POINTL; 3],
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub cxSrc: i32,
//     pub cySrc: i32,
//     pub xformSrc: XFORM,
//     pub crBkColorSrc: super::super::Foundation::COLORREF,
//     pub iUsageSrc: u32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
//     pub xMask: i32,
//     pub yMask: i32,
//     pub iUsageMask: u32,
//     pub offBmiMask: u32,
//     pub cbBmiMask: u32,
//     pub offBitsMask: u32,
//     pub cbBitsMask: u32,
// }

// UNSUPPORTED Rust 1882:1: declaration Impl has no candidate rule
// impl Default for EMRPLGBLT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1887:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPOLYDRAW {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cptl: u32,
//     pub aptl: [super::super::Foundation::POINTL; 1],
//     pub abTypes: [u8; 1],
// }

// UNSUPPORTED Rust 1896:1: declaration Impl has no candidate rule
// impl Default for EMRPOLYDRAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1901:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPOLYDRAW16 {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cpts: u32,
//     pub apts: [super::super::Foundation::POINTS; 1],
//     pub abTypes: [u8; 1],
// }

// UNSUPPORTED Rust 1910:1: declaration Impl has no candidate rule
// impl Default for EMRPOLYDRAW16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1915:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPOLYLINE {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cptl: u32,
//     pub aptl: [super::super::Foundation::POINTL; 1],
// }

// UNSUPPORTED Rust 1923:1: declaration Impl has no candidate rule
// impl Default for EMRPOLYLINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1928:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPOLYLINE16 {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub cpts: u32,
//     pub apts: [super::super::Foundation::POINTS; 1],
// }

// UNSUPPORTED Rust 1936:1: declaration Impl has no candidate rule
// impl Default for EMRPOLYLINE16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1941:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPOLYPOLYLINE {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub nPolys: u32,
//     pub cptl: u32,
//     pub aPolyCounts: [u32; 1],
//     pub aptl: [super::super::Foundation::POINTL; 1],
// }

// UNSUPPORTED Rust 1951:1: declaration Impl has no candidate rule
// impl Default for EMRPOLYPOLYLINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1956:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPOLYPOLYLINE16 {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub nPolys: u32,
//     pub cpts: u32,
//     pub aPolyCounts: [u32; 1],
//     pub apts: [super::super::Foundation::POINTS; 1],
// }

// UNSUPPORTED Rust 1966:1: declaration Impl has no candidate rule
// impl Default for EMRPOLYPOLYLINE16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1971:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRPOLYTEXTOUTA {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub iGraphicsMode: u32,
//     pub exScale: f32,
//     pub eyScale: f32,
//     pub cStrings: i32,
//     pub aemrtext: [EMRTEXT; 1],
// }

// UNSUPPORTED Rust 1982:1: declaration Impl has no candidate rule
// impl Default for EMRPOLYTEXTOUTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1987:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRRESIZEPALETTE {
//     pub emr: EMR,
//     pub ihPal: u32,
//     pub cEntries: u32,
// }

// UNSUPPORTED Rust 1994:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRRESTOREDC {
//     pub emr: EMR,
//     pub iRelative: i32,
// }

// UNSUPPORTED Rust 2000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRROUNDRECT {
//     pub emr: EMR,
//     pub rclBox: super::super::Foundation::RECTL,
//     pub szlCorner: super::super::Foundation::SIZE,
// }

// UNSUPPORTED Rust 2007:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSCALEVIEWPORTEXTEX {
//     pub emr: EMR,
//     pub xNum: i32,
//     pub xDenom: i32,
//     pub yNum: i32,
//     pub yDenom: i32,
// }

// UNSUPPORTED Rust 2016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSELECTCLIPPATH {
//     pub emr: EMR,
//     pub iMode: u32,
// }

// UNSUPPORTED Rust 2022:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSELECTOBJECT {
//     pub emr: EMR,
//     pub ihObject: u32,
// }

// UNSUPPORTED Rust 2028:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSELECTPALETTE {
//     pub emr: EMR,
//     pub ihPal: u32,
// }

// UNSUPPORTED Rust 2034:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETARCDIRECTION {
//     pub emr: EMR,
//     pub iArcDirection: u32,
// }

// UNSUPPORTED Rust 2040:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETCOLORADJUSTMENT {
//     pub emr: EMR,
//     pub ColorAdjustment: COLORADJUSTMENT,
// }

// UNSUPPORTED Rust 2046:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETCOLORSPACE {
//     pub emr: EMR,
//     pub ihCS: u32,
// }

// UNSUPPORTED Rust 2052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETDIBITSTODEVICE {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub xDest: i32,
//     pub yDest: i32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub cxSrc: i32,
//     pub cySrc: i32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
//     pub iUsageSrc: u32,
//     pub iStartScan: u32,
//     pub cScans: u32,
// }

// UNSUPPORTED Rust 2071:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRSETICMPROFILE {
//     pub emr: EMR,
//     pub dwFlags: u32,
//     pub cbName: u32,
//     pub cbData: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 2080:1: declaration Impl has no candidate rule
// impl Default for EMRSETICMPROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETMAPPERFLAGS {
//     pub emr: EMR,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 2091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETMITERLIMIT {
//     pub emr: EMR,
//     pub eMiterLimit: f32,
// }

// UNSUPPORTED Rust 2097:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EMRSETPALETTEENTRIES {
//     pub emr: EMR,
//     pub ihPal: u32,
//     pub iStart: u32,
//     pub cEntries: u32,
//     pub aPalEntries: [PALETTEENTRY; 1],
// }

// UNSUPPORTED Rust 2106:1: declaration Impl has no candidate rule
// impl Default for EMRSETPALETTEENTRIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETPIXELV {
//     pub emr: EMR,
//     pub ptlPixel: super::super::Foundation::POINTL,
//     pub crColor: super::super::Foundation::COLORREF,
// }

// UNSUPPORTED Rust 2118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETTEXTCOLOR {
//     pub emr: EMR,
//     pub crColor: super::super::Foundation::COLORREF,
// }

// UNSUPPORTED Rust 2124:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETVIEWPORTEXTEX {
//     pub emr: EMR,
//     pub szlExtent: super::super::Foundation::SIZE,
// }

// UNSUPPORTED Rust 2130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETVIEWPORTORGEX {
//     pub emr: EMR,
//     pub ptlOrigin: super::super::Foundation::POINTL,
// }

// UNSUPPORTED Rust 2136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSETWORLDTRANSFORM {
//     pub emr: EMR,
//     pub xform: XFORM,
// }

// UNSUPPORTED Rust 2142:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSTRETCHBLT {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub xDest: i32,
//     pub yDest: i32,
//     pub cxDest: i32,
//     pub cyDest: i32,
//     pub dwRop: u32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub xformSrc: XFORM,
//     pub crBkColorSrc: super::super::Foundation::COLORREF,
//     pub iUsageSrc: u32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
//     pub cxSrc: i32,
//     pub cySrc: i32,
// }

// UNSUPPORTED Rust 2164:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRSTRETCHDIBITS {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub xDest: i32,
//     pub yDest: i32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub cxSrc: i32,
//     pub cySrc: i32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
//     pub iUsageSrc: u32,
//     pub dwRop: u32,
//     pub cxDest: i32,
//     pub cyDest: i32,
// }

// UNSUPPORTED Rust 2184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRTEXT {
//     pub ptlReference: super::super::Foundation::POINTL,
//     pub nChars: u32,
//     pub offString: u32,
//     pub fOptions: u32,
//     pub rcl: super::super::Foundation::RECTL,
//     pub offDx: u32,
// }

// UNSUPPORTED Rust 2194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EMRTRANSPARENTBLT {
//     pub emr: EMR,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub xDest: i32,
//     pub yDest: i32,
//     pub cxDest: i32,
//     pub cyDest: i32,
//     pub dwRop: u32,
//     pub xSrc: i32,
//     pub ySrc: i32,
//     pub xformSrc: XFORM,
//     pub crBkColorSrc: super::super::Foundation::COLORREF,
//     pub iUsageSrc: u32,
//     pub offBmiSrc: u32,
//     pub cbBmiSrc: u32,
//     pub offBitsSrc: u32,
//     pub cbBitsSrc: u32,
//     pub cxSrc: i32,
//     pub cySrc: i32,
// }

public const val `EMR_ABORTPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 68u;
public const val `EMR_ALPHABLEND`: `ENHANCED_METAFILE_RECORD_TYPE` = 114u;
public const val `EMR_ANGLEARC`: `ENHANCED_METAFILE_RECORD_TYPE` = 41u;
public const val `EMR_ARC`: `ENHANCED_METAFILE_RECORD_TYPE` = 45u;
public const val `EMR_ARCTO`: `ENHANCED_METAFILE_RECORD_TYPE` = 55u;
public const val `EMR_BEGINPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 59u;
public const val `EMR_BITBLT`: `ENHANCED_METAFILE_RECORD_TYPE` = 76u;
public const val `EMR_CHORD`: `ENHANCED_METAFILE_RECORD_TYPE` = 46u;
public const val `EMR_CLOSEFIGURE`: `ENHANCED_METAFILE_RECORD_TYPE` = 61u;
public const val `EMR_COLORCORRECTPALETTE`: `ENHANCED_METAFILE_RECORD_TYPE` = 111u;
public const val `EMR_COLORMATCHTOTARGETW`: `ENHANCED_METAFILE_RECORD_TYPE` = 121u;
public const val `EMR_CREATEBRUSHINDIRECT`: `ENHANCED_METAFILE_RECORD_TYPE` = 39u;
public const val `EMR_CREATECOLORSPACE`: `ENHANCED_METAFILE_RECORD_TYPE` = 99u;
public const val `EMR_CREATECOLORSPACEW`: `ENHANCED_METAFILE_RECORD_TYPE` = 122u;
public const val `EMR_CREATEDIBPATTERNBRUSHPT`: `ENHANCED_METAFILE_RECORD_TYPE` = 94u;
public const val `EMR_CREATEMONOBRUSH`: `ENHANCED_METAFILE_RECORD_TYPE` = 93u;
public const val `EMR_CREATEPALETTE`: `ENHANCED_METAFILE_RECORD_TYPE` = 49u;
public const val `EMR_CREATEPEN`: `ENHANCED_METAFILE_RECORD_TYPE` = 38u;
public const val `EMR_DELETECOLORSPACE`: `ENHANCED_METAFILE_RECORD_TYPE` = 101u;
public const val `EMR_DELETEOBJECT`: `ENHANCED_METAFILE_RECORD_TYPE` = 40u;
public const val `EMR_ELLIPSE`: `ENHANCED_METAFILE_RECORD_TYPE` = 42u;
public const val `EMR_ENDPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 60u;
public const val `EMR_EOF`: `ENHANCED_METAFILE_RECORD_TYPE` = 14u;
public const val `EMR_EXCLUDECLIPRECT`: `ENHANCED_METAFILE_RECORD_TYPE` = 29u;
public const val `EMR_EXTCREATEFONTINDIRECTW`: `ENHANCED_METAFILE_RECORD_TYPE` = 82u;
public const val `EMR_EXTCREATEPEN`: `ENHANCED_METAFILE_RECORD_TYPE` = 95u;
public const val `EMR_EXTFLOODFILL`: `ENHANCED_METAFILE_RECORD_TYPE` = 53u;
public const val `EMR_EXTSELECTCLIPRGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 75u;
public const val `EMR_EXTTEXTOUTA`: `ENHANCED_METAFILE_RECORD_TYPE` = 83u;
public const val `EMR_EXTTEXTOUTW`: `ENHANCED_METAFILE_RECORD_TYPE` = 84u;
public const val `EMR_FILLPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 62u;
public const val `EMR_FILLRGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 71u;
public const val `EMR_FLATTENPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 65u;
public const val `EMR_FRAMERGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 72u;
public const val `EMR_GDICOMMENT`: `ENHANCED_METAFILE_RECORD_TYPE` = 70u;
public const val `EMR_GLSBOUNDEDRECORD`: `ENHANCED_METAFILE_RECORD_TYPE` = 103u;
public const val `EMR_GLSRECORD`: `ENHANCED_METAFILE_RECORD_TYPE` = 102u;
public const val `EMR_GRADIENTFILL`: `ENHANCED_METAFILE_RECORD_TYPE` = 118u;
public const val `EMR_HEADER`: `ENHANCED_METAFILE_RECORD_TYPE` = 1u;
public const val `EMR_INTERSECTCLIPRECT`: `ENHANCED_METAFILE_RECORD_TYPE` = 30u;
public const val `EMR_INVERTRGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 73u;
public const val `EMR_LINETO`: `ENHANCED_METAFILE_RECORD_TYPE` = 54u;
public const val `EMR_MASKBLT`: `ENHANCED_METAFILE_RECORD_TYPE` = 78u;
public const val `EMR_MAX`: `ENHANCED_METAFILE_RECORD_TYPE` = 122u;
public const val `EMR_MIN`: `ENHANCED_METAFILE_RECORD_TYPE` = 1u;
public const val `EMR_MODIFYWORLDTRANSFORM`: `ENHANCED_METAFILE_RECORD_TYPE` = 36u;
public const val `EMR_MOVETOEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 27u;
public const val `EMR_OFFSETCLIPRGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 26u;
public const val `EMR_PAINTRGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 74u;
public const val `EMR_PIE`: `ENHANCED_METAFILE_RECORD_TYPE` = 47u;
public const val `EMR_PIXELFORMAT`: `ENHANCED_METAFILE_RECORD_TYPE` = 104u;
public const val `EMR_PLGBLT`: `ENHANCED_METAFILE_RECORD_TYPE` = 79u;
public const val `EMR_POLYBEZIER`: `ENHANCED_METAFILE_RECORD_TYPE` = 2u;
public const val `EMR_POLYBEZIER16`: `ENHANCED_METAFILE_RECORD_TYPE` = 85u;
public const val `EMR_POLYBEZIERTO`: `ENHANCED_METAFILE_RECORD_TYPE` = 5u;
public const val `EMR_POLYBEZIERTO16`: `ENHANCED_METAFILE_RECORD_TYPE` = 88u;
public const val `EMR_POLYDRAW`: `ENHANCED_METAFILE_RECORD_TYPE` = 56u;
public const val `EMR_POLYDRAW16`: `ENHANCED_METAFILE_RECORD_TYPE` = 92u;
public const val `EMR_POLYGON`: `ENHANCED_METAFILE_RECORD_TYPE` = 3u;
public const val `EMR_POLYGON16`: `ENHANCED_METAFILE_RECORD_TYPE` = 86u;
public const val `EMR_POLYLINE`: `ENHANCED_METAFILE_RECORD_TYPE` = 4u;
public const val `EMR_POLYLINE16`: `ENHANCED_METAFILE_RECORD_TYPE` = 87u;
public const val `EMR_POLYLINETO`: `ENHANCED_METAFILE_RECORD_TYPE` = 6u;
public const val `EMR_POLYLINETO16`: `ENHANCED_METAFILE_RECORD_TYPE` = 89u;
public const val `EMR_POLYPOLYGON`: `ENHANCED_METAFILE_RECORD_TYPE` = 8u;
public const val `EMR_POLYPOLYGON16`: `ENHANCED_METAFILE_RECORD_TYPE` = 91u;
public const val `EMR_POLYPOLYLINE`: `ENHANCED_METAFILE_RECORD_TYPE` = 7u;
public const val `EMR_POLYPOLYLINE16`: `ENHANCED_METAFILE_RECORD_TYPE` = 90u;
public const val `EMR_POLYTEXTOUTA`: `ENHANCED_METAFILE_RECORD_TYPE` = 96u;
public const val `EMR_POLYTEXTOUTW`: `ENHANCED_METAFILE_RECORD_TYPE` = 97u;
public const val `EMR_REALIZEPALETTE`: `ENHANCED_METAFILE_RECORD_TYPE` = 52u;
public const val `EMR_RECTANGLE`: `ENHANCED_METAFILE_RECORD_TYPE` = 43u;
public const val `EMR_RESERVED_105`: `ENHANCED_METAFILE_RECORD_TYPE` = 105u;
public const val `EMR_RESERVED_106`: `ENHANCED_METAFILE_RECORD_TYPE` = 106u;
public const val `EMR_RESERVED_107`: `ENHANCED_METAFILE_RECORD_TYPE` = 107u;
public const val `EMR_RESERVED_108`: `ENHANCED_METAFILE_RECORD_TYPE` = 108u;
public const val `EMR_RESERVED_109`: `ENHANCED_METAFILE_RECORD_TYPE` = 109u;
public const val `EMR_RESERVED_110`: `ENHANCED_METAFILE_RECORD_TYPE` = 110u;
public const val `EMR_RESERVED_117`: `ENHANCED_METAFILE_RECORD_TYPE` = 117u;
public const val `EMR_RESERVED_119`: `ENHANCED_METAFILE_RECORD_TYPE` = 119u;
public const val `EMR_RESERVED_120`: `ENHANCED_METAFILE_RECORD_TYPE` = 120u;
public const val `EMR_RESIZEPALETTE`: `ENHANCED_METAFILE_RECORD_TYPE` = 51u;
public const val `EMR_RESTOREDC`: `ENHANCED_METAFILE_RECORD_TYPE` = 34u;
public const val `EMR_ROUNDRECT`: `ENHANCED_METAFILE_RECORD_TYPE` = 44u;
public const val `EMR_SAVEDC`: `ENHANCED_METAFILE_RECORD_TYPE` = 33u;
public const val `EMR_SCALEVIEWPORTEXTEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 31u;
public const val `EMR_SCALEWINDOWEXTEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 32u;
public const val `EMR_SELECTCLIPPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 67u;
public const val `EMR_SELECTOBJECT`: `ENHANCED_METAFILE_RECORD_TYPE` = 37u;
public const val `EMR_SELECTPALETTE`: `ENHANCED_METAFILE_RECORD_TYPE` = 48u;
public const val `EMR_SETARCDIRECTION`: `ENHANCED_METAFILE_RECORD_TYPE` = 57u;
public const val `EMR_SETBKCOLOR`: `ENHANCED_METAFILE_RECORD_TYPE` = 25u;
public const val `EMR_SETBKMODE`: `ENHANCED_METAFILE_RECORD_TYPE` = 18u;
public const val `EMR_SETBRUSHORGEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 13u;
public const val `EMR_SETCOLORADJUSTMENT`: `ENHANCED_METAFILE_RECORD_TYPE` = 23u;
public const val `EMR_SETCOLORSPACE`: `ENHANCED_METAFILE_RECORD_TYPE` = 100u;
public const val `EMR_SETDIBITSTODEVICE`: `ENHANCED_METAFILE_RECORD_TYPE` = 80u;
public const val `EMR_SETICMMODE`: `ENHANCED_METAFILE_RECORD_TYPE` = 98u;
public const val `EMR_SETICMPROFILEA`: `ENHANCED_METAFILE_RECORD_TYPE` = 112u;
public const val `EMR_SETICMPROFILEW`: `ENHANCED_METAFILE_RECORD_TYPE` = 113u;
public const val `EMR_SETLAYOUT`: `ENHANCED_METAFILE_RECORD_TYPE` = 115u;
public const val `EMR_SETMAPMODE`: `ENHANCED_METAFILE_RECORD_TYPE` = 17u;
public const val `EMR_SETMAPPERFLAGS`: `ENHANCED_METAFILE_RECORD_TYPE` = 16u;
public const val `EMR_SETMETARGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 28u;
public const val `EMR_SETMITERLIMIT`: `ENHANCED_METAFILE_RECORD_TYPE` = 58u;
public const val `EMR_SETPALETTEENTRIES`: `ENHANCED_METAFILE_RECORD_TYPE` = 50u;
public const val `EMR_SETPIXELV`: `ENHANCED_METAFILE_RECORD_TYPE` = 15u;
public const val `EMR_SETPOLYFILLMODE`: `ENHANCED_METAFILE_RECORD_TYPE` = 19u;
public const val `EMR_SETROP2`: `ENHANCED_METAFILE_RECORD_TYPE` = 20u;
public const val `EMR_SETSTRETCHBLTMODE`: `ENHANCED_METAFILE_RECORD_TYPE` = 21u;
public const val `EMR_SETTEXTALIGN`: `ENHANCED_METAFILE_RECORD_TYPE` = 22u;
public const val `EMR_SETTEXTCOLOR`: `ENHANCED_METAFILE_RECORD_TYPE` = 24u;
public const val `EMR_SETVIEWPORTEXTEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 11u;
public const val `EMR_SETVIEWPORTORGEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 12u;
public const val `EMR_SETWINDOWEXTEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 9u;
public const val `EMR_SETWINDOWORGEX`: `ENHANCED_METAFILE_RECORD_TYPE` = 10u;
public const val `EMR_SETWORLDTRANSFORM`: `ENHANCED_METAFILE_RECORD_TYPE` = 35u;
public const val `EMR_STRETCHBLT`: `ENHANCED_METAFILE_RECORD_TYPE` = 77u;
public const val `EMR_STRETCHDIBITS`: `ENHANCED_METAFILE_RECORD_TYPE` = 81u;
public const val `EMR_STROKEANDFILLPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 63u;
public const val `EMR_STROKEPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 64u;
public const val `EMR_TRANSPARENTBLT`: `ENHANCED_METAFILE_RECORD_TYPE` = 116u;
public const val `EMR_WIDENPATH`: `ENHANCED_METAFILE_RECORD_TYPE` = 66u;
public const val `ENABLEDUPLEX`: UInt = 28u;
public const val `ENABLEPAIRKERNING`: UInt = 769u;
public const val `ENABLERELATIVEWIDTHS`: UInt = 768u;
public const val `ENCAPSULATED_POSTSCRIPT`: UInt = 4116u;
public const val `ENDDOC`: UInt = 11u;
public const val `END_PATH`: UInt = 4098u;
public typealias `ENHANCED_METAFILE_RECORD_TYPE` = UInt;
// UNSUPPORTED Rust 2346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ENHMETAHEADER {
//     pub iType: u32,
//     pub nSize: u32,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub rclFrame: super::super::Foundation::RECTL,
//     pub dSignature: u32,
//     pub nVersion: u32,
//     pub nBytes: u32,
//     pub nRecords: u32,
//     pub nHandles: u16,
//     pub sReserved: u16,
//     pub nDescription: u32,
//     pub offDescription: u32,
//     pub nPalEntries: u32,
//     pub szlDevice: super::super::Foundation::SIZE,
//     pub szlMillimeters: super::super::Foundation::SIZE,
//     pub cbPixelFormat: u32,
//     pub offPixelFormat: u32,
//     pub bOpenGL: u32,
//     pub szlMicrometers: super::super::Foundation::SIZE,
// }

// UNSUPPORTED Rust 2369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENHMETARECORD {
//     pub iType: ENHANCED_METAFILE_RECORD_TYPE,
//     pub nSize: u32,
//     pub dParm: [u32; 1],
// }

// UNSUPPORTED Rust 2376:1: declaration Impl has no candidate rule
// impl Default for ENHMETARECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENHMETA_SIGNATURE`: UInt = 1179469088u;
public const val `ENHMETA_STOCK_OBJECT`: UInt = 2147483648u;
// UNSUPPORTED Rust 2383:1: generic scalar type unsupported
// pub type ENHMFENUMPROC = Option<unsafe extern "system" fn(hdc: HDC, lpht: *const HANDLETABLE, lpmr: *const ENHMETARECORD, nhandles: i32, data: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 2384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUMLOGFONTA {
//     pub elfLogFont: LOGFONTA,
//     pub elfFullName: [u8; 64],
//     pub elfStyle: [u8; 32],
// }

// UNSUPPORTED Rust 2391:1: declaration Impl has no candidate rule
// impl Default for ENUMLOGFONTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUMLOGFONTEXA {
//     pub elfLogFont: LOGFONTA,
//     pub elfFullName: [u8; 64],
//     pub elfStyle: [u8; 32],
//     pub elfScript: [u8; 32],
// }

// UNSUPPORTED Rust 2404:1: declaration Impl has no candidate rule
// impl Default for ENUMLOGFONTEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2409:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ENUMLOGFONTEXDVA {
//     pub elfEnumLogfontEx: ENUMLOGFONTEXA,
//     pub elfDesignVector: DESIGNVECTOR,
// }

// UNSUPPORTED Rust 2415:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ENUMLOGFONTEXDVW {
//     pub elfEnumLogfontEx: ENUMLOGFONTEXW,
//     pub elfDesignVector: DESIGNVECTOR,
// }

// UNSUPPORTED Rust 2421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUMLOGFONTEXW {
//     pub elfLogFont: LOGFONTW,
//     pub elfFullName: [u16; 64],
//     pub elfStyle: [u16; 32],
//     pub elfScript: [u16; 32],
// }

// UNSUPPORTED Rust 2429:1: declaration Impl has no candidate rule
// impl Default for ENUMLOGFONTEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUMLOGFONTW {
//     pub elfLogFont: LOGFONTW,
//     pub elfFullName: [u16; 64],
//     pub elfStyle: [u16; 32],
// }

// UNSUPPORTED Rust 2441:1: declaration Impl has no candidate rule
// impl Default for ENUMLOGFONTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENUMPAPERBINS`: UInt = 31u;
public const val `ENUMPAPERMETRICS`: UInt = 34u;
public const val `ENUM_CURRENT_SETTINGS`: `ENUM_DISPLAY_SETTINGS_MODE` = 4294967295u;
public typealias `ENUM_DISPLAY_SETTINGS_FLAGS` = UInt;
public typealias `ENUM_DISPLAY_SETTINGS_MODE` = UInt;
public const val `ENUM_REGISTRY_SETTINGS`: `ENUM_DISPLAY_SETTINGS_MODE` = 4294967294u;
public const val `EPSPRINTING`: UInt = 33u;
public const val `EPS_SIGNATURE`: UInt = 1179865157u;
public const val `ERROR`: Int = 0;
public const val `ERR_FORMAT`: UInt = 1006u;
public const val `ERR_GENERIC`: UInt = 1000u;
public const val `ERR_INVALID_BASE`: UInt = 1085u;
public const val `ERR_INVALID_CMAP`: UInt = 1060u;
public const val `ERR_INVALID_DELTA_FORMAT`: UInt = 1013u;
public const val `ERR_INVALID_EBLC`: UInt = 1086u;
public const val `ERR_INVALID_GDEF`: UInt = 1083u;
public const val `ERR_INVALID_GLYF`: UInt = 1061u;
public const val `ERR_INVALID_GPOS`: UInt = 1082u;
public const val `ERR_INVALID_GSUB`: UInt = 1081u;
public const val `ERR_INVALID_HDMX`: UInt = 1089u;
public const val `ERR_INVALID_HEAD`: UInt = 1062u;
public const val `ERR_INVALID_HHEA`: UInt = 1063u;
public const val `ERR_INVALID_HHEA_OR_VHEA`: UInt = 1072u;
public const val `ERR_INVALID_HMTX`: UInt = 1064u;
public const val `ERR_INVALID_HMTX_OR_VMTX`: UInt = 1073u;
public const val `ERR_INVALID_JSTF`: UInt = 1084u;
public const val `ERR_INVALID_LOCA`: UInt = 1065u;
public const val `ERR_INVALID_LTSH`: UInt = 1087u;
public const val `ERR_INVALID_MAXP`: UInt = 1066u;
public const val `ERR_INVALID_MERGE_CHECKSUMS`: UInt = 1011u;
public const val `ERR_INVALID_MERGE_FORMATS`: UInt = 1010u;
public const val `ERR_INVALID_MERGE_NUMGLYPHS`: UInt = 1012u;
public const val `ERR_INVALID_NAME`: UInt = 1067u;
public const val `ERR_INVALID_OS2`: UInt = 1069u;
public const val `ERR_INVALID_POST`: UInt = 1068u;
public const val `ERR_INVALID_TTC_INDEX`: UInt = 1015u;
public const val `ERR_INVALID_TTO`: UInt = 1080u;
public const val `ERR_INVALID_VDMX`: UInt = 1088u;
public const val `ERR_INVALID_VHEA`: UInt = 1070u;
public const val `ERR_INVALID_VMTX`: UInt = 1071u;
public const val `ERR_MEM`: UInt = 1005u;
public const val `ERR_MISSING_CMAP`: UInt = 1030u;
public const val `ERR_MISSING_EBDT`: UInt = 1044u;
public const val `ERR_MISSING_GLYF`: UInt = 1031u;
public const val `ERR_MISSING_HEAD`: UInt = 1032u;
public const val `ERR_MISSING_HHEA`: UInt = 1033u;
public const val `ERR_MISSING_HHEA_OR_VHEA`: UInt = 1042u;
public const val `ERR_MISSING_HMTX`: UInt = 1034u;
public const val `ERR_MISSING_HMTX_OR_VMTX`: UInt = 1043u;
public const val `ERR_MISSING_LOCA`: UInt = 1035u;
public const val `ERR_MISSING_MAXP`: UInt = 1036u;
public const val `ERR_MISSING_NAME`: UInt = 1037u;
public const val `ERR_MISSING_OS2`: UInt = 1039u;
public const val `ERR_MISSING_POST`: UInt = 1038u;
public const val `ERR_MISSING_VHEA`: UInt = 1040u;
public const val `ERR_MISSING_VMTX`: UInt = 1041u;
public const val `ERR_NOT_TTC`: UInt = 1014u;
public const val `ERR_NO_GLYPHS`: UInt = 1009u;
public const val `ERR_PARAMETER0`: UInt = 1100u;
public const val `ERR_PARAMETER1`: UInt = 1101u;
public const val `ERR_PARAMETER10`: UInt = 1110u;
public const val `ERR_PARAMETER11`: UInt = 1111u;
public const val `ERR_PARAMETER12`: UInt = 1112u;
public const val `ERR_PARAMETER13`: UInt = 1113u;
public const val `ERR_PARAMETER14`: UInt = 1114u;
public const val `ERR_PARAMETER15`: UInt = 1115u;
public const val `ERR_PARAMETER16`: UInt = 1116u;
public const val `ERR_PARAMETER2`: UInt = 1102u;
public const val `ERR_PARAMETER3`: UInt = 1103u;
public const val `ERR_PARAMETER4`: UInt = 1104u;
public const val `ERR_PARAMETER5`: UInt = 1105u;
public const val `ERR_PARAMETER6`: UInt = 1106u;
public const val `ERR_PARAMETER7`: UInt = 1107u;
public const val `ERR_PARAMETER8`: UInt = 1108u;
public const val `ERR_PARAMETER9`: UInt = 1109u;
public const val `ERR_READCONTROL`: UInt = 1003u;
public const val `ERR_READOUTOFBOUNDS`: UInt = 1001u;
public const val `ERR_VERSION`: UInt = 1008u;
public const val `ERR_WOULD_GROW`: UInt = 1007u;
public const val `ERR_WRITECONTROL`: UInt = 1004u;
public const val `ERR_WRITEOUTOFBOUNDS`: UInt = 1002u;
public const val `ETO_CLIPPED`: `ETO_OPTIONS` = 4u;
public const val `ETO_GLYPH_INDEX`: `ETO_OPTIONS` = 16u;
public const val `ETO_IGNORELANGUAGE`: `ETO_OPTIONS` = 4096u;
public const val `ETO_NUMERICSLATIN`: `ETO_OPTIONS` = 2048u;
public const val `ETO_NUMERICSLOCAL`: `ETO_OPTIONS` = 1024u;
public const val `ETO_OPAQUE`: `ETO_OPTIONS` = 2u;
public typealias `ETO_OPTIONS` = UInt;
public const val `ETO_PDY`: `ETO_OPTIONS` = 8192u;
public const val `ETO_REVERSE_INDEX_MAP`: `ETO_OPTIONS` = 65536u;
public const val `ETO_RTLREADING`: `ETO_OPTIONS` = 128u;
// UNSUPPORTED Rust 2537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTLOGFONTA {
//     pub elfLogFont: LOGFONTA,
//     pub elfFullName: [u8; 64],
//     pub elfStyle: [u8; 32],
//     pub elfVersion: u32,
//     pub elfStyleSize: u32,
//     pub elfMatch: u32,
//     pub elfReserved: u32,
//     pub elfVendorId: [u8; 4],
//     pub elfCulture: u32,
//     pub elfPanose: PANOSE,
// }

// UNSUPPORTED Rust 2551:1: declaration Impl has no candidate rule
// impl Default for EXTLOGFONTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2556:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTLOGFONTW {
//     pub elfLogFont: LOGFONTW,
//     pub elfFullName: [u16; 64],
//     pub elfStyle: [u16; 32],
//     pub elfVersion: u32,
//     pub elfStyleSize: u32,
//     pub elfMatch: u32,
//     pub elfReserved: u32,
//     pub elfVendorId: [u8; 4],
//     pub elfCulture: u32,
//     pub elfPanose: PANOSE,
// }

// UNSUPPORTED Rust 2570:1: declaration Impl has no candidate rule
// impl Default for EXTLOGFONTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTLOGPEN {
//     pub elpPenStyle: u32,
//     pub elpWidth: u32,
//     pub elpBrushStyle: u32,
//     pub elpColor: super::super::Foundation::COLORREF,
//     pub elpHatch: usize,
//     pub elpNumEntries: u32,
//     pub elpStyleEntry: [u32; 1],
// }

// UNSUPPORTED Rust 2586:1: declaration Impl has no candidate rule
// impl Default for EXTLOGPEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2591:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTLOGPEN32 {
//     pub elpPenStyle: u32,
//     pub elpWidth: u32,
//     pub elpBrushStyle: u32,
//     pub elpColor: super::super::Foundation::COLORREF,
//     pub elpHatch: u32,
//     pub elpNumEntries: u32,
//     pub elpStyleEntry: [u32; 1],
// }

// UNSUPPORTED Rust 2602:1: declaration Impl has no candidate rule
// impl Default for EXTLOGPEN32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EXTTEXTOUT`: UInt = 512u;
public const val `EXT_DEVICE_CAPS`: UInt = 4099u;
public typealias `EXT_FLOOD_FILL_TYPE` = UInt;
public const val `E_ADDFONTFAILED`: Int = 512;
public const val `E_API_NOTIMPL`: Int = 1;
public const val `E_CHARCODECOUNTINVALID`: Int = 2;
public const val `E_CHARCODESETINVALID`: Int = 3;
public const val `E_CHARSETINVALID`: Int = 21;
public const val `E_COULDNTCREATETEMPFILE`: Int = 513;
public const val `E_DEVICETRUETYPEFONT`: Int = 4;
public const val `E_ERRORACCESSINGEXCLUDELIST`: Int = 274;
public const val `E_ERRORACCESSINGFACENAME`: Int = 13;
public const val `E_ERRORACCESSINGFONTDATA`: Int = 12;
public const val `E_ERRORCOMPRESSINGFONTDATA`: Int = 256;
public const val `E_ERRORCONVERTINGCHARS`: Int = 18;
public const val `E_ERRORCREATINGFONTFILE`: Int = 269;
public const val `E_ERRORDECOMPRESSINGFONTDATA`: Int = 273;
public const val `E_ERROREXPANDINGFONTDATA`: Int = 519;
public const val `E_ERRORGETTINGDC`: Int = 520;
public const val `E_ERRORREADINGFONTDATA`: Int = 267;
public const val `E_ERRORUNICODECONVERSION`: Int = 17;
public const val `E_EXCEPTION`: Int = 19;
public const val `E_EXCEPTIONINCOMPRESSION`: Int = 522;
public const val `E_EXCEPTIONINDECOMPRESSION`: Int = 521;
public const val `E_FACENAMEINVALID`: Int = 275;
public const val `E_FILE_NOT_FOUND`: Int = 23;
public const val `E_FLAGSINVALID`: Int = 268;
public const val `E_FONTALREADYEXISTS`: Int = 270;
public const val `E_FONTDATAINVALID`: Int = 258;
public const val `E_FONTFAMILYNAMENOTINFULL`: Int = 285;
public const val `E_FONTFILECREATEFAILED`: Int = 515;
public const val `E_FONTFILENOTFOUND`: Int = 517;
public const val `E_FONTINSTALLFAILED`: Int = 272;
public const val `E_FONTNAMEALREADYEXISTS`: Int = 271;
public const val `E_FONTNOTEMBEDDABLE`: Int = 260;
public const val `E_FONTREFERENCEINVALID`: Int = 8;
public const val `E_FONTVARIATIONSIMULATED`: Int = 283;
public const val `E_HDCINVALID`: Int = 6;
public const val `E_INPUTPARAMINVALID`: Int = 25;
public const val `E_NAMECHANGEFAILED`: Int = 259;
public const val `E_NOFREEMEMORY`: Int = 7;
public const val `E_NONE`: Int = 0;
public const val `E_NOOS2`: Int = 265;
public const val `E_NOTATRUETYPEFONT`: Int = 10;
public const val `E_PBENABLEDINVALID`: Int = 280;
public const val `E_PERMISSIONSINVALID`: Int = 279;
public const val `E_PRIVSINVALID`: Int = 261;
public const val `E_PRIVSTATUSINVALID`: Int = 278;
public const val `E_READFROMSTREAMFAILED`: Int = 263;
public const val `E_RESERVEDPARAMNOTNULL`: Int = 20;
public const val `E_RESOURCEFILECREATEFAILED`: Int = 518;
public const val `E_SAVETOSTREAMFAILED`: Int = 264;
public const val `E_STATUSINVALID`: Int = 277;
public const val `E_STREAMINVALID`: Int = 276;
public const val `E_SUBSETTINGEXCEPTION`: Int = 281;
public const val `E_SUBSETTINGFAILED`: Int = 262;
public const val `E_SUBSTRING_TEST_FAIL`: Int = 282;
public const val `E_T2NOFREEMEMORY`: Int = 266;
public const val `E_TTC_INDEX_OUT_OF_RANGE`: Int = 24;
public const val `E_WINDOWSAPI`: Int = 516;
public const val `FEATURESETTING_CUSTPAPER`: UInt = 3u;
public const val `FEATURESETTING_MIRROR`: UInt = 4u;
public const val `FEATURESETTING_NEGATIVE`: UInt = 5u;
public const val `FEATURESETTING_NUP`: UInt = 0u;
public const val `FEATURESETTING_OUTPUT`: UInt = 1u;
public const val `FEATURESETTING_PRIVATE_BEGIN`: UInt = 4096u;
public const val `FEATURESETTING_PRIVATE_END`: UInt = 8191u;
public const val `FEATURESETTING_PROTOCOL`: UInt = 6u;
public const val `FEATURESETTING_PSLEVEL`: UInt = 2u;
public const val `FF_DECORATIVE`: `FONT_FAMILY` = 80u;
public const val `FF_DONTCARE`: `FONT_FAMILY` = 0u;
public const val `FF_MODERN`: `FONT_FAMILY` = 48u;
public const val `FF_ROMAN`: `FONT_FAMILY` = 16u;
public const val `FF_SCRIPT`: `FONT_FAMILY` = 64u;
public const val `FF_SWISS`: `FONT_FAMILY` = 32u;
// UNSUPPORTED Rust 2682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FIXED {
//     pub fract: u16,
//     pub value: i16,
// }

public const val `FIXED_PITCH`: `FONT_PITCH` = 1u;
public const val `FLI_GLYPHS`: Int = 262144;
public const val `FLI_MASK`: UInt = 4155u;
public const val `FLOODFILLBORDER`: `EXT_FLOOD_FILL_TYPE` = 0u;
public const val `FLOODFILLSURFACE`: `EXT_FLOOD_FILL_TYPE` = 1u;
public const val `FLUSHOUTPUT`: UInt = 6u;
// UNSUPPORTED Rust 2694:1: generic scalar type unsupported
// pub type FONTENUMPROCA = Option<unsafe extern "system" fn(param0: *const LOGFONTA, param1: *const TEXTMETRICA, param2: u32, param3: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 2695:1: generic scalar type unsupported
// pub type FONTENUMPROCW = Option<unsafe extern "system" fn(param0: *const LOGFONTW, param1: *const TEXTMETRICW, param2: u32, param3: super::super::Foundation::LPARAM) -> i32>;

public const val `FONTMAPPER_MAX`: UInt = 10u;
public typealias `FONT_CHARSET` = UByte;
public typealias `FONT_CLIP_PRECISION` = UByte;
public typealias `FONT_FAMILY` = UByte;
public typealias `FONT_LICENSE_PRIVS` = UInt;
public typealias `FONT_OUTPUT_PRECISION` = UByte;
public typealias `FONT_PITCH` = UByte;
public typealias `FONT_QUALITY` = UByte;
public typealias `FONT_RESOURCE_CHARACTERISTICS` = UInt;
public typealias `FONT_WEIGHT` = UInt;
public const val `FR_NOT_ENUM`: `FONT_RESOURCE_CHARACTERISTICS` = 32u;
public const val `FR_PRIVATE`: `FONT_RESOURCE_CHARACTERISTICS` = 16u;
public const val `FS_ARABIC`: Int = 64;
public const val `FS_BALTIC`: Int = 128;
public const val `FS_CHINESESIMP`: Int = 262144;
public const val `FS_CHINESETRAD`: Int = 1048576;
public const val `FS_CYRILLIC`: Int = 4;
public const val `FS_GREEK`: Int = 8;
public const val `FS_HEBREW`: Int = 32;
public const val `FS_JISJAPAN`: Int = 131072;
public const val `FS_JOHAB`: Int = 2097152;
public const val `FS_LATIN1`: Int = 1;
public const val `FS_LATIN2`: Int = 2;
public const val `FS_SYMBOL`: Int = -2147483648;
public const val `FS_THAI`: Int = 65536;
public const val `FS_TURKISH`: Int = 16;
public const val `FS_VIETNAMESE`: Int = 256;
public const val `FS_WANSUNG`: Int = 524288;
public const val `FW_BLACK`: `FONT_WEIGHT` = 900u;
public const val `FW_BOLD`: `FONT_WEIGHT` = 700u;
public const val `FW_DEMIBOLD`: `FONT_WEIGHT` = 600u;
public const val `FW_DONTCARE`: `FONT_WEIGHT` = 0u;
public const val `FW_EXTRABOLD`: `FONT_WEIGHT` = 800u;
public const val `FW_EXTRALIGHT`: `FONT_WEIGHT` = 200u;
public const val `FW_HEAVY`: `FONT_WEIGHT` = 900u;
public const val `FW_LIGHT`: `FONT_WEIGHT` = 300u;
public const val `FW_MEDIUM`: `FONT_WEIGHT` = 500u;
public const val `FW_NORMAL`: `FONT_WEIGHT` = 400u;
public const val `FW_REGULAR`: `FONT_WEIGHT` = 400u;
public const val `FW_SEMIBOLD`: `FONT_WEIGHT` = 600u;
public const val `FW_THIN`: `FONT_WEIGHT` = 100u;
public const val `FW_ULTRABOLD`: `FONT_WEIGHT` = 800u;
public const val `FW_ULTRALIGHT`: `FONT_WEIGHT` = 200u;
public const val `GB2312_CHARSET`: `FONT_CHARSET` = 134u;
public const val `GCPCLASS_ARABIC`: UInt = 2u;
public const val `GCPCLASS_HEBREW`: UInt = 2u;
public const val `GCPCLASS_LATIN`: UInt = 1u;
public const val `GCPCLASS_LATINNUMBER`: UInt = 5u;
public const val `GCPCLASS_LATINNUMERICSEPARATOR`: UInt = 7u;
public const val `GCPCLASS_LATINNUMERICTERMINATOR`: UInt = 6u;
public const val `GCPCLASS_LOCALNUMBER`: UInt = 4u;
public const val `GCPCLASS_NEUTRAL`: UInt = 3u;
public const val `GCPCLASS_NUMERICSEPARATOR`: UInt = 8u;
public const val `GCPCLASS_POSTBOUNDLTR`: UInt = 32u;
public const val `GCPCLASS_POSTBOUNDRTL`: UInt = 16u;
public const val `GCPCLASS_PREBOUNDLTR`: UInt = 128u;
public const val `GCPCLASS_PREBOUNDRTL`: UInt = 64u;
public const val `GCPGLYPH_LINKAFTER`: UInt = 16384u;
public const val `GCPGLYPH_LINKBEFORE`: UInt = 32768u;
public const val `GCP_CLASSIN`: `GET_CHARACTER_PLACEMENT_FLAGS` = 524288u;
public const val `GCP_DBCS`: UInt = 1u;
public const val `GCP_DIACRITIC`: `GET_CHARACTER_PLACEMENT_FLAGS` = 256u;
public const val `GCP_DISPLAYZWG`: `GET_CHARACTER_PLACEMENT_FLAGS` = 4194304u;
public const val `GCP_ERROR`: UInt = 32768u;
public const val `GCP_GLYPHSHAPE`: `GET_CHARACTER_PLACEMENT_FLAGS` = 16u;
public const val `GCP_JUSTIFY`: `GET_CHARACTER_PLACEMENT_FLAGS` = 65536u;
public const val `GCP_JUSTIFYIN`: Int = 2097152;
public const val `GCP_KASHIDA`: `GET_CHARACTER_PLACEMENT_FLAGS` = 1024u;
public const val `GCP_LIGATE`: `GET_CHARACTER_PLACEMENT_FLAGS` = 32u;
public const val `GCP_MAXEXTENT`: `GET_CHARACTER_PLACEMENT_FLAGS` = 1048576u;
public const val `GCP_NEUTRALOVERRIDE`: `GET_CHARACTER_PLACEMENT_FLAGS` = 33554432u;
public const val `GCP_NUMERICOVERRIDE`: `GET_CHARACTER_PLACEMENT_FLAGS` = 16777216u;
public const val `GCP_NUMERICSLATIN`: `GET_CHARACTER_PLACEMENT_FLAGS` = 67108864u;
public const val `GCP_NUMERICSLOCAL`: `GET_CHARACTER_PLACEMENT_FLAGS` = 134217728u;
public const val `GCP_REORDER`: `GET_CHARACTER_PLACEMENT_FLAGS` = 2u;
// UNSUPPORTED Rust 2771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GCP_RESULTSA {
//     pub lStructSize: u32,
//     pub lpOutString: windows_sys::core::PSTR,
//     pub lpOrder: *mut u32,
//     pub lpDx: *mut i32,
//     pub lpCaretPos: *mut i32,
//     pub lpClass: windows_sys::core::PSTR,
//     pub lpGlyphs: windows_sys::core::PWSTR,
//     pub nGlyphs: u32,
//     pub nMaxFit: i32,
// }

// UNSUPPORTED Rust 2784:1: declaration Impl has no candidate rule
// impl Default for GCP_RESULTSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GCP_RESULTSW {
//     pub lStructSize: u32,
//     pub lpOutString: windows_sys::core::PWSTR,
//     pub lpOrder: *mut u32,
//     pub lpDx: *mut i32,
//     pub lpCaretPos: *mut i32,
//     pub lpClass: windows_sys::core::PSTR,
//     pub lpGlyphs: windows_sys::core::PWSTR,
//     pub nGlyphs: u32,
//     pub nMaxFit: i32,
// }

// UNSUPPORTED Rust 2802:1: declaration Impl has no candidate rule
// impl Default for GCP_RESULTSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GCP_SYMSWAPOFF`: `GET_CHARACTER_PLACEMENT_FLAGS` = 8388608u;
public const val `GCP_USEKERNING`: `GET_CHARACTER_PLACEMENT_FLAGS` = 8u;
public const val `GDICOMMENT_BEGINGROUP`: UInt = 2u;
public const val `GDICOMMENT_ENDGROUP`: UInt = 3u;
public const val `GDICOMMENT_IDENTIFIER`: UInt = 1128875079u;
public const val `GDICOMMENT_MULTIFORMATS`: UInt = 1073741828u;
public const val `GDICOMMENT_UNICODE_END`: UInt = 128u;
public const val `GDICOMMENT_UNICODE_STRING`: UInt = 64u;
public const val `GDICOMMENT_WINDOWS_METAFILE`: UInt = 2147483649u;
public const val `GDIPLUS_TS_QUERYVER`: UInt = 4122u;
public const val `GDIPLUS_TS_RECORD`: UInt = 4123u;
public const val `GDIREGISTERDDRAWPACKETVERSION`: UInt = 1u;
public const val `GDI_ERROR`: Int = -1;
public typealias `GDI_REGION_TYPE` = Int;
public const val `GETCOLORTABLE`: UInt = 5u;
public const val `GETDEVICEUNITS`: UInt = 42u;
public const val `GETEXTENDEDTEXTMETRICS`: UInt = 256u;
public const val `GETEXTENTTABLE`: UInt = 257u;
public const val `GETFACENAME`: UInt = 513u;
public const val `GETPAIRKERNTABLE`: UInt = 258u;
public const val `GETPENWIDTH`: UInt = 16u;
public const val `GETPHYSPAGESIZE`: UInt = 12u;
public const val `GETPRINTINGOFFSET`: UInt = 13u;
public const val `GETSCALINGFACTOR`: UInt = 14u;
public const val `GETSETPAPERBINS`: UInt = 29u;
public const val `GETSETPAPERMETRICS`: UInt = 35u;
public const val `GETSETPRINTORIENT`: UInt = 30u;
public const val `GETSETSCREENPARAMS`: UInt = 3072u;
public const val `GETTECHNOLGY`: UInt = 20u;
public const val `GETTECHNOLOGY`: UInt = 20u;
public const val `GETTRACKKERNTABLE`: UInt = 259u;
public const val `GETVECTORBRUSHSIZE`: UInt = 27u;
public const val `GETVECTORPENSIZE`: UInt = 26u;
public typealias `GET_CHARACTER_PLACEMENT_FLAGS` = UInt;
public typealias `GET_DCX_FLAGS` = UInt;
public typealias `GET_DEVICE_CAPS_INDEX` = UInt;
public typealias `GET_GLYPH_OUTLINE_FORMAT` = UInt;
public const val `GET_PS_FEATURESETTING`: UInt = 4121u;
public typealias `GET_STOCK_OBJECT_FLAGS` = Int;
public const val `GGI_MARK_NONEXISTING_GLYPHS`: UInt = 1u;
public const val `GGO_BEZIER`: `GET_GLYPH_OUTLINE_FORMAT` = 3u;
public const val `GGO_BITMAP`: `GET_GLYPH_OUTLINE_FORMAT` = 1u;
public const val `GGO_GLYPH_INDEX`: `GET_GLYPH_OUTLINE_FORMAT` = 128u;
public const val `GGO_GRAY2_BITMAP`: `GET_GLYPH_OUTLINE_FORMAT` = 4u;
public const val `GGO_GRAY4_BITMAP`: `GET_GLYPH_OUTLINE_FORMAT` = 5u;
public const val `GGO_GRAY8_BITMAP`: `GET_GLYPH_OUTLINE_FORMAT` = 6u;
public const val `GGO_METRICS`: `GET_GLYPH_OUTLINE_FORMAT` = 0u;
public const val `GGO_NATIVE`: `GET_GLYPH_OUTLINE_FORMAT` = 2u;
public const val `GGO_UNHINTED`: `GET_GLYPH_OUTLINE_FORMAT` = 256u;
// UNSUPPORTED Rust 2856:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GLYPHMETRICS {
//     pub gmBlackBoxX: u32,
//     pub gmBlackBoxY: u32,
//     pub gmptGlyphOrigin: super::super::Foundation::POINT,
//     pub gmCellIncX: i16,
//     pub gmCellIncY: i16,
// }

// UNSUPPORTED Rust 2865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GLYPHSET {
//     pub cbThis: u32,
//     pub flAccel: u32,
//     pub cGlyphsSupported: u32,
//     pub cRanges: u32,
//     pub ranges: [WCRANGE; 1],
// }

// UNSUPPORTED Rust 2874:1: declaration Impl has no candidate rule
// impl Default for GLYPHSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GM_ADVANCED`: `GRAPHICS_MODE` = 2;
public const val `GM_COMPATIBLE`: `GRAPHICS_MODE` = 1;
public const val `GM_LAST`: UInt = 2u;
// UNSUPPORTED Rust 2882:1: generic scalar type unsupported
// pub type GOBJENUMPROC = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: super::super::Foundation::LPARAM) -> i32>;

public typealias `GRADIENT_FILL` = UInt;
public const val `GRADIENT_FILL_OP_FLAG`: UInt = 255u;
public const val `GRADIENT_FILL_RECT_H`: `GRADIENT_FILL` = 0u;
public const val `GRADIENT_FILL_RECT_V`: `GRADIENT_FILL` = 1u;
public const val `GRADIENT_FILL_TRIANGLE`: `GRADIENT_FILL` = 2u;
// UNSUPPORTED Rust 2888:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GRADIENT_RECT {
//     pub UpperLeft: u32,
//     pub LowerRight: u32,
// }

// UNSUPPORTED Rust 2894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GRADIENT_TRIANGLE {
//     pub Vertex1: u32,
//     pub Vertex2: u32,
//     pub Vertex3: u32,
// }

public typealias `GRAPHICS_MODE` = Int;
// UNSUPPORTED Rust 2902:1: generic scalar type unsupported
// pub type GRAYSTRINGPROC = Option<unsafe extern "system" fn(param0: HDC, param1: super::super::Foundation::LPARAM, param2: i32) -> windows_sys::core::BOOL>;

public const val `GRAY_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 2;
public const val `GREEK_CHARSET`: `FONT_CHARSET` = 161u;
public const val `GS_8BIT_INDICES`: UInt = 1u;
public const val `HALFTONE`: `STRETCH_BLT_MODE` = 4;
// UNSUPPORTED Rust 2907:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HANDLETABLE {
//     pub objectHandle: [HGDIOBJ; 1],
// }

// UNSUPPORTED Rust 2912:1: declaration Impl has no candidate rule
// impl Default for HANDLETABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HANGEUL_CHARSET`: `FONT_CHARSET` = 129u;
public const val `HANGUL_CHARSET`: `FONT_CHARSET` = 129u;
public typealias `HATCH_BRUSH_STYLE` = Int;
// UNSUPPORTED Rust 2920:1: non-scalar type Ptr unsupported
// pub type HBITMAP = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2921:1: non-scalar type Ptr unsupported
// pub type HBRUSH = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2922:1: non-scalar type Ptr unsupported
// pub type HDC = *mut core::ffi::c_void;

public typealias `HDC_MAP_MODE` = Int;
public const val `HEBREW_CHARSET`: `FONT_CHARSET` = 177u;
// UNSUPPORTED Rust 2925:1: non-scalar type Ptr unsupported
// pub type HENHMETAFILE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2926:1: non-scalar type Ptr unsupported
// pub type HFONT = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2927:1: non-scalar type Ptr unsupported
// pub type HGDIOBJ = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2928:1: non-scalar type Ptr unsupported
// pub type HMETAFILE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2929:1: non-scalar type Ptr unsupported
// pub type HMONITOR = *mut core::ffi::c_void;

public const val `HOLLOW_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 5;
public const val `HORZRES`: `GET_DEVICE_CAPS_INDEX` = 8u;
public const val `HORZSIZE`: `GET_DEVICE_CAPS_INDEX` = 4u;
// UNSUPPORTED Rust 2933:1: non-scalar type Ptr unsupported
// pub type HPALETTE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2934:1: non-scalar type Ptr unsupported
// pub type HPEN = *mut core::ffi::c_void;

// UNSUPPORTED Rust 2935:1: non-scalar type Ptr unsupported
// pub type HRGN = *mut core::ffi::c_void;

public const val `HS_API_MAX`: UInt = 12u;
public const val `HS_BDIAGONAL`: `HATCH_BRUSH_STYLE` = 3;
public const val `HS_CROSS`: `HATCH_BRUSH_STYLE` = 4;
public const val `HS_DIAGCROSS`: `HATCH_BRUSH_STYLE` = 5;
public const val `HS_FDIAGONAL`: `HATCH_BRUSH_STYLE` = 2;
public const val `HS_HORIZONTAL`: `HATCH_BRUSH_STYLE` = 0;
public const val `HS_VERTICAL`: `HATCH_BRUSH_STYLE` = 1;
public const val `ILLUMINANT_A`: UInt = 1u;
public const val `ILLUMINANT_B`: UInt = 2u;
public const val `ILLUMINANT_C`: UInt = 3u;
public const val `ILLUMINANT_D50`: UInt = 4u;
public const val `ILLUMINANT_D55`: UInt = 5u;
public const val `ILLUMINANT_D65`: UInt = 6u;
public const val `ILLUMINANT_D75`: UInt = 7u;
public const val `ILLUMINANT_DAYLIGHT`: UInt = 3u;
public const val `ILLUMINANT_DEVICE_DEFAULT`: UInt = 0u;
public const val `ILLUMINANT_F2`: UInt = 8u;
public const val `ILLUMINANT_FLUORESCENT`: UInt = 8u;
public const val `ILLUMINANT_MAX_INDEX`: UInt = 8u;
public const val `ILLUMINANT_NTSC`: UInt = 3u;
public const val `ILLUMINANT_TUNGSTEN`: UInt = 1u;
public const val `JOHAB_CHARSET`: `FONT_CHARSET` = 130u;
// UNSUPPORTED Rust 2958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KERNINGPAIR {
//     pub wFirst: u16,
//     pub wSecond: u16,
//     pub iKernAmount: i32,
// }

public const val `LAYOUT_BITMAPORIENTATIONPRESERVED`: `DC_LAYOUT` = 8u;
public const val `LAYOUT_BTT`: UInt = 2u;
public const val `LAYOUT_RTL`: `DC_LAYOUT` = 1u;
public const val `LAYOUT_VBH`: UInt = 4u;
public const val `LCS_GM_ABS_COLORIMETRIC`: Int = 8;
public const val `LCS_GM_BUSINESS`: Int = 1;
public const val `LCS_GM_GRAPHICS`: Int = 2;
public const val `LCS_GM_IMAGES`: Int = 4;
public const val `LC_INTERIORS`: UInt = 128u;
public const val `LC_MARKER`: UInt = 4u;
public const val `LC_NONE`: UInt = 0u;
public const val `LC_POLYLINE`: UInt = 2u;
public const val `LC_POLYMARKER`: UInt = 8u;
public const val `LC_STYLED`: UInt = 32u;
public const val `LC_WIDE`: UInt = 16u;
public const val `LC_WIDESTYLED`: UInt = 64u;
public const val `LF_FACESIZE`: UInt = 32u;
public const val `LF_FULLFACESIZE`: UInt = 64u;
public const val `LICENSE_DEFAULT`: `FONT_LICENSE_PRIVS` = 0u;
public const val `LICENSE_EDITABLE`: `FONT_LICENSE_PRIVS` = 8u;
public const val `LICENSE_INSTALLABLE`: `FONT_LICENSE_PRIVS` = 0u;
public const val `LICENSE_NOEMBEDDING`: `FONT_LICENSE_PRIVS` = 2u;
public const val `LICENSE_PREVIEWPRINT`: `FONT_LICENSE_PRIVS` = 4u;
public const val `LINECAPS`: `GET_DEVICE_CAPS_INDEX` = 30u;
// UNSUPPORTED Rust 2989:1: generic scalar type unsupported
// pub type LINEDDAPROC = Option<unsafe extern "system" fn(param0: i32, param1: i32, param2: super::super::Foundation::LPARAM)>;

// UNSUPPORTED Rust 2990:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LOGBRUSH {
//     pub lbStyle: BRUSH_STYLE,
//     pub lbColor: super::super::Foundation::COLORREF,
//     pub lbHatch: usize,
// }

// UNSUPPORTED Rust 2997:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LOGBRUSH32 {
//     pub lbStyle: BRUSH_STYLE,
//     pub lbColor: super::super::Foundation::COLORREF,
//     pub lbHatch: u32,
// }

// UNSUPPORTED Rust 3004:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOGFONTA {
//     pub lfHeight: i32,
//     pub lfWidth: i32,
//     pub lfEscapement: i32,
//     pub lfOrientation: i32,
//     pub lfWeight: i32,
//     pub lfItalic: u8,
//     pub lfUnderline: u8,
//     pub lfStrikeOut: u8,
//     pub lfCharSet: FONT_CHARSET,
//     pub lfOutPrecision: FONT_OUTPUT_PRECISION,
//     pub lfClipPrecision: FONT_CLIP_PRECISION,
//     pub lfQuality: FONT_QUALITY,
//     pub lfPitchAndFamily: u8,
//     pub lfFaceName: [i8; 32],
// }

// UNSUPPORTED Rust 3022:1: declaration Impl has no candidate rule
// impl Default for LOGFONTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3027:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOGFONTW {
//     pub lfHeight: i32,
//     pub lfWidth: i32,
//     pub lfEscapement: i32,
//     pub lfOrientation: i32,
//     pub lfWeight: i32,
//     pub lfItalic: u8,
//     pub lfUnderline: u8,
//     pub lfStrikeOut: u8,
//     pub lfCharSet: FONT_CHARSET,
//     pub lfOutPrecision: FONT_OUTPUT_PRECISION,
//     pub lfClipPrecision: FONT_CLIP_PRECISION,
//     pub lfQuality: FONT_QUALITY,
//     pub lfPitchAndFamily: u8,
//     pub lfFaceName: [u16; 32],
// }

// UNSUPPORTED Rust 3045:1: declaration Impl has no candidate rule
// impl Default for LOGFONTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOGPALETTE {
//     pub palVersion: u16,
//     pub palNumEntries: u16,
//     pub palPalEntry: [PALETTEENTRY; 1],
// }

// UNSUPPORTED Rust 3057:1: declaration Impl has no candidate rule
// impl Default for LOGPALETTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3062:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LOGPEN {
//     pub lopnStyle: u32,
//     pub lopnWidth: super::super::Foundation::POINT,
//     pub lopnColor: super::super::Foundation::COLORREF,
// }

public const val `LOGPIXELSX`: `GET_DEVICE_CAPS_INDEX` = 88u;
public const val `LOGPIXELSY`: `GET_DEVICE_CAPS_INDEX` = 90u;
public const val `LPD_DOUBLEBUFFER`: UInt = 1u;
public const val `LPD_SHARE_ACCUM`: UInt = 256u;
public const val `LPD_SHARE_DEPTH`: UInt = 64u;
public const val `LPD_SHARE_STENCIL`: UInt = 128u;
public const val `LPD_STEREO`: UInt = 2u;
public const val `LPD_SUPPORT_GDI`: UInt = 16u;
public const val `LPD_SUPPORT_OPENGL`: UInt = 32u;
public const val `LPD_SWAP_COPY`: UInt = 1024u;
public const val `LPD_SWAP_EXCHANGE`: UInt = 512u;
public const val `LPD_TRANSPARENT`: UInt = 4096u;
public const val `LPD_TYPE_COLORINDEX`: UInt = 1u;
public const val `LPD_TYPE_RGBA`: UInt = 0u;
// UNSUPPORTED Rust 3083:1: generic scalar type unsupported
// pub type LPFNDEVCAPS = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: u32, param3: windows_sys::core::PCSTR, param4: *mut DEVMODEA) -> u32>;

// UNSUPPORTED Rust 3084:1: generic scalar type unsupported
// pub type LPFNDEVMODE = Option<unsafe extern "system" fn(param0: super::super::Foundation::HWND, param1: super::super::Foundation::HMODULE, param2: *mut DEVMODEA, param3: windows_sys::core::PCSTR, param4: windows_sys::core::PCSTR, param5: *mut DEVMODEA, param6: windows_sys::core::PCSTR, param7: u32) -> u32>;

public const val `LTGRAY_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 1;
public const val `MAC_CHARSET`: `FONT_CHARSET` = 77u;
// UNSUPPORTED Rust 3087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MAT2 {
//     pub eM11: FIXED,
//     pub eM12: FIXED,
//     pub eM21: FIXED,
//     pub eM22: FIXED,
// }

public const val `MAXSTRETCHBLTMODE`: UInt = 4u;
public const val `MERGECOPY`: `ROP_CODE` = 12583114u;
public const val `MERGEPAINT`: `ROP_CODE` = 12255782u;
public const val `METAFILE_DRIVER`: UInt = 2049u;
// UNSUPPORTED Rust 3099:1: declaration Struct has no candidate rule
// #[repr(C, packed(2))]
// #[derive(Clone, Copy, Default)]
// pub struct METAHEADER {
//     pub mtType: u16,
//     pub mtHeaderSize: u16,
//     pub mtVersion: u16,
//     pub mtSize: u32,
//     pub mtNoObjects: u16,
//     pub mtMaxRecord: u32,
//     pub mtNoParameters: u16,
// }

// UNSUPPORTED Rust 3110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct METARECORD {
//     pub rdSize: u32,
//     pub rdFunction: u16,
//     pub rdParm: [u16; 1],
// }

// UNSUPPORTED Rust 3117:1: declaration Impl has no candidate rule
// impl Default for METARECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `META_ANIMATEPALETTE`: UInt = 1078u;
public const val `META_ARC`: UInt = 2071u;
public const val `META_BITBLT`: UInt = 2338u;
public const val `META_CHORD`: UInt = 2096u;
public const val `META_CREATEBRUSHINDIRECT`: UInt = 764u;
public const val `META_CREATEFONTINDIRECT`: UInt = 763u;
public const val `META_CREATEPALETTE`: UInt = 247u;
public const val `META_CREATEPATTERNBRUSH`: UInt = 505u;
public const val `META_CREATEPENINDIRECT`: UInt = 762u;
public const val `META_CREATEREGION`: UInt = 1791u;
public const val `META_DELETEOBJECT`: UInt = 496u;
public const val `META_DIBBITBLT`: UInt = 2368u;
public const val `META_DIBCREATEPATTERNBRUSH`: UInt = 322u;
public const val `META_DIBSTRETCHBLT`: UInt = 2881u;
public const val `META_ELLIPSE`: UInt = 1048u;
public const val `META_ESCAPE`: UInt = 1574u;
public const val `META_EXCLUDECLIPRECT`: UInt = 1045u;
public const val `META_EXTFLOODFILL`: UInt = 1352u;
public const val `META_EXTTEXTOUT`: UInt = 2610u;
public const val `META_FILLREGION`: UInt = 552u;
public const val `META_FLOODFILL`: UInt = 1049u;
public const val `META_FRAMEREGION`: UInt = 1065u;
public const val `META_INTERSECTCLIPRECT`: UInt = 1046u;
public const val `META_INVERTREGION`: UInt = 298u;
public const val `META_LINETO`: UInt = 531u;
public const val `META_MOVETO`: UInt = 532u;
public const val `META_OFFSETCLIPRGN`: UInt = 544u;
public const val `META_OFFSETVIEWPORTORG`: UInt = 529u;
public const val `META_OFFSETWINDOWORG`: UInt = 527u;
public const val `META_PAINTREGION`: UInt = 299u;
public const val `META_PATBLT`: UInt = 1565u;
public const val `META_PIE`: UInt = 2074u;
public const val `META_POLYGON`: UInt = 804u;
public const val `META_POLYLINE`: UInt = 805u;
public const val `META_POLYPOLYGON`: UInt = 1336u;
public const val `META_REALIZEPALETTE`: UInt = 53u;
public const val `META_RECTANGLE`: UInt = 1051u;
public const val `META_RESIZEPALETTE`: UInt = 313u;
public const val `META_RESTOREDC`: UInt = 295u;
public const val `META_ROUNDRECT`: UInt = 1564u;
public const val `META_SAVEDC`: UInt = 30u;
public const val `META_SCALEVIEWPORTEXT`: UInt = 1042u;
public const val `META_SCALEWINDOWEXT`: UInt = 1040u;
public const val `META_SELECTCLIPREGION`: UInt = 300u;
public const val `META_SELECTOBJECT`: UInt = 301u;
public const val `META_SELECTPALETTE`: UInt = 564u;
public const val `META_SETBKCOLOR`: UInt = 513u;
public const val `META_SETBKMODE`: UInt = 258u;
public const val `META_SETDIBTODEV`: UInt = 3379u;
public const val `META_SETLAYOUT`: UInt = 329u;
public const val `META_SETMAPMODE`: UInt = 259u;
public const val `META_SETMAPPERFLAGS`: UInt = 561u;
public const val `META_SETPALENTRIES`: UInt = 55u;
public const val `META_SETPIXEL`: UInt = 1055u;
public const val `META_SETPOLYFILLMODE`: UInt = 262u;
public const val `META_SETRELABS`: UInt = 261u;
public const val `META_SETROP2`: UInt = 260u;
public const val `META_SETSTRETCHBLTMODE`: UInt = 263u;
public const val `META_SETTEXTALIGN`: UInt = 302u;
public const val `META_SETTEXTCHAREXTRA`: UInt = 264u;
public const val `META_SETTEXTCOLOR`: UInt = 521u;
public const val `META_SETTEXTJUSTIFICATION`: UInt = 522u;
public const val `META_SETVIEWPORTEXT`: UInt = 526u;
public const val `META_SETVIEWPORTORG`: UInt = 525u;
public const val `META_SETWINDOWEXT`: UInt = 524u;
public const val `META_SETWINDOWORG`: UInt = 523u;
public const val `META_STRETCHBLT`: UInt = 2851u;
public const val `META_STRETCHDIB`: UInt = 3907u;
public const val `META_TEXTOUT`: UInt = 1313u;
public const val `MFCOMMENT`: UInt = 15u;
// UNSUPPORTED Rust 3192:1: generic scalar type unsupported
// pub type MFENUMPROC = Option<unsafe extern "system" fn(hdc: HDC, lpht: *const HANDLETABLE, lpmr: *const METARECORD, nobj: i32, param4: super::super::Foundation::LPARAM) -> i32>;

public const val `MILCORE_TS_QUERYVER_RESULT_FALSE`: UInt = 0u;
public const val `MILCORE_TS_QUERYVER_RESULT_TRUE`: UInt = 2147483647u;
public const val `MM_ANISOTROPIC`: `HDC_MAP_MODE` = 8;
public const val `MM_HIENGLISH`: `HDC_MAP_MODE` = 5;
public const val `MM_HIMETRIC`: `HDC_MAP_MODE` = 3;
public const val `MM_ISOTROPIC`: `HDC_MAP_MODE` = 7;
public const val `MM_LOENGLISH`: `HDC_MAP_MODE` = 4;
public const val `MM_LOMETRIC`: `HDC_MAP_MODE` = 2;
public const val `MM_MAX_AXES_NAMELEN`: UInt = 16u;
public const val `MM_MAX_NUMAXES`: UInt = 16u;
public const val `MM_TEXT`: `HDC_MAP_MODE` = 1;
public const val `MM_TWIPS`: `HDC_MAP_MODE` = 6;
public typealias `MODIFY_WORLD_TRANSFORM_MODE` = UInt;
// UNSUPPORTED Rust 3206:1: generic scalar type unsupported
// pub type MONITORENUMPROC = Option<unsafe extern "system" fn(param0: HMONITOR, param1: HDC, param2: *mut super::super::Foundation::RECT, param3: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3207:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MONITORINFO {
//     pub cbSize: u32,
//     pub rcMonitor: super::super::Foundation::RECT,
//     pub rcWork: super::super::Foundation::RECT,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 3215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONITORINFOEXA {
//     pub monitorInfo: MONITORINFO,
//     pub szDevice: [i8; 32],
// }

// UNSUPPORTED Rust 3221:1: declaration Impl has no candidate rule
// impl Default for MONITORINFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONITORINFOEXW {
//     pub monitorInfo: MONITORINFO,
//     pub szDevice: [u16; 32],
// }

// UNSUPPORTED Rust 3232:1: declaration Impl has no candidate rule
// impl Default for MONITORINFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MONITOR_DEFAULTTONEAREST`: `MONITOR_FROM_FLAGS` = 2u;
public const val `MONITOR_DEFAULTTONULL`: `MONITOR_FROM_FLAGS` = 0u;
public const val `MONITOR_DEFAULTTOPRIMARY`: `MONITOR_FROM_FLAGS` = 1u;
public typealias `MONITOR_FROM_FLAGS` = UInt;
public const val `MONO_FONT`: UInt = 8u;
public const val `MOUSETRAILS`: UInt = 39u;
public const val `MWT_IDENTITY`: `MODIFY_WORLD_TRANSFORM_MODE` = 1u;
public const val `MWT_LEFTMULTIPLY`: `MODIFY_WORLD_TRANSFORM_MODE` = 2u;
public const val `MWT_RIGHTMULTIPLY`: `MODIFY_WORLD_TRANSFORM_MODE` = 3u;
public const val `NEWFRAME`: UInt = 1u;
// UNSUPPORTED Rust 3247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NEWTEXTMETRICA {
//     pub tmHeight: i32,
//     pub tmAscent: i32,
//     pub tmDescent: i32,
//     pub tmInternalLeading: i32,
//     pub tmExternalLeading: i32,
//     pub tmAveCharWidth: i32,
//     pub tmMaxCharWidth: i32,
//     pub tmWeight: i32,
//     pub tmOverhang: i32,
//     pub tmDigitizedAspectX: i32,
//     pub tmDigitizedAspectY: i32,
//     pub tmFirstChar: u8,
//     pub tmLastChar: u8,
//     pub tmDefaultChar: u8,
//     pub tmBreakChar: u8,
//     pub tmItalic: u8,
//     pub tmUnderlined: u8,
//     pub tmStruckOut: u8,
//     pub tmPitchAndFamily: TMPF_FLAGS,
//     pub tmCharSet: u8,
//     pub ntmFlags: u32,
//     pub ntmSizeEM: u32,
//     pub ntmCellHeight: u32,
//     pub ntmAvgWidth: u32,
// }

// UNSUPPORTED Rust 3275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NEWTEXTMETRICW {
//     pub tmHeight: i32,
//     pub tmAscent: i32,
//     pub tmDescent: i32,
//     pub tmInternalLeading: i32,
//     pub tmExternalLeading: i32,
//     pub tmAveCharWidth: i32,
//     pub tmMaxCharWidth: i32,
//     pub tmWeight: i32,
//     pub tmOverhang: i32,
//     pub tmDigitizedAspectX: i32,
//     pub tmDigitizedAspectY: i32,
//     pub tmFirstChar: u16,
//     pub tmLastChar: u16,
//     pub tmDefaultChar: u16,
//     pub tmBreakChar: u16,
//     pub tmItalic: u8,
//     pub tmUnderlined: u8,
//     pub tmStruckOut: u8,
//     pub tmPitchAndFamily: TMPF_FLAGS,
//     pub tmCharSet: u8,
//     pub ntmFlags: u32,
//     pub ntmSizeEM: u32,
//     pub ntmCellHeight: u32,
//     pub ntmAvgWidth: u32,
// }

public const val `NEWTRANSPARENT`: UInt = 3u;
public const val `NEXTBAND`: UInt = 3u;
public const val `NOMIRRORBITMAP`: `ROP_CODE` = 2147483648u;
public const val `NONANTIALIASED_QUALITY`: `FONT_QUALITY` = 3u;
public const val `NOTSRCCOPY`: `ROP_CODE` = 3342344u;
public const val `NOTSRCERASE`: `ROP_CODE` = 1114278u;
public const val `NTM_BOLD`: Int = 32;
public const val `NTM_DSIG`: UInt = 2097152u;
public const val `NTM_ITALIC`: Int = 1;
public const val `NTM_MULTIPLEMASTER`: UInt = 524288u;
public const val `NTM_NONNEGATIVE_AC`: UInt = 65536u;
public const val `NTM_PS_OPENTYPE`: UInt = 131072u;
public const val `NTM_REGULAR`: Int = 64;
public const val `NTM_TT_OPENTYPE`: UInt = 262144u;
public const val `NTM_TYPE1`: UInt = 1048576u;
public const val `NULLREGION`: `GDI_REGION_TYPE` = 1;
public const val `NULL_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 5;
public const val `NULL_PEN`: `GET_STOCK_OBJECT_FLAGS` = 8;
public const val `NUMBRUSHES`: `GET_DEVICE_CAPS_INDEX` = 16u;
public const val `NUMCOLORS`: `GET_DEVICE_CAPS_INDEX` = 24u;
public const val `NUMFONTS`: `GET_DEVICE_CAPS_INDEX` = 22u;
public const val `NUMMARKERS`: `GET_DEVICE_CAPS_INDEX` = 20u;
public const val `NUMPENS`: `GET_DEVICE_CAPS_INDEX` = 18u;
public const val `NUMRESERVED`: `GET_DEVICE_CAPS_INDEX` = 106u;
public const val `OBJ_BITMAP`: `OBJ_TYPE` = 7;
public const val `OBJ_BRUSH`: `OBJ_TYPE` = 2;
public const val `OBJ_COLORSPACE`: `OBJ_TYPE` = 14;
public const val `OBJ_DC`: `OBJ_TYPE` = 3;
public const val `OBJ_ENHMETADC`: `OBJ_TYPE` = 12;
public const val `OBJ_ENHMETAFILE`: `OBJ_TYPE` = 13;
public const val `OBJ_EXTPEN`: `OBJ_TYPE` = 11;
public const val `OBJ_FONT`: `OBJ_TYPE` = 6;
public const val `OBJ_MEMDC`: `OBJ_TYPE` = 10;
public const val `OBJ_METADC`: `OBJ_TYPE` = 4;
public const val `OBJ_METAFILE`: `OBJ_TYPE` = 9;
public const val `OBJ_PAL`: `OBJ_TYPE` = 5;
public const val `OBJ_PEN`: `OBJ_TYPE` = 1;
public const val `OBJ_REGION`: `OBJ_TYPE` = 8;
public typealias `OBJ_TYPE` = Int;
public const val `OEM_CHARSET`: `FONT_CHARSET` = 255u;
public const val `OEM_FIXED_FONT`: `GET_STOCK_OBJECT_FLAGS` = 10;
public const val `OPAQUE`: `BACKGROUND_MODE` = 2u;
public const val `OPENCHANNEL`: UInt = 4110u;
// UNSUPPORTED Rust 3346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OUTLINETEXTMETRICA {
//     pub otmSize: u32,
//     pub otmTextMetrics: TEXTMETRICA,
//     pub otmFiller: u8,
//     pub otmPanoseNumber: PANOSE,
//     pub otmfsSelection: u32,
//     pub otmfsType: u32,
//     pub otmsCharSlopeRise: i32,
//     pub otmsCharSlopeRun: i32,
//     pub otmItalicAngle: i32,
//     pub otmEMSquare: u32,
//     pub otmAscent: i32,
//     pub otmDescent: i32,
//     pub otmLineGap: u32,
//     pub otmsCapEmHeight: u32,
//     pub otmsXHeight: u32,
//     pub otmrcFontBox: super::super::Foundation::RECT,
//     pub otmMacAscent: i32,
//     pub otmMacDescent: i32,
//     pub otmMacLineGap: u32,
//     pub otmusMinimumPPEM: u32,
//     pub otmptSubscriptSize: super::super::Foundation::POINT,
//     pub otmptSubscriptOffset: super::super::Foundation::POINT,
//     pub otmptSuperscriptSize: super::super::Foundation::POINT,
//     pub otmptSuperscriptOffset: super::super::Foundation::POINT,
//     pub otmsStrikeoutSize: u32,
//     pub otmsStrikeoutPosition: i32,
//     pub otmsUnderscoreSize: i32,
//     pub otmsUnderscorePosition: i32,
//     pub otmpFamilyName: windows_sys::core::PSTR,
//     pub otmpFaceName: windows_sys::core::PSTR,
//     pub otmpStyleName: windows_sys::core::PSTR,
//     pub otmpFullName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3382:1: declaration Impl has no candidate rule
// impl Default for OUTLINETEXTMETRICA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3387:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OUTLINETEXTMETRICW {
//     pub otmSize: u32,
//     pub otmTextMetrics: TEXTMETRICW,
//     pub otmFiller: u8,
//     pub otmPanoseNumber: PANOSE,
//     pub otmfsSelection: u32,
//     pub otmfsType: u32,
//     pub otmsCharSlopeRise: i32,
//     pub otmsCharSlopeRun: i32,
//     pub otmItalicAngle: i32,
//     pub otmEMSquare: u32,
//     pub otmAscent: i32,
//     pub otmDescent: i32,
//     pub otmLineGap: u32,
//     pub otmsCapEmHeight: u32,
//     pub otmsXHeight: u32,
//     pub otmrcFontBox: super::super::Foundation::RECT,
//     pub otmMacAscent: i32,
//     pub otmMacDescent: i32,
//     pub otmMacLineGap: u32,
//     pub otmusMinimumPPEM: u32,
//     pub otmptSubscriptSize: super::super::Foundation::POINT,
//     pub otmptSubscriptOffset: super::super::Foundation::POINT,
//     pub otmptSuperscriptSize: super::super::Foundation::POINT,
//     pub otmptSuperscriptOffset: super::super::Foundation::POINT,
//     pub otmsStrikeoutSize: u32,
//     pub otmsStrikeoutPosition: i32,
//     pub otmsUnderscoreSize: i32,
//     pub otmsUnderscorePosition: i32,
//     pub otmpFamilyName: windows_sys::core::PSTR,
//     pub otmpFaceName: windows_sys::core::PSTR,
//     pub otmpStyleName: windows_sys::core::PSTR,
//     pub otmpFullName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3423:1: declaration Impl has no candidate rule
// impl Default for OUTLINETEXTMETRICW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OUT_CHARACTER_PRECIS`: `FONT_OUTPUT_PRECISION` = 2u;
public const val `OUT_DEFAULT_PRECIS`: `FONT_OUTPUT_PRECISION` = 0u;
public const val `OUT_DEVICE_PRECIS`: `FONT_OUTPUT_PRECISION` = 5u;
public const val `OUT_OUTLINE_PRECIS`: `FONT_OUTPUT_PRECISION` = 8u;
public const val `OUT_PS_ONLY_PRECIS`: `FONT_OUTPUT_PRECISION` = 10u;
public const val `OUT_RASTER_PRECIS`: `FONT_OUTPUT_PRECISION` = 6u;
public const val `OUT_SCREEN_OUTLINE_PRECIS`: `FONT_OUTPUT_PRECISION` = 9u;
public const val `OUT_STRING_PRECIS`: `FONT_OUTPUT_PRECISION` = 1u;
public const val `OUT_STROKE_PRECIS`: `FONT_OUTPUT_PRECISION` = 3u;
public const val `OUT_TT_ONLY_PRECIS`: `FONT_OUTPUT_PRECISION` = 7u;
public const val `OUT_TT_PRECIS`: `FONT_OUTPUT_PRECISION` = 4u;
// UNSUPPORTED Rust 3439:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PAINTSTRUCT {
//     pub hdc: HDC,
//     pub fErase: windows_sys::core::BOOL,
//     pub rcPaint: super::super::Foundation::RECT,
//     pub fRestore: windows_sys::core::BOOL,
//     pub fIncUpdate: windows_sys::core::BOOL,
//     pub rgbReserved: [u8; 32],
// }

// UNSUPPORTED Rust 3449:1: declaration Impl has no candidate rule
// impl Default for PAINTSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PALETTEENTRY {
//     pub peRed: u8,
//     pub peGreen: u8,
//     pub peBlue: u8,
//     pub peFlags: u8,
// }

// UNSUPPORTED Rust 3462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PANOSE {
//     pub bFamilyType: PAN_FAMILY_TYPE,
//     pub bSerifStyle: PAN_SERIF_STYLE,
//     pub bWeight: PAN_WEIGHT,
//     pub bProportion: PAN_PROPORTION,
//     pub bContrast: PAN_CONTRAST,
//     pub bStrokeVariation: PAN_STROKE_VARIATION,
//     pub bArmStyle: PAN_ARM_STYLE,
//     pub bLetterform: PAN_LETT_FORM,
//     pub bMidline: PAN_MIDLINE,
//     pub bXHeight: PAN_XHEIGHT,
// }

public const val `PANOSE_COUNT`: UInt = 10u;
public const val `PAN_ANY`: UInt = 0u;
public const val `PAN_ARMSTYLE_INDEX`: UInt = 6u;
public const val `PAN_ARM_ANY`: `PAN_ARM_STYLE` = 0u;
public const val `PAN_ARM_NO_FIT`: `PAN_ARM_STYLE` = 1u;
public typealias `PAN_ARM_STYLE` = UByte;
public const val `PAN_BENT_ARMS_DOUBLE_SERIF`: `PAN_ARM_STYLE` = 11u;
public const val `PAN_BENT_ARMS_HORZ`: `PAN_ARM_STYLE` = 7u;
public const val `PAN_BENT_ARMS_SINGLE_SERIF`: `PAN_ARM_STYLE` = 10u;
public const val `PAN_BENT_ARMS_VERT`: `PAN_ARM_STYLE` = 9u;
public const val `PAN_BENT_ARMS_WEDGE`: `PAN_ARM_STYLE` = 8u;
public typealias `PAN_CONTRAST` = UByte;
public const val `PAN_CONTRAST_ANY`: `PAN_CONTRAST` = 0u;
public const val `PAN_CONTRAST_HIGH`: `PAN_CONTRAST` = 8u;
public const val `PAN_CONTRAST_INDEX`: `PAN_CONTRAST` = 4u;
public const val `PAN_CONTRAST_LOW`: `PAN_CONTRAST` = 4u;
public const val `PAN_CONTRAST_MEDIUM`: `PAN_CONTRAST` = 6u;
public const val `PAN_CONTRAST_MEDIUM_HIGH`: `PAN_CONTRAST` = 7u;
public const val `PAN_CONTRAST_MEDIUM_LOW`: `PAN_CONTRAST` = 5u;
public const val `PAN_CONTRAST_NONE`: `PAN_CONTRAST` = 2u;
public const val `PAN_CONTRAST_NO_FIT`: `PAN_CONTRAST` = 1u;
public const val `PAN_CONTRAST_VERY_HIGH`: `PAN_CONTRAST` = 9u;
public const val `PAN_CONTRAST_VERY_LOW`: `PAN_CONTRAST` = 3u;
public const val `PAN_CULTURE_LATIN`: UInt = 0u;
public const val `PAN_FAMILYTYPE_INDEX`: UInt = 0u;
public const val `PAN_FAMILY_ANY`: `PAN_FAMILY_TYPE` = 0u;
public const val `PAN_FAMILY_DECORATIVE`: `PAN_FAMILY_TYPE` = 4u;
public const val `PAN_FAMILY_NO_FIT`: `PAN_FAMILY_TYPE` = 1u;
public const val `PAN_FAMILY_PICTORIAL`: `PAN_FAMILY_TYPE` = 5u;
public const val `PAN_FAMILY_SCRIPT`: `PAN_FAMILY_TYPE` = 3u;
public const val `PAN_FAMILY_TEXT_DISPLAY`: `PAN_FAMILY_TYPE` = 2u;
public typealias `PAN_FAMILY_TYPE` = UByte;
public const val `PAN_LETTERFORM_INDEX`: UInt = 7u;
public typealias `PAN_LETT_FORM` = UByte;
public const val `PAN_LETT_FORM_ANY`: `PAN_LETT_FORM` = 0u;
public const val `PAN_LETT_FORM_NO_FIT`: `PAN_LETT_FORM` = 1u;
public const val `PAN_LETT_NORMAL_BOXED`: `PAN_LETT_FORM` = 4u;
public const val `PAN_LETT_NORMAL_CONTACT`: `PAN_LETT_FORM` = 2u;
public const val `PAN_LETT_NORMAL_FLATTENED`: `PAN_LETT_FORM` = 5u;
public const val `PAN_LETT_NORMAL_OFF_CENTER`: `PAN_LETT_FORM` = 7u;
public const val `PAN_LETT_NORMAL_ROUNDED`: `PAN_LETT_FORM` = 6u;
public const val `PAN_LETT_NORMAL_SQUARE`: `PAN_LETT_FORM` = 8u;
public const val `PAN_LETT_NORMAL_WEIGHTED`: `PAN_LETT_FORM` = 3u;
public const val `PAN_LETT_OBLIQUE_BOXED`: `PAN_LETT_FORM` = 11u;
public const val `PAN_LETT_OBLIQUE_CONTACT`: `PAN_LETT_FORM` = 9u;
public const val `PAN_LETT_OBLIQUE_FLATTENED`: `PAN_LETT_FORM` = 12u;
public const val `PAN_LETT_OBLIQUE_OFF_CENTER`: `PAN_LETT_FORM` = 14u;
public const val `PAN_LETT_OBLIQUE_ROUNDED`: `PAN_LETT_FORM` = 13u;
public const val `PAN_LETT_OBLIQUE_SQUARE`: `PAN_LETT_FORM` = 15u;
public const val `PAN_LETT_OBLIQUE_WEIGHTED`: `PAN_LETT_FORM` = 10u;
public typealias `PAN_MIDLINE` = UByte;
public const val `PAN_MIDLINE_ANY`: `PAN_MIDLINE` = 0u;
public const val `PAN_MIDLINE_CONSTANT_POINTED`: `PAN_MIDLINE` = 9u;
public const val `PAN_MIDLINE_CONSTANT_SERIFED`: `PAN_MIDLINE` = 10u;
public const val `PAN_MIDLINE_CONSTANT_TRIMMED`: `PAN_MIDLINE` = 8u;
public const val `PAN_MIDLINE_HIGH_POINTED`: `PAN_MIDLINE` = 6u;
public const val `PAN_MIDLINE_HIGH_SERIFED`: `PAN_MIDLINE` = 7u;
public const val `PAN_MIDLINE_HIGH_TRIMMED`: `PAN_MIDLINE` = 5u;
public const val `PAN_MIDLINE_INDEX`: `PAN_MIDLINE` = 8u;
public const val `PAN_MIDLINE_LOW_POINTED`: `PAN_MIDLINE` = 12u;
public const val `PAN_MIDLINE_LOW_SERIFED`: `PAN_MIDLINE` = 13u;
public const val `PAN_MIDLINE_LOW_TRIMMED`: `PAN_MIDLINE` = 11u;
public const val `PAN_MIDLINE_NO_FIT`: `PAN_MIDLINE` = 1u;
public const val `PAN_MIDLINE_STANDARD_POINTED`: `PAN_MIDLINE` = 3u;
public const val `PAN_MIDLINE_STANDARD_SERIFED`: `PAN_MIDLINE` = 4u;
public const val `PAN_MIDLINE_STANDARD_TRIMMED`: `PAN_MIDLINE` = 2u;
public const val `PAN_NO_FIT`: UInt = 1u;
public typealias `PAN_PROPORTION` = UByte;
public const val `PAN_PROPORTION_INDEX`: UInt = 3u;
public const val `PAN_PROP_ANY`: `PAN_PROPORTION` = 0u;
public const val `PAN_PROP_CONDENSED`: `PAN_PROPORTION` = 6u;
public const val `PAN_PROP_EVEN_WIDTH`: `PAN_PROPORTION` = 4u;
public const val `PAN_PROP_EXPANDED`: `PAN_PROPORTION` = 5u;
public const val `PAN_PROP_MODERN`: `PAN_PROPORTION` = 3u;
public const val `PAN_PROP_MONOSPACED`: `PAN_PROPORTION` = 9u;
public const val `PAN_PROP_NO_FIT`: `PAN_PROPORTION` = 1u;
public const val `PAN_PROP_OLD_STYLE`: `PAN_PROPORTION` = 2u;
public const val `PAN_PROP_VERY_CONDENSED`: `PAN_PROPORTION` = 8u;
public const val `PAN_PROP_VERY_EXPANDED`: `PAN_PROPORTION` = 7u;
public const val `PAN_SERIFSTYLE_INDEX`: UInt = 1u;
public const val `PAN_SERIF_ANY`: `PAN_SERIF_STYLE` = 0u;
public const val `PAN_SERIF_BONE`: `PAN_SERIF_STYLE` = 8u;
public const val `PAN_SERIF_COVE`: `PAN_SERIF_STYLE` = 2u;
public const val `PAN_SERIF_EXAGGERATED`: `PAN_SERIF_STYLE` = 9u;
public const val `PAN_SERIF_FLARED`: `PAN_SERIF_STYLE` = 14u;
public const val `PAN_SERIF_NORMAL_SANS`: `PAN_SERIF_STYLE` = 11u;
public const val `PAN_SERIF_NO_FIT`: `PAN_SERIF_STYLE` = 1u;
public const val `PAN_SERIF_OBTUSE_COVE`: `PAN_SERIF_STYLE` = 3u;
public const val `PAN_SERIF_OBTUSE_SANS`: `PAN_SERIF_STYLE` = 12u;
public const val `PAN_SERIF_OBTUSE_SQUARE_COVE`: `PAN_SERIF_STYLE` = 5u;
public const val `PAN_SERIF_PERP_SANS`: `PAN_SERIF_STYLE` = 13u;
public const val `PAN_SERIF_ROUNDED`: `PAN_SERIF_STYLE` = 15u;
public const val `PAN_SERIF_SQUARE`: `PAN_SERIF_STYLE` = 6u;
public const val `PAN_SERIF_SQUARE_COVE`: `PAN_SERIF_STYLE` = 4u;
public typealias `PAN_SERIF_STYLE` = UByte;
public const val `PAN_SERIF_THIN`: `PAN_SERIF_STYLE` = 7u;
public const val `PAN_SERIF_TRIANGLE`: `PAN_SERIF_STYLE` = 10u;
public const val `PAN_STRAIGHT_ARMS_DOUBLE_SERIF`: `PAN_ARM_STYLE` = 6u;
public const val `PAN_STRAIGHT_ARMS_HORZ`: `PAN_ARM_STYLE` = 2u;
public const val `PAN_STRAIGHT_ARMS_SINGLE_SERIF`: `PAN_ARM_STYLE` = 5u;
public const val `PAN_STRAIGHT_ARMS_VERT`: `PAN_ARM_STYLE` = 4u;
public const val `PAN_STRAIGHT_ARMS_WEDGE`: `PAN_ARM_STYLE` = 3u;
public const val `PAN_STROKEVARIATION_INDEX`: UInt = 5u;
public const val `PAN_STROKE_ANY`: `PAN_STROKE_VARIATION` = 0u;
public const val `PAN_STROKE_GRADUAL_DIAG`: `PAN_STROKE_VARIATION` = 2u;
public const val `PAN_STROKE_GRADUAL_HORZ`: `PAN_STROKE_VARIATION` = 5u;
public const val `PAN_STROKE_GRADUAL_TRAN`: `PAN_STROKE_VARIATION` = 3u;
public const val `PAN_STROKE_GRADUAL_VERT`: `PAN_STROKE_VARIATION` = 4u;
public const val `PAN_STROKE_INSTANT_VERT`: `PAN_STROKE_VARIATION` = 8u;
public const val `PAN_STROKE_NO_FIT`: `PAN_STROKE_VARIATION` = 1u;
public const val `PAN_STROKE_RAPID_HORZ`: `PAN_STROKE_VARIATION` = 7u;
public const val `PAN_STROKE_RAPID_VERT`: `PAN_STROKE_VARIATION` = 6u;
public typealias `PAN_STROKE_VARIATION` = UByte;
public typealias `PAN_WEIGHT` = UByte;
public const val `PAN_WEIGHT_ANY`: `PAN_WEIGHT` = 0u;
public const val `PAN_WEIGHT_BLACK`: `PAN_WEIGHT` = 10u;
public const val `PAN_WEIGHT_BOLD`: `PAN_WEIGHT` = 8u;
public const val `PAN_WEIGHT_BOOK`: `PAN_WEIGHT` = 5u;
public const val `PAN_WEIGHT_DEMI`: `PAN_WEIGHT` = 7u;
public const val `PAN_WEIGHT_HEAVY`: `PAN_WEIGHT` = 9u;
public const val `PAN_WEIGHT_INDEX`: `PAN_WEIGHT` = 2u;
public const val `PAN_WEIGHT_LIGHT`: `PAN_WEIGHT` = 3u;
public const val `PAN_WEIGHT_MEDIUM`: `PAN_WEIGHT` = 6u;
public const val `PAN_WEIGHT_NORD`: `PAN_WEIGHT` = 11u;
public const val `PAN_WEIGHT_NO_FIT`: `PAN_WEIGHT` = 1u;
public const val `PAN_WEIGHT_THIN`: `PAN_WEIGHT` = 4u;
public const val `PAN_WEIGHT_VERY_LIGHT`: `PAN_WEIGHT` = 2u;
public typealias `PAN_XHEIGHT` = UByte;
public const val `PAN_XHEIGHT_ANY`: `PAN_XHEIGHT` = 0u;
public const val `PAN_XHEIGHT_CONSTANT_LARGE`: `PAN_XHEIGHT` = 4u;
public const val `PAN_XHEIGHT_CONSTANT_SMALL`: `PAN_XHEIGHT` = 2u;
public const val `PAN_XHEIGHT_CONSTANT_STD`: `PAN_XHEIGHT` = 3u;
public const val `PAN_XHEIGHT_DUCKING_LARGE`: `PAN_XHEIGHT` = 7u;
public const val `PAN_XHEIGHT_DUCKING_SMALL`: `PAN_XHEIGHT` = 5u;
public const val `PAN_XHEIGHT_DUCKING_STD`: `PAN_XHEIGHT` = 6u;
public const val `PAN_XHEIGHT_INDEX`: `PAN_XHEIGHT` = 9u;
public const val `PAN_XHEIGHT_NO_FIT`: `PAN_XHEIGHT` = 1u;
public const val `PASSTHROUGH`: UInt = 19u;
public const val `PATCOPY`: `ROP_CODE` = 15728673u;
public const val `PATINVERT`: `ROP_CODE` = 5898313u;
public const val `PATPAINT`: `ROP_CODE` = 16452105u;
public const val `PC_EXPLICIT`: UInt = 2u;
public const val `PC_INTERIORS`: UInt = 128u;
public const val `PC_NOCOLLAPSE`: UInt = 4u;
public const val `PC_NONE`: UInt = 0u;
public const val `PC_PATHS`: UInt = 512u;
public const val `PC_POLYGON`: UInt = 1u;
public const val `PC_POLYPOLYGON`: UInt = 256u;
public const val `PC_RECTANGLE`: UInt = 2u;
public const val `PC_RESERVED`: UInt = 1u;
public const val `PC_SCANLINE`: UInt = 8u;
public const val `PC_STYLED`: UInt = 32u;
public const val `PC_TRAPEZOID`: UInt = 4u;
public const val `PC_WIDE`: UInt = 16u;
public const val `PC_WIDESTYLED`: UInt = 64u;
public const val `PC_WINDPOLYGON`: UInt = 4u;
public const val `PDEVICESIZE`: `GET_DEVICE_CAPS_INDEX` = 26u;
// UNSUPPORTED Rust 3633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PELARRAY {
//     pub paXCount: i32,
//     pub paYCount: i32,
//     pub paXExt: i32,
//     pub paYExt: i32,
//     pub paRGBs: u8,
// }

public typealias `PEN_STYLE` = Int;
public const val `PHYSICALHEIGHT`: `GET_DEVICE_CAPS_INDEX` = 111u;
public const val `PHYSICALOFFSETX`: `GET_DEVICE_CAPS_INDEX` = 112u;
public const val `PHYSICALOFFSETY`: `GET_DEVICE_CAPS_INDEX` = 113u;
public const val `PHYSICALWIDTH`: `GET_DEVICE_CAPS_INDEX` = 110u;
public const val `PLANES`: `GET_DEVICE_CAPS_INDEX` = 14u;
// UNSUPPORTED Rust 3648:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POINTFX {
//     pub x: FIXED,
//     pub y: FIXED,
// }

public const val `POLYFILL_LAST`: UInt = 2u;
public const val `POLYGONALCAPS`: `GET_DEVICE_CAPS_INDEX` = 32u;
// UNSUPPORTED Rust 3656:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLYTEXTA {
//     pub x: i32,
//     pub y: i32,
//     pub n: u32,
//     pub lpstr: windows_sys::core::PCSTR,
//     pub uiFlags: u32,
//     pub rcl: super::super::Foundation::RECT,
//     pub pdx: *mut i32,
// }

// UNSUPPORTED Rust 3667:1: declaration Impl has no candidate rule
// impl Default for POLYTEXTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3672:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLYTEXTW {
//     pub x: i32,
//     pub y: i32,
//     pub n: u32,
//     pub lpstr: windows_sys::core::PCWSTR,
//     pub uiFlags: u32,
//     pub rcl: super::super::Foundation::RECT,
//     pub pdx: *mut i32,
// }

// UNSUPPORTED Rust 3683:1: declaration Impl has no candidate rule
// impl Default for POLYTEXTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `POSTSCRIPT_DATA`: UInt = 37u;
public const val `POSTSCRIPT_IDENTIFY`: UInt = 4117u;
public const val `POSTSCRIPT_IGNORE`: UInt = 38u;
public const val `POSTSCRIPT_INJECTION`: UInt = 4118u;
public const val `POSTSCRIPT_PASSTHROUGH`: UInt = 4115u;
public const val `PRINTRATEUNIT_CPS`: UInt = 2u;
public const val `PRINTRATEUNIT_IPM`: UInt = 4u;
public const val `PRINTRATEUNIT_LPM`: UInt = 3u;
public const val `PRINTRATEUNIT_PPM`: UInt = 1u;
public const val `PROOF_QUALITY`: `FONT_QUALITY` = 2u;
public const val `PR_JOBSTATUS`: UInt = 0u;
public const val `PSIDENT_GDICENTRIC`: UInt = 0u;
public const val `PSIDENT_PSCENTRIC`: UInt = 1u;
public const val `PSINJECT_DLFONT`: UInt = 3722304989u;
public const val `PSPROTOCOL_ASCII`: UInt = 0u;
public const val `PSPROTOCOL_BCP`: UInt = 1u;
public const val `PSPROTOCOL_BINARY`: UInt = 3u;
public const val `PSPROTOCOL_TBCP`: UInt = 2u;
public const val `PS_ALTERNATE`: `PEN_STYLE` = 8;
public const val `PS_COSMETIC`: `PEN_STYLE` = 0;
public const val `PS_DASH`: `PEN_STYLE` = 1;
public const val `PS_DASHDOT`: `PEN_STYLE` = 3;
public const val `PS_DASHDOTDOT`: `PEN_STYLE` = 4;
public const val `PS_DOT`: `PEN_STYLE` = 2;
public const val `PS_ENDCAP_FLAT`: `PEN_STYLE` = 512;
public const val `PS_ENDCAP_MASK`: `PEN_STYLE` = 3840;
public const val `PS_ENDCAP_ROUND`: `PEN_STYLE` = 0;
public const val `PS_ENDCAP_SQUARE`: `PEN_STYLE` = 256;
public const val `PS_GEOMETRIC`: `PEN_STYLE` = 65536;
public const val `PS_INSIDEFRAME`: `PEN_STYLE` = 6;
public const val `PS_JOIN_BEVEL`: `PEN_STYLE` = 4096;
public const val `PS_JOIN_MASK`: `PEN_STYLE` = 61440;
public const val `PS_JOIN_MITER`: `PEN_STYLE` = 8192;
public const val `PS_JOIN_ROUND`: `PEN_STYLE` = 0;
public const val `PS_NULL`: `PEN_STYLE` = 5;
public const val `PS_SOLID`: `PEN_STYLE` = 0;
public const val `PS_STYLE_MASK`: `PEN_STYLE` = 15;
public const val `PS_TYPE_MASK`: `PEN_STYLE` = 983040;
public const val `PS_USERSTYLE`: `PEN_STYLE` = 7;
public const val `PT_BEZIERTO`: UInt = 4u;
public const val `PT_CLOSEFIGURE`: UInt = 1u;
public const val `PT_LINETO`: UInt = 2u;
public const val `PT_MOVETO`: UInt = 6u;
public const val `QDI_DIBTOSCREEN`: UInt = 4u;
public const val `QDI_GETDIBITS`: UInt = 2u;
public const val `QDI_SETDIBITS`: UInt = 1u;
public const val `QDI_STRETCHDIB`: UInt = 8u;
public const val `QUERYDIBSUPPORT`: UInt = 3073u;
public const val `QUERYESCSUPPORT`: UInt = 8u;
public const val `QUERYROPSUPPORT`: UInt = 40u;
public const val `R2_BLACK`: `R2_MODE` = 1;
public const val `R2_COPYPEN`: `R2_MODE` = 13;
public const val `R2_LAST`: `R2_MODE` = 16;
public const val `R2_MASKNOTPEN`: `R2_MODE` = 3;
public const val `R2_MASKPEN`: `R2_MODE` = 9;
public const val `R2_MASKPENNOT`: `R2_MODE` = 5;
public const val `R2_MERGENOTPEN`: `R2_MODE` = 12;
public const val `R2_MERGEPEN`: `R2_MODE` = 15;
public const val `R2_MERGEPENNOT`: `R2_MODE` = 14;
public typealias `R2_MODE` = Int;
public const val `R2_NOP`: `R2_MODE` = 11;
public const val `R2_NOT`: `R2_MODE` = 6;
public const val `R2_NOTCOPYPEN`: `R2_MODE` = 4;
public const val `R2_NOTMASKPEN`: `R2_MODE` = 8;
public const val `R2_NOTMERGEPEN`: `R2_MODE` = 2;
public const val `R2_NOTXORPEN`: `R2_MODE` = 10;
public const val `R2_WHITE`: `R2_MODE` = 16;
public const val `R2_XORPEN`: `R2_MODE` = 7;
public const val `RASTERCAPS`: `GET_DEVICE_CAPS_INDEX` = 38u;
// UNSUPPORTED Rust 3757:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RASTERIZER_STATUS {
//     pub nSize: i16,
//     pub wFlags: i16,
//     pub nLanguageID: i16,
// }

public const val `RASTER_FONTTYPE`: UInt = 1u;
public const val `RC_BANDING`: UInt = 2u;
public const val `RC_BIGFONT`: UInt = 1024u;
public const val `RC_BITBLT`: UInt = 1u;
public const val `RC_BITMAP64`: UInt = 8u;
public const val `RC_DEVBITS`: UInt = 32768u;
public const val `RC_DIBTODEV`: UInt = 512u;
public const val `RC_DI_BITMAP`: UInt = 128u;
public const val `RC_FLOODFILL`: UInt = 4096u;
public const val `RC_GDI20_OUTPUT`: UInt = 16u;
public const val `RC_GDI20_STATE`: UInt = 32u;
public const val `RC_OP_DX_OUTPUT`: UInt = 16384u;
public const val `RC_PALETTE`: UInt = 256u;
public const val `RC_SAVEBITMAP`: UInt = 64u;
public const val `RC_SCALING`: UInt = 4u;
public const val `RC_STRETCHBLT`: UInt = 2048u;
public const val `RC_STRETCHDIB`: UInt = 8192u;
public const val `RDH_RECTANGLES`: UInt = 1u;
public const val `RDW_ALLCHILDREN`: `REDRAW_WINDOW_FLAGS` = 128u;
public const val `RDW_ERASE`: `REDRAW_WINDOW_FLAGS` = 4u;
public const val `RDW_ERASENOW`: `REDRAW_WINDOW_FLAGS` = 512u;
public const val `RDW_FRAME`: `REDRAW_WINDOW_FLAGS` = 1024u;
public const val `RDW_INTERNALPAINT`: `REDRAW_WINDOW_FLAGS` = 2u;
public const val `RDW_INVALIDATE`: `REDRAW_WINDOW_FLAGS` = 1u;
public const val `RDW_NOCHILDREN`: `REDRAW_WINDOW_FLAGS` = 64u;
public const val `RDW_NOERASE`: `REDRAW_WINDOW_FLAGS` = 32u;
public const val `RDW_NOFRAME`: `REDRAW_WINDOW_FLAGS` = 2048u;
public const val `RDW_NOINTERNALPAINT`: `REDRAW_WINDOW_FLAGS` = 16u;
public const val `RDW_UPDATENOW`: `REDRAW_WINDOW_FLAGS` = 256u;
public const val `RDW_VALIDATE`: `REDRAW_WINDOW_FLAGS` = 8u;
// UNSUPPORTED Rust 3794:1: generic scalar type unsupported
// pub type READEMBEDPROC = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: *mut core::ffi::c_void, param2: u32) -> u32>;

public typealias `REDRAW_WINDOW_FLAGS` = UInt;
public const val `RELATIVE`: UInt = 2u;
public const val `RESTORE_CTM`: UInt = 4100u;
// UNSUPPORTED Rust 3798:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RGBQUAD {
//     pub rgbBlue: u8,
//     pub rgbGreen: u8,
//     pub rgbRed: u8,
//     pub rgbReserved: u8,
// }

// UNSUPPORTED Rust 3806:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RGBTRIPLE {
//     pub rgbtBlue: u8,
//     pub rgbtGreen: u8,
//     pub rgbtRed: u8,
// }

// UNSUPPORTED Rust 3813:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RGNDATA {
//     pub rdh: RGNDATAHEADER,
//     pub Buffer: [i8; 1],
// }

// UNSUPPORTED Rust 3819:1: declaration Impl has no candidate rule
// impl Default for RGNDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RGNDATAHEADER {
//     pub dwSize: u32,
//     pub iType: u32,
//     pub nCount: u32,
//     pub nRgnSize: u32,
//     pub rcBound: super::super::Foundation::RECT,
// }

public const val `RGN_AND`: `RGN_COMBINE_MODE` = 1;
public typealias `RGN_COMBINE_MODE` = Int;
public const val `RGN_COPY`: `RGN_COMBINE_MODE` = 5;
public const val `RGN_DIFF`: `RGN_COMBINE_MODE` = 4;
public const val `RGN_ERROR`: `GDI_REGION_TYPE` = 0;
public const val `RGN_MAX`: `RGN_COMBINE_MODE` = 5;
public const val `RGN_MIN`: `RGN_COMBINE_MODE` = 1;
public const val `RGN_OR`: `RGN_COMBINE_MODE` = 2;
public const val `RGN_XOR`: `RGN_COMBINE_MODE` = 3;
public typealias `ROP_CODE` = UInt;
public const val `RUSSIAN_CHARSET`: `FONT_CHARSET` = 204u;
public const val `SAVE_CTM`: UInt = 4101u;
public const val `SB_CONST_ALPHA`: UInt = 1u;
public const val `SB_GRAD_RECT`: UInt = 16u;
public const val `SB_GRAD_TRI`: UInt = 32u;
public const val `SB_NONE`: UInt = 0u;
public const val `SB_PIXEL_ALPHA`: UInt = 2u;
public const val `SB_PREMULT_ALPHA`: UInt = 4u;
public const val `SCALINGFACTORX`: `GET_DEVICE_CAPS_INDEX` = 114u;
public const val `SCALINGFACTORY`: `GET_DEVICE_CAPS_INDEX` = 115u;
public const val `SC_SCREENSAVE`: UInt = 61760u;
public const val `SELECTDIB`: UInt = 41u;
public const val `SELECTPAPERSOURCE`: UInt = 18u;
public const val `SETABORTPROC`: UInt = 9u;
public const val `SETALLJUSTVALUES`: UInt = 771u;
public const val `SETCHARSET`: UInt = 772u;
public const val `SETCOLORTABLE`: UInt = 4u;
public const val `SETCOPYCOUNT`: UInt = 17u;
public const val `SETDIBSCALING`: UInt = 32u;
public const val `SETICMPROFILE_EMBEDED`: UInt = 1u;
public const val `SETKERNTRACK`: UInt = 770u;
public const val `SETLINECAP`: UInt = 21u;
public const val `SETLINEJOIN`: UInt = 22u;
public const val `SETMITERLIMIT`: UInt = 23u;
public const val `SET_ARC_DIRECTION`: UInt = 4102u;
public const val `SET_BACKGROUND_COLOR`: UInt = 4103u;
public const val `SET_BOUNDS`: UInt = 4109u;
public typealias `SET_BOUNDS_RECT_FLAGS` = UInt;
public const val `SET_CLIP_BOX`: UInt = 4108u;
public const val `SET_MIRROR_MODE`: UInt = 4110u;
public const val `SET_POLY_MODE`: UInt = 4104u;
public const val `SET_SCREEN_ANGLE`: UInt = 4105u;
public const val `SET_SPREAD`: UInt = 4106u;
public const val `SHADEBLENDCAPS`: `GET_DEVICE_CAPS_INDEX` = 120u;
public const val `SHIFTJIS_CHARSET`: `FONT_CHARSET` = 128u;
public const val `SIMPLEREGION`: `GDI_REGION_TYPE` = 2;
public const val `SIZEPALETTE`: `GET_DEVICE_CAPS_INDEX` = 104u;
public const val `SPCLPASSTHROUGH2`: UInt = 4568u;
public const val `SP_APPABORT`: Int = -2;
public const val `SP_ERROR`: Int = -1;
public const val `SP_NOTREPORTED`: UInt = 16384u;
public const val `SP_OUTOFDISK`: Int = -4;
public const val `SP_OUTOFMEMORY`: Int = -5;
public const val `SP_USERABORT`: Int = -3;
public const val `SRCAND`: `ROP_CODE` = 8913094u;
public const val `SRCCOPY`: `ROP_CODE` = 13369376u;
public const val `SRCERASE`: `ROP_CODE` = 4457256u;
public const val `SRCINVERT`: `ROP_CODE` = 6684742u;
public const val `SRCPAINT`: `ROP_CODE` = 15597702u;
public const val `STARTDOC`: UInt = 10u;
public const val `STOCK_LAST`: UInt = 19u;
public const val `STRETCHBLT`: UInt = 2048u;
public const val `STRETCH_ANDSCANS`: `STRETCH_BLT_MODE` = 1;
public typealias `STRETCH_BLT_MODE` = Int;
public const val `STRETCH_DELETESCANS`: `STRETCH_BLT_MODE` = 3;
public const val `STRETCH_HALFTONE`: `STRETCH_BLT_MODE` = 4;
public const val `STRETCH_ORSCANS`: `STRETCH_BLT_MODE` = 2;
public const val `SYMBOL_CHARSET`: `FONT_CHARSET` = 2u;
public const val `SYSPAL_ERROR`: UInt = 0u;
public const val `SYSPAL_NOSTATIC`: `SYSTEM_PALETTE_USE` = 2u;
public const val `SYSPAL_NOSTATIC256`: `SYSTEM_PALETTE_USE` = 3u;
public const val `SYSPAL_STATIC`: `SYSTEM_PALETTE_USE` = 1u;
public const val `SYSRGN`: UInt = 4u;
public const val `SYSTEM_FIXED_FONT`: `GET_STOCK_OBJECT_FLAGS` = 16;
public const val `SYSTEM_FONT`: `GET_STOCK_OBJECT_FLAGS` = 13;
public typealias `SYSTEM_PALETTE_USE` = UInt;
public typealias `SYS_COLOR_INDEX` = Int;
public const val `TA_BASELINE`: `TEXT_ALIGN_OPTIONS` = 24u;
public const val `TA_BOTTOM`: `TEXT_ALIGN_OPTIONS` = 8u;
public const val `TA_CENTER`: `TEXT_ALIGN_OPTIONS` = 6u;
public const val `TA_LEFT`: `TEXT_ALIGN_OPTIONS` = 0u;
public const val `TA_MASK`: `TEXT_ALIGN_OPTIONS` = 287u;
public const val `TA_NOUPDATECP`: `TEXT_ALIGN_OPTIONS` = 0u;
public const val `TA_RIGHT`: `TEXT_ALIGN_OPTIONS` = 2u;
public const val `TA_RTLREADING`: `TEXT_ALIGN_OPTIONS` = 256u;
public const val `TA_TOP`: `TEXT_ALIGN_OPTIONS` = 0u;
public const val `TA_UPDATECP`: `TEXT_ALIGN_OPTIONS` = 1u;
public const val `TC_CP_STROKE`: UInt = 4u;
public const val `TC_CR_90`: UInt = 8u;
public const val `TC_CR_ANY`: UInt = 16u;
public const val `TC_EA_DOUBLE`: UInt = 512u;
public const val `TC_IA_ABLE`: UInt = 1024u;
public const val `TC_OP_CHARACTER`: UInt = 1u;
public const val `TC_OP_STROKE`: UInt = 2u;
public const val `TC_RA_ABLE`: UInt = 8192u;
public const val `TC_RESERVED`: UInt = 32768u;
public const val `TC_SA_CONTIN`: UInt = 256u;
public const val `TC_SA_DOUBLE`: UInt = 64u;
public const val `TC_SA_INTEGER`: UInt = 128u;
public const val `TC_SCROLLBLT`: UInt = 65536u;
public const val `TC_SF_X_YINDEP`: UInt = 32u;
public const val `TC_SO_ABLE`: UInt = 4096u;
public const val `TC_UA_ABLE`: UInt = 2048u;
public const val `TC_VA_ABLE`: UInt = 16384u;
public const val `TECHNOLOGY`: `GET_DEVICE_CAPS_INDEX` = 2u;
public const val `TEXTCAPS`: `GET_DEVICE_CAPS_INDEX` = 34u;
// UNSUPPORTED Rust 3939:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TEXTMETRICA {
//     pub tmHeight: i32,
//     pub tmAscent: i32,
//     pub tmDescent: i32,
//     pub tmInternalLeading: i32,
//     pub tmExternalLeading: i32,
//     pub tmAveCharWidth: i32,
//     pub tmMaxCharWidth: i32,
//     pub tmWeight: i32,
//     pub tmOverhang: i32,
//     pub tmDigitizedAspectX: i32,
//     pub tmDigitizedAspectY: i32,
//     pub tmFirstChar: u8,
//     pub tmLastChar: u8,
//     pub tmDefaultChar: u8,
//     pub tmBreakChar: u8,
//     pub tmItalic: u8,
//     pub tmUnderlined: u8,
//     pub tmStruckOut: u8,
//     pub tmPitchAndFamily: TMPF_FLAGS,
//     pub tmCharSet: u8,
// }

// UNSUPPORTED Rust 3963:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TEXTMETRICW {
//     pub tmHeight: i32,
//     pub tmAscent: i32,
//     pub tmDescent: i32,
//     pub tmInternalLeading: i32,
//     pub tmExternalLeading: i32,
//     pub tmAveCharWidth: i32,
//     pub tmMaxCharWidth: i32,
//     pub tmWeight: i32,
//     pub tmOverhang: i32,
//     pub tmDigitizedAspectX: i32,
//     pub tmDigitizedAspectY: i32,
//     pub tmFirstChar: u16,
//     pub tmLastChar: u16,
//     pub tmDefaultChar: u16,
//     pub tmBreakChar: u16,
//     pub tmItalic: u8,
//     pub tmUnderlined: u8,
//     pub tmStruckOut: u8,
//     pub tmPitchAndFamily: TMPF_FLAGS,
//     pub tmCharSet: u8,
// }

public typealias `TEXT_ALIGN_OPTIONS` = UInt;
public const val `THAI_CHARSET`: `FONT_CHARSET` = 222u;
public const val `TMPF_DEVICE`: `TMPF_FLAGS` = 8u;
public const val `TMPF_FIXED_PITCH`: `TMPF_FLAGS` = 1u;
public typealias `TMPF_FLAGS` = UByte;
public const val `TMPF_TRUETYPE`: `TMPF_FLAGS` = 4u;
public const val `TMPF_VECTOR`: `TMPF_FLAGS` = 2u;
public const val `TRANSFORM_CTM`: UInt = 4107u;
public const val `TRANSPARENT`: `BACKGROUND_MODE` = 1u;
// UNSUPPORTED Rust 3996:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRIVERTEX {
//     pub x: i32,
//     pub y: i32,
//     pub Red: u16,
//     pub Green: u16,
//     pub Blue: u16,
//     pub Alpha: u16,
// }

public const val `TRUETYPE_FONTTYPE`: UInt = 4u;
public const val `TTDELETE_DONTREMOVEFONT`: UInt = 1u;
// UNSUPPORTED Rust 4008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TTEMBEDINFO {
//     pub usStructSize: u16,
//     pub usRootStrSize: u16,
//     pub pusRootStr: *mut u16,
// }

// UNSUPPORTED Rust 4015:1: declaration Impl has no candidate rule
// impl Default for TTEMBEDINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TTEMBED_EMBEDEUDC`: `TTEMBED_FLAGS` = 32u;
public const val `TTEMBED_EUDCEMBEDDED`: UInt = 2u;
public const val `TTEMBED_FAILIFVARIATIONSIMULATED`: UInt = 16u;
public typealias `TTEMBED_FLAGS` = UInt;
public const val `TTEMBED_RAW`: `TTEMBED_FLAGS` = 0u;
public const val `TTEMBED_SUBSET`: `TTEMBED_FLAGS` = 1u;
public const val `TTEMBED_SUBSETCANCEL`: UInt = 4u;
public const val `TTEMBED_TTCOMPRESSED`: `TTEMBED_FLAGS` = 4u;
public const val `TTEMBED_VARIATIONSIMULATED`: UInt = 1u;
public const val `TTEMBED_WEBOBJECT`: UInt = 128u;
public const val `TTEMBED_XORENCRYPTDATA`: UInt = 268435456u;
public const val `TTFCFP_APPLE_PLATFORMID`: UInt = 1u;
public const val `TTFCFP_DELTA`: UInt = 2u;
public const val `TTFCFP_DONT_CARE`: UInt = 65535u;
public const val `TTFCFP_FLAGS_COMPRESS`: UInt = 2u;
public const val `TTFCFP_FLAGS_GLYPHLIST`: UInt = 8u;
public const val `TTFCFP_FLAGS_SUBSET`: UInt = 1u;
public const val `TTFCFP_FLAGS_TTC`: UInt = 4u;
public const val `TTFCFP_ISO_PLATFORMID`: `CREATE_FONT_PACKAGE_SUBSET_PLATFORM` = 2;
public const val `TTFCFP_LANG_KEEP_ALL`: UInt = 0u;
public const val `TTFCFP_MS_PLATFORMID`: UInt = 3u;
public const val `TTFCFP_STD_MAC_CHAR_SET`: `CREATE_FONT_PACKAGE_SUBSET_ENCODING` = 0;
public const val `TTFCFP_SUBSET`: UInt = 0u;
public const val `TTFCFP_SUBSET1`: UInt = 1u;
public const val `TTFCFP_SYMBOL_CHAR_SET`: `CREATE_FONT_PACKAGE_SUBSET_ENCODING` = 0;
public const val `TTFCFP_UNICODE_CHAR_SET`: `CREATE_FONT_PACKAGE_SUBSET_ENCODING` = 1;
public const val `TTFCFP_UNICODE_PLATFORMID`: `CREATE_FONT_PACKAGE_SUBSET_PLATFORM` = 0;
public const val `TTFMFP_DELTA`: UInt = 2u;
public const val `TTFMFP_SUBSET`: UInt = 0u;
public const val `TTFMFP_SUBSET1`: UInt = 1u;
// UNSUPPORTED Rust 4050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TTLOADINFO {
//     pub usStructSize: u16,
//     pub usRefStrSize: u16,
//     pub pusRefStr: *mut u16,
// }

// UNSUPPORTED Rust 4057:1: declaration Impl has no candidate rule
// impl Default for TTLOADINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TTLOAD_EMBEDDED_FONT_STATUS` = UInt;
public const val `TTLOAD_EUDC_OVERWRITE`: UInt = 2u;
public const val `TTLOAD_EUDC_SET`: UInt = 4u;
public const val `TTLOAD_FONT_IN_SYSSTARTUP`: `TTLOAD_EMBEDDED_FONT_STATUS` = 2u;
public const val `TTLOAD_FONT_SUBSETTED`: `TTLOAD_EMBEDDED_FONT_STATUS` = 1u;
public const val `TTLOAD_PRIVATE`: UInt = 1u;
// UNSUPPORTED Rust 4068:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TTPOLYCURVE {
//     pub wType: u16,
//     pub cpfx: u16,
//     pub apfx: [POINTFX; 1],
// }

// UNSUPPORTED Rust 4075:1: declaration Impl has no candidate rule
// impl Default for TTPOLYCURVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4080:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TTPOLYGONHEADER {
//     pub cb: u32,
//     pub dwType: u32,
//     pub pfxStart: POINTFX,
// }

// UNSUPPORTED Rust 4087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TTVALIDATIONTESTSPARAMS {
//     pub ulStructSize: u32,
//     pub lTestFromSize: i32,
//     pub lTestToSize: i32,
//     pub ulCharSet: u32,
//     pub usReserved1: u16,
//     pub usCharCodeCount: u16,
//     pub pusCharCodeSet: *mut u16,
// }

// UNSUPPORTED Rust 4098:1: declaration Impl has no candidate rule
// impl Default for TTVALIDATIONTESTSPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TTVALIDATIONTESTSPARAMSEX {
//     pub ulStructSize: u32,
//     pub lTestFromSize: i32,
//     pub lTestToSize: i32,
//     pub ulCharSet: u32,
//     pub usReserved1: u16,
//     pub usCharCodeCount: u16,
//     pub pulCharCodeSet: *mut u32,
// }

// UNSUPPORTED Rust 4114:1: declaration Impl has no candidate rule
// impl Default for TTVALIDATIONTESTSPARAMSEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TT_AVAILABLE`: UInt = 1u;
public const val `TT_ENABLED`: UInt = 2u;
public const val `TT_POLYGON_TYPE`: UInt = 24u;
public const val `TT_PRIM_CSPLINE`: UInt = 3u;
public const val `TT_PRIM_LINE`: UInt = 1u;
public const val `TT_PRIM_QSPLINE`: UInt = 2u;
public const val `TURKISH_CHARSET`: `FONT_CHARSET` = 162u;
public const val `VARIABLE_PITCH`: `FONT_PITCH` = 2u;
public const val `VERTRES`: `GET_DEVICE_CAPS_INDEX` = 10u;
public const val `VERTSIZE`: `GET_DEVICE_CAPS_INDEX` = 6u;
public const val `VIETNAMESE_CHARSET`: `FONT_CHARSET` = 163u;
public const val `VREFRESH`: `GET_DEVICE_CAPS_INDEX` = 116u;
public const val `VTA_BASELINE`: `TEXT_ALIGN_OPTIONS` = 24u;
public const val `VTA_BOTTOM`: `TEXT_ALIGN_OPTIONS` = 2u;
public const val `VTA_CENTER`: `TEXT_ALIGN_OPTIONS` = 6u;
public const val `VTA_LEFT`: `TEXT_ALIGN_OPTIONS` = 8u;
public const val `VTA_RIGHT`: `TEXT_ALIGN_OPTIONS` = 0u;
public const val `VTA_TOP`: `TEXT_ALIGN_OPTIONS` = 0u;
// UNSUPPORTED Rust 4137:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WCRANGE {
//     pub wcLow: u16,
//     pub cGlyphs: u16,
// }

// UNSUPPORTED Rust 4143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WGLSWAP {
//     pub hdc: HDC,
//     pub uiFlags: u32,
// }

// UNSUPPORTED Rust 4149:1: declaration Impl has no candidate rule
// impl Default for WGLSWAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WGL_FONT_LINES`: UInt = 0u;
public const val `WGL_FONT_POLYGONS`: UInt = 1u;
public const val `WGL_SWAPMULTIPLE_MAX`: UInt = 16u;
public const val `WGL_SWAP_MAIN_PLANE`: UInt = 1u;
public const val `WGL_SWAP_OVERLAY1`: UInt = 2u;
public const val `WGL_SWAP_OVERLAY10`: UInt = 1024u;
public const val `WGL_SWAP_OVERLAY11`: UInt = 2048u;
public const val `WGL_SWAP_OVERLAY12`: UInt = 4096u;
public const val `WGL_SWAP_OVERLAY13`: UInt = 8192u;
public const val `WGL_SWAP_OVERLAY14`: UInt = 16384u;
public const val `WGL_SWAP_OVERLAY15`: UInt = 32768u;
public const val `WGL_SWAP_OVERLAY2`: UInt = 4u;
public const val `WGL_SWAP_OVERLAY3`: UInt = 8u;
public const val `WGL_SWAP_OVERLAY4`: UInt = 16u;
public const val `WGL_SWAP_OVERLAY5`: UInt = 32u;
public const val `WGL_SWAP_OVERLAY6`: UInt = 64u;
public const val `WGL_SWAP_OVERLAY7`: UInt = 128u;
public const val `WGL_SWAP_OVERLAY8`: UInt = 256u;
public const val `WGL_SWAP_OVERLAY9`: UInt = 512u;
public const val `WGL_SWAP_UNDERLAY1`: UInt = 65536u;
public const val `WGL_SWAP_UNDERLAY10`: UInt = 33554432u;
public const val `WGL_SWAP_UNDERLAY11`: UInt = 67108864u;
public const val `WGL_SWAP_UNDERLAY12`: UInt = 134217728u;
public const val `WGL_SWAP_UNDERLAY13`: UInt = 268435456u;
public const val `WGL_SWAP_UNDERLAY14`: UInt = 536870912u;
public const val `WGL_SWAP_UNDERLAY15`: UInt = 1073741824u;
public const val `WGL_SWAP_UNDERLAY2`: UInt = 131072u;
public const val `WGL_SWAP_UNDERLAY3`: UInt = 262144u;
public const val `WGL_SWAP_UNDERLAY4`: UInt = 524288u;
public const val `WGL_SWAP_UNDERLAY5`: UInt = 1048576u;
public const val `WGL_SWAP_UNDERLAY6`: UInt = 2097152u;
public const val `WGL_SWAP_UNDERLAY7`: UInt = 4194304u;
public const val `WGL_SWAP_UNDERLAY8`: UInt = 8388608u;
public const val `WGL_SWAP_UNDERLAY9`: UInt = 16777216u;
public const val `WHITENESS`: `ROP_CODE` = 16711778u;
public const val `WHITEONBLACK`: `STRETCH_BLT_MODE` = 2;
public const val `WHITE_BRUSH`: `GET_STOCK_OBJECT_FLAGS` = 0;
public const val `WHITE_PEN`: `GET_STOCK_OBJECT_FLAGS` = 6;
public const val `WINDING`: `CREATE_POLYGON_RGN_MODE` = 2;
// UNSUPPORTED Rust 4193:1: generic scalar type unsupported
// pub type WRITEEMBEDPROC = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: *const core::ffi::c_void, param2: u32) -> u32>;

// UNSUPPORTED Rust 4194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XFORM {
//     pub eM11: f32,
//     pub eM12: f32,
//     pub eM21: f32,
//     pub eM22: f32,
//     pub eDx: f32,
//     pub eDy: f32,
// }

