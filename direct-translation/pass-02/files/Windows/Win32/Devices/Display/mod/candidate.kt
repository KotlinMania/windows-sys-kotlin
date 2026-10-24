// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn BRUSHOBJ_hGetColorTransform(pbo : *mut BRUSHOBJ) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn BRUSHOBJ_pvAllocRbrush(pbo : *mut BRUSHOBJ, cj : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn BRUSHOBJ_pvGetRbrush(pbo : *mut BRUSHOBJ) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn BRUSHOBJ_ulGetBrushColor(pbo : *mut BRUSHOBJ) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CLIPOBJ_bEnum(pco : *mut CLIPOBJ, cj : u32, pul : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CLIPOBJ_cEnumStart(pco : *mut CLIPOBJ, ball : windows_sys::core::BOOL, itype : u32, idirection : u32, climit : u32) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn CLIPOBJ_ppoGetPath(pco : *mut CLIPOBJ) -> *mut PATHOBJ);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn CapabilitiesRequestAndCapabilitiesReply(hmonitor : super::super::Foundation:: HANDLE, pszasciicapabilitiesstring : windows_sys::core::PSTR, dwcapabilitiesstringlengthincharacters : u32) -> i32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn DegaussMonitor(hmonitor : super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn DestroyPhysicalMonitor(hmonitor : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn DestroyPhysicalMonitors(dwphysicalmonitorarraysize : u32, pphysicalmonitorarray : *const PHYSICAL_MONITOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DisplayConfigGetDeviceInfo(requestpacket : *mut DISPLAYCONFIG_DEVICE_INFO_HEADER) -> i32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DisplayConfigSetDeviceInfo(setpacket : *const DISPLAYCONFIG_DEVICE_INFO_HEADER) -> i32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngAcquireSemaphore(hsem : HSEMAPHORE));

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngAlphaBlend(psodest : *mut SURFOBJ, psosrc : *mut SURFOBJ, pco : *mut CLIPOBJ, pxlo : *mut XLATEOBJ, prcldest : *mut super::super::Foundation:: RECTL, prclsrc : *mut super::super::Foundation:: RECTL, pblendobj : *mut BLENDOBJ) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngAssociateSurface(hsurf : HSURF, hdev : HDEV, flhooks : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngBitBlt(psotrg : *const SURFOBJ, psosrc : *const SURFOBJ, psomask : *const SURFOBJ, pco : *const CLIPOBJ, pxlo : *const XLATEOBJ, prcltrg : *const super::super::Foundation:: RECTL, pptlsrc : *const super::super::Foundation:: POINTL, pptlmask : *const super::super::Foundation:: POINTL, pbo : *const BRUSHOBJ, pptlbrush : *const super::super::Foundation:: POINTL, rop4 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngCheckAbort(pso : *mut SURFOBJ) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngComputeGlyphSet(ncodepage : i32, nfirstchar : i32, cchars : i32) -> *mut FD_GLYPHSET);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngCopyBits(psodest : *mut SURFOBJ, psosrc : *mut SURFOBJ, pco : *mut CLIPOBJ, pxlo : *mut XLATEOBJ, prcldest : *mut super::super::Foundation:: RECTL, pptlsrc : *mut super::super::Foundation:: POINTL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngCreateBitmap(sizl : super::super::Foundation:: SIZE, lwidth : i32, iformat : u32, fl : u32, pvbits : *mut core::ffi::c_void) -> super::super::Graphics::Gdi:: HBITMAP);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngCreateClip() -> *mut CLIPOBJ);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngCreateDeviceBitmap(dhsurf : DHSURF, sizl : super::super::Foundation:: SIZE, iformatcompat : u32) -> super::super::Graphics::Gdi:: HBITMAP);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngCreateDeviceSurface(dhsurf : DHSURF, sizl : super::super::Foundation:: SIZE, iformatcompat : u32) -> HSURF);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngCreatePalette(imode : u32, ccolors : u32, pulcolors : *mut u32, flred : u32, flgreen : u32, flblue : u32) -> super::super::Graphics::Gdi:: HPALETTE);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngCreateSemaphore() -> HSEMAPHORE);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngDeleteClip(pco : *const CLIPOBJ));

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngDeletePalette(hpal : super::super::Graphics::Gdi:: HPALETTE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngDeletePath(ppo : *mut PATHOBJ));

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngDeleteSemaphore(hsem : HSEMAPHORE));

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngDeleteSurface(hsurf : HSURF) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngEraseSurface(pso : *mut SURFOBJ, prcl : *mut super::super::Foundation:: RECTL, icolor : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngFillPath(pso : *mut SURFOBJ, ppo : *mut PATHOBJ, pco : *mut CLIPOBJ, pbo : *mut BRUSHOBJ, pptlbrushorg : *mut super::super::Foundation:: POINTL, mix : u32, floptions : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngFindResource(h : super::super::Foundation:: HANDLE, iname : i32, itype : i32, pulsize : *mut u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngFreeModule(h : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngGetCurrentCodePage(oemcodepage : *mut u16, ansicodepage : *mut u16));

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngGetDriverName(hdev : HDEV) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngGetPrinterDataFileName(hdev : HDEV) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngGradientFill(psodest : *mut SURFOBJ, pco : *mut CLIPOBJ, pxlo : *mut XLATEOBJ, pvertex : *mut super::super::Graphics::Gdi:: TRIVERTEX, nvertex : u32, pmesh : *mut core::ffi::c_void, nmesh : u32, prclextents : *mut super::super::Foundation:: RECTL, pptlditherorg : *mut super::super::Foundation:: POINTL, ulmode : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngLineTo(pso : *mut SURFOBJ, pco : *mut CLIPOBJ, pbo : *mut BRUSHOBJ, x1 : i32, y1 : i32, x2 : i32, y2 : i32, prclbounds : *mut super::super::Foundation:: RECTL, mix : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngLoadModule(pwsz : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngLockSurface(hsurf : HSURF) -> *mut SURFOBJ);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngMarkBandingSurface(hsurf : HSURF) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngMultiByteToUnicodeN(unicodestring : windows_sys::core::PWSTR, maxbytesinunicodestring : u32, bytesinunicodestring : *mut u32, multibytestring : windows_sys::core::PCSTR, bytesinmultibytestring : u32));

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngMultiByteToWideChar(codepage : u32, widecharstring : windows_sys::core::PWSTR, bytesinwidecharstring : i32, multibytestring : windows_sys::core::PCSTR, bytesinmultibytestring : i32) -> i32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngPaint(pso : *mut SURFOBJ, pco : *mut CLIPOBJ, pbo : *mut BRUSHOBJ, pptlbrushorg : *mut super::super::Foundation:: POINTL, mix : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngPlgBlt(psotrg : *mut SURFOBJ, psosrc : *mut SURFOBJ, psomsk : *mut SURFOBJ, pco : *mut CLIPOBJ, pxlo : *mut XLATEOBJ, pca : *mut super::super::Graphics::Gdi:: COLORADJUSTMENT, pptlbrushorg : *mut super::super::Foundation:: POINTL, pptfx : *mut POINTFIX, prcl : *mut super::super::Foundation:: RECTL, pptl : *mut super::super::Foundation:: POINTL, imode : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngQueryEMFInfo(hdev : HDEV, pemfinfo : *mut EMFINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngQueryLocalTime(param0 : *mut ENG_TIME_FIELDS));

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngReleaseSemaphore(hsem : HSEMAPHORE));

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngStretchBlt(psodest : *mut SURFOBJ, psosrc : *mut SURFOBJ, psomask : *mut SURFOBJ, pco : *mut CLIPOBJ, pxlo : *mut XLATEOBJ, pca : *mut super::super::Graphics::Gdi:: COLORADJUSTMENT, pptlhtorg : *mut super::super::Foundation:: POINTL, prcldest : *mut super::super::Foundation:: RECTL, prclsrc : *mut super::super::Foundation:: RECTL, pptlmask : *mut super::super::Foundation:: POINTL, imode : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn EngStretchBltROP(psodest : *mut SURFOBJ, psosrc : *mut SURFOBJ, psomask : *mut SURFOBJ, pco : *mut CLIPOBJ, pxlo : *mut XLATEOBJ, pca : *mut super::super::Graphics::Gdi:: COLORADJUSTMENT, pptlhtorg : *mut super::super::Foundation:: POINTL, prcldest : *mut super::super::Foundation:: RECTL, prclsrc : *mut super::super::Foundation:: RECTL, pptlmask : *mut super::super::Foundation:: POINTL, imode : u32, pbo : *mut BRUSHOBJ, rop4 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngStrokeAndFillPath(pso : *mut SURFOBJ, ppo : *mut PATHOBJ, pco : *mut CLIPOBJ, pxo : *mut XFORMOBJ, pbostroke : *mut BRUSHOBJ, plineattrs : *mut LINEATTRS, pbofill : *mut BRUSHOBJ, pptlbrushorg : *mut super::super::Foundation:: POINTL, mixfill : u32, floptions : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngStrokePath(pso : *mut SURFOBJ, ppo : *mut PATHOBJ, pco : *mut CLIPOBJ, pxo : *mut XFORMOBJ, pbo : *mut BRUSHOBJ, pptlbrushorg : *mut super::super::Foundation:: POINTL, plineattrs : *mut LINEATTRS, mix : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngTextOut(pso : *mut SURFOBJ, pstro : *mut STROBJ, pfo : *mut FONTOBJ, pco : *mut CLIPOBJ, prclextra : *mut super::super::Foundation:: RECTL, prclopaque : *mut super::super::Foundation:: RECTL, pbofore : *mut BRUSHOBJ, pboopaque : *mut BRUSHOBJ, pptlorg : *mut super::super::Foundation:: POINTL, mix : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngTransparentBlt(psodst : *const SURFOBJ, psosrc : *const SURFOBJ, pco : *const CLIPOBJ, pxlo : *const XLATEOBJ, prcldst : *const super::super::Foundation:: RECTL, prclsrc : *const super::super::Foundation:: RECTL, transcolor : u32, bcalledfrombitblt : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngUnicodeToMultiByteN(multibytestring : windows_sys::core::PSTR, maxbytesinmultibytestring : u32, bytesinmultibytestring : *mut u32, unicodestring : windows_sys::core::PCWSTR, bytesinunicodestring : u32));

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngUnlockSurface(pso : *mut SURFOBJ));

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn EngWideCharToMultiByte(codepage : u32, widecharstring : windows_sys::core::PCWSTR, bytesinwidecharstring : i32, multibytestring : windows_sys::core::PSTR, bytesinmultibytestring : i32) -> i32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_cGetAllGlyphHandles(pfo : *mut FONTOBJ, phg : *mut u32) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_cGetGlyphs(pfo : *mut FONTOBJ, imode : u32, cglyph : u32, phg : *mut u32, ppvglyph : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_pQueryGlyphAttrs(pfo : *mut FONTOBJ, imode : u32) -> *mut FD_GLYPHATTR);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_pfdg(pfo : *mut FONTOBJ) -> *mut FD_GLYPHSET);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_pifi(pfo : *const FONTOBJ) -> *mut IFIMETRICS);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_pvTrueTypeFontFile(pfo : *mut FONTOBJ, pcjfile : *mut u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_pxoGetXform(pfo : *const FONTOBJ) -> *mut XFORMOBJ);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn FONTOBJ_vGetInfo(pfo : *mut FONTOBJ, cjsize : u32, pfi : *mut FONTINFO));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetAutoRotationState(pstate : *mut AR_STATE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetCapabilitiesStringLength(hmonitor : super::super::Foundation:: HANDLE, pdwcapabilitiesstringlengthincharacters : *mut u32) -> i32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDisplayAutoRotationPreferences(porientation : *mut ORIENTATION_PREFERENCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDisplayConfigBufferSizes(flags : QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements : *mut u32, nummodeinfoarrayelements : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorBrightness(hmonitor : super::super::Foundation:: HANDLE, pdwminimumbrightness : *mut u32, pdwcurrentbrightness : *mut u32, pdwmaximumbrightness : *mut u32) -> i32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorCapabilities(hmonitor : super::super::Foundation:: HANDLE, pdwmonitorcapabilities : *mut u32, pdwsupportedcolortemperatures : *mut u32) -> i32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorColorTemperature(hmonitor : super::super::Foundation:: HANDLE, pctcurrentcolortemperature : *mut MC_COLOR_TEMPERATURE) -> i32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorContrast(hmonitor : super::super::Foundation:: HANDLE, pdwminimumcontrast : *mut u32, pdwcurrentcontrast : *mut u32, pdwmaximumcontrast : *mut u32) -> i32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorDisplayAreaPosition(hmonitor : super::super::Foundation:: HANDLE, ptpositiontype : MC_POSITION_TYPE, pdwminimumposition : *mut u32, pdwcurrentposition : *mut u32, pdwmaximumposition : *mut u32) -> i32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorDisplayAreaSize(hmonitor : super::super::Foundation:: HANDLE, stsizetype : MC_SIZE_TYPE, pdwminimumwidthorheight : *mut u32, pdwcurrentwidthorheight : *mut u32, pdwmaximumwidthorheight : *mut u32) -> i32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorRedGreenOrBlueDrive(hmonitor : super::super::Foundation:: HANDLE, dtdrivetype : MC_DRIVE_TYPE, pdwminimumdrive : *mut u32, pdwcurrentdrive : *mut u32, pdwmaximumdrive : *mut u32) -> i32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorRedGreenOrBlueGain(hmonitor : super::super::Foundation:: HANDLE, gtgaintype : MC_GAIN_TYPE, pdwminimumgain : *mut u32, pdwcurrentgain : *mut u32, pdwmaximumgain : *mut u32) -> i32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetMonitorTechnologyType(hmonitor : super::super::Foundation:: HANDLE, pdtydisplaytechnologytype : *mut MC_DISPLAY_TECHNOLOGY_TYPE) -> i32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dxva2.dll" "system" fn GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor : super::super::Graphics::Gdi:: HMONITOR, pdwnumberofphysicalmonitors : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dxva2.dll" "system" fn GetPhysicalMonitorsFromHMONITOR(hmonitor : super::super::Graphics::Gdi:: HMONITOR, dwphysicalmonitorarraysize : u32, pphysicalmonitorarray : *mut PHYSICAL_MONITOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetTimingReport(hmonitor : super::super::Foundation:: HANDLE, pmtrmonitortimingreport : *mut MC_TIMING_REPORT) -> i32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn GetVCPFeatureAndVCPFeatureReply(hmonitor : super::super::Foundation:: HANDLE, bvcpcode : u8, pvct : *mut MC_VCP_CODE_TYPE, pdwcurrentvalue : *mut u32, pdwmaximumvalue : *mut u32) -> i32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn HT_Get8BPPFormatPalette(ppaletteentry : *mut super::super::Graphics::Gdi:: PALETTEENTRY, redgamma : u16, greengamma : u16, bluegamma : u16) -> i32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn HT_Get8BPPMaskPalette(ppaletteentry : *mut super::super::Graphics::Gdi:: PALETTEENTRY, use8bppmaskpal : windows_sys::core::BOOL, cmymask : u8, redgamma : u16, greengamma : u16, bluegamma : u16) -> i32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PATHOBJ_bEnum(ppo : *mut PATHOBJ, ppd : *mut PATHDATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PATHOBJ_bEnumClipLines(ppo : *mut PATHOBJ, cb : u32, pcl : *mut CLIPLINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PATHOBJ_vEnumStart(ppo : *mut PATHOBJ));

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PATHOBJ_vEnumStartClipLines(ppo : *mut PATHOBJ, pco : *mut CLIPOBJ, pso : *mut SURFOBJ, pla : *mut LINEATTRS));

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn PATHOBJ_vGetBounds(ppo : *mut PATHOBJ, prectfx : *mut RECTFX));

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn QueryDisplayConfig(flags : QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements : *mut u32, patharray : *mut DISPLAYCONFIG_PATH_INFO, nummodeinfoarrayelements : *mut u32, modeinfoarray : *mut DISPLAYCONFIG_MODE_INFO, currenttopologyid : *mut DISPLAYCONFIG_TOPOLOGY_ID) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn RestoreMonitorFactoryColorDefaults(hmonitor : super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn RestoreMonitorFactoryDefaults(hmonitor : super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn STROBJ_bEnum(pstro : *mut STROBJ, pc : *mut u32, ppgpos : *mut *mut GLYPHPOS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn STROBJ_bEnumPositionsOnly(pstro : *mut STROBJ, pc : *mut u32, ppgpos : *mut *mut GLYPHPOS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn STROBJ_bGetAdvanceWidths(pso : *mut STROBJ, ifirst : u32, c : u32, pptqd : *mut POINTQF) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn STROBJ_dwGetCodePage(pstro : *mut STROBJ) -> u32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn STROBJ_vEnumStart(pstro : *mut STROBJ));

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SaveCurrentMonitorSettings(hmonitor : super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SaveCurrentSettings(hmonitor : super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetDisplayAutoRotationPreferences(orientation : ORIENTATION_PREFERENCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetDisplayConfig(numpatharrayelements : u32, patharray : *const DISPLAYCONFIG_PATH_INFO, nummodeinfoarrayelements : u32, modeinfoarray : *const DISPLAYCONFIG_MODE_INFO, flags : SET_DISPLAY_CONFIG_FLAGS) -> i32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetMonitorBrightness(hmonitor : super::super::Foundation:: HANDLE, dwnewbrightness : u32) -> i32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetMonitorColorTemperature(hmonitor : super::super::Foundation:: HANDLE, ctcurrentcolortemperature : MC_COLOR_TEMPERATURE) -> i32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetMonitorContrast(hmonitor : super::super::Foundation:: HANDLE, dwnewcontrast : u32) -> i32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetMonitorDisplayAreaPosition(hmonitor : super::super::Foundation:: HANDLE, ptpositiontype : MC_POSITION_TYPE, dwnewposition : u32) -> i32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetMonitorDisplayAreaSize(hmonitor : super::super::Foundation:: HANDLE, stsizetype : MC_SIZE_TYPE, dwnewdisplayareawidthorheight : u32) -> i32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetMonitorRedGreenOrBlueDrive(hmonitor : super::super::Foundation:: HANDLE, dtdrivetype : MC_DRIVE_TYPE, dwnewdrive : u32) -> i32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetMonitorRedGreenOrBlueGain(hmonitor : super::super::Foundation:: HANDLE, gtgaintype : MC_GAIN_TYPE, dwnewgain : u32) -> i32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("dxva2.dll" "system" fn SetVCPFeature(hmonitor : super::super::Foundation:: HANDLE, bvcpcode : u8, dwnewvalue : u32) -> i32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn XFORMOBJ_bApplyXform(pxo : *mut XFORMOBJ, imode : u32, cpoints : u32, pvin : *mut core::ffi::c_void, pvout : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn XFORMOBJ_iGetXform(pxo : *const XFORMOBJ, pxform : *mut XFORML) -> u32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn XLATEOBJ_cGetPalette(pxlo : *mut XLATEOBJ, ipal : u32, cpal : u32, ppal : *mut u32) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn XLATEOBJ_hGetColorTransform(pxlo : *mut XLATEOBJ) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn XLATEOBJ_iXlate(pxlo : *mut XLATEOBJ, icolor : u32) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("gdi32.dll" "system" fn XLATEOBJ_piVector(pxlo : *mut XLATEOBJ) -> *mut u32);

public const val `AR_DISABLED`: `AR_STATE` = 1;
public const val `AR_DOCKED`: `AR_STATE` = 64;
public const val `AR_ENABLED`: `AR_STATE` = 0;
public const val `AR_LAPTOP`: `AR_STATE` = 128;
public const val `AR_MULTIMON`: `AR_STATE` = 8;
public const val `AR_NOSENSOR`: `AR_STATE` = 16;
public const val `AR_NOT_SUPPORTED`: `AR_STATE` = 32;
public const val `AR_REMOTESESSION`: `AR_STATE` = 4;
public typealias `AR_STATE` = Int;
public const val `AR_SUPPRESSED`: `AR_STATE` = 2;
// UNSUPPORTED Rust 143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Adapter {
//     pub AdapterName: [u16; 128],
//     pub numSources: i32,
//     pub sources: [Sources; 1],
// }

// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule
// impl Default for Adapter {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Adapters {
//     pub numAdapters: i32,
//     pub adapter: [Adapter; 1],
// }

// UNSUPPORTED Rust 161:1: declaration Impl has no candidate rule
// impl Default for Adapters {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BACKLIGHT_OPTIMIZATION_LEVEL` = Int;
// UNSUPPORTED Rust 167:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BACKLIGHT_REDUCTION_GAMMA_RAMP {
//     pub R: [u16; 256],
//     pub G: [u16; 256],
//     pub B: [u16; 256],
// }

// UNSUPPORTED Rust 174:1: declaration Impl has no candidate rule
// impl Default for BACKLIGHT_REDUCTION_GAMMA_RAMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BANK_POSITION {
//     pub ReadBankPosition: u32,
//     pub WriteBankPosition: u32,
// }

public const val `BITMAP_ARRAY_BYTE`: UInt = 3u;
public const val `BITMAP_BITS_BYTE_ALIGN`: UInt = 8u;
public const val `BITMAP_BITS_PIXEL`: UInt = 1u;
public const val `BITMAP_BITS_WORD_ALIGN`: UInt = 16u;
public const val `BITMAP_PLANES`: UInt = 1u;
// UNSUPPORTED Rust 190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct BLENDOBJ {
//     pub BlendFunction: super::super::Graphics::Gdi::BLENDFUNCTION,
// }

public const val `BMF_16BPP`: Int = 4;
public const val `BMF_1BPP`: Int = 1;
public const val `BMF_24BPP`: Int = 5;
public const val `BMF_32BPP`: Int = 6;
public const val `BMF_4BPP`: Int = 2;
public const val `BMF_4RLE`: Int = 7;
public const val `BMF_8BPP`: Int = 3;
public const val `BMF_8RLE`: Int = 8;
public const val `BMF_ACC_NOTIFY`: UInt = 32768u;
public const val `BMF_DONTCACHE`: UInt = 4u;
public const val `BMF_JPEG`: Int = 9;
public const val `BMF_KMSECTION`: UInt = 16u;
public const val `BMF_NOTSYSMEM`: UInt = 32u;
public const val `BMF_NOZEROINIT`: UInt = 2u;
public const val `BMF_PNG`: Int = 10;
public const val `BMF_RESERVED`: UInt = 15872u;
public const val `BMF_RMT_ENTER`: UInt = 16384u;
public const val `BMF_TEMP_ALPHA`: UInt = 256u;
public const val `BMF_TOPDOWN`: UInt = 1u;
public const val `BMF_UMPDMEM`: UInt = 128u;
public const val `BMF_USERMEM`: UInt = 8u;
public const val `BMF_WINDOW_BLT`: UInt = 64u;
public typealias `BRIGHTNESS_INTERFACE_VERSION` = Int;
public const val `BRIGHTNESS_INTERFACE_VERSION_1`: `BRIGHTNESS_INTERFACE_VERSION` = 1;
public const val `BRIGHTNESS_INTERFACE_VERSION_2`: `BRIGHTNESS_INTERFACE_VERSION` = 2;
public const val `BRIGHTNESS_INTERFACE_VERSION_3`: `BRIGHTNESS_INTERFACE_VERSION` = 3;
// UNSUPPORTED Rust 222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BRIGHTNESS_LEVEL {
//     pub Count: u8,
//     pub Level: [u8; 103],
// }

// UNSUPPORTED Rust 228:1: declaration Impl has no candidate rule
// impl Default for BRIGHTNESS_LEVEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BRIGHTNESS_MAX_LEVEL_COUNT`: UInt = 103u;
public const val `BRIGHTNESS_MAX_NIT_RANGE_COUNT`: UInt = 16u;
// UNSUPPORTED Rust 235:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BRIGHTNESS_NIT_RANGE {
//     pub MinLevelInMillinit: u32,
//     pub MaxLevelInMillinit: u32,
//     pub StepSizeInMillinit: u32,
// }

// UNSUPPORTED Rust 242:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BRIGHTNESS_NIT_RANGES {
//     pub NormalRangeCount: u32,
//     pub RangeCount: u32,
//     pub PreferredMaximumBrightness: u32,
//     pub SupportedRanges: [BRIGHTNESS_NIT_RANGE; 16],
// }

// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule
// impl Default for BRIGHTNESS_NIT_RANGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BRUSHOBJ {
//     pub iSolidColor: u32,
//     pub pvRbrush: *mut core::ffi::c_void,
//     pub flColorType: u32,
// }

// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule
// impl Default for BRUSHOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BR_CMYKCOLOR`: UInt = 4u;
public const val `BR_DEVICE_ICM`: UInt = 1u;
public const val `BR_HOST_ICM`: UInt = 2u;
public const val `BR_ORIGCOLOR`: UInt = 8u;
public const val `BacklightOptimizationDesktop`: `BACKLIGHT_OPTIMIZATION_LEVEL` = 1;
public const val `BacklightOptimizationDimmed`: `BACKLIGHT_OPTIMIZATION_LEVEL` = 3;
public const val `BacklightOptimizationDisable`: `BACKLIGHT_OPTIMIZATION_LEVEL` = 0;
public const val `BacklightOptimizationDynamic`: `BACKLIGHT_OPTIMIZATION_LEVEL` = 2;
public const val `BacklightOptimizationEDR`: `BACKLIGHT_OPTIMIZATION_LEVEL` = 4;
public typealias `BlackScreenDiagnosticsCalloutParam` = Int;
public const val `BlackScreenDiagnosticsData`: `BlackScreenDiagnosticsCalloutParam` = 1;
public const val `BlackScreenDisplayRecovery`: `BlackScreenDiagnosticsCalloutParam` = 2;
public const val `CDBEX_CROSSADAPTER`: UInt = 8u;
public const val `CDBEX_DXINTEROP`: UInt = 2u;
public const val `CDBEX_NTSHAREDSURFACEHANDLE`: UInt = 4u;
public const val `CDBEX_REDIRECTION`: UInt = 1u;
public const val `CDBEX_REUSE`: UInt = 16u;
// UNSUPPORTED Rust 284:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDDDXGK_REDIRBITMAPPRESENTINFO {
//     pub NumDirtyRects: u32,
//     pub DirtyRect: *mut super::super::Foundation::RECT,
//     pub NumContexts: u32,
//     pub hContext: [super::super::Foundation::HANDLE; 65],
//     pub bDoNotSynchronizeWithDxContent: bool,
// }

// UNSUPPORTED Rust 293:1: declaration Impl has no candidate rule
// impl Default for CDDDXGK_REDIRBITMAPPRESENTINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CD_ANY`: Int = 4;
public const val `CD_LEFTDOWN`: Int = 1;
public const val `CD_LEFTUP`: Int = 3;
public const val `CD_LEFTWARDS`: Int = 1;
public const val `CD_RIGHTDOWN`: Int = 0;
public const val `CD_RIGHTUP`: Int = 2;
public const val `CD_UPWARDS`: Int = 2;
// UNSUPPORTED Rust 305:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Console")]
// #[derive(Clone, Copy)]
// pub struct CHAR_IMAGE_INFO {
//     pub CharInfo: super::super::System::Console::CHAR_INFO,
//     pub FontImageInfo: FONT_IMAGE_INFO,
// }

// UNSUPPORTED Rust 312:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Console")]
// impl Default for CHAR_IMAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CHAR_TYPE_LEADING`: UInt = 2u;
public const val `CHAR_TYPE_SBCS`: UInt = 0u;
public const val `CHAR_TYPE_TRAILING`: UInt = 3u;
// UNSUPPORTED Rust 321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CHROMATICITY_COORDINATE {
//     pub x: f32,
//     pub y: f32,
// }

// UNSUPPORTED Rust 327:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CIECHROMA {
//     pub x: i32,
//     pub y: i32,
//     pub Y: i32,
// }

// UNSUPPORTED Rust 334:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLIPLINE {
//     pub ptfxA: POINTFIX,
//     pub ptfxB: POINTFIX,
//     pub lStyleState: i32,
//     pub c: u32,
//     pub arun: [RUN; 1],
// }

// UNSUPPORTED Rust 343:1: declaration Impl has no candidate rule
// impl Default for CLIPLINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLIPOBJ {
//     pub iUniq: u32,
//     pub rclBounds: super::super::Foundation::RECTL,
//     pub iDComplexity: u8,
//     pub iFComplexity: u8,
//     pub iMode: u8,
//     pub fjOptions: u8,
// }

// UNSUPPORTED Rust 358:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COLORINFO {
//     pub Red: CIECHROMA,
//     pub Green: CIECHROMA,
//     pub Blue: CIECHROMA,
//     pub Cyan: CIECHROMA,
//     pub Magenta: CIECHROMA,
//     pub Yellow: CIECHROMA,
//     pub AlignmentWhite: CIECHROMA,
//     pub RedGamma: i32,
//     pub GreenGamma: i32,
//     pub BlueGamma: i32,
//     pub MagentaInCyanDye: i32,
//     pub YellowInCyanDye: i32,
//     pub CyanInMagentaDye: i32,
//     pub YellowInMagentaDye: i32,
//     pub CyanInYellowDye: i32,
//     pub MagentaInYellowDye: i32,
// }

// UNSUPPORTED Rust 378:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM {
//     pub Type: COLORSPACE_TRANSFORM_TYPE,
//     pub Data: COLORSPACE_TRANSFORM_0,
// }

// UNSUPPORTED Rust 384:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 389:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLORSPACE_TRANSFORM_0 {
//     pub Rgb256x3x16: GAMMA_RAMP_RGB256x3x16,
//     pub Dxgi1: GAMMA_RAMP_DXGI_1,
//     pub T3x4: COLORSPACE_TRANSFORM_3x4,
//     pub MatrixV2: COLORSPACE_TRANSFORM_MATRIX_V2,
// }

// UNSUPPORTED Rust 397:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM_1DLUT_CAP {
//     pub NumberOfLUTEntries: u32,
//     pub DataCap: COLORSPACE_TRANSFORM_DATA_CAP,
// }

// UNSUPPORTED Rust 408:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_1DLUT_CAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 413:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM_3x4 {
//     pub ColorMatrix3x4: [f32; 12],
//     pub ScalarMultiplier: f32,
//     pub LookupTable1D: [GAMMA_RAMP_RGB; 4096],
// }

// UNSUPPORTED Rust 420:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_3x4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM_DATA_CAP {
//     pub DataType: COLORSPACE_TRANSFORM_DATA_TYPE,
//     pub Anonymous: COLORSPACE_TRANSFORM_DATA_CAP_0,
//     pub NumericRangeMin: f32,
//     pub NumericRangeMax: f32,
// }

// UNSUPPORTED Rust 433:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_DATA_CAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 438:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLORSPACE_TRANSFORM_DATA_CAP_0 {
//     pub Anonymous1: COLORSPACE_TRANSFORM_DATA_CAP_0_0,
//     pub Anonymous2: COLORSPACE_TRANSFORM_DATA_CAP_0_1,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 445:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_DATA_CAP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COLORSPACE_TRANSFORM_DATA_CAP_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 455:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COLORSPACE_TRANSFORM_DATA_CAP_0_1 {
//     pub _bitfield: u32,
// }

public typealias `COLORSPACE_TRANSFORM_DATA_TYPE` = Int;
public const val `COLORSPACE_TRANSFORM_DATA_TYPE_FIXED_POINT`: `COLORSPACE_TRANSFORM_DATA_TYPE` = 0;
public const val `COLORSPACE_TRANSFORM_DATA_TYPE_FLOAT`: `COLORSPACE_TRANSFORM_DATA_TYPE` = 1;
// UNSUPPORTED Rust 463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM_MATRIX_CAP {
//     pub Anonymous: COLORSPACE_TRANSFORM_MATRIX_CAP_0,
//     pub DataCap: COLORSPACE_TRANSFORM_DATA_CAP,
// }

// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_MATRIX_CAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 474:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COLORSPACE_TRANSFORM_MATRIX_CAP_0 {
//     pub Anonymous: COLORSPACE_TRANSFORM_MATRIX_CAP_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 480:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_MATRIX_CAP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 485:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COLORSPACE_TRANSFORM_MATRIX_CAP_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM_MATRIX_V2 {
//     pub StageControlLookupTable1DDegamma: COLORSPACE_TRANSFORM_STAGE_CONTROL,
//     pub LookupTable1DDegamma: [GAMMA_RAMP_RGB; 4096],
//     pub StageControlColorMatrix3x3: COLORSPACE_TRANSFORM_STAGE_CONTROL,
//     pub ColorMatrix3x3: [f32; 9],
//     pub StageControlLookupTable1DRegamma: COLORSPACE_TRANSFORM_STAGE_CONTROL,
//     pub LookupTable1DRegamma: [GAMMA_RAMP_RGB; 4096],
// }

// UNSUPPORTED Rust 500:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_MATRIX_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 505:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM_SET_INPUT {
//     pub OutputWireColorSpaceExpected: OUTPUT_WIRE_COLOR_SPACE_TYPE,
//     pub OutputWireFormatExpected: OUTPUT_WIRE_FORMAT,
//     pub ColorSpaceTransform: COLORSPACE_TRANSFORM,
// }

// UNSUPPORTED Rust 512:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_SET_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COLORSPACE_TRANSFORM_STAGE_CONTROL` = Int;
// UNSUPPORTED Rust 518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COLORSPACE_TRANSFORM_TARGET_CAPS {
//     pub Version: COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION,
//     pub LookupTable1DDegammaCap: COLORSPACE_TRANSFORM_1DLUT_CAP,
//     pub ColorMatrix3x3Cap: COLORSPACE_TRANSFORM_MATRIX_CAP,
//     pub LookupTable1DRegammaCap: COLORSPACE_TRANSFORM_1DLUT_CAP,
// }

// UNSUPPORTED Rust 526:1: declaration Impl has no candidate rule
// impl Default for COLORSPACE_TRANSFORM_TARGET_CAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION` = Int;
public typealias `COLORSPACE_TRANSFORM_TYPE` = Int;
public const val `COLORSPACE_TRANSFORM_TYPE_DEFAULT`: `COLORSPACE_TRANSFORM_TYPE` = 1;
public const val `COLORSPACE_TRANSFORM_TYPE_DXGI_1`: `COLORSPACE_TRANSFORM_TYPE` = 3;
public const val `COLORSPACE_TRANSFORM_TYPE_MATRIX_3x4`: `COLORSPACE_TRANSFORM_TYPE` = 4;
public const val `COLORSPACE_TRANSFORM_TYPE_MATRIX_V2`: `COLORSPACE_TRANSFORM_TYPE` = 5;
public const val `COLORSPACE_TRANSFORM_TYPE_RGB256x3x16`: `COLORSPACE_TRANSFORM_TYPE` = 2;
public const val `COLORSPACE_TRANSFORM_TYPE_UNINITIALIZED`: `COLORSPACE_TRANSFORM_TYPE` = 0;
public const val `COLORSPACE_TRANSFORM_VERSION_1`: `COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION` = 1;
public const val `COLORSPACE_TRANSFORM_VERSION_DEFAULT`: `COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION` = 0;
public const val `COLORSPACE_TRANSFORM_VERSION_NOT_SUPPORTED`: `COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION` = 0;
public const val `CT_RECTANGLES`: Int = 0;
public const val `ColorSpaceTransformStageControl_Bypass`: `COLORSPACE_TRANSFORM_STAGE_CONTROL` = 2;
public const val `ColorSpaceTransformStageControl_Enable`: `COLORSPACE_TRANSFORM_STAGE_CONTROL` = 1;
public const val `ColorSpaceTransformStageControl_No_Change`: `COLORSPACE_TRANSFORM_STAGE_CONTROL` = 0;
public const val `DCR_DRIVER`: UInt = 1u;
public const val `DCR_HALFTONE`: UInt = 2u;
public const val `DCR_SOLID`: UInt = 0u;
public const val `DCT_DEFAULT`: `DSI_CONTROL_TRANSMISSION_MODE` = 0;
public const val `DCT_FORCE_HIGH_PERFORMANCE`: `DSI_CONTROL_TRANSMISSION_MODE` = 2;
public const val `DCT_FORCE_LOW_POWER`: `DSI_CONTROL_TRANSMISSION_MODE` = 1;
public const val `DC_COMPLEX`: UInt = 3u;
public const val `DC_RECT`: UInt = 1u;
public const val `DC_TRIVIAL`: UInt = 0u;
public const val `DDI_DRIVER_VERSION_NT4`: UInt = 131072u;
public const val `DDI_DRIVER_VERSION_NT5`: UInt = 196608u;
public const val `DDI_DRIVER_VERSION_NT5_01`: UInt = 196864u;
public const val `DDI_DRIVER_VERSION_NT5_01_SP1`: UInt = 196865u;
public const val `DDI_DRIVER_VERSION_SP3`: UInt = 131075u;
public const val `DDI_ERROR`: UInt = 4294967295u;
// UNSUPPORTED Rust 561:1: non-scalar type Ptr unsupported
// pub const DD_FULLSCREEN_VIDEO_DEVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\FSVideo");

// UNSUPPORTED Rust 562:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEVHTADJDATA {
//     pub DeviceFlags: u32,
//     pub DeviceXDPI: u32,
//     pub DeviceYDPI: u32,
//     pub pDefHTInfo: *mut DEVHTINFO,
//     pub pAdjHTInfo: *mut DEVHTINFO,
// }

// UNSUPPORTED Rust 571:1: declaration Impl has no candidate rule
// impl Default for DEVHTADJDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEVHTADJF_ADDITIVE_DEVICE`: UInt = 2u;
public const val `DEVHTADJF_COLOR_DEVICE`: UInt = 1u;
// UNSUPPORTED Rust 578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEVHTINFO {
//     pub HTFlags: u32,
//     pub HTPatternSize: u32,
//     pub DevPelsDPI: u32,
//     pub ColorInfo: COLORINFO,
// }

// UNSUPPORTED Rust 586:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DEVINFO {
//     pub flGraphicsCaps: u32,
//     pub lfDefaultFont: super::super::Graphics::Gdi::LOGFONTW,
//     pub lfAnsiVarFont: super::super::Graphics::Gdi::LOGFONTW,
//     pub lfAnsiFixFont: super::super::Graphics::Gdi::LOGFONTW,
//     pub cFonts: u32,
//     pub iDitherFormat: u32,
//     pub cxDither: u16,
//     pub cyDither: u16,
//     pub hpalDefault: super::super::Graphics::Gdi::HPALETTE,
//     pub flGraphicsCaps2: u32,
// }

// UNSUPPORTED Rust 601:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DEVINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 607:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_Device_ActivityId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 4 };

// UNSUPPORTED Rust 608:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_Device_AdapterLuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 3 };

// UNSUPPORTED Rust 609:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_Device_TerminalLuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 2 };

// UNSUPPORTED Rust 610:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_IndirectDisplay: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xc50a3f10_aa5c_4247_b830_d6a6f8eaa310), pid: 1 };

// UNSUPPORTED Rust 611:1: non-scalar type Ptr unsupported
// pub type DHPDEV = *mut core::ffi::c_void;

// UNSUPPORTED Rust 612:1: non-scalar type Ptr unsupported
// pub type DHSURF = *mut core::ffi::c_void;

// UNSUPPORTED Rust 613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_2DREGION {
//     pub cx: u32,
//     pub cy: u32,
// }

// UNSUPPORTED Rust 619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_ADAPTER_NAME {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub adapterDevicePath: [u16; 128],
// }

// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_ADAPTER_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_DESKTOP_IMAGE_INFO {
//     pub PathSourceSize: super::super::Foundation::POINTL,
//     pub DesktopImageRegion: super::super::Foundation::RECTL,
//     pub DesktopImageClip: super::super::Foundation::RECTL,
// }

public const val `DISPLAYCONFIG_DEVICE_INFO_GET_ADAPTER_NAME`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 4;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_ADVANCED_COLOR_INFO`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 9;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_MONITOR_SPECIALIZATION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 12;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_SDR_WHITE_LEVEL`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 11;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_SOURCE_NAME`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 1;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_SUPPORT_VIRTUAL_RESOLUTION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 7;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_BASE_TYPE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 6;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_NAME`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 2;
public const val `DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_PREFERRED_MODE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 3;
// UNSUPPORTED Rust 646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_DEVICE_INFO_HEADER {
//     pub r#type: DISPLAYCONFIG_DEVICE_INFO_TYPE,
//     pub size: u32,
//     pub adapterId: super::super::Foundation::LUID,
//     pub id: u32,
// }

public const val `DISPLAYCONFIG_DEVICE_INFO_SET_ADVANCED_COLOR_STATE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 10;
public const val `DISPLAYCONFIG_DEVICE_INFO_SET_MONITOR_SPECIALIZATION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 13;
public const val `DISPLAYCONFIG_DEVICE_INFO_SET_SUPPORT_VIRTUAL_RESOLUTION`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 8;
public const val `DISPLAYCONFIG_DEVICE_INFO_SET_TARGET_PERSISTENCE`: `DISPLAYCONFIG_DEVICE_INFO_TYPE` = 5;
public typealias `DISPLAYCONFIG_DEVICE_INFO_TYPE` = Int;
// UNSUPPORTED Rust 659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub Anonymous: DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0,
//     pub colorEncoding: super::super::Graphics::Gdi::DISPLAYCONFIG_COLOR_ENCODING,
//     pub bitsPerColorChannel: u32,
// }

// UNSUPPORTED Rust 668:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 674:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0 {
//     pub Anonymous: DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 681:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub Anonymous: DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0,
// }

// UNSUPPORTED Rust 699:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 704:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0 {
//     pub Anonymous: DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 720:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_MODE_INFO {
//     pub infoType: DISPLAYCONFIG_MODE_INFO_TYPE,
//     pub id: u32,
//     pub adapterId: super::super::Foundation::LUID,
//     pub Anonymous: DISPLAYCONFIG_MODE_INFO_0,
// }

// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_MODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_MODE_INFO_0 {
//     pub targetMode: DISPLAYCONFIG_TARGET_MODE,
//     pub sourceMode: DISPLAYCONFIG_SOURCE_MODE,
//     pub desktopImageInfo: DISPLAYCONFIG_DESKTOP_IMAGE_INFO,
// }

// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_MODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DISPLAYCONFIG_MODE_INFO_TYPE` = Int;
public const val `DISPLAYCONFIG_MODE_INFO_TYPE_DESKTOP_IMAGE`: `DISPLAYCONFIG_MODE_INFO_TYPE` = 3;
public const val `DISPLAYCONFIG_MODE_INFO_TYPE_SOURCE`: `DISPLAYCONFIG_MODE_INFO_TYPE` = 1;
public const val `DISPLAYCONFIG_MODE_INFO_TYPE_TARGET`: `DISPLAYCONFIG_MODE_INFO_TYPE` = 2;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_COMPONENT_VIDEO`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 3;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_COMPOSITE_VIDEO`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 2;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_EMBEDDED`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 11;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_EXTERNAL`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 10;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_USB_TUNNEL`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 18;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DVI`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 4;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_D_JPN`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 8;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_HD15`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 0;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_HDMI`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 5;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INDIRECT_VIRTUAL`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 17;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INDIRECT_WIRED`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 16;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INTERNAL`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = -2147483648;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_LVDS`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 6;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_MIRACAST`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 15;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_OTHER`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = -1;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SDI`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 9;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SDTVDONGLE`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 14;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SVIDEO`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 1;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_UDI_EMBEDDED`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 13;
public const val `DISPLAYCONFIG_OUTPUT_TECHNOLOGY_UDI_EXTERNAL`: `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = 12;
// UNSUPPORTED Rust 769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_PATH_INFO {
//     pub sourceInfo: DISPLAYCONFIG_PATH_SOURCE_INFO,
//     pub targetInfo: DISPLAYCONFIG_PATH_TARGET_INFO,
//     pub flags: u32,
// }

// UNSUPPORTED Rust 776:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_PATH_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 781:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_PATH_SOURCE_INFO {
//     pub adapterId: super::super::Foundation::LUID,
//     pub id: u32,
//     pub Anonymous: DISPLAYCONFIG_PATH_SOURCE_INFO_0,
//     pub statusFlags: u32,
// }

// UNSUPPORTED Rust 789:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_PATH_SOURCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 794:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_PATH_SOURCE_INFO_0 {
//     pub modeInfoIdx: u32,
//     pub Anonymous: DISPLAYCONFIG_PATH_SOURCE_INFO_0_0,
// }

// UNSUPPORTED Rust 800:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_PATH_SOURCE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 805:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_PATH_SOURCE_INFO_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 810:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_PATH_TARGET_INFO {
//     pub adapterId: super::super::Foundation::LUID,
//     pub id: u32,
//     pub Anonymous: DISPLAYCONFIG_PATH_TARGET_INFO_0,
//     pub outputTechnology: DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY,
//     pub rotation: DISPLAYCONFIG_ROTATION,
//     pub scaling: DISPLAYCONFIG_SCALING,
//     pub refreshRate: DISPLAYCONFIG_RATIONAL,
//     pub scanLineOrdering: DISPLAYCONFIG_SCANLINE_ORDERING,
//     pub targetAvailable: windows_sys::core::BOOL,
//     pub statusFlags: u32,
// }

// UNSUPPORTED Rust 824:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_PATH_TARGET_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 829:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_PATH_TARGET_INFO_0 {
//     pub modeInfoIdx: u32,
//     pub Anonymous: DISPLAYCONFIG_PATH_TARGET_INFO_0_0,
// }

// UNSUPPORTED Rust 835:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_PATH_TARGET_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_PATH_TARGET_INFO_0_0 {
//     pub _bitfield: u32,
// }

public typealias `DISPLAYCONFIG_PIXELFORMAT` = Int;
public const val `DISPLAYCONFIG_PIXELFORMAT_16BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 2;
public const val `DISPLAYCONFIG_PIXELFORMAT_24BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 3;
public const val `DISPLAYCONFIG_PIXELFORMAT_32BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 4;
public const val `DISPLAYCONFIG_PIXELFORMAT_8BPP`: `DISPLAYCONFIG_PIXELFORMAT` = 1;
public const val `DISPLAYCONFIG_PIXELFORMAT_NONGDI`: `DISPLAYCONFIG_PIXELFORMAT` = 5;
// UNSUPPORTED Rust 851:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_RATIONAL {
//     pub Numerator: u32,
//     pub Denominator: u32,
// }

public typealias `DISPLAYCONFIG_ROTATION` = Int;
public const val `DISPLAYCONFIG_ROTATION_IDENTITY`: `DISPLAYCONFIG_ROTATION` = 1;
public const val `DISPLAYCONFIG_ROTATION_ROTATE180`: `DISPLAYCONFIG_ROTATION` = 3;
public const val `DISPLAYCONFIG_ROTATION_ROTATE270`: `DISPLAYCONFIG_ROTATION` = 4;
public const val `DISPLAYCONFIG_ROTATION_ROTATE90`: `DISPLAYCONFIG_ROTATION` = 2;
public typealias `DISPLAYCONFIG_SCALING` = Int;
public const val `DISPLAYCONFIG_SCALING_ASPECTRATIOCENTEREDMAX`: `DISPLAYCONFIG_SCALING` = 4;
public const val `DISPLAYCONFIG_SCALING_CENTERED`: `DISPLAYCONFIG_SCALING` = 2;
public const val `DISPLAYCONFIG_SCALING_CUSTOM`: `DISPLAYCONFIG_SCALING` = 5;
public const val `DISPLAYCONFIG_SCALING_IDENTITY`: `DISPLAYCONFIG_SCALING` = 1;
public const val `DISPLAYCONFIG_SCALING_PREFERRED`: `DISPLAYCONFIG_SCALING` = 128;
public const val `DISPLAYCONFIG_SCALING_STRETCHED`: `DISPLAYCONFIG_SCALING` = 3;
public typealias `DISPLAYCONFIG_SCANLINE_ORDERING` = Int;
public const val `DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED`: `DISPLAYCONFIG_SCANLINE_ORDERING` = 2;
public const val `DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED_LOWERFIELDFIRST`: `DISPLAYCONFIG_SCANLINE_ORDERING` = 3;
public const val `DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED_UPPERFIELDFIRST`: `DISPLAYCONFIG_SCANLINE_ORDERING` = 2;
public const val `DISPLAYCONFIG_SCANLINE_ORDERING_PROGRESSIVE`: `DISPLAYCONFIG_SCANLINE_ORDERING` = 1;
public const val `DISPLAYCONFIG_SCANLINE_ORDERING_UNSPECIFIED`: `DISPLAYCONFIG_SCANLINE_ORDERING` = 0;
// UNSUPPORTED Rust 875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_SDR_WHITE_LEVEL {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub SDRWhiteLevel: u32,
// }

// UNSUPPORTED Rust 881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub Anonymous: DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0,
// }

// UNSUPPORTED Rust 887:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 892:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0 {
//     pub Anonymous: DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 898:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 908:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub Anonymous: DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0,
//     pub specializationType: windows_sys::core::GUID,
//     pub specializationSubType: windows_sys::core::GUID,
//     pub specializationApplicationName: [u16; 128],
// }

// UNSUPPORTED Rust 917:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 922:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0 {
//     pub Anonymous: DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 928:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 933:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_SET_TARGET_PERSISTENCE {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub Anonymous: DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0,
// }

// UNSUPPORTED Rust 944:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SET_TARGET_PERSISTENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 949:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0 {
//     pub Anonymous: DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 955:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 965:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_SOURCE_DEVICE_NAME {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub viewGdiDeviceName: [u16; 32],
// }

// UNSUPPORTED Rust 971:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SOURCE_DEVICE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 976:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_SOURCE_MODE {
//     pub width: u32,
//     pub height: u32,
//     pub pixelFormat: DISPLAYCONFIG_PIXELFORMAT,
//     pub position: super::super::Foundation::POINTL,
// }

// UNSUPPORTED Rust 984:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub Anonymous: DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0,
// }

// UNSUPPORTED Rust 990:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 995:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0 {
//     pub Anonymous: DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 1001:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1011:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_TARGET_BASE_TYPE {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub baseOutputTechnology: DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY,
// }

// UNSUPPORTED Rust 1017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_TARGET_DEVICE_NAME {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub flags: DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS,
//     pub outputTechnology: DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY,
//     pub edidManufactureId: u16,
//     pub edidProductCodeId: u16,
//     pub connectorInstance: u32,
//     pub monitorFriendlyDeviceName: [u16; 64],
//     pub monitorDevicePath: [u16; 128],
// }

// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_TARGET_DEVICE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1034:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS {
//     pub Anonymous: DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0,
// }

// UNSUPPORTED Rust 1039:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1044:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0 {
//     pub Anonymous: DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0_0,
//     pub value: u32,
// }

// UNSUPPORTED Rust 1050:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1055:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1060:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_TARGET_MODE {
//     pub targetVideoSignalInfo: DISPLAYCONFIG_VIDEO_SIGNAL_INFO,
// }

// UNSUPPORTED Rust 1065:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_TARGET_MODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1070:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_TARGET_PREFERRED_MODE {
//     pub header: DISPLAYCONFIG_DEVICE_INFO_HEADER,
//     pub width: u32,
//     pub height: u32,
//     pub targetMode: DISPLAYCONFIG_TARGET_MODE,
// }

// UNSUPPORTED Rust 1078:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_TARGET_PREFERRED_MODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DISPLAYCONFIG_TOPOLOGY_CLONE`: `DISPLAYCONFIG_TOPOLOGY_ID` = 2;
public const val `DISPLAYCONFIG_TOPOLOGY_EXTEND`: `DISPLAYCONFIG_TOPOLOGY_ID` = 4;
public const val `DISPLAYCONFIG_TOPOLOGY_EXTERNAL`: `DISPLAYCONFIG_TOPOLOGY_ID` = 8;
public typealias `DISPLAYCONFIG_TOPOLOGY_ID` = Int;
public const val `DISPLAYCONFIG_TOPOLOGY_INTERNAL`: `DISPLAYCONFIG_TOPOLOGY_ID` = 1;
public typealias `DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY` = Int;
// UNSUPPORTED Rust 1089:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISPLAYCONFIG_VIDEO_SIGNAL_INFO {
//     pub pixelRate: u64,
//     pub hSyncFreq: DISPLAYCONFIG_RATIONAL,
//     pub vSyncFreq: DISPLAYCONFIG_RATIONAL,
//     pub activeSize: DISPLAYCONFIG_2DREGION,
//     pub totalSize: DISPLAYCONFIG_2DREGION,
//     pub Anonymous: DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0,
//     pub scanLineOrdering: DISPLAYCONFIG_SCANLINE_ORDERING,
// }

// UNSUPPORTED Rust 1100:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_VIDEO_SIGNAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1105:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0 {
//     pub AdditionalSignalInfo: DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0_0,
//     pub videoStandard: u32,
// }

// UNSUPPORTED Rust 1111:1: declaration Impl has no candidate rule
// impl Default for DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1116:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0_0 {
//     pub _bitfield: u32,
// }

public const val `DISPLAYPOLICY_AC`: UInt = 1u;
public const val `DISPLAYPOLICY_DC`: UInt = 2u;
// UNSUPPORTED Rust 1123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DISPLAY_BRIGHTNESS {
//     pub ucDisplayPolicy: u8,
//     pub ucACBrightness: u8,
//     pub ucDCBrightness: u8,
// }

public const val `DM_DEFAULT`: UInt = 1u;
public const val `DM_MONOCHROME`: UInt = 2u;
public const val `DN_ACCELERATION_LEVEL`: UInt = 1u;
public const val `DN_ASSOCIATE_WINDOW`: UInt = 5u;
public const val `DN_COMPOSITION_CHANGED`: UInt = 6u;
public const val `DN_DEVICE_ORIGIN`: UInt = 2u;
public const val `DN_DRAWING_BEGIN`: UInt = 4u;
public const val `DN_DRAWING_BEGIN_APIBITMAP`: UInt = 7u;
public const val `DN_SLEEP_MODE`: UInt = 3u;
public const val `DN_SURFOBJ_DESTRUCTION`: UInt = 8u;
public const val `DRD_ERROR`: UInt = 1u;
public const val `DRD_SUCCESS`: UInt = 0u;
public const val `DRH_APIBITMAP`: UInt = 1u;
// UNSUPPORTED Rust 1143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRH_APIBITMAPDATA {
//     pub pso: *mut SURFOBJ,
//     pub b: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1149:1: declaration Impl has no candidate rule
// impl Default for DRH_APIBITMAPDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRIVEROBJ {
//     pub pvObj: *mut core::ffi::c_void,
//     pub pFreeProc: FREEOBJPROC,
//     pub hdev: HDEV,
//     pub dhpdev: DHPDEV,
// }

// UNSUPPORTED Rust 1162:1: declaration Impl has no candidate rule
// impl Default for DRIVEROBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1167:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DRVENABLEDATA {
//     pub iDriverVersion: u32,
//     pub c: u32,
//     pub pdrvfn: *mut DRVFN,
// }

// UNSUPPORTED Rust 1174:1: declaration Impl has no candidate rule
// impl Default for DRVENABLEDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DRVFN {
//     pub iFunc: u32,
//     pub pfn: PFN,
// }

public const val `DRVQUERY_USERMODE`: UInt = 1u;
public const val `DSI_CHECKSUM_ERROR_CORRECTED`: UInt = 256u;
public const val `DSI_CHECKSUM_ERROR_NOT_CORRECTED`: UInt = 512u;
public const val `DSI_CONTENTION_DETECTED`: UInt = 128u;
public typealias `DSI_CONTROL_TRANSMISSION_MODE` = Int;
public const val `DSI_DSI_DATA_TYPE_NOT_RECOGNIZED`: UInt = 2048u;
public const val `DSI_DSI_PROTOCOL_VIOLATION`: UInt = 32768u;
public const val `DSI_DSI_VC_ID_INVALID`: UInt = 4096u;
public const val `DSI_EOT_SYNC_ERROR`: UInt = 4u;
public const val `DSI_ESCAPE_MODE_ENTRY_COMMAND_ERROR`: UInt = 8u;
public const val `DSI_FALSE_CONTROL_ERROR`: UInt = 64u;
public const val `DSI_INVALID_PACKET_INDEX`: UInt = 255u;
public const val `DSI_INVALID_TRANSMISSION_LENGTH`: UInt = 8192u;
public const val `DSI_LONG_PACKET_PAYLOAD_CHECKSUM_ERROR`: UInt = 1024u;
public const val `DSI_LOW_POWER_TRANSMIT_SYNC_ERROR`: UInt = 16u;
public const val `DSI_PACKET_EMBEDDED_PAYLOAD_SIZE`: UInt = 8u;
public const val `DSI_PERIPHERAL_TIMEOUT_ERROR`: UInt = 32u;
public const val `DSI_SOT_ERROR`: UInt = 1u;
public const val `DSI_SOT_SYNC_ERROR`: UInt = 2u;
public const val `DSS_FLUSH_EVENT`: UInt = 2u;
public const val `DSS_RESERVED`: UInt = 4u;
public const val `DSS_RESERVED1`: UInt = 8u;
public const val `DSS_RESERVED2`: UInt = 16u;
public const val `DSS_TIMER_EVENT`: UInt = 1u;
// UNSUPPORTED Rust 1209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DXGK_WIN32K_PARAM_DATA {
//     pub PathsArray: *mut core::ffi::c_void,
//     pub ModesArray: *mut core::ffi::c_void,
//     pub NumPathArrayElements: u32,
//     pub NumModeArrayElements: u32,
//     pub SDCFlags: u32,
// }

// UNSUPPORTED Rust 1218:1: declaration Impl has no candidate rule
// impl Default for DXGK_WIN32K_PARAM_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DXGK_WIN32K_PARAM_FLAG_DISABLEVIEW`: UInt = 4u;
public const val `DXGK_WIN32K_PARAM_FLAG_MODESWITCH`: UInt = 2u;
public const val `DXGK_WIN32K_PARAM_FLAG_UPDATEREGISTRY`: UInt = 1u;
// UNSUPPORTED Rust 1226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DisplayMode {
//     pub DeviceName: [u16; 32],
//     pub devMode: super::super::Graphics::Gdi::DEVMODEW,
// }

// UNSUPPORTED Rust 1233:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DisplayMode {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1239:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct DisplayModes {
//     pub numDisplayModes: i32,
//     pub displayMode: [DisplayMode; 1],
// }

// UNSUPPORTED Rust 1246:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for DisplayModes {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ECS_REDRAW`: UInt = 2u;
public const val `ECS_TEARDOWN`: UInt = 1u;
public const val `ED_ABORTDOC`: UInt = 1u;
public const val `EHN_ERROR`: UInt = 1u;
public const val `EHN_RESTORED`: UInt = 0u;
// UNSUPPORTED Rust 1257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct EMFINFO {
//     pub nSize: u32,
//     pub hdc: super::super::Graphics::Gdi::HDC,
//     pub pvEMF: *mut u8,
//     pub pvCurrentRecord: *mut u8,
// }

// UNSUPPORTED Rust 1266:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for EMFINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENDCAP_BUTT`: Int = 2;
public const val `ENDCAP_ROUND`: Int = 0;
public const val `ENDCAP_SQUARE`: Int = 1;
// UNSUPPORTED Rust 1275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENGSAFESEMAPHORE {
//     pub hsem: HSEMAPHORE,
//     pub lCount: i32,
// }

// UNSUPPORTED Rust 1281:1: declaration Impl has no candidate rule
// impl Default for ENGSAFESEMAPHORE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ENG_DEVICE_ATTRIBUTE` = Int;
// UNSUPPORTED Rust 1287:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENG_EVENT {
//     pub pKEvent: *mut core::ffi::c_void,
//     pub fFlags: u32,
// }

// UNSUPPORTED Rust 1293:1: declaration Impl has no candidate rule
// impl Default for ENG_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENG_FNT_CACHE_READ_FAULT`: UInt = 1u;
public const val `ENG_FNT_CACHE_WRITE_FAULT`: UInt = 2u;
public typealias `ENG_SYSTEM_ATTRIBUTE` = Int;
// UNSUPPORTED Rust 1301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ENG_TIME_FIELDS {
//     pub usYear: u16,
//     pub usMonth: u16,
//     pub usDay: u16,
//     pub usHour: u16,
//     pub usMinute: u16,
//     pub usSecond: u16,
//     pub usMilliseconds: u16,
//     pub usWeekday: u16,
// }

// UNSUPPORTED Rust 1313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUMRECTS {
//     pub c: u32,
//     pub arcl: [super::super::Foundation::RECTL; 1],
// }

// UNSUPPORTED Rust 1319:1: declaration Impl has no candidate rule
// impl Default for ENUMRECTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EngNumberOfProcessors`: `ENG_SYSTEM_ATTRIBUTE` = 2;
public const val `EngOptimumAvailableSystemMemory`: `ENG_SYSTEM_ATTRIBUTE` = 4;
public const val `EngOptimumAvailableUserMemory`: `ENG_SYSTEM_ATTRIBUTE` = 3;
public const val `EngProcessorFeature`: `ENG_SYSTEM_ATTRIBUTE` = 1;
public const val `FC_COMPLEX`: UInt = 3u;
public const val `FC_RECT`: UInt = 1u;
public const val `FC_RECT4`: UInt = 2u;
public const val `FDM_TYPE_BM_SIDE_CONST`: UInt = 1u;
public const val `FDM_TYPE_CHAR_INC_EQUAL_BM_BASE`: UInt = 4u;
public const val `FDM_TYPE_CONST_BEARINGS`: UInt = 16u;
public const val `FDM_TYPE_MAXEXT_EQUAL_BM_SIDE`: UInt = 2u;
public const val `FDM_TYPE_ZERO_BEARINGS`: UInt = 8u;
// UNSUPPORTED Rust 1336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FD_DEVICEMETRICS {
//     pub flRealizedType: u32,
//     pub pteBase: POINTE,
//     pub pteSide: POINTE,
//     pub lD: i32,
//     pub fxMaxAscender: i32,
//     pub fxMaxDescender: i32,
//     pub ptlUnderline1: super::super::Foundation::POINTL,
//     pub ptlStrikeOut: super::super::Foundation::POINTL,
//     pub ptlULThickness: super::super::Foundation::POINTL,
//     pub ptlSOThickness: super::super::Foundation::POINTL,
//     pub cxMax: u32,
//     pub cyMax: u32,
//     pub cjGlyphMax: u32,
//     pub fdxQuantized: FD_XFORM,
//     pub lNonLinearExtLeading: i32,
//     pub lNonLinearIntLeading: i32,
//     pub lNonLinearMaxCharWidth: i32,
//     pub lNonLinearAvgCharWidth: i32,
//     pub lMinA: i32,
//     pub lMinC: i32,
//     pub lMinD: i32,
//     pub alReserved: [i32; 1],
// }

// UNSUPPORTED Rust 1362:1: declaration Impl has no candidate rule
// impl Default for FD_DEVICEMETRICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FD_ERROR`: UInt = 4294967295u;
// UNSUPPORTED Rust 1368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FD_GLYPHATTR {
//     pub cjThis: u32,
//     pub cGlyphs: u32,
//     pub iMode: u32,
//     pub aGlyphAttr: [u8; 1],
// }

// UNSUPPORTED Rust 1376:1: declaration Impl has no candidate rule
// impl Default for FD_GLYPHATTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1381:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FD_GLYPHSET {
//     pub cjThis: u32,
//     pub flAccel: u32,
//     pub cGlyphsSupported: u32,
//     pub cRuns: u32,
//     pub awcrun: [WCRUN; 1],
// }

// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule
// impl Default for FD_GLYPHSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1395:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FD_KERNINGPAIR {
//     pub wcFirst: u16,
//     pub wcSecond: u16,
//     pub fwdKern: i16,
// }

// UNSUPPORTED Rust 1402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FD_LIGATURE {
//     pub culThis: u32,
//     pub ulType: u32,
//     pub cLigatures: u32,
//     pub alig: [LIGATURE; 1],
// }

// UNSUPPORTED Rust 1410:1: declaration Impl has no candidate rule
// impl Default for FD_LIGATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FD_NEGATIVE_FONT`: Int = 1;
// UNSUPPORTED Rust 1416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct FD_XFORM {
//     pub eXX: u32,
//     pub eXY: u32,
//     pub eYX: u32,
//     pub eYY: u32,
// }

// UNSUPPORTED Rust 1425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct FD_XFORM {
//     pub eXX: f32,
//     pub eXY: f32,
//     pub eYX: f32,
//     pub eYY: f32,
// }

public const val `FF_IGNORED_SIGNATURE`: UInt = 2u;
public const val `FF_SIGNATURE_VERIFIED`: UInt = 1u;
// UNSUPPORTED Rust 1436:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct FLOATOBJ {
//     pub ul1: u32,
//     pub ul2: u32,
// }

// UNSUPPORTED Rust 1443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct FLOATOBJ_XFORM {
//     pub eM11: FLOATOBJ,
//     pub eM12: FLOATOBJ,
//     pub eM21: FLOATOBJ,
//     pub eM22: FLOATOBJ,
//     pub eDx: FLOATOBJ,
//     pub eDy: FLOATOBJ,
// }

// UNSUPPORTED Rust 1454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct FLOATOBJ_XFORM {
//     pub eM11: f32,
//     pub eM12: f32,
//     pub eM21: f32,
//     pub eM22: f32,
//     pub eDx: f32,
//     pub eDy: f32,
// }

// UNSUPPORTED Rust 1465:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub union FLOAT_LONG {
//     pub e: u32,
//     pub l: i32,
// }

// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FLOAT_LONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1478:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union FLOAT_LONG {
//     pub e: f32,
//     pub l: i32,
// }

// UNSUPPORTED Rust 1485:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FLOAT_LONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FL_NONPAGED_MEMORY`: UInt = 2u;
public const val `FL_NON_SESSION`: UInt = 4u;
public const val `FL_ZERO_MEMORY`: UInt = 1u;
public const val `FM_EDITABLE_EMBED`: UInt = 8u;
public const val `FM_INFO_16BPP`: UInt = 256u;
public const val `FM_INFO_1BPP`: UInt = 32u;
public const val `FM_INFO_24BPP`: UInt = 512u;
public const val `FM_INFO_32BPP`: UInt = 1024u;
public const val `FM_INFO_4BPP`: UInt = 64u;
public const val `FM_INFO_8BPP`: UInt = 128u;
public const val `FM_INFO_90DEGREE_ROTATIONS`: UInt = 2097152u;
public const val `FM_INFO_ANISOTROPIC_SCALING_ONLY`: UInt = 33554432u;
public const val `FM_INFO_ARB_XFORMS`: UInt = 16u;
public const val `FM_INFO_CONSTANT_WIDTH`: UInt = 4096u;
public const val `FM_INFO_DBCS_FIXED_PITCH`: UInt = 268435456u;
public const val `FM_INFO_DO_NOT_ENUMERATE`: UInt = 8388608u;
public const val `FM_INFO_DSIG`: UInt = 262144u;
public const val `FM_INFO_FAMILY_EQUIV`: UInt = 134217728u;
public const val `FM_INFO_IGNORE_TC_RA_ABLE`: UInt = 1073741824u;
public const val `FM_INFO_INTEGER_WIDTH`: UInt = 2048u;
public const val `FM_INFO_INTEGRAL_SCALING`: UInt = 1048576u;
public const val `FM_INFO_ISOTROPIC_SCALING_ONLY`: UInt = 16777216u;
public const val `FM_INFO_NONNEGATIVE_AC`: UInt = 536870912u;
public const val `FM_INFO_NOT_CONTIGUOUS`: UInt = 8192u;
public const val `FM_INFO_OPTICALLY_FIXED_PITCH`: UInt = 4194304u;
public const val `FM_INFO_RETURNS_BITMAPS`: UInt = 131072u;
public const val `FM_INFO_RETURNS_OUTLINES`: UInt = 32768u;
public const val `FM_INFO_RETURNS_STROKES`: UInt = 65536u;
public const val `FM_INFO_RIGHT_HANDED`: UInt = 524288u;
public const val `FM_INFO_TECH_BITMAP`: UInt = 2u;
public const val `FM_INFO_TECH_CFF`: UInt = 67108864u;
public const val `FM_INFO_TECH_MM`: UInt = 16384u;
public const val `FM_INFO_TECH_OUTLINE_NOT_TRUETYPE`: UInt = 8u;
public const val `FM_INFO_TECH_STROKE`: UInt = 4u;
public const val `FM_INFO_TECH_TRUETYPE`: UInt = 1u;
public const val `FM_INFO_TECH_TYPE1`: UInt = 2147483648u;
public const val `FM_NO_EMBEDDING`: UInt = 2u;
public const val `FM_PANOSE_CULTURE_LATIN`: UInt = 0u;
public const val `FM_READONLY_EMBED`: UInt = 4u;
public const val `FM_SEL_BOLD`: UInt = 32u;
public const val `FM_SEL_ITALIC`: UInt = 1u;
public const val `FM_SEL_NEGATIVE`: UInt = 4u;
public const val `FM_SEL_OUTLINED`: UInt = 8u;
public const val `FM_SEL_REGULAR`: UInt = 64u;
public const val `FM_SEL_STRIKEOUT`: UInt = 16u;
public const val `FM_SEL_UNDERSCORE`: UInt = 2u;
public const val `FM_TYPE_LICENSED`: UInt = 2u;
public const val `FM_VERSION_NUMBER`: UInt = 0u;
// UNSUPPORTED Rust 1539:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FONTDIFF {
//     pub jReserved1: u8,
//     pub jReserved2: u8,
//     pub jReserved3: u8,
//     pub bWeight: u8,
//     pub usWinWeight: u16,
//     pub fsSelection: u16,
//     pub fwdAveCharWidth: i16,
//     pub fwdMaxCharInc: i16,
//     pub ptlCaret: super::super::Foundation::POINTL,
// }

// UNSUPPORTED Rust 1552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FONTINFO {
//     pub cjThis: u32,
//     pub flCaps: u32,
//     pub cGlyphsSupported: u32,
//     pub cjMaxGlyph1: u32,
//     pub cjMaxGlyph4: u32,
//     pub cjMaxGlyph8: u32,
//     pub cjMaxGlyph32: u32,
// }

// UNSUPPORTED Rust 1563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FONTOBJ {
//     pub iUniq: u32,
//     pub iFace: u32,
//     pub cxMax: u32,
//     pub flFontType: u32,
//     pub iTTUniq: usize,
//     pub iFile: usize,
//     pub sizLogResPpi: super::super::Foundation::SIZE,
//     pub ulStyleSize: u32,
//     pub pvConsumer: *mut core::ffi::c_void,
//     pub pvProducer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1577:1: declaration Impl has no candidate rule
// impl Default for FONTOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1582:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FONTSIM {
//     pub dpBold: i32,
//     pub dpItalic: i32,
//     pub dpBoldItalic: i32,
// }

// UNSUPPORTED Rust 1589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Console")]
// #[derive(Clone, Copy)]
// pub struct FONT_IMAGE_INFO {
//     pub FontSize: super::super::System::Console::COORD,
//     pub ImageBits: *mut u8,
// }

// UNSUPPORTED Rust 1596:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Console")]
// impl Default for FONT_IMAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FO_ATTR_MODE_ROTATE`: UInt = 1u;
public const val `FO_CFF`: UInt = 1048576u;
public const val `FO_CLEARTYPENATURAL_X`: UInt = 1073741824u;
public const val `FO_CLEARTYPE_X`: UInt = 268435456u;
public const val `FO_CLEARTYPE_Y`: UInt = 536870912u;
public const val `FO_DBCS_FONT`: UInt = 16777216u;
public const val `FO_DEVICE_FONT`: Int = 1;
public const val `FO_EM_HEIGHT`: UInt = 32768u;
public const val `FO_GLYPHBITS`: Int = 1;
public const val `FO_GRAY16`: UInt = 65536u;
public const val `FO_HGLYPHS`: Int = 0;
public const val `FO_MULTIPLEMASTER`: UInt = 4194304u;
public const val `FO_NOCLEARTYPE`: UInt = 33554432u;
public const val `FO_NOGRAY16`: UInt = 131072u;
public const val `FO_NOHINTS`: UInt = 262144u;
public const val `FO_NO_CHOICE`: UInt = 524288u;
public const val `FO_OUTLINE_CAPABLE`: Int = 2;
public const val `FO_PATHOBJ`: Int = 2;
public const val `FO_POSTSCRIPT`: UInt = 2097152u;
public const val `FO_SIM_BOLD`: UInt = 8192u;
public const val `FO_SIM_ITALIC`: UInt = 16384u;
public const val `FO_VERT_FACE`: UInt = 8388608u;
public const val `FP_ALTERNATEMODE`: Int = 1;
public const val `FP_WINDINGMODE`: Int = 2;
// UNSUPPORTED Rust 1626:1: generic scalar type unsupported
// pub type FREEOBJPROC = Option<unsafe extern "system" fn(pdriverobj: *mut DRIVEROBJ) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1627:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Console")]
// #[derive(Clone, Copy, Default)]
// pub struct FSCNTL_SCREEN_INFO {
//     pub Position: super::super::System::Console::COORD,
//     pub ScreenSize: super::super::System::Console::COORD,
//     pub nNumberOfChars: u32,
// }

// UNSUPPORTED Rust 1635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Console")]
// #[derive(Clone, Copy, Default)]
// pub struct FSVIDEO_COPY_FRAME_BUFFER {
//     pub SrcScreen: FSCNTL_SCREEN_INFO,
//     pub DestScreen: FSCNTL_SCREEN_INFO,
// }

// UNSUPPORTED Rust 1642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSVIDEO_CURSOR_POSITION {
//     pub Coord: VIDEO_CURSOR_POSITION,
//     pub dwType: u32,
// }

// UNSUPPORTED Rust 1648:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FSVIDEO_MODE_INFORMATION {
//     pub VideoMode: VIDEO_MODE_INFORMATION,
//     pub VideoMemory: VIDEO_MEMORY_INFORMATION,
// }

// UNSUPPORTED Rust 1654:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Console")]
// #[derive(Clone, Copy, Default)]
// pub struct FSVIDEO_REVERSE_MOUSE_POINTER {
//     pub Screen: FSCNTL_SCREEN_INFO,
//     pub dwType: u32,
// }

// UNSUPPORTED Rust 1661:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Console")]
// #[derive(Clone, Copy, Default)]
// pub struct FSVIDEO_SCREEN_INFORMATION {
//     pub ScreenSize: super::super::System::Console::COORD,
//     pub FontSize: super::super::System::Console::COORD,
// }

// UNSUPPORTED Rust 1668:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Console")]
// #[derive(Clone, Copy)]
// pub struct FSVIDEO_WRITE_TO_FRAME_BUFFER {
//     pub SrcBuffer: *mut CHAR_IMAGE_INFO,
//     pub DestScreen: FSCNTL_SCREEN_INFO,
// }

// UNSUPPORTED Rust 1675:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Console")]
// impl Default for FSVIDEO_WRITE_TO_FRAME_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GAMMARAMP {
//     pub Red: [u16; 256],
//     pub Green: [u16; 256],
//     pub Blue: [u16; 256],
// }

// UNSUPPORTED Rust 1688:1: declaration Impl has no candidate rule
// impl Default for GAMMARAMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GAMMA_RAMP_DXGI_1 {
//     pub Scale: GAMMA_RAMP_RGB,
//     pub Offset: GAMMA_RAMP_RGB,
//     pub GammaCurve: [GAMMA_RAMP_RGB; 1025],
// }

// UNSUPPORTED Rust 1700:1: declaration Impl has no candidate rule
// impl Default for GAMMA_RAMP_DXGI_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1705:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GAMMA_RAMP_RGB {
//     pub Red: f32,
//     pub Green: f32,
//     pub Blue: f32,
// }

// UNSUPPORTED Rust 1712:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GAMMA_RAMP_RGB256x3x16 {
//     pub Red: [u16; 256],
//     pub Green: [u16; 256],
//     pub Blue: [u16; 256],
// }

// UNSUPPORTED Rust 1719:1: declaration Impl has no candidate rule
// impl Default for GAMMA_RAMP_RGB256x3x16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GCAPS2_ACC_DRIVER`: UInt = 32768u;
public const val `GCAPS2_ALPHACURSOR`: UInt = 32u;
public const val `GCAPS2_BITMAPEXREUSE`: UInt = 65536u;
public const val `GCAPS2_CHANGEGAMMARAMP`: UInt = 16u;
public const val `GCAPS2_CLEARTYPE`: UInt = 16384u;
public const val `GCAPS2_EXCLUDELAYERED`: UInt = 2048u;
public const val `GCAPS2_ICD_MULTIMON`: UInt = 256u;
public const val `GCAPS2_INCLUDEAPIBITMAPS`: UInt = 4096u;
public const val `GCAPS2_JPEGSRC`: UInt = 1u;
public const val `GCAPS2_MOUSETRAILS`: UInt = 512u;
public const val `GCAPS2_PNGSRC`: UInt = 8u;
public const val `GCAPS2_REMOTEDRIVER`: UInt = 1024u;
public const val `GCAPS2_RESERVED1`: UInt = 1024u;
public const val `GCAPS2_SHOWHIDDENPOINTER`: UInt = 8192u;
public const val `GCAPS2_SYNCFLUSH`: UInt = 64u;
public const val `GCAPS2_SYNCTIMER`: UInt = 128u;
public const val `GCAPS2_xxxx`: UInt = 2u;
public const val `GCAPS_ALTERNATEFILL`: UInt = 4u;
public const val `GCAPS_ARBRUSHOPAQUE`: UInt = 32768u;
public const val `GCAPS_ARBRUSHTEXT`: UInt = 268435456u;
public const val `GCAPS_ASYNCCHANGE`: UInt = 2048u;
public const val `GCAPS_ASYNCMOVE`: UInt = 4096u;
public const val `GCAPS_BEZIERS`: UInt = 1u;
public const val `GCAPS_CMYKCOLOR`: UInt = 67108864u;
public const val `GCAPS_COLOR_DITHER`: UInt = 32u;
public const val `GCAPS_DIRECTDRAW`: UInt = 16384u;
public const val `GCAPS_DITHERONREALIZE`: UInt = 2097152u;
public const val `GCAPS_DONTJOURNAL`: UInt = 8192u;
public const val `GCAPS_FONT_RASTERIZER`: UInt = 1073741824u;
public const val `GCAPS_FORCEDITHER`: UInt = 8388608u;
public const val `GCAPS_GEOMETRICWIDE`: UInt = 2u;
public const val `GCAPS_GRAY16`: UInt = 16777216u;
public const val `GCAPS_HALFTONE`: UInt = 16u;
public const val `GCAPS_HIGHRESTEXT`: UInt = 262144u;
public const val `GCAPS_HORIZSTRIKE`: UInt = 64u;
public const val `GCAPS_ICM`: UInt = 33554432u;
public const val `GCAPS_LAYERED`: UInt = 134217728u;
public const val `GCAPS_MONO_DITHER`: UInt = 1024u;
public const val `GCAPS_NO64BITMEMACCESS`: UInt = 4194304u;
public const val `GCAPS_NUP`: UInt = 2147483648u;
public const val `GCAPS_OPAQUERECT`: UInt = 256u;
public const val `GCAPS_PALMANAGED`: UInt = 524288u;
public const val `GCAPS_PANNING`: UInt = 65536u;
public const val `GCAPS_SCREENPRECISION`: UInt = 536870912u;
public const val `GCAPS_VECTORFONT`: UInt = 512u;
public const val `GCAPS_VERTSTRIKE`: UInt = 128u;
public const val `GCAPS_WINDINGFILL`: UInt = 8u;
// UNSUPPORTED Rust 1771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GDIINFO {
//     pub ulVersion: u32,
//     pub ulTechnology: u32,
//     pub ulHorzSize: u32,
//     pub ulVertSize: u32,
//     pub ulHorzRes: u32,
//     pub ulVertRes: u32,
//     pub cBitsPixel: u32,
//     pub cPlanes: u32,
//     pub ulNumColors: u32,
//     pub flRaster: u32,
//     pub ulLogPixelsX: u32,
//     pub ulLogPixelsY: u32,
//     pub flTextCaps: u32,
//     pub ulDACRed: u32,
//     pub ulDACGreen: u32,
//     pub ulDACBlue: u32,
//     pub ulAspectX: u32,
//     pub ulAspectY: u32,
//     pub ulAspectXY: u32,
//     pub xStyleStep: i32,
//     pub yStyleStep: i32,
//     pub denStyleStep: i32,
//     pub ptlPhysOffset: super::super::Foundation::POINTL,
//     pub szlPhysSize: super::super::Foundation::SIZE,
//     pub ulNumPalReg: u32,
//     pub ciDevice: COLORINFO,
//     pub ulDevicePelsDPI: u32,
//     pub ulPrimaryOrder: u32,
//     pub ulHTPatternSize: u32,
//     pub ulHTOutputFormat: u32,
//     pub flHTFlags: u32,
//     pub ulVRefresh: u32,
//     pub ulBltAlignment: u32,
//     pub ulPanningHorzRes: u32,
//     pub ulPanningVertRes: u32,
//     pub xPanningAlignment: u32,
//     pub yPanningAlignment: u32,
//     pub cxHTPat: u32,
//     pub cyHTPat: u32,
//     pub pHTPatA: *mut u8,
//     pub pHTPatB: *mut u8,
//     pub pHTPatC: *mut u8,
//     pub flShadeBlend: u32,
//     pub ulPhysicalPixelCharacteristics: u32,
//     pub ulPhysicalPixelGamma: u32,
// }

// UNSUPPORTED Rust 1820:1: declaration Impl has no candidate rule
// impl Default for GDIINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GDI_DRIVER_VERSION`: UInt = 16384u;
public const val `GETCONNECTEDIDS_SOURCE`: UInt = 1u;
public const val `GETCONNECTEDIDS_TARGET`: UInt = 0u;
// UNSUPPORTED Rust 1828:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GLYPHBITS {
//     pub ptlOrigin: super::super::Foundation::POINTL,
//     pub sizlBitmap: super::super::Foundation::SIZE,
//     pub aj: [u8; 1],
// }

// UNSUPPORTED Rust 1835:1: declaration Impl has no candidate rule
// impl Default for GLYPHBITS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GLYPHDATA {
//     pub gdf: GLYPHDEF,
//     pub hg: u32,
//     pub fxD: i32,
//     pub fxA: i32,
//     pub fxAB: i32,
//     pub fxInkTop: i32,
//     pub fxInkBottom: i32,
//     pub rclInk: super::super::Foundation::RECTL,
//     pub ptqD: POINTQF,
// }

// UNSUPPORTED Rust 1853:1: declaration Impl has no candidate rule
// impl Default for GLYPHDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1858:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union GLYPHDEF {
//     pub pgb: *mut GLYPHBITS,
//     pub ppo: *mut PATHOBJ,
// }

// UNSUPPORTED Rust 1864:1: declaration Impl has no candidate rule
// impl Default for GLYPHDEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1869:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GLYPHPOS {
//     pub hg: u32,
//     pub pgdf: *mut GLYPHDEF,
//     pub ptl: super::super::Foundation::POINTL,
// }

// UNSUPPORTED Rust 1876:1: declaration Impl has no candidate rule
// impl Default for GLYPHPOS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GS_16BIT_HANDLES`: UInt = 4u;
public const val `GS_8BIT_HANDLES`: UInt = 2u;
public const val `GS_UNICODE_HANDLES`: UInt = 1u;
// UNSUPPORTED Rust 1884:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_DISPLAY_ADAPTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5b45201d_f2f2_4f3b_85bb_30ff1f953599);

// UNSUPPORTED Rust 1885:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_MONITOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6f07b5f_ee97_4a90_b076_33f57bf4eaa7);

// UNSUPPORTED Rust 1886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_VIDEO_OUTPUT_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ad9e4f0_f88d_4360_bab9_4c2d55e564cd);

// UNSUPPORTED Rust 1887:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DISPLAY_DEVICE_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ca05180_a699_450a_9a0c_de4fbe3ddd89);

// UNSUPPORTED Rust 1888:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_MONITOR_OVERRIDE_PSEUDO_SPECIALIZED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf196c02f_f86f_4f9a_aa15_e9cebdfe3b96);

public const val `GX_GENERAL`: Int = 3;
public const val `GX_IDENTITY`: Int = 0;
public const val `GX_OFFSET`: Int = 1;
public const val `GX_SCALE`: Int = 2;
// UNSUPPORTED Rust 1893:1: non-scalar type Ptr unsupported
// pub type HBM = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1894:1: non-scalar type Ptr unsupported
// pub type HDEV = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1895:1: non-scalar type Ptr unsupported
// pub type HDRVOBJ = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1896:1: non-scalar type Ptr unsupported
// pub type HFASTMUTEX = *mut core::ffi::c_void;

public const val `HOOK_ALPHABLEND`: UInt = 65536u;
public const val `HOOK_BITBLT`: UInt = 1u;
public const val `HOOK_COPYBITS`: UInt = 1024u;
public const val `HOOK_FILLPATH`: UInt = 64u;
public const val `HOOK_FLAGS`: UInt = 243199u;
public const val `HOOK_GRADIENTFILL`: UInt = 131072u;
public const val `HOOK_LINETO`: UInt = 256u;
public const val `HOOK_MOVEPANNING`: UInt = 2048u;
public const val `HOOK_PAINT`: UInt = 16u;
public const val `HOOK_PLGBLT`: UInt = 4u;
public const val `HOOK_STRETCHBLT`: UInt = 2u;
public const val `HOOK_STRETCHBLTROP`: UInt = 8192u;
public const val `HOOK_STROKEANDFILLPATH`: UInt = 128u;
public const val `HOOK_STROKEPATH`: UInt = 32u;
public const val `HOOK_SYNCHRONIZE`: UInt = 4096u;
public const val `HOOK_SYNCHRONIZEACCESS`: UInt = 16384u;
public const val `HOOK_TEXTOUT`: UInt = 8u;
public const val `HOOK_TRANSPARENTBLT`: UInt = 32768u;
public const val `HOST_DSI_BAD_TRANSMISSION_MODE`: UInt = 4096u;
public const val `HOST_DSI_DEVICE_NOT_READY`: UInt = 1u;
public const val `HOST_DSI_DEVICE_RESET`: UInt = 4u;
public const val `HOST_DSI_DRIVER_REJECTED_PACKET`: UInt = 1024u;
public const val `HOST_DSI_INTERFACE_RESET`: UInt = 2u;
public const val `HOST_DSI_INVALID_TRANSMISSION`: UInt = 256u;
public const val `HOST_DSI_OS_REJECTED_PACKET`: UInt = 512u;
public const val `HOST_DSI_TRANSMISSION_CANCELLED`: UInt = 16u;
public const val `HOST_DSI_TRANSMISSION_DROPPED`: UInt = 32u;
public const val `HOST_DSI_TRANSMISSION_TIMEOUT`: UInt = 64u;
// UNSUPPORTED Rust 1925:1: non-scalar type Ptr unsupported
// pub type HSEMAPHORE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1926:1: non-scalar type Ptr unsupported
// pub type HSURF = *mut core::ffi::c_void;

public const val `HS_DDI_MAX`: UInt = 6u;
public const val `HT_FLAG_8BPP_CMY332_MASK`: UInt = 4278190080u;
public const val `HT_FLAG_ADDITIVE_PRIMS`: UInt = 4u;
public const val `HT_FLAG_DO_DEVCLR_XFORM`: UInt = 128u;
public const val `HT_FLAG_HAS_BLACK_DYE`: UInt = 2u;
public const val `HT_FLAG_INK_ABSORPTION_IDX0`: UInt = 0u;
public const val `HT_FLAG_INK_ABSORPTION_IDX1`: UInt = 32u;
public const val `HT_FLAG_INK_ABSORPTION_IDX2`: UInt = 64u;
public const val `HT_FLAG_INK_ABSORPTION_IDX3`: UInt = 96u;
public const val `HT_FLAG_INK_ABSORPTION_INDICES`: UInt = 96u;
public const val `HT_FLAG_INK_HIGH_ABSORPTION`: UInt = 16u;
public const val `HT_FLAG_INVERT_8BPP_BITMASK_IDX`: UInt = 1024u;
public const val `HT_FLAG_LOWER_INK_ABSORPTION`: UInt = 64u;
public const val `HT_FLAG_LOWEST_INK_ABSORPTION`: UInt = 96u;
public const val `HT_FLAG_LOW_INK_ABSORPTION`: UInt = 32u;
public const val `HT_FLAG_NORMAL_INK_ABSORPTION`: UInt = 0u;
public const val `HT_FLAG_OUTPUT_CMY`: UInt = 256u;
public const val `HT_FLAG_PRINT_DRAFT_MODE`: UInt = 512u;
public const val `HT_FLAG_SQUARE_DEVICE_PEL`: UInt = 1u;
public const val `HT_FLAG_USE_8BPP_BITMASK`: UInt = 8u;
public const val `HT_FORMAT_16BPP`: UInt = 5u;
public const val `HT_FORMAT_1BPP`: UInt = 0u;
public const val `HT_FORMAT_24BPP`: UInt = 6u;
public const val `HT_FORMAT_32BPP`: UInt = 7u;
public const val `HT_FORMAT_4BPP`: UInt = 2u;
public const val `HT_FORMAT_4BPP_IRGB`: UInt = 3u;
public const val `HT_FORMAT_8BPP`: UInt = 4u;
public const val `HT_PATSIZE_10x10`: UInt = 8u;
public const val `HT_PATSIZE_10x10_M`: UInt = 9u;
public const val `HT_PATSIZE_12x12`: UInt = 10u;
public const val `HT_PATSIZE_12x12_M`: UInt = 11u;
public const val `HT_PATSIZE_14x14`: UInt = 12u;
public const val `HT_PATSIZE_14x14_M`: UInt = 13u;
public const val `HT_PATSIZE_16x16`: UInt = 14u;
public const val `HT_PATSIZE_16x16_M`: UInt = 15u;
public const val `HT_PATSIZE_2x2`: UInt = 0u;
public const val `HT_PATSIZE_2x2_M`: UInt = 1u;
public const val `HT_PATSIZE_4x4`: UInt = 2u;
public const val `HT_PATSIZE_4x4_M`: UInt = 3u;
public const val `HT_PATSIZE_6x6`: UInt = 4u;
public const val `HT_PATSIZE_6x6_M`: UInt = 5u;
public const val `HT_PATSIZE_8x8`: UInt = 6u;
public const val `HT_PATSIZE_8x8_M`: UInt = 7u;
public const val `HT_PATSIZE_DEFAULT`: UInt = 17u;
public const val `HT_PATSIZE_MAX_INDEX`: UInt = 18u;
public const val `HT_PATSIZE_SUPERCELL`: UInt = 16u;
public const val `HT_PATSIZE_SUPERCELL_M`: UInt = 17u;
public const val `HT_PATSIZE_USER`: UInt = 18u;
public const val `HT_USERPAT_CX_MAX`: UInt = 256u;
public const val `HT_USERPAT_CX_MIN`: UInt = 4u;
public const val `HT_USERPAT_CY_MAX`: UInt = 256u;
public const val `HT_USERPAT_CY_MIN`: UInt = 4u;
// UNSUPPORTED Rust 1979:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IFIEXTRA {
//     pub ulIdentifier: u32,
//     pub dpFontSig: i32,
//     pub cig: u32,
//     pub dpDesignVector: i32,
//     pub dpAxesInfoW: i32,
//     pub aulReserved: [u32; 1],
// }

// UNSUPPORTED Rust 1989:1: declaration Impl has no candidate rule
// impl Default for IFIEXTRA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1994:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct IFIMETRICS {
//     pub cjThis: u32,
//     pub cjIfiExtra: u32,
//     pub dpwszFamilyName: i32,
//     pub dpwszStyleName: i32,
//     pub dpwszFaceName: i32,
//     pub dpwszUniqueName: i32,
//     pub dpFontSim: i32,
//     pub lEmbedId: i32,
//     pub lItalicAngle: i32,
//     pub lCharBias: i32,
//     pub dpCharSets: i32,
//     pub jWinCharSet: u8,
//     pub jWinPitchAndFamily: u8,
//     pub usWinWeight: u16,
//     pub flInfo: u32,
//     pub fsSelection: u16,
//     pub fsType: u16,
//     pub fwdUnitsPerEm: i16,
//     pub fwdLowestPPEm: i16,
//     pub fwdWinAscender: i16,
//     pub fwdWinDescender: i16,
//     pub fwdMacAscender: i16,
//     pub fwdMacDescender: i16,
//     pub fwdMacLineGap: i16,
//     pub fwdTypoAscender: i16,
//     pub fwdTypoDescender: i16,
//     pub fwdTypoLineGap: i16,
//     pub fwdAveCharWidth: i16,
//     pub fwdMaxCharInc: i16,
//     pub fwdCapHeight: i16,
//     pub fwdXHeight: i16,
//     pub fwdSubscriptXSize: i16,
//     pub fwdSubscriptYSize: i16,
//     pub fwdSubscriptXOffset: i16,
//     pub fwdSubscriptYOffset: i16,
//     pub fwdSuperscriptXSize: i16,
//     pub fwdSuperscriptYSize: i16,
//     pub fwdSuperscriptXOffset: i16,
//     pub fwdSuperscriptYOffset: i16,
//     pub fwdUnderscoreSize: i16,
//     pub fwdUnderscorePosition: i16,
//     pub fwdStrikeoutSize: i16,
//     pub fwdStrikeoutPosition: i16,
//     pub chFirstChar: u8,
//     pub chLastChar: u8,
//     pub chDefaultChar: u8,
//     pub chBreakChar: u8,
//     pub wcFirstChar: u16,
//     pub wcLastChar: u16,
//     pub wcDefaultChar: u16,
//     pub wcBreakChar: u16,
//     pub ptlBaseline: super::super::Foundation::POINTL,
//     pub ptlAspect: super::super::Foundation::POINTL,
//     pub ptlCaret: super::super::Foundation::POINTL,
//     pub rclFontBox: super::super::Foundation::RECTL,
//     pub achVendId: [u8; 4],
//     pub cKerningPairs: u32,
//     pub ulPanoseCulture: u32,
//     pub panose: super::super::Graphics::Gdi::PANOSE,
// }

// UNSUPPORTED Rust 2059:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for IFIMETRICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct IFIMETRICS {
//     pub cjThis: u32,
//     pub cjIfiExtra: u32,
//     pub dpwszFamilyName: i32,
//     pub dpwszStyleName: i32,
//     pub dpwszFaceName: i32,
//     pub dpwszUniqueName: i32,
//     pub dpFontSim: i32,
//     pub lEmbedId: i32,
//     pub lItalicAngle: i32,
//     pub lCharBias: i32,
//     pub dpCharSets: i32,
//     pub jWinCharSet: u8,
//     pub jWinPitchAndFamily: u8,
//     pub usWinWeight: u16,
//     pub flInfo: u32,
//     pub fsSelection: u16,
//     pub fsType: u16,
//     pub fwdUnitsPerEm: i16,
//     pub fwdLowestPPEm: i16,
//     pub fwdWinAscender: i16,
//     pub fwdWinDescender: i16,
//     pub fwdMacAscender: i16,
//     pub fwdMacDescender: i16,
//     pub fwdMacLineGap: i16,
//     pub fwdTypoAscender: i16,
//     pub fwdTypoDescender: i16,
//     pub fwdTypoLineGap: i16,
//     pub fwdAveCharWidth: i16,
//     pub fwdMaxCharInc: i16,
//     pub fwdCapHeight: i16,
//     pub fwdXHeight: i16,
//     pub fwdSubscriptXSize: i16,
//     pub fwdSubscriptYSize: i16,
//     pub fwdSubscriptXOffset: i16,
//     pub fwdSubscriptYOffset: i16,
//     pub fwdSuperscriptXSize: i16,
//     pub fwdSuperscriptYSize: i16,
//     pub fwdSuperscriptXOffset: i16,
//     pub fwdSuperscriptYOffset: i16,
//     pub fwdUnderscoreSize: i16,
//     pub fwdUnderscorePosition: i16,
//     pub fwdStrikeoutSize: i16,
//     pub fwdStrikeoutPosition: i16,
//     pub chFirstChar: u8,
//     pub chLastChar: u8,
//     pub chDefaultChar: u8,
//     pub chBreakChar: u8,
//     pub wcFirstChar: u16,
//     pub wcLastChar: u16,
//     pub wcDefaultChar: u16,
//     pub wcBreakChar: u16,
//     pub ptlBaseline: super::super::Foundation::POINTL,
//     pub ptlAspect: super::super::Foundation::POINTL,
//     pub ptlCaret: super::super::Foundation::POINTL,
//     pub rclFontBox: super::super::Foundation::RECTL,
//     pub achVendId: [u8; 4],
//     pub cKerningPairs: u32,
//     pub ulPanoseCulture: u32,
//     pub panose: super::super::Graphics::Gdi::PANOSE,
//     pub Align: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2132:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for IFIMETRICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IGRF_RGB_256BYTES`: UInt = 0u;
public const val `IGRF_RGB_256WORDS`: UInt = 1u;
public const val `INDEX_DrvAccumulateD3DDirtyRect`: Int = 98;
public const val `INDEX_DrvAlphaBlend`: Int = 71;
public const val `INDEX_DrvAssertMode`: Int = 5;
public const val `INDEX_DrvAssociateSharedSurface`: Int = 96;
public const val `INDEX_DrvBitBlt`: Int = 18;
public const val `INDEX_DrvCompletePDEV`: Int = 1;
public const val `INDEX_DrvCopyBits`: Int = 19;
public const val `INDEX_DrvCreateDeviceBitmap`: Int = 10;
public const val `INDEX_DrvCreateDeviceBitmapEx`: Int = 94;
public const val `INDEX_DrvDeleteDeviceBitmap`: Int = 11;
public const val `INDEX_DrvDeleteDeviceBitmapEx`: Int = 95;
public const val `INDEX_DrvDeriveSurface`: Int = 85;
public const val `INDEX_DrvDescribePixelFormat`: Int = 55;
public const val `INDEX_DrvDestroyFont`: Int = 43;
public const val `INDEX_DrvDisableDirectDraw`: Int = 61;
public const val `INDEX_DrvDisableDriver`: Int = 8;
public const val `INDEX_DrvDisablePDEV`: Int = 2;
public const val `INDEX_DrvDisableSurface`: Int = 4;
public const val `INDEX_DrvDitherColor`: Int = 13;
public const val `INDEX_DrvDrawEscape`: Int = 25;
public const val `INDEX_DrvEnableDirectDraw`: Int = 60;
public const val `INDEX_DrvEnablePDEV`: Int = 0;
public const val `INDEX_DrvEnableSurface`: Int = 3;
public const val `INDEX_DrvEndDoc`: Int = 34;
public const val `INDEX_DrvEndDxInterop`: Int = 100;
public const val `INDEX_DrvEscape`: Int = 24;
public const val `INDEX_DrvFillPath`: Int = 15;
public const val `INDEX_DrvFontManagement`: Int = 47;
public const val `INDEX_DrvFree`: Int = 42;
public const val `INDEX_DrvGetDirectDrawInfo`: Int = 59;
public const val `INDEX_DrvGetGlyphMode`: Int = 37;
public const val `INDEX_DrvGetModes`: Int = 41;
public const val `INDEX_DrvGetSynthesizedFontFiles`: Int = 73;
public const val `INDEX_DrvGetTrueTypeFile`: Int = 50;
public const val `INDEX_DrvGradientFill`: Int = 68;
public const val `INDEX_DrvIcmCheckBitmapBits`: Int = 66;
public const val `INDEX_DrvIcmCreateColorTransform`: Int = 64;
public const val `INDEX_DrvIcmDeleteColorTransform`: Int = 65;
public const val `INDEX_DrvIcmSetDeviceGammaRamp`: Int = 67;
public const val `INDEX_DrvLineTo`: Int = 31;
public const val `INDEX_DrvLoadFontFile`: Int = 45;
public const val `INDEX_DrvLockDisplayArea`: Int = 101;
public const val `INDEX_DrvMovePanning`: Int = 52;
public const val `INDEX_DrvMovePointer`: Int = 30;
public const val `INDEX_DrvNextBand`: Int = 58;
public const val `INDEX_DrvNotify`: Int = 87;
public const val `INDEX_DrvOffset`: Int = 6;
public const val `INDEX_DrvPaint`: Int = 17;
public const val `INDEX_DrvPlgBlt`: Int = 70;
public const val `INDEX_DrvQueryAdvanceWidths`: Int = 53;
public const val `INDEX_DrvQueryDeviceSupport`: Int = 76;
public const val `INDEX_DrvQueryFont`: Int = 26;
public const val `INDEX_DrvQueryFontCaps`: Int = 44;
public const val `INDEX_DrvQueryFontData`: Int = 28;
public const val `INDEX_DrvQueryFontFile`: Int = 51;
public const val `INDEX_DrvQueryFontTree`: Int = 27;
public const val `INDEX_DrvQueryGlyphAttrs`: Int = 86;
public const val `INDEX_DrvQueryPerBandInfo`: Int = 75;
public const val `INDEX_DrvQuerySpoolType`: Int = 62;
public const val `INDEX_DrvQueryTrueTypeOutline`: Int = 49;
public const val `INDEX_DrvQueryTrueTypeTable`: Int = 48;
public const val `INDEX_DrvRealizeBrush`: Int = 12;
public const val `INDEX_DrvRenderHint`: Int = 93;
public const val `INDEX_DrvReserved1`: Int = 77;
public const val `INDEX_DrvReserved10`: Int = 91;
public const val `INDEX_DrvReserved11`: Int = 92;
public const val `INDEX_DrvReserved2`: Int = 78;
public const val `INDEX_DrvReserved3`: Int = 79;
public const val `INDEX_DrvReserved4`: Int = 80;
public const val `INDEX_DrvReserved5`: Int = 81;
public const val `INDEX_DrvReserved6`: Int = 82;
public const val `INDEX_DrvReserved7`: Int = 83;
public const val `INDEX_DrvReserved8`: Int = 84;
public const val `INDEX_DrvReserved9`: Int = 90;
public const val `INDEX_DrvResetDevice`: Int = 89;
public const val `INDEX_DrvResetPDEV`: Int = 7;
public const val `INDEX_DrvSaveScreenBits`: Int = 40;
public const val `INDEX_DrvSendPage`: Int = 32;
public const val `INDEX_DrvSetPalette`: Int = 22;
public const val `INDEX_DrvSetPixelFormat`: Int = 54;
public const val `INDEX_DrvSetPointerShape`: Int = 29;
public const val `INDEX_DrvStartBanding`: Int = 57;
public const val `INDEX_DrvStartDoc`: Int = 35;
public const val `INDEX_DrvStartDxInterop`: Int = 99;
public const val `INDEX_DrvStartPage`: Int = 33;
public const val `INDEX_DrvStretchBlt`: Int = 20;
public const val `INDEX_DrvStretchBltROP`: Int = 69;
public const val `INDEX_DrvStrokeAndFillPath`: Int = 16;
public const val `INDEX_DrvStrokePath`: Int = 14;
public const val `INDEX_DrvSurfaceComplete`: Int = 103;
public const val `INDEX_DrvSwapBuffers`: Int = 56;
public const val `INDEX_DrvSynchronize`: Int = 38;
public const val `INDEX_DrvSynchronizeRedirectionBitmaps`: Int = 97;
public const val `INDEX_DrvSynchronizeSurface`: Int = 88;
public const val `INDEX_DrvSynthesizeFont`: Int = 72;
public const val `INDEX_DrvTextOut`: Int = 23;
public const val `INDEX_DrvTransparentBlt`: Int = 74;
public const val `INDEX_DrvUnloadFontFile`: Int = 46;
public const val `INDEX_DrvUnlockDisplayArea`: Int = 102;
public const val `INDEX_LAST`: Int = 89;
// UNSUPPORTED Rust 2241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INDIRECT_DISPLAY_INFO {
//     pub DisplayAdapterLuid: super::super::Foundation::LUID,
//     pub Flags: u32,
//     pub NumMonitors: u32,
//     pub DisplayAdapterTargetBase: u32,
// }

public const val `INDIRECT_DISPLAY_INFO_FLAGS_CREATED_IDDCX_ADAPTER`: UInt = 1u;
public const val `IOCTL_COLORSPACE_TRANSFORM_QUERY_TARGET_CAPS`: UInt = 2297856u;
public const val `IOCTL_COLORSPACE_TRANSFORM_SET`: UInt = 2297860u;
public const val `IOCTL_FSVIDEO_COPY_FRAME_BUFFER`: UInt = 3409920u;
public const val `IOCTL_FSVIDEO_REVERSE_MOUSE_POINTER`: UInt = 3409928u;
public const val `IOCTL_FSVIDEO_SET_CURRENT_MODE`: UInt = 3409932u;
public const val `IOCTL_FSVIDEO_SET_CURSOR_POSITION`: UInt = 3409940u;
public const val `IOCTL_FSVIDEO_SET_SCREEN_INFORMATION`: UInt = 3409936u;
public const val `IOCTL_FSVIDEO_WRITE_TO_FRAME_BUFFER`: UInt = 3409924u;
public const val `IOCTL_MIPI_DSI_QUERY_CAPS`: UInt = 2298880u;
public const val `IOCTL_MIPI_DSI_RESET`: UInt = 2298888u;
public const val `IOCTL_MIPI_DSI_TRANSMISSION`: UInt = 2298884u;
public const val `IOCTL_PANEL_GET_BACKLIGHT_REDUCTION`: UInt = 2296856u;
public const val `IOCTL_PANEL_GET_BRIGHTNESS`: UInt = 2296840u;
public const val `IOCTL_PANEL_GET_MANUFACTURING_MODE`: UInt = 2296860u;
public const val `IOCTL_PANEL_QUERY_BRIGHTNESS_CAPS`: UInt = 2296832u;
public const val `IOCTL_PANEL_QUERY_BRIGHTNESS_RANGES`: UInt = 2296836u;
public const val `IOCTL_PANEL_SET_BACKLIGHT_OPTIMIZATION`: UInt = 2296852u;
public const val `IOCTL_PANEL_SET_BRIGHTNESS`: UInt = 2296844u;
public const val `IOCTL_PANEL_SET_BRIGHTNESS_STATE`: UInt = 2296848u;
public const val `IOCTL_SET_ACTIVE_COLOR_PROFILE_NAME`: UInt = 2297864u;
public const val `IOCTL_VIDEO_DISABLE_CURSOR`: UInt = 2294820u;
public const val `IOCTL_VIDEO_DISABLE_POINTER`: UInt = 2294844u;
public const val `IOCTL_VIDEO_DISABLE_VDM`: UInt = 2293764u;
public const val `IOCTL_VIDEO_ENABLE_CURSOR`: UInt = 2294816u;
public const val `IOCTL_VIDEO_ENABLE_POINTER`: UInt = 2294840u;
public const val `IOCTL_VIDEO_ENABLE_VDM`: UInt = 2293760u;
public const val `IOCTL_VIDEO_ENUM_MONITOR_PDO`: UInt = 2293784u;
public const val `IOCTL_VIDEO_FREE_PUBLIC_ACCESS_RANGES`: UInt = 2294884u;
public const val `IOCTL_VIDEO_GET_BANK_SELECT_CODE`: UInt = 2294868u;
public const val `IOCTL_VIDEO_GET_CHILD_STATE`: UInt = 2294912u;
public const val `IOCTL_VIDEO_GET_OUTPUT_DEVICE_POWER_STATE`: UInt = 2293776u;
public const val `IOCTL_VIDEO_GET_POWER_MANAGEMENT`: UInt = 2294896u;
public const val `IOCTL_VIDEO_HANDLE_VIDEOPARAMETERS`: UInt = 2293792u;
public const val `IOCTL_VIDEO_INIT_WIN32K_CALLBACKS`: UInt = 2293788u;
public const val `IOCTL_VIDEO_IS_VGA_DEVICE`: UInt = 2293796u;
public const val `IOCTL_VIDEO_LOAD_AND_SET_FONT`: UInt = 2294804u;
public const val `IOCTL_VIDEO_MAP_VIDEO_MEMORY`: UInt = 2294872u;
public const val `IOCTL_VIDEO_MONITOR_DEVICE`: UInt = 2293780u;
public const val `IOCTL_VIDEO_PREPARE_FOR_EARECOVERY`: UInt = 2293804u;
public const val `IOCTL_VIDEO_QUERY_AVAIL_MODES`: UInt = 2294784u;
public const val `IOCTL_VIDEO_QUERY_COLOR_CAPABILITIES`: UInt = 2294888u;
public const val `IOCTL_VIDEO_QUERY_CURRENT_MODE`: UInt = 2294792u;
public const val `IOCTL_VIDEO_QUERY_CURSOR_ATTR`: UInt = 2294828u;
public const val `IOCTL_VIDEO_QUERY_CURSOR_POSITION`: UInt = 2294836u;
public const val `IOCTL_VIDEO_QUERY_DISPLAY_BRIGHTNESS`: UInt = 2294936u;
public const val `IOCTL_VIDEO_QUERY_NUM_AVAIL_MODES`: UInt = 2294788u;
public const val `IOCTL_VIDEO_QUERY_POINTER_ATTR`: UInt = 2294852u;
public const val `IOCTL_VIDEO_QUERY_POINTER_CAPABILITIES`: UInt = 2294864u;
public const val `IOCTL_VIDEO_QUERY_POINTER_POSITION`: UInt = 2294860u;
public const val `IOCTL_VIDEO_QUERY_PUBLIC_ACCESS_RANGES`: UInt = 2294880u;
public const val `IOCTL_VIDEO_QUERY_SUPPORTED_BRIGHTNESS`: UInt = 2294932u;
public const val `IOCTL_VIDEO_REGISTER_VDM`: UInt = 2293768u;
public const val `IOCTL_VIDEO_RESET_DEVICE`: UInt = 2294800u;
public const val `IOCTL_VIDEO_RESTORE_HARDWARE_STATE`: UInt = 2294276u;
public const val `IOCTL_VIDEO_SAVE_HARDWARE_STATE`: UInt = 2294272u;
public const val `IOCTL_VIDEO_SET_BANK_POSITION`: UInt = 2294928u;
public const val `IOCTL_VIDEO_SET_CHILD_STATE_CONFIGURATION`: UInt = 2294920u;
public const val `IOCTL_VIDEO_SET_COLOR_LUT_DATA`: UInt = 2294908u;
public const val `IOCTL_VIDEO_SET_COLOR_REGISTERS`: UInt = 2294812u;
public const val `IOCTL_VIDEO_SET_CURRENT_MODE`: UInt = 2294796u;
public const val `IOCTL_VIDEO_SET_CURSOR_ATTR`: UInt = 2294824u;
public const val `IOCTL_VIDEO_SET_CURSOR_POSITION`: UInt = 2294832u;
public const val `IOCTL_VIDEO_SET_DISPLAY_BRIGHTNESS`: UInt = 2294940u;
public const val `IOCTL_VIDEO_SET_OUTPUT_DEVICE_POWER_STATE`: UInt = 2293772u;
public const val `IOCTL_VIDEO_SET_PALETTE_REGISTERS`: UInt = 2294808u;
public const val `IOCTL_VIDEO_SET_POINTER_ATTR`: UInt = 2294848u;
public const val `IOCTL_VIDEO_SET_POINTER_POSITION`: UInt = 2294856u;
public const val `IOCTL_VIDEO_SET_POWER_MANAGEMENT`: UInt = 2294892u;
public const val `IOCTL_VIDEO_SHARE_VIDEO_MEMORY`: UInt = 2294900u;
public const val `IOCTL_VIDEO_SWITCH_DUALVIEW`: UInt = 2294924u;
public const val `IOCTL_VIDEO_UNMAP_VIDEO_MEMORY`: UInt = 2294876u;
public const val `IOCTL_VIDEO_UNSHARE_VIDEO_MEMORY`: UInt = 2294904u;
public const val `IOCTL_VIDEO_USE_DEVICE_IN_SESSION`: UInt = 2293800u;
public const val `IOCTL_VIDEO_VALIDATE_CHILD_STATE_CONFIGURATION`: UInt = 2294916u;
public const val `JOIN_BEVEL`: Int = 1;
public const val `JOIN_MITER`: Int = 2;
public const val `JOIN_ROUND`: Int = 0;
public const val `LA_ALTERNATE`: UInt = 2u;
public const val `LA_GEOMETRIC`: UInt = 1u;
public const val `LA_STARTGAP`: UInt = 4u;
public const val `LA_STYLED`: UInt = 8u;
// UNSUPPORTED Rust 2331:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LIGATURE {
//     pub culSize: u32,
//     pub pwsz: windows_sys::core::PWSTR,
//     pub chglyph: u32,
//     pub ahglyph: [u32; 1],
// }

// UNSUPPORTED Rust 2339:1: declaration Impl has no candidate rule
// impl Default for LIGATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct LINEATTRS {
//     pub fl: u32,
//     pub iJoin: u32,
//     pub iEndCap: u32,
//     pub elWidth: FLOAT_LONG,
//     pub eMiterLimit: u32,
//     pub cstyle: u32,
//     pub pstyle: *mut FLOAT_LONG,
//     pub elStyleState: FLOAT_LONG,
// }

// UNSUPPORTED Rust 2357:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for LINEATTRS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2363:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct LINEATTRS {
//     pub fl: u32,
//     pub iJoin: u32,
//     pub iEndCap: u32,
//     pub elWidth: FLOAT_LONG,
//     pub eMiterLimit: f32,
//     pub cstyle: u32,
//     pub pstyle: *mut FLOAT_LONG,
//     pub elStyleState: FLOAT_LONG,
// }

// UNSUPPORTED Rust 2376:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for LINEATTRS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAXCHARSETS`: UInt = 16u;
public const val `MAX_PACKET_COUNT`: UInt = 128u;
public const val `MC_APERTURE_GRILL_CATHODE_RAY_TUBE`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 1;
public const val `MC_BLUE_DRIVE`: `MC_DRIVE_TYPE` = 2;
public const val `MC_BLUE_GAIN`: `MC_GAIN_TYPE` = 2;
public const val `MC_CAPS_BRIGHTNESS`: UInt = 2u;
public const val `MC_CAPS_COLOR_TEMPERATURE`: UInt = 8u;
public const val `MC_CAPS_CONTRAST`: UInt = 4u;
public const val `MC_CAPS_DEGAUSS`: UInt = 64u;
public const val `MC_CAPS_DISPLAY_AREA_POSITION`: UInt = 128u;
public const val `MC_CAPS_DISPLAY_AREA_SIZE`: UInt = 256u;
public const val `MC_CAPS_MONITOR_TECHNOLOGY_TYPE`: UInt = 1u;
public const val `MC_CAPS_NONE`: UInt = 0u;
public const val `MC_CAPS_RED_GREEN_BLUE_DRIVE`: UInt = 32u;
public const val `MC_CAPS_RED_GREEN_BLUE_GAIN`: UInt = 16u;
public const val `MC_CAPS_RESTORE_FACTORY_COLOR_DEFAULTS`: UInt = 2048u;
public const val `MC_CAPS_RESTORE_FACTORY_DEFAULTS`: UInt = 1024u;
public typealias `MC_COLOR_TEMPERATURE` = Int;
public const val `MC_COLOR_TEMPERATURE_10000K`: `MC_COLOR_TEMPERATURE` = 7;
public const val `MC_COLOR_TEMPERATURE_11500K`: `MC_COLOR_TEMPERATURE` = 8;
public const val `MC_COLOR_TEMPERATURE_4000K`: `MC_COLOR_TEMPERATURE` = 1;
public const val `MC_COLOR_TEMPERATURE_5000K`: `MC_COLOR_TEMPERATURE` = 2;
public const val `MC_COLOR_TEMPERATURE_6500K`: `MC_COLOR_TEMPERATURE` = 3;
public const val `MC_COLOR_TEMPERATURE_7500K`: `MC_COLOR_TEMPERATURE` = 4;
public const val `MC_COLOR_TEMPERATURE_8200K`: `MC_COLOR_TEMPERATURE` = 5;
public const val `MC_COLOR_TEMPERATURE_9300K`: `MC_COLOR_TEMPERATURE` = 6;
public const val `MC_COLOR_TEMPERATURE_UNKNOWN`: `MC_COLOR_TEMPERATURE` = 0;
public typealias `MC_DISPLAY_TECHNOLOGY_TYPE` = Int;
public typealias `MC_DRIVE_TYPE` = Int;
public const val `MC_ELECTROLUMINESCENT`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 6;
public const val `MC_FIELD_EMISSION_DEVICE`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 8;
public typealias `MC_GAIN_TYPE` = Int;
public const val `MC_GREEN_DRIVE`: `MC_DRIVE_TYPE` = 1;
public const val `MC_GREEN_GAIN`: `MC_GAIN_TYPE` = 1;
public const val `MC_HEIGHT`: `MC_SIZE_TYPE` = 1;
public const val `MC_HORIZONTAL_POSITION`: `MC_POSITION_TYPE` = 0;
public const val `MC_LIQUID_CRYSTAL_ON_SILICON`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 3;
public const val `MC_MICROELECTROMECHANICAL`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 7;
public const val `MC_MOMENTARY`: `MC_VCP_CODE_TYPE` = 0;
public const val `MC_ORGANIC_LIGHT_EMITTING_DIODE`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 5;
public const val `MC_PLASMA`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 4;
public typealias `MC_POSITION_TYPE` = Int;
public const val `MC_RED_DRIVE`: `MC_DRIVE_TYPE` = 0;
public const val `MC_RED_GAIN`: `MC_GAIN_TYPE` = 0;
public const val `MC_RESTORE_FACTORY_DEFAULTS_ENABLES_MONITOR_SETTINGS`: UInt = 4096u;
public const val `MC_SET_PARAMETER`: `MC_VCP_CODE_TYPE` = 1;
public const val `MC_SHADOW_MASK_CATHODE_RAY_TUBE`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 0;
public typealias `MC_SIZE_TYPE` = Int;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_10000K`: UInt = 64u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_11500K`: UInt = 128u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_4000K`: UInt = 1u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_5000K`: UInt = 2u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_6500K`: UInt = 4u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_7500K`: UInt = 8u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_8200K`: UInt = 16u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_9300K`: UInt = 32u;
public const val `MC_SUPPORTED_COLOR_TEMPERATURE_NONE`: UInt = 0u;
public const val `MC_THIN_FILM_TRANSISTOR`: `MC_DISPLAY_TECHNOLOGY_TYPE` = 2;
// UNSUPPORTED Rust 2440:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MC_TIMING_REPORT {
//     pub dwHorizontalFrequencyInHZ: u32,
//     pub dwVerticalFrequencyInHZ: u32,
//     pub bTimingStatusByte: u8,
// }

public typealias `MC_VCP_CODE_TYPE` = Int;
public const val `MC_VERTICAL_POSITION`: `MC_POSITION_TYPE` = 1;
public const val `MC_WIDTH`: `MC_SIZE_TYPE` = 0;
// UNSUPPORTED Rust 2450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIPI_DSI_CAPS {
//     pub DSITypeMajor: u8,
//     pub DSITypeMinor: u8,
//     pub SpecVersionMajor: u8,
//     pub SpecVersionMinor: u8,
//     pub SpecVersionPatch: u8,
//     pub TargetMaximumReturnPacketSize: u16,
//     pub ResultCodeFlags: u8,
//     pub ResultCodeStatus: u8,
//     pub Revision: u8,
//     pub Level: u8,
//     pub DeviceClassHi: u8,
//     pub DeviceClassLo: u8,
//     pub ManufacturerHi: u8,
//     pub ManufacturerLo: u8,
//     pub ProductHi: u8,
//     pub ProductLo: u8,
//     pub LengthHi: u8,
//     pub LengthLo: u8,
// }

// UNSUPPORTED Rust 2472:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIPI_DSI_PACKET {
//     pub Anonymous1: MIPI_DSI_PACKET_0,
//     pub Anonymous2: MIPI_DSI_PACKET_1,
//     pub EccFiller: u8,
//     pub Payload: [u8; 8],
// }

// UNSUPPORTED Rust 2480:1: declaration Impl has no candidate rule
// impl Default for MIPI_DSI_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2485:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIPI_DSI_PACKET_0 {
//     pub DataId: u8,
//     pub Anonymous: MIPI_DSI_PACKET_0_0,
// }

// UNSUPPORTED Rust 2491:1: declaration Impl has no candidate rule
// impl Default for MIPI_DSI_PACKET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2496:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIPI_DSI_PACKET_0_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 2501:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIPI_DSI_PACKET_1 {
//     pub Anonymous: MIPI_DSI_PACKET_1_0,
//     pub LongWriteWordCount: u16,
// }

// UNSUPPORTED Rust 2507:1: declaration Impl has no candidate rule
// impl Default for MIPI_DSI_PACKET_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2512:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIPI_DSI_PACKET_1_0 {
//     pub Data0: u8,
//     pub Data1: u8,
// }

// UNSUPPORTED Rust 2518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIPI_DSI_RESET {
//     pub Flags: u32,
//     pub Anonymous: MIPI_DSI_RESET_0,
// }

// UNSUPPORTED Rust 2524:1: declaration Impl has no candidate rule
// impl Default for MIPI_DSI_RESET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2529:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MIPI_DSI_RESET_0 {
//     pub Anonymous: MIPI_DSI_RESET_0_0,
//     pub Results: u32,
// }

// UNSUPPORTED Rust 2535:1: declaration Impl has no candidate rule
// impl Default for MIPI_DSI_RESET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIPI_DSI_RESET_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MIPI_DSI_TRANSMISSION {
//     pub TotalBufferSize: u32,
//     pub PacketCount: u8,
//     pub FailedPacket: u8,
//     pub Anonymous: MIPI_DSI_TRANSMISSION_0,
//     pub ReadWordCount: u16,
//     pub FinalCommandExtraPayload: u16,
//     pub MipiErrors: u16,
//     pub HostErrors: u16,
//     pub Packets: [MIPI_DSI_PACKET; 1],
// }

// UNSUPPORTED Rust 2558:1: declaration Impl has no candidate rule
// impl Default for MIPI_DSI_TRANSMISSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MIPI_DSI_TRANSMISSION_0 {
//     pub _bitfield: u16,
// }

public const val `MS_CDDDEVICEBITMAP`: UInt = 4u;
public const val `MS_NOTSYSTEMMEMORY`: UInt = 1u;
public const val `MS_REUSEDDEVICEBITMAP`: UInt = 8u;
public const val `MS_SHAREDACCESS`: UInt = 2u;
public const val `NumVideoBankTypes`: `VIDEO_BANK_TYPE` = 4;
public const val `OC_BANK_CLIP`: UInt = 1u;
public const val `OPENGL_CMD`: UInt = 4352u;
public const val `OPENGL_GETINFO`: UInt = 4353u;
public typealias `ORIENTATION_PREFERENCE` = Int;
public const val `ORIENTATION_PREFERENCE_LANDSCAPE`: `ORIENTATION_PREFERENCE` = 1;
public const val `ORIENTATION_PREFERENCE_LANDSCAPE_FLIPPED`: `ORIENTATION_PREFERENCE` = 4;
public const val `ORIENTATION_PREFERENCE_NONE`: `ORIENTATION_PREFERENCE` = 0;
public const val `ORIENTATION_PREFERENCE_PORTRAIT`: `ORIENTATION_PREFERENCE` = 2;
public const val `ORIENTATION_PREFERENCE_PORTRAIT_FLIPPED`: `ORIENTATION_PREFERENCE` = 8;
public typealias `OUTPUT_COLOR_ENCODING` = Int;
public const val `OUTPUT_COLOR_ENCODING_INTENSITY`: `OUTPUT_COLOR_ENCODING` = 4;
public const val `OUTPUT_COLOR_ENCODING_RGB`: `OUTPUT_COLOR_ENCODING` = 0;
public const val `OUTPUT_COLOR_ENCODING_YCBCR420`: `OUTPUT_COLOR_ENCODING` = 3;
public const val `OUTPUT_COLOR_ENCODING_YCBCR422`: `OUTPUT_COLOR_ENCODING` = 2;
public const val `OUTPUT_COLOR_ENCODING_YCBCR444`: `OUTPUT_COLOR_ENCODING` = 1;
public const val `OUTPUT_WIRE_COLOR_SPACE_G2084_P2020`: `OUTPUT_WIRE_COLOR_SPACE_TYPE` = 12;
public const val `OUTPUT_WIRE_COLOR_SPACE_G2084_P2020_DVLL`: `OUTPUT_WIRE_COLOR_SPACE_TYPE` = 33;
public const val `OUTPUT_WIRE_COLOR_SPACE_G2084_P2020_HDR10PLUS`: `OUTPUT_WIRE_COLOR_SPACE_TYPE` = 32;
public const val `OUTPUT_WIRE_COLOR_SPACE_G22_P2020`: `OUTPUT_WIRE_COLOR_SPACE_TYPE` = 31;
public const val `OUTPUT_WIRE_COLOR_SPACE_G22_P709`: `OUTPUT_WIRE_COLOR_SPACE_TYPE` = 0;
public const val `OUTPUT_WIRE_COLOR_SPACE_G22_P709_WCG`: `OUTPUT_WIRE_COLOR_SPACE_TYPE` = 30;
public const val `OUTPUT_WIRE_COLOR_SPACE_RESERVED`: `OUTPUT_WIRE_COLOR_SPACE_TYPE` = 4;
public typealias `OUTPUT_WIRE_COLOR_SPACE_TYPE` = Int;
// UNSUPPORTED Rust 2596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OUTPUT_WIRE_FORMAT {
//     pub ColorEncoding: OUTPUT_COLOR_ENCODING,
//     pub BitsPerPixel: u32,
// }

// UNSUPPORTED Rust 2602:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PALOBJ {
//     pub ulReserved: u32,
// }

public const val `PAL_BGR`: UInt = 8u;
public const val `PAL_BITFIELDS`: UInt = 2u;
public const val `PAL_CMYK`: UInt = 16u;
public const val `PAL_INDEXED`: UInt = 1u;
public const val `PAL_RGB`: UInt = 4u;
// UNSUPPORTED Rust 2612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PANEL_BRIGHTNESS_SENSOR_DATA {
//     pub Anonymous: PANEL_BRIGHTNESS_SENSOR_DATA_0,
//     pub AlsReading: f32,
//     pub ChromaticityCoordinate: CHROMATICITY_COORDINATE,
//     pub ColorTemperature: f32,
// }

// UNSUPPORTED Rust 2620:1: declaration Impl has no candidate rule
// impl Default for PANEL_BRIGHTNESS_SENSOR_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2625:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_BRIGHTNESS_SENSOR_DATA_0 {
//     pub Anonymous: PANEL_BRIGHTNESS_SENSOR_DATA_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2631:1: declaration Impl has no candidate rule
// impl Default for PANEL_BRIGHTNESS_SENSOR_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2636:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PANEL_BRIGHTNESS_SENSOR_DATA_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PANEL_GET_BACKLIGHT_REDUCTION {
//     pub BacklightUsersetting: u16,
//     pub BacklightEffective: u16,
//     pub GammaRamp: BACKLIGHT_REDUCTION_GAMMA_RAMP,
// }

// UNSUPPORTED Rust 2648:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PANEL_GET_BRIGHTNESS {
//     pub Version: BRIGHTNESS_INTERFACE_VERSION,
//     pub Anonymous: PANEL_GET_BRIGHTNESS_0,
// }

// UNSUPPORTED Rust 2654:1: declaration Impl has no candidate rule
// impl Default for PANEL_GET_BRIGHTNESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2659:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_GET_BRIGHTNESS_0 {
//     pub Level: u8,
//     pub Anonymous: PANEL_GET_BRIGHTNESS_0_0,
// }

// UNSUPPORTED Rust 2665:1: declaration Impl has no candidate rule
// impl Default for PANEL_GET_BRIGHTNESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2670:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PANEL_GET_BRIGHTNESS_0_0 {
//     pub CurrentInMillinits: u32,
//     pub TargetInMillinits: u32,
// }

// UNSUPPORTED Rust 2676:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PANEL_QUERY_BRIGHTNESS_CAPS {
//     pub Version: BRIGHTNESS_INTERFACE_VERSION,
//     pub Anonymous: PANEL_QUERY_BRIGHTNESS_CAPS_0,
// }

// UNSUPPORTED Rust 2682:1: declaration Impl has no candidate rule
// impl Default for PANEL_QUERY_BRIGHTNESS_CAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2687:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_QUERY_BRIGHTNESS_CAPS_0 {
//     pub Anonymous: PANEL_QUERY_BRIGHTNESS_CAPS_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2693:1: declaration Impl has no candidate rule
// impl Default for PANEL_QUERY_BRIGHTNESS_CAPS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2698:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PANEL_QUERY_BRIGHTNESS_CAPS_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2703:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PANEL_QUERY_BRIGHTNESS_RANGES {
//     pub Version: BRIGHTNESS_INTERFACE_VERSION,
//     pub Anonymous: PANEL_QUERY_BRIGHTNESS_RANGES_0,
// }

// UNSUPPORTED Rust 2709:1: declaration Impl has no candidate rule
// impl Default for PANEL_QUERY_BRIGHTNESS_RANGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2714:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_QUERY_BRIGHTNESS_RANGES_0 {
//     pub BrightnessLevel: BRIGHTNESS_LEVEL,
//     pub NitRanges: BRIGHTNESS_NIT_RANGES,
// }

// UNSUPPORTED Rust 2720:1: declaration Impl has no candidate rule
// impl Default for PANEL_QUERY_BRIGHTNESS_RANGES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2725:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PANEL_SET_BACKLIGHT_OPTIMIZATION {
//     pub Level: BACKLIGHT_OPTIMIZATION_LEVEL,
// }

// UNSUPPORTED Rust 2730:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PANEL_SET_BRIGHTNESS {
//     pub Version: BRIGHTNESS_INTERFACE_VERSION,
//     pub Anonymous: PANEL_SET_BRIGHTNESS_0,
// }

// UNSUPPORTED Rust 2736:1: declaration Impl has no candidate rule
// impl Default for PANEL_SET_BRIGHTNESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2741:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_SET_BRIGHTNESS_0 {
//     pub Level: u8,
//     pub Anonymous: PANEL_SET_BRIGHTNESS_0_0,
// }

// UNSUPPORTED Rust 2747:1: declaration Impl has no candidate rule
// impl Default for PANEL_SET_BRIGHTNESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2752:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PANEL_SET_BRIGHTNESS_0_0 {
//     pub Millinits: u32,
//     pub TransitionTimeInMs: u32,
//     pub SensorData: PANEL_BRIGHTNESS_SENSOR_DATA,
// }

// UNSUPPORTED Rust 2759:1: declaration Impl has no candidate rule
// impl Default for PANEL_SET_BRIGHTNESS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PANEL_SET_BRIGHTNESS_STATE {
//     pub Anonymous: PANEL_SET_BRIGHTNESS_STATE_0,
// }

// UNSUPPORTED Rust 2769:1: declaration Impl has no candidate rule
// impl Default for PANEL_SET_BRIGHTNESS_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2774:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PANEL_SET_BRIGHTNESS_STATE_0 {
//     pub Anonymous: PANEL_SET_BRIGHTNESS_STATE_0_0,
//     pub Value: u32,
// }

// UNSUPPORTED Rust 2780:1: declaration Impl has no candidate rule
// impl Default for PANEL_SET_BRIGHTNESS_STATE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2785:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PANEL_SET_BRIGHTNESS_STATE_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PATHDATA {
//     pub flags: u32,
//     pub count: u32,
//     pub pptfx: *mut POINTFIX,
// }

// UNSUPPORTED Rust 2797:1: declaration Impl has no candidate rule
// impl Default for PATHDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2802:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PATHOBJ {
//     pub fl: u32,
//     pub cCurves: u32,
// }

public const val `PD_BEGINSUBPATH`: UInt = 1u;
public const val `PD_BEZIERS`: UInt = 16u;
public const val `PD_CLOSEFIGURE`: UInt = 8u;
public const val `PD_ENDSUBPATH`: UInt = 2u;
public const val `PD_RESETSTYLE`: UInt = 4u;
// UNSUPPORTED Rust 2813:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PERBANDINFO {
//     pub bRepeatThisBand: windows_sys::core::BOOL,
//     pub szlBand: super::super::Foundation::SIZE,
//     pub ulHorzRes: u32,
//     pub ulVertRes: u32,
// }

// UNSUPPORTED Rust 2821:1: generic scalar type unsupported
// pub type PFN = Option<unsafe extern "system" fn() -> isize>;

// UNSUPPORTED Rust 2822:1: generic scalar type unsupported
// pub type PFN_DrvAccumulateD3DDirtyRect = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut CDDDXGK_REDIRBITMAPPRESENTINFO) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2823:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvAlphaBlend = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut CLIPOBJ, param3: *mut XLATEOBJ, param4: *mut super::super::Foundation::RECTL, param5: *mut super::super::Foundation::RECTL, param6: *mut BLENDOBJ) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2825:1: generic scalar type unsupported
// pub type PFN_DrvAssertMode = Option<unsafe extern "system" fn(param0: DHPDEV, param1: windows_sys::core::BOOL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2826:1: generic scalar type unsupported
// pub type PFN_DrvAssociateSharedSurface = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: super::super::Foundation::HANDLE, param2: super::super::Foundation::HANDLE, param3: super::super::Foundation::SIZE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2827:1: generic scalar type unsupported
// pub type PFN_DrvBitBlt = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut SURFOBJ, param3: *mut CLIPOBJ, param4: *mut XLATEOBJ, param5: *mut super::super::Foundation::RECTL, param6: *mut super::super::Foundation::POINTL, param7: *mut super::super::Foundation::POINTL, param8: *mut BRUSHOBJ, param9: *mut super::super::Foundation::POINTL, param10: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2828:1: generic scalar type unsupported
// pub type PFN_DrvCompletePDEV = Option<unsafe extern "system" fn(param0: DHPDEV, param1: HDEV)>;

// UNSUPPORTED Rust 2829:1: generic scalar type unsupported
// pub type PFN_DrvCopyBits = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut CLIPOBJ, param3: *mut XLATEOBJ, param4: *mut super::super::Foundation::RECTL, param5: *mut super::super::Foundation::POINTL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2830:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvCreateDeviceBitmap = Option<unsafe extern "system" fn(param0: DHPDEV, param1: super::super::Foundation::SIZE, param2: u32) -> super::super::Graphics::Gdi::HBITMAP>;

// UNSUPPORTED Rust 2832:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvCreateDeviceBitmapEx = Option<unsafe extern "system" fn(param0: DHPDEV, param1: super::super::Foundation::SIZE, param2: u32, param3: u32, param4: DHSURF, param5: u32, param6: u32, param7: *mut super::super::Foundation::HANDLE) -> super::super::Graphics::Gdi::HBITMAP>;

// UNSUPPORTED Rust 2834:1: generic scalar type unsupported
// pub type PFN_DrvDeleteDeviceBitmap = Option<unsafe extern "system" fn(param0: DHSURF)>;

// UNSUPPORTED Rust 2835:1: generic scalar type unsupported
// pub type PFN_DrvDeleteDeviceBitmapEx = Option<unsafe extern "system" fn(param0: DHSURF)>;

// UNSUPPORTED Rust 2836:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_OpenGL")]
// pub type PFN_DrvDescribePixelFormat = Option<unsafe extern "system" fn(param0: DHPDEV, param1: i32, param2: u32, param3: *mut super::super::Graphics::OpenGL::PIXELFORMATDESCRIPTOR) -> i32>;

// UNSUPPORTED Rust 2838:1: generic scalar type unsupported
// pub type PFN_DrvDestroyFont = Option<unsafe extern "system" fn(param0: *mut FONTOBJ)>;

// UNSUPPORTED Rust 2839:1: generic scalar type unsupported
// pub type PFN_DrvDisableDirectDraw = Option<unsafe extern "system" fn(param0: DHPDEV)>;

// UNSUPPORTED Rust 2840:1: generic scalar type unsupported
// pub type PFN_DrvDisableDriver = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 2841:1: generic scalar type unsupported
// pub type PFN_DrvDisablePDEV = Option<unsafe extern "system" fn(param0: DHPDEV)>;

// UNSUPPORTED Rust 2842:1: generic scalar type unsupported
// pub type PFN_DrvDisableSurface = Option<unsafe extern "system" fn(param0: DHPDEV)>;

// UNSUPPORTED Rust 2843:1: generic scalar type unsupported
// pub type PFN_DrvDitherColor = Option<unsafe extern "system" fn(param0: DHPDEV, param1: u32, param2: u32, param3: *mut u32) -> u32>;

// UNSUPPORTED Rust 2844:1: generic scalar type unsupported
// pub type PFN_DrvDrawEscape = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: u32, param2: *mut CLIPOBJ, param3: *mut super::super::Foundation::RECTL, param4: u32, param5: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2845:1: generic scalar type unsupported
// pub type PFN_DrvEnableDriver = Option<unsafe extern "system" fn(param0: u32, param1: u32, param2: *mut DRVENABLEDATA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2846:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvEnablePDEV = Option<unsafe extern "system" fn(param0: *mut super::super::Graphics::Gdi::DEVMODEW, param1: windows_sys::core::PCWSTR, param2: u32, param3: *mut HSURF, param4: u32, param5: *mut GDIINFO, param6: u32, param7: *mut DEVINFO, param8: HDEV, param9: windows_sys::core::PCWSTR, param10: super::super::Foundation::HANDLE) -> DHPDEV>;

// UNSUPPORTED Rust 2848:1: generic scalar type unsupported
// pub type PFN_DrvEnableSurface = Option<unsafe extern "system" fn(param0: DHPDEV) -> HSURF>;

// UNSUPPORTED Rust 2849:1: generic scalar type unsupported
// pub type PFN_DrvEndDoc = Option<unsafe extern "system" fn(pso: *mut SURFOBJ, fl: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2850:1: generic scalar type unsupported
// pub type PFN_DrvEndDxInterop = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: windows_sys::core::BOOL, param2: *mut windows_sys::core::BOOL, kernelmodedevicehandle: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2851:1: generic scalar type unsupported
// pub type PFN_DrvEscape = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: u32, param2: u32, param3: *mut core::ffi::c_void, param4: u32, param5: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2852:1: generic scalar type unsupported
// pub type PFN_DrvFillPath = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut PATHOBJ, param2: *mut CLIPOBJ, param3: *mut BRUSHOBJ, param4: *mut super::super::Foundation::POINTL, param5: u32, param6: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2853:1: generic scalar type unsupported
// pub type PFN_DrvFontManagement = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut FONTOBJ, param2: u32, param3: u32, param4: *mut core::ffi::c_void, param5: u32, param6: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2854:1: generic scalar type unsupported
// pub type PFN_DrvFree = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: usize)>;

// UNSUPPORTED Rust 2855:1: generic scalar type unsupported
// pub type PFN_DrvGetGlyphMode = Option<unsafe extern "system" fn(dhpdev: DHPDEV, pfo: *mut FONTOBJ) -> u32>;

// UNSUPPORTED Rust 2856:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvGetModes = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: *mut super::super::Graphics::Gdi::DEVMODEW) -> u32>;

// UNSUPPORTED Rust 2858:1: generic scalar type unsupported
// pub type PFN_DrvGetTrueTypeFile = Option<unsafe extern "system" fn(param0: usize, param1: *mut u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2859:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvGradientFill = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut CLIPOBJ, param2: *mut XLATEOBJ, param3: *mut super::super::Graphics::Gdi::TRIVERTEX, param4: u32, param5: *mut core::ffi::c_void, param6: u32, param7: *mut super::super::Foundation::RECTL, param8: *mut super::super::Foundation::POINTL, param9: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2861:1: generic scalar type unsupported
// pub type PFN_DrvIcmCheckBitmapBits = Option<unsafe extern "system" fn(param0: DHPDEV, param1: super::super::Foundation::HANDLE, param2: *mut SURFOBJ, param3: *mut u8) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2862:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_ColorSystem"))]
// pub type PFN_DrvIcmCreateColorTransform = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut super::super::UI::ColorSystem::LOGCOLORSPACEW, param2: *mut core::ffi::c_void, param3: u32, param4: *mut core::ffi::c_void, param5: u32, param6: *mut core::ffi::c_void, param7: u32, param8: u32) -> super::super::Foundation::HANDLE>;

// UNSUPPORTED Rust 2864:1: generic scalar type unsupported
// pub type PFN_DrvIcmDeleteColorTransform = Option<unsafe extern "system" fn(param0: DHPDEV, param1: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2865:1: generic scalar type unsupported
// pub type PFN_DrvIcmSetDeviceGammaRamp = Option<unsafe extern "system" fn(param0: DHPDEV, param1: u32, param2: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2866:1: generic scalar type unsupported
// pub type PFN_DrvLineTo = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut CLIPOBJ, param2: *mut BRUSHOBJ, param3: i32, param4: i32, param5: i32, param6: i32, param7: *mut super::super::Foundation::RECTL, param8: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2867:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvLoadFontFile = Option<unsafe extern "system" fn(param0: u32, param1: *mut usize, param2: *mut *mut core::ffi::c_void, param3: *mut u32, param4: *mut super::super::Graphics::Gdi::DESIGNVECTOR, param5: u32, param6: u32) -> usize>;

// UNSUPPORTED Rust 2869:1: generic scalar type unsupported
// pub type PFN_DrvLockDisplayArea = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut super::super::Foundation::RECTL)>;

// UNSUPPORTED Rust 2870:1: generic scalar type unsupported
// pub type PFN_DrvMovePointer = Option<unsafe extern "system" fn(pso: *mut SURFOBJ, x: i32, y: i32, prcl: *mut super::super::Foundation::RECTL)>;

// UNSUPPORTED Rust 2871:1: generic scalar type unsupported
// pub type PFN_DrvNextBand = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, ppointl: *mut super::super::Foundation::POINTL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2872:1: generic scalar type unsupported
// pub type PFN_DrvNotify = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: u32, param2: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 2873:1: generic scalar type unsupported
// pub type PFN_DrvPaint = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut CLIPOBJ, param2: *mut BRUSHOBJ, param3: *mut super::super::Foundation::POINTL, param4: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2874:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvPlgBlt = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut SURFOBJ, param3: *mut CLIPOBJ, param4: *mut XLATEOBJ, param5: *mut super::super::Graphics::Gdi::COLORADJUSTMENT, param6: *mut super::super::Foundation::POINTL, param7: *mut POINTFIX, param8: *mut super::super::Foundation::RECTL, param9: *mut super::super::Foundation::POINTL, param10: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2876:1: generic scalar type unsupported
// pub type PFN_DrvQueryAdvanceWidths = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut FONTOBJ, param2: u32, param3: *mut u32, param4: *mut core::ffi::c_void, param5: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2877:1: generic scalar type unsupported
// pub type PFN_DrvQueryDeviceSupport = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut XLATEOBJ, param2: *mut XFORMOBJ, param3: u32, param4: u32, param5: *mut core::ffi::c_void, param6: u32, param7: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2878:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvQueryFont = Option<unsafe extern "system" fn(param0: DHPDEV, param1: usize, param2: u32, param3: *mut usize) -> *mut IFIMETRICS>;

// UNSUPPORTED Rust 2880:1: generic scalar type unsupported
// pub type PFN_DrvQueryFontCaps = Option<unsafe extern "system" fn(param0: u32, param1: *mut u32) -> i32>;

// UNSUPPORTED Rust 2881:1: generic scalar type unsupported
// pub type PFN_DrvQueryFontData = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut FONTOBJ, param2: u32, param3: u32, param4: *mut GLYPHDATA, param5: *mut core::ffi::c_void, param6: u32) -> i32>;

// UNSUPPORTED Rust 2882:1: generic scalar type unsupported
// pub type PFN_DrvQueryFontFile = Option<unsafe extern "system" fn(param0: usize, param1: u32, param2: u32, param3: *mut u32) -> i32>;

// UNSUPPORTED Rust 2883:1: generic scalar type unsupported
// pub type PFN_DrvQueryFontTree = Option<unsafe extern "system" fn(param0: DHPDEV, param1: usize, param2: u32, param3: u32, param4: *mut usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 2884:1: generic scalar type unsupported
// pub type PFN_DrvQueryGlyphAttrs = Option<unsafe extern "system" fn(param0: *mut FONTOBJ, param1: u32) -> *mut FD_GLYPHATTR>;

// UNSUPPORTED Rust 2885:1: generic scalar type unsupported
// pub type PFN_DrvQueryPerBandInfo = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut PERBANDINFO) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2886:1: generic scalar type unsupported
// pub type PFN_DrvQuerySpoolType = Option<unsafe extern "system" fn(dhpdev: DHPDEV, pwchtype: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2887:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvQueryTrueTypeOutline = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut FONTOBJ, param2: u32, param3: windows_sys::core::BOOL, param4: *mut GLYPHDATA, param5: u32, param6: *mut super::super::Graphics::Gdi::TTPOLYGONHEADER) -> i32>;

// UNSUPPORTED Rust 2889:1: generic scalar type unsupported
// pub type PFN_DrvQueryTrueTypeSection = Option<unsafe extern "system" fn(param0: u32, param1: u32, param2: u32, param3: *mut super::super::Foundation::HANDLE, param4: *mut i32) -> i32>;

// UNSUPPORTED Rust 2890:1: generic scalar type unsupported
// pub type PFN_DrvQueryTrueTypeTable = Option<unsafe extern "system" fn(param0: usize, param1: u32, param2: u32, param3: i32, param4: u32, param5: *mut u8, param6: *mut *mut u8, param7: *mut u32) -> i32>;

// UNSUPPORTED Rust 2891:1: generic scalar type unsupported
// pub type PFN_DrvRealizeBrush = Option<unsafe extern "system" fn(param0: *mut BRUSHOBJ, param1: *mut SURFOBJ, param2: *mut SURFOBJ, param3: *mut SURFOBJ, param4: *mut XLATEOBJ, param5: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2892:1: generic scalar type unsupported
// pub type PFN_DrvRenderHint = Option<unsafe extern "system" fn(dhpdev: DHPDEV, notifycode: u32, length: usize, data: *const core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 2893:1: generic scalar type unsupported
// pub type PFN_DrvResetDevice = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2894:1: generic scalar type unsupported
// pub type PFN_DrvResetPDEV = Option<unsafe extern "system" fn(dhpdevold: DHPDEV, dhpdevnew: DHPDEV) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2895:1: generic scalar type unsupported
// pub type PFN_DrvSaveScreenBits = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: u32, param2: usize, param3: *mut super::super::Foundation::RECTL) -> usize>;

// UNSUPPORTED Rust 2896:1: generic scalar type unsupported
// pub type PFN_DrvSendPage = Option<unsafe extern "system" fn(param0: *mut SURFOBJ) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2897:1: generic scalar type unsupported
// pub type PFN_DrvSetPalette = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut PALOBJ, param2: u32, param3: u32, param4: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2898:1: generic scalar type unsupported
// pub type PFN_DrvSetPixelFormat = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: i32, param2: super::super::Foundation::HWND) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2899:1: generic scalar type unsupported
// pub type PFN_DrvSetPointerShape = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut SURFOBJ, param3: *mut XLATEOBJ, param4: i32, param5: i32, param6: i32, param7: i32, param8: *mut super::super::Foundation::RECTL, param9: u32) -> u32>;

// UNSUPPORTED Rust 2900:1: generic scalar type unsupported
// pub type PFN_DrvStartBanding = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, ppointl: *mut super::super::Foundation::POINTL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2901:1: generic scalar type unsupported
// pub type PFN_DrvStartDoc = Option<unsafe extern "system" fn(pso: *mut SURFOBJ, pwszdocname: windows_sys::core::PCWSTR, dwjobid: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2902:1: generic scalar type unsupported
// pub type PFN_DrvStartDxInterop = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: windows_sys::core::BOOL, kernelmodedevicehandle: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2903:1: generic scalar type unsupported
// pub type PFN_DrvStartPage = Option<unsafe extern "system" fn(pso: *mut SURFOBJ) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2904:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvStretchBlt = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut SURFOBJ, param3: *mut CLIPOBJ, param4: *mut XLATEOBJ, param5: *mut super::super::Graphics::Gdi::COLORADJUSTMENT, param6: *mut super::super::Foundation::POINTL, param7: *mut super::super::Foundation::RECTL, param8: *mut super::super::Foundation::RECTL, param9: *mut super::super::Foundation::POINTL, param10: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2906:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFN_DrvStretchBltROP = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut SURFOBJ, param3: *mut CLIPOBJ, param4: *mut XLATEOBJ, param5: *mut super::super::Graphics::Gdi::COLORADJUSTMENT, param6: *mut super::super::Foundation::POINTL, param7: *mut super::super::Foundation::RECTL, param8: *mut super::super::Foundation::RECTL, param9: *mut super::super::Foundation::POINTL, param10: u32, param11: *mut BRUSHOBJ, param12: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2908:1: generic scalar type unsupported
// pub type PFN_DrvStrokeAndFillPath = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut PATHOBJ, param2: *mut CLIPOBJ, param3: *mut XFORMOBJ, param4: *mut BRUSHOBJ, param5: *mut LINEATTRS, param6: *mut BRUSHOBJ, param7: *mut super::super::Foundation::POINTL, param8: u32, param9: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2909:1: generic scalar type unsupported
// pub type PFN_DrvStrokePath = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut PATHOBJ, param2: *mut CLIPOBJ, param3: *mut XFORMOBJ, param4: *mut BRUSHOBJ, param5: *mut super::super::Foundation::POINTL, param6: *mut LINEATTRS, param7: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2910:1: generic scalar type unsupported
// pub type PFN_DrvSurfaceComplete = Option<unsafe extern "system" fn(param0: DHPDEV, param1: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2911:1: generic scalar type unsupported
// pub type PFN_DrvSwapBuffers = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut WNDOBJ) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2912:1: generic scalar type unsupported
// pub type PFN_DrvSynchronize = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut super::super::Foundation::RECTL)>;

// UNSUPPORTED Rust 2913:1: generic scalar type unsupported
// pub type PFN_DrvSynchronizeRedirectionBitmaps = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut u64) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 2914:1: generic scalar type unsupported
// pub type PFN_DrvSynchronizeSurface = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut super::super::Foundation::RECTL, param2: u32)>;

// UNSUPPORTED Rust 2915:1: generic scalar type unsupported
// pub type PFN_DrvTextOut = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut STROBJ, param2: *mut FONTOBJ, param3: *mut CLIPOBJ, param4: *mut super::super::Foundation::RECTL, param5: *mut super::super::Foundation::RECTL, param6: *mut BRUSHOBJ, param7: *mut BRUSHOBJ, param8: *mut super::super::Foundation::POINTL, param9: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2916:1: generic scalar type unsupported
// pub type PFN_DrvTransparentBlt = Option<unsafe extern "system" fn(param0: *mut SURFOBJ, param1: *mut SURFOBJ, param2: *mut CLIPOBJ, param3: *mut XLATEOBJ, param4: *mut super::super::Foundation::RECTL, param5: *mut super::super::Foundation::RECTL, param6: u32, param7: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2917:1: generic scalar type unsupported
// pub type PFN_DrvUnloadFontFile = Option<unsafe extern "system" fn(param0: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2918:1: generic scalar type unsupported
// pub type PFN_DrvUnlockDisplayArea = Option<unsafe extern "system" fn(param0: DHPDEV, param1: *mut super::super::Foundation::RECTL)>;

// UNSUPPORTED Rust 2919:1: generic scalar type unsupported
// pub type PFN_EngCombineRgn = Option<unsafe extern "system" fn(hrgntrg: super::super::Foundation::HANDLE, hrgnsrc1: super::super::Foundation::HANDLE, hrgnsrc2: super::super::Foundation::HANDLE, imode: i32) -> i32>;

// UNSUPPORTED Rust 2920:1: generic scalar type unsupported
// pub type PFN_EngCopyRgn = Option<unsafe extern "system" fn(hrgndst: super::super::Foundation::HANDLE, hrgnsrc: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2921:1: generic scalar type unsupported
// pub type PFN_EngCreateRectRgn = Option<unsafe extern "system" fn(left: i32, top: i32, right: i32, bottom: i32) -> super::super::Foundation::HANDLE>;

// UNSUPPORTED Rust 2922:1: generic scalar type unsupported
// pub type PFN_EngDeleteRgn = Option<unsafe extern "system" fn(hrgn: super::super::Foundation::HANDLE)>;

// UNSUPPORTED Rust 2923:1: generic scalar type unsupported
// pub type PFN_EngIntersectRgn = Option<unsafe extern "system" fn(hrgnresult: super::super::Foundation::HANDLE, hrgna: super::super::Foundation::HANDLE, hrgnb: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2924:1: generic scalar type unsupported
// pub type PFN_EngSubtractRgn = Option<unsafe extern "system" fn(hrgnresult: super::super::Foundation::HANDLE, hrgna: super::super::Foundation::HANDLE, hrgnb: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2925:1: generic scalar type unsupported
// pub type PFN_EngUnionRgn = Option<unsafe extern "system" fn(hrgnresult: super::super::Foundation::HANDLE, hrgna: super::super::Foundation::HANDLE, hrgnb: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2926:1: generic scalar type unsupported
// pub type PFN_EngXorRgn = Option<unsafe extern "system" fn(hrgnresult: super::super::Foundation::HANDLE, hrgna: super::super::Foundation::HANDLE, hrgnb: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 2927:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PHYSICAL_MONITOR {
//     pub hPhysicalMonitor: super::super::Foundation::HANDLE,
//     pub szPhysicalMonitorDescription: [u16; 128],
// }

// UNSUPPORTED Rust 2933:1: declaration Impl has no candidate rule
// impl Default for PHYSICAL_MONITOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PHYSICAL_MONITOR_DESCRIPTION_SIZE`: UInt = 128u;
public const val `PLANAR_HC`: UInt = 1u;
// UNSUPPORTED Rust 2940:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct POINTE {
//     pub x: u32,
//     pub y: u32,
// }

// UNSUPPORTED Rust 2947:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct POINTE {
//     pub x: f32,
//     pub y: f32,
// }

// UNSUPPORTED Rust 2954:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POINTFIX {
//     pub x: i32,
//     pub y: i32,
// }

// UNSUPPORTED Rust 2960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POINTQF {
//     pub x: i64,
//     pub y: i64,
// }

public const val `PO_ALL_INTEGERS`: UInt = 4u;
public const val `PO_BEZIERS`: UInt = 1u;
public const val `PO_ELLIPSE`: UInt = 2u;
public const val `PO_ENUM_AS_INTEGERS`: UInt = 8u;
public const val `PO_WIDENED`: UInt = 16u;
public const val `PPC_BGR_ORDER_HORIZONTAL_STRIPES`: UInt = 5u;
public const val `PPC_BGR_ORDER_VERTICAL_STRIPES`: UInt = 3u;
public const val `PPC_DEFAULT`: UInt = 0u;
public const val `PPC_RGB_ORDER_HORIZONTAL_STRIPES`: UInt = 4u;
public const val `PPC_RGB_ORDER_VERTICAL_STRIPES`: UInt = 2u;
public const val `PPC_UNDEFINED`: UInt = 1u;
public const val `PPG_DEFAULT`: UInt = 0u;
public const val `PPG_SRGB`: UInt = 1u;
public const val `PRIMARY_ORDER_ABC`: UInt = 0u;
public const val `PRIMARY_ORDER_ACB`: UInt = 1u;
public const val `PRIMARY_ORDER_BAC`: UInt = 2u;
public const val `PRIMARY_ORDER_BCA`: UInt = 3u;
public const val `PRIMARY_ORDER_CAB`: UInt = 5u;
public const val `PRIMARY_ORDER_CBA`: UInt = 4u;
// UNSUPPORTED Rust 2985:1: generic scalar type unsupported
// pub type PVIDEO_WIN32K_CALLOUT = Option<unsafe extern "system" fn(params: *const core::ffi::c_void)>;

public const val `QAW_GETEASYWIDTHS`: UInt = 1u;
public const val `QAW_GETWIDTHS`: UInt = 0u;
public const val `QC_1BIT`: UInt = 2u;
public const val `QC_4BIT`: UInt = 4u;
public const val `QC_OUTLINES`: UInt = 1u;
public const val `QDA_ACCELERATION_LEVEL`: `ENG_DEVICE_ATTRIBUTE` = 1;
public const val `QDA_RESERVED`: `ENG_DEVICE_ATTRIBUTE` = 0;
public const val `QDC_ALL_PATHS`: `QUERY_DISPLAY_CONFIG_FLAGS` = 1u;
public const val `QDC_DATABASE_CURRENT`: `QUERY_DISPLAY_CONFIG_FLAGS` = 4u;
public const val `QDC_INCLUDE_HMD`: `QUERY_DISPLAY_CONFIG_FLAGS` = 32u;
public const val `QDC_ONLY_ACTIVE_PATHS`: `QUERY_DISPLAY_CONFIG_FLAGS` = 2u;
public const val `QDC_VIRTUAL_MODE_AWARE`: `QUERY_DISPLAY_CONFIG_FLAGS` = 16u;
public const val `QDC_VIRTUAL_REFRESH_RATE_AWARE`: `QUERY_DISPLAY_CONFIG_FLAGS` = 64u;
public const val `QDS_CHECKJPEGFORMAT`: UInt = 0u;
public const val `QDS_CHECKPNGFORMAT`: UInt = 1u;
public const val `QFD_GLYPHANDBITMAP`: Int = 1;
public const val `QFD_GLYPHANDOUTLINE`: Int = 2;
public const val `QFD_MAXEXTENTS`: Int = 3;
public const val `QFD_TT_GLYPHANDBITMAP`: Int = 4;
public const val `QFD_TT_GRAY1_BITMAP`: Int = 5;
public const val `QFD_TT_GRAY2_BITMAP`: Int = 6;
public const val `QFD_TT_GRAY4_BITMAP`: Int = 8;
public const val `QFD_TT_GRAY8_BITMAP`: Int = 9;
public const val `QFD_TT_MONO_BITMAP`: Int = 5;
public const val `QFF_DESCRIPTION`: Int = 1;
public const val `QFF_NUMFACES`: Int = 2;
public const val `QFT_GLYPHSET`: Int = 3;
public const val `QFT_KERNPAIRS`: Int = 2;
public const val `QFT_LIGATURES`: Int = 1;
public const val `QSA_3DNOW`: UInt = 16384u;
public const val `QSA_MMX`: UInt = 256u;
public const val `QSA_SSE`: UInt = 8192u;
public const val `QSA_SSE1`: UInt = 8192u;
public const val `QSA_SSE2`: UInt = 65536u;
public const val `QSA_SSE3`: UInt = 524288u;
public typealias `QUERY_DISPLAY_CONFIG_FLAGS` = UInt;
public const val `RB_DITHERCOLOR`: Int = -2147483648;
// UNSUPPORTED Rust 3023:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RECTFX {
//     pub xLeft: i32,
//     pub yTop: i32,
//     pub xRight: i32,
//     pub yBottom: i32,
// }

// UNSUPPORTED Rust 3031:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RUN {
//     pub iStart: i32,
//     pub iStop: i32,
// }

public const val `SDC_ALLOW_CHANGES`: `SET_DISPLAY_CONFIG_FLAGS` = 1024u;
public const val `SDC_ALLOW_PATH_ORDER_CHANGES`: `SET_DISPLAY_CONFIG_FLAGS` = 8192u;
public const val `SDC_APPLY`: `SET_DISPLAY_CONFIG_FLAGS` = 128u;
public const val `SDC_FORCE_MODE_ENUMERATION`: `SET_DISPLAY_CONFIG_FLAGS` = 4096u;
public const val `SDC_NO_OPTIMIZATION`: `SET_DISPLAY_CONFIG_FLAGS` = 256u;
public const val `SDC_PATH_PERSIST_IF_REQUIRED`: `SET_DISPLAY_CONFIG_FLAGS` = 2048u;
public const val `SDC_SAVE_TO_DATABASE`: `SET_DISPLAY_CONFIG_FLAGS` = 512u;
public const val `SDC_TOPOLOGY_CLONE`: `SET_DISPLAY_CONFIG_FLAGS` = 2u;
public const val `SDC_TOPOLOGY_EXTEND`: `SET_DISPLAY_CONFIG_FLAGS` = 4u;
public const val `SDC_TOPOLOGY_EXTERNAL`: `SET_DISPLAY_CONFIG_FLAGS` = 8u;
public const val `SDC_TOPOLOGY_INTERNAL`: `SET_DISPLAY_CONFIG_FLAGS` = 1u;
public const val `SDC_TOPOLOGY_SUPPLIED`: `SET_DISPLAY_CONFIG_FLAGS` = 16u;
public const val `SDC_USE_DATABASE_CURRENT`: `SET_DISPLAY_CONFIG_FLAGS` = 15u;
public const val `SDC_USE_SUPPLIED_DISPLAY_CONFIG`: `SET_DISPLAY_CONFIG_FLAGS` = 32u;
public const val `SDC_VALIDATE`: `SET_DISPLAY_CONFIG_FLAGS` = 64u;
public const val `SDC_VIRTUAL_MODE_AWARE`: `SET_DISPLAY_CONFIG_FLAGS` = 32768u;
public const val `SDC_VIRTUAL_REFRESH_RATE_AWARE`: `SET_DISPLAY_CONFIG_FLAGS` = 131072u;
public const val `SETCONFIGURATION_STATUS_ADDITIONAL`: UInt = 1u;
public const val `SETCONFIGURATION_STATUS_APPLIED`: UInt = 0u;
public const val `SETCONFIGURATION_STATUS_OVERRIDDEN`: UInt = 2u;
// UNSUPPORTED Rust 3057:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SET_ACTIVE_COLOR_PROFILE_NAME {
//     pub ColorProfileName: [u16; 1],
// }

// UNSUPPORTED Rust 3062:1: declaration Impl has no candidate rule
// impl Default for SET_ACTIVE_COLOR_PROFILE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SET_DISPLAY_CONFIG_FLAGS` = UInt;
public const val `SGI_EXTRASPACE`: UInt = 0u;
// UNSUPPORTED Rust 3069:1: generic scalar type unsupported
// pub type SORTCOMP = Option<unsafe extern "system" fn(pv1: *const core::ffi::c_void, pv2: *const core::ffi::c_void) -> i32>;

public const val `SO_BREAK_EXTRA`: UInt = 4096u;
public const val `SO_CHARACTER_EXTRA`: UInt = 2048u;
public const val `SO_CHAR_INC_EQUAL_BM_BASE`: UInt = 32u;
public const val `SO_DO_NOT_SUBSTITUTE_DEVICE_FONT`: UInt = 128u;
public const val `SO_DXDY`: UInt = 1024u;
public const val `SO_ESC_NOT_ORIENT`: UInt = 512u;
public const val `SO_FLAG_DEFAULT_PLACEMENT`: UInt = 1u;
public const val `SO_GLYPHINDEX_TEXTOUT`: UInt = 256u;
public const val `SO_HORIZONTAL`: UInt = 2u;
public const val `SO_MAXEXT_EQUAL_BM_SIDE`: UInt = 64u;
public const val `SO_REVERSED`: UInt = 8u;
public const val `SO_VERTICAL`: UInt = 4u;
public const val `SO_ZERO_BEARINGS`: UInt = 16u;
public const val `SPS_ACCEPT_EXCLUDE`: UInt = 3u;
public const val `SPS_ACCEPT_NOEXCLUDE`: UInt = 2u;
public const val `SPS_ACCEPT_SYNCHRONOUS`: UInt = 4u;
public const val `SPS_ALPHA`: Int = 16;
public const val `SPS_ANIMATESTART`: Int = 4;
public const val `SPS_ANIMATEUPDATE`: Int = 8;
public const val `SPS_ASYNCCHANGE`: Int = 2;
public const val `SPS_CHANGE`: Int = 1;
public const val `SPS_DECLINE`: UInt = 1u;
public const val `SPS_ERROR`: UInt = 0u;
public const val `SPS_FLAGSMASK`: Int = 255;
public const val `SPS_FREQMASK`: Int = 1044480;
public const val `SPS_LENGTHMASK`: Int = 3840;
public const val `SPS_RESERVED`: Int = 32;
public const val `SPS_RESERVED1`: Int = 64;
public const val `SS_FREE`: UInt = 2u;
public const val `SS_RESTORE`: UInt = 1u;
public const val `SS_SAVE`: UInt = 0u;
// UNSUPPORTED Rust 3101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STROBJ {
//     pub cGlyphs: u32,
//     pub flAccel: u32,
//     pub ulCharInc: u32,
//     pub rclBkGround: super::super::Foundation::RECTL,
//     pub pgp: *mut GLYPHPOS,
//     pub pwszOrg: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3111:1: declaration Impl has no candidate rule
// impl Default for STROBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STYPE_BITMAP`: Int = 0;
public const val `STYPE_DEVBITMAP`: Int = 3;
// UNSUPPORTED Rust 3118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SURFOBJ {
//     pub dhsurf: DHSURF,
//     pub hsurf: HSURF,
//     pub dhpdev: DHPDEV,
//     pub hdev: HDEV,
//     pub sizlBitmap: super::super::Foundation::SIZE,
//     pub cjBits: u32,
//     pub pvBits: *mut core::ffi::c_void,
//     pub pvScan0: *mut core::ffi::c_void,
//     pub lDelta: i32,
//     pub iUniq: u32,
//     pub iBitmapFormat: u32,
//     pub iType: u16,
//     pub fjBitmap: u16,
// }

// UNSUPPORTED Rust 3135:1: declaration Impl has no candidate rule
// impl Default for SURFOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `S_INIT`: UInt = 2u;
// UNSUPPORTED Rust 3141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Sources {
//     pub sourceId: u32,
//     pub numTargets: i32,
//     pub aTargets: [u32; 1],
// }

// UNSUPPORTED Rust 3148:1: declaration Impl has no candidate rule
// impl Default for Sources {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TC_PATHOBJ`: UInt = 2u;
public const val `TC_RECTANGLES`: UInt = 0u;
public const val `TTO_METRICS_ONLY`: UInt = 1u;
public const val `TTO_QUBICS`: UInt = 2u;
public const val `TTO_UNHINTED`: UInt = 4u;
// UNSUPPORTED Rust 3158:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TYPE1_FONT {
//     pub hPFM: super::super::Foundation::HANDLE,
//     pub hPFB: super::super::Foundation::HANDLE,
//     pub ulIdentifier: u32,
// }

// UNSUPPORTED Rust 3165:1: declaration Impl has no candidate rule
// impl Default for TYPE1_FONT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3170:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VGA_CHAR {
//     pub Char: i8,
//     pub Attributes: i8,
// }

// UNSUPPORTED Rust 3176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEOPARAMETERS {
//     pub Guid: windows_sys::core::GUID,
//     pub dwOffset: u32,
//     pub dwCommand: u32,
//     pub dwFlags: u32,
//     pub dwMode: u32,
//     pub dwTVStandard: u32,
//     pub dwAvailableModes: u32,
//     pub dwAvailableTVStandard: u32,
//     pub dwFlickerFilter: u32,
//     pub dwOverScanX: u32,
//     pub dwOverScanY: u32,
//     pub dwMaxUnscaledX: u32,
//     pub dwMaxUnscaledY: u32,
//     pub dwPositionX: u32,
//     pub dwPositionY: u32,
//     pub dwBrightness: u32,
//     pub dwContrast: u32,
//     pub dwCPType: u32,
//     pub dwCPCommand: u32,
//     pub dwCPStandard: u32,
//     pub dwCPKey: u32,
//     pub bCP_APSTriggerBits: u32,
//     pub bOEMCopyProtection: [u8; 256],
// }

// UNSUPPORTED Rust 3203:1: declaration Impl has no candidate rule
// impl Default for VIDEOPARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_BANK_SELECT {
//     pub Length: u32,
//     pub Size: u32,
//     pub BankingFlags: u32,
//     pub BankingType: u32,
//     pub PlanarHCBankingType: u32,
//     pub BitmapWidthInBytes: u32,
//     pub BitmapSize: u32,
//     pub Granularity: u32,
//     pub PlanarHCGranularity: u32,
//     pub CodeOffset: u32,
//     pub PlanarHCBankCodeOffset: u32,
//     pub PlanarHCEnableCodeOffset: u32,
//     pub PlanarHCDisableCodeOffset: u32,
// }

public typealias `VIDEO_BANK_TYPE` = Int;
// UNSUPPORTED Rust 3226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_BRIGHTNESS_POLICY {
//     pub DefaultToBiosPolicy: bool,
//     pub LevelCount: u8,
//     pub Level: [VIDEO_BRIGHTNESS_POLICY_0; 1],
// }

// UNSUPPORTED Rust 3233:1: declaration Impl has no candidate rule
// impl Default for VIDEO_BRIGHTNESS_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_BRIGHTNESS_POLICY_0 {
//     pub BatteryLevel: u8,
//     pub Brightness: u8,
// }

// UNSUPPORTED Rust 3244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_CLUT {
//     pub NumEntries: u16,
//     pub FirstEntry: u16,
//     pub LookupTable: [VIDEO_CLUT_0; 1],
// }

// UNSUPPORTED Rust 3251:1: declaration Impl has no candidate rule
// impl Default for VIDEO_CLUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3256:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIDEO_CLUT_0 {
//     pub RgbArray: VIDEO_CLUTDATA,
//     pub RgbLong: u32,
// }

// UNSUPPORTED Rust 3262:1: declaration Impl has no candidate rule
// impl Default for VIDEO_CLUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3267:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_CLUTDATA {
//     pub Red: u8,
//     pub Green: u8,
//     pub Blue: u8,
//     pub Unused: u8,
// }

// UNSUPPORTED Rust 3275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_COLOR_CAPABILITIES {
//     pub Length: u32,
//     pub AttributeFlags: u32,
//     pub RedPhosphoreDecay: i32,
//     pub GreenPhosphoreDecay: i32,
//     pub BluePhosphoreDecay: i32,
//     pub WhiteChromaticity_x: i32,
//     pub WhiteChromaticity_y: i32,
//     pub WhiteChromaticity_Y: i32,
//     pub RedChromaticity_x: i32,
//     pub RedChromaticity_y: i32,
//     pub GreenChromaticity_x: i32,
//     pub GreenChromaticity_y: i32,
//     pub BlueChromaticity_x: i32,
//     pub BlueChromaticity_y: i32,
//     pub WhiteGamma: i32,
//     pub RedGamma: i32,
//     pub GreenGamma: i32,
//     pub BlueGamma: i32,
// }

// UNSUPPORTED Rust 3297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_COLOR_LUT_DATA {
//     pub Length: u32,
//     pub LutDataFormat: u32,
//     pub LutData: [u8; 1],
// }

// UNSUPPORTED Rust 3304:1: declaration Impl has no candidate rule
// impl Default for VIDEO_COLOR_LUT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_COLOR_LUT_DATA_FORMAT_PRIVATEFORMAT`: UInt = 2147483648u;
public const val `VIDEO_COLOR_LUT_DATA_FORMAT_RGB256WORDS`: UInt = 1u;
// UNSUPPORTED Rust 3311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_CURSOR_ATTRIBUTES {
//     pub Width: u16,
//     pub Height: u16,
//     pub Column: i16,
//     pub Row: i16,
//     pub Rate: u8,
//     pub Enable: u8,
// }

// UNSUPPORTED Rust 3321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_CURSOR_POSITION {
//     pub Column: i16,
//     pub Row: i16,
// }

public const val `VIDEO_DEVICE_COLOR`: UInt = 1u;
// UNSUPPORTED Rust 3328:1: non-scalar type Ptr unsupported
// pub const VIDEO_DEVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("DISPLAY%d");

// UNSUPPORTED Rust 3329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_DEVICE_SESSION_STATUS {
//     pub bEnable: u32,
//     pub bSuccess: u32,
// }

public const val `VIDEO_DUALVIEW_PRIMARY`: UInt = 2147483648u;
public const val `VIDEO_DUALVIEW_REMOVABLE`: UInt = 1u;
public const val `VIDEO_DUALVIEW_SECONDARY`: UInt = 1073741824u;
public const val `VIDEO_DUALVIEW_WDDM_VGA`: UInt = 536870912u;
// UNSUPPORTED Rust 3339:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_HARDWARE_STATE {
//     pub StateHeader: *mut VIDEO_HARDWARE_STATE_HEADER,
//     pub StateLength: u32,
// }

// UNSUPPORTED Rust 3345:1: declaration Impl has no candidate rule
// impl Default for VIDEO_HARDWARE_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3350:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_HARDWARE_STATE_HEADER {
//     pub Length: u32,
//     pub PortValue: [u8; 48],
//     pub AttribIndexDataState: u32,
//     pub BasicSequencerOffset: u32,
//     pub BasicCrtContOffset: u32,
//     pub BasicGraphContOffset: u32,
//     pub BasicAttribContOffset: u32,
//     pub BasicDacOffset: u32,
//     pub BasicLatchesOffset: u32,
//     pub ExtendedSequencerOffset: u32,
//     pub ExtendedCrtContOffset: u32,
//     pub ExtendedGraphContOffset: u32,
//     pub ExtendedAttribContOffset: u32,
//     pub ExtendedDacOffset: u32,
//     pub ExtendedValidatorStateOffset: u32,
//     pub ExtendedMiscDataOffset: u32,
//     pub PlaneLength: u32,
//     pub Plane1Offset: u32,
//     pub Plane2Offset: u32,
//     pub Plane3Offset: u32,
//     pub Plane4Offset: u32,
//     pub VGAStateFlags: u32,
//     pub DIBOffset: u32,
//     pub DIBBitsPerPixel: u32,
//     pub DIBXResolution: u32,
//     pub DIBYResolution: u32,
//     pub DIBXlatOffset: u32,
//     pub DIBXlatLength: u32,
//     pub VesaInfoOffset: u32,
//     pub FrameBufferData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3384:1: declaration Impl has no candidate rule
// impl Default for VIDEO_HARDWARE_STATE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3389:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_LOAD_FONT_INFORMATION {
//     pub WidthInPixels: u16,
//     pub HeightInPixels: u16,
//     pub FontSize: u32,
//     pub Font: [u8; 1],
// }

// UNSUPPORTED Rust 3397:1: declaration Impl has no candidate rule
// impl Default for VIDEO_LOAD_FONT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_LUT_RGB256WORDS {
//     pub Red: [u16; 256],
//     pub Green: [u16; 256],
//     pub Blue: [u16; 256],
// }

// UNSUPPORTED Rust 3409:1: declaration Impl has no candidate rule
// impl Default for VIDEO_LUT_RGB256WORDS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_MAX_REASON`: UInt = 9u;
// UNSUPPORTED Rust 3415:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_MEMORY {
//     pub RequestedVirtualAddress: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3420:1: declaration Impl has no candidate rule
// impl Default for VIDEO_MEMORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_MEMORY_INFORMATION {
//     pub VideoRamBase: *mut core::ffi::c_void,
//     pub VideoRamLength: u32,
//     pub FrameBufferBase: *mut core::ffi::c_void,
//     pub FrameBufferLength: u32,
// }

// UNSUPPORTED Rust 3433:1: declaration Impl has no candidate rule
// impl Default for VIDEO_MEMORY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3438:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_MODE {
//     pub RequestedMode: u32,
// }

public const val `VIDEO_MODE_ANIMATE_START`: UInt = 8u;
public const val `VIDEO_MODE_ANIMATE_UPDATE`: UInt = 16u;
public const val `VIDEO_MODE_ASYNC_POINTER`: UInt = 1u;
public const val `VIDEO_MODE_BANKED`: UInt = 128u;
public const val `VIDEO_MODE_COLOR`: UInt = 1u;
public const val `VIDEO_MODE_COLOR_POINTER`: UInt = 4u;
public const val `VIDEO_MODE_GRAPHICS`: UInt = 2u;
// UNSUPPORTED Rust 3450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_MODE_INFORMATION {
//     pub Length: u32,
//     pub ModeIndex: u32,
//     pub VisScreenWidth: u32,
//     pub VisScreenHeight: u32,
//     pub ScreenStride: u32,
//     pub NumberOfPlanes: u32,
//     pub BitsPerPlane: u32,
//     pub Frequency: u32,
//     pub XMillimeter: u32,
//     pub YMillimeter: u32,
//     pub NumberRedBits: u32,
//     pub NumberGreenBits: u32,
//     pub NumberBlueBits: u32,
//     pub RedMask: u32,
//     pub GreenMask: u32,
//     pub BlueMask: u32,
//     pub AttributeFlags: u32,
//     pub VideoMemoryBitmapWidth: u32,
//     pub VideoMemoryBitmapHeight: u32,
//     pub DriverSpecificAttributeFlags: u32,
// }

public const val `VIDEO_MODE_INTERLACED`: UInt = 16u;
public const val `VIDEO_MODE_LINEAR`: UInt = 256u;
public const val `VIDEO_MODE_MANAGED_PALETTE`: UInt = 8u;
public const val `VIDEO_MODE_MAP_MEM_LINEAR`: UInt = 1073741824u;
public const val `VIDEO_MODE_MONO_POINTER`: UInt = 2u;
public const val `VIDEO_MODE_NO_64_BIT_ACCESS`: UInt = 64u;
public const val `VIDEO_MODE_NO_OFF_SCREEN`: UInt = 32u;
public const val `VIDEO_MODE_NO_ZERO_MEMORY`: UInt = 2147483648u;
public const val `VIDEO_MODE_PALETTE_DRIVEN`: UInt = 4u;
// UNSUPPORTED Rust 3483:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_MONITOR_DESCRIPTOR {
//     pub DescriptorSize: u32,
//     pub Descriptor: [u8; 1],
// }

// UNSUPPORTED Rust 3489:1: declaration Impl has no candidate rule
// impl Default for VIDEO_MONITOR_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_NUM_MODES {
//     pub NumModes: u32,
//     pub ModeInformationLength: u32,
// }

public const val `VIDEO_OPTIONAL_GAMMET_TABLE`: UInt = 2u;
// UNSUPPORTED Rust 3501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_PALETTE_DATA {
//     pub NumEntries: u16,
//     pub FirstEntry: u16,
//     pub Colors: [u16; 1],
// }

// UNSUPPORTED Rust 3508:1: declaration Impl has no candidate rule
// impl Default for VIDEO_PALETTE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3513:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_PERFORMANCE_COUNTER {
//     pub NbOfAllocationEvicted: [u64; 10],
//     pub NbOfAllocationMarked: [u64; 10],
//     pub NbOfAllocationRestored: [u64; 10],
//     pub KBytesEvicted: [u64; 10],
//     pub KBytesMarked: [u64; 10],
//     pub KBytesRestored: [u64; 10],
//     pub NbProcessCommited: u64,
//     pub NbAllocationCommited: u64,
//     pub NbAllocationMarked: u64,
//     pub KBytesAllocated: u64,
//     pub KBytesAvailable: u64,
//     pub KBytesCurMarked: u64,
//     pub Reference: u64,
//     pub Unreference: u64,
//     pub TrueReference: u64,
//     pub NbOfPageIn: u64,
//     pub KBytesPageIn: u64,
//     pub NbOfPageOut: u64,
//     pub KBytesPageOut: u64,
//     pub NbOfRotateOut: u64,
//     pub KBytesRotateOut: u64,
// }

// UNSUPPORTED Rust 3538:1: declaration Impl has no candidate rule
// impl Default for VIDEO_PERFORMANCE_COUNTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3543:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_POINTER_ATTRIBUTES {
//     pub Flags: u32,
//     pub Width: u32,
//     pub Height: u32,
//     pub WidthInBytes: u32,
//     pub Enable: u32,
//     pub Column: i16,
//     pub Row: i16,
//     pub Pixels: [u8; 1],
// }

// UNSUPPORTED Rust 3555:1: declaration Impl has no candidate rule
// impl Default for VIDEO_POINTER_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_POINTER_CAPABILITIES {
//     pub Flags: u32,
//     pub MaxWidth: u32,
//     pub MaxHeight: u32,
//     pub HWPtrBitmapStart: u32,
//     pub HWPtrBitmapEnd: u32,
// }

// UNSUPPORTED Rust 3569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_POINTER_POSITION {
//     pub Column: i16,
//     pub Row: i16,
// }

// UNSUPPORTED Rust 3575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_POWER_MANAGEMENT {
//     pub Length: u32,
//     pub DPMSVersion: u32,
//     pub PowerState: u32,
// }

public typealias `VIDEO_POWER_STATE` = Int;
// UNSUPPORTED Rust 3583:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_PUBLIC_ACCESS_RANGES {
//     pub InIoSpace: u32,
//     pub MappedInIoSpace: u32,
//     pub VirtualAddress: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3590:1: declaration Impl has no candidate rule
// impl Default for VIDEO_PUBLIC_ACCESS_RANGES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3595:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_QUERY_PERFORMANCE_COUNTER {
//     pub BufferSize: u32,
//     pub Buffer: *mut VIDEO_PERFORMANCE_COUNTER,
// }

// UNSUPPORTED Rust 3601:1: declaration Impl has no candidate rule
// impl Default for VIDEO_QUERY_PERFORMANCE_COUNTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_REASON_ALLOCATION`: UInt = 6u;
public const val `VIDEO_REASON_CONFIGURATION`: UInt = 9u;
public const val `VIDEO_REASON_FAILED_ROTATION`: UInt = 5u;
public const val `VIDEO_REASON_LOCK`: UInt = 5u;
public const val `VIDEO_REASON_NONE`: UInt = 0u;
public const val `VIDEO_REASON_POLICY1`: UInt = 1u;
public const val `VIDEO_REASON_POLICY2`: UInt = 2u;
public const val `VIDEO_REASON_POLICY3`: UInt = 3u;
public const val `VIDEO_REASON_POLICY4`: UInt = 4u;
public const val `VIDEO_REASON_SCRATCH`: UInt = 8u;
// UNSUPPORTED Rust 3616:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIDEO_REGISTER_VDM {
//     pub MinimumStateSize: u32,
// }

// UNSUPPORTED Rust 3621:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_SHARE_MEMORY {
//     pub ProcessHandle: super::super::Foundation::HANDLE,
//     pub ViewOffset: u32,
//     pub ViewSize: u32,
//     pub RequestedVirtualAddress: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3629:1: declaration Impl has no candidate rule
// impl Default for VIDEO_SHARE_MEMORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3634:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_SHARE_MEMORY_INFORMATION {
//     pub SharedViewOffset: u32,
//     pub SharedViewSize: u32,
//     pub VirtualAddress: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3641:1: declaration Impl has no candidate rule
// impl Default for VIDEO_SHARE_MEMORY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VIDEO_STATE_NON_STANDARD_VGA`: UInt = 1u;
public const val `VIDEO_STATE_PACKED_CHAIN4_MODE`: UInt = 4u;
public const val `VIDEO_STATE_UNEMULATED_VGA_STATE`: UInt = 2u;
// UNSUPPORTED Rust 3649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_VDM {
//     pub ProcessHandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 3654:1: declaration Impl has no candidate rule
// impl Default for VIDEO_VDM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_WIN32K_CALLBACKS {
//     pub PhysDisp: *mut core::ffi::c_void,
//     pub Callout: PVIDEO_WIN32K_CALLOUT,
//     pub bACPI: u32,
//     pub pPhysDeviceObject: super::super::Foundation::HANDLE,
//     pub DualviewFlags: u32,
// }

// UNSUPPORTED Rust 3668:1: declaration Impl has no candidate rule
// impl Default for VIDEO_WIN32K_CALLBACKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIDEO_WIN32K_CALLBACKS_PARAMS {
//     pub CalloutType: VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE,
//     pub PhysDisp: *mut core::ffi::c_void,
//     pub Param: usize,
//     pub Status: i32,
//     pub LockUserSession: bool,
//     pub IsPostDevice: bool,
//     pub SurpriseRemoval: bool,
//     pub WaitForQueueReady: bool,
// }

// UNSUPPORTED Rust 3685:1: declaration Impl has no candidate rule
// impl Default for VIDEO_WIN32K_CALLBACKS_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = Int;
public const val `VideoBanked1R1W`: `VIDEO_BANK_TYPE` = 2;
public const val `VideoBanked1RW`: `VIDEO_BANK_TYPE` = 1;
public const val `VideoBanked2RW`: `VIDEO_BANK_TYPE` = 3;
public const val `VideoBlackScreenDiagnostics`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 16;
public const val `VideoDesktopDuplicationChange`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 15;
public const val `VideoDisableMultiPlaneOverlay`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 14;
public const val `VideoDxgkDisplaySwitchCallout`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 8;
public const val `VideoDxgkFindAdapterTdrCallout`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 10;
public const val `VideoDxgkHardwareProtectionTeardown`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 11;
public const val `VideoEnumChildPdoNotifyCallout`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 3;
public const val `VideoFindAdapterCallout`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 4;
public const val `VideoNotBanked`: `VIDEO_BANK_TYPE` = 0;
public const val `VideoPnpNotifyCallout`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 7;
public const val `VideoPowerHibernate`: `VIDEO_POWER_STATE` = 5;
public const val `VideoPowerMaximum`: `VIDEO_POWER_STATE` = 7;
public const val `VideoPowerNotifyCallout`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 1;
public const val `VideoPowerOff`: `VIDEO_POWER_STATE` = 4;
public const val `VideoPowerOn`: `VIDEO_POWER_STATE` = 1;
public const val `VideoPowerShutdown`: `VIDEO_POWER_STATE` = 6;
public const val `VideoPowerStandBy`: `VIDEO_POWER_STATE` = 2;
public const val `VideoPowerSuspend`: `VIDEO_POWER_STATE` = 3;
public const val `VideoPowerUnspecified`: `VIDEO_POWER_STATE` = 0;
public const val `VideoRepaintDesktop`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 12;
public const val `VideoUpdateCursor`: `VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE` = 13;
// UNSUPPORTED Rust 3715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WCRUN {
//     pub wcLow: u16,
//     pub cGlyphs: u16,
//     pub phg: *mut u32,
// }

// UNSUPPORTED Rust 3722:1: declaration Impl has no candidate rule
// impl Default for WCRUN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINDDI_MAXSETPALETTECOLORINDEX`: UInt = 255u;
public const val `WINDDI_MAXSETPALETTECOLORS`: UInt = 256u;
public const val `WINDDI_MAX_BROADCAST_CONTEXT`: UInt = 64u;
// UNSUPPORTED Rust 3730:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNDOBJ {
//     pub coClient: CLIPOBJ,
//     pub pvConsumer: *mut core::ffi::c_void,
//     pub rclClient: super::super::Foundation::RECTL,
//     pub psoOwner: *mut SURFOBJ,
// }

// UNSUPPORTED Rust 3738:1: declaration Impl has no candidate rule
// impl Default for WNDOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3743:1: generic scalar type unsupported
// pub type WNDOBJCHANGEPROC = Option<unsafe extern "system" fn(pwo: *mut WNDOBJ, fl: u32)>;

public const val `WNDOBJ_SETUP`: UInt = 4354u;
public const val `WOC_CHANGED`: UInt = 16u;
public const val `WOC_DELETE`: UInt = 32u;
public const val `WOC_DRAWN`: UInt = 64u;
public const val `WOC_RGN_CLIENT`: UInt = 2u;
public const val `WOC_RGN_CLIENT_DELTA`: UInt = 1u;
public const val `WOC_RGN_SPRITE`: UInt = 512u;
public const val `WOC_RGN_SURFACE`: UInt = 8u;
public const val `WOC_RGN_SURFACE_DELTA`: UInt = 4u;
public const val `WOC_SPRITE_NO_OVERLAP`: UInt = 256u;
public const val `WOC_SPRITE_OVERLAP`: UInt = 128u;
public const val `WO_DRAW_NOTIFY`: UInt = 64u;
public const val `WO_RGN_CLIENT`: UInt = 2u;
public const val `WO_RGN_CLIENT_DELTA`: UInt = 1u;
public const val `WO_RGN_DESKTOP_COORD`: UInt = 256u;
public const val `WO_RGN_SPRITE`: UInt = 512u;
public const val `WO_RGN_SURFACE`: UInt = 8u;
public const val `WO_RGN_SURFACE_DELTA`: UInt = 4u;
public const val `WO_RGN_UPDATE_ALL`: UInt = 16u;
public const val `WO_RGN_WINDOW`: UInt = 32u;
public const val `WO_SPRITE_NOTIFY`: UInt = 128u;
// UNSUPPORTED Rust 3765:1: non-scalar type Ptr unsupported
// pub const WVIDEO_DEVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DISPLAY%d");

// UNSUPPORTED Rust 3766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct XFORML {
//     pub eM11: u32,
//     pub eM12: u32,
//     pub eM21: u32,
//     pub eM22: u32,
//     pub eDx: u32,
//     pub eDy: u32,
// }

// UNSUPPORTED Rust 3777:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct XFORML {
//     pub eM11: f32,
//     pub eM12: f32,
//     pub eM21: f32,
//     pub eM22: f32,
//     pub eDx: f32,
//     pub eDy: f32,
// }

// UNSUPPORTED Rust 3788:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XFORMOBJ {
//     pub ulReserved: u32,
// }

public const val `XF_INV_FXTOL`: Int = 3;
public const val `XF_INV_LTOL`: Int = 1;
public const val `XF_LTOFX`: Int = 2;
public const val `XF_LTOL`: Int = 0;
// UNSUPPORTED Rust 3797:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct XLATEOBJ {
//     pub iUniq: u32,
//     pub flXlate: u32,
//     pub iSrcType: u16,
//     pub iDstType: u16,
//     pub cEntries: u32,
//     pub pulXlate: *mut u32,
// }

// UNSUPPORTED Rust 3807:1: declaration Impl has no candidate rule
// impl Default for XLATEOBJ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `XO_DESTBITFIELDS`: UInt = 5u;
public const val `XO_DESTDCPALETTE`: UInt = 3u;
public const val `XO_DESTPALETTE`: UInt = 2u;
public const val `XO_DEVICE_ICM`: UInt = 16u;
public const val `XO_FROM_CMYK`: UInt = 8u;
public const val `XO_HOST_ICM`: UInt = 32u;
public const val `XO_SRCBITFIELDS`: UInt = 4u;
public const val `XO_SRCPALETTE`: UInt = 1u;
public const val `XO_TABLE`: UInt = 2u;
public const val `XO_TO_MONO`: UInt = 4u;
public const val `XO_TRIVIAL`: UInt = 1u;
